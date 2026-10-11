.class final Lax/Y1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Y1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Y1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lax/q1/t;

.field private final b:Lax/q1/U;

.field private final c:Lax/Y1/c;

.field private final d:Lax/P0/v;

.field private final e:I

.field private f:J

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(Lax/q1/t;Lax/q1/U;Lax/Y1/c;Ljava/lang/String;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Y1/b$c;->a:Lax/q1/t;

    .line 5
    .line 6
    iput-object p2, p0, Lax/Y1/b$c;->b:Lax/q1/U;

    .line 7
    .line 8
    iput-object p3, p0, Lax/Y1/b$c;->c:Lax/Y1/c;

    .line 9
    .line 10
    iget p1, p3, Lax/Y1/c;->b:I

    .line 11
    .line 12
    iget p2, p3, Lax/Y1/c;->f:I

    .line 13
    .line 14
    mul-int p1, p1, p2

    .line 15
    .line 16
    div-int/lit8 p1, p1, 0x8

    .line 17
    .line 18
    iget p2, p3, Lax/Y1/c;->e:I

    .line 19
    .line 20
    if-ne p2, p1, :cond_57

    .line 21
    .line 22
    iget p2, p3, Lax/Y1/c;->c:I

    .line 23
    .line 24
    mul-int v0, p2, p1

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x8

    .line 27
    .line 28
    mul-int p2, p2, p1

    .line 29
    .line 30
    div-int/lit8 p2, p2, 0xa

    .line 31
    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lax/Y1/b$c;->e:I

    .line 37
    .line 38
    new-instance p2, Lax/P0/v$b;

    .line 39
    .line 40
    invoke-direct {p2}, Lax/P0/v$b;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "audio/wav"

    .line 44
    .line 45
    invoke-virtual {p2, v1}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2, p4}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2, v0}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, v0}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2, p1}, Lax/P0/v$b;->o0(I)Lax/P0/v$b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p2, p3, Lax/Y1/c;->b:I

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget p2, p3, Lax/Y1/c;->c:I

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lax/P0/v$b;->z0(I)Lax/P0/v$b;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, p5}, Lax/P0/v$b;->s0(I)Lax/P0/v$b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lax/Y1/b$c;->d:Lax/P0/v;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string p4, "Expected block size: "

    .line 94
    .line 95
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, "; got: "

    .line 102
    .line 103
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget p1, p3, Lax/Y1/c;->e:I

    .line 107
    .line 108
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const/4 p2, 0x0

    .line 116
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    throw p1
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


# virtual methods
.method public c(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/Y1/b$c;->f:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lax/Y1/b$c;->g:I

    .line 5
    .line 6
    const-wide/16 p1, 0x0

    .line 7
    .line 8
    iput-wide p1, p0, Lax/Y1/b$c;->h:J

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

.method public d(Lax/q1/s;J)Z
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
    move-wide/from16 v1, p2

    .line 4
    .line 5
    :goto_4
    const/4 v3, 0x1

    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    cmp-long v6, v1, v4

    .line 9
    .line 10
    if-lez v6, :cond_2d

    .line 11
    .line 12
    iget v7, v0, Lax/Y1/b$c;->g:I

    .line 13
    .line 14
    iget v8, v0, Lax/Y1/b$c;->e:I

    .line 15
    .line 16
    if-ge v7, v8, :cond_2d

    .line 17
    .line 18
    sub-int/2addr v8, v7

    .line 19
    int-to-long v6, v8

    .line 20
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    long-to-int v7, v6

    .line 25
    iget-object v6, v0, Lax/Y1/b$c;->b:Lax/q1/U;

    .line 26
    .line 27
    move-object/from16 v8, p1

    .line 28
    .line 29
    invoke-interface {v6, v8, v7, v3}, Lax/q1/U;->a(Lax/P0/k;IZ)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v6, -0x1

    .line 34
    if-ne v3, v6, :cond_25

    .line 35
    .line 36
    move-wide v1, v4

    .line 37
    goto :goto_4

    .line 38
    :cond_25
    iget v4, v0, Lax/Y1/b$c;->g:I

    .line 39
    .line 40
    add-int/2addr v4, v3

    .line 41
    iput v4, v0, Lax/Y1/b$c;->g:I

    .line 42
    .line 43
    int-to-long v3, v3

    .line 44
    sub-long/2addr v1, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_2d
    iget-object v1, v0, Lax/Y1/b$c;->c:Lax/Y1/c;

    .line 47
    .line 48
    iget v2, v1, Lax/Y1/c;->e:I

    .line 49
    .line 50
    iget v4, v0, Lax/Y1/b$c;->g:I

    .line 51
    .line 52
    div-int/2addr v4, v2

    .line 53
    if-lez v4, :cond_5e

    .line 54
    .line 55
    iget-wide v7, v0, Lax/Y1/b$c;->f:J

    .line 56
    .line 57
    iget-wide v9, v0, Lax/Y1/b$c;->h:J

    .line 58
    .line 59
    iget v1, v1, Lax/Y1/c;->c:I

    .line 60
    .line 61
    int-to-long v13, v1

    .line 62
    const-wide/32 v11, 0xf4240

    .line 63
    .line 64
    .line 65
    invoke-static/range {v9 .. v14}, Lax/S0/d0;->p1(JJJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v9

    .line 69
    add-long v12, v7, v9

    .line 70
    .line 71
    mul-int v15, v4, v2

    .line 72
    .line 73
    iget v1, v0, Lax/Y1/b$c;->g:I

    .line 74
    .line 75
    sub-int v16, v1, v15

    .line 76
    .line 77
    iget-object v11, v0, Lax/Y1/b$c;->b:Lax/q1/U;

    .line 78
    .line 79
    const/4 v14, 0x1

    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    invoke-interface/range {v11 .. v17}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 83
    .line 84
    .line 85
    move/from16 v1, v16

    .line 86
    .line 87
    iget-wide v7, v0, Lax/Y1/b$c;->h:J

    .line 88
    .line 89
    int-to-long v4, v4

    .line 90
    add-long/2addr v7, v4

    .line 91
    iput-wide v7, v0, Lax/Y1/b$c;->h:J

    .line 92
    .line 93
    iput v1, v0, Lax/Y1/b$c;->g:I

    .line 94
    .line 95
    :cond_5e
    if-gtz v6, :cond_61

    .line 96
    .line 97
    return v3

    .line 98
    :cond_61
    const/4 v1, 0x0

    .line 99
    return v1
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

.method public e(IJ)V
    .registers 11

    .line 1
    new-instance v0, Lax/Y1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Y1/b$c;->c:Lax/Y1/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    int-to-long v3, p1

    .line 7
    move-wide v5, p2

    .line 8
    invoke-direct/range {v0 .. v6}, Lax/Y1/e;-><init>(Lax/Y1/c;IJJ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/Y1/b$c;->a:Lax/q1/t;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/Y1/b$c;->b:Lax/q1/U;

    .line 17
    .line 18
    iget-object p2, p0, Lax/Y1/b$c;->d:Lax/P0/v;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Lax/q1/U;->e(Lax/P0/v;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/Y1/b$c;->b:Lax/q1/U;

    .line 24
    .line 25
    invoke-virtual {v0}, Lax/Y1/e;->n()J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    invoke-interface {p1, p2, p3}, Lax/q1/U;->d(J)V

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
.end method
