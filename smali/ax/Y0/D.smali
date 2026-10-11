.class public final synthetic Lax/Y0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/o0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/o0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/D;->q:Landroidx/media3/exoplayer/o0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/D;->q:Landroidx/media3/exoplayer/o0;

    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->b(Landroidx/media3/exoplayer/o0;)Landroidx/media3/exoplayer/o0;

    move-result-object v0

    return-object v0
.end method
