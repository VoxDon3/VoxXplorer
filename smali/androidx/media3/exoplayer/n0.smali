.class final Landroidx/media3/exoplayer/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lax/i1/C$a;
.implements Lax/l1/J$a;
.implements Landroidx/media3/exoplayer/I0$d;
.implements Landroidx/media3/exoplayer/k$a;
.implements Landroidx/media3/exoplayer/K0$a;
.implements Landroidx/media3/exoplayer/g$a;
.implements Lax/o1/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/n0$f;,
        Landroidx/media3/exoplayer/n0$e;,
        Landroidx/media3/exoplayer/n0$h;,
        Landroidx/media3/exoplayer/n0$b;,
        Landroidx/media3/exoplayer/n0$c;,
        Landroidx/media3/exoplayer/n0$d;,
        Landroidx/media3/exoplayer/n0$g;
    }
.end annotation


# static fields
.field private static final k1:J


# instance fields
.field private final A0:Lax/S0/q;

.field private final B0:Z

.field private final C0:Landroidx/media3/exoplayer/g;

.field private D0:Lax/Y0/Z;

.field private E0:Lax/Y0/Y;

.field private F0:Lax/Y0/Z;

.field private G0:Z

.field private H0:Z

.field private I0:Landroidx/media3/exoplayer/n0$h;

.field private J0:Landroidx/media3/exoplayer/J0;

.field private K0:Landroidx/media3/exoplayer/n0$e;

.field private L0:Z

.field private M0:Z

.field private N0:Z

.field private O0:Z

.field private P0:J

.field private Q0:Z

.field private R0:I

.field private S0:Z

.field private T0:Z

.field private U0:Z

.field private V0:Z

.field private W0:I

.field private X0:Landroidx/media3/exoplayer/n0$h;

.field private Y0:J

.field private Z0:J

.field private a1:I

.field private b1:Z

.field private final c0:[Landroidx/media3/exoplayer/N0;

.field private c1:Landroidx/media3/exoplayer/s;

.field private final d0:[Z

.field private d1:J

.field private final e0:Lax/l1/J;

.field private e1:J

.field private final f0:Lax/l1/K;

.field private f1:Landroidx/media3/exoplayer/ExoPlayer$c;

.field private final g0:Landroidx/media3/exoplayer/o0;

.field private g1:Lax/P0/N;

.field private final h0:Lax/m1/e;

.field private h1:J

.field private final i0:Lax/S0/q;

.field private i1:Z

.field private final j0:Lax/Y0/T;

.field private j1:F

.field private final k0:Landroid/os/Looper;

.field private final l0:Lax/P0/N$c;

.field private final m0:Lax/P0/N$b;

.field private final n0:J

.field private final o0:Z

.field private final p0:Landroidx/media3/exoplayer/k;

.field private final q:[Landroidx/media3/exoplayer/O0;

.field private final q0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/n0$d;",
            ">;"
        }
    .end annotation
.end field

.field private final r0:Lax/S0/h;

.field private final s0:Landroidx/media3/exoplayer/n0$f;

.field private final t0:Landroidx/media3/exoplayer/t0;

.field private final u0:Landroidx/media3/exoplayer/I0;

.field private final v0:Lax/Y0/P;

.field private final w0:J

.field private final x0:Lax/Z0/I1;

.field private final y0:Z

.field private final z0:Lax/Z0/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Landroidx/media3/exoplayer/n0;->k1:J

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

.method public constructor <init>(Landroid/content/Context;[Landroidx/media3/exoplayer/M0;[Landroidx/media3/exoplayer/M0;Lax/l1/J;Lax/l1/K;Landroidx/media3/exoplayer/o0;Lax/m1/e;IZLax/Z0/a;Lax/Y0/Z;Lax/Y0/P;JZZLandroid/os/Looper;Lax/S0/h;Landroidx/media3/exoplayer/n0$f;Lax/Z0/I1;Lax/Y0/T;Landroidx/media3/exoplayer/ExoPlayer$c;Lax/o1/z;)V
    .registers 38

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p10

    move-wide/from16 v5, p13

    move-object/from16 v7, p18

    move-object/from16 v8, p20

    move-object/from16 v9, p22

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    iput-wide v10, p0, Landroidx/media3/exoplayer/n0;->h1:J

    move-object/from16 v12, p19

    .line 3
    iput-object v12, p0, Landroidx/media3/exoplayer/n0;->s0:Landroidx/media3/exoplayer/n0$f;

    .line 4
    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->e0:Lax/l1/J;

    move-object/from16 v12, p5

    .line 5
    iput-object v12, p0, Landroidx/media3/exoplayer/n0;->f0:Lax/l1/K;

    .line 6
    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 7
    iput-object v3, p0, Landroidx/media3/exoplayer/n0;->h0:Lax/m1/e;

    move/from16 v13, p8

    .line 8
    iput v13, p0, Landroidx/media3/exoplayer/n0;->R0:I

    move/from16 v13, p9

    .line 9
    iput-boolean v13, p0, Landroidx/media3/exoplayer/n0;->S0:Z

    move-object/from16 v13, p11

    .line 10
    iput-object v13, p0, Landroidx/media3/exoplayer/n0;->D0:Lax/Y0/Z;

    move-object/from16 v13, p12

    .line 11
    iput-object v13, p0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 12
    iput-wide v5, p0, Landroidx/media3/exoplayer/n0;->w0:J

    .line 13
    iput-wide v5, p0, Landroidx/media3/exoplayer/n0;->d1:J

    move/from16 v5, p15

    .line 14
    iput-boolean v5, p0, Landroidx/media3/exoplayer/n0;->M0:Z

    move/from16 v5, p16

    .line 15
    iput-boolean v5, p0, Landroidx/media3/exoplayer/n0;->y0:Z

    .line 16
    iput-object v7, p0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 17
    iput-object v8, p0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 18
    iput-object v9, p0, Landroidx/media3/exoplayer/n0;->f1:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 19
    iput-object v4, p0, Landroidx/media3/exoplayer/n0;->z0:Lax/Z0/a;

    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    iput v5, p0, Landroidx/media3/exoplayer/n0;->j1:F

    .line 21
    sget-object v5, Lax/Y0/Y;->i:Lax/Y0/Y;

    iput-object v5, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 22
    iput-wide v10, p0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 23
    iput-wide v10, p0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 24
    invoke-interface {v2, v8}, Landroidx/media3/exoplayer/o0;->j(Lax/Z0/I1;)J

    move-result-wide v5

    iput-wide v5, p0, Landroidx/media3/exoplayer/n0;->n0:J

    .line 25
    invoke-interface {v2, v8}, Landroidx/media3/exoplayer/o0;->c(Lax/Z0/I1;)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/media3/exoplayer/n0;->o0:Z

    .line 26
    sget-object v2, Lax/P0/N;->a:Lax/P0/N;

    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->g1:Lax/P0/N;

    .line 27
    invoke-static {v12}, Landroidx/media3/exoplayer/J0;->k(Lax/l1/K;)Landroidx/media3/exoplayer/J0;

    move-result-object v2

    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 28
    new-instance v5, Landroidx/media3/exoplayer/n0$e;

    invoke-direct {v5, v2}, Landroidx/media3/exoplayer/n0$e;-><init>(Landroidx/media3/exoplayer/J0;)V

    iput-object v5, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 29
    array-length v2, v0

    new-array v2, v2, [Landroidx/media3/exoplayer/N0;

    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->c0:[Landroidx/media3/exoplayer/N0;

    .line 30
    array-length v2, v0

    new-array v2, v2, [Z

    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->d0:[Z

    .line 31
    invoke-virtual {v1}, Lax/l1/J;->d()Landroidx/media3/exoplayer/N0$a;

    move-result-object v2

    .line 32
    array-length v5, v0

    new-array v5, v5, [Landroidx/media3/exoplayer/O0;

    iput-object v5, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 33
    :goto_8c
    array-length v10, v0

    const/4 v11, 0x1

    if-ge v5, v10, :cond_c0

    .line 34
    aget-object v10, v0, v5

    invoke-interface {v10, v5, v8, v7}, Landroidx/media3/exoplayer/M0;->m(ILax/Z0/I1;Lax/S0/h;)V

    .line 35
    iget-object v10, p0, Landroidx/media3/exoplayer/n0;->c0:[Landroidx/media3/exoplayer/N0;

    aget-object v12, v0, v5

    invoke-interface {v12}, Landroidx/media3/exoplayer/M0;->u()Landroidx/media3/exoplayer/N0;

    move-result-object v12

    aput-object v12, v10, v5

    if-eqz v2, :cond_a8

    .line 36
    iget-object v10, p0, Landroidx/media3/exoplayer/n0;->c0:[Landroidx/media3/exoplayer/N0;

    aget-object v10, v10, v5

    invoke-interface {v10, v2}, Landroidx/media3/exoplayer/N0;->v(Landroidx/media3/exoplayer/N0$a;)V

    .line 37
    :cond_a8
    aget-object v10, p3, v5

    if-eqz v10, :cond_b0

    .line 38
    invoke-interface {v10, v5, v8, v7}, Landroidx/media3/exoplayer/M0;->m(ILax/Z0/I1;Lax/S0/h;)V

    const/4 v6, 0x1

    .line 39
    :cond_b0
    iget-object v10, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    new-instance v11, Landroidx/media3/exoplayer/O0;

    aget-object v12, v0, v5

    aget-object v13, p3, v5

    invoke-direct {v11, v12, v13, v5}, Landroidx/media3/exoplayer/O0;-><init>(Landroidx/media3/exoplayer/M0;Landroidx/media3/exoplayer/M0;I)V

    aput-object v11, v10, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_8c

    .line 40
    :cond_c0
    iput-boolean v6, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 41
    new-instance v0, Landroidx/media3/exoplayer/k;

    invoke-direct {v0, p0, v7}, Landroidx/media3/exoplayer/k;-><init>(Landroidx/media3/exoplayer/k$a;Lax/S0/h;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Lax/P0/N$c;

    invoke-direct {v0}, Lax/P0/N$c;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 44
    new-instance v0, Lax/P0/N$b;

    invoke-direct {v0}, Lax/P0/N$b;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 45
    invoke-virtual {v1, p0, v3}, Lax/l1/J;->e(Lax/l1/J$a;Lax/m1/e;)V

    .line 46
    iput-boolean v11, p0, Landroidx/media3/exoplayer/n0;->b1:Z

    const/4 v0, 0x0

    move-object/from16 v1, p17

    .line 47
    invoke-interface {v7, v1, v0}, Lax/S0/h;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lax/S0/q;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->A0:Lax/S0/q;

    .line 48
    new-instance v1, Landroidx/media3/exoplayer/t0;

    new-instance v2, Landroidx/media3/exoplayer/l0;

    invoke-direct {v2, p0}, Landroidx/media3/exoplayer/l0;-><init>(Landroidx/media3/exoplayer/n0;)V

    invoke-direct {v1, v4, v0, v2, v9}, Landroidx/media3/exoplayer/t0;-><init>(Lax/Z0/a;Lax/S0/q;Landroidx/media3/exoplayer/q0$a;Landroidx/media3/exoplayer/ExoPlayer$c;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 49
    new-instance v1, Landroidx/media3/exoplayer/I0;

    invoke-direct {v1, p0, v4, v0, v8}, Landroidx/media3/exoplayer/I0;-><init>(Landroidx/media3/exoplayer/I0$d;Lax/Z0/a;Lax/S0/q;Lax/Z0/I1;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    if-nez p21, :cond_107

    .line 50
    new-instance v0, Lax/Y0/T;

    invoke-direct {v0}, Lax/Y0/T;-><init>()V

    goto :goto_109

    :cond_107
    move-object/from16 v0, p21

    :goto_109
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->j0:Lax/Y0/T;

    .line 51
    invoke-virtual {v0}, Lax/Y0/T;->a()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

    .line 52
    invoke-interface {v7, v0, p0}, Lax/S0/h;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lax/S0/q;

    move-result-object v1

    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 53
    new-instance v2, Landroidx/media3/exoplayer/g;

    invoke-direct {v2, p1, v0, p0}, Landroidx/media3/exoplayer/g;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroidx/media3/exoplayer/g$a;)V

    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 54
    new-instance p1, Landroidx/media3/exoplayer/m0;

    move-object/from16 v0, p23

    invoke-direct {p1, p0, v0}, Landroidx/media3/exoplayer/m0;-><init>(Landroidx/media3/exoplayer/n0;Lax/o1/z;)V

    const/16 v0, 0x23

    .line 55
    invoke-interface {v1, v0, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    move-result-object p1

    .line 56
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    return-void
.end method

.method private A(Landroidx/media3/exoplayer/K0;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    :try_start_8
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->f()Landroidx/media3/exoplayer/K0$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->h()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/K0$b;->B(ILjava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_8 .. :try_end_17} :catchall_1b

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_1b
    move-exception v1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 30
    .line 31
    .line 32
    throw v1
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

.method private A0()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_24

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, v0, :cond_24

    .line 16
    .line 17
    iget-boolean v0, v0, Landroidx/media3/exoplayer/q0;->i:Z

    .line 18
    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    goto :goto_24

    .line 22
    :cond_15
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->i2()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_24

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, v0, Landroidx/media3/exoplayer/q0;->i:Z

    .line 36
    .line 37
    :cond_24
    :goto_24
    return-void
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

.method private B()V
    .registers 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_30

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_30

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_f
    if-ge v2, v1, :cond_29

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->h()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget-object v5, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 25
    .line 26
    invoke-virtual {v3, v5}, Landroidx/media3/exoplayer/O0;->c(Landroidx/media3/exoplayer/k;)V

    .line 27
    .line 28
    .line 29
    iget v5, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 30
    .line 31
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->h()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v4, v3

    .line 36
    sub-int/2addr v5, v4

    .line 37
    iput v5, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_f

    .line 42
    :cond_29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide v0, p0, Landroidx/media3/exoplayer/n0;->h1:J

    .line 48
    .line 49
    :cond_30
    :goto_30
    return-void
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

.method private B0()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/I0;->i()Lax/P0/N;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

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

.method private B1(Lax/Y0/Y;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->w()V

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
.end method

.method private C(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/O0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 10
    .line 11
    aget-object v1, v1, p1

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/O0;->b(Landroidx/media3/exoplayer/k;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p0, p1, v1}, Landroidx/media3/exoplayer/n0;->s0(IZ)V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 23
    .line 24
    sub-int/2addr p1, v0

    .line 25
    iput p1, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 26
    .line 27
    return-void
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

.method private C0(Landroidx/media3/exoplayer/n0$c;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 8
    .line 9
    iget v1, p1, Landroidx/media3/exoplayer/n0$c;->a:I

    .line 10
    .line 11
    iget v2, p1, Landroidx/media3/exoplayer/n0$c;->b:I

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/n0$c;->c:I

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/media3/exoplayer/n0$c;->d:Lax/i1/g0;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/media3/exoplayer/I0;->v(IIILax/i1/g0;)Lax/P0/N;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method private D()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_c

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->C(I)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_c
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Landroidx/media3/exoplayer/n0;->h1:J

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private D0()V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    if-eqz v0, :cond_21

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lax/l1/K;->c:[Lax/l1/D;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_10
    if-ge v3, v2, :cond_1c

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_19

    .line 22
    .line 23
    invoke-interface {v4}, Lax/l1/D;->r()V

    .line 24
    .line 25
    .line 26
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_10

    .line 29
    :cond_1c
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_6

    .line 34
    :cond_21
    return-void
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

.method private D1(Lax/Y0/Z;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->D0:Lax/Y0/Z;

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

.method private E()V
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 4
    .line 5
    invoke-interface {v1}, Lax/S0/h;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-interface {v3, v4}, Lax/S0/q;->i(I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->Z1()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    iget v3, v3, Landroidx/media3/exoplayer/J0;->e:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v3, v5, :cond_1cc

    .line 24
    .line 25
    const/4 v6, 0x4

    .line 26
    if-ne v3, v6, :cond_1d

    .line 27
    .line 28
    goto/16 :goto_1cc

    .line 29
    .line 30
    :cond_1d
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_29

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/n0;->Z0(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    const-string v7, "doSomeWork"

    .line 43
    .line 44
    invoke-static {v7}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->e2()V

    .line 48
    .line 49
    .line 50
    iget-boolean v7, v3, Landroidx/media3/exoplayer/q0;->f:Z

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v7, :cond_8c

    .line 54
    .line 55
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 56
    .line 57
    invoke-interface {v7}, Lax/S0/h;->b()J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    invoke-static {v9, v10}, Lax/S0/d0;->a1(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    iput-wide v9, v0, Landroidx/media3/exoplayer/n0;->Z0:J

    .line 66
    .line 67
    iget-object v7, v3, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 68
    .line 69
    iget-object v9, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 70
    .line 71
    iget-wide v9, v9, Landroidx/media3/exoplayer/J0;->s:J

    .line 72
    .line 73
    iget-wide v11, v0, Landroidx/media3/exoplayer/n0;->n0:J

    .line 74
    .line 75
    sub-long/2addr v9, v11

    .line 76
    iget-boolean v11, v0, Landroidx/media3/exoplayer/n0;->o0:Z

    .line 77
    .line 78
    invoke-interface {v7, v9, v10, v11}, Lax/i1/C;->v(JZ)V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v9, 0x1

    .line 83
    const/4 v10, 0x1

    .line 84
    :goto_53
    iget-object v11, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 85
    .line 86
    array-length v12, v11

    .line 87
    if-ge v7, v12, :cond_93

    .line 88
    .line 89
    aget-object v11, v11, v7

    .line 90
    .line 91
    invoke-virtual {v11}, Landroidx/media3/exoplayer/O0;->h()I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-nez v12, :cond_64

    .line 96
    .line 97
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/n0;->s0(IZ)V

    .line 98
    .line 99
    .line 100
    goto :goto_89

    .line 101
    :cond_64
    iget-wide v12, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 102
    .line 103
    iget-wide v14, v0, Landroidx/media3/exoplayer/n0;->Z0:J

    .line 104
    .line 105
    invoke-virtual {v11, v12, v13, v14, v15}, Landroidx/media3/exoplayer/O0;->I(JJ)V

    .line 106
    .line 107
    .line 108
    if-eqz v9, :cond_75

    .line 109
    .line 110
    invoke-virtual {v11}, Landroidx/media3/exoplayer/O0;->t()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_75

    .line 115
    .line 116
    const/4 v9, 0x1

    .line 117
    goto :goto_76

    .line 118
    :cond_75
    const/4 v9, 0x0

    .line 119
    :goto_76
    invoke-virtual {v11, v3}, Landroidx/media3/exoplayer/O0;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-direct {v0, v7, v11}, Landroidx/media3/exoplayer/n0;->s0(IZ)V

    .line 124
    .line 125
    .line 126
    if-eqz v10, :cond_83

    .line 127
    .line 128
    if-eqz v11, :cond_83

    .line 129
    .line 130
    const/4 v10, 0x1

    .line 131
    goto :goto_84

    .line 132
    :cond_83
    const/4 v10, 0x0

    .line 133
    :goto_84
    if-nez v11, :cond_89

    .line 134
    .line 135
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/n0;->r0(I)V

    .line 136
    .line 137
    .line 138
    :cond_89
    :goto_89
    add-int/lit8 v7, v7, 0x1

    .line 139
    .line 140
    goto :goto_53

    .line 141
    :cond_8c
    iget-object v7, v3, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 142
    .line 143
    invoke-interface {v7}, Lax/i1/C;->l()V

    .line 144
    .line 145
    .line 146
    const/4 v9, 0x1

    .line 147
    const/4 v10, 0x1

    .line 148
    :cond_93
    iget-object v7, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 149
    .line 150
    iget-wide v11, v7, Landroidx/media3/exoplayer/r0;->e:J

    .line 151
    .line 152
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    if-eqz v9, :cond_b3

    .line 158
    .line 159
    iget-boolean v7, v3, Landroidx/media3/exoplayer/q0;->f:Z

    .line 160
    .line 161
    if-eqz v7, :cond_b3

    .line 162
    .line 163
    cmp-long v7, v11, v13

    .line 164
    .line 165
    if-eqz v7, :cond_b0

    .line 166
    .line 167
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 168
    .line 169
    move-wide v15, v13

    .line 170
    iget-wide v13, v7, Landroidx/media3/exoplayer/J0;->s:J

    .line 171
    .line 172
    cmp-long v7, v11, v13

    .line 173
    .line 174
    if-gtz v7, :cond_b4

    .line 175
    .line 176
    goto :goto_b1

    .line 177
    :cond_b0
    move-wide v15, v13

    .line 178
    :goto_b1
    const/4 v7, 0x1

    .line 179
    goto :goto_b5

    .line 180
    :cond_b3
    move-wide v15, v13

    .line 181
    :cond_b4
    const/4 v7, 0x0

    .line 182
    :goto_b5
    if-eqz v7, :cond_c5

    .line 183
    .line 184
    iget-boolean v9, v0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 185
    .line 186
    if-eqz v9, :cond_c5

    .line 187
    .line 188
    iput-boolean v8, v0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 189
    .line 190
    iget-object v9, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 191
    .line 192
    iget v9, v9, Landroidx/media3/exoplayer/J0;->n:I

    .line 193
    .line 194
    const/4 v11, 0x5

    .line 195
    invoke-direct {v0, v8, v9, v8, v11}, Landroidx/media3/exoplayer/n0;->s1(ZIZI)V

    .line 196
    .line 197
    .line 198
    :cond_c5
    const/4 v9, 0x3

    .line 199
    if-eqz v7, :cond_d5

    .line 200
    .line 201
    iget-object v7, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 202
    .line 203
    iget-boolean v7, v7, Landroidx/media3/exoplayer/r0;->j:Z

    .line 204
    .line 205
    if-eqz v7, :cond_d5

    .line 206
    .line 207
    invoke-direct {v0, v6}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->V1()V

    .line 211
    .line 212
    .line 213
    goto :goto_125

    .line 214
    :cond_d5
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 215
    .line 216
    iget v7, v7, Landroidx/media3/exoplayer/J0;->e:I

    .line 217
    .line 218
    if-ne v7, v4, :cond_f9

    .line 219
    .line 220
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/n0;->Q1(Z)Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_f9

    .line 225
    .line 226
    invoke-direct {v0, v9}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 227
    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    iput-object v7, v0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 231
    .line 232
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_125

    .line 237
    .line 238
    invoke-direct {v0, v8, v8}, Landroidx/media3/exoplayer/n0;->h2(ZZ)V

    .line 239
    .line 240
    .line 241
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 242
    .line 243
    invoke-virtual {v7}, Landroidx/media3/exoplayer/k;->f()V

    .line 244
    .line 245
    .line 246
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->S1()V

    .line 247
    .line 248
    .line 249
    goto :goto_125

    .line 250
    :cond_f9
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 251
    .line 252
    iget v7, v7, Landroidx/media3/exoplayer/J0;->e:I

    .line 253
    .line 254
    if-ne v7, v9, :cond_125

    .line 255
    .line 256
    iget v7, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 257
    .line 258
    if-nez v7, :cond_10a

    .line 259
    .line 260
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->k0()Z

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    if-eqz v7, :cond_10c

    .line 265
    .line 266
    goto :goto_125

    .line 267
    :cond_10a
    if-nez v10, :cond_125

    .line 268
    .line 269
    :cond_10c
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/n0;->h2(ZZ)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v4}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 277
    .line 278
    .line 279
    iget-boolean v7, v0, Landroidx/media3/exoplayer/n0;->O0:Z

    .line 280
    .line 281
    if-eqz v7, :cond_122

    .line 282
    .line 283
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->F0()V

    .line 284
    .line 285
    .line 286
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 287
    .line 288
    invoke-interface {v7}, Lax/Y0/P;->c()V

    .line 289
    .line 290
    .line 291
    :cond_122
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->V1()V

    .line 292
    .line 293
    .line 294
    :cond_125
    :goto_125
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 295
    .line 296
    iget v7, v7, Landroidx/media3/exoplayer/J0;->e:I

    .line 297
    .line 298
    if-ne v7, v4, :cond_187

    .line 299
    .line 300
    const/4 v7, 0x0

    .line 301
    :goto_12c
    iget-object v10, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 302
    .line 303
    array-length v11, v10

    .line 304
    if-ge v7, v11, :cond_13f

    .line 305
    .line 306
    aget-object v10, v10, v7

    .line 307
    .line 308
    invoke-virtual {v10, v3}, Landroidx/media3/exoplayer/O0;->x(Landroidx/media3/exoplayer/q0;)Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_13c

    .line 313
    .line 314
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/n0;->r0(I)V

    .line 315
    .line 316
    .line 317
    :cond_13c
    add-int/lit8 v7, v7, 0x1

    .line 318
    .line 319
    goto :goto_12c

    .line 320
    :cond_13f
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 321
    .line 322
    iget-boolean v7, v3, Landroidx/media3/exoplayer/J0;->g:Z

    .line 323
    .line 324
    if-nez v7, :cond_187

    .line 325
    .line 326
    iget-wide v10, v3, Landroidx/media3/exoplayer/J0;->r:J

    .line 327
    .line 328
    const-wide/32 v12, 0x7a120

    .line 329
    .line 330
    .line 331
    cmp-long v3, v10, v12

    .line 332
    .line 333
    if-gez v3, :cond_187

    .line 334
    .line 335
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 336
    .line 337
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/n0;->i0(Landroidx/media3/exoplayer/q0;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_187

    .line 346
    .line 347
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_187

    .line 352
    .line 353
    iget-wide v10, v0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 354
    .line 355
    cmp-long v3, v10, v15

    .line 356
    .line 357
    if-nez v3, :cond_16f

    .line 358
    .line 359
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 360
    .line 361
    invoke-interface {v3}, Lax/S0/h;->b()J

    .line 362
    .line 363
    .line 364
    move-result-wide v10

    .line 365
    iput-wide v10, v0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 366
    .line 367
    goto :goto_18a

    .line 368
    :cond_16f
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 369
    .line 370
    invoke-interface {v3}, Lax/S0/h;->b()J

    .line 371
    .line 372
    .line 373
    move-result-wide v10

    .line 374
    iget-wide v12, v0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 375
    .line 376
    sub-long/2addr v10, v12

    .line 377
    const-wide/16 v12, 0xfa0

    .line 378
    .line 379
    cmp-long v3, v10, v12

    .line 380
    .line 381
    if-gez v3, :cond_17f

    .line 382
    .line 383
    goto :goto_18a

    .line 384
    :cond_17f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v2, "Playback stuck buffering and not loading"

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v1

    .line 392
    :cond_187
    move-wide v10, v15

    .line 393
    iput-wide v10, v0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 394
    .line 395
    :goto_18a
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_198

    .line 400
    .line 401
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 402
    .line 403
    iget v3, v3, Landroidx/media3/exoplayer/J0;->e:I

    .line 404
    .line 405
    if-ne v3, v9, :cond_198

    .line 406
    .line 407
    const/4 v3, 0x1

    .line 408
    goto :goto_199

    .line 409
    :cond_198
    const/4 v3, 0x0

    .line 410
    :goto_199
    iget-boolean v7, v0, Landroidx/media3/exoplayer/n0;->V0:Z

    .line 411
    .line 412
    if-eqz v7, :cond_1a4

    .line 413
    .line 414
    iget-boolean v7, v0, Landroidx/media3/exoplayer/n0;->U0:Z

    .line 415
    .line 416
    if-eqz v7, :cond_1a4

    .line 417
    .line 418
    if-eqz v3, :cond_1a4

    .line 419
    .line 420
    goto :goto_1a5

    .line 421
    :cond_1a4
    const/4 v5, 0x0

    .line 422
    :goto_1a5
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 423
    .line 424
    iget-boolean v10, v7, Landroidx/media3/exoplayer/J0;->p:Z

    .line 425
    .line 426
    if-eq v10, v5, :cond_1b1

    .line 427
    .line 428
    invoke-virtual {v7, v5}, Landroidx/media3/exoplayer/J0;->i(Z)Landroidx/media3/exoplayer/J0;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    iput-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 433
    .line 434
    :cond_1b1
    iput-boolean v8, v0, Landroidx/media3/exoplayer/n0;->U0:Z

    .line 435
    .line 436
    if-nez v5, :cond_1c9

    .line 437
    .line 438
    iget-object v5, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 439
    .line 440
    iget v5, v5, Landroidx/media3/exoplayer/J0;->e:I

    .line 441
    .line 442
    if-ne v5, v6, :cond_1bc

    .line 443
    .line 444
    goto :goto_1c9

    .line 445
    :cond_1bc
    if-nez v3, :cond_1c6

    .line 446
    .line 447
    if-eq v5, v4, :cond_1c6

    .line 448
    .line 449
    if-ne v5, v9, :cond_1c9

    .line 450
    .line 451
    iget v3, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 452
    .line 453
    if-eqz v3, :cond_1c9

    .line 454
    .line 455
    :cond_1c6
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/n0;->Z0(J)V

    .line 456
    .line 457
    .line 458
    :cond_1c9
    :goto_1c9
    invoke-static {}, Lax/S0/N;->b()V

    .line 459
    .line 460
    .line 461
    :cond_1cc
    :goto_1cc
    return-void
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private E0(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    if-eqz v0, :cond_21

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lax/l1/K;->c:[Lax/l1/D;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_10
    if-ge v3, v2, :cond_1c

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_19

    .line 22
    .line 23
    invoke-interface {v4, p1}, Lax/l1/D;->g(Z)V

    .line 24
    .line 25
    .line 26
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_10

    .line 29
    :cond_1c
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_6

    .line 34
    :cond_21
    return-void
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

.method private F(Landroidx/media3/exoplayer/q0;IZJ)V
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 6
    .line 7
    aget-object v3, v2, p2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->y()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_f

    .line 14
    .line 15
    goto :goto_72

    .line 16
    :cond_f
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    if-ne v1, v2, :cond_1b

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v10, 0x0

    .line 29
    :goto_1c
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v6, v2, Lax/l1/K;->b:[Lax/Y0/W;

    .line 34
    .line 35
    aget-object v6, v6, p2

    .line 36
    .line 37
    iget-object v2, v2, Lax/l1/K;->c:[Lax/l1/D;

    .line 38
    .line 39
    aget-object v2, v2, p2

    .line 40
    .line 41
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_38

    .line 46
    .line 47
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 48
    .line 49
    iget v7, v7, Landroidx/media3/exoplayer/J0;->e:I

    .line 50
    .line 51
    const/4 v8, 0x3

    .line 52
    if-ne v7, v8, :cond_38

    .line 53
    .line 54
    const/16 v17, 0x1

    .line 55
    .line 56
    goto :goto_3a

    .line 57
    :cond_38
    const/16 v17, 0x0

    .line 58
    .line 59
    :goto_3a
    if-nez p3, :cond_40

    .line 60
    .line 61
    if-eqz v17, :cond_40

    .line 62
    .line 63
    const/4 v9, 0x1

    .line 64
    goto :goto_41

    .line 65
    :cond_40
    const/4 v9, 0x0

    .line 66
    :goto_41
    iget v4, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 67
    .line 68
    add-int/2addr v4, v5

    .line 69
    iput v4, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 70
    .line 71
    iget-object v4, v1, Landroidx/media3/exoplayer/q0;->c:[Lax/i1/e0;

    .line 72
    .line 73
    aget-object v4, v4, p2

    .line 74
    .line 75
    iget-wide v7, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 76
    .line 77
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->m()J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    iget-object v5, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 82
    .line 83
    iget-object v15, v5, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 84
    .line 85
    iget-object v5, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 86
    .line 87
    move-object v11, v6

    .line 88
    move-object v6, v4

    .line 89
    move-object v4, v11

    .line 90
    move-wide/from16 v11, p4

    .line 91
    .line 92
    move-object/from16 v16, v5

    .line 93
    .line 94
    move-object v5, v2

    .line 95
    invoke-virtual/range {v3 .. v16}, Landroidx/media3/exoplayer/O0;->e(Lax/Y0/W;Lax/l1/D;Lax/i1/e0;JZZJJLax/i1/F$b;Landroidx/media3/exoplayer/k;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Landroidx/media3/exoplayer/n0$a;

    .line 99
    .line 100
    invoke-direct {v2, v0}, Landroidx/media3/exoplayer/n0$a;-><init>(Landroidx/media3/exoplayer/n0;)V

    .line 101
    .line 102
    .line 103
    const/16 v4, 0xb

    .line 104
    .line 105
    invoke-virtual {v3, v4, v2, v1}, Landroidx/media3/exoplayer/O0;->n(ILjava/lang/Object;Landroidx/media3/exoplayer/q0;)V

    .line 106
    .line 107
    .line 108
    if-eqz v17, :cond_72

    .line 109
    .line 110
    if-eqz v10, :cond_72

    .line 111
    .line 112
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->W()V

    .line 113
    .line 114
    .line 115
    :cond_72
    :goto_72
    return-void
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

.method private F0()V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    if-eqz v0, :cond_21

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lax/l1/K;->c:[Lax/l1/D;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_10
    if-ge v3, v2, :cond_1c

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_19

    .line 22
    .line 23
    invoke-interface {v4}, Lax/l1/D;->s()V

    .line 24
    .line 25
    .line 26
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_10

    .line 29
    :cond_1c
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_6

    .line 34
    :cond_21
    return-void
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

.method private F1(Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/t0;->Y(Lax/P0/N;Z)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int/lit8 v0, p1, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->b1(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_1c

    .line 22
    :cond_15
    and-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_1c

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    :goto_1c
    const/4 p1, 0x0

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method private G()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [Z

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->n()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/n0;->H([ZJ)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private G1(Lax/i1/g0;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/I0;->D(Lax/i1/g0;)Lax/P0/N;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private H([ZJ)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_c
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 14
    .line 15
    array-length v4, v4

    .line 16
    if-ge v3, v4, :cond_21

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Lax/l1/K;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_1e

    .line 23
    .line 24
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 25
    .line 26
    aget-object v4, v4, v3

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/media3/exoplayer/O0;->L()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_c

    .line 34
    :cond_21
    const/4 v3, 0x0

    .line 35
    :goto_22
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 36
    .line 37
    array-length v1, v1

    .line 38
    if-ge v3, v1, :cond_44

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lax/l1/K;->c(I)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3f

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 47
    .line 48
    aget-object v1, v1, v3

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/O0;->x(Landroidx/media3/exoplayer/q0;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3f

    .line 55
    .line 56
    aget-boolean v4, p1, v3

    .line 57
    .line 58
    move-object v1, p0

    .line 59
    move-wide v5, p2

    .line 60
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/n0;->F(Landroidx/media3/exoplayer/q0;IZJ)V

    .line 61
    .line 62
    .line 63
    goto :goto_40

    .line 64
    :cond_3f
    move-wide v5, p2

    .line 65
    :goto_40
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    move-wide p2, v5

    .line 68
    goto :goto_22

    .line 69
    :cond_44
    return-void
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
.end method

.method private H1(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_26

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_10

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Landroidx/media3/exoplayer/n0;->e1:J

    .line 16
    .line 17
    :cond_10
    const/4 v1, 0x3

    .line 18
    if-eq p1, v1, :cond_1e

    .line 19
    .line 20
    iget-boolean v1, v0, Landroidx/media3/exoplayer/J0;->p:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1e

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/J0;->i(Z)Landroidx/media3/exoplayer/J0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/J0;->h(I)Landroidx/media3/exoplayer/J0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 38
    .line 39
    :cond_26
    return-void
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

.method private I0()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0, v0, v1}, Landroidx/media3/exoplayer/n0;->Q0(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/o0;->i(Lax/Z0/I1;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x2

    .line 27
    if-eqz v0, :cond_1e

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v0, 0x2

    .line 32
    :goto_1f
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->b2()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->h0:Lax/m1/e;

    .line 41
    .line 42
    invoke-interface {v2}, Lax/m1/e;->d()Lax/U0/z;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/I0;->w(Lax/U0/z;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lax/S0/q;->f(I)Z

    .line 52
    .line 53
    .line 54
    return-void
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

.method private I1(Lax/o1/z;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_e

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/O0;->T(Lax/o1/z;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private J([Lax/l1/D;)Lax/r7/z;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lax/l1/D;",
            ")",
            "Lax/r7/z<",
            "Lax/P0/C;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/r7/z$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/r7/z$a;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_9
    if-ge v3, v1, :cond_29

    .line 11
    .line 12
    aget-object v5, p1, v3

    .line 13
    .line 14
    if-eqz v5, :cond_26

    .line 15
    .line 16
    invoke-interface {v5, v2}, Lax/l1/H;->h(I)Lax/P0/v;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object v5, v5, Lax/P0/v;->l:Lax/P0/C;

    .line 21
    .line 22
    if-nez v5, :cond_22

    .line 23
    .line 24
    new-instance v5, Lax/P0/C;

    .line 25
    .line 26
    new-array v6, v2, [Lax/P0/C$a;

    .line 27
    .line 28
    invoke-direct {v5, v6}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 32
    .line 33
    .line 34
    goto :goto_26

    .line 35
    :cond_22
    invoke-virtual {v0, v5}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    :cond_26
    :goto_26
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_9

    .line 42
    :cond_29
    if-eqz v4, :cond_30

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_30
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private K()J
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 6
    .line 7
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v3, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 10
    .line 11
    invoke-direct {p0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/n0;->M(Lax/P0/N;Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private K0(Lax/S0/k;)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    :try_start_3
    invoke-direct {p0, v2, v1, v2, v1}, Landroidx/media3/exoplayer/n0;->Q0(ZZZZ)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->L0()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 11
    .line 12
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 13
    .line 14
    invoke-interface {v1, v3}, Landroidx/media3/exoplayer/o0;->f(Lax/Z0/I1;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/g;->h()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->e0:Lax/l1/J;

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/l1/J;->j()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/n0;->H1(I)V
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_2b

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lax/S0/q;->k(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->j0:Lax/Y0/T;

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/Y0/T;->b()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lax/S0/k;->f()Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_2b
    move-exception v1

    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Lax/S0/q;->k(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->j0:Lax/Y0/T;

    .line 51
    .line 52
    invoke-virtual {v0}, Lax/Y0/T;->b()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lax/S0/k;->f()Z

    .line 56
    .line 57
    .line 58
    throw v1
    .line 59
    .line 60
    .line 61
.end method

.method private K1(Ljava/lang/Object;Lax/S0/k;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_e

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/O0;->U(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_e
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 16
    .line 17
    iget p1, p1, Landroidx/media3/exoplayer/J0;->e:I

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq p1, v0, :cond_18

    .line 22
    .line 23
    if-ne p1, v1, :cond_1d

    .line 24
    .line 25
    :cond_18
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lax/S0/q;->f(I)Z

    .line 28
    .line 29
    .line 30
    :cond_1d
    if-eqz p2, :cond_22

    .line 31
    .line 32
    invoke-virtual {p2}, Lax/S0/k;->f()Z

    .line 33
    .line 34
    .line 35
    :cond_22
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private L()J
    .registers 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_a

    .line 7
    .line 8
    const-wide/16 v0, 0x3e8

    .line 9
    .line 10
    goto :goto_c

    .line 11
    :cond_a
    sget-wide v0, Landroidx/media3/exoplayer/n0;->k1:J

    .line 12
    .line 13
    :goto_c
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_10
    if-ge v4, v3, :cond_27

    .line 18
    .line 19
    aget-object v5, v2, v4

    .line 20
    .line 21
    iget-wide v6, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 22
    .line 23
    iget-wide v8, p0, Landroidx/media3/exoplayer/n0;->Z0:J

    .line 24
    .line 25
    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/media3/exoplayer/O0;->j(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    invoke-static {v5, v6}, Lax/S0/d0;->E1(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_10

    .line 40
    :cond_27
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/media3/exoplayer/J0;->n()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_65

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_42

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_43

    .line 67
    :cond_42
    const/4 v2, 0x0

    .line 68
    :goto_43
    if-eqz v2, :cond_65

    .line 69
    .line 70
    iget-wide v3, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 71
    .line 72
    long-to-float v3, v3

    .line 73
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    long-to-float v4, v4

    .line 78
    iget-object v5, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 79
    .line 80
    iget-object v5, v5, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 81
    .line 82
    iget v5, v5, Lax/P0/G;->a:F

    .line 83
    .line 84
    mul-float v4, v4, v5

    .line 85
    .line 86
    add-float/2addr v3, v4

    .line 87
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->n()J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    long-to-float v2, v4

    .line 92
    cmpl-float v2, v3, v2

    .line 93
    .line 94
    if-ltz v2, :cond_65

    .line 95
    .line 96
    sget-wide v2, Landroidx/media3/exoplayer/n0;->k1:J

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    :cond_65
    return-wide v0
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private L0()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_17

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->c0:[Landroidx/media3/exoplayer/N0;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/media3/exoplayer/N0;->l()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/O0;->H()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_17
    return-void
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

.method private M(Lax/P0/N;Ljava/lang/Object;J)J
    .registers 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lax/P0/N$b;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 15
    .line 16
    iget-wide v0, p1, Lax/P0/N$c;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_3d

    .line 26
    .line 27
    invoke-virtual {p1}, Lax/P0/N$c;->f()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_3d

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 34
    .line 35
    iget-boolean p2, p1, Lax/P0/N$c;->i:Z

    .line 36
    .line 37
    if-nez p2, :cond_27

    .line 38
    .line 39
    goto :goto_3d

    .line 40
    :cond_27
    invoke-virtual {p1}, Lax/P0/N$c;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 45
    .line 46
    iget-wide v0, v0, Lax/P0/N$c;->f:J

    .line 47
    .line 48
    sub-long/2addr p1, v0

    .line 49
    invoke-static {p1, p2}, Lax/S0/d0;->a1(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 54
    .line 55
    invoke-virtual {v0}, Lax/P0/N$b;->o()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_3d
    :goto_3d
    return-wide v2
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

.method private M0(IILax/i1/g0;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/I0;->A(IILax/i1/g0;)Lax/P0/N;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

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
.end method

.method private M1(F)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/n0;->j1:F

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/g;->f()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-float p1, p1, v0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_e
    if-ge v2, v1, :cond_18

    .line 16
    .line 17
    aget-object v3, v0, v2

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/O0;->V(F)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_e

    .line 25
    :cond_18
    return-void
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

.method private N(Landroidx/media3/exoplayer/q0;)J
    .registers 10

    .line 1
    if-nez p1, :cond_5

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_5
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0;->m()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-boolean v2, p1, Landroidx/media3/exoplayer/q0;->f:Z

    .line 11
    .line 12
    if-nez v2, :cond_e

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_e
    const/4 v2, 0x0

    .line 16
    :goto_f
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 17
    .line 18
    array-length v4, v3

    .line 19
    if-ge v2, v4, :cond_33

    .line 20
    .line 21
    aget-object v3, v3, v2

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/O0;->x(Landroidx/media3/exoplayer/q0;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1d

    .line 28
    .line 29
    goto :goto_30

    .line 30
    :cond_1d
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 31
    .line 32
    aget-object v3, v3, v2

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroidx/media3/exoplayer/O0;->k(Landroidx/media3/exoplayer/q0;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    const-wide/high16 v5, -0x8000000000000000L

    .line 39
    .line 40
    cmp-long v7, v3, v5

    .line 41
    .line 42
    if-nez v7, :cond_2c

    .line 43
    .line 44
    return-wide v5

    .line 45
    :cond_2c
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :goto_30
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_f

    .line 52
    :cond_33
    return-wide v0
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

.method private N1()Z
    .registers 8

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return v1

    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2c

    .line 28
    .line 29
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->n()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v6, v2, v4

    .line 36
    .line 37
    if-ltz v6, :cond_2c

    .line 38
    .line 39
    iget-boolean v0, v0, Landroidx/media3/exoplayer/q0;->i:Z

    .line 40
    .line 41
    if-eqz v0, :cond_2c

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :cond_2c
    return v1
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

.method private O(Lax/P0/N;)Landroid/util/Pair;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/N;",
            ")",
            "Landroid/util/Pair<",
            "Lax/i1/F$b;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/P0/N;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_15

    .line 8
    .line 9
    invoke-static {}, Landroidx/media3/exoplayer/J0;->l()Lax/i1/F$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_15
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lax/P0/N;->a(Z)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 29
    .line 30
    iget-object v5, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 31
    .line 32
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 43
    .line 44
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/media3/exoplayer/t0;->Q(Lax/P0/N;Ljava/lang/Object;J)Lax/i1/F$b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_59

    .line 63
    .line 64
    iget-object p1, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 67
    .line 68
    invoke-virtual {v3, p1, v4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 69
    .line 70
    .line 71
    iget p1, v0, Lax/i1/F$b;->c:I

    .line 72
    .line 73
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 74
    .line 75
    iget v4, v0, Lax/i1/F$b;->b:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Lax/P0/N$b;->l(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne p1, v3, :cond_58

    .line 82
    .line 83
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 84
    .line 85
    invoke-virtual {p1}, Lax/P0/N$b;->g()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    :cond_58
    move-wide v4, v1

    .line 90
    :cond_59
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
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

.method private O0()V
    .registers 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lax/P0/G;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 18
    .line 19
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    :goto_19
    if-eqz v2, :cond_13c

    .line 27
    .line 28
    iget-boolean v6, v2, Landroidx/media3/exoplayer/q0;->f:Z

    .line 29
    .line 30
    if-nez v6, :cond_21

    .line 31
    .line 32
    goto/16 :goto_13c

    .line 33
    .line 34
    :cond_21
    iget-object v6, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 35
    .line 36
    iget-object v7, v6, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 37
    .line 38
    iget-boolean v6, v6, Landroidx/media3/exoplayer/J0;->l:Z

    .line 39
    .line 40
    invoke-virtual {v2, v1, v7, v6}, Landroidx/media3/exoplayer/q0;->z(FLax/P0/N;Z)Lax/l1/K;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 45
    .line 46
    invoke-virtual {v7}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-ne v2, v7, :cond_34

    .line 51
    .line 52
    move-object v4, v6

    .line 53
    :cond_34
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, Lax/l1/K;->a(Lax/l1/K;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/4 v11, 0x0

    .line 62
    if-nez v7, :cond_133

    .line 63
    .line 64
    const/4 v12, 0x4

    .line 65
    if-eqz v5, :cond_ee

    .line 66
    .line 67
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 74
    .line 75
    invoke-virtual {v1, v13}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    and-int/2addr v1, v10

    .line 80
    if-eqz v1, :cond_54

    .line 81
    .line 82
    const/16 v17, 0x1

    .line 83
    .line 84
    goto :goto_56

    .line 85
    :cond_54
    const/16 v17, 0x0

    .line 86
    .line 87
    :goto_56
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 88
    .line 89
    array-length v1, v1

    .line 90
    new-array v1, v1, [Z

    .line 91
    .line 92
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v14, v2

    .line 97
    check-cast v14, Lax/l1/K;

    .line 98
    .line 99
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 100
    .line 101
    iget-wide v2, v2, Landroidx/media3/exoplayer/J0;->s:J

    .line 102
    .line 103
    move-object/from16 v18, v1

    .line 104
    .line 105
    move-wide v15, v2

    .line 106
    invoke-virtual/range {v13 .. v18}, Landroidx/media3/exoplayer/q0;->b(Lax/l1/K;JZ[Z)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 111
    .line 112
    iget v4, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 113
    .line 114
    if-eq v4, v12, :cond_7b

    .line 115
    .line 116
    iget-wide v4, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 117
    .line 118
    cmp-long v1, v2, v4

    .line 119
    .line 120
    if-eqz v1, :cond_7b

    .line 121
    .line 122
    const/4 v8, 0x1

    .line 123
    goto :goto_7c

    .line 124
    :cond_7b
    const/4 v8, 0x0

    .line 125
    :goto_7c
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 126
    .line 127
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 128
    .line 129
    move-object v6, v4

    .line 130
    iget-wide v4, v1, Landroidx/media3/exoplayer/J0;->c:J

    .line 131
    .line 132
    iget-wide v14, v1, Landroidx/media3/exoplayer/J0;->d:J

    .line 133
    .line 134
    const/4 v9, 0x5

    .line 135
    move-object v1, v6

    .line 136
    move-wide v6, v14

    .line 137
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 142
    .line 143
    if-eqz v8, :cond_93

    .line 144
    .line 145
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 146
    .line 147
    .line 148
    :cond_93
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 152
    .line 153
    array-length v1, v1

    .line 154
    new-array v1, v1, [Z

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    :goto_9c
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 158
    .line 159
    array-length v4, v3

    .line 160
    if-ge v2, v4, :cond_e6

    .line 161
    .line 162
    aget-object v3, v3, v2

    .line 163
    .line 164
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->h()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 169
    .line 170
    aget-object v4, v4, v2

    .line 171
    .line 172
    invoke-virtual {v4}, Landroidx/media3/exoplayer/O0;->y()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    aput-boolean v4, v1, v2

    .line 177
    .line 178
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 179
    .line 180
    aget-object v19, v4, v2

    .line 181
    .line 182
    iget-object v4, v13, Landroidx/media3/exoplayer/q0;->c:[Lax/i1/e0;

    .line 183
    .line 184
    aget-object v20, v4, v2

    .line 185
    .line 186
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 187
    .line 188
    iget-wide v5, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 189
    .line 190
    aget-boolean v24, v18, v2

    .line 191
    .line 192
    move-object/from16 v21, v4

    .line 193
    .line 194
    move-wide/from16 v22, v5

    .line 195
    .line 196
    invoke-virtual/range {v19 .. v24}, Landroidx/media3/exoplayer/O0;->B(Lax/i1/e0;Landroidx/media3/exoplayer/k;JZ)V

    .line 197
    .line 198
    .line 199
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 200
    .line 201
    aget-object v4, v4, v2

    .line 202
    .line 203
    invoke-virtual {v4}, Landroidx/media3/exoplayer/O0;->h()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    sub-int v4, v3, v4

    .line 208
    .line 209
    if-lez v4, :cond_d5

    .line 210
    .line 211
    invoke-direct {v0, v2, v11}, Landroidx/media3/exoplayer/n0;->s0(IZ)V

    .line 212
    .line 213
    .line 214
    :cond_d5
    iget v4, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 215
    .line 216
    iget-object v5, v0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 217
    .line 218
    aget-object v5, v5, v2

    .line 219
    .line 220
    invoke-virtual {v5}, Landroidx/media3/exoplayer/O0;->h()I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    sub-int/2addr v3, v5

    .line 225
    sub-int/2addr v4, v3

    .line 226
    iput v4, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 227
    .line 228
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_9c

    .line 231
    :cond_e6
    iget-wide v2, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 232
    .line 233
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/exoplayer/n0;->H([ZJ)V

    .line 234
    .line 235
    .line 236
    iput-boolean v10, v13, Landroidx/media3/exoplayer/q0;->i:Z

    .line 237
    .line 238
    goto :goto_11d

    .line 239
    :cond_ee
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 242
    .line 243
    .line 244
    iget-boolean v1, v2, Landroidx/media3/exoplayer/q0;->f:Z

    .line 245
    .line 246
    if-eqz v1, :cond_11d

    .line 247
    .line 248
    iget-object v1, v2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 249
    .line 250
    iget-wide v3, v1, Landroidx/media3/exoplayer/r0;->b:J

    .line 251
    .line 252
    iget-wide v7, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 253
    .line 254
    invoke-virtual {v2, v7, v8}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v7

    .line 258
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    iget-boolean v1, v0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 263
    .line 264
    if-eqz v1, :cond_11a

    .line 265
    .line 266
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_11a

    .line 271
    .line 272
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 273
    .line 274
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-ne v1, v2, :cond_11a

    .line 279
    .line 280
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 281
    .line 282
    .line 283
    :cond_11a
    invoke-virtual {v2, v6, v3, v4, v11}, Landroidx/media3/exoplayer/q0;->a(Lax/l1/K;JZ)J

    .line 284
    .line 285
    .line 286
    :cond_11d
    :goto_11d
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 290
    .line 291
    iget v1, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 292
    .line 293
    if-eq v1, v12, :cond_13c

    .line 294
    .line 295
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 296
    .line 297
    .line 298
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->e2()V

    .line 299
    .line 300
    .line 301
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 302
    .line 303
    const/4 v2, 0x2

    .line 304
    invoke-interface {v1, v2}, Lax/S0/q;->f(I)Z

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_133
    if-ne v2, v3, :cond_136

    .line 309
    .line 310
    const/4 v5, 0x0

    .line 311
    :cond_136
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    goto/16 :goto_19

    .line 316
    .line 317
    :cond_13c
    :goto_13c
    return-void
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private O1()Z
    .registers 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/n0;->i0(Landroidx/media3/exoplayer/q0;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_10

    .line 15
    .line 16
    return v2

    .line 17
    :cond_10
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->l()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/n0;->T(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-ne v1, v3, :cond_2e

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_2c
    move-wide v9, v3

    .line 46
    goto :goto_3a

    .line 47
    :cond_2e
    iget-wide v3, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 48
    .line 49
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iget-object v5, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 54
    .line 55
    iget-wide v5, v5, Landroidx/media3/exoplayer/r0;->b:J

    .line 56
    .line 57
    sub-long/2addr v3, v5

    .line 58
    goto :goto_2c

    .line 59
    :goto_3a
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 60
    .line 61
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 62
    .line 63
    iget-object v4, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 64
    .line 65
    iget-object v4, v4, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 66
    .line 67
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/n0;->R1(Lax/P0/N;Lax/i1/F$b;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_51

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 74
    .line 75
    invoke-interface {v3}, Lax/Y0/P;->b()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    :goto_4e
    move-wide/from16 v16, v3

    .line 80
    .line 81
    goto :goto_57

    .line 82
    :cond_51
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    goto :goto_4e

    .line 88
    :goto_57
    new-instance v5, Landroidx/media3/exoplayer/o0$a;

    .line 89
    .line 90
    iget-object v6, v0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 91
    .line 92
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 93
    .line 94
    iget-object v7, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 95
    .line 96
    iget-object v1, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 97
    .line 98
    iget-object v8, v1, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 99
    .line 100
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget v13, v1, Lax/P0/G;->a:F

    .line 107
    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 109
    .line 110
    iget-boolean v14, v1, Landroidx/media3/exoplayer/J0;->l:Z

    .line 111
    .line 112
    iget-boolean v15, v0, Landroidx/media3/exoplayer/n0;->O0:Z

    .line 113
    .line 114
    iget-wide v3, v0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 115
    .line 116
    move-wide/from16 v18, v3

    .line 117
    .line 118
    invoke-direct/range {v5 .. v19}, Landroidx/media3/exoplayer/o0$a;-><init>(Lax/Z0/I1;Lax/P0/N;Lax/i1/F$b;JJFZZJJ)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 122
    .line 123
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/o0;->b(Landroidx/media3/exoplayer/o0$a;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 128
    .line 129
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-nez v1, :cond_ac

    .line 134
    .line 135
    iget-boolean v4, v3, Landroidx/media3/exoplayer/q0;->f:Z

    .line 136
    .line 137
    if-eqz v4, :cond_ac

    .line 138
    .line 139
    const-wide/32 v6, 0x7a120

    .line 140
    .line 141
    .line 142
    cmp-long v4, v11, v6

    .line 143
    .line 144
    if-gez v4, :cond_ac

    .line 145
    .line 146
    iget-wide v6, v0, Landroidx/media3/exoplayer/n0;->n0:J

    .line 147
    .line 148
    const-wide/16 v8, 0x0

    .line 149
    .line 150
    cmp-long v4, v6, v8

    .line 151
    .line 152
    if-gtz v4, :cond_9d

    .line 153
    .line 154
    iget-boolean v4, v0, Landroidx/media3/exoplayer/n0;->o0:Z

    .line 155
    .line 156
    if-eqz v4, :cond_ac

    .line 157
    .line 158
    :cond_9d
    iget-object v1, v3, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 159
    .line 160
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 161
    .line 162
    iget-wide v3, v3, Landroidx/media3/exoplayer/J0;->s:J

    .line 163
    .line 164
    invoke-interface {v1, v3, v4, v2}, Lax/i1/C;->v(JZ)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 168
    .line 169
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/o0;->b(Landroidx/media3/exoplayer/o0$a;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    :cond_ac
    return v1
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private P0()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->O0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->b1(Z)V

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
.end method

.method private P1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_c

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private Q(J)Lax/Y0/Z;
    .registers 9

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->G0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4d

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v2, p1, v0

    .line 11
    .line 12
    if-eqz v2, :cond_4d

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 15
    .line 16
    iget-object v1, v0, Lax/Y0/Y;->b:Ljava/lang/Double;

    .line 17
    .line 18
    if-eqz v1, :cond_4d

    .line 19
    .line 20
    iget-object v0, v0, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 21
    .line 22
    if-nez v0, :cond_18

    .line 23
    .line 24
    goto :goto_4d

    .line 25
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-double p1, p1

    .line 30
    mul-double v0, v0, p1

    .line 31
    .line 32
    sget-object v2, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lax/t7/a;->f(DLjava/math/RoundingMode;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 39
    .line 40
    iget-object v3, v3, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    mul-double v3, v3, p1

    .line 47
    .line 48
    invoke-static {v3, v4, v2}, Lax/t7/a;->f(DLjava/math/RoundingMode;)J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->F0:Lax/Y0/Z;

    .line 53
    .line 54
    if-eqz v2, :cond_43

    .line 55
    .line 56
    iget-wide v3, v2, Lax/Y0/Z;->a:J

    .line 57
    .line 58
    cmp-long v5, v3, v0

    .line 59
    .line 60
    if-nez v5, :cond_43

    .line 61
    .line 62
    iget-wide v2, v2, Lax/Y0/Z;->b:J

    .line 63
    .line 64
    cmp-long v4, v2, p1

    .line 65
    .line 66
    if-eqz v4, :cond_4a

    .line 67
    .line 68
    :cond_43
    new-instance v2, Lax/Y0/Z;

    .line 69
    .line 70
    invoke-direct {v2, v0, v1, p1, p2}, Lax/Y0/Z;-><init>(JJ)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->F0:Lax/Y0/Z;

    .line 74
    .line 75
    :cond_4a
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->F0:Lax/Y0/Z;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4d
    :goto_4d
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->D0:Lax/Y0/Z;

    .line 79
    .line 80
    return-object p1
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

.method private Q0(ZZZZ)V
    .registers 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-interface {v0, v3}, Lax/S0/q;->i(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-boolean v3, v1, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    iput-object v4, v1, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 16
    .line 17
    iput-object v4, v1, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v3, v5}, Landroidx/media3/exoplayer/n0;->h2(ZZ)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->g()V

    .line 26
    .line 27
    .line 28
    const-wide v6, 0xe8d4a51000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v6, v1, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 34
    .line 35
    :try_start_22
    invoke-direct {v1}, Landroidx/media3/exoplayer/n0;->D()V
    :try_end_25
    .catch Ljava/lang/RuntimeException; {:try_start_22 .. :try_end_25} :catch_28
    .catch Landroidx/media3/exoplayer/s; {:try_start_22 .. :try_end_25} :catch_26

    .line 36
    .line 37
    .line 38
    goto :goto_2e

    .line 39
    :catch_26
    move-exception v0

    .line 40
    goto :goto_29

    .line 41
    :catch_28
    move-exception v0

    .line 42
    :goto_29
    const-string v6, "Disable failed."

    .line 43
    .line 44
    invoke-static {v2, v6, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_2e
    if-eqz p1, :cond_45

    .line 48
    .line 49
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 50
    .line 51
    array-length v7, v6

    .line 52
    const/4 v8, 0x0

    .line 53
    :goto_34
    if-ge v8, v7, :cond_45

    .line 54
    .line 55
    aget-object v0, v6, v8

    .line 56
    .line 57
    :try_start_38
    invoke-virtual {v0}, Landroidx/media3/exoplayer/O0;->L()V
    :try_end_3b
    .catch Ljava/lang/RuntimeException; {:try_start_38 .. :try_end_3b} :catch_3c

    .line 58
    .line 59
    .line 60
    goto :goto_42

    .line 61
    :catch_3c
    move-exception v0

    .line 62
    const-string v9, "Reset failed."

    .line 63
    .line 64
    invoke-static {v2, v9, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_42
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    goto :goto_34

    .line 70
    :cond_45
    iput v3, v1, Landroidx/media3/exoplayer/n0;->W0:I

    .line 71
    .line 72
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 73
    .line 74
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 75
    .line 76
    iget-wide v6, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 77
    .line 78
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 79
    .line 80
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 81
    .line 82
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_67

    .line 87
    .line 88
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 89
    .line 90
    iget-object v8, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 91
    .line 92
    invoke-static {v0, v8}, Landroidx/media3/exoplayer/n0;->l0(Landroidx/media3/exoplayer/J0;Lax/P0/N$b;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_62

    .line 97
    .line 98
    goto :goto_67

    .line 99
    :cond_62
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 100
    .line 101
    iget-wide v8, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 102
    .line 103
    goto :goto_6b

    .line 104
    :cond_67
    :goto_67
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 105
    .line 106
    iget-wide v8, v0, Landroidx/media3/exoplayer/J0;->c:J

    .line 107
    .line 108
    :goto_6b
    if-eqz p2, :cond_95

    .line 109
    .line 110
    iput-object v4, v1, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 111
    .line 112
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 113
    .line 114
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 115
    .line 116
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/n0;->O(Lax/P0/N;)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Lax/i1/F$b;

    .line 123
    .line 124
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/lang/Long;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 133
    .line 134
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 135
    .line 136
    invoke-virtual {v2, v0}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    if-nez v0, :cond_95

    .line 146
    .line 147
    move-wide v11, v6

    .line 148
    move-wide v9, v8

    .line 149
    goto :goto_98

    .line 150
    :cond_95
    move-wide v11, v6

    .line 151
    move-wide v9, v8

    .line 152
    const/4 v5, 0x0

    .line 153
    :goto_98
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->g()V

    .line 156
    .line 157
    .line 158
    iput-boolean v3, v1, Landroidx/media3/exoplayer/n0;->Q0:Z

    .line 159
    .line 160
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 161
    .line 162
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 163
    .line 164
    if-eqz p3, :cond_dd

    .line 165
    .line 166
    instance-of v3, v0, Landroidx/media3/exoplayer/L0;

    .line 167
    .line 168
    if-eqz v3, :cond_dd

    .line 169
    .line 170
    check-cast v0, Landroidx/media3/exoplayer/L0;

    .line 171
    .line 172
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 173
    .line 174
    invoke-virtual {v3}, Landroidx/media3/exoplayer/I0;->q()Lax/i1/g0;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/L0;->E(Lax/i1/g0;)Landroidx/media3/exoplayer/L0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget v3, v2, Lax/i1/F$b;->b:I

    .line 183
    .line 184
    const/4 v6, -0x1

    .line 185
    if-eq v3, v6, :cond_dd

    .line 186
    .line 187
    iget-object v3, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 188
    .line 189
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 190
    .line 191
    invoke-virtual {v0, v3, v6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 192
    .line 193
    .line 194
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 195
    .line 196
    iget v3, v3, Lax/P0/N$b;->c:I

    .line 197
    .line 198
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 199
    .line 200
    invoke-virtual {v0, v3, v6}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Lax/P0/N$c;->f()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_dd

    .line 209
    .line 210
    new-instance v3, Lax/i1/F$b;

    .line 211
    .line 212
    iget-object v6, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 213
    .line 214
    iget-wide v7, v2, Lax/i1/F$b;->d:J

    .line 215
    .line 216
    invoke-direct {v3, v6, v7, v8}, Lax/i1/F$b;-><init>(Ljava/lang/Object;J)V

    .line 217
    .line 218
    .line 219
    move-object v7, v0

    .line 220
    move-object v8, v3

    .line 221
    goto :goto_df

    .line 222
    :cond_dd
    move-object v7, v0

    .line 223
    move-object v8, v2

    .line 224
    :goto_df
    new-instance v6, Landroidx/media3/exoplayer/J0;

    .line 225
    .line 226
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 227
    .line 228
    iget v13, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 229
    .line 230
    if-eqz p4, :cond_e9

    .line 231
    .line 232
    :goto_e7
    move-object v14, v4

    .line 233
    goto :goto_ec

    .line 234
    :cond_e9
    iget-object v4, v0, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 235
    .line 236
    goto :goto_e7

    .line 237
    :goto_ec
    if-eqz v5, :cond_f3

    .line 238
    .line 239
    sget-object v2, Lax/i1/q0;->d:Lax/i1/q0;

    .line 240
    .line 241
    :goto_f0
    move-object/from16 v16, v2

    .line 242
    .line 243
    goto :goto_f6

    .line 244
    :cond_f3
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->h:Lax/i1/q0;

    .line 245
    .line 246
    goto :goto_f0

    .line 247
    :goto_f6
    if-eqz v5, :cond_fd

    .line 248
    .line 249
    iget-object v2, v1, Landroidx/media3/exoplayer/n0;->f0:Lax/l1/K;

    .line 250
    .line 251
    :goto_fa
    move-object/from16 v17, v2

    .line 252
    .line 253
    goto :goto_100

    .line 254
    :cond_fd
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 255
    .line 256
    goto :goto_fa

    .line 257
    :goto_100
    if-eqz v5, :cond_109

    .line 258
    .line 259
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_106
    move-object/from16 v18, v0

    .line 264
    .line 265
    goto :goto_10c

    .line 266
    :cond_109
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 267
    .line 268
    goto :goto_106

    .line 269
    :goto_10c
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 270
    .line 271
    iget-boolean v2, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 272
    .line 273
    iget v3, v0, Landroidx/media3/exoplayer/J0;->m:I

    .line 274
    .line 275
    iget v4, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 276
    .line 277
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 278
    .line 279
    const-wide/16 v30, 0x0

    .line 280
    .line 281
    const/16 v32, 0x0

    .line 282
    .line 283
    const/4 v15, 0x0

    .line 284
    const-wide/16 v26, 0x0

    .line 285
    .line 286
    move-object/from16 v19, v8

    .line 287
    .line 288
    move-wide/from16 v24, v11

    .line 289
    .line 290
    move-wide/from16 v28, v11

    .line 291
    .line 292
    move-object/from16 v23, v0

    .line 293
    .line 294
    move/from16 v20, v2

    .line 295
    .line 296
    move/from16 v21, v3

    .line 297
    .line 298
    move/from16 v22, v4

    .line 299
    .line 300
    invoke-direct/range {v6 .. v32}, Landroidx/media3/exoplayer/J0;-><init>(Lax/P0/N;Lax/i1/F$b;JJILandroidx/media3/exoplayer/s;ZLax/i1/q0;Lax/l1/K;Ljava/util/List;Lax/i1/F$b;ZIILax/P0/G;JJJJZ)V

    .line 301
    .line 302
    .line 303
    iput-object v6, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 304
    .line 305
    if-eqz p3, :cond_13c

    .line 306
    .line 307
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->M()V

    .line 310
    .line 311
    .line 312
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/media3/exoplayer/I0;->y()V

    .line 315
    .line 316
    .line 317
    :cond_13c
    return-void
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method private Q1(Z)Z
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 4
    .line 5
    if-nez v1, :cond_b

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/media3/exoplayer/n0;->k0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    return v1

    .line 12
    :cond_b
    const/4 v1, 0x0

    .line 13
    if-nez p1, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 17
    .line 18
    iget-boolean v2, v2, Landroidx/media3/exoplayer/J0;->g:Z

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v2, :cond_17

    .line 22
    .line 23
    return v3

    .line 24
    :cond_17
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    iget-object v4, v4, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 33
    .line 34
    iget-object v5, v2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 35
    .line 36
    iget-object v5, v5, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 37
    .line 38
    invoke-direct {v0, v4, v5}, Landroidx/media3/exoplayer/n0;->R1(Lax/P0/N;Lax/i1/F$b;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_34

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 45
    .line 46
    invoke-interface {v4}, Lax/Y0/P;->b()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    :goto_31
    move-wide/from16 v17, v4

    .line 51
    .line 52
    goto :goto_3a

    .line 53
    :cond_34
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_31

    .line 59
    :goto_3a
    iget-object v4, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Landroidx/media3/exoplayer/q0;->s()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4e

    .line 70
    .line 71
    iget-object v5, v4, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 72
    .line 73
    iget-boolean v5, v5, Landroidx/media3/exoplayer/r0;->j:Z

    .line 74
    .line 75
    if-eqz v5, :cond_4e

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    goto :goto_4f

    .line 79
    :cond_4e
    const/4 v5, 0x0

    .line 80
    :goto_4f
    iget-object v6, v4, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 81
    .line 82
    iget-object v6, v6, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 83
    .line 84
    invoke-virtual {v6}, Lax/i1/F$b;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_5e

    .line 89
    .line 90
    iget-boolean v6, v4, Landroidx/media3/exoplayer/q0;->f:Z

    .line 91
    .line 92
    if-nez v6, :cond_5e

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    :cond_5e
    if-nez v5, :cond_9b

    .line 96
    .line 97
    if-eqz v1, :cond_63

    .line 98
    .line 99
    goto :goto_9b

    .line 100
    :cond_63
    invoke-virtual {v4}, Landroidx/media3/exoplayer/q0;->j()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/n0;->T(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v12

    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 109
    .line 110
    new-instance v6, Landroidx/media3/exoplayer/o0$a;

    .line 111
    .line 112
    iget-object v7, v0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 113
    .line 114
    iget-object v3, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 115
    .line 116
    iget-object v8, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 117
    .line 118
    iget-object v3, v2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 119
    .line 120
    iget-object v9, v3, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 121
    .line 122
    iget-wide v3, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 123
    .line 124
    invoke-virtual {v2, v3, v4}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget v14, v2, Lax/P0/G;->a:F

    .line 135
    .line 136
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 137
    .line 138
    iget-boolean v15, v2, Landroidx/media3/exoplayer/J0;->l:Z

    .line 139
    .line 140
    iget-boolean v2, v0, Landroidx/media3/exoplayer/n0;->O0:Z

    .line 141
    .line 142
    iget-wide v3, v0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 143
    .line 144
    move/from16 v16, v2

    .line 145
    .line 146
    move-wide/from16 v19, v3

    .line 147
    .line 148
    invoke-direct/range {v6 .. v20}, Landroidx/media3/exoplayer/o0$a;-><init>(Lax/Z0/I1;Lax/P0/N;Lax/i1/F$b;JJFZZJJ)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v6}, Landroidx/media3/exoplayer/o0;->a(Landroidx/media3/exoplayer/o0$a;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    return v1

    .line 156
    :cond_9b
    :goto_9b
    return v3
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private R()J
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_10

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_10

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_10
    sget-wide v0, Landroidx/media3/exoplayer/n0;->k1:J

    .line 18
    .line 19
    return-wide v0
    .line 20
    .line 21
.end method

.method private R0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/r0;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_14

    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->M0:Z

    .line 16
    .line 17
    if-eqz v0, :cond_14

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v0, 0x0

    .line 22
    :goto_15
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 23
    .line 24
    return-void
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

.method private R1(Lax/P0/N;Lax/i1/F$b;)Z
    .registers 7

    .line 1
    invoke-virtual {p2}, Lax/i1/F$b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_38

    .line 7
    .line 8
    invoke-virtual {p1}, Lax/P0/N;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    goto :goto_38

    .line 15
    :cond_e
    iget-object p2, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Lax/P0/N$b;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/P0/N$c;->f()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_38

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 39
    .line 40
    iget-boolean p2, p1, Lax/P0/N$c;->i:Z

    .line 41
    .line 42
    if-eqz p2, :cond_38

    .line 43
    .line 44
    iget-wide p1, p1, Lax/P0/N$c;->f:J

    .line 45
    .line 46
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long v0, p1, v2

    .line 52
    .line 53
    if-eqz v0, :cond_38

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_38
    :goto_38
    return v1
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
.end method

.method private S()J
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/J0;->q:J

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/n0;->T(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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

.method private S0(J)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    const-wide v1, 0xe8d4a51000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    add-long/2addr p1, v1

    .line 15
    goto :goto_13

    .line 16
    :cond_f
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/q0;->D(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    :goto_13
    iput-wide p1, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroidx/media3/exoplayer/k;->c(J)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 28
    .line 29
    array-length p2, p1

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_1e
    if-ge v1, p2, :cond_2a

    .line 32
    .line 33
    aget-object v2, p1, v1

    .line 34
    .line 35
    iget-wide v3, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 36
    .line 37
    invoke-virtual {v2, v0, v3, v4}, Landroidx/media3/exoplayer/O0;->M(Landroidx/media3/exoplayer/q0;J)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1e

    .line 43
    :cond_2a
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->D0()V

    .line 44
    .line 45
    .line 46
    return-void
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

.method private S1()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_24

    .line 10
    :cond_9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_e
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-ge v1, v2, :cond_24

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/l1/K;->c(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1a

    .line 25
    .line 26
    goto :goto_21

    .line 27
    :cond_1a
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 28
    .line 29
    aget-object v2, v2, v1

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/media3/exoplayer/O0;->W()V

    .line 32
    .line 33
    .line 34
    :goto_21
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_e

    .line 37
    :cond_24
    :goto_24
    return-void
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

.method private T(J)J
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_b
    iget-wide v3, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 13
    .line 14
    invoke-virtual {v0, v3, v4}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    sub-long/2addr p1, v3

    .line 19
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
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
.end method

.method private static T0(Lax/P0/N;Landroidx/media3/exoplayer/n0$d;Lax/P0/N$c;Lax/P0/N$b;)V
    .registers 8

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lax/P0/N$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Lax/P0/N$c;->o:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, p3, v0}, Lax/P0/N;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-wide v0, p3, Lax/P0/N$b;->d:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p3, v0, v2

    .line 30
    .line 31
    if-eqz p3, :cond_24

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_29

    .line 37
    :cond_24
    const-wide v0, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_29
    invoke-virtual {p1, p2, v0, v1, p0}, Landroidx/media3/exoplayer/n0$d;->h(IJLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method private U(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/J0;->m:I

    .line 8
    .line 9
    invoke-direct {p0, v1, p1, v2, v0}, Landroidx/media3/exoplayer/n0;->d2(ZIII)V

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
    .line 22
.end method

.method private static U0(Landroidx/media3/exoplayer/n0$d;Lax/P0/N;Lax/P0/N;IZLax/P0/N$c;Lax/P0/N$b;)Z
    .registers 18

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x1

    .line 5
    const-wide/high16 v9, -0x8000000000000000L

    .line 6
    .line 7
    if-nez v0, :cond_65

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/media3/exoplayer/K0;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long p2, v0, v9

    .line 16
    .line 17
    if-nez p2, :cond_18

    .line 18
    .line 19
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_22

    .line 25
    :cond_18
    iget-object p2, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/media3/exoplayer/K0;->e()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_22
    new-instance p2, Landroidx/media3/exoplayer/n0$h;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/media3/exoplayer/K0;->g()Lax/P0/N;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/media3/exoplayer/K0;->c()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {p2, v2, v3, v0, v1}, Landroidx/media3/exoplayer/n0$h;-><init>(Lax/P0/N;IJ)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    move-object v0, p1

    .line 54
    move-object v1, p2

    .line 55
    move v3, p3

    .line 56
    move v4, p4

    .line 57
    move-object/from16 v5, p5

    .line 58
    .line 59
    move-object/from16 v6, p6

    .line 60
    .line 61
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/n0;->X0(Lax/P0/N;Landroidx/media3/exoplayer/n0$h;ZIZLax/P0/N$c;Lax/P0/N$b;)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    move-object v2, v6

    .line 66
    if-nez p2, :cond_44

    .line 67
    .line 68
    return v7

    .line 69
    :cond_44
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v3, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0, v0, v3, v4, p2}, Landroidx/media3/exoplayer/n0$d;->h(IJLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 89
    .line 90
    invoke-virtual {p2}, Landroidx/media3/exoplayer/K0;->e()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    cmp-long p2, v3, v9

    .line 95
    .line 96
    if-nez p2, :cond_64

    .line 97
    .line 98
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/n0;->T0(Lax/P0/N;Landroidx/media3/exoplayer/n0$d;Lax/P0/N$c;Lax/P0/N$b;)V

    .line 99
    .line 100
    .line 101
    :cond_64
    return v8

    .line 102
    :cond_65
    move-object/from16 v5, p5

    .line 103
    .line 104
    move-object/from16 v2, p6

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v3, -0x1

    .line 111
    if-ne v0, v3, :cond_71

    .line 112
    .line 113
    return v7

    .line 114
    :cond_71
    iget-object v3, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 115
    .line 116
    invoke-virtual {v3}, Landroidx/media3/exoplayer/K0;->e()J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    cmp-long v6, v3, v9

    .line 121
    .line 122
    if-nez v6, :cond_7f

    .line 123
    .line 124
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/n0;->T0(Lax/P0/N;Landroidx/media3/exoplayer/n0$d;Lax/P0/N$c;Lax/P0/N$b;)V

    .line 125
    .line 126
    .line 127
    return v8

    .line 128
    :cond_7f
    iput v0, p0, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 129
    .line 130
    iget-object v0, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {p2, v0, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 133
    .line 134
    .line 135
    iget-boolean v0, v2, Lax/P0/N$b;->f:Z

    .line 136
    .line 137
    if-eqz v0, :cond_c4

    .line 138
    .line 139
    iget v0, v2, Lax/P0/N$b;->c:I

    .line 140
    .line 141
    invoke-virtual {p2, v0, v5}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget v0, v0, Lax/P0/N$c;->n:I

    .line 146
    .line 147
    iget-object v3, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {p2, v3}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-ne v0, p2, :cond_c4

    .line 154
    .line 155
    iget-wide v3, p0, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 156
    .line 157
    invoke-virtual {v2}, Lax/P0/N$b;->o()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    add-long/2addr v3, v6

    .line 162
    iget-object p2, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {p1, p2, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iget p2, p2, Lax/P0/N$b;->c:I

    .line 169
    .line 170
    move-object v0, p1

    .line 171
    move-object v1, v5

    .line 172
    move-wide v4, v3

    .line 173
    move v3, p2

    .line 174
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    iget-object v0, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-virtual {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/n0$d;->h(IJLjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_c4
    return v8
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method private U1(ZZ)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_b

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/media3/exoplayer/n0;->T0:Z

    .line 6
    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    :goto_b
    const/4 p1, 0x1

    .line 13
    :goto_c
    invoke-direct {p0, p1, v0, v1, v0}, Landroidx/media3/exoplayer/n0;->Q0(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/o0;->g(Lax/Z0/I1;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    iget-boolean p2, p2, Landroidx/media3/exoplayer/J0;->l:Z

    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroidx/media3/exoplayer/g;->n(ZI)I

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
.end method

.method private V()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/n0;->j1:F

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->M1(F)V

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

.method private V0(Lax/P0/N;Lax/P0/N;)V
    .registers 12

    .line 1
    invoke-virtual {p1}, Lax/P0/N;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    invoke-virtual {p2}, Lax/P0/N;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_15
    if-ltz v0, :cond_48

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Landroidx/media3/exoplayer/n0$d;

    .line 32
    .line 33
    iget v5, p0, Landroidx/media3/exoplayer/n0;->R0:I

    .line 34
    .line 35
    iget-boolean v6, p0, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 36
    .line 37
    iget-object v7, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 38
    .line 39
    iget-object v8, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/n0;->U0(Landroidx/media3/exoplayer/n0$d;Lax/P0/N;Lax/P0/N;IZLax/P0/N$c;Lax/P0/N$b;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_43

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Landroidx/media3/exoplayer/n0$d;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_43
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    move-object p1, v3

    .line 71
    move-object p2, v4

    .line 72
    goto :goto_15

    .line 73
    :cond_48
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    return-void
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
.end method

.method private V1()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->g()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    if-ge v2, v1, :cond_13

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->Y()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_9

    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method private W(Lax/i1/C;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->F(Lax/i1/C;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/t0;->K(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->G(Lax/i1/C;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1e

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->n0()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method private static W0(Lax/P0/N;Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/n0$h;Landroidx/media3/exoplayer/t0;IZLax/P0/N$c;Lax/P0/N$b;)Landroidx/media3/exoplayer/n0$g;
    .registers 40

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/n0$g;

    .line 12
    .line 13
    invoke-static {}, Landroidx/media3/exoplayer/J0;->l()Lax/i1/F$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/n0$g;-><init>(Lax/i1/F$b;JJZZZ)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1e
    iget-object v9, v7, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 32
    .line 33
    iget-object v8, v9, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v7, v2}, Landroidx/media3/exoplayer/n0;->l0(Landroidx/media3/exoplayer/J0;Lax/P0/N$b;)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    iget-object v0, v7, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_35

    .line 46
    .line 47
    if-eqz v10, :cond_31

    .line 48
    .line 49
    goto :goto_35

    .line 50
    :cond_31
    iget-wide v0, v7, Landroidx/media3/exoplayer/J0;->s:J

    .line 51
    .line 52
    :goto_33
    move-wide v11, v0

    .line 53
    goto :goto_38

    .line 54
    :cond_35
    :goto_35
    iget-wide v0, v7, Landroidx/media3/exoplayer/J0;->c:J

    .line 55
    .line 56
    goto :goto_33

    .line 57
    :goto_38
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/4 v13, -0x1

    .line 65
    const/16 v20, 0x1

    .line 66
    .line 67
    if-eqz p2, :cond_94

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    move-object/from16 v0, p0

    .line 71
    .line 72
    move-object/from16 v1, p2

    .line 73
    .line 74
    move/from16 v3, p4

    .line 75
    .line 76
    move/from16 v4, p5

    .line 77
    .line 78
    move-object/from16 v5, p6

    .line 79
    .line 80
    move-object/from16 v6, p7

    .line 81
    .line 82
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/n0;->X0(Lax/P0/N;Landroidx/media3/exoplayer/n0$h;ZIZLax/P0/N$c;Lax/P0/N$b;)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move v3, v4

    .line 87
    if-nez v2, :cond_62

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lax/P0/N;->a(Z)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    move v3, v1

    .line 94
    move-wide v1, v11

    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v14, 0x1

    .line 98
    goto :goto_89

    .line 99
    :cond_62
    iget-wide v3, v1, Landroidx/media3/exoplayer/n0$h;->c:J

    .line 100
    .line 101
    cmp-long v1, v3, v17

    .line 102
    .line 103
    if-nez v1, :cond_74

    .line 104
    .line 105
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v0, v1, v6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget v1, v1, Lax/P0/N$b;->c:I

    .line 112
    .line 113
    move v3, v1

    .line 114
    move-wide v1, v11

    .line 115
    const/4 v4, 0x0

    .line 116
    goto :goto_80

    .line 117
    :cond_74
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Ljava/lang/Long;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    const/4 v3, -0x1

    .line 128
    const/4 v4, 0x1

    .line 129
    :goto_80
    iget v5, v7, Landroidx/media3/exoplayer/J0;->e:I

    .line 130
    .line 131
    const/4 v14, 0x4

    .line 132
    if-ne v5, v14, :cond_87

    .line 133
    .line 134
    const/4 v5, 0x1

    .line 135
    goto :goto_88

    .line 136
    :cond_87
    const/4 v5, 0x0

    .line 137
    :goto_88
    const/4 v14, 0x0

    .line 138
    :goto_89
    move/from16 v29, v4

    .line 139
    .line 140
    move/from16 v27, v5

    .line 141
    .line 142
    move/from16 v28, v14

    .line 143
    .line 144
    move-wide v13, v1

    .line 145
    move-object v2, v6

    .line 146
    const/4 v6, -0x1

    .line 147
    goto/16 :goto_158

    .line 148
    .line 149
    :cond_94
    move-object/from16 v0, p0

    .line 150
    .line 151
    move/from16 v3, p5

    .line 152
    .line 153
    move-object v6, v2

    .line 154
    iget-object v1, v7, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 155
    .line 156
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_b1

    .line 161
    .line 162
    invoke-virtual {v0, v3}, Lax/P0/N;->a(Z)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    move v3, v1

    .line 167
    :goto_a6
    move-object v2, v6

    .line 168
    move-wide v13, v11

    .line 169
    const/4 v6, -0x1

    .line 170
    :goto_a9
    const/16 v27, 0x0

    .line 171
    .line 172
    const/16 v28, 0x0

    .line 173
    .line 174
    const/16 v29, 0x0

    .line 175
    .line 176
    goto/16 :goto_158

    .line 177
    .line 178
    :cond_b1
    invoke-virtual {v0, v8}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-ne v1, v13, :cond_dc

    .line 183
    .line 184
    iget-object v5, v7, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 185
    .line 186
    move/from16 v2, p4

    .line 187
    .line 188
    move-object v1, v6

    .line 189
    move-object v4, v8

    .line 190
    move-object v6, v0

    .line 191
    move-object/from16 v0, p6

    .line 192
    .line 193
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/n0;->Y0(Lax/P0/N$c;Lax/P0/N$b;IZLjava/lang/Object;Lax/P0/N;Lax/P0/N;)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    move-object v0, v6

    .line 198
    move-object v6, v1

    .line 199
    if-ne v2, v13, :cond_ce

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Lax/P0/N;->a(Z)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    const/4 v14, 0x1

    .line 206
    goto :goto_cf

    .line 207
    :cond_ce
    const/4 v14, 0x0

    .line 208
    :goto_cf
    move v3, v2

    .line 209
    move-object v8, v4

    .line 210
    move-object v2, v6

    .line 211
    move/from16 v28, v14

    .line 212
    .line 213
    const/4 v6, -0x1

    .line 214
    const/16 v27, 0x0

    .line 215
    .line 216
    const/16 v29, 0x0

    .line 217
    .line 218
    move-wide v13, v11

    .line 219
    goto/16 :goto_158

    .line 220
    .line 221
    :cond_dc
    move-object v4, v8

    .line 222
    cmp-long v1, v11, v17

    .line 223
    .line 224
    if-nez v1, :cond_ea

    .line 225
    .line 226
    invoke-virtual {v0, v4, v6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iget v1, v1, Lax/P0/N$b;->c:I

    .line 231
    .line 232
    move v3, v1

    .line 233
    move-object v8, v4

    .line 234
    goto :goto_a6

    .line 235
    :cond_ea
    if-eqz v10, :cond_151

    .line 236
    .line 237
    iget-object v1, v7, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 238
    .line 239
    iget-object v2, v9, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 240
    .line 241
    invoke-virtual {v1, v2, v6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 242
    .line 243
    .line 244
    iget-object v1, v7, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 245
    .line 246
    iget v2, v6, Lax/P0/N$b;->c:I

    .line 247
    .line 248
    move-object/from16 v5, p6

    .line 249
    .line 250
    invoke-virtual {v1, v2, v5}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget v1, v1, Lax/P0/N$c;->n:I

    .line 255
    .line 256
    iget-object v2, v7, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 257
    .line 258
    iget-object v3, v9, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-virtual {v2, v3}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-ne v1, v2, :cond_12b

    .line 265
    .line 266
    invoke-virtual {v6}, Lax/P0/N$b;->o()J

    .line 267
    .line 268
    .line 269
    move-result-wide v1

    .line 270
    add-long/2addr v1, v11

    .line 271
    invoke-virtual {v0, v4, v6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iget v3, v3, Lax/P0/N$b;->c:I

    .line 276
    .line 277
    move-wide/from16 v30, v1

    .line 278
    .line 279
    move-object v1, v5

    .line 280
    move-wide/from16 v4, v30

    .line 281
    .line 282
    move-object v2, v6

    .line 283
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iget-object v8, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v1, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, Ljava/lang/Long;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 294
    .line 295
    .line 296
    move-result-wide v3

    .line 297
    move-wide v13, v3

    .line 298
    const/4 v6, -0x1

    .line 299
    goto :goto_149

    .line 300
    :cond_12b
    move-object v2, v6

    .line 301
    invoke-virtual {v0, v4, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-wide v5, v1, Lax/P0/N$b;->d:J

    .line 306
    .line 307
    cmp-long v1, v5, v17

    .line 308
    .line 309
    if-eqz v1, :cond_146

    .line 310
    .line 311
    iget-wide v5, v2, Lax/P0/N$b;->d:J

    .line 312
    .line 313
    const-wide/16 v14, 0x1

    .line 314
    .line 315
    sub-long/2addr v5, v14

    .line 316
    const/4 v1, -0x1

    .line 317
    const-wide/16 v13, 0x0

    .line 318
    .line 319
    move-wide v15, v5

    .line 320
    const/4 v6, -0x1

    .line 321
    invoke-static/range {v11 .. v16}, Lax/S0/d0;->q(JJJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide v13

    .line 325
    move-object v8, v4

    .line 326
    goto :goto_149

    .line 327
    :cond_146
    const/4 v6, -0x1

    .line 328
    move-object v8, v4

    .line 329
    move-wide v13, v11

    .line 330
    :goto_149
    const/4 v3, -0x1

    .line 331
    const/16 v27, 0x0

    .line 332
    .line 333
    const/16 v28, 0x0

    .line 334
    .line 335
    const/16 v29, 0x1

    .line 336
    .line 337
    goto :goto_158

    .line 338
    :cond_151
    move-object v2, v6

    .line 339
    const/4 v6, -0x1

    .line 340
    move-object v8, v4

    .line 341
    move-wide v13, v11

    .line 342
    const/4 v3, -0x1

    .line 343
    goto/16 :goto_a9

    .line 344
    .line 345
    :goto_158
    if-eq v3, v6, :cond_175

    .line 346
    .line 347
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    move-object/from16 v1, p6

    .line 353
    .line 354
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 359
    .line 360
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v1, Ljava/lang/Long;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 365
    .line 366
    .line 367
    move-result-wide v13

    .line 368
    move-wide v3, v13

    .line 369
    move-wide/from16 v25, v17

    .line 370
    .line 371
    :goto_172
    move-object/from16 v1, p3

    .line 372
    .line 373
    goto :goto_179

    .line 374
    :cond_175
    move-wide v3, v13

    .line 375
    move-wide/from16 v25, v3

    .line 376
    .line 377
    goto :goto_172

    .line 378
    :goto_179
    invoke-virtual {v1, v0, v8, v3, v4}, Landroidx/media3/exoplayer/t0;->Q(Lax/P0/N;Ljava/lang/Object;J)Lax/i1/F$b;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    iget v5, v1, Lax/i1/F$b;->e:I

    .line 383
    .line 384
    if-eq v5, v6, :cond_18a

    .line 385
    .line 386
    iget v13, v9, Lax/i1/F$b;->e:I

    .line 387
    .line 388
    if-eq v13, v6, :cond_188

    .line 389
    .line 390
    if-lt v5, v13, :cond_188

    .line 391
    .line 392
    goto :goto_18a

    .line 393
    :cond_188
    const/4 v5, 0x0

    .line 394
    goto :goto_18b

    .line 395
    :cond_18a
    :goto_18a
    const/4 v5, 0x1

    .line 396
    :goto_18b
    iget-object v6, v9, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 397
    .line 398
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-eqz v6, :cond_1a3

    .line 403
    .line 404
    invoke-virtual {v9}, Lax/i1/F$b;->b()Z

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    if-nez v6, :cond_1a3

    .line 409
    .line 410
    invoke-virtual {v1}, Lax/i1/F$b;->b()Z

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    if-nez v6, :cond_1a3

    .line 415
    .line 416
    if-eqz v5, :cond_1a3

    .line 417
    .line 418
    const/16 v19, 0x1

    .line 419
    .line 420
    :cond_1a3
    invoke-virtual {v0, v8, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 421
    .line 422
    .line 423
    move-result-object v13

    .line 424
    move v8, v10

    .line 425
    move-wide v10, v11

    .line 426
    move-wide/from16 v14, v25

    .line 427
    .line 428
    move-object v12, v1

    .line 429
    invoke-static/range {v8 .. v15}, Landroidx/media3/exoplayer/n0;->h0(ZLax/i1/F$b;JLax/i1/F$b;Lax/P0/N$b;J)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-nez v19, :cond_1b4

    .line 434
    .line 435
    if-eqz v1, :cond_1b5

    .line 436
    .line 437
    :cond_1b4
    move-object v12, v9

    .line 438
    :cond_1b5
    invoke-virtual {v12}, Lax/i1/F$b;->b()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_1c3

    .line 443
    .line 444
    invoke-virtual {v12, v9}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-eqz v1, :cond_1c6

    .line 449
    .line 450
    iget-wide v3, v7, Landroidx/media3/exoplayer/J0;->s:J

    .line 451
    .line 452
    :cond_1c3
    :goto_1c3
    move-wide/from16 v23, v3

    .line 453
    .line 454
    goto :goto_1de

    .line 455
    :cond_1c6
    iget-object v1, v12, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 456
    .line 457
    invoke-virtual {v0, v1, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 458
    .line 459
    .line 460
    iget v0, v12, Lax/i1/F$b;->c:I

    .line 461
    .line 462
    iget v1, v12, Lax/i1/F$b;->b:I

    .line 463
    .line 464
    invoke-virtual {v2, v1}, Lax/P0/N$b;->l(I)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-ne v0, v1, :cond_1db

    .line 469
    .line 470
    invoke-virtual {v2}, Lax/P0/N$b;->g()J

    .line 471
    .line 472
    .line 473
    move-result-wide v0

    .line 474
    :goto_1d9
    move-wide v3, v0

    .line 475
    goto :goto_1c3

    .line 476
    :cond_1db
    const-wide/16 v0, 0x0

    .line 477
    .line 478
    goto :goto_1d9

    .line 479
    :goto_1de
    new-instance v21, Landroidx/media3/exoplayer/n0$g;

    .line 480
    .line 481
    move-object/from16 v22, v12

    .line 482
    .line 483
    invoke-direct/range {v21 .. v29}, Landroidx/media3/exoplayer/n0$g;-><init>(Lax/i1/F$b;JJZZZ)V

    .line 484
    .line 485
    .line 486
    return-object v21
.end method

.method private W1()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Landroidx/media3/exoplayer/n0;->Q0:Z

    .line 8
    .line 9
    if-nez v1, :cond_17

    .line 10
    .line 11
    if-eqz v0, :cond_15

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 14
    .line 15
    invoke-interface {v0}, Lax/i1/C;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    :goto_17
    const/4 v0, 0x1

    .line 25
    :goto_18
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 26
    .line 27
    iget-boolean v2, v1, Landroidx/media3/exoplayer/J0;->g:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_24

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/J0;->b(Z)Landroidx/media3/exoplayer/J0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 36
    .line 37
    :cond_24
    return-void
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

.method private X(Ljava/io/IOException;I)V
    .registers 4

    .line 1
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/s;->e(Ljava/io/IOException;I)Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_14

    .line 12
    .line 13
    iget-object p2, p2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 14
    .line 15
    iget-object p2, p2, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/s;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/s;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_14
    const-string p2, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string v0, "Playback error"

    .line 24
    .line 25
    invoke-static {p2, v0, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p2, p2}, Landroidx/media3/exoplayer/n0;->U1(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/J0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/J0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 39
    .line 40
    return-void
    .line 41
.end method

.method private static X0(Lax/P0/N;Landroidx/media3/exoplayer/n0$h;ZIZLax/P0/N$c;Lax/P0/N$b;)Landroid/util/Pair;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/N;",
            "Landroidx/media3/exoplayer/n0$h;",
            "ZIZ",
            "Lax/P0/N$c;",
            "Lax/P0/N$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v2, p1, Landroidx/media3/exoplayer/n0$h;->a:Lax/P0/N;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/P0/N;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-eqz v3, :cond_a

    .line 9
    .line 10
    return-object v8

    .line 11
    :cond_a
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_11

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    :cond_11
    :try_start_11
    iget v5, p1, Landroidx/media3/exoplayer/n0$h;->b:I

    .line 19
    .line 20
    iget-wide v6, p1, Landroidx/media3/exoplayer/n0$h;->c:J

    .line 21
    .line 22
    move-object v3, p5

    .line 23
    move-object v4, p6

    .line 24
    invoke-virtual/range {v2 .. v7}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v5
    :try_end_1b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_11 .. :try_end_1b} :catch_76

    .line 28
    move-object v3, v2

    .line 29
    invoke-virtual {p0, v3}, Lax/P0/N;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_23

    .line 34
    .line 35
    return-object v5

    .line 36
    :cond_23
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v7, -0x1

    .line 43
    if-eq v4, v7, :cond_59

    .line 44
    .line 45
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3, v4, p6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-boolean v4, v4, Lax/P0/N$b;->f:Z

    .line 52
    .line 53
    if-eqz v4, :cond_58

    .line 54
    .line 55
    iget v4, p6, Lax/P0/N$b;->c:I

    .line 56
    .line 57
    invoke-virtual {v3, v4, p5}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget v4, v4, Lax/P0/N$c;->n:I

    .line 62
    .line 63
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v4, v3, :cond_58

    .line 70
    .line 71
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {p0, v3, p6}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget v3, v3, Lax/P0/N$b;->c:I

    .line 78
    .line 79
    iget-wide v4, p1, Landroidx/media3/exoplayer/n0$h;->c:J

    .line 80
    .line 81
    move-object v0, p0

    .line 82
    move-object v1, p5

    .line 83
    move-object v2, p6

    .line 84
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_58
    return-object v5

    .line 90
    :cond_59
    if-eqz p2, :cond_76

    .line 91
    .line 92
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v6, p0

    .line 95
    move v2, p3

    .line 96
    move-object v0, p5

    .line 97
    move-object v1, p6

    .line 98
    move-object v5, v3

    .line 99
    move v3, p4

    .line 100
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/n0;->Y0(Lax/P0/N$c;Lax/P0/N$b;IZLjava/lang/Object;Lax/P0/N;Lax/P0/N;)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eq v3, v7, :cond_76

    .line 105
    .line 106
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    move-object v0, p0

    .line 112
    move-object v1, p5

    .line 113
    move-object v2, p6

    .line 114
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :catch_76
    :cond_76
    return-object v8
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method private X1(Lax/i1/F$b;Lax/i1/q0;Lax/l1/K;)V
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroidx/media3/exoplayer/q0;

    .line 14
    .line 15
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v1, v2, :cond_1e

    .line 22
    .line 23
    iget-wide v2, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    :goto_1c
    move-wide v8, v2

    .line 30
    goto :goto_2a

    .line 31
    :cond_1e
    iget-wide v2, v0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    iget-object v4, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 38
    .line 39
    iget-wide v4, v4, Landroidx/media3/exoplayer/r0;->b:J

    .line 40
    .line 41
    sub-long/2addr v2, v4

    .line 42
    goto :goto_1c

    .line 43
    :goto_2a
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->j()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/n0;->T(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 52
    .line 53
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 54
    .line 55
    iget-object v1, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 58
    .line 59
    invoke-direct {v0, v2, v1}, Landroidx/media3/exoplayer/n0;->R1(Lax/P0/N;Lax/i1/F$b;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_48

    .line 64
    .line 65
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 66
    .line 67
    invoke-interface {v1}, Lax/Y0/P;->b()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    :goto_46
    move-wide v15, v1

    .line 72
    goto :goto_4e

    .line 73
    :cond_48
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    goto :goto_46

    .line 79
    :goto_4e
    iget-object v1, v0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 80
    .line 81
    new-instance v4, Landroidx/media3/exoplayer/o0$a;

    .line 82
    .line 83
    iget-object v5, v0, Landroidx/media3/exoplayer/n0;->x0:Lax/Z0/I1;

    .line 84
    .line 85
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 86
    .line 87
    iget-object v6, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 88
    .line 89
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget v12, v2, Lax/P0/G;->a:F

    .line 96
    .line 97
    iget-object v2, v0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 98
    .line 99
    iget-boolean v13, v2, Landroidx/media3/exoplayer/J0;->l:Z

    .line 100
    .line 101
    iget-boolean v14, v0, Landroidx/media3/exoplayer/n0;->O0:Z

    .line 102
    .line 103
    iget-wide v2, v0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 104
    .line 105
    move-object/from16 v7, p1

    .line 106
    .line 107
    move-wide/from16 v17, v2

    .line 108
    .line 109
    invoke-direct/range {v4 .. v18}, Landroidx/media3/exoplayer/o0$a;-><init>(Lax/Z0/I1;Lax/P0/N;Lax/i1/F$b;JJFZZJJ)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v2, p3

    .line 113
    .line 114
    iget-object v2, v2, Lax/l1/K;->c:[Lax/l1/D;

    .line 115
    .line 116
    move-object/from16 v3, p2

    .line 117
    .line 118
    invoke-interface {v1, v4, v3, v2}, Landroidx/media3/exoplayer/o0;->d(Landroidx/media3/exoplayer/o0$a;Lax/i1/q0;[Lax/l1/D;)V

    .line 119
    .line 120
    .line 121
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private Y(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_d

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 10
    .line 11
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 12
    .line 13
    goto :goto_11

    .line 14
    :cond_d
    iget-object v1, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 17
    .line 18
    :goto_11
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_23

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 35
    .line 36
    :cond_23
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 37
    .line 38
    if-nez v0, :cond_2a

    .line 39
    .line 40
    iget-wide v3, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 41
    .line 42
    goto :goto_2e

    .line 43
    :cond_2a
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->j()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    :goto_2e
    iput-wide v3, v1, Landroidx/media3/exoplayer/J0;->q:J

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->S()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Landroidx/media3/exoplayer/J0;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3c

    .line 58
    .line 59
    if-eqz p1, :cond_51

    .line 60
    .line 61
    :cond_3c
    if-eqz v0, :cond_51

    .line 62
    .line 63
    iget-boolean p1, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 64
    .line 65
    if-eqz p1, :cond_51

    .line 66
    .line 67
    iget-object p1, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 68
    .line 69
    iget-object p1, p1, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->o()Lax/i1/q0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p0, p1, v1, v0}, Landroidx/media3/exoplayer/n0;->X1(Lax/i1/F$b;Lax/i1/q0;Lax/l1/K;)V

    .line 80
    .line 81
    .line 82
    :cond_51
    return-void
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

.method static Y0(Lax/P0/N$c;Lax/P0/N$b;IZLjava/lang/Object;Lax/P0/N;Lax/P0/N;)I
    .registers 16

    .line 1
    invoke-virtual {p5, p4, p1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lax/P0/N$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p5, v0, p0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_e
    invoke-virtual {p6}, Lax/P0/N;->p()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_24

    .line 20
    .line 21
    invoke-virtual {p6, v2, p0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_21

    .line 32
    .line 33
    return v2

    .line 34
    :cond_21
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_e

    .line 37
    :cond_24
    invoke-virtual {p5, p4}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-virtual {p5}, Lax/P0/N;->i()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, -0x1

    .line 46
    move v4, p4

    .line 47
    const/4 p4, -0x1

    .line 48
    :goto_2f
    if-ge v1, v0, :cond_4f

    .line 49
    .line 50
    if-ne p4, v2, :cond_4f

    .line 51
    .line 52
    move-object v6, p0

    .line 53
    move-object v5, p1

    .line 54
    move v7, p2

    .line 55
    move v8, p3

    .line 56
    move-object v3, p5

    .line 57
    invoke-virtual/range {v3 .. v8}, Lax/P0/N;->d(ILax/P0/N$b;Lax/P0/N$c;IZ)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v4, v2, :cond_3f

    .line 62
    .line 63
    goto :goto_50

    .line 64
    :cond_3f
    invoke-virtual {v3, v4}, Lax/P0/N;->m(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p6, p0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    move-object p5, v3

    .line 75
    move-object p1, v5

    .line 76
    move-object p0, v6

    .line 77
    move p2, v7

    .line 78
    move p3, v8

    .line 79
    goto :goto_2f

    .line 80
    :cond_4f
    move-object v5, p1

    .line 81
    :goto_50
    if-ne p4, v2, :cond_53

    .line 82
    .line 83
    return v2

    .line 84
    :cond_53
    invoke-virtual {p6, p4, v5}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget p0, p0, Lax/P0/N$b;->c:I

    .line 89
    .line 90
    return p0
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method private Y1(IILjava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lax/P0/y;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/I0;->E(IILjava/util/List;)Lax/P0/N;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

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
.end method

.method private Z(Landroidx/media3/exoplayer/q0;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Landroidx/media3/exoplayer/q0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_15

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lax/P0/G;->a:F

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 16
    .line 17
    iget-boolean v1, v1, Landroidx/media3/exoplayer/J0;->l:Z

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2, v1}, Landroidx/media3/exoplayer/q0;->q(FLax/P0/N;Z)V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object v0, p1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0;->o()Lax/i1/q0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/n0;->X1(Lax/i1/F$b;Lax/i1/q0;Lax/l1/K;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne p1, v0, :cond_4e

    .line 44
    .line 45
    iget-object v0, p1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 46
    .line 47
    iget-wide v0, v0, Landroidx/media3/exoplayer/r0;->b:J

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->G()V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p1, Landroidx/media3/exoplayer/q0;->i:Z

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 59
    .line 60
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 61
    .line 62
    iget-object p1, p1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 63
    .line 64
    iget-wide v3, p1, Landroidx/media3/exoplayer/r0;->b:J

    .line 65
    .line 66
    iget-wide v5, v0, Landroidx/media3/exoplayer/J0;->c:J

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x5

    .line 70
    move-wide v7, v3

    .line 71
    move-object v1, p0

    .line 72
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 77
    .line 78
    goto :goto_4f

    .line 79
    :cond_4e
    move-object v1, p0

    .line 80
    :goto_4f
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 81
    .line 82
    .line 83
    return-void
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

.method private Z0(J)V
    .registers 7

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->g0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->L()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_f

    .line 12
    :cond_b
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->R()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    :goto_f
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    add-long/2addr p1, v0

    .line 20
    invoke-interface {v2, v3, p1, p2}, Lax/S0/q;->h(IJ)Z

    .line 21
    .line 22
    .line 23
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
.end method

.method private Z1()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_26

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/I0;->t()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    goto :goto_26

    .line 20
    :cond_13
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->u0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->y0()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->z0()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->A0()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->w0()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->x0(Z)V

    .line 37
    .line 38
    .line 39
    :cond_26
    :goto_26
    return-void
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

.method private a0(Lax/P0/N;Z)V
    .registers 29
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 4
    .line 5
    iget-object v4, v1, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 6
    .line 7
    iget-object v5, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 8
    .line 9
    iget v6, v1, Landroidx/media3/exoplayer/n0;->R0:I

    .line 10
    .line 11
    iget-boolean v7, v1, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 12
    .line 13
    iget-object v8, v1, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 14
    .line 15
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    invoke-static/range {v2 .. v9}, Landroidx/media3/exoplayer/n0;->W0(Lax/P0/N;Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/n0$h;Landroidx/media3/exoplayer/t0;IZLax/P0/N$c;Lax/P0/N$b;)Landroidx/media3/exoplayer/n0$g;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    iget-object v11, v10, Landroidx/media3/exoplayer/n0$g;->a:Lax/i1/F$b;

    .line 24
    .line 25
    iget-wide v12, v10, Landroidx/media3/exoplayer/n0$g;->c:J

    .line 26
    .line 27
    iget-boolean v0, v10, Landroidx/media3/exoplayer/n0$g;->d:Z

    .line 28
    .line 29
    iget-wide v14, v10, Landroidx/media3/exoplayer/n0$g;->b:J

    .line 30
    .line 31
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 32
    .line 33
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 34
    .line 35
    invoke-virtual {v3, v11}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v3, :cond_36

    .line 42
    .line 43
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 44
    .line 45
    iget-wide v6, v3, Landroidx/media3/exoplayer/J0;->s:J

    .line 46
    .line 47
    cmp-long v3, v14, v6

    .line 48
    .line 49
    if-eqz v3, :cond_33

    .line 50
    .line 51
    goto :goto_36

    .line 52
    :cond_33
    const/16 v16, 0x0

    .line 53
    .line 54
    goto :goto_38

    .line 55
    :cond_36
    :goto_36
    const/16 v16, 0x1

    .line 56
    .line 57
    :goto_38
    const/16 v17, 0x3

    .line 58
    .line 59
    const/4 v6, -0x1

    .line 60
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v7, 0x2

    .line 66
    const/4 v8, 0x4

    .line 67
    :try_start_42
    iget-boolean v9, v10, Landroidx/media3/exoplayer/n0$g;->e:Z

    .line 68
    .line 69
    if-eqz v9, :cond_63

    .line 70
    .line 71
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 72
    .line 73
    iget v9, v9, Landroidx/media3/exoplayer/J0;->e:I

    .line 74
    .line 75
    if-eq v9, v4, :cond_60

    .line 76
    .line 77
    invoke-direct {v1, v8}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_60

    .line 81
    :catchall_50
    move-exception v0

    .line 82
    move-object/from16 v20, v11

    .line 83
    .line 84
    move-object v11, v2

    .line 85
    move-object/from16 v2, v20

    .line 86
    .line 87
    move-wide/from16 v21, v12

    .line 88
    .line 89
    const/4 v12, 0x0

    .line 90
    const/4 v13, 0x2

    .line 91
    const/16 v20, 0x1

    .line 92
    .line 93
    const/16 v24, 0x4

    .line 94
    .line 95
    goto/16 :goto_193

    .line 96
    .line 97
    :cond_60
    :goto_60
    invoke-direct {v1, v5, v5, v5, v4}, Landroidx/media3/exoplayer/n0;->Q0(ZZZZ)V

    .line 98
    .line 99
    .line 100
    :cond_63
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 101
    .line 102
    array-length v3, v9

    .line 103
    const/4 v4, 0x0

    .line 104
    :goto_67
    if-ge v4, v3, :cond_72

    .line 105
    .line 106
    aget-object v5, v9, v4

    .line 107
    .line 108
    invoke-virtual {v5, v2}, Landroidx/media3/exoplayer/O0;->S(Lax/P0/N;)V
    :try_end_6e
    .catchall {:try_start_42 .. :try_end_6e} :catchall_50

    .line 109
    .line 110
    .line 111
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    goto :goto_67

    .line 115
    :cond_72
    if-nez v16, :cond_e3

    .line 116
    .line 117
    :try_start_74
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-wide/16 v3, 0x0

    .line 124
    .line 125
    if-nez v0, :cond_81

    .line 126
    .line 127
    move-wide/from16 v22, v3

    .line 128
    .line 129
    goto :goto_8b

    .line 130
    :cond_81
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/n0;->N(Landroidx/media3/exoplayer/q0;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v22

    .line 140
    :goto_8b
    invoke-direct {v1}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 141
    .line 142
    .line 143
    move-result v0
    :try_end_8f
    .catchall {:try_start_74 .. :try_end_8f} :catchall_e1

    .line 144
    if-eqz v0, :cond_a4

    .line 145
    .line 146
    :try_start_91
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-nez v0, :cond_9a

    .line 153
    .line 154
    goto :goto_a4

    .line 155
    :cond_9a
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/n0;->N(Landroidx/media3/exoplayer/q0;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v3
    :try_end_a4
    .catchall {:try_start_91 .. :try_end_a4} :catchall_50

    .line 165
    :cond_a4
    :goto_a4
    :try_start_a4
    iget-object v2, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 166
    .line 167
    move-wide v8, v3

    .line 168
    const/4 v3, 0x4

    .line 169
    iget-wide v4, v1, Landroidx/media3/exoplayer/n0;->Y0:J
    :try_end_aa
    .catchall {:try_start_a4 .. :try_end_aa} :catchall_d5

    .line 170
    .line 171
    move-object/from16 v3, p1

    .line 172
    .line 173
    move-wide/from16 v6, v22

    .line 174
    .line 175
    const/16 v20, 0x1

    .line 176
    .line 177
    const/16 v24, 0x4

    .line 178
    .line 179
    move-wide/from16 v21, v12

    .line 180
    .line 181
    const/4 v12, 0x0

    .line 182
    const/4 v13, 0x2

    .line 183
    :try_start_b6
    invoke-virtual/range {v2 .. v9}, Landroidx/media3/exoplayer/t0;->W(Lax/P0/N;JJJ)I

    .line 184
    .line 185
    .line 186
    move-result v0
    :try_end_ba
    .catchall {:try_start_b6 .. :try_end_ba} :catchall_d2

    .line 187
    move-object v2, v3

    .line 188
    and-int/lit8 v3, v0, 0x1

    .line 189
    .line 190
    if-eqz v3, :cond_cb

    .line 191
    .line 192
    :try_start_bf
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/n0;->b1(Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_119

    .line 196
    :catchall_c3
    move-exception v0

    .line 197
    :goto_c4
    move-object/from16 v25, v11

    .line 198
    .line 199
    move-object v11, v2

    .line 200
    move-object/from16 v2, v25

    .line 201
    .line 202
    goto/16 :goto_193

    .line 203
    .line 204
    :cond_cb
    and-int/2addr v0, v13

    .line 205
    if-eqz v0, :cond_119

    .line 206
    .line 207
    invoke-direct {v1}, Landroidx/media3/exoplayer/n0;->B()V

    .line 208
    .line 209
    .line 210
    goto :goto_119

    .line 211
    :catchall_d2
    move-exception v0

    .line 212
    move-object v2, v3

    .line 213
    goto :goto_c4

    .line 214
    :catchall_d5
    move-exception v0

    .line 215
    move-object/from16 v2, p1

    .line 216
    .line 217
    :goto_d8
    move-wide/from16 v21, v12

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    const/4 v13, 0x2

    .line 221
    const/16 v20, 0x1

    .line 222
    .line 223
    const/16 v24, 0x4

    .line 224
    .line 225
    goto :goto_c4

    .line 226
    :catchall_e1
    move-exception v0

    .line 227
    goto :goto_d8

    .line 228
    :cond_e3
    move-wide/from16 v21, v12

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    const/4 v13, 0x2

    .line 232
    const/16 v20, 0x1

    .line 233
    .line 234
    const/16 v24, 0x4

    .line 235
    .line 236
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-nez v3, :cond_119

    .line 241
    .line 242
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 243
    .line 244
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    :goto_f7
    if-eqz v3, :cond_115

    .line 249
    .line 250
    iget-object v4, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 251
    .line 252
    iget-object v4, v4, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 253
    .line 254
    invoke-virtual {v4, v11}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_110

    .line 259
    .line 260
    iget-object v4, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 261
    .line 262
    iget-object v5, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 263
    .line 264
    invoke-virtual {v4, v2, v5}, Landroidx/media3/exoplayer/t0;->z(Lax/P0/N;Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/r0;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    iput-object v4, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 269
    .line 270
    invoke-virtual {v3}, Landroidx/media3/exoplayer/q0;->E()V

    .line 271
    .line 272
    .line 273
    :cond_110
    invoke-virtual {v3}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    goto :goto_f7

    .line 278
    :cond_115
    invoke-direct {v1, v11, v14, v15, v0}, Landroidx/media3/exoplayer/n0;->d1(Lax/i1/F$b;JZ)J

    .line 279
    .line 280
    .line 281
    move-result-wide v14
    :try_end_119
    .catchall {:try_start_bf .. :try_end_119} :catchall_c3

    .line 282
    :cond_119
    :goto_119
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 283
    .line 284
    iget-object v4, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 285
    .line 286
    iget-object v5, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 287
    .line 288
    iget-boolean v0, v10, Landroidx/media3/exoplayer/n0$g;->f:Z

    .line 289
    .line 290
    if-eqz v0, :cond_125

    .line 291
    .line 292
    move-wide v6, v14

    .line 293
    goto :goto_127

    .line 294
    :cond_125
    move-wide/from16 v6, v18

    .line 295
    .line 296
    :goto_127
    const/4 v8, 0x0

    .line 297
    move-object v3, v11

    .line 298
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/n0;->f2(Lax/P0/N;Lax/i1/F$b;Lax/P0/N;Lax/i1/F$b;JZ)V

    .line 299
    .line 300
    .line 301
    move-object v11, v2

    .line 302
    move-object v2, v3

    .line 303
    if-nez v16, :cond_138

    .line 304
    .line 305
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 306
    .line 307
    iget-wide v3, v0, Landroidx/media3/exoplayer/J0;->c:J

    .line 308
    .line 309
    cmp-long v0, v21, v3

    .line 310
    .line 311
    if-eqz v0, :cond_16f

    .line 312
    .line 313
    :cond_138
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 314
    .line 315
    iget-object v3, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 316
    .line 317
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 318
    .line 319
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 320
    .line 321
    if-eqz v16, :cond_156

    .line 322
    .line 323
    if-eqz p2, :cond_156

    .line 324
    .line 325
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-nez v4, :cond_156

    .line 330
    .line 331
    iget-object v4, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 332
    .line 333
    invoke-virtual {v0, v3, v4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-boolean v0, v0, Lax/P0/N$b;->f:Z

    .line 338
    .line 339
    if-nez v0, :cond_156

    .line 340
    .line 341
    const/4 v9, 0x1

    .line 342
    goto :goto_157

    .line 343
    :cond_156
    const/4 v9, 0x0

    .line 344
    :goto_157
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 345
    .line 346
    iget-wide v7, v0, Landroidx/media3/exoplayer/J0;->d:J

    .line 347
    .line 348
    invoke-virtual {v11, v3}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    const/4 v3, -0x1

    .line 353
    if-ne v0, v3, :cond_167

    .line 354
    .line 355
    const/4 v10, 0x4

    .line 356
    :goto_163
    move-wide v3, v14

    .line 357
    move-wide/from16 v5, v21

    .line 358
    .line 359
    goto :goto_169

    .line 360
    :cond_167
    const/4 v10, 0x3

    .line 361
    goto :goto_163

    .line 362
    :goto_169
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iput-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 367
    .line 368
    :cond_16f
    invoke-direct {v1}, Landroidx/media3/exoplayer/n0;->R0()V

    .line 369
    .line 370
    .line 371
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 372
    .line 373
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 374
    .line 375
    invoke-direct {v1, v11, v0}, Landroidx/media3/exoplayer/n0;->V0(Lax/P0/N;Lax/P0/N;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 379
    .line 380
    invoke-virtual {v0, v11}, Landroidx/media3/exoplayer/J0;->j(Lax/P0/N;)Landroidx/media3/exoplayer/J0;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iput-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 385
    .line 386
    invoke-virtual {v11}, Lax/P0/N;->q()Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-nez v0, :cond_18a

    .line 391
    .line 392
    const/4 v2, 0x0

    .line 393
    iput-object v2, v1, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 394
    .line 395
    :cond_18a
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 399
    .line 400
    invoke-interface {v0, v13}, Lax/S0/q;->f(I)Z

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :goto_193
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 405
    .line 406
    iget-object v4, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 407
    .line 408
    iget-object v5, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 409
    .line 410
    iget-boolean v3, v10, Landroidx/media3/exoplayer/n0$g;->f:Z

    .line 411
    .line 412
    if-eqz v3, :cond_19f

    .line 413
    .line 414
    move-wide v6, v14

    .line 415
    goto :goto_1a1

    .line 416
    :cond_19f
    move-wide/from16 v6, v18

    .line 417
    .line 418
    :goto_1a1
    const/4 v8, 0x0

    .line 419
    move-object v3, v2

    .line 420
    move-object v2, v11

    .line 421
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/n0;->f2(Lax/P0/N;Lax/i1/F$b;Lax/P0/N;Lax/i1/F$b;JZ)V

    .line 422
    .line 423
    .line 424
    move-object v2, v3

    .line 425
    if-nez v16, :cond_1b2

    .line 426
    .line 427
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 428
    .line 429
    iget-wide v3, v3, Landroidx/media3/exoplayer/J0;->c:J

    .line 430
    .line 431
    cmp-long v5, v21, v3

    .line 432
    .line 433
    if-eqz v5, :cond_1e9

    .line 434
    .line 435
    :cond_1b2
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 436
    .line 437
    iget-object v4, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 438
    .line 439
    iget-object v4, v4, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 440
    .line 441
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 442
    .line 443
    if-eqz v16, :cond_1d0

    .line 444
    .line 445
    if-eqz p2, :cond_1d0

    .line 446
    .line 447
    invoke-virtual {v3}, Lax/P0/N;->q()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-nez v5, :cond_1d0

    .line 452
    .line 453
    iget-object v5, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 454
    .line 455
    invoke-virtual {v3, v4, v5}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    iget-boolean v3, v3, Lax/P0/N$b;->f:Z

    .line 460
    .line 461
    if-nez v3, :cond_1d0

    .line 462
    .line 463
    const/4 v9, 0x1

    .line 464
    goto :goto_1d1

    .line 465
    :cond_1d0
    const/4 v9, 0x0

    .line 466
    :goto_1d1
    iget-object v3, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 467
    .line 468
    iget-wide v7, v3, Landroidx/media3/exoplayer/J0;->d:J

    .line 469
    .line 470
    invoke-virtual {v11, v4}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    const/4 v4, -0x1

    .line 475
    if-ne v3, v4, :cond_1e1

    .line 476
    .line 477
    const/4 v10, 0x4

    .line 478
    :goto_1dd
    move-wide v3, v14

    .line 479
    move-wide/from16 v5, v21

    .line 480
    .line 481
    goto :goto_1e3

    .line 482
    :cond_1e1
    const/4 v10, 0x3

    .line 483
    goto :goto_1dd

    .line 484
    :goto_1e3
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    iput-object v2, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 489
    .line 490
    :cond_1e9
    invoke-direct {v1}, Landroidx/media3/exoplayer/n0;->R0()V

    .line 491
    .line 492
    .line 493
    iget-object v2, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 494
    .line 495
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 496
    .line 497
    invoke-direct {v1, v11, v2}, Landroidx/media3/exoplayer/n0;->V0(Lax/P0/N;Lax/P0/N;)V

    .line 498
    .line 499
    .line 500
    iget-object v2, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 501
    .line 502
    invoke-virtual {v2, v11}, Landroidx/media3/exoplayer/J0;->j(Lax/P0/N;)Landroidx/media3/exoplayer/J0;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    iput-object v2, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 507
    .line 508
    invoke-virtual {v11}, Lax/P0/N;->q()Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    if-nez v2, :cond_204

    .line 513
    .line 514
    const/4 v2, 0x0

    .line 515
    iput-object v2, v1, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 516
    .line 517
    :cond_204
    invoke-direct {v1, v12}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 518
    .line 519
    .line 520
    iget-object v2, v1, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 521
    .line 522
    invoke-interface {v2, v13}, Lax/S0/q;->f(I)Z

    .line 523
    .line 524
    .line 525
    throw v0
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method private static a2(II)I
    .registers 4

    .line 1
    const/4 v0, -0x1

    const/4 v1, 0x2

    if-ne p0, v0, :cond_5

    return v1

    :cond_5
    if-ne p1, v1, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    return p1
.end method

.method private b0(Lax/i1/C;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->F(Lax/i1/C;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_18

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroidx/media3/exoplayer/q0;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->Z(Landroidx/media3/exoplayer/q0;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->v(Lax/i1/C;)Landroidx/media3/exoplayer/q0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_43

    .line 32
    .line 33
    iget-boolean v1, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 34
    .line 35
    xor-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, Lax/P0/G;->a:F

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 49
    .line 50
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 51
    .line 52
    iget-boolean v2, v2, Landroidx/media3/exoplayer/J0;->l:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1, v3, v2}, Landroidx/media3/exoplayer/q0;->q(FLax/P0/N;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->G(Lax/i1/C;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_43

    .line 64
    .line 65
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->n0()V

    .line 66
    .line 67
    .line 68
    :cond_43
    return-void
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
.end method

.method private b1(Z)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 12
    .line 13
    iget-wide v3, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/n0;->e1(Lax/i1/F$b;JZZ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 23
    .line 24
    iget-wide v5, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v5

    .line 27
    .line 28
    if-eqz v0, :cond_2b

    .line 29
    .line 30
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    iget-wide v5, v0, Landroidx/media3/exoplayer/J0;->c:J

    .line 33
    .line 34
    iget-wide v7, v0, Landroidx/media3/exoplayer/J0;->d:J

    .line 35
    .line 36
    const/4 v10, 0x5

    .line 37
    move v9, p1

    .line 38
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 43
    .line 44
    :cond_2b
    return-void
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

.method private b2()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/J0;->m:I

    .line 8
    .line 9
    invoke-direct {p0, v1, v2, v0}, Landroidx/media3/exoplayer/n0;->c2(ZII)V

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

.method private c0(Lax/P0/G;FZZ)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    if-eqz p3, :cond_12

    .line 2
    .line 3
    if-eqz p4, :cond_a

    .line 4
    .line 5
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Landroidx/media3/exoplayer/J0;->g(Lax/P0/G;)Landroidx/media3/exoplayer/J0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 18
    .line 19
    :cond_12
    iget p3, p1, Lax/P0/G;->a:F

    .line 20
    .line 21
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/n0;->j2(F)V

    .line 22
    .line 23
    .line 24
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 25
    .line 26
    array-length p4, p3

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_1b
    if-ge v0, p4, :cond_27

    .line 29
    .line 30
    aget-object v1, p3, v0

    .line 31
    .line 32
    iget v2, p1, Lax/P0/G;->a:F

    .line 33
    .line 34
    invoke-virtual {v1, p2, v2}, Landroidx/media3/exoplayer/O0;->Q(FF)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_1b

    .line 40
    :cond_27
    return-void
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

.method private c1(Landroidx/media3/exoplayer/n0$h;Z)V
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 6
    .line 7
    move/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, v1, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_12

    .line 15
    .line 16
    iput-object v3, v1, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 22
    .line 23
    iget v5, v1, Landroidx/media3/exoplayer/n0;->R0:I

    .line 24
    .line 25
    iget-boolean v6, v1, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 26
    .line 27
    iget-object v7, v1, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 28
    .line 29
    iget-object v8, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/n0;->X0(Lax/P0/N;Landroidx/media3/exoplayer/n0$h;ZIZLax/P0/N$c;Lax/P0/N$b;)Landroid/util/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v8, 0x1

    .line 43
    if-nez v0, :cond_4d

    .line 44
    .line 45
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 46
    .line 47
    iget-object v9, v9, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 48
    .line 49
    invoke-direct {v1, v9}, Landroidx/media3/exoplayer/n0;->O(Lax/P0/N;)Landroid/util/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v10, Lax/i1/F$b;

    .line 56
    .line 57
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 66
    .line 67
    iget-object v9, v9, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 68
    .line 69
    invoke-virtual {v9}, Lax/P0/N;->q()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    xor-int/2addr v9, v8

    .line 74
    move-wide v5, v6

    .line 75
    :goto_4a
    const-wide/16 v15, 0x0

    .line 76
    .line 77
    goto :goto_a0

    .line 78
    :cond_4d
    iget-object v9, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v10, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v11

    .line 88
    iget-wide v13, v3, Landroidx/media3/exoplayer/n0$h;->c:J

    .line 89
    .line 90
    cmp-long v10, v13, v6

    .line 91
    .line 92
    if-nez v10, :cond_5f

    .line 93
    .line 94
    move-wide v13, v6

    .line 95
    goto :goto_60

    .line 96
    :cond_5f
    move-wide v13, v11

    .line 97
    :goto_60
    iget-object v10, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 98
    .line 99
    iget-object v15, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 100
    .line 101
    iget-object v15, v15, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 102
    .line 103
    invoke-virtual {v10, v15, v9, v11, v12}, Landroidx/media3/exoplayer/t0;->Q(Lax/P0/N;Ljava/lang/Object;J)Lax/i1/F$b;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-virtual {v10}, Lax/i1/F$b;->b()Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_94

    .line 112
    .line 113
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 114
    .line 115
    iget-object v6, v6, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 116
    .line 117
    iget-object v7, v10, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v9, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 120
    .line 121
    invoke-virtual {v6, v7, v9}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 122
    .line 123
    .line 124
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 125
    .line 126
    iget v7, v10, Lax/i1/F$b;->b:I

    .line 127
    .line 128
    invoke-virtual {v6, v7}, Lax/P0/N$b;->l(I)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    iget v7, v10, Lax/i1/F$b;->c:I

    .line 133
    .line 134
    if-ne v6, v7, :cond_8f

    .line 135
    .line 136
    iget-object v6, v1, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 137
    .line 138
    invoke-virtual {v6}, Lax/P0/N$b;->g()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    move-wide v11, v6

    .line 143
    goto :goto_91

    .line 144
    :cond_8f
    const-wide/16 v11, 0x0

    .line 145
    .line 146
    :goto_91
    move-wide v5, v13

    .line 147
    const/4 v9, 0x1

    .line 148
    goto :goto_4a

    .line 149
    :cond_94
    const-wide/16 v15, 0x0

    .line 150
    .line 151
    iget-wide v4, v3, Landroidx/media3/exoplayer/n0$h;->c:J

    .line 152
    .line 153
    cmp-long v9, v4, v6

    .line 154
    .line 155
    if-nez v9, :cond_9e

    .line 156
    .line 157
    const/4 v9, 0x1

    .line 158
    goto :goto_9f

    .line 159
    :cond_9e
    const/4 v9, 0x0

    .line 160
    :goto_9f
    move-wide v5, v13

    .line 161
    :goto_a0
    :try_start_a0
    iget-object v4, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 162
    .line 163
    iget-object v4, v4, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 164
    .line 165
    invoke-virtual {v4}, Lax/P0/N;->q()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_b2

    .line 170
    .line 171
    iput-object v3, v1, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 172
    .line 173
    goto :goto_c1

    .line 174
    :catchall_ad
    move-exception v0

    .line 175
    :goto_ae
    move-object v2, v10

    .line 176
    move-wide v3, v11

    .line 177
    goto/16 :goto_157

    .line 178
    .line 179
    :cond_b2
    const/4 v3, 0x4

    .line 180
    if-nez v0, :cond_c5

    .line 181
    .line 182
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 183
    .line 184
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 185
    .line 186
    if-eq v0, v8, :cond_be

    .line 187
    .line 188
    invoke-direct {v1, v3}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 189
    .line 190
    .line 191
    :cond_be
    invoke-direct {v1, v2, v8, v2, v8}, Landroidx/media3/exoplayer/n0;->Q0(ZZZZ)V

    .line 192
    .line 193
    .line 194
    :goto_c1
    move-object v2, v10

    .line 195
    move-wide v3, v11

    .line 196
    goto/16 :goto_14a

    .line 197
    .line 198
    :cond_c5
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 199
    .line 200
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 201
    .line 202
    invoke-virtual {v10, v0}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_121

    .line 207
    .line 208
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-eqz v0, :cond_ee

    .line 215
    .line 216
    iget-boolean v4, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 217
    .line 218
    if-eqz v4, :cond_ee

    .line 219
    .line 220
    cmp-long v4, v11, v15

    .line 221
    .line 222
    if-eqz v4, :cond_ee

    .line 223
    .line 224
    iget-object v0, v0, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 225
    .line 226
    iget-object v4, v1, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 227
    .line 228
    iget-wide v13, v4, Lax/P0/N$c;->m:J

    .line 229
    .line 230
    invoke-direct {v1, v13, v14}, Landroidx/media3/exoplayer/n0;->Q(J)Lax/Y0/Z;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-interface {v0, v11, v12, v4}, Lax/i1/C;->q(JLax/Y0/Z;)J

    .line 235
    .line 236
    .line 237
    move-result-wide v13

    .line 238
    goto :goto_ef

    .line 239
    :cond_ee
    move-wide v13, v11

    .line 240
    :goto_ef
    invoke-static {v13, v14}, Lax/S0/d0;->E1(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v15

    .line 244
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;
    :try_end_f5
    .catchall {:try_start_a0 .. :try_end_f5} :catchall_ad

    .line 245
    .line 246
    move/from16 p2, v9

    .line 247
    .line 248
    :try_start_f7
    iget-wide v8, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 249
    .line 250
    invoke-static {v8, v9}, Lax/S0/d0;->E1(J)J

    .line 251
    .line 252
    .line 253
    move-result-wide v7

    .line 254
    cmp-long v0, v15, v7

    .line 255
    .line 256
    if-nez v0, :cond_10c

    .line 257
    .line 258
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 259
    .line 260
    iget v7, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 261
    .line 262
    const/4 v8, 0x2

    .line 263
    if-eq v7, v8, :cond_10f

    .line 264
    .line 265
    const/4 v8, 0x3

    .line 266
    if-ne v7, v8, :cond_10c

    .line 267
    .line 268
    goto :goto_10f

    .line 269
    :cond_10c
    move/from16 v9, p2

    .line 270
    .line 271
    goto :goto_122

    .line 272
    :cond_10f
    :goto_10f
    iget-wide v3, v0, Landroidx/media3/exoplayer/J0;->s:J
    :try_end_111
    .catchall {:try_start_f7 .. :try_end_111} :catchall_11d

    .line 273
    .line 274
    move-object v2, v10

    .line 275
    const/4 v10, 0x2

    .line 276
    move-wide v7, v3

    .line 277
    move/from16 v9, p2

    .line 278
    .line 279
    :goto_116
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iput-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 284
    .line 285
    return-void

    .line 286
    :catchall_11d
    move-exception v0

    .line 287
    move/from16 v9, p2

    .line 288
    .line 289
    goto :goto_ae

    .line 290
    :cond_121
    move-wide v13, v11

    .line 291
    :goto_122
    :try_start_122
    iget-boolean v0, v1, Landroidx/media3/exoplayer/n0;->G0:Z

    .line 292
    .line 293
    iput-boolean v0, v1, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 294
    .line 295
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 296
    .line 297
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 298
    .line 299
    if-ne v0, v3, :cond_12e

    .line 300
    .line 301
    const/4 v0, 0x1

    .line 302
    goto :goto_12f

    .line 303
    :cond_12e
    const/4 v0, 0x0

    .line 304
    :goto_12f
    invoke-direct {v1, v10, v13, v14, v0}, Landroidx/media3/exoplayer/n0;->d1(Lax/i1/F$b;JZ)J

    .line 305
    .line 306
    .line 307
    move-result-wide v13
    :try_end_133
    .catchall {:try_start_122 .. :try_end_133} :catchall_ad

    .line 308
    cmp-long v0, v11, v13

    .line 309
    .line 310
    if-eqz v0, :cond_138

    .line 311
    .line 312
    const/4 v2, 0x1

    .line 313
    :cond_138
    or-int/2addr v9, v2

    .line 314
    :try_start_139
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 315
    .line 316
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 317
    .line 318
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;
    :try_end_13f
    .catchall {:try_start_139 .. :try_end_13f} :catchall_154

    .line 319
    .line 320
    const/4 v8, 0x1

    .line 321
    move-object v4, v2

    .line 322
    move-wide v6, v5

    .line 323
    move-object v3, v10

    .line 324
    move-object v5, v0

    .line 325
    :try_start_144
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/n0;->f2(Lax/P0/N;Lax/i1/F$b;Lax/P0/N;Lax/i1/F$b;JZ)V
    :try_end_147
    .catchall {:try_start_144 .. :try_end_147} :catchall_14f

    .line 326
    .line 327
    .line 328
    move-object v2, v3

    .line 329
    move-wide v5, v6

    .line 330
    move-wide v3, v13

    .line 331
    :goto_14a
    const/4 v10, 0x2

    .line 332
    move-wide v7, v3

    .line 333
    move-object/from16 v1, p0

    .line 334
    .line 335
    goto :goto_116

    .line 336
    :catchall_14f
    move-exception v0

    .line 337
    move-object v2, v3

    .line 338
    move-wide v5, v6

    .line 339
    :goto_152
    move-wide v3, v13

    .line 340
    goto :goto_157

    .line 341
    :catchall_154
    move-exception v0

    .line 342
    move-object v2, v10

    .line 343
    goto :goto_152

    .line 344
    :goto_157
    const/4 v10, 0x2

    .line 345
    move-wide v7, v3

    .line 346
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iput-object v2, v1, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 351
    .line 352
    throw v0
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private c2(ZII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 4
    .line 5
    iget v1, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/g;->n(ZI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/n0;->d2(ZIII)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method private d0(Lax/P0/G;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget v0, p1, Lax/P0/G;->a:F

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/n0;->c0(Lax/P0/G;FZZ)V

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

.method private d1(Lax/i1/F$b;JZ)J
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_15

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    const/4 v5, 0x1

    .line 17
    :goto_10
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move-wide v3, p2

    .line 20
    move v6, p4

    .line 21
    goto :goto_18

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    goto :goto_10

    .line 25
    :goto_18
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/n0;->e1(Lax/i1/F$b;JZZ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    return-wide p1
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
.end method

.method private d2(ZIII)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    if-eq p2, p1, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 p1, 0x0

    .line 10
    :goto_9
    invoke-static {p2, p4}, Landroidx/media3/exoplayer/n0;->a2(II)I

    .line 11
    .line 12
    .line 13
    move-result p4

    .line 14
    invoke-static {p2, p3}, Landroidx/media3/exoplayer/n0;->g2(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    iget-boolean v1, p3, Landroidx/media3/exoplayer/J0;->l:Z

    .line 21
    .line 22
    if-ne v1, p1, :cond_20

    .line 23
    .line 24
    iget v1, p3, Landroidx/media3/exoplayer/J0;->n:I

    .line 25
    .line 26
    if-ne v1, p2, :cond_20

    .line 27
    .line 28
    iget v1, p3, Landroidx/media3/exoplayer/J0;->m:I

    .line 29
    .line 30
    if-ne v1, p4, :cond_20

    .line 31
    .line 32
    goto :goto_69

    .line 33
    :cond_20
    invoke-virtual {p3, p1, p4, p2}, Landroidx/media3/exoplayer/J0;->e(ZII)Landroidx/media3/exoplayer/J0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 38
    .line 39
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/n0;->h2(ZZ)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->E0(Z)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_4c

    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->V1()V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->e2()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 58
    .line 59
    iget-boolean p2, p1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 60
    .line 61
    if-eqz p2, :cond_44

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/J0;->i(Z)Landroidx/media3/exoplayer/J0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 68
    .line 69
    :cond_44
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 70
    .line 71
    iget-wide p2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 72
    .line 73
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/t0;->K(J)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 78
    .line 79
    iget p1, p1, Landroidx/media3/exoplayer/J0;->e:I

    .line 80
    .line 81
    const/4 p2, 0x3

    .line 82
    const/4 p3, 0x2

    .line 83
    if-ne p1, p2, :cond_62

    .line 84
    .line 85
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/media3/exoplayer/k;->f()V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->S1()V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 94
    .line 95
    invoke-interface {p1, p3}, Lax/S0/q;->f(I)Z

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_62
    if-ne p1, p3, :cond_69

    .line 100
    .line 101
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 102
    .line 103
    invoke-interface {p1, p3}, Lax/S0/q;->f(I)Z

    .line 104
    .line 105
    .line 106
    :cond_69
    :goto_69
    return-void
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

.method private e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;
    .registers 23

    .line 1
    move-wide/from16 v4, p4

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->b1:Z

    .line 4
    .line 5
    if-nez v0, :cond_1b

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    iget-wide v0, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 10
    .line 11
    cmp-long v2, p2, v0

    .line 12
    .line 13
    if-nez v2, :cond_1b

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    const/4 v0, 0x0

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    :goto_1b
    const/4 v0, 0x1

    .line 29
    :goto_1c
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->b1:Z

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->R0()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 35
    .line 36
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->h:Lax/i1/q0;

    .line 37
    .line 38
    iget-object v2, v0, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroidx/media3/exoplayer/I0;->t()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_66

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_3c

    .line 57
    .line 58
    sget-object v1, Lax/i1/q0;->d:Lax/i1/q0;

    .line 59
    .line 60
    goto :goto_40

    .line 61
    :cond_3c
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->o()Lax/i1/q0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_40
    if-nez v0, :cond_45

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->f0:Lax/l1/K;

    .line 68
    .line 69
    goto :goto_49

    .line 70
    :cond_45
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_49
    iget-object v3, v2, Lax/l1/K;->c:[Lax/l1/D;

    .line 75
    .line 76
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/n0;->J([Lax/l1/D;)Lax/r7/z;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v0, :cond_5f

    .line 81
    .line 82
    iget-object v6, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 83
    .line 84
    iget-wide v7, v6, Landroidx/media3/exoplayer/r0;->c:J

    .line 85
    .line 86
    cmp-long v9, v7, v4

    .line 87
    .line 88
    if-eqz v9, :cond_5f

    .line 89
    .line 90
    invoke-virtual {v6, v4, v5}, Landroidx/media3/exoplayer/r0;->a(J)Landroidx/media3/exoplayer/r0;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iput-object v6, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 95
    .line 96
    :cond_5f
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->v0()V

    .line 97
    .line 98
    .line 99
    move-object v10, v1

    .line 100
    move-object v11, v2

    .line 101
    move-object v12, v3

    .line 102
    goto :goto_7b

    .line 103
    :cond_66
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 104
    .line 105
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_78

    .line 112
    .line 113
    sget-object v1, Lax/i1/q0;->d:Lax/i1/q0;

    .line 114
    .line 115
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->f0:Lax/l1/K;

    .line 116
    .line 117
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_78
    move-object v12, v0

    .line 122
    move-object v10, v1

    .line 123
    move-object v11, v2

    .line 124
    :goto_7b
    if-eqz p8, :cond_84

    .line 125
    .line 126
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 127
    .line 128
    move/from16 v1, p9

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->d(I)V

    .line 131
    .line 132
    .line 133
    :cond_84
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 134
    .line 135
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->S()J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    move-object v1, p1

    .line 140
    move-wide v2, p2

    .line 141
    move-wide/from16 v6, p6

    .line 142
    .line 143
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/J0;->d(Lax/i1/F$b;JJJJLax/i1/q0;Lax/l1/K;Ljava/util/List;)Landroidx/media3/exoplayer/J0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method private e1(Lax/i1/F$b;JZZ)J
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->V1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/n0;->h2(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_12

    .line 11
    .line 12
    iget-object p5, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 13
    .line 14
    iget p5, p5, Landroidx/media3/exoplayer/J0;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_15

    .line 18
    .line 19
    :cond_12
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/n0;->H1(I)V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object p5, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 23
    .line 24
    invoke-virtual {p5}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    move-object v3, p5

    .line 29
    :goto_1c
    if-eqz v3, :cond_2e

    .line 30
    .line 31
    iget-object v4, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 32
    .line 33
    iget-object v4, v4, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 34
    .line 35
    invoke-virtual {p1, v4}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_29

    .line 40
    .line 41
    goto :goto_2e

    .line 42
    :cond_29
    invoke-virtual {v3}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_1c

    .line 47
    :cond_2e
    :goto_2e
    if-nez p4, :cond_3e

    .line 48
    .line 49
    if-ne p5, v3, :cond_3e

    .line 50
    .line 51
    if-eqz v3, :cond_63

    .line 52
    .line 53
    invoke-virtual {v3, p2, p3}, Landroidx/media3/exoplayer/q0;->D(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p4

    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    cmp-long p1, p4, v4

    .line 60
    .line 61
    if-gez p1, :cond_63

    .line 62
    .line 63
    :cond_3e
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->D()V

    .line 64
    .line 65
    .line 66
    if-eqz v3, :cond_63

    .line 67
    .line 68
    :goto_43
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eq p1, v3, :cond_51

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->b()Landroidx/media3/exoplayer/q0;

    .line 79
    .line 80
    .line 81
    goto :goto_43

    .line 82
    :cond_51
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 85
    .line 86
    .line 87
    const-wide p4, 0xe8d4a51000L

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p4, p5}, Landroidx/media3/exoplayer/q0;->B(J)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->G()V

    .line 96
    .line 97
    .line 98
    iput-boolean v1, v3, Landroidx/media3/exoplayer/q0;->i:Z

    .line 99
    .line 100
    :cond_63
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 101
    .line 102
    .line 103
    if-eqz v3, :cond_96

    .line 104
    .line 105
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 108
    .line 109
    .line 110
    iget-boolean p1, v3, Landroidx/media3/exoplayer/q0;->f:Z

    .line 111
    .line 112
    if-nez p1, :cond_7a

    .line 113
    .line 114
    iget-object p1, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 115
    .line 116
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/r0;->b(J)Landroidx/media3/exoplayer/r0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, v3, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 121
    .line 122
    goto :goto_8f

    .line 123
    :cond_7a
    iget-boolean p1, v3, Landroidx/media3/exoplayer/q0;->g:Z

    .line 124
    .line 125
    if-eqz p1, :cond_8f

    .line 126
    .line 127
    iget-object p1, v3, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 128
    .line 129
    invoke-interface {p1, p2, p3}, Lax/i1/C;->m(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide p2

    .line 133
    iget-object p1, v3, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 134
    .line 135
    iget-wide p4, p0, Landroidx/media3/exoplayer/n0;->n0:J

    .line 136
    .line 137
    sub-long p4, p2, p4

    .line 138
    .line 139
    iget-boolean v1, p0, Landroidx/media3/exoplayer/n0;->o0:Z

    .line 140
    .line 141
    invoke-interface {p1, p4, p5, v1}, Lax/i1/C;->v(JZ)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    :goto_8f
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 148
    .line 149
    .line 150
    goto :goto_9e

    .line 151
    :cond_96
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->g()V

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 157
    .line 158
    .line 159
    :goto_9e
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 163
    .line 164
    invoke-interface {p1, v2}, Lax/S0/q;->f(I)Z

    .line 165
    .line 166
    .line 167
    return-wide p2
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method private e2()V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_a

    .line 8
    .line 9
    goto/16 :goto_100

    .line 10
    .line 11
    :cond_a
    iget-boolean v2, v1, Landroidx/media3/exoplayer/q0;->f:Z

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1a

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 21
    .line 22
    invoke-interface {v2}, Lax/i1/C;->s()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    move-wide v5, v3

    .line 28
    :goto_1b
    const/4 v10, 0x0

    .line 29
    cmp-long v2, v5, v3

    .line 30
    .line 31
    if-eqz v2, :cond_51

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->s()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_31

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-direct {p0, v5, v6}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 54
    .line 55
    iget-wide v1, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 56
    .line 57
    cmp-long v3, v5, v1

    .line 58
    .line 59
    if-eqz v3, :cond_95

    .line 60
    .line 61
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 64
    .line 65
    iget-wide v3, v1, Landroidx/media3/exoplayer/J0;->c:J

    .line 66
    .line 67
    const/4 v8, 0x1

    .line 68
    const/4 v9, 0x5

    .line 69
    move-object v1, v2

    .line 70
    move-wide v11, v5

    .line 71
    move-wide v4, v3

    .line 72
    move-wide v2, v11

    .line 73
    move-wide v6, v2

    .line 74
    move-object v0, p0

    .line 75
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 80
    .line 81
    goto :goto_95

    .line 82
    :cond_51
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const/4 v4, 0x1

    .line 91
    if-eq v1, v3, :cond_5e

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    goto :goto_5f

    .line 95
    :cond_5e
    const/4 v3, 0x0

    .line 96
    :goto_5f
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/k;->i(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    iput-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 107
    .line 108
    iget-wide v5, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 109
    .line 110
    invoke-direct {p0, v5, v6, v2, v3}, Landroidx/media3/exoplayer/n0;->t0(JJ)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/media3/exoplayer/k;->z()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_90

    .line 120
    .line 121
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 122
    .line 123
    iget-boolean v1, v1, Landroidx/media3/exoplayer/n0$e;->d:Z

    .line 124
    .line 125
    xor-int/lit8 v8, v1, 0x1

    .line 126
    .line 127
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 128
    .line 129
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 130
    .line 131
    iget-wide v5, v1, Landroidx/media3/exoplayer/J0;->c:J

    .line 132
    .line 133
    const/4 v9, 0x6

    .line 134
    move-object v1, v4

    .line 135
    move-wide v4, v5

    .line 136
    move-wide v6, v2

    .line 137
    move-object v0, p0

    .line 138
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iput-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 143
    .line 144
    goto :goto_95

    .line 145
    :cond_90
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 146
    .line 147
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/J0;->o(J)V

    .line 148
    .line 149
    .line 150
    :cond_95
    :goto_95
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 151
    .line 152
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->j()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    iput-wide v3, v2, Landroidx/media3/exoplayer/J0;->q:J

    .line 163
    .line 164
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 165
    .line 166
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->S()J

    .line 167
    .line 168
    .line 169
    move-result-wide v2

    .line 170
    iput-wide v2, v1, Landroidx/media3/exoplayer/J0;->r:J

    .line 171
    .line 172
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 173
    .line 174
    iget-boolean v2, v1, Landroidx/media3/exoplayer/J0;->l:Z

    .line 175
    .line 176
    if-eqz v2, :cond_100

    .line 177
    .line 178
    iget v2, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 179
    .line 180
    const/4 v3, 0x3

    .line 181
    if-ne v2, v3, :cond_100

    .line 182
    .line 183
    iget-object v2, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 184
    .line 185
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 186
    .line 187
    invoke-direct {p0, v2, v1}, Landroidx/media3/exoplayer/n0;->R1(Lax/P0/N;Lax/i1/F$b;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_100

    .line 192
    .line 193
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 194
    .line 195
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 196
    .line 197
    iget v1, v1, Lax/P0/G;->a:F

    .line 198
    .line 199
    const/high16 v2, 0x3f800000    # 1.0f

    .line 200
    .line 201
    cmpl-float v1, v1, v2

    .line 202
    .line 203
    if-nez v1, :cond_100

    .line 204
    .line 205
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 206
    .line 207
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->K()J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 212
    .line 213
    iget-wide v4, v4, Landroidx/media3/exoplayer/J0;->r:J

    .line 214
    .line 215
    invoke-interface {v1, v2, v3, v4, v5}, Lax/Y0/P;->a(JJ)F

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget v2, v2, Lax/P0/G;->a:F

    .line 226
    .line 227
    cmpl-float v2, v2, v1

    .line 228
    .line 229
    if-eqz v2, :cond_100

    .line 230
    .line 231
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 232
    .line 233
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 234
    .line 235
    invoke-virtual {v2, v1}, Lax/P0/G;->b(F)Lax/P0/G;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/n0;->m1(Lax/P0/G;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 243
    .line 244
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 245
    .line 246
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    iget v2, v2, Lax/P0/G;->a:F

    .line 253
    .line 254
    invoke-direct {p0, v1, v2, v10, v10}, Landroidx/media3/exoplayer/n0;->c0(Lax/P0/G;FZZ)V

    .line 255
    .line 256
    .line 257
    :cond_100
    :goto_100
    return-void
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private f0()Z
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    const/4 v1, 0x0

    .line 14
    :goto_d
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v1, v4, :cond_1e

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Landroidx/media3/exoplayer/O0;->o(Landroidx/media3/exoplayer/q0;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1b

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_d

    .line 31
    :cond_1e
    const/4 v0, 0x1

    .line 32
    return v0
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

.method private f1(Landroidx/media3/exoplayer/K0;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v4, v0, v2

    .line 11
    .line 12
    if-nez v4, :cond_11

    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->g1(Landroidx/media3/exoplayer/K0;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_26

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Landroidx/media3/exoplayer/n0$d;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/n0$d;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    new-instance v2, Landroidx/media3/exoplayer/n0$d;

    .line 40
    .line 41
    invoke-direct {v2, p1}, Landroidx/media3/exoplayer/n0$d;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 45
    .line 46
    iget-object v3, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 47
    .line 48
    iget v5, p0, Landroidx/media3/exoplayer/n0;->R0:I

    .line 49
    .line 50
    iget-boolean v6, p0, Landroidx/media3/exoplayer/n0;->S0:Z

    .line 51
    .line 52
    iget-object v7, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 53
    .line 54
    iget-object v8, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 55
    .line 56
    move-object v4, v3

    .line 57
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/n0;->U0(Landroidx/media3/exoplayer/n0$d;Lax/P0/N;Lax/P0/N;IZLax/P0/N$c;Lax/P0/N$b;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_49

    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 76
    .line 77
    .line 78
    return-void
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

.method private f2(Lax/P0/N;Lax/i1/F$b;Lax/P0/N;Lax/i1/F$b;JZ)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/n0;->R1(Lax/P0/N;Lax/i1/F$b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2d

    .line 6
    .line 7
    invoke-virtual {p2}, Lax/i1/F$b;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_f

    .line 12
    .line 13
    sget-object p1, Lax/P0/G;->d:Lax/P0/G;

    .line 14
    .line 15
    goto :goto_13

    .line 16
    :cond_f
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 19
    .line 20
    :goto_13
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2, p1}, Lax/P0/G;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_87

    .line 31
    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->m1(Lax/P0/G;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 36
    .line 37
    iget-object p2, p2, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 38
    .line 39
    iget p1, p1, Lax/P0/G;->a:F

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-direct {p0, p2, p1, p3, p3}, Landroidx/media3/exoplayer/n0;->c0(Lax/P0/G;FZZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    iget-object v0, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, Lax/P0/N$b;->c:I

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 64
    .line 65
    iget-object v1, v1, Lax/P0/N$c;->j:Lax/P0/y$g;

    .line 66
    .line 67
    invoke-static {v1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lax/P0/y$g;

    .line 72
    .line 73
    invoke-interface {v0, v1}, Lax/Y0/P;->d(Lax/P0/y$g;)V

    .line 74
    .line 75
    .line 76
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmp-long v2, p5, v0

    .line 82
    .line 83
    if-eqz v2, :cond_60

    .line 84
    .line 85
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 86
    .line 87
    iget-object p2, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {p0, p1, p2, p5, p6}, Landroidx/media3/exoplayer/n0;->M(Lax/P0/N;Ljava/lang/Object;J)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    invoke-interface {p3, p1, p2}, Lax/Y0/P;->e(J)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_60
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 98
    .line 99
    iget-object p1, p1, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p3}, Lax/P0/N;->q()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_7d

    .line 106
    .line 107
    iget-object p2, p4, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object p4, p0, Landroidx/media3/exoplayer/n0;->m0:Lax/P0/N$b;

    .line 110
    .line 111
    invoke-virtual {p3, p2, p4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget p2, p2, Lax/P0/N$b;->c:I

    .line 116
    .line 117
    iget-object p4, p0, Landroidx/media3/exoplayer/n0;->l0:Lax/P0/N$c;

    .line 118
    .line 119
    invoke-virtual {p3, p2, p4}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iget-object p2, p2, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 124
    .line 125
    goto :goto_7e

    .line 126
    :cond_7d
    const/4 p2, 0x0

    .line 127
    :goto_7e
    invoke-static {p2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_88

    .line 132
    .line 133
    if-eqz p7, :cond_87

    .line 134
    .line 135
    goto :goto_88

    .line 136
    :cond_87
    return-void

    .line 137
    :cond_88
    :goto_88
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->v0:Lax/Y0/P;

    .line 138
    .line 139
    invoke-interface {p1, v0, v1}, Lax/Y0/P;->e(J)V

    .line 140
    .line 141
    .line 142
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method private g0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->y0:Z

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->G0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 10
    .line 11
    iget-boolean v0, v0, Lax/Y0/Y;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x1

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method private g1(Landroidx/media3/exoplayer/K0;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->b()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1d

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->A(Landroidx/media3/exoplayer/K0;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 13
    .line 14
    iget p1, p1, Landroidx/media3/exoplayer/J0;->e:I

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v0, :cond_17

    .line 19
    .line 20
    if-ne p1, v1, :cond_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    return-void

    .line 24
    :cond_17
    :goto_17
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lax/S0/q;->f(I)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 31
    .line 32
    const/16 v1, 0xf

    .line 33
    .line 34
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method private static g2(II)I
    .registers 3

    .line 1
    const/4 v0, 0x1

    if-nez p0, :cond_4

    return v0

    :cond_4
    if-ne p1, v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    return p1
.end method

.method private static h0(ZLax/i1/F$b;JLax/i1/F$b;Lax/P0/N$b;J)Z
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_48

    .line 3
    .line 4
    cmp-long p0, p2, p6

    .line 5
    .line 6
    if-nez p0, :cond_48

    .line 7
    .line 8
    iget-object p0, p1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p2, p4, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_12

    .line 17
    .line 18
    goto :goto_48

    .line 19
    :cond_12
    invoke-virtual {p1}, Lax/i1/F$b;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p2, 0x1

    .line 24
    if-eqz p0, :cond_39

    .line 25
    .line 26
    iget p0, p1, Lax/i1/F$b;->b:I

    .line 27
    .line 28
    invoke-virtual {p5, p0}, Lax/P0/N$b;->s(I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_39

    .line 33
    .line 34
    iget p0, p1, Lax/i1/F$b;->b:I

    .line 35
    .line 36
    iget p3, p1, Lax/i1/F$b;->c:I

    .line 37
    .line 38
    invoke-virtual {p5, p0, p3}, Lax/P0/N$b;->h(II)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p3, 0x4

    .line 43
    if-eq p0, p3, :cond_38

    .line 44
    .line 45
    iget p0, p1, Lax/i1/F$b;->b:I

    .line 46
    .line 47
    iget p1, p1, Lax/i1/F$b;->c:I

    .line 48
    .line 49
    invoke-virtual {p5, p0, p1}, Lax/P0/N$b;->h(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 p1, 0x2

    .line 54
    if-eq p0, p1, :cond_38

    .line 55
    .line 56
    return p2

    .line 57
    :cond_38
    return v0

    .line 58
    :cond_39
    invoke-virtual {p4}, Lax/i1/F$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_48

    .line 63
    .line 64
    iget p0, p4, Lax/i1/F$b;->b:I

    .line 65
    .line 66
    invoke-virtual {p5, p0}, Lax/P0/N$b;->s(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_48

    .line 71
    .line 72
    return p2

    .line 73
    :cond_48
    :goto_48
    return v0
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method private h1(Landroidx/media3/exoplayer/K0;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->b()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1a

    .line 14
    .line 15
    const-string v0, "TAG"

    .line 16
    .line 17
    const-string v1, "Trying to send message on a dead thread."

    .line 18
    .line 19
    invoke-static {v0, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v1, v0, v2}, Lax/S0/h;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lax/S0/q;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Landroidx/media3/exoplayer/k0;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1}, Landroidx/media3/exoplayer/k0;-><init>(Landroidx/media3/exoplayer/n0;Landroidx/media3/exoplayer/K0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
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

.method private h2(ZZ)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->O0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_d

    .line 4
    .line 5
    if-nez p2, :cond_d

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 8
    .line 9
    invoke-interface {p1}, Lax/S0/h;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    goto :goto_12

    .line 14
    :cond_d
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    :goto_12
    iput-wide p1, p0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 20
    .line 21
    return-void
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

.method private i0(Landroidx/media3/exoplayer/q0;)Z
    .registers 6

    .line 1
    if-eqz p1, :cond_14

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/media3/exoplayer/q0;->l()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/high16 v2, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-eqz p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private i1(J)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_e

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Landroidx/media3/exoplayer/O0;->N(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private i2()Z
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    :goto_e
    iget-object v5, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 16
    .line 17
    array-length v6, v5

    .line 18
    if-ge v4, v6, :cond_47

    .line 19
    .line 20
    aget-object v5, v5, v4

    .line 21
    .line 22
    invoke-virtual {v5}, Landroidx/media3/exoplayer/O0;->h()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iget-object v6, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 27
    .line 28
    aget-object v6, v6, v4

    .line 29
    .line 30
    iget-object v8, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 31
    .line 32
    invoke-virtual {v6, v2, v0, v8}, Landroidx/media3/exoplayer/O0;->J(Landroidx/media3/exoplayer/q0;Lax/l1/K;Landroidx/media3/exoplayer/k;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    and-int/lit8 v8, v6, 0x2

    .line 37
    .line 38
    if-eqz v8, :cond_2e

    .line 39
    .line 40
    iget-boolean v8, p0, Landroidx/media3/exoplayer/n0;->V0:Z

    .line 41
    .line 42
    if-eqz v8, :cond_2e

    .line 43
    .line 44
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/n0;->p1(Z)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget v8, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 48
    .line 49
    iget-object v9, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 50
    .line 51
    aget-object v9, v9, v4

    .line 52
    .line 53
    invoke-virtual {v9}, Landroidx/media3/exoplayer/O0;->h()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    sub-int/2addr v5, v9

    .line 58
    sub-int/2addr v8, v5

    .line 59
    iput v8, p0, Landroidx/media3/exoplayer/n0;->W0:I

    .line 60
    .line 61
    and-int/lit8 v5, v6, 0x1

    .line 62
    .line 63
    if-eqz v5, :cond_42

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    goto :goto_43

    .line 67
    :cond_42
    const/4 v5, 0x0

    .line 68
    :goto_43
    and-int/2addr v7, v5

    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_e

    .line 72
    :cond_47
    if-eqz v7, :cond_6a

    .line 73
    .line 74
    :goto_49
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 75
    .line 76
    array-length v1, v1

    .line 77
    if-ge v3, v1, :cond_6a

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Lax/l1/K;->c(I)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_67

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 86
    .line 87
    aget-object v1, v1, v3

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/O0;->x(Landroidx/media3/exoplayer/q0;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_67

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->n()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    move-object v1, p0

    .line 101
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/n0;->F(Landroidx/media3/exoplayer/q0;IZJ)V

    .line 102
    .line 103
    .line 104
    :cond_67
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_49

    .line 107
    :cond_6a
    return v7
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private j0(ILax/i1/F$b;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_28

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_19

    .line 24
    .line 25
    goto :goto_28

    .line 26
    :cond_19
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 27
    .line 28
    aget-object p1, p2, p1

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/O0;->v(Landroidx/media3/exoplayer/q0;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_28
    :goto_28
    const/4 p1, 0x0

    .line 42
    return p1
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
.end method

.method private j2(F)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    if-eqz v0, :cond_21

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lax/l1/K;->c:[Lax/l1/D;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_10
    if-ge v3, v2, :cond_1c

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_19

    .line 22
    .line 23
    invoke-interface {v4, p1}, Lax/l1/D;->p(F)V

    .line 24
    .line 25
    .line 26
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_10

    .line 29
    :cond_1c
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_6

    .line 34
    :cond_21
    return-void
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

.method private k0()Z
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 8
    .line 9
    iget-wide v1, v1, Landroidx/media3/exoplayer/r0;->e:J

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_27

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-eqz v0, :cond_25

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 25
    .line 26
    iget-wide v3, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 27
    .line 28
    cmp-long v0, v3, v1

    .line 29
    .line 30
    if-ltz v0, :cond_25

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P1()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_27

    .line 37
    .line 38
    :cond_25
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_27
    const/4 v0, 0x0

    .line 41
    return v0
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

.method private k1(Lax/P0/c;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->e0:Lax/l1/J;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/l1/J;->l(Lax/P0/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->C0:Landroidx/media3/exoplayer/g;

    .line 7
    .line 8
    if-eqz p2, :cond_a

    .line 9
    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 p1, 0x0

    .line 12
    :goto_b
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/g;->k(Lax/P0/c;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->b2()V

    .line 16
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

.method private static l0(Landroidx/media3/exoplayer/J0;Lax/P0/N$b;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_17

    .line 10
    .line 11
    iget-object v0, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-boolean p0, p0, Lax/P0/N$b;->f:Z

    .line 18
    .line 19
    if-eqz p0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_17
    :goto_17
    const/4 p0, 0x1

    .line 25
    return p0
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

.method private l1(ZLax/S0/k;)V
    .registers 6

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->T0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_16

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->T0:Z

    .line 6
    .line 7
    if-nez p1, :cond_16

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_c
    if-ge v1, v0, :cond_16

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/media3/exoplayer/O0;->L()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_c

    .line 23
    :cond_16
    if-eqz p2, :cond_1b

    .line 24
    .line 25
    invoke-virtual {p2}, Lax/S0/k;->f()Z

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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

.method public static synthetic m(Landroidx/media3/exoplayer/n0;Landroidx/media3/exoplayer/r0;J)Landroidx/media3/exoplayer/q0;
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/n0;->z(Landroidx/media3/exoplayer/r0;J)Landroidx/media3/exoplayer/q0;

    move-result-object p0

    return-object p0
.end method

.method private m0()V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->O1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->Q0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3c

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/media3/exoplayer/q0;

    .line 20
    .line 21
    new-instance v1, Landroidx/media3/exoplayer/p0$b;

    .line 22
    .line 23
    invoke-direct {v1}, Landroidx/media3/exoplayer/p0$b;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/p0$b;->f(J)Landroidx/media3/exoplayer/p0$b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget v2, v2, Lax/P0/G;->a:F

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/p0$b;->g(F)Landroidx/media3/exoplayer/p0$b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 49
    .line 50
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/p0$b;->e(J)Landroidx/media3/exoplayer/p0$b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroidx/media3/exoplayer/p0$b;->d()Landroidx/media3/exoplayer/p0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/q0;->e(Landroidx/media3/exoplayer/p0;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->W1()V

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private m1(Lax/P0/G;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lax/S0/q;->i(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/k;->e(Lax/P0/G;)V

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

.method public static synthetic n(Landroidx/media3/exoplayer/n0;IZ)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->z0:Lax/Z0/a;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/exoplayer/O0;->m()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-interface {v0, p1, p0, p2}, Lax/Z0/a;->T(IIZ)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method private n0()V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->I()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->w()Landroidx/media3/exoplayer/q0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_6f

    .line 13
    .line 14
    iget-boolean v1, v0, Landroidx/media3/exoplayer/q0;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_15

    .line 17
    .line 18
    iget-boolean v1, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 19
    .line 20
    if-eqz v1, :cond_6f

    .line 21
    .line 22
    :cond_15
    iget-object v1, v0, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 23
    .line 24
    invoke-interface {v1}, Lax/i1/C;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_6f

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 33
    .line 34
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 35
    .line 36
    iget-object v3, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 39
    .line 40
    iget-boolean v4, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 41
    .line 42
    if-eqz v4, :cond_32

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 45
    .line 46
    invoke-interface {v4}, Lax/i1/C;->d()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_34

    .line 51
    :cond_32
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    :goto_34
    invoke-interface {v1, v2, v3, v4, v5}, Landroidx/media3/exoplayer/o0;->e(Lax/P0/N;Lax/i1/F$b;J)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3b

    .line 58
    .line 59
    goto :goto_6f

    .line 60
    :cond_3b
    iget-boolean v1, v0, Landroidx/media3/exoplayer/q0;->e:Z

    .line 61
    .line 62
    if-nez v1, :cond_47

    .line 63
    .line 64
    iget-object v1, v0, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 65
    .line 66
    iget-wide v1, v1, Landroidx/media3/exoplayer/r0;->b:J

    .line 67
    .line 68
    invoke-virtual {v0, p0, v1, v2}, Landroidx/media3/exoplayer/q0;->v(Lax/i1/C$a;J)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_47
    new-instance v1, Landroidx/media3/exoplayer/p0$b;

    .line 73
    .line 74
    invoke-direct {v1}, Landroidx/media3/exoplayer/p0$b;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 78
    .line 79
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/q0;->C(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/p0$b;->f(J)Landroidx/media3/exoplayer/p0$b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget v2, v2, Lax/P0/G;->a:F

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/p0$b;->g(F)Landroidx/media3/exoplayer/p0$b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->P0:J

    .line 100
    .line 101
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/p0$b;->e(J)Landroidx/media3/exoplayer/p0$b;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroidx/media3/exoplayer/p0$b;->d()Landroidx/media3/exoplayer/p0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/q0;->e(Landroidx/media3/exoplayer/p0;)V

    .line 110
    .line 111
    .line 112
    :cond_6f
    :goto_6f
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private n1(Landroidx/media3/exoplayer/n0$b;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->a(Landroidx/media3/exoplayer/n0$b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_29

    .line 13
    .line 14
    new-instance v0, Landroidx/media3/exoplayer/n0$h;

    .line 15
    .line 16
    new-instance v1, Landroidx/media3/exoplayer/L0;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->b(Landroidx/media3/exoplayer/n0$b;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->c(Landroidx/media3/exoplayer/n0$b;)Lax/i1/g0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/L0;-><init>(Ljava/util/Collection;Lax/i1/g0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->a(Landroidx/media3/exoplayer/n0$b;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->d(Landroidx/media3/exoplayer/n0$b;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/n0$h;-><init>(Lax/P0/N;IJ)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->X0:Landroidx/media3/exoplayer/n0$h;

    .line 41
    .line 42
    :cond_29
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->b(Landroidx/media3/exoplayer/n0$b;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->c(Landroidx/media3/exoplayer/n0$b;)Lax/i1/g0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/I0;->C(Ljava/util/List;Lax/i1/g0;)Lax/P0/N;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method public static synthetic o(Landroidx/media3/exoplayer/n0;Lax/o1/z;JJLax/P0/v;Landroid/media/MediaFormat;)V
    .registers 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface/range {p1 .. p7}, Lax/o1/z;->g(JJLax/P0/v;Landroid/media/MediaFormat;)V

    .line 5
    .line 6
    .line 7
    move-wide p1, p2

    .line 8
    move-wide p3, p4

    .line 9
    move-object p5, p6

    .line 10
    move-object p6, p7

    .line 11
    invoke-virtual/range {p0 .. p6}, Landroidx/media3/exoplayer/n0;->g(JJLax/P0/v;Landroid/media/MediaFormat;)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method private o0()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_e

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->D()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_4

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

.method public static synthetic p(Landroidx/media3/exoplayer/n0;Landroidx/media3/exoplayer/K0;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_3
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->A(Landroidx/media3/exoplayer/K0;)V
    :try_end_6
    .catch Landroidx/media3/exoplayer/s; {:try_start_3 .. :try_end_6} :catch_7

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_7
    move-exception p0

    .line 9
    const-string p1, "ExoPlayerImplInternal"

    .line 10
    .line 11
    const-string v0, "Unexpected error delivering message on external thread."

    .line 12
    .line 13
    invoke-static {p1, v0, p0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
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

.method private p0()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->c(Landroidx/media3/exoplayer/J0;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/exoplayer/n0$e;->a(Landroidx/media3/exoplayer/n0$e;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1f

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->s0:Landroidx/media3/exoplayer/n0$f;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/n0$f;->a(Landroidx/media3/exoplayer/n0$e;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroidx/media3/exoplayer/n0$e;

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/n0$e;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 31
    .line 32
    :cond_1f
    return-void
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

.method private p1(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->V0:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_5

    .line 4
    .line 5
    goto :goto_15

    .line 6
    :cond_5
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->V0:Z

    .line 7
    .line 8
    if-nez p1, :cond_15

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 11
    .line 12
    iget-boolean p1, p1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 13
    .line 14
    if-eqz p1, :cond_15

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-interface {p1, v0}, Lax/S0/q;->f(I)Z

    .line 20
    .line 21
    .line 22
    :cond_15
    :goto_15
    return-void
.end method

.method static synthetic q(Landroidx/media3/exoplayer/n0;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->U0:Z

    .line 2
    .line 3
    return p1
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

.method private q0()V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_a

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    goto :goto_64

    .line 11
    :cond_a
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_10
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 18
    .line 19
    array-length v1, v1

    .line 20
    if-ge v3, v1, :cond_44

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lax/l1/K;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_40

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 29
    .line 30
    aget-object v1, v1, v3

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/media3/exoplayer/O0;->s()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_40

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 39
    .line 40
    aget-object v1, v1, v3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/media3/exoplayer/O0;->u()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_40

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 49
    .line 50
    aget-object v1, v1, v3

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/media3/exoplayer/O0;->X()V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->n()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    move-object v1, p0

    .line 61
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/n0;->F(Landroidx/media3/exoplayer/q0;IZJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_41

    .line 65
    :cond_40
    move-object v1, p0

    .line 66
    :goto_41
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_10

    .line 69
    :cond_44
    move-object v1, p0

    .line 70
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_64

    .line 75
    .line 76
    iget-object v0, v2, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 77
    .line 78
    invoke-interface {v0}, Lax/i1/C;->s()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iput-wide v3, v1, Landroidx/media3/exoplayer/n0;->h1:J

    .line 83
    .line 84
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->s()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_64

    .line 89
    .line 90
    iget-object v0, v1, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v7}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 99
    .line 100
    .line 101
    :cond_64
    :goto_64
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private q1(Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->M0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->R0()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1f

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p1, v0, :cond_1f

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->b1(Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-void
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

.method static synthetic r(Landroidx/media3/exoplayer/n0;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->g0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private r0(I)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    :try_start_4
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroidx/media3/exoplayer/q0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/O0;->G(Landroidx/media3/exoplayer/q0;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_13} :catch_16
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_13} :catch_14

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_14
    move-exception v1

    .line 22
    goto :goto_17

    .line 23
    :catch_16
    move-exception v1

    .line 24
    :goto_17
    invoke-virtual {v0}, Landroidx/media3/exoplayer/O0;->m()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x3

    .line 29
    if-eq v0, v2, :cond_23

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    if-ne v0, v2, :cond_22

    .line 33
    .line 34
    goto :goto_23

    .line 35
    :cond_22
    throw v1

    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "Disabling track due to error: "

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, Lax/l1/K;->c:[Lax/l1/D;

    .line 57
    .line 58
    aget-object v3, v3, p1

    .line 59
    .line 60
    invoke-interface {v3}, Lax/l1/D;->m()Lax/P0/v;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lax/P0/v;->l(Lax/P0/v;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "ExoPlayerImplInternal"

    .line 76
    .line 77
    invoke-static {v3, v2, v1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lax/l1/K;

    .line 81
    .line 82
    iget-object v2, v0, Lax/l1/K;->b:[Lax/Y0/W;

    .line 83
    .line 84
    invoke-virtual {v2}, [Lax/Y0/W;->clone()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, [Lax/Y0/W;

    .line 89
    .line 90
    iget-object v3, v0, Lax/l1/K;->c:[Lax/l1/D;

    .line 91
    .line 92
    invoke-virtual {v3}, [Lax/l1/D;->clone()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, [Lax/l1/D;

    .line 97
    .line 98
    iget-object v4, v0, Lax/l1/K;->d:Lax/P0/V;

    .line 99
    .line 100
    iget-object v0, v0, Lax/l1/K;->e:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-direct {v1, v2, v3, v4, v0}, Lax/l1/K;-><init>([Lax/Y0/W;[Lax/l1/D;Lax/P0/V;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v1, Lax/l1/K;->b:[Lax/Y0/W;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    aput-object v2, v0, p1

    .line 109
    .line 110
    iget-object v0, v1, Lax/l1/K;->c:[Lax/l1/D;

    .line 111
    .line 112
    aput-object v2, v0, p1

    .line 113
    .line 114
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->C(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 118
    .line 119
    invoke-virtual {p1}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 124
    .line 125
    iget-wide v2, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {p1, v1, v2, v3, v0}, Landroidx/media3/exoplayer/q0;->a(Lax/l1/K;JZ)J

    .line 129
    .line 130
    .line 131
    return-void
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

.method static synthetic s(Landroidx/media3/exoplayer/n0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/n0;->V0:Z

    .line 2
    .line 3
    return p0
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

.method private s0(IZ)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->d0:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_12

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->A0:Lax/S0/q;

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/j0;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, Landroidx/media3/exoplayer/j0;-><init>(Landroidx/media3/exoplayer/n0;IZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
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

.method private s1(ZIZI)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p4}, Landroidx/media3/exoplayer/n0;->c2(ZII)V

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

.method static synthetic t(Landroidx/media3/exoplayer/n0;)Lax/S0/q;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    return-object p0
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

.method private t0(JJ)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_fc

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_14

    .line 18
    .line 19
    goto/16 :goto_fc

    .line 20
    .line 21
    :cond_14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->b1:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1e

    .line 24
    .line 25
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    sub-long/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->b1:Z

    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 36
    .line 37
    iget-object v0, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Landroidx/media3/exoplayer/n0;->a1:I

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-lez v1, :cond_44

    .line 57
    .line 58
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 59
    .line 60
    add-int/lit8 v4, v1, -0x1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Landroidx/media3/exoplayer/n0$d;

    .line 67
    .line 68
    goto :goto_45

    .line 69
    :cond_44
    move-object v3, v2

    .line 70
    :goto_45
    if-eqz v3, :cond_67

    .line 71
    .line 72
    iget v4, v3, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 73
    .line 74
    if-gt v4, v0, :cond_53

    .line 75
    .line 76
    if-ne v4, v0, :cond_67

    .line 77
    .line 78
    iget-wide v3, v3, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 79
    .line 80
    cmp-long v5, v3, p1

    .line 81
    .line 82
    if-lez v5, :cond_67

    .line 83
    .line 84
    :cond_53
    add-int/lit8 v3, v1, -0x1

    .line 85
    .line 86
    if-lez v3, :cond_62

    .line 87
    .line 88
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 89
    .line 90
    add-int/lit8 v1, v1, -0x2

    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Landroidx/media3/exoplayer/n0$d;

    .line 97
    .line 98
    goto :goto_63

    .line 99
    :cond_62
    move-object v1, v2

    .line 100
    :goto_63
    move v7, v3

    .line 101
    move-object v3, v1

    .line 102
    move v1, v7

    .line 103
    goto :goto_45

    .line 104
    :cond_67
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-ge v1, v3, :cond_78

    .line 111
    .line 112
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Landroidx/media3/exoplayer/n0$d;

    .line 119
    .line 120
    goto :goto_79

    .line 121
    :cond_78
    move-object v3, v2

    .line 122
    :goto_79
    if-eqz v3, :cond_9e

    .line 123
    .line 124
    iget-object v4, v3, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz v4, :cond_9e

    .line 127
    .line 128
    iget v4, v3, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 129
    .line 130
    if-lt v4, v0, :cond_8b

    .line 131
    .line 132
    if-ne v4, v0, :cond_9e

    .line 133
    .line 134
    iget-wide v4, v3, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 135
    .line 136
    cmp-long v6, v4, p1

    .line 137
    .line 138
    if-gtz v6, :cond_9e

    .line 139
    .line 140
    :cond_8b
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ge v1, v3, :cond_78

    .line 149
    .line 150
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Landroidx/media3/exoplayer/n0$d;

    .line 157
    .line 158
    goto :goto_79

    .line 159
    :cond_9e
    :goto_9e
    if-eqz v3, :cond_fa

    .line 160
    .line 161
    iget-object v4, v3, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 162
    .line 163
    if-eqz v4, :cond_fa

    .line 164
    .line 165
    iget v4, v3, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 166
    .line 167
    if-ne v4, v0, :cond_fa

    .line 168
    .line 169
    iget-wide v4, v3, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 170
    .line 171
    cmp-long v6, v4, p1

    .line 172
    .line 173
    if-lez v6, :cond_fa

    .line 174
    .line 175
    cmp-long v6, v4, p3

    .line 176
    .line 177
    if-gtz v6, :cond_fa

    .line 178
    .line 179
    :try_start_b2
    iget-object v4, v3, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 180
    .line 181
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/n0;->g1(Landroidx/media3/exoplayer/K0;)V
    :try_end_b7
    .catchall {:try_start_b2 .. :try_end_b7} :catchall_e3

    .line 182
    .line 183
    .line 184
    iget-object v4, v3, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 185
    .line 186
    invoke-virtual {v4}, Landroidx/media3/exoplayer/K0;->a()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_cb

    .line 191
    .line 192
    iget-object v3, v3, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 193
    .line 194
    invoke-virtual {v3}, Landroidx/media3/exoplayer/K0;->i()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_c8

    .line 199
    .line 200
    goto :goto_cb

    .line 201
    :cond_c8
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_d0

    .line 204
    :cond_cb
    :goto_cb
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :goto_d0
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-ge v1, v3, :cond_e1

    .line 216
    .line 217
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Landroidx/media3/exoplayer/n0$d;

    .line 224
    .line 225
    goto :goto_9e

    .line 226
    :cond_e1
    move-object v3, v2

    .line 227
    goto :goto_9e

    .line 228
    :catchall_e3
    move-exception p1

    .line 229
    iget-object p2, v3, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 230
    .line 231
    invoke-virtual {p2}, Landroidx/media3/exoplayer/K0;->a()Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-nez p2, :cond_f4

    .line 236
    .line 237
    iget-object p2, v3, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 238
    .line 239
    invoke-virtual {p2}, Landroidx/media3/exoplayer/K0;->i()Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_f9

    .line 244
    .line 245
    :cond_f4
    iget-object p2, p0, Landroidx/media3/exoplayer/n0;->q0:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_f9
    throw p1

    .line 251
    :cond_fa
    iput v1, p0, Landroidx/media3/exoplayer/n0;->a1:I

    .line 252
    .line 253
    :cond_fc
    :goto_fc
    return-void
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private u(Landroidx/media3/exoplayer/n0$b;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->K0:Landroidx/media3/exoplayer/n0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_f

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/exoplayer/I0;->r()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_f
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->b(Landroidx/media3/exoplayer/n0$b;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Landroidx/media3/exoplayer/n0$b;->c(Landroidx/media3/exoplayer/n0$b;)Lax/i1/g0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p2, v1, p1}, Landroidx/media3/exoplayer/I0;->f(ILjava/util/List;Lax/i1/g0;)Lax/P0/N;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/n0;->a0(Lax/P0/N;Z)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method private u0()Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/t0;->K(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->T()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_4e

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 18
    .line 19
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 20
    .line 21
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v4}, Landroidx/media3/exoplayer/t0;->t(JLandroidx/media3/exoplayer/J0;)Landroidx/media3/exoplayer/r0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_4e

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/t0;->h(Landroidx/media3/exoplayer/r0;)Landroidx/media3/exoplayer/q0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-boolean v3, v2, Landroidx/media3/exoplayer/q0;->e:Z

    .line 36
    .line 37
    if-nez v3, :cond_2c

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/r0;->b:J

    .line 40
    .line 41
    invoke-virtual {v2, p0, v3, v4}, Landroidx/media3/exoplayer/q0;->v(Lax/i1/C$a;J)V

    .line 42
    .line 43
    .line 44
    goto :goto_3d

    .line 45
    :cond_2c
    iget-boolean v3, v2, Landroidx/media3/exoplayer/q0;->f:Z

    .line 46
    .line 47
    if-eqz v3, :cond_3d

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 50
    .line 51
    const/16 v4, 0x8

    .line 52
    .line 53
    iget-object v5, v2, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 54
    .line 55
    invoke-interface {v3, v4, v5}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Lax/S0/q$a;->a()V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 63
    .line 64
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-ne v3, v2, :cond_4a

    .line 69
    .line 70
    iget-wide v2, v0, Landroidx/media3/exoplayer/r0;->b:J

    .line 71
    .line 72
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/n0;->S0(J)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    :cond_4e
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->Q0:Z

    .line 80
    .line 81
    if-eqz v0, :cond_62

    .line 82
    .line 83
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->n()Landroidx/media3/exoplayer/q0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->i0(Landroidx/media3/exoplayer/q0;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->Q0:Z

    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->W1()V

    .line 96
    .line 97
    .line 98
    return v1

    .line 99
    :cond_62
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 100
    .line 101
    .line 102
    return v1
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private u1(Lax/P0/G;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->m1(Lax/P0/G;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->p0:Landroidx/media3/exoplayer/k;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/media3/exoplayer/k;->h()Lax/P0/G;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/n0;->d0(Lax/P0/G;Z)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private v()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_b
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    if-ge v1, v2, :cond_21

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lax/l1/K;->c(I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_17

    .line 22
    .line 23
    goto :goto_1e

    .line 24
    :cond_17
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 25
    .line 26
    aget-object v2, v2, v1

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/media3/exoplayer/O0;->f()V

    .line 29
    .line 30
    .line 31
    :goto_1e
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_b

    .line 34
    :cond_21
    return-void
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

.method private v0()V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_f

    .line 14
    .line 15
    goto :goto_4b

    .line 16
    :cond_f
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_4b

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_1e
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 32
    .line 33
    array-length v4, v4

    .line 34
    const/4 v5, 0x1

    .line 35
    if-ge v2, v4, :cond_42

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lax/l1/K;->c(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3f

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 44
    .line 45
    aget-object v4, v4, v2

    .line 46
    .line 47
    invoke-virtual {v4}, Landroidx/media3/exoplayer/O0;->m()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eq v4, v5, :cond_36

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    goto :goto_43

    .line 55
    :cond_36
    iget-object v4, v0, Lax/l1/K;->b:[Lax/Y0/W;

    .line 56
    .line 57
    aget-object v4, v4, v2

    .line 58
    .line 59
    iget v4, v4, Lax/Y0/W;->a:I

    .line 60
    .line 61
    if-eqz v4, :cond_3f

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    :cond_3f
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_1e

    .line 67
    :cond_42
    const/4 v0, 0x1

    .line 68
    :goto_43
    if-eqz v3, :cond_48

    .line 69
    .line 70
    if-eqz v0, :cond_48

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    :cond_48
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/n0;->p1(Z)V

    .line 74
    .line 75
    .line 76
    :cond_4b
    :goto_4b
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private v1(Landroidx/media3/exoplayer/ExoPlayer$c;)V
    .registers 4

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->f1:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/t0;->V(Lax/P0/N;Landroidx/media3/exoplayer/ExoPlayer$c;)V

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
    .line 22
.end method

.method private w()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_4
    if-ge v2, v1, :cond_16

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-boolean v4, p0, Landroidx/media3/exoplayer/n0;->G0:Z

    .line 10
    .line 11
    if-eqz v4, :cond_f

    .line 12
    .line 13
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->E0:Lax/Y0/Y;

    .line 14
    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v4, 0x0

    .line 17
    :goto_10
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/O0;->R(Lax/Y0/Y;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_4

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

.method private w0()V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->N1()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_81

    .line 8
    .line 9
    if-eqz v1, :cond_d

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->p0()V

    .line 12
    .line 13
    .line 14
    :cond_d
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->i1:Z

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->b()Landroidx/media3/exoplayer/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/media3/exoplayer/q0;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 31
    .line 32
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v3, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 37
    .line 38
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x1

    .line 45
    if-eqz v2, :cond_47

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 48
    .line 49
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 50
    .line 51
    iget v4, v2, Lax/i1/F$b;->b:I

    .line 52
    .line 53
    const/4 v5, -0x1

    .line 54
    if-ne v4, v5, :cond_47

    .line 55
    .line 56
    iget-object v4, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 57
    .line 58
    iget-object v4, v4, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 59
    .line 60
    iget v6, v4, Lax/i1/F$b;->b:I

    .line 61
    .line 62
    if-ne v6, v5, :cond_47

    .line 63
    .line 64
    iget v2, v2, Lax/i1/F$b;->e:I

    .line 65
    .line 66
    iget v4, v4, Lax/i1/F$b;->e:I

    .line 67
    .line 68
    if-eq v2, v4, :cond_47

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    goto :goto_48

    .line 72
    :cond_47
    const/4 v2, 0x0

    .line 73
    :goto_48
    iget-object v4, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 74
    .line 75
    iget-object v6, v4, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 76
    .line 77
    iget-wide v7, v4, Landroidx/media3/exoplayer/r0;->b:J

    .line 78
    .line 79
    iget-wide v9, v4, Landroidx/media3/exoplayer/r0;->c:J

    .line 80
    .line 81
    xor-int/lit8 v13, v2, 0x1

    .line 82
    .line 83
    const/4 v14, 0x0

    .line 84
    move-wide v11, v7

    .line 85
    move-object v5, p0

    .line 86
    invoke-direct/range {v5 .. v14}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iput-object v2, v5, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 91
    .line 92
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->R0()V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->e2()V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_72

    .line 103
    .line 104
    iget-object v2, v5, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v1, v2, :cond_72

    .line 111
    .line 112
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->o0()V

    .line 113
    .line 114
    .line 115
    :cond_72
    iget-object v1, v5, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 116
    .line 117
    iget v1, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 118
    .line 119
    const/4 v2, 0x3

    .line 120
    if-ne v1, v2, :cond_7c

    .line 121
    .line 122
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->S1()V

    .line 123
    .line 124
    .line 125
    :cond_7c
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->v()V

    .line 126
    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    goto :goto_2

    .line 130
    :cond_81
    move-object v5, p0

    .line 131
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private x()Z
    .registers 6

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_19

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Landroidx/media3/exoplayer/O0;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_16
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_a

    .line 26
    :cond_19
    return v1
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

.method private x0(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->f1:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/ExoPlayer$c;->a:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v4, v0, v2

    .line 11
    .line 12
    if-nez v4, :cond_e

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    if-nez p1, :cond_1c

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->g1:Lax/P0/N;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lax/P0/N;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_27

    .line 28
    .line 29
    :cond_1c
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/media3/exoplayer/n0;->g1:Lax/P0/N;

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/t0;->B(Lax/P0/N;)V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->n0()V

    .line 41
    .line 42
    .line 43
    return-void
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

.method private x1(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/n0;->R0:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/t0;->X(Lax/P0/N;I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int/lit8 v0, p1, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->b1(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_1c

    .line 22
    :cond_15
    and-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_1c

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    :goto_1c
    const/4 p1, 0x0

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method private y()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P0()V

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

.method private y0()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 2
    .line 3
    if-nez v0, :cond_3a

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3a

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->i1:Z

    .line 10
    .line 11
    if-nez v0, :cond_3a

    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_3a

    .line 20
    :cond_13
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3a

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-ne v0, v1, :cond_3a

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_3a

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-boolean v0, v0, Landroidx/media3/exoplayer/q0;->f:Z

    .line 47
    .line 48
    if-nez v0, :cond_32

    .line 49
    .line 50
    goto :goto_3a

    .line 51
    :cond_32
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->c()Landroidx/media3/exoplayer/q0;

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->q0()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    :goto_3a
    return-void
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

.method private z(Landroidx/media3/exoplayer/r0;J)Landroidx/media3/exoplayer/q0;
    .registers 15

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/q0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->c0:[Landroidx/media3/exoplayer/N0;

    .line 4
    .line 5
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->e0:Lax/l1/J;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->g0:Landroidx/media3/exoplayer/o0;

    .line 8
    .line 9
    invoke-interface {v2}, Landroidx/media3/exoplayer/o0;->h()Lax/m1/b;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v6, p0, Landroidx/media3/exoplayer/n0;->u0:Landroidx/media3/exoplayer/I0;

    .line 14
    .line 15
    iget-object v8, p0, Landroidx/media3/exoplayer/n0;->f0:Lax/l1/K;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->f1:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 18
    .line 19
    iget-wide v9, v2, Landroidx/media3/exoplayer/ExoPlayer$c;->a:J

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    move-wide v2, p2

    .line 23
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/q0;-><init>([Landroidx/media3/exoplayer/N0;JLax/l1/J;Lax/m1/b;Landroidx/media3/exoplayer/I0;Landroidx/media3/exoplayer/r0;Lax/l1/K;J)V

    .line 24
    .line 25
    .line 26
    return-object v0
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

.method private z0()V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_a

    .line 8
    .line 9
    goto/16 :goto_14a

    .line 10
    .line 11
    :cond_a
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v2, :cond_10d

    .line 22
    .line 23
    iget-boolean v2, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1c

    .line 26
    .line 27
    goto/16 :goto_10d

    .line 28
    .line 29
    :cond_1c
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->f0()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_24

    .line 34
    .line 35
    goto/16 :goto_14a

    .line 36
    .line 37
    :cond_24
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->x()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3a

    .line 42
    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 50
    .line 51
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v2, v3, :cond_3a

    .line 56
    .line 57
    goto/16 :goto_14a

    .line 58
    .line 59
    :cond_3a
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-boolean v2, v2, Landroidx/media3/exoplayer/q0;->f:Z

    .line 64
    .line 65
    if-nez v2, :cond_52

    .line 66
    .line 67
    iget-wide v2, p0, Landroidx/media3/exoplayer/n0;->Y0:J

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroidx/media3/exoplayer/q0;->n()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    cmp-long v6, v2, v4

    .line 78
    .line 79
    if-gez v6, :cond_52

    .line 80
    .line 81
    goto/16 :goto_14a

    .line 82
    .line 83
    :cond_52
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->d()Landroidx/media3/exoplayer/q0;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    invoke-virtual {v12}, Landroidx/media3/exoplayer/q0;->p()Lax/l1/K;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 98
    .line 99
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 100
    .line 101
    iget-object v3, v12, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 102
    .line 103
    iget-object v3, v3, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 104
    .line 105
    iget-object v1, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 106
    .line 107
    iget-object v4, v1, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 108
    .line 109
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    move-object v1, v2

    .line 116
    move-object v2, v3

    .line 117
    move-object v3, v1

    .line 118
    move-object v0, p0

    .line 119
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/n0;->f2(Lax/P0/N;Lax/i1/F$b;Lax/P0/N;Lax/i1/F$b;JZ)V

    .line 120
    .line 121
    .line 122
    iget-boolean v1, v12, Landroidx/media3/exoplayer/q0;->f:Z

    .line 123
    .line 124
    if-eqz v1, :cond_fc

    .line 125
    .line 126
    iget-boolean v1, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 127
    .line 128
    if-eqz v1, :cond_87

    .line 129
    .line 130
    iget-wide v1, p0, Landroidx/media3/exoplayer/n0;->h1:J

    .line 131
    .line 132
    cmp-long v3, v1, v8

    .line 133
    .line 134
    if-nez v3, :cond_91

    .line 135
    .line 136
    :cond_87
    iget-object v1, v12, Landroidx/media3/exoplayer/q0;->a:Lax/i1/C;

    .line 137
    .line 138
    invoke-interface {v1}, Lax/i1/C;->s()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    cmp-long v3, v1, v8

    .line 143
    .line 144
    if-eqz v3, :cond_fc

    .line 145
    .line 146
    :cond_91
    iput-wide v8, p0, Landroidx/media3/exoplayer/n0;->h1:J

    .line 147
    .line 148
    iget-boolean v1, p0, Landroidx/media3/exoplayer/n0;->B0:Z

    .line 149
    .line 150
    if-eqz v1, :cond_9d

    .line 151
    .line 152
    iget-boolean v1, p0, Landroidx/media3/exoplayer/n0;->i1:Z

    .line 153
    .line 154
    if-nez v1, :cond_9d

    .line 155
    .line 156
    const/4 v1, 0x1

    .line 157
    goto :goto_9e

    .line 158
    :cond_9d
    const/4 v1, 0x0

    .line 159
    :goto_9e
    if-eqz v1, :cond_e1

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    :goto_a1
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 163
    .line 164
    array-length v3, v3

    .line 165
    if-ge v2, v3, :cond_e1

    .line 166
    .line 167
    invoke-virtual {v13, v2}, Lax/l1/K;->c(I)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_de

    .line 172
    .line 173
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 174
    .line 175
    aget-object v3, v3, v2

    .line 176
    .line 177
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->m()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/4 v4, -0x2

    .line 182
    if-ne v3, v4, :cond_b8

    .line 183
    .line 184
    goto :goto_de

    .line 185
    :cond_b8
    iget-object v3, v13, Lax/l1/K;->c:[Lax/l1/D;

    .line 186
    .line 187
    aget-object v3, v3, v2

    .line 188
    .line 189
    invoke-interface {v3}, Lax/l1/D;->m()Lax/P0/v;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget-object v3, v3, Lax/P0/v;->o:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v4, v13, Lax/l1/K;->c:[Lax/l1/D;

    .line 196
    .line 197
    aget-object v4, v4, v2

    .line 198
    .line 199
    invoke-interface {v4}, Lax/l1/D;->m()Lax/P0/v;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    iget-object v4, v4, Lax/P0/v;->k:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v3, v4}, Lax/P0/D;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_de

    .line 210
    .line 211
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 212
    .line 213
    aget-object v3, v3, v2

    .line 214
    .line 215
    invoke-virtual {v3}, Landroidx/media3/exoplayer/O0;->u()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-nez v3, :cond_de

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    goto :goto_e1

    .line 223
    :cond_de
    :goto_de
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    goto :goto_a1

    .line 226
    :cond_e1
    :goto_e1
    if-nez v1, :cond_fc

    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/media3/exoplayer/q0;->n()J

    .line 229
    .line 230
    .line 231
    move-result-wide v1

    .line 232
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/n0;->i1(J)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/media3/exoplayer/q0;->s()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-nez v1, :cond_14a

    .line 240
    .line 241
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 242
    .line 243
    invoke-virtual {v1, v12}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 244
    .line 245
    .line 246
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/n0;->Y(Z)V

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_fc
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 254
    .line 255
    array-length v2, v1

    .line 256
    :goto_ff
    if-ge v10, v2, :cond_14a

    .line 257
    .line 258
    aget-object v3, v1, v10

    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/media3/exoplayer/q0;->n()J

    .line 261
    .line 262
    .line 263
    move-result-wide v4

    .line 264
    invoke-virtual {v3, v11, v13, v4, v5}, Landroidx/media3/exoplayer/O0;->F(Lax/l1/K;Lax/l1/K;J)V

    .line 265
    .line 266
    .line 267
    add-int/lit8 v10, v10, 0x1

    .line 268
    .line 269
    goto :goto_ff

    .line 270
    :cond_10d
    :goto_10d
    iget-object v2, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 271
    .line 272
    iget-boolean v2, v2, Landroidx/media3/exoplayer/r0;->j:Z

    .line 273
    .line 274
    if-nez v2, :cond_117

    .line 275
    .line 276
    iget-boolean v2, p0, Landroidx/media3/exoplayer/n0;->N0:Z

    .line 277
    .line 278
    if-eqz v2, :cond_14a

    .line 279
    .line 280
    :cond_117
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->q:[Landroidx/media3/exoplayer/O0;

    .line 281
    .line 282
    array-length v3, v2

    .line 283
    :goto_11a
    if-ge v10, v3, :cond_14a

    .line 284
    .line 285
    aget-object v4, v2, v10

    .line 286
    .line 287
    invoke-virtual {v4, v1}, Landroidx/media3/exoplayer/O0;->x(Landroidx/media3/exoplayer/q0;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-nez v5, :cond_125

    .line 292
    .line 293
    goto :goto_147

    .line 294
    :cond_125
    invoke-virtual {v4, v1}, Landroidx/media3/exoplayer/O0;->r(Landroidx/media3/exoplayer/q0;)Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_147

    .line 299
    .line 300
    iget-object v5, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 301
    .line 302
    iget-wide v5, v5, Landroidx/media3/exoplayer/r0;->e:J

    .line 303
    .line 304
    cmp-long v7, v5, v8

    .line 305
    .line 306
    if-eqz v7, :cond_143

    .line 307
    .line 308
    const-wide/high16 v11, -0x8000000000000000L

    .line 309
    .line 310
    cmp-long v7, v5, v11

    .line 311
    .line 312
    if-eqz v7, :cond_143

    .line 313
    .line 314
    invoke-virtual {v1}, Landroidx/media3/exoplayer/q0;->m()J

    .line 315
    .line 316
    .line 317
    move-result-wide v5

    .line 318
    iget-object v7, v1, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 319
    .line 320
    iget-wide v11, v7, Landroidx/media3/exoplayer/r0;->e:J

    .line 321
    .line 322
    add-long/2addr v5, v11

    .line 323
    goto :goto_144

    .line 324
    :cond_143
    move-wide v5, v8

    .line 325
    :goto_144
    invoke-virtual {v4, v1, v5, v6}, Landroidx/media3/exoplayer/O0;->O(Landroidx/media3/exoplayer/q0;J)V

    .line 326
    .line 327
    .line 328
    :cond_147
    :goto_147
    add-int/lit8 v10, v10, 0x1

    .line 329
    .line 330
    goto :goto_11a

    .line 331
    :cond_14a
    :goto_14a
    return-void
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private z1(Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_16

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 7
    .line 8
    const/16 v2, 0x25

    .line 9
    .line 10
    invoke-interface {v1, v2}, Lax/S0/q;->i(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 14
    .line 15
    if-eqz v1, :cond_16

    .line 16
    .line 17
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/n0;->c1(Landroidx/media3/exoplayer/n0$h;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 22
    .line 23
    :cond_16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/n0;->G0:Z

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->w()V

    .line 26
    .line 27
    .line 28
    return-void
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
.method public A1(Lax/Y0/Y;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x26

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public C1(Lax/Y0/Z;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public E1(Z)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xc

    .line 5
    .line 6
    invoke-interface {v0, v2, p1, v1}, Lax/S0/q;->a(III)Lax/S0/q$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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

.method public G0(Lax/i1/C;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public H0()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lax/S0/q;->d(I)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lax/S0/q$a;->a()V

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

.method public I(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/n0;->d1:J

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

.method public J0()Z
    .registers 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->L0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_2c

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_2c

    .line 19
    :cond_12
    iput-boolean v1, p0, Landroidx/media3/exoplayer/n0;->L0:Z

    .line 20
    .line 21
    new-instance v0, Lax/S0/k;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lax/S0/k;-><init>(Lax/S0/h;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-interface {v1, v2, v0}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Lax/S0/q$a;->a()V

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Landroidx/media3/exoplayer/n0;->w0:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lax/S0/k;->c(J)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_2c
    :goto_2c
    return v1
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

.method public J1(Ljava/lang/Object;J)Z
    .registers 8

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->L0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_37

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_37

    .line 19
    :cond_12
    new-instance v0, Lax/S0/k;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->r0:Lax/S0/h;

    .line 22
    .line 23
    invoke-direct {v0, v2}, Lax/S0/k;-><init>(Lax/S0/h;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 27
    .line 28
    new-instance v3, Landroid/util/Pair;

    .line 29
    .line 30
    invoke-direct {v3, p1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/16 p1, 0x1e

    .line 34
    .line 35
    invoke-interface {v2, p1, v3}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 40
    .line 41
    .line 42
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long p1, p2, v2

    .line 48
    .line 49
    if-eqz p1, :cond_37

    .line 50
    .line 51
    invoke-virtual {v0, p2, p3}, Lax/S0/k;->c(J)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_37
    :goto_37
    return v1
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
.end method

.method public L1(F)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public N0(IILax/i1/g0;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2, p3}, Lax/S0/q;->g(IIILjava/lang/Object;)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
.end method

.method public P()Landroid/os/Looper;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

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

.method public T1()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-interface {v0, v1}, Lax/S0/q;->d(I)Lax/S0/q$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lax/S0/q$a;->a()V

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

.method public a(Landroidx/media3/exoplayer/M0;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lax/S0/q;->f(I)Z

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

.method public a1(Lax/P0/N;IJ)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/n0$h;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Landroidx/media3/exoplayer/n0$h;-><init>(Lax/P0/N;IJ)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-interface {v0, p1, v1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method

.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lax/S0/q;->f(I)Z

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
.end method

.method public c(F)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v0, 0x22

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lax/S0/q;->f(I)Z

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

.method public d(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lax/S0/q;->a(III)Lax/S0/q$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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

.method public e()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-interface {v0, v1}, Lax/S0/q;->i(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lax/S0/q;->f(I)Z

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f(Lax/i1/C;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public g(JJLax/P0/v;Landroid/media/MediaFormat;)V
    .registers 7

    .line 1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_f

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 6
    .line 7
    const/16 p2, 0x25

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lax/S0/q;->d(I)Lax/S0/q$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
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

.method public handleMessage(Landroid/os/Message;)Z
    .registers 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v11, "Playback error"

    .line 4
    .line 5
    const-string v12, "ExoPlayerImplInternal"

    .line 6
    .line 7
    const/16 v2, 0x3e8

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v13, 0x0

    .line 11
    const/4 v14, 0x1

    .line 12
    :try_start_b
    iget v4, v0, Landroid/os/Message;->what:I

    .line 13
    .line 14
    packed-switch v4, :pswitch_data_2d2

    .line 15
    .line 16
    .line 17
    :pswitch_10
    return v13

    .line 18
    :pswitch_11
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lax/Y0/Y;

    .line 21
    .line 22
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->B1(Lax/Y0/Y;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2ce

    .line 26
    .line 27
    :catch_1a
    move-exception v0

    .line 28
    goto/16 :goto_188

    .line 29
    .line 30
    :catch_1d
    move-exception v0

    .line 31
    goto/16 :goto_1a6

    .line 32
    .line 33
    :catch_20
    move-exception v0

    .line 34
    goto/16 :goto_1ad

    .line 35
    .line 36
    :catch_23
    move-exception v0

    .line 37
    goto/16 :goto_1b4

    .line 38
    .line 39
    :catch_26
    move-exception v0

    .line 40
    goto/16 :goto_1bb

    .line 41
    .line 42
    :catch_29
    move-exception v0

    .line 43
    goto/16 :goto_1d9

    .line 44
    .line 45
    :catch_2c
    move-exception v0

    .line 46
    goto/16 :goto_1e0

    .line 47
    .line 48
    :pswitch_2f
    iput-boolean v13, p0, Landroidx/media3/exoplayer/n0;->H0:Z

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 51
    .line 52
    if-eqz v0, :cond_2ce

    .line 53
    .line 54
    invoke-direct {p0, v0, v13}, Landroidx/media3/exoplayer/n0;->c1(Landroidx/media3/exoplayer/n0$h;Z)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->I0:Landroidx/media3/exoplayer/n0$h;

    .line 59
    .line 60
    goto/16 :goto_2ce

    .line 61
    .line 62
    :pswitch_3d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->z1(Z)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_2ce

    .line 74
    .line 75
    :pswitch_4a
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lax/o1/z;

    .line 78
    .line 79
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->I1(Lax/o1/z;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_2ce

    .line 83
    .line 84
    :pswitch_53
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->V()V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_2ce

    .line 88
    .line 89
    :pswitch_58
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 90
    .line 91
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->U(I)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_2ce

    .line 95
    .line 96
    :pswitch_5f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Float;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->M1(F)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_2ce

    .line 108
    .line 109
    :pswitch_6c
    iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Lax/P0/c;

    .line 112
    .line 113
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 114
    .line 115
    if-eqz v0, :cond_76

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    goto :goto_77

    .line 119
    :cond_76
    const/4 v0, 0x0

    .line 120
    :goto_77
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/n0;->k1(Lax/P0/c;Z)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2ce

    .line 124
    .line 125
    :pswitch_7c
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Landroid/util/Pair;

    .line 128
    .line 129
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lax/S0/k;

    .line 134
    .line 135
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/n0;->K1(Ljava/lang/Object;Lax/S0/k;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_2ce

    .line 139
    .line 140
    :pswitch_8b
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->I0()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2ce

    .line 144
    .line 145
    :pswitch_90
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 148
    .line 149
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->v1(Landroidx/media3/exoplayer/ExoPlayer$c;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_2ce

    .line 153
    .line 154
    :pswitch_99
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 155
    .line 156
    iget v5, v0, Landroid/os/Message;->arg2:I

    .line 157
    .line 158
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/util/List;

    .line 161
    .line 162
    invoke-direct {p0, v4, v5, v0}, Landroidx/media3/exoplayer/n0;->Y1(IILjava/util/List;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_2ce

    .line 166
    .line 167
    :pswitch_a6
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->P0()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_2ce

    .line 171
    .line 172
    :pswitch_ab
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->y()V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_2ce

    .line 176
    .line 177
    :pswitch_b0
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 178
    .line 179
    if-eqz v0, :cond_b6

    .line 180
    .line 181
    const/4 v0, 0x1

    .line 182
    goto :goto_b7

    .line 183
    :cond_b6
    const/4 v0, 0x0

    .line 184
    :goto_b7
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->q1(Z)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2ce

    .line 188
    .line 189
    :pswitch_bc
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->B0()V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_2ce

    .line 193
    .line 194
    :pswitch_c1
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lax/i1/g0;

    .line 197
    .line 198
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->G1(Lax/i1/g0;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_2ce

    .line 202
    .line 203
    :pswitch_ca
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 204
    .line 205
    iget v5, v0, Landroid/os/Message;->arg2:I

    .line 206
    .line 207
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Lax/i1/g0;

    .line 210
    .line 211
    invoke-direct {p0, v4, v5, v0}, Landroidx/media3/exoplayer/n0;->M0(IILax/i1/g0;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_2ce

    .line 215
    .line 216
    :pswitch_d7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Landroidx/media3/exoplayer/n0$c;

    .line 219
    .line 220
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->C0(Landroidx/media3/exoplayer/n0$c;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_2ce

    .line 224
    .line 225
    :pswitch_e0
    iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v4, Landroidx/media3/exoplayer/n0$b;

    .line 228
    .line 229
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 230
    .line 231
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/n0;->u(Landroidx/media3/exoplayer/n0$b;I)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_2ce

    .line 235
    .line 236
    :pswitch_eb
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Landroidx/media3/exoplayer/n0$b;

    .line 239
    .line 240
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->n1(Landroidx/media3/exoplayer/n0$b;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_2ce

    .line 244
    .line 245
    :pswitch_f4
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Lax/P0/G;

    .line 248
    .line 249
    invoke-direct {p0, v0, v13}, Landroidx/media3/exoplayer/n0;->d0(Lax/P0/G;Z)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_2ce

    .line 253
    .line 254
    :pswitch_fd
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Landroidx/media3/exoplayer/K0;

    .line 257
    .line 258
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->h1(Landroidx/media3/exoplayer/K0;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_2ce

    .line 262
    .line 263
    :pswitch_106
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Landroidx/media3/exoplayer/K0;

    .line 266
    .line 267
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->f1(Landroidx/media3/exoplayer/K0;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_2ce

    .line 271
    .line 272
    :pswitch_10f
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 273
    .line 274
    if-eqz v4, :cond_115

    .line 275
    .line 276
    const/4 v4, 0x1

    .line 277
    goto :goto_116

    .line 278
    :cond_115
    const/4 v4, 0x0

    .line 279
    :goto_116
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lax/S0/k;

    .line 282
    .line 283
    invoke-direct {p0, v4, v0}, Landroidx/media3/exoplayer/n0;->l1(ZLax/S0/k;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_2ce

    .line 287
    .line 288
    :pswitch_11f
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 289
    .line 290
    if-eqz v0, :cond_125

    .line 291
    .line 292
    const/4 v0, 0x1

    .line 293
    goto :goto_126

    .line 294
    :cond_125
    const/4 v0, 0x0

    .line 295
    :goto_126
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->F1(Z)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_2ce

    .line 299
    .line 300
    :pswitch_12b
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 301
    .line 302
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->x1(I)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_2ce

    .line 306
    .line 307
    :pswitch_132
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->O0()V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_2ce

    .line 311
    .line 312
    :pswitch_137
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lax/i1/C;

    .line 315
    .line 316
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->W(Lax/i1/C;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_2ce

    .line 320
    .line 321
    :pswitch_140
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Lax/i1/C;

    .line 324
    .line 325
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->b0(Lax/i1/C;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_2ce

    .line 329
    .line 330
    :pswitch_149
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Lax/S0/k;

    .line 333
    .line 334
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->K0(Lax/S0/k;)V

    .line 335
    .line 336
    .line 337
    return v14

    .line 338
    :pswitch_151
    invoke-direct {p0, v13, v14}, Landroidx/media3/exoplayer/n0;->U1(ZZ)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_2ce

    .line 342
    .line 343
    :pswitch_156
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lax/Y0/Z;

    .line 346
    .line 347
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->D1(Lax/Y0/Z;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_2ce

    .line 351
    .line 352
    :pswitch_15f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Lax/P0/G;

    .line 355
    .line 356
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/n0;->u1(Lax/P0/G;)V

    .line 357
    .line 358
    .line 359
    goto/16 :goto_2ce

    .line 360
    .line 361
    :pswitch_168
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Landroidx/media3/exoplayer/n0$h;

    .line 364
    .line 365
    invoke-direct {p0, v0, v14}, Landroidx/media3/exoplayer/n0;->c1(Landroidx/media3/exoplayer/n0$h;Z)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_2ce

    .line 369
    .line 370
    :pswitch_171
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->E()V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_2ce

    .line 374
    .line 375
    :pswitch_176
    iget v4, v0, Landroid/os/Message;->arg1:I

    .line 376
    .line 377
    if-eqz v4, :cond_17c

    .line 378
    .line 379
    const/4 v4, 0x1

    .line 380
    goto :goto_17d

    .line 381
    :cond_17c
    const/4 v4, 0x0

    .line 382
    :goto_17d
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 383
    .line 384
    shr-int/lit8 v5, v0, 0x4

    .line 385
    .line 386
    and-int/lit8 v0, v0, 0xf

    .line 387
    .line 388
    invoke-direct {p0, v4, v5, v14, v0}, Landroidx/media3/exoplayer/n0;->s1(ZIZI)V
    :try_end_186
    .catch Landroidx/media3/exoplayer/s; {:try_start_b .. :try_end_186} :catch_2c
    .catch Lax/b1/n$a; {:try_start_b .. :try_end_186} :catch_29
    .catch Lax/P0/E; {:try_start_b .. :try_end_186} :catch_26
    .catch Lax/U0/h; {:try_start_b .. :try_end_186} :catch_23
    .catch Lax/i1/b; {:try_start_b .. :try_end_186} :catch_20
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_186} :catch_1d
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_186} :catch_1a

    .line 389
    .line 390
    .line 391
    goto/16 :goto_2ce

    .line 392
    .line 393
    :goto_188
    instance-of v3, v0, Ljava/lang/IllegalStateException;

    .line 394
    .line 395
    if-nez v3, :cond_190

    .line 396
    .line 397
    instance-of v3, v0, Ljava/lang/IllegalArgumentException;

    .line 398
    .line 399
    if-eqz v3, :cond_192

    .line 400
    .line 401
    :cond_190
    const/16 v2, 0x3ec

    .line 402
    .line 403
    :cond_192
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/s;->f(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v12, v11, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    invoke-direct {p0, v14, v13}, Landroidx/media3/exoplayer/n0;->U1(ZZ)V

    .line 411
    .line 412
    .line 413
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/J0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/J0;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 420
    .line 421
    goto/16 :goto_2ce

    .line 422
    .line 423
    :goto_1a6
    const/16 v2, 0x7d0

    .line 424
    .line 425
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/n0;->X(Ljava/io/IOException;I)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_2ce

    .line 429
    .line 430
    :goto_1ad
    const/16 v2, 0x3ea

    .line 431
    .line 432
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/n0;->X(Ljava/io/IOException;I)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_2ce

    .line 436
    .line 437
    :goto_1b4
    iget v2, v0, Lax/U0/h;->q:I

    .line 438
    .line 439
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/n0;->X(Ljava/io/IOException;I)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_2ce

    .line 443
    .line 444
    :goto_1bb
    iget v4, v0, Lax/P0/E;->c0:I

    .line 445
    .line 446
    if-ne v4, v14, :cond_1c9

    .line 447
    .line 448
    iget-boolean v2, v0, Lax/P0/E;->q:Z

    .line 449
    .line 450
    if-eqz v2, :cond_1c6

    .line 451
    .line 452
    const/16 v2, 0xbb9

    .line 453
    .line 454
    goto :goto_1d4

    .line 455
    :cond_1c6
    const/16 v2, 0xbbb

    .line 456
    .line 457
    goto :goto_1d4

    .line 458
    :cond_1c9
    if-ne v4, v3, :cond_1d4

    .line 459
    .line 460
    iget-boolean v2, v0, Lax/P0/E;->q:Z

    .line 461
    .line 462
    if-eqz v2, :cond_1d2

    .line 463
    .line 464
    const/16 v2, 0xbba

    .line 465
    .line 466
    goto :goto_1d4

    .line 467
    :cond_1d2
    const/16 v2, 0xbbc

    .line 468
    .line 469
    :cond_1d4
    :goto_1d4
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/n0;->X(Ljava/io/IOException;I)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_2ce

    .line 473
    .line 474
    :goto_1d9
    iget v2, v0, Lax/b1/n$a;->q:I

    .line 475
    .line 476
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/n0;->X(Ljava/io/IOException;I)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_2ce

    .line 480
    .line 481
    :goto_1e0
    iget v2, v0, Landroidx/media3/exoplayer/s;->k0:I

    .line 482
    .line 483
    if-ne v2, v14, :cond_1f8

    .line 484
    .line 485
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 486
    .line 487
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-eqz v2, :cond_1f8

    .line 492
    .line 493
    iget-object v4, v0, Landroidx/media3/exoplayer/s;->p0:Lax/i1/F$b;

    .line 494
    .line 495
    if-nez v4, :cond_1f8

    .line 496
    .line 497
    iget-object v2, v2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 498
    .line 499
    iget-object v2, v2, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 500
    .line 501
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/s;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/s;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    :cond_1f8
    iget v2, v0, Landroidx/media3/exoplayer/s;->k0:I

    .line 506
    .line 507
    if-ne v2, v14, :cond_244

    .line 508
    .line 509
    iget-object v2, v0, Landroidx/media3/exoplayer/s;->p0:Lax/i1/F$b;

    .line 510
    .line 511
    if-eqz v2, :cond_244

    .line 512
    .line 513
    iget v4, v0, Landroidx/media3/exoplayer/s;->m0:I

    .line 514
    .line 515
    invoke-direct {p0, v4, v2}, Landroidx/media3/exoplayer/n0;->j0(ILax/i1/F$b;)Z

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-eqz v2, :cond_244

    .line 520
    .line 521
    iput-boolean v14, p0, Landroidx/media3/exoplayer/n0;->i1:Z

    .line 522
    .line 523
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->B()V

    .line 524
    .line 525
    .line 526
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 527
    .line 528
    invoke-virtual {v0}, Landroidx/media3/exoplayer/t0;->x()Landroidx/media3/exoplayer/q0;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 533
    .line 534
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    iget-object v4, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 539
    .line 540
    invoke-virtual {v4}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    if-eq v4, v0, :cond_22e

    .line 545
    .line 546
    :goto_221
    if-eqz v2, :cond_22e

    .line 547
    .line 548
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    if-eq v4, v0, :cond_22e

    .line 553
    .line 554
    invoke-virtual {v2}, Landroidx/media3/exoplayer/q0;->k()Landroidx/media3/exoplayer/q0;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    goto :goto_221

    .line 559
    :cond_22e
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 560
    .line 561
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/t0;->N(Landroidx/media3/exoplayer/q0;)I

    .line 562
    .line 563
    .line 564
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 565
    .line 566
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 567
    .line 568
    if-eq v0, v3, :cond_2ce

    .line 569
    .line 570
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->m0()V

    .line 571
    .line 572
    .line 573
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 574
    .line 575
    const/4 v2, 0x2

    .line 576
    invoke-interface {v0, v2}, Lax/S0/q;->f(I)Z

    .line 577
    .line 578
    .line 579
    goto/16 :goto_2ce

    .line 580
    .line 581
    :cond_244
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 582
    .line 583
    if-eqz v2, :cond_24d

    .line 584
    .line 585
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 586
    .line 587
    .line 588
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 589
    .line 590
    :cond_24d
    iget v2, v0, Landroidx/media3/exoplayer/s;->k0:I

    .line 591
    .line 592
    if-ne v2, v14, :cond_297

    .line 593
    .line 594
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 595
    .line 596
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 601
    .line 602
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    if-eq v2, v3, :cond_297

    .line 607
    .line 608
    :goto_25f
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 609
    .line 610
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    iget-object v3, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 615
    .line 616
    invoke-virtual {v3}, Landroidx/media3/exoplayer/t0;->y()Landroidx/media3/exoplayer/q0;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    if-eq v2, v3, :cond_273

    .line 621
    .line 622
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->b()Landroidx/media3/exoplayer/q0;

    .line 625
    .line 626
    .line 627
    goto :goto_25f

    .line 628
    :cond_273
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->t0:Landroidx/media3/exoplayer/t0;

    .line 629
    .line 630
    invoke-virtual {v2}, Landroidx/media3/exoplayer/t0;->u()Landroidx/media3/exoplayer/q0;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    check-cast v2, Landroidx/media3/exoplayer/q0;

    .line 639
    .line 640
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->p0()V

    .line 641
    .line 642
    .line 643
    iget-object v2, v2, Landroidx/media3/exoplayer/q0;->h:Landroidx/media3/exoplayer/r0;

    .line 644
    .line 645
    iget-object v3, v2, Landroidx/media3/exoplayer/r0;->a:Lax/i1/F$b;

    .line 646
    .line 647
    move-object v5, v3

    .line 648
    iget-wide v3, v2, Landroidx/media3/exoplayer/r0;->b:J

    .line 649
    .line 650
    iget-wide v6, v2, Landroidx/media3/exoplayer/r0;->c:J

    .line 651
    .line 652
    const/4 v9, 0x1

    .line 653
    const/4 v10, 0x0

    .line 654
    move-object v2, v5

    .line 655
    move-wide v5, v6

    .line 656
    move-wide v7, v3

    .line 657
    move-object v1, p0

    .line 658
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/n0;->e0(Lax/i1/F$b;JJJZI)Landroidx/media3/exoplayer/J0;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    iput-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 663
    .line 664
    :cond_297
    iget-boolean v2, v0, Landroidx/media3/exoplayer/s;->q0:Z

    .line 665
    .line 666
    if-eqz v2, :cond_2c0

    .line 667
    .line 668
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 669
    .line 670
    if-eqz v2, :cond_2a9

    .line 671
    .line 672
    iget v2, v0, Lax/P0/F;->q:I

    .line 673
    .line 674
    const/16 v3, 0x138c

    .line 675
    .line 676
    if-eq v2, v3, :cond_2a9

    .line 677
    .line 678
    const/16 v3, 0x138b

    .line 679
    .line 680
    if-ne v2, v3, :cond_2c0

    .line 681
    .line 682
    :cond_2a9
    const-string v2, "Recoverable renderer error"

    .line 683
    .line 684
    invoke-static {v12, v2, v0}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 688
    .line 689
    if-nez v2, :cond_2b4

    .line 690
    .line 691
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->c1:Landroidx/media3/exoplayer/s;

    .line 692
    .line 693
    :cond_2b4
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 694
    .line 695
    const/16 v3, 0x19

    .line 696
    .line 697
    invoke-interface {v2, v3, v0}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-interface {v2, v0}, Lax/S0/q;->b(Lax/S0/q$a;)Z

    .line 702
    .line 703
    .line 704
    goto :goto_2ce

    .line 705
    :cond_2c0
    invoke-static {v12, v11, v0}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 706
    .line 707
    .line 708
    invoke-direct {p0, v14, v13}, Landroidx/media3/exoplayer/n0;->U1(ZZ)V

    .line 709
    .line 710
    .line 711
    iget-object v2, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 712
    .line 713
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/J0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/J0;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    iput-object v0, p0, Landroidx/media3/exoplayer/n0;->J0:Landroidx/media3/exoplayer/J0;

    .line 718
    .line 719
    :cond_2ce
    :goto_2ce
    invoke-direct {p0}, Landroidx/media3/exoplayer/n0;->p0()V

    .line 720
    .line 721
    .line 722
    return v14

    .line 723
    :pswitch_data_2d2
    .packed-switch 0x1
        :pswitch_176
        :pswitch_171
        :pswitch_168
        :pswitch_15f
        :pswitch_156
        :pswitch_151
        :pswitch_149
        :pswitch_140
        :pswitch_137
        :pswitch_132
        :pswitch_12b
        :pswitch_11f
        :pswitch_10f
        :pswitch_106
        :pswitch_fd
        :pswitch_f4
        :pswitch_eb
        :pswitch_e0
        :pswitch_d7
        :pswitch_ca
        :pswitch_c1
        :pswitch_bc
        :pswitch_b0
        :pswitch_10
        :pswitch_ab
        :pswitch_a6
        :pswitch_99
        :pswitch_90
        :pswitch_8b
        :pswitch_7c
        :pswitch_6c
        :pswitch_5f
        :pswitch_58
        :pswitch_53
        :pswitch_4a
        :pswitch_3d
        :pswitch_2f
        :pswitch_11
    .end packed-switch
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public bridge synthetic i(Lax/i1/f0;)V
    .registers 2

    .line 1
    check-cast p1, Lax/i1/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/n0;->G0(Lax/i1/C;)V

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
.end method

.method public j(Lax/P0/G;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public j1(Lax/P0/c;Z)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1f

    .line 5
    .line 6
    invoke-interface {v0, v2, p2, v1, p1}, Lax/S0/q;->g(IIILjava/lang/Object;)Lax/S0/q$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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

.method public l(Landroidx/media3/exoplayer/K0;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/n0;->L0:Z

    .line 2
    .line 3
    if-nez v0, :cond_1d

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->k0:Landroid/os/Looper;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_1d

    .line 18
    :cond_11
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 19
    .line 20
    const/16 v1, 0xe

    .line 21
    .line 22
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    :goto_1d
    const-string v0, "ExoPlayerImplInternal"

    .line 31
    .line 32
    const-string v1, "Ignoring messages sent after release."

    .line 33
    .line 34
    invoke-static {v0, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/K0;->j(Z)V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public o1(Ljava/util/List;IJLax/i1/g0;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/I0$c;",
            ">;IJ",
            "Lax/i1/g0;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/n0$b;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p1

    .line 7
    move v4, p2

    .line 8
    move-wide v5, p3

    .line 9
    move-object v3, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/n0$b;-><init>(Ljava/util/List;Lax/i1/g0;IJLandroidx/media3/exoplayer/n0$a;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x11

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public r1(ZII)V
    .registers 5

    .line 1
    shl-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    or-int/2addr p2, p3

    .line 4
    iget-object p3, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p1, p2}, Lax/S0/q;->a(III)Lax/S0/q$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public t1(Lax/P0/G;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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
    .line 22
.end method

.method public w1(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lax/S0/q;->a(III)Lax/S0/q$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lax/S0/q$a;->a()V

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

.method public y1(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0;->i0:Lax/S0/q;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/16 v1, 0x24

    .line 8
    .line 9
    invoke-interface {v0, v1, p1}, Lax/S0/q;->j(ILjava/lang/Object;)Lax/S0/q$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lax/S0/q$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
