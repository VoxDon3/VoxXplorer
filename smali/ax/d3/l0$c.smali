.class Lax/d3/l0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/l0;->y5()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/d3/l0;


# direct methods
.method constructor <init>(Lax/d3/l0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/service/FtpServerService$c;

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/voxdon/xplorer/service/FtpServerService$c;->a()Lcom/voxdon/xplorer/service/FtpServerService;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p1, p2}, Lax/d3/l0;->g5(Lax/d3/l0;Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 13
    .line 14
    invoke-static {p1}, Lax/d3/l0;->f5(Lax/d3/l0;)Lcom/voxdon/xplorer/service/FtpServerService;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 19
    .line 20
    invoke-static {p2}, Lax/d3/l0;->h5(Lax/d3/l0;)Landroid/widget/CheckBox;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/service/FtpServerService;->C(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 32
    .line 33
    invoke-static {p1}, Lax/d3/l0;->f5(Lax/d3/l0;)Lcom/voxdon/xplorer/service/FtpServerService;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, Lax/d3/l0$c$a;

    .line 38
    .line 39
    invoke-direct {p2, p0}, Lax/d3/l0$c$a;-><init>(Lax/d3/l0$c;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/service/FtpServerService;->B(Lcom/voxdon/xplorer/service/FtpServerService$e;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-static {p1, p2}, Lax/d3/l0;->i5(Lax/d3/l0;Z)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 52
    .line 53
    invoke-static {p1}, Lax/d3/l0;->a5(Lax/d3/l0;)V

    .line 54
    .line 55
    .line 56
    return-void
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

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/l0;->b5(Lax/d3/l0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_15

    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 10
    .line 11
    invoke-static {p1}, Lax/d3/l0;->d5(Lax/d3/l0;)Landroid/content/ServiceConnection;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-ne p1, p0, :cond_15

    .line 16
    .line 17
    iget-object p1, p0, Lax/d3/l0$c;->q:Lax/d3/l0;

    .line 18
    .line 19
    invoke-static {p1}, Lax/d3/l0;->e5(Lax/d3/l0;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method
