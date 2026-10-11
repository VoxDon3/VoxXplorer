.class public Lax/d5/b;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field private q:Lax/d5/a;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method public constructor <init>(Lax/d5/a;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lax/d5/b;->a(Lax/d5/a;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lax/d5/a;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_22

    .line 3
    .line 4
    :try_start_3
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    .line 5
    .line 6
    if-nez v0, :cond_1a

    .line 7
    .line 8
    iget-boolean v0, p1, Lax/d5/a;->d0:Z

    .line 9
    .line 10
    if-nez v0, :cond_1a

    .line 11
    .line 12
    iput-object p1, p0, Lax/d5/b;->q:Lax/d5/a;

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p1, Lax/d5/a;->h0:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p1, Lax/d5/a;->i0:I

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p1, Lax/d5/a;->d0:Z
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_18

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_18
    move-exception p1

    .line 26
    goto :goto_28

    .line 27
    :cond_1a
    :try_start_1a
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    const-string v0, "Already connected"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_22
    new-instance p1, Ljava/lang/NullPointerException;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :goto_28
    monitor-exit p0
    :try_end_29
    .catchall {:try_start_1a .. :try_end_29} :catchall_18

    .line 42
    throw p1
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

.method public close()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/d5/a;->g()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public declared-synchronized flush()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    .line 3
    .line 4
    if-eqz v0, :cond_12

    .line 5
    .line 6
    monitor-enter v0
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_10

    .line 7
    :try_start_6
    iget-object v1, p0, Lax/d5/b;->q:Lax/d5/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    goto :goto_12

    .line 14
    :catchall_d
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_6 .. :try_end_f} :catchall_d

    .line 16
    :try_start_f
    throw v1
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_10

    .line 17
    :catchall_10
    move-exception v0

    .line 18
    goto :goto_14

    .line 19
    :cond_12
    :goto_12
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :goto_14
    :try_start_14
    monitor-exit p0
    :try_end_15
    .catchall {:try_start_14 .. :try_end_15} :catchall_10

    .line 22
    throw v0
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

.method public write(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    if-eqz v0, :cond_8

    .line 2
    invoke-virtual {v0, p1}, Lax/d5/a;->e(I)V

    return-void

    .line 3
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Pipe not connected"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    if-eqz v0, :cond_24

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_1e

    .line 6
    array-length v0, p1

    if-gt p2, v0, :cond_1e

    if-ltz p3, :cond_1e

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_1e

    if-ltz v0, :cond_1e

    if-nez p3, :cond_18

    return-void

    .line 7
    :cond_18
    iget-object v0, p0, Lax/d5/b;->q:Lax/d5/a;

    invoke-virtual {v0, p1, p2, p3}, Lax/d5/a;->f([BII)V

    return-void

    .line 8
    :cond_1e
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 9
    :cond_24
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Pipe not connected"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
