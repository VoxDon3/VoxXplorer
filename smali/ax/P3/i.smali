.class public Lax/P3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/k;
.implements Lax/R3/h$a;
.implements Lax/P3/n$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P3/i$b;,
        Lax/P3/i$a;,
        Lax/P3/i$e;,
        Lax/P3/i$f;,
        Lax/P3/i$c;,
        Lax/P3/i$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/M3/h;",
            "Lax/P3/j<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Lax/P3/m;

.field private final c:Lax/R3/h;

.field private final d:Lax/P3/i$b;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/M3/h;",
            "Ljava/lang/ref/WeakReference<",
            "Lax/P3/n<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field private final f:Lax/P3/v;

.field private final g:Lax/P3/i$c;

.field private final h:Lax/P3/i$a;

.field private i:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lax/P3/n<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/R3/h;Lax/R3/a$a;Lax/S3/a;Lax/S3/a;Lax/S3/a;)V
    .registers 18

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    .line 1
    invoke-direct/range {v0 .. v11}, Lax/P3/i;-><init>(Lax/R3/h;Lax/R3/a$a;Lax/S3/a;Lax/S3/a;Lax/S3/a;Ljava/util/Map;Lax/P3/m;Ljava/util/Map;Lax/P3/i$b;Lax/P3/i$a;Lax/P3/v;)V

    return-void
.end method

.method constructor <init>(Lax/R3/h;Lax/R3/a$a;Lax/S3/a;Lax/S3/a;Lax/S3/a;Ljava/util/Map;Lax/P3/m;Ljava/util/Map;Lax/P3/i$b;Lax/P3/i$a;Lax/P3/v;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/R3/h;",
            "Lax/R3/a$a;",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Lax/S3/a;",
            "Ljava/util/Map<",
            "Lax/M3/h;",
            "Lax/P3/j<",
            "*>;>;",
            "Lax/P3/m;",
            "Ljava/util/Map<",
            "Lax/M3/h;",
            "Ljava/lang/ref/WeakReference<",
            "Lax/P3/n<",
            "*>;>;>;",
            "Lax/P3/i$b;",
            "Lax/P3/i$a;",
            "Lax/P3/v;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/P3/i;->c:Lax/R3/h;

    .line 4
    new-instance v0, Lax/P3/i$c;

    invoke-direct {v0, p2}, Lax/P3/i$c;-><init>(Lax/R3/a$a;)V

    iput-object v0, p0, Lax/P3/i;->g:Lax/P3/i$c;

    if-nez p8, :cond_13

    .line 5
    new-instance p8, Ljava/util/HashMap;

    invoke-direct {p8}, Ljava/util/HashMap;-><init>()V

    .line 6
    :cond_13
    iput-object p8, p0, Lax/P3/i;->e:Ljava/util/Map;

    if-nez p7, :cond_1c

    .line 7
    new-instance p7, Lax/P3/m;

    invoke-direct {p7}, Lax/P3/m;-><init>()V

    .line 8
    :cond_1c
    iput-object p7, p0, Lax/P3/i;->b:Lax/P3/m;

    if-nez p6, :cond_25

    .line 9
    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    .line 10
    :cond_25
    iput-object p6, p0, Lax/P3/i;->a:Ljava/util/Map;

    if-nez p9, :cond_2e

    .line 11
    new-instance p9, Lax/P3/i$b;

    invoke-direct {p9, p3, p4, p5, p0}, Lax/P3/i$b;-><init>(Lax/S3/a;Lax/S3/a;Lax/S3/a;Lax/P3/k;)V

    .line 12
    :cond_2e
    iput-object p9, p0, Lax/P3/i;->d:Lax/P3/i$b;

    if-nez p10, :cond_37

    .line 13
    new-instance p10, Lax/P3/i$a;

    invoke-direct {p10, v0}, Lax/P3/i$a;-><init>(Lax/P3/f$e;)V

    .line 14
    :cond_37
    iput-object p10, p0, Lax/P3/i;->h:Lax/P3/i$a;

    if-nez p11, :cond_40

    .line 15
    new-instance p11, Lax/P3/v;

    invoke-direct {p11}, Lax/P3/v;-><init>()V

    .line 16
    :cond_40
    iput-object p11, p0, Lax/P3/i;->f:Lax/P3/v;

    .line 17
    invoke-interface {p1, p0}, Lax/R3/h;->c(Lax/R3/h$a;)V

    return-void
.end method

.method private e(Lax/M3/h;)Lax/P3/n;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            ")",
            "Lax/P3/n<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/i;->c:Lax/R3/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/R3/h;->d(Lax/M3/h;)Lax/P3/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_a
    instance-of v0, p1, Lax/P3/n;

    .line 12
    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    check-cast p1, Lax/P3/n;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    new-instance v0, Lax/P3/n;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p1, v1}, Lax/P3/n;-><init>(Lax/P3/s;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method private f()Ljava/lang/ref/ReferenceQueue;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/ReferenceQueue<",
            "Lax/P3/n<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P3/i;->i:Ljava/lang/ref/ReferenceQueue;

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/P3/i;->i:Ljava/lang/ref/ReferenceQueue;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lax/P3/i$e;

    .line 17
    .line 18
    iget-object v2, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 19
    .line 20
    iget-object v3, p0, Lax/P3/i;->i:Ljava/lang/ref/ReferenceQueue;

    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lax/P3/i$e;-><init>(Ljava/util/Map;Ljava/lang/ref/ReferenceQueue;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object v0, p0, Lax/P3/i;->i:Ljava/lang/ref/ReferenceQueue;

    .line 29
    .line 30
    return-object v0
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

.method private h(Lax/M3/h;Z)Lax/P3/n;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Z)",
            "Lax/P3/n<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    iget-object p2, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-eqz p2, :cond_20

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lax/P3/n;

    .line 20
    .line 21
    if-eqz p2, :cond_1a

    .line 22
    .line 23
    invoke-virtual {p2}, Lax/P3/n;->a()V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_1a
    iget-object v0, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_20
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private i(Lax/M3/h;Z)Lax/P3/n;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Z)",
            "Lax/P3/n<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    invoke-direct {p0, p1}, Lax/P3/i;->e(Lax/M3/h;)Lax/P3/n;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_1b

    .line 10
    .line 11
    invoke-virtual {p2}, Lax/P3/n;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 15
    .line 16
    new-instance v1, Lax/P3/i$f;

    .line 17
    .line 18
    invoke-direct {p0}, Lax/P3/i;->f()Ljava/lang/ref/ReferenceQueue;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v1, p1, p2, v2}, Lax/P3/i$f;-><init>(Lax/M3/h;Lax/P3/n;Ljava/lang/ref/ReferenceQueue;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-object p2
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

.method private static j(Ljava/lang/String;JLax/M3/h;)V
    .registers 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Lax/k4/d;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "ms, key: "

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "Engine"

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

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


# virtual methods
.method public a(Lax/M3/h;Lax/P3/n;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Lax/P3/n<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_1c

    .line 5
    .line 6
    invoke-virtual {p2, p1, p0}, Lax/P3/n;->e(Lax/M3/h;Lax/P3/n$a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lax/P3/n;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1c

    .line 14
    .line 15
    iget-object v0, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 16
    .line 17
    new-instance v1, Lax/P3/i$f;

    .line 18
    .line 19
    invoke-direct {p0}, Lax/P3/i;->f()Ljava/lang/ref/ReferenceQueue;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, p1, p2, v2}, Lax/P3/i$f;-><init>(Lax/M3/h;Lax/P3/n;Ljava/lang/ref/ReferenceQueue;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget-object p2, p0, Lax/P3/i;->a:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public b(Lax/M3/h;Lax/P3/n;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/i;->e:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lax/P3/n;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_14

    .line 14
    .line 15
    iget-object v0, p0, Lax/P3/i;->c:Lax/R3/h;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Lax/R3/h;->e(Lax/M3/h;Lax/P3/s;)Lax/P3/s;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    iget-object p1, p0, Lax/P3/i;->f:Lax/P3/v;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lax/P3/v;->a(Lax/P3/s;)V

    .line 24
    .line 25
    .line 26
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
.end method

.method public c(Lax/P3/s;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/i;->f:Lax/P3/v;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lax/P3/v;->a(Lax/P3/s;)V

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
.end method

.method public d(Lax/P3/j;Lax/M3/h;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/P3/i;->a:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lax/P3/j;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_16

    .line 17
    .line 18
    iget-object p1, p0, Lax/P3/i;->a:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
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

.method public g(Lax/J3/e;Ljava/lang/Object;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZLax/M3/j;ZZZLax/g4/g;)Lax/P3/i$d;
    .registers 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/J3/e;",
            "Ljava/lang/Object;",
            "Lax/M3/h;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lax/J3/g;",
            "Lax/P3/h;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;ZZ",
            "Lax/M3/j;",
            "ZZZ",
            "Lax/g4/g;",
            ")",
            "Lax/P3/i$d;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p14

    move-object/from16 v2, p17

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    invoke-static {}, Lax/k4/d;->b()J

    move-result-wide v3

    .line 3
    iget-object v5, v0, Lax/P3/i;->b:Lax/P3/m;

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v10, p10

    move-object/from16 v13, p13

    invoke-virtual/range {v5 .. v13}, Lax/P3/m;->a(Ljava/lang/Object;Lax/M3/h;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lax/M3/j;)Lax/P3/l;

    move-result-object v5

    .line 4
    invoke-direct {v0, v5, v1}, Lax/P3/i;->i(Lax/M3/h;Z)Lax/P3/n;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    .line 5
    const-string v9, "Engine"

    if-eqz v6, :cond_3e

    .line 6
    sget-object v1, Lax/M3/a;->f0:Lax/M3/a;

    invoke-interface {v2, v6, v1}, Lax/g4/g;->b(Lax/P3/s;Lax/M3/a;)V

    .line 7
    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3d

    .line 8
    const-string v1, "Loaded resource from cache"

    invoke-static {v1, v3, v4, v5}, Lax/P3/i;->j(Ljava/lang/String;JLax/M3/h;)V

    :cond_3d
    return-object v7

    .line 9
    :cond_3e
    invoke-direct {v0, v5, v1}, Lax/P3/i;->h(Lax/M3/h;Z)Lax/P3/n;

    move-result-object v6

    if-eqz v6, :cond_55

    .line 10
    sget-object v1, Lax/M3/a;->f0:Lax/M3/a;

    invoke-interface {v2, v6, v1}, Lax/g4/g;->b(Lax/P3/s;Lax/M3/a;)V

    .line 11
    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_54

    .line 12
    const-string v1, "Loaded resource from active resources"

    invoke-static {v1, v3, v4, v5}, Lax/P3/i;->j(Ljava/lang/String;JLax/M3/h;)V

    :cond_54
    return-object v7

    .line 13
    :cond_55
    iget-object v6, v0, Lax/P3/i;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lax/P3/j;

    if-eqz v6, :cond_73

    .line 14
    invoke-virtual {v6, v2}, Lax/P3/j;->d(Lax/g4/g;)V

    .line 15
    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_6d

    .line 16
    const-string v1, "Added to existing load"

    invoke-static {v1, v3, v4, v5}, Lax/P3/i;->j(Ljava/lang/String;JLax/M3/h;)V

    .line 17
    :cond_6d
    new-instance v1, Lax/P3/i$d;

    invoke-direct {v1, v2, v6}, Lax/P3/i$d;-><init>(Lax/g4/g;Lax/P3/j;)V

    return-object v1

    .line 18
    :cond_73
    iget-object v6, v0, Lax/P3/i;->d:Lax/P3/i$b;

    move/from16 v7, p15

    invoke-virtual {v6, v5, v1, v7}, Lax/P3/i$b;->a(Lax/M3/h;ZZ)Lax/P3/j;

    move-result-object v22

    .line 19
    iget-object v6, v0, Lax/P3/i;->h:Lax/P3/i$a;

    move-object v1, v9

    move-object v9, v5

    move-object v5, v1

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    move-object/from16 v15, p8

    move-object/from16 v16, p9

    move-object/from16 v17, p10

    move/from16 v18, p11

    move/from16 v19, p12

    move-object/from16 v21, p13

    move/from16 v20, p16

    const/4 v1, 0x2

    invoke-virtual/range {v6 .. v22}, Lax/P3/i$a;->a(Lax/J3/e;Ljava/lang/Object;Lax/P3/l;Lax/M3/h;IILjava/lang/Class;Ljava/lang/Class;Lax/J3/g;Lax/P3/h;Ljava/util/Map;ZZZLax/M3/j;Lax/P3/f$b;)Lax/P3/f;

    move-result-object v6

    move-object/from16 v7, v22

    .line 20
    iget-object v8, v0, Lax/P3/i;->a:Ljava/util/Map;

    invoke-interface {v8, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {v7, v2}, Lax/P3/j;->d(Lax/g4/g;)V

    .line 22
    invoke-virtual {v7, v6}, Lax/P3/j;->p(Lax/P3/f;)V

    .line 23
    invoke-static {v5, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_b9

    .line 24
    const-string v1, "Started new load"

    invoke-static {v1, v3, v4, v9}, Lax/P3/i;->j(Ljava/lang/String;JLax/M3/h;)V

    .line 25
    :cond_b9
    new-instance v1, Lax/P3/i$d;

    invoke-direct {v1, v2, v7}, Lax/P3/i$d;-><init>(Lax/g4/g;Lax/P3/j;)V

    return-object v1
.end method

.method public k(Lax/P3/s;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lax/P3/n;

    .line 5
    .line 6
    if-eqz v0, :cond_d

    .line 7
    .line 8
    check-cast p1, Lax/P3/n;

    .line 9
    .line 10
    invoke-virtual {p1}, Lax/P3/n;->d()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Cannot release anything but an EngineResource"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
    .line 22
.end method
