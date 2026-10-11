.class public Lax/C3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/io/InputStream;

.field private b:[B

.field private c:Z

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;IZ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/C3/c;->d:I

    .line 6
    .line 7
    iput v0, p0, Lax/C3/c;->e:I

    .line 8
    .line 9
    iput-object p1, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 10
    .line 11
    if-lez p2, :cond_17

    .line 12
    .line 13
    invoke-static {p2}, Lax/C3/c;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-array p1, p1, [B

    .line 18
    .line 19
    iput-object p1, p0, Lax/C3/c;->b:[B

    .line 20
    .line 21
    iput-boolean p3, p0, Lax/C3/c;->c:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 p3, 0x1

    .line 31
    new-array p3, p3, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p2, p3, v0

    .line 34
    .line 35
    const-string p2, "Buffer size %d must be positive."

    .line 36
    .line 37
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
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

.method private b(I)Z
    .registers 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "fill"

    .line 5
    .line 6
    invoke-static {v3}, Lax/C3/d;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget v3, p0, Lax/C3/c;->d:I

    .line 10
    .line 11
    if-lt p1, v3, :cond_8f

    .line 12
    .line 13
    sub-int v3, p1, v3

    .line 14
    .line 15
    iget-object v4, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 16
    .line 17
    if-nez v4, :cond_16

    .line 18
    .line 19
    invoke-static {}, Lax/C3/d;->b()V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    add-int/lit8 v4, v3, 0x1

    .line 24
    .line 25
    iget-object v5, p0, Lax/C3/c;->b:[B

    .line 26
    .line 27
    array-length v5, v5

    .line 28
    const-string v6, "InputStreamBuffer"

    .line 29
    .line 30
    if-le v4, v5, :cond_51

    .line 31
    .line 32
    iget-boolean v5, p0, Lax/C3/c;->c:Z

    .line 33
    .line 34
    if-eqz v5, :cond_2b

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lax/C3/c;->a(I)V

    .line 37
    .line 38
    .line 39
    iget v3, p0, Lax/C3/c;->d:I

    .line 40
    .line 41
    sub-int v3, p1, v3

    .line 42
    .line 43
    goto :goto_51

    .line 44
    :cond_2b
    invoke-static {v4}, Lax/C3/c;->e(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v4, p0, Lax/C3/c;->b:[B

    .line 49
    .line 50
    array-length v4, v4

    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-array v7, v0, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object v4, v7, v1

    .line 62
    .line 63
    aput-object v5, v7, v2

    .line 64
    .line 65
    const-string v4, "Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called."

    .line 66
    .line 67
    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lax/C3/c;->b:[B

    .line 75
    .line 76
    invoke-static {v4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lax/C3/c;->b:[B

    .line 81
    .line 82
    :cond_51
    :goto_51
    const/4 p1, -0x1

    .line 83
    :try_start_52
    iget-object v4, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 84
    .line 85
    iget-object v5, p0, Lax/C3/c;->b:[B

    .line 86
    .line 87
    iget v7, p0, Lax/C3/c;->e:I

    .line 88
    .line 89
    array-length v8, v5

    .line 90
    sub-int/2addr v8, v7

    .line 91
    invoke-virtual {p0, v4, v5, v7, v8}, Lax/C3/c;->f(Ljava/io/InputStream;[BII)I

    .line 92
    .line 93
    .line 94
    move-result v4
    :try_end_5e
    .catch Ljava/io/IOException; {:try_start_52 .. :try_end_5e} :catch_5f

    .line 95
    goto :goto_61

    .line 96
    :catch_5f
    nop

    .line 97
    const/4 v4, -0x1

    .line 98
    :goto_61
    if-eq v4, p1, :cond_69

    .line 99
    .line 100
    iget p1, p0, Lax/C3/c;->e:I

    .line 101
    .line 102
    add-int/2addr p1, v4

    .line 103
    iput p1, p0, Lax/C3/c;->e:I

    .line 104
    .line 105
    goto :goto_6c

    .line 106
    :cond_69
    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 108
    .line 109
    :goto_6c
    const/4 p1, 0x3

    .line 110
    invoke-static {v6, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_86

    .line 115
    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-array v0, v0, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object p1, v0, v1

    .line 123
    .line 124
    aput-object p0, v0, v2

    .line 125
    .line 126
    const-string p1, "fill %d      buffer: %s"

    .line 127
    .line 128
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {v6, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_86
    invoke-static {}, Lax/C3/d;->b()V

    .line 136
    .line 137
    .line 138
    iget p1, p0, Lax/C3/c;->e:I

    .line 139
    .line 140
    if-ge v3, p1, :cond_8e

    .line 141
    .line 142
    const/4 v1, 0x1

    .line 143
    :cond_8e
    return v1

    .line 144
    :cond_8f
    invoke-static {}, Lax/C3/d;->b()V

    .line 145
    .line 146
    .line 147
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget v4, p0, Lax/C3/c;->d:I

    .line 154
    .line 155
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    new-array v0, v0, [Ljava/lang/Object;

    .line 160
    .line 161
    aput-object p1, v0, v1

    .line 162
    .line 163
    aput-object v4, v0, v2

    .line 164
    .line 165
    const-string p1, "Index %d is before buffer %d"

    .line 166
    .line 167
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v3
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

.method private static e(I)I
    .registers 2

    .line 1
    add-int/lit8 p0, p0, -0x1

    .line 2
    .line 3
    shr-int/lit8 v0, p0, 0x1

    .line 4
    .line 5
    or-int/2addr p0, v0

    .line 6
    shr-int/lit8 v0, p0, 0x2

    .line 7
    .line 8
    or-int/2addr p0, v0

    .line 9
    shr-int/lit8 v0, p0, 0x4

    .line 10
    .line 11
    or-int/2addr p0, v0

    .line 12
    shr-int/lit8 v0, p0, 0x8

    .line 13
    .line 14
    or-int/2addr p0, v0

    .line 15
    shr-int/lit8 v0, p0, 0x10

    .line 16
    .line 17
    or-int/2addr p0, v0

    .line 18
    add-int/lit8 p0, p0, 0x1

    .line 19
    .line 20
    return p0
    .line 21
    .line 22
.end method

.method private g(I)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lax/C3/c;->b:[B

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge p1, v2, :cond_16

    .line 7
    .line 8
    :goto_7
    add-int v2, v1, p1

    .line 9
    .line 10
    iget v3, p0, Lax/C3/c;->e:I

    .line 11
    .line 12
    if-ge v2, v3, :cond_15

    .line 13
    .line 14
    iget-object v3, p0, Lax/C3/c;->b:[B

    .line 15
    .line 16
    aget-byte v2, v3, v2

    .line 17
    .line 18
    aput-byte v2, v3, v1

    .line 19
    .line 20
    add-int/2addr v1, v0

    .line 21
    goto :goto_7

    .line 22
    :cond_15
    return-void

    .line 23
    :cond_16
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v3, p0, Lax/C3/c;->b:[B

    .line 30
    .line 31
    array-length v3, v3

    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/4 v4, 0x2

    .line 37
    new-array v4, v4, [Ljava/lang/Object;

    .line 38
    .line 39
    aput-object p1, v4, v1

    .line 40
    .line 41
    aput-object v3, v4, v0

    .line 42
    .line 43
    const-string p1, "Index %d out of bounds. Length %d"

    .line 44
    .line 45
    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v2
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


# virtual methods
.method public a(I)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IndexOutOfBoundsException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "advance to"

    .line 4
    .line 5
    invoke-static {v2}, Lax/C3/d;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v2, p0, Lax/C3/c;->d:I

    .line 9
    .line 10
    sub-int v2, p1, v2

    .line 11
    .line 12
    if-gtz v2, :cond_11

    .line 13
    .line 14
    invoke-static {}, Lax/C3/d;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iget v3, p0, Lax/C3/c;->e:I

    .line 19
    .line 20
    if-ge v2, v3, :cond_20

    .line 21
    .line 22
    invoke-direct {p0, v2}, Lax/C3/c;->g(I)V

    .line 23
    .line 24
    .line 25
    iput p1, p0, Lax/C3/c;->d:I

    .line 26
    .line 27
    iget p1, p0, Lax/C3/c;->e:I

    .line 28
    .line 29
    sub-int/2addr p1, v2

    .line 30
    iput p1, p0, Lax/C3/c;->e:I

    .line 31
    .line 32
    goto :goto_51

    .line 33
    :cond_20
    iget-object v4, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 34
    .line 35
    if-eqz v4, :cond_4d

    .line 36
    .line 37
    sub-int v3, v2, v3

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    :cond_27
    if-lez v3, :cond_41

    .line 41
    .line 42
    :try_start_29
    iget-object v5, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 43
    .line 44
    int-to-long v6, v3

    .line 45
    invoke-virtual {v5, v6, v7}, Ljava/io/InputStream;->skip(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8
    :try_end_30
    .catch Ljava/io/IOException; {:try_start_29 .. :try_end_30} :catch_3e

    .line 49
    const-wide/16 v10, 0x0

    .line 50
    .line 51
    cmp-long v5, v8, v10

    .line 52
    .line 53
    if-gtz v5, :cond_38

    .line 54
    .line 55
    add-int/2addr v4, v1

    .line 56
    goto :goto_3a

    .line 57
    :cond_38
    sub-long/2addr v6, v8

    .line 58
    long-to-int v3, v6

    .line 59
    :goto_3a
    const/4 v5, 0x5

    .line 60
    if-lt v4, v5, :cond_27

    .line 61
    .line 62
    goto :goto_3f

    .line 63
    :catch_3e
    nop

    .line 64
    :goto_3f
    const/4 v4, 0x1

    .line 65
    goto :goto_42

    .line 66
    :cond_41
    const/4 v4, 0x0

    .line 67
    :goto_42
    if-eqz v4, :cond_47

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    iput-object v4, p0, Lax/C3/c;->a:Ljava/io/InputStream;

    .line 71
    .line 72
    :cond_47
    sub-int/2addr p1, v3

    .line 73
    iput p1, p0, Lax/C3/c;->d:I

    .line 74
    .line 75
    iput v0, p0, Lax/C3/c;->e:I

    .line 76
    .line 77
    goto :goto_51

    .line 78
    :cond_4d
    iput p1, p0, Lax/C3/c;->d:I

    .line 79
    .line 80
    iput v0, p0, Lax/C3/c;->e:I

    .line 81
    .line 82
    :goto_51
    const/4 p1, 0x3

    .line 83
    const-string v3, "InputStreamBuffer"

    .line 84
    .line 85
    invoke-static {v3, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_6e

    .line 90
    .line 91
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 v2, 0x2

    .line 96
    new-array v2, v2, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object p1, v2, v0

    .line 99
    .line 100
    aput-object p0, v2, v1

    .line 101
    .line 102
    const-string p1, "advanceTo %d buffer: %s"

    .line 103
    .line 104
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :cond_6e
    invoke-static {}, Lax/C3/d;->b()V

    .line 112
    .line 113
    .line 114
    return-void
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

.method public c(I)B
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IndexOutOfBoundsException;
        }
    .end annotation

    .line 1
    const-string v0, "get"

    .line 2
    .line 3
    invoke-static {v0}, Lax/C3/d;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lax/C3/c;->d(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_16

    .line 11
    .line 12
    iget v0, p0, Lax/C3/c;->d:I

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    invoke-static {}, Lax/C3/d;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/C3/c;->b:[B

    .line 19
    .line 20
    aget-byte p1, v0, p1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_16
    invoke-static {}, Lax/C3/d;->b()V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v1, 0x1

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    aput-object p1, v1, v2

    .line 37
    .line 38
    const-string p1, "Index %d beyond length."

    .line 39
    .line 40
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
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

.method public d(I)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IndexOutOfBoundsException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "has"

    .line 3
    .line 4
    invoke-static {v1}, Lax/C3/d;->a(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lax/C3/c;->d:I

    .line 8
    .line 9
    if-lt p1, v1, :cond_22

    .line 10
    .line 11
    sub-int v1, p1, v1

    .line 12
    .line 13
    iget v2, p0, Lax/C3/c;->e:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_1a

    .line 16
    .line 17
    iget-object v2, p0, Lax/C3/c;->b:[B

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    if-lt v1, v2, :cond_16

    .line 21
    .line 22
    goto :goto_1a

    .line 23
    :cond_16
    invoke-static {}, Lax/C3/d;->b()V

    .line 24
    .line 25
    .line 26
    return v0

    .line 27
    :cond_1a
    :goto_1a
    invoke-static {}, Lax/C3/d;->b()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lax/C3/c;->b(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_22
    invoke-static {}, Lax/C3/d;->b()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget v2, p0, Lax/C3/c;->d:I

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x2

    .line 51
    new-array v3, v3, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object p1, v3, v4

    .line 55
    .line 56
    aput-object v2, v3, v0

    .line 57
    .line 58
    const-string p1, "Index %d is before buffer %d"

    .line 59
    .line 60
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
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
.end method

.method f(Ljava/io/InputStream;[BII)I
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    if-lez p4, :cond_e

    .line 3
    .line 4
    invoke-virtual {p1, p2, p3, p4}, Ljava/io/InputStream;->read([BII)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-gez v1, :cond_a

    .line 9
    .line 10
    goto :goto_e

    .line 11
    :cond_a
    add-int/2addr p3, v1

    .line 12
    sub-int/2addr p4, v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_e
    :goto_e
    return v0
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

.method public toString()Ljava/lang/String;
    .registers 6

    .line 1
    iget v0, p0, Lax/C3/c;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/C3/c;->b:[B

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p0, Lax/C3/c;->e:I

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x3

    .line 21
    new-array v3, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v0, v3, v4

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput-object v1, v3, v0

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    aput-object v2, v3, v0

    .line 31
    .line 32
    const-string v0, "+%d+%d [%d]"

    .line 33
    .line 34
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
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
