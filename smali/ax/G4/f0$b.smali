.class Lax/G4/f0$b;
.super Lax/v4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/e<",
        "Lax/G4/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/f0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/f0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/f0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/f0$b;->b:Lax/G4/f0$b;

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
    invoke-virtual {p0, p1, p2}, Lax/G4/f0$b;->u(Lax/T4/j;Z)Lax/G4/f0;

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
    check-cast p1, Lax/G4/f0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lax/G4/f0$b;->v(Lax/G4/f0;Lax/T4/g;Z)V

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

.method public u(Lax/T4/j;Z)Lax/G4/f0;
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_d

    .line 5
    .line 6
    invoke-static {v0}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    move-object v2, v1

    .line 15
    :goto_e
    if-nez v2, :cond_105

    .line 16
    .line 17
    const-wide/16 v2, 0x64

    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lax/G4/w;->q:Lax/G4/w;

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    move-object v6, v1

    .line 28
    move-object v9, v6

    .line 29
    move-object v12, v9

    .line 30
    move-object v13, v12

    .line 31
    move-object v14, v13

    .line 32
    move-object v10, v3

    .line 33
    :goto_20
    invoke-virtual {v0}, Lax/T4/j;->j()Lax/T4/m;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v3, Lax/T4/m;->p0:Lax/T4/m;

    .line 38
    .line 39
    if-ne v1, v3, :cond_eb

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/T4/j;->g()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lax/T4/j;->H()Lax/T4/m;

    .line 46
    .line 47
    .line 48
    const-string v3, "path"

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_47

    .line 55
    .line 56
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    move-object v6, v1

    .line 71
    goto :goto_20

    .line 72
    :cond_47
    const-string v3, "max_results"

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_5b

    .line 79
    .line 80
    invoke-static {}, Lax/v4/d;->i()Lax/v4/c;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/Long;

    .line 89
    .line 90
    move-object v2, v1

    .line 91
    goto :goto_20

    .line 92
    :cond_5b
    const-string v3, "order_by"

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_71

    .line 99
    .line 100
    sget-object v1, Lax/G4/g0$b;->b:Lax/G4/g0$b;

    .line 101
    .line 102
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lax/G4/g0;

    .line 111
    .line 112
    move-object v9, v1

    .line 113
    goto :goto_20

    .line 114
    :cond_71
    const-string v3, "file_status"

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_81

    .line 121
    .line 122
    sget-object v1, Lax/G4/w$b;->b:Lax/G4/w$b;

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Lax/G4/w$b;->s(Lax/T4/j;)Lax/G4/w;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move-object v10, v1

    .line 129
    goto :goto_20

    .line 130
    :cond_81
    const-string v3, "filename_only"

    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_95

    .line 137
    .line 138
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Boolean;

    .line 147
    .line 148
    move-object v4, v1

    .line 149
    goto :goto_20

    .line 150
    :cond_95
    const-string v3, "file_extensions"

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_b2

    .line 157
    .line 158
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/util/List;

    .line 175
    .line 176
    move-object v12, v1

    .line 177
    goto/16 :goto_20

    .line 178
    .line 179
    :cond_b2
    const-string v3, "file_categories"

    .line 180
    .line 181
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_cd

    .line 186
    .line 187
    sget-object v1, Lax/G4/r$b;->b:Lax/G4/r$b;

    .line 188
    .line 189
    invoke-static {v1}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljava/util/List;

    .line 202
    .line 203
    move-object v13, v1

    .line 204
    goto/16 :goto_20

    .line 205
    .line 206
    :cond_cd
    const-string v3, "account_id"

    .line 207
    .line 208
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_e6

    .line 213
    .line 214
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-static {v1}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Ljava/lang/String;

    .line 227
    .line 228
    move-object v14, v1

    .line 229
    goto/16 :goto_20

    .line 230
    .line 231
    :cond_e6
    invoke-static {v0}, Lax/v4/c;->o(Lax/T4/j;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_20

    .line 235
    .line 236
    :cond_eb
    new-instance v5, Lax/G4/f0;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide v7

    .line 242
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    invoke-direct/range {v5 .. v14}, Lax/G4/f0;-><init>(Ljava/lang/String;JLax/G4/g0;Lax/G4/w;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    if-nez p2, :cond_fd

    .line 250
    .line 251
    invoke-static {v0}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 252
    .line 253
    .line 254
    :cond_fd
    invoke-virtual {v5}, Lax/G4/f0;->b()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v5, v0}, Lax/v4/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object v5

    .line 262
    :cond_105
    new-instance v1, Lax/T4/i;

    .line 263
    .line 264
    new-instance v3, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v4, "No subtype found that matches tag: \""

    .line 270
    .line 271
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v2, "\""

    .line 278
    .line 279
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-direct {v1, v0, v2}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v1
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

.method public v(Lax/G4/f0;Lax/T4/g;Z)V
    .registers 7
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
    iget-object v0, p1, Lax/G4/f0;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1b

    .line 9
    .line 10
    const-string v0, "path"

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lax/G4/f0;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    const-string v0, "max_results"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lax/v4/d;->i()Lax/v4/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-wide v1, p1, Lax/G4/f0;->b:J

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p1, Lax/G4/f0;->c:Lax/G4/g0;

    .line 47
    .line 48
    if-eqz v0, :cond_41

    .line 49
    .line 50
    const-string v0, "order_by"

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lax/G4/g0$b;->b:Lax/G4/g0$b;

    .line 56
    .line 57
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p1, Lax/G4/f0;->c:Lax/G4/g0;

    .line 62
    .line 63
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 64
    .line 65
    .line 66
    :cond_41
    const-string v0, "file_status"

    .line 67
    .line 68
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lax/G4/w$b;->b:Lax/G4/w$b;

    .line 72
    .line 73
    iget-object v1, p1, Lax/G4/f0;->d:Lax/G4/w;

    .line 74
    .line 75
    invoke-virtual {v0, v1, p2}, Lax/G4/w$b;->t(Lax/G4/w;Lax/T4/g;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "filename_only"

    .line 79
    .line 80
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-boolean v1, p1, Lax/G4/f0;->e:Z

    .line 88
    .line 89
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p1, Lax/G4/f0;->f:Ljava/util/List;

    .line 97
    .line 98
    if-eqz v0, :cond_79

    .line 99
    .line 100
    const-string v0, "file_extensions"

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p1, Lax/G4/f0;->f:Ljava/util/List;

    .line 118
    .line 119
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 120
    .line 121
    .line 122
    :cond_79
    iget-object v0, p1, Lax/G4/f0;->g:Ljava/util/List;

    .line 123
    .line 124
    if-eqz v0, :cond_91

    .line 125
    .line 126
    const-string v0, "file_categories"

    .line 127
    .line 128
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sget-object v0, Lax/G4/r$b;->b:Lax/G4/r$b;

    .line 132
    .line 133
    invoke-static {v0}, Lax/v4/d;->c(Lax/v4/c;)Lax/v4/c;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v1, p1, Lax/G4/f0;->g:Ljava/util/List;

    .line 142
    .line 143
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 144
    .line 145
    .line 146
    :cond_91
    iget-object v0, p1, Lax/G4/f0;->h:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v0, :cond_a7

    .line 149
    .line 150
    const-string v0, "account_id"

    .line 151
    .line 152
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object p1, p1, Lax/G4/f0;->h:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 166
    .line 167
    .line 168
    :cond_a7
    if-nez p3, :cond_ac

    .line 169
    .line 170
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 171
    .line 172
    .line 173
    :cond_ac
    return-void
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
.end method
