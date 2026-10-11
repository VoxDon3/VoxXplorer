.class Lax/d3/j0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$MultiChoiceModeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/j0;


# direct methods
.method constructor <init>(Lax/d3/j0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .registers 6

    .line 1
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/n;->K3()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return v0

    .line 11
    :cond_a
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lax/d3/j0;->f5(Lax/d3/j0;Z)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v1, 0x1

    .line 22
    packed-switch p2, :pswitch_data_8e

    .line 23
    .line 24
    .line 25
    return v0

    .line 26
    :pswitch_19
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 27
    .line 28
    invoke-static {p1}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 33
    .line 34
    invoke-static {p2}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lax/d3/n$r;->e(Landroid/widget/AbsListView;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/d3/n;->I3()V

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :pswitch_2e
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 52
    .line 53
    invoke-static {p2}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p2}, Landroid/widget/Adapter;->getCount()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const-string v0, "loc"

    .line 62
    .line 63
    const-string v2, "menu_folder"

    .line 64
    .line 65
    if-ne p1, p2, :cond_63

    .line 66
    .line 67
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p2, "deselect"

    .line 72
    .line 73
    invoke-virtual {p1, v2, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 78
    .line 79
    invoke-virtual {p2}, Lax/d3/j0;->z3()Lax/Q2/f;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1, v0, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 95
    .line 96
    invoke-virtual {p1}, Lax/d3/n;->h3()V

    .line 97
    .line 98
    .line 99
    return v1

    .line 100
    :cond_63
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string p2, "select_all"

    .line 105
    .line 106
    invoke-virtual {p1, v2, p2}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 111
    .line 112
    invoke-virtual {p2}, Lax/d3/j0;->z3()Lax/Q2/f;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p1, v0, p2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 128
    .line 129
    invoke-static {p1}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 134
    .line 135
    invoke-static {p2}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p1, p2}, Lax/d3/n$r;->d(Landroid/widget/AbsListView;)V

    .line 140
    .line 141
    .line 142
    return v1

    .line 143
    :pswitch_data_8e
    .packed-switch 0x7f0a02ec
        :pswitch_2e
        :pswitch_19
    .end packed-switch
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

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-static {v0}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    iget-object v0, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 12
    .line 13
    const v1, 0x7f0f0003

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1}, Lax/d3/n;->b3(Landroid/view/ActionMode;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 20
    .line 21
    invoke-static {p1}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lax/d3/n$r;->c()V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 29
    .line 30
    invoke-static {p1}, Lax/d3/j0;->d5(Lax/d3/j0;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 34
    .line 35
    invoke-static {p1}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/widget/a;->u0(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 44
    .line 45
    sget-object v0, Lax/d3/n$o;->c0:Lax/d3/n$o;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lax/d3/j0;->X3(Lax/d3/n$o;)V

    .line 48
    .line 49
    .line 50
    return p2
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

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/d3/n;->v3()Lcom/voxdon/xplorer/activity/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lax/d3/n;->a3()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 16
    .line 17
    sget-object v0, Lax/d3/n$o;->c0:Lax/d3/n$o;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lax/d3/j0;->W3(Lax/d3/n$o;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 23
    .line 24
    invoke-static {p1}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lax/d3/n$r;->c()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 32
    .line 33
    invoke-static {p1}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/widget/a;->u0(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 42
    .line 43
    invoke-static {p1}, Lax/d3/j0;->d5(Lax/d3/j0;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public onItemCheckedStateChanged(Landroid/view/ActionMode;IJZ)V
    .registers 6

    .line 1
    iget-object p3, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-static {p3}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p3, p2, p5}, Lax/d3/n$r;->f(IZ)V

    .line 8
    .line 9
    .line 10
    iget-object p3, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 11
    .line 12
    invoke-static {p3, p2}, Lax/d3/j0;->g5(Lax/d3/j0;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 21
    .line 22
    invoke-static {p3}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3}, Landroid/widget/AbsListView;->getCheckedItemCount()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p3, "/"

    .line 34
    .line 35
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p3, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 39
    .line 40
    invoke-static {p3}, Lax/d3/j0;->w5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/FileListView;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p3}, Landroid/widget/AdapterView;->getCount()I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Landroid/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/j0;->u5(Lax/d3/j0;)Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Landroid/widget/Adapter;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    const p1, 0x7f0a02ed

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_37

    .line 23
    .line 24
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 25
    .line 26
    invoke-virtual {p2}, Lax/d3/n;->o3()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const v1, 0x7f060020

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p1, v1}, Lax/u3/z;->C(Landroid/content/Context;Landroid/view/MenuItem;I)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 37
    .line 38
    invoke-static {p2}, Lax/d3/j0;->a5(Lax/d3/j0;)Lax/d3/n$r;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Lax/d3/n$r;->b()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_34

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 50
    .line 51
    .line 52
    goto :goto_37

    .line 53
    :cond_34
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 54
    .line 55
    .line 56
    :cond_37
    :goto_37
    iget-object p1, p0, Lax/d3/j0$h;->a:Lax/d3/j0;

    .line 57
    .line 58
    invoke-static {p1}, Lax/d3/j0;->e5(Lax/d3/j0;)V

    .line 59
    .line 60
    .line 61
    return v0
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
