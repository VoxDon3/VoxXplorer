.class public Lcom/voxdon/xplorer/file/N$b;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Lj$/io/InputStreamRetargetInterface;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private c0:J

.field private d0:J

.field private q:Lax/pb/h0;


# direct methods
.method public constructor <init>(Lax/pb/h0;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lax/pb/h0;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/voxdon/xplorer/file/N$b;->c0:J

    .line 11
    .line 12
    return-void
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

.method public static a(Ljava/lang/String;Lax/pb/r;)Lcom/voxdon/xplorer/file/N$b;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/pb/b0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lax/pb/b0;-><init>(Ljava/lang/String;Lax/pb/r;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lax/pb/b0;->s()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_19

    .line 12
    .line 13
    new-instance p0, Lax/pb/h0;

    .line 14
    .line 15
    const-string p1, "r"

    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lax/pb/h0;-><init>(Lax/pb/b0;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lcom/voxdon/xplorer/file/N$b;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/file/N$b;-><init>(Lax/pb/h0;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_19
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 27
    .line 28
    const-string p1, "SmbFile does not exist"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private c(Lax/pb/a0;)Ljava/io/IOException;
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/pb/a0;->d()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lax/rb/d;

    .line 6
    .line 7
    if-eqz v1, :cond_f

    .line 8
    .line 9
    move-object p1, v0

    .line 10
    check-cast p1, Lax/rb/d;

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/rb/d;->a()Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_f
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 17
    .line 18
    if-eqz v1, :cond_1f

    .line 19
    .line 20
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p1, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-object p1
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


# virtual methods
.method public b()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/pb/h0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public close()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/pb/h0;->a()V
    :try_end_5
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
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
.end method

.method public read()I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/N$b;->c0:J

    iget-wide v2, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_d

    const/4 v0, -0x1

    return v0

    .line 2
    :cond_d
    :try_start_d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    invoke-virtual {v0}, Lax/pb/h0;->d()I

    move-result v0

    .line 3
    iget-wide v1, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J
    :try_end_19
    .catch Lax/pb/a0; {:try_start_d .. :try_end_19} :catch_1a

    return v0

    :catch_1a
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/N$b;->c(Lax/pb/a0;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public read([B)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/voxdon/xplorer/file/N$b;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    :try_start_0
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/N$b;->c0:J

    iget-wide v2, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_d

    const/4 p1, -0x1

    return p1

    .line 8
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    invoke-virtual {v0, p1, p2, p3}, Lax/pb/h0;->e([BII)I

    move-result p1

    .line 9
    iget-wide p2, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J
    :try_end_19
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_19} :catch_1a

    return p1

    :catch_1a
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/N$b;->c(Lax/pb/a0;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public skip(J)J
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N$b;->q:Lax/pb/h0;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    .line 4
    .line 5
    add-long/2addr v1, p1

    .line 6
    invoke-virtual {v0, v1, v2}, Lax/pb/h0;->f(J)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    .line 10
    .line 11
    add-long/2addr v0, p1

    .line 12
    iput-wide v0, p0, Lcom/voxdon/xplorer/file/N$b;->d0:J

    .line 13
    .line 14
    return-wide p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lj$/io/DesugarInputStream;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
