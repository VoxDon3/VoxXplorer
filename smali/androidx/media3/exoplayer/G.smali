.class public final synthetic Landroidx/media3/exoplayer/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/X;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/X;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/G;->q:Landroidx/media3/exoplayer/X;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/G;->q:Landroidx/media3/exoplayer/X;

    invoke-static {v0}, Landroidx/media3/exoplayer/X;->O0(Landroidx/media3/exoplayer/X;)V

    return-void
.end method
