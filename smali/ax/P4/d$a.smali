.class Lax/P4/d$a;
.super Landroid/support/v4/media/session/MediaControllerCompat$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lax/P4/d;


# direct methods
.method constructor <init>(Lax/P4/d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

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
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/P4/d;->f(Lax/P4/d;Landroid/support/v4/media/MediaMetadataCompat;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/P4/d;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    const-string v2, "Received new metadata "

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object v2, v1, v3

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    aput-object p1, v1, v2

    .line 20
    .line 21
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 25
    .line 26
    invoke-static {p1, v2}, Lax/P4/d;->c(Lax/P4/d;Z)Landroid/app/Notification;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_3a

    .line 31
    .line 32
    const/16 v0, 0x19c

    .line 33
    .line 34
    :try_start_21
    iget-object v1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 35
    .line 36
    invoke-static {v1}, Lax/P4/d;->d(Lax/P4/d;)Lax/P/p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v0, p1}, Lax/P/p;->f(ILandroid/app/Notification;)V
    :try_end_2a
    .catch Ljava/lang/RuntimeException; {:try_start_21 .. :try_end_2a} :catch_2b

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_2b
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 45
    .line 46
    invoke-static {p1, v3}, Lax/P4/d;->c(Lax/P4/d;Z)Landroid/app/Notification;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 51
    .line 52
    invoke-static {v1}, Lax/P4/d;->d(Lax/P4/d;)Lax/P/p;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v0, p1}, Lax/P/p;->f(ILandroid/app/Notification;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return-void
    .line 60
    .line 61
.end method

.method public e(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/P4/d;->a(Lax/P4/d;Landroid/support/v4/media/session/PlaybackStateCompat;)Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lax/P4/d;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    const-string v2, "Received new playback state"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object v2, v1, v3

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    aput-object p1, v1, v2

    .line 20
    .line 21
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    if-nez p1, :cond_1a

    .line 25
    .line 26
    goto :goto_70

    .line 27
    :cond_1a
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v2, :cond_26

    .line 32
    .line 33
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/P4/d;->u()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x7

    .line 44
    if-ne v0, v1, :cond_3a

    .line 45
    .line 46
    invoke-static {}, Lax/P4/b;->a()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_34

    .line 51
    .line 52
    goto :goto_70

    .line 53
    :cond_34
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 54
    .line 55
    invoke-virtual {p1}, Lax/P4/d;->u()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_4d

    .line 64
    .line 65
    invoke-static {}, Lax/P4/b;->a()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_47

    .line 70
    .line 71
    goto :goto_70

    .line 72
    :cond_47
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 73
    .line 74
    invoke-virtual {p1}, Lax/P4/d;->u()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 79
    .line 80
    invoke-static {p1, v2}, Lax/P4/d;->c(Lax/P4/d;Z)Landroid/app/Notification;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_70

    .line 85
    .line 86
    const/16 v0, 0x19c

    .line 87
    .line 88
    :try_start_57
    iget-object v1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 89
    .line 90
    invoke-static {v1}, Lax/P4/d;->d(Lax/P4/d;)Lax/P/p;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1, v0, p1}, Lax/P/p;->f(ILandroid/app/Notification;)V
    :try_end_60
    .catch Ljava/lang/RuntimeException; {:try_start_57 .. :try_end_60} :catch_61

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catch_61
    iget-object p1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 99
    .line 100
    invoke-static {p1, v3}, Lax/P4/d;->c(Lax/P4/d;Z)Landroid/app/Notification;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v1, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 105
    .line 106
    invoke-static {v1}, Lax/P4/d;->d(Lax/P4/d;)Lax/P/p;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1, v0, p1}, Lax/P/p;->f(ILandroid/app/Notification;)V

    .line 111
    .line 112
    .line 113
    :cond_70
    :goto_70
    return-void
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

.method public i()V
    .registers 6

    .line 1
    invoke-super {p0}, Landroid/support/v4/media/session/MediaControllerCompat$a;->i()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/P4/d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v2, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v3, "Session was destroyed, resetting to the new session token"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    aput-object v3, v2, v4

    .line 15
    .line 16
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :try_start_12
    iget-object v0, p0, Lax/P4/d$a;->d:Lax/P4/d;

    .line 20
    .line 21
    invoke-static {v0}, Lax/P4/d;->g(Lax/P4/d;)V
    :try_end_17
    .catch Landroid/os/RemoteException; {:try_start_12 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_18
    move-exception v0

    .line 26
    invoke-static {}, Lax/P4/d;->b()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v3, "could not connect media controller"

    .line 33
    .line 34
    aput-object v3, v1, v4

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Lax/S4/b;->b(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
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
