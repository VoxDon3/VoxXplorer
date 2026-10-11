.class public Lax/Z2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public c0:J

.field public d0:J

.field public e0:J

.field public f0:Ljava/lang/String;

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:Ljava/lang/String;

.field public k0:Ljava/lang/String;

.field public l0:Ljava/lang/String;

.field public q:J


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lax/Z2/p;->q:J

    .line 7
    .line 8
    iput-wide v0, p0, Lax/Z2/p;->c0:J

    .line 9
    .line 10
    iput-wide v0, p0, Lax/Z2/p;->d0:J

    .line 11
    .line 12
    iput-wide v0, p0, Lax/Z2/p;->e0:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lax/Z2/p;->f0:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    iput v0, p0, Lax/Z2/p;->g0:I

    .line 19
    .line 20
    iput v0, p0, Lax/Z2/p;->h0:I

    .line 21
    .line 22
    iput v0, p0, Lax/Z2/p;->i0:I

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
.end method


# virtual methods
.method public a()Z
    .registers 7

    .line 1
    iget-wide v0, p0, Lax/Z2/p;->q:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmp-long v5, v0, v3

    .line 7
    .line 8
    if-gez v5, :cond_24

    .line 9
    .line 10
    iget-wide v0, p0, Lax/Z2/p;->c0:J

    .line 11
    .line 12
    cmp-long v5, v0, v3

    .line 13
    .line 14
    if-ltz v5, :cond_10

    .line 15
    .line 16
    goto :goto_24

    .line 17
    :cond_10
    iget-wide v0, p0, Lax/Z2/p;->d0:J

    .line 18
    .line 19
    cmp-long v5, v0, v3

    .line 20
    .line 21
    if-gez v5, :cond_24

    .line 22
    .line 23
    iget-wide v0, p0, Lax/Z2/p;->e0:J

    .line 24
    .line 25
    cmp-long v5, v0, v3

    .line 26
    .line 27
    if-ltz v5, :cond_1d

    .line 28
    .line 29
    goto :goto_24

    .line 30
    :cond_1d
    iget-object v0, p0, Lax/Z2/p;->f0:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_22

    .line 33
    .line 34
    return v2

    .line 35
    :cond_22
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_24
    :goto_24
    return v2
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

.method public b()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/Z2/p;->d0:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gez v4, :cond_11

    .line 8
    .line 9
    iget-wide v0, p0, Lax/Z2/p;->e0:J

    .line 10
    .line 11
    cmp-long v4, v0, v2

    .line 12
    .line 13
    if-ltz v4, :cond_f

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x1

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public c()Z
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/Z2/p;->q:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gez v4, :cond_11

    .line 8
    .line 9
    iget-wide v0, p0, Lax/Z2/p;->c0:J

    .line 10
    .line 11
    cmp-long v4, v0, v2

    .line 12
    .line 13
    if-ltz v4, :cond_f

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x1

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public d()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z2/p;->f0:Ljava/lang/String;

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
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public e(Lcom/voxdon/xplorer/file/n;)Z
    .registers 10

    .line 1
    invoke-virtual {p0}, Lax/Z2/p;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_23

    .line 9
    .line 10
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    iget-wide v6, p0, Lax/Z2/p;->q:J

    .line 15
    .line 16
    cmp-long v0, v6, v1

    .line 17
    .line 18
    if-ltz v0, :cond_18

    .line 19
    .line 20
    cmp-long v0, v4, v6

    .line 21
    .line 22
    if-gez v0, :cond_18

    .line 23
    .line 24
    return v3

    .line 25
    :cond_18
    iget-wide v6, p0, Lax/Z2/p;->c0:J

    .line 26
    .line 27
    cmp-long v0, v6, v1

    .line 28
    .line 29
    if-ltz v0, :cond_23

    .line 30
    .line 31
    cmp-long v0, v4, v6

    .line 32
    .line 33
    if-lez v0, :cond_23

    .line 34
    .line 35
    return v3

    .line 36
    :cond_23
    invoke-virtual {p0}, Lax/Z2/p;->b()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4a

    .line 41
    .line 42
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_30

    .line 47
    .line 48
    return v3

    .line 49
    :cond_30
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget-wide v6, p0, Lax/Z2/p;->d0:J

    .line 54
    .line 55
    cmp-long v0, v6, v1

    .line 56
    .line 57
    if-ltz v0, :cond_3f

    .line 58
    .line 59
    cmp-long v0, v4, v6

    .line 60
    .line 61
    if-gez v0, :cond_3f

    .line 62
    .line 63
    return v3

    .line 64
    :cond_3f
    iget-wide v6, p0, Lax/Z2/p;->e0:J

    .line 65
    .line 66
    cmp-long v0, v6, v1

    .line 67
    .line 68
    if-ltz v0, :cond_4a

    .line 69
    .line 70
    cmp-long v0, v4, v6

    .line 71
    .line 72
    if-lez v0, :cond_4a

    .line 73
    .line 74
    return v3

    .line 75
    :cond_4a
    invoke-virtual {p0}, Lax/Z2/p;->d()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_66

    .line 80
    .line 81
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_57

    .line 86
    .line 87
    return v3

    .line 88
    :cond_57
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p0, Lax/Z2/p;->f0:Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v0, :cond_66

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_66

    .line 101
    .line 102
    return v3

    .line 103
    :cond_66
    const/4 p1, 0x1

    .line 104
    return p1
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

.method public f(Lax/Z2/p;)V
    .registers 4

    .line 1
    iget-wide v0, p1, Lax/Z2/p;->q:J

    .line 2
    .line 3
    iput-wide v0, p0, Lax/Z2/p;->q:J

    .line 4
    .line 5
    iget-wide v0, p1, Lax/Z2/p;->c0:J

    .line 6
    .line 7
    iput-wide v0, p0, Lax/Z2/p;->c0:J

    .line 8
    .line 9
    iget-wide v0, p1, Lax/Z2/p;->d0:J

    .line 10
    .line 11
    iput-wide v0, p0, Lax/Z2/p;->d0:J

    .line 12
    .line 13
    iget-wide v0, p1, Lax/Z2/p;->e0:J

    .line 14
    .line 15
    iput-wide v0, p0, Lax/Z2/p;->e0:J

    .line 16
    .line 17
    iget-object v0, p1, Lax/Z2/p;->f0:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Lax/Z2/p;->f0:Ljava/lang/String;

    .line 20
    .line 21
    iget v0, p1, Lax/Z2/p;->g0:I

    .line 22
    .line 23
    iput v0, p0, Lax/Z2/p;->g0:I

    .line 24
    .line 25
    iget v0, p1, Lax/Z2/p;->h0:I

    .line 26
    .line 27
    iput v0, p0, Lax/Z2/p;->h0:I

    .line 28
    .line 29
    iget v0, p1, Lax/Z2/p;->i0:I

    .line 30
    .line 31
    iput v0, p0, Lax/Z2/p;->i0:I

    .line 32
    .line 33
    iget-object v0, p1, Lax/Z2/p;->j0:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v0, p0, Lax/Z2/p;->j0:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, p1, Lax/Z2/p;->k0:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lax/Z2/p;->k0:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p1, p1, Lax/Z2/p;->l0:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p1, p0, Lax/Z2/p;->l0:Ljava/lang/String;

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
.end method
