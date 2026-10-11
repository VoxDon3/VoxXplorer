.class public final Lax/i1/Z;
.super Lax/i1/a;
.source "SourceFile"

# interfaces
.implements Lax/i1/Y$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/Z$b;
    }
.end annotation


# instance fields
.field private final h:Lax/U0/g$a;

.field private final i:Lax/i1/T$a;

.field private final j:Lax/b1/w;

.field private final k:Lax/m1/m;

.field private final l:I

.field private final m:I

.field private final n:Lax/P0/v;

.field private final o:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:J

.field private r:Z

.field private s:Z

.field private t:Lax/U0/z;

.field private u:Lax/P0/y;


# direct methods
.method private constructor <init>(Lax/P0/y;Lax/U0/g$a;Lax/i1/T$a;Lax/b1/w;Lax/m1/m;IILax/P0/v;Lax/q7/u;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/y;",
            "Lax/U0/g$a;",
            "Lax/i1/T$a;",
            "Lax/b1/w;",
            "Lax/m1/m;",
            "II",
            "Lax/P0/v;",
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lax/i1/a;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i1/Z;->u:Lax/P0/y;

    .line 4
    iput-object p2, p0, Lax/i1/Z;->h:Lax/U0/g$a;

    .line 5
    iput-object p3, p0, Lax/i1/Z;->i:Lax/i1/T$a;

    .line 6
    iput-object p4, p0, Lax/i1/Z;->j:Lax/b1/w;

    .line 7
    iput-object p5, p0, Lax/i1/Z;->k:Lax/m1/m;

    .line 8
    iput p6, p0, Lax/i1/Z;->l:I

    .line 9
    iput-object p8, p0, Lax/i1/Z;->n:Lax/P0/v;

    .line 10
    iput p7, p0, Lax/i1/Z;->m:I

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lax/i1/Z;->p:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    iput-wide p1, p0, Lax/i1/Z;->q:J

    .line 13
    iput-object p9, p0, Lax/i1/Z;->o:Lax/q7/u;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y;Lax/U0/g$a;Lax/i1/T$a;Lax/b1/w;Lax/m1/m;IILax/P0/v;Lax/q7/u;Lax/i1/Z$a;)V
    .registers 11

    .line 1
    invoke-direct/range {p0 .. p9}, Lax/i1/Z;-><init>(Lax/P0/y;Lax/U0/g$a;Lax/i1/T$a;Lax/b1/w;Lax/m1/m;IILax/P0/v;Lax/q7/u;)V

    return-void
.end method

.method private D()Lax/P0/y$h;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i1/Z;->j()Lax/P0/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lax/P0/y;->b:Lax/P0/y$h;

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/P0/y$h;

    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private E()V
    .registers 9

    .line 1
    new-instance v0, Lax/i1/h0;

    .line 2
    .line 3
    iget-wide v1, p0, Lax/i1/Z;->q:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lax/i1/Z;->r:Z

    .line 6
    .line 7
    iget-boolean v5, p0, Lax/i1/Z;->s:Z

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    invoke-virtual {p0}, Lax/i1/Z;->j()Lax/P0/y;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct/range {v0 .. v7}, Lax/i1/h0;-><init>(JZZZLjava/lang/Object;Lax/P0/y;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lax/i1/Z;->p:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1b

    .line 21
    .line 22
    new-instance v1, Lax/i1/Z$a;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lax/i1/Z$a;-><init>(Lax/i1/Z;Lax/P0/N;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :cond_1b
    invoke-virtual {p0, v0}, Lax/i1/a;->B(Lax/P0/N;)V

    .line 29
    .line 30
    .line 31
    return-void
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


# virtual methods
.method protected A(Lax/U0/z;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/i1/Z;->t:Lax/U0/z;

    .line 2
    .line 3
    iget-object p1, p0, Lax/i1/Z;->j:Lax/b1/w;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/os/Looper;

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/i1/a;->x()Lax/Z0/I1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lax/b1/w;->c(Landroid/os/Looper;Lax/Z0/I1;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/i1/Z;->j:Lax/b1/w;

    .line 23
    .line 24
    invoke-interface {p1}, Lax/b1/w;->k()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lax/i1/Z;->E()V

    .line 28
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
.end method

.method protected C()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/Z;->j:Lax/b1/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b1/w;->d()V

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

.method public declared-synchronized a(Lax/P0/y;)V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iput-object p1, p0, Lax/i1/Z;->u:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_5
    move-exception p1

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw p1
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

.method public e(Lax/i1/C;)V
    .registers 2

    .line 1
    check-cast p1, Lax/i1/Y;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/i1/Y;->f0()V

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

.method public h(JLax/q1/N;Z)V
    .registers 8

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-nez v2, :cond_b

    .line 9
    .line 10
    iget-wide p1, p0, Lax/i1/Z;->q:J

    .line 11
    .line 12
    :cond_b
    invoke-interface {p3}, Lax/q1/N;->i()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget-boolean v0, p0, Lax/i1/Z;->p:Z

    .line 17
    .line 18
    if-nez v0, :cond_22

    .line 19
    .line 20
    iget-wide v0, p0, Lax/i1/Z;->q:J

    .line 21
    .line 22
    cmp-long v2, v0, p1

    .line 23
    .line 24
    if-nez v2, :cond_22

    .line 25
    .line 26
    iget-boolean v0, p0, Lax/i1/Z;->r:Z

    .line 27
    .line 28
    if-ne v0, p3, :cond_22

    .line 29
    .line 30
    iget-boolean v0, p0, Lax/i1/Z;->s:Z

    .line 31
    .line 32
    if-ne v0, p4, :cond_22

    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iput-wide p1, p0, Lax/i1/Z;->q:J

    .line 36
    .line 37
    iput-boolean p3, p0, Lax/i1/Z;->r:Z

    .line 38
    .line 39
    iput-boolean p4, p0, Lax/i1/Z;->s:Z

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Lax/i1/Z;->p:Z

    .line 43
    .line 44
    invoke-direct {p0}, Lax/i1/Z;->E()V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;
    .registers 22

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, Lax/i1/Z;->h:Lax/U0/g$a;

    .line 4
    .line 5
    invoke-interface {v0}, Lax/U0/g$a;->a()Lax/U0/g;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, v8, Lax/i1/Z;->t:Lax/U0/z;

    .line 10
    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    invoke-interface {v2, v0}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    invoke-direct {v8}, Lax/i1/Z;->D()Lax/P0/y$h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lax/i1/Y;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    iget-object v1, v0, Lax/P0/y$h;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v4, v8, Lax/i1/Z;->i:Lax/i1/T$a;

    .line 26
    .line 27
    invoke-virtual {v8}, Lax/i1/a;->x()Lax/Z0/I1;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5}, Lax/i1/T$a;->a(Lax/Z0/I1;)Lax/i1/T;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, v3

    .line 36
    move-object v3, v4

    .line 37
    iget-object v4, v8, Lax/i1/Z;->j:Lax/b1/w;

    .line 38
    .line 39
    move-object v6, v5

    .line 40
    invoke-virtual/range {p0 .. p1}, Lax/i1/a;->s(Lax/i1/F$b;)Lax/b1/u$a;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v7, v6

    .line 45
    iget-object v6, v8, Lax/i1/Z;->k:Lax/m1/m;

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p1}, Lax/i1/a;->u(Lax/i1/F$b;)Lax/i1/N$a;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v10, v0, Lax/P0/y$h;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget v11, v8, Lax/i1/Z;->l:I

    .line 54
    .line 55
    iget v12, v8, Lax/i1/Z;->m:I

    .line 56
    .line 57
    iget-object v13, v8, Lax/i1/Z;->n:Lax/P0/v;

    .line 58
    .line 59
    iget-wide v14, v0, Lax/P0/y$h;->i:J

    .line 60
    .line 61
    invoke-static {v14, v15}, Lax/S0/d0;->a1(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v14

    .line 65
    iget-object v0, v8, Lax/i1/Z;->o:Lax/q7/u;

    .line 66
    .line 67
    if-eqz v0, :cond_51

    .line 68
    .line 69
    invoke-interface {v0}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lax/n1/c;

    .line 74
    .line 75
    :goto_4a
    move-object/from16 v16, v0

    .line 76
    .line 77
    move-object v0, v7

    .line 78
    move-object v7, v9

    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    goto :goto_53

    .line 82
    :cond_51
    const/4 v0, 0x0

    .line 83
    goto :goto_4a

    .line 84
    :goto_53
    invoke-direct/range {v0 .. v16}, Lax/i1/Y;-><init>(Landroid/net/Uri;Lax/U0/g;Lax/i1/T;Lax/b1/w;Lax/b1/u$a;Lax/m1/m;Lax/i1/N$a;Lax/i1/Y$c;Lax/m1/b;Ljava/lang/String;IILax/P0/v;JLax/n1/c;)V

    .line 85
    .line 86
    .line 87
    return-object v0
    .line 88
.end method

.method public declared-synchronized j()Lax/P0/y;
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/i1/Z;->u:Lax/P0/y;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_5
    move-exception v0

    .line 7
    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    .line 8
    throw v0
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

.method public k()V
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
