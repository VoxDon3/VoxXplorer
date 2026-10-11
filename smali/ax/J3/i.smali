.class public Lax/J3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field protected static final o0:Lax/g4/f;


# instance fields
.field private final c0:Lax/J3/j;

.field private final d0:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field private final e0:Lax/g4/f;

.field private final f0:Lax/J3/c;

.field protected g0:Lax/g4/f;

.field private h0:Lax/J3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/J3/k<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field private i0:Ljava/lang/Object;

.field private j0:Lax/J3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field private k0:Ljava/lang/Float;

.field private l0:Z

.field private m0:Z

.field private n0:Z

.field private final q:Lax/J3/e;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/g4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/P3/h;->c:Lax/P3/h;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/g4/f;->i(Lax/P3/h;)Lax/g4/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lax/J3/g;->e0:Lax/J3/g;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/g4/f;->R(Lax/J3/g;)Lax/g4/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Lax/g4/f;->X(Z)Lax/g4/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lax/J3/i;->o0:Lax/g4/f;

    .line 24
    .line 25
    return-void
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

.method protected constructor <init>(Lax/J3/c;Lax/J3/j;Ljava/lang/Class;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/c;",
            "Lax/J3/j;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/J3/i;->l0:Z

    .line 6
    .line 7
    iput-object p1, p0, Lax/J3/i;->f0:Lax/J3/c;

    .line 8
    .line 9
    iput-object p2, p0, Lax/J3/i;->c0:Lax/J3/j;

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/J3/c;->i()Lax/J3/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lax/J3/i;->q:Lax/J3/e;

    .line 16
    .line 17
    iput-object p3, p0, Lax/J3/i;->d0:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {p2}, Lax/J3/j;->p()Lax/g4/f;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lax/J3/i;->e0:Lax/g4/f;

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Lax/J3/j;->q(Ljava/lang/Class;)Lax/J3/k;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lax/J3/i;->h0:Lax/J3/k;

    .line 30
    .line 31
    iput-object p1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 32
    .line 33
    return-void
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

.method private c(Lax/h4/e;)Lax/g4/b;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "TTranscodeType;>;)",
            "Lax/g4/b;"
        }
    .end annotation

    .line 1
    iget-object v3, p0, Lax/J3/i;->h0:Lax/J3/k;

    .line 2
    .line 3
    iget-object v0, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/g4/f;->y()Lax/J3/g;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v0, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/g4/f;->v()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v0, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/g4/f;->t()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v2, 0x0

    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    invoke-direct/range {v0 .. v6}, Lax/J3/i;->d(Lax/h4/e;Lax/g4/i;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method private d(Lax/h4/e;Lax/g4/i;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;
    .registers 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "TTranscodeType;>;",
            "Lax/g4/i;",
            "Lax/J3/k<",
            "*-TTranscodeType;>;",
            "Lax/J3/g;",
            "II)",
            "Lax/g4/b;"
        }
    .end annotation

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    iget-object v1, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 4
    .line 5
    if-eqz v1, :cond_85

    .line 6
    .line 7
    iget-boolean v2, p0, Lax/J3/i;->n0:Z

    .line 8
    .line 9
    if-nez v2, :cond_7d

    .line 10
    .line 11
    iget-object v2, v1, Lax/J3/i;->h0:Lax/J3/k;

    .line 12
    .line 13
    iget-boolean v4, v1, Lax/J3/i;->l0:Z

    .line 14
    .line 15
    if-eqz v4, :cond_12

    .line 16
    .line 17
    move-object v8, p3

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    move-object v8, v2

    .line 20
    :goto_13
    iget-object v1, v1, Lax/J3/i;->g0:Lax/g4/f;

    .line 21
    .line 22
    invoke-virtual {v1}, Lax/g4/f;->H()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_25

    .line 27
    .line 28
    iget-object v1, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 29
    .line 30
    iget-object v1, v1, Lax/J3/i;->g0:Lax/g4/f;

    .line 31
    .line 32
    invoke-virtual {v1}, Lax/g4/f;->y()Lax/J3/g;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_23
    move-object v9, v1

    .line 37
    goto :goto_2a

    .line 38
    :cond_25
    invoke-direct {p0, v5}, Lax/J3/i;->i(Lax/J3/g;)Lax/J3/g;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_23

    .line 43
    :goto_2a
    iget-object v1, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 44
    .line 45
    iget-object v1, v1, Lax/J3/i;->g0:Lax/g4/f;

    .line 46
    .line 47
    invoke-virtual {v1}, Lax/g4/f;->v()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v2, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 52
    .line 53
    iget-object v2, v2, Lax/J3/i;->g0:Lax/g4/f;

    .line 54
    .line 55
    invoke-virtual {v2}, Lax/g4/f;->t()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static/range {p5 .. p6}, Lax/k4/i;->r(II)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_56

    .line 64
    .line 65
    iget-object v4, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 66
    .line 67
    iget-object v4, v4, Lax/J3/i;->g0:Lax/g4/f;

    .line 68
    .line 69
    invoke-virtual {v4}, Lax/g4/f;->M()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_56

    .line 74
    .line 75
    iget-object v1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 76
    .line 77
    invoke-virtual {v1}, Lax/g4/f;->v()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget-object v2, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 82
    .line 83
    invoke-virtual {v2}, Lax/g4/f;->t()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :cond_56
    move v10, v1

    .line 88
    move v11, v2

    .line 89
    new-instance v7, Lax/g4/i;

    .line 90
    .line 91
    invoke-direct {v7, p2}, Lax/g4/i;-><init>(Lax/g4/c;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 95
    .line 96
    move-object v0, p0

    .line 97
    move-object v1, p1

    .line 98
    move-object v4, p3

    .line 99
    move/from16 v6, p5

    .line 100
    .line 101
    move-object v3, v7

    .line 102
    move/from16 v7, p6

    .line 103
    .line 104
    invoke-direct/range {v0 .. v7}, Lax/J3/i;->n(Lax/h4/e;Lax/g4/f;Lax/g4/c;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const/4 v1, 0x1

    .line 109
    iput-boolean v1, p0, Lax/J3/i;->n0:Z

    .line 110
    .line 111
    iget-object v5, p0, Lax/J3/i;->j0:Lax/J3/i;

    .line 112
    .line 113
    move-object v6, p1

    .line 114
    move-object v7, v3

    .line 115
    invoke-direct/range {v5 .. v11}, Lax/J3/i;->d(Lax/h4/e;Lax/g4/i;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const/4 v4, 0x0

    .line 120
    iput-boolean v4, p0, Lax/J3/i;->n0:Z

    .line 121
    .line 122
    invoke-virtual {v3, v2, v1}, Lax/g4/i;->m(Lax/g4/b;Lax/g4/b;)V

    .line 123
    .line 124
    .line 125
    return-object v3

    .line 126
    :cond_7d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string v2, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_85
    iget-object v1, p0, Lax/J3/i;->k0:Ljava/lang/Float;

    .line 135
    .line 136
    if-eqz v1, :cond_bb

    .line 137
    .line 138
    new-instance v1, Lax/g4/i;

    .line 139
    .line 140
    invoke-direct {v1, p2}, Lax/g4/i;-><init>(Lax/g4/c;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 144
    .line 145
    move-object v0, p0

    .line 146
    move-object v4, p3

    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    move/from16 v6, p5

    .line 150
    .line 151
    move/from16 v7, p6

    .line 152
    .line 153
    move-object v3, v1

    .line 154
    move-object v1, p1

    .line 155
    invoke-direct/range {v0 .. v7}, Lax/J3/i;->n(Lax/h4/e;Lax/g4/f;Lax/g4/c;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    iget-object v1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 160
    .line 161
    invoke-virtual {v1}, Lax/g4/f;->d()Lax/g4/f;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iget-object v2, p0, Lax/J3/i;->k0:Ljava/lang/Float;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {v1, v2}, Lax/g4/f;->V(F)Lax/g4/f;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-direct {p0, v5}, Lax/J3/i;->i(Lax/J3/g;)Lax/J3/g;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    move-object v1, p1

    .line 180
    invoke-direct/range {v0 .. v7}, Lax/J3/i;->n(Lax/h4/e;Lax/g4/f;Lax/g4/c;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v3, v8, v1}, Lax/g4/i;->m(Lax/g4/b;Lax/g4/b;)V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :cond_bb
    move-object/from16 v5, p4

    .line 189
    .line 190
    iget-object v2, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 191
    .line 192
    move-object v0, p0

    .line 193
    move-object v1, p1

    .line 194
    move-object v3, p2

    .line 195
    move-object v4, p3

    .line 196
    move/from16 v6, p5

    .line 197
    .line 198
    move/from16 v7, p6

    .line 199
    .line 200
    invoke-direct/range {v0 .. v7}, Lax/J3/i;->n(Lax/h4/e;Lax/g4/f;Lax/g4/c;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    return-object v1
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

.method private i(Lax/J3/g;)Lax/J3/g;
    .registers 4

    .line 1
    sget-object v0, Lax/J3/i$b;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_38

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_35

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_32

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-ne p1, v0, :cond_15

    .line 20
    .line 21
    goto :goto_32

    .line 22
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "unknown priority: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 35
    .line 36
    invoke-virtual {v1}, Lax/g4/f;->y()Lax/J3/g;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_32
    :goto_32
    sget-object p1, Lax/J3/g;->q:Lax/J3/g;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_35
    sget-object p1, Lax/J3/g;->c0:Lax/J3/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_38
    sget-object p1, Lax/J3/g;->d0:Lax/J3/g;

    .line 58
    .line 59
    return-object p1
    .line 60
    .line 61
.end method

.method private m(Ljava/lang/Object;)Lax/J3/i;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/J3/i;->i0:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lax/J3/i;->m0:Z

    .line 5
    .line 6
    return-object p0
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

.method private n(Lax/h4/e;Lax/g4/f;Lax/g4/c;Lax/J3/k;Lax/J3/g;II)Lax/g4/b;
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "TTranscodeType;>;",
            "Lax/g4/f;",
            "Lax/g4/c;",
            "Lax/J3/k<",
            "*-TTranscodeType;>;",
            "Lax/J3/g;",
            "II)",
            "Lax/g4/b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lax/g4/f;->N()Lax/g4/f;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/i;->q:Lax/J3/e;

    .line 5
    .line 6
    iget-object v1, p0, Lax/J3/i;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v2, p0, Lax/J3/i;->d0:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/J3/e;->c()Lax/P3/i;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    invoke-virtual/range {p4 .. p4}, Lax/J3/k;->c()Lax/i4/c;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    const/4 v8, 0x0

    .line 19
    move-object v7, p1

    .line 20
    move-object v3, p2

    .line 21
    move-object v9, p3

    .line 22
    move-object/from16 v6, p5

    .line 23
    .line 24
    move/from16 v4, p6

    .line 25
    .line 26
    move/from16 v5, p7

    .line 27
    .line 28
    invoke-static/range {v0 .. v11}, Lax/g4/h;->x(Lax/J3/e;Ljava/lang/Object;Ljava/lang/Class;Lax/g4/f;IILax/J3/g;Lax/h4/e;Lax/g4/e;Lax/g4/c;Lax/P3/i;Lax/i4/c;)Lax/g4/h;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method


# virtual methods
.method public b(Lax/g4/f;)Lax/J3/i;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/g4/f;",
            ")",
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/J3/i;->h()Lax/g4/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lax/g4/f;->b(Lax/g4/f;)Lax/g4/f;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/J3/i;->f()Lax/J3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

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

.method public f()Lax/J3/i;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/J3/i;

    .line 6
    .line 7
    iget-object v1, v0, Lax/J3/i;->g0:Lax/g4/f;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/g4/f;->d()Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lax/J3/i;->g0:Lax/g4/f;

    .line 14
    .line 15
    iget-object v1, v0, Lax/J3/i;->h0:Lax/J3/k;

    .line 16
    .line 17
    invoke-virtual {v1}, Lax/J3/k;->b()Lax/J3/k;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lax/J3/i;->h0:Lax/J3/k;
    :try_end_16
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_16} :catch_17

    .line 22
    .line 23
    return-object v0

    .line 24
    :catch_17
    move-exception v0

    .line 25
    new-instance v1, Ljava/lang/RuntimeException;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v1
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

.method protected h()Lax/g4/f;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/J3/i;->e0:Lax/g4/f;

    .line 2
    .line 3
    iget-object v1, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 4
    .line 5
    if-ne v0, v1, :cond_b

    .line 6
    .line 7
    invoke-virtual {v1}, Lax/g4/f;->d()Lax/g4/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_b
    return-object v1
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

.method public j(Lax/h4/e;)Lax/h4/e;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lax/h4/e<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lax/J3/i;->m0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_56

    .line 10
    .line 11
    iget-object v0, p0, Lax/J3/i;->g0:Lax/g4/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/g4/f;->N()Lax/g4/f;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lax/J3/i;->c(Lax/h4/e;)Lax/g4/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1}, Lax/h4/e;->k()Lax/g4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Lax/g4/b;->d(Lax/g4/b;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_48

    .line 29
    .line 30
    invoke-static {v1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lax/g4/b;

    .line 35
    .line 36
    invoke-interface {v2}, Lax/g4/b;->i()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_35

    .line 41
    .line 42
    invoke-static {v1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lax/g4/b;

    .line 47
    .line 48
    invoke-interface {v2}, Lax/g4/b;->isRunning()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_48

    .line 53
    .line 54
    :cond_35
    invoke-interface {v0}, Lax/g4/b;->recycle()V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lax/g4/b;

    .line 62
    .line 63
    invoke-interface {v0}, Lax/g4/b;->isRunning()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_47

    .line 68
    .line 69
    invoke-interface {v1}, Lax/g4/b;->h()V

    .line 70
    .line 71
    .line 72
    :cond_47
    return-object p1

    .line 73
    :cond_48
    iget-object v1, p0, Lax/J3/i;->c0:Lax/J3/j;

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Lax/J3/j;->o(Lax/h4/e;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0}, Lax/h4/e;->e(Lax/g4/b;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lax/J3/i;->c0:Lax/J3/j;

    .line 82
    .line 83
    invoke-virtual {v1, p1, v0}, Lax/J3/j;->u(Lax/h4/e;Lax/g4/b;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_56
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    const-string v0, "You must call #load() before calling #into()"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
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

.method public k(Ljava/io/File;)Lax/J3/i;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/J3/i;->m(Ljava/lang/Object;)Lax/J3/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public l(Ljava/lang/Object;)Lax/J3/i;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lax/J3/i<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/J3/i;->m(Ljava/lang/Object;)Lax/J3/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public o()Lax/g4/a;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/g4/a<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0}, Lax/J3/i;->r(II)Lax/g4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public r(II)Lax/g4/a;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lax/g4/a<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/g4/d;

    .line 2
    .line 3
    iget-object v1, p0, Lax/J3/i;->q:Lax/J3/e;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/J3/e;->e()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1, p1, p2}, Lax/g4/d;-><init>(Landroid/os/Handler;II)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lax/k4/i;->o()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_20

    .line 17
    .line 18
    iget-object p1, p0, Lax/J3/i;->q:Lax/J3/e;

    .line 19
    .line 20
    invoke-virtual {p1}, Lax/J3/e;->e()Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Lax/J3/i$a;

    .line 25
    .line 26
    invoke-direct {p2, p0, v0}, Lax/J3/i$a;-><init>(Lax/J3/i;Lax/g4/d;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_20
    invoke-virtual {p0, v0}, Lax/J3/i;->j(Lax/h4/e;)Lax/h4/e;

    .line 34
    .line 35
    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
