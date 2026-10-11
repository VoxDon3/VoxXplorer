.class Lcom/voxdon/xplorer/service/CommandService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/service/CommandService;->F(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/service/CommandService;

.field final synthetic q:J


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/service/CommandService;J)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/voxdon/xplorer/service/CommandService$b;->q:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
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


# virtual methods
.method public run()V
    .registers 11

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/service/CommandService;->a(Lcom/voxdon/xplorer/service/CommandService;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_8a

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "current service null="

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->b()Lcom/voxdon/xplorer/service/CommandService;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-nez v3, :cond_1e

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v3, 0x0

    .line 32
    :goto_1f
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ",diff="

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->b()Lcom/voxdon/xplorer/service/CommandService;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v6, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 45
    .line 46
    if-eq v3, v6, :cond_31

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    goto :goto_32

    .line 50
    :cond_31
    const/4 v3, 0x0

    .line 51
    :goto_32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v3, ",this service destroyed="

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 60
    .line 61
    invoke-static {v3}, Lcom/voxdon/xplorer/service/CommandService;->c(Lcom/voxdon/xplorer/service/CommandService;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v3, ",not started?"

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->d()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    iget-wide v8, p0, Lcom/voxdon/xplorer/service/CommandService$b;->q:J

    .line 78
    .line 79
    cmp-long v3, v6, v8

    .line 80
    .line 81
    if-gez v3, :cond_54

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    goto :goto_55

    .line 85
    :cond_54
    const/4 v3, 0x0

    .line 86
    :goto_55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v3, ":"

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->d()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    iget-wide v8, p0, Lcom/voxdon/xplorer/service/CommandService$b;->q:J

    .line 99
    .line 100
    cmp-long v3, v6, v8

    .line 101
    .line 102
    if-lez v3, :cond_68

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    :cond_68
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const-string v4, "!!! PENDING CHECK NOT STARTED !!!"

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 134
    .line 135
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/service/CommandService;->f(Lcom/voxdon/xplorer/service/CommandService;J)J

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_8a
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 140
    .line 141
    invoke-static {v0}, Lcom/voxdon/xplorer/service/CommandService;->c(Lcom/voxdon/xplorer/service/CommandService;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_98

    .line 146
    .line 147
    const-string v0, "CommandService started but destroyed"

    .line 148
    .line 149
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_98
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 154
    .line 155
    invoke-static {v0}, Lcom/voxdon/xplorer/service/CommandService;->e(Lcom/voxdon/xplorer/service/CommandService;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    iget-wide v5, p0, Lcom/voxdon/xplorer/service/CommandService$b;->q:J

    .line 160
    .line 161
    cmp-long v0, v3, v5

    .line 162
    .line 163
    if-nez v0, :cond_ae

    .line 164
    .line 165
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 166
    .line 167
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/service/CommandService;->f(Lcom/voxdon/xplorer/service/CommandService;J)J

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$b;->c0:Lcom/voxdon/xplorer/service/CommandService;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/voxdon/xplorer/service/CommandService;->h()V

    .line 173
    .line 174
    .line 175
    :cond_ae
    return-void
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
