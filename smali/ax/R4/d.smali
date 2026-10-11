.class public Lax/R4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Landroid/media/MediaPlayer;

.field private d:Landroidx/media3/exoplayer/ExoPlayer;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lax/R4/d;->b:Z

    .line 5
    .line 6
    iput-object p1, p0, Lax/R4/d;->a:Landroid/content/Context;

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


# virtual methods
.method public a()Ljava/lang/String;
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const-string v0, "audio"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 9
    .line 10
    invoke-interface {v0}, Lax/P0/H;->X()Lax/P0/V;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lax/P0/V;->a()Lax/r7/z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/r7/z;->n()Lax/r7/j0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :cond_16
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_35

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lax/P0/V$a;

    .line 34
    .line 35
    invoke-virtual {v2}, Lax/P0/V$a;->d()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x1

    .line 40
    if-ne v3, v4, :cond_16

    .line 41
    .line 42
    iget v3, v2, Lax/P0/V$a;->a:I

    .line 43
    .line 44
    if-lez v3, :cond_16

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v2, v1}, Lax/P0/V$a;->b(I)Lax/P0/v;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, Lax/P0/v;->o:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_16

    .line 54
    :cond_35
    return-object v1
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

.method public b()I
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->b()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method c()Ljava/lang/String;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_6
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/P0/H;->y()Lax/P0/y;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    iget-object v0, v0, Lax/P0/y;->a:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_11
    return-object v1
    .line 19
    .line 20
    .line 21
.end method

.method public d()I
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v0}, Lax/P0/H;->s0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int v1, v0

    .line 19
    return v1
    .line 20
    .line 21
.end method

.method public e()J
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v0, v0

    .line 12
    return-wide v0

    .line 13
    :cond_c
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    invoke-interface {v0}, Lax/P0/H;->g0()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
    .line 20
    .line 21
.end method

.method public f()F
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_18

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-lt v0, v1, :cond_15

    .line 10
    .line 11
    :try_start_a
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 12
    .line 13
    invoke-static {v0}, Lax/R4/a;->a(Landroid/media/MediaPlayer;)Landroid/media/PlaybackParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lax/a1/O;->a(Landroid/media/PlaybackParams;)F

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_14
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_14} :catch_15

    .line 21
    return v0

    .line 22
    :catch_15
    :cond_15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 23
    .line 24
    return v0

    .line 25
    :cond_18
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/P0/H;->h()Lax/P0/G;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v0, v0, Lax/P0/G;->a:F

    .line 32
    .line 33
    return v0
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

.method public g()Z
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

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
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/P0/H;->X()Lax/P0/V;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/P0/V;->a()Lax/r7/z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/r7/z;->n()Lax/r7/j0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2d

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lax/P0/V$a;

    .line 32
    .line 33
    invoke-virtual {v2}, Lax/P0/V$a;->d()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ne v3, v1, :cond_14

    .line 38
    .line 39
    invoke-virtual {v2}, Lax/P0/V$a;->g()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_14

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2d
    const/4 v0, 0x0

    .line 47
    return v0
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

.method public h()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_26

    .line 4
    .line 5
    :try_start_4
    new-instance v0, Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;
    :try_end_b
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_b} :catch_c

    .line 11
    .line 12
    return-void

    .line 13
    :catch_c
    move-exception v0

    .line 14
    iget-object v1, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v1}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "MEDIA PLAYER CREATE INSTANCE ERROR"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_26
    new-instance v0, Lax/Y0/d;

    .line 40
    .line 41
    iget-object v1, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lax/Y0/d;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Lax/R4/d;->e:Z

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    if-eqz v1, :cond_37

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-virtual {v0, v1}, Lax/Y0/d;->p(I)Lax/Y0/d;

    .line 53
    .line 54
    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    invoke-virtual {v0, v2}, Lax/Y0/d;->p(I)Lax/Y0/d;

    .line 57
    .line 58
    .line 59
    :goto_3a
    invoke-virtual {v0, v2}, Lax/Y0/d;->o(Z)Lax/Y0/d;

    .line 60
    .line 61
    .line 62
    new-instance v1, Lax/q1/n;

    .line 63
    .line 64
    invoke-direct {v1}, Lax/q1/n;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lax/q1/n;->m(Z)Lax/q1/n;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, Lax/i1/r;

    .line 72
    .line 73
    iget-object v3, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 74
    .line 75
    invoke-direct {v2, v3, v1}, Lax/i1/r;-><init>(Landroid/content/Context;Lax/q1/x;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 79
    .line 80
    iget-object v3, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 81
    .line 82
    invoke-direct {v1, v3, v0}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;Lax/Y0/X;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/ExoPlayer$b;->j(Lax/i1/F$a;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->h()Landroidx/media3/exoplayer/ExoPlayer;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 94
    .line 95
    return-void
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

.method public i()Z
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return v2

    .line 12
    :cond_b
    return v1

    .line 13
    :cond_c
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    return v2

    .line 18
    :cond_11
    return v1
    .line 19
    .line 20
    .line 21
.end method

.method public j()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

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

.method public k()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v0}, Lax/P0/H;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public l()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/P0/H;->W()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public m()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P0/H;->f()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P0/H;->m()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public o()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P0/H;->k()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public p()V
    .registers 3

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 8
    .line 9
    .line 10
    goto :goto_11

    .line 11
    :catch_a
    nop

    .line 12
    goto :goto_11

    .line 13
    :cond_c
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->d()V
    :try_end_11
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_11} :catch_a

    .line 16
    .line 17
    .line 18
    :goto_11
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_19

    .line 22
    .line 23
    iput-object v1, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    iput-object v1, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 27
    .line 28
    :goto_1b
    return-void
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

.method public q()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1}, Lax/P0/H;->S(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 18
    .line 19
    invoke-interface {v0}, Lax/P0/H;->stop()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 23
    .line 24
    invoke-interface {v0}, Lax/P0/H;->x()V

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

.method public r(I)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    int-to-long v1, p1

    .line 14
    invoke-interface {v0, v1, v2}, Lax/P0/H;->t(J)V

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

.method public s()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v0, :cond_26

    .line 7
    .line 8
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 18
    .line 19
    .line 20
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v3, 0x1d

    .line 23
    .line 24
    if-lt v2, v3, :cond_1c

    .line 25
    .line 26
    invoke-static {v0, v1}, Lax/R4/b;->a(Landroid/media/AudioAttributes$Builder;Z)Landroid/media/AudioAttributes$Builder;

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget-object v1, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    new-instance v0, Lax/P0/c$e;

    .line 40
    .line 41
    invoke-direct {v0}, Lax/P0/c$e;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3}, Lax/P0/c$e;->c(I)Lax/P0/c$e;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Lax/P0/c$e;->b(I)Lax/P0/c$e;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lax/P0/c$e;->a()Lax/P0/c;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v2, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 57
    .line 58
    invoke-interface {v2, v0, v1}, Lax/P0/H;->G(Lax/P0/c;Z)V

    .line 59
    .line 60
    .line 61
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public t(Ljava/lang/String;Landroid/net/Uri;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object p1, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    iget-object v0, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p1, v0, p2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    new-instance v0, Lax/P0/y$c;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/P0/y$c;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lax/P0/y$c;->f(Landroid/net/Uri;)Lax/P0/y$c;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2, p1}, Lax/P0/y$c;->c(Ljava/lang/String;)Lax/P0/y$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 31
    .line 32
    invoke-interface {p2, p1}, Lax/P0/H;->U(Lax/P0/y;)V

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
.end method

.method public u()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/R4/d;->e:Z

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

.method public v(Lax/R4/e;Lax/P0/H$d;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    iget-object p2, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget-object p1, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 27
    .line 28
    invoke-interface {p1, p2}, Lax/P0/H;->N(Lax/P0/H$d;)V

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
.end method

.method public w(F)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_18

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-lt v0, v1, :cond_17

    .line 10
    .line 11
    :try_start_a
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 12
    .line 13
    invoke-static {v0}, Lax/R4/a;->a(Landroid/media/MediaPlayer;)Landroid/media/PlaybackParams;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p1}, Lax/a1/Y;->a(Landroid/media/PlaybackParams;F)Landroid/media/PlaybackParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {v0, p1}, Lax/R4/c;->a(Landroid/media/MediaPlayer;Landroid/media/PlaybackParams;)V
    :try_end_17
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_17} :catch_17
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_17} :catch_17

    .line 22
    .line 23
    .line 24
    :catch_17
    :cond_17
    return-void

    .line 25
    :cond_18
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Lax/P0/H;->g(F)V

    .line 28
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
.end method

.method public x(F)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lax/P0/H;->l(F)V

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

.method public y(Z)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_11

    .line 5
    .line 6
    iget-object p1, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 7
    .line 8
    iget-object v0, p0, Lax/R4/d;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaPlayer;->setWakeMode(Landroid/content/Context;I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    if-eqz p1, :cond_19

    .line 19
    .line 20
    iget-object p1, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Landroidx/media3/exoplayer/ExoPlayer;->a(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    iget-object p1, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->a(I)V

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

.method public z()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/d;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/d;->c:Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/R4/d;->d:Landroidx/media3/exoplayer/ExoPlayer;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P0/H;->stop()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
