.class Lax/U3/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N3/b;
.implements Lax/N3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/U3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/N3/b<",
        "TData;>;",
        "Lax/N3/b$a<",
        "TData;>;"
    }
.end annotation


# instance fields
.field private final c0:Lax/b0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b0/d<",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;>;"
        }
    .end annotation
.end field

.field private d0:I

.field private e0:Lax/J3/g;

.field private f0:Lax/N3/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/N3/b$a<",
            "-TData;>;"
        }
    .end annotation
.end field

.field private g0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/N3/b<",
            "TData;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Lax/b0/d;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/N3/b<",
            "TData;>;>;",
            "Lax/b0/d<",
            "Ljava/util/List<",
            "Ljava/lang/Exception;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/U3/p$a;->c0:Lax/b0/d;

    .line 5
    .line 6
    invoke-static {p1}, Lax/k4/h;->c(Ljava/util/Collection;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lax/U3/p$a;->d0:I

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

.method private g()V
    .registers 5

    .line 1
    iget v0, p0, Lax/U3/p$a;->d0:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    if-ge v0, v1, :cond_1a

    .line 12
    .line 13
    iget v0, p0, Lax/U3/p$a;->d0:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    iput v0, p0, Lax/U3/p$a;->d0:I

    .line 18
    .line 19
    iget-object v0, p0, Lax/U3/p$a;->e0:Lax/J3/g;

    .line 20
    .line 21
    iget-object v1, p0, Lax/U3/p$a;->f0:Lax/N3/b$a;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Lax/U3/p$a;->e(Lax/J3/g;Lax/N3/b$a;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object v0, p0, Lax/U3/p$a;->f0:Lax/N3/b$a;

    .line 28
    .line 29
    new-instance v1, Lax/P3/o;

    .line 30
    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v3, p0, Lax/U3/p$a;->g0:Ljava/util/List;

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    const-string v3, "Fetch failed"

    .line 39
    .line 40
    invoke-direct {v1, v3, v2}, Lax/P3/o;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v1}, Lax/N3/b$a;->c(Ljava/lang/Exception;)V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lax/N3/b;

    .line 9
    .line 10
    invoke-interface {v0}, Lax/N3/b;->a()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U3/p$a;->g0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v1, p0, Lax/U3/p$a;->c0:Lax/b0/d;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Lax/b0/d;->a(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lax/U3/p$a;->g0:Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_22

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lax/N3/b;

    .line 30
    .line 31
    invoke-interface {v1}, Lax/N3/b;->b()V

    .line 32
    .line 33
    .line 34
    goto :goto_12

    .line 35
    :cond_22
    return-void
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

.method public c(Ljava/lang/Exception;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U3/p$a;->g0:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/U3/p$a;->g()V

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

.method public cancel()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_16

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/N3/b;

    .line 18
    .line 19
    invoke-interface {v1}, Lax/N3/b;->cancel()V

    .line 20
    .line 21
    .line 22
    goto :goto_6

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

.method public d()Lax/M3/a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lax/N3/b;

    .line 9
    .line 10
    invoke-interface {v0}, Lax/N3/b;->d()Lax/M3/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e(Lax/J3/g;Lax/N3/b$a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/J3/g;",
            "Lax/N3/b$a<",
            "-TData;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/U3/p$a;->e0:Lax/J3/g;

    .line 2
    .line 3
    iput-object p2, p0, Lax/U3/p$a;->f0:Lax/N3/b$a;

    .line 4
    .line 5
    iget-object p2, p0, Lax/U3/p$a;->c0:Lax/b0/d;

    .line 6
    .line 7
    invoke-interface {p2}, Lax/b0/d;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/util/List;

    .line 12
    .line 13
    iput-object p2, p0, Lax/U3/p$a;->g0:Ljava/util/List;

    .line 14
    .line 15
    iget-object p2, p0, Lax/U3/p$a;->q:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, Lax/U3/p$a;->d0:I

    .line 18
    .line 19
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lax/N3/b;

    .line 24
    .line 25
    invoke-interface {p2, p1, p0}, Lax/N3/b;->e(Lax/J3/g;Lax/N3/b$a;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public f(Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TData;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    iget-object v0, p0, Lax/U3/p$a;->f0:Lax/N3/b$a;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lax/N3/b$a;->f(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-direct {p0}, Lax/U3/p$a;->g()V

    .line 10
    .line 11
    .line 12
    return-void
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
