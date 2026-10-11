.class public Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;
.super Lcom/box/androidsdk/content/requests/BoxRequest$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/requests/BoxRequestDownload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DownloadRequestHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/box/androidsdk/content/requests/BoxRequest$a<",
        "Lcom/box/androidsdk/content/requests/BoxRequestDownload;",
        ">;"
    }
.end annotation


# instance fields
.field protected d:I

.field protected e:I


# direct methods
.method public constructor <init>(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/requests/BoxRequest$a;-><init>(Lcom/box/androidsdk/content/requests/BoxRequest;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->d:I

    .line 6
    .line 7
    const/16 p1, 0x3e8

    .line 8
    .line 9
    iput p1, p0, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->e:I

    .line 10
    .line 11
    return-void
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
.method public bridge synthetic h(Ljava/lang/Class;Lcom/box/androidsdk/content/requests/b;)Lcom/box/androidsdk/content/models/BoxObject;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->k(Ljava/lang/Class;Lcom/box/androidsdk/content/requests/b;)Lcom/box/androidsdk/content/models/BoxDownload;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method protected j(Lcom/box/androidsdk/content/models/BoxDownload;)Ljava/io/OutputStream;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mFileOutputStream:Ljava/io/OutputStream;

    .line 7
    .line 8
    if-nez v1, :cond_24

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxDownload;->D()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1a

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxDownload;->D()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 25
    .line 26
    .line 27
    :cond_1a
    new-instance v0, Ljava/io/FileOutputStream;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxDownload;->D()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_24
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 38
    .line 39
    iget-object p1, v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->mFileOutputStream:Ljava/io/OutputStream;

    .line 40
    .line 41
    return-object p1
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

.method public k(Ljava/lang/Class;Lcom/box/androidsdk/content/requests/b;)Lcom/box/androidsdk/content/models/BoxDownload;
    .registers 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;,
            Lcom/box/androidsdk/content/BoxException;
        }
    .end annotation

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v10, p2

    .line 4
    .line 5
    const-string v11, "error closing outputstream"

    .line 6
    .line 7
    const-string v12, "error closing inputstream"

    .line 8
    .line 9
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v13

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_21

    .line 30
    .line 31
    invoke-virtual {v2, v10}, Lcom/box/androidsdk/content/requests/BoxRequest$a;->b(Lcom/box/androidsdk/content/requests/b;)V

    .line 32
    .line 33
    .line 34
    :cond_21
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->f()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/16 v1, 0x1ad

    .line 39
    .line 40
    if-ne v0, v1, :cond_30

    .line 41
    .line 42
    invoke-virtual {v2, v10}, Lcom/box/androidsdk/content/requests/BoxRequest$a;->i(Lcom/box/androidsdk/content/requests/b;)Lcom/box/androidsdk/content/models/BoxObject;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/box/androidsdk/content/models/BoxDownload;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_30
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->f()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/16 v1, 0xca

    .line 54
    .line 55
    if-ne v0, v1, :cond_83

    .line 56
    .line 57
    :try_start_38
    iget v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->d:I

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    if-ge v0, v1, :cond_4a

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    add-int/2addr v0, v1

    .line 64
    iput v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->d:I

    .line 65
    .line 66
    invoke-static {v10, v1}, Lcom/box/androidsdk/content/requests/BoxRequest$a;->c(Lcom/box/androidsdk/content/requests/b;I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->e:I

    .line 71
    .line 72
    goto :goto_5e

    .line 73
    :catch_48
    move-exception v0

    .line 74
    goto :goto_79

    .line 75
    :cond_4a
    iget v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->e:I

    .line 76
    .line 77
    const v1, 0x15f90

    .line 78
    .line 79
    .line 80
    if-ge v0, v1, :cond_6f

    .line 81
    .line 82
    int-to-double v0, v0

    .line 83
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    .line 88
    .line 89
    add-double/2addr v3, v5

    .line 90
    mul-double v0, v0, v3

    .line 91
    .line 92
    double-to-int v0, v0

    .line 93
    iput v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->e:I

    .line 94
    .line 95
    :goto_5e
    iget v0, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->e:I

    .line 96
    .line 97
    int-to-long v0, v0

    .line 98
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 102
    .line 103
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequest;->x()Lcom/box/androidsdk/content/models/BoxObject;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lcom/box/androidsdk/content/models/BoxDownload;

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_6f
    new-instance v0, Lcom/box/androidsdk/content/BoxException$MaxAttemptsExceeded;

    .line 113
    .line 114
    const-string v1, "Max wait time exceeded."

    .line 115
    .line 116
    iget v3, v2, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->d:I

    .line 117
    .line 118
    invoke-direct {v0, v1, v3}, Lcom/box/androidsdk/content/BoxException$MaxAttemptsExceeded;-><init>(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    throw v0
    :try_end_79
    .catch Ljava/lang/InterruptedException; {:try_start_38 .. :try_end_79} :catch_48

    .line 122
    :goto_79
    new-instance v1, Lcom/box/androidsdk/content/BoxException;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {v1, v0, v10}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Lcom/box/androidsdk/content/requests/b;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    :cond_83
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->f()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/16 v1, 0xc8

    .line 137
    .line 138
    if-eq v0, v1, :cond_a5

    .line 139
    .line 140
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->f()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/16 v1, 0xce

    .line 145
    .line 146
    if-ne v0, v1, :cond_94

    .line 147
    .line 148
    goto :goto_a5

    .line 149
    :cond_94
    new-instance v14, Lcom/box/androidsdk/content/models/BoxDownload;

    .line 150
    .line 151
    const/16 v20, 0x0

    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    const-wide/16 v16, 0x0

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const/16 v19, 0x0

    .line 161
    .line 162
    invoke-direct/range {v14 .. v21}, Lcom/box/androidsdk/content/models/BoxDownload;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v14

    .line 166
    :cond_a5
    :goto_a5
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v1, "Content-Length"

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v3, "Content-Disposition"

    .line 181
    .line 182
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    :try_start_b9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v0
    :try_end_bd
    .catch Ljava/lang/Exception; {:try_start_b9 .. :try_end_bd} :catch_bf

    .line 190
    :goto_bd
    move-wide v4, v0

    .line 191
    goto :goto_c2

    .line 192
    :catch_bf
    const-wide/16 v0, -0x1

    .line 193
    .line 194
    goto :goto_bd

    .line 195
    :goto_c2
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, "Content-Range"

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    const-string v1, "Date"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->e()Ljava/net/HttpURLConnection;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v1, "Expiration"

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    new-instance v1, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler$1;

    .line 226
    .line 227
    invoke-direct/range {v1 .. v9}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler$1;-><init>(Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 231
    .line 232
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    :try_start_ed
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 239
    .line 240
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 241
    .line 242
    iget-object v0, v0, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

    .line 243
    .line 244
    if-eqz v0, :cond_121

    .line 245
    .line 246
    new-instance v6, Lax/H3/f;

    .line 247
    .line 248
    invoke-virtual {v2, v1}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->j(Lcom/box/androidsdk/content/models/BoxDownload;)Ljava/io/OutputStream;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v7, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 253
    .line 254
    check-cast v7, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 255
    .line 256
    iget-object v7, v7, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

    .line 257
    .line 258
    invoke-direct {v6, v0, v7, v4, v5}, Lax/H3/f;-><init>(Ljava/io/OutputStream;Lax/F3/b;J)V
    :try_end_104
    .catch Ljava/lang/Exception; {:try_start_ed .. :try_end_104} :catch_11e
    .catchall {:try_start_ed .. :try_end_104} :catchall_11a

    .line 259
    .line 260
    .line 261
    :try_start_104
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 262
    .line 263
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 264
    .line 265
    iget-object v0, v0, Lcom/box/androidsdk/content/requests/BoxRequest;->q:Lax/F3/b;

    .line 266
    .line 267
    const-wide/16 v7, 0x0

    .line 268
    .line 269
    invoke-interface {v0, v7, v8, v4, v5}, Lax/F3/b;->a(JJ)V
    :try_end_10f
    .catch Ljava/lang/Exception; {:try_start_104 .. :try_end_10f} :catch_116
    .catchall {:try_start_104 .. :try_end_10f} :catchall_111

    .line 270
    .line 271
    .line 272
    move-object v3, v6

    .line 273
    goto :goto_126

    .line 274
    :catchall_111
    move-exception v0

    .line 275
    move-object v1, v0

    .line 276
    move-object v3, v6

    .line 277
    goto/16 :goto_1c0

    .line 278
    .line 279
    :catch_116
    move-exception v0

    .line 280
    move-object v1, v0

    .line 281
    move-object v3, v6

    .line 282
    goto :goto_181

    .line 283
    :catchall_11a
    move-exception v0

    .line 284
    move-object v1, v0

    .line 285
    goto/16 :goto_1c0

    .line 286
    .line 287
    :catch_11e
    move-exception v0

    .line 288
    move-object v1, v0

    .line 289
    goto :goto_181

    .line 290
    :cond_121
    :try_start_121
    invoke-virtual {v2, v1}, Lcom/box/androidsdk/content/requests/BoxRequestDownload$DownloadRequestHandler;->j(Lcom/box/androidsdk/content/models/BoxDownload;)Ljava/io/OutputStream;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    move-object v3, v0

    .line 295
    :goto_126
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 296
    .line 297
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 298
    .line 299
    invoke-static {v0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->E(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_13c

    .line 308
    .line 309
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->a()Ljava/io/InputStream;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {v0, v3}, Lcom/box/androidsdk/content/utils/SdkUtils;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 314
    .line 315
    .line 316
    goto :goto_152

    .line 317
    :cond_13c
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->a()Ljava/io/InputStream;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0, v3}, Lcom/box/androidsdk/content/utils/SdkUtils;->e(Ljava/io/InputStream;Ljava/io/OutputStream;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iget-object v4, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 326
    .line 327
    check-cast v4, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 328
    .line 329
    invoke-static {v4}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->E(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v4
    :try_end_150
    .catch Ljava/lang/Exception; {:try_start_121 .. :try_end_150} :catch_11e
    .catchall {:try_start_121 .. :try_end_150} :catchall_11a

    .line 337
    if-eqz v4, :cond_171

    .line 338
    .line 339
    :goto_152
    :try_start_152
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->a()Ljava/io/InputStream;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_159
    .catch Ljava/io/IOException; {:try_start_152 .. :try_end_159} :catch_15a

    .line 344
    .line 345
    .line 346
    goto :goto_15e

    .line 347
    :catch_15a
    move-exception v0

    .line 348
    invoke-static {v12, v0}, Lax/H3/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    :goto_15e
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 352
    .line 353
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->G()Ljava/io/OutputStream;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    if-nez v0, :cond_170

    .line 360
    .line 361
    :try_start_168
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_16b
    .catch Ljava/io/IOException; {:try_start_168 .. :try_end_16b} :catch_16c

    .line 362
    .line 363
    .line 364
    goto :goto_170

    .line 365
    :catch_16c
    move-exception v0

    .line 366
    invoke-static {v11, v0}, Lax/H3/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    :cond_170
    :goto_170
    return-object v1

    .line 370
    :cond_171
    :try_start_171
    new-instance v1, Lcom/box/androidsdk/content/BoxException$CorruptedContentException;

    .line 371
    .line 372
    const-string v4, "Sha1 checks failed"

    .line 373
    .line 374
    iget-object v5, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 375
    .line 376
    check-cast v5, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 377
    .line 378
    invoke-static {v5}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->E(Lcom/box/androidsdk/content/requests/BoxRequestDownload;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-direct {v1, v4, v5, v0}, Lcom/box/androidsdk/content/BoxException$CorruptedContentException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v1
    :try_end_181
    .catch Ljava/lang/Exception; {:try_start_171 .. :try_end_181} :catch_11e
    .catchall {:try_start_171 .. :try_end_181} :catchall_11a

    .line 386
    :goto_181
    :try_start_181
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 387
    .line 388
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 389
    .line 390
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequest;->m()Ljava/net/Socket;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v0, :cond_19f

    .line 395
    .line 396
    if-eqz v13, :cond_19f

    .line 397
    .line 398
    const-string v4, "gzip"

    .line 399
    .line 400
    invoke-virtual {v13, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 401
    .line 402
    .line 403
    move-result v4
    :try_end_193
    .catchall {:try_start_181 .. :try_end_193} :catchall_11a

    .line 404
    if-eqz v4, :cond_19f

    .line 405
    .line 406
    :try_start_195
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_198
    .catch Ljava/lang/Exception; {:try_start_195 .. :try_end_198} :catch_199
    .catchall {:try_start_195 .. :try_end_198} :catchall_11a

    .line 407
    .line 408
    .line 409
    goto :goto_19f

    .line 410
    :catch_199
    move-exception v0

    .line 411
    :try_start_19a
    const-string v4, "error closing socket"

    .line 412
    .line 413
    invoke-static {v4, v0}, Lax/H3/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 414
    .line 415
    .line 416
    :cond_19f
    :goto_19f
    instance-of v0, v1, Lcom/box/androidsdk/content/BoxException;

    .line 417
    .line 418
    if-nez v0, :cond_1bd

    .line 419
    .line 420
    instance-of v0, v1, Ljavax/net/ssl/SSLException;

    .line 421
    .line 422
    if-eqz v0, :cond_1b3

    .line 423
    .line 424
    new-instance v0, Lcom/box/androidsdk/content/BoxException$DownloadSSLException;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    check-cast v1, Ljavax/net/ssl/SSLException;

    .line 431
    .line 432
    invoke-direct {v0, v4, v1}, Lcom/box/androidsdk/content/BoxException$DownloadSSLException;-><init>(Ljava/lang/String;Ljavax/net/ssl/SSLException;)V

    .line 433
    .line 434
    .line 435
    throw v0

    .line 436
    :cond_1b3
    new-instance v0, Lcom/box/androidsdk/content/BoxException;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-direct {v0, v4, v1}, Lcom/box/androidsdk/content/BoxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 443
    .line 444
    .line 445
    throw v0

    .line 446
    :cond_1bd
    check-cast v1, Lcom/box/androidsdk/content/BoxException;

    .line 447
    .line 448
    throw v1
    :try_end_1c0
    .catchall {:try_start_19a .. :try_end_1c0} :catchall_11a

    .line 449
    :goto_1c0
    :try_start_1c0
    invoke-virtual {v10}, Lcom/box/androidsdk/content/requests/b;->a()Ljava/io/InputStream;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1c7
    .catch Ljava/io/IOException; {:try_start_1c0 .. :try_end_1c7} :catch_1c8

    .line 454
    .line 455
    .line 456
    goto :goto_1cc

    .line 457
    :catch_1c8
    move-exception v0

    .line 458
    invoke-static {v12, v0}, Lax/H3/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 459
    .line 460
    .line 461
    :goto_1cc
    iget-object v0, v2, Lcom/box/androidsdk/content/requests/BoxRequest$a;->a:Lcom/box/androidsdk/content/requests/BoxRequest;

    .line 462
    .line 463
    check-cast v0, Lcom/box/androidsdk/content/requests/BoxRequestDownload;

    .line 464
    .line 465
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequestDownload;->G()Ljava/io/OutputStream;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-nez v0, :cond_1de

    .line 470
    .line 471
    :try_start_1d6
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1d9
    .catch Ljava/io/IOException; {:try_start_1d6 .. :try_end_1d9} :catch_1da

    .line 472
    .line 473
    .line 474
    goto :goto_1de

    .line 475
    :catch_1da
    move-exception v0

    .line 476
    invoke-static {v11, v0}, Lax/H3/b;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    :cond_1de
    :goto_1de
    throw v1
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
