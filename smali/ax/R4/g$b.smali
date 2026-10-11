.class Lax/R4/g$b;
.super Landroid/support/v4/media/session/MediaSessionCompat$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/R4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic f:Lax/R4/g;


# direct methods
.method private constructor <init>(Lax/R4/g;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/R4/g;Lax/R4/g$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/R4/g$b;-><init>(Lax/R4/g;)V

    return-void
.end method

.method private E(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 7

    .line 1
    new-instance v0, Lax/Q4/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/Q4/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lax/Q4/c;->a(Landroid/net/Uri;Landroid/os/Bundle;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 11
    .line 12
    invoke-static {v1}, Lax/R4/g;->n(Lax/R4/g;)Lax/Q4/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Lax/Q4/b;->o(Lax/Q4/c;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/Q4/c;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v1, v0}, Lax/R4/g;->o(Lax/R4/g;Z)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    new-array v2, v1, [Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v2}, Lax/S4/c;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0, p1}, Lax/R4/g;->q(Lax/R4/g;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    const/4 p1, -0x1

    .line 41
    if-eqz p2, :cond_44

    .line 42
    .line 43
    const-string v0, "PLAY_RESUME_POSITION"

    .line 44
    .line 45
    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 50
    .line 51
    invoke-static {v2}, Lax/R4/g;->m(Lax/R4/g;)Lax/R4/f;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "PLAYER_ENGINE"

    .line 56
    .line 57
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/4 v3, 0x1

    .line 62
    if-eq p2, v3, :cond_40

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    :cond_40
    invoke-interface {v2, v1}, Lax/R4/f;->h(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v0, -0x1

    .line 70
    :goto_45
    if-eq v0, p1, :cond_56

    .line 71
    .line 72
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 73
    .line 74
    invoke-static {p1}, Lax/R4/g;->m(Lax/R4/g;)Lax/R4/f;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 79
    .line 80
    invoke-static {p2}, Lax/R4/g;->p(Lax/R4/g;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-interface {p1, p2, v0}, Lax/R4/f;->d(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    :cond_56
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 88
    .line 89
    invoke-static {p1}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 94
    .line 95
    invoke-static {p2}, Lax/R4/g;->p(Lax/R4/g;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p1, p2}, Lax/R4/h;->u(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
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


# virtual methods
.method public A()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0}, Lax/R4/g;->f(Lax/R4/g;)V

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
.end method

.method public B(J)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/R4/h;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "OnSkipToQueueItem:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x1

    .line 36
    new-array v2, v2, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    aput-object v1, v2, v3

    .line 40
    .line 41
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 45
    .line 46
    invoke-static {v0}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p1, p2}, Lax/R4/h;->s(J)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 54
    .line 55
    invoke-virtual {p1}, Lax/R4/g;->z()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 59
    .line 60
    invoke-static {p1}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lax/R4/h;->y()V

    .line 65
    .line 66
    .line 67
    return-void
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
.end method

.method public C()V
    .registers 5

    .line 1
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "stop. current state="

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 16
    .line 17
    invoke-static {v2}, Lax/R4/g;->m(Lax/R4/g;)Lax/R4/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lax/R4/f;->getState()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    new-array v2, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    aput-object v1, v2, v3

    .line 37
    .line 38
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1}, Lax/R4/g;->A(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public e(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 7

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    const-string v1, "com.example.android.uamp.THUMBS_UP"

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_4c

    .line 10
    .line 11
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-array v1, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v2, "onCustomAction: favorite for current track"

    .line 18
    .line 19
    aput-object v2, v1, p2

    .line 20
    .line 21
    invoke-static {p1, v1}, Lax/S4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 25
    .line 26
    invoke-static {p1}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_45

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->c()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_45

    .line 45
    .line 46
    invoke-static {p1}, Lax/S4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 51
    .line 52
    invoke-static {v1}, Lax/R4/g;->n(Lax/R4/g;)Lax/Q4/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 57
    .line 58
    invoke-static {v2}, Lax/R4/g;->n(Lax/R4/g;)Lax/Q4/b;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2, p1}, Lax/Q4/b;->k(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    xor-int/2addr v0, v2

    .line 67
    invoke-virtual {v1, p1, v0}, Lax/Q4/b;->r(Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {p1, v0, p2, v0}, Lax/R4/g;->N(Ljava/lang/String;ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/4 v2, 0x2

    .line 82
    new-array v2, v2, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v3, "Unsupported action: "

    .line 85
    .line 86
    aput-object v3, v2, p2

    .line 87
    .line 88
    aput-object p1, v2, v0

    .line 89
    .line 90
    invoke-static {v1, v2}, Lax/S4/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void
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

.method public h()V
    .registers 5

    .line 1
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "pause. current state="

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 16
    .line 17
    invoke-static {v2}, Lax/R4/g;->m(Lax/R4/g;)Lax/R4/f;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lax/R4/f;->getState()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    new-array v2, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    aput-object v1, v2, v3

    .line 37
    .line 38
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 42
    .line 43
    invoke-virtual {v0}, Lax/R4/g;->y()V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public i()V
    .registers 5

    .line 1
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "play"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 17
    .line 18
    invoke-static {v0}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lax/R4/h;->i()Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_20

    .line 27
    .line 28
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/R4/g;->z()V

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public j(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/R4/h;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x4

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v2, "playFromMediaId mediaId:"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    aput-object p1, v1, v2

    .line 28
    .line 29
    const-string v2, "  extras="

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    aput-object v2, v1, v3

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    aput-object p2, v1, v2

    .line 36
    .line 37
    invoke-static {v0, v1}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 41
    .line 42
    invoke-static {p2}, Lax/R4/g;->l(Lax/R4/g;)Lax/R4/h;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2, p1}, Lax/R4/h;->v(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 50
    .line 51
    invoke-virtual {p1}, Lax/R4/g;->z()V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public l(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/R4/g$b;->E(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 5
    .line 6
    invoke-virtual {p1}, Lax/R4/g;->z()V

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

.method public p(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lax/R4/g$b;->E(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p2, v0, p2}, Lax/R4/g;->N(Ljava/lang/String;ILjava/lang/String;)V

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

.method public s(J)V
    .registers 8

    .line 1
    invoke-static {}, Lax/R4/g;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v2, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v3, "onSeekTo:"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v3, v2, v4

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aput-object v1, v2, v3

    .line 19
    .line 20
    invoke-static {v0, v2}, Lax/S4/b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 24
    .line 25
    invoke-static {v0}, Lax/R4/g;->m(Lax/R4/g;)Lax/R4/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    long-to-int p2, p1

    .line 30
    invoke-interface {v0, p2}, Lax/R4/f;->e(I)V

    .line 31
    .line 32
    .line 33
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

.method public u(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/R4/g;->j(Lax/R4/g;F)V

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

.method public x(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/R4/g;->i(Lax/R4/g;I)V

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

.method public y(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/R4/g;->h(Lax/R4/g;I)V

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

.method public z()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/R4/g$b;->f:Lax/R4/g;

    .line 2
    .line 3
    invoke-static {v0}, Lax/R4/g;->r(Lax/R4/g;)V

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
.end method
