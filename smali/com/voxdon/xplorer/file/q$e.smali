.class Lcom/voxdon/xplorer/file/q$e;
.super Lax/u3/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/t<",
        "Lax/Sc/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/voxdon/xplorer/file/q;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/q;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/q$e;->b:Lcom/voxdon/xplorer/file/q;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/u3/t;-><init>()V

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


# virtual methods
.method protected bridge synthetic c(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/Sc/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/q$e;->g(Lax/Sc/e;)V

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

.method protected bridge synthetic d()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/q$e;->h()Lax/Sc/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public f()Lax/Sc/e;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lax/u3/t;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/Sc/e;

    .line 6
    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/Rc/e;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_12

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/q$e;->h()Lax/Sc/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_12
    return-object v0
    .line 20
    .line 21
.end method

.method protected g(Lax/Sc/e;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/file/q;->k0(Lax/Sc/e;)V

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

.method protected h()Lax/Sc/e;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/K;
        }
    .end annotation

    .line 1
    const-string v0, "Could not create transfer connection"

    .line 2
    .line 3
    :try_start_2
    new-instance v1, Lcom/voxdon/xplorer/file/q$d;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/voxdon/xplorer/file/q$e;->b:Lcom/voxdon/xplorer/file/q;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/voxdon/xplorer/file/q$e;->b:Lcom/voxdon/xplorer/file/q;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v1, v2, v4, v3, v4}, Lcom/voxdon/xplorer/file/q$d;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/q;ILcom/voxdon/xplorer/file/c$a;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    new-array v2, v2, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lax/u3/q;->l()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_30

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/q$d;->z()Lax/Sc/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :catch_2c
    move-exception v1

    .line 46
    goto :goto_66

    .line 47
    :catch_2e
    move-exception v0

    .line 48
    goto :goto_84

    .line 49
    :cond_30
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/q$d;->B()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_60

    .line 54
    .line 55
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v3, "FTP CHANNEL OPEN ERROR 1"

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v4, "msg:"

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/q$d;->y()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v2, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 95
    .line 96
    .line 97
    :cond_60
    new-instance v1, Lax/b3/K;

    .line 98
    .line 99
    invoke-direct {v1, v0}, Lax/b3/K;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1
    :try_end_66
    .catch Lax/b3/K; {:try_start_2 .. :try_end_66} :catch_2e
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_66} :catch_2c

    .line 103
    :goto_66
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v3, "FTP CHANNEL OPEN ERROR 2"

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Lax/Ha/b;->h()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    new-instance v2, Lax/b3/K;

    .line 128
    .line 129
    invoke-direct {v2, v0, v1}, Lax/b3/K;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw v2

    .line 133
    :goto_84
    throw v0
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

.method public i(Lax/Sc/e;)V
    .registers 3

    .line 1
    if-nez p1, :cond_c

    .line 2
    .line 3
    invoke-static {}, Lcom/voxdon/xplorer/file/q;->l0()Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "Try to release null ftpclient"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    invoke-virtual {p1}, Lax/Rc/e;->w()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    invoke-super {p0, p1}, Lax/u3/t;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
.end method
