.class public Lax/E3/h;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/E3/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Lcom/box/androidsdk/content/models/BoxObject;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "Lcom/box/androidsdk/content/requests/BoxResponse<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field protected c0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/E3/h$b<",
            "TE;>;>;"
        }
    .end annotation
.end field

.field protected final q:Lcom/box/androidsdk/content/requests/BoxRequest;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/box/androidsdk/content/requests/BoxRequest;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TE;>;",
            "Lcom/box/androidsdk/content/requests/BoxRequest;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/E3/h$a;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lax/E3/h$a;-><init>(Lcom/box/androidsdk/content/requests/BoxRequest;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax/E3/h;->c0:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p2, p0, Lax/E3/h;->q:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 17
    .line 18
    return-void
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


# virtual methods
.method public declared-synchronized a(Lax/E3/h$b;)Lax/E3/h;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/E3/h$b<",
            "TE;>;)",
            "Lax/E3/h<",
            "TE;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/E3/h;->c0:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-object p0

    .line 9
    :catchall_8
    move-exception p1

    .line 10
    :try_start_9
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_8

    .line 11
    throw p1
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

.method protected declared-synchronized done()V
    .registers 6

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_2
    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/box/androidsdk/content/requests/BoxResponse;
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_8} :catch_11
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_8} :catch_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_8} :catch_d
    .catchall {:try_start_2 .. :try_end_8} :catchall_b

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    move-object v1, v0

    .line 11
    goto :goto_13

    .line 12
    :catchall_b
    move-exception v0

    .line 13
    goto :goto_3a

    .line 14
    :catch_d
    move-exception v1

    .line 15
    goto :goto_12

    .line 16
    :catch_f
    move-exception v1

    .line 17
    goto :goto_12

    .line 18
    :catch_11
    move-exception v1

    .line 19
    :goto_12
    move-object v2, v0

    .line 20
    :goto_13
    if-eqz v1, :cond_23

    .line 21
    .line 22
    :try_start_15
    new-instance v2, Lcom/box/androidsdk/content/requests/BoxResponse;

    .line 23
    .line 24
    new-instance v3, Lcom/box/androidsdk/content/BoxException;

    .line 25
    .line 26
    const-string v4, "Unable to retrieve response from FutureTask."

    .line 27
    .line 28
    invoke-direct {v3, v4, v1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lax/E3/h;->q:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 32
    .line 33
    invoke-direct {v2, v0, v3, v1}, Lcom/box/androidsdk/content/requests/BoxResponse;-><init>(Lcom/box/androidsdk/content/models/BoxObject;Ljava/lang/Exception;Lcom/box/androidsdk/content/requests/BoxRequest;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    iget-object v0, p0, Lax/E3/h;->c0:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_2a
    if-ge v3, v1, :cond_38

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    check-cast v4, Lax/E3/h$b;

    .line 52
    .line 53
    invoke-interface {v4, v2}, Lax/E3/h$b;->a(Lcom/box/androidsdk/content/requests/BoxResponse;)V
    :try_end_37
    .catchall {:try_start_15 .. :try_end_37} :catchall_b

    .line 54
    .line 55
    .line 56
    goto :goto_2a

    .line 57
    :cond_38
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :goto_3a
    :try_start_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_3a .. :try_end_3b} :catchall_b

    .line 60
    throw v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
