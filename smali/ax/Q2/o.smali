.class public Lax/Q2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:Lax/Q2/o;


# instance fields
.field a:Lcom/github/mjdev/libaums/c;

.field b:Lax/h5/b;

.field c:J

.field d:J

.field e:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public static i()Lax/Q2/o;
    .registers 1

    .line 1
    sget-object v0, Lax/Q2/o;->f:Lax/Q2/o;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/Q2/o;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/Q2/o;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/Q2/o;->f:Lax/Q2/o;

    .line 11
    .line 12
    :cond_b
    sget-object v0, Lax/Q2/o;->f:Lax/Q2/o;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a(Landroid/content/Context;)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->d()Landroid/hardware/usb/UsbDevice;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v2, "usb"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/hardware/usb/UsbManager;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/hardware/usb/UsbManager;->getDeviceList()Ljava/util/HashMap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3b

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Landroid/hardware/usb/UsbDevice;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/hardware/usb/UsbDevice;->getDeviceId()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0}, Landroid/hardware/usb/UsbDevice;->getDeviceId()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ne v2, v3, :cond_23

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_3b
    return v1
    .line 61
.end method

.method public b(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/Q2/o;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Lax/Q2/o;->e:Z

    .line 6
    .line 7
    return-void
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

.method public c()V
    .registers 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lax/Q2/o;->c:J

    .line 4
    .line 5
    iput-wide v0, p0, Lax/Q2/o;->d:J

    .line 6
    .line 7
    return-void
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

.method public d()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 2
    .line 3
    if-eqz v0, :cond_1d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/Q2/o;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lax/Q2/o;->c:J

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/Q2/o;->j()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lax/Q2/o;->d:J

    .line 16
    .line 17
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->a()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 24
    .line 25
    iput-object v0, p0, Lax/Q2/o;->b:Lax/h5/b;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lax/Q2/o;->e:Z

    .line 29
    .line 30
    :cond_1d
    return-void
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

.method public e(Landroid/content/Context;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/Q2/o;->d()V

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-static {p1}, Lcom/github/mjdev/libaums/c;->b(Landroid/content/Context;)[Lcom/github/mjdev/libaums/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_9e

    .line 15
    .line 16
    array-length v3, v0

    .line 17
    if-lez v3, :cond_9e

    .line 18
    .line 19
    aget-object v0, v0, v2

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->d()Landroid/hardware/usb/UsbDevice;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0, p1, v3}, Lax/Q2/o;->l(Landroid/content/Context;Landroid/hardware/usb/UsbDevice;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_22

    .line 30
    .line 31
    iput-object v1, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 32
    .line 33
    goto/16 :goto_a0

    .line 34
    .line 35
    :cond_22
    :try_start_22
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->f()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->c()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_50

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_50

    .line 51
    .line 52
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lax/j5/a;

    .line 57
    .line 58
    if-eqz v0, :cond_a0

    .line 59
    .line 60
    invoke-virtual {v0}, Lax/j5/a;->b()Lax/h5/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lax/Q2/o;->b:Lax/h5/b;

    .line 65
    .line 66
    goto :goto_a0

    .line 67
    :catch_42
    move-exception p1

    .line 68
    goto :goto_60

    .line 69
    :catch_44
    move-exception p1

    .line 70
    goto :goto_60

    .line 71
    :catch_46
    move-exception p1

    .line 72
    goto :goto_60

    .line 73
    :catch_48
    move-exception p1

    .line 74
    goto :goto_60

    .line 75
    :catch_4a
    move-exception v0

    .line 76
    goto :goto_76

    .line 77
    :catch_4c
    move-exception p1

    .line 78
    goto :goto_95

    .line 79
    :catch_4e
    move-exception p1

    .line 80
    goto :goto_95

    .line 81
    :cond_50
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->e()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_59

    .line 88
    .line 89
    goto :goto_a0

    .line 90
    :cond_59
    new-instance v0, Lax/b3/G;

    .line 91
    .line 92
    const/4 v1, 0x7

    .line 93
    invoke-direct {v0, v1}, Lax/b3/G;-><init>(I)V

    .line 94
    .line 95
    .line 96
    throw v0
    :try_end_60
    .catch Lcom/github/mjdev/libaums/b; {:try_start_22 .. :try_end_60} :catch_4e
    .catch Lax/j5/d$b; {:try_start_22 .. :try_end_60} :catch_4c
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_60} :catch_4a
    .catch Ljava/lang/NullPointerException; {:try_start_22 .. :try_end_60} :catch_48
    .catch Ljava/lang/IllegalArgumentException; {:try_start_22 .. :try_end_60} :catch_46
    .catch Ljava/lang/IllegalStateException; {:try_start_22 .. :try_end_60} :catch_44
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_22 .. :try_end_60} :catch_42

    .line 97
    :goto_60
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "!!UsbStorage Init!!"

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 116
    .line 117
    .line 118
    goto :goto_a0

    .line 119
    :goto_76
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lax/Q2/o;->a(Landroid/content/Context;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_a0

    .line 127
    .line 128
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v1, "!!UsbStorage Init 3!!"

    .line 137
    .line 138
    invoke-virtual {p1, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 147
    .line 148
    .line 149
    goto :goto_a0

    .line 150
    :goto_95
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lax/b3/C;

    .line 154
    .line 155
    invoke-direct {v0, p1}, Lax/b3/C;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_9e
    iput-object v1, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 160
    .line 161
    :cond_a0
    :goto_a0
    iget-object p1, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 162
    .line 163
    if-eqz p1, :cond_a5

    .line 164
    .line 165
    const/4 v2, 0x1

    .line 166
    :cond_a5
    iput-boolean v2, p0, Lax/Q2/o;->e:Z

    .line 167
    .line 168
    return v2
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

.method public f(Landroid/content/Context;)Landroid/hardware/usb/UsbDevice;
    .registers 15

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    const-string v1, "usb"

    .line 3
    .line 4
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/hardware/usb/UsbManager;
    :try_end_9
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_9} :catch_72
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_9} :catch_72

    .line 9
    .line 10
    :try_start_9
    invoke-virtual {p1}, Landroid/hardware/usb/UsbManager;->getDeviceList()Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_d
    .catch Landroid/os/BadParcelableException; {:try_start_9 .. :try_end_d} :catch_e
    .catch Ljava/lang/NullPointerException; {:try_start_9 .. :try_end_d} :catch_72
    .catch Ljava/util/NoSuchElementException; {:try_start_9 .. :try_end_d} :catch_72

    .line 14
    goto :goto_10

    .line 15
    :catch_e
    nop

    .line 16
    move-object p1, v0

    .line 17
    :goto_10
    if-nez p1, :cond_13

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_13
    :try_start_13
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_72

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/hardware/usb/UsbDevice;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    :goto_2d
    if-ge v4, v2, :cond_1b

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const/16 v7, 0x8

    .line 57
    .line 58
    if-ne v6, v7, :cond_6f

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x6

    .line 65
    if-ne v6, v7, :cond_6f

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getInterfaceProtocol()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/16 v7, 0x50

    .line 72
    .line 73
    if-ne v6, v7, :cond_6f

    .line 74
    .line 75
    invoke-virtual {v5}, Landroid/hardware/usb/UsbInterface;->getEndpointCount()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    move-object v8, v0

    .line 80
    move-object v9, v8

    .line 81
    const/4 v7, 0x0

    .line 82
    :goto_51
    if-ge v7, v6, :cond_6a

    .line 83
    .line 84
    invoke-virtual {v5, v7}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v10}, Landroid/hardware/usb/UsbEndpoint;->getType()I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const/4 v12, 0x2

    .line 93
    if-ne v11, v12, :cond_67

    .line 94
    .line 95
    invoke-virtual {v10}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    .line 96
    .line 97
    .line 98
    move-result v11
    :try_end_62
    .catch Ljava/lang/NullPointerException; {:try_start_13 .. :try_end_62} :catch_72
    .catch Ljava/util/NoSuchElementException; {:try_start_13 .. :try_end_62} :catch_72

    .line 99
    if-nez v11, :cond_66

    .line 100
    .line 101
    move-object v8, v10

    .line 102
    goto :goto_67

    .line 103
    :cond_66
    move-object v9, v10

    .line 104
    :cond_67
    :goto_67
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    goto :goto_51

    .line 107
    :cond_6a
    if-eqz v8, :cond_6f

    .line 108
    .line 109
    if-eqz v9, :cond_6f

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_6f
    add-int/lit8 v4, v4, 0x1

    .line 113
    .line 114
    goto :goto_2d

    .line 115
    :catch_72
    :cond_72
    return-object v0
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

.method public g()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/Q2/o;->d()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    return v0
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

.method public h()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q2/o;->b:Lax/h5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/h5/b;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_9
    iget-wide v0, p0, Lax/Q2/o;->c:J

    .line 11
    .line 12
    return-wide v0
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

.method public j()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q2/o;->b:Lax/h5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/h5/b;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_9
    iget-wide v0, p0, Lax/Q2/o;->d:J

    .line 11
    .line 12
    return-wide v0
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

.method public k()Lax/h5/e;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q2/o;->b:Lax/h5/b;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-interface {v0}, Lax/h5/b;->d()Lax/h5/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public l(Landroid/content/Context;Landroid/hardware/usb/UsbDevice;)Z
    .registers 4

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_4
    const-string v0, "usb"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/hardware/usb/UsbManager;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/hardware/usb/UsbManager;->hasPermission(Landroid/hardware/usb/UsbDevice;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public m()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/Q2/o;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public n()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q2/o;->a:Lcom/github/mjdev/libaums/c;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Lcom/github/mjdev/libaums/c;->h()V

    .line 7
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
