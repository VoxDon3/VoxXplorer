.class public final synthetic Landroidx/media3/exoplayer/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:Z

.field public final synthetic q:Landroidx/media3/exoplayer/n0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/n0;IZ)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/j0;->q:Landroidx/media3/exoplayer/n0;

    iput p2, p0, Landroidx/media3/exoplayer/j0;->c0:I

    iput-boolean p3, p0, Landroidx/media3/exoplayer/j0;->d0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/j0;->q:Landroidx/media3/exoplayer/n0;

    iget v1, p0, Landroidx/media3/exoplayer/j0;->c0:I

    iget-boolean v2, p0, Landroidx/media3/exoplayer/j0;->d0:Z

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/n0;->n(Landroidx/media3/exoplayer/n0;IZ)V

    return-void
.end method
