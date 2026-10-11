.class public final Lax/a1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a1/B;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a1/f0$g;,
        Lax/a1/f0$e;,
        Lax/a1/f0$d;,
        Lax/a1/f0$n;,
        Lax/a1/f0$k;,
        Lax/a1/f0$m;,
        Lax/a1/f0$f;,
        Lax/a1/f0$h;,
        Lax/a1/f0$c;,
        Lax/a1/f0$b;,
        Lax/a1/f0$l;,
        Lax/a1/f0$o;,
        Lax/a1/f0$i;,
        Lax/a1/f0$j;
    }
.end annotation


# static fields
.field public static q0:Z

.field private static final r0:Ljava/lang/Object;

.field private static s0:Ljava/util/concurrent/ScheduledExecutorService;

.field private static t0:I


# instance fields
.field private A:Lax/a1/e;

.field private B:Lax/a1/j;

.field private C:Lax/a1/f0$l;

.field private D:Lax/P0/c;

.field private E:Lax/a1/f0$k;

.field private F:Lax/a1/f0$k;

.field private G:Lax/P0/G;

.field private H:Z

.field private I:Ljava/nio/ByteBuffer;

.field private J:I

.field private K:J

.field private L:J

.field private M:J

.field private N:J

.field private O:I

.field private P:Z

.field private Q:Z

.field private R:J

.field private S:F

.field private T:Ljava/nio/ByteBuffer;

.field private U:I

.field private V:Ljava/nio/ByteBuffer;

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private final a:Landroid/content/Context;

.field private a0:Z

.field private final b:Lax/Q0/p;

.field private b0:I

.field private final c:Z

.field private c0:Z

.field private final d:Lax/a1/G;

.field private d0:Lax/P0/g;

.field private final e:Lax/a1/H0;

.field private e0:Lax/a1/k;

.field private final f:Lax/Q0/t;

.field private f0:Z

.field private final g:Lax/a1/G0;

.field private g0:J

.field private final h:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/Q0/o;",
            ">;"
        }
    .end annotation
.end field

.field private h0:J

.field private final i:Lax/a1/F;

.field private i0:Z

.field private final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/a1/f0$k;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Z

.field private final k:Z

.field private k0:Landroid/os/Looper;

.field private l:I

.field private l0:J

.field private m:Lax/a1/f0$o;

.field private m0:J

.field private final n:Lax/a1/f0$m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/a1/f0$m<",
            "Lax/a1/B$c;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Landroid/os/Handler;

.field private final o:Lax/a1/f0$m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/a1/f0$m<",
            "Lax/a1/B$f;",
            ">;"
        }
    .end annotation
.end field

.field private o0:Landroid/content/Context;

.field private final p:Lax/a1/f0$e;

.field private p0:Z

.field private final q:Lax/a1/f0$d;

.field private final r:Landroidx/media3/exoplayer/ExoPlayer$a;

.field private final s:Lax/a1/f0$f;

.field private final t:I

.field private u:Lax/Z0/I1;

.field private v:Lax/a1/B$d;

.field private w:Lax/a1/f0$h;

.field private x:Lax/a1/f0$h;

.field private y:Lax/Q0/n;

.field private z:Landroid/media/AudioTrack;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/a1/f0;->r0:Ljava/lang/Object;

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

.method private constructor <init>(Lax/a1/f0$g;)V
    .registers 13

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/a1/f0$g;->a(Lax/a1/f0$g;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_c

    move-object v0, v1

    goto :goto_14

    :cond_c
    invoke-static {p1}, Lax/a1/f0$g;->a(Lax/a1/f0$g;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_14
    iput-object v0, p0, Lax/a1/f0;->a:Landroid/content/Context;

    .line 4
    sget-object v2, Lax/P0/c;->h:Lax/P0/c;

    iput-object v2, p0, Lax/a1/f0;->D:Lax/P0/c;

    if-eqz v0, :cond_1e

    move-object v0, v1

    goto :goto_22

    .line 5
    :cond_1e
    invoke-static {p1}, Lax/a1/f0$g;->e(Lax/a1/f0$g;)Lax/a1/e;

    move-result-object v0

    :goto_22
    iput-object v0, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 6
    invoke-static {p1}, Lax/a1/f0$g;->f(Lax/a1/f0$g;)Lax/Q0/p;

    move-result-object v0

    iput-object v0, p0, Lax/a1/f0;->b:Lax/Q0/p;

    .line 7
    invoke-static {p1}, Lax/a1/f0$g;->g(Lax/a1/f0$g;)Z

    move-result v0

    iput-boolean v0, p0, Lax/a1/f0;->c:Z

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    const/4 v3, 0x0

    if-lt v0, v2, :cond_3f

    invoke-static {p1}, Lax/a1/f0$g;->h(Lax/a1/f0$g;)Z

    move-result v2

    if-eqz v2, :cond_3f

    const/4 v2, 0x1

    goto :goto_40

    :cond_3f
    const/4 v2, 0x0

    :goto_40
    iput-boolean v2, p0, Lax/a1/f0;->k:Z

    .line 9
    iput v3, p0, Lax/a1/f0;->l:I

    .line 10
    invoke-static {p1}, Lax/a1/f0$g;->i(Lax/a1/f0$g;)Lax/a1/f0$e;

    move-result-object v2

    iput-object v2, p0, Lax/a1/f0;->p:Lax/a1/f0$e;

    .line 11
    invoke-static {p1}, Lax/a1/f0$g;->j(Lax/a1/f0$g;)Lax/a1/f0$d;

    move-result-object v2

    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lax/a1/f0$d;

    iput-object v2, p0, Lax/a1/f0;->q:Lax/a1/f0$d;

    .line 12
    new-instance v2, Lax/a1/F;

    new-instance v4, Lax/a1/f0$n;

    invoke-direct {v4, p0, v1}, Lax/a1/f0$n;-><init>(Lax/a1/f0;Lax/a1/f0$a;)V

    invoke-direct {v2, v4}, Lax/a1/F;-><init>(Lax/a1/F$a;)V

    iput-object v2, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 13
    new-instance v1, Lax/a1/G;

    invoke-direct {v1}, Lax/a1/G;-><init>()V

    iput-object v1, p0, Lax/a1/f0;->d:Lax/a1/G;

    .line 14
    new-instance v2, Lax/a1/H0;

    invoke-direct {v2}, Lax/a1/H0;-><init>()V

    iput-object v2, p0, Lax/a1/f0;->e:Lax/a1/H0;

    .line 15
    new-instance v4, Lax/Q0/t;

    invoke-direct {v4}, Lax/Q0/t;-><init>()V

    iput-object v4, p0, Lax/a1/f0;->f:Lax/Q0/t;

    .line 16
    new-instance v4, Lax/a1/G0;

    invoke-direct {v4}, Lax/a1/G0;-><init>()V

    iput-object v4, p0, Lax/a1/f0;->g:Lax/a1/G0;

    .line 17
    invoke-static {v2, v1}, Lax/r7/z;->B(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/z;

    move-result-object v1

    iput-object v1, p0, Lax/a1/f0;->h:Lax/r7/z;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    iput v1, p0, Lax/a1/f0;->S:F

    .line 19
    iput v3, p0, Lax/a1/f0;->b0:I

    .line 20
    new-instance v1, Lax/P0/g;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v2}, Lax/P0/g;-><init>(IF)V

    iput-object v1, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 21
    new-instance v4, Lax/a1/f0$k;

    sget-object v5, Lax/P0/G;->d:Lax/P0/G;

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v4 .. v10}, Lax/a1/f0$k;-><init>(Lax/P0/G;JJLax/a1/f0$a;)V

    iput-object v4, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 22
    iput-object v5, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 23
    iput-boolean v3, p0, Lax/a1/f0;->H:Z

    .line 24
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 25
    new-instance v1, Lax/a1/f0$m;

    invoke-direct {v1}, Lax/a1/f0$m;-><init>()V

    iput-object v1, p0, Lax/a1/f0;->n:Lax/a1/f0$m;

    .line 26
    new-instance v1, Lax/a1/f0$m;

    invoke-direct {v1}, Lax/a1/f0$m;-><init>()V

    iput-object v1, p0, Lax/a1/f0;->o:Lax/a1/f0$m;

    .line 27
    invoke-static {p1}, Lax/a1/f0$g;->b(Lax/a1/f0$g;)Landroidx/media3/exoplayer/ExoPlayer$a;

    move-result-object v1

    iput-object v1, p0, Lax/a1/f0;->r:Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 28
    invoke-static {p1}, Lax/a1/f0$g;->c(Lax/a1/f0$g;)Lax/a1/f0$f;

    move-result-object v1

    iput-object v1, p0, Lax/a1/f0;->s:Lax/a1/f0$f;

    const/16 v1, 0x22

    if-lt v0, v1, :cond_d9

    .line 29
    invoke-static {p1}, Lax/a1/f0$g;->a(Lax/a1/f0$g;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_d0

    goto :goto_d9

    .line 30
    :cond_d0
    invoke-static {p1}, Lax/a1/f0$g;->a(Lax/a1/f0$g;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lax/a1/f0;->a0(Landroid/content/Context;)I

    move-result v0

    goto :goto_da

    :cond_d9
    :goto_d9
    const/4 v0, -0x1

    :goto_da
    iput v0, p0, Lax/a1/f0;->t:I

    .line 31
    invoke-static {p1}, Lax/a1/f0$g;->d(Lax/a1/f0$g;)Z

    move-result p1

    iput-boolean p1, p0, Lax/a1/f0;->p0:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/a1/f0$g;Lax/a1/f0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/a1/f0;-><init>(Lax/a1/f0$g;)V

    return-void
.end method

.method private A0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/a1/f0$h;->i:Lax/Q0/n;

    .line 4
    .line 5
    iput-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/Q0/n;->b()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method private B0()Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 6
    .line 7
    iget v1, v0, Lax/a1/f0$h;->c:I

    .line 8
    .line 9
    if-nez v1, :cond_16

    .line 10
    .line 11
    iget-object v0, v0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 12
    .line 13
    iget v0, v0, Lax/P0/v;->I:I

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lax/a1/f0;->C0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    return v0
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

.method private C0(I)Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-static {p1}, Lax/S0/d0;->K0(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private D0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-boolean v0, v0, Lax/a1/f0$h;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method private static E0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
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

.method public static synthetic F(Lax/a1/B$d;Lax/a1/B$a;)V
    .registers 2

    .line 1
    invoke-interface {p0, p1}, Lax/a1/B$d;->b(Lax/a1/B$a;)V

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

.method private F0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .registers 16

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    if-lt v0, v1, :cond_13

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    mul-long v8, p4, v2

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    move v6, p3

    .line 15
    invoke-static/range {v4 .. v9}, Lax/a1/W;->a(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IIJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_13
    move-object v4, p1

    .line 21
    move-object v5, p2

    .line 22
    move v6, p3

    .line 23
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    if-nez p1, :cond_2f

    .line 26
    .line 27
    const/16 p1, 0x10

    .line 28
    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    sget-object p2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    const p2, 0x55550001

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    :cond_2f
    iget p1, p0, Lax/a1/f0;->J:I

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    if-nez p1, :cond_4a

    .line 52
    .line 53
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    const/4 p3, 0x4

    .line 56
    invoke-virtual {p1, p3, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    mul-long p4, p4, v2

    .line 64
    .line 65
    invoke-virtual {p1, p3, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 71
    .line 72
    .line 73
    iput v6, p0, Lax/a1/f0;->J:I

    .line 74
    .line 75
    :cond_4a
    iget-object p1, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-lez p1, :cond_61

    .line 82
    .line 83
    iget-object p3, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    const/4 p4, 0x1

    .line 86
    invoke-virtual {v4, p3, p1, p4}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-gez p3, :cond_5e

    .line 91
    .line 92
    iput p2, p0, Lax/a1/f0;->J:I

    .line 93
    .line 94
    return p3

    .line 95
    :cond_5e
    if-ge p3, p1, :cond_61

    .line 96
    .line 97
    return p2

    .line 98
    :cond_61
    invoke-static {v4, v5, v6}, Lax/a1/f0;->E0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-gez p1, :cond_6a

    .line 103
    .line 104
    iput p2, p0, Lax/a1/f0;->J:I

    .line 105
    .line 106
    return p1

    .line 107
    :cond_6a
    iget p2, p0, Lax/a1/f0;->J:I

    .line 108
    .line 109
    sub-int/2addr p2, p1

    .line 110
    iput p2, p0, Lax/a1/f0;->J:I

    .line 111
    .line 112
    return p1
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

.method public static synthetic G(Lax/a1/f0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->o0()V

    return-void
.end method

.method public static synthetic H(Landroid/media/AudioTrack;Lax/a1/B$d;Landroid/os/Handler;Lax/a1/B$a;)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_38

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_1f

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1f

    .line 23
    .line 24
    new-instance p0, Lax/a1/e0;

    .line 25
    .line 26
    invoke-direct {p0, p1, p3}, Lax/a1/e0;-><init>(Lax/a1/B$d;Lax/a1/B$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_1f
    sget-object p0, Lax/a1/f0;->r0:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter p0

    .line 35
    :try_start_22
    sget p1, Lax/a1/f0;->t0:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    sput p1, Lax/a1/f0;->t0:I

    .line 40
    .line 41
    if-nez p1, :cond_34

    .line 42
    .line 43
    sget-object p1, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    goto :goto_34

    .line 51
    :catchall_32
    move-exception p1

    .line 52
    goto :goto_36

    .line 53
    :cond_34
    :goto_34
    monitor-exit p0

    .line 54
    return-void

    .line 55
    :goto_36
    monitor-exit p0
    :try_end_37
    .catchall {:try_start_22 .. :try_end_37} :catchall_32

    .line 56
    throw p1

    .line 57
    :catchall_38
    move-exception p0

    .line 58
    if-eqz p1, :cond_51

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_51

    .line 73
    .line 74
    new-instance v1, Lax/a1/e0;

    .line 75
    .line 76
    invoke-direct {v1, p1, p3}, Lax/a1/e0;-><init>(Lax/a1/B$d;Lax/a1/B$a;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    :cond_51
    sget-object p1, Lax/a1/f0;->r0:Ljava/lang/Object;

    .line 83
    .line 84
    monitor-enter p1

    .line 85
    :try_start_54
    sget p2, Lax/a1/f0;->t0:I

    .line 86
    .line 87
    add-int/lit8 p2, p2, -0x1

    .line 88
    .line 89
    sput p2, Lax/a1/f0;->t0:I

    .line 90
    .line 91
    if-nez p2, :cond_66

    .line 92
    .line 93
    sget-object p2, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 99
    .line 100
    goto :goto_66

    .line 101
    :catchall_64
    move-exception p0

    .line 102
    goto :goto_68

    .line 103
    :cond_66
    :goto_66
    monitor-exit p1
    :try_end_67
    .catchall {:try_start_54 .. :try_end_67} :catchall_64

    .line 104
    throw p0

    .line 105
    :goto_68
    :try_start_68
    monitor-exit p1
    :try_end_69
    .catchall {:try_start_68 .. :try_end_69} :catchall_64

    .line 106
    throw p0
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

.method static synthetic I(Lax/a1/f0;)Landroid/media/AudioTrack;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

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

.method static synthetic J(Lax/a1/f0;)Lax/a1/B$d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a1/f0;->v:Lax/a1/B$d;

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

.method static synthetic K(Lax/a1/f0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/a1/f0;->Z:Z

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

.method static synthetic L(Lax/a1/f0;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/a1/f0;->Y:Z

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

.method static synthetic M(Lax/a1/f0;)J
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->e0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method static synthetic N(Lax/a1/f0;)J
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method static synthetic O(Lax/a1/f0;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/a1/f0;->h0:J

    .line 2
    .line 3
    return-wide v0
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

.method static synthetic P()Z
    .registers 1

    .line 1
    invoke-static {}, Lax/a1/f0;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

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

.method static synthetic Q(I)I
    .registers 1

    .line 1
    invoke-static {p0}, Lax/a1/f0;->d0(I)I

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

.method private R(J)V
    .registers 11

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->D0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1b

    .line 6
    .line 7
    invoke-direct {p0}, Lax/a1/f0;->B0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_15

    .line 12
    .line 13
    iget-object v0, p0, Lax/a1/f0;->b:Lax/Q0/p;

    .line 14
    .line 15
    iget-object v1, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lax/Q0/p;->b(Lax/P0/G;)Lax/P0/G;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_17

    .line 22
    :cond_15
    sget-object v0, Lax/P0/G;->d:Lax/P0/G;

    .line 23
    .line 24
    :goto_17
    iput-object v0, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 25
    .line 26
    :goto_19
    move-object v2, v0

    .line 27
    goto :goto_1e

    .line 28
    :cond_1b
    sget-object v0, Lax/P0/G;->d:Lax/P0/G;

    .line 29
    .line 30
    goto :goto_19

    .line 31
    :goto_1e
    invoke-direct {p0}, Lax/a1/f0;->B0()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2d

    .line 36
    .line 37
    iget-object v0, p0, Lax/a1/f0;->b:Lax/Q0/p;

    .line 38
    .line 39
    iget-boolean v1, p0, Lax/a1/f0;->H:Z

    .line 40
    .line 41
    invoke-interface {v0, v1}, Lax/Q0/p;->d(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    const/4 v0, 0x0

    .line 47
    :goto_2e
    iput-boolean v0, p0, Lax/a1/f0;->H:Z

    .line 48
    .line 49
    iget-object v0, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    new-instance v1, Lax/a1/f0$k;

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    iget-object p1, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 60
    .line 61
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    invoke-virtual {p1, v5, v6}, Lax/a1/f0$h;->d(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-direct/range {v1 .. v7}, Lax/a1/f0$k;-><init>(Lax/P0/G;JJLax/a1/f0$a;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Lax/a1/f0;->A0()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 80
    .line 81
    if-eqz p1, :cond_57

    .line 82
    .line 83
    iget-boolean p2, p0, Lax/a1/f0;->H:Z

    .line 84
    .line 85
    invoke-interface {p1, p2}, Lax/a1/B$d;->e(Z)V

    .line 86
    .line 87
    .line 88
    :cond_57
    return-void
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

.method private S(J)J
    .registers 8

    .line 1
    :goto_0
    iget-object v0, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_21

    .line 8
    .line 9
    iget-object v0, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/a1/f0$k;

    .line 16
    .line 17
    iget-wide v0, v0, Lax/a1/f0$k;->c:J

    .line 18
    .line 19
    cmp-long v2, p1, v0

    .line 20
    .line 21
    if-ltz v2, :cond_21

    .line 22
    .line 23
    iget-object v0, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lax/a1/f0$k;

    .line 30
    .line 31
    iput-object v0, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_21
    iget-object v0, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 35
    .line 36
    iget-wide v1, v0, Lax/a1/f0$k;->c:J

    .line 37
    .line 38
    sub-long/2addr p1, v1

    .line 39
    iget-object v0, v0, Lax/a1/f0$k;->a:Lax/P0/G;

    .line 40
    .line 41
    iget v0, v0, Lax/P0/G;->a:F

    .line 42
    .line 43
    invoke-static {p1, p2, v0}, Lax/S0/d0;->h0(JF)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-object v2, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_45

    .line 54
    .line 55
    iget-object v2, p0, Lax/a1/f0;->b:Lax/Q0/p;

    .line 56
    .line 57
    invoke-interface {v2, p1, p2}, Lax/Q0/p;->a(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object v2, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 62
    .line 63
    iget-wide v3, v2, Lax/a1/f0$k;->b:J

    .line 64
    .line 65
    add-long/2addr v3, p1

    .line 66
    sub-long/2addr p1, v0

    .line 67
    iput-wide p1, v2, Lax/a1/f0$k;->d:J

    .line 68
    .line 69
    return-wide v3

    .line 70
    :cond_45
    iget-object p1, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 71
    .line 72
    iget-wide v2, p1, Lax/a1/f0$k;->b:J

    .line 73
    .line 74
    add-long/2addr v2, v0

    .line 75
    iget-wide p1, p1, Lax/a1/f0$k;->d:J

    .line 76
    .line 77
    add-long/2addr v2, p1

    .line 78
    return-wide v2
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

.method private T(J)J
    .registers 8

    .line 1
    iget-object v0, p0, Lax/a1/f0;->b:Lax/Q0/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/Q0/p;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Lax/a1/f0$h;->d(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    add-long/2addr p1, v2

    .line 14
    iget-wide v2, p0, Lax/a1/f0;->l0:J

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-lez v4, :cond_20

    .line 19
    .line 20
    iget-object v4, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    invoke-virtual {v4, v2, v3}, Lax/a1/f0$h;->d(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iput-wide v0, p0, Lax/a1/f0;->l0:J

    .line 29
    .line 30
    invoke-direct {p0, v2, v3}, Lax/a1/f0;->g0(J)V

    .line 31
    .line 32
    .line 33
    :cond_20
    return-wide p1
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

.method private U(Lax/a1/B$a;Lax/P0/c;ILax/P0/v;Landroid/content/Context;)Landroid/media/AudioTrack;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$c;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/a1/f0;->s:Lax/a1/f0$f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p5}, Lax/a1/f0$f;->b(Lax/a1/B$a;Lax/P0/c;ILandroid/content/Context;)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p2
    :try_end_6
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_6} :catch_28
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_6} :catch_23

    .line 7
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 p3, 0x1

    .line 12
    if-ne v1, p3, :cond_e

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_e
    :try_start_e
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_11} :catch_11

    .line 16
    .line 17
    .line 18
    :catch_11
    new-instance v0, Lax/a1/B$c;

    .line 19
    .line 20
    iget v2, p1, Lax/a1/B$a;->b:I

    .line 21
    .line 22
    iget v3, p1, Lax/a1/B$a;->c:I

    .line 23
    .line 24
    iget v4, p1, Lax/a1/B$a;->a:I

    .line 25
    .line 26
    iget v5, p1, Lax/a1/B$a;->f:I

    .line 27
    .line 28
    iget-boolean v7, p1, Lax/a1/B$a;->e:Z

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    move-object v6, p4

    .line 32
    invoke-direct/range {v0 .. v8}, Lax/a1/B$c;-><init>(IIIIILax/P0/v;ZLjava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :catch_23
    move-exception v0

    .line 37
    :goto_24
    move-object v6, p4

    .line 38
    move-object p2, v0

    .line 39
    move-object v9, p2

    .line 40
    goto :goto_2a

    .line 41
    :catch_28
    move-exception v0

    .line 42
    goto :goto_24

    .line 43
    :goto_2a
    new-instance v1, Lax/a1/B$c;

    .line 44
    .line 45
    iget v3, p1, Lax/a1/B$a;->b:I

    .line 46
    .line 47
    iget v4, p1, Lax/a1/B$a;->c:I

    .line 48
    .line 49
    iget v5, p1, Lax/a1/B$a;->a:I

    .line 50
    .line 51
    move-object v7, v6

    .line 52
    iget v6, p1, Lax/a1/B$a;->f:I

    .line 53
    .line 54
    iget-boolean v8, p1, Lax/a1/B$a;->e:Z

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-direct/range {v1 .. v9}, Lax/a1/B$c;-><init>(IIIIILax/P0/v;ZLjava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    throw v1
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
.end method

.method private V(Lax/a1/f0$h;)Landroid/media/AudioTrack;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$c;
        }
    .end annotation

    .line 1
    :try_start_0
    iget v0, p0, Lax/a1/f0;->b0:I

    .line 2
    .line 3
    iget v1, p0, Lax/a1/f0;->t:I
    :try_end_4
    .catch Lax/a1/B$c; {:try_start_0 .. :try_end_4} :catch_46

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v1, v2, :cond_26

    .line 7
    .line 8
    :try_start_7
    iget-object v2, p0, Lax/a1/f0;->a:Landroid/content/Context;

    .line 9
    .line 10
    if-eqz v2, :cond_26

    .line 11
    .line 12
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v4, 0x22

    .line 15
    .line 16
    if-lt v3, v4, :cond_26

    .line 17
    .line 18
    iget-object v0, p0, Lax/a1/f0;->o0:Landroid/content/Context;

    .line 19
    .line 20
    if-nez v0, :cond_20

    .line 21
    .line 22
    invoke-static {v2, v1}, Lax/a1/Q;->a(Landroid/content/Context;I)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lax/a1/f0;->o0:Landroid/content/Context;

    .line 27
    .line 28
    goto :goto_20

    .line 29
    :catch_1c
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    move-object v2, p0

    .line 32
    goto :goto_49

    .line 33
    :cond_20
    :goto_20
    iget-object v0, p0, Lax/a1/f0;->o0:Landroid/content/Context;
    :try_end_22
    .catch Lax/a1/B$c; {:try_start_7 .. :try_end_22} :catch_1c

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    move-object v7, v0

    .line 37
    const/4 v5, 0x0

    .line 38
    goto :goto_29

    .line 39
    :cond_26
    const/4 v1, 0x0

    .line 40
    move v5, v0

    .line 41
    move-object v7, v1

    .line 42
    :goto_29
    :try_start_29
    invoke-virtual {p1}, Lax/a1/f0$h;->a()Lax/a1/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v4, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 47
    .line 48
    iget-object v6, p1, Lax/a1/f0$h;->a:Lax/P0/v;
    :try_end_31
    .catch Lax/a1/B$c; {:try_start_29 .. :try_end_31} :catch_46

    .line 49
    .line 50
    move-object v2, p0

    .line 51
    :try_start_32
    invoke-direct/range {v2 .. v7}, Lax/a1/f0;->U(Lax/a1/B$a;Lax/P0/c;ILax/P0/v;Landroid/content/Context;)Landroid/media/AudioTrack;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, v2, Lax/a1/f0;->r:Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 56
    .line 57
    if-eqz v0, :cond_45

    .line 58
    .line 59
    invoke-static {p1}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$a;->D(Z)V
    :try_end_41
    .catch Lax/a1/B$c; {:try_start_32 .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :catch_42
    move-exception v0

    .line 68
    :goto_43
    move-object p1, v0

    .line 69
    goto :goto_49

    .line 70
    :cond_45
    return-object p1

    .line 71
    :catch_46
    move-exception v0

    .line 72
    move-object v2, p0

    .line 73
    goto :goto_43

    .line 74
    :goto_49
    iget-object v0, v2, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 75
    .line 76
    if-eqz v0, :cond_50

    .line 77
    .line 78
    invoke-interface {v0, p1}, Lax/a1/B$d;->f(Ljava/lang/Exception;)V

    .line 79
    .line 80
    .line 81
    :cond_50
    throw p1
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

.method private W()Landroid/media/AudioTrack;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$c;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/a1/f0$h;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lax/a1/f0;->V(Lax/a1/f0$h;)Landroid/media/AudioTrack;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_c
    .catch Lax/a1/B$c; {:try_start_0 .. :try_end_c} :catch_d

    .line 13
    return-object v0

    .line 14
    :catch_d
    move-exception v0

    .line 15
    iget-object v1, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 16
    .line 17
    iget v2, v1, Lax/a1/f0$h;->h:I

    .line 18
    .line 19
    const v3, 0xf4240

    .line 20
    .line 21
    .line 22
    if-le v2, v3, :cond_26

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lax/a1/f0$h;->c(I)Lax/a1/f0$h;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :try_start_1b
    invoke-direct {p0, v1}, Lax/a1/f0;->V(Lax/a1/f0$h;)Landroid/media/AudioTrack;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v1, p0, Lax/a1/f0;->x:Lax/a1/f0$h;
    :try_end_21
    .catch Lax/a1/B$c; {:try_start_1b .. :try_end_21} :catch_22

    .line 33
    .line 34
    return-object v2

    .line 35
    :catch_22
    move-exception v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_26
    invoke-direct {p0}, Lax/a1/f0;->m0()V

    .line 40
    .line 41
    .line 42
    throw v0
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

.method private X(J)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    :goto_4
    move-object v1, p0

    .line 6
    goto/16 :goto_ea

    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/a1/f0;->o:Lax/a1/f0$m;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/a1/f0$m;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_10
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz v0, :cond_42

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v2, p1, v0

    .line 35
    .line 36
    if-eqz v2, :cond_27

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v0, 0x0

    .line 41
    :goto_28
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 42
    .line 43
    .line 44
    const-wide/high16 v0, -0x8000000000000000L

    .line 45
    .line 46
    cmp-long v2, p1, v0

    .line 47
    .line 48
    if-nez v2, :cond_35

    .line 49
    .line 50
    iget-wide p1, p0, Lax/a1/f0;->g0:J

    .line 51
    .line 52
    :goto_33
    move-wide v5, p1

    .line 53
    goto :goto_38

    .line 54
    :cond_35
    iput-wide p1, p0, Lax/a1/f0;->g0:J

    .line 55
    .line 56
    goto :goto_33

    .line 57
    :goto_38
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 58
    .line 59
    iget-object v3, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    invoke-direct/range {v1 .. v6}, Lax/a1/f0;->F0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    goto :goto_4b

    .line 67
    :cond_42
    move-object v1, p0

    .line 68
    iget-object p1, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 69
    .line 70
    iget-object p2, v1, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    invoke-static {p1, p2, v4}, Lax/a1/f0;->E0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    :goto_4b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    iput-wide v2, v1, Lax/a1/f0;->h0:J

    .line 81
    .line 82
    const-wide/16 v2, 0x0

    .line 83
    .line 84
    if-gez p1, :cond_9a

    .line 85
    .line 86
    invoke-static {p1}, Lax/a1/f0;->j0(I)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_71

    .line 91
    .line 92
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    cmp-long p2, v4, v2

    .line 97
    .line 98
    if-lez p2, :cond_65

    .line 99
    .line 100
    :goto_63
    const/4 v7, 0x1

    .line 101
    goto :goto_71

    .line 102
    :cond_65
    iget-object p2, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 103
    .line 104
    invoke-static {p2}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_71

    .line 109
    .line 110
    invoke-direct {p0}, Lax/a1/f0;->m0()V

    .line 111
    .line 112
    .line 113
    goto :goto_63

    .line 114
    :cond_71
    :goto_71
    new-instance p2, Lax/a1/B$f;

    .line 115
    .line 116
    iget-object v0, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 117
    .line 118
    iget-object v0, v0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 119
    .line 120
    invoke-direct {p2, p1, v0, v7}, Lax/a1/B$f;-><init>(ILax/P0/v;Z)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 124
    .line 125
    if-eqz p1, :cond_81

    .line 126
    .line 127
    invoke-interface {p1, p2}, Lax/a1/B$d;->f(Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    :cond_81
    iget-boolean p1, p2, Lax/a1/B$f;->c0:Z

    .line 131
    .line 132
    if-eqz p1, :cond_94

    .line 133
    .line 134
    iget-object p1, v1, Lax/a1/f0;->a:Landroid/content/Context;

    .line 135
    .line 136
    if-nez p1, :cond_8a

    .line 137
    .line 138
    goto :goto_94

    .line 139
    :cond_8a
    sget-object p1, Lax/a1/e;->c:Lax/a1/e;

    .line 140
    .line 141
    iput-object p1, v1, Lax/a1/f0;->A:Lax/a1/e;

    .line 142
    .line 143
    iget-object v0, v1, Lax/a1/f0;->B:Lax/a1/j;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lax/a1/j;->g(Lax/a1/e;)V

    .line 146
    .line 147
    .line 148
    throw p2

    .line 149
    :cond_94
    :goto_94
    iget-object p1, v1, Lax/a1/f0;->o:Lax/a1/f0$m;

    .line 150
    .line 151
    invoke-virtual {p1, p2}, Lax/a1/f0$m;->c(Ljava/lang/Exception;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_9a
    iget-object p2, v1, Lax/a1/f0;->o:Lax/a1/f0$m;

    .line 156
    .line 157
    invoke-virtual {p2}, Lax/a1/f0$m;->a()V

    .line 158
    .line 159
    .line 160
    iget-object p2, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 161
    .line 162
    invoke-static {p2}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_c0

    .line 167
    .line 168
    iget-wide v5, v1, Lax/a1/f0;->N:J

    .line 169
    .line 170
    cmp-long p2, v5, v2

    .line 171
    .line 172
    if-lez p2, :cond_af

    .line 173
    .line 174
    iput-boolean v7, v1, Lax/a1/f0;->j0:Z

    .line 175
    .line 176
    :cond_af
    iget-boolean p2, v1, Lax/a1/f0;->Z:Z

    .line 177
    .line 178
    if-eqz p2, :cond_c0

    .line 179
    .line 180
    iget-object p2, v1, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 181
    .line 182
    if-eqz p2, :cond_c0

    .line 183
    .line 184
    if-ge p1, v4, :cond_c0

    .line 185
    .line 186
    iget-boolean v0, v1, Lax/a1/f0;->j0:Z

    .line 187
    .line 188
    if-nez v0, :cond_c0

    .line 189
    .line 190
    invoke-interface {p2}, Lax/a1/B$d;->h()V

    .line 191
    .line 192
    .line 193
    :cond_c0
    iget-object p2, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 194
    .line 195
    iget p2, p2, Lax/a1/f0$h;->c:I

    .line 196
    .line 197
    if-nez p2, :cond_cc

    .line 198
    .line 199
    iget-wide v2, v1, Lax/a1/f0;->M:J

    .line 200
    .line 201
    int-to-long v5, p1

    .line 202
    add-long/2addr v2, v5

    .line 203
    iput-wide v2, v1, Lax/a1/f0;->M:J

    .line 204
    .line 205
    :cond_cc
    if-ne p1, v4, :cond_ea

    .line 206
    .line 207
    if-eqz p2, :cond_e7

    .line 208
    .line 209
    iget-object p1, v1, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    iget-object p2, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 212
    .line 213
    if-ne p1, p2, :cond_d7

    .line 214
    .line 215
    const/4 v7, 0x1

    .line 216
    :cond_d7
    invoke-static {v7}, Lax/S0/a;->g(Z)V

    .line 217
    .line 218
    .line 219
    iget-wide p1, v1, Lax/a1/f0;->N:J

    .line 220
    .line 221
    iget v0, v1, Lax/a1/f0;->O:I

    .line 222
    .line 223
    int-to-long v2, v0

    .line 224
    iget v0, v1, Lax/a1/f0;->U:I

    .line 225
    .line 226
    int-to-long v4, v0

    .line 227
    mul-long v2, v2, v4

    .line 228
    .line 229
    add-long/2addr p1, v2

    .line 230
    iput-wide p1, v1, Lax/a1/f0;->N:J

    .line 231
    .line 232
    :cond_e7
    const/4 p1, 0x0

    .line 233
    iput-object p1, v1, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    :cond_ea
    :goto_ea
    return-void
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

.method private Y()Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/Q0/n;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const-wide/high16 v3, -0x8000000000000000L

    .line 10
    .line 11
    if-nez v0, :cond_15

    .line 12
    .line 13
    invoke-direct {p0, v3, v4}, Lax/a1/f0;->X(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    return v2

    .line 21
    :cond_14
    return v1

    .line 22
    :cond_15
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/Q0/n;->h()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v3, v4}, Lax/a1/f0;->s0(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 31
    .line 32
    invoke-virtual {v0}, Lax/Q0/n;->e()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_30

    .line 37
    .line 38
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    if-eqz v0, :cond_2f

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_30

    .line 47
    .line 48
    :cond_2f
    return v2

    .line 49
    :cond_30
    return v1
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

.method private static Z(III)I
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x2

    .line 6
    if-eq p0, p1, :cond_9

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    :goto_a
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    return p0
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

.method private static a0(Landroid/content/Context;)I
    .registers 2

    .line 1
    invoke-static {p0}, Lax/a1/S;->a(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eqz p0, :cond_a

    .line 7
    .line 8
    if-eq p0, v0, :cond_a

    .line 9
    .line 10
    return p0

    .line 11
    :cond_a
    return v0
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

.method private static b0(ILjava/nio/ByteBuffer;)I
    .registers 4

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-eq p0, v0, :cond_63

    .line 4
    .line 5
    const/16 v0, 0x1e

    .line 6
    .line 7
    if-eq p0, v0, :cond_5e

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    const/16 v1, 0x400

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_68

    .line 13
    .line 14
    .line 15
    packed-switch p0, :pswitch_data_7c

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Unexpected audio encoding: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :pswitch_28
    invoke-static {p1}, Lax/q1/c;->f(Ljava/nio/ByteBuffer;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :pswitch_2d
    return v1

    .line 47
    :pswitch_2e
    const/16 p0, 0x200

    .line 48
    .line 49
    return p0

    .line 50
    :pswitch_31
    invoke-static {p1}, Lax/q1/b;->b(Ljava/nio/ByteBuffer;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ne p0, v0, :cond_39

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_39
    invoke-static {p1, p0}, Lax/q1/b;->i(Ljava/nio/ByteBuffer;I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    mul-int/lit8 p0, p0, 0x10

    .line 63
    .line 64
    return p0

    .line 65
    :pswitch_40
    const/16 p0, 0x800

    .line 66
    .line 67
    return p0

    .line 68
    :pswitch_43
    return v1

    .line 69
    :pswitch_44
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p1, p0}, Lax/S0/d0;->P(Ljava/nio/ByteBuffer;I)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p0}, Lax/q1/J;->m(I)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eq p0, v0, :cond_53

    .line 82
    .line 83
    return p0

    .line 84
    :cond_53
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :pswitch_59
    invoke-static {p1}, Lax/q1/b;->e(Ljava/nio/ByteBuffer;)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    :cond_5e
    :pswitch_5e
    invoke-static {p1}, Lax/q1/p;->f(Ljava/nio/ByteBuffer;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0

    .line 100
    :cond_63
    invoke-static {p1}, Lax/q1/L;->h(Ljava/nio/ByteBuffer;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    return p0

    .line 105
    :pswitch_data_68
    .packed-switch 0x5
        :pswitch_59
        :pswitch_59
        :pswitch_5e
        :pswitch_5e
        :pswitch_44
        :pswitch_43
        :pswitch_40
        :pswitch_40
    .end packed-switch

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
    :pswitch_data_7c
    .packed-switch 0xe
        :pswitch_31
        :pswitch_2e
        :pswitch_2d
        :pswitch_28
        :pswitch_59
    .end packed-switch
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

.method private static c0(Landroid/os/Looper;)Ljava/lang/String;
    .registers 1

    .line 1
    if-nez p0, :cond_5

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static d0(I)I
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/u;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, -0x7fffffff

    .line 6
    .line 7
    .line 8
    if-eq p0, v0, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private e0()J
    .registers 6

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    iget v1, v0, Lax/a1/f0$h;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_d

    .line 6
    .line 7
    iget-wide v1, p0, Lax/a1/f0;->K:J

    .line 8
    .line 9
    iget v0, v0, Lax/a1/f0$h;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_d
    iget-wide v0, p0, Lax/a1/f0;->L:J

    .line 15
    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private f0()J
    .registers 6

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    iget v1, v0, Lax/a1/f0$h;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_10

    .line 6
    .line 7
    iget-wide v1, p0, Lax/a1/f0;->M:J

    .line 8
    .line 9
    iget v0, v0, Lax/a1/f0$h;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    invoke-static {v1, v2, v3, v4}, Lax/S0/d0;->l(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_10
    iget-wide v0, p0, Lax/a1/f0;->N:J

    .line 18
    .line 19
    return-wide v0
    .line 20
    .line 21
.end method

.method private g0(J)V
    .registers 5

    .line 1
    iget-wide v0, p0, Lax/a1/f0;->m0:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lax/a1/f0;->m0:J

    .line 5
    .line 6
    iget-object p1, p0, Lax/a1/f0;->n0:Landroid/os/Handler;

    .line 7
    .line 8
    if-nez p1, :cond_14

    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lax/a1/f0;->n0:Landroid/os/Handler;

    .line 20
    .line 21
    :cond_14
    iget-object p1, p0, Lax/a1/f0;->n0:Landroid/os/Handler;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/a1/f0;->n0:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance p2, Lax/a1/d0;

    .line 30
    .line 31
    invoke-direct {p2, p0}, Lax/a1/d0;-><init>(Lax/a1/f0;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v0, 0x64

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
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

.method private static h0()Z
    .registers 2

    .line 1
    sget-object v0, Lax/a1/f0;->r0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget v1, Lax/a1/f0;->t0:I

    .line 5
    .line 6
    if-lez v1, :cond_9

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v1, 0x0

    .line 11
    :goto_a
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_c
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    .line 15
    throw v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private i0()Z
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a1/f0;->n:Lax/a1/f0$m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/a1/f0$m;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-direct {p0}, Lax/a1/f0;->W()Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 16
    .line 17
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2c

    .line 22
    .line 23
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lax/a1/f0;->t0(Landroid/media/AudioTrack;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 29
    .line 30
    iget-boolean v2, v0, Lax/a1/f0$h;->k:Z

    .line 31
    .line 32
    if-eqz v2, :cond_2c

    .line 33
    .line 34
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 35
    .line 36
    iget-object v0, v0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 37
    .line 38
    iget v3, v0, Lax/P0/v;->J:I

    .line 39
    .line 40
    iget v0, v0, Lax/P0/v;->K:I

    .line 41
    .line 42
    invoke-static {v2, v3, v0}, Lax/a1/V;->a(Landroid/media/AudioTrack;II)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x1f

    .line 48
    .line 49
    if-lt v0, v2, :cond_3b

    .line 50
    .line 51
    iget-object v2, p0, Lax/a1/f0;->u:Lax/Z0/I1;

    .line 52
    .line 53
    if-eqz v2, :cond_3b

    .line 54
    .line 55
    iget-object v3, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 56
    .line 57
    invoke-static {v3, v2}, Lax/a1/f0$c;->a(Landroid/media/AudioTrack;Lax/Z0/I1;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    iget-object v4, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 61
    .line 62
    iget-object v5, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 63
    .line 64
    iget-object v2, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 65
    .line 66
    iget v3, v2, Lax/a1/f0$h;->c:I

    .line 67
    .line 68
    const/4 v6, 0x2

    .line 69
    const/4 v11, 0x1

    .line 70
    if-ne v3, v6, :cond_49

    .line 71
    .line 72
    const/4 v6, 0x1

    .line 73
    goto :goto_4a

    .line 74
    :cond_49
    const/4 v6, 0x0

    .line 75
    :goto_4a
    iget v7, v2, Lax/a1/f0$h;->g:I

    .line 76
    .line 77
    iget v8, v2, Lax/a1/f0$h;->d:I

    .line 78
    .line 79
    iget v9, v2, Lax/a1/f0$h;->h:I

    .line 80
    .line 81
    iget-boolean v10, p0, Lax/a1/f0;->p0:Z

    .line 82
    .line 83
    invoke-virtual/range {v4 .. v10}, Lax/a1/F;->u(Landroid/media/AudioTrack;ZIIIZ)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, Lax/a1/f0;->z0()V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 90
    .line 91
    iget v2, v2, Lax/P0/g;->a:I

    .line 92
    .line 93
    if-eqz v2, :cond_6c

    .line 94
    .line 95
    iget-object v3, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 101
    .line 102
    iget-object v3, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 103
    .line 104
    iget v3, v3, Lax/P0/g;->b:F

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 107
    .line 108
    .line 109
    :cond_6c
    iget-object v2, p0, Lax/a1/f0;->e0:Lax/a1/k;

    .line 110
    .line 111
    if-eqz v2, :cond_84

    .line 112
    .line 113
    const/16 v3, 0x17

    .line 114
    .line 115
    if-lt v0, v3, :cond_84

    .line 116
    .line 117
    iget-object v3, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 118
    .line 119
    invoke-static {v3, v2}, Lax/a1/f0$b;->b(Landroid/media/AudioTrack;Lax/a1/k;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 123
    .line 124
    if-eqz v2, :cond_84

    .line 125
    .line 126
    iget-object v3, p0, Lax/a1/f0;->e0:Lax/a1/k;

    .line 127
    .line 128
    iget-object v3, v3, Lax/a1/k;->a:Landroid/media/AudioDeviceInfo;

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Lax/a1/j;->j(Landroid/media/AudioDeviceInfo;)V

    .line 131
    .line 132
    .line 133
    :cond_84
    const/16 v2, 0x18

    .line 134
    .line 135
    if-lt v0, v2, :cond_95

    .line 136
    .line 137
    iget-object v0, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 138
    .line 139
    if-eqz v0, :cond_95

    .line 140
    .line 141
    new-instance v2, Lax/a1/f0$l;

    .line 142
    .line 143
    iget-object v3, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 144
    .line 145
    invoke-direct {v2, v3, v0}, Lax/a1/f0$l;-><init>(Landroid/media/AudioTrack;Lax/a1/j;)V

    .line 146
    .line 147
    .line 148
    iput-object v2, p0, Lax/a1/f0;->C:Lax/a1/f0$l;

    .line 149
    .line 150
    :cond_95
    iput-boolean v11, p0, Lax/a1/f0;->Q:Z

    .line 151
    .line 152
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iget v2, p0, Lax/a1/f0;->b0:I

    .line 159
    .line 160
    if-eq v0, v2, :cond_a2

    .line 161
    .line 162
    const/4 v1, 0x1

    .line 163
    :cond_a2
    iput v0, p0, Lax/a1/f0;->b0:I

    .line 164
    .line 165
    iget-object v0, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 166
    .line 167
    if-eqz v0, :cond_bc

    .line 168
    .line 169
    iget-object v2, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 170
    .line 171
    invoke-virtual {v2}, Lax/a1/f0$h;->a()Lax/a1/B$a;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-interface {v0, v2}, Lax/a1/B$d;->g(Lax/a1/B$a;)V

    .line 176
    .line 177
    .line 178
    if-eqz v1, :cond_bc

    .line 179
    .line 180
    iput-boolean v11, p0, Lax/a1/f0;->c0:Z

    .line 181
    .line 182
    iget-object v0, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 183
    .line 184
    iget v1, p0, Lax/a1/f0;->b0:I

    .line 185
    .line 186
    invoke-interface {v0, v1}, Lax/a1/B$d;->c(I)V

    .line 187
    .line 188
    .line 189
    :cond_bc
    return v11
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

.method private static j0(I)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_9

    .line 6
    .line 7
    const/4 v0, -0x6

    .line 8
    if-eq p0, v0, :cond_d

    .line 9
    .line 10
    :cond_9
    const/16 v0, -0x20

    .line 11
    .line 12
    if-ne p0, v0, :cond_f

    .line 13
    .line 14
    :cond_d
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_f
    const/4 p0, 0x0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private k0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method private static l0(Landroid/media/AudioTrack;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_e

    .line 6
    .line 7
    invoke-static {p0}, Lax/a1/T;->a(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_e
    const/4 p0, 0x0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private m0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/a1/f0$h;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/a1/f0;->i0:Z

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
.end method

.method private n0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 2
    .line 3
    iget v0, v0, Lax/a1/f0$h;->c:I

    .line 4
    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_1f

    .line 8
    :cond_7
    const-wide/16 v0, 0x14

    .line 9
    .line 10
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 15
    .line 16
    iget v2, v2, Lax/a1/f0$h;->e:I

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lax/S0/d0;->F(JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int v1, v0

    .line 23
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    int-to-long v4, v1

    .line 28
    cmp-long v0, v2, v4

    .line 29
    .line 30
    if-ltz v0, :cond_20

    .line 31
    .line 32
    :goto_1f
    return-object p1

    .line 33
    :cond_20
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 34
    .line 35
    iget v4, v0, Lax/a1/f0$h;->g:I

    .line 36
    .line 37
    iget v0, v0, Lax/a1/f0$h;->d:I

    .line 38
    .line 39
    long-to-int v3, v2

    .line 40
    invoke-static {p1, v4, v0, v3, v1}, Lax/a1/E0;->a(Ljava/nio/ByteBuffer;IIII)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
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

.method private o0()V
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/a1/f0;->m0:J

    .line 2
    .line 3
    const-wide/32 v2, 0x493e0

    .line 4
    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-ltz v4, :cond_12

    .line 9
    .line 10
    iget-object v0, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 11
    .line 12
    invoke-interface {v0}, Lax/a1/B$d;->d()V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    iput-wide v0, p0, Lax/a1/f0;->m0:J

    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
.end method

.method private p0()V
    .registers 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 6
    .line 7
    if-eqz v1, :cond_f

    .line 8
    .line 9
    iget-object v1, p0, Lax/a1/f0;->k0:Landroid/os/Looper;

    .line 10
    .line 11
    if-ne v1, v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v1, 0x0

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    :goto_f
    const/4 v1, 0x1

    .line 17
    :goto_10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "DefaultAudioSink accessed on multiple threads: "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lax/a1/f0;->k0:Landroid/os/Looper;

    .line 28
    .line 29
    invoke-static {v3}, Lax/a1/f0;->c0(Landroid/os/Looper;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v3, " and "

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lax/a1/f0;->c0(Landroid/os/Looper;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v2}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 56
    .line 57
    if-nez v1, :cond_56

    .line 58
    .line 59
    iget-object v1, p0, Lax/a1/f0;->a:Landroid/content/Context;

    .line 60
    .line 61
    if-eqz v1, :cond_56

    .line 62
    .line 63
    iput-object v0, p0, Lax/a1/f0;->k0:Landroid/os/Looper;

    .line 64
    .line 65
    new-instance v0, Lax/a1/j;

    .line 66
    .line 67
    new-instance v2, Lax/a1/c0;

    .line 68
    .line 69
    invoke-direct {v2, p0}, Lax/a1/c0;-><init>(Lax/a1/f0;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 73
    .line 74
    iget-object v4, p0, Lax/a1/f0;->e0:Lax/a1/k;

    .line 75
    .line 76
    invoke-direct {v0, v1, v2, v3, v4}, Lax/a1/j;-><init>(Landroid/content/Context;Lax/a1/j$f;Lax/P0/c;Lax/a1/k;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 80
    .line 81
    invoke-virtual {v0}, Lax/a1/j;->h()Lax/a1/e;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 86
    .line 87
    :cond_56
    iget-object v0, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 88
    .line 89
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-void
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

.method private r0()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->X:Z

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lax/a1/f0;->X:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 9
    .line 10
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, Lax/a1/F;->h(J)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 18
    .line 19
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_1b

    .line 25
    .line 26
    iput-boolean v1, p0, Lax/a1/f0;->Y:Z

    .line 27
    .line 28
    :cond_1b
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 31
    .line 32
    .line 33
    iput v1, p0, Lax/a1/f0;->J:I

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

.method private s0(J)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$f;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/a1/f0;->X(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    goto :goto_4d

    .line 9
    :cond_8
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/Q0/n;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1b

    .line 16
    .line 17
    iget-object v0, p0, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-eqz v0, :cond_4d

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lax/a1/f0;->y0(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, p2}, Lax/a1/f0;->X(J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    :goto_1b
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/Q0/n;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4d

    .line 35
    .line 36
    :cond_23
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/Q0/n;->d()Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3a

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lax/a1/f0;->y0(Ljava/nio/ByteBuffer;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, p2}, Lax/a1/f0;->X(J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    if-eqz v0, :cond_23

    .line 57
    .line 58
    goto :goto_4d

    .line 59
    :cond_3a
    iget-object v0, p0, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    if-eqz v0, :cond_4d

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_45

    .line 68
    .line 69
    goto :goto_4d

    .line 70
    :cond_45
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 71
    .line 72
    iget-object v1, p0, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lax/Q0/n;->i(Ljava/nio/ByteBuffer;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1b

    .line 78
    :cond_4d
    :goto_4d
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

.method private t0(Landroid/media/AudioTrack;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0;->m:Lax/a1/f0$o;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/a1/f0$o;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/a1/f0$o;-><init>(Lax/a1/f0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/a1/f0;->m:Lax/a1/f0$o;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/a1/f0;->m:Lax/a1/f0$o;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lax/a1/f0$o;->a(Landroid/media/AudioTrack;)V

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

.method private static u0(Landroid/media/AudioTrack;Lax/a1/B$d;Lax/a1/B$a;)V
    .registers 7

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lax/a1/f0;->r0:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_c
    sget-object v2, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    if-nez v2, :cond_1b

    .line 16
    .line 17
    const-string v2, "ExoPlayer:AudioTrackReleaseThread"

    .line 18
    .line 19
    invoke-static {v2}, Lax/S0/d0;->c1(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :catchall_19
    move-exception p0

    .line 27
    goto :goto_31

    .line 28
    :cond_1b
    :goto_1b
    sget v2, Lax/a1/f0;->t0:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    sput v2, Lax/a1/f0;->t0:I

    .line 33
    .line 34
    sget-object v2, Lax/a1/f0;->s0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 35
    .line 36
    new-instance v3, Lax/a1/b0;

    .line 37
    .line 38
    invoke-direct {v3, p0, p1, v0, p2}, Lax/a1/b0;-><init>(Landroid/media/AudioTrack;Lax/a1/B$d;Landroid/os/Handler;Lax/a1/B$a;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    const-wide/16 p1, 0x14

    .line 44
    .line 45
    invoke-interface {v2, v3, p1, p2, p0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 46
    .line 47
    .line 48
    monitor-exit v1

    .line 49
    return-void

    .line 50
    :goto_31
    monitor-exit v1
    :try_end_32
    .catchall {:try_start_c .. :try_end_32} :catchall_19

    .line 51
    throw p0
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

.method private v0()V
    .registers 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lax/a1/f0;->K:J

    .line 4
    .line 5
    iput-wide v0, p0, Lax/a1/f0;->L:J

    .line 6
    .line 7
    iput-wide v0, p0, Lax/a1/f0;->M:J

    .line 8
    .line 9
    iput-wide v0, p0, Lax/a1/f0;->N:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, Lax/a1/f0;->j0:Z

    .line 13
    .line 14
    iput v2, p0, Lax/a1/f0;->O:I

    .line 15
    .line 16
    new-instance v3, Lax/a1/f0$k;

    .line 17
    .line 18
    iget-object v4, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    invoke-direct/range {v3 .. v9}, Lax/a1/f0$k;-><init>(Lax/P0/G;JJLax/a1/f0$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 29
    .line 30
    iput-wide v0, p0, Lax/a1/f0;->R:J

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lax/a1/f0;->E:Lax/a1/f0$k;

    .line 34
    .line 35
    iget-object v1, p0, Lax/a1/f0;->j:Ljava/util/ArrayDeque;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iput v2, p0, Lax/a1/f0;->U:I

    .line 43
    .line 44
    iput-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iput-boolean v2, p0, Lax/a1/f0;->X:Z

    .line 47
    .line 48
    iput-boolean v2, p0, Lax/a1/f0;->W:Z

    .line 49
    .line 50
    iput-boolean v2, p0, Lax/a1/f0;->Y:Z

    .line 51
    .line 52
    iput-object v0, p0, Lax/a1/f0;->I:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    iput v2, p0, Lax/a1/f0;->J:I

    .line 55
    .line 56
    iget-object v0, p0, Lax/a1/f0;->e:Lax/a1/H0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lax/a1/H0;->o()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lax/a1/f0;->A0()V

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private w0(Lax/P0/G;)V
    .registers 9

    .line 1
    new-instance v0, Lax/a1/f0$k;

    .line 2
    .line 3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v6}, Lax/a1/f0$k;-><init>(Lax/P0/G;JJLax/a1/f0$a;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1a

    .line 23
    .line 24
    iput-object v0, p0, Lax/a1/f0;->E:Lax/a1/f0$k;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iput-object v0, p0, Lax/a1/f0;->F:Lax/a1/f0$k;

    .line 28
    .line 29
    return-void
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

.method private x0()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_53

    .line 6
    .line 7
    invoke-static {}, Lax/a1/L;->a()Landroid/media/PlaybackParams;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lax/a1/X;->a(Landroid/media/PlaybackParams;)Landroid/media/PlaybackParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 16
    .line 17
    iget v1, v1, Lax/P0/G;->a:F

    .line 18
    .line 19
    invoke-static {v0, v1}, Lax/a1/Y;->a(Landroid/media/PlaybackParams;F)Landroid/media/PlaybackParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 24
    .line 25
    iget v1, v1, Lax/P0/G;->b:F

    .line 26
    .line 27
    invoke-static {v0, v1}, Lax/a1/Z;->a(Landroid/media/PlaybackParams;F)Landroid/media/PlaybackParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-static {v0, v1}, Lax/a1/a0;->a(Landroid/media/PlaybackParams;I)Landroid/media/PlaybackParams;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :try_start_23
    iget-object v1, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 37
    .line 38
    invoke-static {v1, v0}, Lax/a1/M;->a(Landroid/media/AudioTrack;Landroid/media/PlaybackParams;)V
    :try_end_28
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_28} :catch_29

    .line 39
    .line 40
    .line 41
    goto :goto_31

    .line 42
    :catch_29
    move-exception v0

    .line 43
    const-string v1, "DefaultAudioSink"

    .line 44
    .line 45
    const-string v2, "Failed to set playback params"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_31
    new-instance v0, Lax/P0/G;

    .line 51
    .line 52
    iget-object v1, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 53
    .line 54
    invoke-static {v1}, Lax/a1/N;->a(Landroid/media/AudioTrack;)Landroid/media/PlaybackParams;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Lax/a1/O;->a(Landroid/media/PlaybackParams;)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 63
    .line 64
    invoke-static {v2}, Lax/a1/N;->a(Landroid/media/AudioTrack;)Landroid/media/PlaybackParams;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Lax/a1/P;->a(Landroid/media/PlaybackParams;)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-direct {v0, v1, v2}, Lax/P0/G;-><init>(FF)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 76
    .line 77
    iget-object v1, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 78
    .line 79
    iget v0, v0, Lax/P0/G;->a:F

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lax/a1/F;->v(F)V

    .line 82
    .line 83
    .line 84
    :cond_53
    return-void
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

.method private y0(Ljava/nio/ByteBuffer;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-direct {p0, p1}, Lax/a1/f0;->n0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lax/a1/f0;->V:Ljava/nio/ByteBuffer;

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
.end method

.method private z0()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 8
    .line 9
    iget v1, p0, Lax/a1/f0;->S:F

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public A(Lax/P0/c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/c;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_f

    .line 10
    :cond_9
    iput-object p1, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 11
    .line 12
    iget-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 13
    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    :goto_f
    return-void

    .line 17
    :cond_10
    iget-object v0, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lax/a1/j;->i(Lax/P0/c;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    invoke-virtual {p0}, Lax/a1/f0;->flush()V

    .line 25
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

.method public B(Lax/S0/h;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/a1/F;->w(Lax/S0/h;)V

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

.method public C(Lax/P0/g;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/g;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget v0, p1, Lax/P0/g;->a:I

    .line 11
    .line 12
    iget v1, p1, Lax/P0/g;->b:F

    .line 13
    .line 14
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 15
    .line 16
    if-eqz v2, :cond_21

    .line 17
    .line 18
    iget-object v3, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 19
    .line 20
    iget v3, v3, Lax/P0/g;->a:I

    .line 21
    .line 22
    if-eq v3, v0, :cond_1a

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    .line 25
    .line 26
    .line 27
    :cond_1a
    if-eqz v0, :cond_21

    .line 28
    .line 29
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    .line 32
    .line 33
    .line 34
    :cond_21
    iput-object p1, p0, Lax/a1/f0;->d0:Lax/P0/g;

    .line 35
    .line 36
    return-void
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

.method public D(Ljava/nio/ByteBuffer;JI)Z
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$c;,
            Lax/a1/B$f;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_13

    .line 14
    .line 15
    if-ne v0, v5, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v5, 0x0

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    :goto_13
    const/4 v5, 0x1

    .line 21
    :goto_14
    invoke-static {v5}, Lax/S0/a;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v5, :cond_76

    .line 28
    .line 29
    invoke-direct {v1}, Lax/a1/f0;->Y()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_23

    .line 34
    .line 35
    return v7

    .line 36
    :cond_23
    iget-object v5, v1, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 37
    .line 38
    iget-object v9, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 39
    .line 40
    invoke-virtual {v5, v9}, Lax/a1/f0$h;->b(Lax/a1/f0$h;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_3b

    .line 45
    .line 46
    invoke-direct {v1}, Lax/a1/f0;->r0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lax/a1/f0;->k()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_37

    .line 54
    .line 55
    return v7

    .line 56
    :cond_37
    invoke-virtual {v1}, Lax/a1/f0;->flush()V

    .line 57
    .line 58
    .line 59
    goto :goto_73

    .line 60
    :cond_3b
    iget-object v5, v1, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 61
    .line 62
    iput-object v5, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 63
    .line 64
    iput-object v8, v1, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 65
    .line 66
    iget-object v5, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 67
    .line 68
    if-eqz v5, :cond_73

    .line 69
    .line 70
    invoke-static {v5}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_73

    .line 75
    .line 76
    iget-object v5, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 77
    .line 78
    iget-boolean v5, v5, Lax/a1/f0$h;->k:Z

    .line 79
    .line 80
    if-eqz v5, :cond_73

    .line 81
    .line 82
    iget-object v5, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v9, 0x3

    .line 89
    if-ne v5, v9, :cond_64

    .line 90
    .line 91
    iget-object v5, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 92
    .line 93
    invoke-static {v5}, Lax/a1/U;->a(Landroid/media/AudioTrack;)V

    .line 94
    .line 95
    .line 96
    iget-object v5, v1, Lax/a1/f0;->i:Lax/a1/F;

    .line 97
    .line 98
    invoke-virtual {v5}, Lax/a1/F;->a()V

    .line 99
    .line 100
    .line 101
    :cond_64
    iget-object v5, v1, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 102
    .line 103
    iget-object v9, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 104
    .line 105
    iget-object v9, v9, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 106
    .line 107
    iget v10, v9, Lax/P0/v;->J:I

    .line 108
    .line 109
    iget v9, v9, Lax/P0/v;->K:I

    .line 110
    .line 111
    invoke-static {v5, v10, v9}, Lax/a1/V;->a(Landroid/media/AudioTrack;II)V

    .line 112
    .line 113
    .line 114
    iput-boolean v6, v1, Lax/a1/f0;->j0:Z

    .line 115
    .line 116
    :cond_73
    :goto_73
    invoke-direct {v1, v2, v3}, Lax/a1/f0;->R(J)V

    .line 117
    .line 118
    .line 119
    :cond_76
    invoke-direct {v1}, Lax/a1/f0;->k0()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_8f

    .line 124
    .line 125
    :try_start_7c
    invoke-direct {v1}, Lax/a1/f0;->i0()Z

    .line 126
    .line 127
    .line 128
    move-result v5
    :try_end_80
    .catch Lax/a1/B$c; {:try_start_7c .. :try_end_80} :catch_83

    .line 129
    if-nez v5, :cond_8f

    .line 130
    .line 131
    return v7

    .line 132
    :catch_83
    move-exception v0

    .line 133
    iget-boolean v2, v0, Lax/a1/B$c;->c0:Z

    .line 134
    .line 135
    if-nez v2, :cond_8e

    .line 136
    .line 137
    iget-object v2, v1, Lax/a1/f0;->n:Lax/a1/f0$m;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Lax/a1/f0$m;->c(Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    return v7

    .line 143
    :cond_8e
    throw v0

    .line 144
    :cond_8f
    iget-object v5, v1, Lax/a1/f0;->n:Lax/a1/f0$m;

    .line 145
    .line 146
    invoke-virtual {v5}, Lax/a1/f0$m;->a()V

    .line 147
    .line 148
    .line 149
    iget-boolean v5, v1, Lax/a1/f0;->Q:Z

    .line 150
    .line 151
    const-wide/16 v9, 0x0

    .line 152
    .line 153
    if-eqz v5, :cond_b7

    .line 154
    .line 155
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    iput-wide v11, v1, Lax/a1/f0;->R:J

    .line 160
    .line 161
    iput-boolean v7, v1, Lax/a1/f0;->P:Z

    .line 162
    .line 163
    iput-boolean v7, v1, Lax/a1/f0;->Q:Z

    .line 164
    .line 165
    invoke-direct {v1}, Lax/a1/f0;->D0()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_ad

    .line 170
    .line 171
    invoke-direct {v1}, Lax/a1/f0;->x0()V

    .line 172
    .line 173
    .line 174
    :cond_ad
    invoke-direct {v1, v2, v3}, Lax/a1/f0;->R(J)V

    .line 175
    .line 176
    .line 177
    iget-boolean v5, v1, Lax/a1/f0;->Z:Z

    .line 178
    .line 179
    if-eqz v5, :cond_b7

    .line 180
    .line 181
    invoke-virtual {v1}, Lax/a1/f0;->m()V

    .line 182
    .line 183
    .line 184
    :cond_b7
    iget-object v5, v1, Lax/a1/f0;->i:Lax/a1/F;

    .line 185
    .line 186
    invoke-direct {v1}, Lax/a1/f0;->f0()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    invoke-virtual {v5, v11, v12}, Lax/a1/F;->m(J)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_c4

    .line 195
    .line 196
    return v7

    .line 197
    :cond_c4
    iget-object v5, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    if-nez v5, :cond_177

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 206
    .line 207
    if-ne v5, v11, :cond_d2

    .line 208
    .line 209
    const/4 v5, 0x1

    .line 210
    goto :goto_d3

    .line 211
    :cond_d2
    const/4 v5, 0x0

    .line 212
    :goto_d3
    invoke-static {v5}, Lax/S0/a;->a(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_dd

    .line 220
    .line 221
    return v6

    .line 222
    :cond_dd
    iget-object v5, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 223
    .line 224
    iget v11, v5, Lax/a1/f0$h;->c:I

    .line 225
    .line 226
    if-eqz v11, :cond_f2

    .line 227
    .line 228
    iget v11, v1, Lax/a1/f0;->O:I

    .line 229
    .line 230
    if-nez v11, :cond_f2

    .line 231
    .line 232
    iget v5, v5, Lax/a1/f0$h;->g:I

    .line 233
    .line 234
    invoke-static {v5, v0}, Lax/a1/f0;->b0(ILjava/nio/ByteBuffer;)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iput v5, v1, Lax/a1/f0;->O:I

    .line 239
    .line 240
    if-nez v5, :cond_f2

    .line 241
    .line 242
    return v6

    .line 243
    :cond_f2
    iget-object v5, v1, Lax/a1/f0;->E:Lax/a1/f0$k;

    .line 244
    .line 245
    if-eqz v5, :cond_102

    .line 246
    .line 247
    invoke-direct {v1}, Lax/a1/f0;->Y()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_fd

    .line 252
    .line 253
    return v7

    .line 254
    :cond_fd
    invoke-direct {v1, v2, v3}, Lax/a1/f0;->R(J)V

    .line 255
    .line 256
    .line 257
    iput-object v8, v1, Lax/a1/f0;->E:Lax/a1/f0$k;

    .line 258
    .line 259
    :cond_102
    iget-wide v11, v1, Lax/a1/f0;->R:J

    .line 260
    .line 261
    iget-object v5, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 262
    .line 263
    invoke-direct {v1}, Lax/a1/f0;->e0()J

    .line 264
    .line 265
    .line 266
    move-result-wide v13

    .line 267
    iget-object v15, v1, Lax/a1/f0;->e:Lax/a1/H0;

    .line 268
    .line 269
    invoke-virtual {v15}, Lax/a1/H0;->n()J

    .line 270
    .line 271
    .line 272
    move-result-wide v15

    .line 273
    sub-long/2addr v13, v15

    .line 274
    invoke-virtual {v5, v13, v14}, Lax/a1/f0$h;->e(J)J

    .line 275
    .line 276
    .line 277
    move-result-wide v13

    .line 278
    add-long/2addr v11, v13

    .line 279
    iget-boolean v5, v1, Lax/a1/f0;->P:Z

    .line 280
    .line 281
    if-nez v5, :cond_135

    .line 282
    .line 283
    sub-long v13, v11, v2

    .line 284
    .line 285
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v13

    .line 289
    const-wide/32 v15, 0x30d40

    .line 290
    .line 291
    .line 292
    cmp-long v5, v13, v15

    .line 293
    .line 294
    if-lez v5, :cond_135

    .line 295
    .line 296
    iget-object v5, v1, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 297
    .line 298
    if-eqz v5, :cond_133

    .line 299
    .line 300
    new-instance v13, Lax/a1/B$e;

    .line 301
    .line 302
    invoke-direct {v13, v2, v3, v11, v12}, Lax/a1/B$e;-><init>(JJ)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v5, v13}, Lax/a1/B$d;->f(Ljava/lang/Exception;)V

    .line 306
    .line 307
    .line 308
    :cond_133
    iput-boolean v6, v1, Lax/a1/f0;->P:Z

    .line 309
    .line 310
    :cond_135
    iget-boolean v5, v1, Lax/a1/f0;->P:Z

    .line 311
    .line 312
    if-eqz v5, :cond_157

    .line 313
    .line 314
    invoke-direct {v1}, Lax/a1/f0;->Y()Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-nez v5, :cond_140

    .line 319
    .line 320
    return v7

    .line 321
    :cond_140
    sub-long v11, v2, v11

    .line 322
    .line 323
    iget-wide v13, v1, Lax/a1/f0;->R:J

    .line 324
    .line 325
    add-long/2addr v13, v11

    .line 326
    iput-wide v13, v1, Lax/a1/f0;->R:J

    .line 327
    .line 328
    iput-boolean v7, v1, Lax/a1/f0;->P:Z

    .line 329
    .line 330
    invoke-direct {v1, v2, v3}, Lax/a1/f0;->R(J)V

    .line 331
    .line 332
    .line 333
    iget-object v5, v1, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 334
    .line 335
    if-eqz v5, :cond_157

    .line 336
    .line 337
    cmp-long v13, v11, v9

    .line 338
    .line 339
    if-eqz v13, :cond_157

    .line 340
    .line 341
    invoke-interface {v5}, Lax/a1/B$d;->k()V

    .line 342
    .line 343
    .line 344
    :cond_157
    iget-object v5, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 345
    .line 346
    iget v5, v5, Lax/a1/f0$h;->c:I

    .line 347
    .line 348
    if-nez v5, :cond_168

    .line 349
    .line 350
    iget-wide v9, v1, Lax/a1/f0;->K:J

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    int-to-long v11, v5

    .line 357
    add-long/2addr v9, v11

    .line 358
    iput-wide v9, v1, Lax/a1/f0;->K:J

    .line 359
    .line 360
    goto :goto_173

    .line 361
    :cond_168
    iget-wide v9, v1, Lax/a1/f0;->L:J

    .line 362
    .line 363
    iget v5, v1, Lax/a1/f0;->O:I

    .line 364
    .line 365
    int-to-long v11, v5

    .line 366
    int-to-long v13, v4

    .line 367
    mul-long v11, v11, v13

    .line 368
    .line 369
    add-long/2addr v9, v11

    .line 370
    iput-wide v9, v1, Lax/a1/f0;->L:J

    .line 371
    .line 372
    :goto_173
    iput-object v0, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    iput v4, v1, Lax/a1/f0;->U:I

    .line 375
    .line 376
    :cond_177
    invoke-direct {v1, v2, v3}, Lax/a1/f0;->s0(J)V

    .line 377
    .line 378
    .line 379
    iget-object v0, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_187

    .line 386
    .line 387
    iput-object v8, v1, Lax/a1/f0;->T:Ljava/nio/ByteBuffer;

    .line 388
    .line 389
    iput v7, v1, Lax/a1/f0;->U:I

    .line 390
    .line 391
    return v6

    .line 392
    :cond_187
    iget-object v0, v1, Lax/a1/f0;->i:Lax/a1/F;

    .line 393
    .line 394
    invoke-direct {v1}, Lax/a1/f0;->f0()J

    .line 395
    .line 396
    .line 397
    move-result-wide v2

    .line 398
    invoke-virtual {v0, v2, v3}, Lax/a1/F;->l(J)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_19e

    .line 403
    .line 404
    const-string v0, "DefaultAudioSink"

    .line 405
    .line 406
    const-string v2, "Resetting stalled audio track"

    .line 407
    .line 408
    invoke-static {v0, v2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Lax/a1/f0;->flush()V

    .line 412
    .line 413
    .line 414
    return v6

    .line 415
    :cond_19e
    return v7
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

.method public E(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/a1/f0;->H:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lax/a1/f0;->D0()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    sget-object p1, Lax/P0/G;->d:Lax/P0/G;

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    iget-object p1, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 13
    .line 14
    :goto_d
    invoke-direct {p0, p1}, Lax/a1/f0;->w0(Lax/P0/G;)V

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

.method public a()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/a1/f0;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/a1/f0;->h:Lax/r7/z;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/r7/z;->n()Lax/r7/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_19

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lax/Q0/o;

    .line 21
    .line 22
    invoke-interface {v1}, Lax/Q0/o;->a()V

    .line 23
    .line 24
    .line 25
    goto :goto_9

    .line 26
    :cond_19
    iget-object v0, p0, Lax/a1/f0;->f:Lax/Q0/t;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/Q0/q;->a()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/a1/f0;->g:Lax/a1/G0;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/Q0/q;->a()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/a1/f0;->y:Lax/Q0/n;

    .line 37
    .line 38
    if-eqz v0, :cond_2a

    .line 39
    .line 40
    invoke-virtual {v0}, Lax/Q0/n;->j()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lax/a1/f0;->Z:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lax/a1/f0;->i0:Z

    .line 47
    .line 48
    return-void
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

.method public b(Lax/P0/v;)Z
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/a1/f0;->n(Lax/P0/v;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_8
    const/4 p1, 0x0

    .line 10
    return p1
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

.method public c()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_13

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/a1/f0;->W:Z

    .line 8
    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/a1/f0;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/a1/j;->k()V

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

.method public e(Lax/P0/G;)V
    .registers 7

    .line 1
    new-instance v0, Lax/P0/G;

    .line 2
    .line 3
    iget v1, p1, Lax/P0/G;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lax/S0/d0;->o(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v4, p1, Lax/P0/G;->b:F

    .line 15
    .line 16
    invoke-static {v4, v2, v3}, Lax/S0/d0;->o(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2}, Lax/P0/G;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/a1/f0;->G:Lax/P0/G;

    .line 24
    .line 25
    invoke-direct {p0}, Lax/a1/f0;->D0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_22

    .line 30
    .line 31
    invoke-direct {p0}, Lax/a1/f0;->x0()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    invoke-direct {p0, p1}, Lax/a1/f0;->w0(Lax/P0/G;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public f()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/a1/f0;->Z:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1f

    .line 9
    .line 10
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/a1/F;->r()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lax/a1/f0;->X:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1a

    .line 18
    .line 19
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1f

    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public flush()V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_57

    .line 7
    .line 8
    invoke-direct {p0}, Lax/a1/f0;->v0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/a1/F;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_17

    .line 18
    .line 19
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 22
    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 25
    .line 26
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2c

    .line 31
    .line 32
    iget-object v0, p0, Lax/a1/f0;->m:Lax/a1/f0$o;

    .line 33
    .line 34
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lax/a1/f0$o;

    .line 39
    .line 40
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lax/a1/f0$o;->b(Landroid/media/AudioTrack;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 46
    .line 47
    invoke-virtual {v0}, Lax/a1/f0$h;->a()Lax/a1/B$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v2, p0, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 52
    .line 53
    if-eqz v2, :cond_3a

    .line 54
    .line 55
    iput-object v2, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 56
    .line 57
    iput-object v1, p0, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 58
    .line 59
    :cond_3a
    iget-object v2, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 60
    .line 61
    invoke-virtual {v2}, Lax/a1/F;->s()V

    .line 62
    .line 63
    .line 64
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v3, 0x18

    .line 67
    .line 68
    if-lt v2, v3, :cond_4e

    .line 69
    .line 70
    iget-object v2, p0, Lax/a1/f0;->C:Lax/a1/f0$l;

    .line 71
    .line 72
    if-eqz v2, :cond_4e

    .line 73
    .line 74
    invoke-virtual {v2}, Lax/a1/f0$l;->c()V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lax/a1/f0;->C:Lax/a1/f0$l;

    .line 78
    .line 79
    :cond_4e
    iget-object v2, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 80
    .line 81
    iget-object v3, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 82
    .line 83
    invoke-static {v2, v3, v0}, Lax/a1/f0;->u0(Landroid/media/AudioTrack;Lax/a1/B$d;Lax/a1/B$a;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 87
    .line 88
    :cond_57
    iget-object v0, p0, Lax/a1/f0;->o:Lax/a1/f0$m;

    .line 89
    .line 90
    invoke-virtual {v0}, Lax/a1/f0$m;->a()V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lax/a1/f0;->n:Lax/a1/f0$m;

    .line 94
    .line 95
    invoke-virtual {v0}, Lax/a1/f0$m;->a()V

    .line 96
    .line 97
    .line 98
    const-wide/16 v2, 0x0

    .line 99
    .line 100
    iput-wide v2, p0, Lax/a1/f0;->l0:J

    .line 101
    .line 102
    iput-wide v2, p0, Lax/a1/f0;->m0:J

    .line 103
    .line 104
    iget-object v0, p0, Lax/a1/f0;->n0:Landroid/os/Handler;

    .line 105
    .line 106
    if-eqz v0, :cond_74

    .line 107
    .line 108
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroid/os/Handler;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_74
    return-void
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

.method public g(Landroid/media/AudioDeviceInfo;)V
    .registers 3

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_9

    .line 5
    :cond_4
    new-instance v0, Lax/a1/k;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lax/a1/k;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 8
    .line 9
    .line 10
    :goto_9
    iput-object v0, p0, Lax/a1/f0;->e0:Lax/a1/k;

    .line 11
    .line 12
    iget-object v0, p0, Lax/a1/f0;->B:Lax/a1/j;

    .line 13
    .line 14
    if-eqz v0, :cond_12

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/a1/j;->j(Landroid/media/AudioDeviceInfo;)V

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object p1, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    if-eqz p1, :cond_1b

    .line 22
    .line 23
    iget-object v0, p0, Lax/a1/f0;->e0:Lax/a1/k;

    .line 24
    .line 25
    invoke-static {p1, v0}, Lax/a1/f0$b;->b(Landroid/media/AudioTrack;Lax/a1/k;)V

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

.method public h()Lax/P0/G;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0;->G:Lax/P0/G;

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

.method public i()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$f;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->W:Z

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    invoke-direct {p0}, Lax/a1/f0;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    invoke-direct {p0}, Lax/a1/f0;->r0()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lax/a1/f0;->W:Z

    .line 22
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

.method public j(Lax/P0/v;I[I)V
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/a1/B$b;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-direct {v1}, Lax/a1/f0;->p0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, Lax/P0/v;->o:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "audio/raw"

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v4, -0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v0, :cond_9a

    .line 19
    .line 20
    iget v0, v3, Lax/P0/v;->I:I

    .line 21
    .line 22
    invoke-static {v0}, Lax/S0/d0;->L0(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 27
    .line 28
    .line 29
    iget v0, v3, Lax/P0/v;->I:I

    .line 30
    .line 31
    iget v6, v3, Lax/P0/v;->G:I

    .line 32
    .line 33
    invoke-static {v0, v6}, Lax/S0/d0;->m0(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    new-instance v6, Lax/r7/z$a;

    .line 38
    .line 39
    invoke-direct {v6}, Lax/r7/z$a;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v7, v1, Lax/a1/f0;->h:Lax/r7/z;

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Lax/r7/z$a;->j(Ljava/lang/Iterable;)Lax/r7/z$a;

    .line 45
    .line 46
    .line 47
    iget v7, v3, Lax/P0/v;->I:I

    .line 48
    .line 49
    invoke-direct {v1, v7}, Lax/a1/f0;->C0(I)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_3c

    .line 54
    .line 55
    iget-object v7, v1, Lax/a1/f0;->g:Lax/a1/G0;

    .line 56
    .line 57
    invoke-virtual {v6, v7}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 58
    .line 59
    .line 60
    goto :goto_4a

    .line 61
    :cond_3c
    iget-object v7, v1, Lax/a1/f0;->f:Lax/Q0/t;

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 64
    .line 65
    .line 66
    iget-object v7, v1, Lax/a1/f0;->b:Lax/Q0/p;

    .line 67
    .line 68
    invoke-interface {v7}, Lax/Q0/p;->e()[Lax/Q0/o;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v6, v7}, Lax/r7/z$a;->i([Ljava/lang/Object;)Lax/r7/z$a;

    .line 73
    .line 74
    .line 75
    :goto_4a
    new-instance v7, Lax/Q0/n;

    .line 76
    .line 77
    invoke-virtual {v6}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-direct {v7, v6}, Lax/Q0/n;-><init>(Lax/r7/z;)V

    .line 82
    .line 83
    .line 84
    iget-object v6, v1, Lax/a1/f0;->y:Lax/Q0/n;

    .line 85
    .line 86
    invoke-virtual {v7, v6}, Lax/Q0/n;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_5d

    .line 91
    .line 92
    iget-object v7, v1, Lax/a1/f0;->y:Lax/Q0/n;

    .line 93
    .line 94
    :cond_5d
    iget-object v6, v1, Lax/a1/f0;->e:Lax/a1/H0;

    .line 95
    .line 96
    iget v8, v3, Lax/P0/v;->J:I

    .line 97
    .line 98
    iget v9, v3, Lax/P0/v;->K:I

    .line 99
    .line 100
    invoke-virtual {v6, v8, v9}, Lax/a1/H0;->p(II)V

    .line 101
    .line 102
    .line 103
    iget-object v6, v1, Lax/a1/f0;->d:Lax/a1/G;

    .line 104
    .line 105
    move-object/from16 v8, p3

    .line 106
    .line 107
    invoke-virtual {v6, v8}, Lax/a1/G;->n([I)V

    .line 108
    .line 109
    .line 110
    new-instance v6, Lax/Q0/o$a;

    .line 111
    .line 112
    invoke-direct {v6, v3}, Lax/Q0/o$a;-><init>(Lax/P0/v;)V

    .line 113
    .line 114
    .line 115
    :try_start_72
    invoke-virtual {v7, v6}, Lax/Q0/n;->a(Lax/Q0/o$a;)Lax/Q0/o$a;

    .line 116
    .line 117
    .line 118
    move-result-object v6
    :try_end_76
    .catch Lax/Q0/o$b; {:try_start_72 .. :try_end_76} :catch_93

    .line 119
    iget v8, v6, Lax/Q0/o$a;->c:I

    .line 120
    .line 121
    iget v9, v6, Lax/Q0/o$a;->a:I

    .line 122
    .line 123
    iget-object v10, v1, Lax/a1/f0;->s:Lax/a1/f0$f;

    .line 124
    .line 125
    iget v11, v6, Lax/Q0/o$a;->b:I

    .line 126
    .line 127
    invoke-interface {v10, v11}, Lax/a1/f0$f;->a(I)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    iget v6, v6, Lax/Q0/o$a;->b:I

    .line 132
    .line 133
    invoke-static {v8, v6}, Lax/S0/d0;->m0(II)I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    iget-boolean v11, v1, Lax/a1/f0;->k:Z

    .line 138
    .line 139
    move v14, v8

    .line 140
    move v8, v10

    .line 141
    move v10, v11

    .line 142
    const/4 v15, 0x0

    .line 143
    move-object v11, v7

    .line 144
    move v7, v6

    .line 145
    const/4 v6, 0x0

    .line 146
    goto/16 :goto_fe

    .line 147
    .line 148
    :catch_93
    move-exception v0

    .line 149
    new-instance v2, Lax/a1/B$b;

    .line 150
    .line 151
    invoke-direct {v2, v0, v3}, Lax/a1/B$b;-><init>(Ljava/lang/Throwable;Lax/P0/v;)V

    .line 152
    .line 153
    .line 154
    throw v2

    .line 155
    :cond_9a
    new-instance v7, Lax/Q0/n;

    .line 156
    .line 157
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {v7, v0}, Lax/Q0/n;-><init>(Lax/r7/z;)V

    .line 162
    .line 163
    .line 164
    iget v9, v3, Lax/P0/v;->H:I

    .line 165
    .line 166
    iget v0, v1, Lax/a1/f0;->l:I

    .line 167
    .line 168
    if-eqz v0, :cond_ae

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p1}, Lax/a1/f0;->z(Lax/P0/v;)Lax/a1/l;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    goto :goto_b0

    .line 175
    :cond_ae
    sget-object v0, Lax/a1/l;->d:Lax/a1/l;

    .line 176
    .line 177
    :goto_b0
    iget v6, v1, Lax/a1/f0;->l:I

    .line 178
    .line 179
    if-eqz v6, :cond_d9

    .line 180
    .line 181
    iget-boolean v6, v0, Lax/a1/l;->a:Z

    .line 182
    .line 183
    if-eqz v6, :cond_d9

    .line 184
    .line 185
    iget-object v6, v3, Lax/P0/v;->o:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v6}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Ljava/lang/String;

    .line 192
    .line 193
    iget-object v8, v3, Lax/P0/v;->k:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v6, v8}, Lax/P0/D;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    iget-object v6, v1, Lax/a1/f0;->s:Lax/a1/f0$f;

    .line 200
    .line 201
    iget v10, v3, Lax/P0/v;->G:I

    .line 202
    .line 203
    invoke-interface {v6, v10}, Lax/a1/f0$f;->a(I)I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    iget-boolean v0, v0, Lax/a1/l;->b:Z

    .line 208
    .line 209
    move v6, v0

    .line 210
    move-object v11, v7

    .line 211
    move v14, v8

    .line 212
    move v8, v10

    .line 213
    const/4 v0, -0x1

    .line 214
    const/4 v7, -0x1

    .line 215
    const/4 v10, 0x1

    .line 216
    const/4 v15, 0x1

    .line 217
    goto :goto_fe

    .line 218
    :cond_d9
    iget-object v0, v1, Lax/a1/f0;->A:Lax/a1/e;

    .line 219
    .line 220
    iget-object v6, v1, Lax/a1/f0;->D:Lax/P0/c;

    .line 221
    .line 222
    invoke-virtual {v0, v3, v6}, Lax/a1/e;->h(Lax/P0/v;Lax/P0/c;)Landroid/util/Pair;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_195

    .line 227
    .line 228
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    iget-boolean v11, v1, Lax/a1/f0;->k:Z

    .line 245
    .line 246
    const/4 v0, 0x2

    .line 247
    move v14, v8

    .line 248
    move v8, v10

    .line 249
    move v10, v11

    .line 250
    const/4 v0, -0x1

    .line 251
    const/4 v6, 0x0

    .line 252
    const/4 v15, 0x2

    .line 253
    move-object v11, v7

    .line 254
    const/4 v7, -0x1

    .line 255
    :goto_fe
    const-string v12, ") for: "

    .line 256
    .line 257
    if-eqz v14, :cond_178

    .line 258
    .line 259
    if-eqz v8, :cond_15b

    .line 260
    .line 261
    iget v12, v3, Lax/P0/v;->j:I

    .line 262
    .line 263
    const-string v13, "audio/vnd.dts.hd;profile=lbr"

    .line 264
    .line 265
    iget-object v2, v3, Lax/P0/v;->o:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_119

    .line 272
    .line 273
    if-ne v12, v4, :cond_119

    .line 274
    .line 275
    const v12, 0xbb800

    .line 276
    .line 277
    .line 278
    const v18, 0xbb800

    .line 279
    .line 280
    .line 281
    goto :goto_11b

    .line 282
    :cond_119
    move/from16 v18, v12

    .line 283
    .line 284
    :goto_11b
    if-eqz p2, :cond_122

    .line 285
    .line 286
    move/from16 v2, p2

    .line 287
    .line 288
    move/from16 v17, v9

    .line 289
    .line 290
    goto :goto_13d

    .line 291
    :cond_122
    iget-object v12, v1, Lax/a1/f0;->p:Lax/a1/f0$e;

    .line 292
    .line 293
    invoke-static {v9, v8, v14}, Lax/a1/f0;->Z(III)I

    .line 294
    .line 295
    .line 296
    move-result v13

    .line 297
    if-eq v7, v4, :cond_12d

    .line 298
    .line 299
    move/from16 v16, v7

    .line 300
    .line 301
    goto :goto_12f

    .line 302
    :cond_12d
    const/16 v16, 0x1

    .line 303
    .line 304
    :goto_12f
    if-eqz v10, :cond_136

    .line 305
    .line 306
    const-wide/high16 v19, 0x4020000000000000L    # 8.0

    .line 307
    .line 308
    :goto_133
    move/from16 v17, v9

    .line 309
    .line 310
    goto :goto_139

    .line 311
    :cond_136
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 312
    .line 313
    goto :goto_133

    .line 314
    :goto_139
    invoke-interface/range {v12 .. v20}, Lax/a1/f0$e;->a(IIIIIID)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    :goto_13d
    iput-boolean v5, v1, Lax/a1/f0;->i0:Z

    .line 319
    .line 320
    move v12, v10

    .line 321
    move v10, v2

    .line 322
    new-instance v2, Lax/a1/f0$h;

    .line 323
    .line 324
    move v9, v14

    .line 325
    iget-boolean v14, v1, Lax/a1/f0;->f0:Z

    .line 326
    .line 327
    move v4, v0

    .line 328
    move v13, v6

    .line 329
    move v6, v7

    .line 330
    move v5, v15

    .line 331
    move/from16 v7, v17

    .line 332
    .line 333
    invoke-direct/range {v2 .. v14}, Lax/a1/f0$h;-><init>(Lax/P0/v;IIIIIIILax/Q0/n;ZZZ)V

    .line 334
    .line 335
    .line 336
    invoke-direct {v1}, Lax/a1/f0;->k0()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_158

    .line 341
    .line 342
    iput-object v2, v1, Lax/a1/f0;->w:Lax/a1/f0$h;

    .line 343
    .line 344
    return-void

    .line 345
    :cond_158
    iput-object v2, v1, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 346
    .line 347
    return-void

    .line 348
    :cond_15b
    new-instance v0, Lax/a1/B$b;

    .line 349
    .line 350
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const-string v4, "Invalid output channel config (mode="

    .line 356
    .line 357
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-direct {v0, v2, v3}, Lax/a1/B$b;-><init>(Ljava/lang/String;Lax/P0/v;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_178
    new-instance v0, Lax/a1/B$b;

    .line 378
    .line 379
    new-instance v2, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    const-string v4, "Invalid output encoding (mode="

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-direct {v0, v2, v3}, Lax/a1/B$b;-><init>(Ljava/lang/String;Lax/P0/v;)V

    .line 403
    .line 404
    .line 405
    throw v0

    .line 406
    :cond_195
    new-instance v0, Lax/a1/B$b;

    .line 407
    .line 408
    new-instance v2, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const-string v4, "Unable to configure passthrough for: "

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-direct {v0, v2, v3}, Lax/a1/B$b;-><init>(Ljava/lang/String;Lax/P0/v;)V

    .line 426
    .line 427
    .line 428
    throw v0
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

.method public k()Z
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_26

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_18

    .line 12
    .line 13
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, Lax/a1/T;->a(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_18

    .line 20
    .line 21
    iget-boolean v0, p0, Lax/a1/f0;->Y:Z

    .line 22
    .line 23
    if-nez v0, :cond_26

    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 26
    .line 27
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Lax/a1/F;->j(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_26

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_26
    const/4 v0, 0x0

    .line 40
    return v0
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

.method public l(F)V
    .registers 3

    .line 1
    iget v0, p0, Lax/a1/f0;->S:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iput p1, p0, Lax/a1/f0;->S:F

    .line 8
    .line 9
    invoke-direct {p0}, Lax/a1/f0;->z0()V

    .line 10
    .line 11
    .line 12
    :cond_b
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

.method public m()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/a1/f0;->Z:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1f

    .line 9
    .line 10
    iget-object v0, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/a1/F;->x()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lax/a1/f0;->X:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1a

    .line 18
    .line 19
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1f

    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public n(Lax/P0/v;)I
    .registers 6

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->p0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v0, :cond_3f

    .line 15
    .line 16
    iget v0, p1, Lax/P0/v;->I:I

    .line 17
    .line 18
    invoke-static {v0}, Lax/S0/d0;->L0(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_30

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "Invalid PCM encoding: "

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget p1, p1, Lax/P0/v;->I:I

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "DefaultAudioSink"

    .line 44
    .line 45
    invoke-static {v0, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_30
    iget p1, p1, Lax/P0/v;->I:I

    .line 50
    .line 51
    if-eq p1, v2, :cond_3e

    .line 52
    .line 53
    iget-boolean v0, p0, Lax/a1/f0;->c:Z

    .line 54
    .line 55
    if-eqz v0, :cond_3c

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-ne p1, v0, :cond_3c

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_3e
    :goto_3e
    return v2

    .line 64
    :cond_3f
    iget-object v0, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 65
    .line 66
    iget-object v3, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 67
    .line 68
    invoke-virtual {v0, p1, v3}, Lax/a1/e;->j(Lax/P0/v;Lax/P0/c;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4a

    .line 73
    .line 74
    return v2

    .line 75
    :cond_4a
    return v1
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

.method public o(I)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->c0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    iget v0, p0, Lax/a1/f0;->b0:I

    .line 7
    .line 8
    if-ne v0, p1, :cond_19

    .line 9
    .line 10
    iput-boolean v1, p0, Lax/a1/f0;->c0:Z

    .line 11
    .line 12
    :cond_b
    iget v0, p0, Lax/a1/f0;->b0:I

    .line 13
    .line 14
    if-eq v0, p1, :cond_19

    .line 15
    .line 16
    iput p1, p0, Lax/a1/f0;->b0:I

    .line 17
    .line 18
    if-eqz p1, :cond_14

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :cond_14
    iput-boolean v1, p0, Lax/a1/f0;->a0:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/a1/f0;->flush()V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method public p()J
    .registers 11

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x17

    .line 16
    .line 17
    if-lt v0, v1, :cond_1b

    .line 18
    .line 19
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    iget-object v1, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lax/a1/f0$b;->a(Landroid/media/AudioTrack;Lax/a1/f0$h;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 29
    .line 30
    iget v1, v0, Lax/a1/f0$h;->c:I

    .line 31
    .line 32
    if-nez v1, :cond_2b

    .line 33
    .line 34
    iget v1, v0, Lax/a1/f0$h;->e:I

    .line 35
    .line 36
    int-to-long v1, v1

    .line 37
    iget v0, v0, Lax/a1/f0$h;->d:I

    .line 38
    .line 39
    int-to-long v3, v0

    .line 40
    mul-long v1, v1, v3

    .line 41
    .line 42
    :goto_29
    move-wide v7, v1

    .line 43
    goto :goto_33

    .line 44
    :cond_2b
    iget v0, v0, Lax/a1/f0$h;->g:I

    .line 45
    .line 46
    invoke-static {v0}, Lax/a1/f0;->d0(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-long v1, v0

    .line 51
    goto :goto_29

    .line 52
    :goto_33
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 53
    .line 54
    iget v0, v0, Lax/a1/f0$h;->h:I

    .line 55
    .line 56
    int-to-long v3, v0

    .line 57
    const-wide/32 v5, 0xf4240

    .line 58
    .line 59
    .line 60
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 61
    .line 62
    invoke-static/range {v3 .. v9}, Lax/S0/d0;->r1(JJJLjava/math/RoundingMode;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    return-wide v0
    .line 67
    .line 68
.end method

.method public q(II)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_17

    .line 4
    .line 5
    invoke-static {v0}, Lax/a1/f0;->l0(Landroid/media/AudioTrack;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_17

    .line 10
    .line 11
    iget-object v0, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 12
    .line 13
    if-eqz v0, :cond_17

    .line 14
    .line 15
    iget-boolean v0, v0, Lax/a1/f0$h;->k:Z

    .line 16
    .line 17
    if-eqz v0, :cond_17

    .line 18
    .line 19
    iget-object v0, p0, Lax/a1/f0;->z:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-static {v0, p1, p2}, Lax/a1/V;->a(Landroid/media/AudioTrack;II)V

    .line 22
    .line 23
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
.end method

.method public q0(Lax/a1/e;)V
    .registers 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/a1/f0;->k0:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v1, v0, :cond_a

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v1, 0x0

    .line 12
    :goto_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Current looper ("

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lax/a1/f0;->c0(Landroid/os/Looper;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ") is not the playback looper ("

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/a1/f0;->k0:Landroid/os/Looper;

    .line 35
    .line 36
    invoke-static {v0}, Lax/a1/f0;->c0(Landroid/os/Looper;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ")"

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v1, v0}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 56
    .line 57
    if-eqz v0, :cond_49

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lax/a1/e;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_49

    .line 64
    .line 65
    iput-object p1, p0, Lax/a1/f0;->A:Lax/a1/e;

    .line 66
    .line 67
    iget-object p1, p0, Lax/a1/f0;->v:Lax/a1/B$d;

    .line 68
    .line 69
    if-eqz p1, :cond_49

    .line 70
    .line 71
    invoke-interface {p1}, Lax/a1/B$d;->j()V

    .line 72
    .line 73
    .line 74
    :cond_49
    return-void
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

.method public r(I)V
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lax/a1/f0;->l:I

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public s(Z)J
    .registers 6

    .line 1
    invoke-direct {p0}, Lax/a1/f0;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_28

    .line 6
    .line 7
    iget-boolean p1, p0, Lax/a1/f0;->Q:Z

    .line 8
    .line 9
    if-eqz p1, :cond_b

    .line 10
    .line 11
    goto :goto_28

    .line 12
    :cond_b
    iget-object p1, p0, Lax/a1/f0;->i:Lax/a1/F;

    .line 13
    .line 14
    invoke-virtual {p1}, Lax/a1/F;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, Lax/a1/f0;->x:Lax/a1/f0$h;

    .line 19
    .line 20
    invoke-direct {p0}, Lax/a1/f0;->f0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {p1, v2, v3}, Lax/a1/f0$h;->d(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-direct {p0, v0, v1}, Lax/a1/f0;->S(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, v0, v1}, Lax/a1/f0;->T(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_28
    :goto_28
    const-wide/high16 v0, -0x8000000000000000L

    .line 42
    .line 43
    return-wide v0
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

.method public t()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/a1/f0;->flush()V

    .line 9
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

.method public synthetic u(J)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/a1/A;->a(Lax/a1/B;J)V

    return-void
.end method

.method public v()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/a1/f0;->P:Z

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

.method public w(Lax/Z0/I1;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/f0;->u:Lax/Z0/I1;

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

.method public x(Lax/a1/B$d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/f0;->v:Lax/a1/B$d;

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

.method public y()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->a0:Z

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 7
    .line 8
    if-nez v0, :cond_f

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/a1/f0;->f0:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/a1/f0;->flush()V

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
.end method

.method public z(Lax/P0/v;)Lax/a1/l;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/a1/f0;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    sget-object p1, Lax/a1/l;->d:Lax/a1/l;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    iget-object v0, p0, Lax/a1/f0;->q:Lax/a1/f0$d;

    .line 9
    .line 10
    iget-object v1, p0, Lax/a1/f0;->D:Lax/P0/c;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Lax/a1/f0$d;->a(Lax/P0/v;Lax/P0/c;)Lax/a1/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
