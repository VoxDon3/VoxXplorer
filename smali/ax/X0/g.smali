.class final Lax/X0/g;
.super Lax/I9/b;
.source "SourceFile"

# interfaces
.implements Lax/I9/y;


# instance fields
.field private final j:Lax/B9/d;

.field private final k:Lax/H9/k;

.field private final l:Lax/H9/k;

.field private final m:Lax/I9/z;

.field private final n:Lax/I9/B;

.field private final o:Lax/I9/g;

.field private final p:Lax/I9/c;

.field private final q:Lax/I9/c;

.field private final r:Lax/I9/j;

.field private final s:Lax/H9/k;

.field private final t:Lax/H9/k;

.field private u:I

.field private v:I

.field private w:I

.field private x:Lax/X0/i$c;


# direct methods
.method public constructor <init>([S)V
    .registers 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lax/I9/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/B9/d;

    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lax/B9/d;-><init>([S)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, Lax/X0/g;->j:Lax/B9/d;

    .line 14
    .line 15
    new-instance v1, Lax/I9/j;

    .line 16
    .line 17
    invoke-direct {v1}, Lax/I9/j;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lax/X0/g;->r:Lax/I9/j;

    .line 21
    .line 22
    new-instance v2, Lax/I9/A;

    .line 23
    .line 24
    invoke-direct {v2}, Lax/I9/A;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, v0, Lax/X0/g;->m:Lax/I9/z;

    .line 28
    .line 29
    new-instance v3, Lax/I9/B;

    .line 30
    .line 31
    invoke-direct {v3}, Lax/I9/B;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v3, v0, Lax/X0/g;->n:Lax/I9/B;

    .line 35
    .line 36
    new-instance v4, Lax/I9/c;

    .line 37
    .line 38
    invoke-direct {v4}, Lax/I9/c;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v4, v0, Lax/X0/g;->p:Lax/I9/c;

    .line 42
    .line 43
    new-instance v5, Lax/I9/c;

    .line 44
    .line 45
    invoke-direct {v5}, Lax/I9/c;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v5, v0, Lax/X0/g;->q:Lax/I9/c;

    .line 49
    .line 50
    iget-object v6, v5, Lax/I9/c;->p:Lax/H9/k;

    .line 51
    .line 52
    iput-object v6, v0, Lax/X0/g;->t:Lax/H9/k;

    .line 53
    .line 54
    new-instance v7, Lax/I9/g;

    .line 55
    .line 56
    invoke-direct {v7}, Lax/I9/g;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v7, v0, Lax/X0/g;->o:Lax/I9/g;

    .line 60
    .line 61
    iget-object v8, v1, Lax/I9/r;->i:Lax/H9/k;

    .line 62
    .line 63
    iput-object v8, v0, Lax/X0/g;->k:Lax/H9/k;

    .line 64
    .line 65
    new-instance v9, Lax/I9/j;

    .line 66
    .line 67
    invoke-direct {v9}, Lax/I9/j;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object v10, v9, Lax/I9/r;->h:Lax/H9/k;

    .line 71
    .line 72
    iput-object v10, v0, Lax/X0/g;->l:Lax/H9/k;

    .line 73
    .line 74
    new-instance v11, Lax/I9/a;

    .line 75
    .line 76
    invoke-direct {v11}, Lax/I9/a;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v12, v11, Lax/I9/r;->i:Lax/H9/k;

    .line 80
    .line 81
    iput-object v12, v0, Lax/X0/g;->s:Lax/H9/k;

    .line 82
    .line 83
    iget-object v13, v9, Lax/I9/r;->i:Lax/H9/k;

    .line 84
    .line 85
    new-instance v14, Lax/I9/j;

    .line 86
    .line 87
    invoke-direct {v14}, Lax/I9/j;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v9}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v14}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v3}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v5}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v7}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v11}, Lax/I9/b;->z(Lax/I9/u;)V

    .line 115
    .line 116
    .line 117
    iget-object v3, v5, Lax/I9/t;->i:Lax/H9/l;

    .line 118
    .line 119
    iget-object v15, v11, Lax/I9/r;->h:Lax/H9/k;

    .line 120
    .line 121
    invoke-virtual {v3, v15}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 122
    .line 123
    .line 124
    iget-object v3, v11, Lax/I9/r;->j:Lax/H9/l;

    .line 125
    .line 126
    iget-object v11, v7, Lax/I9/p;->j:Lax/H9/k;

    .line 127
    .line 128
    invoke-virtual {v3, v11}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, v9, Lax/I9/r;->j:Lax/H9/l;

    .line 132
    .line 133
    iget-object v9, v2, Lax/I9/z;->k:Lax/H9/k;

    .line 134
    .line 135
    invoke-virtual {v3, v9}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, v1, Lax/I9/r;->j:Lax/H9/l;

    .line 139
    .line 140
    iget-object v3, v14, Lax/I9/r;->h:Lax/H9/k;

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v14, Lax/I9/r;->j:Lax/H9/l;

    .line 146
    .line 147
    iget-object v3, v4, Lax/I9/c;->p:Lax/H9/k;

    .line 148
    .line 149
    invoke-virtual {v1, v3}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 150
    .line 151
    .line 152
    const-string v1, "Amplitude"

    .line 153
    .line 154
    invoke-virtual {v0, v8, v1}, Lax/I9/u;->g(Lax/H9/m;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v1, "Frequency"

    .line 158
    .line 159
    invoke-virtual {v0, v10, v1}, Lax/I9/u;->g(Lax/H9/m;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v1, "Cutoff"

    .line 163
    .line 164
    invoke-virtual {v0, v12, v1}, Lax/I9/u;->g(Lax/H9/m;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string v1, "Timbre"

    .line 168
    .line 169
    invoke-virtual {v0, v12, v1}, Lax/I9/b;->A(Lax/H9/m;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v1, "FreqScaler"

    .line 173
    .line 174
    invoke-virtual {v0, v13, v1}, Lax/I9/u;->g(Lax/H9/m;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v1, "FilterEnvDepth"

    .line 178
    .line 179
    invoke-virtual {v0, v6, v1}, Lax/I9/u;->g(Lax/H9/m;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "Filter"

    .line 183
    .line 184
    invoke-virtual {v5, v0, v1}, Lax/I9/c;->A(Lax/I9/b;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v1, "Amp"

    .line 188
    .line 189
    invoke-virtual {v4, v0, v1}, Lax/I9/c;->A(Lax/I9/b;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget-object v1, v2, Lax/I9/z;->k:Lax/H9/k;

    .line 193
    .line 194
    invoke-virtual {v10, v1}, Lax/H9/k;->D(Lax/H9/k;)V

    .line 195
    .line 196
    .line 197
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 198
    .line 199
    const-wide/high16 v18, 0x4010000000000000L    # 4.0

    .line 200
    .line 201
    move-object v1, v14

    .line 202
    const-wide v14, 0x3fc999999999999aL    # 0.2

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v13 .. v19}, Lax/H9/k;->C(DDD)V

    .line 208
    .line 209
    .line 210
    iget-object v3, v7, Lax/I9/p;->j:Lax/H9/k;

    .line 211
    .line 212
    invoke-virtual {v12, v3}, Lax/H9/k;->D(Lax/H9/k;)V

    .line 213
    .line 214
    .line 215
    const-wide v9, 0x409f400000000000L    # 2000.0

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    const-wide v11, 0x40af400000000000L    # 4000.0

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    const-wide v7, -0x3f50c00000000000L    # -4000.0

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v6 .. v12}, Lax/H9/k;->C(DDD)V

    .line 231
    .line 232
    .line 233
    iget-object v2, v2, Lax/I9/m;->i:Lax/H9/k;

    .line 234
    .line 235
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 236
    .line 237
    invoke-virtual {v2, v5, v6}, Lax/H9/k;->u(D)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v0}, Lax/I9/t;->z(Lax/I9/u;)V

    .line 241
    .line 242
    .line 243
    iget-object v7, v1, Lax/I9/r;->i:Lax/H9/k;

    .line 244
    .line 245
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 246
    .line 247
    const-wide/high16 v12, 0x4010000000000000L    # 4.0

    .line 248
    .line 249
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 250
    .line 251
    invoke-virtual/range {v7 .. v13}, Lax/H9/k;->C(DDD)V

    .line 252
    .line 253
    .line 254
    iget-object v1, v1, Lax/I9/r;->i:Lax/H9/k;

    .line 255
    .line 256
    const-string v2, "Pressure"

    .line 257
    .line 258
    invoke-virtual {v0, v1, v2}, Lax/I9/b;->A(Lax/H9/m;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const/4 v1, 0x0

    .line 262
    invoke-virtual {v0, v1}, Lax/X0/g;->c(I)V

    .line 263
    .line 264
    .line 265
    return-void
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

.method private static B(Lax/X0/i$b;Lax/I9/c;Lax/Qa/c;)V
    .registers 6

    .line 1
    iget-object v0, p1, Lax/I9/c;->k:Lax/H9/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/X0/i$b;->b()D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2, p2}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lax/I9/c;->m:Lax/H9/k;

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/X0/i$b;->c()D

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0, v1, v2, p2}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lax/I9/c;->n:Lax/H9/k;

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/X0/i$b;->e()D

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-virtual {v0, v1, v2, p2}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lax/I9/c;->o:Lax/H9/k;

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/X0/i$b;->d()D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-virtual {p1, v0, v1, p2}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method private static C(Lax/X0/i$c;D)D
    .registers 7

    .line 1
    iget-short p0, p0, Lax/X0/i$c;->h:S

    .line 2
    .line 3
    int-to-double v0, p0

    .line 4
    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    mul-double v0, v0, v2

    .line 10
    .line 11
    add-double/2addr p1, v0

    .line 12
    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    .line 13
    .line 14
    div-double/2addr p1, v0

    .line 15
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    return-wide p0
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

.method private D()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 2
    .line 3
    iget-object v0, v0, Lax/I9/c;->k:Lax/H9/k;

    .line 4
    .line 5
    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 14
    .line 15
    iget-object v0, v0, Lax/I9/c;->m:Lax/H9/k;

    .line 16
    .line 17
    const-wide v3, 0x3feccccccccccccdL    # 0.9

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3, v4}, Lax/H9/k;->u(D)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 26
    .line 27
    iget-object v0, v0, Lax/I9/c;->n:Lax/H9/k;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 33
    .line 34
    iget-object v0, v0, Lax/I9/c;->o:Lax/H9/k;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 40
    .line 41
    iget-object v0, v0, Lax/I9/c;->k:Lax/H9/k;

    .line 42
    .line 43
    const-wide v1, 0x3f847ae147ae147bL    # 0.01

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 52
    .line 53
    iget-object v0, v0, Lax/I9/c;->m:Lax/H9/k;

    .line 54
    .line 55
    const-wide v1, 0x3fe3333333333333L    # 0.6

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 64
    .line 65
    iget-object v0, v0, Lax/I9/c;->n:Lax/H9/k;

    .line 66
    .line 67
    const-wide v1, 0x3fd999999999999aL    # 0.4

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 76
    .line 77
    iget-object v0, v0, Lax/I9/c;->o:Lax/H9/k;

    .line 78
    .line 79
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lax/X0/g;->o:Lax/I9/g;

    .line 85
    .line 86
    iget-object v0, v0, Lax/I9/f;->y:Lax/H9/k;

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lax/X0/g;->s:Lax/H9/k;

    .line 92
    .line 93
    const-wide v1, 0x40b3880000000000L    # 5000.0

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lax/X0/g;->t:Lax/H9/k;

    .line 102
    .line 103
    const-wide v1, 0x407f400000000000L    # 500.0

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lax/H9/k;->u(D)V

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Lax/X0/g;->x:Lax/X0/i$c;

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

.method private E(Lax/X0/i$c;ILax/Qa/c;)Lax/X0/i$c;
    .registers 7

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lax/X0/i$c;->c(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_28

    .line 8
    .line 9
    :cond_8
    iget p1, p0, Lax/X0/g;->w:I

    .line 10
    .line 11
    invoke-static {p1}, Lax/X0/i;->d(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Lax/X0/i;->b(I)Lax/X0/i$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v2, v0

    .line 20
    move v0, p1

    .line 21
    move-object p1, v2

    .line 22
    :goto_15
    invoke-virtual {p1, p2}, Lax/X0/i$c;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_28

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/X0/i$c;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_28

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-static {v0}, Lax/X0/i;->b(I)Lax/X0/i$c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_15

    .line 41
    :cond_28
    iget p2, p1, Lax/X0/i$c;->c:I

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/X0/i$c;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_37

    .line 48
    .line 49
    const/4 p2, -0x1

    .line 50
    iput p2, p0, Lax/X0/g;->u:I

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    iput p2, p0, Lax/X0/g;->v:I

    .line 54
    .line 55
    goto :goto_4b

    .line 56
    :cond_37
    invoke-static {}, Lax/X0/i;->e()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lt p2, v0, :cond_3f

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    return-object p1

    .line 64
    :cond_3f
    invoke-static {p2}, Lax/X0/i;->f(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lax/X0/g;->u:I

    .line 69
    .line 70
    invoke-static {p2}, Lax/X0/i;->g(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iput p2, p0, Lax/X0/g;->v:I

    .line 75
    .line 76
    :goto_4b
    iget p2, p1, Lax/X0/i$c;->d:I

    .line 77
    .line 78
    invoke-static {p2}, Lax/X0/i;->a(I)Lax/X0/i$a;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget-object v0, p2, Lax/X0/i$a;->a:Lax/X0/i$b;

    .line 83
    .line 84
    iget-object v1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 85
    .line 86
    invoke-static {v0, v1, p3}, Lax/X0/g;->B(Lax/X0/i$b;Lax/I9/c;Lax/Qa/c;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p2, Lax/X0/i$a;->b:Lax/X0/i$b;

    .line 90
    .line 91
    iget-object v1, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 92
    .line 93
    invoke-static {v0, v1, p3}, Lax/X0/g;->B(Lax/X0/i$b;Lax/I9/c;Lax/Qa/c;)V

    .line 94
    .line 95
    .line 96
    iget-short p2, p2, Lax/X0/i$a;->h:S

    .line 97
    .line 98
    if-lez p2, :cond_75

    .line 99
    .line 100
    int-to-double p2, p2

    .line 101
    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    mul-double p2, p2, v0

    .line 107
    .line 108
    invoke-static {p2, p3}, Lax/Pa/a;->b(D)D

    .line 109
    .line 110
    .line 111
    move-result-wide p2

    .line 112
    iget-object v0, p0, Lax/X0/g;->s:Lax/H9/k;

    .line 113
    .line 114
    invoke-virtual {v0, p2, p3}, Lax/H9/k;->u(D)V

    .line 115
    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_75
    iget-object p2, p0, Lax/X0/g;->s:Lax/H9/k;

    .line 119
    .line 120
    const-wide v0, 0x40af400000000000L    # 4000.0

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v0, v1}, Lax/H9/k;->u(D)V

    .line 126
    .line 127
    .line 128
    return-object p1
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


# virtual methods
.method public a(DDLax/Qa/c;)V
    .registers 11

    .line 1
    invoke-static {p1, p2}, Lax/Pa/a;->a(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, Lax/X0/g;->x:Lax/X0/i$c;

    .line 6
    .line 7
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 8
    .line 9
    add-double/2addr v1, p1

    .line 10
    double-to-int v1, v1

    .line 11
    invoke-direct {p0, v0, v1, p5}, Lax/X0/g;->E(Lax/X0/i$c;ILax/Qa/c;)Lax/X0/i$c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/X0/g;->x:Lax/X0/i$c;

    .line 16
    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lax/X0/i$c;

    .line 25
    .line 26
    const-wide v1, 0x40d5888000000000L    # 22050.0

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1, p2}, Lax/X0/g;->C(Lax/X0/i$c;D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    mul-double p1, p1, v1

    .line 36
    .line 37
    mul-double p3, p3, p3

    .line 38
    .line 39
    iget-short v1, v0, Lax/X0/i$c;->i:S

    .line 40
    .line 41
    int-to-double v1, v1

    .line 42
    const-wide/high16 v3, 0x3f00000000000000L    # 3.0517578125E-5

    .line 43
    .line 44
    mul-double v1, v1, v3

    .line 45
    .line 46
    mul-double p3, p3, v1

    .line 47
    .line 48
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    .line 49
    .line 50
    mul-double p3, p3, v1

    .line 51
    .line 52
    iget-object v1, p0, Lax/X0/g;->l:Lax/H9/k;

    .line 53
    .line 54
    invoke-virtual {v1, p1, p2, p5}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lax/X0/g;->k:Lax/H9/k;

    .line 58
    .line 59
    invoke-virtual {p1, p3, p4, p5}, Lax/H9/k;->v(DLax/Qa/c;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 63
    .line 64
    iget-object p1, p1, Lax/I9/t;->h:Lax/H9/j;

    .line 65
    .line 66
    invoke-virtual {p1, p5}, Lax/H9/j;->K(Lax/Qa/c;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 70
    .line 71
    iget-object p1, p1, Lax/I9/t;->h:Lax/H9/j;

    .line 72
    .line 73
    invoke-virtual {p1, p5}, Lax/H9/j;->K(Lax/Qa/c;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 77
    .line 78
    iget-object p1, p1, Lax/I9/m;->j:Lax/H9/l;

    .line 79
    .line 80
    invoke-virtual {p1}, Lax/H9/g;->i()V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lax/X0/g;->n:Lax/I9/B;

    .line 84
    .line 85
    iget-object p1, p1, Lax/I9/B;->j:Lax/H9/l;

    .line 86
    .line 87
    invoke-virtual {p1}, Lax/H9/g;->i()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lax/X0/i$c;->d()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_6b

    .line 95
    .line 96
    iget-object p1, p0, Lax/X0/g;->n:Lax/I9/B;

    .line 97
    .line 98
    iget-object p1, p1, Lax/I9/B;->j:Lax/H9/l;

    .line 99
    .line 100
    iget-object p2, p0, Lax/X0/g;->r:Lax/I9/j;

    .line 101
    .line 102
    iget-object p2, p2, Lax/I9/r;->h:Lax/H9/k;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6b
    iget-object p1, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 109
    .line 110
    iget-object p1, p1, Lax/I9/m;->j:Lax/H9/l;

    .line 111
    .line 112
    iget-object p2, p0, Lax/X0/g;->r:Lax/I9/j;

    .line 113
    .line 114
    iget-object p2, p2, Lax/I9/r;->h:Lax/H9/k;

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Lax/H9/l;->r(Lax/H9/k;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 120
    .line 121
    iget-object p1, p1, Lax/I9/m;->h:Lax/H9/i;

    .line 122
    .line 123
    invoke-virtual {p1, p5}, Lax/H9/i;->o(Lax/Qa/c;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lax/X0/i$c;->b()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_a3

    .line 131
    .line 132
    iget p1, p0, Lax/X0/g;->u:I

    .line 133
    .line 134
    iget p2, v0, Lax/X0/i$c;->a:I

    .line 135
    .line 136
    add-int/2addr p2, p1

    .line 137
    iget p3, v0, Lax/X0/i$c;->b:I

    .line 138
    .line 139
    add-int/2addr p3, p1

    .line 140
    sub-int/2addr p3, p2

    .line 141
    if-le p2, p1, :cond_99

    .line 142
    .line 143
    iget-object p4, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 144
    .line 145
    iget-object p4, p4, Lax/I9/m;->h:Lax/H9/i;

    .line 146
    .line 147
    iget-object v0, p0, Lax/X0/g;->j:Lax/B9/d;

    .line 148
    .line 149
    sub-int v1, p2, p1

    .line 150
    .line 151
    invoke-virtual {p4, v0, p1, v1, p5}, Lax/H9/i;->y(Lax/B9/b;IILax/Qa/c;)V

    .line 152
    .line 153
    .line 154
    :cond_99
    iget-object p1, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 155
    .line 156
    iget-object p1, p1, Lax/I9/m;->h:Lax/H9/i;

    .line 157
    .line 158
    iget-object p4, p0, Lax/X0/g;->j:Lax/B9/d;

    .line 159
    .line 160
    invoke-virtual {p1, p4, p2, p3, p5}, Lax/H9/i;->A(Lax/B9/b;IILax/Qa/c;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_a3
    iget-object p1, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 165
    .line 166
    iget-object p1, p1, Lax/I9/m;->h:Lax/H9/i;

    .line 167
    .line 168
    iget-object p2, p0, Lax/X0/g;->j:Lax/B9/d;

    .line 169
    .line 170
    iget p3, p0, Lax/X0/g;->u:I

    .line 171
    .line 172
    iget p4, p0, Lax/X0/g;->v:I

    .line 173
    .line 174
    invoke-virtual {p1, p2, p3, p4, p5}, Lax/H9/i;->y(Lax/B9/b;IILax/Qa/c;)V

    .line 175
    .line 176
    .line 177
    return-void
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

.method public b()Lax/H9/l;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 2
    .line 3
    iget-object v0, v0, Lax/I9/t;->i:Lax/H9/l;

    .line 4
    .line 5
    return-object v0
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

.method public c(I)V
    .registers 6

    .line 1
    iget v0, p0, Lax/X0/g;->w:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_5

    .line 4
    .line 5
    goto :goto_4f

    .line 6
    :cond_5
    invoke-direct {p0}, Lax/X0/g;->D()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lax/X0/g;->w:I

    .line 10
    .line 11
    if-nez p1, :cond_4f

    .line 12
    .line 13
    iget-object p1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 14
    .line 15
    iget-object p1, p1, Lax/I9/c;->k:Lax/H9/k;

    .line 16
    .line 17
    const-wide v0, 0x3fb999999999999aL    # 0.1

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 26
    .line 27
    iget-object p1, p1, Lax/I9/c;->m:Lax/H9/k;

    .line 28
    .line 29
    const-wide v2, 0x3feccccccccccccdL    # 0.9

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2, v3}, Lax/H9/k;->u(D)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 38
    .line 39
    iget-object p1, p1, Lax/I9/c;->n:Lax/H9/k;

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 45
    .line 46
    iget-object p1, p1, Lax/I9/c;->o:Lax/H9/k;

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lax/X0/g;->s:Lax/H9/k;

    .line 52
    .line 53
    const-wide v0, 0x4072c00000000000L    # 300.0

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lax/X0/g;->t:Lax/H9/k;

    .line 62
    .line 63
    const-wide v0, 0x407f400000000000L    # 500.0

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lax/X0/g;->o:Lax/I9/g;

    .line 72
    .line 73
    iget-object p1, p1, Lax/I9/f;->y:Lax/H9/k;

    .line 74
    .line 75
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Lax/H9/k;->u(D)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    :goto_4f
    return-void
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

.method public e(Lax/Qa/c;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/X0/g;->x:Lax/X0/i$c;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_3c

    .line 6
    :cond_5
    iget-object v0, p0, Lax/X0/g;->p:Lax/I9/c;

    .line 7
    .line 8
    iget-object v0, v0, Lax/I9/t;->h:Lax/H9/j;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lax/H9/j;->J(Lax/Qa/c;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/X0/g;->q:Lax/I9/c;

    .line 14
    .line 15
    iget-object v0, v0, Lax/I9/t;->h:Lax/H9/j;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lax/H9/j;->J(Lax/Qa/c;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/X0/g;->x:Lax/X0/i$c;

    .line 21
    .line 22
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lax/X0/i$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/X0/i$c;->d()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3c

    .line 33
    .line 34
    invoke-virtual {v0}, Lax/X0/i$c;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3c

    .line 39
    .line 40
    iget v0, v0, Lax/X0/i$c;->b:I

    .line 41
    .line 42
    add-int/lit8 v1, v0, 0x1

    .line 43
    .line 44
    iget v2, p0, Lax/X0/g;->v:I

    .line 45
    .line 46
    if-ge v1, v2, :cond_3c

    .line 47
    .line 48
    iget v1, p0, Lax/X0/g;->u:I

    .line 49
    .line 50
    add-int/2addr v1, v0

    .line 51
    sub-int/2addr v2, v1

    .line 52
    iget-object v0, p0, Lax/X0/g;->m:Lax/I9/z;

    .line 53
    .line 54
    iget-object v0, v0, Lax/I9/m;->h:Lax/H9/i;

    .line 55
    .line 56
    iget-object v3, p0, Lax/X0/g;->j:Lax/B9/d;

    .line 57
    .line 58
    invoke-virtual {v0, v3, v1, v2, p1}, Lax/H9/i;->y(Lax/B9/b;IILax/Qa/c;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    :goto_3c
    return-void
.end method
