.class final Lax/p1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BI)Lax/p1/e;
    .registers 7

    .line 1
    new-instance v0, Lax/S0/G;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/S0/G;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    :try_start_6
    invoke-static {v0}, Lax/p1/f;->c(Lax/S0/G;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_13

    .line 12
    .line 13
    invoke-static {v0}, Lax/p1/f;->f(Lax/S0/G;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_19

    .line 18
    :catch_11
    nop

    .line 19
    goto :goto_18

    .line 20
    :cond_13
    invoke-static {v0}, Lax/p1/f;->e(Lax/S0/G;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_17
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_17} :catch_11

    .line 24
    goto :goto_19

    .line 25
    :goto_18
    move-object v0, p0

    .line 26
    :goto_19
    if-nez v0, :cond_1c

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eq v1, v3, :cond_3a

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    if-eq v1, v4, :cond_28

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_28
    new-instance p0, Lax/p1/e;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lax/p1/e$a;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lax/p1/e$a;

    .line 54
    .line 55
    invoke-direct {p0, v1, v0, p1}, Lax/p1/e;-><init>(Lax/p1/e$a;Lax/p1/e$a;I)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3a
    new-instance p0, Lax/p1/e;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lax/p1/e$a;

    .line 66
    .line 67
    invoke-direct {p0, v0, p1}, Lax/p1/e;-><init>(Lax/p1/e$a;I)V

    .line 68
    .line 69
    .line 70
    return-object p0
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

.method private static b(I)I
    .registers 2

    .line 1
    shr-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    neg-int p0, p0

    .line 6
    xor-int/2addr p0, v0

    .line 7
    return p0
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

.method private static c(Lax/S0/G;)Z
    .registers 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lax/S0/G;->b0(I)V

    .line 11
    .line 12
    .line 13
    const p0, 0x70726f6a

    .line 14
    .line 15
    .line 16
    if-ne v0, p0, :cond_13

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_13
    return v1
    .line 21
    .line 22
.end method

.method private static d(Lax/S0/G;)Lax/p1/e$a;
    .registers 24

    .line 1
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2710

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-le v0, v1, :cond_a

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_a
    new-array v1, v0, [F

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_d
    if-ge v4, v0, :cond_18

    .line 15
    .line 16
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->u()F

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    aput v5, v1, v4

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_d

    .line 25
    :cond_18
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->v()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x7d00

    .line 30
    .line 31
    if-le v4, v5, :cond_21

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_21
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 35
    .line 36
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    int-to-double v9, v0

    .line 41
    mul-double v9, v9, v5

    .line 42
    .line 43
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v9

    .line 47
    div-double/2addr v9, v7

    .line 48
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    double-to-int v9, v9

    .line 53
    new-instance v10, Lax/S0/F;

    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->f()[B

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-direct {v10, v11}, Lax/S0/F;-><init>([B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->g()I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    const/16 v12, 0x8

    .line 67
    .line 68
    mul-int/lit8 v11, v11, 0x8

    .line 69
    .line 70
    invoke-virtual {v10, v11}, Lax/S0/F;->p(I)V

    .line 71
    .line 72
    .line 73
    mul-int/lit8 v11, v4, 0x5

    .line 74
    .line 75
    new-array v11, v11, [F

    .line 76
    .line 77
    const/4 v13, 0x5

    .line 78
    new-array v14, v13, [I

    .line 79
    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    :goto_52
    if-ge v15, v4, :cond_7d

    .line 84
    .line 85
    move-object/from16 v17, v2

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    :goto_57
    if-ge v2, v13, :cond_78

    .line 89
    .line 90
    aget v18, v14, v2

    .line 91
    .line 92
    invoke-virtual {v10, v9}, Lax/S0/F;->h(I)I

    .line 93
    .line 94
    .line 95
    move-result v19

    .line 96
    invoke-static/range {v19 .. v19}, Lax/p1/f;->b(I)I

    .line 97
    .line 98
    .line 99
    move-result v19

    .line 100
    add-int v3, v18, v19

    .line 101
    .line 102
    if-ge v3, v0, :cond_77

    .line 103
    .line 104
    if-gez v3, :cond_6a

    .line 105
    .line 106
    goto :goto_77

    .line 107
    :cond_6a
    add-int/lit8 v18, v16, 0x1

    .line 108
    .line 109
    aget v19, v1, v3

    .line 110
    .line 111
    aput v19, v11, v16

    .line 112
    .line 113
    aput v3, v14, v2

    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    move/from16 v16, v18

    .line 118
    .line 119
    goto :goto_57

    .line 120
    :cond_77
    :goto_77
    return-object v17

    .line 121
    :cond_78
    add-int/lit8 v15, v15, 0x1

    .line 122
    .line 123
    move-object/from16 v2, v17

    .line 124
    .line 125
    goto :goto_52

    .line 126
    :cond_7d
    move-object/from16 v17, v2

    .line 127
    .line 128
    invoke-virtual {v10}, Lax/S0/F;->e()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    add-int/lit8 v0, v0, 0x7

    .line 133
    .line 134
    and-int/lit8 v0, v0, -0x8

    .line 135
    .line 136
    invoke-virtual {v10, v0}, Lax/S0/F;->p(I)V

    .line 137
    .line 138
    .line 139
    const/16 v0, 0x20

    .line 140
    .line 141
    invoke-virtual {v10, v0}, Lax/S0/F;->h(I)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    new-array v2, v1, [Lax/p1/e$b;

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    :goto_93
    if-ge v3, v1, :cond_112

    .line 149
    .line 150
    invoke-virtual {v10, v12}, Lax/S0/F;->h(I)I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    invoke-virtual {v10, v12}, Lax/S0/F;->h(I)I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    invoke-virtual {v10, v0}, Lax/S0/F;->h(I)I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    const v15, 0x1f400

    .line 163
    .line 164
    .line 165
    if-le v14, v15, :cond_a7

    .line 166
    .line 167
    return-object v17

    .line 168
    :cond_a7
    move v15, v1

    .line 169
    int-to-double v0, v4

    .line 170
    mul-double v0, v0, v5

    .line 171
    .line 172
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v0

    .line 176
    div-double/2addr v0, v7

    .line 177
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v0

    .line 181
    double-to-int v0, v0

    .line 182
    mul-int/lit8 v1, v14, 0x3

    .line 183
    .line 184
    new-array v1, v1, [F

    .line 185
    .line 186
    mul-int/lit8 v5, v14, 0x2

    .line 187
    .line 188
    new-array v5, v5, [F

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    :goto_c0
    if-ge v6, v14, :cond_101

    .line 194
    .line 195
    invoke-virtual {v10, v0}, Lax/S0/F;->h(I)I

    .line 196
    .line 197
    .line 198
    move-result v20

    .line 199
    invoke-static/range {v20 .. v20}, Lax/p1/f;->b(I)I

    .line 200
    .line 201
    .line 202
    move-result v20

    .line 203
    add-int v12, v16, v20

    .line 204
    .line 205
    if-ltz v12, :cond_100

    .line 206
    .line 207
    if-lt v12, v4, :cond_d1

    .line 208
    .line 209
    goto :goto_100

    .line 210
    :cond_d1
    mul-int/lit8 v16, v6, 0x3

    .line 211
    .line 212
    mul-int/lit8 v20, v12, 0x5

    .line 213
    .line 214
    aget v21, v11, v20

    .line 215
    .line 216
    aput v21, v1, v16

    .line 217
    .line 218
    add-int/lit8 v21, v16, 0x1

    .line 219
    .line 220
    add-int/lit8 v22, v20, 0x1

    .line 221
    .line 222
    aget v22, v11, v22

    .line 223
    .line 224
    aput v22, v1, v21

    .line 225
    .line 226
    add-int/lit8 v16, v16, 0x2

    .line 227
    .line 228
    add-int/lit8 v21, v20, 0x2

    .line 229
    .line 230
    aget v21, v11, v21

    .line 231
    .line 232
    aput v21, v1, v16

    .line 233
    .line 234
    mul-int/lit8 v16, v6, 0x2

    .line 235
    .line 236
    add-int/lit8 v21, v20, 0x3

    .line 237
    .line 238
    aget v21, v11, v21

    .line 239
    .line 240
    aput v21, v5, v16

    .line 241
    .line 242
    add-int/lit8 v16, v16, 0x1

    .line 243
    .line 244
    add-int/lit8 v20, v20, 0x4

    .line 245
    .line 246
    aget v20, v11, v20

    .line 247
    .line 248
    aput v20, v5, v16

    .line 249
    .line 250
    add-int/lit8 v6, v6, 0x1

    .line 251
    .line 252
    move/from16 v16, v12

    .line 253
    .line 254
    const/16 v12, 0x8

    .line 255
    .line 256
    goto :goto_c0

    .line 257
    :cond_100
    :goto_100
    return-object v17

    .line 258
    :cond_101
    new-instance v0, Lax/p1/e$b;

    .line 259
    .line 260
    invoke-direct {v0, v9, v1, v5, v13}, Lax/p1/e$b;-><init>(I[F[FI)V

    .line 261
    .line 262
    .line 263
    aput-object v0, v2, v3

    .line 264
    .line 265
    add-int/lit8 v3, v3, 0x1

    .line 266
    .line 267
    move v1, v15

    .line 268
    const/16 v0, 0x20

    .line 269
    .line 270
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 271
    .line 272
    const/16 v12, 0x8

    .line 273
    .line 274
    goto :goto_93

    .line 275
    :cond_112
    new-instance v0, Lax/p1/e$a;

    .line 276
    .line 277
    invoke-direct {v0, v2}, Lax/p1/e$a;-><init>([Lax/p1/e$b;)V

    .line 278
    .line 279
    .line 280
    return-object v0
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

.method private static e(Lax/S0/G;)Ljava/util/ArrayList;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            ")",
            "Ljava/util/ArrayList<",
            "Lax/p1/e$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    const/4 v0, 0x7

    .line 10
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v2, 0x64666c38

    .line 18
    .line 19
    .line 20
    if-ne v0, v2, :cond_34

    .line 21
    .line 22
    new-instance v0, Lax/S0/G;

    .line 23
    .line 24
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/zip/Inflater;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v2, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    :try_start_20
    invoke-static {p0, v0, v2}, Lax/S0/d0;->F0(Lax/S0/G;Lax/S0/G;Ljava/util/zip/Inflater;)Z

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_24
    .catchall {:try_start_20 .. :try_end_24} :catchall_2f

    .line 37
    if-nez p0, :cond_2a

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2a
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 44
    .line 45
    .line 46
    move-object p0, v0

    .line 47
    goto :goto_3a

    .line 48
    :catchall_2f
    move-exception p0

    .line 49
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_34
    const v2, 0x72617720

    .line 54
    .line 55
    .line 56
    if-eq v0, v2, :cond_3a

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3a
    :goto_3a
    invoke-static {p0}, Lax/p1/f;->g(Lax/S0/G;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
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
.end method

.method private static f(Lax/S0/G;)Ljava/util/ArrayList;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            ")",
            "Ljava/util/ArrayList<",
            "Lax/p1/e$a;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lax/S0/G;->j()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_d
    const/4 v2, 0x0

    .line 15
    if-ge v0, v1, :cond_36

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/2addr v3, v0

    .line 22
    if-le v3, v0, :cond_36

    .line 23
    .line 24
    if-le v3, v1, :cond_1a

    .line 25
    .line 26
    goto :goto_36

    .line 27
    :cond_1a
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const v2, 0x79746d70

    .line 32
    .line 33
    .line 34
    if-eq v0, v2, :cond_2e

    .line 35
    .line 36
    const v2, 0x6d736870

    .line 37
    .line 38
    .line 39
    if-ne v0, v2, :cond_29

    .line 40
    .line 41
    goto :goto_2e

    .line 42
    :cond_29
    invoke-virtual {p0, v3}, Lax/S0/G;->b0(I)V

    .line 43
    .line 44
    .line 45
    move v0, v3

    .line 46
    goto :goto_d

    .line 47
    :cond_2e
    :goto_2e
    invoke-virtual {p0, v3}, Lax/S0/G;->a0(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lax/p1/f;->e(Lax/S0/G;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_36
    :goto_36
    return-object v2
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static g(Lax/S0/G;)Ljava/util/ArrayList;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            ")",
            "Ljava/util/ArrayList<",
            "Lax/p1/e$a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Lax/S0/G;->j()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_d
    if-ge v1, v2, :cond_33

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/2addr v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-le v3, v1, :cond_32

    .line 23
    .line 24
    if-le v3, v2, :cond_1a

    .line 25
    .line 26
    goto :goto_32

    .line 27
    :cond_1a
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const v5, 0x6d657368

    .line 32
    .line 33
    .line 34
    if-ne v1, v5, :cond_2d

    .line 35
    .line 36
    invoke-static {p0}, Lax/p1/f;->d(Lax/S0/G;)Lax/p1/e$a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_2a

    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_2a
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2d
    invoke-virtual {p0, v3}, Lax/S0/G;->b0(I)V

    .line 47
    .line 48
    .line 49
    move v1, v3

    .line 50
    goto :goto_d

    .line 51
    :cond_32
    :goto_32
    return-object v4

    .line 52
    :cond_33
    return-object v0
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
