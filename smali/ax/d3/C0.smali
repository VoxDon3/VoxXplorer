.class public Lax/d3/C0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lax/n/c;

.field private b:Landroid/view/View;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Landroid/content/res/Configuration;

.field private g:Landroid/graphics/Point;

.field private h:I

.field private i:I

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/d3/Z;",
            ">;"
        }
    .end annotation
.end field

.field private k:Z

.field l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public constructor <init>(Lax/n/c;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/d3/C0;->g:Landroid/graphics/Point;

    .line 10
    .line 11
    new-instance v0, Lax/d3/C0$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/d3/C0$a;-><init>(Lax/d3/C0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/d3/C0;->l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 17
    .line 18
    iput-object p1, p0, Lax/d3/C0;->a:Lax/n/c;

    .line 19
    .line 20
    const v0, 0x1020002

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lax/d3/C0;->b:Landroid/view/View;

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

.method static synthetic a(Lax/d3/C0;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/C0;->e:Z

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

.method static synthetic b(Lax/d3/C0;)Lax/n/c;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/C0;->a:Lax/n/c;

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

.method static synthetic c(Lax/d3/C0;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/C0;->b:Landroid/view/View;

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

.method static synthetic d(Lax/d3/C0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/C0;->c:Z

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

.method static synthetic e(Lax/d3/C0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/C0;->d:Z

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

.method static synthetic f(Lax/d3/C0;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/C0;->d:Z

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

.method static synthetic g(Lax/d3/C0;)Landroid/content/res/Configuration;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/C0;->f:Landroid/content/res/Configuration;

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

.method static synthetic h(Lax/d3/C0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/C0;->f:Landroid/content/res/Configuration;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic i(Lax/d3/C0;Landroid/view/View;Landroid/content/res/Configuration;)Z
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/C0;->y(Landroid/view/View;Landroid/content/res/Configuration;)Z

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

.method static synthetic j(Lax/d3/C0;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/C0;->k:Z

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

.method static synthetic k(Lax/d3/C0;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/C0;->k:Z

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

.method static synthetic l(Lax/d3/C0;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/C0;->p()V

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
.end method

.method private p()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/C0;->a:Lax/n/c;

    .line 2
    .line 3
    instance-of v1, v0, Lax/d3/Z;

    .line 4
    .line 5
    if-eqz v1, :cond_f

    .line 6
    .line 7
    check-cast v0, Lax/d3/Z;

    .line 8
    .line 9
    iget v1, p0, Lax/d3/C0;->h:I

    .line 10
    .line 11
    iget v2, p0, Lax/d3/C0;->i:I

    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lax/d3/Z;->t(II)V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget v0, p0, Lax/d3/C0;->h:I

    .line 17
    .line 18
    iget v1, p0, Lax/d3/C0;->i:I

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, Lax/d3/C0;->q(II)V

    .line 21
    .line 22
    .line 23
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

.method private q(II)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/d3/C0;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_2f

    .line 6
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :cond_a
    :goto_a
    if-ge v2, v1, :cond_2f

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    check-cast v3, Lax/d3/Z;

    .line 20
    .line 21
    instance-of v4, v3, Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    if-eqz v4, :cond_2b

    .line 24
    .line 25
    move-object v4, v3

    .line 26
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-eqz v5, :cond_a

    .line 33
    .line 34
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->R0()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_a

    .line 39
    .line 40
    invoke-interface {v3, p1, p2}, Lax/d3/Z;->t(II)V

    .line 41
    .line 42
    .line 43
    goto :goto_a

    .line 44
    :cond_2b
    invoke-interface {v3, p1, p2}, Lax/d3/Z;->t(II)V

    .line 45
    .line 46
    .line 47
    goto :goto_a

    .line 48
    :cond_2f
    :goto_2f
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

.method public static r(Landroid/content/Context;)Landroid/graphics/Point;
    .registers 3

    .line 1
    invoke-static {p0}, Lax/d3/C0;->s(Landroid/content/Context;)Landroid/graphics/Point;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "window"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/WindowManager;

    .line 12
    .line 13
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 23
    .line 24
    .line 25
    iget p0, v0, Landroid/graphics/Point;->x:I

    .line 26
    .line 27
    int-to-float p0, p0

    .line 28
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 29
    .line 30
    div-float/2addr p0, v1

    .line 31
    float-to-int p0, p0

    .line 32
    iput p0, v0, Landroid/graphics/Point;->x:I

    .line 33
    .line 34
    iget p0, v0, Landroid/graphics/Point;->y:I

    .line 35
    .line 36
    int-to-float p0, p0

    .line 37
    div-float/2addr p0, v1

    .line 38
    float-to-int p0, p0

    .line 39
    iput p0, v0, Landroid/graphics/Point;->y:I

    .line 40
    .line 41
    return-object v0
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

.method public static s(Landroid/content/Context;)Landroid/graphics/Point;
    .registers 5

    .line 1
    invoke-static {}, Lax/X2/Q;->E0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "window"

    .line 6
    .line 7
    if-eqz v0, :cond_49

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/view/WindowManager;

    .line 14
    .line 15
    invoke-static {p0}, Lax/d3/y0;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lax/d3/z0;->a(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Lax/c0/Y0;->a()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {}, Lax/c0/d1;->a()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    or-int/2addr v1, v2

    .line 32
    invoke-static {v0, v1}, Lax/d3/A0;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lax/u/o;->a(Landroid/graphics/Insets;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v0}, Lax/u/m;->a(Landroid/graphics/Insets;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v1, v2

    .line 45
    invoke-static {v0}, Lax/u/n;->a(Landroid/graphics/Insets;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-static {v0}, Lax/u/p;->a(Landroid/graphics/Insets;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/2addr v2, v0

    .line 54
    invoke-static {p0}, Lax/d3/B0;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, Landroid/graphics/Point;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    sub-int/2addr v3, v1

    .line 65
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    sub-int/2addr p0, v2

    .line 70
    invoke-direct {v0, v3, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_49
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Landroid/view/WindowManager;

    .line 79
    .line 80
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 85
    .line 86
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Landroid/graphics/Point;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget v2, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 103
    .line 104
    int-to-float v2, v2

    .line 105
    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    .line 106
    .line 107
    mul-float v2, v2, v3

    .line 108
    .line 109
    float-to-int v2, v2

    .line 110
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget p0, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 119
    .line 120
    int-to-float p0, p0

    .line 121
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 122
    .line 123
    mul-float p0, p0, v1

    .line 124
    .line 125
    float-to-int p0, p0

    .line 126
    invoke-direct {v0, v2, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 127
    .line 128
    .line 129
    return-object v0
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

.method private w(Lax/d3/Z;)V
    .registers 4

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lax/d3/C0;->k:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lax/d3/C0;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_12

    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/C0;->b:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lax/d3/C0;->l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lax/d3/C0;->b:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lax/d3/C0;->l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    iput-boolean p1, p0, Lax/d3/C0;->e:Z

    .line 31
    .line 32
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
.end method

.method private y(Landroid/view/View;Landroid/content/res/Configuration;)Z
    .registers 8

    .line 1
    if-nez p2, :cond_c

    .line 2
    .line 3
    iget-object p2, p0, Lax/d3/C0;->a:Lax/n/c;

    .line 4
    .line 5
    invoke-virtual {p2}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_c
    invoke-static {}, Lax/X2/Q;->Z()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_40

    .line 19
    .line 20
    invoke-static {p1}, Lax/c0/d0;->G(Landroid/view/View;)Lax/c0/F0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_1f

    .line 25
    .line 26
    const-string p1, "window insets null?"

    .line 27
    .line 28
    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    invoke-static {p1}, Lax/u3/z;->m(Lax/c0/F0;)Lax/T/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget v0, p2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 37
    .line 38
    iget-object v2, p0, Lax/d3/C0;->a:Lax/n/c;

    .line 39
    .line 40
    iget v3, p1, Lax/T/b;->a:I

    .line 41
    .line 42
    iget v4, p1, Lax/T/b;->c:I

    .line 43
    .line 44
    add-int/2addr v3, v4

    .line 45
    invoke-static {v2, v3}, Lax/u3/B;->f(Landroid/content/Context;I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    sub-int/2addr v0, v2

    .line 50
    iget p2, p2, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 51
    .line 52
    iget-object v2, p0, Lax/d3/C0;->a:Lax/n/c;

    .line 53
    .line 54
    iget v3, p1, Lax/T/b;->b:I

    .line 55
    .line 56
    iget p1, p1, Lax/T/b;->d:I

    .line 57
    .line 58
    add-int/2addr v3, p1

    .line 59
    invoke-static {v2, v3}, Lax/u3/B;->f(Landroid/content/Context;I)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    sub-int/2addr p2, p1

    .line 64
    goto :goto_45

    .line 65
    :cond_40
    iget p1, p2, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 66
    .line 67
    iget v0, p2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 68
    .line 69
    move p2, p1

    .line 70
    :goto_45
    iget-boolean p1, p0, Lax/d3/C0;->c:Z

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    if-nez p1, :cond_4c

    .line 74
    .line 75
    iput-boolean v2, p0, Lax/d3/C0;->c:Z

    .line 76
    .line 77
    :cond_4c
    iget p1, p0, Lax/d3/C0;->h:I

    .line 78
    .line 79
    if-ne v0, p1, :cond_56

    .line 80
    .line 81
    iget p1, p0, Lax/d3/C0;->i:I

    .line 82
    .line 83
    if-eq p2, p1, :cond_55

    .line 84
    .line 85
    goto :goto_56

    .line 86
    :cond_55
    return v1

    .line 87
    :cond_56
    :goto_56
    iput v0, p0, Lax/d3/C0;->h:I

    .line 88
    .line 89
    iput p2, p0, Lax/d3/C0;->i:I

    .line 90
    .line 91
    return v2
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


# virtual methods
.method public m(Landroid/content/res/Configuration;)V
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/d3/C0;->d:Z

    .line 3
    .line 4
    iput-object p1, p0, Lax/d3/C0;->f:Landroid/content/res/Configuration;

    .line 5
    .line 6
    iget-boolean p1, p0, Lax/d3/C0;->e:Z

    .line 7
    .line 8
    if-eqz p1, :cond_14

    .line 9
    .line 10
    iget-object p1, p0, Lax/d3/C0;->b:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, Lax/d3/C0;->l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object p1, p0, Lax/d3/C0;->b:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, p0, Lax/d3/C0;->l:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    iput-boolean v0, p0, Lax/d3/C0;->e:Z

    .line 33
    .line 34
    return-void
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

.method public n(Lax/d3/Z;)V
    .registers 3

    .line 1
    if-nez p1, :cond_7

    .line 2
    .line 3
    const-string v0, "null?"

    .line 4
    .line 5
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lax/d3/C0;->j:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-nez v0, :cond_12

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/d3/C0;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lax/d3/C0;->j:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Lax/d3/C0;->w(Lax/d3/Z;)V

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

.method public o()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/d3/C0;->c:Z

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

.method public t(Landroid/content/Context;)Landroid/graphics/Point;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/C0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_15

    .line 6
    .line 7
    invoke-static {p1}, Lax/d3/C0;->r(Landroid/content/Context;)Landroid/graphics/Point;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 12
    .line 13
    iput v0, p0, Lax/d3/C0;->h:I

    .line 14
    .line 15
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 16
    .line 17
    iput p1, p0, Lax/d3/C0;->i:I

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lax/d3/C0;->c:Z

    .line 21
    .line 22
    :cond_15
    iget-object p1, p0, Lax/d3/C0;->g:Landroid/graphics/Point;

    .line 23
    .line 24
    iget v0, p0, Lax/d3/C0;->h:I

    .line 25
    .line 26
    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 27
    .line 28
    iget v0, p0, Lax/d3/C0;->i:I

    .line 29
    .line 30
    iput v0, p1, Landroid/graphics/Point;->y:I

    .line 31
    .line 32
    return-object p1
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

.method public u()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/d3/C0;->c:Z

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

.method public v(Landroid/content/res/Configuration;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/d3/C0;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lax/d3/C0;->m(Landroid/content/res/Configuration;)V

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
.end method

.method public x(Lax/d3/Z;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/C0;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

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
    .line 22
.end method
