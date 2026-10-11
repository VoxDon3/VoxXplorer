.class public final Lax/X1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/m;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lax/S0/G;

.field private c:Lax/q1/U;

.field private d:Z

.field private e:J

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/X1/r;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Lax/S0/G;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lax/S0/G;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 14
    .line 15
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lax/X1/r;->e:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public b()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/X1/r;->d:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lax/X1/r;->e:J

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

.method public c(Lax/S0/G;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/X1/r;->c:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/X1/r;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lax/X1/r;->g:I

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    if-ge v1, v2, :cond_71

    .line 20
    .line 21
    rsub-int/lit8 v1, v1, 0xa

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 36
    .line 37
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget v6, p0, Lax/X1/r;->g:I

    .line 42
    .line 43
    invoke-static {v3, v4, v5, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    iget v3, p0, Lax/X1/r;->g:I

    .line 47
    .line 48
    add-int/2addr v3, v1

    .line 49
    if-ne v3, v2, :cond_71

    .line 50
    .line 51
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-virtual {v1, v3}, Lax/S0/G;->b0(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 58
    .line 59
    invoke-virtual {v1}, Lax/S0/G;->M()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/16 v4, 0x49

    .line 64
    .line 65
    if-ne v4, v1, :cond_67

    .line 66
    .line 67
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 68
    .line 69
    invoke-virtual {v1}, Lax/S0/G;->M()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/16 v4, 0x44

    .line 74
    .line 75
    if-ne v4, v1, :cond_67

    .line 76
    .line 77
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 78
    .line 79
    invoke-virtual {v1}, Lax/S0/G;->M()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/16 v4, 0x33

    .line 84
    .line 85
    if-eq v4, v1, :cond_57

    .line 86
    .line 87
    goto :goto_67

    .line 88
    :cond_57
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 89
    .line 90
    const/4 v3, 0x3

    .line 91
    invoke-virtual {v1, v3}, Lax/S0/G;->c0(I)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lax/X1/r;->b:Lax/S0/G;

    .line 95
    .line 96
    invoke-virtual {v1}, Lax/S0/G;->L()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v1, v2

    .line 101
    iput v1, p0, Lax/X1/r;->f:I

    .line 102
    .line 103
    goto :goto_71

    .line 104
    :cond_67
    :goto_67
    const-string p1, "Id3Reader"

    .line 105
    .line 106
    const-string v0, "Discarding invalid ID3 tag"

    .line 107
    .line 108
    invoke-static {p1, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iput-boolean v3, p0, Lax/X1/r;->d:Z

    .line 112
    .line 113
    return-void

    .line 114
    :cond_71
    :goto_71
    iget v1, p0, Lax/X1/r;->f:I

    .line 115
    .line 116
    iget v2, p0, Lax/X1/r;->g:I

    .line 117
    .line 118
    sub-int/2addr v1, v2

    .line 119
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iget-object v1, p0, Lax/X1/r;->c:Lax/q1/U;

    .line 124
    .line 125
    invoke-interface {v1, p1, v0}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 126
    .line 127
    .line 128
    iget p1, p0, Lax/X1/r;->g:I

    .line 129
    .line 130
    add-int/2addr p1, v0

    .line 131
    iput p1, p0, Lax/X1/r;->g:I

    .line 132
    .line 133
    return-void
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

.method public d(Lax/q1/t;Lax/X1/L$d;)V
    .registers 5

    .line 1
    invoke-virtual {p2}, Lax/X1/L$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lax/X1/L$d;->c()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-interface {p1, v0, v1}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lax/X1/r;->c:Lax/q1/U;

    .line 14
    .line 15
    new-instance v0, Lax/P0/v$b;

    .line 16
    .line 17
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lax/X1/L$d;->b()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {v0, p2}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object v0, p0, Lax/X1/r;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v0, "application/id3"

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p1, p2}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public e(Z)V
    .registers 10

    .line 1
    iget-object p1, p0, Lax/X1/r;->c:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lax/X1/r;->d:Z

    .line 7
    .line 8
    if-eqz p1, :cond_32

    .line 9
    .line 10
    iget p1, p0, Lax/X1/r;->f:I

    .line 11
    .line 12
    if-eqz p1, :cond_32

    .line 13
    .line 14
    iget v0, p0, Lax/X1/r;->g:I

    .line 15
    .line 16
    if-eq v0, p1, :cond_12

    .line 17
    .line 18
    goto :goto_32

    .line 19
    :cond_12
    iget-wide v0, p0, Lax/X1/r;->e:J

    .line 20
    .line 21
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    cmp-long v4, v0, v2

    .line 28
    .line 29
    if-eqz v4, :cond_20

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_21

    .line 33
    :cond_20
    const/4 v0, 0x0

    .line 34
    :goto_21
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lax/X1/r;->c:Lax/q1/U;

    .line 38
    .line 39
    iget-wide v2, p0, Lax/X1/r;->e:J

    .line 40
    .line 41
    iget v5, p0, Lax/X1/r;->f:I

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 47
    .line 48
    .line 49
    iput-boolean p1, p0, Lax/X1/r;->d:Z

    .line 50
    .line 51
    :cond_32
    :goto_32
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

.method public f(JI)V
    .registers 4

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-nez p3, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Lax/X1/r;->d:Z

    .line 8
    .line 9
    iput-wide p1, p0, Lax/X1/r;->e:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lax/X1/r;->f:I

    .line 13
    .line 14
    iput p1, p0, Lax/X1/r;->g:I

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
