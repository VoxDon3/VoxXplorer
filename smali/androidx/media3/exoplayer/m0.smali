.class public final synthetic Landroidx/media3/exoplayer/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o1/z;


# instance fields
.field public final synthetic c0:Lax/o1/z;

.field public final synthetic q:Landroidx/media3/exoplayer/n0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/n0;Lax/o1/z;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/m0;->q:Landroidx/media3/exoplayer/n0;

    iput-object p2, p0, Landroidx/media3/exoplayer/m0;->c0:Lax/o1/z;

    return-void
.end method


# virtual methods
.method public final g(JJLax/P0/v;Landroid/media/MediaFormat;)V
    .registers 15

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/m0;->q:Landroidx/media3/exoplayer/n0;

    iget-object v1, p0, Landroidx/media3/exoplayer/m0;->c0:Lax/o1/z;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Landroidx/media3/exoplayer/n0;->o(Landroidx/media3/exoplayer/n0;Lax/o1/z;JJLax/P0/v;Landroid/media/MediaFormat;)V

    return-void
.end method
