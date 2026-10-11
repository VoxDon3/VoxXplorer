.class public final Lax/i/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lax/Fb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Fb/a<",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;

.field private d:I

.field private e:Z

.field private f:Z

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/Fb/a<",
            "Lax/sb/t;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lax/Fb/a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lax/Fb/a<",
            "Lax/sb/t;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "executor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reportFullyDrawn"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax/i/p;->a:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iput-object p2, p0, Lax/i/p;->b:Lax/Fb/a;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lax/i/p;->c:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lax/i/p;->g:Ljava/util/List;

    .line 31
    .line 32
    new-instance p1, Lax/i/o;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Lax/i/o;-><init>(Lax/i/p;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lax/i/p;->h:Ljava/lang/Runnable;

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
.end method

.method public static synthetic a(Lax/i/p;)V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/i/p;->d(Lax/i/p;)V

    return-void
.end method

.method private static final d(Lax/i/p;)V
    .registers 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/i/p;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_9
    iput-boolean v1, p0, Lax/i/p;->e:Z

    .line 11
    .line 12
    iget v1, p0, Lax/i/p;->d:I

    .line 13
    .line 14
    if-nez v1, :cond_1e

    .line 15
    .line 16
    iget-boolean v1, p0, Lax/i/p;->f:Z

    .line 17
    .line 18
    if-nez v1, :cond_1e

    .line 19
    .line 20
    iget-object v1, p0, Lax/i/p;->b:Lax/Fb/a;

    .line 21
    .line 22
    invoke-interface {v1}, Lax/Fb/a;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lax/i/p;->b()V

    .line 26
    .line 27
    .line 28
    goto :goto_1e

    .line 29
    :catchall_1c
    move-exception p0

    .line 30
    goto :goto_22

    .line 31
    :cond_1e
    :goto_1e
    sget-object p0, Lax/sb/t;->a:Lax/sb/t;
    :try_end_20
    .catchall {:try_start_9 .. :try_end_20} :catchall_1c

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_22
    monitor-exit v0

    .line 36
    throw p0
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


# virtual methods
.method public final b()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_4
    iput-boolean v1, p0, Lax/i/p;->f:Z

    .line 6
    .line 7
    iget-object v1, p0, Lax/i/p;->g:Ljava/util/List;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_20

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lax/Fb/a;

    .line 26
    .line 27
    invoke-interface {v2}, Lax/Fb/a;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_e

    .line 31
    :catchall_1e
    move-exception v1

    .line 32
    goto :goto_29

    .line 33
    :cond_20
    iget-object v1, p0, Lax/i/p;->g:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_27
    .catchall {:try_start_4 .. :try_end_27} :catchall_1e

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_29
    monitor-exit v0

    .line 43
    throw v1
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

.method public final c()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-boolean v1, p0, Lax/i/p;->f:Z
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_7

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_7
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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
