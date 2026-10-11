.class Lax/W2/b$c;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/b;


# direct methods
.method public constructor <init>(Lax/W2/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$c;->w([Ljava/lang/Void;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$c;->x(Ljava/lang/Integer;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/b$c;->y(Ljava/lang/Integer;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Integer;
    .registers 6

    .line 1
    iget-object p1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->r()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lax/U2/d;->f()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 15
    .line 16
    invoke-static {v0}, Lax/W2/b;->w0(Lax/W2/b;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_7e

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lax/U2/f;

    .line 36
    .line 37
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2b

    .line 42
    .line 43
    goto :goto_7e

    .line 44
    :cond_2b
    iget-object v3, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 45
    .line 46
    invoke-static {v3, v1}, Lax/W2/b;->y0(Lax/W2/b;Lax/U2/f;)Lax/U2/f;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 50
    .line 51
    invoke-static {v1}, Lax/W2/b;->x0(Lax/W2/b;)Lax/U2/f;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lax/U2/f;->E()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_47

    .line 60
    .line 61
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 62
    .line 63
    invoke-static {v1}, Lax/W2/b;->x0(Lax/W2/b;)Lax/U2/f;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v1, p1, v3, p0}, Lax/W2/b;->z0(Lax/W2/b;Lax/U2/d;Lax/U2/f;Lax/u3/c;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_51

    .line 72
    :cond_47
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 73
    .line 74
    invoke-static {v1}, Lax/W2/b;->x0(Lax/W2/b;)Lax/U2/f;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v1, p1, v3, p0}, Lax/W2/b;->A0(Lax/W2/b;Lax/U2/d;Lax/U2/f;Lax/u3/c;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :goto_51
    if-eqz v1, :cond_5f

    .line 83
    .line 84
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 85
    .line 86
    invoke-virtual {v1}, Lax/W2/j;->w()Lax/W2/v;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v3, Lax/W2/v$b;->q:Lax/W2/v$b;

    .line 91
    .line 92
    invoke-virtual {v1, v3, v2}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_17

    .line 96
    :cond_5f
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 97
    .line 98
    invoke-virtual {v1}, Lax/W2/j;->w()Lax/W2/v;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v3, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 103
    .line 104
    invoke-virtual {v1, v3, v2}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 108
    .line 109
    invoke-virtual {v1}, Lax/W2/j;->w()Lax/W2/v;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v2, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 114
    .line 115
    invoke-static {v2}, Lax/W2/b;->x0(Lax/W2/b;)Lax/U2/f;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Lax/U2/f;->q()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_17

    .line 127
    :cond_7e
    :goto_7e
    iget-object p1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 128
    .line 129
    invoke-virtual {p1, v2}, Lax/W2/j;->l0(Z)V

    .line 130
    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method protected x(Ljava/lang/Integer;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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

.method protected y(Ljava/lang/Integer;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/b$c;->h:Lax/W2/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->o()V

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
