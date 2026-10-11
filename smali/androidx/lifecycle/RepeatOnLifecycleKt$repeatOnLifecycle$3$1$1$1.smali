.class final Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field final synthetic c0:Lax/Gb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Gb/v<",
            "Lax/Qb/s0;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic d0:Lax/Qb/J;

.field final synthetic e0:Landroidx/lifecycle/d$a;

.field final synthetic f0:Lax/Qb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Qb/l<",
            "Lax/sb/t;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic g0:Lax/Zb/a;

.field final synthetic h0:Lax/Fb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
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
.end field

.field final synthetic q:Landroidx/lifecycle/d$a;


# virtual methods
.method public final b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 10

    .line 1
    const-string v0, "<anonymous parameter 0>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->q:Landroidx/lifecycle/d$a;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-ne p2, p1, :cond_27

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->c0:Lax/Gb/v;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->d0:Lax/Qb/J;

    .line 19
    .line 20
    new-instance v4, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;

    .line 21
    .line 22
    iget-object p2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->g0:Lax/Zb/a;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->h0:Lax/Fb/p;

    .line 25
    .line 26
    invoke-direct {v4, p2, v2, v0}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;-><init>(Lax/Zb/a;Lax/Fb/p;Lax/wb/e;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Lax/Qb/g;->d(Lax/Qb/J;Lax/wb/i;Lax/Qb/L;Lax/Fb/p;ILjava/lang/Object;)Lax/Qb/s0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p1, Lax/Gb/v;->q:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->e0:Landroidx/lifecycle/d$a;

    .line 41
    .line 42
    if-ne p2, p1, :cond_3b

    .line 43
    .line 44
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->c0:Lax/Gb/v;

    .line 45
    .line 46
    iget-object p1, p1, Lax/Gb/v;->q:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lax/Qb/s0;

    .line 49
    .line 50
    if-eqz p1, :cond_37

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-static {p1, v0, v1, v0}, Lax/Qb/s0$a;->a(Lax/Qb/s0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_37
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->c0:Lax/Gb/v;

    .line 57
    .line 58
    iput-object v0, p1, Lax/Gb/v;->q:Ljava/lang/Object;

    .line 59
    .line 60
    :cond_3b
    sget-object p1, Landroidx/lifecycle/d$a;->ON_DESTROY:Landroidx/lifecycle/d$a;

    .line 61
    .line 62
    if-ne p2, p1, :cond_4c

    .line 63
    .line 64
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->f0:Lax/Qb/l;

    .line 65
    .line 66
    sget-object p2, Lax/sb/n;->q:Lax/sb/n$a;

    .line 67
    .line 68
    sget-object p2, Lax/sb/t;->a:Lax/sb/t;

    .line 69
    .line 70
    invoke-static {p2}, Lax/sb/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p1, p2}, Lax/wb/e;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    return-void
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
