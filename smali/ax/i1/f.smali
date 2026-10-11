.class public final Lax/i1/f;
.super Lax/i1/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/f$b;,
        Lax/i1/f$d;,
        Lax/i1/f$c;
    }
.end annotation


# instance fields
.field private final m:J

.field private final n:J

.field private final o:Z

.field private final p:Z

.field private final q:Z

.field private final r:Z

.field private final s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/i1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Lax/P0/N$c;

.field private u:Lax/i1/f$c;

.field private v:Lax/i1/f$d;

.field private w:J

.field private x:J


# direct methods
.method private constructor <init>(Lax/i1/f$b;)V
    .registers 4

    .line 2
    invoke-static {p1}, Lax/i1/f$b;->a(Lax/i1/f$b;)Lax/i1/F;

    move-result-object v0

    invoke-direct {p0, v0}, Lax/i1/s0;-><init>(Lax/i1/F;)V

    .line 3
    invoke-static {p1}, Lax/i1/f$b;->b(Lax/i1/f$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lax/i1/f;->m:J

    .line 4
    invoke-static {p1}, Lax/i1/f$b;->c(Lax/i1/f$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lax/i1/f;->n:J

    .line 5
    invoke-static {p1}, Lax/i1/f$b;->d(Lax/i1/f$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/i1/f;->o:Z

    .line 6
    invoke-static {p1}, Lax/i1/f$b;->e(Lax/i1/f$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/i1/f;->p:Z

    .line 7
    invoke-static {p1}, Lax/i1/f$b;->f(Lax/i1/f$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/i1/f;->q:Z

    .line 8
    invoke-static {p1}, Lax/i1/f$b;->g(Lax/i1/f$b;)Z

    move-result p1

    iput-boolean p1, p0, Lax/i1/f;->r:Z

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Lax/P0/N$c;

    invoke-direct {p1}, Lax/P0/N$c;-><init>()V

    iput-object p1, p0, Lax/i1/f;->t:Lax/P0/N$c;

    return-void
.end method

.method synthetic constructor <init>(Lax/i1/f$b;Lax/i1/f$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/i1/f;-><init>(Lax/i1/f$b;)V

    return-void
.end method

.method private T(Lax/P0/N;)V
    .registers 16

    .line 1
    iget-object v0, p0, Lax/i1/f;->t:Lax/P0/N$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v3, p1

    .line 5
    invoke-virtual {p1, v1, v0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/i1/f;->t:Lax/P0/N$c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/P0/N$c;->e()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    iget-object v0, p0, Lax/i1/f;->u:Lax/i1/f$c;

    .line 15
    .line 16
    const-wide/high16 v6, -0x8000000000000000L

    .line 17
    .line 18
    if-eqz v0, :cond_2f

    .line 19
    .line 20
    iget-object v0, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2f

    .line 27
    .line 28
    iget-boolean v0, p0, Lax/i1/f;->p:Z

    .line 29
    .line 30
    if-eqz v0, :cond_20

    .line 31
    .line 32
    goto :goto_2f

    .line 33
    :cond_20
    iget-wide v8, p0, Lax/i1/f;->w:J

    .line 34
    .line 35
    sub-long/2addr v8, v4

    .line 36
    iget-wide v10, p0, Lax/i1/f;->n:J

    .line 37
    .line 38
    cmp-long v0, v10, v6

    .line 39
    .line 40
    if-nez v0, :cond_2a

    .line 41
    .line 42
    goto :goto_2d

    .line 43
    :cond_2a
    iget-wide v6, p0, Lax/i1/f;->x:J

    .line 44
    .line 45
    sub-long/2addr v6, v4

    .line 46
    :goto_2d
    move-wide v4, v8

    .line 47
    goto :goto_6b

    .line 48
    :cond_2f
    :goto_2f
    iget-wide v8, p0, Lax/i1/f;->m:J

    .line 49
    .line 50
    iget-wide v10, p0, Lax/i1/f;->n:J

    .line 51
    .line 52
    iget-boolean v0, p0, Lax/i1/f;->q:Z

    .line 53
    .line 54
    if-eqz v0, :cond_3f

    .line 55
    .line 56
    iget-object v0, p0, Lax/i1/f;->t:Lax/P0/N$c;

    .line 57
    .line 58
    invoke-virtual {v0}, Lax/P0/N$c;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v12

    .line 62
    add-long/2addr v8, v12

    .line 63
    add-long/2addr v10, v12

    .line 64
    :cond_3f
    add-long v12, v4, v8

    .line 65
    .line 66
    iput-wide v12, p0, Lax/i1/f;->w:J

    .line 67
    .line 68
    iget-wide v12, p0, Lax/i1/f;->n:J

    .line 69
    .line 70
    cmp-long v0, v12, v6

    .line 71
    .line 72
    if-nez v0, :cond_4a

    .line 73
    .line 74
    goto :goto_4c

    .line 75
    :cond_4a
    add-long v6, v4, v10

    .line 76
    .line 77
    :goto_4c
    iput-wide v6, p0, Lax/i1/f;->x:J

    .line 78
    .line 79
    iget-object v0, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v2, 0x0

    .line 86
    :goto_55
    if-ge v2, v0, :cond_69

    .line 87
    .line 88
    iget-object v4, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Lax/i1/e;

    .line 95
    .line 96
    iget-wide v5, p0, Lax/i1/f;->w:J

    .line 97
    .line 98
    iget-wide v12, p0, Lax/i1/f;->x:J

    .line 99
    .line 100
    invoke-virtual {v4, v5, v6, v12, v13}, Lax/i1/e;->x(JJ)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_55

    .line 106
    :cond_69
    move-wide v6, v10

    .line 107
    goto :goto_2d

    .line 108
    :goto_6b
    :try_start_6b
    new-instance v2, Lax/i1/f$c;

    .line 109
    .line 110
    iget-boolean v8, p0, Lax/i1/f;->r:Z

    .line 111
    .line 112
    invoke-direct/range {v2 .. v8}, Lax/i1/f$c;-><init>(Lax/P0/N;JJZ)V

    .line 113
    .line 114
    .line 115
    iput-object v2, p0, Lax/i1/f;->u:Lax/i1/f$c;
    :try_end_74
    .catch Lax/i1/f$d; {:try_start_6b .. :try_end_74} :catch_78

    .line 116
    .line 117
    invoke-virtual {p0, v2}, Lax/i1/a;->B(Lax/P0/N;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catch_78
    move-exception v0

    .line 122
    iput-object v0, p0, Lax/i1/f;->v:Lax/i1/f$d;

    .line 123
    .line 124
    :goto_7b
    iget-object v0, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ge v1, v0, :cond_93

    .line 131
    .line 132
    iget-object v0, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lax/i1/e;

    .line 139
    .line 140
    iget-object v2, p0, Lax/i1/f;->v:Lax/i1/f$d;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lax/i1/e;->u(Lax/i1/f$d;)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v1, v1, 0x1

    .line 146
    .line 147
    goto :goto_7b

    .line 148
    :cond_93
    return-void
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
.end method


# virtual methods
.method protected C()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/i1/h;->C()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/i1/f;->v:Lax/i1/f$d;

    .line 6
    .line 7
    iput-object v0, p0, Lax/i1/f;->u:Lax/i1/f$c;

    .line 8
    .line 9
    return-void
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

.method protected P(Lax/P0/N;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/f;->v:Lax/i1/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-direct {p0, p1}, Lax/i1/f;->T(Lax/P0/N;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public e(Lax/i1/C;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/i1/s0;->k:Lax/i1/F;

    .line 11
    .line 12
    check-cast p1, Lax/i1/e;

    .line 13
    .line 14
    iget-object p1, p1, Lax/i1/e;->q:Lax/i1/C;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lax/i1/F;->e(Lax/i1/C;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2b

    .line 26
    .line 27
    iget-boolean p1, p0, Lax/i1/f;->p:Z

    .line 28
    .line 29
    if-nez p1, :cond_2b

    .line 30
    .line 31
    iget-object p1, p0, Lax/i1/f;->u:Lax/i1/f$c;

    .line 32
    .line 33
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lax/i1/f$c;

    .line 38
    .line 39
    iget-object p1, p1, Lax/i1/w;->e:Lax/P0/N;

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lax/i1/f;->T(Lax/P0/N;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    return-void
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

.method public i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;
    .registers 12

    .line 1
    new-instance v0, Lax/i1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i1/s0;->k:Lax/i1/F;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2, p3, p4}, Lax/i1/F;->i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, p0, Lax/i1/f;->o:Z

    .line 10
    .line 11
    iget-wide v3, p0, Lax/i1/f;->w:J

    .line 12
    .line 13
    iget-wide v5, p0, Lax/i1/f;->x:J

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lax/i1/e;-><init>(Lax/i1/C;ZJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lax/i1/f;->s:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
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

.method public k()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i1/f;->v:Lax/i1/f$d;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    invoke-super {p0}, Lax/i1/h;->k()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    throw v0
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
