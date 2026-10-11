.class final Lax/J1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/J1/g;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:I

.field private final d:Lax/q1/I;


# direct methods
.method public constructor <init>(JJJ)V
    .registers 19

    .line 1
    move-wide v0, p3

    .line 2
    move-wide/from16 v2, p5

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v6, Lax/q1/I;

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    new-array v8, v7, [J

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    aput-wide v0, v8, v9

    .line 14
    .line 15
    const-wide/16 v10, 0x0

    .line 16
    .line 17
    new-array v7, v7, [J

    .line 18
    .line 19
    aput-wide v10, v7, v9

    .line 20
    .line 21
    invoke-direct {v6, v8, v7, p1, p2}, Lax/q1/I;-><init>([J[JJ)V

    .line 22
    .line 23
    .line 24
    iput-object v6, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 25
    .line 26
    iput-wide v0, p0, Lax/J1/b;->a:J

    .line 27
    .line 28
    iput-wide v2, p0, Lax/J1/b;->b:J

    .line 29
    .line 30
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const v8, -0x7fffffff

    .line 36
    .line 37
    .line 38
    cmp-long v9, p1, v6

    .line 39
    .line 40
    if-eqz v9, :cond_42

    .line 41
    .line 42
    sub-long/2addr v0, v2

    .line 43
    const-wide/16 v2, 0x8

    .line 44
    .line 45
    sget-object v6, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 46
    .line 47
    move-wide v4, p1

    .line 48
    invoke-static/range {v0 .. v6}, Lax/S0/d0;->r1(JJJLjava/math/RoundingMode;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    cmp-long v2, v0, v10

    .line 53
    .line 54
    if-lez v2, :cond_3f

    .line 55
    .line 56
    const-wide/32 v2, 0x7fffffff

    .line 57
    .line 58
    .line 59
    cmp-long v4, v0, v2

    .line 60
    .line 61
    if-gtz v4, :cond_3f

    .line 62
    .line 63
    long-to-int v8, v0

    .line 64
    :cond_3f
    iput v8, p0, Lax/J1/b;->c:I

    .line 65
    .line 66
    return-void

    .line 67
    :cond_42
    iput v8, p0, Lax/J1/b;->c:I

    .line 68
    .line 69
    return-void
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


# virtual methods
.method public a(J)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    const-wide/32 v1, 0x186a0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, v1, v2}, Lax/q1/I;->b(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
    invoke-virtual {p0, p1, p2}, Lax/J1/b;->a(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3, p4}, Lax/q1/I;->a(JJ)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method c(J)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/q1/I;->c(J)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public g()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/J1/b;->b:J

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

.method public h()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/J1/b;->a:J

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

.method public i()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/q1/I;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public j(J)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/q1/I;->j(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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

.method public l(J)Lax/q1/N$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/q1/I;->l(J)Lax/q1/N$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public m()I
    .registers 2

    .line 1
    iget v0, p0, Lax/J1/b;->c:I

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

.method public n()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/J1/b;->d:Lax/q1/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/q1/I;->n()J

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
