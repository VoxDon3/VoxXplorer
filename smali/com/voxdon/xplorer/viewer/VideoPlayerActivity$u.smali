.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private h:I

.field private i:Z

.field final synthetic j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;IZ)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->d0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->h:I

    .line 9
    .line 10
    iput-boolean p3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->i:Z

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

.method static synthetic w(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->z()V

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

.method private z()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_1a

    .line 10
    :cond_9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_1a

    .line 19
    :cond_12
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/P0/y;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    :goto_1a
    return-void

    .line 28
    :cond_1b
    :try_start_1b
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/P0/y;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-boolean v2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->i:Z

    .line 41
    .line 42
    invoke-interface {v0, v1, v2}, Lax/P0/H;->B(Lax/P0/y;Z)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Lax/P0/H;->k()V
    :try_end_35
    .catch Ljava/lang/IllegalStateException; {:try_start_1b .. :try_end_35} :catch_36

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_36
    move-exception v0

    .line 56
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 57
    .line 58
    const v2, 0x7f130137

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v3, "MediaItemIllegal :"

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 77
    .line 78
    invoke-static {v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v3, ":"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    const-string v0, "EXOPLAYER ILLEGALSTATE"

    .line 105
    .line 106
    invoke-static {v0, v1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    return-void
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


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->x([Ljava/lang/Void;)Ljava/lang/Boolean;

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

.method protected o()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->y(Ljava/lang/Boolean;)V

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

.method protected r()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

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

.method protected varargs x([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    iget v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->h:I

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)Lax/P0/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/P0/y;)Lax/P0/y;

    .line 10
    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_d} :catch_e

    .line 13
    .line 14
    return-object p1

    .line 15
    :catch_e
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected y(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1a

    .line 17
    .line 18
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 19
    .line 20
    const v0, 0x7f130137

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_23

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2f

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->z()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;->j:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 49
    .line 50
    new-instance v0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u$a;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u$a;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$u;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method
