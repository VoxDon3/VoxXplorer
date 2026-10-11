.class public Lax/o1/k;
.super Lax/f1/L;
.source "SourceFile"

# interfaces
.implements Lax/o1/A$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o1/k$d;,
        Lax/o1/k$c;,
        Lax/o1/k$f;,
        Lax/o1/k$e;
    }
.end annotation


# static fields
.field private static final D2:[I

.field private static E2:Z

.field private static F2:Z


# instance fields
.field private A2:J

.field private B2:Z

.field private C2:I

.field private final K1:Landroid/content/Context;

.field private final L1:Z

.field private final M1:Lax/o1/P$a;

.field private final N1:I

.field private final O1:Z

.field private final P1:Lax/o1/A;

.field private final Q1:Lax/o1/A$a;

.field private final R1:Lax/o1/a;

.field private final S1:J

.field private final T1:Lax/o1/B;

.field private final U1:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final V1:Z

.field private W1:Lax/o1/k$e;

.field private X1:Z

.field private Y1:Z

.field private Z1:Lax/o1/S;

.field private a2:Z

.field private b2:I

.field private c2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d2:Landroid/view/Surface;

.field private e2:Lax/o1/o;

.field private f2:Lax/S0/I;

.field private g2:Z

.field private h2:I

.field private i2:I

.field private j2:J

.field private k2:I

.field private l2:I

.field private m2:I

.field private n2:Lax/Y0/Y;

.field private o2:Z

.field private p2:J

.field private q2:I

.field private r2:J

.field private s2:Lax/P0/a0;

.field private t2:Lax/P0/a0;

.field private u2:I

.field private v2:Z

.field private w2:I

.field x2:Lax/o1/k$f;

.field private y2:Lax/o1/z;

.field private z2:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/o1/k;->D2:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
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

.method protected constructor <init>(Lax/o1/k$d;)V
    .registers 9

    .line 1
    invoke-static {p1}, Lax/o1/k$d;->a(Lax/o1/k$d;)Lax/f1/x$b;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-static {p1}, Lax/o1/k$d;->b(Lax/o1/k$d;)Lax/f1/Q;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-static {p1}, Lax/o1/k$d;->f(Lax/o1/k$d;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-static {p1}, Lax/o1/k$d;->g(Lax/o1/k$d;)F

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 v1, 0x2

    .line 18
    move-object v0, p0

    .line 19
    invoke-direct/range {v0 .. v5}, Lax/f1/L;-><init>(ILax/f1/x$b;Lax/f1/Q;ZF)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lax/o1/k$d;->h(Lax/o1/k$d;)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, v0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {p1}, Lax/o1/k$d;->i(Lax/o1/k$d;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, v0, Lax/o1/k;->N1:I

    .line 37
    .line 38
    invoke-static {p1}, Lax/o1/k$d;->j(Lax/o1/k$d;)Lax/o1/S;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 43
    .line 44
    new-instance v2, Lax/o1/P$a;

    .line 45
    .line 46
    invoke-static {p1}, Lax/o1/k$d;->k(Lax/o1/k$d;)Landroid/os/Handler;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {p1}, Lax/o1/k$d;->l(Lax/o1/k$d;)Lax/o1/P;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v2, v3, v4}, Lax/o1/P$a;-><init>(Landroid/os/Handler;Lax/o1/P;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 58
    .line 59
    iget-object v2, v0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    const/4 v4, 0x0

    .line 63
    if-nez v2, :cond_42

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    goto :goto_43

    .line 67
    :cond_42
    const/4 v2, 0x0

    .line 68
    :goto_43
    iput-boolean v2, v0, Lax/o1/k;->L1:Z

    .line 69
    .line 70
    new-instance v2, Lax/o1/A;

    .line 71
    .line 72
    invoke-static {p1}, Lax/o1/k$d;->m(Lax/o1/k$d;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    invoke-direct {v2, v1, p0, v5, v6}, Lax/o1/A;-><init>(Landroid/content/Context;Lax/o1/A$b;J)V

    .line 77
    .line 78
    .line 79
    iput-object v2, v0, Lax/o1/k;->P1:Lax/o1/A;

    .line 80
    .line 81
    new-instance v1, Lax/o1/A$a;

    .line 82
    .line 83
    invoke-direct {v1}, Lax/o1/A$a;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, v0, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 87
    .line 88
    invoke-static {}, Lax/o1/k;->j2()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iput-boolean v1, v0, Lax/o1/k;->O1:Z

    .line 93
    .line 94
    sget-object v1, Lax/S0/I;->c:Lax/S0/I;

    .line 95
    .line 96
    iput-object v1, v0, Lax/o1/k;->f2:Lax/S0/I;

    .line 97
    .line 98
    iput v3, v0, Lax/o1/k;->h2:I

    .line 99
    .line 100
    iput v4, v0, Lax/o1/k;->i2:I

    .line 101
    .line 102
    sget-object v1, Lax/P0/a0;->e:Lax/P0/a0;

    .line 103
    .line 104
    iput-object v1, v0, Lax/o1/k;->s2:Lax/P0/a0;

    .line 105
    .line 106
    iput v4, v0, Lax/o1/k;->w2:I

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    iput-object v1, v0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 110
    .line 111
    const/16 v2, -0x3e8

    .line 112
    .line 113
    iput v2, v0, Lax/o1/k;->u2:I

    .line 114
    .line 115
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    iput-wide v2, v0, Lax/o1/k;->z2:J

    .line 121
    .line 122
    iput-wide v2, v0, Lax/o1/k;->A2:J

    .line 123
    .line 124
    invoke-static {p1}, Lax/o1/k$d;->c(Lax/o1/k$d;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_87

    .line 129
    .line 130
    new-instance v4, Lax/o1/a;

    .line 131
    .line 132
    invoke-direct {v4}, Lax/o1/a;-><init>()V

    .line 133
    .line 134
    .line 135
    goto :goto_88

    .line 136
    :cond_87
    move-object v4, v1

    .line 137
    :goto_88
    iput-object v4, v0, Lax/o1/k;->R1:Lax/o1/a;

    .line 138
    .line 139
    new-instance v4, Ljava/util/PriorityQueue;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/util/PriorityQueue;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v4, v0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 145
    .line 146
    invoke-static {p1}, Lax/o1/k$d;->d(Lax/o1/k$d;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    cmp-long v6, v4, v2

    .line 151
    .line 152
    if-eqz v6, :cond_aa

    .line 153
    .line 154
    invoke-static {p1}, Lax/o1/k$d;->d(Lax/o1/k$d;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    neg-long v2, v2

    .line 159
    iput-wide v2, v0, Lax/o1/k;->S1:J

    .line 160
    .line 161
    new-instance v2, Lax/o1/B;

    .line 162
    .line 163
    const/high16 v3, 0x3f800000    # 1.0f

    .line 164
    .line 165
    invoke-direct {v2, v3}, Lax/o1/B;-><init>(F)V

    .line 166
    .line 167
    .line 168
    iput-object v2, v0, Lax/o1/k;->T1:Lax/o1/B;

    .line 169
    .line 170
    goto :goto_ae

    .line 171
    :cond_aa
    iput-wide v2, v0, Lax/o1/k;->S1:J

    .line 172
    .line 173
    iput-object v1, v0, Lax/o1/k;->T1:Lax/o1/B;

    .line 174
    .line 175
    :goto_ae
    invoke-static {p1}, Lax/o1/k$d;->e(Lax/o1/k$d;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iput-boolean p1, v0, Lax/o1/k;->V1:Z

    .line 180
    .line 181
    iput-object v1, v0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 182
    .line 183
    return-void
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

.method private A2()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/A;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 10
    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    invoke-direct {p0}, Lax/o1/k;->I2()V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private B2()V
    .registers 5

    .line 1
    iget v0, p0, Lax/o1/k;->q2:I

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 6
    .line 7
    iget-wide v2, p0, Lax/o1/k;->p2:J

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3, v0}, Lax/o1/P$a;->r(JI)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lax/o1/k;->p2:J

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lax/o1/k;->q2:I

    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
.end method

.method private C2(Lax/P0/a0;)V
    .registers 3

    .line 1
    sget-object v0, Lax/P0/a0;->e:Lax/P0/a0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/P0/a0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_17

    .line 8
    .line 9
    iget-object v0, p0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lax/P0/a0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_17

    .line 16
    .line 17
    iput-object p1, p0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 18
    .line 19
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lax/o1/P$a;->t(Lax/P0/a0;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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

.method private D2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget-boolean v1, p0, Lax/o1/k;->g2:Z

    .line 6
    .line 7
    if-eqz v1, :cond_d

    .line 8
    .line 9
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lax/o1/P$a;->q(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private E2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lax/o1/P$a;->t(Lax/P0/a0;)V

    .line 8
    .line 9
    .line 10
    :cond_9
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

.method private F2(Landroid/media/MediaFormat;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    iget-object v0, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/d0;->M0(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    const-string v0, "allow-frame-drop"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method private G2()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2b

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-ge v0, v1, :cond_b

    .line 10
    .line 11
    goto :goto_2b

    .line 12
    :cond_b
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_12

    .line 17
    .line 18
    goto :goto_2b

    .line 19
    :cond_12
    new-instance v2, Lax/o1/k$f;

    .line 20
    .line 21
    invoke-direct {v2, p0, v1}, Lax/o1/k$f;-><init>(Lax/o1/k;Lax/f1/x;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lax/o1/k;->x2:Lax/o1/k$f;

    .line 25
    .line 26
    const/16 v2, 0x21

    .line 27
    .line 28
    if-lt v0, v2, :cond_2b

    .line 29
    .line 30
    new-instance v0, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "tunnel-peek"

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v0}, Lax/f1/x;->a(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    :goto_2b
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private H2(JJLax/P0/v;)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/o1/k;->y2:Lax/o1/z;

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/f1/L;->K0()Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    move-wide v1, p1

    .line 10
    move-wide v3, p3

    .line 11
    move-object v5, p5

    .line 12
    invoke-interface/range {v0 .. v6}, Lax/o1/z;->g(JJLax/P0/v;Landroid/media/MediaFormat;)V

    .line 13
    .line 14
    .line 15
    :cond_e
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

.method private I2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/o1/P$a;->q(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/o1/k;->g2:Z

    .line 10
    .line 11
    return-void
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

.method private K2()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->G1()V

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

.method private L2(Lax/f1/x;IJLax/P0/v;)V
    .registers 16

    .line 1
    iget-object v0, p0, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/A$a;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    iget-object v0, p0, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/o1/A$a;->f()J

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    invoke-virtual {p0}, Lax/o1/k;->X2()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1d

    .line 18
    .line 19
    iget-wide v0, p0, Lax/o1/k;->r2:J

    .line 20
    .line 21
    cmp-long v2, v4, v0

    .line 22
    .line 23
    if-nez v2, :cond_1d

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2, p3, p4}, Lax/o1/k;->a3(Lax/f1/x;IJ)V

    .line 26
    .line 27
    .line 28
    move-object v1, p0

    .line 29
    goto :goto_2b

    .line 30
    :cond_1d
    move-object v1, p0

    .line 31
    move-wide v2, p3

    .line 32
    move-object v6, p5

    .line 33
    invoke-direct/range {v1 .. v6}, Lax/o1/k;->H2(JJLax/P0/v;)V

    .line 34
    .line 35
    .line 36
    move-wide v6, v4

    .line 37
    move-wide v4, v2

    .line 38
    move-object v2, p1

    .line 39
    move v3, p2

    .line 40
    invoke-virtual/range {v1 .. v7}, Lax/o1/k;->O2(Lax/f1/x;IJJ)V

    .line 41
    .line 42
    .line 43
    move-wide v4, v6

    .line 44
    :goto_2b
    invoke-virtual {p0, v8, v9}, Lax/o1/k;->g3(J)V

    .line 45
    .line 46
    .line 47
    iput-wide v4, v1, Lax/o1/k;->r2:J

    .line 48
    .line 49
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

.method private M2()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/o1/o;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 10
    .line 11
    :cond_a
    return-void
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

.method private N2(Lax/f1/x;IJJ)V
    .registers 7

    .line 1
    invoke-virtual/range {p0 .. p6}, Lax/o1/k;->O2(Lax/f1/x;IJJ)V

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

.method private static P2(Lax/f1/x;[B)V
    .registers 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "hdr10-plus-info"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lax/f1/x;->a(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method private Q2(Ljava/lang/Object;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroid/view/Surface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    check-cast p1, Landroid/view/Surface;

    .line 7
    .line 8
    goto :goto_9

    .line 9
    :cond_8
    move-object p1, v1

    .line 10
    :goto_9
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 11
    .line 12
    if-eq v0, p1, :cond_75

    .line 13
    .line 14
    iput-object p1, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 15
    .line 16
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 17
    .line 18
    if-nez v0, :cond_18

    .line 19
    .line 20
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lax/o1/A;->o(Landroid/view/Surface;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lax/o1/k;->g2:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_51

    .line 37
    .line 38
    iget-object v3, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 39
    .line 40
    if-nez v3, :cond_51

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lax/f1/D;

    .line 51
    .line 52
    invoke-direct {p0, v3}, Lax/o1/k;->v2(Lax/f1/D;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v6, 0x17

    .line 59
    .line 60
    if-lt v5, v6, :cond_4b

    .line 61
    .line 62
    if-eqz v4, :cond_4b

    .line 63
    .line 64
    iget-boolean v4, p0, Lax/o1/k;->X1:Z

    .line 65
    .line 66
    if-nez v4, :cond_4b

    .line 67
    .line 68
    invoke-direct {p0, v3}, Lax/o1/k;->u2(Lax/f1/D;)Landroid/view/Surface;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {p0, v2, v3}, Lax/o1/k;->R2(Lax/f1/x;Landroid/view/Surface;)V

    .line 73
    .line 74
    .line 75
    goto :goto_51

    .line 76
    :cond_4b
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lax/f1/L;->e1()V

    .line 80
    .line 81
    .line 82
    :cond_51
    :goto_51
    if-eqz p1, :cond_57

    .line 83
    .line 84
    invoke-direct {p0}, Lax/o1/k;->E2()V

    .line 85
    .line 86
    .line 87
    goto :goto_60

    .line 88
    :cond_57
    iput-object v1, p0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 89
    .line 90
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 91
    .line 92
    if-eqz p1, :cond_60

    .line 93
    .line 94
    invoke-interface {p1}, Lax/o1/S;->u()V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    const/4 p1, 0x2

    .line 98
    if-ne v0, p1, :cond_71

    .line 99
    .line 100
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    if-eqz p1, :cond_6c

    .line 104
    .line 105
    invoke-interface {p1, v0}, Lax/o1/S;->x(Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_71

    .line 109
    :cond_6c
    iget-object p1, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lax/o1/A;->e(Z)V

    .line 112
    .line 113
    .line 114
    :cond_71
    :goto_71
    invoke-direct {p0}, Lax/o1/k;->G2()V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_75
    if-eqz p1, :cond_7d

    .line 119
    .line 120
    invoke-direct {p0}, Lax/o1/k;->E2()V

    .line 121
    .line 122
    .line 123
    invoke-direct {p0}, Lax/o1/k;->D2()V

    .line 124
    .line 125
    .line 126
    :cond_7d
    return-void
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

.method private R2(Lax/f1/x;Landroid/view/Surface;)V
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_c

    .line 6
    .line 7
    if-eqz p2, :cond_c

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lax/o1/k;->S2(Lax/f1/x;Landroid/view/Surface;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    const/16 p2, 0x23

    .line 14
    .line 15
    if-lt v0, p2, :cond_14

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lax/o1/k;->i2(Lax/f1/x;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p1
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

.method static synthetic X1(Lax/o1/k;)Landroidx/media3/exoplayer/M0$a;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->S0()Landroidx/media3/exoplayer/M0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic Y1(Lax/o1/k;)Landroid/view/Surface;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

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

.method static synthetic Z1(Lax/o1/k;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/k;->I2()V

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
    .line 22
.end method

.method static synthetic a2(Lax/o1/k;Lax/f1/x;IJJ)V
    .registers 7

    .line 1
    invoke-direct/range {p0 .. p6}, Lax/o1/k;->N2(Lax/f1/x;IJJ)V

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
.end method

.method static synthetic b2(Lax/o1/k;)Lax/f1/x;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static b3(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;)I
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/P0/D;->s(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_e

    .line 9
    .line 10
    invoke-static {v1}, Lax/Y0/V;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_e
    iget-object v0, p2, Lax/P0/v;->s:Lax/P0/o;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_15

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_16

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    :goto_16
    invoke-static {p0, p1, p2, v0, v1}, Lax/o1/k;->q2(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v0, :cond_26

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_26

    .line 34
    .line 35
    invoke-static {p0, p1, p2, v1, v1}, Lax/o1/k;->q2(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :cond_26
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_31

    .line 44
    .line 45
    invoke-static {v2}, Lax/Y0/V;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_31
    invoke-static {p2}, Lax/f1/L;->S1(Lax/P0/v;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_3d

    .line 55
    .line 56
    const/4 p0, 0x2

    .line 57
    invoke-static {p0}, Lax/Y0/V;->a(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_3d
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lax/f1/D;

    .line 67
    .line 68
    invoke-virtual {v4, p2}, Lax/f1/D;->q(Lax/P0/v;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_63

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    :goto_4a
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-ge v6, v7, :cond_63

    .line 80
    .line 81
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lax/f1/D;

    .line 86
    .line 87
    invoke-virtual {v7, p2}, Lax/f1/D;->q(Lax/P0/v;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_60

    .line 92
    .line 93
    move-object v4, v7

    .line 94
    const/4 v3, 0x0

    .line 95
    const/4 v5, 0x1

    .line 96
    goto :goto_64

    .line 97
    :cond_60
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    goto :goto_4a

    .line 100
    :cond_63
    const/4 v3, 0x1

    .line 101
    :goto_64
    if-eqz v5, :cond_68

    .line 102
    .line 103
    const/4 v6, 0x4

    .line 104
    goto :goto_69

    .line 105
    :cond_68
    const/4 v6, 0x3

    .line 106
    :goto_69
    invoke-virtual {v4, p2}, Lax/f1/D;->t(Lax/P0/v;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_72

    .line 111
    .line 112
    const/16 v7, 0x10

    .line 113
    .line 114
    goto :goto_74

    .line 115
    :cond_72
    const/16 v7, 0x8

    .line 116
    .line 117
    :goto_74
    iget-boolean v4, v4, Lax/f1/D;->h:Z

    .line 118
    .line 119
    if-eqz v4, :cond_7b

    .line 120
    .line 121
    const/16 v4, 0x40

    .line 122
    .line 123
    goto :goto_7c

    .line 124
    :cond_7b
    const/4 v4, 0x0

    .line 125
    :goto_7c
    if-eqz v3, :cond_81

    .line 126
    .line 127
    const/16 v3, 0x80

    .line 128
    .line 129
    goto :goto_82

    .line 130
    :cond_81
    const/4 v3, 0x0

    .line 131
    :goto_82
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    const/16 v9, 0x1a

    .line 134
    .line 135
    if-lt v8, v9, :cond_9a

    .line 136
    .line 137
    const-string v8, "video/dolby-vision"

    .line 138
    .line 139
    iget-object v9, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_9a

    .line 146
    .line 147
    invoke-static {p0}, Lax/o1/k$c;->a(Landroid/content/Context;)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-nez v8, :cond_9a

    .line 152
    .line 153
    const/16 v3, 0x100

    .line 154
    .line 155
    :cond_9a
    if-eqz v5, :cond_be

    .line 156
    .line 157
    invoke-static {p0, p1, p2, v0, v2}, Lax/o1/k;->q2(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_be

    .line 166
    .line 167
    invoke-static {p0, p2}, Lax/f1/a0;->o(Ljava/util/List;Lax/P0/v;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Lax/f1/D;

    .line 176
    .line 177
    invoke-virtual {p0, p2}, Lax/f1/D;->q(Lax/P0/v;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_be

    .line 182
    .line 183
    invoke-virtual {p0, p2}, Lax/f1/D;->t(Lax/P0/v;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_be

    .line 188
    .line 189
    const/16 v1, 0x20

    .line 190
    .line 191
    :cond_be
    invoke-static {v6, v7, v1, v4, v3}, Lax/Y0/V;->d(IIIII)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    return p0
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

.method static synthetic c2(Lax/o1/k;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o1/k;->K2()V

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
    .line 22
.end method

.method private c3()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_22

    .line 8
    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x23

    .line 11
    .line 12
    if-lt v1, v2, :cond_22

    .line 13
    .line 14
    new-instance v1, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lax/o1/k;->u2:I

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "importance"

    .line 28
    .line 29
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lax/f1/x;->a(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    :goto_22
    return-void
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
.end method

.method static synthetic d2(Lax/o1/k;Landroidx/media3/exoplayer/s;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/f1/L;->H1(Landroidx/media3/exoplayer/s;)V

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

.method private e3(J)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    iget-object v2, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Ljava/lang/Long;

    .line 10
    .line 11
    if-eqz v2, :cond_1c

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v4, v2, p1

    .line 18
    .line 19
    if-gez v4, :cond_1c

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iget-object v2, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1c
    invoke-virtual {p0, v1, v0}, Lax/o1/k;->d3(II)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method private f3(Lax/i1/F$b;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->S()Lax/P0/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_12

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v0, p0, Lax/o1/k;->A2:J

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lax/i1/F$b;

    .line 24
    .line 25
    iget-object p1, p1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v1, Lax/P0/N$b;

    .line 28
    .line 29
    invoke-direct {v1}, Lax/P0/N$b;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lax/P0/N$b;->k()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, Lax/o1/k;->A2:J

    .line 41
    .line 42
    return-void
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

.method private g2()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    new-instance v1, Lax/o1/k$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lax/o1/k$a;-><init>(Lax/o1/k;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lax/v7/f;->a()Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v0, v1, v2}, Lax/o1/S;->m(Lax/o1/S$a;Ljava/util/concurrent/Executor;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/o1/k;->y2:Lax/o1/z;

    .line 16
    .line 17
    if-eqz v0, :cond_17

    .line 18
    .line 19
    iget-object v1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Lax/o1/S;->p(Lax/o1/z;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 25
    .line 26
    if-eqz v0, :cond_2e

    .line 27
    .line 28
    iget-object v0, p0, Lax/o1/k;->f2:Lax/S0/I;

    .line 29
    .line 30
    sget-object v1, Lax/S0/I;->c:Lax/S0/I;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lax/S0/I;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2e

    .line 37
    .line 38
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 39
    .line 40
    iget-object v1, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 41
    .line 42
    iget-object v2, p0, Lax/o1/k;->f2:Lax/S0/I;

    .line 43
    .line 44
    invoke-interface {v0, v1, v2}, Lax/o1/S;->t(Landroid/view/Surface;Lax/S0/I;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 48
    .line 49
    iget v1, p0, Lax/o1/k;->i2:I

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lax/o1/S;->s(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 55
    .line 56
    invoke-virtual {p0}, Lax/f1/L;->R0()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-interface {v0, v1}, Lax/o1/S;->g(F)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lax/o1/k;->c2:Ljava/util/List;

    .line 64
    .line 65
    if-eqz v0, :cond_47

    .line 66
    .line 67
    iget-object v1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 68
    .line 69
    invoke-interface {v1, v0}, Lax/o1/S;->w(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    return-void
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

.method private static j2()Z
    .registers 2

    .line 1
    const-string v0, "NVIDIA"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method private static l2()Z
    .registers 16

    const/16 v0, 0x1a

    const/16 v1, 0x8

    const/16 v2, 0x1b

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, -0x1

    const/4 v10, 0x0

    .line 1
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1c

    const/4 v13, 0x1

    if-gt v11, v12, :cond_80

    .line 2
    sget-object v14, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_8b0

    :goto_21
    const/4 v14, -0x1

    goto/16 :goto_7b

    :sswitch_24
    const-string v15, "machuca"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2d

    goto :goto_21

    :cond_2d
    const/4 v14, 0x7

    goto :goto_7b

    :sswitch_2f
    const-string v15, "once"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_38

    goto :goto_21

    :cond_38
    const/4 v14, 0x6

    goto :goto_7b

    :sswitch_3a
    const-string v15, "magnolia"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_43

    goto :goto_21

    :cond_43
    const/4 v14, 0x5

    goto :goto_7b

    :sswitch_45
    const-string v15, "aquaman"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4e

    goto :goto_21

    :cond_4e
    const/4 v14, 0x4

    goto :goto_7b

    :sswitch_50
    const-string v15, "oneday"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_59

    goto :goto_21

    :cond_59
    const/4 v14, 0x3

    goto :goto_7b

    :sswitch_5b
    const-string v15, "dangalUHD"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_64

    goto :goto_21

    :cond_64
    const/4 v14, 0x2

    goto :goto_7b

    :sswitch_66
    const-string v15, "dangalFHD"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6f

    goto :goto_21

    :cond_6f
    const/4 v14, 0x1

    goto :goto_7b

    :sswitch_71
    const-string v15, "dangal"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7a

    goto :goto_21

    :cond_7a
    const/4 v14, 0x0

    :goto_7b
    packed-switch v14, :pswitch_data_8d2

    goto :goto_80

    :pswitch_7f
    return v13

    :cond_80
    :goto_80
    if-gt v11, v2, :cond_8d

    .line 3
    const-string v14, "HWEML"

    sget-object v15, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8d

    return v13

    .line 4
    :cond_8d
    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_8e6

    :goto_99
    const/4 v15, -0x1

    goto/16 :goto_100

    :sswitch_9c
    const-string v15, "AFTEUFF014"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_a5

    goto :goto_99

    :cond_a5
    const/16 v15, 0x8

    goto/16 :goto_100

    :sswitch_a9
    const-string v15, "AFTSO001"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b2

    goto :goto_99

    :cond_b2
    const/4 v15, 0x7

    goto :goto_100

    :sswitch_b4
    const-string v15, "AFTEU014"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_bd

    goto :goto_99

    :cond_bd
    const/4 v15, 0x6

    goto :goto_100

    :sswitch_bf
    const-string v15, "AFTEU011"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_c8

    goto :goto_99

    :cond_c8
    const/4 v15, 0x5

    goto :goto_100

    :sswitch_ca
    const-string v15, "AFTR"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_d3

    goto :goto_99

    :cond_d3
    const/4 v15, 0x4

    goto :goto_100

    :sswitch_d5
    const-string v15, "AFTN"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_de

    goto :goto_99

    :cond_de
    const/4 v15, 0x3

    goto :goto_100

    :sswitch_e0
    const-string v15, "AFTA"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_e9

    goto :goto_99

    :cond_e9
    const/4 v15, 0x2

    goto :goto_100

    :sswitch_eb
    const-string v15, "AFTKMST12"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_f4

    goto :goto_99

    :cond_f4
    const/4 v15, 0x1

    goto :goto_100

    :sswitch_f6
    const-string v15, "AFTJMST12"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_ff

    goto :goto_99

    :cond_ff
    const/4 v15, 0x0

    :goto_100
    packed-switch v15, :pswitch_data_90c

    if-gt v11, v0, :cond_8ae

    .line 5
    sget-object v11, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_922

    :goto_111
    const/4 v0, -0x1

    goto/16 :goto_89e

    :sswitch_114
    const-string v0, "HWWAS-H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11d

    goto :goto_111

    :cond_11d
    const/16 v0, 0x8b

    goto/16 :goto_89e

    :sswitch_121
    const-string v0, "HWVNS-H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12a

    goto :goto_111

    :cond_12a
    const/16 v0, 0x8a

    goto/16 :goto_89e

    :sswitch_12e
    const-string v0, "ELUGA_Prim"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_137

    goto :goto_111

    :cond_137
    const/16 v0, 0x89

    goto/16 :goto_89e

    :sswitch_13b
    const-string v0, "ELUGA_Note"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_144

    goto :goto_111

    :cond_144
    const/16 v0, 0x88

    goto/16 :goto_89e

    :sswitch_148
    const-string v0, "ASUS_X00AD_2"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_151

    goto :goto_111

    :cond_151
    const/16 v0, 0x87

    goto/16 :goto_89e

    :sswitch_155
    const-string v0, "HWCAM-H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15e

    goto :goto_111

    :cond_15e
    const/16 v0, 0x86

    goto/16 :goto_89e

    :sswitch_162
    const-string v0, "HWBLN-H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16b

    goto :goto_111

    :cond_16b
    const/16 v0, 0x85

    goto/16 :goto_89e

    :sswitch_16f
    const-string v0, "DM-01K"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_178

    goto :goto_111

    :cond_178
    const/16 v0, 0x84

    goto/16 :goto_89e

    :sswitch_17c
    const-string v0, "BRAVIA_ATV3_4K"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_185

    goto :goto_111

    :cond_185
    const/16 v0, 0x83

    goto/16 :goto_89e

    :sswitch_189
    const-string v0, "Infinix-X572"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_193

    goto/16 :goto_111

    :cond_193
    const/16 v0, 0x82

    goto/16 :goto_89e

    :sswitch_197
    const-string v0, "PB2-670M"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a1

    goto/16 :goto_111

    :cond_1a1
    const/16 v0, 0x81

    goto/16 :goto_89e

    :sswitch_1a5
    const-string v0, "santoni"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1af

    goto/16 :goto_111

    :cond_1af
    const/16 v0, 0x80

    goto/16 :goto_89e

    :sswitch_1b3
    const-string v0, "iball8735_9806"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1bd

    goto/16 :goto_111

    :cond_1bd
    const/16 v0, 0x7f

    goto/16 :goto_89e

    :sswitch_1c1
    const-string v0, "CPH1715"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1cb

    goto/16 :goto_111

    :cond_1cb
    const/16 v0, 0x7e

    goto/16 :goto_89e

    :sswitch_1cf
    const-string v0, "CPH1609"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d9

    goto/16 :goto_111

    :cond_1d9
    const/16 v0, 0x7d

    goto/16 :goto_89e

    :sswitch_1dd
    const-string v0, "woods_f"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e7

    goto/16 :goto_111

    :cond_1e7
    const/16 v0, 0x7c

    goto/16 :goto_89e

    :sswitch_1eb
    const-string v0, "htc_e56ml_dtul"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f5

    goto/16 :goto_111

    :cond_1f5
    const/16 v0, 0x7b

    goto/16 :goto_89e

    :sswitch_1f9
    const-string v0, "EverStar_S"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_203

    goto/16 :goto_111

    :cond_203
    const/16 v0, 0x7a

    goto/16 :goto_89e

    :sswitch_207
    const-string v0, "hwALE-H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_211

    goto/16 :goto_111

    :cond_211
    const/16 v0, 0x79

    goto/16 :goto_89e

    :sswitch_215
    const-string v0, "itel_S41"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21f

    goto/16 :goto_111

    :cond_21f
    const/16 v0, 0x78

    goto/16 :goto_89e

    :sswitch_223
    const-string v0, "LS-5017"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22d

    goto/16 :goto_111

    :cond_22d
    const/16 v0, 0x77

    goto/16 :goto_89e

    :sswitch_231
    const-string v0, "panell_d"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23b

    goto/16 :goto_111

    :cond_23b
    const/16 v0, 0x76

    goto/16 :goto_89e

    :sswitch_23f
    const-string v0, "j2xlteins"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_249

    goto/16 :goto_111

    :cond_249
    const/16 v0, 0x75

    goto/16 :goto_89e

    :sswitch_24d
    const-string v0, "A7000plus"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_257

    goto/16 :goto_111

    :cond_257
    const/16 v0, 0x74

    goto/16 :goto_89e

    :sswitch_25b
    const-string v0, "manning"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_265

    goto/16 :goto_111

    :cond_265
    const/16 v0, 0x73

    goto/16 :goto_89e

    :sswitch_269
    const-string v0, "GIONEE_WBL7519"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_273

    goto/16 :goto_111

    :cond_273
    const/16 v0, 0x72

    goto/16 :goto_89e

    :sswitch_277
    const-string v0, "GIONEE_WBL7365"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_281

    goto/16 :goto_111

    :cond_281
    const/16 v0, 0x71

    goto/16 :goto_89e

    :sswitch_285
    const-string v0, "GIONEE_WBL5708"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28f

    goto/16 :goto_111

    :cond_28f
    const/16 v0, 0x70

    goto/16 :goto_89e

    :sswitch_293
    const-string v0, "QM16XE_U"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29d

    goto/16 :goto_111

    :cond_29d
    const/16 v0, 0x6f

    goto/16 :goto_89e

    :sswitch_2a1
    const-string v0, "Pixi5-10_4G"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2ab

    goto/16 :goto_111

    :cond_2ab
    const/16 v0, 0x6e

    goto/16 :goto_89e

    :sswitch_2af
    const-string v0, "TB3-850M"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b9

    goto/16 :goto_111

    :cond_2b9
    const/16 v0, 0x6d

    goto/16 :goto_89e

    :sswitch_2bd
    const-string v0, "TB3-850F"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c7

    goto/16 :goto_111

    :cond_2c7
    const/16 v0, 0x6c

    goto/16 :goto_89e

    :sswitch_2cb
    const-string v0, "TB3-730X"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d5

    goto/16 :goto_111

    :cond_2d5
    const/16 v0, 0x6b

    goto/16 :goto_89e

    :sswitch_2d9
    const-string v0, "TB3-730F"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e3

    goto/16 :goto_111

    :cond_2e3
    const/16 v0, 0x6a

    goto/16 :goto_89e

    :sswitch_2e7
    const-string v0, "A7020a48"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f1

    goto/16 :goto_111

    :cond_2f1
    const/16 v0, 0x69

    goto/16 :goto_89e

    :sswitch_2f5
    const-string v0, "A7010a48"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2ff

    goto/16 :goto_111

    :cond_2ff
    const/16 v0, 0x68

    goto/16 :goto_89e

    :sswitch_303
    const-string v0, "griffin"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30d

    goto/16 :goto_111

    :cond_30d
    const/16 v0, 0x67

    goto/16 :goto_89e

    :sswitch_311
    const-string v0, "marino_f"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31b

    goto/16 :goto_111

    :cond_31b
    const/16 v0, 0x66

    goto/16 :goto_89e

    :sswitch_31f
    const-string v0, "CPY83_I00"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_329

    goto/16 :goto_111

    :cond_329
    const/16 v0, 0x65

    goto/16 :goto_89e

    :sswitch_32d
    const-string v0, "A2016a40"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_337

    goto/16 :goto_111

    :cond_337
    const/16 v0, 0x64

    goto/16 :goto_89e

    :sswitch_33b
    const-string v0, "le_x6"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_345

    goto/16 :goto_111

    :cond_345
    const/16 v0, 0x63

    goto/16 :goto_89e

    :sswitch_349
    const-string v0, "l5460"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_353

    goto/16 :goto_111

    :cond_353
    const/16 v0, 0x62

    goto/16 :goto_89e

    :sswitch_357
    const-string v0, "i9031"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_361

    goto/16 :goto_111

    :cond_361
    const/16 v0, 0x61

    goto/16 :goto_89e

    :sswitch_365
    const-string v0, "X3_HK"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36f

    goto/16 :goto_111

    :cond_36f
    const/16 v0, 0x60

    goto/16 :goto_89e

    :sswitch_373
    const-string v0, "V23GB"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37d

    goto/16 :goto_111

    :cond_37d
    const/16 v0, 0x5f

    goto/16 :goto_89e

    :sswitch_381
    const-string v0, "Q4310"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38b

    goto/16 :goto_111

    :cond_38b
    const/16 v0, 0x5e

    goto/16 :goto_89e

    :sswitch_38f
    const-string v0, "Q4260"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_399

    goto/16 :goto_111

    :cond_399
    const/16 v0, 0x5d

    goto/16 :goto_89e

    :sswitch_39d
    const-string v0, "PRO7S"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a7

    goto/16 :goto_111

    :cond_3a7
    const/16 v0, 0x5c

    goto/16 :goto_89e

    :sswitch_3ab
    const-string v0, "F3311"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b5

    goto/16 :goto_111

    :cond_3b5
    const/16 v0, 0x5b

    goto/16 :goto_89e

    :sswitch_3b9
    const-string v0, "F3215"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c3

    goto/16 :goto_111

    :cond_3c3
    const/16 v0, 0x5a

    goto/16 :goto_89e

    :sswitch_3c7
    const-string v0, "F3213"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d1

    goto/16 :goto_111

    :cond_3d1
    const/16 v0, 0x59

    goto/16 :goto_89e

    :sswitch_3d5
    const-string v0, "F3211"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3df

    goto/16 :goto_111

    :cond_3df
    const/16 v0, 0x58

    goto/16 :goto_89e

    :sswitch_3e3
    const-string v0, "F3116"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3ed

    goto/16 :goto_111

    :cond_3ed
    const/16 v0, 0x57

    goto/16 :goto_89e

    :sswitch_3f1
    const-string v0, "F3113"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3fb

    goto/16 :goto_111

    :cond_3fb
    const/16 v0, 0x56

    goto/16 :goto_89e

    :sswitch_3ff
    const-string v0, "F3111"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_409

    goto/16 :goto_111

    :cond_409
    const/16 v0, 0x55

    goto/16 :goto_89e

    :sswitch_40d
    const-string v0, "E5643"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_417

    goto/16 :goto_111

    :cond_417
    const/16 v0, 0x54

    goto/16 :goto_89e

    :sswitch_41b
    const-string v0, "A1601"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_425

    goto/16 :goto_111

    :cond_425
    const/16 v0, 0x53

    goto/16 :goto_89e

    :sswitch_429
    const-string v0, "Aura_Note_2"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_433

    goto/16 :goto_111

    :cond_433
    const/16 v0, 0x52

    goto/16 :goto_89e

    :sswitch_437
    const-string v0, "602LV"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_441

    goto/16 :goto_111

    :cond_441
    const/16 v0, 0x51

    goto/16 :goto_89e

    :sswitch_445
    const-string v0, "601LV"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44f

    goto/16 :goto_111

    :cond_44f
    const/16 v0, 0x50

    goto/16 :goto_89e

    :sswitch_453
    const-string v0, "MEIZU_M5"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45d

    goto/16 :goto_111

    :cond_45d
    const/16 v0, 0x4f

    goto/16 :goto_89e

    :sswitch_461
    const-string v0, "p212"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46b

    goto/16 :goto_111

    :cond_46b
    const/16 v0, 0x4e

    goto/16 :goto_89e

    :sswitch_46f
    const-string v0, "mido"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_479

    goto/16 :goto_111

    :cond_479
    const/16 v0, 0x4d

    goto/16 :goto_89e

    :sswitch_47d
    const-string v0, "kate"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_487

    goto/16 :goto_111

    :cond_487
    const/16 v0, 0x4c

    goto/16 :goto_89e

    :sswitch_48b
    const-string v0, "fugu"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_495

    goto/16 :goto_111

    :cond_495
    const/16 v0, 0x4b

    goto/16 :goto_89e

    :sswitch_499
    const-string v0, "XE2X"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4a3

    goto/16 :goto_111

    :cond_4a3
    const/16 v0, 0x4a

    goto/16 :goto_89e

    :sswitch_4a7
    const-string v0, "Q427"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b1

    goto/16 :goto_111

    :cond_4b1
    const/16 v0, 0x49

    goto/16 :goto_89e

    :sswitch_4b5
    const-string v0, "Q350"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4bf

    goto/16 :goto_111

    :cond_4bf
    const/16 v0, 0x48

    goto/16 :goto_89e

    :sswitch_4c3
    const-string v0, "P681"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4cd

    goto/16 :goto_111

    :cond_4cd
    const/16 v0, 0x47

    goto/16 :goto_89e

    :sswitch_4d1
    const-string v0, "F04J"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4db

    goto/16 :goto_111

    :cond_4db
    const/16 v0, 0x46

    goto/16 :goto_89e

    :sswitch_4df
    const-string v0, "F04H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4e9

    goto/16 :goto_111

    :cond_4e9
    const/16 v0, 0x45

    goto/16 :goto_89e

    :sswitch_4ed
    const-string v0, "F03H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4f7

    goto/16 :goto_111

    :cond_4f7
    const/16 v0, 0x44

    goto/16 :goto_89e

    :sswitch_4fb
    const-string v0, "F02H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_505

    goto/16 :goto_111

    :cond_505
    const/16 v0, 0x43

    goto/16 :goto_89e

    :sswitch_509
    const-string v0, "F01J"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_513

    goto/16 :goto_111

    :cond_513
    const/16 v0, 0x42

    goto/16 :goto_89e

    :sswitch_517
    const-string v0, "F01H"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_521

    goto/16 :goto_111

    :cond_521
    const/16 v0, 0x41

    goto/16 :goto_89e

    :sswitch_525
    const-string v0, "1714"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_52f

    goto/16 :goto_111

    :cond_52f
    const/16 v0, 0x40

    goto/16 :goto_89e

    :sswitch_533
    const-string v0, "1713"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53d

    goto/16 :goto_111

    :cond_53d
    const/16 v0, 0x3f

    goto/16 :goto_89e

    :sswitch_541
    const-string v0, "1601"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_54b

    goto/16 :goto_111

    :cond_54b
    const/16 v0, 0x3e

    goto/16 :goto_89e

    :sswitch_54f
    const-string v0, "flo"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_559

    goto/16 :goto_111

    :cond_559
    const/16 v0, 0x3d

    goto/16 :goto_89e

    :sswitch_55d
    const-string v0, "deb"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_567

    goto/16 :goto_111

    :cond_567
    const/16 v0, 0x3c

    goto/16 :goto_89e

    :sswitch_56b
    const-string v0, "cv3"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_575

    goto/16 :goto_111

    :cond_575
    const/16 v0, 0x3b

    goto/16 :goto_89e

    :sswitch_579
    const-string v0, "cv1"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_583

    goto/16 :goto_111

    :cond_583
    const/16 v0, 0x3a

    goto/16 :goto_89e

    :sswitch_587
    const-string v0, "Z80"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_591

    goto/16 :goto_111

    :cond_591
    const/16 v0, 0x39

    goto/16 :goto_89e

    :sswitch_595
    const-string v0, "QX1"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_59f

    goto/16 :goto_111

    :cond_59f
    const/16 v0, 0x38

    goto/16 :goto_89e

    :sswitch_5a3
    const-string v0, "PLE"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5ad

    goto/16 :goto_111

    :cond_5ad
    const/16 v0, 0x37

    goto/16 :goto_89e

    :sswitch_5b1
    const-string v0, "P85"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5bb

    goto/16 :goto_111

    :cond_5bb
    const/16 v0, 0x36

    goto/16 :goto_89e

    :sswitch_5bf
    const-string v0, "MX6"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5c9

    goto/16 :goto_111

    :cond_5c9
    const/16 v0, 0x35

    goto/16 :goto_89e

    :sswitch_5cd
    const-string v0, "M5c"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5d7

    goto/16 :goto_111

    :cond_5d7
    const/16 v0, 0x34

    goto/16 :goto_89e

    :sswitch_5db
    const-string v0, "M04"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5e5

    goto/16 :goto_111

    :cond_5e5
    const/16 v0, 0x33

    goto/16 :goto_89e

    :sswitch_5e9
    const-string v0, "JGZ"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5f3

    goto/16 :goto_111

    :cond_5f3
    const/16 v0, 0x32

    goto/16 :goto_89e

    :sswitch_5f7
    const-string v0, "mh"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_601

    goto/16 :goto_111

    :cond_601
    const/16 v0, 0x31

    goto/16 :goto_89e

    :sswitch_605
    const-string v0, "b5"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_60f

    goto/16 :goto_111

    :cond_60f
    const/16 v0, 0x30

    goto/16 :goto_89e

    :sswitch_613
    const-string v0, "V5"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_61d

    goto/16 :goto_111

    :cond_61d
    const/16 v0, 0x2f

    goto/16 :goto_89e

    :sswitch_621
    const-string v0, "V1"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_62b

    goto/16 :goto_111

    :cond_62b
    const/16 v0, 0x2e

    goto/16 :goto_89e

    :sswitch_62f
    const-string v0, "Q5"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_639

    goto/16 :goto_111

    :cond_639
    const/16 v0, 0x2d

    goto/16 :goto_89e

    :sswitch_63d
    const-string v0, "C1"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_647

    goto/16 :goto_111

    :cond_647
    const/16 v0, 0x2c

    goto/16 :goto_89e

    :sswitch_64b
    const-string v0, "woods_fn"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_655

    goto/16 :goto_111

    :cond_655
    const/16 v0, 0x2b

    goto/16 :goto_89e

    :sswitch_659
    const-string v0, "ELUGA_A3_Pro"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_663

    goto/16 :goto_111

    :cond_663
    const/16 v0, 0x2a

    goto/16 :goto_89e

    :sswitch_667
    const-string v0, "Z12_PRO"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_671

    goto/16 :goto_111

    :cond_671
    const/16 v0, 0x29

    goto/16 :goto_89e

    :sswitch_675
    const-string v0, "BLACK-1X"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_67f

    goto/16 :goto_111

    :cond_67f
    const/16 v0, 0x28

    goto/16 :goto_89e

    :sswitch_683
    const-string v0, "taido_row"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68d

    goto/16 :goto_111

    :cond_68d
    const/16 v0, 0x27

    goto/16 :goto_89e

    :sswitch_691
    const-string v0, "Pixi4-7_3G"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_69b

    goto/16 :goto_111

    :cond_69b
    const/16 v0, 0x26

    goto/16 :goto_89e

    :sswitch_69f
    const-string v0, "GIONEE_GBL7360"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6a9

    goto/16 :goto_111

    :cond_6a9
    const/16 v0, 0x25

    goto/16 :goto_89e

    :sswitch_6ad
    const-string v0, "GiONEE_CBL7513"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6b7

    goto/16 :goto_111

    :cond_6b7
    const/16 v0, 0x24

    goto/16 :goto_89e

    :sswitch_6bb
    const-string v0, "OnePlus5T"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6c5

    goto/16 :goto_111

    :cond_6c5
    const/16 v0, 0x23

    goto/16 :goto_89e

    :sswitch_6c9
    const-string v0, "whyred"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6d3

    goto/16 :goto_111

    :cond_6d3
    const/16 v0, 0x22

    goto/16 :goto_89e

    :sswitch_6d7
    const-string v0, "watson"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6e1

    goto/16 :goto_111

    :cond_6e1
    const/16 v0, 0x21

    goto/16 :goto_89e

    :sswitch_6e5
    const-string v0, "SVP-DTV15"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6ef

    goto/16 :goto_111

    :cond_6ef
    const/16 v0, 0x20

    goto/16 :goto_89e

    :sswitch_6f3
    const-string v0, "A7000-a"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6fd

    goto/16 :goto_111

    :cond_6fd
    const/16 v0, 0x1f

    goto/16 :goto_89e

    :sswitch_701
    const-string v0, "nicklaus_f"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_70b

    goto/16 :goto_111

    :cond_70b
    const/16 v0, 0x1e

    goto/16 :goto_89e

    :sswitch_70f
    const-string v0, "tcl_eu"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_719

    goto/16 :goto_111

    :cond_719
    const/16 v0, 0x1d

    goto/16 :goto_89e

    :sswitch_71d
    const-string v0, "ELUGA_Ray_X"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_727

    goto/16 :goto_111

    :cond_727
    const/16 v0, 0x1c

    goto/16 :goto_89e

    :sswitch_72b
    const-string v0, "s905x018"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_735

    goto/16 :goto_111

    :cond_735
    const/16 v0, 0x1b

    goto/16 :goto_89e

    :sswitch_739
    const-string v1, "A10-70L"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_89e

    goto/16 :goto_111

    :sswitch_743
    const-string v0, "A10-70F"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_74d

    goto/16 :goto_111

    :cond_74d
    const/16 v0, 0x19

    goto/16 :goto_89e

    :sswitch_751
    const-string v0, "namath"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_75b

    goto/16 :goto_111

    :cond_75b
    const/16 v0, 0x18

    goto/16 :goto_89e

    :sswitch_75f
    const-string v0, "Slate_Pro"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_769

    goto/16 :goto_111

    :cond_769
    const/16 v0, 0x17

    goto/16 :goto_89e

    :sswitch_76d
    const-string v0, "iris60"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_777

    goto/16 :goto_111

    :cond_777
    const/16 v0, 0x16

    goto/16 :goto_89e

    :sswitch_77b
    const-string v0, "BRAVIA_ATV2"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_785

    goto/16 :goto_111

    :cond_785
    const/16 v0, 0x15

    goto/16 :goto_89e

    :sswitch_789
    const-string v0, "GiONEE_GBL7319"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_793

    goto/16 :goto_111

    :cond_793
    const/16 v0, 0x14

    goto/16 :goto_89e

    :sswitch_797
    const-string v0, "panell_dt"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7a1

    goto/16 :goto_111

    :cond_7a1
    const/16 v0, 0x13

    goto/16 :goto_89e

    :sswitch_7a5
    const-string v0, "panell_ds"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7af

    goto/16 :goto_111

    :cond_7af
    const/16 v0, 0x12

    goto/16 :goto_89e

    :sswitch_7b3
    const-string v0, "panell_dl"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7bd

    goto/16 :goto_111

    :cond_7bd
    const/16 v0, 0x11

    goto/16 :goto_89e

    :sswitch_7c1
    const-string v0, "vernee_M5"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7cb

    goto/16 :goto_111

    :cond_7cb
    const/16 v0, 0x10

    goto/16 :goto_89e

    :sswitch_7cf
    const-string v0, "pacificrim"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7d9

    goto/16 :goto_111

    :cond_7d9
    const/16 v0, 0xf

    goto/16 :goto_89e

    :sswitch_7dd
    const-string v0, "Phantom6"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7e7

    goto/16 :goto_111

    :cond_7e7
    const/16 v0, 0xe

    goto/16 :goto_89e

    :sswitch_7eb
    const-string v0, "ComioS1"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7f5

    goto/16 :goto_111

    :cond_7f5
    const/16 v0, 0xd

    goto/16 :goto_89e

    :sswitch_7f9
    const-string v0, "XT1663"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_803

    goto/16 :goto_111

    :cond_803
    const/16 v0, 0xc

    goto/16 :goto_89e

    :sswitch_807
    const-string v0, "RAIJIN"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_811

    goto/16 :goto_111

    :cond_811
    const/16 v0, 0xb

    goto/16 :goto_89e

    :sswitch_815
    const-string v0, "AquaPowerM"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_81f

    goto/16 :goto_111

    :cond_81f
    const/16 v0, 0xa

    goto/16 :goto_89e

    :sswitch_823
    const-string v0, "PGN611"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_82d

    goto/16 :goto_111

    :cond_82d
    const/16 v0, 0x9

    goto/16 :goto_89e

    :sswitch_831
    const-string v0, "PGN610"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_83b

    goto/16 :goto_111

    :cond_83b
    const/16 v0, 0x8

    goto/16 :goto_89e

    :sswitch_83f
    const-string v0, "PGN528"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_849

    goto/16 :goto_111

    :cond_849
    const/4 v0, 0x7

    goto :goto_89e

    :sswitch_84b
    const-string v0, "NX573J"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_855

    goto/16 :goto_111

    :cond_855
    const/4 v0, 0x6

    goto :goto_89e

    :sswitch_857
    const-string v0, "NX541J"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_861

    goto/16 :goto_111

    :cond_861
    const/4 v0, 0x5

    goto :goto_89e

    :sswitch_863
    const-string v0, "CP8676_I02"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_86d

    goto/16 :goto_111

    :cond_86d
    const/4 v0, 0x4

    goto :goto_89e

    :sswitch_86f
    const-string v0, "K50a40"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_879

    goto/16 :goto_111

    :cond_879
    const/4 v0, 0x3

    goto :goto_89e

    :sswitch_87b
    const-string v0, "GIONEE_SWW1631"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_885

    goto/16 :goto_111

    :cond_885
    const/4 v0, 0x2

    goto :goto_89e

    :sswitch_887
    const-string v0, "GIONEE_SWW1627"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_891

    goto/16 :goto_111

    :cond_891
    const/4 v0, 0x1

    goto :goto_89e

    :sswitch_893
    const-string v0, "GIONEE_SWW1609"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_89d

    goto/16 :goto_111

    :cond_89d
    const/4 v0, 0x0

    :cond_89e
    :goto_89e
    packed-switch v0, :pswitch_data_b54

    .line 6
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "JSN-L21"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8ad

    goto :goto_8ae

    :cond_8ad
    :pswitch_8ad
    return v13

    :cond_8ae
    :goto_8ae
    return v10

    :pswitch_8af
    return v13

    :sswitch_data_8b0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_71
        -0x48b8f57f -> :sswitch_66
        -0x48b8bd30 -> :sswitch_5b
        -0x3c588c8a -> :sswitch_50
        -0x2d5172e2 -> :sswitch_45
        -0x3de1850 -> :sswitch_3a
        0x341e81 -> :sswitch_2f
        0x31316ffa -> :sswitch_24
    .end sparse-switch

    :pswitch_data_8d2
    .packed-switch 0x0
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
        :pswitch_7f
    .end packed-switch

    :sswitch_data_8e6
    .sparse-switch
        -0x14d76e6c -> :sswitch_f6
        -0x132295cd -> :sswitch_eb
        0x1e9d52 -> :sswitch_e0
        0x1e9d5f -> :sswitch_d5
        0x1e9d63 -> :sswitch_ca
        0x6a6b6031 -> :sswitch_bf
        0x6a6b6034 -> :sswitch_b4
        0x6b2deee6 -> :sswitch_a9
        0x7e53ab34 -> :sswitch_9c
    .end sparse-switch

    :pswitch_data_90c
    .packed-switch 0x0
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
        :pswitch_8af
    .end packed-switch

    :sswitch_data_922
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_893
        -0x7fd6c381 -> :sswitch_887
        -0x7fd6c368 -> :sswitch_87b
        -0x7d026749 -> :sswitch_86f
        -0x78929d6a -> :sswitch_863
        -0x75f50a1e -> :sswitch_857
        -0x75f4fe9d -> :sswitch_84b
        -0x736f875c -> :sswitch_83f
        -0x736f83c2 -> :sswitch_831
        -0x736f83c1 -> :sswitch_823
        -0x7327ce1c -> :sswitch_815
        -0x705c574b -> :sswitch_807
        -0x651ebb62 -> :sswitch_7f9
        -0x6423293b -> :sswitch_7eb
        -0x604f5117 -> :sswitch_7dd
        -0x5f691e13 -> :sswitch_7cf
        -0x5ca40cc4 -> :sswitch_7c1
        -0x58520ec1 -> :sswitch_7b3
        -0x58520eba -> :sswitch_7a5
        -0x58520eb9 -> :sswitch_797
        -0x4eaed329 -> :sswitch_789
        -0x4892fb4f -> :sswitch_77b
        -0x465b3df3 -> :sswitch_76d
        -0x43e6c939 -> :sswitch_75f
        -0x3ec0fcc5 -> :sswitch_751
        -0x3b33cca0 -> :sswitch_743
        -0x3b33cc9a -> :sswitch_739
        -0x398ae3f6 -> :sswitch_72b
        -0x391f0fb4 -> :sswitch_71d
        -0x346837ae -> :sswitch_70f
        -0x323788e3 -> :sswitch_701
        -0x30f57652 -> :sswitch_6f3
        -0x2f88a116 -> :sswitch_6e5
        -0x2f61ed98 -> :sswitch_6d7
        -0x2efd0837 -> :sswitch_6c9
        -0x2e9e9441 -> :sswitch_6bb
        -0x2247b8b1 -> :sswitch_6ad
        -0x1f0fa2b7 -> :sswitch_69f
        -0x19af3b41 -> :sswitch_691
        -0x114fad3e -> :sswitch_683
        -0x10dae90b -> :sswitch_675
        -0x1084b7b7 -> :sswitch_667
        -0xa5988e9 -> :sswitch_659
        -0x35f9fbf -> :sswitch_64b
        0x84e -> :sswitch_63d
        0xa04 -> :sswitch_62f
        0xa9b -> :sswitch_621
        0xa9f -> :sswitch_613
        0xc13 -> :sswitch_605
        0xd9b -> :sswitch_5f7
        0x11ebd -> :sswitch_5e9
        0x12711 -> :sswitch_5db
        0x127db -> :sswitch_5cd
        0x12beb -> :sswitch_5bf
        0x1334d -> :sswitch_5b1
        0x135c9 -> :sswitch_5a3
        0x13aea -> :sswitch_595
        0x158d2 -> :sswitch_587
        0x1821e -> :sswitch_579
        0x18220 -> :sswitch_56b
        0x18401 -> :sswitch_55d
        0x18c69 -> :sswitch_54f
        0x1716e6 -> :sswitch_541
        0x171ac8 -> :sswitch_533
        0x171ac9 -> :sswitch_525
        0x208c61 -> :sswitch_517
        0x208c63 -> :sswitch_509
        0x208c80 -> :sswitch_4fb
        0x208c9f -> :sswitch_4ed
        0x208cbe -> :sswitch_4df
        0x208cc0 -> :sswitch_4d1
        0x252f5f -> :sswitch_4c3
        0x25981d -> :sswitch_4b5
        0x259b88 -> :sswitch_4a7
        0x290a13 -> :sswitch_499
        0x3021fd -> :sswitch_48b
        0x321e47 -> :sswitch_47d
        0x332327 -> :sswitch_46f
        0x33ab63 -> :sswitch_461
        0x27691fb -> :sswitch_453
        0x30f8881 -> :sswitch_445
        0x30f8c42 -> :sswitch_437
        0x349f581 -> :sswitch_429
        0x3ab0ea7 -> :sswitch_41b
        0x3e53ea5 -> :sswitch_40d
        0x3f25a44 -> :sswitch_3ff
        0x3f25a46 -> :sswitch_3f1
        0x3f25a49 -> :sswitch_3e3
        0x3f25e05 -> :sswitch_3d5
        0x3f25e07 -> :sswitch_3c7
        0x3f25e09 -> :sswitch_3b9
        0x3f261c6 -> :sswitch_3ab
        0x48dce49 -> :sswitch_39d
        0x48dd589 -> :sswitch_38f
        0x48dd8af -> :sswitch_381
        0x4d36832 -> :sswitch_373
        0x4f0b0e7 -> :sswitch_365
        0x5e2479e -> :sswitch_357
        0x60acc05 -> :sswitch_349
        0x6214744 -> :sswitch_33b
        0x9d91379 -> :sswitch_32d
        0xadc0551 -> :sswitch_31f
        0xea056b3 -> :sswitch_311
        0x1121dbc3 -> :sswitch_303
        0x1255818c -> :sswitch_2f5
        0x1263990d -> :sswitch_2e7
        0x12d90f3a -> :sswitch_2d9
        0x12d90f4c -> :sswitch_2cb
        0x12d98b1b -> :sswitch_2bd
        0x12d98b22 -> :sswitch_2af
        0x1844c711 -> :sswitch_2a1
        0x1e3e8044 -> :sswitch_293
        0x2f5336ed -> :sswitch_285
        0x2f54115e -> :sswitch_277
        0x2f541849 -> :sswitch_269
        0x31cf010e -> :sswitch_25b
        0x36ad82f4 -> :sswitch_24d
        0x391a0b61 -> :sswitch_23f
        0x3f3728cd -> :sswitch_231
        0x448ec687 -> :sswitch_223
        0x46260f63 -> :sswitch_215
        0x4c505106 -> :sswitch_207
        0x4de67084 -> :sswitch_1f9
        0x506ac5a9 -> :sswitch_1eb
        0x5abad9cd -> :sswitch_1dd
        0x64d2e6e9 -> :sswitch_1cf
        0x64d2eac5 -> :sswitch_1c1
        0x65e4085b -> :sswitch_1b3
        0x6f373556 -> :sswitch_1a5
        0x719f1dcb -> :sswitch_197
        0x75d9a0f0 -> :sswitch_189
        0x7796d144 -> :sswitch_17c
        0x785bcb26 -> :sswitch_16f
        0x78fc0e50 -> :sswitch_162
        0x790521fb -> :sswitch_155
        0x7933207f -> :sswitch_148
        0x7a05a409 -> :sswitch_13b
        0x7a0696bd -> :sswitch_12e
        0x7a16dfe7 -> :sswitch_121
        0x7a1f0e95 -> :sswitch_114
    .end sparse-switch

    :pswitch_data_b54
    .packed-switch 0x0
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
        :pswitch_8ad
    .end packed-switch
.end method

.method public static n2(Lax/f1/D;Lax/P0/v;)I
    .registers 13

    .line 1
    const/4 v0, 0x4

    .line 2
    const-string v1, "video/hevc"

    .line 3
    .line 4
    const-string v2, "video/avc"

    .line 5
    .line 6
    const-string v3, "video/av01"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    iget v6, p1, Lax/P0/v;->v:I

    .line 11
    .line 12
    iget v7, p1, Lax/P0/v;->w:I

    .line 13
    .line 14
    const/4 v8, -0x1

    .line 15
    if-eq v6, v8, :cond_f0

    .line 16
    .line 17
    if-ne v7, v8, :cond_14

    .line 18
    .line 19
    goto/16 :goto_f0

    .line 20
    .line 21
    :cond_14
    iget-object v9, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v9}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    check-cast v9, Ljava/lang/String;

    .line 28
    .line 29
    const-string v10, "video/dolby-vision"

    .line 30
    .line 31
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eqz v10, :cond_44

    .line 36
    .line 37
    invoke-static {p1}, Lax/f1/a0;->j(Lax/P0/v;)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_43

    .line 42
    .line 43
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/16 v9, 0x200

    .line 52
    .line 53
    if-eq p1, v9, :cond_41

    .line 54
    .line 55
    if-eq p1, v4, :cond_41

    .line 56
    .line 57
    if-ne p1, v5, :cond_3b

    .line 58
    .line 59
    goto :goto_41

    .line 60
    :cond_3b
    const/16 v9, 0x400

    .line 61
    .line 62
    if-ne p1, v9, :cond_43

    .line 63
    .line 64
    move-object v9, v3

    .line 65
    goto :goto_44

    .line 66
    :cond_41
    :goto_41
    move-object v9, v2

    .line 67
    goto :goto_44

    .line 68
    :cond_43
    move-object v9, v1

    .line 69
    :cond_44
    :goto_44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    sparse-switch p1, :sswitch_data_f2

    .line 77
    .line 78
    .line 79
    :goto_4e
    const/4 v4, -0x1

    .line 80
    goto :goto_94

    .line 81
    :sswitch_50
    const-string p1, "video/x-vnd.on2.vp9"

    .line 82
    .line 83
    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_59

    .line 88
    .line 89
    goto :goto_4e

    .line 90
    :cond_59
    const/4 v4, 0x6

    .line 91
    goto :goto_94

    .line 92
    :sswitch_5b
    const-string p1, "video/x-vnd.on2.vp8"

    .line 93
    .line 94
    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_64

    .line 99
    .line 100
    goto :goto_4e

    .line 101
    :cond_64
    const/4 v4, 0x5

    .line 102
    goto :goto_94

    .line 103
    :sswitch_66
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_6d

    .line 108
    .line 109
    goto :goto_4e

    .line 110
    :cond_6d
    const/4 v4, 0x4

    .line 111
    goto :goto_94

    .line 112
    :sswitch_6f
    const-string p1, "video/mp4v-es"

    .line 113
    .line 114
    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_78

    .line 119
    .line 120
    goto :goto_4e

    .line 121
    :cond_78
    const/4 v4, 0x3

    .line 122
    goto :goto_94

    .line 123
    :sswitch_7a
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_81

    .line 128
    .line 129
    goto :goto_4e

    .line 130
    :cond_81
    const/4 v4, 0x2

    .line 131
    goto :goto_94

    .line 132
    :sswitch_83
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_94

    .line 137
    .line 138
    goto :goto_4e

    .line 139
    :sswitch_8a
    const-string p1, "video/3gpp"

    .line 140
    .line 141
    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-nez p1, :cond_93

    .line 146
    .line 147
    goto :goto_4e

    .line 148
    :cond_93
    const/4 v4, 0x0

    .line 149
    :cond_94
    :goto_94
    packed-switch v4, :pswitch_data_110

    .line 150
    .line 151
    .line 152
    return v8

    .line 153
    :pswitch_98
    mul-int v6, v6, v7

    .line 154
    .line 155
    invoke-static {v6, v0}, Lax/o1/k;->s2(II)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    return p0

    .line 160
    :pswitch_9f
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 161
    .line 162
    const-string v0, "BRAVIA 4K 2015"

    .line 163
    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_db

    .line 169
    .line 170
    const-string v0, "Amazon"

    .line 171
    .line 172
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_c8

    .line 179
    .line 180
    const-string v0, "KFSOWI"

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_db

    .line 187
    .line 188
    const-string v0, "AFTS"

    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_c8

    .line 195
    .line 196
    iget-boolean p0, p0, Lax/f1/D;->g:Z

    .line 197
    .line 198
    if-eqz p0, :cond_c8

    .line 199
    .line 200
    goto :goto_db

    .line 201
    :cond_c8
    const/16 p0, 0x10

    .line 202
    .line 203
    invoke-static {v6, p0}, Lax/S0/d0;->k(II)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v7, p0}, Lax/S0/d0;->k(II)I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    mul-int p1, p1, p0

    .line 212
    .line 213
    mul-int/lit16 p1, p1, 0x100

    .line 214
    .line 215
    invoke-static {p1, v5}, Lax/o1/k;->s2(II)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    return p0

    .line 220
    :cond_db
    :goto_db
    return v8

    .line 221
    :pswitch_dc
    mul-int v6, v6, v7

    .line 222
    .line 223
    invoke-static {v6, v5}, Lax/o1/k;->s2(II)I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    const/high16 p1, 0x200000

    .line 228
    .line 229
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    return p0

    .line 234
    :pswitch_e9
    mul-int v6, v6, v7

    .line 235
    .line 236
    invoke-static {v6, v5}, Lax/o1/k;->s2(II)I

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    return p0

    .line 241
    :cond_f0
    :goto_f0
    return v8

    .line 242
    nop

    .line 243
    :sswitch_data_f2
    .sparse-switch
        -0x63306f58 -> :sswitch_8a
        -0x631b55f6 -> :sswitch_83
        -0x63185e82 -> :sswitch_7a
        0x46cdc642 -> :sswitch_6f
        0x4f62373a -> :sswitch_66
        0x5f50bed8 -> :sswitch_5b
        0x5f50bed9 -> :sswitch_50
    .end sparse-switch

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
    :pswitch_data_110
    .packed-switch 0x0
        :pswitch_e9
        :pswitch_e9
        :pswitch_dc
        :pswitch_e9
        :pswitch_9f
        :pswitch_e9
        :pswitch_98
    .end packed-switch
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

.method private static o2(Lax/f1/D;Lax/P0/v;)Landroid/graphics/Point;
    .registers 15

    .line 1
    iget v0, p1, Lax/P0/v;->w:I

    .line 2
    .line 3
    iget v1, p1, Lax/P0/v;->v:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-le v0, v1, :cond_9

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-eqz v3, :cond_e

    .line 12
    .line 13
    move v4, v0

    .line 14
    goto :goto_f

    .line 15
    :cond_e
    move v4, v1

    .line 16
    :goto_f
    if-eqz v3, :cond_12

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_12
    int-to-float v1, v0

    .line 20
    int-to-float v5, v4

    .line 21
    div-float/2addr v1, v5

    .line 22
    sget-object v5, Lax/o1/k;->D2:[I

    .line 23
    .line 24
    array-length v6, v5

    .line 25
    :goto_18
    const/4 v7, 0x0

    .line 26
    if-ge v2, v6, :cond_46

    .line 27
    .line 28
    aget v8, v5, v2

    .line 29
    .line 30
    int-to-float v9, v8

    .line 31
    mul-float v9, v9, v1

    .line 32
    .line 33
    float-to-int v9, v9

    .line 34
    if-le v8, v4, :cond_46

    .line 35
    .line 36
    if-gt v9, v0, :cond_26

    .line 37
    .line 38
    goto :goto_46

    .line 39
    :cond_26
    if-eqz v3, :cond_2a

    .line 40
    .line 41
    move v7, v9

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    move v7, v8

    .line 44
    :goto_2b
    if-eqz v3, :cond_2e

    .line 45
    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    move v8, v9

    .line 48
    :goto_2f
    invoke-virtual {p0, v7, v8}, Lax/f1/D;->c(II)Landroid/graphics/Point;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    iget v8, p1, Lax/P0/v;->z:F

    .line 53
    .line 54
    if-eqz v7, :cond_43

    .line 55
    .line 56
    iget v9, v7, Landroid/graphics/Point;->x:I

    .line 57
    .line 58
    iget v10, v7, Landroid/graphics/Point;->y:I

    .line 59
    .line 60
    float-to-double v11, v8

    .line 61
    invoke-virtual {p0, v9, v10, v11, v12}, Lax/f1/D;->w(IID)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_43

    .line 66
    .line 67
    return-object v7

    .line 68
    :cond_43
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_18

    .line 71
    :cond_46
    :goto_46
    return-object v7
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

.method private static q2(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/f1/Q;",
            "Lax/P0/v;",
            "ZZ)",
            "Ljava/util/List<",
            "Lax/f1/D;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    if-lt v1, v2, :cond_28

    .line 15
    .line 16
    const-string v1, "video/dolby-vision"

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_28

    .line 23
    .line 24
    invoke-static {p0}, Lax/o1/k$c;->a(Landroid/content/Context;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_28

    .line 29
    .line 30
    invoke-static {p1, p2, p3, p4}, Lax/f1/a0;->h(Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_28

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_28
    invoke-static {p1, p2, p3, p4}, Lax/f1/a0;->n(Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
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
.end method

.method protected static r2(Lax/f1/D;Lax/P0/v;)I
    .registers 5

    .line 1
    iget v0, p1, Lax/P0/v;->p:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_20

    .line 5
    .line 6
    iget-object p0, p1, Lax/P0/v;->r:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_d
    if-ge v0, p0, :cond_1c

    .line 15
    .line 16
    iget-object v2, p1, Lax/P0/v;->r:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, [B

    .line 23
    .line 24
    array-length v2, v2

    .line 25
    add-int/2addr v1, v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_d

    .line 29
    :cond_1c
    iget p0, p1, Lax/P0/v;->p:I

    .line 30
    .line 31
    add-int/2addr p0, v1

    .line 32
    return p0

    .line 33
    :cond_20
    invoke-static {p0, p1}, Lax/o1/k;->n2(Lax/f1/D;Lax/P0/v;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static s2(II)I
    .registers 2

    .line 1
    mul-int/lit8 p0, p0, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    div-int/2addr p0, p1

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

.method private u2(Lax/f1/D;)Landroid/view/Surface;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/o1/S;->j()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_9
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 11
    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_e
    invoke-virtual {p0, p1}, Lax/o1/k;->Y2(Lax/f1/D;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :cond_16
    invoke-virtual {p0, p1}, Lax/o1/k;->Z2(Lax/f1/D;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 31
    .line 32
    if-eqz v0, :cond_2a

    .line 33
    .line 34
    iget-boolean v0, v0, Lax/o1/o;->q:Z

    .line 35
    .line 36
    iget-boolean v1, p1, Lax/f1/D;->g:Z

    .line 37
    .line 38
    if-eq v0, v1, :cond_2a

    .line 39
    .line 40
    invoke-direct {p0}, Lax/o1/k;->M2()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    iget-object v0, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 44
    .line 45
    if-nez v0, :cond_38

    .line 46
    .line 47
    iget-object v0, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 48
    .line 49
    iget-boolean p1, p1, Lax/f1/D;->g:Z

    .line 50
    .line 51
    invoke-static {v0, p1}, Lax/o1/o;->c(Landroid/content/Context;Z)Lax/o1/o;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 56
    .line 57
    :cond_38
    iget-object p1, p0, Lax/o1/k;->e2:Lax/o1/o;

    .line 58
    .line 59
    return-object p1
    .line 60
    .line 61
.end method

.method private v2(Lax/f1/D;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-nez v0, :cond_1d

    .line 4
    .line 5
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 6
    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1d

    .line 14
    .line 15
    :cond_e
    invoke-virtual {p0, p1}, Lax/o1/k;->Y2(Lax/f1/D;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1d

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lax/o1/k;->Z2(Lax/f1/D;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1b

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1d
    :goto_1d
    const/4 p1, 0x1

    .line 31
    return p1
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

.method private w2(Lax/V0/i;)Z
    .registers 6

    .line 1
    iget-wide v0, p1, Lax/V0/i;->g0:J

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-gez p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private x2(Lax/V0/i;)Z
    .registers 8

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_2e

    .line 7
    .line 8
    invoke-virtual {p1}, Lax/V0/a;->w()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    goto :goto_2e

    .line 15
    :cond_e
    iget-wide v2, p0, Lax/o1/k;->A2:J

    .line 16
    .line 17
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    if-nez v0, :cond_1a

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    iget-wide v2, p1, Lax/V0/i;->g0:J

    .line 28
    .line 29
    invoke-virtual {p0}, Lax/f1/L;->P0()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    sub-long/2addr v2, v4

    .line 34
    iget-wide v4, p0, Lax/o1/k;->A2:J

    .line 35
    .line 36
    sub-long/2addr v4, v2

    .line 37
    const-wide/32 v2, 0x186a0

    .line 38
    .line 39
    .line 40
    cmp-long p1, v4, v2

    .line 41
    .line 42
    if-gtz p1, :cond_2c

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2c
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_2e
    :goto_2e
    return v1
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

.method private z2()V
    .registers 7

    .line 1
    iget v0, p0, Lax/o1/k;->k2:I

    .line 2
    .line 3
    if-lez v0, :cond_1c

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lax/o1/k;->j2:J

    .line 14
    .line 15
    sub-long v2, v0, v2

    .line 16
    .line 17
    iget-object v4, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 18
    .line 19
    iget v5, p0, Lax/o1/k;->k2:I

    .line 20
    .line 21
    invoke-virtual {v4, v5, v2, v3}, Lax/o1/P$a;->n(IJ)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput v2, p0, Lax/o1/k;->k2:I

    .line 26
    .line 27
    iput-wide v0, p0, Lax/o1/k;->j2:J

    .line 28
    .line 29
    :cond_1c
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public B(ILjava/lang/Object;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_e5

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    if-eq p1, v1, :cond_d5

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-eq p1, v1, :cond_bd

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p1, v1, :cond_a5

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    if-eq p1, v1, :cond_8b

    .line 16
    .line 17
    const/16 v1, 0xd

    .line 18
    .line 19
    if-eq p1, v1, :cond_81

    .line 20
    .line 21
    const/16 v1, 0xe

    .line 22
    .line 23
    if-eq p1, v1, :cond_5d

    .line 24
    .line 25
    packed-switch p1, :pswitch_data_ea

    .line 26
    .line 27
    .line 28
    invoke-super {p0, p1, p2}, Lax/f1/L;->B(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1f
    iget-object p1, p0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz p1, :cond_2a

    .line 36
    .line 37
    iget-boolean p1, p1, Lax/Y0/Y;->d:Z

    .line 38
    .line 39
    if-eqz p1, :cond_2a

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 p1, 0x0

    .line 44
    :goto_2b
    check-cast p2, Lax/Y0/Y;

    .line 45
    .line 46
    iput-object p2, p0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 47
    .line 48
    if-eqz p2, :cond_36

    .line 49
    .line 50
    iget-boolean p2, p2, Lax/Y0/Y;->d:Z

    .line 51
    .line 52
    if-eqz p2, :cond_36

    .line 53
    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 v0, 0x0

    .line 56
    :goto_37
    if-eq p1, v0, :cond_e4

    .line 57
    .line 58
    invoke-virtual {p0}, Lax/f1/L;->T1()Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3d
    iget-object p1, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {p0, v1}, Lax/o1/k;->Q2(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lax/o1/k;

    .line 73
    .line 74
    invoke-virtual {p2, v0, p1}, Lax/o1/k;->B(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_4d
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iput p1, p0, Lax/o1/k;->u2:I

    .line 89
    .line 90
    invoke-direct {p0}, Lax/o1/k;->c3()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5d
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lax/S0/I;

    .line 99
    .line 100
    invoke-virtual {p1}, Lax/S0/I;->b()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_e4

    .line 105
    .line 106
    invoke-virtual {p1}, Lax/S0/I;->a()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_e4

    .line 111
    .line 112
    iput-object p1, p0, Lax/o1/k;->f2:Lax/S0/I;

    .line 113
    .line 114
    iget-object p2, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 115
    .line 116
    if-eqz p2, :cond_e4

    .line 117
    .line 118
    iget-object v0, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 119
    .line 120
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Landroid/view/Surface;

    .line 125
    .line 126
    invoke-interface {p2, v0, p1}, Lax/o1/S;->t(Landroid/view/Surface;Lax/S0/I;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_81
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ljava/util/List;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lax/o1/k;->T2(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_8b
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iput p1, p0, Lax/o1/k;->i2:I

    .line 151
    .line 152
    iget-object p2, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 153
    .line 154
    if-eqz p2, :cond_9f

    .line 155
    .line 156
    invoke-interface {p2, p1}, Lax/o1/S;->s(I)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_9f
    iget-object p2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 161
    .line 162
    invoke-virtual {p2, p1}, Lax/o1/A;->l(I)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_a5
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    iput p1, p0, Lax/o1/k;->h2:I

    .line 177
    .line 178
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_e4

    .line 183
    .line 184
    iget p2, p0, Lax/o1/k;->h2:I

    .line 185
    .line 186
    invoke-interface {p1, p2}, Lax/f1/x;->n(I)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_bd
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    iget p2, p0, Lax/o1/k;->w2:I

    .line 201
    .line 202
    if-eq p2, p1, :cond_e4

    .line 203
    .line 204
    iput p1, p0, Lax/o1/k;->w2:I

    .line 205
    .line 206
    iget-boolean p1, p0, Lax/o1/k;->v2:Z

    .line 207
    .line 208
    if-eqz p1, :cond_e4

    .line 209
    .line 210
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_d5
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lax/o1/z;

    .line 219
    .line 220
    iput-object p1, p0, Lax/o1/k;->y2:Lax/o1/z;

    .line 221
    .line 222
    iget-object p2, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 223
    .line 224
    if-eqz p2, :cond_e4

    .line 225
    .line 226
    invoke-interface {p2, p1}, Lax/o1/S;->p(Lax/o1/z;)V

    .line 227
    .line 228
    .line 229
    :cond_e4
    return-void

    .line 230
    :cond_e5
    invoke-direct {p0, p2}, Lax/o1/k;->Q2(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    nop

    .line 235
    :pswitch_data_ea
    .packed-switch 0x10
        :pswitch_4d
        :pswitch_3d
        :pswitch_1f
    .end packed-switch
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

.method public E(JJ)Z
    .registers 5

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lax/o1/k;->W2(JJ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method protected F0(Lax/V0/i;)I
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_25

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/o1/k;->V1:Z

    .line 8
    .line 9
    if-nez v0, :cond_16

    .line 10
    .line 11
    iget-object v0, p0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 12
    .line 13
    if-eqz v0, :cond_12

    .line 14
    .line 15
    iget-boolean v0, v0, Lax/Y0/Y;->h:Z

    .line 16
    .line 17
    if-nez v0, :cond_16

    .line 18
    .line 19
    :cond_12
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 20
    .line 21
    if-eqz v0, :cond_25

    .line 22
    .line 23
    :cond_16
    invoke-direct {p0, p1}, Lax/o1/k;->w2(Lax/V0/i;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_25

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lax/o1/k;->x2(Lax/V0/i;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_25

    .line 34
    .line 35
    const/16 p1, 0x20

    .line 36
    .line 37
    return p1

    .line 38
    :cond_25
    const/4 p1, 0x0

    .line 39
    return p1
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

.method protected I0()Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-ge v0, v1, :cond_c

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

.method protected J0(FLax/P0/v;[Lax/P0/v;)F
    .registers 10

    .line 1
    array-length v0, p3

    .line 2
    const/high16 v1, -0x40800000    # -1.0f

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/high16 v3, -0x40800000    # -1.0f

    .line 6
    .line 7
    :goto_6
    if-ge v2, v0, :cond_17

    .line 8
    .line 9
    aget-object v4, p3, v2

    .line 10
    .line 11
    iget v4, v4, Lax/P0/v;->z:F

    .line 12
    .line 13
    cmpl-float v5, v4, v1

    .line 14
    .line 15
    if-eqz v5, :cond_14

    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_6

    .line 24
    :cond_17
    cmpl-float p3, v3, v1

    .line 25
    .line 26
    if-nez p3, :cond_1e

    .line 27
    .line 28
    const/high16 v3, -0x40800000    # -1.0f

    .line 29
    .line 30
    goto :goto_20

    .line 31
    :cond_1e
    mul-float v3, v3, p1

    .line 32
    .line 33
    :goto_20
    iget-object p1, p0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 34
    .line 35
    if-eqz p1, :cond_3b

    .line 36
    .line 37
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3b

    .line 42
    .line 43
    iget p3, p2, Lax/P0/v;->v:I

    .line 44
    .line 45
    iget p2, p2, Lax/P0/v;->w:I

    .line 46
    .line 47
    invoke-virtual {p1, p3, p2}, Lax/f1/D;->h(II)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    cmpl-float p2, v3, v1

    .line 52
    .line 53
    if-eqz p2, :cond_3a

    .line 54
    .line 55
    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :cond_3a
    return p1

    .line 60
    :cond_3b
    return v3
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

.method protected J2(J)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/f1/L;->W1(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/o1/k;->s2:Lax/P0/a0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/o1/k;->C2(Lax/P0/a0;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 10
    .line 11
    iget v1, v0, Lax/Y0/b;->e:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, v0, Lax/Y0/b;->e:I

    .line 16
    .line 17
    invoke-direct {p0}, Lax/o1/k;->A2()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lax/o1/k;->n1(J)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method protected K1(Lax/V0/i;)Z
    .registers 10

    .line 1
    invoke-direct {p0, p1}, Lax/o1/k;->x2(Lax/V0/i;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-direct {p0, p1}, Lax/o1/k;->w2(Lax/V0/i;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, Lax/o1/k;->T1:Lax/o1/B;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_28

    .line 17
    .line 18
    iget-wide v4, p1, Lax/V0/i;->g0:J

    .line 19
    .line 20
    invoke-virtual {v2, v4, v5}, Lax/o1/B;->c(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v2, v4, v6

    .line 30
    .line 31
    if-eqz v2, :cond_28

    .line 32
    .line 33
    iget-wide v6, p0, Lax/o1/k;->S1:J

    .line 34
    .line 35
    cmp-long v2, v4, v6

    .line 36
    .line 37
    if-gez v2, :cond_28

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    goto :goto_29

    .line 41
    :cond_28
    const/4 v2, 0x0

    .line 42
    :goto_29
    if-nez v0, :cond_2e

    .line 43
    .line 44
    if-nez v2, :cond_2e

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2e
    invoke-virtual {p1}, Lax/V0/a;->r()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_35

    .line 52
    .line 53
    return v1

    .line 54
    :cond_35
    invoke-virtual {p1}, Lax/V0/a;->x()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_40

    .line 59
    .line 60
    invoke-virtual {p1}, Lax/V0/i;->p()V

    .line 61
    .line 62
    .line 63
    :goto_3e
    const/4 v1, 0x1

    .line 64
    goto :goto_a2

    .line 65
    :cond_40
    iget-object v2, p0, Lax/o1/k;->R1:Lax/o1/a;

    .line 66
    .line 67
    if-eqz v2, :cond_a2

    .line 68
    .line 69
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lax/f1/D;

    .line 78
    .line 79
    iget-object v2, v2, Lax/f1/D;->b:Ljava/lang/String;

    .line 80
    .line 81
    const-string v4, "video/av01"

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_a2

    .line 88
    .line 89
    iget-object v2, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v2, :cond_a2

    .line 92
    .line 93
    if-nez v0, :cond_65

    .line 94
    .line 95
    iget v4, p0, Lax/o1/k;->C2:I

    .line 96
    .line 97
    if-gtz v4, :cond_63

    .line 98
    .line 99
    goto :goto_65

    .line 100
    :cond_63
    const/4 v4, 0x0

    .line 101
    goto :goto_66

    .line 102
    :cond_65
    :goto_65
    const/4 v4, 0x1

    .line 103
    :goto_66
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 108
    .line 109
    .line 110
    iget-object v5, p0, Lax/o1/k;->R1:Lax/o1/a;

    .line 111
    .line 112
    invoke-virtual {v5, v2, v4}, Lax/o1/a;->d(Ljava/nio/ByteBuffer;Z)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_79

    .line 117
    .line 118
    invoke-virtual {p1}, Lax/V0/i;->p()V

    .line 119
    .line 120
    .line 121
    goto :goto_3e

    .line 122
    :cond_79
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eq v4, v5, :cond_a2

    .line 127
    .line 128
    iget-object v5, p0, Lax/o1/k;->W1:Lax/o1/k$e;

    .line 129
    .line 130
    invoke-static {v5}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Lax/o1/k$e;

    .line 135
    .line 136
    iget v5, v5, Lax/o1/k$e;->c:I

    .line 137
    .line 138
    add-int/2addr v5, v4

    .line 139
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-ge v5, v2, :cond_a2

    .line 144
    .line 145
    invoke-virtual {p1}, Lax/V0/i;->E()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_a2

    .line 150
    .line 151
    iget-object v1, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 158
    .line 159
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 160
    .line 161
    .line 162
    goto :goto_3e

    .line 163
    :cond_a2
    :goto_a2
    if-eqz v1, :cond_be

    .line 164
    .line 165
    if-eqz v0, :cond_ae

    .line 166
    .line 167
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 168
    .line 169
    iget v0, p1, Lax/Y0/b;->d:I

    .line 170
    .line 171
    add-int/2addr v0, v3

    .line 172
    iput v0, p1, Lax/Y0/b;->d:I

    .line 173
    .line 174
    return v1

    .line 175
    :cond_ae
    iget-object v0, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 176
    .line 177
    iget-wide v4, p1, Lax/V0/i;->g0:J

    .line 178
    .line 179
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    iget p1, p0, Lax/o1/k;->C2:I

    .line 187
    .line 188
    add-int/2addr p1, v3

    .line 189
    iput p1, p0, Lax/o1/k;->C2:I

    .line 190
    .line 191
    :cond_be
    return v1
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

.method protected L0(Lax/f1/Q;Lax/P0/v;Z)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/f1/Q;",
            "Lax/P0/v;",
            "Z)",
            "Ljava/util/List<",
            "Lax/f1/D;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 2
    .line 3
    iget-boolean v1, p0, Lax/o1/k;->v2:Z

    .line 4
    .line 5
    invoke-static {v0, p1, p2, p3, v1}, Lax/o1/k;->q2(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;ZZ)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2}, Lax/f1/a0;->o(Ljava/util/List;Lax/P0/v;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method protected final L1()Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->H0()Lax/P0/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/o1/k;->n2:Lax/Y0/Y;

    .line 6
    .line 7
    if-nez v1, :cond_d

    .line 8
    .line 9
    invoke-super {p0}, Lax/f1/L;->L1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    iget-boolean v1, v1, Lax/Y0/Y;->f:Z

    .line 15
    .line 16
    if-eqz v1, :cond_35

    .line 17
    .line 18
    iget-boolean v1, p0, Lax/o1/k;->o2:Z

    .line 19
    .line 20
    if-nez v1, :cond_35

    .line 21
    .line 22
    iget-boolean v1, p0, Lax/o1/k;->v2:Z

    .line 23
    .line 24
    if-nez v1, :cond_35

    .line 25
    .line 26
    if-eqz v0, :cond_1f

    .line 27
    .line 28
    iget v0, v0, Lax/P0/v;->q:I

    .line 29
    .line 30
    if-gtz v0, :cond_35

    .line 31
    .line 32
    :cond_1f
    invoke-virtual {p0}, Lax/f1/L;->V0()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_35

    .line 37
    .line 38
    invoke-virtual {p0}, Lax/f1/L;->N0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v4, v0, v2

    .line 48
    .line 49
    if-eqz v4, :cond_33

    .line 50
    .line 51
    goto :goto_35

    .line 52
    :cond_33
    const/4 v0, 0x0

    .line 53
    return v0

    .line 54
    :cond_35
    :goto_35
    const/4 v0, 0x1

    .line 55
    return v0
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

.method protected M1(Lax/f1/D;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o1/k;->v2(Lax/f1/D;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method protected O0(Lax/f1/D;Lax/P0/v;Landroid/media/MediaCrypto;F)Lax/f1/x$a;
    .registers 12

    .line 1
    iget-object v2, p1, Lax/f1/D;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->Q()[Lax/P0/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Lax/o1/k;->p2(Lax/f1/D;Lax/P0/v;[Lax/P0/v;)Lax/o1/k$e;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iput-object v3, p0, Lax/o1/k;->W1:Lax/o1/k$e;

    .line 12
    .line 13
    iget-boolean v5, p0, Lax/o1/k;->O1:Z

    .line 14
    .line 15
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 16
    .line 17
    if-eqz v0, :cond_19

    .line 18
    .line 19
    iget v0, p0, Lax/o1/k;->w2:I

    .line 20
    .line 21
    move v6, v0

    .line 22
    move-object v1, p2

    .line 23
    move v4, p4

    .line 24
    move-object v0, p0

    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    const/4 v0, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v0, p0

    .line 29
    move-object v1, p2

    .line 30
    move v4, p4

    .line 31
    :goto_1e
    invoke-virtual/range {v0 .. v6}, Lax/o1/k;->t2(Lax/P0/v;Ljava/lang/String;Lax/o1/k$e;FZI)Landroid/media/MediaFormat;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {p0, p1}, Lax/o1/k;->u2(Lax/f1/D;)Landroid/view/Surface;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    invoke-direct {p0, p2}, Lax/o1/k;->F2(Landroid/media/MediaFormat;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2, v1, p4, p3}, Lax/f1/x$a;->b(Lax/f1/D;Landroid/media/MediaFormat;Lax/P0/v;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lax/f1/x$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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

.method protected final O1()Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 6
    .line 7
    if-eqz v1, :cond_20

    .line 8
    .line 9
    if-eqz v0, :cond_20

    .line 10
    .line 11
    iget-object v1, v0, Lax/f1/D;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "c2.mtk.avc.decoder"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1e

    .line 20
    .line 21
    iget-object v0, v0, Lax/f1/D;->a:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "c2.mtk.hevc.decoder"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_20

    .line 30
    .line 31
    :cond_1e
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_20
    invoke-super {p0}, Lax/f1/L;->O1()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
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
.end method

.method protected O2(Lax/f1/x;IJJ)V
    .registers 7

    .line 1
    const-string p3, "releaseOutputBuffer"

    .line 2
    .line 3
    invoke-static {p3}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p5, p6}, Lax/f1/x;->i(IJ)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lax/S0/N;->b()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 13
    .line 14
    iget p2, p1, Lax/Y0/b;->e:I

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    iput p2, p1, Lax/Y0/b;->e:I

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lax/o1/k;->l2:I

    .line 22
    .line 23
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 24
    .line 25
    if-nez p1, :cond_22

    .line 26
    .line 27
    iget-object p1, p0, Lax/o1/k;->s2:Lax/P0/a0;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lax/o1/k;->C2(Lax/P0/a0;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lax/o1/k;->A2()V

    .line 33
    .line 34
    .line 35
    :cond_22
    return-void
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

.method protected R1(Lax/f1/Q;Lax/P0/v;)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lax/o1/k;->b3(Landroid/content/Context;Lax/f1/Q;Lax/P0/v;)I

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

.method protected S2(Lax/f1/x;Landroid/view/Surface;)V
    .registers 3

    .line 1
    invoke-interface {p1, p2}, Lax/f1/x;->p(Landroid/view/Surface;)V

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

.method protected T0(Lax/V0/i;)V
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/o1/k;->Y1:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_57

    .line 6
    :cond_5
    iget-object p1, p1, Lax/V0/i;->h0:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x7

    .line 19
    if-lt v0, v1, :cond_57

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    const/16 v6, -0x4b

    .line 46
    .line 47
    if-ne v0, v6, :cond_57

    .line 48
    .line 49
    const/16 v0, 0x3c

    .line 50
    .line 51
    if-ne v1, v0, :cond_57

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    if-ne v2, v0, :cond_57

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    if-ne v3, v1, :cond_57

    .line 58
    .line 59
    if-eqz v4, :cond_3e

    .line 60
    .line 61
    if-ne v4, v0, :cond_57

    .line 62
    .line 63
    :cond_3e
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    new-array v0, v0, [B

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lax/f1/x;

    .line 84
    .line 85
    invoke-static {p1, v0}, Lax/o1/k;->P2(Lax/f1/x;[B)V

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

.method public T2(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/P0/Y;->a:Lax/r7/z;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_19

    .line 8
    .line 9
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 10
    .line 11
    if-eqz p1, :cond_22

    .line 12
    .line 13
    invoke-interface {p1}, Lax/o1/S;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    goto :goto_22

    .line 20
    :cond_13
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 21
    .line 22
    invoke-interface {p1}, Lax/o1/S;->h()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iput-object p1, p0, Lax/o1/k;->c2:Ljava/util/List;

    .line 27
    .line 28
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 29
    .line 30
    if-eqz v0, :cond_22

    .line 31
    .line 32
    invoke-interface {v0, p1}, Lax/o1/S;->w(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    :goto_22
    return-void
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

.method protected U()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/o1/k;->t2:Lax/P0/a0;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lax/o1/k;->A2:J

    .line 10
    .line 11
    invoke-direct {p0}, Lax/o1/k;->G2()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, p0, Lax/o1/k;->g2:Z

    .line 16
    .line 17
    iput-object v0, p0, Lax/o1/k;->x2:Lax/o1/k$f;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lax/o1/k;->o2:Z

    .line 21
    .line 22
    :try_start_15
    invoke-super {p0}, Lax/f1/L;->U()V
    :try_end_18
    .catchall {:try_start_15 .. :try_end_18} :catchall_27

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 26
    .line 27
    iget-object v1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lax/o1/P$a;->m(Lax/Y0/b;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 33
    .line 34
    sget-object v1, Lax/P0/a0;->e:Lax/P0/a0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lax/o1/P$a;->t(Lax/P0/a0;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_27
    move-exception v0

    .line 41
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 42
    .line 43
    iget-object v2, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lax/o1/P$a;->m(Lax/Y0/b;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 49
    .line 50
    sget-object v2, Lax/P0/a0;->e:Lax/P0/a0;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lax/o1/P$a;->t(Lax/P0/a0;)V

    .line 53
    .line 54
    .line 55
    throw v0
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

.method protected U2(JJZ)Z
    .registers 7

    .line 1
    const-wide/32 p3, -0x7a120

    .line 2
    .line 3
    .line 4
    cmp-long v0, p1, p3

    .line 5
    .line 6
    if-gez v0, :cond_b

    .line 7
    .line 8
    if-nez p5, :cond_b

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return p1
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

.method protected V(ZZ)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lax/f1/L;->V(ZZ)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->L()Lax/Y0/W;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean p1, p1, Lax/Y0/W;->b:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz p1, :cond_14

    .line 13
    .line 14
    iget v2, p0, Lax/o1/k;->w2:I

    .line 15
    .line 16
    if-eqz v2, :cond_12

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :cond_12
    const/4 v2, 0x0

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    :goto_14
    const/4 v2, 0x1

    .line 22
    :goto_15
    invoke-static {v2}, Lax/S0/a;->g(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean v2, p0, Lax/o1/k;->v2:Z

    .line 26
    .line 27
    if-eq v2, p1, :cond_21

    .line 28
    .line 29
    iput-boolean p1, p0, Lax/o1/k;->v2:Z

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 32
    .line 33
    .line 34
    :cond_21
    iget-object p1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 35
    .line 36
    iget-object v2, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Lax/o1/P$a;->o(Lax/Y0/b;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, p0, Lax/o1/k;->a2:Z

    .line 42
    .line 43
    if-nez p1, :cond_47

    .line 44
    .line 45
    iget-object p1, p0, Lax/o1/k;->c2:Ljava/util/List;

    .line 46
    .line 47
    if-eqz p1, :cond_45

    .line 48
    .line 49
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 50
    .line 51
    if-nez p1, :cond_45

    .line 52
    .line 53
    iget-object p1, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v2}, Lax/o1/k;->h2(Landroid/content/Context;Lax/o1/A;)Lax/o1/s;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v1}, Lax/o1/s;->S(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lax/o1/s;->F(I)Lax/o1/S;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 69
    .line 70
    :cond_45
    iput-boolean v1, p0, Lax/o1/k;->a2:Z

    .line 71
    .line 72
    :cond_47
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 73
    .line 74
    if-eqz p1, :cond_56

    .line 75
    .line 76
    invoke-direct {p0}, Lax/o1/k;->g2()V

    .line 77
    .line 78
    .line 79
    xor-int/lit8 p1, p2, 0x1

    .line 80
    .line 81
    iput p1, p0, Lax/o1/k;->b2:I

    .line 82
    .line 83
    invoke-virtual {p0}, Lax/f1/L;->y0()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    iget-object p1, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Lax/o1/A;->m(Lax/S0/h;)V

    .line 94
    .line 95
    .line 96
    xor-int/lit8 p1, p2, 0x1

    .line 97
    .line 98
    iget-object p2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lax/o1/A;->j(I)V

    .line 101
    .line 102
    .line 103
    return-void
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

.method protected V2(JJZ)Z
    .registers 7

    .line 1
    const-wide/16 p3, -0x7530

    .line 2
    .line 3
    cmp-long v0, p1, p3

    .line 4
    .line 5
    if-gez v0, :cond_a

    .line 6
    .line 7
    if-nez p5, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_a
    const/4 p1, 0x0

    .line 12
    return p1
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

.method protected W()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroidx/media3/exoplayer/h;->W()V

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

.method protected W2(JJ)Z
    .registers 8

    .line 1
    const-wide/16 v0, -0x7530

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_f

    .line 6
    .line 7
    const-wide/32 p1, 0x186a0

    .line 8
    .line 9
    .line 10
    cmp-long v0, p3, p1

    .line 11
    .line 12
    if-lez v0, :cond_f

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_f
    const/4 p1, 0x0

    .line 17
    return p1
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

.method protected X(JZ)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    if-nez p3, :cond_a

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-interface {v0, v1}, Lax/o1/S;->v(Z)V

    .line 9
    .line 10
    .line 11
    :cond_a
    invoke-super {p0, p1, p2, p3}, Lax/f1/L;->X(JZ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 15
    .line 16
    if-nez p1, :cond_16

    .line 17
    .line 18
    iget-object p1, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/o1/A;->k()V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object p1, p0, Lax/o1/k;->T1:Lax/o1/B;

    .line 24
    .line 25
    if-eqz p1, :cond_1d

    .line 26
    .line 27
    invoke-virtual {p1}, Lax/o1/B;->d()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    const/4 p1, 0x0

    .line 31
    if-eqz p3, :cond_2d

    .line 32
    .line 33
    iget-object p2, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 34
    .line 35
    if-eqz p2, :cond_28

    .line 36
    .line 37
    invoke-interface {p2, p1}, Lax/o1/S;->x(Z)V

    .line 38
    .line 39
    .line 40
    goto :goto_2d

    .line 41
    :cond_28
    iget-object p2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Lax/o1/A;->e(Z)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    invoke-direct {p0}, Lax/o1/k;->G2()V

    .line 47
    .line 48
    .line 49
    iput p1, p0, Lax/o1/k;->l2:I

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
.end method

.method protected X2()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method protected Y()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroidx/media3/exoplayer/h;->Y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 5
    .line 6
    if-eqz v0, :cond_e

    .line 7
    .line 8
    iget-boolean v1, p0, Lax/o1/k;->L1:Z

    .line 9
    .line 10
    if-eqz v1, :cond_e

    .line 11
    .line 12
    invoke-interface {v0}, Lax/o1/S;->d()V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected Y2(Lax/f1/D;)Z
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_c

    .line 6
    .line 7
    iget-boolean p1, p1, Lax/f1/D;->k:Z

    .line 8
    .line 9
    if-eqz p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected Z2(Lax/f1/D;)Z
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_20

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 8
    .line 9
    if-nez v0, :cond_20

    .line 10
    .line 11
    iget-object v0, p1, Lax/f1/D;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lax/o1/k;->f2(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_20

    .line 18
    .line 19
    iget-boolean p1, p1, Lax/f1/D;->g:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1e

    .line 22
    .line 23
    iget-object p1, p0, Lax/o1/k;->K1:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p1}, Lax/o1/o;->b(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_20

    .line 30
    .line 31
    :cond_1e
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_20
    const/4 p1, 0x0

    .line 34
    return p1
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

.method protected a0()V
    .registers 5

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_6
    invoke-super {p0}, Lax/f1/L;->a0()V
    :try_end_9
    .catchall {:try_start_6 .. :try_end_9} :catchall_11

    .line 8
    .line 9
    .line 10
    iput-boolean v2, p0, Lax/o1/k;->a2:Z

    .line 11
    .line 12
    iput-wide v0, p0, Lax/o1/k;->z2:J

    .line 13
    .line 14
    invoke-direct {p0}, Lax/o1/k;->M2()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_11
    move-exception v3

    .line 19
    iput-boolean v2, p0, Lax/o1/k;->a2:Z

    .line 20
    .line 21
    iput-wide v0, p0, Lax/o1/k;->z2:J

    .line 22
    .line 23
    invoke-direct {p0}, Lax/o1/k;->M2()V

    .line 24
    .line 25
    .line 26
    throw v3
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
.end method

.method protected a3(Lax/f1/x;IJ)V
    .registers 5

    .line 1
    const-string p3, "skipVideoBuffer"

    .line 2
    .line 3
    invoke-static {p3}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-interface {p1, p2, p3}, Lax/f1/x;->m(IZ)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lax/S0/N;->b()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 14
    .line 15
    iget p2, p1, Lax/Y0/b;->f:I

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    iput p2, p1, Lax/Y0/b;->f:I

    .line 20
    .line 21
    return-void
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
.end method

.method protected b0()V
    .registers 4

    .line 1
    invoke-super {p0}, Lax/f1/L;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/o1/k;->k2:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lax/S0/h;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, p0, Lax/o1/k;->j2:J

    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    iput-wide v1, p0, Lax/o1/k;->p2:J

    .line 20
    .line 21
    iput v0, p0, Lax/o1/k;->q2:I

    .line 22
    .line 23
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 24
    .line 25
    if-eqz v0, :cond_1e

    .line 26
    .line 27
    invoke-interface {v0}, Lax/o1/S;->n()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/o1/A;->h()V

    .line 34
    .line 35
    .line 36
    return-void
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
.end method

.method public c()Z
    .registers 2

    .line 1
    invoke-super {p0}, Lax/f1/L;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 8
    .line 9
    if-eqz v0, :cond_10

    .line 10
    .line 11
    invoke-interface {v0}, Lax/o1/S;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    :cond_10
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method protected c0()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/o1/k;->z2()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/o1/k;->B2()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    invoke-interface {v0}, Lax/o1/S;->l()V

    .line 12
    .line 13
    .line 14
    goto :goto_13

    .line 15
    :cond_e
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o1/A;->i()V

    .line 18
    .line 19
    .line 20
    :goto_13
    iget-object v0, p0, Lax/o1/k;->T1:Lax/o1/B;

    .line 21
    .line 22
    if-eqz v0, :cond_1a

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/o1/B;->d()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    invoke-super {p0}, Lax/f1/L;->c0()V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method protected d0([Lax/P0/v;JJLax/i1/F$b;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p6}, Lax/f1/L;->d0([Lax/P0/v;JJLax/i1/F$b;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-direct {p0, p6}, Lax/o1/k;->f3(Lax/i1/F$b;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p1, Lax/o1/k;->T1:Lax/o1/B;

    .line 9
    .line 10
    if-eqz p2, :cond_e

    .line 11
    .line 12
    invoke-virtual {p2}, Lax/o1/B;->d()V

    .line 13
    .line 14
    .line 15
    :cond_e
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

.method protected d3(II)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 2
    .line 3
    iget v1, v0, Lax/Y0/b;->h:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    iput v1, v0, Lax/Y0/b;->h:I

    .line 7
    .line 8
    add-int/2addr p1, p2

    .line 9
    iget p2, v0, Lax/Y0/b;->g:I

    .line 10
    .line 11
    add-int/2addr p2, p1

    .line 12
    iput p2, v0, Lax/Y0/b;->g:I

    .line 13
    .line 14
    iget p2, p0, Lax/o1/k;->k2:I

    .line 15
    .line 16
    add-int/2addr p2, p1

    .line 17
    iput p2, p0, Lax/o1/k;->k2:I

    .line 18
    .line 19
    iget p2, p0, Lax/o1/k;->l2:I

    .line 20
    .line 21
    add-int/2addr p2, p1

    .line 22
    iput p2, p0, Lax/o1/k;->l2:I

    .line 23
    .line 24
    iget p1, v0, Lax/Y0/b;->i:I

    .line 25
    .line 26
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, v0, Lax/Y0/b;->i:I

    .line 31
    .line 32
    iget p1, p0, Lax/o1/k;->N1:I

    .line 33
    .line 34
    if-lez p1, :cond_2a

    .line 35
    .line 36
    iget p2, p0, Lax/o1/k;->k2:I

    .line 37
    .line 38
    if-lt p2, p1, :cond_2a

    .line 39
    .line 40
    invoke-direct {p0}, Lax/o1/k;->z2()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-void
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
.end method

.method protected e2(Lax/o1/S;ILax/P0/v;I)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/o1/k;->c2:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    :goto_4
    move-object v7, v0

    .line 6
    goto :goto_b

    .line 7
    :cond_6
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_4

    .line 12
    :goto_b
    invoke-virtual {p0}, Lax/f1/L;->Q0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move v6, p4

    .line 20
    invoke-interface/range {v1 .. v7}, Lax/o1/S;->r(ILax/P0/v;JILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method protected f2(Ljava/lang/String;)Z
    .registers 3

    .line 1
    const-string v0, "OMX.google"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    const-class p1, Lax/o1/k;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_d
    sget-boolean v0, Lax/o1/k;->E2:Z

    .line 15
    .line 16
    if-nez v0, :cond_1d

    .line 17
    .line 18
    invoke-static {}, Lax/o1/k;->l2()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput-boolean v0, Lax/o1/k;->F2:Z

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lax/o1/k;->E2:Z

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :catchall_1b
    move-exception v0

    .line 29
    goto :goto_21

    .line 30
    :cond_1d
    :goto_1d
    monitor-exit p1
    :try_end_1e
    .catchall {:try_start_d .. :try_end_1e} :catchall_1b

    .line 31
    sget-boolean p1, Lax/o1/k;->F2:Z

    .line 32
    .line 33
    return p1

    .line 34
    :goto_21
    :try_start_21
    monitor-exit p1
    :try_end_22
    .catchall {:try_start_21 .. :try_end_22} :catchall_1b

    .line 35
    throw v0
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

.method public g(JJJZZ)Z
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/o1/k;->L1:Z

    .line 6
    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/o1/k;->m2()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sub-long/2addr p3, v0

    .line 14
    :cond_d
    move-object v0, p0

    .line 15
    move-wide v1, p1

    .line 16
    move-wide v3, p5

    .line 17
    move v5, p7

    .line 18
    invoke-virtual/range {v0 .. v5}, Lax/o1/k;->U2(JJZ)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1f

    .line 23
    .line 24
    invoke-virtual {p0, p3, p4, p8}, Lax/o1/k;->y2(JZ)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1f

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1f
    const/4 p1, 0x0

    .line 33
    return p1
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
.end method

.method protected g1(Lax/P0/v;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-interface {v0}, Lax/o1/S;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_19

    .line 10
    .line 11
    :try_start_a
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lax/o1/S;->z(Lax/P0/v;)Z

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_10
    .catch Lax/o1/S$c; {:try_start_a .. :try_end_10} :catch_11

    .line 17
    return p1

    .line 18
    :catch_11
    move-exception v0

    .line 19
    const/16 v1, 0x1b58

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v1}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    throw p1

    .line 26
    :cond_19
    const/4 p1, 0x1

    .line 27
    return p1
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

.method protected g3(J)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/Y0/b;->a(J)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lax/o1/k;->p2:J

    .line 7
    .line 8
    add-long/2addr v0, p1

    .line 9
    iput-wide v0, p0, Lax/o1/k;->p2:J

    .line 10
    .line 11
    iget p1, p0, Lax/o1/k;->q2:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    iput p1, p0, Lax/o1/k;->q2:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public getName()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "MediaCodecVideoRenderer"

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

.method protected h1(Ljava/lang/Exception;)V
    .registers 4

    .line 1
    const-string v0, "MediaCodecVideoRenderer"

    .line 2
    .line 3
    const-string v1, "Video codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lax/o1/P$a;->s(Ljava/lang/Exception;)V

    .line 11
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
    .line 22
.end method

.method protected h2(Landroid/content/Context;Lax/o1/A;)Lax/o1/s;
    .registers 4

    .line 1
    new-instance v0, Lax/o1/s$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/o1/s$b;-><init>(Landroid/content/Context;Lax/o1/A;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {v0, p1}, Lax/o1/s$b;->h(Z)Lax/o1/s$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Lax/o1/s$b;->g(Lax/S0/h;)Lax/o1/s$b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lax/o1/s$b;->f()Lax/o1/s;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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

.method public i(JJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    :try_start_4
    invoke-interface {v0, p1, p2, p3, p4}, Lax/o1/S;->i(JJ)V
    :try_end_7
    .catch Lax/o1/S$c; {:try_start_4 .. :try_end_7} :catch_8

    .line 6
    .line 7
    .line 8
    goto :goto_12

    .line 9
    :catch_8
    move-exception p1

    .line 10
    iget-object p2, p1, Lax/o1/S$c;->q:Lax/P0/v;

    .line 11
    .line 12
    const/16 p3, 0x1b59

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    throw p1

    .line 19
    :cond_12
    :goto_12
    invoke-super {p0, p1, p2, p3, p4}, Lax/f1/L;->i(JJ)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method protected i1(Ljava/lang/String;Lax/f1/x$a;JJ)V
    .registers 7

    .line 1
    move-object p2, p1

    .line 2
    iget-object p1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 3
    .line 4
    invoke-virtual/range {p1 .. p6}, Lax/o1/P$a;->k(Ljava/lang/String;JJ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lax/o1/k;->f2(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput-boolean p1, p0, Lax/o1/k;->X1:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lax/f1/D;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/f1/D;->r()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, Lax/o1/k;->Y1:Z

    .line 28
    .line 29
    invoke-direct {p0}, Lax/o1/k;->G2()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method protected i2(Lax/f1/x;)V
    .registers 2

    .line 1
    invoke-interface {p1}, Lax/f1/x;->g()V

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
    .line 22
.end method

.method public isReady()Z
    .registers 3

    .line 1
    invoke-super {p0}, Lax/f1/L;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 6
    .line 7
    if-eqz v1, :cond_d

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lax/o1/S;->y(Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    if-eqz v0, :cond_1b

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_19

    .line 21
    .line 22
    iget-boolean v1, p0, Lax/o1/k;->v2:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1b

    .line 25
    .line 26
    :cond_19
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_1b
    iget-object v1, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lax/o1/A;->d(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0
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
.end method

.method protected j1(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/P$a;->l(Ljava/lang/String;)V

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

.method protected k1(Lax/Y0/O;)Lax/Y0/c;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lax/f1/L;->k1(Lax/Y0/O;)Lax/Y0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/o1/k;->M1:Lax/o1/P$a;

    .line 6
    .line 7
    iget-object p1, p1, Lax/Y0/O;->b:Lax/P0/v;

    .line 8
    .line 9
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lax/P0/v;

    .line 14
    .line 15
    invoke-virtual {v1, p1, v0}, Lax/o1/P$a;->p(Lax/P0/v;Lax/Y0/c;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lax/o1/k;->T1:Lax/o1/B;

    .line 19
    .line 20
    if-eqz p1, :cond_18

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/o1/B;->d()V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-object v0
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

.method protected k2(Lax/f1/x;IJ)V
    .registers 5

    .line 1
    const-string p3, "dropVideoBuffer"

    .line 2
    .line 3
    invoke-static {p3}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-interface {p1, p2, p3}, Lax/f1/x;->m(IZ)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lax/S0/N;->b()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p3, p1}, Lax/o1/k;->d3(II)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method protected l0(Lax/f1/D;Lax/P0/v;Lax/P0/v;)Lax/Y0/c;
    .registers 12

    .line 1
    invoke-virtual {p1, p2, p3}, Lax/f1/D;->e(Lax/P0/v;Lax/P0/v;)Lax/Y0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lax/Y0/c;->e:I

    .line 6
    .line 7
    iget-object v2, p0, Lax/o1/k;->W1:Lax/o1/k$e;

    .line 8
    .line 9
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lax/o1/k$e;

    .line 14
    .line 15
    iget v3, p3, Lax/P0/v;->v:I

    .line 16
    .line 17
    iget v4, v2, Lax/o1/k$e;->a:I

    .line 18
    .line 19
    if-gt v3, v4, :cond_1a

    .line 20
    .line 21
    iget v3, p3, Lax/P0/v;->w:I

    .line 22
    .line 23
    iget v4, v2, Lax/o1/k$e;->b:I

    .line 24
    .line 25
    if-le v3, v4, :cond_1c

    .line 26
    .line 27
    :cond_1a
    or-int/lit16 v1, v1, 0x100

    .line 28
    .line 29
    :cond_1c
    invoke-static {p1, p3}, Lax/o1/k;->r2(Lax/f1/D;Lax/P0/v;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget v2, v2, Lax/o1/k$e;->c:I

    .line 34
    .line 35
    if-le v3, v2, :cond_26

    .line 36
    .line 37
    or-int/lit8 v1, v1, 0x40

    .line 38
    .line 39
    :cond_26
    move v7, v1

    .line 40
    new-instance v2, Lax/Y0/c;

    .line 41
    .line 42
    iget-object v3, p1, Lax/f1/D;->a:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v7, :cond_32

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    :goto_2f
    move-object v4, p2

    .line 49
    move-object v5, p3

    .line 50
    goto :goto_36

    .line 51
    :cond_32
    iget p1, v0, Lax/Y0/c;->d:I

    .line 52
    .line 53
    move v6, p1

    .line 54
    goto :goto_2f

    .line 55
    :goto_36
    invoke-direct/range {v2 .. v7}, Lax/Y0/c;-><init>(Ljava/lang/String;Lax/P0/v;Lax/P0/v;II)V

    .line 56
    .line 57
    .line 58
    return-object v2
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

.method protected l1(Lax/P0/v;Landroid/media/MediaFormat;)V
    .registers 11

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->E0()Lax/f1/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iget v1, p0, Lax/o1/k;->h2:I

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lax/f1/x;->n(I)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    iget p2, p1, Lax/P0/v;->v:I

    .line 19
    .line 20
    iget v0, p1, Lax/P0/v;->w:I

    .line 21
    .line 22
    goto :goto_66

    .line 23
    :cond_16
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string v0, "crop-right"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "crop-top"

    .line 33
    .line 34
    const-string v5, "crop-bottom"

    .line 35
    .line 36
    const-string v6, "crop-left"

    .line 37
    .line 38
    if-eqz v3, :cond_3b

    .line 39
    .line 40
    invoke-virtual {p2, v6}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3b

    .line 45
    .line 46
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3b

    .line 51
    .line 52
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3b

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    goto :goto_3c

    .line 60
    :cond_3b
    const/4 v3, 0x0

    .line 61
    :goto_3c
    if-eqz v3, :cond_49

    .line 62
    .line 63
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p2, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    sub-int/2addr v0, v6

    .line 72
    add-int/2addr v0, v2

    .line 73
    goto :goto_4f

    .line 74
    :cond_49
    const-string v0, "width"

    .line 75
    .line 76
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :goto_4f
    if-eqz v3, :cond_5d

    .line 81
    .line 82
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    sub-int/2addr v3, p2

    .line 91
    add-int/2addr v3, v2

    .line 92
    move p2, v3

    .line 93
    goto :goto_63

    .line 94
    :cond_5d
    const-string v3, "height"

    .line 95
    .line 96
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    :goto_63
    move v7, v0

    .line 101
    move v0, p2

    .line 102
    move p2, v7

    .line 103
    :goto_66
    iget v3, p1, Lax/P0/v;->B:F

    .line 104
    .line 105
    iget v4, p1, Lax/P0/v;->A:I

    .line 106
    .line 107
    const/16 v5, 0x5a

    .line 108
    .line 109
    if-eq v4, v5, :cond_72

    .line 110
    .line 111
    const/16 v5, 0x10e

    .line 112
    .line 113
    if-ne v4, v5, :cond_79

    .line 114
    .line 115
    :cond_72
    const/high16 v4, 0x3f800000    # 1.0f

    .line 116
    .line 117
    div-float v3, v4, v3

    .line 118
    .line 119
    move v7, v0

    .line 120
    move v0, p2

    .line 121
    move p2, v7

    .line 122
    :cond_79
    new-instance v4, Lax/P0/a0;

    .line 123
    .line 124
    invoke-direct {v4, p2, v0, v3}, Lax/P0/a0;-><init>(IIF)V

    .line 125
    .line 126
    .line 127
    iput-object v4, p0, Lax/o1/k;->s2:Lax/P0/a0;

    .line 128
    .line 129
    iget-object v4, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 130
    .line 131
    if-eqz v4, :cond_a5

    .line 132
    .line 133
    iget-boolean v5, p0, Lax/o1/k;->B2:Z

    .line 134
    .line 135
    if-eqz v5, :cond_a5

    .line 136
    .line 137
    invoke-virtual {p1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1, p2}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1, v0}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1, v3}, Lax/P0/v$b;->u0(F)Lax/P0/v$b;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget p2, p0, Lax/o1/k;->b2:I

    .line 158
    .line 159
    invoke-virtual {p0, v4, v2, p1, p2}, Lax/o1/k;->e2(Lax/o1/S;ILax/P0/v;I)V

    .line 160
    .line 161
    .line 162
    const/4 p1, 0x2

    .line 163
    iput p1, p0, Lax/o1/k;->b2:I

    .line 164
    .line 165
    goto :goto_ac

    .line 166
    :cond_a5
    iget-object p2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 167
    .line 168
    iget p1, p1, Lax/P0/v;->z:F

    .line 169
    .line 170
    invoke-virtual {p2, p1}, Lax/o1/A;->n(F)V

    .line 171
    .line 172
    .line 173
    :goto_ac
    iput-boolean v1, p0, Lax/o1/k;->B2:Z

    .line 174
    .line 175
    return-void
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

.method protected m2()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/o1/k;->z2:J

    .line 2
    .line 3
    neg-long v0, v0

    .line 4
    return-wide v0
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

.method protected n1(J)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/f1/L;->n1(J)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lax/o1/k;->v2:Z

    .line 5
    .line 6
    if-nez p1, :cond_d

    .line 7
    .line 8
    iget p1, p0, Lax/o1/k;->m2:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Lax/o1/k;->m2:I

    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected o1()V
    .registers 6

    .line 1
    invoke-super {p0}, Lax/f1/L;->o1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 5
    .line 6
    if-eqz v0, :cond_25

    .line 7
    .line 8
    invoke-interface {v0}, Lax/o1/S;->q()V

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, Lax/o1/k;->z2:J

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v4, v0, v2

    .line 19
    .line 20
    if-nez v4, :cond_1b

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/f1/L;->Q0()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, Lax/o1/k;->z2:J

    .line 27
    .line 28
    :cond_1b
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/o1/k;->m2()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-interface {v0, v1, v2}, Lax/o1/S;->o(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_2b

    .line 38
    :cond_25
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-virtual {v0, v1}, Lax/o1/A;->j(I)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lax/o1/k;->B2:Z

    .line 46
    .line 47
    invoke-direct {p0}, Lax/o1/k;->G2()V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public p()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_14

    .line 4
    .line 5
    iget v1, p0, Lax/o1/k;->b2:I

    .line 6
    .line 7
    if-eqz v1, :cond_10

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_c

    .line 11
    .line 12
    goto :goto_10

    .line 13
    :cond_c
    invoke-interface {v0}, Lax/o1/S;->A()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    :goto_10
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lax/o1/k;->b2:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-object v0, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/o1/A;->a()V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method protected p1(Lax/V0/i;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o1/k;->R1:Lax/o1/a;

    .line 2
    .line 3
    if-eqz v0, :cond_21

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lax/f1/D;

    .line 14
    .line 15
    iget-object v0, v0, Lax/f1/D;->b:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "video/av01"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_21

    .line 24
    .line 25
    iget-object v0, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    if-eqz v0, :cond_21

    .line 28
    .line 29
    iget-object v1, p0, Lax/o1/k;->R1:Lax/o1/a;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lax/o1/a;->b(Ljava/nio/ByteBuffer;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    const/4 v0, 0x0

    .line 35
    iput v0, p0, Lax/o1/k;->C2:I

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lax/o1/k;->F0(Lax/V0/i;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v2, 0x22

    .line 44
    .line 45
    if-lt v1, v2, :cond_32

    .line 46
    .line 47
    and-int/lit8 v0, v0, 0x20

    .line 48
    .line 49
    if-nez v0, :cond_3c

    .line 50
    .line 51
    :cond_32
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 52
    .line 53
    if-nez v0, :cond_3c

    .line 54
    .line 55
    iget v0, p0, Lax/o1/k;->m2:I

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    iput v0, p0, Lax/o1/k;->m2:I

    .line 60
    .line 61
    :cond_3c
    const/16 v0, 0x17

    .line 62
    .line 63
    if-ge v1, v0, :cond_49

    .line 64
    .line 65
    iget-boolean v0, p0, Lax/o1/k;->v2:Z

    .line 66
    .line 67
    if-eqz v0, :cond_49

    .line 68
    .line 69
    iget-wide v0, p1, Lax/V0/i;->g0:J

    .line 70
    .line 71
    invoke-virtual {p0, v0, v1}, Lax/o1/k;->J2(J)V

    .line 72
    .line 73
    .line 74
    :cond_49
    return-void
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

.method protected p2(Lax/f1/D;Lax/P0/v;[Lax/P0/v;)Lax/o1/k$e;
    .registers 16

    .line 1
    iget v0, p2, Lax/P0/v;->v:I

    .line 2
    .line 3
    iget v1, p2, Lax/P0/v;->w:I

    .line 4
    .line 5
    invoke-static {p1, p2}, Lax/o1/k;->r2(Lax/f1/D;Lax/P0/v;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    array-length v3, p3

    .line 10
    const/4 v4, -0x1

    .line 11
    const/4 v5, 0x1

    .line 12
    if-ne v3, v5, :cond_25

    .line 13
    .line 14
    if-eq v2, v4, :cond_1f

    .line 15
    .line 16
    invoke-static {p1, p2}, Lax/o1/k;->n2(Lax/f1/D;Lax/P0/v;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eq p1, v4, :cond_1f

    .line 21
    .line 22
    int-to-float p2, v2

    .line 23
    const/high16 p3, 0x3fc00000    # 1.5f

    .line 24
    .line 25
    mul-float p2, p2, p3

    .line 26
    .line 27
    float-to-int p2, p2

    .line 28
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :cond_1f
    new-instance p1, Lax/o1/k$e;

    .line 33
    .line 34
    invoke-direct {p1, v0, v1, v2}, Lax/o1/k$e;-><init>(III)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_25
    array-length v3, p3

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    :goto_29
    if-ge v7, v3, :cond_6d

    .line 43
    .line 44
    aget-object v9, p3, v7

    .line 45
    .line 46
    iget-object v10, p2, Lax/P0/v;->E:Lax/P0/j;

    .line 47
    .line 48
    if-eqz v10, :cond_43

    .line 49
    .line 50
    iget-object v10, v9, Lax/P0/v;->E:Lax/P0/j;

    .line 51
    .line 52
    if-nez v10, :cond_43

    .line 53
    .line 54
    invoke-virtual {v9}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    iget-object v10, p2, Lax/P0/v;->E:Lax/P0/j;

    .line 59
    .line 60
    invoke-virtual {v9, v10}, Lax/P0/v$b;->V(Lax/P0/j;)Lax/P0/v$b;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    :cond_43
    invoke-virtual {p1, p2, v9}, Lax/f1/D;->e(Lax/P0/v;Lax/P0/v;)Lax/Y0/c;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    iget v10, v10, Lax/Y0/c;->d:I

    .line 73
    .line 74
    if-eqz v10, :cond_6a

    .line 75
    .line 76
    iget v10, v9, Lax/P0/v;->v:I

    .line 77
    .line 78
    if-eq v10, v4, :cond_56

    .line 79
    .line 80
    iget v11, v9, Lax/P0/v;->w:I

    .line 81
    .line 82
    if-ne v11, v4, :cond_54

    .line 83
    .line 84
    goto :goto_56

    .line 85
    :cond_54
    const/4 v11, 0x0

    .line 86
    goto :goto_57

    .line 87
    :cond_56
    :goto_56
    const/4 v11, 0x1

    .line 88
    :goto_57
    or-int/2addr v8, v11

    .line 89
    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget v10, v9, Lax/P0/v;->w:I

    .line 94
    .line 95
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {p1, v9}, Lax/o1/k;->r2(Lax/f1/D;Lax/P0/v;)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-static {v2, v9}, Ljava/lang/Math;->max(II)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    :cond_6a
    add-int/lit8 v7, v7, 0x1

    .line 108
    .line 109
    goto :goto_29

    .line 110
    :cond_6d
    if-eqz v8, :cond_d1

    .line 111
    .line 112
    new-instance p3, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v3, "Resolutions unknown. Codec max resolution: "

    .line 118
    .line 119
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v3, "x"

    .line 126
    .line 127
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    const-string v4, "MediaCodecVideoRenderer"

    .line 138
    .line 139
    invoke-static {v4, p3}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1, p2}, Lax/o1/k;->o2(Lax/f1/D;Lax/P0/v;)Landroid/graphics/Point;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    if-eqz p3, :cond_d1

    .line 147
    .line 148
    iget v5, p3, Landroid/graphics/Point;->x:I

    .line 149
    .line 150
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 155
    .line 156
    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {p2}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p2, v0}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {p2, v1}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p2}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-static {p1, p2}, Lax/o1/k;->n2(Lax/f1/D;Lax/P0/v;)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    new-instance p1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string p2, "Codec max resolution adjusted to: "

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {v4, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :cond_d1
    new-instance p1, Lax/o1/k$e;

    .line 211
    .line 212
    invoke-direct {p1, v0, v1, v2}, Lax/o1/k$e;-><init>(III)V

    .line 213
    .line 214
    .line 215
    return-object p1
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

.method protected r0(Ljava/lang/Throwable;Lax/f1/D;)Lax/f1/B;
    .registers 5

    .line 1
    new-instance v0, Lax/o1/j;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o1/k;->d2:Landroid/view/Surface;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, Lax/o1/j;-><init>(Ljava/lang/Throwable;Lax/f1/D;Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method protected s1(JJLax/f1/x;Ljava/nio/ByteBuffer;IIIJZZLax/P0/v;)Z
    .registers 33
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    move/from16 v3, p7

    .line 6
    .line 7
    move-wide/from16 v6, p10

    .line 8
    .line 9
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lax/f1/L;->P0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    sub-long v4, v6, v4

    .line 17
    .line 18
    invoke-direct {v1, v6, v7}, Lax/o1/k;->e3(J)V

    .line 19
    .line 20
    .line 21
    iget-object v8, v1, Lax/o1/k;->Z1:Lax/o1/S;

    .line 22
    .line 23
    const/4 v12, 0x1

    .line 24
    if-eqz v8, :cond_2c

    .line 25
    .line 26
    if-eqz p12, :cond_21

    .line 27
    .line 28
    if-nez p13, :cond_21

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3, v4, v5}, Lax/o1/k;->a3(Lax/f1/x;IJ)V

    .line 31
    .line 32
    .line 33
    return v12

    .line 34
    :cond_21
    new-instance v0, Lax/o1/k$b;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v5}, Lax/o1/k$b;-><init>(Lax/o1/k;Lax/f1/x;IJ)V

    .line 37
    .line 38
    .line 39
    move-object v13, v1

    .line 40
    invoke-interface {v8, v6, v7, v0}, Lax/o1/S;->k(JLax/o1/S$b;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_2c
    move-object v13, v1

    .line 46
    move-object v14, v2

    .line 47
    move v15, v3

    .line 48
    iget-object v0, v13, Lax/o1/k;->P1:Lax/o1/A;

    .line 49
    .line 50
    invoke-virtual {v13}, Lax/f1/L;->Q0()J

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    iget-object v11, v13, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 55
    .line 56
    move-wide/from16 v1, p10

    .line 57
    .line 58
    move/from16 v9, p12

    .line 59
    .line 60
    move/from16 v10, p13

    .line 61
    .line 62
    move-wide/from16 v16, v4

    .line 63
    .line 64
    move-wide/from16 v3, p1

    .line 65
    .line 66
    move-wide/from16 v5, p3

    .line 67
    .line 68
    invoke-virtual/range {v0 .. v11}, Lax/o1/A;->c(JJJJZZLax/o1/A$a;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v3, v13, Lax/o1/k;->T1:Lax/o1/B;

    .line 73
    .line 74
    const/4 v4, 0x4

    .line 75
    const/4 v5, 0x5

    .line 76
    if-eqz v3, :cond_5a

    .line 77
    .line 78
    if-eq v0, v5, :cond_5a

    .line 79
    .line 80
    if-eq v0, v4, :cond_5a

    .line 81
    .line 82
    iget-object v6, v13, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 83
    .line 84
    invoke-virtual {v6}, Lax/o1/A$a;->f()J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    invoke-virtual {v3, v1, v2, v6, v7}, Lax/o1/B;->b(JJ)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    if-eqz v0, :cond_a9

    .line 92
    .line 93
    if-eq v0, v12, :cond_93

    .line 94
    .line 95
    const/4 v1, 0x2

    .line 96
    if-eq v0, v1, :cond_84

    .line 97
    .line 98
    const/4 v1, 0x3

    .line 99
    if-eq v0, v1, :cond_75

    .line 100
    .line 101
    if-eq v0, v4, :cond_73

    .line 102
    .line 103
    if-ne v0, v5, :cond_69

    .line 104
    .line 105
    goto :goto_73

    .line 106
    :cond_69
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_73
    :goto_73
    const/4 v0, 0x0

    .line 117
    return v0

    .line 118
    :cond_75
    move-wide/from16 v4, v16

    .line 119
    .line 120
    invoke-virtual {v13, v14, v15, v4, v5}, Lax/o1/k;->a3(Lax/f1/x;IJ)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v13, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 124
    .line 125
    invoke-virtual {v0}, Lax/o1/A$a;->f()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-virtual {v13, v0, v1}, Lax/o1/k;->g3(J)V

    .line 130
    .line 131
    .line 132
    return v12

    .line 133
    :cond_84
    move-wide/from16 v4, v16

    .line 134
    .line 135
    invoke-virtual {v13, v14, v15, v4, v5}, Lax/o1/k;->k2(Lax/f1/x;IJ)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v13, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 139
    .line 140
    invoke-virtual {v0}, Lax/o1/A$a;->f()J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    invoke-virtual {v13, v0, v1}, Lax/o1/k;->g3(J)V

    .line 145
    .line 146
    .line 147
    return v12

    .line 148
    :cond_93
    move-wide/from16 v4, v16

    .line 149
    .line 150
    invoke-static {v14}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lax/f1/x;

    .line 155
    .line 156
    move-object/from16 p6, p14

    .line 157
    .line 158
    move-object/from16 p2, v0

    .line 159
    .line 160
    move-wide/from16 p4, v4

    .line 161
    .line 162
    move-object/from16 p1, v13

    .line 163
    .line 164
    move/from16 p3, v15

    .line 165
    .line 166
    invoke-direct/range {p1 .. p6}, Lax/o1/k;->L2(Lax/f1/x;IJLax/P0/v;)V

    .line 167
    .line 168
    .line 169
    return v12

    .line 170
    :cond_a9
    move-wide/from16 v4, v16

    .line 171
    .line 172
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {v0}, Lax/S0/h;->nanoTime()J

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    move-object/from16 p8, p0

    .line 181
    .line 182
    move-object/from16 p13, p14

    .line 183
    .line 184
    move-wide/from16 p11, v0

    .line 185
    .line 186
    move-wide/from16 p9, v4

    .line 187
    .line 188
    invoke-direct/range {p8 .. p13}, Lax/o1/k;->H2(JJLax/P0/v;)V

    .line 189
    .line 190
    .line 191
    move-wide/from16 p13, p11

    .line 192
    .line 193
    move-wide/from16 p11, p9

    .line 194
    .line 195
    move-object/from16 p9, v14

    .line 196
    .line 197
    move/from16 p10, p7

    .line 198
    .line 199
    invoke-direct/range {p8 .. p14}, Lax/o1/k;->N2(Lax/f1/x;IJJ)V

    .line 200
    .line 201
    .line 202
    move-object/from16 v1, p8

    .line 203
    .line 204
    iget-object v0, v1, Lax/o1/k;->Q1:Lax/o1/A$a;

    .line 205
    .line 206
    invoke-virtual {v0}, Lax/o1/A$a;->f()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    invoke-virtual {v1, v2, v3}, Lax/o1/k;->g3(J)V

    .line 211
    .line 212
    .line 213
    return v12
.end method

.method protected t2(Lax/P0/v;Ljava/lang/String;Lax/o1/k$e;FZI)Landroid/media/MediaFormat;
    .registers 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/media/MediaFormat;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "mime"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget p2, p1, Lax/P0/v;->v:I

    .line 12
    .line 13
    const-string v1, "width"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string p2, "height"

    .line 19
    .line 20
    iget v1, p1, Lax/P0/v;->w:I

    .line 21
    .line 22
    invoke-virtual {v0, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p1, Lax/P0/v;->r:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v0, p2}, Lax/S0/x;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    const-string p2, "frame-rate"

    .line 31
    .line 32
    iget v1, p1, Lax/P0/v;->z:F

    .line 33
    .line 34
    invoke-static {v0, p2, v1}, Lax/S0/x;->c(Landroid/media/MediaFormat;Ljava/lang/String;F)V

    .line 35
    .line 36
    .line 37
    const-string p2, "rotation-degrees"

    .line 38
    .line 39
    iget v1, p1, Lax/P0/v;->A:I

    .line 40
    .line 41
    invoke-static {v0, p2, v1}, Lax/S0/x;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p1, Lax/P0/v;->E:Lax/P0/j;

    .line 45
    .line 46
    invoke-static {v0, p2}, Lax/S0/x;->b(Landroid/media/MediaFormat;Lax/P0/j;)V

    .line 47
    .line 48
    .line 49
    const-string p2, "video/dolby-vision"

    .line 50
    .line 51
    iget-object v1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_4d

    .line 58
    .line 59
    invoke-static {p1}, Lax/f1/a0;->j(Lax/P0/v;)Landroid/util/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_4d

    .line 64
    .line 65
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const-string p2, "profile"

    .line 74
    .line 75
    invoke-static {v0, p2, p1}, Lax/S0/x;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    :cond_4d
    iget p1, p3, Lax/o1/k$e;->a:I

    .line 79
    .line 80
    const-string p2, "max-width"

    .line 81
    .line 82
    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    const-string p1, "max-height"

    .line 86
    .line 87
    iget p2, p3, Lax/o1/k$e;->b:I

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    const-string p1, "max-input-size"

    .line 93
    .line 94
    iget p2, p3, Lax/o1/k$e;->c:I

    .line 95
    .line 96
    invoke-static {v0, p1, p2}, Lax/S0/x;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 p2, 0x17

    .line 102
    .line 103
    const/4 p3, 0x0

    .line 104
    if-lt p1, p2, :cond_79

    .line 105
    .line 106
    const-string p2, "priority"

    .line 107
    .line 108
    invoke-virtual {v0, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    const/high16 p2, -0x40800000    # -1.0f

    .line 112
    .line 113
    cmpl-float p2, p4, p2

    .line 114
    .line 115
    if-eqz p2, :cond_79

    .line 116
    .line 117
    const-string p2, "operating-rate"

    .line 118
    .line 119
    invoke-virtual {v0, p2, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 120
    .line 121
    .line 122
    :cond_79
    const/4 p2, 0x1

    .line 123
    if-eqz p5, :cond_86

    .line 124
    .line 125
    const-string p4, "no-post-process"

    .line 126
    .line 127
    invoke-virtual {v0, p4, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    const-string p4, "auto-frc"

    .line 131
    .line 132
    invoke-virtual {v0, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    :cond_86
    if-eqz p6, :cond_92

    .line 136
    .line 137
    const-string p4, "tunneled-playback"

    .line 138
    .line 139
    invoke-virtual {v0, p4, p2}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    const-string p2, "audio-session-id"

    .line 143
    .line 144
    invoke-virtual {v0, p2, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    :cond_92
    const/16 p2, 0x23

    .line 148
    .line 149
    if-lt p1, p2, :cond_a2

    .line 150
    .line 151
    iget p1, p0, Lax/o1/k;->u2:I

    .line 152
    .line 153
    neg-int p1, p1

    .line 154
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    const-string p2, "importance"

    .line 159
    .line 160
    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    :cond_a2
    return-object v0
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
.end method

.method public x(FF)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lax/f1/L;->x(FF)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 5
    .line 6
    if-eqz p2, :cond_b

    .line 7
    .line 8
    invoke-interface {p2, p1}, Lax/o1/S;->g(F)V

    .line 9
    .line 10
    .line 11
    goto :goto_10

    .line 12
    :cond_b
    iget-object p2, p0, Lax/o1/k;->P1:Lax/o1/A;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lax/o1/A;->p(F)V

    .line 15
    .line 16
    .line 17
    :goto_10
    iget-object p2, p0, Lax/o1/k;->T1:Lax/o1/B;

    .line 18
    .line 19
    if-eqz p2, :cond_17

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lax/o1/B;->e(F)V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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

.method protected x1()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lax/o1/S;->q()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public y(JJZ)Z
    .registers 6

    .line 1
    invoke-virtual/range {p0 .. p5}, Lax/o1/k;->V2(JJZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method protected y2(JZ)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/h;->h0(J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return p2

    .line 9
    :cond_8
    const/4 v0, 0x1

    .line 10
    if-eqz p3, :cond_23

    .line 11
    .line 12
    iget-object p3, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 13
    .line 14
    iget v1, p3, Lax/Y0/b;->d:I

    .line 15
    .line 16
    add-int/2addr v1, p1

    .line 17
    iput v1, p3, Lax/Y0/b;->d:I

    .line 18
    .line 19
    iget p1, p3, Lax/Y0/b;->f:I

    .line 20
    .line 21
    iget v2, p0, Lax/o1/k;->m2:I

    .line 22
    .line 23
    add-int/2addr p1, v2

    .line 24
    iput p1, p3, Lax/Y0/b;->f:I

    .line 25
    .line 26
    iget-object p1, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    add-int/2addr v1, p1

    .line 33
    iput v1, p3, Lax/Y0/b;->d:I

    .line 34
    .line 35
    goto :goto_36

    .line 36
    :cond_23
    iget-object p3, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 37
    .line 38
    iget v1, p3, Lax/Y0/b;->j:I

    .line 39
    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p3, Lax/Y0/b;->j:I

    .line 42
    .line 43
    iget-object p3, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/util/PriorityQueue;->size()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    add-int/2addr p1, p3

    .line 50
    iget p3, p0, Lax/o1/k;->m2:I

    .line 51
    .line 52
    invoke-virtual {p0, p1, p3}, Lax/o1/k;->d3(II)V

    .line 53
    .line 54
    .line 55
    :goto_36
    invoke-virtual {p0}, Lax/f1/L;->B0()Z

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/o1/k;->Z1:Lax/o1/S;

    .line 59
    .line 60
    if-eqz p1, :cond_40

    .line 61
    .line 62
    invoke-interface {p1, p2}, Lax/o1/S;->v(Z)V

    .line 63
    .line 64
    .line 65
    :cond_40
    return v0
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
.end method

.method protected z1()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/f1/L;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/o1/k;->U1:Ljava/util/PriorityQueue;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lax/o1/k;->m2:I

    .line 11
    .line 12
    iput v0, p0, Lax/o1/k;->C2:I

    .line 13
    .line 14
    iput-boolean v0, p0, Lax/o1/k;->o2:Z

    .line 15
    .line 16
    iget-object v0, p0, Lax/o1/k;->R1:Lax/o1/a;

    .line 17
    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/o1/a;->c()V

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
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
.end method
