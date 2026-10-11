.class public Lax/R4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/R4/f;
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


# static fields
.field private static final B0:Ljava/lang/String;

.field public static C0:I


# instance fields
.field A0:Lax/P0/H$d;

.field private c0:Z

.field private final d0:Landroid/net/wifi/WifiManager$WifiLock;

.field private e0:I

.field private f0:Z

.field private g0:Lax/R4/f$a;

.field private final h0:Lax/Q4/b;

.field private volatile i0:Z

.field private volatile j0:I

.field private volatile k0:I

.field private volatile l0:Ljava/lang/String;

.field private volatile m0:Ljava/lang/String;

.field private n0:Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

.field private volatile o0:F

.field private p0:I

.field private final q:Landroid/content/Context;

.field private final q0:Landroid/media/AudioManager;

.field private r0:Z

.field private s0:Lax/R4/d;

.field private final t0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private u0:Z

.field private v0:I

.field private w0:Landroidx/media/a;

.field private final x0:Landroid/content/IntentFilter;

.field private final y0:Landroid/content/BroadcastReceiver;

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/R4/e;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S4/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/R4/e;->B0:Ljava/lang/String;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lax/Q4/b;)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/R4/e;->c0:Z

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v1, p0, Lax/R4/e;->o0:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lax/R4/e;->p0:I

    .line 13
    .line 14
    iput-boolean v1, p0, Lax/R4/e;->r0:Z

    .line 15
    .line 16
    new-instance v2, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lax/R4/e;->t0:Ljava/util/Set;

    .line 22
    .line 23
    new-instance v2, Landroid/content/IntentFilter;

    .line 24
    .line 25
    const-string v3, "android.media.AUDIO_BECOMING_NOISY"

    .line 26
    .line 27
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lax/R4/e;->x0:Landroid/content/IntentFilter;

    .line 31
    .line 32
    new-instance v2, Lax/R4/e$a;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lax/R4/e$a;-><init>(Lax/R4/e;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lax/R4/e;->y0:Landroid/content/BroadcastReceiver;

    .line 38
    .line 39
    new-instance v2, Lax/R4/e$b;

    .line 40
    .line 41
    invoke-direct {v2, p0}, Lax/R4/e$b;-><init>(Lax/R4/e;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lax/R4/e;->A0:Lax/P0/H$d;

    .line 45
    .line 46
    iput-object p1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 47
    .line 48
    iput-object p2, p0, Lax/R4/e;->h0:Lax/Q4/b;

    .line 49
    .line 50
    const-string p2, "audio"

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Landroid/media/AudioManager;

    .line 57
    .line 58
    iput-object p2, p0, Lax/R4/e;->q0:Landroid/media/AudioManager;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string v2, "wifi"

    .line 65
    .line 66
    invoke-virtual {p2, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Landroid/net/wifi/WifiManager;

    .line 71
    .line 72
    if-eqz p2, :cond_53

    .line 73
    .line 74
    const-string v2, "uAmp_lock"

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    invoke-virtual {p2, v3, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iput-object p2, p0, Lax/R4/e;->d0:Landroid/net/wifi/WifiManager$WifiLock;

    .line 82
    .line 83
    goto :goto_56

    .line 84
    :cond_53
    const/4 p2, 0x0

    .line 85
    iput-object p2, p0, Lax/R4/e;->d0:Landroid/net/wifi/WifiManager$WifiLock;

    .line 86
    .line 87
    :goto_56
    iput v1, p0, Lax/R4/e;->e0:I

    .line 88
    .line 89
    new-instance p2, Lax/R4/d;

    .line 90
    .line 91
    iget-boolean v1, p0, Lax/R4/e;->c0:Z

    .line 92
    .line 93
    xor-int/2addr v0, v1

    .line 94
    invoke-direct {p2, p1, v0}, Lax/R4/d;-><init>(Landroid/content/Context;Z)V

    .line 95
    .line 96
    .line 97
    iput-object p2, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 98
    .line 99
    return-void
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

.method static synthetic A(Lax/R4/e;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/R4/e;->F(I)V

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
.end method

.method static synthetic B(Lax/R4/e;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/R4/e;->u0:Z

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

.method static synthetic C(Lax/R4/e;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/R4/e;->u0:Z

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

.method static synthetic D(Lax/R4/e;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R4/e;->S()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic E(Lax/R4/e;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/R4/e;->r0:Z

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

.method private F(I)V
    .registers 5

    .line 1
    sput p1, Lax/R4/e;->C0:I

    .line 2
    .line 3
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    .line 4
    .line 5
    const-string v1, "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "android.media.extra.PACKAGE_NAME"

    .line 11
    .line 12
    iget-object v2, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const-string v1, "android.media.extra.AUDIO_SESSION"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_1e} :catch_1e

    .line 29
    .line 30
    .line 31
    :catch_1e
    return-void
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

.method private G()V
    .registers 8

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lax/R4/e;->p0:I

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v4, "configMediaPlayerState. mAudioFocus="

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    aput-object v4, v3, v5

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    aput-object v1, v3, v4

    .line 19
    .line 20
    invoke-static {v0, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lax/R4/e;->p0:I

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    if-nez v1, :cond_29

    .line 27
    .line 28
    iget v0, p0, Lax/R4/e;->e0:I

    .line 29
    .line 30
    if-ne v0, v3, :cond_a5

    .line 31
    .line 32
    iget-boolean v0, p0, Lax/R4/e;->f0:Z

    .line 33
    .line 34
    xor-int/lit8 v1, v0, 0x1

    .line 35
    .line 36
    xor-int/2addr v0, v4

    .line 37
    invoke-direct {p0, v5, v1, v0}, Lax/R4/e;->N(ZZZ)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_a5

    .line 41
    .line 42
    :cond_29
    if-ne v1, v4, :cond_3c

    .line 43
    .line 44
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 45
    .line 46
    invoke-virtual {v1}, Lax/R4/d;->i()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_4b

    .line 51
    .line 52
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 53
    .line 54
    const v6, 0x3e4ccccd    # 0.2f

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v6}, Lax/R4/d;->x(F)V

    .line 58
    .line 59
    .line 60
    goto :goto_4b

    .line 61
    :cond_3c
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 62
    .line 63
    invoke-virtual {v1}, Lax/R4/d;->i()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_4b

    .line 68
    .line 69
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 70
    .line 71
    const/high16 v6, 0x3f800000    # 1.0f

    .line 72
    .line 73
    invoke-virtual {v1, v6}, Lax/R4/d;->x(F)V

    .line 74
    .line 75
    .line 76
    :cond_4b
    :goto_4b
    iget-boolean v1, p0, Lax/R4/e;->f0:Z

    .line 77
    .line 78
    if-eqz v1, :cond_a5

    .line 79
    .line 80
    iget-boolean v1, p0, Lax/R4/e;->r0:Z

    .line 81
    .line 82
    if-eqz v1, :cond_a5

    .line 83
    .line 84
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 85
    .line 86
    invoke-virtual {v1}, Lax/R4/d;->i()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_a3

    .line 91
    .line 92
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 93
    .line 94
    invoke-virtual {v1}, Lax/R4/d;->k()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_94

    .line 99
    .line 100
    iget v1, p0, Lax/R4/e;->j0:I

    .line 101
    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-array v2, v2, [Ljava/lang/Object;

    .line 107
    .line 108
    const-string v6, "configMediaPlayerState startMediaPlayer. seeking to "

    .line 109
    .line 110
    aput-object v6, v2, v5

    .line 111
    .line 112
    aput-object v1, v2, v4

    .line 113
    .line 114
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget v0, p0, Lax/R4/e;->j0:I

    .line 118
    .line 119
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 120
    .line 121
    invoke-virtual {v1}, Lax/R4/d;->d()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-ne v0, v1, :cond_89

    .line 126
    .line 127
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 128
    .line 129
    invoke-virtual {v0}, Lax/R4/d;->n()V

    .line 130
    .line 131
    .line 132
    iput v3, p0, Lax/R4/e;->e0:I

    .line 133
    .line 134
    invoke-direct {p0}, Lax/R4/e;->O()V

    .line 135
    .line 136
    .line 137
    goto :goto_a3

    .line 138
    :cond_89
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 139
    .line 140
    iget v1, p0, Lax/R4/e;->j0:I

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lax/R4/d;->r(I)V

    .line 143
    .line 144
    .line 145
    const/4 v0, 0x6

    .line 146
    iput v0, p0, Lax/R4/e;->e0:I

    .line 147
    .line 148
    goto :goto_a3

    .line 149
    :cond_94
    iget v1, p0, Lax/R4/e;->e0:I

    .line 150
    .line 151
    if-eq v1, v3, :cond_a3

    .line 152
    .line 153
    new-array v1, v4, [Ljava/lang/Object;

    .line 154
    .line 155
    const-string v2, "configMediaPlayerState already playing : but state is not applied"

    .line 156
    .line 157
    aput-object v2, v1, v5

    .line 158
    .line 159
    invoke-static {v0, v1}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iput v3, p0, Lax/R4/e;->e0:I

    .line 163
    .line 164
    :cond_a3
    :goto_a3
    iput-boolean v5, p0, Lax/R4/e;->f0:Z

    .line 165
    .line 166
    :cond_a5
    :goto_a5
    iget-object v0, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 167
    .line 168
    if-eqz v0, :cond_ae

    .line 169
    .line 170
    iget v1, p0, Lax/R4/e;->e0:I

    .line 171
    .line 172
    invoke-interface {v0, v1}, Lax/R4/f$a;->d(I)V

    .line 173
    .line 174
    .line 175
    :cond_ae
    return-void
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

.method private H()V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lax/R4/e;->B0:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v2, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 5
    .line 6
    invoke-virtual {v2}, Lax/R4/d;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    xor-int/2addr v2, v0

    .line 11
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x2

    .line 16
    new-array v3, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v4, "createMediaPlayerIfNeeded. needed? "

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    aput-object v4, v3, v5

    .line 22
    .line 23
    aput-object v2, v3, v0

    .line 24
    .line 25
    invoke-static {v1, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 29
    .line 30
    invoke-virtual {v1}, Lax/R4/d;->i()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_46

    .line 35
    .line 36
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 37
    .line 38
    invoke-virtual {v1}, Lax/R4/d;->h()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lax/R4/d;->y(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 47
    .line 48
    iget-object v1, p0, Lax/R4/e;->A0:Lax/P0/H$d;

    .line 49
    .line 50
    invoke-virtual {v0, p0, v1}, Lax/R4/d;->v(Lax/R4/e;Lax/P0/H$d;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 54
    .line 55
    invoke-virtual {v0}, Lax/R4/d;->j()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_45

    .line 60
    .line 61
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 62
    .line 63
    invoke-virtual {v0}, Lax/R4/d;->b()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-direct {p0, v0}, Lax/R4/e;->F(I)V

    .line 68
    .line 69
    .line 70
    :cond_45
    return-void

    .line 71
    :cond_46
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 72
    .line 73
    invoke-virtual {v0}, Lax/R4/d;->q()V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public static J()I
    .registers 1

    .line 1
    sget v0, Lax/R4/e;->C0:I

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

.method private K()V
    .registers 5

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "giveUpAudioFocus"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lax/R4/e;->p0:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_1d

    .line 18
    .line 19
    iget-object v0, p0, Lax/R4/e;->w0:Landroidx/media/a;

    .line 20
    .line 21
    if-eqz v0, :cond_1b

    .line 22
    .line 23
    iget-object v1, p0, Lax/R4/e;->q0:Landroid/media/AudioManager;

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroidx/media/b;->a(Landroid/media/AudioManager;Landroidx/media/a;)I

    .line 26
    .line 27
    .line 28
    :cond_1b
    iput v3, p0, Lax/R4/e;->p0:I

    .line 29
    .line 30
    :cond_1d
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
.end method

.method private L(Landroid/net/Uri;)Z
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_17

    .line 12
    .line 13
    const-string v0, "content"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_17
    :goto_17
    const/4 p1, 0x1

    .line 25
    return p1
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

.method private M(Ljava/lang/String;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/R4/e;->f0:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lax/R4/e;->r0:Z

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, p0, Lax/R4/e;->e0:I

    .line 8
    .line 9
    invoke-direct {p0}, Lax/R4/e;->V()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/R4/e;->K()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v1}, Lax/R4/e;->Q(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 19
    .line 20
    if-eqz v2, :cond_27

    .line 21
    .line 22
    iget-object v2, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 23
    .line 24
    sget v3, Lax/P4/i;->a:I

    .line 25
    .line 26
    new-array v4, v1, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object p1, v4, v0

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v2, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-interface {v2, p1, v1, v0, v3}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_27
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
.end method

.method private N(ZZZ)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_5

    .line 3
    .line 4
    iput-boolean v0, p0, Lax/R4/e;->f0:Z

    .line 5
    .line 6
    :cond_5
    iget p3, p0, Lax/R4/e;->e0:I

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-ne p3, v1, :cond_2f

    .line 10
    .line 11
    iget-object p3, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 12
    .line 13
    invoke-virtual {p3}, Lax/R4/d;->i()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_27

    .line 18
    .line 19
    iget-object p3, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 20
    .line 21
    invoke-virtual {p3}, Lax/R4/d;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_27

    .line 26
    .line 27
    iget-object p3, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 28
    .line 29
    invoke-virtual {p3}, Lax/R4/d;->m()V

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 33
    .line 34
    invoke-virtual {p3}, Lax/R4/d;->d()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    iput p3, p0, Lax/R4/e;->j0:I

    .line 39
    .line 40
    :cond_27
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 41
    .line 42
    .line 43
    if-eqz p1, :cond_2f

    .line 44
    .line 45
    invoke-direct {p0}, Lax/R4/e;->K()V

    .line 46
    .line 47
    .line 48
    :cond_2f
    const/4 p1, 0x2

    .line 49
    iput p1, p0, Lax/R4/e;->e0:I

    .line 50
    .line 51
    iget-object p3, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 52
    .line 53
    if-eqz p3, :cond_39

    .line 54
    .line 55
    invoke-interface {p3, p1}, Lax/R4/f$a;->d(I)V

    .line 56
    .line 57
    .line 58
    :cond_39
    if-eqz p2, :cond_3e

    .line 59
    .line 60
    invoke-direct {p0}, Lax/R4/e;->V()V

    .line 61
    .line 62
    .line 63
    :cond_3e
    return-void
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

.method private O()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_19

    .line 8
    .line 9
    iget v0, p0, Lax/R4/e;->o0:F

    .line 10
    .line 11
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/R4/d;->f()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-eqz v0, :cond_19

    .line 20
    .line 21
    iget v0, p0, Lax/R4/e;->o0:F

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lax/R4/e;->g(F)V

    .line 24
    .line 25
    .line 26
    :cond_19
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

.method private P()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/R4/e;->i0:Z

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lax/R4/e;->y0:Landroid/content/BroadcastReceiver;

    .line 8
    .line 9
    iget-object v2, p0, Lax/R4/e;->x0:Landroid/content/IntentFilter;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lax/R4/e;->i0:Z

    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private Q(Z)V
    .registers 7

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v3, "relaxResources. releaseMediaPlayer="

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aput-object v3, v2, v4

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object v1, v2, v3

    .line 17
    .line 18
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_50

    .line 22
    .line 23
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/R4/d;->i()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_50

    .line 30
    .line 31
    :try_start_1e
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 32
    .line 33
    invoke-virtual {p1}, Lax/R4/d;->b()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_42

    .line 38
    .line 39
    new-instance v0, Landroid/content/Intent;

    .line 40
    .line 41
    const-string v1, "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "android.media.extra.AUDIO_SESSION"

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    const-string p1, "android.media.extra.PACKAGE_NAME"

    .line 52
    .line 53
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_42
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_42} :catch_42

    .line 65
    .line 66
    .line 67
    :catch_42
    :cond_42
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 68
    .line 69
    invoke-virtual {p1}, Lax/R4/d;->q()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 73
    .line 74
    invoke-virtual {p1}, Lax/R4/d;->p()V

    .line 75
    .line 76
    .line 77
    sput v4, Lax/R4/e;->C0:I

    .line 78
    .line 79
    iput-boolean v4, p0, Lax/R4/e;->r0:Z

    .line 80
    .line 81
    :cond_50
    iget-object p1, p0, Lax/R4/e;->d0:Landroid/net/wifi/WifiManager$WifiLock;

    .line 82
    .line 83
    if-eqz p1, :cond_5f

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5f

    .line 90
    .line 91
    iget-object p1, p0, Lax/R4/e;->d0:Landroid/net/wifi/WifiManager$WifiLock;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 94
    .line 95
    .line 96
    :cond_5f
    return-void
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
.end method

.method private R(Ljava/lang/String;)Z
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-boolean v1, p0, Lax/R4/e;->u0:Z

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v1, :cond_5b

    .line 6
    .line 7
    invoke-static {p1}, Lax/P2/b;->d(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_5b

    .line 12
    .line 13
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v1}, Lax/P2/a;->c(Landroid/content/Context;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p1, v1}, Lax/P2/b;->e(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_45

    .line 24
    .line 25
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v1}, Lax/P2/a;->n(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lax/P2/b;->g()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_45

    .line 35
    .line 36
    invoke-static {p1}, Lax/P2/b;->c(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_45

    .line 41
    .line 42
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/R4/d;->u()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 48
    .line 49
    invoke-virtual {p1}, Lax/R4/d;->d()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 58
    .line 59
    .line 60
    iput p1, p0, Lax/R4/e;->j0:I

    .line 61
    .line 62
    iget-object p1, p0, Lax/R4/e;->n0:Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lax/R4/e;->b(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)V

    .line 65
    .line 66
    .line 67
    iput-boolean v0, p0, Lax/R4/e;->u0:Z

    .line 68
    .line 69
    return v0

    .line 70
    :cond_45
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 71
    .line 72
    sget v3, Lax/P4/i;->c:I

    .line 73
    .line 74
    new-array v4, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object p1, v4, v2

    .line 77
    .line 78
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v2, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 83
    .line 84
    if-eqz v2, :cond_5a

    .line 85
    .line 86
    const/16 v3, 0xfa5

    .line 87
    .line 88
    invoke-interface {v2, v1, v0, v3, p1}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_5a
    return v0

    .line 92
    :cond_5b
    return v2
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
.end method

.method private S()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/R4/d;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_e

    .line 12
    .line 13
    iget-object v0, p0, Lax/R4/e;->m0:Ljava/lang/String;

    .line 14
    .line 15
    :cond_e
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_16

    .line 21
    .line 22
    return v2

    .line 23
    :cond_16
    iget-object v1, p0, Lax/R4/e;->t0:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2f

    .line 35
    .line 36
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/R4/d;->d()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, Lax/R4/e;->j0:I

    .line 47
    .line 48
    :cond_2f
    iget-object v0, p0, Lax/R4/e;->n0:Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 49
    .line 50
    if-nez v0, :cond_34

    .line 51
    .line 52
    return v2

    .line 53
    :cond_34
    invoke-virtual {p0, v0}, Lax/R4/e;->b(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    return v0
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

.method private T()Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lax/R4/e;->v0:I

    .line 3
    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x0

    .line 6
    if-ge v1, v2, :cond_93

    .line 7
    .line 8
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 9
    .line 10
    invoke-virtual {v1}, Lax/R4/d;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_93

    .line 15
    .line 16
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 17
    .line 18
    invoke-virtual {v1}, Lax/R4/d;->j()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_93

    .line 23
    .line 24
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 25
    .line 26
    invoke-virtual {v1}, Lax/R4/d;->l()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_21

    .line 31
    .line 32
    goto/16 :goto_93

    .line 33
    .line 34
    :cond_21
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 35
    .line 36
    invoke-virtual {v1}, Lax/R4/d;->d()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/lit16 v1, v1, 0xc8

    .line 45
    .line 46
    iget-object v2, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 47
    .line 48
    invoke-virtual {v2}, Lax/R4/d;->e()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    cmp-long v2, v4, v6

    .line 58
    .line 59
    if-eqz v2, :cond_48

    .line 60
    .line 61
    const-wide/16 v6, 0x0

    .line 62
    .line 63
    cmp-long v2, v4, v6

    .line 64
    .line 65
    if-lez v2, :cond_48

    .line 66
    .line 67
    int-to-long v6, v1

    .line 68
    cmp-long v2, v6, v4

    .line 69
    .line 70
    if-ltz v2, :cond_48

    .line 71
    .line 72
    return v3

    .line 73
    :cond_48
    iget v2, p0, Lax/R4/e;->e0:I

    .line 74
    .line 75
    const/4 v4, 0x3

    .line 76
    if-eq v2, v4, :cond_54

    .line 77
    .line 78
    iget-boolean v2, p0, Lax/R4/e;->f0:Z

    .line 79
    .line 80
    if-eqz v2, :cond_52

    .line 81
    .line 82
    goto :goto_54

    .line 83
    :cond_52
    const/4 v2, 0x0

    .line 84
    goto :goto_55

    .line 85
    :cond_54
    :goto_54
    const/4 v2, 0x1

    .line 86
    :goto_55
    iget v4, p0, Lax/R4/e;->v0:I

    .line 87
    .line 88
    add-int/2addr v4, v0

    .line 89
    iput v4, p0, Lax/R4/e;->v0:I

    .line 90
    .line 91
    iput-boolean v3, p0, Lax/R4/e;->r0:Z

    .line 92
    .line 93
    iput-boolean v3, p0, Lax/R4/e;->z0:Z

    .line 94
    .line 95
    iput v1, p0, Lax/R4/e;->j0:I

    .line 96
    .line 97
    if-eqz v2, :cond_64

    .line 98
    .line 99
    const/4 v4, 0x6

    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 v4, 0x2

    .line 102
    :goto_65
    iput v4, p0, Lax/R4/e;->e0:I

    .line 103
    .line 104
    iget-object v5, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 105
    .line 106
    if-eqz v5, :cond_6e

    .line 107
    .line 108
    invoke-interface {v5, v4}, Lax/R4/f$a;->d(I)V

    .line 109
    .line 110
    .line 111
    :cond_6e
    :try_start_6e
    iget-object v4, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 112
    .line 113
    invoke-virtual {v4}, Lax/R4/d;->z()V

    .line 114
    .line 115
    .line 116
    iget-object v4, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 117
    .line 118
    invoke-virtual {v4}, Lax/R4/d;->o()V

    .line 119
    .line 120
    .line 121
    iget-object v4, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Lax/R4/d;->r(I)V

    .line 124
    .line 125
    .line 126
    if-eqz v2, :cond_87

    .line 127
    .line 128
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 129
    .line 130
    invoke-virtual {v1}, Lax/R4/d;->n()V
    :try_end_84
    .catch Ljava/lang/IllegalStateException; {:try_start_6e .. :try_end_84} :catch_85

    .line 131
    .line 132
    .line 133
    goto :goto_87

    .line 134
    :catch_85
    move-exception v1

    .line 135
    goto :goto_88

    .line 136
    :cond_87
    :goto_87
    return v0

    .line 137
    :goto_88
    sget-object v2, Lax/R4/e;->B0:Ljava/lang/String;

    .line 138
    .line 139
    new-array v0, v0, [Ljava/lang/Object;

    .line 140
    .line 141
    const-string v4, "Decoder error seek retry failed"

    .line 142
    .line 143
    aput-object v4, v0, v3

    .line 144
    .line 145
    invoke-static {v2, v1, v0}, Lax/S4/b;->b(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_93
    :goto_93
    return v3
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

.method private U()Z
    .registers 6

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "tryToGetAudioFocus"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lax/R4/e;->p0:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_51

    .line 18
    .line 19
    iget-object v0, p0, Lax/R4/e;->w0:Landroidx/media/a;

    .line 20
    .line 21
    if-nez v0, :cond_3e

    .line 22
    .line 23
    new-instance v0, Landroidx/media/AudioAttributesCompat$a;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/media/AudioAttributesCompat$a;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/media/AudioAttributesCompat$a;->b(I)Landroidx/media/AudioAttributesCompat$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Landroidx/media/AudioAttributesCompat$a;->c(I)Landroidx/media/AudioAttributesCompat$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/media/AudioAttributesCompat$a;->a()Landroidx/media/AudioAttributesCompat;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v3, Landroidx/media/a$b;

    .line 41
    .line 42
    invoke-direct {v3, v1}, Landroidx/media/a$b;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroidx/media/a$b;->g(Z)Landroidx/media/a$b;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3, v0}, Landroidx/media/a$b;->c(Landroidx/media/AudioAttributesCompat;)Landroidx/media/a$b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p0}, Landroidx/media/a$b;->e(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroidx/media/a$b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroidx/media/a$b;->a()Landroidx/media/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lax/R4/e;->w0:Landroidx/media/a;

    .line 62
    .line 63
    :cond_3e
    iget-object v0, p0, Lax/R4/e;->q0:Landroid/media/AudioManager;

    .line 64
    .line 65
    iget-object v3, p0, Lax/R4/e;->w0:Landroidx/media/a;

    .line 66
    .line 67
    invoke-static {v0, v3}, Landroidx/media/b;->b(Landroid/media/AudioManager;Landroidx/media/a;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v1, :cond_4b

    .line 72
    .line 73
    iput v2, p0, Lax/R4/e;->p0:I

    .line 74
    .line 75
    return v1

    .line 76
    :cond_4b
    iget v0, p0, Lax/R4/e;->p0:I

    .line 77
    .line 78
    if-ne v0, v1, :cond_50

    .line 79
    .line 80
    return v1

    .line 81
    :cond_50
    return v4

    .line 82
    :cond_51
    return v1
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
.end method

.method private V()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/e;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    :try_start_4
    iget-object v0, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lax/R4/e;->y0:Landroid/content/BroadcastReceiver;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_b} :catch_b

    .line 10
    .line 11
    .line 12
    :catch_b
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lax/R4/e;->i0:Z

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private W(Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lax/R4/e;->X(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/R4/d;->j()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq v0, p1, :cond_19

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lax/R4/d;

    .line 18
    .line 19
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Lax/R4/d;-><init>(Landroid/content/Context;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 25
    .line 26
    :cond_19
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

.method private X(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/R4/e;->c0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/e;->t0:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_f
    :goto_f
    const/4 p1, 0x1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic m()Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

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

.method static synthetic o(Lax/R4/e;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/e;->q:Landroid/content/Context;

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

.method static synthetic p(Lax/R4/e;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/R4/e;->z0:Z

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

.method static synthetic q(Lax/R4/e;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/R4/e;->z0:Z

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

.method static synthetic r(Lax/R4/e;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/R4/e;->j0:I

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

.method static synthetic s(Lax/R4/e;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/R4/e;->e0:I

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

.method static synthetic t(Lax/R4/e;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/R4/e;->e0:I

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

.method static synthetic u(Lax/R4/e;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R4/e;->O()V

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

.method static synthetic v(Lax/R4/e;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R4/e;->G()V

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

.method static synthetic w(Lax/R4/e;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/R4/e;->T()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic x(Lax/R4/e;)Lax/R4/d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/e;->s0:Lax/R4/d;

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

.method static synthetic y(Lax/R4/e;Ljava/lang/String;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/R4/e;->R(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic z(Lax/R4/e;)Lax/R4/f$a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/R4/e;->g0:Lax/R4/f$a;

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


# virtual methods
.method public I()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 3
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
.end method

.method public a()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public b(Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;)V
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p1, :cond_14

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    if-eqz v3, :cond_14

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    move-object v3, v2

    .line 22
    :goto_15
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_21

    .line 27
    .line 28
    const-string p1, "Invalid media item"

    .line 29
    .line 30
    invoke-direct {p0, p1}, Lax/R4/e;->M(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    invoke-static {v3}, Lax/S4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, p0, Lax/R4/e;->h0:Lax/Q4/b;

    .line 39
    .line 40
    invoke-virtual {v5, v4}, Lax/Q4/b;->e(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-nez v4, :cond_33

    .line 45
    .line 46
    const-string p1, "Missing media metadata"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Lax/R4/e;->M(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    const-string v5, "__SOURCE__"

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Landroid/support/v4/media/MediaMetadataCompat;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_45

    .line 63
    .line 64
    const-string p1, "Missing media source"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Lax/R4/e;->M(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_45
    iput-object p1, p0, Lax/R4/e;->n0:Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 71
    .line 72
    iput-boolean v1, p0, Lax/R4/e;->f0:Z

    .line 73
    .line 74
    invoke-direct {p0}, Lax/R4/e;->U()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_55

    .line 79
    .line 80
    const-string p1, "Audio focus request failed"

    .line 81
    .line 82
    invoke-direct {p0, p1}, Lax/R4/e;->M(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    invoke-direct {p0}, Lax/R4/e;->P()V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lax/R4/e;->m0:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_7b

    .line 96
    .line 97
    iget v5, p0, Lax/R4/e;->k0:I

    .line 98
    .line 99
    if-eqz v5, :cond_73

    .line 100
    .line 101
    if-eqz v3, :cond_73

    .line 102
    .line 103
    iget-object v5, p0, Lax/R4/e;->l0:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_73

    .line 110
    .line 111
    iget v5, p0, Lax/R4/e;->k0:I

    .line 112
    .line 113
    iput v5, p0, Lax/R4/e;->j0:I

    .line 114
    .line 115
    goto :goto_75

    .line 116
    :cond_73
    iput v0, p0, Lax/R4/e;->j0:I

    .line 117
    .line 118
    :goto_75
    iput v0, p0, Lax/R4/e;->k0:I

    .line 119
    .line 120
    iput-object v2, p0, Lax/R4/e;->l0:Ljava/lang/String;

    .line 121
    .line 122
    iput-object v3, p0, Lax/R4/e;->m0:Ljava/lang/String;

    .line 123
    .line 124
    :cond_7b
    invoke-direct {p0, v3}, Lax/R4/e;->W(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v5, 0x6

    .line 128
    if-eqz p1, :cond_9f

    .line 129
    .line 130
    iget-object v6, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 131
    .line 132
    invoke-virtual {v6}, Lax/R4/d;->i()Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_9f

    .line 137
    .line 138
    iget v6, p0, Lax/R4/e;->e0:I

    .line 139
    .line 140
    const/4 v7, 0x3

    .line 141
    if-ne v6, v7, :cond_99

    .line 142
    .line 143
    iget-object v6, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 144
    .line 145
    invoke-virtual {v6}, Lax/R4/d;->k()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_99

    .line 150
    .line 151
    iput-boolean v0, p0, Lax/R4/e;->f0:Z

    .line 152
    .line 153
    return-void

    .line 154
    :cond_99
    iget v6, p0, Lax/R4/e;->e0:I

    .line 155
    .line 156
    if-ne v6, v5, :cond_9f

    .line 157
    .line 158
    goto/16 :goto_153

    .line 159
    .line 160
    :cond_9f
    iget v6, p0, Lax/R4/e;->e0:I

    .line 161
    .line 162
    const/4 v7, 0x2

    .line 163
    if-ne v6, v7, :cond_b2

    .line 164
    .line 165
    if-eqz p1, :cond_b2

    .line 166
    .line 167
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 168
    .line 169
    invoke-virtual {p1}, Lax/R4/d;->i()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_b2

    .line 174
    .line 175
    invoke-direct {p0}, Lax/R4/e;->G()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_b2
    iput v1, p0, Lax/R4/e;->e0:I

    .line 180
    .line 181
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 182
    .line 183
    .line 184
    :try_start_b7
    invoke-direct {p0}, Lax/R4/e;->H()V

    .line 185
    .line 186
    .line 187
    iput v5, p0, Lax/R4/e;->e0:I

    .line 188
    .line 189
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 190
    .line 191
    invoke-virtual {p1}, Lax/R4/d;->s()V

    .line 192
    .line 193
    .line 194
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget-object v4, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 199
    .line 200
    invoke-virtual {v4, v3, p1}, Lax/R4/d;->t(Ljava/lang/String;Landroid/net/Uri;)V

    .line 201
    .line 202
    .line 203
    iput-boolean v0, p0, Lax/R4/e;->r0:Z

    .line 204
    .line 205
    iput-boolean v0, p0, Lax/R4/e;->u0:Z

    .line 206
    .line 207
    iput v0, p0, Lax/R4/e;->v0:I

    .line 208
    .line 209
    iget-object v3, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 210
    .line 211
    invoke-virtual {v3}, Lax/R4/d;->o()V

    .line 212
    .line 213
    .line 214
    invoke-direct {p0, p1}, Lax/R4/e;->L(Landroid/net/Uri;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_ed

    .line 219
    .line 220
    iget-object p1, p0, Lax/R4/e;->d0:Landroid/net/wifi/WifiManager$WifiLock;

    .line 221
    .line 222
    if-eqz p1, :cond_ed

    .line 223
    .line 224
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 225
    .line 226
    .line 227
    goto :goto_ed

    .line 228
    :catch_e3
    move-exception p1

    .line 229
    goto :goto_f7

    .line 230
    :catch_e5
    move-exception p1

    .line 231
    goto :goto_11a

    .line 232
    :catch_e7
    move-exception p1

    .line 233
    goto :goto_13d

    .line 234
    :catch_e9
    move-exception p1

    .line 235
    goto :goto_13d

    .line 236
    :catch_eb
    move-exception p1

    .line 237
    goto :goto_13d

    .line 238
    :cond_ed
    :goto_ed
    iget-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 239
    .line 240
    if-eqz p1, :cond_153

    .line 241
    .line 242
    iget v3, p0, Lax/R4/e;->e0:I

    .line 243
    .line 244
    invoke-interface {p1, v3}, Lax/R4/f$a;->d(I)V
    :try_end_f6
    .catch Ljava/io/IOException; {:try_start_b7 .. :try_end_f6} :catch_eb
    .catch Ljava/lang/IllegalStateException; {:try_start_b7 .. :try_end_f6} :catch_e9
    .catch Ljava/lang/SecurityException; {:try_start_b7 .. :try_end_f6} :catch_e7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b7 .. :try_end_f6} :catch_e5
    .catch Ljava/lang/NullPointerException; {:try_start_b7 .. :try_end_f6} :catch_e3

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :goto_f7
    iget-object v3, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 249
    .line 250
    invoke-static {v3}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    const-string v4, "MEDIA PLAYER ERROR"

    .line 259
    .line 260
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v3}, Lax/Ha/b;->h()V

    .line 269
    .line 270
    .line 271
    iget-object v3, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 272
    .line 273
    if-eqz v3, :cond_153

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-interface {v3, p1, v1, v0, v2}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_153

    .line 283
    :goto_11a
    iget-object v3, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 284
    .line 285
    invoke-static {v3}, Lax/Ha/c;->i(Landroid/content/Context;)Lax/Ha/b;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const-string v4, "MEDIA PLAYER ILLEGAL ARGUMENT ERROR"

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v3, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-virtual {v3}, Lax/Ha/b;->h()V

    .line 304
    .line 305
    .line 306
    iget-object v3, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 307
    .line 308
    if-eqz v3, :cond_153

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-interface {v3, p1, v1, v0, v2}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 315
    .line 316
    .line 317
    goto :goto_153

    .line 318
    :goto_13d
    sget-object v3, Lax/R4/e;->B0:Ljava/lang/String;

    .line 319
    .line 320
    new-array v4, v1, [Ljava/lang/Object;

    .line 321
    .line 322
    const-string v5, "Exception playing song"

    .line 323
    .line 324
    aput-object v5, v4, v0

    .line 325
    .line 326
    invoke-static {v3, p1, v4}, Lax/S4/b;->b(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iget-object v3, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 330
    .line 331
    if-eqz v3, :cond_153

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-interface {v3, p1, v1, v0, v2}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_153
    :goto_153
    return-void
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
.end method

.method public c(Z)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lax/R4/e;->e0:I

    .line 3
    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 7
    .line 8
    if-eqz p1, :cond_c

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lax/R4/f$a;->d(I)V

    .line 11
    .line 12
    .line 13
    :cond_c
    invoke-virtual {p0}, Lax/R4/e;->j()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lax/R4/e;->j0:I

    .line 18
    .line 19
    invoke-direct {p0}, Lax/R4/e;->K()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lax/R4/e;->V()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lax/R4/e;->Q(Z)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public d(Ljava/lang/String;I)V
    .registers 3

    .line 1
    iput p2, p0, Lax/R4/e;->j0:I

    .line 2
    .line 3
    iput p2, p0, Lax/R4/e;->k0:I

    .line 4
    .line 5
    iput-object p1, p0, Lax/R4/e;->l0:Ljava/lang/String;

    .line 6
    .line 7
    return-void
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

.method public e(I)V
    .registers 7

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v3, "seekTo called with "

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aput-object v3, v2, v4

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput-object v1, v2, v3

    .line 17
    .line 18
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1f

    .line 28
    .line 29
    iput p1, p0, Lax/R4/e;->j0:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget v0, p0, Lax/R4/e;->e0:I

    .line 33
    .line 34
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 35
    .line 36
    invoke-virtual {v1}, Lax/R4/d;->k()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2c

    .line 41
    .line 42
    const/4 v1, 0x6

    .line 43
    iput v1, p0, Lax/R4/e;->e0:I

    .line 44
    .line 45
    :cond_2c
    iget-object v1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lax/R4/d;->r(I)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lax/R4/e;->e0:I

    .line 51
    .line 52
    if-eq v0, p1, :cond_3c

    .line 53
    .line 54
    iget-object v0, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 55
    .line 56
    if-eqz v0, :cond_3c

    .line 57
    .line 58
    invoke-interface {v0, p1}, Lax/R4/f$a;->d(I)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    return-void
.end method

.method public f()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, v0, v0}, Lax/R4/e;->N(ZZZ)V

    .line 3
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
.end method

.method public g(F)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/R4/d;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-ge v0, v1, :cond_13

    .line 14
    .line 15
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iput p1, p0, Lax/R4/e;->o0:F

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iput p1, p0, Lax/R4/e;->o0:F

    .line 21
    .line 22
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1e

    .line 29
    .line 30
    goto :goto_39

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 32
    .line 33
    invoke-virtual {v0}, Lax/R4/d;->j()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2c

    .line 38
    .line 39
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lax/R4/d;->w(F)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 46
    .line 47
    invoke-virtual {v0}, Lax/R4/d;->k()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_39

    .line 52
    .line 53
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lax/R4/d;->w(F)V

    .line 56
    .line 57
    .line 58
    :cond_39
    :goto_39
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method public getState()I
    .registers 2

    .line 1
    iget v0, p0, Lax/R4/e;->e0:I

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

.method public h(Z)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lax/R4/e;->c0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_16

    .line 4
    .line 5
    iput-boolean p1, p0, Lax/R4/e;->c0:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lax/R4/e;->Q(Z)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/R4/d;

    .line 12
    .line 13
    iget-object v1, p0, Lax/R4/e;->q:Landroid/content/Context;

    .line 14
    .line 15
    iget-boolean v2, p0, Lax/R4/e;->c0:Z

    .line 16
    .line 17
    xor-int/2addr p1, v2

    .line 18
    invoke-direct {v0, v1, p1}, Lax/R4/d;-><init>(Landroid/content/Context;Z)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

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

.method public i()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/e;->m0:Ljava/lang/String;

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

.method public j()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/R4/d;->d()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_f
    iget v0, p0, Lax/R4/e;->j0:I

    .line 17
    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public k(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/R4/e;->j0:I

    .line 2
    .line 3
    return-void
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

.method public l(Lax/R4/f$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 2
    .line 3
    return-void
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

.method public n()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/R4/e;->f0:Z

    .line 2
    .line 3
    if-nez v0, :cond_17

    .line 4
    .line 5
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/R4/d;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_15

    .line 12
    .line 13
    iget-object v0, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/R4/d;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_17
    :goto_17
    const/4 v0, 0x1

    .line 25
    return v0
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

.method public onAudioFocusChange(I)V
    .registers 9

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v3, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v4, "onAudioFocusChange. focusChange="

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v4, v3, v5

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput-object v1, v3, v4

    .line 17
    .line 18
    invoke-static {v0, v3}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-ne p1, v4, :cond_19

    .line 22
    .line 23
    iput v2, p0, Lax/R4/e;->p0:I

    .line 24
    .line 25
    goto :goto_48

    .line 26
    :cond_19
    const/4 v1, -0x3

    .line 27
    const/4 v3, -0x2

    .line 28
    const/4 v6, -0x1

    .line 29
    if-eq p1, v6, :cond_33

    .line 30
    .line 31
    if-eq p1, v3, :cond_33

    .line 32
    .line 33
    if-ne p1, v1, :cond_23

    .line 34
    .line 35
    goto :goto_33

    .line 36
    :cond_23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-array v1, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    const-string v2, "onAudioFocusChange: Ignoring unsupported focusChange: "

    .line 43
    .line 44
    aput-object v2, v1, v5

    .line 45
    .line 46
    aput-object p1, v1, v4

    .line 47
    .line 48
    invoke-static {v0, v1}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_48

    .line 52
    :cond_33
    :goto_33
    if-ne p1, v1, :cond_37

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    const/4 v0, 0x0

    .line 57
    :goto_38
    iput v0, p0, Lax/R4/e;->p0:I

    .line 58
    .line 59
    if-ne p1, v6, :cond_3f

    .line 60
    .line 61
    iput-boolean v5, p0, Lax/R4/e;->f0:Z

    .line 62
    .line 63
    goto :goto_48

    .line 64
    :cond_3f
    iget v0, p0, Lax/R4/e;->e0:I

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    if-ne v0, v1, :cond_48

    .line 68
    .line 69
    if-ne p1, v3, :cond_48

    .line 70
    .line 71
    iput-boolean v4, p0, Lax/R4/e;->f0:Z

    .line 72
    .line 73
    :cond_48
    :goto_48
    invoke-direct {p0}, Lax/R4/e;->G()V

    .line 74
    .line 75
    .line 76
    return-void
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
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .registers 5

    .line 1
    sget-object p1, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v1, "onCompletion from MediaPlayer"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v1, v0, v2

    .line 10
    .line 11
    invoke-static {p1, v0}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lax/R4/e;->e(I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 18
    .line 19
    if-eqz p1, :cond_17

    .line 20
    .line 21
    invoke-interface {p1}, Lax/R4/f$a;->c()V

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .registers 8

    .line 1
    sget-object p1, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "Media player error: what="

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", extra="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x1

    .line 29
    new-array v2, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    invoke-static {p1, v2}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 38
    .line 39
    if-eqz p1, :cond_4a

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "MediaPlayer error "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p2, " ("

    .line 55
    .line 56
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p2, ")"

    .line 63
    .line 64
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const/4 p3, 0x0

    .line 72
    invoke-interface {p1, p2, v3, v3, p3}, Lax/R4/f$a;->b(Ljava/lang/String;ZILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    return v1
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

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .registers 6

    .line 1
    sget-object p1, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-array v1, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "onPrepared from MediaPlayer"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    invoke-static {p1, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lax/R4/e;->r0:Z

    .line 15
    .line 16
    invoke-direct {p0}, Lax/R4/e;->G()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .registers 7

    .line 1
    sget-object v0, Lax/R4/e;->B0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v3, "onSeekComplete from MediaPlayer:"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object v3, v2, v4

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    aput-object v1, v2, v3

    .line 21
    .line 22
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lax/R4/e;->j0:I

    .line 30
    .line 31
    iget p1, p0, Lax/R4/e;->e0:I

    .line 32
    .line 33
    const/4 v0, 0x6

    .line 34
    if-ne p1, v0, :cond_2e

    .line 35
    .line 36
    iget-object p1, p0, Lax/R4/e;->s0:Lax/R4/d;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/R4/d;->n()V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x3

    .line 42
    iput p1, p0, Lax/R4/e;->e0:I

    .line 43
    .line 44
    invoke-direct {p0}, Lax/R4/e;->O()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iget-object p1, p0, Lax/R4/e;->g0:Lax/R4/f$a;

    .line 48
    .line 49
    if-eqz p1, :cond_37

    .line 50
    .line 51
    iget v0, p0, Lax/R4/e;->e0:I

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lax/R4/f$a;->d(I)V

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
