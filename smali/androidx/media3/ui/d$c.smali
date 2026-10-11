.class final Landroidx/media3/ui/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/H$d;
.implements Landroidx/media3/ui/G$a;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/ui/d;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/ui/d$c;-><init>(Landroidx/media3/ui/d;)V

    return-void
.end method


# virtual methods
.method public synthetic D(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->r(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic E(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->k(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic F(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->v(Lax/P0/H$d;I)V

    return-void
.end method

.method public G(Landroidx/media3/ui/G;J)V
    .registers 8

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->e(Landroidx/media3/ui/d;Z)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/ui/d;->f(Landroidx/media3/ui/d;)Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_28

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/media3/ui/d;->f(Landroidx/media3/ui/d;)Landroid/widget/TextView;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 23
    .line 24
    invoke-static {v2}, Landroidx/media3/ui/d;->g(Landroidx/media3/ui/d;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 29
    .line 30
    invoke-static {v3}, Landroidx/media3/ui/d;->h(Landroidx/media3/ui/d;)Ljava/util/Formatter;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v2, v3, p2, p3}, Lax/S0/d0;->q0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 42
    .line 43
    invoke-static {p2}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2}, Landroidx/media3/ui/w;->R()V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 51
    .line 52
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-eqz p2, :cond_c9

    .line 57
    .line 58
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 59
    .line 60
    invoke-static {p2}, Landroidx/media3/ui/d;->k(Landroidx/media3/ui/d;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_c9

    .line 65
    .line 66
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 67
    .line 68
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-static {p2, p3}, Landroidx/media3/ui/d;->l(Landroidx/media3/ui/d;Lax/P0/H;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_72

    .line 77
    .line 78
    :try_start_4d
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 79
    .line 80
    invoke-static {p2}, Landroidx/media3/ui/d;->m(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    iget-object p3, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 91
    .line 92
    invoke-static {p3}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    new-array v0, v1, [Ljava/lang/Object;

    .line 97
    .line 98
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 99
    .line 100
    aput-object v1, v0, p1

    .line 101
    .line 102
    invoke-virtual {p2, p3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_68
    .catch Ljava/lang/IllegalAccessException; {:try_start_4d .. :try_end_68} :catch_6b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4d .. :try_end_68} :catch_69

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catch_69
    move-exception p1

    .line 107
    goto :goto_6c

    .line 108
    :catch_6b
    move-exception p1

    .line 109
    :goto_6c
    new-instance p2, Ljava/lang/RuntimeException;

    .line 110
    .line 111
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw p2

    .line 115
    :cond_72
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 116
    .line 117
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-static {p2, p3}, Landroidx/media3/ui/d;->n(Landroidx/media3/ui/d;Lax/P0/H;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_a3

    .line 126
    .line 127
    :try_start_7e
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 128
    .line 129
    invoke-static {p2}, Landroidx/media3/ui/d;->o(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    check-cast p2, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    iget-object p3, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 140
    .line 141
    invoke-static {p3}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    new-array v0, v1, [Ljava/lang/Object;

    .line 146
    .line 147
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    aput-object v1, v0, p1

    .line 150
    .line 151
    invoke-virtual {p2, p3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_99
    .catch Ljava/lang/IllegalAccessException; {:try_start_7e .. :try_end_99} :catch_9c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7e .. :try_end_99} :catch_9a

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catch_9a
    move-exception p1

    .line 156
    goto :goto_9d

    .line 157
    :catch_9c
    move-exception p1

    .line 158
    :goto_9d
    new-instance p2, Ljava/lang/RuntimeException;

    .line 159
    .line 160
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw p2

    .line 164
    :cond_a3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string p2, "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can\'t enable scrubbing mode). player.class="

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 175
    .line 176
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    check-cast p2, Lax/P0/H;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string p2, "PlayerControlView"

    .line 198
    .line 199
    invoke-static {p2, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_c9
    return-void
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

.method public synthetic H(Lax/P0/V;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->E(Lax/P0/H$d;Lax/P0/V;)V

    return-void
.end method

.method public synthetic I(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->i(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic J(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->t(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public K(Landroidx/media3/ui/G;J)V
    .registers 6

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/d;->f(Landroidx/media3/ui/d;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_21

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/media3/ui/d;->f(Landroidx/media3/ui/d;)Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/media3/ui/d;->g(Landroidx/media3/ui/d;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 22
    .line 23
    invoke-static {v1}, Landroidx/media3/ui/d;->h(Landroidx/media3/ui/d;)Ljava/util/Formatter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1, p2, p3}, Lax/S0/d0;->q0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 35
    .line 36
    invoke-static {p1}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p1, v0}, Landroidx/media3/ui/d;->p(Landroidx/media3/ui/d;Lax/P0/H;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_36

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 47
    .line 48
    invoke-static {p1}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {p1, v0, p2, p3}, Landroidx/media3/ui/d;->q(Landroidx/media3/ui/d;Lax/P0/H;J)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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

.method public synthetic L(F)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->G(Lax/P0/H$d;F)V

    return-void
.end method

.method public M(Landroidx/media3/ui/G;JZ)V
    .registers 7

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->e(Landroidx/media3/ui/d;Z)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_7c

    .line 15
    .line 16
    if-nez p4, :cond_1a

    .line 17
    .line 18
    iget-object p4, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 19
    .line 20
    invoke-static {p4}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p4, v0, p2, p3}, Landroidx/media3/ui/d;->q(Landroidx/media3/ui/d;Lax/P0/H;J)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 28
    .line 29
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {p2, p3}, Landroidx/media3/ui/d;->l(Landroidx/media3/ui/d;Lax/P0/H;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_4b

    .line 38
    .line 39
    :try_start_26
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 40
    .line 41
    invoke-static {p2}, Landroidx/media3/ui/d;->m(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    iget-object p3, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 52
    .line 53
    invoke-static {p3}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    new-array p1, p1, [Ljava/lang/Object;

    .line 58
    .line 59
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    aput-object p4, p1, v1

    .line 62
    .line 63
    invoke-virtual {p2, p3, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_41
    .catch Ljava/lang/IllegalAccessException; {:try_start_26 .. :try_end_41} :catch_44
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_26 .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    goto :goto_7c

    .line 67
    :catch_42
    move-exception p1

    .line 68
    goto :goto_45

    .line 69
    :catch_44
    move-exception p1

    .line 70
    :goto_45
    new-instance p2, Ljava/lang/RuntimeException;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_4b
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 77
    .line 78
    invoke-static {p2}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-static {p2, p3}, Landroidx/media3/ui/d;->n(Landroidx/media3/ui/d;Lax/P0/H;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_7c

    .line 87
    .line 88
    :try_start_57
    iget-object p2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 89
    .line 90
    invoke-static {p2}, Landroidx/media3/ui/d;->o(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Ljava/lang/reflect/Method;

    .line 99
    .line 100
    iget-object p3, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 101
    .line 102
    invoke-static {p3}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    new-array p1, p1, [Ljava/lang/Object;

    .line 107
    .line 108
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    aput-object p4, p1, v1

    .line 111
    .line 112
    invoke-virtual {p2, p3, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_72
    .catch Ljava/lang/IllegalAccessException; {:try_start_57 .. :try_end_72} :catch_75
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_57 .. :try_end_72} :catch_73

    .line 113
    .line 114
    .line 115
    goto :goto_7c

    .line 116
    :catch_73
    move-exception p1

    .line 117
    goto :goto_76

    .line 118
    :catch_75
    move-exception p1

    .line 119
    :goto_76
    new-instance p2, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_7c
    :goto_7c
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 126
    .line 127
    invoke-static {p1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Landroidx/media3/ui/w;->S()V

    .line 132
    .line 133
    .line 134
    return-void
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

.method public synthetic N(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->s(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public synthetic O(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->q(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic P(Lax/P0/N;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->C(Lax/P0/H$d;Lax/P0/N;I)V

    return-void
.end method

.method public synthetic S(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->z(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic U(Lax/P0/T;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->D(Lax/P0/H$d;Lax/P0/T;)V

    return-void
.end method

.method public synthetic W(Lax/P0/H$b;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->c(Lax/P0/H$d;Lax/P0/H$b;)V

    return-void
.end method

.method public synthetic Y(IZ)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->g(Lax/P0/H$d;IZ)V

    return-void
.end method

.method public synthetic Z(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->u(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public synthetic a(Lax/P0/a0;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->F(Lax/P0/H$d;Lax/P0/a0;)V

    return-void
.end method

.method public synthetic a0(Lax/P0/y;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->l(Lax/P0/H$d;Lax/P0/y;I)V

    return-void
.end method

.method public synthetic b0()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/P0/I;->x(Lax/P0/H$d;)V

    return-void
.end method

.method public synthetic c(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->b(Lax/P0/H$d;I)V

    return-void
.end method

.method public c0(Lax/P0/H;Lax/P0/H$c;)V
    .registers 11

    .line 1
    const/4 p1, 0x0

    .line 2
    const/16 v0, 0xb

    .line 3
    .line 4
    const/16 v1, 0x9

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    const/4 v3, 0x7

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x5

    .line 11
    const/16 v6, 0xd

    .line 12
    .line 13
    filled-new-array {v4, v5, v6}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    invoke-virtual {p2, v7}, Lax/P0/H$c;->a([I)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-eqz v7, :cond_1b

    .line 22
    .line 23
    iget-object v7, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 24
    .line 25
    invoke-static {v7}, Landroidx/media3/ui/d;->x(Landroidx/media3/ui/d;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    filled-new-array {v4, v5, v3, v6}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p2, v4}, Lax/P0/H$c;->a([I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2a

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 39
    .line 40
    invoke-static {v4}, Landroidx/media3/ui/d;->I(Landroidx/media3/ui/d;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    filled-new-array {v2, v6}, [I

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p2, v2}, Lax/P0/H$c;->a([I)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_39

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 54
    .line 55
    invoke-static {v2}, Landroidx/media3/ui/d;->Q(Landroidx/media3/ui/d;)V

    .line 56
    .line 57
    .line 58
    :cond_39
    filled-new-array {v1, v6}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p2, v1}, Lax/P0/H$c;->a([I)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_48

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 69
    .line 70
    invoke-static {v1}, Landroidx/media3/ui/d;->U(Landroidx/media3/ui/d;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    new-array v1, v3, [I

    .line 74
    .line 75
    fill-array-data v1, :array_8a

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v1}, Lax/P0/H$c;->a([I)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_58

    .line 83
    .line 84
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 85
    .line 86
    invoke-static {v1}, Landroidx/media3/ui/d;->V(Landroidx/media3/ui/d;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    filled-new-array {v0, p1, v6}, [I

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p2, p1}, Lax/P0/H$c;->a([I)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_67

    .line 98
    .line 99
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 100
    .line 101
    invoke-static {p1}, Landroidx/media3/ui/d;->W(Landroidx/media3/ui/d;)V

    .line 102
    .line 103
    .line 104
    :cond_67
    const/16 p1, 0xc

    .line 105
    .line 106
    filled-new-array {p1, v6}, [I

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p2, p1}, Lax/P0/H$c;->a([I)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_78

    .line 115
    .line 116
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 117
    .line 118
    invoke-static {p1}, Landroidx/media3/ui/d;->X(Landroidx/media3/ui/d;)V

    .line 119
    .line 120
    .line 121
    :cond_78
    const/4 p1, 0x2

    .line 122
    filled-new-array {p1, v6}, [I

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, p1}, Lax/P0/H$c;->a([I)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_88

    .line 131
    .line 132
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 133
    .line 134
    invoke-static {p1}, Landroidx/media3/ui/d;->d(Landroidx/media3/ui/d;)V

    .line 135
    .line 136
    .line 137
    :cond_88
    return-void

    .line 138
    nop

    .line 139
    :array_8a
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method

.method public synthetic e(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->A(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic i0(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->o(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public synthetic j(Lax/P0/G;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->p(Lax/P0/H$d;Lax/P0/G;)V

    return-void
.end method

.method public synthetic j0(Lax/P0/A;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->m(Lax/P0/H$d;Lax/P0/A;)V

    return-void
.end method

.method public synthetic k0(Lax/P0/n;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->f(Lax/P0/H$d;Lax/P0/n;)V

    return-void
.end method

.method public synthetic o0(II)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->B(Lax/P0/H$d;II)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/ui/d;->j(Landroidx/media3/ui/d;)Lax/P0/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    goto/16 :goto_13a

    .line 10
    .line 11
    :cond_a
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroidx/media3/ui/w;->S()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 21
    .line 22
    invoke-static {v1}, Landroidx/media3/ui/d;->s(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne v1, p1, :cond_27

    .line 27
    .line 28
    const/16 p1, 0x9

    .line 29
    .line 30
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_13a

    .line 35
    .line 36
    invoke-interface {v0}, Lax/P0/H;->m0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 41
    .line 42
    invoke-static {v1}, Landroidx/media3/ui/d;->t(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-ne v1, p1, :cond_3a

    .line 47
    .line 48
    const/4 p1, 0x7

    .line 49
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_13a

    .line 54
    .line 55
    invoke-interface {v0}, Lax/P0/H;->Q()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 60
    .line 61
    invoke-static {v1}, Landroidx/media3/ui/d;->u(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-ne v1, p1, :cond_55

    .line 66
    .line 67
    invoke-interface {v0}, Lax/P0/H;->i()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const/4 v1, 0x4

    .line 72
    if-eq p1, v1, :cond_13a

    .line 73
    .line 74
    const/16 p1, 0xc

    .line 75
    .line 76
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_13a

    .line 81
    .line 82
    invoke-interface {v0}, Lax/P0/H;->n0()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 87
    .line 88
    invoke-static {v1}, Landroidx/media3/ui/d;->v(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-ne v1, p1, :cond_69

    .line 93
    .line 94
    const/16 p1, 0xb

    .line 95
    .line 96
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_13a

    .line 101
    .line 102
    invoke-interface {v0}, Lax/P0/H;->p0()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_69
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 107
    .line 108
    invoke-static {v1}, Landroidx/media3/ui/d;->w(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, p1, :cond_7b

    .line 113
    .line 114
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 115
    .line 116
    invoke-static {p1}, Landroidx/media3/ui/d;->y(Landroidx/media3/ui/d;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {v0, p1}, Lax/S0/d0;->B0(Lax/P0/H;Z)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7b
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 125
    .line 126
    invoke-static {v1}, Landroidx/media3/ui/d;->z(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-ne v1, p1, :cond_9d

    .line 131
    .line 132
    const/16 p1, 0xf

    .line 133
    .line 134
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_13a

    .line 139
    .line 140
    invoke-interface {v0}, Lax/P0/H;->o()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 145
    .line 146
    invoke-static {v1}, Landroidx/media3/ui/d;->A(Landroidx/media3/ui/d;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-static {p1, v1}, Lax/S0/H;->a(II)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-interface {v0, p1}, Lax/P0/H;->j(I)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_9d
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 159
    .line 160
    invoke-static {v1}, Landroidx/media3/ui/d;->B(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-ne v1, p1, :cond_b7

    .line 165
    .line 166
    const/16 p1, 0xe

    .line 167
    .line 168
    invoke-interface {v0, p1}, Lax/P0/H;->c0(I)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_13a

    .line 173
    .line 174
    invoke-interface {v0}, Lax/P0/H;->j0()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    xor-int/lit8 p1, p1, 0x1

    .line 179
    .line 180
    invoke-interface {v0, p1}, Lax/P0/H;->z(Z)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_b7
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 185
    .line 186
    invoke-static {v0}, Landroidx/media3/ui/d;->C(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, p1, :cond_d8

    .line 191
    .line 192
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 193
    .line 194
    invoke-static {p1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1}, Landroidx/media3/ui/w;->R()V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 202
    .line 203
    invoke-static {p1}, Landroidx/media3/ui/d;->D(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$h;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 208
    .line 209
    invoke-static {v1}, Landroidx/media3/ui/d;->C(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {p1, v0, v1}, Landroidx/media3/ui/d;->E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_d8
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 218
    .line 219
    invoke-static {v0}, Landroidx/media3/ui/d;->F(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, p1, :cond_f9

    .line 224
    .line 225
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 226
    .line 227
    invoke-static {p1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p1}, Landroidx/media3/ui/w;->R()V

    .line 232
    .line 233
    .line 234
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 235
    .line 236
    invoke-static {p1}, Landroidx/media3/ui/d;->G(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$e;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 241
    .line 242
    invoke-static {v1}, Landroidx/media3/ui/d;->F(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {p1, v0, v1}, Landroidx/media3/ui/d;->E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_f9
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 251
    .line 252
    invoke-static {v0}, Landroidx/media3/ui/d;->H(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-ne v0, p1, :cond_11a

    .line 257
    .line 258
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 259
    .line 260
    invoke-static {p1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, Landroidx/media3/ui/w;->R()V

    .line 265
    .line 266
    .line 267
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 268
    .line 269
    invoke-static {p1}, Landroidx/media3/ui/d;->J(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$b;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 274
    .line 275
    invoke-static {v1}, Landroidx/media3/ui/d;->H(Landroidx/media3/ui/d;)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {p1, v0, v1}, Landroidx/media3/ui/d;->E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_11a
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 284
    .line 285
    invoke-static {v0}, Landroidx/media3/ui/d;->K(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-ne v0, p1, :cond_13a

    .line 290
    .line 291
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 292
    .line 293
    invoke-static {p1}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {p1}, Landroidx/media3/ui/w;->R()V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 301
    .line 302
    invoke-static {p1}, Landroidx/media3/ui/d;->L(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$j;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v1, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 307
    .line 308
    invoke-static {v1}, Landroidx/media3/ui/d;->K(Landroidx/media3/ui/d;)Landroid/widget/ImageView;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {p1, v0, v1}, Landroidx/media3/ui/d;->E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 313
    .line 314
    .line 315
    :cond_13a
    :goto_13a
    return-void
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

.method public onDismiss()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/ui/d;->r(Landroidx/media3/ui/d;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/d$c;->a:Landroidx/media3/ui/d;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/media3/ui/d;->i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/media3/ui/w;->S()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public synthetic p0(Lax/P0/H$e;Lax/P0/H$e;I)V
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/P0/I;->w(Lax/P0/H$d;Lax/P0/H$e;Lax/P0/H$e;I)V

    return-void
.end method

.method public synthetic r(Lax/P0/C;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->n(Lax/P0/H$d;Lax/P0/C;)V

    return-void
.end method

.method public synthetic r0(Lax/P0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->a(Lax/P0/H$d;Lax/P0/c;)V

    return-void
.end method

.method public synthetic s(Lax/R0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->d(Lax/P0/H$d;Lax/R0/c;)V

    return-void
.end method

.method public synthetic t(Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->e(Lax/P0/H$d;Ljava/util/List;)V

    return-void
.end method

.method public synthetic t0(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->j(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic v(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->y(Lax/P0/H$d;I)V

    return-void
.end method
