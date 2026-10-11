.class public final Lax/X1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X1/n$a;
    }
.end annotation


# static fields
.field private static final r:[D


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lax/q1/U;

.field private final c:Lax/X1/O;

.field private final d:Ljava/lang/String;

.field private final e:Lax/S0/G;

.field private final f:Lax/X1/w;

.field private final g:[Z

.field private final h:Lax/X1/n$a;

.field private i:J

.field private j:Z

.field private k:Z

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/X1/n;->r:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
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

.method constructor <init>(Lax/X1/O;Ljava/lang/String;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/X1/n;->c:Lax/X1/O;

    .line 4
    iput-object p2, p0, Lax/X1/n;->d:Ljava/lang/String;

    const/4 p2, 0x4

    .line 5
    new-array p2, p2, [Z

    iput-object p2, p0, Lax/X1/n;->g:[Z

    .line 6
    new-instance p2, Lax/X1/n$a;

    const/16 v0, 0x80

    invoke-direct {p2, v0}, Lax/X1/n$a;-><init>(I)V

    iput-object p2, p0, Lax/X1/n;->h:Lax/X1/n$a;

    if-eqz p1, :cond_28

    .line 7
    new-instance p1, Lax/X1/w;

    const/16 p2, 0xb2

    invoke-direct {p1, p2, v0}, Lax/X1/w;-><init>(II)V

    iput-object p1, p0, Lax/X1/n;->f:Lax/X1/w;

    .line 8
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/X1/n;->e:Lax/S0/G;

    goto :goto_2d

    :cond_28
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lax/X1/n;->f:Lax/X1/w;

    .line 10
    iput-object p1, p0, Lax/X1/n;->e:Lax/S0/G;

    :goto_2d
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    iput-wide p1, p0, Lax/X1/n;->m:J

    .line 12
    iput-wide p1, p0, Lax/X1/n;->o:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lax/X1/n;-><init>(Lax/X1/O;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Lax/X1/n$a;Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/X1/n$a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lax/P0/v;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X1/n$a;->d:[B

    .line 2
    .line 3
    iget v1, p0, Lax/X1/n$a;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x4

    .line 10
    aget-byte v2, v0, v1

    .line 11
    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    aget-byte v4, v0, v3

    .line 16
    .line 17
    and-int/lit16 v5, v4, 0xff

    .line 18
    .line 19
    const/4 v6, 0x6

    .line 20
    aget-byte v6, v0, v6

    .line 21
    .line 22
    and-int/lit16 v6, v6, 0xff

    .line 23
    .line 24
    shl-int/2addr v2, v1

    .line 25
    shr-int/2addr v5, v1

    .line 26
    or-int/2addr v2, v5

    .line 27
    and-int/lit8 v4, v4, 0xf

    .line 28
    .line 29
    shl-int/lit8 v4, v4, 0x8

    .line 30
    .line 31
    or-int/2addr v4, v6

    .line 32
    const/4 v5, 0x7

    .line 33
    aget-byte v6, v0, v5

    .line 34
    .line 35
    and-int/lit16 v6, v6, 0xf0

    .line 36
    .line 37
    shr-int/2addr v6, v1

    .line 38
    const/4 v7, 0x2

    .line 39
    if-eq v6, v7, :cond_3e

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    if-eq v6, v7, :cond_38

    .line 43
    .line 44
    if-eq v6, v1, :cond_30

    .line 45
    .line 46
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    goto :goto_44

    .line 49
    :cond_30
    mul-int/lit8 v1, v4, 0x79

    .line 50
    .line 51
    int-to-float v1, v1

    .line 52
    mul-int/lit8 v6, v2, 0x64

    .line 53
    .line 54
    :goto_35
    int-to-float v6, v6

    .line 55
    div-float/2addr v1, v6

    .line 56
    goto :goto_44

    .line 57
    :cond_38
    mul-int/lit8 v1, v4, 0x10

    .line 58
    .line 59
    int-to-float v1, v1

    .line 60
    mul-int/lit8 v6, v2, 0x9

    .line 61
    .line 62
    goto :goto_35

    .line 63
    :cond_3e
    mul-int/lit8 v1, v4, 0x4

    .line 64
    .line 65
    int-to-float v1, v1

    .line 66
    mul-int/lit8 v6, v2, 0x3

    .line 67
    .line 68
    goto :goto_35

    .line 69
    :goto_44
    new-instance v6, Lax/P0/v$b;

    .line 70
    .line 71
    invoke-direct {v6}, Lax/P0/v$b;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, p1}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, p2}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string p2, "video/mpeg2"

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v2}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v4}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v1}, Lax/P0/v$b;->u0(F)Lax/P0/v$b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p1, p2}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    aget-byte p2, v0, v5

    .line 113
    .line 114
    and-int/lit8 p2, p2, 0xf

    .line 115
    .line 116
    add-int/lit8 p2, p2, -0x1

    .line 117
    .line 118
    if-ltz p2, :cond_9d

    .line 119
    .line 120
    sget-object v1, Lax/X1/n;->r:[D

    .line 121
    .line 122
    array-length v2, v1

    .line 123
    if-ge p2, v2, :cond_9d

    .line 124
    .line 125
    aget-wide v4, v1, p2

    .line 126
    .line 127
    iget p0, p0, Lax/X1/n$a;->c:I

    .line 128
    .line 129
    add-int/lit8 p0, p0, 0x9

    .line 130
    .line 131
    aget-byte p0, v0, p0

    .line 132
    .line 133
    and-int/lit8 p2, p0, 0x60

    .line 134
    .line 135
    shr-int/2addr p2, v3

    .line 136
    and-int/lit8 p0, p0, 0x1f

    .line 137
    .line 138
    if-eq p2, p0, :cond_95

    .line 139
    .line 140
    int-to-double v0, p2

    .line 141
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 142
    .line 143
    add-double/2addr v0, v2

    .line 144
    add-int/lit8 p0, p0, 0x1

    .line 145
    .line 146
    int-to-double v2, p0

    .line 147
    div-double/2addr v0, v2

    .line 148
    mul-double v4, v4, v0

    .line 149
    .line 150
    :cond_95
    const-wide v0, 0x412e848000000000L    # 1000000.0

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    div-double/2addr v0, v4

    .line 156
    double-to-long v0, v0

    .line 157
    goto :goto_9f

    .line 158
    :cond_9d
    const-wide/16 v0, 0x0

    .line 159
    .line 160
    :goto_9f
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0
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


# virtual methods
.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X1/n;->g:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lax/T0/h;->c([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X1/n;->h:Lax/X1/n$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/X1/n$a;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/X1/n;->f:Lax/X1/w;

    .line 12
    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/X1/w;->d()V

    .line 16
    .line 17
    .line 18
    :cond_11
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iput-wide v0, p0, Lax/X1/n;->i:J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lax/X1/n;->j:Z

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iput-wide v0, p0, Lax/X1/n;->m:J

    .line 31
    .line 32
    iput-wide v0, p0, Lax/X1/n;->o:J

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

.method public c(Lax/S0/G;)V
    .registers 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/X1/n;->b:Lax/q1/U;

    .line 4
    .line 5
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->g()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->j()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->f()[B

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-wide v4, v0, Lax/X1/n;->i:J

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->a()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    int-to-long v6, v6

    .line 27
    add-long/2addr v4, v6

    .line 28
    iput-wide v4, v0, Lax/X1/n;->i:J

    .line 29
    .line 30
    iget-object v4, v0, Lax/X1/n;->b:Lax/q1/U;

    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->a()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    move-object/from16 v6, p1

    .line 37
    .line 38
    invoke-interface {v4, v6, v5}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 39
    .line 40
    .line 41
    :goto_28
    iget-object v4, v0, Lax/X1/n;->g:[Z

    .line 42
    .line 43
    invoke-static {v3, v1, v2, v4}, Lax/T0/h;->e([BII[Z)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ne v4, v2, :cond_41

    .line 48
    .line 49
    iget-boolean v4, v0, Lax/X1/n;->k:Z

    .line 50
    .line 51
    if-nez v4, :cond_39

    .line 52
    .line 53
    iget-object v4, v0, Lax/X1/n;->h:Lax/X1/n$a;

    .line 54
    .line 55
    invoke-virtual {v4, v3, v1, v2}, Lax/X1/n$a;->a([BII)V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v4, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 59
    .line 60
    if-eqz v4, :cond_40

    .line 61
    .line 62
    invoke-virtual {v4, v3, v1, v2}, Lax/X1/w;->a([BII)V

    .line 63
    .line 64
    .line 65
    :cond_40
    return-void

    .line 66
    :cond_41
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    add-int/lit8 v7, v4, 0x3

    .line 71
    .line 72
    aget-byte v5, v5, v7

    .line 73
    .line 74
    and-int/lit16 v5, v5, 0xff

    .line 75
    .line 76
    sub-int v8, v4, v1

    .line 77
    .line 78
    iget-boolean v9, v0, Lax/X1/n;->k:Z

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x1

    .line 82
    if-nez v9, :cond_8c

    .line 83
    .line 84
    if-lez v8, :cond_5a

    .line 85
    .line 86
    iget-object v9, v0, Lax/X1/n;->h:Lax/X1/n$a;

    .line 87
    .line 88
    invoke-virtual {v9, v3, v1, v4}, Lax/X1/n$a;->a([BII)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    if-gez v8, :cond_5e

    .line 92
    .line 93
    neg-int v9, v8

    .line 94
    goto :goto_5f

    .line 95
    :cond_5e
    const/4 v9, 0x0

    .line 96
    :goto_5f
    iget-object v12, v0, Lax/X1/n;->h:Lax/X1/n$a;

    .line 97
    .line 98
    invoke-virtual {v12, v5, v9}, Lax/X1/n$a;->b(II)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_8c

    .line 103
    .line 104
    iget-object v9, v0, Lax/X1/n;->h:Lax/X1/n$a;

    .line 105
    .line 106
    iget-object v12, v0, Lax/X1/n;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v12}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    check-cast v12, Ljava/lang/String;

    .line 113
    .line 114
    iget-object v13, v0, Lax/X1/n;->d:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v9, v12, v13}, Lax/X1/n;->a(Lax/X1/n$a;Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    iget-object v12, v0, Lax/X1/n;->b:Lax/q1/U;

    .line 121
    .line 122
    iget-object v13, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v13, Lax/P0/v;

    .line 125
    .line 126
    invoke-interface {v12, v13}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 127
    .line 128
    .line 129
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v9, Ljava/lang/Long;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v12

    .line 137
    iput-wide v12, v0, Lax/X1/n;->l:J

    .line 138
    .line 139
    iput-boolean v11, v0, Lax/X1/n;->k:Z

    .line 140
    .line 141
    :cond_8c
    iget-object v9, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 142
    .line 143
    if-eqz v9, :cond_db

    .line 144
    .line 145
    if-lez v8, :cond_97

    .line 146
    .line 147
    invoke-virtual {v9, v3, v1, v4}, Lax/X1/w;->a([BII)V

    .line 148
    .line 149
    .line 150
    const/4 v1, 0x0

    .line 151
    goto :goto_98

    .line 152
    :cond_97
    neg-int v1, v8

    .line 153
    :goto_98
    iget-object v8, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 154
    .line 155
    invoke-virtual {v8, v1}, Lax/X1/w;->b(I)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_c8

    .line 160
    .line 161
    iget-object v1, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 162
    .line 163
    iget-object v8, v1, Lax/X1/w;->d:[B

    .line 164
    .line 165
    iget v1, v1, Lax/X1/w;->e:I

    .line 166
    .line 167
    invoke-static {v8, v1}, Lax/T0/h;->L([BI)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    iget-object v8, v0, Lax/X1/n;->e:Lax/S0/G;

    .line 172
    .line 173
    invoke-static {v8}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, Lax/S0/G;

    .line 178
    .line 179
    iget-object v9, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 180
    .line 181
    iget-object v9, v9, Lax/X1/w;->d:[B

    .line 182
    .line 183
    invoke-virtual {v8, v9, v1}, Lax/S0/G;->Z([BI)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v0, Lax/X1/n;->c:Lax/X1/O;

    .line 187
    .line 188
    invoke-static {v1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Lax/X1/O;

    .line 193
    .line 194
    iget-wide v8, v0, Lax/X1/n;->o:J

    .line 195
    .line 196
    iget-object v12, v0, Lax/X1/n;->e:Lax/S0/G;

    .line 197
    .line 198
    invoke-virtual {v1, v8, v9, v12}, Lax/X1/O;->b(JLax/S0/G;)V

    .line 199
    .line 200
    .line 201
    :cond_c8
    const/16 v1, 0xb2

    .line 202
    .line 203
    if-ne v5, v1, :cond_db

    .line 204
    .line 205
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    add-int/lit8 v8, v4, 0x2

    .line 210
    .line 211
    aget-byte v1, v1, v8

    .line 212
    .line 213
    if-ne v1, v11, :cond_db

    .line 214
    .line 215
    iget-object v1, v0, Lax/X1/n;->f:Lax/X1/w;

    .line 216
    .line 217
    invoke-virtual {v1, v5}, Lax/X1/w;->e(I)V

    .line 218
    .line 219
    .line 220
    :cond_db
    if-eqz v5, :cond_ea

    .line 221
    .line 222
    const/16 v1, 0xb3

    .line 223
    .line 224
    if-ne v5, v1, :cond_e2

    .line 225
    .line 226
    goto :goto_ea

    .line 227
    :cond_e2
    const/16 v1, 0xb8

    .line 228
    .line 229
    if-ne v5, v1, :cond_e8

    .line 230
    .line 231
    iput-boolean v11, v0, Lax/X1/n;->p:Z

    .line 232
    .line 233
    :cond_e8
    move v4, v2

    .line 234
    goto :goto_147

    .line 235
    :cond_ea
    :goto_ea
    sub-int v17, v2, v4

    .line 236
    .line 237
    iget-boolean v1, v0, Lax/X1/n;->q:Z

    .line 238
    .line 239
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    if-eqz v1, :cond_114

    .line 245
    .line 246
    iget-boolean v1, v0, Lax/X1/n;->k:Z

    .line 247
    .line 248
    if-eqz v1, :cond_114

    .line 249
    .line 250
    iget-wide v13, v0, Lax/X1/n;->o:J

    .line 251
    .line 252
    cmp-long v1, v13, v8

    .line 253
    .line 254
    if-eqz v1, :cond_114

    .line 255
    .line 256
    iget-boolean v15, v0, Lax/X1/n;->p:Z

    .line 257
    .line 258
    iget-wide v11, v0, Lax/X1/n;->i:J

    .line 259
    .line 260
    move v4, v2

    .line 261
    iget-wide v1, v0, Lax/X1/n;->n:J

    .line 262
    .line 263
    sub-long/2addr v11, v1

    .line 264
    long-to-int v1, v11

    .line 265
    sub-int v16, v1, v17

    .line 266
    .line 267
    iget-object v12, v0, Lax/X1/n;->b:Lax/q1/U;

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    invoke-interface/range {v12 .. v18}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 272
    .line 273
    .line 274
    :goto_111
    move/from16 v2, v17

    .line 275
    .line 276
    goto :goto_116

    .line 277
    :cond_114
    move v4, v2

    .line 278
    goto :goto_111

    .line 279
    :goto_116
    iget-boolean v1, v0, Lax/X1/n;->j:Z

    .line 280
    .line 281
    if-eqz v1, :cond_121

    .line 282
    .line 283
    iget-boolean v1, v0, Lax/X1/n;->q:Z

    .line 284
    .line 285
    if-eqz v1, :cond_11f

    .line 286
    .line 287
    goto :goto_121

    .line 288
    :cond_11f
    const/4 v1, 0x1

    .line 289
    goto :goto_142

    .line 290
    :cond_121
    :goto_121
    iget-wide v11, v0, Lax/X1/n;->i:J

    .line 291
    .line 292
    int-to-long v1, v2

    .line 293
    sub-long/2addr v11, v1

    .line 294
    iput-wide v11, v0, Lax/X1/n;->n:J

    .line 295
    .line 296
    iget-wide v1, v0, Lax/X1/n;->m:J

    .line 297
    .line 298
    cmp-long v11, v1, v8

    .line 299
    .line 300
    if-eqz v11, :cond_12e

    .line 301
    .line 302
    goto :goto_139

    .line 303
    :cond_12e
    iget-wide v1, v0, Lax/X1/n;->o:J

    .line 304
    .line 305
    cmp-long v11, v1, v8

    .line 306
    .line 307
    if-eqz v11, :cond_138

    .line 308
    .line 309
    iget-wide v11, v0, Lax/X1/n;->l:J

    .line 310
    .line 311
    add-long/2addr v1, v11

    .line 312
    goto :goto_139

    .line 313
    :cond_138
    move-wide v1, v8

    .line 314
    :goto_139
    iput-wide v1, v0, Lax/X1/n;->o:J

    .line 315
    .line 316
    iput-boolean v10, v0, Lax/X1/n;->p:Z

    .line 317
    .line 318
    iput-wide v8, v0, Lax/X1/n;->m:J

    .line 319
    .line 320
    const/4 v1, 0x1

    .line 321
    iput-boolean v1, v0, Lax/X1/n;->j:Z

    .line 322
    .line 323
    :goto_142
    if-nez v5, :cond_145

    .line 324
    .line 325
    const/4 v10, 0x1

    .line 326
    :cond_145
    iput-boolean v10, v0, Lax/X1/n;->q:Z

    .line 327
    .line 328
    :goto_147
    move v2, v4

    .line 329
    move v1, v7

    .line 330
    goto/16 :goto_28
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
    iput-object v0, p0, Lax/X1/n;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lax/X1/L$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lax/X1/n;->b:Lax/q1/U;

    .line 20
    .line 21
    iget-object v0, p0, Lax/X1/n;->c:Lax/X1/O;

    .line 22
    .line 23
    if-eqz v0, :cond_1b

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lax/X1/O;->c(Lax/q1/t;Lax/X1/L$d;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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

.method public e(Z)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/X1/n;->b:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_18

    .line 7
    .line 8
    iget-boolean v4, p0, Lax/X1/n;->p:Z

    .line 9
    .line 10
    iget-wide v0, p0, Lax/X1/n;->i:J

    .line 11
    .line 12
    iget-wide v2, p0, Lax/X1/n;->n:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    long-to-int v5, v0

    .line 16
    iget-object v1, p0, Lax/X1/n;->b:Lax/q1/U;

    .line 17
    .line 18
    iget-wide v2, p0, Lax/X1/n;->o:J

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void
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
.end method

.method public f(JI)V
    .registers 4

    .line 1
    iput-wide p1, p0, Lax/X1/n;->m:J

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
