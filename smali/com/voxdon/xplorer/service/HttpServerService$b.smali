.class Lcom/voxdon/xplorer/service/HttpServerService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/HttpServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/service/HttpServerService;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/HttpServerService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .registers 4

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/service/HttpServerService;->e()Ljava/util/logging/Logger;

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
    const-string v2, "Timeout http multimedia server! : "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/voxdon/xplorer/service/HttpServerService;->a(Lcom/voxdon/xplorer/service/HttpServerService;)Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 32
    .line 33
    iget-boolean v1, v0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z

    .line 34
    .line 35
    if-eqz v1, :cond_57

    .line 36
    .line 37
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->a(Lcom/voxdon/xplorer/service/HttpServerService;)Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lcom/voxdon/xplorer/service/HttpServerService$e;->d0:Lcom/voxdon/xplorer/service/HttpServerService$e;

    .line 42
    .line 43
    if-eq v0, v1, :cond_57

    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->f(Lcom/voxdon/xplorer/service/HttpServerService;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_40

    .line 52
    .line 53
    invoke-static {}, Lcom/example/android/uamp/MusicService;->I()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_40

    .line 58
    .line 59
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->r()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    invoke-static {}, Lcom/voxdon/xplorer/service/HttpServerService;->h()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4c

    .line 70
    .line 71
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->u()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4c
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->i(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->m()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_57
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 89
    .line 90
    iget-boolean v1, v0, Lcom/voxdon/xplorer/service/HttpServerService;->l:Z

    .line 91
    .line 92
    if-eqz v1, :cond_88

    .line 93
    .line 94
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->j(Lcom/voxdon/xplorer/service/HttpServerService;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_88

    .line 99
    .line 100
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->f(Lcom/voxdon/xplorer/service/HttpServerService;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_88

    .line 107
    .line 108
    invoke-static {}, Lcom/example/android/uamp/MusicService;->G()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_88

    .line 113
    .line 114
    invoke-static {}, Lcom/voxdon/xplorer/service/HttpServerService;->h()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7d

    .line 119
    .line 120
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->u()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_7d
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 127
    .line 128
    invoke-static {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->i(Lcom/voxdon/xplorer/service/HttpServerService;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->m()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    iget-object v0, p0, Lcom/voxdon/xplorer/service/HttpServerService$b;->q:Lcom/voxdon/xplorer/service/HttpServerService;

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/HttpServerService;->k()V

    .line 140
    .line 141
    .line 142
    return-void
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
