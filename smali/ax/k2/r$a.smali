.class public final Lax/k2/r$a;
.super Lax/k2/o$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/k2/r;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lax/k2/o;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lax/k2/r;


# direct methods
.method constructor <init>(Lax/k2/r;[Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/k2/r$a;->b:Lax/k2/r;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lax/k2/o$c;-><init>([Ljava/lang/String;)V

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


# virtual methods
.method public b()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

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

.method public c(Ljava/util/Set;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "tables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/k2/r$a;->b:Lax/k2/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/r;->j()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_12

    .line 17
    .line 18
    goto :goto_3a

    .line 19
    :cond_12
    :try_start_12
    iget-object v0, p0, Lax/k2/r$a;->b:Lax/k2/r;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/k2/r;->h()Lax/k2/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_3a

    .line 26
    .line 27
    iget-object v1, p0, Lax/k2/r$a;->b:Lax/k2/r;

    .line 28
    .line 29
    invoke-virtual {v1}, Lax/k2/r;->c()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    new-array v2, v2, [Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 41
    .line 42
    invoke-static {p1, v2}, Lax/Gb/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast p1, [Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {v0, v1, p1}, Lax/k2/k;->N1(I[Ljava/lang/String;)V
    :try_end_31
    .catch Landroid/os/RemoteException; {:try_start_12 .. :try_end_31} :catch_32

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_32
    move-exception p1

    .line 52
    const-string v0, "ROOM"

    .line 53
    .line 54
    const-string v1, "Cannot broadcast invalidation"

    .line 55
    .line 56
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    :cond_3a
    :goto_3a
    return-void
    .line 60
    .line 61
.end method
