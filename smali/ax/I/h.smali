.class public Lax/I/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lax/I/b$a;

.field private static b:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/I/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/I/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/I/h;->a:Lax/I/b$a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lax/I/h;->b:I

    .line 10
    .line 11
    sput v0, Lax/I/h;->c:I

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
.end method

.method private static a(ILax/H/e;)Z
    .registers 9

    .line 1
    invoke-virtual {p1}, Lax/H/e;->A()Lax/H/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lax/H/e;->T()Lax/H/e$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lax/H/e;->K()Lax/H/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_15

    .line 14
    .line 15
    invoke-virtual {p1}, Lax/H/e;->K()Lax/H/e;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lax/H/f;

    .line 20
    .line 21
    goto :goto_16

    .line 22
    :cond_15
    const/4 v1, 0x0

    .line 23
    :goto_16
    if-eqz v1, :cond_1e

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/H/e;->A()Lax/H/e$b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Lax/H/e$b;->q:Lax/H/e$b;

    .line 30
    .line 31
    :cond_1e
    if-eqz v1, :cond_26

    .line 32
    .line 33
    invoke-virtual {v1}, Lax/H/e;->T()Lax/H/e$b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, Lax/H/e$b;->q:Lax/H/e$b;

    .line 38
    .line 39
    :cond_26
    sget-object v1, Lax/H/e$b;->q:Lax/H/e$b;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x1

    .line 44
    if-eq p0, v1, :cond_5e

    .line 45
    .line 46
    invoke-virtual {p1}, Lax/H/e;->n0()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_5e

    .line 51
    .line 52
    sget-object v5, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 53
    .line 54
    if-eq p0, v5, :cond_5e

    .line 55
    .line 56
    sget-object v5, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 57
    .line 58
    if-ne p0, v5, :cond_4b

    .line 59
    .line 60
    iget v6, p1, Lax/H/e;->w:I

    .line 61
    .line 62
    if-nez v6, :cond_4b

    .line 63
    .line 64
    iget v6, p1, Lax/H/e;->d0:F

    .line 65
    .line 66
    cmpl-float v6, v6, v2

    .line 67
    .line 68
    if-nez v6, :cond_4b

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Lax/H/e;->a0(I)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_5e

    .line 75
    .line 76
    :cond_4b
    if-ne p0, v5, :cond_5c

    .line 77
    .line 78
    iget p0, p1, Lax/H/e;->w:I

    .line 79
    .line 80
    if-ne p0, v4, :cond_5c

    .line 81
    .line 82
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-virtual {p1, v3, p0}, Lax/H/e;->d0(II)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_5c

    .line 91
    .line 92
    goto :goto_5e

    .line 93
    :cond_5c
    const/4 p0, 0x0

    .line 94
    goto :goto_5f

    .line 95
    :cond_5e
    :goto_5e
    const/4 p0, 0x1

    .line 96
    :goto_5f
    if-eq v0, v1, :cond_92

    .line 97
    .line 98
    invoke-virtual {p1}, Lax/H/e;->o0()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_92

    .line 103
    .line 104
    sget-object v1, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 105
    .line 106
    if-eq v0, v1, :cond_92

    .line 107
    .line 108
    sget-object v1, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 109
    .line 110
    if-ne v0, v1, :cond_7f

    .line 111
    .line 112
    iget v5, p1, Lax/H/e;->x:I

    .line 113
    .line 114
    if-nez v5, :cond_7f

    .line 115
    .line 116
    iget v5, p1, Lax/H/e;->d0:F

    .line 117
    .line 118
    cmpl-float v5, v5, v2

    .line 119
    .line 120
    if-nez v5, :cond_7f

    .line 121
    .line 122
    invoke-virtual {p1, v4}, Lax/H/e;->a0(I)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_92

    .line 127
    .line 128
    :cond_7f
    if-ne v0, v1, :cond_90

    .line 129
    .line 130
    iget v0, p1, Lax/H/e;->x:I

    .line 131
    .line 132
    if-ne v0, v4, :cond_90

    .line 133
    .line 134
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p1, v4, v0}, Lax/H/e;->d0(II)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_90

    .line 143
    .line 144
    goto :goto_92

    .line 145
    :cond_90
    const/4 v0, 0x0

    .line 146
    goto :goto_93

    .line 147
    :cond_92
    :goto_92
    const/4 v0, 0x1

    .line 148
    :goto_93
    iget p1, p1, Lax/H/e;->d0:F

    .line 149
    .line 150
    cmpl-float p1, p1, v2

    .line 151
    .line 152
    if-lez p1, :cond_9e

    .line 153
    .line 154
    if-nez p0, :cond_9d

    .line 155
    .line 156
    if-eqz v0, :cond_9e

    .line 157
    .line 158
    :cond_9d
    return v4

    .line 159
    :cond_9e
    if-eqz p0, :cond_a3

    .line 160
    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    return v4

    .line 164
    :cond_a3
    return v3
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

.method private static b(ILax/H/e;Lax/I/b$b;Z)V
    .registers 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/H/e;->g0()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    sget v3, Lax/I/h;->b:I

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    add-int/2addr v3, v4

    .line 18
    sput v3, Lax/I/h;->b:I

    .line 19
    .line 20
    instance-of v3, v0, Lax/H/f;

    .line 21
    .line 22
    if-nez v3, :cond_2f

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/H/e;->m0()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2f

    .line 29
    .line 30
    add-int/lit8 v3, p0, 0x1

    .line 31
    .line 32
    invoke-static {v3, v0}, Lax/I/h;->a(ILax/H/e;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_2f

    .line 37
    .line 38
    new-instance v5, Lax/I/b$a;

    .line 39
    .line 40
    invoke-direct {v5}, Lax/I/b$a;-><init>()V

    .line 41
    .line 42
    .line 43
    sget v6, Lax/I/b$a;->k:I

    .line 44
    .line 45
    invoke-static {v3, v0, v1, v5, v6}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 46
    .line 47
    .line 48
    :cond_2f
    sget-object v3, Lax/H/d$b;->c0:Lax/H/d$b;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lax/H/e;->o(Lax/H/d$b;)Lax/H/d;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v5, Lax/H/d$b;->e0:Lax/H/d$b;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Lax/H/e;->o(Lax/H/d$b;)Lax/H/d;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v3}, Lax/H/d;->e()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v5}, Lax/H/d;->e()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v3}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/16 v10, 0x8

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    if-eqz v8, :cond_138

    .line 76
    .line 77
    invoke-virtual {v3}, Lax/H/d;->n()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_138

    .line 82
    .line 83
    invoke-virtual {v3}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_5a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_138

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lax/H/d;

    .line 102
    .line 103
    iget-object v12, v8, Lax/H/d;->d:Lax/H/e;

    .line 104
    .line 105
    add-int/lit8 v13, p0, 0x1

    .line 106
    .line 107
    invoke-static {v13, v12}, Lax/I/h;->a(ILax/H/e;)Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    invoke-virtual {v12}, Lax/H/e;->m0()Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-eqz v15, :cond_83

    .line 116
    .line 117
    if-eqz v14, :cond_83

    .line 118
    .line 119
    new-instance v15, Lax/I/b$a;

    .line 120
    .line 121
    invoke-direct {v15}, Lax/I/b$a;-><init>()V

    .line 122
    .line 123
    .line 124
    const/16 v16, 0x1

    .line 125
    .line 126
    sget v4, Lax/I/b$a;->k:I

    .line 127
    .line 128
    invoke-static {v13, v12, v1, v15, v4}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 129
    .line 130
    .line 131
    goto :goto_85

    .line 132
    :cond_83
    const/16 v16, 0x1

    .line 133
    .line 134
    :goto_85
    iget-object v4, v12, Lax/H/e;->O:Lax/H/d;

    .line 135
    .line 136
    if-ne v8, v4, :cond_95

    .line 137
    .line 138
    iget-object v4, v12, Lax/H/e;->Q:Lax/H/d;

    .line 139
    .line 140
    iget-object v4, v4, Lax/H/d;->f:Lax/H/d;

    .line 141
    .line 142
    if-eqz v4, :cond_95

    .line 143
    .line 144
    invoke-virtual {v4}, Lax/H/d;->n()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-nez v4, :cond_a5

    .line 149
    .line 150
    :cond_95
    iget-object v4, v12, Lax/H/e;->Q:Lax/H/d;

    .line 151
    .line 152
    if-ne v8, v4, :cond_a7

    .line 153
    .line 154
    iget-object v4, v12, Lax/H/e;->O:Lax/H/d;

    .line 155
    .line 156
    iget-object v4, v4, Lax/H/d;->f:Lax/H/d;

    .line 157
    .line 158
    if-eqz v4, :cond_a7

    .line 159
    .line 160
    invoke-virtual {v4}, Lax/H/d;->n()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_a7

    .line 165
    .line 166
    :cond_a5
    const/4 v4, 0x1

    .line 167
    goto :goto_a8

    .line 168
    :cond_a7
    const/4 v4, 0x0

    .line 169
    :goto_a8
    invoke-virtual {v12}, Lax/H/e;->A()Lax/H/e$b;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    sget-object v9, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 176
    .line 177
    if-ne v15, v9, :cond_ed

    .line 178
    .line 179
    if-eqz v14, :cond_b5

    .line 180
    .line 181
    goto :goto_ed

    .line 182
    :cond_b5
    invoke-virtual {v12}, Lax/H/e;->A()Lax/H/e$b;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    if-ne v8, v9, :cond_f3

    .line 187
    .line 188
    iget v8, v12, Lax/H/e;->A:I

    .line 189
    .line 190
    if-ltz v8, :cond_f3

    .line 191
    .line 192
    iget v8, v12, Lax/H/e;->z:I

    .line 193
    .line 194
    if-ltz v8, :cond_f3

    .line 195
    .line 196
    invoke-virtual {v12}, Lax/H/e;->V()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-eq v8, v10, :cond_d5

    .line 201
    .line 202
    iget v8, v12, Lax/H/e;->w:I

    .line 203
    .line 204
    if-nez v8, :cond_f3

    .line 205
    .line 206
    invoke-virtual {v12}, Lax/H/e;->v()F

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    cmpl-float v8, v8, v17

    .line 211
    .line 212
    if-nez v8, :cond_f3

    .line 213
    .line 214
    :cond_d5
    invoke-virtual {v12}, Lax/H/e;->i0()Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-nez v8, :cond_f3

    .line 219
    .line 220
    invoke-virtual {v12}, Lax/H/e;->l0()Z

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-nez v8, :cond_f3

    .line 225
    .line 226
    if-eqz v4, :cond_f3

    .line 227
    .line 228
    invoke-virtual {v12}, Lax/H/e;->i0()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-nez v4, :cond_f3

    .line 233
    .line 234
    invoke-static {v13, v0, v1, v12, v2}, Lax/I/h;->e(ILax/H/e;Lax/I/b$b;Lax/H/e;Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_f3

    .line 238
    :cond_ed
    :goto_ed
    invoke-virtual {v12}, Lax/H/e;->m0()Z

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    if-eqz v9, :cond_f6

    .line 243
    .line 244
    :cond_f3
    :goto_f3
    const/4 v4, 0x1

    .line 245
    goto/16 :goto_5a

    .line 246
    .line 247
    :cond_f6
    iget-object v9, v12, Lax/H/e;->O:Lax/H/d;

    .line 248
    .line 249
    if-ne v8, v9, :cond_111

    .line 250
    .line 251
    iget-object v14, v12, Lax/H/e;->Q:Lax/H/d;

    .line 252
    .line 253
    iget-object v14, v14, Lax/H/d;->f:Lax/H/d;

    .line 254
    .line 255
    if-nez v14, :cond_111

    .line 256
    .line 257
    invoke-virtual {v9}, Lax/H/d;->f()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    add-int/2addr v4, v6

    .line 262
    invoke-virtual {v12}, Lax/H/e;->W()I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    add-int/2addr v8, v4

    .line 267
    invoke-virtual {v12, v4, v8}, Lax/H/e;->F0(II)V

    .line 268
    .line 269
    .line 270
    invoke-static {v13, v12, v1, v2}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_f3

    .line 274
    :cond_111
    iget-object v14, v12, Lax/H/e;->Q:Lax/H/d;

    .line 275
    .line 276
    if-ne v8, v14, :cond_12c

    .line 277
    .line 278
    iget-object v8, v9, Lax/H/d;->f:Lax/H/d;

    .line 279
    .line 280
    if-nez v8, :cond_12c

    .line 281
    .line 282
    invoke-virtual {v14}, Lax/H/d;->f()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    sub-int v4, v6, v4

    .line 287
    .line 288
    invoke-virtual {v12}, Lax/H/e;->W()I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    sub-int v8, v4, v8

    .line 293
    .line 294
    invoke-virtual {v12, v8, v4}, Lax/H/e;->F0(II)V

    .line 295
    .line 296
    .line 297
    invoke-static {v13, v12, v1, v2}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 298
    .line 299
    .line 300
    goto :goto_f3

    .line 301
    :cond_12c
    if-eqz v4, :cond_f3

    .line 302
    .line 303
    invoke-virtual {v12}, Lax/H/e;->i0()Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-nez v4, :cond_f3

    .line 308
    .line 309
    invoke-static {v13, v1, v12, v2}, Lax/I/h;->d(ILax/I/b$b;Lax/H/e;Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_f3

    .line 313
    :cond_138
    const/16 v16, 0x1

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    instance-of v3, v0, Lax/H/h;

    .line 318
    .line 319
    if-eqz v3, :cond_141

    .line 320
    .line 321
    return-void

    .line 322
    :cond_141
    invoke-virtual {v5}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    if-eqz v3, :cond_22f

    .line 327
    .line 328
    invoke-virtual {v5}, Lax/H/d;->n()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_22f

    .line 333
    .line 334
    invoke-virtual {v5}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    :cond_155
    :goto_155
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_22f

    .line 347
    .line 348
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    check-cast v4, Lax/H/d;

    .line 353
    .line 354
    iget-object v5, v4, Lax/H/d;->d:Lax/H/e;

    .line 355
    .line 356
    add-int/lit8 v6, p0, 0x1

    .line 357
    .line 358
    invoke-static {v6, v5}, Lax/I/h;->a(ILax/H/e;)Z

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    invoke-virtual {v5}, Lax/H/e;->m0()Z

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    if-eqz v9, :cond_17b

    .line 367
    .line 368
    if-eqz v8, :cond_17b

    .line 369
    .line 370
    new-instance v9, Lax/I/b$a;

    .line 371
    .line 372
    invoke-direct {v9}, Lax/I/b$a;-><init>()V

    .line 373
    .line 374
    .line 375
    sget v12, Lax/I/b$a;->k:I

    .line 376
    .line 377
    invoke-static {v6, v5, v1, v9, v12}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 378
    .line 379
    .line 380
    :cond_17b
    iget-object v9, v5, Lax/H/e;->O:Lax/H/d;

    .line 381
    .line 382
    if-ne v4, v9, :cond_18b

    .line 383
    .line 384
    iget-object v9, v5, Lax/H/e;->Q:Lax/H/d;

    .line 385
    .line 386
    iget-object v9, v9, Lax/H/d;->f:Lax/H/d;

    .line 387
    .line 388
    if-eqz v9, :cond_18b

    .line 389
    .line 390
    invoke-virtual {v9}, Lax/H/d;->n()Z

    .line 391
    .line 392
    .line 393
    move-result v9

    .line 394
    if-nez v9, :cond_19b

    .line 395
    .line 396
    :cond_18b
    iget-object v9, v5, Lax/H/e;->Q:Lax/H/d;

    .line 397
    .line 398
    if-ne v4, v9, :cond_19d

    .line 399
    .line 400
    iget-object v9, v5, Lax/H/e;->O:Lax/H/d;

    .line 401
    .line 402
    iget-object v9, v9, Lax/H/d;->f:Lax/H/d;

    .line 403
    .line 404
    if-eqz v9, :cond_19d

    .line 405
    .line 406
    invoke-virtual {v9}, Lax/H/d;->n()Z

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    if-eqz v9, :cond_19d

    .line 411
    .line 412
    :cond_19b
    const/4 v9, 0x1

    .line 413
    goto :goto_19e

    .line 414
    :cond_19d
    const/4 v9, 0x0

    .line 415
    :goto_19e
    invoke-virtual {v5}, Lax/H/e;->A()Lax/H/e$b;

    .line 416
    .line 417
    .line 418
    move-result-object v12

    .line 419
    sget-object v13, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 420
    .line 421
    if-ne v12, v13, :cond_1e2

    .line 422
    .line 423
    if-eqz v8, :cond_1a9

    .line 424
    .line 425
    goto :goto_1e2

    .line 426
    :cond_1a9
    invoke-virtual {v5}, Lax/H/e;->A()Lax/H/e$b;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    if-ne v4, v13, :cond_155

    .line 431
    .line 432
    iget v4, v5, Lax/H/e;->A:I

    .line 433
    .line 434
    if-ltz v4, :cond_155

    .line 435
    .line 436
    iget v4, v5, Lax/H/e;->z:I

    .line 437
    .line 438
    if-ltz v4, :cond_155

    .line 439
    .line 440
    invoke-virtual {v5}, Lax/H/e;->V()I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    if-eq v4, v10, :cond_1c9

    .line 445
    .line 446
    iget v4, v5, Lax/H/e;->w:I

    .line 447
    .line 448
    if-nez v4, :cond_155

    .line 449
    .line 450
    invoke-virtual {v5}, Lax/H/e;->v()F

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    cmpl-float v4, v4, v17

    .line 455
    .line 456
    if-nez v4, :cond_155

    .line 457
    .line 458
    :cond_1c9
    invoke-virtual {v5}, Lax/H/e;->i0()Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_155

    .line 463
    .line 464
    invoke-virtual {v5}, Lax/H/e;->l0()Z

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    if-nez v4, :cond_155

    .line 469
    .line 470
    if-eqz v9, :cond_155

    .line 471
    .line 472
    invoke-virtual {v5}, Lax/H/e;->i0()Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-nez v4, :cond_155

    .line 477
    .line 478
    invoke-static {v6, v0, v1, v5, v2}, Lax/I/h;->e(ILax/H/e;Lax/I/b$b;Lax/H/e;Z)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_155

    .line 482
    .line 483
    :cond_1e2
    :goto_1e2
    invoke-virtual {v5}, Lax/H/e;->m0()Z

    .line 484
    .line 485
    .line 486
    move-result v8

    .line 487
    if-eqz v8, :cond_1ea

    .line 488
    .line 489
    goto/16 :goto_155

    .line 490
    .line 491
    :cond_1ea
    iget-object v8, v5, Lax/H/e;->O:Lax/H/d;

    .line 492
    .line 493
    if-ne v4, v8, :cond_206

    .line 494
    .line 495
    iget-object v12, v5, Lax/H/e;->Q:Lax/H/d;

    .line 496
    .line 497
    iget-object v12, v12, Lax/H/d;->f:Lax/H/d;

    .line 498
    .line 499
    if-nez v12, :cond_206

    .line 500
    .line 501
    invoke-virtual {v8}, Lax/H/d;->f()I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    add-int/2addr v4, v7

    .line 506
    invoke-virtual {v5}, Lax/H/e;->W()I

    .line 507
    .line 508
    .line 509
    move-result v8

    .line 510
    add-int/2addr v8, v4

    .line 511
    invoke-virtual {v5, v4, v8}, Lax/H/e;->F0(II)V

    .line 512
    .line 513
    .line 514
    invoke-static {v6, v5, v1, v2}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_155

    .line 518
    .line 519
    :cond_206
    iget-object v12, v5, Lax/H/e;->Q:Lax/H/d;

    .line 520
    .line 521
    if-ne v4, v12, :cond_222

    .line 522
    .line 523
    iget-object v4, v8, Lax/H/d;->f:Lax/H/d;

    .line 524
    .line 525
    if-nez v4, :cond_222

    .line 526
    .line 527
    invoke-virtual {v12}, Lax/H/d;->f()I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    sub-int v4, v7, v4

    .line 532
    .line 533
    invoke-virtual {v5}, Lax/H/e;->W()I

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    sub-int v8, v4, v8

    .line 538
    .line 539
    invoke-virtual {v5, v8, v4}, Lax/H/e;->F0(II)V

    .line 540
    .line 541
    .line 542
    invoke-static {v6, v5, v1, v2}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_155

    .line 546
    .line 547
    :cond_222
    if-eqz v9, :cond_155

    .line 548
    .line 549
    invoke-virtual {v5}, Lax/H/e;->i0()Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    if-nez v4, :cond_155

    .line 554
    .line 555
    invoke-static {v6, v1, v5, v2}, Lax/I/h;->d(ILax/I/b$b;Lax/H/e;Z)V

    .line 556
    .line 557
    .line 558
    goto/16 :goto_155

    .line 559
    .line 560
    :cond_22f
    invoke-virtual {v0}, Lax/H/e;->q0()V

    .line 561
    .line 562
    .line 563
    return-void
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method private static c(ILax/H/a;Lax/I/b$b;IZ)V
    .registers 6

    .line 1
    invoke-virtual {p1}, Lax/H/a;->t1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_13

    .line 6
    .line 7
    if-nez p3, :cond_e

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    invoke-static {p0, p1, p2, p4}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    add-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
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
.end method

.method private static d(ILax/I/b$b;Lax/H/e;Z)V
    .registers 10

    .line 1
    invoke-virtual {p2}, Lax/H/e;->y()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Lax/H/e;->O:Lax/H/d;

    .line 6
    .line 7
    iget-object v1, v1, Lax/H/d;->f:Lax/H/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/H/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p2, Lax/H/e;->Q:Lax/H/d;

    .line 14
    .line 15
    iget-object v2, v2, Lax/H/d;->f:Lax/H/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p2, Lax/H/e;->O:Lax/H/d;

    .line 22
    .line 23
    invoke-virtual {v3}, Lax/H/d;->f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    iget-object v4, p2, Lax/H/e;->Q:Lax/H/d;

    .line 29
    .line 30
    invoke-virtual {v4}, Lax/H/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    const/high16 v5, 0x3f000000    # 0.5f

    .line 37
    .line 38
    if-ne v1, v2, :cond_2a

    .line 39
    .line 40
    const/high16 v0, 0x3f000000    # 0.5f

    .line 41
    .line 42
    goto :goto_2c

    .line 43
    :cond_2a
    move v1, v3

    .line 44
    move v2, v4

    .line 45
    :goto_2c
    invoke-virtual {p2}, Lax/H/e;->W()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-int v4, v2, v1

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    if-le v1, v2, :cond_38

    .line 53
    .line 54
    sub-int v4, v1, v2

    .line 55
    .line 56
    sub-int/2addr v4, v3

    .line 57
    :cond_38
    if-lez v4, :cond_40

    .line 58
    .line 59
    int-to-float v4, v4

    .line 60
    mul-float v0, v0, v4

    .line 61
    .line 62
    add-float/2addr v0, v5

    .line 63
    :goto_3e
    float-to-int v0, v0

    .line 64
    goto :goto_44

    .line 65
    :cond_40
    int-to-float v4, v4

    .line 66
    mul-float v0, v0, v4

    .line 67
    .line 68
    goto :goto_3e

    .line 69
    :goto_44
    add-int/2addr v0, v1

    .line 70
    add-int v4, v0, v3

    .line 71
    .line 72
    if-le v1, v2, :cond_4b

    .line 73
    .line 74
    sub-int v4, v0, v3

    .line 75
    .line 76
    :cond_4b
    invoke-virtual {p2, v0, v4}, Lax/H/e;->F0(II)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p0, p0, 0x1

    .line 80
    .line 81
    invoke-static {p0, p2, p1, p3}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 82
    .line 83
    .line 84
    return-void
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

.method private static e(ILax/H/e;Lax/I/b$b;Lax/H/e;Z)V
    .registers 12

    .line 1
    invoke-virtual {p3}, Lax/H/e;->y()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p3, Lax/H/e;->O:Lax/H/d;

    .line 6
    .line 7
    iget-object v1, v1, Lax/H/d;->f:Lax/H/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/H/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p3, Lax/H/e;->O:Lax/H/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Lax/H/d;->f()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    iget-object v2, p3, Lax/H/e;->Q:Lax/H/d;

    .line 21
    .line 22
    iget-object v2, v2, Lax/H/d;->f:Lax/H/d;

    .line 23
    .line 24
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p3, Lax/H/e;->Q:Lax/H/d;

    .line 29
    .line 30
    invoke-virtual {v3}, Lax/H/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    if-lt v2, v1, :cond_76

    .line 36
    .line 37
    invoke-virtual {p3}, Lax/H/e;->W()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p3}, Lax/H/e;->V()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/high16 v6, 0x3f000000    # 0.5f

    .line 48
    .line 49
    if-eq v4, v5, :cond_65

    .line 50
    .line 51
    iget v4, p3, Lax/H/e;->w:I

    .line 52
    .line 53
    const/4 v5, 0x2

    .line 54
    if-ne v4, v5, :cond_53

    .line 55
    .line 56
    instance-of v3, p1, Lax/H/f;

    .line 57
    .line 58
    if-eqz v3, :cond_40

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_48

    .line 65
    :cond_40
    invoke-virtual {p1}, Lax/H/e;->K()Lax/H/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_48
    invoke-virtual {p3}, Lax/H/e;->y()F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    mul-float v3, v3, v6

    .line 78
    .line 79
    int-to-float p1, p1

    .line 80
    mul-float v3, v3, p1

    .line 81
    .line 82
    float-to-int v3, v3

    .line 83
    goto :goto_57

    .line 84
    :cond_53
    if-nez v4, :cond_57

    .line 85
    .line 86
    sub-int v3, v2, v1

    .line 87
    .line 88
    :cond_57
    :goto_57
    iget p1, p3, Lax/H/e;->z:I

    .line 89
    .line 90
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget p1, p3, Lax/H/e;->A:I

    .line 95
    .line 96
    if-lez p1, :cond_65

    .line 97
    .line 98
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    :cond_65
    sub-int/2addr v2, v1

    .line 103
    sub-int/2addr v2, v3

    .line 104
    int-to-float p1, v2

    .line 105
    mul-float v0, v0, p1

    .line 106
    .line 107
    add-float/2addr v0, v6

    .line 108
    float-to-int p1, v0

    .line 109
    add-int/2addr v1, p1

    .line 110
    add-int/2addr v3, v1

    .line 111
    invoke-virtual {p3, v1, v3}, Lax/H/e;->F0(II)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 p0, p0, 0x1

    .line 115
    .line 116
    invoke-static {p0, p3, p2, p4}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 117
    .line 118
    .line 119
    :cond_76
    return-void
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
.end method

.method private static f(ILax/I/b$b;Lax/H/e;)V
    .registers 9

    .line 1
    invoke-virtual {p2}, Lax/H/e;->R()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Lax/H/e;->P:Lax/H/d;

    .line 6
    .line 7
    iget-object v1, v1, Lax/H/d;->f:Lax/H/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/H/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p2, Lax/H/e;->R:Lax/H/d;

    .line 14
    .line 15
    iget-object v2, v2, Lax/H/d;->f:Lax/H/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p2, Lax/H/e;->P:Lax/H/d;

    .line 22
    .line 23
    invoke-virtual {v3}, Lax/H/d;->f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    iget-object v4, p2, Lax/H/e;->R:Lax/H/d;

    .line 29
    .line 30
    invoke-virtual {v4}, Lax/H/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    const/high16 v5, 0x3f000000    # 0.5f

    .line 37
    .line 38
    if-ne v1, v2, :cond_2a

    .line 39
    .line 40
    const/high16 v0, 0x3f000000    # 0.5f

    .line 41
    .line 42
    goto :goto_2c

    .line 43
    :cond_2a
    move v1, v3

    .line 44
    move v2, v4

    .line 45
    :goto_2c
    invoke-virtual {p2}, Lax/H/e;->x()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-int v4, v2, v1

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    if-le v1, v2, :cond_38

    .line 53
    .line 54
    sub-int v4, v1, v2

    .line 55
    .line 56
    sub-int/2addr v4, v3

    .line 57
    :cond_38
    if-lez v4, :cond_40

    .line 58
    .line 59
    int-to-float v4, v4

    .line 60
    mul-float v0, v0, v4

    .line 61
    .line 62
    add-float/2addr v0, v5

    .line 63
    :goto_3e
    float-to-int v0, v0

    .line 64
    goto :goto_44

    .line 65
    :cond_40
    int-to-float v4, v4

    .line 66
    mul-float v0, v0, v4

    .line 67
    .line 68
    goto :goto_3e

    .line 69
    :goto_44
    add-int v4, v1, v0

    .line 70
    .line 71
    add-int v5, v4, v3

    .line 72
    .line 73
    if-le v1, v2, :cond_4e

    .line 74
    .line 75
    sub-int v4, v1, v0

    .line 76
    .line 77
    sub-int v5, v4, v3

    .line 78
    .line 79
    :cond_4e
    invoke-virtual {p2, v4, v5}, Lax/H/e;->I0(II)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 p0, p0, 0x1

    .line 83
    .line 84
    invoke-static {p0, p2, p1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 85
    .line 86
    .line 87
    return-void
    .line 88
.end method

.method private static g(ILax/H/e;Lax/I/b$b;Lax/H/e;)V
    .registers 11

    .line 1
    invoke-virtual {p3}, Lax/H/e;->R()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p3, Lax/H/e;->P:Lax/H/d;

    .line 6
    .line 7
    iget-object v1, v1, Lax/H/d;->f:Lax/H/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/H/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p3, Lax/H/e;->P:Lax/H/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Lax/H/d;->f()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    iget-object v2, p3, Lax/H/e;->R:Lax/H/d;

    .line 21
    .line 22
    iget-object v2, v2, Lax/H/d;->f:Lax/H/d;

    .line 23
    .line 24
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p3, Lax/H/e;->R:Lax/H/d;

    .line 29
    .line 30
    invoke-virtual {v3}, Lax/H/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    if-lt v2, v1, :cond_72

    .line 36
    .line 37
    invoke-virtual {p3}, Lax/H/e;->x()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p3}, Lax/H/e;->V()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/high16 v6, 0x3f000000    # 0.5f

    .line 48
    .line 49
    if-eq v4, v5, :cond_61

    .line 50
    .line 51
    iget v4, p3, Lax/H/e;->x:I

    .line 52
    .line 53
    const/4 v5, 0x2

    .line 54
    if-ne v4, v5, :cond_4f

    .line 55
    .line 56
    instance-of v3, p1, Lax/H/f;

    .line 57
    .line 58
    if-eqz v3, :cond_40

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_48

    .line 65
    :cond_40
    invoke-virtual {p1}, Lax/H/e;->K()Lax/H/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_48
    mul-float v3, v0, v6

    .line 74
    .line 75
    int-to-float p1, p1

    .line 76
    mul-float v3, v3, p1

    .line 77
    .line 78
    float-to-int v3, v3

    .line 79
    goto :goto_53

    .line 80
    :cond_4f
    if-nez v4, :cond_53

    .line 81
    .line 82
    sub-int v3, v2, v1

    .line 83
    .line 84
    :cond_53
    :goto_53
    iget p1, p3, Lax/H/e;->C:I

    .line 85
    .line 86
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iget p1, p3, Lax/H/e;->D:I

    .line 91
    .line 92
    if-lez p1, :cond_61

    .line 93
    .line 94
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    :cond_61
    sub-int/2addr v2, v1

    .line 99
    sub-int/2addr v2, v3

    .line 100
    int-to-float p1, v2

    .line 101
    mul-float v0, v0, p1

    .line 102
    .line 103
    add-float/2addr v0, v6

    .line 104
    float-to-int p1, v0

    .line 105
    add-int/2addr v1, p1

    .line 106
    add-int/2addr v3, v1

    .line 107
    invoke-virtual {p3, v1, v3}, Lax/H/e;->I0(II)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 p0, p0, 0x1

    .line 111
    .line 112
    invoke-static {p0, p3, p2}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 113
    .line 114
    .line 115
    :cond_72
    return-void
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

.method public static h(Lax/H/f;Lax/I/b$b;)V
    .registers 15

    .line 1
    invoke-virtual {p0}, Lax/H/e;->A()Lax/H/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/H/e;->T()Lax/H/e$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    sput v2, Lax/I/h;->b:I

    .line 11
    .line 12
    sput v2, Lax/I/h;->c:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/H/e;->v0()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/H/m;->r1()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    :goto_19
    if-ge v5, v4, :cond_27

    .line 27
    .line 28
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Lax/H/e;

    .line 33
    .line 34
    invoke-virtual {v6}, Lax/H/e;->v0()V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    goto :goto_19

    .line 40
    :cond_27
    invoke-virtual {p0}, Lax/H/f;->P1()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 45
    .line 46
    if-ne v0, v6, :cond_37

    .line 47
    .line 48
    invoke-virtual {p0}, Lax/H/e;->W()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0, v2, v0}, Lax/H/e;->F0(II)V

    .line 53
    .line 54
    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    invoke-virtual {p0, v2}, Lax/H/e;->G0(I)V

    .line 57
    .line 58
    .line 59
    :goto_3a
    const/4 v0, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    :goto_3d
    const/high16 v8, 0x3f000000    # 0.5f

    .line 63
    .line 64
    const/4 v9, -0x1

    .line 65
    const/4 v10, 0x1

    .line 66
    if-ge v0, v4, :cond_a4

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    check-cast v11, Lax/H/e;

    .line 73
    .line 74
    instance-of v12, v11, Lax/H/h;

    .line 75
    .line 76
    if-eqz v12, :cond_94

    .line 77
    .line 78
    check-cast v11, Lax/H/h;

    .line 79
    .line 80
    invoke-virtual {v11}, Lax/H/h;->s1()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-ne v12, v10, :cond_a1

    .line 85
    .line 86
    invoke-virtual {v11}, Lax/H/h;->t1()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eq v6, v9, :cond_63

    .line 91
    .line 92
    invoke-virtual {v11}, Lax/H/h;->t1()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {v11, v6}, Lax/H/h;->w1(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_92

    .line 100
    :cond_63
    invoke-virtual {v11}, Lax/H/h;->u1()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eq v6, v9, :cond_7c

    .line 105
    .line 106
    invoke-virtual {p0}, Lax/H/e;->n0()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_7c

    .line 111
    .line 112
    invoke-virtual {p0}, Lax/H/e;->W()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v11}, Lax/H/h;->u1()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    sub-int/2addr v6, v8

    .line 121
    invoke-virtual {v11, v6}, Lax/H/h;->w1(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_92

    .line 125
    :cond_7c
    invoke-virtual {p0}, Lax/H/e;->n0()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_92

    .line 130
    .line 131
    invoke-virtual {v11}, Lax/H/h;->v1()F

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-virtual {p0}, Lax/H/e;->W()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    int-to-float v9, v9

    .line 140
    mul-float v6, v6, v9

    .line 141
    .line 142
    add-float/2addr v6, v8

    .line 143
    float-to-int v6, v6

    .line 144
    invoke-virtual {v11, v6}, Lax/H/h;->w1(I)V

    .line 145
    .line 146
    .line 147
    :cond_92
    :goto_92
    const/4 v6, 0x1

    .line 148
    goto :goto_a1

    .line 149
    :cond_94
    instance-of v8, v11, Lax/H/a;

    .line 150
    .line 151
    if-eqz v8, :cond_a1

    .line 152
    .line 153
    check-cast v11, Lax/H/a;

    .line 154
    .line 155
    invoke-virtual {v11}, Lax/H/a;->x1()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-nez v8, :cond_a1

    .line 160
    .line 161
    const/4 v7, 0x1

    .line 162
    :cond_a1
    :goto_a1
    add-int/lit8 v0, v0, 0x1

    .line 163
    .line 164
    goto :goto_3d

    .line 165
    :cond_a4
    if-eqz v6, :cond_c1

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    :goto_a7
    if-ge v0, v4, :cond_c1

    .line 169
    .line 170
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, Lax/H/e;

    .line 175
    .line 176
    instance-of v11, v6, Lax/H/h;

    .line 177
    .line 178
    if-eqz v11, :cond_be

    .line 179
    .line 180
    check-cast v6, Lax/H/h;

    .line 181
    .line 182
    invoke-virtual {v6}, Lax/H/h;->s1()I

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-ne v11, v10, :cond_be

    .line 187
    .line 188
    invoke-static {v2, v6, p1, v5}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 189
    .line 190
    .line 191
    :cond_be
    add-int/lit8 v0, v0, 0x1

    .line 192
    .line 193
    goto :goto_a7

    .line 194
    :cond_c1
    invoke-static {v2, p0, p1, v5}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 195
    .line 196
    .line 197
    if-eqz v7, :cond_e1

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    :goto_c7
    if-ge v0, v4, :cond_e1

    .line 201
    .line 202
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Lax/H/e;

    .line 207
    .line 208
    instance-of v7, v6, Lax/H/a;

    .line 209
    .line 210
    if-eqz v7, :cond_de

    .line 211
    .line 212
    check-cast v6, Lax/H/a;

    .line 213
    .line 214
    invoke-virtual {v6}, Lax/H/a;->x1()I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-nez v7, :cond_de

    .line 219
    .line 220
    invoke-static {v2, v6, p1, v2, v5}, Lax/I/h;->c(ILax/H/a;Lax/I/b$b;IZ)V

    .line 221
    .line 222
    .line 223
    :cond_de
    add-int/lit8 v0, v0, 0x1

    .line 224
    .line 225
    goto :goto_c7

    .line 226
    :cond_e1
    sget-object v0, Lax/H/e$b;->q:Lax/H/e$b;

    .line 227
    .line 228
    if-ne v1, v0, :cond_ed

    .line 229
    .line 230
    invoke-virtual {p0}, Lax/H/e;->x()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {p0, v2, v0}, Lax/H/e;->I0(II)V

    .line 235
    .line 236
    .line 237
    goto :goto_f0

    .line 238
    :cond_ed
    invoke-virtual {p0, v2}, Lax/H/e;->H0(I)V

    .line 239
    .line 240
    .line 241
    :goto_f0
    const/4 v0, 0x0

    .line 242
    const/4 v1, 0x0

    .line 243
    const/4 v6, 0x0

    .line 244
    :goto_f3
    if-ge v0, v4, :cond_156

    .line 245
    .line 246
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    check-cast v7, Lax/H/e;

    .line 251
    .line 252
    instance-of v11, v7, Lax/H/h;

    .line 253
    .line 254
    if-eqz v11, :cond_146

    .line 255
    .line 256
    check-cast v7, Lax/H/h;

    .line 257
    .line 258
    invoke-virtual {v7}, Lax/H/h;->s1()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    if-nez v11, :cond_153

    .line 263
    .line 264
    invoke-virtual {v7}, Lax/H/h;->t1()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eq v1, v9, :cond_115

    .line 269
    .line 270
    invoke-virtual {v7}, Lax/H/h;->t1()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-virtual {v7, v1}, Lax/H/h;->w1(I)V

    .line 275
    .line 276
    .line 277
    goto :goto_144

    .line 278
    :cond_115
    invoke-virtual {v7}, Lax/H/h;->u1()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eq v1, v9, :cond_12e

    .line 283
    .line 284
    invoke-virtual {p0}, Lax/H/e;->o0()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_12e

    .line 289
    .line 290
    invoke-virtual {p0}, Lax/H/e;->x()I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-virtual {v7}, Lax/H/h;->u1()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    sub-int/2addr v1, v11

    .line 299
    invoke-virtual {v7, v1}, Lax/H/h;->w1(I)V

    .line 300
    .line 301
    .line 302
    goto :goto_144

    .line 303
    :cond_12e
    invoke-virtual {p0}, Lax/H/e;->o0()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_144

    .line 308
    .line 309
    invoke-virtual {v7}, Lax/H/h;->v1()F

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-virtual {p0}, Lax/H/e;->x()I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    int-to-float v11, v11

    .line 318
    mul-float v1, v1, v11

    .line 319
    .line 320
    add-float/2addr v1, v8

    .line 321
    float-to-int v1, v1

    .line 322
    invoke-virtual {v7, v1}, Lax/H/h;->w1(I)V

    .line 323
    .line 324
    .line 325
    :cond_144
    :goto_144
    const/4 v1, 0x1

    .line 326
    goto :goto_153

    .line 327
    :cond_146
    instance-of v11, v7, Lax/H/a;

    .line 328
    .line 329
    if-eqz v11, :cond_153

    .line 330
    .line 331
    check-cast v7, Lax/H/a;

    .line 332
    .line 333
    invoke-virtual {v7}, Lax/H/a;->x1()I

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-ne v7, v10, :cond_153

    .line 338
    .line 339
    const/4 v6, 0x1

    .line 340
    :cond_153
    :goto_153
    add-int/lit8 v0, v0, 0x1

    .line 341
    .line 342
    goto :goto_f3

    .line 343
    :cond_156
    if-eqz v1, :cond_173

    .line 344
    .line 345
    const/4 v0, 0x0

    .line 346
    :goto_159
    if-ge v0, v4, :cond_173

    .line 347
    .line 348
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, Lax/H/e;

    .line 353
    .line 354
    instance-of v7, v1, Lax/H/h;

    .line 355
    .line 356
    if-eqz v7, :cond_170

    .line 357
    .line 358
    check-cast v1, Lax/H/h;

    .line 359
    .line 360
    invoke-virtual {v1}, Lax/H/h;->s1()I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    if-nez v7, :cond_170

    .line 365
    .line 366
    invoke-static {v10, v1, p1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 367
    .line 368
    .line 369
    :cond_170
    add-int/lit8 v0, v0, 0x1

    .line 370
    .line 371
    goto :goto_159

    .line 372
    :cond_173
    invoke-static {v2, p0, p1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 373
    .line 374
    .line 375
    if-eqz v6, :cond_193

    .line 376
    .line 377
    const/4 p0, 0x0

    .line 378
    :goto_179
    if-ge p0, v4, :cond_193

    .line 379
    .line 380
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    check-cast v0, Lax/H/e;

    .line 385
    .line 386
    instance-of v1, v0, Lax/H/a;

    .line 387
    .line 388
    if-eqz v1, :cond_190

    .line 389
    .line 390
    check-cast v0, Lax/H/a;

    .line 391
    .line 392
    invoke-virtual {v0}, Lax/H/a;->x1()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-ne v1, v10, :cond_190

    .line 397
    .line 398
    invoke-static {v2, v0, p1, v10, v5}, Lax/I/h;->c(ILax/H/a;Lax/I/b$b;IZ)V

    .line 399
    .line 400
    .line 401
    :cond_190
    add-int/lit8 p0, p0, 0x1

    .line 402
    .line 403
    goto :goto_179

    .line 404
    :cond_193
    const/4 p0, 0x0

    .line 405
    :goto_194
    if-ge p0, v4, :cond_1cd

    .line 406
    .line 407
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, Lax/H/e;

    .line 412
    .line 413
    invoke-virtual {v0}, Lax/H/e;->m0()Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eqz v1, :cond_1ca

    .line 418
    .line 419
    invoke-static {v2, v0}, Lax/I/h;->a(ILax/H/e;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_1ca

    .line 424
    .line 425
    sget-object v1, Lax/I/h;->a:Lax/I/b$a;

    .line 426
    .line 427
    sget v6, Lax/I/b$a;->k:I

    .line 428
    .line 429
    invoke-static {v2, v0, p1, v1, v6}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 430
    .line 431
    .line 432
    instance-of v1, v0, Lax/H/h;

    .line 433
    .line 434
    if-eqz v1, :cond_1c4

    .line 435
    .line 436
    move-object v1, v0

    .line 437
    check-cast v1, Lax/H/h;

    .line 438
    .line 439
    invoke-virtual {v1}, Lax/H/h;->s1()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-nez v1, :cond_1c0

    .line 444
    .line 445
    invoke-static {v2, v0, p1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 446
    .line 447
    .line 448
    goto :goto_1ca

    .line 449
    :cond_1c0
    invoke-static {v2, v0, p1, v5}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 450
    .line 451
    .line 452
    goto :goto_1ca

    .line 453
    :cond_1c4
    invoke-static {v2, v0, p1, v5}, Lax/I/h;->b(ILax/H/e;Lax/I/b$b;Z)V

    .line 454
    .line 455
    .line 456
    invoke-static {v2, v0, p1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 457
    .line 458
    .line 459
    :cond_1ca
    :goto_1ca
    add-int/lit8 p0, p0, 0x1

    .line 460
    .line 461
    goto :goto_194

    .line 462
    :cond_1cd
    return-void
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

.method private static i(ILax/H/e;Lax/I/b$b;)V
    .registers 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/H/e;->p0()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    sget v2, Lax/I/h;->c:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    add-int/2addr v2, v3

    .line 16
    sput v2, Lax/I/h;->c:I

    .line 17
    .line 18
    instance-of v2, v0, Lax/H/f;

    .line 19
    .line 20
    if-nez v2, :cond_2d

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/H/e;->m0()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2d

    .line 27
    .line 28
    add-int/lit8 v2, p0, 0x1

    .line 29
    .line 30
    invoke-static {v2, v0}, Lax/I/h;->a(ILax/H/e;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_2d

    .line 35
    .line 36
    new-instance v4, Lax/I/b$a;

    .line 37
    .line 38
    invoke-direct {v4}, Lax/I/b$a;-><init>()V

    .line 39
    .line 40
    .line 41
    sget v5, Lax/I/b$a;->k:I

    .line 42
    .line 43
    invoke-static {v2, v0, v1, v4, v5}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 44
    .line 45
    .line 46
    :cond_2d
    sget-object v2, Lax/H/d$b;->d0:Lax/H/d$b;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lax/H/e;->o(Lax/H/d$b;)Lax/H/d;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v4, Lax/H/d$b;->f0:Lax/H/d$b;

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Lax/H/e;->o(Lax/H/d$b;)Lax/H/d;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v4}, Lax/H/d;->e()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v2}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const/4 v8, 0x0

    .line 71
    const/16 v9, 0x8

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    if-eqz v7, :cond_132

    .line 75
    .line 76
    invoke-virtual {v2}, Lax/H/d;->n()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_132

    .line 81
    .line 82
    invoke-virtual {v2}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_59
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_132

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lax/H/d;

    .line 101
    .line 102
    iget-object v11, v7, Lax/H/d;->d:Lax/H/e;

    .line 103
    .line 104
    add-int/lit8 v12, p0, 0x1

    .line 105
    .line 106
    invoke-static {v12, v11}, Lax/I/h;->a(ILax/H/e;)Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    invoke-virtual {v11}, Lax/H/e;->m0()Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    if-eqz v14, :cond_7f

    .line 115
    .line 116
    if-eqz v13, :cond_7f

    .line 117
    .line 118
    new-instance v14, Lax/I/b$a;

    .line 119
    .line 120
    invoke-direct {v14}, Lax/I/b$a;-><init>()V

    .line 121
    .line 122
    .line 123
    sget v15, Lax/I/b$a;->k:I

    .line 124
    .line 125
    invoke-static {v12, v11, v1, v14, v15}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 126
    .line 127
    .line 128
    :cond_7f
    iget-object v14, v11, Lax/H/e;->P:Lax/H/d;

    .line 129
    .line 130
    if-ne v7, v14, :cond_8f

    .line 131
    .line 132
    iget-object v14, v11, Lax/H/e;->R:Lax/H/d;

    .line 133
    .line 134
    iget-object v14, v14, Lax/H/d;->f:Lax/H/d;

    .line 135
    .line 136
    if-eqz v14, :cond_8f

    .line 137
    .line 138
    invoke-virtual {v14}, Lax/H/d;->n()Z

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    if-nez v14, :cond_9f

    .line 143
    .line 144
    :cond_8f
    iget-object v14, v11, Lax/H/e;->R:Lax/H/d;

    .line 145
    .line 146
    if-ne v7, v14, :cond_a1

    .line 147
    .line 148
    iget-object v14, v11, Lax/H/e;->P:Lax/H/d;

    .line 149
    .line 150
    iget-object v14, v14, Lax/H/d;->f:Lax/H/d;

    .line 151
    .line 152
    if-eqz v14, :cond_a1

    .line 153
    .line 154
    invoke-virtual {v14}, Lax/H/d;->n()Z

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    if-eqz v14, :cond_a1

    .line 159
    .line 160
    :cond_9f
    const/4 v14, 0x1

    .line 161
    goto :goto_a2

    .line 162
    :cond_a1
    const/4 v14, 0x0

    .line 163
    :goto_a2
    invoke-virtual {v11}, Lax/H/e;->T()Lax/H/e$b;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    const/16 v16, 0x1

    .line 168
    .line 169
    sget-object v3, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 170
    .line 171
    if-ne v15, v3, :cond_e7

    .line 172
    .line 173
    if-eqz v13, :cond_af

    .line 174
    .line 175
    goto :goto_e7

    .line 176
    :cond_af
    invoke-virtual {v11}, Lax/H/e;->T()Lax/H/e$b;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    if-ne v7, v3, :cond_ed

    .line 181
    .line 182
    iget v3, v11, Lax/H/e;->D:I

    .line 183
    .line 184
    if-ltz v3, :cond_ed

    .line 185
    .line 186
    iget v3, v11, Lax/H/e;->C:I

    .line 187
    .line 188
    if-ltz v3, :cond_ed

    .line 189
    .line 190
    invoke-virtual {v11}, Lax/H/e;->V()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eq v3, v9, :cond_cf

    .line 195
    .line 196
    iget v3, v11, Lax/H/e;->x:I

    .line 197
    .line 198
    if-nez v3, :cond_ed

    .line 199
    .line 200
    invoke-virtual {v11}, Lax/H/e;->v()F

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    cmpl-float v3, v3, v8

    .line 205
    .line 206
    if-nez v3, :cond_ed

    .line 207
    .line 208
    :cond_cf
    invoke-virtual {v11}, Lax/H/e;->k0()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-nez v3, :cond_ed

    .line 213
    .line 214
    invoke-virtual {v11}, Lax/H/e;->l0()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_ed

    .line 219
    .line 220
    if-eqz v14, :cond_ed

    .line 221
    .line 222
    invoke-virtual {v11}, Lax/H/e;->k0()Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_ed

    .line 227
    .line 228
    invoke-static {v12, v0, v1, v11}, Lax/I/h;->g(ILax/H/e;Lax/I/b$b;Lax/H/e;)V

    .line 229
    .line 230
    .line 231
    goto :goto_ed

    .line 232
    :cond_e7
    :goto_e7
    invoke-virtual {v11}, Lax/H/e;->m0()Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_f0

    .line 237
    .line 238
    :cond_ed
    :goto_ed
    const/4 v3, 0x1

    .line 239
    goto/16 :goto_59

    .line 240
    .line 241
    :cond_f0
    iget-object v3, v11, Lax/H/e;->P:Lax/H/d;

    .line 242
    .line 243
    if-ne v7, v3, :cond_10b

    .line 244
    .line 245
    iget-object v13, v11, Lax/H/e;->R:Lax/H/d;

    .line 246
    .line 247
    iget-object v13, v13, Lax/H/d;->f:Lax/H/d;

    .line 248
    .line 249
    if-nez v13, :cond_10b

    .line 250
    .line 251
    invoke-virtual {v3}, Lax/H/d;->f()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    add-int/2addr v3, v5

    .line 256
    invoke-virtual {v11}, Lax/H/e;->x()I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    add-int/2addr v7, v3

    .line 261
    invoke-virtual {v11, v3, v7}, Lax/H/e;->I0(II)V

    .line 262
    .line 263
    .line 264
    invoke-static {v12, v11, v1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 265
    .line 266
    .line 267
    goto :goto_ed

    .line 268
    :cond_10b
    iget-object v13, v11, Lax/H/e;->R:Lax/H/d;

    .line 269
    .line 270
    if-ne v7, v13, :cond_126

    .line 271
    .line 272
    iget-object v3, v3, Lax/H/d;->f:Lax/H/d;

    .line 273
    .line 274
    if-nez v3, :cond_126

    .line 275
    .line 276
    invoke-virtual {v13}, Lax/H/d;->f()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    sub-int v3, v5, v3

    .line 281
    .line 282
    invoke-virtual {v11}, Lax/H/e;->x()I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    sub-int v7, v3, v7

    .line 287
    .line 288
    invoke-virtual {v11, v7, v3}, Lax/H/e;->I0(II)V

    .line 289
    .line 290
    .line 291
    invoke-static {v12, v11, v1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 292
    .line 293
    .line 294
    goto :goto_ed

    .line 295
    :cond_126
    if-eqz v14, :cond_ed

    .line 296
    .line 297
    invoke-virtual {v11}, Lax/H/e;->k0()Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_ed

    .line 302
    .line 303
    invoke-static {v12, v1, v11}, Lax/I/h;->f(ILax/I/b$b;Lax/H/e;)V

    .line 304
    .line 305
    .line 306
    goto :goto_ed

    .line 307
    :cond_132
    const/16 v16, 0x1

    .line 308
    .line 309
    instance-of v2, v0, Lax/H/h;

    .line 310
    .line 311
    if-eqz v2, :cond_139

    .line 312
    .line 313
    return-void

    .line 314
    :cond_139
    invoke-virtual {v4}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-eqz v2, :cond_227

    .line 319
    .line 320
    invoke-virtual {v4}, Lax/H/d;->n()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-eqz v2, :cond_227

    .line 325
    .line 326
    invoke-virtual {v4}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    :cond_14d
    :goto_14d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_227

    .line 339
    .line 340
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Lax/H/d;

    .line 345
    .line 346
    iget-object v4, v3, Lax/H/d;->d:Lax/H/e;

    .line 347
    .line 348
    add-int/lit8 v5, p0, 0x1

    .line 349
    .line 350
    invoke-static {v5, v4}, Lax/I/h;->a(ILax/H/e;)Z

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    invoke-virtual {v4}, Lax/H/e;->m0()Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_173

    .line 359
    .line 360
    if-eqz v7, :cond_173

    .line 361
    .line 362
    new-instance v11, Lax/I/b$a;

    .line 363
    .line 364
    invoke-direct {v11}, Lax/I/b$a;-><init>()V

    .line 365
    .line 366
    .line 367
    sget v12, Lax/I/b$a;->k:I

    .line 368
    .line 369
    invoke-static {v5, v4, v1, v11, v12}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 370
    .line 371
    .line 372
    :cond_173
    iget-object v11, v4, Lax/H/e;->P:Lax/H/d;

    .line 373
    .line 374
    if-ne v3, v11, :cond_183

    .line 375
    .line 376
    iget-object v11, v4, Lax/H/e;->R:Lax/H/d;

    .line 377
    .line 378
    iget-object v11, v11, Lax/H/d;->f:Lax/H/d;

    .line 379
    .line 380
    if-eqz v11, :cond_183

    .line 381
    .line 382
    invoke-virtual {v11}, Lax/H/d;->n()Z

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-nez v11, :cond_193

    .line 387
    .line 388
    :cond_183
    iget-object v11, v4, Lax/H/e;->R:Lax/H/d;

    .line 389
    .line 390
    if-ne v3, v11, :cond_195

    .line 391
    .line 392
    iget-object v11, v4, Lax/H/e;->P:Lax/H/d;

    .line 393
    .line 394
    iget-object v11, v11, Lax/H/d;->f:Lax/H/d;

    .line 395
    .line 396
    if-eqz v11, :cond_195

    .line 397
    .line 398
    invoke-virtual {v11}, Lax/H/d;->n()Z

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    if-eqz v11, :cond_195

    .line 403
    .line 404
    :cond_193
    const/4 v11, 0x1

    .line 405
    goto :goto_196

    .line 406
    :cond_195
    const/4 v11, 0x0

    .line 407
    :goto_196
    invoke-virtual {v4}, Lax/H/e;->T()Lax/H/e$b;

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    sget-object v13, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 412
    .line 413
    if-ne v12, v13, :cond_1da

    .line 414
    .line 415
    if-eqz v7, :cond_1a1

    .line 416
    .line 417
    goto :goto_1da

    .line 418
    :cond_1a1
    invoke-virtual {v4}, Lax/H/e;->T()Lax/H/e$b;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    if-ne v3, v13, :cond_14d

    .line 423
    .line 424
    iget v3, v4, Lax/H/e;->D:I

    .line 425
    .line 426
    if-ltz v3, :cond_14d

    .line 427
    .line 428
    iget v3, v4, Lax/H/e;->C:I

    .line 429
    .line 430
    if-ltz v3, :cond_14d

    .line 431
    .line 432
    invoke-virtual {v4}, Lax/H/e;->V()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eq v3, v9, :cond_1c1

    .line 437
    .line 438
    iget v3, v4, Lax/H/e;->x:I

    .line 439
    .line 440
    if-nez v3, :cond_14d

    .line 441
    .line 442
    invoke-virtual {v4}, Lax/H/e;->v()F

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    cmpl-float v3, v3, v8

    .line 447
    .line 448
    if-nez v3, :cond_14d

    .line 449
    .line 450
    :cond_1c1
    invoke-virtual {v4}, Lax/H/e;->k0()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-nez v3, :cond_14d

    .line 455
    .line 456
    invoke-virtual {v4}, Lax/H/e;->l0()Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-nez v3, :cond_14d

    .line 461
    .line 462
    if-eqz v11, :cond_14d

    .line 463
    .line 464
    invoke-virtual {v4}, Lax/H/e;->k0()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-nez v3, :cond_14d

    .line 469
    .line 470
    invoke-static {v5, v0, v1, v4}, Lax/I/h;->g(ILax/H/e;Lax/I/b$b;Lax/H/e;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_14d

    .line 474
    .line 475
    :cond_1da
    :goto_1da
    invoke-virtual {v4}, Lax/H/e;->m0()Z

    .line 476
    .line 477
    .line 478
    move-result v7

    .line 479
    if-eqz v7, :cond_1e2

    .line 480
    .line 481
    goto/16 :goto_14d

    .line 482
    .line 483
    :cond_1e2
    iget-object v7, v4, Lax/H/e;->P:Lax/H/d;

    .line 484
    .line 485
    if-ne v3, v7, :cond_1fe

    .line 486
    .line 487
    iget-object v12, v4, Lax/H/e;->R:Lax/H/d;

    .line 488
    .line 489
    iget-object v12, v12, Lax/H/d;->f:Lax/H/d;

    .line 490
    .line 491
    if-nez v12, :cond_1fe

    .line 492
    .line 493
    invoke-virtual {v7}, Lax/H/d;->f()I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    add-int/2addr v3, v6

    .line 498
    invoke-virtual {v4}, Lax/H/e;->x()I

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    add-int/2addr v7, v3

    .line 503
    invoke-virtual {v4, v3, v7}, Lax/H/e;->I0(II)V

    .line 504
    .line 505
    .line 506
    invoke-static {v5, v4, v1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_14d

    .line 510
    .line 511
    :cond_1fe
    iget-object v12, v4, Lax/H/e;->R:Lax/H/d;

    .line 512
    .line 513
    if-ne v3, v12, :cond_21a

    .line 514
    .line 515
    iget-object v3, v7, Lax/H/d;->f:Lax/H/d;

    .line 516
    .line 517
    if-nez v3, :cond_21a

    .line 518
    .line 519
    invoke-virtual {v12}, Lax/H/d;->f()I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    sub-int v3, v6, v3

    .line 524
    .line 525
    invoke-virtual {v4}, Lax/H/e;->x()I

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    sub-int v7, v3, v7

    .line 530
    .line 531
    invoke-virtual {v4, v7, v3}, Lax/H/e;->I0(II)V

    .line 532
    .line 533
    .line 534
    invoke-static {v5, v4, v1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_14d

    .line 538
    .line 539
    :cond_21a
    if-eqz v11, :cond_14d

    .line 540
    .line 541
    invoke-virtual {v4}, Lax/H/e;->k0()Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    if-nez v3, :cond_14d

    .line 546
    .line 547
    invoke-static {v5, v1, v4}, Lax/I/h;->f(ILax/I/b$b;Lax/H/e;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_14d

    .line 551
    .line 552
    :cond_227
    sget-object v2, Lax/H/d$b;->g0:Lax/H/d$b;

    .line 553
    .line 554
    invoke-virtual {v0, v2}, Lax/H/e;->o(Lax/H/d$b;)Lax/H/d;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-virtual {v2}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    if-eqz v3, :cond_28e

    .line 563
    .line 564
    invoke-virtual {v2}, Lax/H/d;->n()Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-eqz v3, :cond_28e

    .line 569
    .line 570
    invoke-virtual {v2}, Lax/H/d;->e()I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    invoke-virtual {v2}, Lax/H/d;->d()Ljava/util/HashSet;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    :cond_245
    :goto_245
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    if-eqz v4, :cond_28e

    .line 587
    .line 588
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    check-cast v4, Lax/H/d;

    .line 593
    .line 594
    iget-object v5, v4, Lax/H/d;->d:Lax/H/e;

    .line 595
    .line 596
    add-int/lit8 v6, p0, 0x1

    .line 597
    .line 598
    invoke-static {v6, v5}, Lax/I/h;->a(ILax/H/e;)Z

    .line 599
    .line 600
    .line 601
    move-result v7

    .line 602
    invoke-virtual {v5}, Lax/H/e;->m0()Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-eqz v8, :cond_26b

    .line 607
    .line 608
    if-eqz v7, :cond_26b

    .line 609
    .line 610
    new-instance v8, Lax/I/b$a;

    .line 611
    .line 612
    invoke-direct {v8}, Lax/I/b$a;-><init>()V

    .line 613
    .line 614
    .line 615
    sget v9, Lax/I/b$a;->k:I

    .line 616
    .line 617
    invoke-static {v6, v5, v1, v8, v9}, Lax/H/f;->S1(ILax/H/e;Lax/I/b$b;Lax/I/b$a;I)Z

    .line 618
    .line 619
    .line 620
    :cond_26b
    invoke-virtual {v5}, Lax/H/e;->T()Lax/H/e$b;

    .line 621
    .line 622
    .line 623
    move-result-object v8

    .line 624
    sget-object v9, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 625
    .line 626
    if-ne v8, v9, :cond_275

    .line 627
    .line 628
    if-eqz v7, :cond_245

    .line 629
    .line 630
    :cond_275
    invoke-virtual {v5}, Lax/H/e;->m0()Z

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    if-eqz v7, :cond_27c

    .line 635
    .line 636
    goto :goto_245

    .line 637
    :cond_27c
    iget-object v7, v5, Lax/H/e;->S:Lax/H/d;

    .line 638
    .line 639
    if-ne v4, v7, :cond_245

    .line 640
    .line 641
    invoke-virtual {v4}, Lax/H/d;->f()I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    add-int/2addr v4, v3

    .line 646
    invoke-virtual {v5, v4}, Lax/H/e;->E0(I)V

    .line 647
    .line 648
    .line 649
    :try_start_288
    invoke-static {v6, v5, v1}, Lax/I/h;->i(ILax/H/e;Lax/I/b$b;)V
    :try_end_28b
    .catchall {:try_start_288 .. :try_end_28b} :catchall_28c

    .line 650
    .line 651
    .line 652
    goto :goto_245

    .line 653
    :catchall_28c
    move-exception v0

    .line 654
    throw v0

    .line 655
    :cond_28e
    invoke-virtual {v0}, Lax/H/e;->r0()V

    .line 656
    .line 657
    .line 658
    return-void
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
.end method
