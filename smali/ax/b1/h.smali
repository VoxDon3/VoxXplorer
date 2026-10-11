.class public Lax/b1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b1/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/b1/h$g;,
        Lax/b1/h$h;,
        Lax/b1/h$c;,
        Lax/b1/h$f;,
        Lax/b1/h$e;,
        Lax/b1/h$d;,
        Lax/b1/h$b;
    }
.end annotation


# instance fields
.field private final b:Ljava/util/UUID;

.field private final c:Lax/b1/E$c;

.field private final d:Lax/b1/S;

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Z

.field private final g:[I

.field private final h:Z

.field private final i:Lax/b1/h$g;

.field private final j:Lax/m1/m;

.field private final k:Lax/b1/h$h;

.field private final l:J

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/b1/g;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/b1/h$f;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/b1/g;",
            ">;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Lax/b1/E;

.field private r:Lax/b1/g;

.field private s:Lax/b1/g;

.field private t:Landroid/os/Looper;

.field private u:Landroid/os/Handler;

.field private v:I

.field private w:[B

.field private x:Lax/Z0/I1;

.field volatile y:Lax/b1/h$d;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lax/b1/E$c;Lax/b1/S;Ljava/util/HashMap;Z[IZLax/m1/m;J)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lax/b1/E$c;",
            "Lax/b1/S;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z[IZ",
            "Lax/m1/m;",
            "J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lax/P0/i;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 5
    iput-object p1, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 6
    iput-object p2, p0, Lax/b1/h;->c:Lax/b1/E$c;

    .line 7
    iput-object p3, p0, Lax/b1/h;->d:Lax/b1/S;

    .line 8
    iput-object p4, p0, Lax/b1/h;->e:Ljava/util/HashMap;

    .line 9
    iput-boolean p5, p0, Lax/b1/h;->f:Z

    .line 10
    iput-object p6, p0, Lax/b1/h;->g:[I

    .line 11
    iput-boolean p7, p0, Lax/b1/h;->h:Z

    .line 12
    iput-object p8, p0, Lax/b1/h;->j:Lax/m1/m;

    .line 13
    new-instance p1, Lax/b1/h$g;

    invoke-direct {p1, p0}, Lax/b1/h$g;-><init>(Lax/b1/h;)V

    iput-object p1, p0, Lax/b1/h;->i:Lax/b1/h$g;

    .line 14
    new-instance p1, Lax/b1/h$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lax/b1/h$h;-><init>(Lax/b1/h;Lax/b1/h$a;)V

    iput-object p1, p0, Lax/b1/h;->k:Lax/b1/h$h;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lax/b1/h;->v:I

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 17
    invoke-static {}, Lax/r7/d0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lax/b1/h;->n:Ljava/util/Set;

    .line 18
    invoke-static {}, Lax/r7/d0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lax/b1/h;->o:Ljava/util/Set;

    .line 19
    iput-wide p9, p0, Lax/b1/h;->l:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/UUID;Lax/b1/E$c;Lax/b1/S;Ljava/util/HashMap;Z[IZLax/m1/m;JLax/b1/h$a;)V
    .registers 12

    .line 1
    invoke-direct/range {p0 .. p10}, Lax/b1/h;-><init>(Ljava/util/UUID;Lax/b1/E$c;Lax/b1/S;Ljava/util/HashMap;Z[IZLax/m1/m;J)V

    return-void
.end method

.method private declared-synchronized A(Landroid/os/Looper;)V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 3
    .line 4
    if-nez v0, :cond_11

    .line 5
    .line 6
    iput-object p1, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/b1/h;->u:Landroid/os/Handler;

    .line 14
    .line 15
    goto :goto_1e

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    goto :goto_20

    .line 18
    :cond_11
    if-ne v0, p1, :cond_15

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_16

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    :goto_16
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/b1/h;->u:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1e
    .catchall {:try_start_1 .. :try_end_1e} :catchall_f

    .line 29
    .line 30
    .line 31
    :goto_1e
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_20
    :try_start_20
    monitor-exit p0
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_f

    .line 34
    throw p1
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

.method private B(IZ)Lax/b1/n;
    .registers 7

    .line 1
    iget-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/b1/E;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/b1/E;->n()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_15

    .line 16
    .line 17
    sget-boolean v1, Lax/b1/F;->d:Z

    .line 18
    .line 19
    if-eqz v1, :cond_15

    .line 20
    .line 21
    goto :goto_40

    .line 22
    :cond_15
    iget-object v1, p0, Lax/b1/h;->g:[I

    .line 23
    .line 24
    invoke-static {v1, p1}, Lax/S0/d0;->U0([II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v1, -0x1

    .line 29
    if-eq p1, v1, :cond_40

    .line 30
    .line 31
    invoke-interface {v0}, Lax/b1/E;->n()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v0, 0x1

    .line 36
    if-ne p1, v0, :cond_26

    .line 37
    .line 38
    goto :goto_40

    .line 39
    :cond_26
    iget-object p1, p0, Lax/b1/h;->r:Lax/b1/g;

    .line 40
    .line 41
    if-nez p1, :cond_3a

    .line 42
    .line 43
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1, v0, v3, p2}, Lax/b1/h;->y(Ljava/util/List;ZLax/b1/u$a;Z)Lax/b1/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p2, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lax/b1/h;->r:Lax/b1/g;

    .line 57
    .line 58
    goto :goto_3d

    .line 59
    :cond_3a
    invoke-virtual {p1, v3}, Lax/b1/g;->c(Lax/b1/u$a;)V

    .line 60
    .line 61
    .line 62
    :goto_3d
    iget-object p1, p0, Lax/b1/h;->r:Lax/b1/g;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_40
    :goto_40
    return-object v3
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

.method private C(Landroid/os/Looper;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b1/h;->y:Lax/b1/h$d;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/b1/h$d;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lax/b1/h$d;-><init>(Lax/b1/h;Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/b1/h;->y:Lax/b1/h$d;

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

.method private D()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 2
    .line 3
    if-eqz v0, :cond_26

    .line 4
    .line 5
    iget v0, p0, Lax/b1/h;->p:I

    .line 6
    .line 7
    if-nez v0, :cond_26

    .line 8
    .line 9
    iget-object v0, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_26

    .line 16
    .line 17
    iget-object v0, p0, Lax/b1/h;->n:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_26

    .line 24
    .line 25
    iget-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 26
    .line 27
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/b1/E;

    .line 32
    .line 33
    invoke-interface {v0}, Lax/b1/E;->d()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 38
    .line 39
    :cond_26
    return-void
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

.method private E()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/h;->o:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {v0}, Lax/r7/C;->t(Ljava/util/Collection;)Lax/r7/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/r7/C;->n()Lax/r7/j0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1b

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lax/b1/n;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {v1, v2}, Lax/b1/n;->a(Lax/b1/u$a;)V

    .line 25
    .line 26
    .line 27
    goto :goto_a

    .line 28
    :cond_1b
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private F()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b1/h;->n:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {v0}, Lax/r7/C;->t(Ljava/util/Collection;)Lax/r7/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/r7/C;->n()Lax/r7/j0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1a

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lax/b1/h$f;

    .line 22
    .line 23
    invoke-virtual {v1}, Lax/b1/h$f;->d()V

    .line 24
    .line 25
    .line 26
    goto :goto_a

    .line 27
    :cond_1a
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private H(Lax/b1/n;Lax/b1/u$a;)V
    .registers 7

    .line 1
    invoke-interface {p1, p2}, Lax/b1/n;->a(Lax/b1/u$a;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lax/b1/h;->l:J

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long p2, v0, v2

    .line 12
    .line 13
    if-eqz p2, :cond_12

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-interface {p1, p2}, Lax/b1/n;->a(Lax/b1/u$a;)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
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

.method private I(Z)V
    .registers 4

    .line 1
    const-string v0, "DefaultDrmSessionMgr"

    .line 2
    .line 3
    if-eqz p1, :cond_13

    .line 4
    .line 5
    iget-object p1, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 6
    .line 7
    if-nez p1, :cond_13

    .line 8
    .line 9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 25
    .line 26
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/os/Looper;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eq p1, v1, :cond_58

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "\nExpected thread: "

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, p1, v1}, Lax/S0/u;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    return-void
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

.method static synthetic f(Lax/b1/h;)Lax/b1/g;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->s:Lax/b1/g;

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

.method static synthetic g(Lax/b1/h;Lax/b1/g;)Lax/b1/g;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/b1/h;->s:Lax/b1/g;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic h(Lax/b1/h;)Lax/b1/h$g;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->i:Lax/b1/h$g;

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

.method static synthetic i(Lax/b1/h;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/b1/h;->D()V

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
    .line 22
.end method

.method static synthetic j(Lax/b1/h;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->n:Ljava/util/Set;

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

.method static synthetic l(Lax/b1/h;)Landroid/os/Looper;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->t:Landroid/os/Looper;

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

.method static synthetic m(Lax/b1/h;Landroid/os/Looper;Lax/b1/u$a;Lax/P0/v;Z)Lax/b1/n;
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/b1/h;->u(Landroid/os/Looper;Lax/b1/u$a;Lax/P0/v;Z)Lax/b1/n;

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

.method static synthetic n(Lax/b1/h;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->m:Ljava/util/List;

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

.method static synthetic o(Lax/b1/h;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/b1/h;->l:J

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
    .line 22
.end method

.method static synthetic p(Lax/b1/h;)Ljava/util/Set;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->o:Ljava/util/Set;

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

.method static synthetic q(Lax/b1/h;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->u:Landroid/os/Handler;

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

.method static synthetic r(Lax/b1/h;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/b1/h;->p:I

    .line 2
    .line 3
    return p0
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

.method static synthetic s(Lax/b1/h;)Lax/b1/g;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/b1/h;->r:Lax/b1/g;

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

.method static synthetic t(Lax/b1/h;Lax/b1/g;)Lax/b1/g;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/b1/h;->r:Lax/b1/g;

    .line 2
    .line 3
    return-object p1
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

.method private u(Landroid/os/Looper;Lax/b1/u$a;Lax/P0/v;Z)Lax/b1/n;
    .registers 9

    .line 1
    invoke-direct {p0, p1}, Lax/b1/h;->C(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p3, Lax/P0/v;->s:Lax/P0/o;

    .line 5
    .line 6
    if-nez p1, :cond_12

    .line 7
    .line 8
    iget-object p1, p3, Lax/P0/v;->o:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0, p1, p4}, Lax/b1/h;->B(IZ)Lax/b1/n;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_12
    iget-object p3, p0, Lax/b1/h;->w:[B

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez p3, :cond_4a

    .line 24
    .line 25
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lax/P0/o;

    .line 30
    .line 31
    iget-object p3, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-static {p1, p3, v0}, Lax/b1/h;->z(Lax/P0/o;Ljava/util/UUID;Z)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_4b

    .line 42
    .line 43
    new-instance p1, Lax/b1/h$e;

    .line 44
    .line 45
    iget-object p3, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 46
    .line 47
    invoke-direct {p1, p3, v1}, Lax/b1/h$e;-><init>(Ljava/util/UUID;Lax/b1/h$a;)V

    .line 48
    .line 49
    .line 50
    const-string p3, "DefaultDrmSessionMgr"

    .line 51
    .line 52
    const-string p4, "DRM error"

    .line 53
    .line 54
    invoke-static {p3, p4, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    if-eqz p2, :cond_3d

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Lax/b1/u$a;->l(Ljava/lang/Exception;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    new-instance p2, Lax/b1/C;

    .line 63
    .line 64
    new-instance p3, Lax/b1/n$a;

    .line 65
    .line 66
    const/16 p4, 0x1773

    .line 67
    .line 68
    invoke-direct {p3, p1, p4}, Lax/b1/n$a;-><init>(Ljava/lang/Throwable;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p2, p3}, Lax/b1/C;-><init>(Lax/b1/n$a;)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_4a
    move-object p1, v1

    .line 76
    :cond_4b
    iget-boolean p3, p0, Lax/b1/h;->f:Z

    .line 77
    .line 78
    if-nez p3, :cond_52

    .line 79
    .line 80
    iget-object v1, p0, Lax/b1/h;->s:Lax/b1/g;

    .line 81
    .line 82
    goto :goto_6d

    .line 83
    :cond_52
    iget-object p3, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    :cond_58
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_6d

    .line 94
    .line 95
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lax/b1/g;

    .line 100
    .line 101
    iget-object v3, v2, Lax/b1/g;->a:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v3, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_58

    .line 108
    .line 109
    move-object v1, v2

    .line 110
    :cond_6d
    :goto_6d
    if-nez v1, :cond_7f

    .line 111
    .line 112
    invoke-direct {p0, p1, v0, p2, p4}, Lax/b1/h;->y(Ljava/util/List;ZLax/b1/u$a;Z)Lax/b1/g;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-boolean p2, p0, Lax/b1/h;->f:Z

    .line 117
    .line 118
    if-nez p2, :cond_79

    .line 119
    .line 120
    iput-object p1, p0, Lax/b1/h;->s:Lax/b1/g;

    .line 121
    .line 122
    :cond_79
    iget-object p2, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_7f
    invoke-virtual {v1, p2}, Lax/b1/g;->c(Lax/b1/u$a;)V

    .line 129
    .line 130
    .line 131
    return-object v1
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

.method private static v(Lax/b1/n;)Z
    .registers 4

    .line 1
    invoke-interface {p0}, Lax/b1/n;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_9

    .line 8
    .line 9
    return v1

    .line 10
    :cond_9
    invoke-interface {p0}, Lax/b1/n;->g()Lax/b1/n$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lax/b1/n$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, Landroid/media/ResourceBusyException;

    .line 25
    .line 26
    if-nez v0, :cond_23

    .line 27
    .line 28
    invoke-static {p0}, Lax/b1/A;->e(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_22

    .line 33
    .line 34
    goto :goto_23

    .line 35
    :cond_22
    return v1

    .line 36
    :cond_23
    :goto_23
    return v2
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

.method private w(Lax/P0/o;)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/b1/h;->w:[B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v0, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lax/b1/h;->z(Lax/P0/o;Ljava/util/UUID;Z)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_3d

    .line 19
    .line 20
    iget v0, p1, Lax/P0/o;->e0:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_3c

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lax/P0/o;->e(I)Lax/P0/o$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v3, Lax/P0/i;->b:Ljava/util/UUID;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lax/P0/o$b;->c(Ljava/util/UUID;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3c

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v3, "DefaultDrmSessionMgr"

    .line 56
    .line 57
    invoke-static {v3, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3d

    .line 61
    :cond_3c
    return v2

    .line 62
    :cond_3d
    :goto_3d
    iget-object p1, p1, Lax/P0/o;->d0:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_6d

    .line 65
    .line 66
    const-string v0, "cenc"

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4a

    .line 73
    .line 74
    goto :goto_6d

    .line 75
    :cond_4a
    const-string v0, "cbcs"

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5a

    .line 82
    .line 83
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    const/16 v0, 0x19

    .line 86
    .line 87
    if-lt p1, v0, :cond_59

    .line 88
    .line 89
    return v1

    .line 90
    :cond_59
    return v2

    .line 91
    :cond_5a
    const-string v0, "cbc1"

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_6c

    .line 98
    .line 99
    const-string v0, "cens"

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_6b

    .line 106
    .line 107
    goto :goto_6c

    .line 108
    :cond_6b
    return v1

    .line 109
    :cond_6c
    :goto_6c
    return v2

    .line 110
    :cond_6d
    :goto_6d
    return v1
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

.method private x(Ljava/util/List;ZLax/b1/u$a;)Lax/b1/g;
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/o$b;",
            ">;Z",
            "Lax/b1/u$a;",
            ")",
            "Lax/b1/g;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/b1/h;->q:Lax/b1/E;

    .line 4
    .line 5
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lax/b1/h;->h:Z

    .line 9
    .line 10
    or-int v9, v1, p2

    .line 11
    .line 12
    new-instance v2, Lax/b1/g;

    .line 13
    .line 14
    iget-object v3, v0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 15
    .line 16
    iget-object v4, v0, Lax/b1/h;->q:Lax/b1/E;

    .line 17
    .line 18
    iget-object v5, v0, Lax/b1/h;->i:Lax/b1/h$g;

    .line 19
    .line 20
    iget-object v6, v0, Lax/b1/h;->k:Lax/b1/h$h;

    .line 21
    .line 22
    iget v8, v0, Lax/b1/h;->v:I

    .line 23
    .line 24
    iget-object v11, v0, Lax/b1/h;->w:[B

    .line 25
    .line 26
    iget-object v12, v0, Lax/b1/h;->e:Ljava/util/HashMap;

    .line 27
    .line 28
    iget-object v13, v0, Lax/b1/h;->d:Lax/b1/S;

    .line 29
    .line 30
    iget-object v1, v0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 31
    .line 32
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v14, v1

    .line 37
    check-cast v14, Landroid/os/Looper;

    .line 38
    .line 39
    iget-object v15, v0, Lax/b1/h;->j:Lax/m1/m;

    .line 40
    .line 41
    iget-object v1, v0, Lax/b1/h;->x:Lax/Z0/I1;

    .line 42
    .line 43
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object/from16 v16, v1

    .line 48
    .line 49
    check-cast v16, Lax/Z0/I1;

    .line 50
    .line 51
    move-object/from16 v7, p1

    .line 52
    .line 53
    move/from16 v10, p2

    .line 54
    .line 55
    invoke-direct/range {v2 .. v16}, Lax/b1/g;-><init>(Ljava/util/UUID;Lax/b1/E;Lax/b1/g$a;Lax/b1/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lax/b1/S;Landroid/os/Looper;Lax/m1/m;Lax/Z0/I1;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v1, p3

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lax/b1/g;->c(Lax/b1/u$a;)V

    .line 61
    .line 62
    .line 63
    iget-wide v3, v0, Lax/b1/h;->l:J

    .line 64
    .line 65
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v1, v3, v5

    .line 71
    .line 72
    if-eqz v1, :cond_4d

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v2, v1}, Lax/b1/g;->c(Lax/b1/u$a;)V

    .line 76
    .line 77
    .line 78
    :cond_4d
    return-object v2
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

.method private y(Ljava/util/List;ZLax/b1/u$a;Z)Lax/b1/g;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/P0/o$b;",
            ">;Z",
            "Lax/b1/u$a;",
            "Z)",
            "Lax/b1/g;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/b1/h;->x(Ljava/util/List;ZLax/b1/u$a;)Lax/b1/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/b1/h;->v(Lax/b1/n;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1c

    .line 10
    .line 11
    iget-object v1, p0, Lax/b1/h;->o:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1c

    .line 18
    .line 19
    invoke-direct {p0}, Lax/b1/h;->E()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, p3}, Lax/b1/h;->H(Lax/b1/n;Lax/b1/u$a;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lax/b1/h;->x(Ljava/util/List;ZLax/b1/u$a;)Lax/b1/g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1c
    invoke-static {v0}, Lax/b1/h;->v(Lax/b1/n;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_42

    .line 34
    .line 35
    if-eqz p4, :cond_42

    .line 36
    .line 37
    iget-object p4, p0, Lax/b1/h;->n:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    if-nez p4, :cond_42

    .line 44
    .line 45
    invoke-direct {p0}, Lax/b1/h;->F()V

    .line 46
    .line 47
    .line 48
    iget-object p4, p0, Lax/b1/h;->o:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-nez p4, :cond_3a

    .line 55
    .line 56
    invoke-direct {p0}, Lax/b1/h;->E()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    invoke-direct {p0, v0, p3}, Lax/b1/h;->H(Lax/b1/n;Lax/b1/u$a;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1, p2, p3}, Lax/b1/h;->x(Ljava/util/List;ZLax/b1/u$a;)Lax/b1/g;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_42
    return-object v0
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

.method private static z(Lax/P0/o;Ljava/util/UUID;Z)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/o;",
            "Ljava/util/UUID;",
            "Z)",
            "Ljava/util/List<",
            "Lax/P0/o$b;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lax/P0/o;->e0:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_8
    iget v2, p0, Lax/P0/o;->e0:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_32

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lax/P0/o;->e(I)Lax/P0/o$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, p1}, Lax/P0/o$b;->c(Ljava/util/UUID;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_26

    .line 22
    .line 23
    sget-object v3, Lax/P0/i;->c:Ljava/util/UUID;

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2f

    .line 30
    .line 31
    sget-object v3, Lax/P0/i;->b:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lax/P0/o$b;->c(Ljava/util/UUID;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2f

    .line 38
    .line 39
    :cond_26
    iget-object v3, v2, Lax/P0/o$b;->f0:[B

    .line 40
    .line 41
    if-nez v3, :cond_2c

    .line 42
    .line 43
    if-eqz p2, :cond_2f

    .line 44
    .line 45
    :cond_2c
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2f
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_8

    .line 51
    :cond_32
    return-object v0
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


# virtual methods
.method public G(I[B)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p1, v0, :cond_f

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p1, v0, :cond_12

    .line 15
    .line 16
    :cond_f
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_12
    iput p1, p0, Lax/b1/h;->v:I

    .line 20
    .line 21
    iput-object p2, p0, Lax/b1/h;->w:[B

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

.method public a(Lax/P0/v;)I
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/b1/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 6
    .line 7
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lax/b1/E;

    .line 12
    .line 13
    invoke-interface {v1}, Lax/b1/E;->n()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lax/P0/v;->s:Lax/P0/o;

    .line 18
    .line 19
    if-nez v2, :cond_25

    .line 20
    .line 21
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v2, p0, Lax/b1/h;->g:[I

    .line 28
    .line 29
    invoke-static {v2, p1}, Lax/S0/d0;->U0([II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v2, -0x1

    .line 34
    if-eq p1, v2, :cond_24

    .line 35
    .line 36
    goto :goto_2b

    .line 37
    :cond_24
    return v0

    .line 38
    :cond_25
    invoke-direct {p0, v2}, Lax/b1/h;->w(Lax/P0/o;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2c

    .line 43
    .line 44
    :goto_2b
    return v1

    .line 45
    :cond_2c
    const/4 p1, 0x1

    .line 46
    return p1
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

.method public b(Lax/b1/u$a;Lax/P0/v;)Lax/b1/n;
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/b1/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lax/b1/h;->p:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lez v1, :cond_a

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_a
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 15
    .line 16
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 20
    .line 21
    invoke-direct {p0, v0, p1, p2, v2}, Lax/b1/h;->u(Landroid/os/Looper;Lax/b1/u$a;Lax/P0/v;Z)Lax/b1/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
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

.method public c(Landroid/os/Looper;Lax/Z0/I1;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/b1/h;->A(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/b1/h;->x:Lax/Z0/I1;

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

.method public final d()V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/b1/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lax/b1/h;->p:I

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    iput v1, p0, Lax/b1/h;->p:I

    .line 9
    .line 10
    if-eqz v1, :cond_c

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-wide v0, p0, Lax/b1/h;->l:J

    .line 14
    .line 15
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, v2

    .line 21
    .line 22
    if-eqz v4, :cond_32

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v1, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_1f
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v1, v2, :cond_32

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lax/b1/g;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v2, v3}, Lax/b1/g;->a(Lax/b1/u$a;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1f

    .line 51
    :cond_32
    invoke-direct {p0}, Lax/b1/h;->F()V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lax/b1/h;->D()V

    .line 55
    .line 56
    .line 57
    return-void
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

.method public e(Lax/b1/u$a;Lax/P0/v;)Lax/b1/w$b;
    .registers 4

    .line 1
    iget v0, p0, Lax/b1/h;->p:I

    .line 2
    .line 3
    if-lez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/b1/h;->t:Landroid/os/Looper;

    .line 12
    .line 13
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lax/b1/h$f;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lax/b1/h$f;-><init>(Lax/b1/h;Lax/b1/u$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lax/b1/h$f;->c(Lax/P0/v;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public final k()V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/b1/h;->I(Z)V

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lax/b1/h;->p:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Lax/b1/h;->p:I

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_47

    .line 14
    :cond_d
    iget-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_25

    .line 18
    .line 19
    iget-object v0, p0, Lax/b1/h;->c:Lax/b1/E$c;

    .line 20
    .line 21
    iget-object v2, p0, Lax/b1/h;->b:Ljava/util/UUID;

    .line 22
    .line 23
    invoke-interface {v0, v2}, Lax/b1/E$c;->a(Ljava/util/UUID;)Lax/b1/E;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lax/b1/h;->q:Lax/b1/E;

    .line 28
    .line 29
    new-instance v2, Lax/b1/h$c;

    .line 30
    .line 31
    invoke-direct {v2, p0, v1}, Lax/b1/h$c;-><init>(Lax/b1/h;Lax/b1/h$a;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Lax/b1/E;->k(Lax/b1/E$b;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    iget-wide v2, p0, Lax/b1/h;->l:J

    .line 39
    .line 40
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v0, v2, v4

    .line 46
    .line 47
    if-eqz v0, :cond_47

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    :goto_31
    iget-object v2, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ge v0, v2, :cond_47

    .line 57
    .line 58
    iget-object v2, p0, Lax/b1/h;->m:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lax/b1/g;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Lax/b1/g;->c(Lax/b1/u$a;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_31

    .line 72
    :cond_47
    :goto_47
    return-void
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
