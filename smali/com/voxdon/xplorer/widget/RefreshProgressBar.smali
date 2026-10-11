.class public Lcom/voxdon/xplorer/widget/RefreshProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/widget/RefreshProgressBar$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/graphics/drawable/GradientDrawable;

.field final b:Landroid/animation/ValueAnimator;

.field private final c:Landroid/graphics/Paint;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:F

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-static {p1}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iput v2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->g:F

    .line 17
    .line 18
    sget-object v3, Lax/Q2/n;->T1:[I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const v3, 0x7f060464

    .line 25
    .line 26
    .line 27
    :try_start_1a
    invoke-static {p1, v3}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->d:I

    .line 37
    .line 38
    const/high16 v4, 0x40800000    # 4.0f

    .line 39
    .line 40
    mul-float v4, v4, v2

    .line 41
    .line 42
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iput v4, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->e:I

    .line 52
    .line 53
    const/high16 v4, 0x40400000    # 3.0f

    .line 54
    .line 55
    mul-float v2, v2, v4

    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iput v2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->f:I
    :try_end_42
    .catchall {:try_start_1a .. :try_end_42} :catchall_79

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    .line 69
    .line 70
    new-instance p2, Landroid/animation/ValueAnimator;

    .line 71
    .line 72
    invoke-direct {p2}, Landroid/animation/ValueAnimator;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    new-array v0, v0, [F

    .line 78
    .line 79
    fill-array-data v0, :array_7e

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 83
    .line 84
    .line 85
    const/4 v0, -0x1

    .line 86
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lcom/voxdon/xplorer/widget/RefreshProgressBar$b;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-direct {v0, v2}, Lcom/voxdon/xplorer/widget/RefreshProgressBar$b;-><init>(Lcom/voxdon/xplorer/widget/RefreshProgressBar$a;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    .line 100
    .line 101
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 102
    .line 103
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 104
    .line 105
    const v1, 0xffffff

    .line 106
    .line 107
    .line 108
    and-int/2addr p1, v1

    .line 109
    const/high16 v1, 0x22000000

    .line 110
    .line 111
    or-int/2addr p1, v1

    .line 112
    filled-new-array {p1, v3}, [I

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {p2, v0, p1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 117
    .line 118
    .line 119
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->a:Landroid/graphics/drawable/GradientDrawable;

    .line 120
    .line 121
    return-void

    .line 122
    :catchall_79
    move-exception p1

    .line 123
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :array_7e
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
    .end array-data
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

.method private a()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_1a

    .line 6
    :cond_5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1a

    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    new-instance v1, Lcom/voxdon/xplorer/widget/RefreshProgressBar$a;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/widget/RefreshProgressBar$a;-><init>(Lcom/voxdon/xplorer/widget/RefreshProgressBar;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    :goto_1a
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

.method private b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

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


# virtual methods
.method protected onDetachedFromWindow()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b()V

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

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 15

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_4f

    .line 10
    :cond_9
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->a:Landroid/graphics/drawable/GradientDrawable;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->h:I

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    shr-int v2, v1, v2

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_25
    iget v4, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->h:I

    .line 39
    .line 40
    if-ge v3, v4, :cond_4f

    .line 41
    .line 42
    add-int/lit8 v4, v3, 0x1

    .line 43
    .line 44
    shr-int v5, v1, v4

    .line 45
    .line 46
    int-to-float v5, v5

    .line 47
    mul-float v5, v5, v0

    .line 48
    .line 49
    if-nez v3, :cond_36

    .line 50
    .line 51
    add-int v3, v1, v2

    .line 52
    .line 53
    int-to-float v3, v3

    .line 54
    goto :goto_3a

    .line 55
    :cond_36
    const/high16 v3, 0x40000000    # 2.0f

    .line 56
    .line 57
    mul-float v3, v3, v5

    .line 58
    .line 59
    :goto_3a
    iget v6, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->f:I

    .line 60
    .line 61
    int-to-float v6, v6

    .line 62
    add-float/2addr v5, v6

    .line 63
    int-to-float v6, v2

    .line 64
    sub-float v8, v5, v6

    .line 65
    .line 66
    sub-float v10, v3, v6

    .line 67
    .line 68
    iget v3, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->e:I

    .line 69
    .line 70
    int-to-float v11, v3

    .line 71
    iget-object v12, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->c:Landroid/graphics/Paint;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    move-object v7, p1

    .line 75
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    move v3, v4

    .line 79
    goto :goto_25

    .line 80
    :cond_4f
    :goto_4f
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

.method protected onLayout(ZIIII)V
    .registers 6

    .line 1
    if-eqz p1, :cond_3e

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->a:Landroid/graphics/drawable/GradientDrawable;

    .line 8
    .line 9
    iget p3, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->e:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    iget p5, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->e:I

    .line 16
    .line 17
    sub-int/2addr p4, p5

    .line 18
    const/4 p5, 0x0

    .line 19
    invoke-virtual {p2, p5, p3, p1, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 20
    .line 21
    .line 22
    int-to-float p1, p1

    .line 23
    iget p2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->g:F

    .line 24
    .line 25
    div-float/2addr p1, p2

    .line 26
    const/high16 p2, 0x43a00000    # 320.0f

    .line 27
    .line 28
    div-float/2addr p1, p2

    .line 29
    const/high16 p2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    sub-float/2addr p1, p2

    .line 32
    const p3, 0x3e99999a    # 0.3f

    .line 33
    .line 34
    .line 35
    mul-float p3, p3, p1

    .line 36
    .line 37
    add-float/2addr p3, p2

    .line 38
    const p4, 0x3dcccccd    # 0.1f

    .line 39
    .line 40
    .line 41
    mul-float p1, p1, p4

    .line 42
    .line 43
    add-float/2addr p1, p2

    .line 44
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b:Landroid/animation/ValueAnimator;

    .line 45
    .line 46
    const p4, 0x44bb8000    # 1500.0f

    .line 47
    .line 48
    .line 49
    mul-float p3, p3, p4

    .line 50
    .line 51
    float-to-int p3, p3

    .line 52
    int-to-long p3, p3

    .line 53
    invoke-virtual {p2, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    const/high16 p2, 0x40a00000    # 5.0f

    .line 57
    .line 58
    mul-float p1, p1, p2

    .line 59
    .line 60
    float-to-int p1, p1

    .line 61
    iput p1, p0, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->h:I

    .line 62
    .line 63
    :cond_3e
    return-void
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

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_f

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_e

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->a()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void

    .line 16
    :cond_f
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/RefreshProgressBar;->b()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method protected onWindowVisibilityChanged(I)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

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
