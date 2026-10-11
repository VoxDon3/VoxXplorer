.class final Lax/Z0/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Z0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lax/P0/N$b;

.field private b:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/i1/F$b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lax/r7/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/A<",
            "Lax/i1/F$b;",
            "Lax/P0/N;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lax/i1/F$b;

.field private e:Lax/i1/F$b;

.field private f:Lax/i1/F$b;


# direct methods
.method public constructor <init>(Lax/P0/N$b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Z0/u0$a;->a:Lax/P0/N$b;

    .line 5
    .line 6
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 11
    .line 12
    invoke-static {}, Lax/r7/A;->k()Lax/r7/A;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lax/Z0/u0$a;->c:Lax/r7/A;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic a(Lax/Z0/u0$a;)Lax/r7/z;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 2
    .line 3
    return-object p0
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

.method private b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/r7/A$a<",
            "Lax/i1/F$b;",
            "Lax/P0/N;",
            ">;",
            "Lax/i1/F$b;",
            "Lax/P0/N;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    goto :goto_1d

    .line 4
    :cond_3
    iget-object v0, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-eq v0, v1, :cond_10

    .line 12
    .line 13
    invoke-virtual {p1, p2, p3}, Lax/r7/A$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/A$a;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    iget-object p3, p0, Lax/Z0/u0$a;->c:Lax/r7/A;

    .line 18
    .line 19
    invoke-virtual {p3, p2}, Lax/r7/A;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    check-cast p3, Lax/P0/N;

    .line 24
    .line 25
    if-eqz p3, :cond_1d

    .line 26
    .line 27
    invoke-virtual {p1, p2, p3}, Lax/r7/A$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/A$a;

    .line 28
    .line 29
    .line 30
    :cond_1d
    :goto_1d
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

.method private static c(Lax/P0/H;Lax/r7/z;Lax/i1/F$b;Lax/P0/N$b;)Lax/i1/F$b;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/H;",
            "Lax/r7/z<",
            "Lax/i1/F$b;",
            ">;",
            "Lax/i1/F$b;",
            "Lax/P0/N$b;",
            ")",
            "Lax/i1/F$b;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lax/P0/H;->h0()Lax/P0/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lax/P0/H;->D()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_11

    .line 15
    .line 16
    move-object v5, v3

    .line 17
    goto :goto_16

    .line 18
    :cond_11
    invoke-virtual {v0, v1}, Lax/P0/N;->m(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v5, v2

    .line 23
    :goto_16
    invoke-interface {p0}, Lax/P0/H;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_3a

    .line 28
    .line 29
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_23

    .line 34
    .line 35
    goto :goto_3a

    .line 36
    :cond_23
    invoke-virtual {v0, v1, p3}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0}, Lax/P0/H;->s0()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-static {v1, v2}, Lax/S0/d0;->a1(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-virtual {p3}, Lax/P0/N$b;->o()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sub-long/2addr v1, v6

    .line 53
    invoke-virtual {v0, v1, v2}, Lax/P0/N$b;->d(J)I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    move v9, p3

    .line 58
    goto :goto_3c

    .line 59
    :cond_3a
    :goto_3a
    const/4 p3, -0x1

    .line 60
    const/4 v9, -0x1

    .line 61
    :goto_3c
    const/4 p3, 0x0

    .line 62
    :goto_3d
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ge p3, v0, :cond_60

    .line 67
    .line 68
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move-object v4, v0

    .line 73
    check-cast v4, Lax/i1/F$b;

    .line 74
    .line 75
    invoke-interface {p0}, Lax/P0/H;->p()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-interface {p0}, Lax/P0/H;->a0()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-interface {p0}, Lax/P0/H;->K()I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-static/range {v4 .. v9}, Lax/Z0/u0$a;->i(Lax/i1/F$b;Ljava/lang/Object;ZIII)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5d

    .line 92
    .line 93
    return-object v4

    .line 94
    :cond_5d
    add-int/lit8 p3, p3, 0x1

    .line 95
    .line 96
    goto :goto_3d

    .line 97
    :cond_60
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_7c

    .line 102
    .line 103
    if-eqz p2, :cond_7c

    .line 104
    .line 105
    invoke-interface {p0}, Lax/P0/H;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-interface {p0}, Lax/P0/H;->a0()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-interface {p0}, Lax/P0/H;->K()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    move-object v4, p2

    .line 118
    invoke-static/range {v4 .. v9}, Lax/Z0/u0$a;->i(Lax/i1/F$b;Ljava/lang/Object;ZIII)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_7c

    .line 123
    .line 124
    return-object v4

    .line 125
    :cond_7c
    return-object v3
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

.method private static i(Lax/i1/F$b;Ljava/lang/Object;ZIII)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return v0

    .line 11
    :cond_a
    if-eqz p2, :cond_14

    .line 12
    .line 13
    iget p1, p0, Lax/i1/F$b;->b:I

    .line 14
    .line 15
    if-ne p1, p3, :cond_14

    .line 16
    .line 17
    iget p1, p0, Lax/i1/F$b;->c:I

    .line 18
    .line 19
    if-eq p1, p4, :cond_1f

    .line 20
    .line 21
    :cond_14
    if-nez p2, :cond_21

    .line 22
    .line 23
    iget p1, p0, Lax/i1/F$b;->b:I

    .line 24
    .line 25
    const/4 p2, -0x1

    .line 26
    if-ne p1, p2, :cond_21

    .line 27
    .line 28
    iget p0, p0, Lax/i1/F$b;->e:I

    .line 29
    .line 30
    if-ne p0, p5, :cond_21

    .line 31
    .line 32
    :cond_1f
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_21
    return v0
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

.method private m(Lax/P0/N;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/r7/A;->a()Lax/r7/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3a

    .line 12
    .line 13
    iget-object v1, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1, p1}, Lax/Z0/u0$a;->b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/Z0/u0$a;->f:Lax/i1/F$b;

    .line 19
    .line 20
    iget-object v2, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 21
    .line 22
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_20

    .line 27
    .line 28
    iget-object v1, p0, Lax/Z0/u0$a;->f:Lax/i1/F$b;

    .line 29
    .line 30
    invoke-direct {p0, v0, v1, p1}, Lax/Z0/u0$a;->b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    iget-object v1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 34
    .line 35
    iget-object v2, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 36
    .line 37
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_60

    .line 42
    .line 43
    iget-object v1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 44
    .line 45
    iget-object v2, p0, Lax/Z0/u0$a;->f:Lax/i1/F$b;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_60

    .line 52
    .line 53
    iget-object v1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 54
    .line 55
    invoke-direct {p0, v0, v1, p1}, Lax/Z0/u0$a;->b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V

    .line 56
    .line 57
    .line 58
    goto :goto_60

    .line 59
    :cond_3a
    const/4 v1, 0x0

    .line 60
    :goto_3b
    iget-object v2, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ge v1, v2, :cond_51

    .line 67
    .line 68
    iget-object v2, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 69
    .line 70
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lax/i1/F$b;

    .line 75
    .line 76
    invoke-direct {p0, v0, v2, p1}, Lax/Z0/u0$a;->b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_3b

    .line 82
    :cond_51
    iget-object v1, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 83
    .line 84
    iget-object v2, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lax/r7/z;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_60

    .line 91
    .line 92
    iget-object v1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 93
    .line 94
    invoke-direct {p0, v0, v1, p1}, Lax/Z0/u0$a;->b(Lax/r7/A$a;Lax/i1/F$b;Lax/P0/N;)V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    invoke-virtual {v0}, Lax/r7/A$a;->c()Lax/r7/A;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lax/Z0/u0$a;->c:Lax/r7/A;

    .line 102
    .line 103
    return-void
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


# virtual methods
.method public d()Lax/i1/F$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

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

.method public e()Lax/i1/F$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_a
    iget-object v0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 12
    .line 13
    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lax/i1/F$b;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public f(Lax/i1/F$b;)Lax/P0/N;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->c:Lax/r7/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/r7/A;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/P0/N;

    .line 8
    .line 9
    return-object p1
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

.method public g()Lax/i1/F$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

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

.method public h()Lax/i1/F$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->f:Lax/i1/F$b;

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

.method public j(Lax/P0/H;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 4
    .line 5
    iget-object v2, p0, Lax/Z0/u0$a;->a:Lax/P0/N$b;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Lax/Z0/u0$a;->c(Lax/P0/H;Lax/r7/z;Lax/i1/F$b;Lax/P0/N$b;)Lax/i1/F$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 12
    .line 13
    return-void
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

.method public k(Ljava/util/List;Lax/i1/F$b;Lax/P0/H;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/i1/F$b;",
            ">;",
            "Lax/i1/F$b;",
            "Lax/P0/H;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1d

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lax/i1/F$b;

    .line 19
    .line 20
    iput-object p1, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 21
    .line 22
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lax/i1/F$b;

    .line 27
    .line 28
    iput-object p1, p0, Lax/Z0/u0$a;->f:Lax/i1/F$b;

    .line 29
    .line 30
    :cond_1d
    iget-object p1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 31
    .line 32
    if-nez p1, :cond_2d

    .line 33
    .line 34
    iget-object p1, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 35
    .line 36
    iget-object p2, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 37
    .line 38
    iget-object v0, p0, Lax/Z0/u0$a;->a:Lax/P0/N$b;

    .line 39
    .line 40
    invoke-static {p3, p1, p2, v0}, Lax/Z0/u0$a;->c(Lax/P0/H;Lax/r7/z;Lax/i1/F$b;Lax/P0/N$b;)Lax/i1/F$b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 45
    .line 46
    :cond_2d
    invoke-interface {p3}, Lax/P0/H;->h0()Lax/P0/N;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Lax/Z0/u0$a;->m(Lax/P0/N;)V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public l(Lax/P0/H;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/u0$a;->b:Lax/r7/z;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Z0/u0$a;->e:Lax/i1/F$b;

    .line 4
    .line 5
    iget-object v2, p0, Lax/Z0/u0$a;->a:Lax/P0/N$b;

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Lax/Z0/u0$a;->c(Lax/P0/H;Lax/r7/z;Lax/i1/F$b;Lax/P0/N$b;)Lax/i1/F$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/Z0/u0$a;->d:Lax/i1/F$b;

    .line 12
    .line 13
    invoke-interface {p1}, Lax/P0/H;->h0()Lax/P0/N;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Lax/Z0/u0$a;->m(Lax/P0/N;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method
