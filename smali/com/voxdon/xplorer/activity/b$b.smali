.class Lcom/voxdon/xplorer/activity/b$b;
.super Landroid/support/v4/media/MediaBrowserCompat$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/voxdon/xplorer/activity/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$c;-><init>()V

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
.method public a()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/activity/b;->V(Lcom/voxdon/xplorer/activity/b;Z)Z

    .line 5
    .line 6
    .line 7
    :try_start_6
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/voxdon/xplorer/activity/b;->W(Lcom/voxdon/xplorer/activity/b;)Landroid/support/v4/media/MediaBrowserCompat;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/activity/b;->X(Lcom/voxdon/xplorer/activity/b;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_13} :catch_14

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_14
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->j0()V

    .line 24
    .line 25
    .line 26
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/activity/b;->V(Lcom/voxdon/xplorer/activity/b;Z)Z

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
.end method

.method public c()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/activity/b;->V(Lcom/voxdon/xplorer/activity/b;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/b$b;->c:Lcom/voxdon/xplorer/activity/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/voxdon/xplorer/activity/b;->s0()V

    .line 10
    .line 11
    .line 12
    return-void
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
