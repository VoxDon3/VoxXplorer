.class Lax/d3/u0$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/u0;->j1(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/u0;


# direct methods
.method constructor <init>(Lax/d3/u0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 6
    .line 7
    invoke-virtual {p2}, Lax/d3/n;->A3()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lax/Z2/j;->l0(Lax/c3/K;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_36

    .line 16
    .line 17
    iget-object p1, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_36

    .line 24
    .line 25
    iget-object p1, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 26
    .line 27
    invoke-virtual {p1}, Lax/d3/E;->h3()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/voxdon/xplorer/activity/b;

    .line 37
    .line 38
    iget-object p2, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 39
    .line 40
    invoke-virtual {p2}, Lax/d3/u0;->z3()Lax/Q2/f;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object v0, p0, Lax/d3/u0$a;->a:Lax/d3/u0;

    .line 45
    .line 46
    invoke-virtual {v0}, Lax/d3/E;->x3()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const-string v1, "usb_storage"

    .line 51
    .line 52
    invoke-virtual {p1, p2, v0, v1}, Lcom/voxdon/xplorer/activity/b;->a0(Lax/Q2/f;ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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
