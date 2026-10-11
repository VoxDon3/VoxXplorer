.class Lax/K2/s$a;
.super Lax/k2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/K2/s;-><init>(Lax/k2/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/k2/i<",
        "Lax/K2/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lax/K2/s;


# direct methods
.method constructor <init>(Lax/K2/s;Lax/k2/u;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/K2/s$a;->d:Lax/K2/s;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lax/k2/i;-><init>(Lax/k2/u;)V

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
.method public e()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

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

.method public bridge synthetic i(Lax/o2/k;Ljava/lang/Object;)V
    .registers 3

    .line 1
    check-cast p2, Lax/K2/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/K2/s$a;->k(Lax/o2/k;Lax/K2/q;)V

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

.method public k(Lax/o2/k;Lax/K2/q;)V
    .registers 5

    .line 1
    invoke-virtual {p2}, Lax/K2/q;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_b

    .line 7
    .line 8
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 9
    .line 10
    .line 11
    goto :goto_12

    .line 12
    :cond_b
    invoke-virtual {p2}, Lax/K2/q;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v1, v0}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_12
    invoke-virtual {p2}, Lax/K2/q;->a()Landroidx/work/b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x2

    .line 28
    if-nez p2, :cond_21

    .line 29
    .line 30
    invoke-interface {p1, v0}, Lax/o2/i;->t0(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    invoke-interface {p1, v0, p2}, Lax/o2/i;->e0(I[B)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
.end method
