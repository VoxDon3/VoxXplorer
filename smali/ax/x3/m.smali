.class public Lax/x3/m;
.super Lax/x3/n;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/c3/K;",
            ">;"
        }
    .end annotation
.end field

.field c:Lax/Z2/d;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/Z2/d;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/x3/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/x3/m;->d()V

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
.method public a(I)Lax/c3/K;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/m;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/c3/K;

    .line 8
    .line 9
    return-object p1
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

.method public b(Lax/c3/K;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/m;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public c()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/Z2/d;->i()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lax/x3/m;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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

.method public d()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 2
    .line 3
    const v1, 0x7f0600c2

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lax/x3/m;->d:I

    .line 11
    .line 12
    iget-object v0, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 13
    .line 14
    const v1, 0x7f060352

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lax/x3/m;->e:I

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

.method public getCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/m;->b:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/x3/m;->a(I)Lax/c3/K;

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
.end method

.method public getItemId(I)J
    .registers 4

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
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

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 16
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 1
    const/4 p3, 0x0

    .line 2
    if-eqz p2, :cond_4

    .line 3
    .line 4
    goto :goto_15

    .line 5
    :cond_4
    iget-object p2, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v0, "layout_inflater"

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroid/view/LayoutInflater;

    .line 14
    .line 15
    const v0, 0x7f0d0055

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_15
    const v0, 0x7f0a0387

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/voxdon/xplorer/widget/PieProgress;

    .line 30
    .line 31
    const v1, 0x7f0a0321

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/widget/TextView;

    .line 39
    .line 40
    const v2, 0x7f0a0261

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Landroid/widget/TextView;

    .line 48
    .line 49
    const v3, 0x7f0a024f

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lax/x3/m;->a(I)Lax/c3/K;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    sget-object v5, Lax/Q2/f;->m0:Lax/Q2/f;

    .line 67
    .line 68
    const/16 v6, 0x8

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    if-ne v4, v5, :cond_5a

    .line 72
    .line 73
    const-string p1, ""

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    return-object p2

    .line 91
    :cond_5a
    iget-object v4, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {p1, v4}, Lax/c3/K;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v4, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 105
    .line 106
    invoke-virtual {v4, p1}, Lax/Z2/d;->t(Lax/c3/K;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    const/4 v5, 0x1

    .line 111
    if-eqz v4, :cond_83

    .line 112
    .line 113
    iget-object v4, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 114
    .line 115
    invoke-virtual {v4, p1}, Lax/Z2/d;->r(Lax/c3/K;)F

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    iget-object v8, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 120
    .line 121
    invoke-static {v8}, Lax/Q2/e;->l(Landroid/content/Context;)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    int-to-float v8, v8

    .line 126
    cmpl-float v4, v4, v8

    .line 127
    .line 128
    if-ltz v4, :cond_83

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    goto :goto_84

    .line 132
    :cond_83
    const/4 v4, 0x0

    .line 133
    :goto_84
    if-eqz v4, :cond_8c

    .line 134
    .line 135
    iget v8, p0, Lax/x3/m;->d:I

    .line 136
    .line 137
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_91

    .line 141
    :cond_8c
    iget v8, p0, Lax/x3/m;->e:I

    .line 142
    .line 143
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 144
    .line 145
    .line 146
    :goto_91
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    sget-object v9, Lax/Q2/f;->i1:Lax/Q2/f;

    .line 151
    .line 152
    if-ne v8, v9, :cond_bc

    .line 153
    .line 154
    const/4 p3, 0x4

    .line 155
    if-eqz v4, :cond_a2

    .line 156
    .line 157
    iget v1, p0, Lax/x3/m;->d:I

    .line 158
    .line 159
    invoke-virtual {v0, v1, p3}, Lcom/voxdon/xplorer/widget/PieProgress;->b(II)V

    .line 160
    .line 161
    .line 162
    goto :goto_a7

    .line 163
    :cond_a2
    iget v1, p0, Lax/x3/m;->e:I

    .line 164
    .line 165
    invoke-virtual {v0, v1, p3}, Lcom/voxdon/xplorer/widget/PieProgress;->b(II)V

    .line 166
    .line 167
    .line 168
    :goto_a7
    const/4 p3, 0x3

    .line 169
    invoke-virtual {v0, p3}, Lcom/voxdon/xplorer/widget/PieProgress;->setStyle(I)V

    .line 170
    .line 171
    .line 172
    iget-object p3, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 173
    .line 174
    invoke-virtual {p3, p1}, Lax/Z2/d;->r(Lax/c3/K;)F

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    float-to-int p3, p3

    .line 179
    invoke-virtual {v0, p3}, Lcom/voxdon/xplorer/widget/PieProgress;->setProgressPercent(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_ec

    .line 189
    :cond_bc
    sget-object v4, Lax/Q2/f;->p1:Lax/Q2/f;

    .line 190
    .line 191
    if-ne v1, v4, :cond_dd

    .line 192
    .line 193
    iget-object p3, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 194
    .line 195
    invoke-virtual {p3, p1}, Lax/Z2/d;->q(Lax/c3/K;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v8

    .line 199
    const-wide/16 v10, 0x0

    .line 200
    .line 201
    cmp-long p3, v8, v10

    .line 202
    .line 203
    if-lez p3, :cond_ce

    .line 204
    .line 205
    const/4 p3, 0x1

    .line 206
    goto :goto_cf

    .line 207
    :cond_ce
    const/4 p3, 0x0

    .line 208
    :goto_cf
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    iget-object v4, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 213
    .line 214
    invoke-static {v4, v1, p3}, Lax/s3/b;->f(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-virtual {v3, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 219
    .line 220
    .line 221
    goto :goto_e6

    .line 222
    :cond_dd
    iget-object v4, p0, Lax/x3/m;->a:Landroid/content/Context;

    .line 223
    .line 224
    invoke-static {v4, v1, p3}, Lax/s3/b;->f(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    invoke-virtual {v3, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 229
    .line 230
    .line 231
    :goto_e6
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    :goto_ec
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 238
    .line 239
    .line 240
    move-result-object p3

    .line 241
    sget-object v0, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 242
    .line 243
    if-ne p3, v0, :cond_10f

    .line 244
    .line 245
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    invoke-virtual {p3}, Lax/Z2/j;->t0()Z

    .line 250
    .line 251
    .line 252
    move-result p3

    .line 253
    if-nez p3, :cond_10f

    .line 254
    .line 255
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 256
    .line 257
    .line 258
    move-result-object p3

    .line 259
    invoke-virtual {p3}, Lax/Z2/j;->v0()Z

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    if-nez p3, :cond_10f

    .line 264
    .line 265
    const p3, 0x3f4ccccd    # 0.8f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, p3}, Landroid/view/View;->setAlpha(F)V

    .line 269
    .line 270
    .line 271
    goto :goto_114

    .line 272
    :cond_10f
    const/high16 p3, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual {v3, p3}, Landroid/view/View;->setAlpha(F)V

    .line 275
    .line 276
    .line 277
    :goto_114
    iget-object p3, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 278
    .line 279
    invoke-virtual {p3, p1, v7}, Lax/Z2/d;->v(Lax/c3/K;Z)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p3

    .line 283
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroid/widget/TextView;->getLineCount()I

    .line 287
    .line 288
    .line 289
    move-result p3

    .line 290
    if-le p3, v5, :cond_12c

    .line 291
    .line 292
    iget-object p3, p0, Lax/x3/m;->c:Lax/Z2/d;

    .line 293
    .line 294
    invoke-virtual {p3, p1, v5}, Lax/Z2/d;->v(Lax/c3/K;Z)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    :cond_12c
    return-object p2
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

.method public isEnabled(I)Z
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lax/x3/m;->a(I)Lax/c3/K;

    .line 3
    .line 4
    .line 5
    move-result-object v1
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_5} :catch_32

    .line 6
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-ne v2, v3, :cond_24

    .line 14
    .line 15
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lax/Z2/j;->t0()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2d

    .line 24
    .line 25
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Z2/j;->v0()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_23

    .line 34
    .line 35
    return v0

    .line 36
    :cond_23
    return v4

    .line 37
    :cond_24
    invoke-virtual {v1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lax/Q2/f;->m0:Lax/Q2/f;

    .line 42
    .line 43
    if-ne v0, v1, :cond_2d

    .line 44
    .line 45
    return v4

    .line 46
    :cond_2d
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :catch_32
    return v0
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
