.class public Lcom/box/androidsdk/content/BoxException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/BoxException$ErrorType;,
        Lcom/box/androidsdk/content/BoxException$CorruptedContentException;,
        Lcom/box/androidsdk/content/BoxException$DownloadSSLException;,
        Lcom/box/androidsdk/content/BoxException$RefreshFailure;,
        Lcom/box/androidsdk/content/BoxException$RateLimitAttemptsExceeded;,
        Lcom/box/androidsdk/content/BoxException$MaxAttemptsExceeded;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private boxHttpResponse:Lcom/box/androidsdk/content/requests/b;

.field private response:Ljava/lang/String;

.field private final responseCode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/box/androidsdk/content/BoxException;->boxHttpResponse:Lcom/box/androidsdk/content/requests/b;

    .line 4
    iput-object p1, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    .registers 5

    .line 14
    invoke-static {p4}, Lcom/box/androidsdk/content/BoxException;->f(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p4

    invoke-direct {p0, p1, p4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    iput p2, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    .line 16
    iput-object p3, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/box/androidsdk/content/requests/b;)V
    .registers 4

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iput-object p2, p0, Lcom/box/androidsdk/content/BoxException;->boxHttpResponse:Lcom/box/androidsdk/content/requests/b;

    if-eqz p2, :cond_f

    .line 7
    invoke-virtual {p2}, Lcom/box/androidsdk/content/requests/b;->f()I

    move-result p1

    iput p1, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    goto :goto_12

    :cond_f
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    .line 9
    :goto_12
    :try_start_12
    invoke-virtual {p2}, Lcom/box/androidsdk/content/requests/b;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_18} :catch_19

    return-void

    .line 10
    :catch_19
    iput-object v0, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 3

    .line 11
    invoke-static {p2}, Lcom/box/androidsdk/content/BoxException;->f(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/box/androidsdk/content/BoxException;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static f(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .registers 2

    .line 1
    instance-of v0, p0, Lcom/box/androidsdk/content/BoxException;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_8
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public b()Lcom/box/androidsdk/content/models/BoxError;
    .registers 3

    .line 1
    :try_start_0
    new-instance v0, Lcom/box/androidsdk/content/models/BoxError;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/box/androidsdk/content/models/BoxError;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/box/androidsdk/content/BoxException;->d()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/box/androidsdk/content/models/BoxJsonObject;->k(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_c} :catch_d

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_d
    const/4 v0, 0x0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()Lcom/box/androidsdk/content/BoxException$ErrorType;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/net/UnknownHostException;

    .line 6
    .line 7
    if-nez v0, :cond_2d

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Ljava/net/ConnectException;

    .line 14
    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_2d

    .line 18
    :cond_11
    instance-of v0, p0, Lcom/box/androidsdk/content/BoxException$CorruptedContentException;

    .line 19
    .line 20
    if-eqz v0, :cond_18

    .line 21
    .line 22
    sget-object v0, Lcom/box/androidsdk/content/BoxException$ErrorType;->v0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_18
    invoke-virtual {p0}, Lcom/box/androidsdk/content/BoxException;->b()Lcom/box/androidsdk/content/models/BoxError;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_23

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxError;->D()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_24

    .line 36
    :cond_23
    const/4 v0, 0x0

    .line 37
    :goto_24
    invoke-virtual {p0}, Lcom/box/androidsdk/content/BoxException;->e()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v0, v1}, Lcom/box/androidsdk/content/BoxException$ErrorType;->h(Ljava/lang/String;I)Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_2d
    :goto_2d
    sget-object v0, Lcom/box/androidsdk/content/BoxException$ErrorType;->p0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 47
    .line 48
    return-object v0
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public d()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/BoxException;->response:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e()I
    .registers 2

    .line 1
    iget v0, p0, Lcom/box/androidsdk/content/BoxException;->responseCode:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
