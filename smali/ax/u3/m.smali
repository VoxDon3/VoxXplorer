.class public Lax/u3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/u3/m$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Z

.field private c:Ljava/lang/Runnable;

.field private d:Z

.field private e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic a(Lax/u3/m;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/u3/m;->b:Z

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
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

.method static synthetic b(Lax/u3/m;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method static synthetic c(Lax/u3/m;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/u3/m;->d:Z

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
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
.method public d(IILandroid/content/Intent;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lax/u3/m;->c:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-nez p1, :cond_8

    .line 4
    .line 5
    iget-boolean p1, p0, Lax/u3/m;->b:Z

    .line 6
    .line 7
    if-eqz p1, :cond_11

    .line 8
    .line 9
    :cond_8
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_11

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/u3/m;->g()V

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-object p1, p0, Lax/u3/m;->e:Ljava/lang/Runnable;

    .line 19
    .line 20
    if-nez p1, :cond_19

    .line 21
    .line 22
    iget-boolean p1, p0, Lax/u3/m;->d:Z

    .line 23
    .line 24
    if-eqz p1, :cond_22

    .line 25
    .line 26
    :cond_19
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_22

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/u3/m;->h()V

    .line 33
    .line 34
    .line 35
    :cond_22
    return-void
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

.method public e(Lax/u3/m$c;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/X2/Q;->z0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Lax/u3/m$a;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lax/u3/m$a;-><init>(Lax/u3/m;Lax/u3/m$c;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/u3/m;->c:Ljava/lang/Runnable;

    .line 14
    .line 15
    iget-object p1, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 16
    .line 17
    const-wide/16 v1, 0x1f4

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lax/u3/m;->b:Z

    .line 24
    .line 25
    return-void
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
.end method

.method public f(Landroid/content/Context;Lax/u3/m$c;)V
    .registers 6

    .line 1
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Lax/u3/m$b;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2}, Lax/u3/m$b;-><init>(Lax/u3/m;Landroid/content/Context;Lax/u3/m$c;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/u3/m;->e:Ljava/lang/Runnable;

    .line 14
    .line 15
    iget-object p1, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 16
    .line 17
    const-wide/16 v1, 0x1f4

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lax/u3/m;->d:Z

    .line 24
    .line 25
    return-void
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

.method public g()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/m;->c:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v1, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lax/u3/m;->c:Ljava/lang/Runnable;

    .line 12
    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lax/u3/m;->b:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public h()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/u3/m;->e:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v1, p0, Lax/u3/m;->a:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lax/u3/m;->e:Ljava/lang/Runnable;

    .line 12
    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lax/u3/m;->d:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
