.class public Lax/W4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lax/W4/d;

.field protected final b:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field protected c:Lax/T4/d;

.field protected final d:Z

.field protected final e:Lax/b5/a;

.field protected final f:Lax/T4/r;

.field protected g:[B

.field protected h:[B

.field protected i:[C

.field protected j:[C

.field protected k:[C


# direct methods
.method public constructor <init>(Lax/T4/r;Lax/b5/a;Lax/W4/d;Z)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_9

    .line 5
    .line 6
    invoke-static {}, Lax/T4/r;->a()Lax/T4/r;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_9
    iput-object p1, p0, Lax/W4/e;->f:Lax/T4/r;

    .line 11
    .line 12
    iput-object p2, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 13
    .line 14
    iput-object p3, p0, Lax/W4/e;->a:Lax/W4/d;

    .line 15
    .line 16
    invoke-virtual {p3}, Lax/W4/d;->l()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lax/W4/e;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iput-boolean p4, p0, Lax/W4/e;->d:Z

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

.method private t()Ljava/lang/IllegalArgumentException;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string v1, "Trying to release buffer smaller than original"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method protected final a(Ljava/lang/Object;)V
    .registers 3

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v0, "Trying to call same allocXxx() method second time"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
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

.method protected final b([B[B)V
    .registers 3

    .line 1
    if-eq p1, p2, :cond_c

    .line 2
    .line 3
    array-length p1, p1

    .line 4
    array-length p2, p2

    .line 5
    if-lt p1, p2, :cond_7

    .line 6
    .line 7
    goto :goto_c

    .line 8
    :cond_7
    invoke-direct {p0}, Lax/W4/e;->t()Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    throw p1

    .line 13
    :cond_c
    :goto_c
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

.method protected final c([C[C)V
    .registers 3

    .line 1
    if-eq p1, p2, :cond_c

    .line 2
    .line 3
    array-length p1, p1

    .line 4
    array-length p2, p2

    .line 5
    if-lt p1, p2, :cond_7

    .line 6
    .line 7
    goto :goto_c

    .line 8
    :cond_7
    invoke-direct {p0}, Lax/W4/e;->t()Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    throw p1

    .line 13
    :cond_c
    :goto_c
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

.method public d()[C
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W4/e;->j:[C

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W4/e;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Lax/b5/a;->c(I)[C

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/W4/e;->j:[C

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e()[B
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W4/e;->g:[B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W4/e;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lax/b5/a;->a(I)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/W4/e;->g:[B

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f()[C
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W4/e;->i:[C

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W4/e;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lax/b5/a;->c(I)[C

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/W4/e;->i:[C

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public g(I)[C
    .registers 4

    .line 1
    iget-object v0, p0, Lax/W4/e;->i:[C

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W4/e;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->d(II)[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lax/W4/e;->i:[C

    .line 14
    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public h()[B
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W4/e;->h:[B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W4/e;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Lax/b5/a;->a(I)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/W4/e;->h:[B

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i()Lax/b5/l;
    .registers 4

    .line 1
    new-instance v0, Lax/b5/i;

    .line 2
    .line 3
    iget-object v1, p0, Lax/W4/e;->f:Lax/T4/r;

    .line 4
    .line 5
    iget-object v2, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lax/b5/i;-><init>(Lax/T4/r;Lax/b5/a;)V

    .line 8
    .line 9
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

.method public j()Lax/W4/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W4/e;->a:Lax/W4/d;

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

.method public k()Lax/T4/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W4/e;->c:Lax/T4/d;

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

.method public l()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/W4/e;->d:Z

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

.method public m([C)V
    .registers 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-object v0, p0, Lax/W4/e;->j:[C

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lax/W4/e;->c([C[C)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/W4/e;->j:[C

    .line 10
    .line 11
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->j(I[C)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public n([C)V
    .registers 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-object v0, p0, Lax/W4/e;->k:[C

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lax/W4/e;->c([C[C)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/W4/e;->k:[C

    .line 10
    .line 11
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->j(I[C)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public o([B)V
    .registers 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-object v0, p0, Lax/W4/e;->g:[B

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lax/W4/e;->b([B[B)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/W4/e;->g:[B

    .line 10
    .line 11
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->i(I[B)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public p([C)V
    .registers 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-object v0, p0, Lax/W4/e;->i:[C

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lax/W4/e;->c([C[C)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/W4/e;->i:[C

    .line 10
    .line 11
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->j(I[C)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public q([B)V
    .registers 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-object v0, p0, Lax/W4/e;->h:[B

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lax/W4/e;->b([B[B)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/W4/e;->h:[B

    .line 10
    .line 11
    iget-object v0, p0, Lax/W4/e;->e:Lax/b5/a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1, p1}, Lax/b5/a;->i(I[B)V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public r(Lax/T4/d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W4/e;->c:Lax/T4/d;

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

.method public s()Lax/T4/r;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W4/e;->f:Lax/T4/r;

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
