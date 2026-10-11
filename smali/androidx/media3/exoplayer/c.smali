.class public final synthetic Landroidx/media3/exoplayer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/d$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/d$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/c;->q:Landroidx/media3/exoplayer/d$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/c;->q:Landroidx/media3/exoplayer/d$a;

    invoke-static {v0}, Landroidx/media3/exoplayer/d$a;->a(Landroidx/media3/exoplayer/d$a;)V

    return-void
.end method
