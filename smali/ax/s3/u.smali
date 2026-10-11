.class public Lax/s3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lax/s3/u;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .registers 2

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
    iput-object p1, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {p0}, Lax/s3/u;->k()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public static j(Landroid/content/Context;)Lax/s3/u;
    .registers 2

    .line 1
    sget-object v0, Lax/s3/u;->b:Lax/s3/u;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/s3/u;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/s3/u;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/s3/u;->b:Lax/s3/u;

    .line 11
    .line 12
    :cond_b
    sget-object p0, Lax/s3/u;->b:Lax/s3/u;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private k()V
    .registers 12

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x4

    .line 6
    invoke-static {}, Lax/X2/Q;->A()Z

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    if-eqz v5, :cond_a9

    .line 11
    .line 12
    :try_start_b
    new-instance v5, Lax/s3/t$a;

    .line 13
    .line 14
    invoke-direct {v5}, Lax/s3/t$a;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v6, "important_operation"

    .line 18
    .line 19
    iput-object v6, v5, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 22
    .line 23
    const v7, 0x7f1301b5

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iput-object v6, v5, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 31
    .line 32
    iput v4, v5, Lax/s3/t$a;->d:I

    .line 33
    .line 34
    iput-boolean v3, v5, Lax/s3/t$a;->e:Z

    .line 35
    .line 36
    iput-boolean v3, v5, Lax/s3/t$a;->g:Z

    .line 37
    .line 38
    iput-boolean v2, v5, Lax/s3/t$a;->i:Z

    .line 39
    .line 40
    iput-boolean v3, v5, Lax/s3/t$a;->j:Z

    .line 41
    .line 42
    new-instance v6, Lax/s3/t$a;

    .line 43
    .line 44
    invoke-direct {v6}, Lax/s3/t$a;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v7, "service"

    .line 48
    .line 49
    iput-object v7, v6, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v7, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 52
    .line 53
    const v8, 0x7f1301b6

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iput-object v7, v6, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 61
    .line 62
    iput v1, v6, Lax/s3/t$a;->d:I

    .line 63
    .line 64
    iput-boolean v2, v6, Lax/s3/t$a;->e:Z

    .line 65
    .line 66
    iput-boolean v2, v6, Lax/s3/t$a;->g:Z

    .line 67
    .line 68
    iput-boolean v3, v6, Lax/s3/t$a;->i:Z

    .line 69
    .line 70
    iput-boolean v2, v6, Lax/s3/t$a;->j:Z

    .line 71
    .line 72
    new-instance v7, Lax/s3/t$a;

    .line 73
    .line 74
    invoke-direct {v7}, Lax/s3/t$a;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v8, "alarm"

    .line 78
    .line 79
    iput-object v8, v7, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v8, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 82
    .line 83
    const v9, 0x7f13034d

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    iput-object v8, v7, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 91
    .line 92
    iput v0, v7, Lax/s3/t$a;->d:I

    .line 93
    .line 94
    iput-boolean v2, v7, Lax/s3/t$a;->e:Z

    .line 95
    .line 96
    iput-boolean v2, v7, Lax/s3/t$a;->g:Z

    .line 97
    .line 98
    iput-boolean v2, v7, Lax/s3/t$a;->i:Z

    .line 99
    .line 100
    iput-boolean v3, v7, Lax/s3/t$a;->j:Z

    .line 101
    .line 102
    new-instance v8, Lax/s3/t$a;

    .line 103
    .line 104
    invoke-direct {v8}, Lax/s3/t$a;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v9, "music_player"

    .line 108
    .line 109
    iput-object v9, v8, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v9, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 112
    .line 113
    const v10, 0x7f130339

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    iput-object v9, v8, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 121
    .line 122
    iput v0, v8, Lax/s3/t$a;->d:I

    .line 123
    .line 124
    iput-boolean v2, v8, Lax/s3/t$a;->e:Z

    .line 125
    .line 126
    iput-boolean v2, v8, Lax/s3/t$a;->g:Z

    .line 127
    .line 128
    iput-boolean v3, v8, Lax/s3/t$a;->i:Z

    .line 129
    .line 130
    iput-boolean v2, v8, Lax/s3/t$a;->j:Z

    .line 131
    .line 132
    iget-object v9, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 133
    .line 134
    new-array v4, v4, [Lax/s3/t$a;

    .line 135
    .line 136
    aput-object v5, v4, v2

    .line 137
    .line 138
    aput-object v6, v4, v3

    .line 139
    .line 140
    aput-object v7, v4, v1

    .line 141
    .line 142
    aput-object v8, v4, v0

    .line 143
    .line 144
    invoke-static {v9, v4}, Lax/s3/t;->e(Landroid/content/Context;[Lax/s3/t$a;)V
    :try_end_92
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_b .. :try_end_92} :catch_93

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :catch_93
    move-exception v0

    .line 149
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v2, "Notification Init Error"

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 168
    .line 169
    .line 170
    :cond_a9
    return-void
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
.method public a(I)V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/NotificationManager;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_d
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_e
    move-exception p1

    .line 16
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Noti cancel"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lax/Ha/b;->h()V

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

.method public b(Landroid/app/Service;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/Notification;
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_8

    .line 3
    .line 4
    invoke-static {p1, v0}, Lax/c3/u;->D(Landroid/content/Context;Z)Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    goto :goto_c

    .line 9
    :cond_8
    invoke-static {p1}, Lax/c3/u;->t(Landroid/content/Context;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    :goto_c
    const/16 v1, 0x66

    .line 14
    .line 15
    invoke-static {p1, v1, p4, v0, v0}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    new-instance v1, Lax/P/l$d;

    .line 20
    .line 21
    const-string v2, "important_operation"

    .line 22
    .line 23
    invoke-direct {v1, p1, v2}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-virtual {v1, v2}, Lax/P/l$d;->r(I)Lax/P/l$d;

    .line 28
    .line 29
    .line 30
    if-nez p2, :cond_2a

    .line 31
    .line 32
    const p2, 0x7f130038

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v1, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 40
    .line 41
    .line 42
    goto :goto_2d

    .line 43
    :cond_2a
    invoke-virtual {v1, p2}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 44
    .line 45
    .line 46
    :goto_2d
    invoke-virtual {v1, v0}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-virtual {v1, p1}, Lax/P/l$d;->f(Z)Lax/P/l$d;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p3}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 54
    .line 55
    .line 56
    const p1, 0x7f0802e3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p4}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 63
    .line 64
    .line 65
    const-string p1, ""

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget p2, p1, Landroid/app/Notification;->flags:I

    .line 75
    .line 76
    or-int/lit8 p2, p2, 0x20

    .line 77
    .line 78
    iput p2, p1, Landroid/app/Notification;->flags:I

    .line 79
    .line 80
    invoke-static {}, Lax/X2/Q;->f0()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_5a

    .line 85
    .line 86
    iget p2, p1, Landroid/app/Notification;->flags:I

    .line 87
    .line 88
    or-int/2addr p2, v2

    .line 89
    iput p2, p1, Landroid/app/Notification;->flags:I

    .line 90
    .line 91
    :cond_5a
    return-object p1
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

.method public c(Landroid/app/Service;Ljava/lang/CharSequence;IZ)Landroid/app/Notification;
    .registers 10

    .line 1
    invoke-static {p1}, Lax/c3/u;->t(Landroid/content/Context;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x64

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v1, v0, v2, v2}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v3, Lax/P/l$d;

    .line 13
    .line 14
    const-string v4, "important_operation"

    .line 15
    .line 16
    invoke-direct {v3, p1, v4}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v4, 0x7f130038

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v3, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    if-eqz p4, :cond_22

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Lax/P/l$d;->q(Z)Lax/P/l$d;

    .line 33
    .line 34
    .line 35
    :cond_22
    invoke-virtual {v3, p1}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p1}, Lax/P/l$d;->u(Z)Lax/P/l$d;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, p2}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 42
    .line 43
    .line 44
    const p2, 0x7f0802e5

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, p2}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v0}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v1, p3, v2}, Lax/P/l$d;->s(IIZ)Lax/P/l$d;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p1}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 57
    .line 58
    .line 59
    const-string p1, ""

    .line 60
    .line 61
    invoke-virtual {v3, p1}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
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

.method public d(Landroid/app/Service;Ljava/lang/String;)Landroid/app/Notification;
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lax/c3/u;->D(Landroid/content/Context;Z)Landroid/content/Intent;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {p1, v0, v1, v0, v0}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lax/P/l$d;

    .line 11
    .line 12
    const-string v2, "service"

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v2, 0x7f0802ca

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v2, 0x7f13034b

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v1, v3}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v1, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, p2}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-virtual {p1, v0, v1}, Lax/P/l$d;->A(J)Lax/P/l$d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-virtual {p1, p2}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, p2}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
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

.method public e(Landroid/app/Service;Landroid/content/Intent;Z)Landroid/app/Notification;
    .registers 6

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-static {p1, p2}, Lax/c3/u;->D(Landroid/content/Context;Z)Landroid/content/Intent;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/high16 v1, 0x8000000

    .line 7
    .line 8
    invoke-static {p1, p2, v0, v1, p2}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance v0, Lax/P/l$d;

    .line 13
    .line 14
    const-string v1, "service"

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v1, 0x7f130038

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 27
    .line 28
    .line 29
    if-eqz p3, :cond_29

    .line 30
    .line 31
    const p3, 0x7f130378

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 39
    .line 40
    .line 41
    goto :goto_33

    .line 42
    :cond_29
    const p3, 0x7f130210

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 50
    .line 51
    .line 52
    :goto_33
    const p1, 0x7f0802e4

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 59
    .line 60
    .line 61
    const-string p1, ""

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    invoke-virtual {v0, p1}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
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

.method public f(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/16 v1, 0x68

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, p1, v2, v2}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Lax/P/l$d;

    .line 11
    .line 12
    iget-object v1, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 13
    .line 14
    const-string v3, "important_operation"

    .line 15
    .line 16
    invoke-direct {v0, v1, v3}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-virtual {v0, v1}, Lax/P/l$d;->r(I)Lax/P/l$d;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    invoke-virtual {v0, p2}, Lax/P/l$d;->f(Z)Lax/P/l$d;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p3}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 34
    .line 35
    .line 36
    const p2, 0x7f0802e3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 43
    .line 44
    .line 45
    const-string p1, ""

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
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

.method public g(Landroid/app/Service;)Landroid/app/Notification;
    .registers 4

    .line 1
    new-instance v0, Lax/P/l$d;

    .line 2
    .line 3
    const-string v1, "important_operation"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0802e6

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f1303ac

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Lax/P/l$d;->u(Z)Lax/P/l$d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-virtual {p1, v0}, Lax/P/l$d;->m(I)Lax/P/l$d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
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

.method public h(Landroid/content/Context;Lax/c3/K;Ljava/lang/CharSequence;)Landroid/app/Notification;
    .registers 7

    .line 1
    invoke-static {p1, p2}, Lax/c3/u;->K(Landroid/content/Context;Lax/c3/K;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0, p2, v0, v0}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v1, Lax/P/l$d;

    .line 11
    .line 12
    const-string v2, "alarm"

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v2, 0x7f13034c

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v1, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-virtual {v1, p1}, Lax/P/l$d;->f(Z)Lax/P/l$d;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p3}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 35
    .line 36
    .line 37
    const p1, 0x7f0802eb

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p2}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p3}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x2

    .line 50
    invoke-virtual {v1, p1}, Lax/P/l$d;->r(I)Lax/P/l$d;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
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

.method public i(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/Notification;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lax/c3/u;->D(Landroid/content/Context;Z)Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 9
    .line 10
    const/16 v3, 0x78

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1, v1}, Lax/u3/l;->a(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Lax/P/l$d;

    .line 17
    .line 18
    iget-object v3, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 19
    .line 20
    const-string v4, "important_operation"

    .line 21
    .line 22
    invoke-direct {v2, v3, v4}, Lax/P/l$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-virtual {v2, v3}, Lax/P/l$d;->r(I)Lax/P/l$d;

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_2b

    .line 30
    .line 31
    iget-object p1, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 32
    .line 33
    const v3, 0x7f130038

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v2, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 41
    .line 42
    .line 43
    goto :goto_2e

    .line 44
    :cond_2b
    invoke-virtual {v2, p1}, Lax/P/l$d;->j(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 45
    .line 46
    .line 47
    :goto_2e
    invoke-virtual {v2, v1}, Lax/P/l$d;->p(Z)Lax/P/l$d;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {v2, p1}, Lax/P/l$d;->f(Z)Lax/P/l$d;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p2}, Lax/P/l$d;->i(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 55
    .line 56
    .line 57
    const p1, 0x7f0802e3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p1}, Lax/P/l$d;->v(I)Lax/P/l$d;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lax/P/l$d;->h(Landroid/app/PendingIntent;)Lax/P/l$d;

    .line 64
    .line 65
    .line 66
    const-string p1, ""

    .line 67
    .line 68
    invoke-virtual {v2, p1}, Lax/P/l$d;->x(Ljava/lang/CharSequence;)Lax/P/l$d;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lax/P/l$d;->c()Landroid/app/Notification;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
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

.method public l(ILandroid/app/Notification;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/s3/u;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/NotificationManager;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

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
