.class public final Lax/i1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/O;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/r$a;,
        Lax/i1/r$b;
    }
.end annotation


# instance fields
.field private final a:Lax/i1/r$a;

.field private b:Lax/U0/g$a;

.field private c:Lax/N1/t$a;

.field private d:Lax/i1/F$a;

.field private e:Lax/i1/t;

.field private f:Lax/m1/m;

.field private g:J

.field private h:J

.field private i:J

.field private j:F

.field private k:F

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/q1/x;)V
    .registers 4

    .line 1
    new-instance v0, Lax/U0/l$a;

    invoke-direct {v0, p1}, Lax/U0/l$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lax/i1/r;-><init>(Lax/U0/g$a;Lax/q1/x;)V

    return-void
.end method

.method public constructor <init>(Lax/U0/g$a;Lax/q1/x;)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i1/r;->b:Lax/U0/g$a;

    .line 4
    new-instance v0, Lax/N1/h;

    invoke-direct {v0}, Lax/N1/h;-><init>()V

    iput-object v0, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 5
    new-instance v1, Lax/i1/r$a;

    invoke-direct {v1, p2, v0}, Lax/i1/r$a;-><init>(Lax/q1/x;Lax/N1/t$a;)V

    iput-object v1, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 6
    invoke-virtual {v1, p1}, Lax/i1/r$a;->j(Lax/U0/g$a;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide p1, p0, Lax/i1/r;->g:J

    .line 8
    iput-wide p1, p0, Lax/i1/r;->h:J

    .line 9
    iput-wide p1, p0, Lax/i1/r;->i:J

    const p1, -0x800001

    .line 10
    iput p1, p0, Lax/i1/r;->j:F

    .line 11
    iput p1, p0, Lax/i1/r;->k:F

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lax/i1/r;->l:Z

    return-void
.end method

.method public static synthetic h(Lax/i1/r;Lax/P0/v;)[Lax/q1/r;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/N1/t$a;->b(Lax/P0/v;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_15

    .line 8
    .line 9
    new-instance v0, Lax/N1/o;

    .line 10
    .line 11
    iget-object p0, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lax/N1/t$a;->c(Lax/P0/v;)Lax/N1/t;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-direct {v0, p0, p1}, Lax/N1/o;-><init>(Lax/N1/t;Lax/P0/v;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1a

    .line 22
    :cond_15
    new-instance v0, Lax/i1/r$b;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lax/i1/r$b;-><init>(Lax/P0/v;)V

    .line 25
    .line 26
    .line 27
    :goto_1a
    const/4 p0, 0x1

    .line 28
    new-array p0, p0, [Lax/q1/r;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    aput-object v0, p0, p1

    .line 32
    .line 33
    return-object p0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic i(Ljava/lang/Class;)Lax/i1/F$a;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/i1/r;->o(Ljava/lang/Class;)Lax/i1/F$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

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

.method static synthetic j(Ljava/lang/Class;Lax/U0/g$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/r;->p(Ljava/lang/Class;Lax/U0/g$a;)Lax/i1/F$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

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

.method private static m(Lax/P0/y;Lax/i1/F;)Lax/i1/F;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 2
    .line 3
    iget-wide v1, v0, Lax/P0/y$d;->b:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    if-nez v5, :cond_17

    .line 10
    .line 11
    iget-wide v1, v0, Lax/P0/y$d;->d:J

    .line 12
    .line 13
    const-wide/high16 v3, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v5, v1, v3

    .line 16
    .line 17
    if-nez v5, :cond_17

    .line 18
    .line 19
    iget-boolean v0, v0, Lax/P0/y$d;->f:Z

    .line 20
    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_17
    new-instance v0, Lax/i1/f$b;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lax/i1/f$b;-><init>(Lax/i1/F;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 30
    .line 31
    iget-wide v1, p1, Lax/P0/y$d;->b:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lax/i1/f$b;->n(J)Lax/i1/f$b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 38
    .line 39
    iget-wide v0, v0, Lax/P0/y$d;->d:J

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lax/i1/f$b;->l(J)Lax/i1/f$b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 46
    .line 47
    iget-boolean v0, v0, Lax/P0/y$d;->g:Z

    .line 48
    .line 49
    xor-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lax/i1/f$b;->k(Z)Lax/i1/f$b;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 56
    .line 57
    iget-boolean v0, v0, Lax/P0/y$d;->e:Z

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lax/i1/f$b;->i(Z)Lax/i1/f$b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 64
    .line 65
    iget-boolean v0, v0, Lax/P0/y$d;->f:Z

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lax/i1/f$b;->m(Z)Lax/i1/f$b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p0, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 72
    .line 73
    iget-boolean p0, p0, Lax/P0/y$d;->h:Z

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lax/i1/f$b;->j(Z)Lax/i1/f$b;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Lax/i1/f$b;->h()Lax/i1/f;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
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

.method private n(Lax/P0/y;Lax/i1/F;)Lax/i1/F;
    .registers 4

    .line 1
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p2
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

.method private static o(Ljava/lang/Class;)Lax/i1/F$a;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lax/i1/F$a;",
            ">;)",
            "Lax/i1/F$a;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lax/i1/F$a;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_b} :catch_c

    .line 11
    .line 12
    return-object p0

    .line 13
    :catch_c
    move-exception p0

    .line 14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
.end method

.method private static p(Ljava/lang/Class;Lax/U0/g$a;)Lax/i1/F$a;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lax/i1/F$a;",
            ">;",
            "Lax/U0/g$a;",
            ")",
            "Lax/i1/F$a;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_2
    new-array v2, v1, [Ljava/lang/Class;

    .line 4
    .line 5
    const-class v3, Lax/U0/g$a;

    .line 6
    .line 7
    aput-object v3, v2, v0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lax/i1/F$a;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_16} :catch_17

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_17
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.method public bridge synthetic a(Lax/N1/t$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->t(Lax/N1/t$a;)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic b(I)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->l(I)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic c(Z)Lax/i1/F$a;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->k(Z)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic d(Lax/m1/f$a;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->q(Lax/m1/f$a;)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public e(Lax/P0/y;)Lax/i1/F;
    .registers 12

    .line 1
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 7
    .line 8
    iget-object v0, v0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_24

    .line 15
    .line 16
    const-string v1, "ssai"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_24

    .line 23
    .line 24
    iget-object v0, p0, Lax/i1/r;->d:Lax/i1/F$a;

    .line 25
    .line 26
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lax/i1/F$a;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Lax/i1/F$a;->e(Lax/P0/y;)Lax/i1/F;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_24
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 38
    .line 39
    iget-object v0, v0, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "application/x-image-uri"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4a

    .line 48
    .line 49
    new-instance v0, Lax/i1/v$b;

    .line 50
    .line 51
    iget-object v1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 52
    .line 53
    iget-wide v1, v1, Lax/P0/y$h;->i:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Lax/S0/d0;->a1(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    iget-object v3, p0, Lax/i1/r;->e:Lax/i1/t;

    .line 60
    .line 61
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lax/i1/t;

    .line 66
    .line 67
    invoke-direct {v0, v1, v2, v3}, Lax/i1/v$b;-><init>(JLax/i1/t;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lax/i1/v$b;->h(Lax/P0/y;)Lax/i1/v;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_4a
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 76
    .line 77
    iget-object v1, v0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 78
    .line 79
    iget-object v0, v0, Lax/P0/y$h;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1, v0}, Lax/S0/d0;->E0(Landroid/net/Uri;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 86
    .line 87
    iget-wide v1, v1, Lax/P0/y$h;->i:J

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    cmp-long v6, v1, v4

    .line 96
    .line 97
    if-eqz v6, :cond_67

    .line 98
    .line 99
    iget-object v1, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 100
    .line 101
    invoke-virtual {v1, v3}, Lax/i1/r$a;->l(I)V

    .line 102
    .line 103
    .line 104
    :cond_67
    :try_start_67
    iget-object v1, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Lax/i1/r$a;->f(I)Lax/i1/F$a;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_6d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_67 .. :try_end_6d} :catch_1cd

    .line 110
    iget-object v1, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 111
    .line 112
    invoke-virtual {v1}, Lax/P0/y$g;->a()Lax/P0/y$g$a;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 117
    .line 118
    iget-wide v6, v2, Lax/P0/y$g;->a:J

    .line 119
    .line 120
    cmp-long v2, v6, v4

    .line 121
    .line 122
    if-nez v2, :cond_80

    .line 123
    .line 124
    iget-wide v6, p0, Lax/i1/r;->g:J

    .line 125
    .line 126
    invoke-virtual {v1, v6, v7}, Lax/P0/y$g$a;->k(J)Lax/P0/y$g$a;

    .line 127
    .line 128
    .line 129
    :cond_80
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 130
    .line 131
    iget v2, v2, Lax/P0/y$g;->d:F

    .line 132
    .line 133
    const v6, -0x800001

    .line 134
    .line 135
    .line 136
    cmpl-float v2, v2, v6

    .line 137
    .line 138
    if-nez v2, :cond_90

    .line 139
    .line 140
    iget v2, p0, Lax/i1/r;->j:F

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Lax/P0/y$g$a;->j(F)Lax/P0/y$g$a;

    .line 143
    .line 144
    .line 145
    :cond_90
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 146
    .line 147
    iget v2, v2, Lax/P0/y$g;->e:F

    .line 148
    .line 149
    cmpl-float v2, v2, v6

    .line 150
    .line 151
    if-nez v2, :cond_9d

    .line 152
    .line 153
    iget v2, p0, Lax/i1/r;->k:F

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Lax/P0/y$g$a;->h(F)Lax/P0/y$g$a;

    .line 156
    .line 157
    .line 158
    :cond_9d
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 159
    .line 160
    iget-wide v6, v2, Lax/P0/y$g;->b:J

    .line 161
    .line 162
    cmp-long v2, v6, v4

    .line 163
    .line 164
    if-nez v2, :cond_aa

    .line 165
    .line 166
    iget-wide v6, p0, Lax/i1/r;->h:J

    .line 167
    .line 168
    invoke-virtual {v1, v6, v7}, Lax/P0/y$g$a;->i(J)Lax/P0/y$g$a;

    .line 169
    .line 170
    .line 171
    :cond_aa
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 172
    .line 173
    iget-wide v6, v2, Lax/P0/y$g;->c:J

    .line 174
    .line 175
    cmp-long v2, v6, v4

    .line 176
    .line 177
    if-nez v2, :cond_b7

    .line 178
    .line 179
    iget-wide v6, p0, Lax/i1/r;->i:J

    .line 180
    .line 181
    invoke-virtual {v1, v6, v7}, Lax/P0/y$g$a;->g(J)Lax/P0/y$g$a;

    .line 182
    .line 183
    .line 184
    :cond_b7
    invoke-virtual {v1}, Lax/P0/y$g$a;->f()Lax/P0/y$g;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v2, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lax/P0/y$g;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-nez v2, :cond_cf

    .line 195
    .line 196
    invoke-virtual {p1}, Lax/P0/y;->a()Lax/P0/y$c;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1, v1}, Lax/P0/y$c;->b(Lax/P0/y$g;)Lax/P0/y$c;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :cond_cf
    invoke-interface {v0, p1}, Lax/i1/F$a;->e(Lax/P0/y;)Lax/i1/F;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-object v1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 213
    .line 214
    invoke-static {v1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lax/P0/y$h;

    .line 219
    .line 220
    iget-object v1, v1, Lax/P0/y$h;->f:Lax/r7/z;

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_1c4

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    add-int/2addr v2, v3

    .line 233
    new-array v2, v2, [Lax/i1/F;

    .line 234
    .line 235
    const/4 v3, 0x0

    .line 236
    aput-object v0, v2, v3

    .line 237
    .line 238
    const/4 v0, 0x0

    .line 239
    :goto_ee
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-ge v0, v6, :cond_1bf

    .line 244
    .line 245
    iget-boolean v6, p0, Lax/i1/r;->l:Z

    .line 246
    .line 247
    if-eqz v6, :cond_19f

    .line 248
    .line 249
    new-instance v6, Lax/P0/v$b;

    .line 250
    .line 251
    invoke-direct {v6}, Lax/P0/v$b;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    check-cast v7, Lax/P0/y$k;

    .line 259
    .line 260
    iget-object v7, v7, Lax/P0/y$k;->b:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v6, v7}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    check-cast v7, Lax/P0/y$k;

    .line 271
    .line 272
    iget-object v7, v7, Lax/P0/y$k;->c:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v6, v7}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Lax/P0/y$k;

    .line 283
    .line 284
    iget v7, v7, Lax/P0/y$k;->d:I

    .line 285
    .line 286
    invoke-virtual {v6, v7}, Lax/P0/v$b;->A0(I)Lax/P0/v$b;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    check-cast v7, Lax/P0/y$k;

    .line 295
    .line 296
    iget v7, v7, Lax/P0/y$k;->e:I

    .line 297
    .line 298
    invoke-virtual {v6, v7}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    check-cast v7, Lax/P0/y$k;

    .line 307
    .line 308
    iget-object v7, v7, Lax/P0/y$k;->f:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v6, v7}, Lax/P0/v$b;->l0(Ljava/lang/String;)Lax/P0/v$b;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    check-cast v7, Lax/P0/y$k;

    .line 319
    .line 320
    iget-object v7, v7, Lax/P0/y$k;->g:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v6, v7}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-virtual {v6}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    new-instance v7, Lax/i1/l;

    .line 331
    .line 332
    invoke-direct {v7, p0, v6}, Lax/i1/l;-><init>(Lax/i1/r;Lax/P0/v;)V

    .line 333
    .line 334
    .line 335
    new-instance v8, Lax/i1/Z$b;

    .line 336
    .line 337
    iget-object v9, p0, Lax/i1/r;->b:Lax/U0/g$a;

    .line 338
    .line 339
    invoke-direct {v8, v9, v7}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;Lax/q1/x;)V

    .line 340
    .line 341
    .line 342
    iget-object v7, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 343
    .line 344
    invoke-interface {v7, v6}, Lax/N1/t$a;->b(Lax/P0/v;)Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-eqz v7, :cond_17b

    .line 349
    .line 350
    invoke-virtual {v6}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    const-string v9, "application/x-media3-cues"

    .line 355
    .line 356
    invoke-virtual {v7, v9}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    iget-object v9, v6, Lax/P0/v;->o:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v7, v9}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    iget-object v9, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 367
    .line 368
    invoke-interface {v9, v6}, Lax/N1/t$a;->a(Lax/P0/v;)I

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    invoke-virtual {v7, v6}, Lax/P0/v$b;->Y(I)Lax/P0/v$b;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-virtual {v6}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    :cond_17b
    invoke-virtual {v8, v3, v6}, Lax/i1/Z$b;->j(ILax/P0/v;)Lax/i1/Z$b;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    iget-object v7, p0, Lax/i1/r;->f:Lax/m1/m;

    .line 385
    .line 386
    if-eqz v7, :cond_186

    .line 387
    .line 388
    invoke-virtual {v6, v7}, Lax/i1/Z$b;->l(Lax/m1/m;)Lax/i1/Z$b;

    .line 389
    .line 390
    .line 391
    :cond_186
    add-int/lit8 v7, v0, 0x1

    .line 392
    .line 393
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    check-cast v8, Lax/P0/y$k;

    .line 398
    .line 399
    iget-object v8, v8, Lax/P0/y$k;->a:Landroid/net/Uri;

    .line 400
    .line 401
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-static {v8}, Lax/P0/y;->c(Ljava/lang/String;)Lax/P0/y;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    invoke-virtual {v6, v8}, Lax/i1/Z$b;->i(Lax/P0/y;)Lax/i1/Z;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    aput-object v6, v2, v7

    .line 414
    .line 415
    goto :goto_1bb

    .line 416
    :cond_19f
    new-instance v6, Lax/i1/j0$b;

    .line 417
    .line 418
    iget-object v7, p0, Lax/i1/r;->b:Lax/U0/g$a;

    .line 419
    .line 420
    invoke-direct {v6, v7}, Lax/i1/j0$b;-><init>(Lax/U0/g$a;)V

    .line 421
    .line 422
    .line 423
    iget-object v7, p0, Lax/i1/r;->f:Lax/m1/m;

    .line 424
    .line 425
    if-eqz v7, :cond_1ad

    .line 426
    .line 427
    invoke-virtual {v6, v7}, Lax/i1/j0$b;->b(Lax/m1/m;)Lax/i1/j0$b;

    .line 428
    .line 429
    .line 430
    :cond_1ad
    add-int/lit8 v7, v0, 0x1

    .line 431
    .line 432
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    check-cast v8, Lax/P0/y$k;

    .line 437
    .line 438
    invoke-virtual {v6, v8, v4, v5}, Lax/i1/j0$b;->a(Lax/P0/y$k;J)Lax/i1/j0;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    aput-object v6, v2, v7

    .line 443
    .line 444
    :goto_1bb
    add-int/lit8 v0, v0, 0x1

    .line 445
    .line 446
    goto/16 :goto_ee

    .line 447
    .line 448
    :cond_1bf
    new-instance v0, Lax/i1/S;

    .line 449
    .line 450
    invoke-direct {v0, v2}, Lax/i1/S;-><init>([Lax/i1/F;)V

    .line 451
    .line 452
    .line 453
    :cond_1c4
    invoke-static {p1, v0}, Lax/i1/r;->m(Lax/P0/y;Lax/i1/F;)Lax/i1/F;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-direct {p0, p1, v0}, Lax/i1/r;->n(Lax/P0/y;Lax/i1/F;)Lax/i1/F;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    return-object p1

    .line 462
    :catch_1cd
    move-exception p1

    .line 463
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 464
    .line 465
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    throw v0
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public bridge synthetic f(Lax/b1/z;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->r(Lax/b1/z;)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public bridge synthetic g(Lax/m1/m;)Lax/i1/F$a;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/i1/r;->s(Lax/m1/m;)Lax/i1/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public k(Z)Lax/i1/r;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lax/i1/r;->l:Z

    .line 2
    .line 3
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lax/i1/r$a;->n(Z)V

    .line 6
    .line 7
    .line 8
    return-object p0
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

.method public l(I)Lax/i1/r;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/i1/r$a;->i(I)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public q(Lax/m1/f$a;)Lax/i1/r;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 2
    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/m1/f$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lax/i1/r$a;->h(Lax/m1/f$a;)V

    .line 10
    .line 11
    .line 12
    return-object p0
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

.method public r(Lax/b1/z;)Lax/i1/r;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 2
    .line 3
    const-string v1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 4
    .line 5
    invoke-static {p1, v1}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lax/b1/z;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/i1/r$a;->k(Lax/b1/z;)V

    .line 12
    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public s(Lax/m1/m;)Lax/i1/r;
    .registers 3

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/S0/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/m1/m;

    .line 8
    .line 9
    iput-object v0, p0, Lax/i1/r;->f:Lax/m1/m;

    .line 10
    .line 11
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/i1/r$a;->m(Lax/m1/m;)V

    .line 14
    .line 15
    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public t(Lax/N1/t$a;)Lax/i1/r;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/N1/t$a;

    .line 6
    .line 7
    iput-object v0, p0, Lax/i1/r;->c:Lax/N1/t$a;

    .line 8
    .line 9
    iget-object v0, p0, Lax/i1/r;->a:Lax/i1/r$a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/i1/r$a;->o(Lax/N1/t$a;)V

    .line 12
    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
