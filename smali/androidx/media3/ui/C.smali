.class final Landroidx/media3/ui/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Landroid/text/StaticLayout;

.field private F:Landroid/text/StaticLayout;

.field private G:I

.field private H:I

.field private I:I

.field private J:Landroid/graphics/Rect;

.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:Landroid/text/TextPaint;

.field private final g:Landroid/graphics/Paint;

.field private final h:Landroid/graphics/Paint;

.field private i:Ljava/lang/CharSequence;

.field private j:Landroid/text/Layout$Alignment;

.field private k:Landroid/graphics/Bitmap;

.field private l:F

.field private m:I

.field private n:I

.field private o:F

.field private p:I

.field private q:F

.field private r:F

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x1010217

    .line 5
    .line 6
    .line 7
    const v1, 0x1010218

    .line 8
    .line 9
    .line 10
    filled-new-array {v0, v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p1, v1, v0, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    iput v1, p0, Landroidx/media3/ui/C;->e:F

    .line 26
    .line 27
    const/high16 v1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, p0, Landroidx/media3/ui/C;->d:F

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 48
    .line 49
    int-to-float p1, p1

    .line 50
    const/high16 v0, 0x40000000    # 2.0f

    .line 51
    .line 52
    mul-float p1, p1, v0

    .line 53
    .line 54
    const/high16 v0, 0x43200000    # 160.0f

    .line 55
    .line 56
    div-float/2addr p1, v0

    .line 57
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    int-to-float p1, p1

    .line 62
    iput p1, p0, Landroidx/media3/ui/C;->a:F

    .line 63
    .line 64
    iput p1, p0, Landroidx/media3/ui/C;->b:F

    .line 65
    .line 66
    iput p1, p0, Landroidx/media3/ui/C;->c:F

    .line 67
    .line 68
    new-instance p1, Landroid/text/TextPaint;

    .line 69
    .line 70
    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Landroid/graphics/Paint;

    .line 82
    .line 83
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Landroidx/media3/ui/C;->g:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Landroidx/media3/ui/C;->h:Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 107
    .line 108
    .line 109
    return-void
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

.method private static a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .registers 2

    .line 1
    if-eq p0, p1, :cond_d

    .line 2
    .line 3
    if-eqz p0, :cond_b

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_d
    :goto_d
    const/4 p0, 0x1

    .line 15
    return p0
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

.method private c(Landroid/graphics/Canvas;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/C;->J:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/ui/C;->h:Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

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
    .line 22
.end method

.method private d(Landroid/graphics/Canvas;Z)V
    .registers 3

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media3/ui/C;->e(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    iget-object p2, p0, Landroidx/media3/ui/C;->J:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Landroidx/media3/ui/C;->c(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method private e(Landroid/graphics/Canvas;)V
    .registers 12

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/C;->F:Landroid/text/StaticLayout;

    .line 4
    .line 5
    if-eqz v0, :cond_c9

    .line 6
    .line 7
    if-nez v1, :cond_a

    .line 8
    .line 9
    goto/16 :goto_c9

    .line 10
    .line 11
    :cond_a
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget v3, p0, Landroidx/media3/ui/C;->G:I

    .line 16
    .line 17
    int-to-float v3, v3

    .line 18
    iget v4, p0, Landroidx/media3/ui/C;->H:I

    .line 19
    .line 20
    int-to-float v4, v4

    .line 21
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 22
    .line 23
    .line 24
    iget v3, p0, Landroidx/media3/ui/C;->u:I

    .line 25
    .line 26
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-lez v3, :cond_3f

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/media3/ui/C;->g:Landroid/graphics/Paint;

    .line 33
    .line 34
    iget v4, p0, Landroidx/media3/ui/C;->u:I

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    iget v3, p0, Landroidx/media3/ui/C;->I:I

    .line 40
    .line 41
    neg-int v3, v3

    .line 42
    int-to-float v5, v3

    .line 43
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    iget v4, p0, Landroidx/media3/ui/C;->I:I

    .line 48
    .line 49
    add-int/2addr v3, v4

    .line 50
    int-to-float v7, v3

    .line 51
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-float v8, v3

    .line 56
    iget-object v9, p0, Landroidx/media3/ui/C;->g:Landroid/graphics/Paint;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    move-object v4, p1

    .line 60
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    goto :goto_40

    .line 64
    :cond_3f
    move-object v4, p1

    .line 65
    :goto_40
    iget p1, p0, Landroidx/media3/ui/C;->w:I

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v5, 0x1

    .line 69
    if-ne p1, v5, :cond_66

    .line 70
    .line 71
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 72
    .line 73
    sget-object v5, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 79
    .line 80
    iget v5, p0, Landroidx/media3/ui/C;->a:F

    .line 81
    .line 82
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 86
    .line 87
    iget v5, p0, Landroidx/media3/ui/C;->v:I

    .line 88
    .line 89
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 93
    .line 94
    sget-object v5, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 95
    .line 96
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 100
    .line 101
    .line 102
    goto :goto_af

    .line 103
    :cond_66
    const/4 v6, 0x2

    .line 104
    if-ne p1, v6, :cond_75

    .line 105
    .line 106
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 107
    .line 108
    iget v1, p0, Landroidx/media3/ui/C;->b:F

    .line 109
    .line 110
    iget v5, p0, Landroidx/media3/ui/C;->c:F

    .line 111
    .line 112
    iget v6, p0, Landroidx/media3/ui/C;->v:I

    .line 113
    .line 114
    invoke-virtual {p1, v1, v5, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 115
    .line 116
    .line 117
    goto :goto_af

    .line 118
    :cond_75
    const/4 v6, 0x3

    .line 119
    if-eq p1, v6, :cond_7b

    .line 120
    .line 121
    const/4 v7, 0x4

    .line 122
    if-ne p1, v7, :cond_af

    .line 123
    .line 124
    :cond_7b
    if-ne p1, v6, :cond_7e

    .line 125
    .line 126
    goto :goto_7f

    .line 127
    :cond_7e
    const/4 v5, 0x0

    .line 128
    :goto_7f
    const/4 p1, -0x1

    .line 129
    if-eqz v5, :cond_84

    .line 130
    .line 131
    const/4 v6, -0x1

    .line 132
    goto :goto_86

    .line 133
    :cond_84
    iget v6, p0, Landroidx/media3/ui/C;->v:I

    .line 134
    .line 135
    :goto_86
    if-eqz v5, :cond_8a

    .line 136
    .line 137
    iget p1, p0, Landroidx/media3/ui/C;->v:I

    .line 138
    .line 139
    :cond_8a
    iget v5, p0, Landroidx/media3/ui/C;->b:F

    .line 140
    .line 141
    const/high16 v7, 0x40000000    # 2.0f

    .line 142
    .line 143
    div-float/2addr v5, v7

    .line 144
    iget-object v7, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 145
    .line 146
    iget v8, p0, Landroidx/media3/ui/C;->s:I

    .line 147
    .line 148
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 149
    .line 150
    .line 151
    iget-object v7, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 152
    .line 153
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 154
    .line 155
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 156
    .line 157
    .line 158
    iget-object v7, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 159
    .line 160
    iget v8, p0, Landroidx/media3/ui/C;->b:F

    .line 161
    .line 162
    neg-float v9, v5

    .line 163
    invoke-virtual {v7, v8, v9, v9, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 170
    .line 171
    iget v6, p0, Landroidx/media3/ui/C;->b:F

    .line 172
    .line 173
    invoke-virtual {v1, v6, v5, v5, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 174
    .line 175
    .line 176
    :cond_af
    :goto_af
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 177
    .line 178
    iget v1, p0, Landroidx/media3/ui/C;->s:I

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 184
    .line 185
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    invoke-virtual {p1, v0, v0, v0, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 200
    .line 201
    .line 202
    :cond_c9
    :goto_c9
    return-void
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
.end method

.method private f()V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget v1, p0, Landroidx/media3/ui/C;->C:I

    .line 4
    .line 5
    iget v2, p0, Landroidx/media3/ui/C;->A:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    iget v3, p0, Landroidx/media3/ui/C;->D:I

    .line 9
    .line 10
    iget v4, p0, Landroidx/media3/ui/C;->B:I

    .line 11
    .line 12
    sub-int/2addr v3, v4

    .line 13
    int-to-float v2, v2

    .line 14
    int-to-float v1, v1

    .line 15
    iget v5, p0, Landroidx/media3/ui/C;->o:F

    .line 16
    .line 17
    mul-float v5, v5, v1

    .line 18
    .line 19
    add-float/2addr v2, v5

    .line 20
    int-to-float v4, v4

    .line 21
    int-to-float v3, v3

    .line 22
    iget v5, p0, Landroidx/media3/ui/C;->l:F

    .line 23
    .line 24
    mul-float v5, v5, v3

    .line 25
    .line 26
    add-float/2addr v4, v5

    .line 27
    iget v5, p0, Landroidx/media3/ui/C;->q:F

    .line 28
    .line 29
    mul-float v1, v1, v5

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v5, p0, Landroidx/media3/ui/C;->r:F

    .line 36
    .line 37
    const v6, -0x800001

    .line 38
    .line 39
    .line 40
    cmpl-float v6, v5, v6

    .line 41
    .line 42
    if-eqz v6, :cond_32

    .line 43
    .line 44
    mul-float v3, v3, v5

    .line 45
    .line 46
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_44

    .line 51
    :cond_32
    int-to-float v3, v1

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    int-to-float v5, v5

    .line 57
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-float v0, v0

    .line 62
    div-float/2addr v5, v0

    .line 63
    mul-float v3, v3, v5

    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :goto_44
    iget v3, p0, Landroidx/media3/ui/C;->p:I

    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    const/4 v6, 0x2

    .line 73
    if-ne v3, v6, :cond_4d

    .line 74
    .line 75
    int-to-float v3, v1

    .line 76
    :goto_4b
    sub-float/2addr v2, v3

    .line 77
    goto :goto_53

    .line 78
    :cond_4d
    if-ne v3, v5, :cond_53

    .line 79
    .line 80
    div-int/lit8 v3, v1, 0x2

    .line 81
    .line 82
    int-to-float v3, v3

    .line 83
    goto :goto_4b

    .line 84
    :cond_53
    :goto_53
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iget v3, p0, Landroidx/media3/ui/C;->n:I

    .line 89
    .line 90
    if-ne v3, v6, :cond_5e

    .line 91
    .line 92
    int-to-float v3, v0

    .line 93
    :goto_5c
    sub-float/2addr v4, v3

    .line 94
    goto :goto_64

    .line 95
    :cond_5e
    if-ne v3, v5, :cond_64

    .line 96
    .line 97
    div-int/lit8 v3, v0, 0x2

    .line 98
    .line 99
    int-to-float v3, v3

    .line 100
    goto :goto_5c

    .line 101
    :cond_64
    :goto_64
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    new-instance v4, Landroid/graphics/Rect;

    .line 106
    .line 107
    add-int/2addr v1, v2

    .line 108
    add-int/2addr v0, v3

    .line 109
    invoke-direct {v4, v2, v3, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 110
    .line 111
    .line 112
    iput-object v4, p0, Landroidx/media3/ui/C;->J:Landroid/graphics/Rect;

    .line 113
    .line 114
    return-void
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

.method private g()V
    .registers 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/C;->i:Ljava/lang/CharSequence;

    .line 4
    .line 5
    instance-of v2, v1, Landroid/text/SpannableStringBuilder;

    .line 6
    .line 7
    if-eqz v2, :cond_c

    .line 8
    .line 9
    check-cast v1, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    :goto_a
    move-object v4, v1

    .line 12
    goto :goto_14

    .line 13
    :cond_c
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 14
    .line 15
    iget-object v2, v0, Landroidx/media3/ui/C;->i:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    goto :goto_a

    .line 21
    :goto_14
    iget v1, v0, Landroidx/media3/ui/C;->C:I

    .line 22
    .line 23
    iget v2, v0, Landroidx/media3/ui/C;->A:I

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    iget v2, v0, Landroidx/media3/ui/C;->D:I

    .line 27
    .line 28
    iget v3, v0, Landroidx/media3/ui/C;->B:I

    .line 29
    .line 30
    sub-int/2addr v2, v3

    .line 31
    iget-object v3, v0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 32
    .line 33
    iget v5, v0, Landroidx/media3/ui/C;->x:F

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 36
    .line 37
    .line 38
    iget v3, v0, Landroidx/media3/ui/C;->x:F

    .line 39
    .line 40
    const/high16 v5, 0x3e000000    # 0.125f

    .line 41
    .line 42
    mul-float v3, v3, v5

    .line 43
    .line 44
    const/high16 v5, 0x3f000000    # 0.5f

    .line 45
    .line 46
    add-float/2addr v3, v5

    .line 47
    float-to-int v11, v3

    .line 48
    mul-int/lit8 v12, v11, 0x2

    .line 49
    .line 50
    sub-int v3, v1, v12

    .line 51
    .line 52
    iget v5, v0, Landroidx/media3/ui/C;->q:F

    .line 53
    .line 54
    const v13, -0x800001

    .line 55
    .line 56
    .line 57
    cmpl-float v6, v5, v13

    .line 58
    .line 59
    if-eqz v6, :cond_40

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    mul-float v3, v3, v5

    .line 63
    .line 64
    float-to-int v3, v3

    .line 65
    :cond_40
    move v6, v3

    .line 66
    const-string v14, "SubtitlePainter"

    .line 67
    .line 68
    if-gtz v6, :cond_4b

    .line 69
    .line 70
    const-string v1, "Skipped drawing subtitle cue (insufficient space)"

    .line 71
    .line 72
    invoke-static {v14, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4b
    iget v3, v0, Landroidx/media3/ui/C;->y:F

    .line 77
    .line 78
    const/4 v15, 0x0

    .line 79
    const/high16 v5, 0xff0000

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    cmpl-float v3, v3, v15

    .line 83
    .line 84
    if-lez v3, :cond_64

    .line 85
    .line 86
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 87
    .line 88
    iget v8, v0, Landroidx/media3/ui/C;->y:F

    .line 89
    .line 90
    float-to-int v8, v8

    .line 91
    invoke-direct {v3, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-virtual {v4, v3, v7, v8, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 99
    .line 100
    .line 101
    :cond_64
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 102
    .line 103
    invoke-direct {v3, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    iget v8, v0, Landroidx/media3/ui/C;->w:I

    .line 107
    .line 108
    const/4 v9, 0x1

    .line 109
    if-ne v8, v9, :cond_8c

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    const-class v10, Landroid/text/style/ForegroundColorSpan;

    .line 116
    .line 117
    invoke-virtual {v3, v7, v8, v10}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, [Landroid/text/style/ForegroundColorSpan;

    .line 122
    .line 123
    array-length v10, v8

    .line 124
    const/4 v9, 0x0

    .line 125
    :goto_7c
    if-ge v9, v10, :cond_8c

    .line 126
    .line 127
    const v17, -0x800001

    .line 128
    .line 129
    .line 130
    aget-object v13, v8, v9

    .line 131
    .line 132
    invoke-virtual {v3, v13}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v9, v9, 0x1

    .line 136
    .line 137
    const v13, -0x800001

    .line 138
    .line 139
    .line 140
    goto :goto_7c

    .line 141
    :cond_8c
    const v17, -0x800001

    .line 142
    .line 143
    .line 144
    iget v8, v0, Landroidx/media3/ui/C;->t:I

    .line 145
    .line 146
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    const/4 v13, 0x2

    .line 151
    if-lez v8, :cond_bc

    .line 152
    .line 153
    iget v8, v0, Landroidx/media3/ui/C;->w:I

    .line 154
    .line 155
    if-eqz v8, :cond_ae

    .line 156
    .line 157
    if-ne v8, v13, :cond_9f

    .line 158
    .line 159
    goto :goto_ae

    .line 160
    :cond_9f
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 161
    .line 162
    iget v9, v0, Landroidx/media3/ui/C;->t:I

    .line 163
    .line 164
    invoke-direct {v8, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    invoke-virtual {v3, v8, v7, v9, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 172
    .line 173
    .line 174
    goto :goto_bc

    .line 175
    :cond_ae
    :goto_ae
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 176
    .line 177
    iget v9, v0, Landroidx/media3/ui/C;->t:I

    .line 178
    .line 179
    invoke-direct {v8, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-virtual {v4, v8, v7, v9, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 187
    .line 188
    .line 189
    :cond_bc
    :goto_bc
    iget-object v5, v0, Landroidx/media3/ui/C;->j:Landroid/text/Layout$Alignment;

    .line 190
    .line 191
    if-nez v5, :cond_c2

    .line 192
    .line 193
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 194
    .line 195
    :cond_c2
    move-object/from16 v20, v5

    .line 196
    .line 197
    move-object v5, v3

    .line 198
    new-instance v3, Landroid/text/StaticLayout;

    .line 199
    .line 200
    move-object v8, v5

    .line 201
    iget-object v5, v0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 202
    .line 203
    move-object v9, v8

    .line 204
    iget v8, v0, Landroidx/media3/ui/C;->d:F

    .line 205
    .line 206
    move-object v10, v9

    .line 207
    iget v9, v0, Landroidx/media3/ui/C;->e:F

    .line 208
    .line 209
    move-object/from16 v18, v10

    .line 210
    .line 211
    const/4 v10, 0x1

    .line 212
    move-object/from16 v7, v20

    .line 213
    .line 214
    const/4 v15, 0x1

    .line 215
    const/16 v19, 0x0

    .line 216
    .line 217
    invoke-direct/range {v3 .. v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 218
    .line 219
    .line 220
    iput-object v3, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 221
    .line 222
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    iget-object v5, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 227
    .line 228
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    const/4 v8, 0x0

    .line 233
    const/4 v9, 0x0

    .line 234
    :goto_e9
    if-ge v9, v5, :cond_103

    .line 235
    .line 236
    iget-object v10, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 237
    .line 238
    invoke-virtual {v10, v9}, Landroid/text/Layout;->getLineWidth(I)F

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    move-object/from16 v20, v14

    .line 243
    .line 244
    float-to-double v13, v10

    .line 245
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 246
    .line 247
    .line 248
    move-result-wide v13

    .line 249
    double-to-int v10, v13

    .line 250
    invoke-static {v10, v8}, Ljava/lang/Math;->max(II)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    add-int/lit8 v9, v9, 0x1

    .line 255
    .line 256
    move-object/from16 v14, v20

    .line 257
    .line 258
    const/4 v13, 0x2

    .line 259
    goto :goto_e9

    .line 260
    :cond_103
    move-object/from16 v20, v14

    .line 261
    .line 262
    iget v5, v0, Landroidx/media3/ui/C;->q:F

    .line 263
    .line 264
    cmpl-float v5, v5, v17

    .line 265
    .line 266
    if-eqz v5, :cond_10e

    .line 267
    .line 268
    if-ge v8, v6, :cond_10e

    .line 269
    .line 270
    goto :goto_10f

    .line 271
    :cond_10e
    move v6, v8

    .line 272
    :goto_10f
    add-int/2addr v6, v12

    .line 273
    iget v5, v0, Landroidx/media3/ui/C;->o:F

    .line 274
    .line 275
    cmpl-float v8, v5, v17

    .line 276
    .line 277
    if-eqz v8, :cond_13b

    .line 278
    .line 279
    int-to-float v1, v1

    .line 280
    mul-float v1, v1, v5

    .line 281
    .line 282
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    iget v5, v0, Landroidx/media3/ui/C;->A:I

    .line 287
    .line 288
    add-int/2addr v1, v5

    .line 289
    iget v8, v0, Landroidx/media3/ui/C;->p:I

    .line 290
    .line 291
    if-eq v8, v15, :cond_12a

    .line 292
    .line 293
    const/4 v9, 0x2

    .line 294
    if-eq v8, v9, :cond_128

    .line 295
    .line 296
    goto :goto_12f

    .line 297
    :cond_128
    sub-int/2addr v1, v6

    .line 298
    goto :goto_12f

    .line 299
    :cond_12a
    const/4 v9, 0x2

    .line 300
    mul-int/lit8 v1, v1, 0x2

    .line 301
    .line 302
    sub-int/2addr v1, v6

    .line 303
    div-int/2addr v1, v9

    .line 304
    :goto_12f
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    add-int/2addr v6, v1

    .line 309
    iget v5, v0, Landroidx/media3/ui/C;->C:I

    .line 310
    .line 311
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    goto :goto_143

    .line 316
    :cond_13b
    const/4 v9, 0x2

    .line 317
    sub-int/2addr v1, v6

    .line 318
    div-int/2addr v1, v9

    .line 319
    iget v5, v0, Landroidx/media3/ui/C;->A:I

    .line 320
    .line 321
    add-int/2addr v1, v5

    .line 322
    add-int v5, v1, v6

    .line 323
    .line 324
    :goto_143
    sub-int v6, v5, v1

    .line 325
    .line 326
    if-gtz v6, :cond_14f

    .line 327
    .line 328
    const-string v1, "Skipped drawing subtitle cue (invalid horizontal positioning)"

    .line 329
    .line 330
    move-object/from16 v2, v20

    .line 331
    .line 332
    invoke-static {v2, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_14f
    iget v5, v0, Landroidx/media3/ui/C;->l:F

    .line 337
    .line 338
    cmpl-float v8, v5, v17

    .line 339
    .line 340
    if-eqz v8, :cond_1ac

    .line 341
    .line 342
    iget v8, v0, Landroidx/media3/ui/C;->m:I

    .line 343
    .line 344
    if-nez v8, :cond_170

    .line 345
    .line 346
    int-to-float v2, v2

    .line 347
    mul-float v2, v2, v5

    .line 348
    .line 349
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    iget v5, v0, Landroidx/media3/ui/C;->B:I

    .line 354
    .line 355
    add-int/2addr v2, v5

    .line 356
    iget v5, v0, Landroidx/media3/ui/C;->n:I

    .line 357
    .line 358
    const/4 v9, 0x2

    .line 359
    if-ne v5, v9, :cond_169

    .line 360
    .line 361
    goto :goto_19c

    .line 362
    :cond_169
    if-ne v5, v15, :cond_19d

    .line 363
    .line 364
    mul-int/lit8 v2, v2, 0x2

    .line 365
    .line 366
    sub-int/2addr v2, v3

    .line 367
    div-int/2addr v2, v9

    .line 368
    goto :goto_19d

    .line 369
    :cond_170
    iget-object v2, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 370
    .line 371
    const/4 v5, 0x0

    .line 372
    invoke-virtual {v2, v5}, Landroid/text/Layout;->getLineBottom(I)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    iget-object v8, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 377
    .line 378
    invoke-virtual {v8, v5}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    sub-int/2addr v2, v5

    .line 383
    iget v5, v0, Landroidx/media3/ui/C;->l:F

    .line 384
    .line 385
    cmpl-float v8, v5, v19

    .line 386
    .line 387
    if-ltz v8, :cond_18f

    .line 388
    .line 389
    int-to-float v2, v2

    .line 390
    mul-float v5, v5, v2

    .line 391
    .line 392
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    iget v5, v0, Landroidx/media3/ui/C;->B:I

    .line 397
    .line 398
    add-int/2addr v2, v5

    .line 399
    goto :goto_19d

    .line 400
    :cond_18f
    const/high16 v8, 0x3f800000    # 1.0f

    .line 401
    .line 402
    add-float/2addr v5, v8

    .line 403
    int-to-float v2, v2

    .line 404
    mul-float v5, v5, v2

    .line 405
    .line 406
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    iget v5, v0, Landroidx/media3/ui/C;->D:I

    .line 411
    .line 412
    add-int/2addr v2, v5

    .line 413
    :goto_19c
    sub-int/2addr v2, v3

    .line 414
    :cond_19d
    :goto_19d
    add-int v5, v2, v3

    .line 415
    .line 416
    iget v8, v0, Landroidx/media3/ui/C;->D:I

    .line 417
    .line 418
    if-le v5, v8, :cond_1a6

    .line 419
    .line 420
    sub-int v2, v8, v3

    .line 421
    .line 422
    goto :goto_1b7

    .line 423
    :cond_1a6
    iget v3, v0, Landroidx/media3/ui/C;->B:I

    .line 424
    .line 425
    if-ge v2, v3, :cond_1b7

    .line 426
    .line 427
    move v2, v3

    .line 428
    goto :goto_1b7

    .line 429
    :cond_1ac
    iget v5, v0, Landroidx/media3/ui/C;->D:I

    .line 430
    .line 431
    sub-int/2addr v5, v3

    .line 432
    int-to-float v2, v2

    .line 433
    iget v3, v0, Landroidx/media3/ui/C;->z:F

    .line 434
    .line 435
    mul-float v2, v2, v3

    .line 436
    .line 437
    float-to-int v2, v2

    .line 438
    sub-int v2, v5, v2

    .line 439
    .line 440
    :cond_1b7
    :goto_1b7
    new-instance v3, Landroid/text/StaticLayout;

    .line 441
    .line 442
    iget-object v5, v0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 443
    .line 444
    iget v8, v0, Landroidx/media3/ui/C;->d:F

    .line 445
    .line 446
    iget v9, v0, Landroidx/media3/ui/C;->e:F

    .line 447
    .line 448
    const/4 v10, 0x1

    .line 449
    invoke-direct/range {v3 .. v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 450
    .line 451
    .line 452
    move/from16 v19, v6

    .line 453
    .line 454
    iput-object v3, v0, Landroidx/media3/ui/C;->E:Landroid/text/StaticLayout;

    .line 455
    .line 456
    new-instance v16, Landroid/text/StaticLayout;

    .line 457
    .line 458
    iget-object v3, v0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 459
    .line 460
    iget v4, v0, Landroidx/media3/ui/C;->d:F

    .line 461
    .line 462
    iget v5, v0, Landroidx/media3/ui/C;->e:F

    .line 463
    .line 464
    const/16 v23, 0x1

    .line 465
    .line 466
    move/from16 v21, v4

    .line 467
    .line 468
    move/from16 v22, v5

    .line 469
    .line 470
    move-object/from16 v20, v7

    .line 471
    .line 472
    move-object/from16 v17, v18

    .line 473
    .line 474
    move-object/from16 v18, v3

    .line 475
    .line 476
    invoke-direct/range {v16 .. v23}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v3, v16

    .line 480
    .line 481
    iput-object v3, v0, Landroidx/media3/ui/C;->F:Landroid/text/StaticLayout;

    .line 482
    .line 483
    iput v1, v0, Landroidx/media3/ui/C;->G:I

    .line 484
    .line 485
    iput v2, v0, Landroidx/media3/ui/C;->H:I

    .line 486
    .line 487
    iput v11, v0, Landroidx/media3/ui/C;->I:I

    .line 488
    .line 489
    return-void
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method


# virtual methods
.method public b(Lax/R0/a;Lax/a2/a;FFFLandroid/graphics/Canvas;IIII)V
    .registers 15

    .line 1
    iget-object v0, p1, Lax/R0/a;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    if-eqz v0, :cond_1c

    .line 9
    .line 10
    iget-object v1, p1, Lax/R0/a;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_12

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-boolean v1, p1, Lax/R0/a;->l:Z

    .line 20
    .line 21
    if-eqz v1, :cond_19

    .line 22
    .line 23
    iget v1, p1, Lax/R0/a;->m:I

    .line 24
    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    iget v1, p2, Lax/a2/a;->c:I

    .line 27
    .line 28
    goto :goto_1e

    .line 29
    :cond_1c
    const/high16 v1, -0x1000000

    .line 30
    .line 31
    :goto_1e
    iget-object v2, p0, Landroidx/media3/ui/C;->i:Ljava/lang/CharSequence;

    .line 32
    .line 33
    iget-object v3, p1, Lax/R0/a;->a:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-static {v2, v3}, Landroidx/media3/ui/C;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_d2

    .line 40
    .line 41
    iget-object v2, p0, Landroidx/media3/ui/C;->j:Landroid/text/Layout$Alignment;

    .line 42
    .line 43
    iget-object v3, p1, Lax/R0/a;->b:Landroid/text/Layout$Alignment;

    .line 44
    .line 45
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_d2

    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 52
    .line 53
    iget-object v3, p1, Lax/R0/a;->d:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-ne v2, v3, :cond_d2

    .line 56
    .line 57
    iget v2, p0, Landroidx/media3/ui/C;->l:F

    .line 58
    .line 59
    iget v3, p1, Lax/R0/a;->e:F

    .line 60
    .line 61
    cmpl-float v2, v2, v3

    .line 62
    .line 63
    if-nez v2, :cond_d2

    .line 64
    .line 65
    iget v2, p0, Landroidx/media3/ui/C;->m:I

    .line 66
    .line 67
    iget v3, p1, Lax/R0/a;->f:I

    .line 68
    .line 69
    if-ne v2, v3, :cond_d2

    .line 70
    .line 71
    iget v2, p0, Landroidx/media3/ui/C;->n:I

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget v3, p1, Lax/R0/a;->g:I

    .line 78
    .line 79
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_d2

    .line 88
    .line 89
    iget v2, p0, Landroidx/media3/ui/C;->o:F

    .line 90
    .line 91
    iget v3, p1, Lax/R0/a;->h:F

    .line 92
    .line 93
    cmpl-float v2, v2, v3

    .line 94
    .line 95
    if-nez v2, :cond_d2

    .line 96
    .line 97
    iget v2, p0, Landroidx/media3/ui/C;->p:I

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget v3, p1, Lax/R0/a;->i:I

    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_d2

    .line 114
    .line 115
    iget v2, p0, Landroidx/media3/ui/C;->q:F

    .line 116
    .line 117
    iget v3, p1, Lax/R0/a;->j:F

    .line 118
    .line 119
    cmpl-float v2, v2, v3

    .line 120
    .line 121
    if-nez v2, :cond_d2

    .line 122
    .line 123
    iget v2, p0, Landroidx/media3/ui/C;->r:F

    .line 124
    .line 125
    iget v3, p1, Lax/R0/a;->k:F

    .line 126
    .line 127
    cmpl-float v2, v2, v3

    .line 128
    .line 129
    if-nez v2, :cond_d2

    .line 130
    .line 131
    iget v2, p0, Landroidx/media3/ui/C;->s:I

    .line 132
    .line 133
    iget v3, p2, Lax/a2/a;->a:I

    .line 134
    .line 135
    if-ne v2, v3, :cond_d2

    .line 136
    .line 137
    iget v2, p0, Landroidx/media3/ui/C;->t:I

    .line 138
    .line 139
    iget v3, p2, Lax/a2/a;->b:I

    .line 140
    .line 141
    if-ne v2, v3, :cond_d2

    .line 142
    .line 143
    iget v2, p0, Landroidx/media3/ui/C;->u:I

    .line 144
    .line 145
    if-ne v2, v1, :cond_d2

    .line 146
    .line 147
    iget v2, p0, Landroidx/media3/ui/C;->w:I

    .line 148
    .line 149
    iget v3, p2, Lax/a2/a;->d:I

    .line 150
    .line 151
    if-ne v2, v3, :cond_d2

    .line 152
    .line 153
    iget v2, p0, Landroidx/media3/ui/C;->v:I

    .line 154
    .line 155
    iget v3, p2, Lax/a2/a;->e:I

    .line 156
    .line 157
    if-ne v2, v3, :cond_d2

    .line 158
    .line 159
    iget-object v2, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v3, p2, Lax/a2/a;->f:Landroid/graphics/Typeface;

    .line 166
    .line 167
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_d2

    .line 172
    .line 173
    iget v2, p0, Landroidx/media3/ui/C;->x:F

    .line 174
    .line 175
    cmpl-float v2, v2, p3

    .line 176
    .line 177
    if-nez v2, :cond_d2

    .line 178
    .line 179
    iget v2, p0, Landroidx/media3/ui/C;->y:F

    .line 180
    .line 181
    cmpl-float v2, v2, p4

    .line 182
    .line 183
    if-nez v2, :cond_d2

    .line 184
    .line 185
    iget v2, p0, Landroidx/media3/ui/C;->z:F

    .line 186
    .line 187
    cmpl-float v2, v2, p5

    .line 188
    .line 189
    if-nez v2, :cond_d2

    .line 190
    .line 191
    iget v2, p0, Landroidx/media3/ui/C;->A:I

    .line 192
    .line 193
    if-ne v2, p7, :cond_d2

    .line 194
    .line 195
    iget v2, p0, Landroidx/media3/ui/C;->B:I

    .line 196
    .line 197
    if-ne v2, p8, :cond_d2

    .line 198
    .line 199
    iget v2, p0, Landroidx/media3/ui/C;->C:I

    .line 200
    .line 201
    if-ne v2, p9, :cond_d2

    .line 202
    .line 203
    iget v2, p0, Landroidx/media3/ui/C;->D:I

    .line 204
    .line 205
    if-ne v2, p10, :cond_d2

    .line 206
    .line 207
    invoke-direct {p0, p6, v0}, Landroidx/media3/ui/C;->d(Landroid/graphics/Canvas;Z)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_d2
    iget-object v2, p1, Lax/R0/a;->a:Ljava/lang/CharSequence;

    .line 212
    .line 213
    iput-object v2, p0, Landroidx/media3/ui/C;->i:Ljava/lang/CharSequence;

    .line 214
    .line 215
    iget-object v2, p1, Lax/R0/a;->b:Landroid/text/Layout$Alignment;

    .line 216
    .line 217
    iput-object v2, p0, Landroidx/media3/ui/C;->j:Landroid/text/Layout$Alignment;

    .line 218
    .line 219
    iget-object v2, p1, Lax/R0/a;->d:Landroid/graphics/Bitmap;

    .line 220
    .line 221
    iput-object v2, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 222
    .line 223
    iget v2, p1, Lax/R0/a;->e:F

    .line 224
    .line 225
    iput v2, p0, Landroidx/media3/ui/C;->l:F

    .line 226
    .line 227
    iget v2, p1, Lax/R0/a;->f:I

    .line 228
    .line 229
    iput v2, p0, Landroidx/media3/ui/C;->m:I

    .line 230
    .line 231
    iget v2, p1, Lax/R0/a;->g:I

    .line 232
    .line 233
    iput v2, p0, Landroidx/media3/ui/C;->n:I

    .line 234
    .line 235
    iget v2, p1, Lax/R0/a;->h:F

    .line 236
    .line 237
    iput v2, p0, Landroidx/media3/ui/C;->o:F

    .line 238
    .line 239
    iget v2, p1, Lax/R0/a;->i:I

    .line 240
    .line 241
    iput v2, p0, Landroidx/media3/ui/C;->p:I

    .line 242
    .line 243
    iget v2, p1, Lax/R0/a;->j:F

    .line 244
    .line 245
    iput v2, p0, Landroidx/media3/ui/C;->q:F

    .line 246
    .line 247
    iget p1, p1, Lax/R0/a;->k:F

    .line 248
    .line 249
    iput p1, p0, Landroidx/media3/ui/C;->r:F

    .line 250
    .line 251
    iget p1, p2, Lax/a2/a;->a:I

    .line 252
    .line 253
    iput p1, p0, Landroidx/media3/ui/C;->s:I

    .line 254
    .line 255
    iget p1, p2, Lax/a2/a;->b:I

    .line 256
    .line 257
    iput p1, p0, Landroidx/media3/ui/C;->t:I

    .line 258
    .line 259
    iput v1, p0, Landroidx/media3/ui/C;->u:I

    .line 260
    .line 261
    iget p1, p2, Lax/a2/a;->d:I

    .line 262
    .line 263
    iput p1, p0, Landroidx/media3/ui/C;->w:I

    .line 264
    .line 265
    iget p1, p2, Lax/a2/a;->e:I

    .line 266
    .line 267
    iput p1, p0, Landroidx/media3/ui/C;->v:I

    .line 268
    .line 269
    iget-object p1, p0, Landroidx/media3/ui/C;->f:Landroid/text/TextPaint;

    .line 270
    .line 271
    iget-object p2, p2, Lax/a2/a;->f:Landroid/graphics/Typeface;

    .line 272
    .line 273
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 274
    .line 275
    .line 276
    iput p3, p0, Landroidx/media3/ui/C;->x:F

    .line 277
    .line 278
    iput p4, p0, Landroidx/media3/ui/C;->y:F

    .line 279
    .line 280
    iput p5, p0, Landroidx/media3/ui/C;->z:F

    .line 281
    .line 282
    iput p7, p0, Landroidx/media3/ui/C;->A:I

    .line 283
    .line 284
    iput p8, p0, Landroidx/media3/ui/C;->B:I

    .line 285
    .line 286
    iput p9, p0, Landroidx/media3/ui/C;->C:I

    .line 287
    .line 288
    iput p10, p0, Landroidx/media3/ui/C;->D:I

    .line 289
    .line 290
    if-eqz v0, :cond_12c

    .line 291
    .line 292
    iget-object p1, p0, Landroidx/media3/ui/C;->i:Ljava/lang/CharSequence;

    .line 293
    .line 294
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    invoke-direct {p0}, Landroidx/media3/ui/C;->g()V

    .line 298
    .line 299
    .line 300
    goto :goto_134

    .line 301
    :cond_12c
    iget-object p1, p0, Landroidx/media3/ui/C;->k:Landroid/graphics/Bitmap;

    .line 302
    .line 303
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    invoke-direct {p0}, Landroidx/media3/ui/C;->f()V

    .line 307
    .line 308
    .line 309
    :goto_134
    invoke-direct {p0, p6, v0}, Landroidx/media3/ui/C;->d(Landroid/graphics/Canvas;Z)V

    .line 310
    .line 311
    .line 312
    return-void
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
.end method
