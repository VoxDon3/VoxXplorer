.class public Lcom/voxdon/xplorer/widget/PieProgress;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/RectF;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/widget/PieProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    .line 2
    iput p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const v0, -0x77000001

    .line 3
    iput v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v2, Lax/Q2/n;->D1:[I

    invoke-virtual {p1, p2, v2, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    :try_start_18
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const/4 v2, 0x2

    if-ne v1, p3, :cond_2d

    .line 8
    iput v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    goto :goto_3d

    :catchall_2b
    move-exception p2

    goto :goto_4d

    .line 9
    :cond_2d
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result p3

    .line 10
    iget v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    div-int/2addr p3, v2

    shl-int/lit8 p3, p3, 0x18

    or-int/2addr p3, v0

    iput p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    .line 11
    :goto_3d
    iget p3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    if-lez p3, :cond_44

    .line 12
    iput p2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    goto :goto_46

    .line 13
    :cond_44
    iput v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I
    :try_end_46
    .catchall {:try_start_18 .. :try_end_46} :catchall_2b

    .line 14
    :goto_46
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/PieProgress;->a()V

    return-void

    .line 16
    :goto_4d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    throw p2
.end method

.method private a()V
    .registers 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public b(II)V
    .registers 5

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    .line 2
    .line 3
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0xffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, v1

    .line 11
    div-int/2addr v0, p2

    .line 12
    shl-int/lit8 p2, v0, 0x18

    .line 13
    .line 14
    or-int/2addr p1, p2

    .line 15
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 16

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sub-int/2addr v1, v2

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-int/2addr v1, v2

    .line 22
    if-ge v0, v1, :cond_18

    .line 23
    .line 24
    goto :goto_19

    .line 25
    :cond_18
    move v0, v1

    .line 26
    :goto_19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 35
    .line 36
    int-to-float v3, v3

    .line 37
    const/high16 v4, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v3, v4

    .line 40
    iget v5, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    if-ne v5, v6, :cond_74

    .line 44
    .line 45
    iget-object v4, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 46
    .line 47
    int-to-float v5, v1

    .line 48
    add-float/2addr v5, v3

    .line 49
    int-to-float v6, v2

    .line 50
    add-float/2addr v6, v3

    .line 51
    add-int/2addr v1, v0

    .line 52
    int-to-float v1, v1

    .line 53
    sub-float/2addr v1, v3

    .line 54
    add-int/2addr v2, v0

    .line 55
    int-to-float v0, v2

    .line 56
    sub-float/2addr v0, v3

    .line 57
    invoke-virtual {v4, v5, v6, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 61
    .line 62
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 68
    .line 69
    iget v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 70
    .line 71
    int-to-float v1, v1

    .line 72
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 76
    .line 77
    iget v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 80
    .line 81
    .line 82
    iget-object v3, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    iget-object v7, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    const/high16 v5, 0x43b40000    # 360.0f

    .line 89
    .line 90
    move-object v2, p1

    .line 91
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    move-object v8, v2

    .line 95
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 96
    .line 97
    iget v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 100
    .line 101
    .line 102
    iget-object v9, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 103
    .line 104
    iget p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 105
    .line 106
    int-to-float v11, p1

    .line 107
    const/4 v12, 0x0

    .line 108
    iget-object v13, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 109
    .line 110
    const/high16 v10, -0x3d4c0000    # -90.0f

    .line 111
    .line 112
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_ef

    .line 116
    .line 117
    :cond_74
    move-object v8, p1

    .line 118
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 119
    .line 120
    int-to-float v5, v1

    .line 121
    int-to-float v6, v2

    .line 122
    add-int/2addr v1, v0

    .line 123
    int-to-float v1, v1

    .line 124
    add-int/2addr v2, v0

    .line 125
    int-to-float v0, v2

    .line 126
    invoke-virtual {p1, v5, v6, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 130
    .line 131
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 132
    .line 133
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 137
    .line 138
    iget v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->e:I

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 150
    .line 151
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    iget-object v7, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 156
    .line 157
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    div-float/2addr v7, v4

    .line 162
    iget-object v9, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 163
    .line 164
    invoke-virtual {v8, p1, v2, v7, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 168
    .line 169
    iget v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->d:I

    .line 170
    .line 171
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    iget-object v9, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 175
    .line 176
    iget p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 177
    .line 178
    int-to-float v11, p1

    .line 179
    const/4 v12, 0x1

    .line 180
    iget-object v13, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 181
    .line 182
    const/high16 v10, -0x3d4c0000    # -90.0f

    .line 183
    .line 184
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    iget p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    .line 188
    .line 189
    const/4 v2, 0x3

    .line 190
    if-ne p1, v2, :cond_ef

    .line 191
    .line 192
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 193
    .line 194
    add-float/2addr v5, v3

    .line 195
    add-float/2addr v6, v3

    .line 196
    sub-float/2addr v1, v3

    .line 197
    sub-float/2addr v0, v3

    .line 198
    invoke-virtual {p1, v5, v6, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 202
    .line 203
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 204
    .line 205
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 209
    .line 210
    iget v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 211
    .line 212
    int-to-float v0, v0

    .line 213
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->b:Landroid/graphics/RectF;

    .line 229
    .line 230
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    div-float/2addr v1, v4

    .line 235
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/PieProgress;->a:Landroid/graphics/Paint;

    .line 236
    .line 237
    invoke-virtual {v8, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 238
    .line 239
    .line 240
    :cond_ef
    :goto_ef
    invoke-virtual {v8}, Landroid/graphics/Canvas;->restore()V

    .line 241
    .line 242
    .line 243
    return-void
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

.method public setProgressAngle(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public setProgressPercent(I)V
    .registers 2

    .line 1
    mul-int/lit16 p1, p1, 0x168

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x64

    .line 4
    .line 5
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
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

.method public setStrokeWidth(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->f:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public setStyle(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/PieProgress;->g:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
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
