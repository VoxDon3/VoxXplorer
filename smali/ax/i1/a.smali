.class public abstract Lax/i1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/F;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/i1/F$c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lax/i1/F$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/i1/N$a;

.field private final d:Lax/b1/u$a;

.field private e:Landroid/os/Looper;

.field private f:Lax/P0/N;

.field private g:Lax/Z0/I1;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/i1/a;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 18
    .line 19
    new-instance v0, Lax/i1/N$a;

    .line 20
    .line 21
    invoke-direct {v0}, Lax/i1/N$a;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/i1/a;->c:Lax/i1/N$a;

    .line 25
    .line 26
    new-instance v0, Lax/b1/u$a;

    .line 27
    .line 28
    invoke-direct {v0}, Lax/b1/u$a;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/i1/a;->d:Lax/b1/u$a;

    .line 32
    .line 33
    return-void
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
.method protected abstract A(Lax/U0/z;)V
.end method

.method protected final B(Lax/P0/N;)V
    .registers 6

    .line 1
    iput-object p1, p0, Lax/i1/a;->f:Lax/P0/N;

    .line 2
    .line 3
    iget-object v0, p0, Lax/i1/a;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    if-ge v2, v1, :cond_17

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Lax/i1/F$c;

    .line 19
    .line 20
    invoke-interface {v3, p0, p1}, Lax/i1/F$c;->a(Lax/i1/F;Lax/P0/N;)V

    .line 21
    .line 22
    .line 23
    goto :goto_9

    .line 24
    :cond_17
    return-void
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

.method protected abstract C()V
.end method

.method public synthetic a(Lax/P0/y;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/i1/D;->c(Lax/i1/F;Lax/P0/y;)V

    return-void
.end method

.method public final b(Lax/i1/F$c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/i1/a;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1d

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lax/i1/a;->e:Landroid/os/Looper;

    .line 16
    .line 17
    iput-object p1, p0, Lax/i1/a;->f:Lax/P0/N;

    .line 18
    .line 19
    iput-object p1, p0, Lax/i1/a;->g:Lax/Z0/I1;

    .line 20
    .line 21
    iget-object p1, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lax/i1/a;->C()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-virtual {p0, p1}, Lax/i1/a;->q(Lax/i1/F$c;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public final c(Landroid/os/Handler;Lax/i1/N;)V
    .registers 4

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/i1/a;->c:Lax/i1/N$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lax/i1/N$a;->h(Landroid/os/Handler;Lax/i1/N;)V

    .line 10
    .line 11
    .line 12
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

.method public final d(Lax/i1/F$c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-virtual {p0}, Lax/i1/a;->w()V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method

.method public final g(Lax/i1/N;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/a;->c:Lax/i1/N$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/i1/N$a;->x(Lax/i1/N;)V

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

.method public final l(Lax/i1/F$c;Lax/U0/z;Lax/Z0/I1;)V
    .registers 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/i1/a;->e:Landroid/os/Looper;

    .line 6
    .line 7
    if-eqz v1, :cond_d

    .line 8
    .line 9
    if-ne v1, v0, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v1, 0x0

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    :goto_d
    const/4 v1, 0x1

    .line 15
    :goto_e
    invoke-static {v1}, Lax/S0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Lax/i1/a;->g:Lax/Z0/I1;

    .line 19
    .line 20
    iget-object p3, p0, Lax/i1/a;->f:Lax/P0/N;

    .line 21
    .line 22
    iget-object v1, p0, Lax/i1/a;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lax/i1/a;->e:Landroid/os/Looper;

    .line 28
    .line 29
    if-nez v1, :cond_29

    .line 30
    .line 31
    iput-object v0, p0, Lax/i1/a;->e:Landroid/os/Looper;

    .line 32
    .line 33
    iget-object p3, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lax/i1/a;->A(Lax/U0/z;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    if-eqz p3, :cond_31

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lax/i1/a;->d(Lax/i1/F$c;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0, p3}, Lax/i1/F$c;->a(Lax/i1/F;Lax/P0/N;)V

    .line 48
    .line 49
    .line 50
    :cond_31
    return-void
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

.method public synthetic m()Z
    .registers 2

    .line 1
    invoke-static {p0}, Lax/i1/D;->b(Lax/i1/F;)Z

    move-result v0

    return v0
.end method

.method public final n(Lax/b1/u;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/a;->d:Lax/b1/u$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/b1/u$a;->n(Lax/b1/u;)V

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

.method public synthetic o()Lax/P0/N;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/i1/D;->a(Lax/i1/F;)Lax/P0/N;

    move-result-object v0

    return-object v0
.end method

.method public final p(Landroid/os/Handler;Lax/b1/u;)V
    .registers 4

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/i1/a;->d:Lax/b1/u$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lax/b1/u$a;->g(Landroid/os/Handler;Lax/b1/u;)V

    .line 10
    .line 11
    .line 12
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

.method public final q(Lax/i1/F$c;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    if-nez v0, :cond_18

    .line 13
    .line 14
    iget-object p1, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_18

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/i1/a;->v()V

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void
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

.method protected final r(ILax/i1/F$b;)Lax/b1/u$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->d:Lax/b1/u$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/b1/u$a;->o(ILax/i1/F$b;)Lax/b1/u$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected final s(Lax/i1/F$b;)Lax/b1/u$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->d:Lax/b1/u$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Lax/b1/u$a;->o(ILax/i1/F$b;)Lax/b1/u$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
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

.method protected final t(ILax/i1/F$b;)Lax/i1/N$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->c:Lax/i1/N$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/i1/N$a;->A(ILax/i1/F$b;)Lax/i1/N$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected final u(Lax/i1/F$b;)Lax/i1/N$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/a;->c:Lax/i1/N$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Lax/i1/N$a;->A(ILax/i1/F$b;)Lax/i1/N$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
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

.method protected v()V
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

.method protected w()V
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

.method protected final x()Lax/Z0/I1;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/a;->g:Lax/Z0/I1;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/Z0/I1;

    .line 8
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

.method protected final y()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
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

.method public final z(Lax/i1/F$c;Lax/U0/z;)V
    .registers 4

    .line 1
    sget-object v0, Lax/Z0/I1;->d:Lax/Z0/I1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lax/i1/a;->l(Lax/i1/F$c;Lax/U0/z;Lax/Z0/I1;)V

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
