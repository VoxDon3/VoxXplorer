.class public final Lax/u0/k;
.super Lax/u0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u0/h<",
        "Lax/u0/k;",
        ">;"
    }
.end annotation


# instance fields
.field private B:Lax/u0/l;

.field private C:F

.field private D:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lax/u0/i;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lax/u0/i<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/u0/h;-><init>(Ljava/lang/Object;Lax/u0/i;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 6
    .line 7
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lax/u0/k;->C:F

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lax/u0/k;->D:Z

    .line 14
    .line 15
    return-void
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

.method private p()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_28

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/u0/l;->b()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    float-to-double v0, v0

    .line 10
    iget v2, p0, Lax/u0/h;->g:F

    .line 11
    .line 12
    float-to-double v2, v2

    .line 13
    cmpl-double v4, v0, v2

    .line 14
    .line 15
    if-gtz v4, :cond_20

    .line 16
    .line 17
    iget v2, p0, Lax/u0/h;->h:F

    .line 18
    .line 19
    float-to-double v2, v2

    .line 20
    cmpg-double v4, v0, v2

    .line 21
    .line 22
    if-ltz v4, :cond_18

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string v1, "Final position of the spring cannot be less than the min value."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_20
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string v1, "Final position of the spring cannot be greater than the max value."

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_28
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 42
    .line 43
    const-string v1, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
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


# virtual methods
.method public j()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/u0/k;->p()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/u0/h;->e()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    float-to-double v1, v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lax/u0/l;->i(D)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Lax/u0/h;->j()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method l(J)Z
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lax/u0/k;->D:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 9
    .line 10
    .line 11
    if-eqz v1, :cond_26

    .line 12
    .line 13
    iget v1, v0, Lax/u0/k;->C:F

    .line 14
    .line 15
    cmpl-float v6, v1, v5

    .line 16
    .line 17
    if-eqz v6, :cond_19

    .line 18
    .line 19
    iget-object v6, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 20
    .line 21
    invoke-virtual {v6, v1}, Lax/u0/l;->g(F)Lax/u0/l;

    .line 22
    .line 23
    .line 24
    iput v5, v0, Lax/u0/k;->C:F

    .line 25
    .line 26
    :cond_19
    iget-object v1, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 27
    .line 28
    invoke-virtual {v1}, Lax/u0/l;->b()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, v0, Lax/u0/h;->b:F

    .line 33
    .line 34
    iput v4, v0, Lax/u0/h;->a:F

    .line 35
    .line 36
    iput-boolean v3, v0, Lax/u0/k;->D:Z

    .line 37
    .line 38
    return v2

    .line 39
    :cond_26
    iget v1, v0, Lax/u0/k;->C:F

    .line 40
    .line 41
    cmpl-float v1, v1, v5

    .line 42
    .line 43
    if-eqz v1, :cond_5e

    .line 44
    .line 45
    iget-object v6, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 46
    .line 47
    iget v1, v0, Lax/u0/h;->b:F

    .line 48
    .line 49
    float-to-double v7, v1

    .line 50
    iget v1, v0, Lax/u0/h;->a:F

    .line 51
    .line 52
    float-to-double v9, v1

    .line 53
    const-wide/16 v11, 0x2

    .line 54
    .line 55
    div-long v18, p1, v11

    .line 56
    .line 57
    move-wide/from16 v11, v18

    .line 58
    .line 59
    invoke-virtual/range {v6 .. v12}, Lax/u0/l;->j(DDJ)Lax/u0/h$o;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v6, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 64
    .line 65
    iget v7, v0, Lax/u0/k;->C:F

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Lax/u0/l;->g(F)Lax/u0/l;

    .line 68
    .line 69
    .line 70
    iput v5, v0, Lax/u0/k;->C:F

    .line 71
    .line 72
    iget-object v13, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 73
    .line 74
    iget v5, v1, Lax/u0/h$o;->a:F

    .line 75
    .line 76
    float-to-double v14, v5

    .line 77
    iget v1, v1, Lax/u0/h$o;->b:F

    .line 78
    .line 79
    float-to-double v5, v1

    .line 80
    move-wide/from16 v16, v5

    .line 81
    .line 82
    invoke-virtual/range {v13 .. v19}, Lax/u0/l;->j(DDJ)Lax/u0/h$o;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget v5, v1, Lax/u0/h$o;->a:F

    .line 87
    .line 88
    iput v5, v0, Lax/u0/h;->b:F

    .line 89
    .line 90
    iget v1, v1, Lax/u0/h$o;->b:F

    .line 91
    .line 92
    iput v1, v0, Lax/u0/h;->a:F

    .line 93
    .line 94
    goto :goto_74

    .line 95
    :cond_5e
    iget-object v5, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 96
    .line 97
    iget v1, v0, Lax/u0/h;->b:F

    .line 98
    .line 99
    float-to-double v6, v1

    .line 100
    iget v1, v0, Lax/u0/h;->a:F

    .line 101
    .line 102
    float-to-double v8, v1

    .line 103
    move-wide/from16 v10, p1

    .line 104
    .line 105
    invoke-virtual/range {v5 .. v11}, Lax/u0/l;->j(DDJ)Lax/u0/h$o;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget v5, v1, Lax/u0/h$o;->a:F

    .line 110
    .line 111
    iput v5, v0, Lax/u0/h;->b:F

    .line 112
    .line 113
    iget v1, v1, Lax/u0/h$o;->b:F

    .line 114
    .line 115
    iput v1, v0, Lax/u0/h;->a:F

    .line 116
    .line 117
    :goto_74
    iget v1, v0, Lax/u0/h;->b:F

    .line 118
    .line 119
    iget v5, v0, Lax/u0/h;->h:F

    .line 120
    .line 121
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    iput v1, v0, Lax/u0/h;->b:F

    .line 126
    .line 127
    iget v5, v0, Lax/u0/h;->g:F

    .line 128
    .line 129
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    iput v1, v0, Lax/u0/h;->b:F

    .line 134
    .line 135
    iget v5, v0, Lax/u0/h;->a:F

    .line 136
    .line 137
    invoke-virtual {v0, v1, v5}, Lax/u0/k;->o(FF)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_99

    .line 142
    .line 143
    iget-object v1, v0, Lax/u0/k;->B:Lax/u0/l;

    .line 144
    .line 145
    invoke-virtual {v1}, Lax/u0/l;->b()F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iput v1, v0, Lax/u0/h;->b:F

    .line 150
    .line 151
    iput v4, v0, Lax/u0/h;->a:F

    .line 152
    .line 153
    return v2

    .line 154
    :cond_99
    return v3
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

.method public m(F)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/u0/h;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iput p1, p0, Lax/u0/k;->C:F

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 11
    .line 12
    if-nez v0, :cond_14

    .line 13
    .line 14
    new-instance v0, Lax/u0/l;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lax/u0/l;-><init>(F)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lax/u0/l;->g(F)Lax/u0/l;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lax/u0/k;->j()V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public n()Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 2
    .line 3
    iget-wide v0, v0, Lax/u0/l;->b:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v4, v0, v2

    .line 8
    .line 9
    if-lez v4, :cond_c

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

.method o(FF)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/u0/l;->e(FF)Z

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

.method public q(Lax/u0/l;)Lax/u0/k;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/u0/k;->B:Lax/u0/l;

    .line 2
    .line 3
    return-object p0
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

.method public r()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/u0/k;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_20

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/u0/h;->c()Lax/u0/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/u0/c;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_18

    .line 16
    .line 17
    iget-boolean v0, p0, Lax/u0/h;->f:Z

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lax/u0/k;->D:Z

    .line 23
    .line 24
    :cond_17
    return-void

    .line 25
    :cond_18
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 26
    .line 27
    const-string v1, "Animations may only be started on the same thread as the animation handler"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_20
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string v1, "Spring animations can only come to an end when there is damping"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
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
