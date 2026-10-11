.class public final Lax/X1/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/L;


# instance fields
.field private final a:Lax/X1/D;

.field private final b:Lax/S0/G;

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lax/X1/D;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/X1/E;->a:Lax/X1/D;

    .line 5
    .line 6
    new-instance p1, Lax/S0/G;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/X1/E;->b:Lax/S0/G;

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


# virtual methods
.method public a(Lax/S0/M;Lax/q1/t;Lax/X1/L$d;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/X1/E;->a:Lax/X1/D;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lax/X1/D;->a(Lax/S0/M;Lax/q1/t;Lax/X1/L$d;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lax/X1/E;->f:Z

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

.method public b()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/X1/E;->f:Z

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

.method public c(Lax/S0/G;I)V
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_7

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 p2, 0x0

    .line 9
    :goto_8
    const/4 v2, -0x1

    .line 10
    if-eqz p2, :cond_15

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    add-int/2addr v4, v3

    .line 21
    goto :goto_16

    .line 22
    :cond_15
    const/4 v4, -0x1

    .line 23
    :goto_16
    iget-boolean v3, p0, Lax/X1/E;->f:Z

    .line 24
    .line 25
    if-eqz v3, :cond_25

    .line 26
    .line 27
    if-nez p2, :cond_1e

    .line 28
    .line 29
    goto/16 :goto_107

    .line 30
    .line 31
    :cond_1e
    iput-boolean v1, p0, Lax/X1/E;->f:Z

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lax/S0/G;->b0(I)V

    .line 34
    .line 35
    .line 36
    iput v1, p0, Lax/X1/E;->d:I

    .line 37
    .line 38
    :cond_25
    :goto_25
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-lez p2, :cond_107

    .line 43
    .line 44
    iget p2, p0, Lax/X1/E;->d:I

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    if-ge p2, v3, :cond_b2

    .line 48
    .line 49
    if-nez p2, :cond_45

    .line 50
    .line 51
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    sub-int/2addr v4, v0

    .line 60
    invoke-virtual {p1, v4}, Lax/S0/G;->b0(I)V

    .line 61
    .line 62
    .line 63
    const/16 v4, 0xff

    .line 64
    .line 65
    if-ne p2, v4, :cond_45

    .line 66
    .line 67
    iput-boolean v0, p0, Lax/X1/E;->f:Z

    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iget v4, p0, Lax/X1/E;->d:I

    .line 75
    .line 76
    rsub-int/lit8 v4, v4, 0x3

    .line 77
    .line 78
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    iget-object v4, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 83
    .line 84
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget v5, p0, Lax/X1/E;->d:I

    .line 89
    .line 90
    invoke-virtual {p1, v4, v5, p2}, Lax/S0/G;->q([BII)V

    .line 91
    .line 92
    .line 93
    iget v4, p0, Lax/X1/E;->d:I

    .line 94
    .line 95
    add-int/2addr v4, p2

    .line 96
    iput v4, p0, Lax/X1/E;->d:I

    .line 97
    .line 98
    if-ne v4, v3, :cond_25

    .line 99
    .line 100
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 101
    .line 102
    invoke-virtual {p2, v1}, Lax/S0/G;->b0(I)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 106
    .line 107
    invoke-virtual {p2, v3}, Lax/S0/G;->a0(I)V

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 111
    .line 112
    invoke-virtual {p2, v0}, Lax/S0/G;->c0(I)V

    .line 113
    .line 114
    .line 115
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 116
    .line 117
    invoke-virtual {p2}, Lax/S0/G;->M()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object v4, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 122
    .line 123
    invoke-virtual {v4}, Lax/S0/G;->M()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    and-int/lit16 v5, p2, 0x80

    .line 128
    .line 129
    if-eqz v5, :cond_84

    .line 130
    .line 131
    const/4 v5, 0x1

    .line 132
    goto :goto_85

    .line 133
    :cond_84
    const/4 v5, 0x0

    .line 134
    :goto_85
    iput-boolean v5, p0, Lax/X1/E;->e:Z

    .line 135
    .line 136
    and-int/lit8 p2, p2, 0xf

    .line 137
    .line 138
    shl-int/lit8 p2, p2, 0x8

    .line 139
    .line 140
    or-int/2addr p2, v4

    .line 141
    add-int/2addr p2, v3

    .line 142
    iput p2, p0, Lax/X1/E;->c:I

    .line 143
    .line 144
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 145
    .line 146
    invoke-virtual {p2}, Lax/S0/G;->b()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    iget v3, p0, Lax/X1/E;->c:I

    .line 151
    .line 152
    if-ge p2, v3, :cond_25

    .line 153
    .line 154
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 155
    .line 156
    invoke-virtual {p2}, Lax/S0/G;->b()I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    mul-int/lit8 p2, p2, 0x2

    .line 161
    .line 162
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    const/16 v3, 0x1002

    .line 167
    .line 168
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    iget-object v3, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 173
    .line 174
    invoke-virtual {v3, p2}, Lax/S0/G;->d(I)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_25

    .line 178
    .line 179
    :cond_b2
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    iget v3, p0, Lax/X1/E;->c:I

    .line 184
    .line 185
    iget v4, p0, Lax/X1/E;->d:I

    .line 186
    .line 187
    sub-int/2addr v3, v4

    .line 188
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    iget-object v3, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 193
    .line 194
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iget v4, p0, Lax/X1/E;->d:I

    .line 199
    .line 200
    invoke-virtual {p1, v3, v4, p2}, Lax/S0/G;->q([BII)V

    .line 201
    .line 202
    .line 203
    iget v3, p0, Lax/X1/E;->d:I

    .line 204
    .line 205
    add-int/2addr v3, p2

    .line 206
    iput v3, p0, Lax/X1/E;->d:I

    .line 207
    .line 208
    iget p2, p0, Lax/X1/E;->c:I

    .line 209
    .line 210
    if-ne v3, p2, :cond_25

    .line 211
    .line 212
    iget-boolean v3, p0, Lax/X1/E;->e:Z

    .line 213
    .line 214
    if-eqz v3, :cond_f2

    .line 215
    .line 216
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 217
    .line 218
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    iget v3, p0, Lax/X1/E;->c:I

    .line 223
    .line 224
    invoke-static {p2, v1, v3, v2}, Lax/S0/d0;->x([BIII)I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_e8

    .line 229
    .line 230
    iput-boolean v0, p0, Lax/X1/E;->f:Z

    .line 231
    .line 232
    return-void

    .line 233
    :cond_e8
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 234
    .line 235
    iget v3, p0, Lax/X1/E;->c:I

    .line 236
    .line 237
    add-int/lit8 v3, v3, -0x4

    .line 238
    .line 239
    invoke-virtual {p2, v3}, Lax/S0/G;->a0(I)V

    .line 240
    .line 241
    .line 242
    goto :goto_f7

    .line 243
    :cond_f2
    iget-object v3, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 244
    .line 245
    invoke-virtual {v3, p2}, Lax/S0/G;->a0(I)V

    .line 246
    .line 247
    .line 248
    :goto_f7
    iget-object p2, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 249
    .line 250
    invoke-virtual {p2, v1}, Lax/S0/G;->b0(I)V

    .line 251
    .line 252
    .line 253
    iget-object p2, p0, Lax/X1/E;->a:Lax/X1/D;

    .line 254
    .line 255
    iget-object v3, p0, Lax/X1/E;->b:Lax/S0/G;

    .line 256
    .line 257
    invoke-interface {p2, v3}, Lax/X1/D;->c(Lax/S0/G;)V

    .line 258
    .line 259
    .line 260
    iput v1, p0, Lax/X1/E;->d:I

    .line 261
    .line 262
    goto/16 :goto_25

    .line 263
    .line 264
    :cond_107
    :goto_107
    return-void
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
