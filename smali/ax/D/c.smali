.class public final Lax/D/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/D/c$b;,
        Lax/D/c$a;,
        Lax/D/c$d;,
        Lax/D/c$c;
    }
.end annotation


# direct methods
.method public static a(Lax/D/c$c;)Lax/v7/e;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lax/D/c$c<",
            "TT;>;)",
            "Lax/v7/e<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/D/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/D/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/D/c$d;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lax/D/c$d;-><init>(Lax/D/c$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lax/D/c$a;->b:Lax/D/c$d;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iput-object v2, v0, Lax/D/c$a;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :try_start_12
    invoke-interface {p0, v0}, Lax/D/c$c;->a(Lax/D/c$a;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1f

    .line 24
    .line 25
    iput-object p0, v0, Lax/D/c$a;->a:Ljava/lang/Object;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_1a} :catch_1b

    .line 26
    .line 27
    return-object v1

    .line 28
    :catch_1b
    move-exception p0

    .line 29
    invoke-virtual {v1, p0}, Lax/D/c$d;->c(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-object v1
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
