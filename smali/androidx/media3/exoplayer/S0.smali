.class public final synthetic Landroidx/media3/exoplayer/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/f;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/V0;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/V0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/S0;->q:Landroidx/media3/exoplayer/V0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/S0;->q:Landroidx/media3/exoplayer/V0;

    check-cast p1, Landroidx/media3/exoplayer/V0$c;

    invoke-static {v0, p1}, Landroidx/media3/exoplayer/V0;->d(Landroidx/media3/exoplayer/V0;Landroidx/media3/exoplayer/V0$c;)Landroidx/media3/exoplayer/V0$c;

    move-result-object p1

    return-object p1
.end method
