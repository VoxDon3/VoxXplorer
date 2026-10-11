.class public Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "SourceFile"


# instance fields
.field private l0:I

.field private m0:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->U(Landroid/content/Context;)V

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


# virtual methods
.method U(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->l0:I

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

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_23

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq p1, v2, :cond_12

    .line 17
    .line 18
    goto :goto_22

    .line 19
    :cond_12
    iget p1, p0, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->m0:F

    .line 20
    .line 21
    sub-float/2addr v1, p1

    .line 22
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget v1, p0, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->l0:I

    .line 27
    .line 28
    int-to-float v1, v1

    .line 29
    cmpl-float p1, p1, v1

    .line 30
    .line 31
    if-lez p1, :cond_22

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_22
    :goto_22
    return v0

    .line 36
    :cond_23
    iput v1, p0, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->m0:F
    :try_end_25
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_25} :catch_26

    .line 37
    .line 38
    return v0

    .line 39
    :catch_26
    const/4 p1, 0x0

    .line 40
    return p1
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

.method protected onMeasure(II)V
    .registers 12

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_c

    invoke-super {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->onMeasure(II)V

    return-void

    :cond_c
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_20
    invoke-virtual {p0}, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->getChildCount()I

    move-result v4

    if-ge v3, v4, :cond_72

    invoke-virtual {p0, v3}, Lcom/voxdon/xplorer/widget/NoChildScrollViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_6f

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_6f

    instance-of v5, v4, Landroid/widget/AdapterView;

    if-eqz v5, :cond_4a

    check-cast v4, Landroid/widget/AdapterView;

    invoke-virtual {v4}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v5

    if-nez v5, :cond_41

    goto :goto_6f

    :cond_41
    invoke-interface {v5}, Landroid/widget/Adapter;->getCount()I

    move-result v5

    const/16 v6, 0x12c

    if-le v5, v6, :cond_4a

    goto :goto_6f

    :cond_4a
    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    const/16 v6, 0x1

    shl-int/lit8 v6, v6, 0x1f

    or-int/2addr v6, v0

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->measure(II)V

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    if-lt v6, v0, :cond_6b

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    if-gtz v7, :cond_6b

    if-ge v7, v0, :cond_6b

    move v6, v7

    :cond_6b
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_6f
    :goto_6f
    add-int/lit8 v3, v3, 0x1

    goto :goto_20

    :cond_72
    if-lez v2, :cond_77

    if-ge v2, v0, :cond_77

    move v0, v2

    :cond_77
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, p1, v0}, Landroidx/viewpager/widget/ViewPager;->onMeasure(II)V

    return-void
.end method
