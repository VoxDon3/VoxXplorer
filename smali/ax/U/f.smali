.class final Lax/U/f;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field a:I

.field b:Landroid/graphics/drawable/Drawable$ConstantState;

.field c:Landroid/content/res/ColorStateList;

.field d:Landroid/graphics/PorterDuff$Mode;


# direct methods
.method constructor <init>(Lax/U/f;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/U/f;->c:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    sget-object v0, Lax/U/d;->g:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iput-object v0, p0, Lax/U/f;->d:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    if-eqz p1, :cond_1c

    .line 12
    .line 13
    iget v0, p1, Lax/U/f;->a:I

    .line 14
    .line 15
    iput v0, p0, Lax/U/f;->a:I

    .line 16
    .line 17
    iget-object v0, p1, Lax/U/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 18
    .line 19
    iput-object v0, p0, Lax/U/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 20
    .line 21
    iget-object v0, p1, Lax/U/f;->c:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    iput-object v0, p0, Lax/U/f;->c:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    iget-object p1, p1, Lax/U/f;->d:Landroid/graphics/PorterDuff$Mode;

    .line 26
    .line 27
    iput-object p1, p0, Lax/U/f;->d:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    :cond_1c
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


# virtual methods
.method a()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

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

.method public getChangingConfigurations()I
    .registers 3

    .line 1
    iget v0, p0, Lax/U/f;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/U/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 4
    .line 5
    if-eqz v1, :cond_b

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v1, 0x0

    .line 13
    :goto_c
    or-int/2addr v0, v1

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

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lax/U/f;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 2
    new-instance v0, Lax/U/e;

    invoke-direct {v0, p0, p1}, Lax/U/e;-><init>(Lax/U/f;Landroid/content/res/Resources;)V

    return-object v0
.end method
