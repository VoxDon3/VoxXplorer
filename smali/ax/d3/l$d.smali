.class Lax/d3/l$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Long;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field h:Ljava/lang/Throwable;

.field final synthetic i:Lax/d3/l;


# direct methods
.method public constructor <init>(Lax/d3/l;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

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

.method static synthetic w(Lax/d3/l$d;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/u3/q;->v([Ljava/lang/Object;)V

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


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/l$d;->x([Ljava/lang/Long;)Ljava/lang/Integer;

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
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/l$d;->y(Ljava/lang/Integer;)V

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
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 2
    .line 3
    sget-object v1, Lax/d3/l$c;->c0:Lax/d3/l$c;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/d3/l;->xa(Lax/d3/l;Lax/d3/l$c;)Lax/d3/l$c;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Lax/d3/l;->ua(Lax/d3/l;Z)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected bridge synthetic s([Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/l$d;->z([Ljava/lang/Integer;)V

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

.method protected varargs x([Ljava/lang/Long;)Ljava/lang/Integer;
    .registers 7

    .line 1
    iget-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/l;->Ca()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_100

    .line 9
    .line 10
    iget-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 11
    .line 12
    invoke-static {p1}, Lax/d3/l;->ya(Lax/d3/l;)Lcom/voxdon/xplorer/file/o;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 17
    .line 18
    .line 19
    :cond_12
    iget-object v1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/d3/n;->A3()Lax/c3/K;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lcom/voxdon/xplorer/service/CommandService;->y(Lax/c3/K;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_80

    .line 31
    .line 32
    const-wide/16 v3, 0x1f4

    .line 33
    .line 34
    :try_start_21
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_24
    .catch Ljava/lang/InterruptedException; {:try_start_21 .. :try_end_24} :catch_25

    .line 35
    .line 36
    .line 37
    goto :goto_26

    .line 38
    :catch_25
    nop

    .line 39
    :goto_26
    add-int/2addr v0, v2

    .line 40
    const/16 v1, 0x1e

    .line 41
    .line 42
    if-le v0, v1, :cond_12

    .line 43
    .line 44
    invoke-static {}, Lcom/voxdon/xplorer/service/CommandService;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, ""

    .line 49
    .line 50
    if-eqz v0, :cond_6b

    .line 51
    .line 52
    iget-object v3, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 53
    .line 54
    invoke-virtual {v3}, Lax/d3/n;->A3()Lax/c3/K;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v3}, Lcom/voxdon/xplorer/service/CommandService;->o(Lax/c3/K;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_6b

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lax/W2/j;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, "type:"

    .line 87
    .line 88
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lax/W2/j;->B()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, ";"

    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto :goto_41

    .line 108
    :cond_6b
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v3, "ARCHIVE WAIT OPERATION TIMEOUT"

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 127
    .line 128
    .line 129
    :cond_80
    new-instance v0, Lax/d3/l$d$a;

    .line 130
    .line 131
    invoke-direct {v0, p0}, Lax/d3/l$d$a;-><init>(Lax/d3/l$d;)V

    .line 132
    .line 133
    .line 134
    :try_start_85
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lcom/voxdon/xplorer/file/b;

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Lcom/voxdon/xplorer/file/b;->s1(Lax/g3/i;)Z

    .line 141
    .line 142
    .line 143
    move-result v0
    :try_end_8f
    .catch Lax/b3/s; {:try_start_85 .. :try_end_8f} :catch_9a
    .catch Lax/b3/j; {:try_start_85 .. :try_end_8f} :catch_98
    .catch Ljava/util/ConcurrentModificationException; {:try_start_85 .. :try_end_8f} :catch_96
    .catchall {:try_start_85 .. :try_end_8f} :catchall_94

    .line 144
    xor-int/2addr v0, v2

    .line 145
    invoke-virtual {p1, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_100

    .line 149
    :catchall_94
    move-exception v0

    .line 150
    goto :goto_fc

    .line 151
    :catch_96
    move-exception v0

    .line 152
    goto :goto_9c

    .line 153
    :catch_98
    move-exception v0

    .line 154
    goto :goto_db

    .line 155
    :catch_9a
    move-exception v0

    .line 156
    goto :goto_f6

    .line 157
    :goto_9c
    :try_start_9c
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, Lax/d3/l$d;->h:Ljava/lang/Throwable;

    .line 161
    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v3, "using:"

    .line 168
    .line 169
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    iget-object v3, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 173
    .line 174
    invoke-virtual {v3}, Lax/d3/n;->A3()Lax/c3/K;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-static {v3}, Lcom/voxdon/xplorer/service/CommandService;->y(Lax/c3/K;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    const-string v4, "ArchiveUpdate ConurrentModification"

    .line 198
    .line 199
    invoke-virtual {v3, v4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v3, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Lax/Ha/b;->h()V
    :try_end_d5
    .catchall {:try_start_9c .. :try_end_d5} :catchall_94

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x2

    .line 218
    const/4 v0, 0x2

    .line 219
    goto :goto_100

    .line 220
    :goto_db
    :try_start_db
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 221
    .line 222
    .line 223
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const-string v3, "UAERR:"

    .line 228
    .line 229
    invoke-virtual {v1, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 238
    .line 239
    .line 240
    iput-object v0, p0, Lax/d3/l$d;->h:Ljava/lang/Throwable;
    :try_end_f1
    .catchall {:try_start_db .. :try_end_f1} :catchall_94

    .line 241
    .line 242
    :goto_f1
    invoke-virtual {p1, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 243
    .line 244
    .line 245
    const/4 v0, 0x1

    .line 246
    goto :goto_100

    .line 247
    :goto_f6
    :try_start_f6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 248
    .line 249
    .line 250
    iput-object v0, p0, Lax/d3/l$d;->h:Ljava/lang/Throwable;
    :try_end_fb
    .catchall {:try_start_f6 .. :try_end_fb} :catchall_94

    .line 251
    .line 252
    goto :goto_f1

    .line 253
    :goto_fc
    invoke-virtual {p1, v2}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 254
    .line 255
    .line 256
    throw v0

    .line 257
    :cond_100
    :goto_100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    return-object p1
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
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_29

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/d3/l$d;->h:Ljava/lang/Throwable;

    .line 13
    .line 14
    instance-of v0, v0, Lax/b3/s;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const v2, 0x7f1301a3

    .line 18
    .line 19
    .line 20
    if-eqz v0, :cond_24

    .line 21
    .line 22
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Lax/d3/n;->J4(II)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 28
    .line 29
    const v1, 0x7f130150

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v1, v2}, Lax/d3/n;->J4(II)V

    .line 34
    .line 35
    .line 36
    goto :goto_29

    .line 37
    :cond_24
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lax/d3/n;->J4(II)V

    .line 40
    .line 41
    .line 42
    :cond_29
    :goto_29
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 43
    .line 44
    invoke-static {v0}, Lax/d3/l;->va(Lax/d3/l;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v0, 0x2

    .line 52
    if-eq p1, v0, :cond_44

    .line 53
    .line 54
    iget-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 55
    .line 56
    sget-object v0, Lax/d3/l$c;->d0:Lax/d3/l$c;

    .line 57
    .line 58
    invoke-static {p1, v0}, Lax/d3/l;->xa(Lax/d3/l;Lax/d3/l$c;)Lax/d3/l$c;

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 62
    .line 63
    const-string v0, "archive_update"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lax/d3/l;->Ba(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    iget-object p1, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 70
    .line 71
    sget-object v0, Lax/d3/l$c;->q:Lax/d3/l$c;

    .line 72
    .line 73
    invoke-static {p1, v0}, Lax/d3/l;->xa(Lax/d3/l;Lax/d3/l$c;)Lax/d3/l$c;

    .line 74
    .line 75
    .line 76
    return-void
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

.method protected varargs z([Ljava/lang/Integer;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 2
    .line 3
    iget-object v0, v0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->getMax()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eq v0, v2, :cond_1e

    .line 17
    .line 18
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 19
    .line 20
    iget-object v0, v0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 21
    .line 22
    aget-object v1, p1, v1

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Lax/d3/l$d;->i:Lax/d3/l;

    .line 32
    .line 33
    iget-object v0, v0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aget-object p1, p1, v1

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setProgress(I)V

    .line 43
    .line 44
    .line 45
    return-void
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
