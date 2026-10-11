.class public Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# static fields
.field private static final x0:Ljava/lang/String;


# instance fields
.field private d0:Landroid/view/View;

.field private e0:Landroid/view/View;

.field private f0:Landroid/widget/ImageButton;

.field private g0:Landroid/widget/ImageButton;

.field private h0:Landroid/widget/TextView;

.field private i0:Landroid/widget/TextView;

.field private j0:Landroid/widget/TextView;

.field private k0:Landroid/widget/ImageView;

.field private l0:Landroid/view/View;

.field private m0:Ljava/lang/String;

.field private n0:Landroid/widget/ProgressBar;

.field private o0:Landroid/support/v4/media/session/PlaybackStateCompat;

.field private final p0:Landroid/os/Handler;

.field private final q0:Ljava/util/concurrent/ScheduledExecutorService;

.field private r0:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private s0:Z

.field private final t0:Landroid/support/v4/media/session/MediaControllerCompat$a;

.field private final u0:Landroid/view/View$OnClickListener;

.field private final v0:Landroid/view/View$OnClickListener;

.field private final w0:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

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
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->p0:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->q0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$a;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->t0:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 27
    .line 28
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$d;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$d;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->u0:Landroid/view/View$OnClickListener;

    .line 34
    .line 35
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$e;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$e;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->v0:Landroid/view/View$OnClickListener;

    .line 41
    .line 42
    new-instance v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$f;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$f;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->w0:Ljava/lang/Runnable;

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

.method static synthetic K2()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

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

.method static synthetic L2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;Landroid/support/v4/media/session/PlaybackStateCompat;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->Y2(Landroid/support/v4/media/session/PlaybackStateCompat;Z)V

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

.method static synthetic M2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->p0:Landroid/os/Handler;

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

.method static synthetic N2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->X2(Landroid/support/v4/media/MediaMetadataCompat;)V

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

.method static synthetic O2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->d3()V

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

.method static synthetic P2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->m0:Ljava/lang/String;

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

.method static synthetic Q2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

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

.method static synthetic R2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->b3()V

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

.method static synthetic S2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->a3()V

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

.method static synthetic T2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->g3()V

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

.method static synthetic U2(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)Ljava/lang/Runnable;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->w0:Ljava/lang/Runnable;

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

.method private X2(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 6

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "onMetadataChanged "

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object p1, v1, v2

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_20

    .line 22
    .line 23
    new-array p1, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v1, "onMetadataChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring."

    .line 26
    .line 27
    aput-object v1, p1, v3

    .line 28
    .line 29
    invoke-static {v0, p1}, Lax/S4/b;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-nez p1, :cond_24

    .line 34
    .line 35
    goto/16 :goto_b1

    .line 36
    .line 37
    :cond_24
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 38
    .line 39
    if-eqz v0, :cond_31

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_31

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->h3()V

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-static {p1}, Lax/P4/k;->b(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->h0:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->d0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4f

    .line 70
    .line 71
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->d0:Landroid/view/View;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->i0:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f3(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->g3()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const/4 v1, 0x0

    .line 100
    if-eqz p1, :cond_6e

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    goto :goto_6f

    .line 111
    :cond_6e
    move-object p1, v1

    .line 112
    :goto_6f
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->m0:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_b1

    .line 119
    .line 120
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->m0:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->c()Landroid/graphics/Bitmap;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {}, Lax/P4/a;->i()Lax/P4/a;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-nez v0, :cond_89

    .line 131
    .line 132
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->m0:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Lax/P4/a;->j(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_89
    if-eqz v0, :cond_91

    .line 139
    .line 140
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_91
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 149
    .line 150
    .line 151
    if-nez p1, :cond_a1

    .line 152
    .line 153
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

    .line 154
    .line 155
    const v0, 0x7f080192

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_a1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v1, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$c;

    .line 171
    .line 172
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$c;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0, p1, v1}, Lax/P4/a;->f(Landroid/content/Context;Ljava/lang/String;Lax/P4/a$a;)V

    .line 176
    .line 177
    .line 178
    :cond_b1
    :goto_b1
    return-void
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

.method private Y2(Landroid/support/v4/media/session/PlaybackStateCompat;Z)V
    .registers 10

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "onPlaybackStateChanged "

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aput-object p1, v2, v3

    .line 13
    .line 14
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_20

    .line 22
    .line 23
    new-array p1, v3, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string p2, "onPlaybackStateChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring."

    .line 26
    .line 27
    aput-object p2, p1, v4

    .line 28
    .line 29
    invoke-static {v0, p1}, Lax/S4/b;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-nez p1, :cond_23

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_fa

    .line 43
    .line 44
    const/16 v5, 0x8

    .line 45
    .line 46
    if-eq v2, v3, :cond_ee

    .line 47
    .line 48
    if-eq v2, v1, :cond_ee

    .line 49
    .line 50
    const/4 v6, 0x3

    .line 51
    if-eq v2, v6, :cond_c9

    .line 52
    .line 53
    const/4 v6, 0x6

    .line 54
    if-eq v2, v6, :cond_c0

    .line 55
    .line 56
    const/4 v6, 0x7

    .line 57
    if-eq v2, v6, :cond_44

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_d1

    .line 68
    .line 69
    :cond_44
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->c()Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-array v1, v1, [Ljava/lang/Object;

    .line 74
    .line 75
    const-string v6, "error playbackstate: "

    .line 76
    .line 77
    aput-object v6, v1, v4

    .line 78
    .line 79
    aput-object v2, v1, v3

    .line 80
    .line 81
    invoke-static {v0, v1}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    if-nez p2, :cond_b7

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->d()Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    if-eqz p2, :cond_87

    .line 91
    .line 92
    const-string v0, "SUB_ERROR_CODE"

    .line 93
    .line 94
    invoke-virtual {p2, v0, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const/16 v1, 0xfa5

    .line 99
    .line 100
    if-ne v0, v1, :cond_87

    .line 101
    .line 102
    const-string v0, "SUB_ERROR_MSG"

    .line 103
    .line 104
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-eqz p2, :cond_87

    .line 109
    .line 110
    invoke-static {p2}, Lax/P2/a;->q(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_87

    .line 115
    .line 116
    new-instance p1, Landroid/content/Intent;

    .line 117
    .line 118
    const-string v0, "local.intent.action.SHOW_CODEC_DOWNLOAD"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v0, "mimetype"

    .line 124
    .line 125
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2, p1}, Lax/u3/g;->e(Landroid/content/Intent;)V

    .line 133
    .line 134
    .line 135
    goto :goto_b7

    .line 136
    :cond_87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-eqz p2, :cond_99

    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    const v0, 0x1020002

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    goto :goto_9a

    .line 154
    :cond_99
    const/4 p2, 0x0

    .line 155
    :goto_9a
    if-eqz p2, :cond_a8

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->c()Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p2, p1, v4}, Lax/u3/B;->T(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/Snackbar;->a0()V

    .line 166
    .line 167
    .line 168
    goto :goto_b7

    .line 169
    :cond_a8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->c()Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p2, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 182
    .line 183
    .line 184
    :cond_b7
    :goto_b7
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 187
    .line 188
    .line 189
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 190
    .line 191
    .line 192
    goto :goto_100

    .line 193
    :cond_c0
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 197
    .line 198
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_d1

    .line 202
    :cond_c9
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 203
    .line 204
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->c3()V

    .line 208
    .line 209
    .line 210
    :goto_d1
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 211
    .line 212
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    const v0, 0x7f0801d2

    .line 217
    .line 218
    .line 219
    invoke-static {p2, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 227
    .line 228
    const p2, 0x7f130374

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_ee
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 240
    .line 241
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->Z2()V

    .line 245
    .line 246
    .line 247
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 248
    .line 249
    .line 250
    goto :goto_100

    .line 251
    :cond_fa
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->Z2()V

    .line 252
    .line 253
    .line 254
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->h3()V

    .line 255
    .line 256
    .line 257
    :goto_100
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 258
    .line 259
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    const v0, 0x7f0801da

    .line 264
    .line 265
    .line 266
    invoke-static {p2, v0}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 271
    .line 272
    .line 273
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 274
    .line 275
    const p2, 0x7f130375

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    return-void
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
.end method

.method private Z2()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->p0:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->w0:Ljava/lang/Runnable;

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

.method private a3()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_16

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat$e;->a()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 21
    .line 22
    .line 23
    :cond_16
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "menu_music_player"

    .line 28
    .line 29
    const-string v2, "pause"

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "loc"

    .line 36
    .line 37
    const-string v2, "playback_control"

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private b3()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_16

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat$e;->b()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->c3()V

    .line 21
    .line 22
    .line 23
    :cond_16
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "menu_music_player"

    .line 28
    .line 29
    const-string v2, "play"

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "loc"

    .line 36
    .line 37
    const-string v2, "playback_control"

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private c3()V
    .registers 9

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->q0:Ljava/util/concurrent/ScheduledExecutorService;

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
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->q0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    new-instance v2, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$g;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$g;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

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
    iput-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->r0:Ljava/util/concurrent/ScheduledFuture;

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

.method private d3()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 6
    .line 7
    new-instance v1, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-class v3, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    const/high16 v2, 0x20000000

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_4a

    .line 28
    .line 29
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "MediaController NULL!!"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->n0()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, ":"

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->l0()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4a
    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_59

    .line 80
    .line 81
    :try_start_50
    const-string v2, "com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION"

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_59
    .catch Ljava/lang/RuntimeException; {:try_start_50 .. :try_end_59} :catch_59

    .line 88
    .line 89
    .line 90
    :catch_59
    :cond_59
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->F2(Landroid/content/Intent;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "menu_music_player"

    .line 98
    .line 99
    const-string v2, "fullscreen"

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 106
    .line 107
    .line 108
    return-void
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

.method private e3()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->r0:Ljava/util/concurrent/ScheduledFuture;

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

.method private f3(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 6

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

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
    long-to-int p1, v0

    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->n0:Landroid/widget/ProgressBar;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method private g3()V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->i()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_3b

    .line 17
    .line 18
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x2

    .line 25
    if-eq v2, v3, :cond_3b

    .line 26
    .line 27
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v2, v3, :cond_3b

    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-object v4, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat;->e()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    sub-long/2addr v2, v4

    .line 47
    long-to-float v0, v0

    .line 48
    long-to-int v1, v2

    .line 49
    int-to-float v1, v1

    .line 50
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->o0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->f()F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    mul-float v1, v1, v2

    .line 57
    .line 58
    add-float/2addr v0, v1

    .line 59
    float-to-long v0, v0

    .line 60
    :cond_3b
    iget-object v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->n0:Landroid/widget/ProgressBar;

    .line 61
    .line 62
    long-to-int v1, v0

    .line 63
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 64
    .line 65
    .line 66
    return-void
    .line 67
    .line 68
.end method

.method private h3()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_34

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_34

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat;->e()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_34

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_34

    .line 45
    .line 46
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 54
    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public J1()V
    .registers 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->J1()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "fragment.onStart"

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1f

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->V2(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public K1()V
    .registers 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->K1()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "fragment.onStop"

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->f0()Landroid/support/v4/media/session/MediaControllerCompat;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1f

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->W2(Landroid/support/v4/media/session/MediaControllerCompat;)V

    .line 30
    .line 31
    .line 32
    :cond_1f
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public V2(Landroid/support/v4/media/session/MediaControllerCompat;)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->x0:Ljava/lang/String;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez p1, :cond_8

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v3, 0x0

    .line 10
    :goto_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x2

    .line 15
    new-array v4, v4, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v5, "onConnected, mediaController==null? "

    .line 18
    .line 19
    aput-object v5, v4, v0

    .line 20
    .line 21
    aput-object v3, v4, v2

    .line 22
    .line 23
    invoke-static {v1, v4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_4a

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->X2(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p0, v0, v2}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->Y2(Landroid/support/v4/media/session/PlaybackStateCompat;Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->t0:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->s0:Z

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->g3()V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_4a

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v1, 0x3

    .line 63
    if-eq v0, v1, :cond_47

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/4 v0, 0x6

    .line 70
    if-ne p1, v0, :cond_4a

    .line 71
    .line 72
    :cond_47
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->c3()V

    .line 73
    .line 74
    .line 75
    :cond_4a
    return-void
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

.method public W2(Landroid/support/v4/media/session/MediaControllerCompat;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->s0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->t0:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->s0:Z

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public r1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 5

    .line 1
    const p3, 0x7f0d009c

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->d0:Landroid/view/View;

    .line 10
    .line 11
    const p2, 0x7f0a04ad

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e0:Landroid/view/View;

    .line 19
    .line 20
    const p2, 0x7f0a038a

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Landroid/widget/ImageButton;

    .line 28
    .line 29
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 30
    .line 31
    const/4 p3, 0x1

    .line 32
    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->f0:Landroid/widget/ImageButton;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->v0:Landroid/view/View$OnClickListener;

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    .line 42
    const p2, 0x7f0a0454

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Landroid/widget/ImageButton;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->g0:Landroid/widget/ImageButton;

    .line 52
    .line 53
    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->g0:Landroid/widget/ImageButton;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->u0:Landroid/view/View$OnClickListener;

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    const p2, 0x7f0a0493

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Landroid/widget/TextView;

    .line 71
    .line 72
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->h0:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 75
    .line 76
    .line 77
    const p2, 0x7f0a006d

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Landroid/widget/TextView;

    .line 85
    .line 86
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->i0:Landroid/widget/TextView;

    .line 87
    .line 88
    const p2, 0x7f0a01d7

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Landroid/widget/TextView;

    .line 96
    .line 97
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->j0:Landroid/widget/TextView;

    .line 98
    .line 99
    const p2, 0x7f0a0055

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Landroid/widget/ImageView;

    .line 107
    .line 108
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

    .line 109
    .line 110
    const p2, 0x7f0a038b

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Landroid/widget/ProgressBar;

    .line 118
    .line 119
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->n0:Landroid/widget/ProgressBar;

    .line 120
    .line 121
    const p2, 0x7f0a0398

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    iput-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->l0:Landroid/view/View;

    .line 129
    .line 130
    iget-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->k0:Landroid/widget/ImageView;

    .line 131
    .line 132
    const p3, 0x7f080192

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 136
    .line 137
    .line 138
    iget-object p2, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e0:Landroid/view/View;

    .line 139
    .line 140
    new-instance p3, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$b;

    .line 141
    .line 142
    invoke-direct {p3, p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment$b;-><init>(Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    return-object p1
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

.method public s1()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->s1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->e3()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/PlaybackControlsFragment;->q0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

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
