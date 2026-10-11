.class final Lax/c0/k0$a;
.super Lax/yb/k;
.source "SourceFile"

# interfaces
.implements Lax/Fb/p;


# annotations
.annotation runtime Lax/yb/f;
    c = "androidx.core.view.ViewKt$allViews$1"
    f = "View.kt"
    l = {
        0x199,
        0x19b
    }
    m = "invokeSuspend"
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/c0/k0;->a(Landroid/view/View;)Lax/Nb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/yb/k;",
        "Lax/Fb/p<",
        "Lax/Nb/g<",
        "-",
        "Landroid/view/View;",
        ">;",
        "Lax/wb/e<",
        "-",
        "Lax/sb/t;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field d0:I

.field private synthetic e0:Ljava/lang/Object;

.field final synthetic f0:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;Lax/wb/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lax/wb/e<",
            "-",
            "Lax/c0/k0$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/c0/k0$a;->f0:Landroid/view/View;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lax/yb/k;-><init>(ILax/wb/e;)V

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
    new-instance v0, Lax/c0/k0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/c0/k0$a;->f0:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lax/c0/k0$a;-><init>(Landroid/view/View;Lax/wb/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lax/c0/k0$a;->e0:Ljava/lang/Object;

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
    check-cast p1, Lax/Nb/g;

    .line 2
    .line 3
    check-cast p2, Lax/wb/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/c0/k0$a;->t(Lax/Nb/g;Lax/wb/e;)Ljava/lang/Object;

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
    .registers 6

    .line 1
    invoke-static {}, Lax/xb/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lax/c0/k0$a;->d0:I

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
    goto :goto_4f

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
    iget-object v1, p0, Lax/c0/k0$a;->e0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lax/Nb/g;

    .line 30
    .line 31
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_37

    .line 35
    :cond_22
    invoke-static {p1}, Lax/sb/o;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/c0/k0$a;->e0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    check-cast v1, Lax/Nb/g;

    .line 42
    .line 43
    iget-object p1, p0, Lax/c0/k0$a;->f0:Landroid/view/View;

    .line 44
    .line 45
    iput-object v1, p0, Lax/c0/k0$a;->e0:Ljava/lang/Object;

    .line 46
    .line 47
    iput v3, p0, Lax/c0/k0$a;->d0:I

    .line 48
    .line 49
    invoke-virtual {v1, p1, p0}, Lax/Nb/g;->c(Ljava/lang/Object;Lax/wb/e;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_37

    .line 54
    .line 55
    goto :goto_4e

    .line 56
    :cond_37
    :goto_37
    iget-object p1, p0, Lax/c0/k0$a;->f0:Landroid/view/View;

    .line 57
    .line 58
    instance-of v3, p1, Landroid/view/ViewGroup;

    .line 59
    .line 60
    if-eqz v3, :cond_4f

    .line 61
    .line 62
    check-cast p1, Landroid/view/ViewGroup;

    .line 63
    .line 64
    invoke-static {p1}, Lax/c0/j0;->b(Landroid/view/ViewGroup;)Lax/Nb/e;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/4 v3, 0x0

    .line 69
    iput-object v3, p0, Lax/c0/k0$a;->e0:Ljava/lang/Object;

    .line 70
    .line 71
    iput v2, p0, Lax/c0/k0$a;->d0:I

    .line 72
    .line 73
    invoke-virtual {v1, p1, p0}, Lax/Nb/g;->e(Lax/Nb/e;Lax/wb/e;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_4f

    .line 78
    .line 79
    :goto_4e
    return-object v0

    .line 80
    :cond_4f
    :goto_4f
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;

    .line 81
    .line 82
    return-object p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
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

.method public final t(Lax/Nb/g;Lax/wb/e;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Nb/g<",
            "-",
            "Landroid/view/View;",
            ">;",
            "Lax/wb/e<",
            "-",
            "Lax/sb/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/c0/k0$a;->a(Ljava/lang/Object;Lax/wb/e;)Lax/wb/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lax/c0/k0$a;

    .line 6
    .line 7
    sget-object p2, Lax/sb/t;->a:Lax/sb/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lax/c0/k0$a;->p(Ljava/lang/Object;)Ljava/lang/Object;

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
