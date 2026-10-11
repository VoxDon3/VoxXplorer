.class Lax/i5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/nio/ByteBuffer;

.field private b:Lax/i5/k;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/nio/ByteBuffer;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 4
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 5
    invoke-static {p1}, Lax/i5/k;->c(Ljava/nio/ByteBuffer;)Lax/i5/k;

    move-result-object v0

    iput-object v0, p0, Lax/i5/g;->b:Lax/i5/k;

    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-void
.end method

.method static D(Ljava/nio/ByteBuffer;)Lax/i5/g;
    .registers 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_10

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_10
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    new-instance p0, Lax/i5/g;

    .line 21
    .line 22
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Lax/i5/g;-><init>(Ljava/nio/ByteBuffer;)V

    .line 27
    .line 28
    .line 29
    return-object p0
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

.method private I(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/i5/g;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    int-to-byte p1, p1

    .line 9
    const/16 v0, 0xb

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 12
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
    .line 22
.end method

.method private N(II)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    and-int/lit16 v1, p2, 0xff

    .line 4
    .line 5
    int-to-byte v1, v1

    .line 6
    invoke-virtual {v0, p1, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    ushr-int/lit8 p2, p2, 0x8

    .line 14
    .line 15
    and-int/lit16 p2, p2, 0xff

    .line 16
    .line 17
    int-to-byte p2, p2

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    return-void
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

.method private O(IJ)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const-wide/16 v1, 0xff

    .line 4
    .line 5
    and-long v3, p2, v1

    .line 6
    .line 7
    long-to-int v4, v3

    .line 8
    int-to-byte v3, v4

    .line 9
    invoke-virtual {v0, p1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x1

    .line 15
    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    ushr-long v4, p2, v4

    .line 19
    .line 20
    and-long/2addr v4, v1

    .line 21
    long-to-int v5, v4

    .line 22
    int-to-byte v4, v5

    .line 23
    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    add-int/lit8 v3, p1, 0x2

    .line 29
    .line 30
    const/16 v4, 0x10

    .line 31
    .line 32
    ushr-long v4, p2, v4

    .line 33
    .line 34
    and-long/2addr v4, v1

    .line 35
    long-to-int v5, v4

    .line 36
    int-to-byte v4, v5

    .line 37
    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x3

    .line 43
    .line 44
    const/16 v3, 0x18

    .line 45
    .line 46
    ushr-long/2addr p2, v3

    .line 47
    and-long/2addr p2, v1

    .line 48
    long-to-int p3, p2

    .line 49
    int-to-byte p2, p3

    .line 50
    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
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

.method static a(Ljava/lang/String;IBIZ)Lax/i5/g;
    .registers 11

    .line 1
    new-instance v0, Lax/i5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/i5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p4, :cond_33

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sub-int/2addr v3, p1

    .line 16
    if-ge v3, v1, :cond_33

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {v4, p0, p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    :goto_21
    rsub-int/lit8 p1, v3, 0xd

    .line 35
    .line 36
    if-ge p0, p1, :cond_2e

    .line 37
    .line 38
    const p1, 0xffff

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    add-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    goto :goto_21

    .line 47
    :cond_2e
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/4 p1, 0x0

    .line 52
    :cond_33
    const/16 v3, 0x20

    .line 53
    .line 54
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    if-eqz p4, :cond_42

    .line 64
    .line 65
    add-int/lit8 p3, p3, 0x40

    .line 66
    .line 67
    :cond_42
    int-to-byte p3, p3

    .line 68
    invoke-virtual {v3, v2, p3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    int-to-short p3, p3

    .line 76
    const/4 p4, 0x1

    .line 77
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    add-int/lit8 p3, p1, 0x1

    .line 81
    .line 82
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    int-to-short p3, p3

    .line 87
    const/4 p4, 0x3

    .line 88
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    add-int/lit8 p3, p1, 0x2

    .line 92
    .line 93
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    int-to-short p3, p3

    .line 98
    const/4 p4, 0x5

    .line 99
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    .line 102
    add-int/lit8 p3, p1, 0x3

    .line 103
    .line 104
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    int-to-short p3, p3

    .line 109
    const/4 p4, 0x7

    .line 110
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    add-int/lit8 p3, p1, 0x4

    .line 114
    .line 115
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    int-to-short p3, p3

    .line 120
    const/16 p4, 0x9

    .line 121
    .line 122
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    const/16 p3, 0xf

    .line 126
    .line 127
    const/16 p4, 0xb

    .line 128
    .line 129
    invoke-virtual {v3, p4, p3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    const/16 p3, 0xc

    .line 133
    .line 134
    invoke-virtual {v3, p3, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v1, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    add-int/lit8 p2, p1, 0x5

    .line 141
    .line 142
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    int-to-short p2, p2

    .line 147
    const/16 p4, 0xe

    .line 148
    .line 149
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    .line 152
    add-int/lit8 p2, p1, 0x6

    .line 153
    .line 154
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    int-to-short p2, p2

    .line 159
    const/16 p4, 0x10

    .line 160
    .line 161
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 162
    .line 163
    .line 164
    add-int/lit8 p2, p1, 0x7

    .line 165
    .line 166
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    int-to-short p2, p2

    .line 171
    const/16 p4, 0x12

    .line 172
    .line 173
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 174
    .line 175
    .line 176
    add-int/lit8 p2, p1, 0x8

    .line 177
    .line 178
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    int-to-short p2, p2

    .line 183
    const/16 p4, 0x14

    .line 184
    .line 185
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    .line 188
    add-int/lit8 p2, p1, 0x9

    .line 189
    .line 190
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    int-to-short p2, p2

    .line 195
    const/16 p4, 0x16

    .line 196
    .line 197
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    .line 200
    add-int/lit8 p2, p1, 0xa

    .line 201
    .line 202
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    int-to-short p2, p2

    .line 207
    const/16 p4, 0x18

    .line 208
    .line 209
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    .line 212
    const/16 p2, 0x1a

    .line 213
    .line 214
    invoke-virtual {v3, p2, v2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 215
    .line 216
    .line 217
    add-int/lit8 p2, p1, 0xb

    .line 218
    .line 219
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    int-to-short p2, p2

    .line 224
    const/16 p4, 0x1c

    .line 225
    .line 226
    invoke-virtual {v3, p4, p2}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 227
    .line 228
    .line 229
    add-int/2addr p1, p3

    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    int-to-short p0, p0

    .line 235
    const/16 p1, 0x1e

    .line 236
    .line 237
    invoke-virtual {v3, p1, p0}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 238
    .line 239
    .line 240
    iput-object v3, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 241
    .line 242
    return-object v0
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

.method static b()Lax/i5/g;
    .registers 3

    .line 1
    new-instance v0, Lax/i5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/i5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Lax/i5/g;->F(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lax/i5/g;->J(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lax/i5/g;->K(J)V

    .line 25
    .line 26
    .line 27
    return-object v0
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

.method static c(Ljava/lang/String;)Lax/i5/g;
    .registers 6

    .line 1
    new-instance v0, Lax/i5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/i5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    const-string v2, "ASCII"

    .line 18
    .line 19
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {v2, v4, v3, v4, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    const/16 p0, 0x8

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lax/i5/g;->I(I)V

    .line 44
    .line 45
    .line 46
    return-object v0
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

.method private static d(II)J
    .registers 5

    .line 1
    invoke-static {}, Lax/h5/d;->b()Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    shr-int/lit8 v1, p0, 0x9

    .line 10
    .line 11
    add-int/lit16 v1, v1, 0x7bc

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 15
    .line 16
    .line 17
    shr-int/lit8 v1, p0, 0x5

    .line 18
    .line 19
    and-int/lit8 v1, v1, 0xf

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 24
    .line 25
    .line 26
    and-int/lit8 p0, p0, 0x1f

    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 30
    .line 31
    .line 32
    shr-int/lit8 p0, p1, 0xb

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 37
    .line 38
    .line 39
    shr-int/lit8 p0, p1, 0x5

    .line 40
    .line 41
    and-int/lit8 p0, p0, 0x3f

    .line 42
    .line 43
    const/16 v1, 0xc

    .line 44
    .line 45
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 46
    .line 47
    .line 48
    and-int/lit8 p0, p1, 0x1f

    .line 49
    .line 50
    mul-int/lit8 p0, p0, 0x2

    .line 51
    .line 52
    const/16 p1, 0xd

    .line 53
    .line 54
    invoke-virtual {v0, p1, p0}, Ljava/util/Calendar;->set(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    return-wide p0
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

.method private static e(J)I
    .registers 4

    .line 1
    invoke-static {}, Lax/h5/d;->b()Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    add-int/lit16 p1, p1, -0x7bc

    .line 18
    .line 19
    shl-int/lit8 p1, p1, 0x9

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v1, p0

    .line 27
    const/4 p0, 0x5

    .line 28
    shl-int/2addr v1, p0

    .line 29
    add-int/2addr p1, v1

    .line 30
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p1, p0

    .line 35
    return p1
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

.method private static f(J)I
    .registers 3

    .line 1
    invoke-static {}, Lax/h5/d;->b()Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 10
    .line 11
    .line 12
    const/16 p0, 0xb

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->get(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    shl-int/lit8 p0, p1, 0xb

    .line 19
    .line 20
    const/16 p1, 0xc

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    shl-int/lit8 p1, p1, 0x5

    .line 27
    .line 28
    add-int/2addr p0, p1

    .line 29
    const/16 p1, 0xd

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    div-int/lit8 p1, p1, 0x2

    .line 36
    .line 37
    add-int/2addr p0, p1

    .line 38
    return p0
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

.method private j()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

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

.method private o(I)I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    iget-object v1, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    and-int/lit16 p1, p1, 0xff

    .line 18
    .line 19
    shl-int/lit8 p1, p1, 0x8

    .line 20
    .line 21
    or-int/2addr p1, v0

    .line 22
    return p1
.end method

.method private p(I)J
    .registers 10

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    iget-object v2, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    add-int/lit8 v3, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    int-to-long v2, v2

    .line 21
    iget-object v4, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    add-int/lit8 v5, p1, 0x2

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    and-int/lit16 v4, v4, 0xff

    .line 30
    .line 31
    int-to-long v4, v4

    .line 32
    iget-object v6, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x3

    .line 35
    .line 36
    invoke-virtual {v6, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    and-int/lit16 p1, p1, 0xff

    .line 41
    .line 42
    int-to-long v6, p1

    .line 43
    const/16 p1, 0x18

    .line 44
    .line 45
    shl-long/2addr v6, p1

    .line 46
    const/16 p1, 0x10

    .line 47
    .line 48
    shl-long/2addr v4, p1

    .line 49
    or-long/2addr v4, v6

    .line 50
    const/16 p1, 0x8

    .line 51
    .line 52
    shl-long/2addr v2, p1

    .line 53
    or-long/2addr v2, v4

    .line 54
    or-long/2addr v0, v2

    .line 55
    return-wide v0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private q(I)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    and-int/lit16 p1, p1, 0xff

    .line 8
    .line 9
    return p1
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

.method private u(I)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/i5/g;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    return p1
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
.method A()Z
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lax/i5/g;->u(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
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

.method B()Z
    .registers 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->u(I)Z

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

.method C()Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/i5/g;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-direct {p0}, Lax/i5/g;->j()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v0, v0, 0x18

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    if-ne v0, v2, :cond_14

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_14
    return v1
.end method

.method E(Ljava/nio/ByteBuffer;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 8
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

.method F(J)V
    .registers 5

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {p1, p2}, Lax/i5/g;->e(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v0, v1}, Lax/i5/g;->N(II)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0xe

    .line 11
    .line 12
    invoke-static {p1, p2}, Lax/i5/g;->f(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p0, v0, p1}, Lax/i5/g;->N(II)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method G()V
    .registers 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->I(I)V

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

.method H(J)V
    .registers 4

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lax/i5/g;->O(IJ)V

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

.method J(J)V
    .registers 4

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-static {p1, p2}, Lax/i5/g;->e(J)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-direct {p0, v0, p1}, Lax/i5/g;->N(II)V

    .line 8
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

.method K(J)V
    .registers 5

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-static {p1, p2}, Lax/i5/g;->e(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v0, v1}, Lax/i5/g;->N(II)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x16

    .line 11
    .line 12
    invoke-static {p1, p2}, Lax/i5/g;->f(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p0, v0, p1}, Lax/i5/g;->N(II)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method L(Lax/i5/k;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/i5/g;->b:Lax/i5/k;

    .line 2
    .line 3
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lax/i5/k;->d(Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 11
    .line 12
    .line 13
    return-void
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

.method M(J)V
    .registers 7

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    const-wide/32 v2, 0xffff

    .line 6
    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    long-to-int v1, v0

    .line 10
    const/16 v0, 0x14

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, Lax/i5/g;->N(II)V

    .line 13
    .line 14
    .line 15
    and-long/2addr p1, v2

    .line 16
    long-to-int p2, p1

    .line 17
    const/16 p1, 0x1a

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, Lax/i5/g;->N(II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method g(Ljava/lang/StringBuilder;)V
    .registers 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-char v1, v1

    .line 11
    iget-object v3, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-char v3, v3

    .line 19
    iget-object v5, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    const/4 v6, 0x5

    .line 22
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    int-to-char v5, v5

    .line 27
    iget-object v7, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    const/4 v8, 0x7

    .line 30
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    int-to-char v7, v7

    .line 35
    iget-object v9, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    const/16 v10, 0x9

    .line 38
    .line 39
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    int-to-char v9, v9

    .line 44
    iget-object v11, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    const/16 v12, 0xe

    .line 47
    .line 48
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    int-to-char v11, v11

    .line 53
    iget-object v12, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    const/16 v13, 0x10

    .line 56
    .line 57
    invoke-virtual {v12, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    int-to-char v12, v12

    .line 62
    iget-object v13, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    const/16 v14, 0x12

    .line 65
    .line 66
    invoke-virtual {v13, v14}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    int-to-char v13, v13

    .line 71
    iget-object v14, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    const/16 v15, 0x14

    .line 74
    .line 75
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    int-to-char v14, v14

    .line 80
    iget-object v15, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    const/16 v16, 0x1

    .line 83
    .line 84
    const/16 v2, 0x16

    .line 85
    .line 86
    invoke-virtual {v15, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    int-to-char v2, v2

    .line 91
    iget-object v15, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    const/16 v17, 0x3

    .line 94
    .line 95
    const/16 v4, 0x18

    .line 96
    .line 97
    invoke-virtual {v15, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    int-to-char v4, v4

    .line 102
    iget-object v15, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    const/16 v18, 0x5

    .line 105
    .line 106
    const/16 v6, 0x1c

    .line 107
    .line 108
    invoke-virtual {v15, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    int-to-char v6, v6

    .line 113
    iget-object v15, v0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    const/16 v19, 0x7

    .line 116
    .line 117
    const/16 v8, 0x1e

    .line 118
    .line 119
    invoke-virtual {v15, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    int-to-char v8, v8

    .line 124
    const/16 v15, 0xd

    .line 125
    .line 126
    const/16 v20, 0x9

    .line 127
    .line 128
    new-array v10, v15, [C

    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    aput-char v1, v10, v15

    .line 132
    .line 133
    aput-char v3, v10, v16

    .line 134
    .line 135
    const/4 v1, 0x2

    .line 136
    aput-char v5, v10, v1

    .line 137
    .line 138
    aput-char v7, v10, v17

    .line 139
    .line 140
    const/4 v1, 0x4

    .line 141
    aput-char v9, v10, v1

    .line 142
    .line 143
    aput-char v11, v10, v18

    .line 144
    .line 145
    const/4 v1, 0x6

    .line 146
    aput-char v12, v10, v1

    .line 147
    .line 148
    aput-char v13, v10, v19

    .line 149
    .line 150
    const/16 v1, 0x8

    .line 151
    .line 152
    aput-char v14, v10, v1

    .line 153
    .line 154
    aput-char v2, v10, v20

    .line 155
    .line 156
    const/16 v1, 0xa

    .line 157
    .line 158
    aput-char v4, v10, v1

    .line 159
    .line 160
    const/16 v1, 0xb

    .line 161
    .line 162
    aput-char v6, v10, v1

    .line 163
    .line 164
    const/16 v1, 0xc

    .line 165
    .line 166
    aput-char v8, v10, v1

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    const/16 v2, 0xd

    .line 170
    .line 171
    :goto_aa
    if-ge v1, v2, :cond_b3

    .line 172
    .line 173
    aget-char v3, v10, v1

    .line 174
    .line 175
    if-eqz v3, :cond_b3

    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_aa

    .line 180
    :cond_b3
    move-object/from16 v2, p1

    .line 181
    .line 182
    invoke-virtual {v2, v10, v15, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    return-void
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

.method h()J
    .registers 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->o(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lax/i5/g;->o(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Lax/i5/g;->d(II)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method i()J
    .registers 3

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->p(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method k()J
    .registers 3

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->o(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lax/i5/g;->d(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method l()J
    .registers 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->o(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lax/i5/g;->o(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Lax/i5/g;->d(II)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method m()Lax/i5/k;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_b

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_b
    iget-object v0, p0, Lax/i5/g;->b:Lax/i5/k;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method n()J
    .registers 5

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/i5/g;->o(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    invoke-direct {p0, v2}, Lax/i5/g;->o(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v3, 0x10

    .line 15
    .line 16
    shl-long/2addr v0, v3

    .line 17
    int-to-long v2, v2

    .line 18
    or-long/2addr v0, v2

    .line 19
    return-wide v0
    .line 20
    .line 21
.end method

.method r()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_6
    const/16 v2, 0xb

    .line 8
    .line 9
    if-ge v1, v2, :cond_1a

    .line 10
    .line 11
    iget-object v2, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_13

    .line 18
    .line 19
    goto :goto_1a

    .line 20
    :cond_13
    int-to-char v2, v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_6

    .line 27
    :cond_1a
    :goto_1a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
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

.method s()Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lax/i5/g;->q(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0xe5

    .line 7
    .line 8
    if-ne v1, v2, :cond_a

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_a
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

.method t()Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/i5/g;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v0, v0, 0x18

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    if-ne v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[FatDirectoryEntry shortName="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/i5/g;->b:Lax/i5/k;

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/i5/k;->b()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "]"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
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

.method v()Z
    .registers 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lax/i5/g;->u(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
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

.method w()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/i5/g;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/i5/g;->B()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1a

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/i5/g;->x()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1a

    .line 18
    .line 19
    invoke-virtual {p0}, Lax/i5/g;->A()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1a

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1a
    const/4 v0, 0x0

    .line 28
    return v0
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

.method x()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/i5/g;->u(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
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

.method y()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit8 v0, v0, 0x10

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method z()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i5/g;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
