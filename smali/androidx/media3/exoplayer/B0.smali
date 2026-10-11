.class public final synthetic Landroidx/media3/exoplayer/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/util/Pair;

.field public final synthetic d0:Ljava/lang/Exception;

.field public final synthetic q:Landroidx/media3/exoplayer/I0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/B0;->q:Landroidx/media3/exoplayer/I0$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/B0;->c0:Landroid/util/Pair;

    iput-object p3, p0, Landroidx/media3/exoplayer/B0;->d0:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/B0;->q:Landroidx/media3/exoplayer/I0$a;

    iget-object v1, p0, Landroidx/media3/exoplayer/B0;->c0:Landroid/util/Pair;

    iget-object v2, p0, Landroidx/media3/exoplayer/B0;->d0:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/I0$a;->E(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method
