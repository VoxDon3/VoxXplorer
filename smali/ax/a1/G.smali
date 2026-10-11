.class public final Lax/a1/G;
.super Lax/Q0/q;
.source "SourceFile"


# instance fields
.field private i:[I

.field private j:[I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/Q0/q;-><init>()V

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


# virtual methods
.method public d(Ljava/nio/ByteBuffer;)V
    .registers 11

    .line 1
    iget-object v0, p0, Lax/a1/G;->j:[I

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-int v3, v2, v1

    .line 18
    .line 19
    iget-object v4, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 20
    .line 21
    iget v4, v4, Lax/Q0/o$a;->d:I

    .line 22
    .line 23
    div-int/2addr v3, v4

    .line 24
    iget-object v4, p0, Lax/Q0/q;->c:Lax/Q0/o$a;

    .line 25
    .line 26
    iget v4, v4, Lax/Q0/o$a;->d:I

    .line 27
    .line 28
    mul-int v3, v3, v4

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lax/Q0/q;->m(I)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_21
    if-ge v1, v2, :cond_a1

    .line 35
    .line 36
    array-length v4, v0

    .line 37
    const/4 v5, 0x0

    .line 38
    :goto_25
    if-ge v5, v4, :cond_9b

    .line 39
    .line 40
    aget v6, v0, v5

    .line 41
    .line 42
    iget-object v7, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 43
    .line 44
    iget v7, v7, Lax/Q0/o$a;->c:I

    .line 45
    .line 46
    invoke-static {v7}, Lax/S0/d0;->Q(I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    mul-int v7, v7, v6

    .line 51
    .line 52
    add-int/2addr v7, v1

    .line 53
    iget-object v6, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 54
    .line 55
    iget v6, v6, Lax/Q0/o$a;->c:I

    .line 56
    .line 57
    const/4 v8, 0x2

    .line 58
    if-eq v6, v8, :cond_91

    .line 59
    .line 60
    const/4 v8, 0x3

    .line 61
    if-eq v6, v8, :cond_89

    .line 62
    .line 63
    const/4 v8, 0x4

    .line 64
    if-eq v6, v8, :cond_81

    .line 65
    .line 66
    const/16 v8, 0x15

    .line 67
    .line 68
    if-eq v6, v8, :cond_79

    .line 69
    .line 70
    const/16 v8, 0x16

    .line 71
    .line 72
    if-eq v6, v8, :cond_71

    .line 73
    .line 74
    const/high16 v8, 0x10000000

    .line 75
    .line 76
    if-eq v6, v8, :cond_91

    .line 77
    .line 78
    const/high16 v8, 0x50000000

    .line 79
    .line 80
    if-eq v6, v8, :cond_79

    .line 81
    .line 82
    const/high16 v8, 0x60000000

    .line 83
    .line 84
    if-ne v6, v8, :cond_56

    .line 85
    .line 86
    goto :goto_71

    .line 87
    :cond_56
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v1, "Unexpected encoding: "

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 100
    .line 101
    iget v1, v1, Lax/Q0/o$a;->c:I

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_71
    :goto_71
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    goto :goto_98

    .line 122
    :cond_79
    invoke-static {p1, v7}, Lax/S0/d0;->e0(Ljava/nio/ByteBuffer;I)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-static {v3, v6}, Lax/S0/d0;->k1(Ljava/nio/ByteBuffer;I)V

    .line 127
    .line 128
    .line 129
    goto :goto_98

    .line 130
    :cond_81
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    goto :goto_98

    .line 138
    :cond_89
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    .line 145
    goto :goto_98

    .line 146
    :cond_91
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    :goto_98
    add-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    goto :goto_25

    .line 156
    :cond_9b
    iget-object v4, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 157
    .line 158
    iget v4, v4, Lax/Q0/o$a;->d:I

    .line 159
    .line 160
    add-int/2addr v1, v4

    .line 161
    goto :goto_21

    .line 162
    :cond_a1
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 166
    .line 167
    .line 168
    return-void
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

.method public i(Lax/Q0/o$a;)Lax/Q0/o$a;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a1/G;->i:[I

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    sget-object p1, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    iget v1, p1, Lax/Q0/o$a;->c:I

    .line 9
    .line 10
    invoke-static {v1}, Lax/S0/d0;->L0(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_5c

    .line 15
    .line 16
    iget v1, p1, Lax/Q0/o$a;->b:I

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq v1, v2, :cond_18

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 v1, 0x0

    .line 26
    :goto_19
    const/4 v2, 0x0

    .line 27
    :goto_1a
    array-length v5, v0

    .line 28
    if-ge v2, v5, :cond_4c

    .line 29
    .line 30
    aget v5, v0, v2

    .line 31
    .line 32
    iget v6, p1, Lax/Q0/o$a;->b:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_2c

    .line 35
    .line 36
    if-eq v5, v2, :cond_27

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v5, 0x0

    .line 41
    :goto_28
    or-int/2addr v1, v5

    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_1a

    .line 45
    :cond_2c
    new-instance v1, Lax/Q0/o$b;

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, "Channel map ("

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ") trying to access non-existent input channel."

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {v1, v0, p1}, Lax/Q0/o$b;-><init>(Ljava/lang/String;Lax/Q0/o$a;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_4c
    if-eqz v1, :cond_59

    .line 78
    .line 79
    new-instance v1, Lax/Q0/o$a;

    .line 80
    .line 81
    iget v2, p1, Lax/Q0/o$a;->a:I

    .line 82
    .line 83
    array-length v0, v0

    .line 84
    iget p1, p1, Lax/Q0/o$a;->c:I

    .line 85
    .line 86
    invoke-direct {v1, v2, v0, p1}, Lax/Q0/o$a;-><init>(III)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_59
    sget-object p1, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_5c
    new-instance v0, Lax/Q0/o$b;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lax/Q0/o$b;-><init>(Lax/Q0/o$a;)V

    .line 96
    .line 97
    .line 98
    throw v0
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

.method protected j()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/G;->i:[I

    .line 2
    .line 3
    iput-object v0, p0, Lax/a1/G;->j:[I

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
.end method

.method protected l()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/a1/G;->j:[I

    .line 3
    .line 4
    iput-object v0, p0, Lax/a1/G;->i:[I

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
.end method

.method public n([I)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/G;->i:[I

    .line 2
    .line 3
    return-void
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
    .line 22
.end method
