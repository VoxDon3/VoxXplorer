.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

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
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .registers 5

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/Runnable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1d

    .line 14
    .line 15
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/Runnable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-void
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

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
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
