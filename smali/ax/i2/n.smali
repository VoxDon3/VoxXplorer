.class final Lax/i2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i2/n$b;,
        Lax/i2/n$e;,
        Lax/i2/n$c;,
        Lax/i2/n$f;,
        Lax/i2/n$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lax/i2/n$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/n$b<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final b:Lax/i2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/p<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final c:Lax/i2/I$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/I$c<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/i2/n$f<",
            "TK;>;>;"
        }
    .end annotation
.end field

.field private final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/util/SparseIntArray;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/i2/n$c;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/i2/n$c;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroid/util/SparseBooleanArray;

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation
.end field

.field private j:Landroid/graphics/Point;

.field private k:Lax/i2/n$e;

.field private l:Lax/i2/n$e;

.field private m:Z

.field private n:I

.field private final o:Landroidx/recyclerview/widget/RecyclerView$u;


# direct methods
.method constructor <init>(Lax/i2/n$b;Lax/i2/p;Lax/i2/I$c;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/n$b<",
            "TK;>;",
            "Lax/i2/p<",
            "TK;>;",
            "Lax/i2/I$c<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/i2/n;->d:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/i2/n;->e:Landroid/util/SparseArray;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lax/i2/n;->h:Landroid/util/SparseBooleanArray;

    .line 38
    .line 39
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lax/i2/n;->i:Ljava/util/Set;

    .line 45
    .line 46
    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lax/i2/n;->n:I

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    const/4 v1, 0x1

    .line 51
    if-eqz p1, :cond_36

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 v2, 0x0

    .line 56
    :goto_37
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 57
    .line 58
    .line 59
    if-eqz p2, :cond_3e

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    goto :goto_3f

    .line 63
    :cond_3e
    const/4 v2, 0x0

    .line 64
    :goto_3f
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 65
    .line 66
    .line 67
    if-eqz p3, :cond_45

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    :cond_45
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 74
    .line 75
    iput-object p2, p0, Lax/i2/n;->b:Lax/i2/p;

    .line 76
    .line 77
    iput-object p3, p0, Lax/i2/n;->c:Lax/i2/I$c;

    .line 78
    .line 79
    new-instance p2, Lax/i2/n$a;

    .line 80
    .line 81
    invoke-direct {p2, p0}, Lax/i2/n$a;-><init>(Lax/i2/n;)V

    .line 82
    .line 83
    .line 84
    iput-object p2, p0, Lax/i2/n;->o:Landroidx/recyclerview/widget/RecyclerView$u;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lax/i2/c$c;->a(Landroidx/recyclerview/widget/RecyclerView$u;)V

    .line 87
    .line 88
    .line 89
    return-void
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

.method private b(Lax/i2/n$e;Lax/i2/n$e;)Z
    .registers 5

    .line 1
    iget-object v0, p1, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 2
    .line 3
    iget-object v1, p2, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lax/i2/n;->h(Lax/i2/n$d;Lax/i2/n$d;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    iget-object p1, p1, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 12
    .line 13
    iget-object p2, p2, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lax/i2/n;->h(Lax/i2/n$d;Lax/i2/n$d;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    return p1
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

.method private c(Ljava/lang/Object;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/n;->c:Lax/i2/I$c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lax/i2/I$c;->c(Ljava/lang/Object;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
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

.method private d()Landroid/graphics/Rect;
    .registers 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 7
    .line 8
    iget-object v1, v1, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 9
    .line 10
    iget-object v2, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 11
    .line 12
    iget-object v2, v2, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 13
    .line 14
    invoke-direct {p0, v1, v2}, Lax/i2/n;->n(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {p0, v1, v2, v3}, Lax/i2/n;->i(Lax/i2/n$d;Ljava/util/List;Z)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 28
    .line 29
    iget-object v1, v1, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 30
    .line 31
    iget-object v2, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 32
    .line 33
    iget-object v2, v2, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 34
    .line 35
    invoke-direct {p0, v1, v2}, Lax/i2/n;->m(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {p0, v1, v2, v4}, Lax/i2/n;->i(Lax/i2/n$d;Ljava/util/List;Z)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 49
    .line 50
    iget-object v1, v1, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 51
    .line 52
    iget-object v2, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 53
    .line 54
    iget-object v2, v2, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 55
    .line 56
    invoke-direct {p0, v1, v2}, Lax/i2/n;->n(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v2, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 61
    .line 62
    invoke-direct {p0, v1, v2, v3}, Lax/i2/n;->i(Lax/i2/n$d;Ljava/util/List;Z)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 67
    .line 68
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 69
    .line 70
    iget-object v1, v1, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 71
    .line 72
    iget-object v2, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 73
    .line 74
    iget-object v2, v2, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 75
    .line 76
    invoke-direct {p0, v1, v2}, Lax/i2/n;->m(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 81
    .line 82
    invoke-direct {p0, v1, v2, v4}, Lax/i2/n;->i(Lax/i2/n$d;Ljava/util/List;Z)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 87
    .line 88
    return-object v0
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

.method private e()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 2
    .line 3
    iget-object v0, v0, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 4
    .line 5
    iget-object v1, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 6
    .line 7
    iget-object v1, v1, Lax/i2/n$e;->b:Lax/i2/n$d;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lax/i2/n;->n(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lax/i2/n$d;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    xor-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 20
    .line 21
    iget-object v1, v1, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 22
    .line 23
    iget-object v2, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 24
    .line 25
    iget-object v2, v2, Lax/i2/n$e;->a:Lax/i2/n$d;

    .line 26
    .line 27
    invoke-direct {p0, v1, v2}, Lax/i2/n;->n(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Lax/i2/n$d;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_25

    .line 36
    .line 37
    return v0

    .line 38
    :cond_25
    or-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    return v0
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

.method private f()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lax/i2/n;->b(Lax/i2/n$e;Lax/i2/n$e;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_12

    .line 10
    .line 11
    invoke-direct {p0}, Lax/i2/n;->d()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lax/i2/n;->z(Landroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object v0, p0, Lax/i2/n;->i:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p0, Lax/i2/n;->n:I

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private h(Lax/i2/n$d;Lax/i2/n$d;)Z
    .registers 7

    .line 1
    iget v0, p1, Lax/i2/n$d;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_b

    .line 6
    .line 7
    iget v3, p2, Lax/i2/n$d;->q:I

    .line 8
    .line 9
    if-ne v3, v2, :cond_b

    .line 10
    .line 11
    return v1

    .line 12
    :cond_b
    if-nez v0, :cond_12

    .line 13
    .line 14
    iget v3, p2, Lax/i2/n$d;->q:I

    .line 15
    .line 16
    if-nez v3, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    const/4 v3, 0x2

    .line 20
    if-ne v0, v3, :cond_2e

    .line 21
    .line 22
    iget v0, p2, Lax/i2/n$d;->q:I

    .line 23
    .line 24
    if-ne v0, v3, :cond_2e

    .line 25
    .line 26
    iget-object v0, p1, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 27
    .line 28
    iget-object v3, p2, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lax/i2/n$c;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2e

    .line 35
    .line 36
    iget-object p1, p1, Lax/i2/n$d;->d0:Lax/i2/n$c;

    .line 37
    .line 38
    iget-object p2, p2, Lax/i2/n$d;->d0:Lax/i2/n$c;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lax/i2/n$c;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2e

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2e
    return v2
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
.end method

.method private i(Lax/i2/n$d;Ljava/util/List;Z)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/n$d;",
            "Ljava/util/List<",
            "Lax/i2/n$c;",
            ">;Z)I"
        }
    .end annotation

    .line 1
    iget v0, p1, Lax/i2/n$d;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_30

    .line 5
    .line 6
    if-eq v0, v1, :cond_26

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    if-eq v0, p2, :cond_1a

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    if-ne v0, p2, :cond_12

    .line 13
    .line 14
    iget-object p1, p1, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 15
    .line 16
    iget p1, p1, Lax/i2/n$c;->q:I

    .line 17
    .line 18
    return p1

    .line 19
    :cond_12
    new-instance p1, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    const-string p2, "Invalid coordinate value."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1a
    if-eqz p3, :cond_21

    .line 28
    .line 29
    iget-object p1, p1, Lax/i2/n$d;->d0:Lax/i2/n$c;

    .line 30
    .line 31
    iget p1, p1, Lax/i2/n$c;->q:I

    .line 32
    .line 33
    return p1

    .line 34
    :cond_21
    iget-object p1, p1, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 35
    .line 36
    iget p1, p1, Lax/i2/n$c;->c0:I

    .line 37
    .line 38
    return p1

    .line 39
    :cond_26
    const/4 p1, 0x0

    .line 40
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lax/i2/n$c;

    .line 45
    .line 46
    iget p1, p1, Lax/i2/n$c;->q:I

    .line 47
    .line 48
    return p1

    .line 49
    :cond_30
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int/2addr p1, v1

    .line 54
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lax/i2/n$c;

    .line 59
    .line 60
    iget p1, p1, Lax/i2/n$c;->c0:I

    .line 61
    .line 62
    return p1
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

.method private k()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method private l(IIIIII)Z
    .registers 10

    .line 1
    invoke-direct {p0}, Lax/i2/n;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_28

    .line 8
    .line 9
    if-eq v0, v2, :cond_22

    .line 10
    .line 11
    const/4 p2, 0x2

    .line 12
    if-eq v0, p2, :cond_1c

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    if-ne v0, p1, :cond_14

    .line 16
    .line 17
    if-ne p4, p6, :cond_13

    .line 18
    .line 19
    return v2

    .line 20
    :cond_13
    return v1

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    const-string p2, "Invalid corner type."

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1c
    if-ne p1, p3, :cond_21

    .line 30
    .line 31
    if-ne p4, p5, :cond_21

    .line 32
    .line 33
    return v2

    .line 34
    :cond_21
    return v1

    .line 35
    :cond_22
    if-ne p1, p2, :cond_27

    .line 36
    .line 37
    if-ne p4, p6, :cond_27

    .line 38
    .line 39
    return v2

    .line 40
    :cond_27
    return v1

    .line 41
    :cond_28
    if-ne p1, p2, :cond_2d

    .line 42
    .line 43
    if-ne p4, p5, :cond_2d

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2d
    return v1
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
.end method

.method private m(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;
    .registers 4

    .line 1
    invoke-virtual {p1, p2}, Lax/i2/n$d;->d(Lax/i2/n$d;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_7

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    return-object p2
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

.method private n(Lax/i2/n$d;Lax/i2/n$d;)Lax/i2/n$d;
    .registers 4

    .line 1
    invoke-virtual {p1, p2}, Lax/i2/n$d;->d(Lax/i2/n$d;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_7

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    return-object p2
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

.method private o()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/n;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_18

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/i2/n$f;

    .line 18
    .line 19
    iget-object v2, p0, Lax/i2/n;->i:Ljava/util/Set;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lax/i2/n$f;->a(Ljava/util/Set;)V

    .line 22
    .line 23
    .line 24
    goto :goto_6

    .line 25
    :cond_18
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

.method private r(Landroid/graphics/Rect;I)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/i2/n$b;->h()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eq v0, v1, :cond_1c

    .line 14
    .line 15
    iget-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 16
    .line 17
    new-instance v1, Lax/i2/n$c;

    .line 18
    .line 19
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Lax/i2/n$c;-><init>(II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, v1}, Lax/i2/n;->s(Ljava/util/List;Lax/i2/n$c;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget-object v0, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 30
    .line 31
    new-instance v1, Lax/i2/n$c;

    .line 32
    .line 33
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Lax/i2/n$c;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0, v1}, Lax/i2/n;->s(Ljava/util/List;Lax/i2/n$c;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lax/i2/n;->e:Landroid/util/SparseArray;

    .line 44
    .line 45
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/util/SparseIntArray;

    .line 52
    .line 53
    if-nez v0, :cond_42

    .line 54
    .line 55
    new-instance v0, Landroid/util/SparseIntArray;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lax/i2/n;->e:Landroid/util/SparseArray;

    .line 61
    .line 62
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 63
    .line 64
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_42
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 70
    .line 71
    .line 72
    return-void
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

.method private s(Ljava/util/List;Lax/i2/n$c;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/i2/n$c;",
            ">;",
            "Lax/i2/n$c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_a

    .line 6
    .line 7
    not-int v0, v0

    .line 8
    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

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

.method private t()V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 3
    .line 4
    invoke-virtual {v1}, Lax/i2/n$b;->i()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_39

    .line 9
    .line 10
    iget-object v1, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lax/i2/n$b;->g(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lax/i2/n$b;->j(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_36

    .line 23
    .line 24
    iget-object v2, p0, Lax/i2/n;->c:Lax/i2/I$c;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-virtual {v2, v1, v3}, Lax/i2/I$c;->b(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_36

    .line 32
    .line 33
    iget-object v2, p0, Lax/i2/n;->h:Landroid/util/SparseBooleanArray;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_36

    .line 40
    .line 41
    iget-object v2, p0, Lax/i2/n;->h:Landroid/util/SparseBooleanArray;

    .line 42
    .line 43
    invoke-virtual {v2, v1, v3}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Lax/i2/n$b;->f(I)Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-direct {p0, v2, v1}, Lax/i2/n;->r(Landroid/graphics/Rect;I)V

    .line 53
    .line 54
    .line 55
    :cond_36
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_39
    return-void
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

.method private x()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/i2/n;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lax/b0/g;->i(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 11
    .line 12
    iget-object v1, p0, Lax/i2/n;->j:Landroid/graphics/Point;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lax/i2/n;->g(Landroid/graphics/Point;)Lax/i2/n$e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lax/i2/n$e;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    invoke-direct {p0}, Lax/i2/n;->f()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lax/i2/n;->o()V

    .line 31
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

.method private y(IIII)V
    .registers 14

    .line 1
    iget-object v0, p0, Lax/i2/n;->i:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    move v2, p1

    .line 7
    :goto_6
    if-gt v2, p2, :cond_63

    .line 8
    .line 9
    iget-object v0, p0, Lax/i2/n;->e:Landroid/util/SparseArray;

    .line 10
    .line 11
    iget-object v1, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/i2/n$c;

    .line 18
    .line 19
    iget v1, v1, Lax/i2/n$c;->q:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/util/SparseIntArray;

    .line 26
    .line 27
    move v5, p3

    .line 28
    :goto_1b
    if-gt v5, p4, :cond_5b

    .line 29
    .line 30
    iget-object v1, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lax/i2/n$c;

    .line 37
    .line 38
    iget v1, v1, Lax/i2/n$c;->q:I

    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eq v8, v3, :cond_4f

    .line 46
    .line 47
    iget-object v1, p0, Lax/i2/n;->b:Lax/i2/p;

    .line 48
    .line 49
    invoke-virtual {v1, v8}, Lax/i2/p;->a(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_41

    .line 54
    .line 55
    invoke-direct {p0, v1}, Lax/i2/n;->c(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_41

    .line 60
    .line 61
    iget-object v3, p0, Lax/i2/n;->i:Ljava/util/Set;

    .line 62
    .line 63
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_41
    move-object v1, p0

    .line 67
    move v3, p1

    .line 68
    move v4, p2

    .line 69
    move v6, p3

    .line 70
    move v7, p4

    .line 71
    invoke-direct/range {v1 .. v7}, Lax/i2/n;->l(IIIIII)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_54

    .line 76
    .line 77
    iput v8, v1, Lax/i2/n;->n:I

    .line 78
    .line 79
    goto :goto_54

    .line 80
    :cond_4f
    move-object v1, p0

    .line 81
    move v3, p1

    .line 82
    move v4, p2

    .line 83
    move v6, p3

    .line 84
    move v7, p4

    .line 85
    :cond_54
    :goto_54
    add-int/lit8 v5, v5, 0x1

    .line 86
    .line 87
    move p1, v3

    .line 88
    move p2, v4

    .line 89
    move p3, v6

    .line 90
    move p4, v7

    .line 91
    goto :goto_1b

    .line 92
    :cond_5b
    move-object v1, p0

    .line 93
    move v3, p1

    .line 94
    move v4, p2

    .line 95
    move v6, p3

    .line 96
    move v7, p4

    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_63
    move-object v1, p0

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
.end method

.method private z(Landroid/graphics/Rect;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lax/i2/n$c;

    .line 4
    .line 5
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 6
    .line 7
    invoke-direct {v1, v2, v2}, Lax/i2/n$c;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ltz v0, :cond_11

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    const/4 v1, 0x0

    .line 19
    :goto_12
    const-string v2, "Rect doesn\'t intesect any known column."

    .line 20
    .line 21
    invoke-static {v1, v2}, Lax/b0/g;->b(ZLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move v1, v0

    .line 25
    move v2, v1

    .line 26
    :goto_19
    iget-object v3, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ge v1, v3, :cond_35

    .line 33
    .line 34
    iget-object v3, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lax/i2/n$c;

    .line 41
    .line 42
    iget v3, v3, Lax/i2/n$c;->q:I

    .line 43
    .line 44
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 45
    .line 46
    if-gt v3, v4, :cond_35

    .line 47
    .line 48
    add-int/lit8 v2, v1, 0x1

    .line 49
    .line 50
    move v7, v2

    .line 51
    move v2, v1

    .line 52
    move v1, v7

    .line 53
    goto :goto_19

    .line 54
    :cond_35
    iget-object v1, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 55
    .line 56
    new-instance v3, Lax/i2/n$c;

    .line 57
    .line 58
    iget v4, p1, Landroid/graphics/Rect;->top:I

    .line 59
    .line 60
    invoke-direct {v3, v4, v4}, Lax/i2/n$c;-><init>(II)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-gez v1, :cond_48

    .line 68
    .line 69
    const/4 p1, -0x1

    .line 70
    iput p1, p0, Lax/i2/n;->n:I

    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    move v3, v1

    .line 74
    move v4, v3

    .line 75
    :goto_4a
    iget-object v5, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-ge v3, v5, :cond_66

    .line 82
    .line 83
    iget-object v5, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Lax/i2/n$c;

    .line 90
    .line 91
    iget v5, v5, Lax/i2/n$c;->q:I

    .line 92
    .line 93
    iget v6, p1, Landroid/graphics/Rect;->bottom:I

    .line 94
    .line 95
    if-gt v5, v6, :cond_66

    .line 96
    .line 97
    add-int/lit8 v4, v3, 0x1

    .line 98
    .line 99
    move v7, v4

    .line 100
    move v4, v3

    .line 101
    move v3, v7

    .line 102
    goto :goto_4a

    .line 103
    :cond_66
    invoke-direct {p0, v0, v2, v1, v4}, Lax/i2/n;->y(IIII)V

    .line 104
    .line 105
    .line 106
    return-void
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


# virtual methods
.method a(Lax/i2/n$f;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/n$f<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/n;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
.end method

.method g(Landroid/graphics/Point;)Lax/i2/n$e;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    const-string v1, "Column bounds not established."

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/b0/g;->j(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    xor-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    const-string v1, "Row bounds not established."

    .line 23
    .line 24
    invoke-static {v0, v1}, Lax/b0/g;->j(ZLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lax/i2/n$e;

    .line 28
    .line 29
    new-instance v1, Lax/i2/n$d;

    .line 30
    .line 31
    iget-object v2, p0, Lax/i2/n;->f:Ljava/util/List;

    .line 32
    .line 33
    iget v3, p1, Landroid/graphics/Point;->x:I

    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Lax/i2/n$d;-><init>(Ljava/util/List;I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lax/i2/n$d;

    .line 39
    .line 40
    iget-object v3, p0, Lax/i2/n;->g:Ljava/util/List;

    .line 41
    .line 42
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 43
    .line 44
    invoke-direct {v2, v3, p1}, Lax/i2/n$d;-><init>(Ljava/util/List;I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lax/i2/n$e;-><init>(Lax/i2/n$d;Lax/i2/n$d;)V

    .line 48
    .line 49
    .line 50
    return-object v0
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

.method j()I
    .registers 2

    .line 1
    iget v0, p0, Lax/i2/n;->n:I

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

.method p()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/n;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 7
    .line 8
    iget-object v1, p0, Lax/i2/n;->o:Landroidx/recyclerview/widget/RecyclerView$u;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/i2/n$b;->k(Landroidx/recyclerview/widget/RecyclerView$u;)V

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
.end method

.method q(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 5

    .line 1
    iget-boolean p1, p0, Lax/i2/n;->m:Z

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    goto :goto_1d

    .line 6
    :cond_5
    iget-object p1, p0, Lax/i2/n;->j:Landroid/graphics/Point;

    .line 7
    .line 8
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 9
    .line 10
    add-int/2addr v0, p2

    .line 11
    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 12
    .line 13
    iget p2, p1, Landroid/graphics/Point;->y:I

    .line 14
    .line 15
    add-int/2addr p2, p3

    .line 16
    iput p2, p1, Landroid/graphics/Point;->y:I

    .line 17
    .line 18
    invoke-direct {p0}, Lax/i2/n;->t()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lax/i2/n;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1d

    .line 26
    .line 27
    invoke-direct {p0}, Lax/i2/n;->x()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    :goto_1d
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

.method u(Landroid/graphics/Point;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/i2/n$b;->e(Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lax/i2/n;->j:Landroid/graphics/Point;

    .line 8
    .line 9
    invoke-direct {p0}, Lax/i2/n;->k()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_11

    .line 14
    .line 15
    invoke-direct {p0}, Lax/i2/n;->x()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method v(Landroid/graphics/Point;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/i2/n;->t()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/i2/n;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lax/i2/n;->m:Z

    .line 13
    .line 14
    iget-object v0, p0, Lax/i2/n;->a:Lax/i2/n$b;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/i2/n$b;->e(Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lax/i2/n;->j:Landroid/graphics/Point;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lax/i2/n;->g(Landroid/graphics/Point;)Lax/i2/n$e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lax/i2/n;->k:Lax/i2/n$e;

    .line 27
    .line 28
    iget-object p1, p0, Lax/i2/n;->j:Landroid/graphics/Point;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lax/i2/n;->g(Landroid/graphics/Point;)Lax/i2/n$e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lax/i2/n;->l:Lax/i2/n$e;

    .line 35
    .line 36
    invoke-direct {p0}, Lax/i2/n;->f()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lax/i2/n;->o()V

    .line 40
    .line 41
    .line 42
    return-void
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

.method w()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/i2/n;->m:Z

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
