.class public Lcom/voxdon/xplorer/file/O;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/O$c;,
        Lcom/voxdon/xplorer/file/O$a;,
        Lcom/voxdon/xplorer/file/O$b;,
        Lcom/voxdon/xplorer/file/O$d;
    }
.end annotation


# static fields
.field private static final i:Ljava/util/logging/Logger;


# instance fields
.field a:Lcom/voxdon/xplorer/file/Q;

.field b:Lax/i9/c;

.field c:Lax/r9/b;

.field d:Ljava/lang/String;

.field e:Z

.field f:Z

.field g:Z

.field h:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.Smb2Client"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

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

.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/O;->h:Lj$/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 12
    .line 13
    return-void
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

.method private A(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/s9/c;

    .line 9
    .line 10
    iget-object v1, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Lax/J8/a;->z0:Lax/J8/a;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v4, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 19
    .line 20
    sget-object v5, Lax/Q8/d;->d0:Lax/Q8/d;

    .line 21
    .line 22
    sget-object p1, Lax/Q8/e;->e0:Lax/Q8/e;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual/range {v0 .. v6}, Lax/s9/c;->e1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private B(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/b;
    .registers 10

    .line 1
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/s9/c;

    .line 9
    .line 10
    iget-object v1, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Lax/J8/a;->m0:Lax/J8/a;

    .line 13
    .line 14
    sget-object p2, Lax/J8/a;->o0:Lax/J8/a;

    .line 15
    .line 16
    sget-object v2, Lax/J8/a;->l0:Lax/J8/a;

    .line 17
    .line 18
    sget-object v3, Lax/J8/a;->n0:Lax/J8/a;

    .line 19
    .line 20
    invoke-static {p1, p2, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v4, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 25
    .line 26
    sget-object v5, Lax/Q8/d;->d0:Lax/Q8/d;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual/range {v0 .. v6}, Lax/s9/c;->c1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private C(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;
    .registers 10

    .line 1
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/s9/c;

    .line 9
    .line 10
    iget-object v1, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Lax/J8/a;->y0:Lax/J8/a;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v4, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 19
    .line 20
    sget-object v5, Lax/Q8/d;->e0:Lax/Q8/d;

    .line 21
    .line 22
    sget-object p1, Lax/Q8/e;->e0:Lax/Q8/e;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual/range {v0 .. v6}, Lax/s9/c;->e1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/file/O;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic b(Lcom/voxdon/xplorer/file/O;)Lax/r9/b;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/k9/d;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method static synthetic c(Lcom/voxdon/xplorer/file/O;Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/O;->A(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static d(Lax/i9/c;ZLjava/lang/String;ILax/j9/b;)Lax/r9/b;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/k9/d;,
            Ljava/io/IOException;,
            Lax/b3/L;
        }
    .end annotation

    .line 1
    invoke-static {p0, p2, p3}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_4
    invoke-virtual {p0, p4}, Lax/l9/a;->v(Lax/j9/b;)Lax/r9/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_8
    .catch Lax/Q8/F; {:try_start_4 .. :try_end_8} :catch_49
    .catch Lax/T8/b; {:try_start_4 .. :try_end_8} :catch_42

    .line 9
    invoke-virtual {p4}, Lax/j9/b;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0}, Lax/l9/a;->o0()Lax/l9/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Lax/r9/b;->v()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_41

    .line 22
    .line 23
    const-string p3, "GUEST"

    .line 24
    .line 25
    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-nez p3, :cond_41

    .line 30
    .line 31
    const-string p3, "SMB2GUESTTESTACCOUNT"

    .line 32
    .line 33
    invoke-virtual {p3, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_41

    .line 38
    .line 39
    if-eqz p0, :cond_41

    .line 40
    .line 41
    invoke-virtual {p0}, Lax/l9/b;->l()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2f

    .line 46
    .line 47
    goto :goto_41

    .line 48
    :cond_2f
    invoke-virtual {p1}, Lax/r9/b;->close()V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

    .line 52
    .line 53
    const-string p1, "Bad user mapped to guest!"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lax/k9/d;

    .line 59
    .line 60
    const-string p1, "Bad user mapped to guest!!"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Lax/k9/d;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_41
    :goto_41
    return-object p1

    .line 67
    :catch_42
    move-exception p0

    .line 68
    new-instance p1, Lax/k9/d;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lax/k9/d;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :catch_49
    move-exception p0

    .line 75
    if-eqz p1, :cond_5a

    .line 76
    .line 77
    invoke-virtual {p0}, Lax/Q8/F;->a()Lax/K8/a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, Lax/K8/a;->p0:Lax/K8/a;

    .line 82
    .line 83
    if-ne p1, p2, :cond_5a

    .line 84
    .line 85
    new-instance p1, Lax/b3/L;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Lax/b3/L;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_5a
    throw p0
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
.end method

.method private e(Lcom/voxdon/xplorer/file/P;)Z
    .registers 12

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/voxdon/xplorer/file/P;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p1, Lcom/voxdon/xplorer/file/P;->f:I

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lax/i9/c;->e(Ljava/lang/String;I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_8f

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v4, p1, Lcom/voxdon/xplorer/file/P;->e:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, ":"

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v4, p1, Lcom/voxdon/xplorer/file/P;->f:I

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v4, p0, Lcom/voxdon/xplorer/file/O;->h:Lj$/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-virtual {v4, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Long;

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v4, :cond_41

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    sub-long v6, v2, v6

    .line 58
    .line 59
    const-wide/16 v8, 0x5dc

    .line 60
    .line 61
    cmp-long v4, v6, v8

    .line 62
    .line 63
    if-gez v4, :cond_41

    .line 64
    .line 65
    return v5

    .line 66
    :cond_41
    const/4 v4, 0x0

    .line 67
    :try_start_42
    iget-object v6, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 68
    .line 69
    iget-object v7, p1, Lcom/voxdon/xplorer/file/P;->e:Ljava/lang/String;

    .line 70
    .line 71
    iget p1, p1, Lcom/voxdon/xplorer/file/P;->f:I

    .line 72
    .line 73
    invoke-static {v6, v7, p1}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance p1, Lax/R8/f;

    .line 78
    .line 79
    invoke-virtual {v4}, Lax/l9/a;->s0()Lax/l9/c;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Lax/l9/c;->a()Lax/Q8/g;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-direct {p1, v6}, Lax/R8/f;-><init>(Lax/Q8/g;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p1}, Lax/l9/a;->L0(Lax/Q8/q;)Ljava/util/concurrent/Future;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 95
    .line 96
    sget-object v7, Lax/c9/e;->q:Lax/a9/c;

    .line 97
    .line 98
    const-wide/16 v8, 0xfa0

    .line 99
    .line 100
    invoke-static {p1, v8, v9, v6, v7}, Lax/a9/d;->a(Ljava/util/concurrent/Future;JLjava/util/concurrent/TimeUnit;Lax/a9/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lax/R8/f;

    .line 105
    .line 106
    invoke-virtual {v4, v1}, Lax/l9/a;->F(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Lax/l9/a;->G0()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_7e

    .line 114
    .line 115
    iget-object p1, p0, Lcom/voxdon/xplorer/file/O;->h:Lj$/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {p1, v0, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_7e

    .line 125
    :catch_7c
    nop

    .line 126
    goto :goto_83

    .line 127
    :cond_7e
    :goto_7e
    invoke-virtual {v4}, Lax/l9/a;->G0()Z

    .line 128
    .line 129
    .line 130
    move-result p1
    :try_end_82
    .catch Ljava/io/IOException; {:try_start_42 .. :try_end_82} :catch_7c
    .catch Lax/k9/d; {:try_start_42 .. :try_end_82} :catch_7c

    .line 131
    return p1

    .line 132
    :goto_83
    if-eqz v4, :cond_88

    .line 133
    .line 134
    :try_start_85
    invoke-virtual {v4, v5}, Lax/l9/a;->F(Z)V
    :try_end_88
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_88} :catch_88

    .line 135
    .line 136
    .line 137
    :catch_88
    :cond_88
    sget-object p1, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

    .line 138
    .line 139
    const-string v0, "SMB2 connection check failed"

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    return v1
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
.end method

.method public static f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/k9/d;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-lez p2, :cond_7

    .line 2
    .line 3
    :try_start_2
    invoke-virtual {p0, p1, p2}, Lax/i9/c;->b(Ljava/lang/String;I)Lax/l9/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_7
    invoke-virtual {p0, p1}, Lax/i9/c;->a(Ljava/lang/String;)Lax/l9/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_b
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_b} :catch_c

    .line 12
    return-object p0

    .line 13
    :catch_c
    move-exception p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/io/IOException;

    .line 18
    .line 19
    const-string p2, "SMB connect"

    .line 20
    .line 21
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1
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

.method public static g(Ljava/lang/Exception;)Lax/b3/j;
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    instance-of v3, p0, Lax/Q8/F;

    .line 5
    .line 6
    if-eqz v3, :cond_b

    .line 7
    .line 8
    move-object v3, p0

    .line 9
    check-cast v3, Lax/Q8/F;

    .line 10
    .line 11
    goto :goto_1f

    .line 12
    :cond_b
    instance-of v3, p0, Ljava/io/IOException;

    .line 13
    .line 14
    if-eqz v3, :cond_1e

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    instance-of v3, v3, Lax/Q8/F;

    .line 21
    .line 22
    if-eqz v3, :cond_1e

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lax/Q8/F;

    .line 29
    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v3, 0x0

    .line 32
    :goto_1f
    if-eqz v3, :cond_ba

    .line 33
    .line 34
    invoke-virtual {v3}, Lax/Q8/F;->a()Lax/K8/a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Lcom/voxdon/xplorer/file/O;->u(Lax/K8/a;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_31

    .line 43
    .line 44
    new-instance v0, Lax/b3/t;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_31
    invoke-static {v3}, Lcom/voxdon/xplorer/file/O;->t(Lax/K8/a;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_3d

    .line 55
    .line 56
    new-instance v0, Lax/b3/e;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3d
    sget-object v4, Lax/K8/a;->H0:Lax/K8/a;

    .line 63
    .line 64
    if-ne v3, v4, :cond_47

    .line 65
    .line 66
    new-instance v0, Lax/b3/s;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lax/b3/s;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_47
    sget-object v4, Lax/K8/a;->U0:Lax/K8/a;

    .line 73
    .line 74
    if-ne v3, v4, :cond_51

    .line 75
    .line 76
    new-instance v0, Lax/b3/m;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Lax/b3/m;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_51
    sget-object v4, Lax/K8/a;->R0:Lax/K8/a;

    .line 83
    .line 84
    if-ne v3, v4, :cond_5b

    .line 85
    .line 86
    new-instance v0, Lax/b3/e;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_5b
    sget-object v4, Lax/K8/a;->y0:Lax/K8/a;

    .line 93
    .line 94
    const-string v5, "%s (0x%08x)"

    .line 95
    .line 96
    if-ne v3, v4, :cond_7d

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v3}, Lax/K8/a;->getValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-array v2, v2, [Ljava/lang/Object;

    .line 111
    .line 112
    aput-object v4, v2, v1

    .line 113
    .line 114
    aput-object v3, v2, v0

    .line 115
    .line 116
    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Lax/b3/z;

    .line 121
    .line 122
    invoke-direct {v1, v0, p0}, Lax/b3/z;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_7d
    if-eqz v3, :cond_ba

    .line 127
    .line 128
    sget-object v4, Lax/K8/a;->y1:Lax/K8/a;

    .line 129
    .line 130
    if-eq v3, v4, :cond_9f

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v3}, Lax/K8/a;->getValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    new-array v2, v2, [Ljava/lang/Object;

    .line 145
    .line 146
    aput-object v4, v2, v1

    .line 147
    .line 148
    aput-object v3, v2, v0

    .line 149
    .line 150
    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v1, Lax/b3/i;

    .line 155
    .line 156
    invoke-direct {v1, v0, p0}, Lax/b3/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_9f
    new-instance v0, Lax/b3/j;

    .line 161
    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v2, "NtStatus : "

    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lax/K8/a;->getValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-direct {v0, v1, p0}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :cond_ba
    instance-of v0, p0, Ljava/net/ConnectException;

    .line 188
    .line 189
    if-eqz v0, :cond_c4

    .line 190
    .line 191
    new-instance v0, Lax/b3/q;

    .line 192
    .line 193
    invoke-direct {v0, p0}, Lax/b3/q;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :cond_c4
    new-instance v0, Lax/b3/j;

    .line 198
    .line 199
    invoke-direct {v0, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    return-object v0
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

.method public static j(Ljava/lang/String;ZZ)Lax/i9/c;
    .registers 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {}, Lax/i9/d;->z()Lax/i9/d$b;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2, p1}, Lax/i9/d$b;->k(Z)Lax/i9/d$b;

    .line 8
    .line 9
    .line 10
    const-string p1, "SMB3"

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz p1, :cond_28

    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    new-array p0, p0, [Lax/Q8/g;

    .line 21
    .line 22
    sget-object p1, Lax/Q8/g;->i0:Lax/Q8/g;

    .line 23
    .line 24
    aput-object p1, p0, v1

    .line 25
    .line 26
    sget-object p1, Lax/Q8/g;->h0:Lax/Q8/g;

    .line 27
    .line 28
    aput-object p1, p0, v3

    .line 29
    .line 30
    sget-object p1, Lax/Q8/g;->g0:Lax/Q8/g;

    .line 31
    .line 32
    aput-object p1, p0, v0

    .line 33
    .line 34
    invoke-virtual {v2, p0}, Lax/i9/d$b;->i([Lax/Q8/g;)Lax/i9/d$b;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lax/i9/d$b;->j(Z)Lax/i9/d$b;

    .line 38
    .line 39
    .line 40
    goto :goto_41

    .line 41
    :cond_28
    const-string p1, "SMB2"

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_3e

    .line 48
    .line 49
    new-array p0, v0, [Lax/Q8/g;

    .line 50
    .line 51
    sget-object p1, Lax/Q8/g;->e0:Lax/Q8/g;

    .line 52
    .line 53
    aput-object p1, p0, v1

    .line 54
    .line 55
    sget-object p1, Lax/Q8/g;->d0:Lax/Q8/g;

    .line 56
    .line 57
    aput-object p1, p0, v3

    .line 58
    .line 59
    invoke-virtual {v2, p0}, Lax/i9/d$b;->i([Lax/Q8/g;)Lax/i9/d$b;

    .line 60
    .line 61
    .line 62
    goto :goto_41

    .line 63
    :cond_3e
    invoke-virtual {v2, v3}, Lax/i9/d$b;->j(Z)Lax/i9/d$b;

    .line 64
    .line 65
    .line 66
    :goto_41
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 67
    .line 68
    const-wide/32 v0, 0x88b8

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0, v1, p0}, Lax/i9/d$b;->r(JLjava/util/concurrent/TimeUnit;)Lax/i9/d$b;

    .line 72
    .line 73
    .line 74
    const-wide/16 v0, 0x30d4

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1, p0}, Lax/i9/d$b;->v(JLjava/util/concurrent/TimeUnit;)Lax/i9/d$b;

    .line 77
    .line 78
    .line 79
    const-wide/16 v0, 0x3a98

    .line 80
    .line 81
    invoke-virtual {v2, v0, v1, p0}, Lax/i9/d$b;->n(JLjava/util/concurrent/TimeUnit;)Lax/i9/d$b;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0, v1, p0}, Lax/i9/d$b;->y(JLjava/util/concurrent/TimeUnit;)Lax/i9/d$b;

    .line 85
    .line 86
    .line 87
    const-wide/16 v0, 0xdac

    .line 88
    .line 89
    invoke-virtual {v2, v0, v1, p0}, Lax/i9/d$b;->f(JLjava/util/concurrent/TimeUnit;)Lax/i9/d$b;

    .line 90
    .line 91
    .line 92
    const/high16 p0, 0x40000

    .line 93
    .line 94
    invoke-virtual {v2, p0}, Lax/i9/d$b;->m(I)Lax/i9/d$b;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p0}, Lax/i9/d$b;->x(I)Lax/i9/d$b;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lax/i9/d$b;->l()Lax/T8/a$b;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0, p2}, Lax/T8/a$b;->b(Z)Lax/T8/a$b;

    .line 105
    .line 106
    .line 107
    new-instance p0, Lax/i9/c;

    .line 108
    .line 109
    invoke-virtual {v2}, Lax/i9/d$b;->a()Lax/i9/d;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {p0, p1}, Lax/i9/c;-><init>(Lax/i9/d;)V

    .line 114
    .line 115
    .line 116
    return-object p0
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
.end method

.method private static m(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    const/16 v1, 0x5c

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/j9/b;
    .registers 4

    .line 1
    new-instance v0, Lax/j9/b;

    .line 2
    .line 3
    if-nez p2, :cond_8

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    new-array p2, p2, [C

    .line 7
    .line 8
    goto :goto_c

    .line 9
    :cond_8
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :goto_c
    invoke-direct {v0, p1, p2, p0}, Lax/j9/b;-><init>(Ljava/lang/String;[CLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method private declared-synchronized r()Lax/r9/b;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/k9/d;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/Q;->x0()Lcom/voxdon/xplorer/file/P;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v1, p0, Lcom/voxdon/xplorer/file/O;->g:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_19

    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 14
    .line 15
    if-eqz v1, :cond_19

    .line 16
    .line 17
    invoke-virtual {v1}, Lax/i9/c;->close()V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 21
    .line 22
    goto :goto_19

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    goto/16 :goto_92

    .line 25
    .line 26
    :cond_19
    :goto_19
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 27
    .line 28
    if-nez v1, :cond_2c

    .line 29
    .line 30
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->d:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v3, p0, Lcom/voxdon/xplorer/file/O;->e:Z

    .line 33
    .line 34
    iget-boolean v4, p0, Lcom/voxdon/xplorer/file/O;->f:Z

    .line 35
    .line 36
    invoke-static {v1, v3, v4}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    iput-boolean v1, p0, Lcom/voxdon/xplorer/file/O;->g:Z

    .line 44
    .line 45
    :cond_2c
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/O;->e(Lcom/voxdon/xplorer/file/P;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_34

    .line 50
    .line 51
    iput-object v2, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 52
    .line 53
    :cond_34
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 54
    .line 55
    if-eqz v1, :cond_54

    .line 56
    .line 57
    invoke-virtual {v1}, Lax/r9/b;->u()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_54

    .line 62
    .line 63
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 64
    .line 65
    invoke-virtual {v1}, Lax/r9/b;->isClosed()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_54

    .line 70
    .line 71
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 72
    .line 73
    invoke-virtual {v1}, Lax/r9/b;->g()Lax/j9/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, v0, Lcom/voxdon/xplorer/file/P;->b:Lax/j9/b;

    .line 78
    .line 79
    invoke-direct {p0, v1, v2}, Lcom/voxdon/xplorer/file/O;->v(Lax/j9/b;Lax/j9/b;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_73

    .line 84
    .line 85
    :cond_54
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 86
    .line 87
    if-eqz v1, :cond_63

    .line 88
    .line 89
    invoke-virtual {v1}, Lax/r9/b;->isClosed()Z

    .line 90
    .line 91
    .line 92
    move-result v1
    :try_end_5c
    .catchall {:try_start_1 .. :try_end_5c} :catchall_16

    .line 93
    if-nez v1, :cond_63

    .line 94
    .line 95
    :try_start_5e
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 96
    .line 97
    invoke-virtual {v1}, Lax/r9/b;->close()V
    :try_end_63
    .catch Ljava/io/IOException; {:try_start_5e .. :try_end_63} :catch_63
    .catch Lax/k9/d; {:try_start_5e .. :try_end_63} :catch_63
    .catchall {:try_start_5e .. :try_end_63} :catchall_16

    .line 98
    .line 99
    .line 100
    :catch_63
    :cond_63
    :try_start_63
    iget-object v1, p0, Lcom/voxdon/xplorer/file/O;->b:Lax/i9/c;

    .line 101
    .line 102
    iget-boolean v2, v0, Lcom/voxdon/xplorer/file/P;->i:Z

    .line 103
    .line 104
    iget-object v3, v0, Lcom/voxdon/xplorer/file/P;->e:Ljava/lang/String;

    .line 105
    .line 106
    iget v4, v0, Lcom/voxdon/xplorer/file/P;->f:I

    .line 107
    .line 108
    iget-object v0, v0, Lcom/voxdon/xplorer/file/P;->b:Lax/j9/b;

    .line 109
    .line 110
    invoke-static {v1, v2, v3, v4, v0}, Lcom/voxdon/xplorer/file/O;->d(Lax/i9/c;ZLjava/lang/String;ILax/j9/b;)Lax/r9/b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;
    :try_end_73
    .catch Lax/b3/L; {:try_start_63 .. :try_end_73} :catch_77
    .catchall {:try_start_63 .. :try_end_73} :catchall_16

    .line 115
    .line 116
    :cond_73
    :try_start_73
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;
    :try_end_75
    .catchall {:try_start_73 .. :try_end_75} :catchall_16

    .line 117
    .line 118
    monitor-exit p0

    .line 119
    return-object v0

    .line 120
    :catch_77
    move-exception v0

    .line 121
    :try_start_78
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    instance-of v1, v1, Lax/k9/d;

    .line 126
    .line 127
    if-eqz v1, :cond_87

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lax/k9/d;

    .line 134
    .line 135
    throw v0

    .line 136
    :cond_87
    invoke-static {}, Lax/u3/b;->f()V

    .line 137
    .line 138
    .line 139
    new-instance v0, Lax/k9/d;

    .line 140
    .line 141
    const-string v1, "not reachable"

    .line 142
    .line 143
    invoke-direct {v0, v1}, Lax/k9/d;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :goto_92
    monitor-exit p0
    :try_end_93
    .catchall {:try_start_78 .. :try_end_93} :catchall_16

    .line 148
    throw v0
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

.method private static t(Lax/K8/a;)Z
    .registers 2

    .line 1
    sget-object v0, Lax/K8/a;->s0:Lax/K8/a;

    .line 2
    .line 3
    if-eq p0, v0, :cond_b

    .line 4
    .line 5
    sget-object v0, Lax/K8/a;->D0:Lax/K8/a;

    .line 6
    .line 7
    if-ne p0, v0, :cond_9

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_b
    :goto_b
    const/4 p0, 0x1

    .line 13
    return p0
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

.method private static u(Lax/K8/a;)Z
    .registers 2

    .line 1
    sget-object v0, Lax/K8/a;->o0:Lax/K8/a;

    .line 2
    .line 3
    if-eq p0, v0, :cond_13

    .line 4
    .line 5
    sget-object v0, Lax/K8/a;->u0:Lax/K8/a;

    .line 6
    .line 7
    if-eq p0, v0, :cond_13

    .line 8
    .line 9
    sget-object v0, Lax/K8/a;->v0:Lax/K8/a;

    .line 10
    .line 11
    if-eq p0, v0, :cond_13

    .line 12
    .line 13
    sget-object v0, Lax/K8/a;->x0:Lax/K8/a;

    .line 14
    .line 15
    if-ne p0, v0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_13
    :goto_13
    const/4 p0, 0x1

    .line 21
    return p0
    .line 22
.end method

.method private v(Lax/j9/b;Lax/j9/b;)Z
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p2, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_38

    .line 7
    .line 8
    if-nez p2, :cond_a

    .line 9
    .line 10
    goto :goto_38

    .line 11
    :cond_a
    invoke-virtual {p1}, Lax/j9/b;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Lax/j9/b;->c()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v2, v3}, Lax/u3/B;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    invoke-virtual {p1}, Lax/j9/b;->b()[C

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p2}, Lax/j9/b;->b()[C

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v2, v3}, Lax/u3/B;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_28

    .line 39
    .line 40
    return v1

    .line 41
    :cond_28
    invoke-virtual {p1}, Lax/j9/b;->a()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2}, Lax/j9/b;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p1, p2}, Lax/u3/B;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_37

    .line 54
    .line 55
    return v1

    .line 56
    :cond_37
    return v0

    .line 57
    :cond_38
    :goto_38
    return v1
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

.method private y(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;
    .registers 10

    .line 1
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Lax/s9/c;

    .line 9
    .line 10
    iget-object v1, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Lax/J8/a;->y0:Lax/J8/a;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v4, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 19
    .line 20
    sget-object v5, Lax/Q8/d;->h0:Lax/Q8/d;

    .line 21
    .line 22
    sget-object p1, Lax/Q8/e;->e0:Lax/Q8/e;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual/range {v0 .. v6}, Lax/s9/c;->e1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private z(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;I)Lax/s9/d;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p3

    .line 4
    const-string v1, "Not supported mode :"

    .line 5
    .line 6
    if-eqz v0, :cond_f

    .line 7
    .line 8
    sget-object v0, Lax/J8/a;->y0:Lax/J8/a;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_d
    move-object v4, v0

    .line 15
    goto :goto_29

    .line 16
    :cond_f
    const/high16 v0, 0x10000000

    .line 17
    .line 18
    and-int/2addr v0, p3

    .line 19
    if-eqz v0, :cond_1b

    .line 20
    .line 21
    sget-object v0, Lax/J8/a;->z0:Lax/J8/a;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_d

    .line 28
    :cond_1b
    const/high16 v0, 0x30000000

    .line 29
    .line 30
    and-int/2addr v0, p3

    .line 31
    if-eqz v0, :cond_68

    .line 32
    .line 33
    sget-object v0, Lax/J8/a;->z0:Lax/J8/a;

    .line 34
    .line 35
    sget-object v2, Lax/J8/a;->y0:Lax/J8/a;

    .line 36
    .line 37
    invoke-static {v0, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_d

    .line 42
    :goto_29
    const/high16 v0, 0x4000000

    .line 43
    .line 44
    and-int/2addr v0, p3

    .line 45
    if-eqz v0, :cond_32

    .line 46
    .line 47
    sget-object p3, Lax/Q8/d;->h0:Lax/Q8/d;

    .line 48
    .line 49
    :goto_30
    move-object v7, p3

    .line 50
    goto :goto_3a

    .line 51
    :cond_32
    const/high16 v0, 0x2000000

    .line 52
    .line 53
    and-int/2addr v0, p3

    .line 54
    if-nez v0, :cond_53

    .line 55
    .line 56
    sget-object p3, Lax/Q8/d;->d0:Lax/Q8/d;

    .line 57
    .line 58
    goto :goto_30

    .line 59
    :goto_3a
    iget-object p3, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, p3}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    move-object v2, p1

    .line 66
    check-cast v2, Lax/s9/c;

    .line 67
    .line 68
    iget-object v3, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 69
    .line 70
    sget-object v6, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 71
    .line 72
    sget-object p1, Lax/Q8/e;->l0:Lax/Q8/e;

    .line 73
    .line 74
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual/range {v2 .. v8}, Lax/s9/c;->e1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_53
    new-instance p1, Lax/b3/t;

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_68
    new-instance p1, Lax/b3/t;

    .line 106
    .line 107
    new-instance p2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1
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
.end method


# virtual methods
.method D(Ljava/lang/String;I)Lax/l3/a;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Open SMB2 proxy file : "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :try_start_16
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/O$c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v1, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v1, :cond_32

    .line 34
    .line 35
    new-instance v1, Lcom/voxdon/xplorer/file/O$d;

    .line 36
    .line 37
    invoke-direct {p0, v0, p1, p2}, Lcom/voxdon/xplorer/file/O;->z(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;I)Lax/s9/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v1, p1}, Lcom/voxdon/xplorer/file/O$d;-><init>(Lax/s9/d;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :catch_2c
    move-exception p1

    .line 46
    goto :goto_3a

    .line 47
    :catch_2e
    move-exception p1

    .line 48
    goto :goto_3a

    .line 49
    :catch_30
    move-exception p1

    .line 50
    goto :goto_44

    .line 51
    :cond_32
    new-instance p1, Lax/b3/j;

    .line 52
    .line 53
    const-string p2, "SMB Share cannot be target"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
    :try_end_3a
    .catch Lax/Q8/F; {:try_start_16 .. :try_end_3a} :catch_30
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_3a} :catch_2e
    .catch Lax/k9/d; {:try_start_16 .. :try_end_3a} :catch_2c

    .line 59
    :goto_3a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
    const-string p2, "smb2 getoutputstream"

    .line 63
    .line 64
    invoke-static {p2, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    throw p1

    .line 69
    :goto_44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    throw p1
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

.method public E(Lcom/voxdon/xplorer/file/n;J)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v2, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v2, :cond_32

    .line 13
    .line 14
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/O;->B(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lax/N8/e;

    .line 19
    .line 20
    sget-object v3, Lax/N8/e;->f:Lax/J8/b;

    .line 21
    .line 22
    invoke-static {p2, p3}, Lax/J8/b;->d(J)Lax/J8/b;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    move-object v4, v3

    .line 29
    move-object v6, v3

    .line 30
    invoke-direct/range {v2 .. v8}, Lax/N8/e;-><init>(Lax/J8/b;Lax/J8/b;Lax/J8/b;Lax/J8/b;J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lax/s9/b;->o0(Lax/N8/x;)V
    :try_end_23
    .catch Lax/Q8/F; {:try_start_1 .. :try_end_23} :catch_2f
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_23} :catch_2d
    .catch Lax/k9/d; {:try_start_1 .. :try_end_23} :catch_2a
    .catchall {:try_start_1 .. :try_end_23} :catchall_27

    .line 34
    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v1}, Lax/s9/g;->close()V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_26} :catch_26

    .line 37
    .line 38
    .line 39
    :catch_26
    return-void

    .line 40
    :catchall_27
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    goto :goto_4c

    .line 43
    :catch_2a
    move-exception v0

    .line 44
    :goto_2b
    move-object p1, v0

    .line 45
    goto :goto_3a

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    goto :goto_2b

    .line 48
    :catch_2f
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    goto :goto_44

    .line 51
    :cond_32
    :try_start_32
    new-instance p1, Lax/b3/j;

    .line 52
    .line 53
    const-string p2, "SMB Share cannot be target"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
    :try_end_3a
    .catch Lax/Q8/F; {:try_start_32 .. :try_end_3a} :catch_2f
    .catch Ljava/io/IOException; {:try_start_32 .. :try_end_3a} :catch_2d
    .catch Lax/k9/d; {:try_start_32 .. :try_end_3a} :catch_2a
    .catchall {:try_start_32 .. :try_end_3a} :catchall_27

    .line 59
    :goto_3a
    :try_start_3a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
    const-string p2, "smb2 setLastModified"

    .line 63
    .line 64
    invoke-static {p2, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    throw p1

    .line 69
    :goto_44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    throw p1
    :try_end_4c
    .catchall {:try_start_3a .. :try_end_4c} :catchall_27

    .line 77
    :goto_4c
    if-eqz v1, :cond_51

    .line 78
    .line 79
    :try_start_4e
    invoke-virtual {v1}, Lax/s9/g;->close()V
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_51} :catch_51

    .line 80
    .line 81
    .line 82
    :catch_51
    :cond_51
    throw p1
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

.method public F(Ljava/lang/String;ZZ)V
    .registers 4

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/O;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/voxdon/xplorer/file/O;->e:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/voxdon/xplorer/file/O;->f:Z

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

.method public h(Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/O$c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v2, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    invoke-direct {p0, v1, p1}, Lcom/voxdon/xplorer/file/O;->C(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lax/s9/g;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_19} :catch_1b
    .catch Lax/k9/d; {:try_start_1 .. :try_end_19} :catch_1b

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :catch_1b
    return v0
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
.end method

.method public i(Lcom/voxdon/xplorer/file/n;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/O$c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v2, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    iget-object v2, p1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lax/s9/c;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lax/s9/c;->b1(Ljava/lang/String;)V
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1f} :catch_23
    .catch Lax/k9/d; {:try_start_1 .. :try_end_1f} :catch_21

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :catch_21
    move-exception p1

    .line 35
    goto :goto_24

    .line 36
    :catch_23
    move-exception p1

    .line 37
    :goto_24
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    return v0
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

.method public k(Lcom/voxdon/xplorer/file/n;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v2, :cond_2d

    .line 12
    .line 13
    iget-object v2, v1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lax/s9/c;

    .line 20
    .line 21
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_27

    .line 26
    .line 27
    iget-object p1, v1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, p1, v1}, Lax/s9/c;->i1(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_21
    move-exception p1

    .line 35
    goto :goto_35

    .line 36
    :catch_23
    move-exception p1

    .line 37
    goto :goto_35

    .line 38
    :catch_25
    move-exception p1

    .line 39
    goto :goto_3b

    .line 40
    :cond_27
    iget-object p1, v1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lax/s9/c;->h1(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/b3/j;

    .line 47
    .line 48
    const-string v0, "SMB Share cannot be deleted"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_35
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_35} :catch_25
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_35} :catch_23
    .catch Lax/k9/d; {:try_start_0 .. :try_end_35} :catch_21

    .line 54
    :goto_35
    new-instance v0, Lax/b3/j;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :goto_3b
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    throw p1
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
.end method

.method l()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/r9/b;->isClosed()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_f

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->c:Lax/r9/b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/r9/b;->f()V

    .line 14
    .line 15
    .line 16
    :cond_f
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/O;->g:Z

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/S;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_19

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/S;->g0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;)Lcom/voxdon/xplorer/file/S;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :catch_f
    move-exception v0

    .line 17
    goto :goto_5a

    .line 18
    :catch_11
    move-exception p1

    .line 19
    goto :goto_87

    .line 20
    :catch_13
    move-exception p1

    .line 21
    goto :goto_87

    .line 22
    :catch_15
    move-exception p1

    .line 23
    goto :goto_87

    .line 24
    :catch_17
    move-exception v0

    .line 25
    goto :goto_91

    .line 26
    :cond_19
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->b(Ljava/lang/String;)Lcom/voxdon/xplorer/file/O$c;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v2, v0, Lax/s9/c;

    .line 41
    .line 42
    if-eqz v2, :cond_3b

    .line 43
    .line 44
    check-cast v0, Lax/s9/c;

    .line 45
    .line 46
    iget-object v1, v1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lax/s9/c;->L0(Ljava/lang/String;)Lax/N8/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Lcom/voxdon/xplorer/file/S;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 55
    .line 56
    invoke-direct {v1, v2, p1, v0}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Lax/N8/c;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3b
    new-instance v1, Lax/b3/j;

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "This type of share is not supported : "

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {v1, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v1
    :try_end_5a
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_5a} :catch_17
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5a} :catch_15
    .catch Lax/k9/d; {:try_start_0 .. :try_end_5a} :catch_13
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_5a} :catch_11
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_5a} :catch_f

    .line 91
    :goto_5a
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "SMB INVALID SHARENAME"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v3, "path:"

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v1, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 127
    .line 128
    .line 129
    const-string p1, "smb2 getfileinfo 2"

    .line 130
    .line 131
    invoke-static {p1, v0}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    throw p1

    .line 136
    :goto_87
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    const-string v0, "smb2 getfileinfo"

    .line 140
    .line 141
    invoke-static {v0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    throw p1

    .line 146
    :goto_91
    invoke-virtual {v0}, Lax/Q8/F;->a()Lax/K8/a;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Lcom/voxdon/xplorer/file/O;->u(Lax/K8/a;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_a3

    .line 155
    .line 156
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    invoke-static {v0, p1, v1}, Lcom/voxdon/xplorer/file/S;->f0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Z)Lcom/voxdon/xplorer/file/S;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :cond_a3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    throw p1
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
.end method

.method public p(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    iget-object v0, v4, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_24

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0, v2, v4}, Lcom/voxdon/xplorer/file/O;->A(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-instance v0, Lcom/voxdon/xplorer/file/O$a;

    .line 18
    .line 19
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    move-object v1, p0

    .line 24
    move-wide v5, p2

    .line 25
    invoke-direct/range {v0 .. v8}, Lcom/voxdon/xplorer/file/O$a;-><init>(Lcom/voxdon/xplorer/file/O;Lax/r9/b;Lax/s9/d;Lcom/voxdon/xplorer/file/O$c;JJ)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_1c
    move-exception v0

    .line 30
    :goto_1d
    move-object p1, v0

    .line 31
    goto :goto_49

    .line 32
    :catch_1f
    move-exception v0

    .line 33
    goto :goto_1d

    .line 34
    :catch_21
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    goto :goto_51

    .line 37
    :cond_24
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string p3, "Invalid SMB File Path"

    .line 46
    .line 47
    invoke-virtual {p2, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lax/b3/j;

    .line 67
    .line 68
    const-string p2, "Invalid File Path!!"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_49
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_49} :catch_21
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_49} :catch_1f
    .catch Lax/k9/d; {:try_start_0 .. :try_end_49} :catch_1c

    .line 74
    :goto_49
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    throw p1

    .line 82
    :goto_51
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    throw p1
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

.method public q(Lcom/voxdon/xplorer/file/n;Z)Ljava/io/OutputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_23

    .line 12
    .line 13
    if-eqz p2, :cond_19

    .line 14
    .line 15
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/O;->y(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_1d

    .line 20
    :catch_13
    move-exception p1

    .line 21
    goto :goto_2b

    .line 22
    :catch_15
    move-exception p1

    .line 23
    goto :goto_2b

    .line 24
    :catch_17
    move-exception p1

    .line 25
    goto :goto_35

    .line 26
    :cond_19
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/O;->C(Lax/r9/b;Lcom/voxdon/xplorer/file/O$c;)Lax/s9/d;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_1d
    new-instance p2, Lcom/voxdon/xplorer/file/O$b;

    .line 31
    .line 32
    invoke-direct {p2, v0, p1}, Lcom/voxdon/xplorer/file/O$b;-><init>(Lax/r9/b;Lax/s9/d;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_23
    new-instance p1, Lax/b3/j;

    .line 37
    .line 38
    const-string p2, "SMB Share cannot be target"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
    :try_end_2b
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_2b} :catch_17
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_2b} :catch_15
    .catch Lax/k9/d; {:try_start_0 .. :try_end_2b} :catch_13

    .line 44
    :goto_2b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    const-string p2, "smb2 getoutputstream"

    .line 48
    .line 49
    invoke-static {p2, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    throw p1

    .line 54
    :goto_35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    throw p1
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

.method public s(Lcom/voxdon/xplorer/file/n;)Lax/c3/k0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p1, p1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz p1, :cond_34

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lax/s9/c;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/s9/c;->Y0()Lax/N8/B;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lax/N8/B;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p1}, Lax/N8/B;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    new-instance p1, Lax/c3/k0;

    .line 32
    .line 33
    sub-long v2, v0, v2

    .line 34
    .line 35
    invoke-direct {p1, v0, v1, v2, v3}, Lax/c3/k0;-><init>(JJ)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :catch_26
    move-exception p1

    .line 40
    goto :goto_3a

    .line 41
    :catch_28
    move-exception p1

    .line 42
    goto :goto_3a

    .line 43
    :catch_2a
    move-exception p1

    .line 44
    goto :goto_3a

    .line 45
    :catch_2c
    move-exception p1

    .line 46
    goto :goto_3a

    .line 47
    :catch_2e
    move-exception p1

    .line 48
    goto :goto_3a

    .line 49
    :catch_30
    move-exception p1

    .line 50
    goto :goto_3a

    .line 51
    :catch_32
    move-exception p1

    .line 52
    goto :goto_43

    .line 53
    :cond_34
    new-instance p1, Lax/b3/j;

    .line 54
    .line 55
    invoke-direct {p1}, Lax/b3/j;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1
    :try_end_3a
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_3a} :catch_32
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_3a} :catch_30
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_3a} :catch_2e
    .catch Lax/k9/d; {:try_start_0 .. :try_end_3a} :catch_2c
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_3a} :catch_2a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_3a} :catch_28
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_3a} :catch_26

    .line 59
    :goto_3a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lax/b3/j;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :goto_43
    sget-object v0, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "SMBApiException:"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lax/Q8/F;->a()Lax/K8/a;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    throw p1
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

.method public w(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 9
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
    const-string v0, "/"

    .line 2
    .line 3
    :try_start_2
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_75

    .line 21
    .line 22
    sget-object p1, Lax/za/c;->f0:Lax/za/c;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lax/za/c;->h(Lax/r9/b;)Lax/za/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Lax/ta/a;

    .line 29
    .line 30
    invoke-direct {v1, p1}, Lax/ta/a;-><init>(Lax/za/a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lax/ta/a;->g()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_28
    :goto_28
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_d4

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lax/ua/b;

    .line 52
    .line 53
    invoke-virtual {v1}, Lax/ua/b;->d()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_58

    .line 58
    .line 59
    invoke-virtual {v1}, Lax/ua/b;->d()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/high16 v4, -0x80000000

    .line 64
    .line 65
    if-ne v3, v4, :cond_28

    .line 66
    .line 67
    goto :goto_58

    .line 68
    :catch_43
    move-exception p1

    .line 69
    goto/16 :goto_d5

    .line 70
    .line 71
    :catch_46
    move-exception p1

    .line 72
    goto/16 :goto_d5

    .line 73
    .line 74
    :catch_49
    move-exception p1

    .line 75
    goto/16 :goto_d5

    .line 76
    .line 77
    :catch_4c
    move-exception p1

    .line 78
    goto/16 :goto_d5

    .line 79
    .line 80
    :catch_4f
    move-exception p1

    .line 81
    goto/16 :goto_d5

    .line 82
    .line 83
    :catch_52
    move-exception p1

    .line 84
    goto/16 :goto_d5

    .line 85
    .line 86
    :catch_55
    move-exception p1

    .line 87
    goto/16 :goto_de

    .line 88
    .line 89
    :cond_58
    :goto_58
    iget-object v3, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 90
    .line 91
    new-instance v4, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lax/ua/c;->b()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v3, v1}, Lcom/voxdon/xplorer/file/S;->g0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;)Lcom/voxdon/xplorer/file/S;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_28

    .line 118
    :cond_75
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object v4, p1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v1, v4}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lax/s9/c;

    .line 129
    .line 130
    iget-object p1, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Lax/s9/c;->Z0(Ljava/lang/String;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_8b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_d4

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lax/N8/m;

    .line 151
    .line 152
    invoke-virtual {v1}, Lax/N8/h;->a()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4}, Lax/c3/d0;->C(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_a2

    .line 161
    .line 162
    goto :goto_8b

    .line 163
    :cond_a2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_a9

    .line 168
    .line 169
    goto :goto_8b

    .line 170
    :cond_a9
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_c5

    .line 175
    .line 176
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const-string v5, "INVALID SMB2 FILENAME"

    .line 185
    .line 186
    invoke-virtual {v1, v5}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1, v4}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 195
    .line 196
    .line 197
    goto :goto_8b

    .line 198
    :cond_c5
    invoke-static {v3, v4}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    new-instance v5, Lcom/voxdon/xplorer/file/S;

    .line 203
    .line 204
    iget-object v6, p0, Lcom/voxdon/xplorer/file/O;->a:Lcom/voxdon/xplorer/file/Q;

    .line 205
    .line 206
    invoke-direct {v5, v6, v4, v1}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Lax/N8/m;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_d3
    .catch Lax/Q8/F; {:try_start_2 .. :try_end_d3} :catch_55
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_d3} :catch_52
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_d3} :catch_4f
    .catch Lax/k9/d; {:try_start_2 .. :try_end_d3} :catch_4c
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_d3} :catch_49
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_d3} :catch_46
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_2 .. :try_end_d3} :catch_43

    .line 210
    .line 211
    .line 212
    goto :goto_8b

    .line 213
    :cond_d4
    return-object v2

    .line 214
    :goto_d5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 215
    .line 216
    .line 217
    new-instance v0, Lax/b3/j;

    .line 218
    .line 219
    invoke-direct {v0, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :goto_de
    sget-object v0, Lcom/voxdon/xplorer/file/O;->i:Ljava/util/logging/Logger;

    .line 224
    .line 225
    new-instance v1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string v2, "SMBApiException:"

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Lax/Q8/F;->a()Lax/K8/a;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    throw p1
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

.method public x(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/O;->r()Lax/r9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_66

    .line 12
    .line 13
    iget-object v1, p1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/r9/b;->b(Ljava/lang/String;)Lax/s9/m;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lax/s9/c;

    .line 21
    .line 22
    iget-object v2, p1, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v0, Lax/J8/a;->l0:Lax/J8/a;

    .line 25
    .line 26
    sget-object v3, Lax/J8/a;->p0:Lax/J8/a;

    .line 27
    .line 28
    sget-object v4, Lax/J8/a;->t0:Lax/J8/a;

    .line 29
    .line 30
    invoke-static {v0, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v5, Lax/Q8/u;->f0:Ljava/util/Set;

    .line 35
    .line 36
    sget-object v6, Lax/Q8/d;->d0:Lax/Q8/d;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual/range {v1 .. v7}, Lax/s9/c;->c1(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lax/Q8/d;Ljava/util/Set;)Lax/s9/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_2b
    .catch Lax/Q8/F; {:try_start_0 .. :try_end_2b} :catch_4c
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_2b} :catch_4a
    .catch Lax/k9/d; {:try_start_0 .. :try_end_2b} :catch_47

    .line 44
    :try_start_2b
    invoke-static {p2}, Lcom/voxdon/xplorer/file/O$c;->a(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/O$c;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v0, :cond_5a

    .line 51
    .line 52
    iget-object p1, p1, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$c;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_52

    .line 61
    .line 62
    iget-object p1, p2, Lcom/voxdon/xplorer/file/O$c;->b:Ljava/lang/String;

    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    invoke-virtual {v1, p1, p2}, Lax/s9/b;->A(Ljava/lang/String;Z)V
    :try_end_43
    .catchall {:try_start_2b .. :try_end_43} :catchall_4f

    .line 66
    .line 67
    .line 68
    :try_start_43
    invoke-virtual {v1}, Lax/s9/g;->close()V
    :try_end_46
    .catch Lax/Q8/F; {:try_start_43 .. :try_end_46} :catch_4c
    .catch Ljava/io/IOException; {:try_start_43 .. :try_end_46} :catch_4a
    .catch Lax/k9/d; {:try_start_43 .. :try_end_46} :catch_47

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_47
    move-exception v0

    .line 73
    :goto_48
    move-object p1, v0

    .line 74
    goto :goto_6e

    .line 75
    :catch_4a
    move-exception v0

    .line 76
    goto :goto_48

    .line 77
    :catch_4c
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    goto :goto_74

    .line 80
    :catchall_4f
    move-exception v0

    .line 81
    move-object p1, v0

    .line 82
    goto :goto_62

    .line 83
    :cond_52
    :try_start_52
    new-instance p1, Lax/b3/j;

    .line 84
    .line 85
    const-string p2, "SMB cannot move to different share!"

    .line 86
    .line 87
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_5a
    new-instance p1, Lax/b3/j;

    .line 92
    .line 93
    const-string p2, "SMB Share cannot be target"

    .line 94
    .line 95
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
    :try_end_62
    .catchall {:try_start_52 .. :try_end_62} :catchall_4f

    .line 99
    :goto_62
    :try_start_62
    invoke-virtual {v1}, Lax/s9/g;->close()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_66
    new-instance p1, Lax/b3/j;

    .line 104
    .line 105
    const-string p2, "SMB Share cannot be moved"

    .line 106
    .line 107
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
    :try_end_6e
    .catch Lax/Q8/F; {:try_start_62 .. :try_end_6e} :catch_4c
    .catch Ljava/io/IOException; {:try_start_62 .. :try_end_6e} :catch_4a
    .catch Lax/k9/d; {:try_start_62 .. :try_end_6e} :catch_47

    .line 111
    :goto_6e
    new-instance p2, Lax/b3/j;

    .line 112
    .line 113
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p2

    .line 117
    :goto_74
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    throw p1
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
