.class public final Lax/g1/c;
.super Landroidx/media3/exoplayer/h;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private A0:Z

.field private B0:J

.field private C0:Lax/P0/C;

.field private D0:J

.field private final t0:Lax/g1/a;

.field private final u0:Lax/g1/b;

.field private final v0:Landroid/os/Handler;

.field private final w0:Lax/z1/b;

.field private final x0:Z

.field private y0:Lax/z1/a;

.field private z0:Z


# direct methods
.method public constructor <init>(Lax/g1/b;Landroid/os/Looper;)V
    .registers 4

    .line 1
    sget-object v0, Lax/g1/a;->a:Lax/g1/a;

    invoke-direct {p0, p1, p2, v0}, Lax/g1/c;-><init>(Lax/g1/b;Landroid/os/Looper;Lax/g1/a;)V

    return-void
.end method

.method public constructor <init>(Lax/g1/b;Landroid/os/Looper;Lax/g1/a;)V
    .registers 5

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lax/g1/c;-><init>(Lax/g1/b;Landroid/os/Looper;Lax/g1/a;Z)V

    return-void
.end method

.method public constructor <init>(Lax/g1/b;Landroid/os/Looper;Lax/g1/a;Z)V
    .registers 6

    const/4 v0, 0x5

    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 4
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/g1/b;

    iput-object p1, p0, Lax/g1/c;->u0:Lax/g1/b;

    if-nez p2, :cond_10

    const/4 p1, 0x0

    goto :goto_14

    .line 5
    :cond_10
    invoke-static {p2, p0}, Lax/S0/d0;->z(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_14
    iput-object p1, p0, Lax/g1/c;->v0:Landroid/os/Handler;

    .line 6
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/g1/a;

    iput-object p1, p0, Lax/g1/c;->t0:Lax/g1/a;

    .line 7
    iput-boolean p4, p0, Lax/g1/c;->x0:Z

    .line 8
    new-instance p1, Lax/z1/b;

    invoke-direct {p1}, Lax/z1/b;-><init>()V

    iput-object p1, p0, Lax/g1/c;->w0:Lax/z1/b;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lax/g1/c;->D0:J

    return-void
.end method

.method private i0(Lax/P0/C;Ljava/util/List;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/C;",
            "Ljava/util/List<",
            "Lax/P0/C$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-virtual {p1}, Lax/P0/C;->e()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_60

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lax/P0/C;->d(I)Lax/P0/C$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Lax/P0/C$a;->a()Lax/P0/v;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_56

    .line 17
    .line 18
    iget-object v2, p0, Lax/g1/c;->t0:Lax/g1/a;

    .line 19
    .line 20
    invoke-interface {v2, v1}, Lax/g1/a;->b(Lax/P0/v;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_56

    .line 25
    .line 26
    iget-object v2, p0, Lax/g1/c;->t0:Lax/g1/a;

    .line 27
    .line 28
    invoke-interface {v2, v1}, Lax/g1/a;->a(Lax/P0/v;)Lax/z1/a;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v0}, Lax/P0/C;->d(I)Lax/P0/C$a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Lax/P0/C$a;->c()[B

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, [B

    .line 45
    .line 46
    iget-object v3, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 47
    .line 48
    invoke-virtual {v3}, Lax/V0/i;->p()V

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 52
    .line 53
    array-length v4, v2

    .line 54
    invoke-virtual {v3, v4}, Lax/V0/i;->C(I)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 58
    .line 59
    iget-object v3, v3, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-static {v3}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 71
    .line 72
    invoke-virtual {v2}, Lax/V0/i;->D()V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 76
    .line 77
    invoke-interface {v1, v2}, Lax/z1/a;->a(Lax/z1/b;)Lax/P0/C;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_5d

    .line 82
    .line 83
    invoke-direct {p0, v1, p2}, Lax/g1/c;->i0(Lax/P0/C;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    goto :goto_5d

    .line 87
    :cond_56
    invoke-virtual {p1, v0}, Lax/P0/C;->d(I)Lax/P0/C$a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_5d
    :goto_5d
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_1

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
.end method

.method private j0(J)J
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, p1, v2

    .line 9
    .line 10
    if-eqz v4, :cond_d

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v4, 0x0

    .line 15
    :goto_e
    invoke-static {v4}, Lax/S0/a;->g(Z)V

    .line 16
    .line 17
    .line 18
    iget-wide v4, p0, Lax/g1/c;->D0:J

    .line 19
    .line 20
    cmp-long v6, v4, v2

    .line 21
    .line 22
    if-eqz v6, :cond_18

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    :cond_18
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, Lax/g1/c;->D0:J

    .line 29
    .line 30
    sub-long/2addr p1, v0

    .line 31
    return-wide p1
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

.method private k0(Lax/P0/C;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/g1/c;->v0:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-direct {p0, p1}, Lax/g1/c;->l0(Lax/P0/C;)V

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

.method private l0(Lax/P0/C;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g1/c;->u0:Lax/g1/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/g1/b;->r(Lax/P0/C;)V

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

.method private m0(J)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1d

    .line 5
    .line 6
    iget-boolean v2, p0, Lax/g1/c;->x0:Z

    .line 7
    .line 8
    if-nez v2, :cond_13

    .line 9
    .line 10
    iget-wide v2, v0, Lax/P0/C;->b:J

    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, Lax/g1/c;->j0(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    cmp-long v0, v2, p1

    .line 17
    .line 18
    if-gtz v0, :cond_1d

    .line 19
    .line 20
    :cond_13
    iget-object p1, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lax/g1/c;->k0(Lax/P0/C;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 p1, 0x0

    .line 31
    :goto_1e
    iget-boolean p2, p0, Lax/g1/c;->z0:Z

    .line 32
    .line 33
    if-eqz p2, :cond_28

    .line 34
    .line 35
    iget-object p2, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 36
    .line 37
    if-nez p2, :cond_28

    .line 38
    .line 39
    iput-boolean v1, p0, Lax/g1/c;->A0:Z

    .line 40
    .line 41
    :cond_28
    return p1
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

.method private n0()V
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/g1/c;->z0:Z

    .line 2
    .line 3
    if-nez v0, :cond_7d

    .line 4
    .line 5
    iget-object v0, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 6
    .line 7
    if-nez v0, :cond_7d

    .line 8
    .line 9
    iget-object v0, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/V0/i;->p()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, -0x4

    .line 26
    if-ne v1, v2, :cond_6e

    .line 27
    .line 28
    iget-object v0, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/V0/a;->s()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_27

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lax/g1/c;->z0:Z

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    iget-object v0, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 41
    .line 42
    iget-wide v0, v0, Lax/V0/i;->g0:J

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    cmp-long v4, v0, v2

    .line 49
    .line 50
    if-ltz v4, :cond_7d

    .line 51
    .line 52
    iget-object v0, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 53
    .line 54
    iget-wide v1, p0, Lax/g1/c;->B0:J

    .line 55
    .line 56
    iput-wide v1, v0, Lax/z1/b;->k0:J

    .line 57
    .line 58
    invoke-virtual {v0}, Lax/V0/i;->D()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lax/g1/c;->y0:Lax/z1/a;

    .line 62
    .line 63
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lax/z1/a;

    .line 68
    .line 69
    iget-object v1, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 70
    .line 71
    invoke-interface {v0, v1}, Lax/z1/a;->a(Lax/z1/b;)Lax/P0/C;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_7d

    .line 76
    .line 77
    new-instance v1, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0}, Lax/P0/C;->e()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v0, v1}, Lax/g1/c;->i0(Lax/P0/C;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_7d

    .line 94
    .line 95
    new-instance v0, Lax/P0/C;

    .line 96
    .line 97
    iget-object v2, p0, Lax/g1/c;->w0:Lax/z1/b;

    .line 98
    .line 99
    iget-wide v2, v2, Lax/V0/i;->g0:J

    .line 100
    .line 101
    invoke-direct {p0, v2, v3}, Lax/g1/c;->j0(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    invoke-direct {v0, v2, v3, v1}, Lax/P0/C;-><init>(JLjava/util/List;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 109
    .line 110
    return-void

    .line 111
    :cond_6e
    const/4 v2, -0x5

    .line 112
    if-ne v1, v2, :cond_7d

    .line 113
    .line 114
    iget-object v0, v0, Lax/Y0/O;->b:Lax/P0/v;

    .line 115
    .line 116
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lax/P0/v;

    .line 121
    .line 122
    iget-wide v0, v0, Lax/P0/v;->t:J

    .line 123
    .line 124
    iput-wide v0, p0, Lax/g1/c;->B0:J

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


# virtual methods
.method protected U()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 3
    .line 4
    iput-object v0, p0, Lax/g1/c;->y0:Lax/z1/a;

    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lax/g1/c;->D0:J

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
.end method

.method protected X(JZ)V
    .registers 4

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lax/g1/c;->z0:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lax/g1/c;->A0:Z

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

.method public b(Lax/P0/v;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g1/c;->t0:Lax/g1/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/g1/a;->b(Lax/P0/v;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    iget p1, p1, Lax/P0/v;->P:I

    .line 10
    .line 11
    if-nez p1, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    goto :goto_f

    .line 15
    :cond_e
    const/4 p1, 0x2

    .line 16
    :goto_f
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

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

.method public c()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g1/c;->A0:Z

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

.method protected d0([Lax/P0/v;JJLax/i1/F$b;)V
    .registers 9

    .line 1
    iget-object p2, p0, Lax/g1/c;->t0:Lax/g1/a;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    aget-object p1, p1, p3

    .line 5
    .line 6
    invoke-interface {p2, p1}, Lax/g1/a;->a(Lax/P0/v;)Lax/z1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lax/g1/c;->y0:Lax/z1/a;

    .line 11
    .line 12
    iget-object p1, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 13
    .line 14
    if-eqz p1, :cond_1b

    .line 15
    .line 16
    iget-wide p2, p1, Lax/P0/C;->b:J

    .line 17
    .line 18
    iget-wide v0, p0, Lax/g1/c;->D0:J

    .line 19
    .line 20
    add-long/2addr p2, v0

    .line 21
    sub-long/2addr p2, p4

    .line 22
    invoke-virtual {p1, p2, p3}, Lax/P0/C;->c(J)Lax/P0/C;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lax/g1/c;->C0:Lax/P0/C;

    .line 27
    .line 28
    :cond_1b
    iput-wide p4, p0, Lax/g1/c;->D0:J

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

.method public getName()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "MetadataRenderer"

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

.method public handleMessage(Landroid/os/Message;)Z
    .registers 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_d

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lax/P0/C;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lax/g1/c;->l0(Lax/P0/C;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
.end method

.method public i(JJ)V
    .registers 5

    .line 1
    const/4 p3, 0x1

    .line 2
    :goto_1
    if-eqz p3, :cond_b

    .line 3
    .line 4
    invoke-direct {p0}, Lax/g1/c;->n0()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lax/g1/c;->m0(J)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    goto :goto_1

    .line 12
    :cond_b
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

.method public isReady()Z
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
