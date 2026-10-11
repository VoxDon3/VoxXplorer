.class Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;->q:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;->q:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->X(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity$e;->q:Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;->W(Lcom/voxdon/xplorer/musicplayer/FullScreenPlayerActivity;)Ljava/lang/Runnable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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
