.class public final synthetic Landroidx/media3/exoplayer/hls/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/hls/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/hls/l;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/k;->q:Landroidx/media3/exoplayer/hls/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/k;->q:Landroidx/media3/exoplayer/hls/l;

    invoke-static {v0}, Landroidx/media3/exoplayer/hls/l;->w(Landroidx/media3/exoplayer/hls/l;)V

    return-void
.end method
