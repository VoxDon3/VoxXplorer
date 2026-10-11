.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$m;
.super Landroid/support/v4/media/MediaBrowserCompat$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;
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
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$m;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$c;-><init>()V

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
.method public a()V
    .registers 6

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "onConnected"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v3, v2, v4

    .line 12
    .line 13
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :try_start_f
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$m;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->w0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/MediaBrowserCompat;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/support/v4/media/MediaBrowserCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v2}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->I(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    :try_end_1c
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_1c} :catch_1d

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_1d
    move-exception v0

    .line 31
    invoke-static {}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v3, "could not connect media controller"

    .line 38
    .line 39
    aput-object v3, v1, v4

    .line 40
    .line 41
    invoke-static {v2, v0, v1}, Lax/S4/b;->b(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

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
