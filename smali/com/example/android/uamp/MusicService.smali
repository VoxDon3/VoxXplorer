.class public Lcom/example/android/uamp/MusicService;
.super Lax/M0/c;
.source "SourceFile"

# interfaces
.implements Lax/R4/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/android/uamp/MusicService$b;
    }
.end annotation


# static fields
.field private static final r:Ljava/lang/String;

.field private static s:Z

.field private static t:I

.field private static u:Z

.field private static v:Z


# instance fields
.field private j:Lax/Q4/b;

.field private k:Lax/R4/g;

.field private l:Landroid/support/v4/media/session/MediaSessionCompat;

.field private m:Lax/P4/d;

.field private final n:Lcom/example/android/uamp/MusicService$b;

.field private o:Lax/P4/g;

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/example/android/uamp/MusicService;->s:Z

    .line 11
    .line 12
    sput v0, Lcom/example/android/uamp/MusicService;->t:I

    .line 13
    .line 14
    sput-boolean v0, Lcom/example/android/uamp/MusicService;->u:Z

    .line 15
    .line 16
    sput-boolean v0, Lcom/example/android/uamp/MusicService;->v:Z

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/M0/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/example/android/uamp/MusicService$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/example/android/uamp/MusicService$b;-><init>(Lcom/example/android/uamp/MusicService;Lcom/example/android/uamp/MusicService$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 11
    .line 12
    return-void
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

.method static synthetic B(Lcom/example/android/uamp/MusicService;)Landroid/support/v4/media/session/MediaSessionCompat;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

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

.method static synthetic C(Lcom/example/android/uamp/MusicService;)Lax/R4/g;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

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

.method static synthetic D()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

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

.method private static E(Landroid/content/Context;)I
    .registers 3

    .line 1
    const-string v0, "musicplayer"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "repeatmode"

    .line 9
    .line 10
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static F(Landroid/content/Context;)I
    .registers 3

    .line 1
    const-string v0, "musicplayer"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "shufflemode"

    .line 9
    .line 10
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static G()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/example/android/uamp/MusicService;->s:Z

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

.method public static H()Z
    .registers 1

    .line 1
    sget-boolean v0, Lcom/example/android/uamp/MusicService;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    sget-boolean v0, Lcom/example/android/uamp/MusicService;->v:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public static I()Z
    .registers 2

    .line 1
    sget-boolean v0, Lcom/example/android/uamp/MusicService;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    sget v0, Lcom/example/android/uamp/MusicService;->t:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_f

    .line 9
    .line 10
    sget-boolean v0, Lcom/example/android/uamp/MusicService;->u:Z

    .line 11
    .line 12
    if-eqz v0, :cond_f

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static J(Landroid/content/Context;I)V
    .registers 4

    .line 1
    const-string v0, "musicplayer"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "repeatmode"

    .line 9
    .line 10
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eq v1, p1, :cond_1a

    .line 15
    .line 16
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    return-void
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

.method private static K(Landroid/content/Context;I)V
    .registers 4

    .line 1
    const-string v0, "musicplayer"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "shufflemode"

    .line 9
    .line 10
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eq v1, p1, :cond_1a

    .line 15
    .line 16
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    return-void
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

.method public static L(Landroid/content/Context;)V
    .registers 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "local.intent.action.LOCAL_PLAYLIST_SAVE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, v0}, Lax/L0/a;->d(Landroid/content/Intent;)Z

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
.end method

.method public static M(Landroid/content/Context;)V
    .registers 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "local.intent.action.LOCAL_PLAYLIST_CLEAR"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, v0}, Lax/L0/a;->d(Landroid/content/Intent;)Z

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
.end method

.method public static N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 6

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "local.intent.action.LOCAL_PLAYLIST_SAVE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "folder_uri"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p1, "media_id"

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string p1, "current_position"

    .line 19
    .line 20
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, v0}, Lax/L0/a;->d(Landroid/content/Intent;)Z

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method private O(ZZ)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lcom/example/android/uamp/MusicService;->p:Z

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/example/android/uamp/MusicService;->q:Z

    .line 4
    .line 5
    return-void
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


# virtual methods
.method public a(Lax/R4/f;Z)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p2}, Lcom/example/android/uamp/MusicService;->O(ZZ)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz p2, :cond_16

    .line 13
    .line 14
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 15
    .line 16
    const-wide/32 v2, 0x1b7740

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 20
    .line 21
    .line 22
    goto :goto_1d

    .line 23
    :cond_16
    iget-object v2, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 24
    .line 25
    const-wide/16 v3, 0x7530

    .line 26
    .line 27
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 28
    .line 29
    .line 30
    :goto_1d
    invoke-static {}, Lax/P4/b;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2d

    .line 35
    .line 36
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 37
    .line 38
    if-eqz v0, :cond_36

    .line 39
    .line 40
    xor-int/lit8 v2, p2, 0x1

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lax/P4/d;->r(Z)V

    .line 43
    .line 44
    .line 45
    goto :goto_36

    .line 46
    :cond_2d
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 47
    .line 48
    if-eqz v0, :cond_36

    .line 49
    .line 50
    xor-int/lit8 v2, p2, 0x1

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lax/P4/d;->r(Z)V

    .line 53
    .line 54
    .line 55
    :cond_36
    :goto_36
    new-instance v0, Landroid/content/Intent;

    .line 56
    .line 57
    const-string v2, "local.intent.action.LOCAL_PLAYBACK_STOP"

    .line 58
    .line 59
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v2, "state"

    .line 63
    .line 64
    if-eqz p2, :cond_46

    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    goto :goto_49

    .line 71
    :cond_46
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    :goto_49
    invoke-static {p0}, Lax/L0/a;->b(Landroid/content/Context;)Lax/L0/a;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, v0}, Lax/L0/a;->d(Landroid/content/Intent;)Z

    .line 79
    .line 80
    .line 81
    if-eqz p2, :cond_63

    .line 82
    .line 83
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 84
    .line 85
    invoke-virtual {p2}, Lax/Q4/b;->d()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-interface {p1}, Lax/R4/f;->i()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {p1}, Lax/R4/f;->j()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-static {p0, p2, v0, p1}, Lcom/example/android/uamp/MusicService;->N(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    :cond_63
    return-void
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

.method public b()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/S4/a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/P4/d;->t()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public c(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->j()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lcom/example/android/uamp/MusicService;->t:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/Q4/b;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput-boolean v0, Lcom/example/android/uamp/MusicService;->v:Z

    .line 17
    .line 18
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/R4/g;->B()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput-boolean v0, Lcom/example/android/uamp/MusicService;->u:Z

    .line 25
    .line 26
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 27
    .line 28
    if-eqz v0, :cond_20

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->m(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    return-void
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

.method public d()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v1, v0}, Lcom/example/android/uamp/MusicService;->O(ZZ)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_12

    .line 13
    .line 14
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/content/Intent;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v2, Lcom/example/android/uamp/MusicService;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    :try_start_23
    invoke-static {p0, v0}, Lax/P4/k;->d(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_26
    .catch Ljava/lang/IllegalStateException; {:try_start_23 .. :try_end_26} :catch_27

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_27
    move-exception v0

    .line 41
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "MUSIC SERVICE START FOREGROUND ERROR"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public e(Lax/R4/f;Ljava/lang/String;ZZ)V
    .registers 7

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1, p1}, Lcom/example/android/uamp/MusicService;->O(ZZ)V

    .line 3
    .line 4
    .line 5
    if-eqz p2, :cond_58

    .line 6
    .line 7
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 8
    .line 9
    invoke-virtual {p2}, Lax/R4/g;->x()Lax/R4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    instance-of p2, p2, Lax/R4/e;

    .line 14
    .line 15
    if-eqz p2, :cond_1b

    .line 16
    .line 17
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 18
    .line 19
    invoke-virtual {p2}, Lax/R4/g;->x()Lax/R4/f;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lax/R4/e;

    .line 24
    .line 25
    invoke-virtual {p2}, Lax/R4/e;->I()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    if-eqz p2, :cond_47

    .line 32
    .line 33
    invoke-virtual {p2}, Lax/P4/d;->p()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_47

    .line 38
    .line 39
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 40
    .line 41
    invoke-virtual {p2}, Lax/P4/d;->o()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_47

    .line 46
    .line 47
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 48
    .line 49
    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 53
    .line 54
    const-wide/16 v0, 0x251c

    .line 55
    .line 56
    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lax/P4/b;->a()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_53

    .line 64
    .line 65
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 66
    .line 67
    const/4 p2, 0x1

    .line 68
    invoke-virtual {p1, p2}, Lax/P4/d;->r(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_53

    .line 72
    :cond_47
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 78
    .line 79
    const-wide/16 v0, 0x7530

    .line 80
    .line 81
    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 82
    .line 83
    .line 84
    :cond_53
    :goto_53
    if-eqz p4, :cond_58

    .line 85
    .line 86
    invoke-static {p0}, Lcom/example/android/uamp/MusicService;->M(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    return-void
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
.end method

.method public g(F)V
    .registers 2

    .line 1
    return-void
.end method

.method public j(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->p(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/example/android/uamp/MusicService;->J(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public m(Ljava/lang/String;Landroid/os/Bundle;Lax/M0/c$l;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Lax/M0/c$l<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lax/M0/c;->m(Ljava/lang/String;Landroid/os/Bundle;Lax/M0/c$l;)V

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

.method public n(Ljava/lang/String;ILandroid/os/Bundle;)Lax/M0/c$e;
    .registers 9

    .line 1
    sget-object v0, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "OnGetRoot: clientPackageName="

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "; clientUid="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " ; rootHints="

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x3

    .line 43
    new-array v3, v3, [Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    aput-object v1, v3, v4

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    aput-object v2, v3, v1

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object p3, v3, v2

    .line 53
    .line 54
    invoke-static {v0, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lcom/example/android/uamp/MusicService;->o:Lax/P4/g;

    .line 58
    .line 59
    if-nez p3, :cond_43

    .line 60
    .line 61
    new-instance p3, Lax/P4/g;

    .line 62
    .line 63
    invoke-direct {p3, p0}, Lax/P4/g;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    iput-object p3, p0, Lcom/example/android/uamp/MusicService;->o:Lax/P4/g;

    .line 67
    .line 68
    :cond_43
    iget-object p3, p0, Lcom/example/android/uamp/MusicService;->o:Lax/P4/g;

    .line 69
    .line 70
    invoke-virtual {p3, p0, p1, p2}, Lax/P4/g;->a(Landroid/content/Context;Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    const/4 p3, 0x0

    .line 75
    if-nez p2, :cond_65

    .line 76
    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "OnGetRoot: IGNORING request from untrusted package "

    .line 83
    .line 84
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-array p2, v1, [Ljava/lang/Object;

    .line 95
    .line 96
    aput-object p1, p2, v4

    .line 97
    .line 98
    invoke-static {v0, p2}, Lax/S4/b;->j(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object p3

    .line 102
    :cond_65
    new-instance p1, Lax/M0/c$e;

    .line 103
    .line 104
    const-string p2, "__ROOT__"

    .line 105
    .line 106
    invoke-direct {p1, p2, p3}, Lax/M0/c$e;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    return-object p1
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

.method public o(Ljava/lang/String;Lax/M0/c$l;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lax/M0/c$l<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "OnLoadChildren: parentMediaId="

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object p1, v1, v2

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, p1, v1}, Lax/Q4/b;->c(Ljava/lang/String;Landroid/content/res/Resources;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p2, p1}, Lax/M0/c$l;->f(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public onCreate()V
    .registers 13

    .line 1
    const-string v0, "MusicService"

    .line 2
    .line 3
    invoke-super {p0}, Lax/M0/c;->onCreate()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    new-array v3, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v4, "onCreate"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    aput-object v4, v3, v5

    .line 15
    .line 16
    invoke-static {v1, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sput-boolean v2, Lcom/example/android/uamp/MusicService;->s:Z

    .line 20
    .line 21
    new-instance v1, Lax/Q4/b;

    .line 22
    .line 23
    invoke-direct {v1}, Lax/Q4/b;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 27
    .line 28
    new-instance v10, Lax/R4/h;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Lcom/example/android/uamp/MusicService$a;

    .line 37
    .line 38
    invoke-direct {v3, p0}, Lcom/example/android/uamp/MusicService$a;-><init>(Lcom/example/android/uamp/MusicService;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v10, p0, v1, v2, v3}, Lax/R4/h;-><init>(Landroid/content/Context;Lax/Q4/b;Landroid/content/res/Resources;Lax/R4/h$b;)V

    .line 42
    .line 43
    .line 44
    new-instance v11, Lax/R4/e;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 47
    .line 48
    invoke-direct {v11, p0, v1}, Lax/R4/e;-><init>(Landroid/content/Context;Lax/Q4/b;)V

    .line 49
    .line 50
    .line 51
    new-instance v6, Lax/R4/g;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iget-object v9, p0, Lcom/example/android/uamp/MusicService;->j:Lax/Q4/b;

    .line 58
    .line 59
    move-object v7, p0

    .line 60
    invoke-direct/range {v6 .. v11}, Lax/R4/g;-><init>(Lax/R4/g$c;Landroid/content/res/Resources;Lax/Q4/b;Lax/R4/h;Lax/R4/f;)V

    .line 61
    .line 62
    .line 63
    iput-object v6, v7, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    :try_start_41
    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat;

    .line 67
    .line 68
    invoke-direct {v2, p0, v0}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, v7, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;
    :try_end_48
    .catch Ljava/lang/IllegalArgumentException; {:try_start_41 .. :try_end_48} :catch_4d
    .catch Ljava/lang/SecurityException; {:try_start_41 .. :try_end_48} :catch_49

    .line 72
    .line 73
    goto :goto_63

    .line 74
    :catch_49
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_4d
    new-instance v2, Landroid/content/ComponentName;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-class v4, Landroidx/media/session/MediaButtonReceiver;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Landroid/support/v4/media/session/MediaSessionCompat;

    .line 94
    .line 95
    invoke-direct {v3, p0, v0, v2, v1}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V

    .line 96
    .line 97
    .line 98
    iput-object v3, v7, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 99
    .line 100
    :goto_63
    invoke-static {p0}, Lcom/example/android/uamp/MusicService;->E(Landroid/content/Context;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {p0}, Lcom/example/android/uamp/MusicService;->F(Landroid/content/Context;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    iget-object v3, v7, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 109
    .line 110
    invoke-virtual {v3, v2, v0}, Lax/R4/g;->C(II)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v7, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->c()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p0, v0}, Lax/M0/c;->A(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v7, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 123
    .line 124
    iget-object v2, v7, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 125
    .line 126
    invoke-virtual {v2}, Lax/R4/g;->w()Landroid/support/v4/media/session/MediaSessionCompat$b;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->h(Landroid/support/v4/media/session/MediaSessionCompat$b;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v7, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 134
    .line 135
    const/4 v2, 0x3

    .line 136
    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->k(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v7, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 140
    .line 141
    invoke-virtual {v0, v1, v5, v1}, Lax/R4/g;->N(Ljava/lang/String;ILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :try_start_8f
    new-instance v0, Lax/P4/d;

    .line 145
    .line 146
    invoke-direct {v0, p0}, Lax/P4/d;-><init>(Lcom/example/android/uamp/MusicService;)V

    .line 147
    .line 148
    .line 149
    iput-object v0, v7, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;
    :try_end_96
    .catch Landroid/os/RemoteException; {:try_start_8f .. :try_end_96} :catch_97

    .line 150
    .line 151
    return-void

    .line 152
    :catch_97
    move-exception v0

    .line 153
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    const-string v2, "Could not create a MediaNotificationManager"

    .line 156
    .line 157
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    throw v1
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

.method public onDestroy()V
    .registers 5

    .line 1
    invoke-super {p0}, Lax/M0/c;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/android/uamp/MusicService;->r:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "onDestroy"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sput-boolean v3, Lcom/example/android/uamp/MusicService;->s:Z

    .line 18
    .line 19
    sput v3, Lcom/example/android/uamp/MusicService;->t:I

    .line 20
    .line 21
    sput-boolean v3, Lcom/example/android/uamp/MusicService;->v:Z

    .line 22
    .line 23
    sput-boolean v3, Lcom/example/android/uamp/MusicService;->u:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Lax/R4/g;->A(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 32
    .line 33
    if-eqz v0, :cond_25

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/P4/d;->u()V

    .line 36
    .line 37
    .line 38
    :cond_25
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 44
    .line 45
    if-eqz v0, :cond_31

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->f()V

    .line 48
    .line 49
    .line 50
    :cond_31
    return-void
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

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 10

    .line 1
    const-wide/16 p2, 0x2710

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez p1, :cond_1a

    .line 8
    .line 9
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 10
    .line 11
    if-eqz p1, :cond_f

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lax/P4/d;->r(Z)V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 22
    .line 23
    invoke-virtual {p1, v3, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :cond_1a
    const-string v4, "START_FOREGROUND"

    .line 28
    .line 29
    invoke-virtual {p1, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_5f

    .line 34
    .line 35
    :try_start_22
    iget-object v4, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 36
    .line 37
    if-eqz v4, :cond_5f

    .line 38
    .line 39
    invoke-virtual {v4}, Lax/P4/d;->l()V
    :try_end_29
    .catch Ljava/lang/IllegalStateException; {:try_start_22 .. :try_end_29} :catch_2a

    .line 40
    .line 41
    .line 42
    goto :goto_5f

    .line 43
    :catch_2a
    invoke-static {p0}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v4, "MUSIC SERVICE START BACKGROUND"

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "intent:"

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 91
    .line 92
    invoke-virtual {p1, v3, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 93
    .line 94
    .line 95
    return v2

    .line 96
    :cond_5f
    :goto_5f
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    const-string p3, "CMD_NAME"

    .line 101
    .line 102
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    const-string v4, "com.example.android.uamp.ACTION_CMD"

    .line 107
    .line 108
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_7f

    .line 113
    .line 114
    const-string p1, "CMD_PAUSE"

    .line 115
    .line 116
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_84

    .line 121
    .line 122
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->k:Lax/R4/g;

    .line 123
    .line 124
    invoke-virtual {p1}, Lax/R4/g;->y()V

    .line 125
    .line 126
    .line 127
    return v2

    .line 128
    :cond_7f
    iget-object p2, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 129
    .line 130
    invoke-static {p2, p1}, Landroidx/media/session/MediaButtonReceiver;->c(Landroid/support/v4/media/session/MediaSessionCompat;Landroid/content/Intent;)Landroid/view/KeyEvent;

    .line 131
    .line 132
    .line 133
    :cond_84
    iget-boolean p1, p0, Lcom/example/android/uamp/MusicService;->p:Z

    .line 134
    .line 135
    if-nez p1, :cond_ac

    .line 136
    .line 137
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_98

    .line 144
    .line 145
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 146
    .line 147
    invoke-virtual {p1, v3}, Landroid/os/Handler;->hasMessages(I)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_ac

    .line 152
    .line 153
    :cond_98
    iget-boolean p1, p0, Lcom/example/android/uamp/MusicService;->q:Z

    .line 154
    .line 155
    if-eqz p1, :cond_b8

    .line 156
    .line 157
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 158
    .line 159
    if-eqz p1, :cond_b8

    .line 160
    .line 161
    invoke-virtual {p1}, Lax/P4/d;->o()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_b8

    .line 166
    .line 167
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->m:Lax/P4/d;

    .line 168
    .line 169
    invoke-virtual {p1, v3}, Lax/P4/d;->r(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_b8

    .line 173
    :cond_ac
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 174
    .line 175
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lcom/example/android/uamp/MusicService;->n:Lcom/example/android/uamp/MusicService$b;

    .line 179
    .line 180
    const-wide/16 p2, 0x7530

    .line 181
    .line 182
    invoke-virtual {p1, v3, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 183
    .line 184
    .line 185
    :cond_b8
    :goto_b8
    return v2
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

.method public p(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService;->l:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->q(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/example/android/uamp/MusicService;->K(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    return-void
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
