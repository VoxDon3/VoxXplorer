.class Lax/P3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/f$b;
.implements Lax/l4/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P3/j$b;,
        Lax/P3/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/P3/f$b<",
        "TR;>;",
        "Lax/l4/a$f;"
    }
.end annotation


# static fields
.field private static final v0:Lax/P3/j$a;

.field private static final w0:Landroid/os/Handler;


# instance fields
.field private final c0:Lax/l4/b;

.field private final d0:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/P3/j<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e0:Lax/P3/j$a;

.field private final f0:Lax/P3/k;

.field private final g0:Lax/S3/a;

.field private final h0:Lax/S3/a;

.field private final i0:Lax/S3/a;

.field private j0:Lax/M3/h;

.field private k0:Z

.field private l0:Z

.field private m0:Lax/P3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/s<",
            "*>;"
        }
    .end annotation
.end field

.field private n0:Lax/M3/a;

.field private o0:Z

.field private p0:Lax/P3/o;

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/g4/g;",
            ">;"
        }
    .end annotation
.end field

.field private q0:Z

.field private r0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/g4/g;",
            ">;"
        }
    .end annotation
.end field

.field private s0:Lax/P3/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/n<",
            "*>;"
        }
    .end annotation
.end field

.field private t0:Lax/P3/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/f<",
            "TR;>;"
        }
    .end annotation
.end field

.field private volatile u0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    new-instance v0, Lax/P3/j$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P3/j$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/P3/j;->v0:Lax/P3/j$a;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lax/P3/j$b;

    .line 15
    .line 16
    invoke-direct {v2}, Lax/P3/j$b;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lax/P3/j;->w0:Landroid/os/Handler;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method constructor <init>(Lax/S3/a;Lax/S3/a;Lax/S3/a;Lax/P3/k;Lax/b0/d;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Lax/P3/k;",
            "Lax/b0/d<",
            "Lax/P3/j<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    sget-object v6, Lax/P3/j;->v0:Lax/P3/j$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lax/P3/j;-><init>(Lax/S3/a;Lax/S3/a;Lax/S3/a;Lax/P3/k;Lax/b0/d;Lax/P3/j$a;)V

    return-void
.end method

.method constructor <init>(Lax/S3/a;Lax/S3/a;Lax/S3/a;Lax/P3/k;Lax/b0/d;Lax/P3/j$a;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Lax/P3/k;",
            "Lax/b0/d<",
            "Lax/P3/j<",
            "*>;>;",
            "Lax/P3/j$a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 4
    invoke-static {}, Lax/l4/b;->a()Lax/l4/b;

    move-result-object v0

    iput-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 5
    iput-object p1, p0, Lax/P3/j;->g0:Lax/S3/a;

    .line 6
    iput-object p2, p0, Lax/P3/j;->h0:Lax/S3/a;

    .line 7
    iput-object p3, p0, Lax/P3/j;->i0:Lax/S3/a;

    .line 8
    iput-object p4, p0, Lax/P3/j;->f0:Lax/P3/k;

    .line 9
    iput-object p5, p0, Lax/P3/j;->d0:Lax/b0/d;

    .line 10
    iput-object p6, p0, Lax/P3/j;->e0:Lax/P3/j$a;

    return-void
.end method

.method private e(Lax/g4/g;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_19

    .line 20
    .line 21
    iget-object v0, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method private g()Lax/S3/a;
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/P3/j;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lax/P3/j;->i0:Lax/S3/a;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/P3/j;->h0:Lax/S3/a;

    .line 9
    .line 10
    return-object v0
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

.method private m(Lax/g4/g;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private n(Z)V
    .registers 4

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 11
    .line 12
    iput-object v0, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 13
    .line 14
    iput-object v0, p0, Lax/P3/j;->m0:Lax/P3/s;

    .line 15
    .line 16
    iget-object v1, p0, Lax/P3/j;->r0:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v1, :cond_16

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 21
    .line 22
    .line 23
    :cond_16
    const/4 v1, 0x0

    .line 24
    iput-boolean v1, p0, Lax/P3/j;->q0:Z

    .line 25
    .line 26
    iput-boolean v1, p0, Lax/P3/j;->u0:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lax/P3/j;->o0:Z

    .line 29
    .line 30
    iget-object v1, p0, Lax/P3/j;->t0:Lax/P3/f;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lax/P3/f;->J(Z)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lax/P3/j;->t0:Lax/P3/f;

    .line 36
    .line 37
    iput-object v0, p0, Lax/P3/j;->p0:Lax/P3/o;

    .line 38
    .line 39
    iput-object v0, p0, Lax/P3/j;->n0:Lax/M3/a;

    .line 40
    .line 41
    iget-object p1, p0, Lax/P3/j;->d0:Lax/b0/d;

    .line 42
    .line 43
    invoke-interface {p1, p0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
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


# virtual methods
.method public a(Lax/P3/o;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/P3/j;->p0:Lax/P3/o;

    .line 2
    .line 3
    sget-object p1, Lax/P3/j;->w0:Landroid/os/Handler;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p1, v0, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public b(Lax/P3/s;Lax/M3/a;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "TR;>;",
            "Lax/M3/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/P3/j;->m0:Lax/P3/s;

    .line 2
    .line 3
    iput-object p2, p0, Lax/P3/j;->n0:Lax/M3/a;

    .line 4
    .line 5
    sget-object p1, Lax/P3/j;->w0:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public c(Lax/P3/f;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/f<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/P3/j;->g()Lax/S3/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/S3/a;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public d(Lax/g4/g;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lax/P3/j;->o0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_14

    .line 12
    .line 13
    iget-object v0, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 14
    .line 15
    iget-object v1, p0, Lax/P3/j;->n0:Lax/M3/a;

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lax/g4/g;->b(Lax/P3/s;Lax/M3/a;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-boolean v0, p0, Lax/P3/j;->q0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1e

    .line 24
    .line 25
    iget-object v0, p0, Lax/P3/j;->p0:Lax/P3/o;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Lax/g4/g;->a(Lax/P3/o;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void
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

.method f()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/P3/j;->q0:Z

    .line 2
    .line 3
    if-nez v0, :cond_1c

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/P3/j;->o0:Z

    .line 6
    .line 7
    if-nez v0, :cond_1c

    .line 8
    .line 9
    iget-boolean v0, p0, Lax/P3/j;->u0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_1c

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lax/P3/j;->u0:Z

    .line 16
    .line 17
    iget-object v0, p0, Lax/P3/j;->t0:Lax/P3/f;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/P3/f;->p()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lax/P3/j;->f0:Lax/P3/k;

    .line 23
    .line 24
    iget-object v1, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 25
    .line 26
    invoke-interface {v0, p0, v1}, Lax/P3/k;->d(Lax/P3/j;Lax/M3/h;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    :goto_1c
    return-void
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

.method h()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/P3/j;->u0:Z

    .line 7
    .line 8
    if-eqz v0, :cond_15

    .line 9
    .line 10
    iget-object v0, p0, Lax/P3/j;->f0:Lax/P3/k;

    .line 11
    .line 12
    iget-object v1, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 13
    .line 14
    invoke-interface {v0, p0, v1}, Lax/P3/k;->d(Lax/P3/j;Lax/M3/h;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, v0}, Lax/P3/j;->n(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v1, "Not cancelled"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
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

.method i()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/P3/j;->u0:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lax/P3/j;->n(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_4f

    .line 22
    .line 23
    iget-boolean v0, p0, Lax/P3/j;->q0:Z

    .line 24
    .line 25
    if-nez v0, :cond_47

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lax/P3/j;->q0:Z

    .line 29
    .line 30
    iget-object v0, p0, Lax/P3/j;->f0:Lax/P3/k;

    .line 31
    .line 32
    iget-object v2, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-interface {v0, v2, v3}, Lax/P3/k;->a(Lax/M3/h;Lax/P3/n;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2b
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_43

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lax/g4/g;

    .line 55
    .line 56
    invoke-direct {p0, v2}, Lax/P3/j;->m(Lax/g4/g;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_2b

    .line 61
    .line 62
    iget-object v3, p0, Lax/P3/j;->p0:Lax/P3/o;

    .line 63
    .line 64
    invoke-interface {v2, v3}, Lax/g4/g;->a(Lax/P3/o;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2b

    .line 68
    :cond_43
    invoke-direct {p0, v1}, Lax/P3/j;->n(Z)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_47
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "Already failed once"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_4f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "Received an exception without any callbacks to notify"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
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

.method j()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/P3/j;->u0:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_13

    .line 10
    .line 11
    iget-object v0, p0, Lax/P3/j;->m0:Lax/P3/s;

    .line 12
    .line 13
    invoke-interface {v0}, Lax/P3/s;->recycle()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v1}, Lax/P3/j;->n(Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_70

    .line 27
    .line 28
    iget-boolean v0, p0, Lax/P3/j;->o0:Z

    .line 29
    .line 30
    if-nez v0, :cond_68

    .line 31
    .line 32
    iget-object v0, p0, Lax/P3/j;->e0:Lax/P3/j$a;

    .line 33
    .line 34
    iget-object v2, p0, Lax/P3/j;->m0:Lax/P3/s;

    .line 35
    .line 36
    iget-boolean v3, p0, Lax/P3/j;->k0:Z

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Lax/P3/j$a;->a(Lax/P3/s;Z)Lax/P3/n;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, p0, Lax/P3/j;->o0:Z

    .line 46
    .line 47
    invoke-virtual {v0}, Lax/P3/n;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lax/P3/j;->f0:Lax/P3/k;

    .line 51
    .line 52
    iget-object v2, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 53
    .line 54
    iget-object v3, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 55
    .line 56
    invoke-interface {v0, v2, v3}, Lax/P3/k;->a(Lax/M3/h;Lax/P3/n;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_40
    :goto_40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5f

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lax/g4/g;

    .line 76
    .line 77
    invoke-direct {p0, v2}, Lax/P3/j;->m(Lax/g4/g;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_40

    .line 82
    .line 83
    iget-object v3, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 84
    .line 85
    invoke-virtual {v3}, Lax/P3/n;->a()V

    .line 86
    .line 87
    .line 88
    iget-object v3, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 89
    .line 90
    iget-object v4, p0, Lax/P3/j;->n0:Lax/M3/a;

    .line 91
    .line 92
    invoke-interface {v2, v3, v4}, Lax/g4/g;->b(Lax/P3/s;Lax/M3/a;)V

    .line 93
    .line 94
    .line 95
    goto :goto_40

    .line 96
    :cond_5f
    iget-object v0, p0, Lax/P3/j;->s0:Lax/P3/n;

    .line 97
    .line 98
    invoke-virtual {v0}, Lax/P3/n;->d()V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v1}, Lax/P3/j;->n(Z)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v1, "Already have resource"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v1, "Received a resource without any callbacks to notify"

    .line 116
    .line 117
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0
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

.method k(Lax/M3/h;ZZ)Lax/P3/j;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "ZZ)",
            "Lax/P3/j<",
            "TR;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/P3/j;->j0:Lax/M3/h;

    .line 2
    .line 3
    iput-boolean p2, p0, Lax/P3/j;->k0:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lax/P3/j;->l0:Z

    .line 6
    .line 7
    return-object p0
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

.method public l()Lax/l4/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

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

.method public o(Lax/g4/g;)V
    .registers 3

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/j;->c0:Lax/l4/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lax/P3/j;->o0:Z

    .line 10
    .line 11
    if-nez v0, :cond_22

    .line 12
    .line 13
    iget-boolean v0, p0, Lax/P3/j;->q0:Z

    .line 14
    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_22

    .line 18
    :cond_11
    iget-object v0, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/P3/j;->q:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_21

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/P3/j;->f()V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void

    .line 35
    :cond_22
    :goto_22
    invoke-direct {p0, p1}, Lax/P3/j;->e(Lax/g4/g;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public p(Lax/P3/f;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/f<",
            "TR;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/P3/j;->t0:Lax/P3/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/P3/f;->P()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lax/P3/j;->g0:Lax/S3/a;

    .line 10
    .line 11
    goto :goto_f

    .line 12
    :cond_b
    invoke-direct {p0}, Lax/P3/j;->g()Lax/S3/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_f
    invoke-virtual {v0, p1}, Lax/S3/a;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method
