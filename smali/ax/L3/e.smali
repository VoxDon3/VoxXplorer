.class public Lax/L3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/L3/a;


# static fields
.field private static final w:Ljava/lang/String; = "e"


# instance fields
.field private a:[I

.field private final b:[I

.field private c:Ljava/nio/ByteBuffer;

.field private d:[B

.field private e:[B

.field private f:I

.field private g:I

.field private h:[S

.field private i:[B

.field private j:[B

.field private k:[B

.field private l:[I

.field private m:I

.field private n:Lax/L3/c;

.field private o:Lax/L3/a$a;

.field private p:Landroid/graphics/Bitmap;

.field private q:Z

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Z


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
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

.method public constructor <init>(Lax/L3/a$a;)V
    .registers 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 4
    new-array v0, v0, [I

    iput-object v0, p0, Lax/L3/e;->b:[I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/L3/e;->f:I

    .line 6
    iput v0, p0, Lax/L3/e;->g:I

    .line 7
    iput-object p1, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 8
    new-instance p1, Lax/L3/c;

    invoke-direct {p1}, Lax/L3/c;-><init>()V

    iput-object p1, p0, Lax/L3/e;->n:Lax/L3/c;

    return-void
.end method

.method public constructor <init>(Lax/L3/a$a;Lax/L3/c;Ljava/nio/ByteBuffer;I)V
    .registers 5

    .line 1
    invoke-direct {p0, p1}, Lax/L3/e;-><init>(Lax/L3/a$a;)V

    .line 2
    invoke-virtual {p0, p2, p3, p4}, Lax/L3/e;->q(Lax/L3/c;Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method private a(III)I
    .registers 13

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, p1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x0

    .line 8
    :goto_7
    iget v7, p0, Lax/L3/e;->s:I

    .line 9
    .line 10
    add-int/2addr v7, p1

    .line 11
    if-ge v1, v7, :cond_34

    .line 12
    .line 13
    iget-object v7, p0, Lax/L3/e;->k:[B

    .line 14
    .line 15
    array-length v8, v7

    .line 16
    if-ge v1, v8, :cond_34

    .line 17
    .line 18
    if-ge v1, p2, :cond_34

    .line 19
    .line 20
    aget-byte v7, v7, v1

    .line 21
    .line 22
    and-int/lit16 v7, v7, 0xff

    .line 23
    .line 24
    iget-object v8, p0, Lax/L3/e;->a:[I

    .line 25
    .line 26
    aget v7, v8, v7

    .line 27
    .line 28
    if-eqz v7, :cond_31

    .line 29
    .line 30
    shr-int/lit8 v8, v7, 0x18

    .line 31
    .line 32
    and-int/lit16 v8, v8, 0xff

    .line 33
    .line 34
    add-int/2addr v2, v8

    .line 35
    shr-int/lit8 v8, v7, 0x10

    .line 36
    .line 37
    and-int/lit16 v8, v8, 0xff

    .line 38
    .line 39
    add-int/2addr v3, v8

    .line 40
    shr-int/lit8 v8, v7, 0x8

    .line 41
    .line 42
    and-int/lit16 v8, v8, 0xff

    .line 43
    .line 44
    add-int/2addr v4, v8

    .line 45
    and-int/lit16 v7, v7, 0xff

    .line 46
    .line 47
    add-int/2addr v5, v7

    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    :cond_31
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_7

    .line 53
    :cond_34
    add-int/2addr p1, p3

    .line 54
    move p3, p1

    .line 55
    :goto_36
    iget v1, p0, Lax/L3/e;->s:I

    .line 56
    .line 57
    add-int/2addr v1, p1

    .line 58
    if-ge p3, v1, :cond_63

    .line 59
    .line 60
    iget-object v1, p0, Lax/L3/e;->k:[B

    .line 61
    .line 62
    array-length v7, v1

    .line 63
    if-ge p3, v7, :cond_63

    .line 64
    .line 65
    if-ge p3, p2, :cond_63

    .line 66
    .line 67
    aget-byte v1, v1, p3

    .line 68
    .line 69
    and-int/lit16 v1, v1, 0xff

    .line 70
    .line 71
    iget-object v7, p0, Lax/L3/e;->a:[I

    .line 72
    .line 73
    aget v1, v7, v1

    .line 74
    .line 75
    if-eqz v1, :cond_60

    .line 76
    .line 77
    shr-int/lit8 v7, v1, 0x18

    .line 78
    .line 79
    and-int/lit16 v7, v7, 0xff

    .line 80
    .line 81
    add-int/2addr v2, v7

    .line 82
    shr-int/lit8 v7, v1, 0x10

    .line 83
    .line 84
    and-int/lit16 v7, v7, 0xff

    .line 85
    .line 86
    add-int/2addr v3, v7

    .line 87
    shr-int/lit8 v7, v1, 0x8

    .line 88
    .line 89
    and-int/lit16 v7, v7, 0xff

    .line 90
    .line 91
    add-int/2addr v4, v7

    .line 92
    and-int/lit16 v1, v1, 0xff

    .line 93
    .line 94
    add-int/2addr v5, v1

    .line 95
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    :cond_60
    add-int/lit8 p3, p3, 0x1

    .line 98
    .line 99
    goto :goto_36

    .line 100
    :cond_63
    if-nez v6, :cond_66

    .line 101
    .line 102
    return v0

    .line 103
    :cond_66
    div-int/2addr v2, v6

    .line 104
    shl-int/lit8 p1, v2, 0x18

    .line 105
    .line 106
    div-int/2addr v3, v6

    .line 107
    shl-int/lit8 p2, v3, 0x10

    .line 108
    .line 109
    or-int/2addr p1, p2

    .line 110
    div-int/2addr v4, v6

    .line 111
    shl-int/lit8 p2, v4, 0x8

    .line 112
    .line 113
    or-int/2addr p1, p2

    .line 114
    div-int/2addr v5, v6

    .line 115
    or-int/2addr p1, v5

    .line 116
    return p1
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

.method private k(Lax/L3/b;)V
    .registers 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, v0, Lax/L3/e;->f:I

    .line 7
    .line 8
    iput v2, v0, Lax/L3/e;->g:I

    .line 9
    .line 10
    if-eqz v1, :cond_12

    .line 11
    .line 12
    iget-object v3, v0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iget v4, v1, Lax/L3/b;->j:I

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    :cond_12
    if-nez v1, :cond_1d

    .line 20
    .line 21
    iget-object v1, v0, Lax/L3/e;->n:Lax/L3/c;

    .line 22
    .line 23
    iget v3, v1, Lax/L3/c;->f:I

    .line 24
    .line 25
    iget v1, v1, Lax/L3/c;->g:I

    .line 26
    .line 27
    :goto_1a
    mul-int v3, v3, v1

    .line 28
    .line 29
    goto :goto_22

    .line 30
    :cond_1d
    iget v3, v1, Lax/L3/b;->c:I

    .line 31
    .line 32
    iget v1, v1, Lax/L3/b;->d:I

    .line 33
    .line 34
    goto :goto_1a

    .line 35
    :goto_22
    iget-object v1, v0, Lax/L3/e;->k:[B

    .line 36
    .line 37
    if-eqz v1, :cond_29

    .line 38
    .line 39
    array-length v1, v1

    .line 40
    if-ge v1, v3, :cond_31

    .line 41
    .line 42
    :cond_29
    iget-object v1, v0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 43
    .line 44
    invoke-interface {v1, v3}, Lax/L3/a$a;->e(I)[B

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, v0, Lax/L3/e;->k:[B

    .line 49
    .line 50
    :cond_31
    iget-object v1, v0, Lax/L3/e;->h:[S

    .line 51
    .line 52
    const/16 v4, 0x1000

    .line 53
    .line 54
    if-nez v1, :cond_3b

    .line 55
    .line 56
    new-array v1, v4, [S

    .line 57
    .line 58
    iput-object v1, v0, Lax/L3/e;->h:[S

    .line 59
    .line 60
    :cond_3b
    iget-object v1, v0, Lax/L3/e;->i:[B

    .line 61
    .line 62
    if-nez v1, :cond_43

    .line 63
    .line 64
    new-array v1, v4, [B

    .line 65
    .line 66
    iput-object v1, v0, Lax/L3/e;->i:[B

    .line 67
    .line 68
    :cond_43
    iget-object v1, v0, Lax/L3/e;->j:[B

    .line 69
    .line 70
    if-nez v1, :cond_4d

    .line 71
    .line 72
    const/16 v1, 0x1001

    .line 73
    .line 74
    new-array v1, v1, [B

    .line 75
    .line 76
    iput-object v1, v0, Lax/L3/e;->j:[B

    .line 77
    .line 78
    :cond_4d
    invoke-direct {v0}, Lax/L3/e;->o()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v5, 0x1

    .line 83
    shl-int v6, v5, v1

    .line 84
    .line 85
    add-int/lit8 v7, v6, 0x1

    .line 86
    .line 87
    add-int/lit8 v8, v6, 0x2

    .line 88
    .line 89
    add-int/2addr v1, v5

    .line 90
    shl-int v9, v5, v1

    .line 91
    .line 92
    sub-int/2addr v9, v5

    .line 93
    const/4 v10, 0x0

    .line 94
    :goto_5d
    if-ge v10, v6, :cond_6b

    .line 95
    .line 96
    iget-object v11, v0, Lax/L3/e;->h:[S

    .line 97
    .line 98
    aput-short v2, v11, v10

    .line 99
    .line 100
    iget-object v11, v0, Lax/L3/e;->i:[B

    .line 101
    .line 102
    int-to-byte v12, v10

    .line 103
    aput-byte v12, v11, v10

    .line 104
    .line 105
    add-int/lit8 v10, v10, 0x1

    .line 106
    .line 107
    goto :goto_5d

    .line 108
    :cond_6b
    const/4 v10, -0x1

    .line 109
    move/from16 v19, v1

    .line 110
    .line 111
    move/from16 v17, v8

    .line 112
    .line 113
    move/from16 v18, v9

    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v12, 0x0

    .line 117
    const/4 v13, 0x0

    .line 118
    const/4 v14, 0x0

    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v20, -0x1

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    :goto_7f
    const/16 v23, 0x0

    .line 129
    .line 130
    if-ge v11, v3, :cond_17d

    .line 131
    .line 132
    const/4 v2, 0x3

    .line 133
    if-nez v12, :cond_91

    .line 134
    .line 135
    invoke-direct {v0}, Lax/L3/e;->n()I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-gtz v12, :cond_90

    .line 140
    .line 141
    iput v2, v0, Lax/L3/e;->r:I

    .line 142
    .line 143
    goto/16 :goto_17d

    .line 144
    .line 145
    :cond_90
    const/4 v13, 0x0

    .line 146
    :cond_91
    const/16 p1, 0x1

    .line 147
    .line 148
    iget-object v5, v0, Lax/L3/e;->d:[B

    .line 149
    .line 150
    aget-byte v5, v5, v13

    .line 151
    .line 152
    and-int/lit16 v5, v5, 0xff

    .line 153
    .line 154
    shl-int/2addr v5, v14

    .line 155
    add-int/2addr v15, v5

    .line 156
    add-int/lit8 v14, v14, 0x8

    .line 157
    .line 158
    add-int/lit8 v13, v13, 0x1

    .line 159
    .line 160
    add-int/2addr v12, v10

    .line 161
    move/from16 v5, v17

    .line 162
    .line 163
    move/from16 v4, v19

    .line 164
    .line 165
    move/from16 v24, v20

    .line 166
    .line 167
    move/from16 v25, v21

    .line 168
    .line 169
    :goto_a8
    if-lt v14, v4, :cond_165

    .line 170
    .line 171
    and-int v10, v15, v18

    .line 172
    .line 173
    shr-int/2addr v15, v4

    .line 174
    sub-int/2addr v14, v4

    .line 175
    if-ne v10, v6, :cond_b8

    .line 176
    .line 177
    move v4, v1

    .line 178
    move v5, v8

    .line 179
    move/from16 v18, v9

    .line 180
    .line 181
    const/4 v10, -0x1

    .line 182
    const/16 v24, -0x1

    .line 183
    .line 184
    goto :goto_a8

    .line 185
    :cond_b8
    if-le v10, v5, :cond_bd

    .line 186
    .line 187
    iput v2, v0, Lax/L3/e;->r:I

    .line 188
    .line 189
    goto :goto_bf

    .line 190
    :cond_bd
    if-ne v10, v7, :cond_cd

    .line 191
    .line 192
    :goto_bf
    move/from16 v19, v4

    .line 193
    .line 194
    move/from16 v17, v5

    .line 195
    .line 196
    move/from16 v20, v24

    .line 197
    .line 198
    move/from16 v21, v25

    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    const/16 v4, 0x1000

    .line 202
    .line 203
    const/4 v5, 0x1

    .line 204
    const/4 v10, -0x1

    .line 205
    goto :goto_7f

    .line 206
    :cond_cd
    move/from16 v19, v1

    .line 207
    .line 208
    move/from16 v2, v24

    .line 209
    .line 210
    const/4 v1, -0x1

    .line 211
    if-ne v2, v1, :cond_e9

    .line 212
    .line 213
    iget-object v2, v0, Lax/L3/e;->j:[B

    .line 214
    .line 215
    add-int/lit8 v21, v22, 0x1

    .line 216
    .line 217
    iget-object v1, v0, Lax/L3/e;->i:[B

    .line 218
    .line 219
    aget-byte v1, v1, v10

    .line 220
    .line 221
    aput-byte v1, v2, v22

    .line 222
    .line 223
    move/from16 v24, v10

    .line 224
    .line 225
    move/from16 v25, v24

    .line 226
    .line 227
    move/from16 v1, v19

    .line 228
    .line 229
    move/from16 v22, v21

    .line 230
    .line 231
    :goto_e6
    const/4 v2, 0x3

    .line 232
    const/4 v10, -0x1

    .line 233
    goto :goto_a8

    .line 234
    :cond_e9
    if-lt v10, v5, :cond_fa

    .line 235
    .line 236
    iget-object v1, v0, Lax/L3/e;->j:[B

    .line 237
    .line 238
    add-int/lit8 v21, v22, 0x1

    .line 239
    .line 240
    move-object/from16 v26, v1

    .line 241
    .line 242
    move/from16 v1, v25

    .line 243
    .line 244
    int-to-byte v1, v1

    .line 245
    aput-byte v1, v26, v22

    .line 246
    .line 247
    move v1, v2

    .line 248
    move/from16 v22, v21

    .line 249
    .line 250
    goto :goto_fb

    .line 251
    :cond_fa
    move v1, v10

    .line 252
    :goto_fb
    if-lt v1, v6, :cond_112

    .line 253
    .line 254
    move/from16 v21, v1

    .line 255
    .line 256
    iget-object v1, v0, Lax/L3/e;->j:[B

    .line 257
    .line 258
    add-int/lit8 v25, v22, 0x1

    .line 259
    .line 260
    move-object/from16 v26, v1

    .line 261
    .line 262
    iget-object v1, v0, Lax/L3/e;->i:[B

    .line 263
    .line 264
    aget-byte v1, v1, v21

    .line 265
    .line 266
    aput-byte v1, v26, v22

    .line 267
    .line 268
    iget-object v1, v0, Lax/L3/e;->h:[S

    .line 269
    .line 270
    aget-short v1, v1, v21

    .line 271
    .line 272
    move/from16 v22, v25

    .line 273
    .line 274
    goto :goto_fb

    .line 275
    :cond_112
    move/from16 v21, v1

    .line 276
    .line 277
    iget-object v1, v0, Lax/L3/e;->i:[B

    .line 278
    .line 279
    move-object/from16 v25, v1

    .line 280
    .line 281
    aget-byte v1, v25, v21

    .line 282
    .line 283
    and-int/lit16 v1, v1, 0xff

    .line 284
    .line 285
    move/from16 v21, v4

    .line 286
    .line 287
    iget-object v4, v0, Lax/L3/e;->j:[B

    .line 288
    .line 289
    add-int/lit8 v26, v22, 0x1

    .line 290
    .line 291
    move-object/from16 v27, v4

    .line 292
    .line 293
    int-to-byte v4, v1

    .line 294
    aput-byte v4, v27, v22

    .line 295
    .line 296
    move/from16 v22, v1

    .line 297
    .line 298
    const/16 v1, 0x1000

    .line 299
    .line 300
    if-ge v5, v1, :cond_145

    .line 301
    .line 302
    iget-object v1, v0, Lax/L3/e;->h:[S

    .line 303
    .line 304
    int-to-short v2, v2

    .line 305
    aput-short v2, v1, v5

    .line 306
    .line 307
    aput-byte v4, v25, v5

    .line 308
    .line 309
    add-int/lit8 v5, v5, 0x1

    .line 310
    .line 311
    and-int v1, v5, v18

    .line 312
    .line 313
    if-nez v1, :cond_143

    .line 314
    .line 315
    const/16 v1, 0x1000

    .line 316
    .line 317
    if-ge v5, v1, :cond_145

    .line 318
    .line 319
    add-int/lit8 v4, v21, 0x1

    .line 320
    .line 321
    add-int v18, v18, v5

    .line 322
    .line 323
    goto :goto_147

    .line 324
    :cond_143
    const/16 v1, 0x1000

    .line 325
    .line 326
    :cond_145
    move/from16 v4, v21

    .line 327
    .line 328
    :goto_147
    if-lez v26, :cond_15c

    .line 329
    .line 330
    iget-object v2, v0, Lax/L3/e;->k:[B

    .line 331
    .line 332
    add-int/lit8 v17, v16, 0x1

    .line 333
    .line 334
    iget-object v1, v0, Lax/L3/e;->j:[B

    .line 335
    .line 336
    add-int/lit8 v26, v26, -0x1

    .line 337
    .line 338
    aget-byte v1, v1, v26

    .line 339
    .line 340
    aput-byte v1, v2, v16

    .line 341
    .line 342
    add-int/lit8 v11, v11, 0x1

    .line 343
    .line 344
    move/from16 v16, v17

    .line 345
    .line 346
    const/16 v1, 0x1000

    .line 347
    .line 348
    goto :goto_147

    .line 349
    :cond_15c
    move/from16 v24, v10

    .line 350
    .line 351
    move/from16 v1, v19

    .line 352
    .line 353
    move/from16 v25, v22

    .line 354
    .line 355
    move/from16 v22, v26

    .line 356
    .line 357
    goto :goto_e6

    .line 358
    :cond_165
    move/from16 v19, v1

    .line 359
    .line 360
    move/from16 v21, v4

    .line 361
    .line 362
    move/from16 v2, v24

    .line 363
    .line 364
    move/from16 v1, v25

    .line 365
    .line 366
    move/from16 v21, v1

    .line 367
    .line 368
    move/from16 v1, v19

    .line 369
    .line 370
    move/from16 v19, v4

    .line 371
    .line 372
    move/from16 v20, v2

    .line 373
    .line 374
    move/from16 v17, v5

    .line 375
    .line 376
    const/4 v2, 0x0

    .line 377
    const/16 v4, 0x1000

    .line 378
    .line 379
    const/4 v5, 0x1

    .line 380
    goto/16 :goto_7f

    .line 381
    .line 382
    :cond_17d
    :goto_17d
    move/from16 v1, v16

    .line 383
    .line 384
    :goto_17f
    if-ge v1, v3, :cond_188

    .line 385
    .line 386
    iget-object v2, v0, Lax/L3/e;->k:[B

    .line 387
    .line 388
    aput-byte v23, v2, v1

    .line 389
    .line 390
    add-int/lit8 v1, v1, 0x1

    .line 391
    .line 392
    goto :goto_17f

    .line 393
    :cond_188
    return-void
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

.method private m()Landroid/graphics/Bitmap;
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/L3/e;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 9
    .line 10
    :goto_9
    iget-object v1, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 11
    .line 12
    iget v2, p0, Lax/L3/e;->u:I

    .line 13
    .line 14
    iget v3, p0, Lax/L3/e;->t:I

    .line 15
    .line 16
    invoke-interface {v1, v2, v3, v0}, Lax/L3/a$a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
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
.end method

.method private n()I
    .registers 8

    .line 1
    invoke-direct {p0}, Lax/L3/e;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_61

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_7
    iget-object v2, p0, Lax/L3/e;->d:[B

    .line 9
    .line 10
    if-nez v2, :cond_18

    .line 11
    .line 12
    iget-object v2, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 13
    .line 14
    const/16 v3, 0xff

    .line 15
    .line 16
    invoke-interface {v2, v3}, Lax/L3/a$a;->e(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, Lax/L3/e;->d:[B

    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catch_16
    move-exception v2

    .line 24
    goto :goto_58

    .line 25
    :cond_18
    :goto_18
    iget v2, p0, Lax/L3/e;->f:I

    .line 26
    .line 27
    iget v3, p0, Lax/L3/e;->g:I

    .line 28
    .line 29
    sub-int/2addr v2, v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-lt v2, v0, :cond_2d

    .line 32
    .line 33
    iget-object v2, p0, Lax/L3/e;->e:[B

    .line 34
    .line 35
    iget-object v5, p0, Lax/L3/e;->d:[B

    .line 36
    .line 37
    invoke-static {v2, v3, v5, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    iget v2, p0, Lax/L3/e;->g:I

    .line 41
    .line 42
    add-int/2addr v2, v0

    .line 43
    iput v2, p0, Lax/L3/e;->g:I

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2d
    iget-object v3, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/2addr v3, v2

    .line 53
    if-lt v3, v0, :cond_55

    .line 54
    .line 55
    iget-object v3, p0, Lax/L3/e;->e:[B

    .line 56
    .line 57
    iget v5, p0, Lax/L3/e;->g:I

    .line 58
    .line 59
    iget-object v6, p0, Lax/L3/e;->d:[B

    .line 60
    .line 61
    invoke-static {v3, v5, v6, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 62
    .line 63
    .line 64
    iget v3, p0, Lax/L3/e;->f:I

    .line 65
    .line 66
    iput v3, p0, Lax/L3/e;->g:I

    .line 67
    .line 68
    invoke-direct {p0}, Lax/L3/e;->p()V

    .line 69
    .line 70
    .line 71
    sub-int v3, v0, v2

    .line 72
    .line 73
    iget-object v5, p0, Lax/L3/e;->e:[B

    .line 74
    .line 75
    iget-object v6, p0, Lax/L3/e;->d:[B

    .line 76
    .line 77
    invoke-static {v5, v4, v6, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    iget v2, p0, Lax/L3/e;->g:I

    .line 81
    .line 82
    add-int/2addr v2, v3

    .line 83
    iput v2, p0, Lax/L3/e;->g:I

    .line 84
    .line 85
    return v0

    .line 86
    :cond_55
    iput v1, p0, Lax/L3/e;->r:I
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_57} :catch_16

    .line 87
    .line 88
    return v0

    .line 89
    :goto_58
    sget-object v3, Lax/L3/e;->w:Ljava/lang/String;

    .line 90
    .line 91
    const-string v4, "Error Reading Block"

    .line 92
    .line 93
    invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 94
    .line 95
    .line 96
    iput v1, p0, Lax/L3/e;->r:I

    .line 97
    .line 98
    :cond_61
    return v0
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
.end method

.method private o()I
    .registers 4

    .line 1
    :try_start_0
    invoke-direct {p0}, Lax/L3/e;->p()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/L3/e;->e:[B

    .line 5
    .line 6
    iget v1, p0, Lax/L3/e;->g:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    iput v2, p0, Lax/L3/e;->g:I

    .line 11
    .line 12
    aget-byte v0, v0, v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_d} :catch_10

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    return v0

    .line 17
    :catch_10
    const/4 v0, 0x1

    .line 18
    iput v0, p0, Lax/L3/e;->r:I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method private p()V
    .registers 5

    .line 1
    iget v0, p0, Lax/L3/e;->f:I

    .line 2
    .line 3
    iget v1, p0, Lax/L3/e;->g:I

    .line 4
    .line 5
    if-le v0, v1, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/L3/e;->e:[B

    .line 9
    .line 10
    const/16 v1, 0x4000

    .line 11
    .line 12
    if-nez v0, :cond_15

    .line 13
    .line 14
    iget-object v0, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lax/L3/a$a;->e(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lax/L3/e;->e:[B

    .line 21
    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lax/L3/e;->g:I

    .line 24
    .line 25
    iget-object v2, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lax/L3/e;->f:I

    .line 36
    .line 37
    iget-object v2, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    iget-object v3, p0, Lax/L3/e;->e:[B

    .line 40
    .line 41
    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    return-void
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

.method private r(Lax/L3/b;Lax/L3/b;)Landroid/graphics/Bitmap;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lax/L3/e;->l:[I

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    if-nez v2, :cond_e

    .line 11
    .line 12
    invoke-static {v3, v10}, Ljava/util/Arrays;->fill([II)V

    .line 13
    .line 14
    .line 15
    :cond_e
    const/4 v11, 0x3

    .line 16
    const/4 v12, 0x2

    .line 17
    const/4 v13, 0x1

    .line 18
    if-eqz v2, :cond_5a

    .line 19
    .line 20
    iget v4, v2, Lax/L3/b;->g:I

    .line 21
    .line 22
    if-lez v4, :cond_5a

    .line 23
    .line 24
    if-ne v4, v12, :cond_5c

    .line 25
    .line 26
    iget-boolean v4, v1, Lax/L3/b;->f:Z

    .line 27
    .line 28
    if-nez v4, :cond_2d

    .line 29
    .line 30
    iget-object v4, v0, Lax/L3/e;->n:Lax/L3/c;

    .line 31
    .line 32
    iget v5, v4, Lax/L3/c;->l:I

    .line 33
    .line 34
    iget-object v6, v1, Lax/L3/b;->k:[I

    .line 35
    .line 36
    if-eqz v6, :cond_34

    .line 37
    .line 38
    iget v4, v4, Lax/L3/c;->j:I

    .line 39
    .line 40
    iget v6, v1, Lax/L3/b;->h:I

    .line 41
    .line 42
    if-ne v4, v6, :cond_34

    .line 43
    .line 44
    :cond_2b
    :goto_2b
    const/4 v5, 0x0

    .line 45
    goto :goto_34

    .line 46
    :cond_2d
    iget v4, v0, Lax/L3/e;->m:I

    .line 47
    .line 48
    if-nez v4, :cond_2b

    .line 49
    .line 50
    iput-boolean v13, v0, Lax/L3/e;->v:Z

    .line 51
    .line 52
    goto :goto_2b

    .line 53
    :cond_34
    :goto_34
    iget v4, v2, Lax/L3/b;->d:I

    .line 54
    .line 55
    iget v6, v0, Lax/L3/e;->s:I

    .line 56
    .line 57
    div-int/2addr v4, v6

    .line 58
    iget v7, v2, Lax/L3/b;->b:I

    .line 59
    .line 60
    div-int/2addr v7, v6

    .line 61
    iget v8, v2, Lax/L3/b;->c:I

    .line 62
    .line 63
    div-int/2addr v8, v6

    .line 64
    iget v2, v2, Lax/L3/b;->a:I

    .line 65
    .line 66
    div-int/2addr v2, v6

    .line 67
    iget v6, v0, Lax/L3/e;->u:I

    .line 68
    .line 69
    mul-int v7, v7, v6

    .line 70
    .line 71
    add-int/2addr v7, v2

    .line 72
    mul-int v4, v4, v6

    .line 73
    .line 74
    add-int/2addr v4, v7

    .line 75
    :goto_4a
    if-ge v7, v4, :cond_5a

    .line 76
    .line 77
    add-int v2, v7, v8

    .line 78
    .line 79
    move v6, v7

    .line 80
    :goto_4f
    if-ge v6, v2, :cond_56

    .line 81
    .line 82
    aput v5, v3, v6

    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    goto :goto_4f

    .line 87
    :cond_56
    iget v2, v0, Lax/L3/e;->u:I

    .line 88
    .line 89
    add-int/2addr v7, v2

    .line 90
    goto :goto_4a

    .line 91
    :cond_5a
    :goto_5a
    move-object v2, v3

    .line 92
    goto :goto_6e

    .line 93
    :cond_5c
    if-ne v4, v11, :cond_5a

    .line 94
    .line 95
    iget-object v2, v0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 96
    .line 97
    if-eqz v2, :cond_5a

    .line 98
    .line 99
    iget v5, v0, Lax/L3/e;->u:I

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    iget v9, v0, Lax/L3/e;->t:I

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    move v8, v5

    .line 107
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 108
    .line 109
    .line 110
    goto :goto_5a

    .line 111
    :goto_6e
    invoke-direct/range {p0 .. p1}, Lax/L3/e;->k(Lax/L3/b;)V

    .line 112
    .line 113
    .line 114
    iget v3, v1, Lax/L3/b;->d:I

    .line 115
    .line 116
    iget v4, v0, Lax/L3/e;->s:I

    .line 117
    .line 118
    div-int/2addr v3, v4

    .line 119
    iget v5, v1, Lax/L3/b;->b:I

    .line 120
    .line 121
    div-int/2addr v5, v4

    .line 122
    iget v6, v1, Lax/L3/b;->c:I

    .line 123
    .line 124
    div-int/2addr v6, v4

    .line 125
    iget v7, v1, Lax/L3/b;->a:I

    .line 126
    .line 127
    div-int/2addr v7, v4

    .line 128
    iget v4, v0, Lax/L3/e;->m:I

    .line 129
    .line 130
    if-nez v4, :cond_85

    .line 131
    .line 132
    const/4 v4, 0x1

    .line 133
    goto :goto_86

    .line 134
    :cond_85
    const/4 v4, 0x0

    .line 135
    :goto_86
    const/16 v8, 0x8

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    const/4 v14, 0x1

    .line 139
    :goto_8a
    if-ge v10, v3, :cond_10e

    .line 140
    .line 141
    iget-boolean v15, v1, Lax/L3/b;->e:Z

    .line 142
    .line 143
    if-eqz v15, :cond_a6

    .line 144
    .line 145
    if-lt v9, v3, :cond_a3

    .line 146
    .line 147
    add-int/lit8 v14, v14, 0x1

    .line 148
    .line 149
    const/4 v15, 0x4

    .line 150
    if-eq v14, v12, :cond_a2

    .line 151
    .line 152
    if-eq v14, v11, :cond_9f

    .line 153
    .line 154
    if-eq v14, v15, :cond_9c

    .line 155
    .line 156
    goto :goto_a3

    .line 157
    :cond_9c
    const/4 v8, 0x2

    .line 158
    const/4 v9, 0x1

    .line 159
    goto :goto_a3

    .line 160
    :cond_9f
    const/4 v8, 0x4

    .line 161
    const/4 v9, 0x2

    .line 162
    goto :goto_a3

    .line 163
    :cond_a2
    const/4 v9, 0x4

    .line 164
    :cond_a3
    :goto_a3
    add-int v15, v9, v8

    .line 165
    .line 166
    goto :goto_a8

    .line 167
    :cond_a6
    move v15, v9

    .line 168
    move v9, v10

    .line 169
    :goto_a8
    add-int/2addr v9, v5

    .line 170
    iget v11, v0, Lax/L3/e;->t:I

    .line 171
    .line 172
    if-ge v9, v11, :cond_fe

    .line 173
    .line 174
    iget v11, v0, Lax/L3/e;->u:I

    .line 175
    .line 176
    mul-int v9, v9, v11

    .line 177
    .line 178
    add-int v16, v9, v7

    .line 179
    .line 180
    add-int v12, v16, v6

    .line 181
    .line 182
    add-int v13, v9, v11

    .line 183
    .line 184
    if-ge v13, v12, :cond_bb

    .line 185
    .line 186
    add-int v12, v9, v11

    .line 187
    .line 188
    :cond_bb
    iget v9, v0, Lax/L3/e;->s:I

    .line 189
    .line 190
    mul-int v11, v10, v9

    .line 191
    .line 192
    iget v13, v1, Lax/L3/b;->c:I

    .line 193
    .line 194
    mul-int v11, v11, v13

    .line 195
    .line 196
    sub-int v13, v12, v16

    .line 197
    .line 198
    mul-int v13, v13, v9

    .line 199
    .line 200
    add-int/2addr v13, v11

    .line 201
    move/from16 v9, v16

    .line 202
    .line 203
    :goto_ca
    if-ge v9, v12, :cond_fe

    .line 204
    .line 205
    move-object/from16 p2, v2

    .line 206
    .line 207
    iget v2, v0, Lax/L3/e;->s:I

    .line 208
    .line 209
    move/from16 v16, v3

    .line 210
    .line 211
    const/4 v3, 0x1

    .line 212
    if-ne v2, v3, :cond_e0

    .line 213
    .line 214
    iget-object v2, v0, Lax/L3/e;->k:[B

    .line 215
    .line 216
    aget-byte v2, v2, v11

    .line 217
    .line 218
    and-int/lit16 v2, v2, 0xff

    .line 219
    .line 220
    iget-object v3, v0, Lax/L3/e;->a:[I

    .line 221
    .line 222
    aget v2, v3, v2

    .line 223
    .line 224
    goto :goto_e6

    .line 225
    :cond_e0
    iget v2, v1, Lax/L3/b;->c:I

    .line 226
    .line 227
    invoke-direct {v0, v11, v13, v2}, Lax/L3/e;->a(III)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    :goto_e6
    if-eqz v2, :cond_eb

    .line 232
    .line 233
    aput v2, p2, v9

    .line 234
    .line 235
    goto :goto_f4

    .line 236
    :cond_eb
    iget-boolean v2, v0, Lax/L3/e;->v:Z

    .line 237
    .line 238
    if-nez v2, :cond_f4

    .line 239
    .line 240
    if-eqz v4, :cond_f4

    .line 241
    .line 242
    const/4 v3, 0x1

    .line 243
    iput-boolean v3, v0, Lax/L3/e;->v:Z

    .line 244
    .line 245
    :cond_f4
    :goto_f4
    iget v2, v0, Lax/L3/e;->s:I

    .line 246
    .line 247
    add-int/2addr v11, v2

    .line 248
    add-int/lit8 v9, v9, 0x1

    .line 249
    .line 250
    move-object/from16 v2, p2

    .line 251
    .line 252
    move/from16 v3, v16

    .line 253
    .line 254
    goto :goto_ca

    .line 255
    :cond_fe
    move-object/from16 p2, v2

    .line 256
    .line 257
    move/from16 v16, v3

    .line 258
    .line 259
    add-int/lit8 v10, v10, 0x1

    .line 260
    .line 261
    move-object/from16 v2, p2

    .line 262
    .line 263
    move v9, v15

    .line 264
    move/from16 v3, v16

    .line 265
    .line 266
    const/4 v11, 0x3

    .line 267
    const/4 v12, 0x2

    .line 268
    const/4 v13, 0x1

    .line 269
    goto/16 :goto_8a

    .line 270
    .line 271
    :cond_10e
    move-object/from16 p2, v2

    .line 272
    .line 273
    iget-boolean v2, v0, Lax/L3/e;->q:Z

    .line 274
    .line 275
    if-eqz v2, :cond_11c

    .line 276
    .line 277
    iget v1, v1, Lax/L3/b;->g:I

    .line 278
    .line 279
    if-eqz v1, :cond_11f

    .line 280
    .line 281
    const/4 v3, 0x1

    .line 282
    if-ne v1, v3, :cond_11c

    .line 283
    .line 284
    goto :goto_11f

    .line 285
    :cond_11c
    move-object/from16 v2, p2

    .line 286
    .line 287
    goto :goto_138

    .line 288
    :cond_11f
    :goto_11f
    iget-object v1, v0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 289
    .line 290
    if-nez v1, :cond_129

    .line 291
    .line 292
    invoke-direct {v0}, Lax/L3/e;->m()Landroid/graphics/Bitmap;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iput-object v1, v0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 297
    .line 298
    :cond_129
    iget-object v1, v0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 299
    .line 300
    iget v4, v0, Lax/L3/e;->u:I

    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    iget v8, v0, Lax/L3/e;->t:I

    .line 304
    .line 305
    const/4 v3, 0x0

    .line 306
    const/4 v5, 0x0

    .line 307
    move v7, v4

    .line 308
    move-object/from16 v2, p2

    .line 309
    .line 310
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 311
    .line 312
    .line 313
    :goto_138
    invoke-direct {v0}, Lax/L3/e;->m()Landroid/graphics/Bitmap;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget v4, v0, Lax/L3/e;->u:I

    .line 318
    .line 319
    const/4 v6, 0x0

    .line 320
    iget v8, v0, Lax/L3/e;->t:I

    .line 321
    .line 322
    const/4 v3, 0x0

    .line 323
    const/4 v5, 0x0

    .line 324
    move v7, v4

    .line 325
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 326
    .line 327
    .line 328
    return-object v1
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
.end method


# virtual methods
.method public b()Ljava/nio/ByteBuffer;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object v0
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

.method public declared-synchronized c()Landroid/graphics/Bitmap;
    .registers 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 3
    .line 4
    iget v0, v0, Lax/L3/c;->c:I

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x1

    .line 8
    if-lez v0, :cond_11

    .line 9
    .line 10
    iget v0, p0, Lax/L3/e;->m:I

    .line 11
    .line 12
    if-gez v0, :cond_3d

    .line 13
    .line 14
    goto :goto_11

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    goto/16 :goto_cd

    .line 17
    .line 18
    :cond_11
    :goto_11
    sget-object v0, Lax/L3/e;->w:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_3b

    .line 25
    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "Unable to decode frame, frameCount="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v4, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 37
    .line 38
    iget v4, v4, Lax/L3/c;->c:I

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, ", framePointer="

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v4, p0, Lax/L3/e;->m:I

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    :cond_3b
    iput v2, p0, Lax/L3/e;->r:I

    .line 61
    .line 62
    :cond_3d
    iget v0, p0, Lax/L3/e;->r:I

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    if-eq v0, v2, :cond_ad

    .line 66
    .line 67
    const/4 v4, 0x2

    .line 68
    if-ne v0, v4, :cond_46

    .line 69
    .line 70
    goto :goto_ad

    .line 71
    :cond_46
    const/4 v0, 0x0

    .line 72
    iput v0, p0, Lax/L3/e;->r:I

    .line 73
    .line 74
    iget-object v4, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 75
    .line 76
    iget-object v4, v4, Lax/L3/c;->e:Ljava/util/List;

    .line 77
    .line 78
    iget v5, p0, Lax/L3/e;->m:I

    .line 79
    .line 80
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lax/L3/b;

    .line 85
    .line 86
    iget v5, p0, Lax/L3/e;->m:I

    .line 87
    .line 88
    sub-int/2addr v5, v2

    .line 89
    if-ltz v5, :cond_65

    .line 90
    .line 91
    iget-object v6, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 92
    .line 93
    iget-object v6, v6, Lax/L3/c;->e:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Lax/L3/b;

    .line 100
    .line 101
    goto :goto_66

    .line 102
    :cond_65
    move-object v5, v3

    .line 103
    :goto_66
    iget-object v6, v4, Lax/L3/b;->k:[I

    .line 104
    .line 105
    if-eqz v6, :cond_6b

    .line 106
    .line 107
    goto :goto_6f

    .line 108
    :cond_6b
    iget-object v6, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 109
    .line 110
    iget-object v6, v6, Lax/L3/c;->a:[I

    .line 111
    .line 112
    :goto_6f
    iput-object v6, p0, Lax/L3/e;->a:[I

    .line 113
    .line 114
    if-nez v6, :cond_95

    .line 115
    .line 116
    sget-object v0, Lax/L3/e;->w:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_91

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v4, "No valid color table found for frame #"

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget v4, p0, Lax/L3/e;->m:I

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    :cond_91
    iput v2, p0, Lax/L3/e;->r:I
    :try_end_93
    .catchall {:try_start_1 .. :try_end_93} :catchall_e

    .line 147
    .line 148
    monitor-exit p0

    .line 149
    return-object v3

    .line 150
    :cond_95
    :try_start_95
    iget-boolean v1, v4, Lax/L3/b;->f:Z

    .line 151
    .line 152
    if-eqz v1, :cond_a7

    .line 153
    .line 154
    iget-object v1, p0, Lax/L3/e;->b:[I

    .line 155
    .line 156
    array-length v2, v6

    .line 157
    invoke-static {v6, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Lax/L3/e;->b:[I

    .line 161
    .line 162
    iput-object v1, p0, Lax/L3/e;->a:[I

    .line 163
    .line 164
    iget v2, v4, Lax/L3/b;->h:I

    .line 165
    .line 166
    aput v0, v1, v2

    .line 167
    .line 168
    :cond_a7
    invoke-direct {p0, v4, v5}, Lax/L3/e;->r(Lax/L3/b;Lax/L3/b;)Landroid/graphics/Bitmap;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_ab
    .catchall {:try_start_95 .. :try_end_ab} :catchall_e

    .line 172
    monitor-exit p0

    .line 173
    return-object v0

    .line 174
    :cond_ad
    :goto_ad
    :try_start_ad
    sget-object v0, Lax/L3/e;->w:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_cb

    .line 181
    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v2, "Unable to decode frame, status="

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    iget v2, p0, Lax/L3/e;->r:I

    .line 193
    .line 194
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_cb
    .catchall {:try_start_ad .. :try_end_cb} :catchall_e

    .line 202
    .line 203
    .line 204
    :cond_cb
    monitor-exit p0

    .line 205
    return-object v3

    .line 206
    :goto_cd
    :try_start_cd
    monitor-exit p0
    :try_end_ce
    .catchall {:try_start_cd .. :try_end_ce} :catchall_e

    .line 207
    throw v0
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

.method public clear()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 3
    .line 4
    iget-object v1, p0, Lax/L3/e;->k:[B

    .line 5
    .line 6
    if-eqz v1, :cond_c

    .line 7
    .line 8
    iget-object v2, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 9
    .line 10
    invoke-interface {v2, v1}, Lax/L3/a$a;->d([B)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object v1, p0, Lax/L3/e;->l:[I

    .line 14
    .line 15
    if-eqz v1, :cond_15

    .line 16
    .line 17
    iget-object v2, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Lax/L3/a$a;->f([I)V

    .line 20
    .line 21
    .line 22
    :cond_15
    iget-object v1, p0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-eqz v1, :cond_1e

    .line 25
    .line 26
    iget-object v2, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 27
    .line 28
    invoke-interface {v2, v1}, Lax/L3/a$a;->c(Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iput-object v0, p0, Lax/L3/e;->p:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    iput-object v0, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lax/L3/e;->v:Z

    .line 37
    .line 38
    iget-object v0, p0, Lax/L3/e;->d:[B

    .line 39
    .line 40
    if-eqz v0, :cond_2e

    .line 41
    .line 42
    iget-object v1, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Lax/L3/a$a;->d([B)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object v0, p0, Lax/L3/e;->e:[B

    .line 48
    .line 49
    if-eqz v0, :cond_37

    .line 50
    .line 51
    iget-object v1, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 52
    .line 53
    invoke-interface {v1, v0}, Lax/L3/a$a;->d([B)V

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
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

.method public d()V
    .registers 3

    .line 1
    iget v0, p0, Lax/L3/e;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 6
    .line 7
    iget v1, v1, Lax/L3/c;->c:I

    .line 8
    .line 9
    rem-int/2addr v0, v1

    .line 10
    iput v0, p0, Lax/L3/e;->m:I

    .line 11
    .line 12
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
.end method

.method public e()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 2
    .line 3
    iget v0, v0, Lax/L3/c;->c:I

    .line 4
    .line 5
    return v0
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

.method public f()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 2
    .line 3
    iget v0, v0, Lax/L3/c;->c:I

    .line 4
    .line 5
    if-lez v0, :cond_10

    .line 6
    .line 7
    iget v0, p0, Lax/L3/e;->m:I

    .line 8
    .line 9
    if-gez v0, :cond_b

    .line 10
    .line 11
    goto :goto_10

    .line 12
    :cond_b
    invoke-virtual {p0, v0}, Lax/L3/e;->l(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_10
    :goto_10
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public g()V
    .registers 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/L3/e;->m:I

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

.method public h()I
    .registers 2

    .line 1
    iget v0, p0, Lax/L3/e;->m:I

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

.method public i()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/L3/e;->k:[B

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    add-int/2addr v0, v1

    .line 11
    iget-object v1, p0, Lax/L3/e;->l:[I

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    mul-int/lit8 v1, v1, 0x4

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 2
    .line 3
    iget v0, v0, Lax/L3/c;->m:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    return v2

    .line 10
    :cond_9
    if-nez v0, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    add-int/2addr v0, v2

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public l(I)I
    .registers 4

    .line 1
    if-ltz p1, :cond_13

    .line 2
    .line 3
    iget-object v0, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 4
    .line 5
    iget v1, v0, Lax/L3/c;->c:I

    .line 6
    .line 7
    if-ge p1, v1, :cond_13

    .line 8
    .line 9
    iget-object v0, v0, Lax/L3/c;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/L3/b;

    .line 16
    .line 17
    iget p1, p1, Lax/L3/b;->i:I

    .line 18
    .line 19
    return p1

    .line 20
    :cond_13
    const/4 p1, -0x1

    .line 21
    return p1
    .line 22
.end method

.method public declared-synchronized q(Lax/L3/c;Ljava/nio/ByteBuffer;I)V
    .registers 6

    .line 1
    monitor-enter p0

    .line 2
    if-lez p3, :cond_68

    .line 3
    .line 4
    :try_start_3
    invoke-static {p3}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lax/L3/e;->r:I

    .line 10
    .line 11
    iput-object p1, p0, Lax/L3/e;->n:Lax/L3/c;

    .line 12
    .line 13
    iput-boolean v0, p0, Lax/L3/e;->v:Z

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lax/L3/e;->m:I

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iput-object p2, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lax/L3/e;->c:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    iput-boolean v0, p0, Lax/L3/e;->q:Z

    .line 35
    .line 36
    iget-object p2, p1, Lax/L3/c;->e:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :cond_29
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_40

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lax/L3/b;

    .line 53
    .line 54
    iget v0, v0, Lax/L3/b;->g:I

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    if-ne v0, v1, :cond_29

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    iput-boolean p2, p0, Lax/L3/e;->q:Z

    .line 61
    .line 62
    goto :goto_40

    .line 63
    :catchall_3e
    move-exception p1

    .line 64
    goto :goto_7f

    .line 65
    :cond_40
    :goto_40
    iput p3, p0, Lax/L3/e;->s:I

    .line 66
    .line 67
    iget p2, p1, Lax/L3/c;->f:I

    .line 68
    .line 69
    div-int v0, p2, p3

    .line 70
    .line 71
    iput v0, p0, Lax/L3/e;->u:I

    .line 72
    .line 73
    iget p1, p1, Lax/L3/c;->g:I

    .line 74
    .line 75
    div-int p3, p1, p3

    .line 76
    .line 77
    iput p3, p0, Lax/L3/e;->t:I

    .line 78
    .line 79
    iget-object p3, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 80
    .line 81
    mul-int p2, p2, p1

    .line 82
    .line 83
    invoke-interface {p3, p2}, Lax/L3/a$a;->e(I)[B

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lax/L3/e;->k:[B

    .line 88
    .line 89
    iget-object p1, p0, Lax/L3/e;->o:Lax/L3/a$a;

    .line 90
    .line 91
    iget p2, p0, Lax/L3/e;->u:I

    .line 92
    .line 93
    iget p3, p0, Lax/L3/e;->t:I

    .line 94
    .line 95
    mul-int p2, p2, p3

    .line 96
    .line 97
    invoke-interface {p1, p2}, Lax/L3/a$a;->b(I)[I

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lax/L3/e;->l:[I
    :try_end_66
    .catchall {:try_start_3 .. :try_end_66} :catchall_3e

    .line 102
    .line 103
    monitor-exit p0

    .line 104
    return-void

    .line 105
    :cond_68
    :try_start_68
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    new-instance p2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v0, "Sample size must be >=0, not: "

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :goto_7f
    monitor-exit p0
    :try_end_80
    .catchall {:try_start_68 .. :try_end_80} :catchall_3e

    .line 129
    throw p1
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
