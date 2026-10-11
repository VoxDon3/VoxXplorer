.class public final Lax/K1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/K1/s;->a:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.89096448E8f
        0x4d344120    # 1.89010432E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
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

.method private static a(IZ)Z
    .registers 7

    .line 1
    ushr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    const v1, 0x336770

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    return v2

    .line 10
    :cond_9
    const v0, 0x68656963

    .line 11
    .line 12
    .line 13
    if-ne p0, v0, :cond_11

    .line 14
    .line 15
    if-eqz p1, :cond_11

    .line 16
    .line 17
    return v2

    .line 18
    :cond_11
    sget-object p1, Lax/K1/s;->a:[I

    .line 19
    .line 20
    array-length v0, p1

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_16
    if-ge v3, v0, :cond_20

    .line 24
    .line 25
    aget v4, p1, v3

    .line 26
    .line 27
    if-ne v4, p0, :cond_1d

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1d
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_16

    .line 33
    :cond_20
    return v1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static b(Lax/q1/s;)Lax/q1/S;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, Lax/K1/s;->c(Lax/q1/s;ZZ)Lax/q1/S;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static c(Lax/q1/s;ZZ)Lax/q1/S;
    .registers 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v0}, Lax/q1/s;->getLength()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v4, 0x1000

    .line 10
    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    cmp-long v8, v2, v6

    .line 14
    .line 15
    if-eqz v8, :cond_16

    .line 16
    .line 17
    cmp-long v9, v2, v4

    .line 18
    .line 19
    if-lez v9, :cond_15

    .line 20
    .line 21
    goto :goto_16

    .line 22
    :cond_15
    move-wide v4, v2

    .line 23
    :cond_16
    :goto_16
    long-to-int v5, v4

    .line 24
    new-instance v4, Lax/S0/G;

    .line 25
    .line 26
    const/16 v9, 0x40

    .line 27
    .line 28
    invoke-direct {v4, v9}, Lax/S0/G;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    :goto_21
    if-ge v10, v5, :cond_33

    .line 35
    .line 36
    const/16 v13, 0x8

    .line 37
    .line 38
    invoke-virtual {v4, v13}, Lax/S0/G;->X(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    const/4 v15, 0x1

    .line 46
    invoke-interface {v0, v14, v9, v13, v15}, Lax/q1/s;->h([BIIZ)Z

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    if-nez v14, :cond_38

    .line 51
    .line 52
    :cond_33
    const/4 v6, 0x0

    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    goto/16 :goto_c3

    .line 56
    .line 57
    :cond_38
    invoke-virtual {v4}, Lax/S0/G;->O()J

    .line 58
    .line 59
    .line 60
    move-result-wide v16

    .line 61
    invoke-virtual {v4}, Lax/S0/G;->v()I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    const-wide/16 v18, 0x1

    .line 66
    .line 67
    cmp-long v20, v16, v18

    .line 68
    .line 69
    if-nez v20, :cond_5e

    .line 70
    .line 71
    move-wide/from16 v18, v6

    .line 72
    .line 73
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-interface {v0, v6, v13, v13}, Lax/q1/s;->p([BII)V

    .line 78
    .line 79
    .line 80
    const/16 v6, 0x10

    .line 81
    .line 82
    invoke-virtual {v4, v6}, Lax/S0/G;->a0(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lax/S0/G;->F()J

    .line 86
    .line 87
    .line 88
    move-result-wide v16

    .line 89
    move/from16 v21, v10

    .line 90
    .line 91
    move-wide/from16 v9, v16

    .line 92
    .line 93
    :goto_5c
    const/4 v7, 0x0

    .line 94
    goto :goto_81

    .line 95
    :cond_5e
    move-wide/from16 v18, v6

    .line 96
    .line 97
    const-wide/16 v6, 0x0

    .line 98
    .line 99
    cmp-long v20, v16, v6

    .line 100
    .line 101
    if-nez v20, :cond_7e

    .line 102
    .line 103
    invoke-interface {v0}, Lax/q1/s;->getLength()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    cmp-long v20, v6, v18

    .line 108
    .line 109
    if-eqz v20, :cond_7e

    .line 110
    .line 111
    invoke-interface {v0}, Lax/q1/s;->i()J

    .line 112
    .line 113
    .line 114
    move-result-wide v16

    .line 115
    sub-long v6, v6, v16

    .line 116
    .line 117
    move/from16 v21, v10

    .line 118
    .line 119
    int-to-long v9, v13

    .line 120
    add-long v16, v6, v9

    .line 121
    .line 122
    :goto_79
    move-wide/from16 v9, v16

    .line 123
    .line 124
    const/16 v6, 0x8

    .line 125
    .line 126
    goto :goto_5c

    .line 127
    :cond_7e
    move/from16 v21, v10

    .line 128
    .line 129
    goto :goto_79

    .line 130
    :goto_81
    int-to-long v12, v6

    .line 131
    cmp-long v17, v9, v12

    .line 132
    .line 133
    if-gez v17, :cond_8c

    .line 134
    .line 135
    new-instance v0, Lax/K1/a;

    .line 136
    .line 137
    invoke-direct {v0, v14, v9, v10, v6}, Lax/K1/a;-><init>(IJI)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_8c
    add-int v6, v21, v6

    .line 142
    .line 143
    move-object/from16 v17, v7

    .line 144
    .line 145
    const v7, 0x6d6f6f76

    .line 146
    .line 147
    .line 148
    if-ne v14, v7, :cond_a5

    .line 149
    .line 150
    long-to-int v7, v9

    .line 151
    add-int/2addr v5, v7

    .line 152
    if-eqz v8, :cond_9f

    .line 153
    .line 154
    int-to-long v9, v5

    .line 155
    cmp-long v7, v9, v2

    .line 156
    .line 157
    if-lez v7, :cond_9f

    .line 158
    .line 159
    long-to-int v5, v2

    .line 160
    :cond_9f
    move v10, v6

    .line 161
    move-wide/from16 v6, v18

    .line 162
    .line 163
    :goto_a2
    const/4 v9, 0x0

    .line 164
    goto/16 :goto_21

    .line 165
    .line 166
    :cond_a5
    const v7, 0x6d6f6f66

    .line 167
    .line 168
    .line 169
    if-eq v14, v7, :cond_12d

    .line 170
    .line 171
    const v7, 0x6d766578

    .line 172
    .line 173
    .line 174
    if-ne v14, v7, :cond_b1

    .line 175
    .line 176
    goto/16 :goto_12d

    .line 177
    .line 178
    :cond_b1
    const v7, 0x6d646174

    .line 179
    .line 180
    .line 181
    if-ne v14, v7, :cond_b7

    .line 182
    .line 183
    const/4 v11, 0x1

    .line 184
    :cond_b7
    move-wide/from16 v21, v2

    .line 185
    .line 186
    int-to-long v2, v6

    .line 187
    add-long/2addr v2, v9

    .line 188
    sub-long/2addr v2, v12

    .line 189
    move-wide/from16 v23, v2

    .line 190
    .line 191
    int-to-long v2, v5

    .line 192
    cmp-long v7, v23, v2

    .line 193
    .line 194
    if-ltz v7, :cond_c6

    .line 195
    .line 196
    :goto_c3
    const/4 v9, 0x0

    .line 197
    goto/16 :goto_12e

    .line 198
    .line 199
    :cond_c6
    sub-long/2addr v9, v12

    .line 200
    long-to-int v2, v9

    .line 201
    add-int v10, v6, v2

    .line 202
    .line 203
    const v3, 0x66747970

    .line 204
    .line 205
    .line 206
    if-ne v14, v3, :cond_121

    .line 207
    .line 208
    const/16 v3, 0x8

    .line 209
    .line 210
    if-ge v2, v3, :cond_da

    .line 211
    .line 212
    new-instance v0, Lax/K1/a;

    .line 213
    .line 214
    int-to-long v1, v2

    .line 215
    invoke-direct {v0, v14, v1, v2, v3}, Lax/K1/a;-><init>(IJI)V

    .line 216
    .line 217
    .line 218
    return-object v0

    .line 219
    :cond_da
    invoke-virtual {v4, v2}, Lax/S0/G;->X(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const/4 v6, 0x0

    .line 227
    invoke-interface {v0, v3, v6, v2}, Lax/q1/s;->p([BII)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Lax/S0/G;->v()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-static {v2, v1}, Lax/K1/s;->a(IZ)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_f0

    .line 239
    .line 240
    const/4 v11, 0x1

    .line 241
    :cond_f0
    const/4 v3, 0x4

    .line 242
    invoke-virtual {v4, v3}, Lax/S0/G;->c0(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Lax/S0/G;->a()I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    div-int/2addr v7, v3

    .line 250
    if-nez v11, :cond_114

    .line 251
    .line 252
    if-lez v7, :cond_114

    .line 253
    .line 254
    new-array v12, v7, [I

    .line 255
    .line 256
    const/4 v3, 0x0

    .line 257
    :goto_100
    if-ge v3, v7, :cond_112

    .line 258
    .line 259
    invoke-virtual {v4}, Lax/S0/G;->v()I

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    aput v9, v12, v3

    .line 264
    .line 265
    invoke-static {v9, v1}, Lax/K1/s;->a(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-eqz v9, :cond_10f

    .line 270
    .line 271
    goto :goto_117

    .line 272
    :cond_10f
    add-int/lit8 v3, v3, 0x1

    .line 273
    .line 274
    goto :goto_100

    .line 275
    :cond_112
    move v15, v11

    .line 276
    goto :goto_117

    .line 277
    :cond_114
    move v15, v11

    .line 278
    move-object/from16 v12, v17

    .line 279
    .line 280
    :goto_117
    if-nez v15, :cond_11f

    .line 281
    .line 282
    new-instance v0, Lax/K1/x;

    .line 283
    .line 284
    invoke-direct {v0, v2, v12}, Lax/K1/x;-><init>(I[I)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :cond_11f
    move v11, v15

    .line 289
    goto :goto_127

    .line 290
    :cond_121
    const/4 v6, 0x0

    .line 291
    if-eqz v2, :cond_127

    .line 292
    .line 293
    invoke-interface {v0, v2}, Lax/q1/s;->j(I)V

    .line 294
    .line 295
    .line 296
    :cond_127
    :goto_127
    move-wide/from16 v6, v18

    .line 297
    .line 298
    move-wide/from16 v2, v21

    .line 299
    .line 300
    goto/16 :goto_a2

    .line 301
    .line 302
    :cond_12d
    :goto_12d
    const/4 v9, 0x1

    .line 303
    :goto_12e
    if-nez v11, :cond_133

    .line 304
    .line 305
    sget-object v0, Lax/K1/o;->a:Lax/K1/o;

    .line 306
    .line 307
    return-object v0

    .line 308
    :cond_133
    move/from16 v0, p1

    .line 309
    .line 310
    if-eq v0, v9, :cond_13f

    .line 311
    .line 312
    if-eqz v9, :cond_13c

    .line 313
    .line 314
    sget-object v0, Lax/K1/i;->b:Lax/K1/i;

    .line 315
    .line 316
    return-object v0

    .line 317
    :cond_13c
    sget-object v0, Lax/K1/i;->c:Lax/K1/i;

    .line 318
    .line 319
    return-object v0

    .line 320
    :cond_13f
    return-object v17
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

.method public static d(Lax/q1/s;Z)Lax/q1/S;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lax/K1/s;->c(Lax/q1/s;ZZ)Lax/q1/S;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
