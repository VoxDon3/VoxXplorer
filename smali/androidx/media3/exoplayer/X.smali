.class final Landroidx/media3/exoplayer/X;
.super Lax/P0/h;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/X$c;,
        Landroidx/media3/exoplayer/X$d;,
        Landroidx/media3/exoplayer/X$b;,
        Landroidx/media3/exoplayer/X$e;
    }
.end annotation


# instance fields
.field private final A:Landroidx/media3/exoplayer/X$d;

.field private A0:J

.field private final B:Landroidx/media3/exoplayer/d;

.field private final C:Landroidx/media3/exoplayer/V0;

.field private final D:Landroidx/media3/exoplayer/a1;

.field private final E:Landroidx/media3/exoplayer/d1;

.field private final F:J

.field private final G:Landroidx/media3/exoplayer/X0;

.field private final H:Lax/S0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/f<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private I:I

.field private J:Z

.field private K:I

.field private L:I

.field private M:Z

.field private N:Z

.field private O:Lax/r7/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/C<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private P:Lax/Y0/Y;

.field private Q:Lax/Y0/Z;

.field private R:Lax/i1/g0;

.field private S:Landroidx/media3/exoplayer/ExoPlayer$c;

.field private T:Z

.field private U:Lax/P0/H$b;

.field private V:Lax/P0/A;

.field private W:Lax/P0/A;

.field private X:Lax/P0/v;

.field private Y:Lax/P0/v;

.field private Z:Ljava/lang/Object;

.field private a0:Landroid/view/Surface;

.field final b:Lax/l1/K;

.field private b0:Landroid/view/SurfaceHolder;

.field final c:Lax/P0/H$b;

.field private c0:Lax/p1/l;

.field private final d:Lax/S0/k;

.field private d0:Z

.field private final e:Landroid/content/Context;

.field private e0:Landroid/view/TextureView;

.field private final f:Lax/P0/H;

.field private f0:I

.field private final g:[Landroidx/media3/exoplayer/M0;

.field private g0:I

.field private final h:[Landroidx/media3/exoplayer/M0;

.field private h0:Lax/S0/I;

.field private final i:Lax/l1/J;

.field private i0:Lax/Y0/b;

.field private final j:Lax/S0/q;

.field private j0:Lax/Y0/b;

.field private final k:Landroidx/media3/exoplayer/n0$f;

.field private k0:Lax/P0/c;

.field private final l:Landroidx/media3/exoplayer/n0;

.field private l0:F

.field private final m:Lax/S0/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/S0/t<",
            "Lax/P0/H$d;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Z

.field private final n:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroidx/media3/exoplayer/ExoPlayer$a;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Lax/R0/c;

.field private final o:Lax/P0/N$b;

.field private o0:Z

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/X$e;",
            ">;"
        }
    .end annotation
.end field

.field private p0:Z

.field private final q:Z

.field private q0:I

.field private final r:Lax/i1/F$a;

.field private r0:Lax/P0/J;

.field private final s:Lax/Z0/a;

.field private s0:Z

.field private final t:Landroid/os/Looper;

.field private t0:Z

.field private final u:Lax/m1/e;

.field private u0:Lax/P0/n;

.field private final v:J

.field private v0:Lax/P0/a0;

.field private final w:J

.field private w0:Lax/P0/A;

.field private final x:J

.field private x0:Landroidx/media3/exoplayer/J0;

.field private final y:Lax/S0/h;

.field private y0:I

.field private final z:Landroidx/media3/exoplayer/X$c;

.field private z0:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lax/P0/z;->a(Ljava/lang/String;)V

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
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/ExoPlayer$b;Lax/P0/H;)V
    .registers 39
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    invoke-direct {v1}, Lax/P0/h;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v8, Lax/S0/k;

    .line 12
    .line 13
    invoke-direct {v8}, Lax/S0/k;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v8, v1, Landroidx/media3/exoplayer/X;->d:Lax/S0/k;

    .line 17
    .line 18
    :try_start_11
    const-string v8, "ExoPlayerImpl"

    .line 19
    .line 20
    new-instance v9, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v10, "Init "

    .line 26
    .line 27
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v10, " ["

    .line 42
    .line 43
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v10, "AndroidXMedia3/1.8.1"

    .line 47
    .line 48
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v10, "] ["

    .line 52
    .line 53
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-object v10, Lax/S0/d0;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v10, "]"

    .line 62
    .line 63
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-static {v8, v9}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iput-object v8, v1, Landroidx/media3/exoplayer/X;->e:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->i:Lax/q7/f;

    .line 82
    .line 83
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lax/S0/h;

    .line 84
    .line 85
    invoke-interface {v8, v9}, Lax/q7/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, Lax/Z0/a;

    .line 90
    .line 91
    iput-object v8, v1, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 92
    .line 93
    iget v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->k:I

    .line 94
    .line 95
    iput v8, v1, Landroidx/media3/exoplayer/X;->q0:I

    .line 96
    .line 97
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->l:Lax/P0/J;

    .line 98
    .line 99
    iput-object v8, v1, Landroidx/media3/exoplayer/X;->r0:Lax/P0/J;

    .line 100
    .line 101
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->m:Lax/P0/c;

    .line 102
    .line 103
    iput-object v8, v1, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 104
    .line 105
    iget v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->s:I

    .line 106
    .line 107
    iput v8, v1, Landroidx/media3/exoplayer/X;->f0:I

    .line 108
    .line 109
    iget v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->t:I

    .line 110
    .line 111
    iput v8, v1, Landroidx/media3/exoplayer/X;->g0:I

    .line 112
    .line 113
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 114
    .line 115
    iput-boolean v8, v1, Landroidx/media3/exoplayer/X;->m0:Z

    .line 116
    .line 117
    iget-wide v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->C:J

    .line 118
    .line 119
    iput-wide v8, v1, Landroidx/media3/exoplayer/X;->F:J

    .line 120
    .line 121
    new-instance v12, Landroidx/media3/exoplayer/X$c;

    .line 122
    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-direct {v12, v1, v8}, Landroidx/media3/exoplayer/X$c;-><init>(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/X$a;)V

    .line 125
    .line 126
    .line 127
    iput-object v12, v1, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 128
    .line 129
    new-instance v9, Landroidx/media3/exoplayer/X$d;

    .line 130
    .line 131
    invoke-direct {v9, v8}, Landroidx/media3/exoplayer/X$d;-><init>(Landroidx/media3/exoplayer/X$a;)V

    .line 132
    .line 133
    .line 134
    iput-object v9, v1, Landroidx/media3/exoplayer/X;->A:Landroidx/media3/exoplayer/X$d;

    .line 135
    .line 136
    new-instance v15, Landroid/os/Handler;

    .line 137
    .line 138
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 139
    .line 140
    invoke-direct {v15, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 141
    .line 142
    .line 143
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->d:Lax/q7/u;

    .line 144
    .line 145
    invoke-interface {v9}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    move-object v13, v9

    .line 150
    check-cast v13, Lax/Y0/X;

    .line 151
    .line 152
    move-object v10, v13

    .line 153
    move-object v13, v12

    .line 154
    move-object v14, v12

    .line 155
    move-object v11, v15

    .line 156
    move-object v15, v12

    .line 157
    invoke-interface/range {v10 .. v15}, Lax/Y0/X;->b(Landroid/os/Handler;Lax/o1/P;Lax/a1/z;Lax/k1/h;Lax/g1/b;)[Landroidx/media3/exoplayer/M0;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    iput-object v9, v1, Landroidx/media3/exoplayer/X;->g:[Landroidx/media3/exoplayer/M0;

    .line 162
    .line 163
    array-length v12, v9

    .line 164
    const/4 v13, 0x0

    .line 165
    if-lez v12, :cond_a8

    .line 166
    .line 167
    const/4 v12, 0x1

    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    const/4 v12, 0x0

    .line 170
    :goto_a9
    invoke-static {v12}, Lax/S0/a;->g(Z)V

    .line 171
    .line 172
    .line 173
    array-length v9, v9

    .line 174
    new-array v9, v9, [Landroidx/media3/exoplayer/M0;

    .line 175
    .line 176
    iput-object v9, v1, Landroidx/media3/exoplayer/X;->h:[Landroidx/media3/exoplayer/M0;

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    :goto_b2
    iget-object v12, v1, Landroidx/media3/exoplayer/X;->h:[Landroidx/media3/exoplayer/M0;

    .line 180
    .line 181
    array-length v14, v12

    .line 182
    if-ge v9, v14, :cond_d6

    .line 183
    .line 184
    iget-object v14, v1, Landroidx/media3/exoplayer/X;->g:[Landroidx/media3/exoplayer/M0;

    .line 185
    .line 186
    aget-object v14, v14, v9

    .line 187
    .line 188
    iget-object v15, v1, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 189
    .line 190
    move-object/from16 v17, v15

    .line 191
    .line 192
    move-object/from16 v18, v15

    .line 193
    .line 194
    move-object/from16 v19, v15

    .line 195
    .line 196
    move-object v13, v10

    .line 197
    move-object/from16 v16, v15

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    move-object v15, v11

    .line 201
    invoke-interface/range {v13 .. v19}, Lax/Y0/X;->a(Landroidx/media3/exoplayer/M0;Landroid/os/Handler;Lax/o1/P;Lax/a1/z;Lax/k1/h;Lax/g1/b;)Landroidx/media3/exoplayer/M0;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    aput-object v11, v12, v9

    .line 206
    .line 207
    add-int/2addr v9, v7

    .line 208
    move-object v10, v13

    .line 209
    move-object v11, v15

    .line 210
    const/4 v13, 0x0

    .line 211
    goto :goto_b2

    .line 212
    :catchall_d3
    move-exception v0

    .line 213
    goto/16 :goto_397

    .line 214
    .line 215
    :cond_d6
    const/4 v10, 0x0

    .line 216
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:Lax/q7/u;

    .line 217
    .line 218
    invoke-interface {v9}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    move-object v15, v9

    .line 223
    check-cast v15, Lax/l1/J;

    .line 224
    .line 225
    iput-object v15, v1, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 226
    .line 227
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->e:Lax/q7/u;

    .line 228
    .line 229
    invoke-interface {v9}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    check-cast v9, Lax/i1/F$a;

    .line 234
    .line 235
    iput-object v9, v1, Landroidx/media3/exoplayer/X;->r:Lax/i1/F$a;

    .line 236
    .line 237
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->h:Lax/q7/u;

    .line 238
    .line 239
    invoke-interface {v9}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    check-cast v9, Lax/m1/e;

    .line 244
    .line 245
    iput-object v9, v1, Landroidx/media3/exoplayer/X;->u:Lax/m1/e;

    .line 246
    .line 247
    iget-boolean v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->u:Z

    .line 248
    .line 249
    iput-boolean v11, v1, Landroidx/media3/exoplayer/X;->q:Z

    .line 250
    .line 251
    iget-object v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->v:Lax/Y0/Z;

    .line 252
    .line 253
    iput-object v11, v1, Landroidx/media3/exoplayer/X;->Q:Lax/Y0/Z;

    .line 254
    .line 255
    iget-wide v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    .line 256
    .line 257
    iput-wide v11, v1, Landroidx/media3/exoplayer/X;->v:J

    .line 258
    .line 259
    iget-wide v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->y:J

    .line 260
    .line 261
    iput-wide v11, v1, Landroidx/media3/exoplayer/X;->w:J

    .line 262
    .line 263
    iget-wide v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->z:J

    .line 264
    .line 265
    iput-wide v11, v1, Landroidx/media3/exoplayer/X;->x:J

    .line 266
    .line 267
    iget-object v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->w:Lax/Y0/Y;

    .line 268
    .line 269
    iput-object v11, v1, Landroidx/media3/exoplayer/X;->P:Lax/Y0/Y;

    .line 270
    .line 271
    iget-boolean v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->D:Z

    .line 272
    .line 273
    iput-boolean v11, v1, Landroidx/media3/exoplayer/X;->T:Z

    .line 274
    .line 275
    iget-object v11, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 276
    .line 277
    iput-object v11, v1, Landroidx/media3/exoplayer/X;->t:Landroid/os/Looper;

    .line 278
    .line 279
    iget-object v12, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lax/S0/h;

    .line 280
    .line 281
    iput-object v12, v1, Landroidx/media3/exoplayer/X;->y:Lax/S0/h;

    .line 282
    .line 283
    if-nez p2, :cond_11e

    .line 284
    .line 285
    move-object v13, v1

    .line 286
    goto :goto_120

    .line 287
    :cond_11e
    move-object/from16 v13, p2

    .line 288
    .line 289
    :goto_120
    iput-object v13, v1, Landroidx/media3/exoplayer/X;->f:Lax/P0/H;

    .line 290
    .line 291
    new-instance v14, Lax/S0/t;

    .line 292
    .line 293
    new-instance v4, Landroidx/media3/exoplayer/C;

    .line 294
    .line 295
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/C;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v14, v11, v12, v4}, Lax/S0/t;-><init>(Landroid/os/Looper;Lax/S0/h;Lax/S0/t$b;)V

    .line 299
    .line 300
    .line 301
    iput-object v14, v1, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 302
    .line 303
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 304
    .line 305
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 306
    .line 307
    .line 308
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 309
    .line 310
    new-instance v4, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 313
    .line 314
    .line 315
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 316
    .line 317
    new-instance v4, Lax/i1/g0$a;

    .line 318
    .line 319
    invoke-direct {v4, v10}, Lax/i1/g0$a;-><init>(I)V

    .line 320
    .line 321
    .line 322
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 323
    .line 324
    sget-object v4, Landroidx/media3/exoplayer/ExoPlayer$c;->b:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 325
    .line 326
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->S:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 327
    .line 328
    new-instance v4, Lax/l1/K;

    .line 329
    .line 330
    iget-object v14, v1, Landroidx/media3/exoplayer/X;->g:[Landroidx/media3/exoplayer/M0;

    .line 331
    .line 332
    array-length v5, v14

    .line 333
    new-array v5, v5, [Lax/Y0/W;

    .line 334
    .line 335
    array-length v14, v14

    .line 336
    new-array v14, v14, [Lax/l1/D;

    .line 337
    .line 338
    sget-object v6, Lax/P0/V;->b:Lax/P0/V;

    .line 339
    .line 340
    invoke-direct {v4, v5, v14, v6, v8}, Lax/l1/K;-><init>([Lax/Y0/W;[Lax/l1/D;Lax/P0/V;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->b:Lax/l1/K;

    .line 344
    .line 345
    new-instance v5, Lax/P0/N$b;

    .line 346
    .line 347
    invoke-direct {v5}, Lax/P0/N$b;-><init>()V

    .line 348
    .line 349
    .line 350
    iput-object v5, v1, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 351
    .line 352
    new-instance v5, Lax/P0/H$b$a;

    .line 353
    .line 354
    invoke-direct {v5}, Lax/P0/H$b$a;-><init>()V

    .line 355
    .line 356
    .line 357
    new-array v2, v2, [I

    .line 358
    .line 359
    fill-array-data v2, :array_39e

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5, v2}, Lax/P0/H$b$a;->c([I)Lax/P0/H$b$a;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v15}, Lax/l1/J;->h()Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    const/16 v6, 0x1d

    .line 371
    .line 372
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 377
    .line 378
    const/16 v6, 0x17

    .line 379
    .line 380
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 385
    .line 386
    const/16 v6, 0x19

    .line 387
    .line 388
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 393
    .line 394
    const/16 v6, 0x21

    .line 395
    .line 396
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 401
    .line 402
    const/16 v6, 0x1a

    .line 403
    .line 404
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 409
    .line 410
    const/16 v6, 0x22

    .line 411
    .line 412
    invoke-virtual {v2, v6, v5}, Lax/P0/H$b$a;->d(IZ)Lax/P0/H$b$a;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-virtual {v2}, Lax/P0/H$b$a;->e()Lax/P0/H$b;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->c:Lax/P0/H$b;

    .line 421
    .line 422
    new-instance v5, Lax/P0/H$b$a;

    .line 423
    .line 424
    invoke-direct {v5}, Lax/P0/H$b$a;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5, v2}, Lax/P0/H$b$a;->b(Lax/P0/H$b;)Lax/P0/H$b$a;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/4 v5, 0x4

    .line 432
    invoke-virtual {v2, v5}, Lax/P0/H$b$a;->a(I)Lax/P0/H$b$a;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/16 v6, 0xa

    .line 437
    .line 438
    invoke-virtual {v2, v6}, Lax/P0/H$b$a;->a(I)Lax/P0/H$b$a;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-virtual {v2}, Lax/P0/H$b$a;->e()Lax/P0/H$b;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->U:Lax/P0/H$b;

    .line 447
    .line 448
    invoke-interface {v12, v11, v8}, Lax/S0/h;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lax/S0/q;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->j:Lax/S0/q;

    .line 453
    .line 454
    new-instance v2, Landroidx/media3/exoplayer/D;

    .line 455
    .line 456
    invoke-direct {v2, v1}, Landroidx/media3/exoplayer/D;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 457
    .line 458
    .line 459
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->k:Landroidx/media3/exoplayer/n0$f;

    .line 460
    .line 461
    invoke-static {v4}, Landroidx/media3/exoplayer/J0;->k(Lax/l1/K;)Landroidx/media3/exoplayer/J0;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    iput-object v6, v1, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 466
    .line 467
    iget-object v6, v1, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 468
    .line 469
    invoke-interface {v6, v13, v11}, Lax/Z0/a;->d0(Lax/P0/H;Landroid/os/Looper;)V

    .line 470
    .line 471
    .line 472
    new-instance v6, Lax/Z0/I1;

    .line 473
    .line 474
    iget-object v13, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->I:Ljava/lang/String;

    .line 475
    .line 476
    invoke-direct {v6, v13}, Lax/Z0/I1;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v19, v11

    .line 480
    .line 481
    new-instance v11, Landroidx/media3/exoplayer/n0;

    .line 482
    .line 483
    move-object/from16 v21, v12

    .line 484
    .line 485
    iget-object v12, v1, Landroidx/media3/exoplayer/X;->e:Landroid/content/Context;

    .line 486
    .line 487
    iget-object v13, v1, Landroidx/media3/exoplayer/X;->g:[Landroidx/media3/exoplayer/M0;

    .line 488
    .line 489
    iget-object v14, v1, Landroidx/media3/exoplayer/X;->h:[Landroidx/media3/exoplayer/M0;

    .line 490
    .line 491
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:Lax/q7/u;

    .line 492
    .line 493
    invoke-interface {v5}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    move-object/from16 v17, v5

    .line 498
    .line 499
    check-cast v17, Landroidx/media3/exoplayer/o0;

    .line 500
    .line 501
    iget v5, v1, Landroidx/media3/exoplayer/X;->I:I

    .line 502
    .line 503
    iget-boolean v8, v1, Landroidx/media3/exoplayer/X;->J:Z

    .line 504
    .line 505
    iget-object v3, v1, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 506
    .line 507
    iget-object v7, v1, Landroidx/media3/exoplayer/X;->Q:Lax/Y0/Z;

    .line 508
    .line 509
    iget-object v10, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->A:Lax/Y0/P;

    .line 510
    .line 511
    move-object/from16 v30, v2

    .line 512
    .line 513
    move-object/from16 v16, v3

    .line 514
    .line 515
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->B:J

    .line 516
    .line 517
    move-wide/from16 v24, v2

    .line 518
    .line 519
    iget-boolean v2, v1, Landroidx/media3/exoplayer/X;->T:Z

    .line 520
    .line 521
    iget-boolean v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->J:Z

    .line 522
    .line 523
    move/from16 v26, v2

    .line 524
    .line 525
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->F:Lax/Y0/T;

    .line 526
    .line 527
    move-object/from16 v32, v2

    .line 528
    .line 529
    iget-object v2, v1, Landroidx/media3/exoplayer/X;->S:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 530
    .line 531
    move-object/from16 v33, v2

    .line 532
    .line 533
    iget-object v2, v1, Landroidx/media3/exoplayer/X;->A:Landroidx/media3/exoplayer/X$d;

    .line 534
    .line 535
    move-object/from16 v34, v2

    .line 536
    .line 537
    move/from16 v27, v3

    .line 538
    .line 539
    move-object/from16 v31, v6

    .line 540
    .line 541
    move-object/from16 v22, v7

    .line 542
    .line 543
    move/from16 v20, v8

    .line 544
    .line 545
    move-object/from16 v18, v9

    .line 546
    .line 547
    move-object/from16 v23, v10

    .line 548
    .line 549
    move-object/from16 v28, v19

    .line 550
    .line 551
    move-object/from16 v29, v21

    .line 552
    .line 553
    move/from16 v19, v5

    .line 554
    .line 555
    move-object/from16 v21, v16

    .line 556
    .line 557
    move-object/from16 v16, v4

    .line 558
    .line 559
    invoke-direct/range {v11 .. v34}, Landroidx/media3/exoplayer/n0;-><init>(Landroid/content/Context;[Landroidx/media3/exoplayer/M0;[Landroidx/media3/exoplayer/M0;Lax/l1/J;Lax/l1/K;Landroidx/media3/exoplayer/o0;Lax/m1/e;IZLax/Z0/a;Lax/Y0/Z;Lax/Y0/P;JZZLandroid/os/Looper;Lax/S0/h;Landroidx/media3/exoplayer/n0$f;Lax/Z0/I1;Lax/Y0/T;Landroidx/media3/exoplayer/ExoPlayer$c;Lax/o1/z;)V

    .line 560
    .line 561
    .line 562
    move-object/from16 v9, v18

    .line 563
    .line 564
    move-object/from16 v2, v28

    .line 565
    .line 566
    move-object/from16 v21, v29

    .line 567
    .line 568
    move-object/from16 v3, v31

    .line 569
    .line 570
    iput-object v11, v1, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 571
    .line 572
    invoke-virtual {v11}, Landroidx/media3/exoplayer/n0;->P()Landroid/os/Looper;

    .line 573
    .line 574
    .line 575
    move-result-object v18

    .line 576
    const/high16 v4, 0x3f800000    # 1.0f

    .line 577
    .line 578
    iput v4, v1, Landroidx/media3/exoplayer/X;->l0:F

    .line 579
    .line 580
    const/4 v10, 0x0

    .line 581
    iput v10, v1, Landroidx/media3/exoplayer/X;->I:I

    .line 582
    .line 583
    sget-object v4, Lax/P0/A;->I:Lax/P0/A;

    .line 584
    .line 585
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 586
    .line 587
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->W:Lax/P0/A;

    .line 588
    .line 589
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 590
    .line 591
    const/4 v4, -0x1

    .line 592
    iput v4, v1, Landroidx/media3/exoplayer/X;->y0:I

    .line 593
    .line 594
    sget-object v4, Lax/R0/c;->d:Lax/R0/c;

    .line 595
    .line 596
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->n0:Lax/R0/c;

    .line 597
    .line 598
    const/4 v4, 0x1

    .line 599
    iput-boolean v4, v1, Landroidx/media3/exoplayer/X;->o0:Z

    .line 600
    .line 601
    iget-object v4, v1, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 602
    .line 603
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/X;->N(Lax/P0/H$d;)V

    .line 604
    .line 605
    .line 606
    new-instance v4, Landroid/os/Handler;

    .line 607
    .line 608
    invoke-direct {v4, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 609
    .line 610
    .line 611
    iget-object v5, v1, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 612
    .line 613
    invoke-interface {v9, v4, v5}, Lax/m1/e;->e(Landroid/os/Handler;Lax/m1/e$a;)V

    .line 614
    .line 615
    .line 616
    iget-object v4, v1, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 617
    .line 618
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/X;->L1(Landroidx/media3/exoplayer/ExoPlayer$a;)V

    .line 619
    .line 620
    .line 621
    iget-wide v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->c:J

    .line 622
    .line 623
    const-wide/16 v6, 0x0

    .line 624
    .line 625
    cmp-long v8, v4, v6

    .line 626
    .line 627
    if-lez v8, :cond_277

    .line 628
    .line 629
    invoke-virtual {v11, v4, v5}, Landroidx/media3/exoplayer/n0;->I(J)V

    .line 630
    .line 631
    .line 632
    :cond_277
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 633
    .line 634
    const/16 v5, 0x1f

    .line 635
    .line 636
    if-lt v4, v5, :cond_284

    .line 637
    .line 638
    iget-object v4, v1, Landroidx/media3/exoplayer/X;->e:Landroid/content/Context;

    .line 639
    .line 640
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->E:Z

    .line 641
    .line 642
    invoke-static {v4, v1, v5, v3}, Landroidx/media3/exoplayer/X$b;->b(Landroid/content/Context;Landroidx/media3/exoplayer/X;ZLax/Z0/I1;)V

    .line 643
    .line 644
    .line 645
    :cond_284
    new-instance v16, Lax/S0/f;

    .line 646
    .line 647
    const/16 v35, 0x0

    .line 648
    .line 649
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v17

    .line 653
    new-instance v3, Landroidx/media3/exoplayer/F;

    .line 654
    .line 655
    invoke-direct {v3, v1}, Landroidx/media3/exoplayer/F;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v19, v2

    .line 659
    .line 660
    move-object/from16 v20, v21

    .line 661
    .line 662
    move-object/from16 v21, v3

    .line 663
    .line 664
    invoke-direct/range {v16 .. v21}, Lax/S0/f;-><init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Lax/S0/h;Lax/S0/f$a;)V

    .line 665
    .line 666
    .line 667
    move-object/from16 v3, v16

    .line 668
    .line 669
    move-object/from16 v2, v19

    .line 670
    .line 671
    move-object/from16 v21, v20

    .line 672
    .line 673
    iput-object v3, v1, Landroidx/media3/exoplayer/X;->H:Lax/S0/f;

    .line 674
    .line 675
    new-instance v4, Landroidx/media3/exoplayer/G;

    .line 676
    .line 677
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/G;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v3, v4}, Lax/S0/f;->e(Ljava/lang/Runnable;)V

    .line 681
    .line 682
    .line 683
    new-instance v16, Landroidx/media3/exoplayer/d;

    .line 684
    .line 685
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 686
    .line 687
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 688
    .line 689
    iget-object v5, v1, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 690
    .line 691
    move-object/from16 v17, v3

    .line 692
    .line 693
    move-object/from16 v19, v4

    .line 694
    .line 695
    move-object/from16 v20, v5

    .line 696
    .line 697
    invoke-direct/range {v16 .. v21}, Landroidx/media3/exoplayer/d;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Landroidx/media3/exoplayer/d$b;Lax/S0/h;)V

    .line 698
    .line 699
    .line 700
    move-object/from16 v3, v16

    .line 701
    .line 702
    iput-object v3, v1, Landroidx/media3/exoplayer/X;->B:Landroidx/media3/exoplayer/d;

    .line 703
    .line 704
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->p:Z

    .line 705
    .line 706
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/d;->d(Z)V

    .line 707
    .line 708
    .line 709
    iget-boolean v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->H:Z

    .line 710
    .line 711
    if-eqz v3, :cond_2e3

    .line 712
    .line 713
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->K:Landroidx/media3/exoplayer/X0;

    .line 714
    .line 715
    iput-object v3, v1, Landroidx/media3/exoplayer/X;->G:Landroidx/media3/exoplayer/X0;

    .line 716
    .line 717
    new-instance v4, Landroidx/media3/exoplayer/H;

    .line 718
    .line 719
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/H;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 720
    .line 721
    .line 722
    iget-object v5, v1, Landroidx/media3/exoplayer/X;->e:Landroid/content/Context;

    .line 723
    .line 724
    move-object/from16 v19, v2

    .line 725
    .line 726
    move-object/from16 v16, v3

    .line 727
    .line 728
    move-object/from16 v17, v4

    .line 729
    .line 730
    move-object/from16 v20, v18

    .line 731
    .line 732
    move-object/from16 v18, v5

    .line 733
    .line 734
    invoke-interface/range {v16 .. v21}, Landroidx/media3/exoplayer/X0;->b(Landroidx/media3/exoplayer/X0$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lax/S0/h;)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v18, v20

    .line 738
    .line 739
    goto :goto_2e8

    .line 740
    :cond_2e3
    move-object/from16 v19, v2

    .line 741
    .line 742
    const/4 v2, 0x0

    .line 743
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->G:Landroidx/media3/exoplayer/X0;

    .line 744
    .line 745
    :goto_2e8
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:Z

    .line 746
    .line 747
    if-eqz v2, :cond_310

    .line 748
    .line 749
    new-instance v16, Landroidx/media3/exoplayer/V0;

    .line 750
    .line 751
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 752
    .line 753
    iget-object v3, v1, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 754
    .line 755
    iget-object v4, v1, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 756
    .line 757
    invoke-virtual {v4}, Lax/P0/c;->b()I

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    move-object/from16 v17, v2

    .line 762
    .line 763
    move-object/from16 v20, v18

    .line 764
    .line 765
    move-object/from16 v22, v21

    .line 766
    .line 767
    move-object/from16 v18, v3

    .line 768
    .line 769
    move-object/from16 v21, v19

    .line 770
    .line 771
    move/from16 v19, v4

    .line 772
    .line 773
    invoke-direct/range {v16 .. v22}, Landroidx/media3/exoplayer/V0;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/V0$b;ILandroid/os/Looper;Landroid/os/Looper;Lax/S0/h;)V

    .line 774
    .line 775
    .line 776
    move-object/from16 v4, v16

    .line 777
    .line 778
    move-object/from16 v3, v20

    .line 779
    .line 780
    move-object/from16 v2, v22

    .line 781
    .line 782
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->C:Landroidx/media3/exoplayer/V0;

    .line 783
    .line 784
    goto :goto_317

    .line 785
    :cond_310
    move-object/from16 v3, v18

    .line 786
    .line 787
    move-object/from16 v2, v21

    .line 788
    .line 789
    const/4 v4, 0x0

    .line 790
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->C:Landroidx/media3/exoplayer/V0;

    .line 791
    .line 792
    :goto_317
    new-instance v4, Landroidx/media3/exoplayer/a1;

    .line 793
    .line 794
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 795
    .line 796
    invoke-direct {v4, v5, v3, v2}, Landroidx/media3/exoplayer/a1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lax/S0/h;)V

    .line 797
    .line 798
    .line 799
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 800
    .line 801
    iget v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->o:I

    .line 802
    .line 803
    if-eqz v5, :cond_326

    .line 804
    .line 805
    const/4 v13, 0x1

    .line 806
    goto :goto_327

    .line 807
    :cond_326
    const/4 v13, 0x0

    .line 808
    :goto_327
    invoke-virtual {v4, v13}, Landroidx/media3/exoplayer/a1;->c(Z)V

    .line 809
    .line 810
    .line 811
    new-instance v4, Landroidx/media3/exoplayer/d1;

    .line 812
    .line 813
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 814
    .line 815
    invoke-direct {v4, v5, v3, v2}, Landroidx/media3/exoplayer/d1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lax/S0/h;)V

    .line 816
    .line 817
    .line 818
    iput-object v4, v1, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 819
    .line 820
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->o:I

    .line 821
    .line 822
    const/4 v3, 0x2

    .line 823
    if-ne v2, v3, :cond_33a

    .line 824
    .line 825
    const/4 v13, 0x1

    .line 826
    goto :goto_33b

    .line 827
    :cond_33a
    const/4 v13, 0x0

    .line 828
    :goto_33b
    invoke-virtual {v4, v13}, Landroidx/media3/exoplayer/d1;->c(Z)V

    .line 829
    .line 830
    .line 831
    sget-object v2, Lax/P0/n;->e:Lax/P0/n;

    .line 832
    .line 833
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->u0:Lax/P0/n;

    .line 834
    .line 835
    sget-object v2, Lax/P0/a0;->e:Lax/P0/a0;

    .line 836
    .line 837
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->v0:Lax/P0/a0;

    .line 838
    .line 839
    sget-object v2, Lax/S0/I;->c:Lax/S0/I;

    .line 840
    .line 841
    iput-object v2, v1, Landroidx/media3/exoplayer/X;->h0:Lax/S0/I;

    .line 842
    .line 843
    iget-object v2, v1, Landroidx/media3/exoplayer/X;->P:Lax/Y0/Y;

    .line 844
    .line 845
    invoke-virtual {v11, v2}, Landroidx/media3/exoplayer/n0;->A1(Lax/Y0/Y;)V

    .line 846
    .line 847
    .line 848
    iget-object v2, v1, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 849
    .line 850
    iget-boolean v0, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->n:Z

    .line 851
    .line 852
    invoke-virtual {v11, v2, v0}, Landroidx/media3/exoplayer/n0;->j1(Lax/P0/c;Z)V

    .line 853
    .line 854
    .line 855
    iget-object v0, v1, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 856
    .line 857
    const/4 v2, 0x3

    .line 858
    const/4 v4, 0x1

    .line 859
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    iget v0, v1, Landroidx/media3/exoplayer/X;->f0:I

    .line 863
    .line 864
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    const/4 v2, 0x4

    .line 869
    const/4 v3, 0x2

    .line 870
    invoke-direct {v1, v3, v2, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iget v0, v1, Landroidx/media3/exoplayer/X;->g0:I

    .line 874
    .line 875
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    const/4 v2, 0x5

    .line 880
    invoke-direct {v1, v3, v2, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    iget-boolean v0, v1, Landroidx/media3/exoplayer/X;->m0:Z

    .line 884
    .line 885
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    const/16 v2, 0x9

    .line 890
    .line 891
    const/4 v4, 0x1

    .line 892
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    iget-object v0, v1, Landroidx/media3/exoplayer/X;->A:Landroidx/media3/exoplayer/X$d;

    .line 896
    .line 897
    const/4 v2, 0x6

    .line 898
    const/16 v3, 0x8

    .line 899
    .line 900
    invoke-direct {v1, v2, v3, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    iget v0, v1, Landroidx/media3/exoplayer/X;->q0:I

    .line 904
    .line 905
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    const/16 v2, 0x10

    .line 910
    .line 911
    invoke-direct {v1, v2, v0}, Landroidx/media3/exoplayer/X;->v2(ILjava/lang/Object;)V
    :try_end_391
    .catchall {:try_start_11 .. :try_end_391} :catchall_d3

    .line 912
    .line 913
    .line 914
    iget-object v0, v1, Landroidx/media3/exoplayer/X;->d:Lax/S0/k;

    .line 915
    .line 916
    invoke-virtual {v0}, Lax/S0/k;->f()Z

    .line 917
    .line 918
    .line 919
    return-void

    .line 920
    :goto_397
    iget-object v2, v1, Landroidx/media3/exoplayer/X;->d:Lax/S0/k;

    .line 921
    .line 922
    invoke-virtual {v2}, Lax/S0/k;->f()Z

    .line 923
    .line 924
    .line 925
    throw v0

    .line 926
    nop

    .line 927
    :array_39e
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
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

.method static synthetic A1(Landroidx/media3/exoplayer/V0;)Lax/P0/n;
    .registers 1

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/X;->S1(Landroidx/media3/exoplayer/V0;)Lax/P0/n;

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

.method private A2(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    if-eq v0, p1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :goto_9
    if-eqz v0, :cond_e

    .line 11
    .line 12
    iget-wide v1, p0, Landroidx/media3/exoplayer/X;->F:J

    .line 13
    .line 14
    goto :goto_13

    .line 15
    :cond_e
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    :goto_13
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 21
    .line 22
    invoke-virtual {v3, p1, v1, v2}, Landroidx/media3/exoplayer/n0;->J1(Ljava/lang/Object;J)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v0, :cond_27

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->Z:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->a0:Landroid/view/Surface;

    .line 31
    .line 32
    if-ne v0, v2, :cond_27

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->a0:Landroid/view/Surface;

    .line 39
    .line 40
    :cond_27
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    if-nez v1, :cond_3a

    .line 43
    .line 44
    new-instance p1, Lax/Y0/N;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-direct {p1, v0}, Lax/Y0/N;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x3eb

    .line 51
    .line 52
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/s;->f(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->C2(Landroidx/media3/exoplayer/s;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void
    .line 60
    .line 61
.end method

.method static synthetic B1(Landroidx/media3/exoplayer/X;)Lax/P0/n;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->u0:Lax/P0/n;

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

.method static synthetic C1(Landroidx/media3/exoplayer/X;Lax/P0/n;)Lax/P0/n;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->u0:Lax/P0/n;

    .line 2
    .line 3
    return-object p1
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

.method private C2(Landroidx/media3/exoplayer/s;)V
    .registers 13

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Landroidx/media3/exoplayer/J0;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Landroidx/media3/exoplayer/J0;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_1b

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/J0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/J0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1b
    move-object v3, v0

    .line 29
    iget p1, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/media3/exoplayer/n0;->T1()V

    .line 37
    .line 38
    .line 39
    const/4 v9, -0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x5

    .line 44
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic D1(Landroidx/media3/exoplayer/X;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->H2()V

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

.method private D2()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->U:Lax/P0/H$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->f:Lax/P0/H;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->c:Lax/P0/H$b;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lax/S0/d0;->O(Lax/P0/H;Lax/P0/H$b;)Lax/P0/H$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->U:Lax/P0/H$b;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lax/P0/H$b;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1e

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 20
    .line 21
    new-instance v1, Landroidx/media3/exoplayer/L;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/L;-><init>(Landroidx/media3/exoplayer/X;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0xd

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method static synthetic E1(Landroidx/media3/exoplayer/X;Lax/Y0/b;)Lax/Y0/b;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->i0:Lax/Y0/b;

    .line 2
    .line 3
    return-object p1
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

.method private E2(ZI)V
    .registers 14

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->R1(Z)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iget-boolean v2, v1, Landroidx/media3/exoplayer/J0;->l:Z

    .line 8
    .line 9
    if-ne v2, p1, :cond_13

    .line 10
    .line 11
    iget v2, v1, Landroidx/media3/exoplayer/J0;->n:I

    .line 12
    .line 13
    if-ne v2, v0, :cond_13

    .line 14
    .line 15
    iget v2, v1, Landroidx/media3/exoplayer/J0;->m:I

    .line 16
    .line 17
    if-ne v2, p2, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget v2, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    iput v2, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 25
    .line 26
    iget-boolean v2, v1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 27
    .line 28
    if-eqz v2, :cond_21

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/media3/exoplayer/J0;->a()Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_21
    invoke-virtual {v1, p1, p2, v0}, Landroidx/media3/exoplayer/J0;->e(ZII)Landroidx/media3/exoplayer/J0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 39
    .line 40
    invoke-virtual {v1, p1, p2, v0}, Landroidx/media3/exoplayer/n0;->r1(ZII)V

    .line 41
    .line 42
    .line 43
    const/4 v9, -0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x5

    .line 48
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    move-object v2, p0

    .line 54
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 55
    .line 56
    .line 57
    return-void
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

.method static synthetic F1(Landroidx/media3/exoplayer/X;)Lax/Z0/a;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

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

.method private F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V
    .registers 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iput-object v1, v0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 8
    .line 9
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 10
    .line 11
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lax/P0/N;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    xor-int/lit8 v5, v7, 0x1

    .line 18
    .line 19
    move/from16 v3, p3

    .line 20
    .line 21
    move/from16 v4, p4

    .line 22
    .line 23
    move/from16 v6, p8

    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/X;->W1(Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/J0;ZIZZ)Landroid/util/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz v3, :cond_53

    .line 47
    .line 48
    iget-object v8, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 49
    .line 50
    invoke-virtual {v8}, Lax/P0/N;->q()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_4f

    .line 55
    .line 56
    iget-object v6, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 57
    .line 58
    iget-object v8, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 59
    .line 60
    iget-object v8, v8, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v9, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 63
    .line 64
    invoke-virtual {v6, v8, v9}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget v6, v6, Lax/P0/N$b;->c:I

    .line 69
    .line 70
    iget-object v8, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 71
    .line 72
    iget-object v9, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 73
    .line 74
    invoke-virtual {v8, v6, v9}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    iget-object v6, v6, Lax/P0/N$c;->c:Lax/P0/y;

    .line 79
    .line 80
    :cond_4f
    sget-object v8, Lax/P0/A;->I:Lax/P0/A;

    .line 81
    .line 82
    iput-object v8, v0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 83
    .line 84
    :cond_53
    if-nez v3, :cond_5f

    .line 85
    .line 86
    iget-object v8, v2, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 87
    .line 88
    iget-object v9, v1, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v8, v9}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_71

    .line 95
    .line 96
    :cond_5f
    iget-object v8, v0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 97
    .line 98
    invoke-virtual {v8}, Lax/P0/A;->a()Lax/P0/A$b;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    iget-object v9, v1, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 103
    .line 104
    invoke-virtual {v8, v9}, Lax/P0/A$b;->N(Ljava/util/List;)Lax/P0/A$b;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v8}, Lax/P0/A$b;->J()Lax/P0/A;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    iput-object v8, v0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 113
    .line 114
    :cond_71
    invoke-direct {v0}, Landroidx/media3/exoplayer/X;->O1()Lax/P0/A;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    iget-object v9, v0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 119
    .line 120
    invoke-virtual {v8, v9}, Lax/P0/A;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    iput-object v8, v0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 125
    .line 126
    iget-boolean v8, v2, Landroidx/media3/exoplayer/J0;->l:Z

    .line 127
    .line 128
    iget-boolean v10, v1, Landroidx/media3/exoplayer/J0;->l:Z

    .line 129
    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x1

    .line 132
    if-eq v8, v10, :cond_87

    .line 133
    .line 134
    const/4 v8, 0x1

    .line 135
    goto :goto_88

    .line 136
    :cond_87
    const/4 v8, 0x0

    .line 137
    :goto_88
    iget v10, v2, Landroidx/media3/exoplayer/J0;->e:I

    .line 138
    .line 139
    iget v13, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 140
    .line 141
    if-eq v10, v13, :cond_90

    .line 142
    .line 143
    const/4 v10, 0x1

    .line 144
    goto :goto_91

    .line 145
    :cond_90
    const/4 v10, 0x0

    .line 146
    :goto_91
    if-nez v10, :cond_95

    .line 147
    .line 148
    if-eqz v8, :cond_98

    .line 149
    .line 150
    :cond_95
    invoke-direct {v0}, Landroidx/media3/exoplayer/X;->H2()V

    .line 151
    .line 152
    .line 153
    :cond_98
    iget-boolean v13, v2, Landroidx/media3/exoplayer/J0;->g:Z

    .line 154
    .line 155
    iget-boolean v14, v1, Landroidx/media3/exoplayer/J0;->g:Z

    .line 156
    .line 157
    if-eq v13, v14, :cond_a0

    .line 158
    .line 159
    const/4 v13, 0x1

    .line 160
    goto :goto_a1

    .line 161
    :cond_a0
    const/4 v13, 0x0

    .line 162
    :goto_a1
    if-eqz v13, :cond_a6

    .line 163
    .line 164
    invoke-direct {v0, v14}, Landroidx/media3/exoplayer/X;->G2(Z)V

    .line 165
    .line 166
    .line 167
    :cond_a6
    if-nez v7, :cond_b4

    .line 168
    .line 169
    iget-object v7, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 170
    .line 171
    new-instance v14, Landroidx/media3/exoplayer/t;

    .line 172
    .line 173
    move/from16 v15, p2

    .line 174
    .line 175
    invoke-direct {v14, v1, v15}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/J0;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v11, v14}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 179
    .line 180
    .line 181
    :cond_b4
    if-eqz p3, :cond_ce

    .line 182
    .line 183
    move/from16 v7, p7

    .line 184
    .line 185
    invoke-direct {v0, v4, v2, v7}, Landroidx/media3/exoplayer/X;->f2(ILandroidx/media3/exoplayer/J0;I)Lax/P0/H$e;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    move-wide/from16 v14, p5

    .line 190
    .line 191
    invoke-direct {v0, v14, v15}, Landroidx/media3/exoplayer/X;->e2(J)Lax/P0/H$e;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    iget-object v14, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 196
    .line 197
    new-instance v15, Landroidx/media3/exoplayer/S;

    .line 198
    .line 199
    invoke-direct {v15, v4, v7, v11}, Landroidx/media3/exoplayer/S;-><init>(ILax/P0/H$e;Lax/P0/H$e;)V

    .line 200
    .line 201
    .line 202
    const/16 v4, 0xb

    .line 203
    .line 204
    invoke-virtual {v14, v4, v15}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 205
    .line 206
    .line 207
    :cond_ce
    if-eqz v3, :cond_da

    .line 208
    .line 209
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 210
    .line 211
    new-instance v4, Landroidx/media3/exoplayer/T;

    .line 212
    .line 213
    invoke-direct {v4, v6, v5}, Landroidx/media3/exoplayer/T;-><init>(Lax/P0/y;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v12, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 217
    .line 218
    .line 219
    :cond_da
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 220
    .line 221
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 222
    .line 223
    if-eq v3, v4, :cond_fa

    .line 224
    .line 225
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 226
    .line 227
    new-instance v4, Landroidx/media3/exoplayer/U;

    .line 228
    .line 229
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/U;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 230
    .line 231
    .line 232
    const/16 v5, 0xa

    .line 233
    .line 234
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 235
    .line 236
    .line 237
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 238
    .line 239
    if-eqz v3, :cond_fa

    .line 240
    .line 241
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 242
    .line 243
    new-instance v4, Landroidx/media3/exoplayer/V;

    .line 244
    .line 245
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/V;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 249
    .line 250
    .line 251
    :cond_fa
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 252
    .line 253
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 254
    .line 255
    if-eq v3, v4, :cond_112

    .line 256
    .line 257
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 258
    .line 259
    iget-object v4, v4, Lax/l1/K;->e:Ljava/lang/Object;

    .line 260
    .line 261
    invoke-virtual {v3, v4}, Lax/l1/J;->i(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 265
    .line 266
    new-instance v4, Landroidx/media3/exoplayer/W;

    .line 267
    .line 268
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/W;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 269
    .line 270
    .line 271
    const/4 v5, 0x2

    .line 272
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 273
    .line 274
    .line 275
    :cond_112
    if-nez v9, :cond_122

    .line 276
    .line 277
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 278
    .line 279
    iget-object v4, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 280
    .line 281
    new-instance v5, Landroidx/media3/exoplayer/u;

    .line 282
    .line 283
    invoke-direct {v5, v3}, Landroidx/media3/exoplayer/u;-><init>(Lax/P0/A;)V

    .line 284
    .line 285
    .line 286
    const/16 v3, 0xe

    .line 287
    .line 288
    invoke-virtual {v4, v3, v5}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 289
    .line 290
    .line 291
    :cond_122
    if-eqz v13, :cond_12f

    .line 292
    .line 293
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 294
    .line 295
    new-instance v4, Landroidx/media3/exoplayer/v;

    .line 296
    .line 297
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/v;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 298
    .line 299
    .line 300
    const/4 v5, 0x3

    .line 301
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 302
    .line 303
    .line 304
    :cond_12f
    if-nez v10, :cond_133

    .line 305
    .line 306
    if-eqz v8, :cond_13e

    .line 307
    .line 308
    :cond_133
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 309
    .line 310
    new-instance v4, Landroidx/media3/exoplayer/w;

    .line 311
    .line 312
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/w;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 313
    .line 314
    .line 315
    const/4 v5, -0x1

    .line 316
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 317
    .line 318
    .line 319
    :cond_13e
    if-eqz v10, :cond_14b

    .line 320
    .line 321
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 322
    .line 323
    new-instance v4, Landroidx/media3/exoplayer/x;

    .line 324
    .line 325
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/x;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 326
    .line 327
    .line 328
    const/4 v5, 0x4

    .line 329
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 330
    .line 331
    .line 332
    :cond_14b
    if-nez v8, :cond_153

    .line 333
    .line 334
    iget v3, v2, Landroidx/media3/exoplayer/J0;->m:I

    .line 335
    .line 336
    iget v4, v1, Landroidx/media3/exoplayer/J0;->m:I

    .line 337
    .line 338
    if-eq v3, v4, :cond_15e

    .line 339
    .line 340
    :cond_153
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 341
    .line 342
    new-instance v4, Landroidx/media3/exoplayer/E;

    .line 343
    .line 344
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/E;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 345
    .line 346
    .line 347
    const/4 v5, 0x5

    .line 348
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 349
    .line 350
    .line 351
    :cond_15e
    iget v3, v2, Landroidx/media3/exoplayer/J0;->n:I

    .line 352
    .line 353
    iget v4, v1, Landroidx/media3/exoplayer/J0;->n:I

    .line 354
    .line 355
    if-eq v3, v4, :cond_16f

    .line 356
    .line 357
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 358
    .line 359
    new-instance v4, Landroidx/media3/exoplayer/O;

    .line 360
    .line 361
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/O;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 362
    .line 363
    .line 364
    const/4 v5, 0x6

    .line 365
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 366
    .line 367
    .line 368
    :cond_16f
    invoke-virtual {v2}, Landroidx/media3/exoplayer/J0;->n()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-virtual {v1}, Landroidx/media3/exoplayer/J0;->n()Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-eq v3, v4, :cond_184

    .line 377
    .line 378
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 379
    .line 380
    new-instance v4, Landroidx/media3/exoplayer/P;

    .line 381
    .line 382
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/P;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 383
    .line 384
    .line 385
    const/4 v5, 0x7

    .line 386
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 387
    .line 388
    .line 389
    :cond_184
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 390
    .line 391
    iget-object v4, v1, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 392
    .line 393
    invoke-virtual {v3, v4}, Lax/P0/G;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-nez v3, :cond_19a

    .line 398
    .line 399
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 400
    .line 401
    new-instance v4, Landroidx/media3/exoplayer/Q;

    .line 402
    .line 403
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/Q;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 404
    .line 405
    .line 406
    const/16 v5, 0xc

    .line 407
    .line 408
    invoke-virtual {v3, v5, v4}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 409
    .line 410
    .line 411
    :cond_19a
    invoke-direct {v0}, Landroidx/media3/exoplayer/X;->D2()V

    .line 412
    .line 413
    .line 414
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 415
    .line 416
    invoke-virtual {v3}, Lax/S0/t;->f()V

    .line 417
    .line 418
    .line 419
    iget-boolean v2, v2, Landroidx/media3/exoplayer/J0;->p:Z

    .line 420
    .line 421
    iget-boolean v3, v1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 422
    .line 423
    if-eq v2, v3, :cond_1c0

    .line 424
    .line 425
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 426
    .line 427
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    :goto_1ae
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_1c0

    .line 436
    .line 437
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 442
    .line 443
    iget-boolean v4, v1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 444
    .line 445
    invoke-interface {v3, v4}, Landroidx/media3/exoplayer/ExoPlayer$a;->G(Z)V

    .line 446
    .line 447
    .line 448
    goto :goto_1ae

    .line 449
    :cond_1c0
    return-void
.end method

.method static synthetic G1(Landroidx/media3/exoplayer/X;Lax/P0/v;)Lax/P0/v;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->X:Lax/P0/v;

    .line 2
    .line 3
    return-object p1
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

.method private G2(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->r0:Lax/P0/J;

    .line 2
    .line 3
    if-eqz v0, :cond_21

    .line 4
    .line 5
    if-eqz p1, :cond_13

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 8
    .line 9
    if-nez v1, :cond_13

    .line 10
    .line 11
    iget p1, p0, Landroidx/media3/exoplayer/X;->q0:I

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/P0/J;->a(I)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    if-nez p1, :cond_21

    .line 21
    .line 22
    iget-boolean p1, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 23
    .line 24
    if-eqz p1, :cond_21

    .line 25
    .line 26
    iget p1, p0, Landroidx/media3/exoplayer/X;->q0:I

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lax/P0/J;->b(I)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 33
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

.method public static synthetic H0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->j(Lax/P0/G;)V

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

.method static synthetic H1(Landroidx/media3/exoplayer/X;Lax/P0/a0;)Lax/P0/a0;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->v0:Lax/P0/a0;

    .line 2
    .line 3
    return-object p1
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

.method private H2()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_35

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_18

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    if-eq v0, v3, :cond_18

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_12

    .line 17
    .line 18
    goto :goto_35

    .line 19
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_18
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->i2()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->v()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_27

    .line 36
    .line 37
    if-nez v0, :cond_27

    .line 38
    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v1, 0x0

    .line 41
    :goto_28
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/a1;->d(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->v()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/d1;->d(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    :goto_35
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/a1;->d(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/d1;->d(Z)V

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static synthetic I0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/J0;->g:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lax/P0/H$d;->E(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Landroidx/media3/exoplayer/J0;->g:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lax/P0/H$d;->I(Z)V

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

.method static synthetic I1(Landroidx/media3/exoplayer/X;)Lax/S0/t;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

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

.method private I2()V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->d:Lax/S0/k;

    .line 3
    .line 4
    invoke-virtual {v1}, Lax/S0/k;->b()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->i0()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eq v1, v2, :cond_53

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->i0()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x2

    .line 42
    new-array v3, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    aput-object v1, v3, v4

    .line 46
    .line 47
    aput-object v2, v3, v0

    .line 48
    .line 49
    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 50
    .line 51
    invoke-static {v1, v3}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-boolean v2, p0, Landroidx/media3/exoplayer/X;->o0:Z

    .line 56
    .line 57
    if-nez v2, :cond_4d

    .line 58
    .line 59
    iget-boolean v2, p0, Landroidx/media3/exoplayer/X;->p0:Z

    .line 60
    .line 61
    if-eqz v2, :cond_40

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    goto :goto_45

    .line 65
    :cond_40
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 68
    .line 69
    .line 70
    :goto_45
    const-string v3, "ExoPlayerImpl"

    .line 71
    .line 72
    invoke-static {v3, v1, v2}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    iput-boolean v0, p0, Landroidx/media3/exoplayer/X;->p0:Z

    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_53
    return-void
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

.method public static synthetic J0(Lax/P0/A;Lax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->j0(Lax/P0/A;)V

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

.method static synthetic J1(Landroidx/media3/exoplayer/X;)Ljava/lang/Object;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->Z:Ljava/lang/Object;

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

.method public static synthetic K0(ZLax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->S(Z)V

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

.method static synthetic K1(Landroidx/media3/exoplayer/X;Lax/Y0/b;)Lax/Y0/b;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->j0:Lax/Y0/b;

    .line 2
    .line 3
    return-object p1
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

.method public static synthetic L0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/J0;->n:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->D(I)V

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

.method public static synthetic M0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/J0;->e:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->O(I)V

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

.method private static M1(Lax/P0/T;Lax/r7/C;)Lax/P0/T;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/T;",
            "Lax/r7/C<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lax/P0/T;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lax/r7/C;->n()Lax/r7/j0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1d

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, v0, v1}, Lax/P0/T$c;->U(IZ)Lax/P0/T$c;

    .line 27
    .line 28
    .line 29
    goto :goto_8

    .line 30
    :cond_1d
    invoke-virtual {p0}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static synthetic N0(ILax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->v(I)V

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

.method private N1(ILjava/util/List;)Ljava/util/List;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lax/i1/F;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/I0$c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2f

    .line 12
    .line 13
    new-instance v2, Landroidx/media3/exoplayer/I0$c;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lax/i1/F;

    .line 20
    .line 21
    iget-boolean v4, p0, Landroidx/media3/exoplayer/X;->q:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Landroidx/media3/exoplayer/I0$c;-><init>(Lax/i1/F;Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Landroidx/media3/exoplayer/X$e;

    .line 34
    .line 35
    iget-object v6, v2, Landroidx/media3/exoplayer/I0$c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Landroidx/media3/exoplayer/I0$c;->a:Lax/i1/A;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, Landroidx/media3/exoplayer/X$e;-><init>(Ljava/lang/Object;Lax/i1/A;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_6

    .line 48
    :cond_2f
    iget-object p2, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-interface {p2, p1, v1}, Lax/i1/g0;->e(II)Lax/i1/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 59
    .line 60
    return-object v0
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

.method public static synthetic O0(Landroidx/media3/exoplayer/X;)V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->H:Lax/S0/f;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p0}, Lax/S0/d0;->J(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Lax/S0/f;->g(Ljava/lang/Object;)V

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

.method private O1()Lax/P0/A;
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->h0()Lax/P0/N;

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
    if-eqz v1, :cond_d

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->b0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lax/P0/N$c;->c:Lax/P0/y;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 27
    .line 28
    invoke-virtual {v1}, Lax/P0/A;->a()Lax/P0/A$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, v0, Lax/P0/y;->e:Lax/P0/A;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lax/P0/A$b;->L(Lax/P0/A;)Lax/P0/A$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lax/P0/A$b;->J()Lax/P0/A;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method public static synthetic P0(Lax/P0/y;ILax/P0/H$d;)V
    .registers 3

    .line 1
    invoke-interface {p2, p0, p1}, Lax/P0/H$d;->a0(Lax/P0/y;I)V

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
.end method

.method public static synthetic Q0(Landroidx/media3/exoplayer/X;Lax/P0/H$d;Lax/P0/r;)V
    .registers 4

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->f:Lax/P0/H;

    .line 2
    .line 3
    new-instance v0, Lax/P0/H$c;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Lax/P0/H$c;-><init>(Lax/P0/r;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0, v0}, Lax/P0/H$d;->c0(Lax/P0/H;Lax/P0/H$c;)V

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

.method public static synthetic R0(ILax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->c(I)V

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

.method private R1(Z)I
    .registers 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    return p1

    .line 7
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->G:Landroidx/media3/exoplayer/X0;

    .line 8
    .line 9
    if-eqz v0, :cond_12

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/X0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    return p1

    .line 19
    :cond_12
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 20
    .line 21
    iget v0, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_1c

    .line 25
    .line 26
    if-nez p1, :cond_1c

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1c
    const/4 p1, 0x0

    .line 30
    return p1
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

.method public static synthetic S0(Landroidx/media3/exoplayer/X;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->U:Lax/P0/H$b;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->W(Lax/P0/H$b;)V

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

.method private static S1(Landroidx/media3/exoplayer/V0;)Lax/P0/n;
    .registers 4

    .line 1
    new-instance v0, Lax/P0/n$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/P0/n$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    if-eqz p0, :cond_d

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/V0;->l()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v2, 0x0

    .line 15
    :goto_e
    invoke-virtual {v0, v2}, Lax/P0/n$b;->g(I)Lax/P0/n$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p0, :cond_18

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/media3/exoplayer/V0;->k()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :cond_18
    invoke-virtual {v0, v1}, Lax/P0/n$b;->f(I)Lax/P0/n$b;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lax/P0/n$b;->e()Lax/P0/n;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
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

.method public static synthetic T0(Lax/P0/T;Lax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->U(Lax/P0/T;)V

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

.method private T1()Lax/P0/N;
    .registers 4

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/L0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/L0;-><init>(Ljava/util/Collection;Lax/i1/g0;)V

    .line 8
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

.method public static synthetic U0(IILax/P0/H$d;)V
    .registers 3

    .line 1
    invoke-interface {p2, p0, p1}, Lax/P0/H$d;->o0(II)V

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
.end method

.method private U1(Ljava/util/List;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/y;",
            ">;)",
            "Ljava/util/List<",
            "Lax/i1/F;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1e

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->r:Lax/i1/F$a;

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lax/P0/y;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Lax/i1/F$a;->e(Lax/P0/y;)Lax/i1/F;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_6

    .line 31
    :cond_1e
    return-object v0
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

.method public static synthetic V0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->N(Lax/P0/F;)V

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

.method private V1(Landroidx/media3/exoplayer/K0$b;)Landroidx/media3/exoplayer/K0;
    .registers 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->a2(Landroidx/media3/exoplayer/J0;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Landroidx/media3/exoplayer/K0;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 12
    .line 13
    iget-object v4, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ne v0, v3, :cond_14

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    move v5, v0

    .line 22
    :goto_15
    iget-object v6, p0, Landroidx/media3/exoplayer/X;->y:Lax/S0/h;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroidx/media3/exoplayer/n0;->P()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    move-object v3, p1

    .line 29
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/K0;-><init>(Landroidx/media3/exoplayer/K0$a;Landroidx/media3/exoplayer/K0$b;Lax/P0/N;ILax/S0/h;Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    return-object v1
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

.method public static synthetic W0(Lax/P0/c;Lax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->r0(Lax/P0/c;)V

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

.method private W1(Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/J0;ZIZZ)Landroid/util/Pair;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/J0;",
            "Landroidx/media3/exoplayer/J0;",
            "ZIZZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v2, :cond_1d

    .line 15
    .line 16
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1d

    .line 21
    .line 22
    new-instance p1, Landroid/util/Pair;

    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1d
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    if-eq v2, v4, :cond_34

    .line 40
    .line 41
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_34
    iget-object v2, p2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 54
    .line 55
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 58
    .line 59
    invoke-virtual {v0, v2, v4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget v2, v2, Lax/P0/N$b;->c:I

    .line 64
    .line 65
    iget-object v4, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 66
    .line 67
    invoke-virtual {v0, v2, v4}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v2, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 74
    .line 75
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v4, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 78
    .line 79
    invoke-virtual {v1, v2, v4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget v2, v2, Lax/P0/N$b;->c:I

    .line 84
    .line 85
    iget-object v4, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 86
    .line 87
    invoke-virtual {v1, v2, v4}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/4 v1, 0x2

    .line 98
    const/4 v2, 0x1

    .line 99
    if-nez v0, :cond_84

    .line 100
    .line 101
    if-eqz p3, :cond_6a

    .line 102
    .line 103
    if-nez p4, :cond_6a

    .line 104
    .line 105
    const/4 v5, 0x1

    .line 106
    goto :goto_72

    .line 107
    :cond_6a
    if-eqz p3, :cond_70

    .line 108
    .line 109
    if-ne p4, v2, :cond_70

    .line 110
    .line 111
    const/4 v5, 0x2

    .line 112
    goto :goto_72

    .line 113
    :cond_70
    if-eqz p5, :cond_7e

    .line 114
    .line 115
    :goto_72
    new-instance p1, Landroid/util/Pair;

    .line 116
    .line 117
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_7e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_84
    if-eqz p3, :cond_a1

    .line 134
    .line 135
    if-nez p4, :cond_a1

    .line 136
    .line 137
    iget-object p2, p2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 138
    .line 139
    iget-wide v4, p2, Lax/i1/F$b;->d:J

    .line 140
    .line 141
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 142
    .line 143
    iget-wide p1, p1, Lax/i1/F$b;->d:J

    .line 144
    .line 145
    cmp-long p5, v4, p1

    .line 146
    .line 147
    if-gez p5, :cond_a1

    .line 148
    .line 149
    new-instance p1, Landroid/util/Pair;

    .line 150
    .line 151
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    const/4 p3, 0x0

    .line 154
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_a1
    if-eqz p3, :cond_b3

    .line 163
    .line 164
    if-ne p4, v2, :cond_b3

    .line 165
    .line 166
    if-eqz p6, :cond_b3

    .line 167
    .line 168
    new-instance p1, Landroid/util/Pair;

    .line 169
    .line 170
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_b3
    new-instance p1, Landroid/util/Pair;

    .line 181
    .line 182
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-object p1
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

.method public static synthetic X0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/J0;->e:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Lax/P0/H$d;->Z(ZI)V

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

.method public static synthetic Y0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 2
    .line 3
    iget-object p0, p0, Lax/l1/K;->d:Lax/P0/V;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lax/P0/H$d;->H(Lax/P0/V;)V

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

.method private Y1(Landroidx/media3/exoplayer/J0;)J
    .registers 7

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3d

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 10
    .line 11
    iget-object v1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 12
    .line 13
    iget-object v1, v1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Landroidx/media3/exoplayer/J0;->c:J

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, v0, v2

    .line 28
    .line 29
    if-nez v4, :cond_2f

    .line 30
    .line 31
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->a2(Landroidx/media3/exoplayer/J0;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lax/P0/N$c;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_2f
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 49
    .line 50
    invoke-virtual {v0}, Lax/P0/N$b;->n()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iget-wide v2, p1, Landroidx/media3/exoplayer/J0;->c:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Lax/S0/d0;->E1(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    add-long/2addr v0, v2

    .line 61
    return-wide v0

    .line 62
    :cond_3d
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->Z1(Landroidx/media3/exoplayer/J0;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0
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
.end method

.method public static synthetic Z0(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/J0;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1, p0}, Lax/P0/H$d;->t0(Z)V

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

.method private Z1(Landroidx/media3/exoplayer/J0;)J
    .registers 5

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/exoplayer/X;->A0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_f
    iget-boolean v0, p1, Landroidx/media3/exoplayer/J0;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_18

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/media3/exoplayer/J0;->m()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    iget-wide v0, p1, Landroidx/media3/exoplayer/J0;->s:J

    .line 26
    .line 27
    :goto_1a
    iget-object v2, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 28
    .line 29
    invoke-virtual {v2}, Lax/i1/F$b;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_23

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_23
    iget-object v2, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 39
    .line 40
    invoke-direct {p0, v2, p1, v0, v1}, Landroidx/media3/exoplayer/X;->q2(Lax/P0/N;Lax/i1/F$b;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
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

.method public static synthetic a1(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/J0;->m:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Lax/P0/H$d;->i0(ZI)V

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

.method private a2(Landroidx/media3/exoplayer/J0;)I
    .registers 4

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/exoplayer/X;->y0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_b
    iget-object v0, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 15
    .line 16
    iget-object p1, p1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Lax/P0/N$b;->c:I

    .line 25
    .line 26
    return p1
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

.method public static synthetic b1(Landroidx/media3/exoplayer/X;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->p2(Z)V

    return-void
.end method

.method private b2(Lax/P0/N;Lax/P0/N;IJ)Landroid/util/Pair;
    .registers 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/N;",
            "Lax/P0/N;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lax/P0/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_5a

    .line 16
    .line 17
    invoke-virtual {v7}, Lax/P0/N;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_17

    .line 22
    .line 23
    goto :goto_5a

    .line 24
    :cond_17
    iget-object v12, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 25
    .line 26
    iget-object v13, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 27
    .line 28
    invoke-static/range {p4 .. p5}, Lax/S0/d0;->a1(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v15

    .line 32
    move-object/from16 v11, p1

    .line 33
    .line 34
    move/from16 v14, p3

    .line 35
    .line 36
    invoke-virtual/range {v11 .. v16}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/util/Pair;

    .line 45
    .line 46
    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v7, v5}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eq v2, v10, :cond_36

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_36
    iget-object v1, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 56
    .line 57
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 58
    .line 59
    iget v3, v0, Landroidx/media3/exoplayer/X;->I:I

    .line 60
    .line 61
    iget-boolean v4, v0, Landroidx/media3/exoplayer/X;->J:Z

    .line 62
    .line 63
    move-object/from16 v6, p1

    .line 64
    .line 65
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/n0;->Y0(Lax/P0/N$c;Lax/P0/N$b;IZLjava/lang/Object;Lax/P0/N;Lax/P0/N;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eq v1, v10, :cond_55

    .line 70
    .line 71
    iget-object v2, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 72
    .line 73
    invoke-virtual {v7, v1, v2}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lax/P0/N$c;->b()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    invoke-direct {v0, v7, v1, v2, v3}, Landroidx/media3/exoplayer/X;->l2(Lax/P0/N;IJ)Landroid/util/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    return-object v1

    .line 86
    :cond_55
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/X;->l2(Lax/P0/N;IJ)Landroid/util/Pair;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    return-object v1

    .line 91
    :cond_5a
    :goto_5a
    invoke-virtual/range {p1 .. p1}, Lax/P0/N;->q()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_68

    .line 96
    .line 97
    invoke-virtual {v7}, Lax/P0/N;->q()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_68

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    goto :goto_69

    .line 105
    :cond_68
    const/4 v1, 0x0

    .line 106
    :goto_69
    if-eqz v1, :cond_6c

    .line 107
    .line 108
    goto :goto_6e

    .line 109
    :cond_6c
    move/from16 v10, p3

    .line 110
    .line 111
    :goto_6e
    if-eqz v1, :cond_71

    .line 112
    .line 113
    goto :goto_73

    .line 114
    :cond_71
    move-wide/from16 v8, p4

    .line 115
    .line 116
    :goto_73
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/X;->l2(Lax/P0/N;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    return-object v1
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

.method public static synthetic c1(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/n0$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->h2(Landroidx/media3/exoplayer/n0$e;)V

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

.method public static synthetic d1(ILax/P0/H$e;Lax/P0/H$e;Lax/P0/H$d;)V
    .registers 4

    .line 1
    invoke-interface {p3, p0}, Lax/P0/H$d;->F(I)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1, p2, p0}, Lax/P0/H$d;->p0(Lax/P0/H$e;Lax/P0/H$e;I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public static synthetic e1(FLax/P0/H$d;)V
    .registers 2

    .line 1
    invoke-interface {p1, p0}, Lax/P0/H$d;->L(F)V

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

.method private e2(J)Lax/P0/H$e;
    .registers 15

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->b0()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_39

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 16
    .line 17
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 18
    .line 19
    iget-object v1, v1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 29
    .line 30
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 39
    .line 40
    iget-object v4, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 41
    .line 42
    invoke-virtual {v3, v2, v4}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v4, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 49
    .line 50
    iget-object v4, v4, Lax/P0/N$c;->c:Lax/P0/y;

    .line 51
    .line 52
    move-object v5, v4

    .line 53
    move-object v4, v1

    .line 54
    move-object v1, v3

    .line 55
    move-object v3, v5

    .line 56
    move v5, v0

    .line 57
    goto :goto_3e

    .line 58
    :cond_39
    const/4 v1, 0x0

    .line 59
    const/4 v0, -0x1

    .line 60
    move-object v3, v1

    .line 61
    move-object v4, v3

    .line 62
    const/4 v5, -0x1

    .line 63
    :goto_3e
    invoke-static {p1, p2}, Lax/S0/d0;->E1(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    new-instance v0, Lax/P0/H$e;

    .line 68
    .line 69
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 70
    .line 71
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 72
    .line 73
    invoke-virtual {p1}, Lax/i1/F$b;->b()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_5a

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/media3/exoplayer/X;->g2(Landroidx/media3/exoplayer/J0;)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    invoke-static {p1, p2}, Lax/S0/d0;->E1(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    move-wide v8, p1

    .line 90
    goto :goto_5b

    .line 91
    :cond_5a
    move-wide v8, v6

    .line 92
    :goto_5b
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 93
    .line 94
    iget-object p1, p1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 95
    .line 96
    iget v10, p1, Lax/i1/F$b;->b:I

    .line 97
    .line 98
    iget v11, p1, Lax/i1/F$b;->c:I

    .line 99
    .line 100
    invoke-direct/range {v0 .. v11}, Lax/P0/H$e;-><init>(Ljava/lang/Object;ILax/P0/y;Ljava/lang/Object;IJJII)V

    .line 101
    .line 102
    .line 103
    return-object v0
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

.method public static synthetic f1(Lax/P0/H$d;)V
    .registers 3

    .line 1
    new-instance v0, Lax/Y0/N;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lax/Y0/N;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0x3eb

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/s;->f(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Lax/P0/H$d;->N(Lax/P0/F;)V

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

.method private f2(ILandroidx/media3/exoplayer/J0;I)Lax/P0/H$e;
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lax/P0/N$b;

    .line 6
    .line 7
    invoke-direct {v2}, Lax/P0/N$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 11
    .line 12
    invoke-virtual {v3}, Lax/P0/N;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-nez v3, :cond_36

    .line 18
    .line 19
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 20
    .line 21
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v5, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 24
    .line 25
    invoke-virtual {v5, v3, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 26
    .line 27
    .line 28
    iget v5, v2, Lax/P0/N$b;->c:I

    .line 29
    .line 30
    iget-object v6, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 31
    .line 32
    invoke-virtual {v6, v3}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v7, v1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 37
    .line 38
    iget-object v8, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 39
    .line 40
    invoke-virtual {v7, v5, v8}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v7, v7, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v8, v0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 47
    .line 48
    iget-object v8, v8, Lax/P0/N$c;->c:Lax/P0/y;

    .line 49
    .line 50
    move-object v9, v3

    .line 51
    move v10, v6

    .line 52
    move-object v6, v7

    .line 53
    move v7, v5

    .line 54
    goto :goto_3d

    .line 55
    :cond_36
    const/4 v3, 0x0

    .line 56
    move/from16 v7, p3

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    move-object v8, v6

    .line 60
    move-object v9, v8

    .line 61
    const/4 v10, -0x1

    .line 62
    :goto_3d
    if-nez p1, :cond_6e

    .line 63
    .line 64
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 65
    .line 66
    invoke-virtual {v3}, Lax/i1/F$b;->b()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_56

    .line 71
    .line 72
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 73
    .line 74
    iget v4, v3, Lax/i1/F$b;->b:I

    .line 75
    .line 76
    iget v3, v3, Lax/i1/F$b;->c:I

    .line 77
    .line 78
    invoke-virtual {v2, v4, v3}, Lax/P0/N$b;->b(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v1}, Landroidx/media3/exoplayer/X;->g2(Landroidx/media3/exoplayer/J0;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_83

    .line 87
    :cond_56
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 88
    .line 89
    iget v3, v3, Lax/i1/F$b;->e:I

    .line 90
    .line 91
    if-eq v3, v4, :cond_64

    .line 92
    .line 93
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 94
    .line 95
    invoke-static {v2}, Landroidx/media3/exoplayer/X;->g2(Landroidx/media3/exoplayer/J0;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    :goto_62
    move-wide v4, v2

    .line 100
    goto :goto_83

    .line 101
    :cond_64
    iget-wide v3, v2, Lax/P0/N$b;->e:J

    .line 102
    .line 103
    iget-wide v11, v2, Lax/P0/N$b;->d:J

    .line 104
    .line 105
    add-long/2addr v3, v11

    .line 106
    move-wide/from16 v17, v3

    .line 107
    .line 108
    move-wide/from16 v2, v17

    .line 109
    .line 110
    goto :goto_62

    .line 111
    :cond_6e
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 112
    .line 113
    invoke-virtual {v3}, Lax/i1/F$b;->b()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_7d

    .line 118
    .line 119
    iget-wide v2, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 120
    .line 121
    invoke-static {v1}, Landroidx/media3/exoplayer/X;->g2(Landroidx/media3/exoplayer/J0;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v4

    .line 125
    goto :goto_83

    .line 126
    :cond_7d
    iget-wide v2, v2, Lax/P0/N$b;->e:J

    .line 127
    .line 128
    iget-wide v4, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 129
    .line 130
    add-long/2addr v2, v4

    .line 131
    goto :goto_62

    .line 132
    :goto_83
    new-instance v11, Lax/P0/H$e;

    .line 133
    .line 134
    invoke-static {v2, v3}, Lax/S0/d0;->E1(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v2

    .line 138
    invoke-static {v4, v5}, Lax/S0/d0;->E1(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v13

    .line 142
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 143
    .line 144
    iget v15, v1, Lax/i1/F$b;->b:I

    .line 145
    .line 146
    iget v1, v1, Lax/i1/F$b;->c:I

    .line 147
    .line 148
    move/from16 v16, v1

    .line 149
    .line 150
    move-object v5, v11

    .line 151
    move-wide v11, v2

    .line 152
    invoke-direct/range {v5 .. v16}, Lax/P0/H$e;-><init>(Ljava/lang/Object;ILax/P0/y;Ljava/lang/Object;IJJII)V

    .line 153
    .line 154
    .line 155
    return-object v5
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

.method public static synthetic g1(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/n0$e;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->j:Lax/S0/q;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/J;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Landroidx/media3/exoplayer/J;-><init>(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/n0$e;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

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

.method private static g2(Landroidx/media3/exoplayer/J0;)J
    .registers 8

    .line 1
    new-instance v0, Lax/P0/N$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/N$c;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/P0/N$b;

    .line 7
    .line 8
    invoke-direct {v1}, Lax/P0/N$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 14
    .line 15
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Landroidx/media3/exoplayer/J0;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v6, v2, v4

    .line 28
    .line 29
    if-nez v6, :cond_2b

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 32
    .line 33
    iget v1, v1, Lax/P0/N$b;->c:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lax/P0/N$c;->c()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0

    .line 44
    :cond_2b
    invoke-virtual {v1}, Lax/P0/N$b;->o()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iget-wide v2, p0, Landroidx/media3/exoplayer/J0;->c:J

    .line 49
    .line 50
    add-long/2addr v0, v2

    .line 51
    return-wide v0
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

.method public static synthetic h1(Landroidx/media3/exoplayer/X;II)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/X;->o2(II)V

    return-void
.end method

.method private h2(Landroidx/media3/exoplayer/n0$e;)V
    .registers 14

    .line 1
    iget v2, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 2
    .line 3
    iget v3, p1, Landroidx/media3/exoplayer/n0$e;->c:I

    .line 4
    .line 5
    sub-int/2addr v2, v3

    .line 6
    iput v2, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 7
    .line 8
    iget-boolean v3, p1, Landroidx/media3/exoplayer/n0$e;->d:Z

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v3, :cond_12

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/n0$e;->e:I

    .line 14
    .line 15
    iput v3, p0, Landroidx/media3/exoplayer/X;->L:I

    .line 16
    .line 17
    iput-boolean v4, p0, Landroidx/media3/exoplayer/X;->M:Z

    .line 18
    .line 19
    :cond_12
    if-nez v2, :cond_c6

    .line 20
    .line 21
    iget-object v2, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 26
    .line 27
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 28
    .line 29
    invoke-virtual {v3}, Lax/P0/N;->q()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v5, 0x0

    .line 34
    if-nez v3, :cond_32

    .line 35
    .line 36
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_32

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    iput v3, p0, Landroidx/media3/exoplayer/X;->y0:I

    .line 44
    .line 45
    const-wide/16 v6, 0x0

    .line 46
    .line 47
    iput-wide v6, p0, Landroidx/media3/exoplayer/X;->A0:J

    .line 48
    .line 49
    iput v5, p0, Landroidx/media3/exoplayer/X;->z0:I

    .line 50
    .line 51
    :cond_32
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_6c

    .line 56
    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Landroidx/media3/exoplayer/L0;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroidx/media3/exoplayer/L0;->F()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget-object v7, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ne v6, v7, :cond_4d

    .line 75
    .line 76
    const/4 v6, 0x1

    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    const/4 v6, 0x0

    .line 79
    :goto_4e
    invoke-static {v6}, Lax/S0/a;->g(Z)V

    .line 80
    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    :goto_52
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-ge v6, v7, :cond_6c

    .line 88
    .line 89
    iget-object v7, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Landroidx/media3/exoplayer/X$e;

    .line 96
    .line 97
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lax/P0/N;

    .line 102
    .line 103
    invoke-virtual {v7, v8}, Landroidx/media3/exoplayer/X$e;->a(Lax/P0/N;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_52

    .line 109
    :cond_6c
    iget-boolean v3, p0, Landroidx/media3/exoplayer/X;->M:Z

    .line 110
    .line 111
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_b7

    .line 117
    .line 118
    iget-object v3, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 119
    .line 120
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 121
    .line 122
    iget-object v8, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 123
    .line 124
    iget-object v8, v8, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 125
    .line 126
    invoke-virtual {v3, v8}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_91

    .line 131
    .line 132
    iget-object v3, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 133
    .line 134
    iget-wide v8, v3, Landroidx/media3/exoplayer/J0;->d:J

    .line 135
    .line 136
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 137
    .line 138
    iget-wide v10, v3, Landroidx/media3/exoplayer/J0;->s:J

    .line 139
    .line 140
    cmp-long v3, v8, v10

    .line 141
    .line 142
    if-eqz v3, :cond_90

    .line 143
    .line 144
    goto :goto_91

    .line 145
    :cond_90
    const/4 v4, 0x0

    .line 146
    :cond_91
    :goto_91
    if-eqz v4, :cond_b5

    .line 147
    .line 148
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_b0

    .line 153
    .line 154
    iget-object v3, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 155
    .line 156
    iget-object v3, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 157
    .line 158
    invoke-virtual {v3}, Lax/i1/F$b;->b()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_a4

    .line 163
    .line 164
    goto :goto_b0

    .line 165
    :cond_a4
    iget-object v3, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 166
    .line 167
    iget-object v6, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 168
    .line 169
    iget-wide v7, v3, Landroidx/media3/exoplayer/J0;->d:J

    .line 170
    .line 171
    invoke-direct {p0, v2, v6, v7, v8}, Landroidx/media3/exoplayer/X;->q2(Lax/P0/N;Lax/i1/F$b;J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    :goto_ae
    move-wide v6, v2

    .line 176
    goto :goto_b5

    .line 177
    :cond_b0
    :goto_b0
    iget-object v2, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 178
    .line 179
    iget-wide v2, v2, Landroidx/media3/exoplayer/J0;->d:J

    .line 180
    .line 181
    goto :goto_ae

    .line 182
    :cond_b5
    :goto_b5
    move v3, v4

    .line 183
    goto :goto_b8

    .line 184
    :cond_b7
    const/4 v3, 0x0

    .line 185
    :goto_b8
    iput-boolean v5, p0, Landroidx/media3/exoplayer/X;->M:Z

    .line 186
    .line 187
    iget-object v1, p1, Landroidx/media3/exoplayer/n0$e;->b:Landroidx/media3/exoplayer/J0;

    .line 188
    .line 189
    iget v4, p0, Landroidx/media3/exoplayer/X;->L:I

    .line 190
    .line 191
    move-wide v5, v6

    .line 192
    const/4 v7, -0x1

    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v2, 0x1

    .line 195
    move-object v0, p0

    .line 196
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 197
    .line 198
    .line 199
    :cond_c6
    return-void
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

.method public static synthetic i1(Landroidx/media3/exoplayer/J0;ILax/P0/H$d;)V
    .registers 3

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 2
    .line 3
    invoke-interface {p2, p0, p1}, Lax/P0/H$d;->P(Lax/P0/N;I)V

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

.method public static synthetic j1(Landroidx/media3/exoplayer/J0;Lax/P0/H$d;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lax/P0/H$d;->J(Lax/P0/F;)V

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

.method private static j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/J0;->h(I)Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_c

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_b

    .line 10
    .line 11
    goto :goto_c

    .line 12
    :cond_b
    return-object p0

    .line 13
    :cond_c
    :goto_c
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/J0;->b(Z)Landroidx/media3/exoplayer/J0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method static synthetic k1(Landroidx/media3/exoplayer/X;Lax/P0/v;)Lax/P0/v;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->Y:Lax/P0/v;

    .line 2
    .line 3
    return-object p1
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

.method private k2(Landroidx/media3/exoplayer/J0;Lax/P0/N;Landroid/util/Pair;)Landroidx/media3/exoplayer/J0;
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/J0;",
            "Lax/P0/N;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Landroidx/media3/exoplayer/J0;"
        }
    .end annotation

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
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-nez v3, :cond_12

    .line 13
    .line 14
    if-eqz v2, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const/4 v3, 0x0

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    :goto_12
    const/4 v3, 0x1

    .line 20
    :goto_13
    invoke-static {v3}, Lax/S0/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v5, v3, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 26
    .line 27
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/X;->Y1(Landroidx/media3/exoplayer/J0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual/range {p1 .. p2}, Landroidx/media3/exoplayer/J0;->j(Lax/P0/N;)Landroidx/media3/exoplayer/J0;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_4d

    .line 40
    .line 41
    invoke-static {}, Landroidx/media3/exoplayer/J0;->l()Lax/i1/F$b;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-wide v1, v0, Landroidx/media3/exoplayer/X;->A0:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Lax/S0/d0;->a1(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    sget-object v18, Lax/i1/q0;->d:Lax/i1/q0;

    .line 52
    .line 53
    iget-object v1, v0, Landroidx/media3/exoplayer/X;->b:Lax/l1/K;

    .line 54
    .line 55
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 56
    .line 57
    .line 58
    move-result-object v20

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    move-wide v12, v10

    .line 62
    move-wide v14, v10

    .line 63
    move-object/from16 v19, v1

    .line 64
    .line 65
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/J0;->d(Lax/i1/F$b;JJJJLax/i1/q0;Lax/l1/K;Ljava/util/List;)Landroidx/media3/exoplayer/J0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-wide v2, v1, Landroidx/media3/exoplayer/J0;->s:J

    .line 74
    .line 75
    iput-wide v2, v1, Landroidx/media3/exoplayer/J0;->q:J

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_4d
    iget-object v3, v8, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 79
    .line 80
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {v2}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, Landroid/util/Pair;

    .line 87
    .line 88
    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_67

    .line 95
    .line 96
    new-instance v10, Lax/i1/F$b;

    .line 97
    .line 98
    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-direct {v10, v11}, Lax/i1/F$b;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_69

    .line 104
    :cond_67
    iget-object v10, v8, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 105
    .line 106
    :goto_69
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/lang/Long;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v11

    .line 114
    invoke-static {v6, v7}, Lax/S0/d0;->a1(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    invoke-virtual {v5}, Lax/P0/N;->q()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_86

    .line 123
    .line 124
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 125
    .line 126
    invoke-virtual {v5, v3, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Lax/P0/N$b;->o()J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    sub-long/2addr v6, v2

    .line 135
    :cond_86
    if-eqz v9, :cond_8c

    .line 136
    .line 137
    cmp-long v2, v11, v6

    .line 138
    .line 139
    if-gez v2, :cond_91

    .line 140
    .line 141
    :cond_8c
    move v1, v9

    .line 142
    move-object v9, v10

    .line 143
    move-wide v10, v11

    .line 144
    goto/16 :goto_12b

    .line 145
    .line 146
    :cond_91
    if-nez v2, :cond_f3

    .line 147
    .line 148
    iget-object v2, v8, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 149
    .line 150
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    const/4 v3, -0x1

    .line 157
    if-eq v2, v3, :cond_b4

    .line 158
    .line 159
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 160
    .line 161
    invoke-virtual {v1, v2, v3}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget v2, v2, Lax/P0/N$b;->c:I

    .line 166
    .line 167
    iget-object v3, v10, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v4, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 170
    .line 171
    invoke-virtual {v1, v3, v4}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget v3, v3, Lax/P0/N$b;->c:I

    .line 176
    .line 177
    if-eq v2, v3, :cond_b3

    .line 178
    .line 179
    goto :goto_b4

    .line 180
    :cond_b3
    return-object v8

    .line 181
    :cond_b4
    :goto_b4
    iget-object v2, v10, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 182
    .line 183
    iget-object v3, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 184
    .line 185
    invoke-virtual {v1, v2, v3}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10}, Lax/i1/F$b;->b()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_cd

    .line 193
    .line 194
    iget-object v1, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 195
    .line 196
    iget v2, v10, Lax/i1/F$b;->b:I

    .line 197
    .line 198
    iget v3, v10, Lax/i1/F$b;->c:I

    .line 199
    .line 200
    invoke-virtual {v1, v2, v3}, Lax/P0/N$b;->b(II)J

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    :goto_cb
    move-object v9, v10

    .line 205
    goto :goto_d2

    .line 206
    :cond_cd
    iget-object v1, v0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 207
    .line 208
    iget-wide v1, v1, Lax/P0/N$b;->d:J

    .line 209
    .line 210
    goto :goto_cb

    .line 211
    :goto_d2
    iget-wide v10, v8, Landroidx/media3/exoplayer/J0;->s:J

    .line 212
    .line 213
    iget-wide v12, v8, Landroidx/media3/exoplayer/J0;->s:J

    .line 214
    .line 215
    iget-wide v14, v8, Landroidx/media3/exoplayer/J0;->d:J

    .line 216
    .line 217
    iget-wide v3, v8, Landroidx/media3/exoplayer/J0;->s:J

    .line 218
    .line 219
    sub-long v16, v1, v3

    .line 220
    .line 221
    iget-object v3, v8, Landroidx/media3/exoplayer/J0;->h:Lax/i1/q0;

    .line 222
    .line 223
    iget-object v4, v8, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 224
    .line 225
    iget-object v5, v8, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 226
    .line 227
    move-object/from16 v18, v3

    .line 228
    .line 229
    move-object/from16 v19, v4

    .line 230
    .line 231
    move-object/from16 v20, v5

    .line 232
    .line 233
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/J0;->d(Lax/i1/F$b;JJJJLax/i1/q0;Lax/l1/K;Ljava/util/List;)Landroidx/media3/exoplayer/J0;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3, v9}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iput-wide v1, v3, Landroidx/media3/exoplayer/J0;->q:J

    .line 242
    .line 243
    return-object v3

    .line 244
    :cond_f3
    move-object v9, v10

    .line 245
    invoke-virtual {v9}, Lax/i1/F$b;->b()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    xor-int/2addr v1, v4

    .line 250
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 251
    .line 252
    .line 253
    iget-wide v1, v8, Landroidx/media3/exoplayer/J0;->r:J

    .line 254
    .line 255
    sub-long v3, v11, v6

    .line 256
    .line 257
    sub-long/2addr v1, v3

    .line 258
    const-wide/16 v3, 0x0

    .line 259
    .line 260
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v16

    .line 264
    iget-wide v1, v8, Landroidx/media3/exoplayer/J0;->q:J

    .line 265
    .line 266
    iget-object v3, v8, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 267
    .line 268
    iget-object v4, v8, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 269
    .line 270
    invoke-virtual {v3, v4}, Lax/i1/F$b;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_115

    .line 275
    .line 276
    add-long v1, v11, v16

    .line 277
    .line 278
    :cond_115
    iget-object v3, v8, Landroidx/media3/exoplayer/J0;->h:Lax/i1/q0;

    .line 279
    .line 280
    iget-object v4, v8, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 281
    .line 282
    iget-object v5, v8, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 283
    .line 284
    move-wide v10, v11

    .line 285
    move-wide v12, v10

    .line 286
    move-wide v14, v10

    .line 287
    move-object/from16 v18, v3

    .line 288
    .line 289
    move-object/from16 v19, v4

    .line 290
    .line 291
    move-object/from16 v20, v5

    .line 292
    .line 293
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/J0;->d(Lax/i1/F$b;JJJJLax/i1/q0;Lax/l1/K;Ljava/util/List;)Landroidx/media3/exoplayer/J0;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    iput-wide v1, v3, Landroidx/media3/exoplayer/J0;->q:J

    .line 298
    .line 299
    return-object v3

    .line 300
    :goto_12b
    invoke-virtual {v9}, Lax/i1/F$b;->b()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    xor-int/2addr v2, v4

    .line 305
    invoke-static {v2}, Lax/S0/a;->g(Z)V

    .line 306
    .line 307
    .line 308
    if-nez v1, :cond_13a

    .line 309
    .line 310
    sget-object v2, Lax/i1/q0;->d:Lax/i1/q0;

    .line 311
    .line 312
    :goto_137
    move-object/from16 v18, v2

    .line 313
    .line 314
    goto :goto_13d

    .line 315
    :cond_13a
    iget-object v2, v8, Landroidx/media3/exoplayer/J0;->h:Lax/i1/q0;

    .line 316
    .line 317
    goto :goto_137

    .line 318
    :goto_13d
    if-nez v1, :cond_144

    .line 319
    .line 320
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->b:Lax/l1/K;

    .line 321
    .line 322
    :goto_141
    move-object/from16 v19, v2

    .line 323
    .line 324
    goto :goto_147

    .line 325
    :cond_144
    iget-object v2, v8, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 326
    .line 327
    goto :goto_141

    .line 328
    :goto_147
    if-nez v1, :cond_150

    .line 329
    .line 330
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    :goto_14d
    move-object/from16 v20, v1

    .line 335
    .line 336
    goto :goto_153

    .line 337
    :cond_150
    iget-object v1, v8, Landroidx/media3/exoplayer/J0;->j:Ljava/util/List;

    .line 338
    .line 339
    goto :goto_14d

    .line 340
    :goto_153
    const-wide/16 v16, 0x0

    .line 341
    .line 342
    move-wide v12, v10

    .line 343
    move-wide v14, v10

    .line 344
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/J0;->d(Lax/i1/F$b;JJJJLax/i1/q0;Lax/l1/K;Ljava/util/List;)Landroidx/media3/exoplayer/J0;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-wide v10, v1, Landroidx/media3/exoplayer/J0;->q:J

    .line 353
    .line 354
    return-object v1
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

.method static synthetic l1(Landroidx/media3/exoplayer/X;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/X;->m0:Z

    .line 2
    .line 3
    return p0
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

.method private l2(Lax/P0/N;IJ)Landroid/util/Pair;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/N;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/P0/N;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/exoplayer/X;->y0:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p3, p1

    .line 15
    .line 16
    if-nez v0, :cond_13

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_13
    iput-wide p3, p0, Landroidx/media3/exoplayer/X;->A0:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Landroidx/media3/exoplayer/X;->z0:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1a
    const/4 v0, -0x1

    .line 28
    if-eq p2, v0, :cond_26

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/P0/N;->p()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lt p2, v0, :cond_24

    .line 35
    .line 36
    goto :goto_26

    .line 37
    :cond_24
    :goto_24
    move v3, p2

    .line 38
    goto :goto_37

    .line 39
    :cond_26
    :goto_26
    iget-boolean p2, p0, Landroidx/media3/exoplayer/X;->J:Z

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lax/P0/N;->a(Z)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object p3, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, Lax/P0/N$c;->b()J

    .line 52
    .line 53
    .line 54
    move-result-wide p3

    .line 55
    goto :goto_24

    .line 56
    :goto_37
    iget-object v1, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 59
    .line 60
    invoke-static {p3, p4}, Lax/S0/d0;->a1(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    move-object v0, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Lax/P0/N;->j(Lax/P0/N$c;Lax/P0/N$b;IJ)Landroid/util/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
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

.method static synthetic m1(Landroidx/media3/exoplayer/X;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/X;->m0:Z

    .line 2
    .line 3
    return p1
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

.method private m2(II)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->h0:Lax/S0/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/I;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_12

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->h0:Lax/S0/I;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/S0/I;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq p2, v0, :cond_11

    .line 16
    .line 17
    goto :goto_12

    .line 18
    :cond_11
    return-void

    .line 19
    :cond_12
    :goto_12
    new-instance v0, Lax/S0/I;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2}, Lax/S0/I;-><init>(II)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->h0:Lax/S0/I;

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 27
    .line 28
    new-instance v1, Landroidx/media3/exoplayer/z;

    .line 29
    .line 30
    invoke-direct {v1, p1, p2}, Landroidx/media3/exoplayer/z;-><init>(II)V

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x18

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lax/S0/t;->k(ILax/S0/t$a;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lax/S0/I;

    .line 39
    .line 40
    invoke-direct {v0, p1, p2}, Lax/S0/I;-><init>(II)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    const/16 p2, 0xe

    .line 45
    .line 46
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

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

.method static synthetic n1(Landroidx/media3/exoplayer/X;)Lax/S0/f;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->H:Lax/S0/f;

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

.method private n2()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 4
    .line 5
    iget v0, v0, Landroidx/media3/exoplayer/J0;->m:I

    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/X;->E2(ZI)V

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
.end method

.method static synthetic o1(Landroidx/media3/exoplayer/X;Lax/R0/c;)Lax/R0/c;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->n0:Lax/R0/c;

    .line 2
    .line 3
    return-object p1
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

.method private o2(II)V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x1

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 23
    .line 24
    new-instance v0, Landroidx/media3/exoplayer/N;

    .line 25
    .line 26
    invoke-direct {v0, p2}, Landroidx/media3/exoplayer/N;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x15

    .line 30
    .line 31
    invoke-virtual {p1, p2, v0}, Lax/S0/t;->k(ILax/S0/t$a;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic p1(Landroidx/media3/exoplayer/X;)Lax/P0/A;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

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

.method private p2(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->t0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_11

    .line 6
    :cond_5
    if-eqz p1, :cond_12

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 9
    .line 10
    iget p1, p1, Landroidx/media3/exoplayer/J0;->n:I

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-ne p1, v0, :cond_11

    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->n2()V

    .line 16
    .line 17
    .line 18
    :cond_11
    :goto_11
    return-void

    .line 19
    :cond_12
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->n2()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method static synthetic q1(Landroidx/media3/exoplayer/X;Lax/P0/A;)Lax/P0/A;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->w0:Lax/P0/A;

    .line 2
    .line 3
    return-object p1
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

.method private q2(Lax/P0/N;Lax/i1/F$b;J)J
    .registers 6

    .line 1
    iget-object p2, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 9
    .line 10
    invoke-virtual {p1}, Lax/P0/N$b;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    add-long/2addr p3, p1

    .line 15
    return-wide p3
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

.method static synthetic r1(Landroidx/media3/exoplayer/X;)Lax/P0/A;
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->O1()Lax/P0/A;

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

.method private r2(Landroidx/media3/exoplayer/J0;II)Landroidx/media3/exoplayer/J0;
    .registers 12

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->a2(Landroidx/media3/exoplayer/J0;)I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->Y1(Landroidx/media3/exoplayer/J0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    iget-object v1, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    add-int/2addr v0, v7

    .line 21
    iput v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/X;->s2(II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->T1()Lax/P0/N;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/X;->b2(Lax/P0/N;Lax/P0/N;IJ)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0, p1, v2, v1}, Landroidx/media3/exoplayer/X;->k2(Landroidx/media3/exoplayer/J0;Lax/P0/N;Landroid/util/Pair;)Landroidx/media3/exoplayer/J0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget v1, p1, Landroidx/media3/exoplayer/J0;->e:I

    .line 40
    .line 41
    if-eq v1, v7, :cond_3d

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    if-eq v1, v2, :cond_3d

    .line 45
    .line 46
    if-ge p2, p3, :cond_3d

    .line 47
    .line 48
    if-ne p3, v6, :cond_3d

    .line 49
    .line 50
    iget-object v1, p1, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 51
    .line 52
    invoke-virtual {v1}, Lax/P0/N;->p()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lt v3, v1, :cond_3d

    .line 57
    .line 58
    invoke-static {p1, v2}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_3d
    iget-object v1, v0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 63
    .line 64
    iget-object v2, v0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 65
    .line 66
    invoke-virtual {v1, p2, p3, v2}, Landroidx/media3/exoplayer/n0;->N0(IILax/i1/g0;)V

    .line 67
    .line 68
    .line 69
    return-object p1
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

.method static synthetic s1(Landroidx/media3/exoplayer/X;)Lax/P0/A;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

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

.method private s2(II)V
    .registers 5

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_2
    if-lt v0, p1, :cond_c

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_c
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lax/i1/g0;->a(II)Lax/i1/g0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

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
.end method

.method static synthetic t1(Landroidx/media3/exoplayer/X;Lax/P0/A;)Lax/P0/A;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 2
    .line 3
    return-object p1
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

.method private t2()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_21

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->A:Landroidx/media3/exoplayer/X$d;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->V1(Landroidx/media3/exoplayer/K0$b;)Landroidx/media3/exoplayer/K0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v2, 0x2710

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/K0;->m(I)Landroidx/media3/exoplayer/K0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/media3/exoplayer/K0;->k()Landroidx/media3/exoplayer/K0;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lax/p1/l;->g(Lax/p1/l$b;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 33
    .line 34
    :cond_21
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->e0:Landroid/view/TextureView;

    .line 35
    .line 36
    if-eqz v0, :cond_3c

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 43
    .line 44
    if-eq v0, v2, :cond_35

    .line 45
    .line 46
    const-string v0, "ExoPlayerImpl"

    .line 47
    .line 48
    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 49
    .line 50
    invoke-static {v0, v2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3a

    .line 54
    :cond_35
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->e0:Landroid/view/TextureView;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 57
    .line 58
    .line 59
    :goto_3a
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->e0:Landroid/view/TextureView;

    .line 60
    .line 61
    :cond_3c
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 62
    .line 63
    if-eqz v0, :cond_47

    .line 64
    .line 65
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 66
    .line 67
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

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

.method static synthetic u1(Landroidx/media3/exoplayer/X;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/X;->d0:Z

    .line 2
    .line 3
    return p0
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

.method private u2(IILjava/lang/Object;)V
    .registers 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->g:[Landroidx/media3/exoplayer/M0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_5
    const/4 v4, -0x1

    .line 7
    if-ge v3, v1, :cond_24

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-eq p1, v4, :cond_12

    .line 12
    .line 13
    invoke-interface {v5}, Landroidx/media3/exoplayer/M0;->k()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ne v4, p1, :cond_21

    .line 18
    .line 19
    :cond_12
    invoke-direct {p0, v5}, Landroidx/media3/exoplayer/X;->V1(Landroidx/media3/exoplayer/K0$b;)Landroidx/media3/exoplayer/K0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4, p2}, Landroidx/media3/exoplayer/K0;->m(I)Landroidx/media3/exoplayer/K0;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, p3}, Landroidx/media3/exoplayer/K0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/K0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Landroidx/media3/exoplayer/K0;->k()Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    .line 34
    :cond_21
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_5

    .line 37
    :cond_24
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->h:[Landroidx/media3/exoplayer/M0;

    .line 38
    .line 39
    array-length v1, v0

    .line 40
    :goto_27
    if-ge v2, v1, :cond_47

    .line 41
    .line 42
    aget-object v3, v0, v2

    .line 43
    .line 44
    if-eqz v3, :cond_44

    .line 45
    .line 46
    if-eq p1, v4, :cond_35

    .line 47
    .line 48
    invoke-interface {v3}, Landroidx/media3/exoplayer/M0;->k()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-ne v5, p1, :cond_44

    .line 53
    .line 54
    :cond_35
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/X;->V1(Landroidx/media3/exoplayer/K0$b;)Landroidx/media3/exoplayer/K0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, p2}, Landroidx/media3/exoplayer/K0;->m(I)Landroidx/media3/exoplayer/K0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3, p3}, Landroidx/media3/exoplayer/K0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/K0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Landroidx/media3/exoplayer/K0;->k()Landroidx/media3/exoplayer/K0;

    .line 67
    .line 68
    .line 69
    :cond_44
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_27

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
.end method

.method static synthetic v1(Landroidx/media3/exoplayer/X;Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

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

.method private v2(ILjava/lang/Object;)V
    .registers 4

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method static synthetic w1(Landroidx/media3/exoplayer/X;II)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/X;->m2(II)V

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
.end method

.method static synthetic x1(Landroidx/media3/exoplayer/X;Landroid/graphics/SurfaceTexture;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->z2(Landroid/graphics/SurfaceTexture;)V

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

.method private x2(Ljava/util/List;IJZ)V
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/i1/F;",
            ">;IJZ)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 4
    .line 5
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/X;->a2(Landroidx/media3/exoplayer/J0;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->s0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 18
    .line 19
    iget-object v5, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v7, 0x0

    .line 26
    if-nez v5, :cond_24

    .line 27
    .line 28
    iget-object v5, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-direct {p0, v7, v5}, Landroidx/media3/exoplayer/X;->s2(II)V

    .line 35
    .line 36
    .line 37
    :cond_24
    invoke-direct {p0, v7, p1}, Landroidx/media3/exoplayer/X;->N1(ILjava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->T1()Lax/P0/N;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Lax/P0/N;->q()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_38

    .line 50
    .line 51
    invoke-virtual {v5}, Lax/P0/N;->p()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-ge v1, v8, :cond_3b

    .line 56
    .line 57
    :cond_38
    move-wide/from16 v10, p3

    .line 58
    .line 59
    goto :goto_43

    .line 60
    :cond_3b
    new-instance v2, Lax/P0/w;

    .line 61
    .line 62
    move-wide/from16 v10, p3

    .line 63
    .line 64
    invoke-direct {v2, v5, v1, v10, v11}, Lax/P0/w;-><init>(Lax/P0/N;IJ)V

    .line 65
    .line 66
    .line 67
    throw v2

    .line 68
    :goto_43
    const/4 v8, -0x1

    .line 69
    if-eqz p5, :cond_53

    .line 70
    .line 71
    iget-boolean v1, p0, Landroidx/media3/exoplayer/X;->J:Z

    .line 72
    .line 73
    invoke-virtual {v5, v1}, Lax/P0/N;->a(Z)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :goto_51
    move v10, v1

    .line 83
    goto :goto_5a

    .line 84
    :cond_53
    if-ne v1, v8, :cond_58

    .line 85
    .line 86
    move v10, v2

    .line 87
    move-wide v2, v3

    .line 88
    goto :goto_5a

    .line 89
    :cond_58
    move-wide v2, v10

    .line 90
    goto :goto_51

    .line 91
    :goto_5a
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 92
    .line 93
    invoke-direct {p0, v5, v10, v2, v3}, Landroidx/media3/exoplayer/X;->l2(Lax/P0/N;IJ)Landroid/util/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-direct {p0, v1, v5, v4}, Landroidx/media3/exoplayer/X;->k2(Landroidx/media3/exoplayer/J0;Lax/P0/N;Landroid/util/Pair;)Landroidx/media3/exoplayer/J0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget v4, v1, Landroidx/media3/exoplayer/J0;->e:I

    .line 102
    .line 103
    if-eq v10, v8, :cond_7a

    .line 104
    .line 105
    if-eq v4, v6, :cond_7a

    .line 106
    .line 107
    invoke-virtual {v5}, Lax/P0/N;->q()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-nez v4, :cond_79

    .line 112
    .line 113
    invoke-virtual {v5}, Lax/P0/N;->p()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lt v10, v4, :cond_77

    .line 118
    .line 119
    goto :goto_79

    .line 120
    :cond_77
    const/4 v4, 0x2

    .line 121
    goto :goto_7a

    .line 122
    :cond_79
    :goto_79
    const/4 v4, 0x4

    .line 123
    :cond_7a
    :goto_7a
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v8, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 128
    .line 129
    invoke-static {v2, v3}, Lax/S0/d0;->a1(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v11

    .line 133
    iget-object v13, p0, Landroidx/media3/exoplayer/X;->R:Lax/i1/g0;

    .line 134
    .line 135
    invoke-virtual/range {v8 .. v13}, Landroidx/media3/exoplayer/n0;->o1(Ljava/util/List;IJLax/i1/g0;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 139
    .line 140
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 141
    .line 142
    iget-object v2, v2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object v3, v1, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 145
    .line 146
    iget-object v3, v3, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_a5

    .line 153
    .line 154
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 155
    .line 156
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 157
    .line 158
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_a5

    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    goto :goto_a6

    .line 166
    :cond_a5
    const/4 v3, 0x0

    .line 167
    :goto_a6
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/X;->Z1(Landroidx/media3/exoplayer/J0;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v5

    .line 171
    const/4 v7, -0x1

    .line 172
    const/4 v8, 0x0

    .line 173
    const/4 v2, 0x0

    .line 174
    const/4 v4, 0x4

    .line 175
    move-object v0, p0

    .line 176
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 177
    .line 178
    .line 179
    return-void
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
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method static synthetic y1(Landroidx/media3/exoplayer/X;ZI)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/X;->E2(ZI)V

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
.end method

.method private y2(Landroid/view/SurfaceHolder;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/X;->d0:Z

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_2a

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2a

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/X;->m2(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/X;->m2(II)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method static synthetic z1(Landroidx/media3/exoplayer/X;)Landroidx/media3/exoplayer/V0;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/X;->C:Landroidx/media3/exoplayer/V0;

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

.method private z2(Landroid/graphics/SurfaceTexture;)V
    .registers 3

    .line 1
    new-instance v0, Landroid/view/Surface;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->a0:Landroid/view/Surface;

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
.end method


# virtual methods
.method public A()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/X;->x:J

    .line 5
    .line 6
    return-wide v0
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

.method protected A0(IJIZ)V
    .registers 16

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x1

    .line 5
    if-ne p1, p4, :cond_7

    .line 6
    .line 7
    goto :goto_20

    .line 8
    :cond_7
    const/4 p4, 0x1

    .line 9
    if-ltz p1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    :goto_d
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_21

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/P0/N;->p()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p1, v1, :cond_21

    .line 32
    .line 33
    :goto_20
    return-void

    .line 34
    :cond_21
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 35
    .line 36
    invoke-interface {v1}, Lax/Z0/a;->R()V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 40
    .line 41
    add-int/2addr v1, p4

    .line 42
    iput v1, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_48

    .line 49
    .line 50
    const-string p1, "ExoPlayerImpl"

    .line 51
    .line 52
    const-string p2, "seekTo ignored because an ad is playing"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroidx/media3/exoplayer/n0$e;

    .line 58
    .line 59
    iget-object p2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/n0$e;-><init>(Landroidx/media3/exoplayer/J0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4}, Landroidx/media3/exoplayer/n0$e;->b(I)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Landroidx/media3/exoplayer/X;->k:Landroidx/media3/exoplayer/n0$f;

    .line 68
    .line 69
    invoke-interface {p2, p1}, Landroidx/media3/exoplayer/n0$f;->a(Landroidx/media3/exoplayer/n0$e;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    iget-object p4, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 74
    .line 75
    iget v1, p4, Landroidx/media3/exoplayer/J0;->e:I

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    if-eq v1, v2, :cond_58

    .line 79
    .line 80
    const/4 v2, 0x4

    .line 81
    if-ne v1, v2, :cond_5f

    .line 82
    .line 83
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5f

    .line 88
    .line 89
    :cond_58
    iget-object p4, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-static {p4, v1}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    :cond_5f
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->b0()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/media3/exoplayer/X;->l2(Lax/P0/N;IJ)Landroid/util/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p0, p4, v0, v1}, Landroidx/media3/exoplayer/X;->k2(Landroidx/media3/exoplayer/J0;Lax/P0/N;Landroid/util/Pair;)Landroidx/media3/exoplayer/J0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object p4, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 109
    .line 110
    invoke-static {p2, p3}, Lax/S0/d0;->a1(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide p2

    .line 114
    invoke-virtual {p4, v0, p1, p2, p3}, Landroidx/media3/exoplayer/n0;->a1(Lax/P0/N;IJ)V

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/X;->Z1(Landroidx/media3/exoplayer/J0;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x1

    .line 124
    move-object v1, p0

    .line 125
    move v9, p5

    .line 126
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 127
    .line 128
    .line 129
    return-void
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

.method public B2(Landroid/view/SurfaceHolder;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_9

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->P1()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroidx/media3/exoplayer/X;->d0:Z

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_35

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_35

    .line 34
    .line 35
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/X;->m2(II)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    const/4 p1, 0x0

    .line 55
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/X;->m2(II)V

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
.end method

.method public D()I
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    iget v0, p0, Landroidx/media3/exoplayer/X;->z0:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 22
    .line 23
    iget-object v0, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

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

.method public E(Landroid/view/TextureView;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->e0:Landroid/view/TextureView;

    .line 7
    .line 8
    if-ne p1, v0, :cond_c

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->P1()V

    .line 11
    .line 12
    .line 13
    :cond_c
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

.method public F()Lax/P0/a0;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->v0:Lax/P0/a0;

    .line 5
    .line 6
    return-object v0
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

.method public G(Lax/P0/c;Z)V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->t0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2e

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->C:Landroidx/media3/exoplayer/V0;

    .line 25
    .line 26
    if-eqz v0, :cond_22

    .line 27
    .line 28
    invoke-virtual {p1}, Lax/P0/c;->b()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/V0;->o(I)V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 36
    .line 37
    new-instance v1, Landroidx/media3/exoplayer/K;

    .line 38
    .line 39
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/K;-><init>(Lax/P0/c;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x14

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->k0:Lax/P0/c;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p2}, Landroidx/media3/exoplayer/n0;->j1(Lax/P0/c;Z)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 55
    .line 56
    invoke-virtual {p1}, Lax/S0/t;->f()V

    .line 57
    .line 58
    .line 59
    return-void
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

.method public I(Ljava/util/List;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/y;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->U1(Ljava/util/List;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/X;->w2(Ljava/util/List;Z)V

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

.method public K()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 13
    .line 14
    iget v0, v0, Lax/i1/F$b;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, -0x1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public L(Landroid/view/SurfaceView;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lax/o1/y;

    .line 5
    .line 6
    if-eqz v0, :cond_15

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->y2(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    instance-of v0, p1, Lax/p1/l;

    .line 23
    .line 24
    if-eqz v0, :cond_4e

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 27
    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, Lax/p1/l;

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->A:Landroidx/media3/exoplayer/X$d;

    .line 35
    .line 36
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->V1(Landroidx/media3/exoplayer/K0$b;)Landroidx/media3/exoplayer/K0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x2710

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->m(I)Landroidx/media3/exoplayer/K0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/K0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/K0;->k()Landroidx/media3/exoplayer/K0;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lax/p1/l;->d(Lax/p1/l$b;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->c0:Lax/p1/l;

    .line 63
    .line 64
    invoke-virtual {v0}, Lax/p1/l;->getVideoSurface()Landroid/view/Surface;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/X;->y2(Landroid/view/SurfaceHolder;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    if-nez p1, :cond_52

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    goto :goto_56

    .line 83
    :cond_52
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_56
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/X;->B2(Landroid/view/SurfaceHolder;)V

    .line 88
    .line 89
    .line 90
    return-void
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

.method public L1(Landroidx/media3/exoplayer/ExoPlayer$a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

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

.method public M()Lax/S0/I;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->h0:Lax/S0/I;

    .line 5
    .line 6
    return-object v0
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

.method public N(Lax/P0/H$d;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 2
    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/P0/H$d;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lax/S0/t;->c(Ljava/lang/Object;)V

    .line 10
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
    .line 22
.end method

.method public O(II)V
    .registers 14

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_a

    .line 6
    .line 7
    if-lt p2, p1, :cond_a

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v1, 0x0

    .line 12
    :goto_b
    invoke-static {v1}, Lax/S0/a;->a(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->p:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v1, :cond_3f

    .line 26
    .line 27
    if-ne p1, p2, :cond_1d

    .line 28
    .line 29
    goto :goto_3f

    .line 30
    :cond_1d
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 31
    .line 32
    invoke-direct {p0, v1, p1, p2}, Landroidx/media3/exoplayer/X;->r2(Landroidx/media3/exoplayer/J0;II)Landroidx/media3/exoplayer/J0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object p1, v3, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 37
    .line 38
    iget-object p1, p1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 41
    .line 42
    iget-object p2, p2, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 43
    .line 44
    iget-object p2, p2, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    xor-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/X;->Z1(Landroidx/media3/exoplayer/J0;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x4

    .line 60
    move-object v2, p0

    .line 61
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    :goto_3f
    return-void
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

.method public P1()V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/X;->m2(II)V

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
.end method

.method public Q1(Landroid/view/SurfaceHolder;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->b0:Landroid/view/SurfaceHolder;

    .line 7
    .line 8
    if-ne p1, v0, :cond_c

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->P1()V

    .line 11
    .line 12
    .line 13
    :cond_c
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

.method public bridge synthetic R()Lax/P0/F;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->d2()Landroidx/media3/exoplayer/s;

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

.method public S(Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/X;->E2(ZI)V

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
.end method

.method public T()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/X;->w:J

    .line 5
    .line 6
    return-wide v0
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

.method public V()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->Y1(Landroidx/media3/exoplayer/J0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public X()Lax/P0/V;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->i:Lax/l1/K;

    .line 7
    .line 8
    iget-object v0, v0, Lax/l1/K;->d:Lax/P0/V;

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

.method public X1()Lax/S0/h;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->y:Lax/S0/h;

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

.method public Z()Lax/R0/c;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->n0:Lax/R0/c;

    .line 5
    .line 6
    return-object v0
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

.method public a(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_23

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p1, v1, :cond_18

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/a1;->c(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/d1;->c(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/a1;->c(Z)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/d1;->c(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/a1;->c(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/d1;->c(Z)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public a0()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 13
    .line 14
    iget v0, v0, Lax/i1/F$b;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, -0x1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public b()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->H:Lax/S0/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/S0/f;->d()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b0()I
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->a2(Landroidx/media3/exoplayer/J0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_d

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_d
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c(Lax/Y0/Z;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_7

    .line 5
    .line 6
    sget-object p1, Lax/Y0/Z;->g:Lax/Y0/Z;

    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->Q:Lax/Y0/Z;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lax/Y0/Z;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_16

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->Q:Lax/Y0/Z;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->C1(Lax/Y0/Z;)V

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
.end method

.method public c2()Landroid/os/Looper;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/n0;->P()Landroid/os/Looper;

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

.method public d()V
    .registers 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Release "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " ["

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "AndroidXMedia3/1.8.1"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "] ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v2, Lax/S0/d0;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lax/P0/z;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "]"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ExoPlayerImpl"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->B:Landroidx/media3/exoplayer/d;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/d;->d(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->C:Landroidx/media3/exoplayer/V0;

    .line 76
    .line 77
    if-eqz v0, :cond_51

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/media3/exoplayer/V0;->n()V

    .line 80
    .line 81
    .line 82
    :cond_51
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->D:Landroidx/media3/exoplayer/a1;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/a1;->d(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->E:Landroidx/media3/exoplayer/d1;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/d1;->d(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->G:Landroidx/media3/exoplayer/X0;

    .line 93
    .line 94
    if-eqz v0, :cond_62

    .line 95
    .line 96
    invoke-interface {v0}, Landroidx/media3/exoplayer/X0;->f()V

    .line 97
    .line 98
    .line 99
    :cond_62
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/media3/exoplayer/n0;->J0()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_76

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 108
    .line 109
    new-instance v2, Landroidx/media3/exoplayer/A;

    .line 110
    .line 111
    invoke-direct {v2}, Landroidx/media3/exoplayer/A;-><init>()V

    .line 112
    .line 113
    .line 114
    const/16 v3, 0xa

    .line 115
    .line 116
    invoke-virtual {v0, v3, v2}, Lax/S0/t;->k(ILax/S0/t$a;)V

    .line 117
    .line 118
    .line 119
    :cond_76
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 120
    .line 121
    invoke-virtual {v0}, Lax/S0/t;->i()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->j:Lax/S0/q;

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-interface {v0, v2}, Lax/S0/q;->k(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->u:Lax/m1/e;

    .line 131
    .line 132
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 133
    .line 134
    invoke-interface {v0, v3}, Lax/m1/e;->g(Lax/m1/e$a;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 138
    .line 139
    iget-boolean v3, v0, Landroidx/media3/exoplayer/J0;->p:Z

    .line 140
    .line 141
    if-eqz v3, :cond_94

    .line 142
    .line 143
    invoke-virtual {v0}, Landroidx/media3/exoplayer/J0;->a()Landroidx/media3/exoplayer/J0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 148
    .line 149
    :cond_94
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 150
    .line 151
    const/4 v3, 0x1

    .line 152
    invoke-static {v0, v3}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 157
    .line 158
    iget-object v4, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Landroidx/media3/exoplayer/J0;->c(Lax/i1/F$b;)Landroidx/media3/exoplayer/J0;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 165
    .line 166
    iget-wide v4, v0, Landroidx/media3/exoplayer/J0;->s:J

    .line 167
    .line 168
    iput-wide v4, v0, Landroidx/media3/exoplayer/J0;->q:J

    .line 169
    .line 170
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 171
    .line 172
    const-wide/16 v4, 0x0

    .line 173
    .line 174
    iput-wide v4, v0, Landroidx/media3/exoplayer/J0;->r:J

    .line 175
    .line 176
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 177
    .line 178
    invoke-interface {v0}, Lax/Z0/a;->d()V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->a0:Landroid/view/Surface;

    .line 185
    .line 186
    if-eqz v0, :cond_c0

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 189
    .line 190
    .line 191
    iput-object v2, p0, Landroidx/media3/exoplayer/X;->a0:Landroid/view/Surface;

    .line 192
    .line 193
    :cond_c0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 194
    .line 195
    if-eqz v0, :cond_d3

    .line 196
    .line 197
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->r0:Lax/P0/J;

    .line 198
    .line 199
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Lax/P0/J;

    .line 204
    .line 205
    iget v2, p0, Landroidx/media3/exoplayer/X;->q0:I

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Lax/P0/J;->b(I)V

    .line 208
    .line 209
    .line 210
    iput-boolean v1, p0, Landroidx/media3/exoplayer/X;->s0:Z

    .line 211
    .line 212
    :cond_d3
    sget-object v0, Lax/R0/c;->d:Lax/R0/c;

    .line 213
    .line 214
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->n0:Lax/R0/c;

    .line 215
    .line 216
    iput-boolean v3, p0, Landroidx/media3/exoplayer/X;->t0:Z

    .line 217
    .line 218
    return-void
    .line 219
.end method

.method public d0(Landroid/view/SurfaceView;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_7

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_b

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_b
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/X;->Q1(Landroid/view/SurfaceHolder;)V

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

.method public d2()Landroidx/media3/exoplayer/s;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->f:Landroidx/media3/exoplayer/s;

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
.end method

.method public e(Lax/P0/G;)V
    .registers 12

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_7

    .line 5
    .line 6
    sget-object p1, Lax/P0/G;->d:Lax/P0/G;

    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lax/P0/G;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/J0;->g(Lax/P0/G;)Landroidx/media3/exoplayer/J0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->t1(Lax/P0/G;)V

    .line 34
    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x5

    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    move-object v1, p0

    .line 47
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

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
.end method

.method public f0()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/J0;->n:I

    .line 7
    .line 8
    return v0
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

.method public g0()J
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_25

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 15
    .line 16
    iget-object v2, v1, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 24
    .line 25
    iget v2, v1, Lax/i1/F$b;->b:I

    .line 26
    .line 27
    iget v1, v1, Lax/i1/F$b;->c:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lax/P0/N$b;->b(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_25
    invoke-virtual {p0}, Lax/P0/h;->C()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
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

.method public h()Lax/P0/G;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->o:Lax/P0/G;

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
.end method

.method public h0()Lax/P0/N;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

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
.end method

.method public i()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 7
    .line 8
    return v0
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

.method public i0()Landroid/os/Looper;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->t:Landroid/os/Looper;

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

.method public i2()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/J0;->p:Z

    .line 7
    .line 8
    return v0
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

.method public isScrubbingModeEnabled()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 5
    .line 6
    return v0
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

.method public j(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/X;->I:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_22

    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/X;->I:I

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->w1(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/B;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/B;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->D2()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/S0/t;->f()V

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
.end method

.method public j0()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->J:Z

    .line 5
    .line 6
    return v0
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

.method public k()V
    .registers 13

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget v1, v0, Landroidx/media3/exoplayer/J0;->e:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v1, v2, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/J0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/J0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/P0/N;->q()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1a

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v1, 0x2

    .line 28
    :goto_1b
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/X;->j2(Landroidx/media3/exoplayer/J0;I)Landroidx/media3/exoplayer/J0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    iput v0, p0, Landroidx/media3/exoplayer/X;->K:I

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/exoplayer/n0;->H0()V

    .line 40
    .line 41
    .line 42
    const/4 v10, -0x1

    .line 43
    const/4 v11, 0x0

    .line 44
    const/4 v5, 0x1

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x5

    .line 47
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    move-object v3, p0

    .line 53
    invoke-direct/range {v3 .. v11}, Landroidx/media3/exoplayer/X;->F2(Landroidx/media3/exoplayer/J0;IZIJIZ)V

    .line 54
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

.method public k0()Lax/P0/T;
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l1/J;->c()Lax/P0/T;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v1, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1b

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->O:Lax/r7/C;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/P0/T$c;->L(Ljava/util/Set;)Lax/P0/T$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1b
    return-object v0
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

.method public l(F)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lax/S0/d0;->o(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Landroidx/media3/exoplayer/X;->l0:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iput p1, p0, Landroidx/media3/exoplayer/X;->l0:F

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->L1(F)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 26
    .line 27
    new-instance v1, Landroidx/media3/exoplayer/y;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/y;-><init>(F)V

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x16

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lax/S0/t;->k(ILax/S0/t$a;)V

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
.end method

.method public l0()J
    .registers 7

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/exoplayer/X;->A0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 20
    .line 21
    iget-wide v1, v1, Lax/i1/F$b;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 24
    .line 25
    iget-wide v3, v3, Lax/i1/F$b;->d:J

    .line 26
    .line 27
    cmp-long v5, v1, v3

    .line 28
    .line 29
    if-eqz v5, :cond_2f

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->b0()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lax/P0/h;->a:Lax/P0/N$c;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lax/P0/N$c;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_2f
    iget-wide v0, v0, Landroidx/media3/exoplayer/J0;->q:J

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 51
    .line 52
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 53
    .line 54
    invoke-virtual {v2}, Lax/i1/F$b;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_5d

    .line 59
    .line 60
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 61
    .line 62
    iget-object v1, v0, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 63
    .line 64
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 65
    .line 66
    iget-object v0, v0, Lax/i1/F$b;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->o:Lax/P0/N$b;

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 75
    .line 76
    iget-object v1, v1, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 77
    .line 78
    iget v1, v1, Lax/i1/F$b;->b:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lax/P0/N$b;->f(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    const-wide/high16 v3, -0x8000000000000000L

    .line 85
    .line 86
    cmp-long v5, v1, v3

    .line 87
    .line 88
    if-nez v5, :cond_5c

    .line 89
    .line 90
    iget-wide v0, v0, Lax/P0/N$b;->d:J

    .line 91
    .line 92
    goto :goto_5d

    .line 93
    :cond_5c
    move-wide v0, v1

    .line 94
    :cond_5d
    :goto_5d
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 95
    .line 96
    iget-object v3, v2, Landroidx/media3/exoplayer/J0;->a:Lax/P0/N;

    .line 97
    .line 98
    iget-object v2, v2, Landroidx/media3/exoplayer/J0;->k:Lax/i1/F$b;

    .line 99
    .line 100
    invoke-direct {p0, v3, v2, v0, v1}, Landroidx/media3/exoplayer/X;->q2(Lax/P0/N;Lax/i1/F$b;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    return-wide v0
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

.method public o()I
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/X;->I:I

    .line 5
    .line 6
    return v0
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

.method public o0(Landroid/view/TextureView;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_9

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->P1()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->t2()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/X;->e0:Landroid/view/TextureView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1b

    .line 20
    .line 21
    const-string v0, "ExoPlayerImpl"

    .line 22
    .line 23
    const-string v1, "Replacing existing SurfaceTextureListener."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->z:Landroidx/media3/exoplayer/X$c;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2c

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_2d

    .line 45
    :cond_2c
    move-object v0, v1

    .line 46
    :goto_2d
    if-nez v0, :cond_37

    .line 47
    .line 48
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/X;->A2(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/X;->m2(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->z2(Landroid/graphics/SurfaceTexture;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/X;->m2(II)V

    .line 68
    .line 69
    .line 70
    return-void
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
.end method

.method public p()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/J0;->b:Lax/i1/F$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/i1/F$b;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

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

.method public q(Lax/P0/H$d;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 5
    .line 6
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lax/P0/H$d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lax/S0/t;->j(Ljava/lang/Object;)V

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

.method public q0()Lax/P0/A;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->V:Lax/P0/A;

    .line 5
    .line 6
    return-object v0
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

.method public r()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-wide v0, v0, Landroidx/media3/exoplayer/J0;->r:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public r0(Lax/Z0/c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->s:Lax/Z0/a;

    .line 2
    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/Z0/c;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lax/Z0/a;->f0(Lax/Z0/c;)V

    .line 10
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
    .line 22
.end method

.method public s0()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->Z1(Landroidx/media3/exoplayer/J0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/X;->u2(IILjava/lang/Object;)V

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
.end method

.method public setScrubbingModeEnabled(Z)V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 5
    .line 6
    if-ne p1, v0, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->P:Lax/Y0/Y;

    .line 12
    .line 13
    iget-object v0, v0, Lax/Y0/Y;->a:Lax/r7/C;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_4d

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/l1/J;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_4d

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/l1/J;->c()Lax/P0/T;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz p1, :cond_31

    .line 36
    .line 37
    iget-object v1, v0, Lax/P0/T;->E:Lax/r7/C;

    .line 38
    .line 39
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->O:Lax/r7/C;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->P:Lax/Y0/Y;

    .line 42
    .line 43
    iget-object v1, v1, Lax/Y0/Y;->a:Lax/r7/C;

    .line 44
    .line 45
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/X;->M1(Lax/P0/T;Lax/r7/C;)Lax/P0/T;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_42

    .line 50
    :cond_31
    invoke-virtual {v0}, Lax/P0/T;->I()Lax/P0/T$c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->O:Lax/r7/C;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lax/P0/T$c;->L(Ljava/util/Set;)Lax/P0/T$c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lax/P0/T$c;->F()Lax/P0/T;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v2, 0x0

    .line 65
    iput-object v2, p0, Landroidx/media3/exoplayer/X;->O:Lax/r7/C;

    .line 66
    .line 67
    :goto_42
    invoke-virtual {v1, v0}, Lax/P0/T;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_4d

    .line 72
    .line 73
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lax/l1/J;->m(Lax/P0/T;)V

    .line 76
    .line 77
    .line 78
    :cond_4d
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->y1(Z)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->n2()V

    .line 84
    .line 85
    .line 86
    return-void
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

.method public stop()V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/X;->C2(Landroidx/media3/exoplayer/s;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lax/R0/c;

    .line 9
    .line 10
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 15
    .line 16
    iget-wide v2, v2, Landroidx/media3/exoplayer/J0;->s:J

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Lax/R0/c;-><init>(Ljava/util/List;J)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/X;->n0:Lax/R0/c;

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
.end method

.method public t0()J
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/X;->v:J

    .line 5
    .line 6
    return-wide v0
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

.method public u()Lax/P0/H$b;
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->U:Lax/P0/H$b;

    .line 5
    .line 6
    return-object v0
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

.method public v()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->x0:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/J0;->l:Z

    .line 7
    .line 8
    return v0
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

.method public w(Lax/P0/T;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l1/J;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_45

    .line 13
    :cond_c
    invoke-virtual {p0}, Landroidx/media3/exoplayer/X;->k0()Lax/P0/T;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v1, p0, Landroidx/media3/exoplayer/X;->N:Z

    .line 18
    .line 19
    if-eqz v1, :cond_21

    .line 20
    .line 21
    iget-object v1, p1, Lax/P0/T;->E:Lax/r7/C;

    .line 22
    .line 23
    iput-object v1, p0, Landroidx/media3/exoplayer/X;->O:Lax/r7/C;

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/X;->P:Lax/Y0/Y;

    .line 26
    .line 27
    iget-object v1, v1, Lax/Y0/Y;->a:Lax/r7/C;

    .line 28
    .line 29
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/X;->M1(Lax/P0/T;Lax/r7/C;)Lax/P0/T;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    move-object v1, p1

    .line 35
    :goto_22
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 36
    .line 37
    invoke-virtual {v2}, Lax/l1/J;->c()Lax/P0/T;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Lax/P0/T;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_33

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/X;->i:Lax/l1/J;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Lax/l1/J;->m(Lax/P0/T;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    invoke-virtual {v0, p1}, Lax/P0/T;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_45

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 59
    .line 60
    new-instance v1, Landroidx/media3/exoplayer/I;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/I;-><init>(Lax/P0/T;)V

    .line 63
    .line 64
    .line 65
    const/16 p1, 0x13

    .line 66
    .line 67
    invoke-virtual {v0, p1, v1}, Lax/S0/t;->k(ILax/S0/t$a;)V

    .line 68
    .line 69
    .line 70
    :cond_45
    :goto_45
    return-void
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
.end method

.method public w2(Ljava/util/List;Z)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/i1/F;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move v5, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/X;->x2(Ljava/util/List;IJZ)V

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

.method public z(Z)V
    .registers 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->I2()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/X;->J:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_22

    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/X;->J:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->l:Landroidx/media3/exoplayer/n0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/n0;->E1(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/M;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/M;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x9

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lax/S0/t;->h(ILax/S0/t$a;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/X;->D2()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/X;->m:Lax/S0/t;

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/S0/t;->f()V

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
.end method
