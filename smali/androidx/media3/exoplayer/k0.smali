.class public final synthetic Landroidx/media3/exoplayer/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroidx/media3/exoplayer/K0;

.field public final synthetic q:Landroidx/media3/exoplayer/n0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/n0;Landroidx/media3/exoplayer/K0;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/k0;->q:Landroidx/media3/exoplayer/n0;

    iput-object p2, p0, Landroidx/media3/exoplayer/k0;->c0:Landroidx/media3/exoplayer/K0;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k0;->q:Landroidx/media3/exoplayer/n0;

    iget-object v1, p0, Landroidx/media3/exoplayer/k0;->c0:Landroidx/media3/exoplayer/K0;

    invoke-static {v0, v1}, Landroidx/media3/exoplayer/n0;->p(Landroidx/media3/exoplayer/n0;Landroidx/media3/exoplayer/K0;)V

    return-void
.end method
