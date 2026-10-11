.class public final Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field final synthetic c0:Landroidx/lifecycle/d;

.field final synthetic d0:Lax/Qb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Qb/l<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic e0:Lax/Fb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Fb/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic q:Landroidx/lifecycle/d$b;


# virtual methods
.method public b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 4

    .line 1
    const-string v0, "source"

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
    sget-object p1, Landroidx/lifecycle/d$a;->Companion:Landroidx/lifecycle/d$a$a;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->q:Landroidx/lifecycle/d$b;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/lifecycle/d$a$a;->c(Landroidx/lifecycle/d$b;)Landroidx/lifecycle/d$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p2, p1, :cond_37

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->c0:Landroidx/lifecycle/d;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroidx/lifecycle/d;->c(Lax/G0/g;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->d0:Lax/Qb/l;

    .line 27
    .line 28
    iget-object p2, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->e0:Lax/Fb/a;

    .line 29
    .line 30
    :try_start_1d
    sget-object v0, Lax/sb/n;->q:Lax/sb/n$a;

    .line 31
    .line 32
    invoke-interface {p2}, Lax/Fb/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p2}, Lax/sb/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2
    :try_end_27
    .catchall {:try_start_1d .. :try_end_27} :catchall_28

    .line 40
    goto :goto_33

    .line 41
    :catchall_28
    move-exception p2

    .line 42
    sget-object v0, Lax/sb/n;->q:Lax/sb/n$a;

    .line 43
    .line 44
    invoke-static {p2}, Lax/sb/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, Lax/sb/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :goto_33
    invoke-interface {p1, p2}, Lax/wb/e;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_54

    .line 56
    :cond_37
    sget-object p1, Landroidx/lifecycle/d$a;->ON_DESTROY:Landroidx/lifecycle/d$a;

    .line 57
    .line 58
    if-ne p2, p1, :cond_54

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->c0:Landroidx/lifecycle/d;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Landroidx/lifecycle/d;->c(Lax/G0/g;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->d0:Lax/Qb/l;

    .line 66
    .line 67
    sget-object p2, Lax/sb/n;->q:Lax/sb/n$a;

    .line 68
    .line 69
    new-instance p2, Lax/G0/f;

    .line 70
    .line 71
    invoke-direct {p2}, Lax/G0/f;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {p2}, Lax/sb/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p2}, Lax/sb/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {p1, p2}, Lax/wb/e;->f(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_54
    :goto_54
    return-void
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
