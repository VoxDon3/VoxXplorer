.class final Lax/a1/j$c;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lax/a1/j;


# direct methods
.method private constructor <init>(Lax/a1/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/a1/j;Lax/a1/j$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/a1/j$c;-><init>(Lax/a1/j;)V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .registers 5

    .line 1
    iget-object p1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a1/j;->e(Lax/a1/j;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 8
    .line 9
    invoke-static {v1}, Lax/a1/j;->a(Lax/a1/j;)Lax/P0/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 14
    .line 15
    invoke-static {v2}, Lax/a1/j;->b(Lax/a1/j;)Lax/a1/k;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lax/a1/e;->f(Landroid/content/Context;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, Lax/a1/j;->d(Lax/a1/j;Lax/a1/e;)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/j;->b(Lax/a1/j;)Lax/a1/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_12

    .line 12
    .line 13
    iget-object p1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Lax/a1/j;->c(Lax/a1/j;Lax/a1/k;)Lax/a1/k;

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object p1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 20
    .line 21
    invoke-static {p1}, Lax/a1/j;->e(Lax/a1/j;)Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 26
    .line 27
    invoke-static {v1}, Lax/a1/j;->a(Lax/a1/j;)Lax/P0/c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lax/a1/j$c;->a:Lax/a1/j;

    .line 32
    .line 33
    invoke-static {v2}, Lax/a1/j;->b(Lax/a1/j;)Lax/a1/k;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v1, v2}, Lax/a1/e;->f(Landroid/content/Context;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p1, v0}, Lax/a1/j;->d(Lax/a1/j;Lax/a1/e;)V

    .line 42
    .line 43
    .line 44
    return-void
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
