.class final Lax/r0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/r0/g0;


# instance fields
.field private final a:Lax/r0/i;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lax/r0/i;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/r0/j;->d:I

    .line 6
    .line 7
    const-string v0, "input"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lax/r0/A;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lax/r0/i;

    .line 14
    .line 15
    iput-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 16
    .line 17
    iput-object p0, p1, Lax/r0/i;->d:Lax/r0/j;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public static Q(Lax/r0/i;)Lax/r0/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r0/i;->d:Lax/r0/j;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    new-instance v0, Lax/r0/j;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lax/r0/j;-><init>(Lax/r0/i;)V

    .line 9
    .line 10
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
    .line 22
.end method

.method private R(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;
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
    sget-object v0, Lax/r0/j$a;->a:[I

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
    invoke-virtual {p0}, Lax/r0/j;->d()J

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
    invoke-virtual {p0}, Lax/r0/j;->p()I

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
    invoke-virtual {p0}, Lax/r0/j;->O()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_2a
    invoke-virtual {p0}, Lax/r0/j;->A()J

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
    invoke-virtual {p0}, Lax/r0/j;->z()I

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
    invoke-virtual {p0}, Lax/r0/j;->n()J

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
    invoke-virtual {p0}, Lax/r0/j;->K()I

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
    invoke-virtual {p0, p2, p3}, Lax/r0/j;->x(Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :pswitch_53
    invoke-virtual {p0}, Lax/r0/j;->N()J

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
    invoke-virtual {p0}, Lax/r0/j;->I()I

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
    invoke-virtual {p0}, Lax/r0/j;->readFloat()F

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
    invoke-virtual {p0}, Lax/r0/j;->e()J

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
    invoke-virtual {p0}, Lax/r0/j;->k()I

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
    invoke-virtual {p0}, Lax/r0/j;->w()I

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
    invoke-virtual {p0}, Lax/r0/j;->readDouble()D

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
    invoke-virtual {p0}, Lax/r0/j;->G()Lax/r0/h;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_97
    invoke-virtual {p0}, Lax/r0/j;->m()Z

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

.method private S(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
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
    iget v0, p0, Lax/r0/j;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/r0/j;->b:I

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
    iput v1, p0, Lax/r0/j;->c:I

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
    iget p1, p0, Lax/r0/j;->b:I

    .line 27
    .line 28
    iget p2, p0, Lax/r0/j;->c:I
    :try_end_1d
    .catchall {:try_start_f .. :try_end_1d} :catchall_27

    .line 29
    .line 30
    if-ne p1, p2, :cond_22

    .line 31
    .line 32
    iput v0, p0, Lax/r0/j;->c:I

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
    iput v0, p0, Lax/r0/j;->c:I

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

.method private T(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;
    .registers 7
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
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 8
    .line 9
    iget v2, v1, Lax/r0/i;->a:I

    .line 10
    .line 11
    iget v3, v1, Lax/r0/i;->b:I

    .line 12
    .line 13
    if-ge v2, v3, :cond_36

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lax/r0/i;->l(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p1}, Lax/r0/h0;->g()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 24
    .line 25
    iget v3, v2, Lax/r0/i;->a:I

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    iput v3, v2, Lax/r0/i;->a:I

    .line 30
    .line 31
    invoke-interface {p1, v1, p0, p2}, Lax/r0/h0;->h(Ljava/lang/Object;Lax/r0/g0;Lax/r0/p;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v1}, Lax/r0/h0;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-virtual {p1, p2}, Lax/r0/i;->a(I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 44
    .line 45
    iget p2, p1, Lax/r0/i;->a:I

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    iput p2, p1, Lax/r0/i;->a:I

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lax/r0/i;->k(I)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_36
    invoke-static {}, Lax/r0/B;->h()Lax/r0/B;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
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

.method private V(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r0/i;->d()I

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
    invoke-static {}, Lax/r0/B;->k()Lax/r0/B;

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

.method private W(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/j;->b:I

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

.method private X(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    and-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

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

.method private Y(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    and-int/lit8 p1, p1, 0x7

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-static {}, Lax/r0/B;->g()Lax/r0/B;

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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->y()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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

.method public B(Ljava/util/List;)V
    .registers 4
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
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/f;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->m()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/f;->k(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->m()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lax/r0/f;->k(Z)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->m()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->m()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->z()Ljava/lang/String;

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

.method public D()I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/r0/j;->d:I

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iput v0, p0, Lax/r0/j;->b:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lax/r0/j;->d:I

    .line 9
    .line 10
    goto :goto_12

    .line 11
    :cond_a
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lax/r0/j;->b:I

    .line 18
    .line 19
    :goto_12
    iget v0, p0, Lax/r0/j;->b:I

    .line 20
    .line 21
    if-eqz v0, :cond_20

    .line 22
    .line 23
    iget v1, p0, Lax/r0/j;->c:I

    .line 24
    .line 25
    if-ne v0, v1, :cond_1b

    .line 26
    .line 27
    goto :goto_20

    .line 28
    :cond_1b
    invoke-static {v0}, Lax/r0/u0;->a(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0

    .line 33
    :cond_20
    :goto_20
    const v0, 0x7fffffff

    .line 34
    .line 35
    .line 36
    return v0
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
    invoke-virtual {p0, p1, v0}, Lax/r0/j;->U(Ljava/util/List;Z)V

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
    invoke-virtual {p0, p1, v0}, Lax/r0/j;->U(Ljava/util/List;Z)V

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
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->n()Lax/r0/h;

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

.method public H(Ljava/util/List;)V
    .registers 6
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
    if-eqz v0, :cond_5b

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/w;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_38

    .line 17
    .line 18
    if-ne p1, v1, :cond_33

    .line 19
    .line 20
    :cond_13
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->s()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, Lax/r0/w;->i(F)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_26

    .line 36
    .line 37
    goto/16 :goto_b2

    .line 38
    .line 39
    :cond_26
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 40
    .line 41
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget v1, p0, Lax/r0/j;->b:I

    .line 46
    .line 47
    if-eq p1, v1, :cond_13

    .line 48
    .line 49
    iput p1, p0, Lax/r0/j;->d:I

    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1

    .line 57
    :cond_38
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Lax/r0/j;->X(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_49
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lax/r0/i;->s()F

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lax/r0/w;->i(F)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_49

    .line 90
    .line 91
    goto :goto_b2

    .line 92
    :cond_5b
    iget v0, p0, Lax/r0/j;->b:I

    .line 93
    .line 94
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v0, v2, :cond_8d

    .line 99
    .line 100
    if-ne v0, v1, :cond_88

    .line 101
    .line 102
    :cond_65
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 103
    .line 104
    invoke-virtual {v0}, Lax/r0/i;->s()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7b

    .line 122
    .line 123
    goto :goto_b2

    .line 124
    :cond_7b
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 125
    .line 126
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget v1, p0, Lax/r0/j;->b:I

    .line 131
    .line 132
    if-eq v0, v1, :cond_65

    .line 133
    .line 134
    iput v0, p0, Lax/r0/j;->d:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-direct {p0, v0}, Lax/r0/j;->X(I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 152
    .line 153
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/2addr v1, v0

    .line 158
    :cond_9d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lax/r0/i;->s()F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 172
    .line 173
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-lt v0, v1, :cond_9d

    .line 178
    .line 179
    :goto_b2
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->t()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_16

    .line 8
    .line 9
    iget v0, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    iget v1, p0, Lax/r0/j;->c:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_f

    .line 14
    .line 15
    goto :goto_16

    .line 16
    :cond_f
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lax/r0/i;->E(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_16
    :goto_16
    const/4 v0, 0x0

    .line 24
    return v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->v()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    .registers 4
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
    iget v0, p0, Lax/r0/j;->b:I

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
    if-ne v0, v1, :cond_26

    .line 9
    .line 10
    :cond_9
    invoke-virtual {p0}, Lax/r0/j;->G()Lax/r0/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p0, Lax/r0/j;->b:I

    .line 33
    .line 34
    if-eq v0, v1, :cond_9

    .line 35
    .line 36
    iput v0, p0, Lax/r0/j;->d:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

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
    if-eqz v0, :cond_59

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/m;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_3a

    .line 17
    .line 18
    if-ne p1, v1, :cond_35

    .line 19
    .line 20
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-direct {p0, p1}, Lax/r0/j;->Y(I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, p1

    .line 36
    :cond_23
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/r0/i;->o()D

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0, v2, v3}, Lax/r0/m;->i(D)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 46
    .line 47
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lt p1, v1, :cond_23

    .line 52
    .line 53
    goto :goto_a3

    .line 54
    :cond_35
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1

    .line 59
    :cond_3a
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 60
    .line 61
    invoke-virtual {p1}, Lax/r0/i;->o()D

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-virtual {v0, v1, v2}, Lax/r0/m;->i(D)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 69
    .line 70
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4c

    .line 75
    .line 76
    goto :goto_a3

    .line 77
    :cond_4c
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 78
    .line 79
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget v1, p0, Lax/r0/j;->b:I

    .line 84
    .line 85
    if-eq p1, v1, :cond_3a

    .line 86
    .line 87
    iput p1, p0, Lax/r0/j;->d:I

    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    iget v0, p0, Lax/r0/j;->b:I

    .line 91
    .line 92
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v2, :cond_8e

    .line 97
    .line 98
    if-ne v0, v1, :cond_89

    .line 99
    .line 100
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {p0, v0}, Lax/r0/j;->Y(I)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 110
    .line 111
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    add-int/2addr v1, v0

    .line 116
    :cond_73
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 117
    .line 118
    invoke-virtual {v0}, Lax/r0/i;->o()D

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 130
    .line 131
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-lt v0, v1, :cond_73

    .line 136
    .line 137
    goto :goto_a3

    .line 138
    :cond_89
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    throw p1

    .line 143
    :cond_8e
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lax/r0/i;->o()D

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 157
    .line 158
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a4

    .line 163
    .line 164
    :goto_a3
    return-void

    .line 165
    :cond_a4
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 166
    .line 167
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget v1, p0, Lax/r0/j;->b:I

    .line 172
    .line 173
    if-eq v0, v1, :cond_8e

    .line 174
    .line 175
    iput v0, p0, Lax/r0/j;->d:I

    .line 176
    .line 177
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->u()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->A()Ljava/lang/String;

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
    if-eqz v0, :cond_59

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/I;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_3a

    .line 17
    .line 18
    if-ne p1, v1, :cond_35

    .line 19
    .line 20
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-direct {p0, p1}, Lax/r0/j;->Y(I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, p1

    .line 36
    :cond_23
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/r0/i;->r()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 46
    .line 47
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lt p1, v1, :cond_23

    .line 52
    .line 53
    goto :goto_a3

    .line 54
    :cond_35
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1

    .line 59
    :cond_3a
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 60
    .line 61
    invoke-virtual {p1}, Lax/r0/i;->r()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 69
    .line 70
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4c

    .line 75
    .line 76
    goto :goto_a3

    .line 77
    :cond_4c
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 78
    .line 79
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget v1, p0, Lax/r0/j;->b:I

    .line 84
    .line 85
    if-eq p1, v1, :cond_3a

    .line 86
    .line 87
    iput p1, p0, Lax/r0/j;->d:I

    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    iget v0, p0, Lax/r0/j;->b:I

    .line 91
    .line 92
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v2, :cond_8e

    .line 97
    .line 98
    if-ne v0, v1, :cond_89

    .line 99
    .line 100
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {p0, v0}, Lax/r0/j;->Y(I)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 110
    .line 111
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    add-int/2addr v1, v0

    .line 116
    :cond_73
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 117
    .line 118
    invoke-virtual {v0}, Lax/r0/i;->r()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 130
    .line 131
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-lt v0, v1, :cond_73

    .line 136
    .line 137
    goto :goto_a3

    .line 138
    :cond_89
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    throw p1

    .line 143
    :cond_8e
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lax/r0/i;->r()J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 157
    .line 158
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a4

    .line 163
    .line 164
    :goto_a3
    return-void

    .line 165
    :cond_a4
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 166
    .line 167
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget v1, p0, Lax/r0/j;->b:I

    .line 172
    .line 173
    if-eq v0, v1, :cond_8e

    .line 174
    .line 175
    iput v0, p0, Lax/r0/j;->d:I

    .line 176
    .line 177
    return-void
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

.method public U(Ljava/util/List;Z)V
    .registers 5
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
    iget v0, p0, Lax/r0/j;->b:I

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
    if-ne v0, v1, :cond_53

    .line 9
    .line 10
    instance-of v0, p1, Lax/r0/G;

    .line 11
    .line 12
    if-eqz v0, :cond_2f

    .line 13
    .line 14
    if-nez p2, :cond_2f

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lax/r0/G;

    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/r0/j;->G()Lax/r0/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Lax/r0/G;->C0(Lax/r0/h;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_22

    .line 33
    .line 34
    goto :goto_45

    .line 35
    :cond_22
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget p2, p0, Lax/r0/j;->b:I

    .line 42
    .line 43
    if-eq p1, p2, :cond_12

    .line 44
    .line 45
    iput p1, p0, Lax/r0/j;->d:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    if-eqz p2, :cond_36

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/r0/j;->O()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_3a

    .line 55
    :cond_36
    invoke-virtual {p0}, Lax/r0/j;->C()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_3a
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 63
    .line 64
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_46

    .line 69
    .line 70
    :goto_45
    return-void

    .line 71
    :cond_46
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 72
    .line 73
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget v1, p0, Lax/r0/j;->b:I

    .line 78
    .line 79
    if-eq v0, v1, :cond_2f

    .line 80
    .line 81
    iput v0, p0, Lax/r0/j;->d:I

    .line 82
    .line 83
    return-void

    .line 84
    :cond_53
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v1}, Lax/r0/i;->C()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lax/r0/i;->l(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p2, Lax/r0/K$a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v3, p2, Lax/r0/K$a;->d:Ljava/lang/Object;

    .line 20
    .line 21
    :goto_14
    :try_start_14
    invoke-virtual {p0}, Lax/r0/j;->D()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const v5, 0x7fffffff

    .line 26
    .line 27
    .line 28
    if-eq v4, v5, :cond_5e

    .line 29
    .line 30
    iget-object v5, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 31
    .line 32
    invoke-virtual {v5}, Lax/r0/i;->e()Z

    .line 33
    .line 34
    .line 35
    move-result v5
    :try_end_23
    .catchall {:try_start_14 .. :try_end_23} :catchall_3a

    .line 36
    if-eqz v5, :cond_26

    .line 37
    .line 38
    goto :goto_5e

    .line 39
    :cond_26
    const/4 v5, 0x1

    .line 40
    const-string v6, "Unable to parse map entry."

    .line 41
    .line 42
    if-eq v4, v5, :cond_49

    .line 43
    .line 44
    if-eq v4, v0, :cond_3c

    .line 45
    .line 46
    :try_start_2d
    invoke-virtual {p0}, Lax/r0/j;->J()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_34

    .line 51
    .line 52
    goto :goto_14

    .line 53
    :cond_34
    new-instance v4, Lax/r0/B;

    .line 54
    .line 55
    invoke-direct {v4, v6}, Lax/r0/B;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v4

    .line 59
    :catchall_3a
    move-exception p1

    .line 60
    goto :goto_67

    .line 61
    :cond_3c
    iget-object v4, p2, Lax/r0/K$a;->c:Lax/r0/u0$b;

    .line 62
    .line 63
    iget-object v5, p2, Lax/r0/K$a;->d:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-direct {p0, v4, v5, p3}, Lax/r0/j;->R(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    goto :goto_14

    .line 74
    :cond_49
    iget-object v4, p2, Lax/r0/K$a;->a:Lax/r0/u0$b;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-direct {p0, v4, v5, v5}, Lax/r0/j;->R(Lax/r0/u0$b;Ljava/lang/Class;Lax/r0/p;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2
    :try_end_50
    .catch Lax/r0/B$a; {:try_start_2d .. :try_end_50} :catch_51
    .catchall {:try_start_2d .. :try_end_50} :catchall_3a

    .line 81
    goto :goto_14

    .line 82
    :catch_51
    :try_start_51
    invoke-virtual {p0}, Lax/r0/j;->J()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_58

    .line 87
    .line 88
    goto :goto_14

    .line 89
    :cond_58
    new-instance p1, Lax/r0/B;

    .line 90
    .line 91
    invoke-direct {p1, v6}, Lax/r0/B;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_5e
    :goto_5e
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_61
    .catchall {:try_start_51 .. :try_end_61} :catchall_3a

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lax/r0/i;->k(I)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_67
    iget-object p2, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 105
    .line 106
    invoke-virtual {p2, v1}, Lax/r0/i;->k(I)V

    .line 107
    .line 108
    .line 109
    throw p1
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lax/r0/j;->S(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

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

.method public c(Ljava/util/List;)V
    .registers 4
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->x()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->x()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->x()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->x()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->D()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->r()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lax/r0/j;->T(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

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
    .registers 6
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
    if-eqz v0, :cond_5b

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/z;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_38

    .line 17
    .line 18
    if-ne p1, v1, :cond_33

    .line 19
    .line 20
    :cond_13
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->v()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_26

    .line 36
    .line 37
    goto/16 :goto_b2

    .line 38
    .line 39
    :cond_26
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 40
    .line 41
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget v1, p0, Lax/r0/j;->b:I

    .line 46
    .line 47
    if-eq p1, v1, :cond_13

    .line 48
    .line 49
    iput p1, p0, Lax/r0/j;->d:I

    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1

    .line 57
    :cond_38
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Lax/r0/j;->X(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_49
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lax/r0/i;->v()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_49

    .line 90
    .line 91
    goto :goto_b2

    .line 92
    :cond_5b
    iget v0, p0, Lax/r0/j;->b:I

    .line 93
    .line 94
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v0, v2, :cond_8d

    .line 99
    .line 100
    if-ne v0, v1, :cond_88

    .line 101
    .line 102
    :cond_65
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 103
    .line 104
    invoke-virtual {v0}, Lax/r0/i;->v()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7b

    .line 122
    .line 123
    goto :goto_b2

    .line 124
    :cond_7b
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 125
    .line 126
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget v1, p0, Lax/r0/j;->b:I

    .line 131
    .line 132
    if-eq v0, v1, :cond_65

    .line 133
    .line 134
    iput v0, p0, Lax/r0/j;->d:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-direct {p0, v0}, Lax/r0/j;->X(I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 152
    .line 153
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/2addr v1, v0

    .line 158
    :cond_9d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lax/r0/i;->v()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 172
    .line 173
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-lt v0, v1, :cond_9d

    .line 178
    .line 179
    :goto_b2
    return-void
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->y()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->y()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->y()J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->y()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    .registers 4
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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

.method public j(Ljava/util/List;Lax/r0/h0;Lax/r0/p;)V
    .registers 6
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
    iget v0, p0, Lax/r0/j;->b:I

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
    if-ne v0, v1, :cond_2a

    .line 9
    .line 10
    iget v0, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    :cond_b
    invoke-direct {p0, p2, p3}, Lax/r0/j;->S(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/r0/i;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_29

    .line 26
    .line 27
    iget v1, p0, Lax/r0/j;->d:I

    .line 28
    .line 29
    if-eqz v1, :cond_1f

    .line 30
    .line 31
    goto :goto_29

    .line 32
    :cond_1f
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {v1}, Lax/r0/i;->B()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v1, v0, :cond_b

    .line 39
    .line 40
    iput v1, p0, Lax/r0/j;->d:I

    .line 41
    .line 42
    :cond_29
    :goto_29
    return-void

    .line 43
    :cond_2a
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    throw p1
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->q()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    iget v0, p0, Lax/r0/j;->b:I

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
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->w()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->D()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->D()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->D()J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->D()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

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
    invoke-direct {p0, p1, p2}, Lax/r0/j;->S(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

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
    .registers 6
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
    iget v0, p0, Lax/r0/j;->b:I

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
    if-ne v0, v1, :cond_2a

    .line 9
    .line 10
    iget v0, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    :cond_b
    invoke-direct {p0, p2, p3}, Lax/r0/j;->T(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/r0/i;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_29

    .line 26
    .line 27
    iget v1, p0, Lax/r0/j;->d:I

    .line 28
    .line 29
    if-eqz v1, :cond_1f

    .line 30
    .line 31
    goto :goto_29

    .line 32
    :cond_1f
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {v1}, Lax/r0/i;->B()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v1, v0, :cond_b

    .line 39
    .line 40
    iput v1, p0, Lax/r0/j;->d:I

    .line 41
    .line 42
    :cond_29
    :goto_29
    return-void

    .line 43
    :cond_2a
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    throw p1
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->o()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->s()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/I;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->u()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->u()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->u()J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->u()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    if-eqz v0, :cond_59

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/I;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_3a

    .line 17
    .line 18
    if-ne p1, v1, :cond_35

    .line 19
    .line 20
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-direct {p0, p1}, Lax/r0/j;->Y(I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, p1

    .line 36
    :cond_23
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/r0/i;->w()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0, v2, v3}, Lax/r0/I;->k(J)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 46
    .line 47
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lt p1, v1, :cond_23

    .line 52
    .line 53
    goto :goto_a3

    .line 54
    :cond_35
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1

    .line 59
    :cond_3a
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 60
    .line 61
    invoke-virtual {p1}, Lax/r0/i;->w()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-virtual {v0, v1, v2}, Lax/r0/I;->k(J)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 69
    .line 70
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4c

    .line 75
    .line 76
    goto :goto_a3

    .line 77
    :cond_4c
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 78
    .line 79
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget v1, p0, Lax/r0/j;->b:I

    .line 84
    .line 85
    if-eq p1, v1, :cond_3a

    .line 86
    .line 87
    iput p1, p0, Lax/r0/j;->d:I

    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    iget v0, p0, Lax/r0/j;->b:I

    .line 91
    .line 92
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v2, :cond_8e

    .line 97
    .line 98
    if-ne v0, v1, :cond_89

    .line 99
    .line 100
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 101
    .line 102
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {p0, v0}, Lax/r0/j;->Y(I)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 110
    .line 111
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    add-int/2addr v1, v0

    .line 116
    :cond_73
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 117
    .line 118
    invoke-virtual {v0}, Lax/r0/i;->w()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 130
    .line 131
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-lt v0, v1, :cond_73

    .line 136
    .line 137
    goto :goto_a3

    .line 138
    :cond_89
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    throw p1

    .line 143
    :cond_8e
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 144
    .line 145
    invoke-virtual {v0}, Lax/r0/i;->w()J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 157
    .line 158
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a4

    .line 163
    .line 164
    :goto_a3
    return-void

    .line 165
    :cond_a4
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 166
    .line 167
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget v1, p0, Lax/r0/j;->b:I

    .line 172
    .line 173
    if-eq v0, v1, :cond_8e

    .line 174
    .line 175
    iput v0, p0, Lax/r0/j;->d:I

    .line 176
    .line 177
    return-void
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
    .registers 4
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->t()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->t()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->t()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->t()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    .registers 4
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
    if-eqz v0, :cond_58

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/r0/z;

    .line 8
    .line 9
    iget p1, p0, Lax/r0/j;->b:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_39

    .line 16
    .line 17
    if-ne p1, v1, :cond_34

    .line 18
    .line 19
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, p1

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/r0/i;->p()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lt p1, v1, :cond_1f

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_39
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/r0/i;->p()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    goto :goto_a2

    .line 76
    :cond_4b
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iget v1, p0, Lax/r0/j;->b:I

    .line 83
    .line 84
    if-eq p1, v1, :cond_39

    .line 85
    .line 86
    iput p1, p0, Lax/r0/j;->d:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_58
    iget v0, p0, Lax/r0/j;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8d

    .line 96
    .line 97
    if-ne v0, v1, :cond_88

    .line 98
    .line 99
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 113
    .line 114
    invoke-virtual {v0}, Lax/r0/i;->p()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-lt v0, v1, :cond_6f

    .line 132
    .line 133
    invoke-direct {p0, v1}, Lax/r0/j;->V(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->p()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 156
    .line 157
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a3

    .line 162
    .line 163
    :goto_a2
    return-void

    .line 164
    :cond_a3
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 165
    .line 166
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget v1, p0, Lax/r0/j;->b:I

    .line 171
    .line 172
    if-eq v0, v1, :cond_8d

    .line 173
    .line 174
    iput v0, p0, Lax/r0/j;->d:I

    .line 175
    .line 176
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->p()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

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
    invoke-direct {p0, p1, p2}, Lax/r0/j;->T(Lax/r0/h0;Lax/r0/p;)Ljava/lang/Object;

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
    .registers 6
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
    if-eqz v0, :cond_5b

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/r0/z;

    .line 9
    .line 10
    iget p1, p0, Lax/r0/j;->b:I

    .line 11
    .line 12
    invoke-static {p1}, Lax/r0/u0;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eq p1, v2, :cond_38

    .line 17
    .line 18
    if-ne p1, v1, :cond_33

    .line 19
    .line 20
    :cond_13
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/r0/i;->q()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/r0/i;->e()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_26

    .line 36
    .line 37
    goto/16 :goto_b2

    .line 38
    .line 39
    :cond_26
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 40
    .line 41
    invoke-virtual {p1}, Lax/r0/i;->B()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget v1, p0, Lax/r0/j;->b:I

    .line 46
    .line 47
    if-eq p1, v1, :cond_13

    .line 48
    .line 49
    iput p1, p0, Lax/r0/j;->d:I

    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1

    .line 57
    :cond_38
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 58
    .line 59
    invoke-virtual {p1}, Lax/r0/i;->C()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Lax/r0/j;->X(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    :cond_49
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 75
    .line 76
    invoke-virtual {p1}, Lax/r0/i;->q()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, p1}, Lax/r0/z;->i(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 84
    .line 85
    invoke-virtual {p1}, Lax/r0/i;->d()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lt p1, v3, :cond_49

    .line 90
    .line 91
    goto :goto_b2

    .line 92
    :cond_5b
    iget v0, p0, Lax/r0/j;->b:I

    .line 93
    .line 94
    invoke-static {v0}, Lax/r0/u0;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v0, v2, :cond_8d

    .line 99
    .line 100
    if-ne v0, v1, :cond_88

    .line 101
    .line 102
    :cond_65
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 103
    .line 104
    invoke-virtual {v0}, Lax/r0/i;->q()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 116
    .line 117
    invoke-virtual {v0}, Lax/r0/i;->e()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7b

    .line 122
    .line 123
    goto :goto_b2

    .line 124
    :cond_7b
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 125
    .line 126
    invoke-virtual {v0}, Lax/r0/i;->B()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget v1, p0, Lax/r0/j;->b:I

    .line 131
    .line 132
    if-eq v0, v1, :cond_65

    .line 133
    .line 134
    iput v0, p0, Lax/r0/j;->d:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    invoke-static {}, Lax/r0/B;->d()Lax/r0/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    throw p1

    .line 142
    :cond_8d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/r0/i;->C()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-direct {p0, v0}, Lax/r0/j;->X(I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 152
    .line 153
    invoke-virtual {v1}, Lax/r0/i;->d()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/2addr v1, v0

    .line 158
    :cond_9d
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 159
    .line 160
    invoke-virtual {v0}, Lax/r0/i;->q()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 172
    .line 173
    invoke-virtual {v0}, Lax/r0/i;->d()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-lt v0, v1, :cond_9d

    .line 178
    .line 179
    :goto_b2
    return-void
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
    invoke-direct {p0, v0}, Lax/r0/j;->W(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/j;->a:Lax/r0/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r0/i;->x()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
