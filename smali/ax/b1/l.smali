.class public final Lax/b1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b1/z;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lax/P0/y$f;

.field private c:Lax/b1/w;

.field private d:Lax/U0/g$a;

.field private e:Ljava/lang/String;

.field private f:Lax/m1/m;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/b1/l;->a:Ljava/lang/Object;

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

.method private b(Lax/P0/y$f;)Lax/b1/w;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/b1/l;->d:Lax/U0/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_10

    .line 6
    :cond_5
    new-instance v0, Lax/U0/n$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lax/U0/n$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/b1/l;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/U0/n$b;->c(Ljava/lang/String;)Lax/U0/n$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_10
    new-instance v1, Lax/b1/P;

    .line 18
    .line 19
    iget-object v2, p1, Lax/P0/y$f;->c:Landroid/net/Uri;

    .line 20
    .line 21
    if-nez v2, :cond_18

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_1c

    .line 25
    :cond_18
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_1c
    iget-boolean v3, p1, Lax/P0/y$f;->h:Z

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lax/b1/P;-><init>(Ljava/lang/String;ZLax/U0/g$a;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, Lax/P0/y$f;->e:Lax/r7/A;

    .line 35
    .line 36
    invoke-virtual {v0}, Lax/r7/A;->g()Lax/r7/C;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lax/r7/C;->n()Lax/r7/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_47

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, Lax/b1/P;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2b

    .line 72
    :cond_47
    new-instance v0, Lax/b1/h$b;

    .line 73
    .line 74
    invoke-direct {v0}, Lax/b1/h$b;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, p1, Lax/P0/y$f;->a:Ljava/util/UUID;

    .line 78
    .line 79
    sget-object v3, Lax/b1/O;->d:Lax/b1/E$c;

    .line 80
    .line 81
    invoke-virtual {v0, v2, v3}, Lax/b1/h$b;->f(Ljava/util/UUID;Lax/b1/E$c;)Lax/b1/h$b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v2, p1, Lax/P0/y$f;->f:Z

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lax/b1/h$b;->c(Z)Lax/b1/h$b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v2, p1, Lax/P0/y$f;->g:Z

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lax/b1/h$b;->d(Z)Lax/b1/h$b;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v2, p1, Lax/P0/y$f;->j:Lax/r7/z;

    .line 98
    .line 99
    invoke-static {v2}, Lax/u7/f;->o(Ljava/util/Collection;)[I

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Lax/b1/h$b;->e([I)Lax/b1/h$b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v2, p0, Lax/b1/l;->f:Lax/m1/m;

    .line 108
    .line 109
    if-eqz v2, :cond_71

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Lax/b1/h$b;->b(Lax/m1/m;)Lax/b1/h$b;

    .line 112
    .line 113
    .line 114
    :cond_71
    invoke-virtual {v0, v1}, Lax/b1/h$b;->a(Lax/b1/S;)Lax/b1/h;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-virtual {p1}, Lax/P0/y$f;->c()[B

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v0, v1, p1}, Lax/b1/h;->G(I[B)V

    .line 124
    .line 125
    .line 126
    return-object v0
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


# virtual methods
.method public a(Lax/P0/y;)Lax/b1/w;
    .registers 4

    .line 1
    iget-object v0, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 7
    .line 8
    iget-object p1, p1, Lax/P0/y$h;->c:Lax/P0/y$f;

    .line 9
    .line 10
    if-nez p1, :cond_e

    .line 11
    .line 12
    sget-object p1, Lax/b1/w;->a:Lax/b1/w;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_e
    iget-object v0, p0, Lax/b1/l;->a:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_11
    iget-object v1, p0, Lax/b1/l;->b:Lax/P0/y$f;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_24

    .line 25
    .line 26
    iput-object p1, p0, Lax/b1/l;->b:Lax/P0/y$f;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lax/b1/l;->b(Lax/P0/y$f;)Lax/b1/w;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lax/b1/l;->c:Lax/b1/w;

    .line 33
    .line 34
    goto :goto_24

    .line 35
    :catchall_22
    move-exception p1

    .line 36
    goto :goto_2e

    .line 37
    :cond_24
    :goto_24
    iget-object p1, p0, Lax/b1/l;->c:Lax/b1/w;

    .line 38
    .line 39
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lax/b1/w;

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-object p1

    .line 47
    :goto_2e
    monitor-exit v0
    :try_end_2f
    .catchall {:try_start_11 .. :try_end_2f} :catchall_22

    .line 48
    throw p1
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
