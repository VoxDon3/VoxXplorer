.class public Lcom/voxdon/xplorer/file/L;
.super Lcom/voxdon/xplorer/file/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/L$j;,
        Lcom/voxdon/xplorer/file/L$d;,
        Lcom/voxdon/xplorer/file/L$h;,
        Lcom/voxdon/xplorer/file/L$e;,
        Lcom/voxdon/xplorer/file/L$f;,
        Lcom/voxdon/xplorer/file/L$g;,
        Lcom/voxdon/xplorer/file/L$i;
    }
.end annotation


# static fields
.field static A:Lcom/jcraft/jsch/SocketFactory;

.field private static final y:Ljava/util/logging/Logger;

.field static z:Lcom/voxdon/xplorer/file/L$j;


# instance fields
.field private final h:Ljava/lang/Object;

.field private i:Z

.field private j:Lcom/jcraft/jsch/Session;

.field private k:Lcom/jcraft/jsch/Session;

.field private l:Ljava/util/concurrent/atomic/AtomicInteger;

.field private m:Ljava/util/concurrent/atomic/AtomicInteger;

.field private n:Lcom/voxdon/xplorer/file/L$h;

.field private o:Lcom/voxdon/xplorer/file/L$h;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:I

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Landroid/os/Handler;

.field private x:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.SftpFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/L;->y:Ljava/util/logging/Logger;

    .line 8
    .line 9
    new-instance v0, Lcom/voxdon/xplorer/file/L$b;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/voxdon/xplorer/file/L$b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/voxdon/xplorer/file/L;->A:Lcom/jcraft/jsch/SocketFactory;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L;->h:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L;->w:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lcom/voxdon/xplorer/file/L$a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/file/L$a;-><init>(Lcom/voxdon/xplorer/file/L;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/voxdon/xplorer/file/L;->x:Ljava/lang/Runnable;

    .line 28
    .line 29
    invoke-static {}, Lcom/voxdon/xplorer/file/L;->E0()V

    .line 30
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public static A0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/L$j;
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/L;->z:Lcom/voxdon/xplorer/file/L$j;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/file/L$j;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/file/L$j;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/voxdon/xplorer/file/L;->z:Lcom/voxdon/xplorer/file/L$j;

    .line 15
    .line 16
    :cond_f
    sget-object p0, Lcom/voxdon/xplorer/file/L;->z:Lcom/voxdon/xplorer/file/L$j;

    .line 17
    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private B0()Lcom/voxdon/xplorer/file/L$e;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/L;->x0(Z)Lcom/voxdon/xplorer/file/L$e;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method static C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/Session;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jcraft/jsch/JSchException;
        }
    .end annotation

    .line 1
    if-eqz p4, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    :try_start_5
    new-instance v1, Lcom/jcraft/jsch/JSch;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/jcraft/jsch/JSch;-><init>()V

    .line 9
    .line 10
    .line 11
    if-eqz p5, :cond_14

    .line 12
    .line 13
    new-instance v2, Lax/c3/j0;

    .line 14
    .line 15
    invoke-direct {v2, p5}, Lax/c3/j0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lcom/jcraft/jsch/JSch;->o(Lcom/jcraft/jsch/HostKeyRepository;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    const/4 p5, 0x0

    .line 22
    if-eqz v0, :cond_36

    .line 23
    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2
    :try_end_1b
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_1b} :catch_67
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_1b} :catch_5e
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_1b} :catch_55

    .line 28
    const-string v3, "UTF-8"

    .line 29
    .line 30
    if-nez v2, :cond_24

    .line 31
    .line 32
    :try_start_1f
    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_25

    .line 37
    :cond_24
    move-object v2, p5

    .line 38
    :goto_25
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_30

    .line 43
    .line 44
    invoke-virtual {p4, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    move-object p4, p5

    .line 50
    :goto_31
    const-string v3, "name"

    .line 51
    .line 52
    invoke-virtual {v1, v3, p4, p5, v2}, Lcom/jcraft/jsch/JSch;->d(Ljava/lang/String;[B[B[B)V

    .line 53
    .line 54
    .line 55
    :cond_36
    invoke-virtual {v1, p0, p2, p3}, Lcom/jcraft/jsch/JSch;->l(Ljava/lang/String;Ljava/lang/String;I)Lcom/jcraft/jsch/Session;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-nez v0, :cond_47

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/Session;->a0(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Lcom/voxdon/xplorer/file/L$g;

    .line 65
    .line 66
    invoke-direct {p2, p1, p5}, Lcom/voxdon/xplorer/file/L$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Lcom/jcraft/jsch/Session;->j0(Lcom/jcraft/jsch/UserInfo;)V

    .line 70
    .line 71
    .line 72
    :cond_47
    if-eqz p6, :cond_4c

    .line 73
    .line 74
    invoke-virtual {p0, p6}, Lcom/jcraft/jsch/Session;->X(Lcom/jcraft/jsch/HostKeyConf;)V

    .line 75
    .line 76
    .line 77
    :cond_4c
    sget-object p1, Lcom/voxdon/xplorer/file/L;->A:Lcom/jcraft/jsch/SocketFactory;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/Session;->h0(Lcom/jcraft/jsch/SocketFactory;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/jcraft/jsch/Session;->q()V
    :try_end_54
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1f .. :try_end_54} :catch_67
    .catch Ljava/lang/NullPointerException; {:try_start_1f .. :try_end_54} :catch_5e
    .catch Ljava/lang/RuntimeException; {:try_start_1f .. :try_end_54} :catch_55

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :catch_55
    move-exception p0

    .line 87
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    .line 88
    .line 89
    const-string p2, "sftp session error"

    .line 90
    .line 91
    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :catch_5e
    move-exception p0

    .line 96
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    .line 97
    .line 98
    const-string p2, "unsupported key"

    .line 99
    .line 100
    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :catch_67
    move-exception p0

    .line 105
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    .line 106
    .line 107
    const-string p2, "unsupported encoding"

    .line 108
    .line 109
    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw p1
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
.end method

.method private D0()Lcom/voxdon/xplorer/file/L$e;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/L;->x0(Z)Lcom/voxdon/xplorer/file/L$e;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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

.method private static E0()V
    .registers 4

    .line 1
    const-string v0, "PreferredAuthentications"

    .line 2
    .line 3
    const-string v1, "gssapi-with-mic,publickey,password,keyboard-interactive"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "MaxAuthTries"

    .line 9
    .line 10
    const-string v1, "3"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :try_start_f
    const-string v1, "EC"

    .line 17
    .line 18
    invoke-static {v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_15
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_f .. :try_end_15} :catch_19

    .line 22
    if-eqz v1, :cond_1a

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_1a

    .line 26
    :catch_19
    nop

    .line 27
    :cond_1a
    :goto_1a
    const-string v1, "kex"

    .line 28
    .line 29
    const-string v2, "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256,diffie-hellman-group14-sha1"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "cipher.s2c"

    .line 35
    .line 36
    const-string v2, "aes128-ctr,aes192-ctr,aes256-ctr,aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v1, "cipher.c2s"

    .line 42
    .line 43
    invoke-static {v1, v2}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "PubkeyAcceptedAlgorithmsOldServer"

    .line 47
    .line 48
    const-string v2, "PubkeyAcceptedAlgorithms"

    .line 49
    .line 50
    const-string v3, "server_host_key"

    .line 51
    .line 52
    if-eqz v0, :cond_43

    .line 53
    .line 54
    const-string v0, "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss"

    .line 55
    .line 56
    invoke-static {v3, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss"

    .line 63
    .line 64
    invoke-static {v1, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_50

    .line 68
    :cond_43
    const-string v0, "ssh-ed25519,rsa-sha2-512,rsa-sha2-256,ssh-rsa,ssh-dss"

    .line 69
    .line 70
    invoke-static {v3, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, "ssh-ed25519,ssh-rsa,rsa-sha2-256,rsa-sha2-512,ssh-dss"

    .line 77
    .line 78
    invoke-static {v1, v0}, Lcom/jcraft/jsch/JSch;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_50
    return-void
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

.method private F0()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    :goto_10
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    if-eqz v3, :cond_1d

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1b

    .line 26
    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    const/4 v3, 0x0

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    :goto_1d
    const/4 v3, 0x1

    .line 31
    :goto_1e
    if-eqz v0, :cond_23

    .line 32
    .line 33
    if-eqz v3, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    return v2
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

.method public static G0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Z
    .registers 8

    .line 1
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x80000

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    cmp-long v5, v0, v2

    .line 10
    .line 11
    if-lez v5, :cond_d

    .line 12
    .line 13
    return v4

    .line 14
    :cond_d
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_10
    invoke-virtual {p0, p1, v0, v1}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_14
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_10 .. :try_end_14} :catch_7d
    .catch Lax/b3/j; {:try_start_10 .. :try_end_14} :catch_7b
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_14} :catch_79
    .catch Ljava/lang/OutOfMemoryError; {:try_start_10 .. :try_end_14} :catch_5d
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_14} :catch_41
    .catchall {:try_start_10 .. :try_end_14} :catchall_3f

    .line 21
    :try_start_14
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    long-to-int p1, v0

    .line 26
    invoke-static {p0, p1}, Lax/c3/F;->h(Ljava/io/InputStream;I)[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lcom/jcraft/jsch/JSch;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/jcraft/jsch/JSch;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p1, v2}, Lcom/jcraft/jsch/KeyPair;->v(Lcom/jcraft/jsch/JSch;[B[B)Lcom/jcraft/jsch/KeyPair;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_26
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_14 .. :try_end_26} :catch_3d
    .catch Lax/b3/j; {:try_start_14 .. :try_end_26} :catch_3b
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_26} :catch_38
    .catch Ljava/lang/OutOfMemoryError; {:try_start_14 .. :try_end_26} :catch_35
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_26} :catch_32
    .catchall {:try_start_14 .. :try_end_26} :catchall_2f

    .line 39
    if-eqz p1, :cond_29

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    :cond_29
    if-eqz p0, :cond_2e

    .line 43
    .line 44
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    return v4

    .line 48
    :catchall_2f
    move-exception p1

    .line 49
    move-object v2, p0

    .line 50
    goto :goto_87

    .line 51
    :catch_32
    move-exception p1

    .line 52
    move-object v2, p0

    .line 53
    goto :goto_42

    .line 54
    :catch_35
    move-exception p1

    .line 55
    move-object v2, p0

    .line 56
    goto :goto_5e

    .line 57
    :catch_38
    move-exception p1

    .line 58
    :goto_39
    move-object v2, p0

    .line 59
    goto :goto_7e

    .line 60
    :catch_3b
    move-exception p1

    .line 61
    goto :goto_39

    .line 62
    :catch_3d
    move-exception p1

    .line 63
    goto :goto_39

    .line 64
    :catchall_3f
    move-exception p1

    .line 65
    goto :goto_87

    .line 66
    :catch_41
    move-exception p1

    .line 67
    :goto_42
    :try_start_42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "SSH KEY RUNTIME"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lax/Ha/b;->h()V
    :try_end_57
    .catchall {:try_start_42 .. :try_end_57} :catchall_3f

    .line 86
    .line 87
    .line 88
    if-eqz v2, :cond_5c

    .line 89
    .line 90
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 91
    .line 92
    .line 93
    :cond_5c
    return v4

    .line 94
    :catch_5d
    move-exception p1

    .line 95
    :goto_5e
    :try_start_5e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string v0, "SSH KEY OOM"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Lax/Ha/b;->h()V
    :try_end_73
    .catchall {:try_start_5e .. :try_end_73} :catchall_3f

    .line 114
    .line 115
    .line 116
    if-eqz v2, :cond_78

    .line 117
    .line 118
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 119
    .line 120
    .line 121
    :cond_78
    return v4

    .line 122
    :catch_79
    move-exception p1

    .line 123
    goto :goto_7e

    .line 124
    :catch_7b
    move-exception p1

    .line 125
    goto :goto_7e

    .line 126
    :catch_7d
    move-exception p1

    .line 127
    :goto_7e
    :try_start_7e
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_81
    .catchall {:try_start_7e .. :try_end_81} :catchall_3f

    .line 128
    .line 129
    .line 130
    if-eqz v2, :cond_86

    .line 131
    .line 132
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 133
    .line 134
    .line 135
    :cond_86
    return v4

    .line 136
    :goto_87
    if-eqz v2, :cond_8c

    .line 137
    .line 138
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 139
    .line 140
    .line 141
    :cond_8c
    throw p1
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
.end method

.method private H0(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/L;->i:Z

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

.method private K0(Lcom/jcraft/jsch/Session;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->l:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_15

    .line 13
    .line 14
    :try_start_d
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 15
    .line 16
    const/16 v1, 0x3a98

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcom/jcraft/jsch/Session;->g0(I)V
    :try_end_14
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_d .. :try_end_14} :catch_17
    .catchall {:try_start_d .. :try_end_14} :catchall_15

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catchall_15
    move-exception p1

    .line 23
    goto :goto_25

    .line 24
    :catch_17
    :goto_17
    :try_start_17
    new-instance p1, Lcom/voxdon/xplorer/file/L$h;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Lcom/voxdon/xplorer/file/L$h;-><init>(Lcom/jcraft/jsch/Session;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->n:Lcom/voxdon/xplorer/file/L$h;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->M0()V

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_17 .. :try_end_26} :catchall_15

    .line 39
    throw p1
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

.method private L0(Lcom/jcraft/jsch/Session;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->m:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_15

    .line 13
    .line 14
    :try_start_d
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 15
    .line 16
    const/16 v1, 0x3a98

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcom/jcraft/jsch/Session;->g0(I)V
    :try_end_14
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_d .. :try_end_14} :catch_17
    .catchall {:try_start_d .. :try_end_14} :catchall_15

    .line 19
    .line 20
    .line 21
    goto :goto_17

    .line 22
    :catchall_15
    move-exception p1

    .line 23
    goto :goto_25

    .line 24
    :catch_17
    :goto_17
    :try_start_17
    new-instance p1, Lcom/voxdon/xplorer/file/L$h;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Lcom/voxdon/xplorer/file/L$h;-><init>(Lcom/jcraft/jsch/Session;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->o:Lcom/voxdon/xplorer/file/L$h;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->M0()V

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_17 .. :try_end_26} :catchall_15

    .line 39
    throw p1
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

.method private M0()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->w:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->x:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->F0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_17

    .line 13
    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->w:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->x:Ljava/lang/Runnable;

    .line 17
    .line 18
    const-wide/32 v2, 0x2bf20

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    .line 24
    :cond_17
    return-void
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
.end method

.method private N0(Z)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jcraft/jsch/JSchException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 4
    .line 5
    goto :goto_7

    .line 6
    :cond_5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 7
    .line 8
    :goto_7
    if-eqz v0, :cond_11

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/jcraft/jsch/Session;->J()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_10

    .line 15
    .line 16
    goto :goto_11

    .line 17
    :cond_10
    return-void

    .line 18
    :cond_11
    :goto_11
    sget-object v0, Lcom/voxdon/xplorer/file/L;->y:Ljava/util/logging/Logger;

    .line 19
    .line 20
    const-string v1, "SFTP session created"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v8, Lcom/voxdon/xplorer/file/L$f;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->v:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_21

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    const/4 v0, 0x0

    .line 35
    :goto_22
    invoke-direct {v8, v0, v1}, Lcom/voxdon/xplorer/file/L$f;-><init>(ZZ)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/voxdon/xplorer/file/L;->q:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L;->r:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/voxdon/xplorer/file/L;->s:Ljava/lang/String;

    .line 43
    .line 44
    iget v5, p0, Lcom/voxdon/xplorer/file/L;->t:I

    .line 45
    .line 46
    iget-object v6, p0, Lcom/voxdon/xplorer/file/L;->u:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v7, p0, Lcom/voxdon/xplorer/file/L;->v:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static/range {v2 .. v8}, Lcom/voxdon/xplorer/file/L;->C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/Session;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz p1, :cond_3b

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/L;->K0(Lcom/jcraft/jsch/Session;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/L;->L0(Lcom/jcraft/jsch/Session;)V

    .line 61
    .line 62
    .line 63
    return-void
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
.end method

.method private O0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->D0()Lcom/voxdon/xplorer/file/L$e;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_5
    invoke-virtual {p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    new-instance v3, Lcom/voxdon/xplorer/file/L$c;

    .line 11
    .line 12
    move-object v4, p0

    .line 13
    move-wide v6, p3

    .line 14
    move-object/from16 v8, p7

    .line 15
    .line 16
    move-object/from16 v5, p8

    .line 17
    .line 18
    invoke-direct/range {v3 .. v8}, Lcom/voxdon/xplorer/file/L$c;-><init>(Lcom/voxdon/xplorer/file/L;Lax/g3/i;JLax/u3/c;)V

    .line 19
    .line 20
    .line 21
    if-eqz p6, :cond_24

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v1, v2, p2, v3}, Lcom/voxdon/xplorer/file/L$e;->g(Ljava/io/InputStream;Ljava/lang/String;Lcom/jcraft/jsch/SftpProgressMonitor;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2b

    .line 31
    :catchall_1e
    move-exception v0

    .line 32
    move-object p1, v0

    .line 33
    goto :goto_6d

    .line 34
    :catch_21
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    goto :goto_66

    .line 37
    :cond_24
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v1, v2, p2, v3}, Lcom/voxdon/xplorer/file/L$e;->h(Ljava/io/InputStream;Ljava/lang/String;Lcom/jcraft/jsch/SftpProgressMonitor;)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    if-eqz p7, :cond_3a

    .line 45
    .line 46
    invoke-interface/range {p7 .. p7}, Lax/u3/c;->isCancelled()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_34

    .line 51
    .line 52
    goto :goto_3a

    .line 53
    :cond_34
    new-instance p1, Lax/b3/a;

    .line 54
    .line 55
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3a
    :goto_3a
    if-eqz p5, :cond_57

    .line 60
    .line 61
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide p2
    :try_end_40
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_5 .. :try_end_40} :catch_21
    .catchall {:try_start_5 .. :try_end_40} :catchall_1e

    .line 65
    const-wide/16 v5, 0x0

    .line 66
    .line 67
    cmp-long p4, p2, v5

    .line 68
    .line 69
    if-lez p4, :cond_57

    .line 70
    .line 71
    :try_start_46
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide p2

    .line 79
    const-wide/16 p4, 0x3e8

    .line 80
    .line 81
    div-long/2addr p2, p4

    .line 82
    long-to-int p3, p2

    .line 83
    invoke-virtual {v1, p1, p3}, Lcom/voxdon/xplorer/file/L$e;->n(Ljava/lang/String;I)V
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_46 .. :try_end_55} :catch_56
    .catchall {:try_start_46 .. :try_end_55} :catchall_1e

    .line 84
    .line 85
    .line 86
    goto :goto_57

    .line 87
    :catch_56
    nop

    .line 88
    :cond_57
    :goto_57
    if-eqz v2, :cond_62

    .line 89
    .line 90
    :try_start_59
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5c
    .catch Ljava/io/IOException; {:try_start_59 .. :try_end_5c} :catch_5d

    .line 91
    .line 92
    .line 93
    goto :goto_62

    .line 94
    :catch_5d
    move-exception v0

    .line 95
    move-object p1, v0

    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    :cond_62
    :goto_62
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_66
    :try_start_66
    const-string p2, "sftp writeFile"

    .line 104
    .line 105
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    throw p1
    :try_end_6d
    .catchall {:try_start_66 .. :try_end_6d} :catchall_1e

    .line 110
    :goto_6d
    if-eqz v2, :cond_78

    .line 111
    .line 112
    :try_start_6f
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_72
    .catch Ljava/io/IOException; {:try_start_6f .. :try_end_72} :catch_73

    .line 113
    .line 114
    .line 115
    goto :goto_78

    .line 116
    :catch_73
    move-exception v0

    .line 117
    move-object p2, v0

    .line 118
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 119
    .line 120
    .line 121
    :cond_78
    :goto_78
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 122
    .line 123
    .line 124
    throw p1
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
.end method

.method static synthetic k0(Lcom/voxdon/xplorer/file/L;)Ljava/lang/Object;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/file/L;->h:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic l0(Lcom/voxdon/xplorer/file/L;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->F0()Z

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

.method static synthetic m0()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/L;->y:Ljava/util/logging/Logger;

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

.method static synthetic n0(Lcom/voxdon/xplorer/file/L;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->v0()V

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

.method static synthetic o0()V
    .registers 0

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/file/L;->E0()V

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

.method static synthetic p0(Lcom/voxdon/xplorer/file/L;Lcom/jcraft/jsch/Session;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/L;->K0(Lcom/jcraft/jsch/Session;)V

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

.method static synthetic q0(Lcom/voxdon/xplorer/file/L;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/L;->H0(Z)V

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

.method static synthetic r0(Lcom/voxdon/xplorer/file/L;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->M0()V

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

.method private s0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->w:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->x:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

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
.end method

.method static t0(Ljava/lang/String;Ljava/lang/String;I)Lcom/voxdon/xplorer/file/L$f;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jcraft/jsch/JSchException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/L$f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/voxdon/xplorer/file/L$f;-><init>(ZZ)V

    .line 5
    .line 6
    .line 7
    :try_start_6
    new-instance v1, Lcom/jcraft/jsch/JSch;

    .line 8
    .line 9
    invoke-direct {v1}, Lcom/jcraft/jsch/JSch;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0, p1, p2}, Lcom/jcraft/jsch/JSch;->l(Ljava/lang/String;Ljava/lang/String;I)Lcom/jcraft/jsch/Session;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, v0}, Lcom/jcraft/jsch/Session;->X(Lcom/jcraft/jsch/HostKeyConf;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/jcraft/jsch/Session;->q()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/jcraft/jsch/Session;->s()V
    :try_end_18
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_6 .. :try_end_18} :catch_1d
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_18} :catch_1b
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_18} :catch_19

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :catch_19
    move-exception p0

    .line 27
    goto :goto_1f

    .line 28
    :catch_1b
    move-exception p0

    .line 29
    goto :goto_41

    .line 30
    :catch_1d
    move-exception p0

    .line 31
    goto :goto_63

    .line 32
    :goto_1f
    invoke-static {v0}, Lcom/voxdon/xplorer/file/L$f;->d(Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/HostKey;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_26

    .line 37
    .line 38
    goto :goto_69

    .line 39
    :cond_26
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    .line 40
    .line 41
    new-instance p2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v0, "sftp session error : "

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :goto_41
    invoke-static {v0}, Lcom/voxdon/xplorer/file/L$f;->d(Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/HostKey;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_48

    .line 71
    .line 72
    goto :goto_69

    .line 73
    :cond_48
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    .line 74
    .line 75
    new-instance p2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "unsupported key : "

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :goto_63
    invoke-static {v0}, Lcom/voxdon/xplorer/file/L$f;->d(Lcom/voxdon/xplorer/file/L$f;)Lcom/jcraft/jsch/HostKey;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_6a

    .line 105
    .line 106
    :goto_69
    return-object v0

    .line 107
    :cond_6a
    throw p0
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
.end method

.method private u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;
    .registers 5

    .line 1
    iget v0, p2, Lcom/jcraft/jsch/SftpException;->q:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_b

    .line 5
    .line 6
    new-instance v0, Lax/b3/e;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lax/b3/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_14

    .line 14
    .line 15
    new-instance p1, Lax/b3/t;

    .line 16
    .line 17
    invoke-direct {p1, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_14
    invoke-static {p1, p2}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
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

.method private v0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jcraft/jsch/Session;->J()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->j:Lcom/jcraft/jsch/Session;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jcraft/jsch/Session;->s()V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 17
    .line 18
    if-eqz v0, :cond_1e

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/jcraft/jsch/Session;->J()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1e

    .line 25
    .line 26
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->k:Lcom/jcraft/jsch/Session;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/jcraft/jsch/Session;->s()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method public static w0(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/StringReader;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_2e

    .line 16
    .line 17
    const-string v0, "-"

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "BEGIN"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2d

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_2d
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_2d} :catch_2e

    .line 46
    :cond_2d
    return-object p0

    .line 47
    :catch_2e
    :cond_2e
    const-string p0, "########"

    .line 48
    .line 49
    return-object p0
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

.method private x0(Z)Lcom/voxdon/xplorer/file/L$e;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_3
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_0 .. :try_end_3} :catch_42
    .catch Lax/b3/K; {:try_start_0 .. :try_end_3} :catch_40

    .line 4
    :try_start_3
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/L;->N0(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->n:Lcom/voxdon/xplorer/file/L$h;

    .line 10
    .line 11
    goto :goto_f

    .line 12
    :catchall_b
    move-exception p1

    .line 13
    goto :goto_3e

    .line 14
    :cond_d
    iget-object v1, p0, Lcom/voxdon/xplorer/file/L;->o:Lcom/voxdon/xplorer/file/L$h;

    .line 15
    .line 16
    :goto_f
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/L$h;->f()Lcom/jcraft/jsch/ChannelSftp;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_36

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->s0()V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_28

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 30
    .line 31
    .line 32
    new-instance p1, Lcom/voxdon/xplorer/file/L$e;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-direct {p1, p0, v1, v2, v3}, Lcom/voxdon/xplorer/file/L$e;-><init>(Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/L$h;Lcom/jcraft/jsch/ChannelSftp;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-object p1

    .line 41
    :cond_28
    iget-object p1, p0, Lcom/voxdon/xplorer/file/L;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 44
    .line 45
    .line 46
    new-instance p1, Lcom/voxdon/xplorer/file/L$e;

    .line 47
    .line 48
    iget-object v3, p0, Lcom/voxdon/xplorer/file/L;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-direct {p1, p0, v1, v2, v3}, Lcom/voxdon/xplorer/file/L$e;-><init>(Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/L$h;Lcom/jcraft/jsch/ChannelSftp;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-object p1

    .line 55
    :cond_36
    new-instance p1, Lax/b3/j;

    .line 56
    .line 57
    const-string v1, "open channel returns null"

    .line 58
    .line 59
    invoke-direct {p1, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :goto_3e
    monitor-exit v0
    :try_end_3f
    .catchall {:try_start_3 .. :try_end_3f} :catchall_b

    .line 64
    :try_start_3f
    throw p1
    :try_end_40
    .catch Lcom/jcraft/jsch/JSchException; {:try_start_3f .. :try_end_40} :catch_42
    .catch Lax/b3/K; {:try_start_3f .. :try_end_40} :catch_40

    .line 65
    :catch_40
    move-exception p1

    .line 66
    goto :goto_44

    .line 67
    :catch_42
    move-exception p1

    .line 68
    goto :goto_4e

    .line 69
    :goto_44
    new-instance v0, Lax/b3/j;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1, p1}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :goto_4e
    const-string v0, "getChannelWrapper"

    .line 80
    .line 81
    invoke-static {v0, p1}, Lax/b3/d;->b(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1
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

.method public static y0()I
    .registers 1

    .line 1
    const/16 v0, 0x16

    return v0
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/m;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

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
    .registers 2

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 10
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
    const-string p2, "/"

    .line 2
    .line 3
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b9

    .line 8
    .line 9
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    :try_start_1c
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/L$e;->d(Ljava/lang/String;)Ljava/util/Vector;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :cond_24
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_90

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v4, v3, Lcom/jcraft/jsch/ChannelSftp$LsEntry;

    .line 48
    .line 49
    if-eqz v4, :cond_24

    .line 50
    .line 51
    check-cast v3, Lcom/jcraft/jsch/ChannelSftp$LsEntry;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/jcraft/jsch/ChannelSftp$LsEntry;->j()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4}, Lax/c3/d0;->C(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_24

    .line 62
    .line 63
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_66

    .line 68
    .line 69
    invoke-virtual {v4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_66

    .line 74
    .line 75
    invoke-virtual {v4, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_51

    .line 80
    .line 81
    goto :goto_66

    .line 82
    :cond_51
    invoke-static {p1, v4}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    new-instance v5, Lcom/voxdon/xplorer/file/M;

    .line 87
    .line 88
    invoke-virtual {v3}, Lcom/jcraft/jsch/ChannelSftp$LsEntry;->h()Lcom/jcraft/jsch/SftpATTRS;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-direct {v5, p0, v0, v3, v4}, Lcom/voxdon/xplorer/file/M;-><init>(Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/L$e;Lcom/jcraft/jsch/SftpATTRS;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_24

    .line 99
    :catchall_62
    move-exception p1

    .line 100
    goto :goto_b5

    .line 101
    :catch_64
    move-exception p1

    .line 102
    goto :goto_94

    .line 103
    :cond_66
    :goto_66
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v5, "SFTP CHILD NAME:"

    .line 108
    .line 109
    invoke-virtual {v3, v5}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v5, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v6, ":"

    .line 126
    .line 127
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v3, v4}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Lax/Ha/b;->h()V
    :try_end_8f
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_1c .. :try_end_8f} :catch_64
    .catchall {:try_start_1c .. :try_end_8f} :catchall_62

    .line 142
    .line 143
    .line 144
    goto :goto_24

    .line 145
    :cond_90
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :goto_94
    :try_start_94
    iget p2, p1, Lcom/jcraft/jsch/SftpException;->q:I

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    if-eq p2, v1, :cond_af

    .line 153
    .line 154
    const/4 v1, 0x4

    .line 155
    if-ne p2, v1, :cond_a5

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->a()V

    .line 158
    .line 159
    .line 160
    new-instance p2, Lax/b3/E;

    .line 161
    .line 162
    invoke-direct {p2, p1}, Lax/b3/E;-><init>(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw p2

    .line 166
    :cond_a5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->a()V

    .line 167
    .line 168
    .line 169
    const-string p2, "listChildren"

    .line 170
    .line 171
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    throw p1

    .line 176
    :cond_af
    new-instance p2, Lax/b3/e;

    .line 177
    .line 178
    invoke-direct {p2, p1}, Lax/b3/e;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    throw p2
    :try_end_b5
    .catchall {:try_start_94 .. :try_end_b5} :catchall_62

    .line 182
    :goto_b5
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_b9
    new-instance p1, Lax/b3/t;

    .line 187
    .line 188
    invoke-direct {p1}, Lax/b3/t;-><init>()V

    .line 189
    .line 190
    .line 191
    throw p1
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
    .registers 20
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
    const/4 v6, 0x0

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-wide v3, p4

    .line 13
    move-object v5, p6

    .line 14
    move-object/from16 v7, p9

    .line 15
    .line 16
    move-object/from16 v8, p10

    .line 17
    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/voxdon/xplorer/file/L;->O0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V

    .line 19
    .line 20
    .line 21
    return-void
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
    .registers 7
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
    move-result p3

    .line 5
    invoke-static {p3}, Lax/u3/b;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    :try_start_b
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p3, p1, p2}, Lcom/voxdon/xplorer/file/L$e;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    if-eqz p4, :cond_24

    .line 28
    .line 29
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V
    :try_end_1f
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_b .. :try_end_1f} :catch_22
    .catchall {:try_start_b .. :try_end_1f} :catchall_20

    .line 30
    .line 31
    .line 32
    goto :goto_24

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_43

    .line 35
    :catch_22
    move-exception p1

    .line 36
    goto :goto_28

    .line 37
    :cond_24
    :goto_24
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_28
    :try_start_28
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    new-instance p2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string p4, "moveFile 2:"

    .line 50
    .line 51
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget p4, p1, Lcom/jcraft/jsch/SftpException;->q:I

    .line 55
    .line 56
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    throw p1
    :try_end_43
    .catchall {:try_start_28 .. :try_end_43} :catchall_20

    .line 68
    :goto_43
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 69
    .line 70
    .line 71
    throw p1
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

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->s(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-interface {p1}, Lax/c3/b;->s()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->D()Lcom/voxdon/xplorer/file/p;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p2

    .line 28
    move-object v9, p3

    .line 29
    move-object v10, p4

    .line 30
    invoke-virtual/range {v0 .. v10}, Lcom/voxdon/xplorer/file/L;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 3

    .line 1
    const/4 p1, -0x1

    return p1
.end method

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->Z(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_8
    invoke-static {p1}, Lcom/voxdon/xplorer/file/m;->S(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string p1, "not support delete file recursively"

    .line 2
    .line 3
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

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

.method I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .registers 7

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->q:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/L;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/file/L;->s:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/voxdon/xplorer/file/L;->t:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/voxdon/xplorer/file/L;->u:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/voxdon/xplorer/file/L;->v:Ljava/lang/String;

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

.method public J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    new-instance v1, Lcom/voxdon/xplorer/file/L$i;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/L$e;->b(Ljava/lang/String;J)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v1, p0, v0, p1}, Lcom/voxdon/xplorer/file/L$i;-><init>(Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/L$e;Ljava/io/InputStream;)V
    :try_end_11
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_4 .. :try_end_11} :catch_12

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :catch_12
    move-exception p1

    .line 20
    const-string p2, "sftp getInputStream"

    .line 21
    .line 22
    invoke-direct {p0, p2, p1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    throw p1
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

.method public J0(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->p:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iput-object p1, p0, Lcom/voxdon/xplorer/file/L;->p:Ljava/lang/String;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public K(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 6

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_1
    new-instance p2, Lcom/voxdon/xplorer/file/L$d;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->t()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {p2, v0, p0, p3, v1}, Lcom/voxdon/xplorer/file/L$d;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/c$a;I)V

    .line 13
    .line 14
    .line 15
    new-array v0, p1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_13} :catch_14

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_14
    move-exception p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_24

    .line 26
    .line 27
    invoke-interface {p3}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p3, p1, p2}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    return-void
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
    const/4 v0, 0x1

    return v0
.end method

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/L$e;->f(Ljava/lang/String;)V
    :try_end_c
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_1 .. :try_end_c} :catch_15
    .catch Lax/b3/j; {:try_start_1 .. :try_end_c} :catch_13
    .catchall {:try_start_1 .. :try_end_c} :catchall_11

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :catchall_11
    move-exception p1

    .line 19
    goto :goto_20

    .line 20
    :catch_13
    move-exception p1

    .line 21
    goto :goto_16

    .line 22
    :catch_15
    move-exception p1

    .line 23
    :goto_16
    :try_start_16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_19
    .catchall {:try_start_16 .. :try_end_19} :catchall_11

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_1e

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    const/4 p1, 0x0

    .line 32
    return p1

    .line 33
    :goto_20
    if-eqz v0, :cond_25

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 36
    .line 37
    .line 38
    :cond_25
    throw p1
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
    const/4 v0, 0x0

    return v0
.end method

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/L$e;->o(Ljava/lang/String;)Lcom/jcraft/jsch/SftpATTRS;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/jcraft/jsch/SftpATTRS;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1e

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/L$e;->m(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_25

    .line 27
    :catchall_1a
    move-exception p1

    .line 28
    goto :goto_33

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    goto :goto_29

    .line 31
    :cond_1e
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/L$e;->l(Ljava/lang/String;)V
    :try_end_25
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_4 .. :try_end_25} :catch_1c
    .catchall {:try_start_4 .. :try_end_25} :catchall_1a

    .line 36
    .line 37
    .line 38
    :goto_25
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_29
    :try_start_29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    const-string v1, "delete"

    .line 46
    .line 47
    invoke-direct {p0, v1, p1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    throw p1
    :try_end_33
    .catchall {:try_start_29 .. :try_end_33} :catchall_1a

    .line 52
    :goto_33
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

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

.method public Q(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public a()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/L;->i:Z

    .line 2
    .line 3
    return v0
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

.method public b()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->s0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/L;->H0(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->v0()V

    .line 9
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
.end method

.method public c0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public g0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public h0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public j0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 p7, 0x1

    .line 2
    move-object p3, p2

    .line 3
    move-object p8, p9

    .line 4
    move-object p9, p10

    .line 5
    move-object p2, p1

    .line 6
    move-object p1, p0

    .line 7
    invoke-direct/range {p1 .. p9}, Lcom/voxdon/xplorer/file/L;->O0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V

    .line 8
    .line 9
    .line 10
    return-void
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
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual/range {p0 .. p6}, Lcom/voxdon/xplorer/file/m;->o(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;ZZLax/g3/h;Lax/u3/c;)V
    :try_end_4
    .catchall {:try_start_1 .. :try_end_4} :catchall_7

    .line 3
    .line 4
    .line 5
    move-object p1, p0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_7
    move-exception v0

    .line 9
    move-object p1, p0

    .line 10
    :goto_9
    move-object p2, v0

    .line 11
    :try_start_a
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_a .. :try_end_b} :catchall_c

    .line 12
    throw p2

    .line 13
    :catchall_c
    move-exception v0

    .line 14
    goto :goto_9
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

.method public r()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/L;->p:Ljava/lang/String;

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

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/L$e;->e(Ljava/lang/String;)Lcom/jcraft/jsch/SftpATTRS;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/voxdon/xplorer/file/M;

    .line 10
    .line 11
    invoke-direct {v2, p0, v0, v1, p1}, Lcom/voxdon/xplorer/file/M;-><init>(Lcom/voxdon/xplorer/file/L;Lcom/voxdon/xplorer/file/L$e;Lcom/jcraft/jsch/SftpATTRS;Ljava/lang/String;)V
    :try_end_d
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_4 .. :try_end_d} :catch_13
    .catchall {:try_start_4 .. :try_end_d} :catchall_11

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 15
    .line 16
    .line 17
    return-object v2

    .line 18
    :catchall_11
    move-exception p1

    .line 19
    goto :goto_38

    .line 20
    :catch_13
    move-exception v1

    .line 21
    :try_start_14
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    iget v2, v1, Lcom/jcraft/jsch/SftpException;->q:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v2, v3, :cond_25

    .line 28
    .line 29
    new-instance v1, Lcom/voxdon/xplorer/file/M;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, Lcom/voxdon/xplorer/file/M;-><init>(Lcom/voxdon/xplorer/file/L;Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_14 .. :try_end_21} :catchall_11

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_25
    const/4 p1, 0x4

    .line 39
    if-ne v2, p1, :cond_31

    .line 40
    .line 41
    :try_start_28
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->a()V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lax/b3/j;

    .line 45
    .line 46
    invoke-direct {p1, v1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_31
    const-string p1, "getFileInfo"

    .line 51
    .line 52
    invoke-direct {p0, p1, v1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1
    :try_end_38
    .catchall {:try_start_28 .. :try_end_38} :catchall_11

    .line 57
    :goto_38
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 58
    .line 59
    .line 60
    throw p1
    .line 61
.end method

.method public z0()Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/L;->B0()Lcom/voxdon/xplorer/file/L$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_8
    .catch Lcom/jcraft/jsch/SftpException; {:try_start_4 .. :try_end_8} :catch_e
    .catchall {:try_start_4 .. :try_end_8} :catchall_c

    .line 9
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :catchall_c
    move-exception v1

    .line 14
    goto :goto_16

    .line 15
    :catch_e
    move-exception v1

    .line 16
    :try_start_f
    const-string v2, "getHomePath"

    .line 17
    .line 18
    invoke-direct {p0, v2, v1}, Lcom/voxdon/xplorer/file/L;->u0(Ljava/lang/String;Lcom/jcraft/jsch/SftpException;)Lax/b3/j;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    throw v1
    :try_end_16
    .catchall {:try_start_f .. :try_end_16} :catchall_c

    .line 23
    :goto_16
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/L$e;->j()V

    .line 24
    .line 25
    .line 26
    throw v1
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
.end method
