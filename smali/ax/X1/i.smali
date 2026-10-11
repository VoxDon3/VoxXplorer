.class public final Lax/X1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/m;


# static fields
.field private static final x:[B


# instance fields
.field private final a:Z

.field private final b:Lax/S0/F;

.field private final c:Lax/S0/G;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lax/q1/U;

.field private i:Lax/q1/U;

.field private j:I

.field private k:I

.field private l:I

.field private m:Z

.field private n:Z

.field private o:I

.field private p:I

.field private q:I

.field private r:Z

.field private s:J

.field private t:I

.field private u:J

.field private v:Lax/q1/U;

.field private w:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_a

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/X1/i;->x:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_a
    .array-data 1
        0x49t
        0x44t
        0x33t
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

.method public constructor <init>(ZLjava/lang/String;)V
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1, p2}, Lax/X1/i;-><init>(ZLjava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;ILjava/lang/String;)V
    .registers 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lax/S0/F;

    const/4 v1, 0x7

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lax/S0/F;-><init>([B)V

    iput-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 4
    new-instance v0, Lax/S0/G;

    sget-object v1, Lax/X1/i;->x:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lax/S0/G;-><init>([B)V

    iput-object v0, p0, Lax/X1/i;->c:Lax/S0/G;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lax/X1/i;->o:I

    .line 6
    iput v0, p0, Lax/X1/i;->p:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide v0, p0, Lax/X1/i;->s:J

    .line 8
    iput-wide v0, p0, Lax/X1/i;->u:J

    .line 9
    iput-boolean p1, p0, Lax/X1/i;->a:Z

    .line 10
    iput-object p2, p0, Lax/X1/i;->d:Ljava/lang/String;

    .line 11
    iput p3, p0, Lax/X1/i;->e:I

    .line 12
    iput-object p4, p0, Lax/X1/i;->f:Ljava/lang/String;

    .line 13
    invoke-direct {p0}, Lax/X1/i;->s()V

    return-void
.end method

.method private a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X1/i;->h:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X1/i;->v:Lax/q1/U;

    .line 7
    .line 8
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/X1/i;->i:Lax/q1/U;

    .line 12
    .line 13
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private g(Lax/S0/G;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 9
    .line 10
    iget-object v0, v0, Lax/S0/F;->a:[B

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget-byte p1, v1, p1

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-byte p1, v0, v1

    .line 24
    .line 25
    iget-object p1, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-virtual {p1, v0}, Lax/S0/F;->p(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {p1, v0}, Lax/S0/F;->h(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget v0, p0, Lax/X1/i;->p:I

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    if-eq v0, v1, :cond_30

    .line 42
    .line 43
    if-eq p1, v0, :cond_30

    .line 44
    .line 45
    invoke-direct {p0}, Lax/X1/i;->q()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    iget-boolean v0, p0, Lax/X1/i;->n:Z

    .line 50
    .line 51
    if-nez v0, :cond_3d

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Lax/X1/i;->n:Z

    .line 55
    .line 56
    iget v0, p0, Lax/X1/i;->q:I

    .line 57
    .line 58
    iput v0, p0, Lax/X1/i;->o:I

    .line 59
    .line 60
    iput p1, p0, Lax/X1/i;->p:I

    .line 61
    .line 62
    :cond_3d
    invoke-direct {p0}, Lax/X1/i;->t()V

    .line 63
    .line 64
    .line 65
    return-void
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

.method private h(Lax/S0/G;I)Z
    .registers 11

    .line 1
    add-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 7
    .line 8
    iget-object v0, v0, Lax/S0/F;->a:[B

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p0, p1, v0, v1}, Lax/X1/i;->w(Lax/S0/G;[BI)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    return v2

    .line 19
    :cond_12
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    invoke-virtual {v0, v3}, Lax/S0/F;->p(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v4, p0, Lax/X1/i;->o:I

    .line 32
    .line 33
    const/4 v5, -0x1

    .line 34
    if-eq v4, v5, :cond_26

    .line 35
    .line 36
    if-eq v0, v4, :cond_26

    .line 37
    .line 38
    return v2

    .line 39
    :cond_26
    iget v4, p0, Lax/X1/i;->p:I

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    if-eq v4, v5, :cond_4b

    .line 43
    .line 44
    iget-object v4, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 45
    .line 46
    iget-object v4, v4, Lax/S0/F;->a:[B

    .line 47
    .line 48
    invoke-direct {p0, p1, v4, v1}, Lax/X1/i;->w(Lax/S0/G;[BI)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_36

    .line 53
    .line 54
    return v1

    .line 55
    :cond_36
    iget-object v4, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 56
    .line 57
    invoke-virtual {v4, v6}, Lax/S0/F;->p(I)V

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Lax/S0/F;->h(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget v7, p0, Lax/X1/i;->p:I

    .line 67
    .line 68
    if-eq v4, v7, :cond_46

    .line 69
    .line 70
    return v2

    .line 71
    :cond_46
    add-int/lit8 v4, p2, 0x2

    .line 72
    .line 73
    invoke-virtual {p1, v4}, Lax/S0/G;->b0(I)V

    .line 74
    .line 75
    .line 76
    :cond_4b
    iget-object v4, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 77
    .line 78
    iget-object v4, v4, Lax/S0/F;->a:[B

    .line 79
    .line 80
    invoke-direct {p0, p1, v4, v3}, Lax/X1/i;->w(Lax/S0/G;[BI)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_56

    .line 85
    .line 86
    return v1

    .line 87
    :cond_56
    iget-object v3, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 88
    .line 89
    const/16 v4, 0xe

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Lax/S0/F;->p(I)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 95
    .line 96
    const/16 v4, 0xd

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Lax/S0/F;->h(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/4 v4, 0x7

    .line 103
    if-ge v3, v4, :cond_69

    .line 104
    .line 105
    return v2

    .line 106
    :cond_69
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {p1}, Lax/S0/G;->j()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    add-int/2addr p2, v3

    .line 115
    if-lt p2, p1, :cond_75

    .line 116
    .line 117
    return v1

    .line 118
    :cond_75
    aget-byte v3, v4, p2

    .line 119
    .line 120
    if-ne v3, v5, :cond_8f

    .line 121
    .line 122
    add-int/2addr p2, v1

    .line 123
    if-ne p2, p1, :cond_7d

    .line 124
    .line 125
    return v1

    .line 126
    :cond_7d
    aget-byte p1, v4, p2

    .line 127
    .line 128
    invoke-direct {p0, v5, p1}, Lax/X1/i;->l(BB)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_8e

    .line 133
    .line 134
    aget-byte p1, v4, p2

    .line 135
    .line 136
    and-int/lit8 p1, p1, 0x8

    .line 137
    .line 138
    shr-int/lit8 p1, p1, 0x3

    .line 139
    .line 140
    if-ne p1, v0, :cond_8e

    .line 141
    .line 142
    return v1

    .line 143
    :cond_8e
    return v2

    .line 144
    :cond_8f
    const/16 v0, 0x49

    .line 145
    .line 146
    if-eq v3, v0, :cond_94

    .line 147
    .line 148
    return v2

    .line 149
    :cond_94
    add-int/lit8 v0, p2, 0x1

    .line 150
    .line 151
    if-ne v0, p1, :cond_99

    .line 152
    .line 153
    return v1

    .line 154
    :cond_99
    aget-byte v0, v4, v0

    .line 155
    .line 156
    const/16 v3, 0x44

    .line 157
    .line 158
    if-eq v0, v3, :cond_a0

    .line 159
    .line 160
    return v2

    .line 161
    :cond_a0
    add-int/2addr p2, v6

    .line 162
    if-ne p2, p1, :cond_a4

    .line 163
    .line 164
    return v1

    .line 165
    :cond_a4
    aget-byte p1, v4, p2

    .line 166
    .line 167
    const/16 p2, 0x33

    .line 168
    .line 169
    if-ne p1, p2, :cond_ab

    .line 170
    .line 171
    return v1

    .line 172
    :cond_ab
    return v2
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

.method private i(Lax/S0/G;[BI)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/X1/i;->k:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lax/X1/i;->k:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lax/S0/G;->q([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lax/X1/i;->k:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lax/X1/i;->k:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_1a

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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

.method private j(Lax/S0/G;)V
    .registers 11

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lax/S0/G;->j()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_c
    if-ge v1, v2, :cond_7b

    .line 14
    .line 15
    add-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    aget-byte v4, v0, v1

    .line 18
    .line 19
    and-int/lit16 v5, v4, 0xff

    .line 20
    .line 21
    iget v6, p0, Lax/X1/i;->l:I

    .line 22
    .line 23
    const/16 v7, 0x200

    .line 24
    .line 25
    if-ne v6, v7, :cond_4c

    .line 26
    .line 27
    int-to-byte v6, v5

    .line 28
    const/4 v8, -0x1

    .line 29
    invoke-direct {p0, v8, v6}, Lax/X1/i;->l(BB)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_4c

    .line 34
    .line 35
    iget-boolean v6, p0, Lax/X1/i;->n:Z

    .line 36
    .line 37
    if-nez v6, :cond_2e

    .line 38
    .line 39
    add-int/lit8 v6, v1, -0x1

    .line 40
    .line 41
    invoke-direct {p0, p1, v6}, Lax/X1/i;->h(Lax/S0/G;I)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_4c

    .line 46
    .line 47
    :cond_2e
    and-int/lit8 v0, v4, 0x8

    .line 48
    .line 49
    shr-int/lit8 v0, v0, 0x3

    .line 50
    .line 51
    iput v0, p0, Lax/X1/i;->q:I

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    and-int/lit8 v1, v4, 0x1

    .line 55
    .line 56
    if-nez v1, :cond_3a

    .line 57
    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    const/4 v0, 0x0

    .line 60
    :goto_3b
    iput-boolean v0, p0, Lax/X1/i;->m:Z

    .line 61
    .line 62
    iget-boolean v0, p0, Lax/X1/i;->n:Z

    .line 63
    .line 64
    if-nez v0, :cond_45

    .line 65
    .line 66
    invoke-direct {p0}, Lax/X1/i;->r()V

    .line 67
    .line 68
    .line 69
    goto :goto_48

    .line 70
    :cond_45
    invoke-direct {p0}, Lax/X1/i;->t()V

    .line 71
    .line 72
    .line 73
    :goto_48
    invoke-virtual {p1, v3}, Lax/S0/G;->b0(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    iget v4, p0, Lax/X1/i;->l:I

    .line 78
    .line 79
    or-int/2addr v5, v4

    .line 80
    const/16 v6, 0x149

    .line 81
    .line 82
    if-eq v5, v6, :cond_75

    .line 83
    .line 84
    const/16 v6, 0x1ff

    .line 85
    .line 86
    if-eq v5, v6, :cond_72

    .line 87
    .line 88
    const/16 v6, 0x344

    .line 89
    .line 90
    if-eq v5, v6, :cond_6d

    .line 91
    .line 92
    const/16 v6, 0x433

    .line 93
    .line 94
    if-eq v5, v6, :cond_66

    .line 95
    .line 96
    const/16 v5, 0x100

    .line 97
    .line 98
    if-eq v4, v5, :cond_79

    .line 99
    .line 100
    iput v5, p0, Lax/X1/i;->l:I

    .line 101
    .line 102
    goto :goto_c

    .line 103
    :cond_66
    invoke-direct {p0}, Lax/X1/i;->u()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Lax/S0/G;->b0(I)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_6d
    const/16 v1, 0x400

    .line 111
    .line 112
    iput v1, p0, Lax/X1/i;->l:I

    .line 113
    .line 114
    goto :goto_79

    .line 115
    :cond_72
    iput v7, p0, Lax/X1/i;->l:I

    .line 116
    .line 117
    goto :goto_79

    .line 118
    :cond_75
    const/16 v1, 0x300

    .line 119
    .line 120
    iput v1, p0, Lax/X1/i;->l:I

    .line 121
    .line 122
    :cond_79
    :goto_79
    move v1, v3

    .line 123
    goto :goto_c

    .line 124
    :cond_7b
    invoke-virtual {p1, v1}, Lax/S0/G;->b0(I)V

    .line 125
    .line 126
    .line 127
    return-void
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

.method private l(BB)Z
    .registers 3

    .line 1
    and-int/lit16 p1, p1, 0xff

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x8

    .line 4
    .line 5
    and-int/lit16 p2, p2, 0xff

    .line 6
    .line 7
    or-int/2addr p1, p2

    .line 8
    invoke-static {p1}, Lax/X1/i;->m(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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

.method public static m(I)Z
    .registers 2

    .line 1
    const v0, 0xfff6

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    const v0, 0xfff0

    .line 6
    .line 7
    .line 8
    if-ne p0, v0, :cond_b

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0
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

.method private n()V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lax/S0/F;->p(I)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lax/X1/i;->r:Z

    .line 8
    .line 9
    if-nez v0, :cond_9b

    .line 10
    .line 11
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    add-int/2addr v0, v2

    .line 20
    if-eq v0, v1, :cond_31

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v4, "Detected audio object type: "

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", but assuming AAC LC."

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v3, "AdtsReader"

    .line 45
    .line 46
    invoke-static {v3, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_32

    .line 50
    :cond_31
    move v1, v0

    .line 51
    :goto_32
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 52
    .line 53
    const/4 v3, 0x5

    .line 54
    invoke-virtual {v0, v3}, Lax/S0/F;->r(I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-virtual {v0, v3}, Lax/S0/F;->h(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v3, p0, Lax/X1/i;->p:I

    .line 65
    .line 66
    invoke-static {v1, v3, v0}, Lax/q1/a;->a(III)[B

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lax/q1/a;->e([B)Lax/q1/a$b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v3, Lax/P0/v$b;

    .line 75
    .line 76
    invoke-direct {v3}, Lax/P0/v$b;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, Lax/X1/i;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v4, p0, Lax/X1/i;->f:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const-string v4, "audio/mp4a-latm"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget-object v4, v1, Lax/q1/a$b;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iget v4, v1, Lax/q1/a$b;->b:I

    .line 104
    .line 105
    invoke-virtual {v3, v4}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget v1, v1, Lax/q1/a$b;->a:I

    .line 110
    .line 111
    invoke-virtual {v3, v1}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v1, v0}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v1, p0, Lax/X1/i;->d:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget v1, p0, Lax/X1/i;->e:I

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget v1, v0, Lax/P0/v;->H:I

    .line 140
    .line 141
    int-to-long v3, v1

    .line 142
    const-wide/32 v5, 0x3d090000

    .line 143
    .line 144
    .line 145
    div-long/2addr v5, v3

    .line 146
    iput-wide v5, p0, Lax/X1/i;->s:J

    .line 147
    .line 148
    iget-object v1, p0, Lax/X1/i;->h:Lax/q1/U;

    .line 149
    .line 150
    invoke-interface {v1, v0}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 151
    .line 152
    .line 153
    iput-boolean v2, p0, Lax/X1/i;->r:Z

    .line 154
    .line 155
    goto :goto_a2

    .line 156
    :cond_9b
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 157
    .line 158
    const/16 v1, 0xa

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lax/S0/F;->r(I)V

    .line 161
    .line 162
    .line 163
    :goto_a2
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 164
    .line 165
    const/4 v1, 0x4

    .line 166
    invoke-virtual {v0, v1}, Lax/S0/F;->r(I)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 170
    .line 171
    const/16 v1, 0xd

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    add-int/lit8 v1, v0, -0x7

    .line 178
    .line 179
    iget-boolean v2, p0, Lax/X1/i;->m:Z

    .line 180
    .line 181
    if-eqz v2, :cond_b8

    .line 182
    .line 183
    add-int/lit8 v1, v0, -0x9

    .line 184
    .line 185
    :cond_b8
    move v7, v1

    .line 186
    iget-object v3, p0, Lax/X1/i;->h:Lax/q1/U;

    .line 187
    .line 188
    iget-wide v4, p0, Lax/X1/i;->s:J

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    move-object v2, p0

    .line 192
    invoke-direct/range {v2 .. v7}, Lax/X1/i;->v(Lax/q1/U;JII)V

    .line 193
    .line 194
    .line 195
    return-void
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

.method private o()V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X1/i;->i:Lax/q1/U;

    .line 2
    .line 3
    iget-object v1, p0, Lax/X1/i;->c:Lax/S0/G;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/X1/i;->c:Lax/S0/G;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lax/S0/G;->b0(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Lax/X1/i;->i:Lax/q1/U;

    .line 17
    .line 18
    iget-object v0, p0, Lax/X1/i;->c:Lax/S0/G;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/S0/G;->L()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/lit8 v8, v0, 0xa

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    const/16 v7, 0xa

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-direct/range {v3 .. v8}, Lax/X1/i;->v(Lax/q1/U;JII)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method private p(Lax/S0/G;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/X1/i;->t:I

    .line 6
    .line 7
    iget v2, p0, Lax/X1/i;->k:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lax/X1/i;->v:Lax/q1/U;

    .line 15
    .line 16
    invoke-interface {v1, p1, v0}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lax/X1/i;->k:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lax/X1/i;->k:I

    .line 23
    .line 24
    iget v0, p0, Lax/X1/i;->t:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_42

    .line 27
    .line 28
    iget-wide v0, p0, Lax/X1/i;->u:J

    .line 29
    .line 30
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long p1, v0, v2

    .line 36
    .line 37
    if-eqz p1, :cond_28

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_29

    .line 41
    :cond_28
    const/4 p1, 0x0

    .line 42
    :goto_29
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/X1/i;->v:Lax/q1/U;

    .line 46
    .line 47
    iget-wide v1, p0, Lax/X1/i;->u:J

    .line 48
    .line 49
    iget v4, p0, Lax/X1/i;->t:I

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-interface/range {v0 .. v6}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 55
    .line 56
    .line 57
    iget-wide v0, p0, Lax/X1/i;->u:J

    .line 58
    .line 59
    iget-wide v2, p0, Lax/X1/i;->w:J

    .line 60
    .line 61
    add-long/2addr v0, v2

    .line 62
    iput-wide v0, p0, Lax/X1/i;->u:J

    .line 63
    .line 64
    invoke-direct {p0}, Lax/X1/i;->s()V

    .line 65
    .line 66
    .line 67
    :cond_42
    return-void
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

.method private q()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/X1/i;->n:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/X1/i;->s()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method private r()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lax/X1/i;->j:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/X1/i;->k:I

    .line 6
    .line 7
    return-void
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

.method private s()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/X1/i;->j:I

    .line 3
    .line 4
    iput v0, p0, Lax/X1/i;->k:I

    .line 5
    .line 6
    const/16 v0, 0x100

    .line 7
    .line 8
    iput v0, p0, Lax/X1/i;->l:I

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
.end method

.method private t()V
    .registers 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lax/X1/i;->j:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/X1/i;->k:I

    .line 6
    .line 7
    return-void
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

.method private u()V
    .registers 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lax/X1/i;->j:I

    .line 3
    .line 4
    sget-object v0, Lax/X1/i;->x:[B

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iput v0, p0, Lax/X1/i;->k:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lax/X1/i;->t:I

    .line 11
    .line 12
    iget-object v1, p0, Lax/X1/i;->c:Lax/S0/G;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lax/S0/G;->b0(I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private v(Lax/q1/U;JII)V
    .registers 7

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lax/X1/i;->j:I

    .line 3
    .line 4
    iput p4, p0, Lax/X1/i;->k:I

    .line 5
    .line 6
    iput-object p1, p0, Lax/X1/i;->v:Lax/q1/U;

    .line 7
    .line 8
    iput-wide p2, p0, Lax/X1/i;->w:J

    .line 9
    .line 10
    iput p5, p0, Lax/X1/i;->t:I

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
.end method

.method private w(Lax/S0/G;[BI)Z
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ge v0, p3, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p1, p2, v1, p3}, Lax/S0/G;->q([BII)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1
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
.method public b()V
    .registers 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lax/X1/i;->u:J

    .line 7
    .line 8
    invoke-direct {p0}, Lax/X1/i;->q()V

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
.end method

.method public c(Lax/S0/G;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/X1/i;->a()V

    .line 2
    .line 3
    .line 4
    :cond_3
    :goto_3
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_52

    .line 9
    .line 10
    iget v0, p0, Lax/X1/i;->j:I

    .line 11
    .line 12
    if-eqz v0, :cond_4e

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_4a

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_38

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_23

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-ne v0, v1, :cond_1d

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lax/X1/i;->p(Lax/S0/G;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_23
    iget-boolean v0, p0, Lax/X1/i;->m:Z

    .line 37
    .line 38
    if-eqz v0, :cond_29

    .line 39
    .line 40
    const/4 v0, 0x7

    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 v0, 0x5

    .line 43
    :goto_2a
    iget-object v1, p0, Lax/X1/i;->b:Lax/S0/F;

    .line 44
    .line 45
    iget-object v1, v1, Lax/S0/F;->a:[B

    .line 46
    .line 47
    invoke-direct {p0, p1, v1, v0}, Lax/X1/i;->i(Lax/S0/G;[BI)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-direct {p0}, Lax/X1/i;->n()V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_38
    iget-object v0, p0, Lax/X1/i;->c:Lax/S0/G;

    .line 58
    .line 59
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-direct {p0, p1, v0, v1}, Lax/X1/i;->i(Lax/S0/G;[BI)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-direct {p0}, Lax/X1/i;->o()V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4a
    invoke-direct {p0, p1}, Lax/X1/i;->g(Lax/S0/G;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4e
    invoke-direct {p0, p1}, Lax/X1/i;->j(Lax/S0/G;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_52
    return-void
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

.method public d(Lax/q1/t;Lax/X1/L$d;)V
    .registers 5

    .line 1
    invoke-virtual {p2}, Lax/X1/L$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lax/X1/L$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/X1/i;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lax/X1/L$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-interface {p1, v0, v1}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lax/X1/i;->h:Lax/q1/U;

    .line 20
    .line 21
    iput-object v0, p0, Lax/X1/i;->v:Lax/q1/U;

    .line 22
    .line 23
    iget-boolean v0, p0, Lax/X1/i;->a:Z

    .line 24
    .line 25
    if-eqz v0, :cond_49

    .line 26
    .line 27
    invoke-virtual {p2}, Lax/X1/L$d;->a()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lax/X1/L$d;->c()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x5

    .line 35
    invoke-interface {p1, v0, v1}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lax/X1/i;->i:Lax/q1/U;

    .line 40
    .line 41
    new-instance v0, Lax/P0/v$b;

    .line 42
    .line 43
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lax/X1/L$d;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {v0, p2}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object v0, p0, Lax/X1/i;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const-string v0, "application/id3"

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p1, p2}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    new-instance p1, Lax/q1/o;

    .line 75
    .line 76
    invoke-direct {p1}, Lax/q1/o;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lax/X1/i;->i:Lax/q1/U;

    .line 80
    .line 81
    return-void
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

.method public e(Z)V
    .registers 2

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
    .line 22
.end method

.method public f(JI)V
    .registers 4

    .line 1
    iput-wide p1, p0, Lax/X1/i;->u:J

    .line 2
    .line 3
    return-void
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

.method public k()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/X1/i;->s:J

    .line 2
    .line 3
    return-wide v0
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
