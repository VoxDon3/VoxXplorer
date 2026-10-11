.class public Lax/l1/a;
.super Lax/l1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/l1/a$a;,
        Lax/l1/a$b;
    }
.end annotation


# instance fields
.field private final i:Lax/m1/e;

.field private final j:J

.field private final k:J

.field private final l:J

.field private final m:I

.field private final n:I

.field private final o:F

.field private final p:F

.field private final q:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/l1/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Lax/S0/h;

.field private s:F

.field private t:I

.field private u:I

.field private v:J

.field private w:Lax/j1/d;

.field private x:J


# direct methods
.method protected constructor <init>(Lax/P0/P;[IILax/m1/e;JJJIIFFLjava/util/List;Lax/S0/h;)V
    .registers 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/P;",
            "[II",
            "Lax/m1/e;",
            "JJJIIFF",
            "Ljava/util/List<",
            "Lax/l1/a$a;",
            ">;",
            "Lax/S0/h;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p3}, Lax/l1/c;-><init>(Lax/P0/P;[II)V

    .line 2
    .line 3
    .line 4
    cmp-long p1, p9, p5

    .line 5
    .line 6
    if-gez p1, :cond_10

    .line 7
    .line 8
    const-string p1, "AdaptiveTrackSelection"

    .line 9
    .line 10
    const-string p2, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-wide p1, p5

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    move-wide p1, p9

    .line 18
    :goto_11
    iput-object p4, p0, Lax/l1/a;->i:Lax/m1/e;

    .line 19
    .line 20
    const-wide/16 p3, 0x3e8

    .line 21
    .line 22
    mul-long p5, p5, p3

    .line 23
    .line 24
    iput-wide p5, p0, Lax/l1/a;->j:J

    .line 25
    .line 26
    mul-long p7, p7, p3

    .line 27
    .line 28
    iput-wide p7, p0, Lax/l1/a;->k:J

    .line 29
    .line 30
    mul-long p1, p1, p3

    .line 31
    .line 32
    iput-wide p1, p0, Lax/l1/a;->l:J

    .line 33
    .line 34
    iput p11, p0, Lax/l1/a;->m:I

    .line 35
    .line 36
    iput p12, p0, Lax/l1/a;->n:I

    .line 37
    .line 38
    iput p13, p0, Lax/l1/a;->o:F

    .line 39
    .line 40
    iput p14, p0, Lax/l1/a;->p:F

    .line 41
    .line 42
    invoke-static {p15}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 47
    .line 48
    move-object/from16 p1, p16

    .line 49
    .line 50
    iput-object p1, p0, Lax/l1/a;->r:Lax/S0/h;

    .line 51
    .line 52
    const/high16 p1, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput p1, p0, Lax/l1/a;->s:F

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput p1, p0, Lax/l1/a;->u:I

    .line 58
    .line 59
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    iput-wide p1, p0, Lax/l1/a;->v:J

    .line 65
    .line 66
    const-wide/32 p1, -0x7fffffff

    .line 67
    .line 68
    .line 69
    iput-wide p1, p0, Lax/l1/a;->x:J

    .line 70
    .line 71
    return-void
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
.end method

.method private static A([Lax/l1/D$a;)Lax/r7/z;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lax/l1/D$a;",
            ")",
            "Lax/r7/z<",
            "Lax/r7/z<",
            "Lax/l1/a$a;",
            ">;>;"
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
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    array-length v3, p0

    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    if-ge v2, v3, :cond_2d

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    if-eqz v3, :cond_26

    .line 17
    .line 18
    iget-object v3, v3, Lax/l1/D$a;->b:[I

    .line 19
    .line 20
    array-length v3, v3

    .line 21
    if-le v3, v6, :cond_26

    .line 22
    .line 23
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v6, Lax/l1/a$a;

    .line 28
    .line 29
    invoke-direct {v6, v4, v5, v4, v5}, Lax/l1/a$a;-><init>(JJ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v6}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_2a

    .line 39
    :cond_26
    const/4 v3, 0x0

    .line 40
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_2a
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_7

    .line 46
    :cond_2d
    invoke-static {p0}, Lax/l1/a;->F([Lax/l1/D$a;)[[J

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    array-length v3, v2

    .line 51
    new-array v3, v3, [I

    .line 52
    .line 53
    array-length v7, v2

    .line 54
    new-array v7, v7, [J

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    :goto_38
    array-length v9, v2

    .line 58
    if-ge v8, v9, :cond_49

    .line 59
    .line 60
    aget-object v9, v2, v8

    .line 61
    .line 62
    array-length v10, v9

    .line 63
    if-nez v10, :cond_42

    .line 64
    .line 65
    move-wide v10, v4

    .line 66
    goto :goto_44

    .line 67
    :cond_42
    aget-wide v10, v9, v1

    .line 68
    .line 69
    :goto_44
    aput-wide v10, v7, v8

    .line 70
    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    goto :goto_38

    .line 74
    :cond_49
    invoke-static {v0, v7}, Lax/l1/a;->x(Ljava/util/List;[J)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, Lax/l1/a;->G([[J)Lax/r7/z;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/4 v5, 0x0

    .line 82
    :goto_51
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-ge v5, v8, :cond_72

    .line 87
    .line 88
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    aget v9, v3, v8

    .line 99
    .line 100
    add-int/2addr v9, v6

    .line 101
    aput v9, v3, v8

    .line 102
    .line 103
    aget-object v10, v2, v8

    .line 104
    .line 105
    aget-wide v9, v10, v9

    .line 106
    .line 107
    aput-wide v9, v7, v8

    .line 108
    .line 109
    invoke-static {v0, v7}, Lax/l1/a;->x(Ljava/util/List;[J)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_51

    .line 115
    :cond_72
    const/4 v2, 0x0

    .line 116
    :goto_73
    array-length v3, p0

    .line 117
    if-ge v2, v3, :cond_87

    .line 118
    .line 119
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_84

    .line 124
    .line 125
    aget-wide v3, v7, v2

    .line 126
    .line 127
    const-wide/16 v5, 0x2

    .line 128
    .line 129
    mul-long v3, v3, v5

    .line 130
    .line 131
    aput-wide v3, v7, v2

    .line 132
    .line 133
    :cond_84
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_73

    .line 136
    :cond_87
    invoke-static {v0, v7}, Lax/l1/a;->x(Ljava/util/List;[J)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_8e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-ge v1, v2, :cond_ab

    .line 148
    .line 149
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Lax/r7/z$a;

    .line 154
    .line 155
    if-nez v2, :cond_a1

    .line 156
    .line 157
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    goto :goto_a5

    .line 162
    :cond_a1
    invoke-virtual {v2}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    :goto_a5
    invoke-virtual {p0, v2}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 167
    .line 168
    .line 169
    add-int/lit8 v1, v1, 0x1

    .line 170
    .line 171
    goto :goto_8e

    .line 172
    :cond_ab
    invoke-virtual {p0}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0
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
.end method

.method private B(J)J
    .registers 9

    .line 1
    invoke-direct {p0, p1, p2}, Lax/l1/a;->H(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return-wide p1

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x1

    .line 16
    :goto_f
    iget-object v2, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sub-int/2addr v2, v0

    .line 23
    if-ge v1, v2, :cond_29

    .line 24
    .line 25
    iget-object v2, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lax/l1/a$a;

    .line 32
    .line 33
    iget-wide v2, v2, Lax/l1/a$a;->a:J

    .line 34
    .line 35
    cmp-long v4, v2, p1

    .line 36
    .line 37
    if-gez v4, :cond_29

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_f

    .line 42
    :cond_29
    iget-object v0, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 43
    .line 44
    add-int/lit8 v2, v1, -0x1

    .line 45
    .line 46
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lax/l1/a$a;

    .line 51
    .line 52
    iget-object v2, p0, Lax/l1/a;->q:Lax/r7/z;

    .line 53
    .line 54
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lax/l1/a$a;

    .line 59
    .line 60
    iget-wide v2, v0, Lax/l1/a$a;->a:J

    .line 61
    .line 62
    sub-long/2addr p1, v2

    .line 63
    long-to-float p1, p1

    .line 64
    iget-wide v4, v1, Lax/l1/a$a;->a:J

    .line 65
    .line 66
    sub-long/2addr v4, v2

    .line 67
    long-to-float p2, v4

    .line 68
    div-float/2addr p1, p2

    .line 69
    iget-wide v2, v0, Lax/l1/a$a;->b:J

    .line 70
    .line 71
    iget-wide v0, v1, Lax/l1/a$a;->b:J

    .line 72
    .line 73
    sub-long/2addr v0, v2

    .line 74
    long-to-float p2, v0

    .line 75
    mul-float p1, p1, p2

    .line 76
    .line 77
    float-to-long p1, p1

    .line 78
    add-long/2addr v2, p1

    .line 79
    return-wide v2
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

.method private C(Ljava/util/List;)J
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;)J"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return-wide v1

    .line 13
    :cond_c
    invoke-static {p1}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lax/j1/d;

    .line 18
    .line 19
    iget-wide v3, p1, Lax/j1/b;->g:J

    .line 20
    .line 21
    cmp-long v0, v3, v1

    .line 22
    .line 23
    if-eqz v0, :cond_20

    .line 24
    .line 25
    iget-wide v5, p1, Lax/j1/b;->h:J

    .line 26
    .line 27
    cmp-long p1, v5, v1

    .line 28
    .line 29
    if-eqz p1, :cond_20

    .line 30
    .line 31
    sub-long/2addr v5, v3

    .line 32
    return-wide v5

    .line 33
    :cond_20
    return-wide v1
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

.method private E([Lax/j1/e;Ljava/util/List;)J
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lax/j1/e;",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;)J"
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/l1/a;->t:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-ge v0, v1, :cond_1b

    .line 5
    .line 6
    aget-object v0, p1, v0

    .line 7
    .line 8
    invoke-interface {v0}, Lax/j1/e;->next()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1b

    .line 13
    .line 14
    iget p2, p0, Lax/l1/a;->t:I

    .line 15
    .line 16
    aget-object p1, p1, p2

    .line 17
    .line 18
    invoke-interface {p1}, Lax/j1/e;->b()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-interface {p1}, Lax/j1/e;->a()J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    sub-long/2addr v0, p1

    .line 27
    return-wide v0

    .line 28
    :cond_1b
    array-length v0, p1

    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_1d
    if-ge v1, v0, :cond_34

    .line 31
    .line 32
    aget-object v2, p1, v1

    .line 33
    .line 34
    invoke-interface {v2}, Lax/j1/e;->next()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_31

    .line 39
    .line 40
    invoke-interface {v2}, Lax/j1/e;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    invoke-interface {v2}, Lax/j1/e;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    sub-long/2addr p1, v0

    .line 49
    return-wide p1

    .line 50
    :cond_31
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_1d

    .line 53
    :cond_34
    invoke-direct {p0, p2}, Lax/l1/a;->C(Ljava/util/List;)J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    return-wide p1
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

.method private static F([Lax/l1/D$a;)[[J
    .registers 12

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [[J

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    array-length v3, p0

    .line 7
    if-ge v2, v3, :cond_40

    .line 8
    .line 9
    aget-object v3, p0, v2

    .line 10
    .line 11
    if-nez v3, :cond_11

    .line 12
    .line 13
    new-array v3, v1, [J

    .line 14
    .line 15
    aput-object v3, v0, v2

    .line 16
    .line 17
    goto :goto_3d

    .line 18
    :cond_11
    iget-object v4, v3, Lax/l1/D$a;->b:[I

    .line 19
    .line 20
    array-length v4, v4

    .line 21
    new-array v4, v4, [J

    .line 22
    .line 23
    aput-object v4, v0, v2

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_19
    iget-object v5, v3, Lax/l1/D$a;->b:[I

    .line 27
    .line 28
    array-length v6, v5

    .line 29
    if-ge v4, v6, :cond_38

    .line 30
    .line 31
    iget-object v6, v3, Lax/l1/D$a;->a:Lax/P0/P;

    .line 32
    .line 33
    aget v5, v5, v4

    .line 34
    .line 35
    invoke-virtual {v6, v5}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v5, v5, Lax/P0/v;->j:I

    .line 40
    .line 41
    int-to-long v5, v5

    .line 42
    aget-object v7, v0, v2

    .line 43
    .line 44
    const-wide/16 v8, -0x1

    .line 45
    .line 46
    cmp-long v10, v5, v8

    .line 47
    .line 48
    if-nez v10, :cond_33

    .line 49
    .line 50
    const-wide/16 v5, 0x0

    .line 51
    .line 52
    :cond_33
    aput-wide v5, v7, v4

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_19

    .line 57
    :cond_38
    aget-object v3, v0, v2

    .line 58
    .line 59
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 60
    .line 61
    .line 62
    :goto_3d
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_40
    return-object v0
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

.method private static G([[J)Lax/r7/z;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([[J)",
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/r7/M;->c()Lax/r7/M$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/r7/M$e;->a()Lax/r7/M$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/r7/M$d;->e()Lax/r7/H;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_e
    array-length v3, p0

    .line 16
    if-ge v2, v3, :cond_65

    .line 17
    .line 18
    aget-object v3, p0, v2

    .line 19
    .line 20
    array-length v4, v3

    .line 21
    const/4 v5, 0x1

    .line 22
    if-gt v4, v5, :cond_18

    .line 23
    .line 24
    goto :goto_62

    .line 25
    :cond_18
    array-length v3, v3

    .line 26
    new-array v4, v3, [D

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    :goto_1c
    aget-object v6, p0, v2

    .line 30
    .line 31
    array-length v7, v6

    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    if-ge v5, v7, :cond_36

    .line 35
    .line 36
    aget-wide v10, v6, v5

    .line 37
    .line 38
    const-wide/16 v6, -0x1

    .line 39
    .line 40
    cmp-long v12, v10, v6

    .line 41
    .line 42
    if-nez v12, :cond_2c

    .line 43
    .line 44
    goto :goto_31

    .line 45
    :cond_2c
    long-to-double v6, v10

    .line 46
    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    :goto_31
    aput-wide v8, v4, v5

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_1c

    .line 55
    :cond_36
    add-int/lit8 v3, v3, -0x1

    .line 56
    .line 57
    aget-wide v5, v4, v3

    .line 58
    .line 59
    aget-wide v10, v4, v1

    .line 60
    .line 61
    sub-double/2addr v5, v10

    .line 62
    const/4 v7, 0x0

    .line 63
    :goto_3e
    if-ge v7, v3, :cond_62

    .line 64
    .line 65
    aget-wide v10, v4, v7

    .line 66
    .line 67
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    aget-wide v12, v4, v7

    .line 70
    .line 71
    add-double/2addr v10, v12

    .line 72
    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    .line 73
    .line 74
    mul-double v10, v10, v12

    .line 75
    .line 76
    cmpl-double v12, v5, v8

    .line 77
    .line 78
    if-nez v12, :cond_52

    .line 79
    .line 80
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 81
    .line 82
    goto :goto_56

    .line 83
    :cond_52
    aget-wide v12, v4, v1

    .line 84
    .line 85
    sub-double/2addr v10, v12

    .line 86
    div-double/2addr v10, v5

    .line 87
    :goto_56
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-interface {v0, v10, v11}, Lax/r7/L;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_3e

    .line 99
    :cond_62
    :goto_62
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_e

    .line 102
    :cond_65
    invoke-interface {v0}, Lax/r7/L;->values()Ljava/util/Collection;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
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

.method private H(J)J
    .registers 10

    .line 1
    iget-object v0, p0, Lax/l1/a;->i:Lax/m1/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/m1/e;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lax/l1/a;->x:J

    .line 8
    .line 9
    long-to-float v0, v0

    .line 10
    iget v1, p0, Lax/l1/a;->o:F

    .line 11
    .line 12
    mul-float v0, v0, v1

    .line 13
    .line 14
    float-to-long v0, v0

    .line 15
    iget-object v2, p0, Lax/l1/a;->i:Lax/m1/e;

    .line 16
    .line 17
    invoke-interface {v2}, Lax/m1/e;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v6, v2, v4

    .line 27
    .line 28
    if-eqz v6, :cond_34

    .line 29
    .line 30
    cmp-long v6, p1, v4

    .line 31
    .line 32
    if-nez v6, :cond_22

    .line 33
    .line 34
    goto :goto_34

    .line 35
    :cond_22
    long-to-float p1, p1

    .line 36
    iget p2, p0, Lax/l1/a;->s:F

    .line 37
    .line 38
    div-float p2, p1, p2

    .line 39
    .line 40
    long-to-float v2, v2

    .line 41
    sub-float/2addr p2, v2

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    long-to-float v0, v0

    .line 48
    mul-float v0, v0, p2

    .line 49
    .line 50
    div-float/2addr v0, p1

    .line 51
    float-to-long p1, v0

    .line 52
    return-wide p1

    .line 53
    :cond_34
    :goto_34
    long-to-float p1, v0

    .line 54
    iget p2, p0, Lax/l1/a;->s:F

    .line 55
    .line 56
    div-float/2addr p1, p2

    .line 57
    float-to-long p1, p1

    .line 58
    return-wide p1
    .line 59
    .line 60
    .line 61
.end method

.method private I(JJ)J
    .registers 8

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-nez v2, :cond_c

    .line 9
    .line 10
    iget-wide p1, p0, Lax/l1/a;->j:J

    .line 11
    .line 12
    return-wide p1

    .line 13
    :cond_c
    cmp-long v2, p3, v0

    .line 14
    .line 15
    if-eqz v2, :cond_11

    .line 16
    .line 17
    sub-long/2addr p1, p3

    .line 18
    :cond_11
    long-to-float p1, p1

    .line 19
    iget p2, p0, Lax/l1/a;->p:F

    .line 20
    .line 21
    mul-float p1, p1, p2

    .line 22
    .line 23
    float-to-long p1, p1

    .line 24
    iget-wide p3, p0, Lax/l1/a;->j:J

    .line 25
    .line 26
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    return-wide p1
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

.method static synthetic w([Lax/l1/D$a;)Lax/r7/z;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/l1/a;->A([Lax/l1/D$a;)Lax/r7/z;

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
.end method

.method private static x(Ljava/util/List;[J)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/r7/z$a<",
            "Lax/l1/a$a;",
            ">;>;[J)V"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    :goto_4
    array-length v4, p1

    .line 6
    if-ge v3, v4, :cond_d

    .line 7
    .line 8
    aget-wide v4, p1, v3

    .line 9
    .line 10
    add-long/2addr v0, v4

    .line 11
    add-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    goto :goto_4

    .line 14
    :cond_d
    :goto_d
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_29

    .line 19
    .line 20
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lax/r7/z$a;

    .line 25
    .line 26
    if-nez v3, :cond_1c

    .line 27
    .line 28
    goto :goto_26

    .line 29
    :cond_1c
    new-instance v4, Lax/l1/a$a;

    .line 30
    .line 31
    aget-wide v5, p1, v2

    .line 32
    .line 33
    invoke-direct {v4, v0, v1, v5, v6}, Lax/l1/a$a;-><init>(JJ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 37
    .line 38
    .line 39
    :goto_26
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_d

    .line 42
    :cond_29
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

.method private z(JJ)I
    .registers 10

    .line 1
    invoke-direct {p0, p3, p4}, Lax/l1/a;->B(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p3

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    iget v2, p0, Lax/l1/c;->b:I

    .line 8
    .line 9
    if-ge v0, v2, :cond_27

    .line 10
    .line 11
    const-wide/high16 v2, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v4, p1, v2

    .line 14
    .line 15
    if-eqz v4, :cond_16

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1, p2}, Lax/l1/c;->a(IJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_24

    .line 22
    .line 23
    :cond_16
    invoke-virtual {p0, v0}, Lax/l1/c;->h(I)Lax/P0/v;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget v2, v1, Lax/P0/v;->j:I

    .line 28
    .line 29
    invoke-virtual {p0, v1, v2, p3, p4}, Lax/l1/a;->y(Lax/P0/v;IJ)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_23

    .line 34
    .line 35
    return v0

    .line 36
    :cond_23
    move v1, v0

    .line 37
    :cond_24
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_6

    .line 40
    :cond_27
    return v1
    .line 41
.end method


# virtual methods
.method protected D()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/l1/a;->l:J

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
.end method

.method protected J(JLjava/util/List;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lax/l1/a;->v:J

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
    if-eqz v4, :cond_29

    .line 11
    .line 12
    sub-long/2addr p1, v0

    .line 13
    const-wide/16 v0, 0x3e8

    .line 14
    .line 15
    cmp-long v2, p1, v0

    .line 16
    .line 17
    if-gez v2, :cond_29

    .line 18
    .line 19
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_27

    .line 24
    .line 25
    invoke-static {p3}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lax/j1/d;

    .line 30
    .line 31
    iget-object p2, p0, Lax/l1/a;->w:Lax/j1/d;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_27

    .line 38
    .line 39
    goto :goto_29

    .line 40
    :cond_27
    const/4 p1, 0x0

    .line 41
    return p1

    .line 42
    :cond_29
    :goto_29
    const/4 p1, 0x1

    .line 43
    return p1
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
.end method

.method public c(JJJLjava/util/List;[Lax/j1/e;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lax/j1/d;",
            ">;[",
            "Lax/j1/e;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/l1/a;->r:Lax/S0/h;

    .line 2
    .line 3
    invoke-interface {p1}, Lax/S0/h;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    invoke-direct {p0, p8, p7}, Lax/l1/a;->E([Lax/j1/e;Ljava/util/List;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget p8, p0, Lax/l1/a;->u:I

    .line 12
    .line 13
    if-nez p8, :cond_18

    .line 14
    .line 15
    const/4 p3, 0x1

    .line 16
    iput p3, p0, Lax/l1/a;->u:I

    .line 17
    .line 18
    invoke-direct {p0, p1, p2, v0, v1}, Lax/l1/a;->z(JJ)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lax/l1/a;->t:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget v2, p0, Lax/l1/a;->t:I

    .line 26
    .line 27
    invoke-interface {p7}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, -0x1

    .line 32
    if-eqz v3, :cond_23

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    goto :goto_2f

    .line 36
    :cond_23
    invoke-static {p7}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lax/j1/d;

    .line 41
    .line 42
    iget-object v3, v3, Lax/j1/b;->d:Lax/P0/v;

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lax/l1/c;->v(Lax/P0/v;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    :goto_2f
    if-eq v3, v4, :cond_3a

    .line 49
    .line 50
    invoke-static {p7}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p7

    .line 54
    check-cast p7, Lax/j1/d;

    .line 55
    .line 56
    iget p8, p7, Lax/j1/b;->e:I

    .line 57
    .line 58
    move v2, v3

    .line 59
    :cond_3a
    invoke-direct {p0, p1, p2, v0, v1}, Lax/l1/a;->z(JJ)I

    .line 60
    .line 61
    .line 62
    move-result p7

    .line 63
    if-eq p7, v2, :cond_66

    .line 64
    .line 65
    invoke-virtual {p0, v2, p1, p2}, Lax/l1/c;->a(IJ)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_66

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lax/l1/c;->h(I)Lax/P0/v;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p7}, Lax/l1/c;->h(I)Lax/P0/v;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p0, p5, p6, v0, v1}, Lax/l1/a;->I(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide p5

    .line 83
    iget p2, p2, Lax/P0/v;->j:I

    .line 84
    .line 85
    iget p1, p1, Lax/P0/v;->j:I

    .line 86
    .line 87
    if-le p2, p1, :cond_5d

    .line 88
    .line 89
    cmp-long v0, p3, p5

    .line 90
    .line 91
    if-gez v0, :cond_5d

    .line 92
    .line 93
    goto :goto_65

    .line 94
    :cond_5d
    if-ge p2, p1, :cond_66

    .line 95
    .line 96
    iget-wide p1, p0, Lax/l1/a;->k:J

    .line 97
    .line 98
    cmp-long p5, p3, p1

    .line 99
    .line 100
    if-ltz p5, :cond_66

    .line 101
    .line 102
    :goto_65
    move p7, v2

    .line 103
    :cond_66
    if-ne p7, v2, :cond_69

    .line 104
    .line 105
    goto :goto_6a

    .line 106
    :cond_69
    const/4 p8, 0x3

    .line 107
    :goto_6a
    iput p8, p0, Lax/l1/a;->u:I

    .line 108
    .line 109
    iput p7, p0, Lax/l1/a;->t:I

    .line 110
    .line 111
    return-void
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

.method public d()I
    .registers 2

    .line 1
    iget v0, p0, Lax/l1/a;->t:I

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

.method public f()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/l1/a;->w:Lax/j1/d;

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

.method public i()V
    .registers 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lax/l1/a;->v:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/l1/a;->w:Lax/j1/d;

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
.end method

.method public k(JLjava/util/List;)I
    .registers 14
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
    iget-object v0, p0, Lax/l1/a;->r:Lax/S0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1, p3}, Lax/l1/a;->J(JLjava/util/List;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_11

    .line 12
    .line 13
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_11
    iput-wide v0, p0, Lax/l1/a;->v:J

    .line 19
    .line 20
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1b

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_21

    .line 28
    :cond_1b
    invoke-static {p3}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lax/j1/d;

    .line 33
    .line 34
    :goto_21
    iput-object v2, p0, Lax/l1/a;->w:Lax/j1/d;

    .line 35
    .line 36
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_2b

    .line 42
    .line 43
    return v3

    .line 44
    :cond_2b
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v4, v2, -0x1

    .line 49
    .line 50
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lax/j1/d;

    .line 55
    .line 56
    iget-wide v4, v4, Lax/j1/b;->g:J

    .line 57
    .line 58
    sub-long/2addr v4, p1

    .line 59
    iget v6, p0, Lax/l1/a;->s:F

    .line 60
    .line 61
    invoke-static {v4, v5, v6}, Lax/S0/d0;->n0(JF)J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    invoke-virtual {p0}, Lax/l1/a;->D()J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    cmp-long v8, v4, v6

    .line 70
    .line 71
    if-gez v8, :cond_49

    .line 72
    .line 73
    goto :goto_8b

    .line 74
    :cond_49
    invoke-direct {p0, p3}, Lax/l1/a;->C(Ljava/util/List;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    invoke-direct {p0, v0, v1, v4, v5}, Lax/l1/a;->z(JJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0, v0}, Lax/l1/c;->h(I)Lax/P0/v;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_55
    if-ge v3, v2, :cond_8b

    .line 87
    .line 88
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lax/j1/d;

    .line 93
    .line 94
    iget-object v4, v1, Lax/j1/b;->d:Lax/P0/v;

    .line 95
    .line 96
    iget-wide v8, v1, Lax/j1/b;->g:J

    .line 97
    .line 98
    sub-long/2addr v8, p1

    .line 99
    iget v1, p0, Lax/l1/a;->s:F

    .line 100
    .line 101
    invoke-static {v8, v9, v1}, Lax/S0/d0;->n0(JF)J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    cmp-long v1, v8, v6

    .line 106
    .line 107
    if-ltz v1, :cond_88

    .line 108
    .line 109
    iget v1, v4, Lax/P0/v;->j:I

    .line 110
    .line 111
    iget v5, v0, Lax/P0/v;->j:I

    .line 112
    .line 113
    if-ge v1, v5, :cond_88

    .line 114
    .line 115
    iget v1, v4, Lax/P0/v;->w:I

    .line 116
    .line 117
    const/4 v5, -0x1

    .line 118
    if-eq v1, v5, :cond_88

    .line 119
    .line 120
    iget v8, p0, Lax/l1/a;->n:I

    .line 121
    .line 122
    if-gt v1, v8, :cond_88

    .line 123
    .line 124
    iget v4, v4, Lax/P0/v;->v:I

    .line 125
    .line 126
    if-eq v4, v5, :cond_88

    .line 127
    .line 128
    iget v5, p0, Lax/l1/a;->m:I

    .line 129
    .line 130
    if-gt v4, v5, :cond_88

    .line 131
    .line 132
    iget v4, v0, Lax/P0/v;->w:I

    .line 133
    .line 134
    if-ge v1, v4, :cond_88

    .line 135
    .line 136
    return v3

    .line 137
    :cond_88
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_55

    .line 140
    :cond_8b
    :goto_8b
    return v2
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

.method public n()I
    .registers 2

    .line 1
    iget v0, p0, Lax/l1/a;->u:I

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

.method public p(F)V
    .registers 2

    .line 1
    iput p1, p0, Lax/l1/a;->s:F

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

.method public q()Ljava/lang/Object;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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

.method protected y(Lax/P0/v;IJ)Z
    .registers 6

    .line 1
    int-to-long p1, p2

    .line 2
    cmp-long v0, p1, p3

    .line 3
    .line 4
    if-gtz v0, :cond_7

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_7
    const/4 p1, 0x0

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
