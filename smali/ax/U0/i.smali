.class public final Lax/U0/i;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Lj$/io/InputStreamRetargetInterface;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field private final c0:Lax/U0/k;

.field private final d0:[B

.field private e0:Z

.field private f0:Z

.field private g0:J

.field private final q:Lax/U0/g;


# direct methods
.method public constructor <init>(Lax/U0/g;Lax/U0/k;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/U0/i;->e0:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lax/U0/i;->f0:Z

    .line 8
    .line 9
    iput-object p1, p0, Lax/U0/i;->q:Lax/U0/g;

    .line 10
    .line 11
    iput-object p2, p0, Lax/U0/i;->c0:Lax/U0/k;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, Lax/U0/i;->d0:[B

    .line 17
    .line 18
    return-void
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

.method private a()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/U0/i;->e0:Z

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    iget-object v0, p0, Lax/U0/i;->q:Lax/U0/g;

    .line 6
    .line 7
    iget-object v1, p0, Lax/U0/i;->c0:Lax/U0/k;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lax/U0/g;->f(Lax/U0/k;)J

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lax/U0/i;->e0:Z

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public b()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/U0/i;->a()V

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
.end method

.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/U0/i;->f0:Z

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lax/U0/i;->q:Lax/U0/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lax/U0/g;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/U0/i;->f0:Z

    .line 12
    .line 13
    :cond_c
    return-void
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
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U0/i;->d0:[B

    invoke-virtual {p0, v0}, Lax/U0/i;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_a

    return v1

    .line 2
    :cond_a
    iget-object v0, p0, Lax/U0/i;->d0:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([B)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lax/U0/i;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-boolean v0, p0, Lax/U0/i;->f0:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 5
    invoke-direct {p0}, Lax/U0/i;->a()V

    .line 6
    iget-object v0, p0, Lax/U0/i;->q:Lax/U0/g;

    invoke-interface {v0, p1, p2, p3}, Lax/P0/k;->c([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_14

    return p2

    .line 7
    :cond_14
    iget-wide p2, p0, Lax/U0/i;->g0:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lax/U0/i;->g0:J

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lj$/io/DesugarInputStream;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
