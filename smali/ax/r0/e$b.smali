.class final Lax/r0/e$b;
.super Lax/r0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Z

.field private final b:[B

.field private c:I

.field private final d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Z)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e;-><init>(Lax/r0/e$a;)V

    .line 3
    .line 4
    .line 5
    iput-boolean p2, p0, Lax/r0/e$b;->a:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iput-object p2, p0, Lax/r0/e$b;->b:[B

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/2addr p2, v0

    .line 22
    iput p2, p0, Lax/r0/e$b;->c:I

    .line 23
    .line 24
    iput p2, p0, Lax/r0/e$b;->d:I

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/2addr p2, p1

    .line 35
    iput p2, p0, Lax/r0/e$b;->e:I

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private R()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->e:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method private S()B
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->e:I

    .line 4
    .line 5
    if-eq v0, v1, :cond_f

    .line 6
    .line 7
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iput v2, p0, Lax/r0/e$b;->c:I

    .line 12
    .line 13
    aget-byte v0, v1, v0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_f
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0
    .line 21
.end method

.method private T(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/r0/u0$b;",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/r0/p;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/r0/e$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_a0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string p2, "unsupported field type."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_13
    invoke-virtual {p0}, Lax/r0/e$b;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_1c
    invoke-virtual {p0}, Lax/r0/e$b;->p()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_25
    invoke-virtual {p0}, Lax/r0/e$b;->O()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_2a
    invoke-virtual {p0}, Lax/r0/e$b;->A()J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :pswitch_33
    invoke-virtual {p0}, Lax/r0/e$b;->z()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_3c
    invoke-virtual {p0}, Lax/r0/e$b;->n()J

    .line 62
    .line 63
    .line 64
    move-result-wide p1

    .line 65
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_45
    invoke-virtual {p0}, Lax/r0/e$b;->K()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :pswitch_4e
    invoke-virtual {p0, p2, p3}, Lax/r0/e$b;->x(Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :pswitch_53
    invoke-virtual {p0}, Lax/r0/e$b;->N()J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_5c
    invoke-virtual {p0}, Lax/r0/e$b;->I()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :pswitch_65
    invoke-virtual {p0}, Lax/r0/e$b;->readFloat()F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :pswitch_6e
    invoke-virtual {p0}, Lax/r0/e$b;->e()J

    .line 112
    .line 113
    .line 114
    move-result-wide p1

    .line 115
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :pswitch_77
    invoke-virtual {p0}, Lax/r0/e$b;->k()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :pswitch_80
    invoke-virtual {p0}, Lax/r0/e$b;->w()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :pswitch_89
    invoke-virtual {p0}, Lax/r0/e$b;->readDouble()D

    .line 139
    .line 140
    .line 141
    move-result-wide p1

    .line 142
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :pswitch_92
    invoke-virtual {p0}, Lax/r0/e$b;->G()Lax/r0/h;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_97
    invoke-virtual {p0}, Lax/r0/e$b;->m()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :pswitch_data_a0
    .packed-switch 0x1
        :pswitch_97
        :pswitch_92
        :pswitch_89
        :pswitch_80
        :pswitch_77
        :pswitch_6e
        :pswitch_65
        :pswitch_5c
        :pswitch_53
        :pswitch_4e
        :pswitch_45
        :pswitch_3c
        :pswitch_33
        :pswitch_2a
        :pswitch_25
        :pswitch_1c
        :pswitch_13
    .end packed-switch
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

.method private U(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->g:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->f:I

    .line 4
    .line 5
    invoke-static {v1}, Lax/r0/u0;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-static {v1, v2}, Lax/r0/u0;->c(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, p0, Lax/r0/e$b;->g:I

    .line 15
    .line 16
    :try_start_f
    invoke-interface {p1}, Lax/r0/h0;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p1, v1, p0, p2}, Lax/r0/h0;->h(Ljava/lang/Object;Lax/r0/g0;Lax/r0/p;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v1}, Lax/r0/h0;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 27
    .line 28
    iget p2, p0, Lax/r0/e$b;->g:I
    :try_end_1d
    .catchall {:try_start_f .. :try_end_1d} :catchall_27

    .line 29
    .line 30
    if-ne p1, p2, :cond_22

    .line 31
    .line 32
    iput v0, p0, Lax/r0/e$b;->g:I

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_22
    :try_start_22
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    throw p1
    :try_end_27
    .catchall {:try_start_22 .. :try_end_27} :catchall_27

    .line 40
    :catchall_27
    move-exception p1

    .line 41
    iput v0, p0, Lax/r0/e$b;->g:I

    .line 42
    .line 43
    throw p1
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

.method private V()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->f0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method private W()I
    .registers 5

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x4

    .line 6
    .line 7
    iput v2, p0, Lax/r0/e$b;->c:I

    .line 8
    .line 9
    aget-byte v2, v1, v0

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    add-int/lit8 v3, v0, 0x1

    .line 14
    .line 15
    aget-byte v3, v1, v3

    .line 16
    .line 17
    and-int/lit16 v3, v3, 0xff

    .line 18
    .line 19
    shl-int/lit8 v3, v3, 0x8

    .line 20
    .line 21
    or-int/2addr v2, v3

    .line 22
    add-int/lit8 v3, v0, 0x2

    .line 23
    .line 24
    aget-byte v3, v1, v3

    .line 25
    .line 26
    and-int/lit16 v3, v3, 0xff

    .line 27
    .line 28
    shl-int/lit8 v3, v3, 0x10

    .line 29
    .line 30
    or-int/2addr v2, v3

    .line 31
    add-int/lit8 v0, v0, 0x3

    .line 32
    .line 33
    aget-byte v0, v1, v0

    .line 34
    .line 35
    and-int/lit16 v0, v0, 0xff

    .line 36
    .line 37
    shl-int/lit8 v0, v0, 0x18

    .line 38
    .line 39
    or-int/2addr v0, v2

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

.method private X()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/r0/e$b;->f0(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method private Y()J
    .registers 10

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x8

    .line 6
    .line 7
    iput v2, p0, Lax/r0/e$b;->c:I

    .line 8
    .line 9
    aget-byte v2, v1, v0

    .line 10
    .line 11
    int-to-long v2, v2

    .line 12
    const-wide/16 v4, 0xff

    .line 13
    .line 14
    and-long/2addr v2, v4

    .line 15
    add-int/lit8 v6, v0, 0x1

    .line 16
    .line 17
    aget-byte v6, v1, v6

    .line 18
    .line 19
    int-to-long v6, v6

    .line 20
    and-long/2addr v6, v4

    .line 21
    const/16 v8, 0x8

    .line 22
    .line 23
    shl-long/2addr v6, v8

    .line 24
    or-long/2addr v2, v6

    .line 25
    add-int/lit8 v6, v0, 0x2

    .line 26
    .line 27
    aget-byte v6, v1, v6

    .line 28
    .line 29
    int-to-long v6, v6

    .line 30
    and-long/2addr v6, v4

    .line 31
    const/16 v8, 0x10

    .line 32
    .line 33
    shl-long/2addr v6, v8

    .line 34
    or-long/2addr v2, v6

    .line 35
    add-int/lit8 v6, v0, 0x3

    .line 36
    .line 37
    aget-byte v6, v1, v6

    .line 38
    .line 39
    int-to-long v6, v6

    .line 40
    and-long/2addr v6, v4

    .line 41
    const/16 v8, 0x18

    .line 42
    .line 43
    shl-long/2addr v6, v8

    .line 44
    or-long/2addr v2, v6

    .line 45
    add-int/lit8 v6, v0, 0x4

    .line 46
    .line 47
    aget-byte v6, v1, v6

    .line 48
    .line 49
    int-to-long v6, v6

    .line 50
    and-long/2addr v6, v4

    .line 51
    const/16 v8, 0x20

    .line 52
    .line 53
    shl-long/2addr v6, v8

    .line 54
    or-long/2addr v2, v6

    .line 55
    add-int/lit8 v6, v0, 0x5

    .line 56
    .line 57
    aget-byte v6, v1, v6

    .line 58
    .line 59
    int-to-long v6, v6

    .line 60
    and-long/2addr v6, v4

    .line 61
    const/16 v8, 0x28

    .line 62
    .line 63
    shl-long/2addr v6, v8

    .line 64
    or-long/2addr v2, v6

    .line 65
    add-int/lit8 v6, v0, 0x6

    .line 66
    .line 67
    aget-byte v6, v1, v6

    .line 68
    .line 69
    int-to-long v6, v6

    .line 70
    and-long/2addr v6, v4

    .line 71
    const/16 v8, 0x30

    .line 72
    .line 73
    shl-long/2addr v6, v8

    .line 74
    or-long/2addr v2, v6

    .line 75
    add-int/lit8 v0, v0, 0x7

    .line 76
    .line 77
    aget-byte v0, v1, v0

    .line 78
    .line 79
    int-to-long v0, v0

    .line 80
    and-long/2addr v0, v4

    .line 81
    const/16 v4, 0x38

    .line 82
    .line 83
    shl-long/2addr v0, v4

    .line 84
    or-long/2addr v0, v2

    .line 85
    return-wide v0
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

.method private Z(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lax/r0/e$b;->f0(I)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lax/r0/e$b;->e:I

    .line 9
    .line 10
    iget v2, p0, Lax/r0/e$b;->c:I

    .line 11
    .line 12
    add-int/2addr v2, v0

    .line 13
    iput v2, p0, Lax/r0/e$b;->e:I

    .line 14
    .line 15
    :try_start_e
    invoke-interface {p1}, Lax/r0/h0;->g()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0, p0, p2}, Lax/r0/h0;->h(Ljava/lang/Object;Lax/r0/g0;Lax/r0/p;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lax/r0/h0;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lax/r0/e$b;->c:I
    :try_end_1a
    .catchall {:try_start_e .. :try_end_1a} :catchall_24

    .line 26
    .line 27
    if-ne p1, v2, :cond_1f

    .line 28
    .line 29
    iput v1, p0, Lax/r0/e$b;->e:I

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1f
    :try_start_1f
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    throw p1
    :try_end_24
    .catchall {:try_start_1f .. :try_end_24} :catchall_24

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    iput v1, p0, Lax/r0/e$b;->e:I

    .line 39
    .line 40
    throw p1
    .line 41
.end method

.method private c0()I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->e:I

    .line 4
    .line 5
    if-eq v1, v0, :cond_7f

    .line 6
    .line 7
    iget-object v2, p0, Lax/r0/e$b;->b:[B

    .line 8
    .line 9
    add-int/lit8 v3, v0, 0x1

    .line 10
    .line 11
    aget-byte v4, v2, v0

    .line 12
    .line 13
    if-ltz v4, :cond_11

    .line 14
    .line 15
    iput v3, p0, Lax/r0/e$b;->c:I

    .line 16
    .line 17
    return v4

    .line 18
    :cond_11
    sub-int/2addr v1, v3

    .line 19
    const/16 v5, 0x9

    .line 20
    .line 21
    if-ge v1, v5, :cond_1c

    .line 22
    .line 23
    invoke-direct {p0}, Lax/r0/e$b;->e0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    long-to-int v1, v0

    .line 28
    return v1

    .line 29
    :cond_1c
    add-int/lit8 v1, v0, 0x2

    .line 30
    .line 31
    aget-byte v3, v2, v3

    .line 32
    .line 33
    shl-int/lit8 v3, v3, 0x7

    .line 34
    .line 35
    xor-int/2addr v3, v4

    .line 36
    if-gez v3, :cond_28

    .line 37
    .line 38
    xor-int/lit8 v0, v3, -0x80

    .line 39
    .line 40
    goto :goto_7c

    .line 41
    :cond_28
    add-int/lit8 v4, v0, 0x3

    .line 42
    .line 43
    aget-byte v1, v2, v1

    .line 44
    .line 45
    shl-int/lit8 v1, v1, 0xe

    .line 46
    .line 47
    xor-int/2addr v1, v3

    .line 48
    if-ltz v1, :cond_35

    .line 49
    .line 50
    xor-int/lit16 v0, v1, 0x3f80

    .line 51
    .line 52
    :goto_33
    move v1, v4

    .line 53
    goto :goto_7c

    .line 54
    :cond_35
    add-int/lit8 v3, v0, 0x4

    .line 55
    .line 56
    aget-byte v4, v2, v4

    .line 57
    .line 58
    shl-int/lit8 v4, v4, 0x15

    .line 59
    .line 60
    xor-int/2addr v1, v4

    .line 61
    if-gez v1, :cond_44

    .line 62
    .line 63
    const v0, -0x1fc080

    .line 64
    .line 65
    .line 66
    xor-int/2addr v0, v1

    .line 67
    :goto_42
    move v1, v3

    .line 68
    goto :goto_7c

    .line 69
    :cond_44
    add-int/lit8 v4, v0, 0x5

    .line 70
    .line 71
    aget-byte v3, v2, v3

    .line 72
    .line 73
    shl-int/lit8 v5, v3, 0x1c

    .line 74
    .line 75
    xor-int/2addr v1, v5

    .line 76
    const v5, 0xfe03f80

    .line 77
    .line 78
    .line 79
    xor-int/2addr v1, v5

    .line 80
    if-gez v3, :cond_78

    .line 81
    .line 82
    add-int/lit8 v3, v0, 0x6

    .line 83
    .line 84
    aget-byte v4, v2, v4

    .line 85
    .line 86
    if-gez v4, :cond_7a

    .line 87
    .line 88
    add-int/lit8 v4, v0, 0x7

    .line 89
    .line 90
    aget-byte v3, v2, v3

    .line 91
    .line 92
    if-gez v3, :cond_78

    .line 93
    .line 94
    add-int/lit8 v3, v0, 0x8

    .line 95
    .line 96
    aget-byte v4, v2, v4

    .line 97
    .line 98
    if-gez v4, :cond_7a

    .line 99
    .line 100
    add-int/lit8 v4, v0, 0x9

    .line 101
    .line 102
    aget-byte v3, v2, v3

    .line 103
    .line 104
    if-gez v3, :cond_78

    .line 105
    .line 106
    add-int/lit8 v0, v0, 0xa

    .line 107
    .line 108
    aget-byte v2, v2, v4

    .line 109
    .line 110
    if-ltz v2, :cond_73

    .line 111
    .line 112
    move v6, v1

    .line 113
    move v1, v0

    .line 114
    move v0, v6

    .line 115
    goto :goto_7c

    .line 116
    :cond_73
    invoke-static {}, Lax/r0/B;->e()Lax/r0/B;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    throw v0

    .line 121
    :cond_78
    move v0, v1

    .line 122
    goto :goto_33

    .line 123
    :cond_7a
    move v0, v1

    .line 124
    goto :goto_42

    .line 125
    :goto_7c
    iput v1, p0, Lax/r0/e$b;->c:I

    .line 126
    .line 127
    return v0

    .line 128
    :cond_7f
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    throw v0
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

.method private e0()J
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_3
    const/16 v3, 0x40

    .line 5
    .line 6
    if-ge v2, v3, :cond_18

    .line 7
    .line 8
    invoke-direct {p0}, Lax/r0/e$b;->S()B

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    and-int/lit8 v4, v3, 0x7f

    .line 13
    .line 14
    int-to-long v4, v4

    .line 15
    shl-long/2addr v4, v2

    .line 16
    or-long/2addr v0, v4

    .line 17
    and-int/lit16 v3, v3, 0x80

    .line 18
    .line 19
    if-nez v3, :cond_15

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_15
    add-int/lit8 v2, v2, 0x7

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_18
    invoke-static {}, Lax/r0/B;->e()Lax/r0/B;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    throw v0
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

.method private f0(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_a

    .line 2
    .line 3
    iget v0, p0, Lax/r0/e$b;->e:I

    .line 4
    .line 5
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    if-gt p1, v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private g0(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    throw p1
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

.method private h0(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    throw p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private i0(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/r0/e$b;->f0(I)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 5
    .line 6
    add-int/2addr v0, p1

    .line 7
    iput v0, p0, Lax/r0/e$b;->c:I

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

.method private j0()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->g:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->f:I

    .line 4
    .line 5
    invoke-static {v1}, Lax/r0/u0;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-static {v1, v2}, Lax/r0/u0;->c(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, p0, Lax/r0/e$b;->g:I

    .line 15
    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/r0/e$b;->D()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    if-eq v1, v2, :cond_1e

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/r0/e$b;->J()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_f

    .line 30
    .line 31
    :cond_1e
    iget v1, p0, Lax/r0/e$b;->f:I

    .line 32
    .line 33
    iget v2, p0, Lax/r0/e$b;->g:I

    .line 34
    .line 35
    if-ne v1, v2, :cond_27

    .line 36
    .line 37
    iput v0, p0, Lax/r0/e$b;->g:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    throw v0
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

.method private k0()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->e:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/16 v2, 0xa

    .line 7
    .line 8
    if-lt v0, v2, :cond_1b

    .line 9
    .line 10
    iget-object v0, p0, Lax/r0/e$b;->b:[B

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_c
    if-ge v3, v2, :cond_1b

    .line 14
    .line 15
    add-int/lit8 v4, v1, 0x1

    .line 16
    .line 17
    aget-byte v1, v0, v1

    .line 18
    .line 19
    if-ltz v1, :cond_17

    .line 20
    .line 21
    iput v4, p0, Lax/r0/e$b;->c:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    move v1, v4

    .line 27
    goto :goto_c

    .line 28
    :cond_1b
    invoke-direct {p0}, Lax/r0/e$b;->l0()V

    .line 29
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

.method private l0()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    const/16 v1, 0xa

    .line 3
    .line 4
    if-ge v0, v1, :cond_f

    .line 5
    .line 6
    invoke-direct {p0}, Lax/r0/e$b;->S()B

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ltz v1, :cond_c

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_f
    invoke-static {}, Lax/r0/B;->e()Lax/r0/B;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0
    .line 21
.end method

.method private m0(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/r0/e$b;->f0(I)V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x3

    .line 5
    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    throw p1
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

.method private n0(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/r0/e$b;->f0(I)V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x7

    .line 5
    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    throw p1
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
.method public A()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Lax/r0/i;->c(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public B(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eqz v0, :cond_50

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lax/r0/f;

    .line 10
    .line 11
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 12
    .line 13
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_35

    .line 18
    .line 19
    if-ne p1, v3, :cond_30

    .line 20
    .line 21
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget v3, p0, Lax/r0/e$b;->c:I

    .line 26
    .line 27
    add-int/2addr v3, p1

    .line 28
    :goto_1b
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 29
    .line 30
    if-ge p1, v3, :cond_2c

    .line 31
    .line 32
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_27

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 p1, 0x0

    .line 41
    :goto_28
    invoke-virtual {v0, p1}, Lax/r0/f;->k(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_1b

    .line 45
    :cond_2c
    invoke-direct {p0, v3}, Lax/r0/e$b;->g0(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    throw p1

    .line 54
    :cond_35
    invoke-virtual {p0}, Lax/r0/e$b;->m()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {v0, p1}, Lax/r0/f;->k(Z)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_43

    .line 66
    .line 67
    goto :goto_90

    .line 68
    :cond_43
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 69
    .line 70
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    if-eq v1, v2, :cond_35

    .line 77
    .line 78
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 79
    .line 80
    return-void

    .line 81
    :cond_50
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 82
    .line 83
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_7f

    .line 88
    .line 89
    if-ne v0, v3, :cond_7a

    .line 90
    .line 91
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v3, p0, Lax/r0/e$b;->c:I

    .line 96
    .line 97
    add-int/2addr v3, v0

    .line 98
    :goto_61
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 99
    .line 100
    if-ge v0, v3, :cond_76

    .line 101
    .line 102
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6d

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    goto :goto_6e

    .line 110
    :cond_6d
    const/4 v0, 0x0

    .line 111
    :goto_6e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_61

    .line 119
    :cond_76
    invoke-direct {p0, v3}, Lax/r0/e$b;->g0(I)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_7a
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    throw p1

    .line 128
    :cond_7f
    invoke-virtual {p0}, Lax/r0/e$b;->m()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_91

    .line 144
    .line 145
    :goto_90
    return-void

    .line 146
    :cond_91
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 147
    .line 148
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 153
    .line 154
    if-eq v1, v2, :cond_7f

    .line 155
    .line 156
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 157
    .line 158
    return-void
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
.end method

.method public C()Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/r0/e$b;->a0(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method public D()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lax/r0/e$b;->f:I

    .line 16
    .line 17
    iget v2, p0, Lax/r0/e$b;->g:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    invoke-static {v0}, Lax/r0/u0;->a(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
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

.method public E(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lax/r0/e$b;->b0(Ljava/util/List;Z)V

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

.method public F(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lax/r0/e$b;->b0(Ljava/util/List;Z)V

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

.method public G()Lax/r0/h;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    sget-object v0, Lax/r0/h;->c0:Lax/r0/h;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    invoke-direct {p0, v0}, Lax/r0/e$b;->f0(I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v1, p0, Lax/r0/e$b;->a:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 22
    .line 23
    iget v2, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    invoke-static {v1, v2, v0}, Lax/r0/h;->G([BII)Lax/r0/h;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_25

    .line 30
    :cond_1d
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 31
    .line 32
    iget v2, p0, Lax/r0/e$b;->c:I

    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lax/r0/h;->l([BII)Lax/r0/h;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_25
    iget v2, p0, Lax/r0/e$b;->c:I

    .line 39
    .line 40
    add-int/2addr v2, v0

    .line 41
    iput v2, p0, Lax/r0/e$b;->c:I

    .line 42
    .line 43
    return-object v1
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

.method public H(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/w;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_4d

    .line 6
    .line 7
    check-cast p1, Lax/r0/w;

    .line 8
    .line 9
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v2, :cond_33

    .line 16
    .line 17
    if-ne v0, v1, :cond_2e

    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/r0/e$b;->readFloat()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0}, Lax/r0/w;->i(F)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_21

    .line 31
    .line 32
    goto/16 :goto_99

    .line 33
    .line 34
    :cond_21
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 41
    .line 42
    if-eq v1, v2, :cond_12

    .line 43
    .line 44
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    throw p1

    .line 52
    :cond_33
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    :goto_3d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 63
    .line 64
    if-ge v0, v1, :cond_99

    .line 65
    .line 66
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1, v0}, Lax/r0/w;->i(F)V

    .line 75
    .line 76
    .line 77
    goto :goto_3d

    .line 78
    :cond_4d
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 79
    .line 80
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eq v0, v2, :cond_7b

    .line 85
    .line 86
    if-ne v0, v1, :cond_76

    .line 87
    .line 88
    :cond_57
    invoke-virtual {p0}, Lax/r0/e$b;->readFloat()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_69

    .line 104
    .line 105
    goto :goto_99

    .line 106
    :cond_69
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 107
    .line 108
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 113
    .line 114
    if-eq v1, v2, :cond_57

    .line 115
    .line 116
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 117
    .line 118
    return-void

    .line 119
    :cond_76
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    throw p1

    .line 124
    :cond_7b
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 129
    .line 130
    .line 131
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 132
    .line 133
    add-int/2addr v1, v0

    .line 134
    :goto_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    if-ge v0, v1, :cond_99

    .line 137
    .line 138
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_85

    .line 154
    :cond_99
    :goto_99
    return-void
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
.end method

.method public I()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public J()Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3f

    .line 6
    .line 7
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 8
    .line 9
    iget v1, p0, Lax/r0/e$b;->g:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_d

    .line 12
    .line 13
    goto :goto_3f

    .line 14
    :cond_d
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_3b

    .line 20
    .line 21
    if-eq v0, v1, :cond_35

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    if-eq v0, v2, :cond_2d

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    if-eq v0, v2, :cond_29

    .line 28
    .line 29
    const/4 v2, 0x5

    .line 30
    if-ne v0, v2, :cond_24

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    invoke-direct {p0, v0}, Lax/r0/e$b;->i0(I)V

    .line 34
    .line 35
    .line 36
    return v1

    .line 37
    :cond_24
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    throw v0

    .line 42
    :cond_29
    invoke-direct {p0}, Lax/r0/e$b;->j0()V

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_2d
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-direct {p0, v0}, Lax/r0/e$b;->i0(I)V

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_35
    const/16 v0, 0x8

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lax/r0/e$b;->i0(I)V

    .line 57
    .line 58
    .line 59
    return v1

    .line 60
    :cond_3b
    invoke-direct {p0}, Lax/r0/e$b;->k0()V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_3f
    :goto_3f
    const/4 v0, 0x0

    .line 65
    return v0
    .line 66
    .line 67
    .line 68
.end method

.method public K()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->V()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public L(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/r0/h;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_24

    .line 9
    .line 10
    :cond_9
    invoke-virtual {p0}, Lax/r0/e$b;->G()Lax/r0/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_17

    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 25
    .line 26
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 31
    .line 32
    if-eq v1, v2, :cond_9

    .line 33
    .line 34
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    throw p1
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

.method public M(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4d

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/m;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_32

    .line 17
    .line 18
    if-ne p1, v1, :cond_2d

    .line 19
    .line 20
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {p0, p1}, Lax/r0/e$b;->n0(I)V

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 28
    .line 29
    add-int/2addr v1, p1

    .line 30
    :goto_1d
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 31
    .line 32
    if-ge p1, v1, :cond_8b

    .line 33
    .line 34
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0, v2, v3}, Lax/r0/m;->i(D)V

    .line 43
    .line 44
    .line 45
    goto :goto_1d

    .line 46
    :cond_2d
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    throw p1

    .line 51
    :cond_32
    invoke-virtual {p0}, Lax/r0/e$b;->readDouble()D

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-virtual {v0, v1, v2}, Lax/r0/m;->i(D)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_40

    .line 63
    .line 64
    goto :goto_8b

    .line 65
    :cond_40
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 66
    .line 67
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 72
    .line 73
    if-eq v1, v2, :cond_32

    .line 74
    .line 75
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 79
    .line 80
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eq v0, v2, :cond_7a

    .line 85
    .line 86
    if-ne v0, v1, :cond_75

    .line 87
    .line 88
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-direct {p0, v0}, Lax/r0/e$b;->n0(I)V

    .line 93
    .line 94
    .line 95
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 96
    .line 97
    add-int/2addr v1, v0

    .line 98
    :goto_61
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 99
    .line 100
    if-ge v0, v1, :cond_8b

    .line 101
    .line 102
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_61

    .line 118
    :cond_75
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    throw p1

    .line 123
    :cond_7a
    invoke-virtual {p0}, Lax/r0/e$b;->readDouble()D

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_8c

    .line 139
    .line 140
    :cond_8b
    :goto_8b
    return-void

    .line 141
    :cond_8c
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 142
    .line 143
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 148
    .line 149
    if-eq v1, v2, :cond_7a

    .line 150
    .line 151
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 152
    .line 153
    return-void
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
.end method

.method public N()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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

.method public O()Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lax/r0/e$b;->a0(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method public P(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_49

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/I;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_2e

    .line 17
    .line 18
    if-ne p1, v1, :cond_29

    .line 19
    .line 20
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {p0, p1}, Lax/r0/e$b;->n0(I)V

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 28
    .line 29
    add-int/2addr v1, p1

    .line 30
    :goto_1d
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 31
    .line 32
    if-ge p1, v1, :cond_83

    .line 33
    .line 34
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    goto :goto_1d

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->e()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_83

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v2, :cond_72

    .line 81
    .line 82
    if-ne v0, v1, :cond_6d

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-direct {p0, v0}, Lax/r0/e$b;->n0(I)V

    .line 89
    .line 90
    .line 91
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    add-int/2addr v1, v0

    .line 94
    :goto_5d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 95
    .line 96
    if-ge v0, v1, :cond_83

    .line 97
    .line 98
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_5d

    .line 110
    :cond_6d
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    throw p1

    .line 115
    :cond_72
    invoke-virtual {p0}, Lax/r0/e$b;->e()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_84

    .line 131
    .line 132
    :cond_83
    :goto_83
    return-void

    .line 133
    :cond_84
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 134
    .line 135
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 140
    .line 141
    if-eq v1, v2, :cond_72

    .line 142
    .line 143
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 144
    .line 145
    return-void
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
.end method

.method public a(Ljava/util/Map;Lax/r0/K$a;Lax/r0/p;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lax/r0/K$a<",
            "TK;TV;>;",
            "Lax/r0/p;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {p0, v1}, Lax/r0/e$b;->f0(I)V

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lax/r0/e$b;->e:I

    .line 13
    .line 14
    iget v3, p0, Lax/r0/e$b;->c:I

    .line 15
    .line 16
    add-int/2addr v3, v1

    .line 17
    iput v3, p0, Lax/r0/e$b;->e:I

    .line 18
    .line 19
    :try_start_12
    iget-object v1, p2, Lax/r0/K$a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v3, p2, Lax/r0/K$a;->d:Ljava/lang/Object;

    .line 22
    .line 23
    :goto_16
    invoke-virtual {p0}, Lax/r0/e$b;->D()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const v5, 0x7fffffff

    .line 28
    .line 29
    .line 30
    if-ne v4, v5, :cond_27

    .line 31
    .line 32
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_22
    .catchall {:try_start_12 .. :try_end_22} :catchall_25

    .line 33
    .line 34
    .line 35
    iput v2, p0, Lax/r0/e$b;->e:I

    .line 36
    .line 37
    return-void

    .line 38
    :catchall_25
    move-exception p1

    .line 39
    goto :goto_5d

    .line 40
    :cond_27
    const/4 v5, 0x1

    .line 41
    const-string v6, "Unable to parse map entry."

    .line 42
    .line 43
    if-eq v4, v5, :cond_48

    .line 44
    .line 45
    if-eq v4, v0, :cond_3b

    .line 46
    .line 47
    :try_start_2e
    invoke-virtual {p0}, Lax/r0/e$b;->J()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_35

    .line 52
    .line 53
    goto :goto_16

    .line 54
    :cond_35
    new-instance v4, Lax/r0/B;

    .line 55
    .line 56
    invoke-direct {v4, v6}, Lax/r0/B;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v4

    .line 60
    :cond_3b
    iget-object v4, p2, Lax/r0/K$a;->c:Lax/r0/u0$b;

    .line 61
    .line 62
    iget-object v5, p2, Lax/r0/K$a;->d:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-direct {p0, v4, v5, p3}, Lax/r0/e$b;->T(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_16

    .line 73
    :cond_48
    iget-object v4, p2, Lax/r0/K$a;->a:Lax/r0/u0$b;

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-direct {p0, v4, v5, v5}, Lax/r0/e$b;->T(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1
    :try_end_4f
    .catch Lax/r0/B$a; {:try_start_2e .. :try_end_4f} :catch_50
    .catchall {:try_start_2e .. :try_end_4f} :catchall_25

    .line 80
    goto :goto_16

    .line 81
    :catch_50
    :try_start_50
    invoke-virtual {p0}, Lax/r0/e$b;->J()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_57

    .line 86
    .line 87
    goto :goto_16

    .line 88
    :cond_57
    new-instance p1, Lax/r0/B;

    .line 89
    .line 90
    invoke-direct {p1, v6}, Lax/r0/B;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
    :try_end_5d
    .catchall {:try_start_50 .. :try_end_5d} :catchall_25

    .line 94
    :goto_5d
    iput v2, p0, Lax/r0/e$b;->e:I

    .line 95
    .line 96
    throw p1
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

.method public a0(Z)Ljava/lang/String;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-direct {p0, v0}, Lax/r0/e$b;->f0(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p1, :cond_24

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/e$b;->b:[B

    .line 20
    .line 21
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 22
    .line 23
    add-int v2, v1, v0

    .line 24
    .line 25
    invoke-static {p1, v1, v2}, Lax/r0/t0;->n([BII)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1f

    .line 30
    .line 31
    goto :goto_24

    .line 32
    :cond_1f
    invoke-static {}, Lax/r0/B;->c()Lax/r0/B;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    throw p1

    .line 37
    :cond_24
    :goto_24
    new-instance p1, Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Lax/r0/e$b;->b:[B

    .line 40
    .line 41
    iget v2, p0, Lax/r0/e$b;->c:I

    .line 42
    .line 43
    sget-object v3, Lax/r0/A;->a:Ljava/nio/charset/Charset;

    .line 44
    .line 45
    invoke-direct {p1, v1, v2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 49
    .line 50
    add-int/2addr v1, v0

    .line 51
    iput v1, p0, Lax/r0/e$b;->c:I

    .line 52
    .line 53
    return-object p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public b(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lax/r0/e$b;->U(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public b0(Ljava/util/List;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_48

    .line 9
    .line 10
    instance-of v0, p1, Lax/r0/G;

    .line 11
    .line 12
    if-eqz v0, :cond_2d

    .line 13
    .line 14
    if-nez p2, :cond_2d

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lax/r0/G;

    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/r0/e$b;->G()Lax/r0/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Lax/r0/G;->C0(Lax/r0/h;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_20

    .line 31
    .line 32
    goto :goto_3a

    .line 33
    :cond_20
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 34
    .line 35
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget v1, p0, Lax/r0/e$b;->f:I

    .line 40
    .line 41
    if-eq p2, v1, :cond_12

    .line 42
    .line 43
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    invoke-virtual {p0, p2}, Lax/r0/e$b;->a0(Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3b

    .line 58
    .line 59
    :goto_3a
    return-void

    .line 60
    :cond_3b
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 61
    .line 62
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 67
    .line 68
    if-eq v1, v2, :cond_2d

    .line 69
    .line 70
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    throw p1
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

.method public c(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_49

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2e

    .line 16
    .line 17
    if-ne p1, v1, :cond_29

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_84

    .line 29
    .line 30
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Lax/r0/i;->b(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_19

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->z()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_84

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_73

    .line 81
    .line 82
    if-ne v0, v1, :cond_6e

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 89
    .line 90
    add-int/2addr v1, v0

    .line 91
    :goto_5a
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    if-ge v0, v1, :cond_84

    .line 94
    .line 95
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Lax/r0/i;->b(I)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_5a

    .line 111
    :cond_6e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/r0/e$b;->z()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    :cond_84
    :goto_84
    return-void

    .line 134
    :cond_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 141
    .line 142
    if-eq v1, v2, :cond_73

    .line 143
    .line 144
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 145
    .line 146
    return-void
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
.end method

.method public d()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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

.method public d0()J
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/e$b;->e:I

    .line 4
    .line 5
    if-eq v1, v0, :cond_c2

    .line 6
    .line 7
    iget-object v2, p0, Lax/r0/e$b;->b:[B

    .line 8
    .line 9
    add-int/lit8 v3, v0, 0x1

    .line 10
    .line 11
    aget-byte v4, v2, v0

    .line 12
    .line 13
    if-ltz v4, :cond_12

    .line 14
    .line 15
    iput v3, p0, Lax/r0/e$b;->c:I

    .line 16
    .line 17
    int-to-long v0, v4

    .line 18
    return-wide v0

    .line 19
    :cond_12
    sub-int/2addr v1, v3

    .line 20
    const/16 v5, 0x9

    .line 21
    .line 22
    if-ge v1, v5, :cond_1c

    .line 23
    .line 24
    invoke-direct {p0}, Lax/r0/e$b;->e0()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0

    .line 29
    :cond_1c
    add-int/lit8 v1, v0, 0x2

    .line 30
    .line 31
    aget-byte v3, v2, v3

    .line 32
    .line 33
    shl-int/lit8 v3, v3, 0x7

    .line 34
    .line 35
    xor-int/2addr v3, v4

    .line 36
    if-gez v3, :cond_2a

    .line 37
    .line 38
    xor-int/lit8 v0, v3, -0x80

    .line 39
    .line 40
    int-to-long v2, v0

    .line 41
    goto/16 :goto_bf

    .line 42
    .line 43
    :cond_2a
    add-int/lit8 v4, v0, 0x3

    .line 44
    .line 45
    aget-byte v1, v2, v1

    .line 46
    .line 47
    shl-int/lit8 v1, v1, 0xe

    .line 48
    .line 49
    xor-int/2addr v1, v3

    .line 50
    if-ltz v1, :cond_39

    .line 51
    .line 52
    xor-int/lit16 v0, v1, 0x3f80

    .line 53
    .line 54
    int-to-long v2, v0

    .line 55
    move v1, v4

    .line 56
    goto/16 :goto_bf

    .line 57
    .line 58
    :cond_39
    add-int/lit8 v3, v0, 0x4

    .line 59
    .line 60
    aget-byte v4, v2, v4

    .line 61
    .line 62
    shl-int/lit8 v4, v4, 0x15

    .line 63
    .line 64
    xor-int/2addr v1, v4

    .line 65
    if-gez v1, :cond_4c

    .line 66
    .line 67
    const v0, -0x1fc080

    .line 68
    .line 69
    .line 70
    xor-int/2addr v0, v1

    .line 71
    int-to-long v0, v0

    .line 72
    :goto_47
    move-wide v10, v0

    .line 73
    move v1, v3

    .line 74
    move-wide v2, v10

    .line 75
    goto/16 :goto_bf

    .line 76
    .line 77
    :cond_4c
    int-to-long v4, v1

    .line 78
    add-int/lit8 v1, v0, 0x5

    .line 79
    .line 80
    aget-byte v3, v2, v3

    .line 81
    .line 82
    int-to-long v6, v3

    .line 83
    const/16 v3, 0x1c

    .line 84
    .line 85
    shl-long/2addr v6, v3

    .line 86
    xor-long/2addr v4, v6

    .line 87
    const-wide/16 v6, 0x0

    .line 88
    .line 89
    cmp-long v3, v4, v6

    .line 90
    .line 91
    if-ltz v3, :cond_61

    .line 92
    .line 93
    const-wide/32 v2, 0xfe03f80

    .line 94
    .line 95
    .line 96
    :goto_5f
    xor-long/2addr v2, v4

    .line 97
    goto :goto_bf

    .line 98
    :cond_61
    add-int/lit8 v3, v0, 0x6

    .line 99
    .line 100
    aget-byte v1, v2, v1

    .line 101
    .line 102
    int-to-long v8, v1

    .line 103
    const/16 v1, 0x23

    .line 104
    .line 105
    shl-long/2addr v8, v1

    .line 106
    xor-long/2addr v4, v8

    .line 107
    cmp-long v1, v4, v6

    .line 108
    .line 109
    if-gez v1, :cond_75

    .line 110
    .line 111
    const-wide v0, -0x7f01fc080L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    :goto_73
    xor-long/2addr v0, v4

    .line 117
    goto :goto_47

    .line 118
    :cond_75
    add-int/lit8 v1, v0, 0x7

    .line 119
    .line 120
    aget-byte v3, v2, v3

    .line 121
    .line 122
    int-to-long v8, v3

    .line 123
    const/16 v3, 0x2a

    .line 124
    .line 125
    shl-long/2addr v8, v3

    .line 126
    xor-long/2addr v4, v8

    .line 127
    cmp-long v3, v4, v6

    .line 128
    .line 129
    if-ltz v3, :cond_88

    .line 130
    .line 131
    const-wide v2, 0x3f80fe03f80L

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    goto :goto_5f

    .line 137
    :cond_88
    add-int/lit8 v3, v0, 0x8

    .line 138
    .line 139
    aget-byte v1, v2, v1

    .line 140
    .line 141
    int-to-long v8, v1

    .line 142
    const/16 v1, 0x31

    .line 143
    .line 144
    shl-long/2addr v8, v1

    .line 145
    xor-long/2addr v4, v8

    .line 146
    cmp-long v1, v4, v6

    .line 147
    .line 148
    if-gez v1, :cond_9b

    .line 149
    .line 150
    const-wide v0, -0x1fc07f01fc080L

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    goto :goto_73

    .line 156
    :cond_9b
    add-int/lit8 v1, v0, 0x9

    .line 157
    .line 158
    aget-byte v3, v2, v3

    .line 159
    .line 160
    int-to-long v8, v3

    .line 161
    const/16 v3, 0x38

    .line 162
    .line 163
    shl-long/2addr v8, v3

    .line 164
    xor-long/2addr v4, v8

    .line 165
    const-wide v8, 0xfe03f80fe03f80L

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    xor-long/2addr v4, v8

    .line 171
    cmp-long v3, v4, v6

    .line 172
    .line 173
    if-gez v3, :cond_b8

    .line 174
    .line 175
    add-int/lit8 v0, v0, 0xa

    .line 176
    .line 177
    aget-byte v1, v2, v1

    .line 178
    .line 179
    int-to-long v1, v1

    .line 180
    cmp-long v3, v1, v6

    .line 181
    .line 182
    if-ltz v3, :cond_ba

    .line 183
    .line 184
    move v1, v0

    .line 185
    :cond_b8
    move-wide v2, v4

    .line 186
    goto :goto_bf

    .line 187
    :cond_ba
    invoke-static {}, Lax/r0/B;->e()Lax/r0/B;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    throw v0

    .line 192
    :goto_bf
    iput v1, p0, Lax/r0/e$b;->c:I

    .line 193
    .line 194
    return-wide v2

    .line 195
    :cond_c2
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    throw v0
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

.method public e()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->X()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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

.method public f(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lax/r0/e$b;->Z(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public g(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_49

    .line 6
    .line 7
    check-cast p1, Lax/r0/z;

    .line 8
    .line 9
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v2, :cond_33

    .line 16
    .line 17
    if-ne v0, v1, :cond_2e

    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/r0/e$b;->K()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0}, Lax/r0/z;->i(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_21

    .line 31
    .line 32
    goto/16 :goto_91

    .line 33
    .line 34
    :cond_21
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 41
    .line 42
    if-eq v1, v2, :cond_12

    .line 43
    .line 44
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    throw p1

    .line 52
    :cond_33
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    :goto_3d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 63
    .line 64
    if-ge v0, v1, :cond_91

    .line 65
    .line 66
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1, v0}, Lax/r0/z;->i(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_3d

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v2, :cond_77

    .line 81
    .line 82
    if-ne v0, v1, :cond_72

    .line 83
    .line 84
    :cond_53
    invoke-virtual {p0}, Lax/r0/e$b;->K()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_65

    .line 100
    .line 101
    goto :goto_91

    .line 102
    :cond_65
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 103
    .line 104
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 109
    .line 110
    if-eq v1, v2, :cond_53

    .line 111
    .line 112
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_72
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    throw p1

    .line 120
    :cond_77
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 125
    .line 126
    .line 127
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 128
    .line 129
    add-int/2addr v1, v0

    .line 130
    :goto_81
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 131
    .line 132
    if-ge v0, v1, :cond_91

    .line 133
    .line 134
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_81

    .line 146
    :cond_91
    :goto_91
    return-void
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
.end method

.method public h(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_49

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2e

    .line 16
    .line 17
    if-ne p1, v1, :cond_29

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_84

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-static {v2, v3}, Lax/r0/i;->c(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    goto :goto_19

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->A()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_84

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_73

    .line 81
    .line 82
    if-ne v0, v1, :cond_6e

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 89
    .line 90
    add-int/2addr v1, v0

    .line 91
    :goto_5a
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    if-ge v0, v1, :cond_84

    .line 94
    .line 95
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-static {v2, v3}, Lax/r0/i;->c(J)J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_5a

    .line 111
    :cond_6e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/r0/e$b;->A()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    :cond_84
    :goto_84
    return-void

    .line 134
    :cond_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 141
    .line 142
    if-eq v1, v2, :cond_73

    .line 143
    .line 144
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 145
    .line 146
    return-void
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
.end method

.method public i(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_45

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2a

    .line 16
    .line 17
    if-ne p1, v1, :cond_25

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_7c

    .line 29
    .line 30
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_19

    .line 38
    :cond_25
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    throw p1

    .line 43
    :cond_2a
    invoke-virtual {p0}, Lax/r0/e$b;->p()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_38

    .line 55
    .line 56
    goto :goto_7c

    .line 57
    :cond_38
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 58
    .line 59
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 64
    .line 65
    if-eq v1, v2, :cond_2a

    .line 66
    .line 67
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 71
    .line 72
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6b

    .line 77
    .line 78
    if-ne v0, v1, :cond_66

    .line 79
    .line 80
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 85
    .line 86
    add-int/2addr v1, v0

    .line 87
    :goto_56
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 88
    .line 89
    if-ge v0, v1, :cond_7c

    .line 90
    .line 91
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_56

    .line 103
    :cond_66
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_6b
    invoke-virtual {p0}, Lax/r0/e$b;->p()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7d

    .line 124
    .line 125
    :cond_7c
    :goto_7c
    return-void

    .line 126
    :cond_7d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 127
    .line 128
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 133
    .line 134
    if-eq v1, v2, :cond_6b

    .line 135
    .line 136
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 137
    .line 138
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public j(Ljava/util/List;Lax/r0/h0;Lax/r0/p;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_24

    .line 9
    .line 10
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 11
    .line 12
    :cond_b
    invoke-direct {p0, p2, p3}, Lax/r0/e$b;->U(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_19

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eq v2, v0, :cond_b

    .line 33
    .line 34
    iput v1, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    throw p1
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

.method public k()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->V()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public l()I
    .registers 2

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

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

.method public m()Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_b

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :cond_b
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

.method public n()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->X()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
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

.method public o(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_49

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2e

    .line 16
    .line 17
    if-ne p1, v1, :cond_29

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_25

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_19

    .line 38
    :cond_25
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->d()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_84

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_73

    .line 81
    .line 82
    if-ne v0, v1, :cond_6e

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 89
    .line 90
    add-int/2addr v1, v0

    .line 91
    :goto_5a
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    if-ge v0, v1, :cond_6a

    .line 94
    .line 95
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_5a

    .line 107
    :cond_6a
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/r0/e$b;->d()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    :goto_84
    return-void

    .line 134
    :cond_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 141
    .line 142
    if-eq v1, v2, :cond_73

    .line 143
    .line 144
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 145
    .line 146
    return-void
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
.end method

.method public p()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public q(Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lax/r0/d0;->a()Lax/r0/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/r0/d0;->d(Ljava/lang/Class;)Lax/r0/h0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1, p2}, Lax/r0/e$b;->U(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public r(Ljava/util/List;Lax/r0/h0;Lax/r0/p;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lax/r0/h0<",
            "TT;>;",
            "Lax/r0/p;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_24

    .line 9
    .line 10
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 11
    .line 12
    :cond_b
    invoke-direct {p0, p2, p3}, Lax/r0/e$b;->Z(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_19

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eq v2, v0, :cond_b

    .line 33
    .line 34
    iput v1, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    throw p1
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

.method public readDouble()D
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->X()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public readFloat()F
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->V()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public s(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_49

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2e

    .line 16
    .line 17
    if-ne p1, v1, :cond_29

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_25

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_19

    .line 38
    :cond_25
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->N()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_84

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_73

    .line 81
    .line 82
    if-ne v0, v1, :cond_6e

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 89
    .line 90
    add-int/2addr v1, v0

    .line 91
    :goto_5a
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    if-ge v0, v1, :cond_6a

    .line 94
    .line 95
    invoke-virtual {p0}, Lax/r0/e$b;->d0()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_5a

    .line 107
    :cond_6a
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/r0/e$b;->N()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    :goto_84
    return-void

    .line 134
    :cond_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 141
    .line 142
    if-eq v1, v2, :cond_73

    .line 143
    .line 144
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 145
    .line 146
    return-void
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
.end method

.method public t(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_49

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/I;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_2e

    .line 17
    .line 18
    if-ne p1, v1, :cond_29

    .line 19
    .line 20
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {p0, p1}, Lax/r0/e$b;->n0(I)V

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 28
    .line 29
    add-int/2addr v1, p1

    .line 30
    :goto_1d
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 31
    .line 32
    if-ge p1, v1, :cond_83

    .line 33
    .line 34
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    goto :goto_1d

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->n()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_83

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v2, :cond_72

    .line 81
    .line 82
    if-ne v0, v1, :cond_6d

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-direct {p0, v0}, Lax/r0/e$b;->n0(I)V

    .line 89
    .line 90
    .line 91
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    add-int/2addr v1, v0

    .line 94
    :goto_5d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 95
    .line 96
    if-ge v0, v1, :cond_83

    .line 97
    .line 98
    invoke-direct {p0}, Lax/r0/e$b;->Y()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_5d

    .line 110
    :cond_6d
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    throw p1

    .line 115
    :cond_72
    invoke-virtual {p0}, Lax/r0/e$b;->n()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_84

    .line 131
    .line 132
    :cond_83
    :goto_83
    return-void

    .line 133
    :cond_84
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 134
    .line 135
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 140
    .line 141
    if-eq v1, v2, :cond_72

    .line 142
    .line 143
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 144
    .line 145
    return-void
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
.end method

.method public u(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_49

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2e

    .line 16
    .line 17
    if-ne p1, v1, :cond_29

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_25

    .line 29
    .line 30
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_19

    .line 38
    :cond_25
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    throw p1

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lax/r0/e$b;->I()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3c

    .line 59
    .line 60
    goto :goto_84

    .line 61
    :cond_3c
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 62
    .line 63
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 68
    .line 69
    if-eq v1, v2, :cond_2e

    .line 70
    .line 71
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_73

    .line 81
    .line 82
    if-ne v0, v1, :cond_6e

    .line 83
    .line 84
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 89
    .line 90
    add-int/2addr v1, v0

    .line 91
    :goto_5a
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 92
    .line 93
    if-ge v0, v1, :cond_6a

    .line 94
    .line 95
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_5a

    .line 107
    :cond_6a
    invoke-direct {p0, v1}, Lax/r0/e$b;->g0(I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-virtual {p0}, Lax/r0/e$b;->I()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    :goto_84
    return-void

    .line 134
    :cond_85
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 135
    .line 136
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 141
    .line 142
    if-eq v1, v2, :cond_73

    .line 143
    .line 144
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 145
    .line 146
    return-void
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
.end method

.method public v(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_45

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2a

    .line 16
    .line 17
    if-ne p1, v1, :cond_25

    .line 18
    .line 19
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    :goto_19
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 27
    .line 28
    if-ge p1, v1, :cond_7c

    .line 29
    .line 30
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_19

    .line 38
    :cond_25
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    throw p1

    .line 43
    :cond_2a
    invoke-virtual {p0}, Lax/r0/e$b;->w()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_38

    .line 55
    .line 56
    goto :goto_7c

    .line 57
    :cond_38
    iget p1, p0, Lax/r0/e$b;->c:I

    .line 58
    .line 59
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 64
    .line 65
    if-eq v1, v2, :cond_2a

    .line 66
    .line 67
    iput p1, p0, Lax/r0/e$b;->c:I

    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 71
    .line 72
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6b

    .line 77
    .line 78
    if-ne v0, v1, :cond_66

    .line 79
    .line 80
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 85
    .line 86
    add-int/2addr v1, v0

    .line 87
    :goto_56
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 88
    .line 89
    if-ge v0, v1, :cond_7c

    .line 90
    .line 91
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_56

    .line 103
    :cond_66
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_6b
    invoke-virtual {p0}, Lax/r0/e$b;->w()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7d

    .line 124
    .line 125
    :cond_7c
    :goto_7c
    return-void

    .line 126
    :cond_7d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 127
    .line 128
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 133
    .line 134
    if-eq v1, v2, :cond_6b

    .line 135
    .line 136
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 137
    .line 138
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public w()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public x(Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lax/r0/p;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lax/r0/d0;->a()Lax/r0/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/r0/d0;->d(Ljava/lang/Class;)Lax/r0/h0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1, p2}, Lax/r0/e$b;->Z(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public y(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/r0/z;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_49

    .line 6
    .line 7
    check-cast p1, Lax/r0/z;

    .line 8
    .line 9
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 10
    .line 11
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v2, :cond_33

    .line 16
    .line 17
    if-ne v0, v1, :cond_2e

    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/r0/e$b;->k()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0}, Lax/r0/z;->i(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_21

    .line 31
    .line 32
    goto/16 :goto_91

    .line 33
    .line 34
    :cond_21
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 35
    .line 36
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 41
    .line 42
    if-eq v1, v2, :cond_12

    .line 43
    .line 44
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    throw p1

    .line 52
    :cond_33
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    :goto_3d
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 63
    .line 64
    if-ge v0, v1, :cond_91

    .line 65
    .line 66
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1, v0}, Lax/r0/z;->i(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_3d

    .line 74
    :cond_49
    iget v0, p0, Lax/r0/e$b;->f:I

    .line 75
    .line 76
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v2, :cond_77

    .line 81
    .line 82
    if-ne v0, v1, :cond_72

    .line 83
    .line 84
    :cond_53
    invoke-virtual {p0}, Lax/r0/e$b;->k()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, Lax/r0/e$b;->R()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_65

    .line 100
    .line 101
    goto :goto_91

    .line 102
    :cond_65
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 103
    .line 104
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iget v2, p0, Lax/r0/e$b;->f:I

    .line 109
    .line 110
    if-eq v1, v2, :cond_53

    .line 111
    .line 112
    iput v0, p0, Lax/r0/e$b;->c:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_72
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    throw p1

    .line 120
    :cond_77
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-direct {p0, v0}, Lax/r0/e$b;->m0(I)V

    .line 125
    .line 126
    .line 127
    iget v1, p0, Lax/r0/e$b;->c:I

    .line 128
    .line 129
    add-int/2addr v1, v0

    .line 130
    :goto_81
    iget v0, p0, Lax/r0/e$b;->c:I

    .line 131
    .line 132
    if-ge v0, v1, :cond_91

    .line 133
    .line 134
    invoke-direct {p0}, Lax/r0/e$b;->W()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_81

    .line 146
    :cond_91
    :goto_91
    return-void
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
.end method

.method public z()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/e$b;->h0(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lax/r0/e$b;->c0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lax/r0/i;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
