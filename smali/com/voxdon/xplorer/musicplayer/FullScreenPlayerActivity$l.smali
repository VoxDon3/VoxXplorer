.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;
.super Landroid/support/v4/media/session/MediaControllerCompat$a;
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
.field final synthetic d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

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
.method public c(Landroid/os/Bundle;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->t0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/os/Bundle;)V

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

.method public d(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_11

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->g0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->r0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->s0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 6

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->H()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "onPlaybackstate changed"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object p1, v1, v2

    .line 15
    .line 16
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->U(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 22
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

.method public h(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->u0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;I)V

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

.method public l(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$l;->d:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->v0(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;I)V

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
