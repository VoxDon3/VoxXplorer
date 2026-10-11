.class final Lax/d1/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/m1/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/m1/o$b<",
        "Lax/m1/p<",
        "Lax/d1/j;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final c0:Lax/m1/o;

.field private final d0:Lax/U0/g;

.field private e0:Lax/d1/f;

.field private f0:J

.field private g0:J

.field private h0:J

.field private i0:J

.field private j0:Z

.field private k0:Ljava/io/IOException;

.field private l0:Z

.field final synthetic m0:Lax/d1/c;

.field private final q:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lax/d1/c;Landroid/net/Uri;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Lax/m1/o;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Lax/m1/o;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 16
    .line 17
    invoke-static {p1}, Lax/d1/c;->E(Lax/d1/c;)Lax/c1/d;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x4

    .line 22
    invoke-interface {p1, p2}, Lax/c1/d;->a(I)Lax/U0/g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lax/d1/c$c;->d0:Lax/U0/g;

    .line 27
    .line 28
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
.end method

.method public static synthetic a(Lax/d1/c$c;Landroid/net/Uri;)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/d1/c$c;->j0:Z

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lax/d1/c$c;->q(Landroid/net/Uri;)V

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
.end method

.method static synthetic b(Lax/d1/c$c;J)Z
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d1/c$c;->h(J)Z

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

.method static synthetic c(Lax/d1/c$c;Lax/d1/f;Lax/i1/y;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d1/c$c;->y(Lax/d1/f;Lax/i1/y;)V

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

.method static synthetic d(Lax/d1/c$c;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/d1/c$c;->i0:J

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
    .line 22
.end method

.method static synthetic e(Lax/d1/c$c;)Landroid/net/Uri;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

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

.method static synthetic f(Lax/d1/c$c;Landroid/net/Uri;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d1/c$c;->s(Landroid/net/Uri;)V

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

.method static synthetic g(Lax/d1/c$c;)Lax/d1/f;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

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

.method private h(J)Z
    .registers 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Lax/d1/c$c;->i0:J

    .line 7
    .line 8
    iget-object p1, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 11
    .line 12
    invoke-static {p2}, Lax/d1/c;->A(Lax/d1/c;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1f

    .line 21
    .line 22
    iget-object p1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 23
    .line 24
    invoke-static {p1}, Lax/d1/c;->B(Lax/d1/c;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_1f

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1f
    const/4 p1, 0x0

    .line 33
    return p1
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

.method private i()Landroid/net/Uri;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_7d

    .line 4
    .line 5
    iget-object v0, v0, Lax/d1/f;->v:Lax/d1/f$h;

    .line 6
    .line 7
    iget-wide v1, v0, Lax/d1/f$h;->a:J

    .line 8
    .line 9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v5, v1, v3

    .line 15
    .line 16
    if-nez v5, :cond_16

    .line 17
    .line 18
    iget-boolean v0, v0, Lax/d1/f$h;->e:Z

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_7d

    .line 23
    :cond_16
    iget-object v0, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 30
    .line 31
    iget-object v2, v1, Lax/d1/f;->v:Lax/d1/f$h;

    .line 32
    .line 33
    iget-boolean v2, v2, Lax/d1/f$h;->e:Z

    .line 34
    .line 35
    if-eqz v2, :cond_60

    .line 36
    .line 37
    iget-wide v5, v1, Lax/d1/f;->k:J

    .line 38
    .line 39
    iget-object v1, v1, Lax/d1/f;->r:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-long v1, v1

    .line 46
    add-long/2addr v5, v1

    .line 47
    const-string v1, "_HLS_msn"

    .line 48
    .line 49
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 57
    .line 58
    iget-wide v5, v1, Lax/d1/f;->n:J

    .line 59
    .line 60
    cmp-long v2, v5, v3

    .line 61
    .line 62
    if-eqz v2, :cond_60

    .line 63
    .line 64
    iget-object v1, v1, Lax/d1/f;->s:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_57

    .line 75
    .line 76
    invoke-static {v1}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lax/d1/f$d;

    .line 81
    .line 82
    iget-boolean v1, v1, Lax/d1/f$d;->n0:Z

    .line 83
    .line 84
    if-eqz v1, :cond_57

    .line 85
    .line 86
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    :cond_57
    const-string v1, "_HLS_part"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    :cond_60
    iget-object v1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 98
    .line 99
    iget-object v1, v1, Lax/d1/f;->v:Lax/d1/f$h;

    .line 100
    .line 101
    iget-wide v5, v1, Lax/d1/f$h;->a:J

    .line 102
    .line 103
    cmp-long v2, v5, v3

    .line 104
    .line 105
    if-eqz v2, :cond_78

    .line 106
    .line 107
    iget-boolean v1, v1, Lax/d1/f$h;->b:Z

    .line 108
    .line 109
    if-eqz v1, :cond_71

    .line 110
    .line 111
    const-string v1, "v2"

    .line 112
    .line 113
    goto :goto_73

    .line 114
    :cond_71
    const-string v1, "YES"

    .line 115
    .line 116
    :goto_73
    const-string v2, "_HLS_skip"

    .line 117
    .line 118
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 119
    .line 120
    .line 121
    :cond_78
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_7d
    :goto_7d
    iget-object v0, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 127
    .line 128
    return-object v0
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

.method private q(Landroid/net/Uri;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 2
    .line 3
    invoke-static {v0}, Lax/d1/c;->u(Lax/d1/c;)Lax/d1/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 8
    .line 9
    invoke-static {v1}, Lax/d1/c;->t(Lax/d1/c;)Lax/d1/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Lax/d1/l;->a(Lax/d1/i;Lax/d1/f;)Lax/m1/p$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lax/U0/k$b;

    .line 20
    .line 21
    invoke-direct {v1}, Lax/U0/k$b;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lax/U0/k$b;->i(Landroid/net/Uri;)Lax/U0/k$b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v1}, Lax/U0/k$b;->b(I)Lax/U0/k$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lax/U0/k$b;->a()Lax/U0/k;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 38
    .line 39
    invoke-static {v1}, Lax/d1/c;->v(Lax/d1/c;)Lax/m1/f;

    .line 40
    .line 41
    .line 42
    new-instance v1, Lax/m1/p;

    .line 43
    .line 44
    iget-object v2, p0, Lax/d1/c$c;->d0:Lax/U0/g;

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-direct {v1, v2, p1, v3, v0}, Lax/m1/p;-><init>(Lax/U0/g;Lax/U0/k;ILax/m1/p$a;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 51
    .line 52
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 53
    .line 54
    invoke-static {v0}, Lax/d1/c;->G(Lax/d1/c;)Lax/m1/m;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget v2, v1, Lax/m1/p;->c:I

    .line 59
    .line 60
    invoke-interface {v0, v2}, Lax/m1/m;->c(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p1, v1, p0, v0}, Lax/m1/o;->n(Lax/m1/o$e;Lax/m1/o$b;I)J

    .line 65
    .line 66
    .line 67
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

.method private s(Landroid/net/Uri;)V
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lax/d1/c$c;->i0:J

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/d1/c$c;->j0:Z

    .line 6
    .line 7
    if-nez v0, :cond_3b

    .line 8
    .line 9
    iget-object v0, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/m1/o;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_3b

    .line 16
    .line 17
    iget-object v0, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/m1/o;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    goto :goto_3b

    .line 26
    :cond_19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iget-wide v2, p0, Lax/d1/c$c;->h0:J

    .line 31
    .line 32
    cmp-long v4, v0, v2

    .line 33
    .line 34
    if-gez v4, :cond_38

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    iput-boolean v2, p0, Lax/d1/c$c;->j0:Z

    .line 38
    .line 39
    iget-object v2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 40
    .line 41
    invoke-static {v2}, Lax/d1/c;->s(Lax/d1/c;)Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Lax/d1/d;

    .line 46
    .line 47
    invoke-direct {v3, p0, p1}, Lax/d1/d;-><init>(Lax/d1/c$c;Landroid/net/Uri;)V

    .line 48
    .line 49
    .line 50
    iget-wide v4, p0, Lax/d1/c$c;->h0:J

    .line 51
    .line 52
    sub-long/2addr v4, v0

    .line 53
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    invoke-direct {p0, p1}, Lax/d1/c$c;->q(Landroid/net/Uri;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    :goto_3b
    return-void
    .line 61
.end method

.method private y(Lax/d1/f;Lax/i1/y;)V
    .registers 14

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, p0, Lax/d1/c$c;->f0:J

    .line 8
    .line 9
    iget-object v3, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 10
    .line 11
    invoke-static {v3, v0, p1}, Lax/d1/c;->x(Lax/d1/c;Lax/d1/f;Lax/d1/f;)Lax/d1/f;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iput-object v3, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v3, v0, :cond_1f

    .line 19
    .line 20
    iput-object v4, p0, Lax/d1/c$c;->k0:Ljava/io/IOException;

    .line 21
    .line 22
    iput-wide v1, p0, Lax/d1/c$c;->g0:J

    .line 23
    .line 24
    iget-object p1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 25
    .line 26
    iget-object v4, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-static {p1, v4, v3}, Lax/d1/c;->y(Lax/d1/c;Landroid/net/Uri;Lax/d1/f;)V

    .line 29
    .line 30
    .line 31
    goto :goto_75

    .line 32
    :cond_1f
    iget-boolean v3, v3, Lax/d1/f;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_75

    .line 35
    .line 36
    iget-wide v5, p1, Lax/d1/f;->k:J

    .line 37
    .line 38
    iget-object p1, p1, Lax/d1/f;->r:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    int-to-long v7, p1

    .line 45
    add-long/2addr v5, v7

    .line 46
    iget-object p1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 47
    .line 48
    iget-wide v7, p1, Lax/d1/f;->k:J

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    cmp-long v9, v5, v7

    .line 52
    .line 53
    if-gez v9, :cond_3f

    .line 54
    .line 55
    new-instance v4, Lax/d1/m$c;

    .line 56
    .line 57
    iget-object p1, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 58
    .line 59
    invoke-direct {v4, p1}, Lax/d1/m$c;-><init>(Landroid/net/Uri;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    goto :goto_5f

    .line 64
    :cond_3f
    iget-wide v5, p0, Lax/d1/c$c;->g0:J

    .line 65
    .line 66
    sub-long v5, v1, v5

    .line 67
    .line 68
    long-to-double v5, v5

    .line 69
    iget-wide v7, p1, Lax/d1/f;->m:J

    .line 70
    .line 71
    invoke-static {v7, v8}, Lax/S0/d0;->E1(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    long-to-double v7, v7

    .line 76
    iget-object p1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 77
    .line 78
    invoke-static {p1}, Lax/d1/c;->z(Lax/d1/c;)D

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    mul-double v7, v7, v9

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    cmpl-double v9, v5, v7

    .line 86
    .line 87
    if-lez v9, :cond_5f

    .line 88
    .line 89
    new-instance v4, Lax/d1/m$d;

    .line 90
    .line 91
    iget-object v5, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 92
    .line 93
    invoke-direct {v4, v5}, Lax/d1/m$d;-><init>(Landroid/net/Uri;)V

    .line 94
    .line 95
    .line 96
    :cond_5f
    :goto_5f
    if-eqz v4, :cond_75

    .line 97
    .line 98
    iput-object v4, p0, Lax/d1/c$c;->k0:Ljava/io/IOException;

    .line 99
    .line 100
    iget-object v5, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 101
    .line 102
    iget-object v6, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 103
    .line 104
    new-instance v7, Lax/m1/m$c;

    .line 105
    .line 106
    new-instance v8, Lax/i1/B;

    .line 107
    .line 108
    const/4 v9, 0x4

    .line 109
    invoke-direct {v8, v9}, Lax/i1/B;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v7, p2, v8, v4, v3}, Lax/m1/m$c;-><init>(Lax/i1/y;Lax/i1/B;Ljava/io/IOException;I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v5, v6, v7, p1}, Lax/d1/c;->q(Lax/d1/c;Landroid/net/Uri;Lax/m1/m$c;Z)Z

    .line 116
    .line 117
    .line 118
    :cond_75
    :goto_75
    iget-object p1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 119
    .line 120
    iget-object v3, p1, Lax/d1/f;->v:Lax/d1/f$h;

    .line 121
    .line 122
    iget-boolean v3, v3, Lax/d1/f$h;->e:Z

    .line 123
    .line 124
    const-wide/16 v4, 0x2

    .line 125
    .line 126
    if-nez v3, :cond_89

    .line 127
    .line 128
    if-eq p1, v0, :cond_84

    .line 129
    .line 130
    iget-wide v3, p1, Lax/d1/f;->m:J

    .line 131
    .line 132
    goto :goto_9f

    .line 133
    :cond_84
    iget-wide v6, p1, Lax/d1/f;->m:J

    .line 134
    .line 135
    div-long v3, v6, v4

    .line 136
    .line 137
    goto :goto_9f

    .line 138
    :cond_89
    if-ne p1, v0, :cond_9d

    .line 139
    .line 140
    iget-wide v6, p1, Lax/d1/f;->n:J

    .line 141
    .line 142
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    cmp-long v0, v6, v8

    .line 148
    .line 149
    if-eqz v0, :cond_99

    .line 150
    .line 151
    div-long/2addr v6, v4

    .line 152
    :goto_97
    move-wide v3, v6

    .line 153
    goto :goto_9f

    .line 154
    :cond_99
    iget-wide v6, p1, Lax/d1/f;->m:J

    .line 155
    .line 156
    div-long/2addr v6, v4

    .line 157
    goto :goto_97

    .line 158
    :cond_9d
    const-wide/16 v3, 0x0

    .line 159
    .line 160
    :goto_9f
    invoke-static {v3, v4}, Lax/S0/d0;->E1(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    add-long/2addr v1, v3

    .line 165
    iget-wide p1, p2, Lax/i1/y;->f:J

    .line 166
    .line 167
    sub-long/2addr v1, p1

    .line 168
    iput-wide v1, p0, Lax/d1/c$c;->h0:J

    .line 169
    .line 170
    iget-object p1, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 171
    .line 172
    iget-boolean p1, p1, Lax/d1/f;->o:Z

    .line 173
    .line 174
    if-nez p1, :cond_c8

    .line 175
    .line 176
    iget-object p1, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 177
    .line 178
    iget-object p2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 179
    .line 180
    invoke-static {p2}, Lax/d1/c;->A(Lax/d1/c;)Landroid/net/Uri;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_c1

    .line 189
    .line 190
    iget-boolean p1, p0, Lax/d1/c$c;->l0:Z

    .line 191
    .line 192
    if-eqz p1, :cond_c8

    .line 193
    .line 194
    :cond_c1
    invoke-direct {p0}, Lax/d1/c$c;->i()Landroid/net/Uri;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-direct {p0, p1}, Lax/d1/c$c;->s(Landroid/net/Uri;)V

    .line 199
    .line 200
    .line 201
    :cond_c8
    return-void
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


# virtual methods
.method public A(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d1/c$c;->l0:Z

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

.method public bridge synthetic j(Lax/m1/o$e;JJLjava/io/IOException;I)Lax/m1/o$c;
    .registers 8

    .line 1
    check-cast p1, Lax/m1/p;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Lax/d1/c$c;->w(Lax/m1/p;JJLjava/io/IOException;I)Lax/m1/o$c;

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

.method public bridge synthetic k(Lax/m1/o$e;JJI)V
    .registers 7

    .line 1
    check-cast p1, Lax/m1/p;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lax/d1/c$c;->x(Lax/m1/p;JJI)V

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

.method public l()Lax/d1/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

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

.method public m()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/d1/c$c;->l0:Z

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

.method public n()Z
    .registers 11

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

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
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 12
    .line 13
    iget-wide v4, v0, Lax/d1/f;->u:J

    .line 14
    .line 15
    invoke-static {v4, v5}, Lax/S0/d0;->E1(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-wide/16 v6, 0x7530

    .line 20
    .line 21
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    iget-object v0, p0, Lax/d1/c$c;->e0:Lax/d1/f;

    .line 26
    .line 27
    iget-boolean v6, v0, Lax/d1/f;->o:Z

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    if-nez v6, :cond_2f

    .line 31
    .line 32
    iget v0, v0, Lax/d1/f;->d:I

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-eq v0, v6, :cond_2f

    .line 36
    .line 37
    if-eq v0, v7, :cond_2f

    .line 38
    .line 39
    iget-wide v8, p0, Lax/d1/c$c;->f0:J

    .line 40
    .line 41
    add-long/2addr v8, v4

    .line 42
    cmp-long v0, v8, v2

    .line 43
    .line 44
    if-lez v0, :cond_2e

    .line 45
    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    return v1

    .line 48
    :cond_2f
    :goto_2f
    return v7
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

.method public o(Z)V
    .registers 2

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-direct {p0}, Lax/d1/c$c;->i()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_9

    .line 8
    :cond_7
    iget-object p1, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 9
    .line 10
    :goto_9
    invoke-direct {p0, p1}, Lax/d1/c$c;->s(Landroid/net/Uri;)V

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

.method public bridge synthetic p(Lax/m1/o$e;JJZ)V
    .registers 7

    .line 1
    check-cast p1, Lax/m1/p;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lax/d1/c$c;->u(Lax/m1/p;JJZ)V

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

.method public bridge synthetic r(Lax/m1/o$e;JJ)V
    .registers 6

    .line 1
    check-cast p1, Lax/m1/p;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lax/d1/c$c;->v(Lax/m1/p;JJ)V

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

.method public t()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/d1/c$c;->k0:Ljava/io/IOException;

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    throw v0
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

.method public u(Lax/m1/p;JJZ)V
    .registers 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/m1/p<",
            "Lax/d1/j;",
            ">;JJZ)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/i1/y;

    .line 2
    .line 3
    iget-wide v1, p1, Lax/m1/p;->a:J

    .line 4
    .line 5
    iget-object v3, p1, Lax/m1/p;->b:Lax/U0/k;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/m1/p;->f()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, Lax/m1/p;->d()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, Lax/m1/p;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    move-wide v6, p2

    .line 20
    move-wide/from16 v8, p4

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 26
    .line 27
    invoke-static {v1}, Lax/d1/c;->G(Lax/d1/c;)Lax/m1/m;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-wide v2, p1, Lax/m1/p;->a:J

    .line 32
    .line 33
    invoke-interface {v1, v2, v3}, Lax/m1/m;->a(J)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 37
    .line 38
    invoke-static {p1}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 v1, 0x4

    .line 43
    invoke-virtual {p1, v0, v1}, Lax/i1/N$a;->l(Lax/i1/y;I)V

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

.method public v(Lax/m1/p;JJ)V
    .registers 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/m1/p<",
            "Lax/d1/j;",
            ">;JJ)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/m1/p;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/d1/j;

    .line 6
    .line 7
    new-instance v1, Lax/i1/y;

    .line 8
    .line 9
    iget-wide v2, p1, Lax/m1/p;->a:J

    .line 10
    .line 11
    iget-object v4, p1, Lax/m1/p;->b:Lax/U0/k;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/m1/p;->f()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {p1}, Lax/m1/p;->d()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p1}, Lax/m1/p;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v11

    .line 25
    move-wide v7, p2

    .line 26
    move-wide/from16 v9, p4

    .line 27
    .line 28
    invoke-direct/range {v1 .. v12}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 29
    .line 30
    .line 31
    instance-of v2, v0, Lax/d1/f;

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    if-eqz v2, :cond_32

    .line 35
    .line 36
    check-cast v0, Lax/d1/f;

    .line 37
    .line 38
    invoke-direct {p0, v0, v1}, Lax/d1/c$c;->y(Lax/d1/f;Lax/i1/y;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 42
    .line 43
    invoke-static {v0}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v1, v3}, Lax/i1/N$a;->o(Lax/i1/y;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_47

    .line 51
    :cond_32
    const-string v0, "Loaded playlist has unexpected type."

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static {v0, v2}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lax/d1/c$c;->k0:Ljava/io/IOException;

    .line 59
    .line 60
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 61
    .line 62
    invoke-static {v0}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v2, p0, Lax/d1/c$c;->k0:Ljava/io/IOException;

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    invoke-virtual {v0, v1, v3, v2, v4}, Lax/i1/N$a;->s(Lax/i1/y;ILjava/io/IOException;Z)V

    .line 70
    .line 71
    .line 72
    :goto_47
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 73
    .line 74
    invoke-static {v0}, Lax/d1/c;->G(Lax/d1/c;)Lax/m1/m;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-wide v1, p1, Lax/m1/p;->a:J

    .line 79
    .line 80
    invoke-interface {v0, v1, v2}, Lax/m1/m;->a(J)V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public w(Lax/m1/p;JJLjava/io/IOException;I)Lax/m1/o$c;
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/m1/p<",
            "Lax/d1/j;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lax/m1/o$c;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    new-instance v1, Lax/i1/y;

    .line 4
    .line 5
    iget-wide v2, p1, Lax/m1/p;->a:J

    .line 6
    .line 7
    iget-object v4, p1, Lax/m1/p;->b:Lax/U0/k;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/m1/p;->f()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {p1}, Lax/m1/p;->d()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {p1}, Lax/m1/p;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v11

    .line 21
    move-wide v7, p2

    .line 22
    move-wide/from16 v9, p4

    .line 23
    .line 24
    invoke-direct/range {v1 .. v12}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lax/m1/p;->f()Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "_HLS_msn"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x1

    .line 38
    const/4 v4, 0x0

    .line 39
    if-eqz v2, :cond_2a

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 v2, 0x0

    .line 44
    :goto_2b
    instance-of v5, v0, Lax/d1/k$a;

    .line 45
    .line 46
    if-nez v2, :cond_31

    .line 47
    .line 48
    if-eqz v5, :cond_49

    .line 49
    .line 50
    :cond_31
    instance-of v2, v0, Lax/U0/u;

    .line 51
    .line 52
    if-eqz v2, :cond_3b

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Lax/U0/u;

    .line 56
    .line 57
    iget v2, v2, Lax/U0/u;->e0:I

    .line 58
    .line 59
    goto :goto_3e

    .line 60
    :cond_3b
    const v2, 0x7fffffff

    .line 61
    .line 62
    .line 63
    :goto_3e
    if-nez v5, :cond_9d

    .line 64
    .line 65
    const/16 v5, 0x190

    .line 66
    .line 67
    if-eq v2, v5, :cond_9d

    .line 68
    .line 69
    const/16 v5, 0x1f7

    .line 70
    .line 71
    if-ne v2, v5, :cond_49

    .line 72
    .line 73
    goto :goto_9d

    .line 74
    :cond_49
    new-instance v2, Lax/i1/B;

    .line 75
    .line 76
    iget v3, p1, Lax/m1/p;->c:I

    .line 77
    .line 78
    invoke-direct {v2, v3}, Lax/i1/B;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Lax/m1/m$c;

    .line 82
    .line 83
    move/from16 v5, p7

    .line 84
    .line 85
    invoke-direct {v3, v1, v2, v0, v5}, Lax/m1/m$c;-><init>(Lax/i1/y;Lax/i1/B;Ljava/io/IOException;I)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 89
    .line 90
    iget-object v5, p0, Lax/d1/c$c;->q:Landroid/net/Uri;

    .line 91
    .line 92
    invoke-static {v2, v5, v3, v4}, Lax/d1/c;->q(Lax/d1/c;Landroid/net/Uri;Lax/m1/m$c;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_7c

    .line 97
    .line 98
    iget-object v2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 99
    .line 100
    invoke-static {v2}, Lax/d1/c;->G(Lax/d1/c;)Lax/m1/m;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v2, v3}, Lax/m1/m;->b(Lax/m1/m$c;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v2

    .line 108
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    cmp-long v7, v2, v5

    .line 114
    .line 115
    if-eqz v7, :cond_79

    .line 116
    .line 117
    invoke-static {v4, v2, v3}, Lax/m1/o;->g(ZJ)Lax/m1/o$c;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    goto :goto_7e

    .line 122
    :cond_79
    sget-object v2, Lax/m1/o;->g:Lax/m1/o$c;

    .line 123
    .line 124
    goto :goto_7e

    .line 125
    :cond_7c
    sget-object v2, Lax/m1/o;->f:Lax/m1/o$c;

    .line 126
    .line 127
    :goto_7e
    invoke-virtual {v2}, Lax/m1/o$c;->c()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    xor-int/lit8 v4, v3, 0x1

    .line 132
    .line 133
    iget-object v5, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 134
    .line 135
    invoke-static {v5}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    iget v6, p1, Lax/m1/p;->c:I

    .line 140
    .line 141
    invoke-virtual {v5, v1, v6, v0, v4}, Lax/i1/N$a;->s(Lax/i1/y;ILjava/io/IOException;Z)V

    .line 142
    .line 143
    .line 144
    if-nez v3, :cond_9c

    .line 145
    .line 146
    iget-object v0, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 147
    .line 148
    invoke-static {v0}, Lax/d1/c;->G(Lax/d1/c;)Lax/m1/m;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-wide v3, p1, Lax/m1/p;->a:J

    .line 153
    .line 154
    invoke-interface {v0, v3, v4}, Lax/m1/m;->a(J)V

    .line 155
    .line 156
    .line 157
    :cond_9c
    return-object v2

    .line 158
    :cond_9d
    :goto_9d
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    iput-wide v5, p0, Lax/d1/c$c;->h0:J

    .line 163
    .line 164
    invoke-virtual {p0, v4}, Lax/d1/c$c;->o(Z)V

    .line 165
    .line 166
    .line 167
    iget-object v2, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 168
    .line 169
    invoke-static {v2}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {v2}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Lax/i1/N$a;

    .line 178
    .line 179
    iget p1, p1, Lax/m1/p;->c:I

    .line 180
    .line 181
    invoke-virtual {v2, v1, p1, v0, v3}, Lax/i1/N$a;->s(Lax/i1/y;ILjava/io/IOException;Z)V

    .line 182
    .line 183
    .line 184
    sget-object p1, Lax/m1/o;->f:Lax/m1/o$c;

    .line 185
    .line 186
    return-object p1
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

.method public x(Lax/m1/p;JJI)V
    .registers 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/m1/p<",
            "Lax/d1/j;",
            ">;JJI)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    if-nez v1, :cond_12

    .line 6
    .line 7
    new-instance v2, Lax/i1/y;

    .line 8
    .line 9
    iget-wide v3, v0, Lax/m1/p;->a:J

    .line 10
    .line 11
    iget-object v5, v0, Lax/m1/p;->b:Lax/U0/k;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, Lax/i1/y;-><init>(JLax/U0/k;J)V

    .line 16
    .line 17
    .line 18
    goto :goto_2c

    .line 19
    :cond_12
    new-instance v3, Lax/i1/y;

    .line 20
    .line 21
    iget-wide v4, v0, Lax/m1/p;->a:J

    .line 22
    .line 23
    iget-object v6, v0, Lax/m1/p;->b:Lax/U0/k;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/m1/p;->f()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v0}, Lax/m1/p;->d()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v0}, Lax/m1/p;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v13

    .line 37
    move-wide/from16 v9, p2

    .line 38
    .line 39
    move-wide/from16 v11, p4

    .line 40
    .line 41
    invoke-direct/range {v3 .. v14}, Lax/i1/y;-><init>(JLax/U0/k;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_2c
    iget-object v3, p0, Lax/d1/c$c;->m0:Lax/d1/c;

    .line 46
    .line 47
    invoke-static {v3}, Lax/d1/c;->F(Lax/d1/c;)Lax/i1/N$a;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget v0, v0, Lax/m1/p;->c:I

    .line 52
    .line 53
    invoke-virtual {v3, v2, v0, v1}, Lax/i1/N$a;->u(Lax/i1/y;II)V

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

.method public z()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d1/c$c;->c0:Lax/m1/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/m1/o;->l()V

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
