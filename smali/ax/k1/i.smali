.class public final Lax/k1/i;
.super Landroidx/media3/exoplayer/h;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private A0:Lax/N1/p;

.field private B0:Lax/N1/q;

.field private C0:Lax/N1/q;

.field private D0:I

.field private final E0:Landroid/os/Handler;

.field private final F0:Lax/k1/h;

.field private final G0:Lax/Y0/O;

.field private H0:Z

.field private I0:Z

.field private J0:Lax/P0/v;

.field private K0:J

.field private L0:J

.field private M0:Z

.field private final t0:Lax/N1/b;

.field private final u0:Lax/V0/i;

.field private v0:Lax/k1/a;

.field private final w0:Lax/k1/g;

.field private x0:Z

.field private y0:I

.field private z0:Lax/N1/l;


# direct methods
.method public constructor <init>(Lax/k1/h;Landroid/os/Looper;)V
    .registers 4

    .line 1
    sget-object v0, Lax/k1/g;->a:Lax/k1/g;

    invoke-direct {p0, p1, p2, v0}, Lax/k1/i;-><init>(Lax/k1/h;Landroid/os/Looper;Lax/k1/g;)V

    return-void
.end method

.method public constructor <init>(Lax/k1/h;Landroid/os/Looper;Lax/k1/g;)V
    .registers 5

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/k1/h;

    iput-object p1, p0, Lax/k1/i;->F0:Lax/k1/h;

    if-nez p2, :cond_10

    const/4 p1, 0x0

    goto :goto_14

    .line 4
    :cond_10
    invoke-static {p2, p0}, Lax/S0/d0;->z(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_14
    iput-object p1, p0, Lax/k1/i;->E0:Landroid/os/Handler;

    .line 5
    iput-object p3, p0, Lax/k1/i;->w0:Lax/k1/g;

    .line 6
    new-instance p1, Lax/N1/b;

    invoke-direct {p1}, Lax/N1/b;-><init>()V

    iput-object p1, p0, Lax/k1/i;->t0:Lax/N1/b;

    .line 7
    new-instance p1, Lax/V0/i;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lax/V0/i;-><init>(I)V

    iput-object p1, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 8
    new-instance p1, Lax/Y0/O;

    invoke-direct {p1}, Lax/Y0/O;-><init>()V

    iput-object p1, p0, Lax/k1/i;->G0:Lax/Y0/O;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lax/k1/i;->L0:J

    .line 10
    iput-wide p1, p0, Lax/k1/i;->K0:J

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lax/k1/i;->M0:Z

    return-void
.end method

.method private i0()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/k1/i;->M0:Z

    .line 2
    .line 3
    if-nez v0, :cond_2b

    .line 4
    .line 5
    iget-object v0, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 6
    .line 7
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "application/cea-608"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2b

    .line 16
    .line 17
    iget-object v0, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 18
    .line 19
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "application/x-mp4-cea-608"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2b

    .line 28
    .line 29
    iget-object v0, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 30
    .line 31
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "application/cea-708"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_29

    .line 40
    .line 41
    goto :goto_2b

    .line 42
    :cond_29
    const/4 v0, 0x0

    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    :goto_2b
    const/4 v0, 0x1

    .line 45
    :goto_2c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Legacy decoding is disabled, can\'t handle "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 56
    .line 57
    iget-object v2, v2, Lax/P0/v;->o:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, " samples (expected "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, "application/x-media3-cues"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, ")."

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v0, v1}, Lax/S0/a;->h(ZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
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

.method private j0()V
    .registers 5

    .line 1
    new-instance v0, Lax/R0/c;

    .line 2
    .line 3
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-wide v2, p0, Lax/k1/i;->K0:J

    .line 8
    .line 9
    invoke-direct {p0, v2, v3}, Lax/k1/i;->m0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-direct {v0, v1, v2, v3}, Lax/R0/c;-><init>(Ljava/util/List;J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lax/k1/i;->z0(Lax/R0/c;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private k0(J)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/N1/q;->d(J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2a

    .line 8
    .line 9
    iget-object p2, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 10
    .line 11
    invoke-virtual {p2}, Lax/N1/q;->l()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_11

    .line 16
    .line 17
    goto :goto_2a

    .line 18
    :cond_11
    const/4 p2, -0x1

    .line 19
    if-ne p1, p2, :cond_21

    .line 20
    .line 21
    iget-object p1, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/N1/q;->l()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lax/N1/q;->h(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :cond_21
    iget-object p2, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lax/N1/q;->h(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1

    .line 43
    :cond_2a
    :goto_2a
    iget-object p1, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 44
    .line 45
    iget-wide p1, p1, Landroidx/media3/decoder/a;->c0:J

    .line 46
    .line 47
    return-wide p1
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

.method private l0()J
    .registers 5

    .line 1
    iget v0, p0, Lax/k1/i;->D0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_b

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_b
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 13
    .line 14
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lax/k1/i;->D0:I

    .line 18
    .line 19
    iget-object v1, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/N1/q;->l()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1b

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 29
    .line 30
    iget v1, p0, Lax/k1/i;->D0:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lax/N1/q;->h(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
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

.method private m0(J)J
    .registers 6

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-eqz v2, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->R()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr p1, v0

    .line 21
    return-wide p1
    .line 22
.end method

.method private n0(Lax/N1/m;)V
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Subtitle decoding failed. streamFormat="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "TextRenderer"

    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lax/k1/i;->j0()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lax/k1/i;->x0()V

    .line 29
    .line 30
    .line 31
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
.end method

.method private static o0(Lax/N1/k;J)Z
    .registers 7

    .line 1
    if-eqz p0, :cond_17

    .line 2
    .line 3
    invoke-interface {p0}, Lax/N1/k;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_17

    .line 8
    .line 9
    invoke-interface {p0}, Lax/N1/k;->l()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    invoke-interface {p0, v0}, Lax/N1/k;->h(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p0, v2, p1

    .line 20
    .line 21
    if-lez p0, :cond_17

    .line 22
    .line 23
    return v1

    .line 24
    :cond_17
    const/4 p0, 0x0

    .line 25
    return p0
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

.method private p0()V
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/k1/i;->x0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/k1/i;->w0:Lax/k1/g;

    .line 5
    .line 6
    iget-object v1, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 7
    .line 8
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/P0/v;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lax/k1/g;->a(Lax/P0/v;)Lax/N1/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-interface {v0, v1, v2}, Lax/V0/g;->b(J)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method private q0(Lax/R0/c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/k1/i;->F0:Lax/k1/h;

    .line 2
    .line 3
    iget-object v1, p1, Lax/R0/c;->a:Lax/r7/z;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lax/k1/h;->t(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/k1/i;->F0:Lax/k1/h;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lax/k1/h;->s(Lax/R0/c;)V

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

.method private static r0(Lax/P0/v;)Z
    .registers 2

    .line 1
    iget-object p0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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

.method private s0(J)Z
    .registers 10

    .line 1
    iget-boolean v0, p0, Lax/k1/i;->H0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v0, p0, Lax/k1/i;->G0:Lax/Y0/O;

    .line 8
    .line 9
    iget-object v2, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x4

    .line 16
    if-eq v0, v2, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    iget-object v0, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/V0/a;->s()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1e

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lax/k1/i;->H0:Z

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/V0/i;->D()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 37
    .line 38
    iget-object v0, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iget-object v1, p0, Lax/k1/i;->t0:Lax/N1/b;

    .line 47
    .line 48
    iget-object v2, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 49
    .line 50
    iget-wide v2, v2, Lax/V0/i;->g0:J

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual/range {v1 .. v6}, Lax/N1/b;->a(J[BII)Lax/N1/e;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Lax/k1/i;->u0:Lax/V0/i;

    .line 69
    .line 70
    invoke-virtual {v1}, Lax/V0/i;->p()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 74
    .line 75
    invoke-interface {v1, v0, p1, p2}, Lax/k1/a;->b(Lax/N1/e;J)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    return p1
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

.method private t0()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/k1/i;->A0:Lax/N1/p;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lax/k1/i;->D0:I

    .line 6
    .line 7
    iget-object v1, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 8
    .line 9
    if-eqz v1, :cond_f

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/media3/decoder/a;->B()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 15
    .line 16
    :cond_f
    iget-object v1, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 17
    .line 18
    if-eqz v1, :cond_18

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/media3/decoder/a;->B()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 24
    .line 25
    :cond_18
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

.method private u0()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/k1/i;->t0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 5
    .line 6
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lax/N1/l;

    .line 11
    .line 12
    invoke-interface {v0}, Lax/V0/g;->d()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lax/k1/i;->y0:I

    .line 20
    .line 21
    return-void
.end method

.method private v0(J)V
    .registers 10

    .line 1
    invoke-direct {p0, p1, p2}, Lax/k1/i;->s0(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 6
    .line 7
    iget-wide v2, p0, Lax/k1/i;->K0:J

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Lax/k1/a;->a(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/high16 v3, -0x8000000000000000L

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    cmp-long v6, v1, v3

    .line 17
    .line 18
    if-nez v6, :cond_1b

    .line 19
    .line 20
    iget-boolean v3, p0, Lax/k1/i;->H0:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1b

    .line 23
    .line 24
    if-nez v0, :cond_1b

    .line 25
    .line 26
    iput-boolean v5, p0, Lax/k1/i;->I0:Z

    .line 27
    .line 28
    :cond_1b
    if-eqz v6, :cond_22

    .line 29
    .line 30
    cmp-long v3, v1, p1

    .line 31
    .line 32
    if-gtz v3, :cond_22

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    :cond_22
    if-eqz v0, :cond_41

    .line 36
    .line 37
    iget-object v0, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2}, Lax/k1/a;->c(J)Lax/r7/z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 44
    .line 45
    invoke-interface {v1, p1, p2}, Lax/k1/a;->d(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    new-instance v3, Lax/R0/c;

    .line 50
    .line 51
    invoke-direct {p0, v1, v2}, Lax/k1/i;->m0(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-direct {v3, v0, v4, v5}, Lax/R0/c;-><init>(Ljava/util/List;J)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v3}, Lax/k1/i;->z0(Lax/R0/c;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 62
    .line 63
    invoke-interface {v0, v1, v2}, Lax/k1/a;->e(J)V

    .line 64
    .line 65
    .line 66
    :cond_41
    iput-wide p1, p0, Lax/k1/i;->K0:J

    .line 67
    .line 68
    return-void
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

.method private w0(J)V
    .registers 13

    .line 1
    iput-wide p1, p0, Lax/k1/i;->K0:J

    .line 2
    .line 3
    iget-object v0, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 4
    .line 5
    if-nez v0, :cond_27

    .line 6
    .line 7
    iget-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 8
    .line 9
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lax/N1/l;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lax/N1/l;->e(J)V

    .line 16
    .line 17
    .line 18
    :try_start_11
    iget-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 19
    .line 20
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lax/N1/l;

    .line 25
    .line 26
    invoke-interface {v0}, Lax/V0/g;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lax/N1/q;

    .line 31
    .line 32
    iput-object v0, p0, Lax/k1/i;->C0:Lax/N1/q;
    :try_end_21
    .catch Lax/N1/m; {:try_start_11 .. :try_end_21} :catch_22

    .line 33
    .line 34
    goto :goto_27

    .line 35
    :catch_22
    move-exception p1

    .line 36
    invoke-direct {p0, p1}, Lax/k1/i;->n0(Lax/N1/m;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    :goto_27
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x2

    .line 45
    if-eq v0, v1, :cond_30

    .line 46
    .line 47
    goto/16 :goto_129

    .line 48
    .line 49
    :cond_30
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    if-eqz v0, :cond_4a

    .line 54
    .line 55
    invoke-direct {p0}, Lax/k1/i;->l0()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    const/4 v0, 0x0

    .line 60
    :goto_3b
    cmp-long v6, v4, p1

    .line 61
    .line 62
    if-gtz v6, :cond_4b

    .line 63
    .line 64
    iget v0, p0, Lax/k1/i;->D0:I

    .line 65
    .line 66
    add-int/2addr v0, v3

    .line 67
    iput v0, p0, Lax/k1/i;->D0:I

    .line 68
    .line 69
    invoke-direct {p0}, Lax/k1/i;->l0()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    const/4 v0, 0x1

    .line 74
    goto :goto_3b

    .line 75
    :cond_4a
    const/4 v0, 0x0

    .line 76
    :cond_4b
    iget-object v4, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    if-eqz v4, :cond_8b

    .line 80
    .line 81
    invoke-virtual {v4}, Lax/V0/a;->s()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_73

    .line 86
    .line 87
    if-nez v0, :cond_8b

    .line 88
    .line 89
    invoke-direct {p0}, Lax/k1/i;->l0()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const-wide v8, 0x7fffffffffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    cmp-long v4, v6, v8

    .line 99
    .line 100
    if-nez v4, :cond_8b

    .line 101
    .line 102
    iget v4, p0, Lax/k1/i;->y0:I

    .line 103
    .line 104
    if-ne v4, v1, :cond_6d

    .line 105
    .line 106
    invoke-direct {p0}, Lax/k1/i;->x0()V

    .line 107
    .line 108
    .line 109
    goto :goto_8b

    .line 110
    :cond_6d
    invoke-direct {p0}, Lax/k1/i;->t0()V

    .line 111
    .line 112
    .line 113
    iput-boolean v3, p0, Lax/k1/i;->I0:Z

    .line 114
    .line 115
    goto :goto_8b

    .line 116
    :cond_73
    iget-wide v6, v4, Landroidx/media3/decoder/a;->c0:J

    .line 117
    .line 118
    cmp-long v8, v6, p1

    .line 119
    .line 120
    if-gtz v8, :cond_8b

    .line 121
    .line 122
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 123
    .line 124
    if-eqz v0, :cond_80

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/media3/decoder/a;->B()V

    .line 127
    .line 128
    .line 129
    :cond_80
    invoke-virtual {v4, p1, p2}, Lax/N1/q;->d(J)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iput v0, p0, Lax/k1/i;->D0:I

    .line 134
    .line 135
    iput-object v4, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 136
    .line 137
    iput-object v5, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    :cond_8b
    :goto_8b
    if-eqz v0, :cond_a8

    .line 141
    .line 142
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 143
    .line 144
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, p1, p2}, Lax/k1/i;->k0(J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    invoke-direct {p0, v6, v7}, Lax/k1/i;->m0(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    new-instance v0, Lax/R0/c;

    .line 156
    .line 157
    iget-object v4, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 158
    .line 159
    invoke-virtual {v4, p1, p2}, Lax/N1/q;->j(J)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {v0, p1, v6, v7}, Lax/R0/c;-><init>(Ljava/util/List;J)V

    .line 164
    .line 165
    .line 166
    invoke-direct {p0, v0}, Lax/k1/i;->z0(Lax/R0/c;)V

    .line 167
    .line 168
    .line 169
    :cond_a8
    iget p1, p0, Lax/k1/i;->y0:I

    .line 170
    .line 171
    if-ne p1, v1, :cond_ae

    .line 172
    .line 173
    goto/16 :goto_129

    .line 174
    .line 175
    :cond_ae
    :goto_ae
    :try_start_ae
    iget-boolean p1, p0, Lax/k1/i;->H0:Z

    .line 176
    .line 177
    if-nez p1, :cond_129

    .line 178
    .line 179
    iget-object p1, p0, Lax/k1/i;->A0:Lax/N1/p;

    .line 180
    .line 181
    if-nez p1, :cond_cc

    .line 182
    .line 183
    iget-object p1, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 184
    .line 185
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lax/N1/l;

    .line 190
    .line 191
    invoke-interface {p1}, Lax/V0/g;->f()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Lax/N1/p;

    .line 196
    .line 197
    if-nez p1, :cond_c7

    .line 198
    .line 199
    goto :goto_129

    .line 200
    :cond_c7
    iput-object p1, p0, Lax/k1/i;->A0:Lax/N1/p;

    .line 201
    .line 202
    goto :goto_cc

    .line 203
    :catch_ca
    move-exception p1

    .line 204
    goto :goto_126

    .line 205
    :cond_cc
    :goto_cc
    iget p2, p0, Lax/k1/i;->y0:I

    .line 206
    .line 207
    if-ne p2, v3, :cond_e4

    .line 208
    .line 209
    const/4 p2, 0x4

    .line 210
    invoke-virtual {p1, p2}, Lax/V0/a;->A(I)V

    .line 211
    .line 212
    .line 213
    iget-object p2, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 214
    .line 215
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    check-cast p2, Lax/N1/l;

    .line 220
    .line 221
    invoke-interface {p2, p1}, Lax/V0/g;->g(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iput-object v5, p0, Lax/k1/i;->A0:Lax/N1/p;

    .line 225
    .line 226
    iput v1, p0, Lax/k1/i;->y0:I

    .line 227
    .line 228
    return-void

    .line 229
    :cond_e4
    iget-object p2, p0, Lax/k1/i;->G0:Lax/Y0/O;

    .line 230
    .line 231
    invoke-virtual {p0, p2, p1, v2}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    const/4 v0, -0x4

    .line 236
    if-ne p2, v0, :cond_122

    .line 237
    .line 238
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    if-eqz p2, :cond_f8

    .line 243
    .line 244
    iput-boolean v3, p0, Lax/k1/i;->H0:Z

    .line 245
    .line 246
    iput-boolean v2, p0, Lax/k1/i;->x0:Z

    .line 247
    .line 248
    goto :goto_110

    .line 249
    :cond_f8
    iget-object p2, p0, Lax/k1/i;->G0:Lax/Y0/O;

    .line 250
    .line 251
    iget-object p2, p2, Lax/Y0/O;->b:Lax/P0/v;

    .line 252
    .line 253
    if-nez p2, :cond_ff

    .line 254
    .line 255
    goto :goto_129

    .line 256
    :cond_ff
    iget-wide v6, p2, Lax/P0/v;->t:J

    .line 257
    .line 258
    iput-wide v6, p1, Lax/N1/p;->k0:J

    .line 259
    .line 260
    invoke-virtual {p1}, Lax/V0/i;->D()V

    .line 261
    .line 262
    .line 263
    iget-boolean p2, p0, Lax/k1/i;->x0:Z

    .line 264
    .line 265
    invoke-virtual {p1}, Lax/V0/a;->u()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    xor-int/2addr v0, v3

    .line 270
    and-int/2addr p2, v0

    .line 271
    iput-boolean p2, p0, Lax/k1/i;->x0:Z

    .line 272
    .line 273
    :goto_110
    iget-boolean p2, p0, Lax/k1/i;->x0:Z

    .line 274
    .line 275
    if-nez p2, :cond_ae

    .line 276
    .line 277
    iget-object p2, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 278
    .line 279
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    check-cast p2, Lax/N1/l;

    .line 284
    .line 285
    invoke-interface {p2, p1}, Lax/V0/g;->g(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    iput-object v5, p0, Lax/k1/i;->A0:Lax/N1/p;
    :try_end_121
    .catch Lax/N1/m; {:try_start_ae .. :try_end_121} :catch_ca

    .line 289
    .line 290
    goto :goto_ae

    .line 291
    :cond_122
    const/4 p1, -0x3

    .line 292
    if-ne p2, p1, :cond_ae

    .line 293
    .line 294
    goto :goto_129

    .line 295
    :goto_126
    invoke-direct {p0, p1}, Lax/k1/i;->n0(Lax/N1/m;)V

    .line 296
    .line 297
    .line 298
    :cond_129
    :goto_129
    return-void
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

.method private x0()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/k1/i;->u0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/k1/i;->p0()V

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

.method private z0(Lax/R0/c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/k1/i;->E0:Landroid/os/Handler;

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
    invoke-direct {p0, p1}, Lax/k1/i;->q0(Lax/R0/c;)V

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


# virtual methods
.method protected U()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lax/k1/i;->L0:J

    .line 10
    .line 11
    invoke-direct {p0}, Lax/k1/i;->j0()V

    .line 12
    .line 13
    .line 14
    iput-wide v0, p0, Lax/k1/i;->K0:J

    .line 15
    .line 16
    iget-object v0, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 17
    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    invoke-direct {p0}, Lax/k1/i;->u0()V

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

.method protected X(JZ)V
    .registers 4

    .line 1
    iput-wide p1, p0, Lax/k1/i;->K0:J

    .line 2
    .line 3
    iget-object p1, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 4
    .line 5
    if-eqz p1, :cond_9

    .line 6
    .line 7
    invoke-interface {p1}, Lax/k1/a;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_9
    invoke-direct {p0}, Lax/k1/i;->j0()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lax/k1/i;->H0:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lax/k1/i;->I0:Z

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lax/k1/i;->L0:J

    .line 24
    .line 25
    iget-object p1, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 26
    .line 27
    if-eqz p1, :cond_3f

    .line 28
    .line 29
    invoke-static {p1}, Lax/k1/i;->r0(Lax/P0/v;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_3f

    .line 34
    .line 35
    iget p1, p0, Lax/k1/i;->y0:I

    .line 36
    .line 37
    if-eqz p1, :cond_2a

    .line 38
    .line 39
    invoke-direct {p0}, Lax/k1/i;->x0()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-direct {p0}, Lax/k1/i;->t0()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 47
    .line 48
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lax/N1/l;

    .line 53
    .line 54
    invoke-interface {p1}, Lax/V0/g;->flush()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->O()J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    invoke-interface {p1, p2, p3}, Lax/V0/g;->b(J)V

    .line 62
    .line 63
    .line 64
    :cond_3f
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

.method public b(Lax/P0/v;)I
    .registers 3

    .line 1
    invoke-static {p1}, Lax/k1/i;->r0(Lax/P0/v;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_23

    .line 6
    .line 7
    iget-object v0, p0, Lax/k1/i;->w0:Lax/k1/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lax/k1/g;->b(Lax/P0/v;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    goto :goto_23

    .line 16
    :cond_f
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1}, Lax/P0/D;->r(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1d

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1d
    const/4 p1, 0x0

    .line 31
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_23
    :goto_23
    iget p1, p1, Lax/P0/v;->P:I

    .line 37
    .line 38
    if-nez p1, :cond_29

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 p1, 0x2

    .line 43
    :goto_2a
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
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
    iget-boolean v0, p0, Lax/k1/i;->I0:Z

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
    .registers 7

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iput-object p1, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 5
    .line 6
    invoke-static {p1}, Lax/k1/i;->r0(Lax/P0/v;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x1

    .line 11
    if-nez p1, :cond_1a

    .line 12
    .line 13
    invoke-direct {p0}, Lax/k1/i;->i0()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/k1/i;->z0:Lax/N1/l;

    .line 17
    .line 18
    if-eqz p1, :cond_16

    .line 19
    .line 20
    iput p2, p0, Lax/k1/i;->y0:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    invoke-direct {p0}, Lax/k1/i;->p0()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object p1, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 28
    .line 29
    iget p1, p1, Lax/P0/v;->M:I

    .line 30
    .line 31
    if-ne p1, p2, :cond_26

    .line 32
    .line 33
    new-instance p1, Lax/k1/e;

    .line 34
    .line 35
    invoke-direct {p1}, Lax/k1/e;-><init>()V

    .line 36
    .line 37
    .line 38
    goto :goto_2b

    .line 39
    :cond_26
    new-instance p1, Lax/k1/f;

    .line 40
    .line 41
    invoke-direct {p1}, Lax/k1/f;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_2b
    iput-object p1, p0, Lax/k1/i;->v0:Lax/k1/a;

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
    const-string v0, "TextRenderer"

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
    check-cast p1, Lax/R0/c;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lax/k1/i;->q0(Lax/R0/c;)V

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
    .registers 8

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->G()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_1b

    .line 6
    .line 7
    iget-wide p3, p0, Lax/k1/i;->L0:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, p3, v0

    .line 15
    .line 16
    if-eqz v2, :cond_1b

    .line 17
    .line 18
    cmp-long v0, p1, p3

    .line 19
    .line 20
    if-ltz v0, :cond_1b

    .line 21
    .line 22
    invoke-direct {p0}, Lax/k1/i;->t0()V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, Lax/k1/i;->I0:Z

    .line 27
    .line 28
    :cond_1b
    iget-boolean p3, p0, Lax/k1/i;->I0:Z

    .line 29
    .line 30
    if-eqz p3, :cond_20

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object p3, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 34
    .line 35
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Lax/P0/v;

    .line 40
    .line 41
    invoke-static {p3}, Lax/k1/i;->r0(Lax/P0/v;)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_37

    .line 46
    .line 47
    iget-object p3, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 48
    .line 49
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1, p2}, Lax/k1/i;->v0(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    invoke-direct {p0}, Lax/k1/i;->i0()V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, p1, p2}, Lax/k1/i;->w0(J)V

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
.end method

.method public isReady()Z
    .registers 8

    .line 1
    iget-object v0, p0, Lax/k1/i;->J0:Lax/P0/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/P0/v;

    .line 12
    .line 13
    invoke-static {v0}, Lax/k1/i;->r0(Lax/P0/v;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_2d

    .line 19
    .line 20
    iget-object v0, p0, Lax/k1/i;->v0:Lax/k1/a;

    .line 21
    .line 22
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lax/k1/a;

    .line 27
    .line 28
    iget-wide v3, p0, Lax/k1/i;->K0:J

    .line 29
    .line 30
    invoke-interface {v0, v3, v4}, Lax/k1/a;->a(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    const-wide/high16 v5, -0x8000000000000000L

    .line 35
    .line 36
    cmp-long v0, v3, v5

    .line 37
    .line 38
    if-eqz v0, :cond_28

    .line 39
    .line 40
    return v1

    .line 41
    :cond_28
    :try_start_28
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->C()V
    :try_end_2b
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_2b} :catch_2c

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :catch_2c
    return v2

    .line 46
    :cond_2d
    iget-boolean v0, p0, Lax/k1/i;->I0:Z

    .line 47
    .line 48
    if-nez v0, :cond_4e

    .line 49
    .line 50
    iget-boolean v0, p0, Lax/k1/i;->H0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_4d

    .line 53
    .line 54
    iget-object v0, p0, Lax/k1/i;->B0:Lax/N1/q;

    .line 55
    .line 56
    iget-wide v3, p0, Lax/k1/i;->K0:J

    .line 57
    .line 58
    invoke-static {v0, v3, v4}, Lax/k1/i;->o0(Lax/N1/k;J)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_4d

    .line 63
    .line 64
    iget-object v0, p0, Lax/k1/i;->C0:Lax/N1/q;

    .line 65
    .line 66
    iget-wide v3, p0, Lax/k1/i;->K0:J

    .line 67
    .line 68
    invoke-static {v0, v3, v4}, Lax/k1/i;->o0(Lax/N1/k;J)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4d

    .line 73
    .line 74
    iget-object v0, p0, Lax/k1/i;->A0:Lax/N1/p;

    .line 75
    .line 76
    if-nez v0, :cond_4e

    .line 77
    .line 78
    :cond_4d
    return v1

    .line 79
    :cond_4e
    return v2
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

.method public y0(J)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Lax/k1/i;->L0:J

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
