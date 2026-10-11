.class public final Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lax/Gb/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lax/o2/h$b;)Lax/o2/h;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$a;->c(Landroid/content/Context;Lax/o2/h$b;)Lax/o2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/content/Context;Lax/o2/h$b;)Lax/o2/h;
    .registers 3

    .line 1
    const-string v0, "$context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lax/o2/h$b;->f:Lax/o2/h$b$b;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lax/o2/h$b$b;->a(Landroid/content/Context;)Lax/o2/h$b$a;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object v0, p1, Lax/o2/h$b;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lax/o2/h$b$a;->d(Ljava/lang/String;)Lax/o2/h$b$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p1, p1, Lax/o2/h$b;->c:Lax/o2/h$a;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lax/o2/h$b$a;->c(Lax/o2/h$a;)Lax/o2/h$b$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p1, v0}, Lax/o2/h$b$a;->e(Z)Lax/o2/h$b$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, v0}, Lax/o2/h$b$a;->a(Z)Lax/o2/h$b$a;

    .line 35
    .line 36
    .line 37
    new-instance p1, Lax/p2/f;

    .line 38
    .line 39
    invoke-direct {p1}, Lax/p2/f;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lax/o2/h$b$a;->b()Lax/o2/h$b;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Lax/p2/f;->a(Lax/o2/h$b;)Lax/o2/h;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
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


# virtual methods
.method public final b(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "context"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "queryExecutor"

    .line 9
    .line 10
    invoke-static {p2, v2}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-class v2, Landroidx/work/impl/WorkDatabase;

    .line 14
    .line 15
    if-eqz p3, :cond_19

    .line 16
    .line 17
    invoke-static {p1, v2}, Lax/k2/t;->c(Landroid/content/Context;Ljava/lang/Class;)Lax/k2/u$a;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3}, Lax/k2/u$a;->c()Lax/k2/u$a;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    goto :goto_28

    .line 26
    :cond_19
    const-string p3, "androidx.work.workdb"

    .line 27
    .line 28
    invoke-static {p1, v2, p3}, Lax/k2/t;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lax/k2/u$a;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    new-instance v2, Lax/C2/y;

    .line 33
    .line 34
    invoke-direct {v2, p1}, Lax/C2/y;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, v2}, Lax/k2/u$a;->f(Lax/o2/h$c;)Lax/k2/u$a;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    :goto_28
    invoke-virtual {p3, p2}, Lax/k2/u$a;->g(Ljava/util/concurrent/Executor;)Lax/k2/u$a;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object p3, Lax/C2/c;->a:Lax/C2/c;

    .line 46
    .line 47
    invoke-virtual {p2, p3}, Lax/k2/u$a;->a(Lax/k2/u$b;)Lax/k2/u$a;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-array p3, v1, [Lax/l2/b;

    .line 52
    .line 53
    sget-object v2, Lax/C2/i;->c:Lax/C2/i;

    .line 54
    .line 55
    aput-object v2, p3, v0

    .line 56
    .line 57
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    new-instance p3, Lax/C2/s;

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    const/4 v3, 0x3

    .line 65
    invoke-direct {p3, p1, v2, v3}, Lax/C2/s;-><init>(Landroid/content/Context;II)V

    .line 66
    .line 67
    .line 68
    new-array v2, v1, [Lax/l2/b;

    .line 69
    .line 70
    aput-object p3, v2, v0

    .line 71
    .line 72
    invoke-virtual {p2, v2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    new-array p3, v1, [Lax/l2/b;

    .line 77
    .line 78
    sget-object v2, Lax/C2/j;->c:Lax/C2/j;

    .line 79
    .line 80
    aput-object v2, p3, v0

    .line 81
    .line 82
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    new-array p3, v1, [Lax/l2/b;

    .line 87
    .line 88
    sget-object v2, Lax/C2/k;->c:Lax/C2/k;

    .line 89
    .line 90
    aput-object v2, p3, v0

    .line 91
    .line 92
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    new-instance p3, Lax/C2/s;

    .line 97
    .line 98
    const/4 v2, 0x5

    .line 99
    const/4 v3, 0x6

    .line 100
    invoke-direct {p3, p1, v2, v3}, Lax/C2/s;-><init>(Landroid/content/Context;II)V

    .line 101
    .line 102
    .line 103
    new-array v2, v1, [Lax/l2/b;

    .line 104
    .line 105
    aput-object p3, v2, v0

    .line 106
    .line 107
    invoke-virtual {p2, v2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    new-array p3, v1, [Lax/l2/b;

    .line 112
    .line 113
    sget-object v2, Lax/C2/l;->c:Lax/C2/l;

    .line 114
    .line 115
    aput-object v2, p3, v0

    .line 116
    .line 117
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    new-array p3, v1, [Lax/l2/b;

    .line 122
    .line 123
    sget-object v2, Lax/C2/m;->c:Lax/C2/m;

    .line 124
    .line 125
    aput-object v2, p3, v0

    .line 126
    .line 127
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-array p3, v1, [Lax/l2/b;

    .line 132
    .line 133
    sget-object v2, Lax/C2/n;->c:Lax/C2/n;

    .line 134
    .line 135
    aput-object v2, p3, v0

    .line 136
    .line 137
    invoke-virtual {p2, p3}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    new-instance p3, Lax/C2/E;

    .line 142
    .line 143
    invoke-direct {p3, p1}, Lax/C2/E;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    new-array v2, v1, [Lax/l2/b;

    .line 147
    .line 148
    aput-object p3, v2, v0

    .line 149
    .line 150
    invoke-virtual {p2, v2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    new-instance p3, Lax/C2/s;

    .line 155
    .line 156
    const/16 v2, 0xa

    .line 157
    .line 158
    const/16 v3, 0xb

    .line 159
    .line 160
    invoke-direct {p3, p1, v2, v3}, Lax/C2/s;-><init>(Landroid/content/Context;II)V

    .line 161
    .line 162
    .line 163
    new-array p1, v1, [Lax/l2/b;

    .line 164
    .line 165
    aput-object p3, p1, v0

    .line 166
    .line 167
    invoke-virtual {p2, p1}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-array p2, v1, [Lax/l2/b;

    .line 172
    .line 173
    sget-object p3, Lax/C2/f;->c:Lax/C2/f;

    .line 174
    .line 175
    aput-object p3, p2, v0

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-array p2, v1, [Lax/l2/b;

    .line 182
    .line 183
    sget-object p3, Lax/C2/g;->c:Lax/C2/g;

    .line 184
    .line 185
    aput-object p3, p2, v0

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-array p2, v1, [Lax/l2/b;

    .line 192
    .line 193
    sget-object p3, Lax/C2/h;->c:Lax/C2/h;

    .line 194
    .line 195
    aput-object p3, p2, v0

    .line 196
    .line 197
    invoke-virtual {p1, p2}, Lax/k2/u$a;->b([Lax/l2/b;)Lax/k2/u$a;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Lax/k2/u$a;->e()Lax/k2/u$a;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, Lax/k2/u$a;->d()Lax/k2/u;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Landroidx/work/impl/WorkDatabase;

    .line 210
    .line 211
    return-object p1
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
