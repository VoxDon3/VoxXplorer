.class final Lax/n0/m$g;
.super Lax/yb/l;
.source "SourceFile"

# interfaces
.implements Lax/Fb/p;


# annotations
.annotation runtime Lax/yb/f;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x75
    }
    m = "invokeSuspend"
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/n0/m;-><init>(Lax/Fb/a;Lax/n0/k;Ljava/util/List;Lax/n0/b;Lax/Qb/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/yb/l;",
        "Lax/Fb/p<",
        "Lax/Tb/c<",
        "-TT;>;",
        "Lax/wb/e<",
        "-",
        "Lax/sb/t;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field f0:I

.field private synthetic g0:Ljava/lang/Object;

.field final synthetic h0:Lax/n0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/n0/m<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/n0/m;Lax/wb/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/n0/m<",
            "TT;>;",
            "Lax/wb/e<",
            "-",
            "Lax/n0/m$g;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/n0/m$g;->h0:Lax/n0/m;

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
    .registers 5
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
    new-instance v0, Lax/n0/m$g;

    .line 2
    .line 3
    iget-object v1, p0, Lax/n0/m$g;->h0:Lax/n0/m;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lax/n0/m$g;-><init>(Lax/n0/m;Lax/wb/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lax/n0/m$g;->g0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    check-cast p1, Lax/Tb/c;

    .line 2
    .line 3
    check-cast p2, Lax/wb/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/n0/m$g;->u(Lax/Tb/c;Lax/wb/e;)Ljava/lang/Object;

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
    .registers 8

    .line 1
    invoke-static {}, Lax/xb/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lax/n0/m$g;->f0:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_17

    .line 9
    .line 10
    if-ne v1, v2, :cond_f

    .line 11
    .line 12
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_5a

    .line 16
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_17
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/n0/m$g;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lax/Tb/c;

    .line 30
    .line 31
    iget-object v1, p0, Lax/n0/m$g;->h0:Lax/n0/m;

    .line 32
    .line 33
    invoke-static {v1}, Lax/n0/m;->f(Lax/n0/m;)Lax/Tb/k;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Lax/Tb/k;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lax/n0/n;

    .line 42
    .line 43
    instance-of v3, v1, Lax/n0/c;

    .line 44
    .line 45
    if-nez v3, :cond_3c

    .line 46
    .line 47
    iget-object v3, p0, Lax/n0/m$g;->h0:Lax/n0/m;

    .line 48
    .line 49
    invoke-static {v3}, Lax/n0/m;->e(Lax/n0/m;)Lax/n0/l;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, Lax/n0/m$b$a;

    .line 54
    .line 55
    invoke-direct {v4, v1}, Lax/n0/m$b$a;-><init>(Lax/n0/n;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Lax/n0/l;->e(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    iget-object v3, p0, Lax/n0/m$g;->h0:Lax/n0/m;

    .line 62
    .line 63
    invoke-static {v3}, Lax/n0/m;->f(Lax/n0/m;)Lax/Tb/k;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v4, Lax/n0/m$g$a;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, v1, v5}, Lax/n0/m$g$a;-><init>(Lax/n0/n;Lax/wb/e;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v4}, Lax/Tb/d;->c(Lax/Tb/b;Lax/Fb/p;)Lax/Tb/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v3, Lax/n0/m$g$b;

    .line 78
    .line 79
    invoke-direct {v3, v1}, Lax/n0/m$g$b;-><init>(Lax/Tb/b;)V

    .line 80
    .line 81
    .line 82
    iput v2, p0, Lax/n0/m$g;->f0:I

    .line 83
    .line 84
    invoke-static {p1, v3, p0}, Lax/Tb/d;->d(Lax/Tb/c;Lax/Tb/b;Lax/wb/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_5a

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_5a
    :goto_5a
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 92
    .line 93
    return-object p1
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
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

.method public final u(Lax/Tb/c;Lax/wb/e;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Tb/c<",
            "-TT;>;",
            "Lax/wb/e<",
            "-",
            "Lax/sb/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/n0/m$g;->a(Ljava/lang/Object;Lax/wb/e;)Lax/wb/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/n0/m$g;

    .line 6
    .line 7
    sget-object p2, Lax/sb/t;->a:Lax/sb/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lax/n0/m$g;->p(Ljava/lang/Object;)Ljava/lang/Object;

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
