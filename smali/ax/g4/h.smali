.class public final Lax/g4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/g4/b;
.implements Lax/h4/d;
.implements Lax/g4/g;
.implements Lax/l4/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/g4/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/g4/b;",
        "Lax/h4/d;",
        "Lax/g4/g;",
        "Lax/l4/a$f;"
    }
.end annotation


# static fields
.field private static final x0:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/g4/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static y0:Z


# instance fields
.field private final c0:Lax/l4/b;

.field private d0:Lax/g4/c;

.field private e0:Lax/J3/e;

.field private f0:Ljava/lang/Object;

.field private g0:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TR;>;"
        }
    .end annotation
.end field

.field private h0:Lax/g4/f;

.field private i0:I

.field private j0:I

.field private k0:Lax/J3/g;

.field private l0:Lax/h4/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/h4/e<",
            "TR;>;"
        }
    .end annotation
.end field

.field private m0:Lax/P3/i;

.field private n0:Lax/i4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i4/c<",
            "-TR;>;"
        }
    .end annotation
.end field

.field private o0:Lax/P3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/s<",
            "TR;>;"
        }
    .end annotation
.end field

.field private p0:Lax/P3/i$d;

.field private final q:Ljava/lang/String;

.field private q0:J

.field private r0:Lax/g4/h$b;

.field private s0:Landroid/graphics/drawable/Drawable;

.field private t0:Landroid/graphics/drawable/Drawable;

.field private u0:Landroid/graphics/drawable/Drawable;

.field private v0:I

.field private w0:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/g4/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x96

    .line 7
    .line 8
    invoke-static {v1, v0}, Lax/l4/a;->d(ILax/l4/a$d;)Lax/b0/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/g4/h;->x0:Lax/b0/d;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lax/g4/h;->y0:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lax/g4/h;->q:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {}, Lax/l4/b;->a()Lax/l4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private A(Lax/P3/s;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/g4/h;->m0:Lax/P3/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P3/i;->k(Lax/P3/s;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lax/g4/h;->o0:Lax/P3/s;

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

.method private B()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/g4/h;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    invoke-direct {p0}, Lax/g4/h;->n()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    :goto_11
    if-nez v0, :cond_17

    .line 19
    .line 20
    invoke-direct {p0}, Lax/g4/h;->m()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_17
    if-nez v0, :cond_1d

    .line 25
    .line 26
    invoke-direct {p0}, Lax/g4/h;->o()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1d
    iget-object v1, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lax/h4/e;->i(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
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

.method private g()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lax/g4/c;->b(Lax/g4/b;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private j()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lax/g4/c;->g(Lax/g4/b;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private m()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->s0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/g4/f;->m()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/g4/h;->s0:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-nez v0, :cond_22

    .line 14
    .line 15
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/g4/f;->l()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_22

    .line 22
    .line 23
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/g4/f;->l()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {p0, v0}, Lax/g4/h;->r(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lax/g4/h;->s0:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/g4/h;->s0:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    return-object v0
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

.method private n()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->u0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/g4/f;->n()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/g4/h;->u0:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-nez v0, :cond_22

    .line 14
    .line 15
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/g4/f;->o()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_22

    .line 22
    .line 23
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/g4/f;->o()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {p0, v0}, Lax/g4/h;->r(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lax/g4/h;->u0:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/g4/h;->u0:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    return-object v0
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

.method private o()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->t0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/g4/f;->w()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/g4/h;->t0:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-nez v0, :cond_22

    .line 14
    .line 15
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/g4/f;->x()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_22

    .line 22
    .line 23
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/g4/f;->x()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {p0, v0}, Lax/g4/h;->r(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lax/g4/h;->t0:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/g4/h;->t0:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    return-object v0
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

.method private p(Lax/J3/e;Ljava/lang/Object;Ljava/lang/Class;Lax/g4/f;IILax/J3/g;Lax/h4/e;Lax/g4/e;Lax/g4/c;Lax/P3/i;Lax/i4/c;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/g4/f;",
            "II",
            "Lax/J3/g;",
            "Lax/h4/e<",
            "TR;>;",
            "Lax/g4/e<",
            "TR;>;",
            "Lax/g4/c;",
            "Lax/P3/i;",
            "Lax/i4/c<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 2
    .line 3
    iput-object p2, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 8
    .line 9
    iput p5, p0, Lax/g4/h;->i0:I

    .line 10
    .line 11
    iput p6, p0, Lax/g4/h;->j0:I

    .line 12
    .line 13
    iput-object p7, p0, Lax/g4/h;->k0:Lax/J3/g;

    .line 14
    .line 15
    iput-object p8, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 16
    .line 17
    iput-object p10, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 18
    .line 19
    iput-object p11, p0, Lax/g4/h;->m0:Lax/P3/i;

    .line 20
    .line 21
    iput-object p12, p0, Lax/g4/h;->n0:Lax/i4/c;

    .line 22
    .line 23
    sget-object p1, Lax/g4/h$b;->q:Lax/g4/h$b;

    .line 24
    .line 25
    iput-object p1, p0, Lax/g4/h;->r0:Lax/g4/h$b;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private q()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0}, Lax/g4/c;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private r(I)Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 1
    sget-boolean v0, Lax/g4/h;->y0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/g4/h;->t(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_9
    invoke-direct {p0, p1}, Lax/g4/h;->s(I)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private s(I)Landroid/graphics/drawable/Drawable;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/g4/f;->D()Landroid/content/res/Resources$Theme;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, p1, v1}, Lax/S/h;->e(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private t(I)Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/o/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lax/g4/h;->y0:Z

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lax/g4/h;->s(I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private u(Ljava/lang/String;)V
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " this: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/g4/h;->q:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "Request"

    .line 24
    .line 25
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

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

.method private static v(IF)I
    .registers 3

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-ne p0, v0, :cond_5

    .line 4
    .line 5
    return p0

    .line 6
    :cond_5
    int-to-float p0, p0

    .line 7
    mul-float p1, p1, p0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
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

.method private w()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lax/g4/c;->e(Lax/g4/b;)V

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

.method public static x(Lax/J3/e;Ljava/lang/Object;Ljava/lang/Class;Lax/g4/f;IILax/J3/g;Lax/h4/e;Lax/g4/e;Lax/g4/c;Lax/P3/i;Lax/i4/c;)Lax/g4/h;
    .registers 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/g4/f;",
            "II",
            "Lax/J3/g;",
            "Lax/h4/e<",
            "TR;>;",
            "Lax/g4/e<",
            "TR;>;",
            "Lax/g4/c;",
            "Lax/P3/i;",
            "Lax/i4/c<",
            "-TR;>;)",
            "Lax/g4/h<",
            "TR;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/g4/h;->x0:Lax/b0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/g4/h;

    .line 8
    .line 9
    if-nez v0, :cond_f

    .line 10
    .line 11
    new-instance v0, Lax/g4/h;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/g4/h;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_f
    move-object v2, p0

    .line 17
    move-object v3, p1

    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    move-object/from16 v5, p3

    .line 21
    .line 22
    move/from16 v6, p4

    .line 23
    .line 24
    move/from16 v7, p5

    .line 25
    .line 26
    move-object/from16 v8, p6

    .line 27
    .line 28
    move-object/from16 v9, p7

    .line 29
    .line 30
    move-object/from16 v10, p8

    .line 31
    .line 32
    move-object/from16 v11, p9

    .line 33
    .line 34
    move-object/from16 v12, p10

    .line 35
    .line 36
    move-object/from16 v13, p11

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    invoke-direct/range {v1 .. v13}, Lax/g4/h;->p(Lax/J3/e;Ljava/lang/Object;Ljava/lang/Class;Lax/g4/f;IILax/J3/g;Lax/h4/e;Lax/g4/e;Lax/g4/c;Lax/P3/i;Lax/i4/c;)V

    .line 40
    .line 41
    .line 42
    move-object v0, v1

    .line 43
    return-object v0
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

.method private y(Lax/P3/o;I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/J3/e;->d()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gt v0, p2, :cond_44

    .line 13
    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "Load failed for "

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " with size ["

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lax/g4/h;->v0:I

    .line 35
    .line 36
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "x"

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v1, p0, Lax/g4/h;->w0:I

    .line 45
    .line 46
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "]"

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const-string v1, "Glide"

    .line 59
    .line 60
    invoke-static {v1, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 61
    .line 62
    .line 63
    const/4 p2, 0x4

    .line 64
    if-gt v0, p2, :cond_44

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lax/P3/o;->g(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_44
    const/4 p1, 0x0

    .line 70
    iput-object p1, p0, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 71
    .line 72
    sget-object p1, Lax/g4/h$b;->f0:Lax/g4/h$b;

    .line 73
    .line 74
    iput-object p1, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 75
    .line 76
    invoke-direct {p0}, Lax/g4/h;->B()V

    .line 77
    .line 78
    .line 79
    return-void
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

.method private z(Lax/P3/s;Ljava/lang/Object;Lax/M3/a;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "TR;>;TR;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/g4/h;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lax/g4/h$b;->e0:Lax/g4/h$b;

    .line 6
    .line 7
    iput-object v1, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 8
    .line 9
    iput-object p1, p0, Lax/g4/h;->o0:Lax/P3/s;

    .line 10
    .line 11
    iget-object p1, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/J3/e;->d()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x3

    .line 18
    if-gt p1, v1, :cond_6a

    .line 19
    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Finished loading "

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, " from "

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, " for "

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, " with size ["

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v1, p0, Lax/g4/h;->v0:I

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, "x"

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v1, p0, Lax/g4/h;->w0:I

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, "] in "

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-wide v1, p0, Lax/g4/h;->q0:J

    .line 85
    .line 86
    invoke-static {v1, v2}, Lax/k4/d;->a(J)D

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, " ms"

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v1, "Glide"

    .line 103
    .line 104
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    :cond_6a
    iget-object p1, p0, Lax/g4/h;->n0:Lax/i4/c;

    .line 108
    .line 109
    invoke-interface {p1, p3, v0}, Lax/i4/c;->a(Lax/M3/a;Z)Lax/i4/b;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p3, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 114
    .line 115
    invoke-interface {p3, p2, p1}, Lax/h4/e;->c(Ljava/lang/Object;Lax/i4/b;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lax/g4/h;->w()V

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


# virtual methods
.method public a(Lax/P3/o;)V
    .registers 3

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, p1, v0}, Lax/g4/h;->y(Lax/P3/o;I)V

    .line 3
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
.end method

.method public b(Lax/P3/s;Lax/M3/a;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "*>;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 8
    .line 9
    if-nez p1, :cond_2b

    .line 10
    .line 11
    new-instance p1, Lax/P3/o;

    .line 12
    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v0, "Expected to receive a Resource<R> with an object of "

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, " inside, but instead got null."

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Lax/P3/o;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lax/g4/h;->a(Lax/P3/o;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-interface {p1}, Lax/P3/s;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_50

    .line 49
    .line 50
    iget-object v1, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3e

    .line 61
    .line 62
    goto :goto_50

    .line 63
    :cond_3e
    invoke-direct {p0}, Lax/g4/h;->j()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_4c

    .line 68
    .line 69
    invoke-direct {p0, p1}, Lax/g4/h;->A(Lax/P3/s;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lax/g4/h$b;->e0:Lax/g4/h$b;

    .line 73
    .line 74
    iput-object p1, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    invoke-direct {p0, p1, v0, p2}, Lax/g4/h;->z(Lax/P3/s;Ljava/lang/Object;Lax/M3/a;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_50
    :goto_50
    invoke-direct {p0, p1}, Lax/g4/h;->A(Lax/P3/s;)V

    .line 82
    .line 83
    .line 84
    new-instance p2, Lax/P3/o;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v2, "Expected to receive an object of "

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v2, " but instead got "

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, ""

    .line 107
    .line 108
    if-eqz v0, :cond_72

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_73

    .line 115
    :cond_72
    move-object v3, v2

    .line 116
    :goto_73
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v3, "{"

    .line 120
    .line 121
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v3, "} inside Resource{"

    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string p1, "}."

    .line 136
    .line 137
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    if-eqz v0, :cond_8e

    .line 141
    .line 142
    goto :goto_90

    .line 143
    :cond_8e
    const-string v2, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    .line 144
    .line 145
    :goto_90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p2, p1}, Lax/P3/o;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p2}, Lax/g4/h;->a(Lax/P3/o;)V

    .line 156
    .line 157
    .line 158
    return-void
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

.method public c()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/g4/h;->i()Z

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

.method public clear()V
    .registers 4

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 5
    .line 6
    sget-object v1, Lax/g4/h$b;->h0:Lax/g4/h$b;

    .line 7
    .line 8
    if-ne v0, v1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/g4/h;->k()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/g4/h;->o0:Lax/P3/s;

    .line 15
    .line 16
    if-eqz v0, :cond_14

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lax/g4/h;->A(Lax/P3/s;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-direct {p0}, Lax/g4/h;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_23

    .line 26
    .line 27
    iget-object v0, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 28
    .line 29
    invoke-direct {p0}, Lax/g4/h;->o()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v2}, Lax/h4/e;->l(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    iput-object v1, p0, Lax/g4/h;->r0:Lax/g4/h$b;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public d(Lax/g4/b;)Z
    .registers 5

    .line 1
    instance-of v0, p1, Lax/g4/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_39

    .line 5
    .line 6
    check-cast p1, Lax/g4/h;

    .line 7
    .line 8
    iget v0, p0, Lax/g4/h;->i0:I

    .line 9
    .line 10
    iget v2, p1, Lax/g4/h;->i0:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_39

    .line 13
    .line 14
    iget v0, p0, Lax/g4/h;->j0:I

    .line 15
    .line 16
    iget v2, p1, Lax/g4/h;->j0:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_39

    .line 19
    .line 20
    iget-object v0, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, p1, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_39

    .line 29
    .line 30
    iget-object v0, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 31
    .line 32
    iget-object v2, p1, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_39

    .line 39
    .line 40
    iget-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 41
    .line 42
    iget-object v2, p1, Lax/g4/h;->h0:Lax/g4/f;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lax/g4/f;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_39

    .line 49
    .line 50
    iget-object v0, p0, Lax/g4/h;->k0:Lax/J3/g;

    .line 51
    .line 52
    iget-object p1, p1, Lax/g4/h;->k0:Lax/J3/g;

    .line 53
    .line 54
    if-ne v0, p1, :cond_39

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_39
    return v1
    .line 59
    .line 60
    .line 61
.end method

.method public e(II)V
    .registers 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/g4/h;->c0:Lax/l4/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/l4/b;->c()V

    .line 6
    .line 7
    .line 8
    const-string v1, "Request"

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2a

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v4, "Got onSizeReady in "

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-wide v4, v0, Lax/g4/h;->q0:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Lax/k4/d;->a(J)D

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {v0, v3}, Lax/g4/h;->u(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    iget-object v3, v0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 44
    .line 45
    sget-object v4, Lax/g4/h$b;->d0:Lax/g4/h$b;

    .line 46
    .line 47
    if-eq v3, v4, :cond_33

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    goto/16 :goto_104

    .line 51
    .line 52
    :cond_33
    sget-object v3, Lax/g4/h$b;->c0:Lax/g4/h$b;

    .line 53
    .line 54
    iput-object v3, v0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 55
    .line 56
    iget-object v3, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 57
    .line 58
    invoke-virtual {v3}, Lax/g4/f;->C()F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    move/from16 v4, p1

    .line 63
    .line 64
    invoke-static {v4, v3}, Lax/g4/h;->v(IF)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iput v4, v0, Lax/g4/h;->v0:I

    .line 69
    .line 70
    move/from16 v4, p2

    .line 71
    .line 72
    invoke-static {v4, v3}, Lax/g4/h;->v(IF)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput v3, v0, Lax/g4/h;->w0:I

    .line 77
    .line 78
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_6d

    .line 83
    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v4, "finished setup for calling load in "

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-wide v4, v0, Lax/g4/h;->q0:J

    .line 95
    .line 96
    invoke-static {v4, v5}, Lax/k4/d;->a(J)D

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {v0, v3}, Lax/g4/h;->u(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_6d
    move-object v3, v1

    .line 111
    iget-object v1, v0, Lax/g4/h;->m0:Lax/P3/i;

    .line 112
    .line 113
    const/4 v4, 0x2

    .line 114
    iget-object v2, v0, Lax/g4/h;->e0:Lax/J3/e;

    .line 115
    .line 116
    move-object v5, v3

    .line 117
    iget-object v3, v0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v6, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 120
    .line 121
    invoke-virtual {v6}, Lax/g4/f;->B()Lax/M3/h;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    move-object v7, v5

    .line 126
    iget v5, v0, Lax/g4/h;->v0:I

    .line 127
    .line 128
    move-object v4, v6

    .line 129
    const/4 v8, 0x2

    .line 130
    iget v6, v0, Lax/g4/h;->w0:I

    .line 131
    .line 132
    iget-object v9, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 133
    .line 134
    invoke-virtual {v9}, Lax/g4/f;->z()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    const/4 v10, 0x2

    .line 139
    iget-object v8, v0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 140
    .line 141
    move-object v11, v7

    .line 142
    move-object v7, v9

    .line 143
    iget-object v9, v0, Lax/g4/h;->k0:Lax/J3/g;

    .line 144
    .line 145
    iget-object v12, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 146
    .line 147
    invoke-virtual {v12}, Lax/g4/f;->k()Lax/P3/h;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    iget-object v13, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 152
    .line 153
    invoke-virtual {v13}, Lax/g4/f;->E()Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    iget-object v14, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 158
    .line 159
    invoke-virtual {v14}, Lax/g4/f;->L()Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    iget-object v15, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 164
    .line 165
    invoke-virtual {v15}, Lax/g4/f;->I()Z

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    iget-object v10, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 170
    .line 171
    invoke-virtual {v10}, Lax/g4/f;->s()Lax/M3/j;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    move-object/from16 v16, v1

    .line 176
    .line 177
    iget-object v1, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 178
    .line 179
    invoke-virtual {v1}, Lax/g4/f;->G()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    move/from16 p2, v1

    .line 184
    .line 185
    iget-object v1, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 186
    .line 187
    invoke-virtual {v1}, Lax/g4/f;->F()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    move/from16 v17, v1

    .line 192
    .line 193
    iget-object v1, v0, Lax/g4/h;->h0:Lax/g4/f;

    .line 194
    .line 195
    invoke-virtual {v1}, Lax/g4/f;->r()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    move/from16 v18, v17

    .line 200
    .line 201
    move/from16 v17, v1

    .line 202
    .line 203
    move-object/from16 v1, v16

    .line 204
    .line 205
    move/from16 v16, v18

    .line 206
    .line 207
    move/from16 v18, v14

    .line 208
    .line 209
    move-object v14, v10

    .line 210
    move-object v10, v12

    .line 211
    move/from16 v12, v18

    .line 212
    .line 213
    move-object/from16 v18, v0

    .line 214
    .line 215
    move-object v0, v11

    .line 216
    move-object v11, v13

    .line 217
    move v13, v15

    .line 218
    move/from16 v15, p2

    .line 219
    .line 220
    invoke-virtual/range {v1 .. v18}, Lax/P3/i;->g(Lax/J3/e;Ljava/lang/Object;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZLax/M3/j;ZZZLax/g4/g;)Lax/P3/i$d;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    move-object/from16 v2, v18

    .line 225
    .line 226
    iput-object v1, v2, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 227
    .line 228
    const/4 v4, 0x2

    .line 229
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_104

    .line 234
    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v1, "finished onSizeReady in "

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    iget-wide v3, v2, Lax/g4/h;->q0:J

    .line 246
    .line 247
    invoke-static {v3, v4}, Lax/k4/d;->a(J)D

    .line 248
    .line 249
    .line 250
    move-result-wide v3

    .line 251
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-direct {v2, v0}, Lax/g4/h;->u(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_104
    :goto_104
    return-void
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

.method public f()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/g4/h;->clear()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/g4/h$b;->i0:Lax/g4/h$b;

    .line 5
    .line 6
    iput-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

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

.method public h()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/k4/d;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lax/g4/h;->q0:J

    .line 11
    .line 12
    iget-object v0, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    if-nez v0, :cond_35

    .line 15
    .line 16
    iget v0, p0, Lax/g4/h;->i0:I

    .line 17
    .line 18
    iget v1, p0, Lax/g4/h;->j0:I

    .line 19
    .line 20
    invoke-static {v0, v1}, Lax/k4/i;->r(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_21

    .line 25
    .line 26
    iget v0, p0, Lax/g4/h;->i0:I

    .line 27
    .line 28
    iput v0, p0, Lax/g4/h;->v0:I

    .line 29
    .line 30
    iget v0, p0, Lax/g4/h;->j0:I

    .line 31
    .line 32
    iput v0, p0, Lax/g4/h;->w0:I

    .line 33
    .line 34
    :cond_21
    invoke-direct {p0}, Lax/g4/h;->n()Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_29

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 v0, 0x3

    .line 43
    :goto_2a
    new-instance v1, Lax/P3/o;

    .line 44
    .line 45
    const-string v2, "Received null model"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Lax/P3/o;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1, v0}, Lax/g4/h;->y(Lax/P3/o;I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    iget-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 55
    .line 56
    sget-object v1, Lax/g4/h$b;->c0:Lax/g4/h$b;

    .line 57
    .line 58
    if-eq v0, v1, :cond_9b

    .line 59
    .line 60
    sget-object v2, Lax/g4/h$b;->e0:Lax/g4/h$b;

    .line 61
    .line 62
    if-ne v0, v2, :cond_47

    .line 63
    .line 64
    iget-object v0, p0, Lax/g4/h;->o0:Lax/P3/s;

    .line 65
    .line 66
    sget-object v1, Lax/M3/a;->f0:Lax/M3/a;

    .line 67
    .line 68
    invoke-virtual {p0, v0, v1}, Lax/g4/h;->b(Lax/P3/s;Lax/M3/a;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_47
    sget-object v0, Lax/g4/h$b;->d0:Lax/g4/h$b;

    .line 73
    .line 74
    iput-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 75
    .line 76
    iget v2, p0, Lax/g4/h;->i0:I

    .line 77
    .line 78
    iget v3, p0, Lax/g4/h;->j0:I

    .line 79
    .line 80
    invoke-static {v2, v3}, Lax/k4/i;->r(II)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_5d

    .line 85
    .line 86
    iget v2, p0, Lax/g4/h;->i0:I

    .line 87
    .line 88
    iget v3, p0, Lax/g4/h;->j0:I

    .line 89
    .line 90
    invoke-virtual {p0, v2, v3}, Lax/g4/h;->e(II)V

    .line 91
    .line 92
    .line 93
    goto :goto_62

    .line 94
    :cond_5d
    iget-object v2, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 95
    .line 96
    invoke-interface {v2, p0}, Lax/h4/e;->g(Lax/h4/d;)V

    .line 97
    .line 98
    .line 99
    :goto_62
    iget-object v2, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 100
    .line 101
    if-eq v2, v1, :cond_68

    .line 102
    .line 103
    if-ne v2, v0, :cond_77

    .line 104
    .line 105
    :cond_68
    invoke-direct {p0}, Lax/g4/h;->g()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_77

    .line 110
    .line 111
    iget-object v0, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 112
    .line 113
    invoke-direct {p0}, Lax/g4/h;->o()Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v0, v1}, Lax/h4/e;->j(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    const-string v0, "Request"

    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_9a

    .line 128
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v1, "finished run method in "

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-wide v1, p0, Lax/g4/h;->q0:J

    .line 140
    .line 141
    invoke-static {v1, v2}, Lax/k4/d;->a(J)D

    .line 142
    .line 143
    .line 144
    move-result-wide v1

    .line 145
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-direct {p0, v0}, Lax/g4/h;->u(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_9a
    return-void

    .line 156
    :cond_9b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    const-string v1, "Cannot restart a running request"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0
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

.method public i()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 2
    .line 3
    sget-object v1, Lax/g4/h$b;->e0:Lax/g4/h$b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public isCancelled()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 2
    .line 3
    sget-object v1, Lax/g4/h$b;->g0:Lax/g4/h$b;

    .line 4
    .line 5
    if-eq v0, v1, :cond_d

    .line 6
    .line 7
    sget-object v1, Lax/g4/h$b;->h0:Lax/g4/h$b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public isRunning()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 2
    .line 3
    sget-object v1, Lax/g4/h$b;->c0:Lax/g4/h$b;

    .line 4
    .line 5
    if-eq v0, v1, :cond_d

    .line 6
    .line 7
    sget-object v1, Lax/g4/h$b;->d0:Lax/g4/h$b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method k()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Lax/h4/e;->d(Lax/h4/d;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lax/g4/h$b;->g0:Lax/g4/h$b;

    .line 12
    .line 13
    iput-object v0, p0, Lax/g4/h;->r0:Lax/g4/h$b;

    .line 14
    .line 15
    iget-object v0, p0, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 16
    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/P3/i$d;->a()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public l()Lax/l4/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/h;->c0:Lax/l4/b;

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

.method public recycle()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/g4/h;->e0:Lax/J3/e;

    .line 3
    .line 4
    iput-object v0, p0, Lax/g4/h;->f0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lax/g4/h;->g0:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object v0, p0, Lax/g4/h;->h0:Lax/g4/f;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lax/g4/h;->i0:I

    .line 12
    .line 13
    iput v1, p0, Lax/g4/h;->j0:I

    .line 14
    .line 15
    iput-object v0, p0, Lax/g4/h;->l0:Lax/h4/e;

    .line 16
    .line 17
    iput-object v0, p0, Lax/g4/h;->d0:Lax/g4/c;

    .line 18
    .line 19
    iput-object v0, p0, Lax/g4/h;->n0:Lax/i4/c;

    .line 20
    .line 21
    iput-object v0, p0, Lax/g4/h;->p0:Lax/P3/i$d;

    .line 22
    .line 23
    iput-object v0, p0, Lax/g4/h;->s0:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iput-object v0, p0, Lax/g4/h;->t0:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    iput-object v0, p0, Lax/g4/h;->u0:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    iput v1, p0, Lax/g4/h;->v0:I

    .line 30
    .line 31
    iput v1, p0, Lax/g4/h;->w0:I

    .line 32
    .line 33
    sget-object v0, Lax/g4/h;->x0:Lax/b0/d;

    .line 34
    .line 35
    invoke-interface {v0, p0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
