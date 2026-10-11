.class Lax/W2/u$h;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/u;


# direct methods
.method public constructor <init>(Lax/W2/u;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

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

.method private A(Lax/W2/u$e;)Z
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    iget-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    if-eqz v2, :cond_13

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V

    .line 8
    .line 9
    .line 10
    goto/16 :goto_7c

    .line 11
    .line 12
    :catch_b
    move-exception v2

    .line 13
    goto :goto_6d

    .line 14
    :catch_d
    move-exception v2

    .line 15
    goto :goto_71

    .line 16
    :catch_f
    move-exception v2

    .line 17
    goto :goto_75

    .line 18
    :catch_11
    move-exception v2

    .line 19
    goto :goto_79

    .line 20
    :cond_13
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    if-eqz v2, :cond_31

    .line 25
    .line 26
    invoke-virtual {v2}, Lax/c3/k;->k0()Z

    .line 27
    .line 28
    .line 29
    move-result v2
    :try_end_1d
    .catch Ljava/util/zip/ZipException; {:try_start_2 .. :try_end_1d} :catch_11
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_1d} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_1d} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_1d} :catch_b

    .line 30
    if-eqz v2, :cond_31

    .line 31
    .line 32
    :try_start_1f
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 39
    .line 40
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 41
    .line 42
    if-nez v2, :cond_2c

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2c
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V
    :try_end_2f
    .catch Lax/b3/j; {:try_start_1f .. :try_end_2f} :catch_30
    .catch Ljava/util/zip/ZipException; {:try_start_1f .. :try_end_2f} :catch_11
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_2f} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1f .. :try_end_2f} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_1f .. :try_end_2f} :catch_b

    .line 46
    .line 47
    .line 48
    goto :goto_7c

    .line 49
    :catch_30
    return v1

    .line 50
    :cond_31
    :try_start_31
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 51
    .line 52
    instance-of v5, v2, Lcom/voxdon/xplorer/file/y;

    .line 53
    .line 54
    if-eqz v5, :cond_69

    .line 55
    .line 56
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 57
    .line 58
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_55

    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 65
    .line 66
    .line 67
    move-result v5
    :try_end_43
    .catch Ljava/util/zip/ZipException; {:try_start_31 .. :try_end_43} :catch_11
    .catch Ljava/io/IOException; {:try_start_31 .. :try_end_43} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_31 .. :try_end_43} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_31 .. :try_end_43} :catch_b

    .line 68
    if-eqz v5, :cond_55

    .line 69
    .line 70
    :try_start_45
    invoke-direct {p0, v2}, Lax/W2/u$h;->y(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 75
    .line 76
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 77
    .line 78
    if-nez v2, :cond_50

    .line 79
    .line 80
    return v1

    .line 81
    :cond_50
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V
    :try_end_53
    .catch Lax/b3/j; {:try_start_45 .. :try_end_53} :catch_54
    .catch Ljava/util/zip/ZipException; {:try_start_45 .. :try_end_53} :catch_11
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_53} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_45 .. :try_end_53} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_45 .. :try_end_53} :catch_b

    .line 82
    .line 83
    .line 84
    goto :goto_7c

    .line 85
    :catch_54
    return v1

    .line 86
    :cond_55
    :try_start_55
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    iput-wide v3, p1, Lax/W2/u$e;->l:J

    .line 95
    .line 96
    new-instance v3, Lax/Bc/n;

    .line 97
    .line 98
    invoke-direct {v3, v2}, Lax/Bc/n;-><init>(Ljava/io/File;)V

    .line 99
    .line 100
    .line 101
    iput-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 102
    .line 103
    iput-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 104
    .line 105
    goto :goto_7c

    .line 106
    :cond_69
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_6c
    .catch Ljava/util/zip/ZipException; {:try_start_55 .. :try_end_6c} :catch_11
    .catch Ljava/io/IOException; {:try_start_55 .. :try_end_6c} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_55 .. :try_end_6c} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_55 .. :try_end_6c} :catch_b

    .line 107
    .line 108
    .line 109
    return v1

    .line 110
    :goto_6d
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 111
    .line 112
    .line 113
    goto :goto_7c

    .line 114
    :goto_71
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    .line 116
    .line 117
    goto :goto_7c

    .line 118
    :goto_75
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 119
    .line 120
    .line 121
    goto :goto_7c

    .line 122
    :goto_79
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    :goto_7c
    iget-object v2, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 126
    .line 127
    if-nez v2, :cond_81

    .line 128
    .line 129
    return v1

    .line 130
    :cond_81
    :goto_81
    const/4 v2, 0x0

    .line 131
    :try_start_82
    iget-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 132
    .line 133
    invoke-virtual {v3}, Lax/Bc/n;->F()Lax/Bc/l;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    if-eqz v3, :cond_a4

    .line 138
    .line 139
    invoke-virtual {v3}, Lax/Bc/l;->isDirectory()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_91

    .line 144
    .line 145
    goto :goto_81

    .line 146
    :cond_91
    iget-object v4, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 147
    .line 148
    invoke-virtual {v4, v3}, Lax/Bc/n;->u(Lax/Bc/l;)Ljava/io/InputStream;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    .line 153
    .line 154
    .line 155
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V
    :try_end_9d
    .catch Lax/zc/b; {:try_start_82 .. :try_end_9d} :catch_a2
    .catch Ljava/io/IOException; {:try_start_82 .. :try_end_9d} :catch_a0
    .catchall {:try_start_82 .. :try_end_9d} :catchall_9e

    .line 156
    .line 157
    .line 158
    goto :goto_a4

    .line 159
    :catchall_9e
    move-exception v0

    .line 160
    goto :goto_bc

    .line 161
    :catch_a0
    nop

    .line 162
    goto :goto_d4

    .line 163
    :catch_a2
    nop

    .line 164
    goto :goto_df

    .line 165
    :cond_a4
    :goto_a4
    iget-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 166
    .line 167
    if-eqz v0, :cond_ae

    .line 168
    .line 169
    :goto_a8
    iget-object v0, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 170
    .line 171
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_b7

    .line 175
    :cond_ae
    iget-object v0, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 176
    .line 177
    if-eqz v0, :cond_b7

    .line 178
    .line 179
    :goto_b2
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 180
    .line 181
    .line 182
    iput-object v2, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 183
    .line 184
    :cond_b7
    :goto_b7
    iput-object v2, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 185
    .line 186
    iput-boolean v1, p1, Lax/W2/u$e;->m:Z

    .line 187
    .line 188
    goto :goto_de

    .line 189
    :goto_bc
    iget-boolean v3, p1, Lax/W2/u$e;->m:Z

    .line 190
    .line 191
    if-nez v3, :cond_ca

    .line 192
    .line 193
    iget-object v3, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 194
    .line 195
    if-eqz v3, :cond_cf

    .line 196
    .line 197
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 198
    .line 199
    .line 200
    iput-object v2, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 201
    .line 202
    goto :goto_cf

    .line 203
    :cond_ca
    iget-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 204
    .line 205
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 206
    .line 207
    .line 208
    :cond_cf
    :goto_cf
    iput-object v2, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 209
    .line 210
    iput-boolean v1, p1, Lax/W2/u$e;->m:Z

    .line 211
    .line 212
    throw v0

    .line 213
    :goto_d4
    iget-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 214
    .line 215
    if-eqz v0, :cond_d9

    .line 216
    .line 217
    goto :goto_a8

    .line 218
    :cond_d9
    iget-object v0, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 219
    .line 220
    if-eqz v0, :cond_b7

    .line 221
    .line 222
    goto :goto_b2

    .line 223
    :goto_de
    return v1

    .line 224
    :goto_df
    iget-boolean v3, p1, Lax/W2/u$e;->m:Z

    .line 225
    .line 226
    if-eqz v3, :cond_e9

    .line 227
    .line 228
    iget-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 229
    .line 230
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 231
    .line 232
    .line 233
    goto :goto_f2

    .line 234
    :cond_e9
    iget-object v3, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 235
    .line 236
    if-eqz v3, :cond_f2

    .line 237
    .line 238
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 239
    .line 240
    .line 241
    iput-object v2, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 242
    .line 243
    :cond_f2
    :goto_f2
    iput-object v2, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 244
    .line 245
    iput-boolean v1, p1, Lax/W2/u$e;->m:Z

    .line 246
    .line 247
    return v0
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

.method private D(Lax/W2/u$e;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileInputStream;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 13
    .line 14
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iput-wide v1, p1, Lax/W2/u$e;->l:J

    .line 23
    .line 24
    iget-object v1, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_29

    .line 27
    .line 28
    new-instance v1, Lax/Bc/n;

    .line 29
    .line 30
    iget-object v2, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v1, v0, v2}, Lax/Bc/n;-><init>(Ljava/nio/channels/SeekableByteChannel;[C)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 40
    .line 41
    goto :goto_30

    .line 42
    :cond_29
    new-instance v1, Lax/Bc/n;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lax/Bc/n;-><init>(Ljava/nio/channels/SeekableByteChannel;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 48
    .line 49
    :goto_30
    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 51
    .line 52
    return-void
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

.method private E(Lax/W2/u$e;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-static {v0}, Lax/u3/b;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/Dc/e;->b(Ljava/io/FileDescriptor;)Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 17
    .line 18
    invoke-static {v1, p1}, Lax/W2/u;->x0(Lax/W2/u;Lax/W2/u$e;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/io/FileInputStream;

    .line 22
    .line 23
    iget-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 33
    .line 34
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iput-wide v2, p1, Lax/W2/u$e;->l:J

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v1, v0}, Lax/Dc/T;->u0(Ljava/nio/channels/SeekableByteChannel;Ljava/lang/String;)Lax/Dc/T;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p1, Lax/W2/u$e;->p:Z

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private F(Lax/W2/u$e;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 3
    .line 4
    invoke-static {v1}, Lax/W2/u;->A0(Lax/W2/u;)Lcom/voxdon/xplorer/file/o;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p1, Lax/W2/u$e;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/16 v4, 0x8c

    .line 20
    .line 21
    if-nez v2, :cond_30

    .line 22
    .line 23
    iget-object v2, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 24
    .line 25
    invoke-static {v2}, Lax/W2/u;->A0(Lax/W2/u;)Lcom/voxdon/xplorer/file/o;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2, v1, v0}, Lcom/voxdon/xplorer/file/o;->k(Lcom/voxdon/xplorer/file/n;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2a

    .line 34
    .line 35
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 36
    .line 37
    invoke-virtual {p1, v4}, Lax/W2/j;->r0(I)V

    .line 38
    .line 39
    .line 40
    return v0

    .line 41
    :catch_28
    move-exception p1

    .line 42
    goto :goto_76

    .line 43
    :cond_2a
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 44
    .line 45
    invoke-static {v1, v3}, Lax/W2/u;->B0(Lax/W2/u;Z)Z

    .line 46
    .line 47
    .line 48
    goto :goto_3c

    .line 49
    :cond_30
    invoke-interface {v1}, Lax/c3/b;->isDirectory()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3c

    .line 54
    .line 55
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 56
    .line 57
    invoke-virtual {p1, v4}, Lax/W2/j;->r0(I)V

    .line 58
    .line 59
    .line 60
    return v0

    .line 61
    :cond_3c
    :goto_3c
    iget-object v1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;
    :try_end_3e
    .catch Lax/b3/j; {:try_start_1 .. :try_end_3e} :catch_28

    .line 62
    .line 63
    if-eqz v1, :cond_46

    .line 64
    .line 65
    :try_start_40
    invoke-static {v1}, Lax/c3/B;->g(Landroid/os/ParcelFileDescriptor;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    iput-wide v1, p1, Lax/W2/u$e;->i:J
    :try_end_46
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_46} :catch_46

    .line 70
    .line 71
    :catch_46
    :cond_46
    :try_start_46
    sget-object v1, Lax/W2/u$d;->a:[I

    .line 72
    .line 73
    iget-object v2, p1, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    aget v1, v1, v2

    .line 80
    .line 81
    if-eq v1, v3, :cond_71

    .line 82
    .line 83
    const/4 v2, 0x2

    .line 84
    if-eq v1, v2, :cond_6c

    .line 85
    .line 86
    const/4 v2, 0x3

    .line 87
    if-eq v1, v2, :cond_6c

    .line 88
    .line 89
    const/4 v2, 0x4

    .line 90
    if-eq v1, v2, :cond_67

    .line 91
    .line 92
    const/4 v2, 0x5

    .line 93
    if-eq v1, v2, :cond_62

    .line 94
    .line 95
    invoke-static {}, Lax/u3/b;->f()V

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :cond_62
    invoke-direct {p0, p1}, Lax/W2/u$h;->H(Lax/W2/u$e;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_67
    invoke-direct {p0, p1}, Lax/W2/u$h;->I(Lax/W2/u$e;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    return p1

    .line 109
    :cond_6c
    invoke-direct {p0, p1}, Lax/W2/u$h;->G(Lax/W2/u$e;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1

    .line 114
    :cond_71
    invoke-direct {p0, p1}, Lax/W2/u$h;->J(Lax/W2/u$e;)Z

    .line 115
    .line 116
    .line 117
    move-result p1
    :try_end_75
    .catch Lax/b3/j; {:try_start_46 .. :try_end_75} :catch_28

    .line 118
    return p1

    .line 119
    :goto_76
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 122
    .line 123
    .line 124
    return v0
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

.method private G(Lax/W2/u$e;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/W2/u$h;->x(Lax/W2/u$e;)Ljava/io/FileInputStream;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iput-wide v2, p1, Lax/W2/u$e;->l:J

    .line 18
    .line 19
    iget-object v2, p1, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 20
    .line 21
    sget-object v3, Lax/W2/t$a;->d0:Lax/W2/t$a;

    .line 22
    .line 23
    if-ne v2, v3, :cond_22

    .line 24
    .line 25
    new-instance v2, Lax/Hc/a;

    .line 26
    .line 27
    invoke-direct {v2, v1}, Lax/Hc/a;-><init>(Ljava/io/InputStream;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p1, Lax/W2/u$e;->k:Lax/Ec/a;

    .line 31
    .line 32
    goto :goto_31

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_47

    .line 35
    :cond_22
    sget-object v3, Lax/W2/t$a;->c0:Lax/W2/t$a;

    .line 36
    .line 37
    if-ne v2, v3, :cond_2e

    .line 38
    .line 39
    new-instance v2, Lax/Jc/a;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Lax/Jc/a;-><init>(Ljava/io/InputStream;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p1, Lax/W2/u$e;->k:Lax/Ec/a;

    .line 45
    .line 46
    goto :goto_31

    .line 47
    :cond_2e
    invoke-static {}, Lax/u3/b;->f()V

    .line 48
    .line 49
    .line 50
    :goto_31
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 51
    .line 52
    invoke-virtual {v1}, Lax/W2/j;->w()Lax/W2/v;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-wide v2, p1, Lax/W2/u$e;->l:J

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, Lax/W2/v;->h(J)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 62
    .line 63
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-virtual {p1, v1}, Lax/W2/v;->g(I)V
    :try_end_46
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_46} :catch_48
    .catchall {:try_start_1 .. :try_end_46} :catchall_20

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :goto_47
    throw p1

    .line 73
    :catch_48
    return v0
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

.method private H(Lax/W2/u$e;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    iget-object v2, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 4
    .line 5
    if-nez v2, :cond_28

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/W2/u$h;->A(Lax/W2/u$e;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iput-boolean v2, p1, Lax/W2/u$e;->o:Z

    .line 12
    .line 13
    if-eqz v2, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    iget-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 17
    .line 18
    if-eqz v2, :cond_28

    .line 19
    .line 20
    iget-object v2, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 21
    .line 22
    invoke-static {v2, p1}, Lax/W2/u;->x0(Lax/W2/u;Lax/W2/u$e;)V

    .line 23
    .line 24
    .line 25
    goto :goto_28

    .line 26
    :catch_19
    move-exception v2

    .line 27
    goto/16 :goto_9d

    .line 28
    .line 29
    :catch_1c
    move-exception v2

    .line 30
    goto/16 :goto_a6

    .line 31
    .line 32
    :catch_1f
    move-exception v2

    .line 33
    goto/16 :goto_aa

    .line 34
    .line 35
    :catch_22
    move-exception v2

    .line 36
    goto/16 :goto_ae

    .line 37
    .line 38
    :catch_25
    move-exception v2

    .line 39
    goto/16 :goto_b2

    .line 40
    .line 41
    :cond_28
    :goto_28
    iget-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 42
    .line 43
    if-eqz v2, :cond_31

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_b5

    .line 49
    .line 50
    :cond_31
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 51
    .line 52
    const-wide/16 v3, 0x0

    .line 53
    .line 54
    if-eqz v2, :cond_4f

    .line 55
    .line 56
    invoke-virtual {v2}, Lax/c3/k;->k0()Z

    .line 57
    .line 58
    .line 59
    move-result v2
    :try_end_3b
    .catch Ljava/util/zip/ZipException; {:try_start_2 .. :try_end_3b} :catch_25
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_3b} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_3b} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_3b} :catch_1c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_3b} :catch_19

    .line 60
    if-eqz v2, :cond_4f

    .line 61
    .line 62
    :try_start_3d
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 69
    .line 70
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 71
    .line 72
    if-nez v2, :cond_4a

    .line 73
    .line 74
    return v1

    .line 75
    :cond_4a
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V
    :try_end_4d
    .catch Lax/b3/j; {:try_start_3d .. :try_end_4d} :catch_4e
    .catch Ljava/util/zip/ZipException; {:try_start_3d .. :try_end_4d} :catch_25
    .catch Ljava/io/IOException; {:try_start_3d .. :try_end_4d} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3d .. :try_end_4d} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_3d .. :try_end_4d} :catch_1c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3d .. :try_end_4d} :catch_19

    .line 76
    .line 77
    .line 78
    goto :goto_b5

    .line 79
    :catch_4e
    return v1

    .line 80
    :cond_4f
    :try_start_4f
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 81
    .line 82
    instance-of v5, v2, Lcom/voxdon/xplorer/file/y;

    .line 83
    .line 84
    if-eqz v5, :cond_99

    .line 85
    .line 86
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 87
    .line 88
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_73

    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 95
    .line 96
    .line 97
    move-result v5
    :try_end_61
    .catch Ljava/util/zip/ZipException; {:try_start_4f .. :try_end_61} :catch_25
    .catch Ljava/io/IOException; {:try_start_4f .. :try_end_61} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4f .. :try_end_61} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_4f .. :try_end_61} :catch_1c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4f .. :try_end_61} :catch_19

    .line 98
    if-eqz v5, :cond_73

    .line 99
    .line 100
    :try_start_63
    invoke-direct {p0, v2}, Lax/W2/u$h;->y(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 105
    .line 106
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 107
    .line 108
    if-nez v2, :cond_6e

    .line 109
    .line 110
    return v1

    .line 111
    :cond_6e
    invoke-direct {p0, p1}, Lax/W2/u$h;->D(Lax/W2/u$e;)V
    :try_end_71
    .catch Lax/b3/j; {:try_start_63 .. :try_end_71} :catch_72
    .catch Ljava/util/zip/ZipException; {:try_start_63 .. :try_end_71} :catch_25
    .catch Ljava/io/IOException; {:try_start_63 .. :try_end_71} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_63 .. :try_end_71} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_63 .. :try_end_71} :catch_1c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_63 .. :try_end_71} :catch_19

    .line 112
    .line 113
    .line 114
    goto :goto_b5

    .line 115
    :catch_72
    return v1

    .line 116
    :cond_73
    :try_start_73
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    iput-wide v3, p1, Lax/W2/u$e;->l:J

    .line 125
    .line 126
    iget-object v3, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v3, :cond_8f

    .line 129
    .line 130
    new-instance v3, Lax/Bc/n;

    .line 131
    .line 132
    iget-object v4, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-direct {v3, v2, v4}, Lax/Bc/n;-><init>(Ljava/io/File;[C)V

    .line 139
    .line 140
    .line 141
    iput-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 142
    .line 143
    goto :goto_96

    .line 144
    :cond_8f
    new-instance v3, Lax/Bc/n;

    .line 145
    .line 146
    invoke-direct {v3, v2}, Lax/Bc/n;-><init>(Ljava/io/File;)V

    .line 147
    .line 148
    .line 149
    iput-object v3, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 150
    .line 151
    :goto_96
    iput-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 152
    .line 153
    goto :goto_b5

    .line 154
    :cond_99
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_9c
    .catch Ljava/util/zip/ZipException; {:try_start_73 .. :try_end_9c} :catch_25
    .catch Ljava/io/IOException; {:try_start_73 .. :try_end_9c} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_73 .. :try_end_9c} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_73 .. :try_end_9c} :catch_1c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_73 .. :try_end_9c} :catch_19

    .line 155
    .line 156
    .line 157
    return v1

    .line 158
    :goto_9d
    const-string v3, "SevenZPrepare"

    .line 159
    .line 160
    invoke-static {v3, v2}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 164
    .line 165
    .line 166
    goto :goto_b5

    .line 167
    :goto_a6
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 168
    .line 169
    .line 170
    goto :goto_b5

    .line 171
    :goto_aa
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 172
    .line 173
    .line 174
    goto :goto_b5

    .line 175
    :goto_ae
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 176
    .line 177
    .line 178
    goto :goto_b5

    .line 179
    :goto_b2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 180
    .line 181
    .line 182
    :goto_b5
    iget-object v2, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 183
    .line 184
    if-nez v2, :cond_ba

    .line 185
    .line 186
    return v1

    .line 187
    :cond_ba
    :try_start_ba
    iget-object v2, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 188
    .line 189
    invoke-static {v2, p1, p0}, Lax/W2/u;->z0(Lax/W2/u;Lax/W2/u$e;Lax/u3/c;)V
    :try_end_bf
    .catch Lax/b3/a; {:try_start_ba .. :try_end_bf} :catch_c0

    .line 190
    .line 191
    .line 192
    return v0

    .line 193
    :catch_c0
    return v1
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

.method private I(Lax/W2/u$e;)Z
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/W2/u$h;->x(Lax/W2/u$e;)Ljava/io/FileInputStream;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0, v1, p1}, Lax/W2/u$h;->z(Ljava/io/FileInputStream;Lax/W2/u$e;)Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    iput-wide v3, p1, Lax/W2/u$e;->l:J
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_16} :catch_51
    .catchall {:try_start_1 .. :try_end_16} :catchall_4f

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :try_start_17
    new-instance v3, Lax/Cc/d;

    .line 25
    .line 26
    new-instance v4, Ljava/io/BufferedInputStream;

    .line 27
    .line 28
    invoke-direct {v4, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v4}, Lax/Cc/d;-><init>(Ljava/io/InputStream;)V
    :try_end_21
    .catchall {:try_start_17 .. :try_end_21} :catchall_71

    .line 32
    .line 33
    .line 34
    :goto_21
    :try_start_21
    invoke-virtual {v3}, Lax/Cc/d;->p()Lax/Cc/c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_42

    .line 39
    .line 40
    iget-object v2, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 41
    .line 42
    invoke-virtual {v2}, Lax/W2/j;->w()Lax/W2/v;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1}, Lax/Cc/c;->j()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v2, v4, v5}, Lax/W2/v;->h(J)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 54
    .line 55
    invoke-virtual {v1}, Lax/W2/j;->w()Lax/W2/v;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {v1, v2}, Lax/W2/v;->g(I)V
    :try_end_3e
    .catchall {:try_start_21 .. :try_end_3e} :catchall_3f

    .line 61
    .line 62
    .line 63
    goto :goto_21

    .line 64
    :catchall_3f
    move-exception p1

    .line 65
    move-object v1, v3

    .line 66
    goto :goto_72

    .line 67
    :cond_42
    :try_start_42
    invoke-static {v3}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 71
    .line 72
    if-eqz v1, :cond_53

    .line 73
    .line 74
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 75
    .line 76
    invoke-static {v1, p1}, Lax/W2/u;->x0(Lax/W2/u;Lax/W2/u$e;)V

    .line 77
    .line 78
    .line 79
    goto :goto_53

    .line 80
    :catchall_4f
    move-exception p1

    .line 81
    goto :goto_76

    .line 82
    :catch_51
    move-exception p1

    .line 83
    goto :goto_77

    .line 84
    :cond_53
    :goto_53
    invoke-virtual {p0, p1}, Lax/W2/u$h;->x(Lax/W2/u$e;)Ljava/io/FileInputStream;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_5a

    .line 89
    .line 90
    return v0

    .line 91
    :cond_5a
    invoke-virtual {p0, v1, p1}, Lax/W2/u$h;->z(Ljava/io/FileInputStream;Lax/W2/u$e;)Ljava/io/InputStream;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, Lax/Cc/d;

    .line 96
    .line 97
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 98
    .line 99
    invoke-direct {v3, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v2, v3}, Lax/Cc/d;-><init>(Ljava/io/InputStream;)V

    .line 103
    .line 104
    .line 105
    iput-object v2, p1, Lax/W2/u$e;->v:Lax/Cc/d;

    .line 106
    .line 107
    iget-object v1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 108
    .line 109
    invoke-static {v1, p1}, Lax/W2/u;->d1(Lax/W2/u;Lax/W2/u$e;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1

    .line 114
    :catchall_71
    move-exception p1

    .line 115
    :goto_72
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 116
    .line 117
    .line 118
    throw p1
    :try_end_76
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_76} :catch_51
    .catchall {:try_start_42 .. :try_end_76} :catchall_4f

    .line 119
    :goto_76
    throw p1

    .line 120
    :goto_77
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    return v0
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

.method private J(Lax/W2/u$e;)Z
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    iget-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    if-eqz v2, :cond_15

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/W2/u$h;->E(Lax/W2/u$e;)V

    .line 8
    .line 9
    .line 10
    goto/16 :goto_85

    .line 11
    .line 12
    :catch_b
    move-exception v2

    .line 13
    goto :goto_76

    .line 14
    :catch_d
    move-exception v2

    .line 15
    goto :goto_7a

    .line 16
    :catch_f
    move-exception v2

    .line 17
    goto/16 :goto_7e

    .line 18
    .line 19
    :catch_12
    move-exception v2

    .line 20
    goto/16 :goto_82

    .line 21
    .line 22
    :cond_15
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    if-eqz v2, :cond_33

    .line 27
    .line 28
    invoke-virtual {v2}, Lax/c3/k;->k0()Z

    .line 29
    .line 30
    .line 31
    move-result v2
    :try_end_1f
    .catch Ljava/util/zip/ZipException; {:try_start_2 .. :try_end_1f} :catch_12
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_1f} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_1f} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_1f} :catch_b

    .line 32
    if-eqz v2, :cond_33

    .line 33
    .line 34
    :try_start_21
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 41
    .line 42
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 43
    .line 44
    if-nez v2, :cond_2e

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2e
    invoke-direct {p0, p1}, Lax/W2/u$h;->E(Lax/W2/u$e;)V
    :try_end_31
    .catch Lax/b3/j; {:try_start_21 .. :try_end_31} :catch_32
    .catch Ljava/util/zip/ZipException; {:try_start_21 .. :try_end_31} :catch_12
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_31} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_21 .. :try_end_31} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_21 .. :try_end_31} :catch_b

    .line 48
    .line 49
    .line 50
    goto :goto_85

    .line 51
    :catch_32
    return v1

    .line 52
    :cond_33
    :try_start_33
    iget-object v2, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 53
    .line 54
    instance-of v5, v2, Lcom/voxdon/xplorer/file/y;

    .line 55
    .line 56
    if-eqz v5, :cond_72

    .line 57
    .line 58
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 59
    .line 60
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_57

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 67
    .line 68
    .line 69
    move-result v5
    :try_end_45
    .catch Ljava/util/zip/ZipException; {:try_start_33 .. :try_end_45} :catch_12
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_45} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_33 .. :try_end_45} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_33 .. :try_end_45} :catch_b

    .line 70
    if-eqz v5, :cond_57

    .line 71
    .line 72
    :try_start_47
    invoke-direct {p0, v2}, Lax/W2/u$h;->y(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 77
    .line 78
    iput-wide v3, p1, Lax/W2/u$e;->i:J

    .line 79
    .line 80
    if-nez v2, :cond_52

    .line 81
    .line 82
    return v1

    .line 83
    :cond_52
    invoke-direct {p0, p1}, Lax/W2/u$h;->E(Lax/W2/u$e;)V
    :try_end_55
    .catch Lax/b3/j; {:try_start_47 .. :try_end_55} :catch_56
    .catch Ljava/util/zip/ZipException; {:try_start_47 .. :try_end_55} :catch_12
    .catch Ljava/io/IOException; {:try_start_47 .. :try_end_55} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_47 .. :try_end_55} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_47 .. :try_end_55} :catch_b

    .line 84
    .line 85
    .line 86
    goto :goto_85

    .line 87
    :catch_56
    return v1

    .line 88
    :cond_57
    :try_start_57
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v2}, Lax/Dc/e;->a(Ljava/io/File;)Ljava/nio/charset/Charset;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    iput-wide v4, p1, Lax/W2/u$e;->l:J

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v2, v3}, Lax/Dc/T;->s0(Ljava/io/File;Ljava/lang/String;)Lax/Dc/T;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iput-object v2, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 111
    .line 112
    iput-boolean v0, p1, Lax/W2/u$e;->p:Z

    .line 113
    .line 114
    goto :goto_85

    .line 115
    :cond_72
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_75
    .catch Ljava/util/zip/ZipException; {:try_start_57 .. :try_end_75} :catch_12
    .catch Ljava/io/IOException; {:try_start_57 .. :try_end_75} :catch_f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_57 .. :try_end_75} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_57 .. :try_end_75} :catch_b

    .line 116
    .line 117
    .line 118
    return v1

    .line 119
    :goto_76
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    goto :goto_85

    .line 123
    :goto_7a
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    goto :goto_85

    .line 127
    :goto_7e
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 128
    .line 129
    .line 130
    goto :goto_85

    .line 131
    :goto_82
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    :goto_85
    iget-object v2, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 135
    .line 136
    if-nez v2, :cond_8a

    .line 137
    .line 138
    return v1

    .line 139
    :cond_8a
    :try_start_8a
    invoke-static {v2, p0}, Lcom/voxdon/xplorer/file/b;->d1(Lax/Dc/S;Lax/u3/c;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    iput-boolean v2, p1, Lax/W2/u$e;->r:Z

    .line 144
    .line 145
    iget-object v2, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 146
    .line 147
    invoke-static {v2, p1, p0}, Lax/W2/u;->y0(Lax/W2/u;Lax/W2/u$e;Lax/u3/c;)V
    :try_end_95
    .catch Lax/b3/a; {:try_start_8a .. :try_end_95} :catch_96

    .line 148
    .line 149
    .line 150
    return v0

    .line 151
    :catch_96
    return v1
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

.method private y(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/voxdon/xplorer/file/x;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/x;->U0(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method protected B(Ljava/lang/Boolean;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

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

.method protected C(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_17

    .line 6
    .line 7
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0}, Lax/W2/u;->E0(Lax/W2/u;I)I

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 14
    .line 15
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 19
    .line 20
    invoke-static {p1}, Lax/W2/u;->w0(Lax/W2/u;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 25
    .line 26
    invoke-static {p1}, Lax/W2/u;->G0(Lax/W2/u;)Lax/W2/u$e;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p1, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 31
    .line 32
    sget-object v1, Lax/W2/t$a;->f0:Lax/W2/t$a;

    .line 33
    .line 34
    if-ne v0, v1, :cond_31

    .line 35
    .line 36
    iget-boolean v0, p1, Lax/W2/u$e;->o:Z

    .line 37
    .line 38
    if-eqz v0, :cond_31

    .line 39
    .line 40
    iget-object v0, p1, Lax/W2/u$e;->s:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v0, :cond_31

    .line 43
    .line 44
    iget-object v0, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lax/W2/u;->J0(Lax/W2/u;Lax/W2/u$e;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    iget-object v0, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 51
    .line 52
    invoke-static {v0, p1}, Lax/W2/u;->L0(Lax/W2/u;Lax/W2/u$e;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 56
    .line 57
    invoke-virtual {p1}, Lax/W2/j;->o()V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/u$h;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

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
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/u$h;->B(Ljava/lang/Boolean;)V

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
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/u$h;->C(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 4

    .line 1
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 2
    .line 3
    invoke-static {p1}, Lax/W2/u;->C0(Lax/W2/u;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_64

    .line 8
    .line 9
    :goto_8
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 10
    .line 11
    invoke-static {p1}, Lax/W2/u;->D0(Lax/W2/u;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v0, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 16
    .line 17
    invoke-static {v0}, Lax/W2/u;->F0(Lax/W2/u;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ge p1, v0, :cond_61

    .line 26
    .line 27
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 28
    .line 29
    invoke-static {p1}, Lax/W2/u;->G0(Lax/W2/u;)Lax/W2/u$e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p1, Lax/W2/u$e;->e:Lcom/voxdon/xplorer/file/n;

    .line 34
    .line 35
    invoke-static {v0}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2b

    .line 40
    .line 41
    check-cast v0, Lax/c3/k;

    .line 42
    .line 43
    goto :goto_47

    .line 44
    :cond_2b
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5b

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lax/c3/x;->f(Ljava/io/File;)Lcom/voxdon/xplorer/file/o;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :try_start_3d
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lcom/voxdon/xplorer/file/y;
    :try_end_47
    .catch Lax/b3/j; {:try_start_3d .. :try_end_47} :catch_58

    .line 71
    .line 72
    :goto_47
    iput-object v0, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 73
    .line 74
    invoke-direct {p0, p1}, Lax/W2/u$h;->F(Lax/W2/u$e;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_52

    .line 79
    .line 80
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_52
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 84
    .line 85
    invoke-static {p1}, Lax/W2/u;->H0(Lax/W2/u;)V

    .line 86
    .line 87
    .line 88
    goto :goto_8

    .line 89
    :catch_58
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_5b
    invoke-static {}, Lax/u3/b;->f()V

    .line 93
    .line 94
    .line 95
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_61
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_64
    iget-object p1, p0, Lax/W2/u$h;->h:Lax/W2/u;

    .line 102
    .line 103
    invoke-static {p1}, Lax/W2/u;->G0(Lax/W2/u;)Lax/W2/u$e;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Lax/W2/u$h;->F(Lax/W2/u$e;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1
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

.method x(Lax/W2/u$e;)Ljava/io/FileInputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    new-instance v0, Ljava/io/FileInputStream;

    .line 6
    .line 7
    iget-object p1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_10
    iget-object v0, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 18
    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v0, :cond_38

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/c3/k;->k0()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_38

    .line 29
    .line 30
    :try_start_1d
    iget-object v0, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-virtual {v0, v4}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 38
    .line 39
    iput-wide v1, p1, Lax/W2/u$e;->i:J

    .line 40
    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_2b
    new-instance v0, Ljava/io/FileInputStream;

    .line 45
    .line 46
    iget-object p1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_36
    .catch Lax/b3/j; {:try_start_1d .. :try_end_36} :catch_37

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :catch_37
    return-object v3

    .line 57
    :cond_38
    iget-object v0, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 58
    .line 59
    instance-of v4, v0, Lcom/voxdon/xplorer/file/y;

    .line 60
    .line 61
    if-eqz v4, :cond_6e

    .line 62
    .line 63
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 64
    .line 65
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_64

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_64

    .line 76
    .line 77
    :try_start_4c
    invoke-direct {p0, v0}, Lax/W2/u$h;->y(Lcom/voxdon/xplorer/file/y;)Landroid/os/ParcelFileDescriptor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 82
    .line 83
    iput-wide v1, p1, Lax/W2/u$e;->i:J

    .line 84
    .line 85
    if-nez v0, :cond_57

    .line 86
    .line 87
    return-object v3

    .line 88
    :cond_57
    new-instance v0, Ljava/io/FileInputStream;

    .line 89
    .line 90
    iget-object p1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_62
    .catch Lax/b3/j; {:try_start_4c .. :try_end_62} :catch_63

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :catch_63
    return-object v3

    .line 101
    :cond_64
    new-instance p1, Ljava/io/FileInputStream;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_6e
    return-object v3
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

.method z(Ljava/io/FileInputStream;Lax/W2/u$e;)Ljava/io/InputStream;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p2, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-nez p2, :cond_8

    .line 4
    .line 5
    invoke-static {}, Lax/u3/b;->f()V

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_8
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, ".tar.xz"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_37

    .line 22
    .line 23
    const-string v0, ".txz"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_37

    .line 32
    :cond_1f
    const-string v0, ".tar.gz"

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_31

    .line 39
    .line 40
    const-string v0, ".tgz"

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_30

    .line 47
    .line 48
    goto :goto_31

    .line 49
    :cond_30
    return-object p1

    .line 50
    :cond_31
    :goto_31
    new-instance p2, Lax/Hc/a;

    .line 51
    .line 52
    invoke-direct {p2, p1}, Lax/Hc/a;-><init>(Ljava/io/InputStream;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_37
    :goto_37
    new-instance p2, Lax/Jc/a;

    .line 57
    .line 58
    invoke-direct {p2, p1}, Lax/Jc/a;-><init>(Ljava/io/InputStream;)V

    .line 59
    .line 60
    .line 61
    return-object p2
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
