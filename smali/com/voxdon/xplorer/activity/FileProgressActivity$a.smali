.class Lcom/voxdon/xplorer/activity/FileProgressActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/FileProgressActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/activity/FileProgressActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

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
    .registers 5

    .line 1
    instance-of p1, p2, Lcom/voxdon/xplorer/service/CommandService$d;

    .line 2
    .line 3
    if-nez p1, :cond_4a

    .line 4
    .line 5
    if-nez p2, :cond_9

    .line 6
    .line 7
    const-string p1, "service : null"

    .line 8
    .line 9
    goto :goto_22

    .line 10
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v0, "service :"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_22
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string v0, "INVALID SERVICE CLASS"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 57
    .line 58
    const p2, 0x7f130137

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4a
    check-cast p2, Lcom/voxdon/xplorer/service/CommandService$d;

    .line 76
    .line 77
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/voxdon/xplorer/service/CommandService$d;->a()Lcom/voxdon/xplorer/service/CommandService;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->H(Lcom/voxdon/xplorer/activity/FileProgressActivity;Lcom/voxdon/xplorer/service/CommandService;)Lcom/voxdon/xplorer/service/CommandService;

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->F(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Lcom/voxdon/xplorer/service/CommandService;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/service/CommandService;->J(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 98
    .line 99
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->I(Lcom/voxdon/xplorer/activity/FileProgressActivity;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 103
    .line 104
    new-instance p2, Lax/x3/s;

    .line 105
    .line 106
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 107
    .line 108
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->F(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Lcom/voxdon/xplorer/service/CommandService;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lcom/voxdon/xplorer/service/CommandService;->n()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {p2, v0, v1}, Lax/x3/s;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->L(Lcom/voxdon/xplorer/activity/FileProgressActivity;Lax/x3/s;)Lax/x3/s;

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->M(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Landroid/widget/ListView;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object p2, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 129
    .line 130
    invoke-static {p2}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->J(Lcom/voxdon/xplorer/activity/FileProgressActivity;)Lax/x3/s;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 135
    .line 136
    .line 137
    return-void
    .line 138
    .line 139
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/FileProgressActivity$a;->q:Lcom/voxdon/xplorer/activity/FileProgressActivity;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/activity/FileProgressActivity;->H(Lcom/voxdon/xplorer/activity/FileProgressActivity;Lcom/voxdon/xplorer/service/CommandService;)Lcom/voxdon/xplorer/service/CommandService;

    .line 5
    .line 6
    .line 7
    return-void
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
