.class Lax/X4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/X4/l$a;,
        Lax/X4/l$b;
    }
.end annotation


# static fields
.field public static final a:D

.field public static final b:D

.field private static volatile c:[Lax/X4/l$a;

.field private static volatile d:[Lax/X4/l$a;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 1
    const-wide v0, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sput-wide v2, Lax/X4/l;->a:D

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lax/X4/l;->b:D

    .line 17
    .line 18
    const/16 v0, 0x14

    .line 19
    .line 20
    new-array v1, v0, [Lax/X4/l$a;

    .line 21
    .line 22
    sput-object v1, Lax/X4/l;->c:[Lax/X4/l$a;

    .line 23
    .line 24
    new-array v0, v0, [Lax/X4/l$a;

    .line 25
    .line 26
    sput-object v0, Lax/X4/l;->d:[Lax/X4/l$a;

    .line 27
    .line 28
    return-void
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

.method static a(I)I
    .registers 2

    .line 1
    const/16 v0, 0x2600

    .line 2
    .line 3
    if-gt p0, v0, :cond_7

    .line 4
    .line 5
    const/16 p0, 0x13

    .line 6
    .line 7
    return p0

    .line 8
    :cond_7
    const/16 v0, 0x4800

    .line 9
    .line 10
    if-gt p0, v0, :cond_e

    .line 11
    .line 12
    const/16 p0, 0x12

    .line 13
    .line 14
    return p0

    .line 15
    :cond_e
    const v0, 0x11000

    .line 16
    .line 17
    .line 18
    if-gt p0, v0, :cond_16

    .line 19
    .line 20
    const/16 p0, 0x11

    .line 21
    .line 22
    return p0

    .line 23
    :cond_16
    const/high16 v0, 0x40000

    .line 24
    .line 25
    if-gt p0, v0, :cond_1d

    .line 26
    .line 27
    const/16 p0, 0x10

    .line 28
    .line 29
    return p0

    .line 30
    :cond_1d
    const/high16 v0, 0xf0000

    .line 31
    .line 32
    if-gt p0, v0, :cond_24

    .line 33
    .line 34
    const/16 p0, 0xf

    .line 35
    .line 36
    return p0

    .line 37
    :cond_24
    const/high16 v0, 0x380000

    .line 38
    .line 39
    if-gt p0, v0, :cond_2b

    .line 40
    .line 41
    const/16 p0, 0xe

    .line 42
    .line 43
    return p0

    .line 44
    :cond_2b
    const/high16 v0, 0xd00000

    .line 45
    .line 46
    if-gt p0, v0, :cond_32

    .line 47
    .line 48
    const/16 p0, 0xd

    .line 49
    .line 50
    return p0

    .line 51
    :cond_32
    const/high16 v0, 0x1800000

    .line 52
    .line 53
    if-gt p0, v0, :cond_39

    .line 54
    .line 55
    const/16 p0, 0xc

    .line 56
    .line 57
    return p0

    .line 58
    :cond_39
    const/high16 v0, 0x5800000

    .line 59
    .line 60
    if-gt p0, v0, :cond_40

    .line 61
    .line 62
    const/16 p0, 0xb

    .line 63
    .line 64
    return p0

    .line 65
    :cond_40
    const/high16 v0, 0x14000000

    .line 66
    .line 67
    if-gt p0, v0, :cond_47

    .line 68
    .line 69
    const/16 p0, 0xa

    .line 70
    .line 71
    return p0

    .line 72
    :cond_47
    const/high16 v0, 0x48000000    # 131072.0f

    .line 73
    .line 74
    if-gt p0, v0, :cond_4e

    .line 75
    .line 76
    const/16 p0, 0x9

    .line 77
    .line 78
    return p0

    .line 79
    :cond_4e
    const/16 p0, 0x8

    .line 80
    .line 81
    return p0
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

.method private static b(I)Lax/X4/l$a;
    .registers 14

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_14

    .line 3
    .line 4
    new-instance p0, Lax/X4/l$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/X4/l$a;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v2, v0, v1}, Lax/X4/l$a;->t(ID)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    invoke-virtual {p0, v2, v0, v1}, Lax/X4/l$a;->i(ID)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_14
    new-instance v3, Lax/X4/l$a;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lax/X4/l$a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 27
    .line 28
    const-wide/16 v7, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-virtual/range {v3 .. v8}, Lax/X4/l$a;->v(IDD)V

    .line 32
    .line 33
    .line 34
    sget-wide v5, Lax/X4/l;->a:D

    .line 35
    .line 36
    sget-wide v7, Lax/X4/l;->b:D

    .line 37
    .line 38
    div-int/lit8 v4, p0, 0x2

    .line 39
    .line 40
    invoke-virtual/range {v3 .. v8}, Lax/X4/l$a;->v(IDD)V

    .line 41
    .line 42
    .line 43
    move v1, v4

    .line 44
    const-wide v4, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    int-to-double v6, p0

    .line 50
    div-double v9, v4, v6

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    :goto_34
    if-ge v4, v1, :cond_53

    .line 54
    .line 55
    int-to-double v5, v4

    .line 56
    mul-double v5, v5, v9

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    move-wide v11, v7

    .line 67
    move-wide v7, v5

    .line 68
    move-wide v5, v11

    .line 69
    invoke-virtual/range {v3 .. v8}, Lax/X4/l$a;->v(IDD)V

    .line 70
    .line 71
    .line 72
    move v0, v4

    .line 73
    sub-int v4, p0, v0

    .line 74
    .line 75
    move-wide v11, v7

    .line 76
    move-wide v7, v5

    .line 77
    move-wide v5, v11

    .line 78
    invoke-virtual/range {v3 .. v8}, Lax/X4/l$a;->v(IDD)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v4, v0, 0x1

    .line 82
    .line 83
    goto :goto_34

    .line 84
    :cond_53
    return-object v3
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

.method private static c(Lax/X4/l$a;[Lax/X4/l$a;)V
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    rsub-int/lit8 v2, v2, 0x1f

    .line 12
    .line 13
    new-instance v3, Lax/X4/l$b;

    .line 14
    .line 15
    invoke-direct {v3}, Lax/X4/l$b;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lax/X4/l$b;

    .line 19
    .line 20
    invoke-direct {v4}, Lax/X4/l$b;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Lax/X4/l$b;

    .line 24
    .line 25
    invoke-direct {v5}, Lax/X4/l$b;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lax/X4/l$b;

    .line 29
    .line 30
    invoke-direct {v6}, Lax/X4/l$b;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lax/X4/l$b;

    .line 34
    .line 35
    invoke-direct {v7}, Lax/X4/l$b;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v8, Lax/X4/l$b;

    .line 39
    .line 40
    invoke-direct {v8}, Lax/X4/l$b;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_2a
    const/4 v10, 0x2

    .line 44
    if-lt v2, v10, :cond_97

    .line 45
    .line 46
    add-int/lit8 v10, v2, -0x2

    .line 47
    .line 48
    aget-object v10, p1, v10

    .line 49
    .line 50
    const/4 v11, 0x1

    .line 51
    shl-int/2addr v11, v2

    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_34
    if-ge v12, v1, :cond_92

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    :goto_37
    div-int/lit8 v14, v11, 0x4

    .line 57
    .line 58
    if-ge v13, v14, :cond_8e

    .line 59
    .line 60
    invoke-virtual {v7, v10, v13}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v8}, Lax/X4/l$b;->k(Lax/X4/l$b;)V

    .line 64
    .line 65
    .line 66
    add-int v15, v12, v13

    .line 67
    .line 68
    add-int/2addr v14, v15

    .line 69
    div-int/lit8 v16, v11, 0x2

    .line 70
    .line 71
    add-int v9, v15, v16

    .line 72
    .line 73
    mul-int/lit8 v16, v11, 0x3

    .line 74
    .line 75
    div-int/lit8 v16, v16, 0x4

    .line 76
    .line 77
    move/from16 v17, v2

    .line 78
    .line 79
    add-int v2, v15, v16

    .line 80
    .line 81
    invoke-virtual {v0, v15, v0, v14, v3}, Lax/X4/l$a;->c(ILax/X4/l$a;ILax/X4/l$b;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v0, v9}, Lax/X4/l$b;->a(Lax/X4/l$a;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v0, v2}, Lax/X4/l$b;->a(Lax/X4/l$a;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v15, v0, v14, v4}, Lax/X4/l$a;->y(ILax/X4/l$a;ILax/X4/l$b;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v0, v9}, Lax/X4/l$b;->l(Lax/X4/l$a;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v0, v2}, Lax/X4/l$b;->d(Lax/X4/l$a;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v7}, Lax/X4/l$b;->i(Lax/X4/l$b;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v15, v0, v14, v5}, Lax/X4/l$a;->x(ILax/X4/l$a;ILax/X4/l$b;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v0, v9}, Lax/X4/l$b;->a(Lax/X4/l$a;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v0, v2}, Lax/X4/l$b;->l(Lax/X4/l$a;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v8}, Lax/X4/l$b;->i(Lax/X4/l$b;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v15, v0, v14, v6}, Lax/X4/l$a;->d(ILax/X4/l$a;ILax/X4/l$b;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v0, v9}, Lax/X4/l$b;->l(Lax/X4/l$a;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v0, v2}, Lax/X4/l$b;->p(Lax/X4/l$a;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v7}, Lax/X4/l$b;->h(Lax/X4/l$b;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v0, v15}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v0, v14}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v0, v9}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6, v0, v2}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v13, v13, 0x1

    .line 139
    .line 140
    move/from16 v2, v17

    .line 141
    .line 142
    goto :goto_37

    .line 143
    :cond_8e
    move/from16 v17, v2

    .line 144
    .line 145
    add-int/2addr v12, v11

    .line 146
    goto :goto_34

    .line 147
    :cond_92
    move/from16 v17, v2

    .line 148
    .line 149
    add-int/lit8 v2, v17, -0x2

    .line 150
    .line 151
    goto :goto_2a

    .line 152
    :cond_97
    move/from16 v17, v2

    .line 153
    .line 154
    if-lez v17, :cond_af

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    :goto_9c
    if-ge v9, v1, :cond_af

    .line 158
    .line 159
    invoke-virtual {v0, v9, v3}, Lax/X4/l$a;->g(ILax/X4/l$b;)V

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, v9, 0x1

    .line 163
    .line 164
    invoke-virtual {v0, v2, v4}, Lax/X4/l$a;->g(ILax/X4/l$b;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v9, v4}, Lax/X4/l$a;->b(ILax/X4/l$b;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v4, v0, v2}, Lax/X4/l$b;->n(Lax/X4/l$b;Lax/X4/l$a;I)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v9, v9, 0x2

    .line 174
    .line 175
    goto :goto_9c

    .line 176
    :cond_af
    return-void
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

.method private static d(Lax/X4/l$a;Lax/X4/l$a;Lax/X4/l$a;ID)V
    .registers 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    int-to-double v3, v3

    .line 10
    const-wide/high16 v5, -0x4020000000000000L    # -0.5

    .line 11
    .line 12
    mul-double v3, v3, v5

    .line 13
    .line 14
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 15
    .line 16
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    mul-double v3, v3, v5

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    :goto_16
    invoke-static {v0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v5, v6, :cond_a9

    .line 28
    .line 29
    invoke-virtual {v0, v5}, Lax/X4/l$a;->s(I)D

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {v1, v5}, Lax/X4/l$a;->s(I)D

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    add-double/2addr v6, v8

    .line 38
    invoke-virtual {v2, v5}, Lax/X4/l$a;->s(I)D

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    add-double/2addr v6, v8

    .line 43
    invoke-virtual {v0, v5}, Lax/X4/l$a;->h(I)D

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    invoke-virtual {v1, v5}, Lax/X4/l$a;->h(I)D

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    add-double/2addr v8, v10

    .line 52
    invoke-virtual {v2, v5}, Lax/X4/l$a;->h(I)D

    .line 53
    .line 54
    .line 55
    move-result-wide v10

    .line 56
    add-double/2addr v8, v10

    .line 57
    invoke-virtual {v2, v5}, Lax/X4/l$a;->h(I)D

    .line 58
    .line 59
    .line 60
    move-result-wide v10

    .line 61
    invoke-virtual {v1, v5}, Lax/X4/l$a;->h(I)D

    .line 62
    .line 63
    .line 64
    move-result-wide v12

    .line 65
    sub-double/2addr v10, v12

    .line 66
    mul-double v10, v10, v3

    .line 67
    .line 68
    invoke-virtual {v1, v5}, Lax/X4/l$a;->s(I)D

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    invoke-virtual {v2, v5}, Lax/X4/l$a;->s(I)D

    .line 73
    .line 74
    .line 75
    move-result-wide v14

    .line 76
    sub-double/2addr v12, v14

    .line 77
    mul-double v12, v12, v3

    .line 78
    .line 79
    invoke-virtual {v1, v5}, Lax/X4/l$a;->s(I)D

    .line 80
    .line 81
    .line 82
    move-result-wide v14

    .line 83
    invoke-virtual {v2, v5}, Lax/X4/l$a;->s(I)D

    .line 84
    .line 85
    .line 86
    move-result-wide v16

    .line 87
    add-double v14, v14, v16

    .line 88
    .line 89
    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    .line 90
    .line 91
    mul-double v14, v14, v16

    .line 92
    .line 93
    invoke-virtual {v1, v5}, Lax/X4/l$a;->h(I)D

    .line 94
    .line 95
    .line 96
    move-result-wide v18

    .line 97
    invoke-virtual {v2, v5}, Lax/X4/l$a;->h(I)D

    .line 98
    .line 99
    .line 100
    move-result-wide v20

    .line 101
    add-double v18, v18, v20

    .line 102
    .line 103
    mul-double v18, v18, v16

    .line 104
    .line 105
    invoke-virtual {v0, v5}, Lax/X4/l$a;->s(I)D

    .line 106
    .line 107
    .line 108
    move-result-wide v16

    .line 109
    sub-double v16, v16, v14

    .line 110
    .line 111
    add-double v16, v16, v10

    .line 112
    .line 113
    invoke-virtual {v0, v5}, Lax/X4/l$a;->h(I)D

    .line 114
    .line 115
    .line 116
    move-result-wide v20

    .line 117
    add-double v20, v20, v12

    .line 118
    .line 119
    sub-double v20, v20, v18

    .line 120
    .line 121
    invoke-virtual {v0, v5}, Lax/X4/l$a;->s(I)D

    .line 122
    .line 123
    .line 124
    move-result-wide v22

    .line 125
    sub-double v22, v22, v14

    .line 126
    .line 127
    sub-double v22, v22, v10

    .line 128
    .line 129
    invoke-virtual {v0, v5}, Lax/X4/l$a;->h(I)D

    .line 130
    .line 131
    .line 132
    move-result-wide v10

    .line 133
    sub-double/2addr v10, v12

    .line 134
    sub-double v10, v10, v18

    .line 135
    .line 136
    mul-double v6, v6, p4

    .line 137
    .line 138
    invoke-virtual {v0, v5, v6, v7}, Lax/X4/l$a;->t(ID)V

    .line 139
    .line 140
    .line 141
    mul-double v8, v8, p4

    .line 142
    .line 143
    invoke-virtual {v0, v5, v8, v9}, Lax/X4/l$a;->i(ID)V

    .line 144
    .line 145
    .line 146
    mul-double v6, v16, p4

    .line 147
    .line 148
    invoke-virtual {v1, v5, v6, v7}, Lax/X4/l$a;->t(ID)V

    .line 149
    .line 150
    .line 151
    mul-double v6, v20, p4

    .line 152
    .line 153
    invoke-virtual {v1, v5, v6, v7}, Lax/X4/l$a;->i(ID)V

    .line 154
    .line 155
    .line 156
    mul-double v6, v22, p4

    .line 157
    .line 158
    invoke-virtual {v2, v5, v6, v7}, Lax/X4/l$a;->t(ID)V

    .line 159
    .line 160
    .line 161
    mul-double v10, v10, p4

    .line 162
    .line 163
    invoke-virtual {v2, v5, v10, v11}, Lax/X4/l$a;->i(ID)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v5, v5, 0x1

    .line 167
    .line 168
    goto/16 :goto_16

    .line 169
    .line 170
    :cond_a9
    return-void
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

.method private static e(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V
    .registers 11

    .line 1
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x3

    .line 6
    .line 7
    new-instance v1, Lax/X4/l$a;

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    invoke-direct {v1, p0, v7, v0}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lax/X4/l$a;

    .line 14
    .line 15
    mul-int/lit8 v3, v0, 0x2

    .line 16
    .line 17
    invoke-direct {v2, p0, v0, v3}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 18
    .line 19
    .line 20
    move v4, v3

    .line 21
    new-instance v3, Lax/X4/l$a;

    .line 22
    .line 23
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-direct {v3, p0, v4, v5}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 32
    .line 33
    invoke-static/range {v1 .. v6}, Lax/X4/l;->d(Lax/X4/l$a;Lax/X4/l$a;Lax/X4/l$a;ID)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lax/X4/l$b;

    .line 37
    .line 38
    invoke-direct {v4}, Lax/X4/l$b;-><init>()V

    .line 39
    .line 40
    .line 41
    :goto_28
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    div-int/lit8 v5, v5, 0x4

    .line 46
    .line 47
    if-ge v7, v5, :cond_3f

    .line 48
    .line 49
    invoke-virtual {v4, p2, v7}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v7, v4}, Lax/X4/l$a;->m(ILax/X4/l$b;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v7, v4}, Lax/X4/l$a;->m(ILax/X4/l$b;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v7, v4}, Lax/X4/l$a;->m(ILax/X4/l$b;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v7, v7, 0x1

    .line 62
    .line 63
    goto :goto_28

    .line 64
    :cond_3f
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    div-int/lit8 v5, v5, 0x4

    .line 69
    .line 70
    :goto_45
    if-ge v5, v0, :cond_5e

    .line 71
    .line 72
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    div-int/lit8 v6, v6, 0x4

    .line 77
    .line 78
    sub-int v6, v5, v6

    .line 79
    .line 80
    invoke-virtual {v4, p2, v6}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v5, v4}, Lax/X4/l$a;->o(ILax/X4/l$b;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v5, v4}, Lax/X4/l$a;->o(ILax/X4/l$b;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v5, v4}, Lax/X4/l$a;->o(ILax/X4/l$b;)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_45

    .line 95
    :cond_5e
    invoke-static {v1, p1}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, p1}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3, p1}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 102
    .line 103
    .line 104
    return-void
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
.end method

.method static f(Lax/X4/l$a;II)Ljava/math/BigInteger;
    .registers 25

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-long v1, v1

    .line 8
    int-to-long v3, v0

    .line 9
    const-wide v5, 0x80000000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    div-long/2addr v5, v3

    .line 15
    const-wide/16 v7, 0x1

    .line 16
    .line 17
    add-long/2addr v5, v7

    .line 18
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    long-to-int v2, v1

    .line 23
    int-to-long v5, v2

    .line 24
    mul-long v5, v5, v3

    .line 25
    .line 26
    const-wide/16 v3, 0x1f

    .line 27
    .line 28
    add-long/2addr v5, v3

    .line 29
    const-wide/16 v3, 0x8

    .line 30
    .line 31
    mul-long v5, v5, v3

    .line 32
    .line 33
    const-wide/16 v3, 0x20

    .line 34
    .line 35
    div-long/2addr v5, v3

    .line 36
    long-to-int v1, v5

    .line 37
    new-array v3, v1, [B

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    shl-int v5, v4, v0

    .line 41
    .line 42
    sub-int/2addr v5, v4

    .line 43
    rsub-int/lit8 v6, v0, 0x20

    .line 44
    .line 45
    mul-int/lit8 v7, v1, 0x8

    .line 46
    .line 47
    sub-int/2addr v7, v0

    .line 48
    shr-int/lit8 v8, v7, 0x3

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    add-int/lit8 v1, v1, -0x4

    .line 56
    .line 57
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    const-wide/16 v10, 0x0

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v13, 0x0

    .line 65
    :goto_40
    if-gt v12, v4, :cond_8f

    .line 66
    .line 67
    const/4 v14, 0x0

    .line 68
    :goto_43
    if-ge v14, v2, :cond_84

    .line 69
    .line 70
    move-object/from16 v15, p0

    .line 71
    .line 72
    invoke-virtual {v15, v14, v12}, Lax/X4/l$a;->r(II)D

    .line 73
    .line 74
    .line 75
    move-result-wide v16

    .line 76
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    .line 77
    .line 78
    .line 79
    move-result-wide v16

    .line 80
    add-long v16, v16, v10

    .line 81
    .line 82
    shr-long v10, v16, v0

    .line 83
    .line 84
    shr-int/lit8 v4, v7, 0x3

    .line 85
    .line 86
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    sub-int/2addr v8, v4

    .line 95
    shl-int/lit8 v8, v8, 0x3

    .line 96
    .line 97
    ushr-int v8, v13, v8

    .line 98
    .line 99
    sub-int v13, v6, v7

    .line 100
    .line 101
    shl-int/lit8 v18, v4, 0x3

    .line 102
    .line 103
    add-int v13, v13, v18

    .line 104
    .line 105
    move-wide/from16 v19, v10

    .line 106
    .line 107
    int-to-long v9, v8

    .line 108
    move/from16 v21, v1

    .line 109
    .line 110
    int-to-long v0, v5

    .line 111
    and-long v0, v16, v0

    .line 112
    .line 113
    shl-long/2addr v0, v13

    .line 114
    or-long/2addr v0, v9

    .line 115
    long-to-int v13, v0

    .line 116
    invoke-static {v3, v4, v13}, Lax/X4/i;->n([BII)V

    .line 117
    .line 118
    .line 119
    sub-int v7, v7, p2

    .line 120
    .line 121
    add-int/lit8 v14, v14, 0x1

    .line 122
    .line 123
    move/from16 v0, p2

    .line 124
    .line 125
    move v8, v4

    .line 126
    move-wide/from16 v10, v19

    .line 127
    .line 128
    move/from16 v1, v21

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    const/4 v9, 0x0

    .line 132
    goto :goto_43

    .line 133
    :cond_84
    move-object/from16 v15, p0

    .line 134
    .line 135
    move/from16 v21, v1

    .line 136
    .line 137
    add-int/lit8 v12, v12, 0x1

    .line 138
    .line 139
    move/from16 v0, p2

    .line 140
    .line 141
    const/4 v4, 0x1

    .line 142
    const/4 v9, 0x0

    .line 143
    goto :goto_40

    .line 144
    :cond_8f
    new-instance v0, Ljava/math/BigInteger;

    .line 145
    .line 146
    move/from16 v1, p1

    .line 147
    .line 148
    invoke-direct {v0, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 149
    .line 150
    .line 151
    return-object v0
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
.end method

.method private static g(I)[Lax/X4/l$a;
    .registers 4

    .line 1
    add-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    new-array v0, v0, [Lax/X4/l$a;

    .line 4
    .line 5
    :goto_4
    if-ltz p0, :cond_2c

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ge p0, v1, :cond_21

    .line 11
    .line 12
    sget-object v1, Lax/X4/l;->c:[Lax/X4/l$a;

    .line 13
    .line 14
    aget-object v1, v1, p0

    .line 15
    .line 16
    if-nez v1, :cond_1a

    .line 17
    .line 18
    sget-object v1, Lax/X4/l;->c:[Lax/X4/l$a;

    .line 19
    .line 20
    shl-int/2addr v2, p0

    .line 21
    invoke-static {v2}, Lax/X4/l;->b(I)Lax/X4/l$a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    aput-object v2, v1, p0

    .line 26
    .line 27
    :cond_1a
    sget-object v1, Lax/X4/l;->c:[Lax/X4/l$a;

    .line 28
    .line 29
    aget-object v1, v1, p0

    .line 30
    .line 31
    aput-object v1, v0, p0

    .line 32
    .line 33
    goto :goto_29

    .line 34
    :cond_21
    shl-int v1, v2, p0

    .line 35
    .line 36
    invoke-static {v1}, Lax/X4/l;->b(I)Lax/X4/l$a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    aput-object v1, v0, p0

    .line 41
    .line 42
    :goto_29
    add-int/lit8 p0, p0, -0x2

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_2c
    return-object v0
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

.method private static h(I)Lax/X4/l$a;
    .registers 3

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ge p0, v0, :cond_19

    .line 5
    .line 6
    sget-object v0, Lax/X4/l;->d:[Lax/X4/l$a;

    .line 7
    .line 8
    aget-object v0, v0, p0

    .line 9
    .line 10
    if-nez v0, :cond_14

    .line 11
    .line 12
    sget-object v0, Lax/X4/l;->d:[Lax/X4/l$a;

    .line 13
    .line 14
    shl-int/2addr v1, p0

    .line 15
    invoke-static {v1}, Lax/X4/l;->b(I)Lax/X4/l$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    aput-object v1, v0, p0

    .line 20
    .line 21
    :cond_14
    sget-object v0, Lax/X4/l;->d:[Lax/X4/l$a;

    .line 22
    .line 23
    aget-object p0, v0, p0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_19
    shl-int p0, v1, p0

    .line 27
    .line 28
    invoke-static {p0}, Lax/X4/l;->b(I)Lax/X4/l$a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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

.method private static i(Lax/X4/l$a;[Lax/X4/l$a;)V
    .registers 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    rsub-int/lit8 v2, v2, 0x1f

    .line 12
    .line 13
    new-instance v3, Lax/X4/l$b;

    .line 14
    .line 15
    invoke-direct {v3}, Lax/X4/l$b;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lax/X4/l$b;

    .line 19
    .line 20
    invoke-direct {v4}, Lax/X4/l$b;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Lax/X4/l$b;

    .line 24
    .line 25
    invoke-direct {v5}, Lax/X4/l$b;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lax/X4/l$b;

    .line 29
    .line 30
    invoke-direct {v6}, Lax/X4/l$b;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lax/X4/l$b;

    .line 34
    .line 35
    invoke-direct {v7}, Lax/X4/l$b;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v8, Lax/X4/l$b;

    .line 39
    .line 40
    invoke-direct {v8}, Lax/X4/l$b;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v9, Lax/X4/l$b;

    .line 44
    .line 45
    invoke-direct {v9}, Lax/X4/l$b;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v10, Lax/X4/l$b;

    .line 49
    .line 50
    invoke-direct {v10}, Lax/X4/l$b;-><init>()V

    .line 51
    .line 52
    .line 53
    rem-int/lit8 v11, v2, 0x2

    .line 54
    .line 55
    const/4 v13, 0x1

    .line 56
    if-eqz v11, :cond_4f

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_3a
    if-ge v11, v1, :cond_4d

    .line 60
    .line 61
    add-int/lit8 v14, v11, 0x1

    .line 62
    .line 63
    invoke-virtual {v0, v14, v5}, Lax/X4/l$a;->g(ILax/X4/l$b;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v11, v3}, Lax/X4/l$a;->g(ILax/X4/l$b;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v11, v5}, Lax/X4/l$a;->b(ILax/X4/l$b;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v5, v0, v14}, Lax/X4/l$b;->n(Lax/X4/l$b;Lax/X4/l$a;I)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v11, v11, 0x2

    .line 76
    .line 77
    goto :goto_3a

    .line 78
    :cond_4d
    const/4 v11, 0x2

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v11, 0x1

    .line 81
    :goto_50
    new-instance v14, Lax/X4/l$b;

    .line 82
    .line 83
    invoke-direct {v14}, Lax/X4/l$b;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v15, Lax/X4/l$b;

    .line 87
    .line 88
    invoke-direct {v15}, Lax/X4/l$b;-><init>()V

    .line 89
    .line 90
    .line 91
    :goto_5a
    if-gt v11, v2, :cond_e0

    .line 92
    .line 93
    add-int/lit8 v16, v11, -0x1

    .line 94
    .line 95
    aget-object v12, p1, v16

    .line 96
    .line 97
    add-int/lit8 v16, v11, 0x1

    .line 98
    .line 99
    shl-int v16, v13, v16

    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    :goto_65
    if-ge v13, v1, :cond_d7

    .line 103
    .line 104
    move/from16 v17, v11

    .line 105
    .line 106
    const/4 v11, 0x0

    .line 107
    :goto_6a
    move/from16 v18, v13

    .line 108
    .line 109
    div-int/lit8 v13, v16, 0x4

    .line 110
    .line 111
    if-ge v11, v13, :cond_ce

    .line 112
    .line 113
    invoke-virtual {v14, v12, v11}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14, v15}, Lax/X4/l$b;->k(Lax/X4/l$b;)V

    .line 117
    .line 118
    .line 119
    move/from16 v19, v11

    .line 120
    .line 121
    add-int v11, v18, v19

    .line 122
    .line 123
    add-int/2addr v13, v11

    .line 124
    div-int/lit8 v20, v16, 0x2

    .line 125
    .line 126
    move-object/from16 v21, v12

    .line 127
    .line 128
    add-int v12, v11, v20

    .line 129
    .line 130
    mul-int/lit8 v20, v16, 0x3

    .line 131
    .line 132
    div-int/lit8 v20, v20, 0x4

    .line 133
    .line 134
    move/from16 v22, v2

    .line 135
    .line 136
    add-int v2, v11, v20

    .line 137
    .line 138
    invoke-virtual {v0, v11, v3}, Lax/X4/l$a;->g(ILax/X4/l$b;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v13, v14, v4}, Lax/X4/l$a;->p(ILax/X4/l$b;Lax/X4/l$b;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v12, v15, v5}, Lax/X4/l$a;->p(ILax/X4/l$b;Lax/X4/l$b;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v2, v14, v6}, Lax/X4/l$a;->n(ILax/X4/l$b;Lax/X4/l$b;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v4, v7}, Lax/X4/l$b;->c(Lax/X4/l$b;Lax/X4/l$b;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v5}, Lax/X4/l$b;->b(Lax/X4/l$b;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v6}, Lax/X4/l$b;->b(Lax/X4/l$b;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v4, v8}, Lax/X4/l$b;->f(Lax/X4/l$b;Lax/X4/l$b;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v5}, Lax/X4/l$b;->m(Lax/X4/l$b;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v6}, Lax/X4/l$b;->q(Lax/X4/l$b;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v4, v9}, Lax/X4/l$b;->o(Lax/X4/l$b;Lax/X4/l$b;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9, v5}, Lax/X4/l$b;->b(Lax/X4/l$b;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v6}, Lax/X4/l$b;->m(Lax/X4/l$b;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v4, v10}, Lax/X4/l$b;->r(Lax/X4/l$b;Lax/X4/l$b;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, v5}, Lax/X4/l$b;->m(Lax/X4/l$b;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v10, v6}, Lax/X4/l$b;->e(Lax/X4/l$b;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v0, v11}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v0, v13}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v0, v12}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10, v0, v2}, Lax/X4/l$b;->g(Lax/X4/l$a;I)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v11, v19, 0x1

    .line 199
    .line 200
    move/from16 v13, v18

    .line 201
    .line 202
    move-object/from16 v12, v21

    .line 203
    .line 204
    move/from16 v2, v22

    .line 205
    .line 206
    goto :goto_6a

    .line 207
    :cond_ce
    move/from16 v22, v2

    .line 208
    .line 209
    move-object/from16 v21, v12

    .line 210
    .line 211
    add-int v13, v18, v16

    .line 212
    .line 213
    move/from16 v11, v17

    .line 214
    .line 215
    goto :goto_65

    .line 216
    :cond_d7
    move/from16 v22, v2

    .line 217
    .line 218
    move/from16 v17, v11

    .line 219
    .line 220
    add-int/lit8 v11, v17, 0x2

    .line 221
    .line 222
    const/4 v13, 0x1

    .line 223
    goto/16 :goto_5a

    .line 224
    .line 225
    :cond_e0
    const/4 v12, 0x0

    .line 226
    move/from16 v22, v2

    .line 227
    .line 228
    :goto_e3
    if-ge v12, v1, :cond_ee

    .line 229
    .line 230
    move/from16 v2, v22

    .line 231
    .line 232
    neg-int v3, v2

    .line 233
    invoke-virtual {v0, v12, v3}, Lax/X4/l$a;->z(II)V

    .line 234
    .line 235
    .line 236
    add-int/lit8 v12, v12, 0x1

    .line 237
    .line 238
    goto :goto_e3

    .line 239
    :cond_ee
    return-void
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

.method private static j(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V
    .registers 10

    .line 1
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x3

    .line 6
    .line 7
    new-instance v1, Lax/X4/l$a;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2, v0}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    new-instance v2, Lax/X4/l$a;

    .line 15
    .line 16
    mul-int/lit8 v4, v0, 0x2

    .line 17
    .line 18
    invoke-direct {v2, p0, v0, v4}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    new-instance v3, Lax/X4/l$a;

    .line 23
    .line 24
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {v3, p0, v4, v6}, Lax/X4/l$a;-><init>(Lax/X4/l$a;II)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Lax/X4/l;->i(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, p1}, Lax/X4/l;->i(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3, p1}, Lax/X4/l;->i(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lax/X4/l$b;

    .line 41
    .line 42
    invoke-direct {p1}, Lax/X4/l$b;-><init>()V

    .line 43
    .line 44
    .line 45
    :goto_2c
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    div-int/lit8 v4, v4, 0x4

    .line 50
    .line 51
    if-ge v5, v4, :cond_43

    .line 52
    .line 53
    invoke-virtual {p1, p2, v5}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v5, p1}, Lax/X4/l$a;->k(ILax/X4/l$b;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v5, p1}, Lax/X4/l$a;->k(ILax/X4/l$b;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v5, p1}, Lax/X4/l$a;->k(ILax/X4/l$b;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_2c

    .line 68
    :cond_43
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    div-int/lit8 v4, v4, 0x4

    .line 73
    .line 74
    :goto_49
    if-ge v4, v0, :cond_62

    .line 75
    .line 76
    invoke-static {p0}, Lax/X4/l$a;->a(Lax/X4/l$a;)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    div-int/lit8 v5, v5, 0x4

    .line 81
    .line 82
    sub-int v5, v4, v5

    .line 83
    .line 84
    invoke-virtual {p1, p2, v5}, Lax/X4/l$b;->j(Lax/X4/l$a;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4, p1}, Lax/X4/l$a;->l(ILax/X4/l$b;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v4, p1}, Lax/X4/l$a;->l(ILax/X4/l$b;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v4, p1}, Lax/X4/l$a;->l(ILax/X4/l$b;)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_49

    .line 99
    :cond_62
    const/4 v4, -0x1

    .line 100
    const-wide v5, 0x3fd5555555555555L    # 0.3333333333333333

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static/range {v1 .. v6}, Lax/X4/l;->d(Lax/X4/l$a;Lax/X4/l$a;Lax/X4/l$a;ID)V

    .line 106
    .line 107
    .line 108
    return-void
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
.end method

.method static k(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 9

    .line 1
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_47

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_47

    .line 14
    :cond_d
    if-ne p1, p0, :cond_14

    .line 15
    .line 16
    invoke-static {p1}, Lax/X4/l;->m(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_14
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-long v2, v0

    .line 30
    int-to-long v4, v1

    .line 31
    add-long/2addr v2, v4

    .line 32
    const-wide v4, 0x80000000L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long v6, v2, v4

    .line 38
    .line 39
    if-gtz v6, :cond_3f

    .line 40
    .line 41
    const/16 v2, 0x780

    .line 42
    .line 43
    if-le v0, v2, :cond_3a

    .line 44
    .line 45
    if-le v1, v2, :cond_3a

    .line 46
    .line 47
    const v2, 0x81c4

    .line 48
    .line 49
    .line 50
    if-gt v0, v2, :cond_35

    .line 51
    .line 52
    if-le v1, v2, :cond_3a

    .line 53
    .line 54
    :cond_35
    invoke-static {p0, p1}, Lax/X4/l;->l(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_3a
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_3f
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 65
    .line 66
    const-string p1, "BigInteger would overflow supported range"

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_47
    :goto_47
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 73
    .line 74
    return-object p0
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

.method static l(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 9

    .line 1
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-int v0, v0, v1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gez v1, :cond_14

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_14
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-gez v1, :cond_22

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_22
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    array-length v1, p0

    .line 40
    array-length v2, p1

    .line 41
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    mul-int/lit8 v1, v1, 0x8

    .line 46
    .line 47
    invoke-static {v1}, Lax/X4/l;->a(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v1, v2

    .line 52
    const/4 v3, 0x1

    .line 53
    sub-int/2addr v1, v3

    .line 54
    div-int/2addr v1, v2

    .line 55
    add-int/lit8 v4, v1, 0x1

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    rsub-int/lit8 v5, v1, 0x20

    .line 62
    .line 63
    shl-int/2addr v3, v5

    .line 64
    mul-int/lit8 v6, v3, 0x3

    .line 65
    .line 66
    div-int/lit8 v6, v6, 0x4

    .line 67
    .line 68
    if-ge v4, v6, :cond_7a

    .line 69
    .line 70
    const/4 v4, 0x3

    .line 71
    if-le v5, v4, :cond_7a

    .line 72
    .line 73
    rsub-int/lit8 v3, v1, 0x1e

    .line 74
    .line 75
    invoke-static {v3}, Lax/X4/l;->g(I)[Lax/X4/l$a;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v3}, Lax/X4/l;->h(I)Lax/X4/l$a;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    rsub-int/lit8 v1, v1, 0x1c

    .line 84
    .line 85
    invoke-static {v1}, Lax/X4/l;->h(I)Lax/X4/l$a;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {p0, v6, v2}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, v3}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v4, v1}, Lax/X4/l;->e(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v6, v2}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v3}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v4, v1}, Lax/X4/l;->e(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lax/X4/l$a;->q(Lax/X4/l$a;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p0, v4, v1}, Lax/X4/l;->j(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v3}, Lax/X4/l$a;->e(Lax/X4/l$a;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v0, v2}, Lax/X4/l;->f(Lax/X4/l$a;II)Ljava/math/BigInteger;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_7a
    invoke-static {v5}, Lax/X4/l;->g(I)[Lax/X4/l$a;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {p0, v3, v2}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    aget-object v4, v1, v5

    .line 132
    .line 133
    invoke-virtual {p0, v4}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v1}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v3, v2}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    aget-object v3, v1, v5

    .line 144
    .line 145
    invoke-virtual {p1, v3}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1, v1}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lax/X4/l$a;->q(Lax/X4/l$a;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p0, v1}, Lax/X4/l;->i(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 155
    .line 156
    .line 157
    aget-object p1, v1, v5

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Lax/X4/l$a;->e(Lax/X4/l$a;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p0, v0, v2}, Lax/X4/l;->f(Lax/X4/l$a;II)Ljava/math/BigInteger;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
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

.method static m(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_9

    .line 6
    .line 7
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_9
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, 0x81c4

    .line 15
    .line 16
    .line 17
    if-ge v0, v1, :cond_17

    .line 18
    .line 19
    invoke-virtual {p0, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_17
    invoke-static {p0}, Lax/X4/l;->n(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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

.method static n(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 8

    .line 1
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    mul-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    invoke-static {v0}, Lax/X4/l;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/2addr v0, v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v0, v2

    .line 15
    div-int/2addr v0, v1

    .line 16
    add-int/lit8 v3, v0, 0x1

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    rsub-int/lit8 v4, v0, 0x20

    .line 23
    .line 24
    shl-int v5, v2, v4

    .line 25
    .line 26
    mul-int/lit8 v6, v5, 0x3

    .line 27
    .line 28
    div-int/lit8 v6, v6, 0x4

    .line 29
    .line 30
    if-ge v3, v6, :cond_47

    .line 31
    .line 32
    invoke-static {p0, v6, v1}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    rsub-int/lit8 v3, v0, 0x1e

    .line 37
    .line 38
    invoke-static {v3}, Lax/X4/l;->g(I)[Lax/X4/l$a;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v3}, Lax/X4/l;->h(I)Lax/X4/l$a;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    rsub-int/lit8 v0, v0, 0x1c

    .line 47
    .line 48
    invoke-static {v0}, Lax/X4/l;->h(I)Lax/X4/l$a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v3}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v4, v0}, Lax/X4/l;->e(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lax/X4/l$a;->w()V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v4, v0}, Lax/X4/l;->j(Lax/X4/l$a;[Lax/X4/l$a;Lax/X4/l$a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v3}, Lax/X4/l$a;->e(Lax/X4/l$a;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v1}, Lax/X4/l;->f(Lax/X4/l$a;II)Ljava/math/BigInteger;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_47
    invoke-static {p0, v5, v1}, Lax/X4/l;->o([BII)Lax/X4/l$a;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v4}, Lax/X4/l;->g(I)[Lax/X4/l$a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    aget-object v3, v0, v4

    .line 81
    .line 82
    invoke-virtual {p0, v3}, Lax/X4/l$a;->f(Lax/X4/l$a;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v0}, Lax/X4/l;->c(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lax/X4/l$a;->w()V

    .line 89
    .line 90
    .line 91
    invoke-static {p0, v0}, Lax/X4/l;->i(Lax/X4/l$a;[Lax/X4/l$a;)V

    .line 92
    .line 93
    .line 94
    aget-object v0, v0, v4

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lax/X4/l$a;->e(Lax/X4/l$a;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v2, v1}, Lax/X4/l;->f(Lax/X4/l$a;II)Ljava/math/BigInteger;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
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

.method static o([BII)Lax/X4/l$a;
    .registers 15

    .line 1
    new-instance v0, Lax/X4/l$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/X4/l$a;-><init>(I)V

    .line 4
    .line 5
    .line 6
    array-length p1, p0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x4

    .line 9
    if-ge p1, v2, :cond_14

    .line 10
    .line 11
    new-array p1, v2, [B

    .line 12
    .line 13
    array-length v3, p0

    .line 14
    rsub-int/lit8 v3, v3, 0x4

    .line 15
    .line 16
    array-length v4, p0

    .line 17
    invoke-static {p0, v1, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    move-object p0, p1

    .line 21
    :cond_14
    const/4 p1, 0x1

    .line 22
    shl-int/2addr p1, p2

    .line 23
    div-int/lit8 v3, p1, 0x2

    .line 24
    .line 25
    add-int/lit8 v4, p1, -0x1

    .line 26
    .line 27
    rsub-int/lit8 v5, p2, 0x20

    .line 28
    .line 29
    array-length v6, p0

    .line 30
    mul-int/lit8 v6, v6, 0x8

    .line 31
    .line 32
    sub-int/2addr v6, p2

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    :goto_22
    neg-int v9, p2

    .line 36
    if-le v6, v9, :cond_4c

    .line 37
    .line 38
    shr-int/lit8 v9, v6, 0x3

    .line 39
    .line 40
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    array-length v10, p0

    .line 45
    sub-int/2addr v10, v2

    .line 46
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    sub-int v10, v5, v6

    .line 51
    .line 52
    shl-int/lit8 v11, v9, 0x3

    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    invoke-static {p0, v9}, Lax/X4/i;->e([BI)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    ushr-int/2addr v9, v10

    .line 60
    and-int/2addr v9, v4

    .line 61
    add-int/2addr v9, v7

    .line 62
    sub-int v7, v3, v9

    .line 63
    .line 64
    ushr-int/lit8 v7, v7, 0x1f

    .line 65
    .line 66
    neg-int v10, v7

    .line 67
    and-int/2addr v10, p1

    .line 68
    sub-int/2addr v9, v10

    .line 69
    int-to-double v9, v9

    .line 70
    invoke-virtual {v0, v8, v9, v10}, Lax/X4/l$a;->t(ID)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v8, v8, 0x1

    .line 74
    .line 75
    sub-int/2addr v6, p2

    .line 76
    goto :goto_22

    .line 77
    :cond_4c
    if-lez v7, :cond_52

    .line 78
    .line 79
    int-to-double p0, v7

    .line 80
    invoke-virtual {v0, v8, p0, p1}, Lax/X4/l$a;->t(ID)V

    .line 81
    .line 82
    .line 83
    :cond_52
    return-object v0
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
