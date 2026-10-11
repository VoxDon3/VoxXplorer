.class public Lax/b4/c;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lax/b4/g$b;
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b4/c$a;
    }
.end annotation


# instance fields
.field private final a:Lax/b4/c$a;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:Z

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/L3/a;Lax/Q3/d;Lax/M3/m;IILandroid/graphics/Bitmap;)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/L3/a;",
            "Lax/Q3/d;",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/b4/c$a;

    new-instance v1, Lax/b4/g;

    .line 2
    invoke-static {p1}, Lax/J3/c;->c(Landroid/content/Context;)Lax/J3/c;

    move-result-object v2

    move-object v3, p2

    move-object v6, p4

    move v4, p5

    move v5, p6

    move-object v7, p7

    invoke-direct/range {v1 .. v7}, Lax/b4/g;-><init>(Lax/J3/c;Lax/L3/a;IILax/M3/m;Landroid/graphics/Bitmap;)V

    invoke-direct {v0, p3, v1}, Lax/b4/c$a;-><init>(Lax/Q3/d;Lax/b4/g;)V

    .line 3
    invoke-direct {p0, v0}, Lax/b4/c;-><init>(Lax/b4/c$a;)V

    return-void
.end method

.method constructor <init>(Lax/b4/c$a;)V
    .registers 3

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/b4/c;->e:Z

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lax/b4/c;->g:I

    .line 7
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/b4/c$a;

    iput-object p1, p0, Lax/b4/c;->a:Lax/b4/c$a;

    return-void
.end method

.method private c()Landroid/graphics/Rect;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->j:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/b4/c;->j:Landroid/graphics/Rect;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/b4/c;->j:Landroid/graphics/Rect;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private g()Landroid/graphics/Paint;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b4/c;->i:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/b4/c;->i:Landroid/graphics/Paint;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/b4/c;->i:Landroid/graphics/Paint;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private j()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/b4/c;->f:I

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

.method private m()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/b4/c;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const-string v2, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."

    .line 6
    .line 7
    invoke-static {v0, v2}, Lax/k4/h;->a(ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 11
    .line 12
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/b4/g;->f()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v0, v1, :cond_17

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    iget-boolean v0, p0, Lax/b4/c;->b:Z

    .line 25
    .line 26
    if-nez v0, :cond_27

    .line 27
    .line 28
    iput-boolean v1, p0, Lax/b4/c;->b:Z

    .line 29
    .line 30
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 31
    .line 32
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Lax/b4/g;->s(Lax/b4/g$b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 38
    .line 39
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
.end method

.method private n()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/b4/c;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 5
    .line 6
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lax/b4/g;->t(Lax/b4/g$b;)V

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


# virtual methods
.method public a()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_d

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/b4/c;->stop()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/b4/c;->f()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lax/b4/c;->e()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    if-ne v0, v1, :cond_22

    .line 28
    .line 29
    iget v0, p0, Lax/b4/c;->f:I

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    iput v0, p0, Lax/b4/c;->f:I

    .line 34
    .line 35
    :cond_22
    iget v0, p0, Lax/b4/c;->g:I

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    if-eq v0, v1, :cond_2e

    .line 39
    .line 40
    iget v1, p0, Lax/b4/c;->f:I

    .line 41
    .line 42
    if-lt v1, v0, :cond_2e

    .line 43
    .line 44
    invoke-virtual {p0}, Lax/b4/c;->stop()V

    .line 45
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

.method public b()Ljava/nio/ByteBuffer;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->b()Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public d()Landroid/graphics/Bitmap;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->e()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/b4/c;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-boolean v0, p0, Lax/b4/c;->h:Z

    .line 7
    .line 8
    if-eqz v0, :cond_21

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/b4/c;->getIntrinsicWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lax/b4/c;->getIntrinsicHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {p0}, Lax/b4/c;->c()Landroid/graphics/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/16 v4, 0x77

    .line 27
    .line 28
    invoke-static {v4, v0, v1, v2, v3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lax/b4/c;->h:Z

    .line 33
    .line 34
    :cond_21
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 35
    .line 36
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/b4/g;->c()Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p0}, Lax/b4/c;->c()Landroid/graphics/Rect;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p0}, Lax/b4/c;->g()Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

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
.end method

.method public e()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public f()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

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

.method public getIntrinsicHeight()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public getIntrinsicWidth()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public getOpacity()I
    .registers 2

    .line 1
    const/4 v0, -0x2

    .line 2
    return v0
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

.method public h()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/g;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/b4/c;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 5
    .line 6
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/b4/g;->a()V

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

.method public isRunning()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/b4/c;->b:Z

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

.method public k(Lax/M3/m;Landroid/graphics/Bitmap;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/b4/c$a;->b:Lax/b4/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lax/b4/g;->p(Lax/M3/m;Landroid/graphics/Bitmap;)V

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

.method public l(I)V
    .registers 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-gtz p1, :cond_10

    .line 3
    .line 4
    if-eq p1, v0, :cond_10

    .line 5
    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    goto :goto_10

    .line 9
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_10
    :goto_10
    if-nez p1, :cond_21

    .line 18
    .line 19
    iget-object p1, p0, Lax/b4/c;->a:Lax/b4/c$a;

    .line 20
    .line 21
    iget-object p1, p1, Lax/b4/c$a;->b:Lax/b4/g;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/b4/g;->i()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1d

    .line 28
    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    move v0, p1

    .line 31
    :goto_1e
    iput v0, p0, Lax/b4/c;->g:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    iput p1, p0, Lax/b4/c;->g:I

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

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lax/b4/c;->h:Z

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
.end method

.method public setAlpha(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/b4/c;->g()Landroid/graphics/Paint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

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

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/b4/c;->g()Landroid/graphics/Paint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

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

.method public setVisible(ZZ)Z
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/b4/c;->d:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const-string v1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility."

    .line 6
    .line 7
    invoke-static {v0, v1}, Lax/k4/h;->a(ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, Lax/b4/c;->e:Z

    .line 11
    .line 12
    if-nez p1, :cond_11

    .line 13
    .line 14
    invoke-direct {p0}, Lax/b4/c;->n()V

    .line 15
    .line 16
    .line 17
    goto :goto_18

    .line 18
    :cond_11
    iget-boolean v0, p0, Lax/b4/c;->c:Z

    .line 19
    .line 20
    if-eqz v0, :cond_18

    .line 21
    .line 22
    invoke-direct {p0}, Lax/b4/c;->m()V

    .line 23
    .line 24
    .line 25
    :cond_18
    :goto_18
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
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

.method public start()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/b4/c;->c:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/b4/c;->j()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lax/b4/c;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    invoke-direct {p0}, Lax/b4/c;->m()V

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

.method public stop()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/b4/c;->c:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/b4/c;->n()V

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
.end method
