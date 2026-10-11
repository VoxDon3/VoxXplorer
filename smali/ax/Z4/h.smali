.class public Lax/Z4/h;
.super Lax/Z4/c;
.source "SourceFile"


# static fields
.field private static final C0:[B

.field private static final D0:[B

.field private static final E0:[B

.field private static final F0:[B

.field private static final G0:[B


# instance fields
.field protected final A0:I

.field protected B0:Z

.field protected final t0:Ljava/io/OutputStream;

.field protected u0:B

.field protected v0:[B

.field protected w0:I

.field protected final x0:I

.field protected final y0:I

.field protected z0:[C


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lax/W4/c;->c(Z)[B

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lax/Z4/h;->C0:[B

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lax/W4/c;->c(Z)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lax/Z4/h;->D0:[B

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    new-array v1, v0, [B

    .line 17
    .line 18
    fill-array-data v1, :array_26

    .line 19
    .line 20
    .line 21
    sput-object v1, Lax/Z4/h;->E0:[B

    .line 22
    .line 23
    new-array v0, v0, [B

    .line 24
    .line 25
    fill-array-data v0, :array_2c

    .line 26
    .line 27
    .line 28
    sput-object v0, Lax/Z4/h;->F0:[B

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_32

    .line 34
    .line 35
    .line 36
    sput-object v0, Lax/Z4/h;->G0:[B

    .line 37
    .line 38
    return-void

    .line 39
    :array_26
    .array-data 1
        0x6et
        0x75t
        0x6ct
        0x6ct
    .end array-data

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :array_2c
    .array-data 1
        0x74t
        0x72t
        0x75t
        0x65t
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :array_32
    .array-data 1
        0x66t
        0x61t
        0x6ct
        0x73t
        0x65t
    .end array-data
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

.method public constructor <init>(Lax/W4/e;ILax/T4/n;Ljava/io/OutputStream;C)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/c;-><init>(Lax/W4/e;ILax/T4/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 5
    .line 6
    int-to-byte p2, p5

    .line 7
    iput-byte p2, p0, Lax/Z4/h;->u0:B

    .line 8
    .line 9
    const/16 p2, 0x22

    .line 10
    .line 11
    if-eq p5, p2, :cond_12

    .line 12
    .line 13
    invoke-static {p5}, Lax/W4/c;->f(I)[I

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lax/Z4/c;->m0:[I

    .line 18
    .line 19
    :cond_12
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lax/Z4/h;->B0:Z

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/W4/e;->h()[B

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lax/Z4/h;->v0:[B

    .line 27
    .line 28
    array-length p2, p2

    .line 29
    iput p2, p0, Lax/Z4/h;->x0:I

    .line 30
    .line 31
    shr-int/lit8 p2, p2, 0x3

    .line 32
    .line 33
    iput p2, p0, Lax/Z4/h;->y0:I

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/W4/e;->d()[C

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lax/Z4/h;->z0:[C

    .line 40
    .line 41
    array-length p1, p1

    .line 42
    iput p1, p0, Lax/Z4/h;->A0:I

    .line 43
    .line 44
    sget-object p1, Lax/T4/g$a;->i0:Lax/T4/g$a;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_38

    .line 51
    .line 52
    const/16 p1, 0x7f

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lax/Z4/c;->d(I)Lax/T4/g;

    .line 55
    .line 56
    .line 57
    :cond_38
    return-void
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

.method private final a1(II)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/Z4/h;->v1()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 6
    .line 7
    const v2, 0xd800

    .line 8
    .line 9
    .line 10
    if-lt p1, v2, :cond_43

    .line 11
    .line 12
    const v2, 0xdfff

    .line 13
    .line 14
    .line 15
    if-gt p1, v2, :cond_43

    .line 16
    .line 17
    add-int/lit8 v2, p2, 0x1

    .line 18
    .line 19
    const/16 v3, 0x5c

    .line 20
    .line 21
    aput-byte v3, v1, p2

    .line 22
    .line 23
    add-int/lit8 v3, p2, 0x2

    .line 24
    .line 25
    const/16 v4, 0x75

    .line 26
    .line 27
    aput-byte v4, v1, v2

    .line 28
    .line 29
    add-int/lit8 v2, p2, 0x3

    .line 30
    .line 31
    shr-int/lit8 v4, p1, 0xc

    .line 32
    .line 33
    and-int/lit8 v4, v4, 0xf

    .line 34
    .line 35
    aget-byte v4, v0, v4

    .line 36
    .line 37
    aput-byte v4, v1, v3

    .line 38
    .line 39
    add-int/lit8 v3, p2, 0x4

    .line 40
    .line 41
    shr-int/lit8 v4, p1, 0x8

    .line 42
    .line 43
    and-int/lit8 v4, v4, 0xf

    .line 44
    .line 45
    aget-byte v4, v0, v4

    .line 46
    .line 47
    aput-byte v4, v1, v2

    .line 48
    .line 49
    add-int/lit8 v2, p2, 0x5

    .line 50
    .line 51
    shr-int/lit8 v4, p1, 0x4

    .line 52
    .line 53
    and-int/lit8 v4, v4, 0xf

    .line 54
    .line 55
    aget-byte v4, v0, v4

    .line 56
    .line 57
    aput-byte v4, v1, v3

    .line 58
    .line 59
    add-int/lit8 p2, p2, 0x6

    .line 60
    .line 61
    and-int/lit8 p1, p1, 0xf

    .line 62
    .line 63
    aget-byte p1, v0, p1

    .line 64
    .line 65
    aput-byte p1, v1, v2

    .line 66
    .line 67
    return p2

    .line 68
    :cond_43
    add-int/lit8 v0, p2, 0x1

    .line 69
    .line 70
    shr-int/lit8 v2, p1, 0xc

    .line 71
    .line 72
    or-int/lit16 v2, v2, 0xe0

    .line 73
    .line 74
    int-to-byte v2, v2

    .line 75
    aput-byte v2, v1, p2

    .line 76
    .line 77
    add-int/lit8 v2, p2, 0x2

    .line 78
    .line 79
    shr-int/lit8 v3, p1, 0x6

    .line 80
    .line 81
    and-int/lit8 v3, v3, 0x3f

    .line 82
    .line 83
    or-int/lit16 v3, v3, 0x80

    .line 84
    .line 85
    int-to-byte v3, v3

    .line 86
    aput-byte v3, v1, v0

    .line 87
    .line 88
    add-int/lit8 p2, p2, 0x3

    .line 89
    .line 90
    and-int/lit8 p1, p1, 0x3f

    .line 91
    .line 92
    or-int/lit16 p1, p1, 0x80

    .line 93
    .line 94
    int-to-byte p1, p1

    .line 95
    aput-byte p1, v1, v2

    .line 96
    .line 97
    return p2
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

.method private final b1(I[CII)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0xd800

    .line 3
    .line 4
    .line 5
    if-lt p1, v1, :cond_2a

    .line 6
    .line 7
    const v1, 0xdfff

    .line 8
    .line 9
    .line 10
    if-gt p1, v1, :cond_2a

    .line 11
    .line 12
    if-ge p3, p4, :cond_16

    .line 13
    .line 14
    if-nez p2, :cond_10

    .line 15
    .line 16
    goto :goto_16

    .line 17
    :cond_10
    aget-char p2, p2, p3

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lax/Z4/h;->c1(II)V

    .line 20
    .line 21
    .line 22
    goto :goto_28

    .line 23
    :cond_16
    :goto_16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-array p2, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 p4, 0x0

    .line 30
    aput-object p1, p2, p4

    .line 31
    .line 32
    const-string p1, "Split surrogate on writeRaw() input (last character): first character 0x%4x"

    .line 33
    .line 34
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_28
    add-int/2addr p3, v0

    .line 42
    return p3

    .line 43
    :cond_2a
    iget-object p2, p0, Lax/Z4/h;->v0:[B

    .line 44
    .line 45
    iget p4, p0, Lax/Z4/h;->w0:I

    .line 46
    .line 47
    add-int/2addr v0, p4

    .line 48
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 49
    .line 50
    shr-int/lit8 v1, p1, 0xc

    .line 51
    .line 52
    or-int/lit16 v1, v1, 0xe0

    .line 53
    .line 54
    int-to-byte v1, v1

    .line 55
    aput-byte v1, p2, p4

    .line 56
    .line 57
    add-int/lit8 v1, p4, 0x2

    .line 58
    .line 59
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 60
    .line 61
    shr-int/lit8 v2, p1, 0x6

    .line 62
    .line 63
    and-int/lit8 v2, v2, 0x3f

    .line 64
    .line 65
    or-int/lit16 v2, v2, 0x80

    .line 66
    .line 67
    int-to-byte v2, v2

    .line 68
    aput-byte v2, p2, v0

    .line 69
    .line 70
    add-int/lit8 p4, p4, 0x3

    .line 71
    .line 72
    iput p4, p0, Lax/Z4/h;->w0:I

    .line 73
    .line 74
    and-int/lit8 p1, p1, 0x3f

    .line 75
    .line 76
    or-int/lit16 p1, p1, 0x80

    .line 77
    .line 78
    int-to-byte p1, p1

    .line 79
    aput-byte p1, p2, v1

    .line 80
    .line 81
    return p3
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

.method private final f1([B)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 3
    .line 4
    add-int/2addr v1, v0

    .line 5
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-le v1, v2, :cond_16

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x200

    .line 14
    .line 15
    if-le v0, v1, :cond_16

    .line 16
    .line 17
    iget-object v1, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 18
    .line 19
    invoke-virtual {v1, p1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 24
    .line 25
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 26
    .line 27
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    return-void
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

.method private g1(II)I
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 2
    .line 3
    invoke-direct {p0}, Lax/Z4/h;->v1()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    add-int/lit8 v2, p2, 0x1

    .line 8
    .line 9
    const/16 v3, 0x5c

    .line 10
    .line 11
    aput-byte v3, v0, p2

    .line 12
    .line 13
    add-int/lit8 v3, p2, 0x2

    .line 14
    .line 15
    const/16 v4, 0x75

    .line 16
    .line 17
    aput-byte v4, v0, v2

    .line 18
    .line 19
    const/16 v2, 0xff

    .line 20
    .line 21
    if-le p1, v2, :cond_2d

    .line 22
    .line 23
    shr-int/lit8 v2, p1, 0x8

    .line 24
    .line 25
    and-int/lit16 v4, v2, 0xff

    .line 26
    .line 27
    add-int/lit8 v5, p2, 0x3

    .line 28
    .line 29
    shr-int/lit8 v4, v4, 0x4

    .line 30
    .line 31
    aget-byte v4, v1, v4

    .line 32
    .line 33
    aput-byte v4, v0, v3

    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x4

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0xf

    .line 38
    .line 39
    aget-byte v2, v1, v2

    .line 40
    .line 41
    aput-byte v2, v0, v5

    .line 42
    .line 43
    and-int/lit16 p1, p1, 0xff

    .line 44
    .line 45
    goto :goto_37

    .line 46
    :cond_2d
    add-int/lit8 v2, p2, 0x3

    .line 47
    .line 48
    const/16 v4, 0x30

    .line 49
    .line 50
    aput-byte v4, v0, v3

    .line 51
    .line 52
    add-int/lit8 p2, p2, 0x4

    .line 53
    .line 54
    aput-byte v4, v0, v2

    .line 55
    .line 56
    :goto_37
    add-int/lit8 v2, p2, 0x1

    .line 57
    .line 58
    shr-int/lit8 v3, p1, 0x4

    .line 59
    .line 60
    aget-byte v3, v1, v3

    .line 61
    .line 62
    aput-byte v3, v0, p2

    .line 63
    .line 64
    add-int/lit8 p2, p2, 0x2

    .line 65
    .line 66
    and-int/lit8 p1, p1, 0xf

    .line 67
    .line 68
    aget-byte p1, v1, p1

    .line 69
    .line 70
    aput-byte p1, v0, v2

    .line 71
    .line 72
    return p2
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

.method private final h1()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 6
    .line 7
    if-lt v0, v2, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 10
    .line 11
    .line 12
    :cond_b
    sget-object v0, Lax/Z4/h;->E0:[B

    .line 13
    .line 14
    iget-object v2, p0, Lax/Z4/h;->v0:[B

    .line 15
    .line 16
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v0, v4, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    iput v0, p0, Lax/Z4/h;->w0:I

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

.method private final j1(J)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 13
    .line 14
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 19
    .line 20
    iget-byte v3, p0, Lax/Z4/h;->u0:B

    .line 21
    .line 22
    aput-byte v3, v0, v1

    .line 23
    .line 24
    invoke-static {p1, p2, v0, v2}, Lax/W4/k;->r(J[BI)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p2, p0, Lax/Z4/h;->v0:[B

    .line 29
    .line 30
    add-int/lit8 v0, p1, 0x1

    .line 31
    .line 32
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 33
    .line 34
    iget-byte v0, p0, Lax/Z4/h;->u0:B

    .line 35
    .line 36
    aput-byte v0, p2, p1

    .line 37
    .line 38
    return-void
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

.method private k1([CII)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    if-ge p2, p3, :cond_3d

    .line 2
    .line 3
    :cond_2
    aget-char v0, p1, p2

    .line 4
    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-le v0, v1, :cond_2e

    .line 8
    .line 9
    add-int/lit8 p2, p2, 0x1

    .line 10
    .line 11
    const/16 v1, 0x800

    .line 12
    .line 13
    if-ge v0, v1, :cond_29

    .line 14
    .line 15
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 16
    .line 17
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 22
    .line 23
    shr-int/lit8 v4, v0, 0x6

    .line 24
    .line 25
    or-int/lit16 v4, v4, 0xc0

    .line 26
    .line 27
    int-to-byte v4, v4

    .line 28
    aput-byte v4, v1, v2

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 33
    .line 34
    and-int/lit8 v0, v0, 0x3f

    .line 35
    .line 36
    or-int/lit16 v0, v0, 0x80

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    aput-byte v0, v1, v3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_29
    invoke-direct {p0, v0, p1, p2, p3}, Lax/Z4/h;->b1(I[CII)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    goto :goto_0

    .line 47
    :cond_2e
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 48
    .line 49
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 54
    .line 55
    int-to-byte v0, v0

    .line 56
    aput-byte v0, v1, v2

    .line 57
    .line 58
    add-int/lit8 p2, p2, 0x1

    .line 59
    .line 60
    if-lt p2, p3, :cond_2

    .line 61
    .line 62
    :cond_3d
    return-void
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

.method private final l1([CII)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->x0:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 4
    .line 5
    add-int/2addr p3, p2

    .line 6
    :goto_5
    if-ge p2, p3, :cond_52

    .line 7
    .line 8
    :cond_7
    aget-char v2, p1, p2

    .line 9
    .line 10
    const/16 v3, 0x80

    .line 11
    .line 12
    if-lt v2, v3, :cond_3e

    .line 13
    .line 14
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x3

    .line 17
    .line 18
    iget v4, p0, Lax/Z4/h;->x0:I

    .line 19
    .line 20
    if-lt v2, v4, :cond_18

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 23
    .line 24
    .line 25
    :cond_18
    add-int/lit8 v2, p2, 0x1

    .line 26
    .line 27
    aget-char p2, p1, p2

    .line 28
    .line 29
    const/16 v4, 0x800

    .line 30
    .line 31
    if-ge p2, v4, :cond_39

    .line 32
    .line 33
    iget v4, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    add-int/lit8 v5, v4, 0x1

    .line 36
    .line 37
    iput v5, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    shr-int/lit8 v6, p2, 0x6

    .line 40
    .line 41
    or-int/lit16 v6, v6, 0xc0

    .line 42
    .line 43
    int-to-byte v6, v6

    .line 44
    aput-byte v6, v1, v4

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x2

    .line 47
    .line 48
    iput v4, p0, Lax/Z4/h;->w0:I

    .line 49
    .line 50
    and-int/lit8 p2, p2, 0x3f

    .line 51
    .line 52
    or-int/2addr p2, v3

    .line 53
    int-to-byte p2, p2

    .line 54
    aput-byte p2, v1, v5

    .line 55
    .line 56
    move p2, v2

    .line 57
    goto :goto_5

    .line 58
    :cond_39
    invoke-direct {p0, p2, p1, v2, p3}, Lax/Z4/h;->b1(I[CII)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    goto :goto_5

    .line 63
    :cond_3e
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 64
    .line 65
    if-lt v3, v0, :cond_45

    .line 66
    .line 67
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 71
    .line 72
    add-int/lit8 v4, v3, 0x1

    .line 73
    .line 74
    iput v4, p0, Lax/Z4/h;->w0:I

    .line 75
    .line 76
    int-to-byte v2, v2

    .line 77
    aput-byte v2, v1, v3

    .line 78
    .line 79
    add-int/lit8 p2, p2, 0x1

    .line 80
    .line 81
    if-lt p2, p3, :cond_7

    .line 82
    .line 83
    :cond_52
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private final m1(Ljava/lang/String;II)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/2addr p3, p2

    .line 2
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 3
    .line 4
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 5
    .line 6
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 7
    .line 8
    :goto_7
    if-ge p2, p3, :cond_1f

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/16 v4, 0x7f

    .line 15
    .line 16
    if-gt v3, v4, :cond_1f

    .line 17
    .line 18
    aget v4, v2, v3

    .line 19
    .line 20
    if-eqz v4, :cond_16

    .line 21
    .line 22
    goto :goto_1f

    .line 23
    :cond_16
    add-int/lit8 v4, v0, 0x1

    .line 24
    .line 25
    int-to-byte v3, v3

    .line 26
    aput-byte v3, v1, v0

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    move v0, v4

    .line 31
    goto :goto_7

    .line 32
    :cond_1f
    :goto_1f
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 33
    .line 34
    if-ge p2, p3, :cond_2e

    .line 35
    .line 36
    iget v0, p0, Lax/Z4/c;->n0:I

    .line 37
    .line 38
    if-nez v0, :cond_2b

    .line 39
    .line 40
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/h;->o1(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/h;->q1(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    return-void
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

.method private final n1([CII)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/2addr p3, p2

    .line 2
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 3
    .line 4
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 5
    .line 6
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 7
    .line 8
    :goto_7
    if-ge p2, p3, :cond_1d

    .line 9
    .line 10
    aget-char v3, p1, p2

    .line 11
    .line 12
    const/16 v4, 0x7f

    .line 13
    .line 14
    if-gt v3, v4, :cond_1d

    .line 15
    .line 16
    aget v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_14

    .line 19
    .line 20
    goto :goto_1d

    .line 21
    :cond_14
    add-int/lit8 v4, v0, 0x1

    .line 22
    .line 23
    int-to-byte v3, v3

    .line 24
    aput-byte v3, v1, v0

    .line 25
    .line 26
    add-int/lit8 p2, p2, 0x1

    .line 27
    .line 28
    move v0, v4

    .line 29
    goto :goto_7

    .line 30
    :cond_1d
    :goto_1d
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 31
    .line 32
    if-ge p2, p3, :cond_2c

    .line 33
    .line 34
    iget v0, p0, Lax/Z4/c;->n0:I

    .line 35
    .line 36
    if-nez v0, :cond_29

    .line 37
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/h;->p1([CII)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/h;->r1([CII)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void
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

.method private final o1(Ljava/lang/String;II)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 9
    .line 10
    if-le v0, v1, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 16
    .line 17
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 18
    .line 19
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 20
    .line 21
    :goto_14
    if-ge p2, p3, :cond_5d

    .line 22
    .line 23
    add-int/lit8 v3, p2, 0x1

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/16 v4, 0x7f

    .line 30
    .line 31
    if-gt p2, v4, :cond_40

    .line 32
    .line 33
    aget v4, v2, p2

    .line 34
    .line 35
    if-nez v4, :cond_2c

    .line 36
    .line 37
    add-int/lit8 v4, v0, 0x1

    .line 38
    .line 39
    int-to-byte p2, p2

    .line 40
    aput-byte p2, v1, v0

    .line 41
    .line 42
    move p2, v3

    .line 43
    move v0, v4

    .line 44
    goto :goto_14

    .line 45
    :cond_2c
    if-lez v4, :cond_3b

    .line 46
    .line 47
    add-int/lit8 p2, v0, 0x1

    .line 48
    .line 49
    const/16 v5, 0x5c

    .line 50
    .line 51
    aput-byte v5, v1, v0

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x2

    .line 54
    .line 55
    int-to-byte v4, v4

    .line 56
    aput-byte v4, v1, p2

    .line 57
    .line 58
    :goto_39
    move p2, v3

    .line 59
    goto :goto_14

    .line 60
    :cond_3b
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_39

    .line 65
    :cond_40
    const/16 v4, 0x7ff

    .line 66
    .line 67
    if-gt p2, v4, :cond_57

    .line 68
    .line 69
    add-int/lit8 v4, v0, 0x1

    .line 70
    .line 71
    shr-int/lit8 v5, p2, 0x6

    .line 72
    .line 73
    or-int/lit16 v5, v5, 0xc0

    .line 74
    .line 75
    int-to-byte v5, v5

    .line 76
    aput-byte v5, v1, v0

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x2

    .line 79
    .line 80
    and-int/lit8 p2, p2, 0x3f

    .line 81
    .line 82
    or-int/lit16 p2, p2, 0x80

    .line 83
    .line 84
    int-to-byte p2, p2

    .line 85
    aput-byte p2, v1, v4

    .line 86
    .line 87
    goto :goto_39

    .line 88
    :cond_57
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->a1(II)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    move v0, p2

    .line 93
    goto :goto_39

    .line 94
    :cond_5d
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 95
    .line 96
    return-void
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
.end method

.method private final p1([CII)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 9
    .line 10
    if-le v0, v1, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 16
    .line 17
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 18
    .line 19
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 20
    .line 21
    :goto_14
    if-ge p2, p3, :cond_5b

    .line 22
    .line 23
    add-int/lit8 v3, p2, 0x1

    .line 24
    .line 25
    aget-char p2, p1, p2

    .line 26
    .line 27
    const/16 v4, 0x7f

    .line 28
    .line 29
    if-gt p2, v4, :cond_3e

    .line 30
    .line 31
    aget v4, v2, p2

    .line 32
    .line 33
    if-nez v4, :cond_2a

    .line 34
    .line 35
    add-int/lit8 v4, v0, 0x1

    .line 36
    .line 37
    int-to-byte p2, p2

    .line 38
    aput-byte p2, v1, v0

    .line 39
    .line 40
    move p2, v3

    .line 41
    move v0, v4

    .line 42
    goto :goto_14

    .line 43
    :cond_2a
    if-lez v4, :cond_39

    .line 44
    .line 45
    add-int/lit8 p2, v0, 0x1

    .line 46
    .line 47
    const/16 v5, 0x5c

    .line 48
    .line 49
    aput-byte v5, v1, v0

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x2

    .line 52
    .line 53
    int-to-byte v4, v4

    .line 54
    aput-byte v4, v1, p2

    .line 55
    .line 56
    :goto_37
    move p2, v3

    .line 57
    goto :goto_14

    .line 58
    :cond_39
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_37

    .line 63
    :cond_3e
    const/16 v4, 0x7ff

    .line 64
    .line 65
    if-gt p2, v4, :cond_55

    .line 66
    .line 67
    add-int/lit8 v4, v0, 0x1

    .line 68
    .line 69
    shr-int/lit8 v5, p2, 0x6

    .line 70
    .line 71
    or-int/lit16 v5, v5, 0xc0

    .line 72
    .line 73
    int-to-byte v5, v5

    .line 74
    aput-byte v5, v1, v0

    .line 75
    .line 76
    add-int/lit8 v0, v0, 0x2

    .line 77
    .line 78
    and-int/lit8 p2, p2, 0x3f

    .line 79
    .line 80
    or-int/lit16 p2, p2, 0x80

    .line 81
    .line 82
    int-to-byte p2, p2

    .line 83
    aput-byte p2, v1, v4

    .line 84
    .line 85
    goto :goto_37

    .line 86
    :cond_55
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->a1(II)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    move v0, p2

    .line 91
    goto :goto_37

    .line 92
    :cond_5b
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 93
    .line 94
    return-void
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
.end method

.method private final q1(Ljava/lang/String;II)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 9
    .line 10
    if-le v0, v1, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 16
    .line 17
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 18
    .line 19
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 20
    .line 21
    iget v3, p0, Lax/Z4/c;->n0:I

    .line 22
    .line 23
    :goto_16
    if-ge p2, p3, :cond_66

    .line 24
    .line 25
    add-int/lit8 v4, p2, 0x1

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/16 v5, 0x7f

    .line 32
    .line 33
    if-gt p2, v5, :cond_42

    .line 34
    .line 35
    aget v5, v2, p2

    .line 36
    .line 37
    if-nez v5, :cond_2e

    .line 38
    .line 39
    add-int/lit8 v5, v0, 0x1

    .line 40
    .line 41
    int-to-byte p2, p2

    .line 42
    aput-byte p2, v1, v0

    .line 43
    .line 44
    move p2, v4

    .line 45
    move v0, v5

    .line 46
    goto :goto_16

    .line 47
    :cond_2e
    if-lez v5, :cond_3d

    .line 48
    .line 49
    add-int/lit8 p2, v0, 0x1

    .line 50
    .line 51
    const/16 v6, 0x5c

    .line 52
    .line 53
    aput-byte v6, v1, v0

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    int-to-byte v5, v5

    .line 58
    aput-byte v5, v1, p2

    .line 59
    .line 60
    :goto_3b
    move p2, v4

    .line 61
    goto :goto_16

    .line 62
    :cond_3d
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_3b

    .line 67
    :cond_42
    if-le p2, v3, :cond_49

    .line 68
    .line 69
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_3b

    .line 74
    :cond_49
    const/16 v5, 0x7ff

    .line 75
    .line 76
    if-gt p2, v5, :cond_60

    .line 77
    .line 78
    add-int/lit8 v5, v0, 0x1

    .line 79
    .line 80
    shr-int/lit8 v6, p2, 0x6

    .line 81
    .line 82
    or-int/lit16 v6, v6, 0xc0

    .line 83
    .line 84
    int-to-byte v6, v6

    .line 85
    aput-byte v6, v1, v0

    .line 86
    .line 87
    add-int/lit8 v0, v0, 0x2

    .line 88
    .line 89
    and-int/lit8 p2, p2, 0x3f

    .line 90
    .line 91
    or-int/lit16 p2, p2, 0x80

    .line 92
    .line 93
    int-to-byte p2, p2

    .line 94
    aput-byte p2, v1, v5

    .line 95
    .line 96
    goto :goto_3b

    .line 97
    :cond_60
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->a1(II)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    move v0, p2

    .line 102
    goto :goto_3b

    .line 103
    :cond_66
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 104
    .line 105
    return-void
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

.method private final r1([CII)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 9
    .line 10
    if-le v0, v1, :cond_e

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 16
    .line 17
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 18
    .line 19
    iget-object v2, p0, Lax/Z4/c;->m0:[I

    .line 20
    .line 21
    iget v3, p0, Lax/Z4/c;->n0:I

    .line 22
    .line 23
    :goto_16
    if-ge p2, p3, :cond_64

    .line 24
    .line 25
    add-int/lit8 v4, p2, 0x1

    .line 26
    .line 27
    aget-char p2, p1, p2

    .line 28
    .line 29
    const/16 v5, 0x7f

    .line 30
    .line 31
    if-gt p2, v5, :cond_40

    .line 32
    .line 33
    aget v5, v2, p2

    .line 34
    .line 35
    if-nez v5, :cond_2c

    .line 36
    .line 37
    add-int/lit8 v5, v0, 0x1

    .line 38
    .line 39
    int-to-byte p2, p2

    .line 40
    aput-byte p2, v1, v0

    .line 41
    .line 42
    move p2, v4

    .line 43
    move v0, v5

    .line 44
    goto :goto_16

    .line 45
    :cond_2c
    if-lez v5, :cond_3b

    .line 46
    .line 47
    add-int/lit8 p2, v0, 0x1

    .line 48
    .line 49
    const/16 v6, 0x5c

    .line 50
    .line 51
    aput-byte v6, v1, v0

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x2

    .line 54
    .line 55
    int-to-byte v5, v5

    .line 56
    aput-byte v5, v1, p2

    .line 57
    .line 58
    :goto_39
    move p2, v4

    .line 59
    goto :goto_16

    .line 60
    :cond_3b
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_39

    .line 65
    :cond_40
    if-le p2, v3, :cond_47

    .line 66
    .line 67
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->g1(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    goto :goto_39

    .line 72
    :cond_47
    const/16 v5, 0x7ff

    .line 73
    .line 74
    if-gt p2, v5, :cond_5e

    .line 75
    .line 76
    add-int/lit8 v5, v0, 0x1

    .line 77
    .line 78
    shr-int/lit8 v6, p2, 0x6

    .line 79
    .line 80
    or-int/lit16 v6, v6, 0xc0

    .line 81
    .line 82
    int-to-byte v6, v6

    .line 83
    aput-byte v6, v1, v0

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x2

    .line 86
    .line 87
    and-int/lit8 p2, p2, 0x3f

    .line 88
    .line 89
    or-int/lit16 p2, p2, 0x80

    .line 90
    .line 91
    int-to-byte p2, p2

    .line 92
    aput-byte p2, v1, v5

    .line 93
    .line 94
    goto :goto_39

    .line 95
    :cond_5e
    invoke-direct {p0, p2, v0}, Lax/Z4/h;->a1(II)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    move v0, p2

    .line 100
    goto :goto_39

    .line 101
    :cond_64
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 102
    .line 103
    return-void
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
.end method

.method private final s1(Ljava/lang/String;II)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    iget v0, p0, Lax/Z4/h;->y0:I

    .line 2
    .line 3
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 11
    .line 12
    if-le v1, v2, :cond_10

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-direct {p0, p1, p2, v0}, Lax/Z4/h;->m1(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    add-int/2addr p2, v0

    .line 21
    sub-int/2addr p3, v0

    .line 22
    if-gtz p3, :cond_0

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

.method private final t1(Ljava/lang/String;Z)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_17

    .line 2
    .line 3
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 4
    .line 5
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 13
    .line 14
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 19
    .line 20
    iget-byte v2, p0, Lax/Z4/h;->u0:B

    .line 21
    .line 22
    aput-byte v2, v0, v1

    .line 23
    .line 24
    :cond_17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_1c
    if-lez v0, :cond_34

    .line 30
    .line 31
    iget v2, p0, Lax/Z4/h;->y0:I

    .line 32
    .line 33
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    add-int/2addr v3, v2

    .line 40
    iget v4, p0, Lax/Z4/h;->x0:I

    .line 41
    .line 42
    if-le v3, v4, :cond_2e

    .line 43
    .line 44
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    invoke-direct {p0, p1, v1, v2}, Lax/Z4/h;->m1(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int/2addr v0, v2

    .line 52
    goto :goto_1c

    .line 53
    :cond_34
    if-eqz p2, :cond_4b

    .line 54
    .line 55
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 56
    .line 57
    iget p2, p0, Lax/Z4/h;->x0:I

    .line 58
    .line 59
    if-lt p1, p2, :cond_3f

    .line 60
    .line 61
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 62
    .line 63
    .line 64
    :cond_3f
    iget-object p1, p0, Lax/Z4/h;->v0:[B

    .line 65
    .line 66
    iget p2, p0, Lax/Z4/h;->w0:I

    .line 67
    .line 68
    add-int/lit8 v0, p2, 0x1

    .line 69
    .line 70
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 71
    .line 72
    iget-byte v0, p0, Lax/Z4/h;->u0:B

    .line 73
    .line 74
    aput-byte v0, p1, p2

    .line 75
    .line 76
    :cond_4b
    return-void
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

.method private final u1([CII)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    iget v0, p0, Lax/Z4/h;->y0:I

    .line 2
    .line 3
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 11
    .line 12
    if-le v1, v2, :cond_10

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-direct {p0, p1, p2, v0}, Lax/Z4/h;->n1([CII)V

    .line 18
    .line 19
    .line 20
    add-int/2addr p2, v0

    .line 21
    sub-int/2addr p3, v0

    .line 22
    if-gtz p3, :cond_0

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

.method private v1()[B
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/Z4/c;->q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    sget-object v0, Lax/Z4/h;->C0:[B

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    sget-object v0, Lax/Z4/h;->D0:[B

    .line 9
    .line 10
    return-object v0
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


# virtual methods
.method public A(C)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 13
    .line 14
    const/16 v1, 0x7f

    .line 15
    .line 16
    if-gt p1, v1, :cond_1b

    .line 17
    .line 18
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 19
    .line 20
    add-int/lit8 v2, v1, 0x1

    .line 21
    .line 22
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 23
    .line 24
    int-to-byte p1, p1

    .line 25
    aput-byte p1, v0, v1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    const/16 v1, 0x800

    .line 29
    .line 30
    if-ge p1, v1, :cond_38

    .line 31
    .line 32
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 33
    .line 34
    add-int/lit8 v2, v1, 0x1

    .line 35
    .line 36
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 37
    .line 38
    shr-int/lit8 v3, p1, 0x6

    .line 39
    .line 40
    or-int/lit16 v3, v3, 0xc0

    .line 41
    .line 42
    int-to-byte v3, v3

    .line 43
    aput-byte v3, v0, v1

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x2

    .line 46
    .line 47
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 48
    .line 49
    and-int/lit8 p1, p1, 0x3f

    .line 50
    .line 51
    or-int/lit16 p1, p1, 0x80

    .line 52
    .line 53
    int-to-byte p1, p1

    .line 54
    aput-byte p1, v0, v2

    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    const/4 v0, 0x0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, p1, v0, v1, v1}, Lax/Z4/h;->b1(I[CII)I

    .line 60
    .line 61
    .line 62
    return-void
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
.end method

.method public F(Lax/T4/p;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lax/T4/p;->b([BI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_12

    .line 10
    .line 11
    invoke-interface {p1}, Lax/T4/p;->c()[B

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0, p1}, Lax/Z4/h;->f1([B)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lax/Z4/h;->w0:I

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

.method public H(Ljava/lang/String;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lax/Z4/h;->z0:[C

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-gt v0, v2, :cond_11

    .line 10
    .line 11
    invoke-virtual {p1, v3, v0, v1, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v3, v0}, Lax/Z4/h;->L([CII)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    invoke-virtual {p0, p1, v3, v0}, Lax/Z4/h;->w1(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method public final L([CII)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lax/U4/a;->A0([CII)V

    .line 2
    .line 3
    .line 4
    add-int v0, p3, p3

    .line 5
    .line 6
    add-int/2addr v0, p3

    .line 7
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 11
    .line 12
    if-le v1, v2, :cond_16

    .line 13
    .line 14
    if-ge v2, v0, :cond_13

    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/h;->l1([CII)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 21
    .line 22
    .line 23
    :cond_16
    add-int/2addr p3, p2

    .line 24
    :goto_17
    if-ge p2, p3, :cond_54

    .line 25
    .line 26
    :cond_19
    aget-char v0, p1, p2

    .line 27
    .line 28
    const/16 v1, 0x7f

    .line 29
    .line 30
    if-le v0, v1, :cond_45

    .line 31
    .line 32
    add-int/lit8 p2, p2, 0x1

    .line 33
    .line 34
    const/16 v1, 0x800

    .line 35
    .line 36
    if-ge v0, v1, :cond_40

    .line 37
    .line 38
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 39
    .line 40
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 41
    .line 42
    add-int/lit8 v3, v2, 0x1

    .line 43
    .line 44
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 45
    .line 46
    shr-int/lit8 v4, v0, 0x6

    .line 47
    .line 48
    or-int/lit16 v4, v4, 0xc0

    .line 49
    .line 50
    int-to-byte v4, v4

    .line 51
    aput-byte v4, v1, v2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 56
    .line 57
    and-int/lit8 v0, v0, 0x3f

    .line 58
    .line 59
    or-int/lit16 v0, v0, 0x80

    .line 60
    .line 61
    int-to-byte v0, v0

    .line 62
    aput-byte v0, v1, v3

    .line 63
    .line 64
    goto :goto_17

    .line 65
    :cond_40
    invoke-direct {p0, v0, p1, p2, p3}, Lax/Z4/h;->b1(I[CII)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    goto :goto_17

    .line 70
    :cond_45
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 71
    .line 72
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 73
    .line 74
    add-int/lit8 v3, v2, 0x1

    .line 75
    .line 76
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 77
    .line 78
    int-to-byte v0, v0

    .line 79
    aput-byte v0, v1, v2

    .line 80
    .line 81
    add-int/lit8 p2, p2, 0x1

    .line 82
    .line 83
    if-lt p2, p3, :cond_19

    .line 84
    .line 85
    :cond_54
    return-void
    .line 86
    .line 87
    .line 88
.end method

.method public final W()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "start an array"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/Z4/f;->k()Lax/Z4/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 13
    .line 14
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lax/T4/o;->f(Lax/T4/g;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 23
    .line 24
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 32
    .line 33
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    const/16 v2, 0x5b

    .line 40
    .line 41
    aput-byte v2, v0, v1

    .line 42
    .line 43
    return-void
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

.method protected final Z0()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 2
    .line 3
    if-lez v0, :cond_e

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 7
    .line 8
    iget-object v2, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 9
    .line 10
    iget-object v3, p0, Lax/Z4/h;->v0:[B

    .line 11
    .line 12
    invoke-virtual {v2, v3, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 13
    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected final c1(II)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/U4/a;->F0(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Lax/Z4/h;->w0:I

    .line 6
    .line 7
    add-int/lit8 p2, p2, 0x4

    .line 8
    .line 9
    iget v0, p0, Lax/Z4/h;->x0:I

    .line 10
    .line 11
    if-le p2, v0, :cond_f

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 14
    .line 15
    .line 16
    :cond_f
    iget-object p2, p0, Lax/Z4/h;->v0:[B

    .line 17
    .line 18
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 19
    .line 20
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 23
    .line 24
    shr-int/lit8 v2, p1, 0x12

    .line 25
    .line 26
    or-int/lit16 v2, v2, 0xf0

    .line 27
    .line 28
    int-to-byte v2, v2

    .line 29
    aput-byte v2, p2, v0

    .line 30
    .line 31
    add-int/lit8 v2, v0, 0x2

    .line 32
    .line 33
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    shr-int/lit8 v3, p1, 0xc

    .line 36
    .line 37
    and-int/lit8 v3, v3, 0x3f

    .line 38
    .line 39
    or-int/lit16 v3, v3, 0x80

    .line 40
    .line 41
    int-to-byte v3, v3

    .line 42
    aput-byte v3, p2, v1

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x3

    .line 45
    .line 46
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 47
    .line 48
    shr-int/lit8 v3, p1, 0x6

    .line 49
    .line 50
    and-int/lit8 v3, v3, 0x3f

    .line 51
    .line 52
    or-int/lit16 v3, v3, 0x80

    .line 53
    .line 54
    int-to-byte v3, v3

    .line 55
    aput-byte v3, p2, v2

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x4

    .line 58
    .line 59
    iput v0, p0, Lax/Z4/h;->w0:I

    .line 60
    .line 61
    and-int/lit8 p1, p1, 0x3f

    .line 62
    .line 63
    or-int/lit16 p1, p1, 0x80

    .line 64
    .line 65
    int-to-byte p1, p1

    .line 66
    aput-byte p1, p2, v1

    .line 67
    .line 68
    return-void
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

.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lax/U4/a;->close()V

    .line 2
    .line 3
    .line 4
    :try_start_3
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 5
    .line 6
    if-eqz v0, :cond_29

    .line 7
    .line 8
    sget-object v0, Lax/T4/g$a;->e0:Lax/T4/g$a;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_29

    .line 15
    .line 16
    :goto_f
    invoke-virtual {p0}, Lax/U4/a;->G0()Lax/T4/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lax/T4/l;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1f

    .line 25
    .line 26
    invoke-virtual {p0}, Lax/Z4/h;->j()V

    .line 27
    .line 28
    .line 29
    goto :goto_f

    .line 30
    :catch_1d
    move-exception v0

    .line 31
    goto :goto_2d

    .line 32
    :cond_1f
    invoke-virtual {v0}, Lax/T4/l;->f()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_29

    .line 37
    .line 38
    invoke-virtual {p0}, Lax/Z4/h;->m()V

    .line 39
    .line 40
    .line 41
    goto :goto_f

    .line 42
    :cond_29
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V
    :try_end_2c
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_2c} :catch_1d

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_2d
    const/4 v1, 0x0

    .line 47
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 48
    .line 49
    iget-object v1, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 50
    .line 51
    if-eqz v1, :cond_63

    .line 52
    .line 53
    :try_start_34
    iget-object v1, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 54
    .line 55
    invoke-virtual {v1}, Lax/W4/e;->l()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_57

    .line 60
    .line 61
    sget-object v1, Lax/T4/g$a;->d0:Lax/T4/g$a;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_45

    .line 68
    .line 69
    goto :goto_57

    .line 70
    :cond_45
    sget-object v1, Lax/T4/g$a;->f0:Lax/T4/g$a;

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_63

    .line 77
    .line 78
    iget-object v1, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 81
    .line 82
    .line 83
    goto :goto_63

    .line 84
    :catch_53
    move-exception v1

    .line 85
    goto :goto_5d

    .line 86
    :catch_55
    move-exception v1

    .line 87
    goto :goto_5d

    .line 88
    :cond_57
    :goto_57
    iget-object v1, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_5c
    .catch Ljava/io/IOException; {:try_start_34 .. :try_end_5c} :catch_55
    .catch Ljava/lang/RuntimeException; {:try_start_34 .. :try_end_5c} :catch_53

    .line 91
    .line 92
    .line 93
    goto :goto_63

    .line 94
    :goto_5d
    if-eqz v0, :cond_62

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :cond_62
    throw v1

    .line 100
    :cond_63
    :goto_63
    invoke-virtual {p0}, Lax/Z4/h;->d1()V

    .line 101
    .line 102
    .line 103
    if-nez v0, :cond_69

    .line 104
    .line 105
    return-void

    .line 106
    :cond_69
    throw v0
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

.method protected d1()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_10

    .line 5
    .line 6
    iget-boolean v2, p0, Lax/Z4/h;->B0:Z

    .line 7
    .line 8
    if-eqz v2, :cond_10

    .line 9
    .line 10
    iput-object v1, p0, Lax/Z4/h;->v0:[B

    .line 11
    .line 12
    iget-object v2, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lax/W4/e;->q([B)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/Z4/h;->z0:[C

    .line 18
    .line 19
    if-eqz v0, :cond_1b

    .line 20
    .line 21
    iput-object v1, p0, Lax/Z4/h;->z0:[C

    .line 22
    .line 23
    iget-object v1, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lax/W4/e;->m([C)V

    .line 26
    .line 27
    .line 28
    :cond_1b
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

.method protected final e1(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/Z4/f;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 8
    .line 9
    if-eqz v1, :cond_e

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lax/Z4/c;->T0(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_31

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_2e

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_1f

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    if-eq v0, v1, :cond_1b

    .line 26
    .line 27
    goto :goto_2d

    .line 28
    :cond_1b
    invoke-virtual {p0, p1}, Lax/Z4/c;->M0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    iget-object p1, p0, Lax/Z4/c;->o0:Lax/T4/p;

    .line 33
    .line 34
    if-eqz p1, :cond_2d

    .line 35
    .line 36
    invoke-interface {p1}, Lax/T4/p;->c()[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    array-length v0, p1

    .line 41
    if-lez v0, :cond_2d

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lax/Z4/h;->f1([B)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    return-void

    .line 47
    :cond_2e
    const/16 p1, 0x3a

    .line 48
    .line 49
    goto :goto_33

    .line 50
    :cond_31
    const/16 p1, 0x2c

    .line 51
    .line 52
    :goto_33
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 53
    .line 54
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 55
    .line 56
    if-lt v0, v1, :cond_3c

    .line 57
    .line 58
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 59
    .line 60
    .line 61
    :cond_3c
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 62
    .line 63
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 64
    .line 65
    add-int/lit8 v2, v1, 0x1

    .line 66
    .line 67
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 68
    .line 69
    aput-byte p1, v0, v1

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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public flush()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 5
    .line 6
    if-eqz v0, :cond_14

    .line 7
    .line 8
    sget-object v0, Lax/T4/g$a;->f0:Lax/T4/g$a;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_14

    .line 15
    .line 16
    iget-object v0, p0, Lax/Z4/h;->t0:Ljava/io/OutputStream;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-void
.end method

.method public g(Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "write a boolean value"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x5

    .line 9
    .line 10
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_10

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 15
    .line 16
    .line 17
    :cond_10
    if-eqz p1, :cond_15

    .line 18
    .line 19
    sget-object p1, Lax/Z4/h;->F0:[B

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    sget-object p1, Lax/Z4/h;->G0:[B

    .line 23
    .line 24
    :goto_17
    array-length v0, p1

    .line 25
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 26
    .line 27
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    add-int/2addr p1, v0

    .line 36
    iput p1, p0, Lax/Z4/h;->w0:I

    .line 37
    .line 38
    return-void
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

.method protected final i1(Ljava/lang/String;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/Z4/f;->o(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    if-ne v0, v1, :cond_e

    .line 9
    .line 10
    const-string v1, "Can not write a field name, expecting a value"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_17

    .line 17
    .line 18
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Lax/T4/o;->h(Lax/T4/g;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1c

    .line 24
    :cond_17
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 25
    .line 26
    invoke-interface {v0, p0}, Lax/T4/o;->a(Lax/T4/g;)V

    .line 27
    .line 28
    .line 29
    :goto_1c
    iget-boolean v0, p0, Lax/Z4/c;->p0:Z

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v0, :cond_25

    .line 33
    .line 34
    invoke-direct {p0, p1, v2}, Lax/Z4/h;->t1(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v3, p0, Lax/Z4/h;->A0:I

    .line 43
    .line 44
    if-le v0, v3, :cond_31

    .line 45
    .line 46
    invoke-direct {p0, p1, v1}, Lax/Z4/h;->t1(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 51
    .line 52
    iget v3, p0, Lax/Z4/h;->x0:I

    .line 53
    .line 54
    if-lt v1, v3, :cond_3a

    .line 55
    .line 56
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 60
    .line 61
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 62
    .line 63
    add-int/lit8 v4, v3, 0x1

    .line 64
    .line 65
    iput v4, p0, Lax/Z4/h;->w0:I

    .line 66
    .line 67
    iget-byte v4, p0, Lax/Z4/h;->u0:B

    .line 68
    .line 69
    aput-byte v4, v1, v3

    .line 70
    .line 71
    iget-object v1, p0, Lax/Z4/h;->z0:[C

    .line 72
    .line 73
    invoke-virtual {p1, v2, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 74
    .line 75
    .line 76
    iget p1, p0, Lax/Z4/h;->y0:I

    .line 77
    .line 78
    if-gt v0, p1, :cond_5f

    .line 79
    .line 80
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 81
    .line 82
    add-int/2addr p1, v0

    .line 83
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 84
    .line 85
    if-le p1, v1, :cond_59

    .line 86
    .line 87
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 88
    .line 89
    .line 90
    :cond_59
    iget-object p1, p0, Lax/Z4/h;->z0:[C

    .line 91
    .line 92
    invoke-direct {p0, p1, v2, v0}, Lax/Z4/h;->n1([CII)V

    .line 93
    .line 94
    .line 95
    goto :goto_64

    .line 96
    :cond_5f
    iget-object p1, p0, Lax/Z4/h;->z0:[C

    .line 97
    .line 98
    invoke-direct {p0, p1, v2, v0}, Lax/Z4/h;->u1([CII)V

    .line 99
    .line 100
    .line 101
    :goto_64
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 102
    .line 103
    iget v0, p0, Lax/Z4/h;->x0:I

    .line 104
    .line 105
    if-lt p1, v0, :cond_6d

    .line 106
    .line 107
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 108
    .line 109
    .line 110
    :cond_6d
    iget-object p1, p0, Lax/Z4/h;->v0:[B

    .line 111
    .line 112
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 113
    .line 114
    add-int/lit8 v1, v0, 0x1

    .line 115
    .line 116
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 117
    .line 118
    iget-byte v1, p0, Lax/Z4/h;->u0:B

    .line 119
    .line 120
    aput-byte v1, p1, v0

    .line 121
    .line 122
    return-void
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

.method public final j()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/T4/l;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_22

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Current context not Array but "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/T4/l;->h()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 36
    .line 37
    if-eqz v0, :cond_30

    .line 38
    .line 39
    iget-object v1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 40
    .line 41
    invoke-virtual {v1}, Lax/T4/l;->c()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-interface {v0, p0, v1}, Lax/T4/o;->b(Lax/T4/g;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_45

    .line 49
    :cond_30
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 50
    .line 51
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 52
    .line 53
    if-lt v0, v1, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 59
    .line 60
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 65
    .line 66
    const/16 v2, 0x5d

    .line 67
    .line 68
    aput-byte v2, v0, v1

    .line 69
    .line 70
    :goto_45
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 71
    .line 72
    invoke-virtual {v0}, Lax/Z4/f;->j()Lax/Z4/f;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 77
    .line 78
    return-void
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
.end method

.method public final m()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/T4/l;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_22

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Current context not Object but "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 20
    .line 21
    invoke-virtual {v1}, Lax/T4/l;->h()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 36
    .line 37
    if-eqz v0, :cond_30

    .line 38
    .line 39
    iget-object v1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 40
    .line 41
    invoke-virtual {v1}, Lax/T4/l;->c()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-interface {v0, p0, v1}, Lax/T4/o;->c(Lax/T4/g;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_45

    .line 49
    :cond_30
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 50
    .line 51
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 52
    .line 53
    if-lt v0, v1, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 59
    .line 60
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 65
    .line 66
    const/16 v2, 0x7d

    .line 67
    .line 68
    aput-byte v2, v0, v1

    .line 69
    .line 70
    :goto_45
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 71
    .line 72
    invoke-virtual {v0}, Lax/Z4/f;->j()Lax/Z4/f;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 77
    .line 78
    return-void
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
.end method

.method public o(Ljava/lang/String;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lax/Z4/h;->i1(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/Z4/f;->o(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_16

    .line 17
    .line 18
    const-string v1, "Can not write a field name, expecting a value"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lax/T4/g;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_2e

    .line 25
    .line 26
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 27
    .line 28
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 29
    .line 30
    if-lt v0, v2, :cond_22

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 36
    .line 37
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    add-int/lit8 v3, v2, 0x1

    .line 40
    .line 41
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 42
    .line 43
    const/16 v3, 0x2c

    .line 44
    .line 45
    aput-byte v3, v0, v2

    .line 46
    .line 47
    :cond_2e
    iget-boolean v0, p0, Lax/Z4/c;->p0:Z

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v0, :cond_37

    .line 51
    .line 52
    invoke-direct {p0, p1, v2}, Lax/Z4/h;->t1(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v3, p0, Lax/Z4/h;->A0:I

    .line 61
    .line 62
    if-le v0, v3, :cond_43

    .line 63
    .line 64
    invoke-direct {p0, p1, v1}, Lax/Z4/h;->t1(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 69
    .line 70
    iget v3, p0, Lax/Z4/h;->x0:I

    .line 71
    .line 72
    if-lt v1, v3, :cond_4c

    .line 73
    .line 74
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 75
    .line 76
    .line 77
    :cond_4c
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 78
    .line 79
    iget v3, p0, Lax/Z4/h;->w0:I

    .line 80
    .line 81
    add-int/lit8 v4, v3, 0x1

    .line 82
    .line 83
    iput v4, p0, Lax/Z4/h;->w0:I

    .line 84
    .line 85
    iget-byte v5, p0, Lax/Z4/h;->u0:B

    .line 86
    .line 87
    aput-byte v5, v1, v3

    .line 88
    .line 89
    iget v1, p0, Lax/Z4/h;->y0:I

    .line 90
    .line 91
    if-gt v0, v1, :cond_68

    .line 92
    .line 93
    add-int/2addr v4, v0

    .line 94
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 95
    .line 96
    if-le v4, v1, :cond_64

    .line 97
    .line 98
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 99
    .line 100
    .line 101
    :cond_64
    invoke-direct {p0, p1, v2, v0}, Lax/Z4/h;->m1(Ljava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_6b

    .line 105
    :cond_68
    invoke-direct {p0, p1, v2, v0}, Lax/Z4/h;->s1(Ljava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    :goto_6b
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 109
    .line 110
    iget v0, p0, Lax/Z4/h;->x0:I

    .line 111
    .line 112
    if-lt p1, v0, :cond_74

    .line 113
    .line 114
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 115
    .line 116
    .line 117
    :cond_74
    iget-object p1, p0, Lax/Z4/h;->v0:[B

    .line 118
    .line 119
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 120
    .line 121
    add-int/lit8 v1, v0, 0x1

    .line 122
    .line 123
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 124
    .line 125
    iget-byte v1, p0, Lax/Z4/h;->u0:B

    .line 126
    .line 127
    aput-byte v1, p1, v0

    .line 128
    .line 129
    return-void
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

.method public final o0()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "start an object"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/Z4/f;->l()Lax/Z4/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 13
    .line 14
    iget-object v0, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 15
    .line 16
    if-eqz v0, :cond_15

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lax/T4/o;->g(Lax/T4/g;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 23
    .line 24
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 32
    .line 33
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    const/16 v2, 0x7b

    .line 40
    .line 41
    aput-byte v2, v0, v1

    .line 42
    .line 43
    return-void
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

.method public p()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "write a null"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/Z4/h;->h1()V

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
.end method

.method public q(D)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/U4/a;->h0:Z

    .line 2
    .line 3
    if-nez v0, :cond_28

    .line 4
    .line 5
    invoke-static {p1, p2}, Lax/W4/k;->o(D)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_15

    .line 10
    .line 11
    sget-object v0, Lax/T4/g$a;->h0:Lax/T4/g$a;

    .line 12
    .line 13
    iget v1, p0, Lax/U4/a;->g0:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/T4/g$a;->j(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    goto :goto_28

    .line 22
    :cond_15
    const-string v0, "write a number"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lax/T4/g$a;->n0:Lax/T4/g$a;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p1, p2, v0}, Lax/W4/k;->t(DZ)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lax/Z4/h;->H(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    :goto_28
    sget-object v0, Lax/T4/g$a;->n0:Lax/T4/g$a;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p1, p2, v0}, Lax/W4/k;->t(DZ)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Lax/Z4/h;->s0(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public s0(Ljava/lang/String;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "write a string"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_b

    .line 7
    .line 8
    invoke-direct {p0}, Lax/Z4/h;->h1()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lax/Z4/h;->y0:I

    .line 17
    .line 18
    if-le v0, v1, :cond_18

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1, v0}, Lax/Z4/h;->t1(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 26
    .line 27
    add-int/2addr v1, v0

    .line 28
    iget v2, p0, Lax/Z4/h;->x0:I

    .line 29
    .line 30
    if-lt v1, v2, :cond_22

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v1, p0, Lax/Z4/h;->v0:[B

    .line 36
    .line 37
    iget v2, p0, Lax/Z4/h;->w0:I

    .line 38
    .line 39
    add-int/lit8 v3, v2, 0x1

    .line 40
    .line 41
    iput v3, p0, Lax/Z4/h;->w0:I

    .line 42
    .line 43
    iget-byte v3, p0, Lax/Z4/h;->u0:B

    .line 44
    .line 45
    aput-byte v3, v1, v2

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p0, p1, v1, v0}, Lax/Z4/h;->m1(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    iget p1, p0, Lax/Z4/h;->w0:I

    .line 52
    .line 53
    iget v0, p0, Lax/Z4/h;->x0:I

    .line 54
    .line 55
    if-lt p1, v0, :cond_3b

    .line 56
    .line 57
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 58
    .line 59
    .line 60
    :cond_3b
    iget-object p1, p0, Lax/Z4/h;->v0:[B

    .line 61
    .line 62
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 63
    .line 64
    add-int/lit8 v1, v0, 0x1

    .line 65
    .line 66
    iput v1, p0, Lax/Z4/h;->w0:I

    .line 67
    .line 68
    iget-byte v1, p0, Lax/Z4/h;->u0:B

    .line 69
    .line 70
    aput-byte v1, p1, v0

    .line 71
    .line 72
    return-void
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

.method public u(J)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "write a number"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/h;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/U4/a;->h0:Z

    .line 7
    .line 8
    if-eqz v0, :cond_d

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lax/Z4/h;->j1(J)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget v0, p0, Lax/Z4/h;->w0:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x15

    .line 17
    .line 18
    iget v1, p0, Lax/Z4/h;->x0:I

    .line 19
    .line 20
    if-lt v0, v1, :cond_18

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/Z4/h;->v0:[B

    .line 26
    .line 27
    iget v1, p0, Lax/Z4/h;->w0:I

    .line 28
    .line 29
    invoke-static {p1, p2, v0, v1}, Lax/W4/k;->r(J[BI)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lax/Z4/h;->w0:I

    .line 34
    .line 35
    return-void
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

.method public w1(Ljava/lang/String;II)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lax/U4/a;->C0(Ljava/lang/String;II)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/Z4/h;->z0:[C

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-gt p3, v1, :cond_12

    .line 9
    .line 10
    add-int v1, p2, p3

    .line 11
    .line 12
    invoke-virtual {p1, p2, v1, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v2, p3}, Lax/Z4/h;->L([CII)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget v3, p0, Lax/Z4/h;->x0:I

    .line 20
    .line 21
    shr-int/lit8 v4, v3, 0x2

    .line 22
    .line 23
    shr-int/lit8 v3, v3, 0x4

    .line 24
    .line 25
    add-int/2addr v4, v3

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    mul-int/lit8 v3, v1, 0x3

    .line 31
    .line 32
    :goto_1f
    if-lez p3, :cond_4d

    .line 33
    .line 34
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-int v5, p2, v4

    .line 39
    .line 40
    invoke-virtual {p1, p2, v5, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 41
    .line 42
    .line 43
    iget v5, p0, Lax/Z4/h;->w0:I

    .line 44
    .line 45
    add-int/2addr v5, v3

    .line 46
    iget v6, p0, Lax/Z4/h;->x0:I

    .line 47
    .line 48
    if-le v5, v6, :cond_34

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/Z4/h;->Z0()V

    .line 51
    .line 52
    .line 53
    :cond_34
    const/4 v5, 0x1

    .line 54
    if-le v4, v5, :cond_47

    .line 55
    .line 56
    add-int/lit8 v5, v4, -0x1

    .line 57
    .line 58
    aget-char v5, v0, v5

    .line 59
    .line 60
    const v6, 0xd800

    .line 61
    .line 62
    .line 63
    if-lt v5, v6, :cond_47

    .line 64
    .line 65
    const v6, 0xdbff

    .line 66
    .line 67
    .line 68
    if-gt v5, v6, :cond_47

    .line 69
    .line 70
    add-int/lit8 v4, v4, -0x1

    .line 71
    .line 72
    :cond_47
    invoke-direct {p0, v0, v2, v4}, Lax/Z4/h;->k1([CII)V

    .line 73
    .line 74
    .line 75
    add-int/2addr p2, v4

    .line 76
    sub-int/2addr p3, v4

    .line 77
    goto :goto_1f

    .line 78
    :cond_4d
    return-void
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
