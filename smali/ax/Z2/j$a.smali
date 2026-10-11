.class Lax/Z2/j$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/Z2/j;->R0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/Z2/j;


# direct methods
.method constructor <init>(Lax/Z2/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 7

    .line 1
    invoke-static {}, Lax/Q2/e;->d()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p1, v0}, Lax/Z2/j;->a(Lax/Z2/j;Z)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/Z2/j;->K0()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "local.intent.action.MOUNT_CHANGED"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lax/u3/g;->f(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_22

    .line 33
    .line 34
    goto :goto_2c

    .line 35
    :cond_22
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-nez p2, :cond_2d

    .line 44
    .line 45
    :goto_2c
    return-void

    .line 46
    :cond_2d
    const-string v1, "android.intent.action.MEDIA_MOUNTED"

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_fc

    .line 53
    .line 54
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 55
    .line 56
    invoke-static {p1}, Lax/Z2/j;->b(Lax/Z2/j;)Ljava/util/HashSet;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4c

    .line 65
    .line 66
    invoke-static {}, Lax/Z2/j;->c()Ljava/util/logging/Logger;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "Usb Volume Mounted"

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_15b

    .line 76
    .line 77
    :cond_4c
    invoke-static {p2}, Lax/Q2/e;->O(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_cb

    .line 82
    .line 83
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 84
    .line 85
    invoke-static {p1}, Lax/Z2/j;->d(Lax/Z2/j;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const/4 v1, 0x0

    .line 90
    if-nez p1, :cond_5d

    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    goto :goto_5e

    .line 94
    :cond_5d
    const/4 p1, 0x0

    .line 95
    :goto_5e
    iget-object v2, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 96
    .line 97
    invoke-static {v2, p2}, Lax/Z2/j;->e(Lax/Z2/j;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    sget-object v2, Lax/Q2/f;->u0:Lax/Q2/f;

    .line 101
    .line 102
    invoke-static {v2, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v3, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 107
    .line 108
    invoke-static {v3}, Lax/Z2/j;->d(Lax/Z2/j;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v2, v3}, Lax/c3/K;->i(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 116
    .line 117
    invoke-static {v2}, Lax/Z2/j;->d(Lax/Z2/j;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lax/c3/B;->e0(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_84

    .line 126
    .line 127
    iget-object v1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 128
    .line 129
    invoke-static {v1, v0}, Lax/Z2/j;->f(Lax/Z2/j;Z)Z

    .line 130
    .line 131
    .line 132
    goto :goto_89

    .line 133
    :cond_84
    iget-object v0, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 134
    .line 135
    invoke-static {v0, v1}, Lax/Z2/j;->f(Lax/Z2/j;Z)Z

    .line 136
    .line 137
    .line 138
    :goto_89
    invoke-static {p2}, Lax/Q2/e;->S(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 142
    .line 143
    sget-object v1, Lax/c3/K;->j:Lax/c3/K;

    .line 144
    .line 145
    sget-object v2, Lax/Z2/r;->c0:Lax/Z2/r;

    .line 146
    .line 147
    invoke-static {v0, v1, v2}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 151
    .line 152
    sget-object v1, Lax/c3/K;->k:Lax/c3/K;

    .line 153
    .line 154
    sget-object v2, Lax/Z2/r;->d0:Lax/Z2/r;

    .line 155
    .line 156
    invoke-static {v0, v1, v2}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p2}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v1, "/storage"

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_15b

    .line 170
    .line 171
    const-string v1, "/mnt"

    .line 172
    .line 173
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_15b

    .line 178
    .line 179
    if-eqz p1, :cond_15b

    .line 180
    .line 181
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v0, "UNKNOWN USB MOUNT!!"

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_15b

    .line 203
    .line 204
    :cond_cb
    invoke-static {}, Lax/Q2/e;->y()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eqz p1, :cond_e8

    .line 213
    .line 214
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 215
    .line 216
    invoke-static {p1, p2}, Lax/Z2/j;->i(Lax/Z2/j;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    sget-object p1, Lax/c3/K;->f:Lax/c3/K;

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lax/c3/K;->i(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object p2, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 225
    .line 226
    sget-object v0, Lax/Z2/r;->c0:Lax/Z2/r;

    .line 227
    .line 228
    invoke-static {p2, p1, v0}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_15b

    .line 232
    .line 233
    :cond_e8
    invoke-static {}, Lax/Q2/e;->v()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_15b

    .line 242
    .line 243
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 244
    .line 245
    sget-object p2, Lax/c3/K;->e:Lax/c3/K;

    .line 246
    .line 247
    sget-object v0, Lax/Z2/r;->c0:Lax/Z2/r;

    .line 248
    .line 249
    invoke-static {p1, p2, v0}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 250
    .line 251
    .line 252
    goto :goto_15b

    .line 253
    :cond_fc
    const-string v0, "android.intent.action.MEDIA_UNMOUNTED"

    .line 254
    .line 255
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_15b

    .line 260
    .line 261
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 262
    .line 263
    invoke-static {p1}, Lax/Z2/j;->h(Lax/Z2/j;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eqz p1, :cond_11a

    .line 272
    .line 273
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 274
    .line 275
    sget-object p2, Lax/c3/K;->f:Lax/c3/K;

    .line 276
    .line 277
    sget-object v0, Lax/Z2/r;->d0:Lax/Z2/r;

    .line 278
    .line 279
    invoke-static {p1, p2, v0}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 280
    .line 281
    .line 282
    goto :goto_15b

    .line 283
    :cond_11a
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 284
    .line 285
    invoke-static {p1}, Lax/Z2/j;->j(Lax/Z2/j;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_130

    .line 294
    .line 295
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 296
    .line 297
    sget-object p2, Lax/c3/K;->e:Lax/c3/K;

    .line 298
    .line 299
    sget-object v0, Lax/Z2/r;->d0:Lax/Z2/r;

    .line 300
    .line 301
    invoke-static {p1, p2, v0}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 302
    .line 303
    .line 304
    goto :goto_15b

    .line 305
    :cond_130
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 306
    .line 307
    invoke-static {p1}, Lax/Z2/j;->b(Lax/Z2/j;)Ljava/util/HashSet;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_146

    .line 316
    .line 317
    invoke-static {}, Lax/Z2/j;->c()Ljava/util/logging/Logger;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    const-string p2, "Usb Volume Unmounted"

    .line 322
    .line 323
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto :goto_15b

    .line 327
    :cond_146
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 328
    .line 329
    invoke-static {p1}, Lax/Z2/j;->d(Lax/Z2/j;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    if-eqz p1, :cond_15b

    .line 338
    .line 339
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 340
    .line 341
    sget-object p2, Lax/c3/K;->j:Lax/c3/K;

    .line 342
    .line 343
    sget-object v0, Lax/Z2/r;->d0:Lax/Z2/r;

    .line 344
    .line 345
    invoke-static {p1, p2, v0}, Lax/Z2/j;->g(Lax/Z2/j;Lax/c3/K;Lax/Z2/r;)V

    .line 346
    .line 347
    .line 348
    :cond_15b
    :goto_15b
    iget-object p1, p0, Lax/Z2/j$a;->a:Lax/Z2/j;

    .line 349
    .line 350
    invoke-static {p1}, Lax/Z2/j;->k(Lax/Z2/j;)V

    .line 351
    .line 352
    .line 353
    return-void
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
