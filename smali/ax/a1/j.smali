.class public final Lax/a1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a1/j$f;,
        Lax/a1/j$c;,
        Lax/a1/j$e;,
        Lax/a1/j$d;,
        Lax/a1/j$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lax/a1/j$f;

.field private final c:Landroid/os/Handler;

.field private final d:Lax/a1/j$c;

.field private final e:Landroid/content/BroadcastReceiver;

.field private final f:Lax/a1/j$d;

.field private g:Lax/a1/e;

.field private h:Lax/a1/k;

.field private i:Lax/P0/c;

.field private j:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lax/a1/j$f;Lax/P0/c;Lax/a1/k;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lax/a1/j$f;

    .line 15
    .line 16
    iput-object p2, p0, Lax/a1/j;->b:Lax/a1/j$f;

    .line 17
    .line 18
    iput-object p3, p0, Lax/a1/j;->i:Lax/P0/c;

    .line 19
    .line 20
    iput-object p4, p0, Lax/a1/j;->h:Lax/a1/k;

    .line 21
    .line 22
    invoke-static {}, Lax/S0/d0;->C()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lax/a1/j;->c:Landroid/os/Handler;

    .line 27
    .line 28
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 p4, 0x17

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-lt p3, p4, :cond_28

    .line 34
    .line 35
    new-instance p3, Lax/a1/j$c;

    .line 36
    .line 37
    invoke-direct {p3, p0, v0}, Lax/a1/j$c;-><init>(Lax/a1/j;Lax/a1/j$a;)V

    .line 38
    .line 39
    .line 40
    goto :goto_29

    .line 41
    :cond_28
    move-object p3, v0

    .line 42
    :goto_29
    iput-object p3, p0, Lax/a1/j;->d:Lax/a1/j$c;

    .line 43
    .line 44
    new-instance p3, Lax/a1/j$e;

    .line 45
    .line 46
    invoke-direct {p3, p0, v0}, Lax/a1/j$e;-><init>(Lax/a1/j;Lax/a1/j$a;)V

    .line 47
    .line 48
    .line 49
    iput-object p3, p0, Lax/a1/j;->e:Landroid/content/BroadcastReceiver;

    .line 50
    .line 51
    invoke-static {}, Lax/a1/e;->i()Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    if-eqz p3, :cond_41

    .line 56
    .line 57
    new-instance v0, Lax/a1/j$d;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, p0, p2, p1, p3}, Lax/a1/j$d;-><init>(Lax/a1/j;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 64
    .line 65
    .line 66
    :cond_41
    iput-object v0, p0, Lax/a1/j;->f:Lax/a1/j$d;

    .line 67
    .line 68
    return-void
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

.method static synthetic a(Lax/a1/j;)Lax/P0/c;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a1/j;->i:Lax/P0/c;

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

.method static synthetic b(Lax/a1/j;)Lax/a1/k;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a1/j;->h:Lax/a1/k;

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

.method static synthetic c(Lax/a1/j;Lax/a1/k;)Lax/a1/k;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/j;->h:Lax/a1/k;

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

.method static synthetic d(Lax/a1/j;Lax/a1/e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/a1/j;->f(Lax/a1/e;)V

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

.method static synthetic e(Lax/a1/j;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a1/j;->a:Landroid/content/Context;

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

.method private f(Lax/a1/e;)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/a1/j;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lax/a1/j;->g:Lax/a1/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lax/a1/e;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_13

    .line 12
    .line 13
    iput-object p1, p0, Lax/a1/j;->g:Lax/a1/e;

    .line 14
    .line 15
    iget-object v0, p0, Lax/a1/j;->b:Lax/a1/j$f;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lax/a1/j$f;->a(Lax/a1/e;)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method


# virtual methods
.method public g(Lax/a1/e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/a1/j;->f(Lax/a1/e;)V

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

.method public h()Lax/a1/e;
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/a1/j;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget-object v0, p0, Lax/a1/j;->g:Lax/a1/e;

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/a1/e;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lax/a1/j;->j:Z

    .line 16
    .line 17
    iget-object v0, p0, Lax/a1/j;->f:Lax/a1/j$d;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/a1/j$d;->a()V

    .line 22
    .line 23
    .line 24
    :cond_17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x17

    .line 27
    .line 28
    if-lt v0, v1, :cond_28

    .line 29
    .line 30
    iget-object v0, p0, Lax/a1/j;->d:Lax/a1/j$c;

    .line 31
    .line 32
    if-eqz v0, :cond_28

    .line 33
    .line 34
    iget-object v1, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v2, p0, Lax/a1/j;->c:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-static {v1, v0, v2}, Lax/a1/j$b;->a(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object v0, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v1, p0, Lax/a1/j;->e:Landroid/content/BroadcastReceiver;

    .line 44
    .line 45
    new-instance v2, Landroid/content/IntentFilter;

    .line 46
    .line 47
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 48
    .line 49
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    iget-object v4, p0, Lax/a1/j;->c:Landroid/os/Handler;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v2, p0, Lax/a1/j;->i:Lax/P0/c;

    .line 62
    .line 63
    iget-object v3, p0, Lax/a1/j;->h:Lax/a1/k;

    .line 64
    .line 65
    invoke-static {v1, v0, v2, v3}, Lax/a1/e;->e(Landroid/content/Context;Landroid/content/Intent;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lax/a1/j;->g:Lax/a1/e;

    .line 70
    .line 71
    return-object v0
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

.method public i(Lax/P0/c;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/a1/j;->i:Lax/P0/c;

    .line 2
    .line 3
    iget-object v0, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lax/a1/j;->h:Lax/a1/k;

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Lax/a1/e;->f(Landroid/content/Context;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lax/a1/j;->f(Lax/a1/e;)V

    .line 12
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

.method public j(Landroid/media/AudioDeviceInfo;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/j;->h:Lax/a1/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    move-object v0, v1

    .line 7
    goto :goto_9

    .line 8
    :cond_7
    iget-object v0, v0, Lax/a1/k;->a:Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    :goto_9
    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    if-eqz p1, :cond_17

    .line 18
    .line 19
    new-instance v1, Lax/a1/k;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lax/a1/k;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    iput-object v1, p0, Lax/a1/j;->h:Lax/a1/k;

    .line 25
    .line 26
    iget-object p1, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v0, p0, Lax/a1/j;->i:Lax/P0/c;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lax/a1/e;->f(Landroid/content/Context;Lax/P0/c;Lax/a1/k;)Lax/a1/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, Lax/a1/j;->f(Lax/a1/e;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public k()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/a1/j;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lax/a1/j;->g:Lax/a1/e;

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_17

    .line 14
    .line 15
    iget-object v0, p0, Lax/a1/j;->d:Lax/a1/j$c;

    .line 16
    .line 17
    if-eqz v0, :cond_17

    .line 18
    .line 19
    iget-object v1, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lax/a1/j$b;->b(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lax/a1/j;->a:Landroid/content/Context;

    .line 25
    .line 26
    iget-object v1, p0, Lax/a1/j;->e:Landroid/content/BroadcastReceiver;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/a1/j;->f:Lax/a1/j$d;

    .line 32
    .line 33
    if-eqz v0, :cond_25

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/a1/j$d;->b()V

    .line 36
    .line 37
    .line 38
    :cond_25
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lax/a1/j;->j:Z

    .line 40
    .line 41
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
