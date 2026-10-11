.class final Landroidx/media3/exoplayer/d$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/media3/exoplayer/d$b;

.field private final b:Lax/S0/q;

.field final synthetic c:Landroidx/media3/exoplayer/d;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/d;Lax/S0/q;Landroidx/media3/exoplayer/d$b;)V
    .registers 4

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/d$a;->c:Landroidx/media3/exoplayer/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/d$a;->b:Lax/S0/q;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/d$a;->a:Landroidx/media3/exoplayer/d$b;

    .line 9
    .line 10
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/d$a;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/d$a;->b()V

    return-void
.end method

.method private b()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/d$a;->c:Landroidx/media3/exoplayer/d;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/d;->c(Landroidx/media3/exoplayer/d;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/d$a;->a:Landroidx/media3/exoplayer/d$b;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/d$b;->j()V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    .line 1
    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_16

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/media3/exoplayer/d$a;->b:Lax/S0/q;

    .line 14
    .line 15
    new-instance p2, Landroidx/media3/exoplayer/c;

    .line 16
    .line 17
    invoke-direct {p2, p0}, Landroidx/media3/exoplayer/c;-><init>(Landroidx/media3/exoplayer/d$a;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p2}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
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
