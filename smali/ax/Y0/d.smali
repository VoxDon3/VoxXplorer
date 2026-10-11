.class public Lax/Y0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Y0/X;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lax/f1/o;

.field private c:I

.field private d:J

.field private e:Z

.field private f:Lax/f1/Q;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:J

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Lax/f1/o;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lax/f1/o;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/Y0/d;->b:Lax/f1/o;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lax/Y0/d;->c:I

    .line 15
    .line 16
    const-wide/16 v0, 0x1388

    .line 17
    .line 18
    iput-wide v0, p0, Lax/Y0/d;->d:J

    .line 19
    .line 20
    sget-object p1, Lax/f1/Q;->a:Lax/f1/Q;

    .line 21
    .line 22
    iput-object p1, p0, Lax/Y0/d;->f:Lax/f1/Q;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, Lax/Y0/d;->k:J

    .line 30
    .line 31
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
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/M0;Landroid/os/Handler;Lax/o1/P;Lax/a1/z;Lax/k1/h;Lax/g1/b;)Landroidx/media3/exoplayer/M0;
    .registers 17

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/M0;->k()I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    const/4 p5, 0x2

    .line 6
    if-ne p4, p5, :cond_1a

    .line 7
    .line 8
    iget-object v2, p0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget v3, p0, Lax/Y0/d;->c:I

    .line 11
    .line 12
    iget-object v4, p0, Lax/Y0/d;->f:Lax/f1/Q;

    .line 13
    .line 14
    iget-boolean v5, p0, Lax/Y0/d;->e:Z

    .line 15
    .line 16
    iget-wide v8, p0, Lax/Y0/d;->d:J

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    move-object v1, p1

    .line 20
    move-object v6, p2

    .line 21
    move-object v7, p3

    .line 22
    invoke-virtual/range {v0 .. v9}, Lax/Y0/d;->j(Landroidx/media3/exoplayer/M0;Landroid/content/Context;ILax/f1/Q;ZLandroid/os/Handler;Lax/o1/P;J)Landroidx/media3/exoplayer/M0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return-object p1
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

.method public b(Landroid/os/Handler;Lax/o1/P;Lax/a1/z;Lax/k1/h;Lax/g1/b;)[Landroidx/media3/exoplayer/M0;
    .registers 16

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget v2, p0, Lax/Y0/d;->c:I

    .line 9
    .line 10
    iget-object v3, p0, Lax/Y0/d;->f:Lax/f1/Q;

    .line 11
    .line 12
    iget-boolean v4, p0, Lax/Y0/d;->e:Z

    .line 13
    .line 14
    iget-wide v7, p0, Lax/Y0/d;->d:J

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    move-object v6, p2

    .line 18
    move-object v9, v5

    .line 19
    move-object v5, p1

    .line 20
    invoke-virtual/range {v0 .. v9}, Lax/Y0/d;->l(Landroid/content/Context;ILax/f1/Q;ZLandroid/os/Handler;Lax/o1/P;JLjava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    move-object v8, v9

    .line 24
    iget-object p1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 25
    .line 26
    iget-boolean p2, v0, Lax/Y0/d;->g:Z

    .line 27
    .line 28
    iget-boolean v1, v0, Lax/Y0/d;->h:Z

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2, v1}, Lax/Y0/d;->d(Landroid/content/Context;ZZ)Lax/a1/B;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_33

    .line 35
    .line 36
    iget-object v1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 37
    .line 38
    iget v2, v0, Lax/Y0/d;->c:I

    .line 39
    .line 40
    iget-object v3, v0, Lax/Y0/d;->f:Lax/f1/Q;

    .line 41
    .line 42
    iget-boolean v4, v0, Lax/Y0/d;->e:Z

    .line 43
    .line 44
    move-object v7, p3

    .line 45
    move-object v6, v5

    .line 46
    move-object v5, p1

    .line 47
    invoke-virtual/range {v0 .. v8}, Lax/Y0/d;->c(Landroid/content/Context;ILax/f1/Q;ZLax/a1/B;Landroid/os/Handler;Lax/a1/z;Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    :goto_31
    move-object v5, v8

    .line 51
    goto :goto_35

    .line 52
    :cond_33
    move-object v6, v5

    .line 53
    goto :goto_31

    .line 54
    :goto_35
    iget-object v1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget v4, v0, Lax/Y0/d;->c:I

    .line 61
    .line 62
    move-object v2, p4

    .line 63
    invoke-virtual/range {v0 .. v5}, Lax/Y0/d;->k(Landroid/content/Context;Lax/k1/h;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, v0, Lax/Y0/d;->c:I

    .line 73
    .line 74
    move-object v2, p5

    .line 75
    invoke-virtual/range {v0 .. v5}, Lax/Y0/d;->h(Landroid/content/Context;Lax/g1/b;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 79
    .line 80
    iget p2, v0, Lax/Y0/d;->c:I

    .line 81
    .line 82
    invoke-virtual {p0, p1, p2, v5}, Lax/Y0/d;->e(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 86
    .line 87
    invoke-virtual {p0, p1, v5}, Lax/Y0/d;->f(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, v0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 91
    .line 92
    iget p2, v0, Lax/Y0/d;->c:I

    .line 93
    .line 94
    invoke-virtual {p0, p1, v6, p2, v5}, Lax/Y0/d;->i(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    new-array p1, p1, [Landroidx/media3/exoplayer/M0;

    .line 99
    .line 100
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, [Landroidx/media3/exoplayer/M0;

    .line 105
    .line 106
    return-object p1
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

.method protected c(Landroid/content/Context;ILax/f1/Q;ZLax/a1/B;Landroid/os/Handler;Lax/a1/z;Ljava/util/ArrayList;)V
    .registers 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lax/f1/Q;",
            "Z",
            "Lax/a1/B;",
            "Landroid/os/Handler;",
            "Lax/a1/z;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    const-class v7, Landroid/content/Context;

    .line 11
    .line 12
    const-string v8, "DefaultRenderersFactory"

    .line 13
    .line 14
    const-class v9, Lax/a1/B;

    .line 15
    .line 16
    const-class v10, Lax/a1/z;

    .line 17
    .line 18
    const-class v11, Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v12, Lax/a1/C0;

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p0}, Lax/Y0/d;->m()Lax/f1/x$b;

    .line 23
    .line 24
    .line 25
    move-result-object v14

    .line 26
    move-object/from16 v13, p1

    .line 27
    .line 28
    move-object/from16 v15, p3

    .line 29
    .line 30
    move/from16 v16, p4

    .line 31
    .line 32
    move-object/from16 v19, p5

    .line 33
    .line 34
    move-object/from16 v17, p6

    .line 35
    .line 36
    move-object/from16 v18, p7

    .line 37
    .line 38
    invoke-direct/range {v12 .. v19}, Lax/a1/C0;-><init>(Landroid/content/Context;Lax/f1/x$b;Lax/f1/Q;ZLandroid/os/Handler;Lax/a1/z;Lax/a1/B;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    if-nez v0, :cond_2f

    .line 45
    .line 46
    goto/16 :goto_183

    .line 47
    .line 48
    :cond_2f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-ne v0, v5, :cond_37

    .line 53
    .line 54
    add-int/lit8 v12, v12, -0x1

    .line 55
    .line 56
    :cond_37
    :try_start_37
    const-class v0, Lax/X0/f;

    .line 57
    .line 58
    new-array v13, v2, [Ljava/lang/Class;

    .line 59
    .line 60
    aput-object v7, v13, v4

    .line 61
    .line 62
    aput-object v11, v13, v6

    .line 63
    .line 64
    aput-object v10, v13, v5

    .line 65
    .line 66
    aput-object v9, v13, v3

    .line 67
    .line 68
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-array v13, v2, [Ljava/lang/Object;

    .line 73
    .line 74
    aput-object p1, v13, v4

    .line 75
    .line 76
    aput-object p6, v13, v6

    .line 77
    .line 78
    aput-object p7, v13, v5

    .line 79
    .line 80
    aput-object p5, v13, v3

    .line 81
    .line 82
    invoke-virtual {v0, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_57
    .catch Ljava/lang/ClassNotFoundException; {:try_start_37 .. :try_end_57} :catch_6e
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_57} :catch_62

    .line 87
    .line 88
    add-int/lit8 v13, v12, 0x1

    .line 89
    .line 90
    :try_start_59
    invoke-virtual {v1, v12, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const-string v0, "Loaded MidiRenderer."

    .line 94
    .line 95
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_61
    .catch Ljava/lang/ClassNotFoundException; {:try_start_59 .. :try_end_61} :catch_64
    .catch Ljava/lang/Exception; {:try_start_59 .. :try_end_61} :catch_62

    .line 96
    .line 97
    .line 98
    goto :goto_6f

    .line 99
    :catch_62
    move-exception v0

    .line 100
    goto :goto_66

    .line 101
    :catch_64
    move v12, v13

    .line 102
    goto :goto_6e

    .line 103
    :goto_66
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string v2, "Error instantiating MIDI extension"

    .line 106
    .line 107
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :catch_6e
    :goto_6e
    move v13, v12

    .line 112
    :goto_6f
    :try_start_6f
    const-string v0, "androidx.media3.decoder.opus.LibopusAudioRenderer"

    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-array v12, v3, [Ljava/lang/Class;

    .line 119
    .line 120
    aput-object v11, v12, v4

    .line 121
    .line 122
    aput-object v10, v12, v6

    .line 123
    .line 124
    aput-object v9, v12, v5

    .line 125
    .line 126
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-array v12, v3, [Ljava/lang/Object;

    .line 131
    .line 132
    aput-object p6, v12, v4

    .line 133
    .line 134
    aput-object p7, v12, v6

    .line 135
    .line 136
    aput-object p5, v12, v5

    .line 137
    .line 138
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_8f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6f .. :try_end_8f} :catch_a6
    .catch Ljava/lang/Exception; {:try_start_6f .. :try_end_8f} :catch_9a

    .line 143
    .line 144
    add-int/lit8 v12, v13, 0x1

    .line 145
    .line 146
    :try_start_91
    invoke-virtual {v1, v13, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const-string v0, "Loaded LibopusAudioRenderer."

    .line 150
    .line 151
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_99
    .catch Ljava/lang/ClassNotFoundException; {:try_start_91 .. :try_end_99} :catch_9c
    .catch Ljava/lang/Exception; {:try_start_91 .. :try_end_99} :catch_9a

    .line 152
    .line 153
    .line 154
    goto :goto_a7

    .line 155
    :catch_9a
    move-exception v0

    .line 156
    goto :goto_9e

    .line 157
    :catch_9c
    move v13, v12

    .line 158
    goto :goto_a6

    .line 159
    :goto_9e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v2, "Error instantiating Opus extension"

    .line 162
    .line 163
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :catch_a6
    :goto_a6
    move v12, v13

    .line 168
    :goto_a7
    :try_start_a7
    const-string v0, "androidx.media3.decoder.flac.LibflacAudioRenderer"

    .line 169
    .line 170
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-array v13, v3, [Ljava/lang/Class;

    .line 175
    .line 176
    aput-object v11, v13, v4

    .line 177
    .line 178
    aput-object v10, v13, v6

    .line 179
    .line 180
    aput-object v9, v13, v5

    .line 181
    .line 182
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-array v13, v3, [Ljava/lang/Object;

    .line 187
    .line 188
    aput-object p6, v13, v4

    .line 189
    .line 190
    aput-object p7, v13, v6

    .line 191
    .line 192
    aput-object p5, v13, v5

    .line 193
    .line 194
    invoke-virtual {v0, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_c7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a7 .. :try_end_c7} :catch_de
    .catch Ljava/lang/Exception; {:try_start_a7 .. :try_end_c7} :catch_d2

    .line 199
    .line 200
    add-int/lit8 v13, v12, 0x1

    .line 201
    .line 202
    :try_start_c9
    invoke-virtual {v1, v12, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    const-string v0, "Loaded LibflacAudioRenderer."

    .line 206
    .line 207
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c9 .. :try_end_d1} :catch_d4
    .catch Ljava/lang/Exception; {:try_start_c9 .. :try_end_d1} :catch_d2

    .line 208
    .line 209
    .line 210
    goto :goto_df

    .line 211
    :catch_d2
    move-exception v0

    .line 212
    goto :goto_d6

    .line 213
    :catch_d4
    move v12, v13

    .line 214
    goto :goto_de

    .line 215
    :goto_d6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 216
    .line 217
    const-string v2, "Error instantiating FLAC extension"

    .line 218
    .line 219
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    throw v1

    .line 223
    :catch_de
    :goto_de
    move v13, v12

    .line 224
    :goto_df
    :try_start_df
    const-class v0, Landroidx/media3/decoder/ffmpeg/b;

    .line 225
    .line 226
    sget v12, Landroidx/media3/decoder/ffmpeg/b;->W0:I

    .line 227
    .line 228
    new-array v12, v3, [Ljava/lang/Class;

    .line 229
    .line 230
    aput-object v11, v12, v4

    .line 231
    .line 232
    aput-object v10, v12, v6

    .line 233
    .line 234
    aput-object v9, v12, v5

    .line 235
    .line 236
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-array v12, v3, [Ljava/lang/Object;

    .line 241
    .line 242
    aput-object p6, v12, v4

    .line 243
    .line 244
    aput-object p7, v12, v6

    .line 245
    .line 246
    aput-object p5, v12, v5

    .line 247
    .line 248
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_fd
    .catch Ljava/lang/ClassNotFoundException; {:try_start_df .. :try_end_fd} :catch_114
    .catch Ljava/lang/Exception; {:try_start_df .. :try_end_fd} :catch_108

    .line 253
    .line 254
    add-int/lit8 v12, v13, 0x1

    .line 255
    .line 256
    :try_start_ff
    invoke-virtual {v1, v13, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    const-string v0, "Loaded FfmpegAudioRenderer."

    .line 260
    .line 261
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_107
    .catch Ljava/lang/ClassNotFoundException; {:try_start_ff .. :try_end_107} :catch_10a
    .catch Ljava/lang/Exception; {:try_start_ff .. :try_end_107} :catch_108

    .line 262
    .line 263
    .line 264
    goto :goto_115

    .line 265
    :catch_108
    move-exception v0

    .line 266
    goto :goto_10c

    .line 267
    :catch_10a
    move v13, v12

    .line 268
    goto :goto_114

    .line 269
    :goto_10c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 270
    .line 271
    const-string v2, "Error instantiating FFmpeg extension"

    .line 272
    .line 273
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    throw v1

    .line 277
    :catch_114
    :goto_114
    move v12, v13

    .line 278
    :goto_115
    :try_start_115
    const-string v0, "androidx.media3.decoder.iamf.LibiamfAudioRenderer"

    .line 279
    .line 280
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    new-array v13, v2, [Ljava/lang/Class;

    .line 285
    .line 286
    aput-object v7, v13, v4

    .line 287
    .line 288
    aput-object v11, v13, v6

    .line 289
    .line 290
    aput-object v10, v13, v5

    .line 291
    .line 292
    aput-object v9, v13, v3

    .line 293
    .line 294
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    new-array v2, v2, [Ljava/lang/Object;

    .line 299
    .line 300
    aput-object p1, v2, v4

    .line 301
    .line 302
    aput-object p6, v2, v6

    .line 303
    .line 304
    aput-object p7, v2, v5

    .line 305
    .line 306
    aput-object p5, v2, v3

    .line 307
    .line 308
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_139
    .catch Ljava/lang/ClassNotFoundException; {:try_start_115 .. :try_end_139} :catch_150
    .catch Ljava/lang/Exception; {:try_start_115 .. :try_end_139} :catch_144

    .line 313
    .line 314
    add-int/lit8 v2, v12, 0x1

    .line 315
    .line 316
    :try_start_13b
    invoke-virtual {v1, v12, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    const-string v0, "Loaded LibiamfAudioRenderer."

    .line 320
    .line 321
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_143
    .catch Ljava/lang/ClassNotFoundException; {:try_start_13b .. :try_end_143} :catch_146
    .catch Ljava/lang/Exception; {:try_start_13b .. :try_end_143} :catch_144

    .line 322
    .line 323
    .line 324
    goto :goto_151

    .line 325
    :catch_144
    move-exception v0

    .line 326
    goto :goto_148

    .line 327
    :catch_146
    move v12, v2

    .line 328
    goto :goto_150

    .line 329
    :goto_148
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 330
    .line 331
    const-string v2, "Error instantiating IAMF extension"

    .line 332
    .line 333
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    throw v1

    .line 337
    :catch_150
    :goto_150
    move v2, v12

    .line 338
    :goto_151
    :try_start_151
    const-string v0, "androidx.media3.decoder.mpegh.MpeghAudioRenderer"

    .line 339
    .line 340
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    new-array v7, v3, [Ljava/lang/Class;

    .line 345
    .line 346
    aput-object v11, v7, v4

    .line 347
    .line 348
    aput-object v10, v7, v6

    .line 349
    .line 350
    aput-object v9, v7, v5

    .line 351
    .line 352
    invoke-virtual {v0, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    new-array v3, v3, [Ljava/lang/Object;

    .line 357
    .line 358
    aput-object p6, v3, v4

    .line 359
    .line 360
    aput-object p7, v3, v6

    .line 361
    .line 362
    aput-object p5, v3, v5

    .line 363
    .line 364
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, Landroidx/media3/exoplayer/M0;

    .line 369
    .line 370
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    const-string v0, "Loaded MpeghAudioRenderer."

    .line 374
    .line 375
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_179
    .catch Ljava/lang/ClassNotFoundException; {:try_start_151 .. :try_end_179} :catch_183
    .catch Ljava/lang/Exception; {:try_start_151 .. :try_end_179} :catch_17a

    .line 376
    .line 377
    .line 378
    goto :goto_183

    .line 379
    :catch_17a
    move-exception v0

    .line 380
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 381
    .line 382
    const-string v2, "Error instantiating MPEG-H extension"

    .line 383
    .line 384
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    throw v1

    .line 388
    :catch_183
    :goto_183
    return-void
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
.end method

.method protected d(Landroid/content/Context;ZZ)Lax/a1/B;
    .registers 5

    .line 1
    new-instance v0, Lax/a1/f0$g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/a1/f0$g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Lax/a1/f0$g;->o(Z)Lax/a1/f0$g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p3}, Lax/a1/f0$g;->n(Z)Lax/a1/f0$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lax/a1/f0$g;->k()Lax/a1/f0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method protected e(Landroid/content/Context;ILjava/util/ArrayList;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/p1/b;

    .line 2
    .line 3
    invoke-direct {p1}, Lax/p1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

.method protected f(Landroid/content/Context;Ljava/util/ArrayList;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lax/Y0/d;->g(Ljava/util/ArrayList;)V

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

.method protected g(Ljava/util/ArrayList;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lax/e1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Y0/d;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lax/Y0/d;->n(Landroid/content/Context;)Lax/e1/b$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lax/e1/e;-><init>(Lax/e1/b$a;Landroidx/media3/exoplayer/image/ImageOutput;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
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

.method protected h(Landroid/content/Context;Lax/g1/b;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/g1/b;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/g1/c;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lax/g1/c;-><init>(Lax/g1/b;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    new-instance p1, Lax/g1/c;

    .line 10
    .line 11
    invoke-direct {p1, p2, p3}, Lax/g1/c;-><init>(Lax/g1/b;Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method protected i(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "I",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
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
.end method

.method protected j(Landroidx/media3/exoplayer/M0;Landroid/content/Context;ILax/f1/Q;ZLandroid/os/Handler;Lax/o1/P;J)Landroidx/media3/exoplayer/M0;
    .registers 10

    .line 1
    iget-boolean p3, p0, Lax/Y0/d;->i:Z

    .line 2
    .line 3
    if-eqz p3, :cond_50

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class p3, Lax/o1/k;

    .line 10
    .line 11
    if-ne p1, p3, :cond_50

    .line 12
    .line 13
    new-instance p1, Lax/o1/k$d;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Lax/o1/k$d;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lax/Y0/d;->m()Lax/f1/x$b;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Lax/o1/k$d;->s(Lax/f1/x$b;)Lax/o1/k$d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, p4}, Lax/o1/k$d;->x(Lax/f1/Q;)Lax/o1/k$d;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p8, p9}, Lax/o1/k$d;->r(J)Lax/o1/k$d;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p5}, Lax/o1/k$d;->t(Z)Lax/o1/k$d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, p6}, Lax/o1/k$d;->u(Landroid/os/Handler;)Lax/o1/k$d;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, p7}, Lax/o1/k$d;->v(Lax/o1/P;)Lax/o1/k$d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/16 p2, 0x32

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lax/o1/k$d;->w(I)Lax/o1/k$d;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-boolean p2, p0, Lax/Y0/d;->j:Z

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lax/o1/k$d;->q(Z)Lax/o1/k$d;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-wide p2, p0, Lax/Y0/d;->k:J

    .line 59
    .line 60
    invoke-virtual {p1, p2, p3}, Lax/o1/k$d;->p(J)Lax/o1/k$d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 p3, 0x22

    .line 67
    .line 68
    if-lt p2, p3, :cond_4b

    .line 69
    .line 70
    iget-boolean p2, p0, Lax/Y0/d;->l:Z

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lax/o1/k$d;->o(Z)Lax/o1/k$d;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_4b
    invoke-virtual {p1}, Lax/o1/k$d;->n()Lax/o1/k;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_50
    const/4 p1, 0x0

    .line 82
    return-object p1
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
.end method

.method protected k(Landroid/content/Context;Lax/k1/h;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/k1/h;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lax/k1/i;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lax/k1/i;-><init>(Lax/k1/h;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
.end method

.method protected l(Landroid/content/Context;ILax/f1/Q;ZLandroid/os/Handler;Lax/o1/P;JLjava/util/ArrayList;)V
    .registers 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lax/f1/Q;",
            "Z",
            "Landroid/os/Handler;",
            "Lax/o1/P;",
            "J",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/M0;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v4, p9

    .line 10
    .line 11
    const-string v10, "DefaultRenderersFactory"

    .line 12
    .line 13
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v12, Lax/o1/P;

    .line 16
    .line 17
    const-class v13, Landroid/os/Handler;

    .line 18
    .line 19
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    new-instance v15, Lax/o1/k$d;

    .line 22
    .line 23
    move-object/from16 v5, p1

    .line 24
    .line 25
    const/16 v16, 0x3

    .line 26
    .line 27
    invoke-direct {v15, v5}, Lax/o1/k$d;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lax/Y0/d;->m()Lax/f1/x$b;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v15, v5}, Lax/o1/k$d;->s(Lax/f1/x$b;)Lax/o1/k$d;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move-object/from16 v15, p3

    .line 39
    .line 40
    invoke-virtual {v5, v15}, Lax/o1/k$d;->x(Lax/f1/Q;)Lax/o1/k$d;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object/from16 v17, v10

    .line 45
    .line 46
    const/4 v15, 0x1

    .line 47
    move-wide/from16 v9, p7

    .line 48
    .line 49
    invoke-virtual {v5, v9, v10}, Lax/o1/k$d;->r(J)Lax/o1/k$d;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    move/from16 v6, p4

    .line 54
    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Lax/o1/k$d;->t(Z)Lax/o1/k$d;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5, v2}, Lax/o1/k$d;->u(Landroid/os/Handler;)Lax/o1/k$d;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v5, v3}, Lax/o1/k$d;->v(Lax/o1/P;)Lax/o1/k$d;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/16 v6, 0x32

    .line 70
    .line 71
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v19

    .line 75
    invoke-virtual {v5, v6}, Lax/o1/k$d;->w(I)Lax/o1/k$d;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-boolean v6, v1, Lax/Y0/d;->j:Z

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Lax/o1/k$d;->q(Z)Lax/o1/k$d;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-wide v7, v1, Lax/Y0/d;->k:J

    .line 86
    .line 87
    invoke-virtual {v5, v7, v8}, Lax/o1/k$d;->p(J)Lax/o1/k$d;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v8, 0x22

    .line 94
    .line 95
    if-lt v7, v8, :cond_66

    .line 96
    .line 97
    iget-boolean v7, v1, Lax/Y0/d;->l:Z

    .line 98
    .line 99
    invoke-virtual {v5, v7}, Lax/o1/k$d;->o(Z)Lax/o1/k$d;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    :cond_66
    invoke-virtual {v5}, Lax/o1/k$d;->n()Lax/o1/k;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    if-nez v0, :cond_71

    .line 111
    .line 112
    goto/16 :goto_153

    .line 113
    .line 114
    :cond_71
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    const/4 v7, 0x2

    .line 119
    if-ne v0, v7, :cond_7a

    .line 120
    .line 121
    add-int/lit8 v5, v5, -0x1

    .line 122
    .line 123
    :cond_7a
    :try_start_7a
    const-string v0, "androidx.media3.decoder.vp9.LibvpxVideoRenderer"

    .line 124
    .line 125
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/4 v6, 0x4

    .line 130
    new-array v7, v6, [Ljava/lang/Class;

    .line 131
    .line 132
    aput-object v14, v7, v18

    .line 133
    .line 134
    aput-object v13, v7, v15

    .line 135
    .line 136
    const/16 v20, 0x2

    .line 137
    .line 138
    aput-object v12, v7, v20

    .line 139
    .line 140
    aput-object v11, v7, v16

    .line 141
    .line 142
    invoke-virtual {v0, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    const/4 v6, 0x4

    .line 151
    new-array v8, v6, [Ljava/lang/Object;

    .line 152
    .line 153
    aput-object v7, v8, v18

    .line 154
    .line 155
    aput-object v2, v8, v15

    .line 156
    .line 157
    const/16 v20, 0x2

    .line 158
    .line 159
    aput-object v3, v8, v20

    .line 160
    .line 161
    aput-object v19, v8, v16

    .line 162
    .line 163
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_a8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7a .. :try_end_a8} :catch_bc
    .catch Ljava/lang/Exception; {:try_start_7a .. :try_end_a8} :catch_b5

    .line 168
    .line 169
    add-int/lit8 v7, v5, 0x1

    .line 170
    .line 171
    :try_start_aa
    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    const-string v0, "Loaded LibvpxVideoRenderer."
    :try_end_af
    .catch Ljava/lang/ClassNotFoundException; {:try_start_aa .. :try_end_af} :catch_b9
    .catch Ljava/lang/Exception; {:try_start_aa .. :try_end_af} :catch_b5

    .line 175
    .line 176
    move-object/from16 v8, v17

    .line 177
    .line 178
    :try_start_b1
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b1 .. :try_end_b4} :catch_b7
    .catch Ljava/lang/Exception; {:try_start_b1 .. :try_end_b4} :catch_b5

    .line 179
    .line 180
    .line 181
    goto :goto_c8

    .line 182
    :catch_b5
    move-exception v0

    .line 183
    goto :goto_bf

    .line 184
    :catch_b7
    :goto_b7
    move v5, v7

    .line 185
    goto :goto_c7

    .line 186
    :catch_b9
    move-object/from16 v8, v17

    .line 187
    .line 188
    goto :goto_b7

    .line 189
    :catch_bc
    move-object/from16 v8, v17

    .line 190
    .line 191
    goto :goto_c7

    .line 192
    :goto_bf
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 193
    .line 194
    const-string v3, "Error instantiating VP9 extension"

    .line 195
    .line 196
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    throw v2

    .line 200
    :goto_c7
    move v7, v5

    .line 201
    :goto_c8
    :try_start_c8
    const-string v0, "androidx.media3.decoder.av1.Libgav1VideoRenderer"

    .line 202
    .line 203
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const/4 v6, 0x4

    .line 208
    new-array v5, v6, [Ljava/lang/Class;

    .line 209
    .line 210
    aput-object v14, v5, v18

    .line 211
    .line 212
    aput-object v13, v5, v15

    .line 213
    .line 214
    const/16 v20, 0x2

    .line 215
    .line 216
    aput-object v12, v5, v20

    .line 217
    .line 218
    aput-object v11, v5, v16

    .line 219
    .line 220
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v5
    :try_end_e3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c8 .. :try_end_e3} :catch_107
    .catch Ljava/lang/Exception; {:try_start_c8 .. :try_end_e3} :catch_103

    .line 228
    const/16 p1, 0x1

    .line 229
    .line 230
    const/4 v6, 0x4

    .line 231
    :try_start_e6
    new-array v15, v6, [Ljava/lang/Object;

    .line 232
    .line 233
    aput-object v5, v15, v18

    .line 234
    .line 235
    aput-object v2, v15, p1

    .line 236
    .line 237
    const/16 v20, 0x2

    .line 238
    .line 239
    aput-object v3, v15, v20

    .line 240
    .line 241
    aput-object v19, v15, v16

    .line 242
    .line 243
    invoke-virtual {v0, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Landroidx/media3/exoplayer/M0;
    :try_end_f8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e6 .. :try_end_f8} :catch_112
    .catch Ljava/lang/Exception; {:try_start_e6 .. :try_end_f8} :catch_103

    .line 248
    .line 249
    add-int/lit8 v5, v7, 0x1

    .line 250
    .line 251
    :try_start_fa
    invoke-virtual {v4, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "Loaded Libgav1VideoRenderer."

    .line 255
    .line 256
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_102
    .catch Ljava/lang/ClassNotFoundException; {:try_start_fa .. :try_end_102} :catch_105
    .catch Ljava/lang/Exception; {:try_start_fa .. :try_end_102} :catch_103

    .line 257
    .line 258
    .line 259
    goto :goto_113

    .line 260
    :catch_103
    move-exception v0

    .line 261
    goto :goto_10a

    .line 262
    :catch_105
    move v7, v5

    .line 263
    goto :goto_112

    .line 264
    :catch_107
    const/16 p1, 0x1

    .line 265
    .line 266
    goto :goto_112

    .line 267
    :goto_10a
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 268
    .line 269
    const-string v3, "Error instantiating AV1 extension"

    .line 270
    .line 271
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    throw v2

    .line 275
    :catch_112
    :goto_112
    move v5, v7

    .line 276
    :goto_113
    :try_start_113
    const-string v0, "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"

    .line 277
    .line 278
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const/4 v6, 0x4

    .line 283
    new-array v7, v6, [Ljava/lang/Class;

    .line 284
    .line 285
    aput-object v14, v7, v18

    .line 286
    .line 287
    aput-object v13, v7, p1

    .line 288
    .line 289
    const/16 v20, 0x2

    .line 290
    .line 291
    aput-object v12, v7, v20

    .line 292
    .line 293
    aput-object v11, v7, v16

    .line 294
    .line 295
    invoke-virtual {v0, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    const/4 v6, 0x4

    .line 304
    new-array v6, v6, [Ljava/lang/Object;

    .line 305
    .line 306
    aput-object v7, v6, v18

    .line 307
    .line 308
    aput-object v2, v6, p1

    .line 309
    .line 310
    const/16 v20, 0x2

    .line 311
    .line 312
    aput-object v3, v6, v20

    .line 313
    .line 314
    aput-object v19, v6, v16

    .line 315
    .line 316
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, Landroidx/media3/exoplayer/M0;

    .line 321
    .line 322
    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    const-string v0, "Loaded FfmpegVideoRenderer."

    .line 326
    .line 327
    invoke-static {v8, v0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_149
    .catch Ljava/lang/ClassNotFoundException; {:try_start_113 .. :try_end_149} :catch_153
    .catch Ljava/lang/Exception; {:try_start_113 .. :try_end_149} :catch_14a

    .line 328
    .line 329
    .line 330
    goto :goto_153

    .line 331
    :catch_14a
    move-exception v0

    .line 332
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    const-string v3, "Error instantiating FFmpeg extension"

    .line 335
    .line 336
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    throw v2

    .line 340
    :catch_153
    :goto_153
    return-void
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
.end method

.method protected m()Lax/f1/x$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/d;->b:Lax/f1/o;

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

.method protected n(Landroid/content/Context;)Lax/e1/b$a;
    .registers 3

    .line 1
    new-instance v0, Lax/e1/a$c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/e1/a$c;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
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
    .line 22
.end method

.method public final o(Z)Lax/Y0/d;
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/Y0/d;->e:Z

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

.method public final p(I)Lax/Y0/d;
    .registers 2

    .line 1
    iput p1, p0, Lax/Y0/d;->c:I

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
