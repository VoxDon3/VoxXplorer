.class public final Lax/q1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/q1/n$a;
    }
.end annotation


# static fields
.field private static final s:[I

.field private static final t:Lax/q1/n$a;

.field private static final u:Lax/q1/n$a;


# instance fields
.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation
.end field

.field private n:I

.field private o:Z

.field private p:Lax/N1/t$a;

.field private q:I

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_22

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/q1/n;->s:[I

    .line 9
    .line 10
    new-instance v0, Lax/q1/n$a;

    .line 11
    .line 12
    new-instance v1, Lax/q1/l;

    .line 13
    .line 14
    invoke-direct {v1}, Lax/q1/l;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lax/q1/n$a;-><init>(Lax/q1/n$a$a;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lax/q1/n;->t:Lax/q1/n$a;

    .line 21
    .line 22
    new-instance v0, Lax/q1/n$a;

    .line 23
    .line 24
    new-instance v1, Lax/q1/m;

    .line 25
    .line 26
    invoke-direct {v1}, Lax/q1/m;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lax/q1/n$a;-><init>(Lax/q1/n$a$a;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lax/q1/n;->u:Lax/q1/n$a;

    .line 33
    .line 34
    return-void

    .line 35
    :array_22
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
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

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lax/q1/n;->k:I

    .line 6
    .line 7
    const v1, 0x1b8a0

    .line 8
    .line 9
    .line 10
    iput v1, p0, Lax/q1/n;->n:I

    .line 11
    .line 12
    new-instance v1, Lax/N1/h;

    .line 13
    .line 14
    invoke-direct {v1}, Lax/N1/h;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 18
    .line 19
    iput-boolean v0, p0, Lax/q1/n;->o:Z

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic f()Ljava/lang/reflect/Constructor;
    .registers 1

    .line 1
    invoke-static {}, Lax/q1/n;->k()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ljava/lang/reflect/Constructor;
    .registers 1

    .line 1
    invoke-static {}, Lax/q1/n;->l()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method private h(ILjava/util/List;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lax/q1/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    packed-switch p1, :pswitch_data_174

    .line 5
    .line 6
    .line 7
    :pswitch_6
    goto :goto_59

    .line 8
    :pswitch_7
    new-instance p1, Lax/t1/a;

    .line 9
    .line 10
    invoke-direct {p1}, Lax/t1/a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_10
    iget p1, p0, Lax/q1/n;->h:I

    .line 18
    .line 19
    and-int/lit8 v0, p1, 0x2

    .line 20
    .line 21
    if-nez v0, :cond_59

    .line 22
    .line 23
    and-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    if-nez p1, :cond_59

    .line 26
    .line 27
    new-instance p1, Lax/x1/a;

    .line 28
    .line 29
    invoke-direct {p1}, Lax/x1/a;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_23
    new-instance p1, Lax/u1/a;

    .line 37
    .line 38
    invoke-direct {p1}, Lax/u1/a;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2c
    new-instance p1, Lax/Z1/a;

    .line 46
    .line 47
    invoke-direct {p1}, Lax/Z1/a;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_35
    new-instance p1, Lax/M1/a;

    .line 55
    .line 56
    invoke-direct {p1}, Lax/M1/a;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_3e
    new-instance p1, Lax/s1/b;

    .line 64
    .line 65
    iget-boolean v1, p0, Lax/q1/n;->o:Z

    .line 66
    .line 67
    xor-int/2addr v0, v1

    .line 68
    iget-object v1, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 69
    .line 70
    invoke-direct {p1, v0, v1}, Lax/s1/b;-><init>(ILax/N1/t$a;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4c
    sget-object p1, Lax/q1/n;->u:Lax/q1/n$a;

    .line 78
    .line 79
    new-array v0, v2, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lax/q1/n$a;->a([Ljava/lang/Object;)Lax/q1/r;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_59

    .line 86
    .line 87
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_59
    :goto_59
    return-void

    .line 91
    :pswitch_5a
    new-instance p1, Lax/y1/a;

    .line 92
    .line 93
    iget v0, p0, Lax/q1/n;->r:I

    .line 94
    .line 95
    invoke-direct {p1, v0}, Lax/y1/a;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_65
    new-instance p1, Lax/Y1/b;

    .line 103
    .line 104
    invoke-direct {p1}, Lax/Y1/b;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_6e
    iget-object p1, p0, Lax/q1/n;->m:Lax/r7/z;

    .line 112
    .line 113
    if-nez p1, :cond_78

    .line 114
    .line 115
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lax/q1/n;->m:Lax/r7/z;

    .line 120
    .line 121
    :cond_78
    new-instance v1, Lax/X1/K;

    .line 122
    .line 123
    iget v2, p0, Lax/q1/n;->k:I

    .line 124
    .line 125
    iget-boolean p1, p0, Lax/q1/n;->o:Z

    .line 126
    .line 127
    xor-int/lit8 v3, p1, 0x1

    .line 128
    .line 129
    iget-object v4, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 130
    .line 131
    new-instance v5, Lax/S0/M;

    .line 132
    .line 133
    const-wide/16 v6, 0x0

    .line 134
    .line 135
    invoke-direct {v5, v6, v7}, Lax/S0/M;-><init>(J)V

    .line 136
    .line 137
    .line 138
    new-instance v6, Lax/X1/j;

    .line 139
    .line 140
    iget p1, p0, Lax/q1/n;->l:I

    .line 141
    .line 142
    iget-object v0, p0, Lax/q1/n;->m:Lax/r7/z;

    .line 143
    .line 144
    invoke-direct {v6, p1, v0}, Lax/X1/j;-><init>(ILjava/util/List;)V

    .line 145
    .line 146
    .line 147
    iget v7, p0, Lax/q1/n;->n:I

    .line 148
    .line 149
    invoke-direct/range {v1 .. v7}, Lax/X1/K;-><init>(IILax/N1/t$a;Lax/S0/M;Lax/X1/L$c;I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_9b
    new-instance p1, Lax/X1/C;

    .line 157
    .line 158
    invoke-direct {p1}, Lax/X1/C;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_a4
    new-instance p1, Lax/L1/d;

    .line 166
    .line 167
    invoke-direct {p1}, Lax/L1/d;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_ad
    new-instance p1, Lax/K1/h;

    .line 175
    .line 176
    iget-object v0, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 177
    .line 178
    iget v1, p0, Lax/q1/n;->i:I

    .line 179
    .line 180
    iget v3, p0, Lax/q1/n;->q:I

    .line 181
    .line 182
    invoke-static {v3}, Lax/K1/h;->l(I)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    or-int/2addr v1, v3

    .line 187
    iget-boolean v3, p0, Lax/q1/n;->o:Z

    .line 188
    .line 189
    if-eqz v3, :cond_c0

    .line 190
    .line 191
    const/4 v3, 0x0

    .line 192
    goto :goto_c2

    .line 193
    :cond_c0
    const/16 v3, 0x20

    .line 194
    .line 195
    :goto_c2
    or-int/2addr v1, v3

    .line 196
    invoke-direct {p1, v0, v1}, Lax/K1/h;-><init>(Lax/N1/t$a;I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    new-instance p1, Lax/K1/n;

    .line 203
    .line 204
    iget-object v0, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 205
    .line 206
    iget v1, p0, Lax/q1/n;->h:I

    .line 207
    .line 208
    iget v3, p0, Lax/q1/n;->q:I

    .line 209
    .line 210
    invoke-static {v3}, Lax/K1/n;->t(I)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    or-int/2addr v1, v3

    .line 215
    iget-boolean v3, p0, Lax/q1/n;->o:Z

    .line 216
    .line 217
    if-eqz v3, :cond_db

    .line 218
    .line 219
    goto :goto_dd

    .line 220
    :cond_db
    const/16 v2, 0x10

    .line 221
    .line 222
    :goto_dd
    or-int/2addr v1, v2

    .line 223
    invoke-direct {p1, v0, v1}, Lax/K1/n;-><init>(Lax/N1/t$a;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_e5
    new-instance p1, Lax/J1/f;

    .line 231
    .line 232
    iget v0, p0, Lax/q1/n;->j:I

    .line 233
    .line 234
    iget-boolean v3, p0, Lax/q1/n;->b:Z

    .line 235
    .line 236
    or-int/2addr v0, v3

    .line 237
    iget-boolean v3, p0, Lax/q1/n;->c:Z

    .line 238
    .line 239
    if-eqz v3, :cond_f1

    .line 240
    .line 241
    goto :goto_f2

    .line 242
    :cond_f1
    const/4 v1, 0x0

    .line 243
    :goto_f2
    or-int/2addr v0, v1

    .line 244
    invoke-direct {p1, v0}, Lax/J1/f;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_fa
    new-instance p1, Lax/I1/e;

    .line 252
    .line 253
    iget-object v0, p0, Lax/q1/n;->p:Lax/N1/t$a;

    .line 254
    .line 255
    iget v3, p0, Lax/q1/n;->g:I

    .line 256
    .line 257
    iget-boolean v4, p0, Lax/q1/n;->o:Z

    .line 258
    .line 259
    if-eqz v4, :cond_105

    .line 260
    .line 261
    const/4 v1, 0x0

    .line 262
    :cond_105
    or-int/2addr v1, v3

    .line 263
    invoke-direct {p1, v0, v1}, Lax/I1/e;-><init>(Lax/N1/t$a;I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_10d
    new-instance p1, Lax/w1/c;

    .line 271
    .line 272
    invoke-direct {p1}, Lax/w1/c;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_116
    sget-object p1, Lax/q1/n;->t:Lax/q1/n$a;

    .line 280
    .line 281
    iget v1, p0, Lax/q1/n;->f:I

    .line 282
    .line 283
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    new-array v0, v0, [Ljava/lang/Object;

    .line 288
    .line 289
    aput-object v1, v0, v2

    .line 290
    .line 291
    invoke-virtual {p1, v0}, Lax/q1/n$a;->a([Ljava/lang/Object;)Lax/q1/r;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    if-eqz p1, :cond_12c

    .line 296
    .line 297
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_12c
    new-instance p1, Lax/v1/d;

    .line 302
    .line 303
    iget v0, p0, Lax/q1/n;->f:I

    .line 304
    .line 305
    invoke-direct {p1, v0}, Lax/v1/d;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_137
    new-instance p1, Lax/r1/b;

    .line 313
    .line 314
    iget v0, p0, Lax/q1/n;->e:I

    .line 315
    .line 316
    iget-boolean v3, p0, Lax/q1/n;->b:Z

    .line 317
    .line 318
    or-int/2addr v0, v3

    .line 319
    iget-boolean v3, p0, Lax/q1/n;->c:Z

    .line 320
    .line 321
    if-eqz v3, :cond_143

    .line 322
    .line 323
    goto :goto_144

    .line 324
    :cond_143
    const/4 v1, 0x0

    .line 325
    :goto_144
    or-int/2addr v0, v1

    .line 326
    invoke-direct {p1, v0}, Lax/r1/b;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_14c
    new-instance p1, Lax/X1/h;

    .line 334
    .line 335
    iget v0, p0, Lax/q1/n;->d:I

    .line 336
    .line 337
    iget-boolean v3, p0, Lax/q1/n;->b:Z

    .line 338
    .line 339
    or-int/2addr v0, v3

    .line 340
    iget-boolean v3, p0, Lax/q1/n;->c:Z

    .line 341
    .line 342
    if-eqz v3, :cond_158

    .line 343
    .line 344
    goto :goto_159

    .line 345
    :cond_158
    const/4 v1, 0x0

    .line 346
    :goto_159
    or-int/2addr v0, v1

    .line 347
    invoke-direct {p1, v0}, Lax/X1/h;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_161
    new-instance p1, Lax/X1/e;

    .line 355
    .line 356
    invoke-direct {p1}, Lax/X1/e;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_16a
    new-instance p1, Lax/X1/b;

    .line 364
    .line 365
    invoke-direct {p1}, Lax/X1/b;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    nop

    .line 373
    :pswitch_data_174
    .packed-switch 0x0
        :pswitch_16a
        :pswitch_161
        :pswitch_14c
        :pswitch_137
        :pswitch_116
        :pswitch_10d
        :pswitch_fa
        :pswitch_e5
        :pswitch_ad
        :pswitch_a4
        :pswitch_9b
        :pswitch_6e
        :pswitch_65
        :pswitch_6
        :pswitch_5a
        :pswitch_4c
        :pswitch_3e
        :pswitch_35
        :pswitch_2c
        :pswitch_23
        :pswitch_10
        :pswitch_7
    .end packed-switch
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

.method private static k()Ljava/lang/reflect/Constructor;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lax/q1/r;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/reflect/InvocationTargetException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    const-string v1, "androidx.media3.decoder.flac.FlacLibrary"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "isAvailable"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_32

    .line 25
    .line 26
    const-string v0, "androidx.media3.decoder.flac.FlacExtractor"

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, Lax/q1/r;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x1

    .line 39
    new-array v1, v1, [Ljava/lang/Class;

    .line 40
    .line 41
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    aput-object v2, v1, v3

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_32
    return-object v3
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

.method private static l()Ljava/lang/reflect/Constructor;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lax/q1/r;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .line 1
    const-class v0, Lax/X0/e;

    .line 2
    .line 3
    const-class v1, Lax/q1/r;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public bridge synthetic a(Lax/N1/t$a;)Lax/q1/x;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/q1/n;->o(Lax/N1/t$a;)Lax/q1/n;

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

.method public bridge synthetic b(I)Lax/q1/x;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/q1/n;->i(I)Lax/q1/n;

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

.method public declared-synchronized c()[Lax/q1/r;
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lax/q1/n;->e(Landroid/net/Uri;Ljava/util/Map;)[Lax/q1/r;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    :try_start_f
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_e

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public bridge synthetic d(Z)Lax/q1/x;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/q1/n;->j(Z)Lax/q1/n;

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

.method public declared-synchronized e(Landroid/net/Uri;Ljava/util/Map;)[Lax/q1/r;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lax/q1/r;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, Lax/q1/n;->s:[I

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lax/P0/q;->b(Ljava/util/Map;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v2, -0x1

    .line 15
    if-eq p2, v2, :cond_16

    .line 16
    .line 17
    invoke-direct {p0, p2, v0}, Lax/q1/n;->h(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    goto :goto_16

    .line 21
    :catchall_14
    move-exception p1

    .line 22
    goto :goto_3c

    .line 23
    :cond_16
    :goto_16
    invoke-static {p1}, Lax/P0/q;->c(Landroid/net/Uri;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eq p1, v2, :cond_21

    .line 28
    .line 29
    if-eq p1, p2, :cond_21

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lax/q1/n;->h(ILjava/util/List;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    array-length v2, v1

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    :goto_24
    if-ge v4, v2, :cond_32

    .line 38
    .line 39
    aget v5, v1, v4

    .line 40
    .line 41
    if-eq v5, p2, :cond_2f

    .line 42
    .line 43
    if-eq v5, p1, :cond_2f

    .line 44
    .line 45
    invoke-direct {p0, v5, v0}, Lax/q1/n;->h(ILjava/util/List;)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_24

    .line 51
    :cond_32
    new-array p1, v3, [Lax/q1/r;

    .line 52
    .line 53
    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, [Lax/q1/r;
    :try_end_3a
    .catchall {:try_start_1 .. :try_end_3a} :catchall_14

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-object p1

    .line 61
    :goto_3c
    :try_start_3c
    monitor-exit p0
    :try_end_3d
    .catchall {:try_start_3c .. :try_end_3d} :catchall_14

    .line 62
    throw p1
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

.method public declared-synchronized i(I)Lax/q1/n;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput p1, p0, Lax/q1/n;->q:I
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public declared-synchronized j(Z)Lax/q1/n;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-boolean p1, p0, Lax/q1/n;->o:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public declared-synchronized m(Z)Lax/q1/n;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-boolean p1, p0, Lax/q1/n;->c:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public declared-synchronized n(I)Lax/q1/n;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput p1, p0, Lax/q1/n;->r:I
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public declared-synchronized o(Lax/N1/t$a;)Lax/q1/n;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-object p1, p0, Lax/q1/n;->p:Lax/N1/t$a;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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
