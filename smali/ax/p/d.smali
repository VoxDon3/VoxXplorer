.class public Lax/p/d;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# static fields
.field private static final m:F


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:Z

.field private final g:Landroid/graphics/Path;

.field private final h:I

.field private i:Z

.field private j:F

.field private k:F

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    double-to-float v0, v0

    .line 11
    sput v0, Lax/p/d;->m:F

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static a(FFF)F
    .registers 3

    .line 1
    sub-float/2addr p1, p0

    .line 2
    mul-float p1, p1, p2

    .line 3
    .line 4
    add-float/2addr p0, p1

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


# virtual methods
.method public b(F)V
    .registers 3

    .line 1
    iget v0, p0, Lax/p/d;->j:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iput p1, p0, Lax/p/d;->j:F

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

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

.method public draw(Landroid/graphics/Canvas;)V
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, v0, Lax/p/d;->l:I

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v3, :cond_21

    .line 14
    .line 15
    if-eq v3, v5, :cond_20

    .line 16
    .line 17
    const/4 v6, 0x3

    .line 18
    if-eq v3, v6, :cond_1a

    .line 19
    .line 20
    invoke-static {v0}, Lax/U/a;->f(Landroid/graphics/drawable/Drawable;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ne v3, v5, :cond_21

    .line 25
    .line 26
    goto :goto_20

    .line 27
    :cond_1a
    invoke-static {v0}, Lax/U/a;->f(Landroid/graphics/drawable/Drawable;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_21

    .line 32
    .line 33
    :cond_20
    :goto_20
    const/4 v4, 0x1

    .line 34
    :cond_21
    iget v3, v0, Lax/p/d;->b:F

    .line 35
    .line 36
    mul-float v3, v3, v3

    .line 37
    .line 38
    const/high16 v6, 0x40000000    # 2.0f

    .line 39
    .line 40
    mul-float v3, v3, v6

    .line 41
    .line 42
    float-to-double v7, v3

    .line 43
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    double-to-float v3, v7

    .line 48
    iget v7, v0, Lax/p/d;->c:F

    .line 49
    .line 50
    iget v8, v0, Lax/p/d;->j:F

    .line 51
    .line 52
    invoke-static {v7, v3, v8}, Lax/p/d;->a(FFF)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget v7, v0, Lax/p/d;->c:F

    .line 57
    .line 58
    iget v8, v0, Lax/p/d;->d:F

    .line 59
    .line 60
    iget v9, v0, Lax/p/d;->j:F

    .line 61
    .line 62
    invoke-static {v7, v8, v9}, Lax/p/d;->a(FFF)F

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    iget v8, v0, Lax/p/d;->k:F

    .line 67
    .line 68
    iget v9, v0, Lax/p/d;->j:F

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    invoke-static {v10, v8, v9}, Lax/p/d;->a(FFF)F

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    int-to-float v8, v8

    .line 80
    sget v9, Lax/p/d;->m:F

    .line 81
    .line 82
    iget v11, v0, Lax/p/d;->j:F

    .line 83
    .line 84
    invoke-static {v10, v9, v11}, Lax/p/d;->a(FFF)F

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v4, :cond_5b

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    goto :goto_5d

    .line 92
    :cond_5b
    const/high16 v11, -0x3ccc0000    # -180.0f

    .line 93
    .line 94
    :goto_5d
    const/high16 v12, 0x43340000    # 180.0f

    .line 95
    .line 96
    if-eqz v4, :cond_64

    .line 97
    .line 98
    const/high16 v13, 0x43340000    # 180.0f

    .line 99
    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 v13, 0x0

    .line 102
    :goto_65
    iget v14, v0, Lax/p/d;->j:F

    .line 103
    .line 104
    invoke-static {v11, v13, v14}, Lax/p/d;->a(FFF)F

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    float-to-double v13, v3

    .line 109
    const/high16 v15, 0x40000000    # 2.0f

    .line 110
    .line 111
    float-to-double v5, v9

    .line 112
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v16

    .line 116
    mul-double v16, v16, v13

    .line 117
    .line 118
    move v9, v4

    .line 119
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    long-to-float v3, v3

    .line 124
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    mul-double v13, v13, v4

    .line 129
    .line 130
    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    long-to-float v4, v4

    .line 135
    iget-object v5, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 136
    .line 137
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 138
    .line 139
    .line 140
    iget v5, v0, Lax/p/d;->e:F

    .line 141
    .line 142
    iget-object v6, v0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    add-float/2addr v5, v6

    .line 149
    iget v6, v0, Lax/p/d;->k:F

    .line 150
    .line 151
    neg-float v6, v6

    .line 152
    iget v13, v0, Lax/p/d;->j:F

    .line 153
    .line 154
    invoke-static {v5, v6, v13}, Lax/p/d;->a(FFF)F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    neg-float v6, v7

    .line 159
    div-float/2addr v6, v15

    .line 160
    iget-object v13, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 161
    .line 162
    add-float v14, v6, v8

    .line 163
    .line 164
    invoke-virtual {v13, v14, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 165
    .line 166
    .line 167
    iget-object v13, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 168
    .line 169
    mul-float v8, v8, v15

    .line 170
    .line 171
    sub-float/2addr v7, v8

    .line 172
    invoke-virtual {v13, v7, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 173
    .line 174
    .line 175
    iget-object v7, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 176
    .line 177
    invoke-virtual {v7, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 178
    .line 179
    .line 180
    iget-object v7, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 181
    .line 182
    invoke-virtual {v7, v3, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 183
    .line 184
    .line 185
    iget-object v7, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 186
    .line 187
    neg-float v5, v5

    .line 188
    invoke-virtual {v7, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 189
    .line 190
    .line 191
    iget-object v5, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 192
    .line 193
    neg-float v4, v4

    .line 194
    invoke-virtual {v5, v3, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 195
    .line 196
    .line 197
    iget-object v3, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 198
    .line 199
    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 203
    .line 204
    .line 205
    iget-object v3, v0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 206
    .line 207
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    int-to-float v4, v4

    .line 216
    const/high16 v5, 0x40400000    # 3.0f

    .line 217
    .line 218
    mul-float v5, v5, v3

    .line 219
    .line 220
    sub-float/2addr v4, v5

    .line 221
    iget v5, v0, Lax/p/d;->e:F

    .line 222
    .line 223
    mul-float v6, v5, v15

    .line 224
    .line 225
    sub-float/2addr v4, v6

    .line 226
    float-to-int v4, v4

    .line 227
    div-int/lit8 v4, v4, 0x4

    .line 228
    .line 229
    mul-int/lit8 v4, v4, 0x2

    .line 230
    .line 231
    int-to-float v4, v4

    .line 232
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 233
    .line 234
    mul-float v3, v3, v6

    .line 235
    .line 236
    add-float/2addr v3, v5

    .line 237
    add-float/2addr v4, v3

    .line 238
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    int-to-float v2, v2

    .line 243
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 244
    .line 245
    .line 246
    iget-boolean v2, v0, Lax/p/d;->f:Z

    .line 247
    .line 248
    if-eqz v2, :cond_108

    .line 249
    .line 250
    iget-boolean v2, v0, Lax/p/d;->i:Z

    .line 251
    .line 252
    xor-int/2addr v2, v9

    .line 253
    if-eqz v2, :cond_100

    .line 254
    .line 255
    const/4 v5, -0x1

    .line 256
    goto :goto_101

    .line 257
    :cond_100
    const/4 v5, 0x1

    .line 258
    :goto_101
    int-to-float v2, v5

    .line 259
    mul-float v11, v11, v2

    .line 260
    .line 261
    invoke-virtual {v1, v11}, Landroid/graphics/Canvas;->rotate(F)V

    .line 262
    .line 263
    .line 264
    goto :goto_10d

    .line 265
    :cond_108
    if-eqz v9, :cond_10d

    .line 266
    .line 267
    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->rotate(F)V

    .line 268
    .line 269
    .line 270
    :cond_10d
    :goto_10d
    iget-object v2, v0, Lax/p/d;->g:Landroid/graphics/Path;

    .line 271
    .line 272
    iget-object v3, v0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 273
    .line 274
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 278
    .line 279
    .line 280
    return-void
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

.method public getIntrinsicHeight()I
    .registers 2

    .line 1
    iget v0, p0, Lax/p/d;->h:I

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

.method public getIntrinsicWidth()I
    .registers 2

    .line 1
    iget v0, p0, Lax/p/d;->h:I

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

.method public getOpacity()I
    .registers 2

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
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

.method public setAlpha(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq p1, v0, :cond_10

    .line 8
    .line 9
    iget-object v0, p0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/p/d;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
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
