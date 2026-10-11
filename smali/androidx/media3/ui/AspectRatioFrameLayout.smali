.class public final Landroidx/media3/ui/AspectRatioFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/AspectRatioFrameLayout$b;,
        Landroidx/media3/ui/AspectRatioFrameLayout$c;
    }
.end annotation


# instance fields
.field private final a:Landroidx/media3/ui/AspectRatioFrameLayout$c;

.field private b:F

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I

    .line 6
    .line 7
    if-eqz p2, :cond_23

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v1, Lax/a2/F;->a:[I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :try_start_12
    sget p2, Lax/a2/F;->b:I

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1e

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    .line 29
    .line 30
    goto :goto_23

    .line 31
    :catchall_1e
    move-exception p2

    .line 32
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :cond_23
    :goto_23
    new-instance p1, Landroidx/media3/ui/AspectRatioFrameLayout$c;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-direct {p1, p0, p2}, Landroidx/media3/ui/AspectRatioFrameLayout$c;-><init>(Landroidx/media3/ui/AspectRatioFrameLayout;Landroidx/media3/ui/AspectRatioFrameLayout$a;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->a:Landroidx/media3/ui/AspectRatioFrameLayout$c;

    .line 43
    .line 44
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

.method static synthetic a(Landroidx/media3/ui/AspectRatioFrameLayout;)Landroidx/media3/ui/AspectRatioFrameLayout$b;
    .registers 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

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


# virtual methods
.method public getResizeMode()I
    .registers 2

    .line 1
    iget v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I

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

.method protected onMeasure(II)V
    .registers 11

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    cmpg-float p1, p1, p2

    .line 8
    .line 9
    if-gtz p1, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v1, p1

    .line 21
    int-to-float v2, v0

    .line 22
    div-float v3, v1, v2

    .line 23
    .line 24
    iget v4, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 25
    .line 26
    div-float/2addr v4, v3

    .line 27
    const/high16 v5, 0x3f800000    # 1.0f

    .line 28
    .line 29
    sub-float/2addr v4, v5

    .line 30
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const v6, 0x3c23d70a    # 0.01f

    .line 35
    .line 36
    .line 37
    cmpg-float v5, v5, v6

    .line 38
    .line 39
    if-gtz v5, :cond_31

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->a:Landroidx/media3/ui/AspectRatioFrameLayout$c;

    .line 42
    .line 43
    iget p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, p2, v3, v0}, Landroidx/media3/ui/AspectRatioFrameLayout$c;->a(FFZ)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    iget v5, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    if-eqz v5, :cond_54

    .line 54
    .line 55
    if-eq v5, v6, :cond_51

    .line 56
    .line 57
    const/4 v7, 0x2

    .line 58
    if-eq v5, v7, :cond_4e

    .line 59
    .line 60
    const/4 v7, 0x4

    .line 61
    if-eq v5, v7, :cond_3f

    .line 62
    .line 63
    goto :goto_5e

    .line 64
    :cond_3f
    cmpl-float p2, v4, p2

    .line 65
    .line 66
    if-lez p2, :cond_49

    .line 67
    .line 68
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 69
    .line 70
    :goto_45
    mul-float v2, v2, p1

    .line 71
    .line 72
    float-to-int p1, v2

    .line 73
    goto :goto_5e

    .line 74
    :cond_49
    iget p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 75
    .line 76
    :goto_4b
    div-float/2addr v1, p2

    .line 77
    float-to-int v0, v1

    .line 78
    goto :goto_5e

    .line 79
    :cond_4e
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 80
    .line 81
    goto :goto_45

    .line 82
    :cond_51
    iget p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 83
    .line 84
    goto :goto_4b

    .line 85
    :cond_54
    cmpl-float p2, v4, p2

    .line 86
    .line 87
    if-lez p2, :cond_5b

    .line 88
    .line 89
    iget p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 90
    .line 91
    goto :goto_4b

    .line 92
    :cond_5b
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 93
    .line 94
    goto :goto_45

    .line 95
    :goto_5e
    iget-object p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->a:Landroidx/media3/ui/AspectRatioFrameLayout$c;

    .line 96
    .line 97
    iget v1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 98
    .line 99
    invoke-virtual {p2, v1, v3, v6}, Landroidx/media3/ui/AspectRatioFrameLayout$c;->a(FFZ)V

    .line 100
    .line 101
    .line 102
    const/high16 p2, 0x40000000    # 2.0f

    .line 103
    .line 104
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 113
    .line 114
    .line 115
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
.end method

.method public setAspectRatio(F)V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iput p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->b:F

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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

.method public setAspectRatioListener(Landroidx/media3/ui/AspectRatioFrameLayout$b;)V
    .registers 2

    return-void
.end method

.method public setResizeMode(I)V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_9

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_9
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
    .line 22
.end method
