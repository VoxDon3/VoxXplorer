.class public Lax/d3/l;
.super Lax/d3/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d3/l$c;,
        Lax/d3/l$d;,
        Lax/d3/l$b;
    }
.end annotation


# static fields
.field private static final F2:Ljava/util/logging/Logger;


# instance fields
.field private A2:Lax/W2/t$a;

.field private B2:I

.field private C2:Lax/d3/l$c;

.field private D2:Z

.field private E2:Landroid/net/Uri;

.field s2:Landroid/app/ProgressDialog;

.field private t2:Lcom/voxdon/xplorer/file/o;

.field private u2:Z

.field private v2:Ljava/lang/String;

.field private w2:Ljava/lang/String;

.field private x2:Lcom/voxdon/xplorer/file/y;

.field private y2:I

.field private z2:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.ArchiveFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/d3/l;->F2:Ljava/util/logging/Logger;

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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/d3/E;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/d3/l$c;->q:Lax/d3/l$c;

    .line 5
    .line 6
    iput-object v0, p0, Lax/d3/l;->C2:Lax/d3/l$c;

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

.method private Aa(Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/l;->E2:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/d3/l;->E2:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lax/c3/u;->d0(Landroid/content/Context;Landroid/net/Uri;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lax/d3/l;->E2:Landroid/net/Uri;

    .line 16
    .line 17
    :cond_10
    invoke-super {p0, p1}, Lax/d3/n;->i3(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method private Da(Ljava/util/List;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/u3/o;->e(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1d

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lax/c3/u;->G(Landroid/content/Context;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->F2(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    iget v0, p0, Lax/d3/l;->y2:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v0, :cond_63

    .line 35
    .line 36
    :try_start_23
    invoke-static {v0}, Landroid/os/ParcelFileDescriptor;->fromFd(I)Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_27} :catch_29

    .line 40
    move-object v7, v0

    .line 41
    goto :goto_64

    .line 42
    :catch_29
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "ARCHIVE GET FD ERROR"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v1, "haspath:"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lax/d3/l;->w2:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v1, :cond_4d

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    const/4 v1, 0x0

    .line 79
    :goto_4e
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 91
    .line 92
    .line 93
    const p1, 0x7f130137

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1, v2}, Lax/d3/n;->E4(II)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_63
    move-object v7, v1

    .line 101
    :goto_64
    iget v0, p0, Lax/d3/l;->B2:I

    .line 102
    .line 103
    if-ne v0, v2, :cond_72

    .line 104
    .line 105
    iget-object v0, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 106
    .line 107
    if-eqz v0, :cond_72

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_70
    :goto_70
    move-object v4, v1

    .line 114
    goto :goto_8f

    .line 115
    :cond_72
    iget-object v0, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->B(Landroid/net/Uri;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_82

    .line 122
    .line 123
    iget-object v0, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 124
    .line 125
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->A(Landroid/net/Uri;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_70

    .line 130
    .line 131
    :cond_82
    iget-object v0, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 132
    .line 133
    invoke-static {v0}, Lcom/voxdon/xplorer/provider/MyFileProvider;->e(Landroid/net/Uri;)Lax/Z2/k;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_70

    .line 138
    .line 139
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    goto :goto_70

    .line 144
    :goto_8f
    iget-object v5, p0, Lax/d3/l;->A2:Lax/W2/t$a;

    .line 145
    .line 146
    iget-object v6, p0, Lax/d3/l;->v2:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v8, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 149
    .line 150
    move-object v9, v8

    .line 151
    move-object v3, p0

    .line 152
    move-object v10, p1

    .line 153
    invoke-virtual/range {v3 .. v10}, Lax/d3/E;->q8(Lax/c3/K;Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    return-void
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

.method private Fa()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0a008a

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->o(IZ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f0a008b

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->o(IZ)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v1, 0x7f0a0097

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->o(IZ)V

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

.method private Ga()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->c1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private Ha(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/b;->W0()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1c

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x7f1300e6

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1c
    new-instance v1, Lax/d3/l$a;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, Lax/d3/l$a;-><init>(Lax/d3/l;Lcom/voxdon/xplorer/file/b;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p2, v1}, Lax/a3/L;->n3(Ljava/lang/String;Ljava/lang/String;Lax/a3/L$c;)Lax/a3/L;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "password"

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-virtual {p0, p1, p2, v0}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
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

.method private Ia(Z)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_3e

    .line 8
    .line 9
    new-instance v2, Landroid/app/ProgressDialog;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-direct {v2, v3}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 19
    .line 20
    iget-object v3, p0, Lax/d3/l;->v2:Ljava/lang/String;

    .line 21
    .line 22
    new-array v4, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    aput-object v3, v4, v0

    .line 25
    .line 26
    const v3, 0x7f130120

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v3, v4}, Landroidx/fragment/app/Fragment;->N0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_39

    .line 52
    .line 53
    iget-object v0, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object p1, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 61
    .line 62
    .line 63
    :cond_3e
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

.method static synthetic ta(Lax/d3/l;Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/l;->Ha(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V

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

.method static synthetic ua(Lax/d3/l;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/l;->Ia(Z)V

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

.method static synthetic va(Lax/d3/l;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/l;->za()V

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

.method static synthetic wa(Lax/d3/l;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/l;->Aa(Ljava/lang/String;)V

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

.method static synthetic xa(Lax/d3/l;Lax/d3/l$c;)Lax/d3/l$c;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l;->C2:Lax/d3/l$c;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic ya(Lax/d3/l;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

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

.method private za()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/d3/l;->s2:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    move-exception v0

    .line 8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "ILLEGAL STATUS ARCHIVE LIST"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 27
    .line 28
    .line 29
    return-void
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


# virtual methods
.method public B1(Landroid/view/MenuItem;)Z
    .registers 4

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a02d1

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_e

    .line 9
    .line 10
    invoke-super {p0, p1}, Lax/d3/n;->B1(Landroid/view/MenuItem;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_e
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "menu_folder"

    .line 20
    .line 21
    const-string v1, "extract_all"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lax/d3/l;->z3()Lax/Q2/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "loc"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Lax/d3/l;->Da(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1
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

.method protected B7()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/l;->v2:Ljava/lang/String;

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

.method protected Ba(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/l;->Ga()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_19

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/d3/l;->D2:Z

    .line 8
    .line 9
    if-nez v0, :cond_18

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lax/d3/l;->D2:Z

    .line 13
    .line 14
    new-instance v0, Lax/d3/l$b;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1}, Lax/d3/l$b;-><init>(Lax/d3/l;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    new-array p1, p1, [Ljava/lang/Void;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 23
    .line 24
    .line 25
    :cond_18
    return-void

    .line 26
    :cond_19
    invoke-direct {p0, p1}, Lax/d3/l;->Aa(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method protected C7()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method Ca()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->b1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Ea(Lcom/voxdon/xplorer/file/o;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->n0()V

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

.method protected K7(ILjava/util/List;Z)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)Z"
        }
    .end annotation

    .line 1
    const v0, 0x7f0a02d0

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_a

    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lax/d3/E;->K7(ILjava/util/List;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_a
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p3, "menu_folder"

    .line 16
    .line 17
    const-string v0, "extract"

    .line 18
    .line 19
    invoke-virtual {p1, p3, v0}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lax/d3/l;->z3()Lax/Q2/f;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    const-string v0, "loc"

    .line 32
    .line 33
    invoke-virtual {p1, v0, p3}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Lax/d3/l;->Da(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lax/d3/E;->h3()V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1
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

.method public L1(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Lax/d3/E;->L1(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/d3/E;->W0:Lcom/voxdon/xplorer/widget/PathBar;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/widget/PathBar;->setIsArchiveFile(Z)V

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
.end method

.method protected P8(Landroid/net/Uri;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_24

    .line 8
    :cond_7
    :try_start_7
    invoke-static {p1}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/Z2/k;->d()Lax/c3/K;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-ne v1, v2, :cond_1d

    .line 21
    .line 22
    invoke-virtual {v0}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lax/d3/E;->Z3(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    iput-object p1, p0, Lax/d3/l;->E2:Landroid/net/Uri;

    .line 31
    .line 32
    const-string p1, "return_uri"

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lax/d3/l;->i3(Ljava/lang/String;)V
    :try_end_24
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_24} :catch_24

    .line 35
    .line 36
    .line 37
    :catch_24
    :goto_24
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
.end method

.method public V2()Z
    .registers 2

    .line 1
    invoke-super {p0}, Lax/d3/E;->V2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    const-string v0, "hw_back"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lax/d3/l;->i3(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_b
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Y7()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method protected e7()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method protected h9()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->T7()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_21

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/l;->w7()Lcom/voxdon/xplorer/file/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->c1()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_21

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->f1()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_21

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0, v0, v1}, Lax/d3/l;->Ha(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    invoke-super {p0}, Lax/d3/E;->h9()V

    .line 35
    .line 36
    .line 37
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
.end method

.method protected i3(Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/l;->C2:Lax/d3/l$c;

    .line 2
    .line 3
    sget-object v1, Lax/d3/l$c;->q:Lax/d3/l$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1c

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/l;->Ca()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_18

    .line 12
    .line 13
    new-instance p1, Lax/d3/l$d;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lax/d3/l$d;-><init>(Lax/d3/l;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    new-array v0, v0, [Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-virtual {p0, p1}, Lax/d3/l;->Ba(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    sget-object v1, Lax/d3/l$c;->d0:Lax/d3/l$c;

    .line 30
    .line 31
    if-ne v0, v1, :cond_59

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_59

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_59

    .line 48
    .line 49
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "!! ARCHIVE FINISH !!"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "from : "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lax/d3/l;->Ba(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_59
    return-void
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

.method protected ia(Landroid/view/Menu;)V
    .registers 3

    .line 1
    const v0, 0x7f0a02d1

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 11
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
.end method

.method public j1(Landroid/app/Activity;)V
    .registers 7

    .line 1
    sget-object v0, Lax/W2/t$a;->q:Lax/W2/t$a;

    .line 2
    .line 3
    iput-object v0, p0, Lax/d3/l;->A2:Lax/W2/t$a;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "archive_uri"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/net/Uri;

    .line 16
    .line 17
    iput-object v0, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "archive_file_type"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lax/d3/l;->B2:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "open_uri"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/net/Uri;

    .line 43
    .line 44
    iget v1, p0, Lax/d3/l;->B2:I

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    const/4 v4, 0x1

    .line 48
    if-ne v1, v3, :cond_6b

    .line 49
    .line 50
    if-eqz v0, :cond_34

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    :cond_34
    invoke-static {v2}, Lax/u3/b;->c(Z)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 57
    .line 58
    if-nez v0, :cond_4a

    .line 59
    .line 60
    sget-object v0, Lax/Q2/f;->X0:Lax/Q2/f;

    .line 61
    .line 62
    invoke-virtual {p0}, Lax/d3/E;->x3()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-static {v0, v1}, Lax/c3/x;->d(Lax/Q2/f;I)Lcom/voxdon/xplorer/file/o;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 73
    .line 74
    .line 75
    :cond_4a
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/voxdon/xplorer/file/b;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->O0()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->N0()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iput v1, p0, Lax/d3/l;->B2:I

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->T0()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iput v1, p0, Lax/d3/l;->y2:I

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/b;->W0()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, Lax/d3/l;->v2:Ljava/lang/String;

    .line 106
    .line 107
    goto :goto_83

    .line 108
    :cond_6b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "file_descriptor"

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iput v0, p0, Lax/d3/l;->y2:I

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v1, "archive_name"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, Lax/d3/l;->v2:Ljava/lang/String;

    .line 131
    .line 132
    :goto_83
    iget v0, p0, Lax/d3/l;->B2:I

    .line 133
    .line 134
    if-eq v0, v4, :cond_a4

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    if-eq v0, v1, :cond_a4

    .line 138
    .line 139
    const/4 v1, 0x3

    .line 140
    if-eq v0, v1, :cond_b8

    .line 141
    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v1, "unknown archive file type : "

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget v1, p0, Lax/d3/l;->B2:I

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_b8

    .line 165
    :cond_a4
    iget-object v0, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Lax/d3/l;->w2:Ljava/lang/String;

    .line 172
    .line 173
    if-eqz v0, :cond_b5

    .line 174
    .line 175
    :try_start_ae
    invoke-static {v0}, Lcom/voxdon/xplorer/file/y;->I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iput-object v0, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;
    :try_end_b4
    .catch Lax/b3/j; {:try_start_ae .. :try_end_b4} :catch_b8

    .line 180
    .line 181
    goto :goto_b8

    .line 182
    :cond_b5
    invoke-static {}, Lax/u3/b;->f()V

    .line 183
    .line 184
    .line 185
    :catch_b8
    :cond_b8
    :goto_b8
    invoke-super {p0, p1}, Lax/d3/E;->j1(Landroid/app/Activity;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method protected k8(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_a

    .line 6
    .line 7
    invoke-direct {p0}, Lax/d3/l;->Fa()V

    .line 8
    .line 9
    .line 10
    goto :goto_15

    .line 11
    :cond_a
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const v0, 0x7f0a0097

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, Lax/x3/d;->o(IZ)V

    .line 20
    .line 21
    .line 22
    :goto_15
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const v0, 0x7f0f001f

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lax/x3/d;->l(I)V

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
.end method

.method protected l8(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-virtual {p0}, Lax/d3/E;->a8()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_e

    .line 10
    .line 11
    invoke-direct {p0}, Lax/d3/l;->Fa()V

    .line 12
    .line 13
    .line 14
    goto :goto_18

    .line 15
    :cond_e
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v2, 0x7f0a0097

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lax/x3/d;->o(IZ)V

    .line 23
    .line 24
    .line 25
    :goto_18
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const v2, 0x7f0f0020

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lax/x3/d;->l(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const v0, 0x7f0a02f1

    .line 40
    .line 41
    .line 42
    if-eqz p1, :cond_34

    .line 43
    .line 44
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {p1, v0, v1}, Lax/x3/d;->t(IZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_34
    invoke-virtual {p0}, Lax/d3/E;->s7()Lax/x3/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, v0, v1}, Lax/x3/d;->t(IZ)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method protected m8(ZLjava/lang/Object;)V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    if-eqz p1, :cond_22

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/d3/l;->w7()Lcom/voxdon/xplorer/file/o;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/voxdon/xplorer/file/b;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/b;->c1()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_1e

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p0, p1, p2}, Lax/d3/l;->Ha(Lcom/voxdon/xplorer/file/b;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    invoke-virtual {p0}, Lax/d3/l;->h9()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    instance-of p1, p2, Ljava/io/IOException;

    .line 36
    .line 37
    const v0, 0x7f130149

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    if-eqz p1, :cond_113

    .line 42
    .line 43
    check-cast p2, Ljava/io/IOException;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_59

    .line 53
    .line 54
    const-string v2, "Error on ZipFile"

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_59

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_59

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_59

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_59
    iget-boolean v2, p0, Lax/d3/l;->u2:Z

    .line 91
    .line 92
    if-eqz v2, :cond_6e

    .line 93
    .line 94
    iget-object v2, p0, Lax/d3/l;->w2:Ljava/lang/String;

    .line 95
    .line 96
    if-nez v2, :cond_6e

    .line 97
    .line 98
    iget v2, p0, Lax/d3/l;->y2:I

    .line 99
    .line 100
    if-eqz v2, :cond_6e

    .line 101
    .line 102
    sget-object p1, Lax/d3/l;->F2:Ljava/util/logging/Logger;

    .line 103
    .line 104
    const-string p2, "ArchiveViewer restored from saved state!"

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_12c

    .line 110
    .line 111
    :cond_6e
    if-eqz p1, :cond_84

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const-string v3, "archive is not a zip archive"

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_84

    .line 124
    .line 125
    const p1, 0x7f13003c

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1, v1}, Lax/d3/n;->A4(II)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_12c

    .line 132
    .line 133
    :cond_84
    if-eqz p1, :cond_96

    .line 134
    .line 135
    const-string v2, "ENOENT"

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_a6

    .line 142
    .line 143
    const-string v2, "No such file"

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_a6

    .line 150
    .line 151
    :cond_96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    const-string v3, "NoSuchFileException"

    .line 160
    .line 161
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_ae

    .line 166
    .line 167
    :cond_a6
    const p1, 0x7f13013f

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1, v1}, Lax/d3/n;->J4(II)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_12c

    .line 174
    .line 175
    :cond_ae
    iget-object v2, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 176
    .line 177
    const-string v3, ":"

    .line 178
    .line 179
    if-eqz v2, :cond_db

    .line 180
    .line 181
    new-instance v2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object p1, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 207
    .line 208
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    goto :goto_fa

    .line 220
    :cond_db
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string p1, ":ParcelFileDescriptor"

    .line 243
    .line 244
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    :goto_fa
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->J4(II)V

    .line 252
    .line 253
    .line 254
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    const-string v0, "ARCHIVE LOADING"

    .line 263
    .line 264
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 273
    .line 274
    .line 275
    goto :goto_12c

    .line 276
    :cond_113
    new-instance p1, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string p2, "archive error : "

    .line 282
    .line 283
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    iget-object p2, p0, Lax/d3/l;->A2:Lax/W2/t$a;

    .line 287
    .line 288
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0, v1}, Lax/d3/n;->J4(II)V

    .line 299
    .line 300
    .line 301
    :goto_12c
    const-string p1, "archive_get_operator"

    .line 302
    .line 303
    invoke-virtual {p0, p1}, Lax/d3/l;->i3(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    return-void
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

.method public n1(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Lax/d3/E;->n1(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_9

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lax/d3/l;->u2:Z

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lax/d3/l;->u2:Z

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
.end method

.method public q1(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 4

    .line 1
    const v0, 0x7f0f0017

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lax/d3/n;->G3(Landroid/view/MenuInflater;Landroid/view/Menu;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/d3/E;->O7(Landroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lax/d3/l;->ia(Landroid/view/Menu;)V

    .line 11
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
.end method

.method public s1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 11
    .line 12
    :cond_b
    invoke-super {p0}, Lax/d3/E;->s1()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public w7()Lcom/voxdon/xplorer/file/o;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    if-nez v0, :cond_6a

    .line 4
    .line 5
    iget v0, p0, Lax/d3/l;->B2:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_34

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_34

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq v0, v1, :cond_1a

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_16

    .line 18
    .line 19
    invoke-static {}, Lax/u3/b;->f()V

    .line 20
    .line 21
    .line 22
    goto :goto_4b

    .line 23
    :cond_16
    invoke-static {}, Lax/u3/b;->f()V

    .line 24
    .line 25
    .line 26
    goto :goto_4b

    .line 27
    :cond_1a
    iget v0, p0, Lax/d3/l;->y2:I

    .line 28
    .line 29
    if-nez v0, :cond_21

    .line 30
    .line 31
    invoke-static {}, Lax/u3/b;->f()V

    .line 32
    .line 33
    .line 34
    :cond_21
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 39
    .line 40
    iget-object v2, p0, Lax/d3/l;->v2:Ljava/lang/String;

    .line 41
    .line 42
    iget v3, p0, Lax/d3/l;->y2:I

    .line 43
    .line 44
    iget v4, p0, Lax/d3/l;->B2:I

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3, v4}, Lax/c3/x;->b(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;II)Lcom/voxdon/xplorer/file/o;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 51
    .line 52
    goto :goto_4b

    .line 53
    :cond_34
    iget-object v0, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 54
    .line 55
    if-nez v0, :cond_3b

    .line 56
    .line 57
    invoke-static {}, Lax/u3/b;->f()V

    .line 58
    .line 59
    .line 60
    :cond_3b
    invoke-virtual {p0}, Lax/d3/n;->A3()Lax/c3/K;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lax/d3/l;->z2:Landroid/net/Uri;

    .line 65
    .line 66
    iget-object v2, p0, Lax/d3/l;->x2:Lcom/voxdon/xplorer/file/y;

    .line 67
    .line 68
    iget v3, p0, Lax/d3/l;->B2:I

    .line 69
    .line 70
    invoke-static {v0, v1, v2, v3}, Lax/c3/x;->a(Lax/c3/K;Landroid/net/Uri;Lcom/voxdon/xplorer/file/y;I)Lcom/voxdon/xplorer/file/o;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 75
    .line 76
    :goto_4b
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 77
    .line 78
    if-nez v0, :cond_65

    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v1, "archive file operator == null :"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v1, p0, Lax/d3/l;->B2:I

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_65
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 105
    .line 106
    .line 107
    :cond_6a
    iget-object v0, p0, Lax/d3/l;->t2:Lcom/voxdon/xplorer/file/o;

    .line 108
    .line 109
    return-object v0
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

.method public z3()Lax/Q2/f;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->X0:Lax/Q2/f;

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
