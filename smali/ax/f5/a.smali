.class public Lax/f5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/e5/a;


# static fields
.field private static final i:Ljava/lang/String; = "a"


# instance fields
.field private a:Lax/m5/b;

.field private b:Ljava/nio/ByteBuffer;

.field private c:Ljava/nio/ByteBuffer;

.field private d:I

.field private e:I

.field private f:Lax/g5/i;

.field private g:Lax/g5/e;

.field private h:Lax/g5/b;


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

.method public constructor <init>(Lax/m5/b;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/g5/i;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/g5/i;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/f5/a;->f:Lax/g5/i;

    .line 10
    .line 11
    new-instance v0, Lax/g5/e;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/g5/e;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/f5/a;->g:Lax/g5/e;

    .line 17
    .line 18
    new-instance v0, Lax/g5/b;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/g5/b;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 24
    .line 25
    iput-object p1, p0, Lax/f5/a;->a:Lax/m5/b;

    .line 26
    .line 27
    const/16 p1, 0x1f

    .line 28
    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    const/16 p1, 0xd

    .line 36
    .line 37
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lax/f5/a;->c:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    return-void
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

.method private a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Lax/g5/a;->d(Ljava/nio/ByteBuffer;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lax/f5/a;->a:Lax/m5/b;

    .line 27
    .line 28
    iget-object v3, p0, Lax/f5/a;->b:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-interface {v2, v3}, Lax/m5/b;->b(Ljava/nio/ByteBuffer;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    array-length v0, v0

    .line 35
    if-ne v2, v0, :cond_eb

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/g5/a;->b()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-lez v0, :cond_82

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/g5/a;->a()Lax/g5/a$a;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v3, Lax/g5/a$a;->q:Lax/g5/a$a;

    .line 48
    .line 49
    if-ne v2, v3, :cond_5e

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    :cond_33
    iget-object v3, p0, Lax/f5/a;->a:Lax/m5/b;

    .line 53
    .line 54
    invoke-interface {v3, p2}, Lax/m5/b;->a(Ljava/nio/ByteBuffer;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    add-int/2addr v2, v3

    .line 59
    if-lt v2, v0, :cond_33

    .line 60
    .line 61
    if-ne v2, v0, :cond_3f

    .line 62
    .line 63
    goto :goto_82

    .line 64
    :cond_3f
    new-instance p2, Ljava/io/IOException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v1, "Unexpected command size ("

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ") on response to "

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p2

    .line 95
    :cond_5e
    const/4 v2, 0x0

    .line 96
    :cond_5f
    iget-object v3, p0, Lax/f5/a;->a:Lax/m5/b;

    .line 97
    .line 98
    invoke-interface {v3, p2}, Lax/m5/b;->b(Ljava/nio/ByteBuffer;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    add-int/2addr v2, v3

    .line 103
    if-lt v2, v0, :cond_5f

    .line 104
    .line 105
    if-ne v2, v0, :cond_6b

    .line 106
    .line 107
    goto :goto_82

    .line 108
    :cond_6b
    new-instance p2, Ljava/io/IOException;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v1, "Could not write all bytes: "

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p2

    .line 131
    :cond_82
    :goto_82
    iget-object p2, p0, Lax/f5/a;->c:Ljava/nio/ByteBuffer;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 134
    .line 135
    .line 136
    iget-object p2, p0, Lax/f5/a;->a:Lax/m5/b;

    .line 137
    .line 138
    iget-object v0, p0, Lax/f5/a;->c:Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    invoke-interface {p2, v0}, Lax/m5/b;->a(Ljava/nio/ByteBuffer;)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    const/16 v0, 0xd

    .line 145
    .line 146
    if-ne p2, v0, :cond_e3

    .line 147
    .line 148
    iget-object p2, p0, Lax/f5/a;->c:Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 154
    .line 155
    iget-object v0, p0, Lax/f5/a;->c:Ljava/nio/ByteBuffer;

    .line 156
    .line 157
    invoke-virtual {p2, v0}, Lax/g5/b;->c(Ljava/nio/ByteBuffer;)V

    .line 158
    .line 159
    .line 160
    iget-object p2, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 161
    .line 162
    invoke-virtual {p2}, Lax/g5/b;->a()B

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-nez p2, :cond_c6

    .line 167
    .line 168
    iget-object p2, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 169
    .line 170
    invoke-virtual {p2}, Lax/g5/b;->b()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-virtual {p1}, Lax/g5/a;->c()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-ne p2, p1, :cond_be

    .line 179
    .line 180
    iget-object p1, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 181
    .line 182
    invoke-virtual {p1}, Lax/g5/b;->a()B

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-nez p1, :cond_bd

    .line 187
    .line 188
    const/4 p1, 0x1

    .line 189
    return p1

    .line 190
    :cond_bd
    return v1

    .line 191
    :cond_be
    new-instance p1, Ljava/io/IOException;

    .line 192
    .line 193
    const-string p2, "wrong csw tag!"

    .line 194
    .line 195
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_c6
    new-instance p1, Ljava/io/IOException;

    .line 200
    .line 201
    new-instance p2, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string v0, "Unsuccessful Csw status: "

    .line 207
    .line 208
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lax/f5/a;->h:Lax/g5/b;

    .line 212
    .line 213
    invoke-virtual {v0}, Lax/g5/b;->a()B

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p1

    .line 228
    :cond_e3
    new-instance p1, Ljava/io/IOException;

    .line 229
    .line 230
    const-string p2, "Unexpected command size while expecting csw"

    .line 231
    .line 232
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :cond_eb
    new-instance p2, Ljava/io/IOException;

    .line 237
    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v1, "Writing all bytes on command "

    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string p1, " failed!"

    .line 252
    .line 253
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p2
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


# virtual methods
.method public d()I
    .registers 2

    .line 1
    iget v0, p0, Lax/f5/a;->d:I

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

.method public e()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lax/g5/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    array-length v2, v2

    .line 14
    int-to-byte v2, v2

    .line 15
    invoke-direct {v1, v2}, Lax/g5/c;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v1, v0}, Lax/f5/a;->a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lax/g5/d;->c(Ljava/nio/ByteBuffer;)Lax/g5/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, Lax/f5/a;->i:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "inquiry response: "

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lax/g5/d;->b()B

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_a5

    .line 55
    .line 56
    invoke-virtual {v1}, Lax/g5/d;->a()B

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_a5

    .line 61
    .line 62
    new-instance v1, Lax/g5/h;

    .line 63
    .line 64
    invoke-direct {v1}, Lax/g5/h;-><init>()V

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-direct {p0, v1, v3}, Lax/f5/a;->a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_4e

    .line 73
    .line 74
    const-string v1, "unit not ready!"

    .line 75
    .line 76
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    :cond_4e
    new-instance v1, Lax/g5/f;

    .line 80
    .line 81
    invoke-direct {v1}, Lax/g5/f;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v1, v0}, Lax/f5/a;->a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lax/g5/g;->c(Ljava/nio/ByteBuffer;)Lax/g5/g;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lax/g5/g;->a()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iput v1, p0, Lax/f5/a;->d:I

    .line 102
    .line 103
    invoke-virtual {v0}, Lax/g5/g;->b()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput v0, p0, Lax/f5/a;->e:I

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v1, "Block size: "

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget v1, p0, Lax/f5/a;->d:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v1, "Last block address: "

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget v1, p0, Lax/f5/a;->e:I

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    iget v0, p0, Lax/f5/a;->d:I

    .line 154
    .line 155
    if-eqz v0, :cond_9d

    .line 156
    .line 157
    return-void

    .line 158
    :cond_9d
    new-instance v0, Lcom/github/mjdev/libaums/b;

    .line 159
    .line 160
    const-string v1, "Block size is zero"

    .line 161
    .line 162
    invoke-direct {v0, v1}, Lcom/github/mjdev/libaums/b;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_a5
    new-instance v0, Ljava/io/IOException;

    .line 167
    .line 168
    const-string v1, "unsupported PeripheralQualifier or PeripheralDeviceType"

    .line 169
    .line 170
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0
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

.method public declared-synchronized i(JLjava/nio/ByteBuffer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget v1, p0, Lax/f5/a;->d:I

    .line 7
    .line 8
    rem-int/2addr v0, v1

    .line 9
    if-nez v0, :cond_26

    .line 10
    .line 11
    iget-object v0, p0, Lax/f5/a;->g:Lax/g5/e;

    .line 12
    .line 13
    long-to-int p2, p1

    .line 14
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget v1, p0, Lax/f5/a;->d:I

    .line 19
    .line 20
    invoke-virtual {v0, p2, p1, v1}, Lax/g5/e;->e(III)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/f5/a;->g:Lax/g5/e;

    .line 24
    .line 25
    invoke-direct {p0, p1, p3}, Lax/f5/a;->a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_24

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    goto :goto_2e

    .line 39
    :cond_26
    :try_start_26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "dest.remaining() must be multiple of blockSize!"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :goto_2e
    monitor-exit p0
    :try_end_2f
    .catchall {:try_start_26 .. :try_end_2f} :catchall_24

    .line 48
    throw p1
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

.method public declared-synchronized l(JLjava/nio/ByteBuffer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget v1, p0, Lax/f5/a;->d:I

    .line 7
    .line 8
    rem-int/2addr v0, v1

    .line 9
    if-nez v0, :cond_26

    .line 10
    .line 11
    iget-object v0, p0, Lax/f5/a;->f:Lax/g5/i;

    .line 12
    .line 13
    long-to-int p2, p1

    .line 14
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget v1, p0, Lax/f5/a;->d:I

    .line 19
    .line 20
    invoke-virtual {v0, p2, p1, v1}, Lax/g5/i;->e(III)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/f5/a;->f:Lax/g5/i;

    .line 24
    .line 25
    invoke-direct {p0, p1, p3}, Lax/f5/a;->a(Lax/g5/a;Ljava/nio/ByteBuffer;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_24

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    goto :goto_2e

    .line 39
    :cond_26
    :try_start_26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "src.remaining() must be multiple of blockSize!"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :goto_2e
    monitor-exit p0
    :try_end_2f
    .catchall {:try_start_26 .. :try_end_2f} :catchall_24

    .line 48
    throw p1
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
