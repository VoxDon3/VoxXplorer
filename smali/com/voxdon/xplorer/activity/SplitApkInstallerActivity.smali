.class public Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity;
.super Lax/n/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity$a;
    }
.end annotation


# instance fields
.field a:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/n/c;-><init>()V

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
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lax/Q2/b;->f(Landroid/content/Context;Z)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    const p1, 0x7f0d0027

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lax/n/c;->setContentView(I)V

    .line 12
    .line 13
    .line 14
    const p1, 0x7f0a0398

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity;->a:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v2, "android.intent.action.VIEW"

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_38

    .line 42
    .line 43
    if-eqz p1, :cond_38

    .line 44
    .line 45
    new-instance v0, Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity$a;

    .line 46
    .line 47
    invoke-direct {v0, p0, p0, p1}, Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity$a;-><init>(Lcom/voxdon/xplorer/activity/SplitApkInstallerActivity;Landroid/content/Context;Landroid/net/Uri;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    new-array p1, p1, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    const p1, 0x7f130137

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 68
    .line 69
    .line 70
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method
