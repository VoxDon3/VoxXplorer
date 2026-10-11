.class public Lax/c3/c;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Ljava/lang/String;

.field private l0:Ljava/lang/Long;

.field private m0:Z

.field private n0:Ljava/lang/String;

.field private o0:Ljava/lang/String;

.field private p0:Lcom/box/androidsdk/content/models/BoxItem;

.field private q0:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/d;Lax/c3/c;Ljava/lang/String;)V
    .registers 5

    .line 2
    invoke-virtual {p2}, Lax/c3/c;->t()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lax/c3/c;-><init>(Lcom/voxdon/xplorer/file/d;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxItem;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/d;Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0, p2}, Lax/c3/c;-><init>(Lcom/voxdon/xplorer/file/d;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxItem;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/d;Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxItem;Ljava/lang/String;)V
    .registers 5

    .line 3
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 4
    iput-object p2, p0, Lax/c3/c;->o0:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 6
    iput-object p4, p0, Lax/c3/c;->k0:Ljava/lang/String;

    .line 7
    const-string p1, "/"

    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_15

    .line 8
    iput-boolean p2, p0, Lax/c3/c;->m0:Z

    return-void

    .line 9
    :cond_15
    instance-of p1, p3, Lcom/box/androidsdk/content/models/BoxFolder;

    if-eqz p1, :cond_1c

    .line 10
    iput-boolean p2, p0, Lax/c3/c;->m0:Z

    return-void

    :cond_1c
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lax/c3/c;->m0:Z

    return-void
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->M()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object v0, p0, Lax/c3/c;->k0:Ljava/lang/String;

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
    iget-object v0, p0, Lax/c3/c;->k0:Ljava/lang/String;

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
    iget-object v0, p0, Lax/c3/c;->k0:Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lax/c3/c;->e0(Lcom/voxdon/xplorer/file/n;)I

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
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->P()Ljava/util/EnumSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    sget-object v1, Lcom/box/androidsdk/content/models/BoxItem$Permission;->c0:Lcom/box/androidsdk/content/models/BoxItem$Permission;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_f
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lax/c3/c;->t()Ljava/lang/String;

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
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

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
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->J()Ljava/lang/String;

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

.method public g0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/c;->o0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 7
    .line 8
    if-eqz v0, :cond_1a

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->N()Lcom/box/androidsdk/content/models/BoxFolder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1a

    .line 15
    .line 16
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->N()Lcom/box/androidsdk/content/models/BoxFolder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1a
    const/4 v0, 0x0

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

.method public h()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/c3/c;->C()Ljava/lang/String;

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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/c;->m0:Z

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
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->P()Ljava/util/EnumSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1c

    .line 9
    .line 10
    sget-object v2, Lcom/box/androidsdk/content/models/BoxItem$Permission;->d0:Lcom/box/androidsdk/content/models/BoxItem$Permission;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1c

    .line 17
    .line 18
    sget-object v2, Lcom/box/androidsdk/content/models/BoxItem$Permission;->g0:Lcom/box/androidsdk/content/models/BoxItem$Permission;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_1c
    :goto_1c
    return v1
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
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    iget-object v1, p0, Lax/c3/c;->k0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    :cond_12
    const-string v1, "active"

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->J()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
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
    iget-object v0, p0, Lax/c3/c;->q0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_1f

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 6
    .line 7
    if-eqz v0, :cond_17

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->Q()Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_17

    .line 14
    .line 15
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->Q()Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lax/c3/c;->q0:Ljava/lang/Long;

    .line 22
    .line 23
    goto :goto_1f

    .line 24
    :cond_17
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lax/c3/c;->q0:Ljava/lang/Long;

    .line 31
    .line 32
    :cond_1f
    :goto_1f
    iget-object v0, p0, Lax/c3/c;->q0:Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
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

.method public q()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/c;->l0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_48

    .line 4
    .line 5
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 6
    .line 7
    instance-of v1, v0, Lcom/box/androidsdk/content/models/BoxFile;

    .line 8
    .line 9
    if-eqz v1, :cond_25

    .line 10
    .line 11
    check-cast v0, Lcom/box/androidsdk/content/models/BoxFile;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxFile;->I()Ljava/util/Date;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_25

    .line 18
    .line 19
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 20
    .line 21
    check-cast v0, Lcom/box/androidsdk/content/models/BoxFile;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxFile;->I()Ljava/util/Date;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lax/c3/c;->l0:Ljava/lang/Long;

    .line 36
    .line 37
    goto :goto_48

    .line 38
    :cond_25
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 39
    .line 40
    if-eqz v0, :cond_40

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->K()Ljava/util/Date;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_40

    .line 47
    .line 48
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxItem;->K()Ljava/util/Date;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lax/c3/c;->l0:Ljava/lang/Long;

    .line 63
    .line 64
    goto :goto_48

    .line 65
    :cond_40
    const-wide/16 v0, -0x1

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lax/c3/c;->l0:Ljava/lang/Long;

    .line 72
    .line 73
    :cond_48
    :goto_48
    iget-object v0, p0, Lax/c3/c;->l0:Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    return-wide v0
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

.method public r(Z)I
    .registers 2

    .line 1
    iget-boolean p1, p0, Lax/c3/c;->m0:Z

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
    iget-object v0, p0, Lax/c3/c;->n0:Ljava/lang/String;

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
    iput-object v0, p0, Lax/c3/c;->n0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/c3/c;->n0:Ljava/lang/String;

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
    iget-object v1, p0, Lax/c3/c;->k0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    const-string v0, "0"

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    iget-object v0, p0, Lax/c3/c;->p0:Lcom/box/androidsdk/content/models/BoxItem;

    .line 15
    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_16
    const-string v0, "getFileId called but file is not exists."

    .line 24
    .line 25
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

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
