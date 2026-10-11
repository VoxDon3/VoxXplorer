.class public Lax/C3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/InputStream;J)I
    .registers 14

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    new-instance v1, Lax/C3/c;

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-direct {v1, p0, v2, v0}, Lax/C3/c;-><init>(Ljava/io/InputStream;IZ)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    invoke-static {v1, p1, p2, p0}, Lax/C3/a;->b(Lax/C3/c;JI)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_23

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lax/C3/c;->c(I)B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, -0x1

    .line 24
    if-ne v2, v3, :cond_22

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Lax/C3/c;->c(I)B

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, -0x28

    .line 31
    .line 32
    if-ne v2, v3, :cond_22

    .line 33
    .line 34
    goto :goto_23

    .line 35
    :cond_22
    return v0

    .line 36
    :cond_23
    :goto_23
    const/4 v2, 0x0

    .line 37
    :goto_24
    add-int/lit8 v3, v2, 0x3

    .line 38
    .line 39
    invoke-static {v1, p1, p2, v3}, Lax/C3/a;->b(Lax/C3/c;JI)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const-string v4, "CameraExif"

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    const/4 v7, 0x2

    .line 49
    if-eqz v3, :cond_9e

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lax/C3/c;->c(I)B

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const/16 v9, 0xff

    .line 58
    .line 59
    and-int/2addr v8, v9

    .line 60
    if-ne v8, v9, :cond_9d

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Lax/C3/c;->c(I)B

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    and-int/2addr v8, v9

    .line 67
    if-ne v8, v9, :cond_46

    .line 68
    .line 69
    :cond_44
    :goto_44
    move v2, v3

    .line 70
    goto :goto_24

    .line 71
    :cond_46
    add-int/lit8 v3, v2, 0x2

    .line 72
    .line 73
    const/16 v9, 0xd8

    .line 74
    .line 75
    if-eq v8, v9, :cond_44

    .line 76
    .line 77
    if-ne v8, p0, :cond_4f

    .line 78
    .line 79
    goto :goto_44

    .line 80
    :cond_4f
    const/16 v9, 0xd9

    .line 81
    .line 82
    if-eq v8, v9, :cond_98

    .line 83
    .line 84
    const/16 v9, 0xda

    .line 85
    .line 86
    if-ne v8, v9, :cond_58

    .line 87
    .line 88
    goto :goto_98

    .line 89
    :cond_58
    invoke-static {v1, v3, v7, v0}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-lt v9, v7, :cond_92

    .line 94
    .line 95
    add-int/2addr v3, v9

    .line 96
    add-int/lit8 v10, v3, -0x1

    .line 97
    .line 98
    invoke-static {v1, p1, p2, v10}, Lax/C3/a;->b(Lax/C3/c;JI)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-nez v10, :cond_68

    .line 103
    .line 104
    goto :goto_92

    .line 105
    :cond_68
    const/16 v10, 0xe1

    .line 106
    .line 107
    if-ne v8, v10, :cond_8c

    .line 108
    .line 109
    if-lt v9, v5, :cond_8c

    .line 110
    .line 111
    add-int/lit8 v8, v2, 0x4

    .line 112
    .line 113
    invoke-static {v1, v8, v6, v0}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const v10, 0x45786966

    .line 118
    .line 119
    .line 120
    if-ne v8, v10, :cond_8c

    .line 121
    .line 122
    add-int/lit8 v8, v2, 0x8

    .line 123
    .line 124
    invoke-static {v1, v8, v7, v0}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-nez v8, :cond_8c

    .line 129
    .line 130
    add-int/lit8 p1, v2, 0xa

    .line 131
    .line 132
    add-int/lit8 v9, v9, -0x8

    .line 133
    .line 134
    add-int/lit8 v2, v2, 0x6

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lax/C3/c;->a(I)V

    .line 137
    .line 138
    .line 139
    move v2, p1

    .line 140
    goto :goto_9f

    .line 141
    :cond_8c
    add-int/lit8 v2, v3, -0x4

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Lax/C3/c;->a(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_44

    .line 147
    :cond_92
    :goto_92
    const-string p0, "Invalid length"

    .line 148
    .line 149
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    return v0

    .line 153
    :cond_98
    :goto_98
    add-int/lit8 v2, v2, -0x2

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Lax/C3/c;->a(I)V

    .line 156
    .line 157
    .line 158
    :cond_9d
    move v2, v3

    .line 159
    :cond_9e
    const/4 v9, 0x0

    .line 160
    :goto_9f
    if-le v9, v5, :cond_115

    .line 161
    .line 162
    invoke-static {v1, v2, v6, v0}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    const p2, 0x49492a00    # 823968.0f

    .line 167
    .line 168
    .line 169
    if-eq p1, p2, :cond_b5

    .line 170
    .line 171
    const v3, 0x4d4d002a    # 2.14958752E8f

    .line 172
    .line 173
    .line 174
    if-eq p1, v3, :cond_b5

    .line 175
    .line 176
    const-string p0, "Invalid byte order"

    .line 177
    .line 178
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    return v0

    .line 182
    :cond_b5
    if-ne p1, p2, :cond_b9

    .line 183
    .line 184
    const/4 p1, 0x1

    .line 185
    goto :goto_ba

    .line 186
    :cond_b9
    const/4 p1, 0x0

    .line 187
    :goto_ba
    add-int/lit8 p2, v2, 0x4

    .line 188
    .line 189
    invoke-static {v1, p2, v6, p1}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    add-int/2addr p2, v7

    .line 194
    const/16 v3, 0xa

    .line 195
    .line 196
    if-lt p2, v3, :cond_110

    .line 197
    .line 198
    if-le p2, v9, :cond_c8

    .line 199
    .line 200
    goto :goto_110

    .line 201
    :cond_c8
    add-int/2addr v2, p2

    .line 202
    sub-int/2addr v9, p2

    .line 203
    add-int/lit8 p2, v2, -0x4

    .line 204
    .line 205
    invoke-virtual {v1, p2}, Lax/C3/c;->a(I)V

    .line 206
    .line 207
    .line 208
    add-int/lit8 p2, v2, -0x2

    .line 209
    .line 210
    invoke-static {v1, p2, v7, p1}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    :goto_d5
    add-int/lit8 v3, p2, -0x1

    .line 215
    .line 216
    if-lez p2, :cond_115

    .line 217
    .line 218
    const/16 p2, 0xc

    .line 219
    .line 220
    if-lt v9, p2, :cond_115

    .line 221
    .line 222
    invoke-static {v1, v2, v7, p1}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    const/16 v6, 0x112

    .line 227
    .line 228
    if-ne p2, v6, :cond_104

    .line 229
    .line 230
    add-int/2addr v2, v5

    .line 231
    invoke-static {v1, v2, v7, p1}, Lax/C3/a;->c(Lax/C3/c;IIZ)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eq p1, p0, :cond_103

    .line 236
    .line 237
    const/4 p0, 0x3

    .line 238
    if-eq p1, p0, :cond_100

    .line 239
    .line 240
    const/4 p0, 0x6

    .line 241
    if-eq p1, p0, :cond_fd

    .line 242
    .line 243
    if-eq p1, v5, :cond_fa

    .line 244
    .line 245
    const-string p0, "Unsupported orientation"

    .line 246
    .line 247
    invoke-static {v4, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    return v0

    .line 251
    :cond_fa
    const/16 p0, 0x10e

    .line 252
    .line 253
    return p0

    .line 254
    :cond_fd
    const/16 p0, 0x5a

    .line 255
    .line 256
    return p0

    .line 257
    :cond_100
    const/16 p0, 0xb4

    .line 258
    .line 259
    return p0

    .line 260
    :cond_103
    return v0

    .line 261
    :cond_104
    add-int/lit8 p2, v2, 0xc

    .line 262
    .line 263
    add-int/lit8 v9, v9, -0xc

    .line 264
    .line 265
    add-int/lit8 v2, v2, 0x8

    .line 266
    .line 267
    invoke-virtual {v1, v2}, Lax/C3/c;->a(I)V

    .line 268
    .line 269
    .line 270
    move v2, p2

    .line 271
    move p2, v3

    .line 272
    goto :goto_d5

    .line 273
    :cond_110
    :goto_110
    const-string p0, "Invalid offset"

    .line 274
    .line 275
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    :cond_115
    return v0
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

.method private static b(Lax/C3/c;JI)Z
    .registers 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_f

    .line 6
    .line 7
    int-to-long v0, p3

    .line 8
    cmp-long p0, v0, p1

    .line 9
    .line 10
    if-gez p0, :cond_d

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_d
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_f
    invoke-virtual {p0, p3}, Lax/C3/c;->d(I)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
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

.method private static c(Lax/C3/c;IIZ)I
    .registers 6

    .line 1
    if-eqz p3, :cond_7

    .line 2
    .line 3
    add-int/lit8 p3, p2, -0x1

    .line 4
    .line 5
    add-int/2addr p1, p3

    .line 6
    const/4 p3, -0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 p3, 0x1

    .line 9
    :goto_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    add-int/lit8 v1, p2, -0x1

    .line 11
    .line 12
    if-lez p2, :cond_19

    .line 13
    .line 14
    shl-int/lit8 p2, v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lax/C3/c;->c(I)B

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    and-int/lit16 v0, v0, 0xff

    .line 21
    .line 22
    or-int/2addr v0, p2

    .line 23
    add-int/2addr p1, p3

    .line 24
    move p2, v1

    .line 25
    goto :goto_9

    .line 26
    :cond_19
    return v0
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
.end method
