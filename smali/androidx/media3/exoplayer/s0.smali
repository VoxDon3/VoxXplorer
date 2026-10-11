.class public final synthetic Landroidx/media3/exoplayer/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/r7/z$a;

.field public final synthetic d0:Lax/i1/F$b;

.field public final synthetic q:Landroidx/media3/exoplayer/t0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/t0;Lax/r7/z$a;Lax/i1/F$b;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/s0;->q:Landroidx/media3/exoplayer/t0;

    iput-object p2, p0, Landroidx/media3/exoplayer/s0;->c0:Lax/r7/z$a;

    iput-object p3, p0, Landroidx/media3/exoplayer/s0;->d0:Lax/i1/F$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/s0;->q:Landroidx/media3/exoplayer/t0;

    iget-object v1, p0, Landroidx/media3/exoplayer/s0;->c0:Lax/r7/z$a;

    iget-object v2, p0, Landroidx/media3/exoplayer/s0;->d0:Lax/i1/F$b;

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/t0;->a(Landroidx/media3/exoplayer/t0;Lax/r7/z$a;Lax/i1/F$b;)V

    return-void
.end method
