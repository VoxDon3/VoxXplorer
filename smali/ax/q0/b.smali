.class public final Lax/q0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/n0/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/n0/f<",
        "Lax/q0/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/n0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/n0/f<",
            "Lax/q0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/n0/f;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/n0/f<",
            "Lax/q0/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/q0/b;->a:Lax/n0/f;

    .line 10
    .line 11
    return-void
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
.method public a(Lax/Fb/p;Lax/wb/e;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Fb/p<",
            "-",
            "Lax/q0/d;",
            "-",
            "Lax/wb/e<",
            "-",
            "Lax/q0/d;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lax/wb/e<",
            "-",
            "Lax/q0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/q0/b;->a:Lax/n0/f;

    .line 2
    .line 3
    new-instance v1, Lax/q0/b$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lax/q0/b$a;-><init>(Lax/Fb/p;Lax/wb/e;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, Lax/n0/f;->a(Lax/Fb/p;Lax/wb/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public b()Lax/Tb/b;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/Tb/b<",
            "Lax/q0/d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/q0/b;->a:Lax/n0/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/n0/f;->b()Lax/Tb/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
