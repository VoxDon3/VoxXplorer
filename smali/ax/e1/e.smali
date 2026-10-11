.class public Lax/e1/e;
.super Landroidx/media3/exoplayer/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/e1/e$a;,
        Lax/e1/e$b;
    }
.end annotation


# instance fields
.field private A0:J

.field private B0:I

.field private C0:I

.field private D0:Lax/P0/v;

.field private E0:Lax/e1/b;

.field private F0:Lax/V0/i;

.field private G0:Landroidx/media3/exoplayer/image/ImageOutput;

.field private H0:Landroid/graphics/Bitmap;

.field private I0:Z

.field private J0:Lax/e1/e$b;

.field private K0:Lax/e1/e$b;

.field private L0:I

.field private M0:Z

.field private final t0:Lax/e1/b$a;

.field private final u0:Lax/V0/i;

.field private final v0:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lax/e1/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private w0:Z

.field private x0:Z

.field private y0:Lax/e1/e$a;

.field private z0:J


# direct methods
.method public constructor <init>(Lax/e1/b$a;Landroidx/media3/exoplayer/image/ImageOutput;)V
    .registers 4

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/h;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lax/e1/e;->t0:Lax/e1/b$a;

    .line 6
    .line 7
    invoke-static {p2}, Lax/e1/e;->m0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lax/e1/e;->G0:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 12
    .line 13
    invoke-static {}, Lax/V0/i;->F()Lax/V0/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/e1/e;->u0:Lax/V0/i;

    .line 18
    .line 19
    sget-object p1, Lax/e1/e$a;->c:Lax/e1/e$a;

    .line 20
    .line 21
    iput-object p1, p0, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, Lax/e1/e;->A0:J

    .line 36
    .line 37
    iput-wide p1, p0, Lax/e1/e;->z0:J

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput p1, p0, Lax/e1/e;->B0:I

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput p1, p0, Lax/e1/e;->C0:I

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

.method private i0(Lax/P0/v;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/e1/e;->t0:Lax/e1/b$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/e1/b$a;->b(Lax/P0/v;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x4

    .line 8
    invoke-static {v0}, Lax/Y0/V;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq p1, v0, :cond_17

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-static {v0}, Lax/Y0/V;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p1, v0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_17
    :goto_17
    const/4 p1, 0x1

    .line 25
    return p1
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

.method private j0(I)Landroid/graphics/Bitmap;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 13
    .line 14
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lax/P0/v;

    .line 19
    .line 20
    iget v1, v1, Lax/P0/v;->N:I

    .line 21
    .line 22
    div-int/2addr v0, v1

    .line 23
    iget-object v1, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 30
    .line 31
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lax/P0/v;

    .line 36
    .line 37
    iget v2, v2, Lax/P0/v;->O:I

    .line 38
    .line 39
    div-int/2addr v1, v2

    .line 40
    iget-object v2, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 41
    .line 42
    iget v2, v2, Lax/P0/v;->N:I

    .line 43
    .line 44
    rem-int v3, p1, v2

    .line 45
    .line 46
    mul-int v3, v3, v0

    .line 47
    .line 48
    div-int/2addr p1, v2

    .line 49
    mul-int p1, p1, v1

    .line 50
    .line 51
    iget-object v2, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 52
    .line 53
    invoke-static {v2, v3, p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private k0(JJ)Z
    .registers 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/e1/c;,
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz v1, :cond_a

    .line 5
    .line 6
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 7
    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v8

    .line 11
    :cond_a
    iget v1, p0, Lax/e1/e;->C0:I

    .line 12
    .line 13
    if-nez v1, :cond_16

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq v1, v2, :cond_16

    .line 21
    .line 22
    return v8

    .line 23
    :cond_16
    iget-object v1, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    const/4 v9, 0x3

    .line 26
    const/4 v10, 0x1

    .line 27
    if-nez v1, :cond_6e

    .line 28
    .line 29
    iget-object v1, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 30
    .line 31
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 35
    .line 36
    invoke-interface {v1}, Lax/e1/b;->a()Lax/e1/d;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_2a

    .line 41
    .line 42
    return v8

    .line 43
    :cond_2a
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lax/e1/d;

    .line 48
    .line 49
    invoke-virtual {v2}, Lax/V0/a;->s()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_5a

    .line 54
    .line 55
    iget v2, p0, Lax/e1/e;->B0:I

    .line 56
    .line 57
    if-ne v2, v9, :cond_46

    .line 58
    .line 59
    invoke-direct {p0}, Lax/e1/e;->u0()V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 63
    .line 64
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lax/e1/e;->q0()Z

    .line 68
    .line 69
    .line 70
    goto :goto_59

    .line 71
    :cond_46
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lax/e1/d;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroidx/media3/decoder/a;->B()V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_59

    .line 87
    .line 88
    iput-boolean v10, p0, Lax/e1/e;->x0:Z

    .line 89
    .line 90
    :cond_59
    :goto_59
    return v8

    .line 91
    :cond_5a
    iget-object v2, v1, Lax/e1/d;->f0:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    const-string v3, "Non-EOS buffer came back from the decoder without bitmap."

    .line 94
    .line 95
    invoke-static {v2, v3}, Lax/S0/a;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, Lax/e1/d;->f0:Landroid/graphics/Bitmap;

    .line 99
    .line 100
    iput-object v2, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lax/e1/d;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/media3/decoder/a;->B()V

    .line 109
    .line 110
    .line 111
    :cond_6e
    iget-boolean v1, p0, Lax/e1/e;->I0:Z

    .line 112
    .line 113
    if-eqz v1, :cond_112

    .line 114
    .line 115
    iget-object v1, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    if-eqz v1, :cond_112

    .line 118
    .line 119
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 120
    .line 121
    if-eqz v1, :cond_112

    .line 122
    .line 123
    iget-object v1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 124
    .line 125
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 129
    .line 130
    iget v2, v1, Lax/P0/v;->N:I

    .line 131
    .line 132
    if-ne v2, v10, :cond_89

    .line 133
    .line 134
    iget v3, v1, Lax/P0/v;->O:I

    .line 135
    .line 136
    if-eq v3, v10, :cond_92

    .line 137
    .line 138
    :cond_89
    const/4 v3, -0x1

    .line 139
    if-eq v2, v3, :cond_92

    .line 140
    .line 141
    iget v1, v1, Lax/P0/v;->O:I

    .line 142
    .line 143
    if-eq v1, v3, :cond_92

    .line 144
    .line 145
    const/4 v11, 0x1

    .line 146
    goto :goto_93

    .line 147
    :cond_92
    const/4 v11, 0x0

    .line 148
    :goto_93
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 149
    .line 150
    invoke-virtual {v1}, Lax/e1/e$b;->d()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_b3

    .line 155
    .line 156
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 157
    .line 158
    if-eqz v11, :cond_a8

    .line 159
    .line 160
    invoke-virtual {v1}, Lax/e1/e$b;->c()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-direct {p0, v2}, Lax/e1/e;->j0(I)Landroid/graphics/Bitmap;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_b0

    .line 169
    :cond_a8
    iget-object v2, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 170
    .line 171
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Landroid/graphics/Bitmap;

    .line 176
    .line 177
    :goto_b0
    invoke-virtual {v1, v2}, Lax/e1/e$b;->e(Landroid/graphics/Bitmap;)V

    .line 178
    .line 179
    .line 180
    :cond_b3
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 181
    .line 182
    invoke-virtual {v1}, Lax/e1/e$b;->b()Landroid/graphics/Bitmap;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v5, v1

    .line 191
    check-cast v5, Landroid/graphics/Bitmap;

    .line 192
    .line 193
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 194
    .line 195
    invoke-virtual {v1}, Lax/e1/e$b;->a()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    move-object v0, p0

    .line 200
    move-wide v1, p1

    .line 201
    move-wide v3, p3

    .line 202
    invoke-virtual/range {v0 .. v7}, Lax/e1/e;->t0(JJLandroid/graphics/Bitmap;J)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-nez v1, :cond_d0

    .line 207
    .line 208
    return v8

    .line 209
    :cond_d0
    iget-object v1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 210
    .line 211
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Lax/e1/e$b;

    .line 216
    .line 217
    invoke-virtual {v1}, Lax/e1/e$b;->a()J

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    invoke-direct {p0, v1, v2}, Lax/e1/e;->s0(J)V

    .line 222
    .line 223
    .line 224
    iput v9, p0, Lax/e1/e;->C0:I

    .line 225
    .line 226
    const/4 v1, 0x0

    .line 227
    if-eqz v11, :cond_109

    .line 228
    .line 229
    iget-object v2, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 230
    .line 231
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Lax/e1/e$b;

    .line 236
    .line 237
    invoke-virtual {v2}, Lax/e1/e$b;->c()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    iget-object v3, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 242
    .line 243
    invoke-static {v3}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Lax/P0/v;

    .line 248
    .line 249
    iget v3, v3, Lax/P0/v;->O:I

    .line 250
    .line 251
    iget-object v4, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 252
    .line 253
    invoke-static {v4}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Lax/P0/v;

    .line 258
    .line 259
    iget v4, v4, Lax/P0/v;->N:I

    .line 260
    .line 261
    mul-int v3, v3, v4

    .line 262
    .line 263
    sub-int/2addr v3, v10

    .line 264
    if-ne v2, v3, :cond_10b

    .line 265
    .line 266
    :cond_109
    iput-object v1, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 267
    .line 268
    :cond_10b
    iget-object v2, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 269
    .line 270
    iput-object v2, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 271
    .line 272
    iput-object v1, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 273
    .line 274
    return v10

    .line 275
    :cond_112
    return v8
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

.method private l0(J)Z
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/e1/c;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/e1/e;->I0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_a

    .line 5
    .line 6
    iget-object v0, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 16
    .line 17
    if-eqz v2, :cond_fe

    .line 18
    .line 19
    iget v3, p0, Lax/e1/e;->B0:I

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_fe

    .line 23
    .line 24
    iget-boolean v3, p0, Lax/e1/e;->w0:Z

    .line 25
    .line 26
    if-eqz v3, :cond_1d

    .line 27
    .line 28
    goto/16 :goto_fe

    .line 29
    .line 30
    :cond_1d
    iget-object v3, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 31
    .line 32
    if-nez v3, :cond_2c

    .line 33
    .line 34
    invoke-interface {v2}, Lax/V0/g;->f()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lax/V0/i;

    .line 39
    .line 40
    iput-object v2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 41
    .line 42
    if-nez v2, :cond_2c

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2c
    iget v2, p0, Lax/e1/e;->B0:I

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    const/4 v5, 0x0

    .line 49
    if-ne v2, v3, :cond_4f

    .line 50
    .line 51
    iget-object p1, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 52
    .line 53
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 57
    .line 58
    const/4 p2, 0x4

    .line 59
    invoke-virtual {p1, p2}, Lax/V0/a;->A(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 63
    .line 64
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lax/e1/b;

    .line 69
    .line 70
    iget-object p2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 71
    .line 72
    invoke-interface {p1, p2}, Lax/e1/b;->c(Lax/V0/i;)V

    .line 73
    .line 74
    .line 75
    iput-object v5, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 76
    .line 77
    iput v4, p0, Lax/e1/e;->B0:I

    .line 78
    .line 79
    return v1

    .line 80
    :cond_4f
    iget-object v2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 81
    .line 82
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v4, -0x5

    .line 87
    const/4 v6, 0x1

    .line 88
    if-eq v2, v4, :cond_ef

    .line 89
    .line 90
    const/4 v0, -0x4

    .line 91
    if-eq v2, v0, :cond_66

    .line 92
    .line 93
    const/4 p1, -0x3

    .line 94
    if-ne v2, p1, :cond_60

    .line 95
    .line 96
    return v1

    .line 97
    :cond_60
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_66
    iget-object v0, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 104
    .line 105
    invoke-virtual {v0}, Lax/V0/i;->D()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 109
    .line 110
    iget-object v0, v0, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    if-eqz v0, :cond_77

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-gtz v0, :cond_85

    .line 119
    .line 120
    :cond_77
    iget-object v0, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 121
    .line 122
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Lax/V0/i;

    .line 127
    .line 128
    invoke-virtual {v0}, Lax/V0/a;->s()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_87

    .line 133
    .line 134
    :cond_85
    const/4 v0, 0x1

    .line 135
    goto :goto_88

    .line 136
    :cond_87
    const/4 v0, 0x0

    .line 137
    :goto_88
    if-eqz v0, :cond_ab

    .line 138
    .line 139
    iget-object v2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 140
    .line 141
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lax/V0/i;

    .line 146
    .line 147
    iget-object v3, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 148
    .line 149
    iput-object v3, v2, Lax/V0/i;->c0:Lax/P0/v;

    .line 150
    .line 151
    iget-object v2, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 152
    .line 153
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Lax/e1/b;

    .line 158
    .line 159
    iget-object v3, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 160
    .line 161
    invoke-static {v3}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lax/V0/i;

    .line 166
    .line 167
    invoke-interface {v2, v3}, Lax/e1/b;->c(Lax/V0/i;)V

    .line 168
    .line 169
    .line 170
    iput v1, p0, Lax/e1/e;->L0:I

    .line 171
    .line 172
    :cond_ab
    iget-object v2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 173
    .line 174
    invoke-static {v2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Lax/V0/i;

    .line 179
    .line 180
    invoke-direct {p0, p1, p2, v2}, Lax/e1/e;->p0(JLax/V0/i;)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 184
    .line 185
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lax/V0/i;

    .line 190
    .line 191
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_c9

    .line 196
    .line 197
    iput-boolean v6, p0, Lax/e1/e;->w0:Z

    .line 198
    .line 199
    iput-object v5, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 200
    .line 201
    return v1

    .line 202
    :cond_c9
    iget-wide p1, p0, Lax/e1/e;->A0:J

    .line 203
    .line 204
    iget-object v1, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 205
    .line 206
    invoke-static {v1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lax/V0/i;

    .line 211
    .line 212
    iget-wide v1, v1, Lax/V0/i;->g0:J

    .line 213
    .line 214
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide p1

    .line 218
    iput-wide p1, p0, Lax/e1/e;->A0:J

    .line 219
    .line 220
    if-eqz v0, :cond_e0

    .line 221
    .line 222
    iput-object v5, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 223
    .line 224
    goto :goto_eb

    .line 225
    :cond_e0
    iget-object p1, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 226
    .line 227
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Lax/V0/i;

    .line 232
    .line 233
    invoke-virtual {p1}, Lax/V0/i;->p()V

    .line 234
    .line 235
    .line 236
    :goto_eb
    iget-boolean p1, p0, Lax/e1/e;->I0:Z

    .line 237
    .line 238
    xor-int/2addr p1, v6

    .line 239
    return p1

    .line 240
    :cond_ef
    iget-object p1, v0, Lax/Y0/O;->b:Lax/P0/v;

    .line 241
    .line 242
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Lax/P0/v;

    .line 247
    .line 248
    iput-object p1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 249
    .line 250
    iput-boolean v6, p0, Lax/e1/e;->M0:Z

    .line 251
    .line 252
    iput v3, p0, Lax/e1/e;->B0:I

    .line 253
    .line 254
    return v6

    .line 255
    :cond_fe
    :goto_fe
    return v1
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

.method private static m0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;
    .registers 1

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    sget-object p0, Landroidx/media3/exoplayer/image/ImageOutput;->a:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 4
    .line 5
    :cond_4
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

.method private n0(Lax/e1/e$b;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/P0/v;

    .line 8
    .line 9
    iget v0, v0, Lax/P0/v;->N:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v0, v2, :cond_2e

    .line 14
    .line 15
    iget-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 16
    .line 17
    iget v0, v0, Lax/P0/v;->O:I

    .line 18
    .line 19
    if-eq v0, v2, :cond_2e

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/e1/e$b;->c()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 26
    .line 27
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/P0/v;

    .line 32
    .line 33
    iget v0, v0, Lax/P0/v;->O:I

    .line 34
    .line 35
    iget-object v2, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 36
    .line 37
    iget v2, v2, Lax/P0/v;->N:I

    .line 38
    .line 39
    mul-int v0, v0, v2

    .line 40
    .line 41
    sub-int/2addr v0, v1

    .line 42
    if-ne p1, v0, :cond_2c

    .line 43
    .line 44
    goto :goto_2e

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

.method private o0(I)V
    .registers 3

    .line 1
    iget v0, p0, Lax/e1/e;->C0:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lax/e1/e;->C0:I

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
.end method

.method private p0(JLax/V0/i;)V
    .registers 12

    .line 1
    invoke-virtual {p3}, Lax/V0/a;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    iput-boolean v1, p0, Lax/e1/e;->I0:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    new-instance v0, Lax/e1/e$b;

    .line 12
    .line 13
    iget v2, p0, Lax/e1/e;->L0:I

    .line 14
    .line 15
    iget-wide v3, p3, Lax/V0/i;->g0:J

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v4}, Lax/e1/e$b;-><init>(IJ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 21
    .line 22
    iget p3, p0, Lax/e1/e;->L0:I

    .line 23
    .line 24
    add-int/2addr p3, v1

    .line 25
    iput p3, p0, Lax/e1/e;->L0:I

    .line 26
    .line 27
    iget-boolean p3, p0, Lax/e1/e;->I0:Z

    .line 28
    .line 29
    if-nez p3, :cond_61

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/e1/e$b;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x7530

    .line 36
    .line 37
    sub-long v6, v2, v4

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    cmp-long v0, v6, p1

    .line 41
    .line 42
    if-gtz v0, :cond_32

    .line 43
    .line 44
    add-long/2addr v4, v2

    .line 45
    cmp-long v0, p1, v4

    .line 46
    .line 47
    if-gtz v0, :cond_32

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    goto :goto_33

    .line 51
    :cond_32
    const/4 v0, 0x0

    .line 52
    :goto_33
    iget-object v4, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 53
    .line 54
    if-eqz v4, :cond_45

    .line 55
    .line 56
    invoke-virtual {v4}, Lax/e1/e$b;->a()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v6, v4, p1

    .line 61
    .line 62
    if-gtz v6, :cond_45

    .line 63
    .line 64
    cmp-long v4, p1, v2

    .line 65
    .line 66
    if-gez v4, :cond_45

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    goto :goto_46

    .line 70
    :cond_45
    const/4 p1, 0x0

    .line 71
    :goto_46
    iget-object p2, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 72
    .line 73
    invoke-static {p2}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lax/e1/e$b;

    .line 78
    .line 79
    invoke-direct {p0, p2}, Lax/e1/e;->n0(Lax/e1/e$b;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez v0, :cond_5a

    .line 84
    .line 85
    if-nez p1, :cond_5a

    .line 86
    .line 87
    if-eqz p2, :cond_59

    .line 88
    .line 89
    goto :goto_5a

    .line 90
    :cond_59
    const/4 v1, 0x0

    .line 91
    :cond_5a
    :goto_5a
    iput-boolean v1, p0, Lax/e1/e;->I0:Z

    .line 92
    .line 93
    if-eqz p1, :cond_61

    .line 94
    .line 95
    if-nez v0, :cond_61

    .line 96
    .line 97
    return-void

    .line 98
    :cond_61
    iget-object p1, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 99
    .line 100
    iput-object p1, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput-object p1, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 104
    .line 105
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
.end method

.method private q0()Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/e1/e;->r0()Z

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
    iget-boolean v0, p0, Lax/e1/e;->M0:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    return v2

    .line 15
    :cond_e
    iget-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 16
    .line 17
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/P0/v;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lax/e1/e;->i0(Lax/P0/v;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2e

    .line 28
    .line 29
    iget-object v0, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 30
    .line 31
    if-eqz v0, :cond_23

    .line 32
    .line 33
    invoke-interface {v0}, Lax/V0/g;->d()V

    .line 34
    .line 35
    .line 36
    :cond_23
    iget-object v0, p0, Lax/e1/e;->t0:Lax/e1/b$a;

    .line 37
    .line 38
    invoke-interface {v0}, Lax/e1/b$a;->a()Lax/e1/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 43
    .line 44
    iput-boolean v1, p0, Lax/e1/e;->M0:Z

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2e
    new-instance v0, Lax/e1/c;

    .line 48
    .line 49
    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lax/e1/c;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 55
    .line 56
    const/16 v2, 0xfa5

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    throw v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private s0(J)V
    .registers 6

    .line 1
    iput-wide p1, p0, Lax/e1/e;->z0:J

    .line 2
    .line 3
    :goto_2
    iget-object v0, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_23

    .line 10
    .line 11
    iget-object v0, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lax/e1/e$a;

    .line 18
    .line 19
    iget-wide v0, v0, Lax/e1/e$a;->a:J

    .line 20
    .line 21
    cmp-long v2, p1, v0

    .line 22
    .line 23
    if-ltz v2, :cond_23

    .line 24
    .line 25
    iget-object v0, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/e1/e$a;

    .line 32
    .line 33
    iput-object v0, p0, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_23
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
.end method

.method private u0()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lax/e1/e;->B0:I

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v1, p0, Lax/e1/e;->A0:J

    .line 13
    .line 14
    iget-object v1, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 15
    .line 16
    if-eqz v1, :cond_16

    .line 17
    .line 18
    invoke-interface {v1}, Lax/V0/g;->d()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/e1/e;->E0:Lax/e1/b;

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

.method private v0(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lax/e1/e;->m0(Landroidx/media3/exoplayer/image/ImageOutput;)Landroidx/media3/exoplayer/image/ImageOutput;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/e1/e;->G0:Landroidx/media3/exoplayer/image/ImageOutput;

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
.end method

.method private w0()Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_b

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
    iget v1, p0, Lax/e1/e;->C0:I

    .line 14
    .line 15
    if-eqz v1, :cond_1d

    .line 16
    .line 17
    if-eq v1, v3, :cond_1c

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-ne v1, v0, :cond_16

    .line 21
    .line 22
    return v2

    .line 23
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1c
    return v3

    .line 30
    :cond_1d
    return v0
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
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-eq p1, v0, :cond_8

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/h;->B(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    instance-of p1, p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 10
    .line 11
    if-eqz p1, :cond_f

    .line 12
    .line 13
    check-cast p2, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 14
    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 p2, 0x0

    .line 17
    :goto_10
    invoke-direct {p0, p2}, Lax/e1/e;->v0(Landroidx/media3/exoplayer/image/ImageOutput;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method protected U()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 3
    .line 4
    sget-object v0, Lax/e1/e$a;->c:Lax/e1/e$a;

    .line 5
    .line 6
    iput-object v0, p0, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 7
    .line 8
    iget-object v0, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lax/e1/e;->u0()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/e1/e;->G0:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/media3/exoplayer/image/ImageOutput;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method protected V(ZZ)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iput p2, p0, Lax/e1/e;->C0:I

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
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lax/e1/e;->o0(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lax/e1/e;->x0:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lax/e1/e;->w0:Z

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Lax/e1/e;->H0:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    iput-object p2, p0, Lax/e1/e;->J0:Lax/e1/e$b;

    .line 14
    .line 15
    iput-object p2, p0, Lax/e1/e;->K0:Lax/e1/e$b;

    .line 16
    .line 17
    iput-boolean p1, p0, Lax/e1/e;->I0:Z

    .line 18
    .line 19
    iput-object p2, p0, Lax/e1/e;->F0:Lax/V0/i;

    .line 20
    .line 21
    iget-object p1, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 22
    .line 23
    if-eqz p1, :cond_1b

    .line 24
    .line 25
    invoke-interface {p1}, Lax/V0/g;->flush()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object p1, p0, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 31
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
.end method

.method protected Y()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/e1/e;->u0()V

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

.method protected a0()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/e1/e;->u0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lax/e1/e;->o0(I)V

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
.end method

.method public b(Lax/P0/v;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/e1/e;->t0:Lax/e1/b$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/e1/b$a;->b(Lax/P0/v;)I

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
.end method

.method public c()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/e1/e;->x0:Z

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
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/media3/exoplayer/h;->d0([Lax/P0/v;JJLax/i1/F$b;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 6
    .line 7
    iget-wide p2, p2, Lax/e1/e$a;->b:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p6, p2, v0

    .line 15
    .line 16
    if-eqz p6, :cond_37

    .line 17
    .line 18
    iget-object p2, p1, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_2a

    .line 25
    .line 26
    iget-wide p2, p1, Lax/e1/e;->A0:J

    .line 27
    .line 28
    cmp-long p6, p2, v0

    .line 29
    .line 30
    if-eqz p6, :cond_37

    .line 31
    .line 32
    iget-wide v2, p1, Lax/e1/e;->z0:J

    .line 33
    .line 34
    cmp-long p6, v2, v0

    .line 35
    .line 36
    if-eqz p6, :cond_2a

    .line 37
    .line 38
    cmp-long p6, v2, p2

    .line 39
    .line 40
    if-ltz p6, :cond_2a

    .line 41
    .line 42
    goto :goto_37

    .line 43
    :cond_2a
    iget-object p2, p1, Lax/e1/e;->v0:Ljava/util/ArrayDeque;

    .line 44
    .line 45
    new-instance p3, Lax/e1/e$a;

    .line 46
    .line 47
    iget-wide v0, p1, Lax/e1/e;->A0:J

    .line 48
    .line 49
    invoke-direct {p3, v0, v1, p4, p5}, Lax/e1/e$a;-><init>(JJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    :goto_37
    new-instance p2, Lax/e1/e$a;

    .line 57
    .line 58
    invoke-direct {p2, v0, v1, p4, p5}, Lax/e1/e$a;-><init>(JJ)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p1, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 62
    .line 63
    return-void
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
    const-string v0, "ImageRenderer"

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

.method public i(JJ)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/e1/e;->x0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_45

    .line 6
    :cond_5
    iget-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 7
    .line 8
    if-nez v0, :cond_3b

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->M()Lax/Y0/O;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lax/e1/e;->u0:Lax/V0/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Lax/V0/i;->p()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/e1/e;->u0:Lax/V0/i;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/h;->f0(Lax/Y0/O;Lax/V0/i;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x5

    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v1, v2, :cond_2a

    .line 29
    .line 30
    iget-object v0, v0, Lax/Y0/O;->b:Lax/P0/v;

    .line 31
    .line 32
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lax/P0/v;

    .line 37
    .line 38
    iput-object v0, p0, Lax/e1/e;->D0:Lax/P0/v;

    .line 39
    .line 40
    iput-boolean v3, p0, Lax/e1/e;->M0:Z

    .line 41
    .line 42
    goto :goto_3b

    .line 43
    :cond_2a
    const/4 p1, -0x4

    .line 44
    if-ne v1, p1, :cond_45

    .line 45
    .line 46
    iget-object p1, p0, Lax/e1/e;->u0:Lax/V0/i;

    .line 47
    .line 48
    invoke-virtual {p1}, Lax/V0/a;->s()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 53
    .line 54
    .line 55
    iput-boolean v3, p0, Lax/e1/e;->w0:Z

    .line 56
    .line 57
    iput-boolean v3, p0, Lax/e1/e;->x0:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    :goto_3b
    iget-object v0, p0, Lax/e1/e;->E0:Lax/e1/b;

    .line 61
    .line 62
    if-nez v0, :cond_46

    .line 63
    .line 64
    invoke-direct {p0}, Lax/e1/e;->q0()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_46

    .line 69
    .line 70
    :cond_45
    :goto_45
    return-void

    .line 71
    :cond_46
    :try_start_46
    const-string v0, "drainAndFeedDecoder"

    .line 72
    .line 73
    invoke-static {v0}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_4b
    invoke-direct {p0, p1, p2, p3, p4}, Lax/e1/e;->k0(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_52

    .line 81
    .line 82
    goto :goto_4b

    .line 83
    :cond_52
    :goto_52
    invoke-direct {p0, p1, p2}, Lax/e1/e;->l0(J)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_59

    .line 88
    .line 89
    goto :goto_52

    .line 90
    :cond_59
    invoke-static {}, Lax/S0/N;->b()V
    :try_end_5c
    .catch Lax/e1/c; {:try_start_46 .. :try_end_5c} :catch_5d

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_5d
    move-exception p1

    .line 95
    const/4 p2, 0x0

    .line 96
    const/16 p3, 0xfa3

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/h;->I(Ljava/lang/Throwable;Lax/P0/v;I)Landroidx/media3/exoplayer/s;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    throw p1
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
    .registers 3

    .line 1
    iget v0, p0, Lax/e1/e;->C0:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_e

    .line 5
    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    iget-boolean v0, p0, Lax/e1/e;->I0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    goto :goto_e

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_e
    :goto_e
    const/4 v0, 0x1

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected r0()Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

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

.method protected t0(JJLandroid/graphics/Bitmap;J)Z
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    sub-long p1, p6, p1

    .line 2
    .line 3
    invoke-direct {p0}, Lax/e1/e;->w0()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_11

    .line 8
    .line 9
    const-wide/16 p3, 0x7530

    .line 10
    .line 11
    cmp-long v0, p1, p3

    .line 12
    .line 13
    if-gez v0, :cond_f

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_11
    :goto_11
    iget-object p1, p0, Lax/e1/e;->G0:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 19
    .line 20
    iget-object p2, p0, Lax/e1/e;->y0:Lax/e1/e$a;

    .line 21
    .line 22
    iget-wide p2, p2, Lax/e1/e$a;->b:J

    .line 23
    .line 24
    sub-long/2addr p6, p2

    .line 25
    invoke-interface {p1, p6, p7, p5}, Landroidx/media3/exoplayer/image/ImageOutput;->onImageAvailable(JLandroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
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
