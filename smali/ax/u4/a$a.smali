.class Lax/u4/a$a;
.super Lax/p4/n$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/u4/a;->k(Lax/p4/m;Lax/p4/k;Ljava/util/Collection;)Lax/u4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/p4/n$c<",
        "Lax/u4/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/u4/a;


# direct methods
.method constructor <init>(Lax/u4/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/u4/a$a;->a:Lax/u4/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/p4/n$c;-><init>()V

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


# virtual methods
.method public bridge synthetic a(Lax/s4/a$b;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/u4/a$a;->b(Lax/s4/a$b;)Lax/u4/d;

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

.method public b(Lax/s4/a$b;)Lax/u4/d;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/s4/a$b;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xc8

    .line 6
    .line 7
    if-ne v0, v1, :cond_11

    .line 8
    .line 9
    sget-object v0, Lax/u4/d;->e:Lax/t4/b;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lax/p4/n;->u(Lax/t4/b;Lax/s4/a$b;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/u4/d;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    invoke-static {p1}, Lax/p4/n;->q(Lax/s4/a$b;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lax/u4/b;->d:Lax/t4/b;

    .line 23
    .line 24
    invoke-static {v1, p1}, Lax/p4/n;->u(Lax/t4/b;Lax/s4/a$b;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lax/u4/b;

    .line 29
    .line 30
    new-instance v1, Lax/u4/c;

    .line 31
    .line 32
    invoke-direct {v1, v0, p1}, Lax/u4/c;-><init>(Ljava/lang/String;Lax/u4/b;)V

    .line 33
    .line 34
    .line 35
    throw v1
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
