.class public final Lax/q1/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/N;


# instance fields
.field private final a:Lax/q1/B;

.field private final b:J


# direct methods
.method public constructor <init>(Lax/q1/B;J)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/q1/A;->a:Lax/q1/B;

    .line 5
    .line 6
    iput-wide p2, p0, Lax/q1/A;->b:J

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

.method private a(JJ)Lax/q1/O;
    .registers 7

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    mul-long p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, Lax/q1/A;->a:Lax/q1/B;

    .line 7
    .line 8
    iget v0, v0, Lax/q1/B;->e:I

    .line 9
    .line 10
    int-to-long v0, v0

    .line 11
    div-long/2addr p1, v0

    .line 12
    iget-wide v0, p0, Lax/q1/A;->b:J

    .line 13
    .line 14
    add-long/2addr v0, p3

    .line 15
    new-instance p3, Lax/q1/O;

    .line 16
    .line 17
    invoke-direct {p3, p1, p2, v0, v1}, Lax/q1/O;-><init>(JJ)V

    .line 18
    .line 19
    .line 20
    return-object p3
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
.method public i()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public l(J)Lax/q1/N$a;
    .registers 12

    .line 1
    iget-object v0, p0, Lax/q1/A;->a:Lax/q1/B;

    .line 2
    .line 3
    iget-object v0, v0, Lax/q1/B;->k:Lax/q1/B$a;

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/q1/A;->a:Lax/q1/B;

    .line 9
    .line 10
    iget-object v1, v0, Lax/q1/B;->k:Lax/q1/B$a;

    .line 11
    .line 12
    iget-object v2, v1, Lax/q1/B$a;->a:[J

    .line 13
    .line 14
    iget-object v1, v1, Lax/q1/B$a;->b:[J

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lax/q1/B;->i(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-static {v2, v3, v4, v5, v0}, Lax/S0/d0;->h([JJZZ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    const/4 v6, -0x1

    .line 29
    if-ne v0, v6, :cond_20

    .line 30
    .line 31
    move-wide v7, v3

    .line 32
    goto :goto_22

    .line 33
    :cond_20
    aget-wide v7, v2, v0

    .line 34
    .line 35
    :goto_22
    if-ne v0, v6, :cond_25

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    aget-wide v3, v1, v0

    .line 39
    .line 40
    :goto_27
    invoke-direct {p0, v7, v8, v3, v4}, Lax/q1/A;->a(JJ)Lax/q1/O;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-wide v6, v3, Lax/q1/O;->a:J

    .line 45
    .line 46
    cmp-long v4, v6, p1

    .line 47
    .line 48
    if-eqz v4, :cond_45

    .line 49
    .line 50
    array-length p1, v2

    .line 51
    sub-int/2addr p1, v5

    .line 52
    if-ne v0, p1, :cond_36

    .line 53
    .line 54
    goto :goto_45

    .line 55
    :cond_36
    add-int/2addr v0, v5

    .line 56
    aget-wide p1, v2, v0

    .line 57
    .line 58
    aget-wide v0, v1, v0

    .line 59
    .line 60
    invoke-direct {p0, p1, p2, v0, v1}, Lax/q1/A;->a(JJ)Lax/q1/O;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Lax/q1/N$a;

    .line 65
    .line 66
    invoke-direct {p2, v3, p1}, Lax/q1/N$a;-><init>(Lax/q1/O;Lax/q1/O;)V

    .line 67
    .line 68
    .line 69
    return-object p2

    .line 70
    :cond_45
    :goto_45
    new-instance p1, Lax/q1/N$a;

    .line 71
    .line 72
    invoke-direct {p1, v3}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 73
    .line 74
    .line 75
    return-object p1
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

.method public n()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/q1/A;->a:Lax/q1/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/q1/B;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
