.class public Lax/d5/a;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Lj$/io/InputStreamRetargetInterface;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field volatile c0:Z

.field d0:Z

.field e0:Ljava/lang/Thread;

.field f0:Ljava/lang/Thread;

.field protected g0:[B

.field protected h0:I

.field protected i0:I

.field q:Z


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

.method public constructor <init>()V
    .registers 3

    .line 10
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lax/d5/a;->q:Z

    .line 12
    iput-boolean v0, p0, Lax/d5/a;->c0:Z

    .line 13
    iput-boolean v0, p0, Lax/d5/a;->d0:Z

    const/4 v1, -0x1

    .line 14
    iput v1, p0, Lax/d5/a;->h0:I

    .line 15
    iput v0, p0, Lax/d5/a;->i0:I

    const/16 v0, 0x400

    .line 16
    invoke-direct {p0, v0}, Lax/d5/a;->d(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 4

    .line 17
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lax/d5/a;->q:Z

    .line 19
    iput-boolean v0, p0, Lax/d5/a;->c0:Z

    .line 20
    iput-boolean v0, p0, Lax/d5/a;->d0:Z

    const/4 v1, -0x1

    .line 21
    iput v1, p0, Lax/d5/a;->h0:I

    .line 22
    iput v0, p0, Lax/d5/a;->i0:I

    .line 23
    invoke-direct {p0, p1}, Lax/d5/a;->d(I)V

    return-void
.end method

.method public constructor <init>(Lax/d5/b;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x400

    .line 1
    invoke-direct {p0, p1, v0}, Lax/d5/a;-><init>(Lax/d5/b;I)V

    return-void
.end method

.method public constructor <init>(Lax/d5/b;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lax/d5/a;->q:Z

    .line 4
    iput-boolean v0, p0, Lax/d5/a;->c0:Z

    .line 5
    iput-boolean v0, p0, Lax/d5/a;->d0:Z

    const/4 v1, -0x1

    .line 6
    iput v1, p0, Lax/d5/a;->h0:I

    .line 7
    iput v0, p0, Lax/d5/a;->i0:I

    .line 8
    invoke-direct {p0, p2}, Lax/d5/a;->d(I)V

    .line 9
    invoke-virtual {p0, p1}, Lax/d5/a;->c(Lax/d5/b;)V

    return-void
.end method

.method private a()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    iget v0, p0, Lax/d5/a;->h0:I

    .line 2
    .line 3
    iget v1, p0, Lax/d5/a;->i0:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_16

    .line 6
    .line 7
    invoke-direct {p0}, Lax/d5/a;->b()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 11
    .line 12
    .line 13
    const-wide/16 v0, 0x3e8

    .line 14
    .line 15
    :try_start_e
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_11} :catch_12

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_12
    invoke-static {}, Lax/d5/a;->j()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_16
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private b()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/d5/a;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_28

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/d5/a;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_20

    .line 8
    .line 9
    iget-boolean v0, p0, Lax/d5/a;->c0:Z

    .line 10
    .line 11
    if-nez v0, :cond_20

    .line 12
    .line 13
    iget-object v0, p0, Lax/d5/a;->e0:Ljava/lang/Thread;

    .line 14
    .line 15
    if-eqz v0, :cond_1f

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_17

    .line 22
    .line 23
    goto :goto_1f

    .line 24
    :cond_17
    new-instance v0, Ljava/io/IOException;

    .line 25
    .line 26
    const-string v1, "Read end dead"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1f
    :goto_1f
    return-void

    .line 33
    :cond_20
    new-instance v0, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v1, "Pipe closed"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_28
    new-instance v0, Ljava/io/IOException;

    .line 42
    .line 43
    const-string v1, "Pipe not connected"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
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

.method private d(I)V
    .registers 3

    .line 1
    if-lez p1, :cond_7

    .line 2
    .line 3
    new-array p1, p1, [B

    .line 4
    .line 5
    iput-object p1, p0, Lax/d5/a;->g0:[B

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "Pipe Size <= 0"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static j()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InterruptedIOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public declared-synchronized available()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget v0, p0, Lax/d5/a;->h0:I
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_11

    .line 3
    .line 4
    if-gez v0, :cond_8

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    :try_start_8
    iget v1, p0, Lax/d5/a;->i0:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_13

    .line 12
    .line 13
    iget-object v0, p0, Lax/d5/a;->g0:[B

    .line 14
    .line 15
    array-length v0, v0
    :try_end_f
    .catchall {:try_start_8 .. :try_end_f} :catchall_11

    .line 16
    monitor-exit p0

    .line 17
    return v0

    .line 18
    :catchall_11
    move-exception v0

    .line 19
    goto :goto_1f

    .line 20
    :cond_13
    if-le v0, v1, :cond_18

    .line 21
    .line 22
    sub-int/2addr v0, v1

    .line 23
    monitor-exit p0

    .line 24
    return v0

    .line 25
    :cond_18
    :try_start_18
    iget-object v2, p0, Lax/d5/a;->g0:[B

    .line 26
    .line 27
    array-length v2, v2
    :try_end_1b
    .catchall {:try_start_18 .. :try_end_1b} :catchall_11

    .line 28
    add-int/2addr v0, v2

    .line 29
    sub-int/2addr v0, v1

    .line 30
    monitor-exit p0

    .line 31
    return v0

    .line 32
    :goto_1f
    :try_start_1f
    monitor-exit p0
    :try_end_20
    .catchall {:try_start_1f .. :try_end_20} :catchall_11

    .line 33
    throw v0
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public c(Lax/d5/b;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Lax/d5/b;->a(Lax/d5/a;)V

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

.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/d5/a;->c0:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    const/4 v0, -0x1

    .line 6
    :try_start_5
    iput v0, p0, Lax/d5/a;->h0:I

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_9
    move-exception v0

    .line 11
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_5 .. :try_end_b} :catchall_9

    .line 12
    throw v0
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

.method protected declared-synchronized e(I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lax/d5/a;->b()V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/d5/a;->f0:Ljava/lang/Thread;

    .line 10
    .line 11
    iget v0, p0, Lax/d5/a;->h0:I

    .line 12
    .line 13
    iget v1, p0, Lax/d5/a;->i0:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_16

    .line 16
    .line 17
    invoke-direct {p0}, Lax/d5/a;->a()V

    .line 18
    .line 19
    .line 20
    goto :goto_16

    .line 21
    :catchall_14
    move-exception p1

    .line 22
    goto :goto_33

    .line 23
    :cond_16
    :goto_16
    iget v0, p0, Lax/d5/a;->h0:I

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-gez v0, :cond_1f

    .line 27
    .line 28
    iput v1, p0, Lax/d5/a;->h0:I

    .line 29
    .line 30
    iput v1, p0, Lax/d5/a;->i0:I

    .line 31
    .line 32
    :cond_1f
    iget-object v0, p0, Lax/d5/a;->g0:[B

    .line 33
    .line 34
    iget v2, p0, Lax/d5/a;->h0:I

    .line 35
    .line 36
    add-int/lit8 v3, v2, 0x1

    .line 37
    .line 38
    iput v3, p0, Lax/d5/a;->h0:I

    .line 39
    .line 40
    and-int/lit16 p1, p1, 0xff

    .line 41
    .line 42
    int-to-byte p1, p1

    .line 43
    aput-byte p1, v0, v2

    .line 44
    .line 45
    array-length p1, v0

    .line 46
    if-lt v3, p1, :cond_31

    .line 47
    .line 48
    iput v1, p0, Lax/d5/a;->h0:I
    :try_end_31
    .catchall {:try_start_1 .. :try_end_31} :catchall_14

    .line 49
    .line 50
    :cond_31
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :goto_33
    :try_start_33
    monitor-exit p0
    :try_end_34
    .catchall {:try_start_33 .. :try_end_34} :catchall_14

    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method declared-synchronized f([BII)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lax/d5/a;->b()V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/d5/a;->f0:Ljava/lang/Thread;

    .line 10
    .line 11
    :cond_a
    :goto_a
    if-lez p3, :cond_4b

    .line 12
    .line 13
    iget v0, p0, Lax/d5/a;->h0:I

    .line 14
    .line 15
    iget v1, p0, Lax/d5/a;->i0:I

    .line 16
    .line 17
    if-ne v0, v1, :cond_18

    .line 18
    .line 19
    invoke-direct {p0}, Lax/d5/a;->a()V

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception p1

    .line 24
    goto :goto_4d

    .line 25
    :cond_18
    :goto_18
    iget v0, p0, Lax/d5/a;->i0:I

    .line 26
    .line 27
    iget v1, p0, Lax/d5/a;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-ge v0, v1, :cond_24

    .line 31
    .line 32
    iget-object v0, p0, Lax/d5/a;->g0:[B

    .line 33
    .line 34
    array-length v0, v0

    .line 35
    :cond_22
    sub-int/2addr v0, v1

    .line 36
    goto :goto_32

    .line 37
    :cond_24
    if-ge v1, v0, :cond_31

    .line 38
    .line 39
    const/4 v3, -0x1

    .line 40
    if-ne v1, v3, :cond_22

    .line 41
    .line 42
    iput v2, p0, Lax/d5/a;->i0:I

    .line 43
    .line 44
    iput v2, p0, Lax/d5/a;->h0:I

    .line 45
    .line 46
    iget-object v0, p0, Lax/d5/a;->g0:[B

    .line 47
    .line 48
    array-length v0, v0

    .line 49
    goto :goto_32

    .line 50
    :cond_31
    const/4 v0, 0x0

    .line 51
    :goto_32
    if-le v0, p3, :cond_35

    .line 52
    .line 53
    move v0, p3

    .line 54
    :cond_35
    iget-object v1, p0, Lax/d5/a;->g0:[B

    .line 55
    .line 56
    iget v3, p0, Lax/d5/a;->h0:I

    .line 57
    .line 58
    invoke-static {p1, p2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p3, v0

    .line 62
    add-int/2addr p2, v0

    .line 63
    iget v1, p0, Lax/d5/a;->h0:I

    .line 64
    .line 65
    add-int/2addr v1, v0

    .line 66
    iput v1, p0, Lax/d5/a;->h0:I

    .line 67
    .line 68
    iget-object v0, p0, Lax/d5/a;->g0:[B

    .line 69
    .line 70
    array-length v0, v0

    .line 71
    if-lt v1, v0, :cond_a

    .line 72
    .line 73
    iput v2, p0, Lax/d5/a;->h0:I
    :try_end_4a
    .catchall {:try_start_1 .. :try_end_4a} :catchall_16

    .line 74
    .line 75
    goto :goto_a

    .line 76
    :cond_4b
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :goto_4d
    :try_start_4d
    monitor-exit p0
    :try_end_4e
    .catchall {:try_start_4d .. :try_end_4e} :catchall_16

    .line 79
    throw p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method declared-synchronized g()V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_2
    iput-boolean v0, p0, Lax/d5/a;->q:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_7
    .catchall {:try_start_2 .. :try_end_7} :catchall_9

    .line 6
    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_9
    move-exception v0

    .line 11
    :try_start_a
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_a .. :try_end_b} :catchall_9

    .line 12
    throw v0
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

.method public declared-synchronized read()I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_1
    iget-boolean v0, p0, Lax/d5/a;->d0:Z

    if-eqz v0, :cond_7e

    .line 2
    iget-boolean v0, p0, Lax/d5/a;->c0:Z

    if-nez v0, :cond_76

    .line 3
    iget-object v0, p0, Lax/d5/a;->f0:Ljava/lang/Thread;

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_26

    iget-boolean v0, p0, Lax/d5/a;->q:Z

    if-nez v0, :cond_26

    iget v0, p0, Lax/d5/a;->h0:I

    if-ltz v0, :cond_1c

    goto :goto_26

    .line 4
    :cond_1c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Write end dead"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_24
    move-exception v0

    goto :goto_86

    .line 5
    :cond_26
    :goto_26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lax/d5/a;->e0:Ljava/lang/Thread;

    const/4 v0, 0x2

    .line 6
    :goto_2d
    iget v1, p0, Lax/d5/a;->h0:I

    const/4 v2, -0x1

    if-gez v1, :cond_5c

    .line 7
    iget-boolean v1, p0, Lax/d5/a;->q:Z
    :try_end_34
    .catchall {:try_start_1 .. :try_end_34} :catchall_24

    if-eqz v1, :cond_38

    .line 8
    monitor-exit p0

    return v2

    .line 9
    :cond_38
    :try_start_38
    iget-object v1, p0, Lax/d5/a;->f0:Ljava/lang/Thread;

    if-eqz v1, :cond_4f

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_4f

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_47

    goto :goto_4f

    .line 10
    :cond_47
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Pipe broken"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_4f
    :goto_4f
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_52
    .catchall {:try_start_38 .. :try_end_52} :catchall_24

    const-wide/16 v1, 0x3e8

    .line 12
    :try_start_54
    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_57
    .catch Ljava/lang/InterruptedException; {:try_start_54 .. :try_end_57} :catch_58
    .catchall {:try_start_54 .. :try_end_57} :catchall_24

    goto :goto_2d

    .line 13
    :catch_58
    :try_start_58
    invoke-static {}, Lax/d5/a;->j()V

    goto :goto_2d

    .line 14
    :cond_5c
    iget-object v0, p0, Lax/d5/a;->g0:[B

    iget v3, p0, Lax/d5/a;->i0:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lax/d5/a;->i0:I

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    .line 15
    array-length v0, v0

    if-lt v4, v0, :cond_6e

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lax/d5/a;->i0:I

    .line 17
    :cond_6e
    iget v0, p0, Lax/d5/a;->i0:I

    if-ne v1, v0, :cond_74

    .line 18
    iput v2, p0, Lax/d5/a;->h0:I
    :try_end_74
    .catchall {:try_start_58 .. :try_end_74} :catchall_24

    .line 19
    :cond_74
    monitor-exit p0

    return v3

    .line 20
    :cond_76
    :try_start_76
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Pipe closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 21
    :cond_7e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Pipe not connected"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 22
    :goto_86
    monitor-exit p0
    :try_end_87
    .catchall {:try_start_76 .. :try_end_87} :catchall_24

    throw v0
.end method

.method public declared-synchronized read([BII)I
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_65

    if-ltz p2, :cond_5f

    if-ltz p3, :cond_5f

    .line 23
    :try_start_7
    array-length v0, p1
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_32

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_5f

    const/4 v0, 0x0

    if-nez p3, :cond_10

    .line 24
    monitor-exit p0

    return v0

    .line 25
    :cond_10
    :try_start_10
    invoke-virtual {p0}, Lax/d5/a;->read()I

    move-result v1
    :try_end_14
    .catchall {:try_start_10 .. :try_end_14} :catchall_32

    const/4 v2, -0x1

    if-gez v1, :cond_19

    .line 26
    monitor-exit p0

    return v2

    :cond_19
    int-to-byte v1, v1

    .line 27
    :try_start_1a
    aput-byte v1, p1, p2

    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 28
    :cond_1e
    :goto_1e
    iget v4, p0, Lax/d5/a;->h0:I

    if-ltz v4, :cond_5d

    if-le p3, v1, :cond_5d

    .line 29
    iget v5, p0, Lax/d5/a;->i0:I

    if-le v4, v5, :cond_34

    .line 30
    iget-object v6, p0, Lax/d5/a;->g0:[B

    array-length v6, v6

    sub-int/2addr v6, v5

    sub-int/2addr v4, v5

    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    goto :goto_38

    :catchall_32
    move-exception p1

    goto :goto_6b

    .line 31
    :cond_34
    iget-object v4, p0, Lax/d5/a;->g0:[B

    array-length v4, v4

    sub-int/2addr v4, v5

    :goto_38
    add-int/lit8 v5, p3, -0x1

    if-le v4, v5, :cond_3d

    move v4, v5

    .line 32
    :cond_3d
    iget-object v5, p0, Lax/d5/a;->g0:[B

    iget v6, p0, Lax/d5/a;->i0:I

    add-int v7, p2, v3

    invoke-static {v5, v6, p1, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    iget v5, p0, Lax/d5/a;->i0:I

    add-int/2addr v5, v4

    iput v5, p0, Lax/d5/a;->i0:I

    add-int/2addr v3, v4

    sub-int/2addr p3, v4

    .line 34
    iget-object v4, p0, Lax/d5/a;->g0:[B

    array-length v4, v4

    if-lt v5, v4, :cond_54

    .line 35
    iput v0, p0, Lax/d5/a;->i0:I

    .line 36
    :cond_54
    iget v4, p0, Lax/d5/a;->h0:I

    iget v5, p0, Lax/d5/a;->i0:I

    if-ne v4, v5, :cond_1e

    .line 37
    iput v2, p0, Lax/d5/a;->h0:I
    :try_end_5c
    .catchall {:try_start_1a .. :try_end_5c} :catchall_32

    goto :goto_1e

    .line 38
    :cond_5d
    monitor-exit p0

    return v3

    .line 39
    :cond_5f
    :try_start_5f
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 40
    :cond_65
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 41
    :goto_6b
    monitor-exit p0
    :try_end_6c
    .catchall {:try_start_5f .. :try_end_6c} :catchall_32

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .registers 4

    .line 1
    invoke-static {p0, p1}, Lj$/io/DesugarInputStream;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
