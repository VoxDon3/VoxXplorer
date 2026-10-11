.class public Lax/d3/Q;
.super Lax/d3/E;
.source "SourceFile"


# instance fields
.field s2:Lax/Q2/f;

.field t2:Z

.field u2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/E;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/d3/Q;->t2:Z

    .line 6
    .line 7
    new-instance v0, Lax/d3/Q$a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lax/d3/Q$a;-><init>(Lax/d3/Q;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/d3/Q;->u2:Landroid/content/BroadcastReceiver;

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
.end method

.method private ua()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_35

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/x;->C1(Landroid/content/Context;Lax/c3/K;Lcom/voxdon/xplorer/file/y;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_35

    .line 25
    .line 26
    invoke-virtual {p0}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 31
    .line 32
    if-ne v0, v1, :cond_2d

    .line 33
    .line 34
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lax/t3/k;->q(Landroid/content/Context;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x3

    .line 43
    if-lt v0, v1, :cond_2d

    .line 44
    .line 45
    goto :goto_35

    .line 46
    :cond_2d
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-virtual {p0, v0, v1}, Lax/d3/E;->n9(Lax/c3/K;Z)V

    .line 52
    .line 53
    .line 54
    :cond_35
    :goto_35
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
.end method


# virtual methods
.method protected B7()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected K6()Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->v7()Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_38

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lax/Q2/f;->R(Lax/c3/K;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_38

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_38

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->j()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_36

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_35

    .line 52
    .line 53
    goto :goto_36

    .line 54
    :cond_35
    return v1

    .line 55
    :cond_36
    :goto_36
    const/4 v0, 0x1

    .line 56
    return v0

    .line 57
    :cond_38
    invoke-super {p0}, Lax/d3/E;->K6()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    return v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/E;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/Q;->ua()V

    .line 5
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

.method public N3()Z
    .registers 6

    .line 1
    invoke-super {p0}, Lax/d3/E;->N3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/d3/E;->v7()Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_4a

    .line 23
    .line 24
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "BASE LOCATION UNIT NULL"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v4, "loc:"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, ",path:"

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :cond_4a
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    sget-object v3, Lax/c3/K;->h:Lax/c3/K;

    .line 80
    .line 81
    if-ne v2, v3, :cond_63

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->j()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_63

    .line 88
    .line 89
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Lax/Z2/j;->q()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_63

    .line 98
    .line 99
    return v1

    .line 100
    :cond_63
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v2, v3}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const/4 v3, 0x1

    .line 113
    if-eqz v2, :cond_8e

    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lax/Q2/f;->R(Lax/c3/K;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_8e

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_8e

    .line 130
    .line 131
    invoke-virtual {p0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2, v0}, Lcom/voxdon/xplorer/file/x;->t0(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_8d

    .line 140
    .line 141
    return v3

    .line 142
    :cond_8d
    return v1

    .line 143
    :cond_8e
    return v3
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

.method public j1(Landroid/app/Activity;)V
    .registers 5

    .line 1
    invoke-super {p0, p1}, Lax/d3/E;->j1(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, Lax/Q2/f;->q0:Lax/Q2/f;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p1, v0, :cond_2e

    .line 12
    .line 13
    :try_start_c
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2e

    .line 34
    .line 35
    invoke-virtual {p0}, Lax/d3/E;->w7()Lcom/voxdon/xplorer/file/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1, v1}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z
    :try_end_29
    .catch Lax/b3/j; {:try_start_c .. :try_end_29} :catch_2a

    .line 40
    .line 41
    .line 42
    goto :goto_2e

    .line 43
    :catch_2a
    move-exception p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    :goto_2e
    invoke-virtual {p0}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Lax/Q2/f;->v0:Lax/Q2/f;

    .line 52
    .line 53
    if-eq p1, v0, :cond_3e

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, Lax/Q2/f;->u0:Lax/Q2/f;

    .line 60
    .line 61
    if-ne p1, v0, :cond_4b

    .line 62
    .line 63
    :cond_3e
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "local.intent.action.LOCAL_STORAGE_STATUS_CHANGED"

    .line 68
    .line 69
    iget-object v2, p0, Lax/d3/Q;->u2:Landroid/content/BroadcastReceiver;

    .line 70
    .line 71
    invoke-virtual {p1, v0, v2}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 72
    .line 73
    .line 74
    iput-boolean v1, p0, Lax/d3/Q;->t2:Z

    .line 75
    .line 76
    :cond_4b
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

.method ta()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2a

    .line 6
    .line 7
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lax/Z2/j;->l0(Lax/c3/K;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2a

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/voxdon/xplorer/activity/b;

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/d3/Q;->z3()Lax/Q2/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const-string v3, "usb_storage"

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2, v3}, Lcom/voxdon/xplorer/activity/b;->a0(Lax/Q2/f;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
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

.method public v1()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/d3/E;->v1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lax/d3/Q;->t2:Z

    .line 5
    .line 6
    if-eqz v0, :cond_13

    .line 7
    .line 8
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/d3/Q;->u2:Landroid/content/BroadcastReceiver;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/u3/g;->h(Landroid/content/BroadcastReceiver;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lax/d3/Q;->t2:Z

    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
.end method

.method public z3()Lax/Q2/f;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/Q;->s2:Lax/Q2/f;

    .line 2
    .line 3
    if-nez v0, :cond_12

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "location"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lax/Q2/f;

    .line 16
    .line 17
    iput-object v0, p0, Lax/d3/Q;->s2:Lax/Q2/f;

    .line 18
    .line 19
    :cond_12
    iget-object v0, p0, Lax/d3/Q;->s2:Lax/Q2/f;

    .line 20
    .line 21
    return-object v0
.end method
