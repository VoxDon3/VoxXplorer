.class Lax/b1/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b1/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/b1/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public a(Lax/P0/v;)I
    .registers 2

    .line 1
    iget-object p1, p1, Lax/P0/v;->s:Lax/P0/o;

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_6
    const/4 p1, 0x0

    .line 8
    return p1
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

.method public b(Lax/b1/u$a;Lax/P0/v;)Lax/b1/n;
    .registers 5

    .line 1
    iget-object p1, p2, Lax/P0/v;->s:Lax/P0/o;

    .line 2
    .line 3
    if-nez p1, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_6
    new-instance p1, Lax/b1/C;

    .line 8
    .line 9
    new-instance p2, Lax/b1/n$a;

    .line 10
    .line 11
    new-instance v0, Lax/b1/U;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lax/b1/U;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x1771

    .line 18
    .line 19
    invoke-direct {p2, v0, v1}, Lax/b1/n$a;-><init>(Ljava/lang/Throwable;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p2}, Lax/b1/C;-><init>(Lax/b1/n$a;)V

    .line 23
    .line 24
    .line 25
    return-object p1
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

.method public c(Landroid/os/Looper;Lax/Z0/I1;)V
    .registers 3

    .line 1
    return-void
    .line 2
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

.method public synthetic d()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/b1/v;->c(Lax/b1/w;)V

    return-void
.end method

.method public synthetic e(Lax/b1/u$a;Lax/P0/v;)Lax/b1/w$b;
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/b1/v;->a(Lax/b1/w;Lax/b1/u$a;Lax/P0/v;)Lax/b1/w$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/b1/v;->b(Lax/b1/w;)V

    return-void
.end method
