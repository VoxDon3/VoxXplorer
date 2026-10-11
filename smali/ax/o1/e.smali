.class final Lax/o1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o1/S;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o1/e$b;
    }
.end annotation


# instance fields
.field private final a:Lax/o1/A;

.field private final b:Lax/o1/E;

.field private final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lax/o1/S$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/view/Surface;

.field private e:Lax/P0/v;

.field private f:J

.field private g:Lax/o1/S$a;

.field private h:Ljava/util/concurrent/Executor;

.field private i:Lax/o1/z;


# direct methods
.method public constructor <init>(Lax/o1/A;Lax/S0/h;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lax/o1/A;->m(Lax/S0/h;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lax/o1/E;

    .line 10
    .line 11
    new-instance v0, Lax/o1/e$b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lax/o1/e$b;-><init>(Lax/o1/e;Lax/o1/e$a;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p2, v0, p1}, Lax/o1/E;-><init>(Lax/o1/E$a;Lax/o1/A;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lax/o1/e;->c:Ljava/util/Queue;

    .line 28
    .line 29
    new-instance p1, Lax/P0/v$b;

    .line 30
    .line 31
    invoke-direct {p1}, Lax/P0/v$b;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lax/o1/e;->e:Lax/P0/v;

    .line 39
    .line 40
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide p1, p0, Lax/o1/e;->f:J

    .line 46
    .line 47
    sget-object p1, Lax/o1/S$a;->a:Lax/o1/S$a;

    .line 48
    .line 49
    iput-object p1, p0, Lax/o1/e;->g:Lax/o1/S$a;

    .line 50
    .line 51
    new-instance p1, Lax/o1/b;

    .line 52
    .line 53
    invoke-direct {p1}, Lax/o1/b;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lax/o1/e;->h:Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    new-instance p1, Lax/o1/c;

    .line 59
    .line 60
    invoke-direct {p1}, Lax/o1/c;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lax/o1/e;->i:Lax/o1/z;

    .line 64
    .line 65
    return-void
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

.method static synthetic B(Lax/o1/e;)Ljava/util/concurrent/Executor;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->h:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic C(Lax/o1/e;)Landroid/view/Surface;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic D(Lax/o1/e;)Lax/o1/z;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->i:Lax/o1/z;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic E(Lax/o1/e;)Ljava/util/Queue;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->c:Ljava/util/Queue;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic F(Lax/o1/e;)Lax/o1/S$a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->g:Lax/o1/S$a;

    .line 2
    .line 3
    return-object p0
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

.method public static synthetic a(Ljava/lang/Runnable;)V
    .registers 1

    .line 1
    return-void
.end method

.method public static synthetic e(Lax/o1/e;)V
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e;->g:Lax/o1/S$a;

    .line 2
    .line 3
    invoke-interface {p0}, Lax/o1/S$a;->b()V

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

.method public static synthetic f(JJLax/P0/v;Landroid/media/MediaFormat;)V
    .registers 6

    .line 1
    return-void
.end method


# virtual methods
.method public A()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/A;->a()V

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
.end method

.method public b()Z
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

.method public c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/E;->d()Z

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

.method public g(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/A;->p(F)V

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

.method public h()V
    .registers 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
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

.method public i(JJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o1/S$c;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lax/o1/E;->j(JJ)V
    :try_end_5
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    move-exception p1

    .line 8
    new-instance p2, Lax/o1/S$c;

    .line 9
    .line 10
    iget-object p3, p0, Lax/o1/e;->e:Lax/P0/v;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, Lax/o1/S$c;-><init>(Ljava/lang/Throwable;Lax/P0/v;)V

    .line 13
    .line 14
    .line 15
    throw p2
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

.method public j()Landroid/view/Surface;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    return-object v0
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

.method public k(JLax/o1/S$b;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o1/e;->c:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 7
    .line 8
    invoke-virtual {p3, p1, p2}, Lax/o1/E;->g(J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/o1/e;->h:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance p2, Lax/o1/d;

    .line 14
    .line 15
    invoke-direct {p2, p0}, Lax/o1/d;-><init>(Lax/o1/e;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
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

.method public l()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/A;->i()V

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
.end method

.method public m(Lax/o1/S$a;Ljava/util/concurrent/Executor;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o1/e;->g:Lax/o1/S$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/o1/e;->h:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
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

.method public n()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/A;->h()V

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
.end method

.method public o(J)V
    .registers 3

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
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

.method public p(Lax/o1/z;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o1/e;->i:Lax/o1/z;

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

.method public q()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/E;->l()V

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
.end method

.method public r(ILax/P0/v;JILjava/util/List;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lax/P0/v;",
            "JI",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget p1, p2, Lax/P0/v;->v:I

    .line 9
    .line 10
    iget-object p6, p0, Lax/o1/e;->e:Lax/P0/v;

    .line 11
    .line 12
    iget v0, p6, Lax/P0/v;->v:I

    .line 13
    .line 14
    if-ne p1, v0, :cond_15

    .line 15
    .line 16
    iget v0, p2, Lax/P0/v;->w:I

    .line 17
    .line 18
    iget p6, p6, Lax/P0/v;->w:I

    .line 19
    .line 20
    if-eq v0, p6, :cond_1c

    .line 21
    .line 22
    :cond_15
    iget-object p6, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 23
    .line 24
    iget v0, p2, Lax/P0/v;->w:I

    .line 25
    .line 26
    invoke-virtual {p6, p1, v0}, Lax/o1/E;->i(II)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget p1, p2, Lax/P0/v;->z:F

    .line 30
    .line 31
    iget-object p6, p0, Lax/o1/e;->e:Lax/P0/v;

    .line 32
    .line 33
    iget p6, p6, Lax/P0/v;->z:F

    .line 34
    .line 35
    cmpl-float p6, p1, p6

    .line 36
    .line 37
    if-eqz p6, :cond_2b

    .line 38
    .line 39
    iget-object p6, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 40
    .line 41
    invoke-virtual {p6, p1}, Lax/o1/A;->n(F)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    iput-object p2, p0, Lax/o1/e;->e:Lax/P0/v;

    .line 45
    .line 46
    iget-wide p1, p0, Lax/o1/e;->f:J

    .line 47
    .line 48
    cmp-long p6, p3, p1

    .line 49
    .line 50
    if-eqz p6, :cond_3a

    .line 51
    .line 52
    iget-object p1, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 53
    .line 54
    invoke-virtual {p1, p5, p3, p4}, Lax/o1/E;->h(IJ)V

    .line 55
    .line 56
    .line 57
    iput-wide p3, p0, Lax/o1/e;->f:J

    .line 58
    .line 59
    :cond_3a
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public s(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/A;->l(I)V

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

.method public t(Landroid/view/Surface;Lax/S0/I;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/o1/e;->d:Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p2, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lax/o1/A;->o(Landroid/view/Surface;)V

    .line 6
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

.method public u()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/o1/e;->d:Landroid/view/Surface;

    .line 3
    .line 4
    iget-object v1, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Lax/o1/A;->o(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public v(Z)V
    .registers 2

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    iget-object p1, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 4
    .line 5
    invoke-virtual {p1}, Lax/o1/A;->k()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object p1, p0, Lax/o1/e;->b:Lax/o1/E;

    .line 9
    .line 10
    invoke-virtual {p1}, Lax/o1/E;->b()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lax/o1/e;->c:Ljava/util/Queue;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public w(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
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

.method public x(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/A;->e(Z)V

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

.method public y(Z)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/e;->a:Lax/o1/A;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/A;->d(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

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

.method public z(Lax/P0/v;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 22
.end method
