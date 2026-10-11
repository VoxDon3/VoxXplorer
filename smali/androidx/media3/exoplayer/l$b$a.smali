.class Landroidx/media3/exoplayer/l$b$a;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/l$b;->b(Landroidx/media3/exoplayer/X0$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lax/S0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/l$b;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/l$b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/l$b$a;->a:Landroidx/media3/exoplayer/l$b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/l$b$a;->a:Landroidx/media3/exoplayer/l$b;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/l$b;->h(Landroidx/media3/exoplayer/l$b;)Lax/S0/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/l$b$a;->a:Landroidx/media3/exoplayer/l$b;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media3/exoplayer/l$b;->g(Landroidx/media3/exoplayer/l$b;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lax/S0/f;->g(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/l$b$a;->a:Landroidx/media3/exoplayer/l$b;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/l$b;->h(Landroidx/media3/exoplayer/l$b;)Lax/S0/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/l$b$a;->a:Landroidx/media3/exoplayer/l$b;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media3/exoplayer/l$b;->g(Landroidx/media3/exoplayer/l$b;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lax/S0/f;->g(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method
