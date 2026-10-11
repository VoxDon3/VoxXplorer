.class public final Lax/q1/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:F

.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:Lax/T0/h$k;


# direct methods
.method private constructor <init>(Ljava/util/List;IIIIIIIIIIIIFILjava/lang/String;Lax/T0/h$k;)V
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;IIIIIIIIIIIIFI",
            "Ljava/lang/String;",
            "Lax/T0/h$k;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/q1/G;->a:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Lax/q1/G;->b:I

    .line 7
    .line 8
    iput p3, p0, Lax/q1/G;->c:I

    .line 9
    .line 10
    iput p4, p0, Lax/q1/G;->d:I

    .line 11
    .line 12
    iput p5, p0, Lax/q1/G;->e:I

    .line 13
    .line 14
    iput p6, p0, Lax/q1/G;->f:I

    .line 15
    .line 16
    iput p7, p0, Lax/q1/G;->g:I

    .line 17
    .line 18
    iput p8, p0, Lax/q1/G;->h:I

    .line 19
    .line 20
    iput p9, p0, Lax/q1/G;->i:I

    .line 21
    .line 22
    iput p10, p0, Lax/q1/G;->j:I

    .line 23
    .line 24
    iput p11, p0, Lax/q1/G;->k:I

    .line 25
    .line 26
    iput p12, p0, Lax/q1/G;->l:I

    .line 27
    .line 28
    iput p13, p0, Lax/q1/G;->m:I

    .line 29
    .line 30
    iput p14, p0, Lax/q1/G;->n:F

    .line 31
    .line 32
    iput p15, p0, Lax/q1/G;->o:I

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lax/q1/G;->p:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lax/q1/G;->q:Lax/T0/h$k;

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
.end method

.method public static a(Lax/S0/G;)Lax/q1/G;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, Lax/q1/G;->b(Lax/S0/G;ZLax/T0/h$k;)Lax/q1/G;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static b(Lax/S0/G;ZLax/T0/h$k;)Lax/q1/G;
    .registers 41
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    :try_start_5
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_11

    .line 10
    :catch_9
    move-exception v0

    .line 11
    goto/16 :goto_169

    .line 12
    .line 13
    :cond_c
    const/16 v2, 0x15

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lax/S0/G;->c0(I)V

    .line 16
    .line 17
    .line 18
    :goto_11
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    and-int/lit8 v2, v2, 0x3

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    :goto_22
    const/4 v8, 0x1

    .line 36
    if-ge v6, v3, :cond_3f

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Lax/S0/G;->c0(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const/4 v9, 0x0

    .line 46
    :goto_2d
    if-ge v9, v8, :cond_3c

    .line 47
    .line 48
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    add-int/lit8 v11, v10, 0x4

    .line 53
    .line 54
    add-int/2addr v7, v11

    .line 55
    invoke-virtual {v0, v10}, Lax/S0/G;->c0(I)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v9, v9, 0x1

    .line 59
    .line 60
    goto :goto_2d

    .line 61
    :cond_3c
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_22

    .line 64
    :cond_3f
    invoke-virtual {v0, v4}, Lax/S0/G;->b0(I)V

    .line 65
    .line 66
    .line 67
    new-array v4, v7, [B

    .line 68
    .line 69
    const/4 v6, -0x1

    .line 70
    const/high16 v9, 0x3f800000    # 1.0f

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    move-object/from16 v28, p2

    .line 74
    .line 75
    move-object/from16 v27, v10

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v14, -0x1

    .line 80
    const/4 v15, -0x1

    .line 81
    const/16 v16, -0x1

    .line 82
    .line 83
    const/16 v17, -0x1

    .line 84
    .line 85
    const/16 v18, -0x1

    .line 86
    .line 87
    const/16 v19, -0x1

    .line 88
    .line 89
    const/16 v20, -0x1

    .line 90
    .line 91
    const/16 v21, -0x1

    .line 92
    .line 93
    const/16 v22, -0x1

    .line 94
    .line 95
    const/16 v23, -0x1

    .line 96
    .line 97
    const/16 v24, -0x1

    .line 98
    .line 99
    const/high16 v25, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/16 v26, -0x1

    .line 102
    .line 103
    :goto_66
    if-ge v6, v3, :cond_152

    .line 104
    .line 105
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    and-int/lit8 v10, v10, 0x3f

    .line 110
    .line 111
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    move-object/from16 v12, v28

    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    :goto_75
    if-ge v13, v11, :cond_144

    .line 119
    .line 120
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/16 v29, 0x1

    .line 125
    .line 126
    sget-object v8, Lax/T0/h;->a:[B

    .line 127
    .line 128
    move/from16 v30, v2

    .line 129
    .line 130
    array-length v2, v8

    .line 131
    invoke-static {v8, v5, v4, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    .line 133
    .line 134
    array-length v2, v8

    .line 135
    add-int/2addr v9, v2

    .line 136
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-static {v2, v8, v4, v9, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    const/16 v2, 0x20

    .line 148
    .line 149
    if-ne v10, v2, :cond_a2

    .line 150
    .line 151
    if-nez v13, :cond_a2

    .line 152
    .line 153
    add-int v2, v9, v1

    .line 154
    .line 155
    invoke-static {v4, v9, v2}, Lax/T0/h;->y([BII)Lax/T0/h$k;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    move/from16 v31, v3

    .line 160
    .line 161
    goto/16 :goto_136

    .line 162
    .line 163
    :cond_a2
    const/16 v2, 0x21

    .line 164
    .line 165
    if-ne v10, v2, :cond_10f

    .line 166
    .line 167
    if-nez v13, :cond_10f

    .line 168
    .line 169
    add-int v2, v9, v1

    .line 170
    .line 171
    invoke-static {v4, v9, v2, v12}, Lax/T0/h;->u([BIILax/T0/h$k;)Lax/T0/h$h;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget v8, v2, Lax/T0/h$h;->b:I

    .line 176
    .line 177
    add-int/lit8 v14, v8, 0x1

    .line 178
    .line 179
    iget v15, v2, Lax/T0/h$h;->h:I

    .line 180
    .line 181
    iget v8, v2, Lax/T0/h$h;->i:I

    .line 182
    .line 183
    iget v5, v2, Lax/T0/h$h;->j:I

    .line 184
    .line 185
    move/from16 v31, v3

    .line 186
    .line 187
    iget v3, v2, Lax/T0/h$h;->k:I

    .line 188
    .line 189
    move/from16 v16, v3

    .line 190
    .line 191
    iget v3, v2, Lax/T0/h$h;->e:I

    .line 192
    .line 193
    add-int/lit8 v19, v3, 0x8

    .line 194
    .line 195
    iget v3, v2, Lax/T0/h$h;->f:I

    .line 196
    .line 197
    add-int/lit8 v20, v3, 0x8

    .line 198
    .line 199
    iget v3, v2, Lax/T0/h$h;->n:I

    .line 200
    .line 201
    move/from16 v17, v3

    .line 202
    .line 203
    iget v3, v2, Lax/T0/h$h;->o:I

    .line 204
    .line 205
    move/from16 v18, v3

    .line 206
    .line 207
    iget v3, v2, Lax/T0/h$h;->p:I

    .line 208
    .line 209
    move/from16 v21, v3

    .line 210
    .line 211
    iget v3, v2, Lax/T0/h$h;->l:F

    .line 212
    .line 213
    move/from16 v22, v3

    .line 214
    .line 215
    iget v3, v2, Lax/T0/h$h;->m:I

    .line 216
    .line 217
    iget-object v2, v2, Lax/T0/h$h;->c:Lax/T0/h$c;

    .line 218
    .line 219
    if-eqz v2, :cond_fb

    .line 220
    .line 221
    move/from16 v23, v3

    .line 222
    .line 223
    iget v3, v2, Lax/T0/h$c;->a:I

    .line 224
    .line 225
    move/from16 v32, v3

    .line 226
    .line 227
    iget-boolean v3, v2, Lax/T0/h$c;->b:Z

    .line 228
    .line 229
    move/from16 v33, v3

    .line 230
    .line 231
    iget v3, v2, Lax/T0/h$c;->c:I

    .line 232
    .line 233
    move/from16 v34, v3

    .line 234
    .line 235
    iget v3, v2, Lax/T0/h$c;->d:I

    .line 236
    .line 237
    move/from16 v35, v3

    .line 238
    .line 239
    iget-object v3, v2, Lax/T0/h$c;->e:[I

    .line 240
    .line 241
    iget v2, v2, Lax/T0/h$c;->f:I

    .line 242
    .line 243
    move/from16 v37, v2

    .line 244
    .line 245
    move-object/from16 v36, v3

    .line 246
    .line 247
    invoke-static/range {v32 .. v37}, Lax/S0/i;->h(IZII[II)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v27

    .line 251
    goto :goto_fd

    .line 252
    :cond_fb
    move/from16 v23, v3

    .line 253
    .line 254
    :goto_fd
    move/from16 v25, v22

    .line 255
    .line 256
    move/from16 v26, v23

    .line 257
    .line 258
    move/from16 v22, v18

    .line 259
    .line 260
    move/from16 v23, v21

    .line 261
    .line 262
    move/from16 v18, v16

    .line 263
    .line 264
    move/from16 v21, v17

    .line 265
    .line 266
    move/from16 v17, v5

    .line 267
    .line 268
    move/from16 v16, v8

    .line 269
    .line 270
    :cond_10d
    const/4 v5, 0x0

    .line 271
    goto :goto_136

    .line 272
    :cond_10f
    move/from16 v31, v3

    .line 273
    .line 274
    const/16 v2, 0x27

    .line 275
    .line 276
    if-ne v10, v2, :cond_10d

    .line 277
    .line 278
    if-nez v13, :cond_10d

    .line 279
    .line 280
    add-int v2, v9, v1

    .line 281
    .line 282
    invoke-static {v4, v9, v2}, Lax/T0/h;->t([BII)Lax/T0/h$g;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-eqz v2, :cond_10d

    .line 287
    .line 288
    if-eqz v12, :cond_10d

    .line 289
    .line 290
    iget v2, v2, Lax/T0/h$g;->d:I

    .line 291
    .line 292
    iget-object v3, v12, Lax/T0/h$k;->b:Lax/r7/z;

    .line 293
    .line 294
    const/4 v5, 0x0

    .line 295
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v3, Lax/T0/h$a;

    .line 300
    .line 301
    iget v3, v3, Lax/T0/h$a;->b:I

    .line 302
    .line 303
    if-ne v2, v3, :cond_133

    .line 304
    .line 305
    const/16 v24, 0x4

    .line 306
    .line 307
    goto :goto_136

    .line 308
    :cond_133
    const/4 v2, 0x5

    .line 309
    const/16 v24, 0x5

    .line 310
    .line 311
    :goto_136
    add-int/2addr v9, v1

    .line 312
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 313
    .line 314
    .line 315
    add-int/lit8 v13, v13, 0x1

    .line 316
    .line 317
    move/from16 v2, v30

    .line 318
    .line 319
    move/from16 v3, v31

    .line 320
    .line 321
    const/4 v1, 0x4

    .line 322
    const/4 v8, 0x1

    .line 323
    goto/16 :goto_75

    .line 324
    .line 325
    :cond_144
    move/from16 v30, v2

    .line 326
    .line 327
    move/from16 v31, v3

    .line 328
    .line 329
    const/16 v29, 0x1

    .line 330
    .line 331
    add-int/lit8 v6, v6, 0x1

    .line 332
    .line 333
    move-object/from16 v28, v12

    .line 334
    .line 335
    const/4 v1, 0x4

    .line 336
    const/4 v8, 0x1

    .line 337
    goto/16 :goto_66

    .line 338
    .line 339
    :cond_152
    move/from16 v30, v2

    .line 340
    .line 341
    const/16 v29, 0x1

    .line 342
    .line 343
    if-nez v7, :cond_15c

    .line 344
    .line 345
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 346
    .line 347
    :goto_15a
    move-object v12, v0

    .line 348
    goto :goto_161

    .line 349
    :cond_15c
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    goto :goto_15a

    .line 354
    :goto_161
    new-instance v11, Lax/q1/G;

    .line 355
    .line 356
    add-int/lit8 v13, v30, 0x1

    .line 357
    .line 358
    invoke-direct/range {v11 .. v28}, Lax/q1/G;-><init>(Ljava/util/List;IIIIIIIIIIIIFILjava/lang/String;Lax/T0/h$k;)V
    :try_end_168
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_168} :catch_9

    .line 359
    .line 360
    .line 361
    return-object v11

    .line 362
    :goto_169
    new-instance v1, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const-string v2, "Error parsing"

    .line 368
    .line 369
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    if-eqz p1, :cond_178

    .line 373
    .line 374
    const-string v2, "L-HEVC config"

    .line 375
    .line 376
    goto :goto_17a

    .line 377
    :cond_178
    const-string v2, "HEVC config"

    .line 378
    .line 379
    :goto_17a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-static {v1, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    throw v0
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

.method public static c(Lax/S0/G;Lax/T0/h$k;)Lax/q1/G;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0, p1}, Lax/q1/G;->b(Lax/S0/G;ZLax/T0/h$k;)Lax/q1/G;

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
