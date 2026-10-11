.class Landroidx/recyclerview/widget/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/w$a;,
        Landroidx/recyclerview/widget/w$b;
    }
.end annotation


# instance fields
.field final a:Lax/B/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/k<",
            "Landroidx/recyclerview/widget/RecyclerView$F;",
            "Landroidx/recyclerview/widget/w$a;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lax/B/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/h<",
            "Landroidx/recyclerview/widget/RecyclerView$F;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/B/k;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/B/k;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 10
    .line 11
    new-instance v0, Lax/B/h;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/B/h;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method private l(Landroidx/recyclerview/widget/RecyclerView$F;I)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->d(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-gez p1, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lax/B/k;->k(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/recyclerview/widget/w$a;

    .line 18
    .line 19
    if-eqz v1, :cond_3f

    .line 20
    .line 21
    iget v2, v1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 22
    .line 23
    and-int v3, v2, p2

    .line 24
    .line 25
    if-eqz v3, :cond_3f

    .line 26
    .line 27
    not-int v0, p2

    .line 28
    and-int/2addr v0, v2

    .line 29
    iput v0, v1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    if-ne p2, v2, :cond_24

    .line 33
    .line 34
    iget-object p2, v1, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 35
    .line 36
    goto :goto_2a

    .line 37
    :cond_24
    const/16 v2, 0x8

    .line 38
    .line 39
    if-ne p2, v2, :cond_37

    .line 40
    .line 41
    iget-object p2, v1, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 42
    .line 43
    :goto_2a
    and-int/lit8 v0, v0, 0xc

    .line 44
    .line 45
    if-nez v0, :cond_36

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lax/B/k;->i(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Landroidx/recyclerview/widget/w$a;->c(Landroidx/recyclerview/widget/w$a;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-object p2

    .line 56
    :cond_37
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string p2, "Must provide flag PRE or POST"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_3f
    return-object v0
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


# virtual methods
.method a(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-static {}, Landroidx/recyclerview/widget/w$a;->b()Landroidx/recyclerview/widget/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_13
    iget p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 21
    .line 22
    or-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    iput p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 25
    .line 26
    iput-object p2, v0, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 27
    .line 28
    return-void
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

.method b(Landroidx/recyclerview/widget/RecyclerView$F;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-static {}, Landroidx/recyclerview/widget/w$a;->b()Landroidx/recyclerview/widget/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_13
    iget p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 21
    .line 22
    or-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    iput p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 25
    .line 26
    return-void
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

.method c(JLandroidx/recyclerview/widget/RecyclerView$F;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lax/B/h;->k(JLjava/lang/Object;)V

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

.method d(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-static {}, Landroidx/recyclerview/widget/w$a;->b()Landroidx/recyclerview/widget/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_13
    iput-object p2, v0, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 21
    .line 22
    iget p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x8

    .line 25
    .line 26
    iput p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 27
    .line 28
    return-void
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

.method e(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-nez v0, :cond_13

    .line 10
    .line 11
    invoke-static {}, Landroidx/recyclerview/widget/w$a;->b()Landroidx/recyclerview/widget/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_13
    iput-object p2, v0, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 21
    .line 22
    iget p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x4

    .line 25
    .line 26
    iput p1, v0, Landroidx/recyclerview/widget/w$a;->a:I

    .line 27
    .line 28
    return-void
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

.method f()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/B/k;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/B/h;->c()V

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
.end method

.method g(J)Landroidx/recyclerview/widget/RecyclerView$F;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/B/h;->f(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$F;

    .line 8
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
.end method

.method h(Landroidx/recyclerview/widget/RecyclerView$F;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-eqz p1, :cond_11

    .line 10
    .line 11
    iget p1, p1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    and-int/2addr p1, v0

    .line 15
    if-eqz p1, :cond_11

    .line 16
    .line 17
    return v0

    .line 18
    :cond_11
    const/4 p1, 0x0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method

.method i(Landroidx/recyclerview/widget/RecyclerView$F;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-eqz p1, :cond_12

    .line 10
    .line 11
    iget p1, p1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 12
    .line 13
    and-int/lit8 p1, p1, 0x4

    .line 14
    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method j()V
    .registers 1

    .line 1
    invoke-static {}, Landroidx/recyclerview/widget/w$a;->a()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$F;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/w;->p(Landroidx/recyclerview/widget/RecyclerView$F;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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

.method m(Landroidx/recyclerview/widget/RecyclerView$F;)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .registers 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/w;->l(Landroidx/recyclerview/widget/RecyclerView$F;I)Landroidx/recyclerview/widget/RecyclerView$m$c;

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

.method n(Landroidx/recyclerview/widget/RecyclerView$F;)Landroidx/recyclerview/widget/RecyclerView$m$c;
    .registers 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/w;->l(Landroidx/recyclerview/widget/RecyclerView$F;I)Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
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

.method o(Landroidx/recyclerview/widget/w$b;)V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/B/k;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_8
    if-ltz v0, :cond_6f

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lax/B/k;->f(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$F;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lax/B/k;->i(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/recyclerview/widget/w$a;

    .line 26
    .line 27
    iget v3, v2, Landroidx/recyclerview/widget/w$a;->a:I

    .line 28
    .line 29
    and-int/lit8 v4, v3, 0x3

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    if-ne v4, v5, :cond_25

    .line 33
    .line 34
    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/w$b;->a(Landroidx/recyclerview/widget/RecyclerView$F;)V

    .line 35
    .line 36
    .line 37
    goto :goto_69

    .line 38
    :cond_25
    and-int/lit8 v4, v3, 0x1

    .line 39
    .line 40
    if-eqz v4, :cond_37

    .line 41
    .line 42
    iget-object v3, v2, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 43
    .line 44
    if-nez v3, :cond_31

    .line 45
    .line 46
    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/w$b;->a(Landroidx/recyclerview/widget/RecyclerView$F;)V

    .line 47
    .line 48
    .line 49
    goto :goto_69

    .line 50
    :cond_31
    iget-object v4, v2, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 51
    .line 52
    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/w$b;->c(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 53
    .line 54
    .line 55
    goto :goto_69

    .line 56
    :cond_37
    and-int/lit8 v4, v3, 0xe

    .line 57
    .line 58
    const/16 v5, 0xe

    .line 59
    .line 60
    if-ne v4, v5, :cond_45

    .line 61
    .line 62
    iget-object v3, v2, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 63
    .line 64
    iget-object v4, v2, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 65
    .line 66
    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/w$b;->b(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 67
    .line 68
    .line 69
    goto :goto_69

    .line 70
    :cond_45
    and-int/lit8 v4, v3, 0xc

    .line 71
    .line 72
    const/16 v5, 0xc

    .line 73
    .line 74
    if-ne v4, v5, :cond_53

    .line 75
    .line 76
    iget-object v3, v2, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 77
    .line 78
    iget-object v4, v2, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 79
    .line 80
    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/w$b;->d(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 81
    .line 82
    .line 83
    goto :goto_69

    .line 84
    :cond_53
    and-int/lit8 v4, v3, 0x4

    .line 85
    .line 86
    if-eqz v4, :cond_5e

    .line 87
    .line 88
    iget-object v3, v2, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/w$b;->c(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 92
    .line 93
    .line 94
    goto :goto_69

    .line 95
    :cond_5e
    and-int/lit8 v3, v3, 0x8

    .line 96
    .line 97
    if-eqz v3, :cond_69

    .line 98
    .line 99
    iget-object v3, v2, Landroidx/recyclerview/widget/w$a;->b:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 100
    .line 101
    iget-object v4, v2, Landroidx/recyclerview/widget/w$a;->c:Landroidx/recyclerview/widget/RecyclerView$m$c;

    .line 102
    .line 103
    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/w$b;->b(Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$m$c;Landroidx/recyclerview/widget/RecyclerView$m$c;)V

    .line 104
    .line 105
    .line 106
    :cond_69
    :goto_69
    invoke-static {v2}, Landroidx/recyclerview/widget/w$a;->c(Landroidx/recyclerview/widget/w$a;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v0, v0, -0x1

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_6f
    return-void
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

.method p(Landroidx/recyclerview/widget/RecyclerView$F;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/B/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/recyclerview/widget/w$a;

    .line 8
    .line 9
    if-nez p1, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget v0, p1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 13
    .line 14
    and-int/lit8 v0, v0, -0x2

    .line 15
    .line 16
    iput v0, p1, Landroidx/recyclerview/widget/w$a;->a:I

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method q(Landroidx/recyclerview/widget/RecyclerView$F;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/B/h;->n()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_8
    if-ltz v0, :cond_1b

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lax/B/h;->o(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-ne p1, v1, :cond_18

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/w;->b:Lax/B/h;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lax/B/h;->m(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_1b

    .line 25
    :cond_18
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    goto :goto_8

    .line 28
    :cond_1b
    :goto_1b
    iget-object v0, p0, Landroidx/recyclerview/widget/w;->a:Lax/B/k;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lax/B/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroidx/recyclerview/widget/w$a;

    .line 35
    .line 36
    if-eqz p1, :cond_28

    .line 37
    .line 38
    invoke-static {p1}, Landroidx/recyclerview/widget/w$a;->c(Landroidx/recyclerview/widget/w$a;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    return-void
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
