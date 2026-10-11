.class public final Lax/p5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lax/n5/h;Lax/n5/e;)V
    .registers 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/n5/h<",
            "*>;",
            "Lax/n5/e;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lax/p5/s;

    .line 2
    .line 3
    if-eqz v0, :cond_1b

    .line 4
    .line 5
    check-cast p0, Lax/p5/s;

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/p5/s;->d()Lax/p5/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Lax/p5/p;->f(Lax/n5/e;)Lax/p5/p;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Lax/p5/u;->c()Lax/p5/u;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lax/p5/u;->e()Lax/w5/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p0, v0}, Lax/w5/r;->l(Lax/p5/p;I)Lax/q5/g;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    const-string p1, "ForcedSender"

    .line 29
    .line 30
    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    .line 31
    .line 32
    invoke-static {p1, v0, p0}, Lax/t5/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
