.class public Landroidx/fragment/app/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)V
    .registers 4

    .line 1
    instance-of v0, p0, Landroidx/fragment/app/p;

    .line 2
    .line 3
    if-eqz v0, :cond_2a

    .line 4
    .line 5
    check-cast p0, Landroidx/fragment/app/p;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/p;->n0:Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v0, :cond_2a

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/Exception;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "FRAGMENT_TRANSACTION_TOO_LARGE : "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Landroidx/fragment/app/p;->q:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string p0, "FRAGMENT_TRANSACTION_TOO_LARGE"

    .line 39
    .line 40
    invoke-static {p0, v0}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-void
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
