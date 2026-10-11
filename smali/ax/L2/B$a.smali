.class Lax/L2/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/L2/B;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/L2/B;

.field final synthetic q:Lax/M2/c;


# direct methods
.method constructor <init>(Lax/L2/B;Lax/M2/c;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 2
    .line 3
    iput-object p2, p0, Lax/L2/B$a;->q:Lax/M2/c;

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
    .registers 6

    .line 1
    iget-object v0, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 2
    .line 3
    iget-object v0, v0, Lax/L2/B;->q:Lax/M2/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/M2/a;->isCancelled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_76

    .line 12
    :cond_b
    :try_start_b
    iget-object v0, p0, Lax/L2/B$a;->q:Lax/M2/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/M2/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lax/B2/e;

    .line 19
    .line 20
    if-eqz v0, :cond_4d

    .line 21
    .line 22
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lax/L2/B;->h0:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v4, "Updating notification for "

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 39
    .line 40
    iget-object v4, v4, Lax/L2/B;->d0:Lax/K2/v;

    .line 41
    .line 42
    iget-object v4, v4, Lax/K2/v;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1, v2, v3}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 55
    .line 56
    iget-object v2, v1, Lax/L2/B;->q:Lax/M2/c;

    .line 57
    .line 58
    iget-object v3, v1, Lax/L2/B;->f0:Lax/B2/f;

    .line 59
    .line 60
    iget-object v4, v1, Lax/L2/B;->c0:Landroid/content/Context;

    .line 61
    .line 62
    iget-object v1, v1, Lax/L2/B;->e0:Landroidx/work/c;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/work/c;->e()Ljava/util/UUID;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v3, v4, v1, v0}, Lax/B2/f;->a(Landroid/content/Context;Ljava/util/UUID;Lax/B2/e;)Lax/v7/e;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2, v0}, Lax/M2/c;->r(Lax/v7/e;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_4b
    move-exception v0

    .line 77
    goto :goto_6f

    .line 78
    :cond_4d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "Worker was marked important ("

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 89
    .line 90
    iget-object v1, v1, Lax/L2/B;->d0:Lax/K2/v;

    .line 91
    .line 92
    iget-object v1, v1, Lax/K2/v;->c:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ") but did not provide ForegroundInfo"

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v1
    :try_end_6f
    .catchall {:try_start_b .. :try_end_6f} :catchall_4b

    .line 112
    :goto_6f
    iget-object v1, p0, Lax/L2/B$a;->c0:Lax/L2/B;

    .line 113
    .line 114
    iget-object v1, v1, Lax/L2/B;->q:Lax/M2/c;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lax/M2/c;->q(Ljava/lang/Throwable;)Z

    .line 117
    .line 118
    .line 119
    :goto_76
    return-void
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
