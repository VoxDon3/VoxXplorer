.class Lax/K/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lax/K/k;",
        ">;"
    }
.end annotation


# static fields
.field static t0:[Ljava/lang/String;


# instance fields
.field c0:I

.field d0:F

.field e0:F

.field f0:F

.field g0:F

.field h0:F

.field i0:F

.field j0:F

.field k0:F

.field l0:I

.field m0:I

.field n0:F

.field o0:Lax/K/g;

.field p0:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/widget/b;",
            ">;"
        }
    .end annotation
.end field

.field q:Lax/F/b;

.field q0:I

.field r0:[D

.field s0:[D


# direct methods
.method static constructor <clinit>()V
    .registers 6

    .line 1
    const-string v4, "height"

    .line 2
    .line 3
    const-string v5, "pathRotate"

    .line 4
    .line 5
    const-string v0, "position"

    .line 6
    .line 7
    const-string v1, "x"

    .line 8
    .line 9
    const-string v2, "y"

    .line 10
    .line 11
    const-string v3, "width"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/K/k;->t0:[Ljava/lang/String;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/K/k;->c0:I

    .line 6
    .line 7
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 8
    .line 9
    iput v1, p0, Lax/K/k;->j0:F

    .line 10
    .line 11
    iput v1, p0, Lax/K/k;->k0:F

    .line 12
    .line 13
    sget v2, Lax/K/d;->a:I

    .line 14
    .line 15
    iput v2, p0, Lax/K/k;->l0:I

    .line 16
    .line 17
    iput v2, p0, Lax/K/k;->m0:I

    .line 18
    .line 19
    iput v1, p0, Lax/K/k;->n0:F

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lax/K/k;->o0:Lax/K/g;

    .line 23
    .line 24
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lax/K/k;->p0:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    iput v0, p0, Lax/K/k;->q0:I

    .line 32
    .line 33
    const/16 v0, 0x12

    .line 34
    .line 35
    new-array v1, v0, [D

    .line 36
    .line 37
    iput-object v1, p0, Lax/K/k;->r0:[D

    .line 38
    .line 39
    new-array v0, v0, [D

    .line 40
    .line 41
    iput-object v0, p0, Lax/K/k;->s0:[D

    .line 42
    .line 43
    return-void
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


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lax/K/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/K/k;->d(Lax/K/k;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public d(Lax/K/k;)I
    .registers 3

    .line 1
    iget v0, p0, Lax/K/k;->e0:F

    .line 2
    .line 3
    iget p1, p1, Lax/K/k;->e0:F

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method h(D[I[D[F[D[F)V
    .registers 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget v2, v0, Lax/K/k;->f0:F

    .line 6
    .line 7
    iget v3, v0, Lax/K/k;->g0:F

    .line 8
    .line 9
    iget v4, v0, Lax/K/k;->h0:F

    .line 10
    .line 11
    iget v5, v0, Lax/K/k;->i0:F

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x0

    .line 18
    :goto_11
    array-length v13, v1

    .line 19
    const/4 v15, 0x1

    .line 20
    if-ge v8, v13, :cond_3c

    .line 21
    .line 22
    const/4 v13, 0x0

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    aget-wide v6, p4, v8

    .line 26
    .line 27
    double-to-float v6, v6

    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    aget-wide v13, p6, v8

    .line 31
    .line 32
    double-to-float v13, v13

    .line 33
    aget v14, v1, v8

    .line 34
    .line 35
    if-eq v14, v15, :cond_37

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    if-eq v14, v7, :cond_34

    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    if-eq v14, v7, :cond_31

    .line 42
    .line 43
    const/4 v7, 0x4

    .line 44
    if-eq v14, v7, :cond_2e

    .line 45
    .line 46
    goto :goto_39

    .line 47
    :cond_2e
    move v5, v6

    .line 48
    move v12, v13

    .line 49
    goto :goto_39

    .line 50
    :cond_31
    move v4, v6

    .line 51
    move v10, v13

    .line 52
    goto :goto_39

    .line 53
    :cond_34
    move v3, v6

    .line 54
    move v11, v13

    .line 55
    goto :goto_39

    .line 56
    :cond_37
    move v2, v6

    .line 57
    move v9, v13

    .line 58
    :goto_39
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_11

    .line 61
    :cond_3c
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/high16 v1, 0x40000000    # 2.0f

    .line 66
    .line 67
    div-float/2addr v10, v1

    .line 68
    add-float/2addr v10, v9

    .line 69
    div-float/2addr v12, v1

    .line 70
    add-float/2addr v12, v11

    .line 71
    iget-object v6, v0, Lax/K/k;->o0:Lax/K/g;

    .line 72
    .line 73
    if-eqz v6, :cond_a3

    .line 74
    .line 75
    const/4 v7, 0x2

    .line 76
    new-array v8, v7, [F

    .line 77
    .line 78
    new-array v7, v7, [F

    .line 79
    .line 80
    move-wide/from16 v12, p1

    .line 81
    .line 82
    invoke-virtual {v6, v12, v13, v8, v7}, Lax/K/g;->b(D[F[F)V

    .line 83
    .line 84
    .line 85
    aget v6, v8, v16

    .line 86
    .line 87
    aget v8, v8, v15

    .line 88
    .line 89
    aget v10, v7, v16

    .line 90
    .line 91
    aget v7, v7, v15

    .line 92
    .line 93
    float-to-double v12, v6

    .line 94
    const/high16 p3, 0x40000000    # 2.0f

    .line 95
    .line 96
    float-to-double v1, v2

    .line 97
    move-wide/from16 p1, v1

    .line 98
    .line 99
    float-to-double v0, v3

    .line 100
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    mul-double v2, v2, p1

    .line 105
    .line 106
    add-double/2addr v12, v2

    .line 107
    div-float v2, v4, p3

    .line 108
    .line 109
    float-to-double v2, v2

    .line 110
    sub-double/2addr v12, v2

    .line 111
    double-to-float v2, v12

    .line 112
    float-to-double v12, v8

    .line 113
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v18

    .line 117
    mul-double v18, v18, p1

    .line 118
    .line 119
    sub-double v12, v12, v18

    .line 120
    .line 121
    div-float v3, v5, p3

    .line 122
    .line 123
    move-wide/from16 v18, v0

    .line 124
    .line 125
    float-to-double v0, v3

    .line 126
    sub-double/2addr v12, v0

    .line 127
    double-to-float v3, v12

    .line 128
    float-to-double v0, v10

    .line 129
    float-to-double v8, v9

    .line 130
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide v12

    .line 134
    mul-double v12, v12, v8

    .line 135
    .line 136
    add-double/2addr v0, v12

    .line 137
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    .line 138
    .line 139
    .line 140
    move-result-wide v12

    .line 141
    float-to-double v10, v11

    .line 142
    mul-double v12, v12, v10

    .line 143
    .line 144
    add-double/2addr v0, v12

    .line 145
    double-to-float v0, v0

    .line 146
    float-to-double v6, v7

    .line 147
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    mul-double v8, v8, v12

    .line 152
    .line 153
    sub-double/2addr v6, v8

    .line 154
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    mul-double v8, v8, v10

    .line 159
    .line 160
    add-double/2addr v6, v8

    .line 161
    double-to-float v12, v6

    .line 162
    move v10, v0

    .line 163
    goto :goto_a5

    .line 164
    :cond_a3
    const/high16 p3, 0x40000000    # 2.0f

    .line 165
    .line 166
    :goto_a5
    div-float v4, v4, p3

    .line 167
    .line 168
    add-float/2addr v2, v4

    .line 169
    add-float v2, v2, v17

    .line 170
    .line 171
    aput v2, p5, v16

    .line 172
    .line 173
    div-float v5, v5, p3

    .line 174
    .line 175
    add-float/2addr v3, v5

    .line 176
    add-float v3, v3, v17

    .line 177
    .line 178
    aput v3, p5, v15

    .line 179
    .line 180
    aput v10, p7, v16

    .line 181
    .line 182
    aput v12, p7, v15

    .line 183
    .line 184
    return-void
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
.end method

.method j(FLandroid/view/View;[I[D[D[DZ)V
    .registers 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v4, v0, Lax/K/k;->f0:F

    .line 8
    .line 9
    iget v5, v0, Lax/K/k;->g0:F

    .line 10
    .line 11
    iget v6, v0, Lax/K/k;->h0:F

    .line 12
    .line 13
    iget v7, v0, Lax/K/k;->i0:F

    .line 14
    .line 15
    array-length v8, v2

    .line 16
    const/4 v9, 0x1

    .line 17
    if-eqz v8, :cond_28

    .line 18
    .line 19
    iget-object v8, v0, Lax/K/k;->r0:[D

    .line 20
    .line 21
    array-length v8, v8

    .line 22
    array-length v10, v2

    .line 23
    sub-int/2addr v10, v9

    .line 24
    aget v10, v2, v10

    .line 25
    .line 26
    if-gt v8, v10, :cond_28

    .line 27
    .line 28
    array-length v8, v2

    .line 29
    sub-int/2addr v8, v9

    .line 30
    aget v8, v2, v8

    .line 31
    .line 32
    add-int/2addr v8, v9

    .line 33
    new-array v10, v8, [D

    .line 34
    .line 35
    iput-object v10, v0, Lax/K/k;->r0:[D

    .line 36
    .line 37
    new-array v8, v8, [D

    .line 38
    .line 39
    iput-object v8, v0, Lax/K/k;->s0:[D

    .line 40
    .line 41
    :cond_28
    iget-object v8, v0, Lax/K/k;->r0:[D

    .line 42
    .line 43
    const-wide/high16 v10, 0x7ff8000000000000L    # Double.NaN

    .line 44
    .line 45
    invoke-static {v8, v10, v11}, Ljava/util/Arrays;->fill([DD)V

    .line 46
    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_30
    array-length v11, v2

    .line 50
    if-ge v10, v11, :cond_44

    .line 51
    .line 52
    iget-object v11, v0, Lax/K/k;->r0:[D

    .line 53
    .line 54
    aget v12, v2, v10

    .line 55
    .line 56
    aget-wide v13, p4, v10

    .line 57
    .line 58
    aput-wide v13, v11, v12

    .line 59
    .line 60
    iget-object v11, v0, Lax/K/k;->s0:[D

    .line 61
    .line 62
    aget-wide v13, p5, v10

    .line 63
    .line 64
    aput-wide v13, v11, v12

    .line 65
    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    goto :goto_30

    .line 69
    :cond_44
    const/high16 v10, 0x7fc00000    # Float.NaN

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const/4 v15, 0x0

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    :goto_4d
    iget-object v8, v0, Lax/K/k;->r0:[D

    .line 79
    .line 80
    array-length v2, v8

    .line 81
    if-ge v11, v2, :cond_b2

    .line 82
    .line 83
    aget-wide v18, v8, v11

    .line 84
    .line 85
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isNaN(D)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const-wide/16 v18, 0x0

    .line 90
    .line 91
    if-eqz v2, :cond_67

    .line 92
    .line 93
    if-eqz p6, :cond_64

    .line 94
    .line 95
    aget-wide v20, p6, v11

    .line 96
    .line 97
    cmpl-double v2, v20, v18

    .line 98
    .line 99
    if-nez v2, :cond_67

    .line 100
    .line 101
    :cond_64
    move/from16 p4, v10

    .line 102
    .line 103
    goto :goto_96

    .line 104
    :cond_67
    if-eqz p6, :cond_6b

    .line 105
    .line 106
    aget-wide v18, p6, v11

    .line 107
    .line 108
    :cond_6b
    iget-object v2, v0, Lax/K/k;->r0:[D

    .line 109
    .line 110
    aget-wide v20, v2, v11

    .line 111
    .line 112
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->isNaN(D)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_7a

    .line 117
    .line 118
    :goto_75
    move/from16 p4, v10

    .line 119
    .line 120
    move-wide/from16 v9, v18

    .line 121
    .line 122
    goto :goto_81

    .line 123
    :cond_7a
    iget-object v2, v0, Lax/K/k;->r0:[D

    .line 124
    .line 125
    aget-wide v20, v2, v11

    .line 126
    .line 127
    add-double v18, v20, v18

    .line 128
    .line 129
    goto :goto_75

    .line 130
    :goto_81
    double-to-float v8, v9

    .line 131
    iget-object v9, v0, Lax/K/k;->s0:[D

    .line 132
    .line 133
    aget-wide v2, v9, v11

    .line 134
    .line 135
    double-to-float v2, v2

    .line 136
    const/4 v3, 0x1

    .line 137
    if-eq v11, v3, :cond_aa

    .line 138
    .line 139
    const/4 v10, 0x2

    .line 140
    if-eq v11, v10, :cond_a5

    .line 141
    .line 142
    const/4 v3, 0x3

    .line 143
    if-eq v11, v3, :cond_a0

    .line 144
    .line 145
    const/4 v3, 0x4

    .line 146
    if-eq v11, v3, :cond_9b

    .line 147
    .line 148
    const/4 v2, 0x5

    .line 149
    if-eq v11, v2, :cond_99

    .line 150
    .line 151
    :goto_96
    move/from16 v10, p4

    .line 152
    .line 153
    goto :goto_ae

    .line 154
    :cond_99
    move v10, v8

    .line 155
    goto :goto_ae

    .line 156
    :cond_9b
    move/from16 v10, p4

    .line 157
    .line 158
    move v15, v2

    .line 159
    move v7, v8

    .line 160
    goto :goto_ae

    .line 161
    :cond_a0
    move/from16 v10, p4

    .line 162
    .line 163
    move v14, v2

    .line 164
    move v6, v8

    .line 165
    goto :goto_ae

    .line 166
    :cond_a5
    move/from16 v10, p4

    .line 167
    .line 168
    move v13, v2

    .line 169
    move v5, v8

    .line 170
    goto :goto_ae

    .line 171
    :cond_aa
    move/from16 v10, p4

    .line 172
    .line 173
    move v12, v2

    .line 174
    move v4, v8

    .line 175
    :goto_ae
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    const/4 v9, 0x1

    .line 178
    goto :goto_4d

    .line 179
    :cond_b2
    move/from16 p4, v10

    .line 180
    .line 181
    iget-object v3, v0, Lax/K/k;->o0:Lax/K/g;

    .line 182
    .line 183
    const/high16 v8, 0x40000000    # 2.0f

    .line 184
    .line 185
    if-eqz v3, :cond_13d

    .line 186
    .line 187
    const/4 v2, 0x2

    .line 188
    new-array v9, v2, [F

    .line 189
    .line 190
    new-array v10, v2, [F

    .line 191
    .line 192
    move/from16 v11, p1

    .line 193
    .line 194
    float-to-double v14, v11

    .line 195
    invoke-virtual {v3, v14, v15, v9, v10}, Lax/K/g;->b(D[F[F)V

    .line 196
    .line 197
    .line 198
    aget v3, v9, v16

    .line 199
    .line 200
    const/16 v17, 0x1

    .line 201
    .line 202
    aget v9, v9, v17

    .line 203
    .line 204
    aget v11, v10, v16

    .line 205
    .line 206
    aget v10, v10, v17

    .line 207
    .line 208
    float-to-double v14, v3

    .line 209
    float-to-double v3, v4

    .line 210
    move-wide/from16 v18, v3

    .line 211
    .line 212
    float-to-double v2, v5

    .line 213
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 214
    .line 215
    .line 216
    move-result-wide v4

    .line 217
    mul-double v4, v4, v18

    .line 218
    .line 219
    add-double/2addr v14, v4

    .line 220
    div-float v4, v6, v8

    .line 221
    .line 222
    float-to-double v4, v4

    .line 223
    sub-double/2addr v14, v4

    .line 224
    double-to-float v4, v14

    .line 225
    float-to-double v14, v9

    .line 226
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 227
    .line 228
    .line 229
    move-result-wide v20

    .line 230
    mul-double v20, v20, v18

    .line 231
    .line 232
    sub-double v14, v14, v20

    .line 233
    .line 234
    div-float v5, v7, v8

    .line 235
    .line 236
    float-to-double v8, v5

    .line 237
    sub-double/2addr v14, v8

    .line 238
    double-to-float v5, v14

    .line 239
    float-to-double v8, v11

    .line 240
    float-to-double v11, v12

    .line 241
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 242
    .line 243
    .line 244
    move-result-wide v14

    .line 245
    mul-double v14, v14, v11

    .line 246
    .line 247
    add-double/2addr v8, v14

    .line 248
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 249
    .line 250
    .line 251
    move-result-wide v14

    .line 252
    mul-double v14, v14, v18

    .line 253
    .line 254
    move-wide/from16 v20, v2

    .line 255
    .line 256
    float-to-double v2, v13

    .line 257
    mul-double v14, v14, v2

    .line 258
    .line 259
    add-double/2addr v8, v14

    .line 260
    double-to-float v8, v8

    .line 261
    float-to-double v9, v10

    .line 262
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->cos(D)D

    .line 263
    .line 264
    .line 265
    move-result-wide v13

    .line 266
    mul-double v11, v11, v13

    .line 267
    .line 268
    sub-double/2addr v9, v11

    .line 269
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sin(D)D

    .line 270
    .line 271
    .line 272
    move-result-wide v11

    .line 273
    mul-double v11, v11, v18

    .line 274
    .line 275
    mul-double v11, v11, v2

    .line 276
    .line 277
    add-double/2addr v9, v11

    .line 278
    double-to-float v2, v9

    .line 279
    move-object/from16 v3, p5

    .line 280
    .line 281
    array-length v9, v3

    .line 282
    const/4 v10, 0x2

    .line 283
    if-lt v9, v10, :cond_124

    .line 284
    .line 285
    float-to-double v9, v8

    .line 286
    aput-wide v9, v3, v16

    .line 287
    .line 288
    float-to-double v9, v2

    .line 289
    const/16 v17, 0x1

    .line 290
    .line 291
    aput-wide v9, v3, v17

    .line 292
    .line 293
    :cond_124
    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->isNaN(F)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-nez v3, :cond_15c

    .line 298
    .line 299
    move/from16 v10, p4

    .line 300
    .line 301
    float-to-double v9, v10

    .line 302
    float-to-double v2, v2

    .line 303
    float-to-double v11, v8

    .line 304
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 305
    .line 306
    .line 307
    move-result-wide v2

    .line 308
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 309
    .line 310
    .line 311
    move-result-wide v2

    .line 312
    add-double/2addr v9, v2

    .line 313
    double-to-float v2, v9

    .line 314
    invoke-virtual {v1, v2}, Landroid/view/View;->setRotation(F)V

    .line 315
    .line 316
    .line 317
    goto :goto_15c

    .line 318
    :cond_13d
    move/from16 v10, p4

    .line 319
    .line 320
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-nez v2, :cond_15c

    .line 325
    .line 326
    div-float/2addr v14, v8

    .line 327
    add-float/2addr v12, v14

    .line 328
    div-float/2addr v15, v8

    .line 329
    add-float/2addr v13, v15

    .line 330
    const/4 v2, 0x0

    .line 331
    float-to-double v2, v2

    .line 332
    float-to-double v8, v10

    .line 333
    float-to-double v10, v13

    .line 334
    float-to-double v12, v12

    .line 335
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 336
    .line 337
    .line 338
    move-result-wide v10

    .line 339
    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    .line 340
    .line 341
    .line 342
    move-result-wide v10

    .line 343
    add-double/2addr v8, v10

    .line 344
    add-double/2addr v2, v8

    .line 345
    double-to-float v2, v2

    .line 346
    invoke-virtual {v1, v2}, Landroid/view/View;->setRotation(F)V

    .line 347
    .line 348
    .line 349
    :cond_15c
    :goto_15c
    instance-of v2, v1, Lax/K/c;

    .line 350
    .line 351
    if-eqz v2, :cond_168

    .line 352
    .line 353
    add-float/2addr v6, v4

    .line 354
    add-float/2addr v7, v5

    .line 355
    check-cast v1, Lax/K/c;

    .line 356
    .line 357
    invoke-interface {v1, v4, v5, v6, v7}, Lax/K/c;->a(FFFF)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_168
    const/high16 v2, 0x3f000000    # 0.5f

    .line 362
    .line 363
    add-float/2addr v4, v2

    .line 364
    float-to-int v3, v4

    .line 365
    add-float/2addr v5, v2

    .line 366
    float-to-int v2, v5

    .line 367
    add-float/2addr v4, v6

    .line 368
    float-to-int v4, v4

    .line 369
    add-float/2addr v5, v7

    .line 370
    float-to-int v5, v5

    .line 371
    sub-int v6, v4, v3

    .line 372
    .line 373
    sub-int v7, v5, v2

    .line 374
    .line 375
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-ne v6, v8, :cond_185

    .line 380
    .line 381
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eq v7, v8, :cond_183

    .line 386
    .line 387
    goto :goto_185

    .line 388
    :cond_183
    if-eqz p7, :cond_192

    .line 389
    .line 390
    :cond_185
    :goto_185
    const/high16 v8, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-static {v6, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    invoke-virtual {v1, v6, v7}, Landroid/view/View;->measure(II)V

    .line 401
    .line 402
    .line 403
    :cond_192
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/view/View;->layout(IIII)V

    .line 404
    .line 405
    .line 406
    return-void
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
.end method
