.class final Lax/X0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final j:[I

.field private static final k:[I


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field private g:I

.field private h:I

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_12

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/X0/k;->j:[I

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_24

    .line 14
    .line 15
    .line 16
    sput-object v0, Lax/X0/k;->k:[I

    .line 17
    .line 18
    return-void

    .line 19
    :array_12
    .array-data 4
        0x3
        0x3
        0x3
        0x3
        0x2
        0x2
        0x3
    .end array-data

    .line 20
    .line 21
    :array_24
    .array-data 4
        0x1
        0x2
        0x3
        0x2
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/X0/k;->h()V

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

.method private static a(I)I
    .registers 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-lt p0, v0, :cond_1d

    .line 4
    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-le p0, v0, :cond_9

    .line 8
    .line 9
    goto :goto_1d

    .line 10
    :cond_9
    const/16 v0, 0xf0

    .line 11
    .line 12
    if-lt p0, v0, :cond_14

    .line 13
    .line 14
    sget-object v0, Lax/X0/k;->k:[I

    .line 15
    .line 16
    and-int/lit8 p0, p0, 0xf

    .line 17
    .line 18
    aget p0, v0, p0

    .line 19
    .line 20
    return p0

    .line 21
    :cond_14
    sget-object v0, Lax/X0/k;->j:[I

    .line 22
    .line 23
    shr-int/lit8 p0, p0, 0x4

    .line 24
    .line 25
    and-int/lit8 p0, p0, 0x7

    .line 26
    .line 27
    aget p0, v0, p0

    .line 28
    .line 29
    return p0

    .line 30
    :cond_1d
    :goto_1d
    const/4 p0, 0x0

    .line 31
    return p0
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
.end method

.method private static g(Lax/S0/G;)I
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :cond_2
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    shl-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    and-int/lit8 v3, v2, 0x7f

    .line 10
    .line 11
    or-int/2addr v0, v3

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    and-int/lit16 v2, v2, 0x80

    .line 15
    .line 16
    if-eqz v2, :cond_14

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-le v1, v2, :cond_2

    .line 20
    .line 21
    :cond_14
    return v0
    .line 22
.end method


# virtual methods
.method public b()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/X0/k;->d:I

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public c()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/X0/k;->d:I

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-eq v0, v1, :cond_c

    .line 6
    .line 7
    const/16 v1, 0xf0

    .line 8
    .line 9
    if-eq v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/X0/k;->d:I

    .line 2
    .line 3
    ushr-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X0/k;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_14

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    if-eq v0, v1, :cond_12

    .line 14
    .line 15
    const/16 v1, 0x9

    .line 16
    .line 17
    if-ne v0, v1, :cond_14

    .line 18
    .line 19
    :cond_12
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_14
    const/4 v0, 0x0

    .line 22
    return v0
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
.end method

.method public e()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/X0/k;->i:Z

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

.method public f(Lax/S0/G;I)Z
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/X0/k;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_10

    .line 15
    .line 16
    return v3

    .line 17
    :cond_10
    invoke-static {p1}, Lax/X0/k;->g(Lax/S0/G;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-long v1, v1

    .line 22
    iput-wide v1, p0, Lax/X0/k;->f:J

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v1, v0

    .line 29
    iput v1, p0, Lax/X0/k;->a:I

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    iput v2, p0, Lax/X0/k;->c:I

    .line 37
    .line 38
    const/16 v4, 0xf0

    .line 39
    .line 40
    if-ne v1, v4, :cond_35

    .line 41
    .line 42
    iput v1, p0, Lax/X0/k;->d:I

    .line 43
    .line 44
    :cond_2b
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const/16 v1, 0xf7

    .line 49
    .line 50
    if-ne p2, v1, :cond_2b

    .line 51
    .line 52
    goto/16 :goto_c3

    .line 53
    .line 54
    :cond_35
    const/16 v4, 0xff

    .line 55
    .line 56
    if-ne v1, v4, :cond_82

    .line 57
    .line 58
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-static {p1}, Lax/X0/k;->g(Lax/S0/G;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iput v1, p0, Lax/X0/k;->d:I

    .line 67
    .line 68
    const/16 v1, 0x2f

    .line 69
    .line 70
    if-eq p2, v1, :cond_7b

    .line 71
    .line 72
    const/16 v1, 0x51

    .line 73
    .line 74
    if-eq p2, v1, :cond_50

    .line 75
    .line 76
    invoke-virtual {p1, v4}, Lax/S0/G;->c0(I)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_c3

    .line 80
    .line 81
    :cond_50
    invoke-virtual {p1}, Lax/S0/G;->P()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    int-to-long v5, p2

    .line 86
    iput-wide v5, p0, Lax/X0/k;->e:J

    .line 87
    .line 88
    const-wide/16 v7, 0x0

    .line 89
    .line 90
    cmp-long p2, v5, v7

    .line 91
    .line 92
    if-lez p2, :cond_63

    .line 93
    .line 94
    add-int/lit8 v4, v4, -0x3

    .line 95
    .line 96
    invoke-virtual {p1, v4}, Lax/S0/G;->c0(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_c3

    .line 100
    :cond_63
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string p2, "Tempo event data value must be a non-zero positive value. Parsed value: "

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-wide v0, p0, Lax/X0/k;->e:J

    .line 111
    .line 112
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    throw p1

    .line 124
    :cond_7b
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lax/X0/k;->h()V

    .line 128
    .line 129
    .line 130
    return v3

    .line 131
    :cond_82
    const/16 v4, 0x80

    .line 132
    .line 133
    if-ge v1, v4, :cond_87

    .line 134
    .line 135
    const/4 v3, 0x1

    .line 136
    :cond_87
    if-eqz v3, :cond_9c

    .line 137
    .line 138
    const/high16 v4, -0x80000000

    .line 139
    .line 140
    if-eq p2, v4, :cond_94

    .line 141
    .line 142
    iput v1, p0, Lax/X0/k;->g:I

    .line 143
    .line 144
    add-int v1, v2, v2

    .line 145
    .line 146
    iput v1, p0, Lax/X0/k;->c:I

    .line 147
    .line 148
    goto :goto_9d

    .line 149
    :cond_94
    const-string p1, "Running status in the first event."

    .line 150
    .line 151
    const/4 p2, 0x0

    .line 152
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    throw p1

    .line 157
    :cond_9c
    move p2, v1

    .line 158
    :goto_9d
    invoke-static {p2}, Lax/X0/k;->a(I)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v3, :cond_b2

    .line 163
    .line 164
    iget v3, p0, Lax/X0/k;->c:I

    .line 165
    .line 166
    if-le v1, v3, :cond_b2

    .line 167
    .line 168
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    iput v3, p0, Lax/X0/k;->g:I

    .line 173
    .line 174
    iget v3, p0, Lax/X0/k;->c:I

    .line 175
    .line 176
    add-int/2addr v3, v2

    .line 177
    iput v3, p0, Lax/X0/k;->c:I

    .line 178
    .line 179
    :cond_b2
    iget v3, p0, Lax/X0/k;->c:I

    .line 180
    .line 181
    if-le v1, v3, :cond_c1

    .line 182
    .line 183
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    iput v1, p0, Lax/X0/k;->h:I

    .line 188
    .line 189
    iget v1, p0, Lax/X0/k;->c:I

    .line 190
    .line 191
    add-int/2addr v1, v2

    .line 192
    iput v1, p0, Lax/X0/k;->c:I

    .line 193
    .line 194
    :cond_c1
    iput p2, p0, Lax/X0/k;->d:I

    .line 195
    .line 196
    :goto_c3
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    sub-int/2addr p2, v0

    .line 201
    iput p2, p0, Lax/X0/k;->b:I

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 204
    .line 205
    .line 206
    iput-boolean v2, p0, Lax/X0/k;->i:Z

    .line 207
    .line 208
    return v2
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

.method public h()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/X0/k;->i:Z

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lax/X0/k;->a:I

    .line 6
    .line 7
    const/high16 v1, -0x80000000

    .line 8
    .line 9
    iput v1, p0, Lax/X0/k;->d:I

    .line 10
    .line 11
    iput v1, p0, Lax/X0/k;->g:I

    .line 12
    .line 13
    iput v1, p0, Lax/X0/k;->h:I

    .line 14
    .line 15
    const-wide/16 v1, -0x1

    .line 16
    .line 17
    iput-wide v1, p0, Lax/X0/k;->f:J

    .line 18
    .line 19
    iput v0, p0, Lax/X0/k;->b:I

    .line 20
    .line 21
    iput v0, p0, Lax/X0/k;->c:I

    .line 22
    .line 23
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide v0, p0, Lax/X0/k;->e:J

    .line 29
    .line 30
    return-void
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

.method public i([B)V
    .registers 4

    .line 1
    iget v0, p0, Lax/X0/k;->d:I

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    aput-byte v0, p1, v1

    .line 6
    .line 7
    iget v0, p0, Lax/X0/k;->g:I

    .line 8
    .line 9
    int-to-byte v0, v0

    .line 10
    const/4 v1, 0x1

    .line 11
    aput-byte v0, p1, v1

    .line 12
    .line 13
    iget v0, p0, Lax/X0/k;->h:I

    .line 14
    .line 15
    int-to-byte v0, v0

    .line 16
    const/4 v1, 0x2

    .line 17
    aput-byte v0, p1, v1

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method
