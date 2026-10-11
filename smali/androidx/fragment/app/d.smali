.class Landroidx/fragment/app/d;
.super Landroidx/fragment/app/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/d$m;,
        Landroidx/fragment/app/d$k;,
        Landroidx/fragment/app/d$l;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/z;-><init>(Landroid/view/ViewGroup;)V

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

.method private w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
    .registers 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/d$k;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/z$e;",
            ">;Z",
            "Ljava/util/Map<",
            "Landroidx/fragment/app/z$e;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    new-instance v8, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    :goto_13
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const-string v11, " has started."

    .line 25
    .line 26
    const-string v12, "FragmentManager"

    .line 27
    .line 28
    const/4 v13, 0x2

    .line 29
    if-eqz v0, :cond_d8

    .line 30
    .line 31
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroidx/fragment/app/d$k;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/fragment/app/d$l;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_30

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/fragment/app/d$l;->a()V

    .line 44
    .line 45
    .line 46
    :goto_2d
    move-object/from16 v15, p4

    .line 47
    .line 48
    goto :goto_13

    .line 49
    :cond_30
    invoke-virtual {v0, v7}, Landroidx/fragment/app/d$k;->e(Landroid/content/Context;)Landroidx/fragment/app/g$a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-nez v1, :cond_3a

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/fragment/app/d$l;->a()V

    .line 56
    .line 57
    .line 58
    goto :goto_2d

    .line 59
    :cond_3a
    iget-object v14, v1, Landroidx/fragment/app/g$a;->b:Landroid/animation/Animator;

    .line 60
    .line 61
    if-nez v14, :cond_42

    .line 62
    .line 63
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_2d

    .line 67
    :cond_42
    invoke-virtual {v0}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    move-object/from16 v15, p4

    .line 78
    .line 79
    invoke-interface {v15, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v2, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_7b

    .line 88
    .line 89
    invoke-static {v13}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_77

    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "Ignoring Animator set on "

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, " as this Fragment was involved in a Transition."

    .line 109
    .line 110
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v12, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_77
    invoke-virtual {v0}, Landroidx/fragment/app/d$l;->a()V

    .line 121
    .line 122
    .line 123
    goto :goto_13

    .line 124
    :cond_7b
    invoke-virtual {v5}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    sget-object v4, Landroidx/fragment/app/z$e$c;->d0:Landroidx/fragment/app/z$e$c;

    .line 129
    .line 130
    const/16 v16, 0x1

    .line 131
    .line 132
    if-ne v2, v4, :cond_87

    .line 133
    .line 134
    const/4 v4, 0x1

    .line 135
    goto :goto_88

    .line 136
    :cond_87
    const/4 v4, 0x0

    .line 137
    :goto_88
    move-object/from16 v2, p2

    .line 138
    .line 139
    if-eqz v4, :cond_8f

    .line 140
    .line 141
    invoke-interface {v2, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_8f
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 145
    .line 146
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 147
    .line 148
    .line 149
    move-object v6, v0

    .line 150
    new-instance v0, Landroidx/fragment/app/d$c;

    .line 151
    .line 152
    move-object v2, v3

    .line 153
    move-object v3, v1

    .line 154
    move-object/from16 v1, p0

    .line 155
    .line 156
    invoke-direct/range {v0 .. v6}, Landroidx/fragment/app/d$c;-><init>(Landroidx/fragment/app/d;Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/z$e;Landroidx/fragment/app/d$k;)V

    .line 157
    .line 158
    .line 159
    move-object v1, v0

    .line 160
    move-object v0, v3

    .line 161
    move-object v3, v2

    .line 162
    invoke-virtual {v14, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v14, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v14}, Landroid/animation/Animator;->start()V

    .line 169
    .line 170
    .line 171
    invoke-static {v13}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_c7

    .line 176
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v1, "Animator from operation "

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    :cond_c7
    invoke-virtual {v6}, Landroidx/fragment/app/d$l;->c()Lax/Y/d;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v1, Landroidx/fragment/app/d$d;

    .line 205
    .line 206
    move-object/from16 v2, p0

    .line 207
    .line 208
    invoke-direct {v1, v2, v14, v5}, Landroidx/fragment/app/d$d;-><init>(Landroidx/fragment/app/d;Landroid/animation/Animator;Landroidx/fragment/app/z$e;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lax/Y/d;->c(Lax/Y/d$a;)V

    .line 212
    .line 213
    .line 214
    const/4 v6, 0x1

    .line 215
    goto/16 :goto_13

    .line 216
    .line 217
    :cond_d8
    move-object/from16 v2, p0

    .line 218
    .line 219
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    :goto_de
    if-ge v10, v9, :cond_1aa

    .line 224
    .line 225
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    add-int/lit8 v10, v10, 0x1

    .line 230
    .line 231
    move-object v4, v0

    .line 232
    check-cast v4, Landroidx/fragment/app/d$k;

    .line 233
    .line 234
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "Ignoring Animation set on "

    .line 243
    .line 244
    if-eqz p3, :cond_116

    .line 245
    .line 246
    invoke-static {v13}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    if-eqz v5, :cond_112

    .line 251
    .line 252
    new-instance v5, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v0, " as Animations cannot run alongside Transitions."

    .line 264
    .line 265
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    :cond_112
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->a()V

    .line 276
    .line 277
    .line 278
    goto :goto_de

    .line 279
    :cond_116
    if-eqz v6, :cond_139

    .line 280
    .line 281
    invoke-static {v13}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_135

    .line 286
    .line 287
    new-instance v5, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v0, " as Animations cannot run alongside Animators."

    .line 299
    .line 300
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    :cond_135
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->a()V

    .line 311
    .line 312
    .line 313
    goto :goto_de

    .line 314
    :cond_139
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual {v4, v7}, Landroidx/fragment/app/d$k;->e(Landroid/content/Context;)Landroidx/fragment/app/g$a;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-static {v1}, Lax/b0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, Landroidx/fragment/app/g$a;

    .line 325
    .line 326
    iget-object v1, v1, Landroidx/fragment/app/g$a;->a:Landroid/view/animation/Animation;

    .line 327
    .line 328
    invoke-static {v1}, Lax/b0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v1, Landroid/view/animation/Animation;

    .line 333
    .line 334
    invoke-virtual {v5}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 335
    .line 336
    .line 337
    move-result-object v14

    .line 338
    sget-object v15, Landroidx/fragment/app/z$e$c;->q:Landroidx/fragment/app/z$e$c;

    .line 339
    .line 340
    if-eq v14, v15, :cond_15f

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->a()V

    .line 346
    .line 347
    .line 348
    move-object v2, v5

    .line 349
    move-object v5, v4

    .line 350
    move-object v4, v0

    .line 351
    goto :goto_194

    .line 352
    :cond_15f
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    new-instance v14, Landroidx/fragment/app/g$b;

    .line 356
    .line 357
    invoke-direct {v14, v1, v3, v0}, Landroidx/fragment/app/g$b;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    move-object v2, v5

    .line 361
    move-object v5, v4

    .line 362
    move-object v4, v0

    .line 363
    new-instance v0, Landroidx/fragment/app/d$e;

    .line 364
    .line 365
    move-object/from16 v1, p0

    .line 366
    .line 367
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/d$e;-><init>(Landroidx/fragment/app/d;Landroidx/fragment/app/z$e;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/d$k;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v14, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v14}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v13}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_194

    .line 381
    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const-string v1, "Animation from operation "

    .line 388
    .line 389
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    :cond_194
    :goto_194
    invoke-virtual {v5}, Landroidx/fragment/app/d$l;->c()Lax/Y/d;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    new-instance v0, Landroidx/fragment/app/d$f;

    .line 410
    .line 411
    move-object v1, v5

    .line 412
    move-object v5, v2

    .line 413
    move-object v2, v4

    .line 414
    move-object v4, v1

    .line 415
    move-object/from16 v1, p0

    .line 416
    .line 417
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/d$f;-><init>(Landroidx/fragment/app/d;Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/d$k;Landroidx/fragment/app/z$e;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v14, v0}, Lax/Y/d;->c(Lax/Y/d$a;)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v2, p0

    .line 424
    .line 425
    goto/16 :goto_de

    .line 426
    .line 427
    :cond_1aa
    return-void
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
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method private x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/z$e;Landroidx/fragment/app/z$e;)Ljava/util/Map;
    .registers 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/d$m;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/z$e;",
            ">;Z",
            "Landroidx/fragment/app/z$e;",
            "Landroidx/fragment/app/z$e;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/fragment/app/z$e;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    new-instance v6, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v8, 0x0

    .line 15
    :cond_e
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_5e

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/d$m;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/fragment/app/d$l;->d()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_21

    .line 32
    .line 33
    goto :goto_e

    .line 34
    :cond_21
    invoke-virtual {v2}, Landroidx/fragment/app/d$m;->e()Landroidx/fragment/app/w;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v8, :cond_29

    .line 39
    .line 40
    move-object v8, v3

    .line 41
    goto :goto_e

    .line 42
    :cond_29
    if-eqz v3, :cond_e

    .line 43
    .line 44
    if-ne v8, v3, :cond_2e

    .line 45
    .line 46
    goto :goto_e

    .line 47
    :cond_2e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v4, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v4, " returned Transition "

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroidx/fragment/app/d$m;->h()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v2, " which uses a different Transition  type than other Fragments."

    .line 83
    .line 84
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_5e
    if-nez v8, :cond_7d

    .line 96
    .line 97
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_64
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_4b4

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Landroidx/fragment/app/d$m;

    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-interface {v6, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/fragment/app/d$l;->a()V

    .line 123
    .line 124
    .line 125
    goto :goto_64

    .line 126
    :cond_7d
    new-instance v9, Landroid/view/View;

    .line 127
    .line 128
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {v9, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    new-instance v10, Landroid/graphics/Rect;

    .line 140
    .line 141
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 142
    .line 143
    .line 144
    new-instance v11, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v15, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    new-instance v12, Lax/B/a;

    .line 155
    .line 156
    invoke-direct {v12}, Lax/B/a;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v16

    .line 163
    const/4 v0, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    :goto_a6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    const-string v5, "FragmentManager"

    .line 172
    .line 173
    if-eqz v2, :cond_2be

    .line 174
    .line 175
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Landroidx/fragment/app/d$m;

    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/fragment/app/d$m;->i()Z

    .line 182
    .line 183
    .line 184
    move-result v18

    .line 185
    if-eqz v18, :cond_2a6

    .line 186
    .line 187
    if-eqz p4, :cond_2a6

    .line 188
    .line 189
    if-eqz p5, :cond_2a6

    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/fragment/app/d$m;->g()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v8, v0}, Landroidx/fragment/app/w;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v8, v0}, Landroidx/fragment/app/w;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->K0()Ljava/util/ArrayList;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 212
    .line 213
    .line 214
    move-result-object v18

    .line 215
    const/16 v19, 0x2

    .line 216
    .line 217
    invoke-virtual/range {v18 .. v18}, Landroidx/fragment/app/Fragment;->K0()Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 222
    .line 223
    .line 224
    move-result-object v18

    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/fragment/app/Fragment;->L0()Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    move-object/from16 v21, v0

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    :goto_e7
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-ge v7, v0, :cond_108

    .line 237
    .line 238
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    move-object/from16 v22, v13

    .line 247
    .line 248
    const/4 v13, -0x1

    .line 249
    if-eq v0, v13, :cond_103

    .line 250
    .line 251
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    check-cast v13, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v2, v0, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :cond_103
    add-int/lit8 v7, v7, 0x1

    .line 261
    .line 262
    move-object/from16 v13, v22

    .line 263
    .line 264
    goto :goto_e7

    .line 265
    :cond_108
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->L0()Ljava/util/ArrayList;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    if-nez v4, :cond_121

    .line 274
    .line 275
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Lax/P/v;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()Lax/P/v;

    .line 287
    .line 288
    .line 289
    goto :goto_12f

    .line 290
    :cond_121
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()Lax/P/v;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Lax/P/v;

    .line 302
    .line 303
    .line 304
    :goto_12f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    const/4 v3, 0x0

    .line 309
    :goto_134
    if-ge v3, v0, :cond_14e

    .line 310
    .line 311
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v13

    .line 315
    check-cast v13, Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v22

    .line 321
    move/from16 v23, v0

    .line 322
    .line 323
    move-object/from16 v0, v22

    .line 324
    .line 325
    check-cast v0, Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v12, v13, v0}, Lax/B/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    add-int/lit8 v3, v3, 0x1

    .line 331
    .line 332
    move/from16 v0, v23

    .line 333
    .line 334
    goto :goto_134

    .line 335
    :cond_14e
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_1b8

    .line 340
    .line 341
    const-string v0, ">>> entering view names <<<"

    .line 342
    .line 343
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    const/4 v3, 0x0

    .line 351
    :goto_15e
    const-string v13, "Name: "

    .line 352
    .line 353
    if-ge v3, v0, :cond_187

    .line 354
    .line 355
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v19

    .line 359
    add-int/lit8 v3, v3, 0x1

    .line 360
    .line 361
    move/from16 v22, v0

    .line 362
    .line 363
    move-object/from16 v0, v19

    .line 364
    .line 365
    check-cast v0, Ljava/lang/String;

    .line 366
    .line 367
    move/from16 v19, v3

    .line 368
    .line 369
    new-instance v3, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    .line 386
    .line 387
    move/from16 v3, v19

    .line 388
    .line 389
    move/from16 v0, v22

    .line 390
    .line 391
    goto :goto_15e

    .line 392
    :cond_187
    const-string v0, ">>> exiting view names <<<"

    .line 393
    .line 394
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    const/4 v3, 0x0

    .line 402
    :goto_191
    if-ge v3, v0, :cond_1b8

    .line 403
    .line 404
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v19

    .line 408
    add-int/lit8 v3, v3, 0x1

    .line 409
    .line 410
    move/from16 v22, v0

    .line 411
    .line 412
    move-object/from16 v0, v19

    .line 413
    .line 414
    check-cast v0, Ljava/lang/String;

    .line 415
    .line 416
    move/from16 v19, v3

    .line 417
    .line 418
    new-instance v3, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 434
    .line 435
    .line 436
    move/from16 v3, v19

    .line 437
    .line 438
    move/from16 v0, v22

    .line 439
    .line 440
    goto :goto_191

    .line 441
    :cond_1b8
    new-instance v13, Lax/B/a;

    .line 442
    .line 443
    invoke-direct {v13}, Lax/B/a;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 451
    .line 452
    invoke-virtual {v1, v13, v0}, Landroidx/fragment/app/d;->u(Ljava/util/Map;Landroid/view/View;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v13, v2}, Lax/B/a;->o(Ljava/util/Collection;)Z

    .line 456
    .line 457
    .line 458
    invoke-virtual {v13}, Lax/B/a;->keySet()Ljava/util/Set;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v12, v0}, Lax/B/a;->o(Ljava/util/Collection;)Z

    .line 463
    .line 464
    .line 465
    new-instance v5, Lax/B/a;

    .line 466
    .line 467
    invoke-direct {v5}, Lax/B/a;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 475
    .line 476
    invoke-virtual {v1, v5, v0}, Landroidx/fragment/app/d;->u(Ljava/util/Map;Landroid/view/View;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v5, v7}, Lax/B/a;->o(Ljava/util/Collection;)Z

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Lax/B/a;->values()Ljava/util/Collection;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v5, v0}, Lax/B/a;->o(Ljava/util/Collection;)Z

    .line 487
    .line 488
    .line 489
    invoke-static {v12, v5}, Landroidx/fragment/app/u;->c(Lax/B/a;Lax/B/a;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Lax/B/a;->keySet()Ljava/util/Set;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v1, v13, v0}, Landroidx/fragment/app/d;->v(Lax/B/a;Ljava/util/Collection;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Lax/B/a;->values()Ljava/util/Collection;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v1, v5, v0}, Landroidx/fragment/app/d;->v(Lax/B/a;Ljava/util/Collection;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Lax/B/k;->isEmpty()Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-eqz v0, :cond_213

    .line 511
    .line 512
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 516
    .line 517
    .line 518
    move-object/from16 v3, p4

    .line 519
    .line 520
    move-object/from16 v2, p5

    .line 521
    .line 522
    move-object v7, v9

    .line 523
    move-object v5, v10

    .line 524
    move-object v9, v11

    .line 525
    move-object/from16 v22, v12

    .line 526
    .line 527
    move-object v10, v15

    .line 528
    const/4 v0, 0x0

    .line 529
    const/4 v4, 0x0

    .line 530
    goto/16 :goto_2b4

    .line 531
    .line 532
    :cond_213
    invoke-virtual/range {p5 .. p5}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual/range {p4 .. p4}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    move-object/from16 v22, v12

    .line 541
    .line 542
    const/4 v12, 0x1

    .line 543
    invoke-static {v0, v3, v4, v13, v12}, Landroidx/fragment/app/u;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLax/B/a;Z)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    move-object v3, v0

    .line 551
    new-instance v0, Landroidx/fragment/app/d$g;

    .line 552
    .line 553
    move-object/from16 v19, v2

    .line 554
    .line 555
    move-object/from16 v12, v21

    .line 556
    .line 557
    move-object/from16 v2, p5

    .line 558
    .line 559
    move-object/from16 v21, v14

    .line 560
    .line 561
    move-object v14, v3

    .line 562
    move-object/from16 v3, p4

    .line 563
    .line 564
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/d$g;-><init>(Landroidx/fragment/app/d;Landroidx/fragment/app/z$e;Landroidx/fragment/app/z$e;ZLax/B/a;)V

    .line 565
    .line 566
    .line 567
    invoke-static {v14, v0}, Lax/c0/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Lax/c0/L;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v13}, Lax/B/a;->values()Ljava/util/Collection;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-nez v0, :cond_25c

    .line 582
    .line 583
    move-object/from16 v4, v19

    .line 584
    .line 585
    const/4 v0, 0x0

    .line 586
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    check-cast v4, Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v13, v4}, Lax/B/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    move-object v14, v4

    .line 597
    check-cast v14, Landroid/view/View;

    .line 598
    .line 599
    invoke-virtual {v8, v12, v14}, Landroidx/fragment/app/w;->p(Ljava/lang/Object;Landroid/view/View;)V

    .line 600
    .line 601
    .line 602
    move-object/from16 v21, v14

    .line 603
    .line 604
    goto :goto_25d

    .line 605
    :cond_25c
    const/4 v0, 0x0

    .line 606
    :goto_25d
    invoke-virtual {v5}, Lax/B/a;->values()Ljava/util/Collection;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 611
    .line 612
    .line 613
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-nez v4, :cond_286

    .line 618
    .line 619
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    check-cast v4, Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {v5, v4}, Lax/B/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    check-cast v4, Landroid/view/View;

    .line 630
    .line 631
    if-eqz v4, :cond_286

    .line 632
    .line 633
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    new-instance v7, Landroidx/fragment/app/d$h;

    .line 638
    .line 639
    invoke-direct {v7, v1, v8, v4, v10}, Landroidx/fragment/app/d$h;-><init>(Landroidx/fragment/app/d;Landroidx/fragment/app/w;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 640
    .line 641
    .line 642
    invoke-static {v5, v7}, Lax/c0/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Lax/c0/L;

    .line 643
    .line 644
    .line 645
    const/16 v17, 0x1

    .line 646
    .line 647
    :cond_286
    invoke-virtual {v8, v12, v9, v11}, Landroidx/fragment/app/w;->s(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 648
    .line 649
    .line 650
    move-object v4, v9

    .line 651
    move-object v9, v12

    .line 652
    const/4 v12, 0x0

    .line 653
    const/4 v13, 0x0

    .line 654
    move-object v5, v10

    .line 655
    const/4 v10, 0x0

    .line 656
    move-object v7, v11

    .line 657
    const/4 v11, 0x0

    .line 658
    move-object v14, v9

    .line 659
    move-object v0, v7

    .line 660
    move-object v7, v4

    .line 661
    const/4 v4, 0x0

    .line 662
    invoke-virtual/range {v8 .. v15}, Landroidx/fragment/app/w;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 663
    .line 664
    .line 665
    move-object v10, v15

    .line 666
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 667
    .line 668
    invoke-interface {v6, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    invoke-interface {v6, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-object v9, v0

    .line 675
    move-object v0, v14

    .line 676
    :goto_2a3
    move-object/from16 v14, v21

    .line 677
    .line 678
    goto :goto_2b4

    .line 679
    :cond_2a6
    move-object/from16 v3, p4

    .line 680
    .line 681
    move-object/from16 v2, p5

    .line 682
    .line 683
    move-object v7, v9

    .line 684
    move-object v5, v10

    .line 685
    move-object v9, v11

    .line 686
    move-object/from16 v22, v12

    .line 687
    .line 688
    move-object/from16 v21, v14

    .line 689
    .line 690
    move-object v10, v15

    .line 691
    const/4 v4, 0x0

    .line 692
    goto :goto_2a3

    .line 693
    :goto_2b4
    move/from16 v4, p3

    .line 694
    .line 695
    move-object v11, v9

    .line 696
    move-object v15, v10

    .line 697
    move-object/from16 v12, v22

    .line 698
    .line 699
    move-object v10, v5

    .line 700
    move-object v9, v7

    .line 701
    goto/16 :goto_a6

    .line 702
    .line 703
    :cond_2be
    move-object/from16 v3, p4

    .line 704
    .line 705
    move-object/from16 v2, p5

    .line 706
    .line 707
    move-object v7, v9

    .line 708
    move-object v9, v11

    .line 709
    move-object/from16 v22, v12

    .line 710
    .line 711
    move-object/from16 v21, v14

    .line 712
    .line 713
    const/4 v4, 0x0

    .line 714
    const/16 v19, 0x2

    .line 715
    .line 716
    move-object v11, v10

    .line 717
    move-object v10, v15

    .line 718
    new-instance v12, Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 721
    .line 722
    .line 723
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 724
    .line 725
    .line 726
    move-result-object v16

    .line 727
    const/4 v13, 0x0

    .line 728
    const/4 v14, 0x0

    .line 729
    :goto_2d8
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 730
    .line 731
    .line 732
    move-result v15

    .line 733
    if-eqz v15, :cond_40e

    .line 734
    .line 735
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v15

    .line 739
    move-object/from16 v20, v15

    .line 740
    .line 741
    check-cast v20, Landroidx/fragment/app/d$m;

    .line 742
    .line 743
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$l;->d()Z

    .line 744
    .line 745
    .line 746
    move-result v15

    .line 747
    if-eqz v15, :cond_2fa

    .line 748
    .line 749
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 750
    .line 751
    .line 752
    move-result-object v15

    .line 753
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 754
    .line 755
    invoke-interface {v6, v15, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$l;->a()V

    .line 759
    .line 760
    .line 761
    :goto_2f8
    const/4 v4, 0x0

    .line 762
    goto :goto_2d8

    .line 763
    :cond_2fa
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$m;->h()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    invoke-virtual {v8, v4}, Landroidx/fragment/app/w;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 772
    .line 773
    .line 774
    move-result-object v15

    .line 775
    if-eqz v0, :cond_30f

    .line 776
    .line 777
    if-eq v15, v3, :cond_30c

    .line 778
    .line 779
    if-ne v15, v2, :cond_30f

    .line 780
    .line 781
    :cond_30c
    const/16 v24, 0x1

    .line 782
    .line 783
    goto :goto_311

    .line 784
    :cond_30f
    const/16 v24, 0x0

    .line 785
    .line 786
    :goto_311
    if-nez v4, :cond_330

    .line 787
    .line 788
    if-nez v24, :cond_31d

    .line 789
    .line 790
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 791
    .line 792
    invoke-interface {v6, v15, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$l;->a()V

    .line 796
    .line 797
    .line 798
    :cond_31d
    move-object/from16 v24, v5

    .line 799
    .line 800
    move-object/from16 v18, v7

    .line 801
    .line 802
    move-object/from16 p3, v9

    .line 803
    .line 804
    move-object/from16 v28, v10

    .line 805
    .line 806
    move-object v4, v11

    .line 807
    move-object v5, v12

    .line 808
    move-object/from16 v7, v21

    .line 809
    .line 810
    const/4 v11, 0x0

    .line 811
    const/16 v21, 0x1

    .line 812
    .line 813
    move-object/from16 v10, p2

    .line 814
    .line 815
    goto/16 :goto_3fc

    .line 816
    .line 817
    :cond_330
    move-object/from16 v25, v11

    .line 818
    .line 819
    new-instance v11, Ljava/util/ArrayList;

    .line 820
    .line 821
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 822
    .line 823
    .line 824
    move-object/from16 p3, v12

    .line 825
    .line 826
    invoke-virtual {v15}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 827
    .line 828
    .line 829
    move-result-object v12

    .line 830
    iget-object v12, v12, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 831
    .line 832
    invoke-virtual {v1, v11, v12}, Landroidx/fragment/app/d;->t(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 833
    .line 834
    .line 835
    if-eqz v24, :cond_34d

    .line 836
    .line 837
    if-ne v15, v3, :cond_34a

    .line 838
    .line 839
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 840
    .line 841
    .line 842
    goto :goto_34d

    .line 843
    :cond_34a
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 844
    .line 845
    .line 846
    :cond_34d
    :goto_34d
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 847
    .line 848
    .line 849
    move-result v12

    .line 850
    if-eqz v12, :cond_36e

    .line 851
    .line 852
    invoke-virtual {v8, v4, v7}, Landroidx/fragment/app/w;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 853
    .line 854
    .line 855
    move-object/from16 v24, v5

    .line 856
    .line 857
    move-object/from16 v18, v7

    .line 858
    .line 859
    move-object/from16 v28, v10

    .line 860
    .line 861
    move-object v2, v13

    .line 862
    move-object v3, v14

    .line 863
    move-object v12, v15

    .line 864
    move-object/from16 v7, v21

    .line 865
    .line 866
    const/16 v21, 0x1

    .line 867
    .line 868
    move-object/from16 v10, p2

    .line 869
    .line 870
    move-object/from16 v5, p3

    .line 871
    .line 872
    move-object/from16 p3, v9

    .line 873
    .line 874
    move-object v9, v4

    .line 875
    move-object/from16 v4, v25

    .line 876
    .line 877
    goto/16 :goto_3cf

    .line 878
    .line 879
    :cond_36e
    invoke-virtual {v8, v4, v11}, Landroidx/fragment/app/w;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 880
    .line 881
    .line 882
    move-object v12, v14

    .line 883
    const/4 v14, 0x0

    .line 884
    move-object/from16 v24, v15

    .line 885
    .line 886
    const/4 v15, 0x0

    .line 887
    move-object/from16 v26, v12

    .line 888
    .line 889
    const/4 v12, 0x0

    .line 890
    move-object/from16 v27, v13

    .line 891
    .line 892
    const/4 v13, 0x0

    .line 893
    move-object/from16 v28, v10

    .line 894
    .line 895
    move-object v10, v4

    .line 896
    move-object v2, v5

    .line 897
    move-object/from16 v5, p3

    .line 898
    .line 899
    move-object/from16 p3, v9

    .line 900
    .line 901
    move-object v9, v4

    .line 902
    move-object/from16 v4, v25

    .line 903
    .line 904
    move-object/from16 v25, v24

    .line 905
    .line 906
    move-object/from16 v24, v2

    .line 907
    .line 908
    move-object/from16 v18, v7

    .line 909
    .line 910
    move-object/from16 v7, v21

    .line 911
    .line 912
    move-object/from16 v3, v26

    .line 913
    .line 914
    move-object/from16 v2, v27

    .line 915
    .line 916
    const/16 v21, 0x1

    .line 917
    .line 918
    invoke-virtual/range {v8 .. v15}, Landroidx/fragment/app/w;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v25 .. v25}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 922
    .line 923
    .line 924
    move-result-object v10

    .line 925
    sget-object v12, Landroidx/fragment/app/z$e$c;->d0:Landroidx/fragment/app/z$e$c;

    .line 926
    .line 927
    if-ne v10, v12, :cond_3cb

    .line 928
    .line 929
    move-object/from16 v10, p2

    .line 930
    .line 931
    move-object/from16 v12, v25

    .line 932
    .line 933
    invoke-interface {v10, v12}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    new-instance v13, Ljava/util/ArrayList;

    .line 937
    .line 938
    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 942
    .line 943
    .line 944
    move-result-object v14

    .line 945
    iget-object v14, v14, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 946
    .line 947
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    invoke-virtual {v12}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 951
    .line 952
    .line 953
    move-result-object v14

    .line 954
    iget-object v14, v14, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 955
    .line 956
    invoke-virtual {v8, v9, v14, v13}, Landroidx/fragment/app/w;->m(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 960
    .line 961
    .line 962
    move-result-object v13

    .line 963
    new-instance v14, Landroidx/fragment/app/d$i;

    .line 964
    .line 965
    invoke-direct {v14, v1, v11}, Landroidx/fragment/app/d$i;-><init>(Landroidx/fragment/app/d;Ljava/util/ArrayList;)V

    .line 966
    .line 967
    .line 968
    invoke-static {v13, v14}, Lax/c0/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Lax/c0/L;

    .line 969
    .line 970
    .line 971
    goto :goto_3cf

    .line 972
    :cond_3cb
    move-object/from16 v10, p2

    .line 973
    .line 974
    move-object/from16 v12, v25

    .line 975
    .line 976
    :goto_3cf
    invoke-virtual {v12}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 977
    .line 978
    .line 979
    move-result-object v13

    .line 980
    sget-object v14, Landroidx/fragment/app/z$e$c;->c0:Landroidx/fragment/app/z$e$c;

    .line 981
    .line 982
    if-ne v13, v14, :cond_3e0

    .line 983
    .line 984
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 985
    .line 986
    .line 987
    if-eqz v17, :cond_3e3

    .line 988
    .line 989
    invoke-virtual {v8, v9, v4}, Landroidx/fragment/app/w;->o(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 990
    .line 991
    .line 992
    goto :goto_3e3

    .line 993
    :cond_3e0
    invoke-virtual {v8, v9, v7}, Landroidx/fragment/app/w;->p(Ljava/lang/Object;Landroid/view/View;)V

    .line 994
    .line 995
    .line 996
    :cond_3e3
    :goto_3e3
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 997
    .line 998
    invoke-interface {v6, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/d$m;->j()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v11

    .line 1005
    if-eqz v11, :cond_3f6

    .line 1006
    .line 1007
    const/4 v11, 0x0

    .line 1008
    invoke-virtual {v8, v2, v9, v11}, Landroidx/fragment/app/w;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    :goto_3f3
    move-object v13, v2

    .line 1013
    move-object v14, v3

    .line 1014
    goto :goto_3fc

    .line 1015
    :cond_3f6
    const/4 v11, 0x0

    .line 1016
    invoke-virtual {v8, v3, v9, v11}, Landroidx/fragment/app/w;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v3

    .line 1020
    goto :goto_3f3

    .line 1021
    :goto_3fc
    move-object/from16 v9, p3

    .line 1022
    .line 1023
    move-object/from16 v3, p4

    .line 1024
    .line 1025
    move-object/from16 v2, p5

    .line 1026
    .line 1027
    move-object v11, v4

    .line 1028
    move-object v12, v5

    .line 1029
    move-object/from16 v21, v7

    .line 1030
    .line 1031
    move-object/from16 v7, v18

    .line 1032
    .line 1033
    move-object/from16 v5, v24

    .line 1034
    .line 1035
    move-object/from16 v10, v28

    .line 1036
    .line 1037
    goto/16 :goto_2f8

    .line 1038
    .line 1039
    :cond_40e
    move-object/from16 v24, v5

    .line 1040
    .line 1041
    move-object/from16 p3, v9

    .line 1042
    .line 1043
    move-object/from16 v28, v10

    .line 1044
    .line 1045
    move-object v5, v12

    .line 1046
    move-object v2, v13

    .line 1047
    move-object v3, v14

    .line 1048
    const/16 v21, 0x1

    .line 1049
    .line 1050
    invoke-virtual {v8, v2, v3, v0}, Landroidx/fragment/app/w;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    if-nez v2, :cond_421

    .line 1055
    .line 1056
    goto/16 :goto_4b4

    .line 1057
    .line 1058
    :cond_421
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    :goto_425
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1063
    .line 1064
    .line 1065
    move-result v4

    .line 1066
    if-eqz v4, :cond_4a8

    .line 1067
    .line 1068
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    check-cast v4, Landroidx/fragment/app/d$m;

    .line 1073
    .line 1074
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->d()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v7

    .line 1078
    if-eqz v7, :cond_438

    .line 1079
    .line 1080
    goto :goto_425

    .line 1081
    :cond_438
    invoke-virtual {v4}, Landroidx/fragment/app/d$m;->h()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v7

    .line 1085
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v9

    .line 1089
    move-object/from16 v10, p4

    .line 1090
    .line 1091
    move-object/from16 v11, p5

    .line 1092
    .line 1093
    if-eqz v0, :cond_44c

    .line 1094
    .line 1095
    if-eq v9, v10, :cond_44a

    .line 1096
    .line 1097
    if-ne v9, v11, :cond_44c

    .line 1098
    .line 1099
    :cond_44a
    const/4 v13, 0x1

    .line 1100
    goto :goto_44d

    .line 1101
    :cond_44c
    const/4 v13, 0x0

    .line 1102
    :goto_44d
    if-nez v7, :cond_455

    .line 1103
    .line 1104
    if-eqz v13, :cond_452

    .line 1105
    .line 1106
    goto :goto_455

    .line 1107
    :cond_452
    move-object/from16 v12, v24

    .line 1108
    .line 1109
    goto :goto_4a4

    .line 1110
    :cond_455
    :goto_455
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v7

    .line 1114
    invoke-static {v7}, Lax/c0/d0;->R(Landroid/view/View;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v7

    .line 1118
    if-nez v7, :cond_48e

    .line 1119
    .line 1120
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v7

    .line 1124
    if-eqz v7, :cond_488

    .line 1125
    .line 1126
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1129
    .line 1130
    .line 1131
    const-string v12, "SpecialEffectsController: Container "

    .line 1132
    .line 1133
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v12

    .line 1140
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    .line 1143
    const-string v12, " has not been laid out. Completing operation "

    .line 1144
    .line 1145
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v7

    .line 1155
    move-object/from16 v12, v24

    .line 1156
    .line 1157
    invoke-static {v12, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1158
    .line 1159
    .line 1160
    goto :goto_48a

    .line 1161
    :cond_488
    move-object/from16 v12, v24

    .line 1162
    .line 1163
    :goto_48a
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->a()V

    .line 1164
    .line 1165
    .line 1166
    goto :goto_4a4

    .line 1167
    :cond_48e
    move-object/from16 v12, v24

    .line 1168
    .line 1169
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/z$e;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v7

    .line 1173
    invoke-virtual {v7}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v7

    .line 1177
    invoke-virtual {v4}, Landroidx/fragment/app/d$l;->c()Lax/Y/d;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v13

    .line 1181
    new-instance v14, Landroidx/fragment/app/d$j;

    .line 1182
    .line 1183
    invoke-direct {v14, v1, v4, v9}, Landroidx/fragment/app/d$j;-><init>(Landroidx/fragment/app/d;Landroidx/fragment/app/d$m;Landroidx/fragment/app/z$e;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v8, v7, v2, v13, v14}, Landroidx/fragment/app/w;->q(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lax/Y/d;Ljava/lang/Runnable;)V

    .line 1187
    .line 1188
    .line 1189
    :goto_4a4
    move-object/from16 v24, v12

    .line 1190
    .line 1191
    goto/16 :goto_425

    .line 1192
    .line 1193
    :cond_4a8
    move-object/from16 v12, v24

    .line 1194
    .line 1195
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    invoke-static {v3}, Lax/c0/d0;->R(Landroid/view/View;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v3

    .line 1203
    if-nez v3, :cond_4b5

    .line 1204
    .line 1205
    :cond_4b4
    :goto_4b4
    return-object v6

    .line 1206
    :cond_4b5
    const/4 v3, 0x4

    .line 1207
    invoke-static {v5, v3}, Landroidx/fragment/app/u;->d(Ljava/util/ArrayList;I)V

    .line 1208
    .line 1209
    .line 1210
    move-object/from16 v10, v28

    .line 1211
    .line 1212
    invoke-virtual {v8, v10}, Landroidx/fragment/app/w;->l(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v3

    .line 1216
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v4

    .line 1220
    if-eqz v4, :cond_534

    .line 1221
    .line 1222
    const-string v4, ">>>>> Beginning transition <<<<<"

    .line 1223
    .line 1224
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1225
    .line 1226
    .line 1227
    const-string v4, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 1228
    .line 1229
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    .line 1233
    .line 1234
    .line 1235
    move-result v4

    .line 1236
    const/4 v13, 0x0

    .line 1237
    :goto_4d4
    const-string v7, " Name: "

    .line 1238
    .line 1239
    const-string v9, "View: "

    .line 1240
    .line 1241
    if-ge v13, v4, :cond_501

    .line 1242
    .line 1243
    move-object/from16 v11, p3

    .line 1244
    .line 1245
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v14

    .line 1249
    add-int/lit8 v13, v13, 0x1

    .line 1250
    .line 1251
    check-cast v14, Landroid/view/View;

    .line 1252
    .line 1253
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v14}, Lax/c0/d0;->I(Landroid/view/View;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v7

    .line 1271
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v7

    .line 1278
    invoke-static {v12, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1279
    .line 1280
    .line 1281
    goto :goto_4d4

    .line 1282
    :cond_501
    move-object/from16 v11, p3

    .line 1283
    .line 1284
    const-string v4, ">>>>> SharedElementLastInViews <<<<<"

    .line 1285
    .line 1286
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1290
    .line 1291
    .line 1292
    move-result v4

    .line 1293
    const/4 v13, 0x0

    .line 1294
    :goto_50d
    if-ge v13, v4, :cond_536

    .line 1295
    .line 1296
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v14

    .line 1300
    add-int/lit8 v13, v13, 0x1

    .line 1301
    .line 1302
    check-cast v14, Landroid/view/View;

    .line 1303
    .line 1304
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1316
    .line 1317
    .line 1318
    invoke-static {v14}, Lax/c0/d0;->I(Landroid/view/View;)Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v14

    .line 1322
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v14

    .line 1329
    invoke-static {v12, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1330
    .line 1331
    .line 1332
    goto :goto_50d

    .line 1333
    :cond_534
    move-object/from16 v11, p3

    .line 1334
    .line 1335
    :cond_536
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v4

    .line 1339
    invoke-virtual {v8, v4, v2}, Landroidx/fragment/app/w;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()Landroid/view/ViewGroup;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v9

    .line 1346
    move-object v12, v11

    .line 1347
    move-object v11, v10

    .line 1348
    move-object v10, v12

    .line 1349
    move-object v12, v3

    .line 1350
    move-object/from16 v13, v22

    .line 1351
    .line 1352
    invoke-virtual/range {v8 .. v13}, Landroidx/fragment/app/w;->r(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 1353
    .line 1354
    .line 1355
    const/4 v4, 0x0

    .line 1356
    invoke-static {v5, v4}, Landroidx/fragment/app/u;->d(Ljava/util/ArrayList;I)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v8, v0, v10, v11}, Landroidx/fragment/app/w;->t(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1360
    .line 1361
    .line 1362
    return-object v6
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

.method private y(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/z$e;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/fragment/app/z$e;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_51

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroidx/fragment/app/z$e;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 38
    .line 39
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 40
    .line 41
    iget v3, v3, Landroidx/fragment/app/Fragment$f;->c:I

    .line 42
    .line 43
    iput v3, v2, Landroidx/fragment/app/Fragment$f;->c:I

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 50
    .line 51
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 52
    .line 53
    iget v3, v3, Landroidx/fragment/app/Fragment$f;->d:I

    .line 54
    .line 55
    iput v3, v2, Landroidx/fragment/app/Fragment$f;->d:I

    .line 56
    .line 57
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 62
    .line 63
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 64
    .line 65
    iget v3, v3, Landroidx/fragment/app/Fragment$f;->e:I

    .line 66
    .line 67
    iput v3, v2, Landroidx/fragment/app/Fragment$f;->e:I

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 74
    .line 75
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->L:Landroidx/fragment/app/Fragment$f;

    .line 76
    .line 77
    iget v2, v2, Landroidx/fragment/app/Fragment$f;->f:I

    .line 78
    .line 79
    iput v2, v1, Landroidx/fragment/app/Fragment$f;->f:I

    .line 80
    .line 81
    goto :goto_14

    .line 82
    :cond_51
    return-void
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


# virtual methods
.method f(Ljava/util/List;Z)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/z$e;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v6, v1

    .line 7
    move-object v7, v6

    .line 8
    :cond_7
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x1

    .line 14
    if-eqz v1, :cond_44

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/fragment/app/z$e;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 27
    .line 28
    invoke-static {v2}, Landroidx/fragment/app/z$e$c;->j(Landroid/view/View;)Landroidx/fragment/app/z$e$c;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Landroidx/fragment/app/d$a;->a:[I

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    aget v3, v3, v4

    .line 43
    .line 44
    if-eq v3, v9, :cond_3c

    .line 45
    .line 46
    if-eq v3, v8, :cond_3c

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    if-eq v3, v4, :cond_3c

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    if-eq v3, v4, :cond_36

    .line 53
    .line 54
    goto :goto_7

    .line 55
    :cond_36
    sget-object v3, Landroidx/fragment/app/z$e$c;->c0:Landroidx/fragment/app/z$e$c;

    .line 56
    .line 57
    if-eq v2, v3, :cond_7

    .line 58
    .line 59
    move-object v7, v1

    .line 60
    goto :goto_7

    .line 61
    :cond_3c
    sget-object v3, Landroidx/fragment/app/z$e$c;->c0:Landroidx/fragment/app/z$e$c;

    .line 62
    .line 63
    if-ne v2, v3, :cond_7

    .line 64
    .line 65
    if-nez v6, :cond_7

    .line 66
    .line 67
    move-object v6, v1

    .line 68
    goto :goto_7

    .line 69
    :cond_44
    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const-string v1, " to "

    .line 74
    .line 75
    const-string v10, "FragmentManager"

    .line 76
    .line 77
    if-eqz v0, :cond_68

    .line 78
    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v2, "Executing operations from "

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v10, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_68
    new-instance v0, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v3, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v4, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, p1}, Landroidx/fragment/app/d;->y(Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_7e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    const/4 v11, 0x0

    .line 132
    if-eqz v2, :cond_bd

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Landroidx/fragment/app/z$e;

    .line 139
    .line 140
    new-instance v5, Lax/Y/d;

    .line 141
    .line 142
    invoke-direct {v5}, Lax/Y/d;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v5}, Landroidx/fragment/app/z$e;->j(Lax/Y/d;)V

    .line 146
    .line 147
    .line 148
    new-instance v12, Landroidx/fragment/app/d$k;

    .line 149
    .line 150
    invoke-direct {v12, v2, v5, p2}, Landroidx/fragment/app/d$k;-><init>(Landroidx/fragment/app/z$e;Lax/Y/d;Z)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    new-instance v5, Lax/Y/d;

    .line 157
    .line 158
    invoke-direct {v5}, Lax/Y/d;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v5}, Landroidx/fragment/app/z$e;->j(Lax/Y/d;)V

    .line 162
    .line 163
    .line 164
    new-instance v12, Landroidx/fragment/app/d$m;

    .line 165
    .line 166
    if-eqz p2, :cond_ab

    .line 167
    .line 168
    if-ne v2, v6, :cond_ae

    .line 169
    .line 170
    :goto_a9
    const/4 v11, 0x1

    .line 171
    goto :goto_ae

    .line 172
    :cond_ab
    if-ne v2, v7, :cond_ae

    .line 173
    .line 174
    goto :goto_a9

    .line 175
    :cond_ae
    :goto_ae
    invoke-direct {v12, v2, v5, p2, v11}, Landroidx/fragment/app/d$m;-><init>(Landroidx/fragment/app/z$e;Lax/Y/d;ZZ)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    new-instance v5, Landroidx/fragment/app/d$b;

    .line 182
    .line 183
    invoke-direct {v5, p0, v4, v2}, Landroidx/fragment/app/d$b;-><init>(Landroidx/fragment/app/d;Ljava/util/List;Landroidx/fragment/app/z$e;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v5}, Landroidx/fragment/app/z$e;->a(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7e

    .line 190
    :cond_bd
    move-object v2, p0

    .line 191
    move v5, p2

    .line 192
    invoke-direct/range {v2 .. v7}, Landroidx/fragment/app/d;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/z$e;Landroidx/fragment/app/z$e;)Ljava/util/Map;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-interface {p1, p2}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    invoke-direct {p0, v0, v4, p2, p1}, Landroidx/fragment/app/d;->w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    :goto_d0
    if-ge v11, p1, :cond_de

    .line 210
    .line 211
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    add-int/lit8 v11, v11, 0x1

    .line 216
    .line 217
    check-cast p2, Landroidx/fragment/app/z$e;

    .line 218
    .line 219
    invoke-virtual {p0, p2}, Landroidx/fragment/app/d;->s(Landroidx/fragment/app/z$e;)V

    .line 220
    .line 221
    .line 222
    goto :goto_d0

    .line 223
    :cond_de
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 224
    .line 225
    .line 226
    invoke-static {v8}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_101

    .line 231
    .line 232
    new-instance p1, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string p2, "Completed executing operations from "

    .line 238
    .line 239
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-static {v10, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    :cond_101
    return-void
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

.method s(Landroidx/fragment/app/z$e;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/z$e;->f()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/z$e;->e()Landroidx/fragment/app/z$e$c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, v0}, Landroidx/fragment/app/z$e$c;->d(Landroid/view/View;)V

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
    .line 22
.end method

.method t(Ljava/util/ArrayList;Landroid/view/View;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2e

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Lax/c0/i0;->b(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_17

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_37

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_1c
    if-ge v1, p2, :cond_37

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2b

    .line 40
    .line 41
    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/d;->t(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_1c

    .line 47
    :cond_2e
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_37

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_37
    return-void
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

.method u(Ljava/util/Map;Landroid/view/View;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/c0/d0;->I(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_9
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_26

    .line 13
    .line 14
    check-cast p2, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_14
    if-ge v1, v0, :cond_26

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_23

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/d;->u(Ljava/util/Map;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_14

    .line 39
    :cond_26
    return-void
    .line 40
    .line 41
.end method

.method v(Lax/B/a;Ljava/util/Collection;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/B/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/B/a;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_8
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_28

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    invoke-static {v0}, Lax/c0/d0;->I(Landroid/view/View;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 38
    .line 39
    .line 40
    goto :goto_8

    .line 41
    :cond_28
    return-void
.end method
