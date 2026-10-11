.class Lax/W2/C$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/C;


# direct methods
.method public constructor <init>(Lax/W2/C;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/C$d;->w([Ljava/lang/Void;)Ljava/lang/Integer;

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

.method protected o()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/W2/j;->g0()V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/C$d;->x(Ljava/lang/Integer;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Integer;
    .registers 13

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_2
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 8
    .line 9
    invoke-static {v2}, Lax/W2/C;->z0(Lax/W2/C;)Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, Lax/o3/b;->l(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 21
    .line 22
    invoke-static {v0}, Lax/W2/C;->A0(Lax/W2/C;)Lcom/voxdon/xplorer/file/o;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 27
    .line 28
    invoke-static {v2}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v3, v0

    .line 41
    check-cast v3, Lcom/voxdon/xplorer/file/y;

    .line 42
    .line 43
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 44
    .line 45
    invoke-static {v0}, Lax/W2/C;->A0(Lax/W2/C;)Lcom/voxdon/xplorer/file/o;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 50
    .line 51
    invoke-static {v0}, Lax/W2/C;->B0(Lax/W2/C;)Lcom/voxdon/xplorer/file/o;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 56
    .line 57
    invoke-static {v0}, Lax/W2/C;->z0(Lax/W2/C;)Lcom/voxdon/xplorer/file/n;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v0, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 62
    .line 63
    invoke-virtual {v0}, Lax/W2/j;->V()Lax/g3/i;

    .line 64
    .line 65
    .line 66
    move-result-object v7
    :try_end_42
    .catch Lax/b3/j; {:try_start_2 .. :try_end_42} :catch_f6
    .catch Lax/b3/a; {:try_start_2 .. :try_end_42} :catch_f4
    .catchall {:try_start_2 .. :try_end_42} :catchall_f0

    .line 67
    move-object v6, p0

    .line 68
    :try_start_43
    invoke-virtual/range {v2 .. v7}, Lcom/voxdon/xplorer/file/o;->t0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    const-wide/16 v7, 0x3e8

    .line 76
    .line 77
    rem-long v7, v4, v7

    .line 78
    .line 79
    const-wide/16 v9, 0x7d0

    .line 80
    .line 81
    add-long/2addr v4, v9

    .line 82
    sub-long/2addr v4, v7

    .line 83
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 84
    .line 85
    invoke-static {v0}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0, v4, v5}, Ljava/io/File;->setLastModified(J)Z

    .line 90
    .line 91
    .line 92
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 93
    .line 94
    invoke-static {v0}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 99
    .line 100
    .line 101
    move-result-wide v9
    :try_end_65
    .catch Lax/b3/j; {:try_start_43 .. :try_end_65} :catch_74
    .catch Lax/b3/a; {:try_start_43 .. :try_end_65} :catch_f9
    .catchall {:try_start_43 .. :try_end_65} :catchall_70

    .line 102
    cmp-long v0, v4, v9

    .line 103
    .line 104
    if-eqz v0, :cond_b2

    .line 105
    .line 106
    const-wide/16 v4, 0x802

    .line 107
    .line 108
    sub-long/2addr v4, v7

    .line 109
    :try_start_6c
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6f
    .catch Ljava/lang/InterruptedException; {:try_start_6c .. :try_end_6f} :catch_77
    .catch Lax/b3/j; {:try_start_6c .. :try_end_6f} :catch_74
    .catch Lax/b3/a; {:try_start_6c .. :try_end_6f} :catch_f9
    .catchall {:try_start_6c .. :try_end_6f} :catchall_70

    .line 110
    .line 111
    .line 112
    goto :goto_77

    .line 113
    :catchall_70
    move-exception v0

    .line 114
    :goto_71
    move-object p1, v0

    .line 115
    goto/16 :goto_149

    .line 116
    .line 117
    :catch_74
    move-exception v0

    .line 118
    goto/16 :goto_109

    .line 119
    .line 120
    :catch_77
    :goto_77
    const/4 v2, 0x0

    .line 121
    :try_start_78
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 122
    .line 123
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 124
    .line 125
    invoke-static {v0}, Lax/W2/C;->y0(Lax/W2/C;)Ljava/io/File;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v5, "rw"

    .line 130
    .line 131
    invoke-direct {v4, v0, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_85
    .catch Ljava/io/IOException; {:try_start_78 .. :try_end_85} :catch_a5
    .catchall {:try_start_78 .. :try_end_85} :catchall_a3

    .line 132
    .line 133
    .line 134
    :try_start_85
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    const-wide/16 v9, 0x1

    .line 139
    .line 140
    add-long/2addr v9, v7

    .line 141
    invoke-virtual {v4, v9, v10}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v7, v8}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_99
    .catch Ljava/io/IOException; {:try_start_85 .. :try_end_99} :catch_a0
    .catchall {:try_start_85 .. :try_end_99} :catchall_9d

    .line 152
    .line 153
    .line 154
    :try_start_99
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9c
    .catch Ljava/io/IOException; {:try_start_99 .. :try_end_9c} :catch_b2
    .catch Lax/b3/j; {:try_start_99 .. :try_end_9c} :catch_74
    .catch Lax/b3/a; {:try_start_99 .. :try_end_9c} :catch_f9
    .catchall {:try_start_99 .. :try_end_9c} :catchall_70

    .line 155
    .line 156
    .line 157
    goto :goto_b2

    .line 158
    :catchall_9d
    move-exception v0

    .line 159
    move-object v2, v4

    .line 160
    goto :goto_a7

    .line 161
    :catch_a0
    nop

    .line 162
    move-object v2, v4

    .line 163
    goto :goto_ad

    .line 164
    :catchall_a3
    move-exception v0

    .line 165
    goto :goto_a7

    .line 166
    :catch_a5
    nop

    .line 167
    goto :goto_ad

    .line 168
    :goto_a7
    if-eqz v2, :cond_ac

    .line 169
    .line 170
    :try_start_a9
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_ac
    .catch Ljava/io/IOException; {:try_start_a9 .. :try_end_ac} :catch_ac
    .catch Lax/b3/j; {:try_start_a9 .. :try_end_ac} :catch_74
    .catch Lax/b3/a; {:try_start_a9 .. :try_end_ac} :catch_f9
    .catchall {:try_start_a9 .. :try_end_ac} :catchall_70

    .line 171
    .line 172
    .line 173
    :catch_ac
    :cond_ac
    :try_start_ac
    throw v0
    :try_end_ad
    .catch Lax/b3/j; {:try_start_ac .. :try_end_ad} :catch_74
    .catch Lax/b3/a; {:try_start_ac .. :try_end_ad} :catch_f9
    .catchall {:try_start_ac .. :try_end_ad} :catchall_70

    .line 174
    :goto_ad
    if-eqz v2, :cond_b2

    .line 175
    .line 176
    :try_start_af
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_b2
    .catch Ljava/io/IOException; {:try_start_af .. :try_end_b2} :catch_b2
    .catch Lax/b3/j; {:try_start_af .. :try_end_b2} :catch_74
    .catch Lax/b3/a; {:try_start_af .. :try_end_b2} :catch_f9
    .catchall {:try_start_af .. :try_end_b2} :catchall_70

    .line 177
    .line 178
    .line 179
    :catch_b2
    :cond_b2
    :goto_b2
    :try_start_b2
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/y;->v1()V

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v2, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 187
    .line 188
    invoke-static {v2}, Lax/W2/C;->z0(Lax/W2/C;)Lcom/voxdon/xplorer/file/n;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/y;->q()J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    invoke-virtual {v0, v2, v3, v4}, Lax/o3/b;->t(Ljava/lang/String;J)V

    .line 201
    .line 202
    .line 203
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 204
    .line 205
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v2, Lax/W2/v$b;->q:Lax/W2/v$b;

    .line 210
    .line 211
    invoke-virtual {v0, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lax/W2/j;->l0(Z)V

    .line 217
    .line 218
    .line 219
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object p1
    :try_end_de
    .catch Lax/b3/j; {:try_start_b2 .. :try_end_de} :catch_74
    .catch Lax/b3/a; {:try_start_b2 .. :try_end_de} :catch_f9
    .catchall {:try_start_b2 .. :try_end_de} :catchall_70

    .line 223
    :goto_de
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-object v1, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 228
    .line 229
    invoke-static {v1}, Lax/W2/C;->z0(Lax/W2/C;)Lcom/voxdon/xplorer/file/n;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v0, v1}, Lax/o3/b;->m(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object p1

    .line 241
    :catchall_f0
    move-exception v0

    .line 242
    move-object v6, p0

    .line 243
    goto/16 :goto_71

    .line 244
    .line 245
    :catch_f4
    move-object v6, p0

    .line 246
    goto :goto_f9

    .line 247
    :catch_f6
    move-exception v0

    .line 248
    move-object v6, p0

    .line 249
    goto :goto_109

    .line 250
    :catch_f9
    :goto_f9
    :try_start_f9
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 251
    .line 252
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    sget-object v2, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 257
    .line 258
    invoke-virtual {v0, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 259
    .line 260
    .line 261
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    goto :goto_de

    .line 266
    :goto_109
    iget-object v2, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 267
    .line 268
    invoke-virtual {v2, v0}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    const/16 v2, 0x32

    .line 273
    .line 274
    const-wide/16 v3, 0x0

    .line 275
    .line 276
    if-ne v0, v2, :cond_125

    .line 277
    .line 278
    iget-object p1, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 279
    .line 280
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p1, v3, v4}, Lax/W2/v;->c0(J)V

    .line 285
    .line 286
    .line 287
    const/16 p1, 0xb

    .line 288
    .line 289
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    goto :goto_de

    .line 294
    :cond_125
    const/16 v2, 0xaa

    .line 295
    .line 296
    if-ne v0, v2, :cond_139

    .line 297
    .line 298
    iget-object p1, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 299
    .line 300
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p1, v3, v4}, Lax/W2/v;->c0(J)V

    .line 305
    .line 306
    .line 307
    const/16 p1, 0xc

    .line 308
    .line 309
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    goto :goto_de

    .line 314
    :cond_139
    iget-object v0, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 315
    .line 316
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sget-object v2, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 321
    .line 322
    invoke-virtual {v0, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 323
    .line 324
    .line 325
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p1
    :try_end_148
    .catchall {:try_start_f9 .. :try_end_148} :catchall_70

    .line 329
    goto :goto_de

    .line 330
    :goto_149
    invoke-static {}, Lax/o3/b;->j()Lax/o3/b;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iget-object v1, v6, Lax/W2/C$d;->h:Lax/W2/C;

    .line 335
    .line 336
    invoke-static {v1}, Lax/W2/C;->z0(Lax/W2/C;)Lcom/voxdon/xplorer/file/n;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v0, v1}, Lax/o3/b;->m(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw p1
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

.method protected x(Ljava/lang/Integer;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    if-ne v0, v1, :cond_11

    .line 8
    .line 9
    iget-object p1, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 10
    .line 11
    const v0, 0x7f13014c

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lax/W2/C;->C0(Lax/W2/C;I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v0, 0xc

    .line 23
    .line 24
    if-ne p1, v0, :cond_22

    .line 25
    .line 26
    iget-object p1, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 27
    .line 28
    const v0, 0x7f13013d

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Lax/W2/C;->C0(Lax/W2/C;I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lax/W2/C$d;->h:Lax/W2/C;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 38
    .line 39
    .line 40
    return-void
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
