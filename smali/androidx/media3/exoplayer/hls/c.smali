.class Landroidx/media3/exoplayer/hls/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/c$d;,
        Landroidx/media3/exoplayer/hls/c$b;,
        Landroidx/media3/exoplayer/hls/c$e;,
        Landroidx/media3/exoplayer/hls/c$a;,
        Landroidx/media3/exoplayer/hls/c$c;
    }
.end annotation


# instance fields
.field private final a:Lax/c1/e;

.field private final b:Lax/U0/g;

.field private final c:Lax/U0/g;

.field private final d:Lax/c1/j;

.field private final e:[Landroid/net/Uri;

.field private final f:[Lax/P0/v;

.field private final g:Lax/d1/m;

.field private final h:Lax/P0/P;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Landroidx/media3/exoplayer/hls/b;

.field private final k:Lax/Z0/I1;

.field private final l:J

.field private m:Z

.field private n:[B

.field private o:Ljava/io/IOException;

.field private p:Landroid/net/Uri;

.field private q:Landroid/net/Uri;

.field private r:Z

.field private s:Lax/l1/D;

.field private t:J

.field private u:J


# direct methods
.method public constructor <init>(Lax/c1/e;Lax/d1/m;[Landroid/net/Uri;[Lax/P0/v;Lax/c1/d;Lax/U0/z;Lax/c1/j;JLjava/util/List;Lax/Z0/I1;Lax/m1/f;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c1/e;",
            "Lax/d1/m;",
            "[",
            "Landroid/net/Uri;",
            "[",
            "Lax/P0/v;",
            "Lax/c1/d;",
            "Lax/U0/z;",
            "Lax/c1/j;",
            "J",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;",
            "Lax/Z0/I1;",
            "Lax/m1/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->a:Lax/c1/e;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/c;->f:[Lax/P0/v;

    .line 11
    .line 12
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/c;->d:Lax/c1/j;

    .line 13
    .line 14
    iput-wide p8, p0, Landroidx/media3/exoplayer/hls/c;->l:J

    .line 15
    .line 16
    iput-object p10, p0, Landroidx/media3/exoplayer/hls/c;->i:Ljava/util/List;

    .line 17
    .line 18
    iput-object p11, p0, Landroidx/media3/exoplayer/hls/c;->k:Lax/Z0/I1;

    .line 19
    .line 20
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/c;->u:J

    .line 26
    .line 27
    new-instance p7, Landroidx/media3/exoplayer/hls/b;

    .line 28
    .line 29
    const/4 p8, 0x4

    .line 30
    invoke-direct {p7, p8}, Landroidx/media3/exoplayer/hls/b;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 34
    .line 35
    sget-object p7, Lax/S0/d0;->f:[B

    .line 36
    .line 37
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/c;->n:[B

    .line 38
    .line 39
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/c;->t:J

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    invoke-interface {p5, p1}, Lax/c1/d;->a(I)Lax/U0/g;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->b:Lax/U0/g;

    .line 47
    .line 48
    if-eqz p6, :cond_34

    .line 49
    .line 50
    invoke-interface {p1, p6}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 51
    .line 52
    .line 53
    :cond_34
    const/4 p1, 0x3

    .line 54
    invoke-interface {p5, p1}, Lax/c1/d;->a(I)Lax/U0/g;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->c:Lax/U0/g;

    .line 59
    .line 60
    new-instance p1, Lax/P0/P;

    .line 61
    .line 62
    invoke-direct {p1, p4}, Lax/P0/P;-><init>([Lax/P0/v;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    const/4 p2, 0x0

    .line 73
    :goto_48
    array-length p5, p3

    .line 74
    if-ge p2, p5, :cond_5d

    .line 75
    .line 76
    aget-object p5, p4, p2

    .line 77
    .line 78
    iget p5, p5, Lax/P0/v;->f:I

    .line 79
    .line 80
    and-int/lit16 p5, p5, 0x4000

    .line 81
    .line 82
    if-nez p5, :cond_5a

    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p5

    .line 88
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_5a
    add-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    goto :goto_48

    .line 94
    :cond_5d
    new-instance p2, Landroidx/media3/exoplayer/hls/c$d;

    .line 95
    .line 96
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 97
    .line 98
    invoke-static {p1}, Lax/u7/f;->o(Ljava/util/Collection;)[I

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {p2, p3, p1}, Landroidx/media3/exoplayer/hls/c$d;-><init>(Lax/P0/P;[I)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 106
    .line 107
    return-void
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
.end method

.method private static A(ZLax/d1/f;JILandroidx/media3/exoplayer/hls/e;JJ)Z
    .registers 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    if-nez p5, :cond_7

    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    iget-wide v1, p1, Lax/d1/f;->k:J

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    cmp-long p5, p2, v1

    .line 12
    .line 13
    if-gez p5, :cond_f

    .line 14
    .line 15
    return p0

    .line 16
    :cond_f
    invoke-static {p1, p2, p3, p4}, Landroidx/media3/exoplayer/hls/c;->h(Lax/d1/f;JI)Landroidx/media3/exoplayer/hls/c$e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_16

    .line 21
    .line 22
    return v0

    .line 23
    :cond_16
    iget-object p1, p1, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 24
    .line 25
    iget-wide p1, p1, Lax/d1/f$g;->f0:J

    .line 26
    .line 27
    add-long/2addr p6, p1

    .line 28
    cmp-long p1, p6, p8

    .line 29
    .line 30
    if-gez p1, :cond_20

    .line 31
    .line 32
    return p0

    .line 33
    :cond_20
    return v0
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
.end method

.method private B(Lax/d1/f;)V
    .registers 6

    .line 1
    iget-boolean v0, p1, Lax/d1/f;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    goto :goto_15

    .line 11
    :cond_a
    invoke-virtual {p1}, Lax/d1/f;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 16
    .line 17
    invoke-interface {p1}, Lax/d1/m;->e()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    :goto_15
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/c;->t:J

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

.method private b()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/l1/D;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 10
    .line 11
    aget-object v0, v2, v0

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lax/d1/m;->b(Landroid/net/Uri;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static e(Lax/d1/f;Lax/d1/f$g;)Landroid/net/Uri;
    .registers 2

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-object p1, p1, Lax/d1/f$g;->h0:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p1, :cond_7

    .line 6
    .line 7
    goto :goto_e

    .line 8
    :cond_7
    iget-object p0, p0, Lax/d1/j;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_e
    :goto_e
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method private g(Landroidx/media3/exoplayer/hls/e;ZLax/d1/f;JJ)Landroid/util/Pair;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/e;",
            "Z",
            "Lax/d1/f;",
            "JJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eqz p1, :cond_3f

    .line 4
    .line 5
    if-eqz p2, :cond_7

    .line 6
    .line 7
    goto :goto_3f

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/e;->q()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_2d

    .line 13
    .line 14
    new-instance p2, Landroid/util/Pair;

    .line 15
    .line 16
    iget p3, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 17
    .line 18
    if-ne p3, v1, :cond_18

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/j1/d;->g()J

    .line 21
    .line 22
    .line 23
    move-result-wide p3

    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    iget-wide p3, p1, Lax/j1/d;->j:J

    .line 26
    .line 27
    :goto_1a
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget p1, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 32
    .line 33
    if-ne p1, v1, :cond_23

    .line 34
    .line 35
    goto :goto_25

    .line 36
    :cond_23
    add-int/lit8 v1, p1, 0x1

    .line 37
    .line 38
    :goto_25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :cond_2d
    new-instance p2, Landroid/util/Pair;

    .line 47
    .line 48
    iget-wide p3, p1, Lax/j1/d;->j:J

    .line 49
    .line 50
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    iget p1, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :cond_3f
    :goto_3f
    iget-wide v2, p3, Lax/d1/f;->u:J

    .line 65
    .line 66
    add-long/2addr v2, p4

    .line 67
    if-eqz p1, :cond_4b

    .line 68
    .line 69
    iget-boolean p2, p0, Landroidx/media3/exoplayer/hls/c;->r:Z

    .line 70
    .line 71
    if-eqz p2, :cond_49

    .line 72
    .line 73
    goto :goto_4b

    .line 74
    :cond_49
    iget-wide p6, p1, Lax/j1/b;->g:J

    .line 75
    .line 76
    :cond_4b
    :goto_4b
    iget-boolean p2, p3, Lax/d1/f;->o:Z

    .line 77
    .line 78
    if-nez p2, :cond_6b

    .line 79
    .line 80
    cmp-long p2, p6, v2

    .line 81
    .line 82
    if-ltz p2, :cond_6b

    .line 83
    .line 84
    new-instance p1, Landroid/util/Pair;

    .line 85
    .line 86
    iget-wide p4, p3, Lax/d1/f;->k:J

    .line 87
    .line 88
    iget-object p2, p3, Lax/d1/f;->r:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    int-to-long p2, p2

    .line 95
    add-long/2addr p4, p2

    .line 96
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_6b
    sub-long/2addr p6, p4

    .line 109
    iget-object p2, p3, Lax/d1/f;->r:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    iget-object p5, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 116
    .line 117
    invoke-interface {p5}, Lax/d1/m;->g()Z

    .line 118
    .line 119
    .line 120
    move-result p5

    .line 121
    const/4 v2, 0x0

    .line 122
    if-eqz p5, :cond_80

    .line 123
    .line 124
    if-nez p1, :cond_7e

    .line 125
    .line 126
    goto :goto_80

    .line 127
    :cond_7e
    const/4 p1, 0x0

    .line 128
    goto :goto_81

    .line 129
    :cond_80
    :goto_80
    const/4 p1, 0x1

    .line 130
    :goto_81
    invoke-static {p2, p4, v0, p1}, Lax/S0/d0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    int-to-long p4, p1

    .line 135
    iget-wide v3, p3, Lax/d1/f;->k:J

    .line 136
    .line 137
    add-long/2addr p4, v3

    .line 138
    if-ltz p1, :cond_c9

    .line 139
    .line 140
    iget-object p2, p3, Lax/d1/f;->r:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Lax/d1/f$f;

    .line 147
    .line 148
    iget-wide v3, p1, Lax/d1/f$g;->f0:J

    .line 149
    .line 150
    iget-wide v5, p1, Lax/d1/f$g;->d0:J

    .line 151
    .line 152
    add-long/2addr v3, v5

    .line 153
    cmp-long p2, p6, v3

    .line 154
    .line 155
    if-gez p2, :cond_9f

    .line 156
    .line 157
    iget-object p1, p1, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 158
    .line 159
    goto :goto_a1

    .line 160
    :cond_9f
    iget-object p1, p3, Lax/d1/f;->s:Ljava/util/List;

    .line 161
    .line 162
    :goto_a1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-ge v2, p2, :cond_c9

    .line 167
    .line 168
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Lax/d1/f$d;

    .line 173
    .line 174
    iget-wide v3, p2, Lax/d1/f$g;->f0:J

    .line 175
    .line 176
    iget-wide v5, p2, Lax/d1/f$g;->d0:J

    .line 177
    .line 178
    add-long/2addr v3, v5

    .line 179
    cmp-long v0, p6, v3

    .line 180
    .line 181
    if-gez v0, :cond_c6

    .line 182
    .line 183
    iget-boolean p2, p2, Lax/d1/f$d;->m0:Z

    .line 184
    .line 185
    if-eqz p2, :cond_c9

    .line 186
    .line 187
    iget-object p2, p3, Lax/d1/f;->s:Ljava/util/List;

    .line 188
    .line 189
    if-ne p1, p2, :cond_c1

    .line 190
    .line 191
    const-wide/16 p1, 0x1

    .line 192
    .line 193
    goto :goto_c3

    .line 194
    :cond_c1
    const-wide/16 p1, 0x0

    .line 195
    .line 196
    :goto_c3
    add-long/2addr p4, p1

    .line 197
    move v1, v2

    .line 198
    goto :goto_c9

    .line 199
    :cond_c6
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    goto :goto_a1

    .line 202
    :cond_c9
    :goto_c9
    new-instance p1, Landroid/util/Pair;

    .line 203
    .line 204
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return-object p1
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

.method private static h(Lax/d1/f;JI)Landroidx/media3/exoplayer/hls/c$e;
    .registers 11

    .line 1
    iget-wide v0, p0, Lax/d1/f;->k:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v1, v0

    .line 6
    iget-object v0, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, -0x1

    .line 15
    if-ne v1, v0, :cond_2b

    .line 16
    .line 17
    if-eq p3, v4, :cond_13

    .line 18
    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 p3, 0x0

    .line 21
    :goto_14
    iget-object v0, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ge p3, v0, :cond_2a

    .line 28
    .line 29
    new-instance v0, Landroidx/media3/exoplayer/hls/c$e;

    .line 30
    .line 31
    iget-object p0, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lax/d1/f$g;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2a
    return-object v2

    .line 44
    :cond_2b
    iget-object v0, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lax/d1/f$f;

    .line 51
    .line 52
    if-ne p3, v4, :cond_3b

    .line 53
    .line 54
    new-instance p0, Landroidx/media3/exoplayer/hls/c$e;

    .line 55
    .line 56
    invoke-direct {p0, v0, p1, p2, v4}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_3b
    iget-object v5, v0, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ge p3, v5, :cond_51

    .line 67
    .line 68
    new-instance p0, Landroidx/media3/exoplayer/hls/c$e;

    .line 69
    .line 70
    iget-object v0, v0, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lax/d1/f$g;

    .line 77
    .line 78
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_51
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    iget-object p3, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    const-wide/16 v5, 0x1

    .line 91
    .line 92
    if-ge v1, p3, :cond_6c

    .line 93
    .line 94
    new-instance p3, Landroidx/media3/exoplayer/hls/c$e;

    .line 95
    .line 96
    iget-object p0, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Lax/d1/f$g;

    .line 103
    .line 104
    add-long/2addr p1, v5

    .line 105
    invoke-direct {p3, p0, p1, p2, v4}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 106
    .line 107
    .line 108
    return-object p3

    .line 109
    :cond_6c
    iget-object p3, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-nez p3, :cond_83

    .line 116
    .line 117
    new-instance p3, Landroidx/media3/exoplayer/hls/c$e;

    .line 118
    .line 119
    iget-object p0, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Lax/d1/f$g;

    .line 126
    .line 127
    add-long/2addr p1, v5

    .line 128
    invoke-direct {p3, p0, p1, p2, v3}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 129
    .line 130
    .line 131
    return-object p3

    .line 132
    :cond_83
    return-object v2
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

.method static k(Lax/d1/f;JI)Ljava/util/List;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/d1/f;",
            "JI)",
            "Ljava/util/List<",
            "Lax/d1/f$g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lax/d1/f;->k:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    long-to-int p2, p1

    .line 5
    if-ltz p2, :cond_7c

    .line 6
    .line 7
    iget-object p1, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-ge p1, p2, :cond_f

    .line 14
    .line 15
    goto :goto_7c

    .line 16
    :cond_f
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, -0x1

    .line 29
    if-ge p2, v0, :cond_53

    .line 30
    .line 31
    if-eq p3, v2, :cond_45

    .line 32
    .line 33
    iget-object v0, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lax/d1/f$f;

    .line 40
    .line 41
    if-nez p3, :cond_2e

    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_43

    .line 47
    :cond_2e
    iget-object v3, v0, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge p3, v3, :cond_43

    .line 54
    .line 55
    iget-object v0, v0, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-interface {v0, p3, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    :cond_43
    :goto_43
    add-int/lit8 p2, p2, 0x1

    .line 69
    .line 70
    :cond_45
    iget-object p3, p0, Lax/d1/f;->r:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-interface {p3, p2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    const/4 p3, 0x0

    .line 84
    :cond_53
    iget-wide v3, p0, Lax/d1/f;->n:J

    .line 85
    .line 86
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    cmp-long p2, v3, v5

    .line 92
    .line 93
    if-eqz p2, :cond_77

    .line 94
    .line 95
    if-ne p3, v2, :cond_61

    .line 96
    .line 97
    goto :goto_62

    .line 98
    :cond_61
    move v1, p3

    .line 99
    :goto_62
    iget-object p2, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-ge v1, p2, :cond_77

    .line 106
    .line 107
    iget-object p0, p0, Lax/d1/f;->s:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-interface {p0, v1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    :cond_77
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_7c
    :goto_7c
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0
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

.method private static o(Landroidx/media3/exoplayer/hls/c$e;Lax/d1/f;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 2
    .line 3
    instance-of v1, v0, Lax/d1/f$d;

    .line 4
    .line 5
    if-eqz v1, :cond_19

    .line 6
    .line 7
    check-cast v0, Lax/d1/f$d;

    .line 8
    .line 9
    iget-boolean v0, v0, Lax/d1/f$d;->m0:Z

    .line 10
    .line 11
    if-nez v0, :cond_17

    .line 12
    .line 13
    iget p0, p0, Landroidx/media3/exoplayer/hls/c$e;->c:I

    .line 14
    .line 15
    if-nez p0, :cond_15

    .line 16
    .line 17
    iget-boolean p0, p1, Lax/d1/j;->c:Z

    .line 18
    .line 19
    if-eqz p0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_17
    :goto_17
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_19
    iget-boolean p0, p1, Lax/d1/j;->c:Z

    .line 27
    .line 28
    return p0
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

.method private p(Landroid/net/Uri;IZLax/m1/g$a;)Lax/j1/b;
    .registers 12

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object p3

    .line 5
    :cond_4
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 6
    .line 7
    invoke-virtual {p4, p1}, Landroidx/media3/exoplayer/hls/b;->c(Landroid/net/Uri;)[B

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    if-eqz p4, :cond_12

    .line 12
    .line 13
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 14
    .line 15
    invoke-virtual {p2, p1, p4}, Landroidx/media3/exoplayer/hls/b;->b(Landroid/net/Uri;[B)[B

    .line 16
    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_12
    new-instance p3, Lax/U0/k$b;

    .line 20
    .line 21
    invoke-direct {p3}, Lax/U0/k$b;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3, p1}, Lax/U0/k$b;->i(Landroid/net/Uri;)Lax/U0/k$b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-virtual {p1, p3}, Lax/U0/k$b;->b(I)Lax/U0/k$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lax/U0/k$b;->a()Lax/U0/k;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v0, Landroidx/media3/exoplayer/hls/c$a;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->c:Lax/U0/g;

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/c;->f:[Lax/P0/v;

    .line 42
    .line 43
    aget-object v3, p1, p2

    .line 44
    .line 45
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 46
    .line 47
    invoke-interface {p1}, Lax/l1/D;->n()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 52
    .line 53
    invoke-interface {p1}, Lax/l1/D;->q()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/c;->n:[B

    .line 58
    .line 59
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/hls/c$a;-><init>(Lax/U0/g;Lax/U0/k;Lax/P0/v;ILjava/lang/Object;[B)V

    .line 60
    .line 61
    .line 62
    return-object v0
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

.method private w(J)J
    .registers 8

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/c;->t:J

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
    if-eqz v4, :cond_d

    .line 11
    .line 12
    sub-long/2addr v0, p1

    .line 13
    return-wide v0

    .line 14
    :cond_d
    return-wide v2
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
.method public a(Landroidx/media3/exoplayer/hls/e;J)[Lax/j1/e;
    .registers 17

    .line 1
    if-nez p1, :cond_5

    .line 2
    .line 3
    const/4 v2, -0x1

    .line 4
    const/4 v8, -0x1

    .line 5
    goto :goto_e

    .line 6
    :cond_5
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 7
    .line 8
    iget-object v3, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move v8, v2

    .line 15
    :goto_e
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 16
    .line 17
    invoke-interface {v2}, Lax/l1/H;->length()I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    new-array v10, v9, [Lax/j1/e;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    :goto_18
    if-ge v12, v9, :cond_70

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 28
    .line 29
    invoke-interface {v2, v12}, Lax/l1/H;->j(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 34
    .line 35
    aget-object v3, v3, v2

    .line 36
    .line 37
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 38
    .line 39
    invoke-interface {v4, v3}, Lax/d1/m;->a(Landroid/net/Uri;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_31

    .line 44
    .line 45
    sget-object v2, Lax/j1/e;->a:Lax/j1/e;

    .line 46
    .line 47
    aput-object v2, v10, v12

    .line 48
    .line 49
    goto :goto_6d

    .line 50
    :cond_31
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 51
    .line 52
    invoke-interface {v4, v3, v11}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-wide v4, v3, Lax/d1/f;->h:J

    .line 60
    .line 61
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 62
    .line 63
    invoke-interface {v6}, Lax/d1/m;->e()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    sub-long/2addr v4, v6

    .line 68
    if-eq v2, v8, :cond_4a

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    :goto_46
    move-object v0, p0

    .line 72
    move-object v1, p1

    .line 73
    move-wide v6, p2

    .line 74
    goto :goto_4c

    .line 75
    :cond_4a
    const/4 v2, 0x0

    .line 76
    goto :goto_46

    .line 77
    :goto_4c
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/hls/c;->g(Landroidx/media3/exoplayer/hls/e;ZLax/d1/f;JJ)Landroid/util/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    new-instance v6, Landroidx/media3/exoplayer/hls/c$c;

    .line 98
    .line 99
    iget-object v7, v3, Lax/d1/j;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v3, v0, v1, v2}, Landroidx/media3/exoplayer/hls/c;->k(Lax/d1/f;JI)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v6, v7, v4, v5, v0}, Landroidx/media3/exoplayer/hls/c$c;-><init>(Ljava/lang/String;JLjava/util/List;)V

    .line 106
    .line 107
    .line 108
    aput-object v6, v10, v12

    .line 109
    .line 110
    :goto_6d
    add-int/lit8 v12, v12, 0x1

    .line 111
    .line 112
    goto :goto_18

    .line 113
    :cond_70
    return-object v10
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

.method public c(JLax/Y0/Z;)J
    .registers 15

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/l1/D;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge v0, v2, :cond_1e

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-eq v0, v2, :cond_1e

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 19
    .line 20
    invoke-interface {v2}, Lax/l1/D;->l()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aget-object v1, v1, v2

    .line 25
    .line 26
    invoke-interface {v0, v1, v3}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v0, 0x0

    .line 32
    :goto_1f
    if-eqz v0, :cond_6b

    .line 33
    .line 34
    iget-object v1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2a

    .line 41
    .line 42
    goto :goto_6b

    .line 43
    :cond_2a
    iget-wide v1, v0, Lax/d1/f;->h:J

    .line 44
    .line 45
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 46
    .line 47
    invoke-interface {v4}, Lax/d1/m;->e()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    sub-long/2addr v1, v4

    .line 52
    sub-long v5, p1, v1

    .line 53
    .line 54
    iget-object p1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p1, p2, v3, v3}, Lax/S0/d0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget-object p2, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Lax/d1/f$f;

    .line 71
    .line 72
    iget-wide v7, p2, Lax/d1/f$g;->f0:J

    .line 73
    .line 74
    iget-boolean p2, v0, Lax/d1/j;->c:Z

    .line 75
    .line 76
    if-eqz p2, :cond_64

    .line 77
    .line 78
    iget-object p2, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    sub-int/2addr p2, v3

    .line 85
    if-eq p1, p2, :cond_64

    .line 86
    .line 87
    iget-object p2, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 88
    .line 89
    add-int/2addr p1, v3

    .line 90
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Lax/d1/f$f;

    .line 95
    .line 96
    iget-wide p1, p1, Lax/d1/f$g;->f0:J

    .line 97
    .line 98
    move-wide v9, p1

    .line 99
    :goto_62
    move-object v4, p3

    .line 100
    goto :goto_66

    .line 101
    :cond_64
    move-wide v9, v7

    .line 102
    goto :goto_62

    .line 103
    :goto_66
    invoke-virtual/range {v4 .. v10}, Lax/Y0/Z;->a(JJJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide p1

    .line 107
    add-long/2addr p1, v1

    .line 108
    :cond_6b
    :goto_6b
    return-wide p1
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

.method public d(Landroidx/media3/exoplayer/hls/e;)I
    .registers 10

    .line 1
    iget v0, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_7

    .line 6
    .line 7
    return v2

    .line 8
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 11
    .line 12
    iget-object v3, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {v1, v0, v3}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/d1/f;

    .line 32
    .line 33
    iget-wide v4, p1, Lax/j1/d;->j:J

    .line 34
    .line 35
    iget-wide v6, v0, Lax/d1/f;->k:J

    .line 36
    .line 37
    sub-long/2addr v4, v6

    .line 38
    long-to-int v1, v4

    .line 39
    if-gez v1, :cond_29

    .line 40
    .line 41
    return v2

    .line 42
    :cond_29
    iget-object v4, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v1, v4, :cond_3c

    .line 49
    .line 50
    iget-object v4, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lax/d1/f$f;

    .line 57
    .line 58
    iget-object v1, v1, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    iget-object v1, v0, Lax/d1/f;->s:Ljava/util/List;

    .line 62
    .line 63
    :goto_3e
    iget v4, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/4 v6, 0x2

    .line 70
    if-lt v4, v5, :cond_48

    .line 71
    .line 72
    return v6

    .line 73
    :cond_48
    iget v4, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 74
    .line 75
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lax/d1/f$d;

    .line 80
    .line 81
    iget-boolean v4, v1, Lax/d1/f$d;->n0:Z

    .line 82
    .line 83
    if-eqz v4, :cond_55

    .line 84
    .line 85
    return v3

    .line 86
    :cond_55
    iget-object v0, v0, Lax/d1/j;->a:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, v1, Lax/d1/f$g;->q:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1}, Lax/S0/O;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object p1, p1, Lax/j1/b;->b:Lax/U0/k;

    .line 99
    .line 100
    iget-object p1, p1, Lax/U0/k;->a:Landroid/net/Uri;

    .line 101
    .line 102
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6c

    .line 107
    .line 108
    return v2

    .line 109
    :cond_6c
    return v6
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

.method public f(Landroidx/media3/exoplayer/p0;JJLjava/util/List;ZLandroidx/media3/exoplayer/hls/c$b;)V
    .registers 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/p0;",
            "JJ",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/e;",
            ">;Z",
            "Landroidx/media3/exoplayer/hls/c$b;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v8, p8

    .line 6
    .line 7
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_e

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_14

    .line 15
    :cond_e
    invoke-static/range {p6 .. p6}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/media3/exoplayer/hls/e;

    .line 20
    .line 21
    :goto_14
    if-nez v1, :cond_1a

    .line 22
    .line 23
    const/4 v11, -0x1

    .line 24
    :goto_17
    move-object/from16 v2, p1

    .line 25
    .line 26
    goto :goto_24

    .line 27
    :cond_1a
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 28
    .line 29
    iget-object v3, v1, Lax/j1/b;->d:Lax/P0/v;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    move v11, v2

    .line 36
    goto :goto_17

    .line 37
    :goto_24
    iget-wide v13, v2, Landroidx/media3/exoplayer/p0;->a:J

    .line 38
    .line 39
    sub-long v2, v6, v13

    .line 40
    .line 41
    invoke-direct {v0, v13, v14}, Landroidx/media3/exoplayer/hls/c;->w(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    if-eqz v1, :cond_4b

    .line 46
    .line 47
    iget-boolean v12, v0, Landroidx/media3/exoplayer/hls/c;->r:Z

    .line 48
    .line 49
    if-nez v12, :cond_4b

    .line 50
    .line 51
    invoke-virtual {v1}, Lax/j1/b;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v15

    .line 55
    sub-long/2addr v2, v15

    .line 56
    const-wide/16 v9, 0x0

    .line 57
    .line 58
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    cmp-long v12, v4, v17

    .line 68
    .line 69
    if-eqz v12, :cond_4b

    .line 70
    .line 71
    sub-long/2addr v4, v15

    .line 72
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    :cond_4b
    move-wide v15, v2

    .line 77
    move-wide/from16 v17, v4

    .line 78
    .line 79
    invoke-virtual {v0, v1, v6, v7}, Landroidx/media3/exoplayer/hls/c;->a(Landroidx/media3/exoplayer/hls/e;J)[Lax/j1/e;

    .line 80
    .line 81
    .line 82
    move-result-object v20

    .line 83
    iget-object v12, v0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 84
    .line 85
    move-object/from16 v19, p6

    .line 86
    .line 87
    invoke-interface/range {v12 .. v20}, Lax/l1/D;->c(JJJLjava/util/List;[Lax/j1/e;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 91
    .line 92
    invoke-interface {v2}, Lax/l1/D;->l()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v12, 0x1

    .line 98
    if-eq v11, v9, :cond_65

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    goto :goto_66

    .line 102
    :cond_65
    const/4 v2, 0x0

    .line 103
    :goto_66
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 104
    .line 105
    aget-object v13, v3, v9

    .line 106
    .line 107
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 108
    .line 109
    invoke-interface {v3, v13}, Lax/d1/m;->a(Landroid/net/Uri;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_77

    .line 114
    .line 115
    iput-object v13, v8, Landroidx/media3/exoplayer/hls/c$b;->c:Landroid/net/Uri;

    .line 116
    .line 117
    iput-object v13, v0, Landroidx/media3/exoplayer/hls/c;->q:Landroid/net/Uri;

    .line 118
    .line 119
    return-void

    .line 120
    :cond_77
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 121
    .line 122
    invoke-interface {v3, v13, v12}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-boolean v4, v3, Lax/d1/j;->c:Z

    .line 130
    .line 131
    iput-boolean v4, v0, Landroidx/media3/exoplayer/hls/c;->r:Z

    .line 132
    .line 133
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/hls/c;->B(Lax/d1/f;)V

    .line 134
    .line 135
    .line 136
    iget-wide v4, v3, Lax/d1/f;->h:J

    .line 137
    .line 138
    iget-object v14, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 139
    .line 140
    invoke-interface {v14}, Lax/d1/m;->e()J

    .line 141
    .line 142
    .line 143
    move-result-wide v14

    .line 144
    sub-long v16, v4, v14

    .line 145
    .line 146
    move-wide/from16 v4, v16

    .line 147
    .line 148
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/hls/c;->g(Landroidx/media3/exoplayer/hls/e;ZLax/d1/f;JJ)Landroid/util/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    iget-object v4, v14, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v4, Ljava/lang/Long;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    iget-object v6, v14, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    move-wide/from16 v18, p4

    .line 169
    .line 170
    move-object v15, v1

    .line 171
    move v10, v2

    .line 172
    move v2, v11

    .line 173
    move-object v1, v13

    .line 174
    const/16 v22, -0x1

    .line 175
    .line 176
    move-object v11, v3

    .line 177
    move-wide v12, v4

    .line 178
    const/4 v3, 0x0

    .line 179
    const/4 v4, 0x1

    .line 180
    invoke-static/range {v10 .. v19}, Landroidx/media3/exoplayer/hls/c;->A(ZLax/d1/f;JILandroidx/media3/exoplayer/hls/e;JJ)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    move-object/from16 v25, v15

    .line 185
    .line 186
    if-eqz v5, :cond_f9

    .line 187
    .line 188
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 189
    .line 190
    aget-object v13, v1, v2

    .line 191
    .line 192
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 193
    .line 194
    invoke-interface {v1, v13, v4}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    iget-wide v5, v1, Lax/d1/f;->h:J

    .line 202
    .line 203
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 204
    .line 205
    invoke-interface {v7}, Lax/d1/m;->e()J

    .line 206
    .line 207
    .line 208
    move-result-wide v9

    .line 209
    sub-long/2addr v5, v9

    .line 210
    move v10, v2

    .line 211
    const/4 v2, 0x0

    .line 212
    move-object v3, v1

    .line 213
    move-wide v4, v5

    .line 214
    move v15, v10

    .line 215
    move-object/from16 v1, v25

    .line 216
    .line 217
    const/4 v9, 0x0

    .line 218
    const/4 v10, -0x1

    .line 219
    const/4 v11, 0x1

    .line 220
    move-wide/from16 v6, p2

    .line 221
    .line 222
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/hls/c;->g(Landroidx/media3/exoplayer/hls/e;ZLax/d1/f;JJ)Landroid/util/Pair;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, Ljava/lang/Long;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    move-object v11, v3

    .line 243
    move-object v1, v13

    .line 244
    move v9, v15

    .line 245
    const/4 v3, 0x0

    .line 246
    move-wide v12, v6

    .line 247
    move-wide v6, v4

    .line 248
    const/4 v4, 0x1

    .line 249
    goto :goto_fd

    .line 250
    :cond_f9
    move v15, v2

    .line 251
    const/4 v10, -0x1

    .line 252
    move-wide/from16 v6, v16

    .line 253
    .line 254
    :goto_fd
    if-eq v9, v15, :cond_10a

    .line 255
    .line 256
    if-eq v15, v10, :cond_10a

    .line 257
    .line 258
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 259
    .line 260
    aget-object v2, v2, v15

    .line 261
    .line 262
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 263
    .line 264
    invoke-interface {v5, v2}, Lax/d1/m;->b(Landroid/net/Uri;)V

    .line 265
    .line 266
    .line 267
    :cond_10a
    iget-wide v3, v11, Lax/d1/f;->k:J

    .line 268
    .line 269
    cmp-long v15, v12, v3

    .line 270
    .line 271
    if-gez v15, :cond_118

    .line 272
    .line 273
    new-instance v1, Lax/i1/b;

    .line 274
    .line 275
    invoke-direct {v1}, Lax/i1/b;-><init>()V

    .line 276
    .line 277
    .line 278
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/c;->o:Ljava/io/IOException;

    .line 279
    .line 280
    return-void

    .line 281
    :cond_118
    invoke-static {v11, v12, v13, v14}, Landroidx/media3/exoplayer/hls/c;->h(Lax/d1/f;JI)Landroidx/media3/exoplayer/hls/c$e;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    if-nez v3, :cond_154

    .line 286
    .line 287
    iget-boolean v3, v11, Lax/d1/f;->o:Z

    .line 288
    .line 289
    if-nez v3, :cond_127

    .line 290
    .line 291
    iput-object v1, v8, Landroidx/media3/exoplayer/hls/c$b;->c:Landroid/net/Uri;

    .line 292
    .line 293
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/c;->q:Landroid/net/Uri;

    .line 294
    .line 295
    return-void

    .line 296
    :cond_127
    if-nez p7, :cond_131

    .line 297
    .line 298
    iget-object v3, v11, Lax/d1/f;->r:Ljava/util/List;

    .line 299
    .line 300
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_133

    .line 305
    .line 306
    :cond_131
    const/4 v4, 0x1

    .line 307
    goto :goto_151

    .line 308
    :cond_133
    new-instance v3, Landroidx/media3/exoplayer/hls/c$e;

    .line 309
    .line 310
    iget-object v4, v11, Lax/d1/f;->r:Ljava/util/List;

    .line 311
    .line 312
    invoke-static {v4}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Lax/d1/f$g;

    .line 317
    .line 318
    iget-wide v12, v11, Lax/d1/f;->k:J

    .line 319
    .line 320
    iget-object v14, v11, Lax/d1/f;->r:Ljava/util/List;

    .line 321
    .line 322
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    int-to-long v14, v14

    .line 327
    add-long/2addr v12, v14

    .line 328
    const-wide/16 v14, 0x1

    .line 329
    .line 330
    sub-long/2addr v12, v14

    .line 331
    invoke-direct {v3, v4, v12, v13, v10}, Landroidx/media3/exoplayer/hls/c$e;-><init>(Lax/d1/f$g;JI)V

    .line 332
    .line 333
    .line 334
    move-object v5, v3

    .line 335
    const/4 v3, 0x0

    .line 336
    const/4 v4, 0x1

    .line 337
    goto :goto_157

    .line 338
    :goto_151
    iput-boolean v4, v8, Landroidx/media3/exoplayer/hls/c$b;->b:Z

    .line 339
    .line 340
    return-void

    .line 341
    :cond_154
    const/4 v4, 0x1

    .line 342
    move-object v5, v3

    .line 343
    const/4 v3, 0x0

    .line 344
    :goto_157
    iput-object v3, v0, Landroidx/media3/exoplayer/hls/c;->q:Landroid/net/Uri;

    .line 345
    .line 346
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 347
    .line 348
    .line 349
    move-result-wide v12

    .line 350
    iput-wide v12, v0, Landroidx/media3/exoplayer/hls/c;->u:J

    .line 351
    .line 352
    iget-object v3, v5, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 353
    .line 354
    iget-object v3, v3, Lax/d1/f$g;->c0:Lax/d1/f$f;

    .line 355
    .line 356
    invoke-static {v11, v3}, Landroidx/media3/exoplayer/hls/c;->e(Lax/d1/f;Lax/d1/f$g;)Landroid/net/Uri;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    const/4 v12, 0x0

    .line 361
    invoke-direct {v0, v10, v9, v4, v12}, Landroidx/media3/exoplayer/hls/c;->p(Landroid/net/Uri;IZLax/m1/g$a;)Lax/j1/b;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iput-object v3, v8, Landroidx/media3/exoplayer/hls/c$b;->a:Lax/j1/b;

    .line 366
    .line 367
    if-eqz v3, :cond_172

    .line 368
    .line 369
    :goto_170
    move-object v14, v0

    .line 370
    goto :goto_19a

    .line 371
    :cond_172
    iget-object v3, v5, Landroidx/media3/exoplayer/hls/c$e;->a:Lax/d1/f$g;

    .line 372
    .line 373
    invoke-static {v11, v3}, Landroidx/media3/exoplayer/hls/c;->e(Lax/d1/f;Lax/d1/f$g;)Landroid/net/Uri;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    const/4 v3, 0x0

    .line 378
    invoke-direct {v0, v13, v9, v3, v12}, Landroidx/media3/exoplayer/hls/c;->p(Landroid/net/Uri;IZLax/m1/g$a;)Lax/j1/b;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    iput-object v2, v8, Landroidx/media3/exoplayer/hls/c$b;->a:Lax/j1/b;

    .line 383
    .line 384
    if-eqz v2, :cond_182

    .line 385
    .line 386
    goto :goto_170

    .line 387
    :cond_182
    invoke-static {v5, v11}, Landroidx/media3/exoplayer/hls/c;->o(Landroidx/media3/exoplayer/hls/c$e;Lax/d1/f;)Z

    .line 388
    .line 389
    .line 390
    move-result v29

    .line 391
    move-object v14, v0

    .line 392
    move-object v3, v1

    .line 393
    move-object/from16 v0, v25

    .line 394
    .line 395
    move/from16 v4, v29

    .line 396
    .line 397
    move-wide/from16 v1, p2

    .line 398
    .line 399
    invoke-static/range {v0 .. v7}, Landroidx/media3/exoplayer/hls/e;->y(Landroidx/media3/exoplayer/hls/e;JLandroid/net/Uri;ZLandroidx/media3/exoplayer/hls/c$e;J)Z

    .line 400
    .line 401
    .line 402
    move-result v28

    .line 403
    move-object/from16 v17, v3

    .line 404
    .line 405
    if-eqz v28, :cond_19b

    .line 406
    .line 407
    iget-boolean v0, v5, Landroidx/media3/exoplayer/hls/c$e;->d:Z

    .line 408
    .line 409
    if-eqz v0, :cond_19b

    .line 410
    .line 411
    :goto_19a
    return-void

    .line 412
    :cond_19b
    iget-object v0, v14, Landroidx/media3/exoplayer/hls/c;->a:Lax/c1/e;

    .line 413
    .line 414
    move-object v15, v11

    .line 415
    iget-object v11, v14, Landroidx/media3/exoplayer/hls/c;->b:Lax/U0/g;

    .line 416
    .line 417
    iget-object v1, v14, Landroidx/media3/exoplayer/hls/c;->f:[Lax/P0/v;

    .line 418
    .line 419
    aget-object v1, v1, v9

    .line 420
    .line 421
    iget-object v2, v14, Landroidx/media3/exoplayer/hls/c;->i:Ljava/util/List;

    .line 422
    .line 423
    iget-object v3, v14, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 424
    .line 425
    invoke-interface {v3}, Lax/l1/D;->n()I

    .line 426
    .line 427
    .line 428
    move-result v19

    .line 429
    iget-object v3, v14, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 430
    .line 431
    invoke-interface {v3}, Lax/l1/D;->q()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v20

    .line 435
    iget-boolean v3, v14, Landroidx/media3/exoplayer/hls/c;->m:Z

    .line 436
    .line 437
    iget-object v4, v14, Landroidx/media3/exoplayer/hls/c;->d:Lax/c1/j;

    .line 438
    .line 439
    move-object v9, v0

    .line 440
    move-object/from16 p1, v1

    .line 441
    .line 442
    iget-wide v0, v14, Landroidx/media3/exoplayer/hls/c;->l:J

    .line 443
    .line 444
    iget-object v12, v14, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 445
    .line 446
    invoke-virtual {v12, v13}, Landroidx/media3/exoplayer/hls/b;->a(Landroid/net/Uri;)[B

    .line 447
    .line 448
    .line 449
    move-result-object v26

    .line 450
    iget-object v12, v14, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 451
    .line 452
    invoke-virtual {v12, v10}, Landroidx/media3/exoplayer/hls/b;->a(Landroid/net/Uri;)[B

    .line 453
    .line 454
    .line 455
    move-result-object v27

    .line 456
    iget-object v10, v14, Landroidx/media3/exoplayer/hls/c;->k:Lax/Z0/I1;

    .line 457
    .line 458
    move-object/from16 v12, p1

    .line 459
    .line 460
    move-wide/from16 v23, v0

    .line 461
    .line 462
    move-object/from16 v18, v2

    .line 463
    .line 464
    move/from16 v21, v3

    .line 465
    .line 466
    move-object/from16 v22, v4

    .line 467
    .line 468
    move-object/from16 v16, v5

    .line 469
    .line 470
    move-wide v13, v6

    .line 471
    move-object/from16 v30, v10

    .line 472
    .line 473
    const/16 v31, 0x0

    .line 474
    .line 475
    move-object v10, v9

    .line 476
    invoke-static/range {v10 .. v31}, Landroidx/media3/exoplayer/hls/e;->j(Lax/c1/e;Lax/U0/g;Lax/P0/v;JLax/d1/f;Landroidx/media3/exoplayer/hls/c$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLax/c1/j;JLandroidx/media3/exoplayer/hls/e;[B[BZZLax/Z0/I1;Lax/m1/g$a;)Landroidx/media3/exoplayer/hls/e;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    iput-object v0, v8, Landroidx/media3/exoplayer/hls/c$b;->a:Lax/j1/b;

    .line 481
    .line 482
    return-void
.end method

.method public i(JLjava/util/List;)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_15

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 6
    .line 7
    invoke-interface {v0}, Lax/l1/H;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_e

    .line 13
    .line 14
    goto :goto_15

    .line 15
    :cond_e
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, Lax/l1/D;->k(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_15
    :goto_15
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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

.method public j(Landroidx/media3/exoplayer/hls/e;)J
    .registers 7

    .line 1
    iget v0, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_8

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
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 16
    .line 17
    iget-object v3, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    aget-object v0, v0, v1

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 26
    .line 27
    invoke-interface {v1, v0, v2}, Lax/d1/m;->n(Landroid/net/Uri;Z)Lax/d1/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lax/d1/f;

    .line 36
    .line 37
    iget-wide v1, p1, Lax/j1/d;->j:J

    .line 38
    .line 39
    iget-wide v3, v0, Lax/d1/f;->k:J

    .line 40
    .line 41
    sub-long/2addr v1, v3

    .line 42
    long-to-int v2, v1

    .line 43
    if-gez v2, :cond_2f

    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    return-wide v0

    .line 48
    :cond_2f
    iget-object v1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-ge v2, v1, :cond_42

    .line 55
    .line 56
    iget-object v0, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lax/d1/f$f;

    .line 63
    .line 64
    iget-object v0, v0, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 65
    .line 66
    goto :goto_44

    .line 67
    :cond_42
    iget-object v0, v0, Lax/d1/f;->s:Ljava/util/List;

    .line 68
    .line 69
    :goto_44
    iget p1, p1, Landroidx/media3/exoplayer/hls/e;->o:I

    .line 70
    .line 71
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lax/d1/f$d;

    .line 76
    .line 77
    iget-wide v0, p1, Lax/d1/f$g;->d0:J

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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public l()Lax/P0/P;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

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

.method public m()Lax/l1/D;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

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

.method public n()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/c;->r:Z

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

.method public q(Lax/j1/b;J)Z
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->h:Lax/P0/P;

    .line 4
    .line 5
    iget-object p1, p1, Lax/j1/b;->d:Lax/P0/v;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lax/P0/P;->c(Lax/P0/v;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {v0, p1}, Lax/l1/H;->t(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {v0, p1, p2, p3}, Lax/l1/D;->o(IJ)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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

.method public r()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_18

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->p:Landroid/net/Uri;

    .line 6
    .line 7
    if-eqz v0, :cond_17

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->q:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->p:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lax/d1/m;->c(Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void

    .line 25
    :cond_18
    throw v0
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

.method public s(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public t(Lax/j1/b;)V
    .registers 4

    .line 1
    instance-of v0, p1, Landroidx/media3/exoplayer/hls/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    check-cast p1, Landroidx/media3/exoplayer/hls/c$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/j1/c;->h()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/c;->n:[B

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->j:Landroidx/media3/exoplayer/hls/b;

    .line 14
    .line 15
    iget-object v1, p1, Lax/j1/b;->b:Lax/U0/k;

    .line 16
    .line 17
    iget-object v1, v1, Lax/U0/k;->a:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/c$a;->j()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, [B

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/hls/b;->b(Landroid/net/Uri;[B)[B

    .line 30
    .line 31
    .line 32
    :cond_1f
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

.method public u(Landroid/net/Uri;J)Z
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/c;->e:[Landroid/net/Uri;

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    const/4 v4, -0x1

    .line 7
    if-ge v1, v3, :cond_14

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_11

    .line 16
    .line 17
    goto :goto_15

    .line 18
    :cond_11
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_14
    const/4 v1, -0x1

    .line 22
    :goto_15
    const/4 v2, 0x1

    .line 23
    if-ne v1, v4, :cond_19

    .line 24
    .line 25
    return v2

    .line 26
    :cond_19
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 27
    .line 28
    invoke-interface {v3, v1}, Lax/l1/H;->t(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, v4, :cond_22

    .line 33
    .line 34
    return v2

    .line 35
    :cond_22
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->p:Landroid/net/Uri;

    .line 36
    .line 37
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v5, p2, v3

    .line 43
    .line 44
    if-eqz v5, :cond_3e

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 47
    .line 48
    invoke-interface {v3, v1, p2, p3}, Lax/l1/D;->o(IJ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3e

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/c;->g:Lax/d1/m;

    .line 55
    .line 56
    invoke-interface {v1, p1, p2, p3}, Lax/d1/m;->i(Landroid/net/Uri;J)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3e

    .line 61
    .line 62
    return v2

    .line 63
    :cond_3e
    return v0
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

.method public v()V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/c;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/c;->o:Ljava/io/IOException;

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

.method public x(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/c;->m:Z

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

.method public y(Lax/l1/D;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/c;->b()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

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

.method public z(JLax/j1/b;Ljava/util/List;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lax/j1/b;",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->o:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/c;->s:Lax/l1/D;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Lax/l1/D;->e(JLax/j1/b;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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
