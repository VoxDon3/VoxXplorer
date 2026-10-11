.class final Lax/X4/o;
.super Lax/X4/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/X4/f;-><init>()V

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

.method private e(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;
    .registers 13

    .line 1
    sub-int v0, p5, p3

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    sub-int v1, p5, p4

    .line 6
    .line 7
    sub-int v2, p3, p2

    .line 8
    .line 9
    const/16 v3, 0x190

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-lez v2, :cond_21

    .line 13
    .line 14
    if-le v2, v3, :cond_1b

    .line 15
    .line 16
    invoke-static {}, Lax/X4/k;->c()Ljava/util/NavigableMap;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2, p2, p3}, Lax/X4/k;->f(Ljava/util/NavigableMap;II)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2, p3, v2}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_24

    .line 28
    :cond_1b
    invoke-static {p1, p2, p3, v4}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :goto_1f
    move-object v2, v4

    .line 33
    goto :goto_24

    .line 34
    :cond_21
    sget-object p2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 35
    .line 36
    goto :goto_1f

    .line 37
    :goto_24
    if-lez v0, :cond_4f

    .line 38
    .line 39
    if-le v1, v3, :cond_36

    .line 40
    .line 41
    if-nez v2, :cond_2e

    .line 42
    .line 43
    invoke-static {}, Lax/X4/k;->c()Ljava/util/NavigableMap;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_2e
    invoke-static {v2, p4, p5}, Lax/X4/k;->f(Ljava/util/NavigableMap;II)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p4, p5, v2}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_3a

    .line 55
    :cond_36
    invoke-static {p1, p4, p5, v4}, Lax/X4/C;->b(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_3a
    invoke-virtual {p2}, Ljava/math/BigInteger;->signum()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_42

    .line 64
    .line 65
    :goto_40
    move-object p2, p1

    .line 66
    goto :goto_4f

    .line 67
    :cond_42
    invoke-static {v2, v0}, Lax/X4/k;->a(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-static {p2, p3}, Lax/X4/l;->k(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_40

    .line 80
    :cond_4f
    :goto_4f
    new-instance p1, Ljava/math/BigDecimal;

    .line 81
    .line 82
    if-eqz p6, :cond_57

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :cond_57
    neg-int p3, p7

    .line 89
    invoke-direct {p1, p2, p3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 90
    .line 91
    .line 92
    return-object p1
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
.end method


# virtual methods
.method public c(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    .registers 32

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    const-string v9, "value exceeds limits"

    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    if-lt v1, v3, :cond_15

    .line 12
    .line 13
    :try_start_c
    invoke-virtual/range {p0 .. p3}, Lax/X4/o;->d(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :catch_11
    move-exception v0

    .line 19
    move-object v1, v9

    .line 20
    goto/16 :goto_13f

    .line 21
    .line 22
    :cond_15
    add-int/2addr v1, v0

    .line 23
    invoke-static {v2, v0, v1}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 24
    .line 25
    .line 26
    move-result v4
    :try_end_1a
    .catch Ljava/lang/ArithmeticException; {:try_start_c .. :try_end_1a} :catch_11

    .line 27
    const/16 v5, 0x2d

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-ne v4, v5, :cond_21

    .line 31
    .line 32
    :goto_1f
    const/4 v8, 0x1

    .line 33
    goto :goto_23

    .line 34
    :cond_21
    const/4 v7, 0x0

    .line 35
    goto :goto_1f

    .line 36
    :goto_23
    const-string v10, "illegal syntax"

    .line 37
    .line 38
    const/16 v11, 0x2b

    .line 39
    .line 40
    if-nez v7, :cond_2b

    .line 41
    .line 42
    if-ne v4, v11, :cond_33

    .line 43
    .line 44
    :cond_2b
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    :try_start_2d
    invoke-static {v2, v0, v1}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_138

    .line 51
    .line 52
    :cond_33
    const/4 v14, -0x1

    .line 53
    move v15, v0

    .line 54
    move/from16 p2, v4

    .line 55
    .line 56
    const-wide/16 v3, 0x0

    .line 57
    .line 58
    const/16 v16, 0x20

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    :goto_3d
    const-wide/16 v18, 0x30

    .line 63
    .line 64
    const-wide/16 v20, 0xa

    .line 65
    .line 66
    if-ge v15, v1, :cond_7c

    .line 67
    .line 68
    invoke-interface {v2, v15}, Ljava/lang/CharSequence;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-static {v6}, Lax/X4/i;->b(C)Z

    .line 73
    .line 74
    .line 75
    move-result v22

    .line 76
    if-eqz v22, :cond_54

    .line 77
    .line 78
    mul-long v3, v3, v20

    .line 79
    .line 80
    int-to-long v12, v6

    .line 81
    add-long/2addr v3, v12

    .line 82
    sub-long v3, v3, v18

    .line 83
    .line 84
    goto :goto_78

    .line 85
    :cond_54
    const/16 v12, 0x2e

    .line 86
    .line 87
    if-ne v6, v12, :cond_7e

    .line 88
    .line 89
    if-ltz v14, :cond_5c

    .line 90
    .line 91
    const/4 v12, 0x1

    .line 92
    goto :goto_5d

    .line 93
    :cond_5c
    const/4 v12, 0x0

    .line 94
    :goto_5d
    or-int v17, v17, v12

    .line 95
    .line 96
    move v12, v15

    .line 97
    :goto_60
    add-int/lit8 v13, v1, -0x4

    .line 98
    .line 99
    if-ge v12, v13, :cond_76

    .line 100
    .line 101
    add-int/lit8 v13, v12, 0x1

    .line 102
    .line 103
    invoke-static {v2, v13}, Lax/X4/i;->j(Ljava/lang/CharSequence;I)I

    .line 104
    .line 105
    .line 106
    move-result v13
    :try_end_6a
    .catch Ljava/lang/ArithmeticException; {:try_start_2d .. :try_end_6a} :catch_11

    .line 107
    if-gez v13, :cond_6d

    .line 108
    .line 109
    goto :goto_76

    .line 110
    :cond_6d
    const-wide/16 v18, 0x2710

    .line 111
    .line 112
    mul-long v3, v3, v18

    .line 113
    .line 114
    int-to-long v13, v13

    .line 115
    add-long/2addr v3, v13

    .line 116
    add-int/lit8 v12, v12, 0x4

    .line 117
    .line 118
    goto :goto_60

    .line 119
    :cond_76
    :goto_76
    move v14, v15

    .line 120
    move v15, v12

    .line 121
    :goto_78
    add-int/2addr v15, v8

    .line 122
    move/from16 p2, v6

    .line 123
    .line 124
    goto :goto_3d

    .line 125
    :cond_7c
    move/from16 v6, p2

    .line 126
    .line 127
    :cond_7e
    if-gez v14, :cond_8a

    .line 128
    .line 129
    sub-int v12, v15, v0

    .line 130
    .line 131
    move-object/from16 v24, v9

    .line 132
    .line 133
    move v14, v15

    .line 134
    const-wide/16 v8, 0x0

    .line 135
    .line 136
    const/16 v25, 0x1

    .line 137
    .line 138
    goto :goto_95

    .line 139
    :cond_8a
    sub-int v12, v15, v0

    .line 140
    .line 141
    sub-int/2addr v12, v8

    .line 142
    sub-int v13, v14, v15

    .line 143
    .line 144
    add-int/2addr v13, v8

    .line 145
    move-object/from16 v24, v9

    .line 146
    .line 147
    const/16 v25, 0x1

    .line 148
    .line 149
    int-to-long v8, v13

    .line 150
    :goto_95
    or-int/lit8 v6, v6, 0x20

    .line 151
    .line 152
    const/16 v13, 0x65

    .line 153
    .line 154
    const-wide/32 v26, 0x7fffffff

    .line 155
    .line 156
    .line 157
    if-ne v6, v13, :cond_f1

    .line 158
    .line 159
    add-int/lit8 v6, v15, 0x1

    .line 160
    .line 161
    :try_start_a0
    invoke-static {v2, v6, v1}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-ne v13, v5, :cond_a8

    .line 166
    .line 167
    const/4 v5, 0x1

    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    const/4 v5, 0x0

    .line 170
    :goto_a9
    if-nez v5, :cond_ad

    .line 171
    .line 172
    if-ne v13, v11, :cond_b3

    .line 173
    .line 174
    :cond_ad
    add-int/lit8 v6, v15, 0x2

    .line 175
    .line 176
    invoke-static {v2, v6, v1}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    :cond_b3
    invoke-static {v13}, Lax/X4/i;->b(C)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    xor-int/lit8 v11, v11, 0x1

    .line 185
    .line 186
    or-int v17, v17, v11

    .line 187
    .line 188
    const-wide/16 v22, 0x0

    .line 189
    .line 190
    :goto_bd
    cmp-long v11, v22, v26

    .line 191
    .line 192
    if-gez v11, :cond_cf

    .line 193
    .line 194
    mul-long v22, v22, v20

    .line 195
    .line 196
    move/from16 p2, v5

    .line 197
    .line 198
    move/from16 p3, v6

    .line 199
    .line 200
    int-to-long v5, v13

    .line 201
    add-long v22, v22, v5

    .line 202
    .line 203
    sub-long v22, v22, v18

    .line 204
    .line 205
    :goto_cc
    move-wide/from16 v5, v22

    .line 206
    .line 207
    goto :goto_d4

    .line 208
    :cond_cf
    move/from16 p2, v5

    .line 209
    .line 210
    move/from16 p3, v6

    .line 211
    .line 212
    goto :goto_cc

    .line 213
    :goto_d4
    add-int/lit8 v11, p3, 0x1

    .line 214
    .line 215
    invoke-static {v2, v11, v1}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    invoke-static {v13}, Lax/X4/i;->b(C)Z

    .line 220
    .line 221
    .line 222
    move-result v16

    .line 223
    if-nez v16, :cond_e7

    .line 224
    .line 225
    if-eqz p2, :cond_e3

    .line 226
    .line 227
    neg-long v5, v5

    .line 228
    :cond_e3
    add-long/2addr v8, v5

    .line 229
    move v6, v15

    .line 230
    move v15, v11

    .line 231
    goto :goto_f2

    .line 232
    :cond_e7
    move-wide/from16 v22, v5

    .line 233
    .line 234
    move v6, v11

    .line 235
    move/from16 v5, p2

    .line 236
    .line 237
    goto :goto_bd

    .line 238
    :catch_ed
    move-exception v0

    .line 239
    move-object/from16 v1, v24

    .line 240
    .line 241
    goto :goto_13f

    .line 242
    :cond_f1
    move v6, v1

    .line 243
    :goto_f2
    if-nez v17, :cond_130

    .line 244
    .line 245
    if-lt v15, v1, :cond_130

    .line 246
    .line 247
    if-eqz v12, :cond_130

    .line 248
    .line 249
    const v1, 0x4d0e4c1d    # 1.49209552E8f

    .line 250
    .line 251
    .line 252
    if-gt v12, v1, :cond_130

    .line 253
    .line 254
    const-wide/32 v10, -0x80000000

    .line 255
    .line 256
    .line 257
    cmp-long v1, v8, v10

    .line 258
    .line 259
    if-lez v1, :cond_126

    .line 260
    .line 261
    cmp-long v1, v8, v26

    .line 262
    .line 263
    if-gtz v1, :cond_126

    .line 264
    .line 265
    const/16 v1, 0x12

    .line 266
    .line 267
    if-gt v12, v1, :cond_11a

    .line 268
    .line 269
    new-instance v0, Ljava/math/BigDecimal;

    .line 270
    .line 271
    if-eqz v7, :cond_111

    .line 272
    .line 273
    neg-long v3, v3

    .line 274
    :cond_111
    invoke-direct {v0, v3, v4}, Ljava/math/BigDecimal;-><init>(J)V

    .line 275
    .line 276
    .line 277
    long-to-int v1, v8

    .line 278
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->scaleByPowerOfTen(I)Ljava/math/BigDecimal;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    return-object v0

    .line 283
    :cond_11a
    add-int/lit8 v5, v14, 0x1

    .line 284
    .line 285
    long-to-int v8, v8

    .line 286
    move-object/from16 v1, p0

    .line 287
    .line 288
    move v3, v0

    .line 289
    move v4, v14

    .line 290
    invoke-direct/range {v1 .. v8}, Lax/X4/o;->e(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0

    .line 295
    :cond_126
    new-instance v0, Ljava/lang/NumberFormatException;
    :try_end_128
    .catch Ljava/lang/ArithmeticException; {:try_start_a0 .. :try_end_128} :catch_ed

    .line 296
    .line 297
    move-object/from16 v1, v24

    .line 298
    .line 299
    :try_start_12a
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :catch_12e
    move-exception v0

    .line 304
    goto :goto_13f

    .line 305
    :cond_130
    move-object/from16 v1, v24

    .line 306
    .line 307
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 308
    .line 309
    invoke-direct {v0, v10}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_138
    move-object v1, v9

    .line 314
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 315
    .line 316
    invoke-direct {v0, v10}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0
    :try_end_13f
    .catch Ljava/lang/ArithmeticException; {:try_start_12a .. :try_end_13f} :catch_12e

    .line 320
    :goto_13f
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 321
    .line 322
    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 326
    .line 327
    .line 328
    throw v2
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

.method d(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    .registers 26

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x4d0e4c2b    # 1.49209776E8f

    .line 8
    .line 9
    .line 10
    const-string v4, "illegal syntax"

    .line 11
    .line 12
    if-gt v2, v3, :cond_157

    .line 13
    .line 14
    add-int/2addr v2, v0

    .line 15
    invoke-static {v1, v0, v2}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v5, 0x2d

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x1

    .line 23
    if-ne v3, v5, :cond_19

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    :cond_19
    const/4 v8, 0x0

    .line 27
    const/16 v9, 0x2b

    .line 28
    .line 29
    if-nez v6, :cond_20

    .line 30
    .line 31
    if-ne v3, v9, :cond_28

    .line 32
    .line 33
    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    invoke-static {v1, v0, v2}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_151

    .line 40
    .line 41
    :cond_28
    move v10, v0

    .line 42
    :goto_29
    add-int/lit8 v11, v2, -0x8

    .line 43
    .line 44
    if-ge v10, v11, :cond_36

    .line 45
    .line 46
    invoke-static {v1, v10}, Lax/X4/i;->d(Ljava/lang/CharSequence;I)Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    if-eqz v12, :cond_36

    .line 51
    .line 52
    add-int/lit8 v10, v10, 0x8

    .line 53
    .line 54
    goto :goto_29

    .line 55
    :cond_36
    :goto_36
    const/16 v12, 0x30

    .line 56
    .line 57
    if-ge v10, v2, :cond_43

    .line 58
    .line 59
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-ne v13, v12, :cond_43

    .line 64
    .line 65
    add-int/lit8 v10, v10, 0x1

    .line 66
    .line 67
    goto :goto_36

    .line 68
    :cond_43
    move v13, v10

    .line 69
    :goto_44
    if-ge v13, v11, :cond_4f

    .line 70
    .line 71
    invoke-static {v1, v13}, Lax/X4/i;->c(Ljava/lang/CharSequence;I)Z

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    if-eqz v14, :cond_4f

    .line 76
    .line 77
    add-int/lit8 v13, v13, 0x8

    .line 78
    .line 79
    goto :goto_44

    .line 80
    :cond_4f
    :goto_4f
    if-ge v13, v2, :cond_5e

    .line 81
    .line 82
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v3}, Lax/X4/i;->b(C)Z

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    if-eqz v14, :cond_5e

    .line 91
    .line 92
    add-int/lit8 v13, v13, 0x1

    .line 93
    .line 94
    goto :goto_4f

    .line 95
    :cond_5e
    const/16 v14, 0x2e

    .line 96
    .line 97
    if-ne v3, v14, :cond_99

    .line 98
    .line 99
    add-int/lit8 v14, v13, 0x1

    .line 100
    .line 101
    :goto_64
    if-ge v14, v11, :cond_6f

    .line 102
    .line 103
    invoke-static {v1, v14}, Lax/X4/i;->d(Ljava/lang/CharSequence;I)Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    if-eqz v15, :cond_6f

    .line 108
    .line 109
    add-int/lit8 v14, v14, 0x8

    .line 110
    .line 111
    goto :goto_64

    .line 112
    :cond_6f
    :goto_6f
    if-ge v14, v2, :cond_7a

    .line 113
    .line 114
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 115
    .line 116
    .line 117
    move-result v15

    .line 118
    if-ne v15, v12, :cond_7a

    .line 119
    .line 120
    add-int/lit8 v14, v14, 0x1

    .line 121
    .line 122
    goto :goto_6f

    .line 123
    :cond_7a
    move v12, v14

    .line 124
    :goto_7b
    if-ge v12, v11, :cond_86

    .line 125
    .line 126
    invoke-static {v1, v12}, Lax/X4/i;->c(Ljava/lang/CharSequence;I)Z

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    if-eqz v15, :cond_86

    .line 131
    .line 132
    add-int/lit8 v12, v12, 0x8

    .line 133
    .line 134
    goto :goto_7b

    .line 135
    :cond_86
    :goto_86
    if-ge v12, v2, :cond_95

    .line 136
    .line 137
    invoke-interface {v1, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-static {v3}, Lax/X4/i;->b(C)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_95

    .line 146
    .line 147
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    goto :goto_86

    .line 150
    :cond_95
    move v11, v14

    .line 151
    move v14, v13

    .line 152
    move v13, v12

    .line 153
    goto :goto_9b

    .line 154
    :cond_99
    const/4 v14, -0x1

    .line 155
    const/4 v11, -0x1

    .line 156
    :goto_9b
    if-gez v14, :cond_a7

    .line 157
    .line 158
    sub-int v11, v13, v10

    .line 159
    .line 160
    move v12, v11

    .line 161
    move v11, v13

    .line 162
    move v14, v11

    .line 163
    const/16 p3, 0x1

    .line 164
    .line 165
    const-wide/16 v8, 0x0

    .line 166
    .line 167
    goto :goto_b6

    .line 168
    :cond_a7
    if-ne v10, v14, :cond_ac

    .line 169
    .line 170
    sub-int v12, v13, v11

    .line 171
    .line 172
    goto :goto_af

    .line 173
    :cond_ac
    sub-int v12, v13, v10

    .line 174
    .line 175
    sub-int/2addr v12, v7

    .line 176
    :goto_af
    sub-int v17, v14, v13

    .line 177
    .line 178
    const/16 p3, 0x1

    .line 179
    .line 180
    add-int/lit8 v7, v17, 0x1

    .line 181
    .line 182
    int-to-long v8, v7

    .line 183
    :goto_b6
    or-int/lit8 v3, v3, 0x20

    .line 184
    .line 185
    const/16 v7, 0x65

    .line 186
    .line 187
    const-wide/32 v18, 0x7fffffff

    .line 188
    .line 189
    .line 190
    if-ne v3, v7, :cond_114

    .line 191
    .line 192
    add-int/lit8 v3, v13, 0x1

    .line 193
    .line 194
    invoke-static {v1, v3, v2}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-ne v7, v5, :cond_c9

    .line 199
    .line 200
    const/4 v5, 0x1

    .line 201
    goto :goto_ca

    .line 202
    :cond_c9
    const/4 v5, 0x0

    .line 203
    :goto_ca
    if-nez v5, :cond_d0

    .line 204
    .line 205
    const/16 v15, 0x2b

    .line 206
    .line 207
    if-ne v7, v15, :cond_d6

    .line 208
    .line 209
    :cond_d0
    add-int/lit8 v3, v13, 0x2

    .line 210
    .line 211
    invoke-static {v1, v3, v2}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    :cond_d6
    invoke-static {v7}, Lax/X4/i;->b(C)Z

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    xor-int/lit8 v15, v15, 0x1

    .line 220
    .line 221
    const-wide/16 v20, 0x0

    .line 222
    .line 223
    :goto_de
    cmp-long v16, v20, v18

    .line 224
    .line 225
    if-gez v16, :cond_f4

    .line 226
    .line 227
    const-wide/16 v16, 0xa

    .line 228
    .line 229
    mul-long v20, v20, v16

    .line 230
    .line 231
    move/from16 p2, v5

    .line 232
    .line 233
    move/from16 v16, v6

    .line 234
    .line 235
    int-to-long v5, v7

    .line 236
    add-long v20, v20, v5

    .line 237
    .line 238
    const-wide/16 v5, 0x30

    .line 239
    .line 240
    sub-long v20, v20, v5

    .line 241
    .line 242
    :goto_f1
    move-wide/from16 v5, v20

    .line 243
    .line 244
    goto :goto_f9

    .line 245
    :cond_f4
    move/from16 p2, v5

    .line 246
    .line 247
    move/from16 v16, v6

    .line 248
    .line 249
    goto :goto_f1

    .line 250
    :goto_f9
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    invoke-static {v1, v3, v2}, Lax/X4/f;->a(Ljava/lang/CharSequence;II)C

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    invoke-static {v7}, Lax/X4/i;->b(C)Z

    .line 257
    .line 258
    .line 259
    move-result v17

    .line 260
    if-nez v17, :cond_10d

    .line 261
    .line 262
    if-eqz p2, :cond_108

    .line 263
    .line 264
    neg-long v5, v5

    .line 265
    :cond_108
    add-long/2addr v8, v5

    .line 266
    move v5, v13

    .line 267
    move v6, v15

    .line 268
    move v13, v3

    .line 269
    goto :goto_118

    .line 270
    :cond_10d
    move-wide/from16 v20, v5

    .line 271
    .line 272
    move/from16 v6, v16

    .line 273
    .line 274
    move/from16 v5, p2

    .line 275
    .line 276
    goto :goto_de

    .line 277
    :cond_114
    move/from16 v16, v6

    .line 278
    .line 279
    move v5, v2

    .line 280
    const/4 v6, 0x0

    .line 281
    :goto_118
    if-nez v6, :cond_14b

    .line 282
    .line 283
    if-lt v13, v2, :cond_14b

    .line 284
    .line 285
    sub-int v0, v5, v0

    .line 286
    .line 287
    if-eqz v0, :cond_145

    .line 288
    .line 289
    const-wide/32 v2, -0x80000000

    .line 290
    .line 291
    .line 292
    cmp-long v0, v8, v2

    .line 293
    .line 294
    if-ltz v0, :cond_13d

    .line 295
    .line 296
    cmp-long v0, v8, v18

    .line 297
    .line 298
    if-gtz v0, :cond_13d

    .line 299
    .line 300
    const v0, 0x4d0e4c1d    # 1.49209552E8f

    .line 301
    .line 302
    .line 303
    if-gt v12, v0, :cond_13d

    .line 304
    .line 305
    long-to-int v7, v8

    .line 306
    move-object/from16 v0, p0

    .line 307
    .line 308
    move v2, v10

    .line 309
    move v4, v11

    .line 310
    move v3, v14

    .line 311
    move/from16 v6, v16

    .line 312
    .line 313
    invoke-direct/range {v0 .. v7}, Lax/X4/o;->e(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    return-object v1

    .line 318
    :cond_13d
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 319
    .line 320
    const-string v1, "value exceeds limits"

    .line 321
    .line 322
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :cond_145
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 327
    .line 328
    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :cond_14b
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 333
    .line 334
    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :cond_151
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 339
    .line 340
    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v0

    .line 344
    :cond_157
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 345
    .line 346
    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    throw v0
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
