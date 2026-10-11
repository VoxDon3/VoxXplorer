.class public final Lax/q1/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/q1/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lax/q1/J$a;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget v0, p1, Lax/q1/J$a;->a:I

    iput v0, p0, Lax/q1/J$a;->a:I

    .line 4
    iget-object v0, p1, Lax/q1/J$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lax/q1/J$a;->b:Ljava/lang/String;

    .line 5
    iget v0, p1, Lax/q1/J$a;->c:I

    iput v0, p0, Lax/q1/J$a;->c:I

    .line 6
    iget v0, p1, Lax/q1/J$a;->d:I

    iput v0, p0, Lax/q1/J$a;->d:I

    .line 7
    iget v0, p1, Lax/q1/J$a;->e:I

    iput v0, p0, Lax/q1/J$a;->e:I

    .line 8
    iget v0, p1, Lax/q1/J$a;->f:I

    iput v0, p0, Lax/q1/J$a;->f:I

    .line 9
    iget p1, p1, Lax/q1/J$a;->g:I

    iput p1, p0, Lax/q1/J$a;->g:I

    return-void
.end method


# virtual methods
.method public a(I)Z
    .registers 10

    .line 1
    invoke-static {p1}, Lax/q1/J;->a(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    ushr-int/lit8 v0, p1, 0x13

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    and-int/2addr v0, v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v0, v3, :cond_10

    .line 15
    .line 16
    return v1

    .line 17
    :cond_10
    ushr-int/lit8 v4, p1, 0x11

    .line 18
    .line 19
    and-int/2addr v4, v2

    .line 20
    if-nez v4, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    ushr-int/lit8 v5, p1, 0xc

    .line 24
    .line 25
    const/16 v6, 0xf

    .line 26
    .line 27
    and-int/2addr v5, v6

    .line 28
    if-eqz v5, :cond_af

    .line 29
    .line 30
    if-ne v5, v6, :cond_21

    .line 31
    .line 32
    goto/16 :goto_af

    .line 33
    .line 34
    :cond_21
    ushr-int/lit8 v6, p1, 0xa

    .line 35
    .line 36
    and-int/2addr v6, v2

    .line 37
    if-ne v6, v2, :cond_27

    .line 38
    .line 39
    return v1

    .line 40
    :cond_27
    iput v0, p0, Lax/q1/J$a;->a:I

    .line 41
    .line 42
    invoke-static {}, Lax/q1/J;->b()[Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    rsub-int/lit8 v7, v4, 0x3

    .line 47
    .line 48
    aget-object v1, v1, v7

    .line 49
    .line 50
    iput-object v1, p0, Lax/q1/J$a;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {}, Lax/q1/J;->c()[I

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    aget v1, v1, v6

    .line 57
    .line 58
    iput v1, p0, Lax/q1/J$a;->d:I

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    if-ne v0, v6, :cond_42

    .line 62
    .line 63
    div-int/2addr v1, v6

    .line 64
    iput v1, p0, Lax/q1/J$a;->d:I

    .line 65
    .line 66
    goto :goto_48

    .line 67
    :cond_42
    if-nez v0, :cond_48

    .line 68
    .line 69
    div-int/lit8 v1, v1, 0x4

    .line 70
    .line 71
    iput v1, p0, Lax/q1/J$a;->d:I

    .line 72
    .line 73
    :cond_48
    :goto_48
    ushr-int/lit8 v1, p1, 0x9

    .line 74
    .line 75
    and-int/2addr v1, v3

    .line 76
    invoke-static {v0, v4}, Lax/q1/J;->d(II)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    iput v7, p0, Lax/q1/J$a;->g:I

    .line 81
    .line 82
    if-ne v4, v2, :cond_71

    .line 83
    .line 84
    if-ne v0, v2, :cond_5d

    .line 85
    .line 86
    invoke-static {}, Lax/q1/J;->e()[I

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sub-int/2addr v5, v3

    .line 91
    aget v0, v0, v5

    .line 92
    .line 93
    goto :goto_64

    .line 94
    :cond_5d
    invoke-static {}, Lax/q1/J;->f()[I

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sub-int/2addr v5, v3

    .line 99
    aget v0, v0, v5

    .line 100
    .line 101
    :goto_64
    iput v0, p0, Lax/q1/J$a;->f:I

    .line 102
    .line 103
    mul-int/lit8 v0, v0, 0xc

    .line 104
    .line 105
    iget v4, p0, Lax/q1/J$a;->d:I

    .line 106
    .line 107
    div-int/2addr v0, v4

    .line 108
    add-int/2addr v0, v1

    .line 109
    mul-int/lit8 v0, v0, 0x4

    .line 110
    .line 111
    iput v0, p0, Lax/q1/J$a;->c:I

    .line 112
    .line 113
    goto :goto_a6

    .line 114
    :cond_71
    const/16 v7, 0x90

    .line 115
    .line 116
    if-ne v0, v2, :cond_91

    .line 117
    .line 118
    if-ne v4, v6, :cond_7f

    .line 119
    .line 120
    invoke-static {}, Lax/q1/J;->g()[I

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sub-int/2addr v5, v3

    .line 125
    aget v0, v0, v5

    .line 126
    .line 127
    goto :goto_86

    .line 128
    :cond_7f
    invoke-static {}, Lax/q1/J;->h()[I

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sub-int/2addr v5, v3

    .line 133
    aget v0, v0, v5

    .line 134
    .line 135
    :goto_86
    iput v0, p0, Lax/q1/J$a;->f:I

    .line 136
    .line 137
    mul-int/lit16 v0, v0, 0x90

    .line 138
    .line 139
    iget v4, p0, Lax/q1/J$a;->d:I

    .line 140
    .line 141
    div-int/2addr v0, v4

    .line 142
    add-int/2addr v0, v1

    .line 143
    iput v0, p0, Lax/q1/J$a;->c:I

    .line 144
    .line 145
    goto :goto_a6

    .line 146
    :cond_91
    invoke-static {}, Lax/q1/J;->i()[I

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sub-int/2addr v5, v3

    .line 151
    aget v0, v0, v5

    .line 152
    .line 153
    iput v0, p0, Lax/q1/J$a;->f:I

    .line 154
    .line 155
    if-ne v4, v3, :cond_9e

    .line 156
    .line 157
    const/16 v7, 0x48

    .line 158
    .line 159
    :cond_9e
    mul-int v7, v7, v0

    .line 160
    .line 161
    iget v0, p0, Lax/q1/J$a;->d:I

    .line 162
    .line 163
    div-int/2addr v7, v0

    .line 164
    add-int/2addr v7, v1

    .line 165
    iput v7, p0, Lax/q1/J$a;->c:I

    .line 166
    .line 167
    :goto_a6
    shr-int/lit8 p1, p1, 0x6

    .line 168
    .line 169
    and-int/2addr p1, v2

    .line 170
    if-ne p1, v2, :cond_ac

    .line 171
    .line 172
    const/4 v6, 0x1

    .line 173
    :cond_ac
    iput v6, p0, Lax/q1/J$a;->e:I

    .line 174
    .line 175
    return v3

    .line 176
    :cond_af
    :goto_af
    return v1
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
