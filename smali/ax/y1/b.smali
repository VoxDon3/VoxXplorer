.class final Lax/y1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# instance fields
.field private final a:Lax/S0/G;

.field private b:Lax/q1/t;

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:Lax/F1/a;

.field private h:Lax/q1/s;

.field private i:Lax/y1/d;

.field private j:Lax/K1/n;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/S0/G;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lax/S0/G;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lax/y1/b;->f:J

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private g(Lax/q1/s;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->p([BII)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v0, v1

    .line 24
    invoke-interface {p1, v0}, Lax/q1/s;->j(I)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method

.method private h()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/y1/b;->b:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/q1/t;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/q1/t;->o()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/y1/b;->b:Lax/q1/t;

    .line 13
    .line 14
    new-instance v1, Lax/q1/N$b;

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lax/q1/N$b;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    iput v0, p0, Lax/y1/b;->c:I

    .line 29
    .line 30
    return-void
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

.method private static i(Ljava/lang/String;J)Lax/F1/a;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-nez v3, :cond_8

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_8
    invoke-static {p0}, Lax/y1/f;->a(Ljava/lang/String;)Lax/y1/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_f

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_f
    invoke-virtual {p0, p1, p2}, Lax/y1/c;->a(J)Lax/F1/a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method private j(Lax/F1/a;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/y1/b;->b:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/q1/t;

    .line 8
    .line 9
    const/16 v1, 0x400

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-interface {v0, v1, v2}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lax/P0/v$b;

    .line 17
    .line 18
    invoke-direct {v1}, Lax/P0/v$b;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "image/jpeg"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lax/P0/C;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    new-array v3, v3, [Lax/P0/C$a;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aput-object p1, v3, v4

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method private l(Lax/q1/s;)I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->p([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/S0/G;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
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
.end method

.method private m(Lax/q1/s;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/S0/G;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lax/y1/b;->d:I

    .line 24
    .line 25
    const v0, 0xffda

    .line 26
    .line 27
    .line 28
    if-ne p1, v0, :cond_2d

    .line 29
    .line 30
    iget-wide v0, p0, Lax/y1/b;->f:J

    .line 31
    .line 32
    const-wide/16 v2, -0x1

    .line 33
    .line 34
    cmp-long p1, v0, v2

    .line 35
    .line 36
    if-eqz p1, :cond_29

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    iput p1, p0, Lax/y1/b;->c:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-direct {p0}, Lax/y1/b;->h()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    const v0, 0xffd0

    .line 47
    .line 48
    .line 49
    if-lt p1, v0, :cond_37

    .line 50
    .line 51
    const v0, 0xffd9

    .line 52
    .line 53
    .line 54
    if-le p1, v0, :cond_3f

    .line 55
    .line 56
    :cond_37
    const v0, 0xff01

    .line 57
    .line 58
    .line 59
    if-eq p1, v0, :cond_3f

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput p1, p0, Lax/y1/b;->c:I

    .line 63
    .line 64
    :cond_3f
    return-void
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
.end method

.method private n(Lax/q1/s;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/y1/b;->d:I

    .line 2
    .line 3
    const v1, 0xffe1

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_3f

    .line 8
    .line 9
    new-instance v0, Lax/S0/G;

    .line 10
    .line 11
    iget v1, p0, Lax/y1/b;->e:I

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lax/S0/G;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v3, p0, Lax/y1/b;->e:I

    .line 21
    .line 22
    invoke-interface {p1, v1, v2, v3}, Lax/q1/s;->readFully([BII)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lax/y1/b;->g:Lax/F1/a;

    .line 26
    .line 27
    if-nez v1, :cond_44

    .line 28
    .line 29
    const-string v1, "http://ns.adobe.com/xap/1.0/"

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/S0/G;->G()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_44

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/S0/G;->G()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_44

    .line 46
    .line 47
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v0, v3, v4}, Lax/y1/b;->i(Ljava/lang/String;J)Lax/F1/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lax/y1/b;->g:Lax/F1/a;

    .line 56
    .line 57
    if-eqz p1, :cond_44

    .line 58
    .line 59
    iget-wide v0, p1, Lax/F1/a;->d:J

    .line 60
    .line 61
    iput-wide v0, p0, Lax/y1/b;->f:J

    .line 62
    .line 63
    goto :goto_44

    .line 64
    :cond_3f
    iget v0, p0, Lax/y1/b;->e:I

    .line 65
    .line 66
    invoke-interface {p1, v0}, Lax/q1/s;->n(I)V

    .line 67
    .line 68
    .line 69
    :cond_44
    :goto_44
    iput v2, p0, Lax/y1/b;->c:I

    .line 70
    .line 71
    return-void
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
.end method

.method private o(Lax/q1/s;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lax/S0/G;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, Lax/q1/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/S0/G;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sub-int/2addr p1, v1

    .line 24
    iput p1, p0, Lax/y1/b;->e:I

    .line 25
    .line 26
    iput v1, p0, Lax/y1/b;->c:I

    .line 27
    .line 28
    return-void
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

.method private p(Lax/q1/s;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y1/b;->a:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-interface {p1, v0, v1, v2, v2}, Lax/q1/s;->h([BIIZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_12

    .line 14
    .line 15
    invoke-direct {p0}, Lax/y1/b;->h()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 23
    .line 24
    if-nez v0, :cond_24

    .line 25
    .line 26
    new-instance v0, Lax/K1/n;

    .line 27
    .line 28
    sget-object v1, Lax/N1/t$a;->a:Lax/N1/t$a;

    .line 29
    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lax/K1/n;-><init>(Lax/N1/t$a;I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 36
    .line 37
    :cond_24
    new-instance v0, Lax/y1/d;

    .line 38
    .line 39
    iget-wide v1, p0, Lax/y1/b;->f:J

    .line 40
    .line 41
    invoke-direct {v0, p1, v1, v2}, Lax/y1/d;-><init>(Lax/q1/s;J)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lax/y1/b;->i:Lax/y1/d;

    .line 45
    .line 46
    iget-object p1, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lax/K1/n;->c(Lax/q1/s;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4d

    .line 53
    .line 54
    iget-object p1, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 55
    .line 56
    new-instance v0, Lax/y1/e;

    .line 57
    .line 58
    iget-wide v1, p0, Lax/y1/b;->f:J

    .line 59
    .line 60
    iget-object v3, p0, Lax/y1/b;->b:Lax/q1/t;

    .line 61
    .line 62
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lax/q1/t;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v3}, Lax/y1/e;-><init>(JLax/q1/t;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lax/K1/n;->a(Lax/q1/t;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lax/y1/b;->q()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    invoke-direct {p0}, Lax/y1/b;->h()V

    .line 79
    .line 80
    .line 81
    return-void
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

.method private q()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/y1/b;->g:Lax/F1/a;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/F1/a;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lax/y1/b;->j(Lax/F1/a;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    iput v0, p0, Lax/y1/b;->c:I

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a(Lax/q1/t;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/y1/b;->b:Lax/q1/t;

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
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_d

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lax/y1/b;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget v0, p0, Lax/y1/b;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1d

    .line 18
    .line 19
    iget-object v0, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 20
    .line 21
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lax/K1/n;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3, p4}, Lax/K1/n;->b(JJ)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-void
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
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/y1/b;->l(Lax/q1/s;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffd8

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_b

    .line 10
    .line 11
    return v2

    .line 12
    :cond_b
    invoke-direct {p0, p1}, Lax/y1/b;->l(Lax/q1/s;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lax/y1/b;->d:I

    .line 17
    .line 18
    const v1, 0xffe0

    .line 19
    .line 20
    .line 21
    if-ne v0, v1, :cond_1f

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lax/y1/b;->g(Lax/q1/s;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Lax/y1/b;->l(Lax/q1/s;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, p0, Lax/y1/b;->d:I

    .line 31
    .line 32
    :cond_1f
    iget p1, p0, Lax/y1/b;->d:I

    .line 33
    .line 34
    const v0, 0xffe1

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_28

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_28
    return v2
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

.method public d()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/K1/n;->d()V

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
.end method

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public f(Lax/q1/s;Lax/q1/M;)I
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/y1/b;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_60

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_5c

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_58

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    if-eq v0, v3, :cond_47

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-eq v0, v1, :cond_1c

    .line 17
    .line 18
    const/4 p1, 0x6

    .line 19
    if-ne v0, p1, :cond_16

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1c
    iget-object v0, p0, Lax/y1/b;->i:Lax/y1/d;

    .line 30
    .line 31
    if-eqz v0, :cond_24

    .line 32
    .line 33
    iget-object v0, p0, Lax/y1/b;->h:Lax/q1/s;

    .line 34
    .line 35
    if-eq p1, v0, :cond_2f

    .line 36
    .line 37
    :cond_24
    iput-object p1, p0, Lax/y1/b;->h:Lax/q1/s;

    .line 38
    .line 39
    new-instance v0, Lax/y1/d;

    .line 40
    .line 41
    iget-wide v3, p0, Lax/y1/b;->f:J

    .line 42
    .line 43
    invoke-direct {v0, p1, v3, v4}, Lax/y1/d;-><init>(Lax/q1/s;J)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/y1/b;->i:Lax/y1/d;

    .line 47
    .line 48
    :cond_2f
    iget-object p1, p0, Lax/y1/b;->j:Lax/K1/n;

    .line 49
    .line 50
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lax/K1/n;

    .line 55
    .line 56
    iget-object v0, p0, Lax/y1/b;->i:Lax/y1/d;

    .line 57
    .line 58
    invoke-virtual {p1, v0, p2}, Lax/K1/n;->f(Lax/q1/s;Lax/q1/M;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v2, :cond_46

    .line 63
    .line 64
    iget-wide v0, p2, Lax/q1/M;->a:J

    .line 65
    .line 66
    iget-wide v2, p0, Lax/y1/b;->f:J

    .line 67
    .line 68
    add-long/2addr v0, v2

    .line 69
    iput-wide v0, p2, Lax/q1/M;->a:J

    .line 70
    .line 71
    :cond_46
    return p1

    .line 72
    :cond_47
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    iget-wide v5, p0, Lax/y1/b;->f:J

    .line 77
    .line 78
    cmp-long v0, v3, v5

    .line 79
    .line 80
    if-eqz v0, :cond_54

    .line 81
    .line 82
    iput-wide v5, p2, Lax/q1/M;->a:J

    .line 83
    .line 84
    return v2

    .line 85
    :cond_54
    invoke-direct {p0, p1}, Lax/y1/b;->p(Lax/q1/s;)V

    .line 86
    .line 87
    .line 88
    return v1

    .line 89
    :cond_58
    invoke-direct {p0, p1}, Lax/y1/b;->n(Lax/q1/s;)V

    .line 90
    .line 91
    .line 92
    return v1

    .line 93
    :cond_5c
    invoke-direct {p0, p1}, Lax/y1/b;->o(Lax/q1/s;)V

    .line 94
    .line 95
    .line 96
    return v1

    .line 97
    :cond_60
    invoke-direct {p0, p1}, Lax/y1/b;->m(Lax/q1/s;)V

    .line 98
    .line 99
    .line 100
    return v1
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
