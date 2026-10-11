.class public Lax/N2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N2/c;


# instance fields
.field private final a:Lax/L2/u;

.field final b:Landroid/os/Handler;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/N2/d;->b:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lax/N2/d$a;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lax/N2/d$a;-><init>(Lax/N2/d;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/N2/d;->c:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    new-instance v0, Lax/L2/u;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lax/L2/u;-><init>(Ljava/util/concurrent/Executor;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lax/N2/d;->a:Lax/L2/u;

    .line 28
    .line 29
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
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/N2/d;->c:Ljava/util/concurrent/Executor;

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

.method public bridge synthetic b()Lax/N2/a;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/N2/d;->d()Lax/L2/u;

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

.method public synthetic c(Ljava/lang/Runnable;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/N2/b;->a(Lax/N2/c;Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Lax/L2/u;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/N2/d;->a:Lax/L2/u;

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
