.class Lax/u3/q$a;
.super Lax/u3/q$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/u3/q;-><init>(Lax/u3/q$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q$g<",
        "TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lax/u3/q$e;

.field final synthetic c:Lax/u3/q;


# direct methods
.method constructor <init>(Lax/u3/q;Lax/u3/q$e;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/u3/q$a;->c:Lax/u3/q;

    .line 2
    .line 3
    iput-object p2, p0, Lax/u3/q$a;->b:Lax/u3/q$e;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lax/u3/q$g;-><init>(Lax/u3/q$a;)V

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
.method public call()Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/u3/q$a;->c:Lax/u3/q;

    .line 2
    .line 3
    invoke-static {v0}, Lax/u3/q;->a(Lax/u3/q;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/u3/q$a;->b:Lax/u3/q$e;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/u3/q$e;->h()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/u3/q$a;->c:Lax/u3/q;

    .line 21
    .line 22
    iget-object v1, p0, Lax/u3/q$g;->a:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lax/u3/q;->g([Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lax/u3/q;->b(Lax/u3/q;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
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
