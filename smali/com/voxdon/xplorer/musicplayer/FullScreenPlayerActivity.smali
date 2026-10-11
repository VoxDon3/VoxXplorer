.class public Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;
.super Lax/n/c;
.source "SourceFile"

# interfaces
.implements Lax/d3/Z;


# static fields
.field private static final Z:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/view/View;

.field private C:Landroid/view/View;

.field private D:Ljava/lang/String;

.field private final E:Landroid/os/Handler;

.field private F:Landroid/support/v4/media/MediaBrowserCompat;

.field private G:J

.field private H:J

.field private I:J

.field private J:Z

.field private K:I

.field private L:Z

.field private M:F

.field private N:Z

.field private final O:Ljava/lang/Runnable;

.field private final P:Ljava/util/concurrent/ScheduledExecutorService;

.field private Q:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private R:Landroid/support/v4/media/session/PlaybackStateCompat;

.field private S:Lax/d3/C0;

.field private T:Ljava/io/File;

.field private U:Ljava/lang/String;

.field private V:Z

.field private final W:Landroid/support/v4/media/session/MediaControllerCompat$a;

.field private final X:Landroid/support/v4/media/MediaBrowserCompat$c;

.field private final Y:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private a:Landroidx/appcompat/widget/Toolbar;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/SeekBar;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/ProgressBar;

.field private p:Landroid/view/View;

.field private q:Landroid/graphics/drawable/Drawable;

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:Landroid/graphics/drawable/Drawable;

.field private t:Landroid/graphics/drawable/Drawable;

.field private u:Landroid/graphics/drawable/Drawable;

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/TextView;

.field private x:Landroidx/appcompat/widget/MySpinner;

.field private y:Landroid/view/View;

.field private z:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/n/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E:Landroid/os/Handler;

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 14
    .line 15
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$k;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$k;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->O:Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 34
    .line 35
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$m;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$m;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X:Landroid/support/v4/media/MediaBrowserCompat$c;

    .line 41
    .line 42
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$j;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$j;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Y:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 48
    .line 49
    return-void
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

.method private A0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method private B0(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
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
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_13

    .line 11
    .line 12
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 13
    .line 14
    if-nez p1, :cond_13

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->b1(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 24
    .line 25
    if-eqz p1, :cond_28

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 32
    .line 33
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p1, v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->c(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->m1(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->f()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s1()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_4c

    .line 67
    .line 68
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->l1(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->h1(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n1(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->b()Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_55

    .line 82
    .line 83
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p1(Landroid/os/Bundle;)V

    .line 84
    .line 85
    .line 86
    :cond_55
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->f()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->q1(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->h()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r1(I)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o1()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v1, 0x3

    .line 108
    if-eq v0, v1, :cond_76

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/4 v0, 0x6

    .line 115
    if-ne p1, v0, :cond_75

    .line 116
    .line 117
    goto :goto_76

    .line 118
    :cond_75
    return-void

    .line 119
    :cond_76
    :goto_76
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W0()V

    .line 120
    .line 121
    .line 122
    return-void
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

.method private C0(Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V
    .registers 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_6f

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const-string v4, "fullscreen_player"

    .line 18
    .line 19
    const-string v5, "loc"

    .line 20
    .line 21
    const-string v6, "menu_music_player"

    .line 22
    .line 23
    if-eqz v3, :cond_56

    .line 24
    .line 25
    if-eq v3, v1, :cond_56

    .line 26
    .line 27
    if-eq v3, v0, :cond_56

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    if-eq v3, v7, :cond_3c

    .line 31
    .line 32
    const/4 v7, 0x6

    .line 33
    if-eq v3, v7, :cond_3c

    .line 34
    .line 35
    const/4 p3, 0x7

    .line 36
    if-eq v3, p3, :cond_56

    .line 37
    .line 38
    sget-object p1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    new-array p3, v0, [Ljava/lang/Object;

    .line 49
    .line 50
    const-string v0, "onClick with state "

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    aput-object v0, p3, v2

    .line 54
    .line 55
    aput-object p2, p3, v1

    .line 56
    .line 57
    invoke-static {p1, p3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    if-nez p3, :cond_6f

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->a()V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string p2, "pause"

    .line 74
    .line 75
    invoke-virtual {p1, v6, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1, v5, v4}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    if-nez p2, :cond_6f

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->b()V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W0()V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string p2, "play"

    .line 100
    .line 101
    invoke-virtual {p1, v6, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v5, v4}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 110
    .line 111
    .line 112
    :cond_6f
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
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
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private E0(Z)V
    .registers 6

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    if-eqz p1, :cond_9

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Y0(J)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    goto :goto_f

    .line 10
    :cond_9
    const-wide/16 v2, -0x2710

    .line 11
    .line 12
    invoke-direct {p0, v2, v3}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Y0(J)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    :goto_f
    if-nez v2, :cond_12

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    if-eqz p1, :cond_2f

    .line 20
    .line 21
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "+"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    goto :goto_49

    .line 48
    :cond_2f
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

    .line 49
    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "-"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    :goto_49
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

    .line 75
    .line 76
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$i;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$i;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v1, 0x3e8

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 84
    .line 85
    .line 86
    return-void
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

.method static synthetic F(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o1()V

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
.end method

.method private F0()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_16

    .line 16
    .line 17
    iget-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I:J

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {p0, v0, v1, v2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X0(JZ)V

    .line 21
    .line 22
    .line 23
    :cond_16
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I:J

    .line 26
    .line 27
    return-void
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

.method private G0(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_12

    .line 7
    .line 8
    iput-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->D:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

    .line 11
    .line 12
    const v0, 0x7f080193

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->D:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {}, Lax/P4/a;->i()Lax/P4/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p1}, Lax/P4/a;->g(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_2c

    .line 38
    .line 39
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$f;

    .line 55
    .line 56
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$f;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1, p1, v2}, Lax/P4/a;->f(Landroid/content/Context;Ljava/lang/String;Lax/P4/a$a;)V

    .line 60
    .line 61
    .line 62
    return-void
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
.end method

.method static synthetic H()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

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

.method private H0()J
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_37

    .line 14
    .line 15
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x2

    .line 22
    if-eq v2, v3, :cond_37

    .line 23
    .line 24
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eq v2, v3, :cond_37

    .line 32
    .line 33
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat;->e()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    sub-long/2addr v2, v4

    .line 44
    long-to-float v0, v0

    .line 45
    long-to-float v1, v2

    .line 46
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->f()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    mul-float v1, v1, v2

    .line 53
    .line 54
    add-float/2addr v0, v1

    .line 55
    float-to-long v0, v0

    .line 56
    :cond_37
    return-wide v0
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

.method static synthetic I(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->B0(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

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

.method private I0()Landroid/support/v4/media/session/MediaControllerCompat;
    .registers 2

    .line 1
    invoke-static {p0}, Landroid/support/v4/media/session/MediaControllerCompat;->c(Landroid/app/Activity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method static synthetic J(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/session/MediaControllerCompat;
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private J0()V
    .registers 5

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->K:I

    .line 8
    .line 9
    new-instance v0, Lcom/voxdon/xplorer/viewer/a;

    .line 10
    .line 11
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$g;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$g;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 14
    .line 15
    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-direct {v0, p0, v2, v1}, Lcom/voxdon/xplorer/viewer/a;-><init>(Landroid/content/Context;FLcom/voxdon/xplorer/viewer/a$b;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/view/GestureDetector;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Y:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

    .line 29
    .line 30
    new-instance v3, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;

    .line 31
    .line 32
    invoke-direct {v3, p0, v0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$h;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Lcom/voxdon/xplorer/viewer/a;Landroid/view/GestureDetector;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method private K0()V
    .registers 4

    .line 1
    invoke-static {p0}, Lax/t3/f;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g1()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 11
    .line 12
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$n;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 21
    .line 22
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$o;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$o;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$p;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$p;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 41
    .line 42
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$q;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$q;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 51
    .line 52
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->B:Landroid/view/View;

    .line 61
    .line 62
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$s;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$s;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C:Landroid/view/View;

    .line 71
    .line 72
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$a;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$a;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j:Landroid/widget/SeekBar;

    .line 81
    .line 82
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;

    .line 83
    .line 84
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$b;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 91
    .line 92
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$c;

    .line 93
    .line 94
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$c;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lcom/voxdon/xplorer/viewer/d;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/d;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x:Landroidx/appcompat/widget/MySpinner;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/u;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x:Landroidx/appcompat/widget/MySpinner;

    .line 111
    .line 112
    new-instance v2, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$d;

    .line 113
    .line 114
    invoke-direct {v2, p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$d;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Lcom/voxdon/xplorer/viewer/d;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 118
    .line 119
    .line 120
    iget v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    cmpl-float v0, v0, v1

    .line 124
    .line 125
    if-eqz v0, :cond_81

    .line 126
    .line 127
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s1()V

    .line 128
    .line 129
    .line 130
    :cond_81
    return-void
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

.method static synthetic L(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

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

.method private L0()V
    .registers 3

    .line 1
    const v0, 0x7f0a04a5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->a:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    if-eqz v0, :cond_11

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lax/n/c;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "Layout is required to include a Toolbar with id \'toolbar\'"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
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

.method static synthetic M(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

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

.method private M0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J:Z

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

.method static synthetic N(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C0(Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V

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

.method private static N0(I)Z
    .registers 2

    .line 1
    const/16 v0, 0x5a

    if-eq p0, v0, :cond_23

    const/16 v0, 0x59

    if-eq p0, v0, :cond_23

    const/16 v0, 0x55

    if-eq p0, v0, :cond_23

    const/16 v0, 0x4f

    if-eq p0, v0, :cond_23

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_23

    const/16 v0, 0x7f

    if-eq p0, v0, :cond_23

    const/16 v0, 0x57

    if-eq p0, v0, :cond_23

    const/16 v0, 0x58

    if-ne p0, v0, :cond_21

    goto :goto_23

    :cond_21
    const/4 p0, 0x0

    return p0

    :cond_23
    :goto_23
    const/4 p0, 0x1

    return p0
.end method

.method static synthetic O(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;J)Z
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Y0(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private O0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L:Z

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

.method private P0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method static synthetic Q(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->h:Landroid/widget/TextView;

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

.method private Q0()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L:Z

    .line 3
    .line 4
    iget v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c1(FZ)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic R(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;JZ)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X0(JZ)V

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
.end method

.method private R0(F)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_53

    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 9
    .line 10
    if-eqz v0, :cond_53

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x3

    .line 17
    if-ne v0, v1, :cond_53

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L:Z

    .line 21
    .line 22
    const/high16 v0, 0x3f000000    # 0.5f

    .line 23
    .line 24
    cmpl-float v0, p1, v0

    .line 25
    .line 26
    if-nez v0, :cond_23

    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 29
    .line 30
    const-string v1, "0.5X\u25b6\u25b6"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    goto :goto_4a

    .line 36
    :cond_23
    const/high16 v0, 0x40000000    # 2.0f

    .line 37
    .line 38
    cmpl-float v0, p1, v0

    .line 39
    .line 40
    if-nez v0, :cond_31

    .line 41
    .line 42
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 43
    .line 44
    const-string v1, "2X\u25b6\u25b6"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4a

    .line 50
    :cond_31
    invoke-static {}, Lax/u3/b;->f()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, "X\u25b6\u25b6"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :goto_4a
    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c1(FZ)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    :cond_53
    :goto_53
    return-void
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

.method static synthetic S(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

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
.end method

.method private S0()V
    .registers 2

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R0(F)V

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
.end method

.method static synthetic T(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f1()V

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
.end method

.method private T0()V
    .registers 2

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R0(F)V

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
.end method

.method static synthetic U(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->m1(Landroid/support/v4/media/session/PlaybackStateCompat;)V

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

.method private U0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->O:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
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

.method static synthetic V(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;FZ)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c1(FZ)V

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
.end method

.method private V0(Ljava/io/File;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

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
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->c(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method static synthetic W(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Ljava/lang/Runnable;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->O:Ljava/lang/Runnable;

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

.method private W0()V
    .registers 9

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1e

    .line 11
    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    new-instance v2, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;-><init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v5, 0x3e8

    .line 20
    .line 21
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v3, 0x64

    .line 24
    .line 25
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Q:Ljava/util/concurrent/ScheduledFuture;

    .line 30
    .line 31
    :cond_1e
    return-void
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

.method static synthetic X(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E:Landroid/os/Handler;

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

.method private X0(JZ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

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
    if-eqz p3, :cond_f

    .line 9
    .line 10
    iget-object p3, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j:Landroid/widget/SeekBar;

    .line 11
    .line 12
    long-to-int v0, p1

    .line 13
    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 14
    .line 15
    .line 16
    :cond_f
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p3}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-virtual {p3, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->e(J)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->a1(J)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W0()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic Y(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->D:Ljava/lang/String;

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

.method private Y0(J)Z
    .registers 7

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->y0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    iget-wide v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H:J

    .line 17
    .line 18
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x0(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    cmp-long v0, v2, p1

    .line 23
    .line 24
    if-nez v0, :cond_1a

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    const/4 v0, 0x1

    .line 28
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X0(JZ)V

    .line 29
    .line 30
    .line 31
    return v0
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
.end method

.method private Z0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N:Z

    .line 2
    .line 3
    invoke-static {p0, p1}, Lax/t3/f;->b(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g1()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lax/n/c;->invalidateOptionsMenu()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method static synthetic a0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

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

.method private a1(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H:J

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

.method static synthetic b0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T0()V

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
.end method

.method private b1(Landroid/support/v4/media/session/MediaControllerCompat;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->l(Landroid/app/Activity;Landroid/support/v4/media/session/MediaControllerCompat;)V

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
.end method

.method static synthetic c0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private c1(FZ)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_12

    .line 8
    :cond_7
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->f(F)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_12

    .line 16
    .line 17
    iput p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 18
    .line 19
    :cond_12
    :goto_12
    return-void
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

.method static synthetic d0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F0()V

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
.end method

.method private d1()V
    .registers 4

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_25

    .line 8
    :cond_7
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    goto :goto_25

    .line 15
    :cond_e
    const-string v1, "__SOURCE__"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    goto :goto_25

    .line 24
    :cond_17
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lax/c3/v;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_26

    .line 37
    .line 38
    :goto_25
    return-void

    .line 39
    :cond_26
    invoke-static {p0, v1, v0}, Lax/c3/u;->k0(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "menu_music_player"

    .line 47
    .line 48
    const-string v2, "share"

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "loc"

    .line 55
    .line 56
    const-string v2, "music_player"

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "type"

    .line 63
    .line 64
    const-string v2, "file"

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 71
    .line 72
    .line 73
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

.method static synthetic e0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->O0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private e1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Q:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_8
    return-void
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

.method static synthetic f0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Q0()V

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
.end method

.method private f1()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z0(Z)V

    .line 6
    .line 7
    .line 8
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

.method static synthetic g0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->l1(Landroid/support/v4/media/MediaMetadataCompat;)V

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

.method private g1()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->y:Landroid/view/View;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 12
    .line 13
    const v1, 0x7f080188

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 20
    .line 21
    const v1, 0x7f130279

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->y:Landroid/view/View;

    .line 33
    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 40
    .line 41
    const v1, 0x7f08019f

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 48
    .line 49
    const v1, 0x7f130287

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    return-void
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

.method static synthetic h0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

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

.method private h1(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 6

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "updateDuration called "

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "android.media.metadata.DURATION"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G:J

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->a1(J)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G:J

    .line 31
    .line 32
    long-to-int p1, v0

    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j:Landroid/widget/SeekBar;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->i:Landroid/widget/TextView;

    .line 39
    .line 40
    div-int/lit16 p1, p1, 0x3e8

    .line 41
    .line 42
    int-to-long v1, p1

    .line 43
    invoke-static {v1, v2}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method static synthetic i0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->b:Landroid/view/View;

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

.method private i1(Landroid/content/Intent;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_f

    .line 2
    .line 3
    const-string v0, "com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 10
    .line 11
    if-eqz p1, :cond_f

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->k1(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic j0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E0(Z)V

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

.method private j1(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/16 v1, 0x190

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-ge p1, v1, :cond_1c

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 16
    .line 17
    const v0, 0x7f0a0115

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 34
    .line 35
    const v0, 0x7f0a00c6

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method static synthetic k0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->K:I

    .line 2
    .line 3
    return p0
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

.method private k1(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 6

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "updateMediaDescription called "

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->k:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->b()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->l:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->m:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G0(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lax/n/c;->invalidateOptionsMenu()V

    .line 48
    .line 49
    .line 50
    return-void
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

.method static synthetic l0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->y0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private l1(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lax/P4/k;->b(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->k1(Landroid/support/v4/media/MediaDescriptionCompat;)V

    .line 6
    .line 7
    .line 8
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

.method static synthetic m0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H:J

    .line 2
    .line 3
    return-wide v0
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

.method private m1(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    return-void

    .line 7
    :cond_6
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-string v4, ""

    .line 14
    .line 15
    const v5, 0x7f130375

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x4

    .line 19
    if-eqz v3, :cond_106

    .line 20
    .line 21
    if-eq v3, v1, :cond_106

    .line 22
    .line 23
    if-eq v3, v0, :cond_de

    .line 24
    .line 25
    const/4 v7, 0x3

    .line 26
    const v8, 0x7f130374

    .line 27
    .line 28
    .line 29
    if-eq v3, v7, :cond_b6

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    if-eq v3, v4, :cond_8f

    .line 33
    .line 34
    const/4 v4, 0x7

    .line 35
    if-eq v3, v4, :cond_3b

    .line 36
    .line 37
    sget-object v3, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->Z:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-array v0, v0, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string v5, "Unhandled state "

    .line 50
    .line 51
    aput-object v5, v0, v2

    .line 52
    .line 53
    aput-object v4, v0, v1

    .line 54
    .line 55
    invoke-static {v3, v0}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_130

    .line 59
    .line 60
    :cond_3b
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r:Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 87
    .line 88
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Lax/t3/j;->o(Landroid/content/Context;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const v1, 0x7f130137

    .line 96
    .line 97
    .line 98
    if-eqz v0, :cond_85

    .line 99
    .line 100
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 101
    .line 102
    new-instance v3, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, " : "

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->c()Ljava/lang/CharSequence;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    goto :goto_8a

    .line 134
    :cond_85
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 137
    .line 138
    .line 139
    :goto_8a
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_130

    .line 143
    .line 144
    :cond_8f
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 150
    .line 151
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->q:Landroid/graphics/drawable/Drawable;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 157
    .line 158
    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 166
    .line 167
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 171
    .line 172
    const v1, 0x7f13020f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_130

    .line 182
    .line 183
    :cond_b6
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 189
    .line 190
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->q:Landroid/graphics/drawable/Drawable;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 196
    .line 197
    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p:Landroid/view/View;

    .line 205
    .line 206
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 210
    .line 211
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 215
    .line 216
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W0()V

    .line 220
    .line 221
    .line 222
    goto :goto_130

    .line 223
    :cond_de
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p:Landroid/view/View;

    .line 224
    .line 225
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 231
    .line 232
    .line 233
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 234
    .line 235
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r:Landroid/graphics/drawable/Drawable;

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 241
    .line 242
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 250
    .line 251
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    .line 258
    .line 259
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 260
    .line 261
    .line 262
    goto :goto_130

    .line 263
    :cond_106
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p:Landroid/view/View;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 266
    .line 267
    .line 268
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 274
    .line 275
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r:Landroid/graphics/drawable/Drawable;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 281
    .line 282
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 287
    .line 288
    .line 289
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 290
    .line 291
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 300
    .line 301
    .line 302
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->U0()V

    .line 303
    .line 304
    .line 305
    :goto_130
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 306
    .line 307
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 308
    .line 309
    .line 310
    move-result-wide v3

    .line 311
    const-wide/16 v7, 0x20

    .line 312
    .line 313
    and-long/2addr v3, v7

    .line 314
    const-wide/16 v7, 0x0

    .line 315
    .line 316
    cmp-long v1, v3, v7

    .line 317
    .line 318
    if-nez v1, :cond_141

    .line 319
    .line 320
    const/4 v1, 0x4

    .line 321
    goto :goto_142

    .line 322
    :cond_141
    const/4 v1, 0x0

    .line 323
    :goto_142
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 324
    .line 325
    .line 326
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 327
    .line 328
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 329
    .line 330
    .line 331
    move-result-wide v3

    .line 332
    const-wide/16 v9, 0x10

    .line 333
    .line 334
    and-long/2addr v3, v9

    .line 335
    cmp-long p1, v3, v7

    .line 336
    .line 337
    if-nez p1, :cond_153

    .line 338
    .line 339
    const/4 v2, 0x4

    .line 340
    :cond_153
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 341
    .line 342
    .line 343
    return-void
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method static synthetic n0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G:J

    .line 2
    .line 3
    return-wide v0
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

.method private n1(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 4

    .line 1
    const-string v0, "__TRACK_COUNT__"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->f(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int p1, v0

    .line 8
    const/4 v0, 0x1

    .line 9
    if-gt p1, v0, :cond_22

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 18
    .line 19
    const/high16 v1, 0x3f000000    # 0.5f

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 41
    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic o0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J:Z

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

.method private o1()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j:Landroid/widget/SeekBar;

    .line 11
    .line 12
    long-to-int v3, v0

    .line 13
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->a1(J)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method static synthetic p0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;J)J
    .registers 3

    .line 1
    iput-wide p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I:J

    .line 2
    .line 3
    return-wide p1
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

.method private p1(Landroid/os/Bundle;)V
    .registers 6

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    goto :goto_3d

    .line 4
    :cond_3
    const-string v0, "file.manager.music.player.QUEUE_POSITION"

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v2, "file.manager.music.player.QUEUE_SIZE"

    .line 12
    .line 13
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-lez v0, :cond_3d

    .line 18
    .line 19
    if-lez p1, :cond_3d

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_3d

    .line 26
    .line 27
    invoke-virtual {p0}, Lax/n/c;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v2, 0x2

    .line 40
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    aput-object v0, v2, v3

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object p1, v2, v0

    .line 47
    .line 48
    const p1, 0x7f130371

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p1}, Lax/n/a;->H(Ljava/lang/CharSequence;)V

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
.end method

.method static synthetic q0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->S0()V

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
.end method

.method private q1(I)V
    .registers 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-ne p1, v3, :cond_14

    .line 7
    .line 8
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object v5, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->t:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {v4, v2}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    goto :goto_41

    .line 21
    :cond_14
    if-ne p1, v1, :cond_23

    .line 22
    .line 23
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Landroid/view/View;->setAlpha(F)V

    .line 33
    .line 34
    .line 35
    goto :goto_41

    .line 36
    :cond_23
    if-ne p1, v0, :cond_32

    .line 37
    .line 38
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 39
    .line 40
    iget-object v5, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->u:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Landroid/view/View;->setAlpha(F)V

    .line 48
    .line 49
    .line 50
    goto :goto_41

    .line 51
    :cond_32
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 59
    .line 60
    const v4, 0x3eb33333    # 0.35f

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 64
    .line 65
    .line 66
    :goto_41
    invoke-static {}, Lax/X2/Q;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_80

    .line 71
    .line 72
    if-ne p1, v3, :cond_56

    .line 73
    .line 74
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 75
    .line 76
    const v0, 0x7f13039c

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_56
    if-ne p1, v1, :cond_65

    .line 88
    .line 89
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 90
    .line 91
    const v0, 0x7f130398

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_65
    if-ne p1, v0, :cond_74

    .line 103
    .line 104
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 105
    .line 106
    const v0, 0x7f13039a

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_74
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 118
    .line 119
    const v0, 0x7f130399

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    :cond_80
    return-void
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

.method static synthetic r0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->h1(Landroid/support/v4/media/MediaMetadataCompat;)V

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

.method private r1(I)V
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_b

    .line 3
    .line 4
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 5
    .line 6
    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 9
    .line 10
    .line 11
    goto :goto_13

    .line 12
    :cond_b
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    const v2, 0x3eb33333    # 0.35f

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    :goto_13
    invoke-static {}, Lax/X2/Q;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_34

    .line 25
    .line 26
    if-ne p1, v0, :cond_28

    .line 27
    .line 28
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 29
    .line 30
    const v0, 0x7f1303dc

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 42
    .line 43
    const v0, 0x7f1303db

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p1, v0}, Lax/h3/a;->a(Landroid/widget/ImageView;Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    :cond_34
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic s0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n1(Landroid/support/v4/media/MediaMetadataCompat;)V

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

.method private s1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x:Landroidx/appcompat/widget/MySpinner;

    .line 2
    .line 3
    iget v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->M:F

    .line 4
    .line 5
    invoke-static {v1}, Lcom/voxdon/xplorer/viewer/d;->c(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method static synthetic t0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p1(Landroid/os/Bundle;)V

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

.method static synthetic u0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->q1(I)V

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

.method static synthetic v0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r1(I)V

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

.method static synthetic w0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/MediaBrowserCompat;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F:Landroid/support/v4/media/MediaBrowserCompat;

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

.method private x0(J)J
    .registers 8

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iget-wide p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G:J

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v4, p1, v2

    .line 9
    .line 10
    if-gez v4, :cond_c

    .line 11
    .line 12
    move-wide p1, v2

    .line 13
    :cond_c
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-gez v4, :cond_11

    .line 16
    .line 17
    return-wide v2

    .line 18
    :cond_11
    cmp-long v2, v0, p1

    .line 19
    .line 20
    if-lez v2, :cond_16

    .line 21
    .line 22
    return-wide p1

    .line 23
    :cond_16
    return-wide v0
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

.method private y0()Z
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->R:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1e

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    goto :goto_1e

    .line 13
    :cond_c
    iget-wide v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->G:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v0, v2, v4

    .line 18
    .line 19
    if-eqz v0, :cond_1e

    .line 20
    .line 21
    iget-wide v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H:J

    .line 22
    .line 23
    const-wide/16 v4, -0x1

    .line 24
    .line 25
    cmp-long v0, v2, v4

    .line 26
    .line 27
    if-eqz v0, :cond_1e

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1e
    :goto_1e
    return v1
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

.method private z0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method


# virtual methods
.method public D0(ILandroid/view/KeyEvent;)Z
    .registers 8

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N0(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    const/16 v3, 0x5a

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne p1, v3, :cond_1f

    .line 27
    .line 28
    invoke-direct {p0, v4}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E0(Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_65

    .line 32
    :cond_1f
    const/16 v3, 0x59

    .line 33
    .line 34
    if-ne p1, v3, :cond_27

    .line 35
    .line 36
    invoke-direct {p0, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->E0(Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_65

    .line 40
    :cond_27
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_65

    .line 45
    .line 46
    const/16 p2, 0x4f

    .line 47
    .line 48
    if-eq p1, p2, :cond_62

    .line 49
    .line 50
    const/16 p2, 0x55

    .line 51
    .line 52
    if-eq p1, p2, :cond_62

    .line 53
    .line 54
    const/16 p2, 0x57

    .line 55
    .line 56
    if-eq p1, p2, :cond_58

    .line 57
    .line 58
    const/16 p2, 0x58

    .line 59
    .line 60
    if-eq p1, p2, :cond_4e

    .line 61
    .line 62
    const/16 p2, 0x7e

    .line 63
    .line 64
    if-eq p1, p2, :cond_4a

    .line 65
    .line 66
    const/16 p2, 0x7f

    .line 67
    .line 68
    if-eq p1, p2, :cond_46

    .line 69
    .line 70
    goto :goto_65

    .line 71
    :cond_46
    invoke-direct {p0, v0, v4, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C0(Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V

    .line 72
    .line 73
    .line 74
    goto :goto_65

    .line 75
    :cond_4a
    invoke-direct {p0, v0, v1, v4}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C0(Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V

    .line 76
    .line 77
    .line 78
    goto :goto_65

    .line 79
    :cond_4e
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A0()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_65

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->j()V

    .line 86
    .line 87
    .line 88
    goto :goto_65

    .line 89
    :cond_58
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z0()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_65

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat$e;->i()V

    .line 96
    .line 97
    .line 98
    goto :goto_65

    .line 99
    :cond_62
    invoke-direct {p0, v0, v1, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C0(Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V

    .line 100
    .line 101
    .line 102
    :cond_65
    :goto_65
    return v4
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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->S:Lax/d3/C0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/d3/C0;->v(Landroid/content/res/Configuration;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lax/n/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .registers 6

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0d001f

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lax/n/c;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->L0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_23

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lax/n/a;->x(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lax/n/c;->getSupportActionBar()Lax/n/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, ""

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lax/n/a;->H(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    const v0, 0x7f0a0365

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->b:Landroid/view/View;

    .line 44
    .line 45
    const v0, 0x7f0a0078

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/widget/ImageView;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v:Landroid/widget/ImageView;

    .line 55
    .line 56
    const v0, 0x7f0a016e

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroid/widget/TextView;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w:Landroid/widget/TextView;

    .line 66
    .line 67
    const v0, 0x7f0801d2

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->q:Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    const v0, 0x7f0801da

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r:Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    const v0, 0x7f0801e3

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s:Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    const v0, 0x7f0801e4

    .line 95
    .line 96
    .line 97
    invoke-static {p0, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->t:Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    const v0, 0x7f0801dd

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->u:Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    const v0, 0x7f0a038a

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroid/widget/ImageView;

    .line 120
    .line 121
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g:Landroid/widget/ImageView;

    .line 122
    .line 123
    const v0, 0x7f0a0333

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Landroid/widget/ImageView;

    .line 131
    .line 132
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->f:Landroid/widget/ImageView;

    .line 133
    .line 134
    const v0, 0x7f0a0396

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Landroid/widget/ImageView;

    .line 142
    .line 143
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e:Landroid/widget/ImageView;

    .line 144
    .line 145
    const v0, 0x7f0a040d

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Landroid/widget/ImageView;

    .line 153
    .line 154
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->c:Landroid/widget/ImageView;

    .line 155
    .line 156
    const v0, 0x7f0a03ac

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Landroid/widget/ImageView;

    .line 164
    .line 165
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d:Landroid/widget/ImageView;

    .line 166
    .line 167
    const v0, 0x7f0a043d

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Landroid/widget/TextView;

    .line 175
    .line 176
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->h:Landroid/widget/TextView;

    .line 177
    .line 178
    const v0, 0x7f0a0187

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Landroid/widget/TextView;

    .line 186
    .line 187
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->i:Landroid/widget/TextView;

    .line 188
    .line 189
    const v0, 0x7f0a03d6

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Landroid/widget/SeekBar;

    .line 197
    .line 198
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j:Landroid/widget/SeekBar;

    .line 199
    .line 200
    const v0, 0x7f0a028f

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Landroid/widget/TextView;

    .line 208
    .line 209
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->k:Landroid/widget/TextView;

    .line 210
    .line 211
    const v0, 0x7f0a0290

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Landroid/widget/TextView;

    .line 219
    .line 220
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->l:Landroid/widget/TextView;

    .line 221
    .line 222
    const v0, 0x7f0a0291

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Landroid/widget/TextView;

    .line 230
    .line 231
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->m:Landroid/widget/TextView;

    .line 232
    .line 233
    const v0, 0x7f0a0292

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Landroid/widget/TextView;

    .line 241
    .line 242
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->n:Landroid/widget/TextView;

    .line 243
    .line 244
    const v0, 0x7f0a03b3

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->B:Landroid/view/View;

    .line 252
    .line 253
    const v0, 0x7f0a01d9

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->C:Landroid/view/View;

    .line 261
    .line 262
    const v0, 0x7f0a0399

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Landroid/widget/ProgressBar;

    .line 270
    .line 271
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->o:Landroid/widget/ProgressBar;

    .line 272
    .line 273
    const v0, 0x7f0a0115

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->p:Landroid/view/View;

    .line 281
    .line 282
    const v0, 0x7f0a0129

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Landroidx/appcompat/widget/MySpinner;

    .line 290
    .line 291
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x:Landroidx/appcompat/widget/MySpinner;

    .line 292
    .line 293
    const v2, 0x7f130376

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setPromptId(I)V

    .line 297
    .line 298
    .line 299
    const v0, 0x7f0a010f

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->y:Landroid/view/View;

    .line 307
    .line 308
    const v0, 0x7f0a012b

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Landroid/widget/ImageView;

    .line 316
    .line 317
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->z:Landroid/widget/ImageView;

    .line 318
    .line 319
    const v0, 0x7f0a00ea

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, v0}, Lax/n/c;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Landroid/widget/TextView;

    .line 327
    .line 328
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->A:Landroid/widget/TextView;

    .line 329
    .line 330
    invoke-static {}, Lax/X2/Q;->R()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_155

    .line 335
    .line 336
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->x:Landroidx/appcompat/widget/MySpinner;

    .line 337
    .line 338
    const/4 v2, 0x4

    .line 339
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 340
    .line 341
    .line 342
    :cond_155
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J0()V

    .line 343
    .line 344
    .line 345
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->K0()V

    .line 346
    .line 347
    .line 348
    if-nez p1, :cond_164

    .line 349
    .line 350
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->i1(Landroid/content/Intent;)V

    .line 355
    .line 356
    .line 357
    :cond_164
    new-instance p1, Landroid/support/v4/media/MediaBrowserCompat;

    .line 358
    .line 359
    new-instance v0, Landroid/content/ComponentName;

    .line 360
    .line 361
    const-class v2, Lcom/example/android/uamp/MusicService;

    .line 362
    .line 363
    invoke-direct {v0, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 364
    .line 365
    .line 366
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X:Landroid/support/v4/media/MediaBrowserCompat$c;

    .line 367
    .line 368
    const/4 v3, 0x0

    .line 369
    invoke-direct {p1, p0, v0, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$c;Landroid/os/Bundle;)V

    .line 370
    .line 371
    .line 372
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F:Landroid/support/v4/media/MediaBrowserCompat;

    .line 373
    .line 374
    new-instance p1, Lax/d3/C0;

    .line 375
    .line 376
    invoke-direct {p1, p0}, Lax/d3/C0;-><init>(Lax/n/c;)V

    .line 377
    .line 378
    .line 379
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->S:Lax/d3/C0;

    .line 380
    .line 381
    invoke-virtual {p1, v3}, Lax/d3/C0;->m(Landroid/content/res/Configuration;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    const-string v0, "extra_temp_file_path"

    .line 389
    .line 390
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    const-string v2, "extra_temp_file_type"

    .line 399
    .line 400
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->U:Ljava/lang/String;

    .line 405
    .line 406
    if-eqz p1, :cond_1b8

    .line 407
    .line 408
    invoke-static {p0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 409
    .line 410
    .line 411
    new-instance v0, Ljava/io/File;

    .line 412
    .line 413
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_1ab

    .line 421
    .line 422
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 423
    .line 424
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->V0(Ljava/io/File;)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_1ab
    const p1, 0x7f13013e

    .line 429
    .line 430
    .line 431
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 439
    .line 440
    .line 441
    :cond_1b8
    return-void
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/n/c;->getMenuInflater()Landroid/view/MenuInflater;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f0f0013

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onDestroy()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/n/c;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->e1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 13
    .line 14
    if-eqz v0, :cond_25

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1c

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat$e;->k()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->V:Z

    .line 30
    .line 31
    if-nez v0, :cond_25

    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 36
    .line 37
    .line 38
    :cond_25
    return-void
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

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->D0(ILandroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lax/n/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_f
    :goto_f
    const/4 p1, 0x1

    .line 17
    return p1
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

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 6

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f130137

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    sparse-switch v0, :sswitch_data_58

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :sswitch_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->d1()V

    .line 18
    .line 19
    .line 20
    return v2

    .line 21
    :sswitch_14
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->T:Ljava/io/File;

    .line 22
    .line 23
    if-eqz p1, :cond_27

    .line 24
    .line 25
    iput-boolean v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->V:Z

    .line 26
    .line 27
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->U:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0, p1, v0}, Lax/c3/u;->s0(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 37
    .line 38
    .line 39
    goto :goto_2e

    .line 40
    :cond_27
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 45
    .line 46
    .line 47
    :goto_2e
    return v2

    .line 48
    :sswitch_2f
    new-instance p1, Landroid/content/Intent;

    .line 49
    .line 50
    const-string v0, "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lax/R4/e;->J()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_45

    .line 60
    .line 61
    const-string v0, "android.media.extra.AUDIO_SESSION"

    .line 62
    .line 63
    invoke-static {}, Lax/R4/e;->J()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    :cond_45
    const/16 v0, 0x3fc

    .line 71
    .line 72
    :try_start_47
    invoke-static {p0, p1, v0}, Lax/c3/u;->q0(Landroid/app/Activity;Landroid/content/Intent;I)V
    :try_end_4a
    .catch Landroid/content/ActivityNotFoundException; {:try_start_47 .. :try_end_4a} :catch_4b
    .catch Ljava/lang/SecurityException; {:try_start_47 .. :try_end_4a} :catch_4b

    .line 73
    .line 74
    .line 75
    goto :goto_52

    .line 76
    :catch_4b
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 81
    .line 82
    .line 83
    :goto_52
    return v2

    .line 84
    :sswitch_53
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 85
    .line 86
    .line 87
    return v2

    .line 88
    nop

    .line 89
    :sswitch_data_58
    .sparse-switch
        0x102002c -> :sswitch_53
        0x7f0a02cf -> :sswitch_2f
        0x7f0a02e8 -> :sswitch_14
        0x7f0a02f1 -> :sswitch_10
    .end sparse-switch
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

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .registers 8

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_b

    .line 9
    .line 10
    :goto_9
    const/4 v0, 0x1

    .line 11
    goto :goto_1c

    .line 12
    :cond_b
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_9

    .line 19
    :cond_12
    const-string v3, "__SOURCE__"

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_1b

    .line 26
    .line 27
    goto :goto_9

    .line 28
    :cond_1b
    const/4 v0, 0x0

    .line 29
    :goto_1c
    const v4, 0x7f0a02f1

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_42

    .line 37
    .line 38
    if-eqz v0, :cond_2b

    .line 39
    .line 40
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    goto :goto_42

    .line 44
    :cond_2b
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P0()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_35

    .line 49
    .line 50
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 51
    .line 52
    .line 53
    goto :goto_42

    .line 54
    :cond_35
    invoke-static {v3}, Lax/Q4/b;->m(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3f

    .line 59
    .line 60
    invoke-interface {v4, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    goto :goto_42

    .line 64
    :cond_3f
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 65
    .line 66
    .line 67
    :cond_42
    :goto_42
    const v3, 0x7f0a02cf

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-eqz v3, :cond_73

    .line 75
    .line 76
    new-instance v4, Landroid/content/Intent;

    .line 77
    .line 78
    const-string v5, "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"

    .line 79
    .line 80
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    if-eqz v0, :cond_58

    .line 84
    .line 85
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 86
    .line 87
    .line 88
    goto :goto_73

    .line 89
    :cond_58
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P0()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_62

    .line 94
    .line 95
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 96
    .line 97
    .line 98
    goto :goto_73

    .line 99
    :cond_62
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, v5}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-eqz v4, :cond_70

    .line 108
    .line 109
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 110
    .line 111
    .line 112
    goto :goto_73

    .line 113
    :cond_70
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 114
    .line 115
    .line 116
    :cond_73
    :goto_73
    const v3, 0x7f0a02e8

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_8f

    .line 124
    .line 125
    if-eqz v0, :cond_82

    .line 126
    .line 127
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 128
    .line 129
    .line 130
    goto :goto_8f

    .line 131
    :cond_82
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->P0()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8c

    .line 136
    .line 137
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 138
    .line 139
    .line 140
    goto :goto_8f

    .line 141
    :cond_8c
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 142
    .line 143
    .line 144
    :cond_8f
    :goto_8f
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    return p1
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
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
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public onStart()V
    .registers 4

    .line 1
    invoke-super {p0}, Lax/n/c;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F:Landroid/support/v4/media/MediaBrowserCompat;

    .line 5
    .line 6
    if-eqz v0, :cond_3c

    .line 7
    .line 8
    :try_start_7
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->a()V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    goto :goto_3c

    .line 12
    :catch_b
    move-exception v0

    .line 13
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "MEDIA BROWSER CONNECT IN FULL PLAYER"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "connected:"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F:Landroid/support/v4/media/MediaBrowserCompat;

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/support/v4/media/MediaBrowserCompat;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 59
    .line 60
    .line 61
    :cond_3c
    :goto_3c
    invoke-static {}, Lax/X2/Q;->N1()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_52

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/high16 v1, -0x1000000

    .line 72
    .line 73
    invoke-static {v0, v1}, Lax/X2/v;->s(Landroid/view/Window;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0, v1}, Lax/X2/v;->r(Landroid/view/Window;I)V

    .line 81
    .line 82
    .line 83
    :cond_52
    return-void
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

.method public onStop()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/n/c;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->F:Landroid/support/v4/media/MediaBrowserCompat;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat;->b()V

    .line 9
    .line 10
    .line 11
    :cond_a
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_19

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method public t(II)V
    .registers 3

    .line 1
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->j1(I)V

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
