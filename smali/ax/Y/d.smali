.class public final Lax/Y/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Y/d$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private a:Z

.field private b:Lax/Y/d$a;

.field private c:Ljava/lang/Object;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private d()V
    .registers 2

    .line 1
    :goto_0
    iget-boolean v0, p0, Lax/Y/d;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_7} :catch_8

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_8
    nop

    .line 10
    goto :goto_0

    .line 11
    :cond_a
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


# virtual methods
.method public a()V
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/Y/d;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_7
    move-exception v0

    .line 9
    goto :goto_3a

    .line 10
    :cond_9
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/Y/d;->a:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lax/Y/d;->d:Z

    .line 14
    .line 15
    iget-object v0, p0, Lax/Y/d;->b:Lax/Y/d$a;

    .line 16
    .line 17
    iget-object v1, p0, Lax/Y/d;->c:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_1 .. :try_end_13} :catchall_7

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_1c

    .line 22
    .line 23
    :try_start_16
    invoke-interface {v0}, Lax/Y/d$a;->a()V

    .line 24
    .line 25
    .line 26
    goto :goto_1c

    .line 27
    :catchall_1a
    move-exception v0

    .line 28
    goto :goto_24

    .line 29
    :cond_1c
    :goto_1c
    if-eqz v1, :cond_2f

    .line 30
    .line 31
    check-cast v1, Landroid/os/CancellationSignal;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/CancellationSignal;->cancel()V
    :try_end_23
    .catchall {:try_start_16 .. :try_end_23} :catchall_1a

    .line 34
    .line 35
    .line 36
    goto :goto_2f

    .line 37
    :goto_24
    monitor-enter p0

    .line 38
    :try_start_25
    iput-boolean v2, p0, Lax/Y/d;->d:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 41
    .line 42
    .line 43
    monitor-exit p0
    :try_end_2b
    .catchall {:try_start_25 .. :try_end_2b} :catchall_2c

    .line 44
    throw v0

    .line 45
    :catchall_2c
    move-exception v0

    .line 46
    :try_start_2d
    monitor-exit p0
    :try_end_2e
    .catchall {:try_start_2d .. :try_end_2e} :catchall_2c

    .line 47
    throw v0

    .line 48
    :cond_2f
    :goto_2f
    monitor-enter p0

    .line 49
    :try_start_30
    iput-boolean v2, p0, Lax/Y/d;->d:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 52
    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_37
    move-exception v0

    .line 57
    monitor-exit p0
    :try_end_39
    .catchall {:try_start_30 .. :try_end_39} :catchall_37

    .line 58
    throw v0

    .line 59
    :goto_3a
    :try_start_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_3a .. :try_end_3b} :catchall_7

    .line 60
    throw v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public b()Ljava/lang/Object;
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Y/d;->c:Ljava/lang/Object;

    .line 3
    .line 4
    if-nez v0, :cond_16

    .line 5
    .line 6
    new-instance v0, Landroid/os/CancellationSignal;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/Y/d;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-boolean v1, p0, Lax/Y/d;->a:Z

    .line 14
    .line 15
    if-eqz v1, :cond_16

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 18
    .line 19
    .line 20
    goto :goto_16

    .line 21
    :catchall_14
    move-exception v0

    .line 22
    goto :goto_1a

    .line 23
    :cond_16
    :goto_16
    iget-object v0, p0, Lax/Y/d;->c:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1a
    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_1 .. :try_end_1b} :catchall_14

    .line 28
    throw v0
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

.method public c(Lax/Y/d$a;)V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lax/Y/d;->d()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/Y/d;->b:Lax/Y/d$a;

    .line 6
    .line 7
    if-ne v0, p1, :cond_c

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_a
    move-exception p1

    .line 12
    goto :goto_1c

    .line 13
    :cond_c
    iput-object p1, p0, Lax/Y/d;->b:Lax/Y/d$a;

    .line 14
    .line 15
    iget-boolean v0, p0, Lax/Y/d;->a:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1a

    .line 18
    .line 19
    if-nez p1, :cond_15

    .line 20
    .line 21
    goto :goto_1a

    .line 22
    :cond_15
    monitor-exit p0
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_a

    .line 23
    invoke-interface {p1}, Lax/Y/d$a;->a()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    :goto_1a
    :try_start_1a
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1a .. :try_end_1d} :catchall_a

    .line 30
    throw p1
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
