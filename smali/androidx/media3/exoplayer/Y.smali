.class public final synthetic Landroidx/media3/exoplayer/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Z

.field public final synthetic d0:Landroidx/media3/exoplayer/X;

.field public final synthetic e0:Lax/Z0/I1;

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLandroidx/media3/exoplayer/X;Lax/Z0/I1;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->q:Landroid/content/Context;

    iput-boolean p2, p0, Landroidx/media3/exoplayer/Y;->c0:Z

    iput-object p3, p0, Landroidx/media3/exoplayer/Y;->d0:Landroidx/media3/exoplayer/X;

    iput-object p4, p0, Landroidx/media3/exoplayer/Y;->e0:Lax/Z0/I1;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->q:Landroid/content/Context;

    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->c0:Z

    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->d0:Landroidx/media3/exoplayer/X;

    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->e0:Lax/Z0/I1;

    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/X$b;->a(Landroid/content/Context;ZLandroidx/media3/exoplayer/X;Lax/Z0/I1;)V

    return-void
.end method
