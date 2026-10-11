.class public Landroidx/constraintlayout/widget/f;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/f$a;
    }
.end annotation


# instance fields
.field a:Landroidx/constraintlayout/widget/e;


# virtual methods
.method protected a()Landroidx/constraintlayout/widget/f$a;
    .registers 3

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/f$a;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/f$a;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
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

.method public b(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/f$a;
    .registers 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/f$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/f$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/f;->a()Landroidx/constraintlayout/widget/f$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/f;->b(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/f$a;

    move-result-object p1

    return-object p1
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getConstraintSet()Landroidx/constraintlayout/widget/e;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/f;->a:Landroidx/constraintlayout/widget/e;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Landroidx/constraintlayout/widget/e;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/constraintlayout/widget/e;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/widget/f;->a:Landroidx/constraintlayout/widget/e;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/constraintlayout/widget/f;->a:Landroidx/constraintlayout/widget/e;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/e;->g(Landroidx/constraintlayout/widget/f;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/widget/f;->a:Landroidx/constraintlayout/widget/e;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    return-void
.end method
