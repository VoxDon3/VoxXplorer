.class Lax/G4/e0$a;
.super Lax/v4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/e<",
        "Lax/G4/e0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/e0$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/e0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/e0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/e0$a;->b:Lax/G4/e0$a;

    .line 7
    .line 8
    return-void
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

.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/v4/e;-><init>()V

    .line 2
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


# virtual methods
.method public bridge synthetic s(Lax/T4/j;Z)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/G4/e0$a;->u(Lax/T4/j;Z)Lax/G4/e0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic t(Ljava/lang/Object;Lax/T4/g;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/G4/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lax/G4/e0$a;->v(Lax/G4/e0;Lax/T4/g;Z)V

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

.method public u(Lax/T4/j;Z)Lax/G4/e0;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_b

    .line 3
    .line 4
    invoke-static {p1}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    move-object v1, v0

    .line 13
    :goto_c
    if-nez v1, :cond_7c

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    move-object v2, v1

    .line 17
    :goto_10
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v4, Lax/T4/m;->p0:Lax/T4/m;

    .line 22
    .line 23
    if-ne v3, v4, :cond_60

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 30
    .line 31
    .line 32
    const-string v4, "metadata"

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2e

    .line 39
    .line 40
    sget-object v0, Lax/G4/Q$b;->b:Lax/G4/Q$b;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lax/G4/Q$b;->s(Lax/T4/j;)Lax/G4/Q;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_10

    .line 47
    :cond_2e
    const-string v4, "match_type"

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_43

    .line 54
    .line 55
    sget-object v1, Lax/G4/d0$b;->b:Lax/G4/d0$b;

    .line 56
    .line 57
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lax/G4/d0;

    .line 66
    .line 67
    goto :goto_10

    .line 68
    :cond_43
    const-string v4, "highlight_spans"

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_5c

    .line 75
    .line 76
    sget-object v2, Lax/G4/E$a;->b:Lax/G4/E$a;

    .line 77
    .line 78
    invoke-static {v2}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2, p1}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/util/List;

    .line 91
    .line 92
    goto :goto_10

    .line 93
    :cond_5c
    invoke-static {p1}, Lax/v4/c;->o(Lax/T4/j;)V

    .line 94
    .line 95
    .line 96
    goto :goto_10

    .line 97
    :cond_60
    if-eqz v0, :cond_74

    .line 98
    .line 99
    new-instance v3, Lax/G4/e0;

    .line 100
    .line 101
    invoke-direct {v3, v0, v1, v2}, Lax/G4/e0;-><init>(Lax/G4/Q;Lax/G4/d0;Ljava/util/List;)V

    .line 102
    .line 103
    .line 104
    if-nez p2, :cond_6c

    .line 105
    .line 106
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 107
    .line 108
    .line 109
    :cond_6c
    invoke-virtual {v3}, Lax/G4/e0;->b()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v3, p1}, Lax/v4/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v3

    .line 117
    :cond_74
    new-instance p2, Lax/T4/i;

    .line 118
    .line 119
    const-string v0, "Required field \"metadata\" missing."

    .line 120
    .line 121
    invoke-direct {p2, p1, v0}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_7c
    new-instance p2, Lax/T4/i;

    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v2, "No subtype found that matches tag: \""

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, "\""

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {p2, p1, v0}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p2
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

.method public v(Lax/G4/e0;Lax/T4/g;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    if-nez p3, :cond_5

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 4
    .line 5
    .line 6
    :cond_5
    const-string v0, "metadata"

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lax/G4/Q$b;->b:Lax/G4/Q$b;

    .line 12
    .line 13
    iget-object v1, p1, Lax/G4/e0;->a:Lax/G4/Q;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p2}, Lax/G4/Q$b;->t(Lax/G4/Q;Lax/T4/g;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lax/G4/e0;->b:Lax/G4/d0;

    .line 19
    .line 20
    if-eqz v0, :cond_25

    .line 21
    .line 22
    const-string v0, "match_type"

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lax/G4/d0$b;->b:Lax/G4/d0$b;

    .line 28
    .line 29
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p1, Lax/G4/e0;->b:Lax/G4/d0;

    .line 34
    .line 35
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 36
    .line 37
    .line 38
    :cond_25
    iget-object v0, p1, Lax/G4/e0;->c:Ljava/util/List;

    .line 39
    .line 40
    if-eqz v0, :cond_3d

    .line 41
    .line 42
    const-string v0, "highlight_spans"

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lax/G4/E$a;->b:Lax/G4/E$a;

    .line 48
    .line 49
    invoke-static {v0}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object p1, p1, Lax/G4/e0;->c:Ljava/util/List;

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    if-nez p3, :cond_42

    .line 63
    .line 64
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 65
    .line 66
    .line 67
    :cond_42
    return-void
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
