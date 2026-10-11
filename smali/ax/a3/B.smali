.class public Lax/a3/B;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a3/B$b;
    }
.end annotation


# static fields
.field public static card:Z


# instance fields
.field private a:Lax/a3/B$b;

.field private b:Z

.field private c:Landroid/view/View;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/a3/B$b;)V
    .registers 4

    .line 1
    invoke-static {p2}, Lax/a3/B;->i(Lax/a3/B$b;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/a3/B;->a:Lax/a3/B$b;

    .line 9
    .line 10
    invoke-direct {p0, p2}, Lax/a3/B;->f(Lax/a3/B$b;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lax/a3/B;->b:Z

    .line 15
    .line 16
    return-void
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

.method static synthetic a(Lax/a3/B;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/a3/B;->d:I

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

.method static synthetic b(Lax/a3/B;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/a3/B;->d:I

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

.method static synthetic c(Lax/a3/B;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/a3/B;->e:I

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

.method static synthetic d(Lax/a3/B;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/a3/B;->e:I

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

.method private f(Lax/a3/B$b;)Z
    .registers 4

    .line 1
    sget-object v0, Lax/a3/B$b;->q:Lax/a3/B$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    sget-object v0, Lax/a3/B$b;->c0:Lax/a3/B$b;

    .line 8
    .line 9
    if-ne p1, v0, :cond_b

    .line 10
    .line 11
    return v1

    .line 12
    :cond_b
    sget-object p1, Lax/a3/B$b;->q:Lax/a3/B$b;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private g(IFI)I
    .registers 5

    .line 1
    int-to-float v0, p1

    .line 2
    div-float/2addr v0, p2

    .line 3
    float-to-int v0, v0

    .line 4
    if-gt v0, p3, :cond_6

    .line 5
    .line 6
    return p1

    .line 7
    :cond_6
    int-to-float p1, p3

    .line 8
    mul-float p1, p1, p2

    .line 9
    .line 10
    float-to-int p1, p1

    .line 11
    return p1
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

.method private h(IFII)I
    .registers 9

    .line 1
    int-to-float v0, p1

    .line 2
    div-float/2addr v0, p2

    .line 3
    float-to-int p2, v0

    .line 4
    if-gt p2, p3, :cond_8

    .line 5
    .line 6
    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 7
    .line 8
    goto :goto_18

    .line 9
    :cond_8
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 10
    .line 11
    if-lt p2, p4, :cond_e

    .line 12
    .line 13
    move-wide p2, v0

    .line 14
    goto :goto_18

    .line 15
    :cond_e
    sub-int p2, p4, p2

    .line 16
    .line 17
    int-to-double v2, p2

    .line 18
    sub-int/2addr p4, p3

    .line 19
    int-to-double p2, p4

    .line 20
    div-double/2addr v2, p2

    .line 21
    mul-double v2, v2, v0

    .line 22
    .line 23
    add-double p2, v2, v0

    .line 24
    .line 25
    :goto_18
    int-to-double v0, p1

    .line 26
    mul-double v0, v0, p2

    .line 27
    .line 28
    double-to-int p1, v0

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
.end method

.method private static i(Lax/a3/B$b;)I
    .registers 3

    .line 1
    sget-object v0, Lax/a3/B$b;->q:Lax/a3/B$b;

    .line 2
    .line 3
    if-ne p0, v0, :cond_8

    .line 4
    .line 5
    const p0, 0x7f140163

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_8
    sget-object v0, Lax/a3/B$b;->c0:Lax/a3/B$b;

    .line 10
    .line 11
    const v1, 0x7f140165

    .line 12
    .line 13
    .line 14
    if-ne p0, v0, :cond_10

    .line 15
    .line 16
    return v1

    .line 17
    :cond_10
    sget-object v0, Lax/a3/B$b;->d0:Lax/a3/B$b;

    .line 18
    .line 19
    if-ne p0, v0, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    const p0, 0x7f140164

    .line 23
    .line 24
    .line 25
    return p0
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

.method private j()V
    .registers 4

    .line 1
    const v0, 0x7f0a010b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/widget/FrameLayout;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lax/a3/B;->c:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lax/a3/B$a;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, Lax/a3/B$a;-><init>(Lax/a3/B;Landroid/widget/FrameLayout;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public static l(Landroid/app/Activity;)Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 15
    .line 16
    .line 17
    iget p0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 18
    .line 19
    int-to-float v1, p0

    .line 20
    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 21
    .line 22
    div-float/2addr v1, v2

    .line 23
    float-to-int v1, v1

    .line 24
    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 25
    .line 26
    int-to-float v4, v3

    .line 27
    div-float/2addr v4, v2

    .line 28
    float-to-int v2, v4

    .line 29
    int-to-float v3, v3

    .line 30
    iget v4, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 31
    .line 32
    div-float/2addr v3, v4

    .line 33
    int-to-float p0, p0

    .line 34
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 35
    .line 36
    div-float/2addr p0, v0

    .line 37
    const/16 v0, 0x1b8

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    if-gt v2, v0, :cond_32

    .line 41
    .line 42
    const/16 v0, 0x352

    .line 43
    .line 44
    if-gt v1, v0, :cond_32

    .line 45
    .line 46
    const/16 v0, 0x1e0

    .line 47
    .line 48
    if-lt v1, v0, :cond_32

    .line 49
    .line 50
    return v4

    .line 51
    :cond_32
    const v0, 0x4059999a    # 3.4f

    .line 52
    .line 53
    .line 54
    cmpg-float v0, v3, v0

    .line 55
    .line 56
    if-gez v0, :cond_46

    .line 57
    .line 58
    const/high16 v0, 0x40d00000    # 6.5f

    .line 59
    .line 60
    cmpg-float v0, p0, v0

    .line 61
    .line 62
    if-gez v0, :cond_46

    .line 63
    .line 64
    const/high16 v0, 0x40800000    # 4.0f

    .line 65
    .line 66
    cmpl-float p0, p0, v0

    .line 67
    .line 68
    if-ltz p0, :cond_46

    .line 69
    .line 70
    return v4

    .line 71
    :cond_46
    const/4 p0, 0x0

    .line 72
    return p0
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
.end method


# virtual methods
.method protected e()Landroid/view/View;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a3/B;->c:Landroid/view/View;

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

.method public k()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/a3/B;->b:Z

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

.method protected m(Landroid/content/Context;IILandroid/view/View;)V
    .registers 9

    .line 1
    invoke-static {p1}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x1e0

    .line 14
    .line 15
    const/16 v3, 0x320

    .line 16
    .line 17
    invoke-direct {p0, v0, p1, v2, v3}, Lax/a3/B;->h(IFII)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const/16 v0, 0x280

    .line 26
    .line 27
    invoke-direct {p0, v1, p1, v0}, Lax/a3/B;->g(IFI)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    iput p2, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 40
    .line 41
    iput p1, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 42
    .line 43
    invoke-virtual {p4, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    .line 45
    .line 46
    return-void
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
.end method

.method public n(Landroid/view/View;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/B;->c:Landroid/view/View;

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

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 6

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, Lax/a3/B;->b:Z

    sget-boolean v1, Lax/a3/B;->card:Z

    const/4 v0, 0x0

    sput-boolean v0, Lax/a3/B;->card:Z

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    if-eqz p1, :cond_34

    .line 12
    .line 13
    iget-object p1, p0, Lax/a3/B;->c:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz v1, :cond_30

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x12c

    invoke-static {v2, v3}, Lax/u3/B;->e(Landroid/content/Context;I)I

    move-result v2

    const/4 v3, -0x2

    invoke-virtual {p1, v2, v3}, Landroid/view/Window;->setLayout(II)V

    const/16 v2, 0x11

    invoke-virtual {p1, v2}, Landroid/view/Window;->setGravity(I)V

    return-void

    :cond_30
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_34
    iget-object p1, p0, Lax/a3/B;->a:Lax/a3/B$b;

    .line 27
    .line 28
    sget-object v1, Lax/a3/B$b;->d0:Lax/a3/B$b;

    .line 29
    .line 30
    if-ne p1, v1, :cond_4b

    .line 31
    .line 32
    const p1, 0x7f0d006c

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lax/a3/B;->j()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_4b
    sget-object v1, Lax/a3/B$b;->e0:Lax/a3/B$b;

    .line 50
    .line 51
    if-ne p1, v1, :cond_69

    .line 52
    .line 53
    const p1, 0x7f0d0070

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lax/a3/B;->j()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 v1, -0x2

    .line 67
    invoke-virtual {p1, v1, v0}, Landroid/view/Window;->setLayout(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/16 v0, 0x11

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 77
    .line 78
    .line 79
    :cond_69
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method
