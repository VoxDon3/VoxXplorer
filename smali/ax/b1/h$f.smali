.class Lax/b1/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b1/w$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/b1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final b:Lax/b1/u$a;

.field private c:Lax/b1/n;

.field private d:Z

.field final synthetic e:Lax/b1/h;


# direct methods
.method public constructor <init>(Lax/b1/h;Lax/b1/u$a;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/b1/h$f;->b:Lax/b1/u$a;

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

.method public static synthetic a(Lax/b1/h$f;Lax/P0/v;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/b1/h;->r(Lax/b1/h;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2b

    .line 8
    .line 9
    iget-boolean v0, p0, Lax/b1/h$f;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_2b

    .line 14
    :cond_d
    iget-object v0, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 15
    .line 16
    invoke-static {v0}, Lax/b1/h;->l(Lax/b1/h;)Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/os/Looper;

    .line 25
    .line 26
    iget-object v2, p0, Lax/b1/h$f;->b:Lax/b1/u$a;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v0, v1, v2, p1, v3}, Lax/b1/h;->m(Lax/b1/h;Landroid/os/Looper;Lax/b1/u$a;Lax/P0/v;Z)Lax/b1/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lax/b1/h$f;->c:Lax/b1/n;

    .line 34
    .line 35
    iget-object p1, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 36
    .line 37
    invoke-static {p1}, Lax/b1/h;->j(Lax/b1/h;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_2b
    :goto_2b
    return-void
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

.method public static synthetic b(Lax/b1/h$f;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/b1/h$f;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Lax/b1/h$f;->c:Lax/b1/n;

    .line 7
    .line 8
    if-eqz v0, :cond_e

    .line 9
    .line 10
    iget-object v1, p0, Lax/b1/h$f;->b:Lax/b1/u$a;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lax/b1/n;->a(Lax/b1/u$a;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 16
    .line 17
    invoke-static {v0}, Lax/b1/h;->j(Lax/b1/h;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lax/b1/h$f;->d:Z

    .line 26
    .line 27
    return-void
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


# virtual methods
.method public c(Lax/P0/v;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/b1/h;->q(Lax/b1/h;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v1, Lax/b1/j;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lax/b1/j;-><init>(Lax/b1/h$f;Lax/P0/v;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method public d()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/b1/h$f;->e:Lax/b1/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/b1/h;->q(Lax/b1/h;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v1, Lax/b1/i;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lax/b1/i;-><init>(Lax/b1/h$f;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lax/S0/d0;->j1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
