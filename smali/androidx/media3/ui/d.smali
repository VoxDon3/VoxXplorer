.class public Landroidx/media3/ui/d;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/d$j;,
        Landroidx/media3/ui/d$b;,
        Landroidx/media3/ui/d$e;,
        Landroidx/media3/ui/d$h;,
        Landroidx/media3/ui/d$c;,
        Landroidx/media3/ui/d$f;,
        Landroidx/media3/ui/d$d;,
        Landroidx/media3/ui/d$m;,
        Landroidx/media3/ui/d$k;,
        Landroidx/media3/ui/d$i;,
        Landroidx/media3/ui/d$l;,
        Landroidx/media3/ui/d$g;
    }
.end annotation


# static fields
.field private static final H0:[F


# instance fields
.field private final A:Landroid/widget/ImageView;

.field private A0:I

.field private final B:Landroid/widget/ImageView;

.field private B0:[J

.field private final C:Landroid/widget/ImageView;

.field private C0:[Z

.field private final D:Landroid/widget/ImageView;

.field private D0:[J

.field private final E:Landroid/widget/ImageView;

.field private E0:[Z

.field private final F:Landroid/view/View;

.field private F0:J

.field private final G:Landroid/view/View;

.field private G0:Z

.field private final H:Landroid/view/View;

.field private final I:Landroid/widget/TextView;

.field private final J:Landroid/widget/TextView;

.field private final K:Landroidx/media3/ui/G;

.field private final L:Ljava/lang/StringBuilder;

.field private final M:Ljava/util/Formatter;

.field private final N:Lax/P0/N$b;

.field private final O:Lax/P0/N$c;

.field private final P:Ljava/lang/Runnable;

.field private final Q:Landroid/graphics/drawable/Drawable;

.field private final R:Landroid/graphics/drawable/Drawable;

.field private final S:Landroid/graphics/drawable/Drawable;

.field private final T:Landroid/graphics/drawable/Drawable;

.field private final U:Landroid/graphics/drawable/Drawable;

.field private final V:Ljava/lang/String;

.field private final W:Ljava/lang/String;

.field private final a:Landroidx/media3/ui/w;

.field private final a0:Ljava/lang/String;

.field private final b:Landroid/content/res/Resources;

.field private final b0:Landroid/graphics/drawable/Drawable;

.field private final c:Landroidx/media3/ui/d$c;

.field private final c0:Landroid/graphics/drawable/Drawable;

.field private final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final d0:F

.field private final e:Ljava/lang/reflect/Method;

.field private final e0:F

.field private final f:Ljava/lang/reflect/Method;

.field private final f0:Ljava/lang/String;

.field private final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final g0:Ljava/lang/String;

.field private final h:Ljava/lang/reflect/Method;

.field private final h0:Landroid/graphics/drawable/Drawable;

.field private final i:Ljava/lang/reflect/Method;

.field private final i0:Landroid/graphics/drawable/Drawable;

.field private final j:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/media3/ui/d$m;",
            ">;"
        }
    .end annotation
.end field

.field private final j0:Ljava/lang/String;

.field private final k:Landroidx/recyclerview/widget/RecyclerView;

.field private final k0:Ljava/lang/String;

.field private final l:Landroidx/media3/ui/d$h;

.field private final l0:Landroid/graphics/drawable/Drawable;

.field private final m:Landroidx/media3/ui/d$e;

.field private final m0:Landroid/graphics/drawable/Drawable;

.field private final n:Landroidx/media3/ui/d$j;

.field private final n0:Ljava/lang/String;

.field private final o:Landroidx/media3/ui/d$b;

.field private final o0:Ljava/lang/String;

.field private final p:Lax/a2/G;

.field private p0:Lax/P0/H;

.field private final q:Landroid/widget/PopupWindow;

.field private q0:Landroidx/media3/ui/d$d;

.field private final r:I

.field private r0:Z

.field private final s:Landroid/widget/ImageView;

.field private s0:Z

.field private final t:Landroid/widget/ImageView;

.field private t0:Z

.field private final u:Landroid/widget/ImageView;

.field private u0:Z

.field private final v:Landroid/view/View;

.field private v0:Z

.field private final w:Landroid/view/View;

.field private w0:Z

.field private final x:Landroid/widget/TextView;

.field private x0:I

.field private final y:Landroid/widget/TextView;

.field private y0:Z

.field private final z:Landroid/widget/ImageView;

.field private z0:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "media3.ui"

    .line 2
    .line 3
    invoke-static {v0}, Lax/P0/z;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_e

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/media3/ui/d;->H0:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_e
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .registers 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    const-string v0, "isScrubbingModeEnabled"

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v3, "setScrubbingModeEnabled"

    .line 10
    .line 11
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    sget v4, Lax/a2/B;->b:I

    .line 15
    .line 16
    sget v5, Lax/a2/x;->g:I

    .line 17
    .line 18
    sget v7, Lax/a2/x;->f:I

    .line 19
    .line 20
    sget v8, Lax/a2/x;->e:I

    .line 21
    .line 22
    sget v9, Lax/a2/x;->n:I

    .line 23
    .line 24
    sget v10, Lax/a2/x;->h:I

    .line 25
    .line 26
    sget v11, Lax/a2/x;->o:I

    .line 27
    .line 28
    sget v12, Lax/a2/x;->d:I

    .line 29
    .line 30
    sget v13, Lax/a2/x;->c:I

    .line 31
    .line 32
    sget v14, Lax/a2/x;->j:I

    .line 33
    .line 34
    sget v15, Lax/a2/x;->k:I

    .line 35
    .line 36
    move-object/from16 v16, v2

    .line 37
    .line 38
    sget v2, Lax/a2/x;->i:I

    .line 39
    .line 40
    move-object/from16 v17, v0

    .line 41
    .line 42
    sget v0, Lax/a2/x;->m:I

    .line 43
    .line 44
    move-object/from16 v18, v3

    .line 45
    .line 46
    sget v3, Lax/a2/x;->l:I

    .line 47
    .line 48
    move/from16 p2, v3

    .line 49
    .line 50
    sget v3, Lax/a2/x;->r:I

    .line 51
    .line 52
    move/from16 v19, v3

    .line 53
    .line 54
    sget v3, Lax/a2/x;->q:I

    .line 55
    .line 56
    move/from16 v20, v3

    .line 57
    .line 58
    sget v3, Lax/a2/x;->s:I

    .line 59
    .line 60
    move/from16 v21, v3

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    iput-boolean v3, v1, Landroidx/media3/ui/d;->u0:Z

    .line 64
    .line 65
    const/16 v3, 0x1388

    .line 66
    .line 67
    iput v3, v1, Landroidx/media3/ui/d;->x0:I

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    iput v3, v1, Landroidx/media3/ui/d;->A0:I

    .line 71
    .line 72
    const/16 v3, 0xc8

    .line 73
    .line 74
    iput v3, v1, Landroidx/media3/ui/d;->z0:I

    .line 75
    .line 76
    if-eqz v6, :cond_176

    .line 77
    .line 78
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    sget-object v1, Lax/a2/F;->y:[I

    .line 83
    .line 84
    move/from16 v24, v0

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    move/from16 v0, p3

    .line 90
    .line 91
    invoke-virtual {v3, v6, v1, v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :try_start_5e
    sget v0, Lax/a2/F;->A:I

    .line 96
    .line 97
    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    sget v0, Lax/a2/F;->G:I

    .line 102
    .line 103
    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    sget v0, Lax/a2/F;->F:I

    .line 108
    .line 109
    invoke-virtual {v1, v0, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    sget v0, Lax/a2/F;->E:I

    .line 114
    .line 115
    invoke-virtual {v1, v0, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    sget v0, Lax/a2/F;->B:I

    .line 120
    .line 121
    invoke-virtual {v1, v0, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    sget v0, Lax/a2/F;->H:I

    .line 126
    .line 127
    invoke-virtual {v1, v0, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    sget v0, Lax/a2/F;->M:I

    .line 132
    .line 133
    invoke-virtual {v1, v0, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    sget v0, Lax/a2/F;->D:I

    .line 138
    .line 139
    invoke-virtual {v1, v0, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    sget v0, Lax/a2/F;->C:I

    .line 144
    .line 145
    invoke-virtual {v1, v0, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    sget v0, Lax/a2/F;->J:I

    .line 150
    .line 151
    invoke-virtual {v1, v0, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    sget v0, Lax/a2/F;->K:I

    .line 156
    .line 157
    invoke-virtual {v1, v0, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    sget v0, Lax/a2/F;->I:I

    .line 162
    .line 163
    move/from16 v2, v25

    .line 164
    .line 165
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    sget v0, Lax/a2/F;->W:I

    .line 170
    .line 171
    move/from16 v3, v24

    .line 172
    .line 173
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    sget v3, Lax/a2/F;->V:I

    .line 178
    .line 179
    move/from16 p3, v0

    .line 180
    .line 181
    move/from16 v0, p2

    .line 182
    .line 183
    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    sget v0, Lax/a2/F;->Y:I

    .line 188
    .line 189
    move/from16 p2, v2

    .line 190
    .line 191
    move/from16 v2, v19

    .line 192
    .line 193
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    sget v2, Lax/a2/F;->X:I

    .line 198
    .line 199
    move/from16 v19, v0

    .line 200
    .line 201
    move/from16 v0, v20

    .line 202
    .line 203
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    sget v2, Lax/a2/F;->b0:I

    .line 208
    .line 209
    move/from16 v20, v0

    .line 210
    .line 211
    move/from16 v0, v21

    .line 212
    .line 213
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    sget v2, Lax/a2/F;->T:I
    :try_end_da
    .catchall {:try_start_5e .. :try_end_da} :catchall_16f

    .line 218
    .line 219
    move/from16 v24, v0

    .line 220
    .line 221
    move/from16 v21, v4

    .line 222
    .line 223
    move-object/from16 v4, p0

    .line 224
    .line 225
    :try_start_e0
    iget v0, v4, Landroidx/media3/ui/d;->x0:I

    .line 226
    .line 227
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    iput v0, v4, Landroidx/media3/ui/d;->x0:I

    .line 232
    .line 233
    iget v0, v4, Landroidx/media3/ui/d;->A0:I

    .line 234
    .line 235
    invoke-static {v1, v0}, Landroidx/media3/ui/d;->d0(Landroid/content/res/TypedArray;I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iput v0, v4, Landroidx/media3/ui/d;->A0:I

    .line 240
    .line 241
    sget v0, Lax/a2/F;->Q:I

    .line 242
    .line 243
    const/4 v2, 0x1

    .line 244
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    move/from16 v25, v0

    .line 249
    .line 250
    sget v0, Lax/a2/F;->N:I

    .line 251
    .line 252
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    move/from16 v26, v0

    .line 257
    .line 258
    sget v0, Lax/a2/F;->P:I

    .line 259
    .line 260
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    move/from16 v27, v0

    .line 265
    .line 266
    sget v0, Lax/a2/F;->O:I

    .line 267
    .line 268
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    sget v2, Lax/a2/F;->R:I

    .line 273
    .line 274
    move/from16 v28, v0

    .line 275
    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    move/from16 v29, v2

    .line 282
    .line 283
    sget v2, Lax/a2/F;->S:I

    .line 284
    .line 285
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    move/from16 v30, v2

    .line 290
    .line 291
    sget v2, Lax/a2/F;->U:I

    .line 292
    .line 293
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    move/from16 v31, v2

    .line 298
    .line 299
    sget v2, Lax/a2/F;->a0:I

    .line 300
    .line 301
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    iput-boolean v2, v4, Landroidx/media3/ui/d;->y0:Z

    .line 306
    .line 307
    sget v0, Lax/a2/F;->Z:I

    .line 308
    .line 309
    iget v2, v4, Landroidx/media3/ui/d;->z0:I

    .line 310
    .line 311
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-virtual {v4, v0}, Landroidx/media3/ui/d;->setTimeBarMinUpdateInterval(I)V

    .line 316
    .line 317
    .line 318
    sget v0, Lax/a2/F;->z:I

    .line 319
    .line 320
    const/4 v2, 0x1

    .line 321
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 322
    .line 323
    .line 324
    move-result v0
    :try_end_144
    .catchall {:try_start_e0 .. :try_end_144} :catchall_16d

    .line 325
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 326
    .line 327
    .line 328
    move v1, v13

    .line 329
    move v13, v9

    .line 330
    move v9, v12

    .line 331
    move v12, v10

    .line 332
    move v10, v1

    .line 333
    move/from16 v1, v28

    .line 334
    .line 335
    move/from16 v28, v25

    .line 336
    .line 337
    move/from16 v25, v29

    .line 338
    .line 339
    move/from16 v29, v26

    .line 340
    .line 341
    move/from16 v26, v1

    .line 342
    .line 343
    move v1, v0

    .line 344
    move v0, v14

    .line 345
    move v14, v8

    .line 346
    move v8, v15

    .line 347
    move v15, v7

    .line 348
    move v7, v5

    .line 349
    move/from16 v5, v21

    .line 350
    .line 351
    move/from16 v21, v31

    .line 352
    .line 353
    move/from16 v31, p2

    .line 354
    .line 355
    move/from16 p2, v19

    .line 356
    .line 357
    move/from16 v19, v3

    .line 358
    .line 359
    move/from16 v3, v24

    .line 360
    .line 361
    move/from16 v24, v30

    .line 362
    .line 363
    move/from16 v30, p3

    .line 364
    .line 365
    goto :goto_1a5

    .line 366
    :catchall_16d
    move-exception v0

    .line 367
    goto :goto_172

    .line 368
    :catchall_16f
    move-exception v0

    .line 369
    move-object/from16 v4, p0

    .line 370
    .line 371
    :goto_172
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 372
    .line 373
    .line 374
    throw v0

    .line 375
    :cond_176
    move v3, v4

    .line 376
    move-object v4, v1

    .line 377
    move v1, v3

    .line 378
    move v3, v0

    .line 379
    move/from16 v25, v2

    .line 380
    .line 381
    move/from16 v2, v19

    .line 382
    .line 383
    move/from16 v0, v21

    .line 384
    .line 385
    move/from16 v19, p2

    .line 386
    .line 387
    move/from16 p2, v13

    .line 388
    .line 389
    move v13, v9

    .line 390
    move v9, v12

    .line 391
    move v12, v10

    .line 392
    move/from16 v10, p2

    .line 393
    .line 394
    move/from16 p2, v2

    .line 395
    .line 396
    move/from16 v30, v3

    .line 397
    .line 398
    move/from16 v31, v25

    .line 399
    .line 400
    const/16 v21, 0x0

    .line 401
    .line 402
    const/16 v24, 0x0

    .line 403
    .line 404
    const/16 v25, 0x0

    .line 405
    .line 406
    const/16 v26, 0x1

    .line 407
    .line 408
    const/16 v27, 0x1

    .line 409
    .line 410
    const/16 v28, 0x1

    .line 411
    .line 412
    const/16 v29, 0x1

    .line 413
    .line 414
    move v3, v0

    .line 415
    move v0, v14

    .line 416
    move v14, v8

    .line 417
    move v8, v15

    .line 418
    move v15, v7

    .line 419
    move v7, v5

    .line 420
    move v5, v1

    .line 421
    const/4 v1, 0x1

    .line 422
    :goto_1a5
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-virtual {v2, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 427
    .line 428
    .line 429
    const/high16 v2, 0x40000

    .line 430
    .line 431
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 432
    .line 433
    .line 434
    new-instance v2, Landroidx/media3/ui/d$c;

    .line 435
    .line 436
    const/4 v5, 0x0

    .line 437
    invoke-direct {v2, v4, v5}, Landroidx/media3/ui/d$c;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 438
    .line 439
    .line 440
    iput-object v2, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 441
    .line 442
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 443
    .line 444
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 445
    .line 446
    .line 447
    iput-object v2, v4, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 448
    .line 449
    new-instance v2, Lax/P0/N$b;

    .line 450
    .line 451
    invoke-direct {v2}, Lax/P0/N$b;-><init>()V

    .line 452
    .line 453
    .line 454
    iput-object v2, v4, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 455
    .line 456
    new-instance v2, Lax/P0/N$c;

    .line 457
    .line 458
    invoke-direct {v2}, Lax/P0/N$c;-><init>()V

    .line 459
    .line 460
    .line 461
    iput-object v2, v4, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 462
    .line 463
    new-instance v2, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    iput-object v2, v4, Landroidx/media3/ui/d;->L:Ljava/lang/StringBuilder;

    .line 469
    .line 470
    new-instance v5, Ljava/util/Formatter;

    .line 471
    .line 472
    move/from16 v32, v3

    .line 473
    .line 474
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-direct {v5, v2, v3}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 479
    .line 480
    .line 481
    iput-object v5, v4, Landroidx/media3/ui/d;->M:Ljava/util/Formatter;

    .line 482
    .line 483
    const/4 v2, 0x0

    .line 484
    new-array v3, v2, [J

    .line 485
    .line 486
    iput-object v3, v4, Landroidx/media3/ui/d;->B0:[J

    .line 487
    .line 488
    new-array v3, v2, [Z

    .line 489
    .line 490
    iput-object v3, v4, Landroidx/media3/ui/d;->C0:[Z

    .line 491
    .line 492
    new-array v3, v2, [J

    .line 493
    .line 494
    iput-object v3, v4, Landroidx/media3/ui/d;->D0:[J

    .line 495
    .line 496
    new-array v3, v2, [Z

    .line 497
    .line 498
    iput-object v3, v4, Landroidx/media3/ui/d;->E0:[Z

    .line 499
    .line 500
    new-instance v3, Lax/a2/g;

    .line 501
    .line 502
    invoke-direct {v3, v4}, Lax/a2/g;-><init>(Landroidx/media3/ui/d;)V

    .line 503
    .line 504
    .line 505
    iput-object v3, v4, Landroidx/media3/ui/d;->P:Ljava/lang/Runnable;

    .line 506
    .line 507
    :try_start_1fa
    const-class v3, Landroidx/media3/exoplayer/ExoPlayer;
    :try_end_1fc
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1fa .. :try_end_1fc} :catch_225
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1fa .. :try_end_1fc} :catch_225

    .line 508
    .line 509
    const/4 v5, 0x1

    .line 510
    const/16 v23, 0x0

    .line 511
    .line 512
    :try_start_1ff
    new-array v2, v5, [Ljava/lang/Class;

    .line 513
    .line 514
    aput-object v16, v2, v23
    :try_end_203
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1ff .. :try_end_203} :catch_220
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1ff .. :try_end_203} :catch_220

    .line 515
    .line 516
    move-object/from16 v5, v18

    .line 517
    .line 518
    :try_start_205
    invoke-virtual {v3, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 519
    .line 520
    .line 521
    move-result-object v2
    :try_end_209
    .catch Ljava/lang/ClassNotFoundException; {:try_start_205 .. :try_end_209} :catch_21b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_205 .. :try_end_209} :catch_21b

    .line 522
    move-object/from16 v18, v2

    .line 523
    .line 524
    move-object/from16 v2, v17

    .line 525
    .line 526
    const/4 v6, 0x0

    .line 527
    :try_start_20e
    invoke-virtual {v3, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 528
    .line 529
    .line 530
    move-result-object v17
    :try_end_212
    .catch Ljava/lang/ClassNotFoundException; {:try_start_20e .. :try_end_212} :catch_22b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_20e .. :try_end_212} :catch_22b

    .line 531
    move-object/from16 v6, v17

    .line 532
    .line 533
    move/from16 v17, v7

    .line 534
    .line 535
    move-object v7, v6

    .line 536
    :goto_217
    move-object v6, v3

    .line 537
    move-object/from16 v3, v18

    .line 538
    .line 539
    goto :goto_22f

    .line 540
    :catch_21b
    move-object/from16 v2, v17

    .line 541
    .line 542
    :goto_21d
    const/16 v18, 0x0

    .line 543
    .line 544
    goto :goto_22b

    .line 545
    :catch_220
    move-object/from16 v2, v17

    .line 546
    .line 547
    move-object/from16 v5, v18

    .line 548
    .line 549
    goto :goto_21d

    .line 550
    :catch_225
    move-object/from16 v2, v17

    .line 551
    .line 552
    move-object/from16 v5, v18

    .line 553
    .line 554
    const/4 v3, 0x0

    .line 555
    goto :goto_21d

    .line 556
    :catch_22b
    :goto_22b
    move/from16 v17, v7

    .line 557
    .line 558
    const/4 v7, 0x0

    .line 559
    goto :goto_217

    .line 560
    :goto_22f
    iput-object v6, v4, Landroidx/media3/ui/d;->d:Ljava/lang/Class;

    .line 561
    .line 562
    iput-object v3, v4, Landroidx/media3/ui/d;->e:Ljava/lang/reflect/Method;

    .line 563
    .line 564
    iput-object v7, v4, Landroidx/media3/ui/d;->f:Ljava/lang/reflect/Method;

    .line 565
    .line 566
    :try_start_235
    const-string v3, "androidx.media3.transformer.CompositionPlayer"

    .line 567
    .line 568
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    move-result-object v6
    :try_end_23b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_235 .. :try_end_23b} :catch_25e
    .catch Ljava/lang/NoSuchMethodException; {:try_start_235 .. :try_end_23b} :catch_25e

    .line 572
    const/4 v3, 0x1

    .line 573
    :try_start_23c
    new-array v7, v3, [Ljava/lang/Class;
    :try_end_23e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_23c .. :try_end_23e} :catch_25a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_23c .. :try_end_23e} :catch_256

    .line 574
    .line 575
    const/16 v23, 0x0

    .line 576
    .line 577
    :try_start_240
    aput-object v16, v7, v23
    :try_end_242
    .catch Ljava/lang/ClassNotFoundException; {:try_start_240 .. :try_end_242} :catch_254
    .catch Ljava/lang/NoSuchMethodException; {:try_start_240 .. :try_end_242} :catch_252

    .line 578
    .line 579
    :try_start_242
    invoke-virtual {v6, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 580
    .line 581
    .line 582
    move-result-object v5
    :try_end_246
    .catch Ljava/lang/ClassNotFoundException; {:try_start_242 .. :try_end_246} :catch_24e
    .catch Ljava/lang/NoSuchMethodException; {:try_start_242 .. :try_end_246} :catch_24e

    .line 583
    const/4 v7, 0x0

    .line 584
    :try_start_247
    invoke-virtual {v6, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 585
    .line 586
    .line 587
    move-result-object v2
    :try_end_24b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_247 .. :try_end_24b} :catch_24c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_247 .. :try_end_24b} :catch_24c

    .line 588
    goto :goto_266

    .line 589
    :catch_24c
    nop

    .line 590
    goto :goto_265

    .line 591
    :catch_24e
    const/4 v7, 0x0

    .line 592
    :goto_24f
    nop

    .line 593
    move-object v5, v7

    .line 594
    goto :goto_265

    .line 595
    :catch_252
    const/4 v7, 0x0

    .line 596
    goto :goto_24f

    .line 597
    :catch_254
    const/4 v7, 0x0

    .line 598
    goto :goto_24f

    .line 599
    :catch_256
    const/4 v7, 0x0

    .line 600
    const/16 v23, 0x0

    .line 601
    .line 602
    goto :goto_24f

    .line 603
    :catch_25a
    const/4 v7, 0x0

    .line 604
    const/16 v23, 0x0

    .line 605
    .line 606
    goto :goto_24f

    .line 607
    :catch_25e
    const/4 v3, 0x1

    .line 608
    const/4 v7, 0x0

    .line 609
    const/16 v23, 0x0

    .line 610
    .line 611
    nop

    .line 612
    move-object v5, v7

    .line 613
    move-object v6, v5

    .line 614
    :goto_265
    move-object v2, v7

    .line 615
    :goto_266
    iput-object v6, v4, Landroidx/media3/ui/d;->g:Ljava/lang/Class;

    .line 616
    .line 617
    iput-object v5, v4, Landroidx/media3/ui/d;->h:Ljava/lang/reflect/Method;

    .line 618
    .line 619
    iput-object v2, v4, Landroidx/media3/ui/d;->i:Ljava/lang/reflect/Method;

    .line 620
    .line 621
    sget v2, Lax/a2/z;->m:I

    .line 622
    .line 623
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Landroid/widget/TextView;

    .line 628
    .line 629
    iput-object v2, v4, Landroidx/media3/ui/d;->I:Landroid/widget/TextView;

    .line 630
    .line 631
    sget v2, Lax/a2/z;->E:I

    .line 632
    .line 633
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Landroid/widget/TextView;

    .line 638
    .line 639
    iput-object v2, v4, Landroidx/media3/ui/d;->J:Landroid/widget/TextView;

    .line 640
    .line 641
    sget v2, Lax/a2/z;->P:I

    .line 642
    .line 643
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    check-cast v2, Landroid/widget/ImageView;

    .line 648
    .line 649
    iput-object v2, v4, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 650
    .line 651
    if-eqz v2, :cond_291

    .line 652
    .line 653
    iget-object v5, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 654
    .line 655
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 656
    .line 657
    .line 658
    :cond_291
    sget v2, Lax/a2/z;->s:I

    .line 659
    .line 660
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    check-cast v2, Landroid/widget/ImageView;

    .line 665
    .line 666
    iput-object v2, v4, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 667
    .line 668
    new-instance v5, Lax/a2/h;

    .line 669
    .line 670
    invoke-direct {v5, v4}, Lax/a2/h;-><init>(Landroidx/media3/ui/d;)V

    .line 671
    .line 672
    .line 673
    invoke-static {v2, v5}, Landroidx/media3/ui/d;->h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 674
    .line 675
    .line 676
    sget v2, Lax/a2/z;->x:I

    .line 677
    .line 678
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    check-cast v2, Landroid/widget/ImageView;

    .line 683
    .line 684
    iput-object v2, v4, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 685
    .line 686
    new-instance v5, Lax/a2/h;

    .line 687
    .line 688
    invoke-direct {v5, v4}, Lax/a2/h;-><init>(Landroidx/media3/ui/d;)V

    .line 689
    .line 690
    .line 691
    invoke-static {v2, v5}, Landroidx/media3/ui/d;->h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 692
    .line 693
    .line 694
    sget v2, Lax/a2/z;->L:I

    .line 695
    .line 696
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    iput-object v2, v4, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 701
    .line 702
    if-eqz v2, :cond_2c4

    .line 703
    .line 704
    iget-object v5, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 705
    .line 706
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 707
    .line 708
    .line 709
    :cond_2c4
    sget v2, Lax/a2/z;->D:I

    .line 710
    .line 711
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    iput-object v2, v4, Landroidx/media3/ui/d;->G:Landroid/view/View;

    .line 716
    .line 717
    if-eqz v2, :cond_2d3

    .line 718
    .line 719
    iget-object v5, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 720
    .line 721
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 722
    .line 723
    .line 724
    :cond_2d3
    sget v2, Lax/a2/z;->c:I

    .line 725
    .line 726
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    iput-object v2, v4, Landroidx/media3/ui/d;->H:Landroid/view/View;

    .line 731
    .line 732
    if-eqz v2, :cond_2e2

    .line 733
    .line 734
    iget-object v5, v4, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 735
    .line 736
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 737
    .line 738
    .line 739
    :cond_2e2
    sget v2, Lax/a2/z;->G:I

    .line 740
    .line 741
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    check-cast v5, Landroidx/media3/ui/G;

    .line 746
    .line 747
    sget v6, Lax/a2/z;->H:I

    .line 748
    .line 749
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    if-eqz v5, :cond_30f

    .line 754
    .line 755
    iput-object v5, v4, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 756
    .line 757
    move-object/from16 v3, p1

    .line 758
    .line 759
    move/from16 v16, v0

    .line 760
    .line 761
    move/from16 v22, v8

    .line 762
    .line 763
    move/from16 v18, v9

    .line 764
    .line 765
    move/from16 v33, v19

    .line 766
    .line 767
    move/from16 v0, v32

    .line 768
    .line 769
    move/from16 v9, p2

    .line 770
    .line 771
    move-object v8, v4

    .line 772
    move/from16 v19, v15

    .line 773
    .line 774
    move/from16 v15, v20

    .line 775
    .line 776
    const/16 p2, 0x1

    .line 777
    .line 778
    move/from16 v20, v17

    .line 779
    .line 780
    move/from16 v17, v10

    .line 781
    .line 782
    goto/16 :goto_37a

    .line 783
    .line 784
    :cond_30f
    if-eqz v6, :cond_35e

    .line 785
    .line 786
    move v5, v2

    .line 787
    new-instance v2, Landroidx/media3/ui/b;

    .line 788
    .line 789
    move/from16 v16, v5

    .line 790
    .line 791
    const/4 v5, 0x0

    .line 792
    move-object/from16 v18, v7

    .line 793
    .line 794
    sget v7, Lax/a2/E;->a:I

    .line 795
    .line 796
    const/4 v4, 0x0

    .line 797
    move-object/from16 v3, p1

    .line 798
    .line 799
    move/from16 v22, v8

    .line 800
    .line 801
    move/from16 v18, v9

    .line 802
    .line 803
    move/from16 v33, v19

    .line 804
    .line 805
    move-object/from16 v8, p0

    .line 806
    .line 807
    move/from16 v9, p2

    .line 808
    .line 809
    move/from16 v19, v15

    .line 810
    .line 811
    move/from16 v15, v20

    .line 812
    .line 813
    const/16 p2, 0x1

    .line 814
    .line 815
    move/from16 v20, v17

    .line 816
    .line 817
    move/from16 v17, v10

    .line 818
    .line 819
    move/from16 v10, v16

    .line 820
    .line 821
    move/from16 v16, v0

    .line 822
    .line 823
    move/from16 v0, v32

    .line 824
    .line 825
    move-object/from16 v32, v6

    .line 826
    .line 827
    move-object/from16 v6, p4

    .line 828
    .line 829
    invoke-direct/range {v2 .. v7}, Landroidx/media3/ui/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v2, v10}, Landroid/view/View;->setId(I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v32 .. v32}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    check-cast v4, Landroid/view/ViewGroup;

    .line 847
    .line 848
    move-object/from16 v5, v32

    .line 849
    .line 850
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 851
    .line 852
    .line 853
    move-result v6

    .line 854
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v4, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 858
    .line 859
    .line 860
    iput-object v2, v8, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 861
    .line 862
    goto :goto_37a

    .line 863
    :cond_35e
    move-object/from16 v3, p1

    .line 864
    .line 865
    move/from16 v16, v0

    .line 866
    .line 867
    move-object v6, v7

    .line 868
    move/from16 v22, v8

    .line 869
    .line 870
    move/from16 v18, v9

    .line 871
    .line 872
    move/from16 v33, v19

    .line 873
    .line 874
    move/from16 v0, v32

    .line 875
    .line 876
    move/from16 v9, p2

    .line 877
    .line 878
    move-object v8, v4

    .line 879
    move/from16 v19, v15

    .line 880
    .line 881
    move/from16 v15, v20

    .line 882
    .line 883
    const/16 p2, 0x1

    .line 884
    .line 885
    move/from16 v20, v17

    .line 886
    .line 887
    move/from16 v17, v10

    .line 888
    .line 889
    iput-object v6, v8, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 890
    .line 891
    :goto_37a
    iget-object v2, v8, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 892
    .line 893
    if-eqz v2, :cond_383

    .line 894
    .line 895
    iget-object v4, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 896
    .line 897
    invoke-interface {v2, v4}, Landroidx/media3/ui/G;->a(Landroidx/media3/ui/G$a;)V

    .line 898
    .line 899
    .line 900
    :cond_383
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    iput-object v2, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 905
    .line 906
    sget v4, Lax/a2/z;->C:I

    .line 907
    .line 908
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    check-cast v4, Landroid/widget/ImageView;

    .line 913
    .line 914
    iput-object v4, v8, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 915
    .line 916
    if-eqz v4, :cond_39a

    .line 917
    .line 918
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 919
    .line 920
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 921
    .line 922
    .line 923
    :cond_39a
    sget v4, Lax/a2/z;->F:I

    .line 924
    .line 925
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    check-cast v4, Landroid/widget/ImageView;

    .line 930
    .line 931
    iput-object v4, v8, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 932
    .line 933
    if-eqz v4, :cond_3b2

    .line 934
    .line 935
    invoke-static {v3, v2, v12}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 936
    .line 937
    .line 938
    move-result-object v5

    .line 939
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 940
    .line 941
    .line 942
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 943
    .line 944
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 945
    .line 946
    .line 947
    :cond_3b2
    sget v4, Lax/a2/z;->y:I

    .line 948
    .line 949
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 950
    .line 951
    .line 952
    move-result-object v4

    .line 953
    check-cast v4, Landroid/widget/ImageView;

    .line 954
    .line 955
    iput-object v4, v8, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 956
    .line 957
    if-eqz v4, :cond_3ca

    .line 958
    .line 959
    invoke-static {v3, v2, v14}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 960
    .line 961
    .line 962
    move-result-object v5

    .line 963
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 964
    .line 965
    .line 966
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 967
    .line 968
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 969
    .line 970
    .line 971
    :cond_3ca
    sget v4, Lax/a2/y;->a:I

    .line 972
    .line 973
    invoke-static {v3, v4}, Lax/S/h;->g(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    sget v5, Lax/a2/z;->J:I

    .line 978
    .line 979
    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    check-cast v5, Landroid/widget/ImageView;

    .line 984
    .line 985
    sget v6, Lax/a2/z;->K:I

    .line 986
    .line 987
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 988
    .line 989
    .line 990
    move-result-object v6

    .line 991
    check-cast v6, Landroid/widget/TextView;

    .line 992
    .line 993
    if-eqz v5, :cond_3ef

    .line 994
    .line 995
    invoke-static {v3, v2, v11}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 996
    .line 997
    .line 998
    move-result-object v6

    .line 999
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1000
    .line 1001
    .line 1002
    iput-object v5, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1003
    .line 1004
    const/4 v7, 0x0

    .line 1005
    iput-object v7, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 1006
    .line 1007
    goto :goto_3fe

    .line 1008
    :cond_3ef
    const/4 v7, 0x0

    .line 1009
    if-eqz v6, :cond_3fa

    .line 1010
    .line 1011
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1012
    .line 1013
    .line 1014
    iput-object v6, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 1015
    .line 1016
    iput-object v6, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1017
    .line 1018
    goto :goto_3fe

    .line 1019
    :cond_3fa
    iput-object v7, v8, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 1020
    .line 1021
    iput-object v7, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1022
    .line 1023
    :goto_3fe
    iget-object v5, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1024
    .line 1025
    if-eqz v5, :cond_407

    .line 1026
    .line 1027
    iget-object v6, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1028
    .line 1029
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1030
    .line 1031
    .line 1032
    :cond_407
    sget v5, Lax/a2/z;->q:I

    .line 1033
    .line 1034
    invoke-virtual {v8, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v5

    .line 1038
    check-cast v5, Landroid/widget/ImageView;

    .line 1039
    .line 1040
    sget v6, Lax/a2/z;->r:I

    .line 1041
    .line 1042
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v6

    .line 1046
    check-cast v6, Landroid/widget/TextView;

    .line 1047
    .line 1048
    if-eqz v5, :cond_426

    .line 1049
    .line 1050
    invoke-static {v3, v2, v13}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v4

    .line 1054
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1055
    .line 1056
    .line 1057
    iput-object v5, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1058
    .line 1059
    const/4 v7, 0x0

    .line 1060
    iput-object v7, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1061
    .line 1062
    goto :goto_435

    .line 1063
    :cond_426
    const/4 v7, 0x0

    .line 1064
    if-eqz v6, :cond_431

    .line 1065
    .line 1066
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1067
    .line 1068
    .line 1069
    iput-object v6, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1070
    .line 1071
    iput-object v6, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1072
    .line 1073
    goto :goto_435

    .line 1074
    :cond_431
    iput-object v7, v8, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 1075
    .line 1076
    iput-object v7, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1077
    .line 1078
    :goto_435
    iget-object v4, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1079
    .line 1080
    if-eqz v4, :cond_43e

    .line 1081
    .line 1082
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1083
    .line 1084
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1085
    .line 1086
    .line 1087
    :cond_43e
    sget v4, Lax/a2/z;->I:I

    .line 1088
    .line 1089
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v4

    .line 1093
    check-cast v4, Landroid/widget/ImageView;

    .line 1094
    .line 1095
    iput-object v4, v8, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 1096
    .line 1097
    if-eqz v4, :cond_44f

    .line 1098
    .line 1099
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1100
    .line 1101
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1102
    .line 1103
    .line 1104
    :cond_44f
    sget v4, Lax/a2/z;->M:I

    .line 1105
    .line 1106
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    check-cast v4, Landroid/widget/ImageView;

    .line 1111
    .line 1112
    iput-object v4, v8, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 1113
    .line 1114
    if-eqz v4, :cond_460

    .line 1115
    .line 1116
    iget-object v5, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1117
    .line 1118
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1119
    .line 1120
    .line 1121
    :cond_460
    sget v4, Lax/a2/A;->b:I

    .line 1122
    .line 1123
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1124
    .line 1125
    .line 1126
    move-result v4

    .line 1127
    int-to-float v4, v4

    .line 1128
    const/high16 v5, 0x42c80000    # 100.0f

    .line 1129
    .line 1130
    div-float/2addr v4, v5

    .line 1131
    iput v4, v8, Landroidx/media3/ui/d;->d0:F

    .line 1132
    .line 1133
    sget v4, Lax/a2/A;->a:I

    .line 1134
    .line 1135
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1136
    .line 1137
    .line 1138
    move-result v4

    .line 1139
    int-to-float v4, v4

    .line 1140
    div-float/2addr v4, v5

    .line 1141
    iput v4, v8, Landroidx/media3/ui/d;->e0:F

    .line 1142
    .line 1143
    sget v4, Lax/a2/z;->T:I

    .line 1144
    .line 1145
    invoke-virtual {v8, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v4

    .line 1149
    check-cast v4, Landroid/widget/ImageView;

    .line 1150
    .line 1151
    iput-object v4, v8, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 1152
    .line 1153
    if-eqz v4, :cond_48d

    .line 1154
    .line 1155
    invoke-static {v3, v2, v0}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1160
    .line 1161
    .line 1162
    const/4 v0, 0x0

    .line 1163
    invoke-direct {v8, v0, v4}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 1164
    .line 1165
    .line 1166
    :cond_48d
    new-instance v0, Landroidx/media3/ui/w;

    .line 1167
    .line 1168
    invoke-direct {v0, v8}, Landroidx/media3/ui/w;-><init>(Landroidx/media3/ui/d;)V

    .line 1169
    .line 1170
    .line 1171
    iput-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1172
    .line 1173
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->T(Z)V

    .line 1174
    .line 1175
    .line 1176
    sget v0, Lax/a2/D;->h:I

    .line 1177
    .line 1178
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    sget v1, Lax/a2/x;->p:I

    .line 1183
    .line 1184
    invoke-static {v3, v2, v1}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    sget v4, Lax/a2/D;->y:I

    .line 1189
    .line 1190
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v4

    .line 1194
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    sget v4, Lax/a2/x;->b:I

    .line 1199
    .line 1200
    invoke-static {v3, v2, v4}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v4

    .line 1204
    const/4 v5, 0x2

    .line 1205
    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    .line 1206
    .line 1207
    const/16 v23, 0x0

    .line 1208
    .line 1209
    aput-object v1, v5, v23

    .line 1210
    .line 1211
    aput-object v4, v5, p2

    .line 1212
    .line 1213
    new-instance v1, Landroidx/media3/ui/d$h;

    .line 1214
    .line 1215
    invoke-direct {v1, v8, v0, v5}, Landroidx/media3/ui/d$h;-><init>(Landroidx/media3/ui/d;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 1216
    .line 1217
    .line 1218
    iput-object v1, v8, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 1219
    .line 1220
    sget v0, Lax/a2/w;->a:I

    .line 1221
    .line 1222
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    iput v0, v8, Landroidx/media3/ui/d;->r:I

    .line 1227
    .line 1228
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    sget v4, Lax/a2/B;->d:I

    .line 1233
    .line 1234
    const/4 v7, 0x0

    .line 1235
    invoke-virtual {v0, v4, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1240
    .line 1241
    iput-object v0, v8, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 1242
    .line 1243
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 1244
    .line 1245
    .line 1246
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1247
    .line 1248
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v4

    .line 1252
    invoke-direct {v1, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 1256
    .line 1257
    .line 1258
    new-instance v1, Landroid/widget/PopupWindow;

    .line 1259
    .line 1260
    const/4 v4, -0x2

    .line 1261
    const/4 v5, 0x1

    .line 1262
    invoke-direct {v1, v0, v4, v4, v5}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1263
    .line 1264
    .line 1265
    iput-object v1, v8, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 1266
    .line 1267
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1268
    .line 1269
    const/16 v4, 0x17

    .line 1270
    .line 1271
    if-ge v0, v4, :cond_502

    .line 1272
    .line 1273
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 1274
    .line 1275
    const/4 v4, 0x0

    .line 1276
    invoke-direct {v0, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1280
    .line 1281
    .line 1282
    goto :goto_503

    .line 1283
    :cond_502
    const/4 v4, 0x0

    .line 1284
    :goto_503
    iget-object v0, v8, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 1285
    .line 1286
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1287
    .line 1288
    .line 1289
    const/4 v5, 0x1

    .line 1290
    iput-boolean v5, v8, Landroidx/media3/ui/d;->G0:Z

    .line 1291
    .line 1292
    new-instance v0, Lax/a2/f;

    .line 1293
    .line 1294
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    invoke-direct {v0, v1}, Lax/a2/f;-><init>(Landroid/content/res/Resources;)V

    .line 1299
    .line 1300
    .line 1301
    iput-object v0, v8, Landroidx/media3/ui/d;->p:Lax/a2/G;

    .line 1302
    .line 1303
    invoke-static {v3, v2, v9}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    iput-object v0, v8, Landroidx/media3/ui/d;->h0:Landroid/graphics/drawable/Drawable;

    .line 1308
    .line 1309
    invoke-static {v3, v2, v15}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    iput-object v0, v8, Landroidx/media3/ui/d;->i0:Landroid/graphics/drawable/Drawable;

    .line 1314
    .line 1315
    sget v0, Lax/a2/D;->b:I

    .line 1316
    .line 1317
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    iput-object v0, v8, Landroidx/media3/ui/d;->j0:Ljava/lang/String;

    .line 1322
    .line 1323
    sget v0, Lax/a2/D;->a:I

    .line 1324
    .line 1325
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    iput-object v0, v8, Landroidx/media3/ui/d;->k0:Ljava/lang/String;

    .line 1330
    .line 1331
    new-instance v0, Landroidx/media3/ui/d$j;

    .line 1332
    .line 1333
    const/4 v7, 0x0

    .line 1334
    invoke-direct {v0, v8, v7}, Landroidx/media3/ui/d$j;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 1335
    .line 1336
    .line 1337
    iput-object v0, v8, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 1338
    .line 1339
    new-instance v0, Landroidx/media3/ui/d$b;

    .line 1340
    .line 1341
    invoke-direct {v0, v8, v7}, Landroidx/media3/ui/d$b;-><init>(Landroidx/media3/ui/d;Landroidx/media3/ui/d$a;)V

    .line 1342
    .line 1343
    .line 1344
    iput-object v0, v8, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 1345
    .line 1346
    new-instance v0, Landroidx/media3/ui/d$e;

    .line 1347
    .line 1348
    iget-object v1, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1349
    .line 1350
    sget v2, Lax/a2/u;->a:I

    .line 1351
    .line 1352
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    sget-object v2, Landroidx/media3/ui/d;->H0:[F

    .line 1357
    .line 1358
    invoke-direct {v0, v8, v1, v2}, Landroidx/media3/ui/d$e;-><init>(Landroidx/media3/ui/d;[Ljava/lang/String;[F)V

    .line 1359
    .line 1360
    .line 1361
    iput-object v0, v8, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 1362
    .line 1363
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1364
    .line 1365
    move/from16 v5, v20

    .line 1366
    .line 1367
    invoke-static {v3, v0, v5}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    iput-object v0, v8, Landroidx/media3/ui/d;->Q:Landroid/graphics/drawable/Drawable;

    .line 1372
    .line 1373
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1374
    .line 1375
    move/from16 v7, v19

    .line 1376
    .line 1377
    invoke-static {v3, v0, v7}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    iput-object v0, v8, Landroidx/media3/ui/d;->R:Landroid/graphics/drawable/Drawable;

    .line 1382
    .line 1383
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1384
    .line 1385
    move/from16 v12, v18

    .line 1386
    .line 1387
    invoke-static {v3, v0, v12}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    iput-object v0, v8, Landroidx/media3/ui/d;->l0:Landroid/graphics/drawable/Drawable;

    .line 1392
    .line 1393
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1394
    .line 1395
    move/from16 v13, v17

    .line 1396
    .line 1397
    invoke-static {v3, v0, v13}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    iput-object v0, v8, Landroidx/media3/ui/d;->m0:Landroid/graphics/drawable/Drawable;

    .line 1402
    .line 1403
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1404
    .line 1405
    move/from16 v14, v16

    .line 1406
    .line 1407
    invoke-static {v3, v0, v14}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    iput-object v0, v8, Landroidx/media3/ui/d;->S:Landroid/graphics/drawable/Drawable;

    .line 1412
    .line 1413
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1414
    .line 1415
    move/from16 v15, v22

    .line 1416
    .line 1417
    invoke-static {v3, v0, v15}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    iput-object v0, v8, Landroidx/media3/ui/d;->T:Landroid/graphics/drawable/Drawable;

    .line 1422
    .line 1423
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1424
    .line 1425
    move/from16 v1, v31

    .line 1426
    .line 1427
    invoke-static {v3, v0, v1}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    iput-object v0, v8, Landroidx/media3/ui/d;->U:Landroid/graphics/drawable/Drawable;

    .line 1432
    .line 1433
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1434
    .line 1435
    move/from16 v1, v30

    .line 1436
    .line 1437
    invoke-static {v3, v0, v1}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    iput-object v0, v8, Landroidx/media3/ui/d;->b0:Landroid/graphics/drawable/Drawable;

    .line 1442
    .line 1443
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1444
    .line 1445
    move/from16 v1, v33

    .line 1446
    .line 1447
    invoke-static {v3, v0, v1}, Lax/S0/d0;->a0(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    iput-object v0, v8, Landroidx/media3/ui/d;->c0:Landroid/graphics/drawable/Drawable;

    .line 1452
    .line 1453
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1454
    .line 1455
    sget v1, Lax/a2/D;->d:I

    .line 1456
    .line 1457
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    iput-object v0, v8, Landroidx/media3/ui/d;->n0:Ljava/lang/String;

    .line 1462
    .line 1463
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1464
    .line 1465
    sget v1, Lax/a2/D;->c:I

    .line 1466
    .line 1467
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    iput-object v0, v8, Landroidx/media3/ui/d;->o0:Ljava/lang/String;

    .line 1472
    .line 1473
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1474
    .line 1475
    sget v1, Lax/a2/D;->j:I

    .line 1476
    .line 1477
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    iput-object v0, v8, Landroidx/media3/ui/d;->V:Ljava/lang/String;

    .line 1482
    .line 1483
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1484
    .line 1485
    sget v1, Lax/a2/D;->k:I

    .line 1486
    .line 1487
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    iput-object v0, v8, Landroidx/media3/ui/d;->W:Ljava/lang/String;

    .line 1492
    .line 1493
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1494
    .line 1495
    sget v1, Lax/a2/D;->i:I

    .line 1496
    .line 1497
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    iput-object v0, v8, Landroidx/media3/ui/d;->a0:Ljava/lang/String;

    .line 1502
    .line 1503
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1504
    .line 1505
    sget v1, Lax/a2/D;->n:I

    .line 1506
    .line 1507
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    iput-object v0, v8, Landroidx/media3/ui/d;->f0:Ljava/lang/String;

    .line 1512
    .line 1513
    iget-object v0, v8, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 1514
    .line 1515
    sget v1, Lax/a2/D;->m:I

    .line 1516
    .line 1517
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    iput-object v0, v8, Landroidx/media3/ui/d;->g0:Ljava/lang/String;

    .line 1522
    .line 1523
    sget v0, Lax/a2/z;->e:I

    .line 1524
    .line 1525
    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    check-cast v0, Landroid/view/ViewGroup;

    .line 1530
    .line 1531
    iget-object v1, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1532
    .line 1533
    const/4 v5, 0x1

    .line 1534
    invoke-virtual {v1, v0, v5}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1535
    .line 1536
    .line 1537
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1538
    .line 1539
    iget-object v1, v8, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 1540
    .line 1541
    move/from16 v2, v29

    .line 1542
    .line 1543
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1544
    .line 1545
    .line 1546
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1547
    .line 1548
    iget-object v1, v8, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 1549
    .line 1550
    move/from16 v2, v28

    .line 1551
    .line 1552
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1553
    .line 1554
    .line 1555
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1556
    .line 1557
    iget-object v1, v8, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 1558
    .line 1559
    move/from16 v2, v27

    .line 1560
    .line 1561
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1562
    .line 1563
    .line 1564
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1565
    .line 1566
    iget-object v1, v8, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 1567
    .line 1568
    move/from16 v2, v26

    .line 1569
    .line 1570
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1571
    .line 1572
    .line 1573
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1574
    .line 1575
    iget-object v1, v8, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 1576
    .line 1577
    move/from16 v2, v25

    .line 1578
    .line 1579
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1580
    .line 1581
    .line 1582
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1583
    .line 1584
    iget-object v1, v8, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 1585
    .line 1586
    move/from16 v2, v24

    .line 1587
    .line 1588
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1589
    .line 1590
    .line 1591
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1592
    .line 1593
    iget-object v1, v8, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 1594
    .line 1595
    move/from16 v2, v21

    .line 1596
    .line 1597
    invoke-virtual {v0, v1, v2}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1598
    .line 1599
    .line 1600
    iget-object v0, v8, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 1601
    .line 1602
    iget-object v1, v8, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 1603
    .line 1604
    iget v2, v8, Landroidx/media3/ui/d;->A0:I

    .line 1605
    .line 1606
    if-eqz v2, :cond_649

    .line 1607
    .line 1608
    const/4 v3, 0x1

    .line 1609
    goto :goto_64a

    .line 1610
    :cond_649
    const/4 v3, 0x0

    .line 1611
    :goto_64a
    invoke-virtual {v0, v1, v3}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 1612
    .line 1613
    .line 1614
    new-instance v0, Lax/a2/i;

    .line 1615
    .line 1616
    invoke-direct {v0, v8}, Lax/a2/i;-><init>(Landroidx/media3/ui/d;)V

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v8, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1620
    .line 1621
    .line 1622
    return-void
.end method

.method static synthetic A(Landroidx/media3/ui/d;)I
    .registers 1

    .line 1
    iget p0, p0, Landroidx/media3/ui/d;->A0:I

    .line 2
    .line 3
    return p0
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

.method private static A0(Landroid/view/View;Z)V
    .registers 2

    .line 1
    if-nez p0, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    if-eqz p1, :cond_a

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    const/16 p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

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

.method static synthetic B(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

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

.method static synthetic C(Landroidx/media3/ui/d;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

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

.method private C0()V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_69

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_69

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 13
    .line 14
    if-eqz v0, :cond_3f

    .line 15
    .line 16
    iget-boolean v1, p0, Landroidx/media3/ui/d;->t0:Z

    .line 17
    .line 18
    if-eqz v1, :cond_22

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->Z(Lax/P0/H;Lax/P0/N$c;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_22

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_27

    .line 35
    :cond_22
    const/4 v1, 0x5

    .line 36
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :goto_27
    const/4 v2, 0x7

    .line 41
    invoke-interface {v0, v2}, Lax/P0/H;->c0(I)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/16 v3, 0xb

    .line 46
    .line 47
    invoke-interface {v0, v3}, Lax/P0/H;->c0(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/16 v4, 0xc

    .line 52
    .line 53
    invoke-interface {v0, v4}, Lax/P0/H;->c0(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v5, 0x9

    .line 58
    .line 59
    invoke-interface {v0, v5}, Lax/P0/H;->c0(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    goto :goto_44

    .line 64
    :cond_3f
    const/4 v1, 0x0

    .line 65
    const/4 v0, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    :goto_44
    if-eqz v3, :cond_49

    .line 70
    .line 71
    invoke-direct {p0}, Landroidx/media3/ui/d;->H0()V

    .line 72
    .line 73
    .line 74
    :cond_49
    if-eqz v4, :cond_4e

    .line 75
    .line 76
    invoke-direct {p0}, Landroidx/media3/ui/d;->y0()V

    .line 77
    .line 78
    .line 79
    :cond_4e
    iget-object v5, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-direct {p0, v2, v5}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 85
    .line 86
    invoke-direct {p0, v3, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 90
    .line 91
    invoke-direct {p0, v4, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 95
    .line 96
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 100
    .line 101
    if-eqz v0, :cond_69

    .line 102
    .line 103
    invoke-interface {v0, v1}, Landroidx/media3/ui/G;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    :cond_69
    :goto_69
    return-void
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

.method static synthetic D(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$h;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

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

.method private D0()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_40

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_40

    .line 12
    :cond_b
    iget-object v0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz v0, :cond_40

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 17
    .line 18
    iget-boolean v1, p0, Landroidx/media3/ui/d;->u0:Z

    .line 19
    .line 20
    invoke-static {v0, v1}, Lax/S0/d0;->w1(Lax/P0/H;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1c

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/ui/d;->Q:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    goto :goto_1e

    .line 29
    :cond_1c
    iget-object v1, p0, Landroidx/media3/ui/d;->R:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_1e
    if-eqz v0, :cond_23

    .line 32
    .line 33
    sget v0, Lax/a2/D;->g:I

    .line 34
    .line 35
    goto :goto_25

    .line 36
    :cond_23
    sget v0, Lax/a2/D;->f:I

    .line 37
    .line 38
    :goto_25
    iget-object v2, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 55
    .line 56
    invoke-static {v0}, Lax/S0/d0;->u1(Lax/P0/H;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 63
    .line 64
    .line 65
    :cond_40
    :goto_40
    return-void
    .line 66
    .line 67
    .line 68
.end method

.method static synthetic E(Landroidx/media3/ui/d;Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

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

.method private E0()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 7
    .line 8
    invoke-interface {v0}, Lax/P0/H;->h()Lax/P0/G;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Lax/P0/G;->a:F

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroidx/media3/ui/d$e;->R(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/media3/ui/d$e;->O()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v2, v1}, Landroidx/media3/ui/d$h;->Q(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/media3/ui/d;->I0()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method static synthetic F(Landroidx/media3/ui/d;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->G:Landroid/view/View;

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

.method private F0()V
    .registers 14

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_a1

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 8
    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    goto/16 :goto_a1

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 14
    .line 15
    if-eqz v0, :cond_27

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_27

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/media3/ui/d;->F0:J

    .line 26
    .line 27
    invoke-interface {v0}, Lax/P0/H;->V()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    add-long/2addr v1, v3

    .line 32
    iget-wide v3, p0, Landroidx/media3/ui/d;->F0:J

    .line 33
    .line 34
    invoke-interface {v0}, Lax/P0/H;->l0()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    add-long/2addr v3, v5

    .line 39
    goto :goto_2a

    .line 40
    :cond_27
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    move-wide v3, v1

    .line 43
    :goto_2a
    iget-object v5, p0, Landroidx/media3/ui/d;->J:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v5, :cond_3d

    .line 46
    .line 47
    iget-boolean v6, p0, Landroidx/media3/ui/d;->w0:Z

    .line 48
    .line 49
    if-nez v6, :cond_3d

    .line 50
    .line 51
    iget-object v6, p0, Landroidx/media3/ui/d;->L:Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v7, p0, Landroidx/media3/ui/d;->M:Ljava/util/Formatter;

    .line 54
    .line 55
    invoke-static {v6, v7, v1, v2}, Lax/S0/d0;->q0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    iget-object v5, p0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 63
    .line 64
    if-eqz v5, :cond_50

    .line 65
    .line 66
    invoke-interface {v5, v1, v2}, Landroidx/media3/ui/G;->setPosition(J)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 70
    .line 71
    invoke-direct {p0, v0}, Landroidx/media3/ui/d;->m0(Lax/P0/H;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_4d

    .line 76
    .line 77
    move-wide v3, v1

    .line 78
    :cond_4d
    invoke-interface {v5, v3, v4}, Landroidx/media3/ui/G;->setBufferedPosition(J)V

    .line 79
    .line 80
    .line 81
    :cond_50
    iget-object v3, p0, Landroidx/media3/ui/d;->P:Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    if-nez v0, :cond_5a

    .line 88
    .line 89
    const/4 v4, 0x1

    .line 90
    goto :goto_5e

    .line 91
    :cond_5a
    invoke-interface {v0}, Lax/P0/H;->i()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    :goto_5e
    const-wide/16 v5, 0x3e8

    .line 96
    .line 97
    if-eqz v0, :cond_97

    .line 98
    .line 99
    invoke-interface {v0}, Lax/P0/H;->n()Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_97

    .line 104
    .line 105
    iget-object v3, p0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 106
    .line 107
    if-eqz v3, :cond_71

    .line 108
    .line 109
    invoke-interface {v3}, Landroidx/media3/ui/G;->getPreferredUpdateDelay()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    goto :goto_72

    .line 114
    :cond_71
    move-wide v3, v5

    .line 115
    :goto_72
    rem-long/2addr v1, v5

    .line 116
    sub-long v1, v5, v1

    .line 117
    .line 118
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-interface {v0}, Lax/P0/H;->h()Lax/P0/G;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget v0, v0, Lax/P0/G;->a:F

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    cmpl-float v3, v0, v3

    .line 130
    .line 131
    if-lez v3, :cond_87

    .line 132
    .line 133
    long-to-float v1, v1

    .line 134
    div-float/2addr v1, v0

    .line 135
    float-to-long v5, v1

    .line 136
    :cond_87
    move-wide v7, v5

    .line 137
    iget v0, p0, Landroidx/media3/ui/d;->z0:I

    .line 138
    .line 139
    int-to-long v9, v0

    .line 140
    const-wide/16 v11, 0x3e8

    .line 141
    .line 142
    invoke-static/range {v7 .. v12}, Lax/S0/d0;->q(JJJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    iget-object v2, p0, Landroidx/media3/ui/d;->P:Ljava/lang/Runnable;

    .line 147
    .line 148
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_97
    const/4 v0, 0x4

    .line 153
    if-eq v4, v0, :cond_a1

    .line 154
    .line 155
    if-eq v4, v3, :cond_a1

    .line 156
    .line 157
    iget-object v0, p0, Landroidx/media3/ui/d;->P:Ljava/lang/Runnable;

    .line 158
    .line 159
    invoke-virtual {p0, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 160
    .line 161
    .line 162
    :cond_a1
    :goto_a1
    return-void
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

.method static synthetic G(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$e;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

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

.method private G0()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_77

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_77

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_77

    .line 16
    :cond_f
    iget v1, p0, Landroidx/media3/ui/d;->A0:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_18

    .line 20
    .line 21
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 26
    .line 27
    if-eqz v0, :cond_64

    .line 28
    .line 29
    const/16 v1, 0xf

    .line 30
    .line 31
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_25

    .line 36
    .line 37
    goto :goto_64

    .line 38
    :cond_25
    iget-object v1, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {p0, v2, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lax/P0/H;->o()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_55

    .line 49
    .line 50
    if-eq v0, v2, :cond_46

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    if-eq v0, v1, :cond_37

    .line 54
    .line 55
    goto :goto_77

    .line 56
    :cond_37
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/media3/ui/d;->U:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/media3/ui/d;->a0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_46
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/media3/ui/d;->T:Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/media3/ui/d;->W:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/media3/ui/d;->S:Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/media3/ui/d;->V:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_64
    :goto_64
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 102
    .line 103
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 107
    .line 108
    iget-object v1, p0, Landroidx/media3/ui/d;->S:Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 114
    .line 115
    iget-object v1, p0, Landroidx/media3/ui/d;->V:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    :goto_77
    return-void
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

.method static synthetic H(Landroidx/media3/ui/d;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->H:Landroid/view/View;

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

.method private H0()V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/P0/H;->t0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const-wide/16 v0, 0x1388

    .line 11
    .line 12
    :goto_b
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    long-to-int v1, v0

    .line 16
    iget-object v0, p0, Landroidx/media3/ui/d;->y:Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_33

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 32
    .line 33
    sget v3, Lax/a2/C;->b:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x1

    .line 40
    new-array v5, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    aput-object v4, v5, v6

    .line 44
    .line 45
    invoke-virtual {v2, v3, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    return-void
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

.method static synthetic I(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

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

.method private I0()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->l:Landroidx/media3/ui/d$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d$h;->N()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method static synthetic J(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$b;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

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

.method private J0()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 12
    .line 13
    mul-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 36
    .line 37
    mul-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    sub-int/2addr v0, v1

    .line 40
    iget-object v1, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method static synthetic K(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

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

.method private K0()V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/d;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_65

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_65

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_65

    .line 16
    :cond_f
    iget-object v1, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_20

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    if-eqz v1, :cond_52

    .line 34
    .line 35
    const/16 v0, 0xe

    .line 36
    .line 37
    invoke-interface {v1, v0}, Lax/P0/H;->c0(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_52

    .line 44
    :cond_2b
    const/4 v0, 0x1

    .line 45
    iget-object v2, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-interface {v1}, Lax/P0/H;->j0()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3c

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/ui/d;->b0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    iget-object v2, p0, Landroidx/media3/ui/d;->c0:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    :goto_3e
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-interface {v1}, Lax/P0/H;->j0()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4c

    .line 73
    .line 74
    iget-object v1, p0, Landroidx/media3/ui/d;->f0:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_4e

    .line 77
    :cond_4c
    iget-object v1, p0, Landroidx/media3/ui/d;->g0:Ljava/lang/String;

    .line 78
    .line 79
    :goto_4e
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_52
    :goto_52
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 84
    .line 85
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/media3/ui/d;->c0:Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/media3/ui/d;->g0:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_65
    :goto_65
    return-void
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

.method static synthetic L(Landroidx/media3/ui/d;)Landroidx/media3/ui/d$j;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

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

.method private L0()V
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 4
    .line 5
    if-nez v1, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    iget-boolean v2, v0, Landroidx/media3/ui/d;->t0:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v2, :cond_17

    .line 13
    .line 14
    iget-object v2, v0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 15
    .line 16
    invoke-static {v1, v2}, Landroidx/media3/ui/d;->Z(Lax/P0/H;Lax/P0/N$c;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_17

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v2, 0x0

    .line 25
    :goto_18
    iput-boolean v2, v0, Landroidx/media3/ui/d;->v0:Z

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    iput-wide v5, v0, Landroidx/media3/ui/d;->F0:J

    .line 30
    .line 31
    const/16 v2, 0x11

    .line 32
    .line 33
    invoke-interface {v1, v2}, Lax/P0/H;->c0(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2b

    .line 38
    .line 39
    invoke-interface {v1}, Lax/P0/H;->h0()Lax/P0/N;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_2d

    .line 44
    :cond_2b
    sget-object v2, Lax/P0/N;->a:Lax/P0/N;

    .line 45
    .line 46
    :goto_2d
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-nez v7, :cond_fc

    .line 56
    .line 57
    invoke-interface {v1}, Lax/P0/H;->b0()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-boolean v7, v0, Landroidx/media3/ui/d;->v0:Z

    .line 62
    .line 63
    if-eqz v7, :cond_42

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    goto :goto_43

    .line 67
    :cond_42
    move v10, v1

    .line 68
    :goto_43
    if-eqz v7, :cond_4b

    .line 69
    .line 70
    invoke-virtual {v2}, Lax/P0/N;->p()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    sub-int/2addr v7, v4

    .line 75
    goto :goto_4c

    .line 76
    :cond_4b
    move v7, v1

    .line 77
    :goto_4c
    move-wide v11, v5

    .line 78
    const/4 v13, 0x0

    .line 79
    :goto_4e
    if-gt v10, v7, :cond_fa

    .line 80
    .line 81
    if-ne v10, v1, :cond_58

    .line 82
    .line 83
    invoke-static {v11, v12}, Lax/S0/d0;->E1(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v14

    .line 87
    iput-wide v14, v0, Landroidx/media3/ui/d;->F0:J

    .line 88
    .line 89
    :cond_58
    iget-object v14, v0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 90
    .line 91
    invoke-virtual {v2, v10, v14}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 92
    .line 93
    .line 94
    iget-object v14, v0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 95
    .line 96
    move-wide/from16 v16, v5

    .line 97
    .line 98
    const/4 v15, 0x1

    .line 99
    iget-wide v4, v14, Lax/P0/N$c;->m:J

    .line 100
    .line 101
    cmp-long v6, v4, v8

    .line 102
    .line 103
    if-nez v6, :cond_70

    .line 104
    .line 105
    iget-boolean v1, v0, Landroidx/media3/ui/d;->v0:Z

    .line 106
    .line 107
    xor-int/2addr v1, v15

    .line 108
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_fa

    .line 112
    .line 113
    :cond_70
    iget v4, v14, Lax/P0/N$c;->n:I

    .line 114
    .line 115
    :goto_72
    iget-object v5, v0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 116
    .line 117
    iget v6, v5, Lax/P0/N$c;->o:I

    .line 118
    .line 119
    if-gt v4, v6, :cond_ee

    .line 120
    .line 121
    iget-object v5, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 122
    .line 123
    invoke-virtual {v2, v4, v5}, Lax/P0/N;->f(ILax/P0/N$b;)Lax/P0/N$b;

    .line 124
    .line 125
    .line 126
    iget-object v5, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 127
    .line 128
    invoke-virtual {v5}, Lax/P0/N$b;->p()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget-object v6, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 133
    .line 134
    invoke-virtual {v6}, Lax/P0/N$b;->c()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    :goto_89
    if-ge v5, v6, :cond_e9

    .line 139
    .line 140
    iget-object v14, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 141
    .line 142
    invoke-virtual {v14, v5}, Lax/P0/N$b;->f(I)J

    .line 143
    .line 144
    .line 145
    move-result-wide v18

    .line 146
    const-wide/high16 v20, -0x8000000000000000L

    .line 147
    .line 148
    cmp-long v14, v18, v20

    .line 149
    .line 150
    if-nez v14, :cond_a5

    .line 151
    .line 152
    iget-object v14, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 153
    .line 154
    move-wide/from16 v20, v8

    .line 155
    .line 156
    iget-wide v8, v14, Lax/P0/N$b;->d:J

    .line 157
    .line 158
    cmp-long v14, v8, v20

    .line 159
    .line 160
    if-nez v14, :cond_a2

    .line 161
    .line 162
    goto :goto_e4

    .line 163
    :cond_a2
    move-wide/from16 v18, v8

    .line 164
    .line 165
    goto :goto_a7

    .line 166
    :cond_a5
    move-wide/from16 v20, v8

    .line 167
    .line 168
    :goto_a7
    iget-object v8, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 169
    .line 170
    invoke-virtual {v8}, Lax/P0/N$b;->o()J

    .line 171
    .line 172
    .line 173
    move-result-wide v8

    .line 174
    add-long v18, v18, v8

    .line 175
    .line 176
    cmp-long v8, v18, v16

    .line 177
    .line 178
    if-ltz v8, :cond_e4

    .line 179
    .line 180
    iget-object v8, v0, Landroidx/media3/ui/d;->B0:[J

    .line 181
    .line 182
    array-length v9, v8

    .line 183
    if-ne v13, v9, :cond_ce

    .line 184
    .line 185
    array-length v9, v8

    .line 186
    if-nez v9, :cond_bd

    .line 187
    .line 188
    const/4 v9, 0x1

    .line 189
    goto :goto_c0

    .line 190
    :cond_bd
    array-length v9, v8

    .line 191
    mul-int/lit8 v9, v9, 0x2

    .line 192
    .line 193
    :goto_c0
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    iput-object v8, v0, Landroidx/media3/ui/d;->B0:[J

    .line 198
    .line 199
    iget-object v8, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 200
    .line 201
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    iput-object v8, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 206
    .line 207
    :cond_ce
    iget-object v8, v0, Landroidx/media3/ui/d;->B0:[J

    .line 208
    .line 209
    add-long v18, v11, v18

    .line 210
    .line 211
    invoke-static/range {v18 .. v19}, Lax/S0/d0;->E1(J)J

    .line 212
    .line 213
    .line 214
    move-result-wide v18

    .line 215
    aput-wide v18, v8, v13

    .line 216
    .line 217
    iget-object v8, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 218
    .line 219
    iget-object v9, v0, Landroidx/media3/ui/d;->N:Lax/P0/N$b;

    .line 220
    .line 221
    invoke-virtual {v9, v5}, Lax/P0/N$b;->q(I)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    aput-boolean v9, v8, v13

    .line 226
    .line 227
    add-int/lit8 v13, v13, 0x1

    .line 228
    .line 229
    :cond_e4
    :goto_e4
    add-int/lit8 v5, v5, 0x1

    .line 230
    .line 231
    move-wide/from16 v8, v20

    .line 232
    .line 233
    goto :goto_89

    .line 234
    :cond_e9
    move-wide/from16 v20, v8

    .line 235
    .line 236
    add-int/lit8 v4, v4, 0x1

    .line 237
    .line 238
    goto :goto_72

    .line 239
    :cond_ee
    move-wide/from16 v20, v8

    .line 240
    .line 241
    iget-wide v4, v5, Lax/P0/N$c;->m:J

    .line 242
    .line 243
    add-long/2addr v11, v4

    .line 244
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    move-wide/from16 v5, v16

    .line 247
    .line 248
    const/4 v4, 0x1

    .line 249
    goto/16 :goto_4e

    .line 250
    .line 251
    :cond_fa
    :goto_fa
    move-wide v5, v11

    .line 252
    goto :goto_119

    .line 253
    :cond_fc
    move-wide/from16 v16, v5

    .line 254
    .line 255
    move-wide/from16 v20, v8

    .line 256
    .line 257
    const/16 v2, 0x10

    .line 258
    .line 259
    invoke-interface {v1, v2}, Lax/P0/H;->c0(I)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_116

    .line 264
    .line 265
    invoke-interface {v1}, Lax/P0/H;->C()J

    .line 266
    .line 267
    .line 268
    move-result-wide v1

    .line 269
    cmp-long v4, v1, v20

    .line 270
    .line 271
    if-eqz v4, :cond_116

    .line 272
    .line 273
    invoke-static {v1, v2}, Lax/S0/d0;->a1(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    :goto_114
    const/4 v13, 0x0

    .line 278
    goto :goto_119

    .line 279
    :cond_116
    move-wide/from16 v5, v16

    .line 280
    .line 281
    goto :goto_114

    .line 282
    :goto_119
    invoke-static {v5, v6}, Lax/S0/d0;->E1(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v1

    .line 286
    iget-object v4, v0, Landroidx/media3/ui/d;->I:Landroid/widget/TextView;

    .line 287
    .line 288
    if-eqz v4, :cond_12c

    .line 289
    .line 290
    iget-object v5, v0, Landroidx/media3/ui/d;->L:Ljava/lang/StringBuilder;

    .line 291
    .line 292
    iget-object v6, v0, Landroidx/media3/ui/d;->M:Ljava/util/Formatter;

    .line 293
    .line 294
    invoke-static {v5, v6, v1, v2}, Lax/S0/d0;->q0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    :cond_12c
    iget-object v4, v0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 302
    .line 303
    if-eqz v4, :cond_162

    .line 304
    .line 305
    invoke-interface {v4, v1, v2}, Landroidx/media3/ui/G;->setDuration(J)V

    .line 306
    .line 307
    .line 308
    iget-object v1, v0, Landroidx/media3/ui/d;->D0:[J

    .line 309
    .line 310
    array-length v1, v1

    .line 311
    add-int v2, v13, v1

    .line 312
    .line 313
    iget-object v4, v0, Landroidx/media3/ui/d;->B0:[J

    .line 314
    .line 315
    array-length v5, v4

    .line 316
    if-le v2, v5, :cond_14b

    .line 317
    .line 318
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iput-object v4, v0, Landroidx/media3/ui/d;->B0:[J

    .line 323
    .line 324
    iget-object v4, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 325
    .line 326
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    iput-object v4, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 331
    .line 332
    :cond_14b
    iget-object v4, v0, Landroidx/media3/ui/d;->D0:[J

    .line 333
    .line 334
    iget-object v5, v0, Landroidx/media3/ui/d;->B0:[J

    .line 335
    .line 336
    invoke-static {v4, v3, v5, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 337
    .line 338
    .line 339
    iget-object v4, v0, Landroidx/media3/ui/d;->E0:[Z

    .line 340
    .line 341
    iget-object v5, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 342
    .line 343
    invoke-static {v4, v3, v5, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 344
    .line 345
    .line 346
    iget-object v1, v0, Landroidx/media3/ui/d;->K:Landroidx/media3/ui/G;

    .line 347
    .line 348
    iget-object v3, v0, Landroidx/media3/ui/d;->B0:[J

    .line 349
    .line 350
    iget-object v4, v0, Landroidx/media3/ui/d;->C0:[Z

    .line 351
    .line 352
    invoke-interface {v1, v3, v4, v2}, Landroidx/media3/ui/G;->b([J[ZI)V

    .line 353
    .line 354
    .line 355
    :cond_162
    invoke-direct {v0}, Landroidx/media3/ui/d;->F0()V

    .line 356
    .line 357
    .line 358
    return-void
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
.end method

.method static synthetic M(Landroidx/media3/ui/d;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->r0(I)V

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

.method private M0()V
    .registers 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->l()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    :goto_e
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/ui/d;->I0()V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method static synthetic N(Landroidx/media3/ui/d;F)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->setPlaybackSpeed(F)V

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

.method static synthetic O(Landroidx/media3/ui/d;)Landroid/widget/PopupWindow;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

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

.method static synthetic P(Landroidx/media3/ui/d;)Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->h0:Landroid/graphics/drawable/Drawable;

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

.method static synthetic Q(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

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

.method static synthetic R(Landroidx/media3/ui/d;)Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->i0:Landroid/graphics/drawable/Drawable;

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

.method static synthetic S(Landroidx/media3/ui/d;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->j0:Ljava/lang/String;

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

.method static synthetic T(Landroidx/media3/ui/d;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->k0:Ljava/lang/String;

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

.method static synthetic U(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

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

.method static synthetic V(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

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

.method static synthetic W(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

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

.method static synthetic X(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->E0()V

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

.method private static Z(Lax/P0/H;Lax/P0/N$c;)Z
    .registers 11

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lax/P0/H;->c0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    invoke-interface {p0}, Lax/P0/H;->h0()Lax/P0/N;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lax/P0/N;->p()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-le v0, v2, :cond_31

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    if-le v0, v3, :cond_1a

    .line 25
    .line 26
    goto :goto_31

    .line 27
    :cond_1a
    const/4 v3, 0x0

    .line 28
    :goto_1b
    if-ge v3, v0, :cond_30

    .line 29
    .line 30
    invoke-virtual {p0, v3, p1}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-wide v4, v4, Lax/P0/N$c;->m:J

    .line 35
    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v8, v4, v6

    .line 42
    .line 43
    if-nez v8, :cond_2d

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2d
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1b

    .line 49
    :cond_30
    return v2

    .line 50
    :cond_31
    :goto_31
    return v1
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

.method public static synthetic a(Landroidx/media3/ui/d;Landroid/view/View;IIIIIIII)V
    .registers 10

    .line 1
    invoke-direct/range {p0 .. p9}, Landroidx/media3/ui/d;->q0(Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic b(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

    return-void
.end method

.method private b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/media3/ui/d;->J0()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Landroidx/media3/ui/d;->G0:Z

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Landroidx/media3/ui/d;->G0:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sub-int/2addr p1, v0

    .line 31
    iget v0, p0, Landroidx/media3/ui/d;->r:I

    .line 32
    .line 33
    sub-int/2addr p1, v0

    .line 34
    iget-object v0, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    neg-int v0, v0

    .line 41
    iget v1, p0, Landroidx/media3/ui/d;->r:I

    .line 42
    .line 43
    sub-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 45
    .line 46
    invoke-virtual {v1, p2, p1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public static synthetic c(Landroidx/media3/ui/d;Landroid/view/View;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->p0(Landroid/view/View;)V

    return-void
.end method

.method private c0(Lax/P0/V;I)Lax/r7/z;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P0/V;",
            "I)",
            "Lax/r7/z<",
            "Landroidx/media3/ui/d$k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/r7/z$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/r7/z$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/P0/V;->a()Lax/r7/z;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ge v3, v4, :cond_49

    .line 17
    .line 18
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lax/P0/V$a;

    .line 23
    .line 24
    invoke-virtual {v4}, Lax/P0/V$a;->d()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eq v5, p2, :cond_1e

    .line 29
    .line 30
    goto :goto_46

    .line 31
    :cond_1e
    const/4 v5, 0x0

    .line 32
    :goto_1f
    iget v6, v4, Lax/P0/V$a;->a:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_46

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Lax/P0/V$a;->j(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_2a

    .line 41
    .line 42
    goto :goto_43

    .line 43
    :cond_2a
    invoke-virtual {v4, v5}, Lax/P0/V$a;->b(I)Lax/P0/v;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget v7, v6, Lax/P0/v;->e:I

    .line 48
    .line 49
    and-int/lit8 v7, v7, 0x2

    .line 50
    .line 51
    if-eqz v7, :cond_35

    .line 52
    .line 53
    goto :goto_43

    .line 54
    :cond_35
    iget-object v7, p0, Landroidx/media3/ui/d;->p:Lax/a2/G;

    .line 55
    .line 56
    invoke-interface {v7, v6}, Lax/a2/G;->a(Lax/P0/v;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v7, Landroidx/media3/ui/d$k;

    .line 61
    .line 62
    invoke-direct {v7, p1, v3, v5, v6}, Landroidx/media3/ui/d$k;-><init>(Lax/P0/V;IILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v7}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 66
    .line 67
    .line 68
    :goto_43
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1f

    .line 71
    :cond_46
    :goto_46
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_b

    .line 74
    :cond_49
    invoke-virtual {v0}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
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

.method static synthetic d(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->M0()V

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

.method private static d0(Landroid/content/res/TypedArray;I)I
    .registers 3

    .line 1
    sget v0, Lax/a2/F;->L:I

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method static synthetic e(Landroidx/media3/ui/d;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->w0:Z

    .line 2
    .line 3
    return p1
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
.end method

.method static synthetic f(Landroidx/media3/ui/d;)Landroid/widget/TextView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->J:Landroid/widget/TextView;

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

.method static synthetic g(Landroidx/media3/ui/d;)Ljava/lang/StringBuilder;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->L:Ljava/lang/StringBuilder;

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

.method private g0()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->O()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/ui/d$l;->O()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 12
    .line 13
    if-eqz v0, :cond_4f

    .line 14
    .line 15
    const/16 v1, 0x1e

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_4f

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 24
    .line 25
    const/16 v1, 0x1d

    .line 26
    .line 27
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_21

    .line 32
    .line 33
    goto :goto_4f

    .line 34
    :cond_21
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 35
    .line 36
    invoke-interface {v0}, Lax/P0/H;->X()Lax/P0/V;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->c0(Lax/P0/V;I)Lax/r7/z;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Landroidx/media3/ui/d$b;->V(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_46

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/d;->c0(Lax/P0/V;I)Lax/r7/z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Landroidx/media3/ui/d$j;->U(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_46
    iget-object v0, p0, Landroidx/media3/ui/d;->n:Landroidx/media3/ui/d$j;

    .line 72
    .line 73
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Landroidx/media3/ui/d$j;->U(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    :cond_4f
    :goto_4f
    return-void
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
.end method

.method static synthetic h(Landroidx/media3/ui/d;)Ljava/util/Formatter;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->M:Ljava/util/Formatter;

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

.method private static h0(Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .registers 3

    .line 1
    if-nez p0, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method static synthetic i(Landroidx/media3/ui/d;)Landroidx/media3/ui/w;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

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

.method private i0(Lax/P0/H;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_12

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->g:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method static synthetic j(Landroidx/media3/ui/d;)Lax/P0/H;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

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

.method private j0(Lax/P0/H;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_12

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->d:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
.end method

.method static synthetic k(Landroidx/media3/ui/d;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->y0:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic l(Landroidx/media3/ui/d;Lax/P0/H;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->j0(Lax/P0/H;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private static l0(I)Z
    .registers 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 1
    const/16 v0, 0x5a

    if-eq p0, v0, :cond_23

    const/16 v0, 0x59

    if-eq p0, v0, :cond_23

    const/16 v0, 0x55

    if-eq p0, v0, :cond_23

    const/16 v0, 0x4f

    if-eq p0, v0, :cond_23

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_23

    const/16 v0, 0x7f

    if-eq p0, v0, :cond_23

    const/16 v0, 0x57

    if-eq p0, v0, :cond_23

    const/16 v0, 0x58

    if-ne p0, v0, :cond_21

    goto :goto_23

    :cond_21
    const/4 p0, 0x0

    return p0

    :cond_23
    :goto_23
    const/4 p0, 0x1

    return p0
.end method

.method static synthetic m(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->e:Ljava/lang/reflect/Method;

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

.method private m0(Lax/P0/H;)Z
    .registers 4

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->j0(Lax/P0/H;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_24

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d;->f:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/reflect/Method;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_42

    .line 31
    .line 32
    goto :goto_24

    .line 33
    :catch_20
    move-exception p1

    .line 34
    goto :goto_46

    .line 35
    :catch_22
    move-exception p1

    .line 36
    goto :goto_46

    .line 37
    :cond_24
    :goto_24
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->i0(Lax/P0/H;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_44

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/ui/d;->i:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p1
    :try_end_40
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_40} :catch_22
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_40} :catch_20

    .line 65
    if-eqz p1, :cond_44

    .line 66
    .line 67
    :cond_42
    const/4 p1, 0x1

    .line 68
    return p1

    .line 69
    :cond_44
    const/4 p1, 0x0

    .line 70
    return p1

    .line 71
    :goto_46
    new-instance v0, Ljava/lang/RuntimeException;

    .line 72
    .line 73
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v0
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

.method static synthetic n(Landroidx/media3/ui/d;Lax/P0/H;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->i0(Lax/P0/H;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic o(Landroidx/media3/ui/d;)Ljava/lang/reflect/Method;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->h:Ljava/lang/reflect/Method;

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

.method static synthetic p(Landroidx/media3/ui/d;Lax/P0/H;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/d;->m0(Lax/P0/H;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private p0(Landroid/view/View;)V
    .registers 2

    .line 1
    iget-boolean p1, p0, Landroidx/media3/ui/d;->r0:Z

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/media3/ui/d;->B0(Z)V

    .line 6
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
    .line 22
.end method

.method static synthetic q(Landroidx/media3/ui/d;Lax/P0/H;J)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/ui/d;->u0(Lax/P0/H;J)V

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

.method private q0(Landroid/view/View;IIIIIIII)V
    .registers 10

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    sub-int/2addr p8, p6

    .line 4
    sub-int/2addr p9, p7

    .line 5
    if-ne p4, p8, :cond_8

    .line 6
    .line 7
    if-eq p5, p9, :cond_35

    .line 8
    .line 9
    :cond_8
    iget-object p2, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_35

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/ui/d;->J0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object p3, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/widget/PopupWindow;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    sub-int/2addr p2, p3

    .line 31
    iget p3, p0, Landroidx/media3/ui/d;->r:I

    .line 32
    .line 33
    sub-int p6, p2, p3

    .line 34
    .line 35
    iget-object p2, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    neg-int p2, p2

    .line 42
    iget p3, p0, Landroidx/media3/ui/d;->r:I

    .line 43
    .line 44
    sub-int p7, p2, p3

    .line 45
    .line 46
    iget-object p4, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 47
    .line 48
    const/4 p8, -0x1

    .line 49
    const/4 p9, -0x1

    .line 50
    move-object p5, p1

    .line 51
    invoke-virtual/range {p4 .. p9}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 52
    .line 53
    .line 54
    :cond_35
    return-void
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
.end method

.method static synthetic r(Landroidx/media3/ui/d;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->G0:Z

    .line 2
    .line 3
    return p0
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

.method private r0(I)V
    .registers 3

    .line 1
    if-nez p1, :cond_10

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/ui/d;->m:Landroidx/media3/ui/d$e;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 6
    .line 7
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    const/4 v0, 0x1

    .line 18
    if-ne p1, v0, :cond_21

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/media3/ui/d;->o:Landroidx/media3/ui/d$b;

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/ui/d;->F:Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->b0(Landroidx/recyclerview/widget/RecyclerView$h;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    iget-object p1, p0, Landroidx/media3/ui/d;->q:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 37
    .line 38
    .line 39
    return-void
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

.method static synthetic s(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

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

.method private setPlaybackSpeed(F)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 2
    .line 3
    if-eqz v0, :cond_1a

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lax/P0/H;->c0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_1a

    .line 14
    :cond_d
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/P0/H;->h()Lax/P0/G;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p1}, Lax/P0/G;->b(F)Lax/P0/G;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v0, p1}, Lax/P0/H;->e(Lax/P0/G;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    :goto_1a
    return-void
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

.method static synthetic t(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

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

.method static synthetic u(Landroidx/media3/ui/d;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

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

.method private u0(Lax/P0/H;J)V
    .registers 10

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/d;->v0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_39

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lax/P0/H;->c0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_43

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lax/P0/H;->c0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_43

    .line 20
    .line 21
    invoke-interface {p1}, Lax/P0/H;->h0()Lax/P0/N;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lax/P0/N;->p()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_1d
    iget-object v3, p0, Landroidx/media3/ui/d;->O:Lax/P0/N$c;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Lax/P0/N;->n(ILax/P0/N$c;)Lax/P0/N$c;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lax/P0/N$c;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    cmp-long v5, p2, v3

    .line 41
    .line 42
    if-gez v5, :cond_2c

    .line 43
    .line 44
    goto :goto_31

    .line 45
    :cond_2c
    add-int/lit8 v5, v1, -0x1

    .line 46
    .line 47
    if-ne v2, v5, :cond_35

    .line 48
    .line 49
    move-wide p2, v3

    .line 50
    :goto_31
    invoke-interface {p1, v2, p2, p3}, Lax/P0/H;->s(IJ)V

    .line 51
    .line 52
    .line 53
    goto :goto_43

    .line 54
    :cond_35
    sub-long/2addr p2, v3

    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_1d

    .line 58
    :cond_39
    const/4 v0, 0x5

    .line 59
    invoke-interface {p1, v0}, Lax/P0/H;->c0(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_43

    .line 64
    .line 65
    invoke-interface {p1, p2, p3}, Lax/P0/H;->t(J)V

    .line 66
    .line 67
    .line 68
    :cond_43
    :goto_43
    invoke-direct {p0}, Landroidx/media3/ui/d;->F0()V

    .line 69
    .line 70
    .line 71
    return-void
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

.method static synthetic v(Landroidx/media3/ui/d;)Landroid/view/View;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

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

.method static synthetic w(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

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

.method static synthetic x(Landroidx/media3/ui/d;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

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

.method private x0(ZLandroid/view/View;)V
    .registers 3

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/ui/d;->d0:F

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    iget p1, p0, Landroidx/media3/ui/d;->e0:F

    .line 13
    .line 14
    :goto_d
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

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
.end method

.method static synthetic y(Landroidx/media3/ui/d;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Landroidx/media3/ui/d;->u0:Z

    .line 2
    .line 3
    return p0
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

.method private y0()V
    .registers 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lax/P0/H;->T()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const-wide/16 v0, 0x3a98

    .line 11
    .line 12
    :goto_b
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    long-to-int v1, v0

    .line 16
    iget-object v0, p0, Landroidx/media3/ui/d;->x:Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_33

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/ui/d;->b:Landroid/content/res/Resources;

    .line 32
    .line 33
    sget v3, Lax/a2/C;->a:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x1

    .line 40
    new-array v5, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    aput-object v4, v5, v6

    .line 44
    .line 45
    invoke-virtual {v2, v3, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    return-void
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

.method static synthetic z(Landroidx/media3/ui/d;)Landroid/widget/ImageView;
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

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

.method private z0(Landroid/widget/ImageView;Z)V
    .registers 3

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    if-eqz p2, :cond_10

    .line 5
    .line 6
    iget-object p2, p0, Landroidx/media3/ui/d;->l0:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Landroidx/media3/ui/d;->n0:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    iget-object p2, p0, Landroidx/media3/ui/d;->m0:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Landroidx/media3/ui/d;->o0:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.method public B0(Z)V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/d;->r0:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_5

    .line 4
    .line 5
    goto :goto_18

    .line 6
    :cond_5
    iput-boolean p1, p0, Landroidx/media3/ui/d;->r0:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, Landroidx/media3/ui/d;->z0(Landroid/widget/ImageView;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-direct {p0, v0, p1}, Landroidx/media3/ui/d;->z0(Landroid/widget/ImageView;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/ui/d;->q0:Landroidx/media3/ui/d$d;

    .line 19
    .line 20
    if-eqz v0, :cond_18

    .line 21
    .line 22
    invoke-interface {v0, p1}, Landroidx/media3/ui/d$d;->G(Z)V

    .line 23
    .line 24
    .line 25
    :cond_18
    :goto_18
    return-void
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

.method public Y(Landroidx/media3/ui/d$m;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

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
.end method

.method public a0(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 6
    .line 7
    if-eqz v1, :cond_82

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media3/ui/d;->l0(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_10

    .line 14
    .line 15
    goto/16 :goto_82

    .line 16
    .line 17
    :cond_10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_80

    .line 22
    .line 23
    const/16 v2, 0x5a

    .line 24
    .line 25
    if-ne v0, v2, :cond_2d

    .line 26
    .line 27
    invoke-interface {v1}, Lax/P0/H;->i()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x4

    .line 32
    if-eq p1, v0, :cond_80

    .line 33
    .line 34
    const/16 p1, 0xc

    .line 35
    .line 36
    invoke-interface {v1, p1}, Lax/P0/H;->c0(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_80

    .line 41
    .line 42
    invoke-interface {v1}, Lax/P0/H;->n0()V

    .line 43
    .line 44
    .line 45
    goto :goto_80

    .line 46
    :cond_2d
    const/16 v2, 0x59

    .line 47
    .line 48
    if-ne v0, v2, :cond_3d

    .line 49
    .line 50
    const/16 v2, 0xb

    .line 51
    .line 52
    invoke-interface {v1, v2}, Lax/P0/H;->c0(I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3d

    .line 57
    .line 58
    invoke-interface {v1}, Lax/P0/H;->p0()V

    .line 59
    .line 60
    .line 61
    goto :goto_80

    .line 62
    :cond_3d
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_80

    .line 67
    .line 68
    const/16 p1, 0x4f

    .line 69
    .line 70
    if-eq v0, p1, :cond_7b

    .line 71
    .line 72
    const/16 p1, 0x55

    .line 73
    .line 74
    if-eq v0, p1, :cond_7b

    .line 75
    .line 76
    const/16 p1, 0x57

    .line 77
    .line 78
    if-eq v0, p1, :cond_6f

    .line 79
    .line 80
    const/16 p1, 0x58

    .line 81
    .line 82
    if-eq v0, p1, :cond_64

    .line 83
    .line 84
    const/16 p1, 0x7e

    .line 85
    .line 86
    if-eq v0, p1, :cond_60

    .line 87
    .line 88
    const/16 p1, 0x7f

    .line 89
    .line 90
    if-eq v0, p1, :cond_5c

    .line 91
    .line 92
    goto :goto_80

    .line 93
    :cond_5c
    invoke-static {v1}, Lax/S0/d0;->y0(Lax/P0/H;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_80

    .line 97
    :cond_60
    invoke-static {v1}, Lax/S0/d0;->z0(Lax/P0/H;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_80

    .line 101
    :cond_64
    const/4 p1, 0x7

    .line 102
    invoke-interface {v1, p1}, Lax/P0/H;->c0(I)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_80

    .line 107
    .line 108
    invoke-interface {v1}, Lax/P0/H;->Q()V

    .line 109
    .line 110
    .line 111
    goto :goto_80

    .line 112
    :cond_6f
    const/16 p1, 0x9

    .line 113
    .line 114
    invoke-interface {v1, p1}, Lax/P0/H;->c0(I)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_80

    .line 119
    .line 120
    invoke-interface {v1}, Lax/P0/H;->m0()V

    .line 121
    .line 122
    .line 123
    goto :goto_80

    .line 124
    :cond_7b
    iget-boolean p1, p0, Landroidx/media3/ui/d;->u0:Z

    .line 125
    .line 126
    invoke-static {v1, p1}, Lax/S0/d0;->B0(Lax/P0/H;Z)Z

    .line 127
    .line 128
    .line 129
    :cond_80
    :goto_80
    const/4 p1, 0x1

    .line 130
    return p1

    .line 131
    :cond_82
    :goto_82
    const/4 p1, 0x0

    .line 132
    return p1
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

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/ui/d;->a0(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_f
    :goto_f
    const/4 p1, 0x1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->C()V

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
.end method

.method public f0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->F()V

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
.end method

.method public getPlayer()Lax/P0/H;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

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

.method public getRepeatToggleModes()I
    .registers 2

    .line 1
    iget v0, p0, Landroidx/media3/ui/d;->A0:I

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

.method public getShowShuffleButton()Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public getShowSubtitleButton()Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public getShowTimeoutMs()I
    .registers 2

    .line 1
    iget v0, p0, Landroidx/media3/ui/d;->x0:I

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

.method public getShowVrButton()Z
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/ui/w;->A(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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

.method public k0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->I()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public n0()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method o0()V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1a

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/media3/ui/d$m;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-interface {v1, v2}, Landroidx/media3/ui/d$m;->K(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_6

    .line 27
    :cond_1a
    return-void
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

.method public onAttachedToWindow()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/w;->K()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/media3/ui/d;->k0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/media3/ui/w;->S()V

    .line 21
    .line 22
    .line 23
    :cond_16
    invoke-virtual {p0}, Landroidx/media3/ui/d;->w0()V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public onDetachedFromWindow()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/w;->L()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/media3/ui/d;->s0:Z

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/ui/d;->P:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/media3/ui/w;->R()V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method protected onLayout(ZIIII)V
    .registers 12

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move v1, p1

    .line 5
    move-object p1, p0

    .line 6
    iget-object v0, p1, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 7
    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/ui/w;->M(ZIIII)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public s0(Landroidx/media3/ui/d$m;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

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

.method public setAnimationEnabled(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/ui/w;->T(Z)V

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

.method public setOnFullScreenModeChangedListener(Landroidx/media3/ui/d$d;)V
    .registers 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/d;->q0:Landroidx/media3/ui/d$d;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->D:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz p1, :cond_a

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    goto :goto_b

    .line 11
    :cond_a
    const/4 v3, 0x0

    .line 12
    :goto_b
    invoke-static {v0, v3}, Landroidx/media3/ui/d;->A0(Landroid/view/View;Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/ui/d;->E:Landroid/widget/ImageView;

    .line 16
    .line 17
    if-eqz p1, :cond_13

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :cond_13
    invoke-static {v0, v1}, Landroidx/media3/ui/d;->A0(Landroid/view/View;Z)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public setPlayer(Lax/P0/H;)V
    .registers 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_f

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    :goto_f
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1e

    .line 20
    .line 21
    invoke-interface {p1}, Lax/P0/H;->i0()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_1f

    .line 30
    .line 31
    :cond_1e
    const/4 v2, 0x1

    .line 32
    :cond_1f
    invoke-static {v2}, Lax/S0/a;->a(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 36
    .line 37
    if-ne v0, p1, :cond_27

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    if-eqz v0, :cond_2e

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 43
    .line 44
    invoke-interface {v0, v1}, Lax/P0/H;->q(Lax/P0/H$d;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    iput-object p1, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 48
    .line 49
    if-eqz p1, :cond_37

    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/ui/d;->c:Landroidx/media3/ui/d$c;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lax/P0/H;->N(Lax/P0/H$d;)V

    .line 54
    .line 55
    .line 56
    :cond_37
    invoke-virtual {p0}, Landroidx/media3/ui/d;->w0()V

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
    .line 61
.end method

.method public setProgressUpdateListener(Landroidx/media3/ui/d$f;)V
    .registers 2

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .registers 6

    .line 1
    iput p1, p0, Landroidx/media3/ui/d;->A0:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_34

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-interface {v0, v3}, Lax/P0/H;->c0(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_34

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 18
    .line 19
    invoke-interface {v0}, Lax/P0/H;->o()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez p1, :cond_20

    .line 24
    .line 25
    if-eqz v0, :cond_20

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lax/P0/H;->j(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_34

    .line 33
    :cond_20
    const/4 v3, 0x2

    .line 34
    if-ne p1, v2, :cond_2b

    .line 35
    .line 36
    if-ne v0, v3, :cond_2b

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Lax/P0/H;->j(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_34

    .line 44
    :cond_2b
    if-ne p1, v3, :cond_34

    .line 45
    .line 46
    if-ne v0, v2, :cond_34

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/ui/d;->p0:Lax/P0/H;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Lax/P0/H;->j(I)V

    .line 51
    .line 52
    .line 53
    :cond_34
    :goto_34
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 54
    .line 55
    iget-object v3, p0, Landroidx/media3/ui/d;->z:Landroid/widget/ImageView;

    .line 56
    .line 57
    if-eqz p1, :cond_3b

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    :cond_3b
    invoke-virtual {v0, v3, v1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public setShowFastForwardButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->v:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setShowMultiWindowTimeBar(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->t0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

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

.method public setShowNextButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->t:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->u0:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

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

.method public setShowPreviousButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->s:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setShowRewindButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->w:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setShowShuffleButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->A:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setShowSubtitleButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->C:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
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
    .line 22
.end method

.method public setShowTimeoutMs(I)V
    .registers 2

    .line 1
    iput p1, p0, Landroidx/media3/ui/d;->x0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/d;->k0()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/ui/w;->S()V

    .line 12
    .line 13
    .line 14
    :cond_d
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

.method public setShowVrButton(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroidx/media3/ui/w;->U(Landroid/view/View;Z)V

    .line 6
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
    .line 22
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .registers 4

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lax/S0/d0;->p(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/media3/ui/d;->z0:I

    .line 10
    .line 11
    return-void
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

.method public setTimeBarScrubbingEnabled(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/d;->y0:Z

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

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_b

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    :goto_c
    iget-object v0, p0, Landroidx/media3/ui/d;->B:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/d;->x0(ZLandroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method t0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->u:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 6
    .line 7
    .line 8
    :cond_7
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

.method public v0()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/d;->a:Landroidx/media3/ui/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/ui/w;->X()V

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
.end method

.method w0()V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/ui/d;->D0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/ui/d;->C0()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/ui/d;->G0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/ui/d;->K0()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/ui/d;->M0()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/ui/d;->E0()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/media3/ui/d;->L0()V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method
