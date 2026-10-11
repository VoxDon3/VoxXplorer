.class public final synthetic Landroidx/media3/exoplayer/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/util/Pair;

.field public final synthetic d0:Lax/i1/y;

.field public final synthetic e0:Lax/i1/B;

.field public final synthetic f0:I

.field public final synthetic q:Landroidx/media3/exoplayer/I0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/y;Lax/i1/B;I)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/x0;->q:Landroidx/media3/exoplayer/I0$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/x0;->c0:Landroid/util/Pair;

    iput-object p3, p0, Landroidx/media3/exoplayer/x0;->d0:Lax/i1/y;

    iput-object p4, p0, Landroidx/media3/exoplayer/x0;->e0:Lax/i1/B;

    iput p5, p0, Landroidx/media3/exoplayer/x0;->f0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/x0;->q:Landroidx/media3/exoplayer/I0$a;

    iget-object v1, p0, Landroidx/media3/exoplayer/x0;->c0:Landroid/util/Pair;

    iget-object v2, p0, Landroidx/media3/exoplayer/x0;->d0:Lax/i1/y;

    iget-object v3, p0, Landroidx/media3/exoplayer/x0;->e0:Lax/i1/B;

    iget v4, p0, Landroidx/media3/exoplayer/x0;->f0:I

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/I0$a;->H(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/y;Lax/i1/B;I)V

    return-void
.end method
