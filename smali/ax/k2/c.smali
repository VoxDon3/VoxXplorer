.class public final Lax/k2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/k2/c$a;
    }
.end annotation


# static fields
.field public static final m:Lax/k2/c$a;


# instance fields
.field public a:Lax/o2/h;

.field private final b:Landroid/os/Handler;

.field private c:Ljava/lang/Runnable;

.field private final d:Ljava/lang/Object;

.field private e:J

.field private final f:Ljava/util/concurrent/Executor;

.field private g:I

.field private h:J

.field private i:Lax/o2/g;

.field private j:Z

.field private final k:Ljava/lang/Runnable;

.field private final l:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/k2/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/k2/c$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/k2/c;->m:Lax/k2/c$a;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V
    .registers 7

    .line 1
    const-string v0, "autoCloseTimeUnit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "autoCloseExecutor"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/k2/c;->b:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/k2/c;->d:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    iput-wide p1, p0, Lax/k2/c;->e:J

    .line 37
    .line 38
    iput-object p4, p0, Lax/k2/c;->f:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Lax/k2/c;->h:J

    .line 45
    .line 46
    new-instance p1, Lax/k2/a;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Lax/k2/a;-><init>(Lax/k2/c;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lax/k2/c;->k:Ljava/lang/Runnable;

    .line 52
    .line 53
    new-instance p1, Lax/k2/b;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Lax/k2/b;-><init>(Lax/k2/c;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lax/k2/c;->l:Ljava/lang/Runnable;

    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
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
.end method

.method public static synthetic a(Lax/k2/c;)V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/k2/c;->f(Lax/k2/c;)V

    return-void
.end method

.method public static synthetic b(Lax/k2/c;)V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/k2/c;->c(Lax/k2/c;)V

    return-void
.end method

.method private static final c(Lax/k2/c;)V
    .registers 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/k2/c;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-wide v3, p0, Lax/k2/c;->h:J

    .line 14
    .line 15
    sub-long/2addr v1, v3

    .line 16
    iget-wide v3, p0, Lax/k2/c;->e:J
    :try_end_11
    .catchall {:try_start_8 .. :try_end_11} :catchall_28

    .line 17
    .line 18
    cmp-long v5, v1, v3

    .line 19
    .line 20
    if-gez v5, :cond_17

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :cond_17
    :try_start_17
    iget v1, p0, Lax/k2/c;->g:I
    :try_end_19
    .catchall {:try_start_17 .. :try_end_19} :catchall_28

    .line 25
    .line 26
    if-eqz v1, :cond_1d

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :cond_1d
    :try_start_1d
    iget-object v1, p0, Lax/k2/c;->c:Ljava/lang/Runnable;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_2a

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lax/sb/t;->a:Lax/sb/t;

    .line 39
    .line 40
    goto :goto_2b

    .line 41
    :catchall_28
    move-exception p0

    .line 42
    goto :goto_48

    .line 43
    :cond_2a
    move-object v1, v2

    .line 44
    :goto_2b
    if-eqz v1, :cond_40

    .line 45
    .line 46
    iget-object v1, p0, Lax/k2/c;->i:Lax/o2/g;

    .line 47
    .line 48
    if-eqz v1, :cond_3a

    .line 49
    .line 50
    invoke-interface {v1}, Lax/o2/g;->isOpen()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3a

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iput-object v2, p0, Lax/k2/c;->i:Lax/o2/g;

    .line 60
    .line 61
    sget-object p0, Lax/sb/t;->a:Lax/sb/t;
    :try_end_3e
    .catchall {:try_start_1d .. :try_end_3e} :catchall_28

    .line 62
    .line 63
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :cond_40
    :try_start_40
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"

    .line 68
    .line 69
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
    :try_end_48
    .catchall {:try_start_40 .. :try_end_48} :catchall_28

    .line 73
    :goto_48
    monitor-exit v0

    .line 74
    throw p0
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

.method private static final f(Lax/k2/c;)V
    .registers 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/k2/c;->f:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iget-object p0, p0, Lax/k2/c;->l:Ljava/lang/Runnable;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.method public final d()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/k2/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_4
    iput-boolean v1, p0, Lax/k2/c;->j:Z

    .line 6
    .line 7
    iget-object v1, p0, Lax/k2/c;->i:Lax/o2/g;

    .line 8
    .line 9
    if-eqz v1, :cond_10

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 12
    .line 13
    .line 14
    goto :goto_10

    .line 15
    :catchall_e
    move-exception v1

    .line 16
    goto :goto_17

    .line 17
    :cond_10
    :goto_10
    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lax/k2/c;->i:Lax/o2/g;

    .line 19
    .line 20
    sget-object v1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_15
    .catchall {:try_start_4 .. :try_end_15} :catchall_e

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_17
    monitor-exit v0

    .line 25
    throw v1
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

.method public final e()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/k2/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget v1, p0, Lax/k2/c;->g:I

    .line 5
    .line 6
    if-lez v1, :cond_23

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    iput v1, p0, Lax/k2/c;->g:I

    .line 11
    .line 12
    if-nez v1, :cond_1f

    .line 13
    .line 14
    iget-object v1, p0, Lax/k2/c;->i:Lax/o2/g;
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_1d

    .line 15
    .line 16
    if-nez v1, :cond_13

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :cond_13
    :try_start_13
    iget-object v1, p0, Lax/k2/c;->b:Landroid/os/Handler;

    .line 21
    .line 22
    iget-object v2, p0, Lax/k2/c;->k:Ljava/lang/Runnable;

    .line 23
    .line 24
    iget-wide v3, p0, Lax/k2/c;->e:J

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1f

    .line 30
    :catchall_1d
    move-exception v1

    .line 31
    goto :goto_2b

    .line 32
    :cond_1f
    :goto_1f
    sget-object v1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_21
    .catchall {:try_start_13 .. :try_end_21} :catchall_1d

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :cond_23
    :try_start_23
    const-string v1, "ref count is 0 or lower but we\'re supposed to decrement"

    .line 37
    .line 38
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v2
    :try_end_2b
    .catchall {:try_start_23 .. :try_end_2b} :catchall_1d

    .line 44
    :goto_2b
    monitor-exit v0

    .line 45
    throw v1
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

.method public final g(Lax/Fb/l;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/Fb/l<",
            "-",
            "Lax/o2/g;",
            "+TV;>;)TV;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_5
    invoke-virtual {p0}, Lax/k2/c;->j()Lax/o2/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lax/Fb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_d
    .catchall {:try_start_5 .. :try_end_d} :catchall_11

    .line 14
    invoke-virtual {p0}, Lax/k2/c;->e()V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :catchall_11
    move-exception p1

    .line 19
    invoke-virtual {p0}, Lax/k2/c;->e()V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final h()Lax/o2/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/c;->i:Lax/o2/g;

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

.method public final i()Lax/o2/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/c;->a:Lax/o2/h;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    const-string v0, "delegateOpenHelper"

    .line 7
    .line 8
    invoke-static {v0}, Lax/Gb/l;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
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

.method public final j()Lax/o2/g;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/k2/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/k2/c;->b:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v2, p0, Lax/k2/c;->k:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lax/k2/c;->g:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, p0, Lax/k2/c;->g:I

    .line 16
    .line 17
    iget-boolean v1, p0, Lax/k2/c;->j:Z

    .line 18
    .line 19
    if-nez v1, :cond_2e

    .line 20
    .line 21
    iget-object v1, p0, Lax/k2/c;->i:Lax/o2/g;

    .line 22
    .line 23
    if-eqz v1, :cond_22

    .line 24
    .line 25
    invoke-interface {v1}, Lax/o2/g;->isOpen()Z

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_1c
    .catchall {:try_start_3 .. :try_end_1c} :catchall_20

    .line 29
    if-eqz v2, :cond_22

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :catchall_20
    move-exception v1

    .line 34
    goto :goto_36

    .line 35
    :cond_22
    :try_start_22
    invoke-virtual {p0}, Lax/k2/c;->i()Lax/o2/h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lax/o2/h;->g0()Lax/o2/g;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lax/k2/c;->i:Lax/o2/g;
    :try_end_2c
    .catchall {:try_start_22 .. :try_end_2c} :catchall_20

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-object v1

    .line 47
    :cond_2e
    :try_start_2e
    const-string v1, "Attempting to open already closed database."

    .line 48
    .line 49
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v2
    :try_end_36
    .catchall {:try_start_2e .. :try_end_36} :catchall_20

    .line 55
    :goto_36
    monitor-exit v0

    .line 56
    throw v1
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

.method public final k(Lax/o2/h;)V
    .registers 3

    .line 1
    const-string v0, "delegateOpenHelper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lax/k2/c;->n(Lax/o2/h;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public final l()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/k2/c;->j:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
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

.method public final m(Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    const-string v0, "onAutoClose"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/k2/c;->c:Ljava/lang/Runnable;

    .line 7
    .line 8
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
    .line 22
.end method

.method public final n(Lax/o2/h;)V
    .registers 3

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/k2/c;->a:Lax/o2/h;

    .line 7
    .line 8
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
    .line 22
.end method
