.class Lcom/voxdon/xplorer/activity/MainActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/activity/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$b;->a:Lcom/voxdon/xplorer/activity/MainActivity;

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
.method public onPreDraw()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$b;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lax/u3/z;->c(Lax/n/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$b;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/MainActivity;->N0(Lcom/voxdon/xplorer/activity/MainActivity;)Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$b;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/MainActivity;->O0(Lcom/voxdon/xplorer/activity/MainActivity;)Landroidx/drawerlayout/widget/DrawerLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0
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
.end method
