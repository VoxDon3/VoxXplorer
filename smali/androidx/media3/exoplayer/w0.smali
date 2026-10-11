.class public final synthetic Landroidx/media3/exoplayer/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/util/Pair;

.field public final synthetic d0:Lax/i1/B;

.field public final synthetic q:Landroidx/media3/exoplayer/I0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/B;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/w0;->q:Landroidx/media3/exoplayer/I0$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/w0;->c0:Landroid/util/Pair;

    iput-object p3, p0, Landroidx/media3/exoplayer/w0;->d0:Lax/i1/B;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/w0;->q:Landroidx/media3/exoplayer/I0$a;

    iget-object v1, p0, Landroidx/media3/exoplayer/w0;->c0:Landroid/util/Pair;

    iget-object v2, p0, Landroidx/media3/exoplayer/w0;->d0:Lax/i1/B;

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/I0$a;->r(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/B;)V

    return-void
.end method
