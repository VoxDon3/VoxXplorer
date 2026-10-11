.class public final synthetic Landroidx/media3/exoplayer/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/content/Context;

.field public final synthetic q:Landroidx/media3/exoplayer/l$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/l$b;Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/o;->q:Landroidx/media3/exoplayer/l$b;

    iput-object p2, p0, Landroidx/media3/exoplayer/o;->c0:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/o;->q:Landroidx/media3/exoplayer/l$b;

    iget-object v1, p0, Landroidx/media3/exoplayer/o;->c0:Landroid/content/Context;

    invoke-static {v0, v1}, Landroidx/media3/exoplayer/l$b;->d(Landroidx/media3/exoplayer/l$b;Landroid/content/Context;)V

    return-void
.end method
