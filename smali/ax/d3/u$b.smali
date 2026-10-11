.class Lax/d3/u$b;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lax/d3/u$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lax/d3/u;


# direct methods
.method constructor <init>(Lax/d3/u;Landroid/content/Context;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p2, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lax/d3/u$b;->a()V

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


# virtual methods
.method a()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v0, v1}, Lax/d3/u;->L2(Lax/d3/u;Landroid/content/Context;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez p2, :cond_21

    .line 13
    .line 14
    const v3, 0x7f0d00aa

    .line 15
    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    invoke-virtual {v1, v3, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, Lax/d3/u$c;

    .line 24
    .line 25
    iget-object v5, v0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 26
    .line 27
    invoke-direct {v4, v5, v3}, Lax/d3/u$c;-><init>(Lax/d3/u;Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2a

    .line 34
    :cond_21
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    move-object v4, v3

    .line 39
    check-cast v4, Lax/d3/u$c;

    .line 40
    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    :goto_2a
    invoke-interface/range {p0 .. p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lax/d3/u$d;

    .line 48
    .line 49
    iget-object v6, v5, Lax/d3/u$d;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v7, v4, Lax/d3/u$c;->a:Landroid/widget/TextView;

    .line 52
    .line 53
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget-object v6, v5, Lax/d3/u$d;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-string v7, ""

    .line 63
    .line 64
    if-nez v6, :cond_5a

    .line 65
    .line 66
    iget-object v6, v4, Lax/d3/u$c;->b:Landroid/widget/TextView;

    .line 67
    .line 68
    new-instance v8, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v9, "."

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v9, v5, Lax/d3/u$d;->b:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    goto :goto_5f

    .line 91
    :cond_5a
    iget-object v6, v4, Lax/d3/u$c;->b:Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :goto_5f
    iget-object v6, v4, Lax/d3/u$c;->c:Landroid/widget/LinearLayout;

    .line 97
    .line 98
    invoke-virtual {v6}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 99
    .line 100
    .line 101
    iget-object v6, v5, Lax/d3/u$d;->c:Ljava/util/Set;

    .line 102
    .line 103
    invoke-interface {v6}, Ljava/util/Set;->size()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_94

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v2, "no component default mimetype : "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v2, v5, Lax/d3/u$d;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Landroid/os/Handler;

    .line 132
    .line 133
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lax/d3/u$b$a;

    .line 141
    .line 142
    invoke-direct {v2, v0, v5}, Lax/d3/u$b$a;-><init>(Lax/d3/u$b;Lax/d3/u$d;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 146
    .line 147
    .line 148
    return-object v3

    .line 149
    :cond_94
    iget-object v6, v5, Lax/d3/u$d;->c:Ljava/util/Set;

    .line 150
    .line 151
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    :goto_9a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_140

    .line 160
    .line 161
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Landroid/content/ComponentName;

    .line 166
    .line 167
    :try_start_a6
    iget-object v9, v4, Lax/d3/u$c;->c:Landroid/widget/LinearLayout;

    .line 168
    .line 169
    const v10, 0x7f0d00ab

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v10, v9, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    const v10, 0x7f0a024f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    check-cast v10, Landroid/widget/ImageView;

    .line 184
    .line 185
    const v11, 0x7f0a0065

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    check-cast v11, Landroid/widget/TextView;

    .line 193
    .line 194
    const v12, 0x7f0a0049

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    check-cast v12, Landroid/widget/TextView;

    .line 202
    .line 203
    iget-object v13, v0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 204
    .line 205
    iget-object v13, v13, Lax/d3/u;->f0:Landroid/content/pm/PackageManager;

    .line 206
    .line 207
    invoke-virtual {v13, v8, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    iget-object v14, v13, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 212
    .line 213
    if-eqz v14, :cond_df

    .line 214
    .line 215
    iget-object v15, v0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 216
    .line 217
    iget-object v15, v15, Lax/d3/u;->f0:Landroid/content/pm/PackageManager;

    .line 218
    .line 219
    invoke-virtual {v14, v15}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    goto :goto_e0

    .line 224
    :cond_df
    const/4 v14, 0x0

    .line 225
    :goto_e0
    iget-object v15, v0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 226
    .line 227
    iget-object v15, v15, Lax/d3/u;->f0:Landroid/content/pm/PackageManager;

    .line 228
    .line 229
    invoke-virtual {v13, v15}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v15
    :try_end_e8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a6 .. :try_end_e8} :catch_12d

    .line 233
    :try_start_e8
    iget-object v2, v0, Lax/d3/u$b;->a:Lax/d3/u;

    .line 234
    .line 235
    iget-object v2, v2, Lax/d3/u;->f0:Landroid/content/pm/PackageManager;

    .line 236
    .line 237
    invoke-virtual {v13, v2}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-nez v2, :cond_106

    .line 252
    .line 253
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_ff
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_e8 .. :try_end_ff} :catch_104

    .line 254
    .line 255
    .line 256
    const/4 v2, 0x0

    .line 257
    :try_start_100
    invoke-virtual {v11, v2}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    goto :goto_10f

    .line 261
    :catch_104
    const/4 v2, 0x0

    .line 262
    goto :goto_12d

    .line 263
    :cond_106
    const/4 v2, 0x0

    .line 264
    invoke-virtual {v11, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    const/16 v10, 0x8

    .line 268
    .line 269
    invoke-virtual {v11, v10}, Landroid/view/View;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    :goto_10f
    const v10, 0x7f0a00f7

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    new-instance v11, Lax/d3/u$b$b;

    .line 280
    .line 281
    invoke-direct {v11, v0, v5, v8}, Lax/d3/u$b$b;-><init>(Lax/d3/u$b;Lax/d3/u$d;Landroid/content/ComponentName;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    new-instance v10, Lax/d3/u$b$c;

    .line 288
    .line 289
    invoke-direct {v10, v0, v8}, Lax/d3/u$b$c;-><init>(Lax/d3/u$b;Landroid/content/ComponentName;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 293
    .line 294
    .line 295
    iget-object v10, v4, Lax/d3/u$c;->c:Landroid/widget/LinearLayout;

    .line 296
    .line 297
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_12b
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_100 .. :try_end_12b} :catch_12d

    .line 298
    .line 299
    .line 300
    goto/16 :goto_9a

    .line 301
    .line 302
    :catch_12d
    :goto_12d
    new-instance v9, Landroid/os/Handler;

    .line 303
    .line 304
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    invoke-direct {v9, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 309
    .line 310
    .line 311
    new-instance v10, Lax/d3/u$b$d;

    .line 312
    .line 313
    invoke-direct {v10, v0, v5, v8}, Lax/d3/u$b$d;-><init>(Lax/d3/u$b;Lax/d3/u$d;Landroid/content/ComponentName;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v9, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 317
    .line 318
    .line 319
    goto/16 :goto_9a

    .line 320
    .line 321
    :cond_140
    return-object v3
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
