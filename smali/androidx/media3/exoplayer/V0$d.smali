.class final Landroidx/media3/exoplayer/V0$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/V0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/V0;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/V0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/V0;Landroidx/media3/exoplayer/V0$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/V0$d;-><init>(Landroidx/media3/exoplayer/V0;)V

    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/V0$d;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/V0;->h(Landroidx/media3/exoplayer/V0;)Landroidx/media3/exoplayer/V0$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/media3/exoplayer/V0;->g(Landroidx/media3/exoplayer/V0;)Lax/S0/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lax/S0/f;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroidx/media3/exoplayer/V0$c;

    .line 21
    .line 22
    iget v0, v0, Landroidx/media3/exoplayer/V0$c;->a:I

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    .line 25
    .line 26
    invoke-static {v1}, Landroidx/media3/exoplayer/V0;->g(Landroidx/media3/exoplayer/V0;)Lax/S0/f;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object p0, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    .line 31
    .line 32
    invoke-static {p0, v0}, Landroidx/media3/exoplayer/V0;->i(Landroidx/media3/exoplayer/V0;I)Landroidx/media3/exoplayer/V0$c;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p0}, Lax/S0/f;->g(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/V0$d;->a:Landroidx/media3/exoplayer/V0;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/V0;->g(Landroidx/media3/exoplayer/V0;)Lax/S0/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Landroidx/media3/exoplayer/W0;

    .line 8
    .line 9
    invoke-direct {p2, p0}, Landroidx/media3/exoplayer/W0;-><init>(Landroidx/media3/exoplayer/V0$d;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lax/S0/f;->e(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
