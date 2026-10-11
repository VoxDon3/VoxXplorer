.class public Lax/u0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/u0/c$f;,
        Lax/u0/c$b;,
        Lax/u0/c$e;,
        Lax/u0/c$d;,
        Lax/u0/c$c;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lax/u0/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lax/B/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/k<",
            "Lax/u0/c$c;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/u0/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/u0/c$b;

.field private final d:Ljava/lang/Runnable;

.field private e:Lax/u0/j;

.field f:J

.field private g:Z

.field public h:F

.field public i:Lax/u0/c$e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/u0/c;->j:Ljava/lang/ThreadLocal;

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

.method public constructor <init>(Lax/u0/j;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/B/k;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/B/k;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/u0/c;->a:Lax/B/k;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lax/u0/c$b;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, Lax/u0/c$b;-><init>(Lax/u0/c;Lax/u0/c$a;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/u0/c;->c:Lax/u0/c$b;

    .line 25
    .line 26
    new-instance v0, Lax/u0/b;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lax/u0/b;-><init>(Lax/u0/c;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/u0/c;->d:Ljava/lang/Runnable;

    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    iput-wide v0, p0, Lax/u0/c;->f:J

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lax/u0/c;->g:Z

    .line 39
    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    .line 42
    iput v0, p0, Lax/u0/c;->h:F

    .line 43
    .line 44
    iput-object p1, p0, Lax/u0/c;->e:Lax/u0/j;

    .line 45
    .line 46
    return-void
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

.method public static synthetic a(Lax/u0/c;)V
    .registers 1

    .line 1
    iget-object p0, p0, Lax/u0/c;->c:Lax/u0/c$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/u0/c$b;->a()V

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

.method static synthetic b(Lax/u0/c;)Ljava/lang/Runnable;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/u0/c;->d:Ljava/lang/Runnable;

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

.method static synthetic c(Lax/u0/c;)Lax/u0/j;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/u0/c;->e:Lax/u0/j;

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

.method private e()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/u0/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_34

    .line 4
    .line 5
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_c
    if-ltz v0, :cond_1e

    .line 14
    .line 15
    iget-object v1, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1b

    .line 22
    .line 23
    iget-object v1, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1b
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_c

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_31

    .line 38
    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v1, 0x21

    .line 42
    .line 43
    if-lt v0, v1, :cond_31

    .line 44
    .line 45
    iget-object v0, p0, Lax/u0/c;->i:Lax/u0/c$e;

    .line 46
    .line 47
    invoke-interface {v0}, Lax/u0/c$e;->b()Z

    .line 48
    .line 49
    .line 50
    :cond_31
    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Lax/u0/c;->g:Z

    .line 52
    .line 53
    :cond_34
    return-void
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

.method static h()Lax/u0/c;
    .registers 3

    .line 1
    sget-object v0, Lax/u0/c;->j:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_15

    .line 8
    .line 9
    new-instance v1, Lax/u0/c;

    .line 10
    .line 11
    new-instance v2, Lax/u0/c$f;

    .line 12
    .line 13
    invoke-direct {v2}, Lax/u0/c$f;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lax/u0/c;-><init>(Lax/u0/j;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lax/u0/c;

    .line 27
    .line 28
    return-object v0
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
.end method

.method private i(Lax/u0/c$c;J)Z
    .registers 8

    .line 1
    iget-object v0, p0, Lax/u0/c;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v0, v2, p2

    .line 18
    .line 19
    if-gez v0, :cond_1a

    .line 20
    .line 21
    iget-object p2, p0, Lax/u0/c;->a:Lax/B/k;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lax/B/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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
.method d(Lax/u0/c$c;J)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2b

    .line 8
    .line 9
    iget-object v0, p0, Lax/u0/c;->e:Lax/u0/j;

    .line 10
    .line 11
    iget-object v1, p0, Lax/u0/c;->d:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lax/u0/j;->a(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x21

    .line 19
    .line 20
    if-lt v0, v1, :cond_2b

    .line 21
    .line 22
    invoke-static {}, Lax/u0/a;->a()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lax/u0/c;->h:F

    .line 27
    .line 28
    iget-object v0, p0, Lax/u0/c;->i:Lax/u0/c$e;

    .line 29
    .line 30
    if-nez v0, :cond_26

    .line 31
    .line 32
    new-instance v0, Lax/u0/c$d;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lax/u0/c$d;-><init>(Lax/u0/c;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lax/u0/c;->i:Lax/u0/c$e;

    .line 38
    .line 39
    :cond_26
    iget-object v0, p0, Lax/u0/c;->i:Lax/u0/c$e;

    .line 40
    .line 41
    invoke-interface {v0}, Lax/u0/c$e;->a()Z

    .line 42
    .line 43
    .line 44
    :cond_2b
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_38

    .line 51
    .line 52
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_38
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    cmp-long v2, p2, v0

    .line 60
    .line 61
    if-lez v2, :cond_4c

    .line 62
    .line 63
    iget-object v0, p0, Lax/u0/c;->a:Lax/B/k;

    .line 64
    .line 65
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    add-long/2addr v1, p2

    .line 70
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v0, p1, p2}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_4c
    return-void
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

.method f(J)V
    .registers 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    iget-object v3, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_24

    .line 13
    .line 14
    iget-object v3, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lax/u0/c$c;

    .line 21
    .line 22
    if-nez v3, :cond_18

    .line 23
    .line 24
    goto :goto_21

    .line 25
    :cond_18
    invoke-direct {p0, v3, v0, v1}, Lax/u0/c;->i(Lax/u0/c$c;J)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_21

    .line 30
    .line 31
    invoke-interface {v3, p1, p2}, Lax/u0/c$c;->a(J)Z

    .line 32
    .line 33
    .line 34
    :cond_21
    :goto_21
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_5

    .line 37
    :cond_24
    invoke-direct {p0}, Lax/u0/c;->e()V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public g()F
    .registers 2

    .line 1
    iget v0, p0, Lax/u0/c;->h:F

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

.method j()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u0/c;->e:Lax/u0/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/u0/j;->b()Z

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

.method k(Lax/u0/c$c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/u0/c;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ltz p1, :cond_16

    .line 13
    .line 14
    iget-object v0, p0, Lax/u0/c;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lax/u0/c;->g:Z

    .line 22
    .line 23
    :cond_16
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
