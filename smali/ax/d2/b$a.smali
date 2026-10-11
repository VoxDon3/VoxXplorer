.class final Lax/d2/b$a;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d2/b;->b(Lax/Qb/Q;Ljava/lang/Object;)Lax/v7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/l<",
        "Ljava/lang/Throwable;",
        "Lax/sb/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c0:Lax/Qb/Q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Qb/Q<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic q:Lax/D/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/D/c$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/D/c$a;Lax/Qb/Q;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/D/c$a<",
            "TT;>;",
            "Lax/Qb/Q<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d2/b$a;->q:Lax/D/c$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d2/b$a;->c0:Lax/Qb/Q;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lax/Gb/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final a(Ljava/lang/Throwable;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_12

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-object p1, p0, Lax/d2/b$a;->q:Lax/D/c$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/D/c$a;->c()Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object v0, p0, Lax/d2/b$a;->q:Lax/D/c$a;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lax/D/c$a;->e(Ljava/lang/Throwable;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object p1, p0, Lax/d2/b$a;->q:Lax/D/c$a;

    .line 20
    .line 21
    iget-object v0, p0, Lax/d2/b$a;->c0:Lax/Qb/Q;

    .line 22
    .line 23
    invoke-interface {v0}, Lax/Qb/Q;->c()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lax/D/c$a;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d2/b$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 7
    .line 8
    return-object p1
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
