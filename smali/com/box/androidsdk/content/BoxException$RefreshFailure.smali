.class public Lcom/box/androidsdk/content/BoxException$RefreshFailure;
.super Lcom/box/androidsdk/content/BoxException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/BoxException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RefreshFailure"
.end annotation


# static fields
.field private static final q:[Lcom/box/androidsdk/content/BoxException$ErrorType;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v0, v0, [Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 4
    .line 5
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->c0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->q:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->e0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->j0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    aput-object v1, v0, v2

    .line 24
    .line 25
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->l0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    aput-object v1, v0, v2

    .line 29
    .line 30
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->m0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->g0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    aput-object v1, v0, v2

    .line 39
    .line 40
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->n0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 41
    .line 42
    const/4 v2, 0x7

    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->o0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 46
    .line 47
    const/16 v2, 0x8

    .line 48
    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->s0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    aput-object v1, v0, v2

    .line 56
    .line 57
    sget-object v1, Lcom/box/androidsdk/content/BoxException$ErrorType;->d0:Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 58
    .line 59
    const/16 v2, 0xa

    .line 60
    .line 61
    aput-object v1, v0, v2

    .line 62
    .line 63
    sput-object v0, Lcom/box/androidsdk/content/BoxException$RefreshFailure;->q:[Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>(Lcom/box/androidsdk/content/BoxException;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/box/androidsdk/content/BoxException;->a(Lcom/box/androidsdk/content/BoxException;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lcom/box/androidsdk/content/BoxException;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0, v0, v1, v2, p1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public g()Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/BoxException;->c()Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/box/androidsdk/content/BoxException$RefreshFailure;->q:[Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_9
    if-ge v4, v2, :cond_14

    .line 11
    .line 12
    aget-object v5, v1, v4

    .line 13
    .line 14
    if-ne v0, v5, :cond_11

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_11
    add-int/lit8 v4, v4, 0x1

    .line 19
    .line 20
    goto :goto_9

    .line 21
    :cond_14
    return v3
.end method
