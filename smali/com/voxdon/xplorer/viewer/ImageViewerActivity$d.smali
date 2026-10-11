.class Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x3/E$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

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
.method public a(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lcom/android/ex/photo/f;->E0(Z)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->s()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_21

    .line 24
    .line 25
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->n()V

    .line 32
    .line 33
    .line 34
    :cond_21
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_34

    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/16 v0, 0x80

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 51
    .line 52
    .line 53
    :cond_34
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public b(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lcom/android/ex/photo/f;->E0(Z)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1f

    .line 20
    .line 21
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/16 v0, 0x80

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 30
    .line 31
    .line 32
    :cond_1f
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

.method public c(Z)V
    .registers 3

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Lcom/android/ex/photo/f;->E0(Z)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->W(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_24

    .line 25
    .line 26
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$d;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/16 v0, 0x80

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 35
    .line 36
    .line 37
    :cond_24
    return-void
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
