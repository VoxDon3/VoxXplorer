.class public Lax/d3/u0;
.super Lax/d3/E;
.source "SourceFile"


# instance fields
.field s2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/E;-><init>()V

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


# virtual methods
.method protected B7()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public H1()V
    .registers 2

    .line 1
    invoke-static {}, Lax/Q2/o;->i()Lax/Q2/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Q2/o;->n()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lax/d3/E;->H1()V

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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/E;->L1(Landroid/view/View;Landroid/os/Bundle;)V

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

.method public j1(Landroid/app/Activity;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/d3/E;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lax/d3/u0$a;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lax/d3/u0$a;-><init>(Lax/d3/u0;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/d3/u0;->s2:Landroid/content/BroadcastReceiver;

    .line 10
    .line 11
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "local.intent.action.LOCAL_STORAGE_STATUS_CHANGED"

    .line 16
    .line 17
    iget-object v1, p0, Lax/d3/u0;->s2:Landroid/content/BroadcastReceiver;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method protected l8(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    invoke-super {p0, p1}, Lax/d3/E;->l8(Lcom/voxdon/xplorer/file/n;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f0a02c8

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1}, Lax/x3/d;->t(IZ)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected m8(ZLjava/lang/Object;)V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    if-eqz p1, :cond_e

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/E;->h9()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    instance-of p1, p2, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_18

    .line 18
    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, p2, v0}, Lax/d3/n;->K4(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_33

    .line 25
    :cond_18
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p1, p2}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-array p2, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    aput-object p1, p2, v1

    .line 41
    .line 42
    const p1, 0x7f1302c5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1, v0}, Lax/d3/n;->K4(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    :goto_33
    const-string p1, "on_connect_result"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
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

.method public v1()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/d3/E;->v1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/u0;->s2:Landroid/content/BroadcastReceiver;

    .line 5
    .line 6
    if-eqz v0, :cond_13

    .line 7
    .line 8
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/d3/u0;->s2:Landroid/content/BroadcastReceiver;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lax/d3/u0;->s2:Landroid/content/BroadcastReceiver;

    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method public z3()Lax/Q2/f;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->b1:Lax/Q2/f;

    .line 2
    .line 3
    return-object v0
    .line 4
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
