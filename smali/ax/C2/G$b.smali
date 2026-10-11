.class Lax/C2/G$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/C2/G;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/C2/G;

.field final synthetic q:Ljava/lang/String;


# direct methods
.method constructor <init>(Lax/C2/G;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 2
    .line 3
    iput-object p2, p0, Lax/C2/G$b;->q:Ljava/lang/String;

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
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 2
    .line 3
    iget-object v0, v0, Lax/C2/G;->r0:Lax/M2/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/M2/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/work/c$a;

    .line 10
    .line 11
    if-nez v0, :cond_36

    .line 12
    .line 13
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lax/C2/G;->t0:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 25
    .line 26
    iget-object v3, v3, Lax/C2/G;->f0:Lax/K2/v;

    .line 27
    .line 28
    iget-object v3, v3, Lax/K2/v;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " returned a null result. Treating it as a failure."

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Lax/B2/i;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_62

    .line 46
    :catchall_2d
    move-exception v0

    .line 47
    goto/16 :goto_a8

    .line 48
    .line 49
    :catch_30
    move-exception v0

    .line 50
    goto :goto_68

    .line 51
    :catch_32
    move-exception v0

    .line 52
    goto :goto_68

    .line 53
    :catch_34
    move-exception v0

    .line 54
    goto :goto_8a

    .line 55
    :cond_36
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, Lax/C2/G;->t0:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v4, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 67
    .line 68
    iget-object v4, v4, Lax/C2/G;->f0:Lax/K2/v;

    .line 69
    .line 70
    iget-object v4, v4, Lax/K2/v;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v4, " returned a "

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v4, "."

    .line 84
    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v1, v2, v3}, Lax/B2/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 96
    .line 97
    iput-object v0, v1, Lax/C2/G;->i0:Landroidx/work/c$a;
    :try_end_62
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_62} :catch_34
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_62} :catch_32
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_62} :catch_30
    .catchall {:try_start_0 .. :try_end_62} :catchall_2d

    .line 98
    .line 99
    :goto_62
    iget-object v0, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 100
    .line 101
    invoke-virtual {v0}, Lax/C2/G;->i()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_68
    :try_start_68
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v2, Lax/C2/G;->t0:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    iget-object v4, p0, Lax/C2/G$b;->q:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v4, " failed because it threw an exception/error"

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v2, v3, v0}, Lax/B2/i;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_84
    .catchall {:try_start_68 .. :try_end_84} :catchall_2d

    .line 131
    .line 132
    .line 133
    :goto_84
    iget-object v0, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 134
    .line 135
    invoke-virtual {v0}, Lax/C2/G;->i()V

    .line 136
    .line 137
    .line 138
    goto :goto_a7

    .line 139
    :goto_8a
    :try_start_8a
    invoke-static {}, Lax/B2/i;->e()Lax/B2/i;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget-object v2, Lax/C2/G;->t0:Ljava/lang/String;

    .line 144
    .line 145
    new-instance v3, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-object v4, p0, Lax/C2/G$b;->q:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v4, " was cancelled"

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v1, v2, v3, v0}, Lax/B2/i;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a6
    .catchall {:try_start_8a .. :try_end_a6} :catchall_2d

    .line 165
    .line 166
    .line 167
    goto :goto_84

    .line 168
    :goto_a7
    return-void

    .line 169
    :goto_a8
    iget-object v1, p0, Lax/C2/G$b;->c0:Lax/C2/G;

    .line 170
    .line 171
    invoke-virtual {v1}, Lax/C2/G;->i()V

    .line 172
    .line 173
    .line 174
    throw v0
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
