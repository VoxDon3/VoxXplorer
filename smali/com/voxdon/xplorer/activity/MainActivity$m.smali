.class Lcom/voxdon/xplorer/activity/MainActivity$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/voxdon/xplorer/activity/MainActivity$H;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/activity/MainActivity;->d2(Lax/c3/K;ZLcom/voxdon/xplorer/bookmark/Bookmark;Ljava/lang/String;)V
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
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$m;->a:Lcom/voxdon/xplorer/activity/MainActivity;

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
.method public a(Lax/d3/n;)V
    .registers 4

    .line 1
    instance-of v0, p1, Lax/d3/E;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    check-cast p1, Lax/d3/E;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/d3/E;->U6()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/activity/MainActivity$m;->a:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v0, v1}, Lax/d3/E;->J9(Landroid/content/Context;Z)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method
