.class final Landroidx/media3/exoplayer/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/g$a;
    }
.end annotation


# instance fields
.field private final a:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroid/media/AudioManager;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/Handler;

.field private c:Landroidx/media3/exoplayer/g$a;

.field private d:Lax/P0/c;

.field private e:I

.field private f:I

.field private g:F

.field private h:Lax/Q0/f;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Landroidx/media3/exoplayer/g$a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/media3/exoplayer/g;->g:F

    .line 7
    .line 8
    new-instance v0, Landroidx/media3/exoplayer/f;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/f;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lax/q7/v;->a(Lax/q7/u;)Lax/q7/u;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/g;->a:Lax/q7/u;

    .line 18
    .line 19
    iput-object p3, p0, Landroidx/media3/exoplayer/g;->c:Landroidx/media3/exoplayer/g$a;

    .line 20
    .line 21
    new-instance p1, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroidx/media3/exoplayer/g;->b:Landroid/os/Handler;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 30
    .line 31
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

.method public static synthetic a(Landroid/content/Context;)Landroid/media/AudioManager;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/Q0/m;->c(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic b(Landroidx/media3/exoplayer/g;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/g;->g(I)V

    return-void
.end method

.method private c()V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_19

    .line 5
    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    goto :goto_19

    .line 9
    :cond_8
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->h:Lax/Q0/f;

    .line 10
    .line 11
    if-eqz v0, :cond_19

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->a:Lax/q7/u;

    .line 14
    .line 15
    invoke-interface {v0}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/media/AudioManager;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/g;->h:Lax/Q0/f;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lax/Q0/m;->b(Landroid/media/AudioManager;Lax/Q0/f;)I

    .line 24
    .line 25
    .line 26
    :cond_19
    :goto_19
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

.method private static d(Lax/P0/c;)I
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    iget v1, p0, Lax/P0/c;->c:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const-string v4, "AudioFocusManager"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v1, :pswitch_data_36

    .line 13
    .line 14
    .line 15
    :pswitch_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Unidentified audio usage: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget p0, p0, Lax/P0/c;->c:I

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {v4, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :pswitch_25
    const/4 p0, 0x4

    .line 39
    return p0

    .line 40
    :pswitch_27
    iget p0, p0, Lax/P0/c;->a:I

    .line 41
    .line 42
    if-ne p0, v5, :cond_2c

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2c
    :pswitch_2c
    return v2

    .line 46
    :pswitch_2d
    return v0

    .line 47
    :pswitch_2e
    return v3

    .line 48
    :pswitch_2f
    return v5

    .line 49
    :pswitch_30
    const-string p0, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."

    .line 50
    .line 51
    invoke-static {v4, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return v5

    .line 55
    :pswitch_data_36
    .packed-switch 0x0
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2e
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_27
        :pswitch_2c
        :pswitch_2c
        :pswitch_2f
        :pswitch_e
        :pswitch_25
    .end packed-switch
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private e(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->c:Landroidx/media3/exoplayer/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/g$a;->d(I)V

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
    .line 22
.end method

.method private g(I)V
    .registers 4

    .line 1
    const/4 v0, -0x3

    .line 2
    const/4 v1, -0x2

    .line 3
    if-eq p1, v0, :cond_35

    .line 4
    .line 5
    if-eq p1, v1, :cond_35

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p1, v0, :cond_2b

    .line 10
    .line 11
    if-eq p1, v1, :cond_23

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Unknown focus change type: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "AudioFocusManager"

    .line 31
    .line 32
    invoke-static {v0, p1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/g;->e(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/g;->e(I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->c()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    if-eq p1, v1, :cond_43

    .line 55
    .line 56
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->o()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3e

    .line 61
    .line 62
    goto :goto_43

    .line 63
    :cond_3e
    const/4 p1, 0x4

    .line 64
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    :goto_43
    const/4 p1, 0x0

    .line 69
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/g;->e(I)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x3

    .line 73
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/g;->l(I)V

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

.method private i()I
    .registers 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->j()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne v0, v1, :cond_11

    .line 13
    .line 14
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 19
    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    return v0
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
.end method

.method private j()I
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->h:Lax/Q0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-boolean v1, p0, Landroidx/media3/exoplayer/g;->i:Z

    .line 6
    .line 7
    if-eqz v1, :cond_3e

    .line 8
    .line 9
    :cond_8
    if-nez v0, :cond_12

    .line 10
    .line 11
    new-instance v0, Lax/Q0/f$b;

    .line 12
    .line 13
    iget v1, p0, Landroidx/media3/exoplayer/g;->f:I

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lax/Q0/f$b;-><init>(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_16

    .line 19
    :cond_12
    invoke-virtual {v0}, Lax/Q0/f;->a()Lax/Q0/f$b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_16
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->o()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/g;->d:Lax/P0/c;

    .line 28
    .line 29
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lax/P0/c;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lax/Q0/f$b;->b(Lax/P0/c;)Lax/Q0/f$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1}, Lax/Q0/f$b;->d(Z)Lax/Q0/f$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Landroidx/media3/exoplayer/e;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/e;-><init>(Landroidx/media3/exoplayer/g;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/g;->b:Landroid/os/Handler;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lax/Q0/f$b;->c(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)Lax/Q0/f$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lax/Q0/f$b;->a()Lax/Q0/f;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Landroidx/media3/exoplayer/g;->h:Lax/Q0/f;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Landroidx/media3/exoplayer/g;->i:Z

    .line 62
    .line 63
    :cond_3e
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->a:Lax/q7/u;

    .line 64
    .line 65
    invoke-interface {v0}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/media/AudioManager;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/media3/exoplayer/g;->h:Lax/Q0/f;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lax/Q0/m;->h(Landroid/media/AudioManager;Lax/Q0/f;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    return v0
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

.method private l(I)V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_5

    .line 4
    .line 5
    goto :goto_20

    .line 6
    :cond_5
    iput p1, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_e

    .line 10
    .line 11
    const p1, 0x3e4ccccd    # 0.2f

    .line 12
    .line 13
    .line 14
    goto :goto_10

    .line 15
    :cond_e
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    :goto_10
    iget v0, p0, Landroidx/media3/exoplayer/g;->g:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_17

    .line 22
    .line 23
    goto :goto_20

    .line 24
    :cond_17
    iput p1, p0, Landroidx/media3/exoplayer/g;->g:F

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->c:Landroidx/media3/exoplayer/g$a;

    .line 27
    .line 28
    if-eqz v0, :cond_20

    .line 29
    .line 30
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/g$a;->c(F)V

    .line 31
    .line 32
    .line 33
    :cond_20
    :goto_20
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

.method private m(I)Z
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_8

    .line 3
    .line 4
    iget p1, p0, Landroidx/media3/exoplayer/g;->f:I

    .line 5
    .line 6
    if-ne p1, v0, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    const/4 p1, 0x0

    .line 10
    return p1
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

.method private o()Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->d:Lax/P0/c;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget v0, v0, Lax/P0/c;->a:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_a

    .line 9
    .line 10
    return v1

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


# virtual methods
.method public f()F
    .registers 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/g;->g:F

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

.method public h()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/g;->c:Landroidx/media3/exoplayer/g$a;

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->c()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public k(Lax/P0/c;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/g;->d:Lax/P0/c;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1c

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/g;->d:Lax/P0/c;

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/media3/exoplayer/g;->d(Lax/P0/c;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/g;->f:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p1, v0, :cond_17

    .line 19
    .line 20
    if-nez p1, :cond_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :cond_17
    :goto_17
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 25
    .line 26
    invoke-static {v0, p1}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
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

.method public n(ZI)I
    .registers 5

    .line 1
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/g;->m(I)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez p2, :cond_f

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->c()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/g;->l(I)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    if-eqz p1, :cond_16

    .line 17
    .line 18
    invoke-direct {p0}, Landroidx/media3/exoplayer/g;->i()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_16
    iget p1, p0, Landroidx/media3/exoplayer/g;->e:I

    .line 24
    .line 25
    if-eq p1, v1, :cond_1f

    .line 26
    .line 27
    const/4 p2, 0x3

    .line 28
    if-eq p1, p2, :cond_1e

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    return v0

    .line 32
    :cond_1f
    const/4 p1, -0x1

    .line 33
    return p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
