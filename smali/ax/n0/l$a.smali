.class final Lax/n0/l$a;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/n0/l;-><init>(Lax/Qb/J;Lax/Fb/l;Lax/Fb/p;Lax/Fb/p;)V
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
.field final synthetic c0:Lax/n0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/n0/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic d0:Lax/Fb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Fb/p<",
            "TT;",
            "Ljava/lang/Throwable;",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic q:Lax/Fb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Fb/l<",
            "Ljava/lang/Throwable;",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/Fb/l;Lax/n0/l;Lax/Fb/p;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Fb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lax/sb/t;",
            ">;",
            "Lax/n0/l<",
            "TT;>;",
            "Lax/Fb/p<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            "Lax/sb/t;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/n0/l$a;->q:Lax/Fb/l;

    .line 2
    .line 3
    iput-object p2, p0, Lax/n0/l$a;->c0:Lax/n0/l;

    .line 4
    .line 5
    iput-object p3, p0, Lax/n0/l$a;->d0:Lax/Fb/p;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lax/Gb/m;-><init>(I)V

    .line 9
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/n0/l$a;->q:Lax/Fb/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lax/Fb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/n0/l$a;->c0:Lax/n0/l;

    .line 7
    .line 8
    invoke-static {v0}, Lax/n0/l;->b(Lax/n0/l;)Lax/Sb/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lax/Sb/n;->c(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/n0/l$a;->c0:Lax/n0/l;

    .line 16
    .line 17
    invoke-static {v0}, Lax/n0/l;->b(Lax/n0/l;)Lax/Sb/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lax/Sb/m;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lax/Sb/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_20

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_27

    .line 33
    :cond_20
    iget-object v1, p0, Lax/n0/l$a;->d0:Lax/Fb/p;

    .line 34
    .line 35
    invoke-interface {v1, v0, p1}, Lax/Fb/p;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object v0, Lax/sb/t;->a:Lax/sb/t;

    .line 39
    .line 40
    :goto_27
    if-nez v0, :cond_e

    .line 41
    .line 42
    return-void
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
    invoke-virtual {p0, p1}, Lax/n0/l$a;->a(Ljava/lang/Throwable;)V

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
