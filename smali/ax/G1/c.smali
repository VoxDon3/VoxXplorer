.class public final Lax/G1/c;
.super Lax/z1/c;
.source "SourceFile"


# instance fields
.field private final a:Lax/S0/G;

.field private final b:Lax/S0/F;

.field private c:Lax/S0/M;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/z1/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/S0/G;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 10
    .line 11
    new-instance v0, Lax/S0/F;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/S0/F;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method protected b(Lax/z1/b;Ljava/nio/ByteBuffer;)Lax/P0/C;
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lax/G1/c;->c:Lax/S0/M;

    .line 4
    .line 5
    if-eqz v2, :cond_10

    .line 6
    .line 7
    iget-wide v3, p1, Lax/z1/b;->k0:J

    .line 8
    .line 9
    invoke-virtual {v2}, Lax/S0/M;->f()J

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    cmp-long v2, v3, v5

    .line 14
    .line 15
    if-eqz v2, :cond_21

    .line 16
    .line 17
    :cond_10
    new-instance v2, Lax/S0/M;

    .line 18
    .line 19
    iget-wide v3, p1, Lax/V0/i;->g0:J

    .line 20
    .line 21
    invoke-direct {v2, v3, v4}, Lax/S0/M;-><init>(J)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lax/G1/c;->c:Lax/S0/M;

    .line 25
    .line 26
    iget-wide v3, p1, Lax/V0/i;->g0:J

    .line 27
    .line 28
    iget-wide v5, p1, Lax/z1/b;->k0:J

    .line 29
    .line 30
    sub-long/2addr v3, v5

    .line 31
    invoke-virtual {v2, v3, v4}, Lax/S0/M;->a(J)J

    .line 32
    .line 33
    .line 34
    :cond_21
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object v2, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 43
    .line 44
    invoke-virtual {v2, p1, p2}, Lax/S0/G;->Z([BI)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 48
    .line 49
    invoke-virtual {v2, p1, p2}, Lax/S0/F;->o([BI)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 53
    .line 54
    const/16 p2, 0x27

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lax/S0/F;->r(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lax/S0/F;->h(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    int-to-long p1, p1

    .line 66
    const/16 v2, 0x20

    .line 67
    .line 68
    shl-long/2addr p1, v2

    .line 69
    iget-object v3, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Lax/S0/F;->h(I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-long v2, v2

    .line 76
    or-long/2addr p1, v2

    .line 77
    iget-object v2, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 78
    .line 79
    const/16 v3, 0x14

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lax/S0/F;->r(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 85
    .line 86
    const/16 v3, 0xc

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lax/S0/F;->h(I)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v3, p0, Lax/G1/c;->b:Lax/S0/F;

    .line 93
    .line 94
    const/16 v4, 0x8

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Lax/S0/F;->h(I)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    iget-object v4, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 101
    .line 102
    const/16 v5, 0xe

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Lax/S0/G;->c0(I)V

    .line 105
    .line 106
    .line 107
    if-eqz v3, :cond_9b

    .line 108
    .line 109
    const/16 v4, 0xff

    .line 110
    .line 111
    if-eq v3, v4, :cond_94

    .line 112
    .line 113
    const/4 v2, 0x4

    .line 114
    if-eq v3, v2, :cond_8d

    .line 115
    .line 116
    const/4 v2, 0x5

    .line 117
    if-eq v3, v2, :cond_84

    .line 118
    .line 119
    const/4 v2, 0x6

    .line 120
    if-eq v3, v2, :cond_7b

    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    goto :goto_a0

    .line 124
    :cond_7b
    iget-object v2, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 125
    .line 126
    iget-object v3, p0, Lax/G1/c;->c:Lax/S0/M;

    .line 127
    .line 128
    invoke-static {v2, p1, p2, v3}, Lax/G1/g;->d(Lax/S0/G;JLax/S0/M;)Lax/G1/g;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    goto :goto_a0

    .line 133
    :cond_84
    iget-object v2, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 134
    .line 135
    iget-object v3, p0, Lax/G1/c;->c:Lax/S0/M;

    .line 136
    .line 137
    invoke-static {v2, p1, p2, v3}, Lax/G1/d;->d(Lax/S0/G;JLax/S0/M;)Lax/G1/d;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_a0

    .line 142
    :cond_8d
    iget-object p1, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 143
    .line 144
    invoke-static {p1}, Lax/G1/f;->d(Lax/S0/G;)Lax/G1/f;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_a0

    .line 149
    :cond_94
    iget-object v3, p0, Lax/G1/c;->a:Lax/S0/G;

    .line 150
    .line 151
    invoke-static {v3, v2, p1, p2}, Lax/G1/a;->d(Lax/S0/G;IJ)Lax/G1/a;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    goto :goto_a0

    .line 156
    :cond_9b
    new-instance p1, Lax/G1/e;

    .line 157
    .line 158
    invoke-direct {p1}, Lax/G1/e;-><init>()V

    .line 159
    .line 160
    .line 161
    :goto_a0
    if-nez p1, :cond_aa

    .line 162
    .line 163
    new-instance p1, Lax/P0/C;

    .line 164
    .line 165
    new-array p2, v0, [Lax/P0/C$a;

    .line 166
    .line 167
    invoke-direct {p1, p2}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_aa
    new-instance p2, Lax/P0/C;

    .line 172
    .line 173
    new-array v1, v1, [Lax/P0/C$a;

    .line 174
    .line 175
    aput-object p1, v1, v0

    .line 176
    .line 177
    invoke-direct {p2, v1}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 178
    .line 179
    .line 180
    return-object p2
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
