.class public Lax/g4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/g4/a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/g4/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/g4/a<",
        "TR;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final l0:Lax/g4/d$a;


# instance fields
.field private final c0:I

.field private final d0:I

.field private final e0:Z

.field private final f0:Lax/g4/d$a;

.field private g0:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private h0:Lax/g4/b;

.field private i0:Z

.field private j0:Z

.field private k0:Z

.field private final q:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/g4/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/g4/d;->l0:Lax/g4/d$a;

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
.end method

.method public constructor <init>(Landroid/os/Handler;II)V
    .registers 10

    const/4 v4, 0x1

    .line 1
    sget-object v5, Lax/g4/d;->l0:Lax/g4/d$a;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lax/g4/d;-><init>(Landroid/os/Handler;IIZLax/g4/d$a;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Handler;IIZLax/g4/d$a;)V
    .registers 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/g4/d;->q:Landroid/os/Handler;

    .line 4
    iput p2, p0, Lax/g4/d;->c0:I

    .line 5
    iput p3, p0, Lax/g4/d;->d0:I

    .line 6
    iput-boolean p4, p0, Lax/g4/d;->e0:Z

    .line 7
    iput-object p5, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    return-void
.end method

.method private m()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/d;->q:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

.method private declared-synchronized n(Ljava/lang/Long;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/g4/d;->e0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_12

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/g4/d;->isDone()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_12

    .line 11
    .line 12
    invoke-static {}, Lax/k4/i;->a()V

    .line 13
    .line 14
    .line 15
    goto :goto_12

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    goto/16 :goto_85

    .line 18
    .line 19
    :cond_12
    :goto_12
    iget-boolean v0, p0, Lax/g4/d;->i0:Z

    .line 20
    .line 21
    if-nez v0, :cond_7f

    .line 22
    .line 23
    iget-boolean v0, p0, Lax/g4/d;->k0:Z

    .line 24
    .line 25
    if-nez v0, :cond_72

    .line 26
    .line 27
    iget-boolean v0, p0, Lax/g4/d;->j0:Z

    .line 28
    .line 29
    if-eqz v0, :cond_22

    .line 30
    .line 31
    iget-object p1, p0, Lax/g4/d;->g0:Ljava/lang/Object;
    :try_end_20
    .catchall {:try_start_1 .. :try_end_20} :catchall_f

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object p1

    .line 35
    :cond_22
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    if-nez p1, :cond_2c

    .line 38
    .line 39
    :try_start_26
    iget-object p1, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    .line 40
    .line 41
    invoke-virtual {p1, p0, v0, v1}, Lax/g4/d$a;->b(Ljava/lang/Object;J)V

    .line 42
    .line 43
    .line 44
    goto :goto_3d

    .line 45
    :cond_2c
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    cmp-long v4, v2, v0

    .line 50
    .line 51
    if-lez v4, :cond_3d

    .line 52
    .line 53
    iget-object v0, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-virtual {v0, p0, v1, v2}, Lax/g4/d$a;->b(Ljava/lang/Object;J)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_6c

    .line 67
    .line 68
    iget-boolean p1, p0, Lax/g4/d;->k0:Z

    .line 69
    .line 70
    if-nez p1, :cond_5f

    .line 71
    .line 72
    iget-boolean p1, p0, Lax/g4/d;->i0:Z

    .line 73
    .line 74
    if-nez p1, :cond_59

    .line 75
    .line 76
    iget-boolean p1, p0, Lax/g4/d;->j0:Z

    .line 77
    .line 78
    if-eqz p1, :cond_53

    .line 79
    .line 80
    iget-object p1, p0, Lax/g4/d;->g0:Ljava/lang/Object;
    :try_end_51
    .catchall {:try_start_26 .. :try_end_51} :catchall_f

    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-object p1

    .line 84
    :cond_53
    :try_start_53
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_59
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5f
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    .line 97
    .line 98
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    const-string v1, "Load failed"

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_6c
    new-instance p1, Ljava/lang/InterruptedException;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_72
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    .line 116
    .line 117
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v1, "Load failed"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_7f
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :goto_85
    monitor-exit p0
    :try_end_86
    .catchall {:try_start_53 .. :try_end_86} :catchall_f

    .line 135
    throw p1
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method


# virtual methods
.method public a()V
    .registers 1

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

.method public b()V
    .registers 1

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

.method public declared-synchronized c(Ljava/lang/Object;Lax/i4/b;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lax/i4/b<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    const/4 p2, 0x1

    .line 3
    :try_start_2
    iput-boolean p2, p0, Lax/g4/d;->j0:Z

    .line 4
    .line 5
    iput-object p1, p0, Lax/g4/d;->g0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p1, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lax/g4/d$a;->a(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_2 .. :try_end_b} :catchall_d

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    :try_start_e
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    .line 16
    throw p1
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

.method public declared-synchronized cancel(Z)Z
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lax/g4/d;->isDone()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_18

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    const/4 v0, 0x1

    .line 12
    :try_start_b
    iput-boolean v0, p0, Lax/g4/d;->i0:Z

    .line 13
    .line 14
    iget-object v1, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lax/g4/d$a;->a(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1a

    .line 20
    .line 21
    invoke-direct {p0}, Lax/g4/d;->m()V
    :try_end_17
    .catchall {:try_start_b .. :try_end_17} :catchall_18

    .line 22
    .line 23
    .line 24
    goto :goto_1a

    .line 25
    :catchall_18
    move-exception p1

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    :goto_1a
    monitor-exit p0

    .line 28
    return v0

    .line 29
    :goto_1c
    :try_start_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_18

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

.method public d(Lax/h4/d;)V
    .registers 2

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
    .line 22
.end method

.method public e(Lax/g4/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/g4/d;->h0:Lax/g4/b;

    .line 2
    .line 3
    return-void
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

.method public f()V
    .registers 1

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

.method public g(Lax/h4/d;)V
    .registers 4

    .line 1
    iget v0, p0, Lax/g4/d;->c0:I

    .line 2
    .line 3
    iget v1, p0, Lax/g4/d;->d0:I

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lax/h4/d;->e(II)V

    .line 6
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

.method public get()Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_1
    invoke-direct {p0, v0}, Lax/g4/d;->n(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_5} :catch_6

    return-object v0

    :catch_6
    move-exception v0

    .line 2
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 3
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1}, Lax/g4/d;->n(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized i(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 p1, 0x1

    .line 3
    :try_start_2
    iput-boolean p1, p0, Lax/g4/d;->k0:Z

    .line 4
    .line 5
    iget-object p1, p0, Lax/g4/d;->f0:Lax/g4/d$a;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lax/g4/d$a;->a(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_2 .. :try_end_9} :catchall_b

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_b
    move-exception p1

    .line 13
    :try_start_c
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_c .. :try_end_d} :catchall_b

    .line 14
    throw p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public declared-synchronized isCancelled()Z
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/g4/d;->i0:Z
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

.method public declared-synchronized isDone()Z
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/g4/d;->i0:Z

    .line 3
    .line 4
    if-nez v0, :cond_e

    .line 5
    .line 6
    iget-boolean v0, p0, Lax/g4/d;->j0:Z
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_c

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    goto :goto_e

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    goto :goto_f

    .line 13
    :catchall_c
    move-exception v0

    .line 14
    goto :goto_11

    .line 15
    :cond_e
    :goto_e
    const/4 v0, 0x1

    .line 16
    :goto_f
    monitor-exit p0

    .line 17
    return v0

    .line 18
    :goto_11
    :try_start_11
    monitor-exit p0
    :try_end_12
    .catchall {:try_start_11 .. :try_end_12} :catchall_c

    .line 19
    throw v0
    .line 20
    .line 21
.end method

.method public j(Landroid/graphics/drawable/Drawable;)V
    .registers 2

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
    .line 22
.end method

.method public k()Lax/g4/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/d;->h0:Lax/g4/b;

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

.method public l(Landroid/graphics/drawable/Drawable;)V
    .registers 2

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
    .line 22
.end method

.method public run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/d;->h0:Lax/g4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-interface {v0}, Lax/g4/b;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/g4/d;->h0:Lax/g4/b;

    .line 10
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
