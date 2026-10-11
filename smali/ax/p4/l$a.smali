.class Lax/p4/l$a;
.super Lax/p4/n$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/p4/l;->d(Lax/p4/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/p4/k;)Lax/p4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/p4/n$c<",
        "Lax/p4/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/p4/l;


# direct methods
.method constructor <init>(Lax/p4/l;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/p4/l$a;->a:Lax/p4/l;

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
    invoke-virtual {p0, p1}, Lax/p4/l$a;->b(Lax/s4/a$b;)Lax/p4/h;

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

.method public b(Lax/s4/a$b;)Lax/p4/h;
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
    sget-object v0, Lax/p4/h;->j:Lax/t4/b;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lax/p4/n;->u(Lax/t4/b;Lax/s4/a$b;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/p4/h;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    invoke-static {p1}, Lax/p4/n;->A(Lax/s4/a$b;)Lax/p4/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    throw p1
.end method
