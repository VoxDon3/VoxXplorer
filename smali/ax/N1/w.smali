.class final Lax/N1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/U;


# instance fields
.field private final a:Lax/q1/U;

.field private final b:Lax/N1/t$a;

.field private final c:Lax/N1/d;

.field private final d:Lax/S0/G;

.field private e:I

.field private f:I

.field private g:[B

.field private h:Lax/N1/t;

.field private i:Lax/P0/v;

.field private j:Z


# direct methods
.method public constructor <init>(Lax/q1/U;Lax/N1/t$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 5
    .line 6
    iput-object p2, p0, Lax/N1/w;->b:Lax/N1/t$a;

    .line 7
    .line 8
    new-instance p1, Lax/N1/d;

    .line 9
    .line 10
    invoke-direct {p1}, Lax/N1/d;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/N1/w;->c:Lax/N1/d;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lax/N1/w;->e:I

    .line 17
    .line 18
    iput p1, p0, Lax/N1/w;->f:I

    .line 19
    .line 20
    sget-object p1, Lax/S0/d0;->f:[B

    .line 21
    .line 22
    iput-object p1, p0, Lax/N1/w;->g:[B

    .line 23
    .line 24
    new-instance p1, Lax/S0/G;

    .line 25
    .line 26
    invoke-direct {p1}, Lax/S0/G;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lax/N1/w;->d:Lax/S0/G;

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

.method public static synthetic h(Lax/N1/w;JILax/N1/e;)V
    .registers 5

    .line 1
    invoke-direct {p0, p4, p1, p2, p3}, Lax/N1/w;->j(Lax/N1/e;JI)V

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

.method private i(I)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/N1/w;->g:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lax/N1/w;->f:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-lt v0, p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget v0, p0, Lax/N1/w;->e:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    mul-int/lit8 v0, v1, 0x2

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lax/N1/w;->g:[B

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    if-gt p1, v2, :cond_1a

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    new-array p1, p1, [B

    .line 28
    .line 29
    :goto_1c
    iget v2, p0, Lax/N1/w;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput v3, p0, Lax/N1/w;->e:I

    .line 36
    .line 37
    iput v1, p0, Lax/N1/w;->f:I

    .line 38
    .line 39
    iput-object p1, p0, Lax/N1/w;->g:[B

    .line 40
    .line 41
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

.method private j(Lax/N1/e;JI)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/N1/w;->i:Lax/P0/v;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/N1/w;->c:Lax/N1/d;

    .line 7
    .line 8
    iget-object v1, p1, Lax/N1/e;->a:Lax/r7/z;

    .line 9
    .line 10
    iget-wide v2, p1, Lax/N1/e;->c:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lax/N1/d;->a(Ljava/util/List;J)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lax/N1/w;->d:Lax/S0/G;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lax/S0/G;->Y([B)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 22
    .line 23
    iget-object v2, p0, Lax/N1/w;->d:Lax/S0/G;

    .line 24
    .line 25
    array-length v3, v0

    .line 26
    invoke-interface {v1, v2, v3}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 27
    .line 28
    .line 29
    iget-wide v1, p1, Lax/N1/e;->b:J

    .line 30
    .line 31
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    const-wide v5, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v7, v1, v3

    .line 43
    .line 44
    if-nez v7, :cond_3d

    .line 45
    .line 46
    iget-object v1, p0, Lax/N1/w;->i:Lax/P0/v;

    .line 47
    .line 48
    iget-wide v1, v1, Lax/P0/v;->t:J

    .line 49
    .line 50
    cmp-long v3, v1, v5

    .line 51
    .line 52
    if-nez v3, :cond_37

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    const/4 v1, 0x0

    .line 57
    :goto_38
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 58
    .line 59
    .line 60
    :goto_3b
    move-wide v2, p2

    .line 61
    goto :goto_4a

    .line 62
    :cond_3d
    iget-object v3, p0, Lax/N1/w;->i:Lax/P0/v;

    .line 63
    .line 64
    iget-wide v3, v3, Lax/P0/v;->t:J

    .line 65
    .line 66
    cmp-long v7, v3, v5

    .line 67
    .line 68
    if-nez v7, :cond_47

    .line 69
    .line 70
    add-long/2addr p2, v1

    .line 71
    goto :goto_3b

    .line 72
    :cond_47
    add-long p2, v1, v3

    .line 73
    .line 74
    goto :goto_3b

    .line 75
    :goto_4a
    iget-object v1, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 76
    .line 77
    or-int/lit8 v4, p4, 0x1

    .line 78
    .line 79
    array-length v5, v0

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 83
    .line 84
    .line 85
    return-void
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public synthetic a(Lax/P0/k;IZ)I
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/q1/T;->b(Lax/q1/U;Lax/P0/k;IZ)I

    move-result p1

    return p1
.end method

.method public b(Lax/S0/G;II)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-direct {p0, p2}, Lax/N1/w;->i(I)V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Lax/N1/w;->g:[B

    .line 15
    .line 16
    iget v0, p0, Lax/N1/w;->f:I

    .line 17
    .line 18
    invoke-virtual {p1, p3, v0, p2}, Lax/S0/G;->q([BII)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lax/N1/w;->f:I

    .line 22
    .line 23
    add-int/2addr p1, p2

    .line 24
    iput p1, p0, Lax/N1/w;->f:I

    .line 25
    .line 26
    return-void
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

.method public c(Lax/P0/k;IZI)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3, p4}, Lax/q1/U;->c(Lax/P0/k;IZI)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_b
    invoke-direct {p0, p2}, Lax/N1/w;->i(I)V

    .line 13
    .line 14
    .line 15
    iget-object p4, p0, Lax/N1/w;->g:[B

    .line 16
    .line 17
    iget v0, p0, Lax/N1/w;->f:I

    .line 18
    .line 19
    invoke-interface {p1, p4, v0, p2}, Lax/P0/k;->c([BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 p2, -0x1

    .line 24
    if-ne p1, p2, :cond_22

    .line 25
    .line 26
    if-eqz p3, :cond_1c

    .line 27
    .line 28
    return p2

    .line 29
    :cond_1c
    new-instance p1, Ljava/io/EOFException;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_22
    iget p2, p0, Lax/N1/w;->f:I

    .line 36
    .line 37
    add-int/2addr p2, p1

    .line 38
    iput p2, p0, Lax/N1/w;->f:I

    .line 39
    .line 40
    return p1
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

.method public synthetic d(J)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/q1/T;->a(Lax/q1/U;J)V

    return-void
.end method

.method public e(Lax/P0/v;)V
    .registers 6

    .line 1
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne v0, v1, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    :goto_11
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/N1/w;->i:Lax/P0/v;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lax/P0/v;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_30

    .line 28
    .line 29
    iput-object p1, p0, Lax/N1/w;->i:Lax/P0/v;

    .line 30
    .line 31
    iget-object v0, p0, Lax/N1/w;->b:Lax/N1/t$a;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lax/N1/t$a;->b(Lax/P0/v;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2d

    .line 38
    .line 39
    iget-object v0, p0, Lax/N1/w;->b:Lax/N1/t$a;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Lax/N1/t$a;->c(Lax/P0/v;)Lax/N1/t;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    const/4 v0, 0x0

    .line 47
    :goto_2e
    iput-object v0, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 48
    .line 49
    :cond_30
    iget-object v0, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 50
    .line 51
    if-nez v0, :cond_3a

    .line 52
    .line 53
    iget-object v0, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object v0, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 60
    .line 61
    invoke-virtual {p1}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "application/x-media3-cues"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v2, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-wide v2, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2, v3}, Lax/P0/v$b;->C0(J)Lax/P0/v$b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v2, p0, Lax/N1/w;->b:Lax/N1/t$a;

    .line 87
    .line 88
    invoke-interface {v2, p1}, Lax/N1/t$a;->a(Lax/P0/v;)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {v1, p1}, Lax/P0/v$b;->Y(I)Lax/P0/v$b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {v0, p1}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 101
    .line 102
    .line 103
    return-void
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

.method public f(JIIILax/q1/U$a;)V
    .registers 15

    .line 1
    iget-object v0, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    iget-object v1, p0, Lax/N1/w;->a:Lax/q1/U;

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    move v4, p3

    .line 9
    move v5, p4

    .line 10
    move v6, p5

    .line 11
    move-object v7, p6

    .line 12
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    move-wide v2, p1

    .line 17
    move v4, p3

    .line 18
    move v6, p5

    .line 19
    move-object v7, p6

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v7, :cond_18

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    :goto_19
    const-string p2, "DRM on subtitles is not supported"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget p1, p0, Lax/N1/w;->f:I

    .line 32
    .line 33
    sub-int/2addr p1, v6

    .line 34
    sub-int p3, p1, p4

    .line 35
    .line 36
    :try_start_23
    iget-object p1, p0, Lax/N1/w;->h:Lax/N1/t;

    .line 37
    .line 38
    iget-object p2, p0, Lax/N1/w;->g:[B

    .line 39
    .line 40
    invoke-static {}, Lax/N1/t$b;->b()Lax/N1/t$b;

    .line 41
    .line 42
    .line 43
    move-result-object p5

    .line 44
    new-instance p6, Lax/N1/v;

    .line 45
    .line 46
    invoke-direct {p6, p0, v2, v3, v4}, Lax/N1/v;-><init>(Lax/N1/w;JI)V

    .line 47
    .line 48
    .line 49
    invoke-interface/range {p1 .. p6}, Lax/N1/t;->c([BIILax/N1/t$b;Lax/S0/l;)V
    :try_end_33
    .catch Ljava/lang/RuntimeException; {:try_start_23 .. :try_end_33} :catch_34

    .line 50
    .line 51
    .line 52
    goto :goto_41

    .line 53
    :catch_34
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    iget-boolean p2, p0, Lax/N1/w;->j:Z

    .line 56
    .line 57
    if-eqz p2, :cond_4d

    .line 58
    .line 59
    const-string p2, "SubtitleTranscodingTO"

    .line 60
    .line 61
    const-string p5, "Parsing subtitles failed, ignoring sample."

    .line 62
    .line 63
    invoke-static {p2, p5, p1}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_41
    add-int/2addr p3, p4

    .line 67
    iput p3, p0, Lax/N1/w;->e:I

    .line 68
    .line 69
    iget p1, p0, Lax/N1/w;->f:I

    .line 70
    .line 71
    if-ne p3, p1, :cond_4c

    .line 72
    .line 73
    iput v1, p0, Lax/N1/w;->e:I

    .line 74
    .line 75
    iput v1, p0, Lax/N1/w;->f:I

    .line 76
    .line 77
    :cond_4c
    return-void

    .line 78
    :cond_4d
    throw p1
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

.method public synthetic g(Lax/S0/G;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/q1/T;->c(Lax/q1/U;Lax/S0/G;I)V

    return-void
.end method

.method public k(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/N1/w;->j:Z

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
