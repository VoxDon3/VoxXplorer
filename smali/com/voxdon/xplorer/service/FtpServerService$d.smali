.class Lcom/voxdon/xplorer/service/FtpServerService$d;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/FtpServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/service/FtpServerService;

.field private q:Z


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/FtpServerService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->q:Z

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
.end method


# virtual methods
.method a(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->q:Z

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

.method public run()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->a(Lcom/voxdon/xplorer/service/FtpServerService;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->b(Lcom/voxdon/xplorer/service/FtpServerService;)Lax/u3/D;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/u3/D;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->j(Lcom/voxdon/xplorer/service/FtpServerService;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_28

    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lcom/voxdon/xplorer/service/FtpServerService$e;->b()V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_24} :catch_25

    .line 35
    .line 36
    .line 37
    goto :goto_28

    .line 38
    :catch_25
    move-exception v0

    .line 39
    goto/16 :goto_bc

    .line 40
    .line 41
    :cond_28
    :goto_28
    iget-boolean v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->q:Z

    .line 42
    .line 43
    if-nez v0, :cond_97

    .line 44
    .line 45
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_54

    .line 53
    .line 54
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_54

    .line 65
    .line 66
    :try_start_41
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_4a
    .catch Ljava/lang/InterruptedException; {:try_start_41 .. :try_end_4a} :catch_4b

    .line 73
    .line 74
    .line 75
    goto :goto_4f

    .line 76
    :catch_4b
    move-exception v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    :goto_4f
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/service/FtpServerService;->m(Lcom/voxdon/xplorer/service/FtpServerService;Lcom/voxdon/xplorer/service/FtpServerService$f;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 83
    .line 84
    .line 85
    :cond_54
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 86
    .line 87
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-nez v0, :cond_6f

    .line 92
    .line 93
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 94
    .line 95
    new-instance v2, Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 96
    .line 97
    invoke-direct {v2, v0, v1}, Lcom/voxdon/xplorer/service/FtpServerService$f;-><init>(Lcom/voxdon/xplorer/service/FtpServerService;Lcom/voxdon/xplorer/service/FtpServerService$a;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v2}, Lcom/voxdon/xplorer/service/FtpServerService;->m(Lcom/voxdon/xplorer/service/FtpServerService;Lcom/voxdon/xplorer/service/FtpServerService$f;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 104
    .line 105
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 110
    .line 111
    .line 112
    :cond_6f
    const-wide/16 v0, 0x3e8

    .line 113
    .line 114
    :try_start_71
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_74
    .catch Ljava/lang/Exception; {:try_start_71 .. :try_end_74} :catch_75

    .line 115
    .line 116
    .line 117
    goto :goto_79

    .line 118
    :catch_75
    move-exception v0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    :goto_79
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 123
    .line 124
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->l(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$f;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_28

    .line 133
    .line 134
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 135
    .line 136
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->n(Lcom/voxdon/xplorer/service/FtpServerService;)Landroid/net/wifi/WifiManager;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getWifiState()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/4 v1, 0x1

    .line 145
    if-ne v0, v1, :cond_28

    .line 146
    .line 147
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 150
    .line 151
    .line 152
    :cond_97
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 153
    .line 154
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_a8

    .line 159
    .line 160
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 161
    .line 162
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {v0}, Lcom/voxdon/xplorer/service/FtpServerService$e;->c()V

    .line 167
    .line 168
    .line 169
    :cond_a8
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 170
    .line 171
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->o(Lcom/voxdon/xplorer/service/FtpServerService;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 175
    .line 176
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->b(Lcom/voxdon/xplorer/service/FtpServerService;)Lax/u3/D;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lax/u3/D;->c()V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 184
    .line 185
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->p(Lcom/voxdon/xplorer/service/FtpServerService;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :goto_bc
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 198
    .line 199
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-eqz v0, :cond_d5

    .line 204
    .line 205
    iget-object v0, p0, Lcom/voxdon/xplorer/service/FtpServerService$d;->c0:Lcom/voxdon/xplorer/service/FtpServerService;

    .line 206
    .line 207
    invoke-static {v0}, Lcom/voxdon/xplorer/service/FtpServerService;->k(Lcom/voxdon/xplorer/service/FtpServerService;)Lcom/voxdon/xplorer/service/FtpServerService$e;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v0}, Lcom/voxdon/xplorer/service/FtpServerService$e;->c()V

    .line 212
    .line 213
    .line 214
    :cond_d5
    return-void
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method
