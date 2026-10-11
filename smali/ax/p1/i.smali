.class final Lax/p1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o1/z;
.implements Lax/p1/a;


# instance fields
.field private final c0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final d0:Lax/p1/g;

.field private final e0:Lax/p1/c;

.field private final f0:Lax/S0/L;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/L<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final g0:Lax/S0/L;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/L<",
            "Lax/p1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final h0:[F

.field private final i0:[F

.field private j0:I

.field private k0:Landroid/graphics/SurfaceTexture;

.field private volatile l0:I

.field private m0:I

.field private n0:[B

.field private final q:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/p1/i;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/p1/i;->c0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance v0, Lax/p1/g;

    .line 20
    .line 21
    invoke-direct {v0}, Lax/p1/g;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/p1/i;->d0:Lax/p1/g;

    .line 25
    .line 26
    new-instance v0, Lax/p1/c;

    .line 27
    .line 28
    invoke-direct {v0}, Lax/p1/c;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/p1/i;->e0:Lax/p1/c;

    .line 32
    .line 33
    new-instance v0, Lax/S0/L;

    .line 34
    .line 35
    invoke-direct {v0}, Lax/S0/L;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lax/p1/i;->f0:Lax/S0/L;

    .line 39
    .line 40
    new-instance v0, Lax/S0/L;

    .line 41
    .line 42
    invoke-direct {v0}, Lax/S0/L;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lax/p1/i;->g0:Lax/S0/L;

    .line 46
    .line 47
    const/16 v0, 0x10

    .line 48
    .line 49
    new-array v1, v0, [F

    .line 50
    .line 51
    iput-object v1, p0, Lax/p1/i;->h0:[F

    .line 52
    .line 53
    new-array v0, v0, [F

    .line 54
    .line 55
    iput-object v0, p0, Lax/p1/i;->i0:[F

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput v0, p0, Lax/p1/i;->l0:I

    .line 59
    .line 60
    const/4 v0, -0x1

    .line 61
    iput v0, p0, Lax/p1/i;->m0:I

    .line 62
    .line 63
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static synthetic a(Lax/p1/i;Landroid/graphics/SurfaceTexture;)V
    .registers 2

    .line 1
    iget-object p0, p0, Lax/p1/i;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method private h([BIJ)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/p1/i;->n0:[B

    .line 2
    .line 3
    iget v1, p0, Lax/p1/i;->m0:I

    .line 4
    .line 5
    iput-object p1, p0, Lax/p1/i;->n0:[B

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    if-ne p2, p1, :cond_b

    .line 9
    .line 10
    iget p2, p0, Lax/p1/i;->l0:I

    .line 11
    .line 12
    :cond_b
    iput p2, p0, Lax/p1/i;->m0:I

    .line 13
    .line 14
    if-ne v1, p2, :cond_18

    .line 15
    .line 16
    iget-object p1, p0, Lax/p1/i;->n0:[B

    .line 17
    .line 18
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_18

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object p1, p0, Lax/p1/i;->n0:[B

    .line 26
    .line 27
    if-eqz p1, :cond_23

    .line 28
    .line 29
    iget p2, p0, Lax/p1/i;->m0:I

    .line 30
    .line 31
    invoke-static {p1, p2}, Lax/p1/f;->a([BI)Lax/p1/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_24

    .line 36
    :cond_23
    const/4 p1, 0x0

    .line 37
    :goto_24
    if-eqz p1, :cond_2d

    .line 38
    .line 39
    invoke-static {p1}, Lax/p1/g;->c(Lax/p1/e;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2d

    .line 44
    .line 45
    goto :goto_33

    .line 46
    :cond_2d
    iget p1, p0, Lax/p1/i;->m0:I

    .line 47
    .line 48
    invoke-static {p1}, Lax/p1/e;->b(I)Lax/p1/e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_33
    iget-object p2, p0, Lax/p1/i;->g0:Lax/S0/L;

    .line 53
    .line 54
    invoke-virtual {p2, p3, p4, p1}, Lax/S0/L;->a(JLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
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


# virtual methods
.method public b(J[F)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/p1/i;->e0:Lax/p1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lax/p1/c;->e(J[F)V

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

.method public c([FZ)V
    .registers 11

    .line 1
    const-string v1, "Failed to draw a frame"

    .line 2
    .line 3
    const-string v2, "SceneRenderer"

    .line 4
    .line 5
    const/16 v0, 0x4000

    .line 6
    .line 7
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 8
    .line 9
    .line 10
    :try_start_9
    invoke-static {}, Lax/S0/p;->b()V
    :try_end_c
    .catch Lax/S0/p$a; {:try_start_9 .. :try_end_c} :catch_d

    .line 11
    .line 12
    .line 13
    goto :goto_11

    .line 14
    :catch_d
    move-exception v0

    .line 15
    invoke-static {v2, v1, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    :goto_11
    iget-object v0, p0, Lax/p1/i;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_65

    .line 27
    .line 28
    iget-object v0, p0, Lax/p1/i;->k0:Landroid/graphics/SurfaceTexture;

    .line 29
    .line 30
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 37
    .line 38
    .line 39
    :try_start_26
    invoke-static {}, Lax/S0/p;->b()V
    :try_end_29
    .catch Lax/S0/p$a; {:try_start_26 .. :try_end_29} :catch_2a

    .line 40
    .line 41
    .line 42
    goto :goto_2e

    .line 43
    :catch_2a
    move-exception v0

    .line 44
    invoke-static {v2, v1, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_2e
    iget-object v0, p0, Lax/p1/i;->c0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3b

    .line 54
    .line 55
    iget-object v0, p0, Lax/p1/i;->h0:[F

    .line 56
    .line 57
    invoke-static {v0}, Lax/S0/p;->o([F)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    iget-object v0, p0, Lax/p1/i;->k0:Landroid/graphics/SurfaceTexture;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    iget-object v2, p0, Lax/p1/i;->f0:Lax/S0/L;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, Lax/S0/L;->g(J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/Long;

    .line 73
    .line 74
    if-eqz v2, :cond_56

    .line 75
    .line 76
    iget-object v3, p0, Lax/p1/i;->e0:Lax/p1/c;

    .line 77
    .line 78
    iget-object v4, p0, Lax/p1/i;->h0:[F

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    invoke-virtual {v3, v4, v5, v6}, Lax/p1/c;->c([FJ)Z

    .line 85
    .line 86
    .line 87
    :cond_56
    iget-object v2, p0, Lax/p1/i;->g0:Lax/S0/L;

    .line 88
    .line 89
    invoke-virtual {v2, v0, v1}, Lax/S0/L;->j(J)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lax/p1/e;

    .line 94
    .line 95
    if-eqz v0, :cond_65

    .line 96
    .line 97
    iget-object v1, p0, Lax/p1/i;->d0:Lax/p1/g;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Lax/p1/g;->d(Lax/p1/e;)V

    .line 100
    .line 101
    .line 102
    :cond_65
    iget-object v2, p0, Lax/p1/i;->i0:[F

    .line 103
    .line 104
    iget-object v6, p0, Lax/p1/i;->h0:[F

    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v5, 0x0

    .line 109
    move-object v4, p1

    .line 110
    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lax/p1/i;->d0:Lax/p1/g;

    .line 114
    .line 115
    iget v0, p0, Lax/p1/i;->j0:I

    .line 116
    .line 117
    iget-object v1, p0, Lax/p1/i;->i0:[F

    .line 118
    .line 119
    invoke-virtual {p1, v0, v1, p2}, Lax/p1/g;->a(I[FZ)V

    .line 120
    .line 121
    .line 122
    return-void
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
.end method

.method public d()Landroid/graphics/SurfaceTexture;
    .registers 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/high16 v1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    :try_start_4
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lax/S0/p;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/p1/i;->d0:Lax/p1/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/p1/g;->b()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/S0/p;->b()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lax/S0/p;->f()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lax/p1/i;->j0:I
    :try_end_18
    .catch Lax/S0/p$a; {:try_start_4 .. :try_end_18} :catch_19

    .line 24
    .line 25
    goto :goto_21

    .line 26
    :catch_19
    move-exception v0

    .line 27
    const-string v1, "SceneRenderer"

    .line 28
    .line 29
    const-string v2, "Failed to initialize the renderer"

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_21
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 35
    .line 36
    iget v1, p0, Lax/p1/i;->j0:I

    .line 37
    .line 38
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lax/p1/i;->k0:Landroid/graphics/SurfaceTexture;

    .line 42
    .line 43
    new-instance v1, Lax/p1/h;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lax/p1/h;-><init>(Lax/p1/i;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lax/p1/i;->k0:Landroid/graphics/SurfaceTexture;

    .line 52
    .line 53
    return-object v0
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

.method public e()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/p1/i;->f0:Lax/S0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/L;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/p1/i;->e0:Lax/p1/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/p1/c;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/p1/i;->c0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/p1/i;->l0:I

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

.method public g(JJLax/P0/v;Landroid/media/MediaFormat;)V
    .registers 7

    .line 1
    iget-object p6, p0, Lax/p1/i;->f0:Lax/S0/L;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p6, p3, p4, p1}, Lax/S0/L;->a(JLjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p5, Lax/P0/v;->C:[B

    .line 11
    .line 12
    iget p2, p5, Lax/P0/v;->D:I

    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, p4}, Lax/p1/i;->h([BIJ)V

    .line 15
    .line 16
    .line 17
    return-void
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
