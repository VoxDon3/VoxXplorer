.class public Lax/K1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/K1/h$b;,
        Lax/K1/h$a;
    }
.end annotation


# static fields
.field public static final P:Lax/q1/x;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Q:[B

.field private static final R:Lax/P0/v;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:Lax/K1/h$b;

.field private E:I

.field private F:I

.field private G:I

.field private H:Z

.field private I:Z

.field private J:Lax/q1/t;

.field private K:[Lax/q1/U;

.field private L:[Lax/q1/U;

.field private M:Z

.field private N:Z

.field private O:J

.field private final a:Lax/N1/t$a;

.field private final b:I

.field private final c:Lax/K1/t;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/K1/h$b;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lax/S0/G;

.field private final g:Lax/S0/G;

.field private final h:Lax/S0/G;

.field private final i:[B

.field private final j:Lax/S0/G;

.field private final k:Lax/S0/M;

.field private final l:Lax/B1/c;

.field private final m:Lax/S0/G;

.field private final n:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/T0/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/K1/h$a;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lax/T0/k;

.field private final q:Lax/q1/U;

.field private final r:Lax/q1/i;

.field private s:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/q1/S;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:J

.field private w:I

.field private x:Lax/S0/G;

.field private y:J

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/K1/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/K1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/K1/h;->P:Lax/q1/x;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_22

    .line 13
    .line 14
    .line 15
    sput-object v0, Lax/K1/h;->Q:[B

    .line 16
    .line 17
    new-instance v0, Lax/P0/v$b;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "application/x-emsg"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lax/K1/h;->R:Lax/P0/v;

    .line 33
    .line 34
    return-void

    .line 35
    :array_22
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
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

.method public constructor <init>(Lax/N1/t$a;I)V
    .registers 10

    .line 1
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Lax/K1/h;-><init>(Lax/N1/t$a;ILax/S0/M;Lax/K1/t;Ljava/util/List;Lax/q1/U;)V

    return-void
.end method

.method public constructor <init>(Lax/N1/t$a;ILax/S0/M;Lax/K1/t;Ljava/util/List;Lax/q1/U;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/N1/t$a;",
            "I",
            "Lax/S0/M;",
            "Lax/K1/t;",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;",
            "Lax/q1/U;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lax/K1/h;->a:Lax/N1/t$a;

    .line 5
    iput p2, p0, Lax/K1/h;->b:I

    .line 6
    iput-object p3, p0, Lax/K1/h;->k:Lax/S0/M;

    .line 7
    iput-object p4, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 8
    invoke-static {p5}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lax/K1/h;->d:Ljava/util/List;

    .line 9
    iput-object p6, p0, Lax/K1/h;->q:Lax/q1/U;

    .line 10
    new-instance p1, Lax/B1/c;

    invoke-direct {p1}, Lax/B1/c;-><init>()V

    iput-object p1, p0, Lax/K1/h;->l:Lax/B1/c;

    .line 11
    new-instance p1, Lax/S0/G;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 12
    new-instance p1, Lax/S0/G;

    sget-object p3, Lax/T0/h;->a:[B

    invoke-direct {p1, p3}, Lax/S0/G;-><init>([B)V

    iput-object p1, p0, Lax/K1/h;->f:Lax/S0/G;

    .line 13
    new-instance p1, Lax/S0/G;

    const/4 p3, 0x6

    invoke-direct {p1, p3}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/K1/h;->g:Lax/S0/G;

    .line 14
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/K1/h;->h:Lax/S0/G;

    .line 15
    new-array p1, p2, [B

    iput-object p1, p0, Lax/K1/h;->i:[B

    .line 16
    new-instance p2, Lax/S0/G;

    invoke-direct {p2, p1}, Lax/S0/G;-><init>([B)V

    iput-object p2, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 20
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object p1

    iput-object p1, p0, Lax/K1/h;->s:Lax/r7/z;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    iput-wide p1, p0, Lax/K1/h;->B:J

    .line 22
    iput-wide p1, p0, Lax/K1/h;->A:J

    .line 23
    iput-wide p1, p0, Lax/K1/h;->C:J

    .line 24
    sget-object p1, Lax/q1/t;->a0:Lax/q1/t;

    iput-object p1, p0, Lax/K1/h;->J:Lax/q1/t;

    const/4 p1, 0x0

    .line 25
    new-array p2, p1, [Lax/q1/U;

    iput-object p2, p0, Lax/K1/h;->K:[Lax/q1/U;

    .line 26
    new-array p1, p1, [Lax/q1/U;

    iput-object p1, p0, Lax/K1/h;->L:[Lax/q1/U;

    .line 27
    new-instance p1, Lax/T0/k;

    new-instance p2, Lax/K1/g;

    invoke-direct {p2, p0}, Lax/K1/g;-><init>(Lax/K1/h;)V

    invoke-direct {p1, p2}, Lax/T0/k;-><init>(Lax/T0/k$b;)V

    iput-object p1, p0, Lax/K1/h;->p:Lax/T0/k;

    .line 28
    new-instance p1, Lax/q1/i;

    invoke-direct {p1}, Lax/q1/i;-><init>()V

    iput-object p1, p0, Lax/K1/h;->r:Lax/q1/i;

    const-wide/16 p1, -0x1

    .line 29
    iput-wide p1, p0, Lax/K1/h;->O:J

    return-void
.end method

.method private A(J)V
    .registers 14

    .line 1
    :cond_0
    iget-object v0, p0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3c

    .line 8
    .line 9
    iget-object v0, p0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/K1/h$a;

    .line 16
    .line 17
    iget v1, p0, Lax/K1/h;->z:I

    .line 18
    .line 19
    iget v2, v0, Lax/K1/h$a;->c:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, p0, Lax/K1/h;->z:I

    .line 23
    .line 24
    iget-wide v1, v0, Lax/K1/h$a;->a:J

    .line 25
    .line 26
    iget-boolean v3, v0, Lax/K1/h$a;->b:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1e

    .line 29
    .line 30
    add-long/2addr v1, p1

    .line 31
    :cond_1e
    iget-object v3, p0, Lax/K1/h;->k:Lax/S0/M;

    .line 32
    .line 33
    if-eqz v3, :cond_26

    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, Lax/S0/M;->a(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    :cond_26
    move-wide v4, v1

    .line 40
    iget-object v1, p0, Lax/K1/h;->K:[Lax/q1/U;

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    :goto_2c
    if-ge v10, v2, :cond_0

    .line 46
    .line 47
    aget-object v3, v1, v10

    .line 48
    .line 49
    iget v7, v0, Lax/K1/h$a;->c:I

    .line 50
    .line 51
    iget v8, p0, Lax/K1/h;->z:I

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-interface/range {v3 .. v9}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v10, v10, 0x1

    .line 59
    .line 60
    goto :goto_2c

    .line 61
    :cond_3c
    return-void
.end method

.method private static B(Lax/S0/G;)J
    .registers 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lax/K1/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_14

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :cond_14
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0
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

.method private static C(Lax/T0/e$b;Landroid/util/SparseArray;ZI[B)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/T0/e$b;",
            "Landroid/util/SparseArray<",
            "Lax/K1/h$b;",
            ">;ZI[B)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T0/e$b;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_7
    if-ge v1, v0, :cond_1e

    .line 9
    .line 10
    iget-object v2, p0, Lax/T0/e$b;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lax/T0/e$b;

    .line 17
    .line 18
    iget v3, v2, Lax/T0/e;->a:I

    .line 19
    .line 20
    const v4, 0x74726166

    .line 21
    .line 22
    .line 23
    if-ne v3, v4, :cond_1b

    .line 24
    .line 25
    invoke-static {v2, p1, p2, p3, p4}, Lax/K1/h;->L(Lax/T0/e$b;Landroid/util/SparseArray;ZI[B)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_7

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

.method private static D(Lax/S0/G;Lax/K1/v;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lax/K1/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    and-int/2addr v2, v3

    .line 16
    if-ne v2, v3, :cond_14

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {p0}, Lax/S0/G;->Q()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_2f

    .line 26
    .line 27
    invoke-static {v1}, Lax/K1/b;->q(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v1, p1, Lax/K1/v;->d:J

    .line 32
    .line 33
    if-nez v0, :cond_27

    .line 34
    .line 35
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    goto :goto_2b

    .line 40
    :cond_27
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_2b
    add-long/2addr v1, v3

    .line 45
    iput-wide v1, p1, Lax/K1/v;->d:J

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string p1, "Unexpected saio entry count: "

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p0, p1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    throw p0
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

.method private static E(Lax/K1/u;Lax/S0/G;Lax/K1/v;)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget p0, p0, Lax/K1/u;->d:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lax/S0/G;->v()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lax/K1/b;->p(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    and-int/2addr v1, v2

    .line 18
    if-ne v1, v2, :cond_16

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lax/S0/G;->c0(I)V

    .line 21
    .line 22
    .line 23
    :cond_16
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lax/S0/G;->Q()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v3, p2, Lax/K1/v;->f:I

    .line 32
    .line 33
    if-gt v1, v3, :cond_52

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v0, :cond_3a

    .line 37
    .line 38
    iget-object v0, p2, Lax/K1/v;->m:[Z

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_29
    if-ge v4, v1, :cond_45

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/S0/G;->M()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v5, v6

    .line 49
    if-le v6, p0, :cond_34

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    const/4 v6, 0x0

    .line 54
    :goto_35
    aput-boolean v6, v0, v4

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_29

    .line 59
    :cond_3a
    if-le v0, p0, :cond_3d

    .line 60
    .line 61
    goto :goto_3e

    .line 62
    :cond_3d
    const/4 v2, 0x0

    .line 63
    :goto_3e
    mul-int v5, v0, v1

    .line 64
    .line 65
    iget-object p0, p2, Lax/K1/v;->m:[Z

    .line 66
    .line 67
    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget-object p0, p2, Lax/K1/v;->m:[Z

    .line 71
    .line 72
    iget p1, p2, Lax/K1/v;->f:I

    .line 73
    .line 74
    invoke-static {p0, v1, p1, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 75
    .line 76
    .line 77
    if-lez v5, :cond_51

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Lax/K1/v;->d(I)V

    .line 80
    .line 81
    .line 82
    :cond_51
    return-void

    .line 83
    :cond_52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string p1, "Saiz sample count "

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " is greater than fragment sample count"

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget p1, p2, Lax/K1/v;->f:I

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 p1, 0x0

    .line 111
    invoke-static {p0, p1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0
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

.method private static F(Lax/T0/e$b;Ljava/lang/String;Lax/K1/v;)V
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v5, v2

    .line 8
    move-object v6, v5

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_9
    iget-object v7, v0, Lax/T0/e$b;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    if-ge v4, v7, :cond_44

    .line 17
    .line 18
    iget-object v7, v0, Lax/T0/e$b;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, Lax/T0/e$c;

    .line 25
    .line 26
    iget-object v8, v7, Lax/T0/e$c;->b:Lax/S0/G;

    .line 27
    .line 28
    iget v7, v7, Lax/T0/e;->a:I

    .line 29
    .line 30
    const v9, 0x73626770

    .line 31
    .line 32
    .line 33
    const v10, 0x73656967

    .line 34
    .line 35
    .line 36
    const/16 v11, 0xc

    .line 37
    .line 38
    if-ne v7, v9, :cond_32

    .line 39
    .line 40
    invoke-virtual {v8, v11}, Lax/S0/G;->b0(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Lax/S0/G;->v()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ne v7, v10, :cond_41

    .line 48
    .line 49
    move-object v5, v8

    .line 50
    goto :goto_41

    .line 51
    :cond_32
    const v9, 0x73677064

    .line 52
    .line 53
    .line 54
    if-ne v7, v9, :cond_41

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Lax/S0/G;->b0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Lax/S0/G;->v()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-ne v7, v10, :cond_41

    .line 64
    .line 65
    move-object v6, v8

    .line 66
    :cond_41
    :goto_41
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_9

    .line 69
    :cond_44
    if-eqz v5, :cond_e4

    .line 70
    .line 71
    if-nez v6, :cond_4a

    .line 72
    .line 73
    goto/16 :goto_e4

    .line 74
    .line 75
    :cond_4a
    const/16 v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v5, v0}, Lax/S0/G;->b0(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lax/S0/G;->v()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, Lax/K1/b;->q(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x4

    .line 89
    invoke-virtual {v5, v7}, Lax/S0/G;->c0(I)V

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    if-ne v4, v8, :cond_61

    .line 94
    .line 95
    invoke-virtual {v5, v7}, Lax/S0/G;->c0(I)V

    .line 96
    .line 97
    .line 98
    :cond_61
    invoke-virtual {v5}, Lax/S0/G;->v()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v8, :cond_dd

    .line 103
    .line 104
    invoke-virtual {v6, v0}, Lax/S0/G;->b0(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lax/S0/G;->v()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Lax/K1/b;->q(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v6, v7}, Lax/S0/G;->c0(I)V

    .line 116
    .line 117
    .line 118
    if-ne v0, v8, :cond_89

    .line 119
    .line 120
    invoke-virtual {v6}, Lax/S0/G;->O()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const-wide/16 v9, 0x0

    .line 125
    .line 126
    cmp-long v0, v4, v9

    .line 127
    .line 128
    if-eqz v0, :cond_82

    .line 129
    .line 130
    goto :goto_8f

    .line 131
    :cond_82
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 132
    .line 133
    invoke-static {v0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_89
    const/4 v4, 0x2

    .line 139
    if-lt v0, v4, :cond_8f

    .line 140
    .line 141
    invoke-virtual {v6, v7}, Lax/S0/G;->c0(I)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    :goto_8f
    invoke-virtual {v6}, Lax/S0/G;->O()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    const-wide/16 v9, 0x1

    .line 149
    .line 150
    cmp-long v0, v4, v9

    .line 151
    .line 152
    if-nez v0, :cond_d6

    .line 153
    .line 154
    invoke-virtual {v6, v8}, Lax/S0/G;->c0(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lax/S0/G;->M()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    and-int/lit16 v4, v0, 0xf0

    .line 162
    .line 163
    shr-int/lit8 v14, v4, 0x4

    .line 164
    .line 165
    and-int/lit8 v15, v0, 0xf

    .line 166
    .line 167
    invoke-virtual {v6}, Lax/S0/G;->M()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-ne v0, v8, :cond_ae

    .line 172
    .line 173
    const/4 v10, 0x1

    .line 174
    goto :goto_af

    .line 175
    :cond_ae
    const/4 v10, 0x0

    .line 176
    :goto_af
    if-nez v10, :cond_b2

    .line 177
    .line 178
    goto :goto_e4

    .line 179
    :cond_b2
    invoke-virtual {v6}, Lax/S0/G;->M()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    const/16 v0, 0x10

    .line 184
    .line 185
    new-array v13, v0, [B

    .line 186
    .line 187
    invoke-virtual {v6, v13, v3, v0}, Lax/S0/G;->q([BII)V

    .line 188
    .line 189
    .line 190
    if-nez v12, :cond_c8

    .line 191
    .line 192
    invoke-virtual {v6}, Lax/S0/G;->M()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    new-array v2, v0, [B

    .line 197
    .line 198
    invoke-virtual {v6, v2, v3, v0}, Lax/S0/G;->q([BII)V

    .line 199
    .line 200
    .line 201
    :cond_c8
    move-object/from16 v16, v2

    .line 202
    .line 203
    iput-boolean v8, v1, Lax/K1/v;->l:Z

    .line 204
    .line 205
    new-instance v9, Lax/K1/u;

    .line 206
    .line 207
    move-object/from16 v11, p1

    .line 208
    .line 209
    invoke-direct/range {v9 .. v16}, Lax/K1/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 210
    .line 211
    .line 212
    iput-object v9, v1, Lax/K1/v;->n:Lax/K1/u;

    .line 213
    .line 214
    return-void

    .line 215
    :cond_d6
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 216
    .line 217
    invoke-static {v0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    throw v0

    .line 222
    :cond_dd
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 223
    .line 224
    invoke-static {v0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    throw v0

    .line 229
    :cond_e4
    :goto_e4
    return-void
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

.method private static G(Lax/S0/G;ILax/K1/v;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Lax/K1/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    and-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    if-nez v0, :cond_5c

    .line 17
    .line 18
    and-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_18

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    :goto_19
    invoke-virtual {p0}, Lax/S0/G;->Q()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_27

    .line 31
    .line 32
    iget-object p0, p2, Lax/K1/v;->m:[Z

    .line 33
    .line 34
    iget p1, p2, Lax/K1/v;->f:I

    .line 35
    .line 36
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    iget v2, p2, Lax/K1/v;->f:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_3b

    .line 43
    .line 44
    iget-object v2, p2, Lax/K1/v;->m:[Z

    .line 45
    .line 46
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lax/S0/G;->a()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2, p1}, Lax/K1/v;->d(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, Lax/K1/v;->a(Lax/S0/G;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p1, "Senc sample count "

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " is different from fragment sample count"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p1, p2, Lax/K1/v;->f:I

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-static {p0, p1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :cond_5c
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 94
    .line 95
    invoke-static {p0}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    throw p0
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

.method private static H(Lax/S0/G;Lax/K1/v;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lax/K1/h;->G(Lax/S0/G;ILax/K1/v;)V

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

.method private static I(Lax/S0/G;J)Landroid/util/Pair;
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            "J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Lax/q1/h;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/S0/G;->b0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lax/K1/b;->q(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lax/S0/G;->c0(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lax/S0/G;->O()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_25

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/S0/G;->O()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Lax/S0/G;->O()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_21
    add-long v5, p1, v5

    .line 35
    .line 36
    move-wide v9, v5

    .line 37
    goto :goto_2e

    .line 38
    :cond_25
    invoke-virtual {v0}, Lax/S0/G;->T()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, Lax/S0/G;->T()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_21

    .line 47
    :goto_2e
    const-wide/32 v5, 0xf4240

    .line 48
    .line 49
    .line 50
    invoke-static/range {v3 .. v8}, Lax/S0/d0;->p1(JJJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v11

    .line 54
    const/4 v1, 0x2

    .line 55
    invoke-virtual {v0, v1}, Lax/S0/G;->c0(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    new-array v13, v1, [I

    .line 63
    .line 64
    new-array v14, v1, [J

    .line 65
    .line 66
    new-array v15, v1, [J

    .line 67
    .line 68
    new-array v5, v1, [J

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-wide/from16 v16, v9

    .line 72
    .line 73
    move-wide/from16 v18, v11

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    :goto_4b
    if-ge v9, v1, :cond_88

    .line 77
    .line 78
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    const/high16 v10, -0x80000000

    .line 83
    .line 84
    and-int/2addr v10, v6

    .line 85
    if-nez v10, :cond_80

    .line 86
    .line 87
    invoke-virtual {v0}, Lax/S0/G;->O()J

    .line 88
    .line 89
    .line 90
    move-result-wide v20

    .line 91
    const v10, 0x7fffffff

    .line 92
    .line 93
    .line 94
    and-int/2addr v6, v10

    .line 95
    aput v6, v13, v9

    .line 96
    .line 97
    aput-wide v16, v14, v9

    .line 98
    .line 99
    aput-wide v18, v5, v9

    .line 100
    .line 101
    add-long v3, v3, v20

    .line 102
    .line 103
    move-object v10, v5

    .line 104
    const-wide/32 v5, 0xf4240

    .line 105
    .line 106
    .line 107
    invoke-static/range {v3 .. v8}, Lax/S0/d0;->p1(JJJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v18

    .line 111
    aget-wide v5, v10, v9

    .line 112
    .line 113
    sub-long v5, v18, v5

    .line 114
    .line 115
    aput-wide v5, v15, v9

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lax/S0/G;->c0(I)V

    .line 118
    .line 119
    .line 120
    aget v5, v13, v9

    .line 121
    .line 122
    int-to-long v5, v5

    .line 123
    add-long v16, v16, v5

    .line 124
    .line 125
    add-int/lit8 v9, v9, 0x1

    .line 126
    .line 127
    move-object v5, v10

    .line 128
    goto :goto_4b

    .line 129
    :cond_80
    const-string v0, "Unhandled indirect reference"

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-static {v0, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    throw v0

    .line 137
    :cond_88
    move-object v10, v5

    .line 138
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Lax/q1/h;

    .line 143
    .line 144
    invoke-direct {v1, v13, v14, v15, v10}, Lax/q1/h;-><init>([I[J[J[J)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0
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
.end method

.method private static J(Lax/S0/G;)J
    .registers 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lax/K1/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_15

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0

    .line 22
    :cond_15
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
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

.method private static K(Lax/S0/G;Landroid/util/SparseArray;Z)Lax/K1/h$b;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            "Landroid/util/SparseArray<",
            "Lax/K1/h$b;",
            ">;Z)",
            "Lax/K1/h$b;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lax/K1/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz p2, :cond_1b

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_18
    check-cast p1, Lax/K1/h$b;

    .line 26
    .line 27
    goto :goto_20

    .line 28
    :cond_1b
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_18

    .line 33
    :goto_20
    if-nez p1, :cond_24

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_24
    and-int/lit8 p2, v0, 0x1

    .line 38
    .line 39
    if-eqz p2, :cond_32

    .line 40
    .line 41
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object p2, p1, Lax/K1/h$b;->b:Lax/K1/v;

    .line 46
    .line 47
    iput-wide v1, p2, Lax/K1/v;->c:J

    .line 48
    .line 49
    iput-wide v1, p2, Lax/K1/v;->d:J

    .line 50
    .line 51
    :cond_32
    iget-object p2, p1, Lax/K1/h$b;->e:Lax/K1/c;

    .line 52
    .line 53
    and-int/lit8 v1, v0, 0x2

    .line 54
    .line 55
    if-eqz v1, :cond_3f

    .line 56
    .line 57
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    goto :goto_41

    .line 64
    :cond_3f
    iget v1, p2, Lax/K1/c;->a:I

    .line 65
    .line 66
    :goto_41
    and-int/lit8 v2, v0, 0x8

    .line 67
    .line 68
    if-eqz v2, :cond_4a

    .line 69
    .line 70
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_4c

    .line 75
    :cond_4a
    iget v2, p2, Lax/K1/c;->b:I

    .line 76
    .line 77
    :goto_4c
    and-int/lit8 v3, v0, 0x10

    .line 78
    .line 79
    if-eqz v3, :cond_55

    .line 80
    .line 81
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    goto :goto_57

    .line 86
    :cond_55
    iget v3, p2, Lax/K1/c;->c:I

    .line 87
    .line 88
    :goto_57
    and-int/lit8 v0, v0, 0x20

    .line 89
    .line 90
    if-eqz v0, :cond_60

    .line 91
    .line 92
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    goto :goto_62

    .line 97
    :cond_60
    iget p0, p2, Lax/K1/c;->d:I

    .line 98
    .line 99
    :goto_62
    iget-object p2, p1, Lax/K1/h$b;->b:Lax/K1/v;

    .line 100
    .line 101
    new-instance v0, Lax/K1/c;

    .line 102
    .line 103
    invoke-direct {v0, v1, v2, v3, p0}, Lax/K1/c;-><init>(IIII)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p2, Lax/K1/v;->a:Lax/K1/c;

    .line 107
    .line 108
    return-object p1
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

.method private static L(Lax/T0/e$b;Landroid/util/SparseArray;ZI[B)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/T0/e$b;",
            "Landroid/util/SparseArray<",
            "Lax/K1/h$b;",
            ">;ZI[B)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const v0, 0x74666864

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lax/T0/e$c;

    .line 13
    .line 14
    iget-object v0, v0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lax/K1/h;->K(Lax/S0/G;Landroid/util/SparseArray;Z)Lax/K1/h$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_17

    .line 21
    .line 22
    goto/16 :goto_ae

    .line 23
    .line 24
    :cond_17
    iget-object p2, p1, Lax/K1/h$b;->b:Lax/K1/v;

    .line 25
    .line 26
    iget-wide v0, p2, Lax/K1/v;->q:J

    .line 27
    .line 28
    iget-boolean v2, p2, Lax/K1/v;->r:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/K1/h$b;->k()V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-static {p1, v3}, Lax/K1/h$b;->b(Lax/K1/h$b;Z)Z

    .line 35
    .line 36
    .line 37
    const v4, 0x74666474

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_3c

    .line 45
    .line 46
    and-int/lit8 v5, p3, 0x2

    .line 47
    .line 48
    if-nez v5, :cond_3c

    .line 49
    .line 50
    iget-object v0, v4, Lax/T0/e$c;->b:Lax/S0/G;

    .line 51
    .line 52
    invoke-static {v0}, Lax/K1/h;->J(Lax/S0/G;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p2, Lax/K1/v;->q:J

    .line 57
    .line 58
    iput-boolean v3, p2, Lax/K1/v;->r:Z

    .line 59
    .line 60
    goto :goto_40

    .line 61
    :cond_3c
    iput-wide v0, p2, Lax/K1/v;->q:J

    .line 62
    .line 63
    iput-boolean v2, p2, Lax/K1/v;->r:Z

    .line 64
    .line 65
    :goto_40
    invoke-static {p0, p1, p3}, Lax/K1/h;->O(Lax/T0/e$b;Lax/K1/h$b;I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, Lax/K1/h$b;->d:Lax/K1/w;

    .line 69
    .line 70
    iget-object p1, p1, Lax/K1/w;->a:Lax/K1/t;

    .line 71
    .line 72
    iget-object p3, p2, Lax/K1/v;->a:Lax/K1/c;

    .line 73
    .line 74
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    check-cast p3, Lax/K1/c;

    .line 79
    .line 80
    iget p3, p3, Lax/K1/c;->a:I

    .line 81
    .line 82
    invoke-virtual {p1, p3}, Lax/K1/t;->b(I)Lax/K1/u;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const p3, 0x7361697a

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-eqz p3, :cond_69

    .line 94
    .line 95
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lax/K1/u;

    .line 100
    .line 101
    iget-object p3, p3, Lax/T0/e$c;->b:Lax/S0/G;

    .line 102
    .line 103
    invoke-static {v0, p3, p2}, Lax/K1/h;->E(Lax/K1/u;Lax/S0/G;Lax/K1/v;)V

    .line 104
    .line 105
    .line 106
    :cond_69
    const p3, 0x7361696f

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-eqz p3, :cond_77

    .line 114
    .line 115
    iget-object p3, p3, Lax/T0/e$c;->b:Lax/S0/G;

    .line 116
    .line 117
    invoke-static {p3, p2}, Lax/K1/h;->D(Lax/S0/G;Lax/K1/v;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    const p3, 0x73656e63

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eqz p3, :cond_85

    .line 128
    .line 129
    iget-object p3, p3, Lax/T0/e$c;->b:Lax/S0/G;

    .line 130
    .line 131
    invoke-static {p3, p2}, Lax/K1/h;->H(Lax/S0/G;Lax/K1/v;)V

    .line 132
    .line 133
    .line 134
    :cond_85
    if-eqz p1, :cond_8a

    .line 135
    .line 136
    iget-object p1, p1, Lax/K1/u;->b:Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_8b

    .line 139
    :cond_8a
    const/4 p1, 0x0

    .line 140
    :goto_8b
    invoke-static {p0, p1, p2}, Lax/K1/h;->F(Lax/T0/e$b;Ljava/lang/String;Lax/K1/v;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lax/T0/e$b;->c:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    const/4 p3, 0x0

    .line 150
    :goto_95
    if-ge p3, p1, :cond_ae

    .line 151
    .line 152
    iget-object v0, p0, Lax/T0/e$b;->c:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lax/T0/e$c;

    .line 159
    .line 160
    iget v1, v0, Lax/T0/e;->a:I

    .line 161
    .line 162
    const v2, 0x75756964

    .line 163
    .line 164
    .line 165
    if-ne v1, v2, :cond_ab

    .line 166
    .line 167
    iget-object v0, v0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 168
    .line 169
    invoke-static {v0, p2, p4}, Lax/K1/h;->P(Lax/S0/G;Lax/K1/v;[B)V

    .line 170
    .line 171
    .line 172
    :cond_ab
    add-int/lit8 p3, p3, 0x1

    .line 173
    .line 174
    goto :goto_95

    .line 175
    :cond_ae
    :goto_ae
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
.end method

.method private static M(Lax/S0/G;)Landroid/util/Pair;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lax/K1/c;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, Lax/K1/c;

    .line 33
    .line 34
    invoke-direct {v4, v1, v2, v3, p0}, Lax/K1/c;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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

.method private static N(Lax/K1/h$b;IILax/S0/G;I)I
    .registers 33
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lax/S0/G;->b0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lax/S0/G;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Lax/K1/b;->p(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, v0, Lax/K1/h$b;->d:Lax/K1/w;

    .line 19
    .line 20
    iget-object v3, v3, Lax/K1/w;->a:Lax/K1/t;

    .line 21
    .line 22
    iget-object v4, v0, Lax/K1/h$b;->b:Lax/K1/v;

    .line 23
    .line 24
    iget-object v5, v4, Lax/K1/v;->a:Lax/K1/c;

    .line 25
    .line 26
    invoke-static {v5}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lax/K1/c;

    .line 31
    .line 32
    iget-object v6, v4, Lax/K1/v;->h:[I

    .line 33
    .line 34
    invoke-virtual {v2}, Lax/S0/G;->Q()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    aput v7, v6, p1

    .line 39
    .line 40
    iget-object v6, v4, Lax/K1/v;->g:[J

    .line 41
    .line 42
    iget-wide v7, v4, Lax/K1/v;->c:J

    .line 43
    .line 44
    aput-wide v7, v6, p1

    .line 45
    .line 46
    and-int/lit8 v9, v1, 0x1

    .line 47
    .line 48
    if-eqz v9, :cond_39

    .line 49
    .line 50
    invoke-virtual {v2}, Lax/S0/G;->v()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    int-to-long v9, v9

    .line 55
    add-long/2addr v7, v9

    .line 56
    aput-wide v7, v6, p1

    .line 57
    .line 58
    :cond_39
    and-int/lit8 v6, v1, 0x4

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-eqz v6, :cond_40

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    goto :goto_41

    .line 65
    :cond_40
    const/4 v6, 0x0

    .line 66
    :goto_41
    iget v9, v5, Lax/K1/c;->d:I

    .line 67
    .line 68
    if-eqz v6, :cond_49

    .line 69
    .line 70
    invoke-virtual {v2}, Lax/S0/G;->v()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    :cond_49
    and-int/lit16 v10, v1, 0x100

    .line 75
    .line 76
    if-eqz v10, :cond_4f

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v10, 0x0

    .line 81
    :goto_50
    and-int/lit16 v11, v1, 0x200

    .line 82
    .line 83
    if-eqz v11, :cond_56

    .line 84
    .line 85
    const/4 v11, 0x1

    .line 86
    goto :goto_57

    .line 87
    :cond_56
    const/4 v11, 0x0

    .line 88
    :goto_57
    and-int/lit16 v12, v1, 0x400

    .line 89
    .line 90
    if-eqz v12, :cond_5d

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    goto :goto_5e

    .line 94
    :cond_5d
    const/4 v12, 0x0

    .line 95
    :goto_5e
    and-int/lit16 v1, v1, 0x800

    .line 96
    .line 97
    if-eqz v1, :cond_64

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 v1, 0x0

    .line 102
    :goto_65
    invoke-static {v3}, Lax/K1/h;->s(Lax/K1/t;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_76

    .line 107
    .line 108
    iget-object v13, v3, Lax/K1/t;->j:[J

    .line 109
    .line 110
    invoke-static {v13}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    check-cast v13, [J

    .line 115
    .line 116
    aget-wide v14, v13, v7

    .line 117
    .line 118
    goto :goto_78

    .line 119
    :cond_76
    const-wide/16 v14, 0x0

    .line 120
    .line 121
    :goto_78
    iget-object v13, v4, Lax/K1/v;->i:[I

    .line 122
    .line 123
    iget-object v7, v4, Lax/K1/v;->j:[J

    .line 124
    .line 125
    const/16 v16, 0x1

    .line 126
    .line 127
    iget-object v8, v4, Lax/K1/v;->k:[Z

    .line 128
    .line 129
    move/from16 v17, v1

    .line 130
    .line 131
    iget v1, v3, Lax/K1/t;->b:I

    .line 132
    .line 133
    const/4 v2, 0x2

    .line 134
    if-ne v1, v2, :cond_8d

    .line 135
    .line 136
    and-int/lit8 v1, p2, 0x1

    .line 137
    .line 138
    if-eqz v1, :cond_8d

    .line 139
    .line 140
    const/4 v1, 0x1

    .line 141
    goto :goto_8e

    .line 142
    :cond_8d
    const/4 v1, 0x0

    .line 143
    :goto_8e
    iget-object v2, v4, Lax/K1/v;->h:[I

    .line 144
    .line 145
    aget v2, v2, p1

    .line 146
    .line 147
    add-int v2, p4, v2

    .line 148
    .line 149
    move/from16 v24, v6

    .line 150
    .line 151
    move-object/from16 v25, v7

    .line 152
    .line 153
    iget-wide v6, v3, Lax/K1/t;->c:J

    .line 154
    .line 155
    move-wide/from16 v22, v6

    .line 156
    .line 157
    iget-wide v6, v4, Lax/K1/v;->q:J

    .line 158
    .line 159
    move/from16 v3, p4

    .line 160
    .line 161
    :goto_a0
    if-ge v3, v2, :cond_126

    .line 162
    .line 163
    if-eqz v10, :cond_ab

    .line 164
    .line 165
    invoke-virtual/range {p3 .. p3}, Lax/S0/G;->v()I

    .line 166
    .line 167
    .line 168
    move-result v18

    .line 169
    move/from16 p2, v1

    .line 170
    .line 171
    goto :goto_b1

    .line 172
    :cond_ab
    move/from16 p2, v1

    .line 173
    .line 174
    iget v1, v5, Lax/K1/c;->b:I

    .line 175
    .line 176
    move/from16 v18, v1

    .line 177
    .line 178
    :goto_b1
    invoke-static/range {v18 .. v18}, Lax/K1/h;->j(I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v11, :cond_be

    .line 183
    .line 184
    invoke-virtual/range {p3 .. p3}, Lax/S0/G;->v()I

    .line 185
    .line 186
    .line 187
    move-result v18

    .line 188
    move/from16 p1, v2

    .line 189
    .line 190
    goto :goto_c4

    .line 191
    :cond_be
    move/from16 p1, v2

    .line 192
    .line 193
    iget v2, v5, Lax/K1/c;->c:I

    .line 194
    .line 195
    move/from16 v18, v2

    .line 196
    .line 197
    :goto_c4
    invoke-static/range {v18 .. v18}, Lax/K1/h;->j(I)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v12, :cond_d3

    .line 202
    .line 203
    invoke-virtual/range {p3 .. p3}, Lax/S0/G;->v()I

    .line 204
    .line 205
    .line 206
    move-result v18

    .line 207
    move/from16 p4, v2

    .line 208
    .line 209
    move/from16 v2, v18

    .line 210
    .line 211
    goto :goto_df

    .line 212
    :cond_d3
    if-nez v3, :cond_db

    .line 213
    .line 214
    if-eqz v24, :cond_db

    .line 215
    .line 216
    move/from16 p4, v2

    .line 217
    .line 218
    move v2, v9

    .line 219
    goto :goto_df

    .line 220
    :cond_db
    move/from16 p4, v2

    .line 221
    .line 222
    iget v2, v5, Lax/K1/c;->d:I

    .line 223
    .line 224
    :goto_df
    if-eqz v17, :cond_ec

    .line 225
    .line 226
    invoke-virtual/range {p3 .. p3}, Lax/S0/G;->v()I

    .line 227
    .line 228
    .line 229
    move-result v18

    .line 230
    move/from16 v26, v2

    .line 231
    .line 232
    move/from16 v2, v18

    .line 233
    .line 234
    :goto_e9
    move/from16 v27, v3

    .line 235
    .line 236
    goto :goto_f0

    .line 237
    :cond_ec
    move/from16 v26, v2

    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    goto :goto_e9

    .line 241
    :goto_f0
    int-to-long v2, v2

    .line 242
    add-long/2addr v2, v6

    .line 243
    sub-long v18, v2, v14

    .line 244
    .line 245
    const-wide/32 v20, 0xf4240

    .line 246
    .line 247
    .line 248
    invoke-static/range {v18 .. v23}, Lax/S0/d0;->p1(JJJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v2

    .line 252
    aput-wide v2, v25, v27

    .line 253
    .line 254
    move-wide/from16 v18, v2

    .line 255
    .line 256
    iget-boolean v2, v4, Lax/K1/v;->r:Z

    .line 257
    .line 258
    if-nez v2, :cond_10b

    .line 259
    .line 260
    iget-object v2, v0, Lax/K1/h$b;->d:Lax/K1/w;

    .line 261
    .line 262
    iget-wide v2, v2, Lax/K1/w;->h:J

    .line 263
    .line 264
    add-long v2, v18, v2

    .line 265
    .line 266
    aput-wide v2, v25, v27

    .line 267
    .line 268
    :cond_10b
    aput p4, v13, v27

    .line 269
    .line 270
    shr-int/lit8 v2, v26, 0x10

    .line 271
    .line 272
    and-int/lit8 v2, v2, 0x1

    .line 273
    .line 274
    if-nez v2, :cond_119

    .line 275
    .line 276
    if-eqz p2, :cond_117

    .line 277
    .line 278
    if-nez v27, :cond_119

    .line 279
    .line 280
    :cond_117
    const/4 v2, 0x1

    .line 281
    goto :goto_11a

    .line 282
    :cond_119
    const/4 v2, 0x0

    .line 283
    :goto_11a
    aput-boolean v2, v8, v27

    .line 284
    .line 285
    int-to-long v1, v1

    .line 286
    add-long/2addr v6, v1

    .line 287
    add-int/lit8 v3, v27, 0x1

    .line 288
    .line 289
    move/from16 v2, p1

    .line 290
    .line 291
    move/from16 v1, p2

    .line 292
    .line 293
    goto/16 :goto_a0

    .line 294
    .line 295
    :cond_126
    move/from16 p1, v2

    .line 296
    .line 297
    iput-wide v6, v4, Lax/K1/v;->q:J

    .line 298
    .line 299
    return p1
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

.method private static O(Lax/T0/e$b;Lax/K1/h$b;I)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lax/T0/e$b;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_a
    const v5, 0x7472756e

    .line 12
    .line 13
    .line 14
    if-ge v2, v0, :cond_2c

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Lax/T0/e$c;

    .line 21
    .line 22
    iget v7, v6, Lax/T0/e;->a:I

    .line 23
    .line 24
    if-ne v7, v5, :cond_29

    .line 25
    .line 26
    iget-object v5, v6, Lax/T0/e$c;->b:Lax/S0/G;

    .line 27
    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lax/S0/G;->b0(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Lax/S0/G;->Q()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-lez v5, :cond_29

    .line 38
    .line 39
    add-int/2addr v4, v5

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    :cond_29
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_a

    .line 45
    :cond_2c
    iput v1, p1, Lax/K1/h$b;->h:I

    .line 46
    .line 47
    iput v1, p1, Lax/K1/h$b;->g:I

    .line 48
    .line 49
    iput v1, p1, Lax/K1/h$b;->f:I

    .line 50
    .line 51
    iget-object v2, p1, Lax/K1/h$b;->b:Lax/K1/v;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, Lax/K1/v;->e(II)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const/4 v3, 0x0

    .line 58
    :goto_39
    if-ge v1, v0, :cond_52

    .line 59
    .line 60
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lax/T0/e$c;

    .line 65
    .line 66
    iget v6, v4, Lax/T0/e;->a:I

    .line 67
    .line 68
    if-ne v6, v5, :cond_4f

    .line 69
    .line 70
    add-int/lit8 v6, v2, 0x1

    .line 71
    .line 72
    iget-object v4, v4, Lax/T0/e$c;->b:Lax/S0/G;

    .line 73
    .line 74
    invoke-static {p1, v2, p2, v4, v3}, Lax/K1/h;->N(Lax/K1/h$b;IILax/S0/G;I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v3, v2

    .line 79
    move v2, v6

    .line 80
    :cond_4f
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_39

    .line 83
    :cond_52
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static P(Lax/S0/G;Lax/K1/v;[B)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p0, p2, v0, v1}, Lax/S0/G;->q([BII)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lax/K1/h;->Q:[B

    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_14

    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    invoke-static {p0, v1, p1}, Lax/K1/h;->G(Lax/S0/G;ILax/K1/v;)V

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

.method private Q(J)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_22

    .line 8
    .line 9
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/T0/e$b;

    .line 16
    .line 17
    iget-wide v0, v0, Lax/T0/e$b;->b:J

    .line 18
    .line 19
    cmp-long v2, v0, p1

    .line 20
    .line 21
    if-nez v2, :cond_22

    .line 22
    .line 23
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lax/T0/e$b;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lax/K1/h;->v(Lax/T0/e$b;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_22
    invoke-direct {p0}, Lax/K1/h;->m()V

    .line 36
    .line 37
    .line 38
    return-void
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

.method private R(Lax/q1/s;)Z
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/K1/h;->w:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-nez v0, :cond_2c

    .line 8
    .line 9
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0, v2, v1, v3}, Lax/q1/s;->e([BIIZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_15

    .line 20
    .line 21
    return v2

    .line 22
    :cond_15
    iput v1, p0, Lax/K1/h;->w:I

    .line 23
    .line 24
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lax/S0/G;->b0(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/S0/G;->O()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    iput-wide v4, p0, Lax/K1/h;->v:J

    .line 36
    .line 37
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 38
    .line 39
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lax/K1/h;->u:I

    .line 44
    .line 45
    :cond_2c
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 46
    .line 47
    const-wide/16 v6, 0x1

    .line 48
    .line 49
    const-wide/16 v8, -0x1

    .line 50
    .line 51
    cmp-long v0, v4, v6

    .line 52
    .line 53
    if-nez v0, :cond_4d

    .line 54
    .line 55
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 56
    .line 57
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v0, v1, v1}, Lax/q1/s;->readFully([BII)V

    .line 62
    .line 63
    .line 64
    iget v0, p0, Lax/K1/h;->w:I

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    iput v0, p0, Lax/K1/h;->w:I

    .line 68
    .line 69
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 70
    .line 71
    invoke-virtual {v0}, Lax/S0/G;->T()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    iput-wide v4, p0, Lax/K1/h;->v:J

    .line 76
    .line 77
    goto :goto_7c

    .line 78
    :cond_4d
    const-wide/16 v6, 0x0

    .line 79
    .line 80
    cmp-long v0, v4, v6

    .line 81
    .line 82
    if-nez v0, :cond_7c

    .line 83
    .line 84
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    cmp-long v0, v4, v8

    .line 89
    .line 90
    if-nez v0, :cond_6d

    .line 91
    .line 92
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_6d

    .line 99
    .line 100
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lax/T0/e$b;

    .line 107
    .line 108
    iget-wide v4, v0, Lax/T0/e$b;->b:J

    .line 109
    .line 110
    :cond_6d
    cmp-long v0, v4, v8

    .line 111
    .line 112
    if-eqz v0, :cond_7c

    .line 113
    .line 114
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    sub-long/2addr v4, v6

    .line 119
    iget v0, p0, Lax/K1/h;->w:I

    .line 120
    .line 121
    int-to-long v6, v0

    .line 122
    add-long/2addr v4, v6

    .line 123
    iput-wide v4, p0, Lax/K1/h;->v:J

    .line 124
    .line 125
    :cond_7c
    :goto_7c
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 126
    .line 127
    iget v0, p0, Lax/K1/h;->w:I

    .line 128
    .line 129
    int-to-long v6, v0

    .line 130
    cmp-long v10, v4, v6

    .line 131
    .line 132
    if-ltz v10, :cond_1bf

    .line 133
    .line 134
    iget-wide v6, p0, Lax/K1/h;->O:J

    .line 135
    .line 136
    cmp-long v10, v6, v8

    .line 137
    .line 138
    if-eqz v10, :cond_dc

    .line 139
    .line 140
    iget v6, p0, Lax/K1/h;->u:I

    .line 141
    .line 142
    const v7, 0x73696478

    .line 143
    .line 144
    .line 145
    if-ne v6, v7, :cond_d2

    .line 146
    .line 147
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 148
    .line 149
    long-to-int v5, v4

    .line 150
    invoke-virtual {v0, v5}, Lax/S0/G;->X(I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 154
    .line 155
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v4, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 160
    .line 161
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 169
    .line 170
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 175
    .line 176
    iget v2, p0, Lax/K1/h;->w:I

    .line 177
    .line 178
    int-to-long v8, v2

    .line 179
    sub-long/2addr v4, v8

    .line 180
    long-to-int v2, v4

    .line 181
    invoke-interface {p1, v0, v1, v2}, Lax/q1/s;->readFully([BII)V

    .line 182
    .line 183
    .line 184
    new-instance v0, Lax/T0/e$c;

    .line 185
    .line 186
    iget-object v1, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 187
    .line 188
    invoke-direct {v0, v7, v1}, Lax/T0/e$c;-><init>(ILax/S0/G;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 192
    .line 193
    invoke-interface {p1}, Lax/q1/s;->i()J

    .line 194
    .line 195
    .line 196
    move-result-wide v1

    .line 197
    invoke-static {v0, v1, v2}, Lax/K1/h;->I(Lax/S0/G;J)Landroid/util/Pair;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iget-object v0, p0, Lax/K1/h;->r:Lax/q1/i;

    .line 202
    .line 203
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Lax/q1/h;

    .line 206
    .line 207
    invoke-virtual {v0, p1}, Lax/q1/i;->a(Lax/q1/h;)V

    .line 208
    .line 209
    .line 210
    goto :goto_d8

    .line 211
    :cond_d2
    int-to-long v0, v0

    .line 212
    sub-long/2addr v4, v0

    .line 213
    long-to-int v0, v4

    .line 214
    invoke-interface {p1, v0, v3}, Lax/q1/s;->g(IZ)Z

    .line 215
    .line 216
    .line 217
    :goto_d8
    invoke-direct {p0}, Lax/K1/h;->m()V

    .line 218
    .line 219
    .line 220
    return v3

    .line 221
    :cond_dc
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    iget v0, p0, Lax/K1/h;->w:I

    .line 226
    .line 227
    int-to-long v6, v0

    .line 228
    sub-long/2addr v4, v6

    .line 229
    iget v0, p0, Lax/K1/h;->u:I

    .line 230
    .line 231
    const v6, 0x6d646174

    .line 232
    .line 233
    .line 234
    const v7, 0x6d6f6f66

    .line 235
    .line 236
    .line 237
    if-eq v0, v7, :cond_f0

    .line 238
    .line 239
    if-ne v0, v6, :cond_102

    .line 240
    .line 241
    :cond_f0
    iget-boolean v0, p0, Lax/K1/h;->M:Z

    .line 242
    .line 243
    if-nez v0, :cond_102

    .line 244
    .line 245
    iget-object v0, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 246
    .line 247
    new-instance v8, Lax/q1/N$b;

    .line 248
    .line 249
    iget-wide v9, p0, Lax/K1/h;->B:J

    .line 250
    .line 251
    invoke-direct {v8, v9, v10, v4, v5}, Lax/q1/N$b;-><init>(JJ)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v8}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 255
    .line 256
    .line 257
    iput-boolean v3, p0, Lax/K1/h;->M:Z

    .line 258
    .line 259
    :cond_102
    iget v0, p0, Lax/K1/h;->u:I

    .line 260
    .line 261
    if-ne v0, v7, :cond_122

    .line 262
    .line 263
    iget-object v0, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    const/4 v7, 0x0

    .line 270
    :goto_10d
    if-ge v7, v0, :cond_122

    .line 271
    .line 272
    iget-object v8, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 273
    .line 274
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    check-cast v8, Lax/K1/h$b;

    .line 279
    .line 280
    iget-object v8, v8, Lax/K1/h$b;->b:Lax/K1/v;

    .line 281
    .line 282
    iput-wide v4, v8, Lax/K1/v;->b:J

    .line 283
    .line 284
    iput-wide v4, v8, Lax/K1/v;->d:J

    .line 285
    .line 286
    iput-wide v4, v8, Lax/K1/v;->c:J

    .line 287
    .line 288
    add-int/lit8 v7, v7, 0x1

    .line 289
    .line 290
    goto :goto_10d

    .line 291
    :cond_122
    iget v0, p0, Lax/K1/h;->u:I

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    if-ne v0, v6, :cond_132

    .line 295
    .line 296
    iput-object v7, p0, Lax/K1/h;->D:Lax/K1/h$b;

    .line 297
    .line 298
    iget-wide v0, p0, Lax/K1/h;->v:J

    .line 299
    .line 300
    add-long/2addr v4, v0

    .line 301
    iput-wide v4, p0, Lax/K1/h;->y:J

    .line 302
    .line 303
    const/4 p1, 0x2

    .line 304
    iput p1, p0, Lax/K1/h;->t:I

    .line 305
    .line 306
    return v3

    .line 307
    :cond_132
    invoke-static {v0}, Lax/K1/h;->V(I)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_170

    .line 312
    .line 313
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 314
    .line 315
    .line 316
    move-result-wide v0

    .line 317
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 318
    .line 319
    add-long/2addr v0, v4

    .line 320
    const-wide/16 v6, 0x8

    .line 321
    .line 322
    sub-long/2addr v0, v6

    .line 323
    iget v2, p0, Lax/K1/h;->w:I

    .line 324
    .line 325
    int-to-long v6, v2

    .line 326
    cmp-long v2, v4, v6

    .line 327
    .line 328
    if-eqz v2, :cond_153

    .line 329
    .line 330
    iget v2, p0, Lax/K1/h;->u:I

    .line 331
    .line 332
    const v4, 0x6d657461

    .line 333
    .line 334
    .line 335
    if-ne v2, v4, :cond_153

    .line 336
    .line 337
    invoke-direct {p0, p1}, Lax/K1/h;->t(Lax/q1/s;)V

    .line 338
    .line 339
    .line 340
    :cond_153
    iget-object p1, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 341
    .line 342
    new-instance v2, Lax/T0/e$b;

    .line 343
    .line 344
    iget v4, p0, Lax/K1/h;->u:I

    .line 345
    .line 346
    invoke-direct {v2, v4, v0, v1}, Lax/T0/e$b;-><init>(IJ)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 353
    .line 354
    iget p1, p0, Lax/K1/h;->w:I

    .line 355
    .line 356
    int-to-long v6, p1

    .line 357
    cmp-long p1, v4, v6

    .line 358
    .line 359
    if-nez p1, :cond_16c

    .line 360
    .line 361
    invoke-direct {p0, v0, v1}, Lax/K1/h;->Q(J)V

    .line 362
    .line 363
    .line 364
    goto :goto_1b7

    .line 365
    :cond_16c
    invoke-direct {p0}, Lax/K1/h;->m()V

    .line 366
    .line 367
    .line 368
    goto :goto_1b7

    .line 369
    :cond_170
    iget p1, p0, Lax/K1/h;->u:I

    .line 370
    .line 371
    invoke-static {p1}, Lax/K1/h;->W(I)Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    const-wide/32 v4, 0x7fffffff

    .line 376
    .line 377
    .line 378
    if-eqz p1, :cond_1ad

    .line 379
    .line 380
    iget p1, p0, Lax/K1/h;->w:I

    .line 381
    .line 382
    if-ne p1, v1, :cond_1a6

    .line 383
    .line 384
    iget-wide v6, p0, Lax/K1/h;->v:J

    .line 385
    .line 386
    cmp-long p1, v6, v4

    .line 387
    .line 388
    if-gtz p1, :cond_19f

    .line 389
    .line 390
    new-instance p1, Lax/S0/G;

    .line 391
    .line 392
    iget-wide v4, p0, Lax/K1/h;->v:J

    .line 393
    .line 394
    long-to-int v0, v4

    .line 395
    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    .line 396
    .line 397
    .line 398
    iget-object v0, p0, Lax/K1/h;->m:Lax/S0/G;

    .line 399
    .line 400
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 409
    .line 410
    .line 411
    iput-object p1, p0, Lax/K1/h;->x:Lax/S0/G;

    .line 412
    .line 413
    iput v3, p0, Lax/K1/h;->t:I

    .line 414
    .line 415
    goto :goto_1b7

    .line 416
    :cond_19f
    const-string p1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 417
    .line 418
    invoke-static {p1}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    throw p1

    .line 423
    :cond_1a6
    const-string p1, "Leaf atom defines extended atom size (unsupported)."

    .line 424
    .line 425
    invoke-static {p1}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    throw p1

    .line 430
    :cond_1ad
    iget-wide v0, p0, Lax/K1/h;->v:J

    .line 431
    .line 432
    cmp-long p1, v0, v4

    .line 433
    .line 434
    if-gtz p1, :cond_1b8

    .line 435
    .line 436
    iput-object v7, p0, Lax/K1/h;->x:Lax/S0/G;

    .line 437
    .line 438
    iput v3, p0, Lax/K1/h;->t:I

    .line 439
    .line 440
    :goto_1b7
    return v3

    .line 441
    :cond_1b8
    const-string p1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 442
    .line 443
    invoke-static {p1}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    throw p1

    .line 448
    :cond_1bf
    const-string p1, "Atom size less than header length (unsupported)."

    .line 449
    .line 450
    invoke-static {p1}, Lax/P0/E;->d(Ljava/lang/String;)Lax/P0/E;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    throw p1
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
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private S(Lax/q1/s;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lax/K1/h;->v:J

    .line 2
    .line 3
    iget v2, p0, Lax/K1/h;->w:I

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    sub-long/2addr v0, v2

    .line 7
    long-to-int v1, v0

    .line 8
    iget-object v0, p0, Lax/K1/h;->x:Lax/S0/G;

    .line 9
    .line 10
    if-eqz v0, :cond_1f

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    invoke-interface {p1, v2, v3, v1}, Lax/q1/s;->readFully([BII)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lax/T0/e$c;

    .line 22
    .line 23
    iget v2, p0, Lax/K1/h;->u:I

    .line 24
    .line 25
    invoke-direct {v1, v2, v0}, Lax/T0/e$c;-><init>(ILax/S0/G;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v1, p1}, Lax/K1/h;->x(Lax/T0/e$c;Lax/q1/s;)V

    .line 29
    .line 30
    .line 31
    goto :goto_22

    .line 32
    :cond_1f
    invoke-interface {p1, v1}, Lax/q1/s;->n(I)V

    .line 33
    .line 34
    .line 35
    :goto_22
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-direct {p0, v0, v1}, Lax/K1/h;->Q(J)V

    .line 40
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

.method private T(Lax/q1/s;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide v2, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v5, v1

    .line 15
    :goto_e
    if-ge v4, v0, :cond_31

    .line 16
    .line 17
    iget-object v6, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Lax/K1/h$b;

    .line 24
    .line 25
    iget-object v6, v6, Lax/K1/h$b;->b:Lax/K1/v;

    .line 26
    .line 27
    iget-boolean v7, v6, Lax/K1/v;->p:Z

    .line 28
    .line 29
    if-eqz v7, :cond_2e

    .line 30
    .line 31
    iget-wide v6, v6, Lax/K1/v;->d:J

    .line 32
    .line 33
    cmp-long v8, v6, v2

    .line 34
    .line 35
    if-gez v8, :cond_2e

    .line 36
    .line 37
    iget-object v2, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v5, v2

    .line 44
    check-cast v5, Lax/K1/h$b;

    .line 45
    .line 46
    move-wide v2, v6

    .line 47
    :cond_2e
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_e

    .line 50
    :cond_31
    if-nez v5, :cond_37

    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    iput p1, p0, Lax/K1/h;->t:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    sub-long/2addr v2, v6

    .line 61
    long-to-int v0, v2

    .line 62
    if-ltz v0, :cond_48

    .line 63
    .line 64
    invoke-interface {p1, v0}, Lax/q1/s;->n(I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lax/K1/h$b;->b:Lax/K1/v;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lax/K1/v;->b(Lax/q1/s;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    const-string p1, "Offset to encryption data was negative."

    .line 74
    .line 75
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    throw p1
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

.method private U(Lax/q1/s;)Z
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lax/K1/h;->D:Lax/K1/h$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v2, :cond_43

    .line 10
    .line 11
    iget-object v2, v0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-static {v2}, Lax/K1/h;->p(Landroid/util/SparseArray;)Lax/K1/h$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_2a

    .line 18
    .line 19
    iget-wide v5, v0, Lax/K1/h;->y:J

    .line 20
    .line 21
    invoke-interface {v1}, Lax/q1/s;->getPosition()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    sub-long/2addr v5, v7

    .line 26
    long-to-int v2, v5

    .line 27
    if-ltz v2, :cond_23

    .line 28
    .line 29
    invoke-interface {v1, v2}, Lax/q1/s;->n(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Lax/K1/h;->m()V

    .line 33
    .line 34
    .line 35
    return v4

    .line 36
    :cond_23
    const-string v1, "Offset to end of mdat was negative."

    .line 37
    .line 38
    invoke-static {v1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    throw v1

    .line 43
    :cond_2a
    invoke-virtual {v2}, Lax/K1/h$b;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    invoke-interface {v1}, Lax/q1/s;->getPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sub-long/2addr v5, v7

    .line 52
    long-to-int v6, v5

    .line 53
    if-gez v6, :cond_3e

    .line 54
    .line 55
    const-string v5, "FragmentedMp4Extractor"

    .line 56
    .line 57
    const-string v6, "Ignoring negative offset to sample data."

    .line 58
    .line 59
    invoke-static {v5, v6}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    :cond_3e
    invoke-interface {v1, v6}, Lax/q1/s;->n(I)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lax/K1/h;->D:Lax/K1/h$b;

    .line 67
    .line 68
    :cond_43
    iget v5, v0, Lax/K1/h;->t:I

    .line 69
    .line 70
    const/4 v6, 0x3

    .line 71
    const/4 v7, 0x4

    .line 72
    const/4 v8, 0x1

    .line 73
    if-ne v5, v6, :cond_c8

    .line 74
    .line 75
    invoke-virtual {v2}, Lax/K1/h$b;->f()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iput v5, v0, Lax/K1/h;->E:I

    .line 80
    .line 81
    iget-object v5, v2, Lax/K1/h$b;->d:Lax/K1/w;

    .line 82
    .line 83
    iget-object v5, v5, Lax/K1/w;->a:Lax/K1/t;

    .line 84
    .line 85
    iget-object v5, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 86
    .line 87
    invoke-direct {v0, v5}, Lax/K1/h;->i(Lax/P0/v;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    xor-int/2addr v5, v8

    .line 92
    iput-boolean v5, v0, Lax/K1/h;->H:Z

    .line 93
    .line 94
    iget v5, v2, Lax/K1/h$b;->f:I

    .line 95
    .line 96
    iget v9, v2, Lax/K1/h$b;->i:I

    .line 97
    .line 98
    if-ge v5, v9, :cond_76

    .line 99
    .line 100
    iget v4, v0, Lax/K1/h;->E:I

    .line 101
    .line 102
    invoke-interface {v1, v4}, Lax/q1/s;->n(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lax/K1/h$b;->m()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lax/K1/h$b;->h()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_73

    .line 113
    .line 114
    iput-object v3, v0, Lax/K1/h;->D:Lax/K1/h$b;

    .line 115
    .line 116
    :cond_73
    iput v6, v0, Lax/K1/h;->t:I

    .line 117
    .line 118
    return v8

    .line 119
    :cond_76
    iget-object v5, v2, Lax/K1/h$b;->d:Lax/K1/w;

    .line 120
    .line 121
    iget-object v5, v5, Lax/K1/w;->a:Lax/K1/t;

    .line 122
    .line 123
    iget v5, v5, Lax/K1/t;->h:I

    .line 124
    .line 125
    if-ne v5, v8, :cond_88

    .line 126
    .line 127
    iget v5, v0, Lax/K1/h;->E:I

    .line 128
    .line 129
    const/16 v9, 0x8

    .line 130
    .line 131
    sub-int/2addr v5, v9

    .line 132
    iput v5, v0, Lax/K1/h;->E:I

    .line 133
    .line 134
    invoke-interface {v1, v9}, Lax/q1/s;->n(I)V

    .line 135
    .line 136
    .line 137
    :cond_88
    iget-object v5, v2, Lax/K1/h$b;->d:Lax/K1/w;

    .line 138
    .line 139
    iget-object v5, v5, Lax/K1/w;->a:Lax/K1/t;

    .line 140
    .line 141
    iget-object v5, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 142
    .line 143
    iget-object v5, v5, Lax/P0/v;->o:Ljava/lang/String;

    .line 144
    .line 145
    const-string v9, "audio/ac4"

    .line 146
    .line 147
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_b5

    .line 152
    .line 153
    iget v5, v0, Lax/K1/h;->E:I

    .line 154
    .line 155
    const/4 v9, 0x7

    .line 156
    invoke-virtual {v2, v5, v9}, Lax/K1/h$b;->i(II)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    iput v5, v0, Lax/K1/h;->F:I

    .line 161
    .line 162
    iget v5, v0, Lax/K1/h;->E:I

    .line 163
    .line 164
    iget-object v10, v0, Lax/K1/h;->j:Lax/S0/G;

    .line 165
    .line 166
    invoke-static {v5, v10}, Lax/q1/c;->b(ILax/S0/G;)V

    .line 167
    .line 168
    .line 169
    iget-object v5, v2, Lax/K1/h$b;->a:Lax/q1/U;

    .line 170
    .line 171
    iget-object v10, v0, Lax/K1/h;->j:Lax/S0/G;

    .line 172
    .line 173
    invoke-interface {v5, v10, v9}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 174
    .line 175
    .line 176
    iget v5, v0, Lax/K1/h;->F:I

    .line 177
    .line 178
    add-int/2addr v5, v9

    .line 179
    iput v5, v0, Lax/K1/h;->F:I

    .line 180
    .line 181
    goto :goto_bd

    .line 182
    :cond_b5
    iget v5, v0, Lax/K1/h;->E:I

    .line 183
    .line 184
    invoke-virtual {v2, v5, v4}, Lax/K1/h$b;->i(II)I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    iput v5, v0, Lax/K1/h;->F:I

    .line 189
    .line 190
    :goto_bd
    iget v5, v0, Lax/K1/h;->E:I

    .line 191
    .line 192
    iget v9, v0, Lax/K1/h;->F:I

    .line 193
    .line 194
    add-int/2addr v5, v9

    .line 195
    iput v5, v0, Lax/K1/h;->E:I

    .line 196
    .line 197
    iput v7, v0, Lax/K1/h;->t:I

    .line 198
    .line 199
    iput v4, v0, Lax/K1/h;->G:I

    .line 200
    .line 201
    :cond_c8
    iget-object v5, v2, Lax/K1/h$b;->d:Lax/K1/w;

    .line 202
    .line 203
    iget-object v5, v5, Lax/K1/w;->a:Lax/K1/t;

    .line 204
    .line 205
    iget-object v9, v2, Lax/K1/h$b;->a:Lax/q1/U;

    .line 206
    .line 207
    invoke-virtual {v2}, Lax/K1/h$b;->e()J

    .line 208
    .line 209
    .line 210
    move-result-wide v10

    .line 211
    iget-object v12, v0, Lax/K1/h;->k:Lax/S0/M;

    .line 212
    .line 213
    if-eqz v12, :cond_da

    .line 214
    .line 215
    invoke-virtual {v12, v10, v11}, Lax/S0/M;->a(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    :cond_da
    iget v12, v5, Lax/K1/t;->k:I

    .line 220
    .line 221
    if-eqz v12, :cond_1fb

    .line 222
    .line 223
    iget-object v12, v0, Lax/K1/h;->g:Lax/S0/G;

    .line 224
    .line 225
    invoke-virtual {v12}, Lax/S0/G;->f()[B

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    aput-byte v4, v12, v4

    .line 230
    .line 231
    aput-byte v4, v12, v8

    .line 232
    .line 233
    const/4 v13, 0x2

    .line 234
    aput-byte v4, v12, v13

    .line 235
    .line 236
    iget v13, v5, Lax/K1/t;->k:I

    .line 237
    .line 238
    rsub-int/lit8 v13, v13, 0x4

    .line 239
    .line 240
    :goto_ef
    iget v14, v0, Lax/K1/h;->F:I

    .line 241
    .line 242
    iget v15, v0, Lax/K1/h;->E:I

    .line 243
    .line 244
    if-ge v14, v15, :cond_20c

    .line 245
    .line 246
    iget v14, v0, Lax/K1/h;->G:I

    .line 247
    .line 248
    if-nez v14, :cond_17a

    .line 249
    .line 250
    iget-object v14, v0, Lax/K1/h;->L:[Lax/q1/U;

    .line 251
    .line 252
    array-length v14, v14

    .line 253
    if-gtz v14, :cond_102

    .line 254
    .line 255
    iget-boolean v14, v0, Lax/K1/h;->H:Z

    .line 256
    .line 257
    if-nez v14, :cond_113

    .line 258
    .line 259
    :cond_102
    iget-object v14, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 260
    .line 261
    invoke-static {v14}, Lax/T0/h;->o(Lax/P0/v;)I

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    iget v15, v5, Lax/K1/t;->k:I

    .line 266
    .line 267
    add-int/2addr v15, v14

    .line 268
    iget v6, v0, Lax/K1/h;->E:I

    .line 269
    .line 270
    iget v3, v0, Lax/K1/h;->F:I

    .line 271
    .line 272
    sub-int/2addr v6, v3

    .line 273
    if-gt v15, v6, :cond_113

    .line 274
    .line 275
    goto :goto_114

    .line 276
    :cond_113
    const/4 v14, 0x0

    .line 277
    :goto_114
    iget v3, v5, Lax/K1/t;->k:I

    .line 278
    .line 279
    add-int/2addr v3, v14

    .line 280
    invoke-interface {v1, v12, v13, v3}, Lax/q1/s;->readFully([BII)V

    .line 281
    .line 282
    .line 283
    iget-object v3, v0, Lax/K1/h;->g:Lax/S0/G;

    .line 284
    .line 285
    invoke-virtual {v3, v4}, Lax/S0/G;->b0(I)V

    .line 286
    .line 287
    .line 288
    iget-object v3, v0, Lax/K1/h;->g:Lax/S0/G;

    .line 289
    .line 290
    invoke-virtual {v3}, Lax/S0/G;->v()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-ltz v3, :cond_172

    .line 295
    .line 296
    sub-int/2addr v3, v14

    .line 297
    iput v3, v0, Lax/K1/h;->G:I

    .line 298
    .line 299
    iget-object v3, v0, Lax/K1/h;->f:Lax/S0/G;

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Lax/S0/G;->b0(I)V

    .line 302
    .line 303
    .line 304
    iget-object v3, v0, Lax/K1/h;->f:Lax/S0/G;

    .line 305
    .line 306
    invoke-interface {v9, v3, v7}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 307
    .line 308
    .line 309
    iget v3, v0, Lax/K1/h;->F:I

    .line 310
    .line 311
    add-int/2addr v3, v7

    .line 312
    iput v3, v0, Lax/K1/h;->F:I

    .line 313
    .line 314
    iget v3, v0, Lax/K1/h;->E:I

    .line 315
    .line 316
    add-int/2addr v3, v13

    .line 317
    iput v3, v0, Lax/K1/h;->E:I

    .line 318
    .line 319
    iget-object v3, v0, Lax/K1/h;->L:[Lax/q1/U;

    .line 320
    .line 321
    array-length v3, v3

    .line 322
    if-lez v3, :cond_151

    .line 323
    .line 324
    if-lez v14, :cond_151

    .line 325
    .line 326
    iget-object v3, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 327
    .line 328
    aget-byte v6, v12, v7

    .line 329
    .line 330
    invoke-static {v3, v6}, Lax/T0/h;->n(Lax/P0/v;B)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-eqz v3, :cond_151

    .line 335
    .line 336
    const/4 v3, 0x1

    .line 337
    goto :goto_152

    .line 338
    :cond_151
    const/4 v3, 0x0

    .line 339
    :goto_152
    iput-boolean v3, v0, Lax/K1/h;->I:Z

    .line 340
    .line 341
    iget-object v3, v0, Lax/K1/h;->g:Lax/S0/G;

    .line 342
    .line 343
    invoke-interface {v9, v3, v14}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 344
    .line 345
    .line 346
    iget v3, v0, Lax/K1/h;->F:I

    .line 347
    .line 348
    add-int/2addr v3, v14

    .line 349
    iput v3, v0, Lax/K1/h;->F:I

    .line 350
    .line 351
    if-lez v14, :cond_16e

    .line 352
    .line 353
    iget-boolean v3, v0, Lax/K1/h;->H:Z

    .line 354
    .line 355
    if-nez v3, :cond_16e

    .line 356
    .line 357
    iget-object v3, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 358
    .line 359
    invoke-static {v12, v7, v14, v3}, Lax/T0/h;->k([BIILax/P0/v;)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_16e

    .line 364
    .line 365
    iput-boolean v8, v0, Lax/K1/h;->H:Z

    .line 366
    .line 367
    :cond_16e
    :goto_16e
    const/4 v3, 0x0

    .line 368
    const/4 v6, 0x3

    .line 369
    goto/16 :goto_ef

    .line 370
    .line 371
    :cond_172
    const-string v1, "Invalid NAL length"

    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    invoke-static {v1, v2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    throw v1

    .line 379
    :cond_17a
    iget-boolean v3, v0, Lax/K1/h;->I:Z

    .line 380
    .line 381
    if-eqz v3, :cond_1eb

    .line 382
    .line 383
    iget-object v3, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 384
    .line 385
    invoke-virtual {v3, v14}, Lax/S0/G;->X(I)V

    .line 386
    .line 387
    .line 388
    iget-object v3, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 389
    .line 390
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    iget v6, v0, Lax/K1/h;->G:I

    .line 395
    .line 396
    invoke-interface {v1, v3, v4, v6}, Lax/q1/s;->readFully([BII)V

    .line 397
    .line 398
    .line 399
    iget-object v3, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 400
    .line 401
    iget v6, v0, Lax/K1/h;->G:I

    .line 402
    .line 403
    invoke-interface {v9, v3, v6}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 404
    .line 405
    .line 406
    iget v3, v0, Lax/K1/h;->G:I

    .line 407
    .line 408
    iget-object v6, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 409
    .line 410
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    iget-object v14, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 415
    .line 416
    invoke-virtual {v14}, Lax/S0/G;->j()I

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    invoke-static {v6, v14}, Lax/T0/h;->L([BI)I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    iget-object v14, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 425
    .line 426
    invoke-virtual {v14, v4}, Lax/S0/G;->b0(I)V

    .line 427
    .line 428
    .line 429
    iget-object v14, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 430
    .line 431
    invoke-virtual {v14, v6}, Lax/S0/G;->a0(I)V

    .line 432
    .line 433
    .line 434
    iget-object v6, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 435
    .line 436
    iget v6, v6, Lax/P0/v;->q:I

    .line 437
    .line 438
    const/4 v14, -0x1

    .line 439
    if-ne v6, v14, :cond_1c6

    .line 440
    .line 441
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 442
    .line 443
    invoke-virtual {v6}, Lax/T0/k;->f()I

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    if-eqz v6, :cond_1d7

    .line 448
    .line 449
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 450
    .line 451
    invoke-virtual {v6, v4}, Lax/T0/k;->g(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_1d7

    .line 455
    :cond_1c6
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 456
    .line 457
    invoke-virtual {v6}, Lax/T0/k;->f()I

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    iget-object v14, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 462
    .line 463
    iget v14, v14, Lax/P0/v;->q:I

    .line 464
    .line 465
    if-eq v6, v14, :cond_1d7

    .line 466
    .line 467
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 468
    .line 469
    invoke-virtual {v6, v14}, Lax/T0/k;->g(I)V

    .line 470
    .line 471
    .line 472
    :cond_1d7
    :goto_1d7
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 473
    .line 474
    iget-object v14, v0, Lax/K1/h;->h:Lax/S0/G;

    .line 475
    .line 476
    invoke-virtual {v6, v10, v11, v14}, Lax/T0/k;->a(JLax/S0/G;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Lax/K1/h$b;->c()I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    and-int/2addr v6, v7

    .line 484
    if-eqz v6, :cond_1ef

    .line 485
    .line 486
    iget-object v6, v0, Lax/K1/h;->p:Lax/T0/k;

    .line 487
    .line 488
    invoke-virtual {v6}, Lax/T0/k;->d()V

    .line 489
    .line 490
    .line 491
    goto :goto_1ef

    .line 492
    :cond_1eb
    invoke-interface {v9, v1, v14, v4}, Lax/q1/U;->a(Lax/P0/k;IZ)I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    :cond_1ef
    :goto_1ef
    iget v6, v0, Lax/K1/h;->F:I

    .line 497
    .line 498
    add-int/2addr v6, v3

    .line 499
    iput v6, v0, Lax/K1/h;->F:I

    .line 500
    .line 501
    iget v6, v0, Lax/K1/h;->G:I

    .line 502
    .line 503
    sub-int/2addr v6, v3

    .line 504
    iput v6, v0, Lax/K1/h;->G:I

    .line 505
    .line 506
    goto/16 :goto_16e

    .line 507
    .line 508
    :cond_1fb
    :goto_1fb
    iget v3, v0, Lax/K1/h;->F:I

    .line 509
    .line 510
    iget v5, v0, Lax/K1/h;->E:I

    .line 511
    .line 512
    if-ge v3, v5, :cond_20c

    .line 513
    .line 514
    sub-int/2addr v5, v3

    .line 515
    invoke-interface {v9, v1, v5, v4}, Lax/q1/U;->a(Lax/P0/k;IZ)I

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    iget v5, v0, Lax/K1/h;->F:I

    .line 520
    .line 521
    add-int/2addr v5, v3

    .line 522
    iput v5, v0, Lax/K1/h;->F:I

    .line 523
    .line 524
    goto :goto_1fb

    .line 525
    :cond_20c
    invoke-virtual {v2}, Lax/K1/h$b;->c()I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    iget-boolean v3, v0, Lax/K1/h;->H:Z

    .line 530
    .line 531
    if-nez v3, :cond_217

    .line 532
    .line 533
    const/high16 v3, 0x4000000

    .line 534
    .line 535
    or-int/2addr v1, v3

    .line 536
    :cond_217
    move v12, v1

    .line 537
    invoke-virtual {v2}, Lax/K1/h$b;->g()Lax/K1/u;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    if-eqz v1, :cond_222

    .line 542
    .line 543
    iget-object v1, v1, Lax/K1/u;->c:Lax/q1/U$a;

    .line 544
    .line 545
    move-object v15, v1

    .line 546
    goto :goto_223

    .line 547
    :cond_222
    const/4 v15, 0x0

    .line 548
    :goto_223
    iget v13, v0, Lax/K1/h;->E:I

    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    invoke-interface/range {v9 .. v15}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 552
    .line 553
    .line 554
    invoke-direct {v0, v10, v11}, Lax/K1/h;->A(J)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Lax/K1/h$b;->h()Z

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    if-nez v1, :cond_235

    .line 562
    .line 563
    const/4 v2, 0x0

    .line 564
    iput-object v2, v0, Lax/K1/h;->D:Lax/K1/h$b;

    .line 565
    .line 566
    :cond_235
    const/4 v1, 0x3

    .line 567
    iput v1, v0, Lax/K1/h;->t:I

    .line 568
    .line 569
    return v8
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
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private static V(I)Z
    .registers 2

    .line 1
    const v0, 0x6d6f6f76

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_35

    .line 5
    .line 6
    const v0, 0x7472616b

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_35

    .line 10
    .line 11
    const v0, 0x6d646961

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_35

    .line 15
    .line 16
    const v0, 0x6d696e66

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_35

    .line 20
    .line 21
    const v0, 0x7374626c

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_35

    .line 25
    .line 26
    const v0, 0x6d6f6f66

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_35

    .line 30
    .line 31
    const v0, 0x74726166

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_35

    .line 35
    .line 36
    const v0, 0x6d766578

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_35

    .line 40
    .line 41
    const v0, 0x65647473

    .line 42
    .line 43
    .line 44
    if-eq p0, v0, :cond_35

    .line 45
    .line 46
    const v0, 0x6d657461

    .line 47
    .line 48
    .line 49
    if-ne p0, v0, :cond_33

    .line 50
    .line 51
    goto :goto_35

    .line 52
    :cond_33
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_35
    :goto_35
    const/4 p0, 0x1

    .line 55
    return p0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static W(I)Z
    .registers 2

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_9e

    .line 5
    .line 6
    const v0, 0x6d646864

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_9e

    .line 10
    .line 11
    const v0, 0x6d766864

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_9e

    .line 15
    .line 16
    const v0, 0x73696478

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_9e

    .line 20
    .line 21
    const v0, 0x73747364

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_9e

    .line 25
    .line 26
    const v0, 0x73747473

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_9e

    .line 30
    .line 31
    const v0, 0x63747473

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_9e

    .line 35
    .line 36
    const v0, 0x73747363

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_9e

    .line 40
    .line 41
    const v0, 0x7374737a

    .line 42
    .line 43
    .line 44
    if-eq p0, v0, :cond_9e

    .line 45
    .line 46
    const v0, 0x73747a32

    .line 47
    .line 48
    .line 49
    if-eq p0, v0, :cond_9e

    .line 50
    .line 51
    const v0, 0x7374636f

    .line 52
    .line 53
    .line 54
    if-eq p0, v0, :cond_9e

    .line 55
    .line 56
    const v0, 0x636f3634

    .line 57
    .line 58
    .line 59
    if-eq p0, v0, :cond_9e

    .line 60
    .line 61
    const v0, 0x73747373

    .line 62
    .line 63
    .line 64
    if-eq p0, v0, :cond_9e

    .line 65
    .line 66
    const v0, 0x74666474

    .line 67
    .line 68
    .line 69
    if-eq p0, v0, :cond_9e

    .line 70
    .line 71
    const v0, 0x74666864

    .line 72
    .line 73
    .line 74
    if-eq p0, v0, :cond_9e

    .line 75
    .line 76
    const v0, 0x746b6864

    .line 77
    .line 78
    .line 79
    if-eq p0, v0, :cond_9e

    .line 80
    .line 81
    const v0, 0x74726578

    .line 82
    .line 83
    .line 84
    if-eq p0, v0, :cond_9e

    .line 85
    .line 86
    const v0, 0x7472756e

    .line 87
    .line 88
    .line 89
    if-eq p0, v0, :cond_9e

    .line 90
    .line 91
    const v0, 0x70737368    # 3.013775E29f

    .line 92
    .line 93
    .line 94
    if-eq p0, v0, :cond_9e

    .line 95
    .line 96
    const v0, 0x7361697a

    .line 97
    .line 98
    .line 99
    if-eq p0, v0, :cond_9e

    .line 100
    .line 101
    const v0, 0x7361696f

    .line 102
    .line 103
    .line 104
    if-eq p0, v0, :cond_9e

    .line 105
    .line 106
    const v0, 0x73656e63

    .line 107
    .line 108
    .line 109
    if-eq p0, v0, :cond_9e

    .line 110
    .line 111
    const v0, 0x75756964

    .line 112
    .line 113
    .line 114
    if-eq p0, v0, :cond_9e

    .line 115
    .line 116
    const v0, 0x73626770

    .line 117
    .line 118
    .line 119
    if-eq p0, v0, :cond_9e

    .line 120
    .line 121
    const v0, 0x73677064

    .line 122
    .line 123
    .line 124
    if-eq p0, v0, :cond_9e

    .line 125
    .line 126
    const v0, 0x656c7374

    .line 127
    .line 128
    .line 129
    if-eq p0, v0, :cond_9e

    .line 130
    .line 131
    const v0, 0x6d656864

    .line 132
    .line 133
    .line 134
    if-eq p0, v0, :cond_9e

    .line 135
    .line 136
    const v0, 0x656d7367

    .line 137
    .line 138
    .line 139
    if-eq p0, v0, :cond_9e

    .line 140
    .line 141
    const v0, 0x75647461

    .line 142
    .line 143
    .line 144
    if-eq p0, v0, :cond_9e

    .line 145
    .line 146
    const v0, 0x6b657973

    .line 147
    .line 148
    .line 149
    if-eq p0, v0, :cond_9e

    .line 150
    .line 151
    const v0, 0x696c7374

    .line 152
    .line 153
    .line 154
    if-ne p0, v0, :cond_9c

    .line 155
    .line 156
    goto :goto_9e

    .line 157
    :cond_9c
    const/4 p0, 0x0

    .line 158
    return p0

    .line 159
    :cond_9e
    :goto_9e
    const/4 p0, 0x1

    .line 160
    return p0
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

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    new-instance v0, Lax/K1/h;

    .line 2
    .line 3
    sget-object v1, Lax/N1/t$a;->a:Lax/N1/t$a;

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lax/K1/h;-><init>(Lax/N1/t$a;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v1, v1, [Lax/q1/r;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic h(Lax/K1/h;JLax/S0/G;)V
    .registers 4

    .line 1
    iget-object p0, p0, Lax/K1/h;->L:[Lax/q1/U;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, p0}, Lax/q1/g;->a(JLax/S0/G;[Lax/q1/U;)V

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

.method private i(Lax/P0/v;)Z
    .registers 5

    .line 1
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_14

    .line 12
    .line 13
    iget p1, p0, Lax/K1/h;->b:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x40

    .line 16
    .line 17
    if-eqz p1, :cond_13

    .line 18
    .line 19
    return v1

    .line 20
    :cond_13
    return v2

    .line 21
    :cond_14
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "video/hevc"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_25

    .line 30
    .line 31
    iget p1, p0, Lax/K1/h;->b:I

    .line 32
    .line 33
    and-int/lit16 p1, p1, 0x80

    .line 34
    .line 35
    if-eqz p1, :cond_25

    .line 36
    .line 37
    return v1

    .line 38
    :cond_25
    return v2
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

.method private static j(I)I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    if-ltz p0, :cond_3

    .line 2
    .line 3
    return p0

    .line 4
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "Unexpected negative value: "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0
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

.method public static l(I)I
    .registers 2

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const/16 v0, 0x40

    .line 6
    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_8
    and-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-eqz p0, :cond_f

    .line 12
    .line 13
    or-int/lit16 p0, v0, 0x80

    .line 14
    .line 15
    return p0

    .line 16
    :cond_f
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private m()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/K1/h;->t:I

    .line 3
    .line 4
    iput v0, p0, Lax/K1/h;->w:I

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

.method private n(Landroid/util/SparseArray;I)Lax/K1/c;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lax/K1/c;",
            ">;I)",
            "Lax/K1/c;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_f

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lax/K1/c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_f
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lax/K1/c;

    .line 21
    .line 22
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lax/K1/c;

    .line 27
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
.end method

.method private static o(Ljava/util/List;)Lax/P0/o;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/T0/e$c;",
            ">;)",
            "Lax/P0/o;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v1

    .line 8
    :goto_7
    if-ge v2, v0, :cond_3e

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Lax/T0/e$c;

    .line 15
    .line 16
    iget v5, v4, Lax/T0/e;->a:I

    .line 17
    .line 18
    const v6, 0x70737368    # 3.013775E29f

    .line 19
    .line 20
    .line 21
    if-ne v5, v6, :cond_3b

    .line 22
    .line 23
    if-nez v3, :cond_1d

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v4, v4, Lax/T0/e$c;->b:Lax/S0/G;

    .line 31
    .line 32
    invoke-virtual {v4}, Lax/S0/G;->f()[B

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lax/K1/p;->f([B)Ljava/util/UUID;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-nez v5, :cond_31

    .line 41
    .line 42
    const-string v4, "FragmentedMp4Extractor"

    .line 43
    .line 44
    const-string v5, "Skipped pssh atom (failed to extract uuid)"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3b

    .line 50
    :cond_31
    new-instance v6, Lax/P0/o$b;

    .line 51
    .line 52
    const-string v7, "video/mp4"

    .line 53
    .line 54
    invoke-direct {v6, v5, v7, v4}, Lax/P0/o$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3b
    :goto_3b
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_7

    .line 63
    :cond_3e
    if-nez v3, :cond_41

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_41
    new-instance p0, Lax/P0/o;

    .line 67
    .line 68
    invoke-direct {p0, v3}, Lax/P0/o;-><init>(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-object p0
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

.method private static p(Landroid/util/SparseArray;)Lax/K1/h$b;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lax/K1/h$b;",
            ">;)",
            "Lax/K1/h$b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_b
    if-ge v4, v0, :cond_3d

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Lax/K1/h$b;

    .line 19
    .line 20
    invoke-static {v5}, Lax/K1/h$b;->a(Lax/K1/h$b;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_21

    .line 25
    .line 26
    iget v6, v5, Lax/K1/h$b;->f:I

    .line 27
    .line 28
    iget-object v7, v5, Lax/K1/h$b;->d:Lax/K1/w;

    .line 29
    .line 30
    iget v7, v7, Lax/K1/w;->b:I

    .line 31
    .line 32
    if-eq v6, v7, :cond_3a

    .line 33
    .line 34
    :cond_21
    invoke-static {v5}, Lax/K1/h$b;->a(Lax/K1/h$b;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_30

    .line 39
    .line 40
    iget v6, v5, Lax/K1/h$b;->h:I

    .line 41
    .line 42
    iget-object v7, v5, Lax/K1/h$b;->b:Lax/K1/v;

    .line 43
    .line 44
    iget v7, v7, Lax/K1/v;->e:I

    .line 45
    .line 46
    if-ne v6, v7, :cond_30

    .line 47
    .line 48
    goto :goto_3a

    .line 49
    :cond_30
    invoke-virtual {v5}, Lax/K1/h$b;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v2

    .line 54
    .line 55
    if-gez v8, :cond_3a

    .line 56
    .line 57
    move-object v1, v5

    .line 58
    move-wide v2, v6

    .line 59
    :cond_3a
    :goto_3a
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_b

    .line 62
    :cond_3d
    return-object v1
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

.method private r()V
    .registers 8

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lax/q1/U;

    .line 3
    .line 4
    iput-object v0, p0, Lax/K1/h;->K:[Lax/q1/U;

    .line 5
    .line 6
    iget-object v1, p0, Lax/K1/h;->q:Lax/q1/U;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_e

    .line 10
    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_f

    .line 15
    :cond_e
    const/4 v1, 0x0

    .line 16
    :goto_f
    iget v3, p0, Lax/K1/h;->b:I

    .line 17
    .line 18
    and-int/lit8 v3, v3, 0x4

    .line 19
    .line 20
    const/16 v4, 0x64

    .line 21
    .line 22
    if-eqz v3, :cond_25

    .line 23
    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    iget-object v5, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 27
    .line 28
    const/4 v6, 0x5

    .line 29
    invoke-interface {v5, v4, v6}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v1

    .line 34
    .line 35
    const/16 v4, 0x65

    .line 36
    .line 37
    move v1, v3

    .line 38
    :cond_25
    iget-object v0, p0, Lax/K1/h;->K:[Lax/q1/U;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lax/S0/d0;->g1([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Lax/q1/U;

    .line 45
    .line 46
    iput-object v0, p0, Lax/K1/h;->K:[Lax/q1/U;

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    const/4 v3, 0x0

    .line 50
    :goto_31
    if-ge v3, v1, :cond_3d

    .line 51
    .line 52
    aget-object v5, v0, v3

    .line 53
    .line 54
    sget-object v6, Lax/K1/h;->R:Lax/P0/v;

    .line 55
    .line 56
    invoke-interface {v5, v6}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_31

    .line 62
    :cond_3d
    iget-object v0, p0, Lax/K1/h;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-array v0, v0, [Lax/q1/U;

    .line 69
    .line 70
    iput-object v0, p0, Lax/K1/h;->L:[Lax/q1/U;

    .line 71
    .line 72
    :goto_47
    iget-object v0, p0, Lax/K1/h;->L:[Lax/q1/U;

    .line 73
    .line 74
    array-length v0, v0

    .line 75
    if-ge v2, v0, :cond_68

    .line 76
    .line 77
    iget-object v0, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 78
    .line 79
    add-int/lit8 v1, v4, 0x1

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    invoke-interface {v0, v4, v3}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, p0, Lax/K1/h;->d:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lax/P0/v;

    .line 93
    .line 94
    invoke-interface {v0, v3}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lax/K1/h;->L:[Lax/q1/U;

    .line 98
    .line 99
    aput-object v0, v3, v2

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    move v4, v1

    .line 104
    goto :goto_47

    .line 105
    :cond_68
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

.method private static s(Lax/K1/t;)Z
    .registers 13

    .line 1
    iget-object v0, p0, Lax/K1/t;->i:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_35

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v2, v3, :cond_35

    .line 9
    .line 10
    iget-object v2, p0, Lax/K1/t;->j:[J

    .line 11
    .line 12
    if-nez v2, :cond_e

    .line 13
    .line 14
    goto :goto_35

    .line 15
    :cond_e
    aget-wide v4, v0, v1

    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    cmp-long v0, v4, v6

    .line 20
    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    return v3

    .line 24
    :cond_17
    const-wide/32 v6, 0xf4240

    .line 25
    .line 26
    .line 27
    iget-wide v8, p0, Lax/K1/t;->d:J

    .line 28
    .line 29
    invoke-static/range {v4 .. v9}, Lax/S0/d0;->p1(JJJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    iget-object v0, p0, Lax/K1/t;->j:[J

    .line 34
    .line 35
    aget-wide v6, v0, v1

    .line 36
    .line 37
    const-wide/32 v8, 0xf4240

    .line 38
    .line 39
    .line 40
    iget-wide v10, p0, Lax/K1/t;->c:J

    .line 41
    .line 42
    invoke-static/range {v6 .. v11}, Lax/S0/d0;->p1(JJJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    add-long/2addr v4, v6

    .line 47
    iget-wide v6, p0, Lax/K1/t;->e:J

    .line 48
    .line 49
    cmp-long p0, v4, v6

    .line 50
    .line 51
    if-ltz p0, :cond_35

    .line 52
    .line 53
    return v3

    .line 54
    :cond_35
    :goto_35
    return v1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private t(Lax/q1/s;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->p([BII)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 19
    .line 20
    invoke-static {v0}, Lax/K1/b;->g(Lax/S0/G;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/K1/h;->j:Lax/S0/G;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-interface {p1, v0}, Lax/q1/s;->n(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 33
    .line 34
    .line 35
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

.method private v(Lax/T0/e$b;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget v0, p1, Lax/T0/e;->a:I

    .line 2
    .line 3
    const v1, 0x6d6f6f76

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_b

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lax/K1/h;->z(Lax/T0/e$b;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    const v1, 0x6d6f6f66

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_14

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lax/K1/h;->y(Lax/T0/e$b;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_27

    .line 28
    .line 29
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lax/T0/e$b;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lax/T0/e$b;->b(Lax/T0/e$b;)V

    .line 38
    .line 39
    .line 40
    :cond_27
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
.end method

.method private w(Lax/S0/G;)V
    .registers 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lax/K1/h;->K:[Lax/q1/U;

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-nez v2, :cond_b

    .line 9
    .line 10
    goto/16 :goto_14e

    .line 11
    .line 12
    :cond_b
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lax/S0/G;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lax/S0/G;->v()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Lax/K1/b;->q(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eqz v2, :cond_74

    .line 32
    .line 33
    if-eq v2, v3, :cond_39

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "Skipping unsupported emsg version: "

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "FragmentedMp4Extractor"

    .line 53
    .line 54
    invoke-static {v2, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 59
    .line 60
    .line 61
    move-result-wide v10

    .line 62
    invoke-virtual {v1}, Lax/S0/G;->T()J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    const-wide/32 v8, 0xf4240

    .line 67
    .line 68
    .line 69
    invoke-static/range {v6 .. v11}, Lax/S0/d0;->p1(JJJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v12

    .line 73
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    const-wide/16 v8, 0x3e8

    .line 78
    .line 79
    invoke-static/range {v6 .. v11}, Lax/S0/d0;->p1(JJJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    invoke-virtual {v1}, Lax/S0/G;->G()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v1}, Lax/S0/G;->G()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    check-cast v10, Ljava/lang/String;

    .line 106
    .line 107
    move-wide/from16 v18, v6

    .line 108
    .line 109
    move-wide/from16 v20, v8

    .line 110
    .line 111
    move-wide v6, v4

    .line 112
    :goto_6f
    move-object/from16 v16, v2

    .line 113
    .line 114
    move-object/from16 v17, v10

    .line 115
    .line 116
    goto :goto_b5

    .line 117
    :cond_74
    invoke-virtual {v1}, Lax/S0/G;->G()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v1}, Lax/S0/G;->G()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v6}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    move-object v10, v6

    .line 136
    check-cast v10, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 143
    .line 144
    .line 145
    move-result-wide v11

    .line 146
    const-wide/32 v13, 0xf4240

    .line 147
    .line 148
    .line 149
    invoke-static/range {v11 .. v16}, Lax/S0/d0;->p1(JJJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide v6

    .line 153
    iget-wide v8, v0, Lax/K1/h;->C:J

    .line 154
    .line 155
    cmp-long v11, v8, v4

    .line 156
    .line 157
    if-eqz v11, :cond_a0

    .line 158
    .line 159
    add-long/2addr v8, v6

    .line 160
    goto :goto_a1

    .line 161
    :cond_a0
    move-wide v8, v4

    .line 162
    :goto_a1
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 163
    .line 164
    .line 165
    move-result-wide v11

    .line 166
    const-wide/16 v13, 0x3e8

    .line 167
    .line 168
    invoke-static/range {v11 .. v16}, Lax/S0/d0;->p1(JJJ)J

    .line 169
    .line 170
    .line 171
    move-result-wide v11

    .line 172
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 173
    .line 174
    .line 175
    move-result-wide v13

    .line 176
    move-wide/from16 v18, v11

    .line 177
    .line 178
    move-wide/from16 v20, v13

    .line 179
    .line 180
    move-wide v12, v8

    .line 181
    goto :goto_6f

    .line 182
    :goto_b5
    invoke-virtual {v1}, Lax/S0/G;->a()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    new-array v2, v2, [B

    .line 187
    .line 188
    invoke-virtual {v1}, Lax/S0/G;->a()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    const/4 v9, 0x0

    .line 193
    invoke-virtual {v1, v2, v9, v8}, Lax/S0/G;->q([BII)V

    .line 194
    .line 195
    .line 196
    new-instance v15, Lax/B1/a;

    .line 197
    .line 198
    move-object/from16 v22, v2

    .line 199
    .line 200
    invoke-direct/range {v15 .. v22}, Lax/B1/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lax/S0/G;

    .line 204
    .line 205
    iget-object v2, v0, Lax/K1/h;->l:Lax/B1/c;

    .line 206
    .line 207
    invoke-virtual {v2, v15}, Lax/B1/c;->a(Lax/B1/a;)[B

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v1, v2}, Lax/S0/G;-><init>([B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Lax/S0/G;->a()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    iget-object v8, v0, Lax/K1/h;->K:[Lax/q1/U;

    .line 219
    .line 220
    array-length v10, v8

    .line 221
    const/4 v11, 0x0

    .line 222
    :goto_dd
    if-ge v11, v10, :cond_ea

    .line 223
    .line 224
    aget-object v14, v8, v11

    .line 225
    .line 226
    invoke-virtual {v1, v9}, Lax/S0/G;->b0(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v14, v1, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v11, v11, 0x1

    .line 233
    .line 234
    goto :goto_dd

    .line 235
    :cond_ea
    cmp-long v1, v12, v4

    .line 236
    .line 237
    if-nez v1, :cond_fe

    .line 238
    .line 239
    iget-object v1, v0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 240
    .line 241
    new-instance v4, Lax/K1/h$a;

    .line 242
    .line 243
    invoke-direct {v4, v6, v7, v3, v2}, Lax/K1/h$a;-><init>(JZI)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget v1, v0, Lax/K1/h;->z:I

    .line 250
    .line 251
    add-int/2addr v1, v2

    .line 252
    iput v1, v0, Lax/K1/h;->z:I

    .line 253
    .line 254
    return-void

    .line 255
    :cond_fe
    iget-object v1, v0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-nez v1, :cond_116

    .line 262
    .line 263
    iget-object v1, v0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 264
    .line 265
    new-instance v3, Lax/K1/h$a;

    .line 266
    .line 267
    invoke-direct {v3, v12, v13, v9, v2}, Lax/K1/h$a;-><init>(JZI)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget v1, v0, Lax/K1/h;->z:I

    .line 274
    .line 275
    add-int/2addr v1, v2

    .line 276
    iput v1, v0, Lax/K1/h;->z:I

    .line 277
    .line 278
    return-void

    .line 279
    :cond_116
    iget-object v1, v0, Lax/K1/h;->k:Lax/S0/M;

    .line 280
    .line 281
    if-eqz v1, :cond_130

    .line 282
    .line 283
    invoke-virtual {v1}, Lax/S0/M;->g()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_130

    .line 288
    .line 289
    iget-object v1, v0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 290
    .line 291
    new-instance v3, Lax/K1/h$a;

    .line 292
    .line 293
    invoke-direct {v3, v12, v13, v9, v2}, Lax/K1/h$a;-><init>(JZI)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget v1, v0, Lax/K1/h;->z:I

    .line 300
    .line 301
    add-int/2addr v1, v2

    .line 302
    iput v1, v0, Lax/K1/h;->z:I

    .line 303
    .line 304
    return-void

    .line 305
    :cond_130
    iget-object v1, v0, Lax/K1/h;->k:Lax/S0/M;

    .line 306
    .line 307
    if-eqz v1, :cond_138

    .line 308
    .line 309
    invoke-virtual {v1, v12, v13}, Lax/S0/M;->a(J)J

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    :cond_138
    move-wide v15, v12

    .line 314
    iget-object v1, v0, Lax/K1/h;->K:[Lax/q1/U;

    .line 315
    .line 316
    array-length v3, v1

    .line 317
    :goto_13c
    if-ge v9, v3, :cond_14e

    .line 318
    .line 319
    aget-object v14, v1, v9

    .line 320
    .line 321
    const/16 v19, 0x0

    .line 322
    .line 323
    const/16 v20, 0x0

    .line 324
    .line 325
    const/16 v17, 0x1

    .line 326
    .line 327
    move/from16 v18, v2

    .line 328
    .line 329
    invoke-interface/range {v14 .. v20}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 330
    .line 331
    .line 332
    add-int/lit8 v9, v9, 0x1

    .line 333
    .line 334
    goto :goto_13c

    .line 335
    :cond_14e
    :goto_14e
    return-void
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

.method private x(Lax/T0/e$c;Lax/q1/s;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    iget-object p2, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lax/T0/e$b;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lax/T0/e$b;->c(Lax/T0/e$c;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget v0, p1, Lax/T0/e;->a:I

    .line 22
    .line 23
    const v1, 0x73696478

    .line 24
    .line 25
    .line 26
    if-ne v0, v1, :cond_62

    .line 27
    .line 28
    iget-object p1, p1, Lax/T0/e$c;->b:Lax/S0/G;

    .line 29
    .line 30
    invoke-interface {p2}, Lax/q1/s;->getPosition()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p1, v0, v1}, Lax/K1/h;->I(Lax/S0/G;J)Landroid/util/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v0, p0, Lax/K1/h;->r:Lax/q1/i;

    .line 39
    .line 40
    iget-object v1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lax/q1/h;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lax/q1/i;->a(Lax/q1/h;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, p0, Lax/K1/h;->M:Z

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    if-nez v0, :cond_49

    .line 51
    .line 52
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    iput-wide v2, p0, Lax/K1/h;->C:J

    .line 61
    .line 62
    iget-object p2, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 63
    .line 64
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lax/q1/N;

    .line 67
    .line 68
    invoke-interface {p2, p1}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p0, Lax/K1/h;->M:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    iget p1, p0, Lax/K1/h;->b:I

    .line 75
    .line 76
    and-int/lit16 p1, p1, 0x100

    .line 77
    .line 78
    if-eqz p1, :cond_6c

    .line 79
    .line 80
    iget-boolean p1, p0, Lax/K1/h;->N:Z

    .line 81
    .line 82
    if-nez p1, :cond_6c

    .line 83
    .line 84
    iget-object p1, p0, Lax/K1/h;->r:Lax/q1/i;

    .line 85
    .line 86
    invoke-virtual {p1}, Lax/q1/i;->c()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-le p1, v1, :cond_6c

    .line 91
    .line 92
    invoke-interface {p2}, Lax/q1/s;->getPosition()J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    iput-wide p1, p0, Lax/K1/h;->O:J

    .line 97
    .line 98
    return-void

    .line 99
    :cond_62
    const p2, 0x656d7367

    .line 100
    .line 101
    .line 102
    if-ne v0, p2, :cond_6c

    .line 103
    .line 104
    iget-object p1, p1, Lax/T0/e$c;->b:Lax/S0/G;

    .line 105
    .line 106
    invoke-direct {p0, p1}, Lax/K1/h;->w(Lax/S0/G;)V

    .line 107
    .line 108
    .line 109
    :cond_6c
    return-void
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

.method private y(Lax/T0/e$b;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object v1, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_9

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v1, 0x0

    .line 11
    :goto_a
    iget v3, p0, Lax/K1/h;->b:I

    .line 12
    .line 13
    iget-object v4, p0, Lax/K1/h;->i:[B

    .line 14
    .line 15
    invoke-static {p1, v0, v1, v3, v4}, Lax/K1/h;->C(Lax/T0/e$b;Landroid/util/SparseArray;ZI[B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lax/T0/e$b;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1}, Lax/K1/h;->o(Ljava/util/List;)Lax/P0/o;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_30

    .line 25
    .line 26
    iget-object v0, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_20
    if-ge v1, v0, :cond_30

    .line 34
    .line 35
    iget-object v3, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lax/K1/h$b;

    .line 42
    .line 43
    invoke-virtual {v3, p1}, Lax/K1/h$b;->n(Lax/P0/o;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_20

    .line 49
    :cond_30
    iget-wide v0, p0, Lax/K1/h;->A:J

    .line 50
    .line 51
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    cmp-long p1, v0, v3

    .line 57
    .line 58
    if-eqz p1, :cond_55

    .line 59
    .line 60
    iget-object p1, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_41
    if-ge v2, p1, :cond_53

    .line 67
    .line 68
    iget-object v0, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lax/K1/h$b;

    .line 75
    .line 76
    iget-wide v5, p0, Lax/K1/h;->A:J

    .line 77
    .line 78
    invoke-virtual {v0, v5, v6}, Lax/K1/h$b;->l(J)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_41

    .line 84
    :cond_53
    iput-wide v3, p0, Lax/K1/h;->A:J

    .line 85
    .line 86
    :cond_55
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

.method private z(Lax/T0/e$b;)V
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lax/K1/h;->c:Lax/K1/t;

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x1

    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v2, 0x0

    .line 14
    :goto_d
    const-string v3, "Unexpected moov box."

    .line 15
    .line 16
    invoke-static {v2, v3}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lax/T0/e$b;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v2}, Lax/K1/h;->o(Ljava/util/List;)Lax/P0/o;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const v2, 0x6d766578

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lax/T0/e$b;

    .line 37
    .line 38
    new-instance v11, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v3, v2, Lax/T0/e$b;->c:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    :goto_36
    if-ge v4, v3, :cond_6a

    .line 56
    .line 57
    iget-object v8, v2, Lax/T0/e$b;->c:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, Lax/T0/e$c;

    .line 64
    .line 65
    iget v12, v8, Lax/T0/e;->a:I

    .line 66
    .line 67
    const v13, 0x74726578

    .line 68
    .line 69
    .line 70
    if-ne v12, v13, :cond_5d

    .line 71
    .line 72
    iget-object v8, v8, Lax/T0/e$c;->b:Lax/S0/G;

    .line 73
    .line 74
    invoke-static {v8}, Lax/K1/h;->M(Lax/S0/G;)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iget-object v12, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v12, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v8, Lax/K1/c;

    .line 89
    .line 90
    invoke-virtual {v11, v12, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_68

    .line 94
    :cond_5d
    const v13, 0x6d656864

    .line 95
    .line 96
    .line 97
    if-ne v12, v13, :cond_68

    .line 98
    .line 99
    iget-object v6, v8, Lax/T0/e$c;->b:Lax/S0/G;

    .line 100
    .line 101
    invoke-static {v6}, Lax/K1/h;->B(Lax/S0/G;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    :cond_68
    :goto_68
    add-int/2addr v4, v10

    .line 106
    goto :goto_36

    .line 107
    :cond_6a
    const v2, 0x6d657461

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/4 v3, 0x0

    .line 115
    if-eqz v2, :cond_7a

    .line 116
    .line 117
    invoke-static {v2}, Lax/K1/b;->u(Lax/T0/e$b;)Lax/P0/C;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v12, v2

    .line 122
    goto :goto_7b

    .line 123
    :cond_7a
    move-object v12, v3

    .line 124
    :goto_7b
    new-instance v2, Lax/q1/F;

    .line 125
    .line 126
    invoke-direct {v2}, Lax/q1/F;-><init>()V

    .line 127
    .line 128
    .line 129
    const v4, 0x75647461

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v4}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_90

    .line 137
    .line 138
    invoke-static {v4}, Lax/K1/b;->I(Lax/T0/e$c;)Lax/P0/C;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v2, v3}, Lax/q1/F;->c(Lax/P0/C;)Z

    .line 143
    .line 144
    .line 145
    :cond_90
    move-object v13, v3

    .line 146
    new-instance v14, Lax/P0/C;

    .line 147
    .line 148
    const v3, 0x6d766864

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Lax/T0/e$c;

    .line 160
    .line 161
    iget-object v3, v3, Lax/T0/e$c;->b:Lax/S0/G;

    .line 162
    .line 163
    invoke-static {v3}, Lax/K1/b;->w(Lax/S0/G;)Lax/T0/g;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    new-array v4, v10, [Lax/P0/C$a;

    .line 168
    .line 169
    aput-object v3, v4, v9

    .line 170
    .line 171
    invoke-direct {v14, v4}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 172
    .line 173
    .line 174
    iget v3, v0, Lax/K1/h;->b:I

    .line 175
    .line 176
    and-int/lit8 v3, v3, 0x10

    .line 177
    .line 178
    if-eqz v3, :cond_b6

    .line 179
    .line 180
    move-wide v3, v6

    .line 181
    const/4 v6, 0x1

    .line 182
    goto :goto_b8

    .line 183
    :cond_b6
    move-wide v3, v6

    .line 184
    const/4 v6, 0x0

    .line 185
    :goto_b8
    new-instance v8, Lax/K1/e;

    .line 186
    .line 187
    invoke-direct {v8, v0}, Lax/K1/e;-><init>(Lax/K1/h;)V

    .line 188
    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    invoke-static/range {v1 .. v8}, Lax/K1/b;->H(Lax/T0/e$b;Lax/q1/F;JLax/P0/o;ZZLax/q7/f;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    iget-object v4, v0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 200
    .line 201
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-nez v4, :cond_13c

    .line 206
    .line 207
    invoke-static {v1}, Lax/K1/k;->b(Ljava/util/List;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    const/4 v5, 0x0

    .line 212
    :goto_d3
    if-ge v5, v3, :cond_136

    .line 213
    .line 214
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Lax/K1/w;

    .line 219
    .line 220
    iget-object v7, v6, Lax/K1/w;->a:Lax/K1/t;

    .line 221
    .line 222
    iget-object v8, v0, Lax/K1/h;->J:Lax/q1/t;

    .line 223
    .line 224
    iget v15, v7, Lax/K1/t;->b:I

    .line 225
    .line 226
    invoke-interface {v8, v5, v15}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    const/4 v15, 0x0

    .line 231
    const/16 v16, 0x1

    .line 232
    .line 233
    iget-wide v9, v7, Lax/K1/t;->e:J

    .line 234
    .line 235
    invoke-interface {v8, v9, v10}, Lax/q1/U;->d(J)V

    .line 236
    .line 237
    .line 238
    iget-object v9, v7, Lax/K1/t;->g:Lax/P0/v;

    .line 239
    .line 240
    invoke-virtual {v9}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v9, v4}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 245
    .line 246
    .line 247
    iget v10, v7, Lax/K1/t;->b:I

    .line 248
    .line 249
    invoke-static {v10, v2, v9}, Lax/K1/j;->l(ILax/q1/F;Lax/P0/v$b;)V

    .line 250
    .line 251
    .line 252
    iget v10, v7, Lax/K1/t;->b:I

    .line 253
    .line 254
    const/16 p1, 0x0

    .line 255
    .line 256
    iget-object v15, v7, Lax/K1/t;->g:Lax/P0/v;

    .line 257
    .line 258
    iget-object v15, v15, Lax/P0/v;->l:Lax/P0/C;

    .line 259
    .line 260
    move-object/from16 v17, v2

    .line 261
    .line 262
    const/4 v2, 0x2

    .line 263
    new-array v2, v2, [Lax/P0/C;

    .line 264
    .line 265
    aput-object v13, v2, p1

    .line 266
    .line 267
    aput-object v14, v2, v16

    .line 268
    .line 269
    invoke-static {v10, v12, v9, v15, v2}, Lax/K1/j;->m(ILax/P0/C;Lax/P0/v$b;Lax/P0/C;[Lax/P0/C;)V

    .line 270
    .line 271
    .line 272
    new-instance v2, Lax/K1/h$b;

    .line 273
    .line 274
    iget v10, v7, Lax/K1/t;->a:I

    .line 275
    .line 276
    invoke-direct {v0, v11, v10}, Lax/K1/h;->n(Landroid/util/SparseArray;I)Lax/K1/c;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {v9}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-direct {v2, v8, v6, v10, v9}, Lax/K1/h$b;-><init>(Lax/q1/U;Lax/K1/w;Lax/K1/c;Lax/P0/v;)V

    .line 285
    .line 286
    .line 287
    iget-object v6, v0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 288
    .line 289
    iget v8, v7, Lax/K1/t;->a:I

    .line 290
    .line 291
    invoke-virtual {v6, v8, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-wide v8, v0, Lax/K1/h;->B:J

    .line 295
    .line 296
    iget-wide v6, v7, Lax/K1/t;->e:J

    .line 297
    .line 298
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 299
    .line 300
    .line 301
    move-result-wide v6

    .line 302
    iput-wide v6, v0, Lax/K1/h;->B:J

    .line 303
    .line 304
    add-int/lit8 v5, v5, 0x1

    .line 305
    .line 306
    move-object/from16 v2, v17

    .line 307
    .line 308
    const/4 v9, 0x0

    .line 309
    const/4 v10, 0x1

    .line 310
    goto :goto_d3

    .line 311
    :cond_136
    iget-object v1, v0, Lax/K1/h;->J:Lax/q1/t;

    .line 312
    .line 313
    invoke-interface {v1}, Lax/q1/t;->o()V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_13c
    const/16 p1, 0x0

    .line 318
    .line 319
    const/16 v16, 0x1

    .line 320
    .line 321
    iget-object v2, v0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 322
    .line 323
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-ne v2, v3, :cond_14a

    .line 328
    .line 329
    const/4 v2, 0x1

    .line 330
    goto :goto_14b

    .line 331
    :cond_14a
    const/4 v2, 0x0

    .line 332
    :goto_14b
    invoke-static {v2}, Lax/S0/a;->g(Z)V

    .line 333
    .line 334
    .line 335
    const/4 v9, 0x0

    .line 336
    :goto_14f
    if-ge v9, v3, :cond_16f

    .line 337
    .line 338
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, Lax/K1/w;

    .line 343
    .line 344
    iget-object v4, v2, Lax/K1/w;->a:Lax/K1/t;

    .line 345
    .line 346
    iget-object v5, v0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 347
    .line 348
    iget v6, v4, Lax/K1/t;->a:I

    .line 349
    .line 350
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Lax/K1/h$b;

    .line 355
    .line 356
    iget v4, v4, Lax/K1/t;->a:I

    .line 357
    .line 358
    invoke-direct {v0, v11, v4}, Lax/K1/h;->n(Landroid/util/SparseArray;I)Lax/K1/c;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-virtual {v5, v2, v4}, Lax/K1/h$b;->j(Lax/K1/w;Lax/K1/c;)V

    .line 363
    .line 364
    .line 365
    add-int/lit8 v9, v9, 0x1

    .line 366
    .line 367
    goto :goto_14f

    .line 368
    :cond_16f
    return-void
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
.method public a(Lax/q1/t;)V
    .registers 15

    .line 1
    iget v0, p0, Lax/K1/h;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    new-instance v0, Lax/N1/u;

    .line 8
    .line 9
    iget-object v1, p0, Lax/K1/h;->a:Lax/N1/t$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lax/N1/u;-><init>(Lax/q1/t;Lax/N1/t$a;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_e
    iput-object p1, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 16
    .line 17
    invoke-direct {p0}, Lax/K1/h;->m()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lax/K1/h;->r()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 24
    .line 25
    if-eqz p1, :cond_60

    .line 26
    .line 27
    iget-object p1, p1, Lax/K1/t;->g:Lax/P0/v;

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 34
    .line 35
    iget-object v0, v0, Lax/K1/t;->g:Lax/P0/v;

    .line 36
    .line 37
    invoke-static {v0}, Lax/K1/k;->a(Lax/P0/v;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lax/K1/h$b;

    .line 45
    .line 46
    iget-object v1, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 47
    .line 48
    iget-object v2, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 49
    .line 50
    iget v2, v2, Lax/K1/t;->b:I

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-interface {v1, v3, v2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v4, Lax/K1/w;

    .line 58
    .line 59
    iget-object v5, p0, Lax/K1/h;->c:Lax/K1/t;

    .line 60
    .line 61
    new-array v6, v3, [J

    .line 62
    .line 63
    new-array v7, v3, [I

    .line 64
    .line 65
    new-array v9, v3, [J

    .line 66
    .line 67
    new-array v10, v3, [I

    .line 68
    .line 69
    const-wide/16 v11, 0x0

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-direct/range {v4 .. v12}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lax/K1/c;

    .line 76
    .line 77
    invoke-direct {v2, v3, v3, v3, v3}, Lax/K1/c;-><init>(IIII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {v0, v1, v4, v2, p1}, Lax/K1/h$b;-><init>(Lax/q1/U;Lax/K1/w;Lax/K1/c;Lax/P0/v;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-virtual {p1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 93
    .line 94
    invoke-interface {p1}, Lax/q1/t;->o()V

    .line 95
    .line 96
    .line 97
    :cond_60
    return-void
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

.method public b(JJ)V
    .registers 7

    .line 1
    iget-object p1, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_8
    if-ge v0, p1, :cond_18

    .line 10
    .line 11
    iget-object v1, p0, Lax/K1/h;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/K1/h$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/K1/h$b;->k()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_8

    .line 25
    :cond_18
    iget-object p1, p0, Lax/K1/h;->o:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 28
    .line 29
    .line 30
    iput p2, p0, Lax/K1/h;->z:I

    .line 31
    .line 32
    iget-object p1, p0, Lax/K1/h;->p:Lax/T0/k;

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/T0/k;->b()V

    .line 35
    .line 36
    .line 37
    iput-wide p3, p0, Lax/K1/h;->A:J

    .line 38
    .line 39
    iget-object p1, p0, Lax/K1/h;->n:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lax/K1/h;->m()V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public c(Lax/q1/s;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/K1/s;->b(Lax/q1/s;)Lax/q1/S;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    invoke-static {p1}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_f

    .line 12
    :cond_b
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_f
    iput-object v0, p0, Lax/K1/h;->s:Lax/r7/z;

    .line 17
    .line 18
    if-nez p1, :cond_15

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    return p1
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

.method public d()V
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

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    :goto_0
    iget v0, p0, Lax/K1/h;->t:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1a

    .line 5
    .line 6
    if-eq v0, v1, :cond_16

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_12

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lax/K1/h;->U(Lax/q1/s;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_12
    invoke-direct {p0, p1}, Lax/K1/h;->T(Lax/q1/s;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_16
    invoke-direct {p0, p1}, Lax/K1/h;->S(Lax/q1/s;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1a
    invoke-direct {p0, p1}, Lax/K1/h;->R(Lax/q1/s;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-wide v2, p0, Lax/K1/h;->O:J

    .line 34
    .line 35
    const-wide/16 v4, -0x1

    .line 36
    .line 37
    cmp-long p1, v2, v4

    .line 38
    .line 39
    if-eqz p1, :cond_3a

    .line 40
    .line 41
    iput-wide v2, p2, Lax/q1/M;->a:J

    .line 42
    .line 43
    iput-wide v4, p0, Lax/K1/h;->O:J

    .line 44
    .line 45
    iget-object p1, p0, Lax/K1/h;->J:Lax/q1/t;

    .line 46
    .line 47
    iget-object p2, p0, Lax/K1/h;->r:Lax/q1/i;

    .line 48
    .line 49
    invoke-virtual {p2}, Lax/q1/i;->b()Lax/q1/h;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 54
    .line 55
    .line 56
    iput-boolean v1, p0, Lax/K1/h;->N:Z

    .line 57
    .line 58
    return v1

    .line 59
    :cond_3a
    iget-object p1, p0, Lax/K1/h;->p:Lax/T0/k;

    .line 60
    .line 61
    invoke-virtual {p1}, Lax/T0/k;->d()V

    .line 62
    .line 63
    .line 64
    const/4 p1, -0x1

    .line 65
    return p1
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

.method public bridge synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/K1/h;->q()Lax/r7/z;

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

.method public q()Lax/r7/z;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/r7/z<",
            "Lax/q1/S;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K1/h;->s:Lax/r7/z;

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

.method protected u(Lax/K1/t;)Lax/K1/t;
    .registers 2

    .line 1
    return-object p1
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
