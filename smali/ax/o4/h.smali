.class Lax/o4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/h$g;,
        Lax/o4/h$b;,
        Lax/o4/h$c;,
        Lax/o4/h$d;,
        Lax/o4/h$i;,
        Lax/o4/h$k;,
        Lax/o4/h$e;,
        Lax/o4/h$j;,
        Lax/o4/h$f;,
        Lax/o4/h$h;
    }
.end annotation


# static fields
.field private static i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Landroid/graphics/Canvas;

.field private b:F

.field private c:Lax/o4/g;

.field private d:Lax/o4/h$h;

.field private e:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lax/o4/h$h;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lax/o4/g$J;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lax/o4/b$q;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    .line 1
    return-void
    .line 2
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

.method constructor <init>(Landroid/graphics/Canvas;F)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/o4/h;->h:Lax/o4/b$q;

    .line 6
    .line 7
    iput-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 8
    .line 9
    iput p2, p0, Lax/o4/h;->b:F

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

.method private A()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private A0(Lax/o4/g$N;)V
    .registers 3

    .line 1
    instance-of v0, p1, Lax/o4/g$t;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lax/o4/h;->u(Lax/o4/g$N;)V

    .line 10
    .line 11
    .line 12
    instance-of v0, p1, Lax/o4/g$F;

    .line 13
    .line 14
    if-eqz v0, :cond_16

    .line 15
    .line 16
    check-cast p1, Lax/o4/g$F;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/o4/h;->x0(Lax/o4/g$F;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_8f

    .line 22
    .line 23
    :cond_16
    instance-of v0, p1, Lax/o4/g$e0;

    .line 24
    .line 25
    if-eqz v0, :cond_21

    .line 26
    .line 27
    check-cast p1, Lax/o4/g$e0;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lax/o4/h;->E0(Lax/o4/g$e0;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_8f

    .line 33
    .line 34
    :cond_21
    instance-of v0, p1, Lax/o4/g$S;

    .line 35
    .line 36
    if-eqz v0, :cond_2c

    .line 37
    .line 38
    check-cast p1, Lax/o4/g$S;

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lax/o4/h;->B0(Lax/o4/g$S;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_8f

    .line 44
    .line 45
    :cond_2c
    instance-of v0, p1, Lax/o4/g$m;

    .line 46
    .line 47
    if-eqz v0, :cond_36

    .line 48
    .line 49
    check-cast p1, Lax/o4/g$m;

    .line 50
    .line 51
    invoke-direct {p0, p1}, Lax/o4/h;->q0(Lax/o4/g$m;)V

    .line 52
    .line 53
    .line 54
    goto :goto_8f

    .line 55
    :cond_36
    instance-of v0, p1, Lax/o4/g$o;

    .line 56
    .line 57
    if-eqz v0, :cond_40

    .line 58
    .line 59
    check-cast p1, Lax/o4/g$o;

    .line 60
    .line 61
    invoke-direct {p0, p1}, Lax/o4/h;->r0(Lax/o4/g$o;)V

    .line 62
    .line 63
    .line 64
    goto :goto_8f

    .line 65
    :cond_40
    instance-of v0, p1, Lax/o4/g$v;

    .line 66
    .line 67
    if-eqz v0, :cond_4a

    .line 68
    .line 69
    check-cast p1, Lax/o4/g$v;

    .line 70
    .line 71
    invoke-direct {p0, p1}, Lax/o4/h;->t0(Lax/o4/g$v;)V

    .line 72
    .line 73
    .line 74
    goto :goto_8f

    .line 75
    :cond_4a
    instance-of v0, p1, Lax/o4/g$B;

    .line 76
    .line 77
    if-eqz v0, :cond_54

    .line 78
    .line 79
    check-cast p1, Lax/o4/g$B;

    .line 80
    .line 81
    invoke-direct {p0, p1}, Lax/o4/h;->w0(Lax/o4/g$B;)V

    .line 82
    .line 83
    .line 84
    goto :goto_8f

    .line 85
    :cond_54
    instance-of v0, p1, Lax/o4/g$d;

    .line 86
    .line 87
    if-eqz v0, :cond_5e

    .line 88
    .line 89
    check-cast p1, Lax/o4/g$d;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lax/o4/h;->o0(Lax/o4/g$d;)V

    .line 92
    .line 93
    .line 94
    goto :goto_8f

    .line 95
    :cond_5e
    instance-of v0, p1, Lax/o4/g$i;

    .line 96
    .line 97
    if-eqz v0, :cond_68

    .line 98
    .line 99
    check-cast p1, Lax/o4/g$i;

    .line 100
    .line 101
    invoke-direct {p0, p1}, Lax/o4/h;->p0(Lax/o4/g$i;)V

    .line 102
    .line 103
    .line 104
    goto :goto_8f

    .line 105
    :cond_68
    instance-of v0, p1, Lax/o4/g$q;

    .line 106
    .line 107
    if-eqz v0, :cond_72

    .line 108
    .line 109
    check-cast p1, Lax/o4/g$q;

    .line 110
    .line 111
    invoke-direct {p0, p1}, Lax/o4/h;->s0(Lax/o4/g$q;)V

    .line 112
    .line 113
    .line 114
    goto :goto_8f

    .line 115
    :cond_72
    instance-of v0, p1, Lax/o4/g$A;

    .line 116
    .line 117
    if-eqz v0, :cond_7c

    .line 118
    .line 119
    check-cast p1, Lax/o4/g$A;

    .line 120
    .line 121
    invoke-direct {p0, p1}, Lax/o4/h;->v0(Lax/o4/g$A;)V

    .line 122
    .line 123
    .line 124
    goto :goto_8f

    .line 125
    :cond_7c
    instance-of v0, p1, Lax/o4/g$z;

    .line 126
    .line 127
    if-eqz v0, :cond_86

    .line 128
    .line 129
    check-cast p1, Lax/o4/g$z;

    .line 130
    .line 131
    invoke-direct {p0, p1}, Lax/o4/h;->u0(Lax/o4/g$z;)V

    .line 132
    .line 133
    .line 134
    goto :goto_8f

    .line 135
    :cond_86
    instance-of v0, p1, Lax/o4/g$W;

    .line 136
    .line 137
    if-eqz v0, :cond_8f

    .line 138
    .line 139
    check-cast p1, Lax/o4/g$W;

    .line 140
    .line 141
    invoke-direct {p0, p1}, Lax/o4/h;->D0(Lax/o4/g$W;)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    :goto_8f
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 145
    .line 146
    .line 147
    return-void
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
.end method

.method private B(Lax/o4/g$K;Landroid/graphics/Path;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 6
    .line 7
    instance-of v1, v0, Lax/o4/g$u;

    .line 8
    .line 9
    if-eqz v1, :cond_1e

    .line 10
    .line 11
    iget-object v1, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 12
    .line 13
    check-cast v0, Lax/o4/g$u;

    .line 14
    .line 15
    iget-object v0, v0, Lax/o4/g$u;->q:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Lax/o4/g$y;

    .line 22
    .line 23
    if-eqz v1, :cond_1e

    .line 24
    .line 25
    check-cast v0, Lax/o4/g$y;

    .line 26
    .line 27
    invoke-direct {p0, p1, p2, v0}, Lax/o4/h;->L(Lax/o4/g$K;Landroid/graphics/Path;Lax/o4/g$y;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 32
    .line 33
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 34
    .line 35
    iget-object v0, v0, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
.end method

.method private B0(Lax/o4/g$S;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Switch render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-object v0, p1, Lax/o4/g$m;->o:Landroid/graphics/Matrix;

    .line 22
    .line 23
    if-eqz v0, :cond_1d

    .line 24
    .line 25
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-direct {p0, p1}, Lax/o4/h;->K0(Lax/o4/g$S;)V

    .line 38
    .line 39
    .line 40
    if-eqz v0, :cond_2c

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method private C(Landroid/graphics/Path;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v1, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v1, v1, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 6
    .line 7
    sget-object v2, Lax/o4/g$E$i;->c0:Lax/o4/g$E$i;

    .line 8
    .line 9
    if-ne v1, v2, :cond_53

    .line 10
    .line 11
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 26
    .line 27
    new-instance v2, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 36
    .line 37
    iget-object p1, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v2, Landroid/graphics/Matrix;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_3f

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    .line 51
    .line 52
    .line 53
    new-instance v3, Landroid/graphics/Matrix;

    .line 54
    .line 55
    invoke-direct {v3, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    iget-object v3, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 65
    .line 66
    iget-object v4, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 67
    .line 68
    iget-object v4, v4, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {v3, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 76
    .line 77
    .line 78
    if-eqz p1, :cond_52

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 81
    .line 82
    .line 83
    :cond_52
    return-void

    .line 84
    :cond_53
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 85
    .line 86
    iget-object v0, v0, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {v1, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    return-void
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

.method private C0(Lax/o4/g$T;Lax/o4/g$b;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Symbol render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget v0, p2, Lax/o4/g$b;->c:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-eqz v0, :cond_74

    .line 15
    .line 16
    iget v0, p2, Lax/o4/g$b;->d:F

    .line 17
    .line 18
    cmpl-float v0, v0, v1

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_74

    .line 23
    :cond_16
    iget-object v0, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 24
    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    sget-object v0, Lax/o4/e;->e:Lax/o4/e;

    .line 29
    .line 30
    :goto_1d
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 31
    .line 32
    invoke-direct {p0, v1, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 36
    .line 37
    iput-object p2, v1, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 38
    .line 39
    iget-object p2, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 40
    .line 41
    iget-object p2, p2, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_3f

    .line 48
    .line 49
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 50
    .line 51
    iget-object p2, p2, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 52
    .line 53
    iget v1, p2, Lax/o4/g$b;->a:F

    .line 54
    .line 55
    iget v2, p2, Lax/o4/g$b;->b:F

    .line 56
    .line 57
    iget v3, p2, Lax/o4/g$b;->c:F

    .line 58
    .line 59
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 60
    .line 61
    invoke-direct {p0, v1, v2, v3, p2}, Lax/o4/h;->O0(FFFF)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    iget-object p2, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 65
    .line 66
    if-eqz p2, :cond_57

    .line 67
    .line 68
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 69
    .line 70
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 71
    .line 72
    iget-object v2, v2, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 73
    .line 74
    invoke-direct {p0, v2, p2, v0}, Lax/o4/h;->o(Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)Landroid/graphics/Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 82
    .line 83
    iget-object v0, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 84
    .line 85
    iput-object v0, p2, Lax/o4/h$h;->g:Lax/o4/g$b;

    .line 86
    .line 87
    goto :goto_64

    .line 88
    :cond_57
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 89
    .line 90
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 91
    .line 92
    iget-object v0, v0, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 93
    .line 94
    iget v1, v0, Lax/o4/g$b;->a:F

    .line 95
    .line 96
    iget v0, v0, Lax/o4/g$b;->b:F

    .line 97
    .line 98
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 99
    .line 100
    .line 101
    :goto_64
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    const/4 v0, 0x1

    .line 106
    invoke-direct {p0, p1, v0}, Lax/o4/h;->F0(Lax/o4/g$J;Z)V

    .line 107
    .line 108
    .line 109
    if-eqz p2, :cond_71

    .line 110
    .line 111
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 112
    .line 113
    .line 114
    :cond_71
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 115
    .line 116
    .line 117
    :cond_74
    :goto_74
    return-void
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

.method private D(FFFF)F
    .registers 5

    .line 1
    mul-float p1, p1, p3

    .line 2
    .line 3
    mul-float p2, p2, p4

    .line 4
    .line 5
    add-float/2addr p1, p2

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

.method private D0(Lax/o4/g$W;)V
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "Text render"

    .line 5
    .line 6
    invoke-static {v2, v1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v1, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_15

    .line 19
    .line 20
    goto/16 :goto_d4

    .line 21
    .line 22
    :cond_15
    iget-object v1, p1, Lax/o4/g$W;->s:Landroid/graphics/Matrix;

    .line 23
    .line 24
    if-eqz v1, :cond_1e

    .line 25
    .line 26
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v1, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v1, :cond_37

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2a

    .line 41
    .line 42
    goto :goto_37

    .line 43
    :cond_2a
    iget-object v1, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lax/o4/g$p;

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    :goto_37
    const/4 v1, 0x0

    .line 57
    :goto_38
    iget-object v3, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v3, :cond_50

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_43

    .line 66
    .line 67
    goto :goto_50

    .line 68
    :cond_43
    iget-object v3, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lax/o4/g$p;

    .line 75
    .line 76
    invoke-virtual {v3, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    goto :goto_51

    .line 81
    :cond_50
    :goto_50
    const/4 v3, 0x0

    .line 82
    :goto_51
    iget-object v4, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 83
    .line 84
    if-eqz v4, :cond_69

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_5c

    .line 91
    .line 92
    goto :goto_69

    .line 93
    :cond_5c
    iget-object v4, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lax/o4/g$p;

    .line 100
    .line 101
    invoke-virtual {v4, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    goto :goto_6a

    .line 106
    :cond_69
    :goto_69
    const/4 v4, 0x0

    .line 107
    :goto_6a
    iget-object v5, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 108
    .line 109
    if-eqz v5, :cond_81

    .line 110
    .line 111
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_75

    .line 116
    .line 117
    goto :goto_81

    .line 118
    :cond_75
    iget-object v2, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lax/o4/g$p;

    .line 125
    .line 126
    invoke-virtual {v0, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    :cond_81
    :goto_81
    invoke-direct {p0}, Lax/o4/h;->O()Lax/o4/g$E$f;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v5, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 135
    .line 136
    if-eq v0, v5, :cond_95

    .line 137
    .line 138
    invoke-direct {p0, p1}, Lax/o4/h;->n(Lax/o4/g$Y;)F

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    sget-object v6, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 143
    .line 144
    if-ne v0, v6, :cond_94

    .line 145
    .line 146
    const/high16 v0, 0x40000000    # 2.0f

    .line 147
    .line 148
    div-float/2addr v5, v0

    .line 149
    :cond_94
    sub-float/2addr v1, v5

    .line 150
    :cond_95
    iget-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 151
    .line 152
    if-nez v0, :cond_b8

    .line 153
    .line 154
    new-instance v0, Lax/o4/h$i;

    .line 155
    .line 156
    invoke-direct {v0, p0, v1, v3}, Lax/o4/h$i;-><init>(Lax/o4/h;FF)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, p1, v0}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 160
    .line 161
    .line 162
    new-instance v5, Lax/o4/g$b;

    .line 163
    .line 164
    iget-object v6, v0, Lax/o4/h$i;->d:Landroid/graphics/RectF;

    .line 165
    .line 166
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 167
    .line 168
    iget v8, v6, Landroid/graphics/RectF;->top:F

    .line 169
    .line 170
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    iget-object v0, v0, Lax/o4/h$i;->d:Landroid/graphics/RectF;

    .line 175
    .line 176
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-direct {v5, v7, v8, v6, v0}, Lax/o4/g$b;-><init>(FFFF)V

    .line 181
    .line 182
    .line 183
    iput-object v5, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 184
    .line 185
    :cond_b8
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    new-instance v5, Lax/o4/h$f;

    .line 199
    .line 200
    add-float/2addr v1, v4

    .line 201
    add-float/2addr v3, v2

    .line 202
    invoke-direct {v5, p0, v1, v3}, Lax/o4/h$f;-><init>(Lax/o4/h;FF)V

    .line 203
    .line 204
    .line 205
    invoke-direct {p0, p1, v5}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 206
    .line 207
    .line 208
    if-eqz v0, :cond_d4

    .line 209
    .line 210
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 211
    .line 212
    .line 213
    :cond_d4
    :goto_d4
    return-void
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

.method private E(Lax/o4/g$Y;Lax/o4/h$j;)V
    .registers 7

    .line 1
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_35

    .line 8
    :cond_7
    iget-object p1, p1, Lax/o4/g$H;->i:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x1

    .line 16
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_35

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lax/o4/g$N;

    .line 27
    .line 28
    instance-of v3, v2, Lax/o4/g$c0;

    .line 29
    .line 30
    if-eqz v3, :cond_30

    .line 31
    .line 32
    check-cast v2, Lax/o4/g$c0;

    .line 33
    .line 34
    iget-object v2, v2, Lax/o4/g$c0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    xor-int/2addr v3, v0

    .line 41
    invoke-direct {p0, v2, v1, v3}, Lax/o4/h;->T0(Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p2, v1}, Lax/o4/h$j;->b(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_33

    .line 49
    :cond_30
    invoke-direct {p0, v2, p2}, Lax/o4/h;->l0(Lax/o4/g$N;Lax/o4/h$j;)V

    .line 50
    .line 51
    .line 52
    :goto_33
    const/4 v1, 0x0

    .line 53
    goto :goto_f

    .line 54
    :cond_35
    :goto_35
    return-void
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

.method private E0(Lax/o4/g$e0;)V
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "Use render"

    .line 5
    .line 6
    invoke-static {v2, v1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p1, Lax/o4/g$e0;->s:Lax/o4/g$p;

    .line 10
    .line 11
    if-eqz v1, :cond_12

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/o4/g$p;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_28

    .line 18
    .line 19
    :cond_12
    iget-object v1, p1, Lax/o4/g$e0;->t:Lax/o4/g$p;

    .line 20
    .line 21
    if-eqz v1, :cond_1d

    .line 22
    .line 23
    invoke-virtual {v1}, Lax/o4/g$p;->k()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1d

    .line 28
    .line 29
    goto :goto_28

    .line 30
    :cond_1d
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 31
    .line 32
    invoke-direct {p0, v1, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_29

    .line 40
    .line 41
    :cond_28
    :goto_28
    return-void

    .line 42
    :cond_29
    iget-object v1, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 43
    .line 44
    iget-object v2, p1, Lax/o4/g$e0;->p:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_40

    .line 51
    .line 52
    iget-object p1, p1, Lax/o4/g$e0;->p:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    new-array v1, v1, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p1, v1, v0

    .line 58
    .line 59
    const-string p1, "Use reference \'%s\' not found"

    .line 60
    .line 61
    invoke-static {p1, v1}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    iget-object v0, p1, Lax/o4/g$m;->o:Landroid/graphics/Matrix;

    .line 66
    .line 67
    if-eqz v0, :cond_49

    .line 68
    .line 69
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 70
    .line 71
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    iget-object v0, p1, Lax/o4/g$e0;->q:Lax/o4/g$p;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    if-eqz v0, :cond_53

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    goto :goto_54

    .line 84
    :cond_53
    const/4 v0, 0x0

    .line 85
    :goto_54
    iget-object v3, p1, Lax/o4/g$e0;->r:Lax/o4/g$p;

    .line 86
    .line 87
    if-eqz v3, :cond_5c

    .line 88
    .line 89
    invoke-virtual {v3, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :cond_5c
    iget-object v3, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 94
    .line 95
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-direct {p0, p1}, Lax/o4/h;->i0(Lax/o4/g$J;)V

    .line 106
    .line 107
    .line 108
    instance-of v2, v1, Lax/o4/g$F;

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    if-eqz v2, :cond_84

    .line 112
    .line 113
    check-cast v1, Lax/o4/g$F;

    .line 114
    .line 115
    iget-object v2, p1, Lax/o4/g$e0;->s:Lax/o4/g$p;

    .line 116
    .line 117
    iget-object v4, p1, Lax/o4/g$e0;->t:Lax/o4/g$p;

    .line 118
    .line 119
    invoke-direct {p0, v3, v3, v2, v4}, Lax/o4/h;->f0(Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;)Lax/o4/g$b;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, v1, v2}, Lax/o4/h;->y0(Lax/o4/g$F;Lax/o4/g$b;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 130
    .line 131
    .line 132
    goto :goto_b5

    .line 133
    :cond_84
    instance-of v2, v1, Lax/o4/g$T;

    .line 134
    .line 135
    if-eqz v2, :cond_b2

    .line 136
    .line 137
    iget-object v2, p1, Lax/o4/g$e0;->s:Lax/o4/g$p;

    .line 138
    .line 139
    const/high16 v4, 0x42c80000    # 100.0f

    .line 140
    .line 141
    if-eqz v2, :cond_8f

    .line 142
    .line 143
    goto :goto_96

    .line 144
    :cond_8f
    new-instance v2, Lax/o4/g$p;

    .line 145
    .line 146
    sget-object v5, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 147
    .line 148
    invoke-direct {v2, v4, v5}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V

    .line 149
    .line 150
    .line 151
    :goto_96
    iget-object v5, p1, Lax/o4/g$e0;->t:Lax/o4/g$p;

    .line 152
    .line 153
    if-eqz v5, :cond_9b

    .line 154
    .line 155
    goto :goto_a2

    .line 156
    :cond_9b
    new-instance v5, Lax/o4/g$p;

    .line 157
    .line 158
    sget-object v6, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 159
    .line 160
    invoke-direct {v5, v4, v6}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V

    .line 161
    .line 162
    .line 163
    :goto_a2
    invoke-direct {p0, v3, v3, v2, v5}, Lax/o4/h;->f0(Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;)Lax/o4/g$b;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 168
    .line 169
    .line 170
    check-cast v1, Lax/o4/g$T;

    .line 171
    .line 172
    invoke-direct {p0, v1, v2}, Lax/o4/h;->C0(Lax/o4/g$T;Lax/o4/g$b;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 176
    .line 177
    .line 178
    goto :goto_b5

    .line 179
    :cond_b2
    invoke-direct {p0, v1}, Lax/o4/h;->A0(Lax/o4/g$N;)V

    .line 180
    .line 181
    .line 182
    :goto_b5
    invoke-direct {p0}, Lax/o4/h;->h0()V

    .line 183
    .line 184
    .line 185
    if-eqz v0, :cond_bd

    .line 186
    .line 187
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 191
    .line 192
    .line 193
    return-void
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

.method private static varargs F(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "SVGAndroidRenderer"

    .line 6
    .line 7
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
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

.method private F0(Lax/o4/g$J;Z)V
    .registers 4

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/o4/h;->i0(Lax/o4/g$J;)V

    .line 4
    .line 5
    .line 6
    :cond_5
    invoke-interface {p1}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1d

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lax/o4/g$N;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lax/o4/h;->A0(Lax/o4/g$N;)V

    .line 27
    .line 28
    .line 29
    goto :goto_d

    .line 30
    :cond_1d
    if-eqz p2, :cond_22

    .line 31
    .line 32
    invoke-direct {p0}, Lax/o4/h;->h0()V

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
.end method

.method private G(Lax/o4/g$Y;Ljava/lang/StringBuilder;)V
    .registers 7

    .line 1
    iget-object p1, p1, Lax/o4/g$H;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x1

    .line 9
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_34

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lax/o4/g$N;

    .line 20
    .line 21
    instance-of v3, v2, Lax/o4/g$Y;

    .line 22
    .line 23
    if-eqz v3, :cond_1e

    .line 24
    .line 25
    check-cast v2, Lax/o4/g$Y;

    .line 26
    .line 27
    invoke-direct {p0, v2, p2}, Lax/o4/h;->G(Lax/o4/g$Y;Ljava/lang/StringBuilder;)V

    .line 28
    .line 29
    .line 30
    goto :goto_32

    .line 31
    :cond_1e
    instance-of v3, v2, Lax/o4/g$c0;

    .line 32
    .line 33
    if-eqz v3, :cond_32

    .line 34
    .line 35
    check-cast v2, Lax/o4/g$c0;

    .line 36
    .line 37
    iget-object v2, v2, Lax/o4/g$c0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    xor-int/2addr v3, v0

    .line 44
    invoke-direct {p0, v2, v1, v3}, Lax/o4/h;->T0(Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_32
    :goto_32
    const/4 v1, 0x0

    .line 52
    goto :goto_8

    .line 53
    :cond_34
    return-void
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

.method private H(Lax/o4/g$j;Ljava/lang/String;)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 4
    .line 5
    invoke-virtual {v2, p2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_14

    .line 10
    .line 11
    const-string p1, "Gradient reference \'%s\' not found"

    .line 12
    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p2, v0, v1

    .line 16
    .line 17
    invoke-static {p1, v0}, Lax/o4/h;->Z0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    instance-of v3, v2, Lax/o4/g$j;

    .line 22
    .line 23
    if-nez v3, :cond_20

    .line 24
    .line 25
    new-array p1, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string p2, "Gradient href attributes must point to other gradient elements"

    .line 28
    .line 29
    invoke-static {p2, p1}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-ne v2, p1, :cond_2c

    .line 34
    .line 35
    const-string p1, "Circular reference in gradient href attribute \'%s\'"

    .line 36
    .line 37
    new-array v0, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    aput-object p2, v0, v1

    .line 40
    .line 41
    invoke-static {p1, v0}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    move-object p2, v2

    .line 46
    check-cast p2, Lax/o4/g$j;

    .line 47
    .line 48
    iget-object v0, p1, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 49
    .line 50
    if-nez v0, :cond_37

    .line 51
    .line 52
    iget-object v0, p2, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 53
    .line 54
    iput-object v0, p1, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 55
    .line 56
    :cond_37
    iget-object v0, p1, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 57
    .line 58
    if-nez v0, :cond_3f

    .line 59
    .line 60
    iget-object v0, p2, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 61
    .line 62
    iput-object v0, p1, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 63
    .line 64
    :cond_3f
    iget-object v0, p1, Lax/o4/g$j;->k:Lax/o4/g$k;

    .line 65
    .line 66
    if-nez v0, :cond_47

    .line 67
    .line 68
    iget-object v0, p2, Lax/o4/g$j;->k:Lax/o4/g$k;

    .line 69
    .line 70
    iput-object v0, p1, Lax/o4/g$j;->k:Lax/o4/g$k;

    .line 71
    .line 72
    :cond_47
    iget-object v0, p1, Lax/o4/g$j;->h:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_53

    .line 79
    .line 80
    iget-object v0, p2, Lax/o4/g$j;->h:Ljava/util/List;

    .line 81
    .line 82
    iput-object v0, p1, Lax/o4/g$j;->h:Ljava/util/List;

    .line 83
    .line 84
    :cond_53
    :try_start_53
    instance-of v0, p1, Lax/o4/g$M;

    .line 85
    .line 86
    if-eqz v0, :cond_62

    .line 87
    .line 88
    move-object v0, p1

    .line 89
    check-cast v0, Lax/o4/g$M;

    .line 90
    .line 91
    check-cast v2, Lax/o4/g$M;

    .line 92
    .line 93
    invoke-direct {p0, v0, v2}, Lax/o4/h;->I(Lax/o4/g$M;Lax/o4/g$M;)V

    .line 94
    .line 95
    .line 96
    goto :goto_6a

    .line 97
    :catch_60
    nop

    .line 98
    goto :goto_6a

    .line 99
    :cond_62
    move-object v0, p1

    .line 100
    check-cast v0, Lax/o4/g$Q;

    .line 101
    .line 102
    check-cast v2, Lax/o4/g$Q;

    .line 103
    .line 104
    invoke-direct {p0, v0, v2}, Lax/o4/h;->J(Lax/o4/g$Q;Lax/o4/g$Q;)V
    :try_end_6a
    .catch Ljava/lang/ClassCastException; {:try_start_53 .. :try_end_6a} :catch_60

    .line 105
    .line 106
    .line 107
    :goto_6a
    iget-object p2, p2, Lax/o4/g$j;->l:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz p2, :cond_71

    .line 110
    .line 111
    invoke-direct {p0, p1, p2}, Lax/o4/h;->H(Lax/o4/g$j;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_71
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
.end method

.method private H0(Lax/o4/g$r;Lax/o4/h$c;)V
    .registers 14

    .line 1
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lax/o4/g$r;->v:Ljava/lang/Float;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_33

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2c

    .line 18
    .line 19
    iget v0, p2, Lax/o4/h$c;->c:F

    .line 20
    .line 21
    cmpl-float v2, v0, v1

    .line 22
    .line 23
    if-nez v2, :cond_1e

    .line 24
    .line 25
    iget v2, p2, Lax/o4/h$c;->d:F

    .line 26
    .line 27
    cmpl-float v2, v2, v1

    .line 28
    .line 29
    if-eqz v2, :cond_33

    .line 30
    .line 31
    :cond_1e
    iget v2, p2, Lax/o4/h$c;->d:F

    .line 32
    .line 33
    float-to-double v2, v2

    .line 34
    float-to-double v4, v0

    .line 35
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    double-to-float v0, v2

    .line 44
    goto :goto_34

    .line 45
    :cond_2c
    iget-object v0, p1, Lax/o4/g$r;->v:Ljava/lang/Float;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 v0, 0x0

    .line 53
    :goto_34
    iget-boolean v2, p1, Lax/o4/g$r;->q:Z

    .line 54
    .line 55
    if-eqz v2, :cond_3b

    .line 56
    .line 57
    const/high16 v2, 0x3f800000    # 1.0f

    .line 58
    .line 59
    goto :goto_47

    .line 60
    :cond_3b
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 61
    .line 62
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 63
    .line 64
    iget-object v2, v2, Lax/o4/g$E;->h0:Lax/o4/g$p;

    .line 65
    .line 66
    iget v3, p0, Lax/o4/h;->b:F

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lax/o4/g$p;->c(F)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :goto_47
    invoke-direct {p0, p1}, Lax/o4/h;->M(Lax/o4/g$N;)Lax/o4/h$h;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iput-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 77
    .line 78
    new-instance v3, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 81
    .line 82
    .line 83
    iget v4, p2, Lax/o4/h$c;->a:F

    .line 84
    .line 85
    iget p2, p2, Lax/o4/h$c;->b:F

    .line 86
    .line 87
    invoke-virtual {v3, v4, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 94
    .line 95
    .line 96
    iget-object p2, p1, Lax/o4/g$r;->r:Lax/o4/g$p;

    .line 97
    .line 98
    if-eqz p2, :cond_68

    .line 99
    .line 100
    invoke-virtual {p2, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    goto :goto_69

    .line 105
    :cond_68
    const/4 p2, 0x0

    .line 106
    :goto_69
    iget-object v0, p1, Lax/o4/g$r;->s:Lax/o4/g$p;

    .line 107
    .line 108
    if-eqz v0, :cond_72

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    goto :goto_73

    .line 115
    :cond_72
    const/4 v0, 0x0

    .line 116
    :goto_73
    iget-object v2, p1, Lax/o4/g$r;->t:Lax/o4/g$p;

    .line 117
    .line 118
    const/high16 v4, 0x40400000    # 3.0f

    .line 119
    .line 120
    if-eqz v2, :cond_7e

    .line 121
    .line 122
    invoke-virtual {v2, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    goto :goto_80

    .line 127
    :cond_7e
    const/high16 v2, 0x40400000    # 3.0f

    .line 128
    .line 129
    :goto_80
    iget-object v5, p1, Lax/o4/g$r;->u:Lax/o4/g$p;

    .line 130
    .line 131
    if-eqz v5, :cond_88

    .line 132
    .line 133
    invoke-virtual {v5, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    :cond_88
    iget-object v5, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 138
    .line 139
    if-eqz v5, :cond_12c

    .line 140
    .line 141
    iget v6, v5, Lax/o4/g$b;->c:F

    .line 142
    .line 143
    div-float v6, v2, v6

    .line 144
    .line 145
    iget v5, v5, Lax/o4/g$b;->d:F

    .line 146
    .line 147
    div-float v5, v4, v5

    .line 148
    .line 149
    iget-object v7, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 150
    .line 151
    if-eqz v7, :cond_99

    .line 152
    .line 153
    goto :goto_9b

    .line 154
    :cond_99
    sget-object v7, Lax/o4/e;->e:Lax/o4/e;

    .line 155
    .line 156
    :goto_9b
    sget-object v8, Lax/o4/e;->d:Lax/o4/e;

    .line 157
    .line 158
    invoke-virtual {v7, v8}, Lax/o4/e;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-nez v8, :cond_b7

    .line 163
    .line 164
    invoke-virtual {v7}, Lax/o4/e;->b()Lax/o4/e$b;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    sget-object v9, Lax/o4/e$b;->c0:Lax/o4/e$b;

    .line 169
    .line 170
    if-ne v8, v9, :cond_b1

    .line 171
    .line 172
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    :goto_af
    move v6, v5

    .line 177
    goto :goto_b6

    .line 178
    :cond_b1
    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    goto :goto_af

    .line 183
    :goto_b6
    move v5, v6

    .line 184
    :cond_b7
    neg-float p2, p2

    .line 185
    mul-float p2, p2, v6

    .line 186
    .line 187
    neg-float v0, v0

    .line 188
    mul-float v0, v0, v5

    .line 189
    .line 190
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 191
    .line 192
    .line 193
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 194
    .line 195
    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 196
    .line 197
    .line 198
    iget-object p2, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 199
    .line 200
    iget v0, p2, Lax/o4/g$b;->c:F

    .line 201
    .line 202
    mul-float v0, v0, v6

    .line 203
    .line 204
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 205
    .line 206
    mul-float p2, p2, v5

    .line 207
    .line 208
    sget-object v8, Lax/o4/h$a;->a:[I

    .line 209
    .line 210
    invoke-virtual {v7}, Lax/o4/e;->a()Lax/o4/e$a;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    aget v9, v8, v9

    .line 219
    .line 220
    const/high16 v10, 0x40000000    # 2.0f

    .line 221
    .line 222
    packed-switch v9, :pswitch_data_156

    .line 223
    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    goto :goto_eb

    .line 227
    :pswitch_e2
    sub-float v0, v2, v0

    .line 228
    .line 229
    :goto_e4
    sub-float v0, v1, v0

    .line 230
    .line 231
    goto :goto_eb

    .line 232
    :pswitch_e7
    sub-float v0, v2, v0

    .line 233
    .line 234
    div-float/2addr v0, v10

    .line 235
    goto :goto_e4

    .line 236
    :goto_eb
    invoke-virtual {v7}, Lax/o4/e;->a()Lax/o4/e$a;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    aget v7, v8, v7

    .line 245
    .line 246
    const/4 v8, 0x2

    .line 247
    if-eq v7, v8, :cond_10d

    .line 248
    .line 249
    const/4 v8, 0x3

    .line 250
    if-eq v7, v8, :cond_109

    .line 251
    .line 252
    const/4 v8, 0x5

    .line 253
    if-eq v7, v8, :cond_10d

    .line 254
    .line 255
    const/4 v8, 0x6

    .line 256
    if-eq v7, v8, :cond_109

    .line 257
    .line 258
    const/4 v8, 0x7

    .line 259
    if-eq v7, v8, :cond_10d

    .line 260
    .line 261
    const/16 v8, 0x8

    .line 262
    .line 263
    if-eq v7, v8, :cond_109

    .line 264
    .line 265
    goto :goto_111

    .line 266
    :cond_109
    sub-float p2, v4, p2

    .line 267
    .line 268
    :goto_10b
    sub-float/2addr v1, p2

    .line 269
    goto :goto_111

    .line 270
    :cond_10d
    sub-float p2, v4, p2

    .line 271
    .line 272
    div-float/2addr p2, v10

    .line 273
    goto :goto_10b

    .line 274
    :goto_111
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 275
    .line 276
    iget-object p2, p2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 277
    .line 278
    iget-object p2, p2, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    if-nez p2, :cond_120

    .line 285
    .line 286
    invoke-direct {p0, v0, v1, v2, v4}, Lax/o4/h;->O0(FFFF)V

    .line 287
    .line 288
    .line 289
    :cond_120
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v6, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 293
    .line 294
    .line 295
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 296
    .line 297
    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 298
    .line 299
    .line 300
    goto :goto_145

    .line 301
    :cond_12c
    neg-float p2, p2

    .line 302
    neg-float v0, v0

    .line 303
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 304
    .line 305
    .line 306
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 307
    .line 308
    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 309
    .line 310
    .line 311
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 312
    .line 313
    iget-object p2, p2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 314
    .line 315
    iget-object p2, p2, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result p2

    .line 321
    if-nez p2, :cond_145

    .line 322
    .line 323
    invoke-direct {p0, v1, v1, v2, v4}, Lax/o4/h;->O0(FFFF)V

    .line 324
    .line 325
    .line 326
    :cond_145
    :goto_145
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-direct {p0, p1, v0}, Lax/o4/h;->F0(Lax/o4/g$J;Z)V

    .line 332
    .line 333
    .line 334
    if-eqz p2, :cond_152

    .line 335
    .line 336
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 337
    .line 338
    .line 339
    :cond_152
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_data_156
    .packed-switch 0x1
        :pswitch_e7
        :pswitch_e7
        :pswitch_e7
        :pswitch_e2
        :pswitch_e2
        :pswitch_e2
    .end packed-switch
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

.method private I(Lax/o4/g$M;Lax/o4/g$M;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p2, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 6
    .line 7
    iput-object v0, p1, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 8
    .line 9
    :cond_8
    iget-object v0, p1, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 10
    .line 11
    if-nez v0, :cond_10

    .line 12
    .line 13
    iget-object v0, p2, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 14
    .line 15
    iput-object v0, p1, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p1, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 18
    .line 19
    if-nez v0, :cond_18

    .line 20
    .line 21
    iget-object v0, p2, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 22
    .line 23
    iput-object v0, p1, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 24
    .line 25
    :cond_18
    iget-object v0, p1, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 26
    .line 27
    if-nez v0, :cond_20

    .line 28
    .line 29
    iget-object p2, p2, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 30
    .line 31
    iput-object p2, p1, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 32
    .line 33
    :cond_20
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private I0(Lax/o4/g$l;)V
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 4
    .line 5
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 6
    .line 7
    iget-object v3, v2, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v3, :cond_14

    .line 10
    .line 11
    iget-object v4, v2, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v4, :cond_14

    .line 14
    .line 15
    iget-object v2, v2, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v2, :cond_14

    .line 18
    .line 19
    goto/16 :goto_f2

    .line 20
    .line 21
    :cond_14
    const-string v2, "Marker reference \'%s\' not found"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_31

    .line 25
    .line 26
    iget-object v5, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 27
    .line 28
    invoke-virtual {v5, v3}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_24

    .line 33
    .line 34
    check-cast v3, Lax/o4/g$r;

    .line 35
    .line 36
    goto :goto_32

    .line 37
    :cond_24
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 38
    .line 39
    iget-object v3, v3, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 40
    .line 41
    iget-object v3, v3, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 42
    .line 43
    new-array v5, v1, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object v3, v5, v0

    .line 46
    .line 47
    invoke-static {v2, v5}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    move-object v3, v4

    .line 51
    :goto_32
    iget-object v5, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 52
    .line 53
    iget-object v5, v5, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 54
    .line 55
    iget-object v5, v5, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v5, :cond_52

    .line 58
    .line 59
    iget-object v6, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 60
    .line 61
    invoke-virtual {v6, v5}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-eqz v5, :cond_45

    .line 66
    .line 67
    check-cast v5, Lax/o4/g$r;

    .line 68
    .line 69
    goto :goto_53

    .line 70
    :cond_45
    iget-object v5, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 71
    .line 72
    iget-object v5, v5, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 73
    .line 74
    iget-object v5, v5, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 75
    .line 76
    new-array v6, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    aput-object v5, v6, v0

    .line 79
    .line 80
    invoke-static {v2, v6}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_52
    move-object v5, v4

    .line 84
    :goto_53
    iget-object v6, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 85
    .line 86
    iget-object v6, v6, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 87
    .line 88
    iget-object v6, v6, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v6, :cond_73

    .line 91
    .line 92
    iget-object v7, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 93
    .line 94
    invoke-virtual {v7, v6}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-eqz v6, :cond_66

    .line 99
    .line 100
    check-cast v6, Lax/o4/g$r;

    .line 101
    .line 102
    goto :goto_74

    .line 103
    :cond_66
    iget-object v6, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 104
    .line 105
    iget-object v6, v6, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 106
    .line 107
    iget-object v6, v6, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 108
    .line 109
    new-array v7, v1, [Ljava/lang/Object;

    .line 110
    .line 111
    aput-object v6, v7, v0

    .line 112
    .line 113
    invoke-static {v2, v7}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_73
    move-object v6, v4

    .line 117
    :goto_74
    instance-of v2, p1, Lax/o4/g$v;

    .line 118
    .line 119
    if-eqz v2, :cond_86

    .line 120
    .line 121
    new-instance v2, Lax/o4/h$b;

    .line 122
    .line 123
    check-cast p1, Lax/o4/g$v;

    .line 124
    .line 125
    iget-object p1, p1, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 126
    .line 127
    invoke-direct {v2, p0, p1}, Lax/o4/h$b;-><init>(Lax/o4/h;Lax/o4/g$w;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Lax/o4/h$b;->f()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    goto :goto_97

    .line 135
    :cond_86
    instance-of v2, p1, Lax/o4/g$q;

    .line 136
    .line 137
    if-eqz v2, :cond_91

    .line 138
    .line 139
    check-cast p1, Lax/o4/g$q;

    .line 140
    .line 141
    invoke-direct {p0, p1}, Lax/o4/h;->k(Lax/o4/g$q;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    goto :goto_97

    .line 146
    :cond_91
    check-cast p1, Lax/o4/g$z;

    .line 147
    .line 148
    invoke-direct {p0, p1}, Lax/o4/h;->l(Lax/o4/g$z;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_97
    if-nez p1, :cond_9a

    .line 153
    .line 154
    goto :goto_f2

    .line 155
    :cond_9a
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_a1

    .line 160
    .line 161
    goto :goto_f2

    .line 162
    :cond_a1
    iget-object v7, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 163
    .line 164
    iget-object v7, v7, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 165
    .line 166
    iput-object v4, v7, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 167
    .line 168
    iput-object v4, v7, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 169
    .line 170
    iput-object v4, v7, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 171
    .line 172
    if-eqz v3, :cond_b6

    .line 173
    .line 174
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lax/o4/h$c;

    .line 179
    .line 180
    invoke-direct {p0, v3, v4}, Lax/o4/h;->H0(Lax/o4/g$r;Lax/o4/h$c;)V

    .line 181
    .line 182
    .line 183
    :cond_b6
    if-eqz v5, :cond_e6

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    const/4 v4, 0x2

    .line 190
    if-le v3, v4, :cond_e6

    .line 191
    .line 192
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lax/o4/h$c;

    .line 197
    .line 198
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Lax/o4/h$c;

    .line 203
    .line 204
    const/4 v4, 0x1

    .line 205
    :goto_cc
    add-int/lit8 v7, v2, -0x1

    .line 206
    .line 207
    if-ge v4, v7, :cond_e6

    .line 208
    .line 209
    add-int/2addr v4, v1

    .line 210
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    check-cast v7, Lax/o4/h$c;

    .line 215
    .line 216
    iget-boolean v8, v3, Lax/o4/h$c;->e:Z

    .line 217
    .line 218
    if-eqz v8, :cond_e0

    .line 219
    .line 220
    invoke-direct {p0, v0, v3, v7}, Lax/o4/h;->n0(Lax/o4/h$c;Lax/o4/h$c;Lax/o4/h$c;)Lax/o4/h$c;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_e1

    .line 225
    :cond_e0
    move-object v0, v3

    .line 226
    :goto_e1
    invoke-direct {p0, v5, v0}, Lax/o4/h;->H0(Lax/o4/g$r;Lax/o4/h$c;)V

    .line 227
    .line 228
    .line 229
    move-object v3, v7

    .line 230
    goto :goto_cc

    .line 231
    :cond_e6
    if-eqz v6, :cond_f2

    .line 232
    .line 233
    sub-int/2addr v2, v1

    .line 234
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    check-cast p1, Lax/o4/h$c;

    .line 239
    .line 240
    invoke-direct {p0, v6, p1}, Lax/o4/h;->H0(Lax/o4/g$r;Lax/o4/h$c;)V

    .line 241
    .line 242
    .line 243
    :cond_f2
    :goto_f2
    return-void
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

.method private J(Lax/o4/g$Q;Lax/o4/g$Q;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p2, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 6
    .line 7
    iput-object v0, p1, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 8
    .line 9
    :cond_8
    iget-object v0, p1, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 10
    .line 11
    if-nez v0, :cond_10

    .line 12
    .line 13
    iget-object v0, p2, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 14
    .line 15
    iput-object v0, p1, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p1, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 18
    .line 19
    if-nez v0, :cond_18

    .line 20
    .line 21
    iget-object v0, p2, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 22
    .line 23
    iput-object v0, p1, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 24
    .line 25
    :cond_18
    iget-object v0, p1, Lax/o4/g$Q;->p:Lax/o4/g$p;

    .line 26
    .line 27
    if-nez v0, :cond_20

    .line 28
    .line 29
    iget-object v0, p2, Lax/o4/g$Q;->p:Lax/o4/g$p;

    .line 30
    .line 31
    iput-object v0, p1, Lax/o4/g$Q;->p:Lax/o4/g$p;

    .line 32
    .line 33
    :cond_20
    iget-object v0, p1, Lax/o4/g$Q;->q:Lax/o4/g$p;

    .line 34
    .line 35
    if-nez v0, :cond_28

    .line 36
    .line 37
    iget-object p2, p2, Lax/o4/g$Q;->q:Lax/o4/g$p;

    .line 38
    .line 39
    iput-object p2, p1, Lax/o4/g$Q;->q:Lax/o4/g$p;

    .line 40
    .line 41
    :cond_28
    return-void
.end method

.method private J0(Lax/o4/g$s;Lax/o4/g$K;Lax/o4/g$b;)V
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "Mask render"

    .line 5
    .line 6
    invoke-static {v2, v1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p1, Lax/o4/g$s;->o:Ljava/lang/Boolean;

    .line 10
    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-eqz v1, :cond_2b

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2b

    .line 20
    .line 21
    iget-object v1, p1, Lax/o4/g$s;->s:Lax/o4/g$p;

    .line 22
    .line 23
    if-eqz v1, :cond_1d

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    goto :goto_1f

    .line 30
    :cond_1d
    iget v1, p3, Lax/o4/g$b;->c:F

    .line 31
    .line 32
    :goto_1f
    iget-object v3, p1, Lax/o4/g$s;->t:Lax/o4/g$p;

    .line 33
    .line 34
    if-eqz v3, :cond_28

    .line 35
    .line 36
    invoke-virtual {v3, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    goto :goto_4a

    .line 41
    :cond_28
    iget v3, p3, Lax/o4/g$b;->d:F

    .line 42
    .line 43
    goto :goto_4a

    .line 44
    :cond_2b
    iget-object v1, p1, Lax/o4/g$s;->s:Lax/o4/g$p;

    .line 45
    .line 46
    const v3, 0x3f99999a    # 1.2f

    .line 47
    .line 48
    .line 49
    if-eqz v1, :cond_37

    .line 50
    .line 51
    invoke-virtual {v1, p0, v2}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    const v1, 0x3f99999a    # 1.2f

    .line 57
    .line 58
    .line 59
    :goto_3a
    iget-object v4, p1, Lax/o4/g$s;->t:Lax/o4/g$p;

    .line 60
    .line 61
    if-eqz v4, :cond_42

    .line 62
    .line 63
    invoke-virtual {v4, p0, v2}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    :cond_42
    iget v4, p3, Lax/o4/g$b;->c:F

    .line 68
    .line 69
    mul-float v1, v1, v4

    .line 70
    .line 71
    iget v4, p3, Lax/o4/g$b;->d:F

    .line 72
    .line 73
    mul-float v3, v3, v4

    .line 74
    .line 75
    :goto_4a
    const/4 v4, 0x0

    .line 76
    cmpl-float v1, v1, v4

    .line 77
    .line 78
    if-eqz v1, :cond_9b

    .line 79
    .line 80
    cmpl-float v1, v3, v4

    .line 81
    .line 82
    if-nez v1, :cond_54

    .line 83
    .line 84
    goto :goto_9b

    .line 85
    :cond_54
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, p1}, Lax/o4/h;->M(Lax/o4/g$N;)Lax/o4/h$h;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 93
    .line 94
    iget-object v1, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 95
    .line 96
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v1, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 101
    .line 102
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 107
    .line 108
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 109
    .line 110
    .line 111
    iget-object v2, p1, Lax/o4/g$s;->p:Ljava/lang/Boolean;

    .line 112
    .line 113
    if-eqz v2, :cond_8b

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_79

    .line 120
    .line 121
    goto :goto_8b

    .line 122
    :cond_79
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 123
    .line 124
    iget v3, p3, Lax/o4/g$b;->a:F

    .line 125
    .line 126
    iget v4, p3, Lax/o4/g$b;->b:F

    .line 127
    .line 128
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 129
    .line 130
    .line 131
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 132
    .line 133
    iget v3, p3, Lax/o4/g$b;->c:F

    .line 134
    .line 135
    iget v4, p3, Lax/o4/g$b;->d:F

    .line 136
    .line 137
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 138
    .line 139
    .line 140
    :cond_8b
    :goto_8b
    invoke-direct {p0, p1, v0}, Lax/o4/h;->F0(Lax/o4/g$J;Z)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 146
    .line 147
    .line 148
    if-eqz v1, :cond_98

    .line 149
    .line 150
    invoke-direct {p0, p2, p3}, Lax/o4/h;->k0(Lax/o4/g$K;Lax/o4/g$b;)V

    .line 151
    .line 152
    .line 153
    :cond_98
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 154
    .line 155
    .line 156
    :cond_9b
    :goto_9b
    return-void
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

.method private K(Lax/o4/g$y;Ljava/lang/String;)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 4
    .line 5
    invoke-virtual {v2, p2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_14

    .line 10
    .line 11
    const-string p1, "Pattern reference \'%s\' not found"

    .line 12
    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p2, v0, v1

    .line 16
    .line 17
    invoke-static {p1, v0}, Lax/o4/h;->Z0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    instance-of v3, v2, Lax/o4/g$y;

    .line 22
    .line 23
    if-nez v3, :cond_20

    .line 24
    .line 25
    new-array p1, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string p2, "Pattern href attributes must point to other pattern elements"

    .line 28
    .line 29
    invoke-static {p2, p1}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-ne v2, p1, :cond_2c

    .line 34
    .line 35
    const-string p1, "Circular reference in pattern href attribute \'%s\'"

    .line 36
    .line 37
    new-array v0, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    aput-object p2, v0, v1

    .line 40
    .line 41
    invoke-static {p1, v0}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    check-cast v2, Lax/o4/g$y;

    .line 46
    .line 47
    iget-object p2, p1, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 48
    .line 49
    if-nez p2, :cond_36

    .line 50
    .line 51
    iget-object p2, v2, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 52
    .line 53
    iput-object p2, p1, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 54
    .line 55
    :cond_36
    iget-object p2, p1, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 56
    .line 57
    if-nez p2, :cond_3e

    .line 58
    .line 59
    iget-object p2, v2, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 60
    .line 61
    iput-object p2, p1, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 62
    .line 63
    :cond_3e
    iget-object p2, p1, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 64
    .line 65
    if-nez p2, :cond_46

    .line 66
    .line 67
    iget-object p2, v2, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 68
    .line 69
    iput-object p2, p1, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 70
    .line 71
    :cond_46
    iget-object p2, p1, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 72
    .line 73
    if-nez p2, :cond_4e

    .line 74
    .line 75
    iget-object p2, v2, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 76
    .line 77
    iput-object p2, p1, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 78
    .line 79
    :cond_4e
    iget-object p2, p1, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 80
    .line 81
    if-nez p2, :cond_56

    .line 82
    .line 83
    iget-object p2, v2, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 84
    .line 85
    iput-object p2, p1, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 86
    .line 87
    :cond_56
    iget-object p2, p1, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 88
    .line 89
    if-nez p2, :cond_5e

    .line 90
    .line 91
    iget-object p2, v2, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 92
    .line 93
    iput-object p2, p1, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 94
    .line 95
    :cond_5e
    iget-object p2, p1, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 96
    .line 97
    if-nez p2, :cond_66

    .line 98
    .line 99
    iget-object p2, v2, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 100
    .line 101
    iput-object p2, p1, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 102
    .line 103
    :cond_66
    iget-object p2, p1, Lax/o4/g$H;->i:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_72

    .line 110
    .line 111
    iget-object p2, v2, Lax/o4/g$H;->i:Ljava/util/List;

    .line 112
    .line 113
    iput-object p2, p1, Lax/o4/g$H;->i:Ljava/util/List;

    .line 114
    .line 115
    :cond_72
    iget-object p2, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 116
    .line 117
    if-nez p2, :cond_7a

    .line 118
    .line 119
    iget-object p2, v2, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 120
    .line 121
    iput-object p2, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 122
    .line 123
    :cond_7a
    iget-object p2, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 124
    .line 125
    if-nez p2, :cond_82

    .line 126
    .line 127
    iget-object p2, v2, Lax/o4/g$P;->o:Lax/o4/e;

    .line 128
    .line 129
    iput-object p2, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 130
    .line 131
    :cond_82
    iget-object p2, v2, Lax/o4/g$y;->x:Ljava/lang/String;

    .line 132
    .line 133
    if-eqz p2, :cond_89

    .line 134
    .line 135
    invoke-direct {p0, p1, p2}, Lax/o4/h;->K(Lax/o4/g$y;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_89
    return-void
    .line 139
.end method

.method private K0(Lax/o4/g$S;)V
    .registers 7

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lax/o4/g;->k()Lax/o4/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lax/o4/g$H;->b()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_13
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_74

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lax/o4/g$N;

    .line 31
    .line 32
    instance-of v2, v1, Lax/o4/g$G;

    .line 33
    .line 34
    if-nez v2, :cond_24

    .line 35
    .line 36
    goto :goto_13

    .line 37
    :cond_24
    move-object v2, v1

    .line 38
    check-cast v2, Lax/o4/g$G;

    .line 39
    .line 40
    invoke-interface {v2}, Lax/o4/g$G;->d()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_2e

    .line 45
    .line 46
    goto :goto_13

    .line 47
    :cond_2e
    invoke-interface {v2}, Lax/o4/g$G;->a()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_41

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_13

    .line 58
    .line 59
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_41

    .line 64
    .line 65
    goto :goto_13

    .line 66
    :cond_41
    invoke-interface {v2}, Lax/o4/g$G;->h()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_5d

    .line 71
    .line 72
    sget-object v4, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 73
    .line 74
    if-nez v4, :cond_4e

    .line 75
    .line 76
    invoke-static {}, Lax/o4/h;->V()V

    .line 77
    .line 78
    .line 79
    :cond_4e
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_13

    .line 84
    .line 85
    sget-object v4, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_5d

    .line 92
    .line 93
    goto :goto_13

    .line 94
    :cond_5d
    invoke-interface {v2}, Lax/o4/g$G;->l()Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    if-eqz v3, :cond_67

    .line 99
    .line 100
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    goto :goto_13

    .line 104
    :cond_67
    invoke-interface {v2}, Lax/o4/g$G;->n()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-eqz v2, :cond_71

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    goto :goto_13

    .line 114
    :cond_71
    invoke-direct {p0, v1}, Lax/o4/h;->A0(Lax/o4/g$N;)V

    .line 115
    .line 116
    .line 117
    :cond_74
    return-void
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

.method private L(Lax/o4/g$K;Landroid/graphics/Path;Lax/o4/g$y;)V
    .registers 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v5, v2, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v5, :cond_12

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_12

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v5, 0x0

    .line 20
    :goto_13
    iget-object v8, v2, Lax/o4/g$y;->x:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v8, :cond_1a

    .line 23
    .line 24
    invoke-direct {v0, v2, v8}, Lax/o4/h;->K(Lax/o4/g$y;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    const/4 v8, 0x0

    .line 28
    if-eqz v5, :cond_46

    .line 29
    .line 30
    iget-object v5, v2, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 31
    .line 32
    if-eqz v5, :cond_26

    .line 33
    .line 34
    invoke-virtual {v5, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    goto :goto_27

    .line 39
    :cond_26
    const/4 v5, 0x0

    .line 40
    :goto_27
    iget-object v9, v2, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 41
    .line 42
    if-eqz v9, :cond_30

    .line 43
    .line 44
    invoke-virtual {v9, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    const/4 v9, 0x0

    .line 50
    :goto_31
    iget-object v10, v2, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 51
    .line 52
    if-eqz v10, :cond_3a

    .line 53
    .line 54
    invoke-virtual {v10, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    const/4 v10, 0x0

    .line 60
    :goto_3b
    iget-object v11, v2, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 61
    .line 62
    if-eqz v11, :cond_44

    .line 63
    .line 64
    invoke-virtual {v11, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    goto :goto_8a

    .line 69
    :cond_44
    const/4 v11, 0x0

    .line 70
    goto :goto_8a

    .line 71
    :cond_46
    iget-object v5, v2, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 72
    .line 73
    const/high16 v9, 0x3f800000    # 1.0f

    .line 74
    .line 75
    if-eqz v5, :cond_51

    .line 76
    .line 77
    invoke-virtual {v5, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    goto :goto_52

    .line 82
    :cond_51
    const/4 v5, 0x0

    .line 83
    :goto_52
    iget-object v10, v2, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 84
    .line 85
    if-eqz v10, :cond_5b

    .line 86
    .line 87
    invoke-virtual {v10, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    goto :goto_5c

    .line 92
    :cond_5b
    const/4 v10, 0x0

    .line 93
    :goto_5c
    iget-object v11, v2, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 94
    .line 95
    if-eqz v11, :cond_65

    .line 96
    .line 97
    invoke-virtual {v11, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    goto :goto_66

    .line 102
    :cond_65
    const/4 v11, 0x0

    .line 103
    :goto_66
    iget-object v12, v2, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 104
    .line 105
    if-eqz v12, :cond_6f

    .line 106
    .line 107
    invoke-virtual {v12, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    goto :goto_70

    .line 112
    :cond_6f
    const/4 v9, 0x0

    .line 113
    :goto_70
    iget-object v12, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 114
    .line 115
    iget v13, v12, Lax/o4/g$b;->a:F

    .line 116
    .line 117
    iget v14, v12, Lax/o4/g$b;->c:F

    .line 118
    .line 119
    mul-float v5, v5, v14

    .line 120
    .line 121
    add-float/2addr v5, v13

    .line 122
    iget v13, v12, Lax/o4/g$b;->b:F

    .line 123
    .line 124
    iget v12, v12, Lax/o4/g$b;->d:F

    .line 125
    .line 126
    mul-float v10, v10, v12

    .line 127
    .line 128
    add-float/2addr v10, v13

    .line 129
    mul-float v11, v11, v14

    .line 130
    .line 131
    mul-float v9, v9, v12

    .line 132
    .line 133
    move/from16 v21, v11

    .line 134
    .line 135
    move v11, v9

    .line 136
    move v9, v10

    .line 137
    move/from16 v10, v21

    .line 138
    .line 139
    :goto_8a
    cmpl-float v12, v10, v8

    .line 140
    .line 141
    if-eqz v12, :cond_215

    .line 142
    .line 143
    cmpl-float v12, v11, v8

    .line 144
    .line 145
    if-nez v12, :cond_94

    .line 146
    .line 147
    goto/16 :goto_215

    .line 148
    .line 149
    :cond_94
    iget-object v12, v2, Lax/o4/g$P;->o:Lax/o4/e;

    .line 150
    .line 151
    if-eqz v12, :cond_99

    .line 152
    .line 153
    goto :goto_9b

    .line 154
    :cond_99
    sget-object v12, Lax/o4/e;->e:Lax/o4/e;

    .line 155
    .line 156
    :goto_9b
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 157
    .line 158
    .line 159
    iget-object v13, v0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 160
    .line 161
    move-object/from16 v14, p2

    .line 162
    .line 163
    invoke-virtual {v13, v14}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 164
    .line 165
    .line 166
    new-instance v13, Lax/o4/h$h;

    .line 167
    .line 168
    invoke-direct {v13, v0}, Lax/o4/h$h;-><init>(Lax/o4/h;)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lax/o4/g$E;->b()Lax/o4/g$E;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    invoke-direct {v0, v13, v14}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 176
    .line 177
    .line 178
    iget-object v14, v13, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 179
    .line 180
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    iput-object v15, v14, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-direct {v0, v2, v13}, Lax/o4/h;->N(Lax/o4/g$N;Lax/o4/h$h;)Lax/o4/h$h;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iput-object v13, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 189
    .line 190
    iget-object v13, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 191
    .line 192
    iget-object v14, v2, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 193
    .line 194
    if-eqz v14, :cond_162

    .line 195
    .line 196
    iget-object v15, v0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 197
    .line 198
    invoke-virtual {v15, v14}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 199
    .line 200
    .line 201
    new-instance v14, Landroid/graphics/Matrix;

    .line 202
    .line 203
    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    .line 204
    .line 205
    .line 206
    iget-object v15, v2, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 207
    .line 208
    invoke-virtual {v15, v14}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 209
    .line 210
    .line 211
    move-result v15

    .line 212
    if-eqz v15, :cond_162

    .line 213
    .line 214
    iget-object v13, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 215
    .line 216
    iget v15, v13, Lax/o4/g$b;->a:F

    .line 217
    .line 218
    const/16 v16, 0x2

    .line 219
    .line 220
    iget v4, v13, Lax/o4/g$b;->b:F

    .line 221
    .line 222
    invoke-virtual {v13}, Lax/o4/g$b;->b()F

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    iget-object v6, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 229
    .line 230
    const/16 v18, 0x1

    .line 231
    .line 232
    iget v7, v6, Lax/o4/g$b;->b:F

    .line 233
    .line 234
    invoke-virtual {v6}, Lax/o4/g$b;->b()F

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    iget-object v8, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 239
    .line 240
    invoke-virtual {v8}, Lax/o4/g$b;->c()F

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    const/16 v19, 0x6

    .line 245
    .line 246
    iget-object v3, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 247
    .line 248
    move/from16 p2, v4

    .line 249
    .line 250
    iget v4, v3, Lax/o4/g$b;->a:F

    .line 251
    .line 252
    invoke-virtual {v3}, Lax/o4/g$b;->c()F

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    move/from16 v20, v3

    .line 257
    .line 258
    const/16 v3, 0x8

    .line 259
    .line 260
    new-array v3, v3, [F

    .line 261
    .line 262
    aput v15, v3, v17

    .line 263
    .line 264
    aput p2, v3, v18

    .line 265
    .line 266
    aput v13, v3, v16

    .line 267
    .line 268
    const/4 v13, 0x3

    .line 269
    aput v7, v3, v13

    .line 270
    .line 271
    const/4 v7, 0x4

    .line 272
    aput v6, v3, v7

    .line 273
    .line 274
    const/4 v6, 0x5

    .line 275
    aput v8, v3, v6

    .line 276
    .line 277
    aput v4, v3, v19

    .line 278
    .line 279
    const/4 v4, 0x7

    .line 280
    aput v20, v3, v4

    .line 281
    .line 282
    invoke-virtual {v14, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 283
    .line 284
    .line 285
    new-instance v4, Landroid/graphics/RectF;

    .line 286
    .line 287
    aget v6, v3, v17

    .line 288
    .line 289
    aget v7, v3, v18

    .line 290
    .line 291
    invoke-direct {v4, v6, v7, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 292
    .line 293
    .line 294
    const/4 v6, 0x2

    .line 295
    const/4 v7, 0x6

    .line 296
    :goto_127
    if-gt v6, v7, :cond_152

    .line 297
    .line 298
    aget v8, v3, v6

    .line 299
    .line 300
    iget v13, v4, Landroid/graphics/RectF;->left:F

    .line 301
    .line 302
    cmpg-float v13, v8, v13

    .line 303
    .line 304
    if-gez v13, :cond_133

    .line 305
    .line 306
    iput v8, v4, Landroid/graphics/RectF;->left:F

    .line 307
    .line 308
    :cond_133
    iget v13, v4, Landroid/graphics/RectF;->right:F

    .line 309
    .line 310
    cmpl-float v13, v8, v13

    .line 311
    .line 312
    if-lez v13, :cond_13b

    .line 313
    .line 314
    iput v8, v4, Landroid/graphics/RectF;->right:F

    .line 315
    .line 316
    :cond_13b
    add-int/lit8 v8, v6, 0x1

    .line 317
    .line 318
    aget v8, v3, v8

    .line 319
    .line 320
    iget v13, v4, Landroid/graphics/RectF;->top:F

    .line 321
    .line 322
    cmpg-float v13, v8, v13

    .line 323
    .line 324
    if-gez v13, :cond_147

    .line 325
    .line 326
    iput v8, v4, Landroid/graphics/RectF;->top:F

    .line 327
    .line 328
    :cond_147
    iget v13, v4, Landroid/graphics/RectF;->bottom:F

    .line 329
    .line 330
    cmpl-float v13, v8, v13

    .line 331
    .line 332
    if-lez v13, :cond_14f

    .line 333
    .line 334
    iput v8, v4, Landroid/graphics/RectF;->bottom:F

    .line 335
    .line 336
    :cond_14f
    add-int/lit8 v6, v6, 0x2

    .line 337
    .line 338
    goto :goto_127

    .line 339
    :cond_152
    new-instance v13, Lax/o4/g$b;

    .line 340
    .line 341
    iget v3, v4, Landroid/graphics/RectF;->left:F

    .line 342
    .line 343
    iget v6, v4, Landroid/graphics/RectF;->top:F

    .line 344
    .line 345
    iget v7, v4, Landroid/graphics/RectF;->right:F

    .line 346
    .line 347
    sub-float/2addr v7, v3

    .line 348
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 349
    .line 350
    sub-float/2addr v4, v6

    .line 351
    invoke-direct {v13, v3, v6, v7, v4}, Lax/o4/g$b;-><init>(FFFF)V

    .line 352
    .line 353
    .line 354
    goto :goto_166

    .line 355
    :cond_162
    const/16 v17, 0x0

    .line 356
    .line 357
    const/16 v18, 0x1

    .line 358
    .line 359
    :goto_166
    iget v3, v13, Lax/o4/g$b;->a:F

    .line 360
    .line 361
    sub-float/2addr v3, v5

    .line 362
    div-float/2addr v3, v10

    .line 363
    float-to-double v3, v3

    .line 364
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 365
    .line 366
    .line 367
    move-result-wide v3

    .line 368
    double-to-float v3, v3

    .line 369
    mul-float v3, v3, v10

    .line 370
    .line 371
    add-float/2addr v5, v3

    .line 372
    iget v3, v13, Lax/o4/g$b;->b:F

    .line 373
    .line 374
    sub-float/2addr v3, v9

    .line 375
    div-float/2addr v3, v11

    .line 376
    float-to-double v3, v3

    .line 377
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 378
    .line 379
    .line 380
    move-result-wide v3

    .line 381
    double-to-float v3, v3

    .line 382
    mul-float v3, v3, v11

    .line 383
    .line 384
    add-float/2addr v9, v3

    .line 385
    invoke-virtual {v13}, Lax/o4/g$b;->b()F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-virtual {v13}, Lax/o4/g$b;->c()F

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    new-instance v6, Lax/o4/g$b;

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    invoke-direct {v6, v7, v7, v10, v11}, Lax/o4/g$b;-><init>(FFFF)V

    .line 397
    .line 398
    .line 399
    invoke-direct {v0}, Lax/o4/h;->m0()Z

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    :goto_192
    cmpg-float v8, v9, v4

    .line 404
    .line 405
    if-gez v8, :cond_20d

    .line 406
    .line 407
    move v8, v5

    .line 408
    :goto_197
    cmpg-float v13, v8, v3

    .line 409
    .line 410
    if-gez v13, :cond_209

    .line 411
    .line 412
    iput v8, v6, Lax/o4/g$b;->a:F

    .line 413
    .line 414
    iput v9, v6, Lax/o4/g$b;->b:F

    .line 415
    .line 416
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 417
    .line 418
    .line 419
    iget-object v13, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 420
    .line 421
    iget-object v13, v13, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 422
    .line 423
    iget-object v13, v13, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v13

    .line 429
    if-nez v13, :cond_1bc

    .line 430
    .line 431
    iget v13, v6, Lax/o4/g$b;->a:F

    .line 432
    .line 433
    iget v14, v6, Lax/o4/g$b;->b:F

    .line 434
    .line 435
    iget v15, v6, Lax/o4/g$b;->c:F

    .line 436
    .line 437
    move/from16 p2, v3

    .line 438
    .line 439
    iget v3, v6, Lax/o4/g$b;->d:F

    .line 440
    .line 441
    invoke-direct {v0, v13, v14, v15, v3}, Lax/o4/h;->O0(FFFF)V

    .line 442
    .line 443
    .line 444
    goto :goto_1be

    .line 445
    :cond_1bc
    move/from16 p2, v3

    .line 446
    .line 447
    :goto_1be
    iget-object v3, v2, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 448
    .line 449
    if-eqz v3, :cond_1cc

    .line 450
    .line 451
    iget-object v13, v0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 452
    .line 453
    invoke-direct {v0, v6, v3, v12}, Lax/o4/h;->o(Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)Landroid/graphics/Matrix;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v13, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 458
    .line 459
    .line 460
    goto :goto_1ec

    .line 461
    :cond_1cc
    iget-object v3, v2, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 462
    .line 463
    if-eqz v3, :cond_1d9

    .line 464
    .line 465
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_1d7

    .line 470
    .line 471
    goto :goto_1d9

    .line 472
    :cond_1d7
    const/4 v3, 0x0

    .line 473
    goto :goto_1da

    .line 474
    :cond_1d9
    :goto_1d9
    const/4 v3, 0x1

    .line 475
    :goto_1da
    iget-object v13, v0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 476
    .line 477
    invoke-virtual {v13, v8, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 478
    .line 479
    .line 480
    if-nez v3, :cond_1ec

    .line 481
    .line 482
    iget-object v3, v0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 483
    .line 484
    iget-object v13, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 485
    .line 486
    iget v14, v13, Lax/o4/g$b;->c:F

    .line 487
    .line 488
    iget v13, v13, Lax/o4/g$b;->d:F

    .line 489
    .line 490
    invoke-virtual {v3, v14, v13}, Landroid/graphics/Canvas;->scale(FF)V

    .line 491
    .line 492
    .line 493
    :cond_1ec
    :goto_1ec
    iget-object v3, v2, Lax/o4/g$H;->i:Ljava/util/List;

    .line 494
    .line 495
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    :goto_1f2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v13

    .line 503
    if-eqz v13, :cond_202

    .line 504
    .line 505
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v13

    .line 509
    check-cast v13, Lax/o4/g$N;

    .line 510
    .line 511
    invoke-direct {v0, v13}, Lax/o4/h;->A0(Lax/o4/g$N;)V

    .line 512
    .line 513
    .line 514
    goto :goto_1f2

    .line 515
    :cond_202
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 516
    .line 517
    .line 518
    add-float/2addr v8, v10

    .line 519
    move/from16 v3, p2

    .line 520
    .line 521
    goto :goto_197

    .line 522
    :cond_209
    move/from16 p2, v3

    .line 523
    .line 524
    add-float/2addr v9, v11

    .line 525
    goto :goto_192

    .line 526
    :cond_20d
    if-eqz v7, :cond_212

    .line 527
    .line 528
    invoke-direct {v0, v2}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 529
    .line 530
    .line 531
    :cond_212
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 532
    .line 533
    .line 534
    :cond_215
    :goto_215
    return-void
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
.end method

.method private L0(Lax/o4/g$Z;)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "TextPath render"

    .line 5
    .line 6
    invoke-static {v2, v1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v1, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_15

    .line 19
    .line 20
    goto/16 :goto_89

    .line 21
    .line 22
    :cond_15
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1c

    .line 27
    .line 28
    goto :goto_89

    .line 29
    :cond_1c
    iget-object v1, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 30
    .line 31
    iget-object v2, p1, Lax/o4/g$Z;->o:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_33

    .line 38
    .line 39
    iget-object p1, p1, Lax/o4/g$Z;->o:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    new-array v1, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object p1, v1, v0

    .line 45
    .line 46
    const-string p1, "TextPath reference \'%s\' not found"

    .line 47
    .line 48
    invoke-static {p1, v1}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    check-cast v1, Lax/o4/g$v;

    .line 53
    .line 54
    new-instance v2, Lax/o4/h$d;

    .line 55
    .line 56
    iget-object v3, v1, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 57
    .line 58
    invoke-direct {v2, p0, v3}, Lax/o4/h$d;-><init>(Lax/o4/h;Lax/o4/g$w;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lax/o4/h$d;->f()Landroid/graphics/Path;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v1, v1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 66
    .line 67
    if-eqz v1, :cond_47

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 73
    .line 74
    invoke-direct {v1, v2, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, Lax/o4/g$Z;->p:Lax/o4/g$p;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    if-eqz v0, :cond_5a

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v0, p0, v1}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    goto :goto_5b

    .line 91
    :cond_5a
    const/4 v0, 0x0

    .line 92
    :goto_5b
    invoke-direct {p0}, Lax/o4/h;->O()Lax/o4/g$E$f;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sget-object v4, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 97
    .line 98
    if-eq v1, v4, :cond_6f

    .line 99
    .line 100
    invoke-direct {p0, p1}, Lax/o4/h;->n(Lax/o4/g$Y;)F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    sget-object v5, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 105
    .line 106
    if-ne v1, v5, :cond_6e

    .line 107
    .line 108
    const/high16 v1, 0x40000000    # 2.0f

    .line 109
    .line 110
    div-float/2addr v4, v1

    .line 111
    :cond_6e
    sub-float/2addr v0, v4

    .line 112
    :cond_6f
    invoke-virtual {p1}, Lax/o4/g$Z;->f()Lax/o4/g$b0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lax/o4/g$K;

    .line 117
    .line 118
    invoke-direct {p0, v1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    new-instance v4, Lax/o4/h$e;

    .line 126
    .line 127
    invoke-direct {v4, p0, v2, v0, v3}, Lax/o4/h$e;-><init>(Lax/o4/h;Landroid/graphics/Path;FF)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, p1, v4}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 131
    .line 132
    .line 133
    if-eqz v1, :cond_89

    .line 134
    .line 135
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 136
    .line 137
    .line 138
    :cond_89
    :goto_89
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private M(Lax/o4/g$N;)Lax/o4/h$h;
    .registers 4

    .line 1
    new-instance v0, Lax/o4/h$h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/h$h;-><init>(Lax/o4/h;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/o4/g$E;->b()Lax/o4/g$E;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0, v0, v1}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Lax/o4/h;->N(Lax/o4/g$N;Lax/o4/h$h;)Lax/o4/h$h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private M0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmpg-float v0, v0, v1

    .line 14
    .line 15
    if-ltz v0, :cond_1b

    .line 16
    .line 17
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 18
    .line 19
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 20
    .line 21
    iget-object v0, v0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_1b
    :goto_1b
    const/4 v0, 0x1

    .line 29
    return v0
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

.method private N(Lax/o4/g$N;Lax/o4/h$h;)Lax/o4/h$h;
    .registers 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_5
    instance-of v1, p1, Lax/o4/g$L;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_10

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Lax/o4/g$L;

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object p1, p1, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 18
    .line 19
    if-nez p1, :cond_31

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    :goto_18
    if-ge v2, p1, :cond_26

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    check-cast v1, Lax/o4/g$L;

    .line 34
    .line 35
    invoke-direct {p0, p2, v1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 36
    .line 37
    .line 38
    goto :goto_18

    .line 39
    :cond_26
    iget-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 40
    .line 41
    iget-object v0, p1, Lax/o4/h$h;->g:Lax/o4/g$b;

    .line 42
    .line 43
    iput-object v0, p2, Lax/o4/h$h;->g:Lax/o4/g$b;

    .line 44
    .line 45
    iget-object p1, p1, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 46
    .line 47
    iput-object p1, p2, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 48
    .line 49
    return-object p2

    .line 50
    :cond_31
    check-cast p1, Lax/o4/g$N;

    .line 51
    .line 52
    goto :goto_5
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

.method private N0()V
    .registers 4

    .line 1
    new-instance v0, Lax/o4/h$h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/h$h;-><init>(Lax/o4/h;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 7
    .line 8
    new-instance v0, Ljava/util/Stack;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 14
    .line 15
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 16
    .line 17
    invoke-static {}, Lax/o4/g$E;->b()Lax/o4/g$E;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0, v0, v1}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iput-boolean v1, v0, Lax/o4/h$h;->h:Z

    .line 31
    .line 32
    iget-object v1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 33
    .line 34
    new-instance v2, Lax/o4/h$h;

    .line 35
    .line 36
    invoke-direct {v2, p0, v0}, Lax/o4/h$h;-><init>(Lax/o4/h;Lax/o4/h$h;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v0, Ljava/util/Stack;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lax/o4/h;->g:Ljava/util/Stack;

    .line 48
    .line 49
    new-instance v0, Ljava/util/Stack;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lax/o4/h;->f:Ljava/util/Stack;

    .line 55
    .line 56
    return-void
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

.method private O()Lax/o4/g$E$f;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v1, v0, Lax/o4/g$E;->u0:Lax/o4/g$E$h;

    .line 6
    .line 7
    sget-object v2, Lax/o4/g$E$h;->q:Lax/o4/g$E$h;

    .line 8
    .line 9
    if-eq v1, v2, :cond_18

    .line 10
    .line 11
    iget-object v1, v0, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 12
    .line 13
    sget-object v2, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 14
    .line 15
    if-ne v1, v2, :cond_11

    .line 16
    .line 17
    goto :goto_18

    .line 18
    :cond_11
    sget-object v0, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 19
    .line 20
    if-ne v1, v0, :cond_17

    .line 21
    .line 22
    sget-object v0, Lax/o4/g$E$f;->d0:Lax/o4/g$E$f;

    .line 23
    .line 24
    :cond_17
    return-object v0

    .line 25
    :cond_18
    :goto_18
    iget-object v0, v0, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 26
    .line 27
    return-object v0
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

.method private O0(FFFF)V
    .registers 6

    .line 1
    add-float/2addr p3, p1

    .line 2
    add-float/2addr p4, p2

    .line 3
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 6
    .line 7
    iget-object v0, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 8
    .line 9
    if-eqz v0, :cond_38

    .line 10
    .line 11
    iget-object v0, v0, Lax/o4/g$c;->d:Lax/o4/g$p;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-float/2addr p1, v0

    .line 18
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 19
    .line 20
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 21
    .line 22
    iget-object v0, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 23
    .line 24
    iget-object v0, v0, Lax/o4/g$c;->a:Lax/o4/g$p;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-float/2addr p2, v0

    .line 31
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 32
    .line 33
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 34
    .line 35
    iget-object v0, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 36
    .line 37
    iget-object v0, v0, Lax/o4/g$c;->b:Lax/o4/g$p;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sub-float/2addr p3, v0

    .line 44
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 45
    .line 46
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 47
    .line 48
    iget-object v0, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 49
    .line 50
    iget-object v0, v0, Lax/o4/g$c;->c:Lax/o4/g$p;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-float/2addr p4, v0

    .line 57
    :cond_38
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 60
    .line 61
    .line 62
    return-void
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

.method private P()Landroid/graphics/Path$FillType;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->G0:Lax/o4/g$E$a;

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    sget-object v1, Lax/o4/g$E$a;->c0:Lax/o4/g$E$a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_f

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_f
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method private P0(Lax/o4/h$h;ZLax/o4/g$O;)V
    .registers 6

    .line 1
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 2
    .line 3
    if-eqz p2, :cond_7

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    iget-object v0, v0, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 9
    .line 10
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    instance-of v1, p3, Lax/o4/g$f;

    .line 15
    .line 16
    if-eqz v1, :cond_16

    .line 17
    .line 18
    check-cast p3, Lax/o4/g$f;

    .line 19
    .line 20
    iget p3, p3, Lax/o4/g$f;->q:I

    .line 21
    .line 22
    goto :goto_20

    .line 23
    :cond_16
    instance-of p3, p3, Lax/o4/g$g;

    .line 24
    .line 25
    if-eqz p3, :cond_31

    .line 26
    .line 27
    iget-object p3, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 28
    .line 29
    iget-object p3, p3, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 30
    .line 31
    iget p3, p3, Lax/o4/g$f;->q:I

    .line 32
    .line 33
    :goto_20
    invoke-static {p3, v0}, Lax/o4/h;->x(IF)I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    if-eqz p2, :cond_2c

    .line 38
    .line 39
    iget-object p1, p1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    iget-object p1, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    :cond_31
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

.method private Q0(ZLax/o4/g$C;)V
    .registers 12

    .line 1
    const-wide v0, 0x180000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v2, 0x100000000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const-wide v6, 0x80000000L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_4e

    .line 19
    .line 20
    iget-object v8, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 21
    .line 22
    invoke-direct {p0, v8, v6, v7}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_2a

    .line 27
    .line 28
    iget-object v6, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 29
    .line 30
    iget-object v7, v6, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 31
    .line 32
    iget-object v8, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 33
    .line 34
    iget-object v8, v8, Lax/o4/g$E;->I0:Lax/o4/g$O;

    .line 35
    .line 36
    iput-object v8, v7, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 37
    .line 38
    if-eqz v8, :cond_28

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    :cond_28
    iput-boolean v4, v6, Lax/o4/h$h;->b:Z

    .line 42
    .line 43
    :cond_2a
    iget-object v4, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 44
    .line 45
    invoke-direct {p0, v4, v2, v3}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3c

    .line 50
    .line 51
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 52
    .line 53
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 54
    .line 55
    iget-object v3, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 56
    .line 57
    iget-object v3, v3, Lax/o4/g$E;->J0:Ljava/lang/Float;

    .line 58
    .line 59
    iput-object v3, v2, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 60
    .line 61
    :cond_3c
    iget-object p2, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 62
    .line 63
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_88

    .line 68
    .line 69
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 70
    .line 71
    iget-object v0, p2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 72
    .line 73
    iget-object v0, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 74
    .line 75
    invoke-direct {p0, p2, p1, v0}, Lax/o4/h;->P0(Lax/o4/h$h;ZLax/o4/g$O;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    iget-object v8, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 80
    .line 81
    invoke-direct {p0, v8, v6, v7}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_65

    .line 86
    .line 87
    iget-object v6, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 88
    .line 89
    iget-object v7, v6, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 90
    .line 91
    iget-object v8, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 92
    .line 93
    iget-object v8, v8, Lax/o4/g$E;->I0:Lax/o4/g$O;

    .line 94
    .line 95
    iput-object v8, v7, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 96
    .line 97
    if-eqz v8, :cond_63

    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    :cond_63
    iput-boolean v4, v6, Lax/o4/h$h;->c:Z

    .line 101
    .line 102
    :cond_65
    iget-object v4, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 103
    .line 104
    invoke-direct {p0, v4, v2, v3}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_77

    .line 109
    .line 110
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 111
    .line 112
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 113
    .line 114
    iget-object v3, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 115
    .line 116
    iget-object v3, v3, Lax/o4/g$E;->J0:Ljava/lang/Float;

    .line 117
    .line 118
    iput-object v3, v2, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 119
    .line 120
    :cond_77
    iget-object p2, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 121
    .line 122
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_88

    .line 127
    .line 128
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 129
    .line 130
    iget-object v0, p2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 131
    .line 132
    iget-object v0, v0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 133
    .line 134
    invoke-direct {p0, p2, p1, v0}, Lax/o4/h;->P0(Lax/o4/h$h;ZLax/o4/g$O;)V

    .line 135
    .line 136
    .line 137
    :cond_88
    return-void
    .line 138
    .line 139
.end method

.method private R0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lax/o4/h$h;

    .line 13
    .line 14
    iput-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private S0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 7
    .line 8
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lax/o4/h$h;

    .line 14
    .line 15
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lax/o4/h$h;-><init>(Lax/o4/h;Lax/o4/h$h;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

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

.method private T0(Ljava/lang/String;ZZ)Ljava/lang/String;
    .registers 7

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-boolean v0, v0, Lax/o4/h$h;->h:Z

    .line 4
    .line 5
    const-string v1, " "

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    const-string p2, "[\\n\\t]"

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_f
    const-string v0, "\\n"

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "\\t"

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p2, :cond_25

    .line 31
    .line 32
    const-string p2, "^\\s+"

    .line 33
    .line 34
    invoke-virtual {p1, p2, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_25
    if-eqz p3, :cond_2d

    .line 39
    .line 40
    const-string p2, "\\s+$"

    .line 41
    .line 42
    invoke-virtual {p1, p2, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_2d
    const-string p2, "\\s{2,}"

    .line 47
    .line 48
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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

.method private U()Landroid/graphics/Path$FillType;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->d0:Lax/o4/g$E$a;

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    sget-object v1, Lax/o4/g$E$a;->c0:Lax/o4/g$E$a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_f

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_f
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method private U0(Lax/o4/g$K;)V
    .registers 15

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-object v4, p1, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 6
    .line 7
    if-nez v4, :cond_a

    .line 8
    .line 9
    goto/16 :goto_c5

    .line 10
    .line 11
    :cond_a
    iget-object v4, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 12
    .line 13
    if-nez v4, :cond_10

    .line 14
    .line 15
    goto/16 :goto_c5

    .line 16
    .line 17
    :cond_10
    new-instance v4, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v5, p0, Lax/o4/h;->g:Ljava/util/Stack;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_c5

    .line 35
    .line 36
    iget-object v5, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 37
    .line 38
    iget v6, v5, Lax/o4/g$b;->a:F

    .line 39
    .line 40
    iget v7, v5, Lax/o4/g$b;->b:F

    .line 41
    .line 42
    invoke-virtual {v5}, Lax/o4/g$b;->b()F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget-object v8, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 47
    .line 48
    iget v9, v8, Lax/o4/g$b;->b:F

    .line 49
    .line 50
    invoke-virtual {v8}, Lax/o4/g$b;->b()F

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    iget-object v10, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 55
    .line 56
    invoke-virtual {v10}, Lax/o4/g$b;->c()F

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    iget-object p1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 61
    .line 62
    iget v11, p1, Lax/o4/g$b;->a:F

    .line 63
    .line 64
    invoke-virtual {p1}, Lax/o4/g$b;->c()F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/16 v12, 0x8

    .line 69
    .line 70
    new-array v12, v12, [F

    .line 71
    .line 72
    aput v6, v12, v1

    .line 73
    .line 74
    aput v7, v12, v3

    .line 75
    .line 76
    aput v5, v12, v2

    .line 77
    .line 78
    const/4 v5, 0x3

    .line 79
    aput v9, v12, v5

    .line 80
    .line 81
    const/4 v5, 0x4

    .line 82
    aput v8, v12, v5

    .line 83
    .line 84
    const/4 v5, 0x5

    .line 85
    aput v10, v12, v5

    .line 86
    .line 87
    aput v11, v12, v0

    .line 88
    .line 89
    const/4 v5, 0x7

    .line 90
    aput p1, v12, v5

    .line 91
    .line 92
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v4, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v12}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Landroid/graphics/RectF;

    .line 105
    .line 106
    aget v1, v12, v1

    .line 107
    .line 108
    aget v4, v12, v3

    .line 109
    .line 110
    invoke-direct {p1, v1, v4, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    :goto_71
    if-gt v1, v0, :cond_9b

    .line 115
    .line 116
    aget v4, v12, v1

    .line 117
    .line 118
    iget v5, p1, Landroid/graphics/RectF;->left:F

    .line 119
    .line 120
    cmpg-float v5, v4, v5

    .line 121
    .line 122
    if-gez v5, :cond_7d

    .line 123
    .line 124
    iput v4, p1, Landroid/graphics/RectF;->left:F

    .line 125
    .line 126
    :cond_7d
    iget v5, p1, Landroid/graphics/RectF;->right:F

    .line 127
    .line 128
    cmpl-float v5, v4, v5

    .line 129
    .line 130
    if-lez v5, :cond_85

    .line 131
    .line 132
    iput v4, p1, Landroid/graphics/RectF;->right:F

    .line 133
    .line 134
    :cond_85
    add-int/lit8 v4, v1, 0x1

    .line 135
    .line 136
    aget v4, v12, v4

    .line 137
    .line 138
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 139
    .line 140
    cmpg-float v5, v4, v5

    .line 141
    .line 142
    if-gez v5, :cond_91

    .line 143
    .line 144
    iput v4, p1, Landroid/graphics/RectF;->top:F

    .line 145
    .line 146
    :cond_91
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 147
    .line 148
    cmpl-float v5, v4, v5

    .line 149
    .line 150
    if-lez v5, :cond_99

    .line 151
    .line 152
    iput v4, p1, Landroid/graphics/RectF;->bottom:F

    .line 153
    .line 154
    :cond_99
    add-int/2addr v1, v2

    .line 155
    goto :goto_71

    .line 156
    :cond_9b
    iget-object v0, p0, Lax/o4/h;->f:Ljava/util/Stack;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Lax/o4/g$K;

    .line 163
    .line 164
    iget-object v1, v0, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 165
    .line 166
    if-nez v1, :cond_b6

    .line 167
    .line 168
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 169
    .line 170
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 171
    .line 172
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 173
    .line 174
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 175
    .line 176
    invoke-static {v1, v2, v3, p1}, Lax/o4/g$b;->a(FFFF)Lax/o4/g$b;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iput-object p1, v0, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 181
    .line 182
    return-void

    .line 183
    :cond_b6
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 184
    .line 185
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 186
    .line 187
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 188
    .line 189
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 190
    .line 191
    invoke-static {v0, v2, v3, p1}, Lax/o4/g$b;->a(FFFF)Lax/o4/g$b;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v1, p1}, Lax/o4/g$b;->e(Lax/o4/g$b;)V

    .line 196
    .line 197
    .line 198
    :cond_c5
    :goto_c5
    return-void
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

.method private static declared-synchronized V()V
    .registers 3

    .line 1
    const-class v0, Lax/o4/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    new-instance v1, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 10
    .line 11
    const-string v2, "Structure"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 17
    .line 18
    const-string v2, "BasicStructure"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 24
    .line 25
    const-string v2, "ConditionalProcessing"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 31
    .line 32
    const-string v2, "Image"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 38
    .line 39
    const-string v2, "Style"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 45
    .line 46
    const-string v2, "ViewportAttribute"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 52
    .line 53
    const-string v2, "Shape"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 59
    .line 60
    const-string v2, "BasicText"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 66
    .line 67
    const-string v2, "PaintAttribute"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 73
    .line 74
    const-string v2, "BasicPaintAttribute"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 80
    .line 81
    const-string v2, "OpacityAttribute"

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 87
    .line 88
    const-string v2, "BasicGraphicsAttribute"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 94
    .line 95
    const-string v2, "Marker"

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 101
    .line 102
    const-string v2, "Gradient"

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 108
    .line 109
    const-string v2, "Pattern"

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 115
    .line 116
    const-string v2, "Clip"

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 122
    .line 123
    const-string v2, "BasicClip"

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 129
    .line 130
    const-string v2, "Mask"

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    sget-object v1, Lax/o4/h;->i:Ljava/util/HashSet;

    .line 136
    .line 137
    const-string v2, "View"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_8d
    .catchall {:try_start_3 .. :try_end_8d} :catchall_8f

    .line 140
    .line 141
    .line 142
    monitor-exit v0

    .line 143
    return-void

    .line 144
    :catchall_8f
    move-exception v1

    .line 145
    :try_start_90
    monitor-exit v0
    :try_end_91
    .catchall {:try_start_90 .. :try_end_91} :catchall_8f

    .line 146
    throw v1
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

.method private V0(Lax/o4/h$h;Lax/o4/g$E;)V
    .registers 14

    .line 1
    const-wide/16 v0, 0x1000

    .line 2
    .line 3
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 10
    .line 11
    iget-object v1, p2, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 12
    .line 13
    iput-object v1, v0, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 14
    .line 15
    :cond_e
    const-wide/16 v0, 0x800

    .line 16
    .line 17
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1c

    .line 22
    .line 23
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 24
    .line 25
    iget-object v1, p2, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 26
    .line 27
    iput-object v1, v0, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 28
    .line 29
    :cond_1c
    const-wide/16 v0, 0x1

    .line 30
    .line 31
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v0, :cond_39

    .line 38
    .line 39
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 40
    .line 41
    iget-object v3, p2, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 42
    .line 43
    iput-object v3, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 44
    .line 45
    iget-object v0, p2, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 46
    .line 47
    if-eqz v0, :cond_36

    .line 48
    .line 49
    sget-object v3, Lax/o4/g$f;->d0:Lax/o4/g$f;

    .line 50
    .line 51
    if-eq v0, v3, :cond_36

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 v0, 0x0

    .line 56
    :goto_37
    iput-boolean v0, p1, Lax/o4/h$h;->b:Z

    .line 57
    .line 58
    :cond_39
    const-wide/16 v3, 0x4

    .line 59
    .line 60
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_47

    .line 65
    .line 66
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 67
    .line 68
    iget-object v3, p2, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 69
    .line 70
    iput-object v3, v0, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 71
    .line 72
    :cond_47
    const-wide/16 v3, 0x1805

    .line 73
    .line 74
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_56

    .line 79
    .line 80
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 81
    .line 82
    iget-object v0, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 83
    .line 84
    invoke-direct {p0, p1, v2, v0}, Lax/o4/h;->P0(Lax/o4/h$h;ZLax/o4/g$O;)V

    .line 85
    .line 86
    .line 87
    :cond_56
    const-wide/16 v3, 0x2

    .line 88
    .line 89
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_64

    .line 94
    .line 95
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 96
    .line 97
    iget-object v3, p2, Lax/o4/g$E;->d0:Lax/o4/g$E$a;

    .line 98
    .line 99
    iput-object v3, v0, Lax/o4/g$E;->d0:Lax/o4/g$E$a;

    .line 100
    .line 101
    :cond_64
    const-wide/16 v3, 0x8

    .line 102
    .line 103
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_7f

    .line 108
    .line 109
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 110
    .line 111
    iget-object v3, p2, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 112
    .line 113
    iput-object v3, v0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 114
    .line 115
    iget-object v0, p2, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 116
    .line 117
    if-eqz v0, :cond_7c

    .line 118
    .line 119
    sget-object v3, Lax/o4/g$f;->d0:Lax/o4/g$f;

    .line 120
    .line 121
    if-eq v0, v3, :cond_7c

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    goto :goto_7d

    .line 125
    :cond_7c
    const/4 v0, 0x0

    .line 126
    :goto_7d
    iput-boolean v0, p1, Lax/o4/h$h;->c:Z

    .line 127
    .line 128
    :cond_7f
    const-wide/16 v3, 0x10

    .line 129
    .line 130
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_8d

    .line 135
    .line 136
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 137
    .line 138
    iget-object v3, p2, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 139
    .line 140
    iput-object v3, v0, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 141
    .line 142
    :cond_8d
    const-wide/16 v3, 0x1818

    .line 143
    .line 144
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_9c

    .line 149
    .line 150
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 151
    .line 152
    iget-object v0, v0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 153
    .line 154
    invoke-direct {p0, p1, v1, v0}, Lax/o4/h;->P0(Lax/o4/h$h;ZLax/o4/g$O;)V

    .line 155
    .line 156
    .line 157
    :cond_9c
    const-wide v3, 0x800000000L

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_ad

    .line 167
    .line 168
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 169
    .line 170
    iget-object v3, p2, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 171
    .line 172
    iput-object v3, v0, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 173
    .line 174
    :cond_ad
    const-wide/16 v3, 0x20

    .line 175
    .line 176
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_c4

    .line 181
    .line 182
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 183
    .line 184
    iget-object v3, p2, Lax/o4/g$E;->h0:Lax/o4/g$p;

    .line 185
    .line 186
    iput-object v3, v0, Lax/o4/g$E;->h0:Lax/o4/g$p;

    .line 187
    .line 188
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 189
    .line 190
    invoke-virtual {v3, p0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 195
    .line 196
    .line 197
    :cond_c4
    const-wide/16 v3, 0x40

    .line 198
    .line 199
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    const/4 v3, 0x3

    .line 204
    const/4 v4, 0x2

    .line 205
    if-eqz v0, :cond_fc

    .line 206
    .line 207
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 208
    .line 209
    iget-object v5, p2, Lax/o4/g$E;->i0:Lax/o4/g$E$c;

    .line 210
    .line 211
    iput-object v5, v0, Lax/o4/g$E;->i0:Lax/o4/g$E$c;

    .line 212
    .line 213
    sget-object v0, Lax/o4/h$a;->b:[I

    .line 214
    .line 215
    iget-object v5, p2, Lax/o4/g$E;->i0:Lax/o4/g$E$c;

    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    aget v0, v0, v5

    .line 222
    .line 223
    if-eq v0, v2, :cond_f5

    .line 224
    .line 225
    if-eq v0, v4, :cond_ed

    .line 226
    .line 227
    if-eq v0, v3, :cond_e5

    .line 228
    .line 229
    goto :goto_fc

    .line 230
    :cond_e5
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 231
    .line 232
    sget-object v5, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 233
    .line 234
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 235
    .line 236
    .line 237
    goto :goto_fc

    .line 238
    :cond_ed
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 239
    .line 240
    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 241
    .line 242
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 243
    .line 244
    .line 245
    goto :goto_fc

    .line 246
    :cond_f5
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 247
    .line 248
    sget-object v5, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 249
    .line 250
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 251
    .line 252
    .line 253
    :cond_fc
    :goto_fc
    const-wide/16 v5, 0x80

    .line 254
    .line 255
    invoke-direct {p0, p2, v5, v6}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_132

    .line 260
    .line 261
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 262
    .line 263
    iget-object v5, p2, Lax/o4/g$E;->j0:Lax/o4/g$E$d;

    .line 264
    .line 265
    iput-object v5, v0, Lax/o4/g$E;->j0:Lax/o4/g$E$d;

    .line 266
    .line 267
    sget-object v0, Lax/o4/h$a;->c:[I

    .line 268
    .line 269
    iget-object v5, p2, Lax/o4/g$E;->j0:Lax/o4/g$E$d;

    .line 270
    .line 271
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    aget v0, v0, v5

    .line 276
    .line 277
    if-eq v0, v2, :cond_12b

    .line 278
    .line 279
    if-eq v0, v4, :cond_123

    .line 280
    .line 281
    if-eq v0, v3, :cond_11b

    .line 282
    .line 283
    goto :goto_132

    .line 284
    :cond_11b
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 285
    .line 286
    sget-object v3, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 287
    .line 288
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 289
    .line 290
    .line 291
    goto :goto_132

    .line 292
    :cond_123
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 293
    .line 294
    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 295
    .line 296
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 297
    .line 298
    .line 299
    goto :goto_132

    .line 300
    :cond_12b
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 301
    .line 302
    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 303
    .line 304
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 305
    .line 306
    .line 307
    :cond_132
    :goto_132
    const-wide/16 v3, 0x100

    .line 308
    .line 309
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_14b

    .line 314
    .line 315
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 316
    .line 317
    iget-object v3, p2, Lax/o4/g$E;->k0:Ljava/lang/Float;

    .line 318
    .line 319
    iput-object v3, v0, Lax/o4/g$E;->k0:Ljava/lang/Float;

    .line 320
    .line 321
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 322
    .line 323
    iget-object v3, p2, Lax/o4/g$E;->k0:Ljava/lang/Float;

    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 330
    .line 331
    .line 332
    :cond_14b
    const-wide/16 v3, 0x200

    .line 333
    .line 334
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_159

    .line 339
    .line 340
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 341
    .line 342
    iget-object v3, p2, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 343
    .line 344
    iput-object v3, v0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 345
    .line 346
    :cond_159
    const-wide/16 v3, 0x400

    .line 347
    .line 348
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_167

    .line 353
    .line 354
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 355
    .line 356
    iget-object v3, p2, Lax/o4/g$E;->m0:Lax/o4/g$p;

    .line 357
    .line 358
    iput-object v3, v0, Lax/o4/g$E;->m0:Lax/o4/g$p;

    .line 359
    .line 360
    :cond_167
    const-wide/16 v3, 0x600

    .line 361
    .line 362
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    const/4 v3, 0x0

    .line 367
    if-eqz v0, :cond_1c0

    .line 368
    .line 369
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 370
    .line 371
    iget-object v0, v0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 372
    .line 373
    if-nez v0, :cond_17c

    .line 374
    .line 375
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 376
    .line 377
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 378
    .line 379
    .line 380
    goto :goto_1c0

    .line 381
    :cond_17c
    array-length v0, v0

    .line 382
    rem-int/lit8 v4, v0, 0x2

    .line 383
    .line 384
    if-nez v4, :cond_183

    .line 385
    .line 386
    move v4, v0

    .line 387
    goto :goto_185

    .line 388
    :cond_183
    mul-int/lit8 v4, v0, 0x2

    .line 389
    .line 390
    :goto_185
    new-array v5, v4, [F

    .line 391
    .line 392
    const/4 v6, 0x0

    .line 393
    const/4 v7, 0x0

    .line 394
    const/4 v8, 0x0

    .line 395
    :goto_18a
    if-ge v7, v4, :cond_19e

    .line 396
    .line 397
    iget-object v9, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 398
    .line 399
    iget-object v9, v9, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 400
    .line 401
    rem-int v10, v7, v0

    .line 402
    .line 403
    aget-object v9, v9, v10

    .line 404
    .line 405
    invoke-virtual {v9, p0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 406
    .line 407
    .line 408
    move-result v9

    .line 409
    aput v9, v5, v7

    .line 410
    .line 411
    add-float/2addr v8, v9

    .line 412
    add-int/lit8 v7, v7, 0x1

    .line 413
    .line 414
    goto :goto_18a

    .line 415
    :cond_19e
    cmpl-float v0, v8, v6

    .line 416
    .line 417
    if-nez v0, :cond_1a8

    .line 418
    .line 419
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 420
    .line 421
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 422
    .line 423
    .line 424
    goto :goto_1c0

    .line 425
    :cond_1a8
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 426
    .line 427
    iget-object v0, v0, Lax/o4/g$E;->m0:Lax/o4/g$p;

    .line 428
    .line 429
    invoke-virtual {v0, p0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    cmpg-float v4, v0, v6

    .line 434
    .line 435
    if-gez v4, :cond_1b6

    .line 436
    .line 437
    rem-float/2addr v0, v8

    .line 438
    add-float/2addr v0, v8

    .line 439
    :cond_1b6
    iget-object v4, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 440
    .line 441
    new-instance v6, Landroid/graphics/DashPathEffect;

    .line 442
    .line 443
    invoke-direct {v6, v5, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 447
    .line 448
    .line 449
    :cond_1c0
    :goto_1c0
    const-wide/16 v4, 0x4000

    .line 450
    .line 451
    invoke-direct {p0, p2, v4, v5}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_1e8

    .line 456
    .line 457
    invoke-virtual {p0}, Lax/o4/h;->Q()F

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    iget-object v4, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 462
    .line 463
    iget-object v5, p2, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 464
    .line 465
    iput-object v5, v4, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 466
    .line 467
    iget-object v4, p1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 468
    .line 469
    iget-object v5, p2, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 470
    .line 471
    invoke-virtual {v5, p0, v0}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 476
    .line 477
    .line 478
    iget-object v4, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 479
    .line 480
    iget-object v5, p2, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 481
    .line 482
    invoke-virtual {v5, p0, v0}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 487
    .line 488
    .line 489
    :cond_1e8
    const-wide/16 v4, 0x2000

    .line 490
    .line 491
    invoke-direct {p0, p2, v4, v5}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-eqz v0, :cond_1f6

    .line 496
    .line 497
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 498
    .line 499
    iget-object v4, p2, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 500
    .line 501
    iput-object v4, v0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 502
    .line 503
    :cond_1f6
    const-wide/32 v4, 0x8000

    .line 504
    .line 505
    .line 506
    invoke-direct {p0, p2, v4, v5}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-eqz v0, :cond_24e

    .line 511
    .line 512
    iget-object v0, p2, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    const/4 v4, -0x1

    .line 519
    const/16 v5, 0x64

    .line 520
    .line 521
    if-ne v0, v4, :cond_224

    .line 522
    .line 523
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 524
    .line 525
    iget-object v0, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-le v0, v5, :cond_224

    .line 532
    .line 533
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 534
    .line 535
    iget-object v4, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    sub-int/2addr v4, v5

    .line 542
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    iput-object v4, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 547
    .line 548
    goto :goto_24e

    .line 549
    :cond_224
    iget-object v0, p2, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-ne v0, v2, :cond_248

    .line 556
    .line 557
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 558
    .line 559
    iget-object v0, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    const/16 v4, 0x384

    .line 566
    .line 567
    if-ge v0, v4, :cond_248

    .line 568
    .line 569
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 570
    .line 571
    iget-object v4, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    add-int/2addr v4, v5

    .line 578
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iput-object v4, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 583
    .line 584
    goto :goto_24e

    .line 585
    :cond_248
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 586
    .line 587
    iget-object v4, p2, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 588
    .line 589
    iput-object v4, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 590
    .line 591
    :cond_24e
    :goto_24e
    const-wide/32 v4, 0x10000

    .line 592
    .line 593
    .line 594
    invoke-direct {p0, p2, v4, v5}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_25d

    .line 599
    .line 600
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 601
    .line 602
    iget-object v4, p2, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 603
    .line 604
    iput-object v4, v0, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 605
    .line 606
    :cond_25d
    const-wide/32 v4, 0x1a000

    .line 607
    .line 608
    .line 609
    invoke-direct {p0, p2, v4, v5}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_2ab

    .line 614
    .line 615
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 616
    .line 617
    iget-object v0, v0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 618
    .line 619
    if-eqz v0, :cond_293

    .line 620
    .line 621
    iget-object v0, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 622
    .line 623
    if-eqz v0, :cond_293

    .line 624
    .line 625
    invoke-static {}, Lax/o4/g;->k()Lax/o4/i;

    .line 626
    .line 627
    .line 628
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 629
    .line 630
    iget-object v0, v0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 631
    .line 632
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    :cond_27b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    if-eqz v4, :cond_293

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    check-cast v3, Ljava/lang/String;

    .line 647
    .line 648
    iget-object v4, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 649
    .line 650
    iget-object v5, v4, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 651
    .line 652
    iget-object v4, v4, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 653
    .line 654
    invoke-direct {p0, v3, v5, v4}, Lax/o4/h;->t(Ljava/lang/String;Ljava/lang/Integer;Lax/o4/g$E$b;)Landroid/graphics/Typeface;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    if-eqz v3, :cond_27b

    .line 659
    .line 660
    :cond_293
    if-nez v3, :cond_2a1

    .line 661
    .line 662
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 663
    .line 664
    iget-object v3, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 665
    .line 666
    iget-object v0, v0, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 667
    .line 668
    const-string v4, "serif"

    .line 669
    .line 670
    invoke-direct {p0, v4, v3, v0}, Lax/o4/h;->t(Ljava/lang/String;Ljava/lang/Integer;Lax/o4/g$E$b;)Landroid/graphics/Typeface;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    :cond_2a1
    iget-object v0, p1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 675
    .line 676
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 677
    .line 678
    .line 679
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 680
    .line 681
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 682
    .line 683
    .line 684
    :cond_2ab
    const-wide/32 v3, 0x20000

    .line 685
    .line 686
    .line 687
    invoke-direct {p0, p2, v3, v4}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_2ec

    .line 692
    .line 693
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 694
    .line 695
    iget-object v3, p2, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 696
    .line 697
    iput-object v3, v0, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 698
    .line 699
    iget-object v0, p1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 700
    .line 701
    iget-object v3, p2, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 702
    .line 703
    sget-object v4, Lax/o4/g$E$g;->e0:Lax/o4/g$E$g;

    .line 704
    .line 705
    if-ne v3, v4, :cond_2c4

    .line 706
    .line 707
    const/4 v3, 0x1

    .line 708
    goto :goto_2c5

    .line 709
    :cond_2c4
    const/4 v3, 0x0

    .line 710
    :goto_2c5
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 711
    .line 712
    .line 713
    iget-object v0, p1, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 714
    .line 715
    iget-object v3, p2, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 716
    .line 717
    sget-object v5, Lax/o4/g$E$g;->c0:Lax/o4/g$E$g;

    .line 718
    .line 719
    if-ne v3, v5, :cond_2d2

    .line 720
    .line 721
    const/4 v3, 0x1

    .line 722
    goto :goto_2d3

    .line 723
    :cond_2d2
    const/4 v3, 0x0

    .line 724
    :goto_2d3
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 725
    .line 726
    .line 727
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 728
    .line 729
    iget-object v3, p2, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 730
    .line 731
    if-ne v3, v4, :cond_2de

    .line 732
    .line 733
    const/4 v3, 0x1

    .line 734
    goto :goto_2df

    .line 735
    :cond_2de
    const/4 v3, 0x0

    .line 736
    :goto_2df
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 737
    .line 738
    .line 739
    iget-object v0, p1, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 740
    .line 741
    iget-object v3, p2, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 742
    .line 743
    if-ne v3, v5, :cond_2e9

    .line 744
    .line 745
    const/4 v1, 0x1

    .line 746
    :cond_2e9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 747
    .line 748
    .line 749
    :cond_2ec
    const-wide v0, 0x1000000000L

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_2fd

    .line 759
    .line 760
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 761
    .line 762
    iget-object v1, p2, Lax/o4/g$E;->u0:Lax/o4/g$E$h;

    .line 763
    .line 764
    iput-object v1, v0, Lax/o4/g$E;->u0:Lax/o4/g$E$h;

    .line 765
    .line 766
    :cond_2fd
    const-wide/32 v0, 0x40000

    .line 767
    .line 768
    .line 769
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-eqz v0, :cond_30c

    .line 774
    .line 775
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 776
    .line 777
    iget-object v1, p2, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 778
    .line 779
    iput-object v1, v0, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 780
    .line 781
    :cond_30c
    const-wide/32 v0, 0x80000

    .line 782
    .line 783
    .line 784
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-eqz v0, :cond_31b

    .line 789
    .line 790
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 791
    .line 792
    iget-object v1, p2, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 793
    .line 794
    iput-object v1, v0, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 795
    .line 796
    :cond_31b
    const-wide/32 v0, 0x200000

    .line 797
    .line 798
    .line 799
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_32a

    .line 804
    .line 805
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 806
    .line 807
    iget-object v1, p2, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 808
    .line 809
    iput-object v1, v0, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 810
    .line 811
    :cond_32a
    const-wide/32 v0, 0x400000

    .line 812
    .line 813
    .line 814
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    if-eqz v0, :cond_339

    .line 819
    .line 820
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 821
    .line 822
    iget-object v1, p2, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 823
    .line 824
    iput-object v1, v0, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 825
    .line 826
    :cond_339
    const-wide/32 v0, 0x800000

    .line 827
    .line 828
    .line 829
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    if-eqz v0, :cond_348

    .line 834
    .line 835
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 836
    .line 837
    iget-object v1, p2, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 838
    .line 839
    iput-object v1, v0, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 840
    .line 841
    :cond_348
    const-wide/32 v0, 0x1000000

    .line 842
    .line 843
    .line 844
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_357

    .line 849
    .line 850
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 851
    .line 852
    iget-object v1, p2, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 853
    .line 854
    iput-object v1, v0, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 855
    .line 856
    :cond_357
    const-wide/32 v0, 0x2000000

    .line 857
    .line 858
    .line 859
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 860
    .line 861
    .line 862
    move-result v0

    .line 863
    if-eqz v0, :cond_366

    .line 864
    .line 865
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 866
    .line 867
    iget-object v1, p2, Lax/o4/g$E;->C0:Ljava/lang/Boolean;

    .line 868
    .line 869
    iput-object v1, v0, Lax/o4/g$E;->C0:Ljava/lang/Boolean;

    .line 870
    .line 871
    :cond_366
    const-wide/32 v0, 0x100000

    .line 872
    .line 873
    .line 874
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    if-eqz v0, :cond_375

    .line 879
    .line 880
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 881
    .line 882
    iget-object v1, p2, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 883
    .line 884
    iput-object v1, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 885
    .line 886
    :cond_375
    const-wide/32 v0, 0x10000000

    .line 887
    .line 888
    .line 889
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    if-eqz v0, :cond_384

    .line 894
    .line 895
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 896
    .line 897
    iget-object v1, p2, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 898
    .line 899
    iput-object v1, v0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 900
    .line 901
    :cond_384
    const-wide/32 v0, 0x20000000

    .line 902
    .line 903
    .line 904
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    if-eqz v0, :cond_393

    .line 909
    .line 910
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 911
    .line 912
    iget-object v1, p2, Lax/o4/g$E;->G0:Lax/o4/g$E$a;

    .line 913
    .line 914
    iput-object v1, v0, Lax/o4/g$E;->G0:Lax/o4/g$E$a;

    .line 915
    .line 916
    :cond_393
    const-wide/32 v0, 0x40000000

    .line 917
    .line 918
    .line 919
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    if-eqz v0, :cond_3a2

    .line 924
    .line 925
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 926
    .line 927
    iget-object v1, p2, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 928
    .line 929
    iput-object v1, v0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 930
    .line 931
    :cond_3a2
    const-wide/32 v0, 0x4000000

    .line 932
    .line 933
    .line 934
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-eqz v0, :cond_3b1

    .line 939
    .line 940
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 941
    .line 942
    iget-object v1, p2, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 943
    .line 944
    iput-object v1, v0, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 945
    .line 946
    :cond_3b1
    const-wide/32 v0, 0x8000000

    .line 947
    .line 948
    .line 949
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    if-eqz v0, :cond_3c0

    .line 954
    .line 955
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 956
    .line 957
    iget-object v1, p2, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 958
    .line 959
    iput-object v1, v0, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 960
    .line 961
    :cond_3c0
    const-wide v0, 0x200000000L

    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    if-eqz v0, :cond_3d1

    .line 971
    .line 972
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 973
    .line 974
    iget-object v1, p2, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 975
    .line 976
    iput-object v1, v0, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 977
    .line 978
    :cond_3d1
    const-wide v0, 0x400000000L

    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    if-eqz v0, :cond_3e2

    .line 988
    .line 989
    iget-object v0, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 990
    .line 991
    iget-object v1, p2, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 992
    .line 993
    iput-object v1, v0, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 994
    .line 995
    :cond_3e2
    const-wide v0, 0x2000000000L

    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    invoke-direct {p0, p2, v0, v1}, Lax/o4/h;->W(Lax/o4/g$E;J)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v0

    .line 1004
    if-eqz v0, :cond_3f3

    .line 1005
    .line 1006
    iget-object p1, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 1007
    .line 1008
    iget-object p2, p2, Lax/o4/g$E;->N0:Lax/o4/g$E$e;

    .line 1009
    .line 1010
    iput-object p2, p1, Lax/o4/g$E;->N0:Lax/o4/g$E$e;

    .line 1011
    .line 1012
    :cond_3f3
    return-void
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method private W(Lax/o4/g$E;J)Z
    .registers 6

    .line 1
    iget-wide v0, p1, Lax/o4/g$E;->q:J

    .line 2
    .line 3
    and-long/2addr p2, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p1, p2, v0

    .line 7
    .line 8
    if-eqz p1, :cond_b

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
.end method

.method private W0(Lax/o4/h$h;Lax/o4/g$L;)V
    .registers 7

    .line 1
    iget-object v0, p2, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    iget-object v1, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lax/o4/g$E;->c(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p2, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 14
    .line 15
    if-eqz v0, :cond_13

    .line 16
    .line 17
    invoke-direct {p0, p1, v0}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    iget-object v0, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/o4/g;->n()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_41

    .line 27
    .line 28
    iget-object v0, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/o4/g;->d()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_25
    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_41

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lax/o4/b$p;

    .line 49
    .line 50
    iget-object v2, p0, Lax/o4/h;->h:Lax/o4/b$q;

    .line 51
    .line 52
    iget-object v3, v1, Lax/o4/b$p;->a:Lax/o4/b$s;

    .line 53
    .line 54
    invoke-static {v2, v3, p2}, Lax/o4/b;->l(Lax/o4/b$q;Lax/o4/b$s;Lax/o4/g$L;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_25

    .line 59
    .line 60
    iget-object v1, v1, Lax/o4/b$p;->b:Lax/o4/g$E;

    .line 61
    .line 62
    invoke-direct {p0, p1, v1}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 63
    .line 64
    .line 65
    goto :goto_25

    .line 66
    :cond_41
    iget-object p2, p2, Lax/o4/g$L;->f:Lax/o4/g$E;

    .line 67
    .line 68
    if-eqz p2, :cond_48

    .line 69
    .line 70
    invoke-direct {p0, p1, p2}, Lax/o4/h;->V0(Lax/o4/h$h;Lax/o4/g$E;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-void
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

.method private X(ZLax/o4/g$b;Lax/o4/g$M;)V
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v2, Lax/o4/g$j;->l:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v3, :cond_d

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Lax/o4/h;->H(Lax/o4/g$j;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object v3, v2, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v3, :cond_1b

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1b

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v3, 0x0

    .line 29
    :goto_1c
    iget-object v6, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 30
    .line 31
    if-eqz p1, :cond_23

    .line 32
    .line 33
    iget-object v6, v6, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 34
    .line 35
    goto :goto_25

    .line 36
    :cond_23
    iget-object v6, v6, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 37
    .line 38
    :goto_25
    if-eqz v3, :cond_5a

    .line 39
    .line 40
    invoke-virtual {v0}, Lax/o4/h;->S()Lax/o4/g$b;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v9, v2, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 45
    .line 46
    if-eqz v9, :cond_34

    .line 47
    .line 48
    invoke-virtual {v9, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    const/4 v9, 0x0

    .line 54
    :goto_35
    iget-object v10, v2, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 55
    .line 56
    if-eqz v10, :cond_3e

    .line 57
    .line 58
    invoke-virtual {v10, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    goto :goto_3f

    .line 63
    :cond_3e
    const/4 v10, 0x0

    .line 64
    :goto_3f
    iget-object v11, v2, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 65
    .line 66
    if-eqz v11, :cond_48

    .line 67
    .line 68
    invoke-virtual {v11, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    goto :goto_4a

    .line 73
    :cond_48
    iget v8, v8, Lax/o4/g$b;->c:F

    .line 74
    .line 75
    :goto_4a
    iget-object v11, v2, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 76
    .line 77
    if-eqz v11, :cond_53

    .line 78
    .line 79
    invoke-virtual {v11, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    goto :goto_54

    .line 84
    :cond_53
    const/4 v11, 0x0

    .line 85
    :goto_54
    move v15, v8

    .line 86
    move v13, v9

    .line 87
    move/from16 v16, v11

    .line 88
    .line 89
    :goto_58
    move v14, v10

    .line 90
    goto :goto_8a

    .line 91
    :cond_5a
    iget-object v8, v2, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 92
    .line 93
    const/high16 v9, 0x3f800000    # 1.0f

    .line 94
    .line 95
    if-eqz v8, :cond_65

    .line 96
    .line 97
    invoke-virtual {v8, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    goto :goto_66

    .line 102
    :cond_65
    const/4 v8, 0x0

    .line 103
    :goto_66
    iget-object v10, v2, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 104
    .line 105
    if-eqz v10, :cond_6f

    .line 106
    .line 107
    invoke-virtual {v10, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    goto :goto_70

    .line 112
    :cond_6f
    const/4 v10, 0x0

    .line 113
    :goto_70
    iget-object v11, v2, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 114
    .line 115
    if-eqz v11, :cond_79

    .line 116
    .line 117
    invoke-virtual {v11, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    goto :goto_7b

    .line 122
    :cond_79
    const/high16 v11, 0x3f800000    # 1.0f

    .line 123
    .line 124
    :goto_7b
    iget-object v12, v2, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 125
    .line 126
    if-eqz v12, :cond_84

    .line 127
    .line 128
    invoke-virtual {v12, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    goto :goto_85

    .line 133
    :cond_84
    const/4 v9, 0x0

    .line 134
    :goto_85
    move v13, v8

    .line 135
    move/from16 v16, v9

    .line 136
    .line 137
    move v15, v11

    .line 138
    goto :goto_58

    .line 139
    :goto_8a
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 140
    .line 141
    .line 142
    invoke-direct {v0, v2}, Lax/o4/h;->M(Lax/o4/g$N;)Lax/o4/h$h;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    iput-object v8, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 147
    .line 148
    new-instance v8, Landroid/graphics/Matrix;

    .line 149
    .line 150
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 151
    .line 152
    .line 153
    if-nez v3, :cond_a8

    .line 154
    .line 155
    iget v3, v1, Lax/o4/g$b;->a:F

    .line 156
    .line 157
    iget v9, v1, Lax/o4/g$b;->b:F

    .line 158
    .line 159
    invoke-virtual {v8, v3, v9}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 160
    .line 161
    .line 162
    iget v3, v1, Lax/o4/g$b;->c:F

    .line 163
    .line 164
    iget v1, v1, Lax/o4/g$b;->d:F

    .line 165
    .line 166
    invoke-virtual {v8, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 167
    .line 168
    .line 169
    :cond_a8
    iget-object v1, v2, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 170
    .line 171
    if-eqz v1, :cond_af

    .line 172
    .line 173
    invoke-virtual {v8, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 174
    .line 175
    .line 176
    :cond_af
    iget-object v1, v2, Lax/o4/g$j;->h:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_c6

    .line 183
    .line 184
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 185
    .line 186
    .line 187
    if-eqz p1, :cond_c1

    .line 188
    .line 189
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 190
    .line 191
    iput-boolean v4, v1, Lax/o4/h$h;->b:Z

    .line 192
    .line 193
    return-void

    .line 194
    :cond_c1
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 195
    .line 196
    iput-boolean v4, v1, Lax/o4/h$h;->c:Z

    .line 197
    .line 198
    return-void

    .line 199
    :cond_c6
    new-array v3, v1, [I

    .line 200
    .line 201
    new-array v9, v1, [F

    .line 202
    .line 203
    iget-object v10, v2, Lax/o4/g$j;->h:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    const/high16 v11, -0x40800000    # -1.0f

    .line 210
    .line 211
    :goto_d2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-eqz v12, :cond_11f

    .line 216
    .line 217
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    check-cast v12, Lax/o4/g$N;

    .line 222
    .line 223
    check-cast v12, Lax/o4/g$D;

    .line 224
    .line 225
    iget-object v7, v12, Lax/o4/g$D;->h:Ljava/lang/Float;

    .line 226
    .line 227
    if-eqz v7, :cond_e9

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    goto :goto_ea

    .line 234
    :cond_e9
    const/4 v7, 0x0

    .line 235
    :goto_ea
    if-eqz v4, :cond_f4

    .line 236
    .line 237
    cmpl-float v18, v7, v11

    .line 238
    .line 239
    if-ltz v18, :cond_f1

    .line 240
    .line 241
    goto :goto_f4

    .line 242
    :cond_f1
    aput v11, v9, v4

    .line 243
    .line 244
    goto :goto_f7

    .line 245
    :cond_f4
    :goto_f4
    aput v7, v9, v4

    .line 246
    .line 247
    move v11, v7

    .line 248
    :goto_f7
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 249
    .line 250
    .line 251
    iget-object v7, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 252
    .line 253
    invoke-direct {v0, v7, v12}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 254
    .line 255
    .line 256
    iget-object v7, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 257
    .line 258
    iget-object v7, v7, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 259
    .line 260
    iget-object v12, v7, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 261
    .line 262
    check-cast v12, Lax/o4/g$f;

    .line 263
    .line 264
    if-nez v12, :cond_10b

    .line 265
    .line 266
    sget-object v12, Lax/o4/g$f;->c0:Lax/o4/g$f;

    .line 267
    .line 268
    :cond_10b
    iget v12, v12, Lax/o4/g$f;->q:I

    .line 269
    .line 270
    iget-object v7, v7, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-static {v12, v7}, Lax/o4/h;->x(IF)I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    aput v7, v3, v4

    .line 281
    .line 282
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 285
    .line 286
    .line 287
    goto :goto_d2

    .line 288
    :cond_11f
    cmpl-float v4, v13, v15

    .line 289
    .line 290
    if-nez v4, :cond_127

    .line 291
    .line 292
    cmpl-float v4, v14, v16

    .line 293
    .line 294
    if-eqz v4, :cond_129

    .line 295
    .line 296
    :cond_127
    if-ne v1, v5, :cond_133

    .line 297
    .line 298
    :cond_129
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 299
    .line 300
    .line 301
    sub-int/2addr v1, v5

    .line 302
    aget v1, v3, v1

    .line 303
    .line 304
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_133
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 309
    .line 310
    iget-object v2, v2, Lax/o4/g$j;->k:Lax/o4/g$k;

    .line 311
    .line 312
    if-eqz v2, :cond_13f

    .line 313
    .line 314
    sget-object v4, Lax/o4/g$k;->c0:Lax/o4/g$k;

    .line 315
    .line 316
    if-ne v2, v4, :cond_142

    .line 317
    .line 318
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 319
    .line 320
    :cond_13f
    :goto_13f
    move-object/from16 v19, v1

    .line 321
    .line 322
    goto :goto_149

    .line 323
    :cond_142
    sget-object v4, Lax/o4/g$k;->d0:Lax/o4/g$k;

    .line 324
    .line 325
    if-ne v2, v4, :cond_13f

    .line 326
    .line 327
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 328
    .line 329
    goto :goto_13f

    .line 330
    :goto_149
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 331
    .line 332
    .line 333
    new-instance v12, Landroid/graphics/LinearGradient;

    .line 334
    .line 335
    move-object/from16 v17, v3

    .line 336
    .line 337
    move-object/from16 v18, v9

    .line 338
    .line 339
    invoke-direct/range {v12 .. v19}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v8}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 346
    .line 347
    .line 348
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 349
    .line 350
    iget-object v1, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 351
    .line 352
    iget-object v1, v1, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    invoke-static {v1}, Lax/o4/h;->w(F)I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 363
    .line 364
    .line 365
    return-void
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

.method private X0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v1, v0, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 6
    .line 7
    instance-of v2, v1, Lax/o4/g$f;

    .line 8
    .line 9
    if-eqz v2, :cond_f

    .line 10
    .line 11
    check-cast v1, Lax/o4/g$f;

    .line 12
    .line 13
    iget v1, v1, Lax/o4/g$f;->q:I

    .line 14
    .line 15
    goto :goto_17

    .line 16
    :cond_f
    instance-of v1, v1, Lax/o4/g$g;

    .line 17
    .line 18
    if-eqz v1, :cond_28

    .line 19
    .line 20
    iget-object v1, v0, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 21
    .line 22
    iget v1, v1, Lax/o4/g$f;->q:I

    .line 23
    .line 24
    :goto_17
    iget-object v0, v0, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 25
    .line 26
    if-eqz v0, :cond_23

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v1, v0}, Lax/o4/h;->x(IF)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_23
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 39
    .line 40
    .line 41
    :cond_28
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
.end method

.method private Y(Lax/o4/g$d;)Landroid/graphics/Path;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lax/o4/g$d;->o:Lax/o4/g$p;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_f

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move v9, v2

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v9, 0x0

    .line 17
    :goto_10
    iget-object v2, v1, Lax/o4/g$d;->p:Lax/o4/g$p;

    .line 18
    .line 19
    if-eqz v2, :cond_1b

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    move/from16 v16, v3

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    const/16 v16, 0x0

    .line 29
    .line 30
    :goto_1d
    iget-object v2, v1, Lax/o4/g$d;->q:Lax/o4/g$p;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-float v3, v9, v2

    .line 37
    .line 38
    sub-float v8, v16, v2

    .line 39
    .line 40
    add-float v5, v9, v2

    .line 41
    .line 42
    add-float v4, v16, v2

    .line 43
    .line 44
    iget-object v6, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 45
    .line 46
    if-nez v6, :cond_3a

    .line 47
    .line 48
    new-instance v6, Lax/o4/g$b;

    .line 49
    .line 50
    const/high16 v7, 0x40000000    # 2.0f

    .line 51
    .line 52
    mul-float v7, v7, v2

    .line 53
    .line 54
    invoke-direct {v6, v3, v8, v7, v7}, Lax/o4/g$b;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    iput-object v6, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 58
    .line 59
    :cond_3a
    const v1, 0x3f0d6289

    .line 60
    .line 61
    .line 62
    mul-float v2, v2, v1

    .line 63
    .line 64
    new-instance v10, Landroid/graphics/Path;

    .line 65
    .line 66
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 70
    .line 71
    .line 72
    add-float v7, v9, v2

    .line 73
    .line 74
    sub-float v14, v16, v2

    .line 75
    .line 76
    move v15, v5

    .line 77
    move v13, v5

    .line 78
    move v11, v7

    .line 79
    move v12, v8

    .line 80
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 81
    .line 82
    .line 83
    move v1, v12

    .line 84
    move/from16 v17, v14

    .line 85
    .line 86
    add-float v14, v16, v2

    .line 87
    .line 88
    move v8, v4

    .line 89
    move-object v4, v10

    .line 90
    move v10, v8

    .line 91
    move v6, v14

    .line 92
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 93
    .line 94
    .line 95
    sub-float v7, v9, v2

    .line 96
    .line 97
    move v15, v3

    .line 98
    move v13, v3

    .line 99
    move-object v10, v4

    .line 100
    move v11, v7

    .line 101
    move v12, v8

    .line 102
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 103
    .line 104
    .line 105
    move v5, v13

    .line 106
    move v10, v1

    .line 107
    move v8, v1

    .line 108
    move/from16 v6, v17

    .line 109
    .line 110
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 114
    .line 115
    .line 116
    return-object v4
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

.method private Y0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->C0:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private Z(Lax/o4/g$i;)Landroid/graphics/Path;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lax/o4/g$i;->o:Lax/o4/g$p;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_f

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move v9, v2

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v9, 0x0

    .line 17
    :goto_10
    iget-object v2, v1, Lax/o4/g$i;->p:Lax/o4/g$p;

    .line 18
    .line 19
    if-eqz v2, :cond_1b

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    move/from16 v16, v3

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    const/16 v16, 0x0

    .line 29
    .line 30
    :goto_1d
    iget-object v2, v1, Lax/o4/g$i;->q:Lax/o4/g$p;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v3, v1, Lax/o4/g$i;->r:Lax/o4/g$p;

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sub-float v4, v9, v2

    .line 43
    .line 44
    sub-float v8, v16, v3

    .line 45
    .line 46
    add-float v5, v9, v2

    .line 47
    .line 48
    add-float v6, v16, v3

    .line 49
    .line 50
    iget-object v7, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 51
    .line 52
    if-nez v7, :cond_42

    .line 53
    .line 54
    new-instance v7, Lax/o4/g$b;

    .line 55
    .line 56
    const/high16 v10, 0x40000000    # 2.0f

    .line 57
    .line 58
    mul-float v11, v2, v10

    .line 59
    .line 60
    mul-float v10, v10, v3

    .line 61
    .line 62
    invoke-direct {v7, v4, v8, v11, v10}, Lax/o4/g$b;-><init>(FFFF)V

    .line 63
    .line 64
    .line 65
    iput-object v7, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 66
    .line 67
    :cond_42
    const v1, 0x3f0d6289

    .line 68
    .line 69
    .line 70
    mul-float v2, v2, v1

    .line 71
    .line 72
    mul-float v3, v3, v1

    .line 73
    .line 74
    new-instance v10, Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 80
    .line 81
    .line 82
    add-float v7, v9, v2

    .line 83
    .line 84
    sub-float v14, v16, v3

    .line 85
    .line 86
    move v15, v5

    .line 87
    move v13, v5

    .line 88
    move v11, v7

    .line 89
    move v12, v8

    .line 90
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 91
    .line 92
    .line 93
    move v1, v12

    .line 94
    move/from16 v17, v14

    .line 95
    .line 96
    add-float v14, v16, v3

    .line 97
    .line 98
    move v13, v4

    .line 99
    move-object v4, v10

    .line 100
    move v10, v6

    .line 101
    move v8, v6

    .line 102
    move v6, v14

    .line 103
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 104
    .line 105
    .line 106
    sub-float v7, v9, v2

    .line 107
    .line 108
    move v15, v13

    .line 109
    move-object v10, v4

    .line 110
    move v11, v7

    .line 111
    move v12, v8

    .line 112
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 113
    .line 114
    .line 115
    move v10, v1

    .line 116
    move v8, v1

    .line 117
    move v5, v13

    .line 118
    move/from16 v6, v17

    .line 119
    .line 120
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 124
    .line 125
    .line 126
    return-object v4
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

.method private static varargs Z0(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "SVGAndroidRenderer"

    .line 6
    .line 7
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
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

.method static synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

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

.method private a0(Lax/o4/g$q;)Landroid/graphics/Path;
    .registers 11

    .line 1
    iget-object v0, p1, Lax/o4/g$q;->o:Lax/o4/g$p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    goto :goto_b

    .line 8
    :cond_7
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_b
    iget-object v2, p1, Lax/o4/g$q;->p:Lax/o4/g$p;

    .line 13
    .line 14
    if-nez v2, :cond_11

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    goto :goto_15

    .line 18
    :cond_11
    invoke-virtual {v2, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_15
    iget-object v3, p1, Lax/o4/g$q;->q:Lax/o4/g$p;

    .line 23
    .line 24
    if-nez v3, :cond_1b

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    goto :goto_1f

    .line 28
    :cond_1b
    invoke-virtual {v3, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :goto_1f
    iget-object v4, p1, Lax/o4/g$q;->r:Lax/o4/g$p;

    .line 33
    .line 34
    if-nez v4, :cond_24

    .line 35
    .line 36
    goto :goto_28

    .line 37
    :cond_24
    invoke-virtual {v4, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_28
    iget-object v4, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 42
    .line 43
    if-nez v4, :cond_47

    .line 44
    .line 45
    new-instance v4, Lax/o4/g$b;

    .line 46
    .line 47
    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    sub-float v7, v3, v0

    .line 56
    .line 57
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    sub-float v8, v1, v2

    .line 62
    .line 63
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    invoke-direct {v4, v5, v6, v7, v8}, Lax/o4/g$b;-><init>(FFFF)V

    .line 68
    .line 69
    .line 70
    iput-object v4, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 71
    .line 72
    :cond_47
    new-instance p1, Landroid/graphics/Path;

    .line 73
    .line 74
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    return-object p1
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

.method static synthetic b(Lax/o4/h;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private b0(Lax/o4/g$z;)Landroid/graphics/Path;
    .registers 7

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lax/o4/g$z;->o:[F

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget v2, v1, v2

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget v1, v1, v3

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    :goto_11
    iget-object v2, p1, Lax/o4/g$z;->o:[F

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    if-ge v1, v3, :cond_22

    .line 22
    .line 23
    aget v3, v2, v1

    .line 24
    .line 25
    add-int/lit8 v4, v1, 0x1

    .line 26
    .line 27
    aget v2, v2, v4

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    goto :goto_11

    .line 35
    :cond_22
    instance-of v1, p1, Lax/o4/g$A;

    .line 36
    .line 37
    if-eqz v1, :cond_29

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 40
    .line 41
    .line 42
    :cond_29
    iget-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 43
    .line 44
    if-nez v1, :cond_33

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 51
    .line 52
    :cond_33
    return-object v0
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

.method static synthetic c(Lax/o4/h;)Lax/o4/h$h;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o4/h;->d:Lax/o4/h$h;

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

.method private c0(Lax/o4/g$B;)Landroid/graphics/Path;
    .registers 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lax/o4/g$B;->s:Lax/o4/g$p;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_10

    .line 9
    .line 10
    iget-object v4, v1, Lax/o4/g$B;->t:Lax/o4/g$p;

    .line 11
    .line 12
    if-nez v4, :cond_10

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    goto :goto_2d

    .line 17
    :cond_10
    if-nez v2, :cond_1a

    .line 18
    .line 19
    iget-object v2, v1, Lax/o4/g$B;->t:Lax/o4/g$p;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :goto_18
    move v4, v2

    .line 26
    goto :goto_2d

    .line 27
    :cond_1a
    iget-object v4, v1, Lax/o4/g$B;->t:Lax/o4/g$p;

    .line 28
    .line 29
    if-nez v4, :cond_23

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_18

    .line 36
    :cond_23
    invoke-virtual {v2, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v4, v1, Lax/o4/g$B;->t:Lax/o4/g$p;

    .line 41
    .line 42
    invoke-virtual {v4, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    :goto_2d
    iget-object v5, v1, Lax/o4/g$B;->q:Lax/o4/g$p;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/high16 v6, 0x40000000    # 2.0f

    .line 53
    .line 54
    div-float/2addr v5, v6

    .line 55
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v5, v1, Lax/o4/g$B;->r:Lax/o4/g$p;

    .line 60
    .line 61
    invoke-virtual {v5, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    div-float/2addr v5, v6

    .line 66
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iget-object v5, v1, Lax/o4/g$B;->o:Lax/o4/g$p;

    .line 71
    .line 72
    if-eqz v5, :cond_4f

    .line 73
    .line 74
    invoke-virtual {v5, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    move v7, v5

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v7, 0x0

    .line 81
    :goto_50
    iget-object v5, v1, Lax/o4/g$B;->p:Lax/o4/g$p;

    .line 82
    .line 83
    if-eqz v5, :cond_5a

    .line 84
    .line 85
    invoke-virtual {v5, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    move v10, v5

    .line 90
    goto :goto_5b

    .line 91
    :cond_5a
    const/4 v10, 0x0

    .line 92
    :goto_5b
    iget-object v5, v1, Lax/o4/g$B;->q:Lax/o4/g$p;

    .line 93
    .line 94
    invoke-virtual {v5, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    iget-object v6, v1, Lax/o4/g$B;->r:Lax/o4/g$p;

    .line 99
    .line 100
    invoke-virtual {v6, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    iget-object v8, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 105
    .line 106
    if-nez v8, :cond_72

    .line 107
    .line 108
    new-instance v8, Lax/o4/g$b;

    .line 109
    .line 110
    invoke-direct {v8, v7, v10, v5, v6}, Lax/o4/g$b;-><init>(FFFF)V

    .line 111
    .line 112
    .line 113
    iput-object v8, v1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 114
    .line 115
    :cond_72
    add-float/2addr v5, v7

    .line 116
    add-float v15, v10, v6

    .line 117
    .line 118
    new-instance v6, Landroid/graphics/Path;

    .line 119
    .line 120
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 121
    .line 122
    .line 123
    cmpl-float v1, v2, v3

    .line 124
    .line 125
    if-eqz v1, :cond_82

    .line 126
    .line 127
    cmpl-float v1, v4, v3

    .line 128
    .line 129
    if-nez v1, :cond_84

    .line 130
    .line 131
    :cond_82
    move v11, v5

    .line 132
    goto :goto_cf

    .line 133
    :cond_84
    const v1, 0x3f0d6289

    .line 134
    .line 135
    .line 136
    mul-float v3, v2, v1

    .line 137
    .line 138
    mul-float v1, v1, v4

    .line 139
    .line 140
    add-float v14, v10, v4

    .line 141
    .line 142
    invoke-virtual {v6, v7, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 143
    .line 144
    .line 145
    sub-float v8, v14, v1

    .line 146
    .line 147
    add-float v11, v7, v2

    .line 148
    .line 149
    sub-float v9, v11, v3

    .line 150
    .line 151
    move v12, v10

    .line 152
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 153
    .line 154
    .line 155
    move/from16 v18, v9

    .line 156
    .line 157
    sub-float v2, v5, v2

    .line 158
    .line 159
    invoke-virtual {v6, v2, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 160
    .line 161
    .line 162
    add-float v9, v2, v3

    .line 163
    .line 164
    move v13, v5

    .line 165
    move v12, v8

    .line 166
    move v3, v11

    .line 167
    move v11, v5

    .line 168
    move-object v8, v6

    .line 169
    invoke-virtual/range {v8 .. v14}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 170
    .line 171
    .line 172
    move v5, v14

    .line 173
    move v14, v9

    .line 174
    sub-float v4, v15, v4

    .line 175
    .line 176
    invoke-virtual {v6, v11, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 177
    .line 178
    .line 179
    add-float v10, v4, v1

    .line 180
    .line 181
    move/from16 v17, v15

    .line 182
    .line 183
    move/from16 v16, v2

    .line 184
    .line 185
    move v13, v10

    .line 186
    move v12, v11

    .line 187
    move-object v11, v6

    .line 188
    invoke-virtual/range {v11 .. v17}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v3, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 192
    .line 193
    .line 194
    move v11, v7

    .line 195
    move v12, v4

    .line 196
    move v9, v7

    .line 197
    move v8, v15

    .line 198
    move/from16 v7, v18

    .line 199
    .line 200
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 201
    .line 202
    .line 203
    move v7, v9

    .line 204
    invoke-virtual {v6, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 205
    .line 206
    .line 207
    goto :goto_de

    .line 208
    :goto_cf
    invoke-virtual {v6, v7, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v11, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6, v11, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v7, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v7, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 221
    .line 222
    .line 223
    :goto_de
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 224
    .line 225
    .line 226
    return-object v6
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

.method static synthetic d(Lax/o4/h;)Landroid/graphics/Canvas;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

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

.method private d0(Lax/o4/g$W;)Landroid/graphics/Path;
    .registers 11

    .line 1
    iget-object v0, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_1a

    .line 14
    :cond_d
    iget-object v0, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/o4/g$p;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    :goto_1a
    const/4 v0, 0x0

    .line 28
    :goto_1b
    iget-object v3, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 29
    .line 30
    if-eqz v3, :cond_33

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_26

    .line 37
    .line 38
    goto :goto_33

    .line 39
    :cond_26
    iget-object v3, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lax/o4/g$p;

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    :goto_33
    const/4 v3, 0x0

    .line 53
    :goto_34
    iget-object v4, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 54
    .line 55
    if-eqz v4, :cond_4c

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_3f

    .line 62
    .line 63
    goto :goto_4c

    .line 64
    :cond_3f
    iget-object v4, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lax/o4/g$p;

    .line 71
    .line 72
    invoke-virtual {v4, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    goto :goto_4d

    .line 77
    :cond_4c
    :goto_4c
    const/4 v4, 0x0

    .line 78
    :goto_4d
    iget-object v5, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 79
    .line 80
    if-eqz v5, :cond_64

    .line 81
    .line 82
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_58

    .line 87
    .line 88
    goto :goto_64

    .line 89
    :cond_58
    iget-object v1, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lax/o4/g$p;

    .line 96
    .line 97
    invoke-virtual {v1, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    :cond_64
    :goto_64
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 102
    .line 103
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 104
    .line 105
    iget-object v2, v2, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 106
    .line 107
    sget-object v5, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 108
    .line 109
    if-eq v2, v5, :cond_80

    .line 110
    .line 111
    invoke-direct {p0, p1}, Lax/o4/h;->n(Lax/o4/g$Y;)F

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iget-object v5, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 116
    .line 117
    iget-object v5, v5, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 118
    .line 119
    iget-object v5, v5, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 120
    .line 121
    sget-object v6, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 122
    .line 123
    if-ne v5, v6, :cond_7f

    .line 124
    .line 125
    const/high16 v5, 0x40000000    # 2.0f

    .line 126
    .line 127
    div-float/2addr v2, v5

    .line 128
    :cond_7f
    sub-float/2addr v0, v2

    .line 129
    :cond_80
    iget-object v2, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 130
    .line 131
    if-nez v2, :cond_a3

    .line 132
    .line 133
    new-instance v2, Lax/o4/h$i;

    .line 134
    .line 135
    invoke-direct {v2, p0, v0, v3}, Lax/o4/h$i;-><init>(Lax/o4/h;FF)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p0, p1, v2}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 139
    .line 140
    .line 141
    new-instance v5, Lax/o4/g$b;

    .line 142
    .line 143
    iget-object v6, v2, Lax/o4/h$i;->d:Landroid/graphics/RectF;

    .line 144
    .line 145
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 146
    .line 147
    iget v8, v6, Landroid/graphics/RectF;->top:F

    .line 148
    .line 149
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    iget-object v2, v2, Lax/o4/h$i;->d:Landroid/graphics/RectF;

    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-direct {v5, v7, v8, v6, v2}, Lax/o4/g$b;-><init>(FFFF)V

    .line 160
    .line 161
    .line 162
    iput-object v5, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 163
    .line 164
    :cond_a3
    new-instance v2, Landroid/graphics/Path;

    .line 165
    .line 166
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v5, Lax/o4/h$g;

    .line 170
    .line 171
    add-float/2addr v0, v4

    .line 172
    add-float/2addr v3, v1

    .line 173
    invoke-direct {v5, p0, v0, v3, v2}, Lax/o4/h$g;-><init>(Lax/o4/h;FFLandroid/graphics/Path;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p0, p1, v5}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 177
    .line 178
    .line 179
    return-object v2
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

.method static synthetic e(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

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

.method private e0(ZLax/o4/g$b;Lax/o4/g$Q;)V
    .registers 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v2, Lax/o4/g$j;->l:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v3, :cond_d

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Lax/o4/h;->H(Lax/o4/g$j;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object v3, v2, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v3, :cond_1b

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1b

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v3, 0x0

    .line 29
    :goto_1c
    iget-object v6, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 30
    .line 31
    if-eqz p1, :cond_23

    .line 32
    .line 33
    iget-object v6, v6, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 34
    .line 35
    goto :goto_25

    .line 36
    :cond_23
    iget-object v6, v6, Lax/o4/h$h;->e:Landroid/graphics/Paint;

    .line 37
    .line 38
    :goto_25
    if-eqz v3, :cond_5b

    .line 39
    .line 40
    new-instance v7, Lax/o4/g$p;

    .line 41
    .line 42
    const/high16 v8, 0x42480000    # 50.0f

    .line 43
    .line 44
    sget-object v9, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 45
    .line 46
    invoke-direct {v7, v8, v9}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V

    .line 47
    .line 48
    .line 49
    iget-object v8, v2, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 50
    .line 51
    if-eqz v8, :cond_39

    .line 52
    .line 53
    invoke-virtual {v8, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    goto :goto_3d

    .line 58
    :cond_39
    invoke-virtual {v7, v0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    :goto_3d
    iget-object v9, v2, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 63
    .line 64
    if-eqz v9, :cond_46

    .line 65
    .line 66
    invoke-virtual {v9, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    goto :goto_4a

    .line 71
    :cond_46
    invoke-virtual {v7, v0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    :goto_4a
    iget-object v10, v2, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 76
    .line 77
    if-eqz v10, :cond_53

    .line 78
    .line 79
    invoke-virtual {v10, v0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    goto :goto_57

    .line 84
    :cond_53
    invoke-virtual {v7, v0}, Lax/o4/g$p;->d(Lax/o4/h;)F

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    :goto_57
    move v14, v7

    .line 89
    move v12, v8

    .line 90
    move v13, v9

    .line 91
    goto :goto_80

    .line 92
    :cond_5b
    iget-object v7, v2, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 93
    .line 94
    const/high16 v8, 0x3f000000    # 0.5f

    .line 95
    .line 96
    const/high16 v9, 0x3f800000    # 1.0f

    .line 97
    .line 98
    if-eqz v7, :cond_68

    .line 99
    .line 100
    invoke-virtual {v7, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    goto :goto_6a

    .line 105
    :cond_68
    const/high16 v7, 0x3f000000    # 0.5f

    .line 106
    .line 107
    :goto_6a
    iget-object v10, v2, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 108
    .line 109
    if-eqz v10, :cond_73

    .line 110
    .line 111
    invoke-virtual {v10, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    goto :goto_75

    .line 116
    :cond_73
    const/high16 v10, 0x3f000000    # 0.5f

    .line 117
    .line 118
    :goto_75
    iget-object v11, v2, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 119
    .line 120
    if-eqz v11, :cond_7d

    .line 121
    .line 122
    invoke-virtual {v11, v0, v9}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    :cond_7d
    move v12, v7

    .line 127
    move v14, v8

    .line 128
    move v13, v10

    .line 129
    :goto_80
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, v2}, Lax/o4/h;->M(Lax/o4/g$N;)Lax/o4/h$h;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iput-object v7, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 137
    .line 138
    new-instance v7, Landroid/graphics/Matrix;

    .line 139
    .line 140
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 141
    .line 142
    .line 143
    if-nez v3, :cond_9e

    .line 144
    .line 145
    iget v3, v1, Lax/o4/g$b;->a:F

    .line 146
    .line 147
    iget v8, v1, Lax/o4/g$b;->b:F

    .line 148
    .line 149
    invoke-virtual {v7, v3, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 150
    .line 151
    .line 152
    iget v3, v1, Lax/o4/g$b;->c:F

    .line 153
    .line 154
    iget v1, v1, Lax/o4/g$b;->d:F

    .line 155
    .line 156
    invoke-virtual {v7, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 157
    .line 158
    .line 159
    :cond_9e
    iget-object v1, v2, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 160
    .line 161
    if-eqz v1, :cond_a5

    .line 162
    .line 163
    invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 164
    .line 165
    .line 166
    :cond_a5
    iget-object v1, v2, Lax/o4/g$j;->h:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-nez v1, :cond_bc

    .line 173
    .line 174
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 175
    .line 176
    .line 177
    if-eqz p1, :cond_b7

    .line 178
    .line 179
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 180
    .line 181
    iput-boolean v4, v1, Lax/o4/h$h;->b:Z

    .line 182
    .line 183
    return-void

    .line 184
    :cond_b7
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 185
    .line 186
    iput-boolean v4, v1, Lax/o4/h$h;->c:Z

    .line 187
    .line 188
    return-void

    .line 189
    :cond_bc
    new-array v15, v1, [I

    .line 190
    .line 191
    new-array v3, v1, [F

    .line 192
    .line 193
    iget-object v8, v2, Lax/o4/g$j;->h:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    const/high16 v9, -0x40800000    # -1.0f

    .line 200
    .line 201
    :goto_c8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_117

    .line 206
    .line 207
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    check-cast v10, Lax/o4/g$N;

    .line 212
    .line 213
    check-cast v10, Lax/o4/g$D;

    .line 214
    .line 215
    const/16 p1, 0x0

    .line 216
    .line 217
    iget-object v11, v10, Lax/o4/g$D;->h:Ljava/lang/Float;

    .line 218
    .line 219
    if-eqz v11, :cond_e1

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    goto :goto_e2

    .line 226
    :cond_e1
    const/4 v11, 0x0

    .line 227
    :goto_e2
    if-eqz v4, :cond_ec

    .line 228
    .line 229
    cmpl-float v16, v11, v9

    .line 230
    .line 231
    if-ltz v16, :cond_e9

    .line 232
    .line 233
    goto :goto_ec

    .line 234
    :cond_e9
    aput v9, v3, v4

    .line 235
    .line 236
    goto :goto_ef

    .line 237
    :cond_ec
    :goto_ec
    aput v11, v3, v4

    .line 238
    .line 239
    move v9, v11

    .line 240
    :goto_ef
    invoke-direct {v0}, Lax/o4/h;->S0()V

    .line 241
    .line 242
    .line 243
    iget-object v11, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 244
    .line 245
    invoke-direct {v0, v11, v10}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 246
    .line 247
    .line 248
    iget-object v10, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 249
    .line 250
    iget-object v10, v10, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 251
    .line 252
    iget-object v11, v10, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 253
    .line 254
    check-cast v11, Lax/o4/g$f;

    .line 255
    .line 256
    if-nez v11, :cond_103

    .line 257
    .line 258
    sget-object v11, Lax/o4/g$f;->c0:Lax/o4/g$f;

    .line 259
    .line 260
    :cond_103
    iget v11, v11, Lax/o4/g$f;->q:I

    .line 261
    .line 262
    iget-object v10, v10, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 263
    .line 264
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    invoke-static {v11, v10}, Lax/o4/h;->x(IF)I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    aput v10, v15, v4

    .line 273
    .line 274
    add-int/lit8 v4, v4, 0x1

    .line 275
    .line 276
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 277
    .line 278
    .line 279
    goto :goto_c8

    .line 280
    :cond_117
    const/16 p1, 0x0

    .line 281
    .line 282
    cmpl-float v4, v14, p1

    .line 283
    .line 284
    if-eqz v4, :cond_158

    .line 285
    .line 286
    if-ne v1, v5, :cond_120

    .line 287
    .line 288
    goto :goto_158

    .line 289
    :cond_120
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 290
    .line 291
    iget-object v2, v2, Lax/o4/g$j;->k:Lax/o4/g$k;

    .line 292
    .line 293
    if-eqz v2, :cond_12c

    .line 294
    .line 295
    sget-object v4, Lax/o4/g$k;->c0:Lax/o4/g$k;

    .line 296
    .line 297
    if-ne v2, v4, :cond_12f

    .line 298
    .line 299
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 300
    .line 301
    :cond_12c
    :goto_12c
    move-object/from16 v17, v1

    .line 302
    .line 303
    goto :goto_136

    .line 304
    :cond_12f
    sget-object v4, Lax/o4/g$k;->d0:Lax/o4/g$k;

    .line 305
    .line 306
    if-ne v2, v4, :cond_12c

    .line 307
    .line 308
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 309
    .line 310
    goto :goto_12c

    .line 311
    :goto_136
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 312
    .line 313
    .line 314
    new-instance v11, Landroid/graphics/RadialGradient;

    .line 315
    .line 316
    move-object/from16 v16, v3

    .line 317
    .line 318
    invoke-direct/range {v11 .. v17}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 325
    .line 326
    .line 327
    iget-object v1, v0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 328
    .line 329
    iget-object v1, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 330
    .line 331
    iget-object v1, v1, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    invoke-static {v1}, Lax/o4/h;->w(F)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_158
    :goto_158
    invoke-direct {v0}, Lax/o4/h;->R0()V

    .line 346
    .line 347
    .line 348
    sub-int/2addr v1, v5

    .line 349
    aget v1, v15, v1

    .line 350
    .line 351
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 352
    .line 353
    .line 354
    return-void
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

.method static synthetic f(FFFFFZZFFLax/o4/g$x;)V
    .registers 10

    .line 1
    invoke-static/range {p0 .. p9}, Lax/o4/h;->h(FFFFFZZFFLax/o4/g$x;)V

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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
.end method

.method private f0(Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;)Lax/o4/g$b;
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    invoke-virtual {p1, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 p1, 0x0

    .line 10
    :goto_9
    if-eqz p2, :cond_f

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/o4/h;->S()Lax/o4/g$b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p3, :cond_1a

    .line 21
    .line 22
    invoke-virtual {p3, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    iget p3, p2, Lax/o4/g$b;->c:F

    .line 28
    .line 29
    :goto_1c
    if-eqz p4, :cond_23

    .line 30
    .line 31
    invoke-virtual {p4, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    goto :goto_25

    .line 36
    :cond_23
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 37
    .line 38
    :goto_25
    new-instance p4, Lax/o4/g$b;

    .line 39
    .line 40
    invoke-direct {p4, p1, v0, p3, p2}, Lax/o4/g$b;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    return-object p4
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

.method static synthetic g(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/o4/h;->Z0(Ljava/lang/String;[Ljava/lang/Object;)V

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

.method private g0(Lax/o4/g$K;Z)Landroid/graphics/Path;
    .registers 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 4
    .line 5
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 6
    .line 7
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    new-instance v2, Lax/o4/h$h;

    .line 11
    .line 12
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 13
    .line 14
    invoke-direct {v2, p0, v3}, Lax/o4/h$h;-><init>(Lax/o4/h;Lax/o4/h$h;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 18
    .line 19
    invoke-direct {p0, v2, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_13a

    .line 28
    .line 29
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_24

    .line 34
    .line 35
    goto/16 :goto_13a

    .line 36
    .line 37
    :cond_24
    instance-of v2, p1, Lax/o4/g$e0;

    .line 38
    .line 39
    if-eqz v2, :cond_7f

    .line 40
    .line 41
    if-nez p2, :cond_31

    .line 42
    .line 43
    const-string p2, "<use> elements inside a <clipPath> cannot reference another <use>"

    .line 44
    .line 45
    new-array v2, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p2, v2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    move-object p2, p1

    .line 51
    check-cast p2, Lax/o4/g$e0;

    .line 52
    .line 53
    iget-object v2, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 54
    .line 55
    iget-object v4, p2, Lax/o4/g$e0;->p:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v2, :cond_54

    .line 62
    .line 63
    iget-object p1, p2, Lax/o4/g$e0;->p:Ljava/lang/String;

    .line 64
    .line 65
    new-array p2, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    aput-object p1, p2, v1

    .line 68
    .line 69
    const-string p1, "Use reference \'%s\' not found"

    .line 70
    .line 71
    invoke-static {p1, p2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lax/o4/h$h;

    .line 81
    .line 82
    iput-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 83
    .line 84
    return-object v3

    .line 85
    :cond_54
    instance-of v0, v2, Lax/o4/g$K;

    .line 86
    .line 87
    if-nez v0, :cond_63

    .line 88
    .line 89
    iget-object p1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lax/o4/h$h;

    .line 96
    .line 97
    iput-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 98
    .line 99
    return-object v3

    .line 100
    :cond_63
    check-cast v2, Lax/o4/g$K;

    .line 101
    .line 102
    invoke-direct {p0, v2, v1}, Lax/o4/h;->g0(Lax/o4/g$K;Z)Landroid/graphics/Path;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-nez v0, :cond_6c

    .line 107
    .line 108
    return-object v3

    .line 109
    :cond_6c
    iget-object v1, p2, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 110
    .line 111
    if-nez v1, :cond_76

    .line 112
    .line 113
    invoke-direct {p0, v0}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, p2, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 118
    .line 119
    :cond_76
    iget-object p2, p2, Lax/o4/g$m;->o:Landroid/graphics/Matrix;

    .line 120
    .line 121
    if-eqz p2, :cond_10c

    .line 122
    .line 123
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_10c

    .line 127
    .line 128
    :cond_7f
    instance-of p2, p1, Lax/o4/g$l;

    .line 129
    .line 130
    if-eqz p2, :cond_f0

    .line 131
    .line 132
    move-object p2, p1

    .line 133
    check-cast p2, Lax/o4/g$l;

    .line 134
    .line 135
    instance-of v0, p1, Lax/o4/g$v;

    .line 136
    .line 137
    if-eqz v0, :cond_a3

    .line 138
    .line 139
    move-object v0, p1

    .line 140
    check-cast v0, Lax/o4/g$v;

    .line 141
    .line 142
    new-instance v1, Lax/o4/h$d;

    .line 143
    .line 144
    iget-object v0, v0, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 145
    .line 146
    invoke-direct {v1, p0, v0}, Lax/o4/h$d;-><init>(Lax/o4/h;Lax/o4/g$w;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lax/o4/h$d;->f()Landroid/graphics/Path;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 154
    .line 155
    if-nez v1, :cond_d4

    .line 156
    .line 157
    invoke-direct {p0, v0}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iput-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 162
    .line 163
    goto :goto_d4

    .line 164
    :cond_a3
    instance-of v0, p1, Lax/o4/g$B;

    .line 165
    .line 166
    if-eqz v0, :cond_af

    .line 167
    .line 168
    move-object v0, p1

    .line 169
    check-cast v0, Lax/o4/g$B;

    .line 170
    .line 171
    invoke-direct {p0, v0}, Lax/o4/h;->c0(Lax/o4/g$B;)Landroid/graphics/Path;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto :goto_d4

    .line 176
    :cond_af
    instance-of v0, p1, Lax/o4/g$d;

    .line 177
    .line 178
    if-eqz v0, :cond_bb

    .line 179
    .line 180
    move-object v0, p1

    .line 181
    check-cast v0, Lax/o4/g$d;

    .line 182
    .line 183
    invoke-direct {p0, v0}, Lax/o4/h;->Y(Lax/o4/g$d;)Landroid/graphics/Path;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    goto :goto_d4

    .line 188
    :cond_bb
    instance-of v0, p1, Lax/o4/g$i;

    .line 189
    .line 190
    if-eqz v0, :cond_c7

    .line 191
    .line 192
    move-object v0, p1

    .line 193
    check-cast v0, Lax/o4/g$i;

    .line 194
    .line 195
    invoke-direct {p0, v0}, Lax/o4/h;->Z(Lax/o4/g$i;)Landroid/graphics/Path;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    goto :goto_d4

    .line 200
    :cond_c7
    instance-of v0, p1, Lax/o4/g$z;

    .line 201
    .line 202
    if-eqz v0, :cond_d3

    .line 203
    .line 204
    move-object v0, p1

    .line 205
    check-cast v0, Lax/o4/g$z;

    .line 206
    .line 207
    invoke-direct {p0, v0}, Lax/o4/h;->b0(Lax/o4/g$z;)Landroid/graphics/Path;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    goto :goto_d4

    .line 212
    :cond_d3
    move-object v0, v3

    .line 213
    :cond_d4
    :goto_d4
    if-nez v0, :cond_d7

    .line 214
    .line 215
    return-object v3

    .line 216
    :cond_d7
    iget-object v1, p2, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 217
    .line 218
    if-nez v1, :cond_e1

    .line 219
    .line 220
    invoke-direct {p0, v0}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    iput-object v1, p2, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 225
    .line 226
    :cond_e1
    iget-object p2, p2, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 227
    .line 228
    if-eqz p2, :cond_e8

    .line 229
    .line 230
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 231
    .line 232
    .line 233
    :cond_e8
    invoke-direct {p0}, Lax/o4/h;->P()Landroid/graphics/Path$FillType;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 238
    .line 239
    .line 240
    goto :goto_10c

    .line 241
    :cond_f0
    instance-of p2, p1, Lax/o4/g$W;

    .line 242
    .line 243
    if-eqz p2, :cond_12c

    .line 244
    .line 245
    move-object p2, p1

    .line 246
    check-cast p2, Lax/o4/g$W;

    .line 247
    .line 248
    invoke-direct {p0, p2}, Lax/o4/h;->d0(Lax/o4/g$W;)Landroid/graphics/Path;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-nez v0, :cond_fe

    .line 253
    .line 254
    return-object v3

    .line 255
    :cond_fe
    iget-object p2, p2, Lax/o4/g$W;->s:Landroid/graphics/Matrix;

    .line 256
    .line 257
    if-eqz p2, :cond_105

    .line 258
    .line 259
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 260
    .line 261
    .line 262
    :cond_105
    invoke-direct {p0}, Lax/o4/h;->P()Landroid/graphics/Path$FillType;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 267
    .line 268
    .line 269
    :cond_10c
    :goto_10c
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 270
    .line 271
    iget-object p2, p2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 272
    .line 273
    iget-object p2, p2, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 274
    .line 275
    if-eqz p2, :cond_121

    .line 276
    .line 277
    iget-object p2, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 278
    .line 279
    invoke-direct {p0, p1, p2}, Lax/o4/h;->j(Lax/o4/g$K;Lax/o4/g$b;)Landroid/graphics/Path;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-eqz p1, :cond_121

    .line 284
    .line 285
    sget-object p2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 286
    .line 287
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 288
    .line 289
    .line 290
    :cond_121
    iget-object p1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    check-cast p1, Lax/o4/h$h;

    .line 297
    .line 298
    iput-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 299
    .line 300
    return-object v0

    .line 301
    :cond_12c
    invoke-virtual {p1}, Lax/o4/g$N;->o()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    new-array p2, v0, [Ljava/lang/Object;

    .line 306
    .line 307
    aput-object p1, p2, v1

    .line 308
    .line 309
    const-string p1, "Invalid %s element found in clipPath definition"

    .line 310
    .line 311
    invoke-static {p1, p2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-object v3

    .line 315
    :cond_13a
    :goto_13a
    iget-object p1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    check-cast p1, Lax/o4/h$h;

    .line 322
    .line 323
    iput-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 324
    .line 325
    return-object v3
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

.method private static h(FFFFFZZFFLax/o4/g$x;)V
    .registers 46

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    move/from16 v3, p8

    .line 8
    .line 9
    cmpl-float v4, p0, v2

    .line 10
    .line 11
    if-nez v4, :cond_12

    .line 12
    .line 13
    cmpl-float v4, p1, v3

    .line 14
    .line 15
    if-nez v4, :cond_12

    .line 16
    .line 17
    goto/16 :goto_1a0

    .line 18
    .line 19
    :cond_12
    const/4 v4, 0x0

    .line 20
    cmpl-float v5, p2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1b

    .line 23
    .line 24
    cmpl-float v4, p3, v4

    .line 25
    .line 26
    if-nez v4, :cond_1f

    .line 27
    .line 28
    :cond_1b
    move-object/from16 v0, p9

    .line 29
    .line 30
    goto/16 :goto_1a1

    .line 31
    .line 32
    :cond_1f
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    float-to-double v6, v0

    .line 41
    const-wide v8, 0x4076800000000000L    # 360.0

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    rem-double/2addr v6, v8

    .line 47
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    sub-float v10, p0, v2

    .line 60
    .line 61
    float-to-double v10, v10

    .line 62
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 63
    .line 64
    div-double/2addr v10, v12

    .line 65
    sub-float v14, p1, v3

    .line 66
    .line 67
    float-to-double v14, v14

    .line 68
    div-double/2addr v14, v12

    .line 69
    mul-double v16, v8, v10

    .line 70
    .line 71
    mul-double v18, v6, v14

    .line 72
    .line 73
    move-wide/from16 p2, v12

    .line 74
    .line 75
    add-double v12, v16, v18

    .line 76
    .line 77
    move-wide/from16 v16, v8

    .line 78
    .line 79
    neg-double v8, v6

    .line 80
    mul-double v8, v8, v10

    .line 81
    .line 82
    mul-double v10, v16, v14

    .line 83
    .line 84
    add-double/2addr v8, v10

    .line 85
    mul-float v10, v4, v4

    .line 86
    .line 87
    float-to-double v10, v10

    .line 88
    mul-float v14, v5, v5

    .line 89
    .line 90
    float-to-double v14, v14

    .line 91
    mul-double v18, v12, v12

    .line 92
    .line 93
    mul-double v20, v8, v8

    .line 94
    .line 95
    div-double v22, v18, v10

    .line 96
    .line 97
    div-double v24, v20, v14

    .line 98
    .line 99
    add-double v22, v22, v24

    .line 100
    .line 101
    const-wide v24, 0x3fefffeb074a771dL    # 0.99999

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    cmpl-double v26, v22, v24

    .line 107
    .line 108
    if-lez v26, :cond_86

    .line 109
    .line 110
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sqrt(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    const-wide v14, 0x3ff0000a7c5ac472L    # 1.00001

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    mul-double v10, v10, v14

    .line 120
    .line 121
    float-to-double v14, v4

    .line 122
    mul-double v14, v14, v10

    .line 123
    .line 124
    double-to-float v4, v14

    .line 125
    float-to-double v14, v5

    .line 126
    mul-double v10, v10, v14

    .line 127
    .line 128
    double-to-float v5, v10

    .line 129
    mul-float v10, v4, v4

    .line 130
    .line 131
    float-to-double v10, v10

    .line 132
    mul-float v14, v5, v5

    .line 133
    .line 134
    float-to-double v14, v14

    .line 135
    :cond_86
    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    .line 136
    .line 137
    const-wide/high16 v24, -0x4010000000000000L    # -1.0

    .line 138
    .line 139
    move-wide/from16 v26, v6

    .line 140
    .line 141
    move/from16 v6, p5

    .line 142
    .line 143
    if-ne v6, v1, :cond_93

    .line 144
    .line 145
    move-wide/from16 v6, v24

    .line 146
    .line 147
    goto :goto_95

    .line 148
    :cond_93
    move-wide/from16 v6, v22

    .line 149
    .line 150
    :goto_95
    mul-double v28, v10, v14

    .line 151
    .line 152
    mul-double v10, v10, v20

    .line 153
    .line 154
    sub-double v28, v28, v10

    .line 155
    .line 156
    mul-double v14, v14, v18

    .line 157
    .line 158
    sub-double v28, v28, v14

    .line 159
    .line 160
    add-double/2addr v10, v14

    .line 161
    div-double v28, v28, v10

    .line 162
    .line 163
    const-wide/16 v10, 0x0

    .line 164
    .line 165
    cmpg-double v14, v28, v10

    .line 166
    .line 167
    if-gez v14, :cond_aa

    .line 168
    .line 169
    move-wide/from16 v28, v10

    .line 170
    .line 171
    :cond_aa
    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->sqrt(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v14

    .line 175
    mul-double v6, v6, v14

    .line 176
    .line 177
    float-to-double v14, v4

    .line 178
    mul-double v18, v14, v8

    .line 179
    .line 180
    move-wide/from16 v20, v10

    .line 181
    .line 182
    float-to-double v10, v5

    .line 183
    div-double v18, v18, v10

    .line 184
    .line 185
    mul-double v18, v18, v6

    .line 186
    .line 187
    mul-double v28, v10, v12

    .line 188
    .line 189
    move-wide/from16 v30, v6

    .line 190
    .line 191
    div-double v6, v28, v14

    .line 192
    .line 193
    neg-double v6, v6

    .line 194
    mul-double v6, v6, v30

    .line 195
    .line 196
    add-float v1, p0, v2

    .line 197
    .line 198
    move-wide/from16 v28, v6

    .line 199
    .line 200
    float-to-double v6, v1

    .line 201
    div-double v6, v6, p2

    .line 202
    .line 203
    add-float v1, p1, v3

    .line 204
    .line 205
    move-wide/from16 v30, v6

    .line 206
    .line 207
    float-to-double v6, v1

    .line 208
    div-double v6, v6, p2

    .line 209
    .line 210
    mul-double v32, v16, v18

    .line 211
    .line 212
    mul-double v34, v26, v28

    .line 213
    .line 214
    sub-double v32, v32, v34

    .line 215
    .line 216
    move-wide/from16 p0, v6

    .line 217
    .line 218
    add-double v6, v30, v32

    .line 219
    .line 220
    mul-double v26, v26, v18

    .line 221
    .line 222
    mul-double v16, v16, v28

    .line 223
    .line 224
    add-double v26, v26, v16

    .line 225
    .line 226
    move-wide/from16 v16, v10

    .line 227
    .line 228
    add-double v10, p0, v26

    .line 229
    .line 230
    sub-double v26, v12, v18

    .line 231
    .line 232
    div-double v26, v26, v14

    .line 233
    .line 234
    sub-double v30, v8, v28

    .line 235
    .line 236
    div-double v30, v30, v16

    .line 237
    .line 238
    neg-double v12, v12

    .line 239
    sub-double v12, v12, v18

    .line 240
    .line 241
    div-double/2addr v12, v14

    .line 242
    neg-double v8, v8

    .line 243
    sub-double v8, v8, v28

    .line 244
    .line 245
    div-double v8, v8, v16

    .line 246
    .line 247
    mul-double v14, v26, v26

    .line 248
    .line 249
    mul-double v16, v30, v30

    .line 250
    .line 251
    add-double v14, v14, v16

    .line 252
    .line 253
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 254
    .line 255
    .line 256
    move-result-wide v16

    .line 257
    cmpg-double v1, v30, v20

    .line 258
    .line 259
    if-gez v1, :cond_107

    .line 260
    .line 261
    move-wide/from16 v18, v24

    .line 262
    .line 263
    goto :goto_109

    .line 264
    :cond_107
    move-wide/from16 v18, v22

    .line 265
    .line 266
    :goto_109
    div-double v16, v26, v16

    .line 267
    .line 268
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->acos(D)D

    .line 269
    .line 270
    .line 271
    move-result-wide v16

    .line 272
    mul-double v18, v18, v16

    .line 273
    .line 274
    mul-double v16, v12, v12

    .line 275
    .line 276
    mul-double v28, v8, v8

    .line 277
    .line 278
    add-double v16, v16, v28

    .line 279
    .line 280
    mul-double v14, v14, v16

    .line 281
    .line 282
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 283
    .line 284
    .line 285
    move-result-wide v14

    .line 286
    mul-double v16, v26, v12

    .line 287
    .line 288
    mul-double v28, v30, v8

    .line 289
    .line 290
    add-double v16, v16, v28

    .line 291
    .line 292
    mul-double v26, v26, v8

    .line 293
    .line 294
    mul-double v30, v30, v12

    .line 295
    .line 296
    sub-double v26, v26, v30

    .line 297
    .line 298
    cmpg-double v1, v26, v20

    .line 299
    .line 300
    if-gez v1, :cond_12f

    .line 301
    .line 302
    move-wide/from16 v22, v24

    .line 303
    .line 304
    :cond_12f
    div-double v16, v16, v14

    .line 305
    .line 306
    invoke-static/range {v16 .. v17}, Lax/o4/h;->v(D)D

    .line 307
    .line 308
    .line 309
    move-result-wide v8

    .line 310
    mul-double v22, v22, v8

    .line 311
    .line 312
    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    if-nez p6, :cond_145

    .line 318
    .line 319
    cmpl-double v1, v22, v20

    .line 320
    .line 321
    if-lez v1, :cond_145

    .line 322
    .line 323
    sub-double v22, v22, v8

    .line 324
    .line 325
    goto :goto_14d

    .line 326
    :cond_145
    if-eqz p6, :cond_14d

    .line 327
    .line 328
    cmpg-double v1, v22, v20

    .line 329
    .line 330
    if-gez v1, :cond_14d

    .line 331
    .line 332
    add-double v22, v22, v8

    .line 333
    .line 334
    :cond_14d
    :goto_14d
    rem-double v12, v22, v8

    .line 335
    .line 336
    rem-double v8, v18, v8

    .line 337
    .line 338
    invoke-static {v8, v9, v12, v13}, Lax/o4/h;->i(DD)[F

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    new-instance v8, Landroid/graphics/Matrix;

    .line 343
    .line 344
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 351
    .line 352
    .line 353
    double-to-float v0, v6

    .line 354
    double-to-float v4, v10

    .line 355
    invoke-virtual {v8, v0, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 356
    .line 357
    .line 358
    invoke-virtual {v8, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 359
    .line 360
    .line 361
    array-length v0, v1

    .line 362
    add-int/lit8 v0, v0, -0x2

    .line 363
    .line 364
    aput v2, v1, v0

    .line 365
    .line 366
    array-length v0, v1

    .line 367
    add-int/lit8 v0, v0, -0x1

    .line 368
    .line 369
    aput v3, v1, v0

    .line 370
    .line 371
    const/4 v0, 0x0

    .line 372
    :goto_173
    array-length v2, v1

    .line 373
    if-ge v0, v2, :cond_1a0

    .line 374
    .line 375
    aget v2, v1, v0

    .line 376
    .line 377
    add-int/lit8 v3, v0, 0x1

    .line 378
    .line 379
    aget v3, v1, v3

    .line 380
    .line 381
    add-int/lit8 v4, v0, 0x2

    .line 382
    .line 383
    aget v4, v1, v4

    .line 384
    .line 385
    add-int/lit8 v5, v0, 0x3

    .line 386
    .line 387
    aget v5, v1, v5

    .line 388
    .line 389
    add-int/lit8 v6, v0, 0x4

    .line 390
    .line 391
    aget v6, v1, v6

    .line 392
    .line 393
    add-int/lit8 v7, v0, 0x5

    .line 394
    .line 395
    aget v7, v1, v7

    .line 396
    .line 397
    move-object/from16 p0, p9

    .line 398
    .line 399
    move/from16 p1, v2

    .line 400
    .line 401
    move/from16 p2, v3

    .line 402
    .line 403
    move/from16 p3, v4

    .line 404
    .line 405
    move/from16 p4, v5

    .line 406
    .line 407
    move/from16 p5, v6

    .line 408
    .line 409
    move/from16 p6, v7

    .line 410
    .line 411
    invoke-interface/range {p0 .. p6}, Lax/o4/g$x;->c(FFFFFF)V

    .line 412
    .line 413
    .line 414
    add-int/lit8 v0, v0, 0x6

    .line 415
    .line 416
    goto :goto_173

    .line 417
    :cond_1a0
    :goto_1a0
    return-void

    .line 418
    :goto_1a1
    invoke-interface {v0, v2, v3}, Lax/o4/g$x;->e(FF)V

    .line 419
    .line 420
    .line 421
    return-void
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
.end method

.method private h0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/h;->f:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/o4/h;->g:Ljava/util/Stack;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 9
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

.method private static i(DD)[F
    .registers 22

    .line 1
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->abs(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 6
    .line 7
    mul-double v0, v0, v2

    .line 8
    .line 9
    const-wide v4, 0x400921fb54442d18L    # Math.PI

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    div-double/2addr v0, v4

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    double-to-int v0, v0

    .line 20
    int-to-double v4, v0

    .line 21
    div-double v4, p2, v4

    .line 22
    .line 23
    div-double v1, v4, v2

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    const-wide v8, 0x3ff5555555555555L    # 1.3333333333333333

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double v6, v6, v8

    .line 35
    .line 36
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    add-double/2addr v1, v8

    .line 43
    div-double/2addr v6, v1

    .line 44
    mul-int/lit8 v1, v0, 0x6

    .line 45
    .line 46
    new-array v1, v1, [F

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    :goto_31
    if-ge v2, v0, :cond_80

    .line 51
    .line 52
    int-to-double v8, v2

    .line 53
    mul-double v8, v8, v4

    .line 54
    .line 55
    add-double v8, p0, v8

    .line 56
    .line 57
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v12

    .line 65
    add-int/lit8 v14, v3, 0x1

    .line 66
    .line 67
    mul-double v15, v6, v12

    .line 68
    .line 69
    move/from16 v17, v0

    .line 70
    .line 71
    move-object/from16 p2, v1

    .line 72
    .line 73
    sub-double v0, v10, v15

    .line 74
    .line 75
    double-to-float v0, v0

    .line 76
    aput v0, p2, v3

    .line 77
    .line 78
    add-int/lit8 v0, v3, 0x2

    .line 79
    .line 80
    mul-double v10, v10, v6

    .line 81
    .line 82
    add-double/2addr v12, v10

    .line 83
    double-to-float v1, v12

    .line 84
    aput v1, p2, v14

    .line 85
    .line 86
    add-double/2addr v8, v4

    .line 87
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    add-int/lit8 v1, v3, 0x3

    .line 96
    .line 97
    mul-double v12, v6, v8

    .line 98
    .line 99
    add-double/2addr v12, v10

    .line 100
    double-to-float v12, v12

    .line 101
    aput v12, p2, v0

    .line 102
    .line 103
    add-int/lit8 v0, v3, 0x4

    .line 104
    .line 105
    mul-double v12, v6, v10

    .line 106
    .line 107
    sub-double v12, v8, v12

    .line 108
    .line 109
    double-to-float v12, v12

    .line 110
    aput v12, p2, v1

    .line 111
    .line 112
    add-int/lit8 v1, v3, 0x5

    .line 113
    .line 114
    double-to-float v10, v10

    .line 115
    aput v10, p2, v0

    .line 116
    .line 117
    add-int/lit8 v3, v3, 0x6

    .line 118
    .line 119
    double-to-float v0, v8

    .line 120
    aput v0, p2, v1

    .line 121
    .line 122
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    move-object/from16 v1, p2

    .line 125
    .line 126
    move/from16 v0, v17

    .line 127
    .line 128
    goto :goto_31

    .line 129
    :cond_80
    move-object/from16 p2, v1

    .line 130
    .line 131
    return-object p2
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private i0(Lax/o4/g$J;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->f:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/o4/h;->g:Ljava/util/Stack;

    .line 7
    .line 8
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private j(Lax/o4/g$K;Lax/o4/g$b;)Landroid/graphics/Path;
    .registers 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object p1, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 4
    .line 5
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 6
    .line 7
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 8
    .line 9
    iget-object v2, v2, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_21

    .line 16
    .line 17
    iget-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 18
    .line 19
    iget-object p1, p1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 20
    .line 21
    iget-object p1, p1, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 22
    .line 23
    new-array p2, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object p1, p2, v0

    .line 26
    .line 27
    const-string p1, "ClipPath reference \'%s\' not found"

    .line 28
    .line 29
    invoke-static {p1, p2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :cond_21
    check-cast p1, Lax/o4/g$e;

    .line 35
    .line 36
    iget-object v2, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 37
    .line 38
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lax/o4/h;->M(Lax/o4/g$N;)Lax/o4/h$h;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 48
    .line 49
    iget-object v2, p1, Lax/o4/g$e;->p:Ljava/lang/Boolean;

    .line 50
    .line 51
    if-eqz v2, :cond_3a

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3b

    .line 58
    .line 59
    :cond_3a
    const/4 v0, 0x1

    .line 60
    :cond_3b
    new-instance v2, Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 63
    .line 64
    .line 65
    if-nez v0, :cond_50

    .line 66
    .line 67
    iget v0, p2, Lax/o4/g$b;->a:F

    .line 68
    .line 69
    iget v3, p2, Lax/o4/g$b;->b:F

    .line 70
    .line 71
    invoke-virtual {v2, v0, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 72
    .line 73
    .line 74
    iget v0, p2, Lax/o4/g$b;->c:F

    .line 75
    .line 76
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 77
    .line 78
    invoke-virtual {v2, v0, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 79
    .line 80
    .line 81
    :cond_50
    iget-object p2, p1, Lax/o4/g$m;->o:Landroid/graphics/Matrix;

    .line 82
    .line 83
    if-eqz p2, :cond_57

    .line 84
    .line 85
    invoke-virtual {v2, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 86
    .line 87
    .line 88
    :cond_57
    new-instance p2, Landroid/graphics/Path;

    .line 89
    .line 90
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v0, p1, Lax/o4/g$H;->i:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_62
    :goto_62
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_81

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lax/o4/g$N;

    .line 110
    .line 111
    instance-of v4, v3, Lax/o4/g$K;

    .line 112
    .line 113
    if-nez v4, :cond_73

    .line 114
    .line 115
    goto :goto_62

    .line 116
    :cond_73
    check-cast v3, Lax/o4/g$K;

    .line 117
    .line 118
    invoke-direct {p0, v3, v1}, Lax/o4/h;->g0(Lax/o4/g$K;Z)Landroid/graphics/Path;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_62

    .line 123
    .line 124
    sget-object v4, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 125
    .line 126
    invoke-virtual {p2, v3, v4}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_62

    .line 130
    :cond_81
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 131
    .line 132
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 133
    .line 134
    iget-object v0, v0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v0, :cond_a0

    .line 137
    .line 138
    iget-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 139
    .line 140
    if-nez v0, :cond_93

    .line 141
    .line 142
    invoke-direct {p0, p2}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 147
    .line 148
    :cond_93
    iget-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 149
    .line 150
    invoke-direct {p0, p1, v0}, Lax/o4/h;->j(Lax/o4/g$K;Lax/o4/g$b;)Landroid/graphics/Path;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-eqz p1, :cond_a0

    .line 155
    .line 156
    sget-object v0, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 157
    .line 158
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 159
    .line 160
    .line 161
    :cond_a0
    invoke-virtual {p2, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Lax/o4/h$h;

    .line 171
    .line 172
    iput-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 173
    .line 174
    return-object p2
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

.method private j0(Lax/o4/g$K;)V
    .registers 3

    .line 1
    iget-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lax/o4/h;->k0(Lax/o4/g$K;Lax/o4/g$b;)V

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

.method private k(Lax/o4/g$q;)Ljava/util/List;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/g$q;",
            ")",
            "Ljava/util/List<",
            "Lax/o4/h$c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/o4/g$q;->o:Lax/o4/g$p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    move v4, v0

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v4, 0x0

    .line 13
    :goto_c
    iget-object v0, p1, Lax/o4/g$q;->p:Lax/o4/g$p;

    .line 14
    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    move v5, v0

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v5, 0x0

    .line 24
    :goto_17
    iget-object v0, p1, Lax/o4/g$q;->q:Lax/o4/g$p;

    .line 25
    .line 26
    if-eqz v0, :cond_21

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v8, v0

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    const/4 v8, 0x0

    .line 35
    :goto_22
    iget-object p1, p1, Lax/o4/g$q;->r:Lax/o4/g$p;

    .line 36
    .line 37
    if-eqz p1, :cond_2c

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    move v9, v1

    .line 44
    goto :goto_2d

    .line 45
    :cond_2c
    const/4 v9, 0x0

    .line 46
    :goto_2d
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lax/o4/h$c;

    .line 53
    .line 54
    sub-float v6, v8, v4

    .line 55
    .line 56
    sub-float v7, v9, v5

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    invoke-direct/range {v2 .. v7}, Lax/o4/h$c;-><init>(Lax/o4/h;FFFF)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move v10, v6

    .line 66
    new-instance v6, Lax/o4/h$c;

    .line 67
    .line 68
    move v11, v7

    .line 69
    move-object v7, p0

    .line 70
    invoke-direct/range {v6 .. v11}, Lax/o4/h$c;-><init>(Lax/o4/h;FFFF)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-object p1
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

.method private k0(Lax/o4/g$K;Lax/o4/g$b;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_72

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 15
    .line 16
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 17
    .line 18
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/16 v4, 0x1f

    .line 28
    .line 29
    invoke-virtual {v1, v3, v0, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Landroid/graphics/ColorMatrix;

    .line 38
    .line 39
    const/16 v5, 0x14

    .line 40
    .line 41
    new-array v5, v5, [F

    .line 42
    .line 43
    fill-array-data v5, :array_76

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v5}, Landroid/graphics/ColorMatrix;-><init>([F)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Landroid/graphics/ColorMatrixColorFilter;

    .line 50
    .line 51
    invoke-direct {v5, v1}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 58
    .line 59
    invoke-virtual {v1, v3, v0, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 63
    .line 64
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 65
    .line 66
    iget-object v1, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 67
    .line 68
    iget-object v1, v1, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lax/o4/g$s;

    .line 75
    .line 76
    invoke-direct {p0, v0, p1, p2}, Lax/o4/h;->J0(Lax/o4/g$s;Lax/o4/g$K;Lax/o4/g$b;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 82
    .line 83
    .line 84
    new-instance v1, Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v5, Landroid/graphics/PorterDuffXfermode;

    .line 90
    .line 91
    invoke-direct {v5, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 98
    .line 99
    invoke-virtual {v2, v3, v1, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 100
    .line 101
    .line 102
    invoke-direct {p0, v0, p1, p2}, Lax/o4/h;->J0(Lax/o4/g$s;Lax/o4/g$K;Lax/o4/g$b;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 113
    .line 114
    .line 115
    :cond_72
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :array_76
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3e59ce07    # 0.2127f
        0x3f3710cb    # 0.7151f
        0x3d93dd98    # 0.0722f
        0x0
        0x0
    .end array-data
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

.method private l(Lax/o4/g$z;)Ljava/util/List;
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/g$z;",
            ")",
            "Ljava/util/List<",
            "Lax/o4/h$c;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lax/o4/g$z;->o:[F

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    const/4 v2, 0x2

    .line 7
    if-ge v1, v2, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lax/o4/h$c;

    .line 17
    .line 18
    iget-object v5, v0, Lax/o4/g$z;->o:[F

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    aget v6, v5, v10

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    aget v7, v5, v11

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    move-object/from16 v5, p0

    .line 29
    .line 30
    invoke-direct/range {v4 .. v9}, Lax/o4/h$c;-><init>(Lax/o4/h;FFFF)V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    :goto_22
    if-ge v2, v1, :cond_47

    .line 36
    .line 37
    iget-object v5, v0, Lax/o4/g$z;->o:[F

    .line 38
    .line 39
    aget v14, v5, v2

    .line 40
    .line 41
    add-int/lit8 v6, v2, 0x1

    .line 42
    .line 43
    aget v15, v5, v6

    .line 44
    .line 45
    invoke-virtual {v4, v14, v15}, Lax/o4/h$c;->a(FF)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    new-instance v12, Lax/o4/h$c;

    .line 52
    .line 53
    iget v5, v4, Lax/o4/h$c;->a:F

    .line 54
    .line 55
    sub-float v16, v14, v5

    .line 56
    .line 57
    iget v4, v4, Lax/o4/h$c;->b:F

    .line 58
    .line 59
    sub-float v17, v15, v4

    .line 60
    .line 61
    move-object/from16 v13, p0

    .line 62
    .line 63
    invoke-direct/range {v12 .. v17}, Lax/o4/h$c;-><init>(Lax/o4/h;FFFF)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x2

    .line 67
    .line 68
    move-object v4, v12

    .line 69
    move v5, v14

    .line 70
    move v6, v15

    .line 71
    goto :goto_22

    .line 72
    :cond_47
    instance-of v1, v0, Lax/o4/g$A;

    .line 73
    .line 74
    if-eqz v1, :cond_7e

    .line 75
    .line 76
    iget-object v0, v0, Lax/o4/g$z;->o:[F

    .line 77
    .line 78
    aget v14, v0, v10

    .line 79
    .line 80
    cmpl-float v1, v5, v14

    .line 81
    .line 82
    if-eqz v1, :cond_7d

    .line 83
    .line 84
    aget v15, v0, v11

    .line 85
    .line 86
    cmpl-float v0, v6, v15

    .line 87
    .line 88
    if-eqz v0, :cond_7d

    .line 89
    .line 90
    invoke-virtual {v4, v14, v15}, Lax/o4/h$c;->a(FF)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    new-instance v12, Lax/o4/h$c;

    .line 97
    .line 98
    iget v0, v4, Lax/o4/h$c;->a:F

    .line 99
    .line 100
    sub-float v16, v14, v0

    .line 101
    .line 102
    iget v0, v4, Lax/o4/h$c;->b:F

    .line 103
    .line 104
    sub-float v17, v15, v0

    .line 105
    .line 106
    move-object/from16 v13, p0

    .line 107
    .line 108
    invoke-direct/range {v12 .. v17}, Lax/o4/h$c;-><init>(Lax/o4/h;FFFF)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lax/o4/h$c;

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Lax/o4/h$c;->b(Lax/o4/h$c;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-interface {v3, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_7d
    return-object v3

    .line 127
    :cond_7e
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    return-object v3
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

.method private l0(Lax/o4/g$N;Lax/o4/h$j;)V
    .registers 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, p1

    .line 4
    check-cast v2, Lax/o4/g$Y;

    .line 5
    .line 6
    invoke-virtual {p2, v2}, Lax/o4/h$j;->a(Lax/o4/g$Y;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_d

    .line 11
    .line 12
    goto/16 :goto_13c

    .line 13
    .line 14
    :cond_d
    instance-of v2, p1, Lax/o4/g$Z;

    .line 15
    .line 16
    if-eqz v2, :cond_1d

    .line 17
    .line 18
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 19
    .line 20
    .line 21
    check-cast p1, Lax/o4/g$Z;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lax/o4/h;->L0(Lax/o4/g$Z;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    instance-of v2, p1, Lax/o4/g$V;

    .line 31
    .line 32
    if-eqz v2, :cond_ea

    .line 33
    .line 34
    const-string v2, "TSpan render"

    .line 35
    .line 36
    new-array v3, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {v2, v3}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 42
    .line 43
    .line 44
    check-cast p1, Lax/o4/g$V;

    .line 45
    .line 46
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 47
    .line 48
    invoke-direct {p0, v2, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_e6

    .line 56
    .line 57
    iget-object v2, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v2, :cond_43

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-lez v2, :cond_43

    .line 66
    .line 67
    goto :goto_44

    .line 68
    :cond_43
    const/4 v0, 0x0

    .line 69
    :goto_44
    instance-of v2, p2, Lax/o4/h$f;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v2, :cond_ad

    .line 73
    .line 74
    if-nez v0, :cond_51

    .line 75
    .line 76
    move-object v4, p2

    .line 77
    check-cast v4, Lax/o4/h$f;

    .line 78
    .line 79
    iget v4, v4, Lax/o4/h$f;->b:F

    .line 80
    .line 81
    goto :goto_5d

    .line 82
    :cond_51
    iget-object v4, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lax/o4/g$p;

    .line 89
    .line 90
    invoke-virtual {v4, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    :goto_5d
    iget-object v5, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 95
    .line 96
    if-eqz v5, :cond_75

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-nez v5, :cond_68

    .line 103
    .line 104
    goto :goto_75

    .line 105
    :cond_68
    iget-object v5, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lax/o4/g$p;

    .line 112
    .line 113
    invoke-virtual {v5, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    goto :goto_7a

    .line 118
    :cond_75
    :goto_75
    move-object v5, p2

    .line 119
    check-cast v5, Lax/o4/h$f;

    .line 120
    .line 121
    iget v5, v5, Lax/o4/h$f;->c:F

    .line 122
    .line 123
    :goto_7a
    iget-object v6, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 124
    .line 125
    if-eqz v6, :cond_92

    .line 126
    .line 127
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_85

    .line 132
    .line 133
    goto :goto_92

    .line 134
    :cond_85
    iget-object v6, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Lax/o4/g$p;

    .line 141
    .line 142
    invoke-virtual {v6, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    goto :goto_93

    .line 147
    :cond_92
    :goto_92
    const/4 v6, 0x0

    .line 148
    :goto_93
    iget-object v7, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 149
    .line 150
    if-eqz v7, :cond_aa

    .line 151
    .line 152
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_9e

    .line 157
    .line 158
    goto :goto_aa

    .line 159
    :cond_9e
    iget-object v3, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Lax/o4/g$p;

    .line 166
    .line 167
    invoke-virtual {v1, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    :cond_aa
    :goto_aa
    move v1, v3

    .line 172
    move v3, v4

    .line 173
    goto :goto_b0

    .line 174
    :cond_ad
    const/4 v1, 0x0

    .line 175
    const/4 v5, 0x0

    .line 176
    const/4 v6, 0x0

    .line 177
    :goto_b0
    if-eqz v0, :cond_c6

    .line 178
    .line 179
    invoke-direct {p0}, Lax/o4/h;->O()Lax/o4/g$E$f;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sget-object v4, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 184
    .line 185
    if-eq v0, v4, :cond_c6

    .line 186
    .line 187
    invoke-direct {p0, p1}, Lax/o4/h;->n(Lax/o4/g$Y;)F

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    sget-object v7, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 192
    .line 193
    if-ne v0, v7, :cond_c5

    .line 194
    .line 195
    const/high16 v0, 0x40000000    # 2.0f

    .line 196
    .line 197
    div-float/2addr v4, v0

    .line 198
    :cond_c5
    sub-float/2addr v3, v4

    .line 199
    :cond_c6
    invoke-virtual {p1}, Lax/o4/g$V;->f()Lax/o4/g$b0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Lax/o4/g$K;

    .line 204
    .line 205
    invoke-direct {p0, v0}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 206
    .line 207
    .line 208
    if-eqz v2, :cond_da

    .line 209
    .line 210
    move-object v0, p2

    .line 211
    check-cast v0, Lax/o4/h$f;

    .line 212
    .line 213
    add-float/2addr v3, v6

    .line 214
    iput v3, v0, Lax/o4/h$f;->b:F

    .line 215
    .line 216
    add-float/2addr v5, v1

    .line 217
    iput v5, v0, Lax/o4/h$f;->c:F

    .line 218
    .line 219
    :cond_da
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-direct {p0, p1, p2}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 224
    .line 225
    .line 226
    if-eqz v0, :cond_e6

    .line 227
    .line 228
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 229
    .line 230
    .line 231
    :cond_e6
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_ea
    instance-of v2, p1, Lax/o4/g$U;

    .line 236
    .line 237
    if-eqz v2, :cond_13c

    .line 238
    .line 239
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 240
    .line 241
    .line 242
    move-object v2, p1

    .line 243
    check-cast v2, Lax/o4/g$U;

    .line 244
    .line 245
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 246
    .line 247
    invoke-direct {p0, v3, v2}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 248
    .line 249
    .line 250
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_139

    .line 255
    .line 256
    invoke-virtual {v2}, Lax/o4/g$U;->f()Lax/o4/g$b0;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, Lax/o4/g$K;

    .line 261
    .line 262
    invoke-direct {p0, v3}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 263
    .line 264
    .line 265
    iget-object p1, p1, Lax/o4/g$N;->a:Lax/o4/g;

    .line 266
    .line 267
    iget-object v3, v2, Lax/o4/g$U;->o:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    if-eqz p1, :cond_12e

    .line 274
    .line 275
    instance-of v3, p1, Lax/o4/g$Y;

    .line 276
    .line 277
    if-eqz v3, :cond_12e

    .line 278
    .line 279
    new-instance v0, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    check-cast p1, Lax/o4/g$Y;

    .line 285
    .line 286
    invoke-direct {p0, p1, v0}, Lax/o4/h;->G(Lax/o4/g$Y;Ljava/lang/StringBuilder;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-lez p1, :cond_139

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p2, p1}, Lax/o4/h$j;->b(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto :goto_139

    .line 303
    :cond_12e
    iget-object p1, v2, Lax/o4/g$U;->o:Ljava/lang/String;

    .line 304
    .line 305
    new-array p2, v0, [Ljava/lang/Object;

    .line 306
    .line 307
    aput-object p1, p2, v1

    .line 308
    .line 309
    const-string p1, "Tref reference \'%s\' not found"

    .line 310
    .line 311
    invoke-static {p1, p2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_139
    :goto_139
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 315
    .line 316
    .line 317
    :cond_13c
    :goto_13c
    return-void
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

.method private m(Landroid/graphics/Path;)Lax/o4/g$b;
    .registers 6

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lax/o4/g$b;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p1, v1, v2, v3, v0}, Lax/o4/g$b;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    return-object p1
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

.method private m0()Z
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0}, Lax/o4/h;->M0()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-nez v2, :cond_9

    .line 8
    .line 9
    return v1

    .line 10
    :cond_9
    iget-object v2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 11
    .line 12
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 13
    .line 14
    iget-object v3, v3, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 15
    .line 16
    iget-object v3, v3, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v3}, Lax/o4/h;->w(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v4, 0x1f

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-virtual {v2, v5, v3, v4}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lax/o4/h;->e:Ljava/util/Stack;

    .line 33
    .line 34
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    new-instance v2, Lax/o4/h$h;

    .line 40
    .line 41
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 42
    .line 43
    invoke-direct {v2, p0, v3}, Lax/o4/h$h;-><init>(Lax/o4/h;Lax/o4/h$h;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 47
    .line 48
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 49
    .line 50
    iget-object v2, v2, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v2, :cond_56

    .line 53
    .line 54
    iget-object v3, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_41

    .line 61
    .line 62
    instance-of v2, v2, Lax/o4/g$s;

    .line 63
    .line 64
    if-nez v2, :cond_56

    .line 65
    .line 66
    :cond_41
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 67
    .line 68
    iget-object v2, v2, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 69
    .line 70
    iget-object v2, v2, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 71
    .line 72
    new-array v3, v0, [Ljava/lang/Object;

    .line 73
    .line 74
    aput-object v2, v3, v1

    .line 75
    .line 76
    const-string v1, "Mask reference \'%s\' not found"

    .line 77
    .line 78
    invoke-static {v1, v3}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 82
    .line 83
    iget-object v1, v1, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 84
    .line 85
    iput-object v5, v1, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 86
    .line 87
    :cond_56
    return v0
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

.method private n(Lax/o4/g$Y;)F
    .registers 4

    .line 1
    new-instance v0, Lax/o4/h$k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/o4/h$k;-><init>(Lax/o4/h;Lax/o4/h$a;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Lax/o4/h;->E(Lax/o4/g$Y;Lax/o4/h$j;)V

    .line 8
    .line 9
    .line 10
    iget p1, v0, Lax/o4/h$k;->b:F

    .line 11
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
.end method

.method private n0(Lax/o4/h$c;Lax/o4/h$c;Lax/o4/h$c;)Lax/o4/h$c;
    .registers 8

    .line 1
    iget v0, p2, Lax/o4/h$c;->c:F

    .line 2
    .line 3
    iget v1, p2, Lax/o4/h$c;->d:F

    .line 4
    .line 5
    iget v2, p2, Lax/o4/h$c;->a:F

    .line 6
    .line 7
    iget v3, p1, Lax/o4/h$c;->a:F

    .line 8
    .line 9
    sub-float/2addr v2, v3

    .line 10
    iget v3, p2, Lax/o4/h$c;->b:F

    .line 11
    .line 12
    iget p1, p1, Lax/o4/h$c;->b:F

    .line 13
    .line 14
    sub-float/2addr v3, p1

    .line 15
    invoke-direct {p0, v0, v1, v2, v3}, Lax/o4/h;->D(FFFF)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpl-float v1, p1, v0

    .line 21
    .line 22
    if-nez v1, :cond_29

    .line 23
    .line 24
    iget p1, p2, Lax/o4/h$c;->c:F

    .line 25
    .line 26
    iget v1, p2, Lax/o4/h$c;->d:F

    .line 27
    .line 28
    iget v2, p3, Lax/o4/h$c;->a:F

    .line 29
    .line 30
    iget v3, p2, Lax/o4/h$c;->a:F

    .line 31
    .line 32
    sub-float/2addr v2, v3

    .line 33
    iget p3, p3, Lax/o4/h$c;->b:F

    .line 34
    .line 35
    iget v3, p2, Lax/o4/h$c;->b:F

    .line 36
    .line 37
    sub-float/2addr p3, v3

    .line 38
    invoke-direct {p0, p1, v1, v2, p3}, Lax/o4/h;->D(FFFF)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :cond_29
    cmpl-float p1, p1, v0

    .line 43
    .line 44
    if-lez p1, :cond_2e

    .line 45
    .line 46
    goto :goto_3c

    .line 47
    :cond_2e
    if-nez p1, :cond_3d

    .line 48
    .line 49
    iget p1, p2, Lax/o4/h$c;->c:F

    .line 50
    .line 51
    cmpl-float p1, p1, v0

    .line 52
    .line 53
    if-gtz p1, :cond_3c

    .line 54
    .line 55
    iget p1, p2, Lax/o4/h$c;->d:F

    .line 56
    .line 57
    cmpl-float p1, p1, v0

    .line 58
    .line 59
    if-ltz p1, :cond_3d

    .line 60
    .line 61
    :cond_3c
    :goto_3c
    return-object p2

    .line 62
    :cond_3d
    iget p1, p2, Lax/o4/h$c;->c:F

    .line 63
    .line 64
    neg-float p1, p1

    .line 65
    iput p1, p2, Lax/o4/h$c;->c:F

    .line 66
    .line 67
    iget p1, p2, Lax/o4/h$c;->d:F

    .line 68
    .line 69
    neg-float p1, p1

    .line 70
    iput p1, p2, Lax/o4/h$c;->d:F

    .line 71
    .line 72
    return-object p2
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

.method private o(Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)Landroid/graphics/Matrix;
    .registers 13

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_9d

    .line 7
    .line 8
    invoke-virtual {p3}, Lax/o4/e;->a()Lax/o4/e$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_f

    .line 13
    .line 14
    goto/16 :goto_9d

    .line 15
    .line 16
    :cond_f
    iget v1, p1, Lax/o4/g$b;->c:F

    .line 17
    .line 18
    iget v2, p2, Lax/o4/g$b;->c:F

    .line 19
    .line 20
    div-float/2addr v1, v2

    .line 21
    iget v2, p1, Lax/o4/g$b;->d:F

    .line 22
    .line 23
    iget v3, p2, Lax/o4/g$b;->d:F

    .line 24
    .line 25
    div-float/2addr v2, v3

    .line 26
    iget v3, p2, Lax/o4/g$b;->a:F

    .line 27
    .line 28
    neg-float v3, v3

    .line 29
    iget v4, p2, Lax/o4/g$b;->b:F

    .line 30
    .line 31
    neg-float v4, v4

    .line 32
    sget-object v5, Lax/o4/e;->d:Lax/o4/e;

    .line 33
    .line 34
    invoke-virtual {p3, v5}, Lax/o4/e;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_35

    .line 39
    .line 40
    iget p2, p1, Lax/o4/g$b;->a:F

    .line 41
    .line 42
    iget p1, p1, Lax/o4/g$b;->b:F

    .line 43
    .line 44
    invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_35
    invoke-virtual {p3}, Lax/o4/e;->b()Lax/o4/e$b;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    sget-object v6, Lax/o4/e$b;->c0:Lax/o4/e$b;

    .line 59
    .line 60
    if-ne v5, v6, :cond_42

    .line 61
    .line 62
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_46

    .line 67
    :cond_42
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    :goto_46
    iget v2, p1, Lax/o4/g$b;->c:F

    .line 72
    .line 73
    div-float/2addr v2, v1

    .line 74
    iget v5, p1, Lax/o4/g$b;->d:F

    .line 75
    .line 76
    div-float/2addr v5, v1

    .line 77
    sget-object v6, Lax/o4/h$a;->a:[I

    .line 78
    .line 79
    invoke-virtual {p3}, Lax/o4/e;->a()Lax/o4/e$a;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    aget v7, v6, v7

    .line 88
    .line 89
    const/high16 v8, 0x40000000    # 2.0f

    .line 90
    .line 91
    packed-switch v7, :pswitch_data_9e

    .line 92
    .line 93
    .line 94
    goto :goto_68

    .line 95
    :pswitch_5e
    iget v7, p2, Lax/o4/g$b;->c:F

    .line 96
    .line 97
    sub-float/2addr v7, v2

    .line 98
    :goto_61
    sub-float/2addr v3, v7

    .line 99
    goto :goto_68

    .line 100
    :pswitch_63
    iget v7, p2, Lax/o4/g$b;->c:F

    .line 101
    .line 102
    sub-float/2addr v7, v2

    .line 103
    div-float/2addr v7, v8

    .line 104
    goto :goto_61

    .line 105
    :goto_68
    invoke-virtual {p3}, Lax/o4/e;->a()Lax/o4/e$a;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    aget p3, v6, p3

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    if-eq p3, v2, :cond_8b

    .line 117
    .line 118
    const/4 v2, 0x3

    .line 119
    if-eq p3, v2, :cond_86

    .line 120
    .line 121
    const/4 v2, 0x5

    .line 122
    if-eq p3, v2, :cond_8b

    .line 123
    .line 124
    const/4 v2, 0x6

    .line 125
    if-eq p3, v2, :cond_86

    .line 126
    .line 127
    const/4 v2, 0x7

    .line 128
    if-eq p3, v2, :cond_8b

    .line 129
    .line 130
    const/16 v2, 0x8

    .line 131
    .line 132
    if-eq p3, v2, :cond_86

    .line 133
    .line 134
    goto :goto_90

    .line 135
    :cond_86
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 136
    .line 137
    sub-float/2addr p2, v5

    .line 138
    :goto_89
    sub-float/2addr v4, p2

    .line 139
    goto :goto_90

    .line 140
    :cond_8b
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 141
    .line 142
    sub-float/2addr p2, v5

    .line 143
    div-float/2addr p2, v8

    .line 144
    goto :goto_89

    .line 145
    :goto_90
    iget p2, p1, Lax/o4/g$b;->a:F

    .line 146
    .line 147
    iget p1, p1, Lax/o4/g$b;->b:F

    .line 148
    .line 149
    invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 156
    .line 157
    .line 158
    :cond_9d
    :goto_9d
    return-object v0

    .line 159
    :pswitch_data_9e
    .packed-switch 0x1
        :pswitch_63
        :pswitch_63
        :pswitch_63
        :pswitch_5e
        :pswitch_5e
        :pswitch_5e
    .end packed-switch
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

.method private o0(Lax/o4/g$d;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Circle render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/g$d;->q:Lax/o4/g$p;

    .line 10
    .line 11
    if-eqz v0, :cond_57

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_57

    .line 20
    :cond_13
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 21
    .line 22
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1f

    .line 30
    .line 31
    goto :goto_57

    .line 32
    :cond_1f
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_26

    .line 37
    .line 38
    goto :goto_57

    .line 39
    :cond_26
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 40
    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    invoke-direct {p0, p1}, Lax/o4/h;->Y(Lax/o4/g$d;)Landroid/graphics/Path;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 66
    .line 67
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 68
    .line 69
    if-eqz v2, :cond_49

    .line 70
    .line 71
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 75
    .line 76
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 77
    .line 78
    if-eqz v2, :cond_52

    .line 79
    .line 80
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 81
    .line 82
    .line 83
    :cond_52
    if-eqz v1, :cond_57

    .line 84
    .line 85
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

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

.method private p(Lax/o4/g$K;)V
    .registers 3

    .line 1
    iget-object v0, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lax/o4/h;->q(Lax/o4/g$K;Lax/o4/g$b;)V

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

.method private p0(Lax/o4/g$i;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Ellipse render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/g$i;->q:Lax/o4/g$p;

    .line 10
    .line 11
    if-eqz v0, :cond_63

    .line 12
    .line 13
    iget-object v1, p1, Lax/o4/g$i;->r:Lax/o4/g$p;

    .line 14
    .line 15
    if-eqz v1, :cond_63

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_63

    .line 22
    .line 23
    iget-object v0, p1, Lax/o4/g$i;->r:Lax/o4/g$p;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_63

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_63

    .line 44
    :cond_2b
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_32

    .line 49
    .line 50
    goto :goto_63

    .line 51
    :cond_32
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 52
    .line 53
    if-eqz v0, :cond_3b

    .line 54
    .line 55
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    invoke-direct {p0, p1}, Lax/o4/h;->Z(Lax/o4/g$i;)Landroid/graphics/Path;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 78
    .line 79
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 80
    .line 81
    if-eqz v2, :cond_55

    .line 82
    .line 83
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 84
    .line 85
    .line 86
    :cond_55
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 87
    .line 88
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 89
    .line 90
    if-eqz v2, :cond_5e

    .line 91
    .line 92
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 93
    .line 94
    .line 95
    :cond_5e
    if-eqz v1, :cond_63

    .line 96
    .line 97
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 98
    .line 99
    .line 100
    :cond_63
    :goto_63
    return-void
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

.method private q(Lax/o4/g$K;Lax/o4/g$b;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_14

    .line 10
    :cond_9
    invoke-direct {p0, p1, p2}, Lax/o4/h;->j(Lax/o4/g$K;Lax/o4/g$b;)Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_14

    .line 15
    .line 16
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 19
    .line 20
    .line 21
    :cond_14
    :goto_14
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
.end method

.method private q0(Lax/o4/g$m;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Group render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-object v0, p1, Lax/o4/g$m;->o:Landroid/graphics/Matrix;

    .line 22
    .line 23
    if-eqz v0, :cond_1d

    .line 24
    .line 25
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {p0, p1, v1}, Lax/o4/h;->F0(Lax/o4/g$J;Z)V

    .line 39
    .line 40
    .line 41
    if-eqz v0, :cond_2d

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 47
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
.end method

.method private r(Lax/o4/g$K;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 4
    .line 5
    iget-object v0, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 6
    .line 7
    instance-of v1, v0, Lax/o4/g$u;

    .line 8
    .line 9
    if-eqz v1, :cond_12

    .line 10
    .line 11
    iget-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 12
    .line 13
    check-cast v0, Lax/o4/g$u;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2, v1, v0}, Lax/o4/h;->z(ZLax/o4/g$b;Lax/o4/g$u;)V

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 20
    .line 21
    iget-object v0, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 22
    .line 23
    iget-object v0, v0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 24
    .line 25
    instance-of v1, v0, Lax/o4/g$u;

    .line 26
    .line 27
    if-eqz v1, :cond_24

    .line 28
    .line 29
    iget-object p1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 30
    .line 31
    check-cast v0, Lax/o4/g$u;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0, v1, p1, v0}, Lax/o4/h;->z(ZLax/o4/g$b;Lax/o4/g$u;)V

    .line 35
    .line 36
    .line 37
    :cond_24
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
.end method

.method private r0(Lax/o4/g$o;)V
    .registers 13

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "Image render"

    .line 5
    .line 6
    invoke-static {v2, v1}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p1, Lax/o4/g$o;->s:Lax/o4/g$p;

    .line 10
    .line 11
    if-eqz v1, :cond_ec

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/o4/g$p;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_ec

    .line 18
    .line 19
    iget-object v1, p1, Lax/o4/g$o;->t:Lax/o4/g$p;

    .line 20
    .line 21
    if-eqz v1, :cond_ec

    .line 22
    .line 23
    invoke-virtual {v1}, Lax/o4/g$p;->k()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1e

    .line 28
    .line 29
    goto/16 :goto_ec

    .line 30
    .line 31
    :cond_1e
    iget-object v1, p1, Lax/o4/g$o;->p:Ljava/lang/String;

    .line 32
    .line 33
    if-nez v1, :cond_24

    .line 34
    .line 35
    goto/16 :goto_ec

    .line 36
    .line 37
    :cond_24
    iget-object v2, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 38
    .line 39
    if-eqz v2, :cond_29

    .line 40
    .line 41
    goto :goto_2b

    .line 42
    :cond_29
    sget-object v2, Lax/o4/e;->e:Lax/o4/e;

    .line 43
    .line 44
    :goto_2b
    invoke-direct {p0, v1}, Lax/o4/h;->s(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_35

    .line 49
    .line 50
    invoke-static {}, Lax/o4/g;->k()Lax/o4/i;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    new-instance v3, Lax/o4/g$b;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    int-to-float v4, v4

    .line 61
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    int-to-float v5, v5

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v3, v6, v6, v4, v5}, Lax/o4/g$b;-><init>(FFFF)V

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 71
    .line 72
    invoke-direct {p0, v4, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_52

    .line 80
    .line 81
    goto/16 :goto_ec

    .line 82
    .line 83
    :cond_52
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_5a

    .line 88
    .line 89
    goto/16 :goto_ec

    .line 90
    .line 91
    :cond_5a
    iget-object v4, p1, Lax/o4/g$o;->u:Landroid/graphics/Matrix;

    .line 92
    .line 93
    if-eqz v4, :cond_63

    .line 94
    .line 95
    iget-object v5, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 98
    .line 99
    .line 100
    :cond_63
    iget-object v4, p1, Lax/o4/g$o;->q:Lax/o4/g$p;

    .line 101
    .line 102
    if-eqz v4, :cond_6c

    .line 103
    .line 104
    invoke-virtual {v4, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    goto :goto_6d

    .line 109
    :cond_6c
    const/4 v4, 0x0

    .line 110
    :goto_6d
    iget-object v5, p1, Lax/o4/g$o;->r:Lax/o4/g$p;

    .line 111
    .line 112
    if-eqz v5, :cond_76

    .line 113
    .line 114
    invoke-virtual {v5, p0}, Lax/o4/g$p;->i(Lax/o4/h;)F

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    goto :goto_77

    .line 119
    :cond_76
    const/4 v5, 0x0

    .line 120
    :goto_77
    iget-object v7, p1, Lax/o4/g$o;->s:Lax/o4/g$p;

    .line 121
    .line 122
    invoke-virtual {v7, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    iget-object v8, p1, Lax/o4/g$o;->t:Lax/o4/g$p;

    .line 127
    .line 128
    invoke-virtual {v8, p0}, Lax/o4/g$p;->h(Lax/o4/h;)F

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    iget-object v9, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 133
    .line 134
    new-instance v10, Lax/o4/g$b;

    .line 135
    .line 136
    invoke-direct {v10, v4, v5, v7, v8}, Lax/o4/g$b;-><init>(FFFF)V

    .line 137
    .line 138
    .line 139
    iput-object v10, v9, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 140
    .line 141
    iget-object v4, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 142
    .line 143
    iget-object v4, v4, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 144
    .line 145
    iget-object v4, v4, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_a7

    .line 152
    .line 153
    iget-object v4, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 154
    .line 155
    iget-object v4, v4, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 156
    .line 157
    iget v5, v4, Lax/o4/g$b;->a:F

    .line 158
    .line 159
    iget v7, v4, Lax/o4/g$b;->b:F

    .line 160
    .line 161
    iget v8, v4, Lax/o4/g$b;->c:F

    .line 162
    .line 163
    iget v4, v4, Lax/o4/g$b;->d:F

    .line 164
    .line 165
    invoke-direct {p0, v5, v7, v8, v4}, Lax/o4/h;->O0(FFFF)V

    .line 166
    .line 167
    .line 168
    :cond_a7
    iget-object v4, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 169
    .line 170
    iget-object v4, v4, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 171
    .line 172
    iput-object v4, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 175
    .line 176
    .line 177
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-direct {p0}, Lax/o4/h;->X0()V

    .line 185
    .line 186
    .line 187
    iget-object v5, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 188
    .line 189
    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    .line 190
    .line 191
    .line 192
    iget-object v5, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 193
    .line 194
    iget-object v7, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 195
    .line 196
    iget-object v7, v7, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 197
    .line 198
    invoke-direct {p0, v7, v3, v2}, Lax/o4/h;->o(Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)Landroid/graphics/Matrix;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v5, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 203
    .line 204
    .line 205
    new-instance v2, Landroid/graphics/Paint;

    .line 206
    .line 207
    iget-object v3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 208
    .line 209
    iget-object v3, v3, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 210
    .line 211
    iget-object v3, v3, Lax/o4/g$E;->N0:Lax/o4/g$E$e;

    .line 212
    .line 213
    sget-object v5, Lax/o4/g$E$e;->d0:Lax/o4/g$E$e;

    .line 214
    .line 215
    if-ne v3, v5, :cond_d9

    .line 216
    .line 217
    goto :goto_da

    .line 218
    :cond_d9
    const/4 v0, 0x2

    .line 219
    :goto_da
    invoke-direct {v2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 223
    .line 224
    invoke-virtual {v0, v1, v6, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 230
    .line 231
    .line 232
    if-eqz v4, :cond_ec

    .line 233
    .line 234
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 235
    .line 236
    .line 237
    :cond_ec
    :goto_ec
    return-void
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

.method private s(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .registers 6

    .line 1
    const-string v0, "data:"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_a
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v2, 0xe

    .line 16
    .line 17
    if-ge v0, v2, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    const/16 v0, 0x2c

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v2, 0xc

    .line 27
    .line 28
    if-ge v0, v2, :cond_1e

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1e
    add-int/lit8 v2, v0, -0x7

    .line 32
    .line 33
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, ";base64"

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2d

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2d
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    :try_start_2f
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    array-length v2, p1

    .line 58
    invoke-static {p1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_3d} :catch_3e

    .line 62
    return-object p1

    .line 63
    :catch_3e
    move-exception p1

    .line 64
    const-string v0, "SVGAndroidRenderer"

    .line 65
    .line 66
    const-string v2, "Could not decode bad Data URL"

    .line 67
    .line 68
    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    return-object v1
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

.method private s0(Lax/o4/g$q;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Line render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    goto :goto_47

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    goto :goto_47

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 29
    .line 30
    iget-boolean v0, v0, Lax/o4/h$h;->c:Z

    .line 31
    .line 32
    if-nez v0, :cond_22

    .line 33
    .line 34
    goto :goto_47

    .line 35
    :cond_22
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 36
    .line 37
    if-eqz v0, :cond_2b

    .line 38
    .line 39
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    invoke-direct {p0, p1}, Lax/o4/h;->a0(Lax/o4/g$q;)Landroid/graphics/Path;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lax/o4/h;->I0(Lax/o4/g$l;)V

    .line 65
    .line 66
    .line 67
    if-eqz v1, :cond_47

    .line 68
    .line 69
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    :goto_47
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
.end method

.method private t(Ljava/lang/String;Ljava/lang/Integer;Lax/o4/g$E$b;)Landroid/graphics/Typeface;
    .registers 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x3

    .line 3
    sget-object v2, Lax/o4/g$E$b;->c0:Lax/o4/g$E$b;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ne p3, v2, :cond_a

    .line 8
    .line 9
    const/4 p3, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 p3, 0x0

    .line 12
    :goto_b
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/16 v2, 0x1f4

    .line 17
    .line 18
    if-le p2, v2, :cond_19

    .line 19
    .line 20
    if-eqz p3, :cond_17

    .line 21
    .line 22
    const/4 p2, 0x3

    .line 23
    goto :goto_1e

    .line 24
    :cond_17
    const/4 p2, 0x1

    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    if-eqz p3, :cond_1d

    .line 27
    .line 28
    const/4 p2, 0x2

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 p2, 0x0

    .line 31
    :goto_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 p3, -0x1

    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sparse-switch v2, :sswitch_data_88

    .line 40
    .line 41
    .line 42
    :goto_29
    const/4 v0, -0x1

    .line 43
    goto :goto_5f

    .line 44
    :sswitch_2b
    const-string v0, "cursive"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_34

    .line 51
    .line 52
    goto :goto_29

    .line 53
    :cond_34
    const/4 v0, 0x4

    .line 54
    goto :goto_5f

    .line 55
    :sswitch_36
    const-string v0, "serif"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_3f

    .line 62
    .line 63
    goto :goto_29

    .line 64
    :cond_3f
    const/4 v0, 0x3

    .line 65
    goto :goto_5f

    .line 66
    :sswitch_41
    const-string v1, "fantasy"

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_5f

    .line 73
    .line 74
    goto :goto_29

    .line 75
    :sswitch_4a
    const-string v0, "monospace"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_53

    .line 82
    .line 83
    goto :goto_29

    .line 84
    :cond_53
    const/4 v0, 0x1

    .line 85
    goto :goto_5f

    .line 86
    :sswitch_55
    const-string v0, "sans-serif"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5e

    .line 93
    .line 94
    goto :goto_29

    .line 95
    :cond_5e
    const/4 v0, 0x0

    .line 96
    :cond_5f
    :goto_5f
    packed-switch v0, :pswitch_data_9e

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    return-object p1

    .line 101
    :pswitch_64
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 102
    .line 103
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :pswitch_6b
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 109
    .line 110
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :pswitch_72
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 116
    .line 117
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_79
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 123
    .line 124
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :pswitch_80
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 130
    .line 131
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    nop

    .line 137
    :sswitch_data_88
    .sparse-switch
        -0x5b97f43d -> :sswitch_55
        -0x5559f3fd -> :sswitch_4a
        -0x407a00da -> :sswitch_41
        0x684317d -> :sswitch_36
        0x432c41c5 -> :sswitch_2b
    .end sparse-switch

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
    :pswitch_data_9e
    .packed-switch 0x0
        :pswitch_80
        :pswitch_79
        :pswitch_72
        :pswitch_6b
        :pswitch_64
    .end packed-switch
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

.method private t0(Lax/o4/g$v;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Path render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_77

    .line 14
    :cond_d
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 15
    .line 16
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    goto :goto_77

    .line 26
    :cond_19
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_20

    .line 31
    .line 32
    goto :goto_77

    .line 33
    :cond_20
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 34
    .line 35
    iget-boolean v1, v0, Lax/o4/h$h;->c:Z

    .line 36
    .line 37
    if-nez v1, :cond_2b

    .line 38
    .line 39
    iget-boolean v0, v0, Lax/o4/h$h;->b:Z

    .line 40
    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_77

    .line 44
    :cond_2b
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 45
    .line 46
    if-eqz v0, :cond_34

    .line 47
    .line 48
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    :cond_34
    new-instance v0, Lax/o4/h$d;

    .line 54
    .line 55
    iget-object v1, p1, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lax/o4/h$d;-><init>(Lax/o4/h;Lax/o4/g$w;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lax/o4/h$d;->f()Landroid/graphics/Path;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 65
    .line 66
    if-nez v1, :cond_49

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lax/o4/h;->m(Landroid/graphics/Path;)Lax/o4/g$b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, p1, Lax/o4/g$K;->h:Lax/o4/g$b;

    .line 73
    .line 74
    :cond_49
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 88
    .line 89
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 90
    .line 91
    if-eqz v2, :cond_66

    .line 92
    .line 93
    invoke-direct {p0}, Lax/o4/h;->U()Landroid/graphics/Path$FillType;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 101
    .line 102
    .line 103
    :cond_66
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 104
    .line 105
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 106
    .line 107
    if-eqz v2, :cond_6f

    .line 108
    .line 109
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 110
    .line 111
    .line 112
    :cond_6f
    invoke-direct {p0, p1}, Lax/o4/h;->I0(Lax/o4/g$l;)V

    .line 113
    .line 114
    .line 115
    if-eqz v1, :cond_77

    .line 116
    .line 117
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    :goto_77
    return-void
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

.method private u(Lax/o4/g$N;)V
    .registers 3

    .line 1
    instance-of v0, p1, Lax/o4/g$L;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_13

    .line 6
    :cond_5
    check-cast p1, Lax/o4/g$L;

    .line 7
    .line 8
    iget-object p1, p1, Lax/o4/g$L;->d:Ljava/lang/Boolean;

    .line 9
    .line 10
    if-eqz p1, :cond_13

    .line 11
    .line 12
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput-boolean p1, v0, Lax/o4/h$h;->h:Z

    .line 19
    .line 20
    :cond_13
    :goto_13
    return-void
    .line 21
    .line 22
.end method

.method private u0(Lax/o4/g$z;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "PolyLine render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    goto :goto_68

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    goto :goto_68

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 29
    .line 30
    iget-boolean v1, v0, Lax/o4/h$h;->c:Z

    .line 31
    .line 32
    if-nez v1, :cond_26

    .line 33
    .line 34
    iget-boolean v0, v0, Lax/o4/h$h;->b:Z

    .line 35
    .line 36
    if-nez v0, :cond_26

    .line 37
    .line 38
    goto :goto_68

    .line 39
    :cond_26
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 40
    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    iget-object v0, p1, Lax/o4/g$z;->o:[F

    .line 49
    .line 50
    array-length v0, v0

    .line 51
    const/4 v1, 0x2

    .line 52
    if-ge v0, v1, :cond_36

    .line 53
    .line 54
    goto :goto_68

    .line 55
    :cond_36
    invoke-direct {p0, p1}, Lax/o4/h;->b0(Lax/o4/g$z;)Landroid/graphics/Path;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lax/o4/h;->U()Landroid/graphics/Path$FillType;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 80
    .line 81
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 82
    .line 83
    if-eqz v2, :cond_57

    .line 84
    .line 85
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 86
    .line 87
    .line 88
    :cond_57
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 89
    .line 90
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 91
    .line 92
    if-eqz v2, :cond_60

    .line 93
    .line 94
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 95
    .line 96
    .line 97
    :cond_60
    invoke-direct {p0, p1}, Lax/o4/h;->I0(Lax/o4/g$l;)V

    .line 98
    .line 99
    .line 100
    if-eqz v1, :cond_68

    .line 101
    .line 102
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 103
    .line 104
    .line 105
    :cond_68
    :goto_68
    return-void
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

.method private static v(D)D
    .registers 5

    .line 1
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    if-gez v2, :cond_c

    .line 6
    .line 7
    const-wide p0, 0x400921fb54442d18L    # Math.PI

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide p0

    .line 13
    :cond_c
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    cmpl-double v2, p0, v0

    .line 16
    .line 17
    if-lez v2, :cond_15

    .line 18
    .line 19
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_15
    invoke-static {p0, p1}, Ljava/lang/Math;->acos(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
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

.method private v0(Lax/o4/g$A;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Polygon render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_14

    .line 19
    .line 20
    goto :goto_61

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    goto :goto_61

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 29
    .line 30
    iget-boolean v1, v0, Lax/o4/h$h;->c:Z

    .line 31
    .line 32
    if-nez v1, :cond_26

    .line 33
    .line 34
    iget-boolean v0, v0, Lax/o4/h$h;->b:Z

    .line 35
    .line 36
    if-nez v0, :cond_26

    .line 37
    .line 38
    goto :goto_61

    .line 39
    :cond_26
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 40
    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    iget-object v0, p1, Lax/o4/g$z;->o:[F

    .line 49
    .line 50
    array-length v0, v0

    .line 51
    const/4 v1, 0x2

    .line 52
    if-ge v0, v1, :cond_36

    .line 53
    .line 54
    goto :goto_61

    .line 55
    :cond_36
    invoke-direct {p0, p1}, Lax/o4/h;->b0(Lax/o4/g$z;)Landroid/graphics/Path;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 73
    .line 74
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 75
    .line 76
    if-eqz v2, :cond_50

    .line 77
    .line 78
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 79
    .line 80
    .line 81
    :cond_50
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 82
    .line 83
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 84
    .line 85
    if-eqz v2, :cond_59

    .line 86
    .line 87
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 88
    .line 89
    .line 90
    :cond_59
    invoke-direct {p0, p1}, Lax/o4/h;->I0(Lax/o4/g$l;)V

    .line 91
    .line 92
    .line 93
    if-eqz v1, :cond_61

    .line 94
    .line 95
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 96
    .line 97
    .line 98
    :cond_61
    :goto_61
    return-void
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

.method private static w(F)I
    .registers 2

    .line 1
    const/high16 v0, 0x43800000    # 256.0f

    .line 2
    .line 3
    mul-float p0, p0, v0

    .line 4
    .line 5
    float-to-int p0, p0

    .line 6
    if-gez p0, :cond_9

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_9
    const/16 v0, 0xff

    .line 11
    .line 12
    if-le p0, v0, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private w0(Lax/o4/g$B;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Rect render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lax/o4/g$B;->q:Lax/o4/g$p;

    .line 10
    .line 11
    if-eqz v0, :cond_63

    .line 12
    .line 13
    iget-object v1, p1, Lax/o4/g$B;->r:Lax/o4/g$p;

    .line 14
    .line 15
    if-eqz v1, :cond_63

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_63

    .line 22
    .line 23
    iget-object v0, p1, Lax/o4/g$B;->r:Lax/o4/g$p;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/o4/g$p;->k()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_63

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_63

    .line 44
    :cond_2b
    invoke-direct {p0}, Lax/o4/h;->Y0()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_32

    .line 49
    .line 50
    goto :goto_63

    .line 51
    :cond_32
    iget-object v0, p1, Lax/o4/g$l;->n:Landroid/graphics/Matrix;

    .line 52
    .line 53
    if-eqz v0, :cond_3b

    .line 54
    .line 55
    iget-object v1, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    invoke-direct {p0, p1}, Lax/o4/h;->c0(Lax/o4/g$B;)Landroid/graphics/Path;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Lax/o4/h;->r(Lax/o4/g$K;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, p1}, Lax/o4/h;->p(Lax/o4/g$K;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 78
    .line 79
    iget-boolean v2, v2, Lax/o4/h$h;->b:Z

    .line 80
    .line 81
    if-eqz v2, :cond_55

    .line 82
    .line 83
    invoke-direct {p0, p1, v0}, Lax/o4/h;->B(Lax/o4/g$K;Landroid/graphics/Path;)V

    .line 84
    .line 85
    .line 86
    :cond_55
    iget-object v2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 87
    .line 88
    iget-boolean v2, v2, Lax/o4/h$h;->c:Z

    .line 89
    .line 90
    if-eqz v2, :cond_5e

    .line 91
    .line 92
    invoke-direct {p0, v0}, Lax/o4/h;->C(Landroid/graphics/Path;)V

    .line 93
    .line 94
    .line 95
    :cond_5e
    if-eqz v1, :cond_63

    .line 96
    .line 97
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 98
    .line 99
    .line 100
    :cond_63
    :goto_63
    return-void
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

.method private static x(IF)I
    .registers 4

    .line 1
    shr-int/lit8 v0, p0, 0x18

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    int-to-float v0, v0

    .line 7
    mul-float v0, v0, p1

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-gez p1, :cond_10

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_14

    .line 17
    :cond_10
    if-le p1, v1, :cond_13

    .line 18
    .line 19
    goto :goto_14

    .line 20
    :cond_13
    move v1, p1

    .line 21
    :goto_14
    shl-int/lit8 p1, v1, 0x18

    .line 22
    .line 23
    const v0, 0xffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr p0, v0

    .line 27
    or-int/2addr p0, p1

    .line 28
    return p0
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

.method private x0(Lax/o4/g$F;)V
    .registers 6

    .line 1
    iget-object v0, p1, Lax/o4/g$F;->q:Lax/o4/g$p;

    .line 2
    .line 3
    iget-object v1, p1, Lax/o4/g$F;->r:Lax/o4/g$p;

    .line 4
    .line 5
    iget-object v2, p1, Lax/o4/g$F;->s:Lax/o4/g$p;

    .line 6
    .line 7
    iget-object v3, p1, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1, v2, v3}, Lax/o4/h;->f0(Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;)Lax/o4/g$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 14
    .line 15
    iget-object v2, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 16
    .line 17
    invoke-direct {p0, p1, v0, v1, v2}, Lax/o4/h;->z0(Lax/o4/g$F;Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method private static varargs y(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    return-void
    .line 2
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

.method private y0(Lax/o4/g$F;Lax/o4/g$b;)V
    .registers 5

    .line 1
    iget-object v0, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 2
    .line 3
    iget-object v1, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, Lax/o4/h;->z0(Lax/o4/g$F;Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)V

    .line 6
    .line 7
    .line 8
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

.method private z(ZLax/o4/g$b;Lax/o4/g$u;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 3
    .line 4
    iget-object v2, p3, Lax/o4/g$u;->q:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Lax/o4/g;->r(Ljava/lang/String;)Lax/o4/g$N;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_37

    .line 11
    .line 12
    if-eqz p1, :cond_10

    .line 13
    .line 14
    const-string p2, "Fill"

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const-string p2, "Stroke"

    .line 18
    .line 19
    :goto_12
    iget-object v1, p3, Lax/o4/g$u;->q:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    new-array v2, v2, [Ljava/lang/Object;

    .line 23
    .line 24
    aput-object p2, v2, v0

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    aput-object v1, v2, p2

    .line 28
    .line 29
    const-string p2, "%s reference \'%s\' not found"

    .line 30
    .line 31
    invoke-static {p2, v2}, Lax/o4/h;->F(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p3, Lax/o4/g$u;->c0:Lax/o4/g$O;

    .line 35
    .line 36
    if-eqz p2, :cond_2b

    .line 37
    .line 38
    iget-object p3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 39
    .line 40
    invoke-direct {p0, p3, p1, p2}, Lax/o4/h;->P0(Lax/o4/h$h;ZLax/o4/g$O;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    if-eqz p1, :cond_32

    .line 45
    .line 46
    iget-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 47
    .line 48
    iput-boolean v0, p1, Lax/o4/h$h;->b:Z

    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    iget-object p1, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 52
    .line 53
    iput-boolean v0, p1, Lax/o4/h$h;->c:Z

    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    instance-of p3, v1, Lax/o4/g$M;

    .line 57
    .line 58
    if-eqz p3, :cond_41

    .line 59
    .line 60
    check-cast v1, Lax/o4/g$M;

    .line 61
    .line 62
    invoke-direct {p0, p1, p2, v1}, Lax/o4/h;->X(ZLax/o4/g$b;Lax/o4/g$M;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    instance-of p3, v1, Lax/o4/g$Q;

    .line 67
    .line 68
    if-eqz p3, :cond_4b

    .line 69
    .line 70
    check-cast v1, Lax/o4/g$Q;

    .line 71
    .line 72
    invoke-direct {p0, p1, p2, v1}, Lax/o4/h;->e0(ZLax/o4/g$b;Lax/o4/g$Q;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4b
    instance-of p2, v1, Lax/o4/g$C;

    .line 77
    .line 78
    if-eqz p2, :cond_54

    .line 79
    .line 80
    check-cast v1, Lax/o4/g$C;

    .line 81
    .line 82
    invoke-direct {p0, p1, v1}, Lax/o4/h;->Q0(ZLax/o4/g$C;)V

    .line 83
    .line 84
    .line 85
    :cond_54
    return-void
    .line 86
    .line 87
    .line 88
.end method

.method private z0(Lax/o4/g$F;Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "Svg render"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lax/o4/h;->y(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget v0, p2, Lax/o4/g$b;->c:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-eqz v0, :cond_85

    .line 15
    .line 16
    iget v0, p2, Lax/o4/g$b;->d:F

    .line 17
    .line 18
    cmpl-float v0, v0, v1

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_85

    .line 23
    :cond_16
    if-nez p4, :cond_1f

    .line 24
    .line 25
    iget-object p4, p1, Lax/o4/g$P;->o:Lax/o4/e;

    .line 26
    .line 27
    if-eqz p4, :cond_1d

    .line 28
    .line 29
    goto :goto_1f

    .line 30
    :cond_1d
    sget-object p4, Lax/o4/e;->e:Lax/o4/e;

    .line 31
    .line 32
    :cond_1f
    :goto_1f
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Lax/o4/h;->W0(Lax/o4/h$h;Lax/o4/g$L;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lax/o4/h;->A()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_85

    .line 44
    :cond_2b
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 45
    .line 46
    iput-object p2, v0, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 47
    .line 48
    iget-object p2, v0, Lax/o4/h$h;->a:Lax/o4/g$E;

    .line 49
    .line 50
    iget-object p2, p2, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_48

    .line 57
    .line 58
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 59
    .line 60
    iget-object p2, p2, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 61
    .line 62
    iget v0, p2, Lax/o4/g$b;->a:F

    .line 63
    .line 64
    iget v1, p2, Lax/o4/g$b;->b:F

    .line 65
    .line 66
    iget v2, p2, Lax/o4/g$b;->c:F

    .line 67
    .line 68
    iget p2, p2, Lax/o4/g$b;->d:F

    .line 69
    .line 70
    invoke-direct {p0, v0, v1, v2, p2}, Lax/o4/h;->O0(FFFF)V

    .line 71
    .line 72
    .line 73
    :cond_48
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 74
    .line 75
    iget-object p2, p2, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 76
    .line 77
    invoke-direct {p0, p1, p2}, Lax/o4/h;->q(Lax/o4/g$K;Lax/o4/g$b;)V

    .line 78
    .line 79
    .line 80
    if-eqz p3, :cond_65

    .line 81
    .line 82
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 83
    .line 84
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 85
    .line 86
    iget-object v0, v0, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 87
    .line 88
    invoke-direct {p0, v0, p3, p4}, Lax/o4/h;->o(Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 96
    .line 97
    iget-object p3, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 98
    .line 99
    iput-object p3, p2, Lax/o4/h$h;->g:Lax/o4/g$b;

    .line 100
    .line 101
    goto :goto_72

    .line 102
    :cond_65
    iget-object p2, p0, Lax/o4/h;->a:Landroid/graphics/Canvas;

    .line 103
    .line 104
    iget-object p3, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 105
    .line 106
    iget-object p3, p3, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 107
    .line 108
    iget p4, p3, Lax/o4/g$b;->a:F

    .line 109
    .line 110
    iget p3, p3, Lax/o4/g$b;->b:F

    .line 111
    .line 112
    invoke-virtual {p2, p4, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 113
    .line 114
    .line 115
    :goto_72
    invoke-direct {p0}, Lax/o4/h;->m0()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-direct {p0}, Lax/o4/h;->X0()V

    .line 120
    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    invoke-direct {p0, p1, p3}, Lax/o4/h;->F0(Lax/o4/g$J;Z)V

    .line 124
    .line 125
    .line 126
    if-eqz p2, :cond_82

    .line 127
    .line 128
    invoke-direct {p0, p1}, Lax/o4/h;->j0(Lax/o4/g$K;)V

    .line 129
    .line 130
    .line 131
    :cond_82
    invoke-direct {p0, p1}, Lax/o4/h;->U0(Lax/o4/g$K;)V

    .line 132
    .line 133
    .line 134
    :cond_85
    :goto_85
    return-void
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


# virtual methods
.method G0(Lax/o4/g;Lax/o4/f;)V
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_c4

    .line 4
    .line 5
    iput-object p1, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/o4/g;->m()Lax/o4/g$F;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_14

    .line 12
    .line 13
    new-array p1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string p2, "Nothing to render. Document is empty."

    .line 16
    .line 17
    invoke-static {p2, p1}, Lax/o4/h;->Z0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    invoke-virtual {p2}, Lax/o4/f;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_54

    .line 26
    .line 27
    iget-object v3, p0, Lax/o4/h;->c:Lax/o4/g;

    .line 28
    .line 29
    iget-object v4, p2, Lax/o4/f;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Lax/o4/g;->j(Ljava/lang/String;)Lax/o4/g$L;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "SVGAndroidRenderer"

    .line 36
    .line 37
    if-eqz v3, :cond_44

    .line 38
    .line 39
    instance-of v5, v3, Lax/o4/g$f0;

    .line 40
    .line 41
    if-nez v5, :cond_2b

    .line 42
    .line 43
    goto :goto_44

    .line 44
    :cond_2b
    check-cast v3, Lax/o4/g$f0;

    .line 45
    .line 46
    iget-object v5, v3, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 47
    .line 48
    if-nez v5, :cond_41

    .line 49
    .line 50
    iget-object p1, p2, Lax/o4/f;->e:Ljava/lang/String;

    .line 51
    .line 52
    new-array p2, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    aput-object p1, p2, v1

    .line 55
    .line 56
    const-string p1, "View element with id \"%s\" is missing a viewBox attribute."

    .line 57
    .line 58
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    iget-object v0, v3, Lax/o4/g$P;->o:Lax/o4/e;

    .line 67
    .line 68
    goto :goto_6c

    .line 69
    :cond_44
    :goto_44
    iget-object p1, p2, Lax/o4/f;->e:Ljava/lang/String;

    .line 70
    .line 71
    new-array p2, v0, [Ljava/lang/Object;

    .line 72
    .line 73
    aput-object p1, p2, v1

    .line 74
    .line 75
    const-string p1, "View element with id \"%s\" not found."

    .line 76
    .line 77
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_54
    invoke-virtual {p2}, Lax/o4/f;->e()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5e

    .line 90
    .line 91
    iget-object v0, p2, Lax/o4/f;->d:Lax/o4/g$b;

    .line 92
    .line 93
    :goto_5c
    move-object v5, v0

    .line 94
    goto :goto_61

    .line 95
    :cond_5e
    iget-object v0, v2, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 96
    .line 97
    goto :goto_5c

    .line 98
    :goto_61
    invoke-virtual {p2}, Lax/o4/f;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6a

    .line 103
    .line 104
    iget-object v0, p2, Lax/o4/f;->b:Lax/o4/e;

    .line 105
    .line 106
    goto :goto_6c

    .line 107
    :cond_6a
    iget-object v0, v2, Lax/o4/g$P;->o:Lax/o4/e;

    .line 108
    .line 109
    :goto_6c
    invoke-virtual {p2}, Lax/o4/f;->a()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_77

    .line 114
    .line 115
    iget-object v1, p2, Lax/o4/f;->a:Lax/o4/b$r;

    .line 116
    .line 117
    invoke-virtual {p1, v1}, Lax/o4/g;->a(Lax/o4/b$r;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    invoke-virtual {p2}, Lax/o4/f;->c()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_8c

    .line 125
    .line 126
    new-instance v1, Lax/o4/b$q;

    .line 127
    .line 128
    invoke-direct {v1}, Lax/o4/b$q;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object v1, p0, Lax/o4/h;->h:Lax/o4/b$q;

    .line 132
    .line 133
    iget-object v3, p2, Lax/o4/f;->c:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p1, v3}, Lax/o4/g;->j(Ljava/lang/String;)Lax/o4/g$L;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iput-object v3, v1, Lax/o4/b$q;->a:Lax/o4/g$L;

    .line 140
    .line 141
    :cond_8c
    invoke-direct {p0}, Lax/o4/h;->N0()V

    .line 142
    .line 143
    .line 144
    invoke-direct {p0, v2}, Lax/o4/h;->u(Lax/o4/g$N;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0}, Lax/o4/h;->S0()V

    .line 148
    .line 149
    .line 150
    new-instance v1, Lax/o4/g$b;

    .line 151
    .line 152
    iget-object v3, p2, Lax/o4/f;->f:Lax/o4/g$b;

    .line 153
    .line 154
    invoke-direct {v1, v3}, Lax/o4/g$b;-><init>(Lax/o4/g$b;)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v2, Lax/o4/g$F;->s:Lax/o4/g$p;

    .line 158
    .line 159
    if-eqz v3, :cond_a8

    .line 160
    .line 161
    iget v4, v1, Lax/o4/g$b;->c:F

    .line 162
    .line 163
    invoke-virtual {v3, p0, v4}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    iput v3, v1, Lax/o4/g$b;->c:F

    .line 168
    .line 169
    :cond_a8
    iget-object v3, v2, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 170
    .line 171
    if-eqz v3, :cond_b4

    .line 172
    .line 173
    iget v4, v1, Lax/o4/g$b;->d:F

    .line 174
    .line 175
    invoke-virtual {v3, p0, v4}, Lax/o4/g$p;->f(Lax/o4/h;F)F

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    iput v3, v1, Lax/o4/g$b;->d:F

    .line 180
    .line 181
    :cond_b4
    invoke-direct {p0, v2, v1, v5, v0}, Lax/o4/h;->z0(Lax/o4/g$F;Lax/o4/g$b;Lax/o4/g$b;Lax/o4/e;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p0}, Lax/o4/h;->R0()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2}, Lax/o4/f;->a()Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_c3

    .line 192
    .line 193
    invoke-virtual {p1}, Lax/o4/g;->b()V

    .line 194
    .line 195
    .line 196
    :cond_c3
    return-void

    .line 197
    :cond_c4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 198
    .line 199
    const-string p2, "renderOptions shouldn\'t be null"

    .line 200
    .line 201
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p1
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

.method Q()F
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

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

.method R()F
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v0, v0, Lax/o4/h$h;->d:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/high16 v1, 0x40000000    # 2.0f

    .line 10
    .line 11
    div-float/2addr v0, v1

    .line 12
    return v0
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

.method S()Lax/o4/g$b;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o4/h;->d:Lax/o4/h$h;

    .line 2
    .line 3
    iget-object v1, v0, Lax/o4/h$h;->g:Lax/o4/g$b;

    .line 4
    .line 5
    if-eqz v1, :cond_7

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_7
    iget-object v0, v0, Lax/o4/h$h;->f:Lax/o4/g$b;

    .line 9
    .line 10
    return-object v0
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

.method T()F
    .registers 2

    .line 1
    iget v0, p0, Lax/o4/h;->b:F

    .line 2
    .line 3
    return v0
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
