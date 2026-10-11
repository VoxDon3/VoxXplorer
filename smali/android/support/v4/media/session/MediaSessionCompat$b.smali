.class public abstract Landroid/support/v4/media/session/MediaSessionCompat$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaSessionCompat$b$a;,
        Landroid/support/v4/media/session/MediaSessionCompat$b$b;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Landroid/media/session/MediaSession$Callback;

.field private c:Z

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/session/MediaSessionCompat$c;",
            ">;"
        }
    .end annotation
.end field

.field e:Landroid/support/v4/media/session/MediaSessionCompat$b$a;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$b$b;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaSessionCompat$b$b;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$b;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->b:Landroid/media/session/MediaSession$Callback;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->d:Ljava/lang/ref/WeakReference;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public A()V
    .registers 1

    .line 1
    return-void
.end method

.method public B(J)V
    .registers 3

    .line 1
    return-void
.end method

.method public C()V
    .registers 1

    .line 1
    return-void
.end method

.method D(Landroid/support/v4/media/session/MediaSessionCompat$c;Landroid/os/Handler;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->d:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->e:Landroid/support/v4/media/session/MediaSessionCompat$b$a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_15

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_15

    .line 20
    :catchall_13
    move-exception p1

    .line 21
    goto :goto_27

    .line 22
    :cond_15
    :goto_15
    if-eqz p1, :cond_23

    .line 23
    .line 24
    if-nez p2, :cond_1a

    .line 25
    .line 26
    goto :goto_23

    .line 27
    :cond_1a
    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat$b$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v2, p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$b$a;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$b;Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    :goto_23
    iput-object v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->e:Landroid/support/v4/media/session/MediaSessionCompat$b$a;

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_27
    monitor-exit v0
    :try_end_28
    .catchall {:try_start_3 .. :try_end_28} :catchall_13

    .line 41
    throw p1
.end method

.method a(Landroid/support/v4/media/session/MediaSessionCompat$c;Landroid/os/Handler;)V
    .registers 11

    .line 1
    iget-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_47

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->c:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Landroid/support/v4/media/session/MediaSessionCompat$c;->i()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    if-nez p1, :cond_16

    .line 20
    .line 21
    move-wide v4, v2

    .line 22
    goto :goto_1a

    .line 23
    :cond_16
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    :goto_1a
    if-eqz p1, :cond_25

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, 0x3

    .line 34
    if-ne p1, p2, :cond_25

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 p1, 0x0

    .line 39
    :goto_26
    const-wide/16 v6, 0x204

    .line 40
    .line 41
    and-long/2addr v6, v4

    .line 42
    cmp-long p2, v6, v2

    .line 43
    .line 44
    if-eqz p2, :cond_2f

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    goto :goto_30

    .line 48
    :cond_2f
    const/4 p2, 0x0

    .line 49
    :goto_30
    const-wide/16 v6, 0x202

    .line 50
    .line 51
    and-long/2addr v4, v6

    .line 52
    cmp-long v6, v4, v2

    .line 53
    .line 54
    if-eqz v6, :cond_38

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    :cond_38
    if-eqz p1, :cond_40

    .line 58
    .line 59
    if-eqz v0, :cond_40

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;->h()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    if-nez p1, :cond_47

    .line 66
    .line 67
    if-eqz p2, :cond_47

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;->i()V

    .line 70
    .line 71
    .line 72
    :cond_47
    :goto_47
    return-void
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public b(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    .line 1
    return-void
.end method

.method public c(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .registers 3

    .line 1
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .registers 4

    .line 1
    return-void
.end method

.method public e(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public f()V
    .registers 1

    .line 1
    return-void
.end method

.method public g(Landroid/content/Intent;)Z
    .registers 9

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_8

    .line 7
    .line 8
    return v2

    .line 9
    :cond_8
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_b
    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->d:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/support/v4/media/session/MediaSessionCompat$c;

    .line 19
    .line 20
    iget-object v3, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->e:Landroid/support/v4/media/session/MediaSessionCompat$b$a;

    .line 21
    .line 22
    monitor-exit v0
    :try_end_16
    .catchall {:try_start_b .. :try_end_16} :catchall_7d

    .line 23
    if-eqz v1, :cond_7c

    .line 24
    .line 25
    if-nez v3, :cond_1b

    .line 26
    .line 27
    goto :goto_7c

    .line 28
    :cond_1b
    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/view/KeyEvent;

    .line 35
    .line 36
    if-eqz p1, :cond_7c

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2c

    .line 43
    .line 44
    goto :goto_7c

    .line 45
    :cond_2c
    invoke-interface {v1}, Landroid/support/v4/media/session/MediaSessionCompat$c;->t()Lax/M0/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/16 v5, 0x4f

    .line 54
    .line 55
    if-eq v4, v5, :cond_40

    .line 56
    .line 57
    const/16 v5, 0x55

    .line 58
    .line 59
    if-eq v4, v5, :cond_40

    .line 60
    .line 61
    invoke-virtual {p0, v1, v3}, Landroid/support/v4/media/session/MediaSessionCompat$b;->a(Landroid/support/v4/media/session/MediaSessionCompat$c;Landroid/os/Handler;)V

    .line 62
    .line 63
    .line 64
    return v2

    .line 65
    :cond_40
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/4 v4, 0x1

    .line 70
    if-nez p1, :cond_78

    .line 71
    .line 72
    iget-boolean p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->c:Z

    .line 73
    .line 74
    if-eqz p1, :cond_69

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 77
    .line 78
    .line 79
    iput-boolean v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->c:Z

    .line 80
    .line 81
    invoke-interface {v1}, Landroid/support/v4/media/session/MediaSessionCompat$c;->i()Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-wide/16 v0, 0x0

    .line 86
    .line 87
    if-nez p1, :cond_5a

    .line 88
    .line 89
    move-wide v2, v0

    .line 90
    goto :goto_5e

    .line 91
    :cond_5a
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->b()J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    :goto_5e
    const-wide/16 v5, 0x20

    .line 96
    .line 97
    and-long/2addr v2, v5

    .line 98
    cmp-long p1, v2, v0

    .line 99
    .line 100
    if-eqz p1, :cond_7b

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;->z()V

    .line 103
    .line 104
    .line 105
    goto :goto_7b

    .line 106
    :cond_69
    iput-boolean v4, p0, Landroid/support/v4/media/session/MediaSessionCompat$b;->c:Z

    .line 107
    .line 108
    invoke-virtual {v3, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    int-to-long v0, v0

    .line 117
    invoke-virtual {v3, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 118
    .line 119
    .line 120
    goto :goto_7b

    .line 121
    :cond_78
    invoke-virtual {p0, v1, v3}, Landroid/support/v4/media/session/MediaSessionCompat$b;->a(Landroid/support/v4/media/session/MediaSessionCompat$c;Landroid/os/Handler;)V

    .line 122
    .line 123
    .line 124
    :cond_7b
    :goto_7b
    return v4

    .line 125
    :cond_7c
    :goto_7c
    return v2

    .line 126
    :catchall_7d
    move-exception p1

    .line 127
    :try_start_7e
    monitor-exit v0
    :try_end_7f
    .catchall {:try_start_7e .. :try_end_7f} :catchall_7d

    .line 128
    throw p1
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public h()V
    .registers 1

    .line 1
    return-void
.end method

.method public i()V
    .registers 1

    .line 1
    return-void
.end method

.method public j(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public k(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public l(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public m()V
    .registers 1

    .line 1
    return-void
.end method

.method public n(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public o(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public p(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public q(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .registers 2

    .line 1
    return-void
.end method

.method public r()V
    .registers 1

    .line 1
    return-void
.end method

.method public s(J)V
    .registers 3

    .line 1
    return-void
.end method

.method public t(Z)V
    .registers 2

    .line 1
    return-void
.end method

.method public u(F)V
    .registers 2

    .line 1
    return-void
.end method

.method public v(Landroid/support/v4/media/RatingCompat;)V
    .registers 2

    .line 1
    return-void
.end method

.method public w(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    return-void
.end method

.method public x(I)V
    .registers 2

    .line 1
    return-void
.end method

.method public y(I)V
    .registers 2

    .line 1
    return-void
.end method

.method public z()V
    .registers 1

    .line 1
    return-void
.end method
