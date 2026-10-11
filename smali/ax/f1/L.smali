.class public abstract Lax/f1/L;
.super Landroidx/media3/exoplayer/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/f1/L$c;,
        Lax/f1/L$e;,
        Lax/f1/L$b;,
        Lax/f1/L$d;
    }
.end annotation


# static fields
.field private static final J1:[B


# instance fields
.field private final A0:Lax/f1/n;

.field private A1:Landroidx/media3/exoplayer/s;

.field private final B0:Landroid/media/MediaCodec$BufferInfo;

.field protected B1:Lax/Y0/b;

.field private final C0:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/f1/L$e;",
            ">;"
        }
    .end annotation
.end field

.field private C1:Lax/f1/L$e;

.field private final D0:Lax/a1/D0;

.field private D1:J

.field private E0:Lax/P0/v;

.field private E1:Z

.field private F0:Lax/P0/v;

.field private F1:Z

.field private G0:Lax/b1/n;

.field private G1:Z

.field private H0:Lax/b1/n;

.field private H1:J

.field private I0:Landroidx/media3/exoplayer/M0$a;

.field private I1:J

.field private J0:Landroid/media/MediaCrypto;

.field private K0:J

.field private L0:F

.field private M0:F

.field private N0:Lax/f1/x;

.field private O0:Lax/P0/v;

.field private P0:Landroid/media/MediaFormat;

.field private Q0:Z

.field private R0:F

.field private S0:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/f1/D;",
            ">;"
        }
    .end annotation
.end field

.field private T0:Lax/f1/L$c;

.field private U0:Lax/f1/D;

.field private V0:I

.field private W0:Z

.field private X0:Z

.field private Y0:Z

.field private Z0:Z

.field private a1:Z

.field private b1:Z

.field private c1:J

.field private d1:Z

.field private e1:J

.field private f1:I

.field private g1:I

.field private h1:Ljava/nio/ByteBuffer;

.field private i1:Z

.field private j1:Z

.field private k1:Z

.field private l1:Z

.field private m1:Z

.field private n1:Z

.field private o1:I

.field private p1:I

.field private q1:I

.field private r1:Z

.field private s1:Z

.field private final t0:Lax/f1/x$b;

.field private t1:Z

.field private final u0:Lax/f1/Q;

.field private u1:J

.field private final v0:Z

.field private v1:J

.field private final w0:F

.field private w1:Z

.field private final x0:Lax/V0/i;

.field private x1:Z

.field private final y0:Lax/V0/i;

.field private y1:Z

.field private final z0:Lax/V0/i;

.field private z1:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/f1/L;->J1:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
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

.method public constructor <init>(ILax/f1/x$b;Lax/f1/Q;ZF)V
    .registers 6

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/f1/L;->t0:Lax/f1/x$b;

    .line 5
    .line 6
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lax/f1/Q;

    .line 11
    .line 12
    iput-object p1, p0, Lax/f1/L;->u0:Lax/f1/Q;

    .line 13
    .line 14
    iput-boolean p4, p0, Lax/f1/L;->v0:Z

    .line 15
    .line 16
    iput p5, p0, Lax/f1/L;->w0:F

    .line 17
    .line 18
    invoke-static {}, Lax/V0/i;->F()Lax/V0/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lax/f1/L;->x0:Lax/V0/i;

    .line 23
    .line 24
    new-instance p1, Lax/V0/i;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p2}, Lax/V0/i;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lax/f1/L;->y0:Lax/V0/i;

    .line 31
    .line 32
    new-instance p1, Lax/V0/i;

    .line 33
    .line 34
    const/4 p3, 0x2

    .line 35
    invoke-direct {p1, p3}, Lax/V0/i;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 39
    .line 40
    new-instance p1, Lax/f1/n;

    .line 41
    .line 42
    invoke-direct {p1}, Lax/f1/n;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 46
    .line 47
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    .line 48
    .line 49
    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p3, p0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 53
    .line 54
    const/high16 p3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    iput p3, p0, Lax/f1/L;->L0:F

    .line 57
    .line 58
    iput p3, p0, Lax/f1/L;->M0:F

    .line 59
    .line 60
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iput-wide p3, p0, Lax/f1/L;->K0:J

    .line 66
    .line 67
    new-instance p5, Ljava/util/ArrayDeque;

    .line 68
    .line 69
    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p5, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 73
    .line 74
    sget-object p5, Lax/f1/L$e;->e:Lax/f1/L$e;

    .line 75
    .line 76
    iput-object p5, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Lax/V0/i;->C(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    new-instance p1, Lax/a1/D0;

    .line 91
    .line 92
    invoke-direct {p1}, Lax/a1/D0;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lax/f1/L;->D0:Lax/a1/D0;

    .line 96
    .line 97
    const/high16 p1, -0x40800000    # -1.0f

    .line 98
    .line 99
    iput p1, p0, Lax/f1/L;->R0:F

    .line 100
    .line 101
    iput p2, p0, Lax/f1/L;->V0:I

    .line 102
    .line 103
    iput p2, p0, Lax/f1/L;->o1:I

    .line 104
    .line 105
    const/4 p1, -0x1

    .line 106
    iput p1, p0, Lax/f1/L;->f1:I

    .line 107
    .line 108
    iput p1, p0, Lax/f1/L;->g1:I

    .line 109
    .line 110
    iput-wide p3, p0, Lax/f1/L;->e1:J

    .line 111
    .line 112
    iput-wide p3, p0, Lax/f1/L;->u1:J

    .line 113
    .line 114
    iput-wide p3, p0, Lax/f1/L;->v1:J

    .line 115
    .line 116
    iput-wide p3, p0, Lax/f1/L;->D1:J

    .line 117
    .line 118
    iput-wide p3, p0, Lax/f1/L;->c1:J

    .line 119
    .line 120
    iput p2, p0, Lax/f1/L;->p1:I

    .line 121
    .line 122
    iput p2, p0, Lax/f1/L;->q1:I

    .line 123
    .line 124
    new-instance p1, Lax/Y0/b;

    .line 125
    .line 126
    invoke-direct {p1}, Lax/Y0/b;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 130
    .line 131
    iput-wide p3, p0, Lax/f1/L;->H1:J

    .line 132
    .line 133
    iput-wide p3, p0, Lax/f1/L;->I1:J

    .line 134
    .line 135
    return-void
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

.method private A0()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/f1/x;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/f1/x;->flush()V
    :try_end_b
    .catchall {:try_start_0 .. :try_end_b} :catchall_f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lax/f1/L;->z1()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception v0

    .line 17
    invoke-virtual {p0}, Lax/f1/L;->z1()V

    .line 18
    .line 19
    .line 20
    throw v0
    .line 21
.end method

.method private B1()V
    .registers 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lax/f1/L;->u1:J

    .line 7
    .line 8
    iput-wide v0, p0, Lax/f1/L;->v1:J

    .line 9
    .line 10
    iput-wide v0, p0, Lax/f1/L;->D1:J

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

.method private C0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-virtual {p0}, Lax/f1/L;->O1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_11
    invoke-virtual {p0}, Lax/f1/L;->L1()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1b

    .line 23
    .line 24
    invoke-direct {p0}, Lax/f1/L;->A0()V

    .line 25
    .line 26
    .line 27
    goto :goto_1e

    .line 28
    :cond_1b
    invoke-direct {p0}, Lax/f1/L;->q1()V

    .line 29
    .line 30
    .line 31
    :goto_1e
    return v1
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

.method private C1()V
    .registers 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/f1/L;->f1:I

    .line 3
    .line 4
    iget-object v0, p0, Lax/f1/L;->y0:Lax/V0/i;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

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

.method private D0(Z)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
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
    iget-object v0, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/P0/v;

    .line 8
    .line 9
    iget-object v1, p0, Lax/f1/L;->u0:Lax/f1/Q;

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0, p1}, Lax/f1/L;->L0(Lax/f1/Q;Lax/P0/v;Z)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_49

    .line 20
    .line 21
    if-eqz p1, :cond_49

    .line 22
    .line 23
    iget-object p1, p0, Lax/f1/L;->u0:Lax/f1/Q;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, p1, v0, v1}, Lax/f1/L;->L0(Lax/f1/Q;Lax/P0/v;Z)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_48

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "Drm session requires secure decoder for "

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, "."

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "MediaCodecRenderer"

    .line 69
    .line 70
    invoke-static {v1, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-object p1

    .line 74
    :cond_49
    return-object v1
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

.method private D1()V
    .registers 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lax/f1/L;->g1:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/f1/L;->h1:Ljava/nio/ByteBuffer;

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
.end method

.method private E1(Lax/b1/n;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/b1/m;->a(Lax/b1/n;Lax/b1/n;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/f1/L;->G0:Lax/b1/n;

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

.method private F1(Lax/f1/L$e;)V
    .registers 6

    .line 1
    iput-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 2
    .line 3
    iget-wide v0, p1, Lax/f1/L$e;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_13

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lax/f1/L;->E1:Z

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lax/f1/L;->m1(J)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method

.method private I1(Lax/b1/n;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/b1/m;->a(Lax/b1/n;Lax/b1/n;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/f1/L;->H0:Lax/b1/n;

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

.method private J1(J)Z
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/f1/L;->K0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_1d

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr v0, p1

    .line 21
    iget-wide p1, p0, Lax/f1/L;->K0:J

    .line 22
    .line 23
    cmp-long v2, v0, p1

    .line 24
    .line 25
    if-gez v2, :cond_1b

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

.method protected static S1(Lax/P0/v;)Z
    .registers 2

    .line 1
    iget p0, p0, Lax/P0/v;->P:I

    .line 2
    .line 3
    if-eqz p0, :cond_a

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-ne p0, v0, :cond_8

    .line 7
    .line 8
    goto :goto_a

    .line 9
    :cond_8
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_a
    :goto_a
    const/4 p0, 0x1

    .line 12
    return p0
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

.method private U0()Z
    .registers 2

    .line 1
    iget v0, p0, Lax/f1/L;->g1:I

    .line 2
    .line 3
    if-ltz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

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

.method private U1(Lax/P0/v;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_8

    .line 7
    .line 8
    return v2

    .line 9
    :cond_8
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 10
    .line 11
    if-eqz v0, :cond_5d

    .line 12
    .line 13
    iget v0, p0, Lax/f1/L;->q1:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_5d

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_18

    .line 23
    .line 24
    goto :goto_5d

    .line 25
    :cond_18
    iget v0, p0, Lax/f1/L;->M0:F

    .line 26
    .line 27
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lax/P0/v;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->Q()[Lax/P0/v;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0, v0, p1, v1}, Lax/f1/L;->J0(FLax/P0/v;[Lax/P0/v;)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget v0, p0, Lax/f1/L;->R0:F

    .line 42
    .line 43
    cmpl-float v1, v0, p1

    .line 44
    .line 45
    if-nez v1, :cond_2f

    .line 46
    .line 47
    return v2

    .line 48
    :cond_2f
    const/high16 v1, -0x40800000    # -1.0f

    .line 49
    .line 50
    cmpl-float v3, p1, v1

    .line 51
    .line 52
    if-nez v3, :cond_3a

    .line 53
    .line 54
    invoke-direct {p0}, Lax/f1/L;->u0()V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    return p1

    .line 59
    :cond_3a
    cmpl-float v0, v0, v1

    .line 60
    .line 61
    if-nez v0, :cond_46

    .line 62
    .line 63
    iget v0, p0, Lax/f1/L;->w0:F

    .line 64
    .line 65
    cmpl-float v0, p1, v0

    .line 66
    .line 67
    if-lez v0, :cond_45

    .line 68
    .line 69
    goto :goto_46

    .line 70
    :cond_45
    return v2

    .line 71
    :cond_46
    :goto_46
    new-instance v0, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v1, "operating-rate"

    .line 77
    .line 78
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 82
    .line 83
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lax/f1/x;

    .line 88
    .line 89
    invoke-interface {v1, v0}, Lax/f1/x;->a(Landroid/os/Bundle;)V

    .line 90
    .line 91
    .line 92
    iput p1, p0, Lax/f1/L;->R0:F

    .line 93
    .line 94
    :cond_5d
    :goto_5d
    return v2
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

.method private V1()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/b1/n;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/b1/n;->h()Lax/V0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Lax/b1/F;

    .line 14
    .line 15
    if-eqz v1, :cond_2a

    .line 16
    .line 17
    :try_start_10
    iget-object v1, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 18
    .line 19
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/media/MediaCrypto;

    .line 24
    .line 25
    check-cast v0, Lax/b1/F;

    .line 26
    .line 27
    iget-object v0, v0, Lax/b1/F;->b:[B

    .line 28
    .line 29
    invoke-static {v1, v0}, Lax/f1/K;->a(Landroid/media/MediaCrypto;[B)V
    :try_end_1f
    .catch Landroid/media/MediaCryptoException; {:try_start_10 .. :try_end_1f} :catch_20

    .line 30
    .line 31
    .line 32
    goto :goto_2a

    .line 33
    :catch_20
    move-exception v0

    .line 34
    iget-object v1, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 35
    .line 36
    const/16 v2, 0x1776

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    throw v0

    .line 43
    :cond_2a
    :goto_2a
    iget-object v0, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput v0, p0, Lax/f1/L;->p1:I

    .line 50
    .line 51
    iput v0, p0, Lax/f1/L;->q1:I

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private W0()Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/f1/n;->M()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v0, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/f1/n;->K()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-direct {p0, v2, v3, v4, v5}, Lax/f1/L;->c1(JJ)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v4, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 26
    .line 27
    iget-wide v4, v4, Lax/V0/i;->g0:J

    .line 28
    .line 29
    invoke-direct {p0, v2, v3, v4, v5}, Lax/f1/L;->c1(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ne v0, v2, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    const/4 v0, 0x0

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

.method private X0(Lax/P0/v;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/f1/L;->s0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, "audio/mp4a-latm"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_24

    .line 14
    .line 15
    const-string v0, "audio/mpeg"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_24

    .line 22
    .line 23
    const-string v0, "audio/opus"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_24

    .line 30
    .line 31
    iget-object p1, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lax/f1/n;->N(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_2b

    .line 37
    :cond_24
    iget-object p1, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lax/f1/n;->N(I)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    iput-boolean v1, p0, Lax/f1/L;->k1:Z

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

.method private Y0(Lax/f1/D;Landroid/media/MediaCrypto;)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    iput-object p1, p0, Lax/f1/L;->U0:Lax/f1/D;

    .line 5
    .line 6
    iget-object v3, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 7
    .line 8
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Lax/P0/v;

    .line 13
    .line 14
    iget-object v5, p1, Lax/f1/D;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v6, 0x17

    .line 19
    .line 20
    const/high16 v7, -0x40800000    # -1.0f

    .line 21
    .line 22
    if-ge v4, v6, :cond_1a

    .line 23
    .line 24
    const/high16 v6, -0x40800000    # -1.0f

    .line 25
    .line 26
    goto :goto_24

    .line 27
    :cond_1a
    iget v6, p0, Lax/f1/L;->M0:F

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->Q()[Lax/P0/v;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {p0, v6, v3, v8}, Lax/f1/L;->J0(FLax/P0/v;[Lax/P0/v;)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    :goto_24
    iget v8, p0, Lax/f1/L;->w0:F

    .line 38
    .line 39
    cmpg-float v8, v6, v8

    .line 40
    .line 41
    if-gtz v8, :cond_2b

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    move v7, v6

    .line 45
    :goto_2c
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-interface {v6}, Lax/S0/h;->b()J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    invoke-virtual {p0, p1, v3, p2, v7}, Lax/f1/L;->O0(Lax/f1/D;Lax/P0/v;Landroid/media/MediaCrypto;F)Lax/f1/x$a;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const/16 p2, 0x1f

    .line 58
    .line 59
    if-lt v4, p2, :cond_43

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->P()Lax/Z0/I1;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {v6, p2}, Lax/f1/L$b;->a(Lax/f1/x$a;Lax/Z0/I1;)V

    .line 66
    .line 67
    .line 68
    :cond_43
    :try_start_43
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v4, "createCodec:"

    .line 74
    .line 75
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {p2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, Lax/f1/L;->t0:Lax/f1/x$b;

    .line 89
    .line 90
    invoke-interface {p2, v6}, Lax/f1/x$b;->a(Lax/f1/x$a;)Lax/f1/x;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 95
    .line 96
    new-instance v4, Lax/f1/L$d;

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-direct {v4, p0, v10}, Lax/f1/L$d;-><init>(Lax/f1/L;Lax/f1/L$a;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p2, v4}, Lax/f1/x;->h(Lax/f1/x$c;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    iput-boolean p2, p0, Lax/f1/L;->d1:Z
    :try_end_6b
    .catchall {:try_start_43 .. :try_end_6b} :catchall_fb

    .line 107
    .line 108
    invoke-static {}, Lax/S0/N;->b()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-interface {p2}, Lax/S0/h;->b()J

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    invoke-virtual {p1, v3}, Lax/f1/D;->q(Lax/P0/v;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-nez p2, :cond_91

    .line 124
    .line 125
    invoke-static {v3}, Lax/P0/v;->l(Lax/P0/v;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    new-array v4, v2, [Ljava/lang/Object;

    .line 130
    .line 131
    aput-object p2, v4, v1

    .line 132
    .line 133
    aput-object v5, v4, v0

    .line 134
    .line 135
    const-string p2, "Format exceeds selected codec\'s capabilities [%s, %s]"

    .line 136
    .line 137
    invoke-static {p2, v4}, Lax/S0/d0;->G(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    const-string v4, "MediaCodecRenderer"

    .line 142
    .line 143
    invoke-static {v4, p2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_91
    iput v7, p0, Lax/f1/L;->R0:F

    .line 147
    .line 148
    iput-object v3, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 149
    .line 150
    invoke-direct {p0, v5}, Lax/f1/L;->m0(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iput p2, p0, Lax/f1/L;->V0:I

    .line 155
    .line 156
    invoke-static {v5}, Lax/f1/L;->q0(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    iput-boolean p2, p0, Lax/f1/L;->W0:Z

    .line 161
    .line 162
    invoke-static {v5}, Lax/f1/L;->n0(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    iput-boolean p2, p0, Lax/f1/L;->X0:Z

    .line 167
    .line 168
    invoke-static {v5}, Lax/f1/L;->o0(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    iput-boolean p2, p0, Lax/f1/L;->Y0:Z

    .line 173
    .line 174
    invoke-static {p1}, Lax/f1/L;->p0(Lax/f1/D;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_bc

    .line 179
    .line 180
    invoke-virtual {p0}, Lax/f1/L;->I0()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_ba

    .line 185
    .line 186
    goto :goto_bc

    .line 187
    :cond_ba
    const/4 p1, 0x0

    .line 188
    goto :goto_bd

    .line 189
    :cond_bc
    :goto_bc
    const/4 p1, 0x1

    .line 190
    :goto_bd
    iput-boolean p1, p0, Lax/f1/L;->b1:Z

    .line 191
    .line 192
    iget-object p1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 193
    .line 194
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Lax/f1/x;

    .line 199
    .line 200
    invoke-interface {p1}, Lax/f1/x;->e()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_d8

    .line 205
    .line 206
    iput-boolean v0, p0, Lax/f1/L;->n1:Z

    .line 207
    .line 208
    iput v0, p0, Lax/f1/L;->o1:I

    .line 209
    .line 210
    iget p1, p0, Lax/f1/L;->V0:I

    .line 211
    .line 212
    if-eqz p1, :cond_d6

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    :cond_d6
    iput-boolean v1, p0, Lax/f1/L;->Z0:Z

    .line 216
    .line 217
    :cond_d8
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-ne p1, v2, :cond_eb

    .line 222
    .line 223
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-interface {p1}, Lax/S0/h;->b()J

    .line 228
    .line 229
    .line 230
    move-result-wide p1

    .line 231
    const-wide/16 v1, 0x3e8

    .line 232
    .line 233
    add-long/2addr p1, v1

    .line 234
    iput-wide p1, p0, Lax/f1/L;->e1:J

    .line 235
    .line 236
    :cond_eb
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 237
    .line 238
    iget p2, p1, Lax/Y0/b;->a:I

    .line 239
    .line 240
    add-int/2addr p2, v0

    .line 241
    iput p2, p1, Lax/Y0/b;->a:I

    .line 242
    .line 243
    sub-long p1, v10, v8

    .line 244
    .line 245
    move-object v4, p0

    .line 246
    move-wide v7, v10

    .line 247
    move-wide v9, p1

    .line 248
    invoke-virtual/range {v4 .. v10}, Lax/f1/L;->i1(Ljava/lang/String;Lax/f1/x$a;JJ)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :catchall_fb
    move-exception v0

    .line 253
    move-object p1, v0

    .line 254
    invoke-static {}, Lax/S0/N;->b()V

    .line 255
    .line 256
    .line 257
    throw p1
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

.method private Z0()Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_8

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
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 14
    .line 15
    invoke-interface {v0}, Lax/b1/n;->h()Lax/V0/b;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-boolean v4, Lax/b1/F;->d:Z

    .line 20
    .line 21
    if-eqz v4, :cond_37

    .line 22
    .line 23
    instance-of v4, v3, Lax/b1/F;

    .line 24
    .line 25
    if-eqz v4, :cond_37

    .line 26
    .line 27
    invoke-interface {v0}, Lax/b1/n;->getState()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eq v4, v2, :cond_24

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-eq v4, v5, :cond_37

    .line 35
    .line 36
    return v1

    .line 37
    :cond_24
    invoke-interface {v0}, Lax/b1/n;->g()Lax/b1/n$a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lax/b1/n$a;

    .line 46
    .line 47
    iget-object v1, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 48
    .line 49
    iget v2, v0, Lax/b1/n$a;->q:I

    .line 50
    .line 51
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0

    .line 56
    :cond_37
    if-nez v3, :cond_41

    .line 57
    .line 58
    invoke-interface {v0}, Lax/b1/n;->g()Lax/b1/n$a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_40

    .line 63
    .line 64
    return v2

    .line 65
    :cond_40
    return v1

    .line 66
    :cond_41
    instance-of v0, v3, Lax/b1/F;

    .line 67
    .line 68
    if-eqz v0, :cond_5d

    .line 69
    .line 70
    check-cast v3, Lax/b1/F;

    .line 71
    .line 72
    :try_start_47
    new-instance v0, Landroid/media/MediaCrypto;

    .line 73
    .line 74
    iget-object v1, v3, Lax/b1/F;->a:Ljava/util/UUID;

    .line 75
    .line 76
    iget-object v3, v3, Lax/b1/F;->b:[B

    .line 77
    .line 78
    invoke-direct {v0, v1, v3}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;
    :try_end_52
    .catch Landroid/media/MediaCryptoException; {:try_start_47 .. :try_end_52} :catch_53

    .line 82
    .line 83
    goto :goto_5d

    .line 84
    :catch_53
    move-exception v0

    .line 85
    iget-object v1, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 86
    .line 87
    const/16 v2, 0x1776

    .line 88
    .line 89
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    throw v0

    .line 94
    :cond_5d
    :goto_5d
    return v2
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

.method private c1(JJ)Z
    .registers 7

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1a

    .line 4
    .line 5
    iget-object v0, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 6
    .line 7
    if-eqz v0, :cond_18

    .line 8
    .line 9
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/opus"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    invoke-static {p1, p2, p3, p4}, Lax/q1/L;->g(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1a

    .line 24
    .line 25
    :cond_18
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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

.method private static d1(Ljava/lang/IllegalStateException;)Z
    .registers 4

    .line 1
    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v0, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-lez v0, :cond_1d

    .line 14
    .line 15
    aget-object p0, p0, v2

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "android.media.MediaCodec"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1d

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1d
    return v2
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

.method private f1(Landroid/media/MediaCrypto;Z)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/L$c;,
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/P0/v;

    .line 8
    .line 9
    iget-object v1, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_40

    .line 13
    .line 14
    :try_start_d
    invoke-direct {p0, p2}, Lax/f1/L;->D0(Z)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v3, Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v3, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    iget-boolean v4, p0, Lax/f1/L;->v0:Z

    .line 26
    .line 27
    if-eqz v4, :cond_22

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_34

    .line 33
    :catch_20
    move-exception p1

    .line 34
    goto :goto_37

    .line 35
    :cond_22
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_34

    .line 40
    .line 41
    iget-object v3, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lax/f1/D;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_34
    :goto_34
    iput-object v2, p0, Lax/f1/L;->T0:Lax/f1/L$c;
    :try_end_36
    .catch Lax/f1/a0$c; {:try_start_d .. :try_end_36} :catch_20

    .line 54
    .line 55
    goto :goto_40

    .line 56
    :goto_37
    new-instance v1, Lax/f1/L$c;

    .line 57
    .line 58
    const v2, -0xc34e

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v0, p1, p2, v2}, Lax/f1/L$c;-><init>(Lax/P0/v;Ljava/lang/Throwable;ZI)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_40
    :goto_40
    iget-object v1, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_b0

    .line 72
    .line 73
    iget-object v1, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/util/ArrayDeque;

    .line 80
    .line 81
    :goto_50
    iget-object v3, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 82
    .line 83
    if-nez v3, :cond_ad

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Lax/f1/D;

    .line 90
    .line 91
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lax/f1/D;

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lax/f1/L;->g1(Lax/P0/v;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_67

    .line 102
    .line 103
    goto :goto_6d

    .line 104
    :cond_67
    invoke-virtual {p0, v3}, Lax/f1/L;->M1(Lax/f1/D;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_6e

    .line 109
    .line 110
    :goto_6d
    return-void

    .line 111
    :cond_6e
    :try_start_6e
    invoke-direct {p0, v3, p1}, Lax/f1/L;->Y0(Lax/f1/D;Landroid/media/MediaCrypto;)V
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_6e .. :try_end_71} :catch_72

    .line 112
    .line 113
    .line 114
    goto :goto_50

    .line 115
    :catch_72
    move-exception v4

    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v6, "Failed to initialize decoder: "

    .line 122
    .line 123
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    const-string v6, "MediaCodecRenderer"

    .line 134
    .line 135
    invoke-static {v6, v5, v4}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    new-instance v5, Lax/f1/L$c;

    .line 142
    .line 143
    invoke-direct {v5, v0, v4, p2, v3}, Lax/f1/L$c;-><init>(Lax/P0/v;Ljava/lang/Throwable;ZLax/f1/D;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v5}, Lax/f1/L;->h1(Ljava/lang/Exception;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, p0, Lax/f1/L;->T0:Lax/f1/L$c;

    .line 150
    .line 151
    if-nez v3, :cond_9b

    .line 152
    .line 153
    iput-object v5, p0, Lax/f1/L;->T0:Lax/f1/L$c;

    .line 154
    .line 155
    goto :goto_a3

    .line 156
    :cond_9b
    iget-object v3, p0, Lax/f1/L;->T0:Lax/f1/L$c;

    .line 157
    .line 158
    invoke-static {v3, v5}, Lax/f1/L$c;->a(Lax/f1/L$c;Lax/f1/L$c;)Lax/f1/L$c;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iput-object v3, p0, Lax/f1/L;->T0:Lax/f1/L$c;

    .line 163
    .line 164
    :goto_a3
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_aa

    .line 169
    .line 170
    goto :goto_50

    .line 171
    :cond_aa
    iget-object p1, p0, Lax/f1/L;->T0:Lax/f1/L$c;

    .line 172
    .line 173
    throw p1

    .line 174
    :cond_ad
    iput-object v2, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 175
    .line 176
    return-void

    .line 177
    :cond_b0
    new-instance p1, Lax/f1/L$c;

    .line 178
    .line 179
    const v1, -0xc34f

    .line 180
    .line 181
    .line 182
    invoke-direct {p1, v0, v2, p2, v1}, Lax/f1/L$c;-><init>(Lax/P0/v;Ljava/lang/Throwable;ZI)V

    .line 183
    .line 184
    .line 185
    throw p1
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

.method static synthetic i0(Lax/f1/L;)Landroidx/media3/exoplayer/M0$a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/f1/L;->I0:Landroidx/media3/exoplayer/M0$a;

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

.method private j0()V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->w1:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 13
    .line 14
    invoke-virtual {v2}, Lax/V0/i;->p()V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 18
    .line 19
    invoke-virtual {v2}, Lax/V0/i;->p()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {p0, v0, v2, v3}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v4, -0x5

    .line 30
    if-eq v2, v4, :cond_f9

    .line 31
    .line 32
    const/4 v4, -0x4

    .line 33
    if-eq v2, v4, :cond_36

    .line 34
    .line 35
    const/4 v0, -0x3

    .line 36
    if-ne v2, v0, :cond_30

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->n()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2f

    .line 43
    .line 44
    iget-wide v0, p0, Lax/f1/L;->u1:J

    .line 45
    .line 46
    iput-wide v0, p0, Lax/f1/L;->v1:J

    .line 47
    .line 48
    :cond_2f
    return-void

    .line 49
    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_36
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 56
    .line 57
    invoke-virtual {v2}, Lax/V0/a;->s()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_45

    .line 62
    .line 63
    iput-boolean v1, p0, Lax/f1/L;->w1:Z

    .line 64
    .line 65
    iget-wide v0, p0, Lax/f1/L;->u1:J

    .line 66
    .line 67
    iput-wide v0, p0, Lax/f1/L;->v1:J

    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    iget-wide v4, p0, Lax/f1/L;->u1:J

    .line 71
    .line 72
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 73
    .line 74
    iget-wide v6, v2, Lax/V0/i;->g0:J

    .line 75
    .line 76
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    iput-wide v4, p0, Lax/f1/L;->u1:J

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->n()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_5f

    .line 87
    .line 88
    iget-object v2, p0, Lax/f1/L;->y0:Lax/V0/i;

    .line 89
    .line 90
    invoke-virtual {v2}, Lax/V0/a;->w()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_63

    .line 95
    .line 96
    :cond_5f
    iget-wide v4, p0, Lax/f1/L;->u1:J

    .line 97
    .line 98
    iput-wide v4, p0, Lax/f1/L;->v1:J

    .line 99
    .line 100
    :cond_63
    iget-boolean v2, p0, Lax/f1/L;->y1:Z

    .line 101
    .line 102
    const-string v4, "audio/opus"

    .line 103
    .line 104
    if-eqz v2, :cond_ab

    .line 105
    .line 106
    iget-object v2, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 107
    .line 108
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lax/P0/v;

    .line 113
    .line 114
    iput-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 115
    .line 116
    iget-object v2, v2, Lax/P0/v;->o:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v2, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_a3

    .line 123
    .line 124
    iget-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 125
    .line 126
    iget-object v2, v2, Lax/P0/v;->r:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_a3

    .line 133
    .line 134
    iget-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 135
    .line 136
    iget-object v2, v2, Lax/P0/v;->r:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, [B

    .line 143
    .line 144
    invoke-static {v2}, Lax/q1/L;->f([B)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    iget-object v5, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 149
    .line 150
    invoke-virtual {v5}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5, v2}, Lax/P0/v$b;->d0(I)Lax/P0/v$b;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iput-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 163
    .line 164
    :cond_a3
    iget-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    invoke-virtual {p0, v2, v5}, Lax/f1/L;->l1(Lax/P0/v;Landroid/media/MediaFormat;)V

    .line 168
    .line 169
    .line 170
    iput-boolean v3, p0, Lax/f1/L;->y1:Z

    .line 171
    .line 172
    :cond_ab
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 173
    .line 174
    invoke-virtual {v2}, Lax/V0/i;->D()V

    .line 175
    .line 176
    .line 177
    iget-object v2, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 178
    .line 179
    if-eqz v2, :cond_e6

    .line 180
    .line 181
    iget-object v2, v2, Lax/P0/v;->o:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v2, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_e6

    .line 188
    .line 189
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 190
    .line 191
    invoke-virtual {v2}, Lax/V0/a;->r()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_cd

    .line 196
    .line 197
    iget-object v2, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 198
    .line 199
    iget-object v3, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 200
    .line 201
    iput-object v3, v2, Lax/V0/i;->c0:Lax/P0/v;

    .line 202
    .line 203
    invoke-virtual {p0, v2}, Lax/f1/L;->T0(Lax/V0/i;)V

    .line 204
    .line 205
    .line 206
    :cond_cd
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    iget-object v4, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 211
    .line 212
    iget-wide v4, v4, Lax/V0/i;->g0:J

    .line 213
    .line 214
    invoke-static {v2, v3, v4, v5}, Lax/q1/L;->g(JJ)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_e6

    .line 219
    .line 220
    iget-object v2, p0, Lax/f1/L;->D0:Lax/a1/D0;

    .line 221
    .line 222
    iget-object v3, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 223
    .line 224
    iget-object v4, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 225
    .line 226
    iget-object v4, v4, Lax/P0/v;->r:Ljava/util/List;

    .line 227
    .line 228
    invoke-virtual {v2, v3, v4}, Lax/a1/D0;->a(Lax/V0/i;Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    :cond_e6
    invoke-direct {p0}, Lax/f1/L;->W0()Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_f6

    .line 236
    .line 237
    iget-object v2, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 238
    .line 239
    iget-object v3, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 240
    .line 241
    invoke-virtual {v2, v3}, Lax/f1/n;->H(Lax/V0/i;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-nez v2, :cond_10

    .line 246
    .line 247
    :cond_f6
    iput-boolean v1, p0, Lax/f1/L;->l1:Z

    .line 248
    .line 249
    return-void

    .line 250
    :cond_f9
    invoke-virtual {p0, v0}, Lax/f1/L;->k1(Lax/Y0/O;)Lax/Y0/c;

    .line 251
    .line 252
    .line 253
    return-void
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
.end method

.method private k0(JJ)Z
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lax/f1/L;->x1:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 11
    .line 12
    invoke-virtual {v1}, Lax/f1/n;->M()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_5c

    .line 18
    .line 19
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 20
    .line 21
    iget-object v6, v1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget v7, v0, Lax/f1/L;->g1:I

    .line 24
    .line 25
    invoke-virtual {v1}, Lax/f1/n;->L()I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 30
    .line 31
    invoke-virtual {v1}, Lax/f1/n;->J()J

    .line 32
    .line 33
    .line 34
    move-result-wide v10

    .line 35
    invoke-virtual {v0}, Landroidx/media3/exoplayer/h;->O()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 40
    .line 41
    invoke-virtual {v1}, Lax/f1/n;->K()J

    .line 42
    .line 43
    .line 44
    move-result-wide v12

    .line 45
    invoke-direct {v0, v3, v4, v12, v13}, Lax/f1/L;->c1(JJ)Z

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 50
    .line 51
    invoke-virtual {v1}, Lax/V0/a;->s()Z

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    iget-object v1, v0, Lax/f1/L;->F0:Lax/P0/v;

    .line 56
    .line 57
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v14, v1

    .line 62
    check-cast v14, Lax/P0/v;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    move-wide/from16 v1, p1

    .line 67
    .line 68
    move-wide/from16 v3, p3

    .line 69
    .line 70
    const/4 v15, 0x0

    .line 71
    invoke-virtual/range {v0 .. v14}, Lax/f1/L;->s1(JJLax/f1/x;Ljava/nio/ByteBuffer;IIIJZZLax/P0/v;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5b

    .line 76
    .line 77
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 78
    .line 79
    invoke-virtual {v1}, Lax/f1/n;->K()J

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    invoke-virtual {v0, v1, v2}, Lax/f1/L;->n1(J)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 87
    .line 88
    invoke-virtual {v1}, Lax/f1/n;->p()V

    .line 89
    .line 90
    .line 91
    goto :goto_5d

    .line 92
    :cond_5b
    return v15

    .line 93
    :cond_5c
    const/4 v15, 0x0

    .line 94
    :goto_5d
    iget-boolean v1, v0, Lax/f1/L;->w1:Z

    .line 95
    .line 96
    if-eqz v1, :cond_65

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    iput-boolean v1, v0, Lax/f1/L;->x1:Z

    .line 100
    .line 101
    return v15

    .line 102
    :cond_65
    iget-boolean v1, v0, Lax/f1/L;->l1:Z

    .line 103
    .line 104
    if-eqz v1, :cond_76

    .line 105
    .line 106
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 107
    .line 108
    iget-object v2, v0, Lax/f1/L;->z0:Lax/V0/i;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Lax/f1/n;->H(Lax/V0/i;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 115
    .line 116
    .line 117
    iput-boolean v15, v0, Lax/f1/L;->l1:Z

    .line 118
    .line 119
    :cond_76
    iget-boolean v1, v0, Lax/f1/L;->m1:Z

    .line 120
    .line 121
    if-eqz v1, :cond_92

    .line 122
    .line 123
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 124
    .line 125
    invoke-virtual {v1}, Lax/f1/n;->M()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_85

    .line 130
    .line 131
    const/16 v16, 0x1

    .line 132
    .line 133
    return v16

    .line 134
    :cond_85
    invoke-direct {v0}, Lax/f1/L;->s0()V

    .line 135
    .line 136
    .line 137
    iput-boolean v15, v0, Lax/f1/L;->m1:Z

    .line 138
    .line 139
    invoke-virtual {v0}, Lax/f1/L;->e1()V

    .line 140
    .line 141
    .line 142
    iget-boolean v1, v0, Lax/f1/L;->k1:Z

    .line 143
    .line 144
    if-nez v1, :cond_92

    .line 145
    .line 146
    return v15

    .line 147
    :cond_92
    invoke-direct {v0}, Lax/f1/L;->j0()V

    .line 148
    .line 149
    .line 150
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 151
    .line 152
    invoke-virtual {v1}, Lax/f1/n;->M()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_a2

    .line 157
    .line 158
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 159
    .line 160
    invoke-virtual {v1}, Lax/V0/i;->D()V

    .line 161
    .line 162
    .line 163
    :cond_a2
    iget-object v1, v0, Lax/f1/L;->A0:Lax/f1/n;

    .line 164
    .line 165
    invoke-virtual {v1}, Lax/f1/n;->M()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_b2

    .line 170
    .line 171
    iget-boolean v1, v0, Lax/f1/L;->w1:Z

    .line 172
    .line 173
    if-nez v1, :cond_b2

    .line 174
    .line 175
    iget-boolean v1, v0, Lax/f1/L;->m1:Z

    .line 176
    .line 177
    if-eqz v1, :cond_b5

    .line 178
    .line 179
    :cond_b2
    const/16 v16, 0x1

    .line 180
    .line 181
    goto :goto_b6

    .line 182
    :cond_b5
    return v15

    .line 183
    :goto_b6
    return v16
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

.method private m0(Ljava/lang/String;)I
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-gt v0, v1, :cond_32

    .line 6
    .line 7
    const-string v1, "OMX.Exynos.avc.dec.secure"

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_32

    .line 14
    .line 15
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "SM-T585"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_30

    .line 24
    .line 25
    const-string v2, "SM-A510"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_30

    .line 32
    .line 33
    const-string v2, "SM-A520"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_30

    .line 40
    .line 41
    const-string v2, "SM-J700"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_32

    .line 48
    .line 49
    :cond_30
    const/4 p1, 0x2

    .line 50
    return p1

    .line 51
    :cond_32
    const/16 v1, 0x18

    .line 52
    .line 53
    if-ge v0, v1, :cond_6a

    .line 54
    .line 55
    const-string v0, "OMX.Nvidia.h264.decode"

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_46

    .line 62
    .line 63
    const-string v0, "OMX.Nvidia.h264.decode.secure"

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_6a

    .line 70
    .line 71
    :cond_46
    sget-object p1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 72
    .line 73
    const-string v0, "flounder"

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_68

    .line 80
    .line 81
    const-string v0, "flounder_lte"

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_68

    .line 88
    .line 89
    const-string v0, "grouper"

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_68

    .line 96
    .line 97
    const-string v0, "tilapia"

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_6a

    .line 104
    .line 105
    :cond_68
    const/4 p1, 0x1

    .line 106
    return p1

    .line 107
    :cond_6a
    const/4 p1, 0x0

    .line 108
    return p1
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

.method private static n0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-gt v0, v1, :cond_10

    .line 6
    .line 7
    const-string v0, "OMX.google.vorbis.decoder"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_10

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_10
    const/4 p0, 0x0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static o0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-ne v0, v1, :cond_10

    .line 6
    .line 7
    const-string v0, "OMX.google.aac.decoder"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_10

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_10
    const/4 p0, 0x0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static p0(Lax/f1/D;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/f1/D;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    if-gt v1, v2, :cond_10

    .line 8
    .line 9
    const-string v2, "OMX.rk.video_decoder.avc"

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_5c

    .line 16
    .line 17
    :cond_10
    const/16 v2, 0x1d

    .line 18
    .line 19
    if-gt v1, v2, :cond_44

    .line 20
    .line 21
    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_5c

    .line 28
    .line 29
    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_5c

    .line 36
    .line 37
    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_5c

    .line 44
    .line 45
    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_5c

    .line 52
    .line 53
    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_5c

    .line 60
    .line 61
    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5c

    .line 68
    .line 69
    :cond_44
    const-string v0, "Amazon"

    .line 70
    .line 71
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_5e

    .line 78
    .line 79
    const-string v0, "AFTS"

    .line 80
    .line 81
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_5e

    .line 88
    .line 89
    iget-boolean p0, p0, Lax/f1/D;->g:Z

    .line 90
    .line 91
    if-eqz p0, :cond_5e

    .line 92
    .line 93
    :cond_5c
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :cond_5e
    const/4 p0, 0x0

    .line 96
    return p0
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

.method private static q0(Ljava/lang/String;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ne v0, v1, :cond_10

    .line 6
    .line 7
    const-string v0, "c2.android.aac.decoder"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_10

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_10
    const/4 p0, 0x0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private q1()V
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/f1/L;->I1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_20

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v4, p0, Lax/f1/L;->I1:J

    .line 17
    .line 18
    cmp-long v6, v0, v4

    .line 19
    .line 20
    if-gtz v6, :cond_20

    .line 21
    .line 22
    iget-wide v0, p0, Lax/f1/L;->D1:J

    .line 23
    .line 24
    cmp-long v6, v0, v4

    .line 25
    .line 26
    if-gez v6, :cond_20

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lax/f1/L;->G1:Z

    .line 30
    .line 31
    iput-wide v2, p0, Lax/f1/L;->I1:J

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

.method private r1()V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/f1/L;->q1:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1c

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_15

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_11

    .line 11
    .line 12
    iput-boolean v1, p0, Lax/f1/L;->x1:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/f1/L;->x1()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-direct {p0}, Lax/f1/L;->v1()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    invoke-direct {p0}, Lax/f1/L;->A0()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lax/f1/L;->V1()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    invoke-direct {p0}, Lax/f1/L;->A0()V

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
.end method

.method private s0()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/f1/L;->k1:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lax/f1/L;->y1()V

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
.end method

.method private t0()Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->r1:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_12

    .line 5
    .line 6
    iput v1, p0, Lax/f1/L;->p1:I

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/f1/L;->X0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_10

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iput v0, p0, Lax/f1/L;->q1:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_10
    iput v1, p0, Lax/f1/L;->q1:I

    .line 18
    .line 19
    :cond_12
    return v1
    .line 20
    .line 21
.end method

.method private t1()V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/f1/L;->t1:Z

    .line 3
    .line 4
    iget-object v1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 5
    .line 6
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lax/f1/x;

    .line 11
    .line 12
    invoke-interface {v1}, Lax/f1/x;->f()Landroid/media/MediaFormat;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v2, p0, Lax/f1/L;->V0:I

    .line 17
    .line 18
    if-eqz v2, :cond_28

    .line 19
    .line 20
    const-string v2, "width"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-ne v2, v3, :cond_28

    .line 29
    .line 30
    const-string v2, "height"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ne v2, v3, :cond_28

    .line 37
    .line 38
    iput-boolean v0, p0, Lax/f1/L;->a1:Z

    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    iput-object v1, p0, Lax/f1/L;->P0:Landroid/media/MediaFormat;

    .line 42
    .line 43
    iput-boolean v0, p0, Lax/f1/L;->Q0:Z

    .line 44
    .line 45
    return-void
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

.method private u0()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->r1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lax/f1/L;->p1:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lax/f1/L;->q1:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    invoke-direct {p0}, Lax/f1/L;->v1()V

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

.method private u1(I)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/f1/L;->x0:Lax/V0/i;

    .line 6
    .line 7
    invoke-virtual {v1}, Lax/V0/i;->p()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lax/f1/L;->x0:Lax/V0/i;

    .line 11
    .line 12
    or-int/lit8 p1, p1, 0x4

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, p1}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v1, -0x5

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne p1, v1, :cond_19

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lax/f1/L;->k1(Lax/Y0/O;)Lax/Y0/c;

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_19
    const/4 v0, -0x4

    .line 27
    if-ne p1, v0, :cond_29

    .line 28
    .line 29
    iget-object p1, p0, Lax/f1/L;->x0:Lax/V0/i;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_29

    .line 36
    .line 37
    iput-boolean v2, p0, Lax/f1/L;->w1:Z

    .line 38
    .line 39
    invoke-direct {p0}, Lax/f1/L;->r1()V

    .line 40
    .line 41
    .line 42
    :cond_29
    const/4 p1, 0x0

    .line 43
    return p1
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

.method private v0()Z
    .registers 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->r1:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_14

    .line 5
    .line 6
    iput v1, p0, Lax/f1/L;->p1:I

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/f1/L;->X0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_10

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iput v0, p0, Lax/f1/L;->q1:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, 0x2

    .line 18
    iput v0, p0, Lax/f1/L;->q1:I

    .line 19
    .line 20
    goto :goto_17

    .line 21
    :cond_14
    invoke-direct {p0}, Lax/f1/L;->V1()V

    .line 22
    .line 23
    .line 24
    :goto_17
    return v1
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

.method private v1()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/f1/L;->e1()V

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
.end method

.method private w0(JJ)Z
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/f1/L;->N0:Lax/f1/x;

    .line 4
    .line 5
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move-object v5, v1

    .line 10
    check-cast v5, Lax/f1/x;

    .line 11
    .line 12
    invoke-direct {v0}, Lax/f1/L;->U0()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/4 v15, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v1, :cond_a9

    .line 24
    .line 25
    iget-boolean v1, v0, Lax/f1/L;->Y0:Z

    .line 26
    .line 27
    if-eqz v1, :cond_33

    .line 28
    .line 29
    iget-boolean v1, v0, Lax/f1/L;->s1:Z

    .line 30
    .line 31
    if-eqz v1, :cond_33

    .line 32
    .line 33
    :try_start_20
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 34
    .line 35
    invoke-interface {v5, v1}, Lax/f1/x;->l(Landroid/media/MediaCodec$BufferInfo;)I

    .line 36
    .line 37
    .line 38
    move-result v1
    :try_end_26
    .catch Ljava/lang/IllegalStateException; {:try_start_20 .. :try_end_26} :catch_27

    .line 39
    goto :goto_39

    .line 40
    :catch_27
    nop

    .line 41
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 42
    .line 43
    .line 44
    iget-boolean v1, v0, Lax/f1/L;->x1:Z

    .line 45
    .line 46
    if-eqz v1, :cond_32

    .line 47
    .line 48
    invoke-virtual {v0}, Lax/f1/L;->w1()V

    .line 49
    .line 50
    .line 51
    :cond_32
    return v4

    .line 52
    :cond_33
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 53
    .line 54
    invoke-interface {v5, v1}, Lax/f1/x;->l(Landroid/media/MediaCodec$BufferInfo;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    :goto_39
    if-gez v1, :cond_6b

    .line 59
    .line 60
    const/4 v5, -0x2

    .line 61
    if-ne v1, v5, :cond_42

    .line 62
    .line 63
    invoke-direct {v0}, Lax/f1/L;->t1()V

    .line 64
    .line 65
    .line 66
    return v15

    .line 67
    :cond_42
    iget-boolean v1, v0, Lax/f1/L;->b1:Z

    .line 68
    .line 69
    if-eqz v1, :cond_52

    .line 70
    .line 71
    iget-boolean v1, v0, Lax/f1/L;->w1:Z

    .line 72
    .line 73
    if-nez v1, :cond_4f

    .line 74
    .line 75
    iget v1, v0, Lax/f1/L;->p1:I

    .line 76
    .line 77
    const/4 v5, 0x2

    .line 78
    if-ne v1, v5, :cond_52

    .line 79
    .line 80
    :cond_4f
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 81
    .line 82
    .line 83
    :cond_52
    iget-wide v5, v0, Lax/f1/L;->c1:J

    .line 84
    .line 85
    cmp-long v1, v5, v2

    .line 86
    .line 87
    if-eqz v1, :cond_6a

    .line 88
    .line 89
    const-wide/16 v1, 0x64

    .line 90
    .line 91
    add-long/2addr v5, v1

    .line 92
    invoke-virtual {v0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Lax/S0/h;->a()J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    cmp-long v3, v5, v1

    .line 101
    .line 102
    if-gez v3, :cond_6a

    .line 103
    .line 104
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 105
    .line 106
    .line 107
    :cond_6a
    return v4

    .line 108
    :cond_6b
    iget-boolean v6, v0, Lax/f1/L;->a1:Z

    .line 109
    .line 110
    if-eqz v6, :cond_75

    .line 111
    .line 112
    iput-boolean v4, v0, Lax/f1/L;->a1:Z

    .line 113
    .line 114
    invoke-interface {v5, v1, v4}, Lax/f1/x;->m(IZ)V

    .line 115
    .line 116
    .line 117
    return v15

    .line 118
    :cond_75
    iget-object v6, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 119
    .line 120
    iget v7, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 121
    .line 122
    if-nez v7, :cond_85

    .line 123
    .line 124
    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 125
    .line 126
    and-int/lit8 v6, v6, 0x4

    .line 127
    .line 128
    if-eqz v6, :cond_85

    .line 129
    .line 130
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 131
    .line 132
    .line 133
    return v4

    .line 134
    :cond_85
    iput v1, v0, Lax/f1/L;->g1:I

    .line 135
    .line 136
    invoke-interface {v5, v1}, Lax/f1/x;->q(I)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, v0, Lax/f1/L;->h1:Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    if-eqz v1, :cond_a2

    .line 143
    .line 144
    iget-object v6, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 145
    .line 146
    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 147
    .line 148
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Lax/f1/L;->h1:Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    iget-object v6, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 154
    .line 155
    iget v7, v6, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 156
    .line 157
    iget v6, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 158
    .line 159
    add-int/2addr v7, v6

    .line 160
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    :cond_a2
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 164
    .line 165
    iget-wide v6, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 166
    .line 167
    invoke-virtual {v0, v6, v7}, Lax/f1/L;->W1(J)V

    .line 168
    .line 169
    .line 170
    :cond_a9
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 171
    .line 172
    iget-wide v6, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/media3/exoplayer/h;->O()J

    .line 175
    .line 176
    .line 177
    move-result-wide v8

    .line 178
    cmp-long v1, v6, v8

    .line 179
    .line 180
    if-gez v1, :cond_b7

    .line 181
    .line 182
    const/4 v1, 0x1

    .line 183
    goto :goto_b8

    .line 184
    :cond_b7
    const/4 v1, 0x0

    .line 185
    :goto_b8
    iput-boolean v1, v0, Lax/f1/L;->i1:Z

    .line 186
    .line 187
    iget-wide v6, v0, Lax/f1/L;->v1:J

    .line 188
    .line 189
    cmp-long v1, v6, v2

    .line 190
    .line 191
    if-eqz v1, :cond_ca

    .line 192
    .line 193
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 194
    .line 195
    iget-wide v8, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 196
    .line 197
    cmp-long v1, v6, v8

    .line 198
    .line 199
    if-gtz v1, :cond_ca

    .line 200
    .line 201
    const/4 v1, 0x1

    .line 202
    goto :goto_cb

    .line 203
    :cond_ca
    const/4 v1, 0x0

    .line 204
    :goto_cb
    iput-boolean v1, v0, Lax/f1/L;->j1:Z

    .line 205
    .line 206
    iget-boolean v1, v0, Lax/f1/L;->G1:Z

    .line 207
    .line 208
    if-eqz v1, :cond_ee

    .line 209
    .line 210
    iget-wide v6, v0, Lax/f1/L;->H1:J

    .line 211
    .line 212
    cmp-long v1, v6, v2

    .line 213
    .line 214
    if-eqz v1, :cond_e4

    .line 215
    .line 216
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 217
    .line 218
    iget-wide v8, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 219
    .line 220
    cmp-long v1, v8, v6

    .line 221
    .line 222
    if-gtz v1, :cond_e4

    .line 223
    .line 224
    iput-boolean v4, v0, Lax/f1/L;->G1:Z

    .line 225
    .line 226
    iput-wide v2, v0, Lax/f1/L;->H1:J

    .line 227
    .line 228
    goto :goto_ee

    .line 229
    :cond_e4
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 230
    .line 231
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 232
    .line 233
    iput-wide v1, v0, Lax/f1/L;->H1:J

    .line 234
    .line 235
    iput-boolean v15, v0, Lax/f1/L;->i1:Z

    .line 236
    .line 237
    iput-boolean v4, v0, Lax/f1/L;->j1:Z

    .line 238
    .line 239
    :cond_ee
    :goto_ee
    iget-boolean v1, v0, Lax/f1/L;->Y0:Z

    .line 240
    .line 241
    if-eqz v1, :cond_129

    .line 242
    .line 243
    iget-boolean v1, v0, Lax/f1/L;->s1:Z

    .line 244
    .line 245
    if-eqz v1, :cond_129

    .line 246
    .line 247
    :try_start_f6
    iget-object v6, v0, Lax/f1/L;->h1:Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    iget v7, v0, Lax/f1/L;->g1:I

    .line 250
    .line 251
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 252
    .line 253
    iget v8, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 254
    .line 255
    iget-wide v10, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 256
    .line 257
    iget-boolean v12, v0, Lax/f1/L;->i1:Z

    .line 258
    .line 259
    iget-boolean v13, v0, Lax/f1/L;->j1:Z

    .line 260
    .line 261
    iget-object v1, v0, Lax/f1/L;->F0:Lax/P0/v;

    .line 262
    .line 263
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    move-object v14, v1

    .line 268
    check-cast v14, Lax/P0/v;
    :try_end_10d
    .catch Ljava/lang/IllegalStateException; {:try_start_f6 .. :try_end_10d} :catch_11b

    .line 269
    .line 270
    const/4 v9, 0x1

    .line 271
    move-wide/from16 v1, p1

    .line 272
    .line 273
    move-wide/from16 v3, p3

    .line 274
    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    :try_start_114
    invoke-virtual/range {v0 .. v14}, Lax/f1/L;->s1(JJLax/f1/x;Ljava/nio/ByteBuffer;IIIJZZLax/P0/v;)Z

    .line 278
    .line 279
    .line 280
    move-result v1
    :try_end_118
    .catch Ljava/lang/IllegalStateException; {:try_start_114 .. :try_end_118} :catch_119

    .line 281
    goto :goto_14b

    .line 282
    :catch_119
    :goto_119
    nop

    .line 283
    goto :goto_11e

    .line 284
    :catch_11b
    const/16 v16, 0x0

    .line 285
    .line 286
    goto :goto_119

    .line 287
    :goto_11e
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 288
    .line 289
    .line 290
    iget-boolean v1, v0, Lax/f1/L;->x1:Z

    .line 291
    .line 292
    if-eqz v1, :cond_128

    .line 293
    .line 294
    invoke-virtual {v0}, Lax/f1/L;->w1()V

    .line 295
    .line 296
    .line 297
    :cond_128
    return v16

    .line 298
    :cond_129
    const/16 v16, 0x0

    .line 299
    .line 300
    iget-object v6, v0, Lax/f1/L;->h1:Ljava/nio/ByteBuffer;

    .line 301
    .line 302
    iget v7, v0, Lax/f1/L;->g1:I

    .line 303
    .line 304
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 305
    .line 306
    iget v8, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 307
    .line 308
    iget-wide v10, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 309
    .line 310
    iget-boolean v12, v0, Lax/f1/L;->i1:Z

    .line 311
    .line 312
    iget-boolean v13, v0, Lax/f1/L;->j1:Z

    .line 313
    .line 314
    iget-object v1, v0, Lax/f1/L;->F0:Lax/P0/v;

    .line 315
    .line 316
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    move-object v14, v1

    .line 321
    check-cast v14, Lax/P0/v;

    .line 322
    .line 323
    const/4 v9, 0x1

    .line 324
    move-wide/from16 v1, p1

    .line 325
    .line 326
    move-wide/from16 v3, p3

    .line 327
    .line 328
    invoke-virtual/range {v0 .. v14}, Lax/f1/L;->s1(JJLax/f1/x;Ljava/nio/ByteBuffer;IIIJZZLax/P0/v;)Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    :goto_14b
    if-eqz v1, :cond_17c

    .line 333
    .line 334
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 335
    .line 336
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 337
    .line 338
    invoke-virtual {v0, v1, v2}, Lax/f1/L;->n1(J)V

    .line 339
    .line 340
    .line 341
    iget-object v1, v0, Lax/f1/L;->B0:Landroid/media/MediaCodec$BufferInfo;

    .line 342
    .line 343
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 344
    .line 345
    and-int/lit8 v1, v1, 0x4

    .line 346
    .line 347
    if-eqz v1, :cond_15e

    .line 348
    .line 349
    const/4 v4, 0x1

    .line 350
    goto :goto_15f

    .line 351
    :cond_15e
    const/4 v4, 0x0

    .line 352
    :goto_15f
    if-nez v4, :cond_173

    .line 353
    .line 354
    iget-boolean v1, v0, Lax/f1/L;->s1:Z

    .line 355
    .line 356
    if-eqz v1, :cond_173

    .line 357
    .line 358
    iget-boolean v1, v0, Lax/f1/L;->j1:Z

    .line 359
    .line 360
    if-eqz v1, :cond_173

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-interface {v1}, Lax/S0/h;->a()J

    .line 367
    .line 368
    .line 369
    move-result-wide v1

    .line 370
    iput-wide v1, v0, Lax/f1/L;->c1:J

    .line 371
    .line 372
    :cond_173
    invoke-direct {v0}, Lax/f1/L;->D1()V

    .line 373
    .line 374
    .line 375
    if-nez v4, :cond_179

    .line 376
    .line 377
    return v15

    .line 378
    :cond_179
    invoke-direct {v0}, Lax/f1/L;->r1()V

    .line 379
    .line 380
    .line 381
    :cond_17c
    return v16
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

.method private x0(Lax/f1/D;Lax/P0/v;Lax/b1/n;Lax/b1/n;)Z
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p3, p4, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x1

    .line 6
    if-eqz p4, :cond_82

    .line 7
    .line 8
    if-nez p3, :cond_b

    .line 9
    .line 10
    goto/16 :goto_82

    .line 11
    .line 12
    :cond_b
    invoke-interface {p4}, Lax/b1/n;->h()Lax/V0/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    invoke-interface {p3}, Lax/b1/n;->h()Lax/V0/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_82

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_27

    .line 38
    .line 39
    goto :goto_82

    .line 40
    :cond_27
    instance-of v2, v2, Lax/b1/F;

    .line 41
    .line 42
    if-nez v2, :cond_2c

    .line 43
    .line 44
    return v0

    .line 45
    :cond_2c
    invoke-interface {p4}, Lax/b1/n;->b()Ljava/util/UUID;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p3}, Lax/b1/n;->b()Ljava/util/UUID;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3b

    .line 58
    .line 59
    return v1

    .line 60
    :cond_3b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v3, 0x17

    .line 63
    .line 64
    if-ge v2, v3, :cond_42

    .line 65
    .line 66
    return v1

    .line 67
    :cond_42
    sget-object v2, Lax/P0/i;->e:Ljava/util/UUID;

    .line 68
    .line 69
    invoke-interface {p3}, Lax/b1/n;->b()Ljava/util/UUID;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-nez p3, :cond_82

    .line 78
    .line 79
    invoke-interface {p4}, Lax/b1/n;->b()Ljava/util/UUID;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_59

    .line 88
    .line 89
    goto :goto_82

    .line 90
    :cond_59
    iget-boolean p1, p1, Lax/f1/D;->g:Z

    .line 91
    .line 92
    if-nez p1, :cond_81

    .line 93
    .line 94
    invoke-interface {p4}, Lax/b1/n;->getState()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/4 p3, 0x2

    .line 99
    if-eq p1, p3, :cond_80

    .line 100
    .line 101
    invoke-interface {p4}, Lax/b1/n;->getState()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/4 p3, 0x3

    .line 106
    if-eq p1, p3, :cond_72

    .line 107
    .line 108
    invoke-interface {p4}, Lax/b1/n;->getState()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    const/4 p3, 0x4

    .line 113
    if-ne p1, p3, :cond_81

    .line 114
    .line 115
    :cond_72
    iget-object p1, p2, Lax/P0/v;->o:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {p4, p1}, Lax/b1/n;->f(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_81

    .line 128
    .line 129
    :cond_80
    return v1

    .line 130
    :cond_81
    return v0

    .line 131
    :cond_82
    :goto_82
    return v1
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

.method private y1()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/f1/L;->B1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/f1/L;->m1:Z

    .line 6
    .line 7
    iget-object v1, p0, Lax/f1/L;->A0:Lax/f1/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/f1/n;->p()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lax/f1/L;->z0:Lax/V0/i;

    .line 13
    .line 14
    invoke-virtual {v1}, Lax/V0/i;->p()V

    .line 15
    .line 16
    .line 17
    iput-boolean v0, p0, Lax/f1/L;->l1:Z

    .line 18
    .line 19
    iget-object v0, p0, Lax/f1/L;->D0:Lax/a1/D0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/a1/D0;->d()V

    .line 22
    .line 23
    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private z0()Z
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lax/f1/L;->N0:Lax/f1/x;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_229

    .line 7
    .line 8
    iget v0, v1, Lax/f1/L;->p1:I

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq v0, v3, :cond_229

    .line 12
    .line 13
    iget-boolean v4, v1, Lax/f1/L;->w1:Z

    .line 14
    .line 15
    if-eqz v4, :cond_12

    .line 16
    .line 17
    goto/16 :goto_229

    .line 18
    .line 19
    :cond_12
    if-nez v0, :cond_1d

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/f1/L;->N1()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1d

    .line 26
    .line 27
    invoke-direct {v1}, Lax/f1/L;->u0()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v0, v1, Lax/f1/L;->N0:Lax/f1/x;

    .line 31
    .line 32
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v4, v0

    .line 37
    check-cast v4, Lax/f1/x;

    .line 38
    .line 39
    iget v0, v1, Lax/f1/L;->f1:I

    .line 40
    .line 41
    if-gez v0, :cond_40

    .line 42
    .line 43
    invoke-interface {v4}, Lax/f1/x;->j()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, v1, Lax/f1/L;->f1:I

    .line 48
    .line 49
    if-gez v0, :cond_33

    .line 50
    .line 51
    return v2

    .line 52
    :cond_33
    iget-object v5, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 53
    .line 54
    invoke-interface {v4, v0}, Lax/f1/x;->o(I)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, v5, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 61
    .line 62
    invoke-virtual {v0}, Lax/V0/i;->p()V

    .line 63
    .line 64
    .line 65
    :cond_40
    iget v0, v1, Lax/f1/L;->p1:I

    .line 66
    .line 67
    const/4 v11, 0x1

    .line 68
    if-ne v0, v11, :cond_5c

    .line 69
    .line 70
    iget-boolean v0, v1, Lax/f1/L;->b1:Z

    .line 71
    .line 72
    if-eqz v0, :cond_4a

    .line 73
    .line 74
    goto :goto_59

    .line 75
    :cond_4a
    iput-boolean v11, v1, Lax/f1/L;->s1:Z

    .line 76
    .line 77
    iget v5, v1, Lax/f1/L;->f1:I

    .line 78
    .line 79
    const-wide/16 v8, 0x0

    .line 80
    .line 81
    const/4 v10, 0x4

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    invoke-interface/range {v4 .. v10}, Lax/f1/x;->c(IIIJI)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v1}, Lax/f1/L;->C1()V

    .line 88
    .line 89
    .line 90
    :goto_59
    iput v3, v1, Lax/f1/L;->p1:I

    .line 91
    .line 92
    return v2

    .line 93
    :cond_5c
    iget-boolean v0, v1, Lax/f1/L;->Z0:Z

    .line 94
    .line 95
    if-eqz v0, :cond_81

    .line 96
    .line 97
    iput-boolean v2, v1, Lax/f1/L;->Z0:Z

    .line 98
    .line 99
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 100
    .line 101
    iget-object v0, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    sget-object v2, Lax/f1/L;->J1:[B

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    .line 114
    iget v5, v1, Lax/f1/L;->f1:I

    .line 115
    .line 116
    array-length v7, v2

    .line 117
    const-wide/16 v8, 0x0

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-interface/range {v4 .. v10}, Lax/f1/x;->c(IIIJI)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v1}, Lax/f1/L;->C1()V

    .line 125
    .line 126
    .line 127
    iput-boolean v11, v1, Lax/f1/L;->r1:Z

    .line 128
    .line 129
    return v11

    .line 130
    :cond_81
    iget v0, v1, Lax/f1/L;->o1:I

    .line 131
    .line 132
    if-ne v0, v11, :cond_b2

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    :goto_86
    iget-object v5, v1, Lax/f1/L;->O0:Lax/P0/v;

    .line 136
    .line 137
    invoke-static {v5}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Lax/P0/v;

    .line 142
    .line 143
    iget-object v5, v5, Lax/P0/v;->r:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-ge v0, v5, :cond_b0

    .line 150
    .line 151
    iget-object v5, v1, Lax/f1/L;->O0:Lax/P0/v;

    .line 152
    .line 153
    iget-object v5, v5, Lax/P0/v;->r:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, [B

    .line 160
    .line 161
    iget-object v6, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 162
    .line 163
    iget-object v6, v6, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    invoke-static {v6}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 172
    .line 173
    .line 174
    add-int/lit8 v0, v0, 0x1

    .line 175
    .line 176
    goto :goto_86

    .line 177
    :cond_b0
    iput v3, v1, Lax/f1/L;->o1:I

    .line 178
    .line 179
    :cond_b2
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 180
    .line 181
    iget-object v0, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-virtual {v1}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    :try_start_c4
    iget-object v6, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 198
    .line 199
    invoke-virtual {v1, v5, v6, v2}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 200
    .line 201
    .line 202
    move-result v6
    :try_end_ca
    .catch Lax/V0/i$a; {:try_start_c4 .. :try_end_ca} :catch_21e

    .line 203
    const/4 v7, -0x3

    .line 204
    if-ne v6, v7, :cond_d8

    .line 205
    .line 206
    invoke-virtual {v1}, Landroidx/media3/exoplayer/h;->n()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_d7

    .line 211
    .line 212
    iget-wide v3, v1, Lax/f1/L;->u1:J

    .line 213
    .line 214
    iput-wide v3, v1, Lax/f1/L;->v1:J

    .line 215
    .line 216
    :cond_d7
    return v2

    .line 217
    :cond_d8
    const/4 v7, -0x5

    .line 218
    if-ne v6, v7, :cond_ea

    .line 219
    .line 220
    iget v0, v1, Lax/f1/L;->o1:I

    .line 221
    .line 222
    if-ne v0, v3, :cond_e6

    .line 223
    .line 224
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 225
    .line 226
    invoke-virtual {v0}, Lax/V0/i;->p()V

    .line 227
    .line 228
    .line 229
    iput v11, v1, Lax/f1/L;->o1:I

    .line 230
    .line 231
    :cond_e6
    invoke-virtual {v1, v5}, Lax/f1/L;->k1(Lax/Y0/O;)Lax/Y0/c;

    .line 232
    .line 233
    .line 234
    return v11

    .line 235
    :cond_ea
    iget-object v5, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 236
    .line 237
    invoke-virtual {v5}, Lax/V0/a;->s()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_120

    .line 242
    .line 243
    iget-wide v5, v1, Lax/f1/L;->u1:J

    .line 244
    .line 245
    iput-wide v5, v1, Lax/f1/L;->v1:J

    .line 246
    .line 247
    iget v0, v1, Lax/f1/L;->o1:I

    .line 248
    .line 249
    if-ne v0, v3, :cond_101

    .line 250
    .line 251
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 252
    .line 253
    invoke-virtual {v0}, Lax/V0/i;->p()V

    .line 254
    .line 255
    .line 256
    iput v11, v1, Lax/f1/L;->o1:I

    .line 257
    .line 258
    :cond_101
    iput-boolean v11, v1, Lax/f1/L;->w1:Z

    .line 259
    .line 260
    iget-boolean v0, v1, Lax/f1/L;->r1:Z

    .line 261
    .line 262
    if-nez v0, :cond_10b

    .line 263
    .line 264
    invoke-direct {v1}, Lax/f1/L;->r1()V

    .line 265
    .line 266
    .line 267
    return v2

    .line 268
    :cond_10b
    iget-boolean v0, v1, Lax/f1/L;->b1:Z

    .line 269
    .line 270
    if-eqz v0, :cond_110

    .line 271
    .line 272
    goto :goto_11f

    .line 273
    :cond_110
    iput-boolean v11, v1, Lax/f1/L;->s1:Z

    .line 274
    .line 275
    iget v5, v1, Lax/f1/L;->f1:I

    .line 276
    .line 277
    const-wide/16 v8, 0x0

    .line 278
    .line 279
    const/4 v10, 0x4

    .line 280
    const/4 v6, 0x0

    .line 281
    const/4 v7, 0x0

    .line 282
    invoke-interface/range {v4 .. v10}, Lax/f1/x;->c(IIIJI)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v1}, Lax/f1/L;->C1()V

    .line 286
    .line 287
    .line 288
    :goto_11f
    return v2

    .line 289
    :cond_120
    iget-boolean v5, v1, Lax/f1/L;->r1:Z

    .line 290
    .line 291
    if-nez v5, :cond_138

    .line 292
    .line 293
    iget-object v5, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 294
    .line 295
    invoke-virtual {v5}, Lax/V0/a;->u()Z

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    if-nez v5, :cond_138

    .line 300
    .line 301
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 302
    .line 303
    invoke-virtual {v0}, Lax/V0/i;->p()V

    .line 304
    .line 305
    .line 306
    iget v0, v1, Lax/f1/L;->o1:I

    .line 307
    .line 308
    if-ne v0, v3, :cond_137

    .line 309
    .line 310
    iput v11, v1, Lax/f1/L;->o1:I

    .line 311
    .line 312
    :cond_137
    return v11

    .line 313
    :cond_138
    iget-object v3, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 314
    .line 315
    invoke-virtual {v1, v3}, Lax/f1/L;->K1(Lax/V0/i;)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_141

    .line 320
    .line 321
    return v11

    .line 322
    :cond_141
    iget-object v3, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 323
    .line 324
    invoke-virtual {v3}, Lax/V0/i;->E()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_150

    .line 329
    .line 330
    iget-object v5, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 331
    .line 332
    iget-object v5, v5, Lax/V0/i;->d0:Lax/V0/c;

    .line 333
    .line 334
    invoke-virtual {v5, v0}, Lax/V0/c;->b(I)V

    .line 335
    .line 336
    .line 337
    :cond_150
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 338
    .line 339
    iget-wide v5, v0, Lax/V0/i;->g0:J

    .line 340
    .line 341
    iget-boolean v0, v1, Lax/f1/L;->y1:Z

    .line 342
    .line 343
    if-eqz v0, :cond_187

    .line 344
    .line 345
    iget-object v0, v1, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_176

    .line 352
    .line 353
    iget-object v0, v1, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Lax/f1/L$e;

    .line 360
    .line 361
    iget-object v0, v0, Lax/f1/L$e;->d:Lax/S0/L;

    .line 362
    .line 363
    iget-object v7, v1, Lax/f1/L;->E0:Lax/P0/v;

    .line 364
    .line 365
    invoke-static {v7}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    check-cast v7, Lax/P0/v;

    .line 370
    .line 371
    invoke-virtual {v0, v5, v6, v7}, Lax/S0/L;->a(JLjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    goto :goto_185

    .line 375
    :cond_176
    iget-object v0, v1, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 376
    .line 377
    iget-object v0, v0, Lax/f1/L$e;->d:Lax/S0/L;

    .line 378
    .line 379
    iget-object v7, v1, Lax/f1/L;->E0:Lax/P0/v;

    .line 380
    .line 381
    invoke-static {v7}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    check-cast v7, Lax/P0/v;

    .line 386
    .line 387
    invoke-virtual {v0, v5, v6, v7}, Lax/S0/L;->a(JLjava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :goto_185
    iput-boolean v2, v1, Lax/f1/L;->y1:Z

    .line 391
    .line 392
    :cond_187
    iget-wide v7, v1, Lax/f1/L;->u1:J

    .line 393
    .line 394
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 395
    .line 396
    .line 397
    move-result-wide v7

    .line 398
    iput-wide v7, v1, Lax/f1/L;->u1:J

    .line 399
    .line 400
    invoke-virtual {v1}, Landroidx/media3/exoplayer/h;->n()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_19d

    .line 405
    .line 406
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 407
    .line 408
    invoke-virtual {v0}, Lax/V0/a;->w()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_1a1

    .line 413
    .line 414
    :cond_19d
    iget-wide v7, v1, Lax/f1/L;->u1:J

    .line 415
    .line 416
    iput-wide v7, v1, Lax/f1/L;->v1:J

    .line 417
    .line 418
    :cond_1a1
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 419
    .line 420
    invoke-virtual {v0}, Lax/V0/i;->D()V

    .line 421
    .line 422
    .line 423
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 424
    .line 425
    invoke-virtual {v0}, Lax/V0/a;->r()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_1b3

    .line 430
    .line 431
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Lax/f1/L;->T0(Lax/V0/i;)V

    .line 434
    .line 435
    .line 436
    :cond_1b3
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 437
    .line 438
    invoke-virtual {v1, v0}, Lax/f1/L;->p1(Lax/V0/i;)V

    .line 439
    .line 440
    .line 441
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 442
    .line 443
    invoke-virtual {v1, v0}, Lax/f1/L;->F0(Lax/V0/i;)I

    .line 444
    .line 445
    .line 446
    move-result v18

    .line 447
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 448
    .line 449
    const/16 v7, 0x22

    .line 450
    .line 451
    if-lt v0, v7, :cond_1c8

    .line 452
    .line 453
    and-int/lit8 v0, v18, 0x20

    .line 454
    .line 455
    if-nez v0, :cond_1dc

    .line 456
    .line 457
    :cond_1c8
    invoke-virtual {v1}, Landroidx/media3/exoplayer/h;->L()Lax/Y0/W;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    iget-boolean v0, v0, Lax/Y0/W;->b:Z

    .line 462
    .line 463
    if-nez v0, :cond_1dc

    .line 464
    .line 465
    iget-wide v7, v1, Lax/f1/L;->I1:J

    .line 466
    .line 467
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 468
    .line 469
    iget-wide v9, v0, Lax/V0/i;->g0:J

    .line 470
    .line 471
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 472
    .line 473
    .line 474
    move-result-wide v7

    .line 475
    iput-wide v7, v1, Lax/f1/L;->I1:J

    .line 476
    .line 477
    :cond_1dc
    if-eqz v3, :cond_1f2

    .line 478
    .line 479
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    move-object v12, v0

    .line 484
    check-cast v12, Lax/f1/x;

    .line 485
    .line 486
    iget v13, v1, Lax/f1/L;->f1:I

    .line 487
    .line 488
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 489
    .line 490
    iget-object v15, v0, Lax/V0/i;->d0:Lax/V0/c;

    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    move-wide/from16 v16, v5

    .line 494
    .line 495
    invoke-interface/range {v12 .. v18}, Lax/f1/x;->b(IILax/V0/c;JI)V

    .line 496
    .line 497
    .line 498
    goto :goto_20f

    .line 499
    :cond_1f2
    move-wide/from16 v16, v5

    .line 500
    .line 501
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    move-object v12, v0

    .line 506
    check-cast v12, Lax/f1/x;

    .line 507
    .line 508
    iget v13, v1, Lax/f1/L;->f1:I

    .line 509
    .line 510
    iget-object v0, v1, Lax/f1/L;->y0:Lax/V0/i;

    .line 511
    .line 512
    iget-object v0, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 513
    .line 514
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 521
    .line 522
    .line 523
    move-result v15

    .line 524
    const/4 v14, 0x0

    .line 525
    invoke-interface/range {v12 .. v18}, Lax/f1/x;->c(IIIJI)V

    .line 526
    .line 527
    .line 528
    :goto_20f
    invoke-direct {v1}, Lax/f1/L;->C1()V

    .line 529
    .line 530
    .line 531
    iput-boolean v11, v1, Lax/f1/L;->r1:Z

    .line 532
    .line 533
    iput v2, v1, Lax/f1/L;->o1:I

    .line 534
    .line 535
    iget-object v0, v1, Lax/f1/L;->B1:Lax/Y0/b;

    .line 536
    .line 537
    iget v2, v0, Lax/Y0/b;->c:I

    .line 538
    .line 539
    add-int/2addr v2, v11

    .line 540
    iput v2, v0, Lax/Y0/b;->c:I

    .line 541
    .line 542
    return v11

    .line 543
    :catch_21e
    move-exception v0

    .line 544
    invoke-virtual {v1, v0}, Lax/f1/L;->h1(Ljava/lang/Exception;)V

    .line 545
    .line 546
    .line 547
    invoke-direct {v1, v2}, Lax/f1/L;->u1(I)Z

    .line 548
    .line 549
    .line 550
    invoke-direct {v1}, Lax/f1/L;->A0()V

    .line 551
    .line 552
    .line 553
    return v11

    .line 554
    :cond_229
    :goto_229
    return v2
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
.end method


# virtual methods
.method public final A()I
    .registers 2

    .line 1
    const/16 v0, 0x8

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

.method protected A1()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/f1/L;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/f1/L;->A1:Landroidx/media3/exoplayer/s;

    .line 6
    .line 7
    iput-object v0, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, Lax/f1/L;->U0:Lax/f1/D;

    .line 10
    .line 11
    iput-object v0, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 12
    .line 13
    iput-object v0, p0, Lax/f1/L;->P0:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lax/f1/L;->Q0:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lax/f1/L;->t1:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, Lax/f1/L;->R0:F

    .line 23
    .line 24
    iput v0, p0, Lax/f1/L;->V0:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lax/f1/L;->W0:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lax/f1/L;->X0:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lax/f1/L;->Y0:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lax/f1/L;->b1:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lax/f1/L;->d1:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lax/f1/L;->n1:Z

    .line 37
    .line 38
    iput v0, p0, Lax/f1/L;->o1:I

    .line 39
    .line 40
    return-void
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

.method public B(ILjava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    if-ne p1, v0, :cond_f

    .line 4
    .line 5
    check-cast p2, Landroidx/media3/exoplayer/M0$a;

    .line 6
    .line 7
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/media3/exoplayer/M0$a;

    .line 12
    .line 13
    iput-object p1, p0, Lax/f1/L;->I0:Landroidx/media3/exoplayer/M0$a;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/h;->B(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method protected final B0()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/f1/L;->C0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/f1/L;->e1()V

    .line 8
    .line 9
    .line 10
    :cond_9
    return v0
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

.method protected final E0()Lax/f1/x;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

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

.method protected F0(Lax/V0/i;)I
    .registers 2

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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
.end method

.method protected final G0()Lax/f1/D;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L;->U0:Lax/f1/D;

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

.method protected final G1()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/f1/L;->z1:Z

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

.method protected final H0()Lax/P0/v;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L;->O0:Lax/P0/v;

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

.method protected final H1(Landroidx/media3/exoplayer/s;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/f1/L;->A1:Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    return-void
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

.method protected I0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

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

.method protected abstract J0(FLax/P0/v;[Lax/P0/v;)F
.end method

.method protected final K0()Landroid/media/MediaFormat;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L;->P0:Landroid/media/MediaFormat;

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

.method protected K1(Lax/V0/i;)Z
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Lax/f1/L;->P1(Lax/V0/i;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/V0/i;->p()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 11
    .line 12
    iget v0, p1, Lax/Y0/b;->d:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p1, Lax/Y0/b;->d:I

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method protected abstract L0(Lax/f1/Q;Lax/P0/v;Z)Ljava/util/List;
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
.end method

.method protected L1()Z
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

.method protected M0(JJZ)J
    .registers 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/h;->o(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
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

.method protected M1(Lax/f1/D;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
.end method

.method protected N0()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/f1/L;->v1:J

    .line 2
    .line 3
    return-wide v0
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

.method protected N1()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

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

.method protected abstract O0(Lax/f1/D;Lax/P0/v;Landroid/media/MediaCrypto;F)Lax/f1/x$a;
.end method

.method protected O1()Z
    .registers 6

    .line 1
    iget v0, p0, Lax/f1/L;->q1:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_37

    .line 6
    .line 7
    iget-boolean v1, p0, Lax/f1/L;->W0:Z

    .line 8
    .line 9
    if-eqz v1, :cond_e

    .line 10
    .line 11
    iget-boolean v1, p0, Lax/f1/L;->t1:Z

    .line 12
    .line 13
    if-eqz v1, :cond_37

    .line 14
    .line 15
    :cond_e
    iget-boolean v1, p0, Lax/f1/L;->X0:Z

    .line 16
    .line 17
    if-eqz v1, :cond_17

    .line 18
    .line 19
    iget-boolean v1, p0, Lax/f1/L;->s1:Z

    .line 20
    .line 21
    if-eqz v1, :cond_17

    .line 22
    .line 23
    goto :goto_37

    .line 24
    :cond_17
    const/4 v1, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-ne v0, v1, :cond_36

    .line 27
    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v1, 0x17

    .line 31
    .line 32
    if-lt v0, v1, :cond_23

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    goto :goto_24

    .line 36
    :cond_23
    const/4 v4, 0x0

    .line 37
    :goto_24
    invoke-static {v4}, Lax/S0/a;->g(Z)V

    .line 38
    .line 39
    .line 40
    if-lt v0, v1, :cond_36

    .line 41
    .line 42
    :try_start_29
    invoke-direct {p0}, Lax/f1/L;->V1()V
    :try_end_2c
    .catch Landroidx/media3/exoplayer/s; {:try_start_29 .. :try_end_2c} :catch_2d

    .line 43
    .line 44
    .line 45
    goto :goto_36

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    const-string v1, "MediaCodecRenderer"

    .line 48
    .line 49
    const-string v3, "Failed to update the DRM session, releasing the codec instead."

    .line 50
    .line 51
    invoke-static {v1, v3, v0}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_36
    :goto_36
    return v3

    .line 56
    :cond_37
    :goto_37
    return v2
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

.method protected final P0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 2
    .line 3
    iget-wide v0, v0, Lax/f1/L$e;->c:J

    .line 4
    .line 5
    return-wide v0
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

.method protected P1(Lax/V0/i;)Z
    .registers 2

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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
.end method

.method protected final Q0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 2
    .line 3
    iget-wide v0, v0, Lax/f1/L$e;->b:J

    .line 4
    .line 5
    return-wide v0
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

.method protected Q1(Lax/P0/v;)Z
    .registers 2

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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
.end method

.method protected R0()F
    .registers 2

    .line 1
    iget v0, p0, Lax/f1/L;->L0:F

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

.method protected abstract R1(Lax/f1/Q;Lax/P0/v;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/f1/a0$c;
        }
    .end annotation
.end method

.method protected final S0()Landroidx/media3/exoplayer/M0$a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/L;->I0:Landroidx/media3/exoplayer/M0$a;

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

.method protected abstract T0(Lax/V0/i;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation
.end method

.method protected final T1()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/f1/L;->U1(Lax/P0/v;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method protected U()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 3
    .line 4
    sget-object v0, Lax/f1/L$e;->e:Lax/f1/L$e;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/f1/L;->F1(Lax/f1/L$e;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lax/f1/L;->k1:Z

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-direct {p0}, Lax/f1/L;->s0()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    invoke-direct {p0}, Lax/f1/L;->C0()Z

    .line 23
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

.method protected V(ZZ)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    new-instance p1, Lax/Y0/b;

    .line 2
    .line 3
    invoke-direct {p1}, Lax/Y0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

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

.method protected V0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->G1:Z

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

.method protected final W1(J)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 2
    .line 3
    iget-object v0, v0, Lax/f1/L$e;->d:Lax/S0/L;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lax/S0/L;->j(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lax/P0/v;

    .line 10
    .line 11
    if-nez p1, :cond_1e

    .line 12
    .line 13
    iget-boolean p2, p0, Lax/f1/L;->E1:Z

    .line 14
    .line 15
    if-eqz p2, :cond_1e

    .line 16
    .line 17
    iget-object p2, p0, Lax/f1/L;->P0:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_1e

    .line 20
    .line 21
    iget-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 22
    .line 23
    iget-object p1, p1, Lax/f1/L$e;->d:Lax/S0/L;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/S0/L;->i()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lax/P0/v;

    .line 30
    .line 31
    :cond_1e
    if-eqz p1, :cond_23

    .line 32
    .line 33
    iput-object p1, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 34
    .line 35
    goto :goto_2b

    .line 36
    :cond_23
    iget-boolean p1, p0, Lax/f1/L;->Q0:Z

    .line 37
    .line 38
    if-eqz p1, :cond_3d

    .line 39
    .line 40
    iget-object p1, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 41
    .line 42
    if-eqz p1, :cond_3d

    .line 43
    .line 44
    :goto_2b
    iget-object p1, p0, Lax/f1/L;->F0:Lax/P0/v;

    .line 45
    .line 46
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lax/P0/v;

    .line 51
    .line 52
    iget-object p2, p0, Lax/f1/L;->P0:Landroid/media/MediaFormat;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Lax/f1/L;->l1(Lax/P0/v;Landroid/media/MediaFormat;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, p0, Lax/f1/L;->Q0:Z

    .line 59
    .line 60
    iput-boolean p1, p0, Lax/f1/L;->E1:Z

    .line 61
    .line 62
    :cond_3d
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

.method protected X(JZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lax/f1/L;->w1:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lax/f1/L;->x1:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Lax/f1/L;->z1:Z

    .line 7
    .line 8
    iget-boolean p1, p0, Lax/f1/L;->k1:Z

    .line 9
    .line 10
    if-eqz p1, :cond_f

    .line 11
    .line 12
    invoke-direct {p0}, Lax/f1/L;->y1()V

    .line 13
    .line 14
    .line 15
    goto :goto_12

    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/f1/L;->B0()Z

    .line 17
    .line 18
    .line 19
    :goto_12
    iget-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 20
    .line 21
    iget-object p1, p1, Lax/f1/L$e;->d:Lax/S0/L;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/S0/L;->l()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-lez p1, :cond_1f

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lax/f1/L;->y1:Z

    .line 31
    .line 32
    :cond_1f
    iget-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 33
    .line 34
    iget-object p1, p1, Lax/f1/L$e;->d:Lax/S0/L;

    .line 35
    .line 36
    invoke-virtual {p1}, Lax/S0/L;->c()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 42
    .line 43
    .line 44
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

.method protected a0()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lax/f1/L;->s0()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/f1/L;->w1()V
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_b

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/f1/L;->I1(Lax/b1/n;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_b
    move-exception v1

    .line 13
    invoke-direct {p0, v0}, Lax/f1/L;->I1(Lax/b1/n;)V

    .line 14
    .line 15
    .line 16
    throw v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected final a1()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->k1:Z

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

.method public final b(Lax/P0/v;)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/f1/L;->u0:Lax/f1/Q;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lax/f1/L;->R1(Lax/f1/Q;Lax/P0/v;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Lax/f1/a0$c; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1, v1}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected b0()V
    .registers 1

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

.method protected final b1(Lax/P0/v;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/f1/L;->Q1(Lax/P0/v;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

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

.method public c()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->x1:Z

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

.method protected c0()V
    .registers 1

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

.method protected d0([Lax/P0/v;JJLax/i1/F$b;)V
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 2
    .line 3
    iget-wide v0, p1, Lax/f1/L$e;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_24

    .line 13
    .line 14
    new-instance v4, Lax/f1/L$e;

    .line 15
    .line 16
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-wide v7, p2

    .line 22
    move-wide v9, p4

    .line 23
    invoke-direct/range {v4 .. v10}, Lax/f1/L$e;-><init>(JJJ)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v4}, Lax/f1/L;->F1(Lax/f1/L$e;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lax/f1/L;->F1:Z

    .line 30
    .line 31
    if-eqz p1, :cond_56

    .line 32
    .line 33
    invoke-virtual {p0}, Lax/f1/L;->o1()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    iget-object p1, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_57

    .line 44
    .line 45
    iget-wide v0, p0, Lax/f1/L;->u1:J

    .line 46
    .line 47
    cmp-long p1, v0, v2

    .line 48
    .line 49
    if-eqz p1, :cond_3c

    .line 50
    .line 51
    iget-wide v4, p0, Lax/f1/L;->D1:J

    .line 52
    .line 53
    cmp-long p1, v4, v2

    .line 54
    .line 55
    if-eqz p1, :cond_57

    .line 56
    .line 57
    cmp-long p1, v4, v0

    .line 58
    .line 59
    if-ltz p1, :cond_57

    .line 60
    .line 61
    :cond_3c
    new-instance v4, Lax/f1/L$e;

    .line 62
    .line 63
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    move-wide v7, p2

    .line 69
    move-wide v9, p4

    .line 70
    invoke-direct/range {v4 .. v10}, Lax/f1/L$e;-><init>(JJJ)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v4}, Lax/f1/L;->F1(Lax/f1/L$e;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lax/f1/L;->C1:Lax/f1/L$e;

    .line 77
    .line 78
    iget-wide p1, p1, Lax/f1/L$e;->c:J

    .line 79
    .line 80
    cmp-long p3, p1, v2

    .line 81
    .line 82
    if-eqz p3, :cond_56

    .line 83
    .line 84
    invoke-virtual {p0}, Lax/f1/L;->o1()V

    .line 85
    .line 86
    .line 87
    :cond_56
    return-void

    .line 88
    :cond_57
    iget-object p1, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 89
    .line 90
    new-instance v0, Lax/f1/L$e;

    .line 91
    .line 92
    iget-wide v1, p0, Lax/f1/L;->u1:J

    .line 93
    .line 94
    move-wide v3, p2

    .line 95
    move-wide v5, p4

    .line 96
    invoke-direct/range {v0 .. v6}, Lax/f1/L$e;-><init>(JJJ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    return-void
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

.method protected final e1()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 2
    .line 3
    if-nez v0, :cond_6b

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/f1/L;->k1:Z

    .line 6
    .line 7
    if-nez v0, :cond_6b

    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_6b

    .line 14
    :cond_d
    invoke-virtual {p0, v0}, Lax/f1/L;->b1(Lax/P0/v;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_17

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lax/f1/L;->X0(Lax/P0/v;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    iget-object v1, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 30
    .line 31
    if-eqz v1, :cond_26

    .line 32
    .line 33
    invoke-direct {p0}, Lax/f1/L;->Z0()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_55

    .line 38
    .line 39
    :cond_26
    :try_start_26
    iget-object v1, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 40
    .line 41
    if-eqz v1, :cond_4f

    .line 42
    .line 43
    invoke-interface {v1}, Lax/b1/n;->getState()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x3

    .line 48
    if-eq v1, v2, :cond_3d

    .line 49
    .line 50
    iget-object v1, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 51
    .line 52
    invoke-interface {v1}, Lax/b1/n;->getState()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, 0x4

    .line 57
    if-ne v1, v2, :cond_4f

    .line 58
    .line 59
    goto :goto_3d

    .line 60
    :catch_3b
    move-exception v1

    .line 61
    goto :goto_64

    .line 62
    :cond_3d
    :goto_3d
    iget-object v1, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 63
    .line 64
    iget-object v2, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v1, v2}, Lax/b1/n;->f(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4f

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v1, 0x0

    .line 81
    :goto_50
    iget-object v2, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-direct {p0, v2, v1}, Lax/f1/L;->f1(Landroid/media/MediaCrypto;Z)V
    :try_end_55
    .catch Lax/f1/L$c; {:try_start_26 .. :try_end_55} :catch_3b

    .line 84
    .line 85
    .line 86
    :cond_55
    iget-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 87
    .line 88
    if-eqz v0, :cond_6b

    .line 89
    .line 90
    iget-object v1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 91
    .line 92
    if-nez v1, :cond_6b

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 99
    .line 100
    return-void

    .line 101
    :goto_64
    const/16 v2, 0xfa1

    .line 102
    .line 103
    invoke-virtual {p0, v1, v0, v2}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    throw v0

    .line 108
    :cond_6b
    :goto_6b
    return-void
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

.method protected g1(Lax/P0/v;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
.end method

.method protected abstract h1(Ljava/lang/Exception;)V
.end method

.method public i(JJ)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/f1/L;->z1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_a

    .line 5
    .line 6
    iput-boolean v1, p0, Lax/f1/L;->z1:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lax/f1/L;->r1()V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/f1/L;->A1:Landroidx/media3/exoplayer/s;

    .line 12
    .line 13
    if-nez v0, :cond_c9

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_f
    iget-boolean v2, p0, Lax/f1/L;->x1:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1d

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/f1/L;->x1()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_17
    move-exception p1

    .line 25
    goto/16 :goto_83

    .line 26
    .line 27
    :catch_1a
    move-exception p1

    .line 28
    goto/16 :goto_ba

    .line 29
    .line 30
    :cond_1d
    iget-object v2, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 31
    .line 32
    if-nez v2, :cond_29

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {p0, v2}, Lax/f1/L;->u1(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_29

    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-virtual {p0}, Lax/f1/L;->e1()V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p0, Lax/f1/L;->k1:Z

    .line 46
    .line 47
    if-eqz v2, :cond_40

    .line 48
    .line 49
    const-string v2, "bypassRender"

    .line 50
    .line 51
    invoke-static {v2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_35
    invoke-direct {p0, p1, p2, p3, p4}, Lax/f1/L;->k0(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3c

    .line 59
    .line 60
    goto :goto_35

    .line 61
    :cond_3c
    invoke-static {}, Lax/S0/N;->b()V

    .line 62
    .line 63
    .line 64
    goto :goto_7d

    .line 65
    :cond_40
    iget-object v2, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 66
    .line 67
    if-eqz v2, :cond_6f

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Lax/S0/h;->b()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    const-string v4, "drainAndFeed"

    .line 78
    .line 79
    invoke-static {v4}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_51
    invoke-direct {p0, p1, p2, p3, p4}, Lax/f1/L;->w0(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_5e

    .line 87
    .line 88
    invoke-direct {p0, v2, v3}, Lax/f1/L;->J1(J)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_5e

    .line 93
    .line 94
    goto :goto_51

    .line 95
    :cond_5e
    :goto_5e
    invoke-direct {p0}, Lax/f1/L;->z0()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_6b

    .line 100
    .line 101
    invoke-direct {p0, v2, v3}, Lax/f1/L;->J1(J)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_6b

    .line 106
    .line 107
    goto :goto_5e

    .line 108
    :cond_6b
    invoke-static {}, Lax/S0/N;->b()V

    .line 109
    .line 110
    .line 111
    goto :goto_7d

    .line 112
    :cond_6f
    iget-object p3, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 113
    .line 114
    iget p4, p3, Lax/Y0/b;->d:I

    .line 115
    .line 116
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/h;->h0(J)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    add-int/2addr p4, p1

    .line 121
    iput p4, p3, Lax/Y0/b;->d:I

    .line 122
    .line 123
    invoke-direct {p0, v0}, Lax/f1/L;->u1(I)Z

    .line 124
    .line 125
    .line 126
    :goto_7d
    iget-object p1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 127
    .line 128
    invoke-virtual {p1}, Lax/Y0/b;->c()V
    :try_end_82
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_f .. :try_end_82} :catch_1a
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_82} :catch_17

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :goto_83
    invoke-static {p1}, Lax/f1/L;->d1(Ljava/lang/IllegalStateException;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_b9

    .line 137
    .line 138
    invoke-virtual {p0, p1}, Lax/f1/L;->h1(Ljava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 142
    .line 143
    if-eqz p2, :cond_9a

    .line 144
    .line 145
    move-object p2, p1

    .line 146
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 147
    .line 148
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_9a

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    :cond_9a
    if-eqz v1, :cond_9f

    .line 156
    .line 157
    invoke-virtual {p0}, Lax/f1/L;->w1()V

    .line 158
    .line 159
    .line 160
    :cond_9f
    invoke-virtual {p0}, Lax/f1/L;->G0()Lax/f1/D;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p0, p1, p2}, Lax/f1/L;->r0(Ljava/lang/Throwable;Lax/f1/D;)Lax/f1/B;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget p2, p1, Lax/f1/B;->d0:I

    .line 169
    .line 170
    const/16 p3, 0x44d

    .line 171
    .line 172
    if-ne p2, p3, :cond_b0

    .line 173
    .line 174
    const/16 p2, 0xfa6

    .line 175
    .line 176
    goto :goto_b2

    .line 177
    :cond_b0
    const/16 p2, 0xfa3

    .line 178
    .line 179
    :goto_b2
    iget-object p3, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 180
    .line 181
    invoke-virtual {p0, p1, p3, v1, p2}, Landroidx/media3/exoplayer/h;->J(Ljava/lang/Throwable;Lax/P0/v;ZI)Landroidx/media3/exoplayer/s;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    throw p1

    .line 186
    :cond_b9
    throw p1

    .line 187
    :goto_ba
    iget-object p2, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    invoke-static {p3}, Lax/S0/d0;->b0(I)I

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    throw p1

    .line 202
    :cond_c9
    const/4 p1, 0x0

    .line 203
    iput-object p1, p0, Lax/f1/L;->A1:Landroidx/media3/exoplayer/s;

    .line 204
    .line 205
    throw v0
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

.method protected abstract i1(Ljava/lang/String;Lax/f1/x$a;JJ)V
.end method

.method public isReady()Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_2b

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->T()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_29

    .line 10
    .line 11
    invoke-direct {p0}, Lax/f1/L;->U0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_29

    .line 16
    .line 17
    iget-wide v0, p0, Lax/f1/L;->e1:J

    .line 18
    .line 19
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v4, v0, v2

    .line 25
    .line 26
    if-eqz v4, :cond_2b

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->K()Lax/S0/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iget-wide v2, p0, Lax/f1/L;->e1:J

    .line 37
    .line 38
    cmp-long v4, v0, v2

    .line 39
    .line 40
    if-gez v4, :cond_2b

    .line 41
    .line 42
    :cond_29
    const/4 v0, 0x1

    .line 43
    return v0

    .line 44
    :cond_2b
    const/4 v0, 0x0

    .line 45
    return v0
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

.method protected abstract j1(Ljava/lang/String;)V
.end method

.method protected k1(Lax/Y0/O;)Lax/Y0/c;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/f1/L;->y1:Z

    .line 3
    .line 4
    iget-object v1, p1, Lax/Y0/O;->b:Lax/P0/v;

    .line 5
    .line 6
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lax/P0/v;

    .line 11
    .line 12
    iget-object v2, v1, Lax/P0/v;->o:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v2, :cond_11b

    .line 15
    .line 16
    const-string v3, "video/av01"

    .line 17
    .line 18
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_22

    .line 24
    .line 25
    iget-object v2, v1, Lax/P0/v;->o:Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "video/x-vnd.on2.vp9"

    .line 28
    .line 29
    invoke-static {v2, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_36

    .line 34
    .line 35
    :cond_22
    iget-object v2, v1, Lax/P0/v;->r:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_36

    .line 42
    .line 43
    invoke-virtual {v1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v3}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_36
    move-object v7, v1

    .line 56
    iget-object p1, p1, Lax/Y0/O;->a:Lax/b1/n;

    .line 57
    .line 58
    invoke-direct {p0, p1}, Lax/f1/L;->I1(Lax/b1/n;)V

    .line 59
    .line 60
    .line 61
    iput-object v7, p0, Lax/f1/L;->E0:Lax/P0/v;

    .line 62
    .line 63
    iget-boolean p1, p0, Lax/f1/L;->k1:Z

    .line 64
    .line 65
    if-eqz p1, :cond_45

    .line 66
    .line 67
    iput-boolean v0, p0, Lax/f1/L;->m1:Z

    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_45
    iget-object p1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 71
    .line 72
    if-nez p1, :cond_4f

    .line 73
    .line 74
    iput-object v3, p0, Lax/f1/L;->S0:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-virtual {p0}, Lax/f1/L;->e1()V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :cond_4f
    iget-object v1, p0, Lax/f1/L;->U0:Lax/f1/D;

    .line 81
    .line 82
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lax/f1/D;

    .line 87
    .line 88
    iget-object v2, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 89
    .line 90
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v6, v2

    .line 95
    check-cast v6, Lax/P0/v;

    .line 96
    .line 97
    iget-object v2, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 98
    .line 99
    iget-object v3, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 100
    .line 101
    invoke-direct {p0, v1, v7, v2, v3}, Lax/f1/L;->x0(Lax/f1/D;Lax/P0/v;Lax/b1/n;Lax/b1/n;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_78

    .line 106
    .line 107
    invoke-direct {p0}, Lax/f1/L;->u0()V

    .line 108
    .line 109
    .line 110
    new-instance v4, Lax/Y0/c;

    .line 111
    .line 112
    iget-object v5, v1, Lax/f1/D;->a:Ljava/lang/String;

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/16 v9, 0x80

    .line 116
    .line 117
    invoke-direct/range {v4 .. v9}, Lax/Y0/c;-><init>(Ljava/lang/String;Lax/P0/v;Lax/P0/v;II)V

    .line 118
    .line 119
    .line 120
    return-object v4

    .line 121
    :cond_78
    iget-object v2, p0, Lax/f1/L;->H0:Lax/b1/n;

    .line 122
    .line 123
    iget-object v3, p0, Lax/f1/L;->G0:Lax/b1/n;

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    if-eq v2, v3, :cond_81

    .line 127
    .line 128
    const/4 v2, 0x1

    .line 129
    goto :goto_82

    .line 130
    :cond_81
    const/4 v2, 0x0

    .line 131
    :goto_82
    if-eqz v2, :cond_8d

    .line 132
    .line 133
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 134
    .line 135
    const/16 v5, 0x17

    .line 136
    .line 137
    if-lt v3, v5, :cond_8b

    .line 138
    .line 139
    goto :goto_8d

    .line 140
    :cond_8b
    const/4 v3, 0x0

    .line 141
    goto :goto_8e

    .line 142
    :cond_8d
    :goto_8d
    const/4 v3, 0x1

    .line 143
    :goto_8e
    invoke-static {v3}, Lax/S0/a;->g(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v1, v6, v7}, Lax/f1/L;->l0(Lax/f1/D;Lax/P0/v;Lax/P0/v;)Lax/Y0/c;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget v5, v3, Lax/Y0/c;->d:I

    .line 151
    .line 152
    const/4 v8, 0x3

    .line 153
    if-eqz v5, :cond_101

    .line 154
    .line 155
    const/16 v9, 0x10

    .line 156
    .line 157
    const/4 v10, 0x2

    .line 158
    if-eq v5, v0, :cond_e8

    .line 159
    .line 160
    if-eq v5, v10, :cond_bc

    .line 161
    .line 162
    if-ne v5, v8, :cond_b6

    .line 163
    .line 164
    invoke-direct {p0, v7}, Lax/f1/L;->U1(Lax/P0/v;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_aa

    .line 169
    .line 170
    goto :goto_105

    .line 171
    :cond_aa
    iput-object v7, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 172
    .line 173
    if-eqz v2, :cond_104

    .line 174
    .line 175
    invoke-direct {p0}, Lax/f1/L;->v0()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_104

    .line 180
    .line 181
    :goto_b4
    const/4 v9, 0x2

    .line 182
    goto :goto_105

    .line 183
    :cond_b6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 186
    .line 187
    .line 188
    throw p1

    .line 189
    :cond_bc
    invoke-direct {p0, v7}, Lax/f1/L;->U1(Lax/P0/v;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_c3

    .line 194
    .line 195
    goto :goto_105

    .line 196
    :cond_c3
    iput-boolean v0, p0, Lax/f1/L;->n1:Z

    .line 197
    .line 198
    iput v0, p0, Lax/f1/L;->o1:I

    .line 199
    .line 200
    iget v5, p0, Lax/f1/L;->V0:I

    .line 201
    .line 202
    if-eq v5, v10, :cond_db

    .line 203
    .line 204
    if-ne v5, v0, :cond_da

    .line 205
    .line 206
    iget v5, v7, Lax/P0/v;->v:I

    .line 207
    .line 208
    iget v9, v6, Lax/P0/v;->v:I

    .line 209
    .line 210
    if-ne v5, v9, :cond_da

    .line 211
    .line 212
    iget v5, v7, Lax/P0/v;->w:I

    .line 213
    .line 214
    iget v9, v6, Lax/P0/v;->w:I

    .line 215
    .line 216
    if-ne v5, v9, :cond_da

    .line 217
    .line 218
    goto :goto_db

    .line 219
    :cond_da
    const/4 v0, 0x0

    .line 220
    :cond_db
    :goto_db
    iput-boolean v0, p0, Lax/f1/L;->Z0:Z

    .line 221
    .line 222
    iput-object v7, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 223
    .line 224
    if-eqz v2, :cond_104

    .line 225
    .line 226
    invoke-direct {p0}, Lax/f1/L;->v0()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_104

    .line 231
    .line 232
    goto :goto_b4

    .line 233
    :cond_e8
    invoke-direct {p0, v7}, Lax/f1/L;->U1(Lax/P0/v;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_ef

    .line 238
    .line 239
    goto :goto_105

    .line 240
    :cond_ef
    iput-object v7, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 241
    .line 242
    if-eqz v2, :cond_fa

    .line 243
    .line 244
    invoke-direct {p0}, Lax/f1/L;->v0()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_104

    .line 249
    .line 250
    goto :goto_b4

    .line 251
    :cond_fa
    invoke-direct {p0}, Lax/f1/L;->t0()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_104

    .line 256
    .line 257
    goto :goto_b4

    .line 258
    :cond_101
    invoke-direct {p0}, Lax/f1/L;->u0()V

    .line 259
    .line 260
    .line 261
    :cond_104
    const/4 v9, 0x0

    .line 262
    :goto_105
    iget v0, v3, Lax/Y0/c;->d:I

    .line 263
    .line 264
    if-eqz v0, :cond_11a

    .line 265
    .line 266
    iget-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 267
    .line 268
    if-ne v0, p1, :cond_111

    .line 269
    .line 270
    iget p1, p0, Lax/f1/L;->q1:I

    .line 271
    .line 272
    if-ne p1, v8, :cond_11a

    .line 273
    .line 274
    :cond_111
    new-instance v4, Lax/Y0/c;

    .line 275
    .line 276
    iget-object v5, v1, Lax/f1/D;->a:Ljava/lang/String;

    .line 277
    .line 278
    const/4 v8, 0x0

    .line 279
    invoke-direct/range {v4 .. v9}, Lax/Y0/c;-><init>(Ljava/lang/String;Lax/P0/v;Lax/P0/v;II)V

    .line 280
    .line 281
    .line 282
    return-object v4

    .line 283
    :cond_11a
    return-object v3

    .line 284
    :cond_11b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 285
    .line 286
    const-string v0, "Sample MIME type is null."

    .line 287
    .line 288
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    const/16 v0, 0xfa5

    .line 292
    .line 293
    invoke-virtual {p0, p1, v1, v0}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    throw p1
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

.method protected abstract l0(Lax/f1/D;Lax/P0/v;Lax/P0/v;)Lax/Y0/c;
.end method

.method protected abstract l1(Lax/P0/v;Landroid/media/MediaFormat;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation
.end method

.method protected m1(J)V
    .registers 3

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
.end method

.method protected n1(J)V
    .registers 6

    .line 1
    iput-wide p1, p0, Lax/f1/L;->D1:J

    .line 2
    .line 3
    :goto_2
    iget-object v0, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2d

    .line 10
    .line 11
    iget-object v0, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lax/f1/L$e;

    .line 18
    .line 19
    iget-wide v0, v0, Lax/f1/L$e;->a:J

    .line 20
    .line 21
    cmp-long v2, p1, v0

    .line 22
    .line 23
    if-ltz v2, :cond_2d

    .line 24
    .line 25
    iget-object v0, p0, Lax/f1/L;->C0:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/f1/L$e;

    .line 32
    .line 33
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lax/f1/L$e;

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lax/f1/L;->F1(Lax/f1/L$e;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lax/f1/L;->o1()V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2d
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

.method public final o(JJ)J
    .registers 11

    .line 1
    iget-boolean v5, p0, Lax/f1/L;->d1:Z

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move-wide v3, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Lax/f1/L;->M0(JJZ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
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

.method protected o1()V
    .registers 1

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

.method protected p1(Lax/V0/i;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

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
.end method

.method protected r0(Ljava/lang/Throwable;Lax/f1/D;)Lax/f1/B;
    .registers 4

    .line 1
    new-instance v0, Lax/f1/B;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/f1/B;-><init>(Ljava/lang/Throwable;Lax/f1/D;)V

    .line 4
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

.method protected abstract s1(JJLax/f1/x;Ljava/nio/ByteBuffer;IIIJZZLax/P0/v;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation
.end method

.method protected w1()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 3
    .line 4
    if-eqz v1, :cond_20

    .line 5
    .line 6
    invoke-interface {v1}, Lax/f1/x;->d()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lax/f1/L;->B1:Lax/Y0/b;

    .line 10
    .line 11
    iget v2, v1, Lax/Y0/b;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lax/Y0/b;->b:I

    .line 16
    .line 17
    iget-object v1, p0, Lax/f1/L;->U0:Lax/f1/D;

    .line 18
    .line 19
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lax/f1/D;

    .line 24
    .line 25
    iget-object v1, v1, Lax/f1/D;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lax/f1/L;->j1(Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_1 .. :try_end_1d} :catchall_1e

    .line 28
    .line 29
    .line 30
    goto :goto_20

    .line 31
    :catchall_1e
    move-exception v1

    .line 32
    goto :goto_3e

    .line 33
    :cond_20
    :goto_20
    iput-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 34
    .line 35
    :try_start_22
    iget-object v1, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 36
    .line 37
    if-eqz v1, :cond_2c

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_29
    .catchall {:try_start_22 .. :try_end_29} :catchall_2a

    .line 40
    .line 41
    .line 42
    goto :goto_2c

    .line 43
    :catchall_2a
    move-exception v1

    .line 44
    goto :goto_35

    .line 45
    :cond_2c
    :goto_2c
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lax/f1/L;->A1()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_35
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lax/f1/L;->A1()V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :goto_3e
    iput-object v0, p0, Lax/f1/L;->N0:Lax/f1/x;

    .line 64
    .line 65
    :try_start_40
    iget-object v2, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 66
    .line 67
    if-eqz v2, :cond_4a

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_47
    .catchall {:try_start_40 .. :try_end_47} :catchall_48

    .line 70
    .line 71
    .line 72
    goto :goto_4a

    .line 73
    :catchall_48
    move-exception v1

    .line 74
    goto :goto_53

    .line 75
    :cond_4a
    :goto_4a
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 76
    .line 77
    invoke-direct {p0, v0}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lax/f1/L;->A1()V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :goto_53
    iput-object v0, p0, Lax/f1/L;->J0:Landroid/media/MediaCrypto;

    .line 85
    .line 86
    invoke-direct {p0, v0}, Lax/f1/L;->E1(Lax/b1/n;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lax/f1/L;->A1()V

    .line 90
    .line 91
    .line 92
    throw v1
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

.method public x(FF)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput p1, p0, Lax/f1/L;->L0:F

    .line 2
    .line 3
    iput p2, p0, Lax/f1/L;->M0:F

    .line 4
    .line 5
    iget-object p1, p0, Lax/f1/L;->O0:Lax/P0/v;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/f1/L;->U1(Lax/P0/v;)Z

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

.method protected abstract x1()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation
.end method

.method public y0()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/f1/L;->F1:Z

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

.method protected z1()V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/f1/L;->C1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/f1/L;->D1()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lax/f1/L;->B1()V

    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, Lax/f1/L;->e1:J

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, p0, Lax/f1/L;->s1:Z

    .line 19
    .line 20
    iput-wide v0, p0, Lax/f1/L;->c1:J

    .line 21
    .line 22
    iput-boolean v2, p0, Lax/f1/L;->r1:Z

    .line 23
    .line 24
    iput-boolean v2, p0, Lax/f1/L;->Z0:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lax/f1/L;->a1:Z

    .line 27
    .line 28
    iput-boolean v2, p0, Lax/f1/L;->i1:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Lax/f1/L;->j1:Z

    .line 31
    .line 32
    iput v2, p0, Lax/f1/L;->p1:I

    .line 33
    .line 34
    iput v2, p0, Lax/f1/L;->q1:I

    .line 35
    .line 36
    iget-boolean v3, p0, Lax/f1/L;->n1:Z

    .line 37
    .line 38
    iput v3, p0, Lax/f1/L;->o1:I

    .line 39
    .line 40
    iput-boolean v2, p0, Lax/f1/L;->G1:Z

    .line 41
    .line 42
    iput-wide v0, p0, Lax/f1/L;->H1:J

    .line 43
    .line 44
    iput-wide v0, p0, Lax/f1/L;->I1:J

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
