.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


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
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

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
.method public onSystemUiVisibilityChange(I)V
    .registers 3

    .line 1
    if-nez p1, :cond_12

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->a1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/16 v0, 0xf06

    .line 10
    .line 11
    if-ne p1, v0, :cond_12

    .line 12
    .line 13
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$n;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J3(Z)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
.end method
