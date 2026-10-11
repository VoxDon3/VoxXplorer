.class final Lax/p2/d$c;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/p2/d$c$a;,
        Lax/p2/d$c$b;,
        Lax/p2/d$c$c;,
        Lax/p2/d$c$d;
    }
.end annotation


# static fields
.field public static final i0:Lax/p2/d$c$c;


# instance fields
.field private final c0:Lax/p2/d$b;

.field private final d0:Lax/o2/h$a;

.field private final e0:Z

.field private f0:Z

.field private final g0:Lax/q2/a;

.field private h0:Z

.field private final q:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/p2/d$c$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/p2/d$c$c;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/p2/d$c;->i0:Lax/p2/d$c$c;

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

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lax/p2/d$b;Lax/o2/h$a;Z)V
    .registers 13

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dbRef"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v5, p4, Lax/o2/h$a;->a:I

    .line 17
    .line 18
    new-instance v6, Lax/p2/e;

    .line 19
    .line 20
    invoke-direct {v6, p4, p3}, Lax/p2/e;-><init>(Lax/o2/h$a;Lax/p2/d$b;)V

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-object v2, p1

    .line 26
    move-object v3, p2

    .line 27
    invoke-direct/range {v1 .. v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lax/p2/d$c;->q:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p3, v1, Lax/p2/d$c;->c0:Lax/p2/d$b;

    .line 33
    .line 34
    iput-object p4, v1, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 35
    .line 36
    iput-boolean p5, v1, Lax/p2/d$c;->e0:Z

    .line 37
    .line 38
    new-instance p1, Lax/q2/a;

    .line 39
    .line 40
    if-nez v3, :cond_37

    .line 41
    .line 42
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string p3, "randomUUID().toString()"

    .line 51
    .line 52
    invoke-static {p2, p3}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_38

    .line 56
    :cond_37
    move-object p2, v3

    .line 57
    :goto_38
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    const-string p4, "context.cacheDir"

    .line 62
    .line 63
    invoke-static {p3, p4}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p4, 0x0

    .line 67
    invoke-direct {p1, p2, p3, p4}, Lax/q2/a;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v1, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 71
    .line 72
    return-void
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
.end method

.method public static synthetic a(Lax/o2/h$a;Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/p2/d$c;->b(Lax/o2/h$a;Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method private static final b(Lax/o2/h$a;Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 5

    .line 1
    const-string v0, "$callback"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$dbRef"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lax/p2/d$c;->i0:Lax/p2/d$c$c;

    .line 12
    .line 13
    const-string v1, "dbObj"

    .line 14
    .line 15
    invoke-static {p2, v1}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lax/p2/d$c$c;->a(Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lax/o2/h$a;->c(Lax/o2/g;)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method private final e(Z)Landroid/database/sqlite/SQLiteDatabase;
    .registers 3

    .line 1
    const-string v0, "{\n                super.\u2026eDatabase()\n            }"

    .line 2
    .line 3
    if-eqz p1, :cond_c

    .line 4
    .line 5
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, v0}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, v0}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method private final f(Z)Landroid/database/sqlite/SQLiteDatabase;
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_31

    .line 6
    .line 7
    iget-object v1, p0, Lax/p2/d$c;->q:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_31

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_31

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "Invalid database parent file, not a directory: "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "SupportSQLite"

    .line 46
    .line 47
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_31
    :try_start_31
    invoke-direct {p0, p1}, Lax/p2/d$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_35
    .catchall {:try_start_31 .. :try_end_35} :catchall_36

    .line 54
    return-object p1

    .line 55
    :catchall_36
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 56
    .line 57
    .line 58
    const-wide/16 v1, 0x1f4

    .line 59
    .line 60
    :try_start_3b
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3e
    .catch Ljava/lang/InterruptedException; {:try_start_3b .. :try_end_3e} :catch_3e

    .line 61
    .line 62
    .line 63
    :catch_3e
    :try_start_3e
    invoke-direct {p0, p1}, Lax/p2/d$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_42
    .catchall {:try_start_3e .. :try_end_42} :catchall_43

    .line 67
    return-object p1

    .line 68
    :catchall_43
    move-exception v1

    .line 69
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 70
    .line 71
    .line 72
    instance-of v2, v1, Lax/p2/d$c$a;

    .line 73
    .line 74
    if-eqz v2, :cond_70

    .line 75
    .line 76
    check-cast v1, Lax/p2/d$c$a;

    .line 77
    .line 78
    invoke-virtual {v1}, Lax/p2/d$c$a;->getCause()Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1}, Lax/p2/d$c$a;->a()Lax/p2/d$c$b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v3, Lax/p2/d$c$d;->a:[I

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    aget v1, v3, v1

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    if-eq v1, v3, :cond_6f

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    if-eq v1, v3, :cond_6f

    .line 99
    .line 100
    const/4 v3, 0x3

    .line 101
    if-eq v1, v3, :cond_6f

    .line 102
    .line 103
    const/4 v3, 0x4

    .line 104
    if-eq v1, v3, :cond_6f

    .line 105
    .line 106
    instance-of v1, v2, Landroid/database/sqlite/SQLiteException;

    .line 107
    .line 108
    if-eqz v1, :cond_6e

    .line 109
    .line 110
    goto :goto_7a

    .line 111
    :cond_6e
    throw v2

    .line 112
    :cond_6f
    throw v2

    .line 113
    :cond_70
    instance-of v2, v1, Landroid/database/sqlite/SQLiteException;

    .line 114
    .line 115
    if-eqz v2, :cond_8b

    .line 116
    .line 117
    if-eqz v0, :cond_8a

    .line 118
    .line 119
    iget-boolean v2, p0, Lax/p2/d$c;->e0:Z

    .line 120
    .line 121
    if-eqz v2, :cond_8a

    .line 122
    .line 123
    :goto_7a
    iget-object v1, p0, Lax/p2/d$c;->q:Landroid/content/Context;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    :try_start_7f
    invoke-direct {p0, p1}, Lax/p2/d$c;->e(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_83
    .catch Lax/p2/d$c$a; {:try_start_7f .. :try_end_83} :catch_84

    .line 132
    return-object p1

    .line 133
    :catch_84
    move-exception p1

    .line 134
    invoke-virtual {p1}, Lax/p2/d$c$a;->getCause()Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    throw p1

    .line 139
    :cond_8a
    throw v1

    .line 140
    :cond_8b
    throw v1
    .line 141
    .line 142
    .line 143
.end method


# virtual methods
.method public final c(Z)Lax/o2/g;
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 2
    .line 3
    iget-boolean v1, p0, Lax/p2/d$c;->h0:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_11

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_11

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_12

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    goto :goto_31

    .line 18
    :cond_11
    const/4 v1, 0x0

    .line 19
    :goto_12
    invoke-virtual {v0, v1}, Lax/q2/a;->b(Z)V

    .line 20
    .line 21
    .line 22
    iput-boolean v2, p0, Lax/p2/d$c;->f0:Z

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lax/p2/d$c;->f(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-boolean v1, p0, Lax/p2/d$c;->f0:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2c

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/p2/d$c;->close()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lax/p2/d$c;->c(Z)Lax/o2/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_26
    .catchall {:try_start_0 .. :try_end_26} :catchall_f

    .line 39
    :goto_26
    iget-object v0, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/q2/a;->d()V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2c
    :try_start_2c
    invoke-virtual {p0, v0}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_30
    .catchall {:try_start_2c .. :try_end_30} :catchall_f

    .line 49
    goto :goto_26

    .line 50
    :goto_31
    iget-object v0, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 51
    .line 52
    invoke-virtual {v0}, Lax/q2/a;->d()V

    .line 53
    .line 54
    .line 55
    throw p1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public close()V
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v0, v3, v1, v2}, Lax/q2/a;->c(Lax/q2/a;ZILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/p2/d$c;->c0:Lax/p2/d$b;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lax/p2/d$b;->b(Lax/p2/c;)V

    .line 15
    .line 16
    .line 17
    iput-boolean v3, p0, Lax/p2/d$c;->h0:Z
    :try_end_12
    .catchall {:try_start_0 .. :try_end_12} :catchall_18

    .line 18
    .line 19
    iget-object v0, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/q2/a;->d()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_18
    move-exception v0

    .line 26
    iget-object v1, p0, Lax/p2/d$c;->g0:Lax/q2/a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lax/q2/a;->d()V

    .line 29
    .line 30
    .line 31
    throw v0
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
.end method

.method public final d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;
    .registers 4

    .line 1
    const-string v0, "sqLiteDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/p2/d$c;->i0:Lax/p2/d$c$c;

    .line 7
    .line 8
    iget-object v1, p0, Lax/p2/d$c;->c0:Lax/p2/d$b;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Lax/p2/d$c$c;->a(Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 4

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_5
    iget-object v0, p0, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lax/o2/h$a;->b(Lax/o2/g;)V
    :try_end_e
    .catchall {:try_start_5 .. :try_end_e} :catchall_f

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    new-instance v0, Lax/p2/d$c$a;

    .line 18
    .line 19
    sget-object v1, Lax/p2/d$c$b;->q:Lax/p2/d$c$b;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Lax/p2/d$c$a;-><init>(Lax/p2/d$c$b;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0
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
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 4

    .line 1
    const-string v0, "sqLiteDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_5
    iget-object v0, p0, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lax/o2/h$a;->d(Lax/o2/g;)V
    :try_end_e
    .catchall {:try_start_5 .. :try_end_e} :catchall_f

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception p1

    .line 17
    new-instance v0, Lax/p2/d$c$a;

    .line 18
    .line 19
    sget-object v1, Lax/p2/d$c$b;->c0:Lax/p2/d$c$b;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Lax/p2/d$c$a;-><init>(Lax/p2/d$c$b;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0
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
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .registers 5

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/p2/d$c;->f0:Z

    .line 8
    .line 9
    :try_start_8
    iget-object v0, p0, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1, p2, p3}, Lax/o2/h$a;->e(Lax/o2/g;II)V
    :try_end_11
    .catchall {:try_start_8 .. :try_end_11} :catchall_12

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    new-instance p2, Lax/p2/d$c$a;

    .line 21
    .line 22
    sget-object p3, Lax/p2/d$c$b;->e0:Lax/p2/d$c$b;

    .line 23
    .line 24
    invoke-direct {p2, p3, p1}, Lax/p2/d$c$a;-><init>(Lax/p2/d$c$b;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p2
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

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 4

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/p2/d$c;->f0:Z

    .line 7
    .line 8
    if-nez v0, :cond_1c

    .line 9
    .line 10
    :try_start_9
    iget-object v0, p0, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lax/o2/h$a;->f(Lax/o2/g;)V
    :try_end_12
    .catchall {:try_start_9 .. :try_end_12} :catchall_13

    .line 17
    .line 18
    .line 19
    goto :goto_1c

    .line 20
    :catchall_13
    move-exception p1

    .line 21
    new-instance v0, Lax/p2/d$c$a;

    .line 22
    .line 23
    sget-object v1, Lax/p2/d$c$b;->f0:Lax/p2/d$c$b;

    .line 24
    .line 25
    invoke-direct {v0, v1, p1}, Lax/p2/d$c$a;-><init>(Lax/p2/d$c$b;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1c
    :goto_1c
    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lax/p2/d$c;->h0:Z

    .line 31
    .line 32
    return-void
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

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .registers 5

    .line 1
    const-string v0, "sqLiteDatabase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/p2/d$c;->f0:Z

    .line 8
    .line 9
    :try_start_8
    iget-object v0, p0, Lax/p2/d$c;->d0:Lax/o2/h$a;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lax/p2/d$c;->d(Landroid/database/sqlite/SQLiteDatabase;)Lax/p2/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1, p2, p3}, Lax/o2/h$a;->g(Lax/o2/g;II)V
    :try_end_11
    .catchall {:try_start_8 .. :try_end_11} :catchall_12

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    new-instance p2, Lax/p2/d$c$a;

    .line 21
    .line 22
    sget-object p3, Lax/p2/d$c$b;->d0:Lax/p2/d$c$b;

    .line 23
    .line 24
    invoke-direct {p2, p3, p1}, Lax/p2/d$c$a;-><init>(Lax/p2/d$c$b;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p2
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
