.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource;
.super Lax/i1/a;
.source "SourceFile"

# interfaces
.implements Lax/d1/m$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final h:Lax/c1/e;

.field private final i:Lax/c1/d;

.field private final j:Lax/i1/j;

.field private final k:Lax/b1/w;

.field private final l:Lax/m1/m;

.field private final m:Z

.field private final n:I

.field private final o:Z

.field private final p:Lax/d1/m;

.field private final q:J

.field private final r:J

.field private s:Lax/P0/y$g;

.field private t:Lax/U0/z;

.field private u:Lax/P0/y;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "media3.exoplayer.hls"

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

.method private constructor <init>(Lax/P0/y;Lax/c1/d;Lax/c1/e;Lax/i1/j;Lax/m1/f;Lax/b1/w;Lax/m1/m;Lax/d1/m;JZIZJ)V
    .registers 16

    .line 2
    invoke-direct {p0}, Lax/i1/a;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->u:Lax/P0/y;

    .line 4
    iget-object p1, p1, Lax/P0/y;->d:Lax/P0/y$g;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->i:Lax/c1/d;

    .line 6
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->h:Lax/c1/e;

    .line 7
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j:Lax/i1/j;

    .line 8
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->k:Lax/b1/w;

    .line 9
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->l:Lax/m1/m;

    .line 10
    iput-object p8, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 11
    iput-wide p9, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->q:J

    .line 12
    iput-boolean p11, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->m:Z

    .line 13
    iput p12, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->n:I

    .line 14
    iput-boolean p13, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->o:Z

    .line 15
    iput-wide p14, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->r:J

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y;Lax/c1/d;Lax/c1/e;Lax/i1/j;Lax/m1/f;Lax/b1/w;Lax/m1/m;Lax/d1/m;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$a;)V
    .registers 17

    .line 1
    invoke-direct/range {p0 .. p15}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Lax/P0/y;Lax/c1/d;Lax/c1/e;Lax/i1/j;Lax/m1/f;Lax/b1/w;Lax/m1/m;Lax/d1/m;JZIZJ)V

    return-void
.end method

.method private D(Lax/d1/f;JJLandroidx/media3/exoplayer/hls/d;)Lax/i1/h0;
    .registers 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lax/d1/f;->h:J

    .line 6
    .line 7
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 8
    .line 9
    invoke-interface {v4}, Lax/d1/m;->e()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    sub-long v17, v2, v4

    .line 14
    .line 15
    iget-boolean v2, v1, Lax/d1/f;->o:Z

    .line 16
    .line 17
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-eqz v2, :cond_1d

    .line 23
    .line 24
    iget-wide v5, v1, Lax/d1/f;->u:J

    .line 25
    .line 26
    add-long v5, v17, v5

    .line 27
    .line 28
    move-wide v13, v5

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    move-wide v13, v3

    .line 31
    :goto_1e
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->H(Lax/d1/f;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 36
    .line 37
    iget-wide v5, v2, Lax/P0/y$g;->a:J

    .line 38
    .line 39
    cmp-long v2, v5, v3

    .line 40
    .line 41
    if-eqz v2, :cond_30

    .line 42
    .line 43
    invoke-static {v5, v6}, Lax/S0/d0;->a1(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    :goto_2e
    move-wide v5, v2

    .line 48
    goto :goto_35

    .line 49
    :cond_30
    invoke-static {v1, v7, v8}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->J(Lax/d1/f;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    goto :goto_2e

    .line 54
    :goto_35
    iget-wide v2, v1, Lax/d1/f;->u:J

    .line 55
    .line 56
    add-long v9, v2, v7

    .line 57
    .line 58
    invoke-static/range {v5 .. v10}, Lax/S0/d0;->q(JJJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->K(Lax/d1/f;J)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1, v7, v8}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->I(Lax/d1/f;J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v19

    .line 69
    iget v2, v1, Lax/d1/f;->d:I

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    const/4 v4, 0x1

    .line 73
    if-ne v2, v3, :cond_51

    .line 74
    .line 75
    iget-boolean v2, v1, Lax/d1/f;->f:Z

    .line 76
    .line 77
    if-eqz v2, :cond_51

    .line 78
    .line 79
    const/16 v23, 0x1

    .line 80
    .line 81
    goto :goto_54

    .line 82
    :cond_51
    const/4 v2, 0x0

    .line 83
    const/16 v23, 0x0

    .line 84
    .line 85
    :goto_54
    new-instance v6, Lax/i1/h0;

    .line 86
    .line 87
    iget-wide v2, v1, Lax/d1/f;->u:J

    .line 88
    .line 89
    iget-boolean v1, v1, Lax/d1/f;->o:Z

    .line 90
    .line 91
    xor-int/lit8 v22, v1, 0x1

    .line 92
    .line 93
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j()Lax/P0/y;

    .line 94
    .line 95
    .line 96
    move-result-object v25

    .line 97
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 98
    .line 99
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    const/16 v21, 0x1

    .line 105
    .line 106
    move-wide/from16 v7, p2

    .line 107
    .line 108
    move-wide/from16 v9, p4

    .line 109
    .line 110
    move-object/from16 v24, p6

    .line 111
    .line 112
    move-object/from16 v26, v1

    .line 113
    .line 114
    move-wide v15, v2

    .line 115
    invoke-direct/range {v6 .. v26}, Lax/i1/h0;-><init>(JJJJJJJZZZLjava/lang/Object;Lax/P0/y;Lax/P0/y$g;)V

    .line 116
    .line 117
    .line 118
    return-object v6
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

.method private E(Lax/d1/f;JJLandroidx/media3/exoplayer/hls/d;)Lax/i1/h0;
    .registers 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-wide v1, v0, Lax/d1/f;->e:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-eqz v5, :cond_31

    .line 13
    .line 14
    iget-object v1, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_16

    .line 21
    .line 22
    goto :goto_31

    .line 23
    :cond_16
    iget-boolean v1, v0, Lax/d1/f;->g:Z

    .line 24
    .line 25
    if-nez v1, :cond_2e

    .line 26
    .line 27
    iget-wide v1, v0, Lax/d1/f;->e:J

    .line 28
    .line 29
    iget-wide v3, v0, Lax/d1/f;->u:J

    .line 30
    .line 31
    cmp-long v5, v1, v3

    .line 32
    .line 33
    if-nez v5, :cond_23

    .line 34
    .line 35
    goto :goto_2e

    .line 36
    :cond_23
    iget-object v3, v0, Lax/d1/f;->r:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v3, v1, v2}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->G(Ljava/util/List;J)Lax/d1/f$f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-wide v1, v1, Lax/d1/f$g;->f0:J

    .line 43
    .line 44
    :goto_2b
    move-wide/from16 v16, v1

    .line 45
    .line 46
    goto :goto_34

    .line 47
    :cond_2e
    :goto_2e
    iget-wide v1, v0, Lax/d1/f;->e:J

    .line 48
    .line 49
    goto :goto_2b

    .line 50
    :cond_31
    :goto_31
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    goto :goto_2b

    .line 53
    :goto_34
    new-instance v3, Lax/i1/h0;

    .line 54
    .line 55
    iget-wide v10, v0, Lax/d1/f;->u:J

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j()Lax/P0/y;

    .line 58
    .line 59
    .line 60
    move-result-object v22

    .line 61
    const/16 v23, 0x0

    .line 62
    .line 63
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    const-wide/16 v14, 0x0

    .line 69
    .line 70
    const/16 v18, 0x1

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    const/16 v20, 0x1

    .line 75
    .line 76
    move-wide v12, v10

    .line 77
    move-wide/from16 v4, p2

    .line 78
    .line 79
    move-wide/from16 v6, p4

    .line 80
    .line 81
    move-object/from16 v21, p6

    .line 82
    .line 83
    invoke-direct/range {v3 .. v23}, Lax/i1/h0;-><init>(JJJJJJJZZZLjava/lang/Object;Lax/P0/y;Lax/P0/y$g;)V

    .line 84
    .line 85
    .line 86
    return-object v3
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

.method private static F(Ljava/util/List;J)Lax/d1/f$d;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/d1/f$d;",
            ">;J)",
            "Lax/d1/f$d;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_22

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lax/d1/f$d;

    .line 14
    .line 15
    iget-wide v3, v2, Lax/d1/f$g;->f0:J

    .line 16
    .line 17
    cmp-long v5, v3, p1

    .line 18
    .line 19
    if-gtz v5, :cond_1a

    .line 20
    .line 21
    iget-boolean v5, v2, Lax/d1/f$d;->m0:Z

    .line 22
    .line 23
    if-eqz v5, :cond_1a

    .line 24
    .line 25
    move-object v0, v2

    .line 26
    goto :goto_1f

    .line 27
    :cond_1a
    cmp-long v2, v3, p1

    .line 28
    .line 29
    if-lez v2, :cond_1f

    .line 30
    .line 31
    goto :goto_22

    .line 32
    :cond_1f
    :goto_1f
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_22
    :goto_22
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static G(Ljava/util/List;J)Lax/d1/f$f;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/d1/f$f;",
            ">;J)",
            "Lax/d1/f$f;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-static {p0, p1, p2, p2}, Lax/S0/d0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lax/d1/f$f;

    .line 15
    .line 16
    return-object p0
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

.method private H(Lax/d1/f;)J
    .registers 6

    .line 1
    iget-boolean v0, p1, Lax/d1/f;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_14

    .line 4
    .line 5
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->q:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Lax/S0/d0;->i0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Lax/d1/f;->e()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sub-long/2addr v0, v2

    .line 20
    return-wide v0

    .line 21
    :cond_14
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    return-wide v0
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

.method private I(Lax/d1/f;J)J
    .registers 9

    .line 1
    iget-wide v0, p1, Lax/d1/f;->e:J

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
    if-eqz v4, :cond_c

    .line 11
    .line 12
    goto :goto_18

    .line 13
    :cond_c
    iget-wide v0, p1, Lax/d1/f;->u:J

    .line 14
    .line 15
    add-long/2addr v0, p2

    .line 16
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 17
    .line 18
    iget-wide p2, p2, Lax/P0/y$g;->a:J

    .line 19
    .line 20
    invoke-static {p2, p3}, Lax/S0/d0;->a1(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    sub-long/2addr v0, p2

    .line 25
    :goto_18
    iget-boolean p2, p1, Lax/d1/f;->g:Z

    .line 26
    .line 27
    if-eqz p2, :cond_1d

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_1d
    iget-object p2, p1, Lax/d1/f;->s:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {p2, v0, v1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->F(Ljava/util/List;J)Lax/d1/f$d;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_28

    .line 37
    .line 38
    iget-wide p1, p2, Lax/d1/f$g;->f0:J

    .line 39
    .line 40
    return-wide p1

    .line 41
    :cond_28
    iget-object p2, p1, Lax/d1/f;->r:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_33

    .line 48
    .line 49
    const-wide/16 p1, 0x0

    .line 50
    .line 51
    return-wide p1

    .line 52
    :cond_33
    iget-object p1, p1, Lax/d1/f;->r:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->G(Ljava/util/List;J)Lax/d1/f$f;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p2, p1, Lax/d1/f$f;->n0:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {p2, v0, v1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->F(Ljava/util/List;J)Lax/d1/f$d;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_44

    .line 65
    .line 66
    iget-wide p1, p2, Lax/d1/f$g;->f0:J

    .line 67
    .line 68
    return-wide p1

    .line 69
    :cond_44
    iget-wide p1, p1, Lax/d1/f$g;->f0:J

    .line 70
    .line 71
    return-wide p1
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

.method private static J(Lax/d1/f;J)J
    .registers 11

    .line 1
    iget-object v0, p0, Lax/d1/f;->v:Lax/d1/f$h;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/d1/f;->e:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-eqz v5, :cond_11

    .line 13
    .line 14
    iget-wide v3, p0, Lax/d1/f;->u:J

    .line 15
    .line 16
    sub-long/2addr v3, v1

    .line 17
    goto :goto_2d

    .line 18
    :cond_11
    iget-wide v1, v0, Lax/d1/f$h;->d:J

    .line 19
    .line 20
    cmp-long v5, v1, v3

    .line 21
    .line 22
    if-eqz v5, :cond_1f

    .line 23
    .line 24
    iget-wide v5, p0, Lax/d1/f;->n:J

    .line 25
    .line 26
    cmp-long v7, v5, v3

    .line 27
    .line 28
    if-eqz v7, :cond_1f

    .line 29
    .line 30
    move-wide v3, v1

    .line 31
    goto :goto_2d

    .line 32
    :cond_1f
    iget-wide v0, v0, Lax/d1/f$h;->c:J

    .line 33
    .line 34
    cmp-long v2, v0, v3

    .line 35
    .line 36
    if-eqz v2, :cond_27

    .line 37
    .line 38
    move-wide v3, v0

    .line 39
    goto :goto_2d

    .line 40
    :cond_27
    const-wide/16 v0, 0x3

    .line 41
    .line 42
    iget-wide v2, p0, Lax/d1/f;->m:J

    .line 43
    .line 44
    mul-long v3, v2, v0

    .line 45
    .line 46
    :goto_2d
    add-long/2addr v3, p1

    .line 47
    return-wide v3
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

.method private K(Lax/d1/f;J)V
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j()Lax/P0/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lax/P0/y;->d:Lax/P0/y$g;

    .line 6
    .line 7
    iget v1, v0, Lax/P0/y$g;->d:F

    .line 8
    .line 9
    const v2, -0x800001

    .line 10
    .line 11
    .line 12
    cmpl-float v1, v1, v2

    .line 13
    .line 14
    if-nez v1, :cond_2a

    .line 15
    .line 16
    iget v0, v0, Lax/P0/y$g;->e:F

    .line 17
    .line 18
    cmpl-float v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_2a

    .line 21
    .line 22
    iget-object p1, p1, Lax/d1/f;->v:Lax/d1/f$h;

    .line 23
    .line 24
    iget-wide v0, p1, Lax/d1/f$h;->c:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v4, v0, v2

    .line 32
    .line 33
    if-nez v4, :cond_2a

    .line 34
    .line 35
    iget-wide v0, p1, Lax/d1/f$h;->d:J

    .line 36
    .line 37
    cmp-long p1, v0, v2

    .line 38
    .line 39
    if-nez p1, :cond_2a

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 p1, 0x0

    .line 44
    :goto_2b
    new-instance v0, Lax/P0/y$g$a;

    .line 45
    .line 46
    invoke-direct {v0}, Lax/P0/y$g$a;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {p2, p3}, Lax/S0/d0;->E1(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    invoke-virtual {v0, p2, p3}, Lax/P0/y$g$a;->k(J)Lax/P0/y$g$a;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const/high16 p3, 0x3f800000    # 1.0f

    .line 58
    .line 59
    if-eqz p1, :cond_3f

    .line 60
    .line 61
    const/high16 v0, 0x3f800000    # 1.0f

    .line 62
    .line 63
    goto :goto_43

    .line 64
    :cond_3f
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 65
    .line 66
    iget v0, v0, Lax/P0/y$g;->d:F

    .line 67
    .line 68
    :goto_43
    invoke-virtual {p2, v0}, Lax/P0/y$g$a;->j(F)Lax/P0/y$g$a;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-eqz p1, :cond_4a

    .line 73
    .line 74
    goto :goto_4e

    .line 75
    :cond_4a
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 76
    .line 77
    iget p3, p1, Lax/P0/y$g;->e:F

    .line 78
    .line 79
    :goto_4e
    invoke-virtual {p2, p3}, Lax/P0/y$g$a;->h(F)Lax/P0/y$g$a;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lax/P0/y$g$a;->f()Lax/P0/y$g;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->s:Lax/P0/y$g;

    .line 88
    .line 89
    return-void
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


# virtual methods
.method protected A(Lax/U0/z;)V
    .registers 4

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->t:Lax/U0/z;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->k:Lax/b1/w;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/os/Looper;

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/i1/a;->x()Lax/Z0/I1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lax/b1/w;->c(Landroid/os/Looper;Lax/Z0/I1;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->k:Lax/b1/w;

    .line 23
    .line 24
    invoke-interface {p1}, Lax/b1/w;->k()V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1}, Lax/i1/a;->u(Lax/i1/F$b;)Lax/i1/N$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j()Lax/P0/y;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 39
    .line 40
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lax/P0/y$h;

    .line 45
    .line 46
    iget-object v1, v1, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 47
    .line 48
    invoke-interface {v0, v1, p1, p0}, Lax/d1/m;->d(Landroid/net/Uri;Lax/i1/N$a;Lax/d1/m$e;)V

    .line 49
    .line 50
    .line 51
    return-void
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

.method protected C()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/d1/m;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->k:Lax/b1/w;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/b1/w;->d()V

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
.end method

.method public declared-synchronized a(Lax/P0/y;)V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->u:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

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

.method public e(Lax/i1/C;)V
    .registers 2

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/hls/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/g;->D()V

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

.method public f(Lax/d1/f;)V
    .registers 14

    .line 1
    iget-boolean v0, p1, Lax/d1/f;->p:Z

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_11

    .line 9
    .line 10
    iget-wide v3, p1, Lax/d1/f;->h:J

    .line 11
    .line 12
    invoke-static {v3, v4}, Lax/S0/d0;->E1(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    move-wide v9, v3

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    move-wide v9, v1

    .line 19
    :goto_12
    iget v0, p1, Lax/d1/f;->d:I

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-eq v0, v3, :cond_1d

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    if-ne v0, v3, :cond_1b

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    move-wide v7, v1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    :goto_1d
    move-wide v7, v9

    .line 31
    :goto_1e
    new-instance v11, Landroidx/media3/exoplayer/hls/d;

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 34
    .line 35
    invoke-interface {v0}, Lax/d1/m;->h()Lax/d1/i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lax/d1/i;

    .line 44
    .line 45
    invoke-direct {v11, v0, p1}, Landroidx/media3/exoplayer/hls/d;-><init>(Lax/d1/i;Lax/d1/f;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 49
    .line 50
    invoke-interface {v0}, Lax/d1/m;->g()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3e

    .line 55
    .line 56
    move-object v5, p0

    .line 57
    move-object v6, p1

    .line 58
    invoke-direct/range {v5 .. v11}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->D(Lax/d1/f;JJLandroidx/media3/exoplayer/hls/d;)Lax/i1/h0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_44

    .line 63
    :cond_3e
    move-object v5, p0

    .line 64
    move-object v6, p1

    .line 65
    invoke-direct/range {v5 .. v11}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->E(Lax/d1/f;JJLandroidx/media3/exoplayer/hls/d;)Lax/i1/h0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_44
    invoke-virtual {p0, p1}, Lax/i1/a;->B(Lax/P0/N;)V

    .line 70
    .line 71
    .line 72
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
.end method

.method public i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Lax/i1/a;->u(Lax/i1/F$b;)Lax/i1/N$a;

    .line 4
    .line 5
    .line 6
    move-result-object v10

    .line 7
    invoke-virtual/range {p0 .. p1}, Lax/i1/a;->s(Lax/i1/F$b;)Lax/b1/u$a;

    .line 8
    .line 9
    .line 10
    move-result-object v8

    .line 11
    new-instance v1, Landroidx/media3/exoplayer/hls/g;

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->h:Lax/c1/e;

    .line 14
    .line 15
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 16
    .line 17
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->i:Lax/c1/d;

    .line 18
    .line 19
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->t:Lax/U0/z;

    .line 20
    .line 21
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->k:Lax/b1/w;

    .line 22
    .line 23
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->l:Lax/m1/m;

    .line 24
    .line 25
    iget-object v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->j:Lax/i1/j;

    .line 26
    .line 27
    iget-boolean v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->m:Z

    .line 28
    .line 29
    iget v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->n:I

    .line 30
    .line 31
    iget-boolean v15, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->o:Z

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/i1/a;->x()Lax/Z0/I1;

    .line 34
    .line 35
    .line 36
    move-result-object v16

    .line 37
    move-object/from16 p1, v1

    .line 38
    .line 39
    move-object v6, v2

    .line 40
    iget-wide v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->r:J

    .line 41
    .line 42
    move-wide/from16 v17, v1

    .line 43
    .line 44
    move-object v2, v6

    .line 45
    const/4 v6, 0x0

    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    move-object/from16 v11, p2

    .line 49
    .line 50
    invoke-direct/range {v1 .. v18}, Landroidx/media3/exoplayer/hls/g;-><init>(Lax/c1/e;Lax/d1/m;Lax/c1/d;Lax/U0/z;Lax/m1/f;Lax/b1/w;Lax/b1/u$a;Lax/m1/m;Lax/i1/N$a;Lax/m1/b;Lax/i1/j;ZIZLax/Z0/I1;J)V

    .line 51
    .line 52
    .line 53
    return-object v1
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

.method public declared-synchronized j()Lax/P0/y;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->u:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_5
    move-exception v0

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw v0
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
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->p:Lax/d1/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/d1/m;->l()V

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
