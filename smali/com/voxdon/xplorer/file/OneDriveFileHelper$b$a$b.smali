.class Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b(Lax/M9/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

.field final synthetic q:Lax/M9/d;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;Lax/M9/d;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->q:Lax/M9/d;

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
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_43

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;->b:Lcom/voxdon/xplorer/file/c$a;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-interface {v0, v1, v2}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "OneDrive get Drive failed"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->q:Lax/M9/d;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    iget-object v0, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a$b;->c0:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b$a;->b:Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;

    .line 71
    .line 72
    iget-object v0, v0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$b;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "OneDrive onConnectResult Twice 2"

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v3, "called:"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 114
    .line 115
    .line 116
    return-void
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
