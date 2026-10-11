.class Lax/P3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/d$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lax/l4/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P3/f$h;,
        Lax/P3/f$g;,
        Lax/P3/f$e;,
        Lax/P3/f$b;,
        Lax/P3/f$d;,
        Lax/P3/f$f;,
        Lax/P3/f$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/P3/d$a;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lax/P3/f<",
        "*>;>;",
        "Lax/l4/a$f;"
    }
.end annotation


# instance fields
.field private A0:Lax/M3/a;

.field private B0:Lax/N3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/N3/b<",
            "*>;"
        }
    .end annotation
.end field

.field private volatile C0:Lax/P3/d;

.field private volatile D0:Z

.field private volatile E0:Z

.field private final c0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field

.field private final d0:Lax/l4/b;

.field private final e0:Lax/P3/f$e;

.field private final f0:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/P3/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field final g0:Lax/P3/f$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/f$d<",
            "*>;"
        }
    .end annotation
.end field

.field private final h0:Lax/P3/f$f;

.field private i0:Lax/J3/e;

.field j0:Lax/M3/h;

.field private k0:Lax/J3/g;

.field private l0:Lax/P3/l;

.field m0:I

.field n0:I

.field o0:Lax/P3/h;

.field p0:Lax/M3/j;

.field final q:Lax/P3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/e<",
            "TR;>;"
        }
    .end annotation
.end field

.field private q0:Lax/P3/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/f$b<",
            "TR;>;"
        }
    .end annotation
.end field

.field private r0:I

.field private s0:Lax/P3/f$h;

.field private t0:Lax/P3/f$g;

.field private u0:J

.field private v0:Z

.field private w0:Ljava/lang/Thread;

.field x0:Lax/M3/h;

.field private y0:Lax/M3/h;

.field private z0:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lax/P3/f$e;Lax/b0/d;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/f$e;",
            "Lax/b0/d<",
            "Lax/P3/f<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P3/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/P3/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/P3/f;->c0:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, Lax/l4/b;->a()Lax/l4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lax/P3/f;->d0:Lax/l4/b;

    .line 23
    .line 24
    new-instance v0, Lax/P3/f$d;

    .line 25
    .line 26
    invoke-direct {v0}, Lax/P3/f$d;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lax/P3/f;->g0:Lax/P3/f$d;

    .line 30
    .line 31
    new-instance v0, Lax/P3/f$f;

    .line 32
    .line 33
    invoke-direct {v0}, Lax/P3/f$f;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lax/P3/f;->h0:Lax/P3/f$f;

    .line 37
    .line 38
    iput-object p1, p0, Lax/P3/f;->e0:Lax/P3/f$e;

    .line 39
    .line 40
    iput-object p2, p0, Lax/P3/f;->f0:Lax/b0/d;

    .line 41
    .line 42
    return-void
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

.method private A()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/f;->k0:Lax/J3/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

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

.method private C(Ljava/lang/String;J)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lax/P3/f;->D(Ljava/lang/String;JLjava/lang/String;)V

    .line 3
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

.method private D(Ljava/lang/String;JLjava/lang/String;)V
    .registers 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p3}, Lax/k4/d;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ", load key: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/P3/f;->l0:Lax/P3/l;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    if-eqz p4, :cond_32

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, ", "

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_34

    .line 51
    :cond_32
    const-string p1, ""

    .line 52
    .line 53
    :goto_34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, ", thread: "

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string p2, "DecodeJob"

    .line 77
    .line 78
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

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
.end method

.method private E(Lax/P3/s;Lax/M3/a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "TR;>;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/P3/f;->O()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lax/P3/f$b;->b(Lax/P3/s;Lax/M3/a;)V

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

.method private F(Lax/P3/s;Lax/M3/a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "TR;>;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lax/P3/p;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lax/P3/p;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/P3/p;->a()V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/P3/f;->g0:Lax/P3/f$d;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/P3/f$d;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    invoke-static {p1}, Lax/P3/r;->c(Lax/P3/s;)Lax/P3/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    move-object v0, p1

    .line 24
    goto :goto_19

    .line 25
    :cond_18
    const/4 v0, 0x0

    .line 26
    :goto_19
    invoke-direct {p0, p1, p2}, Lax/P3/f;->E(Lax/P3/s;Lax/M3/a;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lax/P3/f$h;->f0:Lax/P3/f$h;

    .line 30
    .line 31
    iput-object p1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 32
    .line 33
    :try_start_20
    iget-object p1, p0, Lax/P3/f;->g0:Lax/P3/f$d;

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/P3/f$d;->c()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_34

    .line 40
    .line 41
    iget-object p1, p0, Lax/P3/f;->g0:Lax/P3/f$d;

    .line 42
    .line 43
    iget-object p2, p0, Lax/P3/f;->e0:Lax/P3/f$e;

    .line 44
    .line 45
    iget-object v1, p0, Lax/P3/f;->p0:Lax/M3/j;

    .line 46
    .line 47
    invoke-virtual {p1, p2, v1}, Lax/P3/f$d;->b(Lax/P3/f$e;Lax/M3/j;)V
    :try_end_31
    .catchall {:try_start_20 .. :try_end_31} :catchall_32

    .line 48
    .line 49
    .line 50
    goto :goto_34

    .line 51
    :catchall_32
    move-exception p1

    .line 52
    goto :goto_3d

    .line 53
    :cond_34
    :goto_34
    if-eqz v0, :cond_39

    .line 54
    .line 55
    invoke-virtual {v0}, Lax/P3/r;->e()V

    .line 56
    .line 57
    .line 58
    :cond_39
    invoke-direct {p0}, Lax/P3/f;->H()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_3d
    if-eqz v0, :cond_42

    .line 63
    .line 64
    invoke-virtual {v0}, Lax/P3/r;->e()V

    .line 65
    .line 66
    .line 67
    :cond_42
    invoke-direct {p0}, Lax/P3/f;->H()V

    .line 68
    .line 69
    .line 70
    throw p1
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

.method private G()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/P3/f;->O()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P3/o;

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Lax/P3/f;->c0:Ljava/util/List;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "Failed to load resource"

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lax/P3/o;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 19
    .line 20
    invoke-interface {v1, v0}, Lax/P3/f$b;->a(Lax/P3/o;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lax/P3/f;->I()V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method private H()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/f;->h0:Lax/P3/f$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P3/f$f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-direct {p0}, Lax/P3/f;->K()V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method private I()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/f;->h0:Lax/P3/f$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P3/f$f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-direct {p0}, Lax/P3/f;->K()V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method private K()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/P3/f;->h0:Lax/P3/f$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P3/f$f;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/P3/f;->g0:Lax/P3/f$d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/P3/f$d;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/P3/e;->a()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lax/P3/f;->D0:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lax/P3/f;->i0:Lax/J3/e;

    .line 21
    .line 22
    iput-object v1, p0, Lax/P3/f;->j0:Lax/M3/h;

    .line 23
    .line 24
    iput-object v1, p0, Lax/P3/f;->p0:Lax/M3/j;

    .line 25
    .line 26
    iput-object v1, p0, Lax/P3/f;->k0:Lax/J3/g;

    .line 27
    .line 28
    iput-object v1, p0, Lax/P3/f;->l0:Lax/P3/l;

    .line 29
    .line 30
    iput-object v1, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 31
    .line 32
    iput-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 33
    .line 34
    iput-object v1, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 35
    .line 36
    iput-object v1, p0, Lax/P3/f;->w0:Ljava/lang/Thread;

    .line 37
    .line 38
    iput-object v1, p0, Lax/P3/f;->x0:Lax/M3/h;

    .line 39
    .line 40
    iput-object v1, p0, Lax/P3/f;->z0:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, p0, Lax/P3/f;->A0:Lax/M3/a;

    .line 43
    .line 44
    iput-object v1, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 45
    .line 46
    const-wide/16 v1, 0x0

    .line 47
    .line 48
    iput-wide v1, p0, Lax/P3/f;->u0:J

    .line 49
    .line 50
    iput-boolean v0, p0, Lax/P3/f;->E0:Z

    .line 51
    .line 52
    iget-object v0, p0, Lax/P3/f;->c0:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lax/P3/f;->f0:Lax/b0/d;

    .line 58
    .line 59
    invoke-interface {v0, p0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private L()V
    .registers 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lax/P3/f;->w0:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {}, Lax/k4/d;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lax/P3/f;->u0:J

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_d
    iget-boolean v1, p0, Lax/P3/f;->E0:Z

    .line 15
    .line 16
    if-nez v1, :cond_35

    .line 17
    .line 18
    iget-object v1, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 19
    .line 20
    if-eqz v1, :cond_35

    .line 21
    .line 22
    iget-object v0, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 23
    .line 24
    invoke-interface {v0}, Lax/P3/d;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_35

    .line 29
    .line 30
    iget-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lax/P3/f;->w(Lax/P3/f$h;)Lax/P3/f$h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 37
    .line 38
    invoke-direct {p0}, Lax/P3/f;->u()Lax/P3/d;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 43
    .line 44
    iget-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 45
    .line 46
    sget-object v2, Lax/P3/f$h;->e0:Lax/P3/f$h;

    .line 47
    .line 48
    if-ne v1, v2, :cond_d

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/P3/f;->h()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    iget-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 55
    .line 56
    sget-object v2, Lax/P3/f$h;->g0:Lax/P3/f$h;

    .line 57
    .line 58
    if-eq v1, v2, :cond_3f

    .line 59
    .line 60
    iget-boolean v1, p0, Lax/P3/f;->E0:Z

    .line 61
    .line 62
    if-eqz v1, :cond_44

    .line 63
    .line 64
    :cond_3f
    if-nez v0, :cond_44

    .line 65
    .line 66
    invoke-direct {p0}, Lax/P3/f;->G()V

    .line 67
    .line 68
    .line 69
    :cond_44
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
.end method

.method private M(Ljava/lang/Object;Lax/M3/a;Lax/P3/q;)Lax/P3/s;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "ResourceType:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lax/M3/a;",
            "Lax/P3/q<",
            "TData;TResourceType;TR;>;)",
            "Lax/P3/s<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P3/o;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lax/P3/f;->x(Lax/M3/a;)Lax/M3/j;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v0, p0, Lax/P3/f;->i0:Lax/J3/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/J3/e;->f()Lax/J3/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lax/J3/h;->i(Ljava/lang/Object;)Lax/N3/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_e
    iget v3, p0, Lax/P3/f;->m0:I

    .line 16
    .line 17
    iget v4, p0, Lax/P3/f;->n0:I

    .line 18
    .line 19
    new-instance v5, Lax/P3/f$c;

    .line 20
    .line 21
    invoke-direct {v5, p0, p2}, Lax/P3/f$c;-><init>(Lax/P3/f;Lax/M3/a;)V

    .line 22
    .line 23
    .line 24
    move-object v0, p3

    .line 25
    invoke-virtual/range {v0 .. v5}, Lax/P3/q;->a(Lax/N3/c;Lax/M3/j;IILax/P3/g$a;)Lax/P3/s;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_1c
    .catchall {:try_start_e .. :try_end_1c} :catchall_20

    .line 29
    invoke-interface {v1}, Lax/N3/c;->b()V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_20
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    invoke-interface {v1}, Lax/N3/c;->b()V

    .line 36
    .line 37
    .line 38
    throw p1
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

.method private N()V
    .registers 4

    .line 1
    sget-object v0, Lax/P3/f$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_34

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_30

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_17

    .line 19
    .line 20
    invoke-direct {p0}, Lax/P3/f;->t()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Unrecognized run reason: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_30
    invoke-direct {p0}, Lax/P3/f;->L()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    sget-object v0, Lax/P3/f$h;->q:Lax/P3/f$h;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lax/P3/f;->w(Lax/P3/f$h;)Lax/P3/f$h;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 60
    .line 61
    invoke-direct {p0}, Lax/P3/f;->u()Lax/P3/d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 66
    .line 67
    invoke-direct {p0}, Lax/P3/f;->L()V

    .line 68
    .line 69
    .line 70
    return-void
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
.end method

.method private O()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P3/f;->d0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/P3/f;->D0:Z

    .line 7
    .line 8
    if-nez v0, :cond_d

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/P3/f;->D0:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Already notified"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method static synthetic n(Lax/P3/f;)Lax/J3/e;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P3/f;->i0:Lax/J3/e;

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

.method private r(Lax/N3/b;Ljava/lang/Object;Lax/M3/a;)Lax/P3/s;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/N3/b<",
            "*>;TData;",
            "Lax/M3/a;",
            ")",
            "Lax/P3/s<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P3/o;
        }
    .end annotation

    .line 1
    if-nez p2, :cond_7

    .line 2
    .line 3
    invoke-interface {p1}, Lax/N3/b;->b()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :cond_7
    :try_start_7
    invoke-static {}, Lax/k4/d;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-direct {p0, p2, p3}, Lax/P3/f;->s(Ljava/lang/Object;Lax/M3/a;)Lax/P3/s;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string p3, "DecodeJob"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_2f

    .line 24
    .line 25
    new-instance p3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Decoded result "

    .line 31
    .line 32
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-direct {p0, p3, v0, v1}, Lax/P3/f;->C(Ljava/lang/String;J)V
    :try_end_2c
    .catchall {:try_start_7 .. :try_end_2c} :catchall_2d

    .line 43
    .line 44
    .line 45
    goto :goto_2f

    .line 46
    :catchall_2d
    move-exception p2

    .line 47
    goto :goto_33

    .line 48
    :cond_2f
    :goto_2f
    invoke-interface {p1}, Lax/N3/b;->b()V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :goto_33
    invoke-interface {p1}, Lax/N3/b;->b()V

    .line 53
    .line 54
    .line 55
    throw p2
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

.method private s(Ljava/lang/Object;Lax/M3/a;)Lax/P3/s;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lax/M3/a;",
            ")",
            "Lax/P3/s<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P3/o;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lax/P3/e;->g(Ljava/lang/Class;)Lax/P3/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lax/P3/f;->M(Ljava/lang/Object;Lax/M3/a;Lax/P3/q;)Lax/P3/s;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private t()V
    .registers 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_37

    .line 9
    .line 10
    iget-wide v0, p0, Lax/P3/f;->u0:J

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "data: "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lax/P3/f;->z0:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v3, ", cache key: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lax/P3/f;->x0:Lax/M3/h;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v3, ", fetcher: "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "Retrieved data"

    .line 52
    .line 53
    invoke-direct {p0, v3, v0, v1, v2}, Lax/P3/f;->D(Ljava/lang/String;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_37
    :try_start_37
    iget-object v0, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 57
    .line 58
    iget-object v1, p0, Lax/P3/f;->z0:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v2, p0, Lax/P3/f;->A0:Lax/M3/a;

    .line 61
    .line 62
    invoke-direct {p0, v0, v1, v2}, Lax/P3/f;->r(Lax/N3/b;Ljava/lang/Object;Lax/M3/a;)Lax/P3/s;

    .line 63
    .line 64
    .line 65
    move-result-object v0
    :try_end_41
    .catch Lax/P3/o; {:try_start_37 .. :try_end_41} :catch_42

    .line 66
    goto :goto_50

    .line 67
    :catch_42
    move-exception v0

    .line 68
    iget-object v1, p0, Lax/P3/f;->y0:Lax/M3/h;

    .line 69
    .line 70
    iget-object v2, p0, Lax/P3/f;->A0:Lax/M3/a;

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Lax/P3/o;->i(Lax/M3/h;Lax/M3/a;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lax/P3/f;->c0:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    :goto_50
    if-eqz v0, :cond_58

    .line 82
    .line 83
    iget-object v1, p0, Lax/P3/f;->A0:Lax/M3/a;

    .line 84
    .line 85
    invoke-direct {p0, v0, v1}, Lax/P3/f;->F(Lax/P3/s;Lax/M3/a;)V

    .line 86
    .line 87
    .line 88
    goto :goto_5b

    .line 89
    :cond_58
    invoke-direct {p0}, Lax/P3/f;->L()V

    .line 90
    .line 91
    .line 92
    :goto_5b
    return-void
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
.end method

.method private u()Lax/P3/d;
    .registers 4

    .line 1
    sget-object v0, Lax/P3/f$a;->b:[I

    .line 2
    .line 3
    iget-object v1, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_41

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_39

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_31

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-ne v0, v1, :cond_18

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "Unrecognized stage: "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_31
    new-instance v0, Lax/P3/w;

    .line 51
    .line 52
    iget-object v1, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 53
    .line 54
    invoke-direct {v0, v1, p0}, Lax/P3/w;-><init>(Lax/P3/e;Lax/P3/d$a;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_39
    new-instance v0, Lax/P3/a;

    .line 59
    .line 60
    iget-object v1, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, Lax/P3/a;-><init>(Lax/P3/e;Lax/P3/d$a;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_41
    new-instance v0, Lax/P3/t;

    .line 67
    .line 68
    iget-object v1, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Lax/P3/t;-><init>(Lax/P3/e;Lax/P3/d$a;)V

    .line 71
    .line 72
    .line 73
    return-object v0
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
.end method

.method private w(Lax/P3/f$h;)Lax/P3/f$h;
    .registers 5

    .line 1
    sget-object v0, Lax/P3/f$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_4d

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_43

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_40

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_40

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_29

    .line 23
    .line 24
    iget-object p1, p0, Lax/P3/f;->o0:Lax/P3/h;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/P3/h;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_22

    .line 31
    .line 32
    sget-object p1, Lax/P3/f$h;->c0:Lax/P3/f$h;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_22
    sget-object p1, Lax/P3/f$h;->c0:Lax/P3/f$h;

    .line 36
    .line 37
    invoke-direct {p0, p1}, Lax/P3/f;->w(Lax/P3/f$h;)Lax/P3/f$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "Unrecognized stage: "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_40
    sget-object p1, Lax/P3/f$h;->g0:Lax/P3/f$h;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_43
    iget-boolean p1, p0, Lax/P3/f;->v0:Z

    .line 69
    .line 70
    if-eqz p1, :cond_4a

    .line 71
    .line 72
    sget-object p1, Lax/P3/f$h;->g0:Lax/P3/f$h;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_4a
    sget-object p1, Lax/P3/f$h;->e0:Lax/P3/f$h;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4d
    iget-object p1, p0, Lax/P3/f;->o0:Lax/P3/h;

    .line 79
    .line 80
    invoke-virtual {p1}, Lax/P3/h;->a()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_58

    .line 85
    .line 86
    sget-object p1, Lax/P3/f$h;->d0:Lax/P3/f$h;

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_58
    sget-object p1, Lax/P3/f$h;->d0:Lax/P3/f$h;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lax/P3/f;->w(Lax/P3/f$h;)Lax/P3/f$h;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
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

.method private x(Lax/M3/a;)Lax/M3/j;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/P3/f;->p0:Lax/M3/j;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-ge v1, v2, :cond_9

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    sget-object v1, Lax/X3/i;->i:Lax/M3/i;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lax/M3/j;->c(Lax/M3/i;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_12

    .line 17
    .line 18
    goto :goto_1f

    .line 19
    :cond_12
    sget-object v2, Lax/M3/a;->e0:Lax/M3/a;

    .line 20
    .line 21
    if-eq p1, v2, :cond_20

    .line 22
    .line 23
    iget-object p1, p0, Lax/P3/f;->q:Lax/P3/e;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/P3/e;->t()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1f

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    :goto_1f
    return-object v0

    .line 33
    :cond_20
    :goto_20
    new-instance p1, Lax/M3/j;

    .line 34
    .line 35
    invoke-direct {p1}, Lax/M3/j;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lax/P3/f;->p0:Lax/M3/j;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lax/M3/j;->d(Lax/M3/j;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Lax/M3/j;->e(Lax/M3/i;Ljava/lang/Object;)Lax/M3/j;

    .line 46
    .line 47
    .line 48
    return-object p1
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


# virtual methods
.method B(Lax/J3/e;Ljava/lang/Object;Lax/P3/l;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZZLax/M3/j;Lax/P3/f$b;I)Lax/P3/f;
    .registers 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Lax/P3/l;",
            "Lax/M3/h;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/J3/g;",
            "Lax/P3/h;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;ZZZ",
            "Lax/M3/j;",
            "Lax/P3/f$b<",
            "TR;>;I)",
            "Lax/P3/f<",
            "TR;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/P3/f;->q:Lax/P3/e;

    .line 4
    .line 5
    iget-object v15, v0, Lax/P3/f;->e0:Lax/P3/f$e;

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    move-object/from16 v3, p2

    .line 10
    .line 11
    move-object/from16 v4, p4

    .line 12
    .line 13
    move/from16 v5, p5

    .line 14
    .line 15
    move/from16 v6, p6

    .line 16
    .line 17
    move-object/from16 v8, p7

    .line 18
    .line 19
    move-object/from16 v9, p8

    .line 20
    .line 21
    move-object/from16 v10, p9

    .line 22
    .line 23
    move-object/from16 v7, p10

    .line 24
    .line 25
    move-object/from16 v12, p11

    .line 26
    .line 27
    move/from16 v13, p12

    .line 28
    .line 29
    move/from16 v14, p13

    .line 30
    .line 31
    move-object/from16 v11, p15

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v15}, Lax/P3/e;->r(Lax/J3/e;Ljava/lang/Object;Lax/M3/h;IILax/P3/h;Ljava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/M3/j;Ljava/util/Map;ZZLax/P3/f$e;)Lax/P3/e;

    .line 34
    .line 35
    .line 36
    iput-object v2, v0, Lax/P3/f;->i0:Lax/J3/e;

    .line 37
    .line 38
    iput-object v4, v0, Lax/P3/f;->j0:Lax/M3/h;

    .line 39
    .line 40
    iput-object v10, v0, Lax/P3/f;->k0:Lax/J3/g;

    .line 41
    .line 42
    move-object/from16 v1, p3

    .line 43
    .line 44
    iput-object v1, v0, Lax/P3/f;->l0:Lax/P3/l;

    .line 45
    .line 46
    iput v5, v0, Lax/P3/f;->m0:I

    .line 47
    .line 48
    iput v6, v0, Lax/P3/f;->n0:I

    .line 49
    .line 50
    iput-object v7, v0, Lax/P3/f;->o0:Lax/P3/h;

    .line 51
    .line 52
    move/from16 v1, p14

    .line 53
    .line 54
    iput-boolean v1, v0, Lax/P3/f;->v0:Z

    .line 55
    .line 56
    iput-object v11, v0, Lax/P3/f;->p0:Lax/M3/j;

    .line 57
    .line 58
    move-object/from16 v1, p16

    .line 59
    .line 60
    iput-object v1, v0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 61
    .line 62
    move/from16 v1, p17

    .line 63
    .line 64
    iput v1, v0, Lax/P3/f;->r0:I

    .line 65
    .line 66
    sget-object v1, Lax/P3/f$g;->q:Lax/P3/f$g;

    .line 67
    .line 68
    iput-object v1, v0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 69
    .line 70
    return-object v0
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
.end method

.method J(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P3/f;->h0:Lax/P3/f$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P3/f$f;->d(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    invoke-direct {p0}, Lax/P3/f;->K()V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method P()Z
    .registers 3

    .line 1
    sget-object v0, Lax/P3/f$h;->q:Lax/P3/f$h;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/P3/f;->w(Lax/P3/f$h;)Lax/P3/f$h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/P3/f$h;->c0:Lax/P3/f$h;

    .line 8
    .line 9
    if-eq v0, v1, :cond_11

    .line 10
    .line 11
    sget-object v1, Lax/P3/f$h;->d0:Lax/P3/f$h;

    .line 12
    .line 13
    if-ne v0, v1, :cond_f

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x1

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lax/P3/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/P3/f;->q(Lax/P3/f;)I

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

.method public d(Lax/M3/h;Ljava/lang/Object;Lax/N3/b;Lax/M3/a;Lax/M3/h;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Ljava/lang/Object;",
            "Lax/N3/b<",
            "*>;",
            "Lax/M3/a;",
            "Lax/M3/h;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/P3/f;->x0:Lax/M3/h;

    .line 2
    .line 3
    iput-object p2, p0, Lax/P3/f;->z0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 6
    .line 7
    iput-object p4, p0, Lax/P3/f;->A0:Lax/M3/a;

    .line 8
    .line 9
    iput-object p5, p0, Lax/P3/f;->y0:Lax/M3/h;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lax/P3/f;->w0:Ljava/lang/Thread;

    .line 16
    .line 17
    if-eq p1, p2, :cond_1c

    .line 18
    .line 19
    sget-object p1, Lax/P3/f$g;->d0:Lax/P3/f$g;

    .line 20
    .line 21
    iput-object p1, p0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 22
    .line 23
    iget-object p1, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 24
    .line 25
    invoke-interface {p1, p0}, Lax/P3/f$b;->c(Lax/P3/f;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    .line 30
    .line 31
    invoke-static {p1}, Lax/Y/u;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_21
    invoke-direct {p0}, Lax/P3/f;->t()V
    :try_end_24
    .catchall {:try_start_21 .. :try_end_24} :catchall_28

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lax/Y/u;->b()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_28
    move-exception p1

    .line 42
    invoke-static {}, Lax/Y/u;->b()V

    .line 43
    .line 44
    .line 45
    throw p1
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

.method public h()V
    .registers 2

    .line 1
    sget-object v0, Lax/P3/f$g;->c0:Lax/P3/f$g;

    .line 2
    .line 3
    iput-object v0, p0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 4
    .line 5
    iget-object v0, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lax/P3/f$b;->c(Lax/P3/f;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public j(Lax/M3/h;Ljava/lang/Exception;Lax/N3/b;Lax/M3/a;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Ljava/lang/Exception;",
            "Lax/N3/b<",
            "*>;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Lax/N3/b;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P3/o;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lax/P3/o;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Lax/N3/b;->a()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p1, p4, p2}, Lax/P3/o;->j(Lax/M3/h;Lax/M3/a;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lax/P3/f;->c0:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, Lax/P3/f;->w0:Ljava/lang/Thread;

    .line 28
    .line 29
    if-eq p1, p2, :cond_28

    .line 30
    .line 31
    sget-object p1, Lax/P3/f$g;->c0:Lax/P3/f$g;

    .line 32
    .line 33
    iput-object p1, p0, Lax/P3/f;->t0:Lax/P3/f$g;

    .line 34
    .line 35
    iget-object p1, p0, Lax/P3/f;->q0:Lax/P3/f$b;

    .line 36
    .line 37
    invoke-interface {p1, p0}, Lax/P3/f$b;->c(Lax/P3/f;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    invoke-direct {p0}, Lax/P3/f;->L()V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method public l()Lax/l4/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/f;->d0:Lax/l4/b;

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

.method public p()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/P3/f;->E0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/f;->C0:Lax/P3/d;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-interface {v0}, Lax/P3/d;->cancel()V

    .line 9
    .line 10
    .line 11
    :cond_a
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

.method public q(Lax/P3/f;)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/f<",
            "*>;)I"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/P3/f;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p1}, Lax/P3/f;->A()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    iget v0, p0, Lax/P3/f;->r0:I

    .line 13
    .line 14
    iget p1, p1, Lax/P3/f;->r0:I

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    :cond_10
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public run()V
    .registers 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob#run"

    .line 4
    .line 5
    invoke-static {v1}, Lax/Y/u;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_7
    iget-boolean v1, p0, Lax/P3/f;->E0:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1d

    .line 11
    .line 12
    invoke-direct {p0}, Lax/P3/f;->G()V
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_e} :catch_1b
    .catchall {:try_start_7 .. :try_end_e} :catchall_19

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-interface {v0}, Lax/N3/b;->b()V

    .line 20
    .line 21
    .line 22
    :cond_15
    invoke-static {}, Lax/Y/u;->b()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_19
    move-exception v0

    .line 27
    goto :goto_6b

    .line 28
    :catch_1b
    move-exception v1

    .line 29
    goto :goto_2b

    .line 30
    :cond_1d
    :try_start_1d
    invoke-direct {p0}, Lax/P3/f;->N()V
    :try_end_20
    .catch Ljava/lang/RuntimeException; {:try_start_1d .. :try_end_20} :catch_1b
    .catchall {:try_start_1d .. :try_end_20} :catchall_19

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 34
    .line 35
    if-eqz v0, :cond_27

    .line 36
    .line 37
    invoke-interface {v0}, Lax/N3/b;->b()V

    .line 38
    .line 39
    .line 40
    :cond_27
    invoke-static {}, Lax/Y/u;->b()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_2b
    const/4 v2, 0x3

    .line 45
    :try_start_2c
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_52

    .line 50
    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v3, "DecodeJob threw unexpectedly, isCancelled: "

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-boolean v3, p0, Lax/P3/f;->E0:Z

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, ", stage: "

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v3, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v0, v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    :cond_52
    iget-object v0, p0, Lax/P3/f;->s0:Lax/P3/f$h;

    .line 84
    .line 85
    sget-object v2, Lax/P3/f$h;->f0:Lax/P3/f$h;

    .line 86
    .line 87
    if-eq v0, v2, :cond_5b

    .line 88
    .line 89
    invoke-direct {p0}, Lax/P3/f;->G()V

    .line 90
    .line 91
    .line 92
    :cond_5b
    iget-boolean v0, p0, Lax/P3/f;->E0:Z
    :try_end_5d
    .catchall {:try_start_2c .. :try_end_5d} :catchall_19

    .line 93
    .line 94
    if-eqz v0, :cond_6a

    .line 95
    .line 96
    iget-object v0, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 97
    .line 98
    if-eqz v0, :cond_66

    .line 99
    .line 100
    invoke-interface {v0}, Lax/N3/b;->b()V

    .line 101
    .line 102
    .line 103
    :cond_66
    invoke-static {}, Lax/Y/u;->b()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_6a
    :try_start_6a
    throw v1
    :try_end_6b
    .catchall {:try_start_6a .. :try_end_6b} :catchall_19

    .line 108
    :goto_6b
    iget-object v1, p0, Lax/P3/f;->B0:Lax/N3/b;

    .line 109
    .line 110
    if-eqz v1, :cond_72

    .line 111
    .line 112
    invoke-interface {v1}, Lax/N3/b;->b()V

    .line 113
    .line 114
    .line 115
    :cond_72
    invoke-static {}, Lax/Y/u;->b()V

    .line 116
    .line 117
    .line 118
    throw v0
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
.end method
