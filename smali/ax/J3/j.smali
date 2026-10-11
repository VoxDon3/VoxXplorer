.class public Lax/J3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/d4/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/J3/j$c;
    }
.end annotation


# static fields
.field private static final k0:Lax/g4/f;

.field private static final l0:Lax/g4/f;

.field private static final m0:Lax/g4/f;


# instance fields
.field final c0:Lax/d4/h;

.field private final d0:Lax/d4/n;

.field private final e0:Lax/d4/m;

.field private final f0:Lax/d4/p;

.field private final g0:Ljava/lang/Runnable;

.field private final h0:Landroid/os/Handler;

.field private final i0:Lax/d4/c;

.field private j0:Lax/g4/f;

.field protected final q:Lax/J3/c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, Lax/g4/f;->h(Ljava/lang/Class;)Lax/g4/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/g4/f;->N()Lax/g4/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lax/J3/j;->k0:Lax/g4/f;

    .line 12
    .line 13
    const-class v0, Lax/b4/c;

    .line 14
    .line 15
    invoke-static {v0}, Lax/g4/f;->h(Ljava/lang/Class;)Lax/g4/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/g4/f;->N()Lax/g4/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lax/J3/j;->l0:Lax/g4/f;

    .line 24
    .line 25
    sget-object v0, Lax/P3/h;->c:Lax/P3/h;

    .line 26
    .line 27
    invoke-static {v0}, Lax/g4/f;->j(Lax/P3/h;)Lax/g4/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lax/J3/g;->e0:Lax/J3/g;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lax/g4/f;->R(Lax/J3/g;)Lax/g4/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Lax/g4/f;->X(Z)Lax/g4/f;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lax/J3/j;->m0:Lax/g4/f;

    .line 43
    .line 44
    return-void
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

.method public constructor <init>(Lax/J3/c;Lax/d4/h;Lax/d4/m;)V
    .registers 10

    .line 1
    new-instance v4, Lax/d4/n;

    invoke-direct {v4}, Lax/d4/n;-><init>()V

    invoke-virtual {p1}, Lax/J3/c;->g()Lax/d4/d;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lax/J3/j;-><init>(Lax/J3/c;Lax/d4/h;Lax/d4/m;Lax/d4/n;Lax/d4/d;)V

    return-void
.end method

.method constructor <init>(Lax/J3/c;Lax/d4/h;Lax/d4/m;Lax/d4/n;Lax/d4/d;)V
    .registers 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lax/d4/p;

    invoke-direct {v0}, Lax/d4/p;-><init>()V

    iput-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 4
    new-instance v0, Lax/J3/j$a;

    invoke-direct {v0, p0}, Lax/J3/j$a;-><init>(Lax/J3/j;)V

    iput-object v0, p0, Lax/J3/j;->g0:Ljava/lang/Runnable;

    .line 5
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lax/J3/j;->h0:Landroid/os/Handler;

    .line 6
    iput-object p1, p0, Lax/J3/j;->q:Lax/J3/c;

    .line 7
    iput-object p2, p0, Lax/J3/j;->c0:Lax/d4/h;

    .line 8
    iput-object p3, p0, Lax/J3/j;->e0:Lax/d4/m;

    .line 9
    iput-object p4, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 10
    invoke-virtual {p1}, Lax/J3/c;->i()Lax/J3/e;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p3

    .line 11
    new-instance v2, Lax/J3/j$c;

    invoke-direct {v2, p4}, Lax/J3/j$c;-><init>(Lax/d4/n;)V

    .line 12
    invoke-interface {p5, p3, v2}, Lax/d4/d;->a(Landroid/content/Context;Lax/d4/c$a;)Lax/d4/c;

    move-result-object p3

    iput-object p3, p0, Lax/J3/j;->i0:Lax/d4/c;

    .line 13
    invoke-static {}, Lax/k4/i;->o()Z

    move-result p4

    if-eqz p4, :cond_41

    .line 14
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_44

    .line 15
    :cond_41
    invoke-interface {p2, p0}, Lax/d4/h;->b(Lax/d4/i;)V

    .line 16
    :goto_44
    invoke-interface {p2, p3}, Lax/d4/h;->b(Lax/d4/i;)V

    .line 17
    invoke-virtual {p1}, Lax/J3/c;->i()Lax/J3/e;

    move-result-object p2

    invoke-virtual {p2}, Lax/J3/e;->a()Lax/g4/f;

    move-result-object p2

    invoke-virtual {p0, p2}, Lax/J3/j;->t(Lax/g4/f;)V

    .line 18
    invoke-virtual {p1, p0}, Lax/J3/c;->n(Lax/J3/j;)V

    return-void
.end method

.method private w(Lax/h4/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/J3/j;->v(Lax/h4/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    iget-object v0, p0, Lax/J3/j;->q:Lax/J3/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lax/J3/c;->o(Lax/h4/e;)V

    .line 10
    .line 11
    .line 12
    :cond_b
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
.end method


# virtual methods
.method public a()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/J3/j;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/d4/p;->a()V

    .line 7
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

.method public b()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/J3/j;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/d4/p;->b()V

    .line 7
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

.method public f()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/d4/p;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/d4/p;->m()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1f

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lax/h4/e;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lax/J3/j;->o(Lax/h4/e;)V

    .line 29
    .line 30
    .line 31
    goto :goto_f

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 33
    .line 34
    invoke-virtual {v0}, Lax/d4/p;->h()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 38
    .line 39
    invoke-virtual {v0}, Lax/d4/n;->b()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lax/J3/j;->c0:Lax/d4/h;

    .line 43
    .line 44
    invoke-interface {v0, p0}, Lax/d4/h;->a(Lax/d4/i;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lax/J3/j;->c0:Lax/d4/h;

    .line 48
    .line 49
    iget-object v1, p0, Lax/J3/j;->i0:Lax/d4/c;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lax/d4/h;->a(Lax/d4/i;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lax/J3/j;->h0:Landroid/os/Handler;

    .line 55
    .line 56
    iget-object v1, p0, Lax/J3/j;->g0:Ljava/lang/Runnable;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lax/J3/j;->q:Lax/J3/c;

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lax/J3/c;->q(Lax/J3/j;)V

    .line 64
    .line 65
    .line 66
    return-void
    .line 67
    .line 68
.end method

.method public h(Ljava/lang/Class;)Lax/J3/i;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Lax/J3/i<",
            "TResourceType;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/J3/i;

    .line 2
    .line 3
    iget-object v1, p0, Lax/J3/j;->q:Lax/J3/c;

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lax/J3/i;-><init>(Lax/J3/c;Lax/J3/j;Ljava/lang/Class;)V

    .line 6
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
    .line 22
.end method

.method public m()Lax/J3/i;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/J3/i<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/J3/j;->h(Ljava/lang/Class;)Lax/J3/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/J3/j;->k0:Lax/g4/f;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/J3/i;->b(Lax/g4/f;)Lax/J3/i;

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

.method public n()Lax/J3/i;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/J3/i<",
            "Lax/b4/c;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lax/b4/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/J3/j;->h(Ljava/lang/Class;)Lax/J3/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/J3/j;->l0:Lax/g4/f;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/J3/i;->b(Lax/g4/f;)Lax/J3/i;

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

.method public o(Lax/h4/e;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-static {}, Lax/k4/i;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_d

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lax/J3/j;->w(Lax/h4/e;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget-object v0, p0, Lax/J3/j;->h0:Landroid/os/Handler;

    .line 15
    .line 16
    new-instance v1, Lax/J3/j$b;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lax/J3/j$b;-><init>(Lax/J3/j;Lax/h4/e;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
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

.method p()Lax/g4/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/j;->j0:Lax/g4/f;

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

.method q(Ljava/lang/Class;)Lax/J3/k;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lax/J3/k<",
            "*TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/J3/j;->q:Lax/J3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/J3/c;->i()Lax/J3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/J3/e;->b(Ljava/lang/Class;)Lax/J3/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public r()V
    .registers 2

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/d4/n;->c()V

    .line 7
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

.method public s()V
    .registers 2

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/d4/n;->e()V

    .line 7
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

.method protected t(Lax/g4/f;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Lax/g4/f;->d()Lax/g4/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lax/g4/f;->c()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lax/J3/j;->j0:Lax/g4/f;

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
    .line 22
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "{tracker="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", treeNode="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lax/J3/j;->e0:Lax/d4/m;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "}"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method u(Lax/h4/e;Lax/g4/b;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "*>;",
            "Lax/g4/b;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/d4/p;->n(Lax/h4/e;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lax/d4/n;->f(Lax/g4/b;)V

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

.method v(Lax/h4/e;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/h4/e;->k()Lax/g4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    iget-object v2, p0, Lax/J3/j;->d0:Lax/d4/n;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lax/d4/n;->a(Lax/g4/b;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1a

    .line 16
    .line 17
    iget-object v0, p0, Lax/J3/j;->f0:Lax/d4/p;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lax/d4/p;->o(Lax/h4/e;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-interface {p1, v0}, Lax/h4/e;->e(Lax/g4/b;)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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
