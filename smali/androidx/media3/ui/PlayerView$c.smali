.class final Landroidx/media3/ui/PlayerView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/H$d;
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/media3/ui/d$m;
.implements Landroidx/media3/ui/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Lax/P0/N$b;

.field private b:Ljava/lang/Object;

.field final synthetic c:Landroidx/media3/ui/PlayerView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lax/P0/N$b;

    .line 7
    .line 8
    invoke-direct {p1}, Lax/P0/N$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/ui/PlayerView$c;->a:Lax/P0/N$b;

    .line 12
    .line 13
    return-void
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
.method public synthetic D(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->r(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic E(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->k(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic F(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->v(Lax/P0/H$d;I)V

    return-void
.end method

.method public G(Z)V
    .registers 2

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->p(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$e;

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

.method public H(Lax/P0/V;)V
    .registers 6

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->n(Landroidx/media3/ui/PlayerView;)Lax/P0/H;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lax/P0/H;

    .line 12
    .line 13
    const/16 v0, 0x11

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lax/P0/H;->c0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_19

    .line 20
    .line 21
    invoke-interface {p1}, Lax/P0/H;->h0()Lax/P0/N;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    sget-object v0, Lax/P0/N;->a:Lax/P0/N;

    .line 27
    .line 28
    :goto_1b
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_25

    .line 34
    .line 35
    iput-object v2, p0, Landroidx/media3/ui/PlayerView$c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_63

    .line 38
    :cond_25
    const/16 v1, 0x1e

    .line 39
    .line 40
    invoke-interface {p1, v1}, Lax/P0/H;->c0(I)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_47

    .line 45
    .line 46
    invoke-interface {p1}, Lax/P0/H;->X()Lax/P0/V;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lax/P0/V;->b()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_47

    .line 55
    .line 56
    invoke-interface {p1}, Lax/P0/H;->D()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object v1, p0, Landroidx/media3/ui/PlayerView$c;->a:Lax/P0/N$b;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-virtual {v0, p1, v1, v2}, Lax/P0/N;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, p0, Landroidx/media3/ui/PlayerView$c;->b:Ljava/lang/Object;

    .line 70
    .line 71
    goto :goto_63

    .line 72
    :cond_47
    iget-object v1, p0, Landroidx/media3/ui/PlayerView$c;->b:Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v1, :cond_63

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v3, -0x1

    .line 81
    if-eq v1, v3, :cond_61

    .line 82
    .line 83
    iget-object v3, p0, Landroidx/media3/ui/PlayerView$c;->a:Lax/P0/N$b;

    .line 84
    .line 85
    invoke-virtual {v0, v1, v3}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v0, v0, Lax/P0/N$b;->c:I

    .line 90
    .line 91
    invoke-interface {p1}, Lax/P0/H;->b0()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-ne p1, v0, :cond_61

    .line 96
    .line 97
    return-void

    .line 98
    :cond_61
    iput-object v2, p0, Landroidx/media3/ui/PlayerView$c;->b:Ljava/lang/Object;

    .line 99
    .line 100
    :cond_63
    :goto_63
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-static {p1, v0}, Landroidx/media3/ui/PlayerView;->f(Landroidx/media3/ui/PlayerView;Z)V

    .line 104
    .line 105
    .line 106
    return-void
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

.method public synthetic I(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->i(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic J(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->t(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public K(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->m(Landroidx/media3/ui/PlayerView;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->o(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_16

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 15
    .line 16
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->o(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1}, Landroidx/media3/ui/PlayerView$d;->a(I)V

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
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
.end method

.method public synthetic L(F)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->G(Lax/P0/H$d;F)V

    return-void
.end method

.method public synthetic N(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->s(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public O(I)V
    .registers 2

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->g(Landroidx/media3/ui/PlayerView;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->h(Landroidx/media3/ui/PlayerView;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->i(Landroidx/media3/ui/PlayerView;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public synthetic P(Lax/P0/N;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->C(Lax/P0/H$d;Lax/P0/N;I)V

    return-void
.end method

.method public synthetic S(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->z(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic U(Lax/P0/T;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->D(Lax/P0/H$d;Lax/P0/T;)V

    return-void
.end method

.method public synthetic W(Lax/P0/H$b;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->c(Lax/P0/H$d;Lax/P0/H$b;)V

    return-void
.end method

.method public synthetic Y(IZ)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->g(Lax/P0/H$d;IZ)V

    return-void
.end method

.method public synthetic Z(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->u(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public a(Lax/P0/a0;)V
    .registers 3

    .line 1
    sget-object v0, Lax/P0/a0;->e:Lax/P0/a0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/P0/a0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_23

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->n(Landroidx/media3/ui/PlayerView;)Lax/P0/H;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_23

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 18
    .line 19
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->n(Landroidx/media3/ui/PlayerView;)Lax/P0/H;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Lax/P0/H;->i()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 v0, 0x1

    .line 28
    if-ne p1, v0, :cond_1e

    .line 29
    .line 30
    goto :goto_23

    .line 31
    :cond_1e
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 32
    .line 33
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->q(Landroidx/media3/ui/PlayerView;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    :goto_23
    return-void
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

.method public synthetic a0(Lax/P0/y;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->l(Lax/P0/H$d;Lax/P0/y;I)V

    return-void
.end method

.method public b0()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->v(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_25

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->v(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 20
    .line 21
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->w(Landroidx/media3/ui/PlayerView;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_20

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->d(Landroidx/media3/ui/PlayerView;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 34
    .line 35
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->e(Landroidx/media3/ui/PlayerView;)V

    .line 36
    .line 37
    .line 38
    :cond_25
    return-void
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
.end method

.method public synthetic c(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->b(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic c0(Lax/P0/H;Lax/P0/H$c;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->h(Lax/P0/H$d;Lax/P0/H;Lax/P0/H$c;)V

    return-void
.end method

.method public synthetic e(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->A(Lax/P0/H$d;Z)V

    return-void
.end method

.method public i0(ZI)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->g(Landroidx/media3/ui/PlayerView;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->i(Landroidx/media3/ui/PlayerView;)V

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
.end method

.method public synthetic j(Lax/P0/G;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->p(Lax/P0/H$d;Lax/P0/G;)V

    return-void
.end method

.method public synthetic j0(Lax/P0/A;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->m(Lax/P0/H$d;Lax/P0/A;)V

    return-void
.end method

.method public synthetic k0(Lax/P0/n;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->f(Lax/P0/H$d;Lax/P0/n;)V

    return-void
.end method

.method public o0(II)V
    .registers 6

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x22

    .line 4
    .line 5
    if-ne p1, p2, :cond_3c

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->r(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p1, p1, Landroid/view/SurfaceView;

    .line 14
    .line 15
    if-eqz p1, :cond_3c

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 18
    .line 19
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->s(Landroidx/media3/ui/PlayerView;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_3c

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 26
    .line 27
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->u(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroidx/media3/ui/PlayerView$f;

    .line 36
    .line 37
    iget-object p2, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 38
    .line 39
    invoke-static {p2}, Landroidx/media3/ui/PlayerView;->t(Landroidx/media3/ui/PlayerView;)Landroid/os/Handler;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 44
    .line 45
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->r(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/view/SurfaceView;

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 52
    .line 53
    new-instance v2, Lax/a2/n;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Lax/a2/n;-><init>(Landroidx/media3/ui/PlayerView;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, v0, v2}, Landroidx/media3/ui/PlayerView$f;->d(Landroid/os/Handler;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    return-void
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
.end method

.method public onClick(Landroid/view/View;)V
    .registers 2

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->l(Landroidx/media3/ui/PlayerView;)V

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

.method public p0(Lax/P0/H$e;Lax/P0/H$e;I)V
    .registers 4

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->j(Landroidx/media3/ui/PlayerView;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_15

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->k(Landroidx/media3/ui/PlayerView;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_15

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->G()V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
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

.method public synthetic r(Lax/P0/C;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->n(Lax/P0/H$d;Lax/P0/C;)V

    return-void
.end method

.method public synthetic r0(Lax/P0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->a(Lax/P0/H$d;Lax/P0/c;)V

    return-void
.end method

.method public s(Lax/R0/c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->c(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/SubtitleView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$c;->c:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->c(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/SubtitleView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p1, p1, Lax/R0/c;->a:Lax/r7/z;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method

.method public synthetic t(Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->e(Lax/P0/H$d;Ljava/util/List;)V

    return-void
.end method

.method public synthetic t0(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->j(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic v(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->y(Lax/P0/H$d;I)V

    return-void
.end method
