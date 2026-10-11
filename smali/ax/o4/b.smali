.class Lax/o4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/b$l;,
        Lax/o4/b$o;,
        Lax/o4/b$k;,
        Lax/o4/b$i;,
        Lax/o4/b$n;,
        Lax/o4/b$m;,
        Lax/o4/b$h;,
        Lax/o4/b$g;,
        Lax/o4/b$q;,
        Lax/o4/b$d;,
        Lax/o4/b$s;,
        Lax/o4/b$p;,
        Lax/o4/b$u;,
        Lax/o4/b$r;,
        Lax/o4/b$t;,
        Lax/o4/b$b;,
        Lax/o4/b$j;,
        Lax/o4/b$c;,
        Lax/o4/b$e;,
        Lax/o4/b$f;
    }
.end annotation


# instance fields
.field private a:Lax/o4/b$f;

.field private b:Lax/o4/b$u;

.field private c:Z


# direct methods
.method constructor <init>(Lax/o4/b$f;Lax/o4/b$u;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/o4/b;->c:Z

    .line 6
    .line 7
    iput-object p1, p0, Lax/o4/b;->a:Lax/o4/b$f;

    .line 8
    .line 9
    iput-object p2, p0, Lax/o4/b;->b:Lax/o4/b$u;

    .line 10
    .line 11
    return-void
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

.method private static a(Ljava/util/List;ILax/o4/g$L;)I
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/o4/g$J;",
            ">;I",
            "Lax/o4/g$L;",
            ")I"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p1, p2, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq p0, p1, :cond_e

    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    invoke-interface {p1}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_28

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lax/o4/g$N;

    .line 34
    .line 35
    if-ne p1, p2, :cond_25

    .line 36
    .line 37
    return v0

    .line 38
    :cond_25
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_16

    .line 41
    :cond_28
    return v1
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

.method static b(Ljava/lang/String;Lax/o4/b$f;)Z
    .registers 3

    .line 1
    new-instance v0, Lax/o4/b$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/b$d;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lax/o4/b;->h(Lax/o4/b$d;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1}, Lax/o4/b;->c(Ljava/util/List;Lax/o4/b$f;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
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

.method private static c(Ljava/util/List;Lax/o4/b$f;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/o4/b$f;",
            ">;",
            "Lax/o4/b$f;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_18

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/o4/b$f;

    .line 16
    .line 17
    sget-object v1, Lax/o4/b$f;->q:Lax/o4/b$f;

    .line 18
    .line 19
    if-eq v0, v1, :cond_16

    .line 20
    .line 21
    if-ne v0, p1, :cond_4

    .line 22
    .line 23
    :cond_16
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_18
    const/4 p0, 0x0

    .line 26
    return p0
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

.method private e(Lax/o4/b$r;Lax/o4/b$d;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p2}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 8
    .line 9
    .line 10
    if-eqz v2, :cond_ab

    .line 11
    .line 12
    iget-boolean v3, p0, Lax/o4/b;->c:Z

    .line 13
    .line 14
    const-string v4, "Invalid @media rule: expected \'}\' at end of rule set"

    .line 15
    .line 16
    if-nez v3, :cond_5c

    .line 17
    .line 18
    const-string v3, "media"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_5c

    .line 25
    .line 26
    invoke-static {p2}, Lax/o4/b;->h(Lax/o4/b$d;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/16 v3, 0x7b

    .line 31
    .line 32
    invoke-virtual {p2, v3}, Lax/o4/k$i;->f(C)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_54

    .line 37
    .line 38
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Lax/o4/b;->a:Lax/o4/b$f;

    .line 42
    .line 43
    invoke-static {v2, v3}, Lax/o4/b;->c(Ljava/util/List;Lax/o4/b$f;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3c

    .line 48
    .line 49
    iput-boolean v1, p0, Lax/o4/b;->c:Z

    .line 50
    .line 51
    invoke-direct {p0, p2}, Lax/o4/b;->j(Lax/o4/b$d;)Lax/o4/b$r;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v1}, Lax/o4/b$r;->b(Lax/o4/b$r;)V

    .line 56
    .line 57
    .line 58
    iput-boolean v0, p0, Lax/o4/b;->c:Z

    .line 59
    .line 60
    goto :goto_3f

    .line 61
    :cond_3c
    invoke-direct {p0, p2}, Lax/o4/b;->j(Lax/o4/b$d;)Lax/o4/b$r;

    .line 62
    .line 63
    .line 64
    :goto_3f
    invoke-virtual {p2}, Lax/o4/k$i;->h()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_a7

    .line 69
    .line 70
    const/16 p1, 0x7d

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Lax/o4/k$i;->f(C)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4e

    .line 77
    .line 78
    goto :goto_a7

    .line 79
    :cond_4e
    new-instance p1, Lax/o4/a;

    .line 80
    .line 81
    invoke-direct {p1, v4}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_54
    new-instance p1, Lax/o4/a;

    .line 86
    .line 87
    const-string p2, "Invalid @media rule: missing rule set"

    .line 88
    .line 89
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_5c
    iget-boolean p1, p0, Lax/o4/b;->c:Z

    .line 94
    .line 95
    if-nez p1, :cond_9b

    .line 96
    .line 97
    const-string p1, "import"

    .line 98
    .line 99
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_9b

    .line 104
    .line 105
    invoke-virtual {p2}, Lax/o4/b$d;->N()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-nez p1, :cond_72

    .line 110
    .line 111
    invoke-virtual {p2}, Lax/o4/b$d;->F()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :cond_72
    if-eqz p1, :cond_93

    .line 116
    .line 117
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 118
    .line 119
    .line 120
    invoke-static {p2}, Lax/o4/b;->h(Lax/o4/b$d;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Lax/o4/k$i;->h()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8f

    .line 128
    .line 129
    const/16 p1, 0x3b

    .line 130
    .line 131
    invoke-virtual {p2, p1}, Lax/o4/k$i;->f(C)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_89

    .line 136
    .line 137
    goto :goto_8f

    .line 138
    :cond_89
    new-instance p1, Lax/o4/a;

    .line 139
    .line 140
    invoke-direct {p1, v4}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_8f
    :goto_8f
    invoke-static {}, Lax/o4/g;->k()Lax/o4/i;

    .line 145
    .line 146
    .line 147
    goto :goto_a7

    .line 148
    :cond_93
    new-instance p1, Lax/o4/a;

    .line 149
    .line 150
    const-string p2, "Invalid @import rule: expected string or url()"

    .line 151
    .line 152
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_9b
    const-string p1, "Ignoring @%s rule"

    .line 157
    .line 158
    new-array v1, v1, [Ljava/lang/Object;

    .line 159
    .line 160
    aput-object v2, v1, v0

    .line 161
    .line 162
    invoke-static {p1, v1}, Lax/o4/b;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, p2}, Lax/o4/b;->o(Lax/o4/b$d;)V

    .line 166
    .line 167
    .line 168
    :cond_a7
    :goto_a7
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_ab
    new-instance p1, Lax/o4/a;

    .line 173
    .line 174
    const-string p2, "Invalid \'@\' rule"

    .line 175
    .line 176
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
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

.method public static f(Ljava/lang/String;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/b$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/b$d;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    :goto_6
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_21

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_13

    .line 18
    .line 19
    goto :goto_6

    .line 20
    :cond_13
    if-nez p0, :cond_1a

    .line 21
    .line 22
    new-instance p0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 31
    .line 32
    .line 33
    goto :goto_6

    .line 34
    :cond_21
    return-object p0
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

.method private g(Lax/o4/b$d;)Lax/o4/g$E;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/g$E;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/g$E;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_5
    invoke-virtual {p1}, Lax/o4/b$d;->H()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x3a

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Lax/o4/k$i;->f(C)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_61

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lax/o4/b$d;->J()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_59

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 31
    .line 32
    .line 33
    const/16 v3, 0x21

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lax/o4/k$i;->f(C)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3f

    .line 40
    .line 41
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 42
    .line 43
    .line 44
    const-string v3, "important"

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_37

    .line 51
    .line 52
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 53
    .line 54
    .line 55
    goto :goto_3f

    .line 56
    :cond_37
    new-instance p1, Lax/o4/a;

    .line 57
    .line 58
    const-string v0, "Malformed rule set: found unexpected \'!\'"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_3f
    :goto_3f
    const/16 v3, 0x3b

    .line 65
    .line 66
    invoke-virtual {p1, v3}, Lax/o4/k$i;->f(C)Z

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Lax/o4/k;->S0(Lax/o4/g$E;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lax/o4/k$i;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_58

    .line 80
    .line 81
    const/16 v1, 0x7d

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Lax/o4/k$i;->f(C)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    :cond_58
    return-object v0

    .line 90
    :cond_59
    new-instance p1, Lax/o4/a;

    .line 91
    .line 92
    const-string v0, "Expected property value"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_61
    new-instance p1, Lax/o4/a;

    .line 99
    .line 100
    const-string v0, "Expected \':\'"

    .line 101
    .line 102
    invoke-direct {p1, v0}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
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

.method private static h(Lax/o4/b$d;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/b$d;",
            ")",
            "Ljava/util/List<",
            "Lax/o4/b$f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_5
    invoke-virtual {p0}, Lax/o4/k$i;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_21

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/o4/k$i;->w()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_12

    .line 17
    .line 18
    goto :goto_21

    .line 19
    :cond_12
    :try_start_12
    invoke-static {v1}, Lax/o4/b$f;->valueOf(Ljava/lang/String;)Lax/o4/b$f;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_19
    .catch Ljava/lang/IllegalArgumentException; {:try_start_12 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    goto :goto_1b

    .line 27
    :catch_1a
    nop

    .line 28
    :goto_1b
    invoke-virtual {p0}, Lax/o4/k$i;->z()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_5

    .line 33
    .line 34
    :cond_21
    :goto_21
    return-object v0
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

.method private i(Lax/o4/b$r;Lax/o4/b$d;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/a;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/o4/b$d;->B(Lax/o4/b$d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_43

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_43

    .line 12
    .line 13
    const/16 v1, 0x7b

    .line 14
    .line 15
    invoke-virtual {p2, v1}, Lax/o4/k$i;->f(C)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3b

    .line 20
    .line 21
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p2}, Lax/o4/b;->g(Lax/o4/b$d;)Lax/o4/g$E;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p2}, Lax/o4/k$i;->A()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    :goto_22
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_39

    .line 40
    .line 41
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lax/o4/b$s;

    .line 46
    .line 47
    new-instance v2, Lax/o4/b$p;

    .line 48
    .line 49
    iget-object v3, p0, Lax/o4/b;->b:Lax/o4/b$u;

    .line 50
    .line 51
    invoke-direct {v2, v0, v1, v3}, Lax/o4/b$p;-><init>(Lax/o4/b$s;Lax/o4/g$E;Lax/o4/b$u;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v2}, Lax/o4/b$r;->a(Lax/o4/b$p;)V

    .line 55
    .line 56
    .line 57
    goto :goto_22

    .line 58
    :cond_39
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_3b
    new-instance p1, Lax/o4/a;

    .line 61
    .line 62
    const-string p2, "Malformed rule block: expected \'{\'"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Lax/o4/a;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_43
    const/4 p1, 0x0

    .line 69
    return p1
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

.method private j(Lax/o4/b$d;)Lax/o4/b$r;
    .registers 5

    .line 1
    new-instance v0, Lax/o4/b$r;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/b$r;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_5
    :try_start_5
    invoke-virtual {p1}, Lax/o4/k$i;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_4c

    .line 11
    .line 12
    const-string v1, "<!--"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_14

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_14
    const-string v1, "-->"

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1d

    .line 28
    .line 29
    goto :goto_5

    .line 30
    :cond_1d
    const/16 v1, 0x40

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lax/o4/k$i;->f(C)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2b

    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/b;->e(Lax/o4/b$r;Lax/o4/b$d;)V

    .line 39
    .line 40
    .line 41
    goto :goto_5

    .line 42
    :catch_29
    move-exception p1

    .line 43
    goto :goto_32

    .line 44
    :cond_2b
    invoke-direct {p0, v0, p1}, Lax/o4/b;->i(Lax/o4/b$r;Lax/o4/b$d;)Z

    .line 45
    .line 46
    .line 47
    move-result v1
    :try_end_2f
    .catch Lax/o4/a; {:try_start_5 .. :try_end_2f} :catch_29

    .line 48
    if-eqz v1, :cond_4c

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :goto_32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "CSS parser terminated early due to error: "

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v1, "CSSParser"

    .line 73
    .line 74
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    :cond_4c
    return-object v0
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

.method private static k(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;ILax/o4/g$L;)Z
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/b$q;",
            "Lax/o4/b$s;",
            "I",
            "Ljava/util/List<",
            "Lax/o4/g$J;",
            ">;I",
            "Lax/o4/g$L;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lax/o4/b$s;->e(I)Lax/o4/b$t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0, p3, p4, p5}, Lax/o4/b;->n(Lax/o4/b$q;Lax/o4/b$t;Ljava/util/List;ILax/o4/g$L;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    iget-object v0, v0, Lax/o4/b$t;->a:Lax/o4/b$e;

    .line 14
    .line 15
    sget-object v1, Lax/o4/b$e;->q:Lax/o4/b$e;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne v0, v1, :cond_25

    .line 19
    .line 20
    if-nez p2, :cond_16

    .line 21
    .line 22
    return v3

    .line 23
    :cond_16
    :goto_16
    if-ltz p4, :cond_24

    .line 24
    .line 25
    add-int/lit8 p5, p2, -0x1

    .line 26
    .line 27
    invoke-static {p0, p1, p5, p3, p4}, Lax/o4/b;->m(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;I)Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-eqz p5, :cond_21

    .line 32
    .line 33
    return v3

    .line 34
    :cond_21
    add-int/lit8 p4, p4, -0x1

    .line 35
    .line 36
    goto :goto_16

    .line 37
    :cond_24
    return v2

    .line 38
    :cond_25
    sget-object v1, Lax/o4/b$e;->c0:Lax/o4/b$e;

    .line 39
    .line 40
    if-ne v0, v1, :cond_2f

    .line 41
    .line 42
    sub-int/2addr p2, v3

    .line 43
    invoke-static {p0, p1, p2, p3, p4}, Lax/o4/b;->m(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_2f
    invoke-static {p3, p4, p5}, Lax/o4/b;->a(Ljava/util/List;ILax/o4/g$L;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-gtz v0, :cond_36

    .line 53
    .line 54
    return v2

    .line 55
    :cond_36
    iget-object p5, p5, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 56
    .line 57
    invoke-interface {p5}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p5

    .line 61
    sub-int/2addr v0, v3

    .line 62
    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    move-object v9, p5

    .line 67
    check-cast v9, Lax/o4/g$L;

    .line 68
    .line 69
    add-int/lit8 v6, p2, -0x1

    .line 70
    .line 71
    move-object v4, p0

    .line 72
    move-object v5, p1

    .line 73
    move-object v7, p3

    .line 74
    move v8, p4

    .line 75
    invoke-static/range {v4 .. v9}, Lax/o4/b;->k(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;ILax/o4/g$L;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0
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

.method static l(Lax/o4/b$q;Lax/o4/b$s;Lax/o4/g$L;)Z
    .registers 9

    .line 1
    new-instance v3, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 7
    .line 8
    :goto_7
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_12

    .line 10
    .line 11
    invoke-interface {v3, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Lax/o4/g$N;

    .line 15
    .line 16
    iget-object v0, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 17
    .line 18
    goto :goto_7

    .line 19
    :cond_12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    add-int/lit8 v4, v0, -0x1

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/o4/b$s;->g()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ne v0, v2, :cond_28

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lax/o4/b$s;->e(I)Lax/o4/b$t;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p0, p1, v3, v4, p2}, Lax/o4/b;->n(Lax/o4/b$q;Lax/o4/b$t;Ljava/util/List;ILax/o4/g$L;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :cond_28
    invoke-virtual {p1}, Lax/o4/b$s;->g()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/lit8 v2, v0, -0x1

    .line 46
    .line 47
    move-object v0, p0

    .line 48
    move-object v1, p1

    .line 49
    move-object v5, p2

    .line 50
    invoke-static/range {v0 .. v5}, Lax/o4/b;->k(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;ILax/o4/g$L;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
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

.method private static m(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;I)Z
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/b$q;",
            "Lax/o4/b$s;",
            "I",
            "Ljava/util/List<",
            "Lax/o4/g$J;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lax/o4/b$s;->e(I)Lax/o4/b$t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lax/o4/g$L;

    .line 10
    .line 11
    invoke-static {p0, v0, p3, p4, v1}, Lax/o4/b;->n(Lax/o4/b$q;Lax/o4/b$t;Ljava/util/List;ILax/o4/g$L;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v3

    .line 19
    :cond_12
    iget-object v0, v0, Lax/o4/b$t;->a:Lax/o4/b$e;

    .line 20
    .line 21
    sget-object v2, Lax/o4/b$e;->q:Lax/o4/b$e;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-ne v0, v2, :cond_2a

    .line 25
    .line 26
    if-nez p2, :cond_1c

    .line 27
    .line 28
    return v4

    .line 29
    :cond_1c
    if-lez p4, :cond_29

    .line 30
    .line 31
    add-int/lit8 v0, p2, -0x1

    .line 32
    .line 33
    add-int/lit8 p4, p4, -0x1

    .line 34
    .line 35
    invoke-static {p0, p1, v0, p3, p4}, Lax/o4/b;->m(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1c

    .line 40
    .line 41
    return v4

    .line 42
    :cond_29
    return v3

    .line 43
    :cond_2a
    sget-object v2, Lax/o4/b$e;->c0:Lax/o4/b$e;

    .line 44
    .line 45
    if-ne v0, v2, :cond_35

    .line 46
    .line 47
    sub-int/2addr p2, v4

    .line 48
    sub-int/2addr p4, v4

    .line 49
    invoke-static {p0, p1, p2, p3, p4}, Lax/o4/b;->m(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;I)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0

    .line 54
    :cond_35
    invoke-static {p3, p4, v1}, Lax/o4/b;->a(Ljava/util/List;ILax/o4/g$L;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-gtz v0, :cond_3c

    .line 59
    .line 60
    return v3

    .line 61
    :cond_3c
    iget-object v1, v1, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 62
    .line 63
    invoke-interface {v1}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sub-int/2addr v0, v4

    .line 68
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move-object v10, v0

    .line 73
    check-cast v10, Lax/o4/g$L;

    .line 74
    .line 75
    add-int/lit8 v7, p2, -0x1

    .line 76
    .line 77
    move-object v5, p0

    .line 78
    move-object v6, p1

    .line 79
    move-object v8, p3

    .line 80
    move v9, p4

    .line 81
    invoke-static/range {v5 .. v10}, Lax/o4/b;->k(Lax/o4/b$q;Lax/o4/b$s;ILjava/util/List;ILax/o4/g$L;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0
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

.method private static n(Lax/o4/b$q;Lax/o4/b$t;Ljava/util/List;ILax/o4/g$L;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/b$q;",
            "Lax/o4/b$t;",
            "Ljava/util/List<",
            "Lax/o4/g$J;",
            ">;I",
            "Lax/o4/g$L;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-object p2, p1, Lax/o4/b$t;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    if-eqz p2, :cond_16

    .line 5
    .line 6
    invoke-virtual {p4}, Lax/o4/g$N;->o()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_16

    .line 21
    .line 22
    return p3

    .line 23
    :cond_16
    iget-object p2, p1, Lax/o4/b$t;->c:Ljava/util/List;

    .line 24
    .line 25
    if-eqz p2, :cond_59

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :cond_1e
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_59

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lax/o4/b$b;

    .line 42
    .line 43
    iget-object v1, v0, Lax/o4/b$b;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v2, "id"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_4e

    .line 55
    .line 56
    const-string v2, "class"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_40

    .line 63
    .line 64
    return p3

    .line 65
    :cond_40
    iget-object v1, p4, Lax/o4/g$L;->g:Ljava/util/List;

    .line 66
    .line 67
    if-nez v1, :cond_45

    .line 68
    .line 69
    return p3

    .line 70
    :cond_45
    iget-object v0, v0, Lax/o4/b$b;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_1e

    .line 77
    .line 78
    return p3

    .line 79
    :cond_4e
    iget-object v0, v0, Lax/o4/b$b;->c:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, p4, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_1e

    .line 88
    .line 89
    return p3

    .line 90
    :cond_59
    iget-object p1, p1, Lax/o4/b$t;->d:Ljava/util/List;

    .line 91
    .line 92
    if-eqz p1, :cond_74

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :cond_61
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_74

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    check-cast p2, Lax/o4/b$g;

    .line 109
    .line 110
    invoke-interface {p2, p0, p4}, Lax/o4/b$g;->a(Lax/o4/b$q;Lax/o4/g$L;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_61

    .line 115
    .line 116
    return p3

    .line 117
    :cond_74
    const/4 p0, 0x1

    .line 118
    return p0
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

.method private o(Lax/o4/b$d;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lax/o4/k$i;->h()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_27

    .line 7
    .line 8
    invoke-virtual {p1}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x3b

    .line 17
    .line 18
    if-ne v1, v2, :cond_16

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_27

    .line 23
    :cond_16
    const/16 v2, 0x7b

    .line 24
    .line 25
    if-ne v1, v2, :cond_1d

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1d
    const/16 v2, 0x7d

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    :cond_27
    :goto_27
    return-void
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

.method private static varargs p(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "CSSParser"

    .line 6
    .line 7
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    return-void
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
.method d(Ljava/lang/String;)Lax/o4/b$r;
    .registers 3

    .line 1
    new-instance v0, Lax/o4/b$d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/o4/b$d;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lax/o4/b;->j(Lax/o4/b$d;)Lax/o4/b$r;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
