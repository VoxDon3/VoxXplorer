.class public Lax/C3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/C3/b$d;,
        Lax/C3/b$b;,
        Lax/C3/b$a;,
        Lax/C3/b$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field public static final b:Lax/C3/b$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "^(?:.*;)?base64,.*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/C3/b;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    sget-object v0, Lax/C3/b$c;->d0:Lax/C3/b$c;

    .line 10
    .line 11
    sput-object v0, Lax/C3/b;->b:Lax/C3/b$c;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic a()Ljava/util/regex/Pattern;
    .registers 1

    .line 1
    sget-object v0, Lax/C3/b;->a:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    return-object v0
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

.method public static b(Landroid/content/ContentResolver;Landroid/net/Uri;)Lax/C3/b$d;
    .registers 4

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "data"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_12

    .line 12
    .line 13
    new-instance v0, Lax/C3/b$b;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lax/C3/b$b;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_12
    new-instance v0, Lax/C3/b$a;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Lax/C3/b$a;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public static c(Lax/C3/b$d;IZ)Lax/A3/b$a;
    .registers 13

    .line 1
    new-instance v0, Lax/A3/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/A3/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_6
    invoke-static {p0}, Lax/C3/b;->e(Lax/C3/b$d;)Landroid/graphics/Point;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_2a

    .line 12
    .line 13
    iput v1, v0, Lax/A3/b$a;->e:I

    .line 14
    .line 15
    new-instance p0, Ljava/lang/Exception;

    .line 16
    .line 17
    const-string p1, "image bounds == null"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 23
    .line 24
    return-object v0

    .line 25
    :catch_18
    move-exception p0

    .line 26
    goto/16 :goto_95

    .line 27
    .line 28
    :catch_1b
    move-exception p0

    .line 29
    goto/16 :goto_9b

    .line 30
    .line 31
    :catch_1e
    move-exception p0

    .line 32
    goto/16 :goto_9b

    .line 33
    .line 34
    :catch_21
    move-exception p0

    .line 35
    goto/16 :goto_a0

    .line 36
    .line 37
    :catch_24
    move-exception p0

    .line 38
    goto/16 :goto_a5

    .line 39
    .line 40
    :catch_27
    move-exception p0

    .line 41
    goto/16 :goto_aa

    .line 42
    .line 43
    :cond_2a
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 44
    .line 45
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 46
    .line 47
    .line 48
    iget v4, v2, Landroid/graphics/Point;->x:I

    .line 49
    .line 50
    div-int/2addr v4, p1

    .line 51
    iget v5, v2, Landroid/graphics/Point;->y:I

    .line 52
    .line 53
    div-int/2addr v5, p1

    .line 54
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
    :try_end_3b
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_3b} :catch_27
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_3b} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_3b} :catch_ae
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_3b} :catch_21
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_6 .. :try_end_3b} :catch_1e
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_3b} :catch_1b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_3b} :catch_18

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    :try_start_3d
    invoke-interface {p0}, Lax/C3/b$d;->createInputStream()Ljava/io/InputStream;

    .line 63
    .line 64
    .line 65
    move-result-object v5
    :try_end_41
    .catch Ljava/lang/RuntimeException; {:try_start_3d .. :try_end_41} :catch_6c
    .catchall {:try_start_3d .. :try_end_41} :catchall_6a

    .line 66
    :try_start_41
    new-instance v6, Lax/y0/a;

    .line 67
    .line 68
    invoke-direct {v6, v5}, Lax/y0/a;-><init>(Ljava/io/InputStream;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, Lax/y0/a;->y()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    new-instance v8, Lcom/android/ex/photo/c;

    .line 76
    .line 77
    invoke-direct {v8}, Lcom/android/ex/photo/c;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v8, v0, Lax/A3/b$a;->i:Lcom/android/ex/photo/c;

    .line 81
    .line 82
    iget v9, v2, Landroid/graphics/Point;->x:I

    .line 83
    .line 84
    iput v9, v8, Lcom/android/ex/photo/c;->j:I

    .line 85
    .line 86
    iget v9, v2, Landroid/graphics/Point;->y:I

    .line 87
    .line 88
    iput v9, v8, Lcom/android/ex/photo/c;->k:I

    .line 89
    .line 90
    iput-boolean p1, v8, Lcom/android/ex/photo/c;->a:Z

    .line 91
    .line 92
    iput-object v6, v8, Lcom/android/ex/photo/c;->h:Lax/y0/a;
    :try_end_5d
    .catch Ljava/lang/RuntimeException; {:try_start_41 .. :try_end_5d} :catch_68
    .catchall {:try_start_41 .. :try_end_5d} :catchall_65

    .line 93
    .line 94
    if-eqz v5, :cond_80

    .line 95
    .line 96
    :goto_5f
    :try_start_5f
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_62
    .catch Ljava/io/IOException; {:try_start_5f .. :try_end_62} :catch_63
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5f .. :try_end_62} :catch_ae
    .catch Ljava/lang/SecurityException; {:try_start_5f .. :try_end_62} :catch_21
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_5f .. :try_end_62} :catch_1e
    .catch Ljava/lang/NullPointerException; {:try_start_5f .. :try_end_62} :catch_1b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5f .. :try_end_62} :catch_18

    .line 97
    .line 98
    .line 99
    goto :goto_80

    .line 100
    :catch_63
    nop

    .line 101
    goto :goto_80

    .line 102
    :catchall_65
    move-exception p0

    .line 103
    move-object v4, v5

    .line 104
    goto :goto_8f

    .line 105
    :catch_68
    nop

    .line 106
    goto :goto_6e

    .line 107
    :catchall_6a
    move-exception p0

    .line 108
    goto :goto_8f

    .line 109
    :catch_6c
    nop

    .line 110
    move-object v5, v4

    .line 111
    :goto_6e
    if-eqz v5, :cond_73

    .line 112
    .line 113
    :try_start_70
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_73
    .catch Ljava/io/IOException; {:try_start_70 .. :try_end_73} :catch_73
    .catchall {:try_start_70 .. :try_end_73} :catchall_65

    .line 114
    .line 115
    .line 116
    :catch_73
    :cond_73
    :try_start_73
    invoke-interface {p0}, Lax/C3/b$d;->createInputStream()Ljava/io/InputStream;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    const-wide/16 v6, -0x1

    .line 121
    .line 122
    invoke-static {v5, v6, v7}, Lax/C3/a;->a(Ljava/io/InputStream;J)I

    .line 123
    .line 124
    .line 125
    move-result v7
    :try_end_7d
    .catchall {:try_start_73 .. :try_end_7d} :catchall_65

    .line 126
    if-eqz v5, :cond_80

    .line 127
    .line 128
    goto :goto_5f

    .line 129
    :cond_80
    :goto_80
    if-eqz p2, :cond_88

    .line 130
    .line 131
    :try_start_82
    invoke-static {p0, v4, v3, v7}, Lax/C3/b;->d(Lax/C3/b$d;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iput-object p0, v0, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 136
    .line 137
    :cond_88
    iput v7, v0, Lax/A3/b$a;->d:I

    .line 138
    .line 139
    iput-object v2, v0, Lax/A3/b$a;->a:Landroid/graphics/Point;

    .line 140
    .line 141
    iput p1, v0, Lax/A3/b$a;->e:I
    :try_end_8e
    .catch Ljava/io/FileNotFoundException; {:try_start_82 .. :try_end_8e} :catch_27
    .catch Ljava/io/IOException; {:try_start_82 .. :try_end_8e} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_82 .. :try_end_8e} :catch_ae
    .catch Ljava/lang/SecurityException; {:try_start_82 .. :try_end_8e} :catch_21
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_82 .. :try_end_8e} :catch_1e
    .catch Ljava/lang/NullPointerException; {:try_start_82 .. :try_end_8e} :catch_1b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_82 .. :try_end_8e} :catch_18

    .line 142
    .line 143
    goto :goto_ae

    .line 144
    :goto_8f
    if-eqz v4, :cond_94

    .line 145
    .line 146
    :try_start_91
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_94
    .catch Ljava/io/IOException; {:try_start_91 .. :try_end_94} :catch_94
    .catch Ljava/lang/IllegalArgumentException; {:try_start_91 .. :try_end_94} :catch_ae
    .catch Ljava/lang/SecurityException; {:try_start_91 .. :try_end_94} :catch_21
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_91 .. :try_end_94} :catch_1e
    .catch Ljava/lang/NullPointerException; {:try_start_91 .. :try_end_94} :catch_1b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_91 .. :try_end_94} :catch_18

    .line 147
    .line 148
    .line 149
    :catch_94
    :cond_94
    :try_start_94
    throw p0
    :try_end_95
    .catch Ljava/io/FileNotFoundException; {:try_start_94 .. :try_end_95} :catch_27
    .catch Ljava/io/IOException; {:try_start_94 .. :try_end_95} :catch_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_94 .. :try_end_95} :catch_ae
    .catch Ljava/lang/SecurityException; {:try_start_94 .. :try_end_95} :catch_21
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_94 .. :try_end_95} :catch_1e
    .catch Ljava/lang/NullPointerException; {:try_start_94 .. :try_end_95} :catch_1b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_94 .. :try_end_95} :catch_18

    .line 150
    :goto_95
    const/4 p1, 0x2

    .line 151
    iput p1, v0, Lax/A3/b$a;->e:I

    .line 152
    .line 153
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 154
    .line 155
    goto :goto_ae

    .line 156
    :goto_9b
    iput v1, v0, Lax/A3/b$a;->e:I

    .line 157
    .line 158
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 159
    .line 160
    goto :goto_ae

    .line 161
    :goto_a0
    iput v1, v0, Lax/A3/b$a;->e:I

    .line 162
    .line 163
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 164
    .line 165
    goto :goto_ae

    .line 166
    :goto_a5
    iput v1, v0, Lax/A3/b$a;->e:I

    .line 167
    .line 168
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 169
    .line 170
    goto :goto_ae

    .line 171
    :goto_aa
    iput v1, v0, Lax/A3/b$a;->e:I

    .line 172
    .line 173
    iput-object p0, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 174
    .line 175
    :catch_ae
    :goto_ae
    return-object v0
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

.method public static d(Lax/C3/b$d;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p0}, Lax/C3/b$d;->createInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_28

    .line 5
    :try_start_4
    invoke-static {p0, p1, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p0, :cond_22

    .line 10
    .line 11
    if-nez p1, :cond_22

    .line 12
    .line 13
    iget-boolean p2, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 14
    .line 15
    if-eqz p2, :cond_11

    .line 16
    .line 17
    goto :goto_22

    .line 18
    :cond_11
    const-string p1, "ImageUtils"

    .line 19
    .line 20
    const-string p2, "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap"

    .line 21
    .line 22
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string p2, "Image bytes cannot be decoded into a Bitmap."

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
    :try_end_20
    .catchall {:try_start_4 .. :try_end_20} :catchall_20

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_2a

    .line 35
    :cond_22
    :goto_22
    if-eqz p0, :cond_27

    .line 36
    .line 37
    :try_start_24
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_27} :catch_27

    .line 38
    .line 39
    .line 40
    :catch_27
    :cond_27
    return-object p1

    .line 41
    :catchall_28
    move-exception p1

    .line 42
    const/4 p0, 0x0

    .line 43
    :goto_2a
    if-eqz p0, :cond_2f

    .line 44
    .line 45
    :try_start_2c
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2f
    .catch Ljava/io/IOException; {:try_start_2c .. :try_end_2f} :catch_2f

    .line 46
    .line 47
    .line 48
    :catch_2f
    :cond_2f
    throw p1
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
.end method

.method private static e(Lax/C3/b$d;)Landroid/graphics/Point;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p0, v1, v0, v2}, Lax/C3/b;->d(Lax/C3/b$d;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    new-instance p0, Landroid/graphics/Point;

    .line 15
    .line 16
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 21
    .line 22
    .line 23
    return-object p0
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
.end method
