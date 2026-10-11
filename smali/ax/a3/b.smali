.class public Lax/a3/b;
.super Lax/a3/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a3/b$e;
    }
.end annotation


# instance fields
.field private t0:Landroid/view/View;

.field private u0:Landroid/widget/TextView;

.field private v0:Landroid/content/Context;

.field private w0:Lax/U2/f;

.field private x0:Ljava/lang/String;

.field private y0:Lax/a3/b$e;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/a3/I;-><init>()V

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

.method static synthetic i3(Lax/a3/b;)Lax/a3/b$e;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a3/b;->y0:Lax/a3/b$e;

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

.method private j3(Landroidx/appcompat/app/a;)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1a

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_20

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const v0, 0x7f13013e

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_21

    .line 32
    .line 33
    :cond_20
    return-void

    .line 34
    :cond_21
    iget-object v0, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 35
    .line 36
    const v2, 0x7f0a00b6

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, Lax/a3/b$b;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Lax/a3/b$b;-><init>(Lax/a3/b;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 55
    .line 56
    const v3, 0x7f0a00b3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v3, Lax/a3/b$c;

    .line 64
    .line 65
    invoke-direct {v3, p0}, Lax/a3/b$c;-><init>(Lax/a3/b;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 72
    .line 73
    const v3, 0x7f0a00bb

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-instance v3, Lax/a3/b$d;

    .line 81
    .line 82
    invoke-direct {v3, p0}, Lax/a3/b$d;-><init>(Lax/a3/b;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const v5, 0x3e99999a    # 0.3f

    .line 99
    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    :try_start_65
    iget-object v7, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 103
    .line 104
    invoke-virtual {v7}, Lax/U2/f;->r()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v3, v7}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-eqz v3, :cond_78

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 118
    .line 119
    .line 120
    goto :goto_85

    .line 121
    :cond_78
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v5}, Landroid/view/View;->setAlpha(F)V
    :try_end_7e
    .catch Ljava/lang/Exception; {:try_start_65 .. :try_end_7e} :catch_7f

    .line 125
    .line 126
    .line 127
    goto :goto_85

    .line 128
    :catch_7f
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v5}, Landroid/view/View;->setAlpha(F)V

    .line 132
    .line 133
    .line 134
    :goto_85
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 135
    .line 136
    invoke-virtual {v0}, Lax/U2/f;->B()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_a7

    .line 141
    .line 142
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 143
    .line 144
    invoke-virtual {v0}, Lax/U2/f;->m()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_a0

    .line 153
    .line 154
    invoke-virtual {v2, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    .line 158
    .line 159
    .line 160
    goto :goto_ad

    .line 161
    :cond_a0
    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 165
    .line 166
    .line 167
    goto :goto_ad

    .line 168
    :cond_a7
    invoke-virtual {v2, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    .line 172
    .line 173
    .line 174
    :goto_ad
    iget-object v0, p0, Lax/a3/b;->v0:Landroid/content/Context;

    .line 175
    .line 176
    const/16 v1, 0x20

    .line 177
    .line 178
    invoke-static {v0, v1}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget-object v1, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 183
    .line 184
    invoke-virtual {v1}, Lax/U2/f;->l()Landroid/graphics/drawable/Drawable;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    instance-of v2, v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 189
    .line 190
    if-eqz v2, :cond_dc

    .line 191
    .line 192
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_df

    .line 199
    .line 200
    invoke-static {v1, v0, v0}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a;->m(Landroid/graphics/drawable/Drawable;)V

    .line 218
    .line 219
    .line 220
    goto :goto_df

    .line 221
    :cond_dc
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a;->m(Landroid/graphics/drawable/Drawable;)V

    .line 222
    .line 223
    .line 224
    :cond_df
    :goto_df
    iget-object p1, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 225
    .line 226
    invoke-virtual {p1}, Lax/U2/f;->s()J

    .line 227
    .line 228
    .line 229
    move-result-wide v0

    .line 230
    const-wide/16 v2, 0x0

    .line 231
    .line 232
    cmp-long p1, v0, v2

    .line 233
    .line 234
    if-gez p1, :cond_ee

    .line 235
    .line 236
    const-string p1, "-"

    .line 237
    .line 238
    goto :goto_f6

    .line 239
    :cond_ee
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1, v0, v1}, Lax/c3/B;->i(Landroid/content/Context;J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    :goto_f6
    iget-object v0, p0, Lax/a3/b;->u0:Landroid/widget/TextView;

    .line 248
    .line 249
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 253
    .line 254
    const v0, 0x7f0a01db

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    check-cast p1, Landroid/widget/TextView;

    .line 262
    .line 263
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 264
    .line 265
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Lax/U2/f;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    iget-object p1, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 277
    .line 278
    const v0, 0x7f0a0269

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, Landroid/widget/TextView;

    .line 286
    .line 287
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 288
    .line 289
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Lax/U2/f;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 301
    .line 302
    const v0, 0x7f0a04d0

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    check-cast p1, Landroid/widget/TextView;

    .line 310
    .line 311
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 312
    .line 313
    invoke-virtual {v0}, Lax/U2/f;->x()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 321
    .line 322
    const v0, 0x7f0a0067

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    check-cast p1, Landroid/widget/TextView;

    .line 330
    .line 331
    iget-object v0, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 332
    .line 333
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
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
.end method

.method public static k3(Lax/U2/f;Lax/a3/b$e;)Lax/a3/b;
    .registers 3

    .line 1
    new-instance v0, Lax/a3/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lax/a3/b;->m3(Lax/a3/b$e;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lax/a3/b;->l3(Lax/U2/f;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
.method public J1()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e;->J1()V

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

.method public f3()V
    .registers 1

    .line 1
    invoke-super {p0}, Lax/a3/I;->f3()V

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

.method public g3()Landroid/app/Dialog;
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lax/a3/b;->v0:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x7f0d0059

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 28
    .line 29
    const v1, 0x7f0a01fe

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/TextView;

    .line 37
    .line 38
    iput-object v0, p0, Lax/a3/b;->u0:Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lax/u3/h;->b(Landroid/content/Context;)Landroidx/appcompat/app/a$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lax/a3/b;->t0:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->setView(Landroid/view/View;)Landroidx/appcompat/app/a$a;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Lax/a3/b;->x0:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/a$a;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Lax/a3/b$a;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Lax/a3/b$a;-><init>(Lax/a3/b;)V

    .line 63
    .line 64
    .line 65
    const v3, 0x104000a

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, Landroidx/appcompat/app/a$a;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/a$a;->b(Z)Landroidx/appcompat/app/a$a;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->create()Landroidx/appcompat/app/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 81
    .line 82
    .line 83
    const v1, 0x7f0802f0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->l(I)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, v0}, Lax/a3/b;->j3(Landroidx/appcompat/app/a;)V

    .line 90
    .line 91
    .line 92
    return-object v0
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
.end method

.method public l3(Lax/U2/f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/b;->w0:Lax/U2/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/U2/f;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lax/a3/b;->x0:Ljava/lang/String;

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
.end method

.method public m3(Lax/a3/b$e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/b;->y0:Lax/a3/b$e;

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
