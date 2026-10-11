.class public final Lax/X1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/D;


# instance fields
.field private a:Lax/P0/v;

.field private b:Lax/S0/M;

.field private c:Lax/q1/U;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P0/v$b;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2, p1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lax/X1/x;->a:Lax/P0/v;

    .line 22
    .line 23
    return-void
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

.method private b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X1/x;->b:Lax/S0/M;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/X1/x;->c:Lax/q1/U;

    .line 7
    .line 8
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
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


# virtual methods
.method public a(Lax/S0/M;Lax/q1/t;Lax/X1/L$d;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/X1/x;->b:Lax/S0/M;

    .line 2
    .line 3
    invoke-virtual {p3}, Lax/X1/L$d;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lax/X1/L$d;->c()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p3, 0x5

    .line 11
    invoke-interface {p2, p1, p3}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lax/X1/x;->c:Lax/q1/U;

    .line 16
    .line 17
    iget-object p2, p0, Lax/X1/x;->a:Lax/P0/v;

    .line 18
    .line 19
    invoke-interface {p1, p2}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public c(Lax/S0/G;)V
    .registers 10

    .line 1
    invoke-direct {p0}, Lax/X1/x;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/X1/x;->b:Lax/S0/M;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/S0/M;->e()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    iget-object v0, p0, Lax/X1/x;->b:Lax/S0/M;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/S0/M;->f()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v6, v2, v4

    .line 22
    .line 23
    if-eqz v6, :cond_49

    .line 24
    .line 25
    cmp-long v6, v0, v4

    .line 26
    .line 27
    if-nez v6, :cond_1d

    .line 28
    .line 29
    goto :goto_49

    .line 30
    :cond_1d
    iget-object v4, p0, Lax/X1/x;->a:Lax/P0/v;

    .line 31
    .line 32
    iget-wide v5, v4, Lax/P0/v;->t:J

    .line 33
    .line 34
    cmp-long v7, v0, v5

    .line 35
    .line 36
    if-eqz v7, :cond_38

    .line 37
    .line 38
    invoke-virtual {v4}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4, v0, v1}, Lax/P0/v$b;->C0(J)Lax/P0/v$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lax/X1/x;->a:Lax/P0/v;

    .line 51
    .line 52
    iget-object v1, p0, Lax/X1/x;->c:Lax/q1/U;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 55
    .line 56
    .line 57
    :cond_38
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    iget-object v0, p0, Lax/X1/x;->c:Lax/q1/U;

    .line 62
    .line 63
    invoke-interface {v0, p1, v5}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lax/X1/x;->c:Lax/q1/U;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    :goto_49
    return-void
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
.end method
