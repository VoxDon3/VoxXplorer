.class abstract Lax/X4/e;
.super Lax/X4/a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/X4/a;-><init>()V

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
.end method

.method private e(Ljava/lang/CharSequence;IIIZZ)J
    .registers 29

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p4

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    move/from16 v6, p2

    .line 7
    .line 8
    const-wide/16 v7, 0x0

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    :goto_b
    const/16 v11, 0x2e

    .line 13
    .line 14
    const-wide/16 v12, 0x30

    .line 15
    .line 16
    const-wide/16 v14, 0xa

    .line 17
    .line 18
    const/16 v16, 0x1

    .line 19
    .line 20
    if-ge v6, v3, :cond_32

    .line 21
    .line 22
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v9}, Lax/X4/i;->b(C)Z

    .line 27
    .line 28
    .line 29
    move-result v17

    .line 30
    if-eqz v17, :cond_25

    .line 31
    .line 32
    mul-long v7, v7, v14

    .line 33
    .line 34
    int-to-long v14, v9

    .line 35
    add-long/2addr v7, v14

    .line 36
    sub-long/2addr v7, v12

    .line 37
    goto :goto_2f

    .line 38
    :cond_25
    if-ne v9, v11, :cond_32

    .line 39
    .line 40
    if-ltz v0, :cond_2a

    .line 41
    .line 42
    goto :goto_2c

    .line 43
    :cond_2a
    const/16 v16, 0x0

    .line 44
    .line 45
    :goto_2c
    or-int v10, v10, v16

    .line 46
    .line 47
    move v0, v6

    .line 48
    :goto_2f
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_b

    .line 51
    :cond_32
    if-gez v0, :cond_3b

    .line 52
    .line 53
    sub-int v0, v6, p2

    .line 54
    .line 55
    move/from16 v17, v6

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    goto :goto_49

    .line 60
    :cond_3b
    sub-int v17, v6, p2

    .line 61
    .line 62
    add-int/lit8 v17, v17, -0x1

    .line 63
    .line 64
    sub-int v18, v0, v6

    .line 65
    .line 66
    add-int/lit8 v18, v18, 0x1

    .line 67
    .line 68
    move/from16 v21, v17

    .line 69
    .line 70
    move/from16 v17, v0

    .line 71
    .line 72
    move/from16 v0, v21

    .line 73
    .line 74
    :goto_49
    or-int/lit8 v2, v9, 0x20

    .line 75
    .line 76
    const/16 v4, 0x65

    .line 77
    .line 78
    if-ne v2, v4, :cond_91

    .line 79
    .line 80
    add-int/lit8 v2, v6, 0x1

    .line 81
    .line 82
    invoke-static {v1, v2, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const/16 v5, 0x2d

    .line 87
    .line 88
    if-ne v4, v5, :cond_5b

    .line 89
    .line 90
    const/4 v5, 0x1

    .line 91
    goto :goto_5c

    .line 92
    :cond_5b
    const/4 v5, 0x0

    .line 93
    :goto_5c
    if-nez v5, :cond_62

    .line 94
    .line 95
    const/16 v9, 0x2b

    .line 96
    .line 97
    if-ne v4, v9, :cond_68

    .line 98
    .line 99
    :cond_62
    add-int/lit8 v2, v6, 0x2

    .line 100
    .line 101
    invoke-static {v1, v2, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    :cond_68
    invoke-static {v4}, Lax/X4/i;->b(C)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    xor-int/lit8 v9, v9, 0x1

    .line 110
    .line 111
    or-int v19, v10, v9

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    :cond_71
    const/16 v10, 0x400

    .line 115
    .line 116
    if-ge v9, v10, :cond_7a

    .line 117
    .line 118
    mul-int/lit8 v9, v9, 0xa

    .line 119
    .line 120
    add-int/2addr v9, v4

    .line 121
    add-int/lit8 v9, v9, -0x30

    .line 122
    .line 123
    :cond_7a
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    invoke-static {v1, v2, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-static {v4}, Lax/X4/i;->b(C)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-nez v10, :cond_71

    .line 134
    .line 135
    if-eqz v5, :cond_89

    .line 136
    .line 137
    neg-int v9, v9

    .line 138
    :cond_89
    add-int v18, v18, v9

    .line 139
    .line 140
    move v10, v9

    .line 141
    move v9, v4

    .line 142
    move v4, v10

    .line 143
    move/from16 v10, v19

    .line 144
    .line 145
    goto :goto_93

    .line 146
    :cond_91
    move v2, v6

    .line 147
    const/4 v4, 0x0

    .line 148
    :goto_93
    const/16 v5, 0x64

    .line 149
    .line 150
    if-ne v9, v5, :cond_9b

    .line 151
    .line 152
    const/4 v5, 0x1

    .line 153
    :goto_98
    move-wide/from16 v19, v12

    .line 154
    .line 155
    goto :goto_9d

    .line 156
    :cond_9b
    const/4 v5, 0x0

    .line 157
    goto :goto_98

    .line 158
    :goto_9d
    const/16 v12, 0x44

    .line 159
    .line 160
    if-ne v9, v12, :cond_a3

    .line 161
    .line 162
    const/4 v12, 0x1

    .line 163
    goto :goto_a4

    .line 164
    :cond_a3
    const/4 v12, 0x0

    .line 165
    :goto_a4
    or-int/2addr v5, v12

    .line 166
    const/16 v12, 0x66

    .line 167
    .line 168
    if-ne v9, v12, :cond_ab

    .line 169
    .line 170
    const/4 v12, 0x1

    .line 171
    goto :goto_ac

    .line 172
    :cond_ab
    const/4 v12, 0x0

    .line 173
    :goto_ac
    or-int/2addr v5, v12

    .line 174
    const/16 v12, 0x46

    .line 175
    .line 176
    if-ne v9, v12, :cond_b3

    .line 177
    .line 178
    const/4 v9, 0x1

    .line 179
    goto :goto_b4

    .line 180
    :cond_b3
    const/4 v9, 0x0

    .line 181
    :goto_b4
    or-int/2addr v5, v9

    .line 182
    if-eqz v5, :cond_b9

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x1

    .line 185
    .line 186
    :cond_b9
    invoke-static {v1, v2, v3}, Lax/X4/e;->j(Ljava/lang/CharSequence;II)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v10, :cond_115

    .line 191
    .line 192
    if-lt v2, v3, :cond_115

    .line 193
    .line 194
    if-nez p6, :cond_c5

    .line 195
    .line 196
    if-eqz v0, :cond_115

    .line 197
    .line 198
    :cond_c5
    const/16 v2, 0x13

    .line 199
    .line 200
    if-le v0, v2, :cond_105

    .line 201
    .line 202
    move/from16 v0, p2

    .line 203
    .line 204
    const/4 v2, 0x0

    .line 205
    const-wide/16 v7, 0x0

    .line 206
    .line 207
    :goto_ce
    if-ge v0, v6, :cond_ed

    .line 208
    .line 209
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-ne v5, v11, :cond_d9

    .line 214
    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_ea

    .line 218
    :cond_d9
    const-wide v9, 0xde0b6b3a7640000L

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    invoke-static {v7, v8, v9, v10}, Lax/X4/d;->a(JJ)I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-gez v9, :cond_ed

    .line 228
    .line 229
    mul-long v7, v7, v14

    .line 230
    .line 231
    int-to-long v9, v5

    .line 232
    add-long/2addr v7, v9

    .line 233
    sub-long v7, v7, v19

    .line 234
    .line 235
    :goto_ea
    add-int/lit8 v0, v0, 0x1

    .line 236
    .line 237
    goto :goto_ce

    .line 238
    :cond_ed
    if-ge v0, v6, :cond_f0

    .line 239
    .line 240
    goto :goto_f2

    .line 241
    :cond_f0
    const/16 v16, 0x0

    .line 242
    .line 243
    :goto_f2
    sub-int v17, v17, v0

    .line 244
    .line 245
    add-int v17, v17, v2

    .line 246
    .line 247
    add-int v2, v17, v4

    .line 248
    .line 249
    move v9, v2

    .line 250
    move-wide v5, v7

    .line 251
    move/from16 v8, v16

    .line 252
    .line 253
    move-object/from16 v0, p0

    .line 254
    .line 255
    move/from16 v4, p5

    .line 256
    .line 257
    move/from16 v7, v18

    .line 258
    .line 259
    move/from16 v2, p3

    .line 260
    .line 261
    goto :goto_110

    .line 262
    :cond_105
    move-wide v5, v7

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    move-object/from16 v0, p0

    .line 266
    .line 267
    move/from16 v2, p3

    .line 268
    .line 269
    move/from16 v4, p5

    .line 270
    .line 271
    move/from16 v7, v18

    .line 272
    .line 273
    :goto_110
    invoke-virtual/range {v0 .. v9}, Lax/X4/e;->k(Ljava/lang/CharSequence;IIZJIZI)J

    .line 274
    .line 275
    .line 276
    move-result-wide v1

    .line 277
    return-wide v1

    .line 278
    :cond_115
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 279
    .line 280
    const-string v1, "illegal syntax"

    .line 281
    .line 282
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0
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

.method private g(Ljava/lang/CharSequence;IIIZ)J
    .registers 26

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p4

    .line 4
    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    move/from16 v6, p2

    .line 9
    .line 10
    move-wide v7, v4

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x0

    .line 13
    :goto_c
    const/4 v11, 0x4

    .line 14
    const/4 v12, 0x1

    .line 15
    if-ge v6, v3, :cond_44

    .line 16
    .line 17
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    invoke-static {v9}, Lax/X4/f;->b(C)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    if-ltz v13, :cond_1e

    .line 26
    .line 27
    shl-long/2addr v7, v11

    .line 28
    int-to-long v13, v13

    .line 29
    or-long/2addr v7, v13

    .line 30
    goto :goto_42

    .line 31
    :cond_1e
    const/4 v14, -0x4

    .line 32
    if-ne v13, v14, :cond_44

    .line 33
    .line 34
    if-ltz v2, :cond_25

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 v2, 0x0

    .line 39
    :goto_26
    or-int/2addr v10, v2

    .line 40
    move v2, v6

    .line 41
    :goto_28
    add-int/lit8 v11, v3, -0x8

    .line 42
    .line 43
    if-ge v2, v11, :cond_3d

    .line 44
    .line 45
    add-int/lit8 v11, v2, 0x1

    .line 46
    .line 47
    invoke-static {v1, v11}, Lax/X4/i;->h(Ljava/lang/CharSequence;I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v13

    .line 51
    cmp-long v11, v13, v4

    .line 52
    .line 53
    if-ltz v11, :cond_3d

    .line 54
    .line 55
    const/16 v11, 0x20

    .line 56
    .line 57
    shl-long/2addr v7, v11

    .line 58
    add-long/2addr v7, v13

    .line 59
    add-int/lit8 v2, v2, 0x8

    .line 60
    .line 61
    goto :goto_28

    .line 62
    :cond_3d
    move/from16 v19, v6

    .line 63
    .line 64
    move v6, v2

    .line 65
    move/from16 v2, v19

    .line 66
    .line 67
    :goto_42
    add-int/2addr v6, v12

    .line 68
    goto :goto_c

    .line 69
    :cond_44
    const/16 v13, 0x400

    .line 70
    .line 71
    if-gez v2, :cond_4d

    .line 72
    .line 73
    sub-int v2, v6, p2

    .line 74
    .line 75
    move v14, v6

    .line 76
    const/4 v15, 0x0

    .line 77
    goto :goto_5e

    .line 78
    :cond_4d
    sub-int v14, v6, p2

    .line 79
    .line 80
    sub-int/2addr v14, v12

    .line 81
    sub-int v15, v2, v6

    .line 82
    .line 83
    add-int/2addr v15, v12

    .line 84
    invoke-static {v15, v13}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    mul-int/lit8 v15, v15, 0x4

    .line 89
    .line 90
    move/from16 v19, v14

    .line 91
    .line 92
    move v14, v2

    .line 93
    move/from16 v2, v19

    .line 94
    .line 95
    :goto_5e
    or-int/lit8 v0, v9, 0x20

    .line 96
    .line 97
    const/16 v4, 0x70

    .line 98
    .line 99
    if-ne v0, v4, :cond_66

    .line 100
    .line 101
    const/4 v0, 0x1

    .line 102
    goto :goto_67

    .line 103
    :cond_66
    const/4 v0, 0x0

    .line 104
    :goto_67
    if-eqz v0, :cond_a8

    .line 105
    .line 106
    add-int/lit8 v4, v6, 0x1

    .line 107
    .line 108
    invoke-static {v1, v4, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    const/16 v9, 0x2d

    .line 113
    .line 114
    if-ne v5, v9, :cond_76

    .line 115
    .line 116
    const/16 v17, 0x1

    .line 117
    .line 118
    goto :goto_78

    .line 119
    :cond_76
    const/16 v17, 0x0

    .line 120
    .line 121
    :goto_78
    if-nez v17, :cond_7e

    .line 122
    .line 123
    const/16 v9, 0x2b

    .line 124
    .line 125
    if-ne v5, v9, :cond_84

    .line 126
    .line 127
    :cond_7e
    add-int/lit8 v4, v6, 0x2

    .line 128
    .line 129
    invoke-static {v1, v4, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    :cond_84
    invoke-static {v5}, Lax/X4/i;->b(C)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    xor-int/2addr v9, v12

    .line 138
    or-int v18, v10, v9

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    :cond_8c
    if-ge v9, v13, :cond_93

    .line 142
    .line 143
    mul-int/lit8 v9, v9, 0xa

    .line 144
    .line 145
    add-int/2addr v9, v5

    .line 146
    add-int/lit8 v9, v9, -0x30

    .line 147
    .line 148
    :cond_93
    add-int/2addr v4, v12

    .line 149
    invoke-static {v1, v4, v3}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    invoke-static {v5}, Lax/X4/i;->b(C)Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-nez v10, :cond_8c

    .line 158
    .line 159
    if-eqz v17, :cond_a1

    .line 160
    .line 161
    neg-int v9, v9

    .line 162
    :cond_a1
    add-int/2addr v15, v9

    .line 163
    move v10, v9

    .line 164
    move v9, v5

    .line 165
    move v5, v10

    .line 166
    move/from16 v10, v18

    .line 167
    .line 168
    goto :goto_aa

    .line 169
    :cond_a8
    move v4, v6

    .line 170
    const/4 v5, 0x0

    .line 171
    :goto_aa
    const/16 v13, 0x64

    .line 172
    .line 173
    if-ne v9, v13, :cond_b2

    .line 174
    .line 175
    const/4 v13, 0x1

    .line 176
    :goto_af
    const/16 v17, 0x4

    .line 177
    .line 178
    goto :goto_b4

    .line 179
    :cond_b2
    const/4 v13, 0x0

    .line 180
    goto :goto_af

    .line 181
    :goto_b4
    const/16 v11, 0x44

    .line 182
    .line 183
    if-ne v9, v11, :cond_ba

    .line 184
    .line 185
    const/4 v11, 0x1

    .line 186
    goto :goto_bb

    .line 187
    :cond_ba
    const/4 v11, 0x0

    .line 188
    :goto_bb
    or-int/2addr v11, v13

    .line 189
    const/16 v13, 0x66

    .line 190
    .line 191
    if-ne v9, v13, :cond_c2

    .line 192
    .line 193
    const/4 v13, 0x1

    .line 194
    goto :goto_c3

    .line 195
    :cond_c2
    const/4 v13, 0x0

    .line 196
    :goto_c3
    or-int/2addr v11, v13

    .line 197
    const/16 v13, 0x46

    .line 198
    .line 199
    if-ne v9, v13, :cond_ca

    .line 200
    .line 201
    const/4 v9, 0x1

    .line 202
    goto :goto_cb

    .line 203
    :cond_ca
    const/4 v9, 0x0

    .line 204
    :goto_cb
    or-int/2addr v9, v11

    .line 205
    if-eqz v9, :cond_d0

    .line 206
    .line 207
    add-int/lit8 v4, v4, 0x1

    .line 208
    .line 209
    :cond_d0
    invoke-static {v1, v4, v3}, Lax/X4/e;->j(Ljava/lang/CharSequence;II)I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-nez v10, :cond_128

    .line 214
    .line 215
    if-lt v4, v3, :cond_128

    .line 216
    .line 217
    if-eqz v2, :cond_128

    .line 218
    .line 219
    if-eqz v0, :cond_128

    .line 220
    .line 221
    const/16 v0, 0x10

    .line 222
    .line 223
    if-le v2, v0, :cond_111

    .line 224
    .line 225
    move/from16 v0, p2

    .line 226
    .line 227
    const/4 v2, 0x0

    .line 228
    const-wide/16 v7, 0x0

    .line 229
    .line 230
    :goto_e5
    if-ge v0, v6, :cond_106

    .line 231
    .line 232
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-static {v4}, Lax/X4/f;->b(C)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-ltz v4, :cond_101

    .line 241
    .line 242
    const-wide v9, 0xde0b6b3a7640000L

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    invoke-static {v7, v8, v9, v10}, Lax/X4/d;->a(JJ)I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-gez v9, :cond_106

    .line 252
    .line 253
    shl-long v7, v7, v17

    .line 254
    .line 255
    int-to-long v9, v4

    .line 256
    or-long/2addr v7, v9

    .line 257
    goto :goto_103

    .line 258
    :cond_101
    add-int/lit8 v2, v2, 0x1

    .line 259
    .line 260
    :goto_103
    add-int/lit8 v0, v0, 0x1

    .line 261
    .line 262
    goto :goto_e5

    .line 263
    :cond_106
    if-ge v0, v6, :cond_109

    .line 264
    .line 265
    goto :goto_10a

    .line 266
    :cond_109
    const/4 v12, 0x0

    .line 267
    :goto_10a
    move v4, v0

    .line 268
    move v0, v2

    .line 269
    move/from16 v16, v5

    .line 270
    .line 271
    move-wide v5, v7

    .line 272
    move v8, v12

    .line 273
    goto :goto_116

    .line 274
    :cond_111
    move/from16 v16, v5

    .line 275
    .line 276
    move-wide v5, v7

    .line 277
    const/4 v0, 0x0

    .line 278
    const/4 v8, 0x0

    .line 279
    :goto_116
    sub-int/2addr v14, v4

    .line 280
    add-int/2addr v14, v0

    .line 281
    mul-int/lit8 v14, v14, 0x4

    .line 282
    .line 283
    add-int v9, v14, v16

    .line 284
    .line 285
    move-object/from16 v0, p0

    .line 286
    .line 287
    move/from16 v2, p3

    .line 288
    .line 289
    move/from16 v4, p5

    .line 290
    .line 291
    move v7, v15

    .line 292
    invoke-virtual/range {v0 .. v9}, Lax/X4/e;->l(Ljava/lang/CharSequence;IIZJIZI)J

    .line 293
    .line 294
    .line 295
    move-result-wide v1

    .line 296
    return-wide v1

    .line 297
    :cond_128
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 298
    .line 299
    const-string v1, "illegal syntax"

    .line 300
    .line 301
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v0
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

.method private h(Ljava/lang/CharSequence;IIZ)J
    .registers 9

    .line 1
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x4e

    .line 6
    .line 7
    if-ne v0, v1, :cond_29

    .line 8
    .line 9
    add-int/lit8 p4, p2, 0x2

    .line 10
    .line 11
    if-ge p4, p3, :cond_89

    .line 12
    .line 13
    add-int/lit8 v0, p2, 0x1

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v2, 0x61

    .line 20
    .line 21
    if-ne v0, v2, :cond_89

    .line 22
    .line 23
    invoke-interface {p1, p4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    if-ne p4, v1, :cond_89

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x3

    .line 30
    .line 31
    invoke-static {p1, p2, p3}, Lax/X4/e;->j(Ljava/lang/CharSequence;II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p1, p3, :cond_89

    .line 36
    .line 37
    invoke-virtual {p0}, Lax/X4/e;->c()J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    return-wide p1

    .line 42
    :cond_29
    add-int/lit8 v0, p2, 0x7

    .line 43
    .line 44
    if-ge v0, p3, :cond_89

    .line 45
    .line 46
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/16 v2, 0x49

    .line 51
    .line 52
    if-ne v1, v2, :cond_89

    .line 53
    .line 54
    add-int/lit8 v1, p2, 0x1

    .line 55
    .line 56
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/16 v2, 0x6e

    .line 61
    .line 62
    if-ne v1, v2, :cond_89

    .line 63
    .line 64
    add-int/lit8 v1, p2, 0x2

    .line 65
    .line 66
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/16 v3, 0x66

    .line 71
    .line 72
    if-ne v1, v3, :cond_89

    .line 73
    .line 74
    add-int/lit8 v1, p2, 0x3

    .line 75
    .line 76
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v3, 0x69

    .line 81
    .line 82
    if-ne v1, v3, :cond_89

    .line 83
    .line 84
    add-int/lit8 v1, p2, 0x4

    .line 85
    .line 86
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-ne v1, v2, :cond_89

    .line 91
    .line 92
    add-int/lit8 v1, p2, 0x5

    .line 93
    .line 94
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-ne v1, v3, :cond_89

    .line 99
    .line 100
    add-int/lit8 v1, p2, 0x6

    .line 101
    .line 102
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/16 v2, 0x74

    .line 107
    .line 108
    if-ne v1, v2, :cond_89

    .line 109
    .line 110
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/16 v1, 0x79

    .line 115
    .line 116
    if-ne v0, v1, :cond_89

    .line 117
    .line 118
    add-int/lit8 p2, p2, 0x8

    .line 119
    .line 120
    invoke-static {p1, p2, p3}, Lax/X4/e;->j(Ljava/lang/CharSequence;II)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-ne p1, p3, :cond_89

    .line 125
    .line 126
    if-eqz p4, :cond_84

    .line 127
    .line 128
    invoke-virtual {p0}, Lax/X4/e;->d()J

    .line 129
    .line 130
    .line 131
    move-result-wide p1

    .line 132
    return-wide p1

    .line 133
    :cond_84
    invoke-virtual {p0}, Lax/X4/e;->i()J

    .line 134
    .line 135
    .line 136
    move-result-wide p1

    .line 137
    return-wide p1

    .line 138
    :cond_89
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 139
    .line 140
    const-string p2, "illegal syntax"

    .line 141
    .line 142
    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
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

.method private static j(Ljava/lang/CharSequence;II)I
    .registers 5

    .line 1
    :goto_0
    if-ge p1, p2, :cond_d

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    if-gt v0, v1, :cond_d

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_d
    return p1
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
.method abstract c()J
.end method

.method abstract d()J
.end method

.method public final f(Ljava/lang/CharSequence;II)J
    .registers 11

    .line 1
    add-int v4, p2, p3

    .line 2
    .line 3
    if-ltz p2, :cond_7a

    .line 4
    .line 5
    if-lt v4, p2, :cond_7a

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gt v4, v0, :cond_7a

    .line 12
    .line 13
    const v0, 0x7ffffffb

    .line 14
    .line 15
    .line 16
    if-gt p3, v0, :cond_7a

    .line 17
    .line 18
    invoke-static {p1, p2, v4}, Lax/X4/e;->j(Ljava/lang/CharSequence;II)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const-string v0, "illegal syntax"

    .line 23
    .line 24
    if-eq p3, v4, :cond_74

    .line 25
    .line 26
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x2d

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-ne v1, v2, :cond_25

    .line 35
    .line 36
    :goto_23
    const/4 v2, 0x1

    .line 37
    goto :goto_27

    .line 38
    :cond_25
    const/4 v5, 0x0

    .line 39
    goto :goto_23

    .line 40
    :goto_27
    if-nez v5, :cond_2d

    .line 41
    .line 42
    const/16 v6, 0x2b

    .line 43
    .line 44
    if-ne v1, v6, :cond_35

    .line 45
    .line 46
    :cond_2d
    add-int/lit8 p3, p3, 0x1

    .line 47
    .line 48
    invoke-static {p1, p3, v4}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_6e

    .line 53
    .line 54
    :cond_35
    const/16 v0, 0x49

    .line 55
    .line 56
    if-lt v1, v0, :cond_3e

    .line 57
    .line 58
    invoke-direct {p0, p1, p3, v4, v5}, Lax/X4/e;->h(Ljava/lang/CharSequence;IIZ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1

    .line 63
    :cond_3e
    const/16 v0, 0x30

    .line 64
    .line 65
    if-ne v1, v0, :cond_44

    .line 66
    .line 67
    const/4 v6, 0x1

    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v6, 0x0

    .line 70
    :goto_45
    if-eqz v6, :cond_65

    .line 71
    .line 72
    add-int/lit8 v0, p3, 0x1

    .line 73
    .line 74
    invoke-static {p1, v0, v4}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/16 v2, 0x78

    .line 79
    .line 80
    if-eq v1, v2, :cond_5b

    .line 81
    .line 82
    const/16 v2, 0x58

    .line 83
    .line 84
    if-ne v1, v2, :cond_56

    .line 85
    .line 86
    goto :goto_5b

    .line 87
    :cond_56
    move v2, v0

    .line 88
    move-object v1, p1

    .line 89
    move v3, p2

    .line 90
    move-object v0, p0

    .line 91
    goto :goto_69

    .line 92
    :cond_5b
    :goto_5b
    add-int/lit8 v2, p3, 0x2

    .line 93
    .line 94
    move-object v0, p0

    .line 95
    move-object v1, p1

    .line 96
    move v3, p2

    .line 97
    invoke-direct/range {v0 .. v5}, Lax/X4/e;->g(Ljava/lang/CharSequence;IIIZ)J

    .line 98
    .line 99
    .line 100
    move-result-wide p1

    .line 101
    return-wide p1

    .line 102
    :cond_65
    move v2, p3

    .line 103
    move-object v0, p0

    .line 104
    move-object v1, p1

    .line 105
    move v3, p2

    .line 106
    :goto_69
    invoke-direct/range {v0 .. v6}, Lax/X4/e;->e(Ljava/lang/CharSequence;IIIZZ)J

    .line 107
    .line 108
    .line 109
    move-result-wide p1

    .line 110
    return-wide p1

    .line 111
    :cond_6e
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 112
    .line 113
    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_74
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 118
    .line 119
    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_7a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    const-string p2, "offset < 0 or length > str.length"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
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
.end method

.method abstract i()J
.end method

.method abstract k(Ljava/lang/CharSequence;IIZJIZI)J
.end method

.method abstract l(Ljava/lang/CharSequence;IIZJIZI)J
.end method
