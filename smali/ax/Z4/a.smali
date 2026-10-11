.class public final Lax/Z4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/W4/e;

.field private final b:Ljava/io/InputStream;

.field private final c:[B

.field private d:I

.field private e:I

.field private final f:Z

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>(Lax/W4/e;Ljava/io/InputStream;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/Z4/a;->g:Z

    .line 6
    .line 7
    iput-object p1, p0, Lax/Z4/a;->a:Lax/W4/e;

    .line 8
    .line 9
    iput-object p2, p0, Lax/Z4/a;->b:Ljava/io/InputStream;

    .line 10
    .line 11
    invoke-virtual {p1}, Lax/W4/e;->e()[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lax/Z4/a;->c:[B

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lax/Z4/a;->d:I

    .line 19
    .line 20
    iput p1, p0, Lax/Z4/a;->e:I

    .line 21
    .line 22
    iput-boolean v0, p0, Lax/Z4/a;->f:Z

    .line 23
    .line 24
    return-void
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

.method private a(I)Z
    .registers 4

    .line 1
    const v0, 0xff00

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p1

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_a

    .line 7
    .line 8
    iput-boolean v1, p0, Lax/Z4/a;->g:Z

    .line 9
    .line 10
    goto :goto_11

    .line 11
    :cond_a
    and-int/lit16 p1, p1, 0xff

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_15

    .line 15
    .line 16
    iput-boolean v0, p0, Lax/Z4/a;->g:Z

    .line 17
    .line 18
    :goto_11
    const/4 p1, 0x2

    .line 19
    iput p1, p0, Lax/Z4/a;->h:I

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    return v0
.end method

.method private b(I)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    shr-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_8

    .line 5
    .line 6
    iput-boolean v1, p0, Lax/Z4/a;->g:Z

    .line 7
    .line 8
    goto :goto_29

    .line 9
    :cond_8
    const v0, 0xffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_12

    .line 15
    .line 16
    iput-boolean v2, p0, Lax/Z4/a;->g:Z

    .line 17
    .line 18
    goto :goto_29

    .line 19
    :cond_12
    const v0, -0xff0001

    .line 20
    .line 21
    .line 22
    and-int/2addr v0, p1

    .line 23
    if-nez v0, :cond_1e

    .line 24
    .line 25
    const-string p1, "3412"

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lax/Z4/a;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_29

    .line 31
    :cond_1e
    const v0, -0xff01

    .line 32
    .line 33
    .line 34
    and-int/2addr p1, v0

    .line 35
    if-nez p1, :cond_2d

    .line 36
    .line 37
    const-string p1, "2143"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lax/Z4/a;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_29
    const/4 p1, 0x4

    .line 43
    iput p1, p0, Lax/Z4/a;->h:I

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2d
    return v2
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

.method private g(I)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/high16 v0, -0x1010000

    .line 2
    .line 3
    const v1, 0xfffe

    .line 4
    .line 5
    .line 6
    const v2, 0xfeff

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq p1, v0, :cond_30

    .line 12
    .line 13
    const/high16 v0, -0x20000

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    if-eq p1, v0, :cond_26

    .line 17
    .line 18
    if-eq p1, v2, :cond_1c

    .line 19
    .line 20
    if-eq p1, v1, :cond_16

    .line 21
    .line 22
    goto :goto_35

    .line 23
    :cond_16
    const-string v0, "2143"

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lax/Z4/a;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_35

    .line 29
    :cond_1c
    iput-boolean v4, p0, Lax/Z4/a;->g:Z

    .line 30
    .line 31
    iget p1, p0, Lax/Z4/a;->d:I

    .line 32
    .line 33
    add-int/2addr p1, v5

    .line 34
    iput p1, p0, Lax/Z4/a;->d:I

    .line 35
    .line 36
    iput v5, p0, Lax/Z4/a;->h:I

    .line 37
    .line 38
    return v4

    .line 39
    :cond_26
    iget p1, p0, Lax/Z4/a;->d:I

    .line 40
    .line 41
    add-int/2addr p1, v5

    .line 42
    iput p1, p0, Lax/Z4/a;->d:I

    .line 43
    .line 44
    iput v5, p0, Lax/Z4/a;->h:I

    .line 45
    .line 46
    iput-boolean v3, p0, Lax/Z4/a;->g:Z

    .line 47
    .line 48
    return v4

    .line 49
    :cond_30
    const-string v0, "3412"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Lax/Z4/a;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_35
    ushr-int/lit8 v0, p1, 0x10

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    if-ne v0, v2, :cond_44

    .line 58
    .line 59
    iget p1, p0, Lax/Z4/a;->d:I

    .line 60
    .line 61
    add-int/2addr p1, v5

    .line 62
    iput p1, p0, Lax/Z4/a;->d:I

    .line 63
    .line 64
    iput v5, p0, Lax/Z4/a;->h:I

    .line 65
    .line 66
    iput-boolean v4, p0, Lax/Z4/a;->g:Z

    .line 67
    .line 68
    return v4

    .line 69
    :cond_44
    if-ne v0, v1, :cond_50

    .line 70
    .line 71
    iget p1, p0, Lax/Z4/a;->d:I

    .line 72
    .line 73
    add-int/2addr p1, v5

    .line 74
    iput p1, p0, Lax/Z4/a;->d:I

    .line 75
    .line 76
    iput v5, p0, Lax/Z4/a;->h:I

    .line 77
    .line 78
    iput-boolean v3, p0, Lax/Z4/a;->g:Z

    .line 79
    .line 80
    return v4

    .line 81
    :cond_50
    ushr-int/lit8 p1, p1, 0x8

    .line 82
    .line 83
    const v0, 0xefbbbf

    .line 84
    .line 85
    .line 86
    if-ne p1, v0, :cond_62

    .line 87
    .line 88
    iget p1, p0, Lax/Z4/a;->d:I

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x3

    .line 91
    .line 92
    iput p1, p0, Lax/Z4/a;->d:I

    .line 93
    .line 94
    iput v4, p0, Lax/Z4/a;->h:I

    .line 95
    .line 96
    iput-boolean v4, p0, Lax/Z4/a;->g:Z

    .line 97
    .line 98
    return v4

    .line 99
    :cond_62
    return v3
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

.method private h(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/CharConversionException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Unsupported UCS-4 endianness ("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, ") detected"

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
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


# virtual methods
.method public c(ILax/T4/n;Lax/a5/a;Lax/a5/b;I)Lax/T4/j;
    .registers 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    iget v2, v0, Lax/Z4/a;->d:I

    .line 6
    .line 7
    sget-object v3, Lax/T4/e$a;->g0:Lax/T4/e$a;

    .line 8
    .line 9
    invoke-virtual {v3, v1}, Lax/T4/e$a;->l(I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_13

    .line 14
    .line 15
    invoke-virtual {v0}, Lax/Z4/a;->e()Lax/T4/d;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    goto :goto_15

    .line 20
    :cond_13
    sget-object v3, Lax/T4/d;->e0:Lax/T4/d;

    .line 21
    .line 22
    :goto_15
    iget v4, v0, Lax/Z4/a;->d:I

    .line 23
    .line 24
    sub-int v14, v4, v2

    .line 25
    .line 26
    sget-object v2, Lax/T4/d;->e0:Lax/T4/d;

    .line 27
    .line 28
    if-ne v3, v2, :cond_41

    .line 29
    .line 30
    sget-object v2, Lax/T4/e$a;->d0:Lax/T4/e$a;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Lax/T4/e$a;->l(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_41

    .line 37
    .line 38
    move-object/from16 v2, p3

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lax/a5/a;->A(I)Lax/a5/a;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    new-instance v5, Lax/Z4/i;

    .line 45
    .line 46
    iget-object v6, v0, Lax/Z4/a;->a:Lax/W4/e;

    .line 47
    .line 48
    iget-object v8, v0, Lax/Z4/a;->b:Ljava/io/InputStream;

    .line 49
    .line 50
    iget-object v11, v0, Lax/Z4/a;->c:[B

    .line 51
    .line 52
    iget v12, v0, Lax/Z4/a;->d:I

    .line 53
    .line 54
    iget v13, v0, Lax/Z4/a;->e:I

    .line 55
    .line 56
    iget-boolean v15, v0, Lax/Z4/a;->f:Z

    .line 57
    .line 58
    move/from16 v7, p1

    .line 59
    .line 60
    move-object/from16 v9, p2

    .line 61
    .line 62
    invoke-direct/range {v5 .. v15}, Lax/Z4/i;-><init>(Lax/W4/e;ILjava/io/InputStream;Lax/T4/n;Lax/a5/a;[BIIIZ)V

    .line 63
    .line 64
    .line 65
    return-object v5

    .line 66
    :cond_41
    new-instance v6, Lax/Z4/g;

    .line 67
    .line 68
    iget-object v7, v0, Lax/Z4/a;->a:Lax/W4/e;

    .line 69
    .line 70
    invoke-virtual {v0}, Lax/Z4/a;->d()Ljava/io/Reader;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual/range {p4 .. p5}, Lax/a5/b;->n(I)Lax/a5/b;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    move/from16 v8, p1

    .line 79
    .line 80
    move-object/from16 v10, p2

    .line 81
    .line 82
    invoke-direct/range {v6 .. v11}, Lax/Z4/g;-><init>(Lax/W4/e;ILjava/io/Reader;Lax/T4/n;Lax/a5/b;)V

    .line 83
    .line 84
    .line 85
    return-object v6
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

.method public d()Ljava/io/Reader;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/a;->a:Lax/W4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/W4/e;->k()Lax/T4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/T4/d;->d()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    if-eq v1, v2, :cond_36

    .line 14
    .line 15
    const/16 v2, 0x10

    .line 16
    .line 17
    if-eq v1, v2, :cond_36

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    if-ne v1, v0, :cond_2e

    .line 22
    .line 23
    new-instance v2, Lax/W4/m;

    .line 24
    .line 25
    iget-object v3, p0, Lax/Z4/a;->a:Lax/W4/e;

    .line 26
    .line 27
    iget-object v4, p0, Lax/Z4/a;->b:Ljava/io/InputStream;

    .line 28
    .line 29
    iget-object v5, p0, Lax/Z4/a;->c:[B

    .line 30
    .line 31
    iget v6, p0, Lax/Z4/a;->d:I

    .line 32
    .line 33
    iget v7, p0, Lax/Z4/a;->e:I

    .line 34
    .line 35
    invoke-virtual {v3}, Lax/W4/e;->k()Lax/T4/d;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lax/T4/d;->j()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-direct/range {v2 .. v8}, Lax/W4/m;-><init>(Lax/W4/e;Ljava/io/InputStream;[BIIZ)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2e
    new-instance v0, Ljava/lang/RuntimeException;

    .line 48
    .line 49
    const-string v1, "Internal error"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_36
    iget-object v4, p0, Lax/Z4/a;->b:Ljava/io/InputStream;

    .line 56
    .line 57
    if-nez v4, :cond_46

    .line 58
    .line 59
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 60
    .line 61
    iget-object v1, p0, Lax/Z4/a;->c:[B

    .line 62
    .line 63
    iget v2, p0, Lax/Z4/a;->d:I

    .line 64
    .line 65
    iget v3, p0, Lax/Z4/a;->e:I

    .line 66
    .line 67
    invoke-direct {v4, v1, v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 68
    .line 69
    .line 70
    goto :goto_5a

    .line 71
    :cond_46
    iget v1, p0, Lax/Z4/a;->d:I

    .line 72
    .line 73
    iget v2, p0, Lax/Z4/a;->e:I

    .line 74
    .line 75
    if-ge v1, v2, :cond_5a

    .line 76
    .line 77
    new-instance v2, Lax/W4/h;

    .line 78
    .line 79
    iget-object v3, p0, Lax/Z4/a;->a:Lax/W4/e;

    .line 80
    .line 81
    iget-object v5, p0, Lax/Z4/a;->c:[B

    .line 82
    .line 83
    iget v6, p0, Lax/Z4/a;->d:I

    .line 84
    .line 85
    iget v7, p0, Lax/Z4/a;->e:I

    .line 86
    .line 87
    invoke-direct/range {v2 .. v7}, Lax/W4/h;-><init>(Lax/W4/e;Ljava/io/InputStream;[BII)V

    .line 88
    .line 89
    .line 90
    move-object v4, v2

    .line 91
    :cond_5a
    :goto_5a
    new-instance v1, Ljava/io/InputStreamReader;

    .line 92
    .line 93
    invoke-virtual {v0}, Lax/T4/d;->h()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-direct {v1, v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1
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

.method public e()Lax/T4/d;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/Z4/a;->f(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_41

    .line 9
    .line 10
    iget-object v1, p0, Lax/Z4/a;->c:[B

    .line 11
    .line 12
    iget v4, p0, Lax/Z4/a;->d:I

    .line 13
    .line 14
    aget-byte v5, v1, v4

    .line 15
    .line 16
    shl-int/lit8 v5, v5, 0x18

    .line 17
    .line 18
    add-int/lit8 v6, v4, 0x1

    .line 19
    .line 20
    aget-byte v6, v1, v6

    .line 21
    .line 22
    and-int/lit16 v6, v6, 0xff

    .line 23
    .line 24
    shl-int/lit8 v6, v6, 0x10

    .line 25
    .line 26
    or-int/2addr v5, v6

    .line 27
    add-int/lit8 v6, v4, 0x2

    .line 28
    .line 29
    aget-byte v6, v1, v6

    .line 30
    .line 31
    and-int/lit16 v6, v6, 0xff

    .line 32
    .line 33
    shl-int/lit8 v6, v6, 0x8

    .line 34
    .line 35
    or-int/2addr v5, v6

    .line 36
    add-int/lit8 v4, v4, 0x3

    .line 37
    .line 38
    aget-byte v1, v1, v4

    .line 39
    .line 40
    and-int/lit16 v1, v1, 0xff

    .line 41
    .line 42
    or-int/2addr v1, v5

    .line 43
    invoke-direct {p0, v1}, Lax/Z4/a;->g(I)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_31

    .line 48
    .line 49
    goto :goto_5d

    .line 50
    :cond_31
    invoke-direct {p0, v1}, Lax/Z4/a;->b(I)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_38

    .line 55
    .line 56
    goto :goto_5d

    .line 57
    :cond_38
    ushr-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    invoke-direct {p0, v1}, Lax/Z4/a;->a(I)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_84

    .line 64
    .line 65
    goto :goto_5d

    .line 66
    :cond_41
    invoke-virtual {p0, v2}, Lax/Z4/a;->f(I)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_84

    .line 71
    .line 72
    iget-object v1, p0, Lax/Z4/a;->c:[B

    .line 73
    .line 74
    iget v4, p0, Lax/Z4/a;->d:I

    .line 75
    .line 76
    aget-byte v5, v1, v4

    .line 77
    .line 78
    and-int/lit16 v5, v5, 0xff

    .line 79
    .line 80
    shl-int/lit8 v5, v5, 0x8

    .line 81
    .line 82
    add-int/2addr v4, v3

    .line 83
    aget-byte v1, v1, v4

    .line 84
    .line 85
    and-int/lit16 v1, v1, 0xff

    .line 86
    .line 87
    or-int/2addr v1, v5

    .line 88
    invoke-direct {p0, v1}, Lax/Z4/a;->a(I)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_84

    .line 93
    .line 94
    :goto_5d
    iget v1, p0, Lax/Z4/a;->h:I

    .line 95
    .line 96
    if-eq v1, v3, :cond_81

    .line 97
    .line 98
    if-eq v1, v2, :cond_77

    .line 99
    .line 100
    if-ne v1, v0, :cond_6f

    .line 101
    .line 102
    iget-boolean v0, p0, Lax/Z4/a;->g:Z

    .line 103
    .line 104
    if-eqz v0, :cond_6c

    .line 105
    .line 106
    sget-object v0, Lax/T4/d;->h0:Lax/T4/d;

    .line 107
    .line 108
    goto :goto_86

    .line 109
    :cond_6c
    sget-object v0, Lax/T4/d;->i0:Lax/T4/d;

    .line 110
    .line 111
    goto :goto_86

    .line 112
    :cond_6f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 113
    .line 114
    const-string v1, "Internal error"

    .line 115
    .line 116
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_77
    iget-boolean v0, p0, Lax/Z4/a;->g:Z

    .line 121
    .line 122
    if-eqz v0, :cond_7e

    .line 123
    .line 124
    sget-object v0, Lax/T4/d;->f0:Lax/T4/d;

    .line 125
    .line 126
    goto :goto_86

    .line 127
    :cond_7e
    sget-object v0, Lax/T4/d;->g0:Lax/T4/d;

    .line 128
    .line 129
    goto :goto_86

    .line 130
    :cond_81
    sget-object v0, Lax/T4/d;->e0:Lax/T4/d;

    .line 131
    .line 132
    goto :goto_86

    .line 133
    :cond_84
    sget-object v0, Lax/T4/d;->e0:Lax/T4/d;

    .line 134
    .line 135
    :goto_86
    iget-object v1, p0, Lax/Z4/a;->a:Lax/W4/e;

    .line 136
    .line 137
    invoke-virtual {v1, v0}, Lax/W4/e;->r(Lax/T4/d;)V

    .line 138
    .line 139
    .line 140
    return-object v0
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

.method protected f(I)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/a;->e:I

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/a;->d:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    :goto_5
    const/4 v1, 0x1

    .line 7
    if-ge v0, p1, :cond_23

    .line 8
    .line 9
    iget-object v2, p0, Lax/Z4/a;->b:Ljava/io/InputStream;

    .line 10
    .line 11
    if-nez v2, :cond_e

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    goto :goto_18

    .line 15
    :cond_e
    iget-object v3, p0, Lax/Z4/a;->c:[B

    .line 16
    .line 17
    iget v4, p0, Lax/Z4/a;->e:I

    .line 18
    .line 19
    array-length v5, v3

    .line 20
    sub-int/2addr v5, v4

    .line 21
    invoke-virtual {v2, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :goto_18
    if-ge v2, v1, :cond_1c

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1c
    iget v1, p0, Lax/Z4/a;->e:I

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, p0, Lax/Z4/a;->e:I

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    goto :goto_5

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
.end method
