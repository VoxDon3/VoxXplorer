.class public Lcom/voxdon/xplorer/file/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/N$b;
    }
.end annotation


# static fields
.field private static final e:Ljava/util/logging/Logger;


# instance fields
.field private a:Lcom/voxdon/xplorer/file/Q;

.field private b:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lax/pb/b0;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lax/pb/r;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.Smb1Client"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/N;->e:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/file/N;->a:Lcom/voxdon/xplorer/file/Q;

    .line 5
    .line 6
    new-instance p1, Lcom/voxdon/xplorer/file/N$a;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lcom/voxdon/xplorer/file/N$a;-><init>(Lcom/voxdon/xplorer/file/N;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;
    .registers 4

    .line 1
    instance-of v0, p1, Lax/pb/u;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    new-instance p0, Lax/b3/e;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_a
    invoke-virtual {p1}, Lax/pb/a0;->c()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lcom/voxdon/xplorer/file/N;->m(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1a

    .line 20
    .line 21
    new-instance p0, Lax/b3/t;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1a
    const v1, -0x3fffffbd    # -2.000016f

    .line 28
    .line 29
    .line 30
    if-ne v0, v1, :cond_25

    .line 31
    .line 32
    new-instance p0, Lax/b3/l;

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lax/b3/l;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_25
    const v1, -0x3fffff81    # -2.0000303f

    .line 39
    .line 40
    .line 41
    if-ne v0, v1, :cond_30

    .line 42
    .line 43
    new-instance p0, Lax/b3/s;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lax/b3/s;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_30
    const v1, -0x3fffff2c    # -2.0000505f

    .line 50
    .line 51
    .line 52
    if-ne v0, v1, :cond_3b

    .line 53
    .line 54
    new-instance p0, Lax/b3/m;

    .line 55
    .line 56
    invoke-direct {p0, p1}, Lax/b3/m;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_3b
    invoke-virtual {p1}, Lax/pb/a0;->d()Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    instance-of v0, v0, Lax/rb/d;

    .line 65
    .line 66
    if-eqz v0, :cond_49

    .line 67
    .line 68
    new-instance p0, Lax/b3/q;

    .line 69
    .line 70
    invoke-direct {p0, p1}, Lax/b3/q;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_49
    invoke-static {p0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
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

.method public static g(Lcom/voxdon/xplorer/file/Q;Lax/pb/b0;)Ljava/lang/String;
    .registers 11

    .line 1
    invoke-virtual {p1}, Lax/pb/b0;->v()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lax/Q2/f;->J0:Lax/Q2/f;

    .line 11
    .line 12
    invoke-virtual {v2}, Lax/Q2/f;->K()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, "://"

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v4, ""

    .line 29
    .line 30
    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2a

    .line 39
    .line 40
    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2a
    const-string v1, "/"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, -0x1

    .line 50
    if-ne v5, v6, :cond_a5

    .line 51
    .line 52
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v7, "INVALID SMB PATH"

    .line 57
    .line 58
    invoke-virtual {v5, v7}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v8, "PATH:"

    .line 72
    .line 73
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lax/pb/b0;->v()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v8, ","

    .line 84
    .line 85
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lax/pb/b0;->z()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v5, v7}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Lax/Ha/b;->h()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/Q;->r0()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_76

    .line 115
    .line 116
    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_76
    invoke-virtual {p1}, Lax/pb/b0;->z()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lax/Q2/f;->K()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-ne p1, v6, :cond_9c

    .line 151
    .line 152
    invoke-static {v0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :cond_9c
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :cond_a5
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0
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

.method private static m(I)Z
    .registers 2

    .line 1
    const v0, -0x3ffffff2    # -2.0000033f

    if-eq p0, v0, :cond_1c

    const v0, -0x3ffffff1    # -2.0000036f

    if-eq p0, v0, :cond_1c

    const v0, -0x3fffffcd    # -2.0000122f

    if-eq p0, v0, :cond_1c

    const v0, -0x3fffffcc    # -2.0000124f

    if-eq p0, v0, :cond_1c

    const v0, -0x3fffffc6    # -2.0000138f

    if-ne p0, v0, :cond_1a

    goto :goto_1c

    :cond_1a
    const/4 p0, 0x0

    return p0

    :cond_1c
    :goto_1c
    const/4 p0, 0x1

    return p0
.end method

.method public static r(Lax/jb/b;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-lez p1, :cond_7

    .line 2
    .line 3
    invoke-static {p0, p1}, Lax/pb/k0;->s(Lax/jb/b;I)Lax/pb/k0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_d

    .line 8
    :cond_7
    const/16 p1, 0x1bd

    .line 9
    .line 10
    invoke-static {p0, p1}, Lax/pb/k0;->s(Lax/jb/b;I)Lax/pb/k0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_d
    const-wide/16 v0, 0x2710

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lax/rb/c;->a(J)V

    .line 17
    .line 18
    .line 19
    return-void
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


# virtual methods
.method public b(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->k(Ljava/lang/String;)Lax/pb/b0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lax/pb/b0;->h()V
    :try_end_b
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_b} :catch_f
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_b} :catch_d

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_d
    move-exception p1

    .line 15
    goto :goto_11

    .line 16
    :catch_f
    move-exception p1

    .line 17
    goto :goto_15

    .line 18
    :goto_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    goto :goto_18

    .line 22
    :goto_15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    :goto_18
    const/4 p1, 0x0

    .line 26
    return p1
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

.method public c(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->k(Ljava/lang/String;)Lax/pb/b0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lax/pb/b0;->O()V
    :try_end_b
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_b} :catch_f
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_b} :catch_d

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_d
    move-exception p1

    .line 15
    goto :goto_11

    .line 16
    :catch_f
    move-exception p1

    .line 17
    goto :goto_15

    .line 18
    :goto_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    goto :goto_18

    .line 22
    :goto_15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    :goto_18
    const/4 p1, 0x0

    .line 26
    return p1
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

.method public d(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/file/N;->j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1f

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/pb/b0;->M()[Lax/pb/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v1, v1

    .line 17
    if-gtz v1, :cond_13

    .line 18
    .line 19
    goto :goto_1f

    .line 20
    :cond_13
    new-instance p1, Lax/b3/j;

    .line 21
    .line 22
    const-string v0, "SMB delete Directory failed : has children"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    goto :goto_2c

    .line 30
    :catch_1d
    move-exception p1

    .line 31
    goto :goto_36

    .line 32
    :cond_1f
    :goto_1f
    iget-object v1, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v1, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lax/pb/b0;->i()V
    :try_end_2b
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_2b} :catch_1d
    .catch Lax/pb/a0; {:try_start_1 .. :try_end_2b} :catch_1b

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_2c
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    const-string v0, "SMB1 deleteFile"

    .line 49
    .line 50
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1

    .line 55
    :goto_36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lax/b3/j;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v0
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

.method public e(Ljava/lang/String;)Lcom/voxdon/xplorer/file/S;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    :try_start_2
    new-instance v1, Lcom/voxdon/xplorer/file/S;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/voxdon/xplorer/file/N;->a:Lcom/voxdon/xplorer/file/Q;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->k(Ljava/lang/String;)Lax/pb/b0;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v1, v2, v3}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Lax/pb/b0;)V
    :try_end_d
    .catch Lax/pb/a0; {:try_start_2 .. :try_end_d} :catch_14
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_d} :catch_12
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_d} :catch_10
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :catch_e
    move-exception v1

    .line 16
    goto :goto_17

    .line 17
    :catch_10
    move-exception v1

    .line 18
    goto :goto_4b

    .line 19
    :catch_12
    move-exception v0

    .line 20
    goto :goto_7b

    .line 21
    :catch_14
    move-exception v0

    .line 22
    goto/16 :goto_c6

    .line 23
    .line 24
    :goto_17
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "SmbFileInfo Number Format Exception"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lax/b3/j;

    .line 71
    .line 72
    invoke-direct {p1, v1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :goto_4b
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "SmbFileInfo Invalid Path?"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 116
    .line 117
    .line 118
    new-instance p1, Lax/b3/j;

    .line 119
    .line 120
    invoke-direct {p1, v1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :goto_7b
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "MARFORMED URL 1"

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v3, "prefix:"

    .line 151
    .line 152
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lcom/voxdon/xplorer/file/N;->d:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v3, ",path:"

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string p1, ",connected:"

    .line 169
    .line 170
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lcom/voxdon/xplorer/file/N;->a:Lcom/voxdon/xplorer/file/Q;

    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/Q;->a()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {v1, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 191
    .line 192
    .line 193
    new-instance p1, Lax/b3/j;

    .line 194
    .line 195
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :goto_c6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Lax/pb/a0;->c()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-static {v1}, Lcom/voxdon/xplorer/file/N;->m(I)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_db

    .line 211
    .line 212
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N;->a:Lcom/voxdon/xplorer/file/Q;

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    invoke-static {v0, p1, v1}, Lcom/voxdon/xplorer/file/S;->f0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Z)Lcom/voxdon/xplorer/file/S;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1

    .line 220
    :cond_db
    sget-object p1, Lcom/voxdon/xplorer/file/N;->e:Ljava/util/logging/Logger;

    .line 221
    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-string v3, "SmbException : "

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {p1, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    const-string p1, "SMB1 getfileinfo"

    .line 243
    .line 244
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    throw p1
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
.end method

.method public f(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N;->c:Lax/pb/r;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/file/N$b;->a(Ljava/lang/String;Lax/pb/r;)Lcom/voxdon/xplorer/file/N$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    cmp-long v2, p2, v0

    .line 18
    .line 19
    if-eqz v2, :cond_1e

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lcom/voxdon/xplorer/file/N$b;->skip(J)J

    .line 22
    .line 23
    .line 24
    goto :goto_1e

    .line 25
    :catch_18
    move-exception p1

    .line 26
    goto :goto_28

    .line 27
    :catch_1a
    move-exception p1

    .line 28
    goto :goto_2e

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    goto :goto_34

    .line 31
    :cond_1e
    :goto_1e
    new-instance p2, Ljava/io/BufferedInputStream;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/N$b;->b()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-direct {p2, p1, p3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_27
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_27} :catch_1c
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_27} :catch_1a
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_27} :catch_18

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :goto_28
    new-instance p2, Lax/b3/j;

    .line 42
    .line 43
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p2

    .line 47
    :goto_2e
    new-instance p2, Lax/b3/t;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p2

    .line 53
    :goto_34
    const-string p2, "SMB1 getInputStream"

    .line 54
    .line 55
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
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
.end method

.method public h(Lcom/voxdon/xplorer/file/n;Z)Ljava/io/OutputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "SMB1 getOutputStream"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    invoke-virtual {p0, p1, v1}, Lcom/voxdon/xplorer/file/N;->j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p2, :cond_12

    .line 9
    .line 10
    invoke-static {p1}, Lax/pb/e0;->b(Lax/pb/b0;)Lax/pb/e0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_16

    .line 15
    :catch_e
    move-exception p1

    .line 16
    goto :goto_20

    .line 17
    :catch_10
    move-exception p1

    .line 18
    goto :goto_25

    .line 19
    :cond_12
    invoke-static {p1}, Lax/pb/e0;->a(Lax/pb/b0;)Lax/pb/e0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_16
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/pb/e0;->d()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {p2, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_1f
    .catch Lax/pb/a0; {:try_start_3 .. :try_end_1f} :catch_10
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_1f} :catch_e

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :goto_20
    invoke-static {v0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    throw p1

    .line 38
    :goto_25
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    throw p1
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
.end method

.method public i(Lcom/voxdon/xplorer/file/n;)Lax/c3/k0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/S;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/S;->j0()Lax/pb/b0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1f

    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p1}, Lax/pb/b0;->w()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p1}, Lax/pb/b0;->L()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    new-instance p1, Lax/c3/k0;

    .line 18
    .line 19
    sub-long v0, v2, v0

    .line 20
    .line 21
    invoke-direct {p1, v2, v3, v0, v1}, Lax/c3/k0;-><init>(JJ)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :catch_18
    move-exception p1

    .line 26
    new-instance v0, Lax/b3/j;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1f
    new-instance p1, Lax/b3/j;

    .line 33
    .line 34
    const-string v0, "smb file is null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    if-eqz p2, :cond_9

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const/4 p2, 0x0

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    :goto_b
    const/4 p2, 0x1

    .line 13
    :goto_c
    move-object v0, p1

    .line 14
    check-cast v0, Lcom/voxdon/xplorer/file/S;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/S;->j0()Lax/pb/b0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "/"

    .line 21
    .line 22
    if-eqz v1, :cond_28

    .line 23
    .line 24
    if-eqz p2, :cond_27

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_28

    .line 39
    .line 40
    :cond_27
    return-object v1

    .line 41
    :cond_28
    if-eqz p2, :cond_42

    .line 42
    .line 43
    new-instance p2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->k(Ljava/lang/String;)Lax/pb/b0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_4a

    .line 67
    :cond_42
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->k(Ljava/lang/String;)Lax/pb/b0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_4a
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/S;->k0(Lax/pb/b0;)V

    .line 76
    .line 77
    .line 78
    return-object p1
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

.method public k(Ljava/lang/String;)Lax/pb/b0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/pb/b0;

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    new-instance v0, Lax/pb/b0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/N;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/file/N;->c:Lax/pb/r;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Lax/pb/b0;-><init>(Ljava/lang/String;Lax/pb/r;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 24
    .line 25
    invoke-virtual {v1, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const-string v1, "/"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_34

    .line 35
    .line 36
    iget-object v1, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/lit8 v2, v2, -0x1

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v1, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_34
    iget-object v2, p0, Lcom/voxdon/xplorer/file/N;->b:Landroid/util/LruCache;

    .line 54
    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v2, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-object v0
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

.method l(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/N;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/Q;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public n(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lax/pb/b0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lax/c3/d0;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/N;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lcom/voxdon/xplorer/file/N;->c:Lax/pb/r;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lax/pb/b0;-><init>(Ljava/lang/String;Lax/pb/r;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lax/pb/b0;->M()[Lax/pb/b0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_46

    .line 34
    .line 35
    array-length v2, v0

    .line 36
    const/4 v3, 0x0

    .line 37
    :goto_24
    if-ge v3, v2, :cond_46

    .line 38
    .line 39
    aget-object v4, v0, v3

    .line 40
    .line 41
    if-eqz p1, :cond_39

    .line 42
    .line 43
    invoke-virtual {v4}, Lax/pb/b0;->C()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/16 v6, 0x8

    .line 48
    .line 49
    if-eq v5, v6, :cond_39

    .line 50
    .line 51
    goto :goto_43

    .line 52
    :catch_33
    move-exception p1

    .line 53
    goto :goto_47

    .line 54
    :catch_35
    move-exception p1

    .line 55
    goto :goto_4d

    .line 56
    :catch_37
    move-exception p1

    .line 57
    goto :goto_54

    .line 58
    :cond_39
    new-instance v5, Lcom/voxdon/xplorer/file/S;

    .line 59
    .line 60
    iget-object v6, p0, Lcom/voxdon/xplorer/file/N;->a:Lcom/voxdon/xplorer/file/Q;

    .line 61
    .line 62
    invoke-direct {v5, v6, v4}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Lax/pb/b0;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_43
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_43} :catch_37
    .catch Lax/pb/a0; {:try_start_0 .. :try_end_43} :catch_35
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_43} :catch_33

    .line 66
    .line 67
    .line 68
    :goto_43
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_24

    .line 71
    :cond_46
    return-object v1

    .line 72
    :goto_47
    new-instance v0, Lax/b3/j;

    .line 73
    .line 74
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :goto_4d
    const-string v0, "SMB1 listChildren"

    .line 79
    .line 80
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    throw p1

    .line 85
    :goto_54
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "MARFORMED URL 2"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lax/b3/j;

    .line 107
    .line 108
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v0
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

.method public o(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/file/N;->j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lax/pb/b0;->G()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p2, v0}, Lcom/voxdon/xplorer/file/N;->j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1, p2}, Lax/pb/b0;->W(Lax/pb/b0;)V
    :try_end_10
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_10} :catch_13
    .catch Lax/pb/a0; {:try_start_1 .. :try_end_10} :catch_11

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_11
    move-exception p1

    .line 19
    goto :goto_15

    .line 20
    :catch_13
    move-exception p1

    .line 21
    goto :goto_1f

    .line 22
    :goto_15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    const-string p2, "SMB1 moveFile"

    .line 26
    .line 27
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    throw p1

    .line 32
    :goto_1f
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lax/b3/j;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p2
    .line 41
.end method

.method public p(Lcom/voxdon/xplorer/file/n;J)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "SMB1 setLastModified"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    invoke-virtual {p0, p1, v1}, Lcom/voxdon/xplorer/file/N;->j(Lcom/voxdon/xplorer/file/n;Z)Lax/pb/b0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1, p2, p3}, Lax/pb/b0;->a0(J)V
    :try_end_a
    .catch Lax/pb/a0; {:try_start_3 .. :try_end_a} :catch_d
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_b
    move-exception p1

    .line 13
    goto :goto_f

    .line 14
    :catch_d
    move-exception p1

    .line 15
    goto :goto_14

    .line 16
    :goto_f
    invoke-static {v0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    throw p1

    .line 21
    :goto_14
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/N;->a(Ljava/lang/String;Lax/pb/a0;)Lax/b3/j;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    throw p1
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

.method public q(Lax/pb/r;Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/N;->c:Lax/pb/r;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/N;->d:Ljava/lang/String;

    .line 4
    .line 5
    return-void
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
