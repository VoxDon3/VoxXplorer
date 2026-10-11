.class final Landroidx/media3/ui/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/z$b;,
        Landroidx/media3/ui/z$d;,
        Landroidx/media3/ui/z$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "(&#13;)?&#10;"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/media3/ui/z;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
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

.method public static a(Ljava/lang/CharSequence;F)Landroidx/media3/ui/z$b;
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez p0, :cond_11

    .line 5
    .line 6
    new-instance p0, Landroidx/media3/ui/z$b;

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    invoke-static {}, Lax/r7/A;->k()Lax/r7/A;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, p1, v0, v2}, Landroidx/media3/ui/z$b;-><init>(Ljava/lang/String;Ljava/util/Map;Landroidx/media3/ui/z$a;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_11
    instance-of v3, p0, Landroid/text/Spanned;

    .line 19
    .line 20
    if-nez v3, :cond_23

    .line 21
    .line 22
    new-instance p1, Landroidx/media3/ui/z$b;

    .line 23
    .line 24
    invoke-static {p0}, Landroidx/media3/ui/z;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {}, Lax/r7/A;->k()Lax/r7/A;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p1, p0, v0, v2}, Landroidx/media3/ui/z$b;-><init>(Ljava/lang/String;Ljava/util/Map;Landroidx/media3/ui/z$a;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_23
    check-cast p0, Landroid/text/Spanned;

    .line 37
    .line 38
    new-instance v3, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-class v5, Landroid/text/style/BackgroundColorSpan;

    .line 48
    .line 49
    invoke-interface {p0, v0, v4, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, [Landroid/text/style/BackgroundColorSpan;

    .line 54
    .line 55
    array-length v5, v4

    .line 56
    const/4 v6, 0x0

    .line 57
    :goto_38
    if-ge v6, v5, :cond_49

    .line 58
    .line 59
    aget-object v7, v4, v6

    .line 60
    .line 61
    invoke-virtual {v7}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/2addr v6, v1

    .line 73
    goto :goto_38

    .line 74
    :cond_49
    new-instance v4, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :goto_52
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_89

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    new-instance v6, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v7, "bg_"

    .line 105
    .line 106
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Landroidx/media3/ui/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v5}, Landroidx/media3/ui/c;->b(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    new-array v7, v1, [Ljava/lang/Object;

    .line 125
    .line 126
    aput-object v5, v7, v0

    .line 127
    .line 128
    const-string v5, "background-color:%s;"

    .line 129
    .line 130
    invoke-static {v5, v7}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_52

    .line 138
    :cond_89
    invoke-static {p0, p1}, Landroidx/media3/ui/z;->c(Landroid/text/Spanned;F)Landroid/util/SparseArray;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance v3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 149
    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    :goto_97
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-ge v0, v6, :cond_ff

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-interface {p0, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v5}, Landroidx/media3/ui/z;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Landroidx/media3/ui/z$d;

    .line 178
    .line 179
    invoke-static {v5}, Landroidx/media3/ui/z$d;->a(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-static {}, Landroidx/media3/ui/z$c;->c()Ljava/util/Comparator;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {v7, v8}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v5}, Landroidx/media3/ui/z$d;->a(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    :goto_c5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_d7

    .line 203
    .line 204
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    check-cast v8, Landroidx/media3/ui/z$c;

    .line 209
    .line 210
    iget-object v8, v8, Landroidx/media3/ui/z$c;->d:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    goto :goto_c5

    .line 216
    :cond_d7
    invoke-static {v5}, Landroidx/media3/ui/z$d;->b(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-static {}, Landroidx/media3/ui/z$c;->d()Ljava/util/Comparator;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-static {v7, v8}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v5}, Landroidx/media3/ui/z$d;->b(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    :goto_ea
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-eqz v7, :cond_fc

    .line 240
    .line 241
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    check-cast v7, Landroidx/media3/ui/z$c;

    .line 246
    .line 247
    iget-object v7, v7, Landroidx/media3/ui/z$c;->c:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    goto :goto_ea

    .line 253
    :cond_fc
    add-int/2addr v0, v1

    .line 254
    move v5, v6

    .line 255
    goto :goto_97

    .line 256
    :cond_ff
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    invoke-interface {p0, v5, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0}, Landroidx/media3/ui/z;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    new-instance p0, Landroidx/media3/ui/z$b;

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-direct {p0, p1, v4, v2}, Landroidx/media3/ui/z$b;-><init>(Ljava/lang/String;Ljava/util/Map;Landroidx/media3/ui/z$a;)V

    .line 278
    .line 279
    .line 280
    return-object p0
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

.method private static b(Ljava/lang/CharSequence;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-static {p0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Landroidx/media3/ui/z;->a:Ljava/util/regex/Pattern;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "<br>"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static c(Landroid/text/Spanned;F)Landroid/util/SparseArray;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spanned;",
            "F)",
            "Landroid/util/SparseArray<",
            "Landroidx/media3/ui/z$d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-class v2, Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-interface {p0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    array-length v2, v1

    .line 18
    :goto_11
    if-ge v3, v2, :cond_49

    .line 19
    .line 20
    aget-object v4, v1, v3

    .line 21
    .line 22
    invoke-static {v4, p1}, Landroidx/media3/ui/z;->e(Ljava/lang/Object;F)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-static {v4}, Landroidx/media3/ui/z;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v8, :cond_46

    .line 39
    .line 40
    invoke-static {v9}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance v5, Landroidx/media3/ui/z$c;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-direct/range {v5 .. v10}, Landroidx/media3/ui/z$c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroidx/media3/ui/z$a;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v6}, Landroidx/media3/ui/z;->f(Landroid/util/SparseArray;I)Landroidx/media3/ui/z$d;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v4}, Landroidx/media3/ui/z$d;->b(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v7}, Landroidx/media3/ui/z;->f(Landroid/util/SparseArray;I)Landroidx/media3/ui/z$d;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Landroidx/media3/ui/z$d;->a(Landroidx/media3/ui/z$d;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_46
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_11

    .line 74
    :cond_49
    return-object v0
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

.method private static d(Ljava/lang/Object;)Ljava/lang/String;
    .registers 4

    .line 1
    instance-of v0, p0, Landroid/text/style/StrikethroughSpan;

    .line 2
    .line 3
    const-string v1, "</span>"

    .line 4
    .line 5
    if-nez v0, :cond_76

    .line 6
    .line 7
    instance-of v0, p0, Landroid/text/style/ForegroundColorSpan;

    .line 8
    .line 9
    if-nez v0, :cond_76

    .line 10
    .line 11
    instance-of v0, p0, Landroid/text/style/BackgroundColorSpan;

    .line 12
    .line 13
    if-nez v0, :cond_76

    .line 14
    .line 15
    instance-of v0, p0, Lax/R0/e;

    .line 16
    .line 17
    if-nez v0, :cond_76

    .line 18
    .line 19
    instance-of v0, p0, Landroid/text/style/AbsoluteSizeSpan;

    .line 20
    .line 21
    if-nez v0, :cond_76

    .line 22
    .line 23
    instance-of v0, p0, Landroid/text/style/RelativeSizeSpan;

    .line 24
    .line 25
    if-nez v0, :cond_76

    .line 26
    .line 27
    instance-of v0, p0, Lax/R0/i;

    .line 28
    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_76

    .line 32
    :cond_1f
    instance-of v0, p0, Landroid/text/style/TypefaceSpan;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_2e

    .line 36
    .line 37
    check-cast p0, Landroid/text/style/TypefaceSpan;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_2d

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2d
    return-object v2

    .line 47
    :cond_2e
    instance-of v0, p0, Landroid/text/style/StyleSpan;

    .line 48
    .line 49
    if-eqz v0, :cond_4b

    .line 50
    .line 51
    check-cast p0, Landroid/text/style/StyleSpan;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/4 v0, 0x1

    .line 58
    if-eq p0, v0, :cond_48

    .line 59
    .line 60
    const/4 v0, 0x2

    .line 61
    if-eq p0, v0, :cond_45

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    if-eq p0, v0, :cond_42

    .line 65
    .line 66
    goto :goto_75

    .line 67
    :cond_42
    const-string p0, "</i></b>"

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_45
    const-string p0, "</i>"

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_48
    const-string p0, "</b>"

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4b
    instance-of v0, p0, Lax/R0/g;

    .line 77
    .line 78
    if-eqz v0, :cond_6e

    .line 79
    .line 80
    check-cast p0, Lax/R0/g;

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "<rt>"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lax/R0/g;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p0}, Landroidx/media3/ui/z;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, "</rt></ruby>"

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_6e
    instance-of p0, p0, Landroid/text/style/UnderlineSpan;

    .line 112
    .line 113
    if-eqz p0, :cond_75

    .line 114
    .line 115
    const-string p0, "</u>"

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_75
    :goto_75
    return-object v2

    .line 119
    :cond_76
    :goto_76
    return-object v1
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

.method private static e(Ljava/lang/Object;F)Ljava/lang/String;
    .registers 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    instance-of v3, p0, Landroid/text/style/StrikethroughSpan;

    .line 5
    .line 6
    if-eqz v3, :cond_a

    .line 7
    .line 8
    const-string p0, "<span style=\'text-decoration:line-through;\'>"

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_a
    instance-of v3, p0, Landroid/text/style/ForegroundColorSpan;

    .line 12
    .line 13
    if-eqz v3, :cond_23

    .line 14
    .line 15
    check-cast p0, Landroid/text/style/ForegroundColorSpan;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Landroidx/media3/ui/c;->b(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-array p1, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    aput-object p0, p1, v1

    .line 28
    .line 29
    const-string p0, "<span style=\'color:%s;\'>"

    .line 30
    .line 31
    invoke-static {p0, p1}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_23
    instance-of v3, p0, Landroid/text/style/BackgroundColorSpan;

    .line 37
    .line 38
    if-eqz v3, :cond_3c

    .line 39
    .line 40
    check-cast p0, Landroid/text/style/BackgroundColorSpan;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-array p1, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    aput-object p0, p1, v1

    .line 53
    .line 54
    const-string p0, "<span class=\'bg_%s\'>"

    .line 55
    .line 56
    invoke-static {p0, p1}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3c
    instance-of v3, p0, Lax/R0/e;

    .line 62
    .line 63
    if-eqz v3, :cond_43

    .line 64
    .line 65
    const-string p0, "<span style=\'text-combine-upright:all;\'>"

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_43
    instance-of v3, p0, Landroid/text/style/AbsoluteSizeSpan;

    .line 69
    .line 70
    if-eqz v3, :cond_6a

    .line 71
    .line 72
    check-cast p0, Landroid/text/style/AbsoluteSizeSpan;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/text/style/AbsoluteSizeSpan;->getDip()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_55

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    int-to-float p0, p0

    .line 85
    goto :goto_5b

    .line 86
    :cond_55
    invoke-virtual {p0}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    int-to-float p0, p0

    .line 91
    div-float/2addr p0, p1

    .line 92
    :goto_5b
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-array p1, v2, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object p0, p1, v1

    .line 99
    .line 100
    const-string p0, "<span style=\'font-size:%.2fpx;\'>"

    .line 101
    .line 102
    invoke-static {p0, p1}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_6a
    instance-of p1, p0, Landroid/text/style/RelativeSizeSpan;

    .line 108
    .line 109
    if-eqz p1, :cond_87

    .line 110
    .line 111
    check-cast p0, Landroid/text/style/RelativeSizeSpan;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    const/high16 p1, 0x42c80000    # 100.0f

    .line 118
    .line 119
    mul-float p0, p0, p1

    .line 120
    .line 121
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-array p1, v2, [Ljava/lang/Object;

    .line 126
    .line 127
    aput-object p0, p1, v1

    .line 128
    .line 129
    const-string p0, "<span style=\'font-size:%.2f%%;\'>"

    .line 130
    .line 131
    invoke-static {p0, p1}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_87
    instance-of p1, p0, Landroid/text/style/TypefaceSpan;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    if-eqz p1, :cond_a0

    .line 140
    .line 141
    check-cast p0, Landroid/text/style/TypefaceSpan;

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-eqz p0, :cond_9f

    .line 148
    .line 149
    const-string p1, "<span style=\'font-family:\"%s\";\'>"

    .line 150
    .line 151
    new-array v0, v2, [Ljava/lang/Object;

    .line 152
    .line 153
    aput-object p0, v0, v1

    .line 154
    .line 155
    invoke-static {p1, v0}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_9f
    return-object v3

    .line 161
    :cond_a0
    instance-of p1, p0, Landroid/text/style/StyleSpan;

    .line 162
    .line 163
    if-eqz p1, :cond_bb

    .line 164
    .line 165
    check-cast p0, Landroid/text/style/StyleSpan;

    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eq p0, v2, :cond_b8

    .line 172
    .line 173
    if-eq p0, v0, :cond_b5

    .line 174
    .line 175
    const/4 p1, 0x3

    .line 176
    if-eq p0, p1, :cond_b2

    .line 177
    .line 178
    return-object v3

    .line 179
    :cond_b2
    const-string p0, "<b><i>"

    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_b5
    const-string p0, "<i>"

    .line 183
    .line 184
    return-object p0

    .line 185
    :cond_b8
    const-string p0, "<b>"

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_bb
    instance-of p1, p0, Lax/R0/g;

    .line 189
    .line 190
    if-eqz p1, :cond_d4

    .line 191
    .line 192
    check-cast p0, Lax/R0/g;

    .line 193
    .line 194
    iget p0, p0, Lax/R0/g;->b:I

    .line 195
    .line 196
    const/4 p1, -0x1

    .line 197
    if-eq p0, p1, :cond_d1

    .line 198
    .line 199
    if-eq p0, v2, :cond_ce

    .line 200
    .line 201
    if-eq p0, v0, :cond_cb

    .line 202
    .line 203
    return-object v3

    .line 204
    :cond_cb
    const-string p0, "<ruby style=\'ruby-position:under;\'>"

    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_ce
    const-string p0, "<ruby style=\'ruby-position:over;\'>"

    .line 208
    .line 209
    return-object p0

    .line 210
    :cond_d1
    const-string p0, "<ruby style=\'ruby-position:unset;\'>"

    .line 211
    .line 212
    return-object p0

    .line 213
    :cond_d4
    instance-of p1, p0, Landroid/text/style/UnderlineSpan;

    .line 214
    .line 215
    if-eqz p1, :cond_db

    .line 216
    .line 217
    const-string p0, "<u>"

    .line 218
    .line 219
    return-object p0

    .line 220
    :cond_db
    instance-of p1, p0, Lax/R0/i;

    .line 221
    .line 222
    if-eqz p1, :cond_fc

    .line 223
    .line 224
    check-cast p0, Lax/R0/i;

    .line 225
    .line 226
    iget p1, p0, Lax/R0/i;->a:I

    .line 227
    .line 228
    iget v3, p0, Lax/R0/i;->b:I

    .line 229
    .line 230
    invoke-static {p1, v3}, Landroidx/media3/ui/z;->h(II)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iget p0, p0, Lax/R0/i;->c:I

    .line 235
    .line 236
    invoke-static {p0}, Landroidx/media3/ui/z;->g(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    const-string v3, "<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>"

    .line 241
    .line 242
    new-array v0, v0, [Ljava/lang/Object;

    .line 243
    .line 244
    aput-object p1, v0, v1

    .line 245
    .line 246
    aput-object p0, v0, v2

    .line 247
    .line 248
    invoke-static {v3, v0}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_fc
    return-object v3
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

.method private static f(Landroid/util/SparseArray;I)Landroidx/media3/ui/z$d;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroidx/media3/ui/z$d;",
            ">;I)",
            "Landroidx/media3/ui/z$d;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/media3/ui/z$d;

    .line 6
    .line 7
    if-nez v0, :cond_10

    .line 8
    .line 9
    new-instance v0, Landroidx/media3/ui/z$d;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/media3/ui/z$d;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-object v0
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

.method private static g(I)Ljava/lang/String;
    .registers 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p0, v0, :cond_6

    .line 3
    .line 4
    const-string p0, "over right"

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_6
    const-string p0, "under left"

    .line 8
    .line 9
    return-object p0
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

.method private static h(II)Ljava/lang/String;
    .registers 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_12

    .line 9
    .line 10
    if-eq p1, v1, :cond_c

    .line 11
    .line 12
    goto :goto_17

    .line 13
    :cond_c
    const-string p1, "open "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_17

    .line 19
    :cond_12
    const-string p1, "filled "

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_17
    if-eqz p0, :cond_38

    .line 25
    .line 26
    if-eq p0, v2, :cond_32

    .line 27
    .line 28
    if-eq p0, v1, :cond_2c

    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    if-eq p0, p1, :cond_26

    .line 32
    .line 33
    const-string p0, "unset"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_3d

    .line 39
    :cond_26
    const-string p0, "sesame"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    goto :goto_3d

    .line 45
    :cond_2c
    const-string p0, "dot"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_3d

    .line 51
    :cond_32
    const-string p0, "circle"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_3d

    .line 57
    :cond_38
    const-string p0, "none"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :goto_3d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
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
