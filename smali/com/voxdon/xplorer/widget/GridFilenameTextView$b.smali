.class Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/widget/GridFilenameTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;


# direct methods
.method private constructor <init>(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/voxdon/xplorer/widget/GridFilenameTextView;Lcom/voxdon/xplorer/widget/GridFilenameTextView$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;-><init>(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->b(Ljava/lang/CharSequence;)Landroid/text/Layout;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/16 v7, 0x2e

    .line 14
    .line 15
    move-object/from16 v8, p2

    .line 16
    .line 17
    invoke-virtual {v8, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-gez v7, :cond_17

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_17
    iget-object v9, v0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 25
    .line 26
    invoke-virtual {v9}, Landroid/widget/TextView;->getMaxLines()I

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    sub-int/2addr v9, v5

    .line 31
    invoke-virtual {v6, v9}, Landroid/text/Layout;->getLineEnd(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    sub-int v6, v10, v6

    .line 40
    .line 41
    add-int/2addr v6, v5

    .line 42
    iget-object v9, v0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 43
    .line 44
    invoke-static {v9}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->s(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)Landroid/text/SpannableString;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-virtual {v9}, Landroid/text/SpannableString;->length()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-ge v6, v9, :cond_3f

    .line 53
    .line 54
    iget-object v6, v0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 55
    .line 56
    invoke-static {v6}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->s(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)Landroid/text/SpannableString;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    :cond_3f
    invoke-static {v8}, Lax/c3/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_4b

    .line 73
    .line 74
    goto/16 :goto_c1

    .line 75
    .line 76
    :cond_4b
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    add-int/2addr v6, v8

    .line 81
    sub-int v6, v10, v6

    .line 82
    .line 83
    if-gez v6, :cond_55

    .line 84
    .line 85
    goto :goto_c1

    .line 86
    :cond_55
    invoke-static {v1, v4, v6}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    add-int/2addr v7, v5

    .line 95
    invoke-static {v1, v7, v10}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    :goto_66
    iget-object v8, v0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 104
    .line 105
    invoke-static {v8}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->s(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)Landroid/text/SpannableString;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    new-array v9, v3, [Ljava/lang/CharSequence;

    .line 110
    .line 111
    aput-object v6, v9, v4

    .line 112
    .line 113
    aput-object v8, v9, v5

    .line 114
    .line 115
    aput-object v7, v9, v2

    .line 116
    .line 117
    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-virtual {v0, v8}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->c(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_bb

    .line 126
    .line 127
    instance-of v9, v1, Landroid/text/Spanned;

    .line 128
    .line 129
    if-eqz v9, :cond_ba

    .line 130
    .line 131
    new-instance v15, Landroid/text/SpannableStringBuilder;

    .line 132
    .line 133
    invoke-direct {v15, v6}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 137
    .line 138
    invoke-direct {v8, v7}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    move-object v11, v1

    .line 142
    check-cast v11, Landroid/text/Spanned;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    const/4 v14, 0x0

    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    invoke-static/range {v11 .. v16}, Landroid/text/TextUtils;->copySpansFrom(Landroid/text/Spanned;IILjava/lang/Class;Landroid/text/Spannable;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    sub-int v9, v10, v1

    .line 160
    .line 161
    move-object v12, v8

    .line 162
    move-object v8, v11

    .line 163
    const/4 v11, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    invoke-static/range {v8 .. v13}, Landroid/text/TextUtils;->copySpansFrom(Landroid/text/Spanned;IILjava/lang/Class;Landroid/text/Spannable;I)V

    .line 166
    .line 167
    .line 168
    iget-object v1, v0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 169
    .line 170
    invoke-static {v1}, Lcom/voxdon/xplorer/widget/GridFilenameTextView;->s(Lcom/voxdon/xplorer/widget/GridFilenameTextView;)Landroid/text/SpannableString;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-array v3, v3, [Ljava/lang/CharSequence;

    .line 175
    .line 176
    aput-object v15, v3, v4

    .line 177
    .line 178
    aput-object v1, v3, v5

    .line 179
    .line 180
    aput-object v12, v3, v2

    .line 181
    .line 182
    invoke-static {v3}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    return-object v1

    .line 187
    :cond_ba
    return-object v8

    .line 188
    :cond_bb
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-nez v8, :cond_c2

    .line 193
    .line 194
    :goto_c1
    return-object v1

    .line 195
    :cond_c2
    sub-int/2addr v8, v5

    .line 196
    invoke-virtual {v6, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    goto :goto_66
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

.method protected b(Ljava/lang/CharSequence;)Landroid/text/Layout;
    .registers 11

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getLineSpacingExtra()F

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    new-instance v1, Landroid/text/StaticLayout;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v0, v2

    .line 34
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int v4, v0, v2

    .line 41
    .line 42
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    move-object v2, p1

    .line 46
    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 47
    .line 48
    .line 49
    return-object v1
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

.method public c(Ljava/lang/CharSequence;)Z
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->b(Ljava/lang/CharSequence;)Landroid/text/Layout;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a:Lcom/voxdon/xplorer/widget/GridFilenameTextView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getMaxLines()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gt p1, v0, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method public d(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->c(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/widget/GridFilenameTextView$b;->a(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_a
    return-object p1
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
