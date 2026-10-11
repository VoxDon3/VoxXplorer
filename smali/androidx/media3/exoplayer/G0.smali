.class public final synthetic Landroidx/media3/exoplayer/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/util/Pair;

.field public final synthetic d0:I

.field public final synthetic q:Landroidx/media3/exoplayer/I0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/G0;->q:Landroidx/media3/exoplayer/I0$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/G0;->c0:Landroid/util/Pair;

    iput p3, p0, Landroidx/media3/exoplayer/G0;->d0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/G0;->q:Landroidx/media3/exoplayer/I0$a;

    iget-object v1, p0, Landroidx/media3/exoplayer/G0;->c0:Landroid/util/Pair;

    iget v2, p0, Landroidx/media3/exoplayer/G0;->d0:I

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/I0$a;->a(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;I)V

    return-void
.end method
