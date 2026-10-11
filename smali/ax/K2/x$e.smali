.class Lax/K2/x$e;
.super Lax/k2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/K2/x;-><init>(Lax/k2/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/k2/i<",
        "Lax/K2/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lax/K2/x;


# direct methods
.method constructor <init>(Lax/K2/x;Lax/k2/u;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/K2/x$e;->d:Lax/K2/x;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lax/k2/i;-><init>(Lax/k2/u;)V

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


# virtual methods
.method public e()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

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

.method public bridge synthetic i(Lax/o2/k;Ljava/lang/Object;)V
    .registers 3

    .line 1
    check-cast p2, Lax/K2/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/K2/x$e;->k(Lax/o2/k;Lax/K2/v;)V

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

.method public k(Lax/o2/k;Lax/K2/v;)V
    .registers 13

    .line 1
    iget-object v0, p2, Lax/K2/v;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_9

    .line 5
    .line 6
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_c

    .line 10
    :cond_9
    invoke-interface {p1, v1, v0}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_c
    sget-object v0, Lax/K2/C;->a:Lax/K2/C;

    .line 14
    .line 15
    iget-object v0, p2, Lax/K2/v;->b:Lax/B2/r;

    .line 16
    .line 17
    invoke-static {v0}, Lax/K2/C;->j(Lax/B2/r;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x2

    .line 22
    int-to-long v2, v0

    .line 23
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p2, Lax/K2/v;->c:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    if-nez v0, :cond_22

    .line 30
    .line 31
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_25

    .line 35
    :cond_22
    invoke-interface {p1, v1, v0}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_25
    iget-object v0, p2, Lax/K2/v;->d:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    if-nez v0, :cond_2e

    .line 42
    .line 43
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_31

    .line 47
    :cond_2e
    invoke-interface {p1, v1, v0}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_31
    iget-object v0, p2, Lax/K2/v;->e:Landroidx/work/b;

    .line 51
    .line 52
    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x5

    .line 57
    if-nez v0, :cond_3e

    .line 58
    .line 59
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_41

    .line 63
    :cond_3e
    invoke-interface {p1, v1, v0}, Lax/o2/i;->e0(I[B)V

    .line 64
    .line 65
    .line 66
    :goto_41
    iget-object v0, p2, Lax/K2/v;->f:Landroidx/work/b;

    .line 67
    .line 68
    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/4 v1, 0x6

    .line 73
    if-nez v0, :cond_4e

    .line 74
    .line 75
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_51

    .line 79
    :cond_4e
    invoke-interface {p1, v1, v0}, Lax/o2/i;->e0(I[B)V

    .line 80
    .line 81
    .line 82
    :goto_51
    const/4 v0, 0x7

    .line 83
    iget-wide v1, p2, Lax/K2/v;->g:J

    .line 84
    .line 85
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 86
    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    iget-wide v1, p2, Lax/K2/v;->h:J

    .line 91
    .line 92
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 93
    .line 94
    .line 95
    const/16 v0, 0x9

    .line 96
    .line 97
    iget-wide v1, p2, Lax/K2/v;->i:J

    .line 98
    .line 99
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 100
    .line 101
    .line 102
    iget v0, p2, Lax/K2/v;->k:I

    .line 103
    .line 104
    int-to-long v0, v0

    .line 105
    const/16 v2, 0xa

    .line 106
    .line 107
    invoke-interface {p1, v2, v0, v1}, Lax/o2/i;->X(IJ)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p2, Lax/K2/v;->l:Lax/B2/a;

    .line 111
    .line 112
    invoke-static {v0}, Lax/K2/C;->a(Lax/B2/a;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const/16 v1, 0xb

    .line 117
    .line 118
    int-to-long v2, v0

    .line 119
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 120
    .line 121
    .line 122
    const/16 v0, 0xc

    .line 123
    .line 124
    iget-wide v1, p2, Lax/K2/v;->m:J

    .line 125
    .line 126
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 127
    .line 128
    .line 129
    const/16 v0, 0xd

    .line 130
    .line 131
    iget-wide v1, p2, Lax/K2/v;->n:J

    .line 132
    .line 133
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 134
    .line 135
    .line 136
    const/16 v0, 0xe

    .line 137
    .line 138
    iget-wide v1, p2, Lax/K2/v;->o:J

    .line 139
    .line 140
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 141
    .line 142
    .line 143
    const/16 v0, 0xf

    .line 144
    .line 145
    iget-wide v1, p2, Lax/K2/v;->p:J

    .line 146
    .line 147
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 148
    .line 149
    .line 150
    iget-boolean v0, p2, Lax/K2/v;->q:Z

    .line 151
    .line 152
    const/16 v1, 0x10

    .line 153
    .line 154
    int-to-long v2, v0

    .line 155
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p2, Lax/K2/v;->r:Lax/B2/m;

    .line 159
    .line 160
    invoke-static {v0}, Lax/K2/C;->h(Lax/B2/m;)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    const/16 v1, 0x11

    .line 165
    .line 166
    int-to-long v2, v0

    .line 167
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Lax/K2/v;->e()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-long v0, v0

    .line 175
    const/16 v2, 0x12

    .line 176
    .line 177
    invoke-interface {p1, v2, v0, v1}, Lax/o2/i;->X(IJ)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Lax/K2/v;->d()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    int-to-long v0, v0

    .line 185
    const/16 v2, 0x13

    .line 186
    .line 187
    invoke-interface {p1, v2, v0, v1}, Lax/o2/i;->X(IJ)V

    .line 188
    .line 189
    .line 190
    iget-object p2, p2, Lax/K2/v;->j:Lax/B2/b;

    .line 191
    .line 192
    const/16 v0, 0x1a

    .line 193
    .line 194
    const/16 v1, 0x19

    .line 195
    .line 196
    const/16 v2, 0x18

    .line 197
    .line 198
    const/16 v3, 0x17

    .line 199
    .line 200
    const/16 v4, 0x16

    .line 201
    .line 202
    const/16 v5, 0x15

    .line 203
    .line 204
    const/16 v6, 0x14

    .line 205
    .line 206
    const/16 v7, 0x1b

    .line 207
    .line 208
    if-eqz p2, :cond_11d

    .line 209
    .line 210
    invoke-virtual {p2}, Lax/B2/b;->d()Lax/B2/j;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-static {v8}, Lax/K2/C;->g(Lax/B2/j;)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    int-to-long v8, v8

    .line 219
    invoke-interface {p1, v6, v8, v9}, Lax/o2/i;->X(IJ)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2}, Lax/B2/b;->g()Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    int-to-long v8, v6

    .line 227
    invoke-interface {p1, v5, v8, v9}, Lax/o2/i;->X(IJ)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2}, Lax/B2/b;->h()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    int-to-long v5, v5

    .line 235
    invoke-interface {p1, v4, v5, v6}, Lax/o2/i;->X(IJ)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2}, Lax/B2/b;->f()Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    int-to-long v4, v4

    .line 243
    invoke-interface {p1, v3, v4, v5}, Lax/o2/i;->X(IJ)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Lax/B2/b;->i()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    int-to-long v3, v3

    .line 251
    invoke-interface {p1, v2, v3, v4}, Lax/o2/i;->X(IJ)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, Lax/B2/b;->b()J

    .line 255
    .line 256
    .line 257
    move-result-wide v2

    .line 258
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2}, Lax/B2/b;->a()J

    .line 262
    .line 263
    .line 264
    move-result-wide v1

    .line 265
    invoke-interface {p1, v0, v1, v2}, Lax/o2/i;->X(IJ)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2}, Lax/B2/b;->c()Ljava/util/Set;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p2}, Lax/K2/C;->i(Ljava/util/Set;)[B

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    if-nez p2, :cond_119

    .line 277
    .line 278
    invoke-interface {p1, v7}, Lax/o2/i;->t0(I)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_119
    invoke-interface {p1, v7, p2}, Lax/o2/i;->e0(I[B)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_11d
    invoke-interface {p1, v6}, Lax/o2/i;->t0(I)V

    .line 287
    .line 288
    .line 289
    invoke-interface {p1, v5}, Lax/o2/i;->t0(I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p1, v4}, Lax/o2/i;->t0(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {p1, v3}, Lax/o2/i;->t0(I)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p1, v2}, Lax/o2/i;->t0(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {p1, v0}, Lax/o2/i;->t0(I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {p1, v7}, Lax/o2/i;->t0(I)V

    .line 308
    .line 309
    .line 310
    return-void
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
