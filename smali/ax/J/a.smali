.class public Lax/J/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(I)I
    .registers 2

    .line 1
    shr-int/lit8 v0, p0, 0x1f

    .line 2
    .line 3
    not-int v0, v0

    .line 4
    and-int/2addr p0, v0

    .line 5
    add-int/lit16 p0, p0, -0xff

    .line 6
    .line 7
    shr-int/lit8 v0, p0, 0x1f

    .line 8
    .line 9
    and-int/2addr p0, v0

    .line 10
    add-int/lit16 p0, p0, 0xff

    .line 11
    .line 12
    return p0
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

.method public static b(Landroidx/constraintlayout/widget/b;Landroid/view/View;[F)V
    .registers 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "\""

    .line 6
    .line 7
    const-string v4, " on View \""

    .line 8
    .line 9
    const-string v5, "CustomSupport"

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v8, "set"

    .line 21
    .line 22
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/b;->b()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    :try_start_23
    sget-object v8, Lax/J/a$a;->a:[I

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/b;->c()Landroidx/constraintlayout/widget/b$b;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    aget v8, v8, v9
    :try_end_2f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_23 .. :try_end_2f} :catch_59
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_2f} :catch_56
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_2f} :catch_175

    .line 47
    .line 48
    const/4 v10, 0x2

    .line 49
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    const-wide v13, 0x3fdd1745d1745d17L    # 0.45454545454545453

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const/high16 v15, 0x437f0000    # 255.0f

    .line 59
    .line 60
    packed-switch v8, :pswitch_data_1c4

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1c3

    .line 64
    .line 65
    :pswitch_40
    :try_start_40
    new-array v8, v2, [Ljava/lang/Class;

    .line 66
    .line 67
    aput-object v12, v8, v0

    .line 68
    .line 69
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    aget v8, p2, v0

    .line 74
    .line 75
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    .line 80
    .line 81
    aput-object v8, v2, v0

    .line 82
    .line 83
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_56
    move-exception v0

    .line 88
    goto/16 :goto_17a

    .line 89
    .line 90
    :catch_59
    move-exception v0

    .line 91
    goto/16 :goto_19f

    .line 92
    .line 93
    :pswitch_5c
    new-array v8, v2, [Ljava/lang/Class;

    .line 94
    .line 95
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    aput-object v9, v8, v0

    .line 98
    .line 99
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    aget v8, p2, v0

    .line 104
    .line 105
    const/high16 v9, 0x3f000000    # 0.5f

    .line 106
    .line 107
    cmpl-float v8, v8, v9

    .line 108
    .line 109
    if-lez v8, :cond_70

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    goto :goto_71

    .line 113
    :cond_70
    const/4 v8, 0x0

    .line 114
    :goto_71
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    new-array v2, v2, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object v8, v2, v0

    .line 121
    .line 122
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_7d
    new-instance v0, Ljava/lang/RuntimeException;

    .line 127
    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v6, "unable to interpolate strings "

    .line 134
    .line 135
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/b;->b()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :pswitch_98
    new-array v8, v2, [Ljava/lang/Class;

    .line 154
    .line 155
    aput-object v11, v8, v0

    .line 156
    .line 157
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    aget v8, p2, v0

    .line 162
    .line 163
    float-to-double v11, v8

    .line 164
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 165
    .line 166
    .line 167
    move-result-wide v11

    .line 168
    double-to-float v8, v11

    .line 169
    mul-float v8, v8, v15

    .line 170
    .line 171
    float-to-int v8, v8

    .line 172
    invoke-static {v8}, Lax/J/a;->a(I)I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    aget v11, p2, v2

    .line 177
    .line 178
    float-to-double v11, v11

    .line 179
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 180
    .line 181
    .line 182
    move-result-wide v11

    .line 183
    double-to-float v11, v11

    .line 184
    mul-float v11, v11, v15

    .line 185
    .line 186
    float-to-int v11, v11

    .line 187
    invoke-static {v11}, Lax/J/a;->a(I)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    aget v10, p2, v10

    .line 192
    .line 193
    const/16 v16, 0x3

    .line 194
    .line 195
    float-to-double v9, v10

    .line 196
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 197
    .line 198
    .line 199
    move-result-wide v9

    .line 200
    double-to-float v9, v9

    .line 201
    mul-float v9, v9, v15

    .line 202
    .line 203
    float-to-int v9, v9

    .line 204
    invoke-static {v9}, Lax/J/a;->a(I)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    aget v10, p2, v16

    .line 209
    .line 210
    mul-float v10, v10, v15

    .line 211
    .line 212
    float-to-int v10, v10

    .line 213
    invoke-static {v10}, Lax/J/a;->a(I)I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    shl-int/lit8 v10, v10, 0x18

    .line 218
    .line 219
    shl-int/lit8 v8, v8, 0x10

    .line 220
    .line 221
    or-int/2addr v8, v10

    .line 222
    shl-int/lit8 v10, v11, 0x8

    .line 223
    .line 224
    or-int/2addr v8, v10

    .line 225
    or-int/2addr v8, v9

    .line 226
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    new-array v2, v2, [Ljava/lang/Object;

    .line 231
    .line 232
    aput-object v8, v2, v0

    .line 233
    .line 234
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_ed
    const/16 v16, 0x3

    .line 239
    .line 240
    new-array v8, v2, [Ljava/lang/Class;

    .line 241
    .line 242
    const-class v9, Landroid/graphics/drawable/Drawable;

    .line 243
    .line 244
    aput-object v9, v8, v0

    .line 245
    .line 246
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    aget v8, p2, v0

    .line 251
    .line 252
    float-to-double v8, v8

    .line 253
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 254
    .line 255
    .line 256
    move-result-wide v8

    .line 257
    double-to-float v8, v8

    .line 258
    mul-float v8, v8, v15

    .line 259
    .line 260
    float-to-int v8, v8

    .line 261
    invoke-static {v8}, Lax/J/a;->a(I)I

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    aget v9, p2, v2

    .line 266
    .line 267
    float-to-double v11, v9

    .line 268
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 269
    .line 270
    .line 271
    move-result-wide v11

    .line 272
    double-to-float v9, v11

    .line 273
    mul-float v9, v9, v15

    .line 274
    .line 275
    float-to-int v9, v9

    .line 276
    invoke-static {v9}, Lax/J/a;->a(I)I

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    aget v10, p2, v10

    .line 281
    .line 282
    float-to-double v10, v10

    .line 283
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 284
    .line 285
    .line 286
    move-result-wide v10

    .line 287
    double-to-float v10, v10

    .line 288
    mul-float v10, v10, v15

    .line 289
    .line 290
    float-to-int v10, v10

    .line 291
    invoke-static {v10}, Lax/J/a;->a(I)I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    aget v11, p2, v16

    .line 296
    .line 297
    mul-float v11, v11, v15

    .line 298
    .line 299
    float-to-int v11, v11

    .line 300
    invoke-static {v11}, Lax/J/a;->a(I)I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    shl-int/lit8 v11, v11, 0x18

    .line 305
    .line 306
    shl-int/lit8 v8, v8, 0x10

    .line 307
    .line 308
    or-int/2addr v8, v11

    .line 309
    shl-int/lit8 v9, v9, 0x8

    .line 310
    .line 311
    or-int/2addr v8, v9

    .line 312
    or-int/2addr v8, v10

    .line 313
    new-instance v9, Landroid/graphics/drawable/ColorDrawable;

    .line 314
    .line 315
    invoke-direct {v9}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v8}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    .line 319
    .line 320
    .line 321
    new-array v2, v2, [Ljava/lang/Object;

    .line 322
    .line 323
    aput-object v9, v2, v0

    .line 324
    .line 325
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :pswitch_148
    new-array v8, v2, [Ljava/lang/Class;

    .line 330
    .line 331
    aput-object v12, v8, v0

    .line 332
    .line 333
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    aget v8, p2, v0

    .line 338
    .line 339
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    new-array v2, v2, [Ljava/lang/Object;

    .line 344
    .line 345
    aput-object v8, v2, v0

    .line 346
    .line 347
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_15e
    new-array v8, v2, [Ljava/lang/Class;

    .line 352
    .line 353
    aput-object v11, v8, v0

    .line 354
    .line 355
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    aget v8, p2, v0

    .line 360
    .line 361
    float-to-int v8, v8

    .line 362
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    new-array v2, v2, [Ljava/lang/Object;

    .line 367
    .line 368
    aput-object v8, v2, v0

    .line 369
    .line 370
    invoke-virtual {v6, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_174
    .catch Ljava/lang/NoSuchMethodException; {:try_start_40 .. :try_end_174} :catch_59
    .catch Ljava/lang/IllegalAccessException; {:try_start_40 .. :try_end_174} :catch_56
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_40 .. :try_end_174} :catch_175

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :catch_175
    move-exception v0

    .line 375
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 376
    .line 377
    .line 378
    goto :goto_1c3

    .line 379
    :goto_17a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    const-string v6, "cannot access method "

    .line 385
    .line 386
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-static {v1}, Lax/K/a;->b(Landroid/view/View;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 413
    .line 414
    .line 415
    goto :goto_1c3

    .line 416
    :goto_19f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 419
    .line 420
    .line 421
    const-string v6, "no method "

    .line 422
    .line 423
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-static {v1}, Lax/K/a;->b(Landroid/view/View;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 450
    .line 451
    .line 452
    :goto_1c3
    return-void

    .line 453
    :pswitch_data_1c4
    .packed-switch 0x1
        :pswitch_15e
        :pswitch_148
        :pswitch_ed
        :pswitch_98
        :pswitch_7d
        :pswitch_5c
        :pswitch_40
    .end packed-switch
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
