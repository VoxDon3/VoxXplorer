.class final Lax/p1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/p1/e$b;,
        Lax/p1/e$a;
    }
.end annotation


# instance fields
.field public final a:Lax/p1/e$a;

.field public final b:Lax/p1/e$a;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lax/p1/e$a;I)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p1, p2}, Lax/p1/e;-><init>(Lax/p1/e$a;Lax/p1/e$a;I)V

    return-void
.end method

.method public constructor <init>(Lax/p1/e$a;Lax/p1/e$a;I)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/p1/e;->a:Lax/p1/e$a;

    .line 4
    iput-object p2, p0, Lax/p1/e;->b:Lax/p1/e$a;

    .line 5
    iput p3, p0, Lax/p1/e;->c:I

    if-ne p1, p2, :cond_d

    const/4 p1, 0x1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    .line 6
    :goto_e
    iput-boolean p1, p0, Lax/p1/e;->d:Z

    return-void
.end method

.method public static a(FIIFFI)Lax/p1/e;
    .registers 39

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    cmpl-float v10, v0, v9

    .line 16
    .line 17
    if-lez v10, :cond_14

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v10, 0x0

    .line 22
    :goto_15
    invoke-static {v10}, Lax/S0/a;->a(Z)V

    .line 23
    .line 24
    .line 25
    if-lt v1, v8, :cond_1c

    .line 26
    .line 27
    const/4 v10, 0x1

    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    const/4 v10, 0x0

    .line 30
    :goto_1d
    invoke-static {v10}, Lax/S0/a;->a(Z)V

    .line 31
    .line 32
    .line 33
    if-lt v2, v8, :cond_24

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    const/4 v10, 0x0

    .line 38
    :goto_25
    invoke-static {v10}, Lax/S0/a;->a(Z)V

    .line 39
    .line 40
    .line 41
    cmpl-float v10, v3, v9

    .line 42
    .line 43
    if-lez v10, :cond_34

    .line 44
    .line 45
    const/high16 v10, 0x43340000    # 180.0f

    .line 46
    .line 47
    cmpg-float v10, v3, v10

    .line 48
    .line 49
    if-gtz v10, :cond_34

    .line 50
    .line 51
    const/4 v10, 0x1

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    const/4 v10, 0x0

    .line 54
    :goto_35
    invoke-static {v10}, Lax/S0/a;->a(Z)V

    .line 55
    .line 56
    .line 57
    cmpl-float v9, v4, v9

    .line 58
    .line 59
    if-lez v9, :cond_44

    .line 60
    .line 61
    const/high16 v9, 0x43b40000    # 360.0f

    .line 62
    .line 63
    cmpg-float v9, v4, v9

    .line 64
    .line 65
    if-gtz v9, :cond_44

    .line 66
    .line 67
    const/4 v9, 0x1

    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v9, 0x0

    .line 70
    :goto_45
    invoke-static {v9}, Lax/S0/a;->a(Z)V

    .line 71
    .line 72
    .line 73
    float-to-double v9, v3

    .line 74
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    double-to-float v3, v9

    .line 79
    float-to-double v9, v4

    .line 80
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    double-to-float v4, v9

    .line 85
    int-to-float v9, v1

    .line 86
    div-float v9, v3, v9

    .line 87
    .line 88
    int-to-float v10, v2

    .line 89
    div-float v10, v4, v10

    .line 90
    .line 91
    add-int/lit8 v11, v2, 0x1

    .line 92
    .line 93
    mul-int/lit8 v12, v11, 0x2

    .line 94
    .line 95
    add-int/2addr v12, v6

    .line 96
    mul-int v12, v12, v1

    .line 97
    .line 98
    mul-int/lit8 v13, v12, 0x3

    .line 99
    .line 100
    new-array v13, v13, [F

    .line 101
    .line 102
    mul-int/lit8 v12, v12, 0x2

    .line 103
    .line 104
    new-array v12, v12, [F

    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    :goto_6d
    if-ge v14, v1, :cond_149

    .line 111
    .line 112
    int-to-float v7, v14

    .line 113
    mul-float v7, v7, v9

    .line 114
    .line 115
    const/high16 v17, 0x40000000    # 2.0f

    .line 116
    .line 117
    div-float v18, v3, v17

    .line 118
    .line 119
    sub-float v7, v7, v18

    .line 120
    .line 121
    const/16 v19, 0x3

    .line 122
    .line 123
    add-int/lit8 v5, v14, 0x1

    .line 124
    .line 125
    const/16 v20, 0x1

    .line 126
    .line 127
    int-to-float v8, v5

    .line 128
    mul-float v8, v8, v9

    .line 129
    .line 130
    sub-float v8, v8, v18

    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    :goto_84
    if-ge v6, v11, :cond_13e

    .line 134
    .line 135
    move/from16 p3, v3

    .line 136
    .line 137
    move/from16 p4, v4

    .line 138
    .line 139
    move/from16 v1, v16

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    :goto_8d
    const/4 v4, 0x2

    .line 143
    if-ge v3, v4, :cond_122

    .line 144
    .line 145
    if-nez v3, :cond_96

    .line 146
    .line 147
    move v4, v7

    .line 148
    :goto_93
    move/from16 v21, v5

    .line 149
    .line 150
    goto :goto_98

    .line 151
    :cond_96
    move v4, v8

    .line 152
    goto :goto_93

    .line 153
    :goto_98
    int-to-float v5, v6

    .line 154
    mul-float v5, v5, v10

    .line 155
    .line 156
    const v16, 0x40490fdb    # (float)Math.PI

    .line 157
    .line 158
    .line 159
    add-float v16, v5, v16

    .line 160
    .line 161
    div-float v22, p4, v17

    .line 162
    .line 163
    move/from16 v23, v5

    .line 164
    .line 165
    sub-float v5, v16, v22

    .line 166
    .line 167
    add-int/lit8 v16, v15, 0x1

    .line 168
    .line 169
    move/from16 v22, v7

    .line 170
    .line 171
    move/from16 v24, v8

    .line 172
    .line 173
    float-to-double v7, v0

    .line 174
    move-wide/from16 v25, v7

    .line 175
    .line 176
    float-to-double v7, v5

    .line 177
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v27

    .line 181
    mul-double v27, v27, v25

    .line 182
    .line 183
    float-to-double v4, v4

    .line 184
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 185
    .line 186
    .line 187
    move-result-wide v29

    .line 188
    move-wide/from16 v31, v4

    .line 189
    .line 190
    mul-double v4, v27, v29

    .line 191
    .line 192
    double-to-float v4, v4

    .line 193
    neg-float v4, v4

    .line 194
    aput v4, v13, v15

    .line 195
    .line 196
    const/16 v18, 0x2

    .line 197
    .line 198
    add-int/lit8 v4, v15, 0x2

    .line 199
    .line 200
    invoke-static/range {v31 .. v32}, Ljava/lang/Math;->sin(D)D

    .line 201
    .line 202
    .line 203
    move-result-wide v27

    .line 204
    move/from16 v29, v4

    .line 205
    .line 206
    mul-double v4, v25, v27

    .line 207
    .line 208
    double-to-float v4, v4

    .line 209
    aput v4, v13, v16

    .line 210
    .line 211
    add-int/lit8 v5, v15, 0x3

    .line 212
    .line 213
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 214
    .line 215
    .line 216
    move-result-wide v7

    .line 217
    mul-double v7, v7, v25

    .line 218
    .line 219
    invoke-static/range {v31 .. v32}, Ljava/lang/Math;->cos(D)D

    .line 220
    .line 221
    .line 222
    move-result-wide v25

    .line 223
    mul-double v7, v7, v25

    .line 224
    .line 225
    double-to-float v4, v7

    .line 226
    aput v4, v13, v29

    .line 227
    .line 228
    add-int/lit8 v8, v1, 0x1

    .line 229
    .line 230
    div-float v4, v23, p4

    .line 231
    .line 232
    aput v4, v12, v1

    .line 233
    .line 234
    const/16 v18, 0x2

    .line 235
    .line 236
    add-int/lit8 v4, v1, 0x2

    .line 237
    .line 238
    add-int v7, v14, v3

    .line 239
    .line 240
    int-to-float v7, v7

    .line 241
    mul-float v7, v7, v9

    .line 242
    .line 243
    div-float v7, v7, p3

    .line 244
    .line 245
    aput v7, v12, v8

    .line 246
    .line 247
    if-nez v6, :cond_fd

    .line 248
    .line 249
    if-eqz v3, :cond_fb

    .line 250
    .line 251
    goto :goto_fd

    .line 252
    :cond_fb
    :goto_fb
    const/4 v7, 0x3

    .line 253
    goto :goto_103

    .line 254
    :cond_fd
    :goto_fd
    if-ne v6, v2, :cond_110

    .line 255
    .line 256
    const/4 v7, 0x1

    .line 257
    if-ne v3, v7, :cond_110

    .line 258
    .line 259
    goto :goto_fb

    .line 260
    :goto_103
    invoke-static {v13, v15, v13, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 261
    .line 262
    .line 263
    add-int/lit8 v15, v15, 0x6

    .line 264
    .line 265
    const/4 v8, 0x2

    .line 266
    invoke-static {v12, v1, v12, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v1, v1, 0x4

    .line 270
    .line 271
    :goto_10e
    const/4 v4, 0x1

    .line 272
    goto :goto_115

    .line 273
    :cond_110
    const/4 v7, 0x3

    .line 274
    const/4 v8, 0x2

    .line 275
    move v1, v4

    .line 276
    move v15, v5

    .line 277
    goto :goto_10e

    .line 278
    :goto_115
    add-int/2addr v3, v4

    .line 279
    move/from16 v5, v21

    .line 280
    .line 281
    move/from16 v7, v22

    .line 282
    .line 283
    move/from16 v8, v24

    .line 284
    .line 285
    const/16 v19, 0x3

    .line 286
    .line 287
    const/16 v20, 0x1

    .line 288
    .line 289
    goto/16 :goto_8d

    .line 290
    .line 291
    :cond_122
    move/from16 v21, v5

    .line 292
    .line 293
    move/from16 v22, v7

    .line 294
    .line 295
    move/from16 v24, v8

    .line 296
    .line 297
    const/4 v4, 0x1

    .line 298
    const/4 v7, 0x3

    .line 299
    const/4 v8, 0x2

    .line 300
    add-int/2addr v6, v4

    .line 301
    move/from16 v3, p3

    .line 302
    .line 303
    move/from16 v4, p4

    .line 304
    .line 305
    move/from16 v16, v1

    .line 306
    .line 307
    move/from16 v7, v22

    .line 308
    .line 309
    move/from16 v8, v24

    .line 310
    .line 311
    const/16 v19, 0x3

    .line 312
    .line 313
    const/16 v20, 0x1

    .line 314
    .line 315
    move/from16 v1, p1

    .line 316
    .line 317
    goto/16 :goto_84

    .line 318
    .line 319
    :cond_13e
    move/from16 v21, v5

    .line 320
    .line 321
    move/from16 v1, p1

    .line 322
    .line 323
    move/from16 v14, v21

    .line 324
    .line 325
    const/4 v5, 0x3

    .line 326
    const/4 v6, 0x2

    .line 327
    const/4 v8, 0x1

    .line 328
    goto/16 :goto_6d

    .line 329
    .line 330
    :cond_149
    const/4 v4, 0x1

    .line 331
    new-instance v0, Lax/p1/e$b;

    .line 332
    .line 333
    const/4 v1, 0x0

    .line 334
    invoke-direct {v0, v1, v13, v12, v4}, Lax/p1/e$b;-><init>(I[F[FI)V

    .line 335
    .line 336
    .line 337
    new-instance v2, Lax/p1/e;

    .line 338
    .line 339
    new-instance v3, Lax/p1/e$a;

    .line 340
    .line 341
    new-array v4, v4, [Lax/p1/e$b;

    .line 342
    .line 343
    aput-object v0, v4, v1

    .line 344
    .line 345
    invoke-direct {v3, v4}, Lax/p1/e$a;-><init>([Lax/p1/e$b;)V

    .line 346
    .line 347
    .line 348
    move/from16 v0, p5

    .line 349
    .line 350
    invoke-direct {v2, v3, v0}, Lax/p1/e;-><init>(Lax/p1/e$a;I)V

    .line 351
    .line 352
    .line 353
    return-object v2
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

.method public static b(I)Lax/p1/e;
    .registers 7

    .line 1
    const/high16 v3, 0x43340000    # 180.0f

    .line 2
    .line 3
    const/high16 v4, 0x43b40000    # 360.0f

    .line 4
    .line 5
    const/high16 v0, 0x42480000    # 50.0f

    .line 6
    .line 7
    const/16 v1, 0x24

    .line 8
    .line 9
    const/16 v2, 0x48

    .line 10
    .line 11
    move v5, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lax/p1/e;->a(FIIFFI)Lax/p1/e;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
