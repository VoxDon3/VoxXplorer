.class public Lcom/voxdon/xplorer/file/k;
.super Lcom/voxdon/xplorer/file/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/k$a;,
        Lcom/voxdon/xplorer/file/k$c;,
        Lcom/voxdon/xplorer/file/k$b;
    }
.end annotation


# static fields
.field private static final o:Ljava/util/logging/Logger;

.field static p:Lcom/voxdon/xplorer/file/k$a;

.field static final q:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private h:Lax/x4/a;

.field private i:Lcom/voxdon/xplorer/file/k$b;

.field private j:Lcom/voxdon/xplorer/file/c$a;

.field private k:Z

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .registers 38

    .line 1
    const-string v0, "FileManager.DropboxFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/k;->o:Ljava/util/logging/Logger;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashSet;

    .line 10
    .line 11
    const-string v36, "vob"

    .line 12
    .line 13
    const-string v37, "pdf"

    .line 14
    .line 15
    const-string v1, "jpg"

    .line 16
    .line 17
    const-string v2, "jpeg"

    .line 18
    .line 19
    const-string v3, "png"

    .line 20
    .line 21
    const-string v4, "tiff"

    .line 22
    .line 23
    const-string v5, "tif"

    .line 24
    .line 25
    const-string v6, "gif"

    .line 26
    .line 27
    const-string v7, "webp"

    .line 28
    .line 29
    const-string v8, "ppm"

    .line 30
    .line 31
    const-string v9, "bmp"

    .line 32
    .line 33
    const-string v10, "svg"

    .line 34
    .line 35
    const-string v11, "heic"

    .line 36
    .line 37
    const-string v12, "cr2"

    .line 38
    .line 39
    const-string v13, "crw"

    .line 40
    .line 41
    const-string v14, "nef"

    .line 42
    .line 43
    const-string v15, "nrw"

    .line 44
    .line 45
    const-string v16, "sr2"

    .line 46
    .line 47
    const-string v17, "dng"

    .line 48
    .line 49
    const-string v18, "arw"

    .line 50
    .line 51
    const-string v19, "orf"

    .line 52
    .line 53
    const-string v20, "mp4"

    .line 54
    .line 55
    const-string v21, "m4v"

    .line 56
    .line 57
    const-string v22, "3gp"

    .line 58
    .line 59
    const-string v23, "3gpp"

    .line 60
    .line 61
    const-string v24, "3gpp2"

    .line 62
    .line 63
    const-string v25, "webm"

    .line 64
    .line 65
    const-string v26, "mkv"

    .line 66
    .line 67
    const-string v27, "wmv"

    .line 68
    .line 69
    const-string v28, "avi"

    .line 70
    .line 71
    const-string v29, "mpg"

    .line 72
    .line 73
    const-string v30, "mpeg"

    .line 74
    .line 75
    const-string v31, "mov"

    .line 76
    .line 77
    const-string v32, "asf"

    .line 78
    .line 79
    const-string v33, "ogv"

    .line 80
    .line 81
    const-string v34, "ts"

    .line 82
    .line 83
    const-string v35, "mts"

    .line 84
    .line 85
    filled-new-array/range {v1 .. v37}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lcom/voxdon/xplorer/file/k;->q:Ljava/util/HashSet;

    .line 97
    .line 98
    return-void
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

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/m;-><init>()V

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
.end method

.method private static C0(Landroid/app/Activity;)Z
    .registers 3

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/file/k;->t0(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    :try_start_3
    invoke-static {p0}, Lax/c3/g;->c(Landroid/content/Context;)Lax/c3/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/c3/g;->a(Lax/Q2/f;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lcom/voxdon/xplorer/file/k;->v0()Lax/p4/m;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, v0, v1}, Lcom/dropbox/core/android/a;->b(Landroid/content/Context;Ljava/lang/String;Lax/p4/m;)V
    :try_end_14
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_14} :catch_16

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :catch_16
    move-exception p0

    .line 24
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Dropbox OAuth Error"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
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

.method private D0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const-string v9, "dropbox uploadfile"

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v10, 0x2

    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x1

    .line 13
    const/4 v10, 0x1

    .line 14
    :goto_d
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    :goto_10
    if-ge v11, v10, :cond_b7

    .line 18
    .line 19
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v1, Lax/c3/e0;

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    move-wide/from16 v5, p3

    .line 28
    .line 29
    move-object/from16 v7, p8

    .line 30
    .line 31
    move-object/from16 v8, p9

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, Lax/c3/e0;-><init>(Ljava/io/InputStream;JJLax/u3/c;Lax/g3/i;)V

    .line 34
    .line 35
    .line 36
    :try_start_23
    invoke-virtual {p1}, Lax/x4/b;->a()Lax/G4/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_27
    .catch Lax/p4/x; {:try_start_23 .. :try_end_27} :catch_a8
    .catch Lax/p4/t; {:try_start_23 .. :try_end_27} :catch_9e
    .catch Lax/G4/w0; {:try_start_23 .. :try_end_27} :catch_45
    .catch Lax/p4/j; {:try_start_23 .. :try_end_27} :catch_42
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_27} :catch_3f
    .catchall {:try_start_23 .. :try_end_27} :catchall_3b

    .line 40
    move-object/from16 v2, p6

    .line 41
    .line 42
    :try_start_29
    invoke-virtual {v0, v2}, Lax/G4/f;->v(Ljava/lang/String;)Lax/G4/u0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Lax/G4/u0;->e(Ljava/lang/Boolean;)Lax/G4/u0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p7, :cond_4c

    .line 53
    .line 54
    sget-object v3, Lax/G4/T0;->d:Lax/G4/T0;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lax/G4/u0;->g(Lax/G4/T0;)Lax/G4/u0;

    .line 57
    .line 58
    .line 59
    goto :goto_51

    .line 60
    :catchall_3b
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    goto/16 :goto_b3

    .line 63
    .line 64
    :catch_3f
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_7e

    .line 67
    :catch_42
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    goto :goto_92

    .line 70
    :catch_45
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    goto :goto_97

    .line 73
    :catch_48
    move-exception v0

    .line 74
    goto :goto_a1

    .line 75
    :catch_4a
    move-exception v0

    .line 76
    goto :goto_ab

    .line 77
    :cond_4c
    sget-object v3, Lax/G4/T0;->c:Lax/G4/T0;

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Lax/G4/u0;->g(Lax/G4/T0;)Lax/G4/u0;

    .line 80
    .line 81
    .line 82
    :goto_51
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    if-eqz p5, :cond_69

    .line 85
    .line 86
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    cmp-long v12, v7, v3

    .line 91
    .line 92
    if-lez v12, :cond_69

    .line 93
    .line 94
    new-instance v7, Ljava/util/Date;

    .line 95
    .line 96
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v12

    .line 100
    invoke-direct {v7, v12, v13}, Ljava/util/Date;-><init>(J)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v7}, Lax/G4/u0;->f(Ljava/util/Date;)Lax/G4/u0;

    .line 104
    .line 105
    .line 106
    :cond_69
    cmp-long v7, v5, v3

    .line 107
    .line 108
    if-ltz v7, :cond_74

    .line 109
    .line 110
    invoke-virtual {v0, v1, v5, v6}, Lax/x4/e;->c(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lax/G4/t;

    .line 115
    .line 116
    goto :goto_7a

    .line 117
    :cond_74
    invoke-virtual {v0, v1}, Lax/x4/e;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lax/G4/t;
    :try_end_7a
    .catch Lax/p4/x; {:try_start_29 .. :try_end_7a} :catch_4a
    .catch Lax/p4/t; {:try_start_29 .. :try_end_7a} :catch_48
    .catch Lax/G4/w0; {:try_start_29 .. :try_end_7a} :catch_45
    .catch Lax/p4/j; {:try_start_29 .. :try_end_7a} :catch_42
    .catch Ljava/io/IOException; {:try_start_29 .. :try_end_7a} :catch_3f
    .catchall {:try_start_29 .. :try_end_7a} :catchall_3b

    .line 122
    .line 123
    :goto_7a
    :try_start_7a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7d
    .catch Ljava/io/IOException; {:try_start_7a .. :try_end_7d} :catch_7d

    .line 124
    .line 125
    .line 126
    :catch_7d
    return-void

    .line 127
    :goto_7e
    :try_start_7e
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    instance-of v0, v0, Lax/b3/a;

    .line 132
    .line 133
    if-eqz v0, :cond_8d

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Lax/b3/a;

    .line 140
    .line 141
    throw p1

    .line 142
    :cond_8d
    invoke-static {v9, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    throw p1

    .line 147
    :goto_92
    invoke-direct {p0, v9, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    throw p1

    .line 152
    :goto_97
    const-string v0, "upload"

    .line 153
    .line 154
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    throw p1

    .line 159
    :catch_9e
    move-exception v0

    .line 160
    move-object/from16 v2, p6

    .line 161
    .line 162
    :goto_a1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_a4
    .catchall {:try_start_7e .. :try_end_a4} :catchall_3b

    .line 163
    .line 164
    .line 165
    :goto_a4
    :try_start_a4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a7
    .catch Ljava/io/IOException; {:try_start_a4 .. :try_end_a7} :catch_af

    .line 166
    .line 167
    .line 168
    goto :goto_af

    .line 169
    :catch_a8
    move-exception v0

    .line 170
    move-object/from16 v2, p6

    .line 171
    .line 172
    :goto_ab
    :try_start_ab
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_ae
    .catchall {:try_start_ab .. :try_end_ae} :catchall_3b

    .line 173
    .line 174
    .line 175
    goto :goto_a4

    .line 176
    :catch_af
    :goto_af
    add-int/lit8 v11, v11, 0x1

    .line 177
    .line 178
    goto/16 :goto_10

    .line 179
    .line 180
    :goto_b3
    :try_start_b3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_b6
    .catch Ljava/io/IOException; {:try_start_b3 .. :try_end_b6} :catch_b6

    .line 181
    .line 182
    .line 183
    :catch_b6
    throw p1

    .line 184
    :cond_b7
    const-string p1, "Maxed out upload attempts to Dropbox"

    .line 185
    .line 186
    invoke-static {p1, v0}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    throw p1
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
.end method

.method private E0(Ljava/lang/String;Lax/p4/j;Lax/G4/S0;)Lax/b3/j;
    .registers 5

    .line 1
    invoke-virtual {p3}, Lax/G4/S0;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    new-instance p3, Lax/b3/s;

    .line 8
    .line 9
    invoke-direct {p3, p1, p2}, Lax/b3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-object p3

    .line 13
    :cond_c
    invoke-virtual {p3}, Lax/G4/S0;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    new-instance p3, Lax/b3/e;

    .line 20
    .line 21
    invoke-direct {p3, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-object p3

    .line 25
    :cond_18
    invoke-virtual {p3}, Lax/G4/S0;->d()Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-eqz p3, :cond_24

    .line 30
    .line 31
    new-instance p3, Lax/b3/o;

    .line 32
    .line 33
    invoke-direct {p3, p1, p2}, Lax/b3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-object p3

    .line 37
    :cond_24
    const/4 p1, 0x0

    .line 38
    return-object p1
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

.method static synthetic k0(Lcom/voxdon/xplorer/file/k;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/k;->w0(Z)V

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

.method static synthetic l0(Lcom/voxdon/xplorer/file/k;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic m0(Lcom/voxdon/xplorer/file/k;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic n0(Landroid/app/Activity;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lcom/voxdon/xplorer/file/k;->C0(Landroid/app/Activity;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private o0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V
    .registers 31
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const-wide/32 v1, 0x400000

    .line 2
    .line 3
    .line 4
    cmp-long v0, p3, v1

    .line 5
    .line 6
    if-gez v0, :cond_d

    .line 7
    .line 8
    const-string v0, "File too small, use upload() instead."

    .line 9
    .line 10
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_16

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    const/4 v4, 0x5

    .line 22
    goto :goto_18

    .line 23
    :cond_16
    const/4 v0, 0x1

    .line 24
    const/4 v4, 0x1

    .line 25
    :goto_18
    const/4 v0, 0x0

    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v7, v0

    .line 30
    move-wide v11, v5

    .line 31
    const/4 v8, 0x0

    .line 32
    :goto_1f
    if-ge v8, v4, :cond_164

    .line 33
    .line 34
    if-eqz v3, :cond_39

    .line 35
    .line 36
    cmp-long v0, v11, v5

    .line 37
    .line 38
    if-lez v0, :cond_39

    .line 39
    .line 40
    move-object/from16 v9, p2

    .line 41
    .line 42
    invoke-virtual {v9, v11, v12}, Lax/c3/G;->c(J)Ljava/io/InputStream;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    new-instance v9, Lax/c3/e0;

    .line 47
    .line 48
    move-wide/from16 v13, p3

    .line 49
    .line 50
    move-object/from16 v15, p8

    .line 51
    .line 52
    move-object/from16 v16, p9

    .line 53
    .line 54
    invoke-direct/range {v9 .. v16}, Lax/c3/e0;-><init>(Ljava/io/InputStream;JJLax/u3/c;Lax/g3/i;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4b

    .line 58
    :cond_39
    invoke-virtual/range {p2 .. p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    new-instance v13, Lax/c3/e0;

    .line 63
    .line 64
    const-wide/16 v15, 0x0

    .line 65
    .line 66
    move-wide/from16 v17, p3

    .line 67
    .line 68
    move-object/from16 v19, p8

    .line 69
    .line 70
    move-object/from16 v20, p9

    .line 71
    .line 72
    invoke-direct/range {v13 .. v20}, Lax/c3/e0;-><init>(Ljava/io/InputStream;JJLax/u3/c;Lax/g3/i;)V

    .line 73
    .line 74
    .line 75
    move-object v9, v13

    .line 76
    :goto_4b
    if-nez v7, :cond_7d

    .line 77
    .line 78
    :try_start_4d
    invoke-virtual/range {p1 .. p1}, Lax/x4/b;->a()Lax/G4/f;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lax/G4/f;->A()Lax/G4/M0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v9, v1, v2}, Lax/p4/o;->e(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lax/G4/L0;

    .line 91
    .line 92
    invoke-virtual {v0}, Lax/G4/L0;->a()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    add-long/2addr v11, v1

    .line 97
    goto :goto_7d

    .line 98
    :catchall_61
    move-exception v0

    .line 99
    move-object/from16 v2, p0

    .line 100
    .line 101
    goto/16 :goto_156

    .line 102
    .line 103
    :catch_66
    move-exception v0

    .line 104
    goto/16 :goto_f0

    .line 105
    .line 106
    :catch_69
    move-exception v0

    .line 107
    goto/16 :goto_105

    .line 108
    .line 109
    :catch_6c
    move-exception v0

    .line 110
    move-object/from16 v2, p0

    .line 111
    .line 112
    goto/16 :goto_110

    .line 113
    .line 114
    :catch_71
    move-exception v0

    .line 115
    move-object/from16 v2, p0

    .line 116
    .line 117
    goto/16 :goto_13d

    .line 118
    .line 119
    :catch_76
    move-exception v0

    .line 120
    :goto_77
    move-object/from16 v2, p0

    .line 121
    .line 122
    goto/16 :goto_15a

    .line 123
    .line 124
    :catch_7b
    move-exception v0

    .line 125
    goto :goto_77

    .line 126
    :cond_7d
    :goto_7d
    new-instance v0, Lax/G4/B0;

    .line 127
    .line 128
    invoke-direct {v0, v7, v11, v12}, Lax/G4/B0;-><init>(Ljava/lang/String;J)V

    .line 129
    .line 130
    .line 131
    :goto_82
    sub-long v13, p3, v11

    .line 132
    .line 133
    cmp-long v10, v13, v1

    .line 134
    .line 135
    if-lez v10, :cond_9a

    .line 136
    .line 137
    invoke-virtual/range {p1 .. p1}, Lax/x4/b;->a()Lax/G4/f;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-virtual {v10, v0}, Lax/G4/f;->x(Lax/G4/B0;)Lax/G4/A0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0, v9, v1, v2}, Lax/p4/o;->e(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    add-long/2addr v11, v1

    .line 149
    new-instance v0, Lax/G4/B0;

    .line 150
    .line 151
    invoke-direct {v0, v7, v11, v12}, Lax/G4/B0;-><init>(Ljava/lang/String;J)V

    .line 152
    .line 153
    .line 154
    goto :goto_82

    .line 155
    :cond_9a
    invoke-static/range {p6 .. p6}, Lax/G4/a;->a(Ljava/lang/String;)Lax/G4/a$a;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {v10, v15}, Lax/G4/a$a;->b(Ljava/lang/Boolean;)Lax/G4/a$a;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    if-eqz p7, :cond_ac

    .line 166
    .line 167
    sget-object v15, Lax/G4/T0;->d:Lax/G4/T0;

    .line 168
    .line 169
    invoke-virtual {v10, v15}, Lax/G4/a$a;->d(Lax/G4/T0;)Lax/G4/a$a;

    .line 170
    .line 171
    .line 172
    goto :goto_b1

    .line 173
    :cond_ac
    sget-object v15, Lax/G4/T0;->c:Lax/G4/T0;

    .line 174
    .line 175
    invoke-virtual {v10, v15}, Lax/G4/a$a;->d(Lax/G4/T0;)Lax/G4/a$a;

    .line 176
    .line 177
    .line 178
    :goto_b1
    if-eqz p5, :cond_c7

    .line 179
    .line 180
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v15

    .line 184
    cmp-long v17, v15, v5

    .line 185
    .line 186
    if-lez v17, :cond_c7

    .line 187
    .line 188
    new-instance v15, Ljava/util/Date;

    .line 189
    .line 190
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    .line 191
    .line 192
    .line 193
    move-result-wide v1

    .line 194
    invoke-direct {v15, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v15}, Lax/G4/a$a;->c(Ljava/util/Date;)Lax/G4/a$a;

    .line 198
    .line 199
    .line 200
    :cond_c7
    invoke-virtual {v10}, Lax/G4/a$a;->a()Lax/G4/a;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual/range {p1 .. p1}, Lax/x4/b;->a()Lax/G4/f;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v2, v0, v1}, Lax/G4/f;->y(Lax/G4/B0;Lax/G4/a;)Lax/G4/F0;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0, v9, v13, v14}, Lax/p4/o;->e(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Lax/G4/t;

    .line 217
    .line 218
    if-eqz v0, :cond_ec

    .line 219
    .line 220
    invoke-virtual {v0}, Lax/G4/t;->f()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    cmp-long v2, v0, p3

    .line 225
    .line 226
    if-ltz v2, :cond_e4

    .line 227
    .line 228
    goto :goto_ec

    .line 229
    :cond_e4
    new-instance v0, Lax/b3/j;

    .line 230
    .line 231
    const-string v1, "The size of the uploaded file is different from the source"

    .line 232
    .line 233
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v0
    :try_end_ec
    .catch Lax/p4/x; {:try_start_4d .. :try_end_ec} :catch_7b
    .catch Lax/p4/t; {:try_start_4d .. :try_end_ec} :catch_76
    .catch Lax/G4/z0; {:try_start_4d .. :try_end_ec} :catch_71
    .catch Lax/G4/E0; {:try_start_4d .. :try_end_ec} :catch_6c
    .catch Lax/p4/j; {:try_start_4d .. :try_end_ec} :catch_69
    .catch Ljava/io/IOException; {:try_start_4d .. :try_end_ec} :catch_66
    .catchall {:try_start_4d .. :try_end_ec} :catchall_61

    .line 237
    :cond_ec
    :goto_ec
    :try_start_ec
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_ef
    .catch Ljava/io/IOException; {:try_start_ec .. :try_end_ef} :catch_ef

    .line 238
    .line 239
    .line 240
    :catch_ef
    return-void

    .line 241
    :goto_f0
    :try_start_f0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    instance-of v1, v1, Lax/b3/a;

    .line 246
    .line 247
    if-eqz v1, :cond_ff

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Lax/b3/a;

    .line 254
    .line 255
    throw v0

    .line 256
    :cond_ff
    new-instance v1, Lax/b3/j;

    .line 257
    .line 258
    invoke-direct {v1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :goto_105
    const-string v1, "chunk_upload"
    :try_end_107
    .catchall {:try_start_f0 .. :try_end_107} :catchall_61

    .line 263
    .line 264
    move-object/from16 v2, p0

    .line 265
    .line 266
    :try_start_109
    invoke-direct {v2, v1, v0}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    throw v0

    .line 271
    :catchall_10e
    move-exception v0

    .line 272
    goto :goto_156

    .line 273
    :goto_110
    iget-object v1, v0, Lax/G4/E0;->d0:Lax/G4/D0;

    .line 274
    .line 275
    invoke-virtual {v1}, Lax/G4/D0;->e()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_137

    .line 280
    .line 281
    iget-object v1, v0, Lax/G4/E0;->d0:Lax/G4/D0;

    .line 282
    .line 283
    invoke-virtual {v1}, Lax/G4/D0;->d()Lax/G4/G0;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v1}, Lax/G4/G0;->d()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_137

    .line 292
    .line 293
    iget-object v1, v0, Lax/G4/E0;->d0:Lax/G4/D0;

    .line 294
    .line 295
    invoke-virtual {v1}, Lax/G4/D0;->d()Lax/G4/G0;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1}, Lax/G4/G0;->b()Lax/G4/H0;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1}, Lax/G4/H0;->a()J

    .line 304
    .line 305
    .line 306
    move-result-wide v10
    :try_end_132
    .catchall {:try_start_109 .. :try_end_132} :catchall_10e

    .line 307
    :goto_132
    :try_start_132
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_135
    .catch Ljava/io/IOException; {:try_start_132 .. :try_end_135} :catch_135

    .line 308
    .line 309
    .line 310
    :catch_135
    move-wide v11, v10

    .line 311
    goto :goto_15d

    .line 312
    :cond_137
    :try_start_137
    new-instance v1, Lax/b3/j;

    .line 313
    .line 314
    invoke-direct {v1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    throw v1

    .line 318
    :goto_13d
    iget-object v1, v0, Lax/G4/z0;->d0:Lax/G4/y0;

    .line 319
    .line 320
    invoke-virtual {v1}, Lax/G4/y0;->d()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_150

    .line 325
    .line 326
    iget-object v1, v0, Lax/G4/z0;->d0:Lax/G4/y0;

    .line 327
    .line 328
    invoke-virtual {v1}, Lax/G4/y0;->b()Lax/G4/H0;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1}, Lax/G4/H0;->a()J

    .line 333
    .line 334
    .line 335
    move-result-wide v10

    .line 336
    goto :goto_132

    .line 337
    :cond_150
    new-instance v1, Lax/b3/j;

    .line 338
    .line 339
    invoke-direct {v1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    throw v1
    :try_end_156
    .catchall {:try_start_137 .. :try_end_156} :catchall_10e

    .line 343
    :goto_156
    :try_start_156
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_159
    .catch Ljava/io/IOException; {:try_start_156 .. :try_end_159} :catch_159

    .line 344
    .line 345
    .line 346
    :catch_159
    throw v0

    .line 347
    :goto_15a
    :try_start_15a
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_15d
    .catch Ljava/io/IOException; {:try_start_15a .. :try_end_15d} :catch_15d

    .line 348
    .line 349
    .line 350
    :catch_15d
    :goto_15d
    add-int/lit8 v8, v8, 0x1

    .line 351
    .line 352
    const-wide/32 v1, 0x400000

    .line 353
    .line 354
    .line 355
    goto/16 :goto_1f

    .line 356
    .line 357
    :cond_164
    move-object/from16 v2, p0

    .line 358
    .line 359
    const-string v1, "Maxed out upload attempts to Dropbox"

    .line 360
    .line 361
    invoke-static {v1, v0}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    throw v0
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

.method private p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;
    .registers 5

    .line 1
    instance-of v0, p2, Lax/p4/t;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    new-instance v0, Lax/b3/q;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lax/b3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    instance-of v0, p2, Lax/p4/a;

    .line 12
    .line 13
    if-eqz v0, :cond_14

    .line 14
    .line 15
    new-instance v0, Lax/b3/e;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_14
    instance-of v0, p2, Lax/p4/d;

    .line 22
    .line 23
    if-eqz v0, :cond_29

    .line 24
    .line 25
    move-object v0, p2

    .line 26
    check-cast v0, Lax/p4/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/p4/d;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v1, 0x1fb

    .line 33
    .line 34
    if-ne v0, v1, :cond_29

    .line 35
    .line 36
    new-instance v0, Lax/b3/s;

    .line 37
    .line 38
    invoke-direct {v0, p1, p2}, Lax/b3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_29
    instance-of v0, p2, Lax/G4/p;

    .line 43
    .line 44
    if-eqz v0, :cond_4f

    .line 45
    .line 46
    move-object v0, p2

    .line 47
    check-cast v0, Lax/G4/p;

    .line 48
    .line 49
    iget-object v1, v0, Lax/G4/p;->d0:Lax/G4/o;

    .line 50
    .line 51
    if-eqz v1, :cond_4f

    .line 52
    .line 53
    invoke-virtual {v1}, Lax/G4/o;->c()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4f

    .line 58
    .line 59
    iget-object v1, v0, Lax/G4/p;->d0:Lax/G4/o;

    .line 60
    .line 61
    invoke-virtual {v1}, Lax/G4/o;->b()Lax/G4/M;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_4f

    .line 66
    .line 67
    iget-object v0, v0, Lax/G4/p;->d0:Lax/G4/o;

    .line 68
    .line 69
    invoke-virtual {v0}, Lax/G4/o;->b()Lax/G4/M;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->u0(Ljava/lang/String;Lax/p4/j;Lax/G4/M;)Lax/b3/j;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_4f

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_4f
    instance-of v0, p2, Lax/G4/w0;

    .line 81
    .line 82
    if-eqz v0, :cond_85

    .line 83
    .line 84
    move-object v0, p2

    .line 85
    check-cast v0, Lax/G4/w0;

    .line 86
    .line 87
    iget-object v1, v0, Lax/G4/w0;->d0:Lax/G4/v0;

    .line 88
    .line 89
    if-eqz v1, :cond_85

    .line 90
    .line 91
    invoke-virtual {v1}, Lax/G4/v0;->d()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_85

    .line 96
    .line 97
    iget-object v1, v0, Lax/G4/w0;->d0:Lax/G4/v0;

    .line 98
    .line 99
    invoke-virtual {v1}, Lax/G4/v0;->c()Lax/G4/P0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_85

    .line 104
    .line 105
    iget-object v1, v0, Lax/G4/w0;->d0:Lax/G4/v0;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/G4/v0;->c()Lax/G4/P0;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Lax/G4/P0;->a()Lax/G4/S0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_85

    .line 116
    .line 117
    iget-object v0, v0, Lax/G4/w0;->d0:Lax/G4/v0;

    .line 118
    .line 119
    invoke-virtual {v0}, Lax/G4/v0;->c()Lax/G4/P0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lax/G4/P0;->a()Lax/G4/S0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->E0(Ljava/lang/String;Lax/p4/j;Lax/G4/S0;)Lax/b3/j;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_85

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_85
    instance-of v0, p2, Lax/G4/X;

    .line 135
    .line 136
    if-eqz v0, :cond_d6

    .line 137
    .line 138
    move-object v0, p2

    .line 139
    check-cast v0, Lax/G4/X;

    .line 140
    .line 141
    iget-object v1, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 142
    .line 143
    if-eqz v1, :cond_d6

    .line 144
    .line 145
    invoke-virtual {v1}, Lax/G4/W;->n()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_9c

    .line 150
    .line 151
    new-instance v0, Lax/b3/s;

    .line 152
    .line 153
    invoke-direct {v0, p1, p2}, Lax/b3/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_9c
    iget-object v1, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 158
    .line 159
    invoke-virtual {v1}, Lax/G4/W;->l()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_b9

    .line 164
    .line 165
    iget-object v1, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 166
    .line 167
    invoke-virtual {v1}, Lax/G4/W;->j()Lax/G4/M;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_b9

    .line 172
    .line 173
    iget-object v0, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 174
    .line 175
    invoke-virtual {v0}, Lax/G4/W;->j()Lax/G4/M;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->u0(Ljava/lang/String;Lax/p4/j;Lax/G4/M;)Lax/b3/j;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-eqz v0, :cond_d6

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_b9
    iget-object v1, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 187
    .line 188
    invoke-virtual {v1}, Lax/G4/W;->m()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_d6

    .line 193
    .line 194
    iget-object v1, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 195
    .line 196
    invoke-virtual {v1}, Lax/G4/W;->k()Lax/G4/S0;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-eqz v1, :cond_d6

    .line 201
    .line 202
    iget-object v0, v0, Lax/G4/X;->d0:Lax/G4/W;

    .line 203
    .line 204
    invoke-virtual {v0}, Lax/G4/W;->k()Lax/G4/S0;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->E0(Ljava/lang/String;Lax/p4/j;Lax/G4/S0;)Lax/b3/j;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_d6

    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_d6
    instance-of v0, p2, Lax/G4/K;

    .line 216
    .line 217
    if-eqz v0, :cond_fc

    .line 218
    .line 219
    move-object v0, p2

    .line 220
    check-cast v0, Lax/G4/K;

    .line 221
    .line 222
    iget-object v1, v0, Lax/G4/K;->d0:Lax/G4/J;

    .line 223
    .line 224
    if-eqz v1, :cond_fc

    .line 225
    .line 226
    invoke-virtual {v1}, Lax/G4/J;->d()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_fc

    .line 231
    .line 232
    iget-object v1, v0, Lax/G4/K;->d0:Lax/G4/J;

    .line 233
    .line 234
    invoke-virtual {v1}, Lax/G4/J;->c()Lax/G4/M;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-eqz v1, :cond_fc

    .line 239
    .line 240
    iget-object v0, v0, Lax/G4/K;->d0:Lax/G4/J;

    .line 241
    .line 242
    invoke-virtual {v0}, Lax/G4/J;->c()Lax/G4/M;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->u0(Ljava/lang/String;Lax/p4/j;Lax/G4/M;)Lax/b3/j;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-eqz v0, :cond_fc

    .line 251
    .line 252
    return-object v0

    .line 253
    :cond_fc
    instance-of v0, p2, Lax/G4/i;

    .line 254
    .line 255
    if-eqz v0, :cond_13f

    .line 256
    .line 257
    move-object v0, p2

    .line 258
    check-cast v0, Lax/G4/i;

    .line 259
    .line 260
    iget-object v1, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 261
    .line 262
    if-eqz v1, :cond_13f

    .line 263
    .line 264
    invoke-virtual {v1}, Lax/G4/h;->e()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_122

    .line 269
    .line 270
    iget-object v1, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 271
    .line 272
    invoke-virtual {v1}, Lax/G4/h;->c()Lax/G4/M;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    if-eqz v1, :cond_122

    .line 277
    .line 278
    iget-object v0, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 279
    .line 280
    invoke-virtual {v0}, Lax/G4/h;->c()Lax/G4/M;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->u0(Ljava/lang/String;Lax/p4/j;Lax/G4/M;)Lax/b3/j;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-eqz v0, :cond_13f

    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_122
    iget-object v1, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 292
    .line 293
    invoke-virtual {v1}, Lax/G4/h;->f()Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_13f

    .line 298
    .line 299
    iget-object v1, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 300
    .line 301
    invoke-virtual {v1}, Lax/G4/h;->d()Lax/G4/S0;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    if-eqz v1, :cond_13f

    .line 306
    .line 307
    iget-object v0, v0, Lax/G4/i;->d0:Lax/G4/h;

    .line 308
    .line 309
    invoke-virtual {v0}, Lax/G4/h;->d()Lax/G4/S0;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/k;->E0(Ljava/lang/String;Lax/p4/j;Lax/G4/S0;)Lax/b3/j;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_13f

    .line 318
    .line 319
    return-object v0

    .line 320
    :cond_13f
    new-instance v0, Lax/b3/j;

    .line 321
    .line 322
    invoke-direct {v0, p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    return-object v0
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

.method static q0(Ljava/lang/String;)Lax/x4/a;
    .registers 3

    .line 1
    new-instance v0, Lax/x4/a;

    .line 2
    .line 3
    invoke-static {}, Lcom/voxdon/xplorer/file/k;->v0()Lax/p4/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lax/x4/a;-><init>(Lax/p4/m;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method static r0(Lax/u4/a;)Lax/x4/a;
    .registers 3

    .line 1
    new-instance v0, Lax/x4/a;

    .line 2
    .line 3
    invoke-static {}, Lcom/voxdon/xplorer/file/k;->v0()Lax/p4/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lax/x4/a;-><init>(Lax/p4/m;Lax/u4/a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public static s0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/k$a;
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/k;->p:Lcom/voxdon/xplorer/file/k$a;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/file/k$a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/file/k$a;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/voxdon/xplorer/file/k;->p:Lcom/voxdon/xplorer/file/k$a;

    .line 15
    .line 16
    :cond_f
    sget-object p0, Lcom/voxdon/xplorer/file/k;->p:Lcom/voxdon/xplorer/file/k$a;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static t0(Landroid/content/Context;)V
    .registers 1

    .line 1
    return-void
.end method

.method private u0(Ljava/lang/String;Lax/p4/j;Lax/G4/M;)Lax/b3/j;
    .registers 5

    .line 1
    invoke-virtual {p3}, Lax/G4/M;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    new-instance p1, Lax/b3/t;

    .line 8
    .line 9
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-virtual {p3}, Lax/G4/M;->c()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_18

    .line 18
    .line 19
    new-instance p3, Lax/b3/e;

    .line 20
    .line 21
    invoke-direct {p3, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-object p3

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    return-object p1
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

.method private static v0()Lax/p4/m;
    .registers 2

    .line 1
    const-string v0, "FileManager/2.7.8"

    .line 2
    .line 3
    invoke-static {v0}, Lax/p4/m;->e(Ljava/lang/String;)Lax/p4/m$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/s4/b;->e:Lax/s4/b;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/p4/m$b;->b(Lax/s4/a;)Lax/p4/m$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lax/p4/m$b;->a()Lax/p4/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private w0(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->j:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :cond_8
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
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    return-object p3

    .line 7
    :cond_6
    :try_start_6
    invoke-virtual {p1}, Lax/x4/b;->a()Lax/G4/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Lax/G4/f;->l(Ljava/lang/String;)Lax/G4/C;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lax/G4/q0;->q:Lax/G4/q0;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lax/G4/C;->d(Lax/G4/q0;)Lax/G4/C;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lax/G4/s0;->d0:Lax/G4/s0;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lax/G4/C;->e(Lax/G4/s0;)Lax/G4/C;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lax/G4/C;->c()Lax/p4/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lax/p4/i;->b()Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_22
    .catch Lax/p4/j; {:try_start_6 .. :try_end_22} :catch_23

    .line 35
    return-object p1

    .line 36
    :catch_23
    move-exception p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    return-object p3
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

.method A0(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/k;->m:Ljava/lang/String;

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

.method public B(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method B0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/k;->n:Z

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

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 6
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
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_99

    .line 6
    .line 7
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p2}, Lax/u3/b;->c(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/k;->a()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_7c

    .line 19
    .line 20
    check-cast p1, Lax/c3/m;

    .line 21
    .line 22
    :try_start_15
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_20

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    goto :goto_24

    .line 31
    :catch_1e
    move-exception p1

    .line 32
    goto :goto_75

    .line 33
    :cond_20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_24
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/x4/b;->a()Lax/G4/f;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lax/G4/f;->n(Ljava/lang/String;)Lax/G4/L;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_33
    invoke-virtual {p1}, Lax/G4/L;->b()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_5f

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5f

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lax/G4/P;

    .line 73
    .line 74
    invoke-virtual {v1}, Lax/G4/P;->b()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-nez v2, :cond_56

    .line 79
    .line 80
    invoke-virtual {v1}, Lax/G4/P;->c()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-nez v2, :cond_56

    .line 85
    .line 86
    goto :goto_3d

    .line 87
    :cond_56
    new-instance v2, Lax/c3/m;

    .line 88
    .line 89
    invoke-direct {v2, p0, v1}, Lax/c3/m;-><init>(Lcom/voxdon/xplorer/file/k;Lax/G4/P;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_3d

    .line 96
    :cond_5f
    invoke-virtual {p1}, Lax/G4/L;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_66

    .line 101
    .line 102
    return-object p2

    .line 103
    :cond_66
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 104
    .line 105
    invoke-virtual {v0}, Lax/x4/b;->a()Lax/G4/f;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1}, Lax/G4/L;->a()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, p1}, Lax/G4/f;->p(Ljava/lang/String;)Lax/G4/L;

    .line 114
    .line 115
    .line 116
    move-result-object p1
    :try_end_74
    .catch Lax/p4/j; {:try_start_15 .. :try_end_74} :catch_1e

    .line 117
    goto :goto_33

    .line 118
    :goto_75
    const-string p2, "listChildren"

    .line 119
    .line 120
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    throw p1

    .line 125
    :cond_7c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const-string p2, "NOT CONNECT CALL LISTCHILDREN"

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 144
    .line 145
    .line 146
    new-instance p1, Lax/b3/h;

    .line 147
    .line 148
    const-string p2, "Not connected to server"

    .line 149
    .line 150
    invoke-direct {p1, p2}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_99
    new-instance p1, Lax/b3/t;

    .line 155
    .line 156
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 157
    .line 158
    .line 159
    throw p1
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
.end method

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-static {p3}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    const-wide/32 v0, 0x400000

    .line 13
    .line 14
    .line 15
    cmp-long p1, p4, v0

    .line 16
    .line 17
    if-ltz p1, :cond_29

    .line 18
    .line 19
    const-wide/16 v0, -0x1

    .line 20
    .line 21
    cmp-long p1, p4, v0

    .line 22
    .line 23
    if-nez p1, :cond_19

    .line 24
    .line 25
    goto :goto_29

    .line 26
    :cond_19
    iget-object v1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v0, p0

    .line 30
    move-object v2, p2

    .line 31
    move-wide v3, p4

    .line 32
    move-object/from16 v5, p6

    .line 33
    .line 34
    move-object/from16 v8, p9

    .line 35
    .line 36
    move-object/from16 v9, p10

    .line 37
    .line 38
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/k;->o0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    :goto_29
    iget-object v1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v0, p0

    .line 46
    move-object v2, p2

    .line 47
    move-wide v3, p4

    .line 48
    move-object/from16 v5, p6

    .line 49
    .line 50
    move-object/from16 v8, p9

    .line 51
    .line 52
    move-object/from16 v9, p10

    .line 53
    .line 54
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/k;->D0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V

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
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string p3, "moveFile"

    .line 2
    .line 3
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lax/u3/b;->a(Z)V

    .line 8
    .line 9
    .line 10
    :try_start_9
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 15
    .line 16
    invoke-virtual {v2}, Lax/x4/b;->a()Lax/G4/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {v2, p1, p2}, Lax/G4/f;->r(Ljava/lang/String;Ljava/lang/String;)Lax/G4/Z;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_32

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/G4/Z;->a()Lax/G4/P;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_32

    .line 39
    .line 40
    if-eqz p4, :cond_31

    .line 41
    .line 42
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_2d
    move-exception p1

    .line 47
    goto :goto_3a

    .line 48
    :catch_2f
    move-exception p1

    .line 49
    goto :goto_45

    .line 50
    :cond_31
    return-void

    .line 51
    :cond_32
    new-instance p1, Lax/b3/j;

    .line 52
    .line 53
    const-string p2, "null result"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
    :try_end_3a
    .catch Lax/p4/j; {:try_start_9 .. :try_end_3a} :catch_2f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_3a} :catch_2d

    .line 59
    :goto_3a
    const-string p2, "dropbox move"

    .line 60
    .line 61
    invoke-static {p2, p1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Lax/b3/j;

    .line 65
    .line 66
    invoke-direct {p2, p3, p1}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw p2

    .line 70
    :goto_45
    invoke-direct {p0, p3, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 71
    .line 72
    .line 73
    move-result-object p1

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

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-static {p3}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    :try_start_7
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p3, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 13
    .line 14
    invoke-virtual {p3}, Lax/x4/b;->a()Lax/G4/f;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p3, p1, p2}, Lax/G4/f;->b(Ljava/lang/String;Ljava/lang/String;)Lax/G4/Z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2e

    .line 31
    .line 32
    invoke-virtual {p1}, Lax/G4/Z;->a()Lax/G4/P;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_2e

    .line 37
    .line 38
    if-eqz p4, :cond_2d

    .line 39
    .line 40
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_2b
    move-exception p1

    .line 45
    goto :goto_36

    .line 46
    :cond_2d
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/b3/j;

    .line 48
    .line 49
    const-string p2, "Dropbox copy returns null entry"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    :try_end_36
    .catch Lax/p4/j; {:try_start_7 .. :try_end_36} :catch_2b

    .line 55
    :goto_36
    const-string p2, "copyFile"

    .line 56
    .line 57
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

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
    .registers 3

    .line 1
    const/4 p1, -0x1

    return p1
.end method

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/k;->q:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_11

    .line 12
    .line 13
    invoke-static {p1}, Lax/c3/B;->Y(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_11
    const/4 p1, 0x0

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method public I(Lcom/voxdon/xplorer/file/n;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/b;->a()Lax/G4/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lax/G4/f;->f(Ljava/lang/String;)Lax/G4/j;
    :try_end_d
    .catch Lax/p4/j; {:try_start_0 .. :try_end_d} :catch_10
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_e
    move-exception v0

    .line 16
    goto :goto_12

    .line 17
    :catch_10
    move-exception p1

    .line 18
    goto :goto_46

    .line 19
    :goto_12
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
    const-string v2, "Dropbox Delete"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v3, "path:"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lax/b3/j;

    .line 66
    .line 67
    invoke-direct {p1, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :goto_46
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    const-string v0, "deleteFile"

    .line 75
    .line 76
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    throw p1
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

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "dropbox getinputstream : "

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/k;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_b0

    .line 8
    .line 9
    :try_start_8
    iget-object v1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lax/x4/b;->a()Lax/G4/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Lax/G4/f;->h(Ljava/lang/String;)Lax/G4/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v4, p2, v2

    .line 26
    .line 27
    if-lez v4, :cond_26

    .line 28
    .line 29
    invoke-virtual {v1, p2, p3}, Lax/x4/c;->b(J)Lax/x4/c;

    .line 30
    .line 31
    .line 32
    goto :goto_26

    .line 33
    :catch_20
    move-exception p2

    .line 34
    goto :goto_2f

    .line 35
    :catch_22
    move-exception p1

    .line 36
    goto :goto_74

    .line 37
    :catch_24
    move-exception p1

    .line 38
    goto :goto_8c

    .line 39
    :cond_26
    :goto_26
    invoke-virtual {v1}, Lax/G4/n;->c()Lax/p4/i;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Lax/p4/i;->b()Ljava/io/InputStream;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_2e
    .catch Lax/p4/f; {:try_start_8 .. :try_end_2e} :catch_24
    .catch Lax/p4/j; {:try_start_8 .. :try_end_2e} :catch_22
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_2e} :catch_20

    .line 47
    return-object p1

    .line 48
    :goto_2f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    const-string v0, "dropbox path problem"

    .line 57
    .line 58
    invoke-virtual {p3, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v1, "path:"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p3, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lax/b3/j;

    .line 91
    .line 92
    new-instance p3, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v0, "dropbox getInputStream : "

    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-direct {p1, p3, p2}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_74
    new-instance p2, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    throw p1

    .line 141
    :goto_8c
    new-instance p2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lax/p4/f;->b()Lax/p4/s;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string p3, " ; "

    .line 157
    .line 158
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    throw p1

    .line 177
    :cond_b0
    new-instance p1, Lax/b3/h;

    .line 178
    .line 179
    const-string p2, "Not connected : dropbox"

    .line 180
    .line 181
    invoke-direct {p1, p2}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1
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
.end method

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 13

    .line 1
    iget-boolean p2, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 2
    .line 3
    if-nez p2, :cond_116

    .line 4
    .line 5
    new-instance p2, Lax/c3/c0;

    .line 6
    .line 7
    sget-object v0, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 8
    .line 9
    invoke-direct {p2, v0}, Lax/c3/c0;-><init>(Lax/Q2/f;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "DropboxPrefs"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v4, "version_"

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const-string v4, "credential_"

    .line 49
    .line 50
    const-string v5, "access_token_"

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    if-nez v2, :cond_65

    .line 54
    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {v1, p2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v1, v0, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_ac

    .line 102
    :cond_65
    invoke-static {}, Lax/Y2/a;->a()Lax/Y2/a;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v7, v0}, Lax/Y2/a;->b(Lax/Q2/f;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    new-instance v8, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v1, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {p2, v2, v7, v5}, Lax/c3/c0;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {}, Lax/Y2/a;->a()Lax/Y2/a;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v7, v0}, Lax/Y2/a;->b(Lax/Q2/f;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v7, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-interface {v1, v4, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {p2, v2, v0, v4}, Lax/c3/c0;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object p2, v5

    .line 173
    :goto_ac
    new-instance v2, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v4, "app_rootspaceid_"

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    new-instance v4, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const-string v5, "app_userootspace_"

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/k;->A0(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/k;->B0(Z)V

    .line 227
    .line 228
    .line 229
    if-eqz v0, :cond_f1

    .line 230
    .line 231
    :try_start_e6
    sget-object v1, Lax/u4/a;->f:Lax/t4/b;

    .line 232
    .line 233
    invoke-virtual {v1, v0}, Lax/t4/b;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Lax/u4/a;
    :try_end_ee
    .catch Lax/t4/a; {:try_start_e6 .. :try_end_ee} :catch_f0

    .line 238
    .line 239
    move-object v6, v0

    .line 240
    goto :goto_f1

    .line 241
    :catch_f0
    nop

    .line 242
    :cond_f1
    :goto_f1
    iput-object p3, p0, Lcom/voxdon/xplorer/file/k;->j:Lcom/voxdon/xplorer/file/c$a;

    .line 243
    .line 244
    invoke-interface {p3}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 245
    .line 246
    .line 247
    if-nez p2, :cond_10c

    .line 248
    .line 249
    if-nez v6, :cond_10c

    .line 250
    .line 251
    if-nez p1, :cond_100

    .line 252
    .line 253
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/file/k;->w0(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_116

    .line 257
    :cond_100
    invoke-static {p1}, Lcom/voxdon/xplorer/file/k;->C0(Landroid/app/Activity;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 262
    .line 263
    if-nez p1, :cond_116

    .line 264
    .line 265
    invoke-direct {p0, v3}, Lcom/voxdon/xplorer/file/k;->w0(Z)V

    .line 266
    .line 267
    .line 268
    goto :goto_116

    .line 269
    :cond_10c
    new-instance p3, Lcom/voxdon/xplorer/file/k$c;

    .line 270
    .line 271
    invoke-direct {p3, p0, p1, p2, v6}, Lcom/voxdon/xplorer/file/k$c;-><init>(Lcom/voxdon/xplorer/file/k;Landroid/app/Activity;Ljava/lang/String;Lax/u4/a;)V

    .line 272
    .line 273
    .line 274
    new-array p1, v3, [Ljava/lang/Void;

    .line 275
    .line 276
    invoke-virtual {p3, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 277
    .line 278
    .line 279
    :cond_116
    :goto_116
    return-void
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

.method public L()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 3
    .line 4
    invoke-virtual {v1}, Lax/x4/b;->a()Lax/G4/f;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, p1, v0}, Lax/G4/f;->d(Ljava/lang/String;Z)Lax/G4/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1b

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/G4/e;->a()Lax/G4/x;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_15
    .catch Lax/p4/j; {:try_start_1 .. :try_end_15} :catch_19

    .line 22
    if-eqz p1, :cond_1b

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :catch_19
    move-exception p1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    return v0

    .line 29
    :goto_1c
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    return v0
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

.method public N(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->l(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public O()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/k;->I(Lcom/voxdon/xplorer/file/n;)V

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

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public Y()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public a()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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
    .registers 1

    .line 1
    return-void
.end method

.method public g0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public h0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p7

    .line 5
    const-wide/32 v0, 0x400000

    .line 6
    .line 7
    .line 8
    cmp-long p1, p4, v0

    .line 9
    .line 10
    if-ltz p1, :cond_11

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    cmp-long p1, p4, v0

    .line 15
    .line 16
    if-nez p1, :cond_14

    .line 17
    .line 18
    :cond_11
    move-object p1, p0

    .line 19
    move-object p3, p2

    .line 20
    goto :goto_1d

    .line 21
    :cond_14
    move-object p3, p2

    .line 22
    iget-object p2, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 23
    .line 24
    const/4 p8, 0x1

    .line 25
    move-object p1, p0

    .line 26
    invoke-direct/range {p1 .. p10}, Lcom/voxdon/xplorer/file/k;->o0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1d
    iget-object p2, p1, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 31
    .line 32
    const/4 p8, 0x1

    .line 33
    invoke-direct/range {p1 .. p10}, Lcom/voxdon/xplorer/file/k;->D0(Lax/x4/a;Lax/c3/G;JLjava/lang/Long;Ljava/lang/String;ZLax/u3/c;Lax/g3/i;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method declared-synchronized m(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    if-nez p4, :cond_e

    .line 3
    .line 4
    :try_start_3
    invoke-virtual/range {p0 .. p6}, Lcom/voxdon/xplorer/file/m;->o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_9

    .line 5
    .line 6
    .line 7
    move-object p1, p0

    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_9
    move-exception v0

    .line 11
    move-object p1, p0

    .line 12
    :goto_b
    move-object p2, v0

    .line 13
    goto/16 :goto_b5

    .line 14
    .line 15
    :cond_e
    move p4, p3

    .line 16
    move-object p3, p2

    .line 17
    move-object p2, p1

    .line 18
    move-object p1, p0

    .line 19
    :try_start_12
    const-string p6, "/"

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p6

    .line 29
    if-eqz p6, :cond_27

    .line 30
    .line 31
    const-string p2, ""

    .line 32
    .line 33
    goto :goto_2b

    .line 34
    :catchall_21
    move-exception v0

    .line 35
    goto :goto_b

    .line 36
    :catch_23
    move-exception v0

    .line 37
    move-object p2, v0

    .line 38
    goto/16 :goto_ab

    .line 39
    .line 40
    :cond_27
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_2b
    iget-object p6, p1, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 45
    .line 46
    invoke-virtual {p6}, Lax/x4/b;->a()Lax/G4/f;

    .line 47
    .line 48
    .line 49
    move-result-object p6

    .line 50
    invoke-virtual {p6, p3}, Lax/G4/f;->t(Ljava/lang/String;)Lax/G4/i0;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-static {}, Lax/G4/f0;->a()Lax/G4/f0$a;

    .line 55
    .line 56
    .line 57
    move-result-object p6

    .line 58
    invoke-virtual {p6, p2}, Lax/G4/f0$a;->d(Ljava/lang/String;)Lax/G4/f0$a;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const-wide/16 v0, 0x3e8

    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object p6

    .line 68
    invoke-virtual {p2, p6}, Lax/G4/f0$a;->c(Ljava/lang/Long;)Lax/G4/f0$a;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object p6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p2, p6}, Lax/G4/f0$a;->b(Ljava/lang/Boolean;)Lax/G4/f0$a;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p2}, Lax/G4/f0$a;->a()Lax/G4/f0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p3, p2}, Lax/G4/i0;->b(Lax/G4/f0;)Lax/G4/i0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Lax/G4/i0;->a()Lax/G4/j0;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    new-instance p3, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    if-eqz p2, :cond_9f

    .line 95
    .line 96
    invoke-virtual {p2}, Lax/G4/j0;->a()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p6

    .line 100
    if-eqz p6, :cond_9f

    .line 101
    .line 102
    invoke-virtual {p2}, Lax/G4/j0;->a()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :cond_6d
    :goto_6d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p6

    .line 114
    if-eqz p6, :cond_9f

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p6

    .line 120
    check-cast p6, Lax/G4/e0;

    .line 121
    .line 122
    invoke-virtual {p6}, Lax/G4/e0;->a()Lax/G4/Q;

    .line 123
    .line 124
    .line 125
    move-result-object p6

    .line 126
    if-eqz p6, :cond_6d

    .line 127
    .line 128
    invoke-virtual {p6}, Lax/G4/Q;->c()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_6d

    .line 133
    .line 134
    invoke-virtual {p6}, Lax/G4/Q;->b()Lax/G4/P;

    .line 135
    .line 136
    .line 137
    move-result-object p6

    .line 138
    invoke-virtual {p6}, Lax/G4/P;->b()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-nez v0, :cond_96

    .line 143
    .line 144
    invoke-virtual {p6}, Lax/G4/P;->c()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-nez v0, :cond_96

    .line 149
    .line 150
    goto :goto_6d

    .line 151
    :cond_96
    new-instance v0, Lax/c3/m;

    .line 152
    .line 153
    invoke-direct {v0, p0, p6}, Lax/c3/m;-><init>(Lcom/voxdon/xplorer/file/k;Lax/G4/P;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_6d

    .line 160
    :cond_9f
    const/4 p2, 0x0

    .line 161
    const/4 p6, 0x0

    .line 162
    invoke-static {p3, p2, p4, p6}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    const/4 p3, 0x1

    .line 167
    invoke-interface {p5, p2, p3}, Lax/g3/h;->Y(Ljava/util/List;Z)V
    :try_end_a9
    .catch Lax/p4/j; {:try_start_12 .. :try_end_a9} :catch_23
    .catchall {:try_start_12 .. :try_end_a9} :catchall_21

    .line 168
    .line 169
    .line 170
    monitor-exit p0

    .line 171
    return-void

    .line 172
    :goto_ab
    :try_start_ab
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 173
    .line 174
    .line 175
    const-string p3, "doSearch"

    .line 176
    .line 177
    invoke-direct {p0, p3, p2}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    throw p2

    .line 182
    :goto_b5
    monitor-exit p0
    :try_end_b6
    .catchall {:try_start_ab .. :try_end_b6} :catchall_21

    .line 183
    throw p2
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

.method public x0()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/k;->l:Z

    .line 7
    .line 8
    :cond_7
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
.end method

.method public y()Lax/c3/k0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/b;->b()Lax/M4/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/M4/b;->b()Lax/M4/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/M4/h;->a()Lax/M4/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lax/M4/g;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_28

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/M4/g;->c()Lax/M4/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lax/M4/e;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0}, Lax/M4/h;->b()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    new-instance v0, Lax/c3/k0;

    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3, v4}, Lax/c3/k0;-><init>(JJ)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :catch_26
    move-exception v0

    .line 40
    goto :goto_46

    .line 41
    :cond_28
    invoke-virtual {v1}, Lax/M4/g;->g()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_44

    .line 46
    .line 47
    invoke-virtual {v1}, Lax/M4/g;->d()Lax/M4/j;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lax/M4/j;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-virtual {v1}, Lax/M4/g;->d()Lax/M4/j;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/M4/j;->b()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    new-instance v4, Lax/c3/k0;

    .line 64
    .line 65
    invoke-direct {v4, v2, v3, v0, v1}, Lax/c3/k0;-><init>(JJ)V
    :try_end_43
    .catch Lax/p4/j; {:try_start_0 .. :try_end_43} :catch_26

    .line 66
    .line 67
    .line 68
    return-object v4

    .line 69
    :cond_44
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :goto_46
    const-string v1, "storagespace"

    .line 72
    .line 73
    invoke-direct {p0, v1, v0}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    throw v0
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

.method public y0()V
    .registers 7

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3e

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/k;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3e

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->i:Lcom/voxdon/xplorer/file/k$b;

    .line 10
    .line 11
    if-eqz v0, :cond_18

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/u3/q;->m()Lax/u3/q$f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lax/u3/q$f;->d0:Lax/u3/q$f;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3e

    .line 24
    .line 25
    :cond_18
    invoke-static {}, Lcom/dropbox/core/android/a;->a()Lax/u4/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_33

    .line 32
    .line 33
    new-instance v3, Lcom/voxdon/xplorer/file/k$b;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, p0, Lcom/voxdon/xplorer/file/k;->j:Lcom/voxdon/xplorer/file/c$a;

    .line 40
    .line 41
    invoke-direct {v3, v4, p0, v5, v0}, Lcom/voxdon/xplorer/file/k$b;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/k;Lcom/voxdon/xplorer/file/c$a;Lax/u4/a;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, p0, Lcom/voxdon/xplorer/file/k;->i:Lcom/voxdon/xplorer/file/k$b;

    .line 45
    .line 46
    new-array v0, v2, [Ljava/lang/Void;

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 49
    .line 50
    .line 51
    goto :goto_38

    .line 52
    :cond_33
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->j:Lcom/voxdon/xplorer/file/c$a;

    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_38
    iput-boolean v2, p0, Lcom/voxdon/xplorer/file/k;->k:Z

    .line 58
    .line 59
    iput-boolean v2, p0, Lcom/voxdon/xplorer/file/k;->l:Z

    .line 60
    .line 61
    iput-object v1, p0, Lcom/voxdon/xplorer/file/k;->j:Lcom/voxdon/xplorer/file/c$a;

    .line 62
    .line 63
    :cond_3e
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_e

    .line 8
    .line 9
    new-instance p1, Lax/c3/m;

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, Lax/c3/m;-><init>(Lcom/voxdon/xplorer/file/k;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/k;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_58

    .line 20
    .line 21
    :try_start_14
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/x4/b;->a()Lax/G4/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, Lax/G4/f;->j(Ljava/lang/String;)Lax/G4/P;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lax/c3/m;

    .line 32
    .line 33
    invoke-direct {v1, p0, v0}, Lax/c3/m;-><init>(Lcom/voxdon/xplorer/file/k;Lax/G4/P;)V
    :try_end_23
    .catch Lax/p4/j; {:try_start_14 .. :try_end_23} :catch_26
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_23} :catch_24

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :catch_24
    move-exception p1

    .line 38
    goto :goto_28

    .line 39
    :catch_26
    move-exception v0

    .line 40
    goto :goto_32

    .line 41
    :goto_28
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    const-string v0, "dropbox getfileinfo"

    .line 45
    .line 46
    invoke-static {v0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    throw p1

    .line 51
    :goto_32
    instance-of v1, v0, Lax/G4/B;

    .line 52
    .line 53
    if-eqz v1, :cond_51

    .line 54
    .line 55
    move-object v1, v0

    .line 56
    check-cast v1, Lax/G4/B;

    .line 57
    .line 58
    iget-object v2, v1, Lax/G4/B;->d0:Lax/G4/A;

    .line 59
    .line 60
    invoke-virtual {v2}, Lax/G4/A;->c()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_51

    .line 65
    .line 66
    iget-object v1, v1, Lax/G4/B;->d0:Lax/G4/A;

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/G4/A;->b()Lax/G4/M;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Lax/G4/M;->c:Lax/G4/M;

    .line 73
    .line 74
    if-ne v1, v2, :cond_51

    .line 75
    .line 76
    new-instance v0, Lax/c3/m;

    .line 77
    .line 78
    invoke-direct {v0, p0, p1}, Lax/c3/m;-><init>(Lcom/voxdon/xplorer/file/k;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_51
    const-string p1, "getFileInfo"

    .line 83
    .line 84
    invoke-direct {p0, p1, v0}, Lcom/voxdon/xplorer/file/k;->p0(Ljava/lang/String;Lax/p4/j;)Lax/b3/j;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_58
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v0, "NOT CONNECT CALL GET FILE INFO"

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lax/b3/h;

    .line 111
    .line 112
    const-string v0, "Not connected to server"

    .line 113
    .line 114
    invoke-direct {p1, v0}, Lax/b3/h;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
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

.method z0(Lax/x4/a;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/k;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_20

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->m:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_20

    .line 12
    .line 13
    sget-object v0, Lcom/voxdon/xplorer/file/k;->o:Ljava/util/logging/Logger;

    .line 14
    .line 15
    const-string v1, "Use dropbox team space"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/file/k;->m:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0}, Lax/C4/a;->c(Ljava/lang/String;)Lax/C4/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lax/x4/a;->d(Lax/C4/a;)Lax/x4/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    sget-object v0, Lcom/voxdon/xplorer/file/k;->o:Ljava/util/logging/Logger;

    .line 34
    .line 35
    const-string v1, "Use dropbox user space"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/voxdon/xplorer/file/k;->h:Lax/x4/a;

    .line 41
    .line 42
    return-void
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
