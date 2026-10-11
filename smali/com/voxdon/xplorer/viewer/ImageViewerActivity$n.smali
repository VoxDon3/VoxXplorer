.class Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/ImageViewerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lcom/voxdon/xplorer/file/n;

.field final synthetic i:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->i:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->h:Lcom/voxdon/xplorer/file/n;

    .line 9
    .line 10
    return-void
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
    .line 23
    .line 24
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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected o()V
    .registers 1

    .line 1
    return-void
.end method

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->x(Ljava/lang/Boolean;)V

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

.method protected r()V
    .registers 1

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->i:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->h:Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->c0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Lcom/voxdon/xplorer/file/n;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_12

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->i:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/voxdon/xplorer/viewer/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/viewer/b;->f1()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$n;->i:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 20
    .line 21
    const v0, 0x7f130137

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 30
    .line 31
    .line 32
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
