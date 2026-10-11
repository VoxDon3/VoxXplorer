.class Lcom/voxdon/xplorer/file/Q$a;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Landroid/content/Context;

.field i:Landroid/net/wifi/WifiManager;

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:I

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:Lcom/voxdon/xplorer/file/c$a;

.field p:Lcom/voxdon/xplorer/file/Q;

.field q:Ljava/lang/String;

.field r:Ljava/lang/String;

.field s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/Z2/o;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 5

    .line 8
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 9
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->h:Landroid/content/Context;

    .line 10
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/Q$a;->E(Lax/Z2/o;)V

    .line 11
    iput-object p3, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "wifi"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->i:Landroid/net/wifi/WifiManager;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/Q;Lcom/voxdon/xplorer/file/c$a;I)V
    .registers 6

    .line 1
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 2
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->h:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 4
    iput-object p3, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/Q;->t0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/Q$b;

    move-result-object p2

    invoke-virtual {p2, p4}, Lcom/voxdon/xplorer/file/Q$b;->k(I)Lax/Z2/o;

    move-result-object p2

    .line 6
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/Q$a;->E(Lax/Z2/o;)V

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "wifi"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->i:Landroid/net/wifi/WifiManager;

    return-void
.end method

.method private C(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Ljava/lang/String;)Lax/jb/b;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->i:Landroid/net/wifi/WifiManager;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_22

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getWifiState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v0, v2, :cond_22

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->i:Landroid/net/wifi/WifiManager;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_22

    .line 20
    .line 21
    iget v2, v0, Landroid/net/DhcpInfo;->ipAddress:I

    .line 22
    .line 23
    if-eqz v2, :cond_22

    .line 24
    .line 25
    iget v0, v0, Landroid/net/DhcpInfo;->dns1:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/Q$a;->z(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_22

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    goto :goto_23

    .line 35
    :cond_22
    const/4 v0, 0x1

    .line 36
    :goto_23
    invoke-static {p2}, Lax/nb/g;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lax/jb/b;->l(Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_34

    .line 47
    .line 48
    invoke-direct {p0, p2, v1}, Lcom/voxdon/xplorer/file/Q$a;->D(Ljava/lang/String;Z)Lax/jb/b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_34
    const-string v0, "."

    .line 54
    .line 55
    if-eqz p1, :cond_54

    .line 56
    .line 57
    invoke-static {p1}, Lcom/voxdon/xplorer/file/Q;->l0(Lcom/voxdon/xplorer/file/Q;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_54

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    move-object v3, p3

    .line 82
    move-object p3, p2

    .line 83
    move-object p2, v3

    .line 84
    goto :goto_66

    .line 85
    :cond_54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    :goto_66
    :try_start_66
    invoke-direct {p0, p2, v1}, Lcom/voxdon/xplorer/file/Q$a;->D(Ljava/lang/String;Z)Lax/jb/b;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_6a
    .catch Ljava/net/UnknownHostException; {:try_start_66 .. :try_end_6a} :catch_6b

    .line 107
    return-object p1

    .line 108
    :catch_6b
    invoke-direct {p0, p3, v1}, Lcom/voxdon/xplorer/file/Q$a;->D(Ljava/lang/String;Z)Lax/jb/b;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-eqz p1, :cond_79

    .line 113
    .line 114
    invoke-static {p1}, Lcom/voxdon/xplorer/file/Q;->l0(Lcom/voxdon/xplorer/file/Q;)Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    xor-int/2addr p3, v1

    .line 119
    invoke-static {p1, p3}, Lcom/voxdon/xplorer/file/Q;->m0(Lcom/voxdon/xplorer/file/Q;Z)V

    .line 120
    .line 121
    .line 122
    :cond_79
    return-object p2
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

.method private D(Ljava/lang/String;Z)Lax/jb/b;
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lax/jb/b;->c(Ljava/lang/String;Z)[Lax/jb/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length p2, p1

    .line 6
    if-eqz p2, :cond_93

    .line 7
    .line 8
    array-length p2, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-le p2, v0, :cond_90

    .line 12
    .line 13
    iget-object p2, p0, Lcom/voxdon/xplorer/file/Q$a;->h:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {p2}, Lax/i3/a;->f(Landroid/content/Context;)[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    array-length v2, p2

    .line 20
    const/4 v3, 0x4

    .line 21
    if-lt v2, v3, :cond_2d

    .line 22
    .line 23
    aget-byte v2, p2, v1

    .line 24
    .line 25
    if-eqz v2, :cond_2d

    .line 26
    .line 27
    invoke-static {p2}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_2d

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2b

    .line 42
    .line 43
    goto :goto_2d

    .line 44
    :cond_2b
    const/4 v2, 0x1

    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    :goto_2d
    const/4 v2, 0x0

    .line 47
    :goto_2e
    array-length v4, p1

    .line 48
    sub-int/2addr v4, v0

    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v6, v5

    .line 51
    :goto_32
    if-ltz v4, :cond_8a

    .line 52
    .line 53
    aget-object v7, p1, v4

    .line 54
    .line 55
    if-eqz v7, :cond_87

    .line 56
    .line 57
    invoke-virtual {v7}, Lax/jb/b;->b()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    instance-of v8, v8, Ljava/net/Inet6Address;

    .line 62
    .line 63
    if-eqz v8, :cond_41

    .line 64
    .line 65
    goto :goto_87

    .line 66
    :cond_41
    invoke-virtual {v7}, Lax/jb/b;->b()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    if-nez v5, :cond_64

    .line 71
    .line 72
    instance-of v9, v8, Lax/nb/g;

    .line 73
    .line 74
    if-eqz v9, :cond_63

    .line 75
    .line 76
    move-object v9, v8

    .line 77
    check-cast v9, Lax/nb/g;

    .line 78
    .line 79
    invoke-virtual {v9}, Lax/nb/g;->s()Ljava/net/InetAddress;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v9}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-eqz v10, :cond_59

    .line 88
    .line 89
    goto :goto_87

    .line 90
    :cond_59
    invoke-virtual {v9}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_63

    .line 95
    .line 96
    if-nez v6, :cond_64

    .line 97
    .line 98
    move-object v6, v7

    .line 99
    goto :goto_64

    .line 100
    :cond_63
    move-object v5, v7

    .line 101
    :cond_64
    :goto_64
    if-eqz v2, :cond_87

    .line 102
    .line 103
    instance-of v9, v8, Lax/nb/g;

    .line 104
    .line 105
    if-eqz v9, :cond_87

    .line 106
    .line 107
    check-cast v8, Lax/nb/g;

    .line 108
    .line 109
    invoke-virtual {v8}, Lax/nb/g;->h()[B

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    array-length v9, v8

    .line 114
    if-lt v9, v3, :cond_87

    .line 115
    .line 116
    aget-byte v9, v8, v1

    .line 117
    .line 118
    aget-byte v10, p2, v1

    .line 119
    .line 120
    if-ne v9, v10, :cond_87

    .line 121
    .line 122
    aget-byte v9, v8, v0

    .line 123
    .line 124
    aget-byte v10, p2, v0

    .line 125
    .line 126
    if-ne v9, v10, :cond_87

    .line 127
    .line 128
    const/4 v9, 0x2

    .line 129
    aget-byte v8, v8, v9

    .line 130
    .line 131
    aget-byte v9, p2, v9

    .line 132
    .line 133
    if-ne v8, v9, :cond_87

    .line 134
    .line 135
    return-object v7

    .line 136
    :cond_87
    :goto_87
    add-int/lit8 v4, v4, -0x1

    .line 137
    .line 138
    goto :goto_32

    .line 139
    :cond_8a
    if-eqz v5, :cond_8d

    .line 140
    .line 141
    return-object v5

    .line 142
    :cond_8d
    if-eqz v6, :cond_90

    .line 143
    .line 144
    return-object v6

    .line 145
    :cond_90
    aget-object p1, p1, v1

    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_93
    invoke-static {}, Lax/u3/b;->f()V

    .line 149
    .line 150
    .line 151
    new-instance p1, Ljava/net/UnknownHostException;

    .line 152
    .line 153
    const-string p2, "No matched ip address"

    .line 154
    .line 155
    invoke-direct {p1, p2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1
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

.method private E(Lax/Z2/o;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Lax/Z2/o;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->j:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/Z2/o;->d()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->k:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/Z2/o;->h()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/Z2/o;->k()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->m:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/Z2/o;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Lax/Z2/o;->f()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Lax/Z2/o;->j()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->r:Ljava/lang/String;

    .line 42
    .line 43
    return-void
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

.method private F(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/L;
        }
    .end annotation

    .line 1
    iget v6, p0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 2
    .line 3
    const-string v8, "GUEST"

    .line 4
    .line 5
    const-string v9, ""

    .line 6
    .line 7
    const-string v7, "?"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move v3, p3

    .line 13
    move-object v4, p4

    .line 14
    move-object v5, p5

    .line 15
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_3c

    .line 20
    .line 21
    iget v6, v0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 22
    .line 23
    const-string v8, "Guest"

    .line 24
    .line 25
    const-string v9, ""

    .line 26
    .line 27
    const-string v7, "?"

    .line 28
    .line 29
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_3c

    .line 34
    .line 35
    iget v6, v0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 36
    .line 37
    const-string v8, "guest"

    .line 38
    .line 39
    const-string v9, ""

    .line 40
    .line 41
    const-string v7, "?"

    .line 42
    .line 43
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_3c

    .line 48
    .line 49
    iget v6, v0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 50
    .line 51
    const-string v8, ""

    .line 52
    .line 53
    const-string v9, ""

    .line 54
    .line 55
    const-string v7, ""

    .line 56
    .line 57
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_3c
    return-object p1
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
.end method

.method private G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/L;
        }
    .end annotation

    .line 1
    invoke-static {p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_15

    .line 6
    .line 7
    invoke-static {p8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_15

    .line 12
    .line 13
    invoke-static {p9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_15

    .line 18
    .line 19
    sget-object v0, Lax/pb/r;->q0:Lax/pb/r;

    .line 20
    .line 21
    goto :goto_1a

    .line 22
    :cond_15
    new-instance v0, Lax/pb/r;

    .line 23
    .line 24
    invoke-direct {v0, p7, p8, p9}, Lax/pb/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_1a
    sget-object v1, Lcom/voxdon/xplorer/file/Q$c;->c0:Lcom/voxdon/xplorer/file/Q$c;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eq p1, v1, :cond_28

    .line 32
    .line 33
    sget-object v1, Lcom/voxdon/xplorer/file/Q$c;->d0:Lcom/voxdon/xplorer/file/Q$c;

    .line 34
    .line 35
    if-ne p1, v1, :cond_25

    .line 36
    .line 37
    goto :goto_28

    .line 38
    :cond_25
    move-object p7, v2

    .line 39
    goto/16 :goto_c0

    .line 40
    .line 41
    :cond_28
    :goto_28
    const-string v1, "?"

    .line 42
    .line 43
    invoke-virtual {v1, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_41

    .line 48
    .line 49
    const-string p7, "GUEST"

    .line 50
    .line 51
    invoke-virtual {p7, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p7

    .line 55
    if-eqz p7, :cond_3a

    .line 56
    .line 57
    const-string p8, "SMB2GUESTTESTACCOUNT"

    .line 58
    .line 59
    :cond_3a
    const-string p7, ""

    .line 60
    .line 61
    invoke-static {p7, p8, p9}, Lcom/voxdon/xplorer/file/O;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/j9/b;

    .line 62
    .line 63
    .line 64
    move-result-object p7

    .line 65
    goto :goto_45

    .line 66
    :cond_41
    invoke-static {p7, p8, p9}, Lcom/voxdon/xplorer/file/O;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lax/j9/b;

    .line 67
    .line 68
    .line 69
    move-result-object p7

    .line 70
    :goto_45
    :try_start_45
    invoke-static {p2, p3, p5, p6, p7}, Lcom/voxdon/xplorer/file/O;->d(Lax/i9/c;ZLjava/lang/String;ILax/j9/b;)Lax/r9/b;

    .line 71
    .line 72
    .line 73
    move-result-object p2
    :try_end_49
    .catch Lax/k9/d; {:try_start_45 .. :try_end_49} :catch_9c
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_49} :catch_99
    .catch Ljava/lang/RuntimeException; {:try_start_45 .. :try_end_49} :catch_78
    .catchall {:try_start_45 .. :try_end_49} :catchall_75

    .line 74
    const/4 v3, 0x1

    .line 75
    :try_start_4a
    sget-object p3, Lcom/voxdon/xplorer/file/Q$c;->d0:Lcom/voxdon/xplorer/file/Q$c;

    .line 76
    .line 77
    if-ne p1, p3, :cond_69

    .line 78
    .line 79
    new-instance p1, Lcom/voxdon/xplorer/file/P;

    .line 80
    .line 81
    invoke-direct {p1, p7, p5, p6}, Lcom/voxdon/xplorer/file/P;-><init>(Lax/j9/b;Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p1, Lcom/voxdon/xplorer/file/P;->c:Lax/pb/r;
    :try_end_55
    .catch Lax/k9/d; {:try_start_4a .. :try_end_55} :catch_67
    .catch Ljava/io/IOException; {:try_start_4a .. :try_end_55} :catch_65
    .catch Ljava/lang/RuntimeException; {:try_start_4a .. :try_end_55} :catch_63
    .catchall {:try_start_4a .. :try_end_55} :catchall_5f

    .line 85
    .line 86
    if-eqz p2, :cond_5e

    .line 87
    .line 88
    :try_start_57
    invoke-virtual {p2}, Lax/r9/b;->j()Lax/l9/a;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Lax/l9/a;->close()V
    :try_end_5e
    .catch Ljava/io/IOException; {:try_start_57 .. :try_end_5e} :catch_5e

    .line 93
    .line 94
    .line 95
    :catch_5e
    :cond_5e
    return-object p1

    .line 96
    :catchall_5f
    move-exception p1

    .line 97
    move-object v2, p2

    .line 98
    goto/16 :goto_115

    .line 99
    .line 100
    :catch_63
    move-exception p1

    .line 101
    goto :goto_7a

    .line 102
    :catch_65
    move-exception p1

    .line 103
    goto :goto_9e

    .line 104
    :catch_67
    move-exception p1

    .line 105
    goto :goto_9e

    .line 106
    :cond_69
    if-eqz p2, :cond_c0

    .line 107
    .line 108
    :try_start_6b
    invoke-virtual {p2}, Lax/r9/b;->j()Lax/l9/a;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_6f
    invoke-virtual {p1}, Lax/l9/a;->close()V
    :try_end_72
    .catch Ljava/io/IOException; {:try_start_6b .. :try_end_72} :catch_73

    .line 113
    .line 114
    .line 115
    goto :goto_c0

    .line 116
    :catch_73
    nop

    .line 117
    goto :goto_c0

    .line 118
    :catchall_75
    move-exception p1

    .line 119
    goto/16 :goto_115

    .line 120
    .line 121
    :catch_78
    move-exception p1

    .line 122
    move-object p2, v2

    .line 123
    :goto_7a
    :try_start_7a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    const-string p8, "SMB2 AUTH RUNTIME EXCEPTION"

    .line 135
    .line 136
    invoke-virtual {p3, p8}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    invoke-virtual {p3, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_92
    .catchall {:try_start_7a .. :try_end_92} :catchall_5f

    .line 145
    .line 146
    .line 147
    if-eqz p2, :cond_c0

    .line 148
    .line 149
    :try_start_94
    invoke-virtual {p2}, Lax/r9/b;->j()Lax/l9/a;

    .line 150
    .line 151
    .line 152
    move-result-object p1
    :try_end_98
    .catch Ljava/io/IOException; {:try_start_94 .. :try_end_98} :catch_73

    .line 153
    goto :goto_6f

    .line 154
    :catch_99
    move-exception p1

    .line 155
    :goto_9a
    move-object p2, v2

    .line 156
    goto :goto_9e

    .line 157
    :catch_9c
    move-exception p1

    .line 158
    goto :goto_9a

    .line 159
    :goto_9e
    :try_start_9e
    new-instance p3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string p8, "SMB2 : "

    .line 165
    .line 166
    invoke-virtual {p3, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p8

    .line 173
    invoke-virtual {p3, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-direct {p0, p3}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_b9
    .catchall {:try_start_9e .. :try_end_b9} :catchall_5f

    .line 184
    .line 185
    .line 186
    if-eqz p2, :cond_c0

    .line 187
    .line 188
    :try_start_bb
    invoke-virtual {p2}, Lax/r9/b;->j()Lax/l9/a;

    .line 189
    .line 190
    .line 191
    move-result-object p1
    :try_end_bf
    .catch Ljava/io/IOException; {:try_start_bb .. :try_end_bf} :catch_73

    .line 192
    goto :goto_6f

    .line 193
    :cond_c0
    :goto_c0
    if-eqz p4, :cond_10a

    .line 194
    .line 195
    if-lez p6, :cond_cc

    .line 196
    .line 197
    :try_start_c4
    invoke-static {p4, p6, v0}, Lax/pb/i0;->c(Lax/jb/b;ILax/pb/r;)V

    .line 198
    .line 199
    .line 200
    goto :goto_cf

    .line 201
    :catch_c8
    move-exception p1

    .line 202
    goto :goto_dd

    .line 203
    :catch_ca
    move-exception p1

    .line 204
    goto :goto_ef

    .line 205
    :cond_cc
    invoke-static {p4, v0}, Lax/pb/i0;->d(Lax/jb/b;Lax/pb/r;)V

    .line 206
    .line 207
    .line 208
    :goto_cf
    if-eqz v3, :cond_d7

    .line 209
    .line 210
    new-instance p1, Lcom/voxdon/xplorer/file/P;

    .line 211
    .line 212
    invoke-direct {p1, p7, p5, p6, v0}, Lcom/voxdon/xplorer/file/P;-><init>(Lax/j9/b;Ljava/lang/String;ILax/pb/r;)V

    .line 213
    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_d7
    new-instance p1, Lcom/voxdon/xplorer/file/P;

    .line 217
    .line 218
    invoke-direct {p1, v0}, Lcom/voxdon/xplorer/file/P;-><init>(Lax/pb/r;)V
    :try_end_dc
    .catch Lax/pb/a0; {:try_start_c4 .. :try_end_dc} :catch_ca
    .catch Ljava/lang/RuntimeException; {:try_start_c4 .. :try_end_dc} :catch_c8

    .line 219
    .line 220
    .line 221
    return-object p1

    .line 222
    :goto_dd
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    const-string p3, "SMB1 LOGON!!"

    .line 227
    .line 228
    invoke-virtual {p2, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 237
    .line 238
    .line 239
    goto :goto_10a

    .line 240
    :goto_ef
    new-instance p2, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string p3, "SMB1 : "

    .line 246
    .line 247
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 265
    .line 266
    .line 267
    :cond_10a
    :goto_10a
    if-eqz v3, :cond_114

    .line 268
    .line 269
    new-instance p1, Lcom/voxdon/xplorer/file/P;

    .line 270
    .line 271
    invoke-direct {p1, p7, p5, p6}, Lcom/voxdon/xplorer/file/P;-><init>(Lax/j9/b;Ljava/lang/String;I)V

    .line 272
    .line 273
    .line 274
    iput-object v0, p1, Lcom/voxdon/xplorer/file/P;->c:Lax/pb/r;

    .line 275
    .line 276
    return-object p1

    .line 277
    :cond_114
    return-object v2

    .line 278
    :goto_115
    if-eqz v2, :cond_11e

    .line 279
    .line 280
    :try_start_117
    invoke-virtual {v2}, Lax/r9/b;->j()Lax/l9/a;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-virtual {p2}, Lax/l9/a;->close()V
    :try_end_11e
    .catch Ljava/io/IOException; {:try_start_117 .. :try_end_11e} :catch_11e

    .line 285
    .line 286
    .line 287
    :catch_11e
    :cond_11e
    throw p1
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

.method private H(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/L;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_d

    .line 9
    .line 10
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->m:Ljava/lang/String;

    .line 11
    .line 12
    move-object v8, v1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    move-object v8, v2

    .line 15
    :goto_e
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->n:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_18

    .line 22
    .line 23
    iget-object v2, p0, Lcom/voxdon/xplorer/file/Q$a;->n:Ljava/lang/String;

    .line 24
    .line 25
    :cond_18
    move-object v9, v2

    .line 26
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->j:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-lez v1, :cond_27

    .line 33
    .line 34
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->j:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v7, v1

    .line 38
    const/4 v10, 0x0

    .line 39
    goto :goto_2b

    .line 40
    :cond_27
    const/4 v2, 0x1

    .line 41
    move-object/from16 v7, p6

    .line 42
    .line 43
    const/4 v10, 0x1

    .line 44
    :goto_2b
    iget v6, p0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 45
    .line 46
    move-object v0, p0

    .line 47
    move-object v1, p1

    .line 48
    move-object v2, p2

    .line 49
    move v3, p3

    .line 50
    move-object v4, p4

    .line 51
    move-object/from16 v5, p5

    .line 52
    .line 53
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-nez v6, :cond_4b

    .line 58
    .line 59
    if-eqz v10, :cond_4b

    .line 60
    .line 61
    iget v6, p0, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    move-object v0, p0

    .line 65
    move-object v1, p1

    .line 66
    move-object v2, p2

    .line 67
    move v3, p3

    .line 68
    move-object v4, p4

    .line 69
    move-object/from16 v5, p5

    .line 70
    .line 71
    invoke-direct/range {v0 .. v9}, Lcom/voxdon/xplorer/file/Q$a;->G(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    return-object v1

    .line 76
    :cond_4b
    return-object v6
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

.method private w(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->s:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->s:Ljava/lang/String;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->s:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ","

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->s:Ljava/lang/String;

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

.method private x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/jb/b;Z)Lcom/voxdon/xplorer/file/P;
    .registers 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v6, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    const-string v2, "Cannot connect to the SMB1 server : "

    .line 10
    .line 11
    const-string v3, " : "

    .line 12
    .line 13
    const-string v0, "SMB1"

    .line 14
    .line 15
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v7, 0x1

    .line 22
    if-eqz v0, :cond_1e

    .line 23
    .line 24
    sget-object v0, Lcom/voxdon/xplorer/file/Q$c;->q:Lcom/voxdon/xplorer/file/Q$c;

    .line 25
    .line 26
    :goto_19
    move-object v10, v9

    .line 27
    move-object v14, v10

    .line 28
    :goto_1b
    const/4 v13, 0x1

    .line 29
    goto/16 :goto_15f

    .line 30
    .line 31
    :cond_1e
    const-string v10, "SMB2"

    .line 32
    .line 33
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v11, "EOF while reading packet"

    .line 38
    .line 39
    const-string v12, "SMB3"

    .line 40
    .line 41
    const/4 v13, 0x0

    .line 42
    if-nez v0, :cond_31

    .line 43
    .line 44
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_fd

    .line 49
    .line 50
    :cond_31
    invoke-static {}, Lax/X2/Q;->i()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_fd

    .line 55
    .line 56
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_fd

    .line 61
    .line 62
    :try_start_3d
    invoke-static {v8, v4, v7}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 63
    .line 64
    .line 65
    move-result-object v14
    :try_end_41
    .catch Lax/k9/d; {:try_start_3d .. :try_end_41} :catch_54
    .catch Ljava/io/IOException; {:try_start_3d .. :try_end_41} :catch_52
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3d .. :try_end_41} :catch_4f

    .line 66
    :try_start_41
    iget v0, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 67
    .line 68
    invoke-static {v14, v6, v0}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_47
    .catch Lax/k9/d; {:try_start_41 .. :try_end_47} :catch_4d
    .catch Ljava/io/IOException; {:try_start_41 .. :try_end_47} :catch_4b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_41 .. :try_end_47} :catch_49

    .line 72
    goto/16 :goto_a6

    .line 73
    .line 74
    :catch_49
    move-exception v0

    .line 75
    goto :goto_56

    .line 76
    :catch_4b
    move-exception v0

    .line 77
    goto :goto_56

    .line 78
    :catch_4d
    move-exception v0

    .line 79
    goto :goto_56

    .line 80
    :catch_4f
    move-exception v0

    .line 81
    :goto_50
    move-object v14, v9

    .line 82
    goto :goto_56

    .line 83
    :catch_52
    move-exception v0

    .line 84
    goto :goto_50

    .line 85
    :catch_54
    move-exception v0

    .line 86
    goto :goto_50

    .line 87
    :goto_56
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    if-eqz v15, :cond_79

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    invoke-virtual {v15, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_79

    .line 102
    .line 103
    :try_start_66
    invoke-static {v8, v13, v7}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 104
    .line 105
    .line 106
    move-result-object v14
    :try_end_6a
    .catch Lax/k9/d; {:try_start_66 .. :try_end_6a} :catch_74
    .catch Ljava/io/IOException; {:try_start_66 .. :try_end_6a} :catch_74
    .catch Ljava/lang/IllegalArgumentException; {:try_start_66 .. :try_end_6a} :catch_74

    .line 107
    :try_start_6a
    iget v11, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 108
    .line 109
    invoke-static {v14, v6, v11}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 110
    .line 111
    .line 112
    move-result-object v11
    :try_end_70
    .catch Lax/k9/d; {:try_start_6a .. :try_end_70} :catch_71
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_70} :catch_71
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6a .. :try_end_70} :catch_71

    .line 113
    goto :goto_7c

    .line 114
    :catch_71
    nop

    .line 115
    const/4 v4, 0x0

    .line 116
    goto :goto_75

    .line 117
    :catch_74
    nop

    .line 118
    :goto_75
    move v13, v4

    .line 119
    move-object v11, v9

    .line 120
    const/4 v4, 0x0

    .line 121
    goto :goto_7c

    .line 122
    :cond_79
    move-object v11, v9

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v13, 0x1

    .line 125
    :goto_7c
    if-nez v4, :cond_a4

    .line 126
    .line 127
    instance-of v2, v0, Ljava/net/SocketTimeoutException;

    .line 128
    .line 129
    if-eqz v2, :cond_88

    .line 130
    .line 131
    const-string v0, "SMB2 timeout"

    .line 132
    .line 133
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_a3

    .line 137
    :cond_88
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 138
    .line 139
    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v3, "Protocol not supported : "

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_a3
    return-object v9

    .line 165
    :cond_a4
    move-object v0, v11

    .line 166
    move v4, v13

    .line 167
    :goto_a6
    if-eqz v0, :cond_f5

    .line 168
    .line 169
    invoke-virtual {v0}, Lax/l9/a;->s0()Lax/l9/c;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    if-eqz v11, :cond_f5

    .line 174
    .line 175
    invoke-virtual {v0}, Lax/l9/a;->s0()Lax/l9/c;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-virtual {v11}, Lax/l9/c;->a()Lax/Q8/g;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    if-eqz v11, :cond_f5

    .line 184
    .line 185
    invoke-virtual {v11}, Lax/Q8/g;->j()Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    if-nez v13, :cond_c4

    .line 190
    .line 191
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-nez v12, :cond_d0

    .line 196
    .line 197
    :cond_c4
    invoke-virtual {v1, v11}, Lcom/voxdon/xplorer/file/Q$a;->A(Lax/Q8/g;)Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-nez v12, :cond_f5

    .line 202
    .line 203
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    if-eqz v10, :cond_f5

    .line 208
    .line 209
    :cond_d0
    :try_start_d0
    invoke-virtual {v0}, Lax/l9/a;->close()V
    :try_end_d3
    .catch Ljava/lang/Exception; {:try_start_d0 .. :try_end_d3} :catch_d3

    .line 210
    .line 211
    .line 212
    :catch_d3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v2, "Protocol does not match ("

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v2, " != "

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v2, ")"

    .line 234
    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v9

    .line 246
    :cond_f5
    sget-object v10, Lcom/voxdon/xplorer/file/Q$c;->d0:Lcom/voxdon/xplorer/file/Q$c;

    .line 247
    .line 248
    move-object v13, v10

    .line 249
    move-object v10, v0

    .line 250
    move-object v0, v13

    .line 251
    move v13, v4

    .line 252
    goto/16 :goto_15f

    .line 253
    .line 254
    :cond_fd
    invoke-static {}, Lax/X2/Q;->i()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_15b

    .line 259
    .line 260
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-nez v0, :cond_15b

    .line 265
    .line 266
    :try_start_109
    invoke-static {v8, v4, v7}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 267
    .line 268
    .line 269
    move-result-object v14
    :try_end_10d
    .catch Lax/k9/d; {:try_start_109 .. :try_end_10d} :catch_12a
    .catch Ljava/io/IOException; {:try_start_109 .. :try_end_10d} :catch_128
    .catch Ljava/lang/IllegalArgumentException; {:try_start_109 .. :try_end_10d} :catch_124

    .line 270
    :try_start_10d
    iget v0, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 271
    .line 272
    invoke-static {v14, v6, v0}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 273
    .line 274
    .line 275
    move-result-object v10
    :try_end_113
    .catch Lax/k9/d; {:try_start_10d .. :try_end_113} :catch_122
    .catch Ljava/io/IOException; {:try_start_10d .. :try_end_113} :catch_120
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10d .. :try_end_113} :catch_11d

    .line 276
    :try_start_113
    sget-object v0, Lcom/voxdon/xplorer/file/Q$c;->d0:Lcom/voxdon/xplorer/file/Q$c;
    :try_end_115
    .catch Lax/k9/d; {:try_start_113 .. :try_end_115} :catch_11b
    .catch Ljava/io/IOException; {:try_start_113 .. :try_end_115} :catch_119
    .catch Ljava/lang/IllegalArgumentException; {:try_start_113 .. :try_end_115} :catch_117

    .line 277
    .line 278
    goto/16 :goto_1b

    .line 279
    .line 280
    :catch_117
    move-exception v0

    .line 281
    goto :goto_12c

    .line 282
    :catch_119
    move-exception v0

    .line 283
    goto :goto_12c

    .line 284
    :catch_11b
    move-exception v0

    .line 285
    goto :goto_12c

    .line 286
    :catch_11d
    move-exception v0

    .line 287
    :goto_11e
    move-object v10, v9

    .line 288
    goto :goto_12c

    .line 289
    :catch_120
    move-exception v0

    .line 290
    goto :goto_11e

    .line 291
    :catch_122
    move-exception v0

    .line 292
    goto :goto_11e

    .line 293
    :catch_124
    move-exception v0

    .line 294
    :goto_125
    move-object v10, v9

    .line 295
    move-object v14, v10

    .line 296
    goto :goto_12c

    .line 297
    :catch_128
    move-exception v0

    .line 298
    goto :goto_125

    .line 299
    :catch_12a
    move-exception v0

    .line 300
    goto :goto_125

    .line 301
    :goto_12c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    if-eqz v12, :cond_14e

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-virtual {v12, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    if-eqz v11, :cond_14e

    .line 316
    .line 317
    :try_start_13c
    invoke-static {v8, v13, v7}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 318
    .line 319
    .line 320
    move-result-object v14
    :try_end_140
    .catch Lax/k9/d; {:try_start_13c .. :try_end_140} :catch_14a
    .catch Ljava/io/IOException; {:try_start_13c .. :try_end_140} :catch_14a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_13c .. :try_end_140} :catch_14a

    .line 321
    :try_start_140
    iget v11, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 322
    .line 323
    invoke-static {v14, v6, v11}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 324
    .line 325
    .line 326
    move-result-object v10
    :try_end_146
    .catch Lax/k9/d; {:try_start_140 .. :try_end_146} :catch_147
    .catch Ljava/io/IOException; {:try_start_140 .. :try_end_146} :catch_147
    .catch Ljava/lang/IllegalArgumentException; {:try_start_140 .. :try_end_146} :catch_147

    .line 327
    goto :goto_150

    .line 328
    :catch_147
    nop

    .line 329
    const/4 v4, 0x0

    .line 330
    goto :goto_14b

    .line 331
    :catch_14a
    nop

    .line 332
    :goto_14b
    move v13, v4

    .line 333
    const/4 v4, 0x0

    .line 334
    goto :goto_150

    .line 335
    :cond_14e
    const/4 v4, 0x0

    .line 336
    const/4 v13, 0x1

    .line 337
    :goto_150
    if-eqz v4, :cond_155

    .line 338
    .line 339
    sget-object v0, Lcom/voxdon/xplorer/file/Q$c;->d0:Lcom/voxdon/xplorer/file/Q$c;

    .line 340
    .line 341
    goto :goto_15f

    .line 342
    :cond_155
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 343
    .line 344
    .line 345
    sget-object v0, Lcom/voxdon/xplorer/file/Q$c;->q:Lcom/voxdon/xplorer/file/Q$c;

    .line 346
    .line 347
    goto :goto_15f

    .line 348
    :cond_15b
    sget-object v0, Lcom/voxdon/xplorer/file/Q$c;->q:Lcom/voxdon/xplorer/file/Q$c;

    .line 349
    .line 350
    goto/16 :goto_19

    .line 351
    .line 352
    :goto_15f
    sget-object v4, Lcom/voxdon/xplorer/file/Q$c;->q:Lcom/voxdon/xplorer/file/Q$c;

    .line 353
    .line 354
    if-ne v0, v4, :cond_1e0

    .line 355
    .line 356
    :try_start_163
    iget v4, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 357
    .line 358
    invoke-static {v5, v4}, Lcom/voxdon/xplorer/file/N;->r(Lax/jb/b;I)V
    :try_end_168
    .catch Ljava/io/IOException; {:try_start_163 .. :try_end_168} :catch_16c
    .catch Ljava/lang/NullPointerException; {:try_start_163 .. :try_end_168} :catch_16a

    .line 359
    .line 360
    .line 361
    goto/16 :goto_1e0

    .line 362
    .line 363
    :catch_16a
    move-exception v0

    .line 364
    goto :goto_16e

    .line 365
    :catch_16c
    move-exception v0

    .line 366
    goto :goto_18b

    .line 367
    :goto_16e
    new-instance v4, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    return-object v9

    .line 396
    :goto_18b
    instance-of v4, v0, Lax/rb/d;

    .line 397
    .line 398
    if-eqz v4, :cond_1c3

    .line 399
    .line 400
    move-object v4, v0

    .line 401
    check-cast v4, Lax/rb/d;

    .line 402
    .line 403
    invoke-virtual {v4}, Lax/rb/d;->a()Ljava/lang/Throwable;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    if-eqz v6, :cond_1c3

    .line 408
    .line 409
    invoke-virtual {v4}, Lax/rb/d;->a()Ljava/lang/Throwable;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    new-instance v6, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    goto :goto_1df

    .line 452
    :cond_1c3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-direct {v1, v0}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_1df
    return-object v9

    .line 481
    :cond_1e0
    :goto_1e0
    if-eqz p5, :cond_1f3

    .line 482
    .line 483
    move-object v2, v0

    .line 484
    move-object v3, v14

    .line 485
    const/4 v4, 0x1

    .line 486
    :try_start_1e5
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/Q$a;->F(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 487
    .line 488
    .line 489
    move-result-object v0
    :try_end_1e9
    .catch Lax/b3/L; {:try_start_1e5 .. :try_end_1e9} :catch_1ed

    .line 490
    move-object/from16 v1, p0

    .line 491
    .line 492
    :goto_1eb
    move-object v9, v0

    .line 493
    goto :goto_1fd

    .line 494
    :catch_1ed
    nop

    .line 495
    move-object/from16 v1, p0

    .line 496
    .line 497
    move-object/from16 v6, p3

    .line 498
    .line 499
    goto :goto_200

    .line 500
    :cond_1f3
    move-object/from16 v7, p2

    .line 501
    .line 502
    move-object v2, v0

    .line 503
    move-object v3, v14

    .line 504
    const/4 v4, 0x1

    .line 505
    :try_start_1f8
    invoke-direct/range {v1 .. v7}, Lcom/voxdon/xplorer/file/Q$a;->H(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 506
    .line 507
    .line 508
    move-result-object v0
    :try_end_1fc
    .catch Lax/b3/L; {:try_start_1f8 .. :try_end_1fc} :catch_1ff

    .line 509
    goto :goto_1eb

    .line 510
    :goto_1fd
    const/4 v7, 0x1

    .line 511
    goto :goto_227

    .line 512
    :catch_1ff
    nop

    .line 513
    :goto_200
    if-eqz v10, :cond_206

    .line 514
    .line 515
    :try_start_202
    invoke-virtual {v10}, Lax/l9/a;->close()V
    :try_end_205
    .catch Ljava/lang/Exception; {:try_start_202 .. :try_end_205} :catch_206

    .line 516
    .line 517
    .line 518
    move-object v10, v9

    .line 519
    :catch_206
    :cond_206
    const/4 v4, 0x0

    .line 520
    :try_start_207
    invoke-static {v8, v13, v4}, Lcom/voxdon/xplorer/file/O;->j(Ljava/lang/String;ZZ)Lax/i9/c;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    iget v0, v1, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 525
    .line 526
    invoke-static {v3, v6, v0}, Lcom/voxdon/xplorer/file/O;->f(Lax/i9/c;Ljava/lang/String;I)Lax/l9/a;

    .line 527
    .line 528
    .line 529
    move-result-object v10

    .line 530
    if-eqz p5, :cond_21d

    .line 531
    .line 532
    move-object/from16 v5, p4

    .line 533
    .line 534
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/Q$a;->F(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    :goto_219
    move-object v9, v0

    .line 539
    goto :goto_226

    .line 540
    :catch_21b
    nop

    .line 541
    goto :goto_226

    .line 542
    :cond_21d
    move-object/from16 v7, p2

    .line 543
    .line 544
    move-object/from16 v5, p4

    .line 545
    .line 546
    invoke-direct/range {v1 .. v7}, Lcom/voxdon/xplorer/file/Q$a;->H(Lcom/voxdon/xplorer/file/Q$c;Lax/i9/c;ZLax/jb/b;Ljava/lang/String;Ljava/lang/String;)Lcom/voxdon/xplorer/file/P;

    .line 547
    .line 548
    .line 549
    move-result-object v0
    :try_end_225
    .catch Lax/k9/d; {:try_start_207 .. :try_end_225} :catch_21b
    .catch Ljava/io/IOException; {:try_start_207 .. :try_end_225} :catch_21b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_207 .. :try_end_225} :catch_21b
    .catch Lax/b3/L; {:try_start_207 .. :try_end_225} :catch_21b

    .line 550
    goto :goto_219

    .line 551
    :goto_226
    const/4 v7, 0x0

    .line 552
    :goto_227
    if-eqz v10, :cond_231

    .line 553
    .line 554
    :try_start_229
    invoke-virtual {v10}, Lax/l9/a;->close()V
    :try_end_22c
    .catch Ljava/lang/Exception; {:try_start_229 .. :try_end_22c} :catch_22d

    .line 555
    .line 556
    .line 557
    goto :goto_231

    .line 558
    :catch_22d
    move-exception v0

    .line 559
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 560
    .line 561
    .line 562
    :cond_231
    :goto_231
    if-eqz v9, :cond_239

    .line 563
    .line 564
    iput-boolean v13, v9, Lcom/voxdon/xplorer/file/P;->g:Z

    .line 565
    .line 566
    iput-object v8, v9, Lcom/voxdon/xplorer/file/P;->h:Ljava/lang/String;

    .line 567
    .line 568
    iput-boolean v7, v9, Lcom/voxdon/xplorer/file/P;->i:Z

    .line 569
    .line 570
    :cond_239
    return-object v9
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
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
.end method


# virtual methods
.method public A(Lax/Q8/g;)Z
    .registers 3

    .line 1
    sget-object v0, Lax/Q8/g;->e0:Lax/Q8/g;

    .line 2
    .line 3
    if-eq p1, v0, :cond_f

    .line 4
    .line 5
    sget-object v0, Lax/Q8/g;->d0:Lax/Q8/g;

    .line 6
    .line 7
    if-eq p1, v0, :cond_f

    .line 8
    .line 9
    sget-object v0, Lax/Q8/g;->f0:Lax/Q8/g;

    .line 10
    .line 11
    if-ne p1, v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_f
    :goto_f
    const/4 p1, 0x1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected B(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_2b

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_23

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1a

    .line 18
    .line 19
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 26
    .line 27
    :cond_1a
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iget-object p1, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iget-object v1, p0, Lcom/voxdon/xplorer/file/Q$a;->s:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p1, v0, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    return-void
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

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/Q$a;->y([Ljava/lang/String;)Ljava/lang/Boolean;

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/Q$a;->B(Ljava/lang/Boolean;)V

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
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->o:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 6
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

.method protected varargs y([Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 11

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->i()V

    .line 8
    .line 9
    .line 10
    :cond_9
    :try_start_9
    const-string v0, "jcifs.smb.client.disablePlainTextPasswords"

    .line 11
    .line 12
    const-string v2, "false"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lax/jb/a;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v0, "anonymous"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/voxdon/xplorer/file/Q$a;->m:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_18
    .catchall {:try_start_9 .. :try_end_18} :catchall_184

    .line 25
    if-eqz v0, :cond_29

    .line 26
    .line 27
    :try_start_1a
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->n:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_20
    .catchall {:try_start_1a .. :try_end_20} :catchall_24

    .line 33
    if-eqz v0, :cond_29

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    goto :goto_2a

    .line 37
    :catchall_24
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    move-object v2, p0

    .line 40
    goto/16 :goto_188

    .line 41
    .line 42
    :cond_29
    const/4 v7, 0x0

    .line 43
    :goto_2a
    :try_start_2a
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;
    :try_end_2c
    .catchall {:try_start_2a .. :try_end_2c} :catchall_184

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v0, :cond_35

    .line 47
    .line 48
    :try_start_2f
    invoke-static {v0}, Lcom/voxdon/xplorer/file/Q;->n0(Lcom/voxdon/xplorer/file/Q;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_33
    .catchall {:try_start_2f .. :try_end_33} :catchall_24

    .line 52
    move-object v2, v0

    .line 53
    goto :goto_36

    .line 54
    :cond_35
    move-object v2, v8

    .line 55
    :goto_36
    :try_start_36
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/voxdon/xplorer/file/Q$a;->k:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v4, p0, Lcom/voxdon/xplorer/file/Q$a;->j:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {p0, v0, v3, v4}, Lcom/voxdon/xplorer/file/Q$a;->C(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Ljava/lang/String;)Lax/jb/b;

    .line 62
    .line 63
    .line 64
    move-result-object v3
    :try_end_40
    .catch Ljava/net/UnknownHostException; {:try_start_36 .. :try_end_40} :catch_66
    .catchall {:try_start_36 .. :try_end_40} :catchall_24

    .line 65
    :try_start_40
    invoke-virtual {v3}, Lax/jb/b;->f()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_5c

    .line 74
    .line 75
    iget-object v4, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 76
    .line 77
    if-eqz v4, :cond_63

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_63

    .line 84
    .line 85
    iget-object v4, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 86
    .line 87
    invoke-static {v4, v0}, Lcom/voxdon/xplorer/file/Q;->o0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_63

    .line 91
    :catch_5a
    move-exception v0

    .line 92
    goto :goto_68

    .line 93
    :cond_5c
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v4
    :try_end_60
    .catch Ljava/net/UnknownHostException; {:try_start_40 .. :try_end_60} :catch_5a
    .catchall {:try_start_40 .. :try_end_60} :catchall_24

    .line 97
    if-eqz v4, :cond_63

    .line 98
    .line 99
    goto :goto_64

    .line 100
    :cond_63
    :goto_63
    move-object v2, v0

    .line 101
    :cond_64
    :goto_64
    move-object v5, v2

    .line 102
    goto :goto_93

    .line 103
    :catch_66
    move-exception v0

    .line 104
    move-object v3, v8

    .line 105
    :goto_68
    :try_start_68
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v4
    :try_end_6c
    .catchall {:try_start_68 .. :try_end_6c} :catchall_184

    .line 109
    if-eqz v4, :cond_64

    .line 110
    .line 111
    :try_start_6e
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 112
    .line 113
    .line 114
    new-instance p1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v1, "Unknown Host : "

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/Q$a;->w(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_8b
    .catchall {:try_start_6e .. :try_end_8b} :catchall_24

    .line 139
    .line 140
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 141
    .line 142
    if-eqz v0, :cond_92

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 145
    .line 146
    .line 147
    :cond_92
    return-object p1

    .line 148
    :goto_93
    :try_start_93
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v0
    :try_end_97
    .catchall {:try_start_93 .. :try_end_97} :catchall_184

    .line 152
    if-eqz v0, :cond_9d

    .line 153
    .line 154
    :try_start_99
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->k:Ljava/lang/String;
    :try_end_9b
    .catchall {:try_start_99 .. :try_end_9b} :catchall_24

    .line 155
    .line 156
    :goto_9b
    move-object v4, v0

    .line 157
    goto :goto_ae

    .line 158
    :cond_9d
    :try_start_9d
    invoke-static {v5}, Lax/u3/B;->I(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v0
    :try_end_a1
    .catchall {:try_start_9d .. :try_end_a1} :catchall_184

    .line 162
    if-nez v0, :cond_a6

    .line 163
    .line 164
    :try_start_a3
    iget-object v0, p0, Lcom/voxdon/xplorer/file/Q$a;->k:Ljava/lang/String;
    :try_end_a5
    .catchall {:try_start_a3 .. :try_end_a5} :catchall_24

    .line 165
    .line 166
    goto :goto_9b

    .line 167
    :cond_a6
    :try_start_a6
    invoke-static {v5}, Lax/jb/b;->d(Ljava/lang/String;)Lax/jb/b;

    .line 168
    .line 169
    .line 170
    move-result-object v3
    :try_end_aa
    .catch Ljava/net/UnknownHostException; {:try_start_a6 .. :try_end_aa} :catch_ac
    .catchall {:try_start_a6 .. :try_end_aa} :catchall_24

    .line 171
    :goto_aa
    move-object v4, v5

    .line 172
    goto :goto_ae

    .line 173
    :catch_ac
    nop

    .line 174
    goto :goto_aa

    .line 175
    :goto_ae
    if-nez v3, :cond_b4

    .line 176
    .line 177
    :try_start_b0
    invoke-static {v5}, Lax/jb/b;->d(Ljava/lang/String;)Lax/jb/b;

    .line 178
    .line 179
    .line 180
    move-result-object v3
    :try_end_b4
    .catch Ljava/net/UnknownHostException; {:try_start_b0 .. :try_end_b4} :catch_b4
    .catchall {:try_start_b0 .. :try_end_b4} :catchall_24

    .line 181
    :catch_b4
    :cond_b4
    move-object v6, v3

    .line 182
    :try_start_b5
    iget-object v3, p0, Lcom/voxdon/xplorer/file/Q$a;->r:Ljava/lang/String;
    :try_end_b7
    .catchall {:try_start_b5 .. :try_end_b7} :catchall_184

    .line 183
    .line 184
    if-nez v3, :cond_cb

    .line 185
    .line 186
    :try_start_b9
    const-string v3, "SMB2"

    .line 187
    .line 188
    move-object v2, p0

    .line 189
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/Q$a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/jb/b;Z)Lcom/voxdon/xplorer/file/P;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-nez v0, :cond_c9

    .line 194
    .line 195
    sget-object v3, Lcom/voxdon/xplorer/file/Q;->n:Ljava/lang/String;

    .line 196
    .line 197
    move-object v2, p0

    .line 198
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/Q$a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/jb/b;Z)Lcom/voxdon/xplorer/file/P;

    .line 199
    .line 200
    .line 201
    move-result-object v0
    :try_end_c9
    .catchall {:try_start_b9 .. :try_end_c9} :catchall_24

    .line 202
    :cond_c9
    move-object v2, p0

    .line 203
    goto :goto_d0

    .line 204
    :cond_cb
    move-object v2, p0

    .line 205
    :try_start_cc
    invoke-direct/range {v2 .. v7}, Lcom/voxdon/xplorer/file/Q$a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lax/jb/b;Z)Lcom/voxdon/xplorer/file/P;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_d0
    if-nez v0, :cond_e0

    .line 210
    .line 211
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_d4
    .catchall {:try_start_cc .. :try_end_d4} :catchall_dc

    .line 212
    .line 213
    iget-object v0, v2, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 214
    .line 215
    if-eqz v0, :cond_db

    .line 216
    .line 217
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 218
    .line 219
    .line 220
    :cond_db
    return-object p1

    .line 221
    :catchall_dc
    move-exception v0

    .line 222
    :goto_dd
    move-object p1, v0

    .line 223
    goto/16 :goto_188

    .line 224
    .line 225
    :cond_e0
    :try_start_e0
    iget-object v3, v0, Lcom/voxdon/xplorer/file/P;->a:Lcom/voxdon/xplorer/file/Q$c;

    .line 226
    .line 227
    sget-object v5, Lcom/voxdon/xplorer/file/Q$c;->q:Lcom/voxdon/xplorer/file/Q$c;
    :try_end_e4
    .catchall {:try_start_e0 .. :try_end_e4} :catchall_dc

    .line 228
    .line 229
    if-ne v3, v5, :cond_142

    .line 230
    .line 231
    :try_start_e6
    iget v3, v2, Lcom/voxdon/xplorer/file/Q$a;->l:I
    :try_end_e8
    .catch Ljava/lang/Exception; {:try_start_e6 .. :try_end_e8} :catch_112
    .catchall {:try_start_e6 .. :try_end_e8} :catchall_dc

    .line 232
    .line 233
    const-string v5, "/"

    .line 234
    .line 235
    const-string v6, "smb://"

    .line 236
    .line 237
    if-lez v3, :cond_114

    .line 238
    .line 239
    :try_start_ee
    new-instance v3, Lax/pb/b0;

    .line 240
    .line 241
    new-instance v7, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v6, ":"

    .line 253
    .line 254
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget v6, v2, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 258
    .line 259
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    iget-object v6, v0, Lcom/voxdon/xplorer/file/P;->c:Lax/pb/r;

    .line 270
    .line 271
    invoke-direct {v3, v5, v6}, Lax/pb/b0;-><init>(Ljava/lang/String;Lax/pb/r;)V

    .line 272
    .line 273
    .line 274
    goto :goto_12d

    .line 275
    :catch_112
    nop

    .line 276
    goto :goto_136

    .line 277
    :cond_114
    new-instance v3, Lax/pb/b0;

    .line 278
    .line 279
    new-instance v7, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    iget-object v6, v0, Lcom/voxdon/xplorer/file/P;->c:Lax/pb/r;

    .line 298
    .line 299
    invoke-direct {v3, v5, v6}, Lax/pb/b0;-><init>(Ljava/lang/String;Lax/pb/r;)V

    .line 300
    .line 301
    .line 302
    :goto_12d
    invoke-virtual {v3}, Lax/pb/b0;->s()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v8
    :try_end_135
    .catch Ljava/lang/Exception; {:try_start_ee .. :try_end_135} :catch_112
    .catchall {:try_start_ee .. :try_end_135} :catchall_dc

    .line 310
    goto :goto_137

    .line 311
    :goto_136
    move-object v4, v8

    .line 312
    :goto_137
    if-eqz v8, :cond_13f

    .line 313
    .line 314
    :try_start_139
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-nez v3, :cond_142

    .line 319
    .line 320
    :cond_13f
    iget-object v3, v2, Lcom/voxdon/xplorer/file/Q$a;->k:Ljava/lang/String;

    .line 321
    .line 322
    move-object v4, v3

    .line 323
    :cond_142
    iget v3, v2, Lcom/voxdon/xplorer/file/Q$a;->l:I

    .line 324
    .line 325
    if-lez v3, :cond_15d

    .line 326
    .line 327
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 328
    .line 329
    const-string v6, "smb://%s:%s"

    .line 330
    .line 331
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    const/4 v7, 0x2

    .line 336
    new-array v7, v7, [Ljava/lang/Object;

    .line 337
    .line 338
    aput-object v4, v7, p1

    .line 339
    .line 340
    aput-object v3, v7, v1

    .line 341
    .line 342
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/P;->a(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    goto :goto_16c

    .line 350
    :cond_15d
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 351
    .line 352
    const-string v5, "smb://%s"

    .line 353
    .line 354
    new-array v1, v1, [Ljava/lang/Object;

    .line 355
    .line 356
    aput-object v4, v1, p1

    .line 357
    .line 358
    invoke-static {v3, v5, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/P;->a(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :goto_16c
    iget-object p1, v2, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 366
    .line 367
    if-eqz p1, :cond_17a

    .line 368
    .line 369
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/Q;->G0(Lcom/voxdon/xplorer/file/P;)V

    .line 370
    .line 371
    .line 372
    iget-object p1, v2, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 373
    .line 374
    iget-object v0, v2, Lcom/voxdon/xplorer/file/Q$a;->q:Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/Q;->E0(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_17a
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_17c
    .catchall {:try_start_139 .. :try_end_17c} :catchall_dc

    .line 380
    .line 381
    iget-object v0, v2, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 382
    .line 383
    if-eqz v0, :cond_183

    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 386
    .line 387
    .line 388
    :cond_183
    return-object p1

    .line 389
    :catchall_184
    move-exception v0

    .line 390
    move-object v2, p0

    .line 391
    goto/16 :goto_dd

    .line 392
    .line 393
    :goto_188
    iget-object v0, v2, Lcom/voxdon/xplorer/file/Q$a;->p:Lcom/voxdon/xplorer/file/Q;

    .line 394
    .line 395
    if-eqz v0, :cond_18f

    .line 396
    .line 397
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 398
    .line 399
    .line 400
    :cond_18f
    throw p1
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

.method z(I)Z
    .registers 7

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    shr-int/lit8 v1, p1, 0x8

    .line 5
    .line 6
    and-int/lit16 v1, v1, 0xff

    .line 7
    .line 8
    int-to-byte v1, v1

    .line 9
    shr-int/lit8 v2, p1, 0x10

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    int-to-byte v2, v2

    .line 14
    shr-int/lit8 p1, p1, 0x18

    .line 15
    .line 16
    and-int/lit16 p1, p1, 0xff

    .line 17
    .line 18
    int-to-byte p1, p1

    .line 19
    const/4 v3, 0x4

    .line 20
    new-array v3, v3, [B

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-byte v0, v3, v4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput-byte v1, v3, v0

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    aput-byte v2, v3, v1

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    aput-byte p1, v3, v1

    .line 33
    .line 34
    :try_start_21
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_39

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_39

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 51
    .line 52
    .line 53
    move-result p1
    :try_end_35
    .catch Ljava/net/UnknownHostException; {:try_start_21 .. :try_end_35} :catch_3a

    .line 54
    if-eqz p1, :cond_38

    .line 55
    .line 56
    goto :goto_39

    .line 57
    :cond_38
    return v4

    .line 58
    :cond_39
    :goto_39
    return v0

    .line 59
    :catch_3a
    return v4
    .line 60
    .line 61
.end method
