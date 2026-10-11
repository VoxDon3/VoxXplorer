.class public final synthetic Lax/c1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/hls/l$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/hls/l$b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/c1/g;->q:Landroidx/media3/exoplayer/hls/l$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c1/g;->q:Landroidx/media3/exoplayer/hls/l$b;

    invoke-interface {v0}, Landroidx/media3/exoplayer/hls/l$b;->h()V

    return-void
.end method
