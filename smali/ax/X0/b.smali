.class final Lax/X0/b;
.super Lax/V0/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/V0/j<",
        "Lax/V0/i;",
        "Landroidx/media3/decoder/SimpleDecoderOutputBuffer;",
        "Lax/X0/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final o:Landroid/content/Context;

.field private p:Lax/A9/b;

.field private q:Lax/J9/c;

.field private r:Lax/G9/b;

.field private s:Lax/J9/a;

.field private t:[D

.field private u:J

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "media3.decoder.midi"

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

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/X0/c;
        }
    .end annotation

    const/16 v0, 0x10

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lax/X0/b;-><init>(Landroid/content/Context;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/X0/c;
        }
    .end annotation

    .line 2
    new-array p2, p2, [Lax/V0/i;

    new-array p3, p3, [Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    invoke-direct {p0, p2, p3}, Lax/V0/j;-><init>([Lax/V0/i;[Landroidx/media3/decoder/a;)V

    .line 3
    iput-object p1, p0, Lax/X0/b;->o:Landroid/content/Context;

    const/16 p1, 0x2274

    .line 4
    new-array p1, p1, [D

    iput-object p1, p0, Lax/X0/b;->t:[D

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    iput-wide p1, p0, Lax/X0/b;->u:J

    .line 6
    invoke-direct {p0}, Lax/X0/b;->A()V

    return-void
.end method

.method private A()V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/X0/c;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/A9/a;->a()Lax/A9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Lax/A9/b;->f(Z)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lax/J9/c;

    .line 12
    .line 13
    invoke-direct {v2}, Lax/J9/c;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lax/X0/b;->q:Lax/J9/c;

    .line 17
    .line 18
    iget-object v3, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 19
    .line 20
    iget-object v0, p0, Lax/X0/b;->o:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v0}, Lax/X0/h;->d(Landroid/content/Context;)Lax/X0/h;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const/4 v4, 0x0

    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    invoke-virtual/range {v2 .. v7}, Lax/J9/c;->p(Lax/A9/b;IIILax/J9/g;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lax/G9/b;

    .line 40
    .line 41
    iget-object v2, p0, Lax/X0/b;->q:Lax/J9/c;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lax/G9/b;-><init>(Lax/J9/c;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/X0/b;->r:Lax/G9/b;

    .line 47
    .line 48
    new-instance v0, Lax/J9/a;

    .line 49
    .line 50
    iget-object v2, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    invoke-direct {v0, v2, v3}, Lax/J9/a;-><init>(Lax/A9/b;I)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lax/X0/b;->s:Lax/J9/a;

    .line 57
    .line 58
    iget-object v0, p0, Lax/X0/b;->q:Lax/J9/c;

    .line 59
    .line 60
    invoke-virtual {v0}, Lax/J9/c;->c()Lax/H9/l;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v2, p0, Lax/X0/b;->s:Lax/J9/a;

    .line 65
    .line 66
    invoke-virtual {v2}, Lax/J9/a;->b()Lax/H9/k;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0, v1, v2, v1}, Lax/H9/l;->q(ILax/H9/k;I)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lax/X0/b;->q:Lax/J9/c;

    .line 74
    .line 75
    invoke-virtual {v0}, Lax/J9/c;->c()Lax/H9/l;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v2, p0, Lax/X0/b;->s:Lax/J9/a;

    .line 80
    .line 81
    invoke-virtual {v2}, Lax/J9/a;->b()Lax/H9/k;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v3, 0x1

    .line 86
    invoke-virtual {v0, v1, v2, v3}, Lax/H9/l;->q(ILax/H9/k;I)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 90
    .line 91
    invoke-interface {v0}, Lax/A9/b;->start()V

    .line 92
    .line 93
    .line 94
    return-void
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

.method public static D()Lax/P0/v;
    .registers 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const v1, 0xac44

    .line 3
    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-static {v2, v0, v1}, Lax/S0/d0;->l0(III)Lax/P0/v;

    .line 7
    .line 8
    .line 9
    move-result-object v0

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

.method private E()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/X0/c;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/A9/b;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X0/b;->q:Lax/J9/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/J9/c;->c()Lax/H9/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/H9/g;->i()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lax/X0/b;->A()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic y(Lax/X0/b;Landroidx/media3/decoder/a;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/V0/j;->u(Landroidx/media3/decoder/a;)V

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


# virtual methods
.method protected B(Ljava/lang/Throwable;)Lax/X0/c;
    .registers 4

    .line 1
    new-instance v0, Lax/X0/c;

    .line 2
    .line 3
    const-string v1, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lax/X0/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
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
    .line 22
.end method

.method protected C(Lax/V0/i;Landroidx/media3/decoder/SimpleDecoderOutputBuffer;Z)Lax/X0/c;
    .registers 10

    .line 1
    iget-object v0, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_17

    .line 15
    .line 16
    iput-wide v1, p0, Lax/X0/b;->u:J

    .line 17
    .line 18
    :try_start_11
    invoke-direct {p0}, Lax/X0/b;->E()V
    :try_end_14
    .catch Lax/X0/c; {:try_start_11 .. :try_end_14} :catch_15

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catch_15
    move-exception p1

    .line 23
    return-object p1

    .line 24
    :cond_17
    :goto_17
    iget-wide v3, p0, Lax/X0/b;->u:J

    .line 25
    .line 26
    cmp-long p3, v3, v1

    .line 27
    .line 28
    if-nez p3, :cond_21

    .line 29
    .line 30
    iget-wide v3, p1, Lax/V0/i;->g0:J

    .line 31
    .line 32
    iput-wide v3, p0, Lax/X0/b;->v:J

    .line 33
    .line 34
    :cond_21
    iget-wide v3, p1, Lax/V0/i;->g0:J

    .line 35
    .line 36
    invoke-virtual {p0, v3, v4}, Lax/V0/j;->q(J)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_54

    .line 41
    .line 42
    :try_start_29
    iget-wide v3, p0, Lax/X0/b;->u:J

    .line 43
    .line 44
    cmp-long v5, v3, v1

    .line 45
    .line 46
    if-eqz v5, :cond_42

    .line 47
    .line 48
    iget-wide v1, p1, Lax/V0/i;->g0:J

    .line 49
    .line 50
    sub-long/2addr v1, v3

    .line 51
    long-to-double v1, v1

    .line 52
    const-wide v3, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    mul-double v1, v1, v3

    .line 58
    .line 59
    iget-object v3, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 60
    .line 61
    invoke-interface {v3, v1, v2}, Lax/A9/b;->b(D)V

    .line 62
    .line 63
    .line 64
    goto :goto_42

    .line 65
    :catch_40
    move-exception p1

    .line 66
    goto :goto_47

    .line 67
    :cond_42
    :goto_42
    iget-wide v1, p1, Lax/V0/i;->g0:J

    .line 68
    .line 69
    iput-wide v1, p0, Lax/X0/b;->u:J
    :try_end_46
    .catch Ljava/lang/InterruptedException; {:try_start_29 .. :try_end_46} :catch_40

    .line 70
    .line 71
    goto :goto_54

    .line 72
    :goto_47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 77
    .line 78
    .line 79
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw p2

    .line 85
    :cond_54
    :goto_54
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lez p1, :cond_6b

    .line 90
    .line 91
    iget-object p1, p0, Lax/X0/b;->r:Lax/G9/b;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p1, v1, v2, v0}, Lax/G9/b;->n([BII)V

    .line 106
    .line 107
    .line 108
    :cond_6b
    iget-object p1, p0, Lax/X0/b;->s:Lax/J9/a;

    .line 109
    .line 110
    invoke-virtual {p1}, Lax/J9/a;->a()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/4 v0, 0x0

    .line 115
    if-nez p3, :cond_79

    .line 116
    .line 117
    if-nez p1, :cond_77

    .line 118
    .line 119
    goto :goto_79

    .line 120
    :cond_77
    const/4 p3, 0x0

    .line 121
    goto :goto_7a

    .line 122
    :cond_79
    :goto_79
    const/4 p3, 0x1

    .line 123
    :goto_7a
    invoke-static {p3}, Lax/S0/a;->g(Z)V

    .line 124
    .line 125
    .line 126
    iget-object p3, p0, Lax/X0/b;->t:[D

    .line 127
    .line 128
    array-length p3, p3

    .line 129
    if-le p1, p3, :cond_8a

    .line 130
    .line 131
    mul-int/lit8 p3, p1, 0x7d

    .line 132
    .line 133
    div-int/lit8 p3, p3, 0x64

    .line 134
    .line 135
    new-array p3, p3, [D

    .line 136
    .line 137
    iput-object p3, p0, Lax/X0/b;->t:[D

    .line 138
    .line 139
    :cond_8a
    const/4 p3, 0x0

    .line 140
    :goto_8b
    if-ge p3, p1, :cond_99

    .line 141
    .line 142
    iget-object v1, p0, Lax/X0/b;->s:Lax/J9/a;

    .line 143
    .line 144
    iget-object v2, p0, Lax/X0/b;->t:[D

    .line 145
    .line 146
    sub-int v3, p1, p3

    .line 147
    .line 148
    invoke-virtual {v1, v2, p3, v3}, Lax/J9/a;->c([DII)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    add-int/2addr p3, v1

    .line 153
    goto :goto_8b

    .line 154
    :cond_99
    iget-wide v1, p0, Lax/X0/b;->v:J

    .line 155
    .line 156
    mul-int/lit8 p1, p3, 0x4

    .line 157
    .line 158
    invoke-virtual {p2, v1, v2, p1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->D(JI)Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    .line 161
    iget-object p1, p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->g0:Ljava/nio/ByteBuffer;

    .line 162
    .line 163
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    :goto_a8
    if-ge v0, p3, :cond_b5

    .line 170
    .line 171
    iget-object p2, p0, Lax/X0/b;->t:[D

    .line 172
    .line 173
    aget-wide v1, p2, v0

    .line 174
    .line 175
    double-to-float p2, v1

    .line 176
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 177
    .line 178
    .line 179
    add-int/lit8 v0, v0, 0x1

    .line 180
    .line 181
    goto :goto_a8

    .line 182
    :cond_b5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 183
    .line 184
    .line 185
    iget-wide p1, p0, Lax/X0/b;->v:J

    .line 186
    .line 187
    int-to-long v0, p3

    .line 188
    const-wide/32 v2, 0xf4240

    .line 189
    .line 190
    .line 191
    mul-long v0, v0, v2

    .line 192
    .line 193
    const-wide/16 v2, 0x2

    .line 194
    .line 195
    div-long/2addr v0, v2

    .line 196
    const-wide/32 v2, 0xac44

    .line 197
    .line 198
    .line 199
    div-long/2addr v0, v2

    .line 200
    add-long/2addr p1, v0

    .line 201
    iput-wide p1, p0, Lax/X0/b;->v:J

    .line 202
    .line 203
    const/4 p1, 0x0

    .line 204
    return-object p1
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

.method public d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X0/b;->p:Lax/A9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/A9/b;->stop()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lax/V0/j;->d()V

    .line 7
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

.method public getName()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "MidiDecoder"

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

.method protected j()Lax/V0/i;
    .registers 3

    .line 1
    new-instance v0, Lax/V0/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lax/V0/i;-><init>(I)V

    .line 5
    .line 6
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

.method protected bridge synthetic k()Landroidx/media3/decoder/a;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/X0/b;->z()Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

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

.method protected bridge synthetic l(Ljava/lang/Throwable;)Lax/V0/h;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/X0/b;->B(Ljava/lang/Throwable;)Lax/X0/c;

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

.method protected bridge synthetic m(Lax/V0/i;Landroidx/media3/decoder/a;Z)Lax/V0/h;
    .registers 4

    .line 1
    check-cast p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lax/X0/b;->C(Lax/V0/i;Landroidx/media3/decoder/SimpleDecoderOutputBuffer;Z)Lax/X0/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected z()Landroidx/media3/decoder/SimpleDecoderOutputBuffer;
    .registers 3

    .line 1
    new-instance v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 2
    .line 3
    new-instance v1, Lax/X0/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lax/X0/a;-><init>(Lax/X0/b;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;-><init>(Landroidx/media3/decoder/a$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
