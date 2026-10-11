.class public Lax/c3/a0;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Ljava/lang/String;

.field private l0:Ljava/lang/Long;

.field private m0:Z

.field private n0:Ljava/lang/String;

.field private o0:Ljava/lang/String;

.field private p0:Lax/la/u;

.field private q0:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/I;Lax/c3/a0;Ljava/lang/String;)V
    .registers 5

    .line 2
    invoke-virtual {p2}, Lax/c3/a0;->t()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lax/c3/a0;-><init>(Lcom/voxdon/xplorer/file/I;Ljava/lang/String;Lax/la/u;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/I;Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0, p2}, Lax/c3/a0;-><init>(Lcom/voxdon/xplorer/file/I;Ljava/lang/String;Lax/la/u;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/I;Ljava/lang/String;Lax/la/u;Ljava/lang/String;)V
    .registers 5

    .line 3
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 4
    iput-object p2, p0, Lax/c3/a0;->o0:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 6
    iput-object p4, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 7
    const-string p1, "/"

    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lax/c3/a0;->m0:Z

    return-void

    :cond_15
    if-eqz p3, :cond_1e

    .line 9
    invoke-interface {p3}, Lax/la/u;->f()Z

    move-result p1

    iput-boolean p1, p0, Lax/c3/a0;->m0:Z

    return-void

    :cond_1e
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lax/c3/a0;->m0:Z

    return-void
.end method

.method public static g0(Ljava/lang/String;)J
    .registers 3

    .line 1
    if-eqz p0, :cond_12

    .line 2
    .line 3
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_12

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_11} :catch_12

    .line 18
    return-wide v0

    .line 19
    :catch_12
    :cond_12
    const-wide/16 v0, -0x1

    .line 20
    .line 21
    return-wide v0
    .line 22
.end method

.method public static i0(J)Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "d"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/la/u;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a0;->k0:Ljava/lang/String;

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

.method protected U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/c3/a0;->e0(Lcom/voxdon/xplorer/file/n;)I

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
    .registers 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    iget-object v1, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    invoke-interface {v0}, Lax/la/u;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    return v0
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

.method public e0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lax/c3/a0;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lax/c3/b;->t()Ljava/lang/String;

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
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_c} :catch_d

    .line 13
    return p1

    .line 14
    :catch_d
    const/4 p1, -0x1

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

.method public f0()Lax/la/u;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

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

.method public h()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c3/a0;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    const-string v1, "."

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public h0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 2
    .line 3
    if-eqz v0, :cond_17

    .line 4
    .line 5
    invoke-interface {v0}, Lax/la/u;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_17

    .line 10
    .line 11
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 12
    .line 13
    instance-of v1, v0, Lax/la/v;

    .line 14
    .line 15
    if-eqz v1, :cond_17

    .line 16
    .line 17
    check-cast v0, Lax/la/v;

    .line 18
    .line 19
    invoke-interface {v0}, Lax/la/v;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_17
    const/4 v0, 0x0

    .line 25
    return v0
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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/a0;->m0:Z

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

.method public j()Z
    .registers 4

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    iget-object v1, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_22

    .line 17
    .line 18
    invoke-interface {v0}, Lax/la/u;->i()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_21

    .line 23
    .line 24
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 25
    .line 26
    invoke-interface {v0}, Lax/la/u;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_20

    .line 31
    .line 32
    goto :goto_21

    .line 33
    :cond_20
    return v2

    .line 34
    :cond_21
    :goto_21
    return v1

    .line 35
    :cond_22
    return v2
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

.method public n()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_12

    .line 5
    .line 6
    const-string v0, "/"

    .line 7
    .line 8
    iget-object v2, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    return v1

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_12
    return v1
    .line 20
    .line 21
.end method

.method public p()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/a0;->q0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_29

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 6
    .line 7
    if-eqz v0, :cond_21

    .line 8
    .line 9
    invoke-interface {v0}, Lax/la/u;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_21

    .line 14
    .line 15
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 16
    .line 17
    instance-of v1, v0, Lax/la/v;

    .line 18
    .line 19
    if-eqz v1, :cond_21

    .line 20
    .line 21
    check-cast v0, Lax/la/v;

    .line 22
    .line 23
    invoke-interface {v0}, Lax/la/v;->size()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lax/c3/a0;->q0:Ljava/lang/Long;

    .line 32
    .line 33
    goto :goto_29

    .line 34
    :cond_21
    const-wide/16 v0, 0x0

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lax/c3/a0;->q0:Ljava/lang/Long;

    .line 41
    .line 42
    :cond_29
    :goto_29
    iget-object v0, p0, Lax/c3/a0;->q0:Ljava/lang/Long;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    return-wide v0
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

.method public q()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/a0;->l0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_27

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 6
    .line 7
    if-eqz v0, :cond_1f

    .line 8
    .line 9
    invoke-interface {v0}, Lax/la/u;->h()Ljava/util/Date;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1f

    .line 14
    .line 15
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 16
    .line 17
    invoke-interface {v0}, Lax/la/u;->h()Ljava/util/Date;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lax/c3/a0;->l0:Ljava/lang/Long;

    .line 30
    .line 31
    goto :goto_27

    .line 32
    :cond_1f
    const-wide/16 v0, -0x1

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lax/c3/a0;->l0:Ljava/lang/Long;

    .line 39
    .line 40
    :cond_27
    :goto_27
    iget-object v0, p0, Lax/c3/a0;->l0:Ljava/lang/Long;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    return-wide v0
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
    iget-boolean p1, p0, Lax/c3/a0;->m0:Z

    .line 2
    .line 3
    if-nez p1, :cond_6

    .line 4
    .line 5
    const/4 p1, -0x2

    .line 6
    return p1

    .line 7
    :cond_6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/a0;->n0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    const-string v0, "application/octet-stream"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/c3/a0;->n0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/a0;->n0:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
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
    const-string v0, "/"

    .line 2
    .line 3
    iget-object v1, p0, Lax/c3/a0;->k0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {v0, v1}, Lax/c3/a0;->i0(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_11
    iget-object v0, p0, Lax/c3/a0;->p0:Lax/la/u;

    .line 19
    .line 20
    if-eqz v0, :cond_1a

    .line 21
    .line 22
    invoke-interface {v0}, Lax/la/u;->e()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1a
    const-string v0, "none"

    .line 28
    .line 29
    return-object v0
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
