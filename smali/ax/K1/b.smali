.class public final Lax/K1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/K1/b$k;,
        Lax/K1/b$e;,
        Lax/K1/b$h;,
        Lax/K1/b$i;,
        Lax/K1/b$j;,
        Lax/K1/b$f;,
        Lax/K1/b$b;,
        Lax/K1/b$c;,
        Lax/K1/b$l;,
        Lax/K1/b$d;,
        Lax/K1/b$g;,
        Lax/K1/b$a;
    }
.end annotation


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "OpusHead"

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/d0;->x0(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/K1/b;->a:[B

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
.end method

.method private static A(Lax/S0/G;IILjava/lang/String;)Lax/K1/u;
    .registers 15

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_2
    sub-int v1, v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v1, p2, :cond_64

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x74656e63

    .line 20
    .line 21
    .line 22
    if-ne v3, v4, :cond_61

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lax/K1/b;->q(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p0, p2}, Lax/S0/G;->c0(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_2c

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lax/S0/G;->c0(I)V

    .line 40
    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    goto :goto_38

    .line 45
    :cond_2c
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    and-int/lit16 v1, p1, 0xf0

    .line 50
    .line 51
    shr-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    and-int/lit8 p1, p1, 0xf

    .line 54
    .line 55
    move v9, p1

    .line 56
    move v8, v1

    .line 57
    :goto_38
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ne p1, p2, :cond_40

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    goto :goto_41

    .line 65
    :cond_40
    const/4 v4, 0x0

    .line 66
    :goto_41
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/16 p1, 0x10

    .line 71
    .line 72
    new-array v7, p1, [B

    .line 73
    .line 74
    invoke-virtual {p0, v7, v0, p1}, Lax/S0/G;->q([BII)V

    .line 75
    .line 76
    .line 77
    if-eqz v4, :cond_59

    .line 78
    .line 79
    if-nez v6, :cond_59

    .line 80
    .line 81
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-array v2, p1, [B

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0, p1}, Lax/S0/G;->q([BII)V

    .line 88
    .line 89
    .line 90
    :cond_59
    move-object v10, v2

    .line 91
    new-instance v3, Lax/K1/u;

    .line 92
    .line 93
    move-object v5, p3

    .line 94
    invoke-direct/range {v3 .. v10}, Lax/K1/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_61
    move-object v5, p3

    .line 99
    add-int/2addr v0, v1

    .line 100
    goto :goto_2

    .line 101
    :cond_64
    return-object v2
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

.method public static B(Lax/K1/t;Lax/T0/e$b;Lax/q1/F;)Lax/K1/w;
    .registers 39
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const v3, 0x7374737a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-eqz v3, :cond_15

    .line 13
    .line 14
    new-instance v5, Lax/K1/b$i;

    .line 15
    .line 16
    iget-object v6, v1, Lax/K1/t;->g:Lax/P0/v;

    .line 17
    .line 18
    invoke-direct {v5, v3, v6}, Lax/K1/b$i;-><init>(Lax/T0/e$c;Lax/P0/v;)V

    .line 19
    .line 20
    .line 21
    goto :goto_23

    .line 22
    :cond_15
    const v3, 0x73747a32

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_55b

    .line 30
    .line 31
    new-instance v5, Lax/K1/b$j;

    .line 32
    .line 33
    invoke-direct {v5, v3}, Lax/K1/b$j;-><init>(Lax/T0/e$c;)V

    .line 34
    .line 35
    .line 36
    :goto_23
    invoke-interface {v5}, Lax/K1/b$f;->b()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v6, 0x0

    .line 41
    if-nez v3, :cond_3b

    .line 42
    .line 43
    new-instance v0, Lax/K1/w;

    .line 44
    .line 45
    new-array v2, v6, [J

    .line 46
    .line 47
    new-array v3, v6, [I

    .line 48
    .line 49
    new-array v5, v6, [J

    .line 50
    .line 51
    new-array v6, v6, [I

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct/range {v0 .. v8}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3b
    iget v7, v1, Lax/K1/t;->b:I

    .line 61
    .line 62
    const/4 v8, 0x2

    .line 63
    const-wide/16 v9, 0x0

    .line 64
    .line 65
    if-ne v7, v8, :cond_61

    .line 66
    .line 67
    iget-wide v11, v1, Lax/K1/t;->f:J

    .line 68
    .line 69
    cmp-long v7, v11, v9

    .line 70
    .line 71
    if-lez v7, :cond_61

    .line 72
    .line 73
    int-to-float v7, v3

    .line 74
    long-to-float v11, v11

    .line 75
    const v12, 0x49742400    # 1000000.0f

    .line 76
    .line 77
    .line 78
    div-float/2addr v11, v12

    .line 79
    div-float/2addr v7, v11

    .line 80
    iget-object v11, v1, Lax/K1/t;->g:Lax/P0/v;

    .line 81
    .line 82
    invoke-virtual {v11}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v11, v7}, Lax/P0/v$b;->f0(F)Lax/P0/v$b;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v1, v7}, Lax/K1/t;->a(Lax/P0/v;)Lax/K1/t;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_61
    const v7, 0x7374636f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v7}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    const/4 v11, 0x1

    .line 106
    if-nez v7, :cond_7a

    .line 107
    .line 108
    const v7, 0x636f3634

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v7}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Lax/T0/e$c;

    .line 120
    .line 121
    const/4 v12, 0x1

    .line 122
    goto :goto_7b

    .line 123
    :cond_7a
    const/4 v12, 0x0

    .line 124
    :goto_7b
    iget-object v7, v7, Lax/T0/e$c;->b:Lax/S0/G;

    .line 125
    .line 126
    const v13, 0x73747363

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v13}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    invoke-static {v13}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    check-cast v13, Lax/T0/e$c;

    .line 138
    .line 139
    iget-object v13, v13, Lax/T0/e$c;->b:Lax/S0/G;

    .line 140
    .line 141
    const v14, 0x73747473

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v14}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-static {v14}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    check-cast v14, Lax/T0/e$c;

    .line 153
    .line 154
    iget-object v14, v14, Lax/T0/e$c;->b:Lax/S0/G;

    .line 155
    .line 156
    const v15, 0x73747373

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v15}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    if-eqz v15, :cond_a9

    .line 164
    .line 165
    iget-object v15, v15, Lax/T0/e$c;->b:Lax/S0/G;

    .line 166
    .line 167
    :goto_a6
    move-wide/from16 v16, v9

    .line 168
    .line 169
    goto :goto_ab

    .line 170
    :cond_a9
    const/4 v15, 0x0

    .line 171
    goto :goto_a6

    .line 172
    :goto_ab
    const v9, 0x63747473

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v9}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-eqz v0, :cond_b7

    .line 180
    .line 181
    iget-object v0, v0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 182
    .line 183
    goto :goto_b8

    .line 184
    :cond_b7
    const/4 v0, 0x0

    .line 185
    :goto_b8
    new-instance v9, Lax/K1/b$b;

    .line 186
    .line 187
    invoke-direct {v9, v13, v7, v12}, Lax/K1/b$b;-><init>(Lax/S0/G;Lax/S0/G;Z)V

    .line 188
    .line 189
    .line 190
    const/16 v7, 0xc

    .line 191
    .line 192
    invoke-virtual {v14, v7}, Lax/S0/G;->b0(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14}, Lax/S0/G;->Q()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    sub-int/2addr v10, v11

    .line 200
    invoke-virtual {v14}, Lax/S0/G;->Q()I

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-virtual {v14}, Lax/S0/G;->Q()I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v0, :cond_d9

    .line 209
    .line 210
    invoke-virtual {v0, v7}, Lax/S0/G;->b0(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lax/S0/G;->Q()I

    .line 214
    .line 215
    .line 216
    move-result v18

    .line 217
    goto :goto_db

    .line 218
    :cond_d9
    const/16 v18, 0x0

    .line 219
    .line 220
    :goto_db
    const/4 v4, -0x1

    .line 221
    if-eqz v15, :cond_f4

    .line 222
    .line 223
    invoke-virtual {v15, v7}, Lax/S0/G;->b0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15}, Lax/S0/G;->Q()I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-lez v7, :cond_f0

    .line 231
    .line 232
    invoke-virtual {v15}, Lax/S0/G;->Q()I

    .line 233
    .line 234
    .line 235
    move-result v19

    .line 236
    add-int/lit8 v19, v19, -0x1

    .line 237
    .line 238
    :goto_ed
    const/16 v20, 0x0

    .line 239
    .line 240
    goto :goto_f6

    .line 241
    :cond_f0
    const/4 v15, 0x0

    .line 242
    :goto_f1
    const/16 v19, -0x1

    .line 243
    .line 244
    goto :goto_ed

    .line 245
    :cond_f4
    const/4 v7, 0x0

    .line 246
    goto :goto_f1

    .line 247
    :goto_f6
    invoke-interface {v5}, Lax/K1/b$f;->a()I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    iget-object v8, v1, Lax/K1/t;->g:Lax/P0/v;

    .line 252
    .line 253
    iget-object v8, v8, Lax/P0/v;->o:Ljava/lang/String;

    .line 254
    .line 255
    if-eq v6, v4, :cond_120

    .line 256
    .line 257
    const-string v4, "audio/raw"

    .line 258
    .line 259
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_118

    .line 264
    .line 265
    const-string v4, "audio/g711-mlaw"

    .line 266
    .line 267
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-nez v4, :cond_118

    .line 272
    .line 273
    const-string v4, "audio/g711-alaw"

    .line 274
    .line 275
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_120

    .line 280
    .line 281
    :cond_118
    if-nez v10, :cond_120

    .line 282
    .line 283
    if-nez v18, :cond_120

    .line 284
    .line 285
    if-nez v7, :cond_120

    .line 286
    .line 287
    const/4 v4, 0x1

    .line 288
    goto :goto_121

    .line 289
    :cond_120
    const/4 v4, 0x0

    .line 290
    :goto_121
    if-eqz v4, :cond_158

    .line 291
    .line 292
    iget v0, v9, Lax/K1/b$b;->a:I

    .line 293
    .line 294
    new-array v4, v0, [J

    .line 295
    .line 296
    new-array v0, v0, [I

    .line 297
    .line 298
    :goto_129
    invoke-virtual {v9}, Lax/K1/b$b;->a()Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    if-eqz v5, :cond_13a

    .line 303
    .line 304
    iget v5, v9, Lax/K1/b$b;->b:I

    .line 305
    .line 306
    iget-wide v7, v9, Lax/K1/b$b;->d:J

    .line 307
    .line 308
    aput-wide v7, v4, v5

    .line 309
    .line 310
    iget v7, v9, Lax/K1/b$b;->c:I

    .line 311
    .line 312
    aput v7, v0, v5

    .line 313
    .line 314
    goto :goto_129

    .line 315
    :cond_13a
    int-to-long v7, v13

    .line 316
    invoke-static {v6, v4, v0, v7, v8}, Lax/K1/d;->a(I[J[IJ)Lax/K1/d$b;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v4, v0, Lax/K1/d$b;->a:[J

    .line 321
    .line 322
    iget-object v5, v0, Lax/K1/d$b;->b:[I

    .line 323
    .line 324
    iget v6, v0, Lax/K1/d$b;->c:I

    .line 325
    .line 326
    iget-object v7, v0, Lax/K1/d$b;->d:[J

    .line 327
    .line 328
    iget-object v8, v0, Lax/K1/d$b;->e:[I

    .line 329
    .line 330
    iget-wide v9, v0, Lax/K1/d$b;->f:J

    .line 331
    .line 332
    iget-wide v12, v0, Lax/K1/d$b;->g:J

    .line 333
    .line 334
    move-wide/from16 v22, v9

    .line 335
    .line 336
    const/16 p0, 0x1

    .line 337
    .line 338
    move-object v9, v7

    .line 339
    move-object v10, v8

    .line 340
    move v8, v6

    .line 341
    move-object v7, v5

    .line 342
    move-object v6, v4

    .line 343
    goto/16 :goto_2bb

    .line 344
    .line 345
    :cond_158
    new-array v4, v3, [J

    .line 346
    .line 347
    new-array v6, v3, [I

    .line 348
    .line 349
    new-array v8, v3, [J

    .line 350
    .line 351
    const/16 p0, 0x1

    .line 352
    .line 353
    new-array v11, v3, [I

    .line 354
    .line 355
    move-object/from16 p1, v0

    .line 356
    .line 357
    move-object/from16 v23, v5

    .line 358
    .line 359
    move v0, v13

    .line 360
    move-object/from16 v24, v14

    .line 361
    .line 362
    move-object/from16 v27, v15

    .line 363
    .line 364
    move-wide/from16 v25, v16

    .line 365
    .line 366
    move-wide/from16 v29, v25

    .line 367
    .line 368
    move/from16 v22, v18

    .line 369
    .line 370
    move/from16 v5, v19

    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/4 v15, 0x0

    .line 374
    const/16 v28, 0x0

    .line 375
    .line 376
    const/16 v31, 0x0

    .line 377
    .line 378
    move v13, v12

    .line 379
    move-wide/from16 v18, v29

    .line 380
    .line 381
    move v12, v10

    .line 382
    move v10, v7

    .line 383
    const/4 v7, 0x0

    .line 384
    :goto_17f
    const-string v2, "BoxParsers"

    .line 385
    .line 386
    if-ge v14, v3, :cond_239

    .line 387
    .line 388
    move-wide/from16 v32, v29

    .line 389
    .line 390
    move/from16 v29, v28

    .line 391
    .line 392
    const/16 v28, 0x1

    .line 393
    .line 394
    :goto_189
    if-nez v29, :cond_1a6

    .line 395
    .line 396
    invoke-virtual {v9}, Lax/K1/b$b;->a()Z

    .line 397
    .line 398
    .line 399
    move-result v28

    .line 400
    if-eqz v28, :cond_1a6

    .line 401
    .line 402
    move/from16 v30, v12

    .line 403
    .line 404
    move/from16 v34, v13

    .line 405
    .line 406
    iget-wide v12, v9, Lax/K1/b$b;->d:J

    .line 407
    .line 408
    move/from16 v35, v3

    .line 409
    .line 410
    iget v3, v9, Lax/K1/b$b;->c:I

    .line 411
    .line 412
    move/from16 v29, v3

    .line 413
    .line 414
    move-wide/from16 v32, v12

    .line 415
    .line 416
    move/from16 v12, v30

    .line 417
    .line 418
    move/from16 v13, v34

    .line 419
    .line 420
    move/from16 v3, v35

    .line 421
    .line 422
    goto :goto_189

    .line 423
    :cond_1a6
    move/from16 v35, v3

    .line 424
    .line 425
    move/from16 v30, v12

    .line 426
    .line 427
    move/from16 v34, v13

    .line 428
    .line 429
    if-nez v28, :cond_1cc

    .line 430
    .line 431
    const-string v0, "Unexpected end of chunk data"

    .line 432
    .line 433
    invoke-static {v2, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v4, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v6, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-static {v8, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    move-object v8, v4

    .line 453
    move-object v11, v5

    .line 454
    move-object v4, v0

    .line 455
    move-object v5, v3

    .line 456
    move v3, v14

    .line 457
    move/from16 v0, v29

    .line 458
    .line 459
    goto/16 :goto_242

    .line 460
    .line 461
    :cond_1cc
    if-eqz p1, :cond_1e3

    .line 462
    .line 463
    move/from16 v2, v31

    .line 464
    .line 465
    :goto_1d0
    if-nez v2, :cond_1df

    .line 466
    .line 467
    if-lez v22, :cond_1df

    .line 468
    .line 469
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->Q()I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->v()I

    .line 474
    .line 475
    .line 476
    move-result v15

    .line 477
    add-int/lit8 v22, v22, -0x1

    .line 478
    .line 479
    goto :goto_1d0

    .line 480
    :cond_1df
    add-int/lit8 v2, v2, -0x1

    .line 481
    .line 482
    move/from16 v31, v2

    .line 483
    .line 484
    :cond_1e3
    aput-wide v32, v4, v14

    .line 485
    .line 486
    invoke-interface/range {v23 .. v23}, Lax/K1/b$f;->c()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    aput v2, v6, v14

    .line 491
    .line 492
    int-to-long v12, v2

    .line 493
    add-long v18, v18, v12

    .line 494
    .line 495
    if-le v2, v7, :cond_1f1

    .line 496
    .line 497
    move v7, v2

    .line 498
    :cond_1f1
    int-to-long v2, v15

    .line 499
    add-long v2, v25, v2

    .line 500
    .line 501
    aput-wide v2, v8, v14

    .line 502
    .line 503
    if-nez v27, :cond_1fa

    .line 504
    .line 505
    const/4 v2, 0x1

    .line 506
    goto :goto_1fb

    .line 507
    :cond_1fa
    const/4 v2, 0x0

    .line 508
    :goto_1fb
    aput v2, v11, v14

    .line 509
    .line 510
    if-ne v14, v5, :cond_212

    .line 511
    .line 512
    aput p0, v11, v14

    .line 513
    .line 514
    add-int/lit8 v10, v10, -0x1

    .line 515
    .line 516
    if-lez v10, :cond_212

    .line 517
    .line 518
    invoke-static/range {v27 .. v27}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    check-cast v2, Lax/S0/G;

    .line 523
    .line 524
    invoke-virtual {v2}, Lax/S0/G;->Q()I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    add-int/lit8 v2, v2, -0x1

    .line 529
    .line 530
    move v5, v2

    .line 531
    :cond_212
    int-to-long v2, v0

    .line 532
    add-long v25, v25, v2

    .line 533
    .line 534
    add-int/lit8 v13, v34, -0x1

    .line 535
    .line 536
    if-nez v13, :cond_228

    .line 537
    .line 538
    if-lez v30, :cond_228

    .line 539
    .line 540
    invoke-virtual/range {v24 .. v24}, Lax/S0/G;->Q()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    invoke-virtual/range {v24 .. v24}, Lax/S0/G;->v()I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    add-int/lit8 v12, v30, -0x1

    .line 549
    .line 550
    move v13, v0

    .line 551
    move v0, v2

    .line 552
    goto :goto_22a

    .line 553
    :cond_228
    move/from16 v12, v30

    .line 554
    .line 555
    :goto_22a
    aget v2, v6, v14

    .line 556
    .line 557
    int-to-long v2, v2

    .line 558
    add-long v2, v32, v2

    .line 559
    .line 560
    add-int/lit8 v28, v29, -0x1

    .line 561
    .line 562
    add-int/lit8 v14, v14, 0x1

    .line 563
    .line 564
    move-wide/from16 v29, v2

    .line 565
    .line 566
    move/from16 v3, v35

    .line 567
    .line 568
    goto/16 :goto_17f

    .line 569
    .line 570
    :cond_239
    move/from16 v35, v3

    .line 571
    .line 572
    move/from16 v30, v12

    .line 573
    .line 574
    move/from16 v34, v13

    .line 575
    .line 576
    move-object v5, v6

    .line 577
    move/from16 v0, v28

    .line 578
    .line 579
    :goto_242
    int-to-long v12, v15

    .line 580
    add-long v12, v25, v12

    .line 581
    .line 582
    if-eqz p1, :cond_257

    .line 583
    .line 584
    :goto_247
    if-lez v22, :cond_257

    .line 585
    .line 586
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->Q()I

    .line 587
    .line 588
    .line 589
    move-result v6

    .line 590
    if-eqz v6, :cond_251

    .line 591
    .line 592
    const/4 v6, 0x0

    .line 593
    goto :goto_258

    .line 594
    :cond_251
    invoke-virtual/range {p1 .. p1}, Lax/S0/G;->v()I

    .line 595
    .line 596
    .line 597
    add-int/lit8 v22, v22, -0x1

    .line 598
    .line 599
    goto :goto_247

    .line 600
    :cond_257
    const/4 v6, 0x1

    .line 601
    :goto_258
    if-nez v10, :cond_264

    .line 602
    .line 603
    if-nez v34, :cond_264

    .line 604
    .line 605
    if-nez v0, :cond_264

    .line 606
    .line 607
    if-nez v30, :cond_264

    .line 608
    .line 609
    if-nez v31, :cond_264

    .line 610
    .line 611
    if-nez v6, :cond_2b2

    .line 612
    .line 613
    :cond_264
    new-instance v9, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    const-string v14, "Inconsistent stbl box for track "

    .line 619
    .line 620
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    iget v14, v1, Lax/K1/t;->a:I

    .line 624
    .line 625
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    const-string v14, ": remainingSynchronizationSamples "

    .line 629
    .line 630
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    const-string v10, ", remainingSamplesAtTimestampDelta "

    .line 637
    .line 638
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    move/from16 v10, v34

    .line 642
    .line 643
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    const-string v10, ", remainingSamplesInChunk "

    .line 647
    .line 648
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    const-string v0, ", remainingTimestampDeltaChanges "

    .line 655
    .line 656
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    move/from16 v10, v30

    .line 660
    .line 661
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    const-string v0, ", remainingSamplesAtTimestampOffset "

    .line 665
    .line 666
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    move/from16 v0, v31

    .line 670
    .line 671
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    if-nez v6, :cond_2a6

    .line 675
    .line 676
    const-string v0, ", ctts invalid"

    .line 677
    .line 678
    goto :goto_2a8

    .line 679
    :cond_2a6
    const-string v0, ""

    .line 680
    .line 681
    :goto_2a8
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-static {v2, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    :cond_2b2
    move-object v9, v8

    .line 692
    move-object v10, v11

    .line 693
    move-wide/from16 v22, v12

    .line 694
    .line 695
    move-wide/from16 v12, v18

    .line 696
    .line 697
    move v8, v7

    .line 698
    move-object v6, v4

    .line 699
    move-object v7, v5

    .line 700
    :goto_2bb
    iget-wide v4, v1, Lax/K1/t;->f:J

    .line 701
    .line 702
    const-wide/32 v18, 0x7fffffff

    .line 703
    .line 704
    .line 705
    cmp-long v0, v4, v16

    .line 706
    .line 707
    if-lez v0, :cond_2ee

    .line 708
    .line 709
    const-wide/16 v14, 0x8

    .line 710
    .line 711
    mul-long v24, v12, v14

    .line 712
    .line 713
    const-wide/32 v26, 0xf4240

    .line 714
    .line 715
    .line 716
    sget-object v30, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 717
    .line 718
    move-wide/from16 v28, v4

    .line 719
    .line 720
    invoke-static/range {v24 .. v30}, Lax/S0/d0;->r1(JJJLjava/math/RoundingMode;)J

    .line 721
    .line 722
    .line 723
    move-result-wide v4

    .line 724
    cmp-long v0, v4, v16

    .line 725
    .line 726
    if-lez v0, :cond_2ee

    .line 727
    .line 728
    cmp-long v0, v4, v18

    .line 729
    .line 730
    if-gez v0, :cond_2ee

    .line 731
    .line 732
    iget-object v0, v1, Lax/K1/t;->g:Lax/P0/v;

    .line 733
    .line 734
    invoke-virtual {v0}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    long-to-int v2, v4

    .line 739
    invoke-virtual {v0, v2}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-virtual {v1, v0}, Lax/K1/t;->a(Lax/P0/v;)Lax/K1/t;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    :cond_2ee
    move-object v5, v1

    .line 752
    iget-wide v0, v5, Lax/K1/t;->c:J

    .line 753
    .line 754
    const-wide/32 v24, 0xf4240

    .line 755
    .line 756
    .line 757
    move-wide/from16 v26, v0

    .line 758
    .line 759
    invoke-static/range {v22 .. v27}, Lax/S0/d0;->p1(JJJ)J

    .line 760
    .line 761
    .line 762
    move-result-wide v11

    .line 763
    iget-object v0, v5, Lax/K1/t;->i:[J

    .line 764
    .line 765
    const-wide/32 v1, 0xf4240

    .line 766
    .line 767
    .line 768
    if-nez v0, :cond_30c

    .line 769
    .line 770
    iget-wide v3, v5, Lax/K1/t;->c:J

    .line 771
    .line 772
    invoke-static {v9, v1, v2, v3, v4}, Lax/S0/d0;->q1([JJJ)V

    .line 773
    .line 774
    .line 775
    new-instance v4, Lax/K1/w;

    .line 776
    .line 777
    invoke-direct/range {v4 .. v12}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 778
    .line 779
    .line 780
    return-object v4

    .line 781
    :cond_30c
    move-object v4, v10

    .line 782
    array-length v0, v0

    .line 783
    const/4 v10, 0x1

    .line 784
    if-ne v0, v10, :cond_36a

    .line 785
    .line 786
    iget v0, v5, Lax/K1/t;->b:I

    .line 787
    .line 788
    if-ne v0, v10, :cond_36a

    .line 789
    .line 790
    array-length v0, v9

    .line 791
    const/4 v10, 0x2

    .line 792
    if-lt v0, v10, :cond_36a

    .line 793
    .line 794
    iget-object v0, v5, Lax/K1/t;->j:[J

    .line 795
    .line 796
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    check-cast v0, [J

    .line 801
    .line 802
    aget-wide v12, v0, v20

    .line 803
    .line 804
    iget-object v0, v5, Lax/K1/t;->i:[J

    .line 805
    .line 806
    aget-wide v24, v0, v20

    .line 807
    .line 808
    iget-wide v10, v5, Lax/K1/t;->c:J

    .line 809
    .line 810
    iget-wide v14, v5, Lax/K1/t;->d:J

    .line 811
    .line 812
    move-wide/from16 v26, v10

    .line 813
    .line 814
    move-wide/from16 v28, v14

    .line 815
    .line 816
    invoke-static/range {v24 .. v29}, Lax/S0/d0;->p1(JJJ)J

    .line 817
    .line 818
    .line 819
    move-result-wide v10

    .line 820
    add-long v14, v12, v10

    .line 821
    .line 822
    move-wide/from16 v10, v22

    .line 823
    .line 824
    invoke-static/range {v9 .. v15}, Lax/K1/b;->b([JJJJ)Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_36a

    .line 829
    .line 830
    sub-long v24, v22, v14

    .line 831
    .line 832
    aget-wide v10, v9, v20

    .line 833
    .line 834
    sub-long v26, v12, v10

    .line 835
    .line 836
    iget-object v0, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 837
    .line 838
    iget v0, v0, Lax/P0/v;->H:I

    .line 839
    .line 840
    int-to-long v10, v0

    .line 841
    iget-wide v12, v5, Lax/K1/t;->c:J

    .line 842
    .line 843
    move-wide/from16 v28, v10

    .line 844
    .line 845
    move-wide/from16 v30, v12

    .line 846
    .line 847
    invoke-static/range {v26 .. v31}, Lax/S0/d0;->p1(JJJ)J

    .line 848
    .line 849
    .line 850
    move-result-wide v10

    .line 851
    iget-object v0, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 852
    .line 853
    iget v0, v0, Lax/P0/v;->H:I

    .line 854
    .line 855
    int-to-long v12, v0

    .line 856
    iget-wide v14, v5, Lax/K1/t;->c:J

    .line 857
    .line 858
    move-wide/from16 v26, v12

    .line 859
    .line 860
    move-wide/from16 v28, v14

    .line 861
    .line 862
    invoke-static/range {v24 .. v29}, Lax/S0/d0;->p1(JJJ)J

    .line 863
    .line 864
    .line 865
    move-result-wide v12

    .line 866
    cmp-long v0, v10, v16

    .line 867
    .line 868
    if-nez v0, :cond_36c

    .line 869
    .line 870
    cmp-long v0, v12, v16

    .line 871
    .line 872
    if-eqz v0, :cond_36a

    .line 873
    .line 874
    goto :goto_36c

    .line 875
    :cond_36a
    move-object v10, v4

    .line 876
    goto :goto_395

    .line 877
    :cond_36c
    :goto_36c
    cmp-long v0, v10, v18

    .line 878
    .line 879
    if-gtz v0, :cond_36a

    .line 880
    .line 881
    cmp-long v0, v12, v18

    .line 882
    .line 883
    if-gtz v0, :cond_36a

    .line 884
    .line 885
    long-to-int v0, v10

    .line 886
    move-object/from16 v3, p2

    .line 887
    .line 888
    iput v0, v3, Lax/q1/F;->a:I

    .line 889
    .line 890
    long-to-int v0, v12

    .line 891
    iput v0, v3, Lax/q1/F;->b:I

    .line 892
    .line 893
    iget-wide v10, v5, Lax/K1/t;->c:J

    .line 894
    .line 895
    invoke-static {v9, v1, v2, v10, v11}, Lax/S0/d0;->q1([JJJ)V

    .line 896
    .line 897
    .line 898
    iget-object v0, v5, Lax/K1/t;->i:[J

    .line 899
    .line 900
    aget-wide v10, v0, v20

    .line 901
    .line 902
    const-wide/32 v12, 0xf4240

    .line 903
    .line 904
    .line 905
    iget-wide v14, v5, Lax/K1/t;->d:J

    .line 906
    .line 907
    invoke-static/range {v10 .. v15}, Lax/S0/d0;->p1(JJJ)J

    .line 908
    .line 909
    .line 910
    move-result-wide v11

    .line 911
    move-object v10, v4

    .line 912
    new-instance v4, Lax/K1/w;

    .line 913
    .line 914
    invoke-direct/range {v4 .. v12}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 915
    .line 916
    .line 917
    return-object v4

    .line 918
    :goto_395
    iget-object v0, v5, Lax/K1/t;->i:[J

    .line 919
    .line 920
    array-length v1, v0

    .line 921
    const/4 v2, 0x1

    .line 922
    if-ne v1, v2, :cond_3d4

    .line 923
    .line 924
    aget-wide v1, v0, v20

    .line 925
    .line 926
    cmp-long v4, v1, v16

    .line 927
    .line 928
    if-nez v4, :cond_3d4

    .line 929
    .line 930
    iget-object v0, v5, Lax/K1/t;->j:[J

    .line 931
    .line 932
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    check-cast v0, [J

    .line 937
    .line 938
    aget-wide v1, v0, v20

    .line 939
    .line 940
    const/4 v0, 0x0

    .line 941
    :goto_3ac
    array-length v3, v9

    .line 942
    if-ge v0, v3, :cond_3c2

    .line 943
    .line 944
    aget-wide v3, v9, v0

    .line 945
    .line 946
    sub-long v11, v3, v1

    .line 947
    .line 948
    const-wide/32 v13, 0xf4240

    .line 949
    .line 950
    .line 951
    iget-wide v3, v5, Lax/K1/t;->c:J

    .line 952
    .line 953
    move-wide v15, v3

    .line 954
    invoke-static/range {v11 .. v16}, Lax/S0/d0;->p1(JJJ)J

    .line 955
    .line 956
    .line 957
    move-result-wide v3

    .line 958
    aput-wide v3, v9, v0

    .line 959
    .line 960
    add-int/lit8 v0, v0, 0x1

    .line 961
    .line 962
    goto :goto_3ac

    .line 963
    :cond_3c2
    sub-long v11, v22, v1

    .line 964
    .line 965
    const-wide/32 v13, 0xf4240

    .line 966
    .line 967
    .line 968
    iget-wide v0, v5, Lax/K1/t;->c:J

    .line 969
    .line 970
    move-wide v15, v0

    .line 971
    invoke-static/range {v11 .. v16}, Lax/S0/d0;->p1(JJJ)J

    .line 972
    .line 973
    .line 974
    move-result-wide v11

    .line 975
    new-instance v4, Lax/K1/w;

    .line 976
    .line 977
    invoke-direct/range {v4 .. v12}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 978
    .line 979
    .line 980
    return-object v4

    .line 981
    :cond_3d4
    iget v1, v5, Lax/K1/t;->b:I

    .line 982
    .line 983
    const/4 v2, 0x1

    .line 984
    if-ne v1, v2, :cond_3db

    .line 985
    .line 986
    const/4 v1, 0x1

    .line 987
    goto :goto_3dc

    .line 988
    :cond_3db
    const/4 v1, 0x0

    .line 989
    :goto_3dc
    array-length v2, v0

    .line 990
    new-array v2, v2, [I

    .line 991
    .line 992
    array-length v0, v0

    .line 993
    new-array v0, v0, [I

    .line 994
    .line 995
    iget-object v4, v5, Lax/K1/t;->j:[J

    .line 996
    .line 997
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v4

    .line 1001
    check-cast v4, [J

    .line 1002
    .line 1003
    const/4 v11, 0x0

    .line 1004
    const/4 v12, 0x0

    .line 1005
    const/4 v13, 0x0

    .line 1006
    const/4 v14, 0x0

    .line 1007
    :goto_3ee
    iget-object v15, v5, Lax/K1/t;->i:[J

    .line 1008
    .line 1009
    move-object/from16 v18, v0

    .line 1010
    .line 1011
    array-length v0, v15

    .line 1012
    if-ge v11, v0, :cond_48f

    .line 1013
    .line 1014
    move v0, v11

    .line 1015
    move/from16 p1, v12

    .line 1016
    .line 1017
    aget-wide v11, v4, v0

    .line 1018
    .line 1019
    const-wide/16 v22, -0x1

    .line 1020
    .line 1021
    cmp-long v19, v11, v22

    .line 1022
    .line 1023
    if-eqz v19, :cond_47c

    .line 1024
    .line 1025
    aget-wide v22, v15, v0

    .line 1026
    .line 1027
    move-object v15, v7

    .line 1028
    move/from16 p2, v8

    .line 1029
    .line 1030
    iget-wide v7, v5, Lax/K1/t;->c:J

    .line 1031
    .line 1032
    move-wide/from16 v24, v7

    .line 1033
    .line 1034
    iget-wide v7, v5, Lax/K1/t;->d:J

    .line 1035
    .line 1036
    move-wide/from16 v26, v7

    .line 1037
    .line 1038
    invoke-static/range {v22 .. v27}, Lax/S0/d0;->p1(JJJ)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v7

    .line 1042
    move/from16 v19, v0

    .line 1043
    .line 1044
    const/4 v0, 0x1

    .line 1045
    invoke-static {v9, v11, v12, v0, v0}, Lax/S0/d0;->h([JJZZ)I

    .line 1046
    .line 1047
    .line 1048
    move-result v22

    .line 1049
    aput v22, v2, v19

    .line 1050
    .line 1051
    add-long/2addr v11, v7

    .line 1052
    const/4 v8, 0x0

    .line 1053
    invoke-static {v9, v11, v12, v1, v8}, Lax/S0/d0;->d([JJZZ)I

    .line 1054
    .line 1055
    .line 1056
    move-result v7

    .line 1057
    aput v7, v18, v19

    .line 1058
    .line 1059
    aget v7, v2, v19

    .line 1060
    .line 1061
    :goto_424
    aget v20, v2, v19

    .line 1062
    .line 1063
    if-ltz v20, :cond_434

    .line 1064
    .line 1065
    aget v22, v10, v20

    .line 1066
    .line 1067
    and-int/lit8 v22, v22, 0x1

    .line 1068
    .line 1069
    if-nez v22, :cond_434

    .line 1070
    .line 1071
    add-int/lit8 v20, v20, -0x1

    .line 1072
    .line 1073
    aput v20, v2, v19

    .line 1074
    .line 1075
    const/4 v0, 0x1

    .line 1076
    goto :goto_424

    .line 1077
    :cond_434
    if-gez v20, :cond_44b

    .line 1078
    .line 1079
    aput v7, v2, v19

    .line 1080
    .line 1081
    :goto_438
    aget v0, v2, v19

    .line 1082
    .line 1083
    aget v7, v18, v19

    .line 1084
    .line 1085
    if-ge v0, v7, :cond_44b

    .line 1086
    .line 1087
    aget v7, v10, v0

    .line 1088
    .line 1089
    const/16 v20, 0x1

    .line 1090
    .line 1091
    and-int/lit8 v7, v7, 0x1

    .line 1092
    .line 1093
    if-nez v7, :cond_44b

    .line 1094
    .line 1095
    add-int/lit8 v0, v0, 0x1

    .line 1096
    .line 1097
    aput v0, v2, v19

    .line 1098
    .line 1099
    goto :goto_438

    .line 1100
    :cond_44b
    iget v0, v5, Lax/K1/t;->b:I

    .line 1101
    .line 1102
    const/4 v7, 0x2

    .line 1103
    if-ne v0, v7, :cond_46c

    .line 1104
    .line 1105
    aget v0, v2, v19

    .line 1106
    .line 1107
    aget v7, v18, v19

    .line 1108
    .line 1109
    if-eq v0, v7, :cond_46c

    .line 1110
    .line 1111
    :goto_456
    aget v0, v18, v19

    .line 1112
    .line 1113
    array-length v7, v9

    .line 1114
    const/16 v20, 0x1

    .line 1115
    .line 1116
    add-int/lit8 v7, v7, -0x1

    .line 1117
    .line 1118
    if-ge v0, v7, :cond_46c

    .line 1119
    .line 1120
    add-int/lit8 v7, v0, 0x1

    .line 1121
    .line 1122
    aget-wide v22, v9, v7

    .line 1123
    .line 1124
    cmp-long v7, v22, v11

    .line 1125
    .line 1126
    if-gtz v7, :cond_46c

    .line 1127
    .line 1128
    add-int/lit8 v0, v0, 0x1

    .line 1129
    .line 1130
    aput v0, v18, v19

    .line 1131
    .line 1132
    goto :goto_456

    .line 1133
    :cond_46c
    aget v0, v18, v19

    .line 1134
    .line 1135
    aget v7, v2, v19

    .line 1136
    .line 1137
    sub-int v11, v0, v7

    .line 1138
    .line 1139
    add-int/2addr v13, v11

    .line 1140
    if-eq v14, v7, :cond_477

    .line 1141
    .line 1142
    const/4 v7, 0x1

    .line 1143
    goto :goto_478

    .line 1144
    :cond_477
    const/4 v7, 0x0

    .line 1145
    :goto_478
    or-int v12, p1, v7

    .line 1146
    .line 1147
    move v14, v0

    .line 1148
    goto :goto_484

    .line 1149
    :cond_47c
    move/from16 v19, v0

    .line 1150
    .line 1151
    move-object v15, v7

    .line 1152
    move/from16 p2, v8

    .line 1153
    .line 1154
    const/4 v8, 0x0

    .line 1155
    move/from16 v12, p1

    .line 1156
    .line 1157
    :goto_484
    add-int/lit8 v11, v19, 0x1

    .line 1158
    .line 1159
    move/from16 v8, p2

    .line 1160
    .line 1161
    move-object v7, v15

    .line 1162
    move-object/from16 v0, v18

    .line 1163
    .line 1164
    const/16 v20, 0x0

    .line 1165
    .line 1166
    goto/16 :goto_3ee

    .line 1167
    .line 1168
    :cond_48f
    move-object v15, v7

    .line 1169
    move/from16 p2, v8

    .line 1170
    .line 1171
    move/from16 p1, v12

    .line 1172
    .line 1173
    const/4 v8, 0x0

    .line 1174
    if-eq v13, v3, :cond_499

    .line 1175
    .line 1176
    const/4 v0, 0x1

    .line 1177
    goto :goto_49a

    .line 1178
    :cond_499
    const/4 v0, 0x0

    .line 1179
    :goto_49a
    or-int v0, p1, v0

    .line 1180
    .line 1181
    if-eqz v0, :cond_4a1

    .line 1182
    .line 1183
    new-array v1, v13, [J

    .line 1184
    .line 1185
    goto :goto_4a2

    .line 1186
    :cond_4a1
    move-object v1, v6

    .line 1187
    :goto_4a2
    if-eqz v0, :cond_4a7

    .line 1188
    .line 1189
    new-array v7, v13, [I

    .line 1190
    .line 1191
    goto :goto_4a8

    .line 1192
    :cond_4a7
    move-object v7, v15

    .line 1193
    :goto_4a8
    if-eqz v0, :cond_4ac

    .line 1194
    .line 1195
    const/4 v3, 0x0

    .line 1196
    goto :goto_4ae

    .line 1197
    :cond_4ac
    move/from16 v3, p2

    .line 1198
    .line 1199
    :goto_4ae
    if-eqz v0, :cond_4b3

    .line 1200
    .line 1201
    new-array v4, v13, [I

    .line 1202
    .line 1203
    goto :goto_4b4

    .line 1204
    :cond_4b3
    move-object v4, v10

    .line 1205
    :goto_4b4
    new-array v11, v13, [J

    .line 1206
    .line 1207
    move/from16 v23, v3

    .line 1208
    .line 1209
    move-wide/from16 v24, v16

    .line 1210
    .line 1211
    const/4 v3, 0x0

    .line 1212
    const/4 v12, 0x0

    .line 1213
    :goto_4bc
    iget-object v13, v5, Lax/K1/t;->i:[J

    .line 1214
    .line 1215
    array-length v13, v13

    .line 1216
    if-ge v8, v13, :cond_529

    .line 1217
    .line 1218
    iget-object v13, v5, Lax/K1/t;->j:[J

    .line 1219
    .line 1220
    aget-wide v19, v13, v8

    .line 1221
    .line 1222
    aget v13, v2, v8

    .line 1223
    .line 1224
    aget v14, v18, v8

    .line 1225
    .line 1226
    move/from16 p1, v0

    .line 1227
    .line 1228
    if-eqz v0, :cond_4d8

    .line 1229
    .line 1230
    sub-int v0, v14, v13

    .line 1231
    .line 1232
    invoke-static {v6, v13, v1, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1233
    .line 1234
    .line 1235
    invoke-static {v15, v13, v7, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static {v10, v13, v4, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1239
    .line 1240
    .line 1241
    :cond_4d8
    move/from16 v0, v23

    .line 1242
    .line 1243
    :goto_4da
    if-ge v13, v14, :cond_516

    .line 1244
    .line 1245
    const-wide/32 v26, 0xf4240

    .line 1246
    .line 1247
    .line 1248
    move-object/from16 v22, v1

    .line 1249
    .line 1250
    move-object/from16 v21, v2

    .line 1251
    .line 1252
    iget-wide v1, v5, Lax/K1/t;->d:J

    .line 1253
    .line 1254
    move-wide/from16 v28, v1

    .line 1255
    .line 1256
    invoke-static/range {v24 .. v29}, Lax/S0/d0;->p1(JJJ)J

    .line 1257
    .line 1258
    .line 1259
    move-result-wide v1

    .line 1260
    aget-wide v26, v9, v13

    .line 1261
    .line 1262
    sub-long v28, v26, v19

    .line 1263
    .line 1264
    const-wide/32 v30, 0xf4240

    .line 1265
    .line 1266
    .line 1267
    move-wide/from16 v26, v1

    .line 1268
    .line 1269
    iget-wide v1, v5, Lax/K1/t;->c:J

    .line 1270
    .line 1271
    move-wide/from16 v32, v1

    .line 1272
    .line 1273
    invoke-static/range {v28 .. v33}, Lax/S0/d0;->p1(JJJ)J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v1

    .line 1277
    cmp-long v23, v1, v16

    .line 1278
    .line 1279
    if-gez v23, :cond_501

    .line 1280
    .line 1281
    const/4 v3, 0x1

    .line 1282
    :cond_501
    add-long v1, v26, v1

    .line 1283
    .line 1284
    aput-wide v1, v11, v12

    .line 1285
    .line 1286
    if-eqz p1, :cond_50d

    .line 1287
    .line 1288
    aget v1, v7, v12

    .line 1289
    .line 1290
    if-le v1, v0, :cond_50d

    .line 1291
    .line 1292
    aget v0, v15, v13

    .line 1293
    .line 1294
    :cond_50d
    add-int/lit8 v12, v12, 0x1

    .line 1295
    .line 1296
    add-int/lit8 v13, v13, 0x1

    .line 1297
    .line 1298
    move-object/from16 v2, v21

    .line 1299
    .line 1300
    move-object/from16 v1, v22

    .line 1301
    .line 1302
    goto :goto_4da

    .line 1303
    :cond_516
    move-object/from16 v22, v1

    .line 1304
    .line 1305
    move-object/from16 v21, v2

    .line 1306
    .line 1307
    iget-object v1, v5, Lax/K1/t;->i:[J

    .line 1308
    .line 1309
    aget-wide v13, v1, v8

    .line 1310
    .line 1311
    add-long v24, v24, v13

    .line 1312
    .line 1313
    add-int/lit8 v8, v8, 0x1

    .line 1314
    .line 1315
    move/from16 v23, v0

    .line 1316
    .line 1317
    move-object/from16 v1, v22

    .line 1318
    .line 1319
    move/from16 v0, p1

    .line 1320
    .line 1321
    goto :goto_4bc

    .line 1322
    :cond_529
    move-object/from16 v22, v1

    .line 1323
    .line 1324
    const-wide/32 v26, 0xf4240

    .line 1325
    .line 1326
    .line 1327
    iget-wide v0, v5, Lax/K1/t;->d:J

    .line 1328
    .line 1329
    move-wide/from16 v28, v0

    .line 1330
    .line 1331
    invoke-static/range {v24 .. v29}, Lax/S0/d0;->p1(JJJ)J

    .line 1332
    .line 1333
    .line 1334
    move-result-wide v26

    .line 1335
    if-eqz v3, :cond_54b

    .line 1336
    .line 1337
    iget-object v0, v5, Lax/K1/t;->g:Lax/P0/v;

    .line 1338
    .line 1339
    invoke-virtual {v0}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    const/4 v2, 0x1

    .line 1344
    invoke-virtual {v0, v2}, Lax/P0/v$b;->g0(Z)Lax/P0/v$b;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-virtual {v5, v0}, Lax/K1/t;->a(Lax/P0/v;)Lax/K1/t;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v5

    .line 1356
    :cond_54b
    move-object/from16 v20, v5

    .line 1357
    .line 1358
    new-instance v19, Lax/K1/w;

    .line 1359
    .line 1360
    move-object/from16 v25, v4

    .line 1361
    .line 1362
    move-object/from16 v24, v11

    .line 1363
    .line 1364
    move-object/from16 v21, v22

    .line 1365
    .line 1366
    move-object/from16 v22, v7

    .line 1367
    .line 1368
    invoke-direct/range {v19 .. v27}, Lax/K1/w;-><init>(Lax/K1/t;[J[II[J[IJ)V

    .line 1369
    .line 1370
    .line 1371
    return-object v19

    .line 1372
    :cond_55b
    const-string v0, "Track has no sample table size information"

    .line 1373
    .line 1374
    const/4 v1, 0x0

    .line 1375
    invoke-static {v0, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    throw v0
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

.method private static C(Lax/S0/G;II)Lax/K1/b$d;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_9
    sub-int v1, v0, p1

    .line 11
    .line 12
    if-ge v1, p2, :cond_53

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lez v1, :cond_1a

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v4, 0x0

    .line 28
    :goto_1b
    const-string v5, "childAtomSize must be positive"

    .line 29
    .line 30
    invoke-static {v4, v5}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const v5, 0x73747269

    .line 38
    .line 39
    .line 40
    if-ne v4, v5, :cond_51

    .line 41
    .line 42
    const/4 p1, 0x4

    .line 43
    invoke-virtual {p0, p1}, Lax/S0/G;->c0(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    new-instance p1, Lax/K1/b$d;

    .line 51
    .line 52
    new-instance p2, Lax/K1/b$g;

    .line 53
    .line 54
    and-int/lit8 v0, p0, 0x1

    .line 55
    .line 56
    if-ne v0, v3, :cond_3b

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    goto :goto_3c

    .line 60
    :cond_3b
    const/4 v0, 0x0

    .line 61
    :goto_3c
    and-int/lit8 v1, p0, 0x2

    .line 62
    .line 63
    const/4 v4, 0x2

    .line 64
    if-ne v1, v4, :cond_43

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    goto :goto_44

    .line 68
    :cond_43
    const/4 v1, 0x0

    .line 69
    :goto_44
    const/16 v4, 0x8

    .line 70
    .line 71
    and-int/2addr p0, v4

    .line 72
    if-ne p0, v4, :cond_4a

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    :cond_4a
    invoke-direct {p2, v0, v1, v2}, Lax/K1/b$g;-><init>(ZZZ)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, p2}, Lax/K1/b$d;-><init>(Lax/K1/b$g;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_51
    add-int/2addr v0, v1

    .line 83
    goto :goto_9

    .line 84
    :cond_53
    const/4 p0, 0x0

    .line 85
    return-object p0
    .line 86
    .line 87
    .line 88
.end method

.method private static D(Lax/S0/G;Lax/K1/b$k;Ljava/lang/String;Lax/P0/o;Z)Lax/K1/b$h;
    .registers 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v9, Lax/K1/b$h;

    .line 11
    .line 12
    invoke-direct {v9, v0}, Lax/K1/b$h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    :goto_10
    if-ge v10, v0, :cond_188

    .line 18
    .line 19
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-lez v4, :cond_1e

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v1, 0x0

    .line 32
    :goto_1f
    const-string v2, "childAtomSize must be positive"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const v1, 0x61766331

    .line 42
    .line 43
    .line 44
    if-eq v2, v1, :cond_172

    .line 45
    .line 46
    const v1, 0x61766333

    .line 47
    .line 48
    .line 49
    if-eq v2, v1, :cond_172

    .line 50
    .line 51
    const v1, 0x656e6376

    .line 52
    .line 53
    .line 54
    if-eq v2, v1, :cond_172

    .line 55
    .line 56
    const v1, 0x6d317620

    .line 57
    .line 58
    .line 59
    if-eq v2, v1, :cond_172

    .line 60
    .line 61
    const v1, 0x6d703476

    .line 62
    .line 63
    .line 64
    if-eq v2, v1, :cond_172

    .line 65
    .line 66
    const v1, 0x68766331

    .line 67
    .line 68
    .line 69
    if-eq v2, v1, :cond_172

    .line 70
    .line 71
    const v1, 0x68657631

    .line 72
    .line 73
    .line 74
    if-eq v2, v1, :cond_172

    .line 75
    .line 76
    const v1, 0x73323633

    .line 77
    .line 78
    .line 79
    if-eq v2, v1, :cond_172

    .line 80
    .line 81
    const v1, 0x48323633

    .line 82
    .line 83
    .line 84
    if-eq v2, v1, :cond_172

    .line 85
    .line 86
    const v1, 0x68323633

    .line 87
    .line 88
    .line 89
    if-eq v2, v1, :cond_172

    .line 90
    .line 91
    const v1, 0x76703038

    .line 92
    .line 93
    .line 94
    if-eq v2, v1, :cond_172

    .line 95
    .line 96
    const v1, 0x76703039

    .line 97
    .line 98
    .line 99
    if-eq v2, v1, :cond_172

    .line 100
    .line 101
    const v1, 0x61763031

    .line 102
    .line 103
    .line 104
    if-eq v2, v1, :cond_172

    .line 105
    .line 106
    const v1, 0x64766176

    .line 107
    .line 108
    .line 109
    if-eq v2, v1, :cond_172

    .line 110
    .line 111
    const v1, 0x64766131

    .line 112
    .line 113
    .line 114
    if-eq v2, v1, :cond_172

    .line 115
    .line 116
    const v1, 0x64766865

    .line 117
    .line 118
    .line 119
    if-eq v2, v1, :cond_172

    .line 120
    .line 121
    const v1, 0x64766831

    .line 122
    .line 123
    .line 124
    if-eq v2, v1, :cond_172

    .line 125
    .line 126
    const v1, 0x61707631

    .line 127
    .line 128
    .line 129
    if-ne v2, v1, :cond_84

    .line 130
    .line 131
    goto/16 :goto_172

    .line 132
    .line 133
    :cond_84
    const v1, 0x6d703461

    .line 134
    .line 135
    .line 136
    if-eq v2, v1, :cond_165

    .line 137
    .line 138
    const v1, 0x656e6361

    .line 139
    .line 140
    .line 141
    if-eq v2, v1, :cond_165

    .line 142
    .line 143
    const v1, 0x61632d33

    .line 144
    .line 145
    .line 146
    if-eq v2, v1, :cond_165

    .line 147
    .line 148
    const v1, 0x65632d33

    .line 149
    .line 150
    .line 151
    if-eq v2, v1, :cond_165

    .line 152
    .line 153
    const v1, 0x61632d34

    .line 154
    .line 155
    .line 156
    if-eq v2, v1, :cond_165

    .line 157
    .line 158
    const v1, 0x6d6c7061

    .line 159
    .line 160
    .line 161
    if-eq v2, v1, :cond_165

    .line 162
    .line 163
    const v1, 0x64747363

    .line 164
    .line 165
    .line 166
    if-eq v2, v1, :cond_165

    .line 167
    .line 168
    const v1, 0x64747365

    .line 169
    .line 170
    .line 171
    if-eq v2, v1, :cond_165

    .line 172
    .line 173
    const v1, 0x64747368

    .line 174
    .line 175
    .line 176
    if-eq v2, v1, :cond_165

    .line 177
    .line 178
    const v1, 0x6474736c

    .line 179
    .line 180
    .line 181
    if-eq v2, v1, :cond_165

    .line 182
    .line 183
    const v1, 0x64747378

    .line 184
    .line 185
    .line 186
    if-eq v2, v1, :cond_165

    .line 187
    .line 188
    const v1, 0x73616d72

    .line 189
    .line 190
    .line 191
    if-eq v2, v1, :cond_165

    .line 192
    .line 193
    const v1, 0x73617762

    .line 194
    .line 195
    .line 196
    if-eq v2, v1, :cond_165

    .line 197
    .line 198
    const v1, 0x6c70636d

    .line 199
    .line 200
    .line 201
    if-eq v2, v1, :cond_165

    .line 202
    .line 203
    const v1, 0x736f7774

    .line 204
    .line 205
    .line 206
    if-eq v2, v1, :cond_165

    .line 207
    .line 208
    const v1, 0x74776f73

    .line 209
    .line 210
    .line 211
    if-eq v2, v1, :cond_165

    .line 212
    .line 213
    const v1, 0x2e6d7032

    .line 214
    .line 215
    .line 216
    if-eq v2, v1, :cond_165

    .line 217
    .line 218
    const v1, 0x2e6d7033

    .line 219
    .line 220
    .line 221
    if-eq v2, v1, :cond_165

    .line 222
    .line 223
    const v1, 0x6d686131

    .line 224
    .line 225
    .line 226
    if-eq v2, v1, :cond_165

    .line 227
    .line 228
    const v1, 0x6d686d31

    .line 229
    .line 230
    .line 231
    if-eq v2, v1, :cond_165

    .line 232
    .line 233
    const v1, 0x616c6163

    .line 234
    .line 235
    .line 236
    if-eq v2, v1, :cond_165

    .line 237
    .line 238
    const v1, 0x616c6177

    .line 239
    .line 240
    .line 241
    if-eq v2, v1, :cond_165

    .line 242
    .line 243
    const v1, 0x756c6177

    .line 244
    .line 245
    .line 246
    if-eq v2, v1, :cond_165

    .line 247
    .line 248
    const v1, 0x4f707573

    .line 249
    .line 250
    .line 251
    if-eq v2, v1, :cond_165

    .line 252
    .line 253
    const v1, 0x664c6143

    .line 254
    .line 255
    .line 256
    if-eq v2, v1, :cond_165

    .line 257
    .line 258
    const v1, 0x69616d66

    .line 259
    .line 260
    .line 261
    if-eq v2, v1, :cond_165

    .line 262
    .line 263
    const v1, 0x6970636d

    .line 264
    .line 265
    .line 266
    if-eq v2, v1, :cond_165

    .line 267
    .line 268
    const v1, 0x6670636d

    .line 269
    .line 270
    .line 271
    if-ne v2, v1, :cond_111

    .line 272
    .line 273
    goto :goto_165

    .line 274
    :cond_111
    const v1, 0x54544d4c

    .line 275
    .line 276
    .line 277
    if-eq v2, v1, :cond_12f

    .line 278
    .line 279
    const v1, 0x74783367

    .line 280
    .line 281
    .line 282
    if-eq v2, v1, :cond_12f

    .line 283
    .line 284
    const v1, 0x77767474

    .line 285
    .line 286
    .line 287
    if-eq v2, v1, :cond_12f

    .line 288
    .line 289
    const v1, 0x73747070

    .line 290
    .line 291
    .line 292
    if-eq v2, v1, :cond_12f

    .line 293
    .line 294
    const v1, 0x63363038

    .line 295
    .line 296
    .line 297
    if-eq v2, v1, :cond_12f

    .line 298
    .line 299
    const v1, 0x6d703473

    .line 300
    .line 301
    .line 302
    if-ne v2, v1, :cond_134

    .line 303
    .line 304
    :cond_12f
    move-object v1, p0

    .line 305
    move-object v5, p1

    .line 306
    move-object v6, p2

    .line 307
    move-object v7, v9

    .line 308
    goto :goto_160

    .line 309
    :cond_134
    const v1, 0x6d657474

    .line 310
    .line 311
    .line 312
    if-ne v2, v1, :cond_141

    .line 313
    .line 314
    invoke-static {p1}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {p0, v2, v3, v1, v9}, Lax/K1/b;->v(Lax/S0/G;IIILax/K1/b$h;)V

    .line 319
    .line 320
    .line 321
    goto :goto_180

    .line 322
    :cond_141
    const v1, 0x63616d6d

    .line 323
    .line 324
    .line 325
    if-ne v2, v1, :cond_180

    .line 326
    .line 327
    new-instance v1, Lax/P0/v$b;

    .line 328
    .line 329
    invoke-direct {v1}, Lax/P0/v$b;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-static {p1}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-virtual {v1, v2}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    const-string v2, "application/x-camera-motion"

    .line 341
    .line 342
    invoke-virtual {v1, v2}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v9, Lax/K1/b$h;->b:Lax/P0/v;

    .line 351
    .line 352
    goto :goto_180

    .line 353
    :goto_160
    invoke-static/range {v1 .. v7}, Lax/K1/b;->E(Lax/S0/G;IIILax/K1/b$k;Ljava/lang/String;Lax/K1/b$h;)V

    .line 354
    .line 355
    .line 356
    move-object v9, v7

    .line 357
    goto :goto_180

    .line 358
    :cond_165
    :goto_165
    invoke-static {p1}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    move-object v1, p0

    .line 363
    move-object v6, p2

    .line 364
    move-object v8, p3

    .line 365
    move/from16 v7, p4

    .line 366
    .line 367
    invoke-static/range {v1 .. v10}, Lax/K1/b;->i(Lax/S0/G;IIIILjava/lang/String;ZLax/P0/o;Lax/K1/b$h;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_180

    .line 371
    :cond_172
    :goto_172
    invoke-static {p1}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    invoke-static {p1}, Lax/K1/b$k;->d(Lax/K1/b$k;)I

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    move-object v1, p0

    .line 380
    move-object v6, p2

    .line 381
    move-object v8, p3

    .line 382
    invoke-static/range {v1 .. v10}, Lax/K1/b;->L(Lax/S0/G;IIIILjava/lang/String;ILax/P0/o;Lax/K1/b$h;I)V

    .line 383
    .line 384
    .line 385
    :cond_180
    :goto_180
    add-int/2addr v3, v4

    .line 386
    invoke-virtual {p0, v3}, Lax/S0/G;->b0(I)V

    .line 387
    .line 388
    .line 389
    add-int/lit8 v10, v10, 0x1

    .line 390
    .line 391
    goto/16 :goto_10

    .line 392
    .line 393
    :cond_188
    return-object v9
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
.end method

.method private static E(Lax/S0/G;IIILax/K1/b$k;Ljava/lang/String;Lax/K1/b$h;)V
    .registers 11

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x54544d4c

    .line 7
    .line 8
    .line 9
    const-string v0, "application/ttml+xml"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide v2, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-ne p1, p2, :cond_14

    .line 18
    .line 19
    goto/16 :goto_8a

    .line 20
    .line 21
    :cond_14
    const p2, 0x74783367

    .line 22
    .line 23
    .line 24
    if-ne p1, p2, :cond_28

    .line 25
    .line 26
    add-int/lit8 p3, p3, -0x10

    .line 27
    .line 28
    new-array p1, p3, [B

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-virtual {p0, p1, p2, p3}, Lax/S0/G;->q([BII)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v0, "application/x-quicktime-tx3g"

    .line 39
    .line 40
    goto :goto_8a

    .line 41
    :cond_28
    const p2, 0x77767474

    .line 42
    .line 43
    .line 44
    if-ne p1, p2, :cond_30

    .line 45
    .line 46
    const-string v0, "application/x-mp4-vtt"

    .line 47
    .line 48
    goto :goto_8a

    .line 49
    :cond_30
    const p2, 0x73747070

    .line 50
    .line 51
    .line 52
    if-ne p1, p2, :cond_38

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    goto :goto_8a

    .line 57
    :cond_38
    const p2, 0x63363038

    .line 58
    .line 59
    .line 60
    if-ne p1, p2, :cond_43

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    iput p0, p6, Lax/K1/b$h;->d:I

    .line 64
    .line 65
    const-string v0, "application/x-mp4-cea-608"

    .line 66
    .line 67
    goto :goto_8a

    .line 68
    :cond_43
    const p2, 0x6d703473

    .line 69
    .line 70
    .line 71
    if-ne p1, p2, :cond_b0

    .line 72
    .line 73
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 p2, 0x4

    .line 78
    invoke-virtual {p0, p2}, Lax/S0/G;->c0(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    const p3, 0x65736473

    .line 86
    .line 87
    .line 88
    if-ne p2, p3, :cond_89

    .line 89
    .line 90
    invoke-static {p0, p1}, Lax/K1/b;->n(Lax/S0/G;I)Lax/K1/b$c;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lax/K1/b$c;->d(Lax/K1/b$c;)[B

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_af

    .line 99
    .line 100
    invoke-static {p0}, Lax/K1/b$c;->d(Lax/K1/b$c;)[B

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    array-length p1, p1

    .line 105
    const/16 p2, 0x40

    .line 106
    .line 107
    if-eq p1, p2, :cond_6d

    .line 108
    .line 109
    goto :goto_af

    .line 110
    :cond_6d
    invoke-static {p0}, Lax/K1/b$c;->d(Lax/K1/b$c;)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p4}, Lax/K1/b$k;->e(Lax/K1/b$k;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-static {p4}, Lax/K1/b$k;->f(Lax/K1/b$k;)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-static {p0, p1, p2}, Lax/K1/b;->d([BII)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lax/S0/d0;->x0(Ljava/lang/String;)[B

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string p0, "application/vobsub"

    .line 135
    .line 136
    move-object v0, p0

    .line 137
    goto :goto_8a

    .line 138
    :cond_89
    move-object v0, v1

    .line 139
    :goto_8a
    if-eqz v0, :cond_af

    .line 140
    .line 141
    new-instance p0, Lax/P0/v$b;

    .line 142
    .line 143
    invoke-direct {p0}, Lax/P0/v$b;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-static {p4}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-virtual {p0, p1}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0, v0}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0, p5}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0, v2, v3}, Lax/P0/v$b;->C0(J)Lax/P0/v$b;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0, v1}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iput-object p0, p6, Lax/K1/b$h;->b:Lax/P0/v;

    .line 175
    .line 176
    :cond_af
    :goto_af
    return-void

    .line 177
    :cond_b0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p0
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
.end method

.method private static F(Lax/S0/G;)Lax/K1/b$k;
    .registers 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lax/K1/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-nez v1, :cond_14

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    goto :goto_16

    .line 21
    :cond_14
    const/16 v3, 0x10

    .line 22
    .line 23
    :goto_16
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v3, 0x4

    .line 31
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v1, :cond_28

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    :cond_28
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_2a
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    if-ge v7, v0, :cond_53

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    add-int v11, v4, v7

    .line 55
    .line 56
    aget-byte v10, v10, v11

    .line 57
    .line 58
    const/4 v11, -0x1

    .line 59
    if-eq v10, v11, :cond_50

    .line 60
    .line 61
    if-nez v1, :cond_43

    .line 62
    .line 63
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    goto :goto_47

    .line 68
    :cond_43
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    :goto_47
    const-wide/16 v10, 0x0

    .line 73
    .line 74
    cmp-long v4, v0, v10

    .line 75
    .line 76
    if-nez v4, :cond_4e

    .line 77
    .line 78
    goto :goto_56

    .line 79
    :cond_4e
    move-wide v8, v0

    .line 80
    goto :goto_56

    .line 81
    :cond_50
    add-int/lit8 v7, v7, 0x1

    .line 82
    .line 83
    goto :goto_2a

    .line 84
    :cond_53
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 85
    .line 86
    .line 87
    :goto_56
    const/16 v0, 0xa

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 90
    .line 91
    .line 92
    move-wide v6, v8

    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p0}, Lax/S0/G;->U()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/high16 v10, -0x10000

    .line 121
    .line 122
    const/high16 v11, 0x10000

    .line 123
    .line 124
    if-nez v1, :cond_8a

    .line 125
    .line 126
    if-ne v4, v11, :cond_8a

    .line 127
    .line 128
    if-eq v3, v10, :cond_83

    .line 129
    .line 130
    if-ne v3, v11, :cond_8a

    .line 131
    .line 132
    :cond_83
    if-nez v9, :cond_8a

    .line 133
    .line 134
    const/16 v0, 0x5a

    .line 135
    .line 136
    const/16 v9, 0x5a

    .line 137
    .line 138
    goto :goto_a9

    .line 139
    :cond_8a
    if-nez v1, :cond_99

    .line 140
    .line 141
    if-ne v4, v10, :cond_99

    .line 142
    .line 143
    if-eq v3, v11, :cond_92

    .line 144
    .line 145
    if-ne v3, v10, :cond_99

    .line 146
    .line 147
    :cond_92
    if-nez v9, :cond_99

    .line 148
    .line 149
    const/16 v0, 0x10e

    .line 150
    .line 151
    const/16 v9, 0x10e

    .line 152
    .line 153
    goto :goto_a9

    .line 154
    :cond_99
    if-eq v1, v10, :cond_9d

    .line 155
    .line 156
    if-ne v1, v11, :cond_a8

    .line 157
    .line 158
    :cond_9d
    if-nez v4, :cond_a8

    .line 159
    .line 160
    if-nez v3, :cond_a8

    .line 161
    .line 162
    if-ne v9, v10, :cond_a8

    .line 163
    .line 164
    const/16 v0, 0xb4

    .line 165
    .line 166
    const/16 v9, 0xb4

    .line 167
    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    const/4 v9, 0x0

    .line 170
    :goto_a9
    invoke-virtual {p0, v2}, Lax/S0/G;->c0(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lax/S0/G;->I()S

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    const/4 v0, 0x2

    .line 178
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lax/S0/G;->I()S

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    new-instance v4, Lax/K1/b$k;

    .line 186
    .line 187
    invoke-direct/range {v4 .. v11}, Lax/K1/b$k;-><init>(IJIIII)V

    .line 188
    .line 189
    .line 190
    return-object v4
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

.method public static G(Lax/T0/e$b;Lax/T0/e$c;JLax/P0/o;ZZ)Lax/K1/t;
    .registers 29
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const v3, 0x6d646961

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v3}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lax/T0/e$b;

    .line 17
    .line 18
    const v4, 0x68646c72    # 4.3148E24f

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v4}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lax/T0/e$c;

    .line 30
    .line 31
    iget-object v4, v4, Lax/T0/e$c;->b:Lax/S0/G;

    .line 32
    .line 33
    invoke-static {v4}, Lax/K1/b;->r(Lax/S0/G;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4}, Lax/K1/b;->f(I)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    const/4 v4, -0x1

    .line 42
    const/4 v5, 0x0

    .line 43
    if-ne v7, v4, :cond_2d

    .line 44
    .line 45
    return-object v5

    .line 46
    :cond_2d
    const v4, 0x746b6864

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v4}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Lax/T0/e$c;

    .line 58
    .line 59
    iget-object v4, v4, Lax/T0/e$c;->b:Lax/S0/G;

    .line 60
    .line 61
    invoke-static {v4}, Lax/K1/b;->F(Lax/S0/G;)Lax/K1/b$k;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v6, p2, v8

    .line 71
    .line 72
    if-nez v6, :cond_51

    .line 73
    .line 74
    invoke-static {v4}, Lax/K1/b$k;->a(Lax/K1/b$k;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    move-wide v12, v10

    .line 79
    :goto_4e
    move-object/from16 v6, p1

    .line 80
    .line 81
    goto :goto_54

    .line 82
    :cond_51
    move-wide/from16 v12, p2

    .line 83
    .line 84
    goto :goto_4e

    .line 85
    :goto_54
    iget-object v6, v6, Lax/T0/e$c;->b:Lax/S0/G;

    .line 86
    .line 87
    invoke-static {v6}, Lax/K1/b;->w(Lax/S0/G;)Lax/T0/g;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-wide v10, v6, Lax/T0/g;->c:J

    .line 92
    .line 93
    cmp-long v6, v12, v8

    .line 94
    .line 95
    if-nez v6, :cond_62

    .line 96
    .line 97
    :goto_60
    move-wide v12, v8

    .line 98
    goto :goto_6c

    .line 99
    :cond_62
    const-wide/32 v14, 0xf4240

    .line 100
    .line 101
    .line 102
    move-wide/from16 v16, v10

    .line 103
    .line 104
    invoke-static/range {v12 .. v17}, Lax/S0/d0;->p1(JJJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    goto :goto_60

    .line 109
    :goto_6c
    const v6, 0x6d696e66

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v6}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Lax/T0/e$b;

    .line 121
    .line 122
    const v8, 0x7374626c

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v8}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v6}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    check-cast v6, Lax/T0/e$b;

    .line 134
    .line 135
    const v8, 0x6d646864

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v8}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Lax/T0/e$c;

    .line 147
    .line 148
    iget-object v3, v3, Lax/T0/e$c;->b:Lax/S0/G;

    .line 149
    .line 150
    invoke-static {v3}, Lax/K1/b;->t(Lax/S0/G;)Lax/K1/b$e;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    const v8, 0x73747364

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v8}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-eqz v6, :cond_132

    .line 162
    .line 163
    iget-object v6, v6, Lax/T0/e$c;->b:Lax/S0/G;

    .line 164
    .line 165
    invoke-static {v3}, Lax/K1/b$e;->a(Lax/K1/b$e;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    move-object/from16 v9, p4

    .line 170
    .line 171
    move/from16 v14, p6

    .line 172
    .line 173
    invoke-static {v6, v4, v8, v9, v14}, Lax/K1/b;->D(Lax/S0/G;Lax/K1/b$k;Ljava/lang/String;Lax/P0/o;Z)Lax/K1/b$h;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-nez p5, :cond_ce

    .line 178
    .line 179
    const v8, 0x65647473

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v8}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_ce

    .line 187
    .line 188
    invoke-static {v0}, Lax/K1/b;->m(Lax/T0/e$b;)Landroid/util/Pair;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_ce

    .line 193
    .line 194
    iget-object v8, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v8, [J

    .line 197
    .line 198
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, [J

    .line 201
    .line 202
    move-object/from16 v21, v0

    .line 203
    .line 204
    move-object/from16 v20, v8

    .line 205
    .line 206
    goto :goto_d2

    .line 207
    :cond_ce
    move-object/from16 v20, v5

    .line 208
    .line 209
    move-object/from16 v21, v20

    .line 210
    .line 211
    :goto_d2
    iget-object v0, v6, Lax/K1/b$h;->b:Lax/P0/v;

    .line 212
    .line 213
    if-nez v0, :cond_d7

    .line 214
    .line 215
    return-object v5

    .line 216
    :cond_d7
    invoke-static {v4}, Lax/K1/b$k;->b(Lax/K1/b$k;)I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_110

    .line 221
    .line 222
    new-instance v0, Lax/T0/d;

    .line 223
    .line 224
    invoke-static {v4}, Lax/K1/b$k;->b(Lax/K1/b$k;)I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    invoke-direct {v0, v5}, Lax/T0/d;-><init>(I)V

    .line 229
    .line 230
    .line 231
    iget-object v5, v6, Lax/K1/b$h;->b:Lax/P0/v;

    .line 232
    .line 233
    invoke-virtual {v5}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    iget-object v8, v6, Lax/K1/b$h;->b:Lax/P0/v;

    .line 238
    .line 239
    iget-object v8, v8, Lax/P0/v;->l:Lax/P0/C;

    .line 240
    .line 241
    if-eqz v8, :cond_fb

    .line 242
    .line 243
    new-array v2, v2, [Lax/P0/C$a;

    .line 244
    .line 245
    aput-object v0, v2, v1

    .line 246
    .line 247
    invoke-virtual {v8, v2}, Lax/P0/C;->a([Lax/P0/C$a;)Lax/P0/C;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    goto :goto_105

    .line 252
    :cond_fb
    new-instance v8, Lax/P0/C;

    .line 253
    .line 254
    new-array v2, v2, [Lax/P0/C$a;

    .line 255
    .line 256
    aput-object v0, v2, v1

    .line 257
    .line 258
    invoke-direct {v8, v2}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 259
    .line 260
    .line 261
    move-object v0, v8

    .line 262
    :goto_105
    invoke-virtual {v5, v0}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    :goto_10d
    move-object/from16 v16, v0

    .line 271
    .line 272
    goto :goto_113

    .line 273
    :cond_110
    iget-object v0, v6, Lax/K1/b$h;->b:Lax/P0/v;

    .line 274
    .line 275
    goto :goto_10d

    .line 276
    :goto_113
    new-instance v5, Lax/K1/t;

    .line 277
    .line 278
    invoke-static {v4}, Lax/K1/b$k;->c(Lax/K1/b$k;)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    invoke-static {v3}, Lax/K1/b$e;->b(Lax/K1/b$e;)J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    invoke-static {v3}, Lax/K1/b$e;->c(Lax/K1/b$e;)J

    .line 287
    .line 288
    .line 289
    move-result-wide v14

    .line 290
    iget v1, v6, Lax/K1/b$h;->d:I

    .line 291
    .line 292
    iget-object v2, v6, Lax/K1/b$h;->a:[Lax/K1/u;

    .line 293
    .line 294
    iget v3, v6, Lax/K1/b$h;->c:I

    .line 295
    .line 296
    move v6, v0

    .line 297
    move/from16 v17, v1

    .line 298
    .line 299
    move-object/from16 v18, v2

    .line 300
    .line 301
    move/from16 v19, v3

    .line 302
    .line 303
    invoke-direct/range {v5 .. v21}, Lax/K1/t;-><init>(IIJJJJLax/P0/v;I[Lax/K1/u;I[J[J)V

    .line 304
    .line 305
    .line 306
    return-object v5

    .line 307
    :cond_132
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 308
    .line 309
    invoke-static {v0, v5}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    throw v0
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

.method public static H(Lax/T0/e$b;Lax/q1/F;JLax/P0/o;ZZLax/q7/f;)Ljava/util/List;
    .registers 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/T0/e$b;",
            "Lax/q1/F;",
            "J",
            "Lax/P0/o;",
            "ZZ",
            "Lax/q7/f<",
            "Lax/K1/t;",
            "Lax/K1/t;",
            ">;)",
            "Ljava/util/List<",
            "Lax/K1/w;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    iget-object v2, p0, Lax/T0/e$b;->d:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_75

    .line 14
    .line 15
    iget-object v2, p0, Lax/T0/e$b;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v3, v2

    .line 22
    check-cast v3, Lax/T0/e$b;

    .line 23
    .line 24
    iget v2, v3, Lax/T0/e;->a:I

    .line 25
    .line 26
    const v4, 0x7472616b

    .line 27
    .line 28
    .line 29
    if-eq v2, v4, :cond_21

    .line 30
    .line 31
    move-object/from16 v3, p7

    .line 32
    .line 33
    goto :goto_72

    .line 34
    :cond_21
    const v2, 0x6d766864

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v4, v2

    .line 46
    check-cast v4, Lax/T0/e$c;

    .line 47
    .line 48
    move-wide v5, p2

    .line 49
    move-object v7, p4

    .line 50
    move v8, p5

    .line 51
    move/from16 v9, p6

    .line 52
    .line 53
    invoke-static/range {v3 .. v9}, Lax/K1/b;->G(Lax/T0/e$b;Lax/T0/e$c;JLax/P0/o;ZZ)Lax/K1/t;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v4, v3

    .line 58
    move-object/from16 v3, p7

    .line 59
    .line 60
    invoke-interface {v3, v2}, Lax/q7/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lax/K1/t;

    .line 65
    .line 66
    if-nez v2, :cond_44

    .line 67
    .line 68
    goto :goto_72

    .line 69
    :cond_44
    const v5, 0x6d646961

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v5}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lax/T0/e$b;

    .line 81
    .line 82
    const v5, 0x6d696e66

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lax/T0/e$b;

    .line 94
    .line 95
    const v5, 0x7374626c

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v5}, Lax/T0/e$b;->d(I)Lax/T0/e$b;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Lax/T0/e$b;

    .line 107
    .line 108
    invoke-static {v2, v4, p1}, Lax/K1/b;->B(Lax/K1/t;Lax/T0/e$b;Lax/q1/F;)Lax/K1/w;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :goto_72
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_75
    return-object v0
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
.end method

.method public static I(Lax/T0/e$c;)Lax/P0/C;
    .registers 7

    .line 1
    iget-object p0, p0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lax/P0/C;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v2, v2, [Lax/P0/C$a;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 14
    .line 15
    .line 16
    :goto_f
    invoke-virtual {p0}, Lax/S0/G;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-lt v2, v0, :cond_59

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const v5, 0x6d657461

    .line 35
    .line 36
    .line 37
    if-ne v4, v5, :cond_34

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lax/S0/G;->b0(I)V

    .line 40
    .line 41
    .line 42
    add-int v4, v2, v3

    .line 43
    .line 44
    invoke-static {p0, v4}, Lax/K1/b;->J(Lax/S0/G;I)Lax/P0/C;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1, v4}, Lax/P0/C;->b(Lax/P0/C;)Lax/P0/C;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_54

    .line 53
    :cond_34
    const v5, 0x736d7461

    .line 54
    .line 55
    .line 56
    if-ne v4, v5, :cond_47

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lax/S0/G;->b0(I)V

    .line 59
    .line 60
    .line 61
    add-int v4, v2, v3

    .line 62
    .line 63
    invoke-static {p0, v4}, Lax/K1/r;->b(Lax/S0/G;I)Lax/P0/C;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v1, v4}, Lax/P0/C;->b(Lax/P0/C;)Lax/P0/C;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_54

    .line 72
    :cond_47
    const v5, -0x56878686

    .line 73
    .line 74
    .line 75
    if-ne v4, v5, :cond_54

    .line 76
    .line 77
    invoke-static {p0}, Lax/K1/b;->M(Lax/S0/G;)Lax/P0/C;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v1, v4}, Lax/P0/C;->b(Lax/P0/C;)Lax/P0/C;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_54
    :goto_54
    add-int/2addr v2, v3

    .line 86
    invoke-virtual {p0, v2}, Lax/S0/G;->b0(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_f

    .line 90
    :cond_59
    return-object v1
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

.method private static J(Lax/S0/G;I)Lax/P0/C;
    .registers 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lax/K1/b;->g(Lax/S0/G;)V

    .line 7
    .line 8
    .line 9
    :goto_8
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v0, p1, :cond_2d

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const v3, 0x696c7374

    .line 28
    .line 29
    .line 30
    if-ne v2, v3, :cond_28

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 33
    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-static {p0, v0}, Lax/K1/b;->s(Lax/S0/G;I)Lax/P0/C;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_28
    add-int/2addr v0, v1

    .line 42
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_8

    .line 46
    :cond_2d
    const/4 p0, 0x0

    .line 47
    return-object p0
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
.end method

.method static K(Lax/S0/G;II)Lax/K1/b$l;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v2, v1

    .line 12
    :goto_b
    sub-int v3, v0, p1

    .line 13
    .line 14
    if-ge v3, p2, :cond_2f

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-lez v3, :cond_1a

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v4, 0x0

    .line 28
    :goto_1b
    const-string v5, "childAtomSize must be positive"

    .line 29
    .line 30
    invoke-static {v4, v5}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const v5, 0x65796573

    .line 38
    .line 39
    .line 40
    if-ne v4, v5, :cond_2d

    .line 41
    .line 42
    invoke-static {p0, v0, v3}, Lax/K1/b;->C(Lax/S0/G;II)Lax/K1/b$d;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_2d
    add-int/2addr v0, v3

    .line 47
    goto :goto_b

    .line 48
    :cond_2f
    if-nez v2, :cond_32

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_32
    new-instance p0, Lax/K1/b$l;

    .line 52
    .line 53
    invoke-direct {p0, v2}, Lax/K1/b$l;-><init>(Lax/K1/b$d;)V

    .line 54
    .line 55
    .line 56
    return-object p0
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

.method private static L(Lax/S0/G;IIIILjava/lang/String;ILax/P0/o;Lax/K1/b$h;I)V
    .registers 51
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    add-int/lit8 v5, v1, 0x10

    .line 1
    invoke-virtual {v0, v5}, Lax/S0/G;->b0(I)V

    const/16 v5, 0x10

    .line 2
    invoke-virtual {v0, v5}, Lax/S0/G;->c0(I)V

    .line 3
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v5

    .line 4
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v6

    const/16 v7, 0x32

    .line 5
    invoke-virtual {v0, v7}, Lax/S0/G;->c0(I)V

    .line 6
    invoke-virtual {v0}, Lax/S0/G;->g()I

    move-result v7

    const v8, 0x656e6376

    move/from16 v10, p1

    if-ne v10, v8, :cond_53

    .line 7
    invoke-static {v0, v1, v2}, Lax/K1/b;->z(Lax/S0/G;II)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_50

    .line 8
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_3e

    const/4 v3, 0x0

    goto :goto_48

    .line 9
    :cond_3e
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Lax/K1/u;

    iget-object v11, v11, Lax/K1/u;->b:Ljava/lang/String;

    invoke-virtual {v3, v11}, Lax/P0/o;->c(Ljava/lang/String;)Lax/P0/o;

    move-result-object v3

    .line 10
    :goto_48
    iget-object v11, v4, Lax/K1/b$h;->a:[Lax/K1/u;

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Lax/K1/u;

    aput-object v8, v11, p9

    .line 11
    :cond_50
    invoke-virtual {v0, v7}, Lax/S0/G;->b0(I)V

    :cond_53
    const v8, 0x6d317620

    .line 12
    const-string v11, "video/3gpp"

    if-ne v10, v8, :cond_5d

    .line 13
    const-string v8, "video/mpeg"

    goto :goto_65

    :cond_5d
    const v8, 0x48323633

    if-ne v10, v8, :cond_64

    move-object v8, v11

    goto :goto_65

    :cond_64
    const/4 v8, 0x0

    :goto_65
    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v15, 0x8

    const/16 v13, 0x8

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, -0x1

    const/16 v21, -0x1

    const/16 v22, -0x1

    const/16 v23, -0x1

    const/16 v24, -0x1

    const/16 v25, -0x1

    const/16 v26, -0x1

    const/16 v27, -0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    :goto_8b
    sub-int v12, v7, v1

    if-ge v12, v2, :cond_a4

    .line 14
    invoke-virtual {v0, v7}, Lax/S0/G;->b0(I)V

    .line 15
    invoke-virtual {v0}, Lax/S0/G;->g()I

    move-result v12

    .line 16
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v9

    if-nez v9, :cond_b9

    .line 17
    invoke-virtual {v0}, Lax/S0/G;->g()I

    move-result v32

    sub-int v1, v32, p2

    if-ne v1, v2, :cond_b9

    :cond_a4
    move-object/from16 v30, v3

    move/from16 v40, v14

    move-object/from16 v7, v17

    move/from16 v37, v20

    move/from16 v11, v25

    move/from16 v35, v26

    move/from16 v3, v27

    const/4 v2, 0x0

    move/from16 v25, v13

    move/from16 v27, v15

    goto/16 :goto_610

    :cond_b9
    if-lez v9, :cond_bf

    const/4 v1, 0x1

    :goto_bc
    const/16 p9, 0x1

    goto :goto_c1

    :cond_bf
    const/4 v1, 0x0

    goto :goto_bc

    .line 18
    :goto_c1
    const-string v2, "childAtomSize must be positive"

    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 19
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v1

    const v2, 0x61766343

    if-ne v1, v2, :cond_120

    if-nez v8, :cond_d4

    const/4 v1, 0x1

    :goto_d2
    const/4 v2, 0x0

    goto :goto_d6

    :cond_d4
    const/4 v1, 0x0

    goto :goto_d2

    .line 20
    :goto_d6
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    .line 21
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 22
    invoke-static {v0}, Lax/q1/d;->b(Lax/S0/G;)Lax/q1/d;

    move-result-object v1

    .line 23
    iget-object v2, v1, Lax/q1/d;->a:Ljava/util/List;

    .line 24
    iget v8, v1, Lax/q1/d;->b:I

    iput v8, v4, Lax/K1/b$h;->c:I

    if-nez v31, :cond_ec

    .line 25
    iget v14, v1, Lax/q1/d;->k:F

    .line 26
    :cond_ec
    iget-object v8, v1, Lax/q1/d;->l:Ljava/lang/String;

    .line 27
    iget v12, v1, Lax/q1/d;->j:I

    .line 28
    iget v13, v1, Lax/q1/d;->g:I

    .line 29
    iget v15, v1, Lax/q1/d;->h:I

    move-object/from16 v17, v2

    .line 30
    iget v2, v1, Lax/q1/d;->i:I

    move/from16 v18, v2

    .line 31
    iget v2, v1, Lax/q1/d;->e:I

    .line 32
    iget v1, v1, Lax/q1/d;->f:I

    .line 33
    const-string v21, "video/avc"

    move-object/from16 v25, v30

    move-object/from16 v30, v3

    move-object/from16 v3, v25

    move/from16 v25, v1

    move/from16 v32, v7

    move/from16 v26, v10

    move-object/from16 v33, v11

    move/from16 v34, v13

    move/from16 v35, v15

    move/from16 v27, v18

    const/4 v1, -0x1

    const/4 v13, 0x0

    move v15, v2

    move-object/from16 v18, v8

    move-object/from16 v8, v21

    const/4 v2, 0x0

    move/from16 v21, v12

    goto/16 :goto_5f7

    :cond_120
    const v2, 0x68766343

    move/from16 v32, v7

    const-string v7, "video/hevc"

    if-ne v1, v2, :cond_192

    if-nez v8, :cond_12e

    const/4 v1, 0x1

    :goto_12c
    const/4 v2, 0x0

    goto :goto_130

    :cond_12e
    const/4 v1, 0x0

    goto :goto_12c

    .line 34
    :goto_130
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    .line 35
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 36
    invoke-static {v0}, Lax/q1/G;->a(Lax/S0/G;)Lax/q1/G;

    move-result-object v1

    .line 37
    iget-object v2, v1, Lax/q1/G;->a:Ljava/util/List;

    .line 38
    iget v8, v1, Lax/q1/G;->b:I

    iput v8, v4, Lax/K1/b$h;->c:I

    if-nez v31, :cond_146

    .line 39
    iget v14, v1, Lax/q1/G;->n:F

    .line 40
    :cond_146
    iget v8, v1, Lax/q1/G;->o:I

    .line 41
    iget v12, v1, Lax/q1/G;->c:I

    .line 42
    iget-object v13, v1, Lax/q1/G;->p:Ljava/lang/String;

    .line 43
    iget v15, v1, Lax/q1/G;->m:I

    move-object/from16 v17, v2

    const/4 v2, -0x1

    if-eq v15, v2, :cond_155

    move/from16 v20, v15

    .line 44
    :cond_155
    iget v2, v1, Lax/q1/G;->f:I

    .line 45
    iget v15, v1, Lax/q1/G;->g:I

    move/from16 v18, v2

    .line 46
    iget v2, v1, Lax/q1/G;->j:I

    move/from16 v21, v2

    .line 47
    iget v2, v1, Lax/q1/G;->k:I

    move/from16 v22, v2

    .line 48
    iget v2, v1, Lax/q1/G;->l:I

    move/from16 v23, v2

    .line 49
    iget v2, v1, Lax/q1/G;->h:I

    move/from16 v24, v2

    .line 50
    iget v2, v1, Lax/q1/G;->i:I

    .line 51
    iget-object v1, v1, Lax/q1/G;->q:Lax/T0/h$k;

    move/from16 v25, v24

    move/from16 v24, v15

    move/from16 v15, v25

    move/from16 v25, v2

    move-object/from16 v30, v3

    move/from16 v26, v10

    move-object/from16 v33, v11

    move/from16 v34, v21

    move/from16 v35, v22

    move/from16 v27, v23

    const/4 v2, 0x0

    move-object v3, v1

    move/from16 v21, v8

    move/from16 v22, v12

    move/from16 v23, v18

    const/4 v1, -0x1

    move-object v8, v7

    move-object/from16 v18, v13

    :goto_18f
    const/4 v13, 0x0

    goto/16 :goto_5f7

    :cond_192
    const v2, 0x6c687643

    move-object/from16 v33, v11

    const/4 v11, 0x2

    if-ne v1, v2, :cond_261

    .line 52
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "lhvC must follow hvcC atom"

    .line 53
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    move-object/from16 v2, v30

    if-eqz v2, :cond_1b1

    .line 54
    iget-object v1, v2, Lax/T0/h$k;->b:Lax/r7/z;

    .line 55
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-lt v1, v11, :cond_1b1

    const/4 v1, 0x1

    goto :goto_1b2

    :cond_1b1
    const/4 v1, 0x0

    :goto_1b2
    const-string v7, "must have at least two layers"

    .line 56
    invoke-static {v1, v7}, Lax/q1/u;->a(ZLjava/lang/String;)V

    add-int/lit8 v12, v12, 0x8

    .line 57
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 58
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lax/T0/h$k;

    invoke-static {v0, v1}, Lax/q1/G;->c(Lax/S0/G;Lax/T0/h$k;)Lax/q1/G;

    move-result-object v1

    .line 59
    iget v7, v4, Lax/K1/b$h;->c:I

    iget v8, v1, Lax/q1/G;->b:I

    if-ne v7, v8, :cond_1ce

    const/4 v7, 0x1

    goto :goto_1cf

    :cond_1ce
    const/4 v7, 0x0

    :goto_1cf
    const-string v8, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    invoke-static {v7, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 60
    iget v7, v1, Lax/q1/G;->j:I

    const/4 v8, -0x1

    move/from16 v11, v25

    if-eq v7, v8, :cond_1e5

    if-ne v11, v7, :cond_1df

    const/4 v7, 0x1

    goto :goto_1e0

    :cond_1df
    const/4 v7, 0x0

    .line 61
    :goto_1e0
    const-string v12, "colorSpace must be the same for both views"

    invoke-static {v7, v12}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 62
    :cond_1e5
    iget v7, v1, Lax/q1/G;->k:I

    move/from16 v12, v26

    if-eq v7, v8, :cond_1f5

    if-ne v12, v7, :cond_1ef

    const/4 v7, 0x1

    goto :goto_1f0

    :cond_1ef
    const/4 v7, 0x0

    .line 63
    :goto_1f0
    const-string v8, "colorRange must be the same for both views"

    invoke-static {v7, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 64
    :cond_1f5
    iget v7, v1, Lax/q1/G;->l:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_20a

    move/from16 v8, v27

    if-ne v8, v7, :cond_202

    const/4 v7, 0x1

    :goto_1ff
    move/from16 v18, v8

    goto :goto_204

    :cond_202
    const/4 v7, 0x0

    goto :goto_1ff

    .line 65
    :goto_204
    const-string v8, "colorTransfer must be the same for both views"

    invoke-static {v7, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    goto :goto_20c

    :cond_20a
    move/from16 v18, v27

    .line 66
    :goto_20c
    iget v7, v1, Lax/q1/G;->h:I

    if-ne v15, v7, :cond_212

    const/4 v7, 0x1

    goto :goto_213

    :cond_212
    const/4 v7, 0x0

    :goto_213
    const-string v8, "bitdepthLuma must be the same for both views"

    invoke-static {v7, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 67
    iget v7, v1, Lax/q1/G;->i:I

    if-ne v13, v7, :cond_21e

    const/4 v7, 0x1

    goto :goto_21f

    :cond_21e
    const/4 v7, 0x0

    :goto_21f
    const-string v8, "bitdepthChroma must be the same for both views"

    invoke-static {v7, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    move-object/from16 v7, v17

    if-eqz v7, :cond_23f

    .line 68
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    move-result-object v8

    .line 69
    invoke-virtual {v8, v7}, Lax/r7/z$a;->j(Ljava/lang/Iterable;)Lax/r7/z$a;

    move-result-object v7

    iget-object v8, v1, Lax/q1/G;->a:Ljava/util/List;

    .line 70
    invoke-virtual {v7, v8}, Lax/r7/z$a;->j(Ljava/lang/Iterable;)Lax/r7/z$a;

    move-result-object v7

    .line 71
    invoke-virtual {v7}, Lax/r7/z$a;->k()Lax/r7/z;

    move-result-object v17

    move-object/from16 v7, v17

    move/from16 v17, v11

    goto :goto_247

    .line 72
    :cond_23f
    const-string v8, "initializationData must be already set from hvcC atom"

    move/from16 v17, v11

    const/4 v11, 0x0

    invoke-static {v11, v8}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 73
    :goto_247
    iget-object v1, v1, Lax/q1/G;->p:Ljava/lang/String;

    .line 74
    const-string v8, "video/mv-hevc"

    move-object/from16 v30, v3

    move/from16 v26, v10

    move/from16 v35, v12

    move/from16 v25, v13

    move/from16 v34, v17

    move/from16 v27, v18

    const/4 v13, 0x0

    move-object/from16 v18, v1

    move-object v3, v2

    move-object/from16 v17, v7

    const/4 v1, -0x1

    :goto_25e
    const/4 v2, 0x0

    goto/16 :goto_5f7

    :cond_261
    move-object/from16 v7, v17

    move/from16 v34, v25

    move/from16 v35, v26

    move/from16 v36, v27

    move-object/from16 v2, v30

    const v11, 0x76657875

    if-ne v1, v11, :cond_2d1

    .line 75
    invoke-static {v0, v12, v9}, Lax/K1/b;->K(Lax/S0/G;II)Lax/K1/b$l;

    move-result-object v1

    if-eqz v1, :cond_2a3

    .line 76
    invoke-static {v1}, Lax/K1/b$l;->a(Lax/K1/b$l;)Lax/K1/b$d;

    move-result-object v11

    if-eqz v11, :cond_2a3

    if-eqz v2, :cond_2a6

    .line 77
    iget-object v11, v2, Lax/T0/h$k;->b:Lax/r7/z;

    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    const/4 v12, 0x2

    if-lt v11, v12, :cond_2a6

    .line 78
    invoke-virtual {v1}, Lax/K1/b$l;->b()Z

    move-result v11

    const-string v12, "both eye views must be marked as available"

    .line 79
    invoke-static {v11, v12}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 80
    invoke-static {v1}, Lax/K1/b$l;->a(Lax/K1/b$l;)Lax/K1/b$d;

    move-result-object v1

    invoke-static {v1}, Lax/K1/b$d;->a(Lax/K1/b$d;)Lax/K1/b$g;

    move-result-object v1

    invoke-static {v1}, Lax/K1/b$g;->a(Lax/K1/b$g;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v11, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 81
    invoke-static {v1, v11}, Lax/q1/u;->a(ZLjava/lang/String;)V

    :cond_2a3
    move/from16 v11, v20

    goto :goto_2c1

    :cond_2a6
    move/from16 v11, v20

    const/4 v12, -0x1

    if-ne v11, v12, :cond_2c1

    .line 82
    invoke-static {v1}, Lax/K1/b$l;->a(Lax/K1/b$l;)Lax/K1/b$d;

    move-result-object v1

    invoke-static {v1}, Lax/K1/b$d;->a(Lax/K1/b$d;)Lax/K1/b$g;

    move-result-object v1

    invoke-static {v1}, Lax/K1/b$g;->a(Lax/K1/b$g;)Z

    move-result v1

    if-eqz v1, :cond_2bd

    const/4 v1, 0x5

    const/16 v20, 0x5

    goto :goto_2c3

    :cond_2bd
    const/4 v1, 0x4

    const/16 v20, 0x4

    goto :goto_2c3

    :cond_2c1
    :goto_2c1
    move/from16 v20, v11

    :goto_2c3
    move-object/from16 v30, v3

    move-object/from16 v17, v7

    move/from16 v26, v10

    move/from16 v25, v13

    move/from16 v27, v36

    const/4 v1, -0x1

    const/4 v13, 0x0

    move-object v3, v2

    goto :goto_25e

    :cond_2d1
    move/from16 v11, v20

    move-object/from16 v20, v2

    const v2, 0x64766343

    if-eq v1, v2, :cond_2e4

    const v2, 0x64767643

    if-eq v1, v2, :cond_2e4

    const v2, 0x64767743

    if-ne v1, v2, :cond_2f8

    :cond_2e4
    move-object/from16 v30, v3

    move/from16 v26, v10

    move/from16 v37, v11

    move/from16 v25, v13

    move/from16 v40, v14

    move/from16 v27, v15

    move/from16 v11, v34

    move/from16 v3, v36

    const/4 v1, -0x1

    const/4 v2, 0x0

    goto/16 :goto_5bd

    :cond_2f8
    const v2, 0x76706343

    if-ne v1, v2, :cond_36c

    if-nez v8, :cond_302

    const/4 v1, 0x1

    :goto_300
    const/4 v2, 0x0

    goto :goto_304

    :cond_302
    const/4 v1, 0x0

    goto :goto_300

    .line 83
    :goto_304
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    const v1, 0x76703038

    .line 84
    const-string v2, "video/x-vnd.on2.vp9"

    if-ne v10, v1, :cond_311

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_312

    :cond_311
    move-object v1, v2

    :goto_312
    add-int/lit8 v12, v12, 0xc

    .line 85
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 86
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v8

    int-to-byte v8, v8

    .line 87
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v12

    int-to-byte v12, v12

    .line 88
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v13

    shr-int/lit8 v15, v13, 0x4

    shr-int/lit8 v25, v13, 0x1

    move/from16 v26, v10

    and-int/lit8 v10, v25, 0x7

    int-to-byte v10, v10

    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33a

    int-to-byte v2, v15

    .line 90
    invoke-static {v8, v12, v2, v10}, Lax/S0/i;->k(BBBB)Lax/r7/z;

    move-result-object v2

    move-object v7, v2

    :cond_33a
    and-int/lit8 v2, v13, 0x1

    if-eqz v2, :cond_340

    const/4 v2, 0x1

    goto :goto_341

    :cond_340
    const/4 v2, 0x0

    .line 91
    :goto_341
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v8

    .line 92
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v10

    .line 93
    invoke-static {v8}, Lax/P0/j;->k(I)I

    move-result v25

    if-eqz v2, :cond_352

    const/16 v17, 0x1

    goto :goto_354

    :cond_352
    const/16 v17, 0x2

    .line 94
    :goto_354
    invoke-static {v10}, Lax/P0/j;->l(I)I

    move-result v27

    move-object v8, v1

    move-object/from16 v30, v3

    move/from16 v35, v17

    move-object/from16 v3, v20

    move/from16 v34, v25

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v7

    move/from16 v20, v11

    move/from16 v25, v15

    goto/16 :goto_5f7

    :cond_36c
    move/from16 v26, v10

    const v2, 0x61763143

    if-ne v1, v2, :cond_3a9

    add-int/lit8 v1, v9, -0x8

    .line 95
    new-array v2, v1, [B

    const/4 v7, 0x0

    .line 96
    invoke-virtual {v0, v2, v7, v1}, Lax/S0/G;->q([BII)V

    .line 97
    invoke-static {v2}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v17

    add-int/lit8 v12, v12, 0x8

    .line 98
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 99
    invoke-static {v0}, Lax/K1/b;->j(Lax/S0/G;)Lax/P0/j;

    move-result-object v1

    .line 100
    iget v2, v1, Lax/P0/j;->e:I

    .line 101
    iget v7, v1, Lax/P0/j;->f:I

    .line 102
    iget v8, v1, Lax/P0/j;->a:I

    .line 103
    iget v10, v1, Lax/P0/j;->b:I

    .line 104
    iget v1, v1, Lax/P0/j;->c:I

    .line 105
    const-string v12, "video/av01"

    move/from16 v27, v1

    move v15, v2

    move-object/from16 v30, v3

    move/from16 v25, v7

    move/from16 v34, v8

    move/from16 v35, v10

    move-object v8, v12

    move-object/from16 v3, v20

    :goto_3a2
    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v13, 0x0

    move/from16 v20, v11

    goto/16 :goto_5f7

    :cond_3a9
    const v2, 0x636c6c69

    if-ne v1, v2, :cond_3d6

    if-nez v16, :cond_3b4

    .line 106
    invoke-static {}, Lax/K1/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v16

    :cond_3b4
    move-object/from16 v1, v16

    const/16 v2, 0x15

    .line 107
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 108
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 109
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v16, v1

    move-object/from16 v30, v3

    move-object/from16 v17, v7

    move/from16 v25, v13

    move-object/from16 v3, v20

    move/from16 v27, v36

    goto :goto_3a2

    :cond_3d6
    const v2, 0x6d646376

    if-ne v1, v2, :cond_453

    if-nez v16, :cond_3e1

    .line 110
    invoke-static {}, Lax/K1/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v16

    :cond_3e1
    move-object/from16 v1, v16

    .line 111
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v2

    .line 112
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v10

    .line 113
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v12

    .line 114
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v4

    move/from16 v25, v13

    .line 115
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v13

    move/from16 v27, v15

    .line 116
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v15

    move-object/from16 v30, v3

    .line 117
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v3

    move/from16 v37, v11

    .line 118
    invoke-virtual {v0}, Lax/S0/G;->I()S

    move-result v11

    .line 119
    invoke-virtual {v0}, Lax/S0/G;->O()J

    move-result-wide v16

    .line 120
    invoke-virtual {v0}, Lax/S0/G;->O()J

    move-result-wide v38

    move/from16 v40, v14

    const/4 v14, 0x1

    .line 121
    invoke-virtual {v1, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 122
    invoke-virtual {v1, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 123
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 124
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 125
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 126
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 127
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 128
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 129
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v2, 0x2710

    .line 130
    div-long v10, v16, v2

    long-to-int v4, v10

    int-to-short v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 131
    div-long v2, v38, v2

    long-to-int v3, v2

    int-to-short v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v16, v1

    move-object/from16 v17, v7

    move-object/from16 v3, v20

    move/from16 v15, v27

    move/from16 v27, v36

    move/from16 v20, v37

    move/from16 v14, v40

    const/4 v1, -0x1

    const/4 v2, 0x0

    goto/16 :goto_18f

    :cond_453
    move-object/from16 v30, v3

    move/from16 v37, v11

    move/from16 v25, v13

    move/from16 v40, v14

    move/from16 v27, v15

    const v2, 0x64323633

    if-ne v1, v2, :cond_47d

    if-nez v8, :cond_467

    const/4 v1, 0x1

    :goto_465
    const/4 v2, 0x0

    goto :goto_469

    :cond_467
    const/4 v1, 0x0

    goto :goto_465

    .line 132
    :goto_469
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    move-object/from16 v17, v7

    move-object/from16 v3, v20

    move/from16 v15, v27

    move-object/from16 v8, v33

    :goto_474
    move/from16 v27, v36

    :goto_476
    move/from16 v20, v37

    move/from16 v14, v40

    const/4 v1, -0x1

    goto/16 :goto_18f

    :cond_47d
    const/4 v2, 0x0

    const v3, 0x65736473

    if-ne v1, v3, :cond_4a6

    if-nez v8, :cond_487

    const/4 v1, 0x1

    goto :goto_488

    :cond_487
    const/4 v1, 0x0

    .line 133
    :goto_488
    invoke-static {v1, v2}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 134
    invoke-static {v0, v12}, Lax/K1/b;->n(Lax/S0/G;I)Lax/K1/b$c;

    move-result-object v29

    .line 135
    invoke-static/range {v29 .. v29}, Lax/K1/b$c;->a(Lax/K1/b$c;)Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-static/range {v29 .. v29}, Lax/K1/b$c;->d(Lax/K1/b$c;)[B

    move-result-object v3

    if-eqz v3, :cond_49e

    .line 137
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v17

    goto :goto_4a0

    :cond_49e
    move-object/from16 v17, v7

    :goto_4a0
    move-object v8, v1

    :goto_4a1
    move-object/from16 v3, v20

    move/from16 v15, v27

    goto :goto_474

    :cond_4a6
    const v3, 0x62747274

    if-ne v1, v3, :cond_4b2

    .line 138
    invoke-static {v0, v12}, Lax/K1/b;->k(Lax/S0/G;I)Lax/K1/b$a;

    move-result-object v28

    :cond_4af
    :goto_4af
    move-object/from16 v17, v7

    goto :goto_4a1

    :cond_4b2
    const v3, 0x70617370

    if-ne v1, v3, :cond_4cc

    .line 139
    invoke-static {v0, v12}, Lax/K1/b;->x(Lax/S0/G;I)F

    move-result v1

    move v14, v1

    move-object/from16 v17, v7

    move-object/from16 v3, v20

    move/from16 v15, v27

    move/from16 v27, v36

    move/from16 v20, v37

    const/4 v1, -0x1

    const/4 v13, 0x0

    const/16 v31, 0x1

    goto/16 :goto_5f7

    :cond_4cc
    const v3, 0x73763364

    if-ne v1, v3, :cond_4d6

    .line 140
    invoke-static {v0, v12, v9}, Lax/K1/b;->y(Lax/S0/G;II)[B

    move-result-object v19

    goto :goto_4af

    :cond_4d6
    const v3, 0x73743364

    if-ne v1, v3, :cond_500

    .line 141
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v1

    const/4 v3, 0x3

    .line 142
    invoke-virtual {v0, v3}, Lax/S0/G;->c0(I)V

    if-nez v1, :cond_4af

    .line 143
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v1

    if-eqz v1, :cond_4fd

    const/4 v14, 0x1

    if-eq v1, v14, :cond_4fa

    const/4 v12, 0x2

    if-eq v1, v12, :cond_4f7

    if-eq v1, v3, :cond_4f4

    goto :goto_4af

    :cond_4f4
    const/16 v37, 0x3

    goto :goto_4af

    :cond_4f7
    const/16 v37, 0x2

    goto :goto_4af

    :cond_4fa
    const/16 v37, 0x1

    goto :goto_4af

    :cond_4fd
    const/16 v37, 0x0

    goto :goto_4af

    :cond_500
    const/4 v14, 0x1

    const v3, 0x61707643

    if-ne v1, v3, :cond_53a

    add-int/lit8 v1, v9, -0xc

    .line 144
    new-array v3, v1, [B

    add-int/lit8 v12, v12, 0xc

    .line 145
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    const/4 v7, 0x0

    .line 146
    invoke-virtual {v0, v3, v7, v1}, Lax/S0/G;->q([BII)V

    .line 147
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v17

    .line 148
    new-instance v1, Lax/S0/G;

    invoke-direct {v1, v3}, Lax/S0/G;-><init>([B)V

    invoke-static {v1}, Lax/K1/b;->h(Lax/S0/G;)Lax/P0/j;

    move-result-object v1

    .line 149
    iget v3, v1, Lax/P0/j;->e:I

    .line 150
    iget v4, v1, Lax/P0/j;->f:I

    .line 151
    iget v7, v1, Lax/P0/j;->a:I

    .line 152
    iget v8, v1, Lax/P0/j;->b:I

    .line 153
    iget v1, v1, Lax/P0/j;->c:I

    .line 154
    const-string v10, "video/apv"

    move/from16 v27, v1

    move v15, v3

    move/from16 v25, v4

    move/from16 v34, v7

    move/from16 v35, v8

    move-object v8, v10

    move-object/from16 v3, v20

    goto/16 :goto_476

    :cond_53a
    const v3, 0x636f6c72

    move/from16 v11, v34

    if-ne v1, v3, :cond_5aa

    const/4 v1, -0x1

    move/from16 v3, v36

    if-ne v11, v1, :cond_5ad

    if-ne v3, v1, :cond_5ad

    .line 155
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v4

    const v10, 0x6e636c78

    if-eq v4, v10, :cond_572

    const v10, 0x6e636c63

    if-ne v4, v10, :cond_557

    goto :goto_572

    .line 156
    :cond_557
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Unsupported color type: "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lax/T0/e;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v10, "BoxParsers"

    invoke-static {v10, v4}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5ad

    .line 157
    :cond_572
    :goto_572
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v3

    .line 158
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v4

    const/4 v12, 0x2

    .line 159
    invoke-virtual {v0, v12}, Lax/S0/G;->c0(I)V

    const/16 v10, 0x13

    if-ne v9, v10, :cond_58c

    .line 160
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v10

    and-int/lit16 v10, v10, 0x80

    if-eqz v10, :cond_58c

    const/4 v11, 0x1

    goto :goto_58d

    :cond_58c
    const/4 v11, 0x0

    .line 161
    :goto_58d
    invoke-static {v3}, Lax/P0/j;->k(I)I

    move-result v3

    if-eqz v11, :cond_594

    const/4 v12, 0x1

    .line 162
    :cond_594
    invoke-static {v4}, Lax/P0/j;->l(I)I

    move-result v4

    move/from16 v34, v3

    move-object/from16 v17, v7

    move/from16 v35, v12

    move-object/from16 v3, v20

    move/from16 v15, v27

    move/from16 v20, v37

    move/from16 v14, v40

    const/4 v13, 0x0

    move/from16 v27, v4

    goto :goto_5f7

    :cond_5aa
    move/from16 v3, v36

    const/4 v1, -0x1

    :cond_5ad
    :goto_5ad
    move-object/from16 v17, v7

    move/from16 v34, v11

    move/from16 v15, v27

    move/from16 v14, v40

    const/4 v13, 0x0

    :goto_5b6
    move/from16 v27, v3

    move-object/from16 v3, v20

    move/from16 v20, v37

    goto :goto_5f7

    :goto_5bd
    add-int/lit8 v4, v9, -0x8

    .line 163
    new-array v10, v4, [B

    const/4 v13, 0x0

    .line 164
    invoke-virtual {v0, v10, v13, v4}, Lax/S0/G;->q([BII)V

    if-eqz v7, :cond_5d8

    .line 165
    invoke-static {}, Lax/r7/z;->r()Lax/r7/z$a;

    move-result-object v4

    .line 166
    invoke-virtual {v4, v7}, Lax/r7/z$a;->j(Ljava/lang/Iterable;)Lax/r7/z$a;

    move-result-object v4

    .line 167
    invoke-virtual {v4, v10}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    move-result-object v4

    .line 168
    invoke-virtual {v4}, Lax/r7/z$a;->k()Lax/r7/z;

    move-result-object v17

    goto :goto_5df

    .line 169
    :cond_5d8
    const-string v4, "initializationData must already be set from hvcC or avcC atom"

    invoke-static {v13, v4}, Lax/q1/u;->a(ZLjava/lang/String;)V

    move-object/from16 v17, v7

    :goto_5df
    add-int/lit8 v12, v12, 0x8

    .line 170
    invoke-virtual {v0, v12}, Lax/S0/G;->b0(I)V

    .line 171
    invoke-static {v0}, Lax/T0/a;->a(Lax/S0/G;)Lax/T0/a;

    move-result-object v4

    if-eqz v4, :cond_5f0

    .line 172
    iget-object v4, v4, Lax/T0/a;->c:Ljava/lang/String;

    .line 173
    const-string v8, "video/dolby-vision"

    move-object/from16 v18, v4

    :cond_5f0
    move/from16 v34, v11

    move/from16 v15, v27

    move/from16 v14, v40

    goto :goto_5b6

    :goto_5f7
    add-int v7, v32, v9

    move-object/from16 v1, v30

    move-object/from16 v30, v3

    move-object v3, v1

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v4, p8

    move/from16 v13, v25

    move/from16 v10, v26

    move-object/from16 v11, v33

    move/from16 v25, v34

    move/from16 v26, v35

    goto/16 :goto_8b

    :goto_610
    if-nez v8, :cond_613

    return-void

    .line 174
    :cond_613
    new-instance v0, Lax/P0/v$b;

    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    move/from16 v1, p4

    .line 175
    invoke-virtual {v0, v1}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    move-result-object v0

    .line 176
    invoke-virtual {v0, v8}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    move-object/from16 v9, v18

    .line 177
    invoke-virtual {v0, v9}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    .line 178
    invoke-virtual {v0, v5}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    move-result-object v0

    .line 179
    invoke-virtual {v0, v6}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    move-result-object v0

    move/from16 v12, v23

    .line 180
    invoke-virtual {v0, v12}, Lax/P0/v$b;->b0(I)Lax/P0/v$b;

    move-result-object v0

    move/from16 v12, v24

    .line 181
    invoke-virtual {v0, v12}, Lax/P0/v$b;->a0(I)Lax/P0/v$b;

    move-result-object v0

    move/from16 v14, v40

    .line 182
    invoke-virtual {v0, v14}, Lax/P0/v$b;->u0(F)Lax/P0/v$b;

    move-result-object v0

    move/from16 v1, p6

    .line 183
    invoke-virtual {v0, v1}, Lax/P0/v$b;->x0(I)Lax/P0/v$b;

    move-result-object v0

    move-object/from16 v9, v19

    .line 184
    invoke-virtual {v0, v9}, Lax/P0/v$b;->v0([B)Lax/P0/v$b;

    move-result-object v0

    move/from16 v12, v37

    .line 185
    invoke-virtual {v0, v12}, Lax/P0/v$b;->B0(I)Lax/P0/v$b;

    move-result-object v0

    .line 186
    invoke-virtual {v0, v7}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    move-result-object v0

    move/from16 v12, v21

    .line 187
    invoke-virtual {v0, v12}, Lax/P0/v$b;->p0(I)Lax/P0/v$b;

    move-result-object v0

    move/from16 v12, v22

    .line 188
    invoke-virtual {v0, v12}, Lax/P0/v$b;->q0(I)Lax/P0/v$b;

    move-result-object v0

    move-object/from16 v1, v30

    .line 189
    invoke-virtual {v0, v1}, Lax/P0/v$b;->c0(Lax/P0/o;)Lax/P0/v$b;

    move-result-object v0

    move-object/from16 v1, p5

    .line 190
    invoke-virtual {v0, v1}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    new-instance v1, Lax/P0/j$b;

    invoke-direct {v1}, Lax/P0/j$b;-><init>()V

    .line 191
    invoke-virtual {v1, v11}, Lax/P0/j$b;->d(I)Lax/P0/j$b;

    move-result-object v1

    move/from16 v12, v35

    .line 192
    invoke-virtual {v1, v12}, Lax/P0/j$b;->c(I)Lax/P0/j$b;

    move-result-object v1

    .line 193
    invoke-virtual {v1, v3}, Lax/P0/j$b;->e(I)Lax/P0/j$b;

    move-result-object v1

    if-eqz v16, :cond_68a

    .line 194
    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_68b

    :cond_68a
    move-object v9, v2

    :goto_68b
    invoke-virtual {v1, v9}, Lax/P0/j$b;->f([B)Lax/P0/j$b;

    move-result-object v1

    move/from16 v15, v27

    .line 195
    invoke-virtual {v1, v15}, Lax/P0/j$b;->g(I)Lax/P0/j$b;

    move-result-object v1

    move/from16 v15, v25

    .line 196
    invoke-virtual {v1, v15}, Lax/P0/j$b;->b(I)Lax/P0/j$b;

    move-result-object v1

    .line 197
    invoke-virtual {v1}, Lax/P0/j$b;->a()Lax/P0/j;

    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Lax/P0/v$b;->V(Lax/P0/j;)Lax/P0/v$b;

    move-result-object v0

    if-eqz v28, :cond_6bd

    .line 199
    invoke-static/range {v28 .. v28}, Lax/K1/b$a;->b(Lax/K1/b$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lax/u7/f;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    move-result-object v1

    .line 200
    invoke-static/range {v28 .. v28}, Lax/K1/b$a;->a(Lax/K1/b$a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lax/u7/f;->n(J)I

    move-result v2

    invoke-virtual {v1, v2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    goto :goto_6d6

    :cond_6bd
    if-eqz v29, :cond_6d6

    .line 201
    invoke-static/range {v29 .. v29}, Lax/K1/b$c;->c(Lax/K1/b$c;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lax/u7/f;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    move-result-object v1

    .line 202
    invoke-static/range {v29 .. v29}, Lax/K1/b$c;->b(Lax/K1/b$c;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lax/u7/f;->n(J)I

    move-result v2

    invoke-virtual {v1, v2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    .line 203
    :cond_6d6
    :goto_6d6
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    move-result-object v0

    move-object/from16 v4, p8

    iput-object v0, v4, Lax/K1/b$h;->b:Lax/P0/v;

    return-void
.end method

.method private static M(Lax/S0/G;)Lax/P0/C;
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0}, Lax/S0/G;->I()S

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-virtual {p0, v3}, Lax/S0/G;->c0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 v2, 0x2b

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x2d

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :try_start_1e
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    sub-int/2addr v4, v0

    .line 44
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    new-instance v2, Lax/P0/C;

    .line 53
    .line 54
    new-instance v4, Lax/T0/f;

    .line 55
    .line 56
    invoke-direct {v4, v3, p0}, Lax/T0/f;-><init>(FF)V

    .line 57
    .line 58
    .line 59
    new-array p0, v0, [Lax/P0/C$a;

    .line 60
    .line 61
    aput-object v4, p0, v1

    .line 62
    .line 63
    invoke-direct {v2, p0}, Lax/P0/C;-><init>([Lax/P0/C$a;)V
    :try_end_41
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1e .. :try_end_41} :catch_42
    .catch Ljava/lang/NumberFormatException; {:try_start_1e .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :catch_42
    const/4 p0, 0x0

    .line 68
    return-object p0
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

.method private static N(I)I
    .registers 6

    .line 1
    shr-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    shr-int/lit8 v2, p0, 0x8

    .line 7
    .line 8
    and-int/2addr v2, v1

    .line 9
    and-int/2addr p0, v1

    .line 10
    add-int/lit8 v2, v2, -0x80

    .line 11
    .line 12
    mul-int/lit16 v3, v2, 0x36fb

    .line 13
    .line 14
    div-int/lit16 v3, v3, 0x2710

    .line 15
    .line 16
    add-int/2addr v3, v0

    .line 17
    add-int/lit8 p0, p0, -0x80

    .line 18
    .line 19
    mul-int/lit16 v4, p0, 0xd7f

    .line 20
    .line 21
    div-int/lit16 v4, v4, 0x2710

    .line 22
    .line 23
    sub-int v4, v0, v4

    .line 24
    .line 25
    mul-int/lit16 v2, v2, 0x1c01

    .line 26
    .line 27
    div-int/lit16 v2, v2, 0x2710

    .line 28
    .line 29
    sub-int/2addr v4, v2

    .line 30
    mul-int/lit16 p0, p0, 0x457e

    .line 31
    .line 32
    div-int/lit16 p0, p0, 0x2710

    .line 33
    .line 34
    add-int/2addr v0, p0

    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-static {v3, p0, v1}, Lax/S0/d0;->p(III)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    shl-int/lit8 v2, v2, 0x10

    .line 41
    .line 42
    invoke-static {v4, p0, v1}, Lax/S0/d0;->p(III)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    shl-int/lit8 v3, v3, 0x8

    .line 47
    .line 48
    or-int/2addr v2, v3

    .line 49
    invoke-static {v0, p0, v1}, Lax/S0/d0;->p(III)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    or-int/2addr p0, v2

    .line 54
    return p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static a()Ljava/nio/ByteBuffer;
    .registers 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static b([JJJJ)Z
    .registers 14

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    sub-int/2addr v0, v1

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v0}, Lax/S0/d0;->p(III)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    array-length v5, p0

    .line 11
    sub-int/2addr v5, v2

    .line 12
    invoke-static {v5, v3, v0}, Lax/S0/d0;->p(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget-wide v5, p0, v3

    .line 17
    .line 18
    cmp-long v2, v5, p3

    .line 19
    .line 20
    if-gtz v2, :cond_26

    .line 21
    .line 22
    aget-wide v4, p0, v4

    .line 23
    .line 24
    cmp-long v2, p3, v4

    .line 25
    .line 26
    if-gez v2, :cond_26

    .line 27
    .line 28
    aget-wide p3, p0, v0

    .line 29
    .line 30
    cmp-long p0, p3, p5

    .line 31
    .line 32
    if-gez p0, :cond_26

    .line 33
    .line 34
    cmp-long p0, p5, p1

    .line 35
    .line 36
    if-gtz p0, :cond_26

    .line 37
    .line 38
    return v1

    .line 39
    :cond_26
    return v3
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

.method private static c(Lax/S0/G;III)I
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt v0, p2, :cond_a

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
    const/4 v4, 0x0

    .line 13
    invoke-static {v3, v4}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_f
    sub-int v3, v0, p2

    .line 17
    .line 18
    if-ge v3, p3, :cond_2d

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lez v3, :cond_1e

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v4, 0x0

    .line 32
    :goto_1f
    const-string v5, "childAtomSize must be positive"

    .line 33
    .line 34
    invoke-static {v4, v5}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, p1, :cond_2b

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2b
    add-int/2addr v0, v3

    .line 45
    goto :goto_f

    .line 46
    :cond_2d
    const/4 p0, -0x1

    .line 47
    return p0
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

.method private static d([BII)Ljava/lang/String;
    .registers 11

    .line 1
    const/4 v0, 0x1

    .line 2
    array-length v1, p0

    .line 3
    const/16 v2, 0x40

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne v1, v2, :cond_9

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v1, 0x0

    .line 11
    :goto_a
    invoke-static {v1}, Lax/S0/a;->g(Z)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_15
    array-length v4, p0

    .line 23
    add-int/lit8 v4, v4, -0x3

    .line 24
    .line 25
    if-ge v2, v4, :cond_44

    .line 26
    .line 27
    aget-byte v4, p0, v2

    .line 28
    .line 29
    add-int/lit8 v5, v2, 0x1

    .line 30
    .line 31
    aget-byte v5, p0, v5

    .line 32
    .line 33
    add-int/lit8 v6, v2, 0x2

    .line 34
    .line 35
    aget-byte v6, p0, v6

    .line 36
    .line 37
    add-int/lit8 v7, v2, 0x3

    .line 38
    .line 39
    aget-byte v7, p0, v7

    .line 40
    .line 41
    invoke-static {v4, v5, v6, v7}, Lax/u7/f;->i(BBBB)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, Lax/K1/b;->N(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-array v5, v0, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v4, v5, v3

    .line 56
    .line 57
    const-string v4, "%06x"

    .line 58
    .line 59
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x4

    .line 67
    .line 68
    goto :goto_15

    .line 69
    :cond_44
    new-instance p0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v0, "size: "

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, "x"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, "\npalette: "

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, ", "

    .line 96
    .line 97
    invoke-static {p1}, Lax/q7/g;->g(Ljava/lang/String;)Lax/q7/g;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v1}, Lax/q7/g;->d(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, "\n"

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
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

.method private static e(I)Ljava/lang/String;
    .registers 6

    .line 1
    shr-int/lit8 v0, p0, 0xa

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x60

    .line 6
    .line 7
    int-to-char v0, v0

    .line 8
    shr-int/lit8 v1, p0, 0x5

    .line 9
    .line 10
    and-int/lit8 v1, v1, 0x1f

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x60

    .line 13
    .line 14
    int-to-char v1, v1

    .line 15
    and-int/lit8 p0, p0, 0x1f

    .line 16
    .line 17
    add-int/lit8 p0, p0, 0x60

    .line 18
    .line 19
    int-to-char p0, p0

    .line 20
    const/4 v2, 0x3

    .line 21
    new-array v3, v2, [C

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-char v0, v3, v4

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput-char v1, v3, v0

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    aput-char p0, v3, v1

    .line 31
    .line 32
    :goto_1f
    if-ge v4, v2, :cond_30

    .line 33
    .line 34
    aget-char p0, v3, v4

    .line 35
    .line 36
    const/16 v1, 0x61

    .line 37
    .line 38
    if-lt p0, v1, :cond_2e

    .line 39
    .line 40
    const/16 v1, 0x7a

    .line 41
    .line 42
    if-le p0, v1, :cond_2c

    .line 43
    .line 44
    goto :goto_2e

    .line 45
    :cond_2c
    add-int/2addr v4, v0

    .line 46
    goto :goto_1f

    .line 47
    :cond_2e
    :goto_2e
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_30
    new-instance p0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 52
    .line 53
    .line 54
    return-object p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static f(I)I
    .registers 2

    .line 1
    const v0, 0x736f756e

    .line 2
    .line 3
    .line 4
    if-ne p0, v0, :cond_7

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_7
    const v0, 0x76696465

    .line 9
    .line 10
    .line 11
    if-ne p0, v0, :cond_e

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    return p0

    .line 15
    :cond_e
    const v0, 0x74657874

    .line 16
    .line 17
    .line 18
    if-eq p0, v0, :cond_31

    .line 19
    .line 20
    const v0, 0x7362746c

    .line 21
    .line 22
    .line 23
    if-eq p0, v0, :cond_31

    .line 24
    .line 25
    const v0, 0x73756274

    .line 26
    .line 27
    .line 28
    if-eq p0, v0, :cond_31

    .line 29
    .line 30
    const v0, 0x636c6370

    .line 31
    .line 32
    .line 33
    if-eq p0, v0, :cond_31

    .line 34
    .line 35
    const v0, 0x73756270

    .line 36
    .line 37
    .line 38
    if-ne p0, v0, :cond_28

    .line 39
    .line 40
    goto :goto_31

    .line 41
    :cond_28
    const v0, 0x6d657461

    .line 42
    .line 43
    .line 44
    if-ne p0, v0, :cond_2f

    .line 45
    .line 46
    const/4 p0, 0x5

    .line 47
    return p0

    .line 48
    :cond_2f
    const/4 p0, -0x1

    .line 49
    return p0

    .line 50
    :cond_31
    :goto_31
    const/4 p0, 0x3

    .line 51
    return p0
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

.method public static g(Lax/S0/G;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {p0, v1}, Lax/S0/G;->c0(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x68646c72    # 4.3148E24f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_13

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    :cond_13
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

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

.method private static h(Lax/S0/G;)Lax/P0/j;
    .registers 12

    .line 1
    new-instance v0, Lax/P0/j$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/j$b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/S0/F;

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Lax/S0/F;-><init>([B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    mul-int/lit8 p0, p0, 0x8

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Lax/S0/F;->p(I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-virtual {v1, p0}, Lax/S0/F;->s(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    :goto_23
    if-ge v5, v3, :cond_80

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Lax/S0/F;->s(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_2d
    if-ge v7, v6, :cond_7d

    .line 47
    .line 48
    const/4 v8, 0x6

    .line 49
    invoke-virtual {v1, v8}, Lax/S0/F;->r(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 57
    .line 58
    .line 59
    const/16 v9, 0xb

    .line 60
    .line 61
    invoke-virtual {v1, v9}, Lax/S0/F;->s(I)V

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x4

    .line 65
    invoke-virtual {v1, v9}, Lax/S0/F;->r(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v9}, Lax/S0/F;->h(I)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    add-int/2addr v9, v2

    .line 73
    invoke-virtual {v0, v9}, Lax/P0/j$b;->g(I)Lax/P0/j$b;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v9}, Lax/P0/j$b;->b(I)Lax/P0/j$b;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p0}, Lax/S0/F;->s(I)V

    .line 80
    .line 81
    .line 82
    if-eqz v8, :cond_7a

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-virtual {v1, p0}, Lax/S0/F;->s(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    invoke-static {v8}, Lax/P0/j;->k(I)I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual {v0, v8}, Lax/P0/j$b;->d(I)Lax/P0/j$b;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-eqz v10, :cond_6e

    .line 108
    .line 109
    const/4 v10, 0x1

    .line 110
    goto :goto_6f

    .line 111
    :cond_6e
    const/4 v10, 0x2

    .line 112
    :goto_6f
    invoke-virtual {v8, v10}, Lax/P0/j$b;->c(I)Lax/P0/j$b;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v9}, Lax/P0/j;->l(I)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v8, v9}, Lax/P0/j$b;->e(I)Lax/P0/j$b;

    .line 121
    .line 122
    .line 123
    :cond_7a
    add-int/lit8 v7, v7, 0x1

    .line 124
    .line 125
    goto :goto_2d

    .line 126
    :cond_7d
    add-int/lit8 v5, v5, 0x1

    .line 127
    .line 128
    goto :goto_23

    .line 129
    :cond_80
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 130
    .line 131
    .line 132
    move-result-object p0

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
.end method

.method private static i(Lax/S0/G;IIIILjava/lang/String;ZLax/P0/o;Lax/K1/b$h;I)V
    .registers 37
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    const/4 v8, 0x1

    const/16 v9, 0x10

    add-int/lit8 v10, v2, 0x10

    .line 1
    invoke-virtual {v0, v10}, Lax/S0/G;->b0(I)V

    const/4 v10, 0x6

    const/16 v11, 0x8

    if-eqz p6, :cond_25

    .line 2
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v13

    .line 3
    invoke-virtual {v0, v10}, Lax/S0/G;->c0(I)V

    goto :goto_29

    .line 4
    :cond_25
    invoke-virtual {v0, v11}, Lax/S0/G;->c0(I)V

    const/4 v13, 0x0

    :goto_29
    const/16 v14, 0x20

    const/16 v17, 0x3

    const/4 v15, 0x4

    const/16 v18, 0x0

    const/4 v12, 0x2

    if-eqz v13, :cond_35

    if-ne v13, v8, :cond_39

    :cond_35
    const/16 v21, 0x2

    goto/16 :goto_9b

    :cond_39
    if-ne v13, v12, :cond_50f

    .line 5
    invoke-virtual {v0, v9}, Lax/S0/G;->c0(I)V

    .line 6
    invoke-virtual {v0}, Lax/S0/G;->t()D

    move-result-wide v19

    const/16 v21, 0x2

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v10, v12

    .line 7
    invoke-virtual {v0}, Lax/S0/G;->Q()I

    move-result v12

    .line 8
    invoke-virtual {v0, v15}, Lax/S0/G;->c0(I)V

    .line 9
    invoke-virtual {v0}, Lax/S0/G;->Q()I

    move-result v13

    .line 10
    invoke-virtual {v0}, Lax/S0/G;->Q()I

    move-result v19

    and-int/lit8 v20, v19, 0x1

    if-eqz v20, :cond_5f

    const/16 v20, 0x1

    goto :goto_61

    :cond_5f
    const/16 v20, 0x0

    :goto_61
    and-int/lit8 v19, v19, 0x2

    if-eqz v19, :cond_68

    const/16 v19, 0x1

    goto :goto_6a

    :cond_68
    const/16 v19, 0x0

    :goto_6a
    if-nez v20, :cond_8f

    if-ne v13, v11, :cond_70

    const/4 v9, 0x3

    goto :goto_94

    :cond_70
    if-ne v13, v9, :cond_79

    if-eqz v19, :cond_77

    const/high16 v9, 0x10000000

    goto :goto_94

    :cond_77
    const/4 v9, 0x2

    goto :goto_94

    :cond_79
    const/16 v9, 0x18

    if-ne v13, v9, :cond_85

    if-eqz v19, :cond_82

    const/high16 v9, 0x50000000

    goto :goto_94

    :cond_82
    const/16 v9, 0x15

    goto :goto_94

    :cond_85
    if-ne v13, v14, :cond_93

    if-eqz v19, :cond_8c

    const/high16 v9, 0x60000000

    goto :goto_94

    :cond_8c
    const/16 v9, 0x16

    goto :goto_94

    :cond_8f
    if-ne v13, v14, :cond_93

    const/4 v9, 0x4

    goto :goto_94

    :cond_93
    const/4 v9, -0x1

    .line 11
    :goto_94
    invoke-virtual {v0, v11}, Lax/S0/G;->c0(I)V

    const/4 v11, 0x0

    const/16 v20, 0x8

    goto :goto_bb

    .line 12
    :goto_9b
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v12

    .line 13
    invoke-virtual {v0, v10}, Lax/S0/G;->c0(I)V

    .line 14
    invoke-virtual {v0}, Lax/S0/G;->N()I

    move-result v10

    .line 15
    invoke-virtual {v0}, Lax/S0/G;->g()I

    move-result v19

    const/16 v20, 0x8

    add-int/lit8 v11, v19, -0x4

    invoke-virtual {v0, v11}, Lax/S0/G;->b0(I)V

    .line 16
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v11

    if-ne v13, v8, :cond_ba

    .line 17
    invoke-virtual {v0, v9}, Lax/S0/G;->c0(I)V

    :cond_ba
    const/4 v9, -0x1

    :goto_bb
    const v13, 0x73617762

    const v14, 0x73616d72

    const v15, 0x69616d66

    if-ne v1, v15, :cond_c9

    const/4 v10, -0x1

    const/4 v12, -0x1

    goto :goto_d4

    :cond_c9
    if-ne v1, v14, :cond_cf

    const/16 v10, 0x1f40

    :goto_cd
    const/4 v12, 0x1

    goto :goto_d4

    :cond_cf
    if-ne v1, v13, :cond_d4

    const/16 v10, 0x3e80

    goto :goto_cd

    .line 18
    :cond_d4
    :goto_d4
    invoke-virtual {v0}, Lax/S0/G;->g()I

    move-result v8

    const v15, 0x656e6361

    if-ne v1, v15, :cond_104

    .line 19
    invoke-static {v0, v2, v3}, Lax/K1/b;->z(Lax/S0/G;II)Landroid/util/Pair;

    move-result-object v15

    if-eqz v15, :cond_101

    .line 20
    iget-object v1, v15, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v6, :cond_ef

    const/4 v6, 0x0

    goto :goto_f9

    .line 21
    :cond_ef
    iget-object v13, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lax/K1/u;

    iget-object v13, v13, Lax/K1/u;->b:Ljava/lang/String;

    invoke-virtual {v6, v13}, Lax/P0/o;->c(Ljava/lang/String;)Lax/P0/o;

    move-result-object v6

    .line 22
    :goto_f9
    iget-object v13, v7, Lax/K1/b$h;->a:[Lax/K1/u;

    iget-object v15, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lax/K1/u;

    aput-object v15, v13, p9

    .line 23
    :cond_101
    invoke-virtual {v0, v8}, Lax/S0/G;->b0(I)V

    :cond_104
    const v13, 0x61632d33

    .line 24
    const-string v15, "audio/mhm1"

    const-string v25, "audio/raw"

    if-ne v1, v13, :cond_112

    .line 25
    const-string v13, "audio/ac3"

    :goto_10f
    move v14, v9

    goto/16 :goto_1db

    :cond_112
    const v13, 0x65632d33

    if-ne v1, v13, :cond_11a

    .line 26
    const-string v13, "audio/eac3"

    goto :goto_10f

    :cond_11a
    const v13, 0x61632d34

    if-ne v1, v13, :cond_122

    .line 27
    const-string v13, "audio/ac4"

    goto :goto_10f

    :cond_122
    const v13, 0x64747363

    if-ne v1, v13, :cond_12a

    .line 28
    const-string v13, "audio/vnd.dts"

    goto :goto_10f

    :cond_12a
    const v13, 0x64747368

    if-eq v1, v13, :cond_1d7

    const v13, 0x6474736c

    if-ne v1, v13, :cond_136

    goto/16 :goto_1d7

    :cond_136
    const v13, 0x64747365

    if-ne v1, v13, :cond_13e

    .line 29
    const-string v13, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_10f

    :cond_13e
    const v13, 0x64747378

    if-ne v1, v13, :cond_146

    .line 30
    const-string v13, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_10f

    :cond_146
    if-ne v1, v14, :cond_14b

    .line 31
    const-string v13, "audio/3gpp"

    goto :goto_10f

    :cond_14b
    const v13, 0x73617762

    if-ne v1, v13, :cond_153

    .line 32
    const-string v13, "audio/amr-wb"

    goto :goto_10f

    :cond_153
    const v13, 0x736f7774

    if-ne v1, v13, :cond_15d

    :goto_158
    move-object/from16 v13, v25

    const/4 v14, 0x2

    goto/16 :goto_1db

    :cond_15d
    const v13, 0x74776f73

    if-ne v1, v13, :cond_168

    move-object/from16 v13, v25

    const/high16 v14, 0x10000000

    goto/16 :goto_1db

    :cond_168
    const v13, 0x6c70636d

    if-ne v1, v13, :cond_176

    const/4 v13, -0x1

    if-ne v9, v13, :cond_171

    goto :goto_158

    :cond_171
    move v14, v9

    move-object/from16 v13, v25

    goto/16 :goto_1db

    :cond_176
    const v13, 0x2e6d7032

    if-eq v1, v13, :cond_1d3

    const v13, 0x2e6d7033

    if-ne v1, v13, :cond_181

    goto :goto_1d3

    :cond_181
    const v13, 0x6d686131

    if-ne v1, v13, :cond_189

    .line 33
    const-string v13, "audio/mha1"

    goto :goto_10f

    :cond_189
    const v13, 0x6d686d31

    if-ne v1, v13, :cond_191

    move v14, v9

    move-object v13, v15

    goto :goto_1db

    :cond_191
    const v13, 0x616c6163

    if-ne v1, v13, :cond_19a

    .line 34
    const-string v13, "audio/alac"

    goto/16 :goto_10f

    :cond_19a
    const v13, 0x616c6177

    if-ne v1, v13, :cond_1a3

    .line 35
    const-string v13, "audio/g711-alaw"

    goto/16 :goto_10f

    :cond_1a3
    const v13, 0x756c6177

    if-ne v1, v13, :cond_1ac

    .line 36
    const-string v13, "audio/g711-mlaw"

    goto/16 :goto_10f

    :cond_1ac
    const v13, 0x4f707573

    if-ne v1, v13, :cond_1b5

    .line 37
    const-string v13, "audio/opus"

    goto/16 :goto_10f

    :cond_1b5
    const v13, 0x664c6143

    if-ne v1, v13, :cond_1be

    .line 38
    const-string v13, "audio/flac"

    goto/16 :goto_10f

    :cond_1be
    const v13, 0x6d6c7061

    if-ne v1, v13, :cond_1c7

    .line 39
    const-string v13, "audio/true-hd"

    goto/16 :goto_10f

    :cond_1c7
    const v13, 0x69616d66

    if-ne v1, v13, :cond_1d0

    .line 40
    const-string v13, "audio/iamf"

    goto/16 :goto_10f

    :cond_1d0
    move v14, v9

    const/4 v13, 0x0

    goto :goto_1db

    .line 41
    :cond_1d3
    :goto_1d3
    const-string v13, "audio/mpeg"

    goto/16 :goto_10f

    .line 42
    :cond_1d7
    :goto_1d7
    const-string v13, "audio/vnd.dts.hd"

    goto/16 :goto_10f

    :goto_1db
    move/from16 v24, v14

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    const/16 v23, 0x0

    :goto_1e3
    sub-int v14, v8, p2

    if-ge v14, v3, :cond_4a1

    .line 43
    invoke-virtual {v0, v8}, Lax/S0/G;->b0(I)V

    .line 44
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v14

    if-lez v14, :cond_1f4

    const/4 v3, 0x1

    :goto_1f1
    move-object/from16 p7, v9

    goto :goto_1f6

    :cond_1f4
    const/4 v3, 0x0

    goto :goto_1f1

    .line 45
    :goto_1f6
    const-string v9, "childAtomSize must be positive"

    invoke-static {v3, v9}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 46
    invoke-virtual {v0}, Lax/S0/G;->v()I

    move-result v3

    const v9, 0x6d686143

    if-ne v3, v9, :cond_26b

    add-int/lit8 v3, v8, 0x8

    .line 47
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    const/4 v3, 0x1

    .line 48
    invoke-virtual {v0, v3}, Lax/S0/G;->c0(I)V

    .line 49
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v9

    .line 50
    invoke-virtual {v0, v3}, Lax/S0/G;->c0(I)V

    .line 51
    invoke-static {v13, v15}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_22c

    .line 52
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 p7, v9

    new-array v9, v3, [Ljava/lang/Object;

    aput-object p7, v9, v18

    const-string v3, "mhm1.%02X"

    invoke-static {v3, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_22a
    move-object v9, v3

    goto :goto_23e

    .line 53
    :cond_22c
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 p7, v3

    const/4 v9, 0x1

    new-array v3, v9, [Ljava/lang/Object;

    aput-object p7, v3, v18

    const-string v9, "mha1.%02X"

    invoke-static {v9, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_22a

    .line 54
    :goto_23e
    invoke-virtual {v0}, Lax/S0/G;->U()I

    move-result v3

    move-object/from16 p7, v9

    .line 55
    new-array v9, v3, [B

    move-object/from16 p9, v15

    const/4 v15, 0x0

    .line 56
    invoke-virtual {v0, v9, v15, v3}, Lax/S0/G;->q([BII)V

    if-nez v2, :cond_253

    .line 57
    invoke-static {v9}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v2

    goto :goto_25d

    .line 58
    :cond_253
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v9, v2}, Lax/r7/z;->B(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/z;

    move-result-object v2

    :cond_25d
    :goto_25d
    move-object/from16 v3, p7

    :goto_25f
    const/4 v9, -0x1

    :goto_260
    const/16 v15, 0x20

    const/16 v18, 0x0

    const v19, 0x616c6163

    const/16 v22, 0x1

    goto/16 :goto_499

    :cond_26b
    move-object/from16 p9, v15

    const v9, 0x6d686150

    if-ne v3, v9, :cond_295

    add-int/lit8 v3, v8, 0x8

    .line 59
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 60
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v3

    if-lez v3, :cond_25d

    .line 61
    new-array v9, v3, [B

    const/4 v15, 0x0

    .line 62
    invoke-virtual {v0, v9, v15, v3}, Lax/S0/G;->q([BII)V

    if-nez v2, :cond_28a

    .line 63
    invoke-static {v9}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v2

    goto :goto_25d

    .line 64
    :cond_28a
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2, v9}, Lax/r7/z;->B(Ljava/lang/Object;Ljava/lang/Object;)Lax/r7/z;

    move-result-object v2

    goto :goto_25d

    :cond_295
    const v9, 0x65736473

    if-eq v3, v9, :cond_2a1

    if-eqz p6, :cond_2ac

    const v15, 0x77617665

    if-ne v3, v15, :cond_2ac

    :cond_2a1
    const/16 v15, 0x20

    const/16 v18, 0x0

    const v19, 0x616c6163

    const/16 v22, 0x1

    goto/16 :goto_453

    :cond_2ac
    const v9, 0x62747274

    if-ne v3, v9, :cond_2b6

    .line 65
    invoke-static {v0, v8}, Lax/K1/b;->k(Lax/S0/G;I)Lax/K1/b$a;

    move-result-object v23

    goto :goto_25d

    :cond_2b6
    const v9, 0x64616333

    if-ne v3, v9, :cond_2d0

    add-int/lit8 v3, v8, 0x8

    .line 66
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 67
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lax/q1/b;->d(Lax/S0/G;Ljava/lang/String;Ljava/lang/String;Lax/P0/o;)Lax/P0/v;

    move-result-object v3

    iput-object v3, v7, Lax/K1/b$h;->b:Lax/P0/v;

    :cond_2ca
    :goto_2ca
    const/16 v15, 0x20

    const/16 v22, 0x1

    goto/16 :goto_44a

    :cond_2d0
    const v9, 0x64656333

    if-ne v3, v9, :cond_2e5

    add-int/lit8 v3, v8, 0x8

    .line 68
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 69
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lax/q1/b;->h(Lax/S0/G;Ljava/lang/String;Ljava/lang/String;Lax/P0/o;)Lax/P0/v;

    move-result-object v3

    iput-object v3, v7, Lax/K1/b$h;->b:Lax/P0/v;

    goto :goto_2ca

    :cond_2e5
    const v9, 0x64616334

    if-ne v3, v9, :cond_2fa

    add-int/lit8 v3, v8, 0x8

    .line 70
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 71
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lax/q1/c;->e(Lax/S0/G;Ljava/lang/String;Ljava/lang/String;Lax/P0/o;)Lax/P0/v;

    move-result-object v3

    iput-object v3, v7, Lax/K1/b$h;->b:Lax/P0/v;

    goto :goto_2ca

    :cond_2fa
    const v9, 0x646d6c70

    if-ne v3, v9, :cond_31f

    if-lez v11, :cond_308

    move-object/from16 v3, p7

    move v10, v11

    const/4 v9, -0x1

    const/4 v12, 0x2

    goto/16 :goto_260

    .line 72
    :cond_308
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    invoke-static {v0, v15}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    move-result-object v0

    throw v0

    :cond_31f
    const/4 v15, 0x0

    const v9, 0x64647473

    if-eq v3, v9, :cond_32a

    const v9, 0x75647473

    if-ne v3, v9, :cond_330

    :cond_32a
    const/16 v15, 0x20

    const/16 v22, 0x1

    goto/16 :goto_427

    :cond_330
    const v9, 0x644f7073

    if-ne v3, v9, :cond_34e

    add-int/lit8 v2, v14, -0x8

    .line 73
    sget-object v3, Lax/K1/b;->a:[B

    array-length v9, v3

    add-int/2addr v9, v2

    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    add-int/lit8 v15, v8, 0x8

    .line 74
    invoke-virtual {v0, v15}, Lax/S0/G;->b0(I)V

    .line 75
    array-length v3, v3

    invoke-virtual {v0, v9, v3, v2}, Lax/S0/G;->q([BII)V

    .line 76
    invoke-static {v9}, Lax/q1/L;->a([B)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_25d

    :cond_34e
    const v9, 0x64664c61

    if-ne v3, v9, :cond_37c

    add-int/lit8 v2, v14, -0xc

    add-int/lit8 v3, v14, -0x8

    .line 77
    new-array v3, v3, [B

    const/16 v9, 0x66

    const/16 v18, 0x0

    .line 78
    aput-byte v9, v3, v18

    const/16 v9, 0x4c

    const/16 v22, 0x1

    .line 79
    aput-byte v9, v3, v22

    const/16 v9, 0x61

    .line 80
    aput-byte v9, v3, v21

    const/16 v9, 0x43

    .line 81
    aput-byte v9, v3, v17

    add-int/lit8 v9, v8, 0xc

    .line 82
    invoke-virtual {v0, v9}, Lax/S0/G;->b0(I)V

    const/4 v15, 0x4

    .line 83
    invoke-virtual {v0, v3, v15, v2}, Lax/S0/G;->q([BII)V

    .line 84
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v2

    goto/16 :goto_25d

    :cond_37c
    const v9, 0x616c6163

    const/4 v15, 0x4

    if-ne v3, v9, :cond_3b7

    add-int/lit8 v2, v14, -0xc

    .line 85
    new-array v3, v2, [B

    add-int/lit8 v10, v8, 0xc

    .line 86
    invoke-virtual {v0, v10}, Lax/S0/G;->b0(I)V

    const/4 v10, 0x0

    .line 87
    invoke-virtual {v0, v3, v10, v2}, Lax/S0/G;->q([BII)V

    .line 88
    invoke-static {v3}, Lax/S0/i;->z([B)Landroid/util/Pair;

    move-result-object v2

    .line 89
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 90
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 91
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v3

    move v12, v2

    move-object v2, v3

    const/4 v9, -0x1

    const/16 v15, 0x20

    const/16 v18, 0x0

    const v19, 0x616c6163

    const/16 v22, 0x1

    :cond_3b3
    :goto_3b3
    move-object/from16 v3, p7

    goto/16 :goto_499

    :cond_3b7
    const v9, 0x69616362

    if-ne v3, v9, :cond_3d8

    add-int/lit8 v2, v8, 0x9

    .line 92
    invoke-virtual {v0, v2}, Lax/S0/G;->b0(I)V

    .line 93
    invoke-virtual {v0}, Lax/S0/G;->R()I

    move-result v2

    .line 94
    new-array v3, v2, [B

    const/4 v9, 0x0

    .line 95
    invoke-virtual {v0, v3, v9, v2}, Lax/S0/G;->q([BII)V

    .line 96
    invoke-static {v3}, Lax/S0/i;->i([B)Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v3

    move-object v9, v3

    move-object v3, v2

    move-object v2, v9

    goto/16 :goto_25f

    :cond_3d8
    const v9, 0x70636d43

    if-ne v3, v9, :cond_2ca

    add-int/lit8 v3, v8, 0xc

    .line 98
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 99
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v3

    const/16 v22, 0x1

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_3ef

    .line 100
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_3f1

    :cond_3ef
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 101
    :goto_3f1
    invoke-virtual {v0}, Lax/S0/G;->M()I

    move-result v9

    const v15, 0x6970636d

    if-ne v1, v15, :cond_402

    .line 102
    invoke-static {v9, v3}, Lax/S0/d0;->k0(ILjava/nio/ByteOrder;)I

    move-result v3

    const/4 v9, -0x1

    const/16 v15, 0x20

    goto :goto_41b

    :cond_402
    const v15, 0x6670636d

    if-ne v1, v15, :cond_416

    const/16 v15, 0x20

    if-ne v9, v15, :cond_418

    .line 103
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 104
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_418

    const/4 v3, 0x4

    :goto_414
    const/4 v9, -0x1

    goto :goto_41b

    :cond_416
    const/16 v15, 0x20

    :cond_418
    move/from16 v3, v24

    goto :goto_414

    :goto_41b
    move/from16 v24, v3

    if-eq v3, v9, :cond_421

    move-object/from16 v13, v25

    :cond_421
    const/16 v18, 0x0

    const v19, 0x616c6163

    goto :goto_3b3

    .line 105
    :goto_427
    new-instance v3, Lax/P0/v$b;

    invoke-direct {v3}, Lax/P0/v$b;-><init>()V

    .line 106
    invoke-virtual {v3, v4}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    move-result-object v3

    .line 107
    invoke-virtual {v3, v13}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v3

    .line 108
    invoke-virtual {v3, v12}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    move-result-object v3

    .line 109
    invoke-virtual {v3, v10}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    move-result-object v3

    .line 110
    invoke-virtual {v3, v6}, Lax/P0/v$b;->c0(Lax/P0/o;)Lax/P0/v$b;

    move-result-object v3

    .line 111
    invoke-virtual {v3, v5}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v3

    .line 112
    invoke-virtual {v3}, Lax/P0/v$b;->P()Lax/P0/v;

    move-result-object v3

    iput-object v3, v7, Lax/K1/b$h;->b:Lax/P0/v;

    :goto_44a
    move-object/from16 v3, p7

    const/4 v9, -0x1

    const/16 v18, 0x0

    const v19, 0x616c6163

    goto :goto_499

    :goto_453
    if-ne v3, v9, :cond_458

    move v3, v8

    :goto_456
    const/4 v9, -0x1

    goto :goto_45d

    .line 113
    :cond_458
    invoke-static {v0, v9, v8, v14}, Lax/K1/b;->c(Lax/S0/G;III)I

    move-result v3

    goto :goto_456

    :goto_45d
    if-eq v3, v9, :cond_3b3

    .line 114
    invoke-static {v0, v3}, Lax/K1/b;->n(Lax/S0/G;I)Lax/K1/b$c;

    move-result-object v16

    .line 115
    invoke-static/range {v16 .. v16}, Lax/K1/b$c;->a(Lax/K1/b$c;)Ljava/lang/String;

    move-result-object v13

    .line 116
    invoke-static/range {v16 .. v16}, Lax/K1/b$c;->d(Lax/K1/b$c;)[B

    move-result-object v3

    if-eqz v3, :cond_3b3

    .line 117
    const-string v2, "audio/vorbis"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_47b

    .line 118
    invoke-static {v3}, Lax/q1/X;->e([B)Lax/r7/z;

    move-result-object v2

    goto/16 :goto_3b3

    .line 119
    :cond_47b
    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_48e

    .line 120
    invoke-static {v3}, Lax/q1/a;->e([B)Lax/q1/a$b;

    move-result-object v2

    .line 121
    iget v10, v2, Lax/q1/a$b;->a:I

    .line 122
    iget v12, v2, Lax/q1/a$b;->b:I

    .line 123
    iget-object v2, v2, Lax/q1/a$b;->c:Ljava/lang/String;

    goto :goto_490

    :cond_48e
    move-object/from16 v2, p7

    .line 124
    :goto_490
    invoke-static {v3}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    move-result-object v3

    move-object/from16 v26, v3

    move-object v3, v2

    move-object/from16 v2, v26

    :goto_499
    add-int/2addr v8, v14

    move-object/from16 v15, p9

    move-object v9, v3

    move/from16 v3, p3

    goto/16 :goto_1e3

    :cond_4a1
    move-object/from16 p7, v9

    .line 125
    iget-object v0, v7, Lax/K1/b$h;->b:Lax/P0/v;

    if-nez v0, :cond_50f

    if-eqz v13, :cond_50f

    .line 126
    new-instance v0, Lax/P0/v$b;

    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 127
    invoke-virtual {v0, v4}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    move-result-object v0

    .line 128
    invoke-virtual {v0, v13}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    move-object/from16 v3, p7

    .line 129
    invoke-virtual {v0, v3}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    .line 130
    invoke-virtual {v0, v12}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    move-result-object v0

    .line 131
    invoke-virtual {v0, v10}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    move-result-object v0

    move/from16 v14, v24

    .line 132
    invoke-virtual {v0, v14}, Lax/P0/v$b;->s0(I)Lax/P0/v$b;

    move-result-object v0

    .line 133
    invoke-virtual {v0, v2}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    move-result-object v0

    .line 134
    invoke-virtual {v0, v6}, Lax/P0/v$b;->c0(Lax/P0/o;)Lax/P0/v$b;

    move-result-object v0

    .line 135
    invoke-virtual {v0, v5}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    move-result-object v0

    if-eqz v16, :cond_4f0

    .line 136
    invoke-static/range {v16 .. v16}, Lax/K1/b$c;->c(Lax/K1/b$c;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lax/u7/f;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    move-result-object v1

    .line 137
    invoke-static/range {v16 .. v16}, Lax/K1/b$c;->b(Lax/K1/b$c;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lax/u7/f;->n(J)I

    move-result v2

    invoke-virtual {v1, v2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    goto :goto_509

    :cond_4f0
    if-eqz v23, :cond_509

    .line 138
    invoke-static/range {v23 .. v23}, Lax/K1/b$a;->b(Lax/K1/b$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lax/u7/f;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    move-result-object v1

    .line 139
    invoke-static/range {v23 .. v23}, Lax/K1/b$a;->a(Lax/K1/b$a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lax/u7/f;->n(J)I

    move-result v2

    invoke-virtual {v1, v2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    .line 140
    :cond_509
    :goto_509
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    move-result-object v0

    iput-object v0, v7, Lax/K1/b$h;->b:Lax/P0/v;

    :cond_50f
    return-void
.end method

.method private static j(Lax/S0/G;)Lax/P0/j;
    .registers 16

    .line 1
    new-instance v0, Lax/P0/j$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/j$b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/S0/F;

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Lax/S0/F;-><init>([B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    mul-int/lit8 p0, p0, 0x8

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Lax/S0/F;->p(I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-virtual {v1, p0}, Lax/S0/F;->s(I)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-virtual {v1, v3}, Lax/S0/F;->h(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x6

    .line 36
    invoke-virtual {v1, v5}, Lax/S0/F;->r(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const/16 v7, 0xc

    .line 48
    .line 49
    const/16 v8, 0xa

    .line 50
    .line 51
    const/4 v9, 0x2

    .line 52
    if-ne v4, v9, :cond_49

    .line 53
    .line 54
    if-eqz v5, :cond_49

    .line 55
    .line 56
    if-eqz v6, :cond_3c

    .line 57
    .line 58
    const/16 v4, 0xc

    .line 59
    .line 60
    goto :goto_3e

    .line 61
    :cond_3c
    const/16 v4, 0xa

    .line 62
    .line 63
    :goto_3e
    invoke-virtual {v0, v4}, Lax/P0/j$b;->g(I)Lax/P0/j$b;

    .line 64
    .line 65
    .line 66
    if-eqz v6, :cond_45

    .line 67
    .line 68
    const/16 v8, 0xc

    .line 69
    .line 70
    :cond_45
    invoke-virtual {v0, v8}, Lax/P0/j$b;->b(I)Lax/P0/j$b;

    .line 71
    .line 72
    .line 73
    goto :goto_5d

    .line 74
    :cond_49
    if-gt v4, v9, :cond_5d

    .line 75
    .line 76
    if-eqz v5, :cond_50

    .line 77
    .line 78
    const/16 v4, 0xa

    .line 79
    .line 80
    goto :goto_52

    .line 81
    :cond_50
    const/16 v4, 0x8

    .line 82
    .line 83
    :goto_52
    invoke-virtual {v0, v4}, Lax/P0/j$b;->g(I)Lax/P0/j$b;

    .line 84
    .line 85
    .line 86
    if-eqz v5, :cond_58

    .line 87
    .line 88
    goto :goto_5a

    .line 89
    :cond_58
    const/16 v8, 0x8

    .line 90
    .line 91
    :goto_5a
    invoke-virtual {v0, v8}, Lax/P0/j$b;->b(I)Lax/P0/j$b;

    .line 92
    .line 93
    .line 94
    :cond_5d
    :goto_5d
    const/16 v4, 0xd

    .line 95
    .line 96
    invoke-virtual {v1, v4}, Lax/S0/F;->r(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 100
    .line 101
    .line 102
    const/4 v5, 0x4

    .line 103
    invoke-virtual {v1, v5}, Lax/S0/F;->h(I)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    const-string v8, "BoxParsers"

    .line 108
    .line 109
    if-eq v6, p0, :cond_87

    .line 110
    .line 111
    new-instance p0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v1, "Unsupported obu_type: "

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_87
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_97

    .line 141
    .line 142
    const-string p0, "Unsupported obu_extension_flag"

    .line 143
    .line 144
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_97
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 157
    .line 158
    .line 159
    if-eqz v6, :cond_b2

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    const/16 v10, 0x7f

    .line 166
    .line 167
    if-le v6, v10, :cond_b2

    .line 168
    .line 169
    const-string p0, "Excessive obu_size"

    .line 170
    .line 171
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_b2
    invoke-virtual {v1, v3}, Lax/S0/F;->h(I)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_c9

    .line 191
    .line 192
    const-string p0, "Unsupported reduced_still_picture_header"

    .line 193
    .line 194
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0

    .line 202
    :cond_c9
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_d9

    .line 207
    .line 208
    const-string p0, "Unsupported timing_info_present_flag"

    .line 209
    .line 210
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :cond_d9
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-eqz v10, :cond_e9

    .line 223
    .line 224
    const-string p0, "Unsupported initial_display_delay_present_flag"

    .line 225
    .line 226
    invoke-static {v8, p0}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :cond_e9
    const/4 v8, 0x5

    .line 235
    invoke-virtual {v1, v8}, Lax/S0/F;->h(I)I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    :goto_f0
    const/4 v13, 0x7

    .line 242
    if-gt v12, v10, :cond_102

    .line 243
    .line 244
    invoke-virtual {v1, v7}, Lax/S0/F;->r(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v8}, Lax/S0/F;->h(I)I

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    if-le v14, v13, :cond_ff

    .line 252
    .line 253
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 254
    .line 255
    .line 256
    :cond_ff
    add-int/lit8 v12, v12, 0x1

    .line 257
    .line 258
    goto :goto_f0

    .line 259
    :cond_102
    invoke-virtual {v1, v5}, Lax/S0/F;->h(I)I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    invoke-virtual {v1, v5}, Lax/S0/F;->h(I)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    add-int/2addr v7, p0

    .line 268
    invoke-virtual {v1, v7}, Lax/S0/F;->r(I)V

    .line 269
    .line 270
    .line 271
    add-int/2addr v5, p0

    .line 272
    invoke-virtual {v1, v5}, Lax/S0/F;->r(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-eqz v5, :cond_11b

    .line 280
    .line 281
    invoke-virtual {v1, v13}, Lax/S0/F;->r(I)V

    .line 282
    .line 283
    .line 284
    :cond_11b
    invoke-virtual {v1, v13}, Lax/S0/F;->r(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_127

    .line 292
    .line 293
    invoke-virtual {v1, v9}, Lax/S0/F;->r(I)V

    .line 294
    .line 295
    .line 296
    :cond_127
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    if-eqz v7, :cond_12f

    .line 301
    .line 302
    const/4 v7, 0x2

    .line 303
    goto :goto_133

    .line 304
    :cond_12f
    invoke-virtual {v1, p0}, Lax/S0/F;->h(I)I

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    :goto_133
    if-lez v7, :cond_13e

    .line 309
    .line 310
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-nez v7, :cond_13e

    .line 315
    .line 316
    invoke-virtual {v1, p0}, Lax/S0/F;->r(I)V

    .line 317
    .line 318
    .line 319
    :cond_13e
    if-eqz v5, :cond_143

    .line 320
    .line 321
    invoke-virtual {v1, v3}, Lax/S0/F;->r(I)V

    .line 322
    .line 323
    .line 324
    :cond_143
    invoke-virtual {v1, v3}, Lax/S0/F;->r(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-ne v6, v9, :cond_151

    .line 332
    .line 333
    if-eqz v3, :cond_151

    .line 334
    .line 335
    invoke-virtual {v1}, Lax/S0/F;->q()V

    .line 336
    .line 337
    .line 338
    :cond_151
    if-eq v6, p0, :cond_15a

    .line 339
    .line 340
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_15a

    .line 345
    .line 346
    const/4 v11, 0x1

    .line 347
    :cond_15a
    invoke-virtual {v1}, Lax/S0/F;->g()Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_191

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-nez v11, :cond_176

    .line 366
    .line 367
    if-ne v3, p0, :cond_176

    .line 368
    .line 369
    if-ne v5, v4, :cond_176

    .line 370
    .line 371
    if-nez v2, :cond_176

    .line 372
    .line 373
    const/4 v1, 0x1

    .line 374
    goto :goto_17a

    .line 375
    :cond_176
    invoke-virtual {v1, p0}, Lax/S0/F;->h(I)I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    :goto_17a
    invoke-static {v3}, Lax/P0/j;->k(I)I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    invoke-virtual {v0, v2}, Lax/P0/j$b;->d(I)Lax/P0/j$b;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    if-ne v1, p0, :cond_185

    .line 388
    .line 389
    goto :goto_186

    .line 390
    :cond_185
    const/4 p0, 0x2

    .line 391
    :goto_186
    invoke-virtual {v2, p0}, Lax/P0/j$b;->c(I)Lax/P0/j$b;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    invoke-static {v5}, Lax/P0/j;->l(I)I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    invoke-virtual {p0, v1}, Lax/P0/j$b;->e(I)Lax/P0/j$b;

    .line 400
    .line 401
    .line 402
    :cond_191
    invoke-virtual {v0}, Lax/P0/j$b;->a()Lax/P0/j;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    return-object p0
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

.method private static k(Lax/S0/G;I)Lax/K1/b$a;
    .registers 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    invoke-virtual {p0, p1}, Lax/S0/G;->c0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    new-instance v2, Lax/K1/b$a;

    .line 19
    .line 20
    invoke-direct {v2, p0, p1, v0, v1}, Lax/K1/b$a;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    return-object v2
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

.method static l(Lax/S0/G;II)Landroid/util/Pair;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lax/K1/u;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v4, v3

    .line 7
    move-object v6, v4

    .line 8
    const/4 v5, -0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    :goto_9
    sub-int v8, v0, p1

    .line 11
    .line 12
    if-ge v8, p2, :cond_3d

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    const v10, 0x66726d61

    .line 26
    .line 27
    .line 28
    if-ne v9, v10, :cond_26

    .line 29
    .line 30
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    goto :goto_3b

    .line 39
    :cond_26
    const v10, 0x7363686d

    .line 40
    .line 41
    .line 42
    if-ne v9, v10, :cond_34

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-virtual {p0, v4}, Lax/S0/G;->c0(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_3b

    .line 53
    :cond_34
    const v10, 0x73636869

    .line 54
    .line 55
    .line 56
    if-ne v9, v10, :cond_3b

    .line 57
    .line 58
    move v5, v0

    .line 59
    move v7, v8

    .line 60
    :cond_3b
    :goto_3b
    add-int/2addr v0, v8

    .line 61
    goto :goto_9

    .line 62
    :cond_3d
    const-string p1, "cenc"

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5f

    .line 69
    .line 70
    const-string p1, "cbc1"

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5f

    .line 77
    .line 78
    const-string p1, "cens"

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5f

    .line 85
    .line 86
    const-string p1, "cbcs"

    .line 87
    .line 88
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5e

    .line 93
    .line 94
    goto :goto_5f

    .line 95
    :cond_5e
    return-object v3

    .line 96
    :cond_5f
    :goto_5f
    const/4 p1, 0x1

    .line 97
    if-eqz v6, :cond_64

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 p2, 0x0

    .line 102
    :goto_65
    const-string v0, "frma atom is mandatory"

    .line 103
    .line 104
    invoke-static {p2, v0}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-eq v5, v1, :cond_6e

    .line 108
    .line 109
    const/4 p2, 0x1

    .line 110
    goto :goto_6f

    .line 111
    :cond_6e
    const/4 p2, 0x0

    .line 112
    :goto_6f
    const-string v0, "schi atom is mandatory"

    .line 113
    .line 114
    invoke-static {p2, v0}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v5, v7, v4}, Lax/K1/b;->A(Lax/S0/G;IILjava/lang/String;)Lax/K1/u;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_7b

    .line 122
    .line 123
    const/4 v2, 0x1

    .line 124
    :cond_7b
    const-string p1, "tenc atom is mandatory"

    .line 125
    .line 126
    invoke-static {v2, p1}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lax/K1/u;

    .line 134
    .line 135
    invoke-static {v6, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
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

.method private static m(Lax/T0/e$b;)Landroid/util/Pair;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/T0/e$b;",
            ")",
            "Landroid/util/Pair<",
            "[J[J>;"
        }
    .end annotation

    .line 1
    const v0, 0x656c7374

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_b

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_b
    iget-object p0, p0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Lax/K1/b;->q(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lax/S0/G;->Q()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-array v2, v1, [J

    .line 32
    .line 33
    new-array v3, v1, [J

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_23
    if-ge v4, v1, :cond_56

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v0, v5, :cond_2d

    .line 40
    .line 41
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    goto :goto_31

    .line 46
    :cond_2d
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    :goto_31
    aput-wide v6, v2, v4

    .line 51
    .line 52
    if-ne v0, v5, :cond_3a

    .line 53
    .line 54
    invoke-virtual {p0}, Lax/S0/G;->F()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    goto :goto_3f

    .line 59
    :cond_3a
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    int-to-long v6, v6

    .line 64
    :goto_3f
    aput-wide v6, v3, v4

    .line 65
    .line 66
    invoke-virtual {p0}, Lax/S0/G;->I()S

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v6, v5, :cond_4e

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    invoke-virtual {p0, v5}, Lax/S0/G;->c0(I)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_23

    .line 79
    :cond_4e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Unsupported media rate."

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_56
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
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

.method private static n(Lax/S0/G;I)Lax/K1/b$c;
    .registers 12

    .line 1
    add-int/lit8 p1, p1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lax/S0/G;->c0(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lax/K1/b;->o(Lax/S0/G;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_1b

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_26

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lax/S0/G;->c0(I)V

    .line 37
    .line 38
    .line 39
    :cond_26
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2d

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    invoke-virtual {p0, p1}, Lax/S0/G;->c0(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lax/K1/b;->o(Lax/S0/G;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lax/P0/D;->h(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_84

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_84

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_54

    .line 83
    .line 84
    goto :goto_84

    .line 85
    :cond_54
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p0, p1}, Lax/S0/G;->c0(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lax/K1/b;->o(Lax/S0/G;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p1, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p0, v3, v6, p1}, Lax/S0/G;->q([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, Lax/K1/b$c;

    .line 113
    .line 114
    const-wide/16 v6, -0x1

    .line 115
    .line 116
    const-wide/16 v8, 0x0

    .line 117
    .line 118
    cmp-long v0, v4, v8

    .line 119
    .line 120
    if-lez v0, :cond_7a

    .line 121
    .line 122
    goto :goto_7b

    .line 123
    :cond_7a
    move-wide v4, v6

    .line 124
    :goto_7b
    cmp-long v0, p0, v8

    .line 125
    .line 126
    if-lez v0, :cond_80

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    :cond_80
    invoke-direct/range {v1 .. v7}, Lax/K1/b$c;-><init>(Ljava/lang/String;[BJJ)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_84
    :goto_84
    new-instance v1, Lax/K1/b$c;

    .line 134
    .line 135
    const-wide/16 v4, -0x1

    .line 136
    .line 137
    const-wide/16 v6, -0x1

    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    invoke-direct/range {v1 .. v7}, Lax/K1/b$c;-><init>(Ljava/lang/String;[BJJ)V

    .line 141
    .line 142
    .line 143
    return-object v1
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
.end method

.method private static o(Lax/S0/G;)I
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_6
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_15

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/S0/G;->M()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_6

    .line 22
    :cond_15
    return v1
.end method

.method public static p(I)I
    .registers 2

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

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
.end method

.method public static q(I)I
    .registers 1

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
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
.end method

.method private static r(Lax/S0/G;)I
    .registers 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
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

.method private static s(Lax/S0/G;I)Lax/P0/C;
    .registers 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_a
    :goto_a
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v1, p1, :cond_1a

    .line 16
    .line 17
    invoke-static {p0}, Lax/K1/j;->d(Lax/S0/G;)Lax/P0/C$a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_a

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_a

    .line 27
    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_22

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_22
    new-instance p0, Lax/P0/C;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lax/P0/C;-><init>(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    return-object p0
    .line 41
.end method

.method private static t(Lax/S0/G;)Lax/K1/b$e;
    .registers 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lax/K1/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_12

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :cond_12
    const/16 v2, 0x10

    .line 20
    .line 21
    :goto_14
    invoke-virtual {p0, v2}, Lax/S0/G;->c0(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v1, :cond_22

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    :cond_22
    const/4 v3, 0x0

    .line 36
    :goto_23
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    if-ge v3, v0, :cond_56

    .line 42
    .line 43
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    add-int v9, v2, v3

    .line 48
    .line 49
    aget-byte v8, v8, v9

    .line 50
    .line 51
    const/4 v9, -0x1

    .line 52
    if-eq v8, v9, :cond_53

    .line 53
    .line 54
    if-nez v1, :cond_3c

    .line 55
    .line 56
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    goto :goto_40

    .line 61
    :cond_3c
    invoke-virtual {p0}, Lax/S0/G;->T()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    :goto_40
    const-wide/16 v2, 0x0

    .line 66
    .line 67
    cmp-long v8, v0, v2

    .line 68
    .line 69
    if-nez v8, :cond_47

    .line 70
    .line 71
    goto :goto_59

    .line 72
    :cond_47
    move-wide v7, v4

    .line 73
    const-wide/32 v5, 0xf4240

    .line 74
    .line 75
    .line 76
    move-wide v3, v0

    .line 77
    invoke-static/range {v3 .. v8}, Lax/S0/d0;->p1(JJJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    move-wide v4, v7

    .line 82
    move-wide v6, v0

    .line 83
    goto :goto_59

    .line 84
    :cond_53
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_23

    .line 87
    :cond_56
    invoke-virtual {p0, v0}, Lax/S0/G;->c0(I)V

    .line 88
    .line 89
    .line 90
    :goto_59
    invoke-virtual {p0}, Lax/S0/G;->U()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    invoke-static {p0}, Lax/K1/b;->e(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    new-instance v3, Lax/K1/b$e;

    .line 99
    .line 100
    invoke-direct/range {v3 .. v8}, Lax/K1/b$e;-><init>(JJLjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3
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

.method public static u(Lax/T0/e$b;)Lax/P0/C;
    .registers 11

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lax/T0/e$b;->e(I)Lax/T0/e$c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_a5

    .line 24
    .line 25
    if-eqz v1, :cond_a5

    .line 26
    .line 27
    if-eqz p0, :cond_a5

    .line 28
    .line 29
    iget-object v0, v0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 30
    .line 31
    invoke-static {v0}, Lax/K1/b;->r(Lax/S0/G;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x6d647461

    .line 36
    .line 37
    .line 38
    if-eq v0, v3, :cond_29

    .line 39
    .line 40
    goto/16 :goto_a5

    .line 41
    .line 42
    :cond_29
    iget-object v0, v1, Lax/T0/e$c;->b:Lax/S0/G;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lax/S0/G;->b0(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-array v3, v1, [Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_37
    const/16 v5, 0x8

    .line 57
    .line 58
    if-ge v4, v1, :cond_4d

    .line 59
    .line 60
    invoke-virtual {v0}, Lax/S0/G;->v()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v0, v7}, Lax/S0/G;->c0(I)V

    .line 66
    .line 67
    .line 68
    sub-int/2addr v6, v5

    .line 69
    invoke-virtual {v0, v6}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    aput-object v5, v3, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_37

    .line 78
    :cond_4d
    iget-object p0, p0, Lax/T0/e$c;->b:Lax/S0/G;

    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lax/S0/G;->b0(I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_57
    invoke-virtual {p0}, Lax/S0/G;->a()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-le v4, v5, :cond_98

    .line 93
    .line 94
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/lit8 v7, v7, -0x1

    .line 107
    .line 108
    if-ltz v7, :cond_7d

    .line 109
    .line 110
    if-ge v7, v1, :cond_7d

    .line 111
    .line 112
    aget-object v7, v3, v7

    .line 113
    .line 114
    add-int v8, v4, v6

    .line 115
    .line 116
    invoke-static {p0, v8, v7}, Lax/K1/j;->i(Lax/S0/G;ILjava/lang/String;)Lax/T0/c;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_93

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_93

    .line 126
    :cond_7d
    new-instance v8, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v9, "Skipped metadata with unknown key index: "

    .line 132
    .line 133
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "BoxParsers"

    .line 144
    .line 145
    invoke-static {v8, v7}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_93
    :goto_93
    add-int/2addr v4, v6

    .line 149
    invoke-virtual {p0, v4}, Lax/S0/G;->b0(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_57

    .line 153
    :cond_98
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_9f

    .line 158
    .line 159
    return-object v2

    .line 160
    :cond_9f
    new-instance p0, Lax/P0/C;

    .line 161
    .line 162
    invoke-direct {p0, v0}, Lax/P0/C;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_a5
    :goto_a5
    return-object v2
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
.end method

.method private static v(Lax/S0/G;IIILax/K1/b$h;)V
    .registers 5

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x6d657474

    .line 7
    .line 8
    .line 9
    if-ne p1, p2, :cond_26

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/S0/G;->G()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lax/S0/G;->G()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_26

    .line 19
    .line 20
    new-instance p1, Lax/P0/v$b;

    .line 21
    .line 22
    invoke-direct {p1}, Lax/P0/v$b;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p3}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p0}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p4, Lax/K1/b$h;->b:Lax/P0/v;

    .line 38
    .line 39
    :cond_26
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

.method public static w(Lax/S0/G;)Lax/T0/g;
    .registers 12

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lax/K1/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1a

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_17
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_23

    .line 27
    :cond_1a
    invoke-virtual {p0}, Lax/S0/G;->F()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lax/S0/G;->F()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_17

    .line 36
    :goto_23
    invoke-virtual {p0}, Lax/S0/G;->O()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Lax/T0/g;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lax/T0/g;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
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

.method private static x(Lax/S0/G;I)F
    .registers 2

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/S0/G;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/S0/G;->Q()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Lax/S0/G;->Q()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-float p1, p1

    .line 15
    int-to-float p0, p0

    .line 16
    div-float/2addr p1, p0

    .line 17
    return p1
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

.method private static y(Lax/S0/G;II)[B
    .registers 7

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_2
    sub-int v1, v0, p1

    .line 4
    .line 5
    if-ge v1, p2, :cond_22

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v3, 0x70726f6a

    .line 19
    .line 20
    .line 21
    if-ne v2, v3, :cond_20

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/S0/G;->f()[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    add-int/2addr v1, v0

    .line 28
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_20
    add-int/2addr v0, v1

    .line 34
    goto :goto_2

    .line 35
    :cond_22
    const/4 p0, 0x0

    .line 36
    return-object p0
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

.method private static z(Lax/S0/G;II)Landroid/util/Pair;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/S0/G;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lax/K1/u;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/S0/G;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_4
    sub-int v1, v0, p1

    .line 6
    .line 7
    if-ge v1, p2, :cond_2b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lax/S0/G;->b0(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_13

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_14

    .line 20
    :cond_13
    const/4 v2, 0x0

    .line 21
    :goto_14
    const-string v3, "childAtomSize must be positive"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lax/q1/u;->a(ZLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lax/S0/G;->v()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const v3, 0x73696e66

    .line 31
    .line 32
    .line 33
    if-ne v2, v3, :cond_29

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Lax/K1/b;->l(Lax/S0/G;II)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_29

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_29
    add-int/2addr v0, v1

    .line 43
    goto :goto_4

    .line 44
    :cond_2b
    const/4 p0, 0x0

    .line 45
    return-object p0
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
