.class final Landroidx/media3/exoplayer/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Y0/S;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/k$a;
    }
.end annotation


# instance fields
.field private final c0:Landroidx/media3/exoplayer/k$a;

.field private d0:Landroidx/media3/exoplayer/M0;

.field private e0:Lax/Y0/S;

.field private f0:Z

.field private g0:Z

.field private final q:Lax/Y0/a0;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/k$a;Lax/S0/h;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->c0:Landroidx/media3/exoplayer/k$a;

    .line 5
    .line 6
    new-instance p1, Lax/Y0/a0;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lax/Y0/a0;-><init>(Lax/S0/h;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 15
    .line 16
    return-void
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

.method private d(Z)Z
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 2
    .line 3
    if-eqz v0, :cond_2a

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/media3/exoplayer/M0;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2a

    .line 10
    .line 11
    if-eqz p1, :cond_15

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/M0;->getState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_2a

    .line 21
    .line 22
    :cond_15
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 23
    .line 24
    invoke-interface {v0}, Landroidx/media3/exoplayer/M0;->isReady()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_28

    .line 29
    .line 30
    if-nez p1, :cond_2a

    .line 31
    .line 32
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/media3/exoplayer/M0;->n()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_28

    .line 39
    .line 40
    goto :goto_2a

    .line 41
    :cond_28
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_2a
    :goto_2a
    const/4 p1, 0x1

    .line 44
    return p1
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

.method private j(Z)V
    .registers 7

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/k;->d(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_13

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 9
    .line 10
    iget-boolean p1, p0, Landroidx/media3/exoplayer/k;->g0:Z

    .line 11
    .line 12
    if-eqz p1, :cond_5e

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 15
    .line 16
    invoke-virtual {p1}, Lax/Y0/a0;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 21
    .line 22
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lax/Y0/S;

    .line 27
    .line 28
    invoke-interface {p1}, Lax/Y0/S;->w()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-boolean v2, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 33
    .line 34
    if-eqz v2, :cond_3f

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 37
    .line 38
    invoke-virtual {v2}, Lax/Y0/a0;->w()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v4, v0, v2

    .line 43
    .line 44
    if-gez v4, :cond_33

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 47
    .line 48
    invoke-virtual {p1}, Lax/Y0/a0;->c()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    const/4 v2, 0x0

    .line 53
    iput-boolean v2, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 54
    .line 55
    iget-boolean v2, p0, Landroidx/media3/exoplayer/k;->g0:Z

    .line 56
    .line 57
    if-eqz v2, :cond_3f

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 60
    .line 61
    invoke-virtual {v2}, Lax/Y0/a0;->b()V

    .line 62
    .line 63
    .line 64
    :cond_3f
    iget-object v2, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v1}, Lax/Y0/a0;->a(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Lax/Y0/S;->h()Lax/P0/G;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 74
    .line 75
    invoke-virtual {v0}, Lax/Y0/a0;->h()Lax/P0/G;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Lax/P0/G;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_5e

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lax/Y0/a0;->e(Lax/P0/G;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->c0:Landroidx/media3/exoplayer/k$a;

    .line 91
    .line 92
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/k$a;->j(Lax/P0/G;)V

    .line 93
    .line 94
    .line 95
    :cond_5e
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
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/M0;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_c

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 12
    .line 13
    :cond_c
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

.method public b(Landroidx/media3/exoplayer/M0;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/M0;->H()Lax/Y0/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_28

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 8
    .line 9
    if-eq v0, v1, :cond_28

    .line 10
    .line 11
    if-nez v1, :cond_1a

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/k;->d0:Landroidx/media3/exoplayer/M0;

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/Y0/a0;->h()Lax/P0/G;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Lax/Y0/S;->e(Lax/P0/G;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Multiple renderer media clocks enabled."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x3e8

    .line 35
    .line 36
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/s;->f(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    throw p1

    .line 41
    :cond_28
    return-void
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

.method public c(J)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/Y0/a0;->a(J)V

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

.method public e(Lax/P0/G;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lax/Y0/S;->e(Lax/P0/G;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 9
    .line 10
    invoke-interface {p1}, Lax/Y0/S;->h()Lax/P0/G;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/Y0/a0;->e(Lax/P0/G;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public f()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/k;->g0:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/Y0/a0;->b()V

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

.method public g()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/k;->g0:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/Y0/a0;->c()V

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

.method public h()Lax/P0/G;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/Y0/S;->h()Lax/P0/G;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/Y0/a0;->h()Lax/P0/G;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i(Z)J
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/k;->j(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/k;->w()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
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

.method public w()J
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/Y0/a0;->w()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 13
    .line 14
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lax/Y0/S;

    .line 19
    .line 20
    invoke-interface {v0}, Lax/Y0/S;->w()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
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

.method public z()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/k;->f0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->q:Lax/Y0/a0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/Y0/a0;->z()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->e0:Lax/Y0/S;

    .line 13
    .line 14
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lax/Y0/S;

    .line 19
    .line 20
    invoke-interface {v0}, Lax/Y0/S;->z()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
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
