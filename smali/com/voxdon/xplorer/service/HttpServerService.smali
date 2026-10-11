.class public Lcom/voxdon/xplorer/service/HttpServerService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/service/HttpServerService$e;
    }
.end annotation


# static fields
.field private static final n:Ljava/util/logging/Logger;

.field private static o:Z

.field private static p:Lcom/voxdon/xplorer/service/HttpServerService;

.field private static q:Z


# instance fields
.field private a:Lcom/voxdon/xplorer/service/HttpServerService$e;

.field private b:Z

.field private c:Z

.field private d:Landroid/os/Handler;

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/voxdon/xplorer/file/o;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Z

.field private h:J

.field private i:Lax/u3/D;

.field private j:Lcom/voxdon/xplorer/service/b$a;

.field k:Ljava/lang/Runnable;

.field l:Z

.field m:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-class v0, Lcom/voxdon/xplorer/service/HttpServerService;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/voxdon/xplorer/service/HttpServerService;->o:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    sput-object v1, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 14
    .line 15
    sput-boolean v0, Lcom/voxdon/xplorer/service/HttpServerService;->q:Z

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

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
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lax/B/b;

    .line 16
    .line 17
    invoke-direct {v0}, Lax/B/b;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Lcom/voxdon/xplorer/service/HttpServerService$a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/service/HttpServerService$a;-><init>(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->j:Lcom/voxdon/xplorer/service/b$a;

    .line 28
    .line 29
    new-instance v0, Lcom/voxdon/xplorer/service/HttpServerService$b;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/service/HttpServerService$b;-><init>(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 35
    .line 36
    new-instance v0, Lcom/voxdon/xplorer/service/HttpServerService$c;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/service/HttpServerService$c;-><init>(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->m:Landroid/content/BroadcastReceiver;

    .line 42
    .line 43
    return-void
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

.method static synthetic a(Lcom/voxdon/xplorer/service/HttpServerService;)Lcom/voxdon/xplorer/service/HttpServerService$e;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

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

.method static synthetic b(Lcom/voxdon/xplorer/service/HttpServerService;Lcom/voxdon/xplorer/service/HttpServerService$e;)Lcom/voxdon/xplorer/service/HttpServerService$e;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic c(Lcom/voxdon/xplorer/service/HttpServerService;)I
    .registers 1

    .line 1
    iget p0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->f:I

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

.method static synthetic d(Lcom/voxdon/xplorer/service/HttpServerService;I)I
    .registers 2

    .line 1
    iput p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->f:I

    .line 2
    .line 3
    return p1
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

.method static synthetic e()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 2
    .line 3
    return-object v0
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
.end method

.method static synthetic f(Lcom/voxdon/xplorer/service/HttpServerService;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

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

.method static synthetic g(Lcom/voxdon/xplorer/service/HttpServerService;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic h()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/service/HttpServerService;->q:Z

    .line 2
    .line 3
    return v0
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
.end method

.method static synthetic i(Lcom/voxdon/xplorer/service/HttpServerService;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->w()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic j(Lcom/voxdon/xplorer/service/HttpServerService;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->c:Z

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

.method public static l(ILcom/voxdon/xplorer/file/n;)Landroid/net/Uri;
    .registers 5

    .line 1
    new-instance v0, Landroid/net/Uri$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "http"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "127.0.0.1:"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1}, Lax/o3/c;->C(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
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

.method private n(Landroid/content/Intent;Z)Landroid/app/Notification;
    .registers 4

    .line 1
    invoke-static {p0}, Lax/s3/u;->j(Landroid/content/Context;)Lax/s3/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lax/s3/u;->e(Landroid/app/Service;Landroid/content/Intent;Z)Landroid/app/Notification;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public static p()Lcom/voxdon/xplorer/service/HttpServerService$e;
    .registers 1

    .line 1
    sget-boolean v0, Lcom/voxdon/xplorer/service/HttpServerService;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->o()Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_b
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService$e;->q:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static q(Landroid/content/Context;Lax/Q2/f;IZZZLandroid/content/Intent;)V
    .registers 9

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lcom/voxdon/xplorer/service/HttpServerService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "location"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p1, "location_key"

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string p1, "play_intent"

    .line 19
    .line 20
    invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const-string p1, "music_playback"

    .line 24
    .line 25
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    const-string p1, "is_multimedia"

    .line 29
    .line 30
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    if-nez p5, :cond_2a

    .line 35
    .line 36
    invoke-static {p0}, Lax/u3/B;->V(Landroid/content/Context;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2a

    .line 41
    .line 42
    const/4 p5, 0x1

    .line 43
    :cond_2a
    const-string p2, "need_foreground"

    .line 44
    .line 45
    invoke-virtual {v0, p2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    if-eqz p5, :cond_4e

    .line 49
    .line 50
    :try_start_31
    invoke-static {p0, v0, p1, p1}, Lax/u3/B;->f0(Landroid/content/Context;Landroid/content/Intent;ZZ)V

    .line 51
    .line 52
    .line 53
    sput-boolean p1, Lcom/voxdon/xplorer/service/HttpServerService;->q:Z
    :try_end_36
    .catch Ljava/lang/IllegalStateException; {:try_start_31 .. :try_end_36} :catch_37

    .line 54
    .line 55
    return-void

    .line 56
    :catch_37
    move-exception p1

    .line 57
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p2, "START HTTP SERVICE FOREGROUND"

    .line 66
    .line 67
    invoke-virtual {p0, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4e
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 80
    .line 81
    .line 82
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method public static v(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/service/HttpServerService;->p()Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_35

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p0, v0, :cond_19

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p0, v0, :cond_11

    .line 16
    .line 17
    goto :goto_3c

    .line 18
    :cond_11
    sget-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 19
    .line 20
    if-eqz p0, :cond_3c

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->t()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    sget-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 27
    .line 28
    if-eqz p0, :cond_2d

    .line 29
    .line 30
    iget-boolean p0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2d

    .line 33
    .line 34
    invoke-static {}, Lcom/example/android/uamp/MusicService;->I()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2d

    .line 39
    .line 40
    sget-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->r()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    sget-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 47
    .line 48
    if-eqz p0, :cond_3c

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->r()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    sget-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 55
    .line 56
    if-eqz p0, :cond_3c

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->t()V

    .line 59
    .line 60
    .line 61
    :cond_3c
    :goto_3c
    return-void
.end method

.method private w()V
    .registers 6

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-lez v4, :cond_24

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->h:J

    .line 14
    .line 15
    sub-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x64

    .line 17
    .line 18
    cmp-long v4, v0, v2

    .line 19
    .line 20
    if-gez v4, :cond_20

    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v1, Lcom/voxdon/xplorer/service/HttpServerService$d;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lcom/voxdon/xplorer/service/HttpServerService$d;-><init>(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 38
    .line 39
    .line 40
    return-void
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
.method k()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1a

    .line 4
    .line 5
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/Q2/b;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1a

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z

    .line 16
    .line 17
    if-eqz v0, :cond_25

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 28
    .line 29
    if-nez v0, :cond_25

    .line 30
    .line 31
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lax/Q2/b;->m()Z

    .line 36
    .line 37
    .line 38
    :cond_25
    return-void
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

.method declared-synchronized m()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z

    .line 3
    .line 4
    if-eqz v0, :cond_19

    .line 5
    .line 6
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 7
    .line 8
    const-string v1, "Cancel timeout to stop multimedia server"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_17

    .line 22
    .line 23
    goto :goto_19

    .line 24
    :catchall_17
    move-exception v0

    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    :goto_19
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1b
    :try_start_1b
    monitor-exit p0
    :try_end_1c
    .catchall {:try_start_1b .. :try_end_1c} :catchall_17

    .line 29
    throw v0
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

.method o()Lcom/voxdon/xplorer/service/HttpServerService$e;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 2

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .registers 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 5
    .line 6
    const-string v1, "Http server created"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService$e;->q:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z

    .line 17
    .line 18
    new-instance v0, Landroid/content/IntentFilter;

    .line 19
    .line 20
    const-string v1, "local.intent.action.LOCAL_PLAYBACK_STOP"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->m:Landroid/content/BroadcastReceiver;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Lax/L0/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lax/u3/D;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    const-string v2, "HTTP_SERVER"

    .line 38
    .line 39
    invoke-direct {v0, p0, v1, v2}, Lax/u3/D;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->i:Lax/u3/D;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public onDestroy()V
    .registers 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->m()V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->j:Lcom/voxdon/xplorer/service/b$a;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/service/b;->n(Lcom/voxdon/xplorer/service/b$a;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_29

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/voxdon/xplorer/file/o;

    .line 33
    .line 34
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v1}, Lcom/voxdon/xplorer/service/b;->o(Lcom/voxdon/xplorer/file/o;)V

    .line 39
    .line 40
    .line 41
    goto :goto_15

    .line 42
    :cond_29
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_39

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 54
    .line 55
    .line 56
    iput-boolean v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z

    .line 57
    .line 58
    :cond_39
    sput-boolean v1, Lcom/voxdon/xplorer/service/HttpServerService;->o:Z

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    sput-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 62
    .line 63
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->m:Landroid/content/BroadcastReceiver;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lax/L0/a;->f(Landroid/content/BroadcastReceiver;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->i:Lax/u3/D;

    .line 73
    .line 74
    invoke-virtual {v0}, Lax/u3/D;->c()V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 78
    .line 79
    const-string v1, "Http server stopped"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 7

    .line 1
    const/4 p2, 0x1

    .line 2
    if-nez p1, :cond_7

    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    goto :goto_1b

    .line 8
    :cond_7
    const-string p3, "play_intent"

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    check-cast p3, Landroid/content/Intent;

    .line 15
    .line 16
    const-string v0, "is_multimedia"

    .line 17
    .line 18
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "need_foreground"

    .line 23
    .line 24
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :goto_1b
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_43

    .line 30
    .line 31
    :try_start_1e
    sput-boolean v2, Lcom/voxdon/xplorer/service/HttpServerService;->q:Z

    .line 32
    .line 33
    invoke-direct {p0, p3, v0}, Lcom/voxdon/xplorer/service/HttpServerService;->n(Landroid/content/Intent;Z)Landroid/app/Notification;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const/16 v0, 0xe8

    .line 38
    .line 39
    invoke-virtual {p0, v0, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iput-wide v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->h:J

    .line 47
    .line 48
    iput-boolean p2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z
    :try_end_31
    .catch Ljava/lang/IllegalStateException; {:try_start_1e .. :try_end_31} :catch_32

    .line 49
    .line 50
    goto :goto_43

    .line 51
    :catch_32
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    const-string v0, "Foreground not allowed : http server service"

    .line 60
    .line 61
    invoke-virtual {p3, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-virtual {p3}, Lax/Ha/b;->h()V

    .line 66
    .line 67
    .line 68
    :cond_43
    :goto_43
    sput-object p0, Lcom/voxdon/xplorer/service/HttpServerService;->p:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 69
    .line 70
    sput-boolean p2, Lcom/voxdon/xplorer/service/HttpServerService;->o:Z

    .line 71
    .line 72
    const/4 p3, 0x2

    .line 73
    if-nez p1, :cond_58

    .line 74
    .line 75
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/voxdon/xplorer/service/b;->i()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_57

    .line 84
    .line 85
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->w()V

    .line 86
    .line 87
    .line 88
    :cond_57
    return p3

    .line 89
    :cond_58
    const-string v0, "location"

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lax/Q2/f;

    .line 96
    .line 97
    const-string v1, "location_key"

    .line 98
    .line 99
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v0, :cond_a8

    .line 104
    .line 105
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string p2, "HTTP SERVER NO LOCATION"

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "op:"

    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/b;->i()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 153
    .line 154
    .line 155
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Lcom/voxdon/xplorer/service/b;->i()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_a7

    .line 164
    .line 165
    invoke-direct {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->w()V

    .line 166
    .line 167
    .line 168
    :cond_a7
    return p3

    .line 169
    :cond_a8
    invoke-static {v0, v1}, Lax/c3/x;->d(Lax/Q2/f;I)Lcom/voxdon/xplorer/file/o;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v1, "music_playback"

    .line 174
    .line 175
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_c1

    .line 180
    .line 181
    iput-boolean p2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 182
    .line 183
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_c3

    .line 190
    .line 191
    iput-boolean p2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->c:Z

    .line 192
    .line 193
    goto :goto_c3

    .line 194
    :cond_c1
    iput-boolean v2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->c:Z

    .line 195
    .line 196
    :cond_c3
    :goto_c3
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 197
    .line 198
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-nez p1, :cond_d7

    .line 203
    .line 204
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->e:Ljava/util/Set;

    .line 205
    .line 206
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/service/b;->e(Lcom/voxdon/xplorer/file/o;)V

    .line 214
    .line 215
    .line 216
    :cond_d7
    invoke-static {p0}, Lcom/voxdon/xplorer/service/b;->f(Landroid/content/Context;)Lcom/voxdon/xplorer/service/b;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    iget-object p2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->j:Lcom/voxdon/xplorer/service/b$a;

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/service/b;->d(Lcom/voxdon/xplorer/service/b$a;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->m()V

    .line 226
    .line 227
    .line 228
    sget-object p1, Lcom/voxdon/xplorer/service/HttpServerService$e;->q:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 229
    .line 230
    iput-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/voxdon/xplorer/service/HttpServerService;->r()V

    .line 233
    .line 234
    .line 235
    iget-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->i:Lax/u3/D;

    .line 236
    .line 237
    invoke-virtual {p1}, Lax/u3/D;->a()V

    .line 238
    .line 239
    .line 240
    return p3
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public onTimeout(II)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onTimeout(II)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Exception;

    .line 5
    .line 6
    const-string p2, "HttpServerServiceTimeout"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "http server service timeout"

    .line 12
    .line 13
    invoke-static {p2, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-static {p0, p1}, Lax/o3/d;->a(Lcom/voxdon/xplorer/service/HttpServerService;I)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method declared-synchronized r()V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->a:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 3
    .line 4
    sget-object v1, Lcom/voxdon/xplorer/service/HttpServerService$e;->q:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 5
    .line 6
    if-ne v0, v1, :cond_31

    .line 7
    .line 8
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Start timeout to stop multimedia server : onstart : (music:"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean v2, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ")"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 40
    .line 41
    const-wide/32 v2, 0x2bf20

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 45
    .line 46
    .line 47
    goto :goto_7f

    .line 48
    :catchall_2f
    move-exception v0

    .line 49
    goto :goto_84

    .line 50
    :cond_31
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->b:Z

    .line 51
    .line 52
    const-wide/32 v1, 0x927c0

    .line 53
    .line 54
    .line 55
    if-eqz v0, :cond_56

    .line 56
    .line 57
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 58
    .line 59
    const-string v3, "Start timeout to stop multimedia server : music playback pause"

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->g:Z

    .line 65
    .line 66
    if-eqz v0, :cond_4b

    .line 67
    .line 68
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 71
    .line 72
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 73
    .line 74
    .line 75
    goto :goto_7f

    .line 76
    :cond_4b
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 79
    .line 80
    const-wide/32 v2, 0x1b7740

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 84
    .line 85
    .line 86
    goto :goto_7f

    .line 87
    :cond_56
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lax/Q2/b;->m()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_71

    .line 96
    .line 97
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 98
    .line 99
    const-string v1, "Start timeout to stop multimedia server : foreground"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 105
    .line 106
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 107
    .line 108
    const-wide/16 v2, 0xbb8

    .line 109
    .line 110
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    .line 112
    .line 113
    goto :goto_7f

    .line 114
    :cond_71
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 115
    .line 116
    const-string v3, "Start timeout to stop multimedia server : background"

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 122
    .line 123
    iget-object v3, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 124
    .line 125
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 126
    .line 127
    .line 128
    :goto_7f
    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z
    :try_end_82
    .catchall {:try_start_1 .. :try_end_82} :catchall_2f

    .line 130
    .line 131
    monitor-exit p0

    .line 132
    return-void

    .line 133
    :goto_84
    :try_start_84
    monitor-exit p0
    :try_end_85
    .catchall {:try_start_84 .. :try_end_85} :catchall_2f

    .line 134
    throw v0
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method declared-synchronized s()V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 3
    .line 4
    const-string v1, "Start timeout to stop multimedia server : music playback stop"

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 12
    .line 13
    const-wide/16 v2, 0xbb8

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_16

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    :try_start_17
    monitor-exit p0
    :try_end_18
    .catchall {:try_start_17 .. :try_end_18} :catchall_16

    .line 25
    throw v0
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
.end method

.method declared-synchronized t()V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 3
    .line 4
    const-string v1, "Start timeout to stop multimedia server : onResume UI"

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 12
    .line 13
    const-wide/16 v2, 0xbb8

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_16

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    :try_start_17
    monitor-exit p0
    :try_end_18
    .catchall {:try_start_17 .. :try_end_18} :catchall_16

    .line 25
    throw v0
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
.end method

.method declared-synchronized u()V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    sget-object v0, Lcom/voxdon/xplorer/service/HttpServerService;->n:Ljava/util/logging/Logger;

    .line 3
    .line 4
    const-string v1, "Start timeout to stop multimedia server : wating foreground"

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->d:Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/voxdon/xplorer/service/HttpServerService;->k:Ljava/lang/Runnable;

    .line 12
    .line 13
    const-wide/16 v2, 0x7530

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_16

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    :try_start_17
    monitor-exit p0
    :try_end_18
    .catchall {:try_start_17 .. :try_end_18} :catchall_16

    .line 25
    throw v0
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
.end method
