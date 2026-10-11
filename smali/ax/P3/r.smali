.class final Lax/P3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/s;
.implements Lax/l4/a$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/P3/s<",
        "TZ;>;",
        "Lax/l4/a$f;"
    }
.end annotation


# static fields
.field private static final f0:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Lax/P3/r<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private c0:Lax/P3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/P3/s<",
            "TZ;>;"
        }
    .end annotation
.end field

.field private d0:Z

.field private e0:Z

.field private final q:Lax/l4/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/P3/r$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P3/r$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-static {v1, v0}, Lax/l4/a;->e(ILax/l4/a$d;)Lax/b0/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/P3/r;->f0:Lax/b0/d;

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

.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/l4/b;->a()Lax/l4/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/P3/r;->q:Lax/l4/b;

    .line 9
    .line 10
    return-void
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

.method private a(Lax/P3/s;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "TZ;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/P3/r;->e0:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/P3/r;->d0:Z

    .line 6
    .line 7
    iput-object p1, p0, Lax/P3/r;->c0:Lax/P3/s;

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
    .line 22
.end method

.method static c(Lax/P3/s;)Lax/P3/r;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/P3/s<",
            "TZ;>;)",
            "Lax/P3/r<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/P3/r;->f0:Lax/b0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/P3/r;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lax/P3/r;->a(Lax/P3/s;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method private d()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/P3/r;->c0:Lax/P3/s;

    .line 3
    .line 4
    sget-object v0, Lax/P3/r;->f0:Lax/b0/d;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

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


# virtual methods
.method public b()Ljava/lang/Class;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/r;->c0:Lax/P3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/P3/s;->b()Ljava/lang/Class;

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

.method public declared-synchronized e()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/P3/r;->q:Lax/l4/b;

    .line 3
    .line 4
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lax/P3/r;->d0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lax/P3/r;->d0:Z

    .line 13
    .line 14
    iget-boolean v0, p0, Lax/P3/r;->e0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_17

    .line 17
    .line 18
    invoke-virtual {p0}, Lax/P3/r;->recycle()V
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_15

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catchall_15
    move-exception v0

    .line 23
    goto :goto_21

    .line 24
    :cond_17
    :goto_17
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :cond_19
    :try_start_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "Already unlocked"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_21
    monitor-exit p0
    :try_end_22
    .catchall {:try_start_19 .. :try_end_22} :catchall_15

    .line 35
    throw v0
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

.method public get()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/r;->c0:Lax/P3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/P3/s;->get()Ljava/lang/Object;

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

.method public getSize()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/r;->c0:Lax/P3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/P3/s;->getSize()I

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

.method public l()Lax/l4/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/r;->q:Lax/l4/b;

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

.method public declared-synchronized recycle()V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/P3/r;->q:Lax/l4/b;

    .line 3
    .line 4
    invoke-virtual {v0}, Lax/l4/b;->c()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lax/P3/r;->e0:Z

    .line 9
    .line 10
    iget-boolean v0, p0, Lax/P3/r;->d0:Z

    .line 11
    .line 12
    if-nez v0, :cond_18

    .line 13
    .line 14
    iget-object v0, p0, Lax/P3/r;->c0:Lax/P3/s;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/P3/s;->recycle()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lax/P3/r;->d()V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_16

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    :goto_18
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1a
    :try_start_1a
    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_1a .. :try_end_1b} :catchall_16

    .line 28
    throw v0
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
