.class final Lax/a1/f0$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "l"
.end annotation


# instance fields
.field private final a:Landroid/media/AudioTrack;

.field private final b:Lax/a1/j;

.field private c:Landroid/media/AudioRouting$OnRoutingChangedListener;


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;Lax/a1/j;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/a1/f0$l;->a:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, Lax/a1/f0$l;->b:Lax/a1/j;

    .line 7
    .line 8
    new-instance p2, Lax/a1/o0;

    .line 9
    .line 10
    invoke-direct {p2, p0}, Lax/a1/o0;-><init>(Lax/a1/f0$l;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lax/a1/f0$l;->c:Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 14
    .line 15
    new-instance p2, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/a1/f0$l;->c:Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 25
    .line 26
    invoke-static {p1, v0, p2}, Lax/a1/k0;->a(Landroid/media/AudioTrack;Landroid/media/AudioRouting$OnRoutingChangedListener;Landroid/os/Handler;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public static synthetic a(Lax/a1/f0$l;Landroid/media/AudioRouting;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/a1/f0$l;->b(Landroid/media/AudioRouting;)V

    return-void
.end method

.method private b(Landroid/media/AudioRouting;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0$l;->c:Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_10

    .line 6
    :cond_5
    invoke-static {p1}, Lax/a1/n0;->a(Landroid/media/AudioRouting;)Landroid/media/AudioDeviceInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_10

    .line 11
    .line 12
    iget-object v0, p0, Lax/a1/f0$l;->b:Lax/a1/j;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lax/a1/j;->j(Landroid/media/AudioDeviceInfo;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    :goto_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public c()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0$l;->a:Landroid/media/AudioTrack;

    .line 2
    .line 3
    iget-object v1, p0, Lax/a1/f0$l;->c:Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 4
    .line 5
    invoke-static {v1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lax/a1/l0;->a(Ljava/lang/Object;)Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lax/a1/m0;->a(Landroid/media/AudioTrack;Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lax/a1/f0$l;->c:Landroid/media/AudioRouting$OnRoutingChangedListener;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method
