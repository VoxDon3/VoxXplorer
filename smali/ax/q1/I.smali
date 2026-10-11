.class public final Lax/q1/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/N;


# instance fields
.field private final a:Lax/S0/v;

.field private final b:Lax/S0/v;

.field private c:J


# direct methods
.method public constructor <init>([J[JJ)V
    .registers 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    array-length v1, p2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :goto_c
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 14
    .line 15
    .line 16
    array-length v0, p2

    .line 17
    if-lez v0, :cond_30

    .line 18
    .line 19
    aget-wide v1, p2, v2

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v6, v1, v4

    .line 24
    .line 25
    if-lez v6, :cond_30

    .line 26
    .line 27
    new-instance v1, Lax/S0/v;

    .line 28
    .line 29
    add-int/2addr v0, v3

    .line 30
    invoke-direct {v1, v0}, Lax/S0/v;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 34
    .line 35
    new-instance v2, Lax/S0/v;

    .line 36
    .line 37
    invoke-direct {v2, v0}, Lax/S0/v;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 41
    .line 42
    invoke-virtual {v1, v4, v5}, Lax/S0/v;->a(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v4, v5}, Lax/S0/v;->a(J)V

    .line 46
    .line 47
    .line 48
    goto :goto_3e

    .line 49
    :cond_30
    new-instance v1, Lax/S0/v;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lax/S0/v;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 55
    .line 56
    new-instance v1, Lax/S0/v;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Lax/S0/v;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 62
    .line 63
    :goto_3e
    iget-object v0, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lax/S0/v;->b([J)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lax/S0/v;->b([J)V

    .line 71
    .line 72
    .line 73
    iput-wide p3, p0, Lax/q1/I;->c:J

    .line 74
    .line 75
    return-void
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


# virtual methods
.method public a(JJ)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_18

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v2, p1, v0

    .line 12
    .line 13
    if-lez v2, :cond_18

    .line 14
    .line 15
    iget-object v2, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Lax/S0/v;->a(J)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Lax/S0/v;->a(J)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 26
    .line 27
    invoke-virtual {v0, p3, p4}, Lax/S0/v;->a(J)V

    .line 28
    .line 29
    .line 30
    iget-object p3, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 31
    .line 32
    invoke-virtual {p3, p1, p2}, Lax/S0/v;->a(J)V

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

.method public b(JJ)Z
    .registers 11

    .line 1
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    sub-int/2addr v2, v3

    .line 19
    invoke-virtual {v0, v2}, Lax/S0/v;->c(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sub-long/2addr p1, v4

    .line 24
    cmp-long v0, p1, p3

    .line 25
    .line 26
    if-gez v0, :cond_1c

    .line 27
    .line 28
    return v3

    .line 29
    :cond_1c
    return v1
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

.method public c(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/q1/I;->c:J

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

.method public i()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public j(J)J
    .registers 5

    .line 1
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_e
    iget-object v0, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, p1, p2, v1, v1}, Lax/S0/d0;->e(Lax/S0/v;JZZ)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lax/S0/v;->c(I)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
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

.method public l(J)Lax/q1/N$a;
    .registers 10

    .line 1
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_10

    .line 8
    .line 9
    new-instance p1, Lax/q1/N$a;

    .line 10
    .line 11
    sget-object p2, Lax/q1/O;->c:Lax/q1/O;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_10
    iget-object v0, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v0, p1, p2, v1, v1}, Lax/S0/d0;->e(Lax/S0/v;JZZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v2, Lax/q1/O;

    .line 25
    .line 26
    iget-object v3, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 27
    .line 28
    invoke-virtual {v3, v0}, Lax/S0/v;->c(I)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    iget-object v5, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 33
    .line 34
    invoke-virtual {v5, v0}, Lax/S0/v;->c(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-direct {v2, v3, v4, v5, v6}, Lax/q1/O;-><init>(JJ)V

    .line 39
    .line 40
    .line 41
    iget-wide v3, v2, Lax/q1/O;->a:J

    .line 42
    .line 43
    cmp-long v5, v3, p1

    .line 44
    .line 45
    if-eqz v5, :cond_50

    .line 46
    .line 47
    iget-object p1, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 48
    .line 49
    invoke-virtual {p1}, Lax/S0/v;->d()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int/2addr p1, v1

    .line 54
    if-ne v0, p1, :cond_38

    .line 55
    .line 56
    goto :goto_50

    .line 57
    :cond_38
    new-instance p1, Lax/q1/O;

    .line 58
    .line 59
    iget-object p2, p0, Lax/q1/I;->b:Lax/S0/v;

    .line 60
    .line 61
    add-int/2addr v0, v1

    .line 62
    invoke-virtual {p2, v0}, Lax/S0/v;->c(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    iget-object p2, p0, Lax/q1/I;->a:Lax/S0/v;

    .line 67
    .line 68
    invoke-virtual {p2, v0}, Lax/S0/v;->c(I)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-direct {p1, v3, v4, v0, v1}, Lax/q1/O;-><init>(JJ)V

    .line 73
    .line 74
    .line 75
    new-instance p2, Lax/q1/N$a;

    .line 76
    .line 77
    invoke-direct {p2, v2, p1}, Lax/q1/N$a;-><init>(Lax/q1/O;Lax/q1/O;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_50
    :goto_50
    new-instance p1, Lax/q1/N$a;

    .line 82
    .line 83
    invoke-direct {p1, v2}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 84
    .line 85
    .line 86
    return-object p1
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

.method public n()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/q1/I;->c:J

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
.end method
