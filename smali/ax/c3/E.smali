.class public Lax/c3/E;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Lax/p7/c;

.field private l0:Ljava/lang/String;

.field private m0:Ljava/lang/Long;

.field private n0:Ljava/lang/Boolean;

.field private o0:Ljava/lang/Boolean;

.field private p0:Ljava/lang/String;

.field private q0:Ljava/lang/Boolean;

.field private r0:Ljava/lang/Long;

.field private s0:Ljava/lang/String;

.field private t0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;)V
    .registers 9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V
    .registers 6

    .line 6
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 7
    iput-object p2, p0, Lax/c3/E;->s0:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lax/c3/E;->t0:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 10
    iput-object p5, p0, Lax/c3/E;->l0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 11

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 5
    invoke-direct/range {v0 .. v5}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;ZZ)V
    .registers 11

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    .line 2
    invoke-direct/range {v0 .. v5}, Lax/c3/E;-><init>(Lcom/voxdon/xplorer/file/r;Ljava/lang/String;Ljava/lang/String;Lax/p7/c;Ljava/lang/String;)V

    .line 3
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 4
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lax/c3/E;->o0:Ljava/lang/Boolean;

    return-void
.end method

.method public static k0(Lax/p7/c;)Z
    .registers 2

    .line 1
    const-string v0, "application/vnd.google-apps.shortcut"

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/p7/c;->s()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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


# virtual methods
.method public C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-static {v0}, Lcom/voxdon/xplorer/file/r;->J0(Lax/p7/c;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/E;->l0:Ljava/lang/String;

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

.method public F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->l0:Ljava/lang/String;

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

.method public I(Z)Ljava/lang/String;
    .registers 7

    .line 1
    invoke-virtual {p0}, Lax/c3/E;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_19

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/c3/E;->j0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_16

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/c3/E;->p()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-nez v4, :cond_19

    .line 22
    .line 23
    :cond_16
    const-string p1, ""

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_19
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/n;->I(Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
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

.method protected J(Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/c3/E;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0, p2}, Lax/c3/A;->e(Landroid/content/Context;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/n;->J(Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->l0:Ljava/lang/String;

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

.method public c0()Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Lax/c3/E;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/c3/E;->p()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, -0x1

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-nez v4, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/c3/E;->e0(Lcom/voxdon/xplorer/file/n;)I

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
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_27

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_27

    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/p7/c$a;->n()Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_27

    .line 24
    .line 25
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/p7/c$a;->n()Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0

    .line 40
    :cond_27
    :goto_27
    return v1
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
    invoke-virtual {p0}, Lax/c3/E;->t()Ljava/lang/String;

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

.method public f0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lax/p7/c;->C()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public g0()Lax/p7/c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

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

.method public h0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->t0:Ljava/lang/String;

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

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/m7/k;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/E;->l0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lax/p7/c;->z()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_51

    .line 4
    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    iget-object v1, p0, Lax/c3/E;->l0:Ljava/lang/String;

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
    iput-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 18
    .line 19
    goto :goto_51

    .line 20
    :cond_13
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 21
    .line 22
    if-nez v0, :cond_1c

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    iput-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 27
    .line 28
    goto :goto_51

    .line 29
    :cond_1c
    invoke-virtual {p0}, Lax/c3/E;->l()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const-string v1, "application/vnd.google-apps.folder"

    .line 34
    .line 35
    if-eqz v0, :cond_41

    .line 36
    .line 37
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 38
    .line 39
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_41

    .line 44
    .line 45
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 46
    .line 47
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lax/p7/c$f;->o()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 64
    .line 65
    goto :goto_51

    .line 66
    :cond_41
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 67
    .line 68
    invoke-virtual {v0}, Lax/p7/c;->s()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_51
    :goto_51
    iget-object v0, p0, Lax/c3/E;->n0:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    return v0
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

.method public j()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_27

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_27

    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/p7/c$a;->o()Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_27

    .line 24
    .line 25
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/p7/c;->n()Lax/p7/c$a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/p7/c$a;->o()Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0

    .line 40
    :cond_27
    :goto_27
    return v1
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

.method public j0()Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/c3/E;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1a

    .line 7
    .line 8
    const-string v2, "application/vnd.google-apps."

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1a

    .line 15
    .line 16
    const-string v2, "shortcut"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_18

    .line 23
    .line 24
    return v1

    .line 25
    :cond_18
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1a
    return v1
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

.method public l()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/E;->q0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_17

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 6
    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    invoke-static {v0}, Lax/c3/E;->k0(Lax/p7/c;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lax/c3/E;->q0:Ljava/lang/Boolean;

    .line 18
    .line 19
    goto :goto_17

    .line 20
    :cond_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    iput-object v0, p0, Lax/c3/E;->q0:Ljava/lang/Boolean;

    .line 23
    .line 24
    :cond_17
    :goto_17
    iget-object v0, p0, Lax/c3/E;->q0:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

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

.method public l0(J)V
    .registers 3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 6
    .line 7
    return-void
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

.method public n()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/E;->o0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_1b

    .line 14
    .line 15
    const-string v0, "/"

    .line 16
    .line 17
    iget-object v2, p0, Lax/c3/E;->l0:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_1b
    invoke-virtual {v0}, Lax/p7/c;->B()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_22

    .line 33
    .line 34
    return v1

    .line 35
    :cond_22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    xor-int/2addr v0, v1

    .line 40
    return v0
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
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_3c

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 6
    .line 7
    if-eqz v0, :cond_18

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/p7/c;->y()Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_18

    .line 16
    :cond_f
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/p7/c;->y()Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 23
    .line 24
    goto :goto_3c

    .line 25
    :cond_18
    :goto_18
    invoke-virtual {p0}, Lax/c3/E;->l()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-wide/16 v1, 0x0

    .line 30
    .line 31
    if-eqz v0, :cond_36

    .line 32
    .line 33
    invoke-virtual {p0}, Lax/c3/E;->isDirectory()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2d

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 44
    .line 45
    goto :goto_3c

    .line 46
    :cond_2d
    const-wide/16 v0, -0x1

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 53
    .line 54
    goto :goto_3c

    .line 55
    :cond_36
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 60
    .line 61
    :cond_3c
    :goto_3c
    iget-object v0, p0, Lax/c3/E;->r0:Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    return-wide v0
    .line 68
.end method

.method public q()J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_3b

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 6
    .line 7
    const-wide/16 v1, -0x1

    .line 8
    .line 9
    if-eqz v0, :cond_35

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/p7/c;->t()Lax/m7/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1b

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/m7/i;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 26
    .line 27
    goto :goto_3b

    .line 28
    :cond_1b
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/p7/c;->o()Lax/m7/i;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2e

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/m7/i;->b()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 45
    .line 46
    goto :goto_3b

    .line 47
    :cond_2e
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 52
    .line 53
    goto :goto_3b

    .line 54
    :cond_35
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 59
    .line 60
    :cond_3b
    :goto_3b
    iget-object v0, p0, Lax/c3/E;->m0:Ljava/lang/Long;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    return-wide v0
    .line 67
    .line 68
.end method

.method public r(Z)I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/E;->isDirectory()Z

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
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c3/E;->p0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_44

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_29

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/c3/E;->l()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_21

    .line 15
    .line 16
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_21

    .line 23
    .line 24
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Lax/p7/c;->x()Lax/p7/c$f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lax/p7/c$f;->o()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_21
    if-nez v1, :cond_29

    .line 35
    .line 36
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/p7/c;->s()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_29
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_36

    .line 47
    .line 48
    const-string v0, ""

    .line 49
    .line 50
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_42

    .line 55
    :cond_36
    const-string v0, "application/octet-stream"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_42

    .line 62
    .line 63
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_42
    :goto_42
    iput-object v1, p0, Lax/c3/E;->p0:Ljava/lang/String;

    .line 68
    .line 69
    :cond_44
    iget-object v0, p0, Lax/c3/E;->p0:Ljava/lang/String;

    .line 70
    .line 71
    return-object v0
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

.method public t()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/E;->k0:Lax/p7/c;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/p7/c;->r()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    const-string v0, "/"

    .line 11
    .line 12
    iget-object v1, p0, Lax/c3/E;->l0:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    const-string v0, "root"

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_16
    const-string v0, "/.hidden-system-folder"

    .line 24
    .line 25
    iget-object v1, p0, Lax/c3/E;->l0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_23

    .line 32
    .line 33
    const-string v0, "noid"

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_23
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "GDID"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    return-object v0
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
