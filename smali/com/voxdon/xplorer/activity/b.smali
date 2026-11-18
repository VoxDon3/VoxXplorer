.class public abstract Lcom/voxdon/xplorer/activity/b;
.super Lcom/voxdon/xplorer/activity/a;
.source "SourceFile"

# interfaces
.implements Lax/d3/x0$a;


# instance fields
.field private j:Landroid/support/v4/media/MediaBrowserCompat;

.field private k:Landroid/support/v4/media/session/MediaControllerCompat;

.field private l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private m:Landroid/view/View;

.field protected n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

.field private o:Lax/Q2/j;

.field private p:Z

.field private q:Landroid/net/Uri;

.field private r:Landroid/os/Bundle;

.field private s:Z

.field private t:Z

.field private u:Lax/d3/C0;

.field private v:Lax/d3/x0;

.field private final w:Landroid/support/v4/media/session/MediaControllerCompat$a;

.field private final x:Landroid/support/v4/media/MediaBrowserCompat$c;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->s:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->t:Z

    .line 10
    .line 11
    new-instance v0, Lcom/voxdon/xplorer/activity/b$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/b$a;-><init>(Lcom/voxdon/xplorer/activity/b;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->w:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 17
    .line 18
    new-instance v0, Lcom/voxdon/xplorer/activity/b$b;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/activity/b$b;-><init>(Lcom/voxdon/xplorer/activity/b;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->x:Landroid/support/v4/media/MediaBrowserCompat$c;

    .line 24
    .line 25
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private D0(Landroid/support/v4/media/session/MediaControllerCompat;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->k:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method static synthetic V(Lcom/voxdon/xplorer/activity/b;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic W(Lcom/voxdon/xplorer/activity/b;)Landroid/support/v4/media/MediaBrowserCompat;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic X(Lcom/voxdon/xplorer/activity/b;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/activity/b;->c0(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

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

.method private b0()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_26

    .line 4
    .line 5
    invoke-static {p0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 6
    .line 7
    .line 8
    :try_start_7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->a()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_f} :catch_10

    .line 15
    .line 16
    return-void

    .line 17
    :catch_10
    move-exception v0

    .line 18
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "MEDIA BROWSER CONNECT"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 37
    .line 38
    .line 39
    :cond_26
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private c0(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->l(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/b;->D0(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/b;->w:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->M0()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 21
    .line 22
    if-eqz p1, :cond_1a

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->V2(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->u0()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 31
    .line 32
    if-eqz p1, :cond_48

    .line 33
    .line 34
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 35
    .line 36
    const-string v1, "PLAY_PREPARE"

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_38

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->d(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    goto :goto_43

    .line 57
    :cond_38
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->c(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    :goto_43
    const/4 p1, 0x0

    .line 69
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 72
    .line 73
    :cond_48
    return-void
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


# virtual methods
.method public A0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;I)Z
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-static {p1}, Lax/c3/B;->d(Lcom/voxdon/xplorer/file/n;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Lax/X2/Q;->a0()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1f

    .line 16
    .line 17
    if-nez v0, :cond_1f

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->n0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1f

    .line 24
    .line 25
    invoke-static {p0}, Lax/u3/B;->N(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    const/4 v6, 0x1

    .line 33
    move-object v2, p0

    .line 34
    move-object v3, p1

    .line 35
    move-object v4, p2

    .line 36
    move-object v5, p3

    .line 37
    move v7, p4

    .line 38
    invoke-virtual/range {v2 .. v7}, Lcom/voxdon/xplorer/activity/b;->y0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;ZI)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method protected B0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->v:Lax/d3/x0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/d3/x0;->g()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public C0(Lax/d3/Z;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lax/d3/C0;->x(Lax/d3/Z;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public E0(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->v:Lax/d3/x0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lax/d3/x0;->i(I)V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public F0(Lax/x3/h$a;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->e0()Lax/x3/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_d

    .line 8
    :cond_7
    invoke-virtual {v0}, Lax/x3/h;->d()Lax/x3/h$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-ne p1, v1, :cond_e

    .line 13
    .line 14
    :goto_d
    return-void

    .line 15
    :cond_e
    invoke-virtual {v0, p1}, Lax/x3/h;->a(Lax/x3/h$a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->x0()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method G0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->m:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 8
    .line 9
    if-eqz v1, :cond_2c

    .line 10
    .line 11
    new-instance v1, Lcom/voxdon/xplorer/activity/b$c;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/activity/b$c;-><init>(Lcom/voxdon/xplorer/activity/b;)V

    .line 14
    .line 15
    .line 16
    const v2, 0x3dcccccd    # 0.1f

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->Q(F)V

    .line 20
    .line 21
    .line 22
    const v2, 0x3f19999a    # 0.6f

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->O(F)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-virtual {v1, v2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->R(I)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lcom/voxdon/xplorer/activity/b$d;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/activity/b$d;-><init>(Lcom/voxdon/xplorer/activity/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->P(Lcom/google/android/material/behavior/SwipeDismissBehavior$c;)V

    .line 38
    .line 39
    .line 40
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->o(Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected H0()Z
    .registers 9

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_a4

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_a4

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_15

    .line 19
    .line 20
    goto/16 :goto_a4

    .line 21
    .line 22
    :cond_15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->d0()Lax/d3/n;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x7

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3f

    .line 37
    .line 38
    invoke-virtual {v2}, Lax/d3/n;->z3()Lax/Q2/f;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, Lax/Q2/f;->A0:Lax/Q2/f;

    .line 43
    .line 44
    if-ne v6, v7, :cond_3f

    .line 45
    .line 46
    if-eq v3, v5, :cond_33

    .line 47
    .line 48
    if-eq v3, v4, :cond_32

    .line 49
    .line 50
    return v5

    .line 51
    :cond_32
    return v1

    .line 52
    :cond_33
    invoke-static {p0}, Lax/h3/b;->b(Landroid/content/Context;)Lax/h3/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lax/h3/b;->e()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3e

    .line 61
    .line 62
    return v5

    .line 63
    :cond_3e
    return v1

    .line 64
    :cond_3f
    if-eqz v3, :cond_96

    .line 65
    .line 66
    if-eq v3, v5, :cond_95

    .line 67
    .line 68
    const/4 v6, 0x2

    .line 69
    if-eq v3, v6, :cond_94

    .line 70
    .line 71
    if-eq v3, v4, :cond_95

    .line 72
    .line 73
    if-eqz v2, :cond_90

    .line 74
    .line 75
    invoke-virtual {v2}, Lax/d3/n;->C3()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_51

    .line 80
    .line 81
    goto :goto_90

    .line 82
    :cond_51
    :try_start_51
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v4, "__SOURCE_FOLDER__"

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_76

    .line 97
    .line 98
    invoke-virtual {v2}, Lax/d3/n;->A3()Lax/c3/K;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v2}, Lax/d3/n;->C3()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v4, v2}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0
    :try_end_71
    .catch Ljava/lang/RuntimeException; {:try_start_51 .. :try_end_71} :catch_74

    .line 114
    if-eqz v0, :cond_76

    .line 115
    .line 116
    return v5

    .line 117
    :catch_74
    move-exception v0

    .line 118
    goto :goto_7a

    .line 119
    :cond_76
    if-eq v3, v6, :cond_79

    .line 120
    .line 121
    return v5

    .line 122
    :cond_79
    return v1

    .line 123
    :goto_7a
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v3, "MusicPlayer MetaData error"

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 142
    .line 143
    .line 144
    return v1

    .line 145
    :cond_90
    :goto_90
    if-eq v3, v6, :cond_93

    .line 146
    .line 147
    return v5

    .line 148
    :cond_93
    return v1

    .line 149
    :cond_94
    return v5

    .line 150
    :cond_95
    return v1

    .line 151
    :cond_96
    invoke-static {p0}, Lax/h3/b;->b(Landroid/content/Context;)Lax/h3/b;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-wide/32 v2, 0x36ee80

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v2, v3}, Lax/h3/b;->f(J)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_a4

    .line 163
    .line 164
    return v5

    .line 165
    :cond_a4
    :goto_a4
    return v1
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method protected I0()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_3d

    .line 6
    :cond_5
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->m:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->m:Landroid/view/View;

    .line 12
    .line 13
    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3d

    .line 25
    .line 26
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x7f01001c

    .line 41
    .line 42
    .line 43
    const v2, 0x7f01001d

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v2, v1, v2}, Landroidx/fragment/app/t;->t(IIII)Landroidx/fragment/app/t;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->v(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/t;->j()I

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->B0()V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public J0(Z)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->e0()Lax/x3/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {v0, p1}, Lax/x3/h;->t(Z)V

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
    .line 22
.end method

.method public K0()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_29

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_29

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    goto :goto_29

    .line 20
    :cond_13
    invoke-static {p0}, Landroid/support/v4/media/session/MediaControllerCompat;->c(Landroid/app/Activity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat$e;->k()V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lax/h3/b;->b(Landroid/content/Context;)Lax/h3/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lax/h3/b;->a()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    :goto_29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 43
    .line 44
    .line 45
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public abstract L0()V
.end method

.method protected M0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_49

    .line 6
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    goto :goto_49

    .line 13
    :cond_c
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->H0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_16

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->I0()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_49

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_49

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x2

    .line 47
    if-ne v1, v2, :cond_49

    .line 48
    .line 49
    invoke-static {p0}, Lax/h3/b;->b(Landroid/content/Context;)Lax/h3/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lax/h3/b;->c()Lax/Z2/k;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_42

    .line 58
    .line 59
    invoke-virtual {v1}, Lax/Z2/k;->b()Lax/Q2/f;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v2, Lax/Q2/f;->A0:Lax/Q2/f;

    .line 64
    .line 65
    if-eq v1, v2, :cond_49

    .line 66
    .line 67
    :cond_42
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat$e;->k()V

    .line 72
    .line 73
    .line 74
    :cond_49
    :goto_49
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public Y(Lax/d3/Z;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lax/d3/C0;->n(Lax/d3/Z;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public abstract a0(Lax/Q2/f;ILjava/lang/String;)V
.end method

.method public abstract d0()Lax/d3/n;
.end method

.method public abstract e0()Lax/x3/h;
.end method

.method public f0()Landroid/support/v4/media/session/MediaControllerCompat;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->k:Landroid/support/v4/media/session/MediaControllerCompat;

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

.method public g0()Lax/Q2/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->o:Lax/Q2/j;

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

.method public abstract h0()Lax/x3/A;
.end method

.method public i0()Landroid/graphics/Point;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    const-string v0, "Invalid WindowSizeChanged Called."

    .line 6
    .line 7
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/graphics/Point;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_10
    invoke-virtual {v0, p0}, Lax/d3/C0;->t(Landroid/content/Context;)Landroid/graphics/Point;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method protected j0()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_2a

    .line 6
    :cond_5
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 7
    .line 8
    if-eqz v0, :cond_2a

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-eq v0, v1, :cond_2a

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/t;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/fragment/app/t;->p(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/t;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/t;->j()I

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->B0()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    :goto_2a
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected k0()V
    .registers 3

    .line 1
    new-instance v0, Lax/d3/x0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p0}, Lax/d3/x0;-><init>(Lax/n/c;Lax/d3/x0$a;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->v:Lax/d3/x0;

    .line 7
    .line 8
    const v1, 0x7f0a03ba

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lax/d3/x0;->d(Lcom/voxdon/xplorer/widget/WindowInsetsFrameLayout;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public l0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 2
    .line 3
    return v0
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

.method protected m0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_10
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->s:Z

    .line 2
    .line 3
    return v0
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

.method public o0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lax/d3/C0;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lax/d3/C0;->v(Landroid/content/res/Configuration;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-super {p0, p1}, Lax/n/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

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
    .line 22
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    const-string v0, "ACTIVITY_BASE_ONCREATE"

    invoke-static {v0}, Lcom/voxdon/xplorer/VoxCrashHook;->mark(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/voxdon/xplorer/activity/a;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/support/v4/media/MediaBrowserCompat;

    .line 5
    .line 6
    new-instance v0, Landroid/content/ComponentName;

    .line 7
    .line 8
    const-class v1, Lcom/example/android/uamp/MusicService;

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/b;->x:Landroid/support/v4/media/MediaBrowserCompat$c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p1, p0, v0, v1, v2}, Landroid/support/v4/media/MediaBrowserCompat;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$c;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 20
    .line 21
    new-instance p1, Lax/Q2/j;

    .line 22
    .line 23
    invoke-direct {p1}, Lax/Q2/j;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->o:Lax/Q2/j;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/b;->s:Z

    .line 30
    .line 31
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/voxdon/xplorer/shizuku/c;->j()V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lax/d3/C0;

    .line 39
    .line 40
    invoke-direct {p1, p0}, Lax/d3/C0;-><init>(Lax/n/c;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->u:Lax/d3/C0;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lax/d3/C0;->m(Landroid/content/res/Configuration;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method protected onDestroy()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->t:Z

    .line 3
    .line 4
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onDestroy()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/shizuku/c;->G()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onIMEVisibilityChanged(Z)V
    .registers 2

    return-void
.end method

.method protected onStart()V
    .registers 3

    .line 1
    invoke-super {p0}, Lcom/voxdon/xplorer/activity/a;->onStart()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->s:Z

    .line 6
    .line 7
    const v0, 0x7f0a038c

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->l:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    if-eqz v0, :cond_53

    .line 19
    .line 20
    const v0, 0x7f0a021e

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/voxdon/xplorer/activity/b;->m:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->G0()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/f;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->j0(I)Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 43
    .line 44
    if-eqz v0, :cond_4b

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/example/android/uamp/MusicService;->G()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4a

    .line 54
    .line 55
    iget-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 56
    .line 57
    if-nez v0, :cond_4a

    .line 58
    .line 59
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->d()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_47

    .line 66
    .line 67
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->b()V

    .line 70
    .line 71
    .line 72
    :cond_47
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/b;->b0()V

    .line 73
    .line 74
    .line 75
    :cond_4a
    return-void

    .line 76
    :cond_4b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "Mising fragment with id \'controls\'. Cannot continue."

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_53
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v1, "Mising view with id \'controls\'. Cannot continue."

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method protected onStop()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/n/c;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->s:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/voxdon/xplorer/activity/b;->p:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->s0()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b;->j:Landroid/support/v4/media/MediaBrowserCompat;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->b()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public abstract p0()V
.end method

.method public abstract q0(Ljava/lang/String;)V
.end method

.method public abstract r0(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
.end method

.method protected s0()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1f

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lcom/voxdon/xplorer/activity/b;->w:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/activity/b;->n:Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 22
    .line 23
    if-eqz v1, :cond_1f

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->W2(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/activity/b;->D0(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->l(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->v0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 42
    .line 43
    .line 44
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public abstract t0(Lax/Q2/f;ILjava/lang/String;Z)V
.end method

.method protected u0()V
    .registers 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "CONNECTED"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method protected v0()V
    .registers 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "CONNECTED"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public abstract w0(Lax/Q2/f;ILjava/lang/String;Z)V
.end method

.method public abstract x0()V
.end method

.method public y0(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Ljava/util/List;ZI)Z
    .registers 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;ZI)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    invoke-static {}, Lax/Q4/a;->b()Lax/Q4/a;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Lax/Q4/a;->a()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lax/c3/B;->d(Lcom/voxdon/xplorer/file/n;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-static/range {p0 .. p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v5}, Lcom/voxdon/xplorer/service/b;->h()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v4, :cond_2e

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->L()I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x1

    .line 42
    move-object/from16 v6, p0

    .line 43
    .line 44
    invoke-static/range {v6 .. v12}, Lcom/voxdon/xplorer/service/HttpServerService;->q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    new-instance v6, Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 50
    .line 51
    .line 52
    if-eqz p3, :cond_a8

    .line 53
    .line 54
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_a8

    .line 59
    .line 60
    invoke-static/range {p3 .. p3}, Lax/c3/A;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    new-instance v9, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-eqz v10, :cond_a8

    .line 74
    .line 75
    new-instance v10, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    const/4 v12, 0x0

    .line 85
    const/4 v13, 0x0

    .line 86
    :goto_55
    if-ge v13, v11, :cond_8e

    .line 87
    .line 88
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    add-int/lit8 v13, v13, 0x1

    .line 93
    .line 94
    check-cast v14, Lcom/voxdon/xplorer/file/n;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v15

    .line 100
    invoke-virtual {v14}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_6e

    .line 109
    .line 110
    const/4 v12, 0x1

    .line 111
    :cond_6e
    invoke-static {v14}, Lax/c3/B;->d(Lcom/voxdon/xplorer/file/n;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_7a

    .line 116
    .line 117
    const/4 v7, 0x1

    .line 118
    invoke-static {v14, v7}, Lax/c3/u;->H(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 119
    .line 120
    .line 121
    move-result-object v15

    .line 122
    goto :goto_81

    .line 123
    :cond_7a
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    invoke-static {v5, v14}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    :goto_81
    new-instance v7, Landroid/util/Pair;

    .line 131
    .line 132
    invoke-virtual {v14}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    invoke-direct {v7, v15, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_55

    .line 143
    :cond_8e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-lez v7, :cond_9f

    .line 148
    .line 149
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/activity/a;->b()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v7}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v7, v9}, Lcom/voxdon/xplorer/service/b;->b(Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    :cond_9f
    if-eqz v12, :cond_a8

    .line 161
    .line 162
    invoke-static {}, Lax/Q4/a;->b()Lax/Q4/a;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v7, v10}, Lax/Q4/a;->d(Ljava/util/ArrayList;)V

    .line 167
    .line 168
    .line 169
    :cond_a8
    const-string v7, "PLAY_FOLDER_URI"

    .line 170
    .line 171
    invoke-virtual {v6, v7, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    xor-int/lit8 v7, v4, 0x1

    .line 175
    .line 176
    const-string v8, "PLAY_LOCAL_HTTP"

    .line 177
    .line 178
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 179
    .line 180
    .line 181
    const-string v7, "PLAYER_ENGINE"

    .line 182
    .line 183
    invoke-static/range {p0 .. p0}, Lax/t3/j;->h(Landroid/content/Context;)I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    if-eqz v2, :cond_c4

    .line 191
    .line 192
    const-string v7, "PLAY_PREPARE"

    .line 193
    .line 194
    invoke-virtual {v6, v7, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    :cond_c4
    const-string v2, "PLAY_RESUME_POSITION"

    .line 198
    .line 199
    invoke-virtual {v6, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    if-eqz v4, :cond_d1

    .line 203
    .line 204
    const/4 v7, 0x1

    .line 205
    invoke-static {v0, v7}, Lax/c3/u;->H(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    goto :goto_e1

    .line 210
    :cond_d1
    const/4 v7, 0x1

    .line 211
    invoke-virtual/range {p0 .. p0}, Lcom/voxdon/xplorer/activity/a;->b()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v2}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/service/b;->c(Lcom/voxdon/xplorer/file/n;)Z

    .line 220
    .line 221
    .line 222
    invoke-static {v5, v0}, Lcom/voxdon/xplorer/service/HttpServerService;->l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :goto_e1
    invoke-static/range {p0 .. p0}, Lax/h3/b;->b(Landroid/content/Context;)Lax/h3/b;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v4, v1, v0, v3}, Lax/h3/b;->h(Ljava/lang/String;Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v0, p0

    .line 238
    .line 239
    invoke-virtual {v0, v2, v6}, Lcom/voxdon/xplorer/activity/b;->z0(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 240
    .line 241
    .line 242
    return v7
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public z0(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2c

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 11
    .line 12
    const-string v0, "PLAY_PREPARE"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_20

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->d(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    invoke-virtual {p0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->c(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b;->q:Landroid/net/Uri;

    .line 46
    .line 47
    iput-object p2, p0, Lcom/voxdon/xplorer/activity/b;->r:Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {p0}, Lcom/voxdon/xplorer/activity/b;->b0()V

    .line 50
    .line 51
    .line 52
    return-void
    .line 53
    .line 54
    .line 55
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
