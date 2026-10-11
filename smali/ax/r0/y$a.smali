.class public abstract Lax/r0/y$a;
.super Lax/r0/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lax/r0/y<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lax/r0/y$a<",
        "TMessageType;TBuilderType;>;>",
        "Lax/r0/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field protected c0:Lax/r0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected d0:Z

.field private final q:Lax/r0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lax/r0/y;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/r0/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/r0/y$a;->q:Lax/r0/y;

    .line 5
    .line 6
    sget-object v0, Lax/r0/y$f;->e0:Lax/r0/y$f;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lax/r0/y;->t(Lax/r0/y$f;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lax/r0/y;

    .line 13
    .line 14
    iput-object p1, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lax/r0/y$a;->d0:Z

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method private B(Lax/r0/y;Lax/r0/y;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/r0/d0;->a()Lax/r0/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/r0/d0;->e(Ljava/lang/Object;)Lax/r0/h0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1, p2}, Lax/r0/h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

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
.method public bridge synthetic c()Lax/r0/S;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->x()Lax/r0/y;

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

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->v()Lax/r0/y$a;

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

.method public bridge synthetic g()Lax/r0/S;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->s()Lax/r0/y;

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

.method protected bridge synthetic n(Lax/r0/a;)Lax/r0/a$a;
    .registers 2

    .line 1
    check-cast p1, Lax/r0/y;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/r0/y$a;->y(Lax/r0/y;)Lax/r0/y$a;

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

.method public final s()Lax/r0/y;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->t()Lax/r0/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/r0/y;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    invoke-static {v0}, Lax/r0/a$a;->r(Lax/r0/S;)Lax/r0/n0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public t()Lax/r0/y;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/r0/y$a;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/r0/y;->B()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lax/r0/y$a;->d0:Z

    .line 15
    .line 16
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public bridge synthetic u0()Lax/r0/S;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->t()Lax/r0/y;

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

.method public v()Lax/r0/y$a;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->x()Lax/r0/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/r0/y;->D()Lax/r0/y$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lax/r0/y$a;->t()Lax/r0/y;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lax/r0/y$a;->z(Lax/r0/y;)Lax/r0/y$a;

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected w()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/r0/y$a;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_18

    .line 4
    .line 5
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 6
    .line 7
    sget-object v1, Lax/r0/y$f;->e0:Lax/r0/y$f;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/r0/y;->t(Lax/r0/y$f;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lax/r0/y;

    .line 14
    .line 15
    iget-object v1, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Lax/r0/y$a;->B(Lax/r0/y;Lax/r0/y;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lax/r0/y$a;->d0:Z

    .line 24
    .line 25
    :cond_18
    return-void
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

.method public x()Lax/r0/y;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/r0/y$a;->q:Lax/r0/y;

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

.method protected y(Lax/r0/y;)Lax/r0/y$a;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/r0/y$a;->z(Lax/r0/y;)Lax/r0/y$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public z(Lax/r0/y;)Lax/r0/y$a;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/r0/y$a;->w()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/r0/y$a;->c0:Lax/r0/y;

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lax/r0/y$a;->B(Lax/r0/y;Lax/r0/y;)V

    .line 7
    .line 8
    .line 9
    return-object p0
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
