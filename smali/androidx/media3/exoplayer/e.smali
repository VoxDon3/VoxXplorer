.class public final synthetic Landroidx/media3/exoplayer/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic q:Landroidx/media3/exoplayer/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/e;->q:Landroidx/media3/exoplayer/g;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/e;->q:Landroidx/media3/exoplayer/g;

    invoke-static {v0, p1}, Landroidx/media3/exoplayer/g;->b(Landroidx/media3/exoplayer/g;I)V

    return-void
.end method
