.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->onOrientationChanged(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;->q:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

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
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;->q:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;->q:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method
