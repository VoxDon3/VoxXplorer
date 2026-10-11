.class public final synthetic Landroidx/media3/exoplayer/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Z

.field public final synthetic q:Landroidx/media3/exoplayer/d1;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/d1;Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/c1;->q:Landroidx/media3/exoplayer/d1;

    iput-boolean p2, p0, Landroidx/media3/exoplayer/c1;->c0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/c1;->q:Landroidx/media3/exoplayer/d1;

    iget-boolean v1, p0, Landroidx/media3/exoplayer/c1;->c0:Z

    invoke-static {v0, v1}, Landroidx/media3/exoplayer/d1;->b(Landroidx/media3/exoplayer/d1;Z)V

    return-void
.end method
