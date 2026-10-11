.class public Lax/I/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lax/H/f;

.field private b:Z

.field private c:Z

.field private d:Lax/H/f;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/I/p;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/I/m;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lax/I/b$b;

.field private h:Lax/I/b$a;

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/I/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/H/f;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/I/e;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lax/I/e;->c:Z

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/I/e;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lax/I/e;->g:Lax/I/b$b;

    .line 25
    .line 26
    new-instance v0, Lax/I/b$a;

    .line 27
    .line 28
    invoke-direct {v0}, Lax/I/b$a;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 39
    .line 40
    iput-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 41
    .line 42
    iput-object p1, p0, Lax/I/e;->d:Lax/H/f;

    .line 43
    .line 44
    return-void
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

.method private a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/I/f;",
            "II",
            "Lax/I/f;",
            "Ljava/util/ArrayList<",
            "Lax/I/m;",
            ">;",
            "Lax/I/m;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lax/I/f;->d:Lax/I/p;

    .line 2
    .line 3
    iget-object v0, p1, Lax/I/p;->c:Lax/I/m;

    .line 4
    .line 5
    if-nez v0, :cond_100

    .line 6
    .line 7
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 8
    .line 9
    iget-object v1, v0, Lax/H/e;->e:Lax/I/l;

    .line 10
    .line 11
    if-eq p1, v1, :cond_100

    .line 12
    .line 13
    iget-object v0, v0, Lax/H/e;->f:Lax/I/n;

    .line 14
    .line 15
    if-ne p1, v0, :cond_12

    .line 16
    .line 17
    goto/16 :goto_100

    .line 18
    .line 19
    :cond_12
    if-nez p6, :cond_1c

    .line 20
    .line 21
    new-instance p6, Lax/I/m;

    .line 22
    .line 23
    invoke-direct {p6, p1, p3}, Lax/I/m;-><init>(Lax/I/p;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1c
    move-object v7, p6

    .line 30
    iput-object v7, p1, Lax/I/p;->c:Lax/I/m;

    .line 31
    .line 32
    invoke-virtual {v7, p1}, Lax/I/m;->a(Lax/I/p;)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p1, Lax/I/p;->h:Lax/I/f;

    .line 36
    .line 37
    iget-object p3, p3, Lax/I/f;->k:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    :goto_2a
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p6

    .line 47
    if-eqz p6, :cond_4d

    .line 48
    .line 49
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p6

    .line 53
    check-cast p6, Lax/I/d;

    .line 54
    .line 55
    instance-of v0, p6, Lax/I/f;

    .line 56
    .line 57
    if-eqz v0, :cond_46

    .line 58
    .line 59
    move-object v2, p6

    .line 60
    check-cast v2, Lax/I/f;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    move-object v1, p0

    .line 64
    move v3, p2

    .line 65
    move-object v5, p4

    .line 66
    move-object v6, p5

    .line 67
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 68
    .line 69
    .line 70
    goto :goto_49

    .line 71
    :cond_46
    move v3, p2

    .line 72
    move-object v5, p4

    .line 73
    move-object v6, p5

    .line 74
    :goto_49
    move p2, v3

    .line 75
    move-object p4, v5

    .line 76
    move-object p5, v6

    .line 77
    goto :goto_2a

    .line 78
    :cond_4d
    move v3, p2

    .line 79
    move-object v5, p4

    .line 80
    move-object v6, p5

    .line 81
    iget-object p2, p1, Lax/I/p;->i:Lax/I/f;

    .line 82
    .line 83
    iget-object p2, p2, Lax/I/f;->k:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :cond_58
    :goto_58
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_71

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    check-cast p3, Lax/I/d;

    .line 100
    .line 101
    instance-of p4, p3, Lax/I/f;

    .line 102
    .line 103
    if-eqz p4, :cond_58

    .line 104
    .line 105
    move-object v2, p3

    .line 106
    check-cast v2, Lax/I/f;

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    move-object v1, p0

    .line 110
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 111
    .line 112
    .line 113
    goto :goto_58

    .line 114
    :cond_71
    const/4 p2, 0x1

    .line 115
    if-ne v3, p2, :cond_9c

    .line 116
    .line 117
    instance-of p3, p1, Lax/I/n;

    .line 118
    .line 119
    if-eqz p3, :cond_9c

    .line 120
    .line 121
    move-object p3, p1

    .line 122
    check-cast p3, Lax/I/n;

    .line 123
    .line 124
    iget-object p3, p3, Lax/I/n;->k:Lax/I/f;

    .line 125
    .line 126
    iget-object p3, p3, Lax/I/f;->k:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    :cond_83
    :goto_83
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    if-eqz p4, :cond_9c

    .line 137
    .line 138
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    check-cast p4, Lax/I/d;

    .line 143
    .line 144
    instance-of p5, p4, Lax/I/f;

    .line 145
    .line 146
    if-eqz p5, :cond_83

    .line 147
    .line 148
    move-object v2, p4

    .line 149
    check-cast v2, Lax/I/f;

    .line 150
    .line 151
    const/4 v4, 0x2

    .line 152
    move-object v1, p0

    .line 153
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 154
    .line 155
    .line 156
    goto :goto_83

    .line 157
    :cond_9c
    iget-object p3, p1, Lax/I/p;->h:Lax/I/f;

    .line 158
    .line 159
    iget-object p3, p3, Lax/I/f;->l:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    :goto_a4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result p4

    .line 169
    if-eqz p4, :cond_bb

    .line 170
    .line 171
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p4

    .line 175
    move-object v2, p4

    .line 176
    check-cast v2, Lax/I/f;

    .line 177
    .line 178
    if-ne v2, v5, :cond_b5

    .line 179
    .line 180
    iput-boolean p2, v7, Lax/I/m;->b:Z

    .line 181
    .line 182
    :cond_b5
    const/4 v4, 0x0

    .line 183
    move-object v1, p0

    .line 184
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 185
    .line 186
    .line 187
    goto :goto_a4

    .line 188
    :cond_bb
    iget-object p3, p1, Lax/I/p;->i:Lax/I/f;

    .line 189
    .line 190
    iget-object p3, p3, Lax/I/f;->l:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    :goto_c3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result p4

    .line 200
    if-eqz p4, :cond_da

    .line 201
    .line 202
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p4

    .line 206
    move-object v2, p4

    .line 207
    check-cast v2, Lax/I/f;

    .line 208
    .line 209
    if-ne v2, v5, :cond_d4

    .line 210
    .line 211
    iput-boolean p2, v7, Lax/I/m;->b:Z

    .line 212
    .line 213
    :cond_d4
    const/4 v4, 0x1

    .line 214
    move-object v1, p0

    .line 215
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 216
    .line 217
    .line 218
    goto :goto_c3

    .line 219
    :cond_da
    if-ne v3, p2, :cond_100

    .line 220
    .line 221
    instance-of p2, p1, Lax/I/n;

    .line 222
    .line 223
    if-eqz p2, :cond_100

    .line 224
    .line 225
    check-cast p1, Lax/I/n;

    .line 226
    .line 227
    iget-object p1, p1, Lax/I/n;->k:Lax/I/f;

    .line 228
    .line 229
    iget-object p1, p1, Lax/I/f;->l:Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    :goto_ea
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-eqz p2, :cond_100

    .line 240
    .line 241
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    move-object v2, p2

    .line 246
    check-cast v2, Lax/I/f;

    .line 247
    .line 248
    const/4 v4, 0x2

    .line 249
    move-object v1, p0

    .line 250
    :try_start_f9
    invoke-direct/range {v1 .. v7}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V
    :try_end_fc
    .catchall {:try_start_f9 .. :try_end_fc} :catchall_fd

    .line 251
    .line 252
    .line 253
    goto :goto_ea

    .line 254
    :catchall_fd
    move-exception v0

    .line 255
    move-object p1, v0

    .line 256
    throw p1

    .line 257
    :cond_100
    :goto_100
    return-void
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

.method private b(Lax/H/f;)Z
    .registers 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lax/H/m;->L0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_a
    if-ge v4, v2, :cond_335

    .line 12
    .line 13
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    add-int/lit8 v4, v4, 0x1

    .line 18
    .line 19
    move-object v7, v5

    .line 20
    check-cast v7, Lax/H/e;

    .line 21
    .line 22
    iget-object v5, v7, Lax/H/e;->Z:[Lax/H/e$b;

    .line 23
    .line 24
    aget-object v6, v5, v3

    .line 25
    .line 26
    const/4 v12, 0x1

    .line 27
    aget-object v5, v5, v12

    .line 28
    .line 29
    invoke-virtual {v7}, Lax/H/e;->V()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    const/16 v9, 0x8

    .line 34
    .line 35
    if-ne v8, v9, :cond_27

    .line 36
    .line 37
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 38
    .line 39
    goto :goto_a

    .line 40
    :cond_27
    iget v8, v7, Lax/H/e;->B:F

    .line 41
    .line 42
    const/high16 v13, 0x3f800000    # 1.0f

    .line 43
    .line 44
    const/4 v9, 0x2

    .line 45
    cmpg-float v8, v8, v13

    .line 46
    .line 47
    if-gez v8, :cond_36

    .line 48
    .line 49
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 50
    .line 51
    if-ne v6, v8, :cond_36

    .line 52
    .line 53
    iput v9, v7, Lax/H/e;->w:I

    .line 54
    .line 55
    :cond_36
    iget v8, v7, Lax/H/e;->E:F

    .line 56
    .line 57
    cmpg-float v8, v8, v13

    .line 58
    .line 59
    if-gez v8, :cond_42

    .line 60
    .line 61
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 62
    .line 63
    if-ne v5, v8, :cond_42

    .line 64
    .line 65
    iput v9, v7, Lax/H/e;->x:I

    .line 66
    .line 67
    :cond_42
    invoke-virtual {v7}, Lax/H/e;->v()F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x3

    .line 73
    cmpl-float v8, v8, v10

    .line 74
    .line 75
    if-lez v8, :cond_78

    .line 76
    .line 77
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 78
    .line 79
    if-ne v6, v8, :cond_5b

    .line 80
    .line 81
    sget-object v10, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 82
    .line 83
    if-eq v5, v10, :cond_58

    .line 84
    .line 85
    sget-object v10, Lax/H/e$b;->q:Lax/H/e$b;

    .line 86
    .line 87
    if-ne v5, v10, :cond_5b

    .line 88
    .line 89
    :cond_58
    iput v11, v7, Lax/H/e;->w:I

    .line 90
    .line 91
    goto :goto_78

    .line 92
    :cond_5b
    if-ne v5, v8, :cond_68

    .line 93
    .line 94
    sget-object v10, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 95
    .line 96
    if-eq v6, v10, :cond_65

    .line 97
    .line 98
    sget-object v10, Lax/H/e$b;->q:Lax/H/e$b;

    .line 99
    .line 100
    if-ne v6, v10, :cond_68

    .line 101
    .line 102
    :cond_65
    iput v11, v7, Lax/H/e;->x:I

    .line 103
    .line 104
    goto :goto_78

    .line 105
    :cond_68
    if-ne v6, v8, :cond_78

    .line 106
    .line 107
    if-ne v5, v8, :cond_78

    .line 108
    .line 109
    iget v8, v7, Lax/H/e;->w:I

    .line 110
    .line 111
    if-nez v8, :cond_72

    .line 112
    .line 113
    iput v11, v7, Lax/H/e;->w:I

    .line 114
    .line 115
    :cond_72
    iget v8, v7, Lax/H/e;->x:I

    .line 116
    .line 117
    if-nez v8, :cond_78

    .line 118
    .line 119
    iput v11, v7, Lax/H/e;->x:I

    .line 120
    .line 121
    :cond_78
    :goto_78
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 122
    .line 123
    if-ne v6, v8, :cond_8e

    .line 124
    .line 125
    iget v10, v7, Lax/H/e;->w:I

    .line 126
    .line 127
    if-ne v10, v12, :cond_8e

    .line 128
    .line 129
    iget-object v10, v7, Lax/H/e;->O:Lax/H/d;

    .line 130
    .line 131
    iget-object v10, v10, Lax/H/d;->f:Lax/H/d;

    .line 132
    .line 133
    if-eqz v10, :cond_8c

    .line 134
    .line 135
    iget-object v10, v7, Lax/H/e;->Q:Lax/H/d;

    .line 136
    .line 137
    iget-object v10, v10, Lax/H/d;->f:Lax/H/d;

    .line 138
    .line 139
    if-nez v10, :cond_8e

    .line 140
    .line 141
    :cond_8c
    sget-object v6, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 142
    .line 143
    :cond_8e
    if-ne v5, v8, :cond_a2

    .line 144
    .line 145
    iget v10, v7, Lax/H/e;->x:I

    .line 146
    .line 147
    if-ne v10, v12, :cond_a2

    .line 148
    .line 149
    iget-object v10, v7, Lax/H/e;->P:Lax/H/d;

    .line 150
    .line 151
    iget-object v10, v10, Lax/H/d;->f:Lax/H/d;

    .line 152
    .line 153
    if-eqz v10, :cond_a0

    .line 154
    .line 155
    iget-object v10, v7, Lax/H/e;->R:Lax/H/d;

    .line 156
    .line 157
    iget-object v10, v10, Lax/H/d;->f:Lax/H/d;

    .line 158
    .line 159
    if-nez v10, :cond_a2

    .line 160
    .line 161
    :cond_a0
    sget-object v5, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 162
    .line 163
    :cond_a2
    move-object v10, v5

    .line 164
    iget-object v5, v7, Lax/H/e;->e:Lax/I/l;

    .line 165
    .line 166
    iput-object v6, v5, Lax/I/p;->d:Lax/H/e$b;

    .line 167
    .line 168
    iget v14, v7, Lax/H/e;->w:I

    .line 169
    .line 170
    iput v14, v5, Lax/I/p;->a:I

    .line 171
    .line 172
    iget-object v5, v7, Lax/H/e;->f:Lax/I/n;

    .line 173
    .line 174
    iput-object v10, v5, Lax/I/p;->d:Lax/H/e$b;

    .line 175
    .line 176
    iget v15, v7, Lax/H/e;->x:I

    .line 177
    .line 178
    iput v15, v5, Lax/I/p;->a:I

    .line 179
    .line 180
    sget-object v5, Lax/H/e$b;->e0:Lax/H/e$b;

    .line 181
    .line 182
    const/16 v16, 0x0

    .line 183
    .line 184
    if-eq v6, v5, :cond_c1

    .line 185
    .line 186
    sget-object v3, Lax/H/e$b;->q:Lax/H/e$b;

    .line 187
    .line 188
    if-eq v6, v3, :cond_c1

    .line 189
    .line 190
    sget-object v3, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 191
    .line 192
    if-ne v6, v3, :cond_ce

    .line 193
    .line 194
    :cond_c1
    if-eq v10, v5, :cond_cb

    .line 195
    .line 196
    sget-object v3, Lax/H/e$b;->q:Lax/H/e$b;

    .line 197
    .line 198
    if-eq v10, v3, :cond_cb

    .line 199
    .line 200
    sget-object v3, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 201
    .line 202
    if-ne v10, v3, :cond_ce

    .line 203
    .line 204
    :cond_cb
    move-object v8, v6

    .line 205
    goto/16 :goto_2e7

    .line 206
    .line 207
    :cond_ce
    move-object v3, v8

    .line 208
    const/high16 v17, 0x3f000000    # 0.5f

    .line 209
    .line 210
    if-ne v6, v8, :cond_195

    .line 211
    .line 212
    sget-object v8, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 213
    .line 214
    const/high16 v18, 0x3f800000    # 1.0f

    .line 215
    .line 216
    if-eq v10, v8, :cond_dd

    .line 217
    .line 218
    sget-object v13, Lax/H/e$b;->q:Lax/H/e$b;

    .line 219
    .line 220
    if-ne v10, v13, :cond_197

    .line 221
    .line 222
    :cond_dd
    if-ne v14, v11, :cond_118

    .line 223
    .line 224
    if-ne v10, v8, :cond_e9

    .line 225
    .line 226
    const/4 v9, 0x0

    .line 227
    const/4 v11, 0x0

    .line 228
    move-object v10, v8

    .line 229
    move-object/from16 v6, p0

    .line 230
    .line 231
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 232
    .line 233
    .line 234
    :cond_e9
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    int-to-float v3, v11

    .line 239
    iget v5, v7, Lax/H/e;->d0:F

    .line 240
    .line 241
    mul-float v3, v3, v5

    .line 242
    .line 243
    add-float v3, v3, v17

    .line 244
    .line 245
    float-to-int v9, v3

    .line 246
    sget-object v8, Lax/H/e$b;->q:Lax/H/e$b;

    .line 247
    .line 248
    move-object v10, v8

    .line 249
    move-object/from16 v6, p0

    .line 250
    .line 251
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 252
    .line 253
    .line 254
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 255
    .line 256
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 257
    .line 258
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 263
    .line 264
    .line 265
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 266
    .line 267
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 268
    .line 269
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 274
    .line 275
    .line 276
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 277
    .line 278
    :cond_115
    :goto_115
    const/4 v3, 0x0

    .line 279
    goto/16 :goto_a

    .line 280
    .line 281
    :cond_118
    if-ne v14, v12, :cond_12c

    .line 282
    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v11, 0x0

    .line 285
    move-object/from16 v6, p0

    .line 286
    .line 287
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 288
    .line 289
    .line 290
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 291
    .line 292
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 293
    .line 294
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    iput v5, v3, Lax/I/g;->m:I

    .line 299
    .line 300
    goto :goto_115

    .line 301
    :cond_12c
    if-ne v14, v9, :cond_167

    .line 302
    .line 303
    iget-object v8, v0, Lax/H/e;->Z:[Lax/H/e$b;

    .line 304
    .line 305
    aget-object v8, v8, v16

    .line 306
    .line 307
    sget-object v13, Lax/H/e$b;->q:Lax/H/e$b;

    .line 308
    .line 309
    if-eq v8, v13, :cond_138

    .line 310
    .line 311
    if-ne v8, v5, :cond_197

    .line 312
    .line 313
    :cond_138
    iget v3, v7, Lax/H/e;->B:F

    .line 314
    .line 315
    invoke-virtual {v0}, Lax/H/e;->W()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    int-to-float v5, v5

    .line 320
    mul-float v3, v3, v5

    .line 321
    .line 322
    add-float v3, v3, v17

    .line 323
    .line 324
    float-to-int v9, v3

    .line 325
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    move-object/from16 v6, p0

    .line 330
    .line 331
    move-object v8, v13

    .line 332
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 333
    .line 334
    .line 335
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 336
    .line 337
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 338
    .line 339
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 344
    .line 345
    .line 346
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 347
    .line 348
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 349
    .line 350
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 355
    .line 356
    .line 357
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 358
    .line 359
    goto :goto_115

    .line 360
    :cond_167
    iget-object v13, v7, Lax/H/e;->W:[Lax/H/d;

    .line 361
    .line 362
    aget-object v9, v13, v16

    .line 363
    .line 364
    iget-object v9, v9, Lax/H/d;->f:Lax/H/d;

    .line 365
    .line 366
    if-eqz v9, :cond_175

    .line 367
    .line 368
    aget-object v9, v13, v12

    .line 369
    .line 370
    iget-object v9, v9, Lax/H/d;->f:Lax/H/d;

    .line 371
    .line 372
    if-nez v9, :cond_197

    .line 373
    .line 374
    :cond_175
    const/4 v9, 0x0

    .line 375
    const/4 v11, 0x0

    .line 376
    move-object/from16 v6, p0

    .line 377
    .line 378
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 379
    .line 380
    .line 381
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 382
    .line 383
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 384
    .line 385
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 390
    .line 391
    .line 392
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 393
    .line 394
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 395
    .line 396
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 401
    .line 402
    .line 403
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 404
    .line 405
    goto :goto_115

    .line 406
    :cond_195
    const/high16 v18, 0x3f800000    # 1.0f

    .line 407
    .line 408
    :cond_197
    if-ne v10, v3, :cond_1a2

    .line 409
    .line 410
    sget-object v8, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 411
    .line 412
    if-eq v6, v8, :cond_1a5

    .line 413
    .line 414
    sget-object v9, Lax/H/e$b;->q:Lax/H/e$b;

    .line 415
    .line 416
    if-ne v6, v9, :cond_1a2

    .line 417
    .line 418
    goto :goto_1a5

    .line 419
    :cond_1a2
    move-object v8, v6

    .line 420
    goto/16 :goto_275

    .line 421
    .line 422
    :cond_1a5
    :goto_1a5
    if-ne v15, v11, :cond_1e8

    .line 423
    .line 424
    if-ne v6, v8, :cond_1b1

    .line 425
    .line 426
    const/4 v9, 0x0

    .line 427
    const/4 v11, 0x0

    .line 428
    move-object v10, v8

    .line 429
    move-object/from16 v6, p0

    .line 430
    .line 431
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 432
    .line 433
    .line 434
    :cond_1b1
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    iget v3, v7, Lax/H/e;->d0:F

    .line 439
    .line 440
    invoke-virtual {v7}, Lax/H/e;->w()I

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    const/4 v6, -0x1

    .line 445
    if-ne v5, v6, :cond_1c0

    .line 446
    .line 447
    div-float v3, v18, v3

    .line 448
    .line 449
    :cond_1c0
    int-to-float v5, v9

    .line 450
    mul-float v5, v5, v3

    .line 451
    .line 452
    add-float v5, v5, v17

    .line 453
    .line 454
    float-to-int v11, v5

    .line 455
    sget-object v8, Lax/H/e$b;->q:Lax/H/e$b;

    .line 456
    .line 457
    move-object v10, v8

    .line 458
    move-object/from16 v6, p0

    .line 459
    .line 460
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 461
    .line 462
    .line 463
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 464
    .line 465
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 466
    .line 467
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 472
    .line 473
    .line 474
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 475
    .line 476
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 477
    .line 478
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 483
    .line 484
    .line 485
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 486
    .line 487
    goto/16 :goto_115

    .line 488
    .line 489
    :cond_1e8
    if-ne v15, v12, :cond_1ff

    .line 490
    .line 491
    const/4 v9, 0x0

    .line 492
    const/4 v11, 0x0

    .line 493
    move-object v10, v8

    .line 494
    move-object v8, v6

    .line 495
    move-object/from16 v6, p0

    .line 496
    .line 497
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 498
    .line 499
    .line 500
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 501
    .line 502
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 503
    .line 504
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    iput v5, v3, Lax/I/g;->m:I

    .line 509
    .line 510
    goto/16 :goto_115

    .line 511
    .line 512
    :cond_1ff
    move-object v9, v8

    .line 513
    move-object v8, v6

    .line 514
    const/4 v6, 0x2

    .line 515
    if-ne v15, v6, :cond_241

    .line 516
    .line 517
    iget-object v6, v0, Lax/H/e;->Z:[Lax/H/e$b;

    .line 518
    .line 519
    aget-object v6, v6, v12

    .line 520
    .line 521
    move-object v13, v10

    .line 522
    sget-object v10, Lax/H/e$b;->q:Lax/H/e$b;

    .line 523
    .line 524
    if-eq v6, v10, :cond_212

    .line 525
    .line 526
    if-ne v6, v5, :cond_210

    .line 527
    .line 528
    goto :goto_212

    .line 529
    :cond_210
    move-object v10, v13

    .line 530
    goto :goto_275

    .line 531
    :cond_212
    :goto_212
    iget v3, v7, Lax/H/e;->E:F

    .line 532
    .line 533
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    invoke-virtual {v0}, Lax/H/e;->x()I

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    int-to-float v5, v5

    .line 542
    mul-float v3, v3, v5

    .line 543
    .line 544
    add-float v3, v3, v17

    .line 545
    .line 546
    float-to-int v11, v3

    .line 547
    move-object/from16 v6, p0

    .line 548
    .line 549
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 550
    .line 551
    .line 552
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 553
    .line 554
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 555
    .line 556
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 557
    .line 558
    .line 559
    move-result v5

    .line 560
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 561
    .line 562
    .line 563
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 564
    .line 565
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 566
    .line 567
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 572
    .line 573
    .line 574
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 575
    .line 576
    goto/16 :goto_115

    .line 577
    .line 578
    :cond_241
    move-object v13, v10

    .line 579
    iget-object v5, v7, Lax/H/e;->W:[Lax/H/d;

    .line 580
    .line 581
    const/16 v19, 0x2

    .line 582
    .line 583
    aget-object v6, v5, v19

    .line 584
    .line 585
    iget-object v6, v6, Lax/H/d;->f:Lax/H/d;

    .line 586
    .line 587
    if-eqz v6, :cond_252

    .line 588
    .line 589
    aget-object v5, v5, v11

    .line 590
    .line 591
    iget-object v5, v5, Lax/H/d;->f:Lax/H/d;

    .line 592
    .line 593
    if-nez v5, :cond_210

    .line 594
    .line 595
    :cond_252
    move-object v8, v9

    .line 596
    const/4 v9, 0x0

    .line 597
    const/4 v11, 0x0

    .line 598
    move-object/from16 v6, p0

    .line 599
    .line 600
    move-object v10, v13

    .line 601
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 602
    .line 603
    .line 604
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 605
    .line 606
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 607
    .line 608
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 613
    .line 614
    .line 615
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 616
    .line 617
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 618
    .line 619
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 624
    .line 625
    .line 626
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 627
    .line 628
    goto/16 :goto_115

    .line 629
    .line 630
    :goto_275
    if-ne v8, v3, :cond_115

    .line 631
    .line 632
    if-ne v10, v3, :cond_115

    .line 633
    .line 634
    if-eq v14, v12, :cond_2c7

    .line 635
    .line 636
    if-ne v15, v12, :cond_27e

    .line 637
    .line 638
    goto :goto_2c7

    .line 639
    :cond_27e
    const/4 v6, 0x2

    .line 640
    if-ne v15, v6, :cond_115

    .line 641
    .line 642
    if-ne v14, v6, :cond_115

    .line 643
    .line 644
    iget-object v3, v0, Lax/H/e;->Z:[Lax/H/e$b;

    .line 645
    .line 646
    aget-object v5, v3, v16

    .line 647
    .line 648
    sget-object v8, Lax/H/e$b;->q:Lax/H/e$b;

    .line 649
    .line 650
    if-ne v5, v8, :cond_115

    .line 651
    .line 652
    aget-object v3, v3, v12

    .line 653
    .line 654
    if-ne v3, v8, :cond_115

    .line 655
    .line 656
    iget v3, v7, Lax/H/e;->B:F

    .line 657
    .line 658
    iget v5, v7, Lax/H/e;->E:F

    .line 659
    .line 660
    invoke-virtual {v0}, Lax/H/e;->W()I

    .line 661
    .line 662
    .line 663
    move-result v6

    .line 664
    int-to-float v6, v6

    .line 665
    mul-float v3, v3, v6

    .line 666
    .line 667
    add-float v3, v3, v17

    .line 668
    .line 669
    float-to-int v9, v3

    .line 670
    invoke-virtual {v0}, Lax/H/e;->x()I

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    int-to-float v3, v3

    .line 675
    mul-float v5, v5, v3

    .line 676
    .line 677
    add-float v5, v5, v17

    .line 678
    .line 679
    float-to-int v11, v5

    .line 680
    move-object v10, v8

    .line 681
    move-object/from16 v6, p0

    .line 682
    .line 683
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 684
    .line 685
    .line 686
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 687
    .line 688
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 689
    .line 690
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 695
    .line 696
    .line 697
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 698
    .line 699
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 700
    .line 701
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 706
    .line 707
    .line 708
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 709
    .line 710
    goto/16 :goto_115

    .line 711
    .line 712
    :cond_2c7
    :goto_2c7
    sget-object v8, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 713
    .line 714
    const/4 v9, 0x0

    .line 715
    const/4 v11, 0x0

    .line 716
    move-object v10, v8

    .line 717
    move-object/from16 v6, p0

    .line 718
    .line 719
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 720
    .line 721
    .line 722
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 723
    .line 724
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 725
    .line 726
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 727
    .line 728
    .line 729
    move-result v5

    .line 730
    iput v5, v3, Lax/I/g;->m:I

    .line 731
    .line 732
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 733
    .line 734
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 735
    .line 736
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    iput v5, v3, Lax/I/g;->m:I

    .line 741
    .line 742
    goto/16 :goto_115

    .line 743
    .line 744
    :goto_2e7
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-ne v8, v5, :cond_2fe

    .line 749
    .line 750
    invoke-virtual {v0}, Lax/H/e;->W()I

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    iget-object v6, v7, Lax/H/e;->O:Lax/H/d;

    .line 755
    .line 756
    iget v6, v6, Lax/H/d;->g:I

    .line 757
    .line 758
    sub-int/2addr v3, v6

    .line 759
    iget-object v6, v7, Lax/H/e;->Q:Lax/H/d;

    .line 760
    .line 761
    iget v6, v6, Lax/H/d;->g:I

    .line 762
    .line 763
    sub-int/2addr v3, v6

    .line 764
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 765
    .line 766
    move-object v8, v6

    .line 767
    :cond_2fe
    move v9, v3

    .line 768
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    if-ne v10, v5, :cond_315

    .line 773
    .line 774
    invoke-virtual {v0}, Lax/H/e;->x()I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    iget-object v5, v7, Lax/H/e;->P:Lax/H/d;

    .line 779
    .line 780
    iget v5, v5, Lax/H/d;->g:I

    .line 781
    .line 782
    sub-int/2addr v3, v5

    .line 783
    iget-object v5, v7, Lax/H/e;->R:Lax/H/d;

    .line 784
    .line 785
    iget v5, v5, Lax/H/d;->g:I

    .line 786
    .line 787
    sub-int/2addr v3, v5

    .line 788
    sget-object v10, Lax/H/e$b;->q:Lax/H/e$b;

    .line 789
    .line 790
    :cond_315
    move-object/from16 v6, p0

    .line 791
    .line 792
    move v11, v3

    .line 793
    invoke-direct/range {v6 .. v11}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 794
    .line 795
    .line 796
    iget-object v3, v7, Lax/H/e;->e:Lax/I/l;

    .line 797
    .line 798
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 799
    .line 800
    invoke-virtual {v7}, Lax/H/e;->W()I

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 805
    .line 806
    .line 807
    iget-object v3, v7, Lax/H/e;->f:Lax/I/n;

    .line 808
    .line 809
    iget-object v3, v3, Lax/I/p;->e:Lax/I/g;

    .line 810
    .line 811
    invoke-virtual {v7}, Lax/H/e;->x()I

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    invoke-virtual {v3, v5}, Lax/I/g;->d(I)V

    .line 816
    .line 817
    .line 818
    iput-boolean v12, v7, Lax/H/e;->a:Z

    .line 819
    .line 820
    goto/16 :goto_115

    .line 821
    .line 822
    :cond_335
    const/16 v16, 0x0

    .line 823
    .line 824
    return v16
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
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private e(Lax/H/f;I)I
    .registers 9

    .line 1
    iget-object v0, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_9
    if-ge v3, v0, :cond_1e

    .line 11
    .line 12
    iget-object v4, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lax/I/m;

    .line 19
    .line 20
    invoke-virtual {v4, p1, p2}, Lax/I/m;->b(Lax/H/f;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_9

    .line 31
    :cond_1e
    long-to-int p1, v1

    .line 32
    return p1
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

.method private i(Lax/I/p;ILjava/util/ArrayList;)V
    .registers 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/I/p;",
            "I",
            "Ljava/util/ArrayList<",
            "Lax/I/m;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lax/I/p;->h:Lax/I/f;

    .line 4
    .line 5
    iget-object v1, v1, Lax/I/f;->k:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_a
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_42

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lax/I/d;

    .line 22
    .line 23
    instance-of v3, v2, Lax/I/f;

    .line 24
    .line 25
    if-eqz v3, :cond_2b

    .line 26
    .line 27
    move-object v5, v2

    .line 28
    check-cast v5, Lax/I/f;

    .line 29
    .line 30
    iget-object v8, v0, Lax/I/p;->i:Lax/I/f;

    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    move-object/from16 v4, p0

    .line 35
    .line 36
    move/from16 v6, p2

    .line 37
    .line 38
    move-object/from16 v9, p3

    .line 39
    .line 40
    invoke-direct/range {v4 .. v10}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 41
    .line 42
    .line 43
    goto :goto_a

    .line 44
    :cond_2b
    instance-of v3, v2, Lax/I/p;

    .line 45
    .line 46
    if-eqz v3, :cond_a

    .line 47
    .line 48
    check-cast v2, Lax/I/p;

    .line 49
    .line 50
    iget-object v12, v2, Lax/I/p;->h:Lax/I/f;

    .line 51
    .line 52
    iget-object v15, v0, Lax/I/p;->i:Lax/I/f;

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const/4 v14, 0x0

    .line 57
    move-object/from16 v11, p0

    .line 58
    .line 59
    move/from16 v13, p2

    .line 60
    .line 61
    move-object/from16 v16, p3

    .line 62
    .line 63
    invoke-direct/range {v11 .. v17}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 64
    .line 65
    .line 66
    goto :goto_a

    .line 67
    :cond_42
    iget-object v1, v0, Lax/I/p;->i:Lax/I/f;

    .line 68
    .line 69
    iget-object v1, v1, Lax/I/f;->k:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_4a
    :goto_4a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_83

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lax/I/d;

    .line 86
    .line 87
    instance-of v3, v2, Lax/I/f;

    .line 88
    .line 89
    if-eqz v3, :cond_6c

    .line 90
    .line 91
    move-object v12, v2

    .line 92
    check-cast v12, Lax/I/f;

    .line 93
    .line 94
    iget-object v15, v0, Lax/I/p;->h:Lax/I/f;

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/4 v14, 0x1

    .line 99
    move-object/from16 v11, p0

    .line 100
    .line 101
    move/from16 v13, p2

    .line 102
    .line 103
    move-object/from16 v16, p3

    .line 104
    .line 105
    invoke-direct/range {v11 .. v17}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4a

    .line 109
    :cond_6c
    instance-of v3, v2, Lax/I/p;

    .line 110
    .line 111
    if-eqz v3, :cond_4a

    .line 112
    .line 113
    check-cast v2, Lax/I/p;

    .line 114
    .line 115
    iget-object v12, v2, Lax/I/p;->i:Lax/I/f;

    .line 116
    .line 117
    iget-object v15, v0, Lax/I/p;->h:Lax/I/f;

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    const/4 v14, 0x1

    .line 122
    move-object/from16 v11, p0

    .line 123
    .line 124
    move/from16 v13, p2

    .line 125
    .line 126
    move-object/from16 v16, p3

    .line 127
    .line 128
    invoke-direct/range {v11 .. v17}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 129
    .line 130
    .line 131
    goto :goto_4a

    .line 132
    :cond_83
    const/4 v1, 0x1

    .line 133
    move/from16 v13, p2

    .line 134
    .line 135
    if-ne v13, v1, :cond_b3

    .line 136
    .line 137
    check-cast v0, Lax/I/n;

    .line 138
    .line 139
    iget-object v0, v0, Lax/I/n;->k:Lax/I/f;

    .line 140
    .line 141
    iget-object v0, v0, Lax/I/f;->k:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_92
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_b3

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Lax/I/d;

    .line 158
    .line 159
    instance-of v2, v1, Lax/I/f;

    .line 160
    .line 161
    if-eqz v2, :cond_b0

    .line 162
    .line 163
    move-object v12, v1

    .line 164
    check-cast v12, Lax/I/f;

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const/4 v14, 0x2

    .line 170
    move-object/from16 v11, p0

    .line 171
    .line 172
    move-object/from16 v16, p3

    .line 173
    .line 174
    invoke-direct/range {v11 .. v17}, Lax/I/e;->a(Lax/I/f;IILax/I/f;Ljava/util/ArrayList;Lax/I/m;)V

    .line 175
    .line 176
    .line 177
    :cond_b0
    move/from16 v13, p2

    .line 178
    .line 179
    goto :goto_92

    .line 180
    :cond_b3
    return-void
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

.method private l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 2
    .line 3
    iput-object p2, v0, Lax/I/b$a;->a:Lax/H/e$b;

    .line 4
    .line 5
    iput-object p4, v0, Lax/I/b$a;->b:Lax/H/e$b;

    .line 6
    .line 7
    iput p3, v0, Lax/I/b$a;->c:I

    .line 8
    .line 9
    iput p5, v0, Lax/I/b$a;->d:I

    .line 10
    .line 11
    iget-object p2, p0, Lax/I/e;->g:Lax/I/b$b;

    .line 12
    .line 13
    invoke-interface {p2, p1, v0}, Lax/I/b$b;->a(Lax/H/e;Lax/I/b$a;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 17
    .line 18
    iget p2, p2, Lax/I/b$a;->e:I

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lax/H/e;->k1(I)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 24
    .line 25
    iget p2, p2, Lax/I/b$a;->f:I

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lax/H/e;->L0(I)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 31
    .line 32
    iget-boolean p2, p2, Lax/I/b$a;->h:Z

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lax/H/e;->K0(Z)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lax/I/e;->h:Lax/I/b$a;

    .line 38
    .line 39
    iget p2, p2, Lax/I/b$a;->g:I

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lax/H/e;->A0(I)V

    .line 42
    .line 43
    .line 44
    return-void
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


# virtual methods
.method public c()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/I/e;->d(Ljava/util/ArrayList;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    sput v0, Lax/I/m;->h:I

    .line 13
    .line 14
    iget-object v1, p0, Lax/I/e;->a:Lax/H/f;

    .line 15
    .line 16
    iget-object v1, v1, Lax/H/e;->e:Lax/I/l;

    .line 17
    .line 18
    iget-object v2, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p0, v1, v0, v2}, Lax/I/e;->i(Lax/I/p;ILjava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lax/I/e;->a:Lax/H/f;

    .line 24
    .line 25
    iget-object v1, v1, Lax/H/e;->f:Lax/I/n;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    iget-object v3, p0, Lax/I/e;->i:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p0, v1, v2, v3}, Lax/I/e;->i(Lax/I/p;ILjava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    iput-boolean v0, p0, Lax/I/e;->b:Z

    .line 34
    .line 35
    return-void
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

.method public d(Ljava/util/ArrayList;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/I/p;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 5
    .line 6
    iget-object v0, v0, Lax/H/e;->e:Lax/I/l;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/I/l;->f()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 12
    .line 13
    iget-object v0, v0, Lax/H/e;->f:Lax/I/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/I/n;->f()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 19
    .line 20
    iget-object v0, v0, Lax/H/e;->e:Lax/I/l;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 26
    .line 27
    iget-object v0, v0, Lax/H/e;->f:Lax/I/n;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 33
    .line 34
    iget-object v0, v0, Lax/H/m;->L0:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    :cond_2a
    :goto_2a
    if-ge v4, v1, :cond_95

    .line 44
    .line 45
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    check-cast v5, Lax/H/e;

    .line 52
    .line 53
    instance-of v6, v5, Lax/H/h;

    .line 54
    .line 55
    if-eqz v6, :cond_41

    .line 56
    .line 57
    new-instance v6, Lax/I/j;

    .line 58
    .line 59
    invoke-direct {v6, v5}, Lax/I/j;-><init>(Lax/H/e;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_2a

    .line 66
    :cond_41
    invoke-virtual {v5}, Lax/H/e;->i0()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_5f

    .line 71
    .line 72
    iget-object v6, v5, Lax/H/e;->c:Lax/I/c;

    .line 73
    .line 74
    if-nez v6, :cond_52

    .line 75
    .line 76
    new-instance v6, Lax/I/c;

    .line 77
    .line 78
    invoke-direct {v6, v5, v3}, Lax/I/c;-><init>(Lax/H/e;I)V

    .line 79
    .line 80
    .line 81
    iput-object v6, v5, Lax/H/e;->c:Lax/I/c;

    .line 82
    .line 83
    :cond_52
    if-nez v2, :cond_59

    .line 84
    .line 85
    new-instance v2, Ljava/util/HashSet;

    .line 86
    .line 87
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 88
    .line 89
    .line 90
    :cond_59
    iget-object v6, v5, Lax/H/e;->c:Lax/I/c;

    .line 91
    .line 92
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_64

    .line 96
    :cond_5f
    iget-object v6, v5, Lax/H/e;->e:Lax/I/l;

    .line 97
    .line 98
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :goto_64
    invoke-virtual {v5}, Lax/H/e;->k0()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_83

    .line 106
    .line 107
    iget-object v6, v5, Lax/H/e;->d:Lax/I/c;

    .line 108
    .line 109
    if-nez v6, :cond_76

    .line 110
    .line 111
    new-instance v6, Lax/I/c;

    .line 112
    .line 113
    const/4 v7, 0x1

    .line 114
    invoke-direct {v6, v5, v7}, Lax/I/c;-><init>(Lax/H/e;I)V

    .line 115
    .line 116
    .line 117
    iput-object v6, v5, Lax/H/e;->d:Lax/I/c;

    .line 118
    .line 119
    :cond_76
    if-nez v2, :cond_7d

    .line 120
    .line 121
    new-instance v2, Ljava/util/HashSet;

    .line 122
    .line 123
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 124
    .line 125
    .line 126
    :cond_7d
    iget-object v6, v5, Lax/H/e;->d:Lax/I/c;

    .line 127
    .line 128
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_88

    .line 132
    :cond_83
    iget-object v6, v5, Lax/H/e;->f:Lax/I/n;

    .line 133
    .line 134
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_88
    instance-of v6, v5, Lax/H/j;

    .line 138
    .line 139
    if-eqz v6, :cond_2a

    .line 140
    .line 141
    new-instance v6, Lax/I/k;

    .line 142
    .line 143
    invoke-direct {v6, v5}, Lax/I/k;-><init>(Lax/H/e;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_2a

    .line 150
    :cond_95
    if-eqz v2, :cond_9a

    .line 151
    .line 152
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 153
    .line 154
    .line 155
    :cond_9a
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/4 v1, 0x0

    .line 160
    :goto_9f
    if-ge v1, v0, :cond_ad

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    add-int/lit8 v1, v1, 0x1

    .line 167
    .line 168
    check-cast v2, Lax/I/p;

    .line 169
    .line 170
    invoke-virtual {v2}, Lax/I/p;->f()V

    .line 171
    .line 172
    .line 173
    goto :goto_9f

    .line 174
    :cond_ad
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    :goto_b1
    if-ge v3, v0, :cond_c6

    .line 179
    .line 180
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    add-int/lit8 v3, v3, 0x1

    .line 185
    .line 186
    check-cast v1, Lax/I/p;

    .line 187
    .line 188
    iget-object v2, v1, Lax/I/p;->b:Lax/H/e;

    .line 189
    .line 190
    iget-object v4, p0, Lax/I/e;->d:Lax/H/f;

    .line 191
    .line 192
    if-ne v2, v4, :cond_c2

    .line 193
    .line 194
    goto :goto_b1

    .line 195
    :cond_c2
    invoke-virtual {v1}, Lax/I/p;->d()V

    .line 196
    .line 197
    .line 198
    goto :goto_b1

    .line 199
    :cond_c6
    return-void
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
.end method

.method public f(Z)Z
    .registers 12

    .line 1
    iget-boolean v0, p0, Lax/I/e;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_9

    .line 5
    .line 6
    iget-boolean v0, p0, Lax/I/e;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_43

    .line 9
    .line 10
    :cond_9
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 11
    .line 12
    iget-object v0, v0, Lax/H/m;->L0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_12
    if-ge v3, v2, :cond_2c

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, Lax/H/e;

    .line 28
    .line 29
    invoke-virtual {v4}, Lax/H/e;->n()V

    .line 30
    .line 31
    .line 32
    iput-boolean v1, v4, Lax/H/e;->a:Z

    .line 33
    .line 34
    iget-object v5, v4, Lax/H/e;->e:Lax/I/l;

    .line 35
    .line 36
    invoke-virtual {v5}, Lax/I/l;->r()V

    .line 37
    .line 38
    .line 39
    iget-object v4, v4, Lax/H/e;->f:Lax/I/n;

    .line 40
    .line 41
    invoke-virtual {v4}, Lax/I/n;->q()V

    .line 42
    .line 43
    .line 44
    goto :goto_12

    .line 45
    :cond_2c
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 46
    .line 47
    invoke-virtual {v0}, Lax/H/e;->n()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 51
    .line 52
    iput-boolean v1, v0, Lax/H/e;->a:Z

    .line 53
    .line 54
    iget-object v0, v0, Lax/H/e;->e:Lax/I/l;

    .line 55
    .line 56
    invoke-virtual {v0}, Lax/I/l;->r()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 60
    .line 61
    iget-object v0, v0, Lax/H/e;->f:Lax/I/n;

    .line 62
    .line 63
    invoke-virtual {v0}, Lax/I/n;->q()V

    .line 64
    .line 65
    .line 66
    iput-boolean v1, p0, Lax/I/e;->c:Z

    .line 67
    .line 68
    :cond_43
    iget-object v0, p0, Lax/I/e;->d:Lax/H/f;

    .line 69
    .line 70
    invoke-direct {p0, v0}, Lax/I/e;->b(Lax/H/f;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4c

    .line 75
    .line 76
    return v1

    .line 77
    :cond_4c
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lax/H/e;->m1(I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lax/H/e;->n1(I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lax/H/e;->u(I)Lax/H/e$b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v2, p0, Lax/I/e;->a:Lax/H/f;

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    invoke-virtual {v2, v3}, Lax/H/e;->u(I)Lax/H/e$b;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-boolean v4, p0, Lax/I/e;->b:Z

    .line 101
    .line 102
    if-eqz v4, :cond_6a

    .line 103
    .line 104
    invoke-virtual {p0}, Lax/I/e;->c()V

    .line 105
    .line 106
    .line 107
    :cond_6a
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 108
    .line 109
    invoke-virtual {v4}, Lax/H/e;->X()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    iget-object v5, p0, Lax/I/e;->a:Lax/H/f;

    .line 114
    .line 115
    invoke-virtual {v5}, Lax/H/e;->Y()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 120
    .line 121
    iget-object v6, v6, Lax/H/e;->e:Lax/I/l;

    .line 122
    .line 123
    iget-object v6, v6, Lax/I/p;->h:Lax/I/f;

    .line 124
    .line 125
    invoke-virtual {v6, v4}, Lax/I/f;->d(I)V

    .line 126
    .line 127
    .line 128
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 129
    .line 130
    iget-object v6, v6, Lax/H/e;->f:Lax/I/n;

    .line 131
    .line 132
    iget-object v6, v6, Lax/I/p;->h:Lax/I/f;

    .line 133
    .line 134
    invoke-virtual {v6, v5}, Lax/I/f;->d(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lax/I/e;->m()V

    .line 138
    .line 139
    .line 140
    sget-object v6, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 141
    .line 142
    if-eq v0, v6, :cond_91

    .line 143
    .line 144
    if-ne v2, v6, :cond_f1

    .line 145
    .line 146
    :cond_91
    if-eqz p1, :cond_ab

    .line 147
    .line 148
    iget-object v6, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    const/4 v8, 0x0

    .line 155
    :cond_9a
    if-ge v8, v7, :cond_ab

    .line 156
    .line 157
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    add-int/lit8 v8, v8, 0x1

    .line 162
    .line 163
    check-cast v9, Lax/I/p;

    .line 164
    .line 165
    invoke-virtual {v9}, Lax/I/p;->m()Z

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-nez v9, :cond_9a

    .line 170
    .line 171
    const/4 p1, 0x0

    .line 172
    :cond_ab
    if-eqz p1, :cond_ce

    .line 173
    .line 174
    sget-object v6, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 175
    .line 176
    if-ne v0, v6, :cond_ce

    .line 177
    .line 178
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 179
    .line 180
    sget-object v7, Lax/H/e$b;->q:Lax/H/e$b;

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Lax/H/e;->P0(Lax/H/e$b;)V

    .line 183
    .line 184
    .line 185
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 186
    .line 187
    invoke-direct {p0, v6, v1}, Lax/I/e;->e(Lax/H/f;I)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    invoke-virtual {v6, v7}, Lax/H/e;->k1(I)V

    .line 192
    .line 193
    .line 194
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 195
    .line 196
    iget-object v7, v6, Lax/H/e;->e:Lax/I/l;

    .line 197
    .line 198
    iget-object v7, v7, Lax/I/p;->e:Lax/I/g;

    .line 199
    .line 200
    invoke-virtual {v6}, Lax/H/e;->W()I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-virtual {v7, v6}, Lax/I/g;->d(I)V

    .line 205
    .line 206
    .line 207
    :cond_ce
    if-eqz p1, :cond_f1

    .line 208
    .line 209
    sget-object p1, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 210
    .line 211
    if-ne v2, p1, :cond_f1

    .line 212
    .line 213
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 214
    .line 215
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 216
    .line 217
    invoke-virtual {p1, v6}, Lax/H/e;->g1(Lax/H/e$b;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 221
    .line 222
    invoke-direct {p0, p1, v3}, Lax/I/e;->e(Lax/H/f;I)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    invoke-virtual {p1, v6}, Lax/H/e;->L0(I)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 230
    .line 231
    iget-object v6, p1, Lax/H/e;->f:Lax/I/n;

    .line 232
    .line 233
    iget-object v6, v6, Lax/I/p;->e:Lax/I/g;

    .line 234
    .line 235
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    invoke-virtual {v6, p1}, Lax/I/g;->d(I)V

    .line 240
    .line 241
    .line 242
    :cond_f1
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 243
    .line 244
    iget-object v6, p1, Lax/H/e;->Z:[Lax/H/e$b;

    .line 245
    .line 246
    aget-object v6, v6, v1

    .line 247
    .line 248
    sget-object v7, Lax/H/e$b;->q:Lax/H/e$b;

    .line 249
    .line 250
    if-eq v6, v7, :cond_102

    .line 251
    .line 252
    sget-object v8, Lax/H/e$b;->e0:Lax/H/e$b;

    .line 253
    .line 254
    if-ne v6, v8, :cond_100

    .line 255
    .line 256
    goto :goto_102

    .line 257
    :cond_100
    const/4 p1, 0x0

    .line 258
    goto :goto_145

    .line 259
    :cond_102
    :goto_102
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    add-int/2addr p1, v4

    .line 264
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 265
    .line 266
    iget-object v6, v6, Lax/H/e;->e:Lax/I/l;

    .line 267
    .line 268
    iget-object v6, v6, Lax/I/p;->i:Lax/I/f;

    .line 269
    .line 270
    invoke-virtual {v6, p1}, Lax/I/f;->d(I)V

    .line 271
    .line 272
    .line 273
    iget-object v6, p0, Lax/I/e;->a:Lax/H/f;

    .line 274
    .line 275
    iget-object v6, v6, Lax/H/e;->e:Lax/I/l;

    .line 276
    .line 277
    iget-object v6, v6, Lax/I/p;->e:Lax/I/g;

    .line 278
    .line 279
    sub-int/2addr p1, v4

    .line 280
    invoke-virtual {v6, p1}, Lax/I/g;->d(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0}, Lax/I/e;->m()V

    .line 284
    .line 285
    .line 286
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 287
    .line 288
    iget-object v4, p1, Lax/H/e;->Z:[Lax/H/e$b;

    .line 289
    .line 290
    aget-object v4, v4, v3

    .line 291
    .line 292
    if-eq v4, v7, :cond_129

    .line 293
    .line 294
    sget-object v6, Lax/H/e$b;->e0:Lax/H/e$b;

    .line 295
    .line 296
    if-ne v4, v6, :cond_141

    .line 297
    .line 298
    :cond_129
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    add-int/2addr p1, v5

    .line 303
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 304
    .line 305
    iget-object v4, v4, Lax/H/e;->f:Lax/I/n;

    .line 306
    .line 307
    iget-object v4, v4, Lax/I/p;->i:Lax/I/f;

    .line 308
    .line 309
    invoke-virtual {v4, p1}, Lax/I/f;->d(I)V

    .line 310
    .line 311
    .line 312
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 313
    .line 314
    iget-object v4, v4, Lax/H/e;->f:Lax/I/n;

    .line 315
    .line 316
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 317
    .line 318
    sub-int/2addr p1, v5

    .line 319
    invoke-virtual {v4, p1}, Lax/I/g;->d(I)V

    .line 320
    .line 321
    .line 322
    :cond_141
    invoke-virtual {p0}, Lax/I/e;->m()V

    .line 323
    .line 324
    .line 325
    const/4 p1, 0x1

    .line 326
    :goto_145
    iget-object v4, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    const/4 v6, 0x0

    .line 333
    :goto_14c
    if-ge v6, v5, :cond_165

    .line 334
    .line 335
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    add-int/lit8 v6, v6, 0x1

    .line 340
    .line 341
    check-cast v7, Lax/I/p;

    .line 342
    .line 343
    iget-object v8, v7, Lax/I/p;->b:Lax/H/e;

    .line 344
    .line 345
    iget-object v9, p0, Lax/I/e;->a:Lax/H/f;

    .line 346
    .line 347
    if-ne v8, v9, :cond_161

    .line 348
    .line 349
    iget-boolean v8, v7, Lax/I/p;->g:Z

    .line 350
    .line 351
    if-nez v8, :cond_161

    .line 352
    .line 353
    goto :goto_14c

    .line 354
    :cond_161
    invoke-virtual {v7}, Lax/I/p;->e()V

    .line 355
    .line 356
    .line 357
    goto :goto_14c

    .line 358
    :cond_165
    iget-object v4, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    const/4 v6, 0x0

    .line 365
    :cond_16c
    :goto_16c
    if-ge v6, v5, :cond_1a0

    .line 366
    .line 367
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    add-int/lit8 v6, v6, 0x1

    .line 372
    .line 373
    check-cast v7, Lax/I/p;

    .line 374
    .line 375
    if-nez p1, :cond_17f

    .line 376
    .line 377
    iget-object v8, v7, Lax/I/p;->b:Lax/H/e;

    .line 378
    .line 379
    iget-object v9, p0, Lax/I/e;->a:Lax/H/f;

    .line 380
    .line 381
    if-ne v8, v9, :cond_17f

    .line 382
    .line 383
    goto :goto_16c

    .line 384
    :cond_17f
    iget-object v8, v7, Lax/I/p;->h:Lax/I/f;

    .line 385
    .line 386
    iget-boolean v8, v8, Lax/I/f;->j:Z

    .line 387
    .line 388
    if-nez v8, :cond_186

    .line 389
    .line 390
    goto :goto_1a1

    .line 391
    :cond_186
    iget-object v8, v7, Lax/I/p;->i:Lax/I/f;

    .line 392
    .line 393
    iget-boolean v8, v8, Lax/I/f;->j:Z

    .line 394
    .line 395
    if-nez v8, :cond_191

    .line 396
    .line 397
    instance-of v8, v7, Lax/I/j;

    .line 398
    .line 399
    if-nez v8, :cond_191

    .line 400
    .line 401
    goto :goto_1a1

    .line 402
    :cond_191
    iget-object v8, v7, Lax/I/p;->e:Lax/I/g;

    .line 403
    .line 404
    iget-boolean v8, v8, Lax/I/f;->j:Z

    .line 405
    .line 406
    if-nez v8, :cond_16c

    .line 407
    .line 408
    instance-of v8, v7, Lax/I/c;

    .line 409
    .line 410
    if-nez v8, :cond_16c

    .line 411
    .line 412
    instance-of v7, v7, Lax/I/j;

    .line 413
    .line 414
    if-nez v7, :cond_16c

    .line 415
    .line 416
    goto :goto_1a1

    .line 417
    :cond_1a0
    const/4 v1, 0x1

    .line 418
    :goto_1a1
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 419
    .line 420
    invoke-virtual {p1, v0}, Lax/H/e;->P0(Lax/H/e$b;)V

    .line 421
    .line 422
    .line 423
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 424
    .line 425
    invoke-virtual {p1, v2}, Lax/H/e;->g1(Lax/H/e$b;)V

    .line 426
    .line 427
    .line 428
    return v1
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
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
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public g(Z)Z
    .registers 8

    .line 1
    iget-boolean p1, p0, Lax/I/e;->b:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_58

    .line 5
    .line 6
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 7
    .line 8
    iget-object p1, p1, Lax/H/m;->L0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_e
    if-ge v2, v1, :cond_34

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    check-cast v3, Lax/H/e;

    .line 24
    .line 25
    invoke-virtual {v3}, Lax/H/e;->n()V

    .line 26
    .line 27
    .line 28
    iput-boolean v0, v3, Lax/H/e;->a:Z

    .line 29
    .line 30
    iget-object v4, v3, Lax/H/e;->e:Lax/I/l;

    .line 31
    .line 32
    iget-object v5, v4, Lax/I/p;->e:Lax/I/g;

    .line 33
    .line 34
    iput-boolean v0, v5, Lax/I/f;->j:Z

    .line 35
    .line 36
    iput-boolean v0, v4, Lax/I/p;->g:Z

    .line 37
    .line 38
    invoke-virtual {v4}, Lax/I/l;->r()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v3, Lax/H/e;->f:Lax/I/n;

    .line 42
    .line 43
    iget-object v4, v3, Lax/I/p;->e:Lax/I/g;

    .line 44
    .line 45
    iput-boolean v0, v4, Lax/I/f;->j:Z

    .line 46
    .line 47
    iput-boolean v0, v3, Lax/I/p;->g:Z

    .line 48
    .line 49
    invoke-virtual {v3}, Lax/I/n;->q()V

    .line 50
    .line 51
    .line 52
    goto :goto_e

    .line 53
    :cond_34
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 54
    .line 55
    invoke-virtual {p1}, Lax/H/e;->n()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 59
    .line 60
    iput-boolean v0, p1, Lax/H/e;->a:Z

    .line 61
    .line 62
    iget-object p1, p1, Lax/H/e;->e:Lax/I/l;

    .line 63
    .line 64
    iget-object v1, p1, Lax/I/p;->e:Lax/I/g;

    .line 65
    .line 66
    iput-boolean v0, v1, Lax/I/f;->j:Z

    .line 67
    .line 68
    iput-boolean v0, p1, Lax/I/p;->g:Z

    .line 69
    .line 70
    invoke-virtual {p1}, Lax/I/l;->r()V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 74
    .line 75
    iget-object p1, p1, Lax/H/e;->f:Lax/I/n;

    .line 76
    .line 77
    iget-object v1, p1, Lax/I/p;->e:Lax/I/g;

    .line 78
    .line 79
    iput-boolean v0, v1, Lax/I/f;->j:Z

    .line 80
    .line 81
    iput-boolean v0, p1, Lax/I/p;->g:Z

    .line 82
    .line 83
    invoke-virtual {p1}, Lax/I/n;->q()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lax/I/e;->c()V

    .line 87
    .line 88
    .line 89
    :cond_58
    iget-object p1, p0, Lax/I/e;->d:Lax/H/f;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lax/I/e;->b(Lax/H/f;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_61

    .line 96
    .line 97
    return v0

    .line 98
    :cond_61
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lax/H/e;->m1(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lax/H/e;->n1(I)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 109
    .line 110
    iget-object p1, p1, Lax/H/e;->e:Lax/I/l;

    .line 111
    .line 112
    iget-object p1, p1, Lax/I/p;->h:Lax/I/f;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Lax/I/f;->d(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 118
    .line 119
    iget-object p1, p1, Lax/H/e;->f:Lax/I/n;

    .line 120
    .line 121
    iget-object p1, p1, Lax/I/p;->h:Lax/I/f;

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lax/I/f;->d(I)V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x1

    .line 127
    return p1
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

.method public h(ZI)Z
    .registers 14

    .line 1
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lax/H/e;->u(I)Lax/H/e$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Lax/I/e;->a:Lax/H/f;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {v2, v3}, Lax/H/e;->u(I)Lax/H/e$b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 16
    .line 17
    invoke-virtual {v4}, Lax/H/e;->X()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget-object v5, p0, Lax/I/e;->a:Lax/H/f;

    .line 22
    .line 23
    invoke-virtual {v5}, Lax/H/e;->Y()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz p1, :cond_87

    .line 28
    .line 29
    sget-object v6, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 30
    .line 31
    if-eq v0, v6, :cond_22

    .line 32
    .line 33
    if-ne v2, v6, :cond_87

    .line 34
    .line 35
    :cond_22
    iget-object v6, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    const/4 v8, 0x0

    .line 42
    :cond_29
    if-ge v8, v7, :cond_3e

    .line 43
    .line 44
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    add-int/lit8 v8, v8, 0x1

    .line 49
    .line 50
    check-cast v9, Lax/I/p;

    .line 51
    .line 52
    iget v10, v9, Lax/I/p;->f:I

    .line 53
    .line 54
    if-ne v10, p2, :cond_29

    .line 55
    .line 56
    invoke-virtual {v9}, Lax/I/p;->m()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-nez v9, :cond_29

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    :cond_3e
    if-nez p2, :cond_64

    .line 64
    .line 65
    if-eqz p1, :cond_87

    .line 66
    .line 67
    sget-object p1, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 68
    .line 69
    if-ne v0, p1, :cond_87

    .line 70
    .line 71
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 72
    .line 73
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 74
    .line 75
    invoke-virtual {p1, v6}, Lax/H/e;->P0(Lax/H/e$b;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 79
    .line 80
    invoke-direct {p0, p1, v1}, Lax/I/e;->e(Lax/H/f;I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {p1, v6}, Lax/H/e;->k1(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 88
    .line 89
    iget-object v6, p1, Lax/H/e;->e:Lax/I/l;

    .line 90
    .line 91
    iget-object v6, v6, Lax/I/p;->e:Lax/I/g;

    .line 92
    .line 93
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {v6, p1}, Lax/I/g;->d(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_87

    .line 101
    :cond_64
    if-eqz p1, :cond_87

    .line 102
    .line 103
    sget-object p1, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 104
    .line 105
    if-ne v2, p1, :cond_87

    .line 106
    .line 107
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 108
    .line 109
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 110
    .line 111
    invoke-virtual {p1, v6}, Lax/H/e;->g1(Lax/H/e$b;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 115
    .line 116
    invoke-direct {p0, p1, v3}, Lax/I/e;->e(Lax/H/f;I)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    invoke-virtual {p1, v6}, Lax/H/e;->L0(I)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 124
    .line 125
    iget-object v6, p1, Lax/H/e;->f:Lax/I/n;

    .line 126
    .line 127
    iget-object v6, v6, Lax/I/p;->e:Lax/I/g;

    .line 128
    .line 129
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {v6, p1}, Lax/I/g;->d(I)V

    .line 134
    .line 135
    .line 136
    :cond_87
    :goto_87
    if-nez p2, :cond_b1

    .line 137
    .line 138
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 139
    .line 140
    iget-object v5, p1, Lax/H/e;->Z:[Lax/H/e$b;

    .line 141
    .line 142
    aget-object v5, v5, v1

    .line 143
    .line 144
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 145
    .line 146
    if-eq v5, v6, :cond_97

    .line 147
    .line 148
    sget-object v6, Lax/H/e$b;->e0:Lax/H/e$b;

    .line 149
    .line 150
    if-ne v5, v6, :cond_c0

    .line 151
    .line 152
    :cond_97
    invoke-virtual {p1}, Lax/H/e;->W()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    add-int/2addr p1, v4

    .line 157
    iget-object v5, p0, Lax/I/e;->a:Lax/H/f;

    .line 158
    .line 159
    iget-object v5, v5, Lax/H/e;->e:Lax/I/l;

    .line 160
    .line 161
    iget-object v5, v5, Lax/I/p;->i:Lax/I/f;

    .line 162
    .line 163
    invoke-virtual {v5, p1}, Lax/I/f;->d(I)V

    .line 164
    .line 165
    .line 166
    iget-object v5, p0, Lax/I/e;->a:Lax/H/f;

    .line 167
    .line 168
    iget-object v5, v5, Lax/H/e;->e:Lax/I/l;

    .line 169
    .line 170
    iget-object v5, v5, Lax/I/p;->e:Lax/I/g;

    .line 171
    .line 172
    sub-int/2addr p1, v4

    .line 173
    invoke-virtual {v5, p1}, Lax/I/g;->d(I)V

    .line 174
    .line 175
    .line 176
    :goto_af
    const/4 p1, 0x1

    .line 177
    goto :goto_db

    .line 178
    :cond_b1
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 179
    .line 180
    iget-object v4, p1, Lax/H/e;->Z:[Lax/H/e$b;

    .line 181
    .line 182
    aget-object v4, v4, v3

    .line 183
    .line 184
    sget-object v6, Lax/H/e$b;->q:Lax/H/e$b;

    .line 185
    .line 186
    if-eq v4, v6, :cond_c2

    .line 187
    .line 188
    sget-object v6, Lax/H/e$b;->e0:Lax/H/e$b;

    .line 189
    .line 190
    if-ne v4, v6, :cond_c0

    .line 191
    .line 192
    goto :goto_c2

    .line 193
    :cond_c0
    const/4 p1, 0x0

    .line 194
    goto :goto_db

    .line 195
    :cond_c2
    :goto_c2
    invoke-virtual {p1}, Lax/H/e;->x()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    add-int/2addr p1, v5

    .line 200
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 201
    .line 202
    iget-object v4, v4, Lax/H/e;->f:Lax/I/n;

    .line 203
    .line 204
    iget-object v4, v4, Lax/I/p;->i:Lax/I/f;

    .line 205
    .line 206
    invoke-virtual {v4, p1}, Lax/I/f;->d(I)V

    .line 207
    .line 208
    .line 209
    iget-object v4, p0, Lax/I/e;->a:Lax/H/f;

    .line 210
    .line 211
    iget-object v4, v4, Lax/H/e;->f:Lax/I/n;

    .line 212
    .line 213
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 214
    .line 215
    sub-int/2addr p1, v5

    .line 216
    invoke-virtual {v4, p1}, Lax/I/g;->d(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_af

    .line 220
    :goto_db
    invoke-virtual {p0}, Lax/I/e;->m()V

    .line 221
    .line 222
    .line 223
    iget-object v4, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    const/4 v6, 0x0

    .line 230
    :goto_e5
    if-ge v6, v5, :cond_103

    .line 231
    .line 232
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    add-int/lit8 v6, v6, 0x1

    .line 237
    .line 238
    check-cast v7, Lax/I/p;

    .line 239
    .line 240
    iget v8, v7, Lax/I/p;->f:I

    .line 241
    .line 242
    if-eq v8, p2, :cond_f4

    .line 243
    .line 244
    goto :goto_e5

    .line 245
    :cond_f4
    iget-object v8, v7, Lax/I/p;->b:Lax/H/e;

    .line 246
    .line 247
    iget-object v9, p0, Lax/I/e;->a:Lax/H/f;

    .line 248
    .line 249
    if-ne v8, v9, :cond_ff

    .line 250
    .line 251
    iget-boolean v8, v7, Lax/I/p;->g:Z

    .line 252
    .line 253
    if-nez v8, :cond_ff

    .line 254
    .line 255
    goto :goto_e5

    .line 256
    :cond_ff
    invoke-virtual {v7}, Lax/I/p;->e()V

    .line 257
    .line 258
    .line 259
    goto :goto_e5

    .line 260
    :cond_103
    iget-object v4, p0, Lax/I/e;->e:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    const/4 v6, 0x0

    .line 267
    :cond_10a
    :goto_10a
    if-ge v6, v5, :cond_13b

    .line 268
    .line 269
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    add-int/lit8 v6, v6, 0x1

    .line 274
    .line 275
    check-cast v7, Lax/I/p;

    .line 276
    .line 277
    iget v8, v7, Lax/I/p;->f:I

    .line 278
    .line 279
    if-eq v8, p2, :cond_119

    .line 280
    .line 281
    goto :goto_10a

    .line 282
    :cond_119
    if-nez p1, :cond_122

    .line 283
    .line 284
    iget-object v8, v7, Lax/I/p;->b:Lax/H/e;

    .line 285
    .line 286
    iget-object v9, p0, Lax/I/e;->a:Lax/H/f;

    .line 287
    .line 288
    if-ne v8, v9, :cond_122

    .line 289
    .line 290
    goto :goto_10a

    .line 291
    :cond_122
    iget-object v8, v7, Lax/I/p;->h:Lax/I/f;

    .line 292
    .line 293
    iget-boolean v8, v8, Lax/I/f;->j:Z

    .line 294
    .line 295
    if-nez v8, :cond_129

    .line 296
    .line 297
    goto :goto_13c

    .line 298
    :cond_129
    iget-object v8, v7, Lax/I/p;->i:Lax/I/f;

    .line 299
    .line 300
    iget-boolean v8, v8, Lax/I/f;->j:Z

    .line 301
    .line 302
    if-nez v8, :cond_130

    .line 303
    .line 304
    goto :goto_13c

    .line 305
    :cond_130
    instance-of v8, v7, Lax/I/c;

    .line 306
    .line 307
    if-nez v8, :cond_10a

    .line 308
    .line 309
    iget-object v7, v7, Lax/I/p;->e:Lax/I/g;

    .line 310
    .line 311
    iget-boolean v7, v7, Lax/I/f;->j:Z

    .line 312
    .line 313
    if-nez v7, :cond_10a

    .line 314
    .line 315
    goto :goto_13c

    .line 316
    :cond_13b
    const/4 v1, 0x1

    .line 317
    :goto_13c
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 318
    .line 319
    invoke-virtual {p1, v0}, Lax/H/e;->P0(Lax/H/e$b;)V

    .line 320
    .line 321
    .line 322
    iget-object p1, p0, Lax/I/e;->a:Lax/H/f;

    .line 323
    .line 324
    invoke-virtual {p1, v2}, Lax/H/e;->g1(Lax/H/e$b;)V

    .line 325
    .line 326
    .line 327
    return v1
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

.method public j()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/I/e;->b:Z

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

.method public k()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/I/e;->c:Z

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

.method public m()V
    .registers 16

    .line 1
    iget-object v0, p0, Lax/I/e;->a:Lax/H/f;

    .line 2
    .line 3
    iget-object v0, v0, Lax/H/m;->L0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :cond_a
    :goto_a
    if-ge v3, v1, :cond_c6

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    move-object v6, v4

    .line 20
    check-cast v6, Lax/H/e;

    .line 21
    .line 22
    iget-boolean v4, v6, Lax/H/e;->a:Z

    .line 23
    .line 24
    if-eqz v4, :cond_1a

    .line 25
    .line 26
    goto :goto_a

    .line 27
    :cond_1a
    iget-object v4, v6, Lax/H/e;->Z:[Lax/H/e$b;

    .line 28
    .line 29
    aget-object v11, v4, v2

    .line 30
    .line 31
    const/4 v12, 0x1

    .line 32
    aget-object v4, v4, v12

    .line 33
    .line 34
    iget v5, v6, Lax/H/e;->w:I

    .line 35
    .line 36
    iget v7, v6, Lax/H/e;->x:I

    .line 37
    .line 38
    sget-object v9, Lax/H/e$b;->c0:Lax/H/e$b;

    .line 39
    .line 40
    if-eq v11, v9, :cond_32

    .line 41
    .line 42
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 43
    .line 44
    if-ne v11, v8, :cond_30

    .line 45
    .line 46
    if-ne v5, v12, :cond_30

    .line 47
    .line 48
    goto :goto_32

    .line 49
    :cond_30
    const/4 v5, 0x0

    .line 50
    goto :goto_33

    .line 51
    :cond_32
    :goto_32
    const/4 v5, 0x1

    .line 52
    :goto_33
    if-eq v4, v9, :cond_3e

    .line 53
    .line 54
    sget-object v8, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 55
    .line 56
    if-ne v4, v8, :cond_3c

    .line 57
    .line 58
    if-ne v7, v12, :cond_3c

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    const/4 v7, 0x0

    .line 62
    goto :goto_3f

    .line 63
    :cond_3e
    :goto_3e
    const/4 v7, 0x1

    .line 64
    :goto_3f
    iget-object v8, v6, Lax/H/e;->e:Lax/I/l;

    .line 65
    .line 66
    iget-object v8, v8, Lax/I/p;->e:Lax/I/g;

    .line 67
    .line 68
    iget-boolean v10, v8, Lax/I/f;->j:Z

    .line 69
    .line 70
    iget-object v13, v6, Lax/H/e;->f:Lax/I/n;

    .line 71
    .line 72
    iget-object v13, v13, Lax/I/p;->e:Lax/I/g;

    .line 73
    .line 74
    iget-boolean v14, v13, Lax/I/f;->j:Z

    .line 75
    .line 76
    if-eqz v10, :cond_5d

    .line 77
    .line 78
    if-eqz v14, :cond_5d

    .line 79
    .line 80
    sget-object v7, Lax/H/e$b;->q:Lax/H/e$b;

    .line 81
    .line 82
    iget v8, v8, Lax/I/f;->g:I

    .line 83
    .line 84
    iget v10, v13, Lax/I/f;->g:I

    .line 85
    .line 86
    move-object v9, v7

    .line 87
    move-object v5, p0

    .line 88
    invoke-direct/range {v5 .. v10}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 89
    .line 90
    .line 91
    iput-boolean v12, v6, Lax/H/e;->a:Z

    .line 92
    .line 93
    goto :goto_b3

    .line 94
    :cond_5d
    if-eqz v10, :cond_88

    .line 95
    .line 96
    if-eqz v7, :cond_88

    .line 97
    .line 98
    sget-object v7, Lax/H/e$b;->q:Lax/H/e$b;

    .line 99
    .line 100
    iget v8, v8, Lax/I/f;->g:I

    .line 101
    .line 102
    iget v10, v13, Lax/I/f;->g:I

    .line 103
    .line 104
    move-object v5, p0

    .line 105
    invoke-direct/range {v5 .. v10}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 106
    .line 107
    .line 108
    sget-object v5, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 109
    .line 110
    if-ne v4, v5, :cond_7a

    .line 111
    .line 112
    iget-object v4, v6, Lax/H/e;->f:Lax/I/n;

    .line 113
    .line 114
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 115
    .line 116
    invoke-virtual {v6}, Lax/H/e;->x()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    iput v5, v4, Lax/I/g;->m:I

    .line 121
    .line 122
    goto :goto_b3

    .line 123
    :cond_7a
    iget-object v4, v6, Lax/H/e;->f:Lax/I/n;

    .line 124
    .line 125
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 126
    .line 127
    invoke-virtual {v6}, Lax/H/e;->x()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-virtual {v4, v5}, Lax/I/g;->d(I)V

    .line 132
    .line 133
    .line 134
    iput-boolean v12, v6, Lax/H/e;->a:Z

    .line 135
    .line 136
    goto :goto_b3

    .line 137
    :cond_88
    move-object v7, v9

    .line 138
    if-eqz v14, :cond_b3

    .line 139
    .line 140
    if-eqz v5, :cond_b3

    .line 141
    .line 142
    iget v8, v8, Lax/I/f;->g:I

    .line 143
    .line 144
    sget-object v9, Lax/H/e$b;->q:Lax/H/e$b;

    .line 145
    .line 146
    iget v10, v13, Lax/I/f;->g:I

    .line 147
    .line 148
    move-object v5, p0

    .line 149
    invoke-direct/range {v5 .. v10}, Lax/I/e;->l(Lax/H/e;Lax/H/e$b;ILax/H/e$b;I)V

    .line 150
    .line 151
    .line 152
    sget-object v4, Lax/H/e$b;->d0:Lax/H/e$b;

    .line 153
    .line 154
    if-ne v11, v4, :cond_a6

    .line 155
    .line 156
    iget-object v4, v6, Lax/H/e;->e:Lax/I/l;

    .line 157
    .line 158
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 159
    .line 160
    invoke-virtual {v6}, Lax/H/e;->W()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    iput v5, v4, Lax/I/g;->m:I

    .line 165
    .line 166
    goto :goto_b3

    .line 167
    :cond_a6
    iget-object v4, v6, Lax/H/e;->e:Lax/I/l;

    .line 168
    .line 169
    iget-object v4, v4, Lax/I/p;->e:Lax/I/g;

    .line 170
    .line 171
    invoke-virtual {v6}, Lax/H/e;->W()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-virtual {v4, v5}, Lax/I/g;->d(I)V

    .line 176
    .line 177
    .line 178
    iput-boolean v12, v6, Lax/H/e;->a:Z

    .line 179
    .line 180
    :cond_b3
    :goto_b3
    iget-boolean v4, v6, Lax/H/e;->a:Z

    .line 181
    .line 182
    if-eqz v4, :cond_a

    .line 183
    .line 184
    iget-object v4, v6, Lax/H/e;->f:Lax/I/n;

    .line 185
    .line 186
    iget-object v4, v4, Lax/I/n;->l:Lax/I/g;

    .line 187
    .line 188
    if-eqz v4, :cond_a

    .line 189
    .line 190
    invoke-virtual {v6}, Lax/H/e;->p()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-virtual {v4, v5}, Lax/I/g;->d(I)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_c6
    return-void
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

.method public n(Lax/I/b$b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/I/e;->g:Lax/I/b$b;

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
.end method
