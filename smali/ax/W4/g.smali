.class public final Lax/W4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C

.field private static final b:[B

.field private static final c:Lax/W4/g;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lax/W4/c;->d(Z)[C

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sput-object v1, Lax/W4/g;->a:[C

    .line 7
    .line 8
    invoke-static {v0}, Lax/W4/c;->c(Z)[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/W4/g;->b:[B

    .line 13
    .line 14
    new-instance v0, Lax/W4/g;

    .line 15
    .line 16
    invoke-direct {v0}, Lax/W4/g;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lax/W4/g;->c:Lax/W4/g;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private static a(II)I
    .registers 5

    .line 1
    const v0, 0xdc00

    .line 2
    .line 3
    .line 4
    if-lt p1, v0, :cond_16

    .line 5
    .line 6
    const v1, 0xdfff

    .line 7
    .line 8
    .line 9
    if-gt p1, v1, :cond_16

    .line 10
    .line 11
    const v1, 0xd800

    .line 12
    .line 13
    .line 14
    sub-int/2addr p0, v1

    .line 15
    shl-int/lit8 p0, p0, 0xa

    .line 16
    .line 17
    const/high16 v1, 0x10000

    .line 18
    .line 19
    add-int/2addr p0, v1

    .line 20
    sub-int/2addr p1, v0

    .line 21
    add-int/2addr p0, p1

    .line 22
    return p0

    .line 23
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Broken surrogate pair: first char 0x"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, ", second 0x"

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "; illegal combination"

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
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

.method private static b(I)V
    .registers 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-static {p0}, Lax/W4/n;->c(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw v0
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

.method static c(I)I
    .registers 2

    .line 1
    add-int/lit8 v0, p0, 0x6

    .line 2
    .line 3
    shr-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    const/16 p0, 0x18

    .line 7
    .line 8
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/16 v0, 0x7d00

    .line 13
    .line 14
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static e()Lax/W4/g;
    .registers 1

    .line 1
    sget-object v0, Lax/W4/g;->c:Lax/W4/g;

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


# virtual methods
.method public d(Ljava/lang/String;)[B
    .registers 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/W4/g;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_e
    if-ge v5, v0, :cond_f4

    .line 16
    .line 17
    add-int/lit8 v7, v5, 0x1

    .line 18
    .line 19
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    :goto_16
    const/16 v8, 0x7f

    .line 24
    .line 25
    if-gt v5, v8, :cond_3f

    .line 26
    .line 27
    if-lt v6, v1, :cond_2b

    .line 28
    .line 29
    if-nez v4, :cond_22

    .line 30
    .line 31
    invoke-static {v2, v6}, Lax/b5/c;->g([BI)Lax/b5/c;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :cond_22
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    array-length v2, v1

    .line 40
    move v6, v2

    .line 41
    move-object v2, v1

    .line 42
    move v1, v6

    .line 43
    const/4 v6, 0x0

    .line 44
    :cond_2b
    add-int/lit8 v8, v6, 0x1

    .line 45
    .line 46
    int-to-byte v5, v5

    .line 47
    aput-byte v5, v2, v6

    .line 48
    .line 49
    if-lt v7, v0, :cond_35

    .line 50
    .line 51
    move v6, v8

    .line 52
    goto/16 :goto_f4

    .line 53
    .line 54
    :cond_35
    add-int/lit8 v5, v7, 0x1

    .line 55
    .line 56
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    move v7, v5

    .line 61
    move v5, v6

    .line 62
    move v6, v8

    .line 63
    goto :goto_16

    .line 64
    :cond_3f
    if-nez v4, :cond_45

    .line 65
    .line 66
    invoke-static {v2, v6}, Lax/b5/c;->g([BI)Lax/b5/c;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_45
    if-lt v6, v1, :cond_4d

    .line 71
    .line 72
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    array-length v1, v2

    .line 77
    const/4 v6, 0x0

    .line 78
    :cond_4d
    const/16 v8, 0x800

    .line 79
    .line 80
    if-ge v5, v8, :cond_5e

    .line 81
    .line 82
    add-int/lit8 v8, v6, 0x1

    .line 83
    .line 84
    shr-int/lit8 v9, v5, 0x6

    .line 85
    .line 86
    or-int/lit16 v9, v9, 0xc0

    .line 87
    .line 88
    int-to-byte v9, v9

    .line 89
    aput-byte v9, v2, v6

    .line 90
    .line 91
    :goto_5a
    move v6, v5

    .line 92
    move v5, v7

    .line 93
    goto/16 :goto_dd

    .line 94
    .line 95
    :cond_5e
    const v8, 0xd800

    .line 96
    .line 97
    .line 98
    if-lt v5, v8, :cond_be

    .line 99
    .line 100
    const v8, 0xdfff

    .line 101
    .line 102
    .line 103
    if-le v5, v8, :cond_69

    .line 104
    .line 105
    goto :goto_be

    .line 106
    :cond_69
    const v8, 0xdbff

    .line 107
    .line 108
    .line 109
    if-le v5, v8, :cond_71

    .line 110
    .line 111
    invoke-static {v5}, Lax/W4/g;->b(I)V

    .line 112
    .line 113
    .line 114
    :cond_71
    if-lt v7, v0, :cond_76

    .line 115
    .line 116
    invoke-static {v5}, Lax/W4/g;->b(I)V

    .line 117
    .line 118
    .line 119
    :cond_76
    add-int/lit8 v8, v7, 0x1

    .line 120
    .line 121
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-static {v5, v7}, Lax/W4/g;->a(II)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    const v7, 0x10ffff

    .line 130
    .line 131
    .line 132
    if-le v5, v7, :cond_88

    .line 133
    .line 134
    invoke-static {v5}, Lax/W4/g;->b(I)V

    .line 135
    .line 136
    .line 137
    :cond_88
    add-int/lit8 v7, v6, 0x1

    .line 138
    .line 139
    shr-int/lit8 v9, v5, 0x12

    .line 140
    .line 141
    or-int/lit16 v9, v9, 0xf0

    .line 142
    .line 143
    int-to-byte v9, v9

    .line 144
    aput-byte v9, v2, v6

    .line 145
    .line 146
    if-lt v7, v1, :cond_99

    .line 147
    .line 148
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    array-length v1, v2

    .line 153
    const/4 v7, 0x0

    .line 154
    :cond_99
    add-int/lit8 v6, v7, 0x1

    .line 155
    .line 156
    shr-int/lit8 v9, v5, 0xc

    .line 157
    .line 158
    and-int/lit8 v9, v9, 0x3f

    .line 159
    .line 160
    or-int/lit16 v9, v9, 0x80

    .line 161
    .line 162
    int-to-byte v9, v9

    .line 163
    aput-byte v9, v2, v7

    .line 164
    .line 165
    if-lt v6, v1, :cond_af

    .line 166
    .line 167
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    array-length v2, v1

    .line 172
    move v6, v2

    .line 173
    move-object v2, v1

    .line 174
    move v1, v6

    .line 175
    const/4 v6, 0x0

    .line 176
    :cond_af
    add-int/lit8 v7, v6, 0x1

    .line 177
    .line 178
    shr-int/lit8 v9, v5, 0x6

    .line 179
    .line 180
    and-int/lit8 v9, v9, 0x3f

    .line 181
    .line 182
    or-int/lit16 v9, v9, 0x80

    .line 183
    .line 184
    int-to-byte v9, v9

    .line 185
    aput-byte v9, v2, v6

    .line 186
    .line 187
    move v6, v5

    .line 188
    move v5, v8

    .line 189
    move v8, v7

    .line 190
    goto :goto_dd

    .line 191
    :cond_be
    :goto_be
    add-int/lit8 v8, v6, 0x1

    .line 192
    .line 193
    shr-int/lit8 v9, v5, 0xc

    .line 194
    .line 195
    or-int/lit16 v9, v9, 0xe0

    .line 196
    .line 197
    int-to-byte v9, v9

    .line 198
    aput-byte v9, v2, v6

    .line 199
    .line 200
    if-lt v8, v1, :cond_cf

    .line 201
    .line 202
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    array-length v1, v2

    .line 207
    const/4 v8, 0x0

    .line 208
    :cond_cf
    add-int/lit8 v6, v8, 0x1

    .line 209
    .line 210
    shr-int/lit8 v9, v5, 0x6

    .line 211
    .line 212
    and-int/lit8 v9, v9, 0x3f

    .line 213
    .line 214
    or-int/lit16 v9, v9, 0x80

    .line 215
    .line 216
    int-to-byte v9, v9

    .line 217
    aput-byte v9, v2, v8

    .line 218
    .line 219
    move v8, v6

    .line 220
    goto/16 :goto_5a

    .line 221
    .line 222
    :goto_dd
    if-lt v8, v1, :cond_e8

    .line 223
    .line 224
    invoke-virtual {v4}, Lax/b5/c;->f()[B

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    array-length v2, v1

    .line 229
    move v8, v2

    .line 230
    move-object v2, v1

    .line 231
    move v1, v8

    .line 232
    const/4 v8, 0x0

    .line 233
    :cond_e8
    add-int/lit8 v7, v8, 0x1

    .line 234
    .line 235
    and-int/lit8 v6, v6, 0x3f

    .line 236
    .line 237
    or-int/lit16 v6, v6, 0x80

    .line 238
    .line 239
    int-to-byte v6, v6

    .line 240
    aput-byte v6, v2, v8

    .line 241
    .line 242
    move v6, v7

    .line 243
    goto/16 :goto_e

    .line 244
    .line 245
    :cond_f4
    :goto_f4
    if-nez v4, :cond_fb

    .line 246
    .line 247
    invoke-static {v2, v3, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    :cond_fb
    invoke-virtual {v4, v6}, Lax/b5/c;->e(I)[B

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1
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
