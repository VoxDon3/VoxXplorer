.class public Lax/l1/n;
.super Lax/l1/G;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/N0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/l1/n$e;,
        Lax/l1/n$h;,
        Lax/l1/n$f;,
        Lax/l1/n$j;,
        Lax/l1/n$d;,
        Lax/l1/n$g;,
        Lax/l1/n$c;,
        Lax/l1/n$i;,
        Lax/l1/n$b;,
        Lax/l1/n$k;
    }
.end annotation


# static fields
.field private static final l:Lax/r7/T;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/T<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Ljava/lang/Object;

.field public final e:Landroid/content/Context;

.field private final f:Lax/l1/D$b;

.field private g:Lax/l1/n$e;

.field private h:Ljava/lang/Thread;

.field private i:Lax/l1/n$h;

.field private j:Lax/P0/c;

.field private k:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/l1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/l1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lax/r7/T;->b(Ljava/util/Comparator;)Lax/r7/T;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/l1/n;->l:Lax/r7/T;

    .line 11
    .line 12
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

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 1
    new-instance v0, Lax/l1/a$b;

    invoke-direct {v0}, Lax/l1/a$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lax/l1/n;-><init>(Landroid/content/Context;Lax/l1/D$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lax/P0/T;Lax/l1/D$b;)V
    .registers 4

    .line 4
    invoke-direct {p0, p2, p3, p1}, Lax/l1/n;-><init>(Lax/P0/T;Lax/l1/D$b;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lax/l1/D$b;)V
    .registers 4

    .line 2
    sget-object v0, Lax/l1/n$e;->G0:Lax/l1/n$e;

    invoke-direct {p0, p1, v0, p2}, Lax/l1/n;-><init>(Landroid/content/Context;Lax/P0/T;Lax/l1/D$b;)V

    return-void
.end method

.method public constructor <init>(Lax/P0/T;Lax/l1/D$b;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lax/l1/n;-><init>(Lax/P0/T;Lax/l1/D$b;Landroid/content/Context;)V

    return-void
.end method

.method private constructor <init>(Lax/P0/T;Lax/l1/D$b;Landroid/content/Context;)V
    .registers 5

    .line 5
    invoke-direct {p0}, Lax/l1/G;-><init>()V

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    if-eqz p3, :cond_11

    .line 7
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    iput-object v0, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 8
    iput-object p2, p0, Lax/l1/n;->f:Lax/l1/D$b;

    .line 9
    instance-of p2, p1, Lax/l1/n$e;

    if-eqz p2, :cond_1f

    .line 10
    check-cast p1, Lax/l1/n$e;

    iput-object p1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    goto :goto_2f

    .line 11
    :cond_1f
    sget-object p2, Lax/l1/n$e;->G0:Lax/l1/n$e;

    invoke-virtual {p2}, Lax/l1/n$e;->P()Lax/l1/n$e$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lax/l1/n$e$a;->r0(Lax/P0/T;)Lax/l1/n$e$a;

    move-result-object p1

    invoke-virtual {p1}, Lax/l1/n$e$a;->m0()Lax/l1/n$e;

    move-result-object p1

    iput-object p1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 12
    :goto_2f
    sget-object p1, Lax/P0/c;->h:Lax/P0/c;

    iput-object p1, p0, Lax/l1/n;->j:Lax/P0/c;

    .line 13
    iget-object p1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    iget-boolean p1, p1, Lax/l1/n$e;->z0:Z

    if-eqz p1, :cond_42

    if-nez p3, :cond_42

    .line 14
    const-string p1, "DefaultTrackSelector"

    const-string p2, "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."

    invoke-static {p1, p2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_42
    return-void
.end method

.method static synthetic A(Ljava/lang/String;)I
    .registers 1

    .line 1
    invoke-static {p0}, Lax/l1/n;->N(Ljava/lang/String;)I

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

.method static synthetic B()Lax/r7/T;
    .registers 1

    .line 1
    sget-object v0, Lax/l1/n;->l:Lax/r7/T;

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

.method static synthetic C(Lax/P0/v;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lax/l1/n;->Q(Lax/P0/v;)Z

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

.method static synthetic D(Lax/l1/n$e;ILax/P0/v;)Z
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/l1/n;->W(Lax/l1/n$e;ILax/P0/v;)Z

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

.method static synthetic E(Lax/l1/n;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/l1/n;->T()V

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

.method private static F(Lax/l1/G$a;Lax/l1/n$e;[Lax/l1/D$a;)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Lax/l1/G$a;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_5
    if-ge v1, v0, :cond_33

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1, v1, v2}, Lax/l1/n$e;->V(ILax/i1/q0;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_12

    .line 17
    .line 18
    goto :goto_30

    .line 19
    :cond_12
    invoke-virtual {p1, v1, v2}, Lax/l1/n$e;->U(ILax/i1/q0;)Lax/l1/n$g;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_2d

    .line 24
    .line 25
    iget-object v4, v3, Lax/l1/n$g;->b:[I

    .line 26
    .line 27
    array-length v4, v4

    .line 28
    if-eqz v4, :cond_2d

    .line 29
    .line 30
    new-instance v4, Lax/l1/D$a;

    .line 31
    .line 32
    iget v5, v3, Lax/l1/n$g;->a:I

    .line 33
    .line 34
    invoke-virtual {v2, v5}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v5, v3, Lax/l1/n$g;->b:[I

    .line 39
    .line 40
    iget v3, v3, Lax/l1/n$g;->d:I

    .line 41
    .line 42
    invoke-direct {v4, v2, v5, v3}, Lax/l1/D$a;-><init>(Lax/P0/P;[II)V

    .line 43
    .line 44
    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    const/4 v4, 0x0

    .line 47
    :goto_2e
    aput-object v4, p2, v1

    .line 48
    .line 49
    :goto_30
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_33
    return-void
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

.method private static G(Lax/l1/G$a;Lax/P0/T;[Lax/l1/D$a;)V
    .registers 8

    .line 1
    invoke-virtual {p0}, Lax/l1/G$a;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_b
    if-ge v3, v0, :cond_17

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4, p1, v1}, Lax/l1/n;->H(Lax/i1/q0;Lax/P0/T;Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_b

    .line 24
    :cond_17
    invoke-virtual {p0}, Lax/l1/G$a;->j()Lax/i1/q0;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3, p1, v1}, Lax/l1/n;->H(Lax/i1/q0;Lax/P0/T;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    :goto_1e
    if-ge v2, v0, :cond_5a

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lax/l1/G$a;->f(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lax/P0/Q;

    .line 46
    .line 47
    if-nez p1, :cond_31

    .line 48
    .line 49
    goto :goto_57

    .line 50
    :cond_31
    iget-object v3, p1, Lax/P0/Q;->b:Lax/r7/z;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_54

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v4, p1, Lax/P0/Q;->a:Lax/P0/P;

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Lax/i1/q0;->e(Lax/P0/P;)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/4 v4, -0x1

    .line 69
    if-eq v3, v4, :cond_54

    .line 70
    .line 71
    new-instance v3, Lax/l1/D$a;

    .line 72
    .line 73
    iget-object v4, p1, Lax/P0/Q;->a:Lax/P0/P;

    .line 74
    .line 75
    iget-object p1, p1, Lax/P0/Q;->b:Lax/r7/z;

    .line 76
    .line 77
    invoke-static {p1}, Lax/u7/f;->o(Ljava/util/Collection;)[I

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v3, v4, p1}, Lax/l1/D$a;-><init>(Lax/P0/P;[I)V

    .line 82
    .line 83
    .line 84
    goto :goto_55

    .line 85
    :cond_54
    const/4 v3, 0x0

    .line 86
    :goto_55
    aput-object v3, p2, v2

    .line 87
    .line 88
    :goto_57
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_1e

    .line 91
    :cond_5a
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

.method private static H(Lax/i1/q0;Lax/P0/T;Ljava/util/Map;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i1/q0;",
            "Lax/P0/T;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lax/P0/Q;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget v1, p0, Lax/i1/q0;->a:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_42

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p1, Lax/P0/T;->D:Lax/r7/A;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lax/r7/A;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lax/P0/Q;

    .line 17
    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_3f

    .line 21
    :cond_14
    invoke-virtual {v1}, Lax/P0/Q;->b()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lax/P0/Q;

    .line 34
    .line 35
    if-eqz v2, :cond_34

    .line 36
    .line 37
    iget-object v2, v2, Lax/P0/Q;->b:Lax/r7/z;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3f

    .line 44
    .line 45
    iget-object v2, v1, Lax/P0/Q;->b:Lax/r7/z;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_3f

    .line 52
    .line 53
    :cond_34
    invoke-virtual {v1}, Lax/P0/Q;->b()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3f
    :goto_3f
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_42
    return-void
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

.method protected static I(Lax/P0/v;Ljava/lang/String;Z)I
    .registers 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    iget-object v0, p0, Lax/P0/v;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
    const/4 p0, 0x4

    .line 16
    return p0

    .line 17
    :cond_10
    invoke-static {p1}, Lax/l1/n;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, Lax/P0/v;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0}, Lax/l1/n;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p0, :cond_46

    .line 29
    .line 30
    if-nez p1, :cond_20

    .line 31
    .line 32
    goto :goto_46

    .line 33
    :cond_20
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_44

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2d

    .line 44
    .line 45
    goto :goto_44

    .line 46
    :cond_2d
    const-string p2, "-"

    .line 47
    .line 48
    invoke-static {p0, p2}, Lax/S0/d0;->y1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    aget-object p0, p0, v0

    .line 53
    .line 54
    invoke-static {p1, p2}, Lax/S0/d0;->y1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    aget-object p1, p1, v0

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_43

    .line 65
    .line 66
    const/4 p0, 0x2

    .line 67
    return p0

    .line 68
    :cond_43
    return v0

    .line 69
    :cond_44
    :goto_44
    const/4 p0, 0x3

    .line 70
    return p0

    .line 71
    :cond_46
    :goto_46
    if-eqz p2, :cond_4c

    .line 72
    .line 73
    if-nez p0, :cond_4c

    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_4c
    return v0
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

.method private static J(Lax/P0/P;IIZ)I
    .registers 12

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_3c

    .line 5
    .line 6
    if-ne p2, v0, :cond_8

    .line 7
    .line 8
    goto :goto_3c

    .line 9
    :cond_8
    const/4 v1, 0x0

    .line 10
    :goto_9
    iget v2, p0, Lax/P0/P;->a:I

    .line 11
    .line 12
    if-ge v1, v2, :cond_3c

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget v3, v2, Lax/P0/v;->v:I

    .line 19
    .line 20
    if-lez v3, :cond_39

    .line 21
    .line 22
    iget v4, v2, Lax/P0/v;->w:I

    .line 23
    .line 24
    if-lez v4, :cond_39

    .line 25
    .line 26
    invoke-static {p3, p1, p2, v3, v4}, Lax/l1/I;->d(ZIIII)Landroid/graphics/Point;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget v4, v2, Lax/P0/v;->v:I

    .line 31
    .line 32
    iget v2, v2, Lax/P0/v;->w:I

    .line 33
    .line 34
    mul-int v5, v4, v2

    .line 35
    .line 36
    iget v6, v3, Landroid/graphics/Point;->x:I

    .line 37
    .line 38
    int-to-float v6, v6

    .line 39
    const v7, 0x3f7ae148    # 0.98f

    .line 40
    .line 41
    .line 42
    mul-float v6, v6, v7

    .line 43
    .line 44
    float-to-int v6, v6

    .line 45
    if-lt v4, v6, :cond_39

    .line 46
    .line 47
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 48
    .line 49
    int-to-float v3, v3

    .line 50
    mul-float v3, v3, v7

    .line 51
    .line 52
    float-to-int v3, v3

    .line 53
    if-lt v2, v3, :cond_39

    .line 54
    .line 55
    if-ge v5, v0, :cond_39

    .line 56
    .line 57
    move v0, v5

    .line 58
    :cond_39
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_9

    .line 61
    :cond_3c
    :goto_3c
    return v0
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

.method private static L(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, "captioning"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/accessibility/CaptioningManager;

    .line 12
    .line 13
    if-eqz p0, :cond_21

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_15

    .line 20
    .line 21
    goto :goto_21

    .line 22
    :cond_15
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_1c

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1c
    invoke-static {p0}, Lax/S0/d0;->f0(Ljava/util/Locale;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_21
    :goto_21
    return-object v0
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

.method private static M(II)I
    .registers 2

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    if-ne p0, p1, :cond_8

    .line 4
    .line 5
    const p0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_8
    and-int/2addr p0, p1

    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
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

.method private static N(Ljava/lang/String;)I
    .registers 8

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    if-nez p0, :cond_8

    .line 7
    .line 8
    return v4

    .line 9
    :cond_8
    const/4 v5, -0x1

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    sparse-switch v6, :sswitch_data_52

    .line 15
    .line 16
    .line 17
    goto :goto_47

    .line 18
    :sswitch_11
    const-string v6, "video/x-vnd.on2.vp9"

    .line 19
    .line 20
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1a

    .line 25
    .line 26
    goto :goto_47

    .line 27
    :cond_1a
    const/4 v5, 0x4

    .line 28
    goto :goto_47

    .line 29
    :sswitch_1c
    const-string v6, "video/avc"

    .line 30
    .line 31
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_25

    .line 36
    .line 37
    goto :goto_47

    .line 38
    :cond_25
    const/4 v5, 0x3

    .line 39
    goto :goto_47

    .line 40
    :sswitch_27
    const-string v6, "video/hevc"

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_30

    .line 47
    .line 48
    goto :goto_47

    .line 49
    :cond_30
    const/4 v5, 0x2

    .line 50
    goto :goto_47

    .line 51
    :sswitch_32
    const-string v6, "video/av01"

    .line 52
    .line 53
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_3b

    .line 58
    .line 59
    goto :goto_47

    .line 60
    :cond_3b
    const/4 v5, 0x1

    .line 61
    goto :goto_47

    .line 62
    :sswitch_3d
    const-string v6, "video/dolby-vision"

    .line 63
    .line 64
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_46

    .line 69
    .line 70
    goto :goto_47

    .line 71
    :cond_46
    const/4 v5, 0x0

    .line 72
    :goto_47
    packed-switch v5, :pswitch_data_68

    .line 73
    .line 74
    .line 75
    return v4

    .line 76
    :pswitch_4b
    return v2

    .line 77
    :pswitch_4c
    return v3

    .line 78
    :pswitch_4d
    return v1

    .line 79
    :pswitch_4e
    return v0

    .line 80
    :pswitch_4f
    const/4 p0, 0x5

    .line 81
    return p0

    .line 82
    nop

    .line 83
    :sswitch_data_52
    .sparse-switch
        -0x6e5534ef -> :sswitch_3d
        -0x631b55f6 -> :sswitch_32
        -0x63185e82 -> :sswitch_27
        0x4f62373a -> :sswitch_1c
        0x5f50bed9 -> :sswitch_11
    .end sparse-switch

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
    :pswitch_data_68
    .packed-switch 0x0
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch
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

.method private O(Lax/P0/v;Lax/l1/n$e;)Z
    .registers 4

    .line 1
    iget-boolean p2, p2, Lax/l1/n$e;->z0:Z

    .line 2
    .line 3
    if-eqz p2, :cond_57

    .line 4
    .line 5
    iget-object p2, p0, Lax/l1/n;->k:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz p2, :cond_e

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_57

    .line 14
    .line 15
    :cond_e
    iget p2, p1, Lax/P0/v;->G:I

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    if-eq p2, v0, :cond_57

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-le p2, v0, :cond_57

    .line 22
    .line 23
    invoke-static {p1}, Lax/l1/n;->P(Lax/P0/v;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    if-eqz p2, :cond_2c

    .line 30
    .line 31
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    if-lt p2, v0, :cond_57

    .line 34
    .line 35
    iget-object p2, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 36
    .line 37
    if-eqz p2, :cond_57

    .line 38
    .line 39
    invoke-virtual {p2}, Lax/l1/n$h;->d()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_57

    .line 44
    .line 45
    :cond_2c
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    if-lt p2, v0, :cond_55

    .line 48
    .line 49
    iget-object p2, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 50
    .line 51
    if-eqz p2, :cond_55

    .line 52
    .line 53
    invoke-virtual {p2}, Lax/l1/n$h;->d()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_55

    .line 58
    .line 59
    iget-object p2, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 60
    .line 61
    invoke-virtual {p2}, Lax/l1/n$h;->b()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_55

    .line 66
    .line 67
    iget-object p2, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 68
    .line 69
    invoke-virtual {p2}, Lax/l1/n$h;->c()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_55

    .line 74
    .line 75
    iget-object p2, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 76
    .line 77
    iget-object v0, p0, Lax/l1/n;->j:Lax/P0/c;

    .line 78
    .line 79
    invoke-virtual {p2, v0, p1}, Lax/l1/n$h;->a(Lax/P0/c;Lax/P0/v;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_55

    .line 84
    .line 85
    goto :goto_57

    .line 86
    :cond_55
    const/4 p1, 0x0

    .line 87
    return p1

    .line 88
    :cond_57
    :goto_57
    const/4 p1, 0x1

    .line 89
    return p1
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

.method private static P(Lax/P0/v;)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sparse-switch v3, :sswitch_data_44

    .line 17
    .line 18
    .line 19
    goto :goto_3e

    .line 20
    :sswitch_13
    const-string v3, "audio/eac3"

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1c

    .line 27
    .line 28
    goto :goto_3e

    .line 29
    :cond_1c
    const/4 v2, 0x3

    .line 30
    goto :goto_3e

    .line 31
    :sswitch_1e
    const-string v3, "audio/ac4"

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_27

    .line 38
    .line 39
    goto :goto_3e

    .line 40
    :cond_27
    const/4 v2, 0x2

    .line 41
    goto :goto_3e

    .line 42
    :sswitch_29
    const-string v3, "audio/ac3"

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_32

    .line 49
    .line 50
    goto :goto_3e

    .line 51
    :cond_32
    const/4 v2, 0x1

    .line 52
    goto :goto_3e

    .line 53
    :sswitch_34
    const-string v3, "audio/eac3-joc"

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_3d

    .line 60
    .line 61
    goto :goto_3e

    .line 62
    :cond_3d
    const/4 v2, 0x0

    .line 63
    :goto_3e
    packed-switch v2, :pswitch_data_56

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :pswitch_42
    return v0

    .line 68
    nop

    .line 69
    :sswitch_data_44
    .sparse-switch
        -0x7e929daa -> :sswitch_34
        0xb269698 -> :sswitch_29
        0xb269699 -> :sswitch_1e
        0x59ae0c65 -> :sswitch_13
    .end sparse-switch

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
    :pswitch_data_56
    .packed-switch 0x0
        :pswitch_42
        :pswitch_42
        :pswitch_42
        :pswitch_42
    .end packed-switch
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

.method private static Q(Lax/P0/v;)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sparse-switch v3, :sswitch_data_38

    .line 17
    .line 18
    .line 19
    goto :goto_33

    .line 20
    :sswitch_13
    const-string v3, "audio/iamf"

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1c

    .line 27
    .line 28
    goto :goto_33

    .line 29
    :cond_1c
    const/4 v2, 0x2

    .line 30
    goto :goto_33

    .line 31
    :sswitch_1e
    const-string v3, "audio/ac4"

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_27

    .line 38
    .line 39
    goto :goto_33

    .line 40
    :cond_27
    const/4 v2, 0x1

    .line 41
    goto :goto_33

    .line 42
    :sswitch_29
    const-string v3, "audio/eac3-joc"

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_32

    .line 49
    .line 50
    goto :goto_33

    .line 51
    :cond_32
    const/4 v2, 0x0

    .line 52
    :goto_33
    packed-switch v2, :pswitch_data_46

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :pswitch_37
    return v0

    .line 57
    :sswitch_data_38
    .sparse-switch
        -0x7e929daa -> :sswitch_29
        0xb269699 -> :sswitch_1e
        0x59afdf4a -> :sswitch_13
    .end sparse-switch

    .line 58
    .line 59
    .line 60
    .line 61
    :pswitch_data_46
    .packed-switch 0x0
        :pswitch_37
        :pswitch_37
        :pswitch_37
    .end packed-switch
.end method

.method private static R(Lax/l1/n$e;Lax/l1/G$a;[[[I[Lax/Y0/W;[Lax/l1/D;)V
    .registers 12

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    :goto_4
    invoke-virtual {p1}, Lax/l1/G$a;->d()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v2, v4, :cond_46

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Lax/l1/G$a;->f(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    aget-object v6, p4, v2

    .line 17
    .line 18
    if-eq v4, v5, :cond_16

    .line 19
    .line 20
    if-eqz v6, :cond_16

    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    if-ne v4, v5, :cond_43

    .line 24
    .line 25
    if-eqz v6, :cond_43

    .line 26
    .line 27
    invoke-interface {v6}, Lax/l1/H;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ne v4, v5, :cond_43

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v6}, Lax/l1/H;->b()Lax/P0/P;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v4, v5}, Lax/i1/q0;->e(Lax/P0/P;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aget-object v5, p2, v2

    .line 46
    .line 47
    aget-object v4, v5, v4

    .line 48
    .line 49
    invoke-interface {v6, v1}, Lax/l1/H;->j(I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    aget v4, v4, v5

    .line 54
    .line 55
    invoke-interface {v6}, Lax/l1/D;->m()Lax/P0/v;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {p0, v4, v5}, Lax/l1/n;->W(Lax/l1/n$e;ILax/P0/v;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_43

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    move v0, v2

    .line 68
    :cond_43
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_46
    if-ne v3, v5, :cond_61

    .line 72
    .line 73
    new-instance p1, Lax/Y0/W;

    .line 74
    .line 75
    iget-object p0, p0, Lax/P0/T;->u:Lax/P0/T$b;

    .line 76
    .line 77
    iget-boolean p0, p0, Lax/P0/T$b;->b:Z

    .line 78
    .line 79
    if-eqz p0, :cond_52

    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    goto :goto_53

    .line 83
    :cond_52
    const/4 p0, 0x2

    .line 84
    :goto_53
    aget-object p2, p3, v0

    .line 85
    .line 86
    if-eqz p2, :cond_5c

    .line 87
    .line 88
    iget-boolean p2, p2, Lax/Y0/W;->b:Z

    .line 89
    .line 90
    if-eqz p2, :cond_5c

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    :cond_5c
    invoke-direct {p1, p0, v1}, Lax/Y0/W;-><init>(IZ)V

    .line 94
    .line 95
    .line 96
    aput-object p1, p3, v0

    .line 97
    .line 98
    :cond_61
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

.method private static S(Lax/l1/G$a;[[[I[Lax/Y0/W;[Lax/l1/D;)V
    .registers 14

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, -0x1

    .line 5
    const/4 v4, -0x1

    .line 6
    :goto_5
    invoke-virtual {p0}, Lax/l1/G$a;->d()I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_34

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lax/l1/G$a;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    aget-object v7, p3, v2

    .line 18
    .line 19
    if-eq v5, v6, :cond_17

    .line 20
    .line 21
    const/4 v8, 0x2

    .line 22
    if-ne v5, v8, :cond_31

    .line 23
    .line 24
    :cond_17
    if-eqz v7, :cond_31

    .line 25
    .line 26
    aget-object v8, p1, v2

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    invoke-static {v8, v9, v7}, Lax/l1/n;->X([[ILax/i1/q0;Lax/l1/D;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_31

    .line 37
    .line 38
    if-ne v5, v6, :cond_2d

    .line 39
    .line 40
    if-eq v4, v0, :cond_2b

    .line 41
    .line 42
    :goto_29
    const/4 p0, 0x0

    .line 43
    goto :goto_35

    .line 44
    :cond_2b
    move v4, v2

    .line 45
    goto :goto_31

    .line 46
    :cond_2d
    if-eq v3, v0, :cond_30

    .line 47
    .line 48
    goto :goto_29

    .line 49
    :cond_30
    move v3, v2

    .line 50
    :cond_31
    :goto_31
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_5

    .line 53
    :cond_34
    const/4 p0, 0x1

    .line 54
    :goto_35
    if-eq v4, v0, :cond_3b

    .line 55
    .line 56
    if-eq v3, v0, :cond_3b

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    goto :goto_3c

    .line 60
    :cond_3b
    const/4 p1, 0x0

    .line 61
    :goto_3c
    and-int/2addr p0, p1

    .line 62
    if-eqz p0, :cond_48

    .line 63
    .line 64
    new-instance p0, Lax/Y0/W;

    .line 65
    .line 66
    invoke-direct {p0, v1, v6}, Lax/Y0/W;-><init>(IZ)V

    .line 67
    .line 68
    .line 69
    aput-object p0, p2, v4

    .line 70
    .line 71
    aput-object p0, p2, v3

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

.method private T()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 5
    .line 6
    iget-boolean v1, v1, Lax/l1/n$e;->z0:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1d

    .line 9
    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    if-lt v1, v2, :cond_1d

    .line 15
    .line 16
    iget-object v1, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 17
    .line 18
    if-eqz v1, :cond_1d

    .line 19
    .line 20
    invoke-virtual {v1}, Lax/l1/n$h;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1d

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_1e

    .line 28
    :catchall_1b
    move-exception v1

    .line 29
    goto :goto_25

    .line 30
    :cond_1d
    const/4 v1, 0x0

    .line 31
    :goto_1e
    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_1b

    .line 32
    if-eqz v1, :cond_24

    .line 33
    .line 34
    invoke-virtual {p0}, Lax/l1/J;->f()V

    .line 35
    .line 36
    .line 37
    :cond_24
    return-void

    .line 38
    :goto_25
    :try_start_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_25 .. :try_end_26} :catchall_1b

    .line 39
    throw v1
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

.method private U(Landroidx/media3/exoplayer/M0;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 5
    .line 6
    iget-boolean v1, v1, Lax/l1/n$e;->D0:Z

    .line 7
    .line 8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_3 .. :try_end_8} :catchall_e

    .line 9
    if-eqz v1, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lax/l1/J;->g(Landroidx/media3/exoplayer/M0;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void

    .line 15
    :catchall_e
    move-exception p1

    .line 16
    :try_start_f
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_e

    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected static V(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    const-string v0, "und"

    .line 8
    .line 9
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_10

    .line 16
    :cond_f
    return-object p0

    .line 17
    :cond_10
    :goto_10
    const/4 p0, 0x0

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static W(Lax/l1/n$e;ILax/P0/v;)Z
    .registers 5

    .line 1
    invoke-static {p1}, Lax/Y0/V;->g(I)I

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
    iget-object v0, p0, Lax/P0/T;->u:Lax/P0/T$b;

    .line 10
    .line 11
    iget-boolean v0, v0, Lax/P0/T$b;->c:Z

    .line 12
    .line 13
    if-eqz v0, :cond_17

    .line 14
    .line 15
    invoke-static {p1}, Lax/Y0/V;->g(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    and-int/lit16 v0, v0, 0x800

    .line 20
    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    return v1

    .line 24
    :cond_17
    iget-object p0, p0, Lax/P0/T;->u:Lax/P0/T$b;

    .line 25
    .line 26
    iget-boolean p0, p0, Lax/P0/T$b;->b:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-eqz p0, :cond_3b

    .line 30
    .line 31
    iget p0, p2, Lax/P0/v;->J:I

    .line 32
    .line 33
    if-nez p0, :cond_29

    .line 34
    .line 35
    iget p0, p2, Lax/P0/v;->K:I

    .line 36
    .line 37
    if-eqz p0, :cond_27

    .line 38
    .line 39
    goto :goto_29

    .line 40
    :cond_27
    const/4 p0, 0x0

    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    :goto_29
    const/4 p0, 0x1

    .line 43
    :goto_2a
    invoke-static {p1}, Lax/Y0/V;->g(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    and-int/lit16 p1, p1, 0x400

    .line 48
    .line 49
    if-eqz p1, :cond_34

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    const/4 p1, 0x0

    .line 54
    :goto_35
    if-eqz p0, :cond_3b

    .line 55
    .line 56
    if-eqz p1, :cond_3a

    .line 57
    .line 58
    goto :goto_3b

    .line 59
    :cond_3a
    return v1

    .line 60
    :cond_3b
    :goto_3b
    return v0
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

.method private static X([[ILax/i1/q0;Lax/l1/D;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-interface {p2}, Lax/l1/H;->b()Lax/P0/P;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1, v1}, Lax/i1/q0;->e(Lax/P0/P;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_d
    invoke-interface {p2}, Lax/l1/H;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ge v1, v2, :cond_27

    .line 19
    .line 20
    aget-object v2, p0, p1

    .line 21
    .line 22
    invoke-interface {p2, v1}, Lax/l1/H;->j(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    aget v2, v2, v3

    .line 27
    .line 28
    invoke-static {v2}, Lax/Y0/V;->k(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    if-eq v2, v3, :cond_24

    .line 35
    .line 36
    return v0

    .line 37
    :cond_24
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_d

    .line 40
    :cond_27
    const/4 p0, 0x1

    .line 41
    return p0
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

.method private d0(ILax/l1/G$a;[[[ILax/l1/n$j$a;Ljava/util/Comparator;)Landroid/util/Pair;
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lax/l1/n$j<",
            "TT;>;>(I",
            "Lax/l1/G$a;",
            "[[[I",
            "Lax/l1/n$j$a<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "Ljava/util/List<",
            "TT;>;>;)",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lax/l1/G$a;->d()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_c
    if-ge v4, v2, :cond_a5

    .line 14
    .line 15
    invoke-virtual {v0, v4}, Lax/l1/G$a;->f(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    move/from16 v6, p1

    .line 20
    .line 21
    if-ne v6, v5, :cond_99

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const/4 v7, 0x0

    .line 28
    :goto_1b
    iget v8, v5, Lax/i1/q0;->a:I

    .line 29
    .line 30
    if-ge v7, v8, :cond_99

    .line 31
    .line 32
    invoke-virtual {v5, v7}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    aget-object v9, p3, v4

    .line 37
    .line 38
    aget-object v9, v9, v7

    .line 39
    .line 40
    move-object/from16 v10, p4

    .line 41
    .line 42
    invoke-interface {v10, v4, v8, v9}, Lax/l1/n$j$a;->a(ILax/P0/P;[I)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    iget v11, v8, Lax/P0/P;->a:I

    .line 47
    .line 48
    new-array v11, v11, [Z

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    :goto_32
    iget v13, v8, Lax/P0/P;->a:I

    .line 52
    .line 53
    if-ge v12, v13, :cond_92

    .line 54
    .line 55
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    check-cast v13, Lax/l1/n$j;

    .line 60
    .line 61
    invoke-virtual {v13}, Lax/l1/n$j;->d()I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    aget-boolean v15, v11, v12

    .line 66
    .line 67
    if-nez v15, :cond_46

    .line 68
    .line 69
    if-nez v14, :cond_49

    .line 70
    .line 71
    :cond_46
    move/from16 v18, v2

    .line 72
    .line 73
    goto :goto_8b

    .line 74
    :cond_49
    const/4 v15, 0x1

    .line 75
    if-ne v14, v15, :cond_53

    .line 76
    .line 77
    invoke-static {v13}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    :goto_50
    move/from16 v18, v2

    .line 82
    .line 83
    goto :goto_88

    .line 84
    :cond_53
    new-instance v14, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    add-int/lit8 v16, v12, 0x1

    .line 93
    .line 94
    move/from16 v15, v16

    .line 95
    .line 96
    const/16 v17, 0x1

    .line 97
    .line 98
    :goto_61
    iget v3, v8, Lax/P0/P;->a:I

    .line 99
    .line 100
    if-ge v15, v3, :cond_86

    .line 101
    .line 102
    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lax/l1/n$j;

    .line 107
    .line 108
    invoke-virtual {v3}, Lax/l1/n$j;->d()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    move/from16 v18, v2

    .line 113
    .line 114
    const/4 v2, 0x2

    .line 115
    if-ne v0, v2, :cond_7f

    .line 116
    .line 117
    invoke-virtual {v13, v3}, Lax/l1/n$j;->h(Lax/l1/n$j;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7f

    .line 122
    .line 123
    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    aput-boolean v17, v11, v15

    .line 127
    .line 128
    :cond_7f
    add-int/lit8 v15, v15, 0x1

    .line 129
    .line 130
    move-object/from16 v0, p2

    .line 131
    .line 132
    move/from16 v2, v18

    .line 133
    .line 134
    goto :goto_61

    .line 135
    :cond_86
    move-object v13, v14

    .line 136
    goto :goto_50

    .line 137
    :goto_88
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :goto_8b
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    move-object/from16 v0, p2

    .line 143
    .line 144
    move/from16 v2, v18

    .line 145
    .line 146
    goto :goto_32

    .line 147
    :cond_92
    move/from16 v18, v2

    .line 148
    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 150
    .line 151
    move-object/from16 v0, p2

    .line 152
    .line 153
    goto :goto_1b

    .line 154
    :cond_99
    move-object/from16 v10, p4

    .line 155
    .line 156
    move/from16 v18, v2

    .line 157
    .line 158
    add-int/lit8 v4, v4, 0x1

    .line 159
    .line 160
    move-object/from16 v0, p2

    .line 161
    .line 162
    move/from16 v2, v18

    .line 163
    .line 164
    goto/16 :goto_c

    .line 165
    .line 166
    :cond_a5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_ad

    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    return-object v0

    .line 174
    :cond_ad
    move-object/from16 v0, p5

    .line 175
    .line 176
    invoke-static {v1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    new-array v1, v1, [I

    .line 187
    .line 188
    const/4 v2, 0x0

    .line 189
    :goto_bc
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-ge v2, v3, :cond_cf

    .line 194
    .line 195
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    check-cast v3, Lax/l1/n$j;

    .line 200
    .line 201
    iget v3, v3, Lax/l1/n$j;->d0:I

    .line 202
    .line 203
    aput v3, v1, v2

    .line 204
    .line 205
    add-int/lit8 v2, v2, 0x1

    .line 206
    .line 207
    goto :goto_bc

    .line 208
    :cond_cf
    const/4 v2, 0x0

    .line 209
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Lax/l1/n$j;

    .line 214
    .line 215
    new-instance v2, Lax/l1/D$a;

    .line 216
    .line 217
    iget-object v3, v0, Lax/l1/n$j;->c0:Lax/P0/P;

    .line 218
    .line 219
    invoke-direct {v2, v3, v1}, Lax/l1/D$a;-><init>(Lax/P0/P;[I)V

    .line 220
    .line 221
    .line 222
    iget v0, v0, Lax/l1/n$j;->q:I

    .line 223
    .line 224
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v2, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    return-object v0
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

.method private f0(Lax/l1/n$e;)V
    .registers 4

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_6
    iget-object v1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lax/l1/n$e;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput-object p1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_6 .. :try_end_f} :catchall_24

    .line 16
    if-nez v1, :cond_23

    .line 17
    .line 18
    iget-boolean p1, p1, Lax/l1/n$e;->z0:Z

    .line 19
    .line 20
    if-eqz p1, :cond_20

    .line 21
    .line 22
    iget-object p1, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 23
    .line 24
    if-nez p1, :cond_20

    .line 25
    .line 26
    const-string p1, "DefaultTrackSelector"

    .line 27
    .line 28
    const-string v0, "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."

    .line 29
    .line 30
    invoke-static {p1, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    invoke-virtual {p0}, Lax/l1/J;->f()V

    .line 34
    .line 35
    .line 36
    :cond_23
    return-void

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    :try_start_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_25 .. :try_end_26} :catchall_24

    .line 39
    throw p1
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

.method public static synthetic s(Lax/l1/n;Lax/l1/n$e;Z[IILax/P0/P;[I)Ljava/util/List;
    .registers 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move p0, p4

    .line 6
    move p4, p2

    .line 7
    move-object p2, p1

    .line 8
    move-object p1, p5

    .line 9
    new-instance p5, Lax/l1/m;

    .line 10
    .line 11
    invoke-direct {p5, v0, p2}, Lax/l1/m;-><init>(Lax/l1/n;Lax/l1/n$e;)V

    .line 12
    .line 13
    .line 14
    aget p3, p3, p0

    .line 15
    .line 16
    move-object v1, p6

    .line 17
    move p6, p3

    .line 18
    move-object p3, v1

    .line 19
    invoke-static/range {p0 .. p6}, Lax/l1/n$b;->n(ILax/P0/P;Lax/l1/n$e;[IZLax/q7/o;I)Lax/r7/z;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method public static synthetic t(Lax/l1/n$e;ILax/P0/P;[I)Ljava/util/List;
    .registers 4

    .line 1
    invoke-static {p1, p2, p0, p3}, Lax/l1/n$c;->n(ILax/P0/P;Lax/l1/n$e;[I)Lax/r7/z;

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

.method public static synthetic u(Lax/l1/n;Lax/l1/n$e;Lax/P0/v;)Z
    .registers 3

    .line 1
    invoke-direct {p0, p2, p1}, Lax/l1/n;->O(Lax/P0/v;Lax/l1/n$e;)Z

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

.method public static synthetic v(Lax/l1/n$e;Ljava/lang/String;[ILandroid/graphics/Point;ILax/P0/P;[I)Ljava/util/List;
    .registers 8

    .line 1
    aget p2, p2, p4

    .line 2
    .line 3
    move v0, p2

    .line 4
    move-object p2, p0

    .line 5
    move p0, p4

    .line 6
    move-object p4, p1

    .line 7
    move-object p1, p5

    .line 8
    move p5, v0

    .line 9
    move-object v0, p6

    .line 10
    move-object p6, p3

    .line 11
    move-object p3, v0

    .line 12
    invoke-static/range {p0 .. p6}, Lax/l1/n$k;->r(ILax/P0/P;Lax/l1/n$e;[ILjava/lang/String;ILandroid/graphics/Point;)Lax/r7/z;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static synthetic w(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .registers 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_10

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-ne p0, v1, :cond_f

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_f
    return v1

    .line 17
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v1, :cond_18

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    sub-int/2addr p0, p1

    .line 34
    return p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static synthetic x(Lax/l1/n$e;Ljava/lang/String;Ljava/lang/String;ILax/P0/P;[I)Ljava/util/List;
    .registers 7

    .line 1
    move-object v0, p2

    .line 2
    move-object p2, p0

    .line 3
    move p0, p3

    .line 4
    move-object p3, p5

    .line 5
    move-object p5, v0

    .line 6
    move-object v0, p4

    .line 7
    move-object p4, p1

    .line 8
    move-object p1, v0

    .line 9
    invoke-static/range {p0 .. p5}, Lax/l1/n$i;->n(ILax/P0/P;Lax/l1/n$e;[ILjava/lang/String;Ljava/lang/String;)Lax/r7/z;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
.end method

.method static synthetic y(Lax/P0/P;IIZ)I
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/l1/n;->J(Lax/P0/P;IIZ)I

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

.method static synthetic z(II)I
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/l1/n;->M(II)I

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


# virtual methods
.method public K()Lax/l1/n$e;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_7
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    .line 10
    throw v1
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

.method protected Y(Lax/l1/G$a;[[[I[ILax/l1/n$e;)[Lax/l1/D$a;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/l1/G$a;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [Lax/l1/D$a;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Lax/l1/n;->Z(Lax/l1/G$a;[[[I[ILax/l1/n$e;)Landroid/util/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_1a

    .line 12
    .line 13
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Lax/l1/D$a;

    .line 24
    .line 25
    aput-object v4, v1, v3

    .line 26
    .line 27
    :cond_1a
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    if-nez v2, :cond_25

    .line 30
    .line 31
    move-object v10, v4

    .line 32
    :goto_1f
    move-object v5, p0

    .line 33
    move-object v6, p1

    .line 34
    move-object v7, p2

    .line 35
    move-object v8, p3

    .line 36
    move-object v9, p4

    .line 37
    goto :goto_3a

    .line 38
    :cond_25
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v5, v2

    .line 41
    check-cast v5, Lax/l1/D$a;

    .line 42
    .line 43
    iget-object v5, v5, Lax/l1/D$a;->a:Lax/P0/P;

    .line 44
    .line 45
    check-cast v2, Lax/l1/D$a;

    .line 46
    .line 47
    iget-object v2, v2, Lax/l1/D$a;->b:[I

    .line 48
    .line 49
    aget v2, v2, v3

    .line 50
    .line 51
    invoke-virtual {v5, v2}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, Lax/P0/v;->d:Ljava/lang/String;

    .line 56
    .line 57
    move-object v10, v2

    .line 58
    goto :goto_1f

    .line 59
    :goto_3a
    invoke-virtual/range {v5 .. v10}, Lax/l1/n;->e0(Lax/l1/G$a;[[[I[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    move-object v2, v10

    .line 64
    iget-boolean p2, v9, Lax/P0/T;->A:Z

    .line 65
    .line 66
    if-nez p2, :cond_45

    .line 67
    .line 68
    if-nez p1, :cond_49

    .line 69
    .line 70
    :cond_45
    invoke-virtual {p0, v6, v7, v9}, Lax/l1/n;->a0(Lax/l1/G$a;[[[ILax/l1/n$e;)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    :cond_49
    if-eqz v4, :cond_5a

    .line 75
    .line 76
    iget-object p1, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget-object p2, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p2, Lax/l1/D$a;

    .line 87
    .line 88
    aput-object p2, v1, p1

    .line 89
    .line 90
    goto :goto_6a

    .line 91
    :cond_5a
    if-eqz p1, :cond_6a

    .line 92
    .line 93
    iget-object p2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Lax/l1/D$a;

    .line 104
    .line 105
    aput-object p1, v1, p2

    .line 106
    .line 107
    :cond_6a
    :goto_6a
    invoke-virtual {p0, v6, v7, v9, v2}, Lax/l1/n;->c0(Lax/l1/G$a;[[[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_7e

    .line 112
    .line 113
    iget-object p2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p2, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, Lax/l1/D$a;

    .line 124
    .line 125
    aput-object p1, v1, p2

    .line 126
    .line 127
    :cond_7e
    :goto_7e
    if-ge v3, v0, :cond_9f

    .line 128
    .line 129
    invoke-virtual {v6, v3}, Lax/l1/G$a;->f(I)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 p2, 0x2

    .line 134
    if-eq p1, p2, :cond_9c

    .line 135
    .line 136
    const/4 p2, 0x1

    .line 137
    if-eq p1, p2, :cond_9c

    .line 138
    .line 139
    const/4 p2, 0x3

    .line 140
    if-eq p1, p2, :cond_9c

    .line 141
    .line 142
    const/4 p2, 0x4

    .line 143
    if-eq p1, p2, :cond_9c

    .line 144
    .line 145
    invoke-virtual {v6, v3}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    aget-object p3, v7, v3

    .line 150
    .line 151
    invoke-virtual {p0, p1, p2, p3, v9}, Lax/l1/n;->b0(ILax/i1/q0;[[ILax/l1/n$e;)Lax/l1/D$a;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    aput-object p1, v1, v3

    .line 156
    .line 157
    :cond_9c
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    goto :goto_7e

    .line 160
    :cond_9f
    return-object v1
    .line 161
    .line 162
.end method

.method protected Z(Lax/l1/G$a;[[[I[ILax/l1/n$e;)Landroid/util/Pair;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I[I",
            "Lax/l1/n$e;",
            ")",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-virtual {p1}, Lax/l1/G$a;->d()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1c

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-virtual {p1, v1}, Lax/l1/G$a;->f(I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ne v2, v3, :cond_19

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Lax/l1/G$a;->g(I)Lax/i1/q0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget v2, v2, Lax/i1/q0;->a:I

    .line 21
    .line 22
    if-lez v2, :cond_19

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_1c

    .line 26
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1c
    :goto_1c
    new-instance v5, Lax/l1/i;

    .line 30
    .line 31
    invoke-direct {v5, p0, p4, v0, p3}, Lax/l1/i;-><init>(Lax/l1/n;Lax/l1/n$e;Z[I)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lax/l1/j;

    .line 35
    .line 36
    invoke-direct {v6}, Lax/l1/j;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    move-object v1, p0

    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-direct/range {v1 .. v6}, Lax/l1/n;->d0(ILax/l1/G$a;[[[ILax/l1/n$j$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
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

.method public a(Landroidx/media3/exoplayer/M0;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/l1/n;->U(Landroidx/media3/exoplayer/M0;)V

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

.method protected a0(Lax/l1/G$a;[[[ILax/l1/n$e;)Landroid/util/Pair;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I",
            "Lax/l1/n$e;",
            ")",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p3, Lax/P0/T;->u:Lax/P0/T$b;

    .line 2
    .line 3
    iget v0, v0, Lax/P0/T$b;->a:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_9

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_9
    new-instance v4, Lax/l1/e;

    .line 11
    .line 12
    invoke-direct {v4, p3}, Lax/l1/e;-><init>(Lax/l1/n$e;)V

    .line 13
    .line 14
    .line 15
    new-instance v5, Lax/l1/f;

    .line 16
    .line 17
    invoke-direct {v5}, Lax/l1/f;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    move-object v0, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    invoke-direct/range {v0 .. v5}, Lax/l1/n;->d0(ILax/l1/G$a;[[[ILax/l1/n$j$a;Ljava/util/Comparator;)Landroid/util/Pair;

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

.method protected b0(ILax/i1/q0;[[ILax/l1/n$e;)Lax/l1/D$a;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object p1, p4, Lax/P0/T;->u:Lax/P0/T$b;

    .line 2
    .line 3
    iget p1, p1, Lax/P0/T$b;->a:I

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p1, v0, :cond_9

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    move-object v2, v1

    .line 12
    move-object v4, v2

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_e
    iget v5, p2, Lax/i1/q0;->a:I

    .line 16
    .line 17
    if-ge v0, v5, :cond_43

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lax/i1/q0;->c(I)Lax/P0/P;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    aget-object v6, p3, v0

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    :goto_19
    iget v8, v5, Lax/P0/P;->a:I

    .line 27
    .line 28
    if-ge v7, v8, :cond_40

    .line 29
    .line 30
    aget v8, v6, v7

    .line 31
    .line 32
    iget-boolean v9, p4, Lax/l1/n$e;->A0:Z

    .line 33
    .line 34
    invoke-static {v8, v9}, Lax/Y0/V;->l(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_3d

    .line 39
    .line 40
    invoke-virtual {v5, v7}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    new-instance v9, Lax/l1/n$d;

    .line 45
    .line 46
    aget v10, v6, v7

    .line 47
    .line 48
    invoke-direct {v9, v8, v10}, Lax/l1/n$d;-><init>(Lax/P0/v;I)V

    .line 49
    .line 50
    .line 51
    if-eqz v4, :cond_3a

    .line 52
    .line 53
    invoke-virtual {v9, v4}, Lax/l1/n$d;->d(Lax/l1/n$d;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-lez v8, :cond_3d

    .line 58
    .line 59
    :cond_3a
    move-object v2, v5

    .line 60
    move v3, v7

    .line 61
    move-object v4, v9

    .line 62
    :cond_3d
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_19

    .line 65
    :cond_40
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_e

    .line 68
    :cond_43
    if-nez v2, :cond_46

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_46
    new-instance p1, Lax/l1/D$a;

    .line 72
    .line 73
    filled-new-array {v3}, [I

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-direct {p1, v2, p2}, Lax/l1/D$a;-><init>(Lax/P0/P;[I)V

    .line 78
    .line 79
    .line 80
    return-object p1
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

.method public bridge synthetic c()Lax/P0/T;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/l1/n;->K()Lax/l1/n$e;

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

.method protected c0(Lax/l1/G$a;[[[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I",
            "Lax/l1/n$e;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p3, Lax/P0/T;->u:Lax/P0/T$b;

    .line 2
    .line 3
    iget v0, v0, Lax/P0/T$b;->a:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_9
    iget-boolean v0, p3, Lax/P0/T;->x:Z

    .line 11
    .line 12
    if-eqz v0, :cond_13

    .line 13
    .line 14
    iget-object v0, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v0}, Lax/l1/n;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_13
    new-instance v7, Lax/l1/k;

    .line 21
    .line 22
    invoke-direct {v7, p3, p4, v2}, Lax/l1/k;-><init>(Lax/l1/n$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v8, Lax/l1/l;

    .line 26
    .line 27
    invoke-direct {v8}, Lax/l1/l;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    move-object v3, p0

    .line 32
    move-object v5, p1

    .line 33
    move-object v6, p2

    .line 34
    invoke-direct/range {v3 .. v8}, Lax/l1/n;->d0(ILax/l1/G$a;[[[ILax/l1/n$j$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method public d()Landroidx/media3/exoplayer/N0$a;
    .registers 1

    .line 1
    return-object p0
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

.method protected e0(Lax/l1/G$a;[[[I[ILax/l1/n$e;Ljava/lang/String;)Landroid/util/Pair;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I[I",
            "Lax/l1/n$e;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lax/l1/D$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p4, Lax/P0/T;->u:Lax/P0/T$b;

    .line 2
    .line 3
    iget v0, v0, Lax/P0/T$b;->a:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_9
    iget-boolean v0, p4, Lax/P0/T;->k:Z

    .line 11
    .line 12
    if-eqz v0, :cond_15

    .line 13
    .line 14
    iget-object v0, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-static {v0}, Lax/S0/d0;->V(Landroid/content/Context;)Landroid/graphics/Point;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_15
    new-instance v7, Lax/l1/g;

    .line 23
    .line 24
    invoke-direct {v7, p4, p5, p3, v2}, Lax/l1/g;-><init>(Lax/l1/n$e;Ljava/lang/String;[ILandroid/graphics/Point;)V

    .line 25
    .line 26
    .line 27
    new-instance v8, Lax/l1/h;

    .line 28
    .line 29
    invoke-direct {v8}, Lax/l1/h;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    move-object v3, p0

    .line 34
    move-object v5, p1

    .line 35
    move-object v6, p2

    .line 36
    invoke-direct/range {v3 .. v8}, Lax/l1/n;->d0(ILax/l1/G$a;[[[ILax/l1/n$j$a;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method public h()Z
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

.method public j()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/l1/n;->h:Ljava/lang/Thread;

    .line 5
    .line 6
    if-eqz v1, :cond_18

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-ne v1, v2, :cond_f

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v1, 0x0

    .line 17
    :goto_10
    const-string v2, "DefaultTrackSelector is accessed on the wrong thread."

    .line 18
    .line 19
    invoke-static {v1, v2}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception v1

    .line 24
    goto :goto_2d

    .line 25
    :cond_18
    :goto_18
    monitor-exit v0
    :try_end_19
    .catchall {:try_start_3 .. :try_end_19} :catchall_16

    .line 26
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    if-lt v0, v1, :cond_29

    .line 31
    .line 32
    iget-object v0, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 33
    .line 34
    if-eqz v0, :cond_29

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/l1/n$h;->e()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 41
    .line 42
    :cond_29
    invoke-super {p0}, Lax/l1/J;->j()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_2d
    :try_start_2d
    monitor-exit v0
    :try_end_2e
    .catchall {:try_start_2d .. :try_end_2e} :catchall_16

    .line 47
    throw v1
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

.method public l(Lax/P0/c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/l1/n;->j:Lax/P0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/c;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iput-object p1, p0, Lax/l1/n;->j:Lax/P0/c;

    .line 11
    .line 12
    invoke-direct {p0}, Lax/l1/n;->T()V

    .line 13
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
.end method

.method public m(Lax/P0/T;)V
    .registers 5

    .line 1
    instance-of v0, p1, Lax/l1/n$e;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lax/l1/n$e;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/l1/n;->f0(Lax/l1/n$e;)V

    .line 9
    .line 10
    .line 11
    :cond_a
    new-instance v0, Lax/l1/n$e$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/l1/n;->K()Lax/l1/n$e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v1, v2}, Lax/l1/n$e$a;-><init>(Lax/l1/n$e;Lax/l1/n$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lax/l1/n$e$a;->r0(Lax/P0/T;)Lax/l1/n$e$a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lax/l1/n$e$a;->m0()Lax/l1/n$e;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lax/l1/n;->f0(Lax/l1/n$e;)V

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

.method protected final r(Lax/l1/G$a;[[[I[ILax/i1/F$b;Lax/P0/N;)Landroid/util/Pair;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/l1/G$a;",
            "[[[I[I",
            "Lax/i1/F$b;",
            "Lax/P0/N;",
            ")",
            "Landroid/util/Pair<",
            "[",
            "Lax/Y0/W;",
            "[",
            "Lax/l1/D;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/l1/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, p0, Lax/l1/n;->h:Ljava/lang/Thread;

    .line 9
    .line 10
    iget-object v1, p0, Lax/l1/n;->g:Lax/l1/n$e;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_b3

    .line 13
    iget-object v0, p0, Lax/l1/n;->k:Ljava/lang/Boolean;

    .line 14
    .line 15
    if-nez v0, :cond_1e

    .line 16
    .line 17
    iget-object v0, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 18
    .line 19
    if-eqz v0, :cond_1e

    .line 20
    .line 21
    invoke-static {v0}, Lax/S0/d0;->S0(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lax/l1/n;->k:Ljava/lang/Boolean;

    .line 30
    .line 31
    :cond_1e
    iget-boolean v0, v1, Lax/l1/n$e;->z0:Z

    .line 32
    .line 33
    if-eqz v0, :cond_37

    .line 34
    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 v2, 0x20

    .line 38
    .line 39
    if-lt v0, v2, :cond_37

    .line 40
    .line 41
    iget-object v0, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 42
    .line 43
    if-nez v0, :cond_37

    .line 44
    .line 45
    new-instance v0, Lax/l1/n$h;

    .line 46
    .line 47
    iget-object v2, p0, Lax/l1/n;->e:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v3, p0, Lax/l1/n;->k:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-direct {v0, v2, p0, v3}, Lax/l1/n$h;-><init>(Landroid/content/Context;Lax/l1/n;Ljava/lang/Boolean;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lax/l1/n;->i:Lax/l1/n$h;

    .line 55
    .line 56
    :cond_37
    invoke-virtual {p1}, Lax/l1/G$a;->d()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {p0, p1, p2, p3, v1}, Lax/l1/n;->Y(Lax/l1/G$a;[[[I[ILax/l1/n$e;)[Lax/l1/D$a;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-static {p1, v1, p3}, Lax/l1/n;->G(Lax/l1/G$a;Lax/P0/T;[Lax/l1/D$a;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v1, p3}, Lax/l1/n;->F(Lax/l1/G$a;Lax/l1/n$e;[Lax/l1/D$a;)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    :goto_47
    const/4 v4, 0x0

    .line 73
    if-ge v3, v0, :cond_65

    .line 74
    .line 75
    invoke-virtual {p1, v3}, Lax/l1/G$a;->f(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v1, v3}, Lax/l1/n$e;->T(I)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_60

    .line 84
    .line 85
    iget-object v6, v1, Lax/P0/T;->E:Lax/r7/C;

    .line 86
    .line 87
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v6, v5}, Lax/r7/x;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_62

    .line 96
    .line 97
    :cond_60
    aput-object v4, p3, v3

    .line 98
    .line 99
    :cond_62
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_47

    .line 102
    :cond_65
    iget-object v3, p0, Lax/l1/n;->f:Lax/l1/D$b;

    .line 103
    .line 104
    invoke-virtual {p0}, Lax/l1/J;->b()Lax/m1/e;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-interface {v3, p3, v5, p4, p5}, Lax/l1/D$b;->a([Lax/l1/D$a;Lax/m1/e;Lax/i1/F$b;Lax/P0/N;)[Lax/l1/D;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    new-array p4, v0, [Lax/Y0/W;

    .line 113
    .line 114
    :goto_71
    if-ge v2, v0, :cond_9e

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Lax/l1/G$a;->f(I)I

    .line 117
    .line 118
    .line 119
    move-result p5

    .line 120
    invoke-virtual {v1, v2}, Lax/l1/n$e;->T(I)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_98

    .line 125
    .line 126
    iget-object v3, v1, Lax/P0/T;->E:Lax/r7/C;

    .line 127
    .line 128
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p5

    .line 132
    invoke-virtual {v3, p5}, Lax/r7/x;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p5

    .line 136
    if-eqz p5, :cond_8a

    .line 137
    .line 138
    goto :goto_98

    .line 139
    :cond_8a
    invoke-virtual {p1, v2}, Lax/l1/G$a;->f(I)I

    .line 140
    .line 141
    .line 142
    move-result p5

    .line 143
    const/4 v3, -0x2

    .line 144
    if-eq p5, v3, :cond_95

    .line 145
    .line 146
    aget-object p5, p3, v2

    .line 147
    .line 148
    if-eqz p5, :cond_98

    .line 149
    .line 150
    :cond_95
    sget-object p5, Lax/Y0/W;->c:Lax/Y0/W;

    .line 151
    .line 152
    goto :goto_99

    .line 153
    :cond_98
    :goto_98
    move-object p5, v4

    .line 154
    :goto_99
    aput-object p5, p4, v2

    .line 155
    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    goto :goto_71

    .line 159
    :cond_9e
    iget-boolean p5, v1, Lax/l1/n$e;->B0:Z

    .line 160
    .line 161
    if-eqz p5, :cond_a5

    .line 162
    .line 163
    invoke-static {p1, p2, p4, p3}, Lax/l1/n;->S(Lax/l1/G$a;[[[I[Lax/Y0/W;[Lax/l1/D;)V

    .line 164
    .line 165
    .line 166
    :cond_a5
    iget-object p5, v1, Lax/P0/T;->u:Lax/P0/T$b;

    .line 167
    .line 168
    iget p5, p5, Lax/P0/T$b;->a:I

    .line 169
    .line 170
    if-eqz p5, :cond_ae

    .line 171
    .line 172
    invoke-static {v1, p1, p2, p4, p3}, Lax/l1/n;->R(Lax/l1/n$e;Lax/l1/G$a;[[[I[Lax/Y0/W;[Lax/l1/D;)V

    .line 173
    .line 174
    .line 175
    :cond_ae
    invoke-static {p4, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :catchall_b3
    move-exception p1

    .line 181
    :try_start_b4
    monitor-exit v0
    :try_end_b5
    .catchall {:try_start_b4 .. :try_end_b5} :catchall_b3

    .line 182
    throw p1
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
