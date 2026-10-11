.class final Lax/i1/f$c;
.super Lax/i1/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:Z


# direct methods
.method public constructor <init>(Lax/P0/N;JJZ)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/i1/f$d;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/i1/w;-><init>(Lax/P0/N;)V

    .line 2
    .line 3
    .line 4
    const-wide/high16 v0, -0x8000000000000000L

    .line 5
    .line 6
    cmp-long v2, p4, v0

    .line 7
    .line 8
    if-eqz v2, :cond_d

    .line 9
    .line 10
    cmp-long v0, p4, p2

    .line 11
    .line 12
    if-ltz v0, :cond_10

    .line 13
    .line 14
    :cond_d
    move-wide v0, p4

    .line 15
    move-wide p3, p2

    .line 16
    goto :goto_19

    .line 17
    :cond_10
    new-instance p1, Lax/i1/f$d;

    .line 18
    .line 19
    move-wide p5, p4

    .line 20
    move-wide p3, p2

    .line 21
    const/4 p2, 0x2

    .line 22
    invoke-direct/range {p1 .. p6}, Lax/i1/f$d;-><init>(IJJ)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :goto_19
    invoke-virtual {p1}, Lax/P0/N;->i()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 p5, 0x0

    .line 31
    const/4 v3, 0x1

    .line 32
    if-ne p2, v3, :cond_83

    .line 33
    .line 34
    new-instance p2, Lax/P0/N$c;

    .line 35
    .line 36
    invoke-direct {p2}, Lax/P0/N$c;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p5, p2}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    invoke-static {v4, v5, p3, p4}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    if-nez p6, :cond_45

    .line 50
    .line 51
    iget-boolean p4, p1, Lax/P0/N$c;->k:Z

    .line 52
    .line 53
    if-nez p4, :cond_45

    .line 54
    .line 55
    cmp-long p4, p2, v4

    .line 56
    .line 57
    if-eqz p4, :cond_45

    .line 58
    .line 59
    iget-boolean p4, p1, Lax/P0/N$c;->h:Z

    .line 60
    .line 61
    if-eqz p4, :cond_3f

    .line 62
    .line 63
    goto :goto_45

    .line 64
    :cond_3f
    new-instance p1, Lax/i1/f$d;

    .line 65
    .line 66
    invoke-direct {p1, v3}, Lax/i1/f$d;-><init>(I)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_45
    :goto_45
    if-nez v2, :cond_4a

    .line 71
    .line 72
    iget-wide v0, p1, Lax/P0/N$c;->m:J

    .line 73
    .line 74
    goto :goto_4e

    .line 75
    :cond_4a
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    :goto_4e
    iget-wide v4, p1, Lax/P0/N$c;->m:J

    .line 80
    .line 81
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    cmp-long p4, v4, v6

    .line 87
    .line 88
    if-eqz p4, :cond_63

    .line 89
    .line 90
    cmp-long p4, v0, v4

    .line 91
    .line 92
    if-lez p4, :cond_5e

    .line 93
    .line 94
    move-wide v0, v4

    .line 95
    :cond_5e
    cmp-long p4, p2, v0

    .line 96
    .line 97
    if-lez p4, :cond_63

    .line 98
    .line 99
    move-wide p2, v0

    .line 100
    :cond_63
    iput-wide p2, p0, Lax/i1/f$c;->f:J

    .line 101
    .line 102
    iput-wide v0, p0, Lax/i1/f$c;->g:J

    .line 103
    .line 104
    cmp-long p4, v0, v6

    .line 105
    .line 106
    if-nez p4, :cond_6d

    .line 107
    .line 108
    move-wide p2, v6

    .line 109
    goto :goto_6f

    .line 110
    :cond_6d
    sub-long p2, v0, p2

    .line 111
    .line 112
    :goto_6f
    iput-wide p2, p0, Lax/i1/f$c;->h:J

    .line 113
    .line 114
    iget-boolean p1, p1, Lax/P0/N$c;->i:Z

    .line 115
    .line 116
    if-eqz p1, :cond_80

    .line 117
    .line 118
    if-eqz p4, :cond_7f

    .line 119
    .line 120
    cmp-long p1, v4, v6

    .line 121
    .line 122
    if-eqz p1, :cond_80

    .line 123
    .line 124
    cmp-long p1, v0, v4

    .line 125
    .line 126
    if-nez p1, :cond_80

    .line 127
    .line 128
    :cond_7f
    const/4 p5, 0x1

    .line 129
    :cond_80
    iput-boolean p5, p0, Lax/i1/f$c;->i:Z

    .line 130
    .line 131
    return-void

    .line 132
    :cond_83
    new-instance p1, Lax/i1/f$d;

    .line 133
    .line 134
    invoke-direct {p1, p5}, Lax/i1/f$d;-><init>(I)V

    .line 135
    .line 136
    .line 137
    throw p1
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


# virtual methods
.method public g(ILax/P0/N$b;Z)Lax/P0/N$b;
    .registers 16

    .line 1
    iget-object p1, p0, Lax/i1/w;->e:Lax/P0/N;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, p2, p3}, Lax/P0/N;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lax/P0/N$b;->o()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lax/i1/f$c;->f:J

    .line 12
    .line 13
    sub-long v10, v0, v2

    .line 14
    .line 15
    iget-wide v0, p0, Lax/i1/f$c;->h:J

    .line 16
    .line 17
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p1, v0, v2

    .line 23
    .line 24
    if-nez p1, :cond_1b

    .line 25
    .line 26
    :goto_19
    move-wide v8, v2

    .line 27
    goto :goto_1e

    .line 28
    :cond_1b
    sub-long v2, v0, v10

    .line 29
    .line 30
    goto :goto_19

    .line 31
    :goto_1e
    iget-object v5, p2, Lax/P0/N$b;->a:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v6, p2, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v4, p2

    .line 37
    invoke-virtual/range {v4 .. v11}, Lax/P0/N$b;->t(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lax/P0/N$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
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
    iget-object p1, p0, Lax/i1/w;->e:Lax/P0/N;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    invoke-virtual {p1, p3, p2, v0, v1}, Lax/P0/N;->o(ILax/P0/N$c;J)Lax/P0/N$c;

    .line 7
    .line 8
    .line 9
    iget-wide p3, p2, Lax/P0/N$c;->p:J

    .line 10
    .line 11
    iget-wide v0, p0, Lax/i1/f$c;->f:J

    .line 12
    .line 13
    add-long/2addr p3, v0

    .line 14
    iput-wide p3, p2, Lax/P0/N$c;->p:J

    .line 15
    .line 16
    iget-wide p3, p0, Lax/i1/f$c;->h:J

    .line 17
    .line 18
    iput-wide p3, p2, Lax/P0/N$c;->m:J

    .line 19
    .line 20
    iget-boolean p1, p0, Lax/i1/f$c;->i:Z

    .line 21
    .line 22
    iput-boolean p1, p2, Lax/P0/N$c;->i:Z

    .line 23
    .line 24
    iget-wide p3, p2, Lax/P0/N$c;->l:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long p1, p3, v2

    .line 32
    .line 33
    if-eqz p1, :cond_38

    .line 34
    .line 35
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iput-wide p3, p2, Lax/P0/N$c;->l:J

    .line 40
    .line 41
    iget-wide v0, p0, Lax/i1/f$c;->g:J

    .line 42
    .line 43
    cmp-long p1, v0, v2

    .line 44
    .line 45
    if-nez p1, :cond_2f

    .line 46
    .line 47
    goto :goto_33

    .line 48
    :cond_2f
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :goto_33
    iget-wide v0, p0, Lax/i1/f$c;->f:J

    .line 53
    .line 54
    sub-long/2addr p3, v0

    .line 55
    iput-wide p3, p2, Lax/P0/N$c;->l:J

    .line 56
    .line 57
    :cond_38
    iget-wide p3, p0, Lax/i1/f$c;->f:J

    .line 58
    .line 59
    invoke-static {p3, p4}, Lax/S0/d0;->E1(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p3

    .line 63
    iget-wide v0, p2, Lax/P0/N$c;->e:J

    .line 64
    .line 65
    cmp-long p1, v0, v2

    .line 66
    .line 67
    if-eqz p1, :cond_47

    .line 68
    .line 69
    add-long/2addr v0, p3

    .line 70
    iput-wide v0, p2, Lax/P0/N$c;->e:J

    .line 71
    .line 72
    :cond_47
    iget-wide v0, p2, Lax/P0/N$c;->f:J

    .line 73
    .line 74
    cmp-long p1, v0, v2

    .line 75
    .line 76
    if-eqz p1, :cond_50

    .line 77
    .line 78
    add-long/2addr v0, p3

    .line 79
    iput-wide v0, p2, Lax/P0/N$c;->f:J

    .line 80
    .line 81
    :cond_50
    return-object p2
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
