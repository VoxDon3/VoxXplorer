.class public Lax/c3/a;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Lax/Dc/I;

.field private l0:Ljava/lang/String;

.field private m0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/c3/a;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Ljava/io/File;

.field private o0:Lax/c3/a;

.field private p0:Ljava/lang/String;

.field private q0:Ljava/lang/String;

.field private r0:Z


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/b;Lax/Dc/I;Lax/c3/a;)V
    .registers 6

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    if-nez p3, :cond_12

    .line 2
    const-string v0, "/"

    invoke-virtual {p2}, Lax/Dc/I;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 3
    :cond_12
    iput-object p3, p0, Lax/c3/a;->o0:Lax/c3/a;

    .line 4
    iput-object p2, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 5
    invoke-virtual {p2}, Lax/Dc/I;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lax/c3/a;->p0:Ljava/lang/String;

    .line 6
    invoke-virtual {p2}, Lax/Dc/I;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_31

    .line 7
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 8
    :cond_31
    invoke-direct {p0}, Lax/c3/a;->g0()V

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/b;->D0()Z

    move-result p1

    iput-boolean p1, p0, Lax/c3/a;->r0:Z

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/b;Lax/c3/a;Lax/Dc/I;Ljava/util/List;Ljava/lang/String;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/b;",
            "Lax/c3/a;",
            "Lax/Dc/I;",
            "Ljava/util/List<",
            "Lax/c3/a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    if-nez p2, :cond_12

    .line 11
    const-string v0, "/"

    invoke-virtual {p3}, Lax/Dc/I;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 12
    :cond_12
    iput-object p2, p0, Lax/c3/a;->o0:Lax/c3/a;

    .line 13
    iput-object p3, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 14
    iput-object p5, p0, Lax/c3/a;->p0:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 16
    invoke-direct {p0}, Lax/c3/a;->g0()V

    .line 17
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/b;->D0()Z

    move-result p1

    iput-boolean p1, p0, Lax/c3/a;->r0:Z

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V
    .registers 3

    .line 18
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 19
    iput-object p2, p0, Lax/c3/a;->q0:Ljava/lang/String;

    .line 20
    invoke-direct {p0}, Lax/c3/a;->g0()V

    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/b;->D0()Z

    move-result p1

    iput-boolean p1, p0, Lax/c3/a;->r0:Z

    return-void
.end method

.method private g0()V
    .registers 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lax/c3/a;->l0:Ljava/lang/String;

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


# virtual methods
.method public C()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

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

.method public F()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1e

    .line 6
    .line 7
    iget-object v0, p0, Lax/c3/a;->o0:Lax/c3/a;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    sget-object v0, Lax/c3/d0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lax/c3/a;->p0:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lax/c3/a;->p0:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/c3/a;->q0:Ljava/lang/String;

    .line 32
    .line 33
    return-object v0
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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/c3/a;->f0(Lcom/voxdon/xplorer/file/n;)I

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

.method public d()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public e0(Lax/c3/a;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_e
    iget-object v1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_14
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_34

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lax/c3/a;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_14

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 48
    .line 49
    .line 50
    goto :goto_14

    .line 51
    :catchall_32
    move-exception p1

    .line 52
    goto :goto_3b

    .line 53
    :cond_34
    iget-object v1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-void

    .line 60
    :goto_3b
    monitor-exit v0
    :try_end_3c
    .catchall {:try_start_e .. :try_end_3c} :catchall_32

    .line 61
    throw p1
.end method

.method public f0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public h()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

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

.method public h0(Ljava/lang/String;)Lax/c3/a;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_2b

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_5
    iget-object v1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_27

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_b

    .line 33
    .line 34
    check-cast v2, Lax/c3/a;

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-object v2

    .line 38
    :catchall_25
    move-exception p1

    .line 39
    goto :goto_29

    .line 40
    :cond_27
    monitor-exit v0

    .line 41
    goto :goto_2b

    .line 42
    :goto_29
    monitor-exit v0
    :try_end_2a
    .catchall {:try_start_5 .. :try_end_2a} :catchall_25

    .line 43
    throw p1

    .line 44
    :cond_2b
    :goto_2b
    const/4 p1, 0x0

    .line 45
    return-object p1
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

.method public i0()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/c3/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public j()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/a;->r0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/c3/a;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    return v0
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

.method public j0()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    monitor-enter v0

    .line 12
    :try_start_b
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :catchall_14
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_16
    .catchall {:try_start_b .. :try_end_16} :catchall_14

    .line 23
    throw v1
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
.end method

.method public k0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a;->p0:Ljava/lang/String;

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

.method public l()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

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

.method public l0()Lax/Dc/I;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a;->k0:Lax/Dc/I;

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

.method public m0(Lax/c3/a;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    monitor-enter v0

    .line 7
    :try_start_6
    iget-object v1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_d
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_6 .. :try_end_f} :catchall_d

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public n()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public n0()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

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

.method public o0(Ljava/io/File;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/c3/a;->n0:Ljava/io/File;

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

.method public p()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    iget-object v1, p0, Lax/c3/a;->n0:Ljava/io/File;

    .line 9
    .line 10
    if-eqz v1, :cond_10

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_10
    invoke-virtual {v0}, Lax/Dc/I;->getSize()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public p0(Lax/c3/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/c3/a;->o0:Lax/c3/a;

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

.method public q()J
    .registers 5

    .line 1
    iget-object v0, p0, Lax/c3/a;->n0:Ljava/io/File;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 11
    .line 12
    if-eqz v0, :cond_35

    .line 13
    .line 14
    new-instance v1, Lax/Dc/W;

    .line 15
    .line 16
    const/16 v2, 0x5455

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lax/Dc/W;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lax/Dc/I;->n(Lax/Dc/W;)Lax/Dc/N;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Lax/Dc/D;

    .line 26
    .line 27
    if-eqz v1, :cond_2e

    .line 28
    .line 29
    check-cast v0, Lax/Dc/D;

    .line 30
    .line 31
    invoke-virtual {v0}, Lax/Dc/D;->n()Lax/Dc/U;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2e

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/Dc/U;->d()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v0, v0

    .line 42
    const-wide/16 v2, 0x3e8

    .line 43
    .line 44
    mul-long v0, v0, v2

    .line 45
    .line 46
    return-wide v0

    .line 47
    :cond_2e
    iget-object v0, p0, Lax/c3/a;->k0:Lax/Dc/I;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    return-wide v0

    .line 54
    :cond_35
    const-wide/16 v0, -0x1

    .line 55
    .line 56
    return-wide v0
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

.method public q0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    monitor-enter v0

    .line 7
    :try_start_6
    iget-object v1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1e

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lax/c3/a;

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Lax/c3/a;->p0(Lax/c3/a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_c

    .line 29
    :catchall_1c
    move-exception v1

    .line 30
    goto :goto_20

    .line 31
    :cond_1e
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_6 .. :try_end_21} :catchall_1c

    .line 34
    throw v1
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

.method public r(Z)I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_8

    .line 6
    .line 7
    const/4 p1, -0x2

    .line 8
    return p1

    .line 9
    :cond_8
    iget-object p1, p0, Lax/c3/a;->m0:Ljava/util/List;

    .line 10
    .line 11
    if-eqz p1, :cond_11

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_11
    const/4 p1, -0x1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a;->l0:Ljava/lang/String;

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

.method public t()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c3/a;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/c3/a;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/b;->g1(Ljava/lang/String;Z)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

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
