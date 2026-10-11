.class Lcom/voxdon/xplorer/file/k$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lcom/voxdon/xplorer/file/c$a;

.field i:Lax/g3/k;

.field j:Lax/u4/a;

.field k:Landroid/content/Context;

.field l:Lcom/voxdon/xplorer/file/k;

.field m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/g3/k;Lax/u4/a;)V
    .registers 5

    .line 6
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 7
    iput-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->k:Landroid/content/Context;

    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 9
    iput-object p3, p0, Lcom/voxdon/xplorer/file/k$b;->j:Lax/u4/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/k;Lcom/voxdon/xplorer/file/c$a;Lax/u4/a;)V
    .registers 6

    .line 1
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 2
    iput-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->k:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lcom/voxdon/xplorer/file/k$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 4
    iput-object p4, p0, Lcom/voxdon/xplorer/file/k$b;->j:Lax/u4/a;

    .line 5
    iput-object p2, p0, Lcom/voxdon/xplorer/file/k$b;->l:Lcom/voxdon/xplorer/file/k;

    return-void
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/k$b;->w([Ljava/lang/Void;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/k$b;->x(Ljava/lang/Integer;)V

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
.end method

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Integer;
    .registers 16

    .line 1
    const-string p1, ""

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k$b;->j:Lax/u4/a;

    .line 4
    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-static {v0}, Lcom/voxdon/xplorer/file/k;->r0(Lax/u4/a;)Lax/x4/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_12
    invoke-virtual {v0}, Lax/x4/b;->b()Lax/M4/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lax/M4/b;->a()Lax/M4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lax/M4/c;->c()Lax/M4/f;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lax/M4/f;->a()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4
    :try_end_22
    .catch Lax/p4/j; {:try_start_12 .. :try_end_22} :catch_68

    .line 35
    :try_start_22
    invoke-virtual {v3}, Lax/M4/c;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5
    :try_end_26
    .catch Lax/p4/j; {:try_start_22 .. :try_end_26} :catch_63

    .line 39
    :try_start_26
    invoke-virtual {v3}, Lax/M4/c;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v6, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 44
    .line 45
    if-eqz v6, :cond_5d

    .line 46
    .line 47
    invoke-virtual {v3}, Lax/M4/c;->d()Lax/C4/c;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-eqz v6, :cond_5d

    .line 52
    .line 53
    invoke-virtual {v3}, Lax/M4/c;->d()Lax/C4/c;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Lax/C4/c;->b()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v3}, Lax/M4/c;->d()Lax/C4/c;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Lax/C4/c;->a()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_5d

    .line 74
    .line 75
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_5d

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3
    :try_end_54
    .catch Lax/p4/j; {:try_start_26 .. :try_end_54} :catch_58

    .line 85
    if-nez v3, :cond_5d

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    goto :goto_5e

    .line 89
    :catch_58
    nop

    .line 90
    move-object v3, v2

    .line 91
    move-object v2, p1

    .line 92
    :goto_5b
    move-object p1, v4

    .line 93
    goto :goto_6c

    .line 94
    :cond_5d
    const/4 v3, 0x0

    .line 95
    :goto_5e
    move-object v10, p1

    .line 96
    move-object v11, v2

    .line 97
    move-object v9, v4

    .line 98
    :goto_61
    move-object v8, v5

    .line 99
    goto :goto_71

    .line 100
    :catch_63
    nop

    .line 101
    move-object v5, p1

    .line 102
    move-object v3, v2

    .line 103
    move-object v2, v5

    .line 104
    goto :goto_5b

    .line 105
    :catch_68
    nop

    .line 106
    move-object v5, p1

    .line 107
    move-object v3, v2

    .line 108
    move-object v2, v5

    .line 109
    :goto_6c
    move-object v9, p1

    .line 110
    move-object v10, v2

    .line 111
    move-object v11, v3

    .line 112
    const/4 v3, 0x0

    .line 113
    goto :goto_61

    .line 114
    :goto_71
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->k:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {p1}, Lcom/voxdon/xplorer/file/k;->s0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/k$a;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->l:Lcom/voxdon/xplorer/file/k;

    .line 121
    .line 122
    if-eqz p1, :cond_81

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    :cond_7f
    :goto_7f
    move v7, p1

    .line 129
    goto :goto_8d

    .line 130
    :cond_81
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/k$a;->n()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-virtual {v6, v8, v9}, Lcom/voxdon/xplorer/file/k$a;->m(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ltz v2, :cond_7f

    .line 139
    .line 140
    move p1, v2

    .line 141
    goto :goto_7f

    .line 142
    :goto_8d
    const/4 v12, 0x0

    .line 143
    iget-object v13, p0, Lcom/voxdon/xplorer/file/k$b;->j:Lax/u4/a;

    .line 144
    .line 145
    invoke-virtual/range {v6 .. v13}, Lcom/voxdon/xplorer/file/k$a;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/u4/a;)V

    .line 146
    .line 147
    .line 148
    iput v7, p0, Lcom/voxdon/xplorer/file/k$b;->m:I

    .line 149
    .line 150
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 151
    .line 152
    if-eqz p1, :cond_a1

    .line 153
    .line 154
    if-eqz v3, :cond_a1

    .line 155
    .line 156
    const/4 p1, -0x2

    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :cond_a1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->l:Lcom/voxdon/xplorer/file/k;

    .line 163
    .line 164
    if-eqz p1, :cond_ad

    .line 165
    .line 166
    invoke-virtual {p1, v11}, Lcom/voxdon/xplorer/file/k;->A0(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->l:Lcom/voxdon/xplorer/file/k;

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/k;->z0(Lax/x4/a;)V

    .line 172
    .line 173
    .line 174
    :cond_ad
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1
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

.method protected x(Ljava/lang/Integer;)V
    .registers 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1b

    .line 7
    .line 8
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 9
    .line 10
    if-eqz p1, :cond_f

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 17
    .line 18
    if-eqz p1, :cond_57

    .line 19
    .line 20
    sget-object v0, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 21
    .line 22
    iget v1, p0, Lcom/voxdon/xplorer/file/k$b;->m:I

    .line 23
    .line 24
    invoke-interface {p1, v0, v1}, Lax/g3/k;->c(Lax/Q2/f;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 v0, -0x2

    .line 33
    const/4 v2, 0x0

    .line 34
    if-ne p1, v0, :cond_43

    .line 35
    .line 36
    :try_start_23
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 37
    .line 38
    sget-object v0, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 39
    .line 40
    iget v3, p0, Lcom/voxdon/xplorer/file/k$b;->m:I

    .line 41
    .line 42
    invoke-interface {p1, v0, v3, v1}, Lax/g3/k;->d(Lax/Q2/f;ILjava/util/Map;)V
    :try_end_2c
    .catch Ljava/lang/IllegalStateException; {:try_start_23 .. :try_end_2c} :catch_2d

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_2d
    nop

    .line 47
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 48
    .line 49
    if-eqz p1, :cond_35

    .line 50
    .line 51
    invoke-interface {p1, v2, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    iget-object v3, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 55
    .line 56
    if-eqz v3, :cond_57

    .line 57
    .line 58
    sget-object v4, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-interface/range {v3 .. v8}, Lax/g3/k;->a(Lax/Q2/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_57

    .line 68
    :cond_43
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 69
    .line 70
    if-eqz p1, :cond_4a

    .line 71
    .line 72
    invoke-interface {p1, v2, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    iget-object v3, p0, Lcom/voxdon/xplorer/file/k$b;->i:Lax/g3/k;

    .line 76
    .line 77
    if-eqz v3, :cond_57

    .line 78
    .line 79
    sget-object v4, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-interface/range {v3 .. v8}, Lax/g3/k;->a(Lax/Q2/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_57
    :goto_57
    return-void
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
