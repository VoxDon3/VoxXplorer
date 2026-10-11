.class public Lax/i5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String; = "b"


# instance fields
.field private a:Lax/e5/a;

.field private b:[J

.field private c:[I

.field private d:Lax/i5/j;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
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

.method constructor <init>(Lax/e5/a;Lax/i5/c;Lax/i5/j;)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/i5/b;->a:Lax/e5/a;

    .line 5
    .line 6
    iput-object p3, p0, Lax/i5/b;->d:Lax/i5/j;

    .line 7
    .line 8
    invoke-virtual {p2}, Lax/i5/c;->l()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p3, 0x0

    .line 13
    if-nez p1, :cond_34

    .line 14
    .line 15
    invoke-virtual {p2}, Lax/i5/c;->k()B

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    filled-new-array {p1}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lax/i5/b;->c:[I

    .line 24
    .line 25
    sget-object v0, Lax/i5/b;->e:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "fat is not mirrored, fat "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " is valid"

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    goto :goto_5c

    .line 53
    :cond_34
    invoke-virtual {p2}, Lax/i5/c;->d()B

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    new-array v0, p1, [I

    .line 58
    .line 59
    iput-object v0, p0, Lax/i5/b;->c:[I

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    :goto_3d
    if-ge v0, p1, :cond_46

    .line 63
    .line 64
    iget-object v1, p0, Lax/i5/b;->c:[I

    .line 65
    .line 66
    aput v0, v1, v0

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_3d

    .line 71
    :cond_46
    sget-object v0, Lax/i5/b;->e:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "fat is mirrored, fat count: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :goto_5c
    iget-object p1, p0, Lax/i5/b;->c:[I

    .line 94
    .line 95
    array-length p1, p1

    .line 96
    new-array p1, p1, [J

    .line 97
    .line 98
    iput-object p1, p0, Lax/i5/b;->b:[J

    .line 99
    .line 100
    :goto_63
    iget-object p1, p0, Lax/i5/b;->b:[J

    .line 101
    .line 102
    array-length v0, p1

    .line 103
    if-ge p3, v0, :cond_75

    .line 104
    .line 105
    iget-object v0, p0, Lax/i5/b;->c:[I

    .line 106
    .line 107
    aget v0, v0, p3

    .line 108
    .line 109
    invoke-virtual {p2, v0}, Lax/i5/c;->e(I)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    aput-wide v0, p1, p3

    .line 114
    .line 115
    add-int/lit8 p3, p3, 0x1

    .line 116
    .line 117
    goto :goto_63

    .line 118
    :cond_75
    return-void
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


# virtual methods
.method a([Ljava/lang/Long;I)[Ljava/lang/Long;
    .registers 29
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v4, v1

    .line 10
    add-int/2addr v4, v2

    .line 11
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 22
    .line 23
    invoke-interface {v4}, Lax/e5/a;->d()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    mul-int/lit8 v4, v4, 0x2

    .line 28
    .line 29
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    array-length v6, v1

    .line 39
    if-eqz v6, :cond_32

    .line 40
    .line 41
    array-length v6, v1

    .line 42
    add-int/lit8 v6, v6, -0x1

    .line 43
    .line 44
    aget-object v6, v1, v6

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    goto :goto_34

    .line 51
    :cond_32
    const-wide/16 v9, -0x1

    .line 52
    .line 53
    :goto_34
    iget-object v6, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 54
    .line 55
    invoke-virtual {v6}, Lax/i5/j;->c()J

    .line 56
    .line 57
    .line 58
    move-result-wide v11

    .line 59
    sget v6, Lax/i5/j;->d:I

    .line 60
    .line 61
    int-to-long v13, v6

    .line 62
    cmp-long v6, v11, v13

    .line 63
    .line 64
    if-nez v6, :cond_43

    .line 65
    .line 66
    const-wide/16 v11, 0x2

    .line 67
    .line 68
    :cond_43
    move v6, v2

    .line 69
    const-wide/16 v13, -0x1

    .line 70
    .line 71
    :goto_46
    const-wide/16 v15, 0x4

    .line 72
    .line 73
    const-wide/16 v17, -0x1

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    if-lez v6, :cond_8f

    .line 77
    .line 78
    const-wide/16 v19, 0x1

    .line 79
    .line 80
    add-long v11, v11, v19

    .line 81
    .line 82
    iget-object v8, v0, Lax/i5/b;->b:[J

    .line 83
    .line 84
    aget-wide v7, v8, v7

    .line 85
    .line 86
    mul-long v15, v15, v11

    .line 87
    .line 88
    add-long v19, v7, v15

    .line 89
    .line 90
    move/from16 v21, v6

    .line 91
    .line 92
    move-wide/from16 v22, v7

    .line 93
    .line 94
    int-to-long v6, v4

    .line 95
    div-long v19, v19, v6

    .line 96
    .line 97
    move-wide/from16 v24, v6

    .line 98
    .line 99
    mul-long v6, v19, v24

    .line 100
    .line 101
    add-long v15, v22, v15

    .line 102
    .line 103
    move-wide/from16 v19, v9

    .line 104
    .line 105
    rem-long v8, v15, v24

    .line 106
    .line 107
    cmp-long v10, v13, v6

    .line 108
    .line 109
    if-eqz v10, :cond_77

    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 112
    .line 113
    .line 114
    iget-object v10, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 115
    .line 116
    invoke-interface {v10, v6, v7, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 117
    .line 118
    .line 119
    move-wide v13, v6

    .line 120
    :cond_77
    long-to-int v6, v8

    .line 121
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_8a

    .line 126
    .line 127
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    add-int/lit8 v6, v21, -0x1

    .line 135
    .line 136
    move-wide/from16 v9, v19

    .line 137
    .line 138
    goto :goto_46

    .line 139
    :cond_8a
    move-wide/from16 v9, v19

    .line 140
    .line 141
    move/from16 v6, v21

    .line 142
    .line 143
    goto :goto_46

    .line 144
    :cond_8f
    move-wide/from16 v19, v9

    .line 145
    .line 146
    cmp-long v6, v19, v17

    .line 147
    .line 148
    if-eqz v6, :cond_ca

    .line 149
    .line 150
    iget-object v6, v0, Lax/i5/b;->b:[J

    .line 151
    .line 152
    aget-wide v8, v6, v7

    .line 153
    .line 154
    mul-long v10, v19, v15

    .line 155
    .line 156
    add-long v17, v8, v10

    .line 157
    .line 158
    move-wide/from16 v19, v8

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    int-to-long v7, v4

    .line 162
    div-long v17, v17, v7

    .line 163
    .line 164
    move-wide/from16 v21, v7

    .line 165
    .line 166
    const/4 v9, 0x0

    .line 167
    mul-long v6, v17, v21

    .line 168
    .line 169
    add-long v10, v19, v10

    .line 170
    .line 171
    rem-long v10, v10, v21

    .line 172
    .line 173
    cmp-long v8, v13, v6

    .line 174
    .line 175
    if-eqz v8, :cond_b9

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 178
    .line 179
    .line 180
    iget-object v8, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 181
    .line 182
    invoke-interface {v8, v6, v7, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 183
    .line 184
    .line 185
    move-wide v13, v6

    .line 186
    :cond_b9
    long-to-int v6, v10

    .line 187
    array-length v7, v1

    .line 188
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    check-cast v7, Ljava/lang/Long;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 195
    .line 196
    .line 197
    move-result-wide v7

    .line 198
    long-to-int v8, v7

    .line 199
    invoke-virtual {v5, v6, v8}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    .line 202
    goto :goto_cb

    .line 203
    :cond_ca
    const/4 v9, 0x0

    .line 204
    :goto_cb
    array-length v1, v1

    .line 205
    :goto_cc
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    add-int/lit8 v6, v6, -0x1

    .line 210
    .line 211
    if-ge v1, v6, :cond_119

    .line 212
    .line 213
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    iget-object v8, v0, Lax/i5/b;->b:[J

    .line 224
    .line 225
    aget-wide v10, v8, v9

    .line 226
    .line 227
    mul-long v6, v6, v15

    .line 228
    .line 229
    add-long v17, v10, v6

    .line 230
    .line 231
    move-wide/from16 v19, v10

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    int-to-long v9, v4

    .line 235
    div-long v17, v17, v9

    .line 236
    .line 237
    mul-long v11, v17, v9

    .line 238
    .line 239
    add-long v6, v19, v6

    .line 240
    .line 241
    rem-long/2addr v6, v9

    .line 242
    cmp-long v9, v13, v11

    .line 243
    .line 244
    if-eqz v9, :cond_106

    .line 245
    .line 246
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 247
    .line 248
    .line 249
    iget-object v9, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 250
    .line 251
    invoke-interface {v9, v13, v14, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 255
    .line 256
    .line 257
    iget-object v9, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 258
    .line 259
    invoke-interface {v9, v11, v12, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 260
    .line 261
    .line 262
    move-wide v13, v11

    .line 263
    :cond_106
    long-to-int v7, v6

    .line 264
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    check-cast v6, Ljava/lang/Long;

    .line 271
    .line 272
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 273
    .line 274
    .line 275
    move-result-wide v9

    .line 276
    long-to-int v6, v9

    .line 277
    invoke-virtual {v5, v7, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 278
    .line 279
    .line 280
    const/4 v9, 0x0

    .line 281
    goto :goto_cc

    .line 282
    :cond_119
    const/4 v8, 0x0

    .line 283
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    add-int/lit8 v1, v1, -0x1

    .line 288
    .line 289
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, Ljava/lang/Long;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    iget-object v1, v0, Lax/i5/b;->b:[J

    .line 300
    .line 301
    aget-wide v9, v1, v8

    .line 302
    .line 303
    mul-long v15, v15, v6

    .line 304
    .line 305
    add-long v11, v9, v15

    .line 306
    .line 307
    move-wide/from16 v17, v9

    .line 308
    .line 309
    int-to-long v8, v4

    .line 310
    div-long/2addr v11, v8

    .line 311
    mul-long v11, v11, v8

    .line 312
    .line 313
    add-long v15, v17, v15

    .line 314
    .line 315
    rem-long v8, v15, v8

    .line 316
    .line 317
    cmp-long v1, v13, v11

    .line 318
    .line 319
    if-eqz v1, :cond_150

    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 322
    .line 323
    .line 324
    iget-object v1, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 325
    .line 326
    invoke-interface {v1, v13, v14, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 330
    .line 331
    .line 332
    iget-object v1, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 333
    .line 334
    invoke-interface {v1, v11, v12, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 335
    .line 336
    .line 337
    :cond_150
    long-to-int v1, v8

    .line 338
    const v4, 0xffffff8

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, v1, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 345
    .line 346
    .line 347
    iget-object v1, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 348
    .line 349
    invoke-interface {v1, v11, v12, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 350
    .line 351
    .line 352
    iget-object v1, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 353
    .line 354
    invoke-virtual {v1, v6, v7}, Lax/i5/j;->f(J)V

    .line 355
    .line 356
    .line 357
    iget-object v1, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 358
    .line 359
    int-to-long v4, v2

    .line 360
    invoke-virtual {v1, v4, v5}, Lax/i5/j;->a(J)V

    .line 361
    .line 362
    .line 363
    iget-object v1, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 364
    .line 365
    invoke-virtual {v1}, Lax/i5/j;->g()V

    .line 366
    .line 367
    .line 368
    sget-object v1, Lax/i5/b;->e:Ljava/lang/String;

    .line 369
    .line 370
    const-string v2, "allocating clusters finished"

    .line 371
    .line 372
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    const/4 v6, 0x0

    .line 376
    new-array v1, v6, [Ljava/lang/Long;

    .line 377
    .line 378
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, [Ljava/lang/Long;

    .line 383
    .line 384
    return-object v1
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

.method b([Ljava/lang/Long;I)[Ljava/lang/Long;
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    sub-int/2addr v3, v2

    .line 9
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 10
    .line 11
    invoke-interface {v4}, Lax/e5/a;->d()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    mul-int/lit8 v4, v4, 0x2

    .line 16
    .line 17
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    if-ltz v3, :cond_d2

    .line 27
    .line 28
    move v8, v3

    .line 29
    const-wide/16 v9, -0x1

    .line 30
    .line 31
    :goto_1e
    array-length v11, v1

    .line 32
    const-wide/16 v12, 0x4

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    if-ge v8, v11, :cond_5c

    .line 36
    .line 37
    aget-object v11, v1, v8

    .line 38
    .line 39
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v15

    .line 43
    iget-object v11, v0, Lax/i5/b;->b:[J

    .line 44
    .line 45
    aget-wide v17, v11, v14

    .line 46
    .line 47
    mul-long v15, v15, v12

    .line 48
    .line 49
    add-long v11, v17, v15

    .line 50
    .line 51
    const-wide/16 v19, -0x1

    .line 52
    .line 53
    int-to-long v6, v4

    .line 54
    div-long/2addr v11, v6

    .line 55
    mul-long v11, v11, v6

    .line 56
    .line 57
    add-long v17, v17, v15

    .line 58
    .line 59
    rem-long v6, v17, v6

    .line 60
    .line 61
    cmp-long v13, v9, v11

    .line 62
    .line 63
    if-eqz v13, :cond_55

    .line 64
    .line 65
    cmp-long v13, v9, v19

    .line 66
    .line 67
    if-eqz v13, :cond_4c

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    iget-object v13, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 73
    .line 74
    invoke-interface {v13, v9, v10, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 78
    .line 79
    .line 80
    iget-object v9, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 81
    .line 82
    invoke-interface {v9, v11, v12, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 83
    .line 84
    .line 85
    move-wide v9, v11

    .line 86
    :cond_55
    long-to-int v7, v6

    .line 87
    invoke-virtual {v5, v7, v14}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    goto :goto_1e

    .line 93
    :cond_5c
    if-lez v3, :cond_9b

    .line 94
    .line 95
    add-int/lit8 v6, v3, -0x1

    .line 96
    .line 97
    aget-object v6, v1, v6

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    iget-object v8, v0, Lax/i5/b;->b:[J

    .line 104
    .line 105
    aget-wide v15, v8, v14

    .line 106
    .line 107
    mul-long v6, v6, v12

    .line 108
    .line 109
    add-long v11, v15, v6

    .line 110
    .line 111
    move-wide/from16 v17, v15

    .line 112
    .line 113
    int-to-long v14, v4

    .line 114
    div-long/2addr v11, v14

    .line 115
    mul-long v11, v11, v14

    .line 116
    .line 117
    add-long v6, v17, v6

    .line 118
    .line 119
    rem-long/2addr v6, v14

    .line 120
    cmp-long v4, v9, v11

    .line 121
    .line 122
    if-eqz v4, :cond_8b

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 125
    .line 126
    .line 127
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 128
    .line 129
    invoke-interface {v4, v9, v10, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 133
    .line 134
    .line 135
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 136
    .line 137
    invoke-interface {v4, v11, v12, v5}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 138
    .line 139
    .line 140
    :cond_8b
    long-to-int v4, v6

    .line 141
    const v6, 0xffffff8

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v4, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 148
    .line 149
    .line 150
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 151
    .line 152
    invoke-interface {v4, v11, v12, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 153
    .line 154
    .line 155
    goto :goto_a3

    .line 156
    :cond_9b
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 157
    .line 158
    .line 159
    iget-object v4, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 160
    .line 161
    invoke-interface {v4, v9, v10, v5}, Lax/e5/a;->l(JLjava/nio/ByteBuffer;)V

    .line 162
    .line 163
    .line 164
    :goto_a3
    sget-object v4, Lax/i5/b;->e:Ljava/lang/String;

    .line 165
    .line 166
    new-instance v5, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v6, "freed "

    .line 172
    .line 173
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v6, " clusters"

    .line 180
    .line 181
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    iget-object v4, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 192
    .line 193
    neg-int v2, v2

    .line 194
    int-to-long v5, v2

    .line 195
    invoke-virtual {v4, v5, v6}, Lax/i5/j;->a(J)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v0, Lax/i5/b;->d:Lax/i5/j;

    .line 199
    .line 200
    invoke-virtual {v2}, Lax/i5/j;->g()V

    .line 201
    .line 202
    .line 203
    const/4 v8, 0x0

    .line 204
    invoke-static {v1, v8, v3}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, [Ljava/lang/Long;

    .line 209
    .line 210
    return-object v1

    .line 211
    :cond_d2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 212
    .line 213
    const-string v2, "trying to remove more clusters in chain than currently exist!"

    .line 214
    .line 215
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v1
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

.method c(JJ)[Ljava/lang/Long;
    .registers 32
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    const-string v5, ":"

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v9, v1, v7

    .line 13
    .line 14
    if-nez v9, :cond_12

    .line 15
    .line 16
    new-array v1, v6, [Ljava/lang/Long;

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_12
    new-instance v9, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v10, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 25
    .line 26
    invoke-interface {v10}, Lax/e5/a;->d()I

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    mul-int/lit8 v10, v10, 0x2

    .line 31
    .line 32
    invoke-static {v10}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 37
    .line 38
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    const-wide/16 v12, -0x1

    .line 42
    .line 43
    move-wide v14, v1

    .line 44
    move-wide/from16 v16, v7

    .line 45
    .line 46
    :goto_2d
    iget-object v7, v0, Lax/i5/b;->b:[J

    .line 47
    .line 48
    array-length v7, v7

    .line 49
    if-eqz v7, :cond_e7

    .line 50
    .line 51
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iget-object v7, v0, Lax/i5/b;->b:[J

    .line 59
    .line 60
    aget-wide v18, v7, v6

    .line 61
    .line 62
    const-wide/16 v7, 0x4

    .line 63
    .line 64
    mul-long v7, v7, v14

    .line 65
    .line 66
    add-long v20, v18, v7

    .line 67
    .line 68
    move-wide/from16 v23, v7

    .line 69
    .line 70
    int-to-long v6, v10

    .line 71
    div-long v20, v20, v6

    .line 72
    .line 73
    move-wide/from16 v25, v6

    .line 74
    .line 75
    mul-long v6, v20, v25

    .line 76
    .line 77
    add-long v18, v18, v23

    .line 78
    .line 79
    move-wide/from16 v20, v12

    .line 80
    .line 81
    rem-long v12, v18, v25

    .line 82
    .line 83
    cmp-long v8, v20, v6

    .line 84
    .line 85
    if-eqz v8, :cond_60

    .line 86
    .line 87
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 88
    .line 89
    .line 90
    iget-object v8, v0, Lax/i5/b;->a:Lax/e5/a;

    .line 91
    .line 92
    invoke-interface {v8, v6, v7, v11}, Lax/e5/a;->i(JLjava/nio/ByteBuffer;)V

    .line 93
    .line 94
    .line 95
    move-wide/from16 v20, v6

    .line 96
    .line 97
    :cond_60
    long-to-int v6, v12

    .line 98
    :try_start_61
    invoke-virtual {v11, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 99
    .line 100
    .line 101
    move-result v6
    :try_end_65
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_61 .. :try_end_65} :catch_b2

    .line 102
    int-to-long v6, v6

    .line 103
    const-wide v12, 0xffffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    and-long v14, v6, v12

    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    int-to-long v6, v6

    .line 115
    mul-long v6, v6, v3

    .line 116
    .line 117
    cmp-long v8, v6, v12

    .line 118
    .line 119
    if-gtz v8, :cond_91

    .line 120
    .line 121
    cmp-long v8, v6, v16

    .line 122
    .line 123
    if-ltz v8, :cond_91

    .line 124
    .line 125
    const-wide/32 v6, 0xffffff8

    .line 126
    .line 127
    .line 128
    cmp-long v8, v14, v6

    .line 129
    .line 130
    if-ltz v8, :cond_8d

    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    new-array v1, v6, [Ljava/lang/Long;

    .line 134
    .line 135
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, [Ljava/lang/Long;

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_8d
    move-wide/from16 v12, v20

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    goto :goto_2d

    .line 146
    :cond_91
    new-instance v1, Lcom/github/mjdev/libaums/a;

    .line 147
    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v6, "Too large cluster size : len : "

    .line 154
    .line 155
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-direct {v1, v2}, Lcom/github/mjdev/libaums/a;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v1

    .line 179
    :catch_b2
    new-instance v3, Ljava/io/IOException;

    .line 180
    .line 181
    new-instance v4, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v6, "IndexOutOfBoundsException: "

    .line 187
    .line 188
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget-object v6, v0, Lax/i5/b;->b:[J

    .line 204
    .line 205
    const/16 v22, 0x0

    .line 206
    .line 207
    aget-wide v7, v6, v22

    .line 208
    .line 209
    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v3

    .line 232
    :cond_e7
    new-instance v1, Ljava/io/IOException;

    .line 233
    .line 234
    const-string v2, "IndexOutOfBoundsException: fatOffset length 0"

    .line 235
    .line 236
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1
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
