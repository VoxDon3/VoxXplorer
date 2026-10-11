.class public Lcom/voxdon/xplorer/widget/a;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/widget/a$c;,
        Lcom/voxdon/xplorer/widget/a$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/voxdon/xplorer/file/n;",
        ">;"
    }
.end annotation


# static fields
.field private static N:Landroid/content/res/ColorStateList;

.field private static O:Landroid/content/res/ColorStateList;


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Landroid/widget/AdapterView$OnItemClickListener;

.field private E:Z

.field private F:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Lax/Z2/q;",
            ">;"
        }
    .end annotation
.end field

.field private G:Z

.field private H:Ljava/util/Date;

.field private I:Ljava/util/Date;

.field private J:Ljava/lang/String;

.field private K:Z

.field private L:I

.field private M:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Ljava/lang/Object;

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Lcom/voxdon/xplorer/file/o;

.field private e:Lax/r3/d;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:J

.field private l:J

.field private m:Lax/x3/z;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:I

.field private s:Lax/Q2/f;

.field private t:Z

.field private u:I

.field private v:Ljava/lang/String;

.field private w:I

.field private x:I

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/r3/d;ILax/x3/z;ZZ)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/r3/d;",
            "I",
            "Lax/x3/z;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 3
    .line 4
    .line 5
    new-instance p2, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->h:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->i:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->j:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->o:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->p:Z

    .line 21
    .line 22
    new-instance p2, Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 30
    .line 31
    iput-object p3, p0, Lcom/voxdon/xplorer/widget/a;->d:Lcom/voxdon/xplorer/file/o;

    .line 32
    .line 33
    iput-object p4, p0, Lcom/voxdon/xplorer/widget/a;->e:Lax/r3/d;

    .line 34
    .line 35
    iput-object p6, p0, Lcom/voxdon/xplorer/widget/a;->m:Lax/x3/z;

    .line 36
    .line 37
    iput-boolean p7, p0, Lcom/voxdon/xplorer/widget/a;->p:Z

    .line 38
    .line 39
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/a;->s:Lax/Q2/f;

    .line 44
    .line 45
    iput-boolean p8, p0, Lcom/voxdon/xplorer/widget/a;->E:Z

    .line 46
    .line 47
    invoke-static {p2}, Lax/Q2/f;->k0(Lax/Q2/f;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_42

    .line 52
    .line 53
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->s:Lax/Q2/f;

    .line 54
    .line 55
    invoke-static {p2}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_42

    .line 60
    .line 61
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->s:Lax/Q2/f;

    .line 62
    .line 63
    sget-object p3, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 64
    .line 65
    if-ne p2, p3, :cond_43

    .line 66
    .line 67
    :cond_42
    const/4 v0, 0x1

    .line 68
    :cond_43
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->t:Z

    .line 69
    .line 70
    sget-object p2, Lcom/voxdon/xplorer/widget/a;->O:Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    if-nez p2, :cond_5b

    .line 73
    .line 74
    const p2, 0x7f060432

    .line 75
    .line 76
    .line 77
    invoke-static {p1, p2}, Lax/Q/b;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    sput-object p2, Lcom/voxdon/xplorer/widget/a;->O:Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    const p2, 0x7f060433

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p2}, Lax/Q/b;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sput-object p1, Lcom/voxdon/xplorer/widget/a;->N:Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    :cond_5b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/widget/a;->f0()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p5}, Lcom/voxdon/xplorer/widget/a;->o0(I)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->Y()V

    .line 99
    .line 100
    .line 101
    return-void
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
    .line 483
    .line 484
    .line 485
    .line 486
.end method

.method static synthetic A(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->y:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic B(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->h:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic C(Lcom/voxdon/xplorer/widget/a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/widget/a;->l:J

    .line 2
    .line 3
    return-wide v0
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
    .line 22
.end method

.method private C0()Z
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    return v0
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

.method static synthetic D(Lcom/voxdon/xplorer/widget/a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/widget/a;->k:J

    .line 2
    .line 3
    return-wide v0
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
    .line 22
.end method

.method static synthetic E(Lcom/voxdon/xplorer/widget/a;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->J:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic F(Lcom/voxdon/xplorer/widget/a;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic G(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->w:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic H(Lcom/voxdon/xplorer/widget/a;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->w:I

    .line 2
    .line 3
    return p1
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

.method static synthetic I(Lcom/voxdon/xplorer/widget/a;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic J(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->E:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method private K()V
    .registers 9

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    move-object v1, v0

    .line 10
    const/4 v3, -0x1

    .line 11
    const/4 v4, -0x1

    .line 12
    :goto_b
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-ge v2, v5, :cond_3d

    .line 17
    .line 18
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1f

    .line 25
    .line 26
    invoke-direct {p0, v5, v0}, Lcom/voxdon/xplorer/widget/a;->d0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_37

    .line 31
    .line 32
    :cond_1f
    if-ltz v3, :cond_31

    .line 33
    .line 34
    if-ltz v4, :cond_31

    .line 35
    .line 36
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 37
    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v7, Lax/Z2/q;

    .line 43
    .line 44
    invoke-direct {v7, v4, v3, v1}, Lax/Z2/q;-><init>(IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-direct {p0, v5}, Lcom/voxdon/xplorer/widget/a;->Q(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v1, v0

    .line 55
    move v4, v2

    .line 56
    :cond_37
    add-int/lit8 v0, v2, 0x1

    .line 57
    .line 58
    move v3, v2

    .line 59
    move v2, v0

    .line 60
    move-object v0, v5

    .line 61
    goto :goto_b

    .line 62
    :cond_3d
    if-ltz v3, :cond_4f

    .line 63
    .line 64
    if-ltz v4, :cond_4f

    .line 65
    .line 66
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v5, Lax/Z2/q;

    .line 73
    .line 74
    invoke-direct {v5, v4, v3, v1}, Lax/Z2/q;-><init>(IILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_4f
    return-void
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
.end method

.method private Q(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    instance-of v0, p1, Lax/c3/n;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_9
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_15

    .line 14
    .line 15
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->L:I

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/n;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_15
    const/4 v1, 0x2

    .line 23
    if-ne v0, v1, :cond_1d

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1d
    const/4 p1, 0x0

    .line 31
    return-object p1
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

.method private R(Lcom/voxdon/xplorer/file/n;ZI)Landroid/graphics/drawable/Drawable;
    .registers 5

    .line 1
    if-eqz p2, :cond_29

    .line 2
    .line 3
    iget p2, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/widget/a;->a0(I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_17

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2, p1}, Lax/s3/b;->i(Landroid/content/Context;Lax/Q2/f;)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_17
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-eqz p3, :cond_1f

    .line 29
    .line 30
    const/4 p3, 0x1

    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    const/4 p3, 0x0

    .line 33
    :goto_20
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->C0()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {p2, p1, p3, v0}, Lax/s3/b;->g(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;ZZ)Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_29
    iget p2, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 43
    .line 44
    const/4 p3, 0x2

    .line 45
    if-ne p2, p3, :cond_37

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/n;->M(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_37
    const/16 p3, 0xa

    .line 57
    .line 58
    if-ne p2, p3, :cond_52

    .line 59
    .line 60
    new-instance p2, Landroid/graphics/drawable/InsetDrawable;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p1, p3}, Lcom/voxdon/xplorer/file/n;->M(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    const/4 v0, 0x4

    .line 75
    invoke-static {p3, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-direct {p2, p1, p3}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 80
    .line 81
    .line 82
    return-object p2

    .line 83
    :cond_52
    const/16 p3, 0xc

    .line 84
    .line 85
    if-eq p2, p3, :cond_64

    .line 86
    .line 87
    const/16 p3, 0x10

    .line 88
    .line 89
    if-ne p2, p3, :cond_5b

    .line 90
    .line 91
    goto :goto_64

    .line 92
    :cond_5b
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/n;->Y(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_64
    :goto_64
    new-instance p2, Landroid/graphics/drawable/InsetDrawable;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-virtual {p1, p3}, Lcom/voxdon/xplorer/file/n;->M(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    const/16 v0, 0x8

    .line 116
    .line 117
    invoke-static {p3, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-direct {p2, p1, p3}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 122
    .line 123
    .line 124
    return-object p2
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
.end method

.method private T()I
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 2
    .line 3
    if-eqz v0, :cond_2f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2f

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2b

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_27

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    if-eq v0, v1, :cond_23

    .line 17
    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    if-eq v0, v1, :cond_1f

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    if-eq v0, v1, :cond_1f

    .line 25
    .line 26
    const/16 v1, 0x14

    .line 27
    .line 28
    if-eq v0, v1, :cond_2f

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    return v0

    .line 32
    :cond_1f
    const v0, 0x7f0d0089

    .line 33
    .line 34
    .line 35
    return v0

    .line 36
    :cond_23
    const v0, 0x7f0d008a

    .line 37
    .line 38
    .line 39
    return v0

    .line 40
    :cond_27
    const v0, 0x7f0d0121

    .line 41
    .line 42
    .line 43
    return v0

    .line 44
    :cond_2b
    const v0, 0x7f0d008c

    .line 45
    .line 46
    .line 47
    return v0

    .line 48
    :cond_2f
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 49
    .line 50
    if-eqz v0, :cond_37

    .line 51
    .line 52
    const v0, 0x7f0d0093

    .line 53
    .line 54
    .line 55
    return v0

    .line 56
    :cond_37
    const v0, 0x7f0d008e

    .line 57
    .line 58
    .line 59
    return v0
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

.method private Y()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->s:Lax/Q2/f;

    .line 2
    .line 3
    sget-object v1, Lax/Q2/f;->F0:Lax/Q2/f;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_c

    .line 7
    .line 8
    iput-boolean v2, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 9
    .line 10
    iput v2, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    sget-object v1, Lax/Q2/f;->m1:Lax/Q2/f;

    .line 14
    .line 15
    if-eq v0, v1, :cond_1b

    .line 16
    .line 17
    sget-object v1, Lax/Q2/f;->n1:Lax/Q2/f;

    .line 18
    .line 19
    if-ne v0, v1, :cond_15

    .line 20
    .line 21
    goto :goto_1b

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 24
    .line 25
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    :goto_1b
    iput-boolean v2, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 32
    .line 33
    return-void
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

.method private Z()Z
    .registers 3

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_c

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    if-ne v0, v1, :cond_a

    .line 9
    .line 10
    goto :goto_c

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_c
    :goto_c
    const/4 v0, 0x1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic a(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->g:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method private a0(I)Z
    .registers 3

    .line 1
    const/16 v0, 0xa

    if-eq p1, v0, :cond_f

    const/16 v0, 0xc

    if-eq p1, v0, :cond_f

    const/16 v0, 0x10

    if-ne p1, v0, :cond_d

    goto :goto_f

    :cond_d
    const/4 p1, 0x0

    return p1

    :cond_f
    :goto_f
    const/4 p1, 0x1

    return p1
.end method

.method static synthetic b(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method private b0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->M:Ljava/util/Set;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic c(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->C:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method private c0(JJ)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/Date;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 13
    .line 14
    if-nez v0, :cond_16

    .line 15
    .line 16
    new-instance v0, Ljava/util/Date;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 22
    .line 23
    :cond_16
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Ljava/util/Date;->setTime(J)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 29
    .line 30
    invoke-virtual {p1, p3, p4}, Ljava/util/Date;->setTime(J)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/Date;->getYear()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/util/Date;->getYear()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-ne p1, p2, :cond_4c

    .line 46
    .line 47
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/Date;->getMonth()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/util/Date;->getMonth()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-ne p1, p2, :cond_4c

    .line 60
    .line 61
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->H:Ljava/util/Date;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/Date;->getDate()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->I:Ljava/util/Date;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/util/Date;->getDate()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-ne p1, p2, :cond_4c

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_4c
    const/4 p1, 0x0

    .line 78
    return p1
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

.method static synthetic d(Lcom/voxdon/xplorer/widget/a;)Landroid/widget/AdapterView$OnItemClickListener;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->D:Landroid/widget/AdapterView$OnItemClickListener;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method private d0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 7

    .line 1
    instance-of v0, p1, Lax/c3/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_21

    .line 5
    .line 6
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v0, v2, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    :goto_e
    invoke-static {v0}, Lax/u3/b;->d(Z)V

    .line 16
    .line 17
    .line 18
    check-cast p1, Lax/c3/n;

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/c3/n;->z1()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    check-cast p2, Lax/c3/n;

    .line 25
    .line 26
    invoke-virtual {p2}, Lax/c3/n;->z1()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-ne p1, p2, :cond_20

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    return v3

    .line 34
    :cond_21
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_32

    .line 37
    .line 38
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-interface {p2}, Lax/c3/b;->q()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/voxdon/xplorer/widget/a;->c0(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_32
    const/4 v2, 0x2

    .line 52
    if-ne v0, v2, :cond_42

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_42
    invoke-static {}, Lax/u3/b;->f()V

    .line 68
    .line 69
    .line 70
    return v1
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

.method static synthetic e(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->j:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic f(Lcom/voxdon/xplorer/widget/a;)Lax/Q2/f;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->s:Lax/Q2/f;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic g(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->t:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic h(Lcom/voxdon/xplorer/widget/a;Lcom/voxdon/xplorer/file/n;ZI)Landroid/graphics/drawable/Drawable;
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/widget/a;->R(Lcom/voxdon/xplorer/file/n;ZI)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic i(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->u:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic j(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->x:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic k(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->o:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic l()Landroid/content/res/ColorStateList;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/widget/a;->O:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
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

.method static synthetic m()Landroid/content/res/ColorStateList;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/widget/a;->N:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
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

.method static synthetic n(Lcom/voxdon/xplorer/widget/a;)Lax/x3/z;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->m:Lax/x3/z;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic o(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->i:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic p(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->A:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic q(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->B:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic r(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->n:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic s(Lcom/voxdon/xplorer/widget/a;Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/widget/a;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic t(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic u(Lcom/voxdon/xplorer/widget/a;)Ljava/util/TreeMap;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic v(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->G:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic w(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->K:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic x(Lcom/voxdon/xplorer/widget/a;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/widget/a;->L:I

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic y(Lcom/voxdon/xplorer/widget/a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/widget/a;->p:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic z(Lcom/voxdon/xplorer/widget/a;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/widget/a;->d:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method


# virtual methods
.method public A0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/t3/j;->g(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->L:I

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

.method public B0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public L()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->h:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->i:Z

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/voxdon/xplorer/widget/a;->k:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/voxdon/xplorer/widget/a;->l:J

    .line 11
    .line 12
    return-void
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

.method public M(ILjava/lang/String;)I
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_4

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    :cond_4
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    move v2, p1

    .line 9
    :goto_8
    :try_start_8
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v2, v3, :cond_2f

    .line 14
    .line 15
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_2c

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2c

    .line 40
    .line 41
    monitor-exit v1

    .line 42
    return v2

    .line 43
    :catchall_2a
    move-exception p1

    .line 44
    goto :goto_59

    .line 45
    :cond_2c
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_8

    .line 48
    :cond_2f
    :goto_2f
    if-ge v0, p1, :cond_56

    .line 49
    .line 50
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-ge v0, v2, :cond_56

    .line 55
    .line 56
    invoke-interface {p0, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_53

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_53

    .line 81
    .line 82
    monitor-exit v1

    .line 83
    return v0

    .line 84
    :cond_53
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_2f

    .line 87
    :cond_56
    const/4 p1, -0x1

    .line 88
    monitor-exit v1

    .line 89
    return p1

    .line 90
    :goto_59
    monitor-exit v1
    :try_end_5a
    .catchall {:try_start_8 .. :try_end_5a} :catchall_2a

    .line 91
    throw p1
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

.method public N()Ljava/util/ArrayList;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_1d

    .line 15
    .line 16
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_9

    .line 28
    :catchall_1b
    move-exception v1

    .line 29
    goto :goto_1f

    .line 30
    :cond_1d
    monitor-exit v0

    .line 31
    return-object v1

    .line 32
    :goto_1f
    monitor-exit v0
    :try_end_20
    .catchall {:try_start_3 .. :try_end_20} :catchall_1b

    .line 33
    throw v1
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

.method public O(Ljava/lang/String;)I
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_4
    :try_start_4
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_23

    .line 10
    .line 11
    invoke-interface {p0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_20

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_20

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return v1

    .line 31
    :catchall_1e
    move-exception p1

    .line 32
    goto :goto_26

    .line 33
    :cond_20
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_23
    const/4 p1, -0x1

    .line 37
    monitor-exit v0

    .line 38
    return p1

    .line 39
    :goto_26
    monitor-exit v0
    :try_end_27
    .catchall {:try_start_4 .. :try_end_27} :catchall_1e

    .line 40
    throw p1
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

.method public P()Ljava/util/ArrayList;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/voxdon/xplorer/file/n;",
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
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    :try_start_9
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_25

    .line 15
    .line 16
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-static {v3, v4}, Lax/c3/A;->B(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_22

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_22

    .line 33
    :catchall_20
    move-exception v0

    .line 34
    goto :goto_27

    .line 35
    :cond_22
    :goto_22
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_9

    .line 38
    :cond_25
    monitor-exit v1

    .line 39
    return-object v0

    .line 40
    :goto_27
    monitor-exit v1
    :try_end_28
    .catchall {:try_start_9 .. :try_end_28} :catchall_20

    .line 41
    throw v0
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

.method public S()I
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/widget/a;->g:I

    .line 2
    .line 3
    return v0
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

.method public U(I)Lax/Z2/q;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/Z2/q;

    .line 12
    .line 13
    if-nez v0, :cond_47

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->floorKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Integer;

    .line 26
    .line 27
    if-nez v0, :cond_3e

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "position : "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, ":"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    return-object p1

    .line 63
    :cond_3e
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lax/Z2/q;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_47
    return-object v0
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
.end method

.method public V(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 8

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_7
    invoke-static {p1}, Lax/c3/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_c
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_53

    .line 18
    .line 19
    invoke-interface {p0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 24
    .line 25
    if-eqz v2, :cond_50

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_50

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Lax/c3/A;->R(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_50

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v5, "."

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_50

    .line 76
    .line 77
    monitor-exit v0

    .line 78
    return-object v2

    .line 79
    :catchall_4e
    move-exception p1

    .line 80
    goto :goto_56

    .line 81
    :cond_50
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_c

    .line 84
    :cond_53
    const/4 p1, 0x0

    .line 85
    monitor-exit v0

    .line 86
    return-object p1

    .line 87
    :goto_56
    monitor-exit v0
    :try_end_57
    .catchall {:try_start_7 .. :try_end_57} :catchall_4e

    .line 88
    throw p1
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

.method public W()Lax/r3/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->e:Lax/r3/d;

    .line 2
    .line 3
    return-object v0
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

.method public X(Ljava/lang/String;)Z
    .registers 8

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    :try_start_5
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-ge v2, v3, :cond_3b

    .line 11
    .line 12
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {p0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lcom/voxdon/xplorer/file/n;

    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Lax/Q2/f;->W()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v4, :cond_30

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_38

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return v5

    .line 47
    :catchall_2e
    move-exception p1

    .line 48
    goto :goto_3d

    .line 49
    :cond_30
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_38

    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return v5

    .line 57
    :cond_38
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_3b
    monitor-exit v0

    .line 61
    return v1

    .line 62
    :goto_3d
    monitor-exit v0
    :try_end_3e
    .catchall {:try_start_5 .. :try_end_3e} :catchall_2e

    .line 63
    throw p1
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
.end method

.method public addAll(Ljava/util/Collection;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_f

    .line 8
    iget-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 9
    .line 10
    if-eqz p1, :cond_e

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->K()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    :try_start_10
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_10 .. :try_end_11} :catchall_f

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public clear()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 5
    .line 6
    .line 7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_f

    .line 8
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 9
    .line 10
    if-eqz v0, :cond_e

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->K()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void

    .line 16
    :catchall_f
    move-exception v1

    .line 17
    :try_start_10
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_10 .. :try_end_11} :catchall_f

    .line 18
    throw v1
    .line 19
    .line 20
    .line 21
.end method

.method public e0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->c:Z

    .line 2
    .line 3
    return v0
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

.method public f0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    const v1, 0x7f06048c

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->u:I

    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 13
    .line 14
    const v1, 0x7f060351

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->A:I

    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v0}, Lax/u3/z;->n(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/voxdon/xplorer/widget/a;->B:I

    .line 30
    .line 31
    return-void
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

.method public g0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->C:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 6

    .line 1
    if-nez p2, :cond_1a

    .line 2
    .line 3
    iget-object p2, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->T()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance v0, Lcom/voxdon/xplorer/widget/a$c;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2, p3}, Lcom/voxdon/xplorer/widget/a$c;-><init>(Lcom/voxdon/xplorer/widget/a;Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_21

    .line 27
    :cond_1a
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    move-object v0, p3

    .line 32
    check-cast v0, Lcom/voxdon/xplorer/widget/a$c;

    .line 33
    .line 34
    :goto_21
    :try_start_21
    invoke-interface {p0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    check-cast p3, Lcom/voxdon/xplorer/file/n;

    .line 39
    .line 40
    invoke-virtual {v0, p3, p1}, Lcom/voxdon/xplorer/widget/a$c;->y(Lcom/voxdon/xplorer/file/n;I)V
    :try_end_2a
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_21 .. :try_end_2a} :catch_2b

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const-string v0, "!! INDEX OUT OF BOUND !!"

    .line 54
    .line 55
    invoke-virtual {p3, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-virtual {p3, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 64
    .line 65
    .line 66
    return-object p2
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

.method public h0(JJ)V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->h:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->i:Z

    .line 5
    .line 6
    iput-wide p1, p0, Lcom/voxdon/xplorer/widget/a;->k:J

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/voxdon/xplorer/widget/a;->l:J

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

.method public i0(Ljava/util/Set;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a;->M:Ljava/util/Set;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public j0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->z:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public k0(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a;->J:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public l0(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public m0(I)V
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->g:I

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public n0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->n:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public o0(I)V
    .registers 3

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->f:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/widget/a;->a0(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_14

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {p1, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->x:I

    .line 19
    .line 20
    goto :goto_1f

    .line 21
    :cond_14
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->x:I

    .line 31
    .line 32
    :goto_1f
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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

.method public p0(Landroid/widget/AdapterView$OnItemClickListener;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a;->D:Landroid/widget/AdapterView$OnItemClickListener;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public q0(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->c:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->c:Z

    .line 9
    .line 10
    if-eqz v0, :cond_10

    .line 11
    .line 12
    if-nez p1, :cond_10

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public r0(ZI)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 2
    .line 3
    if-eqz p1, :cond_a

    .line 4
    .line 5
    iput p2, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->K()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/voxdon/xplorer/widget/a;->r:I

    .line 13
    .line 14
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a;->F:Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/TreeMap;->clear()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public s0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->K:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public t0(Lax/c3/K;Ljava/lang/String;)V
    .registers 7

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->C0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_33

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lax/i3/a;->e(Landroid/content/Context;)Lax/i3/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lax/i3/a;->m()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_1d

    .line 26
    .line 27
    iput-boolean v2, p0, Lcom/voxdon/xplorer/widget/a;->y:Z

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a;->b:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p1}, Lax/c3/K;->b()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {v0, v3, p1, p2, v2}, Lax/t3/e;->i(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_30

    .line 45
    .line 46
    iput-boolean v2, p0, Lcom/voxdon/xplorer/widget/a;->y:Z

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/a;->y:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    iput-boolean v1, p0, Lcom/voxdon/xplorer/widget/a;->y:Z

    .line 53
    .line 54
    return-void
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

.method public u0(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->G:Z

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->G:Z

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

.method public v0()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->i:Z

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

.method w0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/widget/a;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/widget/a;->Z()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public x0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->j:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public y0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/widget/a;->o:Z

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public z0(Ljava/util/List;Landroid/view/View;III)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Landroid/view/View;",
            "III)Z"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/X2/Q;->M0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lt p3, v0, :cond_36

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Exception;

    .line 16
    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string p4, "index : "

    .line 23
    .line 24
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p3, ",count:"

    .line 31
    .line 32
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Landroid/widget/Adapter;->getCount()I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p2, "start darg"

    .line 50
    .line 51
    invoke-static {p2, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return v1

    .line 55
    :cond_36
    invoke-interface {p0, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Lcom/voxdon/xplorer/file/n;

    .line 60
    .line 61
    if-nez p3, :cond_3f

    .line 62
    .line 63
    return v1

    .line 64
    :cond_3f
    if-nez p1, :cond_42

    .line 65
    .line 66
    return v1

    .line 67
    :cond_42
    if-nez p2, :cond_45

    .line 68
    .line 69
    return v1

    .line 70
    :cond_45
    invoke-static {p1}, Lax/u3/u;->a(Ljava/util/List;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4c

    .line 75
    .line 76
    return v1

    .line 77
    :cond_4c
    invoke-static {p1, p3}, Lax/u3/u;->b(Ljava/util/List;Lcom/voxdon/xplorer/file/n;)Landroid/content/ClipData;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p3, Lcom/voxdon/xplorer/widget/a$a;

    .line 82
    .line 83
    invoke-direct {p3, p0, p2, p4, p5}, Lcom/voxdon/xplorer/widget/a$a;-><init>(Lcom/voxdon/xplorer/widget/a;Landroid/view/View;II)V

    .line 84
    .line 85
    .line 86
    new-instance p4, Lax/Z2/e;

    .line 87
    .line 88
    const/4 p5, 0x1

    .line 89
    invoke-direct {p4, p5}, Lax/Z2/e;-><init>(Z)V

    .line 90
    .line 91
    .line 92
    const/16 v0, 0x101

    .line 93
    .line 94
    invoke-static {p2, p1, p3, p4, v0}, Lax/x3/p;->a(Landroid/view/View;Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    .line 95
    .line 96
    .line 97
    return p5
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
