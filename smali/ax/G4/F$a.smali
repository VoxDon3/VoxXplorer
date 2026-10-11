.class Lax/G4/F$a;
.super Lax/v4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/e<",
        "Lax/G4/F;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/F$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/F$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/F$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/F$a;->b:Lax/G4/F$a;

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

.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/v4/e;-><init>()V

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


# virtual methods
.method public bridge synthetic s(Lax/T4/j;Z)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/G4/F$a;->u(Lax/T4/j;Z)Lax/G4/F;

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
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lax/T4/g;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/G4/F;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lax/G4/F$a;->v(Lax/G4/F;Lax/T4/g;Z)V

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

.method public u(Lax/T4/j;Z)Lax/G4/F;
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_d

    .line 5
    .line 6
    invoke-static {v0}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    move-object v2, v1

    .line 15
    :goto_e
    if-nez v2, :cond_137

    .line 16
    .line 17
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    move-object v5, v1

    .line 22
    move-object v11, v5

    .line 23
    move-object v12, v11

    .line 24
    move-object v13, v12

    .line 25
    move-object v1, v2

    .line 26
    move-object v4, v1

    .line 27
    move-object v6, v3

    .line 28
    move-object v7, v6

    .line 29
    move-object v3, v4

    .line 30
    :goto_1d
    invoke-virtual {v0}, Lax/T4/j;->j()Lax/T4/m;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    sget-object v9, Lax/T4/m;->p0:Lax/T4/m;

    .line 35
    .line 36
    if-ne v8, v9, :cond_ff

    .line 37
    .line 38
    invoke-virtual {v0}, Lax/T4/j;->g()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v0}, Lax/T4/j;->H()Lax/T4/m;

    .line 43
    .line 44
    .line 45
    const-string v9, "path"

    .line 46
    .line 47
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_3f

    .line 52
    .line 53
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Ljava/lang/String;

    .line 62
    .line 63
    goto :goto_1d

    .line 64
    :cond_3f
    const-string v9, "recursive"

    .line 65
    .line 66
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_52

    .line 71
    .line 72
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    goto :goto_1d

    .line 83
    :cond_52
    const-string v9, "include_media_info"

    .line 84
    .line 85
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_65

    .line 90
    .line 91
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/Boolean;

    .line 100
    .line 101
    goto :goto_1d

    .line 102
    :cond_65
    const-string v9, "include_deleted"

    .line 103
    .line 104
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_78

    .line 109
    .line 110
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/Boolean;

    .line 119
    .line 120
    goto :goto_1d

    .line 121
    :cond_78
    const-string v9, "include_has_explicit_shared_members"

    .line 122
    .line 123
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_8b

    .line 128
    .line 129
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Ljava/lang/Boolean;

    .line 138
    .line 139
    goto :goto_1d

    .line 140
    :cond_8b
    const-string v9, "include_mounted_folders"

    .line 141
    .line 142
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_9f

    .line 147
    .line 148
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/Boolean;

    .line 157
    .line 158
    goto/16 :goto_1d

    .line 159
    .line 160
    :cond_9f
    const-string v9, "limit"

    .line 161
    .line 162
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_b8

    .line 167
    .line 168
    invoke-static {}, Lax/v4/d;->h()Lax/v4/c;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-static {v8}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-virtual {v8, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Ljava/lang/Long;

    .line 181
    .line 182
    move-object v11, v8

    .line 183
    goto/16 :goto_1d

    .line 184
    .line 185
    :cond_b8
    const-string v9, "shared_link"

    .line 186
    .line 187
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_cf

    .line 192
    .line 193
    sget-object v8, Lax/G4/k0$a;->b:Lax/G4/k0$a;

    .line 194
    .line 195
    invoke-static {v8}, Lax/v4/d;->e(Lax/v4/e;)Lax/v4/e;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-virtual {v8, v0}, Lax/v4/e;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, Lax/G4/k0;

    .line 204
    .line 205
    move-object v12, v8

    .line 206
    goto/16 :goto_1d

    .line 207
    .line 208
    :cond_cf
    const-string v9, "include_property_groups"

    .line 209
    .line 210
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_e6

    .line 215
    .line 216
    sget-object v8, Lax/E4/g$b;->b:Lax/E4/g$b;

    .line 217
    .line 218
    invoke-static {v8}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-virtual {v8, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    check-cast v8, Lax/E4/g;

    .line 227
    .line 228
    move-object v13, v8

    .line 229
    goto/16 :goto_1d

    .line 230
    .line 231
    :cond_e6
    const-string v9, "include_non_downloadable_files"

    .line 232
    .line 233
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eqz v8, :cond_fa

    .line 238
    .line 239
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-virtual {v7, v0}, Lax/v4/c;->a(Lax/T4/j;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    check-cast v7, Ljava/lang/Boolean;

    .line 248
    .line 249
    goto/16 :goto_1d

    .line 250
    .line 251
    :cond_fa
    invoke-static {v0}, Lax/v4/c;->o(Lax/T4/j;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1d

    .line 255
    .line 256
    :cond_ff
    if-eqz v5, :cond_12f

    .line 257
    .line 258
    move-object v8, v4

    .line 259
    new-instance v4, Lax/G4/F;

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    move v7, v1

    .line 286
    move v6, v2

    .line 287
    move v8, v3

    .line 288
    invoke-direct/range {v4 .. v14}, Lax/G4/F;-><init>(Ljava/lang/String;ZZZZZLjava/lang/Long;Lax/G4/k0;Lax/E4/g;Z)V

    .line 289
    .line 290
    .line 291
    if-nez p2, :cond_127

    .line 292
    .line 293
    invoke-static {v0}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 294
    .line 295
    .line 296
    :cond_127
    invoke-virtual {v4}, Lax/G4/F;->a()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v4, v0}, Lax/v4/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    return-object v4

    .line 304
    :cond_12f
    new-instance v1, Lax/T4/i;

    .line 305
    .line 306
    const-string v2, "Required field \"path\" missing."

    .line 307
    .line 308
    invoke-direct {v1, v0, v2}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v1

    .line 312
    :cond_137
    new-instance v1, Lax/T4/i;

    .line 313
    .line 314
    new-instance v3, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const-string v4, "No subtype found that matches tag: \""

    .line 320
    .line 321
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string v2, "\""

    .line 328
    .line 329
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-direct {v1, v0, v2}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v1
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

.method public v(Lax/G4/F;Lax/T4/g;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    if-nez p3, :cond_5

    .line 2
    .line 3
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 4
    .line 5
    .line 6
    :cond_5
    const-string v0, "path"

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lax/v4/d;->f()Lax/v4/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p1, Lax/G4/F;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "recursive"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-boolean v1, p1, Lax/G4/F;->b:Z

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "include_media_info"

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-boolean v1, p1, Lax/G4/F;->c:Z

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "include_deleted"

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-boolean v1, p1, Lax/G4/F;->d:Z

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "include_has_explicit_shared_members"

    .line 75
    .line 76
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-boolean v1, p1, Lax/G4/F;->e:Z

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "include_mounted_folders"

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-boolean v1, p1, Lax/G4/F;->f:Z

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p1, Lax/G4/F;->g:Ljava/lang/Long;

    .line 111
    .line 112
    if-eqz v0, :cond_83

    .line 113
    .line 114
    const-string v0, "limit"

    .line 115
    .line 116
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lax/v4/d;->h()Lax/v4/c;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-object v1, p1, Lax/G4/F;->g:Ljava/lang/Long;

    .line 128
    .line 129
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 130
    .line 131
    .line 132
    :cond_83
    iget-object v0, p1, Lax/G4/F;->h:Lax/G4/k0;

    .line 133
    .line 134
    if-eqz v0, :cond_97

    .line 135
    .line 136
    const-string v0, "shared_link"

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lax/G4/k0$a;->b:Lax/G4/k0$a;

    .line 142
    .line 143
    invoke-static {v0}, Lax/v4/d;->e(Lax/v4/e;)Lax/v4/e;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v1, p1, Lax/G4/F;->h:Lax/G4/k0;

    .line 148
    .line 149
    invoke-virtual {v0, v1, p2}, Lax/v4/e;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 150
    .line 151
    .line 152
    :cond_97
    iget-object v0, p1, Lax/G4/F;->i:Lax/E4/g;

    .line 153
    .line 154
    if-eqz v0, :cond_ab

    .line 155
    .line 156
    const-string v0, "include_property_groups"

    .line 157
    .line 158
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lax/E4/g$b;->b:Lax/E4/g$b;

    .line 162
    .line 163
    invoke-static {v0}, Lax/v4/d;->d(Lax/v4/c;)Lax/v4/c;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v1, p1, Lax/G4/F;->i:Lax/E4/g;

    .line 168
    .line 169
    invoke-virtual {v0, v1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 170
    .line 171
    .line 172
    :cond_ab
    const-string v0, "include_non_downloadable_files"

    .line 173
    .line 174
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {}, Lax/v4/d;->a()Lax/v4/c;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-boolean p1, p1, Lax/G4/F;->j:Z

    .line 182
    .line 183
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {v0, p1, p2}, Lax/v4/c;->k(Ljava/lang/Object;Lax/T4/g;)V

    .line 188
    .line 189
    .line 190
    if-nez p3, :cond_c2

    .line 191
    .line 192
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 193
    .line 194
    .line 195
    :cond_c2
    return-void
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
