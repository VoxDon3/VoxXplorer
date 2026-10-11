.class public Lax/P4/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static final s:Ljava/lang/String;


# instance fields
.field private final a:Lcom/example/android/uamp/MusicService;

.field private b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field private c:Landroid/support/v4/media/session/MediaControllerCompat;

.field private d:Landroid/support/v4/media/session/MediaControllerCompat$e;

.field private e:Landroid/support/v4/media/session/PlaybackStateCompat;

.field private f:Landroid/support/v4/media/MediaMetadataCompat;

.field private final g:Lax/P/p;

.field private h:Landroid/app/PendingIntent;

.field private i:Landroid/app/PendingIntent;

.field private j:Landroid/app/PendingIntent;

.field private k:Landroid/app/PendingIntent;

.field private l:Landroid/app/PendingIntent;

.field private m:Landroid/app/PendingIntent;

.field private n:Landroid/app/PendingIntent;

.field private o:Z

.field private p:Z

.field private q:Z

.field private final r:Landroid/support/v4/media/session/MediaControllerCompat$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/P4/d;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/P4/d;->s:Ljava/lang/String;

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

.method public constructor <init>(Lcom/example/android/uamp/MusicService;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/P4/d;->p:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lax/P4/d;->q:Z

    .line 8
    .line 9
    new-instance v0, Lax/P4/d$a;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lax/P4/d$a;-><init>(Lax/P4/d;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/P4/d;->r:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 15
    .line 16
    iput-object p1, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 17
    .line 18
    invoke-direct {p0}, Lax/P4/d;->v()V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lax/P/p;->d(Landroid/content/Context;)Lax/P/p;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lax/P4/d;->g:Lax/P/p;

    .line 26
    .line 27
    const/16 v0, 0x19c

    .line 28
    .line 29
    :try_start_1c
    invoke-virtual {p1, v0}, Lax/P/p;->b(I)V
    :try_end_1f
    .catch Ljava/lang/SecurityException; {:try_start_1c .. :try_end_1f} :catch_1f

    .line 30
    .line 31
    .line 32
    :catch_1f
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

.method static synthetic a(Lax/P4/d;Landroid/support/v4/media/session/PlaybackStateCompat;)Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic b()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lax/P4/d;->s:Ljava/lang/String;

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

.method static synthetic c(Lax/P4/d;Z)Landroid/app/Notification;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/P4/d;->j(Z)Landroid/app/Notification;

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

.method static synthetic d(Lax/P4/d;)Lax/P/p;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P4/d;->g:Lax/P/p;

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

.method static synthetic e(Lax/P4/d;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

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

.method static synthetic f(Lax/P4/d;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic g(Lax/P4/d;)V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/P4/d;->v()V

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

.method private h(Lax/P/l$d;)V
    .registers 6

    .line 1
    sget-object v0, Lax/P4/d;->s:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "updatePlayPauseAction"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 15
    .line 16
    if-eqz v0, :cond_25

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x3

    .line 23
    if-ne v0, v1, :cond_25

    .line 24
    .line 25
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 26
    .line 27
    sget v1, Lax/P4/i;->f:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget v1, Lax/P4/h;->d:I

    .line 34
    .line 35
    iget-object v2, p0, Lax/P4/d;->h:Landroid/app/PendingIntent;

    .line 36
    .line 37
    goto :goto_31

    .line 38
    :cond_25
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 39
    .line 40
    sget v1, Lax/P4/i;->g:I

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget v1, Lax/P4/h;->e:I

    .line 47
    .line 48
    iget-object v2, p0, Lax/P4/d;->i:Landroid/app/PendingIntent;

    .line 49
    .line 50
    :goto_31
    new-instance v3, Lax/P/l$a;

    .line 51
    .line 52
    invoke-direct {v3, v1, v0, v2}, Lax/P/l$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v3}, Lax/P/l$d;->b(Lax/P/l$a;)Lax/P/l$d;

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method private i(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/lang/String;)Landroid/app/PendingIntent;
    .registers 5

    .line 1
    new-instance p1, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v0, "com.example.android.uamp.open_ui"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    const/high16 v0, 0x20000000

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v0, "com.example.android.uamp.EXTRA_START_FULLSCREEN"

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_22

    .line 29
    .line 30
    const-string v0, "PLAY_FOLDER_URI"

    .line 31
    .line 32
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    :cond_22
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 v0, 0x1f

    .line 38
    .line 39
    if-lt p2, v0, :cond_2b

    .line 40
    .line 41
    const/high16 p2, 0x12000000

    .line 42
    .line 43
    goto :goto_2d

    .line 44
    :cond_2b
    const/high16 p2, 0x10000000

    .line 45
    .line 46
    :goto_2d
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 47
    .line 48
    const/16 v1, 0x64

    .line 49
    .line 50
    invoke-static {v0, v1, p1, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
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

.method private j(Z)Landroid/app/Notification;
    .registers 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lax/P4/d;->s:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "updateNotificationMetadata. mMetadata="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x1

    .line 25
    new-array v4, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    aput-object v2, v4, v5

    .line 29
    .line 30
    invoke-static {v0, v4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v1, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_185

    .line 37
    .line 38
    iget-object v0, v1, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 39
    .line 40
    if-nez v0, :cond_2b

    .line 41
    .line 42
    goto/16 :goto_185

    .line 43
    .line 44
    :cond_2b
    invoke-direct {v1}, Lax/P4/d;->n()V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lax/P/l$d;

    .line 48
    .line 49
    iget-object v4, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 50
    .line 51
    const-string v6, "music_player"

    .line 52
    .line 53
    invoke-direct {v0, v4, v6}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v1, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    const-wide/16 v8, 0x10

    .line 63
    .line 64
    and-long/2addr v6, v8

    .line 65
    const-wide/16 v8, 0x0

    .line 66
    .line 67
    cmp-long v4, v6, v8

    .line 68
    .line 69
    if-eqz v4, :cond_57

    .line 70
    .line 71
    sget v4, Lax/P4/h;->g:I

    .line 72
    .line 73
    iget-object v6, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 74
    .line 75
    sget v7, Lax/P4/i;->h:I

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    iget-object v7, v1, Lax/P4/d;->j:Landroid/app/PendingIntent;

    .line 82
    .line 83
    invoke-virtual {v0, v4, v6, v7}, Lax/P/l$d;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 84
    .line 85
    .line 86
    const/4 v4, 0x1

    .line 87
    goto :goto_58

    .line 88
    :cond_57
    const/4 v4, 0x0

    .line 89
    :goto_58
    iget-object v6, v1, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 90
    .line 91
    const/4 v7, 0x3

    .line 92
    if-eqz v6, :cond_65

    .line 93
    .line 94
    invoke-virtual {v6}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-ne v6, v7, :cond_65

    .line 99
    .line 100
    const/4 v6, 0x1

    .line 101
    goto :goto_66

    .line 102
    :cond_65
    const/4 v6, 0x0

    .line 103
    :goto_66
    invoke-direct {v1, v0}, Lax/P4/d;->h(Lax/P/l$d;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v10, v4, 0x1

    .line 107
    .line 108
    iget-object v11, v1, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 109
    .line 110
    invoke-virtual {v11}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 111
    .line 112
    .line 113
    move-result-wide v11

    .line 114
    const-wide/16 v13, 0x20

    .line 115
    .line 116
    and-long/2addr v11, v13

    .line 117
    const/4 v13, 0x2

    .line 118
    cmp-long v14, v11, v8

    .line 119
    .line 120
    if-eqz v14, :cond_8a

    .line 121
    .line 122
    sget v10, Lax/P4/h;->f:I

    .line 123
    .line 124
    iget-object v11, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 125
    .line 126
    sget v12, Lax/P4/i;->e:I

    .line 127
    .line 128
    invoke-virtual {v11, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    iget-object v12, v1, Lax/P4/d;->k:Landroid/app/PendingIntent;

    .line 133
    .line 134
    invoke-virtual {v0, v10, v11, v12}, Lax/P/l$d;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 135
    .line 136
    .line 137
    add-int/lit8 v10, v4, 0x2

    .line 138
    .line 139
    :cond_8a
    invoke-static {}, Lax/P4/b;->b()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_ad

    .line 144
    .line 145
    iget-object v4, v1, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 148
    .line 149
    .line 150
    move-result-wide v11

    .line 151
    const-wide/16 v14, 0x1

    .line 152
    .line 153
    and-long/2addr v11, v14

    .line 154
    cmp-long v4, v11, v8

    .line 155
    .line 156
    if-eqz v4, :cond_ad

    .line 157
    .line 158
    sget v4, Lax/P4/h;->h:I

    .line 159
    .line 160
    iget-object v8, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 161
    .line 162
    sget v9, Lax/P4/i;->i:I

    .line 163
    .line 164
    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    iget-object v9, v1, Lax/P4/d;->n:Landroid/app/PendingIntent;

    .line 169
    .line 170
    invoke-virtual {v0, v4, v8, v9}, Lax/P/l$d;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 171
    .line 172
    .line 173
    add-int/2addr v10, v3

    .line 174
    :cond_ad
    :try_start_ad
    iget-object v4, v1, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 175
    .line 176
    invoke-static {v4}, Lax/P4/k;->b(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    if-eqz v8, :cond_dd

    .line 185
    .line 186
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->d()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {}, Lax/P4/a;->i()Lax/P4/a;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-virtual {v9, v8}, Lax/P4/a;->j(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    if-nez v9, :cond_db

    .line 203
    .line 204
    iget-object v9, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 205
    .line 206
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    sget v11, Lax/P4/h;->a:I

    .line 211
    .line 212
    invoke-static {v9, v11}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    goto :goto_df

    .line 217
    :catch_d8
    move-exception v0

    .line 218
    goto/16 :goto_16e

    .line 219
    .line 220
    :cond_db
    move-object v8, v2

    .line 221
    goto :goto_df

    .line 222
    :cond_dd
    move-object v8, v2

    .line 223
    move-object v9, v8

    .line 224
    :goto_df
    if-ne v10, v3, :cond_e6

    .line 225
    .line 226
    filled-new-array {v5}, [I

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    goto :goto_f5

    .line 231
    :cond_e6
    if-ne v10, v13, :cond_ed

    .line 232
    .line 233
    filled-new-array {v5, v3}, [I

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    goto :goto_f5

    .line 238
    :cond_ed
    if-ne v10, v7, :cond_f4

    .line 239
    .line 240
    filled-new-array {v5, v3, v13}, [I

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    goto :goto_f5

    .line 245
    :cond_f4
    move-object v7, v2

    .line 246
    :goto_f5
    new-instance v10, Lax/N0/c;

    .line 247
    .line 248
    invoke-direct {v10}, Lax/N0/c;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10, v3}, Lax/N0/c;->k(Z)Lax/N0/c;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    iget-object v11, v1, Lax/P4/d;->m:Landroid/app/PendingIntent;

    .line 256
    .line 257
    invoke-virtual {v10, v11}, Lax/N0/c;->h(Landroid/app/PendingIntent;)Lax/N0/c;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    invoke-virtual {v10, v7}, Lax/N0/c;->j([I)Lax/N0/c;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    iget-object v10, v1, Lax/P4/d;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 266
    .line 267
    invoke-virtual {v7, v10}, Lax/N0/c;->i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lax/N0/c;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    invoke-virtual {v0, v7}, Lax/P/l$d;->w(Lax/P/l$f;)Lax/P/l$d;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    iget-object v10, v1, Lax/P4/d;->l:Landroid/app/PendingIntent;

    .line 276
    .line 277
    invoke-virtual {v7, v10}, Lax/P/l$d;->k(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    sget v10, Lax/P4/h;->c:I

    .line 282
    .line 283
    invoke-virtual {v7, v10}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-virtual {v7, v6}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v6, v3}, Lax/P/l$d;->u(Z)Lax/P/l$d;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-virtual {v6, v5}, Lax/P/l$d;->t(Z)Lax/P/l$d;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v5, v3}, Lax/P/l$d;->q(Z)Lax/P/l$d;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v5, v3}, Lax/P/l$d;->z(I)Lax/P/l$d;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-virtual {v5, v3}, Lax/P/l$d;->y(Z)Lax/P/l$d;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    iget-object v6, v1, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 312
    .line 313
    invoke-virtual {v6}, Landroid/support/v4/media/MediaMetadataCompat;->d()Landroid/os/Bundle;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    const-string v7, "__SOURCE_FOLDER__"

    .line 318
    .line 319
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    invoke-direct {v1, v4, v6}, Lax/P4/d;->i(Landroid/support/v4/media/MediaDescriptionCompat;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v5, v6}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->i()Ljava/lang/CharSequence;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    invoke-virtual {v5, v6}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/CharSequence;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-virtual {v5, v4}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 344
    .line 345
    .line 346
    if-eqz p1, :cond_15e

    .line 347
    .line 348
    invoke-virtual {v0, v9}, Lax/P/l$d;->n(Landroid/graphics/Bitmap;)Lax/P/l$d;

    .line 349
    .line 350
    .line 351
    :cond_15e
    invoke-virtual {v0, v3}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 352
    .line 353
    .line 354
    invoke-direct {v1, v0}, Lax/P4/d;->s(Lax/P/l$d;)V

    .line 355
    .line 356
    .line 357
    if-eqz v8, :cond_169

    .line 358
    .line 359
    invoke-direct {v1, v8, v0}, Lax/P4/d;->m(Ljava/lang/String;Lax/P/l$d;)V

    .line 360
    .line 361
    .line 362
    :cond_169
    invoke-virtual {v0}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 363
    .line 364
    .line 365
    move-result-object v0
    :try_end_16d
    .catch Ljava/lang/RuntimeException; {:try_start_ad .. :try_end_16d} :catch_d8

    .line 366
    return-object v0

    .line 367
    :goto_16e
    iget-object v3, v1, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 368
    .line 369
    invoke-static {v3}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const-string v4, "MEDIA NOTIFICATION ERROR"

    .line 378
    .line 379
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v3, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 388
    .line 389
    .line 390
    :cond_185
    :goto_185
    return-object v2
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

.method private k()Landroid/app/Notification;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    sget v1, Lax/P4/i;->j:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lax/P/l$d;

    .line 10
    .line 11
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 12
    .line 13
    const-string v3, "music_player"

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget v2, Lax/P4/h;->c:I

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v0}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, ""

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {v0, v2}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method private m(Ljava/lang/String;Lax/P/l$d;)V
    .registers 6

    .line 1
    invoke-static {}, Lax/P4/a;->i()Lax/P4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lax/P4/d$b;

    .line 12
    .line 13
    invoke-direct {v2, p0, p2}, Lax/P4/d$b;-><init>(Lax/P4/d;Lax/P/l$d;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p1, v2}, Lax/P4/a;->f(Landroid/content/Context;Ljava/lang/String;Lax/P4/a$a;)V

    .line 17
    .line 18
    .line 19
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

.method private n()V
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    goto/16 :goto_a1

    .line 6
    .line 7
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    if-lt v0, v1, :cond_f

    .line 12
    .line 13
    const/high16 v0, 0x12000000

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const/high16 v0, 0x10000000

    .line 17
    .line 18
    :goto_11
    :try_start_11
    iget-object v1, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 25
    .line 26
    new-instance v3, Landroid/content/Intent;

    .line 27
    .line 28
    const-string v4, "com.example.android.uamp.pause"

    .line 29
    .line 30
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/16 v4, 0x64

    .line 38
    .line 39
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, p0, Lax/P4/d;->h:Landroid/app/PendingIntent;

    .line 44
    .line 45
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 46
    .line 47
    new-instance v3, Landroid/content/Intent;

    .line 48
    .line 49
    const-string v5, "com.example.android.uamp.play"

    .line 50
    .line 51
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, p0, Lax/P4/d;->i:Landroid/app/PendingIntent;

    .line 63
    .line 64
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 65
    .line 66
    new-instance v3, Landroid/content/Intent;

    .line 67
    .line 68
    const-string v5, "com.example.android.uamp.prev"

    .line 69
    .line 70
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, p0, Lax/P4/d;->j:Landroid/app/PendingIntent;

    .line 82
    .line 83
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 84
    .line 85
    new-instance v3, Landroid/content/Intent;

    .line 86
    .line 87
    const-string v5, "com.example.android.uamp.next"

    .line 88
    .line 89
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, p0, Lax/P4/d;->k:Landroid/app/PendingIntent;

    .line 101
    .line 102
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 103
    .line 104
    new-instance v3, Landroid/content/Intent;

    .line 105
    .line 106
    const-string v5, "com.example.android.uamp.delete"

    .line 107
    .line 108
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iput-object v2, p0, Lax/P4/d;->l:Landroid/app/PendingIntent;

    .line 120
    .line 121
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 122
    .line 123
    new-instance v3, Landroid/content/Intent;

    .line 124
    .line 125
    const-string v5, "com.example.android.uamp.cancel"

    .line 126
    .line 127
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v2, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iput-object v2, p0, Lax/P4/d;->m:Landroid/app/PendingIntent;

    .line 139
    .line 140
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 141
    .line 142
    new-instance v3, Landroid/content/Intent;

    .line 143
    .line 144
    const-string v5, "com.example.android.uamp.stop"

    .line 145
    .line 146
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-static {v2, v4, v1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, Lax/P4/d;->n:Landroid/app/PendingIntent;

    .line 158
    .line 159
    const/4 v0, 0x1

    .line 160
    iput-boolean v0, p0, Lax/P4/d;->o:Z
    :try_end_a1
    .catch Ljava/lang/SecurityException; {:try_start_11 .. :try_end_a1} :catch_a1

    .line 161
    .line 162
    :catch_a1
    :goto_a1
    return-void
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

.method private q(Landroid/app/Notification;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/P4/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x19c

    .line 6
    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-static {v0, v1, p1, v2}, Lax/P4/c;->a(Lcom/example/android/uamp/MusicService;ILandroid/app/Notification;I)V

    .line 13
    .line 14
    .line 15
    goto :goto_14

    .line 16
    :cond_f
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 19
    .line 20
    .line 21
    :goto_14
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lax/P4/d;->q:Z

    .line 23
    .line 24
    return-void
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

.method private s(Lax/P/l$d;)V
    .registers 12

    .line 1
    const/4 v0, 0x3

    .line 2
    sget-object v1, Lax/P4/d;->s:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "updateNotificationPlaybackState. mPlaybackState="

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    new-array v4, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    aput-object v2, v4, v5

    .line 28
    .line 29
    invoke-static {v1, v4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 33
    .line 34
    if-nez v2, :cond_2d

    .line 35
    .line 36
    new-array p1, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    const-string v0, "updateNotificationPlaybackState. cancelling notification!"

    .line 39
    .line 40
    aput-object v0, p1, v5

    .line 41
    .line 42
    invoke-static {v1, p1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    if-ne v2, v0, :cond_78

    .line 53
    .line 54
    iget-object v2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->i()J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    cmp-long v2, v8, v6

    .line 61
    .line 62
    if-ltz v2, :cond_78

    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    iget-object v2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat;->i()J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    sub-long/2addr v6, v8

    .line 75
    const-wide/16 v8, 0x3e8

    .line 76
    .line 77
    div-long/2addr v6, v8

    .line 78
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-array v4, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v6, "updateNotificationPlaybackState. updating playback position to "

    .line 85
    .line 86
    aput-object v6, v4, v5

    .line 87
    .line 88
    aput-object v2, v4, v3

    .line 89
    .line 90
    const-string v2, " seconds"

    .line 91
    .line 92
    const/4 v6, 0x2

    .line 93
    aput-object v2, v4, v6

    .line 94
    .line 95
    invoke-static {v1, v4}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v1

    .line 102
    iget-object v4, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 103
    .line 104
    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat;->i()J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    sub-long/2addr v1, v6

    .line 109
    invoke-virtual {p1, v1, v2}, Lax/P/l$d;->A(J)Lax/P/l$d;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1, v3}, Lax/P/l$d;->t(Z)Lax/P/l$d;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1, v3}, Lax/P/l$d;->y(Z)Lax/P/l$d;

    .line 118
    .line 119
    .line 120
    goto :goto_8c

    .line 121
    :cond_78
    new-array v2, v3, [Ljava/lang/Object;

    .line 122
    .line 123
    const-string v4, "updateNotificationPlaybackState. hiding playback position"

    .line 124
    .line 125
    aput-object v4, v2, v5

    .line 126
    .line 127
    invoke-static {v1, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v6, v7}, Lax/P/l$d;->A(J)Lax/P/l$d;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, v5}, Lax/P/l$d;->t(Z)Lax/P/l$d;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1, v5}, Lax/P/l$d;->y(Z)Lax/P/l$d;

    .line 139
    .line 140
    .line 141
    :goto_8c
    iget-object v1, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-ne v1, v0, :cond_95

    .line 148
    .line 149
    goto :goto_96

    .line 150
    :cond_95
    const/4 v3, 0x0

    .line 151
    :goto_96
    invoke-virtual {p1, v3}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 152
    .line 153
    .line 154
    return-void
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

.method private v()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/M0/c;->i()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/P4/d;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 8
    .line 9
    if-nez v1, :cond_c

    .line 10
    .line 11
    if-nez v0, :cond_14

    .line 12
    .line 13
    :cond_c
    if-eqz v1, :cond_3b

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3b

    .line 20
    .line 21
    :cond_14
    iget-object v1, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 22
    .line 23
    if-eqz v1, :cond_1d

    .line 24
    .line 25
    iget-object v2, p0, Lax/P4/d;->r:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    iput-object v0, p0, Lax/P4/d;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 31
    .line 32
    if-eqz v0, :cond_3b

    .line 33
    .line 34
    new-instance v1, Landroid/support/v4/media/session/MediaControllerCompat;

    .line 35
    .line 36
    iget-object v2, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->i()Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 48
    .line 49
    iget-boolean v0, p0, Lax/P4/d;->p:Z

    .line 50
    .line 51
    if-eqz v0, :cond_3b

    .line 52
    .line 53
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 54
    .line 55
    iget-object v1, p0, Lax/P4/d;->r:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
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
.method public l()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    invoke-direct {p0}, Lax/P4/d;->k()Landroid/app/Notification;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lax/P4/d;->q(Landroid/app/Notification;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0}, Lax/P4/d;->j(Z)Landroid/app/Notification;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_20

    .line 19
    .line 20
    :try_start_13
    invoke-direct {p0, v0}, Lax/P4/d;->q(Landroid/app/Notification;)V
    :try_end_16
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_16} :catch_17

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_17
    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, v0}, Lax/P4/d;->j(Z)Landroid/app/Notification;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Lax/P4/d;->q(Landroid/app/Notification;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    invoke-direct {p0}, Lax/P4/d;->k()Landroid/app/Notification;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p0, v0}, Lax/P4/d;->q(Landroid/app/Notification;)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public o()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->q:Z

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

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 8

    .line 1
    const/4 p1, 0x2

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    sget-object v0, Lax/P4/d;->s:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Received intent with action "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    new-array v3, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aput-object v1, v3, v4

    .line 30
    .line 31
    invoke-static {v0, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sparse-switch v3, :sswitch_data_fe

    .line 43
    .line 44
    .line 45
    goto :goto_79

    .line 46
    :sswitch_2d
    const-string v3, "com.example.android.uamp.delete"

    .line 47
    .line 48
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_36

    .line 53
    .line 54
    goto :goto_79

    .line 55
    :cond_36
    const/4 v1, 0x6

    .line 56
    goto :goto_79

    .line 57
    :sswitch_38
    const-string v3, "com.example.android.uamp.cancel"

    .line 58
    .line 59
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_41

    .line 64
    .line 65
    goto :goto_79

    .line 66
    :cond_41
    const/4 v1, 0x5

    .line 67
    goto :goto_79

    .line 68
    :sswitch_43
    const-string v3, "com.example.android.uamp.stop"

    .line 69
    .line 70
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_4c

    .line 75
    .line 76
    goto :goto_79

    .line 77
    :cond_4c
    const/4 v1, 0x4

    .line 78
    goto :goto_79

    .line 79
    :sswitch_4e
    const-string v3, "com.example.android.uamp.prev"

    .line 80
    .line 81
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_57

    .line 86
    .line 87
    goto :goto_79

    .line 88
    :cond_57
    const/4 v1, 0x3

    .line 89
    goto :goto_79

    .line 90
    :sswitch_59
    const-string v3, "com.example.android.uamp.play"

    .line 91
    .line 92
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_62

    .line 97
    .line 98
    goto :goto_79

    .line 99
    :cond_62
    const/4 v1, 0x2

    .line 100
    goto :goto_79

    .line 101
    :sswitch_64
    const-string v3, "com.example.android.uamp.next"

    .line 102
    .line 103
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_6d

    .line 108
    .line 109
    goto :goto_79

    .line 110
    :cond_6d
    const/4 v1, 0x1

    .line 111
    goto :goto_79

    .line 112
    :sswitch_6f
    const-string v3, "com.example.android.uamp.pause"

    .line 113
    .line 114
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_78

    .line 119
    .line 120
    goto :goto_79

    .line 121
    :cond_78
    const/4 v1, 0x0

    .line 122
    :goto_79
    packed-switch v1, :pswitch_data_11c

    .line 123
    .line 124
    .line 125
    new-array p1, p1, [Ljava/lang/Object;

    .line 126
    .line 127
    const-string v1, "Unknown intent ignored. Action="

    .line 128
    .line 129
    aput-object v1, p1, v4

    .line 130
    .line 131
    aput-object p2, p1, v2

    .line 132
    .line 133
    invoke-static {v0, p1}, Lax/S4/b;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_88
    iget-object p2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 138
    .line 139
    if-eqz p2, :cond_df

    .line 140
    .line 141
    new-instance p2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v1, "Notification deleted : current state = "

    .line 147
    .line 148
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 152
    .line 153
    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    new-array v1, v2, [Ljava/lang/Object;

    .line 165
    .line 166
    aput-object p2, v1, v4

    .line 167
    .line 168
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eq p2, p1, :cond_da

    .line 178
    .line 179
    const/4 p1, 0x7

    .line 180
    if-eq p2, p1, :cond_da

    .line 181
    .line 182
    if-nez p2, :cond_b8

    .line 183
    .line 184
    goto :goto_da

    .line 185
    :cond_b8
    if-ne p2, v2, :cond_bb

    .line 186
    .line 187
    goto :goto_df

    .line 188
    :cond_bb
    new-instance p1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string p2, "Notification deleted in playing : current state = "

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget-object p2, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 199
    .line 200
    invoke-virtual {p2}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    new-array p2, v2, [Ljava/lang/Object;

    .line 212
    .line 213
    aput-object p1, p2, v4

    .line 214
    .line 215
    invoke-static {v0, p2}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_da
    :goto_da
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 220
    .line 221
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->k()V

    .line 222
    .line 223
    .line 224
    :cond_df
    :goto_df
    return-void

    .line 225
    :pswitch_e0
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 226
    .line 227
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->k()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_e6
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->j()V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_ec
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->b()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_f2
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 244
    .line 245
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->i()V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_f8
    iget-object p1, p0, Lax/P4/d;->d:Landroid/support/v4/media/session/MediaControllerCompat$e;

    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$e;->a()V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :sswitch_data_fe
    .sparse-switch
        -0x64240b19 -> :sswitch_6f
        -0x4d8e661e -> :sswitch_64
        -0x4d8d65dd -> :sswitch_59
        -0x4d8d4ede -> :sswitch_4e
        -0x4d8be90f -> :sswitch_43
        -0x368fc257 -> :sswitch_38
        -0x34a36b26 -> :sswitch_2d
    .end sparse-switch

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
    :pswitch_data_11c
    .packed-switch 0x0
        :pswitch_f8
        :pswitch_f2
        :pswitch_ec
        :pswitch_e6
        :pswitch_e0
        :pswitch_e0
        :pswitch_88
    .end packed-switch
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

.method public p()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->p:Z

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

.method public r(Z)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/P4/d;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/app/Service;->stopForeground(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lax/P4/d;->q:Z

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

.method public t()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S4/a;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_76

    .line 4
    .line 5
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 12
    .line 13
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, v0}, Lax/P4/d;->j(Z)Landroid/app/Notification;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_ae

    .line 27
    .line 28
    iget-object v2, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 29
    .line 30
    iget-object v3, p0, Lax/P4/d;->r:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/support/v4/media/session/MediaControllerCompat;->j(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Landroid/content/IntentFilter;

    .line 36
    .line 37
    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "com.example.android.uamp.next"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "com.example.android.uamp.pause"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v3, "com.example.android.uamp.play"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v3, "com.example.android.uamp.prev"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v3, "com.example.android.uamp.delete"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v3, "com.example.android.uamp.cancel"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v3, "com.example.android.uamp.stop"

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 76
    .line 77
    const/4 v4, 0x2

    .line 78
    invoke-static {v3, p0, v2, v4}, Lax/Q/b;->i(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    :try_start_50
    invoke-direct {p0, v1}, Lax/P4/d;->q(Landroid/app/Notification;)V
    :try_end_53
    .catch Ljava/lang/RuntimeException; {:try_start_50 .. :try_end_53} :catch_54

    .line 82
    .line 83
    .line 84
    goto :goto_73

    .line 85
    :catch_54
    const/4 v1, 0x0

    .line 86
    invoke-direct {p0, v1}, Lax/P4/d;->j(Z)Landroid/app/Notification;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :try_start_59
    invoke-direct {p0, v1}, Lax/P4/d;->q(Landroid/app/Notification;)V
    :try_end_5c
    .catch Ljava/lang/RuntimeException; {:try_start_59 .. :try_end_5c} :catch_5d

    .line 91
    .line 92
    .line 93
    goto :goto_73

    .line 94
    :catch_5d
    move-exception v1

    .line 95
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const-string v3, "media notification runtime error"

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 114
    .line 115
    .line 116
    :goto_73
    iput-boolean v0, p0, Lax/P4/d;->p:Z

    .line 117
    .line 118
    goto :goto_ae

    .line 119
    :cond_76
    invoke-virtual {p0}, Lax/P4/d;->o()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_ae

    .line 124
    .line 125
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->d()Landroid/support/v4/media/MediaMetadataCompat;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p0, Lax/P4/d;->f:Landroid/support/v4/media/MediaMetadataCompat;

    .line 132
    .line 133
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->e()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, Lax/P4/d;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 140
    .line 141
    :try_start_8c
    invoke-virtual {p0}, Lax/P4/d;->l()V
    :try_end_8f
    .catch Ljava/lang/IllegalStateException; {:try_start_8c .. :try_end_8f} :catch_90

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :catch_90
    move-exception v0

    .line 146
    iget-object v1, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 147
    .line 148
    invoke-static {v1}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v2, "MUSIC START NOTIFICATION ERROR"

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 167
    .line 168
    .line 169
    new-instance v1, Lax/S4/a;

    .line 170
    .line 171
    invoke-direct {v1, v0}, Lax/S4/a;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw v1

    .line 175
    :cond_ae
    :goto_ae
    return-void
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

.method public u()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/P4/d;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lax/P4/d;->p:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/P4/d;->c:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 9
    .line 10
    iget-object v1, p0, Lax/P4/d;->r:Landroid/support/v4/media/session/MediaControllerCompat$a;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->m(Landroid/support/v4/media/session/MediaControllerCompat$a;)V

    .line 13
    .line 14
    .line 15
    :try_start_e
    iget-object v0, p0, Lax/P4/d;->a:Lcom/example/android/uamp/MusicService;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_13
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e .. :try_end_13} :catch_13

    .line 18
    .line 19
    .line 20
    :catch_13
    :cond_13
    :try_start_13
    iget-object v0, p0, Lax/P4/d;->g:Lax/P/p;

    .line 21
    .line 22
    const/16 v1, 0x19c

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lax/P/p;->b(I)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_1a} :catch_1a

    .line 25
    .line 26
    .line 27
    :catch_1a
    const/4 v0, 0x1

    .line 28
    :try_start_1b
    invoke-virtual {p0, v0}, Lax/P4/d;->r(Z)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1e} :catch_1e

    .line 29
    .line 30
    .line 31
    :catch_1e
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
