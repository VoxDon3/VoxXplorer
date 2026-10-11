.class Lax/K3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/K3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/K3/a;


# direct methods
.method constructor <init>(Lax/K3/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a()Ljava/lang/Void;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 5
    .line 6
    invoke-static {v1}, Lax/K3/a;->a(Lax/K3/a;)Ljava/io/Writer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_10

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object v2

    .line 15
    :catchall_e
    move-exception v1

    .line 16
    goto :goto_2a

    .line 17
    :cond_10
    iget-object v1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 18
    .line 19
    invoke-static {v1}, Lax/K3/a;->c(Lax/K3/a;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 23
    .line 24
    invoke-static {v1}, Lax/K3/a;->f(Lax/K3/a;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_28

    .line 29
    .line 30
    iget-object v1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 31
    .line 32
    invoke-static {v1}, Lax/K3/a;->g(Lax/K3/a;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lax/K3/a$a;->a:Lax/K3/a;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v1, v3}, Lax/K3/a;->j(Lax/K3/a;I)I

    .line 39
    .line 40
    .line 41
    :cond_28
    monitor-exit v0

    .line 42
    return-object v2

    .line 43
    :goto_2a
    monitor-exit v0
    :try_end_2b
    .catchall {:try_start_3 .. :try_end_2b} :catchall_e

    .line 44
    throw v1
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

.method public bridge synthetic call()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/K3/a$a;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
