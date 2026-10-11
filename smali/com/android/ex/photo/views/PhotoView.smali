.class public Lcom/android/ex/photo/views/PhotoView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Landroid/view/GestureDetector$OnDoubleTapListener;
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/ex/photo/views/PhotoView$e;,
        Lcom/android/ex/photo/views/PhotoView$c;,
        Lcom/android/ex/photo/views/PhotoView$d;,
        Lcom/android/ex/photo/views/PhotoView$b;,
        Lcom/android/ex/photo/views/PhotoView$a;
    }
.end annotation


# static fields
.field private static K:I

.field private static L:Z

.field private static M:I

.field private static N:Landroid/graphics/Bitmap;

.field private static O:Landroid/graphics/Bitmap;

.field private static P:Landroid/graphics/Paint;

.field private static Q:Landroid/graphics/Paint;


# instance fields
.field private A:Lcom/android/ex/photo/views/PhotoView$b;

.field private B:F

.field private C:Landroid/graphics/RectF;

.field private D:Landroid/graphics/RectF;

.field private E:Landroid/graphics/RectF;

.field private F:[F

.field private G:Z

.field private H:F

.field private I:F

.field private J:Z

.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/Matrix;

.field private c:Landroid/graphics/Matrix;

.field private d:Landroid/graphics/Matrix;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:[B

.field private i:Z

.field private j:Z

.field private k:Landroid/graphics/Rect;

.field private l:I

.field private m:F

.field private n:Lax/c0/s;

.field private o:Landroid/view/ScaleGestureDetector;

.field private p:Landroid/view/View$OnClickListener;

.field private q:Lcom/android/ex/photo/views/PhotoView$a;

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Lcom/android/ex/photo/views/PhotoView$c;

.field private w:F

.field private x:F

.field private y:Lcom/android/ex/photo/views/PhotoView$e;

.field private z:Lcom/android/ex/photo/views/PhotoView$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->d:Landroid/graphics/Matrix;

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->s:Z

    .line 30
    .line 31
    new-instance p1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 37
    .line 38
    new-instance p1, Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->D:Landroid/graphics/RectF;

    .line 44
    .line 45
    new-instance p1, Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 51
    .line 52
    const/16 p1, 0x9

    .line 53
    .line 54
    new-array p1, p1, [F

    .line 55
    .line 56
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 57
    .line 58
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->n()V

    .line 59
    .line 60
    .line 61
    return-void
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

.method static synthetic a(Lcom/android/ex/photo/views/PhotoView;FFF)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/ex/photo/views/PhotoView;->t(FFF)V

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

.method static synthetic b(Lcom/android/ex/photo/views/PhotoView;FF)I
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/ex/photo/views/PhotoView;->y(FF)I

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

.method static synthetic c(Lcom/android/ex/photo/views/PhotoView;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->x()V

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

.method static synthetic d(Lcom/android/ex/photo/views/PhotoView;FZ)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/ex/photo/views/PhotoView;->s(FZ)V

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

.method private getCropSize()I
    .registers 2

    .line 1
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->l:I

    .line 2
    .line 3
    if-lez v0, :cond_5

    .line 4
    .line 5
    return v0

    .line 6
    :cond_5
    sget v0, Lcom/android/ex/photo/views/PhotoView;->M:I

    .line 7
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

.method private getScale()F
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private h(Z)V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_5a

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView;->f:Z

    .line 6
    .line 7
    if-nez v1, :cond_9

    .line 8
    .line 9
    goto :goto_5a

    .line 10
    :cond_9
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    if-ltz v0, :cond_20

    .line 30
    .line 31
    if-ne v2, v0, :cond_25

    .line 32
    .line 33
    :cond_20
    if-ltz v1, :cond_27

    .line 34
    .line 35
    if-ne v3, v1, :cond_25

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    const/4 v2, 0x0

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    :goto_27
    const/4 v2, 0x1

    .line 41
    :goto_28
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    invoke-virtual {v3, v4, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 44
    .line 45
    .line 46
    if-nez p1, :cond_3e

    .line 47
    .line 48
    iget p1, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    cmpl-float p1, p1, v0

    .line 52
    .line 53
    if-nez p1, :cond_44

    .line 54
    .line 55
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    if-eqz p1, :cond_44

    .line 58
    .line 59
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->f:Z

    .line 60
    .line 61
    if-eqz p1, :cond_44

    .line 62
    .line 63
    :cond_3e
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->k()V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->l()V

    .line 67
    .line 68
    .line 69
    :cond_44
    if-nez v2, :cond_54

    .line 70
    .line 71
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_4f

    .line 78
    .line 79
    goto :goto_54

    .line 80
    :cond_4f
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 81
    .line 82
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 83
    .line 84
    goto :goto_57

    .line 85
    :cond_54
    :goto_54
    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 87
    .line 88
    :goto_57
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->i()V

    .line 89
    .line 90
    .line 91
    :cond_5a
    :goto_5a
    return-void
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

.method private i()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->q:Lcom/android/ex/photo/views/PhotoView$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/android/ex/photo/views/PhotoView$a;->a()V

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

.method private k()V
    .registers 10

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-boolean v2, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 14
    .line 15
    if-eqz v2, :cond_13

    .line 16
    .line 17
    sget v2, Lcom/android/ex/photo/views/PhotoView;->M:I

    .line 18
    .line 19
    goto :goto_17

    .line 20
    :cond_13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_17
    iget-boolean v3, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1e

    .line 27
    .line 28
    sget v3, Lcom/android/ex/photo/views/PhotoView;->M:I

    .line 29
    .line 30
    goto :goto_22

    .line 31
    :cond_1e
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :goto_22
    if-ltz v0, :cond_26

    .line 36
    .line 37
    if-ne v2, v0, :cond_34

    .line 38
    .line 39
    :cond_26
    if-ltz v1, :cond_2a

    .line 40
    .line 41
    if-ne v3, v1, :cond_34

    .line 42
    .line 43
    :cond_2a
    iget-boolean v4, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 44
    .line 45
    if-nez v4, :cond_34

    .line 46
    .line 47
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 50
    .line 51
    .line 52
    goto :goto_8d

    .line 53
    :cond_34
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 54
    .line 55
    int-to-float v0, v0

    .line 56
    int-to-float v1, v1

    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-virtual {v4, v5, v5, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 59
    .line 60
    .line 61
    iget-boolean v4, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 62
    .line 63
    if-eqz v4, :cond_48

    .line 64
    .line 65
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->D:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget-object v5, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    goto :goto_4f

    .line 73
    :cond_48
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->D:Landroid/graphics/RectF;

    .line 74
    .line 75
    int-to-float v6, v2

    .line 76
    int-to-float v7, v3

    .line 77
    invoke-virtual {v4, v5, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 78
    .line 79
    .line 80
    :goto_4f
    new-instance v4, Landroid/graphics/RectF;

    .line 81
    .line 82
    div-int/lit8 v2, v2, 0x2

    .line 83
    .line 84
    int-to-float v2, v2

    .line 85
    iget v5, p0, Lcom/android/ex/photo/views/PhotoView;->m:F

    .line 86
    .line 87
    mul-float v6, v0, v5

    .line 88
    .line 89
    const/high16 v7, 0x40000000    # 2.0f

    .line 90
    .line 91
    div-float/2addr v6, v7

    .line 92
    sub-float v6, v2, v6

    .line 93
    .line 94
    div-int/lit8 v3, v3, 0x2

    .line 95
    .line 96
    int-to-float v3, v3

    .line 97
    mul-float v8, v1, v5

    .line 98
    .line 99
    div-float/2addr v8, v7

    .line 100
    sub-float v8, v3, v8

    .line 101
    .line 102
    mul-float v0, v0, v5

    .line 103
    .line 104
    div-float/2addr v0, v7

    .line 105
    add-float/2addr v2, v0

    .line 106
    mul-float v1, v1, v5

    .line 107
    .line 108
    div-float/2addr v1, v7

    .line 109
    add-float/2addr v3, v1

    .line 110
    invoke-direct {v4, v6, v8, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->D:Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-virtual {v0, v4}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_82

    .line 120
    .line 121
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 124
    .line 125
    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 126
    .line 127
    invoke-virtual {v0, v1, v4, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_8d

    .line 131
    :cond_82
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 132
    .line 133
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 134
    .line 135
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->D:Landroid/graphics/RectF;

    .line 136
    .line 137
    sget-object v3, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 140
    .line 141
    .line 142
    :goto_8d
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->d:Landroid/graphics/Matrix;

    .line 143
    .line 144
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 147
    .line 148
    .line 149
    return-void
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
.end method

.method private l()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-boolean v2, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 14
    .line 15
    if-eqz v2, :cond_15

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getCropSize()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_19

    .line 22
    :cond_15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_19
    iget-boolean v3, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 27
    .line 28
    if-eqz v3, :cond_22

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getCropSize()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_26

    .line 35
    :cond_22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_26
    if-ge v0, v2, :cond_33

    .line 40
    .line 41
    if-ge v1, v3, :cond_33

    .line 42
    .line 43
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 44
    .line 45
    if-nez v0, :cond_33

    .line 46
    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 50
    .line 51
    goto :goto_39

    .line 52
    :cond_33
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 57
    .line 58
    :goto_39
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 59
    .line 60
    const/high16 v1, 0x40800000    # 4.0f

    .line 61
    .line 62
    mul-float v0, v0, v1

    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 69
    .line 70
    return-void
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
.end method

.method private m(Landroid/graphics/Matrix;)F
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    aget v0, p1, v0

    .line 10
    .line 11
    float-to-double v0, v0

    .line 12
    const/4 v2, 0x3

    .line 13
    aget p1, p1, v2

    .line 14
    .line 15
    float-to-double v2, p1

    .line 16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    double-to-float p1, v0

    .line 21
    return p1
    .line 22
.end method

.method private n()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-boolean v1, Lcom/android/ex/photo/views/PhotoView;->L:Z

    .line 6
    .line 7
    if-nez v1, :cond_6a

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sput-boolean v1, Lcom/android/ex/photo/views/PhotoView;->L:Z

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget v3, Lcom/android/ex/photo/i;->b:I

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    sput v3, Lcom/android/ex/photo/views/PhotoView;->M:I

    .line 27
    .line 28
    new-instance v3, Landroid/graphics/Paint;

    .line 29
    .line 30
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v3, Lcom/android/ex/photo/views/PhotoView;->P:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    sget-object v3, Lcom/android/ex/photo/views/PhotoView;->P:Landroid/graphics/Paint;

    .line 39
    .line 40
    sget v4, Lcom/android/ex/photo/h;->a:I

    .line 41
    .line 42
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    .line 48
    .line 49
    sget-object v3, Lcom/android/ex/photo/views/PhotoView;->P:Landroid/graphics/Paint;

    .line 50
    .line 51
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v3, Lcom/android/ex/photo/views/PhotoView;->Q:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lcom/android/ex/photo/views/PhotoView;->Q:Landroid/graphics/Paint;

    .line 67
    .line 68
    sget v3, Lcom/android/ex/photo/h;->b:I

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lcom/android/ex/photo/views/PhotoView;->Q:Landroid/graphics/Paint;

    .line 78
    .line 79
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Lcom/android/ex/photo/views/PhotoView;->Q:Landroid/graphics/Paint;

    .line 85
    .line 86
    sget v3, Lcom/android/ex/photo/i;->a:I

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    mul-int v1, v1, v1

    .line 104
    .line 105
    sput v1, Lcom/android/ex/photo/views/PhotoView;->K:I

    .line 106
    .line 107
    :cond_6a
    new-instance v1, Lax/c0/s;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-direct {v1, v0, p0, v2}, Lax/c0/s;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    .line 111
    .line 112
    .line 113
    iput-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->n:Lax/c0/s;

    .line 114
    .line 115
    new-instance v1, Landroid/view/ScaleGestureDetector;

    .line 116
    .line 117
    invoke-direct {v1, v0, p0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->o:Landroid/view/ScaleGestureDetector;

    .line 121
    .line 122
    invoke-static {v1}, Lax/c0/N;->a(Landroid/view/ScaleGestureDetector;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->J:Z

    .line 127
    .line 128
    new-instance v0, Lcom/android/ex/photo/views/PhotoView$c;

    .line 129
    .line 130
    invoke-direct {v0, p0}, Lcom/android/ex/photo/views/PhotoView$c;-><init>(Lcom/android/ex/photo/views/PhotoView;)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 134
    .line 135
    new-instance v0, Lcom/android/ex/photo/views/PhotoView$e;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lcom/android/ex/photo/views/PhotoView$e;-><init>(Lcom/android/ex/photo/views/PhotoView;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 141
    .line 142
    new-instance v0, Lcom/android/ex/photo/views/PhotoView$d;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Lcom/android/ex/photo/views/PhotoView$d;-><init>(Lcom/android/ex/photo/views/PhotoView;)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->z:Lcom/android/ex/photo/views/PhotoView$d;

    .line 148
    .line 149
    new-instance v0, Lcom/android/ex/photo/views/PhotoView$b;

    .line 150
    .line 151
    invoke-direct {v0, p0}, Lcom/android/ex/photo/views/PhotoView$b;-><init>(Lcom/android/ex/photo/views/PhotoView;)V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->A:Lcom/android/ex/photo/views/PhotoView$b;

    .line 155
    .line 156
    return-void
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
.end method

.method private s(FZ)V
    .registers 5

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    iget-object p2, p0, Lcom/android/ex/photo/views/PhotoView;->A:Lcom/android/ex/photo/views/PhotoView$b;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lcom/android/ex/photo/views/PhotoView$b;->a(F)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget p2, p0, Lcom/android/ex/photo/views/PhotoView;->B:F

    .line 10
    .line 11
    add-float/2addr p2, p1

    .line 12
    iput p2, p0, Lcom/android/ex/photo/views/PhotoView;->B:F

    .line 13
    .line 14
    iget-object p2, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    div-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    int-to-float v0, v0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    invoke-virtual {p2, p1, v0, v1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private t(FFF)V
    .registers 8

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView;->B:F

    .line 4
    .line 5
    neg-float v1, v1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    int-to-float v2, v2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    div-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    int-to-float v3, v3

    .line 20
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 24
    .line 25
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 30
    .line 31
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 32
    .line 33
    mul-float v0, v0, v1

    .line 34
    .line 35
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    div-float/2addr p1, v0

    .line 44
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 50
    .line 51
    iget p2, p0, Lcom/android/ex/photo/views/PhotoView;->B:F

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    div-int/lit8 p3, p3, 0x2

    .line 58
    .line 59
    int-to-float p3, p3

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    div-int/lit8 v0, v0, 0x2

    .line 65
    .line 66
    int-to-float v0, v0

    .line 67
    invoke-virtual {p1, p2, p3, v0}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->i()V

    .line 74
    .line 75
    .line 76
    return-void
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

.method private u(Landroid/view/MotionEvent;)Z
    .registers 10

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->s:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_cd

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 7
    .line 8
    if-eqz v0, :cond_cd

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

    .line 11
    .line 12
    if-eqz v0, :cond_cd

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->t:Z

    .line 15
    .line 16
    if-nez v0, :cond_c9

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 23
    .line 24
    cmpl-float v3, v0, v2

    .line 25
    .line 26
    if-lez v3, :cond_44

    .line 27
    .line 28
    div-float p1, v2, v0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    div-int/lit8 v3, v3, 0x2

    .line 35
    .line 36
    int-to-float v3, v3

    .line 37
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    mul-float v4, v4, p1

    .line 44
    .line 45
    sub-float/2addr v3, v4

    .line 46
    const/high16 v4, 0x3f800000    # 1.0f

    .line 47
    .line 48
    sub-float/2addr v4, p1

    .line 49
    div-float/2addr v3, v4

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    div-int/lit8 v5, v5, 0x2

    .line 55
    .line 56
    int-to-float v5, v5

    .line 57
    iget-object v6, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 58
    .line 59
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    mul-float p1, p1, v6

    .line 64
    .line 65
    sub-float/2addr v5, p1

    .line 66
    div-float/2addr v5, v4

    .line 67
    goto/16 :goto_c2

    .line 68
    .line 69
    :cond_44
    const/high16 v3, 0x40000000    # 2.0f

    .line 70
    .line 71
    mul-float v4, v0, v3

    .line 72
    .line 73
    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget v4, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 78
    .line 79
    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    div-float v4, v2, v0

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    int-to-float v5, v5

    .line 90
    iget-object v6, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    sub-float/2addr v5, v6

    .line 97
    div-float/2addr v5, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    int-to-float v6, v6

    .line 103
    iget-object v7, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 104
    .line 105
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    sub-float/2addr v6, v7

    .line 110
    div-float/2addr v6, v4

    .line 111
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    mul-float v7, v5, v3

    .line 118
    .line 119
    cmpg-float v4, v4, v7

    .line 120
    .line 121
    if-gtz v4, :cond_81

    .line 122
    .line 123
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 124
    .line 125
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    goto :goto_97

    .line 130
    :cond_81
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 131
    .line 132
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 133
    .line 134
    add-float/2addr v4, v5

    .line 135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-static {v4, v7}, Ljava/lang/Math;->max(FF)F

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    iget-object v7, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 144
    .line 145
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 146
    .line 147
    sub-float/2addr v7, v5

    .line 148
    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    :goto_97
    iget-object v5, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 153
    .line 154
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    mul-float v3, v3, v6

    .line 159
    .line 160
    cmpg-float v3, v5, v3

    .line 161
    .line 162
    if-gtz v3, :cond_ab

    .line 163
    .line 164
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    :goto_a9
    move v3, v4

    .line 171
    goto :goto_c2

    .line 172
    :cond_ab
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 173
    .line 174
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 175
    .line 176
    add-float/2addr v3, v6

    .line 177
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 186
    .line 187
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 188
    .line 189
    sub-float/2addr v3, v6

    .line 190
    invoke-static {p1, v3}, Ljava/lang/Math;->min(FF)F

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    goto :goto_a9

    .line 195
    :goto_c2
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 196
    .line 197
    invoke-virtual {p1, v0, v2, v3, v5}, Lcom/android/ex/photo/views/PhotoView$c;->b(FFFF)Z

    .line 198
    .line 199
    .line 200
    const/4 p1, 0x1

    .line 201
    goto :goto_ca

    .line 202
    :cond_c9
    const/4 p1, 0x0

    .line 203
    :goto_ca
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView;->t:Z

    .line 204
    .line 205
    goto :goto_ce

    .line 206
    :cond_cd
    const/4 p1, 0x0

    .line 207
    :goto_ce
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

    .line 208
    .line 209
    return p1
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
.end method

.method private v(F)V
    .registers 10

    .line 1
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-lez v1, :cond_69

    .line 6
    .line 7
    div-float/2addr v0, p1

    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    sub-float v0, v1, v0

    .line 11
    .line 12
    div-float v0, v1, v0

    .line 13
    .line 14
    sub-float/2addr v1, v0

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    div-int/lit8 v2, v2, 0x2

    .line 20
    .line 21
    int-to-float v2, v2

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    div-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    int-to-float v3, v3

    .line 29
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 30
    .line 31
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 32
    .line 33
    mul-float v5, v5, v1

    .line 34
    .line 35
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 36
    .line 37
    mul-float v4, v4, v1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    int-to-float v6, v6

    .line 44
    mul-float v6, v6, v0

    .line 45
    .line 46
    iget-object v7, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 47
    .line 48
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 49
    .line 50
    mul-float v7, v7, v1

    .line 51
    .line 52
    add-float/2addr v6, v7

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    int-to-float v7, v7

    .line 58
    mul-float v7, v7, v0

    .line 59
    .line 60
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 61
    .line 62
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 63
    .line 64
    mul-float v0, v0, v1

    .line 65
    .line 66
    add-float/2addr v7, v0

    .line 67
    const/high16 v0, 0x40000000    # 2.0f

    .line 68
    .line 69
    cmpl-float v1, v6, v5

    .line 70
    .line 71
    if-lez v1, :cond_4b

    .line 72
    .line 73
    add-float/2addr v6, v5

    .line 74
    div-float/2addr v6, v0

    .line 75
    goto :goto_53

    .line 76
    :cond_4b
    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    :goto_53
    cmpl-float v1, v7, v4

    .line 85
    .line 86
    if-lez v1, :cond_5a

    .line 87
    .line 88
    add-float/2addr v7, v4

    .line 89
    div-float/2addr v7, v0

    .line 90
    goto :goto_62

    .line 91
    :cond_5a
    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    :goto_62
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 100
    .line 101
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 102
    .line 103
    invoke-virtual {v0, p1, v1, v6, v7}, Lcom/android/ex/photo/views/PhotoView$c;->b(FFFF)Z

    .line 104
    .line 105
    .line 106
    :cond_69
    return-void
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

.method private x()V
    .registers 10

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_19

    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 21
    .line 22
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    int-to-float v2, v2

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    const/4 v2, 0x0

    .line 27
    :goto_1a
    if-eqz v0, :cond_22

    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    :goto_20
    int-to-float v0, v0

    .line 34
    goto :goto_27

    .line 35
    :cond_22
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_20

    .line 40
    :goto_27
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 41
    .line 42
    iget v4, v3, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 45
    .line 46
    sub-float v5, v3, v4

    .line 47
    .line 48
    sub-float v6, v0, v2

    .line 49
    .line 50
    const/high16 v7, 0x40000000    # 2.0f

    .line 51
    .line 52
    cmpg-float v5, v5, v6

    .line 53
    .line 54
    if-gez v5, :cond_3c

    .line 55
    .line 56
    add-float/2addr v3, v4

    .line 57
    sub-float/2addr v6, v3

    .line 58
    div-float/2addr v6, v7

    .line 59
    add-float/2addr v2, v6

    .line 60
    goto :goto_4a

    .line 61
    :cond_3c
    cmpl-float v5, v4, v2

    .line 62
    .line 63
    if-lez v5, :cond_42

    .line 64
    .line 65
    sub-float/2addr v2, v4

    .line 66
    goto :goto_4a

    .line 67
    :cond_42
    cmpg-float v2, v3, v0

    .line 68
    .line 69
    if-gez v2, :cond_49

    .line 70
    .line 71
    sub-float v2, v0, v3

    .line 72
    .line 73
    goto :goto_4a

    .line 74
    :cond_49
    const/4 v2, 0x0

    .line 75
    :goto_4a
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 76
    .line 77
    if-eqz v0, :cond_54

    .line 78
    .line 79
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 80
    .line 81
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 82
    .line 83
    int-to-float v3, v3

    .line 84
    goto :goto_55

    .line 85
    :cond_54
    const/4 v3, 0x0

    .line 86
    :goto_55
    if-eqz v0, :cond_5d

    .line 87
    .line 88
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 91
    .line 92
    :goto_5b
    int-to-float v0, v0

    .line 93
    goto :goto_62

    .line 94
    :cond_5d
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    goto :goto_5b

    .line 99
    :goto_62
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 100
    .line 101
    iget v5, v4, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 104
    .line 105
    sub-float v6, v4, v5

    .line 106
    .line 107
    sub-float v8, v0, v3

    .line 108
    .line 109
    cmpg-float v6, v6, v8

    .line 110
    .line 111
    if-gez v6, :cond_76

    .line 112
    .line 113
    add-float/2addr v4, v5

    .line 114
    sub-float/2addr v8, v4

    .line 115
    div-float/2addr v8, v7

    .line 116
    add-float v1, v3, v8

    .line 117
    .line 118
    goto :goto_83

    .line 119
    :cond_76
    cmpl-float v6, v5, v3

    .line 120
    .line 121
    if-lez v6, :cond_7d

    .line 122
    .line 123
    sub-float v1, v3, v5

    .line 124
    .line 125
    goto :goto_83

    .line 126
    :cond_7d
    cmpg-float v3, v4, v0

    .line 127
    .line 128
    if-gez v3, :cond_83

    .line 129
    .line 130
    sub-float v1, v0, v4

    .line 131
    .line 132
    :cond_83
    :goto_83
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/high16 v3, 0x41a00000    # 20.0f

    .line 137
    .line 138
    cmpl-float v0, v0, v3

    .line 139
    .line 140
    if-gtz v0, :cond_9f

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    cmpl-float v0, v0, v3

    .line 147
    .line 148
    if-lez v0, :cond_96

    .line 149
    .line 150
    goto :goto_9f

    .line 151
    :cond_96
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 152
    .line 153
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_9f
    :goto_9f
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->z:Lcom/android/ex/photo/views/PhotoView$d;

    .line 161
    .line 162
    invoke-virtual {v0, v2, v1}, Lcom/android/ex/photo/views/PhotoView$d;->a(FF)Z

    .line 163
    .line 164
    .line 165
    return-void
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

.method private y(FF)I
    .registers 11

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_19

    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 21
    .line 22
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    int-to-float v2, v2

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    const/4 v2, 0x0

    .line 27
    :goto_1a
    if-eqz v0, :cond_22

    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    :goto_20
    int-to-float v0, v0

    .line 34
    goto :goto_27

    .line 35
    :cond_22
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_20

    .line 40
    :goto_27
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 41
    .line 42
    iget v4, v3, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 45
    .line 46
    iget-boolean v5, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 47
    .line 48
    const/high16 v6, 0x40000000    # 2.0f

    .line 49
    .line 50
    if-eqz v5, :cond_3e

    .line 51
    .line 52
    sub-float/2addr v2, v3

    .line 53
    sub-float/2addr v0, v4

    .line 54
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_56

    .line 63
    :cond_3e
    sub-float v5, v3, v4

    .line 64
    .line 65
    sub-float v7, v0, v2

    .line 66
    .line 67
    cmpg-float v5, v5, v7

    .line 68
    .line 69
    if-gez v5, :cond_4c

    .line 70
    .line 71
    add-float/2addr v3, v4

    .line 72
    sub-float/2addr v7, v3

    .line 73
    div-float/2addr v7, v6

    .line 74
    add-float v0, v2, v7

    .line 75
    .line 76
    goto :goto_56

    .line 77
    :cond_4c
    sub-float/2addr v0, v3

    .line 78
    sub-float/2addr v2, v4

    .line 79
    invoke-static {v2, p1}, Ljava/lang/Math;->min(FF)F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_56
    iget-boolean v2, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 88
    .line 89
    if-eqz v2, :cond_5f

    .line 90
    .line 91
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 92
    .line 93
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 94
    .line 95
    int-to-float v1, v1

    .line 96
    :cond_5f
    if-eqz v2, :cond_67

    .line 97
    .line 98
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 99
    .line 100
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 101
    .line 102
    :goto_65
    int-to-float v2, v2

    .line 103
    goto :goto_6c

    .line 104
    :cond_67
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    goto :goto_65

    .line 109
    :goto_6c
    iget-object v3, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 110
    .line 111
    iget v4, v3, Landroid/graphics/RectF;->top:F

    .line 112
    .line 113
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 114
    .line 115
    iget-boolean v5, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 116
    .line 117
    if-eqz v5, :cond_81

    .line 118
    .line 119
    sub-float/2addr v1, v3

    .line 120
    sub-float/2addr v2, v4

    .line 121
    invoke-static {v2, p2}, Ljava/lang/Math;->min(FF)F

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    goto :goto_98

    .line 130
    :cond_81
    sub-float v5, v3, v4

    .line 131
    .line 132
    sub-float v7, v2, v1

    .line 133
    .line 134
    cmpg-float v5, v5, v7

    .line 135
    .line 136
    if-gez v5, :cond_8e

    .line 137
    .line 138
    add-float/2addr v3, v4

    .line 139
    sub-float/2addr v7, v3

    .line 140
    div-float/2addr v7, v6

    .line 141
    add-float/2addr v1, v7

    .line 142
    goto :goto_98

    .line 143
    :cond_8e
    sub-float/2addr v2, v3

    .line 144
    sub-float/2addr v1, v4

    .line 145
    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    :goto_98
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 154
    .line 155
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 159
    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    const/4 v3, 0x1

    .line 163
    cmpl-float p1, v0, p1

    .line 164
    .line 165
    if-nez p1, :cond_a8

    .line 166
    .line 167
    const/4 p1, 0x1

    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    const/4 p1, 0x0

    .line 170
    :goto_a9
    cmpl-float p2, v1, p2

    .line 171
    .line 172
    if-nez p2, :cond_af

    .line 173
    .line 174
    const/4 p2, 0x1

    .line 175
    goto :goto_b0

    .line 176
    :cond_af
    const/4 p2, 0x0

    .line 177
    :goto_b0
    if-eqz p1, :cond_b6

    .line 178
    .line 179
    if-eqz p2, :cond_b6

    .line 180
    .line 181
    const/4 p1, 0x3

    .line 182
    return p1

    .line 183
    :cond_b6
    if-eqz p1, :cond_b9

    .line 184
    .line 185
    return v3

    .line 186
    :cond_b9
    if-eqz p2, :cond_bd

    .line 187
    .line 188
    const/4 p1, 0x2

    .line 189
    return p1

    .line 190
    :cond_bd
    return v2
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


# virtual methods
.method public e(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 1
    if-eqz p1, :cond_16

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-eq p1, v0, :cond_16

    .line 6
    .line 7
    if-eqz v0, :cond_c

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    :goto_17
    invoke-direct {p0, p1}, Lcom/android/ex/photo/views/PhotoView;->h(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public f(Landroid/graphics/Bitmap;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 4
    .line 5
    xor-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_38

    .line 8
    .line 9
    if-eqz v1, :cond_38

    .line 10
    .line 11
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-ne p1, v0, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    if-eqz p1, :cond_30

    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v0, v1, :cond_2d

    .line 33
    .line 34
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eq v0, v1, :cond_30

    .line 45
    .line 46
    :cond_2d
    const/4 v0, 0x1

    .line 47
    const/4 v2, 0x1

    .line 48
    goto :goto_32

    .line 49
    :cond_30
    const/4 v0, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_32
    const/4 v0, 0x0

    .line 52
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    :cond_38
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    if-nez v0, :cond_49

    .line 60
    .line 61
    if-eqz p1, :cond_49

    .line 62
    .line 63
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    :cond_49
    invoke-direct {p0, v2}, Lcom/android/ex/photo/views/PhotoView;->h(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 78
    .line 79
    .line 80
    return-void
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

.method public g()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->n:Lax/c0/s;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->o:Landroid/view/ScaleGestureDetector;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/android/ex/photo/views/PhotoView$c;->c()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/android/ex/photo/views/PhotoView$e;->c()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->z:Lcom/android/ex/photo/views/PhotoView$d;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/android/ex/photo/views/PhotoView$d;->b()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->z:Lcom/android/ex/photo/views/PhotoView$d;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->A:Lcom/android/ex/photo/views/PhotoView$b;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/android/ex/photo/views/PhotoView$b;->b()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->A:Lcom/android/ex/photo/views/PhotoView$b;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/android/ex/photo/views/PhotoView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->p:Landroid/view/View$OnClickListener;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->q:Lcom/android/ex/photo/views/PhotoView$a;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

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
.end method

.method public getCroppedPhoto()Landroid/graphics/Bitmap;
    .registers 7

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    const/16 v1, 0x100

    .line 10
    .line 11
    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/Canvas;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 21
    .line 22
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    sub-int/2addr v3, v2

    .line 27
    const/high16 v2, 0x43800000    # 256.0f

    .line 28
    .line 29
    int-to-float v3, v3

    .line 30
    div-float/2addr v2, v3

    .line 31
    new-instance v3, Landroid/graphics/Matrix;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 34
    .line 35
    invoke-direct {v3, v4}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 39
    .line 40
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    neg-int v5, v5

    .line 43
    int-to-float v5, v5

    .line 44
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    neg-int v4, v4

    .line 47
    int-to-float v4, v4

    .line 48
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    if-eqz v2, :cond_41

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 64
    .line 65
    .line 66
    :cond_41
    return-object v0
    .line 67
    .line 68
.end method

.method public getCurrentScale()F
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/ex/photo/views/PhotoView;->m(Landroid/graphics/Matrix;)F

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

.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

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

.method public getInitialScale()F
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->d:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/ex/photo/views/PhotoView;->m(Landroid/graphics/Matrix;)F

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

.method public getMinScale()F
    .registers 2

    .line 1
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

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

.method public getPhoto()Landroid/graphics/Bitmap;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    if-eqz v1, :cond_f

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getVideoData()[B
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->h:[B

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

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne v0, p1, :cond_8

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
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

.method public j(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    if-nez p1, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView;->r()V

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

.method public o(FF)Z
    .registers 7

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    return p2

    .line 7
    :cond_6
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/ex/photo/views/PhotoView$e;->a(Lcom/android/ex/photo/views/PhotoView$e;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_10

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    aget v1, v1, v2

    .line 47
    .line 48
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    sub-float/2addr v3, v2

    .line 55
    iget-boolean v2, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 56
    .line 57
    if-eqz v2, :cond_46

    .line 58
    .line 59
    cmpg-float p1, v3, p1

    .line 60
    .line 61
    if-gtz p1, :cond_3f

    .line 62
    .line 63
    goto :goto_46

    .line 64
    :cond_3f
    const/4 p1, 0x0

    .line 65
    cmpl-float p1, v1, p1

    .line 66
    .line 67
    if-nez p1, :cond_45

    .line 68
    .line 69
    return p2

    .line 70
    :cond_45
    return v0

    .line 71
    :cond_46
    :goto_46
    return p2
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

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->J:Z

    .line 5
    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/android/ex/photo/views/PhotoView;->u(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3b

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_32

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq v0, v2, :cond_e

    .line 13
    .line 14
    goto :goto_4b

    .line 15
    :cond_e
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->J:Z

    .line 16
    .line 17
    if-eqz v0, :cond_4b

    .line 18
    .line 19
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

    .line 20
    .line 21
    if-eqz v0, :cond_4b

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView;->H:F

    .line 28
    .line 29
    sub-float/2addr v0, v2

    .line 30
    float-to-int v0, v0

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView;->I:F

    .line 36
    .line 37
    sub-float/2addr p1, v2

    .line 38
    float-to-int p1, p1

    .line 39
    mul-int v0, v0, v0

    .line 40
    .line 41
    mul-int p1, p1, p1

    .line 42
    .line 43
    add-int/2addr v0, p1

    .line 44
    sget p1, Lcom/android/ex/photo/views/PhotoView;->K:I

    .line 45
    .line 46
    if-le v0, p1, :cond_4b

    .line 47
    .line 48
    iput-boolean v1, p0, Lcom/android/ex/photo/views/PhotoView;->G:Z

    .line 49
    .line 50
    return v1

    .line 51
    :cond_32
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->J:Z

    .line 52
    .line 53
    if-eqz v0, :cond_4b

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/android/ex/photo/views/PhotoView;->u(Landroid/view/MotionEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    :cond_3b
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->J:Z

    .line 61
    .line 62
    if-eqz v0, :cond_4b

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/android/ex/photo/views/PhotoView;->H:F

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView;->I:F

    .line 75
    .line 76
    :cond_4b
    :goto_4b
    return v1
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

.method public onDown(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_e

    .line 4
    .line 5
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/ex/photo/views/PhotoView$e;->c()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->z:Lcom/android/ex/photo/views/PhotoView$d;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/ex/photo/views/PhotoView$d;->b()V

    .line 13
    .line 14
    .line 15
    :cond_e
    const/4 p1, 0x1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 16

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_d2

    .line 7
    .line 8
    instance-of v1, v0, Lax/p/c;

    .line 9
    .line 10
    if-eqz v1, :cond_1f

    .line 11
    .line 12
    check-cast v0, Lax/p/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/p/c;->a()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 19
    .line 20
    if-eqz v1, :cond_1f

    .line 21
    .line 22
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1f

    .line 29
    .line 30
    goto/16 :goto_d2

    .line 31
    .line 32
    :cond_1f
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 40
    .line 41
    if-eqz v1, :cond_2d

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    const/16 v1, 0x14

    .line 47
    .line 48
    invoke-static {v1}, Lax/C3/e;->b(I)Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    if-eqz v1, :cond_52

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    int-to-float v5, v1

    .line 65
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    int-to-float v6, v1

    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    move-object v2, p1

    .line 79
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    goto :goto_53

    .line 83
    :cond_52
    move-object v2, p1

    .line 84
    :goto_53
    :try_start_53
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_58
    .catch Ljava/lang/RuntimeException; {:try_start_53 .. :try_end_58} :catch_59

    .line 87
    .line 88
    .line 89
    goto :goto_5a

    .line 90
    :catch_59
    nop

    .line 91
    :goto_5a
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->h:[B

    .line 95
    .line 96
    if-eqz p1, :cond_86

    .line 97
    .line 98
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->i:Z

    .line 99
    .line 100
    if-eqz p1, :cond_68

    .line 101
    .line 102
    sget-object p1, Lcom/android/ex/photo/views/PhotoView;->N:Landroid/graphics/Bitmap;

    .line 103
    .line 104
    goto :goto_6a

    .line 105
    :cond_68
    sget-object p1, Lcom/android/ex/photo/views/PhotoView;->O:Landroid/graphics/Bitmap;

    .line 106
    .line 107
    :goto_6a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sub-int/2addr v0, v1

    .line 116
    div-int/lit8 v0, v0, 0x2

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    sub-int/2addr v1, v3

    .line 127
    div-int/lit8 v1, v1, 0x2

    .line 128
    .line 129
    int-to-float v0, v0

    .line 130
    int-to-float v1, v1

    .line 131
    const/4 v3, 0x0

    .line 132
    invoke-virtual {v2, p1, v0, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 133
    .line 134
    .line 135
    :cond_86
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 136
    .line 137
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 147
    .line 148
    if-eqz p1, :cond_9a

    .line 149
    .line 150
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 153
    .line 154
    .line 155
    :cond_9a
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 156
    .line 157
    if-eqz p1, :cond_d2

    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    int-to-float v11, v0

    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    int-to-float v12, v0

    .line 173
    sget-object v13, Lcom/android/ex/photo/views/PhotoView;->P:Landroid/graphics/Paint;

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v10, 0x0

    .line 177
    move-object v8, v2

    .line 178
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 185
    .line 186
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->b:Landroid/graphics/Matrix;

    .line 190
    .line 191
    if-eqz v0, :cond_c3

    .line 192
    .line 193
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 194
    .line 195
    .line 196
    :cond_c3
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 202
    .line 203
    .line 204
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 205
    .line 206
    sget-object v0, Lcom/android/ex/photo/views/PhotoView;->Q:Landroid/graphics/Paint;

    .line 207
    .line 208
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 209
    .line 210
    .line 211
    :cond_d2
    :goto_d2
    return-void
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
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .registers 5

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_11

    .line 4
    .line 5
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/android/ex/photo/views/PhotoView$c;->a(Lcom/android/ex/photo/views/PhotoView$c;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_11

    .line 12
    .line 13
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, Lcom/android/ex/photo/views/PhotoView$e;->b(FF)Z

    .line 16
    .line 17
    .line 18
    :cond_11
    const/4 p1, 0x1

    .line 19
    return p1
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

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-eqz v0, :cond_55

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    if-eq v0, v1, :cond_11

    .line 16
    .line 17
    goto :goto_55

    .line 18
    :cond_11
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x9

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    const v3, 0x3e19999a    # 0.15f

    .line 30
    .line 31
    .line 32
    cmpg-float v1, v1, v2

    .line 33
    .line 34
    if-gez v1, :cond_3d

    .line 35
    .line 36
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView;->w:F

    .line 37
    .line 38
    cmpl-float v2, v0, v1

    .line 39
    .line 40
    if-lez v2, :cond_53

    .line 41
    .line 42
    sub-float/2addr v0, v3

    .line 43
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-direct {p0, v0, v1, p1}, Lcom/android/ex/photo/views/PhotoView;->t(FFF)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->x()V

    .line 59
    .line 60
    .line 61
    goto :goto_53

    .line 62
    :cond_3d
    iget v1, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 63
    .line 64
    cmpg-float v2, v0, v1

    .line 65
    .line 66
    if-gez v2, :cond_53

    .line 67
    .line 68
    add-float/2addr v0, v3

    .line 69
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-direct {p0, v0, v1, p1}, Lcom/android/ex/photo/views/PhotoView;->t(FFF)V

    .line 82
    .line 83
    .line 84
    :cond_53
    :goto_53
    const/4 p1, 0x1

    .line 85
    return p1

    .line 86
    :cond_55
    :goto_55
    invoke-super {p0, p1}, Landroid/view/View;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    return p1
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

.method protected onLayout(ZIIII)V
    .registers 8

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p1, Lcom/android/ex/photo/views/PhotoView;->f:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    iget-boolean p5, p1, Lcom/android/ex/photo/views/PhotoView;->j:Z

    .line 18
    .line 19
    if-eqz p5, :cond_2e

    .line 20
    .line 21
    sget p5, Lcom/android/ex/photo/views/PhotoView;->M:I

    .line 22
    .line 23
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p5, v0}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    iput p5, p1, Lcom/android/ex/photo/views/PhotoView;->l:I

    .line 32
    .line 33
    sub-int/2addr p3, p5

    .line 34
    div-int/lit8 p3, p3, 0x2

    .line 35
    .line 36
    sub-int/2addr p4, p5

    .line 37
    div-int/lit8 p4, p4, 0x2

    .line 38
    .line 39
    add-int v0, p3, p5

    .line 40
    .line 41
    add-int/2addr p5, p4

    .line 42
    iget-object v1, p1, Lcom/android/ex/photo/views/PhotoView;->k:Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-virtual {v1, p3, p4, v0, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    invoke-direct {p0, p2}, Lcom/android/ex/photo/views/PhotoView;->h(Z)V

    .line 48
    .line 49
    .line 50
    return-void
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
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .registers 2

    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    .line 1
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_18

    .line 5
    .line 6
    const/high16 p2, -0x80000000

    .line 7
    .line 8
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget p2, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

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
.end method

.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1c

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->u:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    mul-float v0, v0, v1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-direct {p0, v0, v1, p1}, Lcom/android/ex/photo/views/PhotoView;->t(FFF)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    const/4 p1, 0x1

    .line 30
    return p1
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

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .registers 3

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/ex/photo/views/PhotoView$c;->c()V

    .line 9
    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->u:Z

    .line 12
    .line 13
    :cond_c
    return v0
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

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->getScale()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->x:F

    .line 6
    .line 7
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_d

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/android/ex/photo/views/PhotoView;->v(F)V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1b

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->u:Z

    .line 19
    .line 20
    if-eqz p1, :cond_1b

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->t:Z

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/android/ex/photo/views/PhotoView;->r()V

    .line 26
    .line 27
    .line 28
    :cond_1b
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

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .registers 5

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_11

    .line 4
    .line 5
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->v:Lcom/android/ex/photo/views/PhotoView$c;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/android/ex/photo/views/PhotoView$c;->a(Lcom/android/ex/photo/views/PhotoView$c;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_11

    .line 12
    .line 13
    neg-float p1, p3

    .line 14
    neg-float p2, p4

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/android/ex/photo/views/PhotoView;->y(FF)I

    .line 16
    .line 17
    .line 18
    :cond_11
    const/4 p1, 0x1

    .line 19
    return p1
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

.method public onShowPress(Landroid/view/MotionEvent;)V
    .registers 2

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->p:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    if-eqz p1, :cond_b

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/android/ex/photo/views/PhotoView;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_b

    .line 8
    .line 9
    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->u:Z

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->o:Landroid/view/ScaleGestureDetector;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_27

    .line 5
    .line 6
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->n:Lax/c0/s;

    .line 7
    .line 8
    if-nez v2, :cond_a

    .line 9
    .line 10
    goto :goto_27

    .line 11
    :cond_a
    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->n:Lax/c0/s;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/c0/s;->a(Landroid/view/MotionEvent;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eq p1, v1, :cond_1c

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-eq p1, v0, :cond_1c

    .line 27
    .line 28
    goto :goto_27

    .line 29
    :cond_1c
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/android/ex/photo/views/PhotoView$e;->a(Lcom/android/ex/photo/views/PhotoView$e;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_27

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->x()V

    .line 38
    .line 39
    .line 40
    :cond_27
    :goto_27
    return v1
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

.method public p(FF)Z
    .registers 7

    .line 1
    iget-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    return p2

    .line 7
    :cond_6
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->y:Lcom/android/ex/photo/views/PhotoView$e;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/ex/photo/views/PhotoView$e;->a(Lcom/android/ex/photo/views/PhotoView$e;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_10

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->C:Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->F:[F

    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    aget v1, v1, v2

    .line 47
    .line 48
    iget-object v2, p0, Lcom/android/ex/photo/views/PhotoView;->E:Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    sub-float/2addr v3, v2

    .line 55
    iget-boolean v2, p0, Lcom/android/ex/photo/views/PhotoView;->r:Z

    .line 56
    .line 57
    if-eqz v2, :cond_4c

    .line 58
    .line 59
    cmpg-float v2, v3, p1

    .line 60
    .line 61
    if-gtz v2, :cond_3f

    .line 62
    .line 63
    goto :goto_4c

    .line 64
    :cond_3f
    const/4 v2, 0x0

    .line 65
    cmpl-float v2, v1, v2

    .line 66
    .line 67
    if-nez v2, :cond_45

    .line 68
    .line 69
    return v0

    .line 70
    :cond_45
    add-float/2addr v3, v1

    .line 71
    cmpl-float p1, p1, v3

    .line 72
    .line 73
    if-ltz p1, :cond_4b

    .line 74
    .line 75
    return p2

    .line 76
    :cond_4b
    return v0

    .line 77
    :cond_4c
    :goto_4c
    return p2
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

.method public q()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

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

.method public r()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->c:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/ex/photo/views/PhotoView;->d:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/ex/photo/views/PhotoView;->i()V

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
.end method

.method public setFixedHeight(I)V
    .registers 5

    .line 1
    iget v0, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_8
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget v2, p0, Lcom/android/ex/photo/views/PhotoView;->e:I

    .line 16
    .line 17
    invoke-virtual {p0, p1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 18
    .line 19
    .line 20
    if-eqz v0, :cond_1b

    .line 21
    .line 22
    invoke-direct {p0, v1}, Lcom/android/ex/photo/views/PhotoView;->h(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 26
    .line 27
    .line 28
    :cond_1b
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

.method public setMaxInitialScale(F)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/android/ex/photo/views/PhotoView;->m:F

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

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->p:Landroid/view/View$OnClickListener;

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

.method public setOnScaleChangedListener(Lcom/android/ex/photo/views/PhotoView$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/views/PhotoView;->q:Lcom/android/ex/photo/views/PhotoView$a;

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

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/views/PhotoView;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_d

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_d
    :goto_d
    const/4 p1, 0x1

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

.method public w(ZZ)V
    .registers 3

    .line 1
    iget-boolean p2, p0, Lcom/android/ex/photo/views/PhotoView;->g:Z

    .line 2
    .line 3
    if-eq p1, p2, :cond_c

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/android/ex/photo/views/PhotoView;->g:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
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
