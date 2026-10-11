.class Lax/W2/f$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/f;
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
.field h:Z

.field i:Lax/W2/j$f;

.field final synthetic j:Lax/W2/f;


# direct methods
.method public constructor <init>(Lax/W2/f;)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    sget-object v1, Lax/W2/j$f;->q:Lax/W2/j$f;

    invoke-direct {p0, p1, v0, v1}, Lax/W2/f$d;-><init>(Lax/W2/f;ZLax/W2/j$f;)V

    return-void
.end method

.method public constructor <init>(Lax/W2/f;ZLax/W2/j$f;)V
    .registers 4

    .line 2
    iput-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    iput-boolean p2, p0, Lax/W2/f$d;->h:Z

    .line 5
    iput-object p3, p0, Lax/W2/f$d;->i:Lax/W2/j$f;

    return-void
.end method

.method private A(ZLax/u3/c;)V
    .registers 17

    .line 1
    const/4 v1, 0x1

    .line 2
    const/4 v2, 0x0

    .line 3
    if-eqz p1, :cond_2c

    .line 4
    .line 5
    :try_start_4
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 6
    .line 7
    invoke-static {p1}, Lax/W2/f;->H0(Lax/W2/f;)Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v3, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 12
    .line 13
    invoke-static {v3}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {v0, v3, v4}, Lcom/voxdon/xplorer/file/o;->X(Lcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/file/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p1, v0}, Lax/W2/f;->G0(Lax/W2/f;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    .line 25
    goto :goto_2c

    .line 26
    :catchall_19
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    goto/16 :goto_17e

    .line 29
    .line 30
    :catch_1d
    nop

    .line 31
    goto/16 :goto_12d

    .line 32
    .line 33
    :catch_20
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    goto/16 :goto_133

    .line 36
    .line 37
    :catch_24
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    goto/16 :goto_13e

    .line 40
    .line 41
    :catch_28
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto/16 :goto_144

    .line 44
    .line 45
    :cond_2c
    :goto_2c
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 46
    .line 47
    invoke-static {p1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_47

    .line 52
    .line 53
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 54
    .line 55
    invoke-static {p1}, Lax/W2/f;->I0(Lax/W2/f;)Lax/B/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 60
    .line 61
    invoke-static {v0}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_47
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lax/W2/j;->l0(Z)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 78
    .line 79
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lax/W2/g;->m()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 88
    .line 89
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lax/W2/g;->i()J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 98
    .line 99
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lax/W2/g;->l()Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-direct {p0}, Lax/W2/f$d;->x()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_9f

    .line 112
    .line 113
    sget-object p1, Lax/c3/K;->e:Lax/c3/K;

    .line 114
    .line 115
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 120
    .line 121
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object p1, p1, Lax/W2/g;->c:Landroid/net/Uri;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v3, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 136
    .line 137
    invoke-static {p1}, Lax/W2/f;->H0(Lax/W2/f;)Lcom/voxdon/xplorer/file/o;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 142
    .line 143
    invoke-static {p1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 148
    .line 149
    invoke-virtual {p1}, Lax/W2/j;->V()Lax/g3/i;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    const/4 v7, 0x1

    .line 154
    move-object/from16 v8, p2

    .line 155
    .line 156
    invoke-virtual/range {v3 .. v9}, Lcom/voxdon/xplorer/file/o;->h0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;ZLax/u3/c;Lax/g3/i;)V

    .line 157
    .line 158
    .line 159
    goto :goto_108

    .line 160
    :cond_9f
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 161
    .line 162
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Lax/W2/g;->d()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_bc

    .line 171
    .line 172
    new-instance p1, Lax/c3/b0;

    .line 173
    .line 174
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 175
    .line 176
    invoke-static {v0}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lax/W2/g;->n()Landroid/os/ParcelFileDescriptor;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {p1, v0}, Lax/c3/b0;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 185
    .line 186
    .line 187
    :goto_ba
    move-object v5, p1

    .line 188
    goto :goto_ee

    .line 189
    :cond_bc
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 190
    .line 191
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Lax/W2/g;->c()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_d6

    .line 200
    .line 201
    new-instance p1, Lax/c3/d;

    .line 202
    .line 203
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 204
    .line 205
    invoke-static {v0}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iget-object v0, v0, Lax/W2/g;->b:[B

    .line 210
    .line 211
    invoke-direct {p1, v0}, Lax/c3/d;-><init>([B)V

    .line 212
    .line 213
    .line 214
    goto :goto_ba

    .line 215
    :cond_d6
    new-instance p1, Lax/c3/U;

    .line 216
    .line 217
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 218
    .line 219
    invoke-static {v0}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v3, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 224
    .line 225
    invoke-virtual {v3}, Lax/W2/j;->r()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v0, v3}, Lax/W2/g;->k(Landroid/content/Context;)Ljava/io/InputStream;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const-wide/16 v3, -0x1

    .line 234
    .line 235
    invoke-direct {p1, v0, v3, v4}, Lax/c3/U;-><init>(Ljava/io/InputStream;J)V
    :try_end_ed
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_ed} :catch_28
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_ed} :catch_24
    .catch Lax/b3/j; {:try_start_4 .. :try_end_ed} :catch_20
    .catch Lax/b3/a; {:try_start_4 .. :try_end_ed} :catch_1d
    .catchall {:try_start_4 .. :try_end_ed} :catchall_19

    .line 236
    .line 237
    .line 238
    goto :goto_ba

    .line 239
    :goto_ee
    :try_start_ee
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 240
    .line 241
    invoke-static {p1}, Lax/W2/f;->H0(Lax/W2/f;)Lcom/voxdon/xplorer/file/o;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 246
    .line 247
    invoke-static {p1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 252
    .line 253
    invoke-virtual {p1}, Lax/W2/j;->V()Lax/g3/i;

    .line 254
    .line 255
    .line 256
    move-result-object v13

    .line 257
    const/4 v10, 0x0

    .line 258
    const/4 v11, 0x1

    .line 259
    move-object/from16 v12, p2

    .line 260
    .line 261
    invoke-virtual/range {v3 .. v13}, Lcom/voxdon/xplorer/file/o;->v0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    :try_end_107
    .catch Ljava/lang/SecurityException; {:try_start_ee .. :try_end_107} :catch_129
    .catch Ljava/io/IOException; {:try_start_ee .. :try_end_107} :catch_125
    .catch Lax/b3/j; {:try_start_ee .. :try_end_107} :catch_121
    .catch Lax/b3/a; {:try_start_ee .. :try_end_107} :catch_11e
    .catchall {:try_start_ee .. :try_end_107} :catchall_119

    .line 262
    .line 263
    .line 264
    move-object v2, v5

    .line 265
    :goto_108
    if-eqz v2, :cond_10d

    .line 266
    .line 267
    invoke-virtual {v2}, Lax/c3/f;->e()V

    .line 268
    .line 269
    .line 270
    :cond_10d
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 271
    .line 272
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    sget-object v0, Lax/W2/v$b;->q:Lax/W2/v$b;

    .line 277
    .line 278
    invoke-virtual {p1, v0, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :catchall_119
    move-exception v0

    .line 283
    move-object p1, v0

    .line 284
    move-object v2, v5

    .line 285
    goto/16 :goto_17e

    .line 286
    .line 287
    :catch_11e
    nop

    .line 288
    move-object v2, v5

    .line 289
    goto :goto_12d

    .line 290
    :catch_121
    move-exception v0

    .line 291
    move-object p1, v0

    .line 292
    move-object v2, v5

    .line 293
    goto :goto_133

    .line 294
    :catch_125
    move-exception v0

    .line 295
    move-object p1, v0

    .line 296
    move-object v2, v5

    .line 297
    goto :goto_13e

    .line 298
    :catch_129
    move-exception v0

    .line 299
    move-object p1, v0

    .line 300
    move-object v2, v5

    .line 301
    goto :goto_144

    .line 302
    :goto_12d
    if-eqz v2, :cond_15f

    .line 303
    .line 304
    :goto_12f
    invoke-virtual {v2}, Lax/c3/f;->e()V

    .line 305
    .line 306
    .line 307
    goto :goto_15f

    .line 308
    :goto_133
    :try_start_133
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 309
    .line 310
    invoke-virtual {v0, p1}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 314
    .line 315
    .line 316
    if-eqz v2, :cond_15f

    .line 317
    .line 318
    goto :goto_12f

    .line 319
    :goto_13e
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 320
    .line 321
    .line 322
    if-eqz v2, :cond_15f

    .line 323
    .line 324
    goto :goto_12f

    .line 325
    :goto_144
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 326
    .line 327
    .line 328
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v3, "!! ClipboardSaveOperator SecurityException !!"

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_15c
    .catchall {:try_start_133 .. :try_end_15c} :catchall_19

    .line 347
    .line 348
    .line 349
    if-eqz v2, :cond_15f

    .line 350
    .line 351
    goto :goto_12f

    .line 352
    :cond_15f
    :goto_15f
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 353
    .line 354
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    sget-object v0, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 359
    .line 360
    invoke-virtual {p1, v0, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 361
    .line 362
    .line 363
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 364
    .line 365
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 370
    .line 371
    invoke-static {v0}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {p1, v0}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :goto_17e
    if-eqz v2, :cond_183

    .line 384
    .line 385
    invoke-virtual {v2}, Lax/c3/f;->e()V

    .line 386
    .line 387
    .line 388
    :cond_183
    throw p1
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

.method private C(Lax/W2/j$f;)V
    .registers 4

    .line 1
    sget-object v0, Lax/W2/f$b;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_2b

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_27

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq p1, v1, :cond_1b

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-eq p1, v0, :cond_15

    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 23
    .line 24
    invoke-virtual {p1}, Lax/W2/j;->i()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 29
    .line 30
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v1, Lax/W2/v$b;->d0:Lax/W2/v$b;

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    invoke-virtual {p0, v0}, Lax/W2/f$d;->B(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Lax/W2/f$d;->B(Z)V

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

.method private x()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lax/W2/g;->c:Landroid/net/Uri;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3c

    .line 11
    .line 12
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 13
    .line 14
    invoke-static {v0}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lax/W2/g;->c:Landroid/net/Uri;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Lax/c3/B;->K(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3c

    .line 29
    .line 30
    iget-object v2, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 31
    .line 32
    invoke-virtual {v2}, Lax/W2/j;->r()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "content-tmp"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lax/Z2/a;->m(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_30

    .line 47
    .line 48
    return v1

    .line 49
    :cond_30
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v0}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3c

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    return v0

    .line 61
    :cond_3c
    return v1
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method B(Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1, p0}, Lax/W2/f$d;->A(ZLax/u3/c;)V

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

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/f$d;->w([Ljava/lang/Void;)Ljava/lang/Integer;

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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/f$d;->y(Ljava/lang/Integer;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/f$d;->z(Ljava/lang/Integer;)V

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
    .registers 5

    .line 1
    :cond_0
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    goto/16 :goto_b6

    .line 9
    .line 10
    :cond_9
    iget-boolean p1, p0, Lax/W2/f$d;->h:Z

    .line 11
    .line 12
    if-eqz p1, :cond_16

    .line 13
    .line 14
    iput-boolean v0, p0, Lax/W2/f$d;->h:Z

    .line 15
    .line 16
    iget-object p1, p0, Lax/W2/f$d;->i:Lax/W2/j$f;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/W2/f$d;->C(Lax/W2/j$f;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_aa

    .line 22
    .line 23
    :cond_16
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 24
    .line 25
    invoke-static {p1}, Lax/W2/f;->J0(Lax/W2/f;)Ljava/util/LinkedList;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lax/W2/g;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lax/W2/f;->E0(Lax/W2/f;Lax/W2/g;)Lax/W2/g;

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 39
    .line 40
    invoke-static {p1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p1, v1}, Lax/W2/f;->L0(Lax/W2/f;Lax/W2/g;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :try_start_2f
    iget-object v1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 49
    .line 50
    invoke-static {v1}, Lax/W2/f;->H0(Lax/W2/f;)Lcom/voxdon/xplorer/file/o;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v1, p1}, Lax/W2/f;->G0(Lax/W2/f;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    :try_end_3c
    .catch Lax/b3/j; {:try_start_2f .. :try_end_3c} :catch_3e

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    goto :goto_42

    .line 63
    :catch_3e
    move-exception p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    :goto_42
    iget-object v1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 68
    .line 69
    invoke-static {v1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/4 v2, 0x1

    .line 74
    if-nez v1, :cond_71

    .line 75
    .line 76
    if-eqz p1, :cond_52

    .line 77
    .line 78
    iget-object v1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 81
    .line 82
    .line 83
    :cond_52
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 84
    .line 85
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object v1, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 90
    .line 91
    invoke-virtual {p1, v1, v2}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 95
    .line 96
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 101
    .line 102
    invoke-static {v1}, Lax/W2/f;->D0(Lax/W2/f;)Lax/W2/g;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Lax/W2/g;->h()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1, v1}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_aa

    .line 114
    :cond_71
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Lax/W2/j;->l0(Z)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 120
    .line 121
    invoke-static {p1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_a7

    .line 130
    .line 131
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 132
    .line 133
    invoke-static {p1}, Lax/W2/f;->F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_94

    .line 142
    .line 143
    const/4 p1, 0x2

    .line 144
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :cond_94
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 150
    .line 151
    invoke-static {p1}, Lax/W2/f;->w0(Lax/W2/f;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_a2

    .line 156
    .line 157
    iget-object p1, p0, Lax/W2/f$d;->i:Lax/W2/j$f;

    .line 158
    .line 159
    invoke-direct {p0, p1}, Lax/W2/f$d;->C(Lax/W2/j$f;)V

    .line 160
    .line 161
    .line 162
    goto :goto_aa

    .line 163
    :cond_a2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_a7
    invoke-virtual {p0, v0}, Lax/W2/f$d;->B(Z)V

    .line 169
    .line 170
    .line 171
    :goto_aa
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 172
    .line 173
    invoke-static {p1}, Lax/W2/f;->J0(Lax/W2/f;)Ljava/util/LinkedList;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_0

    .line 182
    .line 183
    :goto_b6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
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
.end method

.method protected y(Ljava/lang/Integer;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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

.method protected z(Ljava/lang/Integer;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_c

    .line 6
    .line 7
    iget-object p1, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 8
    .line 9
    invoke-static {p1}, Lax/W2/f;->M0(Lax/W2/f;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget-object v0, p0, Lax/W2/f$d;->j:Lax/W2/f;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lax/W2/f;->y0(Lax/W2/f;I)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
