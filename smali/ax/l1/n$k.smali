.class final Lax/l1/n$k;
.super Lax/l1/n$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/l1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/l1/n$j<",
        "Lax/l1/n$k;",
        ">;"
    }
.end annotation


# instance fields
.field private final f0:Z

.field private final g0:Lax/l1/n$e;

.field private final h0:Z

.field private final i0:Z

.field private final j0:Z

.field private final k0:I

.field private final l0:I

.field private final m0:I

.field private final n0:I

.field private final o0:I

.field private final p0:I

.field private final q0:Z

.field private final r0:I

.field private final s0:Z

.field private final t0:I

.field private final u0:Z

.field private final v0:Z

.field private final w0:I


# direct methods
.method public constructor <init>(ILax/P0/P;ILax/l1/n$e;ILjava/lang/String;IZ)V
    .registers 13

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/l1/n$j;-><init>(ILax/P0/P;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 5
    .line 6
    iget-boolean p1, p4, Lax/l1/n$e;->r0:Z

    .line 7
    .line 8
    if-eqz p1, :cond_c

    .line 9
    .line 10
    const/16 p1, 0x18

    .line 11
    .line 12
    goto :goto_e

    .line 13
    :cond_c
    const/16 p1, 0x10

    .line 14
    .line 15
    :goto_e
    iget-boolean p2, p4, Lax/l1/n$e;->q0:Z

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p2, :cond_1a

    .line 20
    .line 21
    and-int p2, p7, p1

    .line 22
    .line 23
    if-eqz p2, :cond_1a

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 p2, 0x0

    .line 28
    :goto_1b
    iput-boolean p2, p0, Lax/l1/n$k;->s0:Z

    .line 29
    .line 30
    const/high16 p2, -0x40800000    # -1.0f

    .line 31
    .line 32
    const/4 p7, -0x1

    .line 33
    if-eqz p8, :cond_4b

    .line 34
    .line 35
    iget-object v1, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 36
    .line 37
    iget v2, v1, Lax/P0/v;->v:I

    .line 38
    .line 39
    if-eq v2, p7, :cond_2c

    .line 40
    .line 41
    iget v3, p4, Lax/P0/T;->a:I

    .line 42
    .line 43
    if-gt v2, v3, :cond_4b

    .line 44
    .line 45
    :cond_2c
    iget v2, v1, Lax/P0/v;->w:I

    .line 46
    .line 47
    if-eq v2, p7, :cond_34

    .line 48
    .line 49
    iget v3, p4, Lax/P0/T;->b:I

    .line 50
    .line 51
    if-gt v2, v3, :cond_4b

    .line 52
    .line 53
    :cond_34
    iget v2, v1, Lax/P0/v;->z:F

    .line 54
    .line 55
    cmpl-float v3, v2, p2

    .line 56
    .line 57
    if-eqz v3, :cond_41

    .line 58
    .line 59
    iget v3, p4, Lax/P0/T;->c:I

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    cmpg-float v2, v2, v3

    .line 63
    .line 64
    if-gtz v2, :cond_4b

    .line 65
    .line 66
    :cond_41
    iget v1, v1, Lax/P0/v;->j:I

    .line 67
    .line 68
    if-eq v1, p7, :cond_49

    .line 69
    .line 70
    iget v2, p4, Lax/P0/T;->d:I

    .line 71
    .line 72
    if-gt v1, v2, :cond_4b

    .line 73
    .line 74
    :cond_49
    const/4 v1, 0x1

    .line 75
    goto :goto_4c

    .line 76
    :cond_4b
    const/4 v1, 0x0

    .line 77
    :goto_4c
    iput-boolean v1, p0, Lax/l1/n$k;->f0:Z

    .line 78
    .line 79
    if-eqz p8, :cond_79

    .line 80
    .line 81
    iget-object p8, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 82
    .line 83
    iget v1, p8, Lax/P0/v;->v:I

    .line 84
    .line 85
    if-eq v1, p7, :cond_5a

    .line 86
    .line 87
    iget v2, p4, Lax/P0/T;->e:I

    .line 88
    .line 89
    if-lt v1, v2, :cond_79

    .line 90
    .line 91
    :cond_5a
    iget v1, p8, Lax/P0/v;->w:I

    .line 92
    .line 93
    if-eq v1, p7, :cond_62

    .line 94
    .line 95
    iget v2, p4, Lax/P0/T;->f:I

    .line 96
    .line 97
    if-lt v1, v2, :cond_79

    .line 98
    .line 99
    :cond_62
    iget v1, p8, Lax/P0/v;->z:F

    .line 100
    .line 101
    cmpl-float v2, v1, p2

    .line 102
    .line 103
    if-eqz v2, :cond_6f

    .line 104
    .line 105
    iget v2, p4, Lax/P0/T;->g:I

    .line 106
    .line 107
    int-to-float v2, v2

    .line 108
    cmpl-float v1, v1, v2

    .line 109
    .line 110
    if-ltz v1, :cond_79

    .line 111
    .line 112
    :cond_6f
    iget p8, p8, Lax/P0/v;->j:I

    .line 113
    .line 114
    if-eq p8, p7, :cond_77

    .line 115
    .line 116
    iget p7, p4, Lax/P0/T;->h:I

    .line 117
    .line 118
    if-lt p8, p7, :cond_79

    .line 119
    .line 120
    :cond_77
    const/4 p7, 0x1

    .line 121
    goto :goto_7a

    .line 122
    :cond_79
    const/4 p7, 0x0

    .line 123
    :goto_7a
    iput-boolean p7, p0, Lax/l1/n$k;->h0:Z

    .line 124
    .line 125
    invoke-static {p5, v0}, Lax/Y0/V;->l(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result p7

    .line 129
    iput-boolean p7, p0, Lax/l1/n$k;->i0:Z

    .line 130
    .line 131
    iget-object p7, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 132
    .line 133
    iget p8, p7, Lax/P0/v;->z:F

    .line 134
    .line 135
    cmpl-float p2, p8, p2

    .line 136
    .line 137
    if-eqz p2, :cond_92

    .line 138
    .line 139
    const/high16 p2, 0x41200000    # 10.0f

    .line 140
    .line 141
    cmpl-float p2, p8, p2

    .line 142
    .line 143
    if-ltz p2, :cond_92

    .line 144
    .line 145
    const/4 p2, 0x1

    .line 146
    goto :goto_93

    .line 147
    :cond_92
    const/4 p2, 0x0

    .line 148
    :goto_93
    iput-boolean p2, p0, Lax/l1/n$k;->j0:Z

    .line 149
    .line 150
    iget p2, p7, Lax/P0/v;->j:I

    .line 151
    .line 152
    iput p2, p0, Lax/l1/n$k;->k0:I

    .line 153
    .line 154
    invoke-virtual {p7}, Lax/P0/v;->g()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iput p2, p0, Lax/l1/n$k;->l0:I

    .line 159
    .line 160
    const/4 p2, 0x0

    .line 161
    :goto_a0
    iget-object p7, p4, Lax/P0/T;->n:Lax/r7/z;

    .line 162
    .line 163
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    .line 164
    .line 165
    .line 166
    move-result p7

    .line 167
    const p8, 0x7fffffff

    .line 168
    .line 169
    .line 170
    if-ge p2, p7, :cond_bf

    .line 171
    .line 172
    iget-object p7, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 173
    .line 174
    iget-object v1, p4, Lax/P0/T;->n:Lax/r7/z;

    .line 175
    .line 176
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {p7, v1, v0}, Lax/l1/n;->I(Lax/P0/v;Ljava/lang/String;Z)I

    .line 183
    .line 184
    .line 185
    move-result p7

    .line 186
    if-lez p7, :cond_bc

    .line 187
    .line 188
    goto :goto_c3

    .line 189
    :cond_bc
    add-int/lit8 p2, p2, 0x1

    .line 190
    .line 191
    goto :goto_a0

    .line 192
    :cond_bf
    const p2, 0x7fffffff

    .line 193
    .line 194
    .line 195
    const/4 p7, 0x0

    .line 196
    :goto_c3
    iput p2, p0, Lax/l1/n$k;->n0:I

    .line 197
    .line 198
    iput p7, p0, Lax/l1/n$k;->o0:I

    .line 199
    .line 200
    iget-object p2, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 201
    .line 202
    iget p2, p2, Lax/P0/v;->f:I

    .line 203
    .line 204
    iget p7, p4, Lax/P0/T;->o:I

    .line 205
    .line 206
    invoke-static {p2, p7}, Lax/l1/n;->z(II)I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    iput p2, p0, Lax/l1/n$k;->p0:I

    .line 211
    .line 212
    iget-object p2, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 213
    .line 214
    iget p2, p2, Lax/P0/v;->f:I

    .line 215
    .line 216
    if-eqz p2, :cond_df

    .line 217
    .line 218
    and-int/2addr p2, p3

    .line 219
    if-eqz p2, :cond_dd

    .line 220
    .line 221
    goto :goto_df

    .line 222
    :cond_dd
    const/4 p2, 0x0

    .line 223
    goto :goto_e0

    .line 224
    :cond_df
    :goto_df
    const/4 p2, 0x1

    .line 225
    :goto_e0
    iput-boolean p2, p0, Lax/l1/n$k;->q0:Z

    .line 226
    .line 227
    invoke-static {p6}, Lax/l1/n;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    if-nez p2, :cond_ea

    .line 232
    .line 233
    const/4 p2, 0x1

    .line 234
    goto :goto_eb

    .line 235
    :cond_ea
    const/4 p2, 0x0

    .line 236
    :goto_eb
    iget-object p7, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 237
    .line 238
    invoke-static {p7, p6, p2}, Lax/l1/n;->I(Lax/P0/v;Ljava/lang/String;Z)I

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    iput p2, p0, Lax/l1/n$k;->r0:I

    .line 243
    .line 244
    const/4 p2, 0x0

    .line 245
    :goto_f4
    iget-object p6, p4, Lax/P0/T;->m:Lax/r7/z;

    .line 246
    .line 247
    invoke-virtual {p6}, Ljava/util/AbstractCollection;->size()I

    .line 248
    .line 249
    .line 250
    move-result p6

    .line 251
    if-ge p2, p6, :cond_113

    .line 252
    .line 253
    iget-object p6, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 254
    .line 255
    iget-object p6, p6, Lax/P0/v;->o:Ljava/lang/String;

    .line 256
    .line 257
    if-eqz p6, :cond_110

    .line 258
    .line 259
    iget-object p7, p4, Lax/P0/T;->m:Lax/r7/z;

    .line 260
    .line 261
    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p7

    .line 265
    invoke-virtual {p6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p6

    .line 269
    if-eqz p6, :cond_110

    .line 270
    .line 271
    move p8, p2

    .line 272
    goto :goto_113

    .line 273
    :cond_110
    add-int/lit8 p2, p2, 0x1

    .line 274
    .line 275
    goto :goto_f4

    .line 276
    :cond_113
    :goto_113
    iput p8, p0, Lax/l1/n$k;->m0:I

    .line 277
    .line 278
    invoke-static {p5}, Lax/Y0/V;->h(I)I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    const/16 p4, 0x80

    .line 283
    .line 284
    if-ne p2, p4, :cond_11f

    .line 285
    .line 286
    const/4 p2, 0x1

    .line 287
    goto :goto_120

    .line 288
    :cond_11f
    const/4 p2, 0x0

    .line 289
    :goto_120
    iput-boolean p2, p0, Lax/l1/n$k;->u0:Z

    .line 290
    .line 291
    invoke-static {p5}, Lax/Y0/V;->j(I)I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    const/16 p4, 0x40

    .line 296
    .line 297
    if-ne p2, p4, :cond_12b

    .line 298
    .line 299
    goto :goto_12c

    .line 300
    :cond_12b
    const/4 p3, 0x0

    .line 301
    :goto_12c
    iput-boolean p3, p0, Lax/l1/n$k;->v0:Z

    .line 302
    .line 303
    iget-object p2, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 304
    .line 305
    iget-object p2, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 306
    .line 307
    invoke-static {p2}, Lax/l1/n;->A(Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    move-result p2

    .line 311
    iput p2, p0, Lax/l1/n$k;->w0:I

    .line 312
    .line 313
    invoke-direct {p0, p5, p1}, Lax/l1/n$k;->s(II)I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    iput p1, p0, Lax/l1/n$k;->t0:I

    .line 318
    .line 319
    return-void
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

.method public static synthetic j(Lax/l1/n$k;Lax/l1/n$k;)I
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/l1/n$k;->p(Lax/l1/n$k;Lax/l1/n$k;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lax/l1/n$k;Lax/l1/n$k;)I
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/l1/n$k;->n(Lax/l1/n$k;Lax/l1/n$k;)I

    move-result p0

    return p0
.end method

.method private static n(Lax/l1/n$k;Lax/l1/n$k;)I
    .registers 6

    .line 1
    invoke-static {}, Lax/r7/n;->j()Lax/r7/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lax/l1/n$k;->i0:Z

    .line 6
    .line 7
    iget-boolean v2, p1, Lax/l1/n$k;->i0:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lax/l1/n$k;->n0:I

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, p1, Lax/l1/n$k;->n0:I

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {}, Lax/r7/T;->d()Lax/r7/T;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lax/r7/T;->g()Lax/r7/T;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v1, v2, v3}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v1, p0, Lax/l1/n$k;->o0:I

    .line 38
    .line 39
    iget v2, p1, Lax/l1/n$k;->o0:I

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->d(II)Lax/r7/n;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v1, p0, Lax/l1/n$k;->p0:I

    .line 46
    .line 47
    iget v2, p1, Lax/l1/n$k;->p0:I

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->d(II)Lax/r7/n;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-boolean v1, p0, Lax/l1/n$k;->q0:Z

    .line 54
    .line 55
    iget-boolean v2, p1, Lax/l1/n$k;->q0:Z

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v1, p0, Lax/l1/n$k;->r0:I

    .line 62
    .line 63
    iget v2, p1, Lax/l1/n$k;->r0:I

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->d(II)Lax/r7/n;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-boolean v1, p0, Lax/l1/n$k;->j0:Z

    .line 70
    .line 71
    iget-boolean v2, p1, Lax/l1/n$k;->j0:Z

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v1, p0, Lax/l1/n$k;->f0:Z

    .line 78
    .line 79
    iget-boolean v2, p1, Lax/l1/n$k;->f0:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v1, p0, Lax/l1/n$k;->h0:Z

    .line 86
    .line 87
    iget-boolean v2, p1, Lax/l1/n$k;->h0:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v1, p0, Lax/l1/n$k;->m0:I

    .line 94
    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget v2, p1, Lax/l1/n$k;->m0:I

    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {}, Lax/r7/T;->d()Lax/r7/T;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Lax/r7/T;->g()Lax/r7/T;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v0, v1, v2, v3}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-boolean v1, p0, Lax/l1/n$k;->u0:Z

    .line 118
    .line 119
    iget-boolean v2, p1, Lax/l1/n$k;->u0:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-boolean v1, p0, Lax/l1/n$k;->v0:Z

    .line 126
    .line 127
    iget-boolean v2, p1, Lax/l1/n$k;->v0:Z

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->g(ZZ)Lax/r7/n;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-boolean v1, p0, Lax/l1/n$k;->u0:Z

    .line 134
    .line 135
    if-eqz v1, :cond_94

    .line 136
    .line 137
    iget-boolean v1, p0, Lax/l1/n$k;->v0:Z

    .line 138
    .line 139
    if-eqz v1, :cond_94

    .line 140
    .line 141
    iget p0, p0, Lax/l1/n$k;->w0:I

    .line 142
    .line 143
    iget p1, p1, Lax/l1/n$k;->w0:I

    .line 144
    .line 145
    invoke-virtual {v0, p0, p1}, Lax/r7/n;->d(II)Lax/r7/n;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_94
    invoke-virtual {v0}, Lax/r7/n;->i()I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    return p0
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

.method private static p(Lax/l1/n$k;Lax/l1/n$k;)I
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/l1/n$k;->f0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/l1/n$k;->i0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    invoke-static {}, Lax/l1/n;->B()Lax/r7/T;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_15

    .line 14
    :cond_d
    invoke-static {}, Lax/l1/n;->B()Lax/r7/T;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/r7/T;->g()Lax/r7/T;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_15
    invoke-static {}, Lax/r7/n;->j()Lax/r7/n;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 27
    .line 28
    iget-boolean v2, v2, Lax/P0/T;->B:Z

    .line 29
    .line 30
    if-eqz v2, :cond_37

    .line 31
    .line 32
    iget v2, p0, Lax/l1/n$k;->k0:I

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v3, p1, Lax/l1/n$k;->k0:I

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {}, Lax/l1/n;->B()Lax/r7/T;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Lax/r7/T;->g()Lax/r7/T;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v1, v2, v3, v4}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_37
    iget v2, p0, Lax/l1/n$k;->l0:I

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget v3, p1, Lax/l1/n$k;->l0:I

    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1, v2, v3, v0}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget p0, p0, Lax/l1/n$k;->k0:I

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget p1, p1, Lax/l1/n$k;->k0:I

    .line 79
    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {v1, p0, p1, v0}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Lax/r7/n;->i()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0
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

.method public static q(Ljava/util/List;Ljava/util/List;)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/l1/n$k;",
            ">;",
            "Ljava/util/List<",
            "Lax/l1/n$k;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/r7/n;->j()Lax/r7/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lax/l1/A;

    .line 6
    .line 7
    invoke-direct {v1}, Lax/l1/A;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lax/l1/n$k;

    .line 15
    .line 16
    new-instance v2, Lax/l1/A;

    .line 17
    .line 18
    invoke-direct {v2}, Lax/l1/A;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lax/l1/n$k;

    .line 26
    .line 27
    new-instance v3, Lax/l1/A;

    .line 28
    .line 29
    invoke-direct {v3}, Lax/l1/A;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, v3}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0, v1, v2}, Lax/r7/n;->d(II)Lax/r7/n;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lax/l1/B;

    .line 49
    .line 50
    invoke-direct {v1}, Lax/l1/B;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lax/l1/n$k;

    .line 58
    .line 59
    new-instance v1, Lax/l1/B;

    .line 60
    .line 61
    invoke-direct {v1}, Lax/l1/B;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lax/l1/n$k;

    .line 69
    .line 70
    new-instance v1, Lax/l1/B;

    .line 71
    .line 72
    invoke-direct {v1}, Lax/l1/B;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p0, p1, v1}, Lax/r7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lax/r7/n;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Lax/r7/n;->i()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0
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

.method public static r(ILax/P0/P;Lax/l1/n$e;[ILjava/lang/String;ILandroid/graphics/Point;)Lax/r7/z;
    .registers 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lax/P0/P;",
            "Lax/l1/n$e;",
            "[I",
            "Ljava/lang/String;",
            "I",
            "Landroid/graphics/Point;",
            ")",
            "Lax/r7/z<",
            "Lax/l1/n$k;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    iget v1, p2, Lax/P0/T;->i:I

    .line 9
    .line 10
    :goto_9
    if-eqz v0, :cond_e

    .line 11
    .line 12
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 13
    .line 14
    goto :goto_10

    .line 15
    :cond_e
    iget v0, p2, Lax/P0/T;->j:I

    .line 16
    .line 17
    :goto_10
    iget-boolean v2, p2, Lax/P0/T;->l:Z

    .line 18
    .line 19
    invoke-static {p1, v1, v0, v2}, Lax/l1/n;->y(Lax/P0/P;IIZ)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    :goto_1c
    iget v3, p1, Lax/P0/P;->a:I

    .line 30
    .line 31
    if-ge v6, v3, :cond_4b

    .line 32
    .line 33
    invoke-virtual {p1, v6}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lax/P0/v;->g()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const v4, 0x7fffffff

    .line 42
    .line 43
    .line 44
    if-eq v0, v4, :cond_35

    .line 45
    .line 46
    const/4 v4, -0x1

    .line 47
    if-eq v3, v4, :cond_33

    .line 48
    .line 49
    if-gt v3, v0, :cond_33

    .line 50
    .line 51
    goto :goto_35

    .line 52
    :cond_33
    const/4 v11, 0x0

    .line 53
    goto :goto_37

    .line 54
    :cond_35
    :goto_35
    const/4 v3, 0x1

    .line 55
    const/4 v11, 0x1

    .line 56
    :goto_37
    new-instance v3, Lax/l1/n$k;

    .line 57
    .line 58
    aget v8, p3, v6

    .line 59
    .line 60
    move v4, p0

    .line 61
    move-object v5, p1

    .line 62
    move-object v7, p2

    .line 63
    move-object/from16 v9, p4

    .line 64
    .line 65
    move/from16 v10, p5

    .line 66
    .line 67
    invoke-direct/range {v3 .. v11}, Lax/l1/n$k;-><init>(ILax/P0/P;ILax/l1/n$e;ILjava/lang/String;IZ)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_1c

    .line 76
    :cond_4b
    invoke-virtual {v1}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
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

.method private s(II)I
    .registers 5

    .line 1
    iget-object v0, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 2
    .line 3
    iget v0, v0, Lax/P0/v;->f:I

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x4000

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    iget-object v0, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 12
    .line 13
    iget-boolean v0, v0, Lax/l1/n$e;->A0:Z

    .line 14
    .line 15
    invoke-static {p1, v0}, Lax/Y0/V;->l(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    iget-boolean v0, p0, Lax/l1/n$k;->f0:Z

    .line 23
    .line 24
    if-nez v0, :cond_20

    .line 25
    .line 26
    iget-object v0, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 27
    .line 28
    iget-boolean v0, v0, Lax/l1/n$e;->p0:Z

    .line 29
    .line 30
    if-nez v0, :cond_20

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    invoke-static {p1, v1}, Lax/Y0/V;->l(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_44

    .line 38
    .line 39
    iget-boolean v0, p0, Lax/l1/n$k;->h0:Z

    .line 40
    .line 41
    if-eqz v0, :cond_44

    .line 42
    .line 43
    iget-boolean v0, p0, Lax/l1/n$k;->f0:Z

    .line 44
    .line 45
    if-eqz v0, :cond_44

    .line 46
    .line 47
    iget-object v0, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 48
    .line 49
    iget v0, v0, Lax/P0/v;->j:I

    .line 50
    .line 51
    const/4 v1, -0x1

    .line 52
    if-eq v0, v1, :cond_44

    .line 53
    .line 54
    iget-object v0, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 55
    .line 56
    iget-boolean v1, v0, Lax/P0/T;->C:Z

    .line 57
    .line 58
    if-nez v1, :cond_44

    .line 59
    .line 60
    iget-boolean v0, v0, Lax/P0/T;->B:Z

    .line 61
    .line 62
    if-nez v0, :cond_44

    .line 63
    .line 64
    and-int/2addr p1, p2

    .line 65
    if-eqz p1, :cond_44

    .line 66
    .line 67
    const/4 p1, 0x2

    .line 68
    return p1

    .line 69
    :cond_44
    const/4 p1, 0x1

    .line 70
    return p1
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


# virtual methods
.method public d()I
    .registers 2

    .line 1
    iget v0, p0, Lax/l1/n$k;->t0:I

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

.method public bridge synthetic h(Lax/l1/n$j;)Z
    .registers 2

    .line 1
    check-cast p1, Lax/l1/n$k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/l1/n$k;->t(Lax/l1/n$k;)Z

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

.method public t(Lax/l1/n$k;)Z
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/l1/n$k;->s0:Z

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    iget-object v0, p0, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 6
    .line 7
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p1, Lax/l1/n$j;->e0:Lax/P0/v;

    .line 10
    .line 11
    iget-object v1, v1, Lax/P0/v;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_25

    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lax/l1/n$k;->g0:Lax/l1/n$e;

    .line 20
    .line 21
    iget-boolean v0, v0, Lax/l1/n$e;->s0:Z

    .line 22
    .line 23
    if-nez v0, :cond_27

    .line 24
    .line 25
    iget-boolean v0, p0, Lax/l1/n$k;->u0:Z

    .line 26
    .line 27
    iget-boolean v1, p1, Lax/l1/n$k;->u0:Z

    .line 28
    .line 29
    if-ne v0, v1, :cond_25

    .line 30
    .line 31
    iget-boolean v0, p0, Lax/l1/n$k;->v0:Z

    .line 32
    .line 33
    iget-boolean p1, p1, Lax/l1/n$k;->v0:Z

    .line 34
    .line 35
    if-ne v0, p1, :cond_25

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_27
    :goto_27
    const/4 p1, 0x1

    .line 41
    return p1
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
