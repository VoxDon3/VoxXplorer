.class public Lcom/voxdon/xplorer/activity/MainActivity$I;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/activity/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "I"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lcom/voxdon/xplorer/activity/MainActivity;

.field private i:Z

.field private j:Z

.field private k:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/activity/MainActivity;)V
    .registers 3

    .line 1
    sget-object v0, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/voxdon/xplorer/activity/MainActivity;->N0(Lcom/voxdon/xplorer/activity/MainActivity;)Ljava/util/concurrent/CountDownLatch;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->k:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity$I;->w([Ljava/lang/Long;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/activity/MainActivity$I;->x(Ljava/lang/Long;)V

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

.method protected varargs w([Ljava/lang/Long;)Ljava/lang/Long;
    .registers 5

    .line 1
    invoke-static {}, Lax/t3/k;->v()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 8
    .line 9
    invoke-static {p1}, Lax/V2/b;->d(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    :try_start_b
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->k:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v1, 0xbb8

    .line 17
    .line 18
    invoke-virtual {p1, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_14} :catch_14

    .line 19
    .line 20
    .line 21
    :catch_14
    const-wide/16 v0, 0x64

    .line 22
    .line 23
    :try_start_16
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    goto :goto_1b

    .line 27
    :catch_1a
    nop

    .line 28
    :goto_1b
    invoke-static {}, Lax/u3/z;->y()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_5a

    .line 33
    .line 34
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 35
    .line 36
    invoke-static {p1}, Lax/u3/z;->t(Landroid/content/Context;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_5a

    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 43
    .line 44
    invoke-static {p1}, Lax/u3/z;->a(Landroid/app/Activity;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->i:Z

    .line 49
    .line 50
    if-eqz p1, :cond_5a

    .line 51
    .line 52
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 53
    .line 54
    invoke-static {p1}, Lax/u3/z;->F(Landroid/content/Context;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->j:Z

    .line 59
    .line 60
    if-eqz p1, :cond_49

    .line 61
    .line 62
    invoke-static {}, Lax/X2/Q;->J()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5a

    .line 67
    .line 68
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 69
    .line 70
    invoke-static {p1}, Lax/u3/z;->A(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    goto :goto_5a

    .line 74
    :cond_49
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "WebView Locked detected!!"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 89
    .line 90
    .line 91
    :cond_5a
    :goto_5a
    invoke-static {}, Lax/X2/J;->G()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_75

    .line 96
    .line 97
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 98
    .line 99
    invoke-static {p1}, Lax/t3/j;->b(Landroid/content/Context;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_75

    .line 104
    .line 105
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-static {p1, v0}, Lax/t3/j;->p(Landroid/content/Context;Z)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 112
    .line 113
    const-class v1, Lcom/voxdon/xplorer/activity/UsbAttachActivity;

    .line 114
    .line 115
    invoke-static {p1, v1, v0}, Lax/u3/B;->c0(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 116
    .line 117
    .line 118
    :cond_75
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Lax/Q2/m;->d(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    return-object p1
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

.method protected x(Ljava/lang/Long;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_9

    .line 8
    .line 9
    goto :goto_28

    .line 10
    :cond_9
    iget-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->i:Z

    .line 11
    .line 12
    if-eqz p1, :cond_1b

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->j:Z

    .line 15
    .line 16
    if-eqz p1, :cond_16

    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 19
    .line 20
    invoke-static {p1}, Lax/u3/z;->q(Landroid/app/Activity;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 24
    .line 25
    invoke-static {p1}, Lax/u3/z;->g(Lax/n/c;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 29
    .line 30
    invoke-static {p1}, Lax/t3/k;->w(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_28

    .line 35
    .line 36
    iget-object p1, p0, Lcom/voxdon/xplorer/activity/MainActivity$I;->h:Lcom/voxdon/xplorer/activity/MainActivity;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 39
    .line 40
    .line 41
    :cond_28
    :goto_28
    return-void
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
