.class public Lcom/android/ex/photo/PhotoViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/ex/photo/PhotoViewPager$c;,
        Lcom/android/ex/photo/PhotoViewPager$b;
    }
.end annotation


# instance fields
.field private l0:F

.field private m0:I

.field private n0:F

.field private o0:F

.field private p0:Lcom/android/ex/photo/PhotoViewPager$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/android/ex/photo/PhotoViewPager;->U()V

    .line 5
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

.method private U()V
    .registers 3

    .line 1
    new-instance v0, Lcom/android/ex/photo/PhotoViewPager$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/ex/photo/PhotoViewPager$a;-><init>(Lcom/android/ex/photo/PhotoViewPager;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v1, v0}, Landroidx/viewpager/widget/ViewPager;->Q(ZLandroidx/viewpager/widget/ViewPager$k;)V

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
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/PhotoViewPager;->p0:Lcom/android/ex/photo/PhotoViewPager$c;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    iget v1, p0, Lcom/android/ex/photo/PhotoViewPager;->n0:F

    .line 6
    .line 7
    iget v2, p0, Lcom/android/ex/photo/PhotoViewPager;->o0:F

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Lcom/android/ex/photo/PhotoViewPager$c;->b(FF)Lcom/android/ex/photo/PhotoViewPager$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_f

    .line 14
    :cond_d
    sget-object v0, Lcom/android/ex/photo/PhotoViewPager$b;->q:Lcom/android/ex/photo/PhotoViewPager$b;

    .line 15
    .line 16
    :goto_f
    sget-object v1, Lcom/android/ex/photo/PhotoViewPager$b;->e0:Lcom/android/ex/photo/PhotoViewPager$b;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eq v0, v1, :cond_1c

    .line 21
    .line 22
    sget-object v4, Lcom/android/ex/photo/PhotoViewPager$b;->c0:Lcom/android/ex/photo/PhotoViewPager$b;

    .line 23
    .line 24
    if-ne v0, v4, :cond_1a

    .line 25
    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    const/4 v4, 0x0

    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    :goto_1c
    const/4 v4, 0x1

    .line 30
    :goto_1d
    if-eq v0, v1, :cond_26

    .line 31
    .line 32
    sget-object v1, Lcom/android/ex/photo/PhotoViewPager$b;->d0:Lcom/android/ex/photo/PhotoViewPager$b;

    .line 33
    .line 34
    if-ne v0, v1, :cond_24

    .line 35
    .line 36
    goto :goto_26

    .line 37
    :cond_24
    const/4 v0, 0x0

    .line 38
    goto :goto_27

    .line 39
    :cond_26
    :goto_26
    const/4 v0, 0x1

    .line 40
    :goto_27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    and-int/lit16 v1, v1, 0xff

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    const/4 v6, -0x1

    .line 48
    if-eq v1, v5, :cond_33

    .line 49
    .line 50
    if-ne v1, v2, :cond_35

    .line 51
    .line 52
    :cond_33
    iput v6, p0, Lcom/android/ex/photo/PhotoViewPager;->m0:I

    .line 53
    .line 54
    :cond_35
    if-eqz v1, :cond_89

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    if-eq v1, v5, :cond_5b

    .line 58
    .line 59
    const/4 v0, 0x6

    .line 60
    if-eq v1, v0, :cond_3e

    .line 61
    .line 62
    goto :goto_a1

    .line 63
    :cond_3e
    invoke-static {p1}, Lax/c0/C;->b(Landroid/view/MotionEvent;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p1, v0}, Lax/c0/C;->c(Landroid/view/MotionEvent;I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget v4, p0, Lcom/android/ex/photo/PhotoViewPager;->m0:I

    .line 72
    .line 73
    if-ne v1, v4, :cond_a1

    .line 74
    .line 75
    if-nez v0, :cond_4d

    .line 76
    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    const/4 v2, 0x0

    .line 79
    :goto_4e
    invoke-static {p1, v2}, Lax/c0/C;->d(Landroid/view/MotionEvent;I)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 84
    .line 85
    invoke-static {p1, v2}, Lax/c0/C;->c(Landroid/view/MotionEvent;I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->m0:I

    .line 90
    .line 91
    goto :goto_a1

    .line 92
    :cond_5b
    if-nez v4, :cond_5f

    .line 93
    .line 94
    if-eqz v0, :cond_a1

    .line 95
    .line 96
    :cond_5f
    iget v1, p0, Lcom/android/ex/photo/PhotoViewPager;->m0:I

    .line 97
    .line 98
    if-ne v1, v6, :cond_64

    .line 99
    .line 100
    goto :goto_a1

    .line 101
    :cond_64
    invoke-static {p1, v1}, Lax/c0/C;->a(Landroid/view/MotionEvent;I)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {p1, v1}, Lax/c0/C;->d(Landroid/view/MotionEvent;I)F

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v4, :cond_73

    .line 110
    .line 111
    if-eqz v0, :cond_73

    .line 112
    .line 113
    iput v1, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 114
    .line 115
    return v3

    .line 116
    :cond_73
    if-eqz v4, :cond_7e

    .line 117
    .line 118
    iget v2, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 119
    .line 120
    cmpl-float v2, v1, v2

    .line 121
    .line 122
    if-lez v2, :cond_7e

    .line 123
    .line 124
    iput v1, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 125
    .line 126
    return v3

    .line 127
    :cond_7e
    if-eqz v0, :cond_a1

    .line 128
    .line 129
    iget v0, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 130
    .line 131
    cmpg-float v0, v1, v0

    .line 132
    .line 133
    if-gez v0, :cond_a1

    .line 134
    .line 135
    iput v1, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 136
    .line 137
    return v3

    .line 138
    :cond_89
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->l0:F

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->n0:F

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->o0:F

    .line 155
    .line 156
    invoke-static {p1, v3}, Lax/c0/C;->c(Landroid/view/MotionEvent;I)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iput v0, p0, Lcom/android/ex/photo/PhotoViewPager;->m0:I

    .line 161
    .line 162
    :cond_a1
    :goto_a1
    :try_start_a1
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 163
    .line 164
    .line 165
    move-result p1
    :try_end_a5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a1 .. :try_end_a5} :catch_a6

    .line 166
    return p1

    .line 167
    :catch_a6
    move-exception p1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    return v3
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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_4} :catch_9
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_4} :catch_7
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_4} :catch_5

    .line 5
    return p1

    .line 6
    :catch_5
    move-exception p1

    .line 7
    goto :goto_a

    .line 8
    :catch_7
    move-exception p1

    .line 9
    goto :goto_a

    .line 10
    :catch_9
    move-exception p1

    .line 11
    :goto_a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setOnInterceptTouchListener(Lcom/android/ex/photo/PhotoViewPager$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/PhotoViewPager;->p0:Lcom/android/ex/photo/PhotoViewPager$c;

    .line 2
    .line 3
    return-void
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
