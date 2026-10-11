.class public final Lax/S1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N1/t;


# static fields
.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/StringBuilder;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/S0/G;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/S1/a;->d:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\{\\\\.*?\\}"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lax/S1/a;->e:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/S1/a;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lax/S0/G;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/S1/a;->c:Lax/S0/G;

    .line 24
    .line 25
    return-void
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
.end method

.method private e(Landroid/text/Spanned;Ljava/lang/String;)Lax/R0/a;
    .registers 19

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    new-instance v1, Lax/R0/a$b;

    .line 4
    .line 5
    invoke-direct {v1}, Lax/R0/a$b;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lax/R0/a$b;->o(Ljava/lang/CharSequence;)Lax/R0/a$b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v0, :cond_14

    .line 15
    .line 16
    invoke-virtual {v1}, Lax/R0/a$b;->a()Lax/R0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v3, "{\\an1}"

    .line 26
    .line 27
    const-string v5, "{\\an2}"

    .line 28
    .line 29
    const-string v6, "{\\an3}"

    .line 30
    .line 31
    const-string v7, "{\\an4}"

    .line 32
    .line 33
    const-string v9, "{\\an5}"

    .line 34
    .line 35
    const-string v10, "{\\an6}"

    .line 36
    .line 37
    const-string v11, "{\\an7}"

    .line 38
    .line 39
    const-string v13, "{\\an8}"

    .line 40
    .line 41
    const-string v14, "{\\an9}"

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    const/4 v8, 0x4

    .line 45
    const/4 v15, 0x1

    .line 46
    const/4 v12, 0x2

    .line 47
    sparse-switch v2, :sswitch_data_120

    .line 48
    .line 49
    .line 50
    goto :goto_7b

    .line 51
    :sswitch_32
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_7b

    .line 56
    .line 57
    const/4 v2, 0x5

    .line 58
    goto :goto_7c

    .line 59
    :sswitch_3a
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_7b

    .line 64
    .line 65
    const/16 v2, 0x8

    .line 66
    .line 67
    goto :goto_7c

    .line 68
    :sswitch_43
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_7b

    .line 73
    .line 74
    const/4 v2, 0x2

    .line 75
    goto :goto_7c

    .line 76
    :sswitch_4b
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_7b

    .line 81
    .line 82
    const/4 v2, 0x4

    .line 83
    goto :goto_7c

    .line 84
    :sswitch_53
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_7b

    .line 89
    .line 90
    const/4 v2, 0x7

    .line 91
    goto :goto_7c

    .line 92
    :sswitch_5b
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_7b

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    goto :goto_7c

    .line 100
    :sswitch_63
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_7b

    .line 105
    .line 106
    const/4 v2, 0x3

    .line 107
    goto :goto_7c

    .line 108
    :sswitch_6b
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_7b

    .line 113
    .line 114
    const/4 v2, 0x6

    .line 115
    goto :goto_7c

    .line 116
    :sswitch_73
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_7b

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    goto :goto_7c

    .line 124
    :cond_7b
    :goto_7b
    const/4 v2, -0x1

    .line 125
    :goto_7c
    if-eqz v2, :cond_91

    .line 126
    .line 127
    if-eq v2, v15, :cond_91

    .line 128
    .line 129
    if-eq v2, v12, :cond_91

    .line 130
    .line 131
    if-eq v2, v4, :cond_8d

    .line 132
    .line 133
    if-eq v2, v8, :cond_8d

    .line 134
    .line 135
    const/4 v8, 0x5

    .line 136
    if-eq v2, v8, :cond_8d

    .line 137
    .line 138
    invoke-virtual {v1, v15}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 139
    .line 140
    .line 141
    goto :goto_95

    .line 142
    :cond_8d
    invoke-virtual {v1, v12}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 143
    .line 144
    .line 145
    goto :goto_95

    .line 146
    :cond_91
    const/4 v2, 0x0

    .line 147
    invoke-virtual {v1, v2}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 148
    .line 149
    .line 150
    :goto_95
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    sparse-switch v2, :sswitch_data_146

    .line 155
    .line 156
    .line 157
    goto :goto_e6

    .line 158
    :sswitch_9d
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_e6

    .line 163
    .line 164
    const/4 v0, 0x5

    .line 165
    goto :goto_e7

    .line 166
    :sswitch_a5
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_e6

    .line 171
    .line 172
    const/4 v0, 0x4

    .line 173
    goto :goto_e7

    .line 174
    :sswitch_ad
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_e6

    .line 179
    .line 180
    const/4 v0, 0x3

    .line 181
    goto :goto_e7

    .line 182
    :sswitch_b5
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_e6

    .line 187
    .line 188
    const/16 v0, 0x8

    .line 189
    .line 190
    goto :goto_e7

    .line 191
    :sswitch_be
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_e6

    .line 196
    .line 197
    const/4 v0, 0x7

    .line 198
    goto :goto_e7

    .line 199
    :sswitch_c6
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_e6

    .line 204
    .line 205
    const/4 v0, 0x6

    .line 206
    goto :goto_e7

    .line 207
    :sswitch_ce
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_e6

    .line 212
    .line 213
    const/4 v0, 0x2

    .line 214
    goto :goto_e7

    .line 215
    :sswitch_d6
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_e6

    .line 220
    .line 221
    const/4 v0, 0x1

    .line 222
    goto :goto_e7

    .line 223
    :sswitch_de
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_e6

    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    goto :goto_e7

    .line 231
    :cond_e6
    :goto_e6
    const/4 v0, -0x1

    .line 232
    :goto_e7
    if-eqz v0, :cond_fe

    .line 233
    .line 234
    if-eq v0, v15, :cond_fe

    .line 235
    .line 236
    if-eq v0, v12, :cond_fe

    .line 237
    .line 238
    if-eq v0, v4, :cond_f9

    .line 239
    .line 240
    const/4 v2, 0x4

    .line 241
    if-eq v0, v2, :cond_f9

    .line 242
    .line 243
    const/4 v8, 0x5

    .line 244
    if-eq v0, v8, :cond_f9

    .line 245
    .line 246
    invoke-virtual {v1, v15}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 247
    .line 248
    .line 249
    goto :goto_101

    .line 250
    :cond_f9
    const/4 v2, 0x0

    .line 251
    invoke-virtual {v1, v2}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 252
    .line 253
    .line 254
    goto :goto_101

    .line 255
    :cond_fe
    invoke-virtual {v1, v12}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 256
    .line 257
    .line 258
    :goto_101
    invoke-virtual {v1}, Lax/R0/a$b;->d()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-static {v0}, Lax/S1/a;->g(I)F

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {v1, v0}, Lax/R0/a$b;->k(F)Lax/R0/a$b;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v1}, Lax/R0/a$b;->c()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-static {v1}, Lax/S1/a;->g(I)F

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    const/4 v2, 0x0

    .line 279
    invoke-virtual {v0, v1, v2}, Lax/R0/a$b;->h(FI)Lax/R0/a$b;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Lax/R0/a$b;->a()Lax/R0/a;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    return-object v0

    .line 288
    nop

    .line 289
    :sswitch_data_120
    .sparse-switch
        -0x28ddbde6 -> :sswitch_73
        -0x28ddbdc7 -> :sswitch_6b
        -0x28ddbda8 -> :sswitch_63
        -0x28ddbd89 -> :sswitch_5b
        -0x28ddbd6a -> :sswitch_53
        -0x28ddbd4b -> :sswitch_4b
        -0x28ddbd2c -> :sswitch_43
        -0x28ddbd0d -> :sswitch_3a
        -0x28ddbcee -> :sswitch_32
    .end sparse-switch

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
    :sswitch_data_146
    .sparse-switch
        -0x28ddbde6 -> :sswitch_de
        -0x28ddbdc7 -> :sswitch_d6
        -0x28ddbda8 -> :sswitch_ce
        -0x28ddbd89 -> :sswitch_c6
        -0x28ddbd6a -> :sswitch_be
        -0x28ddbd4b -> :sswitch_b5
        -0x28ddbd2c -> :sswitch_ad
        -0x28ddbd0d -> :sswitch_a5
        -0x28ddbcee -> :sswitch_9d
    .end sparse-switch
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

.method private f(Lax/S0/G;)Ljava/nio/charset/Charset;
    .registers 2

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->W()Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    return-object p1
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

.method public static g(I)F
    .registers 2

    .line 1
    if-eqz p0, :cond_15

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_12

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p0, v0, :cond_c

    .line 8
    .line 9
    const p0, 0x3f6b851f    # 0.92f

    .line 10
    .line 11
    .line 12
    return p0

    .line 13
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :cond_12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 20
    .line 21
    return p0

    .line 22
    :cond_15
    const p0, 0x3da3d70a    # 0.08f

    .line 23
    .line 24
    .line 25
    return p0
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
.end method

.method private static h(Ljava/util/regex/Matcher;I)J
    .registers 8

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/32 v2, 0x36ee80

    .line 14
    .line 15
    .line 16
    mul-long v0, v0, v2

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :cond_12
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :goto_14
    add-int/lit8 v2, p1, 0x2

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const-wide/32 v4, 0xea60

    .line 38
    .line 39
    .line 40
    mul-long v2, v2, v4

    .line 41
    .line 42
    add-long/2addr v0, v2

    .line 43
    add-int/lit8 v2, p1, 0x3

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    const-wide/16 v4, 0x3e8

    .line 60
    .line 61
    mul-long v2, v2, v4

    .line 62
    .line 63
    add-long/2addr v0, v2

    .line 64
    add-int/lit8 p1, p1, 0x4

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_4c

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 73
    .line 74
    .line 75
    move-result-wide p0

    .line 76
    add-long/2addr v0, p0

    .line 77
    :cond_4c
    mul-long v0, v0, v4

    .line 78
    .line 79
    return-wide v0
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

.method private i(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lax/S1/a;->e:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_10
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2f

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v3, v1

    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int v4, v3, v2

    .line 40
    .line 41
    const-string v5, ""

    .line 42
    .line 43
    invoke-virtual {v0, v3, v4, v5}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    goto :goto_10

    .line 48
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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
.end method


# virtual methods
.method public synthetic a()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/N1/s;->b(Lax/N1/t;)V

    return-void
.end method

.method public synthetic b([BII)Lax/N1/k;
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/N1/s;->a(Lax/N1/t;[BII)Lax/N1/k;

    move-result-object p1

    return-object p1
.end method

.method public c([BIILax/N1/t$b;Lax/S0/l;)V
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lax/N1/t$b;",
            "Lax/S0/l<",
            "Lax/N1/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "SubripParser"

    .line 10
    .line 11
    iget-object v5, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 12
    .line 13
    add-int v6, v1, p3

    .line 14
    .line 15
    move-object/from16 v7, p1

    .line 16
    .line 17
    invoke-virtual {v5, v7, v6}, Lax/S0/G;->Z([BI)V

    .line 18
    .line 19
    .line 20
    iget-object v5, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 21
    .line 22
    invoke-virtual {v5, v1}, Lax/S0/G;->b0(I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lax/S1/a;->f(Lax/S0/G;)Ljava/nio/charset/Charset;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-wide v5, v2, Lax/N1/t$b;->a:J

    .line 32
    .line 33
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    cmp-long v10, v5, v8

    .line 39
    .line 40
    if-eqz v10, :cond_33

    .line 41
    .line 42
    iget-boolean v5, v2, Lax/N1/t$b;->b:Z

    .line 43
    .line 44
    if-eqz v5, :cond_33

    .line 45
    .line 46
    new-instance v5, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 v5, 0x0

    .line 53
    :goto_34
    iget-object v6, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 54
    .line 55
    invoke-virtual {v6, v1}, Lax/S0/G;->y(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const/4 v10, 0x0

    .line 60
    if-eqz v6, :cond_133

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    if-eqz v11, :cond_44

    .line 67
    .line 68
    goto :goto_34

    .line 69
    :cond_44
    :try_start_44
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_47
    .catch Ljava/lang/NumberFormatException; {:try_start_44 .. :try_end_47} :catch_11c

    .line 70
    .line 71
    .line 72
    iget-object v6, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 73
    .line 74
    invoke-virtual {v6, v1}, Lax/S0/G;->y(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_56

    .line 79
    .line 80
    const-string v1, "Unexpected end"

    .line 81
    .line 82
    invoke-static {v4, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_133

    .line 86
    .line 87
    :cond_56
    sget-object v11, Lax/S1/a;->d:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    invoke-virtual {v11, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    if-eqz v12, :cond_105

    .line 98
    .line 99
    const/4 v6, 0x1

    .line 100
    invoke-static {v11, v6}, Lax/S1/a;->h(Ljava/util/regex/Matcher;I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    const/4 v6, 0x6

    .line 105
    invoke-static {v11, v6}, Lax/S1/a;->h(Ljava/util/regex/Matcher;I)J

    .line 106
    .line 107
    .line 108
    move-result-wide v11

    .line 109
    iget-object v6, v0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 112
    .line 113
    .line 114
    iget-object v6, v0, Lax/S1/a;->b:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 117
    .line 118
    .line 119
    iget-object v6, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 120
    .line 121
    invoke-virtual {v6, v1}, Lax/S0/G;->y(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    :goto_7c
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    if-nez v13, :cond_a3

    .line 130
    .line 131
    iget-object v13, v0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-lez v13, :cond_91

    .line 138
    .line 139
    iget-object v13, v0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v7, "<br>"

    .line 142
    .line 143
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_91
    iget-object v7, v0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 147
    .line 148
    iget-object v13, v0, Lax/S1/a;->b:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v0, v6, v13}, Lax/S1/a;->i(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    iget-object v6, v0, Lax/S1/a;->c:Lax/S0/G;

    .line 158
    .line 159
    invoke-virtual {v6, v1}, Lax/S0/G;->y(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    goto :goto_7c

    .line 164
    :cond_a3
    iget-object v6, v0, Lax/S1/a;->a:Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    :goto_ad
    iget-object v7, v0, Lax/S1/a;->b:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-ge v10, v7, :cond_cb

    .line 181
    .line 182
    iget-object v7, v0, Lax/S1/a;->b:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, Ljava/lang/String;

    .line 189
    .line 190
    const-string v13, "\\{\\\\an[1-9]\\}"

    .line 191
    .line 192
    invoke-virtual {v7, v13}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-eqz v13, :cond_c8

    .line 197
    .line 198
    :goto_c5
    move-wide/from16 p2, v8

    .line 199
    .line 200
    goto :goto_cd

    .line 201
    :cond_c8
    add-int/lit8 v10, v10, 0x1

    .line 202
    .line 203
    goto :goto_ad

    .line 204
    :cond_cb
    const/4 v7, 0x0

    .line 205
    goto :goto_c5

    .line 206
    :goto_cd
    iget-wide v8, v2, Lax/N1/t$b;->a:J

    .line 207
    .line 208
    cmp-long v10, v8, p2

    .line 209
    .line 210
    if-eqz v10, :cond_d7

    .line 211
    .line 212
    cmp-long v10, v11, v8

    .line 213
    .line 214
    if-ltz v10, :cond_d9

    .line 215
    .line 216
    :cond_d7
    move-wide v8, v11

    .line 217
    goto :goto_ef

    .line 218
    :cond_d9
    if-eqz v5, :cond_101

    .line 219
    .line 220
    move-wide v8, v11

    .line 221
    new-instance v12, Lax/N1/e;

    .line 222
    .line 223
    invoke-direct {v0, v6, v7}, Lax/S1/a;->e(Landroid/text/Spanned;Ljava/lang/String;)Lax/R0/a;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-static {v6}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    sub-long v16, v8, v14

    .line 232
    .line 233
    invoke-direct/range {v12 .. v17}, Lax/N1/e;-><init>(Ljava/util/List;JJ)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_101

    .line 240
    :goto_ef
    new-instance v12, Lax/N1/e;

    .line 241
    .line 242
    invoke-direct {v0, v6, v7}, Lax/S1/a;->e(Landroid/text/Spanned;Ljava/lang/String;)Lax/R0/a;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-static {v6}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    sub-long v16, v8, v14

    .line 251
    .line 252
    invoke-direct/range {v12 .. v17}, Lax/N1/e;-><init>(Ljava/util/List;JJ)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v3, v12}, Lax/S0/l;->accept(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_101
    :goto_101
    move-wide/from16 v8, p2

    .line 259
    .line 260
    goto/16 :goto_34

    .line 261
    .line 262
    :cond_105
    move-wide/from16 p2, v8

    .line 263
    .line 264
    new-instance v7, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v8, "Skipping invalid timing: "

    .line 270
    .line 271
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-static {v4, v6}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto :goto_101

    .line 285
    :catch_11c
    move-wide/from16 p2, v8

    .line 286
    .line 287
    new-instance v7, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v8, "Skipping invalid index: "

    .line 293
    .line 294
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    invoke-static {v4, v6}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto :goto_101

    .line 308
    :cond_133
    :goto_133
    if-eqz v5, :cond_147

    .line 309
    .line 310
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    :goto_139
    if-ge v10, v1, :cond_147

    .line 315
    .line 316
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    add-int/lit8 v10, v10, 0x1

    .line 321
    .line 322
    check-cast v2, Lax/N1/e;

    .line 323
    .line 324
    invoke-interface {v3, v2}, Lax/S0/l;->accept(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    goto :goto_139

    .line 328
    :cond_147
    return-void
.end method

.method public d()I
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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
