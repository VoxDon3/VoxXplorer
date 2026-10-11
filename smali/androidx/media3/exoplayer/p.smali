.class public final synthetic Landroidx/media3/exoplayer/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/l$c;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/l$c;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/p;->q:Landroidx/media3/exoplayer/l$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/p;->q:Landroidx/media3/exoplayer/l$c;

    invoke-static {v0}, Landroidx/media3/exoplayer/l$c;->c(Landroidx/media3/exoplayer/l$c;)V

    return-void
.end method
