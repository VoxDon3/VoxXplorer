.class public Lax/S0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/S0/h;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    sget-object v0, Lax/S0/h;->a:Lax/S0/h;

    invoke-direct {p0, v0}, Lax/S0/k;-><init>(Lax/S0/h;)V

    return-void
.end method

.method public constructor <init>(Lax/S0/h;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/S0/k;->a:Lax/S0/h;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :goto_1
    :try_start_1
    iget-boolean v0, p0, Lax/S0/k;->b:Z

    .line 3
    .line 4
    if-nez v0, :cond_10

    .line 5
    .line 6
    iget-object v0, p0, Lax/S0/k;->a:Lax/S0/h;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/S0/h;->e()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_e

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    goto :goto_12

    .line 17
    :cond_10
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :goto_12
    :try_start_12
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_12 .. :try_end_13} :catchall_e

    .line 20
    throw v0
    .line 21
.end method

.method public declared-synchronized b()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_2
    :try_start_2
    iget-boolean v1, p0, Lax/S0/k;->b:Z
    :try_end_4
    .catchall {:try_start_2 .. :try_end_4} :catchall_f

    .line 4
    .line 5
    if-nez v1, :cond_13

    .line 6
    .line 7
    :try_start_6
    iget-object v1, p0, Lax/S0/k;->a:Lax/S0/h;

    .line 8
    .line 9
    invoke-interface {v1}, Lax/S0/h;->e()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_e} :catch_11
    .catchall {:try_start_6 .. :try_end_e} :catchall_f

    .line 13
    .line 14
    .line 15
    goto :goto_2

    .line 16
    :catchall_f
    move-exception v0

    .line 17
    goto :goto_1e

    .line 18
    :catch_11
    const/4 v0, 0x1

    .line 19
    goto :goto_2

    .line 20
    :cond_13
    if-eqz v0, :cond_1c

    .line 21
    .line 22
    :try_start_15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_1c
    .catchall {:try_start_15 .. :try_end_1c} :catchall_f

    .line 27
    .line 28
    .line 29
    :cond_1c
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1e
    :try_start_1e
    monitor-exit p0
    :try_end_1f
    .catchall {:try_start_1e .. :try_end_1f} :catchall_f

    .line 32
    throw v0
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

.method public declared-synchronized c(J)Z
    .registers 7

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-gtz v2, :cond_d

    .line 7
    .line 8
    :try_start_7
    iget-boolean p1, p0, Lax/S0/k;->b:Z
    :try_end_9
    .catchall {:try_start_7 .. :try_end_9} :catchall_b

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return p1

    .line 12
    :catchall_b
    move-exception p1

    .line 13
    goto :goto_46

    .line 14
    :cond_d
    :try_start_d
    iget-object v0, p0, Lax/S0/k;->a:Lax/S0/h;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    add-long/2addr p1, v0

    .line 21
    cmp-long v2, p1, v0

    .line 22
    .line 23
    if-gez v2, :cond_1c

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/S0/k;->b()V

    .line 26
    .line 27
    .line 28
    goto :goto_42

    .line 29
    :cond_1c
    const/4 v2, 0x0

    .line 30
    :goto_1d
    iget-boolean v3, p0, Lax/S0/k;->b:Z
    :try_end_1f
    .catchall {:try_start_d .. :try_end_1f} :catchall_b

    .line 31
    .line 32
    if-nez v3, :cond_39

    .line 33
    .line 34
    cmp-long v3, v0, p1

    .line 35
    .line 36
    if-gez v3, :cond_39

    .line 37
    .line 38
    :try_start_25
    iget-object v3, p0, Lax/S0/k;->a:Lax/S0/h;

    .line 39
    .line 40
    invoke-interface {v3}, Lax/S0/h;->e()V

    .line 41
    .line 42
    .line 43
    sub-long v0, p1, v0

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_2f
    .catch Ljava/lang/InterruptedException; {:try_start_25 .. :try_end_2f} :catch_30
    .catchall {:try_start_25 .. :try_end_2f} :catchall_b

    .line 46
    .line 47
    .line 48
    goto :goto_32

    .line 49
    :catch_30
    const/4 v0, 0x1

    .line 50
    const/4 v2, 0x1

    .line 51
    :goto_32
    :try_start_32
    iget-object v0, p0, Lax/S0/k;->a:Lax/S0/h;

    .line 52
    .line 53
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    goto :goto_1d

    .line 58
    :cond_39
    if-eqz v2, :cond_42

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 65
    .line 66
    .line 67
    :cond_42
    :goto_42
    iget-boolean p1, p0, Lax/S0/k;->b:Z
    :try_end_44
    .catchall {:try_start_32 .. :try_end_44} :catchall_b

    .line 68
    .line 69
    monitor-exit p0

    .line 70
    return p1

    .line 71
    :goto_46
    :try_start_46
    monitor-exit p0
    :try_end_47
    .catchall {:try_start_46 .. :try_end_47} :catchall_b

    .line 72
    throw p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
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

.method public declared-synchronized d()Z
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/S0/k;->b:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lax/S0/k;->b:Z
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v0

    .line 9
    :catchall_8
    move-exception v0

    .line 10
    :try_start_9
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_8

    .line 11
    throw v0
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

.method public declared-synchronized e()Z
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/S0/k;->b:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_5
    move-exception v0

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw v0
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

.method public declared-synchronized f()Z
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/S0/k;->b:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_10

    .line 3
    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x1

    .line 10
    :try_start_9
    iput-boolean v0, p0, Lax/S0/k;->b:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_e
    .catchall {:try_start_9 .. :try_end_e} :catchall_10

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return v0

    .line 17
    :catchall_10
    move-exception v0

    .line 18
    :try_start_11
    monitor-exit p0
    :try_end_12
    .catchall {:try_start_11 .. :try_end_12} :catchall_10

    .line 19
    throw v0
    .line 20
    .line 21
.end method
