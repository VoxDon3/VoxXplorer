.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "m"
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
.field private h:Z

.field final synthetic i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->d0:Lax/u3/q$e;

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

.method private A(I)Z
    .registers 2

    .line 1
    if-nez p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private C(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)I
    .registers 13

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->Q(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_b
    new-instance v1, Lax/q3/a;

    .line 13
    .line 14
    new-instance v2, Ljava/io/InputStreamReader;

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    invoke-virtual {p1, p2, v3, v4}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 23
    .line 24
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {v2, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Lax/q3/a;-><init>(Ljava/io/Reader;)V
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_21} :catch_110
    .catch Lax/b3/j; {:try_start_b .. :try_end_21} :catch_110
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_21} :catch_10e
    .catchall {:try_start_b .. :try_end_21} :catchall_10c

    .line 32
    .line 33
    .line 34
    :try_start_21
    invoke-static {}, Lax/X2/J;->h()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 p2, 0x0

    .line 39
    if-eqz p1, :cond_2b

    .line 40
    .line 41
    const/16 p1, 0x1f40

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 p1, 0x0

    .line 45
    :goto_2c
    new-instance v0, Ljava/lang/StringBuffer;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    :goto_35
    invoke-virtual {v1}, Lax/q3/a;->e()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-nez v6, :cond_92

    .line 59
    .line 60
    if-eqz v2, :cond_5e

    .line 61
    .line 62
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {v2, v3, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_51
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_51} :catch_5a
    .catch Lax/b3/j; {:try_start_21 .. :try_end_51} :catch_5a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_21 .. :try_end_51} :catch_56
    .catchall {:try_start_21 .. :try_end_51} :catchall_52

    .line 80
    .line 81
    .line 82
    goto :goto_5e

    .line 83
    :catchall_52
    move-exception p1

    .line 84
    move-object v0, v1

    .line 85
    goto/16 :goto_12e

    .line 86
    .line 87
    :catch_56
    move-exception p1

    .line 88
    move-object v0, v1

    .line 89
    goto/16 :goto_112

    .line 90
    .line 91
    :catch_5a
    nop

    .line 92
    move-object v0, v1

    .line 93
    goto/16 :goto_134

    .line 94
    .line 95
    :cond_5e
    :goto_5e
    const-string p1, ""

    .line 96
    .line 97
    if-eqz v5, :cond_72

    .line 98
    .line 99
    :try_start_62
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 100
    .line 101
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 108
    .line 109
    invoke-direct {v2, v3, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_72
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_8e

    .line 126
    .line 127
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 128
    .line 129
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 134
    .line 135
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 136
    .line 137
    invoke-direct {v2, v3, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8e
    .catch Ljava/io/IOException; {:try_start_62 .. :try_end_8e} :catch_5a
    .catch Lax/b3/j; {:try_start_62 .. :try_end_8e} :catch_5a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_62 .. :try_end_8e} :catch_56
    .catchall {:try_start_62 .. :try_end_8e} :catchall_52

    .line 141
    .line 142
    .line 143
    :cond_8e
    :try_start_8e
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_91
    .catch Ljava/io/IOException; {:try_start_8e .. :try_end_91} :catch_91

    .line 144
    .line 145
    .line 146
    :catch_91
    return p2

    .line 147
    :cond_92
    :try_start_92
    invoke-virtual {v1}, Lax/q3/a;->a()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v2
    :try_end_9a
    .catch Ljava/io/IOException; {:try_start_92 .. :try_end_9a} :catch_5a
    .catch Lax/b3/j; {:try_start_92 .. :try_end_9a} :catch_5a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_92 .. :try_end_9a} :catch_56
    .catchall {:try_start_92 .. :try_end_9a} :catchall_52

    .line 155
    const v7, 0x30d40

    .line 156
    .line 157
    .line 158
    const/4 v8, -0x3

    .line 159
    if-le v2, v7, :cond_a4

    .line 160
    .line 161
    :try_start_a0
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_a3
    .catch Ljava/io/IOException; {:try_start_a0 .. :try_end_a3} :catch_a3

    .line 162
    .line 163
    .line 164
    :catch_a3
    return v8

    .line 165
    :cond_a4
    const/4 v2, 0x0

    .line 166
    :goto_a5
    :try_start_a5
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-ge v2, v7, :cond_c2

    .line 171
    .line 172
    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-direct {p0, v7}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->A(I)Z

    .line 177
    .line 178
    .line 179
    move-result v7
    :try_end_b3
    .catch Ljava/io/IOException; {:try_start_a5 .. :try_end_b3} :catch_5a
    .catch Lax/b3/j; {:try_start_a5 .. :try_end_b3} :catch_5a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a5 .. :try_end_b3} :catch_56
    .catchall {:try_start_a5 .. :try_end_b3} :catchall_52

    .line 180
    if-eqz v7, :cond_bf

    .line 181
    .line 182
    add-int/lit8 v4, v4, 0x1

    .line 183
    .line 184
    const/16 v7, 0xa

    .line 185
    .line 186
    if-lt v4, v7, :cond_bf

    .line 187
    .line 188
    :try_start_bb
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_be
    .catch Ljava/io/IOException; {:try_start_bb .. :try_end_be} :catch_be

    .line 189
    .line 190
    .line 191
    :catch_be
    return v8

    .line 192
    :cond_bf
    add-int/lit8 v2, v2, 0x1

    .line 193
    .line 194
    goto :goto_a5

    .line 195
    :cond_c2
    const/4 v2, 0x1

    .line 196
    if-nez v3, :cond_cc

    .line 197
    .line 198
    :try_start_c5
    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 202
    .line 203
    .line 204
    goto :goto_109

    .line 205
    :cond_cc
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->h0()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    sub-int/2addr v7, v2

    .line 210
    if-ge v3, v7, :cond_ee

    .line 211
    .line 212
    if-eqz p1, :cond_e1

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    add-int/2addr v7, v8

    .line 223
    if-le v7, p1, :cond_e1

    .line 224
    .line 225
    goto :goto_ee

    .line 226
    :cond_e1
    iget-object v7, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 227
    .line 228
    invoke-static {v7}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 236
    .line 237
    .line 238
    goto :goto_109

    .line 239
    :cond_ee
    :goto_ee
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 240
    .line 241
    invoke-static {v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    new-instance v7, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 246
    .line 247
    iget-object v8, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-direct {v7, v8, v9}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_108
    .catch Ljava/io/IOException; {:try_start_c5 .. :try_end_108} :catch_5a
    .catch Lax/b3/j; {:try_start_c5 .. :try_end_108} :catch_5a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c5 .. :try_end_108} :catch_56
    .catchall {:try_start_c5 .. :try_end_108} :catchall_52

    .line 263
    .line 264
    .line 265
    const/4 v3, 0x0

    .line 266
    :goto_109
    add-int/2addr v3, v2

    .line 267
    goto/16 :goto_35

    .line 268
    .line 269
    :catchall_10c
    move-exception p1

    .line 270
    goto :goto_12e

    .line 271
    :catch_10e
    move-exception p1

    .line 272
    goto :goto_112

    .line 273
    :catch_110
    nop

    .line 274
    goto :goto_134

    .line 275
    :goto_112
    :try_start_112
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    const-string v1, "TEXT EDITOR OOM"

    .line 280
    .line 281
    invoke-virtual {p2, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_127
    .catchall {:try_start_112 .. :try_end_127} :catchall_10c

    .line 294
    .line 295
    .line 296
    if-eqz v0, :cond_12c

    .line 297
    .line 298
    :try_start_129
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_12c
    .catch Ljava/io/IOException; {:try_start_129 .. :try_end_12c} :catch_12c

    .line 299
    .line 300
    .line 301
    :catch_12c
    :cond_12c
    const/4 p1, -0x1

    .line 302
    return p1

    .line 303
    :goto_12e
    if-eqz v0, :cond_133

    .line 304
    .line 305
    :try_start_130
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_133
    .catch Ljava/io/IOException; {:try_start_130 .. :try_end_133} :catch_133

    .line 306
    .line 307
    .line 308
    :catch_133
    :cond_133
    throw p1

    .line 309
    :goto_134
    if-eqz v0, :cond_139

    .line 310
    .line 311
    :try_start_136
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_139
    .catch Ljava/io/IOException; {:try_start_136 .. :try_end_139} :catch_139

    .line 312
    .line 313
    .line 314
    :catch_139
    :cond_139
    const/16 p1, -0xa

    .line 315
    .line 316
    return p1
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

.method private D(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)I
    .registers 9

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->Q(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_b
    new-instance v1, Lax/q3/a;

    .line 13
    .line 14
    new-instance v2, Ljava/io/InputStreamReader;

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    invoke-virtual {p1, p2, v3, v4}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 23
    .line 24
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {v2, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Lax/q3/a;-><init>(Ljava/io/Reader;)V
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_21} :catch_b1
    .catch Lax/b3/j; {:try_start_b .. :try_end_21} :catch_b1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_21} :catch_af
    .catchall {:try_start_b .. :try_end_21} :catchall_ad

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    const/4 p2, 0x0

    .line 36
    const/4 v0, 0x0

    .line 37
    :goto_24
    :try_start_24
    invoke-virtual {v1}, Lax/q3/a;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_28} :catch_47
    .catch Lax/b3/j; {:try_start_24 .. :try_end_28} :catch_47
    .catch Ljava/lang/OutOfMemoryError; {:try_start_24 .. :try_end_28} :catch_43
    .catchall {:try_start_24 .. :try_end_28} :catchall_3f

    .line 41
    if-nez v2, :cond_6b

    .line 42
    .line 43
    const-string v0, ""

    .line 44
    .line 45
    if-eqz p2, :cond_4b

    .line 46
    .line 47
    :try_start_2e
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 48
    .line 49
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-instance v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 56
    .line 57
    invoke-direct {v2, v3, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_4b

    .line 64
    :catchall_3f
    move-exception p1

    .line 65
    move-object v0, v1

    .line 66
    goto/16 :goto_cf

    .line 67
    .line 68
    :catch_43
    move-exception p1

    .line 69
    move-object v0, v1

    .line 70
    goto/16 :goto_b3

    .line 71
    .line 72
    :catch_47
    nop

    .line 73
    move-object v0, v1

    .line 74
    goto/16 :goto_d5

    .line 75
    .line 76
    :cond_4b
    :goto_4b
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 77
    .line 78
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-nez p2, :cond_67

    .line 87
    .line 88
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 89
    .line 90
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 95
    .line 96
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 97
    .line 98
    invoke-direct {v2, v3, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_67
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_67} :catch_47
    .catch Lax/b3/j; {:try_start_2e .. :try_end_67} :catch_47
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2e .. :try_end_67} :catch_43
    .catchall {:try_start_2e .. :try_end_67} :catchall_3f

    .line 102
    .line 103
    .line 104
    :cond_67
    :try_start_67
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_6a
    .catch Ljava/io/IOException; {:try_start_67 .. :try_end_6a} :catch_6a

    .line 105
    .line 106
    .line 107
    :catch_6a
    return p1

    .line 108
    :cond_6b
    :try_start_6b
    invoke-virtual {v1}, Lax/q3/a;->a()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v3
    :try_end_73
    .catch Ljava/io/IOException; {:try_start_6b .. :try_end_73} :catch_47
    .catch Lax/b3/j; {:try_start_6b .. :try_end_73} :catch_47
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6b .. :try_end_73} :catch_43
    .catchall {:try_start_6b .. :try_end_73} :catchall_3f

    .line 116
    const v4, 0x30d40

    .line 117
    .line 118
    .line 119
    const/4 v5, -0x3

    .line 120
    if-le v3, v4, :cond_7d

    .line 121
    .line 122
    :try_start_79
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_7c
    .catch Ljava/io/IOException; {:try_start_79 .. :try_end_7c} :catch_7c

    .line 123
    .line 124
    .line 125
    :catch_7c
    return v5

    .line 126
    :cond_7d
    const/4 v3, 0x0

    .line 127
    :goto_7e
    :try_start_7e
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-ge v3, v4, :cond_9b

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-direct {p0, v4}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->A(I)Z

    .line 138
    .line 139
    .line 140
    move-result v4
    :try_end_8c
    .catch Ljava/io/IOException; {:try_start_7e .. :try_end_8c} :catch_47
    .catch Lax/b3/j; {:try_start_7e .. :try_end_8c} :catch_47
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7e .. :try_end_8c} :catch_43
    .catchall {:try_start_7e .. :try_end_8c} :catchall_3f

    .line 141
    if-eqz v4, :cond_98

    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    const/16 v4, 0xa

    .line 146
    .line 147
    if-lt v0, v4, :cond_98

    .line 148
    .line 149
    :try_start_94
    invoke-virtual {v1}, Lax/q3/a;->close()V
    :try_end_97
    .catch Ljava/io/IOException; {:try_start_94 .. :try_end_97} :catch_97

    .line 150
    .line 151
    .line 152
    :catch_97
    return v5

    .line 153
    :cond_98
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_7e

    .line 156
    :cond_9b
    :try_start_9b
    iget-object v3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 157
    .line 158
    invoke-static {v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    new-instance v4, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 163
    .line 164
    iget-object v5, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 165
    .line 166
    invoke-direct {v4, v5, v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_ab
    .catch Ljava/io/IOException; {:try_start_9b .. :try_end_ab} :catch_47
    .catch Lax/b3/j; {:try_start_9b .. :try_end_ab} :catch_47
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9b .. :try_end_ab} :catch_43
    .catchall {:try_start_9b .. :try_end_ab} :catchall_3f

    .line 170
    .line 171
    .line 172
    goto/16 :goto_24

    .line 173
    .line 174
    :catchall_ad
    move-exception p1

    .line 175
    goto :goto_cf

    .line 176
    :catch_af
    move-exception p1

    .line 177
    goto :goto_b3

    .line 178
    :catch_b1
    nop

    .line 179
    goto :goto_d5

    .line 180
    :goto_b3
    :try_start_b3
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    const-string v1, "TEXT EDITOR OOM"

    .line 185
    .line 186
    invoke-virtual {p2, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_c8
    .catchall {:try_start_b3 .. :try_end_c8} :catchall_ad

    .line 199
    .line 200
    .line 201
    if-eqz v0, :cond_cd

    .line 202
    .line 203
    :try_start_ca
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_cd
    .catch Ljava/io/IOException; {:try_start_ca .. :try_end_cd} :catch_cd

    .line 204
    .line 205
    .line 206
    :catch_cd
    :cond_cd
    const/4 p1, -0x1

    .line 207
    return p1

    .line 208
    :goto_cf
    if-eqz v0, :cond_d4

    .line 209
    .line 210
    :try_start_d1
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_d4
    .catch Ljava/io/IOException; {:try_start_d1 .. :try_end_d4} :catch_d4

    .line 211
    .line 212
    .line 213
    :catch_d4
    :cond_d4
    throw p1

    .line 214
    :goto_d5
    if-eqz v0, :cond_da

    .line 215
    .line 216
    :try_start_d7
    invoke-virtual {v0}, Lax/q3/a;->close()V
    :try_end_da
    .catch Ljava/io/IOException; {:try_start_d7 .. :try_end_da} :catch_da

    .line 217
    .line 218
    .line 219
    :catch_da
    :cond_da
    const/16 p1, -0xa

    .line 220
    .line 221
    return p1
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


# virtual methods
.method protected B(Ljava/lang/Integer;)V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_11

    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->h:Z

    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->X(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/widget/ProgressBar;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_8c

    .line 34
    .line 35
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 36
    .line 37
    new-instance v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, p1, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->B0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 65
    .line 66
    sget-object v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->c0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 67
    .line 68
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->e0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_8b

    .line 78
    .line 79
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->f0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_8b

    .line 86
    .line 87
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "text_editor_open"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lax/Q2/a;->o(Ljava/lang/String;)Lax/Q2/a$d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->e0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "loc"

    .line 104
    .line 105
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->f0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "ext"

    .line 116
    .line 117
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->c0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, Lax/Q2/a$f;->a(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v1, "range"

    .line 132
    .line 133
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lax/Q2/a$d;->c()V

    .line 138
    .line 139
    .line 140
    :cond_8b
    return-void

    .line 141
    :cond_8c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const/4 v2, -0x1

    .line 146
    if-ne v0, v2, :cond_a5

    .line 147
    .line 148
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 149
    .line 150
    const v0, 0x7f13015f

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_a5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    const/4 v0, -0x3

    .line 171
    if-ne p1, v0, :cond_be

    .line 172
    .line 173
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 174
    .line 175
    const v0, 0x7f130151

    .line 176
    .line 177
    .line 178
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_be
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 192
    .line 193
    const v0, 0x7f13013e

    .line 194
    .line 195
    .line 196
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 201
    .line 202
    .line 203
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 206
    .line 207
    .line 208
    return-void
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

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->y([Ljava/lang/Void;)Ljava/lang/Integer;

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
    .registers 3

    .line 1
    invoke-super {p0}, Lax/u3/q;->o()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->h:Z

    .line 5
    .line 6
    if-nez v0, :cond_14

    .line 7
    .line 8
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->h:Z

    .line 20
    .line 21
    :cond_14
    return-void
.end method

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->B(Ljava/lang/Integer;)V

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

.method protected r()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->X(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroid/widget/ProgressBar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method w(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    invoke-virtual {p1, p2, v2, v3}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_c} :catch_75
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_1 .. :try_end_c} :catch_73
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_1 .. :try_end_c} :catch_71
    .catch Lax/b3/j; {:try_start_1 .. :try_end_c} :catch_6f
    .catchall {:try_start_1 .. :try_end_c} :catchall_6d

    .line 11
    .line 12
    .line 13
    :try_start_c
    new-instance p1, Lax/Rd/c;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lax/Rd/c;-><init>(Lax/Rd/a;)V

    .line 16
    .line 17
    .line 18
    const/16 p2, 0x1000

    .line 19
    .line 20
    new-array p2, p2, [B

    .line 21
    .line 22
    :cond_15
    invoke-virtual {v1, p2}, Ljava/io/InputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v0, v2, :cond_34

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {p1, p2, v2, v0}, Lax/Rd/c;->d([BII)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lax/Rd/c;->c()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_15

    .line 38
    .line 39
    goto :goto_34

    .line 40
    :catchall_27
    move-exception p1

    .line 41
    move-object v0, v1

    .line 42
    goto/16 :goto_b2

    .line 43
    .line 44
    :catch_2b
    move-exception p1

    .line 45
    :goto_2c
    move-object v0, v1

    .line 46
    goto :goto_76

    .line 47
    :catch_2e
    move-exception p1

    .line 48
    goto :goto_2c

    .line 49
    :catch_30
    move-exception p1

    .line 50
    goto :goto_2c

    .line 51
    :catch_32
    move-exception p1

    .line 52
    goto :goto_2c

    .line 53
    :cond_34
    :goto_34
    invoke-virtual {p1}, Lax/Rd/c;->a()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lax/Rd/c;->c()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_58

    .line 61
    .line 62
    const-string p2, "US-ASCII"

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_4f

    .line 69
    .line 70
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 71
    .line 72
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 77
    .line 78
    .line 79
    goto :goto_58

    .line 80
    :cond_4f
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 81
    .line 82
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    :try_end_58
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_58} :catch_32
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_c .. :try_end_58} :catch_30
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_c .. :try_end_58} :catch_2e
    .catch Lax/b3/j; {:try_start_c .. :try_end_58} :catch_2b
    .catchall {:try_start_c .. :try_end_58} :catchall_27

    .line 87
    .line 88
    .line 89
    :cond_58
    :goto_58
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-nez p1, :cond_69

    .line 96
    .line 97
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 98
    .line 99
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 104
    .line 105
    .line 106
    :cond_69
    :try_start_69
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6c
    .catch Ljava/io/IOException; {:try_start_69 .. :try_end_6c} :catch_8f

    .line 107
    .line 108
    .line 109
    goto :goto_8f

    .line 110
    :catchall_6d
    move-exception p1

    .line 111
    goto :goto_b2

    .line 112
    :catch_6f
    move-exception p1

    .line 113
    goto :goto_76

    .line 114
    :catch_71
    move-exception p1

    .line 115
    goto :goto_76

    .line 116
    :catch_73
    move-exception p1

    .line 117
    goto :goto_76

    .line 118
    :catch_75
    move-exception p1

    .line 119
    :goto_76
    :try_start_76
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_79
    .catchall {:try_start_76 .. :try_end_79} :catchall_6d

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-nez p1, :cond_8a

    .line 129
    .line 130
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 131
    .line 132
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 137
    .line 138
    .line 139
    :cond_8a
    if-eqz v0, :cond_8f

    .line 140
    .line 141
    :try_start_8c
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_8f
    .catch Ljava/io/IOException; {:try_start_8c .. :try_end_8f} :catch_8f

    .line 142
    .line 143
    .line 144
    :catch_8f
    :cond_8f
    :goto_8f
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g0()Ljava/util/logging/Logger;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance p2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v0, "DETECTED ENCODING : "

    .line 154
    .line 155
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 159
    .line 160
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :goto_b2
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 180
    .line 181
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    if-nez p2, :cond_c3

    .line 186
    .line 187
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 188
    .line 189
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {p2, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->U(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 194
    .line 195
    .line 196
    :cond_c3
    if-eqz v0, :cond_c8

    .line 197
    .line 198
    :try_start_c5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_c8
    .catch Ljava/io/IOException; {:try_start_c5 .. :try_end_c8} :catch_c8

    .line 199
    .line 200
    .line 201
    :catch_c8
    :cond_c8
    throw p1
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

.method x(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V
    .registers 10

    .line 1
    const-string v0, "\r\n"

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_5
    new-instance v3, Lax/q3/a;

    .line 7
    .line 8
    new-instance v4, Ljava/io/InputStreamReader;

    .line 9
    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    invoke-virtual {p1, p2, v5, v6}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->T(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/nio/charset/Charset;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-direct {v4, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v4}, Lax/q3/a;-><init>(Ljava/io/Reader;)V
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_1b} :catch_62
    .catch Lax/b3/j; {:try_start_5 .. :try_end_1b} :catch_60
    .catchall {:try_start_5 .. :try_end_1b} :catchall_5e

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x800

    .line 29
    .line 30
    :try_start_1d
    new-array p1, p1, [C

    .line 31
    .line 32
    :cond_1f
    invoke-virtual {v3, p1}, Ljava/io/Reader;->read([C)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    const/4 v2, -0x1

    .line 37
    if-eq p2, v2, :cond_3a

    .line 38
    .line 39
    new-instance v2, Ljava/lang/String;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, p1, v4, p2}, Ljava/lang/String;-><init>([CII)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F0(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-static {v2, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->F0(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz p2, :cond_1f

    .line 54
    .line 55
    mul-int/lit8 v2, v2, 0x2

    .line 56
    .line 57
    if-le p2, v2, :cond_3c

    .line 58
    .line 59
    :cond_3a
    move-object p1, v1

    .line 60
    goto :goto_46

    .line 61
    :cond_3c
    move-object p1, v0

    .line 62
    goto :goto_46

    .line 63
    :catchall_3e
    move-exception p1

    .line 64
    move-object v2, v3

    .line 65
    goto :goto_a2

    .line 66
    :catch_41
    move-exception p1

    .line 67
    :goto_42
    move-object v2, v3

    .line 68
    goto :goto_63

    .line 69
    :catch_44
    move-exception p1

    .line 70
    goto :goto_42

    .line 71
    :goto_46
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 72
    .line 73
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->S(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)Ljava/lang/String;
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_4b} :catch_44
    .catch Lax/b3/j; {:try_start_1d .. :try_end_4b} :catch_41
    .catchall {:try_start_1d .. :try_end_4b} :catchall_3e

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-nez p1, :cond_58

    .line 83
    .line 84
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 85
    .line 86
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->S(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    :cond_58
    :try_start_58
    invoke-virtual {v3}, Lax/q3/a;->close()V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_58 .. :try_end_5b} :catch_5c

    .line 90
    .line 91
    .line 92
    goto :goto_78

    .line 93
    :catch_5c
    nop

    .line 94
    goto :goto_78

    .line 95
    :catchall_5e
    move-exception p1

    .line 96
    goto :goto_a2

    .line 97
    :catch_60
    move-exception p1

    .line 98
    goto :goto_63

    .line 99
    :catch_62
    move-exception p1

    .line 100
    :goto_63
    :try_start_63
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_66
    .catchall {:try_start_63 .. :try_end_66} :catchall_5e

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-nez p1, :cond_73

    .line 110
    .line 111
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 112
    .line 113
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->S(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    :cond_73
    if-eqz v2, :cond_78

    .line 117
    .line 118
    :try_start_75
    invoke-virtual {v2}, Lax/q3/a;->close()V
    :try_end_78
    .catch Ljava/io/IOException; {:try_start_75 .. :try_end_78} :catch_5c

    .line 119
    .line 120
    .line 121
    :cond_78
    :goto_78
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->g0()Ljava/util/logging/Logger;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-instance p2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v1, "DETECTED NEWLINE : "

    .line 131
    .line 132
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 136
    .line 137
    invoke-static {v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_95

    .line 146
    .line 147
    const-string v0, "CRLF"

    .line 148
    .line 149
    goto :goto_97

    .line 150
    :cond_95
    const-string v0, "LF"

    .line 151
    .line 152
    :goto_97
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :goto_a2
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 164
    .line 165
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->R(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    if-nez p2, :cond_af

    .line 170
    .line 171
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 172
    .line 173
    invoke-static {p2, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->S(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    :cond_af
    if-eqz v2, :cond_b4

    .line 177
    .line 178
    :try_start_b1
    invoke-virtual {v2}, Lax/q3/a;->close()V
    :try_end_b4
    .catch Ljava/io/IOException; {:try_start_b1 .. :try_end_b4} :catch_b4

    .line 179
    .line 180
    .line 181
    :catch_b4
    :cond_b4
    throw p1
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

.method protected varargs y([Ljava/lang/Void;)Ljava/lang/Integer;
    .registers 6

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->L(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->z(Lcom/voxdon/xplorer/file/n;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1c

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1c
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->w(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->x(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->Y()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    if-eqz v0, :cond_49

    .line 53
    .line 54
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)Z

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->C(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_49
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->D(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 85
    .line 86
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v2, v3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->d0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 95
    .line 96
    .line 97
    if-nez v0, :cond_84

    .line 98
    .line 99
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 100
    .line 101
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->O(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const/16 v3, 0x3e8

    .line 110
    .line 111
    if-ge v2, v3, :cond_84

    .line 112
    .line 113
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)Z

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 119
    .line 120
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->C0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/file/o;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->C(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_84
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->b0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)Z

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_8e
    .catch Lax/b3/j; {:try_start_0 .. :try_end_8e} :catch_8f

    .line 143
    return-object p1

    .line 144
    :catch_8f
    const/16 p1, -0xa

    .line 145
    .line 146
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1
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

.method z(Lcom/voxdon/xplorer/file/n;)Z
    .registers 15

    .line 1
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x19000

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    cmp-long v5, v0, v2

    .line 10
    .line 11
    if-gez v5, :cond_d

    .line 12
    .line 13
    return v4

    .line 14
    :cond_d
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const-wide/32 v2, 0x100000

    .line 19
    .line 20
    .line 21
    div-long/2addr v0, v2

    .line 22
    const-wide/16 v5, 0x1e

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    cmp-long v7, v0, v5

    .line 26
    .line 27
    if-lez v7, :cond_1d

    .line 28
    .line 29
    return p1

    .line 30
    :cond_1d
    iget-object v5, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$m;->i:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "activity"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Landroid/app/ActivityManager;

    .line 43
    .line 44
    invoke-virtual {v5}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    mul-int/lit8 v5, v5, 0x4

    .line 49
    .line 50
    div-int/lit8 v5, v5, 0xa

    .line 51
    .line 52
    int-to-long v5, v5

    .line 53
    cmp-long v7, v0, v5

    .line 54
    .line 55
    if-lez v7, :cond_39

    .line 56
    .line 57
    return p1

    .line 58
    :cond_39
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/Runtime;->totalMemory()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Ljava/lang/Runtime;->freeMemory()J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-virtual {v11}, Ljava/lang/Runtime;->maxMemory()J

    .line 83
    .line 84
    .line 85
    move-result-wide v11

    .line 86
    sub-long/2addr v5, v7

    .line 87
    sub-long/2addr v11, v5

    .line 88
    sub-long/2addr v11, v9

    .line 89
    div-long/2addr v11, v2

    .line 90
    const-wide/16 v2, 0x4

    .line 91
    .line 92
    mul-long v11, v11, v2

    .line 93
    .line 94
    const-wide/16 v2, 0xa

    .line 95
    .line 96
    div-long/2addr v11, v2

    .line 97
    cmp-long v2, v0, v11

    .line 98
    .line 99
    if-lez v2, :cond_65

    .line 100
    .line 101
    return p1

    .line 102
    :cond_65
    return v4
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
