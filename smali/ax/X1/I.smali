.class final Lax/X1/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lax/S0/M;

.field private final c:Lax/S0/G;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:J

.field private h:J

.field private i:J


# direct methods
.method constructor <init>(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/X1/I;->a:I

    .line 5
    .line 6
    new-instance p1, Lax/S0/M;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-direct {p1, v0, v1}, Lax/S0/M;-><init>(J)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/X1/I;->b:Lax/S0/M;

    .line 14
    .line 15
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lax/X1/I;->g:J

    .line 21
    .line 22
    iput-wide v0, p0, Lax/X1/I;->h:J

    .line 23
    .line 24
    iput-wide v0, p0, Lax/X1/I;->i:J

    .line 25
    .line 26
    new-instance p1, Lax/S0/G;

    .line 27
    .line 28
    invoke-direct {p1}, Lax/S0/G;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 32
    .line 33
    return-void
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

.method private a(Lax/q1/s;)I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 2
    .line 3
    sget-object v1, Lax/S0/d0;->f:[B

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/S0/G;->Y([B)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/X1/I;->d:Z

    .line 10
    .line 11
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private f(Lax/q1/s;Lax/q1/M;I)I
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/X1/I;->a:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    long-to-int v1, v0

    .line 13
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const/4 v0, 0x0

    .line 18
    int-to-long v4, v0

    .line 19
    const/4 v6, 0x1

    .line 20
    cmp-long v7, v2, v4

    .line 21
    .line 22
    if-eqz v7, :cond_1a

    .line 23
    .line 24
    iput-wide v4, p2, Lax/q1/M;->a:J

    .line 25
    .line 26
    return v6

    .line 27
    :cond_1a
    iget-object p2, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Lax/S0/G;->X(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 36
    .line 37
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p1, p2, v0, v1}, Lax/q1/s;->p([BII)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 45
    .line 46
    invoke-direct {p0, p1, p3}, Lax/X1/I;->g(Lax/S0/G;I)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Lax/X1/I;->g:J

    .line 51
    .line 52
    iput-boolean v6, p0, Lax/X1/I;->e:Z

    .line 53
    .line 54
    return v0
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

.method private g(Lax/S0/G;I)J
    .registers 10

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lax/S0/G;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_8
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-ge v0, v1, :cond_26

    .line 15
    .line 16
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    aget-byte v4, v4, v0

    .line 21
    .line 22
    const/16 v5, 0x47

    .line 23
    .line 24
    if-eq v4, v5, :cond_1a

    .line 25
    .line 26
    goto :goto_23

    .line 27
    :cond_1a
    invoke-static {p1, v0, p2}, Lax/X1/M;->c(Lax/S0/G;II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    cmp-long v6, v4, v2

    .line 32
    .line 33
    if-eqz v6, :cond_23

    .line 34
    .line 35
    return-wide v4

    .line 36
    :cond_23
    :goto_23
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_8

    .line 39
    :cond_26
    return-wide v2
    .line 40
    .line 41
.end method

.method private h(Lax/q1/s;Lax/q1/M;I)I
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/q1/s;->getLength()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, Lax/X1/I;->a:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    long-to-int v3, v2

    .line 13
    int-to-long v4, v3

    .line 14
    sub-long/2addr v0, v4

    .line 15
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const/4 v2, 0x1

    .line 20
    cmp-long v6, v4, v0

    .line 21
    .line 22
    if-eqz v6, :cond_1a

    .line 23
    .line 24
    iput-wide v0, p2, Lax/q1/M;->a:J

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1a
    iget-object p2, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 28
    .line 29
    invoke-virtual {p2, v3}, Lax/S0/G;->X(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lax/q1/s;->m()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 36
    .line 37
    invoke-virtual {p2}, Lax/S0/G;->f()[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-interface {p1, p2, v0, v3}, Lax/q1/s;->p([BII)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/X1/I;->c:Lax/S0/G;

    .line 46
    .line 47
    invoke-direct {p0, p1, p3}, Lax/X1/I;->i(Lax/S0/G;I)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    iput-wide p1, p0, Lax/X1/I;->h:J

    .line 52
    .line 53
    iput-boolean v2, p0, Lax/X1/I;->f:Z

    .line 54
    .line 55
    return v0
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

.method private i(Lax/S0/G;I)J
    .registers 11

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lax/S0/G;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit16 v2, v1, -0xbc

    .line 10
    .line 11
    :goto_a
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-lt v2, v0, :cond_28

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v5, v0, v1, v2}, Lax/X1/M;->b([BIII)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_1c

    .line 27
    .line 28
    goto :goto_25

    .line 29
    :cond_1c
    invoke-static {p1, v2, p2}, Lax/X1/M;->c(Lax/S0/G;II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v7, v5, v3

    .line 34
    .line 35
    if-eqz v7, :cond_25

    .line 36
    .line 37
    return-wide v5

    .line 38
    :cond_25
    :goto_25
    add-int/lit8 v2, v2, -0x1

    .line 39
    .line 40
    goto :goto_a

    .line 41
    :cond_28
    return-wide v3
.end method


# virtual methods
.method public b()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/X1/I;->i:J

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

.method public c()Lax/S0/M;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X1/I;->b:Lax/S0/M;

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

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/X1/I;->d:Z

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

.method public e(Lax/q1/s;Lax/q1/M;I)I
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-gtz p3, :cond_7

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X1/I;->a(Lax/q1/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_7
    iget-boolean v0, p0, Lax/X1/I;->f:Z

    .line 9
    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lax/X1/I;->h(Lax/q1/s;Lax/q1/M;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_10
    iget-wide v0, p0, Lax/X1/I;->h:J

    .line 18
    .line 19
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v4, v0, v2

    .line 25
    .line 26
    if-nez v4, :cond_20

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lax/X1/I;->a(Lax/q1/s;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_20
    iget-boolean v0, p0, Lax/X1/I;->e:Z

    .line 34
    .line 35
    if-nez v0, :cond_29

    .line 36
    .line 37
    invoke-direct {p0, p1, p2, p3}, Lax/X1/I;->f(Lax/q1/s;Lax/q1/M;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_29
    iget-wide p2, p0, Lax/X1/I;->g:J

    .line 43
    .line 44
    cmp-long v0, p2, v2

    .line 45
    .line 46
    if-nez v0, :cond_34

    .line 47
    .line 48
    invoke-direct {p0, p1}, Lax/X1/I;->a(Lax/q1/s;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_34
    iget-object v0, p0, Lax/X1/I;->b:Lax/S0/M;

    .line 54
    .line 55
    invoke-virtual {v0, p2, p3}, Lax/S0/M;->b(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p2

    .line 59
    iget-object v0, p0, Lax/X1/I;->b:Lax/S0/M;

    .line 60
    .line 61
    iget-wide v1, p0, Lax/X1/I;->h:J

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Lax/S0/M;->c(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    sub-long/2addr v0, p2

    .line 68
    iput-wide v0, p0, Lax/X1/I;->i:J

    .line 69
    .line 70
    invoke-direct {p0, p1}, Lax/X1/I;->a(Lax/q1/s;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    return p1
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
