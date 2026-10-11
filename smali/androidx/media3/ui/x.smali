.class public final synthetic Landroidx/media3/ui/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/view/SurfaceView;

.field public final synthetic d0:Ljava/lang/Runnable;

.field public final synthetic q:Landroidx/media3/ui/PlayerView$f;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView$f;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/x;->q:Landroidx/media3/ui/PlayerView$f;

    iput-object p2, p0, Landroidx/media3/ui/x;->c0:Landroid/view/SurfaceView;

    iput-object p3, p0, Landroidx/media3/ui/x;->d0:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/x;->q:Landroidx/media3/ui/PlayerView$f;

    iget-object v1, p0, Landroidx/media3/ui/x;->c0:Landroid/view/SurfaceView;

    iget-object v2, p0, Landroidx/media3/ui/x;->d0:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Landroidx/media3/ui/PlayerView$f;->a(Landroidx/media3/ui/PlayerView$f;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V

    return-void
.end method
