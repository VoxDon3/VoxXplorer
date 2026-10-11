.class Lcom/voxdon/xplorer/service/HttpServerService$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/HttpServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/service/HttpServerService;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/HttpServerService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService$c;->a:Lcom/voxdon/xplorer/service/HttpServerService;

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
    .registers 6

    .line 1
    const-string p1, "state"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {}, Lcom/voxdon/xplorer/service/HttpServerService;->e()Ljava/util/logging/Logger;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "music playback stop received : "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/voxdon/xplorer/service/HttpServerService$c;->a:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 23
    .line 24
    invoke-static {v2}, Lcom/voxdon/xplorer/service/HttpServerService;->f(Lcom/voxdon/xplorer/service/HttpServerService;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, ":"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lcom/voxdon/xplorer/service/HttpServerService$c;->a:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 47
    .line 48
    invoke-static {p2}, Lcom/voxdon/xplorer/service/HttpServerService;->f(Lcom/voxdon/xplorer/service/HttpServerService;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_42

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    if-ne p1, p2, :cond_3d

    .line 56
    .line 57
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService$c;->a:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 58
    .line 59
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/service/HttpServerService;->g(Lcom/voxdon/xplorer/service/HttpServerService;Z)Z

    .line 60
    .line 61
    .line 62
    :cond_3d
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService$c;->a:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/voxdon/xplorer/service/HttpServerService;->s()V

    .line 65
    .line 66
    .line 67
    :cond_42
    return-void
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
