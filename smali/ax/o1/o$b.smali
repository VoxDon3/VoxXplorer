.class Lax/o1/o$b;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private c0:Landroid/os/Handler;

.field private d0:Ljava/lang/Error;

.field private e0:Ljava/lang/RuntimeException;

.field private f0:Lax/o1/o;

.field private q:Lax/S0/n;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    const-string v0, "ExoPlayer:PlaceholderSurface"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method private b(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S0/p$a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lax/S0/n;->h(I)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/o1/o;

    .line 12
    .line 13
    iget-object v1, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 14
    .line 15
    invoke-virtual {v1}, Lax/S0/n;->g()Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz p1, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    :goto_17
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v1, p1, v2}, Lax/o1/o;-><init>(Lax/o1/o$b;Landroid/graphics/SurfaceTexture;ZLax/o1/o$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lax/o1/o$b;->f0:Lax/o1/o;

    .line 29
    .line 30
    return-void
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

.method private d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/S0/n;->i()V

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


# virtual methods
.method public a(I)Lax/o1/o;
    .registers 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/o1/o$b;->c0:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lax/S0/n;

    .line 16
    .line 17
    iget-object v1, p0, Lax/o1/o$b;->c0:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lax/S0/n;-><init>(Landroid/os/Handler;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lax/o1/o$b;->q:Lax/S0/n;

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_18
    iget-object v0, p0, Lax/o1/o$b;->c0:Landroid/os/Handler;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v1, p1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 34
    .line 35
    .line 36
    :goto_23
    iget-object p1, p0, Lax/o1/o$b;->f0:Lax/o1/o;

    .line 37
    .line 38
    if-nez p1, :cond_37

    .line 39
    .line 40
    iget-object p1, p0, Lax/o1/o$b;->e0:Ljava/lang/RuntimeException;

    .line 41
    .line 42
    if-nez p1, :cond_37

    .line 43
    .line 44
    iget-object p1, p0, Lax/o1/o$b;->d0:Ljava/lang/Error;
    :try_end_2d
    .catchall {:try_start_18 .. :try_end_2d} :catchall_33

    .line 45
    .line 46
    if-nez p1, :cond_37

    .line 47
    .line 48
    :try_start_2f
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_32
    .catch Ljava/lang/InterruptedException; {:try_start_2f .. :try_end_32} :catch_35
    .catchall {:try_start_2f .. :try_end_32} :catchall_33

    .line 49
    .line 50
    .line 51
    goto :goto_23

    .line 52
    :catchall_33
    move-exception p1

    .line 53
    goto :goto_54

    .line 54
    :catch_35
    const/4 v2, 0x1

    .line 55
    goto :goto_23

    .line 56
    :cond_37
    :try_start_37
    monitor-exit p0
    :try_end_38
    .catchall {:try_start_37 .. :try_end_38} :catchall_33

    .line 57
    if-eqz v2, :cond_41

    .line 58
    .line 59
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 64
    .line 65
    .line 66
    :cond_41
    iget-object p1, p0, Lax/o1/o$b;->e0:Ljava/lang/RuntimeException;

    .line 67
    .line 68
    if-nez p1, :cond_53

    .line 69
    .line 70
    iget-object p1, p0, Lax/o1/o$b;->d0:Ljava/lang/Error;

    .line 71
    .line 72
    if-nez p1, :cond_52

    .line 73
    .line 74
    iget-object p1, p0, Lax/o1/o$b;->f0:Lax/o1/o;

    .line 75
    .line 76
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lax/o1/o;

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_52
    throw p1

    .line 84
    :cond_53
    throw p1

    .line 85
    :goto_54
    :try_start_54
    monitor-exit p0
    :try_end_55
    .catchall {:try_start_54 .. :try_end_55} :catchall_33

    .line 86
    throw p1
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public c()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/o$b;->c0:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o1/o$b;->c0:Landroid/os/Handler;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 10
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
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .registers 5

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1f

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    if-eq v0, p1, :cond_9

    .line 8
    .line 9
    return v1

    .line 10
    :cond_9
    :try_start_9
    invoke-direct {p0}, Lax/o1/o$b;->d()V
    :try_end_c
    .catchall {:try_start_9 .. :try_end_c} :catchall_10

    .line 11
    .line 12
    .line 13
    :goto_c
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 14
    .line 15
    .line 16
    goto :goto_19

    .line 17
    :catchall_10
    move-exception p1

    .line 18
    :try_start_11
    const-string v0, "PlaceholderSurface"

    .line 19
    .line 20
    const-string v2, "Failed to release placeholder surface"

    .line 21
    .line 22
    invoke-static {v0, v2, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_18
    .catchall {:try_start_11 .. :try_end_18} :catchall_1a

    .line 23
    .line 24
    .line 25
    goto :goto_c

    .line 26
    :goto_19
    return v1

    .line 27
    :catchall_1a
    move-exception p1

    .line 28
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1f
    :try_start_1f
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lax/o1/o$b;->b(I)V
    :try_end_24
    .catch Ljava/lang/RuntimeException; {:try_start_1f .. :try_end_24} :catch_33
    .catch Lax/S0/p$a; {:try_start_1f .. :try_end_24} :catch_31
    .catch Ljava/lang/Error; {:try_start_1f .. :try_end_24} :catch_2f
    .catchall {:try_start_1f .. :try_end_24} :catchall_2d

    .line 35
    .line 36
    .line 37
    monitor-enter p0

    .line 38
    :try_start_25
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 39
    .line 40
    .line 41
    monitor-exit p0

    .line 42
    goto :goto_6c

    .line 43
    :catchall_2a
    move-exception p1

    .line 44
    monitor-exit p0
    :try_end_2c
    .catchall {:try_start_25 .. :try_end_2c} :catchall_2a

    .line 45
    throw p1

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    goto :goto_70

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    goto :goto_35

    .line 50
    :catch_31
    move-exception p1

    .line 51
    goto :goto_47

    .line 52
    :catch_33
    move-exception p1

    .line 53
    goto :goto_5e

    .line 54
    :goto_35
    :try_start_35
    const-string v0, "PlaceholderSurface"

    .line 55
    .line 56
    const-string v2, "Failed to initialize placeholder surface"

    .line 57
    .line 58
    invoke-static {v0, v2, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lax/o1/o$b;->d0:Ljava/lang/Error;
    :try_end_3e
    .catchall {:try_start_35 .. :try_end_3e} :catchall_2d

    .line 62
    .line 63
    monitor-enter p0

    .line 64
    :try_start_3f
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 65
    .line 66
    .line 67
    monitor-exit p0

    .line 68
    goto :goto_6c

    .line 69
    :catchall_44
    move-exception p1

    .line 70
    monitor-exit p0
    :try_end_46
    .catchall {:try_start_3f .. :try_end_46} :catchall_44

    .line 71
    throw p1

    .line 72
    :goto_47
    :try_start_47
    const-string v0, "PlaceholderSurface"

    .line 73
    .line 74
    const-string v2, "Failed to initialize placeholder surface"

    .line 75
    .line 76
    invoke-static {v0, v2, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lax/o1/o$b;->e0:Ljava/lang/RuntimeException;
    :try_end_55
    .catchall {:try_start_47 .. :try_end_55} :catchall_2d

    .line 85
    .line 86
    monitor-enter p0

    .line 87
    :try_start_56
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 88
    .line 89
    .line 90
    monitor-exit p0

    .line 91
    goto :goto_6c

    .line 92
    :catchall_5b
    move-exception p1

    .line 93
    monitor-exit p0
    :try_end_5d
    .catchall {:try_start_56 .. :try_end_5d} :catchall_5b

    .line 94
    throw p1

    .line 95
    :goto_5e
    :try_start_5e
    const-string v0, "PlaceholderSurface"

    .line 96
    .line 97
    const-string v2, "Failed to initialize placeholder surface"

    .line 98
    .line 99
    invoke-static {v0, v2, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lax/o1/o$b;->e0:Ljava/lang/RuntimeException;
    :try_end_67
    .catchall {:try_start_5e .. :try_end_67} :catchall_2d

    .line 103
    .line 104
    monitor-enter p0

    .line 105
    :try_start_68
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 106
    .line 107
    .line 108
    monitor-exit p0

    .line 109
    :goto_6c
    return v1

    .line 110
    :catchall_6d
    move-exception p1

    .line 111
    monitor-exit p0
    :try_end_6f
    .catchall {:try_start_68 .. :try_end_6f} :catchall_6d

    .line 112
    throw p1

    .line 113
    :goto_70
    monitor-enter p0

    .line 114
    :try_start_71
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 115
    .line 116
    .line 117
    monitor-exit p0
    :try_end_75
    .catchall {:try_start_71 .. :try_end_75} :catchall_76

    .line 118
    throw p1

    .line 119
    :catchall_76
    move-exception p1

    .line 120
    :try_start_77
    monitor-exit p0
    :try_end_78
    .catchall {:try_start_77 .. :try_end_78} :catchall_76

    .line 121
    throw p1
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method
