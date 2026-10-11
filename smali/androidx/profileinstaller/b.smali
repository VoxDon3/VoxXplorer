.class public Landroidx/profileinstaller/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/res/AssetManager;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/profileinstaller/f$c;

.field private final d:[B

.field private final e:Ljava/io/File;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private i:Z

.field private j:[Landroidx/profileinstaller/c;

.field private k:[B


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/f$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
    .registers 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/profileinstaller/b;->i:Z

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/profileinstaller/b;->a:Landroid/content/res/AssetManager;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/profileinstaller/b;->b:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iput-object p3, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 12
    .line 13
    iput-object p4, p0, Landroidx/profileinstaller/b;->f:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Landroidx/profileinstaller/b;->g:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, Landroidx/profileinstaller/b;->h:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, Landroidx/profileinstaller/b;->e:Ljava/io/File;

    .line 20
    .line 21
    invoke-static {}, Landroidx/profileinstaller/b;->d()[B

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Landroidx/profileinstaller/b;->d:[B

    .line 26
    .line 27
    return-void
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

.method public static synthetic a(Landroidx/profileinstaller/b;ILjava/lang/Object;)V
    .registers 3

    .line 1
    iget-object p0, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 4
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

.method private b([Landroidx/profileinstaller/c;[B)Landroidx/profileinstaller/b;
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Landroidx/profileinstaller/b;->a:Landroid/content/res/AssetManager;

    .line 3
    .line 4
    iget-object v2, p0, Landroidx/profileinstaller/b;->h:Ljava/lang/String;

    .line 5
    .line 6
    invoke-direct {p0, v1, v2}, Landroidx/profileinstaller/b;->g(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_9} :catch_1f
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_9} :catch_1d
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_9} :catch_1b

    .line 10
    if-eqz v1, :cond_2b

    .line 11
    .line 12
    :try_start_b
    sget-object v2, Landroidx/profileinstaller/g;->b:[B

    .line 13
    .line 14
    invoke-static {v1, v2}, Landroidx/profileinstaller/g;->p(Ljava/io/InputStream;[B)[B

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2, p2, p1}, Landroidx/profileinstaller/g;->r(Ljava/io/InputStream;[B[B[Landroidx/profileinstaller/c;)[Landroidx/profileinstaller/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;
    :try_end_17
    .catchall {:try_start_b .. :try_end_17} :catchall_21

    .line 23
    .line 24
    :try_start_17
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/FileNotFoundException; {:try_start_17 .. :try_end_1a} :catch_1f
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_1a} :catch_1d
    .catch Ljava/lang/IllegalStateException; {:try_start_17 .. :try_end_1a} :catch_1b

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    goto :goto_31

    .line 30
    :catch_1d
    move-exception p1

    .line 31
    goto :goto_3b

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    goto :goto_42

    .line 34
    :catchall_21
    move-exception p1

    .line 35
    :try_start_22
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_25
    .catchall {:try_start_22 .. :try_end_25} :catchall_26

    .line 36
    .line 37
    .line 38
    goto :goto_2a

    .line 39
    :catchall_26
    move-exception p2

    .line 40
    :try_start_27
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_2a
    throw p1

    .line 44
    :cond_2b
    if-eqz v1, :cond_49

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_30
    .catch Ljava/io/FileNotFoundException; {:try_start_27 .. :try_end_30} :catch_1f
    .catch Ljava/io/IOException; {:try_start_27 .. :try_end_30} :catch_1d
    .catch Ljava/lang/IllegalStateException; {:try_start_27 .. :try_end_30} :catch_1b

    .line 47
    .line 48
    .line 49
    goto :goto_49

    .line 50
    :goto_31
    iput-object v0, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 51
    .line 52
    iget-object p2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-interface {p2, v1, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_49

    .line 60
    :goto_3b
    iget-object p2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    invoke-interface {p2, v1, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_49

    .line 67
    :goto_42
    iget-object p2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 68
    .line 69
    const/16 v1, 0x9

    .line 70
    .line 71
    invoke-interface {p2, v1, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    :goto_49
    return-object v0
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

.method private c()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/profileinstaller/b;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static d()[B
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_8

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_8
    const/16 v1, 0x1f

    .line 10
    .line 11
    if-lt v0, v1, :cond_f

    .line 12
    .line 13
    sget-object v0, Landroidx/profileinstaller/i;->a:[B

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_f
    packed-switch v0, :pswitch_data_20

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :pswitch_13
    sget-object v0, Landroidx/profileinstaller/i;->b:[B

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_16
    sget-object v0, Landroidx/profileinstaller/i;->c:[B

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_19
    sget-object v0, Landroidx/profileinstaller/i;->d:[B

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_1c
    sget-object v0, Landroidx/profileinstaller/i;->e:[B

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_20
    .packed-switch 0x18
        :pswitch_1c
        :pswitch_1c
        :pswitch_19
        :pswitch_16
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch
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

.method private f(Landroid/content/res/AssetManager;)Ljava/io/InputStream;
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/profileinstaller/b;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/profileinstaller/b;->g(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_6} :catch_9
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    move-exception p1

    .line 9
    goto :goto_b

    .line 10
    :catch_9
    move-exception p1

    .line 11
    goto :goto_12

    .line 12
    :goto_b
    iget-object v0, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    invoke-interface {v0, v1, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_18

    .line 19
    :goto_12
    iget-object v0, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    invoke-interface {v0, v1, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_18
    const/4 p1, 0x0

    .line 26
    return-object p1
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

.method private g(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_8} :catch_9

    .line 9
    return-object p1

    .line 10
    :catch_9
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    if-eqz p1, :cond_1f

    .line 17
    .line 18
    const-string v0, "compressed"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1f

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    invoke-interface {p1, v0, p2}, Landroidx/profileinstaller/f$c;->a(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-object p2
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

.method private i(Ljava/io/InputStream;)[Landroidx/profileinstaller/c;
    .registers 6

    .line 1
    const/4 v0, 0x7

    .line 2
    :try_start_1
    sget-object v1, Landroidx/profileinstaller/g;->a:[B

    .line 3
    .line 4
    invoke-static {p1, v1}, Landroidx/profileinstaller/g;->p(Ljava/io/InputStream;[B)[B

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Landroidx/profileinstaller/b;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Landroidx/profileinstaller/g;->x(Ljava/io/InputStream;[BLjava/lang/String;)[Landroidx/profileinstaller/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_d} :catch_1c
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_d} :catch_1a
    .catchall {:try_start_1 .. :try_end_d} :catchall_18

    .line 14
    :try_start_d
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_10} :catch_11

    .line 15
    .line 16
    .line 17
    goto :goto_39

    .line 18
    :catch_11
    move-exception p1

    .line 19
    iget-object v2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 20
    .line 21
    invoke-interface {v2, v0, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_39

    .line 25
    :catchall_18
    move-exception v1

    .line 26
    goto :goto_3a

    .line 27
    :catch_1a
    move-exception v1

    .line 28
    goto :goto_1e

    .line 29
    :catch_1c
    move-exception v1

    .line 30
    goto :goto_30

    .line 31
    :goto_1e
    :try_start_1e
    iget-object v2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 32
    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    invoke-interface {v2, v3, v1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_1e .. :try_end_25} :catchall_18

    .line 36
    .line 37
    .line 38
    :try_start_25
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_28} :catch_29

    .line 39
    .line 40
    .line 41
    goto :goto_38

    .line 42
    :catch_29
    move-exception p1

    .line 43
    iget-object v1, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 44
    .line 45
    invoke-interface {v1, v0, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_38

    .line 49
    :goto_30
    :try_start_30
    iget-object v2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 50
    .line 51
    invoke-interface {v2, v0, v1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V
    :try_end_35
    .catchall {:try_start_30 .. :try_end_35} :catchall_18

    .line 52
    .line 53
    .line 54
    :try_start_35
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_38
    .catch Ljava/io/IOException; {:try_start_35 .. :try_end_38} :catch_29

    .line 55
    .line 56
    .line 57
    :goto_38
    const/4 v1, 0x0

    .line 58
    :goto_39
    return-object v1

    .line 59
    :goto_3a
    :try_start_3a
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_3a .. :try_end_3d} :catch_3e

    .line 60
    .line 61
    .line 62
    goto :goto_44

    .line 63
    :catch_3e
    move-exception p1

    .line 64
    iget-object v2, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 65
    .line 66
    invoke-interface {v2, v0, p1}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_44
    throw v1
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

.method private static j()Z
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x18

    .line 5
    .line 6
    if-ge v0, v2, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    const/16 v3, 0x1f

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-lt v0, v3, :cond_e

    .line 13
    .line 14
    return v4

    .line 15
    :cond_e
    if-eq v0, v2, :cond_15

    .line 16
    .line 17
    const/16 v2, 0x19

    .line 18
    .line 19
    if-eq v0, v2, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    return v4
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
.end method

.method private k(ILjava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/profileinstaller/b;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lax/g2/c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lax/g2/c;-><init>(Landroidx/profileinstaller/b;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
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


# virtual methods
.method public e()Z
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/profileinstaller/b;->d:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_10

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {p0, v2, v0}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :cond_10
    iget-object v0, p0, Landroidx/profileinstaller/b;->e:Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x4

    .line 25
    if-eqz v0, :cond_26

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/profileinstaller/b;->e:Ljava/io/File;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_32

    .line 34
    .line 35
    invoke-direct {p0, v3, v2}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return v1

    .line 39
    :cond_26
    :try_start_26
    iget-object v0, p0, Landroidx/profileinstaller/b;->e:Ljava/io/File;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_32

    .line 46
    .line 47
    invoke-direct {p0, v3, v2}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V
    :try_end_31
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_31} :catch_36

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_32
    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Landroidx/profileinstaller/b;->i:Z

    .line 53
    .line 54
    return v0

    .line 55
    :catch_36
    invoke-direct {p0, v3, v2}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return v1
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

.method public h()Landroidx/profileinstaller/b;
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/profileinstaller/b;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/profileinstaller/b;->d:[B

    .line 5
    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    goto :goto_29

    .line 9
    :cond_8
    iget-object v0, p0, Landroidx/profileinstaller/b;->a:Landroid/content/res/AssetManager;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/profileinstaller/b;->f(Landroid/content/res/AssetManager;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    invoke-direct {p0, v0}, Landroidx/profileinstaller/b;->i(Ljava/io/InputStream;)[Landroidx/profileinstaller/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 22
    .line 23
    :cond_16
    iget-object v0, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 24
    .line 25
    if-eqz v0, :cond_29

    .line 26
    .line 27
    invoke-static {}, Landroidx/profileinstaller/b;->j()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_29

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/profileinstaller/b;->d:[B

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Landroidx/profileinstaller/b;->b([Landroidx/profileinstaller/c;[B)Landroidx/profileinstaller/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_29

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_29
    :goto_29
    return-object p0
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

.method public l()Landroidx/profileinstaller/b;
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/profileinstaller/b;->d:[B

    .line 4
    .line 5
    if-eqz v0, :cond_50

    .line 6
    .line 7
    if-nez v1, :cond_9

    .line 8
    .line 9
    goto :goto_50

    .line 10
    :cond_9
    invoke-direct {p0}, Landroidx/profileinstaller/b;->c()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_d
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_12} :catch_29
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_12} :catch_27

    .line 17
    .line 18
    .line 19
    :try_start_12
    invoke-static {v3, v1}, Landroidx/profileinstaller/g;->F(Ljava/io/OutputStream;[B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v1, v0}, Landroidx/profileinstaller/g;->C(Ljava/io/OutputStream;[B[Landroidx/profileinstaller/c;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2d

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    invoke-interface {v0, v1, v2}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;
    :try_end_23
    .catchall {:try_start_12 .. :try_end_23} :catchall_2b

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_26} :catch_29
    .catch Ljava/lang/IllegalStateException; {:try_start_23 .. :try_end_26} :catch_27

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :catch_27
    move-exception v0

    .line 41
    goto :goto_40

    .line 42
    :catch_29
    move-exception v0

    .line 43
    goto :goto_48

    .line 44
    :catchall_2b
    move-exception v0

    .line 45
    goto :goto_37

    .line 46
    :cond_2d
    :try_start_2d
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Landroidx/profileinstaller/b;->k:[B
    :try_end_33
    .catchall {:try_start_2d .. :try_end_33} :catchall_2b

    .line 51
    .line 52
    :try_start_33
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_36
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_36} :catch_29
    .catch Ljava/lang/IllegalStateException; {:try_start_33 .. :try_end_36} :catch_27

    .line 53
    .line 54
    .line 55
    goto :goto_4e

    .line 56
    :goto_37
    :try_start_37
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3a
    .catchall {:try_start_37 .. :try_end_3a} :catchall_3b

    .line 57
    .line 58
    .line 59
    goto :goto_3f

    .line 60
    :catchall_3b
    move-exception v1

    .line 61
    :try_start_3c
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_3f
    throw v0
    :try_end_40
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_40} :catch_29
    .catch Ljava/lang/IllegalStateException; {:try_start_3c .. :try_end_40} :catch_27

    .line 65
    :goto_40
    iget-object v1, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 66
    .line 67
    const/16 v3, 0x8

    .line 68
    .line 69
    invoke-interface {v1, v3, v0}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_4e

    .line 73
    :goto_48
    iget-object v1, p0, Landroidx/profileinstaller/b;->c:Landroidx/profileinstaller/f$c;

    .line 74
    .line 75
    const/4 v3, 0x7

    .line 76
    invoke-interface {v1, v3, v0}, Landroidx/profileinstaller/f$c;->b(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_4e
    iput-object v2, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 80
    .line 81
    :cond_50
    :goto_50
    return-object p0
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
.end method

.method public m()Z
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/profileinstaller/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-direct {p0}, Landroidx/profileinstaller/b;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_a
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 12
    .line 13
    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_f
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_f} :catch_3f
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_f} :catch_3d
    .catchall {:try_start_a .. :try_end_f} :catchall_3b

    .line 14
    .line 15
    .line 16
    :try_start_f
    new-instance v0, Ljava/io/FileOutputStream;

    .line 17
    .line 18
    iget-object v4, p0, Landroidx/profileinstaller/b;->e:Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_16
    .catchall {:try_start_f .. :try_end_16} :catchall_41

    .line 21
    .line 22
    .line 23
    :try_start_16
    invoke-static {v0}, Lax/g2/b;->a(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;

    .line 24
    .line 25
    .line 26
    move-result-object v4
    :try_end_1a
    .catchall {:try_start_16 .. :try_end_1a} :catchall_43

    .line 27
    :try_start_1a
    invoke-virtual {v4}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 28
    .line 29
    .line 30
    move-result-object v5
    :try_end_1e
    .catchall {:try_start_1a .. :try_end_1e} :catchall_2b

    .line 31
    :try_start_1e
    invoke-static {v3, v0, v5}, Landroidx/profileinstaller/d;->l(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/nio/channels/FileLock;)V

    .line 32
    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-direct {p0, v6, v2}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_1e .. :try_end_25} :catchall_45

    .line 36
    .line 37
    .line 38
    if-eqz v5, :cond_2d

    .line 39
    .line 40
    :try_start_27
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_2a
    .catchall {:try_start_27 .. :try_end_2a} :catchall_2b

    .line 41
    .line 42
    .line 43
    goto :goto_2d

    .line 44
    :catchall_2b
    move-exception v5

    .line 45
    goto :goto_51

    .line 46
    :cond_2d
    :goto_2d
    :try_start_2d
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_30
    .catchall {:try_start_2d .. :try_end_30} :catchall_43

    .line 47
    .line 48
    .line 49
    :try_start_30
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_33
    .catchall {:try_start_30 .. :try_end_33} :catchall_41

    .line 50
    .line 51
    .line 52
    :try_start_33
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_36
    .catch Ljava/io/FileNotFoundException; {:try_start_33 .. :try_end_36} :catch_3f
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_36} :catch_3d
    .catchall {:try_start_33 .. :try_end_36} :catchall_3b

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Landroidx/profileinstaller/b;->k:[B

    .line 56
    .line 57
    iput-object v2, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 58
    .line 59
    return v6

    .line 60
    :catchall_3b
    move-exception v0

    .line 61
    goto :goto_7d

    .line 62
    :catch_3d
    move-exception v0

    .line 63
    goto :goto_6e

    .line 64
    :catch_3f
    move-exception v0

    .line 65
    goto :goto_77

    .line 66
    :catchall_41
    move-exception v0

    .line 67
    goto :goto_65

    .line 68
    :catchall_43
    move-exception v4

    .line 69
    goto :goto_5c

    .line 70
    :catchall_45
    move-exception v6

    .line 71
    if-eqz v5, :cond_50

    .line 72
    .line 73
    :try_start_48
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_4b
    .catchall {:try_start_48 .. :try_end_4b} :catchall_4c

    .line 74
    .line 75
    .line 76
    goto :goto_50

    .line 77
    :catchall_4c
    move-exception v5

    .line 78
    :try_start_4d
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :cond_50
    :goto_50
    throw v6
    :try_end_51
    .catchall {:try_start_4d .. :try_end_51} :catchall_2b

    .line 82
    :goto_51
    if-eqz v4, :cond_5b

    .line 83
    .line 84
    :try_start_53
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_56
    .catchall {:try_start_53 .. :try_end_56} :catchall_57

    .line 85
    .line 86
    .line 87
    goto :goto_5b

    .line 88
    :catchall_57
    move-exception v4

    .line 89
    :try_start_58
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_5b
    :goto_5b
    throw v5
    :try_end_5c
    .catchall {:try_start_58 .. :try_end_5c} :catchall_43

    .line 93
    :goto_5c
    :try_start_5c
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5f
    .catchall {:try_start_5c .. :try_end_5f} :catchall_60

    .line 94
    .line 95
    .line 96
    goto :goto_64

    .line 97
    :catchall_60
    move-exception v0

    .line 98
    :try_start_61
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_64
    throw v4
    :try_end_65
    .catchall {:try_start_61 .. :try_end_65} :catchall_41

    .line 102
    :goto_65
    :try_start_65
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_68
    .catchall {:try_start_65 .. :try_end_68} :catchall_69

    .line 103
    .line 104
    .line 105
    goto :goto_6d

    .line 106
    :catchall_69
    move-exception v3

    .line 107
    :try_start_6a
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_6d
    throw v0
    :try_end_6e
    .catch Ljava/io/FileNotFoundException; {:try_start_6a .. :try_end_6e} :catch_3f
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_6e} :catch_3d
    .catchall {:try_start_6a .. :try_end_6e} :catchall_3b

    .line 111
    :goto_6e
    const/4 v3, 0x7

    .line 112
    :try_start_6f
    invoke-direct {p0, v3, v0}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V
    :try_end_72
    .catchall {:try_start_6f .. :try_end_72} :catchall_3b

    .line 113
    .line 114
    .line 115
    :goto_72
    iput-object v2, p0, Landroidx/profileinstaller/b;->k:[B

    .line 116
    .line 117
    iput-object v2, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 118
    .line 119
    goto :goto_7c

    .line 120
    :goto_77
    const/4 v3, 0x6

    .line 121
    :try_start_78
    invoke-direct {p0, v3, v0}, Landroidx/profileinstaller/b;->k(ILjava/lang/Object;)V
    :try_end_7b
    .catchall {:try_start_78 .. :try_end_7b} :catchall_3b

    .line 122
    .line 123
    .line 124
    goto :goto_72

    .line 125
    :goto_7c
    return v1

    .line 126
    :goto_7d
    iput-object v2, p0, Landroidx/profileinstaller/b;->k:[B

    .line 127
    .line 128
    iput-object v2, p0, Landroidx/profileinstaller/b;->j:[Landroidx/profileinstaller/c;

    .line 129
    .line 130
    throw v0
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
