.class final Landroidx/media3/exoplayer/hls/e;
.super Lax/j1/d;
.source "SourceFile"


# static fields
.field private static final O:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:Lax/Z0/I1;

.field private final D:J

.field private E:Lax/c1/f;

.field private F:Landroidx/media3/exoplayer/hls/l;

.field private G:I

.field private H:Z

.field private volatile I:Z

.field private J:Z

.field private K:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private L:Z

.field private M:J

.field private N:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field private final p:Lax/U0/g;

.field private final q:Lax/U0/k;

.field private final r:Lax/c1/f;

.field private final s:Z

.field private final t:Z

.field private final u:Lax/S0/M;

.field private final v:Lax/c1/e;

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lax/P0/o;

.field private final y:Lax/E1/h;

.field private final z:Lax/S0/G;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/hls/e;->O:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method private constructor <init>(Lax/c1/e;Lax/U0/g;Lax/U0/k;Lax/P0/v;ZLax/U0/g;Lax/U0/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLax/S0/M;JLax/P0/o;Lax/c1/f;Lax/E1/h;Lax/S0/G;ZZLax/Z0/I1;)V
    .registers 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c1/e;",
            "Lax/U0/g;",
            "Lax/U0/k;",
            "Lax/P0/v;",
            "Z",
            "Lax/U0/g;",
            "Lax/U0/k;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lax/S0/M;",
            "J",
            "Lax/P0/o;",
            "Lax/c1/f;",
            "Lax/E1/h;",
            "Lax/S0/G;",
            "ZZ",
            "Lax/Z0/I1;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    .line 1
    invoke-direct/range {v1 .. v12}, Lax/j1/d;-><init>(Lax/U0/g;Lax/U0/k;Lax/P0/v;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    .line 2
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->A:Z

    move/from16 p2, p19

    .line 3
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->o:I

    if-eqz p20, :cond_22

    sub-long v2, p15, p13

    goto :goto_27

    :cond_22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    :goto_27
    iput-wide v2, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    move/from16 p2, p21

    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->l:I

    .line 6
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/e;->q:Lax/U0/k;

    move-object/from16 p2, p6

    .line 7
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->p:Lax/U0/g;

    if-eqz v0, :cond_37

    const/4 p2, 0x1

    goto :goto_38

    :cond_37
    const/4 p2, 0x0

    .line 8
    :goto_38
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    move/from16 p2, p8

    .line 9
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->B:Z

    move-object/from16 p2, p9

    .line 10
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    move/from16 p2, p23

    .line 11
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->s:Z

    move-object/from16 p2, p24

    .line 12
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->u:Lax/S0/M;

    move-wide/from16 v2, p25

    .line 13
    iput-wide v2, p0, Landroidx/media3/exoplayer/hls/e;->D:J

    move/from16 p2, p22

    .line 14
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->t:Z

    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->v:Lax/c1/e;

    move-object/from16 p1, p10

    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->w:Ljava/util/List;

    move-object/from16 p1, p27

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->x:Lax/P0/o;

    move-object/from16 p1, p28

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->r:Lax/c1/f;

    move-object/from16 p1, p29

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->y:Lax/E1/h;

    move-object/from16 p1, p30

    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    move/from16 p1, p31

    .line 21
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    move/from16 p1, p32

    .line 22
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/e;->n:Z

    move-object/from16 p1, p33

    .line 23
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->C:Lax/Z0/I1;

    .line 24
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->K:Lax/r7/z;

    .line 25
    sget-object p1, Landroidx/media3/exoplayer/hls/e;->O:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, Landroidx/media3/exoplayer/hls/e;->k:I

    return-void
.end method

.method private static h(Lax/U0/g;[B[B)Lax/U0/g;
    .registers 4

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/media3/exoplayer/hls/a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Landroidx/media3/exoplayer/hls/a;-><init>(Lax/U0/g;[B[B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    return-object p0
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

.method public static j(Lax/c1/e;Lax/U0/g;Lax/P0/v;JLax/d1/f;Landroidx/media3/exoplayer/hls/c$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLax/c1/j;JLandroidx/media3/exoplayer/hls/e;[B[BZZLax/Z0/I1;Lax/m1/g$a;)Landroidx/media3/exoplayer/hls/e;
    .registers 66
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c1/e;",
            "Lax/U0/g;",
            "Lax/P0/v;",
            "J",
            "Lax/d1/f;",
            "Landroidx/media3/exoplayer/hls/c$e;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;I",
            "Ljava/lang/Object;",
            "Z",
            "Lax/c1/j;",
            "J",
            "Landroidx/media3/exoplayer/hls/e;",
            "[B[BZZ",
            "Lax/Z0/I1;",
            "Lax/m1/g$a;",
            ")",
            "Landroidx/media3/exoplayer/hls/e;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p15

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    .line 1
    iget-object v6, v2, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 2
    new-instance v7, Lax/U0/k$b;

    invoke-direct {v7}, Lax/U0/k$b;-><init>()V

    iget-object v8, v1, Lax/d1/j;->a:Ljava/lang/String;

    iget-object v9, v6, Lax/d1/f$g;->q:Ljava/lang/String;

    .line 3
    invoke-static {v8, v9}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Lax/U0/k$b;->i(Landroid/net/Uri;)Lax/U0/k$b;

    move-result-object v7

    iget-wide v8, v6, Lax/d1/f$g;->j0:J

    .line 4
    invoke-virtual {v7, v8, v9}, Lax/U0/k$b;->h(J)Lax/U0/k$b;

    move-result-object v7

    iget-wide v8, v6, Lax/d1/f$g;->k0:J

    .line 5
    invoke-virtual {v7, v8, v9}, Lax/U0/k$b;->g(J)Lax/U0/k$b;

    move-result-object v7

    .line 6
    iget-boolean v8, v2, Landroidx/media3/exoplayer/hls/c$e;->d:Z

    if-eqz v8, :cond_32

    const/16 v8, 0x8

    goto :goto_33

    :cond_32
    const/4 v8, 0x0

    :goto_33
    invoke-virtual {v7, v8}, Lax/U0/k$b;->b(I)Lax/U0/k$b;

    move-result-object v7

    .line 7
    invoke-virtual {v7}, Lax/U0/k$b;->a()Lax/U0/k;

    move-result-object v13

    if-eqz v4, :cond_3f

    const/4 v15, 0x1

    goto :goto_40

    :cond_3f
    const/4 v15, 0x0

    :goto_40
    if-eqz v15, :cond_4f

    .line 8
    iget-object v10, v6, Lax/d1/f$g;->i0:Ljava/lang/String;

    invoke-static {v10}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroidx/media3/exoplayer/hls/e;->l(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_50

    :cond_4f
    const/4 v10, 0x0

    .line 9
    :goto_50
    invoke-static {v0, v4, v10}, Landroidx/media3/exoplayer/hls/e;->h(Lax/U0/g;[B[B)Lax/U0/g;

    move-result-object v12

    .line 10
    iget-object v4, v6, Lax/d1/f$g;->c0:Lax/d1/f$f;

    if-eqz v4, :cond_97

    if-eqz v5, :cond_5c

    const/4 v10, 0x1

    goto :goto_5d

    :cond_5c
    const/4 v10, 0x0

    :goto_5d
    if-eqz v10, :cond_6c

    .line 11
    iget-object v11, v4, Lax/d1/f$g;->i0:Ljava/lang/String;

    invoke-static {v11}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Landroidx/media3/exoplayer/hls/e;->l(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_6d

    :cond_6c
    const/4 v11, 0x0

    .line 12
    :goto_6d
    iget-object v14, v1, Lax/d1/j;->a:Ljava/lang/String;

    const/16 p21, 0x1

    iget-object v7, v4, Lax/d1/f$g;->q:Ljava/lang/String;

    invoke-static {v14, v7}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 13
    new-instance v14, Lax/U0/k$b;

    invoke-direct {v14}, Lax/U0/k$b;-><init>()V

    .line 14
    invoke-virtual {v14, v7}, Lax/U0/k$b;->i(Landroid/net/Uri;)Lax/U0/k$b;

    move-result-object v7

    iget-wide v8, v4, Lax/d1/f$g;->j0:J

    .line 15
    invoke-virtual {v7, v8, v9}, Lax/U0/k$b;->h(J)Lax/U0/k$b;

    move-result-object v7

    iget-wide v8, v4, Lax/d1/f$g;->k0:J

    .line 16
    invoke-virtual {v7, v8, v9}, Lax/U0/k$b;->g(J)Lax/U0/k$b;

    move-result-object v4

    .line 17
    invoke-virtual {v4}, Lax/U0/k$b;->a()Lax/U0/k;

    move-result-object v4

    .line 18
    invoke-static {v0, v5, v11}, Landroidx/media3/exoplayer/hls/e;->h(Lax/U0/g;[B[B)Lax/U0/g;

    move-result-object v0

    move/from16 v18, v10

    goto :goto_9d

    :cond_97
    const/16 p21, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    .line 19
    :goto_9d
    iget-wide v7, v6, Lax/d1/f$g;->f0:J

    add-long v23, p3, v7

    .line 20
    iget-wide v7, v6, Lax/d1/f$g;->d0:J

    add-long v25, v23, v7

    .line 21
    iget v1, v1, Lax/d1/f;->j:I

    iget v5, v6, Lax/d1/f$g;->e0:I

    add-int/2addr v1, v5

    if-eqz v3, :cond_fb

    .line 22
    iget-object v5, v3, Landroidx/media3/exoplayer/hls/e;->q:Lax/U0/k;

    if-eq v4, v5, :cond_cb

    if-eqz v4, :cond_c9

    if-eqz v5, :cond_c9

    iget-object v7, v4, Lax/U0/k;->a:Landroid/net/Uri;

    iget-object v5, v5, Lax/U0/k;->a:Landroid/net/Uri;

    .line 23
    invoke-virtual {v7, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c9

    iget-wide v7, v4, Lax/U0/k;->g:J

    iget-object v5, v3, Landroidx/media3/exoplayer/hls/e;->q:Lax/U0/k;

    iget-wide v9, v5, Lax/U0/k;->g:J

    cmp-long v5, v7, v9

    if-nez v5, :cond_c9

    goto :goto_cb

    :cond_c9
    const/4 v5, 0x0

    goto :goto_cc

    :cond_cb
    :goto_cb
    const/4 v5, 0x1

    .line 24
    :goto_cc
    iget-object v7, v3, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    move-object/from16 v8, p7

    .line 25
    invoke-virtual {v8, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_dc

    iget-boolean v7, v3, Landroidx/media3/exoplayer/hls/e;->J:Z

    if-eqz v7, :cond_dc

    const/4 v9, 0x1

    goto :goto_dd

    :cond_dc
    const/4 v9, 0x0

    .line 26
    :goto_dd
    iget-object v7, v3, Landroidx/media3/exoplayer/hls/e;->y:Lax/E1/h;

    .line 27
    iget-object v10, v3, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    if-eqz v5, :cond_f2

    if-eqz v9, :cond_f2

    .line 28
    iget-boolean v5, v3, Landroidx/media3/exoplayer/hls/e;->L:Z

    if-nez v5, :cond_f2

    iget v5, v3, Landroidx/media3/exoplayer/hls/e;->l:I

    if-ne v5, v1, :cond_f2

    .line 29
    iget-object v3, v3, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    move-object/from16 v16, v3

    goto :goto_f4

    :cond_f2
    const/16 v16, 0x0

    :goto_f4
    move-object/from16 v38, v16

    :goto_f6
    move-object/from16 v39, v7

    move-object/from16 v40, v10

    goto :goto_10c

    :cond_fb
    move-object/from16 v8, p7

    .line 30
    new-instance v7, Lax/E1/h;

    invoke-direct {v7}, Lax/E1/h;-><init>()V

    .line 31
    new-instance v10, Lax/S0/G;

    const/16 v3, 0xa

    invoke-direct {v10, v3}, Lax/S0/G;-><init>(I)V

    const/16 v38, 0x0

    goto :goto_f6

    .line 32
    :goto_10c
    new-instance v10, Landroidx/media3/exoplayer/hls/e;

    move-object/from16 v17, v4

    iget-wide v3, v2, Landroidx/media3/exoplayer/hls/c$e;->b:J

    iget v5, v2, Landroidx/media3/exoplayer/hls/c$e;->c:I

    iget-boolean v2, v2, Landroidx/media3/exoplayer/hls/c$e;->d:Z

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v2, v6, Lax/d1/f$g;->l0:Z

    move-object/from16 v7, p12

    .line 33
    invoke-virtual {v7, v1}, Lax/c1/j;->a(I)Lax/S0/M;

    move-result-object v34

    iget-object v6, v6, Lax/d1/f$g;->g0:Lax/P0/o;

    move-object/from16 v11, p0

    move-object/from16 v14, p2

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move/from16 v33, p11

    move-wide/from16 v35, p13

    move/from16 v41, p18

    move/from16 v42, p19

    move-object/from16 v43, p20

    move-object/from16 v16, v0

    move/from16 v31, v1

    move/from16 v32, v2

    move-wide/from16 v27, v3

    move/from16 v29, v5

    move-object/from16 v37, v6

    move-object/from16 v19, v8

    invoke-direct/range {v10 .. v43}, Landroidx/media3/exoplayer/hls/e;-><init>(Lax/c1/e;Lax/U0/g;Lax/U0/k;Lax/P0/v;ZLax/U0/g;Lax/U0/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLax/S0/M;JLax/P0/o;Lax/c1/f;Lax/E1/h;Lax/S0/G;ZZLax/Z0/I1;)V

    return-object v10
.end method

.method private k(Lax/U0/g;Lax/U0/k;ZZ)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_a

    .line 3
    .line 4
    iget p3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 5
    .line 6
    if-eqz p3, :cond_8

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_8
    move-object p3, p2

    .line 10
    goto :goto_11

    .line 11
    :cond_a
    iget p3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, Lax/U0/k;->e(J)Lax/U0/k;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_11
    :try_start_11
    invoke-direct {p0, p1, p3, p4}, Landroidx/media3/exoplayer/hls/e;->v(Lax/U0/g;Lax/U0/k;Z)Lax/q1/k;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_1f

    .line 23
    .line 24
    iget p4, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 25
    .line 26
    invoke-interface {p3, p4}, Lax/q1/s;->n(I)V
    :try_end_1c
    .catchall {:try_start_11 .. :try_end_1c} :catchall_1d

    .line 27
    .line 28
    .line 29
    goto :goto_1f

    .line 30
    :catchall_1d
    move-exception p2

    .line 31
    goto :goto_5f

    .line 32
    :cond_1f
    :goto_1f
    :try_start_1f
    iget-boolean p4, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 33
    .line 34
    if-nez p4, :cond_30

    .line 35
    .line 36
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 37
    .line 38
    invoke-interface {p4, p3}, Lax/c1/f;->b(Lax/q1/s;)Z

    .line 39
    .line 40
    .line 41
    move-result p4
    :try_end_29
    .catch Ljava/io/EOFException; {:try_start_1f .. :try_end_29} :catch_2e
    .catchall {:try_start_1f .. :try_end_29} :catchall_2c

    .line 42
    if-eqz p4, :cond_30

    .line 43
    .line 44
    goto :goto_1f

    .line 45
    :catchall_2c
    move-exception p4

    .line 46
    goto :goto_54

    .line 47
    :catch_2e
    move-exception p4

    .line 48
    goto :goto_3b

    .line 49
    :cond_30
    :try_start_30
    invoke-interface {p3}, Lax/q1/s;->getPosition()J

    .line 50
    .line 51
    .line 52
    move-result-wide p3

    .line 53
    iget-wide v0, p2, Lax/U0/k;->g:J

    .line 54
    .line 55
    :goto_36
    sub-long/2addr p3, v0

    .line 56
    long-to-int p2, p3

    .line 57
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->G:I
    :try_end_3a
    .catchall {:try_start_30 .. :try_end_3a} :catchall_1d

    .line 58
    .line 59
    goto :goto_4f

    .line 60
    :goto_3b
    :try_start_3b
    iget-object v0, p0, Lax/j1/b;->d:Lax/P0/v;

    .line 61
    .line 62
    iget v0, v0, Lax/P0/v;->f:I

    .line 63
    .line 64
    and-int/lit16 v0, v0, 0x4000

    .line 65
    .line 66
    if-eqz v0, :cond_53

    .line 67
    .line 68
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 69
    .line 70
    invoke-interface {p4}, Lax/c1/f;->c()V
    :try_end_48
    .catchall {:try_start_3b .. :try_end_48} :catchall_2c

    .line 71
    .line 72
    .line 73
    :try_start_48
    invoke-interface {p3}, Lax/q1/s;->getPosition()J

    .line 74
    .line 75
    .line 76
    move-result-wide p3

    .line 77
    iget-wide v0, p2, Lax/U0/k;->g:J
    :try_end_4e
    .catchall {:try_start_48 .. :try_end_4e} :catchall_1d

    .line 78
    .line 79
    goto :goto_36

    .line 80
    :goto_4f
    invoke-static {p1}, Lax/U0/j;->a(Lax/U0/g;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_53
    :try_start_53
    throw p4
    :try_end_54
    .catchall {:try_start_53 .. :try_end_54} :catchall_2c

    .line 85
    :goto_54
    :try_start_54
    invoke-interface {p3}, Lax/q1/s;->getPosition()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iget-wide p2, p2, Lax/U0/k;->g:J

    .line 90
    .line 91
    sub-long/2addr v0, p2

    .line 92
    long-to-int p2, v0

    .line 93
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 94
    .line 95
    throw p4
    :try_end_5f
    .catchall {:try_start_54 .. :try_end_5f} :catchall_1d

    .line 96
    :goto_5f
    invoke-static {p1}, Lax/U0/j;->a(Lax/U0/g;)V

    .line 97
    .line 98
    .line 99
    throw p2
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

.method private static l(Ljava/lang/String;)[B
    .registers 5

    .line 1
    invoke-static {p0}, Lax/q7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_11
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_24

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    const/4 v2, 0x0

    .line 38
    :goto_25
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
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

.method private s()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/j1/b;->i:Lax/U0/y;

    .line 2
    .line 3
    iget-object v1, p0, Lax/j1/b;->b:Lax/U0/k;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/e;->A:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/e;->k(Lax/U0/g;Lax/U0/k;ZZ)V

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

.method private t()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->p:Lax/U0/g;

    .line 7
    .line 8
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->q:Lax/U0/k;

    .line 12
    .line 13
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->p:Lax/U0/g;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/e;->q:Lax/U0/k;

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/e;->B:Z

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/e;->k(Lax/U0/g;Lax/U0/k;ZZ)V

    .line 24
    .line 25
    .line 26
    iput v3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 27
    .line 28
    iput-boolean v3, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private u(Lax/q1/s;)J
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    :try_start_8
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lax/S0/G;->X(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 17
    .line 18
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-interface {p1, v2, v4, v3}, Lax/q1/s;->p([BII)V
    :try_end_19
    .catch Ljava/io/EOFException; {:try_start_8 .. :try_end_19} :catch_a9

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 27
    .line 28
    invoke-virtual {v2}, Lax/S0/G;->P()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v5, 0x494433

    .line 33
    .line 34
    .line 35
    if-eq v2, v5, :cond_25

    .line 36
    .line 37
    return-wide v0

    .line 38
    :cond_25
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    invoke-virtual {v2, v5}, Lax/S0/G;->c0(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 45
    .line 46
    invoke-virtual {v2}, Lax/S0/G;->L()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v5, v2, 0xa

    .line 51
    .line 52
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 53
    .line 54
    invoke-virtual {v6}, Lax/S0/G;->b()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-le v5, v6, :cond_4f

    .line 59
    .line 60
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 61
    .line 62
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 67
    .line 68
    invoke-virtual {v7, v5}, Lax/S0/G;->X(I)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 72
    .line 73
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 81
    .line 82
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {p1, v5, v3, v2}, Lax/q1/s;->p([BII)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->y:Lax/E1/h;

    .line 90
    .line 91
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 92
    .line 93
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p1, v3, v2}, Lax/E1/h;->e([BI)Lax/P0/C;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_67

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_67
    invoke-virtual {p1}, Lax/P0/C;->e()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x0

    .line 109
    :goto_6c
    if-ge v3, v2, :cond_a9

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Lax/P0/C;->d(I)Lax/P0/C$a;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    instance-of v6, v5, Lax/E1/m;

    .line 116
    .line 117
    if-eqz v6, :cond_a6

    .line 118
    .line 119
    check-cast v5, Lax/E1/m;

    .line 120
    .line 121
    iget-object v6, v5, Lax/E1/m;->b:Ljava/lang/String;

    .line 122
    .line 123
    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_a6

    .line 130
    .line 131
    iget-object p1, v5, Lax/E1/m;->c:[B

    .line 132
    .line 133
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 134
    .line 135
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Lax/S0/G;->b0(I)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Lax/S0/G;->a0(I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lax/S0/G;

    .line 155
    .line 156
    invoke-virtual {p1}, Lax/S0/G;->F()J

    .line 157
    .line 158
    .line 159
    move-result-wide v0

    .line 160
    const-wide v2, 0x1ffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v0, v2

    .line 166
    return-wide v0

    .line 167
    :cond_a6
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_6c

    .line 170
    :catch_a9
    :cond_a9
    return-wide v0
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

.method private v(Lax/U0/g;Lax/U0/k;Z)Lax/q1/k;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1, p2}, Lax/U0/g;->f(Lax/U0/k;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    if-eqz p3, :cond_20

    .line 6
    .line 7
    :try_start_6
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->u:Lax/S0/M;

    .line 8
    .line 9
    iget-boolean v7, p0, Landroidx/media3/exoplayer/hls/e;->s:Z

    .line 10
    .line 11
    iget-wide v8, p0, Lax/j1/b;->g:J

    .line 12
    .line 13
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/e;->D:J

    .line 14
    .line 15
    invoke-virtual/range {v6 .. v11}, Lax/S0/M;->j(ZJJ)V
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_11} :catch_1a
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_11} :catch_12

    .line 16
    .line 17
    .line 18
    goto :goto_20

    .line 19
    :catch_12
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    new-instance p2, Ljava/io/IOException;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw p2

    .line 27
    :catch_1a
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_20
    :goto_20
    new-instance v0, Lax/q1/k;

    .line 34
    .line 35
    iget-wide v2, p2, Lax/U0/k;->g:J

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    invoke-direct/range {v0 .. v5}, Lax/q1/k;-><init>(Lax/P0/k;JJ)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 42
    .line 43
    if-nez p1, :cond_86

    .line 44
    .line 45
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/e;->u(Lax/q1/s;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    invoke-virtual {v0}, Lax/q1/k;->m()V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->r:Lax/c1/f;

    .line 53
    .line 54
    if-eqz p1, :cond_3c

    .line 55
    .line 56
    invoke-interface {p1}, Lax/c1/f;->f()Lax/c1/f;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_53

    .line 61
    :cond_3c
    move-object v6, v0

    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->v:Lax/c1/e;

    .line 63
    .line 64
    iget-object p1, p2, Lax/U0/k;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iget-object v2, p0, Lax/j1/b;->d:Lax/P0/v;

    .line 67
    .line 68
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/e;->w:Ljava/util/List;

    .line 69
    .line 70
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/e;->u:Lax/S0/M;

    .line 71
    .line 72
    invoke-interface {v1}, Lax/U0/g;->l()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/e;->C:Lax/Z0/I1;

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-interface/range {v0 .. v7}, Lax/c1/e;->e(Landroid/net/Uri;Lax/P0/v;Ljava/util/List;Lax/S0/M;Ljava/util/Map;Lax/q1/s;Lax/Z0/I1;)Lax/c1/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object v0, v6

    .line 84
    :goto_53
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 85
    .line 86
    invoke-interface {p1}, Lax/c1/f;->d()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_73

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 93
    .line 94
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    cmp-long v1, v8, p2

    .line 100
    .line 101
    if-eqz v1, :cond_6d

    .line 102
    .line 103
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->u:Lax/S0/M;

    .line 104
    .line 105
    invoke-virtual {p2, v8, v9}, Lax/S0/M;->b(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide p2

    .line 109
    goto :goto_6f

    .line 110
    :cond_6d
    iget-wide p2, p0, Lax/j1/b;->g:J

    .line 111
    .line 112
    :goto_6f
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/l;->r0(J)V

    .line 113
    .line 114
    .line 115
    goto :goto_7a

    .line 116
    :cond_73
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 117
    .line 118
    const-wide/16 p2, 0x0

    .line 119
    .line 120
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/l;->r0(J)V

    .line 121
    .line 122
    .line 123
    :goto_7a
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/l;->d0()V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 129
    .line 130
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 131
    .line 132
    invoke-interface {p1, p2}, Lax/c1/f;->a(Lax/q1/t;)V

    .line 133
    .line 134
    .line 135
    :cond_86
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 136
    .line 137
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->x:Lax/P0/o;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/hls/l;->o0(Lax/P0/o;)V

    .line 140
    .line 141
    .line 142
    return-object v0
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

.method public static y(Landroidx/media3/exoplayer/hls/e;JLandroid/net/Uri;ZLandroidx/media3/exoplayer/hls/c$e;J)Z
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {p3, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_11

    .line 12
    .line 13
    iget-boolean p0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 14
    .line 15
    if-eqz p0, :cond_11

    .line 16
    .line 17
    return v0

    .line 18
    :cond_11
    iget-object p0, p5, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 19
    .line 20
    iget-wide v1, p0, Lax/d1/f$g;->f0:J

    .line 21
    .line 22
    add-long/2addr p6, v1

    .line 23
    if-eqz p4, :cond_1e

    .line 24
    .line 25
    cmp-long p0, p6, p1

    .line 26
    .line 27
    if-gez p0, :cond_1d

    .line 28
    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    return v0

    .line 31
    :cond_1e
    :goto_1e
    const/4 p0, 0x1

    .line 32
    return p0
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


# virtual methods
.method public a()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 7
    .line 8
    if-nez v0, :cond_1a

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->r:Lax/c1/f;

    .line 11
    .line 12
    if-eqz v0, :cond_1a

    .line 13
    .line 14
    invoke-interface {v0}, Lax/c1/f;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->r:Lax/c1/f;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/e;->E:Lax/c1/f;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    .line 26
    .line 27
    :cond_1a
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/e;->t()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 31
    .line 32
    if-nez v0, :cond_2e

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->t:Z

    .line 35
    .line 36
    if-nez v0, :cond_28

    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/e;->s()V

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 46
    .line 47
    :cond_2e
    return-void
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

.method public c()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

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

.method public i()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

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

.method public m(I)I
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->K:Lax/r7/z;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_11

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->K:Lax/r7/z;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
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

.method public n()J
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_e

    .line 11
    .line 12
    iget-wide v2, p0, Lax/j1/b;->g:J

    .line 13
    .line 14
    add-long/2addr v2, v0

    .line 15
    :cond_e
    return-wide v2
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public o(Landroidx/media3/exoplayer/hls/l;Lax/r7/z;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/l;",
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->K:Lax/r7/z;

    .line 4
    .line 5
    return-void
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

.method public p()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->L:Z

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

.method public q()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 2
    .line 3
    return v0
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

.method public r()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public w(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/e;->M:J

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

.method public x()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    .line 2
    .line 3
    return v0
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
