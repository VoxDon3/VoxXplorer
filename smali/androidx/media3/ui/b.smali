.class public Landroidx/media3/ui/b;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/ui/G;


# instance fields
.field private A:I

.field private B:J

.field private C:I

.field private D:Landroid/graphics/Rect;

.field private E:Landroid/animation/ValueAnimator;

.field private F:F

.field private G:Z

.field private H:Z

.field private I:J

.field private J:J

.field private K:J

.field private L:J

.field private M:I

.field private N:[J

.field private O:[Z

.field private final a:Landroid/graphics/Rect;

.field private final b:Landroid/graphics/Rect;

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroid/graphics/Rect;

.field private final e:Landroid/graphics/Paint;

.field private final f:Landroid/graphics/Paint;

.field private final g:Landroid/graphics/Paint;

.field private final h:Landroid/graphics/Paint;

.field private final i:Landroid/graphics/Paint;

.field private final j:Landroid/graphics/Paint;

.field private final k:Landroid/graphics/drawable/Drawable;

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:Ljava/lang/StringBuilder;

.field private final v:Ljava/util/Formatter;

.field private final w:Ljava/lang/Runnable;

.field private final x:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroidx/media3/ui/G$a;",
            ">;"
        }
    .end annotation
.end field

.field private final y:Landroid/graphics/Point;

.field private final z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V
    .registers 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    invoke-direct/range {p0 .. p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 14
    .line 15
    new-instance v2, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 21
    .line 22
    new-instance v2, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, v1, Landroidx/media3/ui/b;->c:Landroid/graphics/Rect;

    .line 28
    .line 29
    new-instance v2, Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 35
    .line 36
    new-instance v2, Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v2, v1, Landroidx/media3/ui/b;->e:Landroid/graphics/Paint;

    .line 42
    .line 43
    new-instance v3, Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v3, v1, Landroidx/media3/ui/b;->f:Landroid/graphics/Paint;

    .line 49
    .line 50
    new-instance v4, Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v4, v1, Landroidx/media3/ui/b;->g:Landroid/graphics/Paint;

    .line 56
    .line 57
    new-instance v5, Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v5, v1, Landroidx/media3/ui/b;->h:Landroid/graphics/Paint;

    .line 63
    .line 64
    new-instance v6, Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v6, v1, Landroidx/media3/ui/b;->i:Landroid/graphics/Paint;

    .line 70
    .line 71
    new-instance v7, Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v7, v1, Landroidx/media3/ui/b;->j:Landroid/graphics/Paint;

    .line 77
    .line 78
    const/4 v8, 0x1

    .line 79
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 80
    .line 81
    .line 82
    new-instance v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 83
    .line 84
    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v9, v1, Landroidx/media3/ui/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 88
    .line 89
    new-instance v9, Landroid/graphics/Point;

    .line 90
    .line 91
    invoke-direct {v9}, Landroid/graphics/Point;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v9, v1, Landroidx/media3/ui/b;->y:Landroid/graphics/Point;

    .line 95
    .line 96
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 105
    .line 106
    iput v9, v1, Landroidx/media3/ui/b;->z:F

    .line 107
    .line 108
    const/16 v10, -0x32

    .line 109
    .line 110
    invoke-static {v9, v10}, Landroidx/media3/ui/b;->e(FI)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    iput v10, v1, Landroidx/media3/ui/b;->t:I

    .line 115
    .line 116
    const/4 v10, 0x4

    .line 117
    invoke-static {v9, v10}, Landroidx/media3/ui/b;->e(FI)I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    const/16 v12, 0x1a

    .line 122
    .line 123
    invoke-static {v9, v12}, Landroidx/media3/ui/b;->e(FI)I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-static {v9, v10}, Landroidx/media3/ui/b;->e(FI)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    const/16 v13, 0xc

    .line 132
    .line 133
    invoke-static {v9, v13}, Landroidx/media3/ui/b;->e(FI)I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    const/4 v14, 0x0

    .line 138
    invoke-static {v9, v14}, Landroidx/media3/ui/b;->e(FI)I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    const/16 p2, 0x1

    .line 143
    .line 144
    const/16 v8, 0x10

    .line 145
    .line 146
    invoke-static {v9, v8}, Landroidx/media3/ui/b;->e(FI)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v0, :cond_14a

    .line 151
    .line 152
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    sget-object v14, Lax/a2/F;->e:[I

    .line 157
    .line 158
    move-object/from16 v17, v5

    .line 159
    .line 160
    move-object/from16 v16, v6

    .line 161
    .line 162
    move/from16 v6, p3

    .line 163
    .line 164
    move/from16 v5, p5

    .line 165
    .line 166
    invoke-virtual {v9, v0, v14, v6, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    :try_start_a9
    sget v0, Lax/a2/F;->p:I

    .line 171
    .line 172
    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, v1, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    if-eqz v0, :cond_c2

    .line 179
    .line 180
    invoke-direct {v1, v0}, Landroidx/media3/ui/b;->o(Landroid/graphics/drawable/Drawable;)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    goto :goto_c2

    .line 192
    :catchall_bf
    move-exception v0

    .line 193
    goto/16 :goto_146

    .line 194
    .line 195
    :cond_c2
    :goto_c2
    sget v0, Lax/a2/F;->i:I

    .line 196
    .line 197
    invoke-virtual {v5, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iput v0, v1, Landroidx/media3/ui/b;->l:I

    .line 202
    .line 203
    sget v0, Lax/a2/F;->r:I

    .line 204
    .line 205
    invoke-virtual {v5, v0, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iput v0, v1, Landroidx/media3/ui/b;->m:I

    .line 210
    .line 211
    sget v0, Lax/a2/F;->h:I

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    iput v0, v1, Landroidx/media3/ui/b;->n:I

    .line 219
    .line 220
    sget v0, Lax/a2/F;->g:I

    .line 221
    .line 222
    invoke-virtual {v5, v0, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    iput v0, v1, Landroidx/media3/ui/b;->o:I

    .line 227
    .line 228
    sget v0, Lax/a2/F;->q:I

    .line 229
    .line 230
    invoke-virtual {v5, v0, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    iput v0, v1, Landroidx/media3/ui/b;->p:I

    .line 235
    .line 236
    sget v0, Lax/a2/F;->n:I

    .line 237
    .line 238
    invoke-virtual {v5, v0, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    iput v0, v1, Landroidx/media3/ui/b;->q:I

    .line 243
    .line 244
    sget v0, Lax/a2/F;->o:I

    .line 245
    .line 246
    invoke-virtual {v5, v0, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    iput v0, v1, Landroidx/media3/ui/b;->r:I

    .line 251
    .line 252
    sget v0, Lax/a2/F;->l:I

    .line 253
    .line 254
    const/4 v6, -0x1

    .line 255
    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    sget v8, Lax/a2/F;->m:I

    .line 260
    .line 261
    invoke-virtual {v5, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    sget v8, Lax/a2/F;->j:I

    .line 266
    .line 267
    const v9, -0x33000001    # -1.3421772E8f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    sget v9, Lax/a2/F;->s:I

    .line 275
    .line 276
    const v10, 0x33ffffff

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    sget v10, Lax/a2/F;->f:I

    .line 284
    .line 285
    const v11, -0x4d000100

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    sget v11, Lax/a2/F;->k:I

    .line 293
    .line 294
    const v12, 0x33ffff00

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5, v11, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v0, v17

    .line 314
    .line 315
    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 316
    .line 317
    .line 318
    move-object/from16 v6, v16

    .line 319
    .line 320
    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V
    :try_end_142
    .catchall {:try_start_a9 .. :try_end_142} :catchall_bf

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 324
    .line 325
    .line 326
    goto :goto_17c

    .line 327
    :goto_146
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 328
    .line 329
    .line 330
    throw v0

    .line 331
    :cond_14a
    move-object v0, v5

    .line 332
    iput v11, v1, Landroidx/media3/ui/b;->l:I

    .line 333
    .line 334
    iput v12, v1, Landroidx/media3/ui/b;->m:I

    .line 335
    .line 336
    const/4 v5, 0x0

    .line 337
    iput v5, v1, Landroidx/media3/ui/b;->n:I

    .line 338
    .line 339
    iput v10, v1, Landroidx/media3/ui/b;->o:I

    .line 340
    .line 341
    iput v13, v1, Landroidx/media3/ui/b;->p:I

    .line 342
    .line 343
    iput v15, v1, Landroidx/media3/ui/b;->q:I

    .line 344
    .line 345
    iput v8, v1, Landroidx/media3/ui/b;->r:I

    .line 346
    .line 347
    const/4 v5, -0x1

    .line 348
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 352
    .line 353
    .line 354
    const v9, -0x33000001    # -1.3421772E8f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 358
    .line 359
    .line 360
    const v10, 0x33ffffff

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 364
    .line 365
    .line 366
    const v11, -0x4d000100

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 370
    .line 371
    .line 372
    const v12, 0x33ffff00

    .line 373
    .line 374
    .line 375
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 376
    .line 377
    .line 378
    const/4 v0, 0x0

    .line 379
    iput-object v0, v1, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 380
    .line 381
    :goto_17c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    iput-object v0, v1, Landroidx/media3/ui/b;->u:Ljava/lang/StringBuilder;

    .line 387
    .line 388
    new-instance v2, Ljava/util/Formatter;

    .line 389
    .line 390
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-direct {v2, v0, v3}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 395
    .line 396
    .line 397
    iput-object v2, v1, Landroidx/media3/ui/b;->v:Ljava/util/Formatter;

    .line 398
    .line 399
    new-instance v0, Lax/a2/d;

    .line 400
    .line 401
    invoke-direct {v0, v1}, Lax/a2/d;-><init>(Landroidx/media3/ui/b;)V

    .line 402
    .line 403
    .line 404
    iput-object v0, v1, Landroidx/media3/ui/b;->w:Ljava/lang/Runnable;

    .line 405
    .line 406
    iget-object v0, v1, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 407
    .line 408
    if-eqz v0, :cond_1a4

    .line 409
    .line 410
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    add-int/lit8 v0, v0, 0x1

    .line 415
    .line 416
    div-int/lit8 v0, v0, 0x2

    .line 417
    .line 418
    iput v0, v1, Landroidx/media3/ui/b;->s:I

    .line 419
    .line 420
    goto :goto_1b8

    .line 421
    :cond_1a4
    iget v0, v1, Landroidx/media3/ui/b;->q:I

    .line 422
    .line 423
    iget v2, v1, Landroidx/media3/ui/b;->p:I

    .line 424
    .line 425
    iget v3, v1, Landroidx/media3/ui/b;->r:I

    .line 426
    .line 427
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    add-int/lit8 v0, v0, 0x1

    .line 436
    .line 437
    div-int/lit8 v0, v0, 0x2

    .line 438
    .line 439
    iput v0, v1, Landroidx/media3/ui/b;->s:I

    .line 440
    .line 441
    :goto_1b8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 442
    .line 443
    iput v0, v1, Landroidx/media3/ui/b;->F:F

    .line 444
    .line 445
    new-instance v0, Landroid/animation/ValueAnimator;

    .line 446
    .line 447
    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 448
    .line 449
    .line 450
    iput-object v0, v1, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 451
    .line 452
    new-instance v2, Lax/a2/e;

    .line 453
    .line 454
    invoke-direct {v2, v1}, Lax/a2/e;-><init>(Landroidx/media3/ui/b;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 458
    .line 459
    .line 460
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    iput-wide v2, v1, Landroidx/media3/ui/b;->J:J

    .line 466
    .line 467
    iput-wide v2, v1, Landroidx/media3/ui/b;->B:J

    .line 468
    .line 469
    const/16 v0, 0x14

    .line 470
    .line 471
    iput v0, v1, Landroidx/media3/ui/b;->A:I

    .line 472
    .line 473
    const/4 v0, 0x1

    .line 474
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-nez v2, :cond_1e5

    .line 482
    .line 483
    invoke-virtual {v1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 484
    .line 485
    .line 486
    :cond_1e5
    return-void
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
.end method

.method public static synthetic c(Landroidx/media3/ui/b;Landroid/animation/ValueAnimator;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Landroidx/media3/ui/b;->F:F

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public static synthetic d(Landroidx/media3/ui/b;)V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/ui/b;->u(Z)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method private static e(FI)I
    .registers 2

    .line 1
    int-to-float p1, p1

    mul-float p1, p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private f(Landroid/graphics/Canvas;)V
    .registers 9

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gtz v4, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 13
    .line 14
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, Lax/S0/d0;->p(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    if-nez v2, :cond_4c

    .line 33
    .line 34
    iget-boolean v2, p0, Landroidx/media3/ui/b;->H:Z

    .line 35
    .line 36
    if-nez v2, :cond_38

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2c

    .line 43
    .line 44
    goto :goto_38

    .line 45
    :cond_2c
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_35

    .line 50
    .line 51
    iget v2, p0, Landroidx/media3/ui/b;->p:I

    .line 52
    .line 53
    goto :goto_3a

    .line 54
    :cond_35
    iget v2, p0, Landroidx/media3/ui/b;->q:I

    .line 55
    .line 56
    goto :goto_3a

    .line 57
    :cond_38
    :goto_38
    iget v2, p0, Landroidx/media3/ui/b;->r:I

    .line 58
    .line 59
    :goto_3a
    int-to-float v2, v2

    .line 60
    iget v3, p0, Landroidx/media3/ui/b;->F:F

    .line 61
    .line 62
    mul-float v2, v2, v3

    .line 63
    .line 64
    const/high16 v3, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float/2addr v2, v3

    .line 67
    float-to-int v2, v2

    .line 68
    int-to-float v0, v0

    .line 69
    int-to-float v1, v1

    .line 70
    int-to-float v2, v2

    .line 71
    iget-object v3, p0, Landroidx/media3/ui/b;->j:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    int-to-float v2, v2

    .line 82
    iget v3, p0, Landroidx/media3/ui/b;->F:F

    .line 83
    .line 84
    mul-float v2, v2, v3

    .line 85
    .line 86
    float-to-int v2, v2

    .line 87
    iget-object v3, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    int-to-float v3, v3

    .line 94
    iget v4, p0, Landroidx/media3/ui/b;->F:F

    .line 95
    .line 96
    mul-float v3, v3, v4

    .line 97
    .line 98
    float-to-int v3, v3

    .line 99
    iget-object v4, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 100
    .line 101
    div-int/lit8 v2, v2, 0x2

    .line 102
    .line 103
    sub-int v5, v0, v2

    .line 104
    .line 105
    div-int/lit8 v3, v3, 0x2

    .line 106
    .line 107
    sub-int v6, v1, v3

    .line 108
    .line 109
    add-int/2addr v0, v2

    .line 110
    add-int/2addr v1, v3

    .line 111
    invoke-virtual {v4, v5, v6, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 117
    .line 118
    .line 119
    return-void
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

.method private g(Landroid/graphics/Canvas;)V
    .registers 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    div-int/lit8 v3, v1, 0x2

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    add-int/2addr v1, v2

    .line 19
    iget-wide v3, v0, Landroidx/media3/ui/b;->J:J

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    cmp-long v7, v3, v5

    .line 24
    .line 25
    if-gtz v7, :cond_2c

    .line 26
    .line 27
    iget-object v3, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 28
    .line 29
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    int-to-float v6, v4

    .line 32
    int-to-float v7, v2

    .line 33
    iget v2, v3, Landroid/graphics/Rect;->right:I

    .line 34
    .line 35
    int-to-float v8, v2

    .line 36
    int-to-float v9, v1

    .line 37
    iget-object v10, v0, Landroidx/media3/ui/b;->g:Landroid/graphics/Paint;

    .line 38
    .line 39
    move-object/from16 v5, p1

    .line 40
    .line 41
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    iget-object v3, v0, Landroidx/media3/ui/b;->c:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 50
    .line 51
    iget-object v5, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 52
    .line 53
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    iget-object v6, v0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget-object v6, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    if-ge v5, v6, :cond_55

    .line 72
    .line 73
    int-to-float v12, v5

    .line 74
    int-to-float v13, v2

    .line 75
    int-to-float v14, v6

    .line 76
    int-to-float v15, v1

    .line 77
    iget-object v5, v0, Landroidx/media3/ui/b;->g:Landroid/graphics/Paint;

    .line 78
    .line 79
    move-object/from16 v11, p1

    .line 80
    .line 81
    move-object/from16 v16, v5

    .line 82
    .line 83
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 84
    .line 85
    .line 86
    :cond_55
    iget-object v5, v0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 87
    .line 88
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-le v3, v4, :cond_6c

    .line 95
    .line 96
    int-to-float v12, v4

    .line 97
    int-to-float v13, v2

    .line 98
    int-to-float v14, v3

    .line 99
    int-to-float v15, v1

    .line 100
    iget-object v3, v0, Landroidx/media3/ui/b;->f:Landroid/graphics/Paint;

    .line 101
    .line 102
    move-object/from16 v11, p1

    .line 103
    .line 104
    move-object/from16 v16, v3

    .line 105
    .line 106
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 107
    .line 108
    .line 109
    :cond_6c
    iget-object v3, v0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-lez v3, :cond_87

    .line 116
    .line 117
    iget-object v3, v0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 118
    .line 119
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 120
    .line 121
    int-to-float v12, v4

    .line 122
    int-to-float v13, v2

    .line 123
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 124
    .line 125
    int-to-float v14, v3

    .line 126
    int-to-float v15, v1

    .line 127
    iget-object v3, v0, Landroidx/media3/ui/b;->e:Landroid/graphics/Paint;

    .line 128
    .line 129
    move-object/from16 v11, p1

    .line 130
    .line 131
    move-object/from16 v16, v3

    .line 132
    .line 133
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    :cond_87
    iget v3, v0, Landroidx/media3/ui/b;->M:I

    .line 137
    .line 138
    if-nez v3, :cond_8c

    .line 139
    .line 140
    goto :goto_ed

    .line 141
    :cond_8c
    iget-object v3, v0, Landroidx/media3/ui/b;->N:[J

    .line 142
    .line 143
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, [J

    .line 148
    .line 149
    iget-object v4, v0, Landroidx/media3/ui/b;->O:[Z

    .line 150
    .line 151
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, [Z

    .line 156
    .line 157
    iget v5, v0, Landroidx/media3/ui/b;->o:I

    .line 158
    .line 159
    div-int/lit8 v5, v5, 0x2

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    :goto_a2
    iget v8, v0, Landroidx/media3/ui/b;->M:I

    .line 164
    .line 165
    if-ge v7, v8, :cond_ed

    .line 166
    .line 167
    aget-wide v9, v3, v7

    .line 168
    .line 169
    const-wide/16 v11, 0x0

    .line 170
    .line 171
    iget-wide v13, v0, Landroidx/media3/ui/b;->J:J

    .line 172
    .line 173
    invoke-static/range {v9 .. v14}, Lax/S0/d0;->q(JJJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v8

    .line 177
    iget-object v10, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 178
    .line 179
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    int-to-long v10, v10

    .line 184
    mul-long v10, v10, v8

    .line 185
    .line 186
    iget-wide v8, v0, Landroidx/media3/ui/b;->J:J

    .line 187
    .line 188
    div-long/2addr v10, v8

    .line 189
    long-to-int v8, v10

    .line 190
    sub-int/2addr v8, v5

    .line 191
    iget-object v9, v0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 192
    .line 193
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 194
    .line 195
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    iget v11, v0, Landroidx/media3/ui/b;->o:I

    .line 200
    .line 201
    sub-int/2addr v9, v11

    .line 202
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    add-int/2addr v10, v8

    .line 211
    aget-boolean v8, v4, v7

    .line 212
    .line 213
    if-eqz v8, :cond_db

    .line 214
    .line 215
    iget-object v8, v0, Landroidx/media3/ui/b;->i:Landroid/graphics/Paint;

    .line 216
    .line 217
    :goto_d8
    move-object/from16 v16, v8

    .line 218
    .line 219
    goto :goto_de

    .line 220
    :cond_db
    iget-object v8, v0, Landroidx/media3/ui/b;->h:Landroid/graphics/Paint;

    .line 221
    .line 222
    goto :goto_d8

    .line 223
    :goto_de
    int-to-float v12, v10

    .line 224
    int-to-float v13, v2

    .line 225
    iget v8, v0, Landroidx/media3/ui/b;->o:I

    .line 226
    .line 227
    add-int/2addr v10, v8

    .line 228
    int-to-float v14, v10

    .line 229
    int-to-float v15, v1

    .line 230
    move-object/from16 v11, p1

    .line 231
    .line 232
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    add-int/lit8 v7, v7, 0x1

    .line 236
    .line 237
    goto :goto_a2

    .line 238
    :cond_ed
    :goto_ed
    return-void
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

.method private getPositionIncrement()J
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->B:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-nez v4, :cond_18

    .line 11
    .line 12
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 13
    .line 14
    cmp-long v4, v0, v2

    .line 15
    .line 16
    if-nez v4, :cond_14

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    return-wide v0

    .line 21
    :cond_14
    iget v2, p0, Landroidx/media3/ui/b;->A:I

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    div-long/2addr v0, v2

    .line 25
    :cond_18
    return-wide v0
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

.method private getProgressText()Ljava/lang/String;
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->u:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/b;->v:Ljava/util/Formatter;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/media3/ui/b;->K:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lax/S0/d0;->q0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method private getScrubberPosition()J
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_28

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 10
    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-nez v4, :cond_14

    .line 19
    .line 20
    goto :goto_28

    .line 21
    :cond_14
    iget-object v0, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v0, v0

    .line 28
    iget-wide v2, p0, Landroidx/media3/ui/b;->J:J

    .line 29
    .line 30
    mul-long v0, v0, v2

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    int-to-long v2, v2

    .line 39
    div-long/2addr v0, v2

    .line 40
    return-wide v0

    .line 41
    :cond_28
    :goto_28
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    return-wide v0
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

.method private j(FF)Z
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    float-to-int p2, p2

    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method private k(F)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    iget-object v1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 5
    .line 6
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 9
    .line 10
    invoke-static {p1, v2, v1}, Lax/S0/d0;->p(III)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static l(FI)I
    .registers 2

    .line 1
    int-to-float p1, p1

    div-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private m(Landroid/view/MotionEvent;)Landroid/graphics/Point;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->y:Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    float-to-int v1, v1

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    float-to-int p1, p1

    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Point;->set(II)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/ui/b;->y:Landroid/graphics/Point;

    .line 17
    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private n(J)Z
    .registers 12

    .line 1
    iget-wide v4, p0, Landroidx/media3/ui/b;->J:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    cmp-long v2, v4, v0

    .line 7
    .line 8
    if-gtz v2, :cond_a

    .line 9
    .line 10
    return v6

    .line 11
    :cond_a
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 12
    .line 13
    if-eqz v0, :cond_12

    .line 14
    .line 15
    iget-wide v0, p0, Landroidx/media3/ui/b;->I:J

    .line 16
    .line 17
    :goto_10
    move-wide v7, v0

    .line 18
    goto :goto_15

    .line 19
    :cond_12
    iget-wide v0, p0, Landroidx/media3/ui/b;->K:J

    .line 20
    .line 21
    goto :goto_10

    .line 22
    :goto_15
    add-long v0, v7, p1

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lax/S0/d0;->q(JJJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    cmp-long v0, p1, v7

    .line 31
    .line 32
    if-nez v0, :cond_22

    .line 33
    .line 34
    return v6

    .line 35
    :cond_22
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 36
    .line 37
    if-nez v0, :cond_2a

    .line 38
    .line 39
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/b;->t(J)V

    .line 40
    .line 41
    .line 42
    goto :goto_2d

    .line 43
    :cond_2a
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/b;->x(J)V

    .line 44
    .line 45
    .line 46
    :goto_2d
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    return p1
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

.method private o(Landroid/graphics/drawable/Drawable;)Z
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1, v0}, Landroidx/media3/ui/b;->p(Landroid/graphics/drawable/Drawable;I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

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

.method private static p(Landroid/graphics/drawable/Drawable;I)Z
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_e

    .line 6
    .line 7
    invoke-static {p0, p1}, Lax/a2/b;->a(Landroid/graphics/drawable/Drawable;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_e
    const/4 p0, 0x0

    .line 16
    return p0
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

.method private q(II)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->D:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ne v0, p1, :cond_13

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/b;->D:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, p2, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroidx/media3/ui/b;->D:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0, p1}, Lax/a2/c;->a(Landroidx/media3/ui/b;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private t(J)V
    .registers 5

    .line 1
    iput-wide p1, p0, Landroidx/media3/ui/b;->I:J

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_11

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Landroidx/media3/ui/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_27

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/media3/ui/G$a;

    .line 35
    .line 36
    invoke-interface {v1, p0, p1, p2}, Landroidx/media3/ui/G$a;->G(Landroidx/media3/ui/G;J)V

    .line 37
    .line 38
    .line 39
    goto :goto_17

    .line 40
    :cond_27
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

.method private u(Z)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->w:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_14

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/ui/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2f

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/media3/ui/G$a;

    .line 41
    .line 42
    iget-wide v2, p0, Landroidx/media3/ui/b;->I:J

    .line 43
    .line 44
    invoke-interface {v1, p0, v2, v3, p1}, Landroidx/media3/ui/G$a;->M(Landroidx/media3/ui/G;JZ)V

    .line 45
    .line 46
    .line 47
    goto :goto_1d

    .line 48
    :cond_2f
    return-void
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

.method private v()V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    iget-wide v0, p0, Landroidx/media3/ui/b;->I:J

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    iget-wide v0, p0, Landroidx/media3/ui/b;->K:J

    .line 23
    .line 24
    :goto_17
    iget-wide v2, p0, Landroidx/media3/ui/b;->J:J

    .line 25
    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v6, v2, v4

    .line 29
    .line 30
    if-lez v6, :cond_5a

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    int-to-long v2, v2

    .line 39
    iget-wide v4, p0, Landroidx/media3/ui/b;->L:J

    .line 40
    .line 41
    mul-long v2, v2, v4

    .line 42
    .line 43
    iget-wide v4, p0, Landroidx/media3/ui/b;->J:J

    .line 44
    .line 45
    div-long/2addr v2, v4

    .line 46
    long-to-int v3, v2

    .line 47
    iget-object v2, p0, Landroidx/media3/ui/b;->c:Landroid/graphics/Rect;

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 50
    .line 51
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    add-int/2addr v5, v3

    .line 54
    iget v3, v4, Landroid/graphics/Rect;->right:I

    .line 55
    .line 56
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    iput v3, v2, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-long v2, v2

    .line 69
    mul-long v2, v2, v0

    .line 70
    .line 71
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 72
    .line 73
    div-long/2addr v2, v0

    .line 74
    long-to-int v0, v2

    .line 75
    iget-object v1, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget-object v2, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 78
    .line 79
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 80
    .line 81
    add-int/2addr v3, v0

    .line 82
    iget v0, v2, Landroid/graphics/Rect;->right:I

    .line 83
    .line 84
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    goto :goto_66

    .line 91
    :cond_5a
    iget-object v0, p0, Landroidx/media3/ui/b;->c:Landroid/graphics/Rect;

    .line 92
    .line 93
    iget-object v1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 94
    .line 95
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 96
    .line 97
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 98
    .line 99
    iget-object v0, p0, Landroidx/media3/ui/b;->d:Landroid/graphics/Rect;

    .line 100
    .line 101
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 102
    .line 103
    :goto_66
    iget-object v0, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    return-void
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
.end method

.method private w()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method private x(J)V
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->I:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-nez v2, :cond_7

    .line 6
    .line 7
    goto :goto_1f

    .line 8
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/b;->I:J

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/ui/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1f

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/media3/ui/G$a;

    .line 27
    .line 28
    invoke-interface {v1, p0, p1, p2}, Landroidx/media3/ui/G$a;->K(Landroidx/media3/ui/G;J)V

    .line 29
    .line 30
    .line 31
    goto :goto_f

    .line 32
    :cond_1f
    :goto_1f
    return-void
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


# virtual methods
.method public a(Landroidx/media3/ui/G$a;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 7
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
    .line 22
.end method

.method public b([J[ZI)V
    .registers 5

    .line 1
    if-eqz p3, :cond_9

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    if-eqz p2, :cond_7

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    :goto_9
    const/4 v0, 0x1

    .line 11
    :goto_a
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iput p3, p0, Landroidx/media3/ui/b;->M:I

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/ui/b;->N:[J

    .line 17
    .line 18
    iput-object p2, p0, Landroidx/media3/ui/b;->O:[Z

    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 21
    .line 22
    .line 23
    return-void
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

.method protected drawableStateChanged()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/ui/b;->w()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public getPreferredUpdateDelay()J
    .registers 7

    .line 1
    iget v0, p0, Landroidx/media3/ui/b;->z:F

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Landroidx/media3/ui/b;->l(FI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_23

    .line 14
    .line 15
    iget-wide v1, p0, Landroidx/media3/ui/b;->J:J

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmp-long v5, v1, v3

    .line 20
    .line 21
    if-eqz v5, :cond_23

    .line 22
    .line 23
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long v5, v1, v3

    .line 29
    .line 30
    if-nez v5, :cond_20

    .line 31
    .line 32
    goto :goto_23

    .line 33
    :cond_20
    int-to-long v3, v0

    .line 34
    div-long/2addr v1, v3

    .line 35
    return-wide v1

    .line 36
    :cond_23
    :goto_23
    const-wide v0, 0x7fffffffffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    return-wide v0
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

.method public h(J)V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    iget v1, p0, Landroidx/media3/ui/b;->F:F

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    new-array v2, v2, [F

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput v1, v2, v3

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    aput v1, v2, v3

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public i(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_d
    iput-boolean p1, p0, Landroidx/media3/ui/b;->G:Z

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Landroidx/media3/ui/b;->F:F

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method public jumpDrawablesToCurrentState()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 9
    .line 10
    .line 11
    :cond_a
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->g(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->f(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .registers 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Landroidx/media3/ui/b;->H:Z

    .line 5
    .line 6
    if-eqz p2, :cond_d

    .line 7
    .line 8
    if-nez p1, :cond_d

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->u(Z)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
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

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_15

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0}, Landroidx/media3/ui/b;->getProgressText()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_15
    const-string v0, "android.widget.SeekBar"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.widget.SeekBar"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/ui/b;->getProgressText()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-gtz v4, :cond_18

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_FORWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_BACKWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 33
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
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_30

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/ui/b;->getPositionIncrement()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const/16 v2, 0x42

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq p1, v2, :cond_27

    .line 15
    .line 16
    packed-switch p1, :pswitch_data_36

    .line 17
    .line 18
    .line 19
    goto :goto_30

    .line 20
    :pswitch_13
    neg-long v0, v0

    .line 21
    :pswitch_14
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/b;->n(J)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_30

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/ui/b;->w:Ljava/lang/Runnable;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/media3/ui/b;->w:Ljava/lang/Runnable;

    .line 33
    .line 34
    const-wide/16 v0, 0x3e8

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    return v3

    .line 40
    :cond_27
    :pswitch_27
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 41
    .line 42
    if-eqz v0, :cond_30

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->u(Z)V

    .line 46
    .line 47
    .line 48
    return v3

    .line 49
    :cond_30
    :goto_30
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_36
    .packed-switch 0x15
        :pswitch_13
        :pswitch_14
        :pswitch_27
    .end packed-switch
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

.method protected onLayout(ZIIII)V
    .registers 10

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    sub-int p2, p4, p2

    .line 12
    .line 13
    iget-boolean p3, p0, Landroidx/media3/ui/b;->G:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p3, :cond_13

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    goto :goto_15

    .line 20
    :cond_13
    iget p3, p0, Landroidx/media3/ui/b;->s:I

    .line 21
    .line 22
    :goto_15
    iget v1, p0, Landroidx/media3/ui/b;->n:I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_36

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sub-int v1, p5, v1

    .line 32
    .line 33
    iget v2, p0, Landroidx/media3/ui/b;->m:I

    .line 34
    .line 35
    sub-int/2addr v1, v2

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int v2, p5, v2

    .line 41
    .line 42
    iget v3, p0, Landroidx/media3/ui/b;->l:I

    .line 43
    .line 44
    sub-int/2addr v2, v3

    .line 45
    div-int/lit8 v3, v3, 0x2

    .line 46
    .line 47
    sub-int v3, p3, v3

    .line 48
    .line 49
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int/2addr v2, v0

    .line 54
    goto :goto_42

    .line 55
    :cond_36
    iget v0, p0, Landroidx/media3/ui/b;->m:I

    .line 56
    .line 57
    sub-int v0, p5, v0

    .line 58
    .line 59
    div-int/lit8 v1, v0, 0x2

    .line 60
    .line 61
    iget v0, p0, Landroidx/media3/ui/b;->l:I

    .line 62
    .line 63
    sub-int v0, p5, v0

    .line 64
    .line 65
    div-int/lit8 v2, v0, 0x2

    .line 66
    .line 67
    :goto_42
    iget-object v0, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget v3, p0, Landroidx/media3/ui/b;->m:I

    .line 70
    .line 71
    add-int/2addr v3, v1

    .line 72
    invoke-virtual {v0, p1, v1, p2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Landroidx/media3/ui/b;->b:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget-object p2, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 78
    .line 79
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 80
    .line 81
    add-int/2addr v0, p3

    .line 82
    iget p2, p2, Landroid/graphics/Rect;->right:I

    .line 83
    .line 84
    sub-int/2addr p2, p3

    .line 85
    iget p3, p0, Landroidx/media3/ui/b;->l:I

    .line 86
    .line 87
    add-int/2addr p3, v2

    .line 88
    invoke-virtual {p1, v0, v2, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 89
    .line 90
    .line 91
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 p2, 0x1d

    .line 94
    .line 95
    if-lt p1, p2, :cond_63

    .line 96
    .line 97
    invoke-direct {p0, p4, p5}, Landroidx/media3/ui/b;->q(II)V

    .line 98
    .line 99
    .line 100
    :cond_63
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 101
    .line 102
    .line 103
    return-void
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

.method protected onMeasure(II)V
    .registers 5

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    iget p2, p0, Landroidx/media3/ui/b;->m:I

    .line 12
    .line 13
    goto :goto_18

    .line 14
    :cond_d
    const/high16 v1, 0x40000000    # 2.0f

    .line 15
    .line 16
    if-ne v0, v1, :cond_12

    .line 17
    .line 18
    goto :goto_18

    .line 19
    :cond_12
    iget v0, p0, Landroidx/media3/ui/b;->m:I

    .line 20
    .line 21
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    :goto_18
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/media3/ui/b;->w()V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/ui/b;->p(Landroid/graphics/drawable/Drawable;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_76

    .line 7
    .line 8
    iget-wide v2, p0, Landroidx/media3/ui/b;->J:J

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-gtz v0, :cond_10

    .line 15
    .line 16
    goto :goto_76

    .line 17
    :cond_10
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->m(Landroid/view/MotionEvent;)Landroid/graphics/Point;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 22
    .line 23
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-eqz v3, :cond_5d

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    if-eq v3, v4, :cond_4e

    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    if-eq v3, v6, :cond_28

    .line 37
    .line 38
    if-eq v3, v5, :cond_4e

    .line 39
    .line 40
    goto :goto_76

    .line 41
    :cond_28
    iget-boolean p1, p0, Landroidx/media3/ui/b;->H:Z

    .line 42
    .line 43
    if-eqz p1, :cond_76

    .line 44
    .line 45
    iget p1, p0, Landroidx/media3/ui/b;->t:I

    .line 46
    .line 47
    if-ge v0, p1, :cond_3a

    .line 48
    .line 49
    iget p1, p0, Landroidx/media3/ui/b;->C:I

    .line 50
    .line 51
    sub-int/2addr v2, p1

    .line 52
    div-int/2addr v2, v5

    .line 53
    add-int/2addr p1, v2

    .line 54
    int-to-float p1, p1

    .line 55
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->k(F)V

    .line 56
    .line 57
    .line 58
    goto :goto_40

    .line 59
    :cond_3a
    iput v2, p0, Landroidx/media3/ui/b;->C:I

    .line 60
    .line 61
    int-to-float p1, v2

    .line 62
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->k(F)V

    .line 63
    .line 64
    .line 65
    :goto_40
    invoke-direct {p0}, Landroidx/media3/ui/b;->getScrubberPosition()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/b;->x(J)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 76
    .line 77
    .line 78
    return v4

    .line 79
    :cond_4e
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 80
    .line 81
    if-eqz v0, :cond_76

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-ne p1, v5, :cond_59

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    :cond_59
    invoke-direct {p0, v1}, Landroidx/media3/ui/b;->u(Z)V

    .line 91
    .line 92
    .line 93
    return v4

    .line 94
    :cond_5d
    int-to-float p1, v2

    .line 95
    int-to-float v0, v0

    .line 96
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/b;->j(FF)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_76

    .line 101
    .line 102
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->k(F)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0}, Landroidx/media3/ui/b;->getScrubberPosition()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/b;->t(J)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 116
    .line 117
    .line 118
    return v4

    .line 119
    :cond_76
    :goto_76
    return v1
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

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .registers 9

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    iget-wide v1, p0, Landroidx/media3/ui/b;->J:J

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    cmp-long v5, v1, v3

    .line 15
    .line 16
    if-gtz v5, :cond_12

    .line 17
    .line 18
    return p2

    .line 19
    :cond_12
    const/16 v1, 0x2000

    .line 20
    .line 21
    if-ne p1, v1, :cond_25

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/media3/ui/b;->getPositionIncrement()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    neg-long v1, v1

    .line 28
    invoke-direct {p0, v1, v2}, Landroidx/media3/ui/b;->n(J)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_36

    .line 33
    .line 34
    invoke-direct {p0, p2}, Landroidx/media3/ui/b;->u(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_36

    .line 38
    :cond_25
    const/16 v1, 0x1000

    .line 39
    .line 40
    if-ne p1, v1, :cond_3b

    .line 41
    .line 42
    invoke-direct {p0}, Landroidx/media3/ui/b;->getPositionIncrement()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    invoke-direct {p0, v1, v2}, Landroidx/media3/ui/b;->n(J)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_36

    .line 51
    .line 52
    invoke-direct {p0, p2}, Landroidx/media3/ui/b;->u(Z)V

    .line 53
    .line 54
    .line 55
    :cond_36
    :goto_36
    const/4 p1, 0x4

    .line 56
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :cond_3b
    return p2
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

.method public r()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Landroidx/media3/ui/b;->G:Z

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput v0, p0, Landroidx/media3/ui/b;->F:F

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public s(J)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_e

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iput-boolean v0, p0, Landroidx/media3/ui/b;->G:Z

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    iget v2, p0, Landroidx/media3/ui/b;->F:F

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [F

    .line 23
    .line 24
    aput v2, v3, v0

    .line 25
    .line 26
    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput v0, v3, v2

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/media3/ui/b;->E:Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

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
.end method

.method public setAdMarkerColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method

.method public setBufferedColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method

.method public setBufferedPosition(J)V
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->L:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-nez v2, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/b;->L:J

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public setDuration(J)V
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->J:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-nez v2, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/b;->J:J

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1a

    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v2, p1, v0

    .line 20
    .line 21
    if-nez v2, :cond_1a

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->u(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public setEnabled(Z)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/ui/b;->H:Z

    .line 5
    .line 6
    if-eqz v0, :cond_d

    .line 7
    .line 8
    if-nez p1, :cond_d

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/ui/b;->u(Z)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setKeyCountIncrement(I)V
    .registers 4

    .line 1
    if-lez p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Landroidx/media3/ui/b;->A:I

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v0, p0, Landroidx/media3/ui/b;->B:J

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setKeyTimeIncrement(J)V
    .registers 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-lez v2, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Landroidx/media3/ui/b;->A:I

    .line 15
    .line 16
    iput-wide p1, p0, Landroidx/media3/ui/b;->B:J

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setPlayedAdMarkerColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->i:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method

.method public setPlayedColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->e:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method

.method public setPosition(J)V
    .registers 6

    .line 1
    iget-wide v0, p0, Landroidx/media3/ui/b;->K:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-nez v2, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/b;->K:J

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/ui/b;->getProgressText()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/ui/b;->v()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public setScrubberColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->j:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method

.method public setUnplayedColor(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/b;->g:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/b;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 9
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
.end method
