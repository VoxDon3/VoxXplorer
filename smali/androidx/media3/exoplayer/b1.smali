.class public final synthetic Landroidx/media3/exoplayer/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Z

.field public final synthetic d0:Z

.field public final synthetic q:Landroidx/media3/exoplayer/d1;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/d1;ZZ)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/b1;->q:Landroidx/media3/exoplayer/d1;

    iput-boolean p2, p0, Landroidx/media3/exoplayer/b1;->c0:Z

    iput-boolean p3, p0, Landroidx/media3/exoplayer/b1;->d0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/b1;->q:Landroidx/media3/exoplayer/d1;

    iget-boolean v1, p0, Landroidx/media3/exoplayer/b1;->c0:Z

    iget-boolean v2, p0, Landroidx/media3/exoplayer/b1;->d0:Z

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/d1;->a(Landroidx/media3/exoplayer/d1;ZZ)V

    return-void
.end method
