.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final a:Lax/c1/d;

.field private b:Lax/c1/e;

.field private c:Lax/N1/t$a;

.field private d:Z

.field private e:I

.field private f:Lax/d1/l;

.field private g:Lax/d1/m$a;

.field private h:Lax/i1/j;

.field private i:Lax/m1/f$a;

.field private j:Lax/b1/z;

.field private k:Lax/m1/m;

.field private l:Z

.field private m:I

.field private n:Z

.field private o:J

.field private p:J


# direct methods
.method public constructor <init>(Lax/U0/g$a;)V
    .registers 3

    .line 1
    new-instance v0, Lax/c1/b;

    invoke-direct {v0, p1}, Lax/c1/b;-><init>(Lax/U0/g$a;)V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Lax/c1/d;)V

    return-void
.end method

.method public constructor <init>(Lax/c1/d;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/c1/d;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lax/c1/d;

    .line 4
    new-instance p1, Lax/b1/l;

    invoke-direct {p1}, Lax/b1/l;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Lax/b1/z;

    .line 5
    new-instance p1, Lax/d1/a;

    invoke-direct {p1}, Lax/d1/a;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Lax/d1/l;

    .line 6
    sget-object p1, Lax/d1/c;->q0:Lax/d1/m$a;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:Lax/d1/m$a;

    .line 7
    new-instance p1, Lax/m1/k;

    invoke-direct {p1}, Lax/m1/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:Lax/m1/m;

    .line 8
    new-instance p1, Lax/i1/k;

    invoke-direct {p1}, Lax/i1/k;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Lax/i1/j;

    const/4 p1, 0x1

    .line 9
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->o:J

    .line 11
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:Z

    .line 12
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lax/N1/t$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->n(Lax/N1/t$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public bridge synthetic b(I)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j(I)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public bridge synthetic c(Z)Lax/i1/F$a;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public bridge synthetic d(Lax/m1/f$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k(Lax/m1/f$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public bridge synthetic e(Lax/P0/y;)Lax/i1/F;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h(Lax/P0/y;)Landroidx/media3/exoplayer/hls/HlsMediaSource;

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

.method public bridge synthetic f(Lax/b1/z;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l(Lax/b1/z;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public bridge synthetic g(Lax/m1/m;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m(Lax/m1/m;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

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

.method public h(Lax/P0/y;)Landroidx/media3/exoplayer/hls/HlsMediaSource;
    .registers 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v2, Lax/P0/y;->b:Lax/P0/y$h;

    .line 6
    .line 7
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 11
    .line 12
    if-nez v1, :cond_14

    .line 13
    .line 14
    new-instance v1, Lax/c1/c;

    .line 15
    .line 16
    invoke-direct {v1}, Lax/c1/c;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 20
    .line 21
    :cond_14
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lax/N1/t$a;

    .line 22
    .line 23
    if-eqz v1, :cond_1d

    .line 24
    .line 25
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 26
    .line 27
    invoke-interface {v3, v1}, Lax/c1/e;->a(Lax/N1/t$a;)Lax/c1/e;

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 31
    .line 32
    iget-boolean v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 33
    .line 34
    invoke-interface {v1, v3}, Lax/c1/e;->c(Z)Lax/c1/e;

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 38
    .line 39
    iget v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:I

    .line 40
    .line 41
    invoke-interface {v1, v3}, Lax/c1/e;->b(I)Lax/c1/e;

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lax/c1/e;

    .line 45
    .line 46
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Lax/d1/l;

    .line 47
    .line 48
    iget-object v3, v2, Lax/P0/y;->b:Lax/P0/y$h;

    .line 49
    .line 50
    iget-object v3, v3, Lax/P0/y$h;->d:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_3f

    .line 57
    .line 58
    new-instance v5, Lax/d1/e;

    .line 59
    .line 60
    invoke-direct {v5, v1, v3}, Lax/d1/e;-><init>(Lax/d1/l;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v5

    .line 64
    :cond_3f
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:Lax/m1/f$a;

    .line 65
    .line 66
    if-nez v3, :cond_44

    .line 67
    .line 68
    goto :goto_47

    .line 69
    :cond_44
    invoke-interface {v3, v2}, Lax/m1/f$a;->a(Lax/P0/y;)Lax/m1/f;

    .line 70
    .line 71
    .line 72
    :goto_47
    new-instance v3, Landroidx/media3/exoplayer/hls/HlsMediaSource;

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lax/c1/d;

    .line 76
    .line 77
    move-object v6, v5

    .line 78
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Lax/i1/j;

    .line 79
    .line 80
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Lax/b1/z;

    .line 81
    .line 82
    invoke-interface {v7, v2}, Lax/b1/z;->a(Lax/P0/y;)Lax/b1/w;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    iget-object v8, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:Lax/m1/m;

    .line 87
    .line 88
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:Lax/d1/m$a;

    .line 89
    .line 90
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lax/c1/d;

    .line 91
    .line 92
    move-object v11, v6

    .line 93
    const/4 v6, 0x0

    .line 94
    invoke-interface {v9, v10, v8, v1, v6}, Lax/d1/m$a;->a(Lax/c1/d;Lax/m1/m;Lax/d1/l;Lax/m1/f;)Lax/d1/m;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    move-object v1, v11

    .line 99
    iget-wide v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->o:J

    .line 100
    .line 101
    iget-boolean v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:Z

    .line 102
    .line 103
    iget v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->m:I

    .line 104
    .line 105
    iget-boolean v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->n:Z

    .line 106
    .line 107
    move-object v15, v7

    .line 108
    iget-wide v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->p:J

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    move-wide/from16 v18, v6

    .line 113
    .line 114
    move-object v7, v15

    .line 115
    move-wide/from16 v15, v18

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-direct/range {v1 .. v17}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Lax/P0/y;Lax/c1/d;Lax/c1/e;Lax/i1/j;Lax/m1/f;Lax/b1/w;Lax/m1/m;Lax/d1/m;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$a;)V

    .line 119
    .line 120
    .line 121
    return-object v1
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

.method public i(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

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

.method public j(I)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 2

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:I

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

.method public k(Lax/m1/f$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 2

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/m1/f$a;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:Lax/m1/f$a;

    .line 8
    .line 9
    return-object p0
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

.method public l(Lax/b1/z;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/b1/z;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Lax/b1/z;

    .line 10
    .line 11
    return-object p0
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

.method public m(Lax/m1/m;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/m1/m;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:Lax/m1/m;

    .line 10
    .line 11
    return-object p0
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

.method public n(Lax/N1/t$a;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lax/N1/t$a;

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
