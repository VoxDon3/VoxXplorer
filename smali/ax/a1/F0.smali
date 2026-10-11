.class public final Lax/a1/F0;
.super Lax/Q0/q;
.source "SourceFile"


# instance fields
.field private final i:F

.field private final j:S

.field private final k:I

.field private final l:J

.field private final m:J

.field private n:I

.field private o:Z

.field private p:I

.field private q:J

.field private r:I

.field private s:[B

.field private t:I

.field private u:I

.field private v:[B


# direct methods
.method public constructor <init>()V
    .registers 9

    const/16 v6, 0xa

    const/16 v7, 0x400

    const-wide/32 v1, 0x186a0

    const v3, 0x3e4ccccd    # 0.2f

    const-wide/32 v4, 0x1e8480

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v7}, Lax/a1/F0;-><init>(JFJIS)V

    return-void
.end method

.method public constructor <init>(JFJIS)V
    .registers 10

    .line 2
    invoke-direct {p0}, Lax/Q0/q;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lax/a1/F0;->r:I

    .line 4
    iput v0, p0, Lax/a1/F0;->t:I

    .line 5
    iput v0, p0, Lax/a1/F0;->u:I

    const/4 v1, 0x0

    cmpl-float v1, p3, v1

    if-ltz v1, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p3, v1

    if-gtz v1, :cond_16

    const/4 v0, 0x1

    .line 6
    :cond_16
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 7
    iput-wide p1, p0, Lax/a1/F0;->l:J

    .line 8
    iput p3, p0, Lax/a1/F0;->i:F

    .line 9
    iput-wide p4, p0, Lax/a1/F0;->m:J

    .line 10
    iput p6, p0, Lax/a1/F0;->k:I

    .line 11
    iput-short p7, p0, Lax/a1/F0;->j:S

    .line 12
    sget-object p1, Lax/S0/d0;->f:[B

    iput-object p1, p0, Lax/a1/F0;->s:[B

    .line 13
    iput-object p1, p0, Lax/a1/F0;->v:[B

    return-void
.end method

.method private A(Z)V
    .registers 10

    .line 1
    iget v0, p0, Lax/a1/F0;->u:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/a1/F0;->s:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-eq v0, v2, :cond_b

    .line 7
    .line 8
    if-eqz p1, :cond_a

    .line 9
    .line 10
    goto :goto_b

    .line 11
    :cond_a
    return-void

    .line 12
    :cond_b
    :goto_b
    iget v2, p0, Lax/a1/F0;->r:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x2

    .line 17
    if-nez v2, :cond_2d

    .line 18
    .line 19
    if-eqz p1, :cond_1b

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    invoke-direct {p0, v0, p1}, Lax/a1/F0;->B(II)V

    .line 23
    .line 24
    .line 25
    move p1, v0

    .line 26
    :goto_19
    move v1, p1

    .line 27
    goto :goto_51

    .line 28
    :cond_1b
    array-length p1, v1

    .line 29
    div-int/2addr p1, v5

    .line 30
    if-lt v0, p1, :cond_21

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    const/4 p1, 0x0

    .line 35
    :goto_22
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/a1/F0;->s:[B

    .line 39
    .line 40
    array-length p1, p1

    .line 41
    div-int/2addr p1, v5

    .line 42
    invoke-direct {p0, p1, v3}, Lax/a1/F0;->B(II)V

    .line 43
    .line 44
    .line 45
    goto :goto_19

    .line 46
    :cond_2d
    if-eqz p1, :cond_46

    .line 47
    .line 48
    array-length p1, v1

    .line 49
    div-int/2addr p1, v5

    .line 50
    sub-int p1, v0, p1

    .line 51
    .line 52
    array-length v1, v1

    .line 53
    div-int/2addr v1, v5

    .line 54
    add-int/2addr v1, p1

    .line 55
    invoke-direct {p0, p1}, Lax/a1/F0;->r(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object v2, p0, Lax/a1/F0;->s:[B

    .line 60
    .line 61
    array-length v2, v2

    .line 62
    div-int/2addr v2, v5

    .line 63
    add-int/2addr p1, v2

    .line 64
    invoke-direct {p0, p1, v5}, Lax/a1/F0;->B(II)V

    .line 65
    .line 66
    .line 67
    move v7, v1

    .line 68
    move v1, p1

    .line 69
    move p1, v7

    .line 70
    goto :goto_51

    .line 71
    :cond_46
    array-length p1, v1

    .line 72
    div-int/2addr p1, v5

    .line 73
    sub-int p1, v0, p1

    .line 74
    .line 75
    invoke-direct {p0, p1}, Lax/a1/F0;->r(I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-direct {p0, v1, v4}, Lax/a1/F0;->B(II)V

    .line 80
    .line 81
    .line 82
    :goto_51
    iget v2, p0, Lax/a1/F0;->n:I

    .line 83
    .line 84
    rem-int v2, p1, v2

    .line 85
    .line 86
    if-nez v2, :cond_59

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    goto :goto_5a

    .line 90
    :cond_59
    const/4 v2, 0x0

    .line 91
    :goto_5a
    new-instance v5, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v6, "bytesConsumed is not aligned to frame size: %s"

    .line 97
    .line 98
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v2, v5}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    if-lt v0, v1, :cond_71

    .line 112
    .line 113
    const/4 v3, 0x1

    .line 114
    :cond_71
    invoke-static {v3}, Lax/S0/a;->g(Z)V

    .line 115
    .line 116
    .line 117
    iget v0, p0, Lax/a1/F0;->u:I

    .line 118
    .line 119
    sub-int/2addr v0, p1

    .line 120
    iput v0, p0, Lax/a1/F0;->u:I

    .line 121
    .line 122
    iget v0, p0, Lax/a1/F0;->t:I

    .line 123
    .line 124
    add-int/2addr v0, p1

    .line 125
    iput v0, p0, Lax/a1/F0;->t:I

    .line 126
    .line 127
    iget-object v2, p0, Lax/a1/F0;->s:[B

    .line 128
    .line 129
    array-length v2, v2

    .line 130
    rem-int/2addr v0, v2

    .line 131
    iput v0, p0, Lax/a1/F0;->t:I

    .line 132
    .line 133
    iget v0, p0, Lax/a1/F0;->r:I

    .line 134
    .line 135
    iget v2, p0, Lax/a1/F0;->n:I

    .line 136
    .line 137
    div-int v3, v1, v2

    .line 138
    .line 139
    add-int/2addr v0, v3

    .line 140
    iput v0, p0, Lax/a1/F0;->r:I

    .line 141
    .line 142
    iget-wide v3, p0, Lax/a1/F0;->q:J

    .line 143
    .line 144
    sub-int/2addr p1, v1

    .line 145
    div-int/2addr p1, v2

    .line 146
    int-to-long v0, p1

    .line 147
    add-long/2addr v3, v0

    .line 148
    iput-wide v3, p0, Lax/a1/F0;->q:J

    .line 149
    .line 150
    return-void
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
.end method

.method private B(II)V
    .registers 10

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    iget v0, p0, Lax/a1/F0;->u:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt v0, p1, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-ne p2, v0, :cond_42

    .line 18
    .line 19
    iget v0, p0, Lax/a1/F0;->t:I

    .line 20
    .line 21
    iget v3, p0, Lax/a1/F0;->u:I

    .line 22
    .line 23
    add-int v4, v0, v3

    .line 24
    .line 25
    iget-object v5, p0, Lax/a1/F0;->s:[B

    .line 26
    .line 27
    array-length v6, v5

    .line 28
    if-gt v4, v6, :cond_25

    .line 29
    .line 30
    add-int/2addr v0, v3

    .line 31
    sub-int/2addr v0, p1

    .line 32
    iget-object v3, p0, Lax/a1/F0;->v:[B

    .line 33
    .line 34
    invoke-static {v5, v0, v3, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    goto :goto_61

    .line 38
    :cond_25
    array-length v4, v5

    .line 39
    sub-int/2addr v4, v0

    .line 40
    sub-int/2addr v3, v4

    .line 41
    if-lt v3, p1, :cond_31

    .line 42
    .line 43
    sub-int/2addr v3, p1

    .line 44
    iget-object v0, p0, Lax/a1/F0;->v:[B

    .line 45
    .line 46
    invoke-static {v5, v3, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    goto :goto_61

    .line 50
    :cond_31
    sub-int v0, p1, v3

    .line 51
    .line 52
    array-length v4, v5

    .line 53
    sub-int/2addr v4, v0

    .line 54
    iget-object v6, p0, Lax/a1/F0;->v:[B

    .line 55
    .line 56
    invoke-static {v5, v4, v6, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Lax/a1/F0;->s:[B

    .line 60
    .line 61
    iget-object v5, p0, Lax/a1/F0;->v:[B

    .line 62
    .line 63
    invoke-static {v4, v2, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    goto :goto_61

    .line 67
    :cond_42
    iget v0, p0, Lax/a1/F0;->t:I

    .line 68
    .line 69
    add-int v3, v0, p1

    .line 70
    .line 71
    iget-object v4, p0, Lax/a1/F0;->s:[B

    .line 72
    .line 73
    array-length v5, v4

    .line 74
    if-gt v3, v5, :cond_51

    .line 75
    .line 76
    iget-object v3, p0, Lax/a1/F0;->v:[B

    .line 77
    .line 78
    invoke-static {v4, v0, v3, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    goto :goto_61

    .line 82
    :cond_51
    array-length v3, v4

    .line 83
    sub-int/2addr v3, v0

    .line 84
    iget-object v5, p0, Lax/a1/F0;->v:[B

    .line 85
    .line 86
    invoke-static {v4, v0, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    sub-int v0, p1, v3

    .line 90
    .line 91
    iget-object v4, p0, Lax/a1/F0;->s:[B

    .line 92
    .line 93
    iget-object v5, p0, Lax/a1/F0;->v:[B

    .line 94
    .line 95
    invoke-static {v4, v2, v5, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    :goto_61
    iget v0, p0, Lax/a1/F0;->n:I

    .line 99
    .line 100
    rem-int v0, p1, v0

    .line 101
    .line 102
    if-nez v0, :cond_69

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    goto :goto_6a

    .line 106
    :cond_69
    const/4 v0, 0x0

    .line 107
    :goto_6a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v4, "sizeToOutput is not aligned to frame size: "

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v0, v3}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lax/a1/F0;->t:I

    .line 128
    .line 129
    iget-object v3, p0, Lax/a1/F0;->s:[B

    .line 130
    .line 131
    array-length v3, v3

    .line 132
    if-ge v0, v3, :cond_86

    .line 133
    .line 134
    goto :goto_87

    .line 135
    :cond_86
    const/4 v1, 0x0

    .line 136
    :goto_87
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lax/a1/F0;->v:[B

    .line 140
    .line 141
    invoke-direct {p0, v0, p1, p2}, Lax/a1/F0;->z([BII)V

    .line 142
    .line 143
    .line 144
    return-void
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

.method private C(Ljava/nio/ByteBuffer;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lax/a1/F0;->s:[B

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    add-int/2addr v1, v2

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lax/a1/F0;->t(Ljava/nio/ByteBuffer;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ne v1, v2, :cond_21

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iput v1, p0, Lax/a1/F0;->p:I

    .line 32
    .line 33
    goto :goto_2f

    .line 34
    :cond_21
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Lax/a1/F0;->y(Ljava/nio/ByteBuffer;)V

    .line 46
    .line 47
    .line 48
    :goto_2f
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 49
    .line 50
    .line 51
    return-void
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

.method private static D([BII)V
    .registers 4

    .line 1
    const/16 v0, 0x7fff

    .line 2
    .line 3
    if-lt p2, v0, :cond_e

    .line 4
    .line 5
    const/4 p2, -0x1

    .line 6
    aput-byte p2, p0, p1

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    const/16 p2, 0x7f

    .line 11
    .line 12
    aput-byte p2, p0, p1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    const/16 v0, -0x8000

    .line 16
    .line 17
    if-gt p2, v0, :cond_1c

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    aput-byte p2, p0, p1

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    const/16 p2, -0x80

    .line 25
    .line 26
    aput-byte p2, p0, p1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    and-int/lit16 v0, p2, 0xff

    .line 30
    .line 31
    int-to-byte v0, v0

    .line 32
    aput-byte v0, p0, p1

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    shr-int/lit8 p2, p2, 0x8

    .line 37
    .line 38
    int-to-byte p2, p2

    .line 39
    aput-byte p2, p0, p1

    .line 40
    .line 41
    return-void
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

.method private F(Ljava/nio/ByteBuffer;)V
    .registers 12

    .line 1
    iget v0, p0, Lax/a1/F0;->t:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/a1/F0;->s:[B

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ge v0, v1, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-direct {p0, p1}, Lax/a1/F0;->u(Ljava/nio/ByteBuffer;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sub-int v4, v1, v4

    .line 29
    .line 30
    iget v5, p0, Lax/a1/F0;->t:I

    .line 31
    .line 32
    iget v6, p0, Lax/a1/F0;->u:I

    .line 33
    .line 34
    add-int v7, v5, v6

    .line 35
    .line 36
    iget-object v8, p0, Lax/a1/F0;->s:[B

    .line 37
    .line 38
    array-length v9, v8

    .line 39
    if-ge v7, v9, :cond_2e

    .line 40
    .line 41
    array-length v7, v8

    .line 42
    add-int v8, v6, v5

    .line 43
    .line 44
    sub-int/2addr v7, v8

    .line 45
    add-int/2addr v5, v6

    .line 46
    goto :goto_34

    .line 47
    :cond_2e
    array-length v7, v8

    .line 48
    sub-int/2addr v7, v5

    .line 49
    sub-int/2addr v6, v7

    .line 50
    sub-int v7, v5, v6

    .line 51
    .line 52
    move v5, v6

    .line 53
    :goto_34
    if-ge v1, v0, :cond_38

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    goto :goto_39

    .line 57
    :cond_38
    const/4 v1, 0x0

    .line 58
    :goto_39
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    add-int/2addr v8, v6

    .line 67
    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    iget-object v8, p0, Lax/a1/F0;->s:[B

    .line 71
    .line 72
    invoke-virtual {p1, v8, v5, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    iget v5, p0, Lax/a1/F0;->u:I

    .line 76
    .line 77
    add-int/2addr v5, v6

    .line 78
    iput v5, p0, Lax/a1/F0;->u:I

    .line 79
    .line 80
    iget-object v6, p0, Lax/a1/F0;->s:[B

    .line 81
    .line 82
    array-length v6, v6

    .line 83
    if-gt v5, v6, :cond_56

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    goto :goto_57

    .line 87
    :cond_56
    const/4 v5, 0x0

    .line 88
    :goto_57
    invoke-static {v5}, Lax/S0/a;->g(Z)V

    .line 89
    .line 90
    .line 91
    if-eqz v1, :cond_5f

    .line 92
    .line 93
    if-ge v4, v7, :cond_5f

    .line 94
    .line 95
    goto :goto_60

    .line 96
    :cond_5f
    const/4 v2, 0x0

    .line 97
    :goto_60
    invoke-direct {p0, v2}, Lax/a1/F0;->A(Z)V

    .line 98
    .line 99
    .line 100
    if-eqz v2, :cond_69

    .line 101
    .line 102
    iput v3, p0, Lax/a1/F0;->p:I

    .line 103
    .line 104
    iput v3, p0, Lax/a1/F0;->r:I

    .line 105
    .line 106
    :cond_69
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 107
    .line 108
    .line 109
    return-void
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

.method private static G(BB)I
    .registers 2

    .line 1
    and-int/lit16 p1, p1, 0xff

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    return p0
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
.end method

.method private n(F)I
    .registers 2

    .line 1
    float-to-int p1, p1

    .line 2
    invoke-direct {p0, p1}, Lax/a1/F0;->o(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
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

.method private o(I)I
    .registers 3

    .line 1
    iget v0, p0, Lax/a1/F0;->n:I

    .line 2
    .line 3
    div-int/2addr p1, v0

    .line 4
    mul-int p1, p1, v0

    .line 5
    .line 6
    return p1
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

.method private p(II)I
    .registers 5

    .line 1
    iget v0, p0, Lax/a1/F0;->k:I

    .line 2
    .line 3
    rsub-int/lit8 v1, v0, 0x64

    .line 4
    .line 5
    mul-int/lit16 p1, p1, 0x3e8

    .line 6
    .line 7
    mul-int v1, v1, p1

    .line 8
    .line 9
    div-int/2addr v1, p2

    .line 10
    div-int/lit16 v1, v1, 0x3e8

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
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

.method private q(II)I
    .registers 4

    .line 1
    iget v0, p0, Lax/a1/F0;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x64

    .line 4
    .line 5
    mul-int/lit16 p1, p1, 0x3e8

    .line 6
    .line 7
    div-int/2addr p1, p2

    .line 8
    mul-int v0, v0, p1

    .line 9
    .line 10
    div-int/lit16 v0, v0, 0x3e8

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x64

    .line 13
    .line 14
    return v0
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

.method private r(I)I
    .registers 4

    .line 1
    iget-wide v0, p0, Lax/a1/F0;->m:J

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lax/a1/F0;->s(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lax/a1/F0;->r:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget v1, p0, Lax/a1/F0;->n:I

    .line 11
    .line 12
    mul-int v0, v0, v1

    .line 13
    .line 14
    iget-object v1, p0, Lax/a1/F0;->s:[B

    .line 15
    .line 16
    array-length v1, v1

    .line 17
    div-int/lit8 v1, v1, 0x2

    .line 18
    .line 19
    sub-int/2addr v0, v1

    .line 20
    if-ltz v0, :cond_17

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v1, 0x0

    .line 25
    :goto_18
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 26
    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    iget v1, p0, Lax/a1/F0;->i:F

    .line 30
    .line 31
    mul-float p1, p1, v1

    .line 32
    .line 33
    const/high16 v1, 0x3f000000    # 0.5f

    .line 34
    .line 35
    add-float/2addr p1, v1

    .line 36
    int-to-float v0, v0

    .line 37
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-direct {p0, p1}, Lax/a1/F0;->n(F)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
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

.method private s(J)I
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 2
    .line 3
    iget v0, v0, Lax/Q0/o$a;->a:I

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    mul-long p1, p1, v0

    .line 7
    .line 8
    const-wide/32 v0, 0xf4240

    .line 9
    .line 10
    .line 11
    div-long/2addr p1, v0

    .line 12
    long-to-int p2, p1

    .line 13
    return p2
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

.method private t(Ljava/nio/ByteBuffer;)I
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_6
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v0, v1, :cond_26

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v2, v0, -0x1

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {p0, v1, v2}, Lax/a1/F0;->w(BB)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_23

    .line 28
    .line 29
    iget p1, p0, Lax/a1/F0;->n:I

    .line 30
    .line 31
    div-int/2addr v0, p1

    .line 32
    mul-int v0, v0, p1

    .line 33
    .line 34
    add-int/2addr v0, p1

    .line 35
    return v0

    .line 36
    :cond_23
    add-int/lit8 v0, v0, -0x2

    .line 37
    .line 38
    goto :goto_6

    .line 39
    :cond_26
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
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

.method private u(Ljava/nio/ByteBuffer;)I
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    :goto_6
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_25

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v2, v0, -0x1

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {p0, v1, v2}, Lax/a1/F0;->w(BB)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_22

    .line 28
    .line 29
    iget p1, p0, Lax/a1/F0;->n:I

    .line 30
    .line 31
    div-int/2addr v0, p1

    .line 32
    mul-int p1, p1, v0

    .line 33
    .line 34
    return p1

    .line 35
    :cond_22
    add-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    goto :goto_6

    .line 38
    :cond_25
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
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

.method private w(BB)Z
    .registers 3

    .line 1
    invoke-static {p1, p2}, Lax/a1/F0;->G(BB)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-short p2, p0, Lax/a1/F0;->j:S

    .line 10
    .line 11
    if-le p1, p2, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_e
    const/4 p1, 0x0

    .line 16
    return p1
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

.method private x([BII)V
    .registers 7

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p3, v0, :cond_4

    .line 3
    .line 4
    goto :goto_30

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    if-ge v0, p2, :cond_30

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    aget-byte v1, p1, v1

    .line 11
    .line 12
    aget-byte v2, p1, v0

    .line 13
    .line 14
    invoke-static {v1, v2}, Lax/a1/F0;->G(BB)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez p3, :cond_1a

    .line 19
    .line 20
    add-int/lit8 v2, p2, -0x1

    .line 21
    .line 22
    invoke-direct {p0, v0, v2}, Lax/a1/F0;->q(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_26

    .line 27
    :cond_1a
    const/4 v2, 0x2

    .line 28
    if-ne p3, v2, :cond_24

    .line 29
    .line 30
    add-int/lit8 v2, p2, -0x1

    .line 31
    .line 32
    invoke-direct {p0, v0, v2}, Lax/a1/F0;->p(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_26

    .line 37
    :cond_24
    iget v2, p0, Lax/a1/F0;->k:I

    .line 38
    .line 39
    :goto_26
    mul-int v1, v1, v2

    .line 40
    .line 41
    div-int/lit8 v1, v1, 0x64

    .line 42
    .line 43
    invoke-static {p1, v0, v1}, Lax/a1/F0;->D([BII)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x2

    .line 47
    .line 48
    goto :goto_5

    .line 49
    :cond_30
    :goto_30
    return-void
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

.method private y(Ljava/nio/ByteBuffer;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lax/Q0/q;->m(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z([BII)V
    .registers 8

    .line 1
    iget v0, p0, Lax/a1/F0;->n:I

    .line 2
    .line 3
    rem-int v0, p2, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "byteOutput size is not aligned to frame size "

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, p2, p3}, Lax/a1/F0;->x([BII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p2}, Lax/Q0/q;->m(I)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3, p1, v1, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    return-void
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


# virtual methods
.method public E(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/a1/F0;->o:Z

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

.method public d(Ljava/nio/ByteBuffer;)V
    .registers 4

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_21

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/Q0/q;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_21

    .line 12
    .line 13
    iget v0, p0, Lax/a1/F0;->p:I

    .line 14
    .line 15
    if-eqz v0, :cond_1d

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_17

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lax/a1/F0;->F(Ljava/nio/ByteBuffer;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1d
    invoke-direct {p0, p1}, Lax/a1/F0;->C(Ljava/nio/ByteBuffer;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_21
    return-void
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

.method public e()Z
    .registers 2

    .line 1
    invoke-super {p0}, Lax/Q0/q;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/a1/F0;->o:Z

    .line 8
    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected i(Lax/Q0/o$a;)Lax/Q0/o$a;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation

    .line 1
    iget v0, p1, Lax/Q0/o$a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_d

    .line 5
    .line 6
    iget v0, p1, Lax/Q0/o$a;->a:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_c

    .line 10
    .line 11
    sget-object p1, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 12
    .line 13
    :cond_c
    return-object p1

    .line 14
    :cond_d
    new-instance v0, Lax/Q0/o$b;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lax/Q0/o$b;-><init>(Lax/Q0/o$a;)V

    .line 17
    .line 18
    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
.end method

.method public j()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/a1/F0;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_29

    .line 6
    .line 7
    iget-object v0, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 8
    .line 9
    iget v0, v0, Lax/Q0/o$a;->b:I

    .line 10
    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    iput v0, p0, Lax/a1/F0;->n:I

    .line 14
    .line 15
    iget-wide v0, p0, Lax/a1/F0;->l:J

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Lax/a1/F0;->s(J)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    div-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lax/a1/F0;->o(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    mul-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    iget-object v1, p0, Lax/a1/F0;->s:[B

    .line 30
    .line 31
    array-length v1, v1

    .line 32
    if-eq v1, v0, :cond_29

    .line 33
    .line 34
    new-array v1, v0, [B

    .line 35
    .line 36
    iput-object v1, p0, Lax/a1/F0;->s:[B

    .line 37
    .line 38
    new-array v0, v0, [B

    .line 39
    .line 40
    iput-object v0, p0, Lax/a1/F0;->v:[B

    .line 41
    .line 42
    :cond_29
    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lax/a1/F0;->p:I

    .line 44
    .line 45
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    iput-wide v1, p0, Lax/a1/F0;->q:J

    .line 48
    .line 49
    iput v0, p0, Lax/a1/F0;->r:I

    .line 50
    .line 51
    iput v0, p0, Lax/a1/F0;->t:I

    .line 52
    .line 53
    iput v0, p0, Lax/a1/F0;->u:I

    .line 54
    .line 55
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
.end method

.method public k()V
    .registers 2

    .line 1
    iget v0, p0, Lax/a1/F0;->u:I

    .line 2
    .line 3
    if-lez v0, :cond_b

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lax/a1/F0;->A(Z)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lax/a1/F0;->r:I

    .line 11
    .line 12
    :cond_b
    return-void
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

.method public l()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/a1/F0;->o:Z

    .line 3
    .line 4
    sget-object v0, Lax/S0/d0;->f:[B

    .line 5
    .line 6
    iput-object v0, p0, Lax/a1/F0;->s:[B

    .line 7
    .line 8
    iput-object v0, p0, Lax/a1/F0;->v:[B

    .line 9
    .line 10
    return-void
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

.method public v()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/a1/F0;->q:J

    .line 2
    .line 3
    return-wide v0
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
