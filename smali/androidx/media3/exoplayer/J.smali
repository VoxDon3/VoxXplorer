.class public final synthetic Landroidx/media3/exoplayer/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroidx/media3/exoplayer/n0$e;

.field public final synthetic q:Landroidx/media3/exoplayer/X;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/n0$e;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/J;->q:Landroidx/media3/exoplayer/X;

    iput-object p2, p0, Landroidx/media3/exoplayer/J;->c0:Landroidx/media3/exoplayer/n0$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/J;->q:Landroidx/media3/exoplayer/X;

    iget-object v1, p0, Landroidx/media3/exoplayer/J;->c0:Landroidx/media3/exoplayer/n0$e;

    invoke-static {v0, v1}, Landroidx/media3/exoplayer/X;->c1(Landroidx/media3/exoplayer/X;Landroidx/media3/exoplayer/n0$e;)V

    return-void
.end method
