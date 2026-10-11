.class public Lax/h5/f;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Lj$/io/InputStreamRetargetInterface;
.implements Ljava/lang/AutoCloseable;


# static fields
.field private static final d0:Ljava/lang/String; = "f"


# instance fields
.field private c0:J

.field private q:Lax/h5/e;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>(Lax/h5/e;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lax/h5/f;->c0:J

    .line 7
    .line 8
    invoke-interface {p1}, Lax/h5/e;->isDirectory()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_10

    .line 13
    .line 14
    iput-object p1, p0, Lax/h5/f;->q:Lax/h5/e;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string v0, "UsbFileInputStream cannot be created on directory!"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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
.method public available()I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/h5/f;->d0:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "available"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0
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
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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

.method public read()I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lax/h5/f;->c0:J

    iget-object v2, p0, Lax/h5/f;->q:Lax/h5/e;

    invoke-interface {v2}, Lax/h5/e;->getLength()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_e

    const/4 v0, -0x1

    return v0

    :cond_e
    const/16 v0, 0x200

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 4
    iget-object v1, p0, Lax/h5/f;->q:Lax/h5/e;

    iget-wide v2, p0, Lax/h5/f;->c0:J

    invoke-interface {v1, v2, v3, v0}, Lax/h5/e;->i(JLjava/nio/ByteBuffer;)V

    .line 5
    iget-wide v1, p0, Lax/h5/f;->c0:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lax/h5/f;->c0:J

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 7
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    return v0
.end method

.method public read([B)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    iget-wide v0, p0, Lax/h5/f;->c0:J

    iget-object v2, p0, Lax/h5/f;->q:Lax/h5/e;

    invoke-interface {v2}, Lax/h5/e;->getLength()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_e

    const/4 p1, -0x1

    return p1

    .line 9
    :cond_e
    iget-object v0, p0, Lax/h5/f;->q:Lax/h5/e;

    invoke-interface {v0}, Lax/h5/e;->getLength()J

    move-result-wide v0

    .line 10
    array-length v2, p1

    int-to-long v2, v2

    iget-wide v4, p0, Lax/h5/f;->c0:J

    sub-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 11
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    long-to-int v2, v0

    .line 12
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 13
    iget-object v3, p0, Lax/h5/f;->q:Lax/h5/e;

    iget-wide v4, p0, Lax/h5/f;->c0:J

    invoke-interface {v3, v4, v5, p1}, Lax/h5/e;->i(JLjava/nio/ByteBuffer;)V

    .line 14
    iget-wide v3, p0, Lax/h5/f;->c0:J

    add-long/2addr v3, v0

    iput-wide v3, p0, Lax/h5/f;->c0:J

    return v2
.end method

.method public read([BII)I
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    iget-wide v0, p0, Lax/h5/f;->c0:J

    iget-object v2, p0, Lax/h5/f;->q:Lax/h5/e;

    invoke-interface {v2}, Lax/h5/e;->getLength()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_e

    const/4 p1, -0x1

    return p1

    .line 16
    :cond_e
    iget-object v0, p0, Lax/h5/f;->q:Lax/h5/e;

    invoke-interface {v0}, Lax/h5/e;->getLength()J

    move-result-wide v0

    int-to-long v2, p3

    .line 17
    iget-wide v4, p0, Lax/h5/f;->c0:J

    sub-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 18
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 19
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    long-to-int p3, v0

    add-int/2addr p2, p3

    .line 20
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 21
    iget-object p2, p0, Lax/h5/f;->q:Lax/h5/e;

    iget-wide v2, p0, Lax/h5/f;->c0:J

    invoke-interface {p2, v2, v3, p1}, Lax/h5/e;->i(JLjava/nio/ByteBuffer;)V

    .line 22
    iget-wide p1, p0, Lax/h5/f;->c0:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lax/h5/f;->c0:J

    return p3
.end method

.method public skip(J)J
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/h5/f;->q:Lax/h5/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/h5/e;->getLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Lax/h5/f;->c0:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iget-wide v0, p0, Lax/h5/f;->c0:J

    .line 15
    .line 16
    add-long/2addr v0, p1

    .line 17
    iput-wide v0, p0, Lax/h5/f;->c0:J

    .line 18
    .line 19
    return-wide p1
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
