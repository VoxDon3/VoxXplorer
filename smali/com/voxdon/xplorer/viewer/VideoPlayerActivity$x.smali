.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "x"
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field b:Landroid/os/Handler;

.field c:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->b:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 7
    .line 8
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

.method private a(II)Z
    .registers 4

    .line 1
    add-int/lit8 v0, p2, -0xa

    if-le p1, v0, :cond_a

    add-int/lit8 p2, p2, 0xa

    if-ge p1, p2, :cond_a

    const/4 p1, 0x1

    return p1

    :cond_a
    const/4 p1, 0x0

    return p1
.end method

.method private b(I)Z
    .registers 3

    .line 1
    const/16 v0, 0x5a

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    const/16 v0, 0x10e

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a(II)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_13
    :goto_13
    const/4 p1, 0x1

    .line 21
    return p1
    .line 22
.end method

.method private c(I)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a(II)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_11

    .line 7
    .line 8
    const/16 v1, 0xb4

    .line 9
    .line 10
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a(II)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_10

    .line 15
    .line 16
    goto :goto_11

    .line 17
    :cond_10
    return v0

    .line 18
    :cond_11
    :goto_11
    const/4 p1, 0x1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method d()V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ne v0, v1, :cond_19

    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    goto :goto_20

    .line 26
    :cond_19
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 27
    .line 28
    const/4 v1, 0x6

    .line 29
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    :goto_20
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->a:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v4, "accelerometer_rotation"

    .line 40
    .line 41
    invoke-static {v1, v4, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v1, v2, :cond_31

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->e(Z)V

    .line 48
    .line 49
    .line 50
    :cond_31
    return-void
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

.method e(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->c:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->enable()V

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

.method public onOrientationChanged(I)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->b(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_14

    .line 10
    .line 11
    :cond_a
    iget-boolean v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->c:Z

    .line 12
    .line 13
    if-nez v0, :cond_23

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->c(I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_23

    .line 20
    .line 21
    :cond_14
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;->b:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x$a;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$x;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v1, 0x7d0

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->disable()V

    .line 34
    .line 35
    .line 36
    :cond_23
    return-void
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
