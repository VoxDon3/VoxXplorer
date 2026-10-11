.class public final synthetic Landroidx/media3/exoplayer/T0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/f;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media3/exoplayer/T0;->q:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/T0;->q:I

    check-cast p1, Landroidx/media3/exoplayer/V0$c;

    invoke-static {v0, p1}, Landroidx/media3/exoplayer/V0;->a(ILandroidx/media3/exoplayer/V0$c;)Landroidx/media3/exoplayer/V0$c;

    move-result-object p1

    return-object p1
.end method
