.class final Landroidx/media3/ui/a;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/ui/SubtitleView$a;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/ui/C;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/R0/a;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:F

.field private e:Lax/a2/a;

.field private f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/a;->a:Ljava/util/List;

    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Landroidx/media3/ui/a;->b:Ljava/util/List;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/media3/ui/a;->c:I

    const p1, 0x3d5a511a    # 0.0533f

    .line 6
    iput p1, p0, Landroidx/media3/ui/a;->d:F

    .line 7
    sget-object p1, Lax/a2/a;->g:Lax/a2/a;

    iput-object p1, p0, Landroidx/media3/ui/a;->e:Lax/a2/a;

    const p1, 0x3da3d70a    # 0.08f

    .line 8
    iput p1, p0, Landroidx/media3/ui/a;->f:F

    return-void
.end method

.method private static b(Lax/R0/a;)Lax/R0/a;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/R0/a;->a()Lax/R0/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, -0x800001

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/R0/a$b;->k(F)Lax/R0/a$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/high16 v1, -0x80000000

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Lax/R0/a$b;->p(Landroid/text/Layout$Alignment;)Lax/R0/a$b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v1, p0, Lax/R0/a;->f:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/high16 v3, 0x3f800000    # 1.0f

    .line 27
    .line 28
    if-nez v1, :cond_24

    .line 29
    .line 30
    iget v1, p0, Lax/R0/a;->e:F

    .line 31
    .line 32
    sub-float/2addr v3, v1

    .line 33
    invoke-virtual {v0, v3, v2}, Lax/R0/a$b;->h(FI)Lax/R0/a$b;

    .line 34
    .line 35
    .line 36
    goto :goto_2c

    .line 37
    :cond_24
    iget v1, p0, Lax/R0/a;->e:F

    .line 38
    .line 39
    neg-float v1, v1

    .line 40
    sub-float/2addr v1, v3

    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-virtual {v0, v1, v3}, Lax/R0/a$b;->h(FI)Lax/R0/a$b;

    .line 43
    .line 44
    .line 45
    :goto_2c
    iget p0, p0, Lax/R0/a;->g:I

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    if-eqz p0, :cond_38

    .line 49
    .line 50
    if-eq p0, v1, :cond_34

    .line 51
    .line 52
    goto :goto_3b

    .line 53
    :cond_34
    invoke-virtual {v0, v2}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 54
    .line 55
    .line 56
    goto :goto_3b

    .line 57
    :cond_38
    invoke-virtual {v0, v1}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 58
    .line 59
    .line 60
    :goto_3b
    invoke-virtual {v0}, Lax/R0/a$b;->a()Lax/R0/a;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
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


# virtual methods
.method public a(Ljava/util/List;Lax/a2/a;FIF)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/R0/a;",
            ">;",
            "Lax/a2/a;",
            "FIF)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/ui/a;->b:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/ui/a;->e:Lax/a2/a;

    .line 4
    .line 5
    iput p3, p0, Landroidx/media3/ui/a;->d:F

    .line 6
    .line 7
    iput p4, p0, Landroidx/media3/ui/a;->c:I

    .line 8
    .line 9
    iput p5, p0, Landroidx/media3/ui/a;->f:F

    .line 10
    .line 11
    :goto_a
    iget-object p2, p0, Landroidx/media3/ui/a;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-ge p2, p3, :cond_25

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/ui/a;->a:Ljava/util/List;

    .line 24
    .line 25
    new-instance p3, Landroidx/media3/ui/C;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-direct {p3, p4}, Landroidx/media3/ui/C;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_a

    .line 38
    :cond_25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/a;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_b

    .line 10
    .line 11
    goto :goto_74

    .line 12
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 17
    .line 18
    .line 19
    move-result v10

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v11

    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    sub-int v12, v3, v4

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sub-int v13, v2, v3

    .line 39
    .line 40
    if-le v13, v11, :cond_74

    .line 41
    .line 42
    if-gt v12, v10, :cond_2c

    .line 43
    .line 44
    goto :goto_74

    .line 45
    :cond_2c
    sub-int v14, v13, v11

    .line 46
    .line 47
    iget v3, v0, Landroidx/media3/ui/a;->c:I

    .line 48
    .line 49
    iget v4, v0, Landroidx/media3/ui/a;->d:F

    .line 50
    .line 51
    invoke-static {v3, v4, v2, v14}, Landroidx/media3/ui/F;->f(IFII)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v3, 0x0

    .line 56
    cmpg-float v3, v6, v3

    .line 57
    .line 58
    if-gtz v3, :cond_3c

    .line 59
    .line 60
    goto :goto_74

    .line 61
    :cond_3c
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    const/4 v3, 0x0

    .line 66
    :goto_41
    if-ge v3, v15, :cond_74

    .line 67
    .line 68
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lax/R0/a;

    .line 73
    .line 74
    iget v5, v4, Lax/R0/a;->p:I

    .line 75
    .line 76
    const/high16 v7, -0x80000000

    .line 77
    .line 78
    if-eq v5, v7, :cond_53

    .line 79
    .line 80
    invoke-static {v4}, Landroidx/media3/ui/a;->b(Lax/R0/a;)Lax/R0/a;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :cond_53
    iget v5, v4, Lax/R0/a;->n:I

    .line 85
    .line 86
    iget v7, v4, Lax/R0/a;->o:F

    .line 87
    .line 88
    invoke-static {v5, v7, v2, v14}, Landroidx/media3/ui/F;->f(IFII)F

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    iget-object v5, v0, Landroidx/media3/ui/a;->a:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Landroidx/media3/ui/C;

    .line 99
    .line 100
    move v8, v3

    .line 101
    move-object v3, v5

    .line 102
    iget-object v5, v0, Landroidx/media3/ui/a;->e:Lax/a2/a;

    .line 103
    .line 104
    move v9, v8

    .line 105
    iget v8, v0, Landroidx/media3/ui/a;->f:F

    .line 106
    .line 107
    move/from16 v16, v9

    .line 108
    .line 109
    move-object/from16 v9, p1

    .line 110
    .line 111
    invoke-virtual/range {v3 .. v13}, Landroidx/media3/ui/C;->b(Lax/R0/a;Lax/a2/a;FFFLandroid/graphics/Canvas;IIII)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v3, v16, 0x1

    .line 115
    .line 116
    goto :goto_41

    .line 117
    :cond_74
    :goto_74
    return-void
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
