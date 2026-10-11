.class Lax/W2/b$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/b;


# direct methods
.method public constructor <init>(Lax/W2/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$b;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$b;->x(Ljava/lang/Boolean;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$b;->y(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 5

    .line 1
    iget-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-static {p1}, Lax/W2/b;->w0(Lax/W2/b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2e

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lax/U2/f;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/U2/f;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-object v2, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 28
    .line 29
    invoke-virtual {v2}, Lax/W2/j;->w()Lax/W2/v;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v0, v1}, Lax/W2/v;->h(J)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Lax/W2/v;->g(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_a

    .line 47
    :cond_2e
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    return-object p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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

.method protected y(Ljava/lang/Boolean;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 7
    .line 8
    new-instance v0, Lax/W2/b$c;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lax/W2/b$c;-><init>(Lax/W2/b;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lax/W2/b;->C0(Lax/W2/b;Lax/W2/b$c;)Lax/W2/b$c;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/W2/b$b;->h:Lax/W2/b;

    .line 17
    .line 18
    invoke-static {p1}, Lax/W2/b;->B0(Lax/W2/b;)Lax/W2/b$c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x0

    .line 23
    new-array v0, v0, [Ljava/lang/Void;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

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
