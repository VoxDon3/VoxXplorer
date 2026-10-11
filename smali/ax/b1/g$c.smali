.class Lax/b1/g$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/b1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lax/b1/g;


# direct methods
.method public constructor <init>(Lax/b1/g;Landroid/os/Looper;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method private a(Landroid/os/Message;Lax/b1/T;)Z
    .registers 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lax/b1/g$d;

    .line 10
    .line 11
    iget-boolean v4, v3, Lax/b1/g$d;->b:Z

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-nez v4, :cond_10

    .line 15
    .line 16
    return v5

    .line 17
    :cond_10
    iget v4, v3, Lax/b1/g$d;->e:I

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    add-int/2addr v4, v6

    .line 21
    iput v4, v3, Lax/b1/g$d;->e:I

    .line 22
    .line 23
    iget-object v7, v1, Lax/b1/g$c;->b:Lax/b1/g;

    .line 24
    .line 25
    invoke-static {v7}, Lax/b1/g;->o(Lax/b1/g;)Lax/m1/m;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const/4 v8, 0x3

    .line 30
    invoke-interface {v7, v8}, Lax/m1/m;->c(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-le v4, v7, :cond_24

    .line 35
    .line 36
    return v5

    .line 37
    :cond_24
    new-instance v9, Lax/i1/y;

    .line 38
    .line 39
    iget-wide v10, v3, Lax/b1/g$d;->a:J

    .line 40
    .line 41
    iget-object v12, v2, Lax/b1/T;->q:Lax/U0/k;

    .line 42
    .line 43
    iget-object v13, v2, Lax/b1/T;->c0:Landroid/net/Uri;

    .line 44
    .line 45
    iget-object v14, v2, Lax/b1/T;->d0:Ljava/util/Map;

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v15

    .line 51
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v17

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v7, 0x1

    .line 57
    iget-wide v5, v3, Lax/b1/g$d;->c:J

    .line 58
    .line 59
    sub-long v17, v17, v5

    .line 60
    .line 61
    iget-wide v5, v2, Lax/b1/T;->e0:J

    .line 62
    .line 63
    move-wide/from16 v19, v5

    .line 64
    .line 65
    invoke-direct/range {v9 .. v20}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 66
    .line 67
    .line 68
    new-instance v5, Lax/i1/B;

    .line 69
    .line 70
    invoke-direct {v5, v8}, Lax/i1/B;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    instance-of v6, v6, Ljava/io/IOException;

    .line 78
    .line 79
    if-eqz v6, :cond_57

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ljava/io/IOException;

    .line 86
    .line 87
    goto :goto_61

    .line 88
    :cond_57
    new-instance v6, Lax/b1/g$f;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v6, v2}, Lax/b1/g$f;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object v2, v6

    .line 98
    :goto_61
    iget-object v6, v1, Lax/b1/g$c;->b:Lax/b1/g;

    .line 99
    .line 100
    invoke-static {v6}, Lax/b1/g;->o(Lax/b1/g;)Lax/m1/m;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    new-instance v8, Lax/m1/m$c;

    .line 105
    .line 106
    iget v3, v3, Lax/b1/g$d;->e:I

    .line 107
    .line 108
    invoke-direct {v8, v9, v5, v2, v3}, Lax/m1/m$c;-><init>(Lax/i1/y;Lax/i1/B;Ljava/io/IOException;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v6, v8}, Lax/m1/m;->b(Lax/m1/m$c;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    cmp-long v8, v2, v5

    .line 121
    .line 122
    if-nez v8, :cond_7c

    .line 123
    .line 124
    return v4

    .line 125
    :cond_7c
    monitor-enter p0

    .line 126
    :try_start_7d
    iget-boolean v5, v1, Lax/b1/g$c;->a:Z

    .line 127
    .line 128
    if-nez v5, :cond_8c

    .line 129
    .line 130
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 135
    .line 136
    .line 137
    monitor-exit p0

    .line 138
    return v7

    .line 139
    :catchall_8a
    move-exception v0

    .line 140
    goto :goto_8e

    .line 141
    :cond_8c
    monitor-exit p0

    .line 142
    return v4

    .line 143
    :goto_8e
    monitor-exit p0
    :try_end_8f
    .catchall {:try_start_7d .. :try_end_8f} :catchall_8a

    .line 144
    throw v0
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
.method b(ILjava/lang/Object;Z)V
    .registers 11

    .line 1
    new-instance v0, Lax/b1/g$d;

    .line 2
    .line 3
    invoke-static {}, Lax/i1/y;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-object v6, p2

    .line 12
    move v3, p3

    .line 13
    invoke-direct/range {v0 .. v6}, Lax/b1/g$d;-><init>(JZJLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public declared-synchronized c()V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/b1/g$c;->a:Z
    :try_end_8
    .catchall {:try_start_2 .. :try_end_8} :catchall_a

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_a
    move-exception v0

    .line 12
    :try_start_b
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_b .. :try_end_c} :catchall_a

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public handleMessage(Landroid/os/Message;)V
    .registers 7

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lax/b1/g$d;

    .line 4
    .line 5
    :try_start_4
    iget v1, p1, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_2b

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v1, v2, :cond_25

    .line 12
    .line 13
    iget-object v1, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 14
    .line 15
    invoke-static {v1}, Lax/b1/g;->n(Lax/b1/g;)Lax/b1/S;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 20
    .line 21
    invoke-static {v2}, Lax/b1/g;->m(Lax/b1/g;)Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, v0, Lax/b1/g$d;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lax/b1/E$a;

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, Lax/b1/S;->b(Ljava/util/UUID;Lax/b1/E$a;)[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_4f

    .line 34
    :catch_21
    move-exception v1

    .line 35
    goto :goto_40

    .line 36
    :catch_23
    move-exception v1

    .line 37
    goto :goto_48

    .line 38
    :cond_25
    new-instance v1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_2b
    iget-object v1, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 45
    .line 46
    invoke-static {v1}, Lax/b1/g;->n(Lax/b1/g;)Lax/b1/S;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 51
    .line 52
    invoke-static {v2}, Lax/b1/g;->m(Lax/b1/g;)Ljava/util/UUID;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v3, v0, Lax/b1/g$d;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lax/b1/E$d;

    .line 59
    .line 60
    invoke-interface {v1, v2, v3}, Lax/b1/S;->a(Ljava/util/UUID;Lax/b1/E$d;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v1
    :try_end_3f
    .catch Lax/b1/T; {:try_start_4 .. :try_end_3f} :catch_23
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_3f} :catch_21

    .line 64
    goto :goto_4f

    .line 65
    :goto_40
    const-string v2, "DefaultDrmSession"

    .line 66
    .line 67
    const-string v3, "Key/provisioning request produced an unexpected exception. Not retrying."

    .line 68
    .line 69
    invoke-static {v2, v3, v1}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_4f

    .line 73
    :goto_48
    invoke-direct {p0, p1, v1}, Lax/b1/g$c;->a(Landroid/os/Message;Lax/b1/T;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4f

    .line 78
    .line 79
    goto :goto_78

    .line 80
    :cond_4f
    :goto_4f
    iget-object v2, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 81
    .line 82
    invoke-static {v2}, Lax/b1/g;->o(Lax/b1/g;)Lax/m1/m;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-wide v3, v0, Lax/b1/g$d;->a:J

    .line 87
    .line 88
    invoke-interface {v2, v3, v4}, Lax/m1/m;->a(J)V

    .line 89
    .line 90
    .line 91
    monitor-enter p0

    .line 92
    :try_start_5b
    iget-boolean v2, p0, Lax/b1/g$c;->a:Z

    .line 93
    .line 94
    if-nez v2, :cond_77

    .line 95
    .line 96
    iget-object v2, p0, Lax/b1/g$c;->b:Lax/b1/g;

    .line 97
    .line 98
    invoke-static {v2}, Lax/b1/g;->p(Lax/b1/g;)Lax/b1/g$e;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget p1, p1, Landroid/os/Message;->what:I

    .line 103
    .line 104
    iget-object v0, v0, Lax/b1/g$d;->d:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v2, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 115
    .line 116
    .line 117
    goto :goto_77

    .line 118
    :catchall_75
    move-exception p1

    .line 119
    goto :goto_79

    .line 120
    :cond_77
    :goto_77
    monitor-exit p0

    .line 121
    :goto_78
    return-void

    .line 122
    :goto_79
    monitor-exit p0
    :try_end_7a
    .catchall {:try_start_5b .. :try_end_7a} :catchall_75

    .line 123
    throw p1
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
