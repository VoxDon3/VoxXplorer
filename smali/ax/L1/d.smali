.class public Lax/L1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# static fields
.field public static final d:Lax/q1/x;


# instance fields
.field private a:Lax/q1/t;

.field private b:Lax/L1/i;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/L1/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/L1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/L1/d;->d:Lax/q1/x;

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
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    new-instance v0, Lax/L1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/L1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lax/q1/r;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    return-object v1
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

.method private static h(Lax/S0/G;)Lax/S0/G;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 3
    .line 4
    .line 5
    return-object p0
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

.method private i(Lax/q1/s;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/L1/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/L1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, Lax/L1/f;->a(Lax/q1/s;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_5e

    .line 13
    .line 14
    iget v2, v0, Lax/L1/f;->b:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_14

    .line 19
    .line 20
    goto :goto_5e

    .line 21
    :cond_14
    iget v0, v0, Lax/L1/f;->i:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Lax/S0/G;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lax/S0/G;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {p1, v4, v3, v0}, Lax/q1/s;->p([BII)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lax/L1/d;->h(Lax/S0/G;)Lax/S0/G;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lax/L1/b;->p(Lax/S0/G;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3a

    .line 50
    .line 51
    new-instance p1, Lax/L1/b;

    .line 52
    .line 53
    invoke-direct {p1}, Lax/L1/b;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 57
    .line 58
    goto :goto_5d

    .line 59
    :cond_3a
    invoke-static {v2}, Lax/L1/d;->h(Lax/S0/G;)Lax/S0/G;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lax/L1/j;->r(Lax/S0/G;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4c

    .line 68
    .line 69
    new-instance p1, Lax/L1/j;

    .line 70
    .line 71
    invoke-direct {p1}, Lax/L1/j;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 75
    .line 76
    goto :goto_5d

    .line 77
    :cond_4c
    invoke-static {v2}, Lax/L1/d;->h(Lax/S0/G;)Lax/S0/G;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lax/L1/h;->o(Lax/S0/G;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5e

    .line 86
    .line 87
    new-instance p1, Lax/L1/h;

    .line 88
    .line 89
    invoke-direct {p1}, Lax/L1/h;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 93
    .line 94
    :goto_5d
    return v1

    .line 95
    :cond_5e
    :goto_5e
    return v3
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
.method public a(Lax/q1/t;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/L1/d;->a:Lax/q1/t;

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

.method public b(JJ)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lax/L1/i;->m(JJ)V

    .line 6
    .line 7
    .line 8
    :cond_7
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

.method public c(Lax/q1/s;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lax/L1/d;->i(Lax/q1/s;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_4
    .catch Lax/P0/E; {:try_start_0 .. :try_end_4} :catch_5

    .line 5
    return p1

    .line 6
    :catch_5
    const/4 p1, 0x0

    .line 7
    return p1
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

.method public d()V
    .registers 1

    .line 1
    return-void
    .line 2
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

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/L1/d;->a:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 7
    .line 8
    if-nez v0, :cond_1b

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lax/L1/d;->i(Lax/q1/s;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_13

    .line 15
    .line 16
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 17
    .line 18
    .line 19
    goto :goto_1b

    .line 20
    :cond_13
    const-string p1, "Failed to determine bitstream type"

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    throw p1

    .line 28
    :cond_1b
    :goto_1b
    iget-boolean v0, p0, Lax/L1/d;->c:Z

    .line 29
    .line 30
    if-nez v0, :cond_35

    .line 31
    .line 32
    iget-object v0, p0, Lax/L1/d;->a:Lax/q1/t;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-interface {v0, v1, v2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Lax/L1/d;->a:Lax/q1/t;

    .line 41
    .line 42
    invoke-interface {v1}, Lax/q1/t;->o()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 46
    .line 47
    iget-object v3, p0, Lax/L1/d;->a:Lax/q1/t;

    .line 48
    .line 49
    invoke-virtual {v1, v3, v0}, Lax/L1/i;->d(Lax/q1/t;Lax/q1/U;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v2, p0, Lax/L1/d;->c:Z

    .line 53
    .line 54
    :cond_35
    iget-object v0, p0, Lax/L1/d;->b:Lax/L1/i;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Lax/L1/i;->g(Lax/q1/s;Lax/q1/M;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1
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

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
