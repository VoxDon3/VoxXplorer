.class public Lax/J3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# static fields
.field private static volatile l:Lax/J3/c;

.field private static volatile m:Z


# instance fields
.field private final a:Lax/P3/i;

.field private final b:Lax/Q3/d;

.field private final c:Lax/R3/h;

.field private final d:Lax/T3/a;

.field private final e:Lax/J3/e;

.field private final f:Lax/J3/h;

.field private final g:Lax/Q3/b;

.field private final h:Lax/d4/l;

.field private final i:Lax/d4/d;

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/J3/j;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lax/J3/f;


# direct methods
.method constructor <init>(Landroid/content/Context;Lax/P3/i;Lax/R3/h;Lax/Q3/d;Lax/Q3/b;Lax/d4/l;Lax/d4/d;ILax/g4/f;Ljava/util/Map;)V
    .registers 27
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/P3/i;",
            "Lax/R3/h;",
            "Lax/Q3/d;",
            "Lax/Q3/b;",
            "Lax/d4/l;",
            "Lax/d4/d;",
            "I",
            "Lax/g4/f;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/J3/k<",
            "**>;>;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v5, v0, Lax/J3/c;->j:Ljava/util/List;

    .line 20
    .line 21
    sget-object v5, Lax/J3/f;->d0:Lax/J3/f;

    .line 22
    .line 23
    iput-object v5, v0, Lax/J3/c;->k:Lax/J3/f;

    .line 24
    .line 25
    move-object/from16 v7, p2

    .line 26
    .line 27
    iput-object v7, v0, Lax/J3/c;->a:Lax/P3/i;

    .line 28
    .line 29
    iput-object v3, v0, Lax/J3/c;->b:Lax/Q3/d;

    .line 30
    .line 31
    iput-object v4, v0, Lax/J3/c;->g:Lax/Q3/b;

    .line 32
    .line 33
    iput-object v1, v0, Lax/J3/c;->c:Lax/R3/h;

    .line 34
    .line 35
    move-object/from16 v5, p6

    .line 36
    .line 37
    iput-object v5, v0, Lax/J3/c;->h:Lax/d4/l;

    .line 38
    .line 39
    move-object/from16 v5, p7

    .line 40
    .line 41
    iput-object v5, v0, Lax/J3/c;->i:Lax/d4/d;

    .line 42
    .line 43
    invoke-virtual/range {p9 .. p9}, Lax/g4/f;->s()Lax/M3/j;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    sget-object v6, Lax/X3/i;->f:Lax/M3/i;

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Lax/M3/j;->c(Lax/M3/i;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lax/M3/b;

    .line 54
    .line 55
    new-instance v6, Lax/T3/a;

    .line 56
    .line 57
    invoke-direct {v6, v1, v3, v5}, Lax/T3/a;-><init>(Lax/R3/h;Lax/Q3/d;Lax/M3/b;)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v0, Lax/J3/c;->d:Lax/T3/a;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v5, Lax/J3/h;

    .line 67
    .line 68
    invoke-direct {v5}, Lax/J3/h;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v5, v0, Lax/J3/c;->f:Lax/J3/h;

    .line 72
    .line 73
    new-instance v6, Lax/X3/g;

    .line 74
    .line 75
    invoke-direct {v6}, Lax/X3/g;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v6}, Lax/J3/h;->m(Lax/M3/f;)Lax/J3/h;

    .line 79
    .line 80
    .line 81
    new-instance v6, Lax/X3/i;

    .line 82
    .line 83
    invoke-virtual {v5}, Lax/J3/h;->d()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-direct {v6, v8, v9, v3, v4}, Lax/X3/i;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Lax/Q3/d;Lax/Q3/b;)V

    .line 92
    .line 93
    .line 94
    new-instance v8, Lax/b4/a;

    .line 95
    .line 96
    invoke-virtual {v5}, Lax/J3/h;->d()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-direct {v8, v2, v9, v3, v4}, Lax/b4/a;-><init>(Landroid/content/Context;Ljava/util/List;Lax/Q3/d;Lax/Q3/b;)V

    .line 101
    .line 102
    .line 103
    new-instance v9, Lax/U3/c;

    .line 104
    .line 105
    invoke-direct {v9}, Lax/U3/c;-><init>()V

    .line 106
    .line 107
    .line 108
    const-class v10, Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    invoke-virtual {v5, v10, v9}, Lax/J3/h;->o(Ljava/lang/Class;Lax/M3/d;)Lax/J3/h;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    new-instance v11, Lax/U3/s;

    .line 115
    .line 116
    invoke-direct {v11, v4}, Lax/U3/s;-><init>(Lax/Q3/b;)V

    .line 117
    .line 118
    .line 119
    const-class v12, Ljava/io/InputStream;

    .line 120
    .line 121
    invoke-virtual {v9, v12, v11}, Lax/J3/h;->o(Ljava/lang/Class;Lax/M3/d;)Lax/J3/h;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    new-instance v11, Lax/X3/f;

    .line 126
    .line 127
    invoke-direct {v11, v6}, Lax/X3/f;-><init>(Lax/X3/i;)V

    .line 128
    .line 129
    .line 130
    const-class v13, Landroid/graphics/Bitmap;

    .line 131
    .line 132
    invoke-virtual {v9, v10, v13, v11}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    new-instance v11, Lax/X3/m;

    .line 137
    .line 138
    invoke-direct {v11, v6, v4}, Lax/X3/m;-><init>(Lax/X3/i;Lax/Q3/b;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9, v12, v13, v11}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    new-instance v11, Lax/X3/o;

    .line 146
    .line 147
    invoke-direct {v11, v3}, Lax/X3/o;-><init>(Lax/Q3/d;)V

    .line 148
    .line 149
    .line 150
    const-class v14, Landroid/os/ParcelFileDescriptor;

    .line 151
    .line 152
    invoke-virtual {v9, v14, v13, v11}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    new-instance v11, Lax/X3/d;

    .line 157
    .line 158
    invoke-direct {v11}, Lax/X3/d;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v13, v11}, Lax/J3/h;->p(Ljava/lang/Class;Lax/M3/l;)Lax/J3/h;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    new-instance v11, Lax/X3/a;

    .line 166
    .line 167
    new-instance v15, Lax/X3/f;

    .line 168
    .line 169
    invoke-direct {v15, v6}, Lax/X3/f;-><init>(Lax/X3/i;)V

    .line 170
    .line 171
    .line 172
    invoke-direct {v11, v1, v3, v15}, Lax/X3/a;-><init>(Landroid/content/res/Resources;Lax/Q3/d;Lax/M3/k;)V

    .line 173
    .line 174
    .line 175
    const-class v15, Landroid/graphics/drawable/BitmapDrawable;

    .line 176
    .line 177
    invoke-virtual {v9, v10, v15, v11}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    new-instance v11, Lax/X3/a;

    .line 182
    .line 183
    move-object/from16 p3, v5

    .line 184
    .line 185
    new-instance v5, Lax/X3/m;

    .line 186
    .line 187
    invoke-direct {v5, v6, v4}, Lax/X3/m;-><init>(Lax/X3/i;Lax/Q3/b;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v11, v1, v3, v5}, Lax/X3/a;-><init>(Landroid/content/res/Resources;Lax/Q3/d;Lax/M3/k;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v12, v15, v11}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    new-instance v6, Lax/X3/a;

    .line 198
    .line 199
    new-instance v9, Lax/X3/o;

    .line 200
    .line 201
    invoke-direct {v9, v3}, Lax/X3/o;-><init>(Lax/Q3/d;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v6, v1, v3, v9}, Lax/X3/a;-><init>(Landroid/content/res/Resources;Lax/Q3/d;Lax/M3/k;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v14, v15, v6}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    new-instance v6, Lax/X3/b;

    .line 212
    .line 213
    new-instance v9, Lax/X3/d;

    .line 214
    .line 215
    invoke-direct {v9}, Lax/X3/d;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-direct {v6, v3, v9}, Lax/X3/b;-><init>(Lax/Q3/d;Lax/M3/l;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5, v15, v6}, Lax/J3/h;->p(Ljava/lang/Class;Lax/M3/l;)Lax/J3/h;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    new-instance v6, Lax/b4/i;

    .line 226
    .line 227
    invoke-virtual/range {p3 .. p3}, Lax/J3/h;->d()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-direct {v6, v9, v8, v4}, Lax/b4/i;-><init>(Ljava/util/List;Lax/M3/k;Lax/Q3/b;)V

    .line 232
    .line 233
    .line 234
    const-class v9, Lax/b4/c;

    .line 235
    .line 236
    invoke-virtual {v5, v12, v9, v6}, Lax/J3/h;->l(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v5, v10, v9, v8}, Lax/J3/h;->l(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    new-instance v6, Lax/b4/d;

    .line 245
    .line 246
    invoke-direct {v6}, Lax/b4/d;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v9, v6}, Lax/J3/h;->p(Ljava/lang/Class;Lax/M3/l;)Lax/J3/h;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    new-instance v6, Lax/U3/u$a;

    .line 254
    .line 255
    invoke-direct {v6}, Lax/U3/u$a;-><init>()V

    .line 256
    .line 257
    .line 258
    const-class v8, Lax/L3/a;

    .line 259
    .line 260
    invoke-virtual {v5, v8, v8, v6}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    new-instance v6, Lax/b4/h;

    .line 265
    .line 266
    invoke-direct {v6, v3}, Lax/b4/h;-><init>(Lax/Q3/d;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5, v8, v13, v6}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    new-instance v6, Lax/Y3/a$a;

    .line 274
    .line 275
    invoke-direct {v6}, Lax/Y3/a$a;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v6}, Lax/J3/h;->n(Lax/N3/c$a;)Lax/J3/h;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    new-instance v6, Lax/U3/d$b;

    .line 283
    .line 284
    invoke-direct {v6}, Lax/U3/d$b;-><init>()V

    .line 285
    .line 286
    .line 287
    const-class v8, Ljava/io/File;

    .line 288
    .line 289
    invoke-virtual {v5, v8, v10, v6}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    new-instance v6, Lax/U3/f$e;

    .line 294
    .line 295
    invoke-direct {v6}, Lax/U3/f$e;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5, v8, v12, v6}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    new-instance v6, Lax/a4/a;

    .line 303
    .line 304
    invoke-direct {v6}, Lax/a4/a;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5, v8, v8, v6}, Lax/J3/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lax/M3/k;)Lax/J3/h;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    new-instance v6, Lax/U3/f$b;

    .line 312
    .line 313
    invoke-direct {v6}, Lax/U3/f$b;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v5, v8, v14, v6}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    new-instance v6, Lax/U3/u$a;

    .line 321
    .line 322
    invoke-direct {v6}, Lax/U3/u$a;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, v8, v8, v6}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    new-instance v6, Lax/N3/i$a;

    .line 330
    .line 331
    invoke-direct {v6, v4}, Lax/N3/i$a;-><init>(Lax/Q3/b;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v6}, Lax/J3/h;->n(Lax/N3/c$a;)Lax/J3/h;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    new-instance v5, Lax/U3/r$b;

    .line 339
    .line 340
    invoke-direct {v5, v1}, Lax/U3/r$b;-><init>(Landroid/content/res/Resources;)V

    .line 341
    .line 342
    .line 343
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 344
    .line 345
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    new-instance v5, Lax/U3/r$a;

    .line 350
    .line 351
    invoke-direct {v5, v1}, Lax/U3/r$a;-><init>(Landroid/content/res/Resources;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v6, v14, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    new-instance v5, Lax/U3/r$b;

    .line 359
    .line 360
    invoke-direct {v5, v1}, Lax/U3/r$b;-><init>(Landroid/content/res/Resources;)V

    .line 361
    .line 362
    .line 363
    const-class v6, Ljava/lang/Integer;

    .line 364
    .line 365
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    new-instance v5, Lax/U3/r$a;

    .line 370
    .line 371
    invoke-direct {v5, v1}, Lax/U3/r$a;-><init>(Landroid/content/res/Resources;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4, v6, v14, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    new-instance v5, Lax/U3/e$c;

    .line 379
    .line 380
    invoke-direct {v5}, Lax/U3/e$c;-><init>()V

    .line 381
    .line 382
    .line 383
    const-class v6, Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    new-instance v5, Lax/U3/t$b;

    .line 390
    .line 391
    invoke-direct {v5}, Lax/U3/t$b;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    new-instance v5, Lax/U3/t$a;

    .line 399
    .line 400
    invoke-direct {v5}, Lax/U3/t$a;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v6, v14, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    new-instance v5, Lax/V3/b$a;

    .line 408
    .line 409
    invoke-direct {v5}, Lax/V3/b$a;-><init>()V

    .line 410
    .line 411
    .line 412
    const-class v6, Landroid/net/Uri;

    .line 413
    .line 414
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    new-instance v5, Lax/U3/a$c;

    .line 419
    .line 420
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    invoke-direct {v5, v11}, Lax/U3/a$c;-><init>(Landroid/content/res/AssetManager;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    new-instance v5, Lax/U3/a$b;

    .line 432
    .line 433
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 434
    .line 435
    .line 436
    move-result-object v11

    .line 437
    invoke-direct {v5, v11}, Lax/U3/a$b;-><init>(Landroid/content/res/AssetManager;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4, v6, v14, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    new-instance v5, Lax/V3/c$a;

    .line 445
    .line 446
    invoke-direct {v5, v2}, Lax/V3/c$a;-><init>(Landroid/content/Context;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    new-instance v5, Lax/V3/d$a;

    .line 454
    .line 455
    invoke-direct {v5, v2}, Lax/V3/d$a;-><init>(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    new-instance v5, Lax/U3/v$c;

    .line 463
    .line 464
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    invoke-direct {v5, v11}, Lax/U3/v$c;-><init>(Landroid/content/ContentResolver;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    new-instance v5, Lax/U3/v$a;

    .line 476
    .line 477
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    invoke-direct {v5, v11}, Lax/U3/v$a;-><init>(Landroid/content/ContentResolver;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4, v6, v14, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    new-instance v5, Lax/U3/w$a;

    .line 489
    .line 490
    invoke-direct {v5}, Lax/U3/w$a;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    new-instance v5, Lax/V3/e$a;

    .line 498
    .line 499
    invoke-direct {v5}, Lax/V3/e$a;-><init>()V

    .line 500
    .line 501
    .line 502
    const-class v11, Ljava/net/URL;

    .line 503
    .line 504
    invoke-virtual {v4, v11, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    new-instance v5, Lax/U3/k$a;

    .line 509
    .line 510
    invoke-direct {v5, v2}, Lax/U3/k$a;-><init>(Landroid/content/Context;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v4, v6, v8, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    new-instance v5, Lax/V3/a$a;

    .line 518
    .line 519
    invoke-direct {v5}, Lax/V3/a$a;-><init>()V

    .line 520
    .line 521
    .line 522
    const-class v6, Lax/U3/g;

    .line 523
    .line 524
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    new-instance v5, Lax/U3/b$a;

    .line 529
    .line 530
    invoke-direct {v5}, Lax/U3/b$a;-><init>()V

    .line 531
    .line 532
    .line 533
    const-class v6, [B

    .line 534
    .line 535
    invoke-virtual {v4, v6, v10, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    new-instance v5, Lax/U3/b$d;

    .line 540
    .line 541
    invoke-direct {v5}, Lax/U3/b$d;-><init>()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v4, v6, v12, v5}, Lax/J3/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lax/U3/n;)Lax/J3/h;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    new-instance v5, Lax/c4/b;

    .line 549
    .line 550
    invoke-direct {v5, v1, v3}, Lax/c4/b;-><init>(Landroid/content/res/Resources;Lax/Q3/d;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v4, v13, v15, v5}, Lax/J3/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lax/c4/d;)Lax/J3/h;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    new-instance v3, Lax/c4/a;

    .line 558
    .line 559
    invoke-direct {v3}, Lax/c4/a;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1, v13, v6, v3}, Lax/J3/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lax/c4/d;)Lax/J3/h;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    new-instance v3, Lax/c4/c;

    .line 567
    .line 568
    invoke-direct {v3}, Lax/c4/c;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v9, v6, v3}, Lax/J3/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lax/c4/d;)Lax/J3/h;

    .line 572
    .line 573
    .line 574
    new-instance v4, Lax/h4/b;

    .line 575
    .line 576
    invoke-direct {v4}, Lax/h4/b;-><init>()V

    .line 577
    .line 578
    .line 579
    new-instance v1, Lax/J3/e;

    .line 580
    .line 581
    move-object/from16 v3, p3

    .line 582
    .line 583
    move/from16 v8, p8

    .line 584
    .line 585
    move-object/from16 v5, p9

    .line 586
    .line 587
    move-object/from16 v6, p10

    .line 588
    .line 589
    invoke-direct/range {v1 .. v8}, Lax/J3/e;-><init>(Landroid/content/Context;Lax/J3/h;Lax/h4/b;Lax/g4/f;Ljava/util/Map;Lax/P3/i;I)V

    .line 590
    .line 591
    .line 592
    iput-object v1, v0, Lax/J3/c;->e:Lax/J3/e;

    .line 593
    .line 594
    return-void
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
.end method

.method private static a(Landroid/content/Context;)V
    .registers 2

    .line 1
    sget-boolean v0, Lax/J3/c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lax/J3/c;->m:Z

    .line 7
    .line 8
    invoke-static {p0}, Lax/J3/c;->m(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    sput-boolean p0, Lax/J3/c;->m:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method public static c(Landroid/content/Context;)Lax/J3/c;
    .registers 3

    .line 1
    sget-object v0, Lax/J3/c;->l:Lax/J3/c;

    .line 2
    .line 3
    if-nez v0, :cond_15

    .line 4
    .line 5
    const-class v0, Lax/J3/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_7
    sget-object v1, Lax/J3/c;->l:Lax/J3/c;

    .line 9
    .line 10
    if-nez v1, :cond_11

    .line 11
    .line 12
    invoke-static {p0}, Lax/J3/c;->a(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    goto :goto_11

    .line 16
    :catchall_f
    move-exception p0

    .line 17
    goto :goto_13

    .line 18
    :cond_11
    :goto_11
    monitor-exit v0

    .line 19
    goto :goto_15

    .line 20
    :goto_13
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_7 .. :try_end_14} :catchall_f

    .line 21
    throw p0

    .line 22
    :cond_15
    :goto_15
    sget-object p0, Lax/J3/c;->l:Lax/J3/c;

    .line 23
    .line 24
    return-object p0
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
.end method

.method private static d()Lax/J3/a;
    .registers 3

    .line 1
    const-string v0, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 2
    .line 3
    :try_start_2
    const-string v1, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lax/J3/a;
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_e} :catch_13
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_e} :catch_11
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_e} :catch_f

    .line 14
    .line 15
    return-object v1

    .line 16
    :catch_f
    move-exception v1

    .line 17
    goto :goto_15

    .line 18
    :catch_11
    move-exception v1

    .line 19
    goto :goto_1b

    .line 20
    :catch_13
    nop

    .line 21
    goto :goto_21

    .line 22
    :goto_15
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v2

    .line 28
    :goto_1b
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v2

    .line 34
    :goto_21
    const/4 v0, 0x5

    .line 35
    const-string v1, "Glide"

    .line 36
    .line 37
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 44
    .line 45
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_2f
    const/4 v0, 0x0

    .line 49
    return-object v0
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

.method private static l(Landroid/content/Context;)Lax/d4/l;
    .registers 2

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/k4/h;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lax/J3/c;->c(Landroid/content/Context;)Lax/J3/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lax/J3/c;->k()Lax/d4/l;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static m(Landroid/content/Context;)V
    .registers 11

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lax/J3/c;->d()Lax/J3/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v1, :cond_12

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/e4/a;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1b

    .line 18
    .line 19
    :cond_12
    new-instance v2, Lax/e4/d;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Lax/e4/d;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lax/e4/d;->a()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_1b
    const/4 v3, 0x3

    .line 29
    const-string v4, "Glide"

    .line 30
    .line 31
    if-eqz v1, :cond_67

    .line 32
    .line 33
    invoke-virtual {v1}, Lax/J3/a;->d()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_67

    .line 42
    .line 43
    invoke-virtual {v1}, Lax/J3/a;->d()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    :goto_32
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_67

    .line 56
    .line 57
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Lax/e4/b;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-interface {v5, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-nez v8, :cond_49

    .line 72
    .line 73
    goto :goto_32

    .line 74
    :cond_49
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_63

    .line 79
    .line 80
    new-instance v8, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v9, "AppGlideModule excludes manifest GlideModule: "

    .line 86
    .line 87
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-static {v4, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    :cond_63
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 101
    .line 102
    .line 103
    goto :goto_32

    .line 104
    :cond_67
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_96

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :goto_71
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_96

    .line 119
    .line 120
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Lax/e4/b;

    .line 125
    .line 126
    new-instance v6, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v7, "Discovered GlideModule from manifest: "

    .line 132
    .line 133
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    goto :goto_71

    .line 151
    :cond_96
    if-eqz v1, :cond_9d

    .line 152
    .line 153
    invoke-virtual {v1}, Lax/J3/a;->e()Lax/d4/l$b;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    goto :goto_9e

    .line 158
    :cond_9d
    const/4 v3, 0x0

    .line 159
    :goto_9e
    new-instance v4, Lax/J3/d;

    .line 160
    .line 161
    invoke-direct {v4}, Lax/J3/d;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v3}, Lax/J3/d;->b(Lax/d4/l$b;)Lax/J3/d;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    :goto_ab
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eqz v5, :cond_bb

    .line 177
    .line 178
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    check-cast v5, Lax/e4/b;

    .line 183
    .line 184
    invoke-interface {v5, v0, v3}, Lax/e4/b;->a(Landroid/content/Context;Lax/J3/d;)V

    .line 185
    .line 186
    .line 187
    goto :goto_ab

    .line 188
    :cond_bb
    if-eqz v1, :cond_c0

    .line 189
    .line 190
    invoke-virtual {v1, v0, v3}, Lax/e4/a;->b(Landroid/content/Context;Lax/J3/d;)V

    .line 191
    .line 192
    .line 193
    :cond_c0
    invoke-virtual {v3, v0}, Lax/J3/d;->a(Landroid/content/Context;)Lax/J3/c;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    :goto_c8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_da

    .line 206
    .line 207
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Lax/e4/b;

    .line 212
    .line 213
    iget-object v5, v3, Lax/J3/c;->f:Lax/J3/h;

    .line 214
    .line 215
    invoke-interface {v4, v0, v3, v5}, Lax/e4/b;->b(Landroid/content/Context;Lax/J3/c;Lax/J3/h;)V

    .line 216
    .line 217
    .line 218
    goto :goto_c8

    .line 219
    :cond_da
    if-eqz v1, :cond_e1

    .line 220
    .line 221
    iget-object v2, v3, Lax/J3/c;->f:Lax/J3/h;

    .line 222
    .line 223
    invoke-virtual {v1, v0, v3, v2}, Lax/e4/c;->a(Landroid/content/Context;Lax/J3/c;Lax/J3/h;)V

    .line 224
    .line 225
    .line 226
    :cond_e1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0, v3}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 231
    .line 232
    .line 233
    sput-object v3, Lax/J3/c;->l:Lax/J3/c;

    .line 234
    .line 235
    return-void
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

.method public static r(Landroid/content/Context;)Lax/J3/j;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/J3/c;->l(Landroid/content/Context;)Lax/d4/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lax/d4/l;->d(Landroid/content/Context;)Lax/J3/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.method public b()V
    .registers 2

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/c;->c:Lax/R3/h;

    .line 5
    .line 6
    invoke-interface {v0}, Lax/R3/h;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/J3/c;->b:Lax/Q3/d;

    .line 10
    .line 11
    invoke-interface {v0}, Lax/Q3/d;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/J3/c;->g:Lax/Q3/b;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/Q3/b;->b()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public e()Lax/Q3/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->g:Lax/Q3/b;

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

.method public f()Lax/Q3/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->b:Lax/Q3/d;

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

.method g()Lax/d4/d;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->i:Lax/d4/d;

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

.method public h()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->e:Lax/J3/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method i()Lax/J3/e;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->e:Lax/J3/e;

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

.method public j()Lax/J3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->f:Lax/J3/h;

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

.method public k()Lax/d4/l;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/J3/c;->h:Lax/d4/l;

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

.method n(Lax/J3/j;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_14

    .line 11
    .line 12
    iget-object v1, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    goto :goto_1c

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot register already registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_12

    .line 30
    throw p1
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

.method o(Lax/h4/e;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/h4/e<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1f

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lax/J3/j;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lax/J3/j;->v(Lax/h4/e;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_9

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_1d
    move-exception p1

    .line 31
    goto :goto_28

    .line 32
    :cond_1f
    monitor-exit v0
    :try_end_20
    .catchall {:try_start_3 .. :try_end_20} :catchall_1d

    .line 33
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "Failed to remove target from managers"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :goto_28
    :try_start_28
    monitor-exit v0
    :try_end_29
    .catchall {:try_start_28 .. :try_end_29} :catchall_1d

    .line 42
    throw p1
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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

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
.end method

.method public onLowMemory()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/J3/c;->b()V

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

.method public onTrimMemory(I)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/J3/c;->p(I)V

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

.method public p(I)V
    .registers 3

    .line 1
    invoke-static {}, Lax/k4/i;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/J3/c;->c:Lax/R3/h;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lax/R3/h;->a(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/J3/c;->b:Lax/Q3/d;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lax/Q3/d;->a(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/J3/c;->g:Lax/Q3/b;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lax/Q3/b;->a(I)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method q(Lax/J3/j;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_14

    .line 11
    .line 12
    iget-object v1, p0, Lax/J3/c;->j:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    goto :goto_1c

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot register not yet registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_12

    .line 30
    throw p1
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
