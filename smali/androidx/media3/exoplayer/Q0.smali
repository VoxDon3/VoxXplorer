.class public final synthetic Landroidx/media3/exoplayer/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Landroidx/media3/exoplayer/V0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/V0;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/Q0;->q:Landroidx/media3/exoplayer/V0;

    iput p2, p0, Landroidx/media3/exoplayer/Q0;->c0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Q0;->q:Landroidx/media3/exoplayer/V0;

    iget v1, p0, Landroidx/media3/exoplayer/Q0;->c0:I

    invoke-static {v0, v1}, Landroidx/media3/exoplayer/V0;->f(Landroidx/media3/exoplayer/V0;I)V

    return-void
.end method
