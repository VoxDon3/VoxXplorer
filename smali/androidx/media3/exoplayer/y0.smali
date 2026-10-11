.class public final synthetic Landroidx/media3/exoplayer/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/util/Pair;

.field public final synthetic d0:Lax/i1/y;

.field public final synthetic e0:Lax/i1/B;

.field public final synthetic f0:Ljava/io/IOException;

.field public final synthetic g0:Z

.field public final synthetic q:Landroidx/media3/exoplayer/I0$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;Z)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/y0;->q:Landroidx/media3/exoplayer/I0$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/y0;->c0:Landroid/util/Pair;

    iput-object p3, p0, Landroidx/media3/exoplayer/y0;->d0:Lax/i1/y;

    iput-object p4, p0, Landroidx/media3/exoplayer/y0;->e0:Lax/i1/B;

    iput-object p5, p0, Landroidx/media3/exoplayer/y0;->f0:Ljava/io/IOException;

    iput-boolean p6, p0, Landroidx/media3/exoplayer/y0;->g0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/y0;->q:Landroidx/media3/exoplayer/I0$a;

    iget-object v1, p0, Landroidx/media3/exoplayer/y0;->c0:Landroid/util/Pair;

    iget-object v2, p0, Landroidx/media3/exoplayer/y0;->d0:Lax/i1/y;

    iget-object v3, p0, Landroidx/media3/exoplayer/y0;->e0:Lax/i1/B;

    iget-object v4, p0, Landroidx/media3/exoplayer/y0;->f0:Ljava/io/IOException;

    iget-boolean v5, p0, Landroidx/media3/exoplayer/y0;->g0:Z

    invoke-static/range {v0 .. v5}, Landroidx/media3/exoplayer/I0$a;->t(Landroidx/media3/exoplayer/I0$a;Landroid/util/Pair;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;Z)V

    return-void
.end method
