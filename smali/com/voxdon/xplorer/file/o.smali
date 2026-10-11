.class public Lcom/voxdon/xplorer/file/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/voxdon/xplorer/file/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/o$b;
    }
.end annotation


# static fields
.field private static final m:Ljava/util/logging/Logger;


# instance fields
.field a:Lcom/voxdon/xplorer/file/m;

.field final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final c:Ljava/lang/String;

.field final d:Landroid/content/Context;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.FileOperator"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/o;->m:Ljava/util/logging/Logger;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/m;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->e:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->f:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->g:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->h:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->i:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->j:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->k:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->l:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/voxdon/xplorer/file/o;->d:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p2, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 33
    .line 34
    const p2, 0x7f1300b3

    .line 35
    .line 36
    .line 37
    :try_start_24
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_28
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_24 .. :try_end_28} :catch_29

    .line 41
    goto :goto_2b

    .line 42
    :catch_29
    const-string p1, " - Copy"

    .line 43
    .line 44
    :goto_2b
    iput-object p1, p0, Lcom/voxdon/xplorer/file/o;->c:Ljava/lang/String;

    .line 45
    .line 46
    return-void
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
.end method

.method private a0()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/T2/h;->n0(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method private b0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lax/T2/h;->n0(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method static synthetic c(Lcom/voxdon/xplorer/file/o;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/o;->l0()V

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

.method private d(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, p2}, Lax/c3/B;->n(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_9
    invoke-interface {p2}, Lax/c3/b;->p()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    cmp-long v7, v3, v5

    .line 17
    .line 18
    if-nez v7, :cond_19

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 21
    .line 22
    .line 23
    goto :goto_31

    .line 24
    :catch_17
    move-exception p2

    .line 25
    goto :goto_2e

    .line 26
    :cond_19
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2a

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_2a
    invoke-virtual {p1, p2, v1, v2, v2}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    :try_end_2d
    .catch Lax/b3/j; {:try_start_9 .. :try_end_2d} :catch_17

    .line 44
    .line 45
    .line 46
    goto :goto_31

    .line 47
    :goto_2e
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :goto_31
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_103

    .line 59
    .line 60
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v3, "MoveTempToDst 1"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v1, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 87
    .line 88
    .line 89
    :try_start_58
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_5b
    .catch Lax/b3/j; {:try_start_58 .. :try_end_5b} :catch_5d

    .line 90
    .line 91
    .line 92
    const/4 p2, 0x1

    .line 93
    goto :goto_5e

    .line 94
    :catch_5d
    const/4 p2, 0x0

    .line 95
    :goto_5e
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_102

    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object p3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 110
    .line 111
    const-string v3, ":"

    .line 112
    .line 113
    if-ne p1, p3, :cond_c5

    .line 114
    .line 115
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_c5

    .line 120
    .line 121
    :try_start_78
    move-object p1, v1

    .line 122
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 125
    .line 126
    .line 127
    move-result-object v2
    :try_end_7f
    .catch Lax/b3/r; {:try_start_78 .. :try_end_7f} :catch_7f

    .line 128
    :catch_7f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string p3, "MoveTempToDst 2-1"

    .line 137
    .line 138
    invoke-virtual {p1, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v4}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-interface {v1}, Lax/c3/b;->p()J

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 195
    .line 196
    .line 197
    goto :goto_fa

    .line 198
    :cond_c5
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    const-string p3, "MoveTempToDst 2-2"

    .line 207
    .line 208
    invoke-virtual {p1, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    new-instance p3, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 249
    .line 250
    .line 251
    :goto_fa
    new-instance p1, Lax/b3/j;

    .line 252
    .line 253
    const-string p2, "Could not delete and overwrite"

    .line 254
    .line 255
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_102
    move-object p2, v1

    .line 260
    :cond_103
    invoke-virtual {p1, p3, p2, v2, v2}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 261
    .line 262
    .line 263
    return-void
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private l(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_da

    .line 18
    .line 19
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v3, "MoveTempToDst 1"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 46
    .line 47
    .line 48
    :try_start_2f
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_32
    .catch Lax/b3/j; {:try_start_2f .. :try_end_32} :catch_34

    .line 49
    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    goto :goto_35

    .line 53
    :catch_34
    const/4 p2, 0x0

    .line 54
    :goto_35
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_d9

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 69
    .line 70
    const-string v3, ":"

    .line 71
    .line 72
    if-ne p1, p3, :cond_9c

    .line 73
    .line 74
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_9c

    .line 79
    .line 80
    :try_start_4f
    move-object p1, v1

    .line 81
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v2
    :try_end_56
    .catch Lax/b3/r; {:try_start_4f .. :try_end_56} :catch_56

    .line 87
    :catch_56
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string p3, "MoveTempToDst 2-1"

    .line 96
    .line 97
    invoke-virtual {p1, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance p3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Lax/c3/b;->p()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 154
    .line 155
    .line 156
    goto :goto_d1

    .line 157
    :cond_9c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const-string p3, "MoveTempToDst 2-2"

    .line 166
    .line 167
    invoke-virtual {p1, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-instance p3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 208
    .line 209
    .line 210
    :goto_d1
    new-instance p1, Lax/b3/j;

    .line 211
    .line 212
    const-string p2, "Could not delete and overwrite"

    .line 213
    .line 214
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_d9
    move-object p2, v1

    .line 219
    :cond_da
    invoke-virtual {p1, p3, p2, v2, v2}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 220
    .line 221
    .line 222
    return-void
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private declared-synchronized l0()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_29

    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndDecrement()I

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_29

    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c;->b()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lax/Z2/b;->d(Lax/c3/K;)V
    :try_end_26
    .catchall {:try_start_1 .. :try_end_26} :catchall_27

    .line 37
    .line 38
    .line 39
    goto :goto_29

    .line 40
    :catchall_27
    move-exception v0

    .line 41
    goto :goto_2b

    .line 42
    :cond_29
    :goto_29
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :goto_2b
    :try_start_2b
    monitor-exit p0
    :try_end_2c
    .catchall {:try_start_2b .. :try_end_2c} :catchall_27

    .line 45
    throw v0
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


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/c;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public B(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/file/c;->B(Lcom/voxdon/xplorer/file/n;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/file/c;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->u0(Lcom/voxdon/xplorer/file/n;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_19

    .line 18
    .line 19
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1, p2}, Lax/Z2/b;->m(Lcom/voxdon/xplorer/file/n;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-object p2

    .line 27
    :cond_1a
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-string v0, "FOLICH!!!"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ":"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 82
    .line 83
    .line 84
    new-instance p1, Lax/b3/j;

    .line 85
    .line 86
    const-string p2, "list children : fileinfo is not directory"

    .line 87
    .line 88
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
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

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move-wide v4, p4

    .line 29
    move-object/from16 v6, p6

    .line 30
    .line 31
    move-object/from16 v7, p7

    .line 32
    .line 33
    move/from16 v8, p8

    .line 34
    .line 35
    move-object/from16 v9, p9

    .line 36
    .line 37
    move-object/from16 v10, p10

    .line 38
    .line 39
    invoke-interface/range {v0 .. v10}, Lcom/voxdon/xplorer/file/c;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 40
    .line 41
    .line 42
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_36

    .line 47
    .line 48
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lax/T2/h;->b(Lcom/voxdon/xplorer/file/n;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method public E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_f

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    :goto_f
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_28

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v0, v1, :cond_24

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    const/4 v0, 0x0

    .line 38
    :goto_25
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 39
    .line 40
    .line 41
    :cond_28
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_124

    .line 46
    .line 47
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_66

    .line 52
    .line 53
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    const-string p4, "MV1"

    .line 62
    .line 63
    invoke-virtual {p3, p4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {p3}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    invoke-virtual {p4}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    invoke-virtual {p3, p4}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Lax/Ha/b;->h()V

    .line 84
    .line 85
    .line 86
    new-instance p3, Lax/b3/f;

    .line 87
    .line 88
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eq p1, p2, :cond_62

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    :cond_62
    invoke-direct {p3, v2}, Lax/b3/f;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    throw p3

    .line 103
    :cond_66
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_75

    .line 108
    .line 109
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0, p1}, Lax/T2/h;->Y(Lcom/voxdon/xplorer/file/n;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    goto :goto_77

    .line 118
    :cond_75
    const-wide/16 v0, 0x0

    .line 119
    .line 120
    :goto_77
    :try_start_77
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 121
    .line 122
    invoke-interface {v2, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/c;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    if-eqz p3, :cond_8c

    .line 130
    .line 131
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p3, p1, v0, v1}, Lax/T2/h;->s(Lcom/voxdon/xplorer/file/n;J)V

    .line 136
    .line 137
    .line 138
    goto :goto_8c

    .line 139
    :catchall_8a
    move-exception p3

    .line 140
    goto :goto_f0

    .line 141
    :cond_8c
    :goto_8c
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 142
    .line 143
    .line 144
    move-result p3
    :try_end_90
    .catchall {:try_start_77 .. :try_end_90} :catchall_8a

    .line 145
    if-eqz p3, :cond_bc

    .line 146
    .line 147
    :try_start_92
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    if-eq p3, p4, :cond_ad

    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    invoke-static {p3}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    invoke-virtual {p3, p4}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    goto :goto_b5

    .line 174
    :cond_ad
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-virtual {p0, p3}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    :goto_b5
    invoke-static {p3}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 183
    .line 184
    .line 185
    move-result-object p4

    .line 186
    invoke-virtual {p4, p3}, Lax/T2/h;->b(Lcom/voxdon/xplorer/file/n;)V
    :try_end_bc
    .catch Lax/b3/j; {:try_start_92 .. :try_end_bc} :catch_bc
    .catchall {:try_start_92 .. :try_end_bc} :catchall_8a

    .line 187
    .line 188
    .line 189
    :catch_bc
    :cond_bc
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-virtual {p3, p1}, Lax/Z2/b;->t(Lcom/voxdon/xplorer/file/n;)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 201
    .line 202
    .line 203
    move-result-object p4

    .line 204
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {p3, p4, v0}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 216
    .line 217
    .line 218
    move-result-object p4

    .line 219
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {p3, p4, v0}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    invoke-virtual {p3, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1, p2}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :goto_f0
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 242
    .line 243
    .line 244
    move-result-object p4

    .line 245
    invoke-virtual {p4, p1}, Lax/Z2/b;->t(Lcom/voxdon/xplorer/file/n;)V

    .line 246
    .line 247
    .line 248
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 249
    .line 250
    .line 251
    move-result-object p4

    .line 252
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {p4, v0, v1}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 264
    .line 265
    .line 266
    move-result-object p4

    .line 267
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {p4, v0, v1}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 279
    .line 280
    .line 281
    move-result-object p4

    .line 282
    invoke-virtual {p4, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1, p2}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 290
    .line 291
    .line 292
    throw p3

    .line 293
    :cond_124
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    const-string p2, "MV2"

    .line 302
    .line 303
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 324
    .line 325
    .line 326
    new-instance p1, Lax/b3/t;

    .line 327
    .line 328
    const-string p2, "Source file not exists"

    .line 329
    .line 330
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p1
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_65

    .line 13
    .line 14
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3c

    .line 19
    .line 20
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p2}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 43
    .line 44
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/c;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3b

    .line 52
    .line 53
    invoke-static {p2}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, p2}, Lax/T2/h;->b(Lcom/voxdon/xplorer/file/n;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    return-void

    .line 61
    :cond_3c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "CP2"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 92
    .line 93
    .line 94
    new-instance p1, Lax/b3/t;

    .line 95
    .line 96
    const-string p2, "Source is not exist"

    .line 97
    .line 98
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_65
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string p2, "CP1"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lax/b3/j;

    .line 132
    .line 133
    const-string p2, "Target is aleady exist"

    .line 134
    .line 135
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
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

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/file/c;->G(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/file/c;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public I(Lcom/voxdon/xplorer/file/n;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lax/T2/h;->Y(Lcom/voxdon/xplorer/file/n;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    goto :goto_11

    .line 16
    :cond_f
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    :goto_11
    :try_start_11
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 19
    .line 20
    invoke-interface {v2, p1}, Lcom/voxdon/xplorer/file/c;->I(Lcom/voxdon/xplorer/file/n;)V
    :try_end_16
    .catchall {:try_start_11 .. :try_end_16} :catchall_49

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v2, v3, v4}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2, v3, v4}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_48

    .line 65
    .line 66
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2, p1, v0, v1}, Lax/T2/h;->s(Lcom/voxdon/xplorer/file/n;J)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-void

    .line 74
    :catchall_49
    move-exception v0

    .line 75
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 110
    .line 111
    .line 112
    throw v0
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

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/c;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/c;->K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V

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

.method public L()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c;->L()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public N(Lcom/voxdon/xplorer/file/n;)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/file/c;->N(Lcom/voxdon/xplorer/file/n;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1e

    .line 8
    .line 9
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return v0
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

.method public O()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_11

    .line 12
    .line 13
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_13
    :try_start_13
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 21
    .line 22
    invoke-interface {v2, p1}, Lcom/voxdon/xplorer/file/c;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_18
    .catchall {:try_start_13 .. :try_end_18} :catchall_4b

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v2, v3, v4}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v2, v3, v4}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4a

    .line 67
    .line 68
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2, p1, v0, v1}, Lax/T2/h;->s(Lcom/voxdon/xplorer/file/n;J)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    return-void

    .line 76
    :catchall_4b
    move-exception v0

    .line 77
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->s(Lax/c3/K;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 112
    .line 113
    .line 114
    throw v0
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

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/file/c;->Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public R()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/voxdon/xplorer/file/o;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->j:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->k:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->l:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, " - "

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->f:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/voxdon/xplorer/file/o;->g:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/voxdon/xplorer/file/o;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
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

.method public S()Lax/Q2/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public T()Lax/c3/K;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public declared-synchronized U()I
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_9

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_9
    move-exception v0

    .line 11
    :try_start_a
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_a .. :try_end_b} :catchall_9

    .line 12
    throw v0
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

.method public V()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public W()Lax/c3/k0;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->y()Lax/c3/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public X(Lcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/file/n;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    :goto_e
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_ba

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const-string v3, ""

    .line 37
    .line 38
    if-eqz p1, :cond_28

    .line 39
    .line 40
    goto :goto_39

    .line 41
    :cond_28
    const/16 p1, 0x2e

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-lez p1, :cond_39

    .line 48
    .line 49
    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v0, v2

    .line 58
    :cond_39
    :goto_39
    const-string v2, ")"

    .line 59
    .line 60
    const-string v4, " ("

    .line 61
    .line 62
    const/4 p1, 0x2

    .line 63
    if-eqz p2, :cond_8f

    .line 64
    .line 65
    new-instance p2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {v1, p2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_68
    invoke-interface {v0}, Lax/c3/b;->n()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_8e

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    add-int/lit8 v1, p1, 0x1

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move p1, v1

    .line 142
    goto :goto_68

    .line 143
    :cond_8e
    return-object v0

    .line 144
    :cond_8f
    invoke-static {v1, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    :goto_93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    add-int/lit8 v1, p1, 0x1

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_b8

    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_b8
    move p1, v1

    .line 186
    goto :goto_93

    .line 187
    :cond_ba
    return-object p1
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public Y()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lcom/voxdon/xplorer/file/x;

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/voxdon/xplorer/file/x;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/x;->g1()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public Z()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->V()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public a()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c;->b()V

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
.end method

.method public c0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->u0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lax/Z2/b;->f(Lcom/voxdon/xplorer/file/n;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_f
    const/4 p1, 0x0

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public d0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public e(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    invoke-static {p2}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/o;->Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_11
    invoke-static {p1, p2}, Lax/c3/B;->N(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_19

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    :cond_19
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/o;->Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
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

.method public e0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/m;->a0(Lcom/voxdon/xplorer/file/n;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public f(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/m;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/m$f;->q:Lcom/voxdon/xplorer/file/m$f;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/file/o;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public g()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->g()V

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
.end method

.method public g0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;ZZ)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            "ZZ)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->c0(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_27

    .line 6
    .line 7
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p3, :cond_26

    .line 16
    .line 17
    if-eqz p2, :cond_26

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p3}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_26

    .line 28
    .line 29
    iget-object p3, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 30
    .line 31
    check-cast p3, Lcom/voxdon/xplorer/file/u;

    .line 32
    .line 33
    const/4 p4, 0x1

    .line 34
    invoke-virtual {p3, p1, p2, p4}, Lcom/voxdon/xplorer/file/u;->g2(Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_26
    return-object p2

    .line 40
    :cond_27
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/o;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p4, :cond_a5

    .line 45
    .line 46
    if-eqz p1, :cond_a5

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    instance-of p2, p2, Lcom/voxdon/xplorer/file/x;

    .line 53
    .line 54
    if-eqz p2, :cond_a5

    .line 55
    .line 56
    invoke-static {p1}, Lcom/voxdon/xplorer/file/x;->J0(Ljava/util/List;)Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_81

    .line 61
    .line 62
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    if-nez p3, :cond_81

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    check-cast p3, Lcom/voxdon/xplorer/file/x;

    .line 73
    .line 74
    invoke-virtual {p3, p2}, Lcom/voxdon/xplorer/file/x;->H1(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_81

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    :cond_53
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-eqz p3, :cond_81

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    check-cast p3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    :cond_63
    :goto_63
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_53

    .line 105
    .line 106
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_63

    .line 121
    .line 122
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 123
    .line 124
    sget-object v1, Lcom/voxdon/xplorer/file/y$b;->d0:Lcom/voxdon/xplorer/file/y$b;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/y;->k1(Lcom/voxdon/xplorer/file/y$b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_63

    .line 130
    :cond_81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    :cond_85
    :goto_85
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    if-eqz p3, :cond_a5

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    check-cast p3, Lcom/voxdon/xplorer/file/n;

    .line 145
    .line 146
    invoke-static {}, Lax/Z2/g;->h()Lax/Z2/g;

    .line 147
    .line 148
    .line 149
    move-result-object p4

    .line 150
    invoke-virtual {p4, p3}, Lax/Z2/g;->f(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p4

    .line 154
    if-eqz p4, :cond_85

    .line 155
    .line 156
    invoke-static {p4}, Lax/Z2/g;->c(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y$b;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    check-cast p3, Lcom/voxdon/xplorer/file/y;

    .line 161
    .line 162
    invoke-virtual {p3, p4}, Lcom/voxdon/xplorer/file/y;->k1(Lcom/voxdon/xplorer/file/y$b;)V

    .line 163
    .line 164
    .line 165
    goto :goto_85

    .line 166
    :cond_a5
    return-object p1
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public h(Lcom/voxdon/xplorer/file/c$a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/m;->h(Lcom/voxdon/xplorer/file/c$a;)V

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

.method public h0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZLax/u3/c;Lax/g3/i;)V
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const/4 v14, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-ne v0, v5, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :goto_17
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v2}, Lax/c3/b;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_160

    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v3, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_4a

    .line 53
    .line 54
    invoke-interface {v0}, Lax/c3/b;->n()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_4a

    .line 59
    .line 60
    invoke-virtual {v3, v0, v6}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_42

    .line 65
    .line 66
    goto :goto_4a

    .line 67
    :cond_42
    new-instance v0, Lax/b3/j;

    .line 68
    .line 69
    const-string v2, "Create target folder failed"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_4a
    :goto_4a
    const/4 v5, 0x0

    .line 76
    :try_start_4b
    invoke-virtual {v1, v2, v4}, Lcom/voxdon/xplorer/file/o;->e(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-interface {v4}, Lax/c3/b;->n()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_7d

    .line 85
    .line 86
    invoke-interface {v4}, Lax/c3/b;->isDirectory()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_77

    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/o;->o0()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_69

    .line 97
    .line 98
    if-nez v0, :cond_69

    .line 99
    .line 100
    move-object v15, v5

    .line 101
    const/16 v16, 0x1

    .line 102
    .line 103
    :goto_66
    const/16 v17, 0x1

    .line 104
    .line 105
    goto :goto_82

    .line 106
    :cond_69
    invoke-static/range {p2 .. p3}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    move-object v15, v5

    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    goto :goto_66

    .line 114
    :catch_71
    move-exception v0

    .line 115
    goto/16 :goto_131

    .line 116
    .line 117
    :catch_74
    move-exception v0

    .line 118
    goto/16 :goto_14c

    .line 119
    .line 120
    :cond_77
    new-instance v0, Lax/b3/u;

    .line 121
    .line 122
    invoke-direct {v0}, Lax/b3/u;-><init>()V

    .line 123
    .line 124
    .line 125
    throw v0
    :try_end_7d
    .catch Lax/b3/a; {:try_start_4b .. :try_end_7d} :catch_74
    .catch Lax/b3/j; {:try_start_4b .. :try_end_7d} :catch_71

    .line 126
    :cond_7d
    move-object v15, v4

    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    :goto_82
    if-eqz v0, :cond_98

    .line 132
    .line 133
    move-object/from16 v12, p5

    .line 134
    .line 135
    move-object/from16 v13, p6

    .line 136
    .line 137
    :try_start_88
    invoke-virtual {v1, v2, v15, v12, v13}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    :try_end_8b
    .catch Lax/b3/a; {:try_start_88 .. :try_end_8b} :catch_94
    .catch Lax/b3/j; {:try_start_88 .. :try_end_8b} :catch_90

    .line 138
    .line 139
    .line 140
    move-object v0, v4

    .line 141
    move-object v4, v15

    .line 142
    const/4 v14, 0x0

    .line 143
    goto/16 :goto_f8

    .line 144
    .line 145
    :catch_90
    move-exception v0

    .line 146
    :goto_91
    move-object v5, v15

    .line 147
    goto/16 :goto_131

    .line 148
    .line 149
    :catch_94
    move-exception v0

    .line 150
    :goto_95
    move-object v5, v15

    .line 151
    goto/16 :goto_14c

    .line 152
    .line 153
    :cond_98
    move-object/from16 v12, p5

    .line 154
    .line 155
    move-object/from16 v13, p6

    .line 156
    .line 157
    :try_start_9c
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->c0()Z

    .line 158
    .line 159
    .line 160
    move-result v0
    :try_end_a0
    .catch Lax/b3/a; {:try_start_9c .. :try_end_a0} :catch_12f
    .catch Lax/b3/j; {:try_start_9c .. :try_end_a0} :catch_12d

    .line 161
    if-eqz v0, :cond_a7

    .line 162
    .line 163
    :try_start_a2
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->r(Lcom/voxdon/xplorer/file/n;)V
    :try_end_a5
    .catch Lax/b3/j; {:try_start_a2 .. :try_end_a5} :catch_a6
    .catch Lax/b3/a; {:try_start_a2 .. :try_end_a5} :catch_94

    .line 164
    .line 165
    .line 166
    goto :goto_a7

    .line 167
    :catch_a6
    nop

    .line 168
    :cond_a7
    :goto_a7
    if-eqz v16, :cond_d3

    .line 169
    .line 170
    :try_start_a9
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-interface {v2}, Lax/c3/b;->s()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-interface {v2}, Lax/c3/b;->p()J

    .line 179
    .line 180
    .line 181
    move-result-wide v7

    .line 182
    invoke-interface {v2}, Lax/c3/b;->q()J

    .line 183
    .line 184
    .line 185
    move-result-wide v9

    .line 186
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    move/from16 v11, p4

    .line 195
    .line 196
    invoke-virtual/range {v3 .. v13}, Lcom/voxdon/xplorer/file/o;->s0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_c6
    .catch Lax/b3/a; {:try_start_a9 .. :try_end_c6} :catch_cf
    .catch Lax/b3/j; {:try_start_a9 .. :try_end_c6} :catch_cb

    .line 197
    .line 198
    .line 199
    move-object v0, v4

    .line 200
    move-object/from16 v3, p2

    .line 201
    .line 202
    move-object v4, v15

    .line 203
    goto :goto_f8

    .line 204
    :catch_cb
    move-exception v0

    .line 205
    move-object/from16 v3, p2

    .line 206
    .line 207
    goto :goto_91

    .line 208
    :catch_cf
    move-exception v0

    .line 209
    move-object/from16 v3, p2

    .line 210
    .line 211
    goto :goto_95

    .line 212
    :cond_d3
    move-object v0, v4

    .line 213
    :try_start_d4
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-interface {v2}, Lax/c3/b;->s()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-interface {v2}, Lax/c3/b;->p()J

    .line 222
    .line 223
    .line 224
    move-result-wide v7

    .line 225
    invoke-interface {v2}, Lax/c3/b;->q()J

    .line 226
    .line 227
    .line 228
    move-result-wide v3

    .line 229
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 234
    .line 235
    .line 236
    move-result-object v10
    :try_end_ec
    .catch Lax/b3/a; {:try_start_d4 .. :try_end_ec} :catch_128
    .catch Lax/b3/j; {:try_start_d4 .. :try_end_ec} :catch_123

    .line 237
    move-object/from16 v3, p2

    .line 238
    .line 239
    move/from16 v11, p4

    .line 240
    .line 241
    move-object/from16 v12, p5

    .line 242
    .line 243
    move-object/from16 v13, p6

    .line 244
    .line 245
    move-object v4, v15

    .line 246
    :try_start_f5
    invoke-virtual/range {v3 .. v13}, Lcom/voxdon/xplorer/file/o;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 247
    .line 248
    .line 249
    :goto_f8
    if-eqz v17, :cond_11c

    .line 250
    .line 251
    if-nez v16, :cond_11c

    .line 252
    .line 253
    invoke-virtual {v4}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-virtual {v3, v5}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 258
    .line 259
    .line 260
    move-result-object v5
    :try_end_104
    .catch Lax/b3/a; {:try_start_f5 .. :try_end_104} :catch_119
    .catch Lax/b3/j; {:try_start_f5 .. :try_end_104} :catch_116

    .line 261
    :try_start_104
    invoke-interface {v5}, Lax/c3/b;->n()Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_10e

    .line 266
    .line 267
    invoke-direct {v1, v3, v0, v5}, Lcom/voxdon/xplorer/file/o;->l(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V

    .line 268
    .line 269
    .line 270
    goto :goto_11d

    .line 271
    :cond_10e
    new-instance v0, Lax/b3/t;

    .line 272
    .line 273
    const-string v4, "tmp file not exists"

    .line 274
    .line 275
    invoke-direct {v0, v4}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :catch_116
    move-exception v0

    .line 280
    :goto_117
    move-object v5, v4

    .line 281
    goto :goto_131

    .line 282
    :catch_119
    move-exception v0

    .line 283
    :goto_11a
    move-object v5, v4

    .line 284
    goto :goto_14c

    .line 285
    :cond_11c
    move-object v5, v4

    .line 286
    :goto_11d
    if-eqz v14, :cond_122

    .line 287
    .line 288
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_122
    .catch Lax/b3/a; {:try_start_104 .. :try_end_122} :catch_74
    .catch Lax/b3/j; {:try_start_104 .. :try_end_122} :catch_71

    .line 289
    .line 290
    .line 291
    :cond_122
    return-void

    .line 292
    :catch_123
    move-exception v0

    .line 293
    move-object/from16 v3, p2

    .line 294
    .line 295
    :goto_126
    move-object v4, v15

    .line 296
    goto :goto_117

    .line 297
    :catch_128
    move-exception v0

    .line 298
    move-object/from16 v3, p2

    .line 299
    .line 300
    :goto_12b
    move-object v4, v15

    .line 301
    goto :goto_11a

    .line 302
    :catch_12d
    move-exception v0

    .line 303
    goto :goto_126

    .line 304
    :catch_12f
    move-exception v0

    .line 305
    goto :goto_12b

    .line 306
    :goto_131
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 307
    .line 308
    .line 309
    if-eqz v5, :cond_14b

    .line 310
    .line 311
    instance-of v4, v0, Lax/b3/f;

    .line 312
    .line 313
    if-nez v4, :cond_14b

    .line 314
    .line 315
    :try_start_13a
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_14b

    .line 328
    .line 329
    invoke-virtual {v3, v5}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_14b
    .catch Lax/b3/j; {:try_start_13a .. :try_end_14b} :catch_14b

    .line 330
    .line 331
    .line 332
    :catch_14b
    :cond_14b
    throw v0

    .line 333
    :goto_14c
    if-eqz v5, :cond_15f

    .line 334
    .line 335
    :try_start_14e
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_15f

    .line 348
    .line 349
    invoke-virtual {v3, v5}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_15f
    .catch Lax/b3/j; {:try_start_14e .. :try_end_15f} :catch_15f

    .line 350
    .line 351
    .line 352
    :catch_15f
    :cond_15f
    throw v0

    .line 353
    :cond_160
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    const-string v2, "MVEX"

    .line 362
    .line 363
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v0, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 380
    .line 381
    .line 382
    new-instance v0, Lax/b3/t;

    .line 383
    .line 384
    const-string v2, "Move source file not found"

    .line 385
    .line 386
    invoke-direct {v0, v2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method public i(J)Z
    .registers 8

    .line 1
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcom/voxdon/xplorer/file/o$a;

    .line 13
    .line 14
    invoke-direct {v2, p0, v1, v0}, Lcom/voxdon/xplorer/file/o$a;-><init>(Lcom/voxdon/xplorer/file/o;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/CountDownLatch;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/o;->h(Lcom/voxdon/xplorer/file/c$a;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v4, p1, v2

    .line 23
    .line 24
    if-nez v4, :cond_1b

    .line 25
    .line 26
    const-wide/16 p1, 0x4e20

    .line 27
    .line 28
    :cond_1b
    :try_start_1b
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_20
    .catch Ljava/lang/InterruptedException; {:try_start_1b .. :try_end_20} :catch_20

    .line 31
    .line 32
    .line 33
    :catch_20
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
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

.method public i0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->c0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public j(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZZZLax/u3/c;Lax/g3/i;)V
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-ne v2, v4, :cond_14

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 v2, 0x0

    .line 22
    :goto_15
    invoke-static {v2}, Lax/u3/b;->c(Z)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v2}, Lax/u3/b;->a(Z)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    :try_start_20
    invoke-static {v0, v3}, Lax/c3/B;->N(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-interface {v3}, Lax/c3/b;->n()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_47

    .line 42
    .line 43
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/o;->o0()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_36

    .line 48
    .line 49
    if-nez v4, :cond_36

    .line 50
    .line 51
    move-object v15, v2

    .line 52
    const/4 v13, 0x1

    .line 53
    :goto_34
    const/4 v14, 0x1

    .line 54
    goto :goto_4a

    .line 55
    :cond_36
    invoke-static/range {p2 .. p3}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 56
    .line 57
    .line 58
    move-result-object v7
    :try_end_3a
    .catch Lax/b3/a; {:try_start_20 .. :try_end_3a} :catch_42
    .catch Lax/b3/j; {:try_start_20 .. :try_end_3a} :catch_3d

    .line 59
    move-object v15, v7

    .line 60
    const/4 v13, 0x0

    .line 61
    goto :goto_34

    .line 62
    :catch_3d
    move-exception v0

    .line 63
    move-object/from16 v4, p2

    .line 64
    .line 65
    goto/16 :goto_f6

    .line 66
    .line 67
    :catch_42
    move-exception v0

    .line 68
    move-object/from16 v4, p2

    .line 69
    .line 70
    goto/16 :goto_10d

    .line 71
    .line 72
    :cond_47
    move-object v15, v3

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    :goto_4a
    if-eqz v4, :cond_65

    .line 76
    .line 77
    move-object/from16 v11, p7

    .line 78
    .line 79
    move-object/from16 v12, p8

    .line 80
    .line 81
    :try_start_50
    invoke-virtual {v1, v0, v15, v11, v12}, Lcom/voxdon/xplorer/file/o;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v4, p2

    .line 85
    .line 86
    move-object v0, v3

    .line 87
    :goto_56
    move-object v3, v15

    .line 88
    goto/16 :goto_bd

    .line 89
    .line 90
    :catch_59
    move-exception v0

    .line 91
    move-object/from16 v4, p2

    .line 92
    .line 93
    move-object v2, v15

    .line 94
    goto/16 :goto_f6

    .line 95
    .line 96
    :catch_5f
    move-exception v0

    .line 97
    move-object/from16 v4, p2

    .line 98
    .line 99
    move-object v2, v15

    .line 100
    goto/16 :goto_10d

    .line 101
    .line 102
    :cond_65
    move-object/from16 v11, p7

    .line 103
    .line 104
    move-object/from16 v12, p8

    .line 105
    .line 106
    if-eqz p4, :cond_75

    .line 107
    .line 108
    invoke-interface {v0}, Lax/c3/b;->q()J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    move-object v8, v4

    .line 117
    goto :goto_76

    .line 118
    :cond_75
    move-object v8, v2

    .line 119
    :goto_76
    if-eqz p5, :cond_7c

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 122
    .line 123
    .line 124
    move-result-object v2
    :try_end_7c
    .catch Lax/b3/a; {:try_start_50 .. :try_end_7c} :catch_5f
    .catch Lax/b3/j; {:try_start_50 .. :try_end_7c} :catch_59

    .line 125
    :cond_7c
    move-object v9, v2

    .line 126
    :try_start_7d
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->c0()Z

    .line 127
    .line 128
    .line 129
    move-result v2
    :try_end_81
    .catch Lax/b3/a; {:try_start_7d .. :try_end_81} :catch_f1
    .catch Lax/b3/j; {:try_start_7d .. :try_end_81} :catch_ec

    .line 130
    if-eqz v2, :cond_88

    .line 131
    .line 132
    :try_start_83
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->r(Lcom/voxdon/xplorer/file/n;)V
    :try_end_86
    .catch Lax/b3/j; {:try_start_83 .. :try_end_86} :catch_87
    .catch Lax/b3/a; {:try_start_83 .. :try_end_86} :catch_5f

    .line 133
    .line 134
    .line 135
    goto :goto_88

    .line 136
    :catch_87
    nop

    .line 137
    :cond_88
    :goto_88
    if-eqz v13, :cond_a2

    .line 138
    .line 139
    :try_start_8a
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-interface {v0}, Lax/c3/b;->s()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    move-object/from16 v2, p2

    .line 152
    .line 153
    move/from16 v10, p6

    .line 154
    .line 155
    invoke-virtual/range {v2 .. v12}, Lcom/voxdon/xplorer/file/o;->s0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_9d
    .catch Lax/b3/a; {:try_start_8a .. :try_end_9d} :catch_5f
    .catch Lax/b3/j; {:try_start_8a .. :try_end_9d} :catch_59

    .line 156
    .line 157
    .line 158
    move-object/from16 v4, p2

    .line 159
    .line 160
    move-object/from16 v0, p3

    .line 161
    .line 162
    goto :goto_56

    .line 163
    :cond_a2
    :try_start_a2
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-interface {v0}, Lax/c3/b;->s()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6
    :try_end_ae
    .catch Lax/b3/a; {:try_start_a2 .. :try_end_ae} :catch_f1
    .catch Lax/b3/j; {:try_start_a2 .. :try_end_ae} :catch_ec

    .line 175
    move-object/from16 v2, p2

    .line 176
    .line 177
    move-object/from16 v0, p3

    .line 178
    .line 179
    move/from16 v10, p6

    .line 180
    .line 181
    move-object/from16 v11, p7

    .line 182
    .line 183
    move-object/from16 v12, p8

    .line 184
    .line 185
    move-object v3, v15

    .line 186
    :try_start_b9
    invoke-virtual/range {v2 .. v12}, Lcom/voxdon/xplorer/file/o;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_bc
    .catch Lax/b3/a; {:try_start_b9 .. :try_end_bc} :catch_e9
    .catch Lax/b3/j; {:try_start_b9 .. :try_end_bc} :catch_e6

    .line 187
    .line 188
    .line 189
    move-object v4, v2

    .line 190
    :goto_bd
    if-eqz v14, :cond_e5

    .line 191
    .line 192
    if-nez v13, :cond_e5

    .line 193
    .line 194
    :try_start_c1
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 199
    .line 200
    .line 201
    move-result-object v2
    :try_end_c9
    .catch Lax/b3/a; {:try_start_c1 .. :try_end_c9} :catch_e2
    .catch Lax/b3/j; {:try_start_c1 .. :try_end_c9} :catch_df

    .line 202
    :try_start_c9
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_d7

    .line 207
    .line 208
    invoke-direct {v1, v4, v0, v2}, Lcom/voxdon/xplorer/file/o;->l(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V

    .line 209
    .line 210
    .line 211
    goto :goto_e5

    .line 212
    :catch_d3
    move-exception v0

    .line 213
    goto :goto_f6

    .line 214
    :catch_d5
    move-exception v0

    .line 215
    goto :goto_10d

    .line 216
    :cond_d7
    new-instance v0, Lax/b3/t;

    .line 217
    .line 218
    const-string v3, "tmp file not exists"

    .line 219
    .line 220
    invoke-direct {v0, v3}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0
    :try_end_df
    .catch Lax/b3/a; {:try_start_c9 .. :try_end_df} :catch_d5
    .catch Lax/b3/j; {:try_start_c9 .. :try_end_df} :catch_d3

    .line 224
    :catch_df
    move-exception v0

    .line 225
    :goto_e0
    move-object v2, v3

    .line 226
    goto :goto_f6

    .line 227
    :catch_e2
    move-exception v0

    .line 228
    :goto_e3
    move-object v2, v3

    .line 229
    goto :goto_10d

    .line 230
    :cond_e5
    :goto_e5
    return-void

    .line 231
    :catch_e6
    move-exception v0

    .line 232
    move-object v4, v2

    .line 233
    goto :goto_e0

    .line 234
    :catch_e9
    move-exception v0

    .line 235
    move-object v4, v2

    .line 236
    goto :goto_e3

    .line 237
    :catch_ec
    move-exception v0

    .line 238
    move-object/from16 v4, p2

    .line 239
    .line 240
    move-object v3, v15

    .line 241
    goto :goto_e0

    .line 242
    :catch_f1
    move-exception v0

    .line 243
    move-object/from16 v4, p2

    .line 244
    .line 245
    move-object v3, v15

    .line 246
    goto :goto_e3

    .line 247
    :goto_f6
    if-eqz v2, :cond_109

    .line 248
    .line 249
    :try_start_f8
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_109

    .line 262
    .line 263
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_109
    .catch Lax/b3/j; {:try_start_f8 .. :try_end_109} :catch_109

    .line 264
    .line 265
    .line 266
    :catch_109
    :cond_109
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :goto_10d
    if-eqz v2, :cond_120

    .line 271
    .line 272
    :try_start_10f
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-interface {v2}, Lax/c3/b;->n()Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_120

    .line 285
    .line 286
    invoke-virtual {v4, v2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_120
    .catch Lax/b3/j; {:try_start_10f .. :try_end_120} :catch_120

    .line 287
    .line 288
    .line 289
    :catch_120
    :cond_120
    throw v0
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
.end method

.method public j0(Ljava/lang/String;I)Lax/l3/a;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/voxdon/xplorer/file/m;->e0(Ljava/lang/String;I)Lax/l3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public k(Lcom/voxdon/xplorer/file/n;Z)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_3b

    .line 3
    .line 4
    :try_start_3
    iget-object p2, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 5
    .line 6
    invoke-interface {p2, p1}, Lcom/voxdon/xplorer/file/c;->M(Lcom/voxdon/xplorer/file/n;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_3a

    .line 11
    .line 12
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/o;->a0()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3a

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, p1}, Lax/T2/h;->b(Lcom/voxdon/xplorer/file/n;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    return p2

    .line 60
    :cond_3b
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    const/4 v1, 0x1

    .line 65
    if-eqz p2, :cond_43

    .line 66
    .line 67
    return v1

    .line 68
    :cond_43
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object v2, Lax/c3/d0;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_50

    .line 79
    .line 80
    return v0

    .line 81
    :cond_50
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5b

    .line 90
    .line 91
    return v0

    .line 92
    :cond_5b
    invoke-virtual {p0, p2, v1}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_68

    .line 97
    .line 98
    invoke-virtual {p0, p1, v0}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 99
    .line 100
    .line 101
    move-result p1
    :try_end_65
    .catch Lax/b3/j; {:try_start_3 .. :try_end_65} :catch_68

    .line 102
    if-eqz p1, :cond_68

    .line 103
    .line 104
    return v1

    .line 105
    :catch_68
    :cond_68
    return v0
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

.method public declared-synchronized k0(Z)V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_48

    .line 9
    .line 10
    sget-object v0, Lcom/voxdon/xplorer/file/o;->m:Ljava/util/logging/Logger;

    .line 11
    .line 12
    const-string v1, "OPEROATOR RELEASED MORE THAN RETAINED!!!!!"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "REL"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, ":"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->R()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 68
    .line 69
    .line 70
    goto :goto_79

    .line 71
    :catchall_46
    move-exception p1

    .line 72
    goto :goto_ac

    .line 73
    :cond_48
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->k:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->l:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->j:Ljava/lang/String;

    .line 78
    .line 79
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->k:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->i:Ljava/lang/String;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->j:Ljava/lang/String;

    .line 84
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v1, "("

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ") "

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lax/Q2/a;->g()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->i:Ljava/lang/String;

    .line 121
    .line 122
    :goto_79
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->L()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8b

    .line 127
    .line 128
    new-instance p1, Lcom/voxdon/xplorer/file/o$b;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Lcom/voxdon/xplorer/file/o$b;-><init>(Lcom/voxdon/xplorer/file/o;)V

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    new-array v0, v0, [Ljava/lang/Long;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 137
    .line 138
    .line 139
    goto :goto_aa

    .line 140
    :cond_8b
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/o;->l0()V

    .line 141
    .line 142
    .line 143
    if-eqz p1, :cond_aa

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    instance-of p1, p1, Lcom/voxdon/xplorer/file/x;

    .line 150
    .line 151
    if-eqz p1, :cond_aa

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lcom/voxdon/xplorer/file/x;

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/x;->g1()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_aa

    .line 164
    .line 165
    invoke-static {}, Lax/X2/Q;->a0()Z

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/x;->G0()V
    :try_end_aa
    .catchall {:try_start_1 .. :try_end_aa} :catchall_46

    .line 169
    .line 170
    .line 171
    :cond_aa
    :goto_aa
    monitor-exit p0

    .line 172
    return-void

    .line 173
    :goto_ac
    :try_start_ac
    monitor-exit p0
    :try_end_ad
    .catchall {:try_start_ac .. :try_end_ad} :catchall_46

    .line 174
    throw p1
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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

.method public m(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->I(Lcom/voxdon/xplorer/file/n;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2c

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_28

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/o;->m(Lcom/voxdon/xplorer/file/n;)V

    .line 38
    .line 39
    .line 40
    goto :goto_18

    .line 41
    :cond_28
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public m0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_19

    .line 6
    .line 7
    new-instance p3, Lax/b3/f;

    .line 8
    .line 9
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eq p1, p2, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_15

    .line 21
    :cond_14
    const/4 p1, 0x0

    .line 22
    :goto_15
    invoke-direct {p3, p1}, Lax/b3/f;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    throw p3

    .line 26
    :cond_19
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/o;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public n(Lax/g3/i;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lcom/voxdon/xplorer/file/x;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/voxdon/xplorer/file/x;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/x;->E0(Lax/g3/i;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public declared-synchronized n0()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->g:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->f:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->g:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->f:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "("

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/voxdon/xplorer/file/o;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ") "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lax/Q2/a;->g()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/voxdon/xplorer/file/o;->e:Ljava/lang/String;
    :try_end_37
    .catchall {:try_start_1 .. :try_end_37} :catchall_39

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :catchall_39
    move-exception v0

    .line 59
    :try_start_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_3a .. :try_end_3b} :catchall_39

    .line 60
    throw v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-virtual/range {v0 .. v6}, Lcom/voxdon/xplorer/file/m;->m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method public o0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->g0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public p(Lcom/voxdon/xplorer/file/n;Ljava/io/File;Lax/u3/c;Lax/g3/i;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lax/c3/b;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1d

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {v2, p2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1d
    move-object v3, v0

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    cmp-long p2, v0, v4

    .line 40
    .line 41
    if-lez p2, :cond_2d

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    goto :goto_2f

    .line 46
    :cond_2d
    const/4 p2, 0x1

    .line 47
    const/4 v4, 0x1

    .line 48
    :goto_2f
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    move-object v0, p0

    .line 51
    move-object v1, p1

    .line 52
    move-object v7, p3

    .line 53
    move-object v8, p4

    .line 54
    invoke-virtual/range {v0 .. v8}, Lcom/voxdon/xplorer/file/o;->j(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZZZLax/u3/c;Lax/g3/i;)V

    .line 55
    .line 56
    .line 57
    return-void
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

.method public p0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->h0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_e

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/o;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public q0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->i0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public r(Lcom/voxdon/xplorer/file/n;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/m;->n(Lcom/voxdon/xplorer/file/n;)V

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

.method public r0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    instance-of v0, v0, Lax/c3/i0;

    .line 4
    .line 5
    return v0
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

.method public s(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/o;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public s0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0, v2, v3}, Lax/Z2/b;->p(Lax/c3/K;Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lax/Z2/b;->e(Lcom/voxdon/xplorer/file/n;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move-wide v4, p4

    .line 29
    move-object/from16 v6, p6

    .line 30
    .line 31
    move-object/from16 v7, p7

    .line 32
    .line 33
    move/from16 v8, p8

    .line 34
    .line 35
    move-object/from16 v9, p9

    .line 36
    .line 37
    move-object/from16 v10, p10

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v10}, Lcom/voxdon/xplorer/file/m;->j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 40
    .line 41
    .line 42
    invoke-direct/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->b0(Lcom/voxdon/xplorer/file/n;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_36

    .line 47
    .line 48
    invoke-static {p1}, Lax/T2/h;->T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lax/T2/h;->b(Lcom/voxdon/xplorer/file/n;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method public t()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->d:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public t0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-interface/range {p3 .. p3}, Lax/c3/b;->n()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_5
    .catch Lax/b3/a; {:try_start_1 .. :try_end_5} :catch_ee

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_27

    .line 8
    .line 9
    :try_start_8
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/o;->o0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_23

    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/o;->p0()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    goto :goto_23

    .line 23
    :cond_16
    invoke-static/range {p2 .. p3}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_1a
    .catch Lax/b3/a; {:try_start_8 .. :try_end_1a} :catch_1d

    .line 27
    move-object v12, v1

    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_2a

    .line 30
    :catch_1d
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    move-object/from16 v3, p2

    .line 33
    .line 34
    goto/16 :goto_f2

    .line 35
    .line 36
    :cond_23
    :goto_23
    move-object v12, v1

    .line 37
    const/4 v0, 0x1

    .line 38
    const/4 v2, 0x1

    .line 39
    goto :goto_2a

    .line 40
    :cond_27
    move-object/from16 v12, p3

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :goto_2a
    if-eqz v2, :cond_8f

    .line 44
    .line 45
    :try_start_2c
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/o;->o0()Z
    :try_end_2f
    .catch Lax/b3/a; {:try_start_2c .. :try_end_2f} :catch_54

    .line 46
    .line 47
    .line 48
    :try_start_2f
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 69
    .line 70
    .line 71
    move-result-object v8
    :try_end_47
    .catch Lax/b3/z; {:try_start_2f .. :try_end_47} :catch_5e
    .catch Lax/b3/a; {:try_start_2f .. :try_end_47} :catch_54

    .line 72
    const/4 v9, 0x1

    .line 73
    move-object/from16 v1, p2

    .line 74
    .line 75
    move-object/from16 v2, p3

    .line 76
    .line 77
    move-object/from16 v10, p4

    .line 78
    .line 79
    move-object/from16 v11, p5

    .line 80
    .line 81
    :try_start_50
    invoke-virtual/range {v1 .. v11}, Lcom/voxdon/xplorer/file/o;->s0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_53
    .catch Lax/b3/z; {:try_start_50 .. :try_end_53} :catch_5b
    .catch Lax/b3/a; {:try_start_50 .. :try_end_53} :catch_54

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_54
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    move-object/from16 v3, p2

    .line 88
    .line 89
    move-object v1, v12

    .line 90
    goto/16 :goto_f2

    .line 91
    .line 92
    :catch_5b
    move-exception v0

    .line 93
    move-object v13, v2

    .line 94
    goto :goto_61

    .line 95
    :catch_5e
    move-exception v0

    .line 96
    move-object/from16 v13, p3

    .line 97
    .line 98
    :goto_61
    :try_start_61
    invoke-static/range {p2 .. p3}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 99
    .line 100
    .line 101
    move-result-object v2
    :try_end_65
    .catch Lax/b3/a; {:try_start_61 .. :try_end_65} :catch_54

    .line 102
    :try_start_65
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const/4 v9, 0x1

    .line 127
    move-object/from16 v1, p2

    .line 128
    .line 129
    move-object/from16 v10, p4

    .line 130
    .line 131
    move-object/from16 v11, p5

    .line 132
    .line 133
    invoke-virtual/range {v1 .. v11}, Lcom/voxdon/xplorer/file/o;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 134
    .line 135
    .line 136
    throw v0
    :try_end_88
    .catch Lax/b3/a; {:try_start_65 .. :try_end_88} :catch_88

    .line 137
    :catch_88
    move-exception v0

    .line 138
    move-object p1, v0

    .line 139
    move-object/from16 v3, p2

    .line 140
    .line 141
    :goto_8c
    move-object v1, v2

    .line 142
    goto/16 :goto_f2

    .line 143
    .line 144
    :cond_8f
    move-object/from16 v13, p3

    .line 145
    .line 146
    :try_start_91
    invoke-virtual/range {p0 .. p1}, Lcom/voxdon/xplorer/file/o;->x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 155
    .line 156
    .line 157
    move-result-wide v5

    .line 158
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 159
    .line 160
    .line 161
    move-result-wide v1

    .line 162
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 167
    .line 168
    .line 169
    move-result-object v8
    :try_end_a9
    .catch Lax/b3/a; {:try_start_91 .. :try_end_a9} :catch_e9

    .line 170
    const/4 v9, 0x1

    .line 171
    move-object/from16 v1, p2

    .line 172
    .line 173
    move-object/from16 v10, p4

    .line 174
    .line 175
    move-object/from16 v11, p5

    .line 176
    .line 177
    move-object v2, v12

    .line 178
    :try_start_b1
    invoke-virtual/range {v1 .. v11}, Lcom/voxdon/xplorer/file/o;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_b4
    .catch Lax/b3/a; {:try_start_b1 .. :try_end_b4} :catch_e6

    .line 179
    .line 180
    .line 181
    move-object v3, v1

    .line 182
    if-eqz v0, :cond_e5

    .line 183
    .line 184
    :try_start_b7
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v3, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 189
    .line 190
    .line 191
    move-result-object v1
    :try_end_bf
    .catch Lax/b3/a; {:try_start_b7 .. :try_end_bf} :catch_e2

    .line 192
    :try_start_bf
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_da

    .line 197
    .line 198
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    const-wide/16 v6, 0x0

    .line 203
    .line 204
    cmp-long p1, v4, v6

    .line 205
    .line 206
    if-nez p1, :cond_d6

    .line 207
    .line 208
    invoke-direct {p0, v3, v13, v1}, Lcom/voxdon/xplorer/file/o;->d(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :catch_d3
    move-exception v0

    .line 213
    :goto_d4
    move-object p1, v0

    .line 214
    goto :goto_f2

    .line 215
    :cond_d6
    invoke-direct {p0, v3, v13, v1}, Lcom/voxdon/xplorer/file/o;->l(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_da
    new-instance p1, Lax/b3/t;

    .line 220
    .line 221
    const-string v0, "tmp file not exists"

    .line 222
    .line 223
    invoke-direct {p1, v0}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1
    :try_end_e2
    .catch Lax/b3/a; {:try_start_bf .. :try_end_e2} :catch_d3

    .line 227
    :catch_e2
    move-exception v0

    .line 228
    :goto_e3
    move-object p1, v0

    .line 229
    goto :goto_8c

    .line 230
    :cond_e5
    return-void

    .line 231
    :catch_e6
    move-exception v0

    .line 232
    move-object v3, v1

    .line 233
    goto :goto_e3

    .line 234
    :catch_e9
    move-exception v0

    .line 235
    move-object/from16 v3, p2

    .line 236
    .line 237
    move-object v2, v12

    .line 238
    goto :goto_e3

    .line 239
    :catch_ee
    move-exception v0

    .line 240
    move-object/from16 v3, p2

    .line 241
    .line 242
    goto :goto_d4

    .line 243
    :goto_f2
    if-eqz v1, :cond_f7

    .line 244
    .line 245
    :try_start_f4
    invoke-virtual {v3, v1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_f7
    .catch Lax/b3/j; {:try_start_f4 .. :try_end_f7} :catch_f7

    .line 246
    .line 247
    .line 248
    :catch_f7
    :cond_f7
    throw p1
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
.end method

.method public u()Lcom/voxdon/xplorer/file/m;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public u0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lax/Q2/f;->E0(Lax/Q2/f;Lcom/voxdon/xplorer/file/n;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method public v()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public v0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1e

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->o0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v0, :cond_12

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_21

    .line 19
    :cond_12
    invoke-static/range {p0 .. p1}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_16
    .catch Lax/b3/a; {:try_start_1 .. :try_end_16} :catch_1c
    .catch Lax/b3/j; {:try_start_1 .. :try_end_16} :catch_1a

    .line 23
    move-object v2, v1

    .line 24
    const/4 v0, 0x1

    .line 25
    :goto_18
    const/4 v3, 0x0

    .line 26
    goto :goto_21

    .line 27
    :catch_1a
    move-exception v0

    .line 28
    goto :goto_5b

    .line 29
    :catch_1c
    move-exception v0

    .line 30
    goto :goto_5b

    .line 31
    :cond_1e
    move-object v2, p1

    .line 32
    const/4 v0, 0x0

    .line 33
    goto :goto_18

    .line 34
    :goto_21
    if-eqz v3, :cond_2c

    .line 35
    .line 36
    :try_start_23
    invoke-virtual/range {p0 .. p10}, Lcom/voxdon/xplorer/file/o;->s0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_27
    move-exception v0

    .line 41
    :goto_28
    move-object v1, v2

    .line 42
    goto :goto_5b

    .line 43
    :catch_2a
    move-exception v0

    .line 44
    goto :goto_28

    .line 45
    :cond_2c
    move-object v1, p0

    .line 46
    move-object v3, p2

    .line 47
    move-object v4, p3

    .line 48
    move-wide/from16 v5, p4

    .line 49
    .line 50
    move-object/from16 v7, p6

    .line 51
    .line 52
    move-object/from16 v8, p7

    .line 53
    .line 54
    move/from16 v9, p8

    .line 55
    .line 56
    move-object/from16 v10, p9

    .line 57
    .line 58
    move-object/from16 v11, p10

    .line 59
    .line 60
    invoke-virtual/range {v1 .. v11}, Lcom/voxdon/xplorer/file/o;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 61
    .line 62
    .line 63
    if-eqz v0, :cond_5a

    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 70
    .line 71
    .line 72
    move-result-object v1
    :try_end_48
    .catch Lax/b3/a; {:try_start_23 .. :try_end_48} :catch_2a
    .catch Lax/b3/j; {:try_start_23 .. :try_end_48} :catch_27

    .line 73
    :try_start_48
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_52

    .line 78
    .line 79
    invoke-direct {p0, p0, p1, v1}, Lcom/voxdon/xplorer/file/o;->l(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_52
    new-instance v0, Lax/b3/t;

    .line 84
    .line 85
    const-string v2, "tmp file not exists"

    .line 86
    .line 87
    invoke-direct {v0, v2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
    :try_end_5a
    .catch Lax/b3/a; {:try_start_48 .. :try_end_5a} :catch_1c
    .catch Lax/b3/j; {:try_start_48 .. :try_end_5a} :catch_1a

    .line 91
    :cond_5a
    return-void

    .line 92
    :goto_5b
    if-eqz v1, :cond_60

    .line 93
    .line 94
    :try_start_5d
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_60
    .catch Lax/b3/j; {:try_start_5d .. :try_end_60} :catch_60

    .line 95
    .line 96
    .line 97
    :catch_60
    :cond_60
    throw v0
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method public w()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public x(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/m;->s(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public y()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/o;->a:Lcom/voxdon/xplorer/file/m;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "GFI!!!"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ":"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lax/b3/j;

    .line 68
    .line 69
    const-string v0, "Not normalzied path in getFileInfo param"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
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
