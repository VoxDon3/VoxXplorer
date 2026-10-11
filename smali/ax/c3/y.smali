.class public Lax/c3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(IJZ)Ljava/lang/String;
    .registers 16

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p3, :cond_8

    .line 5
    .line 6
    const-wide/16 v3, 0x3e8

    .line 7
    .line 8
    goto :goto_a

    .line 9
    :cond_8
    const-wide/16 v3, 0x400

    .line 10
    .line 11
    :goto_a
    invoke-static {}, Lax/X2/Q;->b2()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_14

    .line 16
    .line 17
    if-nez p3, :cond_14

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 p3, 0x0

    .line 22
    :goto_15
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    cmp-long v7, p1, v3

    .line 25
    .line 26
    if-gez v7, :cond_1f

    .line 27
    .line 28
    const-string p3, "B"

    .line 29
    .line 30
    move-wide v3, v5

    .line 31
    goto :goto_5d

    .line 32
    :cond_1f
    mul-long v7, v3, v3

    .line 33
    .line 34
    cmp-long v9, p1, v7

    .line 35
    .line 36
    if-gez v9, :cond_37

    .line 37
    .line 38
    long-to-double v3, v3

    .line 39
    if-eqz p3, :cond_2b

    .line 40
    .line 41
    const-string p3, "KiB"

    .line 42
    .line 43
    goto :goto_5d

    .line 44
    :cond_2b
    invoke-static {}, Lax/X2/Q;->b2()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_34

    .line 49
    .line 50
    const-string p3, "kB"

    .line 51
    .line 52
    goto :goto_5d

    .line 53
    :cond_34
    const-string p3, "KB"

    .line 54
    .line 55
    goto :goto_5d

    .line 56
    :cond_37
    mul-long v9, v7, v3

    .line 57
    .line 58
    cmp-long v11, p1, v9

    .line 59
    .line 60
    if-gez v11, :cond_46

    .line 61
    .line 62
    long-to-double v3, v7

    .line 63
    if-eqz p3, :cond_43

    .line 64
    .line 65
    const-string p3, "MiB"

    .line 66
    .line 67
    goto :goto_5d

    .line 68
    :cond_43
    const-string p3, "MB"

    .line 69
    .line 70
    goto :goto_5d

    .line 71
    :cond_46
    mul-long v3, v3, v9

    .line 72
    .line 73
    cmp-long v7, p1, v3

    .line 74
    .line 75
    if-gez v7, :cond_55

    .line 76
    .line 77
    long-to-double v3, v9

    .line 78
    if-eqz p3, :cond_52

    .line 79
    .line 80
    const-string p3, "GiB"

    .line 81
    .line 82
    goto :goto_5d

    .line 83
    :cond_52
    const-string p3, "GB"

    .line 84
    .line 85
    goto :goto_5d

    .line 86
    :cond_55
    long-to-double v3, v3

    .line 87
    if-eqz p3, :cond_5b

    .line 88
    .line 89
    const-string p3, "TiB"

    .line 90
    .line 91
    goto :goto_5d

    .line 92
    :cond_5b
    const-string p3, "TB"

    .line 93
    .line 94
    :goto_5d
    long-to-double p1, p1

    .line 95
    div-double/2addr p1, v3

    .line 96
    const-string v7, "%.0f"

    .line 97
    .line 98
    cmpl-double v8, v3, v5

    .line 99
    .line 100
    if-eqz v8, :cond_89

    .line 101
    .line 102
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 103
    .line 104
    cmpl-double v8, p1, v3

    .line 105
    .line 106
    if-ltz v8, :cond_6c

    .line 107
    .line 108
    goto :goto_89

    .line 109
    :cond_6c
    const-string v3, "%.2f"

    .line 110
    .line 111
    cmpg-double v4, p1, v5

    .line 112
    .line 113
    if-gez v4, :cond_74

    .line 114
    .line 115
    :cond_72
    move-object v7, v3

    .line 116
    goto :goto_89

    .line 117
    :cond_74
    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    .line 118
    .line 119
    const-string v6, "%.1f"

    .line 120
    .line 121
    cmpg-double v8, p1, v4

    .line 122
    .line 123
    if-gez v8, :cond_83

    .line 124
    .line 125
    if-ne p0, v1, :cond_80

    .line 126
    .line 127
    :goto_7e
    move-object v7, v6

    .line 128
    goto :goto_89

    .line 129
    :cond_80
    if-ne p0, v0, :cond_72

    .line 130
    .line 131
    goto :goto_7e

    .line 132
    :cond_83
    if-ne p0, v1, :cond_86

    .line 133
    .line 134
    goto :goto_89

    .line 135
    :cond_86
    if-ne p0, v0, :cond_72

    .line 136
    .line 137
    goto :goto_7e

    .line 138
    :cond_89
    :goto_89
    const-wide/16 v3, 0x0

    .line 139
    .line 140
    cmpl-double p0, p1, v3

    .line 141
    .line 142
    if-nez p0, :cond_a0

    .line 143
    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    new-array p1, v0, [Ljava/lang/Object;

    .line 149
    .line 150
    aput-object p0, p1, v2

    .line 151
    .line 152
    aput-object p3, p1, v1

    .line 153
    .line 154
    const-string p0, "%d %s"

    .line 155
    .line 156
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_a0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v3, " %s"

    .line 170
    .line 171
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-array p2, v0, [Ljava/lang/Object;

    .line 183
    .line 184
    aput-object p1, p2, v2

    .line 185
    .line 186
    aput-object p3, p2, v1

    .line 187
    .line 188
    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
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

.method public static b(JZ)Ljava/lang/String;
    .registers 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0, p0, p1, p2}, Lax/c3/y;->a(IJZ)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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

.method public static c(JZ)Ljava/lang/String;
    .registers 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0, p0, p1, p2}, Lax/c3/y;->a(IJZ)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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

.method public static d(JJZ)Ljava/lang/String;
    .registers 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    cmp-long v3, p0, v1

    .line 9
    .line 10
    if-ltz v3, :cond_12

    .line 11
    .line 12
    invoke-static {p0, p1, p4}, Lax/c3/y;->e(JZ)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_12
    const-string p0, " - "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    cmp-long p0, p2, v1

    .line 25
    .line 26
    if-ltz p0, :cond_22

    .line 27
    .line 28
    invoke-static {p2, p3, p4}, Lax/c3/y;->e(JZ)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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

.method public static e(JZ)Ljava/lang/String;
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0, p1, p2}, Lax/c3/y;->a(IJZ)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
