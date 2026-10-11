.class public Lax/X2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation


# direct methods
.method public static a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;JJ)Landroid/net/Uri;
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, "android:moveDocument"

    .line 2
    .line 3
    const-string v1, "uri"

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p0, v2}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :try_start_d
    new-instance v4, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const-string v5, "parentUri"

    .line 23
    .line 24
    invoke-virtual {v4, v5, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 25
    .line 26
    .line 27
    const-string p2, "android.content.extra.TARGET_URI"

    .line 28
    .line 29
    invoke-virtual {v4, p2, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_1f} :catch_30
    .catchall {:try_start_d .. :try_end_1f} :catchall_2d

    .line 30
    .line 31
    .line 32
    :try_start_1f
    invoke-virtual {v2, v0, v3, v4}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Landroid/net/Uri;
    :try_end_29
    .catch Landroid/os/DeadObjectException; {:try_start_1f .. :try_end_29} :catch_33
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_29} :catch_30
    .catchall {:try_start_1f .. :try_end_29} :catchall_2d

    .line 41
    .line 42
    :try_start_29
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_2c} :catch_2c

    .line 43
    .line 44
    .line 45
    :catch_2c
    return-object p2

    .line 46
    :catchall_2d
    move-exception p0

    .line 47
    goto/16 :goto_13e

    .line 48
    .line 49
    :catch_30
    move-exception p2

    .line 50
    move-object v0, v3

    .line 51
    goto :goto_78

    .line 52
    :catch_33
    :try_start_33
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p0, p2}, Landroid/content/ContentResolver;->acquireContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    .line 57
    .line 58
    .line 59
    move-result-object p2
    :try_end_3b
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_3b} :catch_30
    .catchall {:try_start_33 .. :try_end_3b} :catchall_2d

    .line 60
    if-eqz p2, :cond_70

    .line 61
    .line 62
    :try_start_3d
    invoke-virtual {p2, v0, v3, v4}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "DeadObjectException RETRY SUCCESS"

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "MOVE"

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Lax/Ha/b;->h()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/net/Uri;
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_5e} :catch_6b
    .catchall {:try_start_3d .. :try_end_5e} :catchall_67

    .line 94
    .line 95
    if-eqz v2, :cond_63

    .line 96
    .line 97
    :try_start_60
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_63
    .catch Ljava/lang/Exception; {:try_start_60 .. :try_end_63} :catch_63

    .line 98
    .line 99
    .line 100
    :catch_63
    :cond_63
    :try_start_63
    invoke-virtual {p2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_66
    .catch Ljava/lang/Exception; {:try_start_63 .. :try_end_66} :catch_66

    .line 101
    .line 102
    .line 103
    :catch_66
    return-object v0

    .line 104
    :catchall_67
    move-exception p0

    .line 105
    move-object v3, p2

    .line 106
    goto/16 :goto_13e

    .line 107
    .line 108
    :catch_6b
    move-exception v0

    .line 109
    move-object v6, v0

    .line 110
    move-object v0, p2

    .line 111
    move-object p2, v6

    .line 112
    goto :goto_78

    .line 113
    :cond_70
    :try_start_70
    new-instance v0, Lax/b3/j;

    .line 114
    .line 115
    const-string v1, "ContentProviderClient for documentFile == null"

    .line 116
    .line 117
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0
    :try_end_78
    .catch Ljava/lang/Exception; {:try_start_70 .. :try_end_78} :catch_6b
    .catchall {:try_start_70 .. :try_end_78} :catchall_67

    .line 121
    :goto_78
    :try_start_78
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 122
    .line 123
    .line 124
    invoke-static {p0, p1}, Lax/X2/v;->k(Landroid/content/ContentResolver;Landroid/net/Uri;)Lax/X2/v$a;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget v4, v1, Lax/X2/v$a;->a:I

    .line 129
    .line 130
    sget v5, Lax/X2/v;->b:I

    .line 131
    .line 132
    if-ne v4, v5, :cond_de

    .line 133
    .line 134
    invoke-static {p1, p3}, Lax/X2/y;->d(Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p0, p1}, Lax/X2/v;->k(Landroid/content/ContentResolver;Landroid/net/Uri;)Lax/X2/v$a;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    iget p0, v3, Lax/X2/v$a;->a:I

    .line 143
    .line 144
    sget p3, Lax/X2/v;->a:I

    .line 145
    .line 146
    if-ne p0, p3, :cond_de

    .line 147
    .line 148
    invoke-static {}, Lax/X2/Q;->E()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_ae

    .line 153
    .line 154
    instance-of p0, p2, Ljava/lang/NullPointerException;
    :try_end_9b
    .catchall {:try_start_78 .. :try_end_9b} :catchall_aa

    .line 155
    .line 156
    if-eqz p0, :cond_ae

    .line 157
    .line 158
    if-eqz v2, :cond_a4

    .line 159
    .line 160
    :try_start_9f
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_a2
    .catch Ljava/lang/Exception; {:try_start_9f .. :try_end_a2} :catch_a3

    .line 161
    .line 162
    .line 163
    goto :goto_a4

    .line 164
    :catch_a3
    nop

    .line 165
    :cond_a4
    :goto_a4
    if-eqz v0, :cond_dd

    .line 166
    .line 167
    :goto_a6
    :try_start_a6
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_a9
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_a9} :catch_dd

    .line 168
    .line 169
    .line 170
    goto :goto_dd

    .line 171
    :catchall_aa
    move-exception p0

    .line 172
    move-object v3, v0

    .line 173
    goto/16 :goto_13e

    .line 174
    .line 175
    :cond_ae
    :try_start_ae
    iget-object p0, v3, Lax/X2/v$a;->b:Lax/c3/l;

    .line 176
    .line 177
    if-eqz p0, :cond_de

    .line 178
    .line 179
    iget-wide v4, p0, Lax/c3/l;->e:J

    .line 180
    .line 181
    cmp-long p3, v4, p4

    .line 182
    .line 183
    if-nez p3, :cond_de

    .line 184
    .line 185
    iget-wide p3, p0, Lax/c3/l;->d:J

    .line 186
    .line 187
    cmp-long p0, p3, p6

    .line 188
    .line 189
    if-nez p0, :cond_de

    .line 190
    .line 191
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    const-string p3, "Move document target exist"

    .line 200
    .line 201
    invoke-virtual {p0, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {p0}, Lax/Ha/b;->h()V
    :try_end_d3
    .catchall {:try_start_ae .. :try_end_d3} :catchall_aa

    .line 210
    .line 211
    .line 212
    if-eqz v2, :cond_da

    .line 213
    .line 214
    :try_start_d5
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_d8
    .catch Ljava/lang/Exception; {:try_start_d5 .. :try_end_d8} :catch_d9

    .line 215
    .line 216
    .line 217
    goto :goto_da

    .line 218
    :catch_d9
    nop

    .line 219
    :cond_da
    :goto_da
    if-eqz v0, :cond_dd

    .line 220
    .line 221
    goto :goto_a6

    .line 222
    :catch_dd
    :cond_dd
    :goto_dd
    return-object p1

    .line 223
    :cond_de
    :try_start_de
    iget p0, v1, Lax/X2/v$a;->a:I

    .line 224
    .line 225
    sget p1, Lax/X2/v;->b:I
    :try_end_e2
    .catchall {:try_start_de .. :try_end_e2} :catchall_aa

    .line 226
    .line 227
    const-string p3, ":"

    .line 228
    .line 229
    if-ne p0, p1, :cond_115

    .line 230
    .line 231
    if-eqz v3, :cond_115

    .line 232
    .line 233
    :try_start_e8
    iget p0, v3, Lax/X2/v$a;->a:I

    .line 234
    .line 235
    if-ne p0, p1, :cond_115

    .line 236
    .line 237
    new-instance p0, Lax/b3/t;

    .line 238
    .line 239
    new-instance p1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string p4, "move document not exist : "

    .line 245
    .line 246
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object p4

    .line 253
    invoke-virtual {p4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p4

    .line 257
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-direct {p0, p1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw p0

    .line 278
    :cond_115
    new-instance p0, Lax/b3/j;

    .line 279
    .line 280
    new-instance p1, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const-string p4, "move document exception : "

    .line 286
    .line 287
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object p4

    .line 294
    invoke-virtual {p4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p4

    .line 298
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p0
    :try_end_13e
    .catchall {:try_start_e8 .. :try_end_13e} :catchall_aa

    .line 319
    :goto_13e
    if-eqz v2, :cond_145

    .line 320
    .line 321
    :try_start_140
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_143
    .catch Ljava/lang/Exception; {:try_start_140 .. :try_end_143} :catch_144

    .line 322
    .line 323
    .line 324
    goto :goto_145

    .line 325
    :catch_144
    nop

    .line 326
    :cond_145
    :goto_145
    if-eqz v3, :cond_14a

    .line 327
    .line 328
    :try_start_147
    invoke-virtual {v3}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_14a
    .catch Ljava/lang/Exception; {:try_start_147 .. :try_end_14a} :catch_14a

    .line 329
    .line 330
    .line 331
    :catch_14a
    :cond_14a
    throw p0
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

.method public static b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .registers 3

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/storage/StorageManager;

    .line 8
    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lax/X2/f;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Landroid/os/storage/StorageVolume;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p1, 0x0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_15
    invoke-static {p0, p1}, Lax/X2/x;->a(Landroid/os/storage/StorageVolume;Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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

.method public static c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .registers 5

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/storage/StorageManager;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    invoke-static {p0}, Lax/X2/d;->a(Landroid/os/storage/StorageManager;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_33

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lax/X2/e;->a(Ljava/lang/Object;)Landroid/os/storage/StorageVolume;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz p1, :cond_14

    .line 36
    .line 37
    invoke-static {v1}, Lax/X2/k;->a(Landroid/os/storage/StorageVolume;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_14

    .line 46
    .line 47
    invoke-static {v1, v0}, Lax/X2/x;->a(Landroid/os/storage/StorageVolume;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_33
    return-object v0
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

.method private static d(Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;
    .registers 4

    .line 1
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, v0}, Landroid/provider/DocumentsContract;->buildTreeDocumentUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0}, Lax/X2/y;->e(Landroid/net/Uri;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "/"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {v0, p0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
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

.method private static e(Landroid/net/Uri;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "/"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
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
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Lax/X2/N;
    .registers 3

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/storage/StorageManager;

    .line 8
    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lax/X2/a;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Lax/X2/N;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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
