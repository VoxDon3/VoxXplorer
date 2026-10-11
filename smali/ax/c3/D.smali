.class public Lax/c3/D;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Lax/Sc/i;

.field private l0:Ljava/lang/String;

.field private m0:Ljava/lang/String;

.field private n0:Ljava/lang/Long;

.field private o0:Ljava/lang/Boolean;

.field private p0:Z

.field private q0:Z

.field private r0:Z


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/q;Lax/Sc/e;Lax/Sc/i;Ljava/lang/String;Z)V
    .registers 6

    .line 4
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 5
    iput-object p3, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 6
    iput-object p4, p0, Lax/c3/D;->l0:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lax/c3/D;->q0:Z

    if-eqz p3, :cond_1b

    .line 8
    invoke-virtual {p3}, Lax/Sc/i;->h()Z

    move-result p1

    if-eqz p1, :cond_1b

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lax/c3/D;->p0:Z

    .line 10
    invoke-static {p4}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, Lax/c3/D;->g0(Lax/Sc/e;Lax/Sc/i;Ljava/lang/String;)V

    .line 11
    :cond_1b
    invoke-direct {p0}, Lax/c3/D;->f0()V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/q;Ljava/lang/String;Z)V
    .registers 10

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lax/c3/D;-><init>(Lcom/voxdon/xplorer/file/q;Lax/Sc/e;Lax/Sc/i;Ljava/lang/String;Z)V

    .line 2
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lax/c3/D;->o0:Ljava/lang/Boolean;

    .line 3
    iput-boolean p3, v0, Lax/c3/D;->r0:Z

    return-void
.end method

.method private f0()V
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
    iput-object v0, p0, Lax/c3/D;->m0:Ljava/lang/String;

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

.method private g0(Lax/Sc/e;Lax/Sc/i;Ljava/lang/String;)V
    .registers 8

    .line 1
    invoke-virtual {p2}, Lax/Sc/i;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_11

    .line 13
    .line 14
    invoke-virtual {p2, v3}, Lax/Sc/i;->q(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    :try_start_11
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1c

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lax/Sc/e;->B0(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_24

    .line 29
    :cond_1c
    invoke-static {p3, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p1, p3}, Lax/Sc/e;->B0(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :goto_24
    if-ne p1, v3, :cond_29

    .line 38
    .line 39
    invoke-virtual {p2, v3}, Lax/Sc/i;->q(I)V
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_29} :catch_29

    .line 40
    .line 41
    .line 42
    :catch_29
    :cond_29
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
.end method


# virtual methods
.method public C()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 2
    .line 3
    if-eqz v0, :cond_16

    .line 4
    .line 5
    iget-boolean v1, p0, Lax/c3/D;->q0:Z

    .line 6
    .line 7
    if-eqz v1, :cond_11

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/Sc/i;->b()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_11
    invoke-virtual {v0}, Lax/Sc/i;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_16
    iget-object v0, p0, Lax/c3/D;->l0:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

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

.method public F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/D;->l0:Ljava/lang/String;

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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/D;->l0:Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lax/c3/D;->e0(Lcom/voxdon/xplorer/file/n;)I

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
    .registers 5

    .line 1
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-virtual {v0, v1, v1}, Lax/Sc/i;->f(II)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_20

    .line 13
    .line 14
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Lax/Sc/i;->f(II)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_20

    .line 21
    .line 22
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-virtual {v0, v3, v1}, Lax/Sc/i;->f(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    return v1

    .line 33
    :cond_20
    :goto_20
    return v2
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
    iget-object v0, p0, Lax/c3/D;->l0:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lax/c3/D;

    .line 4
    .line 5
    iget-object p1, p1, Lax/c3/D;->l0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1
    :try_end_a
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_a} :catch_b

    .line 11
    return p1

    .line 12
    :catch_b
    const/4 p1, -0x1

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
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c3/D;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "."

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public isDirectory()Z
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/c3/D;->r0:Z

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
    const-string v0, "/"

    .line 8
    .line 9
    iget-object v2, p0, Lax/c3/D;->l0:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 19
    .line 20
    if-eqz v0, :cond_1c

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/Sc/i;->g()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1c

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    return v0
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

.method public j()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lax/Sc/i;->f(II)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_20

    .line 13
    .line 14
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v2}, Lax/Sc/i;->f(II)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_20

    .line 21
    .line 22
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-virtual {v0, v3, v2}, Lax/Sc/i;->f(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    return v1

    .line 33
    :cond_20
    :goto_20
    return v2
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

.method public l()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/D;->p0:Z

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

.method public n()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/D;->o0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_20

    .line 4
    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    iget-object v1, p0, Lax/c3/D;->l0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_13

    .line 14
    .line 15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    iput-object v0, p0, Lax/c3/D;->o0:Ljava/lang/Boolean;

    .line 18
    .line 19
    goto :goto_20

    .line 20
    :cond_13
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 21
    .line 22
    if-eqz v0, :cond_19

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    const/4 v0, 0x0

    .line 27
    :goto_1a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lax/c3/D;->o0:Ljava/lang/Boolean;

    .line 32
    .line 33
    :cond_20
    :goto_20
    iget-object v0, p0, Lax/c3/D;->o0:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0
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

.method public p()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/Sc/i;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_9
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
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

.method public q()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/D;->n0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_27

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 6
    .line 7
    if-eqz v0, :cond_1f

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/Sc/i;->e()Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1f

    .line 14
    .line 15
    iget-object v0, p0, Lax/c3/D;->k0:Lax/Sc/i;

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/Sc/i;->e()Ljava/util/Calendar;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

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
    iput-object v0, p0, Lax/c3/D;->n0:Ljava/lang/Long;

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
    iput-object v0, p0, Lax/c3/D;->n0:Ljava/lang/Long;

    .line 39
    .line 40
    :cond_27
    :goto_27
    iget-object v0, p0, Lax/c3/D;->n0:Ljava/lang/Long;

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
    invoke-virtual {p0}, Lax/c3/D;->isDirectory()Z

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
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

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

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/D;->m0:Ljava/lang/String;

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
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/D;->l0:Ljava/lang/String;

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
