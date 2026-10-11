.class final Lax/i1/S$b;
.super Lax/i1/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final f:[J

.field private final g:[J


# direct methods
.method public constructor <init>(Lax/P0/N;Ljava/util/Map;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/N;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/i1/w;-><init>(Lax/P0/N;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lax/P0/N;->p()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lax/P0/N;->p()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    new-array v1, v1, [J

    .line 13
    .line 14
    iput-object v1, p0, Lax/i1/S$b;->g:[J

    .line 15
    .line 16
    new-instance v1, Lax/P0/N$c;

    .line 17
    .line 18
    invoke-direct {v1}, Lax/P0/N$c;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_16
    if-ge v3, v0, :cond_25

    .line 24
    .line 25
    iget-object v4, p0, Lax/i1/S$b;->g:[J

    .line 26
    .line 27
    invoke-virtual {p1, v3, v1}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-wide v5, v5, Lax/P0/N$c;->m:J

    .line 32
    .line 33
    aput-wide v5, v4, v3

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_16

    .line 38
    :cond_25
    invoke-virtual {p1}, Lax/P0/N;->i()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    new-array v1, v0, [J

    .line 43
    .line 44
    iput-object v1, p0, Lax/i1/S$b;->f:[J

    .line 45
    .line 46
    new-instance v1, Lax/P0/N$b;

    .line 47
    .line 48
    invoke-direct {v1}, Lax/P0/N$b;-><init>()V

    .line 49
    .line 50
    .line 51
    :goto_32
    if-ge v2, v0, :cond_6f

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-virtual {p1, v2, v1, v3}, Lax/P0/N;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 55
    .line 56
    .line 57
    iget-object v3, v1, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/Long;

    .line 64
    .line 65
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    iget-object v5, p0, Lax/i1/S$b;->f:[J

    .line 76
    .line 77
    const-wide/high16 v6, -0x8000000000000000L

    .line 78
    .line 79
    cmp-long v8, v3, v6

    .line 80
    .line 81
    if-eqz v8, :cond_53

    .line 82
    .line 83
    goto :goto_55

    .line 84
    :cond_53
    iget-wide v3, v1, Lax/P0/N$b;->d:J

    .line 85
    .line 86
    :goto_55
    aput-wide v3, v5, v2

    .line 87
    .line 88
    iget-wide v5, v1, Lax/P0/N$b;->d:J

    .line 89
    .line 90
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    cmp-long v9, v5, v7

    .line 96
    .line 97
    if-eqz v9, :cond_6c

    .line 98
    .line 99
    iget-object v7, p0, Lax/i1/S$b;->g:[J

    .line 100
    .line 101
    iget v8, v1, Lax/P0/N$b;->c:I

    .line 102
    .line 103
    aget-wide v9, v7, v8

    .line 104
    .line 105
    sub-long/2addr v5, v3

    .line 106
    sub-long/2addr v9, v5

    .line 107
    aput-wide v9, v7, v8

    .line 108
    .line 109
    :cond_6c
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_32

    .line 112
    :cond_6f
    return-void
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
.method public g(ILax/P0/N$b;Z)Lax/P0/N$b;
    .registers 6

    .line 1
    invoke-super {p0, p1, p2, p3}, Lax/i1/w;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lax/i1/S$b;->f:[J

    .line 5
    .line 6
    aget-wide v0, p3, p1

    .line 7
    .line 8
    iput-wide v0, p2, Lax/P0/N$b;->d:J

    .line 9
    .line 10
    return-object p2
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

.method public o(ILax/P0/N$c;J)Lax/P0/N$c;
    .registers 9

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lax/i1/w;->o(ILax/P0/N$c;J)Lax/P0/N$c;

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lax/i1/S$b;->g:[J

    .line 5
    .line 6
    aget-wide v0, p3, p1

    .line 7
    .line 8
    iput-wide v0, p2, Lax/P0/N$c;->m:J

    .line 9
    .line 10
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long p1, v0, p3

    .line 16
    .line 17
    if-eqz p1, :cond_1e

    .line 18
    .line 19
    iget-wide v2, p2, Lax/P0/N$c;->l:J

    .line 20
    .line 21
    cmp-long p1, v2, p3

    .line 22
    .line 23
    if-nez p1, :cond_19

    .line 24
    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p3

    .line 30
    goto :goto_20

    .line 31
    :cond_1e
    :goto_1e
    iget-wide p3, p2, Lax/P0/N$c;->l:J

    .line 32
    .line 33
    :goto_20
    iput-wide p3, p2, Lax/P0/N$c;->l:J

    .line 34
    .line 35
    return-object p2
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
