.class public final Lax/G1/d;
.super Lax/G1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G1/d$b;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:J

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/G1/d$b;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Z

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:I


# direct methods
.method private constructor <init>(JZZZZJJLjava/util/List;ZJIII)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZZZJJ",
            "Ljava/util/List<",
            "Lax/G1/d$b;",
            ">;ZJIII)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/G1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lax/G1/d;->a:J

    .line 5
    .line 6
    iput-boolean p3, p0, Lax/G1/d;->b:Z

    .line 7
    .line 8
    iput-boolean p4, p0, Lax/G1/d;->c:Z

    .line 9
    .line 10
    iput-boolean p5, p0, Lax/G1/d;->d:Z

    .line 11
    .line 12
    iput-boolean p6, p0, Lax/G1/d;->e:Z

    .line 13
    .line 14
    iput-wide p7, p0, Lax/G1/d;->f:J

    .line 15
    .line 16
    iput-wide p9, p0, Lax/G1/d;->g:J

    .line 17
    .line 18
    invoke-static {p11}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lax/G1/d;->h:Ljava/util/List;

    .line 23
    .line 24
    iput-boolean p12, p0, Lax/G1/d;->i:Z

    .line 25
    .line 26
    iput-wide p13, p0, Lax/G1/d;->j:J

    .line 27
    .line 28
    iput p15, p0, Lax/G1/d;->k:I

    .line 29
    .line 30
    move/from16 p1, p16

    .line 31
    .line 32
    iput p1, p0, Lax/G1/d;->l:I

    .line 33
    .line 34
    move/from16 p1, p17

    .line 35
    .line 36
    iput p1, p0, Lax/G1/d;->m:I

    .line 37
    .line 38
    return-void
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
.end method

.method static d(Lax/S0/G;JLax/S0/M;)Lax/G1/d;
    .registers 29

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->O()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    and-int/lit16 v3, v3, 0x80

    .line 12
    .line 13
    if-eqz v3, :cond_10

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    const/4 v3, 0x0

    .line 18
    :goto_11
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-nez v3, :cond_c4

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    and-int/lit16 v10, v9, 0x80

    .line 32
    .line 33
    if-eqz v10, :cond_24

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    const/4 v10, 0x0

    .line 38
    :goto_25
    and-int/lit8 v11, v9, 0x40

    .line 39
    .line 40
    if-eqz v11, :cond_2b

    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v11, 0x0

    .line 45
    :goto_2c
    and-int/lit8 v12, v9, 0x20

    .line 46
    .line 47
    if-eqz v12, :cond_32

    .line 48
    .line 49
    const/4 v12, 0x1

    .line 50
    goto :goto_33

    .line 51
    :cond_32
    const/4 v12, 0x0

    .line 52
    :goto_33
    and-int/lit8 v9, v9, 0x10

    .line 53
    .line 54
    if-eqz v9, :cond_39

    .line 55
    .line 56
    const/4 v9, 0x1

    .line 57
    goto :goto_3a

    .line 58
    :cond_39
    const/4 v9, 0x0

    .line 59
    :goto_3a
    if-eqz v11, :cond_43

    .line 60
    .line 61
    if-nez v9, :cond_43

    .line 62
    .line 63
    invoke-static/range {p0 .. p2}, Lax/G1/g;->e(Lax/S0/G;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v13

    .line 67
    goto :goto_44

    .line 68
    :cond_43
    move-wide v13, v7

    .line 69
    :goto_44
    if-nez v11, :cond_7c

    .line 70
    .line 71
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    new-instance v15, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    :goto_50
    if-ge v4, v6, :cond_7b

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 84
    .line 85
    .line 86
    move-result v18

    .line 87
    if-nez v9, :cond_61

    .line 88
    .line 89
    invoke-static/range {p0 .. p2}, Lax/G1/g;->e(Lax/S0/G;J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v19

    .line 93
    move/from16 v24, v6

    .line 94
    .line 95
    move-wide/from16 v5, v19

    .line 96
    .line 97
    goto :goto_64

    .line 98
    :cond_61
    move/from16 v24, v6

    .line 99
    .line 100
    move-wide v5, v7

    .line 101
    :goto_64
    new-instance v17, Lax/G1/d$b;

    .line 102
    .line 103
    invoke-virtual {v0, v5, v6}, Lax/S0/M;->b(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v21

    .line 107
    const/16 v23, 0x0

    .line 108
    .line 109
    move-wide/from16 v19, v5

    .line 110
    .line 111
    invoke-direct/range {v17 .. v23}, Lax/G1/d$b;-><init>(IJJLax/G1/d$a;)V

    .line 112
    .line 113
    .line 114
    move-object/from16 v5, v17

    .line 115
    .line 116
    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    move/from16 v6, v24

    .line 122
    .line 123
    goto :goto_50

    .line 124
    :cond_7b
    move-object v6, v15

    .line 125
    :cond_7c
    if-eqz v12, :cond_a7

    .line 126
    .line 127
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    int-to-long v4, v4

    .line 132
    const-wide/16 v7, 0x80

    .line 133
    .line 134
    and-long/2addr v7, v4

    .line 135
    const-wide/16 v17, 0x0

    .line 136
    .line 137
    cmp-long v12, v7, v17

    .line 138
    .line 139
    if-eqz v12, :cond_8f

    .line 140
    .line 141
    const/16 v16, 0x1

    .line 142
    .line 143
    goto :goto_91

    .line 144
    :cond_8f
    const/16 v16, 0x0

    .line 145
    .line 146
    :goto_91
    const-wide/16 v7, 0x1

    .line 147
    .line 148
    and-long/2addr v4, v7

    .line 149
    const/16 v7, 0x20

    .line 150
    .line 151
    shl-long/2addr v4, v7

    .line 152
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->O()J

    .line 153
    .line 154
    .line 155
    move-result-wide v7

    .line 156
    or-long/2addr v4, v7

    .line 157
    const-wide/16 v7, 0x3e8

    .line 158
    .line 159
    mul-long v4, v4, v7

    .line 160
    .line 161
    const-wide/16 v7, 0x5a

    .line 162
    .line 163
    div-long v7, v4, v7

    .line 164
    .line 165
    move/from16 v5, v16

    .line 166
    .line 167
    goto :goto_a8

    .line 168
    :cond_a7
    const/4 v5, 0x0

    .line 169
    :goto_a8
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->U()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    invoke-virtual/range {p0 .. p0}, Lax/S0/G;->M()I

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    move-wide/from16 v16, v13

    .line 182
    .line 183
    move-wide v13, v7

    .line 184
    move-wide/from16 v7, v16

    .line 185
    .line 186
    move/from16 v16, v12

    .line 187
    .line 188
    move/from16 v17, v15

    .line 189
    .line 190
    move v15, v4

    .line 191
    move v12, v5

    .line 192
    move v4, v10

    .line 193
    move v5, v11

    .line 194
    move-object v11, v6

    .line 195
    move v6, v9

    .line 196
    goto :goto_cf

    .line 197
    :cond_c4
    move-object v11, v6

    .line 198
    move-wide v13, v7

    .line 199
    const/4 v4, 0x0

    .line 200
    const/4 v5, 0x0

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v12, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    :goto_cf
    new-instance v9, Lax/G1/d;

    .line 209
    .line 210
    invoke-virtual {v0, v7, v8}, Lax/S0/M;->b(J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v18

    .line 214
    move-object v0, v9

    .line 215
    move-wide/from16 v9, v18

    .line 216
    .line 217
    invoke-direct/range {v0 .. v17}, Lax/G1/d;-><init>(JZZZZJJLjava/util/List;ZJIII)V

    .line 218
    .line 219
    .line 220
    return-object v0
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


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SCTE-35 SpliceInsertCommand { programSplicePts="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Lax/G1/d;->f:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", programSplicePlaybackPositionUs= "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lax/G1/d;->g:J

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " }"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
