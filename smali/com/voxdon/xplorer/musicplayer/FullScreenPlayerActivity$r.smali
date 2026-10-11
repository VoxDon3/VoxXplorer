.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;
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
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

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
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$r;->c:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->J(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p1, v0, v1, v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->N(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;Landroid/support/v4/media/session/MediaControllerCompat;ZZ)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method
