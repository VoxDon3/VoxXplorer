.class public final Lax/T0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/T0/h$b;,
        Lax/T0/h$m;,
        Lax/T0/h$k;,
        Lax/T0/h$c;,
        Lax/T0/h$d;,
        Lax/T0/h$f;,
        Lax/T0/h$j;,
        Lax/T0/h$a;,
        Lax/T0/h$h;,
        Lax/T0/h$e;,
        Lax/T0/h$i;,
        Lax/T0/h$l;,
        Lax/T0/h$g;
    }
.end annotation


# static fields
.field public static final a:[B

.field public static final b:[F

.field private static final c:Ljava/lang/Object;

.field private static d:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_20

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/T0/h;->a:[B

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_26

    .line 14
    .line 15
    .line 16
    sput-object v0, Lax/T0/h;->b:[F

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lax/T0/h;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    sput-object v0, Lax/T0/h;->d:[I

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_20
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_26
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
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

.method public static A([BII)Lax/T0/h$l;
    .registers 3

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lax/T0/h;->B([BII)Lax/T0/h$l;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static B([BII)Lax/T0/h$l;
    .registers 4

    .line 1
    new-instance v0, Lax/T0/j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lax/T0/j;-><init>([BII)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    new-instance v0, Lax/T0/h$l;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2}, Lax/T0/h$l;-><init>(IIZ)V

    .line 24
    .line 25
    .line 26
    return-object v0
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

.method public static C([BII)Lax/T0/h$m;
    .registers 3

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lax/T0/h;->D([BII)Lax/T0/h$m;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static D([BII)Lax/T0/h$m;
    .registers 35

    .line 1
    new-instance v0, Lax/T0/j;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lax/T0/j;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/16 v2, 0x56

    .line 31
    .line 32
    const/16 v7, 0x2c

    .line 33
    .line 34
    const/16 v8, 0xf4

    .line 35
    .line 36
    const/16 v9, 0x7a

    .line 37
    .line 38
    const/16 v10, 0x6e

    .line 39
    .line 40
    const/4 v11, 0x3

    .line 41
    const/4 v13, 0x1

    .line 42
    const/16 v15, 0x64

    .line 43
    .line 44
    if-eq v3, v15, :cond_51

    .line 45
    .line 46
    if-eq v3, v10, :cond_51

    .line 47
    .line 48
    if-eq v3, v9, :cond_51

    .line 49
    .line 50
    if-eq v3, v8, :cond_51

    .line 51
    .line 52
    if-eq v3, v7, :cond_51

    .line 53
    .line 54
    const/16 v14, 0x53

    .line 55
    .line 56
    if-eq v3, v14, :cond_51

    .line 57
    .line 58
    if-eq v3, v2, :cond_51

    .line 59
    .line 60
    const/16 v14, 0x76

    .line 61
    .line 62
    if-eq v3, v14, :cond_51

    .line 63
    .line 64
    const/16 v14, 0x80

    .line 65
    .line 66
    if-eq v3, v14, :cond_51

    .line 67
    .line 68
    const/16 v14, 0x8a

    .line 69
    .line 70
    if-ne v3, v14, :cond_48

    .line 71
    .line 72
    goto :goto_51

    .line 73
    :cond_48
    const/16 p1, 0x10

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v14, 0x1

    .line 77
    const/16 v16, 0x0

    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    goto :goto_98

    .line 82
    :cond_51
    :goto_51
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-ne v14, v11, :cond_5c

    .line 87
    .line 88
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    goto :goto_5e

    .line 93
    :cond_5c
    const/16 v16, 0x0

    .line 94
    .line 95
    :goto_5e
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 107
    .line 108
    .line 109
    move-result v19

    .line 110
    if-eqz v19, :cond_94

    .line 111
    .line 112
    if-eq v14, v11, :cond_76

    .line 113
    .line 114
    const/16 v12, 0x8

    .line 115
    .line 116
    :goto_73
    const/16 p1, 0x10

    .line 117
    .line 118
    goto :goto_7b

    .line 119
    :cond_76
    const/16 v19, 0xc

    .line 120
    .line 121
    const/16 v12, 0xc

    .line 122
    .line 123
    goto :goto_73

    .line 124
    :goto_7b
    const/4 v1, 0x0

    .line 125
    :goto_7c
    if-ge v1, v12, :cond_96

    .line 126
    .line 127
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 128
    .line 129
    .line 130
    move-result v19

    .line 131
    if-eqz v19, :cond_8f

    .line 132
    .line 133
    const/4 v8, 0x6

    .line 134
    if-ge v1, v8, :cond_8a

    .line 135
    .line 136
    const/16 v8, 0x10

    .line 137
    .line 138
    goto :goto_8c

    .line 139
    :cond_8a
    const/16 v8, 0x40

    .line 140
    .line 141
    :goto_8c
    invoke-static {v0, v8}, Lax/T0/h;->J(Lax/T0/j;I)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    const/16 v8, 0xf4

    .line 147
    .line 148
    goto :goto_7c

    .line 149
    :cond_94
    const/16 p1, 0x10

    .line 150
    .line 151
    :cond_96
    move/from16 v12, v18

    .line 152
    .line 153
    :goto_98
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/lit8 v1, v1, 0x4

    .line 158
    .line 159
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_b0

    .line 164
    .line 165
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 166
    .line 167
    .line 168
    move-result v18

    .line 169
    add-int/lit8 v18, v18, 0x4

    .line 170
    .line 171
    move/from16 v21, v3

    .line 172
    .line 173
    move/from16 v23, v8

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    goto :goto_dc

    .line 177
    :cond_b0
    if-ne v8, v13, :cond_d6

    .line 178
    .line 179
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 180
    .line 181
    .line 182
    move-result v18

    .line 183
    invoke-virtual {v0}, Lax/T0/j;->h()I

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Lax/T0/j;->h()I

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    move/from16 v21, v3

    .line 194
    .line 195
    int-to-long v2, v9

    .line 196
    move/from16 v23, v8

    .line 197
    .line 198
    const/4 v9, 0x0

    .line 199
    :goto_c6
    int-to-long v7, v9

    .line 200
    cmp-long v24, v7, v2

    .line 201
    .line 202
    if-gez v24, :cond_d1

    .line 203
    .line 204
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 205
    .line 206
    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    goto :goto_c6

    .line 210
    :cond_d1
    move/from16 v2, v18

    .line 211
    .line 212
    :goto_d3
    const/16 v18, 0x0

    .line 213
    .line 214
    goto :goto_dc

    .line 215
    :cond_d6
    move/from16 v21, v3

    .line 216
    .line 217
    move/from16 v23, v8

    .line 218
    .line 219
    const/4 v2, 0x0

    .line 220
    goto :goto_d3

    .line 221
    :goto_dc
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    add-int/2addr v3, v13

    .line 233
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    add-int/2addr v8, v13

    .line 238
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    rsub-int/lit8 v24, v9, 0x2

    .line 243
    .line 244
    mul-int v24, v24, v8

    .line 245
    .line 246
    if-nez v9, :cond_fa

    .line 247
    .line 248
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 249
    .line 250
    .line 251
    :cond_fa
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 252
    .line 253
    .line 254
    mul-int/lit8 v3, v3, 0x10

    .line 255
    .line 256
    mul-int/lit8 v24, v24, 0x10

    .line 257
    .line 258
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    const/16 v25, 0x2

    .line 263
    .line 264
    if-eqz v8, :cond_13b

    .line 265
    .line 266
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 271
    .line 272
    .line 273
    move-result v26

    .line 274
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 275
    .line 276
    .line 277
    move-result v27

    .line 278
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 279
    .line 280
    .line 281
    move-result v28

    .line 282
    if-nez v14, :cond_120

    .line 283
    .line 284
    rsub-int/lit8 v14, v9, 0x2

    .line 285
    .line 286
    const/16 v29, 0x1

    .line 287
    .line 288
    goto :goto_130

    .line 289
    :cond_120
    if-ne v14, v11, :cond_125

    .line 290
    .line 291
    const/16 v29, 0x1

    .line 292
    .line 293
    goto :goto_127

    .line 294
    :cond_125
    const/16 v29, 0x2

    .line 295
    .line 296
    :goto_127
    if-ne v14, v13, :cond_12b

    .line 297
    .line 298
    const/4 v14, 0x2

    .line 299
    goto :goto_12c

    .line 300
    :cond_12b
    const/4 v14, 0x1

    .line 301
    :goto_12c
    rsub-int/lit8 v30, v9, 0x2

    .line 302
    .line 303
    mul-int v14, v14, v30

    .line 304
    .line 305
    :goto_130
    add-int v8, v8, v26

    .line 306
    .line 307
    mul-int v8, v8, v29

    .line 308
    .line 309
    sub-int/2addr v3, v8

    .line 310
    add-int v27, v27, v28

    .line 311
    .line 312
    mul-int v27, v27, v14

    .line 313
    .line 314
    sub-int v24, v24, v27

    .line 315
    .line 316
    :cond_13b
    move v8, v3

    .line 317
    move/from16 v3, v21

    .line 318
    .line 319
    const/16 v14, 0x2c

    .line 320
    .line 321
    if-eq v3, v14, :cond_152

    .line 322
    .line 323
    const/16 v14, 0x56

    .line 324
    .line 325
    if-eq v3, v14, :cond_152

    .line 326
    .line 327
    if-eq v3, v15, :cond_152

    .line 328
    .line 329
    if-eq v3, v10, :cond_152

    .line 330
    .line 331
    const/16 v10, 0x7a

    .line 332
    .line 333
    if-eq v3, v10, :cond_152

    .line 334
    .line 335
    const/16 v10, 0xf4

    .line 336
    .line 337
    if-ne v3, v10, :cond_158

    .line 338
    .line 339
    :cond_152
    and-int/lit8 v10, v4, 0x10

    .line 340
    .line 341
    if-eqz v10, :cond_158

    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    goto :goto_15a

    .line 345
    :cond_158
    const/16 v14, 0x10

    .line 346
    .line 347
    :goto_15a
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    const/high16 v19, 0x3f800000    # 1.0f

    .line 352
    .line 353
    if-eqz v10, :cond_245

    .line 354
    .line 355
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-eqz v10, :cond_1a3

    .line 360
    .line 361
    const/16 v10, 0x8

    .line 362
    .line 363
    invoke-virtual {v0, v10}, Lax/T0/j;->f(I)I

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    const/16 v10, 0xff

    .line 368
    .line 369
    if-ne v13, v10, :cond_185

    .line 370
    .line 371
    const/16 v10, 0x10

    .line 372
    .line 373
    invoke-virtual {v0, v10}, Lax/T0/j;->f(I)I

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    invoke-virtual {v0, v10}, Lax/T0/j;->f(I)I

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    if-eqz v13, :cond_1a3

    .line 382
    .line 383
    if-eqz v10, :cond_1a3

    .line 384
    .line 385
    int-to-float v13, v13

    .line 386
    int-to-float v10, v10

    .line 387
    div-float v19, v13, v10

    .line 388
    .line 389
    goto :goto_1a3

    .line 390
    :cond_185
    sget-object v10, Lax/T0/h;->b:[F

    .line 391
    .line 392
    array-length v15, v10

    .line 393
    if-ge v13, v15, :cond_18d

    .line 394
    .line 395
    aget v19, v10, v13

    .line 396
    .line 397
    goto :goto_1a3

    .line 398
    :cond_18d
    new-instance v10, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const-string v15, "Unexpected aspect_ratio_idc value: "

    .line 404
    .line 405
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    const-string v13, "NalUnitUtil"

    .line 416
    .line 417
    invoke-static {v13, v10}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    :cond_1a3
    :goto_1a3
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 421
    .line 422
    .line 423
    move-result v10

    .line 424
    if-eqz v10, :cond_1ac

    .line 425
    .line 426
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 427
    .line 428
    .line 429
    :cond_1ac
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    if-eqz v10, :cond_1e2

    .line 434
    .line 435
    invoke-virtual {v0, v11}, Lax/T0/j;->m(I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    if-eqz v10, :cond_1bd

    .line 443
    .line 444
    const/4 v13, 0x1

    .line 445
    goto :goto_1be

    .line 446
    :cond_1bd
    const/4 v13, 0x2

    .line 447
    :goto_1be
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    if-eqz v10, :cond_1df

    .line 452
    .line 453
    const/16 v10, 0x8

    .line 454
    .line 455
    invoke-virtual {v0, v10}, Lax/T0/j;->f(I)I

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    invoke-virtual {v0, v10}, Lax/T0/j;->f(I)I

    .line 460
    .line 461
    .line 462
    move-result v15

    .line 463
    invoke-virtual {v0, v10}, Lax/T0/j;->m(I)V

    .line 464
    .line 465
    .line 466
    invoke-static {v11}, Lax/P0/j;->k(I)I

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    invoke-static {v15}, Lax/P0/j;->l(I)I

    .line 471
    .line 472
    .line 473
    move-result v15

    .line 474
    move/from16 v31, v15

    .line 475
    .line 476
    move v15, v10

    .line 477
    move/from16 v10, v31

    .line 478
    .line 479
    goto :goto_1e5

    .line 480
    :cond_1df
    const/4 v10, -0x1

    .line 481
    :goto_1e0
    const/4 v15, -0x1

    .line 482
    goto :goto_1e5

    .line 483
    :cond_1e2
    const/4 v10, -0x1

    .line 484
    const/4 v13, -0x1

    .line 485
    goto :goto_1e0

    .line 486
    :goto_1e5
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    if-eqz v11, :cond_1f1

    .line 491
    .line 492
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 496
    .line 497
    .line 498
    :cond_1f1
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_1fc

    .line 503
    .line 504
    const/16 v11, 0x41

    .line 505
    .line 506
    invoke-virtual {v0, v11}, Lax/T0/j;->m(I)V

    .line 507
    .line 508
    .line 509
    :cond_1fc
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 510
    .line 511
    .line 512
    move-result v11

    .line 513
    if-eqz v11, :cond_205

    .line 514
    .line 515
    invoke-static {v0}, Lax/T0/h;->I(Lax/T0/j;)V

    .line 516
    .line 517
    .line 518
    :cond_205
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 519
    .line 520
    .line 521
    move-result v20

    .line 522
    if-eqz v20, :cond_20e

    .line 523
    .line 524
    invoke-static {v0}, Lax/T0/h;->I(Lax/T0/j;)V

    .line 525
    .line 526
    .line 527
    :cond_20e
    if-nez v11, :cond_212

    .line 528
    .line 529
    if-eqz v20, :cond_215

    .line 530
    .line 531
    :cond_212
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 532
    .line 533
    .line 534
    :cond_215
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-eqz v11, :cond_234

    .line 542
    .line 543
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 559
    .line 560
    .line 561
    move-result v14

    .line 562
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 563
    .line 564
    .line 565
    :cond_234
    move/from16 v21, v10

    .line 566
    .line 567
    move/from16 v20, v13

    .line 568
    .line 569
    move/from16 v22, v14

    .line 570
    .line 571
    move/from16 v11, v17

    .line 572
    .line 573
    move/from16 v17, v18

    .line 574
    .line 575
    move/from16 v10, v19

    .line 576
    .line 577
    move/from16 v18, v2

    .line 578
    .line 579
    move/from16 v19, v15

    .line 580
    .line 581
    goto :goto_255

    .line 582
    :cond_245
    move/from16 v22, v14

    .line 583
    .line 584
    move/from16 v11, v17

    .line 585
    .line 586
    move/from16 v17, v18

    .line 587
    .line 588
    const/high16 v10, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/16 v19, -0x1

    .line 591
    .line 592
    const/16 v20, -0x1

    .line 593
    .line 594
    const/16 v21, -0x1

    .line 595
    .line 596
    move/from16 v18, v2

    .line 597
    .line 598
    :goto_255
    new-instance v2, Lax/T0/h$m;

    .line 599
    .line 600
    move v15, v1

    .line 601
    move v14, v9

    .line 602
    move/from16 v13, v16

    .line 603
    .line 604
    move/from16 v16, v23

    .line 605
    .line 606
    move/from16 v9, v24

    .line 607
    .line 608
    invoke-direct/range {v2 .. v22}, Lax/T0/h$m;-><init>(IIIIIIIFIIZZIIIZIIII)V

    .line 609
    .line 610
    .line 611
    return-object v2
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
.end method

.method private static E(Lax/T0/j;I[I[I[[Z)V
    .registers 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    :goto_2
    if-ge v1, p1, :cond_3b

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_a
    aget v5, p2, v1

    .line 12
    .line 13
    if-ge v4, v5, :cond_38

    .line 14
    .line 15
    if-lez v4, :cond_17

    .line 16
    .line 17
    if-eqz v2, :cond_17

    .line 18
    .line 19
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    goto :goto_1c

    .line 24
    :cond_17
    if-nez v4, :cond_1b

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 v5, 0x0

    .line 29
    :goto_1c
    if-eqz v5, :cond_35

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_1f
    aget v6, p3, v1

    .line 33
    .line 34
    if-ge v5, v6, :cond_2f

    .line 35
    .line 36
    aget-object v6, p4, v1

    .line 37
    .line 38
    aget-boolean v6, v6, v5

    .line 39
    .line 40
    if-eqz v6, :cond_2c

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 43
    .line 44
    .line 45
    :cond_2c
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    goto :goto_1f

    .line 48
    :cond_2f
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 52
    .line 53
    .line 54
    :cond_35
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_a

    .line 57
    :cond_38
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3b
    return-void
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

.method private static F(Lax/T0/j;ZI)V
    .registers 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2e

    .line 3
    .line 4
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez p1, :cond_12

    .line 13
    .line 14
    if-eqz v1, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    :goto_10
    const/4 v2, 0x0

    .line 18
    goto :goto_31

    .line 19
    :cond_12
    :goto_12
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1d

    .line 24
    .line 25
    const/16 v3, 0x13

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lax/T0/j;->m(I)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    const/16 v3, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lax/T0/j;->m(I)V

    .line 33
    .line 34
    .line 35
    if-eqz v2, :cond_28

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-virtual {p0, v3}, Lax/T0/j;->m(I)V

    .line 39
    .line 40
    .line 41
    :cond_28
    const/16 v3, 0xf

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lax/T0/j;->m(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_31

    .line 47
    :cond_2e
    const/4 p1, 0x0

    .line 48
    const/4 v1, 0x0

    .line 49
    goto :goto_10

    .line 50
    :goto_31
    const/4 v3, 0x0

    .line 51
    :goto_32
    if-gt v3, p2, :cond_73

    .line 52
    .line 53
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_3e

    .line 58
    .line 59
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    :cond_3e
    if-eqz v4, :cond_45

    .line 64
    .line 65
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    goto :goto_49

    .line 70
    :cond_45
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    :goto_49
    if-nez v4, :cond_50

    .line 75
    .line 76
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    goto :goto_51

    .line 81
    :cond_50
    const/4 v4, 0x0

    .line 82
    :goto_51
    add-int v5, p1, v1

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    :goto_54
    if-ge v6, v5, :cond_70

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    :goto_57
    if-gt v7, v4, :cond_6d

    .line 89
    .line 90
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 94
    .line 95
    .line 96
    if-eqz v2, :cond_67

    .line 97
    .line 98
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 102
    .line 103
    .line 104
    :cond_67
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v7, v7, 0x1

    .line 108
    .line 109
    goto :goto_57

    .line 110
    :cond_6d
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    goto :goto_54

    .line 113
    :cond_70
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_32

    .line 116
    :cond_73
    return-void
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

.method private static G(Lax/T0/j;)V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    const/4 v2, 0x4

    .line 4
    if-ge v1, v2, :cond_36

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_6
    const/4 v4, 0x6

    .line 8
    if-ge v3, v4, :cond_33

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x1

    .line 15
    if-nez v4, :cond_14

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 18
    .line 19
    .line 20
    goto :goto_2d

    .line 21
    :cond_14
    shl-int/lit8 v4, v1, 0x1

    .line 22
    .line 23
    add-int/2addr v4, v2

    .line 24
    shl-int v4, v5, v4

    .line 25
    .line 26
    const/16 v6, 0x40

    .line 27
    .line 28
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-le v1, v5, :cond_24

    .line 33
    .line 34
    invoke-virtual {p0}, Lax/T0/j;->h()I

    .line 35
    .line 36
    .line 37
    :cond_24
    const/4 v6, 0x0

    .line 38
    :goto_25
    if-ge v6, v4, :cond_2d

    .line 39
    .line 40
    invoke-virtual {p0}, Lax/T0/j;->h()I

    .line 41
    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    goto :goto_25

    .line 46
    :cond_2d
    :goto_2d
    const/4 v4, 0x3

    .line 47
    if-ne v1, v4, :cond_31

    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    :cond_31
    add-int/2addr v3, v5

    .line 51
    goto :goto_6

    .line 52
    :cond_33
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_36
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static H(Lax/T0/j;)V
    .registers 19

    .line 1
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    new-array v3, v1, [I

    .line 9
    .line 10
    const/4 v4, -0x1

    .line 11
    const/4 v5, -0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    :goto_c
    if-ge v6, v0, :cond_10d

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v6, :cond_c1

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    if-eqz v8, :cond_c1

    .line 23
    .line 24
    add-int v8, v4, v5

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->e()Z

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    add-int/2addr v10, v7

    .line 35
    mul-int/lit8 v9, v9, 0x2

    .line 36
    .line 37
    rsub-int/lit8 v9, v9, 0x1

    .line 38
    .line 39
    mul-int v9, v9, v10

    .line 40
    .line 41
    add-int/lit8 v10, v8, 0x1

    .line 42
    .line 43
    new-array v11, v10, [Z

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    :goto_2d
    if-gt v12, v8, :cond_41

    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->e()Z

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    if-nez v13, :cond_3c

    .line 53
    .line 54
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->e()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    aput-boolean v13, v11, v12

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    aput-boolean v7, v11, v12

    .line 62
    .line 63
    :goto_3e
    add-int/lit8 v12, v12, 0x1

    .line 64
    .line 65
    goto :goto_2d

    .line 66
    :cond_41
    new-array v7, v10, [I

    .line 67
    .line 68
    new-array v10, v10, [I

    .line 69
    .line 70
    add-int/lit8 v12, v5, -0x1

    .line 71
    .line 72
    const/4 v13, 0x0

    .line 73
    :goto_48
    if-ltz v12, :cond_5d

    .line 74
    .line 75
    aget v14, v3, v12

    .line 76
    .line 77
    add-int/2addr v14, v9

    .line 78
    if-gez v14, :cond_5a

    .line 79
    .line 80
    add-int v15, v4, v12

    .line 81
    .line 82
    aget-boolean v15, v11, v15

    .line 83
    .line 84
    if-eqz v15, :cond_5a

    .line 85
    .line 86
    add-int/lit8 v15, v13, 0x1

    .line 87
    .line 88
    aput v14, v7, v13

    .line 89
    .line 90
    move v13, v15

    .line 91
    :cond_5a
    add-int/lit8 v12, v12, -0x1

    .line 92
    .line 93
    goto :goto_48

    .line 94
    :cond_5d
    if-gez v9, :cond_68

    .line 95
    .line 96
    aget-boolean v12, v11, v8

    .line 97
    .line 98
    if-eqz v12, :cond_68

    .line 99
    .line 100
    add-int/lit8 v12, v13, 0x1

    .line 101
    .line 102
    aput v9, v7, v13

    .line 103
    .line 104
    move v13, v12

    .line 105
    :cond_68
    const/4 v12, 0x0

    .line 106
    :goto_69
    if-ge v12, v4, :cond_7c

    .line 107
    .line 108
    aget v14, v2, v12

    .line 109
    .line 110
    add-int/2addr v14, v9

    .line 111
    if-gez v14, :cond_79

    .line 112
    .line 113
    aget-boolean v15, v11, v12

    .line 114
    .line 115
    if-eqz v15, :cond_79

    .line 116
    .line 117
    add-int/lit8 v15, v13, 0x1

    .line 118
    .line 119
    aput v14, v7, v13

    .line 120
    .line 121
    move v13, v15

    .line 122
    :cond_79
    add-int/lit8 v12, v12, 0x1

    .line 123
    .line 124
    goto :goto_69

    .line 125
    :cond_7c
    invoke-static {v7, v13}, Ljava/util/Arrays;->copyOf([II)[I

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    add-int/lit8 v12, v4, -0x1

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    :goto_83
    if-ltz v12, :cond_97

    .line 133
    .line 134
    aget v15, v2, v12

    .line 135
    .line 136
    add-int/2addr v15, v9

    .line 137
    if-lez v15, :cond_94

    .line 138
    .line 139
    aget-boolean v16, v11, v12

    .line 140
    .line 141
    if-eqz v16, :cond_94

    .line 142
    .line 143
    add-int/lit8 v16, v14, 0x1

    .line 144
    .line 145
    aput v15, v10, v14

    .line 146
    .line 147
    move/from16 v14, v16

    .line 148
    .line 149
    :cond_94
    add-int/lit8 v12, v12, -0x1

    .line 150
    .line 151
    goto :goto_83

    .line 152
    :cond_97
    if-lez v9, :cond_a2

    .line 153
    .line 154
    aget-boolean v2, v11, v8

    .line 155
    .line 156
    if-eqz v2, :cond_a2

    .line 157
    .line 158
    add-int/lit8 v2, v14, 0x1

    .line 159
    .line 160
    aput v9, v10, v14

    .line 161
    .line 162
    move v14, v2

    .line 163
    :cond_a2
    const/4 v2, 0x0

    .line 164
    :goto_a3
    if-ge v2, v5, :cond_b8

    .line 165
    .line 166
    aget v8, v3, v2

    .line 167
    .line 168
    add-int/2addr v8, v9

    .line 169
    if-lez v8, :cond_b5

    .line 170
    .line 171
    add-int v12, v4, v2

    .line 172
    .line 173
    aget-boolean v12, v11, v12

    .line 174
    .line 175
    if-eqz v12, :cond_b5

    .line 176
    .line 177
    add-int/lit8 v12, v14, 0x1

    .line 178
    .line 179
    aput v8, v10, v14

    .line 180
    .line 181
    move v14, v12

    .line 182
    :cond_b5
    add-int/lit8 v2, v2, 0x1

    .line 183
    .line 184
    goto :goto_a3

    .line 185
    :cond_b8
    invoke-static {v10, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v3, v2

    .line 190
    move-object v2, v7

    .line 191
    move v4, v13

    .line 192
    move v5, v14

    .line 193
    goto :goto_109

    .line 194
    :cond_c1
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-array v4, v2, [I

    .line 203
    .line 204
    const/4 v5, 0x0

    .line 205
    :goto_cc
    if-ge v5, v2, :cond_e4

    .line 206
    .line 207
    if-lez v5, :cond_d5

    .line 208
    .line 209
    add-int/lit8 v8, v5, -0x1

    .line 210
    .line 211
    aget v8, v4, v8

    .line 212
    .line 213
    goto :goto_d6

    .line 214
    :cond_d5
    const/4 v8, 0x0

    .line 215
    :goto_d6
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    add-int/2addr v9, v7

    .line 220
    sub-int/2addr v8, v9

    .line 221
    aput v8, v4, v5

    .line 222
    .line 223
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->l()V

    .line 224
    .line 225
    .line 226
    add-int/lit8 v5, v5, 0x1

    .line 227
    .line 228
    goto :goto_cc

    .line 229
    :cond_e4
    new-array v5, v3, [I

    .line 230
    .line 231
    const/4 v8, 0x0

    .line 232
    :goto_e7
    if-ge v8, v3, :cond_ff

    .line 233
    .line 234
    if-lez v8, :cond_f0

    .line 235
    .line 236
    add-int/lit8 v9, v8, -0x1

    .line 237
    .line 238
    aget v9, v5, v9

    .line 239
    .line 240
    goto :goto_f1

    .line 241
    :cond_f0
    const/4 v9, 0x0

    .line 242
    :goto_f1
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->i()I

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    add-int/2addr v10, v7

    .line 247
    add-int/2addr v9, v10

    .line 248
    aput v9, v5, v8

    .line 249
    .line 250
    invoke-virtual/range {p0 .. p0}, Lax/T0/j;->l()V

    .line 251
    .line 252
    .line 253
    add-int/lit8 v8, v8, 0x1

    .line 254
    .line 255
    goto :goto_e7

    .line 256
    :cond_ff
    move-object/from16 v17, v4

    .line 257
    .line 258
    move v4, v2

    .line 259
    move-object/from16 v2, v17

    .line 260
    .line 261
    move-object/from16 v17, v5

    .line 262
    .line 263
    move v5, v3

    .line 264
    move-object/from16 v3, v17

    .line 265
    .line 266
    :goto_109
    add-int/lit8 v6, v6, 0x1

    .line 267
    .line 268
    goto/16 :goto_c

    .line 269
    .line 270
    :cond_10d
    return-void
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

.method private static I(Lax/T0/j;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lax/T0/j;->m(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_c
    if-ge v1, v0, :cond_1a

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_c

    .line 27
    :cond_1a
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lax/T0/j;->m(I)V

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
.end method

.method private static J(Lax/T0/j;I)V
    .registers 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    if-ge v2, p1, :cond_1a

    .line 8
    .line 9
    if-eqz v0, :cond_13

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/T0/j;->h()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, v1

    .line 16
    add-int/lit16 v0, v0, 0x100

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x100

    .line 19
    .line 20
    :cond_13
    if-nez v0, :cond_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    move v1, v0

    .line 24
    :goto_17
    add-int/lit8 v2, v2, 0x1

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
.end method

.method private static K(Lax/T0/j;I[[Z)V
    .registers 8

    .line 1
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_11

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lax/T0/j;->m(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_26

    .line 18
    :cond_11
    const/4 v1, 0x1

    .line 19
    :goto_12
    if-ge v1, p1, :cond_26

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_15
    if-ge v3, v1, :cond_23

    .line 23
    .line 24
    aget-object v4, p2, v1

    .line 25
    .line 26
    aget-boolean v4, v4, v3

    .line 27
    .line 28
    if-eqz v4, :cond_20

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lax/T0/j;->m(I)V

    .line 31
    .line 32
    .line 33
    :cond_20
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_15

    .line 36
    :cond_23
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_12

    .line 39
    :cond_26
    :goto_26
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :goto_2a
    if-gt v2, p1, :cond_34

    .line 44
    .line 45
    const/16 p2, 0x8

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Lax/T0/j;->m(I)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_2a

    .line 53
    :cond_34
    return-void
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

.method public static L([BI)I
    .registers 10

    .line 1
    sget-object v0, Lax/T0/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :cond_6
    :goto_6
    if-ge v2, p1, :cond_29

    .line 8
    .line 9
    :try_start_8
    invoke-static {p0, v2, p1}, Lax/T0/h;->g([BII)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v2, p1, :cond_6

    .line 14
    .line 15
    sget-object v4, Lax/T0/h;->d:[I

    .line 16
    .line 17
    array-length v5, v4

    .line 18
    if-gt v5, v3, :cond_1f

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    mul-int/lit8 v5, v5, 0x2

    .line 22
    .line 23
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sput-object v4, Lax/T0/h;->d:[I

    .line 28
    .line 29
    goto :goto_1f

    .line 30
    :catchall_1d
    move-exception p0

    .line 31
    goto :goto_4d

    .line 32
    :cond_1f
    :goto_1f
    sget-object v4, Lax/T0/h;->d:[I

    .line 33
    .line 34
    add-int/lit8 v5, v3, 0x1

    .line 35
    .line 36
    aput v2, v4, v3

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x3

    .line 39
    .line 40
    move v3, v5

    .line 41
    goto :goto_6

    .line 42
    :cond_29
    sub-int/2addr p1, v3

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2d
    if-ge v2, v3, :cond_46

    .line 47
    .line 48
    sget-object v6, Lax/T0/h;->d:[I

    .line 49
    .line 50
    aget v6, v6, v2

    .line 51
    .line 52
    sub-int/2addr v6, v5

    .line 53
    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    add-int/2addr v4, v6

    .line 57
    add-int/lit8 v7, v4, 0x1

    .line 58
    .line 59
    aput-byte v1, p0, v4

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x2

    .line 62
    .line 63
    aput-byte v1, p0, v7

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x3

    .line 66
    .line 67
    add-int/2addr v5, v6

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_2d

    .line 71
    :cond_46
    sub-int v1, p1, v4

    .line 72
    .line 73
    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    monitor-exit v0

    .line 77
    return p1

    .line 78
    :goto_4d
    monitor-exit v0
    :try_end_4e
    .catchall {:try_start_8 .. :try_end_4e} :catchall_1d

    .line 79
    throw p0
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

.method private static a(IIII)I
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    :cond_4
    add-int/2addr p2, p3

    .line 6
    mul-int v0, v0, p2

    .line 7
    .line 8
    sub-int/2addr p0, v0

    .line 9
    return p0
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
.end method

.method private static b(IIII)I
    .registers 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_8

    .line 4
    .line 5
    if-ne p1, v0, :cond_7

    .line 6
    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    :cond_8
    :goto_8
    add-int/2addr p2, p3

    .line 10
    mul-int v0, v0, p2

    .line 11
    .line 12
    sub-int/2addr p0, v0

    .line 13
    return p0
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
.end method

.method public static c([Z)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

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
.end method

.method private static d(Lax/T0/j;)Ljava/lang/String;
    .registers 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/T0/j;->m(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p0, v1, v0, v2}, Lax/T0/h;->q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget v0, p0, Lax/T0/h$c;->a:I

    .line 20
    .line 21
    iget-boolean v1, p0, Lax/T0/h$c;->b:Z

    .line 22
    .line 23
    iget v2, p0, Lax/T0/h$c;->c:I

    .line 24
    .line 25
    iget v3, p0, Lax/T0/h$c;->d:I

    .line 26
    .line 27
    iget-object v4, p0, Lax/T0/h$c;->e:[I

    .line 28
    .line 29
    iget v5, p0, Lax/T0/h$c;->f:I

    .line 30
    .line 31
    invoke-static/range {v0 .. v5}, Lax/S0/i;->h(IZII[II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
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

.method public static e([BII[Z)I
    .registers 12

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_8

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v3, 0x0

    .line 10
    :goto_9
    invoke-static {v3}, Lax/S0/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return p2

    .line 16
    :cond_f
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_19

    .line 19
    .line 20
    invoke-static {p3}, Lax/T0/h;->c([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_19
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_29

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_29

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_29

    .line 36
    .line 37
    invoke-static {p3}, Lax/T0/h;->c([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_29
    if-le v0, v3, :cond_3e

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_3e

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_3e

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_3e

    .line 57
    .line 58
    invoke-static {p3}, Lax/T0/h;->c([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_3e
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_41
    if-ge p1, v4, :cond_61

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_4a

    .line 73
    .line 74
    goto :goto_5e

    .line 75
    :cond_4a
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_5c

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_5c

    .line 86
    .line 87
    if-ne v5, v2, :cond_5c

    .line 88
    .line 89
    invoke-static {p3}, Lax/T0/h;->c([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_5c
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_5e
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_41

    .line 98
    :cond_61
    if-le v0, v3, :cond_77

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_75

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_75

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_75

    .line 115
    .line 116
    :goto_73
    const/4 p1, 0x1

    .line 117
    goto :goto_91

    .line 118
    :cond_75
    const/4 p1, 0x0

    .line 119
    goto :goto_91

    .line 120
    :cond_77
    if-ne v0, v3, :cond_88

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_75

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_75

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_75

    .line 135
    .line 136
    goto :goto_73

    .line 137
    :cond_88
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_75

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_75

    .line 144
    .line 145
    goto :goto_73

    .line 146
    :goto_91
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_a3

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_a1

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_a1

    .line 159
    .line 160
    :goto_9f
    const/4 p1, 0x1

    .line 161
    goto :goto_ac

    .line 162
    :cond_a1
    const/4 p1, 0x0

    .line 163
    goto :goto_ac

    .line 164
    :cond_a3
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_a1

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_a1

    .line 171
    .line 172
    goto :goto_9f

    .line 173
    :goto_ac
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_b3

    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    :cond_b3
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
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

.method private static f([B)Lax/r7/z;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Z

    .line 3
    .line 4
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_8
    array-length v3, p0

    .line 10
    if-ge v2, v3, :cond_1d

    .line 11
    .line 12
    array-length v3, p0

    .line 13
    invoke-static {p0, v2, v3, v0}, Lax/T0/h;->e([BII[Z)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    array-length v3, p0

    .line 18
    if-eq v2, v3, :cond_1a

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v3}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 25
    .line 26
    .line 27
    :cond_1a
    add-int/lit8 v2, v2, 0x3

    .line 28
    .line 29
    goto :goto_8

    .line 30
    :cond_1d
    invoke-virtual {v1}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
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

.method private static g([BII)I
    .registers 5

    .line 1
    :goto_0
    add-int/lit8 v0, p2, -0x2

    .line 2
    .line 3
    if-ge p1, v0, :cond_19

    .line 4
    .line 5
    aget-byte v0, p0, p1

    .line 6
    .line 7
    if-nez v0, :cond_16

    .line 8
    .line 9
    add-int/lit8 v0, p1, 0x1

    .line 10
    .line 11
    aget-byte v0, p0, v0

    .line 12
    .line 13
    if-nez v0, :cond_16

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x2

    .line 16
    .line 17
    aget-byte v0, p0, v0

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_16

    .line 21
    .line 22
    return p1

    .line 23
    :cond_16
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_19
    return p2
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

.method public static h(Ljava/util/List;)Ljava/lang/String;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_53

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, [B

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x3

    .line 17
    if-le v3, v4, :cond_50

    .line 18
    .line 19
    invoke-static {v2}, Lax/T0/h;->f([B)Lax/r7/z;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x0

    .line 24
    :goto_17
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-ge v6, v7, :cond_50

    .line 29
    .line 30
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    add-int/2addr v7, v4

    .line 41
    if-ge v7, v3, :cond_4d

    .line 42
    .line 43
    new-instance v7, Lax/T0/j;

    .line 44
    .line 45
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    check-cast v8, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    add-int/2addr v8, v4

    .line 56
    invoke-direct {v7, v2, v8, v3}, Lax/T0/j;-><init>([BII)V

    .line 57
    .line 58
    .line 59
    invoke-static {v7}, Lax/T0/h;->p(Lax/T0/j;)Lax/T0/h$b;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    iget v9, v8, Lax/T0/h$b;->a:I

    .line 64
    .line 65
    const/16 v10, 0x21

    .line 66
    .line 67
    if-ne v9, v10, :cond_4d

    .line 68
    .line 69
    iget v8, v8, Lax/T0/h$b;->b:I

    .line 70
    .line 71
    if-nez v8, :cond_4d

    .line 72
    .line 73
    invoke-static {v7}, Lax/T0/h;->d(Lax/T0/j;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_4d
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_17

    .line 81
    :cond_50
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_53
    const/4 p0, 0x0

    .line 85
    return-object p0
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

.method public static i([BI)I
    .registers 2

    .line 1
    add-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit8 p0, p0, 0x7e

    .line 6
    .line 7
    shr-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
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

.method public static j([BI)I
    .registers 2

    .line 1
    add-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit8 p0, p0, 0x1f

    .line 6
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

.method public static k([BIILax/P0/v;)Z
    .registers 6

    .line 1
    iget-object v0, p3, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    invoke-static {p0}, Lax/T0/h;->l(B)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_11
    iget-object v0, p3, Lax/P0/v;->o:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "video/hevc"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_20

    .line 27
    .line 28
    invoke-static {p0, p1, p2, p3}, Lax/T0/h;->m([BIILax/P0/v;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_20
    const/4 p0, 0x1

    .line 34
    return p0
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
.end method

.method public static l(B)Z
    .registers 4

    .line 1
    and-int/lit8 v0, p0, 0x60

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    and-int/lit8 p0, p0, 0x1f

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p0, v1, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    const/16 v2, 0x9

    .line 16
    .line 17
    if-ne p0, v2, :cond_13

    .line 18
    .line 19
    return v0

    .line 20
    :cond_13
    const/16 v2, 0xe

    .line 21
    .line 22
    if-ne p0, v2, :cond_18

    .line 23
    .line 24
    return v0

    .line 25
    :cond_18
    return v1
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

.method private static m([BIILax/P0/v;)Z
    .registers 6

    .line 1
    new-instance v0, Lax/T0/j;

    .line 2
    .line 3
    add-int/2addr p2, p1

    .line 4
    invoke-direct {v0, p0, p1, p2}, Lax/T0/j;-><init>([BII)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lax/T0/h;->p(Lax/T0/j;)Lax/T0/h$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p1, p0, Lax/T0/h$b;->a:I

    .line 12
    .line 13
    const/16 p2, 0x23

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-ne p1, p2, :cond_12

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    const/16 p2, 0xe

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-gt p1, p2, :cond_23

    .line 23
    .line 24
    rem-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-nez p1, :cond_23

    .line 27
    .line 28
    iget p0, p0, Lax/T0/h$b;->c:I

    .line 29
    .line 30
    iget p1, p3, Lax/P0/v;->F:I

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    if-ne p0, p1, :cond_23

    .line 34
    .line 35
    return v0

    .line 36
    :cond_23
    return v1
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
.end method

.method public static n(Lax/P0/v;B)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_13

    .line 11
    .line 12
    iget-object v0, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lax/P0/D;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_18

    .line 19
    .line 20
    :cond_13
    and-int/lit8 v0, p1, 0x1f

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    if-eq v0, v1, :cond_34

    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "video/hevc"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2a

    .line 34
    .line 35
    iget-object p0, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0, v1}, Lax/P0/D;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_32

    .line 42
    .line 43
    :cond_2a
    and-int/lit8 p0, p1, 0x7e

    .line 44
    .line 45
    shr-int/2addr p0, v2

    .line 46
    const/16 p1, 0x27

    .line 47
    .line 48
    if-ne p0, p1, :cond_32

    .line 49
    .line 50
    goto :goto_34

    .line 51
    :cond_32
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_34
    :goto_34
    return v2
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

.method public static o(Lax/P0/v;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_c
    iget-object v0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "video/hevc"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_21

    .line 22
    .line 23
    iget-object p0, p0, Lax/P0/v;->k:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0, v1}, Lax/P0/D;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1f

    .line 30
    .line 31
    goto :goto_21

    .line 32
    :cond_1f
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_21
    :goto_21
    const/4 p0, 0x2

    .line 35
    return p0
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

.method private static p(Lax/T0/j;)Lax/T0/h$b;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-virtual {p0, v2}, Lax/T0/j;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    add-int/lit8 p0, p0, -0x1

    .line 19
    .line 20
    new-instance v2, Lax/T0/h$b;

    .line 21
    .line 22
    invoke-direct {v2, v1, v0, p0}, Lax/T0/h$b;-><init>(III)V

    .line 23
    .line 24
    .line 25
    return-object v2
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

.method private static q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz p1, :cond_42

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Lax/T0/j;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, 0x5

    .line 25
    invoke-virtual {v0, v9}, Lax/T0/j;->f(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    :goto_1e
    const/16 v12, 0x20

    .line 32
    .line 33
    if-ge v10, v12, :cond_2e

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_2b

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    shl-int/2addr v12, v10

    .line 43
    or-int/2addr v11, v12

    .line 44
    :cond_2b
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_1e

    .line 47
    :cond_2e
    const/4 v10, 0x0

    .line 48
    :goto_2f
    if-ge v10, v3, :cond_3a

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lax/T0/j;->f(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    aput v12, v4, v10

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    .line 58
    goto :goto_2f

    .line 59
    :cond_3a
    move v13, v2

    .line 60
    :goto_3b
    move-object/from16 v17, v4

    .line 61
    .line 62
    move v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v11

    .line 65
    .line 66
    goto :goto_57

    .line 67
    :cond_42
    if-eqz v2, :cond_50

    .line 68
    .line 69
    iget v3, v2, Lax/T0/h$c;->a:I

    .line 70
    .line 71
    iget-boolean v8, v2, Lax/T0/h$c;->b:Z

    .line 72
    .line 73
    iget v9, v2, Lax/T0/h$c;->c:I

    .line 74
    .line 75
    iget v11, v2, Lax/T0/h$c;->d:I

    .line 76
    .line 77
    iget-object v4, v2, Lax/T0/h$c;->e:[I

    .line 78
    .line 79
    move v13, v3

    .line 80
    goto :goto_3b

    .line 81
    :cond_50
    move-object/from16 v17, v4

    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    :goto_57
    invoke-virtual {v0, v6}, Lax/T0/j;->f(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    const/4 v2, 0x0

    .line 93
    :goto_5c
    if-ge v7, v1, :cond_71

    .line 94
    .line 95
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_66

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x58

    .line 102
    .line 103
    :cond_66
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6e

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x8

    .line 110
    .line 111
    :cond_6e
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_5c

    .line 114
    :cond_71
    invoke-virtual {v0, v2}, Lax/T0/j;->m(I)V

    .line 115
    .line 116
    .line 117
    if-lez v1, :cond_7c

    .line 118
    .line 119
    sub-int/2addr v6, v1

    .line 120
    mul-int/lit8 v6, v6, 0x2

    .line 121
    .line 122
    invoke-virtual {v0, v6}, Lax/T0/j;->m(I)V

    .line 123
    .line 124
    .line 125
    :cond_7c
    new-instance v12, Lax/T0/h$c;

    .line 126
    .line 127
    invoke-direct/range {v12 .. v18}, Lax/T0/h$c;-><init>(IZII[II)V

    .line 128
    .line 129
    .line 130
    return-object v12
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
.end method

.method private static r(Lax/T0/j;)Lax/T0/h$e;
    .registers 10

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_28

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p0, v2}, Lax/T0/j;->f(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x3

    .line 23
    if-ne v2, v3, :cond_1b

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    const/4 v3, 0x4

    .line 29
    invoke-virtual {p0, v3}, Lax/T0/j;->f(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {p0, v3}, Lax/T0/j;->f(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    move v6, v3

    .line 38
    move v5, v4

    .line 39
    move v4, v2

    .line 40
    goto :goto_2c

    .line 41
    :cond_28
    const/4 v2, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    :goto_2c
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4a

    .line 50
    .line 51
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {v1, v4, v2, v3}, Lax/T0/h;->b(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v0, v4, v7, p0}, Lax/T0/h;->a(IIII)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :cond_4a
    move v8, v0

    .line 76
    move v7, v1

    .line 77
    new-instance v3, Lax/T0/h$e;

    .line 78
    .line 79
    invoke-direct/range {v3 .. v8}, Lax/T0/h$e;-><init>(IIIII)V

    .line 80
    .line 81
    .line 82
    return-object v3
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

.method private static s(Lax/T0/j;I)Lax/T0/h$f;
    .registers 8

    .line 1
    invoke-virtual {p0}, Lax/T0/j;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    invoke-static {v1}, Lax/r7/z;->s(I)Lax/r7/z$a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-array v3, p1, [I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_d
    if-ge v4, v1, :cond_19

    .line 15
    .line 16
    invoke-static {p0}, Lax/T0/h;->r(Lax/T0/j;)Lax/T0/h$e;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v2, v5}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    goto :goto_d

    .line 26
    :cond_19
    const/4 v4, 0x1

    .line 27
    if-le v1, v4, :cond_34

    .line 28
    .line 29
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_34

    .line 34
    .line 35
    int-to-double v0, v1

    .line 36
    sget-object v5, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 37
    .line 38
    invoke-static {v0, v1, v5}, Lax/t7/a;->d(DLjava/math/RoundingMode;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :goto_29
    if-ge v4, p1, :cond_3f

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lax/T0/j;->f(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    aput v1, v3, v4

    .line 49
    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_29

    .line 53
    :cond_34
    :goto_34
    if-ge v4, p1, :cond_3f

    .line 54
    .line 55
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    aput p0, v3, v4

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_34

    .line 64
    :cond_3f
    new-instance p0, Lax/T0/h$f;

    .line 65
    .line 66
    invoke-virtual {v2}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p0, p1, v3}, Lax/T0/h$f;-><init>(Ljava/util/List;[I)V

    .line 71
    .line 72
    .line 73
    return-object p0
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

.method public static t([BII)Lax/T0/h$g;
    .registers 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x2

    .line 4
    .line 5
    add-int/lit8 v2, p2, -0x1

    .line 6
    .line 7
    :goto_6
    aget-byte v3, v0, v2

    .line 8
    .line 9
    if-nez v3, :cond_f

    .line 10
    .line 11
    if-le v2, v1, :cond_f

    .line 12
    .line 13
    add-int/lit8 v2, v2, -0x1

    .line 14
    .line 15
    goto :goto_6

    .line 16
    :cond_f
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_dd

    .line 18
    .line 19
    if-gt v2, v1, :cond_16

    .line 20
    .line 21
    goto/16 :goto_dd

    .line 22
    .line 23
    :cond_16
    new-instance v3, Lax/T0/j;

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Lax/T0/j;-><init>([BII)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    const/16 v0, 0x10

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Lax/T0/j;->c(I)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_dd

    .line 37
    .line 38
    const/16 v0, 0x8

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lax/T0/j;->f(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    :goto_2d
    const/16 v6, 0xff

    .line 47
    .line 48
    if-ne v1, v6, :cond_38

    .line 49
    .line 50
    add-int/lit16 v5, v5, 0xff

    .line 51
    .line 52
    invoke-virtual {v3, v0}, Lax/T0/j;->f(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_2d

    .line 57
    :cond_38
    add-int/2addr v5, v1

    .line 58
    invoke-virtual {v3, v0}, Lax/T0/j;->f(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v7, 0x0

    .line 63
    :goto_3e
    if-ne v1, v6, :cond_47

    .line 64
    .line 65
    add-int/lit16 v7, v7, 0xff

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Lax/T0/j;->f(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_3e

    .line 72
    :cond_47
    add-int/2addr v7, v1

    .line 73
    if-eqz v7, :cond_dd

    .line 74
    .line 75
    invoke-virtual {v3, v7}, Lax/T0/j;->c(I)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_52

    .line 80
    .line 81
    goto/16 :goto_dd

    .line 82
    .line 83
    :cond_52
    const/16 v0, 0xb0

    .line 84
    .line 85
    if-ne v5, v0, :cond_d6

    .line 86
    .line 87
    invoke-virtual {v3}, Lax/T0/j;->i()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-virtual {v3}, Lax/T0/j;->e()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_66

    .line 96
    .line 97
    invoke-virtual {v3}, Lax/T0/j;->i()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    move v10, v1

    .line 102
    goto :goto_67

    .line 103
    :cond_66
    const/4 v10, 0x0

    .line 104
    :goto_67
    invoke-virtual {v3}, Lax/T0/j;->i()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const/4 v5, -0x1

    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v12, -0x1

    .line 111
    const/4 v13, -0x1

    .line 112
    const/4 v14, -0x1

    .line 113
    const/4 v15, -0x1

    .line 114
    const/16 v16, -0x1

    .line 115
    .line 116
    const/16 v17, -0x1

    .line 117
    .line 118
    :goto_75
    if-gt v5, v1, :cond_ce

    .line 119
    .line 120
    invoke-virtual {v3}, Lax/T0/j;->i()I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    invoke-virtual {v3}, Lax/T0/j;->i()I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    const/4 v6, 0x6

    .line 129
    invoke-virtual {v3, v6}, Lax/T0/j;->f(I)I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const/16 v7, 0x3f

    .line 134
    .line 135
    if-ne v14, v7, :cond_89

    .line 136
    .line 137
    return-object v4

    .line 138
    :cond_89
    if-nez v14, :cond_92

    .line 139
    .line 140
    add-int/lit8 v8, v9, -0x1e

    .line 141
    .line 142
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    goto :goto_9a

    .line 147
    :cond_92
    add-int v8, v14, v9

    .line 148
    .line 149
    add-int/lit8 v8, v8, -0x1f

    .line 150
    .line 151
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    :goto_9a
    invoke-virtual {v3, v8}, Lax/T0/j;->f(I)I

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-eqz v0, :cond_c0

    .line 160
    .line 161
    invoke-virtual {v3, v6}, Lax/T0/j;->f(I)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-ne v6, v7, :cond_a7

    .line 166
    .line 167
    return-object v4

    .line 168
    :cond_a7
    if-nez v6, :cond_b0

    .line 169
    .line 170
    add-int/lit8 v7, v10, -0x1e

    .line 171
    .line 172
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    goto :goto_b8

    .line 177
    :cond_b0
    add-int v7, v6, v10

    .line 178
    .line 179
    add-int/lit8 v7, v7, -0x1f

    .line 180
    .line 181
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    :goto_b8
    invoke-virtual {v3, v7}, Lax/T0/j;->f(I)I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    move/from16 v16, v6

    .line 190
    .line 191
    move/from16 v17, v7

    .line 192
    .line 193
    :cond_c0
    invoke-virtual {v3}, Lax/T0/j;->e()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_cb

    .line 198
    .line 199
    const/16 v6, 0xa

    .line 200
    .line 201
    invoke-virtual {v3, v6}, Lax/T0/j;->m(I)V

    .line 202
    .line 203
    .line 204
    :cond_cb
    add-int/lit8 v5, v5, 0x1

    .line 205
    .line 206
    goto :goto_75

    .line 207
    :cond_ce
    new-instance v8, Lax/T0/h$g;

    .line 208
    .line 209
    add-int/lit8 v11, v1, 0x1

    .line 210
    .line 211
    invoke-direct/range {v8 .. v17}, Lax/T0/h$g;-><init>(IIIIIIIII)V

    .line 212
    .line 213
    .line 214
    return-object v8

    .line 215
    :cond_d6
    mul-int/lit8 v7, v7, 0x8

    .line 216
    .line 217
    invoke-virtual {v3, v7}, Lax/T0/j;->m(I)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_1d

    .line 221
    .line 222
    :cond_dd
    :goto_dd
    return-object v4
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

.method public static u([BIILax/T0/h$k;)Lax/T0/h$h;
    .registers 5

    .line 1
    new-instance v0, Lax/T0/j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lax/T0/j;-><init>([BII)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lax/T0/h;->p(Lax/T0/j;)Lax/T0/h$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    add-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    invoke-static {p0, p1, p2, v0, p3}, Lax/T0/h;->v([BIILax/T0/h$b;Lax/T0/h$k;)Lax/T0/h$h;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static v([BIILax/T0/h$b;Lax/T0/h$k;)Lax/T0/h$h;
    .registers 25

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    new-instance v2, Lax/T0/j;

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move/from16 v4, p1

    .line 10
    .line 11
    move/from16 v5, p2

    .line 12
    .line 13
    invoke-direct {v2, v3, v4, v5}, Lax/T0/j;-><init>([BII)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-virtual {v2, v3}, Lax/T0/j;->f(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget v5, v1, Lax/T0/h$b;->b:I

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    const/4 v7, 0x0

    .line 29
    if-eqz v5, :cond_23

    .line 30
    .line 31
    const/4 v5, 0x7

    .line 32
    if-ne v4, v5, :cond_23

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    goto :goto_24

    .line 36
    :cond_23
    const/4 v5, 0x0

    .line 37
    :goto_24
    if-eqz v0, :cond_46

    .line 38
    .line 39
    iget-object v8, v0, Lax/T0/h$k;->b:Lax/r7/z;

    .line 40
    .line 41
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-nez v8, :cond_46

    .line 46
    .line 47
    iget v8, v1, Lax/T0/h$b;->b:I

    .line 48
    .line 49
    iget-object v9, v0, Lax/T0/h$k;->b:Lax/r7/z;

    .line 50
    .line 51
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    sub-int/2addr v9, v6

    .line 56
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    iget-object v9, v0, Lax/T0/h$k;->b:Lax/r7/z;

    .line 61
    .line 62
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    check-cast v8, Lax/T0/h$a;

    .line 67
    .line 68
    iget v8, v8, Lax/T0/h$a;->a:I

    .line 69
    .line 70
    goto :goto_47

    .line 71
    :cond_46
    const/4 v8, 0x0

    .line 72
    :goto_47
    const/4 v9, 0x0

    .line 73
    if-nez v5, :cond_53

    .line 74
    .line 75
    invoke-virtual {v2}, Lax/T0/j;->l()V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v6, v4, v9}, Lax/T0/h;->q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    :cond_51
    :goto_51
    const/4 v10, 0x0

    .line 83
    goto :goto_6e

    .line 84
    :cond_53
    if-eqz v0, :cond_51

    .line 85
    .line 86
    iget-object v10, v0, Lax/T0/h$k;->c:Lax/T0/h$d;

    .line 87
    .line 88
    iget-object v11, v10, Lax/T0/h$d;->b:[I

    .line 89
    .line 90
    aget v11, v11, v8

    .line 91
    .line 92
    iget-object v10, v10, Lax/T0/h$d;->a:Lax/r7/z;

    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-le v10, v11, :cond_51

    .line 99
    .line 100
    iget-object v9, v0, Lax/T0/h$k;->c:Lax/T0/h$d;

    .line 101
    .line 102
    iget-object v9, v9, Lax/T0/h$d;->a:Lax/r7/z;

    .line 103
    .line 104
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    check-cast v9, Lax/T0/h$c;

    .line 109
    .line 110
    goto :goto_51

    .line 111
    :goto_6e
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/16 v11, 0x8

    .line 116
    .line 117
    const/4 v12, -0x1

    .line 118
    if-eqz v5, :cond_b8

    .line 119
    .line 120
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    if-eqz v13, :cond_82

    .line 125
    .line 126
    invoke-virtual {v2, v11}, Lax/T0/j;->f(I)I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    goto :goto_83

    .line 131
    :cond_82
    const/4 v13, -0x1

    .line 132
    :goto_83
    if-eqz v0, :cond_b0

    .line 133
    .line 134
    iget-object v14, v0, Lax/T0/h$k;->d:Lax/T0/h$f;

    .line 135
    .line 136
    if-eqz v14, :cond_b0

    .line 137
    .line 138
    if-ne v13, v12, :cond_8f

    .line 139
    .line 140
    iget-object v13, v14, Lax/T0/h$f;->b:[I

    .line 141
    .line 142
    aget v13, v13, v8

    .line 143
    .line 144
    :cond_8f
    if-eq v13, v12, :cond_b0

    .line 145
    .line 146
    iget-object v14, v14, Lax/T0/h$f;->a:Lax/r7/z;

    .line 147
    .line 148
    invoke-virtual {v14}, Ljava/util/AbstractCollection;->size()I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-le v14, v13, :cond_b0

    .line 153
    .line 154
    iget-object v14, v0, Lax/T0/h$k;->d:Lax/T0/h$f;

    .line 155
    .line 156
    iget-object v14, v14, Lax/T0/h$f;->a:Lax/r7/z;

    .line 157
    .line 158
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    check-cast v13, Lax/T0/h$e;

    .line 163
    .line 164
    iget v14, v13, Lax/T0/h$e;->a:I

    .line 165
    .line 166
    iget v15, v13, Lax/T0/h$e;->d:I

    .line 167
    .line 168
    iget v6, v13, Lax/T0/h$e;->e:I

    .line 169
    .line 170
    iget v10, v13, Lax/T0/h$e;->b:I

    .line 171
    .line 172
    iget v13, v13, Lax/T0/h$e;->c:I

    .line 173
    .line 174
    move v3, v6

    .line 175
    move v12, v15

    .line 176
    goto :goto_fd

    .line 177
    :cond_b0
    const/4 v3, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v12, 0x0

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    goto :goto_fd

    .line 185
    :cond_b8
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-ne v14, v3, :cond_c1

    .line 190
    .line 191
    invoke-virtual {v2}, Lax/T0/j;->l()V

    .line 192
    .line 193
    .line 194
    :cond_c1
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_e8

    .line 207
    .line 208
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v15, v14, v10, v13}, Lax/T0/h;->b(IIII)I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    invoke-static {v6, v14, v12, v3}, Lax/T0/h;->a(IIII)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    goto :goto_ea

    .line 233
    :cond_e8
    move v3, v6

    .line 234
    move v10, v15

    .line 235
    :goto_ea
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    move/from16 v19, v6

    .line 244
    .line 245
    move v6, v3

    .line 246
    move/from16 v3, v19

    .line 247
    .line 248
    move/from16 v19, v15

    .line 249
    .line 250
    move v15, v10

    .line 251
    move v10, v12

    .line 252
    move/from16 v12, v19

    .line 253
    .line 254
    :goto_fd
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 255
    .line 256
    .line 257
    move-result v17

    .line 258
    if-nez v5, :cond_12b

    .line 259
    .line 260
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 261
    .line 262
    .line 263
    move-result v18

    .line 264
    if-eqz v18, :cond_10c

    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    goto :goto_10e

    .line 269
    :cond_10c
    move/from16 v18, v4

    .line 270
    .line 271
    :goto_10e
    move/from16 v11, v18

    .line 272
    .line 273
    const/4 v1, -0x1

    .line 274
    :goto_111
    if-gt v11, v4, :cond_128

    .line 275
    .line 276
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 277
    .line 278
    .line 279
    move/from16 v18, v3

    .line 280
    .line 281
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 290
    .line 291
    .line 292
    add-int/lit8 v11, v11, 0x1

    .line 293
    .line 294
    move/from16 v3, v18

    .line 295
    .line 296
    goto :goto_111

    .line 297
    :cond_128
    :goto_128
    move/from16 v18, v3

    .line 298
    .line 299
    goto :goto_12d

    .line 300
    :cond_12b
    const/4 v1, -0x1

    .line 301
    goto :goto_128

    .line 302
    :goto_12d
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_15d

    .line 325
    .line 326
    if-eqz v5, :cond_14c

    .line 327
    .line 328
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    goto :goto_14d

    .line 333
    :cond_14c
    const/4 v3, 0x0

    .line 334
    :goto_14d
    if-eqz v3, :cond_154

    .line 335
    .line 336
    const/4 v3, 0x6

    .line 337
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_15d

    .line 341
    :cond_154
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_15d

    .line 346
    .line 347
    invoke-static {v2}, Lax/T0/h;->G(Lax/T0/j;)V

    .line 348
    .line 349
    .line 350
    :cond_15d
    :goto_15d
    const/4 v3, 0x2

    .line 351
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    if-eqz v5, :cond_175

    .line 359
    .line 360
    const/16 v5, 0x8

    .line 361
    .line 362
    invoke-virtual {v2, v5}, Lax/T0/j;->m(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Lax/T0/j;->l()V

    .line 372
    .line 373
    .line 374
    :cond_175
    invoke-static {v2}, Lax/T0/h;->H(Lax/T0/j;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-eqz v5, :cond_18e

    .line 382
    .line 383
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    const/4 v11, 0x0

    .line 388
    :goto_183
    if-ge v11, v5, :cond_18e

    .line 389
    .line 390
    add-int/lit8 v3, v17, 0x5

    .line 391
    .line 392
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 393
    .line 394
    .line 395
    add-int/lit8 v11, v11, 0x1

    .line 396
    .line 397
    const/4 v3, 0x2

    .line 398
    goto :goto_183

    .line 399
    :cond_18e
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_25e

    .line 407
    .line 408
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-eqz v5, :cond_1d8

    .line 413
    .line 414
    const/16 v5, 0x8

    .line 415
    .line 416
    invoke-virtual {v2, v5}, Lax/T0/j;->f(I)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    const/16 v5, 0xff

    .line 421
    .line 422
    if-ne v3, v5, :cond_1ba

    .line 423
    .line 424
    const/16 v3, 0x10

    .line 425
    .line 426
    invoke-virtual {v2, v3}, Lax/T0/j;->f(I)I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    invoke-virtual {v2, v3}, Lax/T0/j;->f(I)I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v5, :cond_1d8

    .line 435
    .line 436
    if-eqz v3, :cond_1d8

    .line 437
    .line 438
    int-to-float v5, v5

    .line 439
    int-to-float v3, v3

    .line 440
    div-float v11, v5, v3

    .line 441
    .line 442
    goto :goto_1da

    .line 443
    :cond_1ba
    sget-object v5, Lax/T0/h;->b:[F

    .line 444
    .line 445
    array-length v11, v5

    .line 446
    if-ge v3, v11, :cond_1c2

    .line 447
    .line 448
    aget v11, v5, v3

    .line 449
    .line 450
    goto :goto_1da

    .line 451
    :cond_1c2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    const-string v11, "Unexpected aspect_ratio_idc value: "

    .line 457
    .line 458
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    const-string v5, "NalUnitUtil"

    .line 469
    .line 470
    invoke-static {v5, v3}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    :cond_1d8
    const/high16 v11, 0x3f800000    # 1.0f

    .line 474
    .line 475
    :goto_1da
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-eqz v3, :cond_1e3

    .line 480
    .line 481
    invoke-virtual {v2}, Lax/T0/j;->l()V

    .line 482
    .line 483
    .line 484
    :cond_1e3
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    if-eqz v3, :cond_215

    .line 489
    .line 490
    const/4 v3, 0x3

    .line 491
    invoke-virtual {v2, v3}, Lax/T0/j;->m(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_1f5

    .line 499
    .line 500
    const/4 v0, 0x1

    .line 501
    goto :goto_1f6

    .line 502
    :cond_1f5
    const/4 v0, 0x2

    .line 503
    :goto_1f6
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    if-eqz v3, :cond_212

    .line 508
    .line 509
    const/16 v5, 0x8

    .line 510
    .line 511
    invoke-virtual {v2, v5}, Lax/T0/j;->f(I)I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    invoke-virtual {v2, v5}, Lax/T0/j;->f(I)I

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    invoke-virtual {v2, v5}, Lax/T0/j;->m(I)V

    .line 520
    .line 521
    .line 522
    invoke-static {v3}, Lax/P0/j;->k(I)I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    invoke-static {v8}, Lax/P0/j;->l(I)I

    .line 527
    .line 528
    .line 529
    move-result v5

    .line 530
    goto :goto_23f

    .line 531
    :cond_212
    :goto_212
    const/4 v3, -0x1

    .line 532
    const/4 v5, -0x1

    .line 533
    goto :goto_23f

    .line 534
    :cond_215
    if-eqz v0, :cond_23d

    .line 535
    .line 536
    iget-object v3, v0, Lax/T0/h$k;->e:Lax/T0/h$j;

    .line 537
    .line 538
    if-eqz v3, :cond_23d

    .line 539
    .line 540
    iget-object v5, v3, Lax/T0/h$j;->b:[I

    .line 541
    .line 542
    aget v5, v5, v8

    .line 543
    .line 544
    iget-object v3, v3, Lax/T0/h$j;->a:Lax/r7/z;

    .line 545
    .line 546
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-le v3, v5, :cond_23d

    .line 551
    .line 552
    iget-object v0, v0, Lax/T0/h$k;->e:Lax/T0/h$j;

    .line 553
    .line 554
    iget-object v0, v0, Lax/T0/h$j;->a:Lax/r7/z;

    .line 555
    .line 556
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Lax/T0/h$i;

    .line 561
    .line 562
    iget v3, v0, Lax/T0/h$i;->a:I

    .line 563
    .line 564
    iget v5, v0, Lax/T0/h$i;->b:I

    .line 565
    .line 566
    iget v0, v0, Lax/T0/h$i;->c:I

    .line 567
    .line 568
    move/from16 v19, v5

    .line 569
    .line 570
    move v5, v0

    .line 571
    move/from16 v0, v19

    .line 572
    .line 573
    goto :goto_23f

    .line 574
    :cond_23d
    const/4 v0, -0x1

    .line 575
    goto :goto_212

    .line 576
    :goto_23f
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    if-eqz v8, :cond_24b

    .line 581
    .line 582
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Lax/T0/j;->i()I

    .line 586
    .line 587
    .line 588
    :cond_24b
    invoke-virtual {v2}, Lax/T0/j;->l()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, Lax/T0/j;->e()Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-eqz v2, :cond_256

    .line 596
    .line 597
    mul-int/lit8 v6, v6, 0x2

    .line 598
    .line 599
    :cond_256
    move v2, v4

    .line 600
    move/from16 v16, v5

    .line 601
    .line 602
    move v4, v14

    .line 603
    move v8, v15

    .line 604
    move v15, v0

    .line 605
    move v14, v3

    .line 606
    goto :goto_267

    .line 607
    :cond_25e
    move v2, v4

    .line 608
    move v4, v14

    .line 609
    move v8, v15

    .line 610
    const/high16 v11, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v14, -0x1

    .line 613
    const/4 v15, -0x1

    .line 614
    const/16 v16, -0x1

    .line 615
    .line 616
    :goto_267
    new-instance v0, Lax/T0/h$h;

    .line 617
    .line 618
    move-object v3, v9

    .line 619
    move v5, v10

    .line 620
    move v10, v12

    .line 621
    move v9, v6

    .line 622
    move v12, v11

    .line 623
    move v6, v13

    .line 624
    move/from16 v11, v18

    .line 625
    .line 626
    move v13, v1

    .line 627
    move-object/from16 v1, p3

    .line 628
    .line 629
    invoke-direct/range {v0 .. v16}, Lax/T0/h$h;-><init>(Lax/T0/h$b;ILax/T0/h$c;IIIIIIIIFIIII)V

    .line 630
    .line 631
    .line 632
    return-object v0
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
.end method

.method private static w(Lax/T0/j;)Lax/T0/h$i;
    .registers 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lax/T0/j;->m(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v0, 0x2

    .line 14
    :goto_d
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lax/T0/j;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Lax/P0/j;->k(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0, v1}, Lax/T0/j;->f(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Lax/P0/j;->l(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {p0, v1}, Lax/T0/j;->m(I)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lax/T0/h$i;

    .line 36
    .line 37
    invoke-direct {p0, v2, v0, v3}, Lax/T0/h$i;-><init>(III)V

    .line 38
    .line 39
    .line 40
    return-object p0
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

.method private static x(Lax/T0/j;II[I)Lax/T0/h$j;
    .registers 12

    .line 1
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_d

    .line 13
    :cond_c
    const/4 v0, 0x1

    .line 14
    :goto_d
    if-eqz v0, :cond_12

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/T0/j;->l()V

    .line 17
    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v0, :cond_1f

    .line 29
    .line 30
    if-eqz v2, :cond_4b

    .line 31
    .line 32
    :cond_1f
    const/4 v4, 0x0

    .line 33
    :goto_20
    if-ge v4, p2, :cond_4b

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    :goto_23
    aget v6, p3, v4

    .line 37
    .line 38
    if-ge v5, v6, :cond_48

    .line 39
    .line 40
    if-eqz v0, :cond_2e

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    const/4 v6, 0x0

    .line 48
    :goto_2f
    if-eqz v2, :cond_36

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 v7, 0x0

    .line 56
    :goto_37
    if-eqz v6, :cond_3e

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    invoke-virtual {p0, v6}, Lax/T0/j;->m(I)V

    .line 61
    .line 62
    .line 63
    :cond_3e
    if-eqz v7, :cond_45

    .line 64
    .line 65
    const/16 v6, 0x12

    .line 66
    .line 67
    invoke-virtual {p0, v6}, Lax/T0/j;->m(I)V

    .line 68
    .line 69
    .line 70
    :cond_45
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_23

    .line 73
    :cond_48
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_20

    .line 76
    :cond_4b
    invoke-virtual {p0}, Lax/T0/j;->e()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    const/4 p3, 0x4

    .line 81
    if-eqz p2, :cond_58

    .line 82
    .line 83
    invoke-virtual {p0, p3}, Lax/T0/j;->f(I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v0, v1

    .line 88
    goto :goto_59

    .line 89
    :cond_58
    move v0, p1

    .line 90
    :goto_59
    invoke-static {v0}, Lax/r7/z;->s(I)Lax/r7/z$a;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-array v4, p1, [I

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    :goto_60
    if-ge v5, v0, :cond_6c

    .line 98
    .line 99
    invoke-static {p0}, Lax/T0/h;->w(Lax/T0/j;)Lax/T0/h$i;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v2, v6}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 104
    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_60

    .line 109
    :cond_6c
    if-eqz p2, :cond_7b

    .line 110
    .line 111
    if-le v0, v1, :cond_7b

    .line 112
    .line 113
    :goto_70
    if-ge v3, p1, :cond_7b

    .line 114
    .line 115
    invoke-virtual {p0, p3}, Lax/T0/j;->f(I)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    aput p2, v4, v3

    .line 120
    .line 121
    add-int/lit8 v3, v3, 0x1

    .line 122
    .line 123
    goto :goto_70

    .line 124
    :cond_7b
    new-instance p0, Lax/T0/h$j;

    .line 125
    .line 126
    invoke-virtual {v2}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {p0, p1, v4}, Lax/T0/h$j;-><init>(Ljava/util/List;[I)V

    .line 131
    .line 132
    .line 133
    return-object p0
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
.end method

.method public static y([BII)Lax/T0/h$k;
    .registers 4

    .line 1
    new-instance v0, Lax/T0/j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lax/T0/j;-><init>([BII)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lax/T0/h;->p(Lax/T0/j;)Lax/T0/h$b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {v0, p0}, Lax/T0/h;->z(Lax/T0/j;Lax/T0/h$b;)Lax/T0/h$k;

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

.method private static z(Lax/T0/j;Lax/T0/h$b;)Lax/T0/h$k;
    .registers 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Lax/T0/j;->m(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x6

    .line 16
    invoke-virtual {v0, v4}, Lax/T0/j;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    add-int/lit8 v6, v5, 0x1

    .line 21
    .line 22
    const/4 v7, 0x3

    .line 23
    invoke-virtual {v0, v7}, Lax/T0/j;->f(I)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    const/16 v9, 0x11

    .line 28
    .line 29
    invoke-virtual {v0, v9}, Lax/T0/j;->m(I)V

    .line 30
    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-static {v0, v9, v8, v10}, Lax/T0/h;->q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    const/4 v13, 0x0

    .line 43
    if-eqz v12, :cond_2e

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    goto :goto_2f

    .line 47
    :cond_2e
    move v12, v8

    .line 48
    :goto_2f
    if-gt v12, v8, :cond_3d

    .line 49
    .line 50
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 57
    .line 58
    .line 59
    add-int/lit8 v12, v12, 0x1

    .line 60
    .line 61
    goto :goto_2f

    .line 62
    :cond_3d
    invoke-virtual {v0, v4}, Lax/T0/j;->f(I)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    add-int/2addr v14, v9

    .line 71
    invoke-static {v11}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    new-instance v10, Lax/T0/h$d;

    .line 76
    .line 77
    new-array v1, v9, [I

    .line 78
    .line 79
    invoke-direct {v10, v15, v1}, Lax/T0/h$d;-><init>(Ljava/util/List;[I)V

    .line 80
    .line 81
    .line 82
    const/4 v1, 0x2

    .line 83
    if-lt v6, v1, :cond_58

    .line 84
    .line 85
    if-lt v14, v1, :cond_58

    .line 86
    .line 87
    const/4 v15, 0x1

    .line 88
    goto :goto_59

    .line 89
    :cond_58
    const/4 v15, 0x0

    .line 90
    :goto_59
    if-eqz v2, :cond_5f

    .line 91
    .line 92
    if-eqz v3, :cond_5f

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    goto :goto_60

    .line 96
    :cond_5f
    const/4 v2, 0x0

    .line 97
    :goto_60
    add-int/lit8 v3, v12, 0x1

    .line 98
    .line 99
    if-lt v3, v6, :cond_67

    .line 100
    .line 101
    const/16 v18, 0x1

    .line 102
    .line 103
    goto :goto_69

    .line 104
    :cond_67
    const/16 v18, 0x0

    .line 105
    .line 106
    :goto_69
    if-eqz v15, :cond_6f

    .line 107
    .line 108
    if-eqz v2, :cond_6f

    .line 109
    .line 110
    if-nez v18, :cond_73

    .line 111
    .line 112
    :cond_6f
    move-object/from16 v19, v10

    .line 113
    .line 114
    goto/16 :goto_5ee

    .line 115
    .line 116
    :cond_73
    new-array v2, v1, [I

    .line 117
    .line 118
    aput v3, v2, v9

    .line 119
    .line 120
    aput v14, v2, v13

    .line 121
    .line 122
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    invoke-static {v15, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, [[I

    .line 129
    .line 130
    const/16 v18, 0x1

    .line 131
    .line 132
    new-array v9, v14, [I

    .line 133
    .line 134
    const/16 v19, 0x6

    .line 135
    .line 136
    new-array v4, v14, [I

    .line 137
    .line 138
    aget-object v20, v2, v13

    .line 139
    .line 140
    aput v13, v20, v13

    .line 141
    .line 142
    aput v18, v9, v13

    .line 143
    .line 144
    aput v13, v4, v13

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    :goto_92
    if-ge v1, v14, :cond_b2

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    :goto_97
    if-gt v7, v12, :cond_ae

    .line 153
    .line 154
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 155
    .line 156
    .line 157
    move-result v23

    .line 158
    if-eqz v23, :cond_a9

    .line 159
    .line 160
    aget-object v23, v2, v1

    .line 161
    .line 162
    add-int/lit8 v24, v22, 0x1

    .line 163
    .line 164
    aput v7, v23, v22

    .line 165
    .line 166
    aput v7, v4, v1

    .line 167
    .line 168
    move/from16 v22, v24

    .line 169
    .line 170
    :cond_a9
    aput v22, v9, v1

    .line 171
    .line 172
    add-int/lit8 v7, v7, 0x1

    .line 173
    .line 174
    goto :goto_97

    .line 175
    :cond_ae
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    const/4 v7, 0x3

    .line 178
    goto :goto_92

    .line 179
    :cond_b2
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_e0

    .line 184
    .line 185
    const/16 v1, 0x40

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Lax/T0/j;->m(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_c6

    .line 195
    .line 196
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 197
    .line 198
    .line 199
    :cond_c6
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    const/4 v7, 0x0

    .line 204
    :goto_cb
    if-ge v7, v1, :cond_e0

    .line 205
    .line 206
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 207
    .line 208
    .line 209
    if-eqz v7, :cond_d8

    .line 210
    .line 211
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 212
    .line 213
    .line 214
    move-result v22

    .line 215
    if-eqz v22, :cond_d9

    .line 216
    .line 217
    :cond_d8
    const/4 v13, 0x1

    .line 218
    :cond_d9
    invoke-static {v0, v13, v8}, Lax/T0/h;->F(Lax/T0/j;ZI)V

    .line 219
    .line 220
    .line 221
    add-int/lit8 v7, v7, 0x1

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    goto :goto_cb

    .line 225
    :cond_e0
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_f6

    .line 230
    .line 231
    new-instance v16, Lax/T0/h$k;

    .line 232
    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    const/16 v21, 0x0

    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    move-object/from16 v17, p1

    .line 240
    .line 241
    move-object/from16 v19, v10

    .line 242
    .line 243
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 244
    .line 245
    .line 246
    return-object v16

    .line 247
    :cond_f6
    move-object/from16 v19, v10

    .line 248
    .line 249
    const/4 v1, 0x6

    .line 250
    invoke-virtual {v0}, Lax/T0/j;->b()V

    .line 251
    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    invoke-static {v0, v7, v8, v11}, Lax/T0/h;->q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    const/16 v13, 0x10

    .line 263
    .line 264
    const/16 v23, 0x6

    .line 265
    .line 266
    new-array v1, v13, [Z

    .line 267
    .line 268
    move-object/from16 v24, v1

    .line 269
    .line 270
    move-object/from16 v25, v2

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    const/4 v2, 0x0

    .line 274
    :goto_111
    if-ge v1, v13, :cond_120

    .line 275
    .line 276
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 277
    .line 278
    .line 279
    move-result v26

    .line 280
    aput-boolean v26, v24, v1

    .line 281
    .line 282
    if-eqz v26, :cond_11d

    .line 283
    .line 284
    add-int/lit8 v2, v2, 0x1

    .line 285
    .line 286
    :cond_11d
    add-int/lit8 v1, v1, 0x1

    .line 287
    .line 288
    goto :goto_111

    .line 289
    :cond_120
    if-eqz v2, :cond_5e0

    .line 290
    .line 291
    aget-boolean v1, v24, v18

    .line 292
    .line 293
    if-nez v1, :cond_128

    .line 294
    .line 295
    goto/16 :goto_5e0

    .line 296
    .line 297
    :cond_128
    new-array v1, v2, [I

    .line 298
    .line 299
    move-object/from16 v27, v1

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    :goto_12d
    sub-int v1, v2, v7

    .line 303
    .line 304
    if-ge v13, v1, :cond_13b

    .line 305
    .line 306
    const/4 v1, 0x3

    .line 307
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 308
    .line 309
    .line 310
    move-result v28

    .line 311
    aput v28, v27, v13

    .line 312
    .line 313
    add-int/lit8 v13, v13, 0x1

    .line 314
    .line 315
    goto :goto_12d

    .line 316
    :cond_13b
    add-int/lit8 v1, v2, 0x1

    .line 317
    .line 318
    new-array v1, v1, [I

    .line 319
    .line 320
    if-eqz v7, :cond_161

    .line 321
    .line 322
    const/4 v13, 0x1

    .line 323
    :goto_142
    if-ge v13, v2, :cond_15b

    .line 324
    .line 325
    move-object/from16 v28, v1

    .line 326
    .line 327
    const/4 v1, 0x0

    .line 328
    :goto_147
    if-ge v1, v13, :cond_156

    .line 329
    .line 330
    aget v29, v28, v13

    .line 331
    .line 332
    aget v30, v27, v1

    .line 333
    .line 334
    add-int/lit8 v30, v30, 0x1

    .line 335
    .line 336
    add-int v29, v29, v30

    .line 337
    .line 338
    aput v29, v28, v13

    .line 339
    .line 340
    add-int/lit8 v1, v1, 0x1

    .line 341
    .line 342
    goto :goto_147

    .line 343
    :cond_156
    add-int/lit8 v13, v13, 0x1

    .line 344
    .line 345
    move-object/from16 v1, v28

    .line 346
    .line 347
    goto :goto_142

    .line 348
    :cond_15b
    move-object/from16 v28, v1

    .line 349
    .line 350
    aput v23, v28, v2

    .line 351
    .line 352
    :goto_15f
    const/4 v1, 0x2

    .line 353
    goto :goto_164

    .line 354
    :cond_161
    move-object/from16 v28, v1

    .line 355
    .line 356
    goto :goto_15f

    .line 357
    :goto_164
    new-array v13, v1, [I

    .line 358
    .line 359
    aput v2, v13, v18

    .line 360
    .line 361
    const/16 v22, 0x0

    .line 362
    .line 363
    aput v6, v13, v22

    .line 364
    .line 365
    invoke-static {v15, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    check-cast v1, [[I

    .line 370
    .line 371
    new-array v13, v6, [I

    .line 372
    .line 373
    aput v22, v13, v22

    .line 374
    .line 375
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 376
    .line 377
    .line 378
    move-result v15

    .line 379
    move-object/from16 v29, v1

    .line 380
    .line 381
    const/4 v1, 0x1

    .line 382
    :goto_17d
    if-ge v1, v6, :cond_1c5

    .line 383
    .line 384
    if-eqz v15, :cond_18b

    .line 385
    .line 386
    move/from16 v30, v1

    .line 387
    .line 388
    const/4 v1, 0x6

    .line 389
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 390
    .line 391
    .line 392
    move-result v23

    .line 393
    aput v23, v13, v30

    .line 394
    .line 395
    goto :goto_190

    .line 396
    :cond_18b
    move/from16 v30, v1

    .line 397
    .line 398
    const/4 v1, 0x6

    .line 399
    aput v30, v13, v30

    .line 400
    .line 401
    :goto_190
    if-nez v7, :cond_1a6

    .line 402
    .line 403
    const/4 v1, 0x0

    .line 404
    :goto_193
    if-ge v1, v2, :cond_1c0

    .line 405
    .line 406
    aget-object v31, v29, v30

    .line 407
    .line 408
    aget v32, v27, v1

    .line 409
    .line 410
    move/from16 v33, v1

    .line 411
    .line 412
    add-int/lit8 v1, v32, 0x1

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    aput v1, v31, v33

    .line 419
    .line 420
    add-int/lit8 v1, v33, 0x1

    .line 421
    .line 422
    goto :goto_193

    .line 423
    :cond_1a6
    const/4 v1, 0x0

    .line 424
    :goto_1a7
    if-ge v1, v2, :cond_1c0

    .line 425
    .line 426
    aget-object v31, v29, v30

    .line 427
    .line 428
    aget v32, v13, v30

    .line 429
    .line 430
    add-int/lit8 v33, v1, 0x1

    .line 431
    .line 432
    aget v34, v28, v33

    .line 433
    .line 434
    shl-int v34, v18, v34

    .line 435
    .line 436
    add-int/lit8 v34, v34, -0x1

    .line 437
    .line 438
    and-int v32, v32, v34

    .line 439
    .line 440
    aget v34, v28, v1

    .line 441
    .line 442
    shr-int v32, v32, v34

    .line 443
    .line 444
    aput v32, v31, v1

    .line 445
    .line 446
    move/from16 v1, v33

    .line 447
    .line 448
    goto :goto_1a7

    .line 449
    :cond_1c0
    add-int/lit8 v1, v30, 0x1

    .line 450
    .line 451
    const/16 v23, 0x6

    .line 452
    .line 453
    goto :goto_17d

    .line 454
    :cond_1c5
    new-array v1, v3, [I

    .line 455
    .line 456
    const/4 v2, 0x1

    .line 457
    const/4 v7, 0x0

    .line 458
    :goto_1c9
    const/4 v15, -0x1

    .line 459
    if-ge v7, v6, :cond_20d

    .line 460
    .line 461
    aget v23, v13, v7

    .line 462
    .line 463
    aput v15, v1, v23

    .line 464
    .line 465
    move-object/from16 v26, v1

    .line 466
    .line 467
    const/4 v15, 0x0

    .line 468
    const/16 v23, 0x0

    .line 469
    .line 470
    :goto_1d5
    const/16 v1, 0x10

    .line 471
    .line 472
    if-ge v15, v1, :cond_1ef

    .line 473
    .line 474
    aget-boolean v27, v24, v15

    .line 475
    .line 476
    if-eqz v27, :cond_1ea

    .line 477
    .line 478
    const/4 v1, 0x1

    .line 479
    if-ne v15, v1, :cond_1e8

    .line 480
    .line 481
    aget v1, v13, v7

    .line 482
    .line 483
    aget-object v28, v29, v7

    .line 484
    .line 485
    aget v28, v28, v23

    .line 486
    .line 487
    aput v28, v26, v1

    .line 488
    .line 489
    :cond_1e8
    add-int/lit8 v23, v23, 0x1

    .line 490
    .line 491
    :cond_1ea
    add-int/lit8 v15, v15, 0x1

    .line 492
    .line 493
    const/16 v18, 0x1

    .line 494
    .line 495
    goto :goto_1d5

    .line 496
    :cond_1ef
    if-lez v7, :cond_206

    .line 497
    .line 498
    const/4 v1, 0x0

    .line 499
    :goto_1f2
    if-ge v1, v7, :cond_204

    .line 500
    .line 501
    aget v15, v13, v7

    .line 502
    .line 503
    aget v15, v26, v15

    .line 504
    .line 505
    aget v23, v13, v1

    .line 506
    .line 507
    move/from16 v28, v1

    .line 508
    .line 509
    aget v1, v26, v23

    .line 510
    .line 511
    if-ne v15, v1, :cond_201

    .line 512
    .line 513
    goto :goto_206

    .line 514
    :cond_201
    add-int/lit8 v1, v28, 0x1

    .line 515
    .line 516
    goto :goto_1f2

    .line 517
    :cond_204
    add-int/lit8 v2, v2, 0x1

    .line 518
    .line 519
    :cond_206
    :goto_206
    add-int/lit8 v7, v7, 0x1

    .line 520
    .line 521
    move-object/from16 v1, v26

    .line 522
    .line 523
    const/16 v18, 0x1

    .line 524
    .line 525
    goto :goto_1c9

    .line 526
    :cond_20d
    move-object/from16 v26, v1

    .line 527
    .line 528
    const/4 v1, 0x4

    .line 529
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    const/4 v7, 0x2

    .line 534
    if-lt v2, v7, :cond_5d2

    .line 535
    .line 536
    if-nez v1, :cond_21b

    .line 537
    .line 538
    goto/16 :goto_5d2

    .line 539
    .line 540
    :cond_21b
    new-array v7, v2, [I

    .line 541
    .line 542
    const/4 v15, 0x0

    .line 543
    :goto_21e
    if-ge v15, v2, :cond_229

    .line 544
    .line 545
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 546
    .line 547
    .line 548
    move-result v23

    .line 549
    aput v23, v7, v15

    .line 550
    .line 551
    add-int/lit8 v15, v15, 0x1

    .line 552
    .line 553
    goto :goto_21e

    .line 554
    :cond_229
    new-array v1, v3, [I

    .line 555
    .line 556
    const/4 v15, 0x0

    .line 557
    :goto_22c
    if-ge v15, v6, :cond_23d

    .line 558
    .line 559
    move-object/from16 v23, v1

    .line 560
    .line 561
    aget v1, v13, v15

    .line 562
    .line 563
    invoke-static {v1, v12}, Ljava/lang/Math;->min(II)I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    aput v15, v23, v1

    .line 568
    .line 569
    add-int/lit8 v15, v15, 0x1

    .line 570
    .line 571
    move-object/from16 v1, v23

    .line 572
    .line 573
    goto :goto_22c

    .line 574
    :cond_23d
    move-object/from16 v23, v1

    .line 575
    .line 576
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    const/4 v15, 0x0

    .line 581
    :goto_244
    if-gt v15, v12, :cond_26f

    .line 582
    .line 583
    move/from16 v24, v2

    .line 584
    .line 585
    aget v2, v26, v15

    .line 586
    .line 587
    move-object/from16 v27, v4

    .line 588
    .line 589
    const/16 v18, 0x1

    .line 590
    .line 591
    add-int/lit8 v4, v24, -0x1

    .line 592
    .line 593
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-ltz v2, :cond_259

    .line 598
    .line 599
    aget v2, v7, v2

    .line 600
    .line 601
    goto :goto_25a

    .line 602
    :cond_259
    const/4 v2, -0x1

    .line 603
    :goto_25a
    new-instance v4, Lax/T0/h$a;

    .line 604
    .line 605
    move-object/from16 v28, v7

    .line 606
    .line 607
    aget v7, v23, v15

    .line 608
    .line 609
    invoke-direct {v4, v7, v2}, Lax/T0/h$a;-><init>(II)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v4}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 613
    .line 614
    .line 615
    add-int/lit8 v15, v15, 0x1

    .line 616
    .line 617
    move/from16 v2, v24

    .line 618
    .line 619
    move-object/from16 v4, v27

    .line 620
    .line 621
    move-object/from16 v7, v28

    .line 622
    .line 623
    goto :goto_244

    .line 624
    :cond_26f
    move-object/from16 v27, v4

    .line 625
    .line 626
    invoke-virtual {v1}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    const/4 v7, 0x0

    .line 631
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    check-cast v1, Lax/T0/h$a;

    .line 636
    .line 637
    iget v1, v1, Lax/T0/h$a;->b:I

    .line 638
    .line 639
    const/4 v4, -0x1

    .line 640
    if-ne v1, v4, :cond_28f

    .line 641
    .line 642
    new-instance v16, Lax/T0/h$k;

    .line 643
    .line 644
    const/16 v20, 0x0

    .line 645
    .line 646
    const/16 v21, 0x0

    .line 647
    .line 648
    const/16 v18, 0x0

    .line 649
    .line 650
    move-object/from16 v17, p1

    .line 651
    .line 652
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 653
    .line 654
    .line 655
    return-object v16

    .line 656
    :cond_28f
    const/4 v1, 0x1

    .line 657
    :goto_290
    if-gt v1, v12, :cond_2a2

    .line 658
    .line 659
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    check-cast v4, Lax/T0/h$a;

    .line 664
    .line 665
    iget v4, v4, Lax/T0/h$a;->b:I

    .line 666
    .line 667
    const/4 v7, -0x1

    .line 668
    if-eq v4, v7, :cond_29f

    .line 669
    .line 670
    move v4, v1

    .line 671
    goto :goto_2a4

    .line 672
    :cond_29f
    add-int/lit8 v1, v1, 0x1

    .line 673
    .line 674
    goto :goto_290

    .line 675
    :cond_2a2
    const/4 v7, -0x1

    .line 676
    const/4 v4, -0x1

    .line 677
    :goto_2a4
    if-ne v4, v7, :cond_2b4

    .line 678
    .line 679
    new-instance v16, Lax/T0/h$k;

    .line 680
    .line 681
    const/16 v20, 0x0

    .line 682
    .line 683
    const/16 v21, 0x0

    .line 684
    .line 685
    const/16 v18, 0x0

    .line 686
    .line 687
    move-object/from16 v17, p1

    .line 688
    .line 689
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 690
    .line 691
    .line 692
    return-object v16

    .line 693
    :cond_2b4
    const/4 v1, 0x2

    .line 694
    new-array v7, v1, [I

    .line 695
    .line 696
    const/16 v18, 0x1

    .line 697
    .line 698
    aput v6, v7, v18

    .line 699
    .line 700
    const/16 v22, 0x0

    .line 701
    .line 702
    aput v6, v7, v22

    .line 703
    .line 704
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 705
    .line 706
    invoke-static {v12, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    check-cast v7, [[Z

    .line 711
    .line 712
    new-array v15, v1, [I

    .line 713
    .line 714
    aput v6, v15, v18

    .line 715
    .line 716
    aput v6, v15, v22

    .line 717
    .line 718
    invoke-static {v12, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    check-cast v1, [[Z

    .line 723
    .line 724
    const/4 v15, 0x1

    .line 725
    :goto_2d4
    if-ge v15, v6, :cond_2ef

    .line 726
    .line 727
    move-object/from16 v17, v1

    .line 728
    .line 729
    const/4 v1, 0x0

    .line 730
    :goto_2d9
    if-ge v1, v15, :cond_2ea

    .line 731
    .line 732
    aget-object v23, v7, v15

    .line 733
    .line 734
    aget-object v24, v17, v15

    .line 735
    .line 736
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 737
    .line 738
    .line 739
    move-result v26

    .line 740
    aput-boolean v26, v24, v1

    .line 741
    .line 742
    aput-boolean v26, v23, v1

    .line 743
    .line 744
    add-int/lit8 v1, v1, 0x1

    .line 745
    .line 746
    goto :goto_2d9

    .line 747
    :cond_2ea
    add-int/lit8 v15, v15, 0x1

    .line 748
    .line 749
    move-object/from16 v1, v17

    .line 750
    .line 751
    goto :goto_2d4

    .line 752
    :cond_2ef
    move-object/from16 v17, v1

    .line 753
    .line 754
    const/4 v1, 0x1

    .line 755
    :goto_2f2
    if-ge v1, v6, :cond_31a

    .line 756
    .line 757
    const/4 v15, 0x0

    .line 758
    :goto_2f5
    if-ge v15, v5, :cond_315

    .line 759
    .line 760
    move-object/from16 v23, v13

    .line 761
    .line 762
    const/4 v13, 0x0

    .line 763
    :goto_2fa
    if-ge v13, v1, :cond_310

    .line 764
    .line 765
    aget-object v24, v17, v1

    .line 766
    .line 767
    aget-boolean v26, v24, v13

    .line 768
    .line 769
    if-eqz v26, :cond_30d

    .line 770
    .line 771
    aget-object v26, v17, v13

    .line 772
    .line 773
    aget-boolean v26, v26, v15

    .line 774
    .line 775
    if-eqz v26, :cond_30d

    .line 776
    .line 777
    const/16 v18, 0x1

    .line 778
    .line 779
    aput-boolean v18, v24, v15

    .line 780
    .line 781
    goto :goto_310

    .line 782
    :cond_30d
    add-int/lit8 v13, v13, 0x1

    .line 783
    .line 784
    goto :goto_2fa

    .line 785
    :cond_310
    :goto_310
    add-int/lit8 v15, v15, 0x1

    .line 786
    .line 787
    move-object/from16 v13, v23

    .line 788
    .line 789
    goto :goto_2f5

    .line 790
    :cond_315
    move-object/from16 v23, v13

    .line 791
    .line 792
    add-int/lit8 v1, v1, 0x1

    .line 793
    .line 794
    goto :goto_2f2

    .line 795
    :cond_31a
    move-object/from16 v23, v13

    .line 796
    .line 797
    new-array v1, v3, [I

    .line 798
    .line 799
    const/4 v13, 0x0

    .line 800
    :goto_31f
    if-ge v13, v6, :cond_336

    .line 801
    .line 802
    const/4 v15, 0x0

    .line 803
    const/16 v24, 0x0

    .line 804
    .line 805
    :goto_324
    if-ge v15, v13, :cond_32f

    .line 806
    .line 807
    aget-object v26, v7, v13

    .line 808
    .line 809
    aget-boolean v26, v26, v15

    .line 810
    .line 811
    add-int v24, v24, v26

    .line 812
    .line 813
    add-int/lit8 v15, v15, 0x1

    .line 814
    .line 815
    goto :goto_324

    .line 816
    :cond_32f
    aget v15, v23, v13

    .line 817
    .line 818
    aput v24, v1, v15

    .line 819
    .line 820
    add-int/lit8 v13, v13, 0x1

    .line 821
    .line 822
    goto :goto_31f

    .line 823
    :cond_336
    const/4 v13, 0x0

    .line 824
    const/4 v15, 0x0

    .line 825
    :goto_338
    if-ge v13, v6, :cond_345

    .line 826
    .line 827
    aget v24, v23, v13

    .line 828
    .line 829
    aget v24, v1, v24

    .line 830
    .line 831
    if-nez v24, :cond_342

    .line 832
    .line 833
    add-int/lit8 v15, v15, 0x1

    .line 834
    .line 835
    :cond_342
    add-int/lit8 v13, v13, 0x1

    .line 836
    .line 837
    goto :goto_338

    .line 838
    :cond_345
    const/4 v13, 0x1

    .line 839
    if-le v15, v13, :cond_356

    .line 840
    .line 841
    new-instance v16, Lax/T0/h$k;

    .line 842
    .line 843
    const/16 v20, 0x0

    .line 844
    .line 845
    const/16 v21, 0x0

    .line 846
    .line 847
    const/16 v18, 0x0

    .line 848
    .line 849
    move-object/from16 v17, p1

    .line 850
    .line 851
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 852
    .line 853
    .line 854
    return-object v16

    .line 855
    :cond_356
    new-array v13, v6, [I

    .line 856
    .line 857
    new-array v15, v14, [I

    .line 858
    .line 859
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 860
    .line 861
    .line 862
    move-result v24

    .line 863
    if-eqz v24, :cond_371

    .line 864
    .line 865
    move-object/from16 v24, v1

    .line 866
    .line 867
    const/4 v1, 0x0

    .line 868
    :goto_363
    if-ge v1, v6, :cond_377

    .line 869
    .line 870
    move/from16 v26, v1

    .line 871
    .line 872
    const/4 v1, 0x3

    .line 873
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 874
    .line 875
    .line 876
    move-result v28

    .line 877
    aput v28, v13, v26

    .line 878
    .line 879
    add-int/lit8 v1, v26, 0x1

    .line 880
    .line 881
    goto :goto_363

    .line 882
    :cond_371
    move-object/from16 v24, v1

    .line 883
    .line 884
    const/4 v1, 0x0

    .line 885
    invoke-static {v13, v1, v6, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 886
    .line 887
    .line 888
    :cond_377
    const/4 v1, 0x0

    .line 889
    :goto_378
    if-ge v1, v14, :cond_3a6

    .line 890
    .line 891
    move/from16 v26, v1

    .line 892
    .line 893
    move-object/from16 v29, v7

    .line 894
    .line 895
    move-object/from16 v28, v13

    .line 896
    .line 897
    const/4 v1, 0x0

    .line 898
    const/4 v13, 0x0

    .line 899
    :goto_382
    aget v7, v9, v26

    .line 900
    .line 901
    if-ge v1, v7, :cond_39b

    .line 902
    .line 903
    aget-object v7, v25, v26

    .line 904
    .line 905
    aget v7, v7, v1

    .line 906
    .line 907
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    check-cast v7, Lax/T0/h$a;

    .line 912
    .line 913
    iget v7, v7, Lax/T0/h$a;->a:I

    .line 914
    .line 915
    aget v7, v28, v7

    .line 916
    .line 917
    invoke-static {v13, v7}, Ljava/lang/Math;->max(II)I

    .line 918
    .line 919
    .line 920
    move-result v13

    .line 921
    add-int/lit8 v1, v1, 0x1

    .line 922
    .line 923
    goto :goto_382

    .line 924
    :cond_39b
    add-int/lit8 v13, v13, 0x1

    .line 925
    .line 926
    aput v13, v15, v26

    .line 927
    .line 928
    add-int/lit8 v1, v26, 0x1

    .line 929
    .line 930
    move-object/from16 v13, v28

    .line 931
    .line 932
    move-object/from16 v7, v29

    .line 933
    .line 934
    goto :goto_378

    .line 935
    :cond_3a6
    move-object/from16 v29, v7

    .line 936
    .line 937
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-eqz v1, :cond_3cd

    .line 942
    .line 943
    const/4 v1, 0x0

    .line 944
    :goto_3af
    if-ge v1, v5, :cond_3cd

    .line 945
    .line 946
    add-int/lit8 v7, v1, 0x1

    .line 947
    .line 948
    move v13, v7

    .line 949
    :goto_3b4
    if-ge v13, v6, :cond_3cb

    .line 950
    .line 951
    aget-object v26, v29, v13

    .line 952
    .line 953
    aget-boolean v26, v26, v1

    .line 954
    .line 955
    if-eqz v26, :cond_3c3

    .line 956
    .line 957
    move/from16 v26, v1

    .line 958
    .line 959
    const/4 v1, 0x3

    .line 960
    invoke-virtual {v0, v1}, Lax/T0/j;->m(I)V

    .line 961
    .line 962
    .line 963
    goto :goto_3c6

    .line 964
    :cond_3c3
    move/from16 v26, v1

    .line 965
    .line 966
    const/4 v1, 0x3

    .line 967
    :goto_3c6
    add-int/lit8 v13, v13, 0x1

    .line 968
    .line 969
    move/from16 v1, v26

    .line 970
    .line 971
    goto :goto_3b4

    .line 972
    :cond_3cb
    move v1, v7

    .line 973
    goto :goto_3af

    .line 974
    :cond_3cd
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 978
    .line 979
    .line 980
    move-result v1

    .line 981
    const/4 v13, 0x1

    .line 982
    add-int/2addr v1, v13

    .line 983
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    invoke-virtual {v5, v11}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 988
    .line 989
    .line 990
    if-le v1, v13, :cond_3f3

    .line 991
    .line 992
    invoke-virtual {v5, v10}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 993
    .line 994
    .line 995
    const/4 v7, 0x2

    .line 996
    :goto_3e3
    if-ge v7, v1, :cond_3f3

    .line 997
    .line 998
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 999
    .line 1000
    .line 1001
    move-result v11

    .line 1002
    invoke-static {v0, v11, v8, v10}, Lax/T0/h;->q(Lax/T0/j;ZILax/T0/h$c;)Lax/T0/h$c;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v10

    .line 1006
    invoke-virtual {v5, v10}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    .line 1007
    .line 1008
    .line 1009
    add-int/lit8 v7, v7, 0x1

    .line 1010
    .line 1011
    goto :goto_3e3

    .line 1012
    :cond_3f3
    invoke-virtual {v5}, Lax/r7/z$a;->k()Lax/r7/z;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v5

    .line 1016
    invoke-virtual {v0}, Lax/T0/j;->i()I

    .line 1017
    .line 1018
    .line 1019
    move-result v7

    .line 1020
    add-int/2addr v7, v14

    .line 1021
    if-le v7, v14, :cond_40c

    .line 1022
    .line 1023
    new-instance v16, Lax/T0/h$k;

    .line 1024
    .line 1025
    const/16 v20, 0x0

    .line 1026
    .line 1027
    const/16 v21, 0x0

    .line 1028
    .line 1029
    const/16 v18, 0x0

    .line 1030
    .line 1031
    move-object/from16 v17, p1

    .line 1032
    .line 1033
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1034
    .line 1035
    .line 1036
    return-object v16

    .line 1037
    :cond_40c
    const/4 v8, 0x2

    .line 1038
    invoke-virtual {v0, v8}, Lax/T0/j;->f(I)I

    .line 1039
    .line 1040
    .line 1041
    move-result v10

    .line 1042
    new-array v11, v8, [I

    .line 1043
    .line 1044
    const/16 v18, 0x1

    .line 1045
    .line 1046
    aput v3, v11, v18

    .line 1047
    .line 1048
    const/4 v8, 0x0

    .line 1049
    aput v7, v11, v8

    .line 1050
    .line 1051
    invoke-static {v12, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v11

    .line 1055
    check-cast v11, [[Z

    .line 1056
    .line 1057
    new-array v13, v7, [I

    .line 1058
    .line 1059
    const/16 v22, 0x0

    .line 1060
    .line 1061
    new-array v8, v7, [I

    .line 1062
    .line 1063
    move-object/from16 v21, v8

    .line 1064
    .line 1065
    const/4 v8, 0x0

    .line 1066
    :goto_429
    if-ge v8, v14, :cond_487

    .line 1067
    .line 1068
    aput v22, v13, v8

    .line 1069
    .line 1070
    aget v26, v27, v8

    .line 1071
    .line 1072
    aput v26, v21, v8

    .line 1073
    .line 1074
    if-nez v10, :cond_44d

    .line 1075
    .line 1076
    move/from16 v26, v8

    .line 1077
    .line 1078
    aget-object v8, v11, v26

    .line 1079
    .line 1080
    move-object/from16 v28, v11

    .line 1081
    .line 1082
    aget v11, v9, v26

    .line 1083
    .line 1084
    move-object/from16 v31, v5

    .line 1085
    .line 1086
    move-object/from16 v30, v13

    .line 1087
    .line 1088
    const/4 v5, 0x0

    .line 1089
    const/4 v13, 0x1

    .line 1090
    invoke-static {v8, v5, v11, v13}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1091
    .line 1092
    .line 1093
    aget v5, v9, v26

    .line 1094
    .line 1095
    aput v5, v30, v26

    .line 1096
    .line 1097
    const/16 v18, 0x1

    .line 1098
    .line 1099
    :goto_44a
    const/16 v22, 0x0

    .line 1100
    .line 1101
    goto :goto_47e

    .line 1102
    :cond_44d
    move-object/from16 v31, v5

    .line 1103
    .line 1104
    move/from16 v26, v8

    .line 1105
    .line 1106
    move-object/from16 v28, v11

    .line 1107
    .line 1108
    move-object/from16 v30, v13

    .line 1109
    .line 1110
    const/4 v13, 0x1

    .line 1111
    if-ne v10, v13, :cond_474

    .line 1112
    .line 1113
    aget v5, v27, v26

    .line 1114
    .line 1115
    const/4 v8, 0x0

    .line 1116
    :goto_45b
    aget v11, v9, v26

    .line 1117
    .line 1118
    if-ge v8, v11, :cond_46f

    .line 1119
    .line 1120
    aget-object v11, v28, v26

    .line 1121
    .line 1122
    aget-object v13, v25, v26

    .line 1123
    .line 1124
    aget v13, v13, v8

    .line 1125
    .line 1126
    if-ne v13, v5, :cond_469

    .line 1127
    .line 1128
    const/4 v13, 0x1

    .line 1129
    goto :goto_46a

    .line 1130
    :cond_469
    const/4 v13, 0x0

    .line 1131
    :goto_46a
    aput-boolean v13, v11, v8

    .line 1132
    .line 1133
    add-int/lit8 v8, v8, 0x1

    .line 1134
    .line 1135
    goto :goto_45b

    .line 1136
    :cond_46f
    const/16 v18, 0x1

    .line 1137
    .line 1138
    aput v18, v30, v26

    .line 1139
    .line 1140
    goto :goto_44a

    .line 1141
    :cond_474
    const/16 v18, 0x1

    .line 1142
    .line 1143
    const/16 v22, 0x0

    .line 1144
    .line 1145
    aget-object v5, v28, v22

    .line 1146
    .line 1147
    aput-boolean v18, v5, v22

    .line 1148
    .line 1149
    aput v18, v30, v22

    .line 1150
    .line 1151
    :goto_47e
    add-int/lit8 v8, v26, 0x1

    .line 1152
    .line 1153
    move-object/from16 v11, v28

    .line 1154
    .line 1155
    move-object/from16 v13, v30

    .line 1156
    .line 1157
    move-object/from16 v5, v31

    .line 1158
    .line 1159
    goto :goto_429

    .line 1160
    :cond_487
    move-object/from16 v31, v5

    .line 1161
    .line 1162
    move-object/from16 v28, v11

    .line 1163
    .line 1164
    move-object/from16 v30, v13

    .line 1165
    .line 1166
    const/16 v18, 0x1

    .line 1167
    .line 1168
    new-array v5, v3, [I

    .line 1169
    .line 1170
    const/4 v8, 0x2

    .line 1171
    new-array v11, v8, [I

    .line 1172
    .line 1173
    aput v3, v11, v18

    .line 1174
    .line 1175
    aput v7, v11, v22

    .line 1176
    .line 1177
    invoke-static {v12, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v3

    .line 1181
    check-cast v3, [[Z

    .line 1182
    .line 1183
    const/4 v11, 0x1

    .line 1184
    const/4 v12, 0x0

    .line 1185
    :goto_4a0
    if-ge v11, v7, :cond_57d

    .line 1186
    .line 1187
    if-ne v10, v8, :cond_4c6

    .line 1188
    .line 1189
    const/4 v8, 0x0

    .line 1190
    :goto_4a5
    aget v13, v9, v11

    .line 1191
    .line 1192
    if-ge v8, v13, :cond_4c6

    .line 1193
    .line 1194
    aget-object v13, v28, v11

    .line 1195
    .line 1196
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 1197
    .line 1198
    .line 1199
    move-result v26

    .line 1200
    aput-boolean v26, v13, v8

    .line 1201
    .line 1202
    aget v13, v30, v11

    .line 1203
    .line 1204
    aget-object v26, v28, v11

    .line 1205
    .line 1206
    aget-boolean v26, v26, v8

    .line 1207
    .line 1208
    add-int v13, v13, v26

    .line 1209
    .line 1210
    aput v13, v30, v11

    .line 1211
    .line 1212
    if-eqz v26, :cond_4c3

    .line 1213
    .line 1214
    aget-object v13, v25, v11

    .line 1215
    .line 1216
    aget v13, v13, v8

    .line 1217
    .line 1218
    aput v13, v21, v11

    .line 1219
    .line 1220
    :cond_4c3
    add-int/lit8 v8, v8, 0x1

    .line 1221
    .line 1222
    goto :goto_4a5

    .line 1223
    :cond_4c6
    if-nez v12, :cond_4eb

    .line 1224
    .line 1225
    aget-object v8, v25, v11

    .line 1226
    .line 1227
    const/16 v22, 0x0

    .line 1228
    .line 1229
    aget v8, v8, v22

    .line 1230
    .line 1231
    if-nez v8, :cond_4ed

    .line 1232
    .line 1233
    aget-object v8, v28, v11

    .line 1234
    .line 1235
    aget-boolean v8, v8, v22

    .line 1236
    .line 1237
    if-eqz v8, :cond_4ed

    .line 1238
    .line 1239
    const/4 v8, 0x1

    .line 1240
    :goto_4d7
    aget v13, v9, v11

    .line 1241
    .line 1242
    if-ge v8, v13, :cond_4ed

    .line 1243
    .line 1244
    aget-object v13, v25, v11

    .line 1245
    .line 1246
    aget v13, v13, v8

    .line 1247
    .line 1248
    if-ne v13, v4, :cond_4e8

    .line 1249
    .line 1250
    aget-object v13, v28, v11

    .line 1251
    .line 1252
    aget-boolean v13, v13, v4

    .line 1253
    .line 1254
    if-eqz v13, :cond_4e8

    .line 1255
    .line 1256
    move v12, v11

    .line 1257
    :cond_4e8
    add-int/lit8 v8, v8, 0x1

    .line 1258
    .line 1259
    goto :goto_4d7

    .line 1260
    :cond_4eb
    const/16 v22, 0x0

    .line 1261
    .line 1262
    :cond_4ed
    const/4 v8, 0x0

    .line 1263
    :goto_4ee
    aget v13, v9, v11

    .line 1264
    .line 1265
    if-ge v8, v13, :cond_560

    .line 1266
    .line 1267
    const/4 v13, 0x1

    .line 1268
    if-le v1, v13, :cond_553

    .line 1269
    .line 1270
    aget-object v13, v3, v11

    .line 1271
    .line 1272
    aget-object v26, v28, v11

    .line 1273
    .line 1274
    aget-boolean v26, v26, v8

    .line 1275
    .line 1276
    aput-boolean v26, v13, v8

    .line 1277
    .line 1278
    move v13, v4

    .line 1279
    move-object/from16 v26, v5

    .line 1280
    .line 1281
    int-to-double v4, v1

    .line 1282
    move/from16 v27, v1

    .line 1283
    .line 1284
    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1285
    .line 1286
    invoke-static {v4, v5, v1}, Lax/t7/a;->d(DLjava/math/RoundingMode;)I

    .line 1287
    .line 1288
    .line 1289
    move-result v1

    .line 1290
    aget-object v4, v3, v11

    .line 1291
    .line 1292
    aget-boolean v4, v4, v8

    .line 1293
    .line 1294
    if-nez v4, :cond_53e

    .line 1295
    .line 1296
    aget-object v4, v25, v11

    .line 1297
    .line 1298
    aget v4, v4, v8

    .line 1299
    .line 1300
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v4

    .line 1304
    check-cast v4, Lax/T0/h$a;

    .line 1305
    .line 1306
    iget v4, v4, Lax/T0/h$a;->a:I

    .line 1307
    .line 1308
    const/4 v5, 0x0

    .line 1309
    :goto_51c
    if-ge v5, v8, :cond_53e

    .line 1310
    .line 1311
    aget-object v32, v25, v11

    .line 1312
    .line 1313
    move/from16 v33, v4

    .line 1314
    .line 1315
    aget v4, v32, v5

    .line 1316
    .line 1317
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    check-cast v4, Lax/T0/h$a;

    .line 1322
    .line 1323
    iget v4, v4, Lax/T0/h$a;->a:I

    .line 1324
    .line 1325
    aget-object v32, v17, v33

    .line 1326
    .line 1327
    aget-boolean v4, v32, v4

    .line 1328
    .line 1329
    if-eqz v4, :cond_539

    .line 1330
    .line 1331
    aget-object v4, v3, v11

    .line 1332
    .line 1333
    const/16 v18, 0x1

    .line 1334
    .line 1335
    aput-boolean v18, v4, v8

    .line 1336
    .line 1337
    goto :goto_53e

    .line 1338
    :cond_539
    add-int/lit8 v5, v5, 0x1

    .line 1339
    .line 1340
    move/from16 v4, v33

    .line 1341
    .line 1342
    goto :goto_51c

    .line 1343
    :cond_53e
    :goto_53e
    aget-object v4, v3, v11

    .line 1344
    .line 1345
    aget-boolean v4, v4, v8

    .line 1346
    .line 1347
    if-eqz v4, :cond_558

    .line 1348
    .line 1349
    if-lez v12, :cond_54f

    .line 1350
    .line 1351
    if-ne v11, v12, :cond_54f

    .line 1352
    .line 1353
    invoke-virtual {v0, v1}, Lax/T0/j;->f(I)I

    .line 1354
    .line 1355
    .line 1356
    move-result v1

    .line 1357
    aput v1, v26, v8

    .line 1358
    .line 1359
    goto :goto_558

    .line 1360
    :cond_54f
    invoke-virtual {v0, v1}, Lax/T0/j;->m(I)V

    .line 1361
    .line 1362
    .line 1363
    goto :goto_558

    .line 1364
    :cond_553
    move/from16 v27, v1

    .line 1365
    .line 1366
    move v13, v4

    .line 1367
    move-object/from16 v26, v5

    .line 1368
    .line 1369
    :cond_558
    :goto_558
    add-int/lit8 v8, v8, 0x1

    .line 1370
    .line 1371
    move v4, v13

    .line 1372
    move-object/from16 v5, v26

    .line 1373
    .line 1374
    move/from16 v1, v27

    .line 1375
    .line 1376
    goto :goto_4ee

    .line 1377
    :cond_560
    move/from16 v27, v1

    .line 1378
    .line 1379
    move v13, v4

    .line 1380
    move-object/from16 v26, v5

    .line 1381
    .line 1382
    aget v1, v30, v11

    .line 1383
    .line 1384
    const/4 v4, 0x1

    .line 1385
    if-ne v1, v4, :cond_573

    .line 1386
    .line 1387
    aget v1, v21, v11

    .line 1388
    .line 1389
    aget v1, v24, v1

    .line 1390
    .line 1391
    if-lez v1, :cond_573

    .line 1392
    .line 1393
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 1394
    .line 1395
    .line 1396
    :cond_573
    add-int/lit8 v11, v11, 0x1

    .line 1397
    .line 1398
    move v4, v13

    .line 1399
    move-object/from16 v5, v26

    .line 1400
    .line 1401
    move/from16 v1, v27

    .line 1402
    .line 1403
    const/4 v8, 0x2

    .line 1404
    goto/16 :goto_4a0

    .line 1405
    .line 1406
    :cond_57d
    move-object/from16 v26, v5

    .line 1407
    .line 1408
    const/4 v4, 0x1

    .line 1409
    if-nez v12, :cond_590

    .line 1410
    .line 1411
    new-instance v16, Lax/T0/h$k;

    .line 1412
    .line 1413
    const/16 v20, 0x0

    .line 1414
    .line 1415
    const/16 v21, 0x0

    .line 1416
    .line 1417
    const/16 v18, 0x0

    .line 1418
    .line 1419
    move-object/from16 v17, p1

    .line 1420
    .line 1421
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1422
    .line 1423
    .line 1424
    return-object v16

    .line 1425
    :cond_590
    const/16 v18, 0x1

    .line 1426
    .line 1427
    invoke-static {v0, v6}, Lax/T0/h;->s(Lax/T0/j;I)Lax/T0/h$f;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v4

    .line 1431
    const/4 v1, 0x2

    .line 1432
    invoke-virtual {v0, v1}, Lax/T0/j;->m(I)V

    .line 1433
    .line 1434
    .line 1435
    const/4 v1, 0x1

    .line 1436
    :goto_59b
    if-ge v1, v6, :cond_5a9

    .line 1437
    .line 1438
    aget v5, v23, v1

    .line 1439
    .line 1440
    aget v5, v24, v5

    .line 1441
    .line 1442
    if-nez v5, :cond_5a6

    .line 1443
    .line 1444
    invoke-virtual {v0}, Lax/T0/j;->l()V

    .line 1445
    .line 1446
    .line 1447
    :cond_5a6
    add-int/lit8 v1, v1, 0x1

    .line 1448
    .line 1449
    goto :goto_59b

    .line 1450
    :cond_5a9
    invoke-static {v0, v7, v15, v9, v3}, Lax/T0/h;->E(Lax/T0/j;I[I[I[[Z)V

    .line 1451
    .line 1452
    .line 1453
    move-object/from16 v7, v29

    .line 1454
    .line 1455
    invoke-static {v0, v6, v7}, Lax/T0/h;->K(Lax/T0/j;I[[Z)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v0}, Lax/T0/j;->e()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v1

    .line 1462
    if-eqz v1, :cond_5c0

    .line 1463
    .line 1464
    invoke-virtual {v0}, Lax/T0/j;->b()V

    .line 1465
    .line 1466
    .line 1467
    invoke-static {v0, v6, v14, v15}, Lax/T0/h;->x(Lax/T0/j;II[I)Lax/T0/h$j;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v10

    .line 1471
    move-object v5, v10

    .line 1472
    goto :goto_5c1

    .line 1473
    :cond_5c0
    const/4 v5, 0x0

    .line 1474
    :goto_5c1
    new-instance v0, Lax/T0/h$k;

    .line 1475
    .line 1476
    new-instance v3, Lax/T0/h$d;

    .line 1477
    .line 1478
    move-object/from16 v6, v26

    .line 1479
    .line 1480
    move-object/from16 v1, v31

    .line 1481
    .line 1482
    invoke-direct {v3, v1, v6}, Lax/T0/h$d;-><init>(Ljava/util/List;[I)V

    .line 1483
    .line 1484
    .line 1485
    move-object/from16 v1, p1

    .line 1486
    .line 1487
    invoke-direct/range {v0 .. v5}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1488
    .line 1489
    .line 1490
    return-object v0

    .line 1491
    :cond_5d2
    :goto_5d2
    new-instance v16, Lax/T0/h$k;

    .line 1492
    .line 1493
    const/16 v20, 0x0

    .line 1494
    .line 1495
    const/16 v21, 0x0

    .line 1496
    .line 1497
    const/16 v18, 0x0

    .line 1498
    .line 1499
    move-object/from16 v17, p1

    .line 1500
    .line 1501
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1502
    .line 1503
    .line 1504
    return-object v16

    .line 1505
    :cond_5e0
    :goto_5e0
    new-instance v16, Lax/T0/h$k;

    .line 1506
    .line 1507
    const/16 v20, 0x0

    .line 1508
    .line 1509
    const/16 v21, 0x0

    .line 1510
    .line 1511
    const/16 v18, 0x0

    .line 1512
    .line 1513
    move-object/from16 v17, p1

    .line 1514
    .line 1515
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1516
    .line 1517
    .line 1518
    return-object v16

    .line 1519
    :goto_5ee
    new-instance v16, Lax/T0/h$k;

    .line 1520
    .line 1521
    const/16 v20, 0x0

    .line 1522
    .line 1523
    const/16 v21, 0x0

    .line 1524
    .line 1525
    const/16 v18, 0x0

    .line 1526
    .line 1527
    move-object/from16 v17, p1

    .line 1528
    .line 1529
    invoke-direct/range {v16 .. v21}, Lax/T0/h$k;-><init>(Lax/T0/h$b;Ljava/util/List;Lax/T0/h$d;Lax/T0/h$f;Lax/T0/h$j;)V

    .line 1530
    .line 1531
    .line 1532
    return-object v16
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
.end method
