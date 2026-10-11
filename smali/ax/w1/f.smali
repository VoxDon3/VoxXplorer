.class final Lax/w1/f;
.super Lax/w1/e;
.source "SourceFile"


# instance fields
.field private final b:Lax/S0/G;

.field private final c:Lax/S0/G;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Lax/q1/U;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/w1/e;-><init>(Lax/q1/U;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lax/S0/G;

    .line 5
    .line 6
    sget-object v0, Lax/T0/h;->a:[B

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lax/S0/G;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lax/w1/f;->b:Lax/S0/G;

    .line 12
    .line 13
    new-instance p1, Lax/S0/G;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lax/w1/f;->c:Lax/S0/G;

    .line 20
    .line 21
    return-void
    .line 22
.end method


# virtual methods
.method protected b(Lax/S0/G;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/w1/e$a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    shr-int/lit8 v0, p1, 0x4

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xf

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0xf

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-ne p1, v1, :cond_16

    .line 13
    .line 14
    iput v0, p0, Lax/w1/f;->g:I

    .line 15
    .line 16
    const/4 p1, 0x5

    .line 17
    if-eq v0, p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_16
    new-instance v0, Lax/w1/e$a;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Video format not supported: "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Lax/w1/e$a;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
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

.method protected c(Lax/S0/G;J)Z
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lax/S0/G;->w()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-long v1, v1

    .line 10
    const-wide/16 v3, 0x3e8

    .line 11
    .line 12
    mul-long v1, v1, v3

    .line 13
    .line 14
    add-long v4, p2, v1

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    const/4 p3, 0x0

    .line 18
    if-nez v0, :cond_70

    .line 19
    .line 20
    iget-boolean v1, p0, Lax/w1/f;->e:Z

    .line 21
    .line 22
    if-nez v1, :cond_70

    .line 23
    .line 24
    new-instance v0, Lax/S0/G;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-array v1, v1, [B

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lax/S0/G;-><init>([B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p1, v1, p3, v2}, Lax/S0/G;->q([BII)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lax/q1/d;->b(Lax/S0/G;)Lax/q1/d;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget v0, p1, Lax/q1/d;->b:I

    .line 51
    .line 52
    iput v0, p0, Lax/w1/f;->d:I

    .line 53
    .line 54
    new-instance v0, Lax/P0/v$b;

    .line 55
    .line 56
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "video/x-flv"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "video/avc"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p1, Lax/q1/d;->l:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget v1, p1, Lax/q1/d;->c:I

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget v1, p1, Lax/q1/d;->d:I

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v1, p1, Lax/q1/d;->k:F

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lax/P0/v$b;->u0(F)Lax/P0/v$b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object p1, p1, Lax/q1/d;->a:Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object v0, p0, Lax/w1/e;->a:Lax/q1/U;

    .line 106
    .line 107
    invoke-interface {v0, p1}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 108
    .line 109
    .line 110
    iput-boolean p2, p0, Lax/w1/f;->e:Z

    .line 111
    .line 112
    return p3

    .line 113
    :cond_70
    if-ne v0, p2, :cond_d2

    .line 114
    .line 115
    iget-boolean v0, p0, Lax/w1/f;->e:Z

    .line 116
    .line 117
    if-eqz v0, :cond_d2

    .line 118
    .line 119
    iget v0, p0, Lax/w1/f;->g:I

    .line 120
    .line 121
    if-ne v0, p2, :cond_7c

    .line 122
    .line 123
    const/4 v6, 0x1

    .line 124
    goto :goto_7d

    .line 125
    :cond_7c
    const/4 v6, 0x0

    .line 126
    :goto_7d
    iget-boolean v0, p0, Lax/w1/f;->f:Z

    .line 127
    .line 128
    if-nez v0, :cond_84

    .line 129
    .line 130
    if-nez v6, :cond_84

    .line 131
    .line 132
    return p3

    .line 133
    :cond_84
    iget-object v0, p0, Lax/w1/f;->c:Lax/S0/G;

    .line 134
    .line 135
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    aput-byte p3, v0, p3

    .line 140
    .line 141
    aput-byte p3, v0, p2

    .line 142
    .line 143
    const/4 v1, 0x2

    .line 144
    aput-byte p3, v0, v1

    .line 145
    .line 146
    iget v0, p0, Lax/w1/f;->d:I

    .line 147
    .line 148
    const/4 v1, 0x4

    .line 149
    rsub-int/lit8 v0, v0, 0x4

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    :goto_97
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-lez v2, :cond_c8

    .line 157
    .line 158
    iget-object v2, p0, Lax/w1/f;->c:Lax/S0/G;

    .line 159
    .line 160
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget v3, p0, Lax/w1/f;->d:I

    .line 165
    .line 166
    invoke-virtual {p1, v2, v0, v3}, Lax/S0/G;->q([BII)V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lax/w1/f;->c:Lax/S0/G;

    .line 170
    .line 171
    invoke-virtual {v2, p3}, Lax/S0/G;->b0(I)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lax/w1/f;->c:Lax/S0/G;

    .line 175
    .line 176
    invoke-virtual {v2}, Lax/S0/G;->Q()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iget-object v3, p0, Lax/w1/f;->b:Lax/S0/G;

    .line 181
    .line 182
    invoke-virtual {v3, p3}, Lax/S0/G;->b0(I)V

    .line 183
    .line 184
    .line 185
    iget-object v3, p0, Lax/w1/e;->a:Lax/q1/U;

    .line 186
    .line 187
    iget-object v8, p0, Lax/w1/f;->b:Lax/S0/G;

    .line 188
    .line 189
    invoke-interface {v3, v8, v1}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 190
    .line 191
    .line 192
    add-int/lit8 v7, v7, 0x4

    .line 193
    .line 194
    iget-object v3, p0, Lax/w1/e;->a:Lax/q1/U;

    .line 195
    .line 196
    invoke-interface {v3, p1, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 197
    .line 198
    .line 199
    add-int/2addr v7, v2

    .line 200
    goto :goto_97

    .line 201
    :cond_c8
    iget-object v3, p0, Lax/w1/e;->a:Lax/q1/U;

    .line 202
    .line 203
    const/4 v8, 0x0

    .line 204
    const/4 v9, 0x0

    .line 205
    invoke-interface/range {v3 .. v9}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 206
    .line 207
    .line 208
    iput-boolean p2, p0, Lax/w1/f;->f:Z

    .line 209
    .line 210
    return p2

    .line 211
    :cond_d2
    return p3
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
