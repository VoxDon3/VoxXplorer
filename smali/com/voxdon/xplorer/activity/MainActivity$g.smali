.class Lcom/voxdon/xplorer/activity/MainActivity$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$g;->a:Lcom/voxdon/xplorer/activity/MainActivity;

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
.method public a(Lax/a3/h$d;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$g;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/a;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    new-instance v0, Lax/a3/v;

    .line 11
    .line 12
    invoke-direct {v0}, Lax/a3/v;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_2b

    .line 21
    .line 22
    iget-object v2, p1, Lax/a3/h$d;->b:Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "host"

    .line 25
    .line 26
    if-nez v2, :cond_21

    .line 27
    .line 28
    iget-object p1, p1, Lax/a3/h$d;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2b

    .line 34
    :cond_21
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "display_name"

    .line 38
    .line 39
    iget-object p1, p1, Lax/a3/h$d;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    :goto_2b
    const-string p1, "action"

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-virtual {v1, p1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const-string p1, "port"

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v1, p1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    const-string p1, "location"

    .line 57
    .line 58
    sget-object v2, Lax/Q2/f;->J0:Lax/Q2/f;

    .line 59
    .line 60
    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$g;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v1, "smb"

    .line 73
    .line 74
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/e;->c3(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method
