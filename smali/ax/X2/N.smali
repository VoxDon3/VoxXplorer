.class public abstract Lax/X2/N;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Integer;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/X2/N;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method protected abstract b(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final c(Landroid/os/storage/StorageManager;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X2/N;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/X2/N;->d(Landroid/os/storage/StorageManager;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lax/X2/N;->h:Ljava/lang/String;

    .line 10
    .line 11
    :cond_a
    iget-object p1, p0, Lax/X2/N;->h:Ljava/lang/String;

    .line 12
    .line 13
    return-object p1
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

.method protected abstract d(Landroid/os/storage/StorageManager;)Ljava/lang/String;
.end method

.method public final e(Landroid/os/storage/StorageManager;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/X2/N;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/X2/N;->f(Landroid/os/storage/StorageManager;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lax/X2/N;->g:Ljava/lang/Integer;

    .line 14
    .line 15
    :cond_e
    iget-object p1, p0, Lax/X2/N;->g:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
.end method

.method protected abstract f(Landroid/os/storage/StorageManager;)I
.end method

.method public final g()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->h()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/X2/N;->f:Ljava/lang/String;

    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/X2/N;->f:Ljava/lang/String;

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

.method protected abstract h()Ljava/lang/String;
.end method

.method public final i()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/X2/N;->c:Ljava/lang/String;

    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/X2/N;->c:Ljava/lang/String;

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

.method protected abstract j()Ljava/lang/String;
.end method

.method public k()Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/X2/N;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lax/X2/Q;->T1()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "/storage"

    .line 11
    .line 12
    if-eqz v1, :cond_23

    .line 13
    .line 14
    if-eqz v0, :cond_2c

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2c

    .line 21
    .line 22
    const-string v1, "/mnt/media_rw"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2c

    .line 29
    .line 30
    const/16 v0, 0x21

    .line 31
    .line 32
    invoke-static {v0}, Lax/X2/Q;->l(I)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_23
    if-eqz v0, :cond_2c

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2c

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2c
    return-object v0
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

.method public final l()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->m()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/X2/N;->a:Ljava/lang/String;

    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/X2/N;->a:Ljava/lang/String;

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

.method protected abstract m()Ljava/lang/String;
.end method

.method public final n()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->o()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/X2/N;->b:Ljava/lang/String;

    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/X2/N;->b:Ljava/lang/String;

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

.method protected abstract o()Ljava/lang/String;
.end method

.method public final p()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/X2/N;->e:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/X2/N;->e:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method protected abstract q()Z
.end method

.method public final r()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/X2/N;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/X2/N;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lax/X2/N;->d:Ljava/lang/Boolean;

    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/X2/N;->d:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method protected abstract s()Z
.end method
