.class public final Lax/X1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/m;


# instance fields
.field private final a:Lax/S0/G;

.field private final b:Lax/q1/J$a;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/lang/String;

.field private f:Lax/q1/U;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private j:Z

.field private k:Z

.field private l:J

.field private m:I

.field private n:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1, p1}, Lax/X1/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lax/X1/t;->h:I

    .line 4
    new-instance v1, Lax/S0/G;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lax/S0/G;-><init>(I)V

    iput-object v1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 5
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    move-result-object v1

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    .line 6
    new-instance v0, Lax/q1/J$a;

    invoke-direct {v0}, Lax/q1/J$a;-><init>()V

    iput-object v0, p0, Lax/X1/t;->b:Lax/q1/J$a;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    iput-wide v0, p0, Lax/X1/t;->n:J

    .line 8
    iput-object p1, p0, Lax/X1/t;->c:Ljava/lang/String;

    .line 9
    iput p2, p0, Lax/X1/t;->d:I

    .line 10
    iput-object p3, p0, Lax/X1/t;->e:Ljava/lang/String;

    return-void
.end method

.method private a(Lax/S0/G;)V
    .registers 10

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lax/S0/G;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lax/S0/G;->j()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_c
    if-ge v1, v2, :cond_46

    .line 14
    .line 15
    aget-byte v3, v0, v1

    .line 16
    .line 17
    and-int/lit16 v4, v3, 0xff

    .line 18
    .line 19
    const/16 v5, 0xff

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x1

    .line 23
    if-ne v4, v5, :cond_1a

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
    iget-boolean v5, p0, Lax/X1/t;->k:Z

    .line 29
    .line 30
    if-eqz v5, :cond_27

    .line 31
    .line 32
    and-int/lit16 v3, v3, 0xe0

    .line 33
    .line 34
    const/16 v5, 0xe0

    .line 35
    .line 36
    if-ne v3, v5, :cond_27

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v3, 0x0

    .line 41
    :goto_28
    iput-boolean v4, p0, Lax/X1/t;->k:Z

    .line 42
    .line 43
    if-eqz v3, :cond_43

    .line 44
    .line 45
    add-int/lit8 v2, v1, 0x1

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Lax/S0/G;->b0(I)V

    .line 48
    .line 49
    .line 50
    iput-boolean v6, p0, Lax/X1/t;->k:Z

    .line 51
    .line 52
    iget-object p1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 53
    .line 54
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    aget-byte v0, v0, v1

    .line 59
    .line 60
    aput-byte v0, p1, v7

    .line 61
    .line 62
    const/4 p1, 0x2

    .line 63
    iput p1, p0, Lax/X1/t;->i:I

    .line 64
    .line 65
    iput v7, p0, Lax/X1/t;->h:I

    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_c

    .line 71
    :cond_46
    invoke-virtual {p1, v2}, Lax/S0/G;->b0(I)V

    .line 72
    .line 73
    .line 74
    return-void
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

.method private g(Lax/S0/G;)V
    .registers 10

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/X1/t;->m:I

    .line 6
    .line 7
    iget v2, p0, Lax/X1/t;->i:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lax/X1/t;->f:Lax/q1/U;

    .line 15
    .line 16
    invoke-interface {v1, p1, v0}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lax/X1/t;->i:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p0, Lax/X1/t;->i:I

    .line 23
    .line 24
    iget v0, p0, Lax/X1/t;->m:I

    .line 25
    .line 26
    if-ge p1, v0, :cond_1c

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iget-wide v0, p0, Lax/X1/t;->n:J

    .line 30
    .line 31
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    cmp-long v4, v0, v2

    .line 38
    .line 39
    if-eqz v4, :cond_2a

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    const/4 v0, 0x0

    .line 44
    :goto_2b
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lax/X1/t;->f:Lax/q1/U;

    .line 48
    .line 49
    iget-wide v2, p0, Lax/X1/t;->n:J

    .line 50
    .line 51
    iget v5, p0, Lax/X1/t;->m:I

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-interface/range {v1 .. v7}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 57
    .line 58
    .line 59
    iget-wide v0, p0, Lax/X1/t;->n:J

    .line 60
    .line 61
    iget-wide v2, p0, Lax/X1/t;->l:J

    .line 62
    .line 63
    add-long/2addr v0, v2

    .line 64
    iput-wide v0, p0, Lax/X1/t;->n:J

    .line 65
    .line 66
    iput p1, p0, Lax/X1/t;->i:I

    .line 67
    .line 68
    iput p1, p0, Lax/X1/t;->h:I

    .line 69
    .line 70
    return-void
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

.method private h(Lax/S0/G;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/X1/t;->i:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    rsub-int/lit8 v1, v1, 0x4

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 15
    .line 16
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v3, p0, Lax/X1/t;->i:I

    .line 21
    .line 22
    invoke-virtual {p1, v1, v3, v0}, Lax/S0/G;->q([BII)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lax/X1/t;->i:I

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    iput p1, p0, Lax/X1/t;->i:I

    .line 29
    .line 30
    if-ge p1, v2, :cond_20

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object p1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lax/X1/t;->b:Lax/q1/J$a;

    .line 40
    .line 41
    iget-object v1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 42
    .line 43
    invoke-virtual {v1}, Lax/S0/G;->v()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1, v1}, Lax/q1/J$a;->a(I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v1, 0x1

    .line 52
    if-nez p1, :cond_3a

    .line 53
    .line 54
    iput v0, p0, Lax/X1/t;->i:I

    .line 55
    .line 56
    iput v1, p0, Lax/X1/t;->h:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object p1, p0, Lax/X1/t;->b:Lax/q1/J$a;

    .line 60
    .line 61
    iget v3, p1, Lax/q1/J$a;->c:I

    .line 62
    .line 63
    iput v3, p0, Lax/X1/t;->m:I

    .line 64
    .line 65
    iget-boolean v3, p0, Lax/X1/t;->j:Z

    .line 66
    .line 67
    if-nez v3, :cond_98

    .line 68
    .line 69
    iget v3, p1, Lax/q1/J$a;->g:I

    .line 70
    .line 71
    int-to-long v3, v3

    .line 72
    const-wide/32 v5, 0xf4240

    .line 73
    .line 74
    .line 75
    mul-long v3, v3, v5

    .line 76
    .line 77
    iget p1, p1, Lax/q1/J$a;->d:I

    .line 78
    .line 79
    int-to-long v5, p1

    .line 80
    div-long/2addr v3, v5

    .line 81
    iput-wide v3, p0, Lax/X1/t;->l:J

    .line 82
    .line 83
    new-instance p1, Lax/P0/v$b;

    .line 84
    .line 85
    invoke-direct {p1}, Lax/P0/v$b;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-object v3, p0, Lax/X1/t;->g:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, v3}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object v3, p0, Lax/X1/t;->e:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, v3}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v3, p0, Lax/X1/t;->b:Lax/q1/J$a;

    .line 101
    .line 102
    iget-object v3, v3, Lax/q1/J$a;->b:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, v3}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const/16 v3, 0x1000

    .line 109
    .line 110
    invoke-virtual {p1, v3}, Lax/P0/v$b;->o0(I)Lax/P0/v$b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v3, p0, Lax/X1/t;->b:Lax/q1/J$a;

    .line 115
    .line 116
    iget v3, v3, Lax/q1/J$a;->e:I

    .line 117
    .line 118
    invoke-virtual {p1, v3}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object v3, p0, Lax/X1/t;->b:Lax/q1/J$a;

    .line 123
    .line 124
    iget v3, v3, Lax/q1/J$a;->d:I

    .line 125
    .line 126
    invoke-virtual {p1, v3}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object v3, p0, Lax/X1/t;->c:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p1, v3}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget v3, p0, Lax/X1/t;->d:I

    .line 137
    .line 138
    invoke-virtual {p1, v3}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget-object v3, p0, Lax/X1/t;->f:Lax/q1/U;

    .line 147
    .line 148
    invoke-interface {v3, p1}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 149
    .line 150
    .line 151
    iput-boolean v1, p0, Lax/X1/t;->j:Z

    .line 152
    .line 153
    :cond_98
    iget-object p1, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, Lax/X1/t;->f:Lax/q1/U;

    .line 159
    .line 160
    iget-object v0, p0, Lax/X1/t;->a:Lax/S0/G;

    .line 161
    .line 162
    invoke-interface {p1, v0, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x2

    .line 166
    iput p1, p0, Lax/X1/t;->h:I

    .line 167
    .line 168
    return-void
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


# virtual methods
.method public b()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/X1/t;->h:I

    .line 3
    .line 4
    iput v0, p0, Lax/X1/t;->i:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lax/X1/t;->k:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, Lax/X1/t;->n:J

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

.method public c(Lax/S0/G;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/X1/t;->f:Lax/q1/U;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :goto_5
    invoke-virtual {p1}, Lax/S0/G;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_27

    .line 11
    .line 12
    iget v0, p0, Lax/X1/t;->h:I

    .line 13
    .line 14
    if-eqz v0, :cond_23

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eq v0, v1, :cond_1f

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_19

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lax/X1/t;->g(Lax/S0/G;)V

    .line 23
    .line 24
    .line 25
    goto :goto_5

    .line 26
    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1f
    invoke-direct {p0, p1}, Lax/X1/t;->h(Lax/S0/G;)V

    .line 33
    .line 34
    .line 35
    goto :goto_5

    .line 36
    :cond_23
    invoke-direct {p0, p1}, Lax/X1/t;->a(Lax/S0/G;)V

    .line 37
    .line 38
    .line 39
    goto :goto_5

    .line 40
    :cond_27
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

.method public d(Lax/q1/t;Lax/X1/L$d;)V
    .registers 4

    .line 1
    invoke-virtual {p2}, Lax/X1/L$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lax/X1/L$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/X1/t;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lax/X1/L$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-interface {p1, p2, v0}, Lax/q1/t;->u(II)Lax/q1/U;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lax/X1/t;->f:Lax/q1/U;

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

.method public e(Z)V
    .registers 2

    .line 1
    return-void
    .line 2
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

.method public f(JI)V
    .registers 4

    .line 1
    iput-wide p1, p0, Lax/X1/t;->n:J

    .line 2
    .line 3
    return-void
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
