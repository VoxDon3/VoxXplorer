.class public Lax/g4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/g4/c;
.implements Lax/g4/b;


# instance fields
.field private c0:Lax/g4/b;

.field private d0:Lax/g4/c;

.field private e0:Z

.field private q:Lax/g4/b;


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lax/g4/i;-><init>(Lax/g4/c;)V

    return-void
.end method

.method public constructor <init>(Lax/g4/c;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/g4/i;->d0:Lax/g4/c;

    return-void
.end method

.method private j()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lax/g4/c;->b(Lax/g4/b;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private k()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lax/g4/c;->g(Lax/g4/b;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private l()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->d0:Lax/g4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-interface {v0}, Lax/g4/c;->a()Z

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
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Z
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/g4/i;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/g4/i;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Lax/g4/b;)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/g4/i;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_16

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/g4/i;->a()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_16

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_16
    const/4 p1, 0x0

    .line 24
    return p1
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

.method public c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/g4/b;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/g4/b;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public clear()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/g4/i;->e0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 5
    .line 6
    invoke-interface {v0}, Lax/g4/b;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/g4/b;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d(Lax/g4/b;)Z
    .registers 5

    .line 1
    instance-of v0, p1, Lax/g4/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_29

    .line 5
    .line 6
    check-cast p1, Lax/g4/i;

    .line 7
    .line 8
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 9
    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    iget-object v0, p1, Lax/g4/i;->q:Lax/g4/b;

    .line 13
    .line 14
    if-nez v0, :cond_29

    .line 15
    .line 16
    goto :goto_18

    .line 17
    :cond_10
    iget-object v2, p1, Lax/g4/i;->q:Lax/g4/b;

    .line 18
    .line 19
    invoke-interface {v0, v2}, Lax/g4/b;->d(Lax/g4/b;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_29

    .line 24
    .line 25
    :goto_18
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 26
    .line 27
    iget-object p1, p1, Lax/g4/i;->c0:Lax/g4/b;

    .line 28
    .line 29
    if-nez v0, :cond_21

    .line 30
    .line 31
    if-nez p1, :cond_29

    .line 32
    .line 33
    goto :goto_27

    .line 34
    :cond_21
    invoke-interface {v0, p1}, Lax/g4/b;->d(Lax/g4/b;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_29

    .line 39
    .line 40
    :goto_27
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_29
    return v1
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

.method public e(Lax/g4/b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_9

    .line 8
    .line 9
    goto :goto_1d

    .line 10
    :cond_9
    iget-object p1, p0, Lax/g4/i;->d0:Lax/g4/c;

    .line 11
    .line 12
    if-eqz p1, :cond_10

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lax/g4/c;->e(Lax/g4/b;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object p1, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 18
    .line 19
    invoke-interface {p1}, Lax/g4/b;->i()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1d

    .line 24
    .line 25
    iget-object p1, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 26
    .line 27
    invoke-interface {p1}, Lax/g4/b;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_1d
    :goto_1d
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

.method public f()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/g4/i;->e0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 5
    .line 6
    invoke-interface {v0}, Lax/g4/b;->f()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/g4/b;->f()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public g(Lax/g4/b;)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/g4/i;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_18

    .line 6
    .line 7
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_16

    .line 14
    .line 15
    iget-object p1, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 16
    .line 17
    invoke-interface {p1}, Lax/g4/b;->c()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_18

    .line 22
    .line 23
    :cond_16
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    return p1
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

.method public h()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/g4/i;->e0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 5
    .line 6
    invoke-interface {v0}, Lax/g4/b;->isRunning()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 13
    .line 14
    invoke-interface {v0}, Lax/g4/b;->h()V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-boolean v0, p0, Lax/g4/i;->e0:Z

    .line 18
    .line 19
    if-eqz v0, :cond_21

    .line 20
    .line 21
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 22
    .line 23
    invoke-interface {v0}, Lax/g4/b;->isRunning()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_21

    .line 28
    .line 29
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 30
    .line 31
    invoke-interface {v0}, Lax/g4/b;->h()V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
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

.method public i()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/g4/b;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/g4/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public isCancelled()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/g4/b;->isCancelled()Z

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

.method public isRunning()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/g4/b;->isRunning()Z

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

.method public m(Lax/g4/b;Lax/g4/b;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    iput-object p2, p0, Lax/g4/i;->c0:Lax/g4/b;

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

.method public recycle()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/i;->q:Lax/g4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/g4/b;->recycle()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/g4/i;->c0:Lax/g4/b;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/g4/b;->recycle()V

    .line 9
    .line 10
    .line 11
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
