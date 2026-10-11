.class Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;
.super Landroid/support/v4/media/session/MediaControllerCompat$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;->d:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$a;-><init>()V

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
.method public d(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 8

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->K2()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x4

    .line 25
    new-array v3, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v4, "Received metadata state change to mediaId="

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aput-object v4, v3, v5

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aput-object v1, v3, v4

    .line 34
    .line 35
    const-string v1, " song="

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    aput-object v1, v3, v4

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    aput-object v2, v3, v1

    .line 42
    .line 43
    invoke-static {v0, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2d
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_2d} :catch_2e

    .line 44
    .line 45
    .line 46
    goto :goto_44

    .line 47
    :catch_2e
    move-exception v0

    .line 48
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "METADATA COULD NOT READ BITMAP"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 67
    .line 68
    .line 69
    :goto_44
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;->d:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 70
    .line 71
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->N2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 72
    .line 73
    .line 74
    return-void
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

.method public e(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 7

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->K2()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    const-string v3, "Received playback state change to state "

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    aput-object v3, v2, v4

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    aput-object v1, v2, v3

    .line 23
    .line 24
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;->d:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 28
    .line 29
    invoke-static {v0, p1, v4}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->L2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;Landroid/support/v4/media/session/PlaybackStateCompat;Z)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
