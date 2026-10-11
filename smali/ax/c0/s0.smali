.class public final Lax/c0/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c0/s0$d;,
        Lax/c0/s0$e;,
        Lax/c0/s0$c;,
        Lax/c0/s0$b;,
        Lax/c0/s0$a;
    }
.end annotation


# instance fields
.field private a:Lax/c0/s0$e;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_11

    .line 3
    new-instance v0, Lax/c0/s0$d;

    invoke-direct {v0, p1, p2, p3, p4}, Lax/c0/s0$d;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    return-void

    .line 4
    :cond_11
    new-instance v0, Lax/c0/s0$c;

    invoke-direct {v0, p1, p2, p3, p4}, Lax/c0/s0$c;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .registers 6

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v3, v0, v1, v2}, Lax/c0/s0;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_14

    .line 7
    new-instance v0, Lax/c0/s0$d;

    invoke-direct {v0, p1}, Lax/c0/s0$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    :cond_14
    return-void
.end method

.method static d(Landroid/view/View;Lax/c0/s0$b;)V
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_a

    .line 6
    .line 7
    invoke-static {p0, p1}, Lax/c0/s0$d;->h(Landroid/view/View;Lax/c0/s0$b;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-static {p0, p1}, Lax/c0/s0$c;->p(Landroid/view/View;Lax/c0/s0$b;)V

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
.end method

.method static f(Landroid/view/WindowInsetsAnimation;)Lax/c0/s0;
    .registers 2

    .line 1
    new-instance v0, Lax/c0/s0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/c0/s0;-><init>(Landroid/view/WindowInsetsAnimation;)V

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
.method public a()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/s0$e;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public b()F
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/s0$e;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public c()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/s0$e;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public e(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/s0;->a:Lax/c0/s0$e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/c0/s0$e;->d(F)V

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
