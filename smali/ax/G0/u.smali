.class public final Lax/G0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lax/G0/v;)Lax/I0/a;
    .registers 2

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Landroidx/lifecycle/c;

    .line 7
    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    check-cast p0, Landroidx/lifecycle/c;

    .line 11
    .line 12
    invoke-interface {p0}, Landroidx/lifecycle/c;->getDefaultViewModelCreationExtras()Lax/I0/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_10
    sget-object p0, Lax/I0/a$a;->b:Lax/I0/a$a;

    .line 18
    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
.end method
