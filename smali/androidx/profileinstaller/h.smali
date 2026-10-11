.class public final Landroidx/profileinstaller/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/profileinstaller/h$c;,
        Landroidx/profileinstaller/h$b;,
        Landroidx/profileinstaller/h$a;
    }
.end annotation


# static fields
.field private static final a:Lax/D/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/D/d<",
            "Landroidx/profileinstaller/h$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/Object;

.field private static c:Landroidx/profileinstaller/h$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    invoke-static {}, Lax/D/d;->G()Lax/D/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Landroidx/profileinstaller/h;->a:Lax/D/d;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/profileinstaller/h;->b:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    sput-object v0, Landroidx/profileinstaller/h;->c:Landroidx/profileinstaller/h$c;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static a(Landroid/content/Context;)J
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x21

    .line 12
    .line 13
    if-lt v1, v2, :cond_15

    .line 14
    .line 15
    invoke-static {v0, p0}, Landroidx/profileinstaller/h$a;->a(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_15
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 32
    .line 33
    return-wide v0
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

.method private static b(IZZZ)Landroidx/profileinstaller/h$c;
    .registers 5

    .line 1
    new-instance v0, Landroidx/profileinstaller/h$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/profileinstaller/h$c;-><init>(IZZZ)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/profileinstaller/h;->c:Landroidx/profileinstaller/h$c;

    .line 7
    .line 8
    sget-object p0, Landroidx/profileinstaller/h;->a:Lax/D/d;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lax/D/d;->C(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    sget-object p0, Landroidx/profileinstaller/h;->c:Landroidx/profileinstaller/h$c;

    .line 14
    .line 15
    return-object p0
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
.end method

.method static c(Landroid/content/Context;Z)Landroidx/profileinstaller/h$c;
    .registers 21

    .line 1
    if-nez p1, :cond_7

    .line 2
    .line 3
    sget-object v0, Landroidx/profileinstaller/h;->c:Landroidx/profileinstaller/h$c;

    .line 4
    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    sget-object v1, Landroidx/profileinstaller/h;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    if-nez p1, :cond_15

    .line 12
    .line 13
    :try_start_c
    sget-object v0, Landroidx/profileinstaller/h;->c:Landroidx/profileinstaller/h$c;

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    monitor-exit v1
    :try_end_11
    .catchall {:try_start_c .. :try_end_11} :catchall_12

    .line 18
    return-object v0

    .line 19
    :catchall_12
    move-exception v0

    .line 20
    goto/16 :goto_114

    .line 21
    .line 22
    :cond_15
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    :try_start_19
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v6, "dexopt/baseline.prof"

    .line 31
    .line 32
    invoke-virtual {v0, v6}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object v6
    :try_end_23
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_23} :catch_3f
    .catchall {:try_start_19 .. :try_end_23} :catchall_12

    .line 36
    :try_start_23
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7
    :try_end_27
    .catchall {:try_start_23 .. :try_end_27} :catchall_32

    .line 40
    cmp-long v0, v7, v2

    .line 41
    .line 42
    if-lez v0, :cond_2d

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    const/4 v0, 0x0

    .line 47
    :goto_2e
    :try_start_2e
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_31
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_31} :catch_3f
    .catchall {:try_start_2e .. :try_end_31} :catchall_12

    .line 48
    .line 49
    .line 50
    goto :goto_40

    .line 51
    :catchall_32
    move-exception v0

    .line 52
    move-object v7, v0

    .line 53
    if-eqz v6, :cond_3e

    .line 54
    .line 55
    :try_start_36
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_39
    .catchall {:try_start_36 .. :try_end_39} :catchall_3a

    .line 56
    .line 57
    .line 58
    goto :goto_3e

    .line 59
    :catchall_3a
    move-exception v0

    .line 60
    :try_start_3b
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_3e
    :goto_3e
    throw v7
    :try_end_3f
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_3f} :catch_3f
    .catchall {:try_start_3b .. :try_end_3f} :catchall_12

    .line 64
    :catch_3f
    const/4 v0, 0x0

    .line 65
    :goto_40
    :try_start_40
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    const/16 v7, 0x1c

    .line 68
    .line 69
    if-lt v6, v7, :cond_10c

    .line 70
    .line 71
    const/16 v7, 0x1e

    .line 72
    .line 73
    if-ne v6, v7, :cond_4c

    .line 74
    .line 75
    goto/16 :goto_10c

    .line 76
    .line 77
    :cond_4c
    new-instance v6, Ljava/io/File;

    .line 78
    .line 79
    new-instance v7, Ljava/io/File;

    .line 80
    .line 81
    const-string v8, "/data/misc/profiles/ref/"

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v8, "primary.prof"

    .line 91
    .line 92
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_6e

    .line 104
    .line 105
    cmp-long v6, v7, v2

    .line 106
    .line 107
    if-lez v6, :cond_6e

    .line 108
    .line 109
    const/4 v6, 0x1

    .line 110
    goto :goto_6f

    .line 111
    :cond_6e
    const/4 v6, 0x0

    .line 112
    :goto_6f
    new-instance v9, Ljava/io/File;

    .line 113
    .line 114
    new-instance v10, Ljava/io/File;

    .line 115
    .line 116
    const-string v11, "/data/misc/profiles/cur/0/"

    .line 117
    .line 118
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-direct {v10, v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v11, "primary.prof"

    .line 126
    .line 127
    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 131
    .line 132
    .line 133
    move-result-wide v17

    .line 134
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 135
    .line 136
    .line 137
    move-result v9
    :try_end_89
    .catchall {:try_start_40 .. :try_end_89} :catchall_12

    .line 138
    if-eqz v9, :cond_91

    .line 139
    .line 140
    cmp-long v9, v17, v2

    .line 141
    .line 142
    if-lez v9, :cond_91

    .line 143
    .line 144
    const/4 v2, 0x1

    .line 145
    goto :goto_92

    .line 146
    :cond_91
    const/4 v2, 0x0

    .line 147
    :goto_92
    :try_start_92
    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/h;->a(Landroid/content/Context;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v15
    :try_end_96
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_92 .. :try_end_96} :catch_104
    .catchall {:try_start_92 .. :try_end_96} :catchall_12

    .line 151
    :try_start_96
    new-instance v3, Ljava/io/File;

    .line 152
    .line 153
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    const-string v10, "profileInstalled"

    .line 158
    .line 159
    invoke-direct {v3, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 163
    .line 164
    .line 165
    move-result v9
    :try_end_a5
    .catchall {:try_start_96 .. :try_end_a5} :catchall_12

    .line 166
    if-eqz v9, :cond_b4

    .line 167
    .line 168
    :try_start_a7
    invoke-static {v3}, Landroidx/profileinstaller/h$b;->a(Ljava/io/File;)Landroidx/profileinstaller/h$b;

    .line 169
    .line 170
    .line 171
    move-result-object v9
    :try_end_ab
    .catch Ljava/io/IOException; {:try_start_a7 .. :try_end_ab} :catch_ac
    .catchall {:try_start_a7 .. :try_end_ab} :catchall_12

    .line 172
    goto :goto_b5

    .line 173
    :catch_ac
    const/high16 v3, 0x20000

    .line 174
    .line 175
    :try_start_ae
    invoke-static {v3, v6, v2, v0}, Landroidx/profileinstaller/h;->b(IZZZ)Landroidx/profileinstaller/h$c;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    monitor-exit v1

    .line 180
    return-object v0

    .line 181
    :cond_b4
    const/4 v9, 0x0

    .line 182
    :goto_b5
    const/4 v10, 0x2

    .line 183
    if-eqz v9, :cond_c5

    .line 184
    .line 185
    iget-wide v11, v9, Landroidx/profileinstaller/h$b;->c:J

    .line 186
    .line 187
    cmp-long v13, v11, v15

    .line 188
    .line 189
    if-nez v13, :cond_c5

    .line 190
    .line 191
    iget v11, v9, Landroidx/profileinstaller/h$b;->b:I

    .line 192
    .line 193
    if-ne v11, v10, :cond_c3

    .line 194
    .line 195
    goto :goto_c5

    .line 196
    :cond_c3
    move v5, v11

    .line 197
    goto :goto_d1

    .line 198
    :cond_c5
    :goto_c5
    if-nez v0, :cond_ca

    .line 199
    .line 200
    const/high16 v5, 0x50000

    .line 201
    .line 202
    goto :goto_d1

    .line 203
    :cond_ca
    if-eqz v6, :cond_ce

    .line 204
    .line 205
    const/4 v5, 0x1

    .line 206
    goto :goto_d1

    .line 207
    :cond_ce
    if-eqz v2, :cond_d1

    .line 208
    .line 209
    const/4 v5, 0x2

    .line 210
    :cond_d1
    :goto_d1
    if-eqz p1, :cond_d8

    .line 211
    .line 212
    if-eqz v2, :cond_d8

    .line 213
    .line 214
    if-eq v5, v4, :cond_d8

    .line 215
    .line 216
    const/4 v5, 0x2

    .line 217
    :cond_d8
    if-eqz v9, :cond_e9

    .line 218
    .line 219
    iget v11, v9, Landroidx/profileinstaller/h$b;->b:I

    .line 220
    .line 221
    if-ne v11, v10, :cond_e9

    .line 222
    .line 223
    if-ne v5, v4, :cond_e9

    .line 224
    .line 225
    iget-wide v10, v9, Landroidx/profileinstaller/h$b;->d:J

    .line 226
    .line 227
    cmp-long v4, v7, v10

    .line 228
    .line 229
    if-gez v4, :cond_e9

    .line 230
    .line 231
    const/4 v5, 0x3

    .line 232
    const/4 v14, 0x3

    .line 233
    goto :goto_ea

    .line 234
    :cond_e9
    move v14, v5

    .line 235
    :goto_ea
    new-instance v12, Landroidx/profileinstaller/h$b;

    .line 236
    .line 237
    const/4 v13, 0x1

    .line 238
    invoke-direct/range {v12 .. v18}, Landroidx/profileinstaller/h$b;-><init>(IIJJ)V

    .line 239
    .line 240
    .line 241
    if-eqz v9, :cond_f8

    .line 242
    .line 243
    invoke-virtual {v9, v12}, Landroidx/profileinstaller/h$b;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v4
    :try_end_f6
    .catchall {:try_start_ae .. :try_end_f6} :catchall_12

    .line 247
    if-nez v4, :cond_fe

    .line 248
    .line 249
    :cond_f8
    :try_start_f8
    invoke-virtual {v12, v3}, Landroidx/profileinstaller/h$b;->b(Ljava/io/File;)V
    :try_end_fb
    .catch Ljava/io/IOException; {:try_start_f8 .. :try_end_fb} :catch_fc
    .catchall {:try_start_f8 .. :try_end_fb} :catchall_12

    .line 250
    .line 251
    .line 252
    goto :goto_fe

    .line 253
    :catch_fc
    const/high16 v14, 0x30000

    .line 254
    .line 255
    :cond_fe
    :goto_fe
    :try_start_fe
    invoke-static {v14, v6, v2, v0}, Landroidx/profileinstaller/h;->b(IZZZ)Landroidx/profileinstaller/h$c;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    monitor-exit v1

    .line 260
    return-object v0

    .line 261
    :catch_104
    const/high16 v3, 0x10000

    .line 262
    .line 263
    invoke-static {v3, v6, v2, v0}, Landroidx/profileinstaller/h;->b(IZZZ)Landroidx/profileinstaller/h$c;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    monitor-exit v1

    .line 268
    return-object v0

    .line 269
    :cond_10c
    :goto_10c
    const/high16 v2, 0x40000

    .line 270
    .line 271
    invoke-static {v2, v5, v5, v0}, Landroidx/profileinstaller/h;->b(IZZZ)Landroidx/profileinstaller/h$c;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    monitor-exit v1

    .line 276
    return-object v0

    .line 277
    :goto_114
    monitor-exit v1
    :try_end_115
    .catchall {:try_start_fe .. :try_end_115} :catchall_12

    .line 278
    throw v0
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
