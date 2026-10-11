.class final Lax/n0/l$b;
.super Lax/yb/l;
.source "SourceFile"

# interfaces
.implements Lax/Fb/p;


# annotations
.annotation runtime Lax/yb/f;
    c = "androidx.datastore.core.SimpleActor$offer$2"
    f = "SimpleActor.kt"
    l = {
        0x7a,
        0x7a
    }
    m = "invokeSuspend"
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/n0/l;->e(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/yb/l;",
        "Lax/Fb/p<",
        "Lax/Qb/J;",
        "Lax/wb/e<",
        "-",
        "Lax/sb/t;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field f0:Ljava/lang/Object;

.field g0:I

.field final synthetic h0:Lax/n0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/n0/l<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/n0/l;Lax/wb/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/n0/l<",
            "TT;>;",
            "Lax/wb/e<",
            "-",
            "Lax/n0/l$b;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lax/yb/l;-><init>(ILax/wb/e;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final a(Ljava/lang/Object;Lax/wb/e;)Lax/wb/e;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lax/wb/e<",
            "*>;)",
            "Lax/wb/e<",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/n0/l$b;

    .line 2
    .line 3
    iget-object v0, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lax/n0/l$b;-><init>(Lax/n0/l;Lax/wb/e;)V

    .line 6
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

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 1
    check-cast p1, Lax/Qb/J;

    .line 2
    .line 3
    check-cast p2, Lax/wb/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/n0/l$b;->u(Lax/Qb/J;Lax/wb/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public final p(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    .line 1
    invoke-static {}, Lax/xb/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lax/n0/l$b;->g0:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_22

    .line 10
    .line 11
    if-eq v1, v3, :cond_1a

    .line 12
    .line 13
    if-ne v1, v2, :cond_12

    .line 14
    .line 15
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_62

    .line 19
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1a
    iget-object v1, p0, Lax/n0/l$b;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lax/Fb/p;

    .line 30
    .line 31
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_56

    .line 35
    :cond_22
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 39
    .line 40
    invoke-static {p1}, Lax/n0/l;->c(Lax/n0/l;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-lez p1, :cond_33

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 p1, 0x0

    .line 53
    :goto_34
    if-eqz p1, :cond_71

    .line 54
    .line 55
    :cond_36
    iget-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 56
    .line 57
    invoke-static {p1}, Lax/n0/l;->d(Lax/n0/l;)Lax/Qb/J;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lax/Qb/K;->c(Lax/Qb/J;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 65
    .line 66
    invoke-static {p1}, Lax/n0/l;->a(Lax/n0/l;)Lax/Fb/p;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 71
    .line 72
    invoke-static {p1}, Lax/n0/l;->b(Lax/n0/l;)Lax/Sb/d;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object v1, p0, Lax/n0/l$b;->f0:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, p0, Lax/n0/l$b;->g0:I

    .line 79
    .line 80
    invoke-interface {p1, p0}, Lax/Sb/m;->a(Lax/wb/e;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v0, :cond_56

    .line 85
    .line 86
    goto :goto_61

    .line 87
    :cond_56
    :goto_56
    const/4 v4, 0x0

    .line 88
    iput-object v4, p0, Lax/n0/l$b;->f0:Ljava/lang/Object;

    .line 89
    .line 90
    iput v2, p0, Lax/n0/l$b;->g0:I

    .line 91
    .line 92
    invoke-interface {v1, p1, p0}, Lax/Fb/p;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v0, :cond_62

    .line 97
    .line 98
    :goto_61
    return-object v0

    .line 99
    :cond_62
    :goto_62
    iget-object p1, p0, Lax/n0/l$b;->h0:Lax/n0/l;

    .line 100
    .line 101
    invoke-static {p1}, Lax/n0/l;->c(Lax/n0/l;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_36

    .line 110
    .line 111
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_71
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "Check failed."

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public final u(Lax/Qb/J;Lax/wb/e;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Qb/J;",
            "Lax/wb/e<",
            "-",
            "Lax/sb/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/n0/l$b;->a(Ljava/lang/Object;Lax/wb/e;)Lax/wb/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/n0/l$b;

    .line 6
    .line 7
    sget-object p2, Lax/sb/t;->a:Lax/sb/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lax/n0/l$b;->p(Ljava/lang/Object;)Ljava/lang/Object;

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
