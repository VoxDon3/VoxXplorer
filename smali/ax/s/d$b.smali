.class Lax/s/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/s/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field A:Lax/c0/b;

.field private B:Ljava/lang/CharSequence;

.field private C:Ljava/lang/CharSequence;

.field private D:Landroid/content/res/ColorStateList;

.field private E:Landroid/graphics/PorterDuff$Mode;

.field final synthetic F:Lax/s/d;

.field private a:Landroid/view/Menu;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:Ljava/lang/CharSequence;

.field private l:Ljava/lang/CharSequence;

.field private m:I

.field private n:C

.field private o:I

.field private p:C

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:I

.field private w:I

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lax/s/d;Landroid/view/Menu;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lax/s/d$b;->D:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lax/s/d$b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lax/s/d$b;->a:Landroid/view/Menu;

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/s/d$b;->h()V

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

.method private c(Ljava/lang/String;)C
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method private e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 2
    .line 3
    iget-object v0, v0, Lax/s/d;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_19} :catch_1a

    .line 26
    return-object p1

    .line 27
    :catch_1a
    move-exception p2

    .line 28
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "Cannot instantiate class: "

    .line 34
    .line 35
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p3, "SupportMenuInflater"

    .line 46
    .line 47
    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1
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

.method private i(Landroid/view/MenuItem;)V
    .registers 7

    .line 1
    iget-boolean v0, p0, Lax/s/d$b;->s:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lax/s/d$b;->t:Z

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lax/s/d$b;->u:Z

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, p0, Lax/s/d$b;->r:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lt v1, v3, :cond_1a

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v1, 0x0

    .line 28
    :goto_1b
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lax/s/d$b;->l:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget v1, p0, Lax/s/d$b;->m:I

    .line 39
    .line 40
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lax/s/d$b;->v:I

    .line 44
    .line 45
    if-ltz v0, :cond_31

    .line 46
    .line 47
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 48
    .line 49
    .line 50
    :cond_31
    iget-object v0, p0, Lax/s/d$b;->z:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_58

    .line 53
    .line 54
    iget-object v0, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 55
    .line 56
    iget-object v0, v0, Lax/s/d;->c:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_50

    .line 63
    .line 64
    new-instance v0, Lax/s/d$a;

    .line 65
    .line 66
    iget-object v1, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/s/d;->b()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v4, p0, Lax/s/d$b;->z:Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v0, v1, v4}, Lax/s/d$a;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 78
    .line 79
    .line 80
    goto :goto_58

    .line 81
    :cond_50
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_58
    :goto_58
    iget v0, p0, Lax/s/d$b;->r:I

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    if-lt v0, v1, :cond_72

    .line 93
    .line 94
    instance-of v0, p1, Landroidx/appcompat/view/menu/g;

    .line 95
    .line 96
    if-eqz v0, :cond_68

    .line 97
    .line 98
    move-object v0, p1

    .line 99
    check-cast v0, Landroidx/appcompat/view/menu/g;

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/g;->t(Z)V

    .line 102
    .line 103
    .line 104
    goto :goto_72

    .line 105
    :cond_68
    instance-of v0, p1, Lax/t/c;

    .line 106
    .line 107
    if-eqz v0, :cond_72

    .line 108
    .line 109
    move-object v0, p1

    .line 110
    check-cast v0, Lax/t/c;

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Lax/t/c;->h(Z)V

    .line 113
    .line 114
    .line 115
    :cond_72
    :goto_72
    iget-object v0, p0, Lax/s/d$b;->x:Ljava/lang/String;

    .line 116
    .line 117
    if-eqz v0, :cond_86

    .line 118
    .line 119
    sget-object v1, Lax/s/d;->e:[Ljava/lang/Class;

    .line 120
    .line 121
    iget-object v2, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 122
    .line 123
    iget-object v2, v2, Lax/s/d;->a:[Ljava/lang/Object;

    .line 124
    .line 125
    invoke-direct {p0, v0, v1, v2}, Lax/s/d$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Landroid/view/View;

    .line 130
    .line 131
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 132
    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    :cond_86
    iget v0, p0, Lax/s/d$b;->w:I

    .line 136
    .line 137
    if-lez v0, :cond_97

    .line 138
    .line 139
    if-nez v2, :cond_90

    .line 140
    .line 141
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 142
    .line 143
    .line 144
    goto :goto_97

    .line 145
    :cond_90
    const-string v0, "SupportMenuInflater"

    .line 146
    .line 147
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 148
    .line 149
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_97
    :goto_97
    iget-object v0, p0, Lax/s/d$b;->A:Lax/c0/b;

    .line 153
    .line 154
    if-eqz v0, :cond_9e

    .line 155
    .line 156
    invoke-static {p1, v0}, Lax/c0/A;->b(Landroid/view/MenuItem;Lax/c0/b;)Landroid/view/MenuItem;

    .line 157
    .line 158
    .line 159
    :cond_9e
    iget-object v0, p0, Lax/s/d$b;->B:Ljava/lang/CharSequence;

    .line 160
    .line 161
    invoke-static {p1, v0}, Lax/c0/A;->d(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lax/s/d$b;->C:Ljava/lang/CharSequence;

    .line 165
    .line 166
    invoke-static {p1, v0}, Lax/c0/A;->i(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    iget-char v0, p0, Lax/s/d$b;->n:C

    .line 170
    .line 171
    iget v1, p0, Lax/s/d$b;->o:I

    .line 172
    .line 173
    invoke-static {p1, v0, v1}, Lax/c0/A;->c(Landroid/view/MenuItem;CI)V

    .line 174
    .line 175
    .line 176
    iget-char v0, p0, Lax/s/d$b;->p:C

    .line 177
    .line 178
    iget v1, p0, Lax/s/d$b;->q:I

    .line 179
    .line 180
    invoke-static {p1, v0, v1}, Lax/c0/A;->g(Landroid/view/MenuItem;CI)V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lax/s/d$b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 184
    .line 185
    if-eqz v0, :cond_bd

    .line 186
    .line 187
    invoke-static {p1, v0}, Lax/c0/A;->f(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    iget-object v0, p0, Lax/s/d$b;->D:Landroid/content/res/ColorStateList;

    .line 191
    .line 192
    if-eqz v0, :cond_c4

    .line 193
    .line 194
    invoke-static {p1, v0}, Lax/c0/A;->e(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    .line 195
    .line 196
    .line 197
    :cond_c4
    return-void
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


# virtual methods
.method public a()V
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/s/d$b;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/s/d$b;->a:Landroid/view/Menu;

    .line 5
    .line 6
    iget v1, p0, Lax/s/d$b;->b:I

    .line 7
    .line 8
    iget v2, p0, Lax/s/d$b;->i:I

    .line 9
    .line 10
    iget v3, p0, Lax/s/d$b;->j:I

    .line 11
    .line 12
    iget-object v4, p0, Lax/s/d$b;->k:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lax/s/d$b;->i(Landroid/view/MenuItem;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b()Landroid/view/SubMenu;
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/s/d$b;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/s/d$b;->a:Landroid/view/Menu;

    .line 5
    .line 6
    iget v1, p0, Lax/s/d$b;->b:I

    .line 7
    .line 8
    iget v2, p0, Lax/s/d$b;->i:I

    .line 9
    .line 10
    iget v3, p0, Lax/s/d$b;->j:I

    .line 11
    .line 12
    iget-object v4, p0, Lax/s/d$b;->k:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {p0, v1}, Lax/s/d$b;->i(Landroid/view/MenuItem;)V

    .line 23
    .line 24
    .line 25
    return-object v0
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
.end method

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/s/d$b;->h:Z

    .line 2
    .line 3
    return v0
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

.method public f(Landroid/util/AttributeSet;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 2
    .line 3
    iget-object v0, v0, Lax/s/d;->c:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Lax/m/j;->o1:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lax/m/j;->q1:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lax/s/d$b;->b:I

    .line 19
    .line 20
    sget v0, Lax/m/j;->s1:I

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lax/s/d$b;->c:I

    .line 27
    .line 28
    sget v0, Lax/m/j;->t1:I

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lax/s/d$b;->d:I

    .line 35
    .line 36
    sget v0, Lax/m/j;->u1:I

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lax/s/d$b;->e:I

    .line 43
    .line 44
    sget v0, Lax/m/j;->r1:I

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput-boolean v0, p0, Lax/s/d$b;->f:Z

    .line 52
    .line 53
    sget v0, Lax/m/j;->p1:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput-boolean v0, p0, Lax/s/d$b;->g:Z

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    .line 63
    .line 64
    return-void
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

.method public g(Landroid/util/AttributeSet;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 2
    .line 3
    iget-object v0, v0, Lax/s/d;->c:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Lax/m/j;->v1:[I

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Landroidx/appcompat/widget/L;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/L;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lax/m/j;->y1:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/L;->n(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lax/s/d$b;->i:I

    .line 19
    .line 20
    sget v0, Lax/m/j;->B1:I

    .line 21
    .line 22
    iget v2, p0, Lax/s/d$b;->c:I

    .line 23
    .line 24
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->k(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget v2, Lax/m/j;->C1:I

    .line 29
    .line 30
    iget v3, p0, Lax/s/d$b;->d:I

    .line 31
    .line 32
    invoke-virtual {p1, v2, v3}, Landroidx/appcompat/widget/L;->k(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/high16 v3, -0x10000

    .line 37
    .line 38
    and-int/2addr v0, v3

    .line 39
    const v3, 0xffff

    .line 40
    .line 41
    .line 42
    and-int/2addr v2, v3

    .line 43
    or-int/2addr v0, v2

    .line 44
    iput v0, p0, Lax/s/d$b;->j:I

    .line 45
    .line 46
    sget v0, Lax/m/j;->D1:I

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->p(I)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lax/s/d$b;->k:Ljava/lang/CharSequence;

    .line 53
    .line 54
    sget v0, Lax/m/j;->E1:I

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->p(I)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lax/s/d$b;->l:Ljava/lang/CharSequence;

    .line 61
    .line 62
    sget v0, Lax/m/j;->w1:I

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/L;->n(II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lax/s/d$b;->m:I

    .line 69
    .line 70
    sget v0, Lax/m/j;->F1:I

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->o(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p0, v0}, Lax/s/d$b;->c(Ljava/lang/String;)C

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput-char v0, p0, Lax/s/d$b;->n:C

    .line 81
    .line 82
    sget v0, Lax/m/j;->M1:I

    .line 83
    .line 84
    const/16 v2, 0x1000

    .line 85
    .line 86
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->k(II)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput v0, p0, Lax/s/d$b;->o:I

    .line 91
    .line 92
    sget v0, Lax/m/j;->G1:I

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->o(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p0, v0}, Lax/s/d$b;->c(Ljava/lang/String;)C

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iput-char v0, p0, Lax/s/d$b;->p:C

    .line 103
    .line 104
    sget v0, Lax/m/j;->Q1:I

    .line 105
    .line 106
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->k(II)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iput v0, p0, Lax/s/d$b;->q:I

    .line 111
    .line 112
    sget v0, Lax/m/j;->H1:I

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->s(I)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_7e

    .line 119
    .line 120
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/L;->a(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iput v0, p0, Lax/s/d$b;->r:I

    .line 125
    .line 126
    goto :goto_82

    .line 127
    :cond_7e
    iget v0, p0, Lax/s/d$b;->e:I

    .line 128
    .line 129
    iput v0, p0, Lax/s/d$b;->r:I

    .line 130
    .line 131
    :goto_82
    sget v0, Lax/m/j;->z1:I

    .line 132
    .line 133
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/L;->a(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iput-boolean v0, p0, Lax/s/d$b;->s:Z

    .line 138
    .line 139
    sget v0, Lax/m/j;->A1:I

    .line 140
    .line 141
    iget-boolean v2, p0, Lax/s/d$b;->f:Z

    .line 142
    .line 143
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->a(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iput-boolean v0, p0, Lax/s/d$b;->t:Z

    .line 148
    .line 149
    sget v0, Lax/m/j;->x1:I

    .line 150
    .line 151
    iget-boolean v2, p0, Lax/s/d$b;->g:Z

    .line 152
    .line 153
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->a(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iput-boolean v0, p0, Lax/s/d$b;->u:Z

    .line 158
    .line 159
    sget v0, Lax/m/j;->R1:I

    .line 160
    .line 161
    const/4 v2, -0x1

    .line 162
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->k(II)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iput v0, p0, Lax/s/d$b;->v:I

    .line 167
    .line 168
    sget v0, Lax/m/j;->I1:I

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->o(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iput-object v0, p0, Lax/s/d$b;->z:Ljava/lang/String;

    .line 175
    .line 176
    sget v0, Lax/m/j;->J1:I

    .line 177
    .line 178
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/L;->n(II)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iput v0, p0, Lax/s/d$b;->w:I

    .line 183
    .line 184
    sget v0, Lax/m/j;->L1:I

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->o(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iput-object v0, p0, Lax/s/d$b;->x:Ljava/lang/String;

    .line 191
    .line 192
    sget v0, Lax/m/j;->K1:I

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->o(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, p0, Lax/s/d$b;->y:Ljava/lang/String;

    .line 199
    .line 200
    if-eqz v0, :cond_cb

    .line 201
    .line 202
    const/4 v3, 0x1

    .line 203
    goto :goto_cc

    .line 204
    :cond_cb
    const/4 v3, 0x0

    .line 205
    :goto_cc
    const/4 v4, 0x0

    .line 206
    if-eqz v3, :cond_e6

    .line 207
    .line 208
    iget v5, p0, Lax/s/d$b;->w:I

    .line 209
    .line 210
    if-nez v5, :cond_e6

    .line 211
    .line 212
    iget-object v5, p0, Lax/s/d$b;->x:Ljava/lang/String;

    .line 213
    .line 214
    if-nez v5, :cond_e6

    .line 215
    .line 216
    sget-object v3, Lax/s/d;->f:[Ljava/lang/Class;

    .line 217
    .line 218
    iget-object v5, p0, Lax/s/d$b;->F:Lax/s/d;

    .line 219
    .line 220
    iget-object v5, v5, Lax/s/d;->b:[Ljava/lang/Object;

    .line 221
    .line 222
    invoke-direct {p0, v0, v3, v5}, Lax/s/d$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lax/c0/b;

    .line 227
    .line 228
    iput-object v0, p0, Lax/s/d$b;->A:Lax/c0/b;

    .line 229
    .line 230
    goto :goto_f1

    .line 231
    :cond_e6
    if-eqz v3, :cond_ef

    .line 232
    .line 233
    const-string v0, "SupportMenuInflater"

    .line 234
    .line 235
    const-string v3, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 236
    .line 237
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    :cond_ef
    iput-object v4, p0, Lax/s/d$b;->A:Lax/c0/b;

    .line 241
    .line 242
    :goto_f1
    sget v0, Lax/m/j;->N1:I

    .line 243
    .line 244
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->p(I)Ljava/lang/CharSequence;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iput-object v0, p0, Lax/s/d$b;->B:Ljava/lang/CharSequence;

    .line 249
    .line 250
    sget v0, Lax/m/j;->S1:I

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->p(I)Ljava/lang/CharSequence;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iput-object v0, p0, Lax/s/d$b;->C:Ljava/lang/CharSequence;

    .line 257
    .line 258
    sget v0, Lax/m/j;->P1:I

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->s(I)Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_116

    .line 265
    .line 266
    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/L;->k(II)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    iget-object v2, p0, Lax/s/d$b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 271
    .line 272
    invoke-static {v0, v2}, Landroidx/appcompat/widget/A;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iput-object v0, p0, Lax/s/d$b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 277
    .line 278
    goto :goto_118

    .line 279
    :cond_116
    iput-object v4, p0, Lax/s/d$b;->E:Landroid/graphics/PorterDuff$Mode;

    .line 280
    .line 281
    :goto_118
    sget v0, Lax/m/j;->O1:I

    .line 282
    .line 283
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->s(I)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_127

    .line 288
    .line 289
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/L;->c(I)Landroid/content/res/ColorStateList;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iput-object v0, p0, Lax/s/d$b;->D:Landroid/content/res/ColorStateList;

    .line 294
    .line 295
    goto :goto_129

    .line 296
    :cond_127
    iput-object v4, p0, Lax/s/d$b;->D:Landroid/content/res/ColorStateList;

    .line 297
    .line 298
    :goto_129
    invoke-virtual {p1}, Landroidx/appcompat/widget/L;->x()V

    .line 299
    .line 300
    .line 301
    iput-boolean v1, p0, Lax/s/d$b;->h:Z

    .line 302
    .line 303
    return-void
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

.method public h()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/s/d$b;->b:I

    .line 3
    .line 4
    iput v0, p0, Lax/s/d$b;->c:I

    .line 5
    .line 6
    iput v0, p0, Lax/s/d$b;->d:I

    .line 7
    .line 8
    iput v0, p0, Lax/s/d$b;->e:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lax/s/d$b;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lax/s/d$b;->g:Z

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
