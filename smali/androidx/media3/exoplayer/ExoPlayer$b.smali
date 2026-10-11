.class public final Landroidx/media3/exoplayer/ExoPlayer$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/ExoPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:Lax/Y0/P;

.field B:J

.field C:J

.field D:Z

.field E:Z

.field F:Lax/Y0/T;

.field G:Z

.field H:Z

.field I:Ljava/lang/String;

.field J:Z

.field K:Landroidx/media3/exoplayer/X0;

.field final a:Landroid/content/Context;

.field b:Lax/S0/h;

.field c:J

.field d:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/Y0/X;",
            ">;"
        }
    .end annotation
.end field

.field e:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/i1/F$a;",
            ">;"
        }
    .end annotation
.end field

.field f:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/l1/J;",
            ">;"
        }
    .end annotation
.end field

.field g:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroidx/media3/exoplayer/o0;",
            ">;"
        }
    .end annotation
.end field

.field h:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/m1/e;",
            ">;"
        }
    .end annotation
.end field

.field i:Lax/q7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/f<",
            "Lax/S0/h;",
            "Lax/Z0/a;",
            ">;"
        }
    .end annotation
.end field

.field j:Landroid/os/Looper;

.field k:I

.field l:Lax/P0/J;

.field m:Lax/P0/c;

.field n:Z

.field o:I

.field p:Z

.field q:Z

.field r:Z

.field s:I

.field t:I

.field u:Z

.field v:Lax/Y0/Z;

.field w:Lax/Y0/Y;

.field x:J

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/Y0/X;)V
    .registers 5

    .line 1
    new-instance v0, Lax/Y0/G;

    invoke-direct {v0, p2}, Lax/Y0/G;-><init>(Lax/Y0/X;)V

    new-instance v1, Lax/Y0/H;

    invoke-direct {v1, p1}, Lax/Y0/H;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;)V

    .line 2
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/q7/u<",
            "Lax/Y0/X;",
            ">;",
            "Lax/q7/u<",
            "Lax/i1/F$a;",
            ">;)V"
        }
    .end annotation

    .line 3
    new-instance v4, Lax/Y0/I;

    invoke-direct {v4, p1}, Lax/Y0/I;-><init>(Landroid/content/Context;)V

    new-instance v5, Lax/Y0/J;

    invoke-direct {v5}, Lax/Y0/J;-><init>()V

    new-instance v6, Lax/Y0/K;

    invoke-direct {v6, p1}, Lax/Y0/K;-><init>(Landroid/content/Context;)V

    new-instance v7, Lax/Y0/L;

    invoke-direct {v7}, Lax/Y0/L;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/f;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/u;Lax/q7/f;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/q7/u<",
            "Lax/Y0/X;",
            ">;",
            "Lax/q7/u<",
            "Lax/i1/F$a;",
            ">;",
            "Lax/q7/u<",
            "Lax/l1/J;",
            ">;",
            "Lax/q7/u<",
            "Landroidx/media3/exoplayer/o0;",
            ">;",
            "Lax/q7/u<",
            "Lax/m1/e;",
            ">;",
            "Lax/q7/f<",
            "Lax/S0/h;",
            "Lax/Z0/a;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->d:Lax/q7/u;

    .line 7
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->e:Lax/q7/u;

    .line 8
    iput-object p4, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:Lax/q7/u;

    .line 9
    iput-object p5, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:Lax/q7/u;

    .line 10
    iput-object p6, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->h:Lax/q7/u;

    .line 11
    iput-object p7, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->i:Lax/q7/f;

    .line 12
    invoke-static {}, Lax/S0/d0;->X()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 13
    sget-object p1, Lax/P0/c;->h:Lax/P0/c;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->m:Lax/P0/c;

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->o:I

    const/4 p2, 0x1

    .line 15
    iput p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->s:I

    .line 16
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->t:I

    .line 17
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->u:Z

    .line 18
    sget-object p1, Lax/Y0/Z;->g:Lax/Y0/Z;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->v:Lax/Y0/Z;

    const-wide/16 p3, 0x1388

    .line 19
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    const-wide/16 p3, 0x3a98

    .line 20
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->y:J

    const-wide/16 p3, 0xbb8

    .line 21
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->z:J

    .line 22
    sget-object p1, Lax/Y0/Y;->i:Lax/Y0/Y;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->w:Lax/Y0/Y;

    .line 23
    new-instance p1, Landroidx/media3/exoplayer/i$b;

    invoke-direct {p1}, Landroidx/media3/exoplayer/i$b;-><init>()V

    invoke-virtual {p1}, Landroidx/media3/exoplayer/i$b;->a()Landroidx/media3/exoplayer/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->A:Lax/Y0/P;

    .line 24
    sget-object p1, Lax/S0/h;->a:Lax/S0/h;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lax/S0/h;

    const-wide/16 p3, 0x1f4

    .line 25
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->B:J

    const-wide/16 p3, 0x7d0

    .line 26
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->C:J

    .line 27
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->E:Z

    .line 28
    const-string p1, ""

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->I:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 29
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->k:I

    .line 30
    new-instance p1, Landroidx/media3/exoplayer/l;

    invoke-direct {p1}, Landroidx/media3/exoplayer/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->K:Landroidx/media3/exoplayer/X0;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lax/i1/F$a;
    .registers 3

    .line 1
    new-instance v0, Lax/i1/r;

    .line 2
    .line 3
    new-instance v1, Lax/q1/n;

    .line 4
    .line 5
    invoke-direct {v1}, Lax/q1/n;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lax/i1/r;-><init>(Landroid/content/Context;Lax/q1/x;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public static synthetic b(Landroidx/media3/exoplayer/o0;)Landroidx/media3/exoplayer/o0;
    .registers 1

    .line 1
    return-object p0
.end method

.method public static synthetic c(Lax/i1/F$a;)Lax/i1/F$a;
    .registers 1

    .line 1
    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Lax/m1/e;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/m1/j;->n(Landroid/content/Context;)Lax/m1/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic e(Lax/l1/J;)Lax/l1/J;
    .registers 1

    .line 1
    return-object p0
.end method

.method public static synthetic f(Lax/Y0/X;)Lax/Y0/X;
    .registers 1

    .line 1
    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Lax/l1/J;
    .registers 2

    .line 1
    new-instance v0, Lax/l1/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/l1/n;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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


# virtual methods
.method public h()Landroidx/media3/exoplayer/ExoPlayer;
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/exoplayer/X;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/X;-><init>(Landroidx/media3/exoplayer/ExoPlayer$b;Lax/P0/H;)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i(Landroidx/media3/exoplayer/o0;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/Y0/D;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lax/Y0/D;-><init>(Landroidx/media3/exoplayer/o0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:Lax/q7/u;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public j(Lax/i1/F$a;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/Y0/F;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lax/Y0/F;-><init>(Lax/i1/F$a;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->e:Lax/q7/u;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public k(J)Landroidx/media3/exoplayer/ExoPlayer$b;
    .registers 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-lez v3, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 15
    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    .line 21
    .line 22
    return-object p0
.end method

.method public l(J)Landroidx/media3/exoplayer/ExoPlayer$b;
    .registers 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-lez v3, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 15
    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->y:J

    .line 21
    .line 22
    return-object p0
.end method

.method public m(Lax/l1/J;)Landroidx/media3/exoplayer/ExoPlayer$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/Y0/E;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lax/Y0/E;-><init>(Lax/l1/J;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:Lax/q7/u;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method
