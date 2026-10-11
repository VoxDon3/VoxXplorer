.class Lcom/voxdon/xplorer/file/L$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Ljava/lang/String;

.field i:I

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Lcom/voxdon/xplorer/file/L;

.field m:Lcom/voxdon/xplorer/file/c$a;

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field q:Z

.field r:Lcom/voxdon/xplorer/file/L$f;

.field s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/c$a;I)V
    .registers 6

    .line 1
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 2
    iput-object p2, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 3
    iput-object p3, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 4
    invoke-static {p1}, Lcom/voxdon/xplorer/file/L;->A0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/L$j;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/voxdon/xplorer/file/L$j;->k(I)Lax/Z2/o;

    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/L$d;->y(Lax/Z2/o;)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/L$d;->q:Z

    return-void
.end method

.method public constructor <init>(Lax/Z2/o;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 4

    .line 7
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 8
    iput-object p2, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 9
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/L$d;->y(Lax/Z2/o;)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/L$d;->q:Z

    return-void
.end method

.method private y(Lax/Z2/o;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Lax/Z2/o;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/Z2/o;->h()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/voxdon/xplorer/file/L$d;->i:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/Z2/o;->k()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->j:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/Z2/o;->g()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->k:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/Z2/o;->f()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/Z2/o;->i()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->o:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/Z2/o;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/L$d;->w([Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/L$d;->x(Ljava/lang/Boolean;)V

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
    .registers 2

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 9
    .line 10
    .line 11
    :cond_a
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

.method protected varargs w([Ljava/lang/Object;)Ljava/lang/Boolean;
    .registers 12

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->i()V

    .line 6
    .line 7
    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    :try_start_8
    invoke-static {}, Lcom/voxdon/xplorer/file/L;->o0()V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/L$d;->q:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_57

    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v0, :cond_32

    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->j:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget v2, p0, Lcom/voxdon/xplorer/file/L$d;->i:I

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/L;->t0(Ljava/lang/String;Ljava/lang/String;I)Lcom/voxdon/xplorer/file/L$f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->r:Lcom/voxdon/xplorer/file/L$f;

    .line 33
    .line 34
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_23
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_8 .. :try_end_23} :catch_2f
    .catchall {:try_start_8 .. :try_end_23} :catchall_2b

    .line 35
    .line 36
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 37
    .line 38
    if-eqz v0, :cond_2a

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    return-object p1

    .line 44
    :catchall_2b
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    goto/16 :goto_dc

    .line 47
    .line 48
    :catch_2f
    move-exception v0

    .line 49
    goto/16 :goto_b1

    .line 50
    .line 51
    :cond_32
    :try_start_32
    new-instance v9, Lcom/voxdon/xplorer/file/L$f;

    .line 52
    .line 53
    invoke-direct {v9, v2, v1}, Lcom/voxdon/xplorer/file/L$f;-><init>(ZZ)V
    :try_end_37
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_32 .. :try_end_37} :catch_2f
    .catchall {:try_start_32 .. :try_end_37} :catchall_2b

    .line 54
    .line 55
    .line 56
    :try_start_37
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L$d;->j:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, p0, Lcom/voxdon/xplorer/file/L$d;->k:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/voxdon/xplorer/file/L$d;->h:Ljava/lang/String;

    .line 61
    .line 62
    iget v6, p0, Lcom/voxdon/xplorer/file/L$d;->i:I

    .line 63
    .line 64
    iget-object v7, p0, Lcom/voxdon/xplorer/file/L$d;->o:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v8, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static/range {v3 .. v9}, Lcom/voxdon/xplorer/file/L;->C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/Session;

    .line 69
    .line 70
    .line 71
    move-result-object p1
    :try_end_47
    .catch Lcom/jcraft/jsch/JSchUnknownHostKeyException; {:try_start_37 .. :try_end_47} :catch_4b
    .catch Lcom/jcraft/jsch/JSchChangedHostKeyException; {:try_start_37 .. :try_end_47} :catch_4b
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_37 .. :try_end_47} :catch_48
    .catchall {:try_start_37 .. :try_end_47} :catchall_2b

    .line 72
    goto :goto_73

    .line 73
    :catch_48
    move-exception v0

    .line 74
    move-object p1, v9

    .line 75
    goto :goto_b1

    .line 76
    :catch_4b
    :try_start_4b
    iput-object v9, p0, Lcom/voxdon/xplorer/file/L$d;->r:Lcom/voxdon/xplorer/file/L$f;

    .line 77
    .line 78
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_4f
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_4b .. :try_end_4f} :catch_48
    .catchall {:try_start_4b .. :try_end_4f} :catchall_2b

    .line 79
    .line 80
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 81
    .line 82
    if-eqz v0, :cond_56

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 85
    .line 86
    .line 87
    :cond_56
    return-object p1

    .line 88
    :cond_57
    :try_start_57
    new-instance v9, Lcom/voxdon/xplorer/file/L$f;

    .line 89
    .line 90
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v0, :cond_5f

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    goto :goto_60

    .line 96
    :cond_5f
    const/4 v0, 0x0

    .line 97
    :goto_60
    invoke-direct {v9, v0, v1}, Lcom/voxdon/xplorer/file/L$f;-><init>(ZZ)V
    :try_end_63
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_57 .. :try_end_63} :catch_2f
    .catchall {:try_start_57 .. :try_end_63} :catchall_2b

    .line 98
    .line 99
    .line 100
    :try_start_63
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L$d;->j:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v4, p0, Lcom/voxdon/xplorer/file/L$d;->k:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v5, p0, Lcom/voxdon/xplorer/file/L$d;->h:Ljava/lang/String;

    .line 105
    .line 106
    iget v6, p0, Lcom/voxdon/xplorer/file/L$d;->i:I

    .line 107
    .line 108
    iget-object v7, p0, Lcom/voxdon/xplorer/file/L$d;->o:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v8, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static/range {v3 .. v9}, Lcom/voxdon/xplorer/file/L;->C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/Session;

    .line 113
    .line 114
    .line 115
    move-result-object p1
    :try_end_73
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_63 .. :try_end_73} :catch_48
    .catchall {:try_start_63 .. :try_end_73} :catchall_2b

    .line 116
    :goto_73
    :try_start_73
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 117
    .line 118
    if-eqz v0, :cond_a4

    .line 119
    .line 120
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/L;->p0(Lcom/voxdon/xplorer/file/L;Lcom/jcraft/jsch/Session;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 124
    .line 125
    iget-object v4, p0, Lcom/voxdon/xplorer/file/L$d;->j:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v5, p0, Lcom/voxdon/xplorer/file/L$d;->k:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v6, p0, Lcom/voxdon/xplorer/file/L$d;->h:Ljava/lang/String;

    .line 130
    .line 131
    iget v7, p0, Lcom/voxdon/xplorer/file/L$d;->i:I

    .line 132
    .line 133
    iget-object v8, p0, Lcom/voxdon/xplorer/file/L$d;->o:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v9, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual/range {v3 .. v9}, Lcom/voxdon/xplorer/file/L;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 141
    .line 142
    invoke-static {p1, v2}, Lcom/voxdon/xplorer/file/L;->q0(Lcom/voxdon/xplorer/file/L;Z)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;
    :try_end_92
    .catchall {:try_start_73 .. :try_end_92} :catchall_2b

    .line 146
    .line 147
    if-nez p1, :cond_9c

    .line 148
    .line 149
    :try_start_94
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/L;->z0()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;
    :try_end_9c
    .catch Lax/b3/j; {:try_start_94 .. :try_end_9c} :catch_9c
    .catchall {:try_start_94 .. :try_end_9c} :catchall_2b

    .line 156
    .line 157
    :catch_9c
    :cond_9c
    :try_start_9c
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 158
    .line 159
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/L;->J0(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_a7

    .line 165
    :cond_a4
    invoke-virtual {p1}, Lcom/jcraft/jsch/Session;->s()V

    .line 166
    .line 167
    .line 168
    :goto_a7
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_a9
    .catchall {:try_start_9c .. :try_end_a9} :catchall_2b

    .line 169
    .line 170
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 171
    .line 172
    if-eqz v0, :cond_b0

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 175
    .line 176
    .line 177
    :cond_b0
    return-object p1

    .line 178
    :goto_b1
    :try_start_b1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iput-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->s:Ljava/lang/String;

    .line 183
    .line 184
    instance-of v1, v0, Lcom/jcraft/jsch/JSchUnknownHostKeyException;

    .line 185
    .line 186
    if-nez v1, :cond_bf

    .line 187
    .line 188
    instance-of v1, v0, Lcom/jcraft/jsch/JSchChangedHostKeyException;

    .line 189
    .line 190
    if-eqz v1, :cond_cf

    .line 191
    .line 192
    :cond_bf
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->p:Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v1, :cond_cf

    .line 195
    .line 196
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L$d;->r:Lcom/voxdon/xplorer/file/L$f;

    .line 197
    .line 198
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_c7
    .catchall {:try_start_b1 .. :try_end_c7} :catchall_2b

    .line 199
    .line 200
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 201
    .line 202
    if-eqz v0, :cond_ce

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 205
    .line 206
    .line 207
    :cond_ce
    return-object p1

    .line 208
    :cond_cf
    :try_start_cf
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 209
    .line 210
    .line 211
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_d4
    .catchall {:try_start_cf .. :try_end_d4} :catchall_2b

    .line 212
    .line 213
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 214
    .line 215
    if-eqz v0, :cond_db

    .line 216
    .line 217
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 218
    .line 219
    .line 220
    :cond_db
    return-object p1

    .line 221
    :goto_dc
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->l:Lcom/voxdon/xplorer/file/L;

    .line 222
    .line 223
    if-eqz v0, :cond_e3

    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 226
    .line 227
    .line 228
    :cond_e3
    throw p1
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
.end method

.method protected x(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_41

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_14

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 20
    .line 21
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_36

    .line 26
    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->r:Lcom/voxdon/xplorer/file/L$f;

    .line 28
    .line 29
    if-eqz v0, :cond_2a

    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->r:Lcom/voxdon/xplorer/file/L$f;

    .line 38
    .line 39
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->s:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L$d;->m:Lcom/voxdon/xplorer/file/c$a;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L$d;->n:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_41
    return-void
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
.end method
