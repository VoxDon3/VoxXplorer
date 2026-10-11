.class public Lax/c3/m;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Lax/G4/P;

.field private l0:Ljava/lang/String;

.field private m0:Ljava/lang/Long;

.field private n0:Ljava/lang/String;

.field private o0:Lax/G4/t;

.field private p0:Lax/G4/x;

.field private q0:Z

.field private r0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/k;Lax/G4/P;)V
    .registers 4

    .line 6
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 7
    iput-object p2, p0, Lax/c3/m;->k0:Lax/G4/P;

    .line 8
    invoke-virtual {p2}, Lax/G4/P;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lax/c3/m;->l0:Ljava/lang/String;

    .line 9
    invoke-virtual {p2}, Lax/G4/P;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lax/c3/m;->n0:Ljava/lang/String;

    .line 10
    instance-of p1, p2, Lax/G4/t;

    const/4 v0, 0x0

    if-eqz p1, :cond_1d

    .line 11
    iput-boolean v0, p0, Lax/c3/m;->q0:Z

    .line 12
    check-cast p2, Lax/G4/t;

    iput-object p2, p0, Lax/c3/m;->o0:Lax/G4/t;

    return-void

    .line 13
    :cond_1d
    instance-of p1, p2, Lax/G4/x;

    if-eqz p1, :cond_29

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lax/c3/m;->q0:Z

    .line 15
    check-cast p2, Lax/G4/x;

    iput-object p2, p0, Lax/c3/m;->p0:Lax/G4/x;

    return-void

    .line 16
    :cond_29
    iput-boolean v0, p0, Lax/c3/m;->q0:Z

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/k;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 2
    iput-object p2, p0, Lax/c3/m;->l0:Ljava/lang/String;

    .line 3
    const-string p1, "/"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lax/c3/m;->q0:Z

    return-void

    :cond_11
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lax/c3/m;->q0:Z

    return-void
.end method


# virtual methods
.method public C()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/m;->k0:Lax/G4/P;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/G4/P;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

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
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    iget-object v0, p0, Lax/c3/m;->n0:Ljava/lang/String;

    .line 7
    .line 8
    return-object v0
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
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lax/c3/m;->e0(Lcom/voxdon/xplorer/file/n;)I

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

.method public e0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lax/c3/m;

    .line 4
    .line 5
    iget-object p1, p1, Lax/c3/m;->l0:Ljava/lang/String;

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

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/m;->k0:Lax/G4/P;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/G4/P;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/m;->q0:Z

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
    .registers 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    iget-object v1, p0, Lax/c3/m;->l0:Ljava/lang/String;

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
    iget-object v0, p0, Lax/c3/m;->k0:Lax/G4/P;

    .line 14
    .line 15
    if-nez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_12
    instance-of v0, v0, Lax/G4/k;

    .line 20
    .line 21
    xor-int/2addr v0, v1

    .line 22
    return v0
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
.end method

.method public p()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/m;->o0:Lax/G4/t;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/G4/t;->f()J

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
    iget-object v0, p0, Lax/c3/m;->m0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_2e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/c3/m;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_13

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lax/c3/m;->m0:Ljava/lang/Long;

    .line 18
    .line 19
    goto :goto_2e

    .line 20
    :cond_13
    iget-object v0, p0, Lax/c3/m;->o0:Lax/G4/t;

    .line 21
    .line 22
    if-eqz v0, :cond_26

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/G4/t;->e()Ljava/util/Date;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lax/c3/m;->m0:Ljava/lang/Long;

    .line 37
    .line 38
    goto :goto_2e

    .line 39
    :cond_26
    const-wide/16 v0, -0x1

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lax/c3/m;->m0:Ljava/lang/Long;

    .line 46
    .line 47
    :cond_2e
    :goto_2e
    iget-object v0, p0, Lax/c3/m;->m0:Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    return-wide v0
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
    iget-boolean p1, p0, Lax/c3/m;->q0:Z

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
    iget-object v0, p0, Lax/c3/m;->r0:Ljava/lang/String;

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
    iput-object v0, p0, Lax/c3/m;->r0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/m;->r0:Ljava/lang/String;

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
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/m;->l0:Ljava/lang/String;

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
