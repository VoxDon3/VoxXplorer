.class public abstract Lax/k2/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/k2/u;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Lax/sb/h;


# direct methods
.method public constructor <init>(Lax/k2/u;)V
    .registers 3

    .line 1
    const-string v0, "database"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/k2/A;->a:Lax/k2/u;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/k2/A;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Lax/k2/A$a;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lax/k2/A$a;-><init>(Lax/k2/A;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lax/sb/i;->a(Lax/Fb/a;)Lax/sb/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lax/k2/A;->c:Lax/sb/h;

    .line 29
    .line 30
    return-void
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

.method public static final synthetic a(Lax/k2/A;)Lax/o2/k;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/k2/A;->d()Lax/o2/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 22
.end method

.method private final d()Lax/o2/k;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/k2/A;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/k2/A;->a:Lax/k2/u;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lax/k2/u;->f(Ljava/lang/String;)Lax/o2/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method private final f()Lax/o2/k;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/A;->c:Lax/sb/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/sb/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/o2/k;

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

.method private final g(Z)Lax/o2/k;
    .registers 2

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-direct {p0}, Lax/k2/A;->f()Lax/o2/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_7
    invoke-direct {p0}, Lax/k2/A;->d()Lax/o2/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.method public b()Lax/o2/k;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/k2/A;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/k2/A;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Lax/k2/A;->g(Z)Lax/o2/k;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected c()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/k2/A;->a:Lax/k2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/u;->c()V

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
.end method

.method protected abstract e()Ljava/lang/String;
.end method

.method public h(Lax/o2/k;)V
    .registers 3

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/k2/A;->f()Lax/o2/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_11

    .line 11
    .line 12
    iget-object p1, p0, Lax/k2/A;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
