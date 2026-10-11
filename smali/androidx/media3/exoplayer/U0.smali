.class public final synthetic Landroidx/media3/exoplayer/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/f;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Landroidx/media3/exoplayer/V0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/V0;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/U0;->q:Landroidx/media3/exoplayer/V0;

    iput p2, p0, Landroidx/media3/exoplayer/U0;->c0:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/U0;->q:Landroidx/media3/exoplayer/V0;

    iget v1, p0, Landroidx/media3/exoplayer/U0;->c0:I

    check-cast p1, Landroidx/media3/exoplayer/V0$c;

    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/V0;->c(Landroidx/media3/exoplayer/V0;ILandroidx/media3/exoplayer/V0$c;)Landroidx/media3/exoplayer/V0$c;

    move-result-object p1

    return-object p1
.end method
