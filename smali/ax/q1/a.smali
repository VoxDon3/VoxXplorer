.class public final Lax/q1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/q1/a$b;
    }
.end annotation


# static fields
.field private static final a:[I

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_14

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/q1/a;->a:[I

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_32

    .line 15
    .line 16
    .line 17
    sput-object v0, Lax/q1/a;->b:[I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_14
    .array-data 4
        0x17700
        0x15888
        0xfa00
        0xbb80
        0xac44
        0x7d00
        0x5dc0
        0x5622
        0x3e80
        0x2ee0
        0x2b11
        0x1f40
        0x1cb6
    .end array-data

    :array_32
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        0x7
        0x8
        -0x1
        0x8
        -0x1
    .end array-data
.end method

.method public static a(III)[B
    .registers 5

    .line 1
    shl-int/lit8 p0, p0, 0x3

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xf8

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    shr-int/lit8 v1, p1, 0x1

    .line 7
    .line 8
    and-int/lit8 v1, v1, 0x7

    .line 9
    .line 10
    or-int/2addr p0, v1

    .line 11
    int-to-byte p0, p0

    .line 12
    shl-int/lit8 p1, p1, 0x7

    .line 13
    .line 14
    and-int/lit16 p1, p1, 0x80

    .line 15
    .line 16
    shl-int/lit8 p2, p2, 0x3

    .line 17
    .line 18
    and-int/lit8 p2, p2, 0x78

    .line 19
    .line 20
    or-int/2addr p1, p2

    .line 21
    int-to-byte p1, p1

    .line 22
    const/4 p2, 0x2

    .line 23
    new-array p2, p2, [B

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    aput-byte p0, p2, v1

    .line 27
    .line 28
    aput-byte p1, p2, v0

    .line 29
    .line 30
    return-object p2
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

.method private static b(Lax/S0/F;)I
    .registers 3

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-ne v0, v1, :cond_11

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/lit8 p0, p0, 0x20

    .line 16
    .line 17
    return p0

    .line 18
    :cond_11
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static c(Lax/S0/F;)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_1e

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/S0/F;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    if-lt v0, v1, :cond_17

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_17
    const-string p0, "AAC header insufficient data"

    .line 25
    .line 26
    invoke-static {p0, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0

    .line 31
    :cond_1e
    const/16 p0, 0xd

    .line 32
    .line 33
    if-ge v0, p0, :cond_27

    .line 34
    .line 35
    sget-object p0, Lax/q1/a;->a:[I

    .line 36
    .line 37
    aget p0, p0, v0

    .line 38
    .line 39
    return p0

    .line 40
    :cond_27
    const-string p0, "AAC header wrong Sampling Frequency Index"

    .line 41
    .line 42
    invoke-static {p0, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    throw p0
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

.method public static d(Lax/S0/F;Z)Lax/q1/a$b;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lax/q1/a;->b(Lax/S0/F;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lax/q1/a;->c(Lax/S0/F;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v5, "mp4a.40."

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x5

    .line 32
    if-eq v0, v5, :cond_25

    .line 33
    .line 34
    const/16 v5, 0x1d

    .line 35
    .line 36
    if-ne v0, v5, :cond_35

    .line 37
    .line 38
    :cond_25
    invoke-static {p0}, Lax/q1/a;->c(Lax/S0/F;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p0}, Lax/q1/a;->b(Lax/S0/F;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/16 v5, 0x16

    .line 47
    .line 48
    if-ne v0, v5, :cond_35

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    :cond_35
    if-eqz p1, :cond_8b

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    const/4 v5, 0x3

    .line 58
    const/4 v6, 0x2

    .line 59
    if-eq v0, p1, :cond_65

    .line 60
    .line 61
    if-eq v0, v6, :cond_65

    .line 62
    .line 63
    if-eq v0, v5, :cond_65

    .line 64
    .line 65
    if-eq v0, v2, :cond_65

    .line 66
    .line 67
    const/4 p1, 0x6

    .line 68
    if-eq v0, p1, :cond_65

    .line 69
    .line 70
    const/4 p1, 0x7

    .line 71
    if-eq v0, p1, :cond_65

    .line 72
    .line 73
    const/16 p1, 0x11

    .line 74
    .line 75
    if-eq v0, p1, :cond_65

    .line 76
    .line 77
    packed-switch v0, :pswitch_data_9e

    .line 78
    .line 79
    .line 80
    new-instance p0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string p1, "Unsupported audio object type: "

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    throw p0

    .line 102
    :cond_65
    :pswitch_65
    invoke-static {p0, v0, v3}, Lax/q1/a;->f(Lax/S0/F;II)V

    .line 103
    .line 104
    .line 105
    packed-switch v0, :pswitch_data_ac

    .line 106
    .line 107
    .line 108
    :pswitch_6b
    goto :goto_8b

    .line 109
    :pswitch_6c
    invoke-virtual {p0, v6}, Lax/S0/F;->h(I)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eq p0, v6, :cond_75

    .line 114
    .line 115
    if-eq p0, v5, :cond_75

    .line 116
    .line 117
    goto :goto_8b

    .line 118
    :cond_75
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v0, "Unsupported epConfig: "

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    throw p0

    .line 140
    :cond_8b
    :goto_8b
    sget-object p0, Lax/q1/a;->b:[I

    .line 141
    .line 142
    aget p0, p0, v3

    .line 143
    .line 144
    const/4 p1, -0x1

    .line 145
    const/4 v0, 0x0

    .line 146
    if-eq p0, p1, :cond_99

    .line 147
    .line 148
    new-instance p1, Lax/q1/a$b;

    .line 149
    .line 150
    invoke-direct {p1, v1, p0, v4, v0}, Lax/q1/a$b;-><init>(IILjava/lang/String;Lax/q1/a$a;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_99
    invoke-static {v0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    throw p0

    .line 159
    :pswitch_data_9e
    .packed-switch 0x13
        :pswitch_65
        :pswitch_65
        :pswitch_65
        :pswitch_65
        :pswitch_65
    .end packed-switch

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
    :pswitch_data_ac
    .packed-switch 0x11
        :pswitch_6c
        :pswitch_6b
        :pswitch_6c
        :pswitch_6c
        :pswitch_6c
        :pswitch_6c
        :pswitch_6c
    .end packed-switch
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

.method public static e([B)Lax/q1/a$b;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/S0/F;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/S0/F;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-static {v0, p0}, Lax/q1/a;->d(Lax/S0/F;Z)Lax/q1/a$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method private static f(Lax/S0/F;II)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    const-string v0, "AacUtil"

    .line 8
    .line 9
    const-string v1, "Unexpected frameLengthFlag = 1"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_18

    .line 19
    .line 20
    const/16 v0, 0xe

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lax/S0/F;->r(I)V

    .line 23
    .line 24
    .line 25
    :cond_18
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz p2, :cond_4a

    .line 30
    .line 31
    const/4 p2, 0x6

    .line 32
    const/4 v1, 0x3

    .line 33
    const/16 v2, 0x14

    .line 34
    .line 35
    if-eq p1, p2, :cond_26

    .line 36
    .line 37
    if-ne p1, v2, :cond_29

    .line 38
    .line 39
    :cond_26
    invoke-virtual {p0, v1}, Lax/S0/F;->r(I)V

    .line 40
    .line 41
    .line 42
    :cond_29
    if-eqz v0, :cond_49

    .line 43
    .line 44
    const/16 p2, 0x16

    .line 45
    .line 46
    if-ne p1, p2, :cond_34

    .line 47
    .line 48
    const/16 p2, 0x10

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lax/S0/F;->r(I)V

    .line 51
    .line 52
    .line 53
    :cond_34
    const/16 p2, 0x11

    .line 54
    .line 55
    if-eq p1, p2, :cond_42

    .line 56
    .line 57
    const/16 p2, 0x13

    .line 58
    .line 59
    if-eq p1, p2, :cond_42

    .line 60
    .line 61
    if-eq p1, v2, :cond_42

    .line 62
    .line 63
    const/16 p2, 0x17

    .line 64
    .line 65
    if-ne p1, p2, :cond_45

    .line 66
    .line 67
    :cond_42
    invoke-virtual {p0, v1}, Lax/S0/F;->r(I)V

    .line 68
    .line 69
    .line 70
    :cond_45
    const/4 p1, 0x1

    .line 71
    invoke-virtual {p0, p1}, Lax/S0/F;->r(I)V

    .line 72
    .line 73
    .line 74
    :cond_49
    return-void

    .line 75
    :cond_4a
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 76
    .line 77
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p0
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
