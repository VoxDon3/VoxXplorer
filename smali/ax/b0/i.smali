.class public final Lax/b0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:[C


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/b0/i;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    sput-object v0, Lax/b0/i;->b:[C

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static a(IIZI)I
    .registers 6

    .line 1
    const/16 v0, 0x63

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-gt p0, v0, :cond_20

    .line 5
    .line 6
    if-eqz p2, :cond_a

    .line 7
    .line 8
    if-lt p3, v1, :cond_a

    .line 9
    .line 10
    goto :goto_20

    .line 11
    :cond_a
    const/16 v0, 0x9

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-gt p0, v0, :cond_1e

    .line 15
    .line 16
    if-eqz p2, :cond_14

    .line 17
    .line 18
    if-lt p3, v1, :cond_14

    .line 19
    .line 20
    goto :goto_1e

    .line 21
    :cond_14
    if-nez p2, :cond_1b

    .line 22
    .line 23
    if-lez p0, :cond_19

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1b
    :goto_1b
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1e
    :goto_1e
    add-int/2addr p1, v1

    .line 32
    return p1

    .line 33
    :cond_20
    :goto_20
    add-int/2addr p1, v1

    .line 34
    return p1
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

.method public static b(JJLjava/io/PrintWriter;)V
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_c

    .line 6
    .line 7
    const-string p0, "--"

    .line 8
    .line 9
    invoke-virtual {p4, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    sub-long/2addr p0, p2

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p0, p1, p4, p2}, Lax/b0/i;->d(JLjava/io/PrintWriter;I)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public static c(JLjava/io/PrintWriter;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, Lax/b0/i;->d(JLjava/io/PrintWriter;I)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public static d(JLjava/io/PrintWriter;I)V
    .registers 6

    .line 1
    sget-object v0, Lax/b0/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {p0, p1, p3}, Lax/b0/i;->e(JI)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    new-instance p1, Ljava/lang/String;

    .line 9
    .line 10
    sget-object p3, Lax/b0/i;->b:[C

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, p3, v1, p0}, Ljava/lang/String;-><init>([CII)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_14
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    .line 23
    throw p0
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

.method private static e(JI)I
    .registers 19

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    sget-object v3, Lax/b0/i;->b:[C

    .line 6
    .line 7
    array-length v3, v3

    .line 8
    if-ge v3, v2, :cond_d

    .line 9
    .line 10
    new-array v3, v2, [C

    .line 11
    .line 12
    sput-object v3, Lax/b0/i;->b:[C

    .line 13
    .line 14
    :cond_d
    sget-object v4, Lax/b0/i;->b:[C

    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    const/16 v3, 0x20

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    cmp-long v7, v0, v5

    .line 23
    .line 24
    if-nez v7, :cond_25

    .line 25
    .line 26
    add-int/lit8 v0, v2, -0x1

    .line 27
    .line 28
    :goto_1b
    if-lez v0, :cond_20

    .line 29
    .line 30
    aput-char v3, v4, v11

    .line 31
    .line 32
    goto :goto_1b

    .line 33
    :cond_20
    const/16 v0, 0x30

    .line 34
    .line 35
    aput-char v0, v4, v11

    .line 36
    .line 37
    return v10

    .line 38
    :cond_25
    if-lez v7, :cond_2a

    .line 39
    .line 40
    const/16 v5, 0x2b

    .line 41
    .line 42
    goto :goto_2d

    .line 43
    :cond_2a
    neg-long v0, v0

    .line 44
    const/16 v5, 0x2d

    .line 45
    .line 46
    :goto_2d
    const-wide/16 v6, 0x3e8

    .line 47
    .line 48
    rem-long v8, v0, v6

    .line 49
    .line 50
    long-to-int v12, v8

    .line 51
    div-long/2addr v0, v6

    .line 52
    long-to-double v0, v0

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    double-to-int v0, v0

    .line 58
    const v1, 0x15180

    .line 59
    .line 60
    .line 61
    if-le v0, v1, :cond_44

    .line 62
    .line 63
    div-int v6, v0, v1

    .line 64
    .line 65
    mul-int v1, v1, v6

    .line 66
    .line 67
    sub-int/2addr v0, v1

    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v6, 0x0

    .line 70
    :goto_45
    const/16 v1, 0xe10

    .line 71
    .line 72
    if-le v0, v1, :cond_4f

    .line 73
    .line 74
    div-int/lit16 v1, v0, 0xe10

    .line 75
    .line 76
    mul-int/lit16 v7, v1, 0xe10

    .line 77
    .line 78
    sub-int/2addr v0, v7

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v1, 0x0

    .line 81
    :goto_50
    const/16 v7, 0x3c

    .line 82
    .line 83
    if-le v0, v7, :cond_5b

    .line 84
    .line 85
    div-int/lit8 v7, v0, 0x3c

    .line 86
    .line 87
    mul-int/lit8 v8, v7, 0x3c

    .line 88
    .line 89
    sub-int/2addr v0, v8

    .line 90
    move v13, v7

    .line 91
    goto :goto_5c

    .line 92
    :cond_5b
    const/4 v13, 0x0

    .line 93
    :goto_5c
    const/4 v14, 0x3

    .line 94
    const/4 v15, 0x2

    .line 95
    if-eqz v2, :cond_97

    .line 96
    .line 97
    invoke-static {v6, v10, v11, v11}, Lax/b0/i;->a(IIZI)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-lez v7, :cond_68

    .line 102
    .line 103
    const/4 v8, 0x1

    .line 104
    goto :goto_69

    .line 105
    :cond_68
    const/4 v8, 0x0

    .line 106
    :goto_69
    invoke-static {v1, v10, v8, v15}, Lax/b0/i;->a(IIZI)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    add-int/2addr v7, v8

    .line 111
    if-lez v7, :cond_72

    .line 112
    .line 113
    const/4 v8, 0x1

    .line 114
    goto :goto_73

    .line 115
    :cond_72
    const/4 v8, 0x0

    .line 116
    :goto_73
    invoke-static {v13, v10, v8, v15}, Lax/b0/i;->a(IIZI)I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    add-int/2addr v7, v8

    .line 121
    if-lez v7, :cond_7c

    .line 122
    .line 123
    const/4 v8, 0x1

    .line 124
    goto :goto_7d

    .line 125
    :cond_7c
    const/4 v8, 0x0

    .line 126
    :goto_7d
    invoke-static {v0, v10, v8, v15}, Lax/b0/i;->a(IIZI)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    add-int/2addr v7, v8

    .line 131
    if-lez v7, :cond_86

    .line 132
    .line 133
    const/4 v8, 0x3

    .line 134
    goto :goto_87

    .line 135
    :cond_86
    const/4 v8, 0x0

    .line 136
    :goto_87
    invoke-static {v12, v15, v10, v8}, Lax/b0/i;->a(IIZI)I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    add-int/2addr v8, v10

    .line 141
    add-int/2addr v7, v8

    .line 142
    const/4 v8, 0x0

    .line 143
    :goto_8e
    if-ge v7, v2, :cond_98

    .line 144
    .line 145
    aput-char v3, v4, v8

    .line 146
    .line 147
    add-int/lit8 v8, v8, 0x1

    .line 148
    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 150
    .line 151
    goto :goto_8e

    .line 152
    :cond_97
    const/4 v8, 0x0

    .line 153
    :cond_98
    aput-char v5, v4, v8

    .line 154
    .line 155
    add-int/lit8 v7, v8, 0x1

    .line 156
    .line 157
    if-eqz v2, :cond_a0

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    goto :goto_a1

    .line 161
    :cond_a0
    const/4 v2, 0x0

    .line 162
    :goto_a1
    const/4 v8, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    move v5, v6

    .line 165
    const/16 v6, 0x64

    .line 166
    .line 167
    invoke-static/range {v4 .. v9}, Lax/b0/i;->f([CICIZI)I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    move v5, v7

    .line 172
    if-eq v3, v5, :cond_af

    .line 173
    .line 174
    const/4 v8, 0x1

    .line 175
    goto :goto_b0

    .line 176
    :cond_af
    const/4 v8, 0x0

    .line 177
    :goto_b0
    if-eqz v2, :cond_b4

    .line 178
    .line 179
    const/4 v9, 0x2

    .line 180
    goto :goto_b5

    .line 181
    :cond_b4
    const/4 v9, 0x0

    .line 182
    :goto_b5
    const/16 v6, 0x68

    .line 183
    .line 184
    move v7, v5

    .line 185
    move v5, v1

    .line 186
    move v1, v7

    .line 187
    move v7, v3

    .line 188
    invoke-static/range {v4 .. v9}, Lax/b0/i;->f([CICIZI)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eq v7, v1, :cond_c3

    .line 193
    .line 194
    const/4 v8, 0x1

    .line 195
    goto :goto_c4

    .line 196
    :cond_c3
    const/4 v8, 0x0

    .line 197
    :goto_c4
    if-eqz v2, :cond_c8

    .line 198
    .line 199
    const/4 v9, 0x2

    .line 200
    goto :goto_c9

    .line 201
    :cond_c8
    const/4 v9, 0x0

    .line 202
    :goto_c9
    const/16 v6, 0x6d

    .line 203
    .line 204
    move v5, v13

    .line 205
    invoke-static/range {v4 .. v9}, Lax/b0/i;->f([CICIZI)I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eq v7, v1, :cond_d4

    .line 210
    .line 211
    const/4 v8, 0x1

    .line 212
    goto :goto_d5

    .line 213
    :cond_d4
    const/4 v8, 0x0

    .line 214
    :goto_d5
    if-eqz v2, :cond_d9

    .line 215
    .line 216
    const/4 v9, 0x2

    .line 217
    goto :goto_da

    .line 218
    :cond_d9
    const/4 v9, 0x0

    .line 219
    :goto_da
    const/16 v6, 0x73

    .line 220
    .line 221
    move v5, v0

    .line 222
    invoke-static/range {v4 .. v9}, Lax/b0/i;->f([CICIZI)I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v2, :cond_e7

    .line 227
    .line 228
    if-eq v7, v1, :cond_e7

    .line 229
    .line 230
    const/4 v9, 0x3

    .line 231
    goto :goto_e8

    .line 232
    :cond_e7
    const/4 v9, 0x0

    .line 233
    :goto_e8
    const/16 v6, 0x6d

    .line 234
    .line 235
    const/4 v8, 0x1

    .line 236
    move v5, v12

    .line 237
    invoke-static/range {v4 .. v9}, Lax/b0/i;->f([CICIZI)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    const/16 v1, 0x73

    .line 242
    .line 243
    aput-char v1, v4, v0

    .line 244
    .line 245
    add-int/2addr v0, v10

    .line 246
    return v0
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

.method private static f([CICIZI)I
    .registers 8

    .line 1
    if-nez p4, :cond_6

    .line 2
    .line 3
    if-lez p1, :cond_5

    .line 4
    .line 5
    goto :goto_6

    .line 6
    :cond_5
    return p3

    .line 7
    :cond_6
    :goto_6
    if-eqz p4, :cond_b

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-ge p5, v0, :cond_f

    .line 11
    .line 12
    :cond_b
    const/16 v0, 0x63

    .line 13
    .line 14
    if-le p1, v0, :cond_1c

    .line 15
    .line 16
    :cond_f
    div-int/lit8 v0, p1, 0x64

    .line 17
    .line 18
    add-int/lit8 v1, v0, 0x30

    .line 19
    .line 20
    int-to-char v1, v1

    .line 21
    aput-char v1, p0, p3

    .line 22
    .line 23
    add-int/lit8 v1, p3, 0x1

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x64

    .line 26
    .line 27
    sub-int/2addr p1, v0

    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    move v1, p3

    .line 30
    :goto_1d
    const/4 v0, 0x2

    .line 31
    if-eqz p4, :cond_22

    .line 32
    .line 33
    if-ge p5, v0, :cond_28

    .line 34
    .line 35
    :cond_22
    const/16 p4, 0x9

    .line 36
    .line 37
    if-gt p1, p4, :cond_28

    .line 38
    .line 39
    if-eq p3, v1, :cond_34

    .line 40
    .line 41
    :cond_28
    div-int/lit8 p3, p1, 0xa

    .line 42
    .line 43
    add-int/lit8 p4, p3, 0x30

    .line 44
    .line 45
    int-to-char p4, p4

    .line 46
    aput-char p4, p0, v1

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    mul-int/lit8 p3, p3, 0xa

    .line 51
    .line 52
    sub-int/2addr p1, p3

    .line 53
    :cond_34
    add-int/lit8 p1, p1, 0x30

    .line 54
    .line 55
    int-to-char p1, p1

    .line 56
    aput-char p1, p0, v1

    .line 57
    .line 58
    add-int/lit8 p1, v1, 0x1

    .line 59
    .line 60
    aput-char p2, p0, p1

    .line 61
    .line 62
    add-int/2addr v1, v0

    .line 63
    return v1
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
.end method
