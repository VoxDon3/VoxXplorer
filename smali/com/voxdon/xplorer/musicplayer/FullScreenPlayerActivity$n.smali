.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->h()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p1, v1, :cond_19

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    const/4 p1, 0x1

    .line 27
    :goto_1a
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->h(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_52

    .line 41
    .line 42
    if-ne p1, v1, :cond_3e

    .line 43
    .line 44
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 51
    .line 52
    const v1, 0x7f1303dc

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    goto :goto_52

    .line 63
    :cond_3e
    if-nez p1, :cond_52

    .line 64
    .line 65
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 72
    .line 73
    const v1, 0x7f1303db

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    :cond_52
    :goto_52
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v0, "menu_music_player"

    .line 88
    .line 89
    const-string v1, "shuffle"

    .line 90
    .line 91
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string v0, "loc"

    .line 96
    .line 97
    const-string v1, "fullscreen_player"

    .line 98
    .line 99
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 104
    .line 105
    .line 106
    return-void
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
