.class Lax/W2/f$c;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/f;
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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/f;


# direct methods
.method public constructor <init>(Lax/W2/f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

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
    invoke-virtual {p0, p1}, Lax/W2/f$c;->w([Ljava/lang/Void;)Ljava/lang/Void;

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
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/f$c;->x(Ljava/lang/Void;)V

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
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/f$c;->y(Ljava/lang/Void;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 8

    .line 1
    iget-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 2
    .line 3
    new-instance v0, Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lax/W2/f;->K0(Lax/W2/f;Ljava/util/LinkedList;)Ljava/util/LinkedList;

    .line 9
    .line 10
    .line 11
    :try_start_a
    iget-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 12
    .line 13
    invoke-static {p1}, Lax/W2/f;->A0(Lax/W2/f;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_5c

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/W2/g;

    .line 32
    .line 33
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_56

    .line 38
    .line 39
    iget-object v1, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 40
    .line 41
    invoke-static {v1}, Lax/W2/f;->J0(Lax/W2/f;)Ljava/util/LinkedList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lax/W2/g;->i()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    const-wide/16 v2, -0x1

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    cmp-long v5, v0, v2

    .line 56
    .line 57
    if-nez v5, :cond_43

    .line 58
    .line 59
    iget-object v2, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 60
    .line 61
    invoke-virtual {v2}, Lax/W2/j;->w()Lax/W2/v;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2, v4}, Lax/W2/v;->a0(Z)V

    .line 66
    .line 67
    .line 68
    :cond_43
    iget-object v2, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 69
    .line 70
    invoke-virtual {v2}, Lax/W2/j;->w()Lax/W2/v;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2, v0, v1}, Lax/W2/v;->h(J)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 78
    .line 79
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, v4}, Lax/W2/v;->g(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_14

    .line 87
    :cond_56
    new-instance p1, Lax/b3/a;

    .line 88
    .line 89
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1
    :try_end_5c
    .catch Lax/b3/a; {:try_start_a .. :try_end_5c} :catch_5c

    .line 93
    :catch_5c
    :cond_5c
    const/4 p1, 0x0

    .line 94
    return-object p1
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

.method protected x(Ljava/lang/Void;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

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

.method protected y(Ljava/lang/Void;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/W2/f$c;->h:Lax/W2/f;

    .line 7
    .line 8
    invoke-static {p1}, Lax/W2/f;->M0(Lax/W2/f;)V

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
.end method
