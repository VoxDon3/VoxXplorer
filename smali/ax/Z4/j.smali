.class public Lax/Z4/j;
.super Lax/Z4/c;
.source "SourceFile"


# static fields
.field protected static final C0:[C

.field protected static final D0:[C


# instance fields
.field protected A0:Lax/T4/p;

.field protected B0:[C

.field protected final t0:Ljava/io/Writer;

.field protected u0:C

.field protected v0:[C

.field protected w0:I

.field protected x0:I

.field protected y0:I

.field protected z0:[C


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lax/W4/c;->d(Z)[C

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lax/Z4/j;->C0:[C

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lax/W4/c;->d(Z)[C

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lax/Z4/j;->D0:[C

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Lax/W4/e;ILax/T4/n;Ljava/io/Writer;C)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/Z4/c;-><init>(Lax/W4/e;ILax/T4/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 5
    .line 6
    invoke-virtual {p1}, Lax/W4/e;->d()[C

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lax/Z4/j;->v0:[C

    .line 11
    .line 12
    array-length p1, p1

    .line 13
    iput p1, p0, Lax/Z4/j;->y0:I

    .line 14
    .line 15
    iput-char p5, p0, Lax/Z4/j;->u0:C

    .line 16
    .line 17
    const/16 p1, 0x22

    .line 18
    .line 19
    if-eq p5, p1, :cond_1a

    .line 20
    .line 21
    invoke-static {p5}, Lax/W4/c;->f(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lax/Z4/c;->m0:[I

    .line 26
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

.method private Z0()[C
    .registers 6

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x5c

    .line 7
    .line 8
    aput-char v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    aput-char v2, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    const/16 v3, 0x75

    .line 15
    .line 16
    aput-char v3, v0, v1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    const/16 v4, 0x30

    .line 20
    .line 21
    aput-char v4, v0, v1

    .line 22
    .line 23
    const/4 v1, 0x5

    .line 24
    aput-char v4, v0, v1

    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    aput-char v2, v0, v1

    .line 29
    .line 30
    const/16 v1, 0x9

    .line 31
    .line 32
    aput-char v3, v0, v1

    .line 33
    .line 34
    iput-object v0, p0, Lax/Z4/j;->z0:[C

    .line 35
    .line 36
    return-object v0
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

.method private b1([CIICI)I
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0x5c

    .line 4
    .line 5
    if-ltz p5, :cond_26

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    if-le p2, p4, :cond_15

    .line 9
    .line 10
    if-ge p2, p3, :cond_15

    .line 11
    .line 12
    add-int/lit8 p3, p2, -0x2

    .line 13
    .line 14
    aput-char v2, p1, p3

    .line 15
    .line 16
    add-int/lit8 p2, p2, -0x1

    .line 17
    .line 18
    int-to-char p4, p5

    .line 19
    aput-char p4, p1, p2

    .line 20
    .line 21
    return p3

    .line 22
    :cond_15
    iget-object p1, p0, Lax/Z4/j;->z0:[C

    .line 23
    .line 24
    if-nez p1, :cond_1d

    .line 25
    .line 26
    invoke-direct {p0}, Lax/Z4/j;->Z0()[C

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_1d
    int-to-char p3, p5

    .line 31
    aput-char p3, p1, p4

    .line 32
    .line 33
    iget-object p3, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 34
    .line 35
    invoke-virtual {p3, p1, v1, v0}, Ljava/io/Writer;->write([CII)V

    .line 36
    .line 37
    .line 38
    return p2

    .line 39
    :cond_26
    const/4 v3, -0x2

    .line 40
    if-eq p5, v3, :cond_c3

    .line 41
    .line 42
    invoke-direct {p0}, Lax/Z4/j;->p1()[C

    .line 43
    .line 44
    .line 45
    move-result-object p5

    .line 46
    const/4 v1, 0x5

    .line 47
    const/16 v4, 0xff

    .line 48
    .line 49
    if-le p2, v1, :cond_73

    .line 50
    .line 51
    if-ge p2, p3, :cond_73

    .line 52
    .line 53
    add-int/lit8 p3, p2, -0x6

    .line 54
    .line 55
    add-int/lit8 v0, p2, -0x5

    .line 56
    .line 57
    aput-char v2, p1, p3

    .line 58
    .line 59
    add-int/lit8 p3, p2, -0x4

    .line 60
    .line 61
    const/16 v1, 0x75

    .line 62
    .line 63
    aput-char v1, p1, v0

    .line 64
    .line 65
    if-le p4, v4, :cond_59

    .line 66
    .line 67
    shr-int/lit8 v0, p4, 0x8

    .line 68
    .line 69
    and-int/lit16 v1, v0, 0xff

    .line 70
    .line 71
    add-int/lit8 v2, p2, -0x3

    .line 72
    .line 73
    shr-int/lit8 v1, v1, 0x4

    .line 74
    .line 75
    aget-char v1, p5, v1

    .line 76
    .line 77
    aput-char v1, p1, p3

    .line 78
    .line 79
    add-int/2addr p2, v3

    .line 80
    and-int/lit8 p3, v0, 0xf

    .line 81
    .line 82
    aget-char p3, p5, p3

    .line 83
    .line 84
    aput-char p3, p1, v2

    .line 85
    .line 86
    and-int/lit16 p3, p4, 0xff

    .line 87
    .line 88
    int-to-char p4, p3

    .line 89
    goto :goto_62

    .line 90
    :cond_59
    add-int/lit8 v0, p2, -0x3

    .line 91
    .line 92
    const/16 v1, 0x30

    .line 93
    .line 94
    aput-char v1, p1, p3

    .line 95
    .line 96
    add-int/2addr p2, v3

    .line 97
    aput-char v1, p1, v0

    .line 98
    .line 99
    :goto_62
    add-int/lit8 p3, p2, 0x1

    .line 100
    .line 101
    shr-int/lit8 v0, p4, 0x4

    .line 102
    .line 103
    aget-char v0, p5, v0

    .line 104
    .line 105
    aput-char v0, p1, p2

    .line 106
    .line 107
    and-int/lit8 p4, p4, 0xf

    .line 108
    .line 109
    aget-char p4, p5, p4

    .line 110
    .line 111
    aput-char p4, p1, p3

    .line 112
    .line 113
    add-int/lit8 p2, p2, -0x4

    .line 114
    .line 115
    return p2

    .line 116
    :cond_73
    iget-object p1, p0, Lax/Z4/j;->z0:[C

    .line 117
    .line 118
    if-nez p1, :cond_7b

    .line 119
    .line 120
    invoke-direct {p0}, Lax/Z4/j;->Z0()[C

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :cond_7b
    iget p3, p0, Lax/Z4/j;->x0:I

    .line 125
    .line 126
    iput p3, p0, Lax/Z4/j;->w0:I

    .line 127
    .line 128
    const/4 p3, 0x6

    .line 129
    if-le p4, v4, :cond_b0

    .line 130
    .line 131
    shr-int/lit8 v0, p4, 0x8

    .line 132
    .line 133
    and-int/lit16 v1, v0, 0xff

    .line 134
    .line 135
    and-int/lit16 v2, p4, 0xff

    .line 136
    .line 137
    shr-int/lit8 v1, v1, 0x4

    .line 138
    .line 139
    aget-char v1, p5, v1

    .line 140
    .line 141
    const/16 v3, 0xa

    .line 142
    .line 143
    aput-char v1, p1, v3

    .line 144
    .line 145
    and-int/lit8 v0, v0, 0xf

    .line 146
    .line 147
    aget-char v0, p5, v0

    .line 148
    .line 149
    const/16 v1, 0xb

    .line 150
    .line 151
    aput-char v0, p1, v1

    .line 152
    .line 153
    shr-int/lit8 v0, v2, 0x4

    .line 154
    .line 155
    aget-char v0, p5, v0

    .line 156
    .line 157
    const/16 v1, 0xc

    .line 158
    .line 159
    aput-char v0, p1, v1

    .line 160
    .line 161
    and-int/lit8 p4, p4, 0xf

    .line 162
    .line 163
    aget-char p4, p5, p4

    .line 164
    .line 165
    const/16 p5, 0xd

    .line 166
    .line 167
    aput-char p4, p1, p5

    .line 168
    .line 169
    iget-object p4, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 170
    .line 171
    const/16 p5, 0x8

    .line 172
    .line 173
    invoke-virtual {p4, p1, p5, p3}, Ljava/io/Writer;->write([CII)V

    .line 174
    .line 175
    .line 176
    return p2

    .line 177
    :cond_b0
    shr-int/lit8 v1, p4, 0x4

    .line 178
    .line 179
    aget-char v1, p5, v1

    .line 180
    .line 181
    aput-char v1, p1, p3

    .line 182
    .line 183
    and-int/lit8 p4, p4, 0xf

    .line 184
    .line 185
    aget-char p4, p5, p4

    .line 186
    .line 187
    const/4 p5, 0x7

    .line 188
    aput-char p4, p1, p5

    .line 189
    .line 190
    iget-object p4, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 191
    .line 192
    invoke-virtual {p4, p1, v0, p3}, Ljava/io/Writer;->write([CII)V

    .line 193
    .line 194
    .line 195
    return p2

    .line 196
    :cond_c3
    iget-object p4, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 197
    .line 198
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object p4, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 202
    .line 203
    invoke-interface {p4}, Lax/T4/p;->getValue()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p4

    .line 207
    const/4 p5, 0x0

    .line 208
    iput-object p5, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 209
    .line 210
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result p5

    .line 214
    if-lt p2, p5, :cond_de

    .line 215
    .line 216
    if-ge p2, p3, :cond_de

    .line 217
    .line 218
    sub-int/2addr p2, p5

    .line 219
    invoke-virtual {p4, v1, p5, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 220
    .line 221
    .line 222
    return p2

    .line 223
    :cond_de
    iget-object p1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 224
    .line 225
    invoke-virtual {p1, p4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return p2
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

.method private c1(CI)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x5c

    .line 3
    .line 4
    const/4 v2, 0x2

    .line 5
    if-ltz p2, :cond_2d

    .line 6
    .line 7
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-lt p1, v2, :cond_18

    .line 11
    .line 12
    add-int/lit8 v0, p1, -0x2

    .line 13
    .line 14
    iput v0, p0, Lax/Z4/j;->w0:I

    .line 15
    .line 16
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 17
    .line 18
    sub-int/2addr p1, v3

    .line 19
    aput-char v1, v2, v0

    .line 20
    .line 21
    int-to-char p2, p2

    .line 22
    aput-char p2, v2, p1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object p1, p0, Lax/Z4/j;->z0:[C

    .line 26
    .line 27
    if-nez p1, :cond_20

    .line 28
    .line 29
    invoke-direct {p0}, Lax/Z4/j;->Z0()[C

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_20
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 34
    .line 35
    iput v1, p0, Lax/Z4/j;->w0:I

    .line 36
    .line 37
    int-to-char p2, p2

    .line 38
    aput-char p2, p1, v3

    .line 39
    .line 40
    iget-object p2, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 41
    .line 42
    invoke-virtual {p2, p1, v0, v2}, Ljava/io/Writer;->write([CII)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    const/4 v3, -0x2

    .line 47
    if-eq p2, v3, :cond_cc

    .line 48
    .line 49
    invoke-direct {p0}, Lax/Z4/j;->p1()[C

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 54
    .line 55
    const/4 v3, 0x6

    .line 56
    const/16 v4, 0xff

    .line 57
    .line 58
    if-lt v0, v3, :cond_7d

    .line 59
    .line 60
    iget-object v3, p0, Lax/Z4/j;->v0:[C

    .line 61
    .line 62
    add-int/lit8 v5, v0, -0x6

    .line 63
    .line 64
    iput v5, p0, Lax/Z4/j;->w0:I

    .line 65
    .line 66
    aput-char v1, v3, v5

    .line 67
    .line 68
    add-int/lit8 v1, v0, -0x5

    .line 69
    .line 70
    const/16 v5, 0x75

    .line 71
    .line 72
    aput-char v5, v3, v1

    .line 73
    .line 74
    if-le p1, v4, :cond_63

    .line 75
    .line 76
    shr-int/lit8 v1, p1, 0x8

    .line 77
    .line 78
    and-int/lit16 v4, v1, 0xff

    .line 79
    .line 80
    add-int/lit8 v5, v0, -0x4

    .line 81
    .line 82
    shr-int/lit8 v4, v4, 0x4

    .line 83
    .line 84
    aget-char v4, p2, v4

    .line 85
    .line 86
    aput-char v4, v3, v5

    .line 87
    .line 88
    add-int/lit8 v0, v0, -0x3

    .line 89
    .line 90
    and-int/lit8 v1, v1, 0xf

    .line 91
    .line 92
    aget-char v1, p2, v1

    .line 93
    .line 94
    aput-char v1, v3, v0

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    int-to-char p1, p1

    .line 99
    goto :goto_6d

    .line 100
    :cond_63
    add-int/lit8 v1, v0, -0x4

    .line 101
    .line 102
    const/16 v4, 0x30

    .line 103
    .line 104
    aput-char v4, v3, v1

    .line 105
    .line 106
    add-int/lit8 v0, v0, -0x3

    .line 107
    .line 108
    aput-char v4, v3, v0

    .line 109
    .line 110
    :goto_6d
    add-int/lit8 v1, v0, 0x1

    .line 111
    .line 112
    shr-int/lit8 v4, p1, 0x4

    .line 113
    .line 114
    aget-char v4, p2, v4

    .line 115
    .line 116
    aput-char v4, v3, v1

    .line 117
    .line 118
    add-int/2addr v0, v2

    .line 119
    and-int/lit8 p1, p1, 0xf

    .line 120
    .line 121
    aget-char p1, p2, p1

    .line 122
    .line 123
    aput-char p1, v3, v0

    .line 124
    .line 125
    return-void

    .line 126
    :cond_7d
    iget-object v0, p0, Lax/Z4/j;->z0:[C

    .line 127
    .line 128
    if-nez v0, :cond_85

    .line 129
    .line 130
    invoke-direct {p0}, Lax/Z4/j;->Z0()[C

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_85
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 135
    .line 136
    iput v1, p0, Lax/Z4/j;->w0:I

    .line 137
    .line 138
    if-le p1, v4, :cond_b9

    .line 139
    .line 140
    shr-int/lit8 v1, p1, 0x8

    .line 141
    .line 142
    and-int/lit16 v2, v1, 0xff

    .line 143
    .line 144
    and-int/lit16 v4, p1, 0xff

    .line 145
    .line 146
    shr-int/lit8 v2, v2, 0x4

    .line 147
    .line 148
    aget-char v2, p2, v2

    .line 149
    .line 150
    const/16 v5, 0xa

    .line 151
    .line 152
    aput-char v2, v0, v5

    .line 153
    .line 154
    and-int/lit8 v1, v1, 0xf

    .line 155
    .line 156
    aget-char v1, p2, v1

    .line 157
    .line 158
    const/16 v2, 0xb

    .line 159
    .line 160
    aput-char v1, v0, v2

    .line 161
    .line 162
    shr-int/lit8 v1, v4, 0x4

    .line 163
    .line 164
    aget-char v1, p2, v1

    .line 165
    .line 166
    const/16 v2, 0xc

    .line 167
    .line 168
    aput-char v1, v0, v2

    .line 169
    .line 170
    and-int/lit8 p1, p1, 0xf

    .line 171
    .line 172
    aget-char p1, p2, p1

    .line 173
    .line 174
    const/16 p2, 0xd

    .line 175
    .line 176
    aput-char p1, v0, p2

    .line 177
    .line 178
    iget-object p1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 179
    .line 180
    const/16 p2, 0x8

    .line 181
    .line 182
    invoke-virtual {p1, v0, p2, v3}, Ljava/io/Writer;->write([CII)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_b9
    shr-int/lit8 v1, p1, 0x4

    .line 187
    .line 188
    aget-char v1, p2, v1

    .line 189
    .line 190
    aput-char v1, v0, v3

    .line 191
    .line 192
    and-int/lit8 p1, p1, 0xf

    .line 193
    .line 194
    aget-char p1, p2, p1

    .line 195
    .line 196
    const/4 p2, 0x7

    .line 197
    aput-char p1, v0, p2

    .line 198
    .line 199
    iget-object p1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 200
    .line 201
    invoke-virtual {p1, v0, v2, v3}, Ljava/io/Writer;->write([CII)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_cc
    iget-object p1, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 211
    .line 212
    invoke-interface {p1}, Lax/T4/p;->getValue()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const/4 p2, 0x0

    .line 217
    iput-object p2, p0, Lax/Z4/j;->A0:Lax/T4/p;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 224
    .line 225
    if-lt v1, p2, :cond_eb

    .line 226
    .line 227
    sub-int/2addr v1, p2

    .line 228
    iput v1, p0, Lax/Z4/j;->w0:I

    .line 229
    .line 230
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 231
    .line 232
    invoke-virtual {p1, v0, p2, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_eb
    iput v1, p0, Lax/Z4/j;->w0:I

    .line 237
    .line 238
    iget-object p2, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 239
    .line 240
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void
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

.method private g1(Ljava/lang/String;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    iget v3, p0, Lax/Z4/j;->y0:I

    .line 11
    .line 12
    add-int v4, v2, v3

    .line 13
    .line 14
    if-le v4, v0, :cond_11

    .line 15
    .line 16
    sub-int v3, v0, v2

    .line 17
    .line 18
    :cond_11
    add-int v4, v2, v3

    .line 19
    .line 20
    iget-object v5, p0, Lax/Z4/j;->v0:[C

    .line 21
    .line 22
    invoke-virtual {p1, v2, v4, v5, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 23
    .line 24
    .line 25
    iget v2, p0, Lax/Z4/c;->n0:I

    .line 26
    .line 27
    if-eqz v2, :cond_20

    .line 28
    .line 29
    invoke-direct {p0, v3, v2}, Lax/Z4/j;->l1(II)V

    .line 30
    .line 31
    .line 32
    goto :goto_23

    .line 33
    :cond_20
    invoke-direct {p0, v3}, Lax/Z4/j;->k1(I)V

    .line 34
    .line 35
    .line 36
    :goto_23
    if-lt v4, v0, :cond_26

    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    move v2, v4

    .line 40
    goto :goto_9
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

.method private final h1()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 13
    .line 14
    iget-object v1, p0, Lax/Z4/j;->v0:[C

    .line 15
    .line 16
    const/16 v2, 0x6e

    .line 17
    .line 18
    aput-char v2, v1, v0

    .line 19
    .line 20
    add-int/lit8 v2, v0, 0x1

    .line 21
    .line 22
    const/16 v3, 0x75

    .line 23
    .line 24
    aput-char v3, v1, v2

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    const/16 v3, 0x6c

    .line 29
    .line 30
    aput-char v3, v1, v2

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x3

    .line 33
    .line 34
    aput-char v3, v1, v2

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x4

    .line 37
    .line 38
    iput v0, p0, Lax/Z4/j;->x0:I

    .line 39
    .line 40
    return-void
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

.method private j1(J)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 6
    .line 7
    if-lt v0, v1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 13
    .line 14
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 19
    .line 20
    iget-char v3, p0, Lax/Z4/j;->u0:C

    .line 21
    .line 22
    aput-char v3, v0, v1

    .line 23
    .line 24
    invoke-static {p1, p2, v0, v2}, Lax/W4/k;->s(J[CI)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p2, p0, Lax/Z4/j;->v0:[C

    .line 29
    .line 30
    add-int/lit8 v0, p1, 0x1

    .line 31
    .line 32
    iput v0, p0, Lax/Z4/j;->x0:I

    .line 33
    .line 34
    iget-char v0, p0, Lax/Z4/j;->u0:C

    .line 35
    .line 36
    aput-char v0, p2, p1

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

.method private k1(I)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/c;->m0:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_5
    if-ge v2, p1, :cond_30

    .line 7
    .line 8
    :cond_7
    iget-object v4, p0, Lax/Z4/j;->v0:[C

    .line 9
    .line 10
    aget-char v9, v4, v2

    .line 11
    .line 12
    if-ge v9, v1, :cond_12

    .line 13
    .line 14
    aget v5, v0, v9

    .line 15
    .line 16
    if-eqz v5, :cond_12

    .line 17
    .line 18
    goto :goto_16

    .line 19
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    if-lt v2, p1, :cond_7

    .line 22
    .line 23
    :goto_16
    sub-int v5, v2, v3

    .line 24
    .line 25
    if-lez v5, :cond_22

    .line 26
    .line 27
    iget-object v6, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 28
    .line 29
    invoke-virtual {v6, v4, v3, v5}, Ljava/io/Writer;->write([CII)V

    .line 30
    .line 31
    .line 32
    if-lt v2, p1, :cond_22

    .line 33
    .line 34
    goto :goto_30

    .line 35
    :cond_22
    add-int/lit8 v7, v2, 0x1

    .line 36
    .line 37
    iget-object v6, p0, Lax/Z4/j;->v0:[C

    .line 38
    .line 39
    aget v10, v0, v9

    .line 40
    .line 41
    move-object v5, p0

    .line 42
    move v8, p1

    .line 43
    invoke-direct/range {v5 .. v10}, Lax/Z4/j;->b1([CIICI)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    move v2, v7

    .line 48
    goto :goto_5

    .line 49
    :cond_30
    :goto_30
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
.end method

.method private l1(II)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/c;->m0:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v2, p2, 0x1

    .line 5
    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_c
    if-ge v2, p1, :cond_3d

    .line 14
    .line 15
    :cond_e
    iget-object v5, p0, Lax/Z4/j;->v0:[C

    .line 16
    .line 17
    aget-char v10, v5, v2

    .line 18
    .line 19
    if-ge v10, v1, :cond_1a

    .line 20
    .line 21
    aget v4, v0, v10

    .line 22
    .line 23
    if-eqz v4, :cond_1f

    .line 24
    .line 25
    :goto_18
    move v11, v4

    .line 26
    goto :goto_24

    .line 27
    :cond_1a
    if-le v10, p2, :cond_1f

    .line 28
    .line 29
    const/4 v4, -0x1

    .line 30
    const/4 v11, -0x1

    .line 31
    goto :goto_24

    .line 32
    :cond_1f
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    if-lt v2, p1, :cond_e

    .line 35
    .line 36
    goto :goto_18

    .line 37
    :goto_24
    sub-int v4, v2, v3

    .line 38
    .line 39
    if-lez v4, :cond_30

    .line 40
    .line 41
    iget-object v6, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 42
    .line 43
    invoke-virtual {v6, v5, v3, v4}, Ljava/io/Writer;->write([CII)V

    .line 44
    .line 45
    .line 46
    if-lt v2, p1, :cond_30

    .line 47
    .line 48
    goto :goto_3d

    .line 49
    :cond_30
    add-int/lit8 v8, v2, 0x1

    .line 50
    .line 51
    iget-object v7, p0, Lax/Z4/j;->v0:[C

    .line 52
    .line 53
    move-object v6, p0

    .line 54
    move v9, p1

    .line 55
    invoke-direct/range {v6 .. v11}, Lax/Z4/j;->b1([CIICI)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    move v2, v8

    .line 60
    move v4, v11

    .line 61
    goto :goto_c

    .line 62
    :cond_3d
    :goto_3d
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
.end method

.method private m1(Ljava/lang/String;)V
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
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 6
    .line 7
    if-le v0, v1, :cond_c

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lax/Z4/j;->g1(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 14
    .line 15
    add-int/2addr v2, v0

    .line 16
    if-le v2, v1, :cond_14

    .line 17
    .line 18
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object v1, p0, Lax/Z4/j;->v0:[C

    .line 22
    .line 23
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p1, v3, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lax/Z4/c;->n0:I

    .line 30
    .line 31
    if-eqz p1, :cond_24

    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lax/Z4/j;->o1(II)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    invoke-direct {p0, v0}, Lax/Z4/j;->n1(I)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method private n1(I)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget-object p1, p0, Lax/Z4/c;->m0:[I

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    :goto_6
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 8
    .line 9
    if-ge v2, v0, :cond_36

    .line 10
    .line 11
    :cond_a
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 12
    .line 13
    iget v3, p0, Lax/Z4/j;->x0:I

    .line 14
    .line 15
    aget-char v4, v2, v3

    .line 16
    .line 17
    if-ge v4, v1, :cond_30

    .line 18
    .line 19
    aget v4, p1, v4

    .line 20
    .line 21
    if-eqz v4, :cond_30

    .line 22
    .line 23
    iget v4, p0, Lax/Z4/j;->w0:I

    .line 24
    .line 25
    sub-int/2addr v3, v4

    .line 26
    if-lez v3, :cond_20

    .line 27
    .line 28
    iget-object v5, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 29
    .line 30
    invoke-virtual {v5, v2, v4, v3}, Ljava/io/Writer;->write([CII)V

    .line 31
    .line 32
    .line 33
    :cond_20
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 34
    .line 35
    iget v3, p0, Lax/Z4/j;->x0:I

    .line 36
    .line 37
    add-int/lit8 v4, v3, 0x1

    .line 38
    .line 39
    iput v4, p0, Lax/Z4/j;->x0:I

    .line 40
    .line 41
    aget-char v2, v2, v3

    .line 42
    .line 43
    aget v3, p1, v2

    .line 44
    .line 45
    invoke-direct {p0, v2, v3}, Lax/Z4/j;->c1(CI)V

    .line 46
    .line 47
    .line 48
    goto :goto_6

    .line 49
    :cond_30
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, p0, Lax/Z4/j;->x0:I

    .line 52
    .line 53
    if-lt v3, v0, :cond_a

    .line 54
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

.method private o1(II)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget-object p1, p0, Lax/Z4/c;->m0:[I

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    add-int/lit8 v2, p2, 0x1

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_c
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 14
    .line 15
    if-ge v2, v0, :cond_3a

    .line 16
    .line 17
    :cond_10
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 18
    .line 19
    iget v3, p0, Lax/Z4/j;->x0:I

    .line 20
    .line 21
    aget-char v4, v2, v3

    .line 22
    .line 23
    if-ge v4, v1, :cond_1d

    .line 24
    .line 25
    aget v5, p1, v4

    .line 26
    .line 27
    if-eqz v5, :cond_34

    .line 28
    .line 29
    goto :goto_20

    .line 30
    :cond_1d
    if-le v4, p2, :cond_34

    .line 31
    .line 32
    const/4 v5, -0x1

    .line 33
    :goto_20
    iget v6, p0, Lax/Z4/j;->w0:I

    .line 34
    .line 35
    sub-int/2addr v3, v6

    .line 36
    if-lez v3, :cond_2a

    .line 37
    .line 38
    iget-object v7, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 39
    .line 40
    invoke-virtual {v7, v2, v6, v3}, Ljava/io/Writer;->write([CII)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 48
    .line 49
    invoke-direct {p0, v4, v5}, Lax/Z4/j;->c1(CI)V

    .line 50
    .line 51
    .line 52
    goto :goto_c

    .line 53
    :cond_34
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    iput v3, p0, Lax/Z4/j;->x0:I

    .line 56
    .line 57
    if-lt v3, v0, :cond_10

    .line 58
    .line 59
    :cond_3a
    return-void
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

.method private p1()[C
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/Z4/c;->q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    sget-object v0, Lax/Z4/j;->C0:[C

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    sget-object v0, Lax/Z4/j;->D0:[C

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

.method private q1(Ljava/lang/String;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->y0:I

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget-object v2, p0, Lax/Z4/j;->v0:[C

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-virtual {p1, v3, v0, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 13
    .line 14
    add-int/2addr v1, v0

    .line 15
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sub-int/2addr v1, v0

    .line 25
    :goto_18
    iget v2, p0, Lax/Z4/j;->y0:I

    .line 26
    .line 27
    if-le v1, v2, :cond_2d

    .line 28
    .line 29
    add-int v4, v0, v2

    .line 30
    .line 31
    iget-object v5, p0, Lax/Z4/j;->v0:[C

    .line 32
    .line 33
    invoke-virtual {p1, v0, v4, v5, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 34
    .line 35
    .line 36
    iput v3, p0, Lax/Z4/j;->w0:I

    .line 37
    .line 38
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 41
    .line 42
    .line 43
    sub-int/2addr v1, v2

    .line 44
    move v0, v4

    .line 45
    goto :goto_18

    .line 46
    :cond_2d
    add-int v2, v0, v1

    .line 47
    .line 48
    iget-object v4, p0, Lax/Z4/j;->v0:[C

    .line 49
    .line 50
    invoke-virtual {p1, v0, v2, v4, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 51
    .line 52
    .line 53
    iput v3, p0, Lax/Z4/j;->w0:I

    .line 54
    .line 55
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public A(C)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_9

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 11
    .line 12
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 17
    .line 18
    aput-char p1, v0, v1

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public F(Lax/T4/p;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lax/T4/p;->a([CI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_12

    .line 10
    .line 11
    invoke-interface {p1}, Lax/T4/p;->getValue()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lax/Z4/j;->H(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lax/Z4/j;->x0:I

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
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 6
    .line 7
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    if-nez v1, :cond_13

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 16
    .line 17
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    :cond_13
    if-lt v1, v0, :cond_23

    .line 21
    .line 22
    iget-object v1, p0, Lax/Z4/j;->v0:[C

    .line 23
    .line 24
    iget v2, p0, Lax/Z4/j;->x0:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p1, v3, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Lax/Z4/j;->x0:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    invoke-direct {p0, p1}, Lax/Z4/j;->q1(Ljava/lang/String;)V

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

.method public L([CII)V
    .registers 6
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
    const/16 v0, 0x20

    .line 5
    .line 6
    if-ge p3, v0, :cond_1e

    .line 7
    .line 8
    iget v0, p0, Lax/Z4/j;->y0:I

    .line 9
    .line 10
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    if-le p3, v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 19
    .line 20
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 21
    .line 22
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 26
    .line 27
    add-int/2addr p1, p3

    .line 28
    iput p1, p0, Lax/Z4/j;->x0:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

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

.method public W()V
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
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

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
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 23
    .line 24
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 32
    .line 33
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 38
    .line 39
    const/16 v2, 0x5b

    .line 40
    .line 41
    aput-char v2, v0, v1

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

.method protected a1()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 2
    .line 3
    iget v1, p0, Lax/Z4/j;->w0:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    if-lez v0, :cond_13

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lax/Z4/j;->w0:I

    .line 10
    .line 11
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 12
    .line 13
    iget-object v2, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 14
    .line 15
    iget-object v3, p0, Lax/Z4/j;->v0:[C

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1, v0}, Ljava/io/Writer;->write([CII)V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
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
    iget-object v0, p0, Lax/Z4/j;->v0:[C

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
    invoke-virtual {p0}, Lax/Z4/j;->j()V

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
    invoke-virtual {p0}, Lax/Z4/j;->m()V

    .line 39
    .line 40
    .line 41
    goto :goto_f

    .line 42
    :cond_29
    invoke-virtual {p0}, Lax/Z4/j;->a1()V
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
    iput v1, p0, Lax/Z4/j;->w0:I

    .line 48
    .line 49
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 50
    .line 51
    iget-object v1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 52
    .line 53
    if-eqz v1, :cond_65

    .line 54
    .line 55
    :try_start_36
    iget-object v1, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 56
    .line 57
    invoke-virtual {v1}, Lax/W4/e;->l()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_59

    .line 62
    .line 63
    sget-object v1, Lax/T4/g$a;->d0:Lax/T4/g$a;

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_47

    .line 70
    .line 71
    goto :goto_59

    .line 72
    :cond_47
    sget-object v1, Lax/T4/g$a;->f0:Lax/T4/g$a;

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_65

    .line 79
    .line 80
    iget-object v1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/io/Writer;->flush()V

    .line 83
    .line 84
    .line 85
    goto :goto_65

    .line 86
    :catch_55
    move-exception v1

    .line 87
    goto :goto_5f

    .line 88
    :catch_57
    move-exception v1

    .line 89
    goto :goto_5f

    .line 90
    :cond_59
    :goto_59
    iget-object v1, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_5e
    .catch Ljava/io/IOException; {:try_start_36 .. :try_end_5e} :catch_57
    .catch Ljava/lang/RuntimeException; {:try_start_36 .. :try_end_5e} :catch_55

    .line 93
    .line 94
    .line 95
    goto :goto_65

    .line 96
    :goto_5f
    if-eqz v0, :cond_64

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_64
    throw v1

    .line 102
    :cond_65
    :goto_65
    invoke-virtual {p0}, Lax/Z4/j;->d1()V

    .line 103
    .line 104
    .line 105
    if-nez v0, :cond_6b

    .line 106
    .line 107
    return-void

    .line 108
    :cond_6b
    throw v0
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
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iput-object v1, p0, Lax/Z4/j;->v0:[C

    .line 7
    .line 8
    iget-object v2, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Lax/W4/e;->m([C)V

    .line 11
    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/Z4/j;->B0:[C

    .line 14
    .line 15
    if-eqz v0, :cond_17

    .line 16
    .line 17
    iput-object v1, p0, Lax/Z4/j;->B0:[C

    .line 18
    .line 19
    iget-object v1, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lax/W4/e;->n([C)V

    .line 22
    .line 23
    .line 24
    :cond_17
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
    if-eq v0, v1, :cond_2e

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_2b

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
    goto :goto_2a

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
    if-eqz p1, :cond_2a

    .line 35
    .line 36
    invoke-interface {p1}, Lax/T4/p;->getValue()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lax/Z4/j;->H(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    :goto_2a
    return-void

    .line 44
    :cond_2b
    const/16 p1, 0x3a

    .line 45
    .line 46
    goto :goto_30

    .line 47
    :cond_2e
    const/16 p1, 0x2c

    .line 48
    .line 49
    :goto_30
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 50
    .line 51
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 52
    .line 53
    if-lt v0, v1, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 59
    .line 60
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 65
    .line 66
    aput-char p1, v0, v1

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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method protected final f1(Ljava/lang/String;Z)V
    .registers 5
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
    invoke-virtual {p0, p1, p2}, Lax/Z4/j;->i1(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 14
    .line 15
    if-lt v0, v1, :cond_13

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 18
    .line 19
    .line 20
    :cond_13
    if-eqz p2, :cond_21

    .line 21
    .line 22
    iget-object p2, p0, Lax/Z4/j;->v0:[C

    .line 23
    .line 24
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 25
    .line 26
    add-int/lit8 v1, v0, 0x1

    .line 27
    .line 28
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 29
    .line 30
    const/16 v1, 0x2c

    .line 31
    .line 32
    aput-char v1, p2, v0

    .line 33
    .line 34
    :cond_21
    iget-boolean p2, p0, Lax/Z4/c;->p0:Z

    .line 35
    .line 36
    if-eqz p2, :cond_29

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lax/Z4/j;->m1(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    iget-object p2, p0, Lax/Z4/j;->v0:[C

    .line 43
    .line 44
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 45
    .line 46
    add-int/lit8 v1, v0, 0x1

    .line 47
    .line 48
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 49
    .line 50
    iget-char v1, p0, Lax/Z4/j;->u0:C

    .line 51
    .line 52
    aput-char v1, p2, v0

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lax/Z4/j;->m1(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 58
    .line 59
    iget p2, p0, Lax/Z4/j;->y0:I

    .line 60
    .line 61
    if-lt p1, p2, :cond_41

    .line 62
    .line 63
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 64
    .line 65
    .line 66
    :cond_41
    iget-object p1, p0, Lax/Z4/j;->v0:[C

    .line 67
    .line 68
    iget p2, p0, Lax/Z4/j;->x0:I

    .line 69
    .line 70
    add-int/lit8 v0, p2, 0x1

    .line 71
    .line 72
    iput v0, p0, Lax/Z4/j;->x0:I

    .line 73
    .line 74
    iget-char v0, p0, Lax/Z4/j;->u0:C

    .line 75
    .line 76
    aput-char v0, p1, p2

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
.end method

.method public flush()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

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
    iget-object v0, p0, Lax/Z4/j;->t0:Ljava/io/Writer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

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
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x5

    .line 9
    .line 10
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_10

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 18
    .line 19
    iget-object v1, p0, Lax/Z4/j;->v0:[C

    .line 20
    .line 21
    const/16 v2, 0x65

    .line 22
    .line 23
    if-eqz p1, :cond_2d

    .line 24
    .line 25
    const/16 p1, 0x74

    .line 26
    .line 27
    aput-char p1, v1, v0

    .line 28
    .line 29
    add-int/lit8 p1, v0, 0x1

    .line 30
    .line 31
    const/16 v3, 0x72

    .line 32
    .line 33
    aput-char v3, v1, p1

    .line 34
    .line 35
    add-int/lit8 p1, v0, 0x2

    .line 36
    .line 37
    const/16 v3, 0x75

    .line 38
    .line 39
    aput-char v3, v1, p1

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x3

    .line 42
    .line 43
    aput-char v2, v1, v0

    .line 44
    .line 45
    goto :goto_47

    .line 46
    :cond_2d
    const/16 p1, 0x66

    .line 47
    .line 48
    aput-char p1, v1, v0

    .line 49
    .line 50
    add-int/lit8 p1, v0, 0x1

    .line 51
    .line 52
    const/16 v3, 0x61

    .line 53
    .line 54
    aput-char v3, v1, p1

    .line 55
    .line 56
    add-int/lit8 p1, v0, 0x2

    .line 57
    .line 58
    const/16 v3, 0x6c

    .line 59
    .line 60
    aput-char v3, v1, p1

    .line 61
    .line 62
    add-int/lit8 p1, v0, 0x3

    .line 63
    .line 64
    const/16 v3, 0x73

    .line 65
    .line 66
    aput-char v3, v1, p1

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x4

    .line 69
    .line 70
    aput-char v2, v1, v0

    .line 71
    .line 72
    :goto_47
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    iput v0, p0, Lax/Z4/j;->x0:I

    .line 75
    .line 76
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method protected final i1(Ljava/lang/String;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    iget-object p2, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 4
    .line 5
    invoke-interface {p2, p0}, Lax/T4/o;->h(Lax/T4/g;)V

    .line 6
    .line 7
    .line 8
    goto :goto_d

    .line 9
    :cond_8
    iget-object p2, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 10
    .line 11
    invoke-interface {p2, p0}, Lax/T4/o;->a(Lax/T4/g;)V

    .line 12
    .line 13
    .line 14
    :goto_d
    iget-boolean p2, p0, Lax/Z4/c;->p0:Z

    .line 15
    .line 16
    if-eqz p2, :cond_15

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lax/Z4/j;->m1(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_15
    iget p2, p0, Lax/Z4/j;->x0:I

    .line 23
    .line 24
    iget v0, p0, Lax/Z4/j;->y0:I

    .line 25
    .line 26
    if-lt p2, v0, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object p2, p0, Lax/Z4/j;->v0:[C

    .line 32
    .line 33
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 34
    .line 35
    add-int/lit8 v1, v0, 0x1

    .line 36
    .line 37
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 38
    .line 39
    iget-char v1, p0, Lax/Z4/j;->u0:C

    .line 40
    .line 41
    aput-char v1, p2, v0

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lax/Z4/j;->m1(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 47
    .line 48
    iget p2, p0, Lax/Z4/j;->y0:I

    .line 49
    .line 50
    if-lt p1, p2, :cond_36

    .line 51
    .line 52
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 53
    .line 54
    .line 55
    :cond_36
    iget-object p1, p0, Lax/Z4/j;->v0:[C

    .line 56
    .line 57
    iget p2, p0, Lax/Z4/j;->x0:I

    .line 58
    .line 59
    add-int/lit8 v0, p2, 0x1

    .line 60
    .line 61
    iput v0, p0, Lax/Z4/j;->x0:I

    .line 62
    .line 63
    iget-char v0, p0, Lax/Z4/j;->u0:C

    .line 64
    .line 65
    aput-char v0, p1, p2

    .line 66
    .line 67
    return-void
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

.method public j()V
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
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 50
    .line 51
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 52
    .line 53
    if-lt v0, v1, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 59
    .line 60
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 65
    .line 66
    const/16 v2, 0x5d

    .line 67
    .line 68
    aput-char v2, v0, v1

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

.method public m()V
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
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 50
    .line 51
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 52
    .line 53
    if-lt v0, v1, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 56
    .line 57
    .line 58
    :cond_39
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 59
    .line 60
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 65
    .line 66
    const/16 v2, 0x7d

    .line 67
    .line 68
    aput-char v2, v0, v1

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
    if-ne v0, v1, :cond_12

    .line 17
    .line 18
    goto :goto_13

    .line 19
    :cond_12
    const/4 v1, 0x0

    .line 20
    :goto_13
    invoke-virtual {p0, p1, v1}, Lax/Z4/j;->f1(Ljava/lang/String;Z)V

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

.method public o0()V
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
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

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
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 23
    .line 24
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_1e

    .line 27
    .line 28
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 29
    .line 30
    .line 31
    :cond_1e
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 32
    .line 33
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 38
    .line 39
    const/16 v2, 0x7b

    .line 40
    .line 41
    aput-char v2, v0, v1

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
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/Z4/j;->h1()V

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
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/U4/a;->h0:Z

    .line 2
    .line 3
    if-nez v0, :cond_26

    .line 4
    .line 5
    invoke-static {p1, p2}, Lax/W4/k;->o(D)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_13

    .line 10
    .line 11
    sget-object v0, Lax/T4/g$a;->h0:Lax/T4/g$a;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_26

    .line 20
    :cond_13
    const-string v0, "write a number"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lax/T4/g$a;->n0:Lax/T4/g$a;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {p1, p2, v0}, Lax/W4/k;->t(DZ)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lax/Z4/j;->H(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    :goto_26
    sget-object v0, Lax/T4/g$a;->n0:Lax/T4/g$a;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lax/U4/a;->L0(Lax/T4/g$a;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {p1, p2, v0}, Lax/W4/k;->t(DZ)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lax/Z4/j;->s0(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
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
.end method

.method public s0(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "write a string"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_b

    .line 7
    .line 8
    invoke-direct {p0}, Lax/Z4/j;->h1()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 13
    .line 14
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 15
    .line 16
    if-lt v0, v1, :cond_14

    .line 17
    .line 18
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 22
    .line 23
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x1

    .line 26
    .line 27
    iput v2, p0, Lax/Z4/j;->x0:I

    .line 28
    .line 29
    iget-char v2, p0, Lax/Z4/j;->u0:C

    .line 30
    .line 31
    aput-char v2, v0, v1

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lax/Z4/j;->m1(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lax/Z4/j;->x0:I

    .line 37
    .line 38
    iget v0, p0, Lax/Z4/j;->y0:I

    .line 39
    .line 40
    if-lt p1, v0, :cond_2c

    .line 41
    .line 42
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-object p1, p0, Lax/Z4/j;->v0:[C

    .line 46
    .line 47
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 48
    .line 49
    add-int/lit8 v1, v0, 0x1

    .line 50
    .line 51
    iput v1, p0, Lax/Z4/j;->x0:I

    .line 52
    .line 53
    iget-char v1, p0, Lax/Z4/j;->u0:C

    .line 54
    .line 55
    aput-char v1, p1, v0

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
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
    invoke-virtual {p0, v0}, Lax/Z4/j;->e1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lax/U4/a;->h0:Z

    .line 7
    .line 8
    if-eqz v0, :cond_d

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lax/Z4/j;->j1(J)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    iget v0, p0, Lax/Z4/j;->x0:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x15

    .line 17
    .line 18
    iget v1, p0, Lax/Z4/j;->y0:I

    .line 19
    .line 20
    if-lt v0, v1, :cond_18

    .line 21
    .line 22
    invoke-virtual {p0}, Lax/Z4/j;->a1()V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/Z4/j;->v0:[C

    .line 26
    .line 27
    iget v1, p0, Lax/Z4/j;->x0:I

    .line 28
    .line 29
    invoke-static {p1, p2, v0, v1}, Lax/W4/k;->s(J[CI)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lax/Z4/j;->x0:I

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
