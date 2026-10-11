.class Lcom/voxdon/xplorer/activity/MainActivity$D;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/voxdon/xplorer/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;J)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$D;->c:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lax/g3/c;-><init>(J)V

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
.method public a(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$D;->c:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->x1()Lax/d3/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Lax/d3/E;

    .line 8
    .line 9
    const-string v1, "toolbar_back"

    .line 10
    .line 11
    if-eqz v0, :cond_12

    .line 12
    .line 13
    check-cast p1, Lax/d3/E;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lax/d3/E;->na(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    instance-of v0, p1, Lax/d3/l0;

    .line 20
    .line 21
    if-eqz v0, :cond_22

    .line 22
    .line 23
    invoke-static {}, Lcom/voxdon/xplorer/service/FtpServerService;->x()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_22

    .line 28
    .line 29
    check-cast p1, Lax/d3/l0;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/d3/l0;->c6()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$D;->c:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    invoke-virtual {p1, v0, v1}, Lcom/voxdon/xplorer/activity/MainActivity;->m2(ZLjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
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
