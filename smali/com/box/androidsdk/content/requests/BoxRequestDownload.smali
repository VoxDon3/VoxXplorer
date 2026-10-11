.class public abstract Lcom/box/androidsdk/content/requests/BoxRequestDownload;
.super Lcom/box/androidsdk/content/requests/BoxRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Lcom/box/androidsdk/content/models/BoxObject;",
        "R:",
        "Lcom/box/androidsdk/content/requests/BoxRequest<",
        "TE;TR;>;>",
        "Lcom/box/androidsdk/content/requests/BoxRequest<",
        "TE;TR;>;"
    }
.end annotation


# instance fields
.field protected mDownloadStartListener:Lax/F3/a;

.field protected mFileOutputStream:Ljava/io/OutputStream;

.field protected mId:Ljava/lang/String;

.field protected mRangeEnd:J

.field protected mRangeStart:J

.field private mSha1:Ljava/lang/String;

.field protected mTarget:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/io/File;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ")V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p2, p4, p5}, Lcom/box/androidsdk/content/requests/BoxRequest;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    const-wide/16 v0, -0x1

    .line 12
    iput-wide v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeStart:J

    .line 13
    iput-wide v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeEnd:J

    .line 14
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mId:Ljava/lang/String;

    .line 15
    sget-object p1, Lcom/box/androidsdk/content/requests/BoxRequest$Methods;->q:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestMethod:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    .line 16
    iput-object p4, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestUrlString:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mTarget:Ljava/io/File;

    .line 18
    new-instance p1, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;

    invoke-direct {p1, p0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;-><init>(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)V

    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->C(Lcom/box/androidsdk/content/requests/BoxRequest$a;)Lcom/box/androidsdk/content/requests/BoxRequest;

    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequiresSocket:Z

    .line 20
    iget-object p2, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    const-string p3, "log_content_access"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/io/OutputStream;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TE;>;",
            "Ljava/io/OutputStream;",
            "Ljava/lang/String;",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p4, p5}, Lcom/box/androidsdk/content/requests/BoxRequest;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxSession;)V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeStart:J

    .line 3
    iput-wide v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeEnd:J

    .line 4
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mId:Ljava/lang/String;

    .line 5
    sget-object p1, Lcom/box/androidsdk/content/requests/BoxRequest$Methods;->q:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestMethod:Lcom/box/androidsdk/content/requests/BoxRequest$Methods;

    .line 6
    iput-object p4, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequestUrlString:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mFileOutputStream:Ljava/io/OutputStream;

    .line 8
    new-instance p1, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;

    invoke-direct {p1, p0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;-><init>(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)V

    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->C(Lcom/box/androidsdk/content/requests/BoxRequest$a;)Lcom/box/androidsdk/content/requests/BoxRequest;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mRequiresSocket:Z

    .line 10
    iget-object p2, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->mQueryMap:Ljava/util/HashMap;

    const-string p3, "log_content_access"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic E(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mSha1:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method private readObject(Ljava/io/ObjectInputStream;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;-><init>(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/box/androidsdk/content/requests/BoxRequest;->c0:Lcom/box/androidsdk/content/requests/BoxRequest$a;

    .line 10
    .line 11
    return-void
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

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method protected B(Lcom/box/androidsdk/content/requests/a;)V
    .registers 9

    .line 1
    invoke-super {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest;->B(Lcom/box/androidsdk/content/requests/a;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeStart:J

    .line 5
    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_2f

    .line 11
    .line 12
    iget-wide v4, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeEnd:J

    .line 13
    .line 14
    cmp-long v6, v4, v2

    .line 15
    .line 16
    if-eqz v6, :cond_2f

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-wide v1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeEnd:J

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x2

    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aput-object v1, v2, v0

    .line 36
    .line 37
    const-string v0, "bytes=%s-%s"

    .line 38
    .line 39
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "Range"

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Lcom/box/androidsdk/content/requests/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/box/androidsdk/content/requests/a;

    .line 46
    .line 47
    .line 48
    :cond_2f
    return-void
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
.end method

.method public F()Ljava/io/File;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mTarget:Ljava/io/File;

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

.method public G()Ljava/io/OutputStream;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mFileOutputStream:Ljava/io/OutputStream;

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

.method public H(JJ)Lcom/box/androidsdk/content/requests/BoxRequest;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)TR;"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeStart:J

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mRangeEnd:J

    .line 4
    .line 5
    return-object p0
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected r(Lcom/box/androidsdk/content/requests/b;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/requests/BoxRequest;->s()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/box/androidsdk/content/requests/b;->f()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p1, v1, v2

    .line 19
    .line 20
    const-string p1, "Response (%s)"

    .line 21
    .line 22
    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "BoxContentSdk"

    .line 27
    .line 28
    invoke-static {v0, p1}, Lax/H3/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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
.end method
