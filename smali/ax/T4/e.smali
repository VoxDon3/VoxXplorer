.class public Lax/T4/e;
.super Lax/T4/u;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/T4/e$a;
    }
.end annotation


# static fields
.field protected static final l0:I

.field protected static final m0:I

.field protected static final n0:I

.field public static final o0:Lax/T4/p;


# instance fields
.field protected final transient c0:Lax/a5/a;

.field protected d0:I

.field protected e0:I

.field protected f0:I

.field protected g0:Lax/T4/n;

.field protected h0:Lax/T4/r;

.field protected i0:Lax/T4/p;

.field protected j0:I

.field protected final k0:C

.field protected final transient q:Lax/a5/b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    invoke-static {}, Lax/T4/e$a;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lax/T4/e;->l0:I

    .line 6
    .line 7
    invoke-static {}, Lax/T4/j$a;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lax/T4/e;->m0:I

    .line 12
    .line 13
    invoke-static {}, Lax/T4/g$a;->d()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Lax/T4/e;->n0:I

    .line 18
    .line 19
    sget-object v0, Lax/b5/e;->i0:Lax/W4/l;

    .line 20
    .line 21
    sput-object v0, Lax/T4/e;->o0:Lax/T4/p;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lax/T4/e;-><init>(Lax/T4/n;)V

    return-void
.end method

.method public constructor <init>(Lax/T4/n;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Lax/T4/u;-><init>()V

    .line 3
    invoke-static {}, Lax/a5/b;->j()Lax/a5/b;

    move-result-object v0

    iput-object v0, p0, Lax/T4/e;->q:Lax/a5/b;

    .line 4
    invoke-static {}, Lax/a5/a;->u()Lax/a5/a;

    move-result-object v0

    iput-object v0, p0, Lax/T4/e;->c0:Lax/a5/a;

    .line 5
    sget v0, Lax/T4/e;->l0:I

    iput v0, p0, Lax/T4/e;->d0:I

    .line 6
    sget v0, Lax/T4/e;->m0:I

    iput v0, p0, Lax/T4/e;->e0:I

    .line 7
    sget v0, Lax/T4/e;->n0:I

    iput v0, p0, Lax/T4/e;->f0:I

    .line 8
    sget-object v0, Lax/T4/e;->o0:Lax/T4/p;

    iput-object v0, p0, Lax/T4/e;->i0:Lax/T4/p;

    .line 9
    iput-object p1, p0, Lax/T4/e;->g0:Lax/T4/n;

    const/16 p1, 0x22

    .line 10
    iput-char p1, p0, Lax/T4/e;->k0:C

    .line 11
    invoke-static {}, Lax/T4/r;->a()Lax/T4/r;

    move-result-object p1

    iput-object p1, p0, Lax/T4/e;->h0:Lax/T4/r;

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;)Lax/W4/d;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/T4/e;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0, p1}, Lax/W4/d;->i(ZLjava/lang/Object;)Lax/W4/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method protected b(Lax/W4/d;Z)Lax/W4/e;
    .registers 6

    .line 1
    if-nez p1, :cond_6

    .line 2
    .line 3
    invoke-static {}, Lax/W4/d;->o()Lax/W4/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_6
    new-instance v0, Lax/W4/e;

    .line 8
    .line 9
    iget-object v1, p0, Lax/T4/e;->h0:Lax/T4/r;

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/T4/e;->m()Lax/b5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2, p1, p2}, Lax/W4/e;-><init>(Lax/T4/r;Lax/b5/a;Lax/W4/d;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
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

.method protected c(Ljava/io/Writer;Lax/W4/e;)Lax/T4/g;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/Z4/j;

    .line 2
    .line 3
    iget v2, p0, Lax/T4/e;->f0:I

    .line 4
    .line 5
    iget-object v3, p0, Lax/T4/e;->g0:Lax/T4/n;

    .line 6
    .line 7
    iget-char v5, p0, Lax/T4/e;->k0:C

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    move-object v1, p2

    .line 11
    invoke-direct/range {v0 .. v5}, Lax/Z4/j;-><init>(Lax/W4/e;ILax/T4/n;Ljava/io/Writer;C)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lax/T4/e;->j0:I

    .line 15
    .line 16
    if-lez p1, :cond_14

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lax/Z4/c;->d(I)Lax/T4/g;

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object p1, p0, Lax/T4/e;->i0:Lax/T4/p;

    .line 22
    .line 23
    sget-object p2, Lax/T4/e;->o0:Lax/T4/p;

    .line 24
    .line 25
    if-eq p1, p2, :cond_1d

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lax/Z4/c;->Y0(Lax/T4/p;)Lax/T4/g;

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-object v0
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

.method protected d(Ljava/io/InputStream;Lax/W4/e;)Lax/T4/j;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lax/Z4/a;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Lax/Z4/a;-><init>(Lax/W4/e;Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lax/T4/e;->e0:I

    .line 7
    .line 8
    iget-object v2, p0, Lax/T4/e;->g0:Lax/T4/n;

    .line 9
    .line 10
    iget-object v3, p0, Lax/T4/e;->c0:Lax/a5/a;

    .line 11
    .line 12
    iget-object v4, p0, Lax/T4/e;->q:Lax/a5/b;

    .line 13
    .line 14
    iget v5, p0, Lax/T4/e;->d0:I

    .line 15
    .line 16
    invoke-virtual/range {v0 .. v5}, Lax/Z4/a;->c(ILax/T4/n;Lax/a5/a;Lax/a5/b;I)Lax/T4/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_13} :catch_17
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_13} :catch_14

    .line 20
    return-object p1

    .line 21
    :catch_14
    move-exception v0

    .line 22
    :goto_15
    move-object v1, v0

    .line 23
    goto :goto_19

    .line 24
    :catch_17
    move-exception v0

    .line 25
    goto :goto_15

    .line 26
    :goto_19
    invoke-virtual {p2}, Lax/W4/e;->l()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_28

    .line 31
    .line 32
    :try_start_1f
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    goto :goto_28

    .line 36
    :catch_23
    move-exception v0

    .line 37
    move-object p1, v0

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    :goto_28
    throw v1
.end method

.method protected e(Ljava/io/Reader;Lax/W4/e;)Lax/T4/j;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/Z4/g;

    .line 2
    .line 3
    iget v2, p0, Lax/T4/e;->e0:I

    .line 4
    .line 5
    iget-object v4, p0, Lax/T4/e;->g0:Lax/T4/n;

    .line 6
    .line 7
    iget-object v1, p0, Lax/T4/e;->q:Lax/a5/b;

    .line 8
    .line 9
    iget v3, p0, Lax/T4/e;->d0:I

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Lax/a5/b;->n(I)Lax/a5/b;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    move-object v3, p1

    .line 16
    move-object v1, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lax/Z4/g;-><init>(Lax/W4/e;ILjava/io/Reader;Lax/T4/n;Lax/a5/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method protected f([CIILax/W4/e;Z)Lax/T4/j;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/Z4/g;

    .line 2
    .line 3
    iget v2, p0, Lax/T4/e;->e0:I

    .line 4
    .line 5
    iget-object v4, p0, Lax/T4/e;->g0:Lax/T4/n;

    .line 6
    .line 7
    iget-object v1, p0, Lax/T4/e;->q:Lax/a5/b;

    .line 8
    .line 9
    iget v3, p0, Lax/T4/e;->d0:I

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Lax/a5/b;->n(I)Lax/a5/b;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    add-int v8, p2, p3

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v6, p1

    .line 19
    move v7, p2

    .line 20
    move-object v1, p4

    .line 21
    move v9, p5

    .line 22
    invoke-direct/range {v0 .. v9}, Lax/Z4/g;-><init>(Lax/W4/e;ILjava/io/Reader;Lax/T4/n;Lax/a5/b;[CIIZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
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

.method protected g(Ljava/io/OutputStream;Lax/W4/e;)Lax/T4/g;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/Z4/h;

    .line 2
    .line 3
    iget v2, p0, Lax/T4/e;->f0:I

    .line 4
    .line 5
    iget-object v3, p0, Lax/T4/e;->g0:Lax/T4/n;

    .line 6
    .line 7
    iget-char v5, p0, Lax/T4/e;->k0:C

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    move-object v1, p2

    .line 11
    invoke-direct/range {v0 .. v5}, Lax/Z4/h;-><init>(Lax/W4/e;ILax/T4/n;Ljava/io/OutputStream;C)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lax/T4/e;->j0:I

    .line 15
    .line 16
    if-lez p1, :cond_14

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lax/Z4/c;->d(I)Lax/T4/g;

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-object p1, p0, Lax/T4/e;->i0:Lax/T4/p;

    .line 22
    .line 23
    sget-object p2, Lax/T4/e;->o0:Lax/T4/p;

    .line 24
    .line 25
    if-eq p1, p2, :cond_1d

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lax/Z4/c;->Y0(Lax/T4/p;)Lax/T4/g;

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-object v0
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

.method protected h(Ljava/io/OutputStream;Lax/T4/d;Lax/W4/e;)Ljava/io/Writer;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/T4/d;->e0:Lax/T4/d;

    .line 2
    .line 3
    if-ne p2, v0, :cond_a

    .line 4
    .line 5
    new-instance p2, Lax/W4/n;

    .line 6
    .line 7
    invoke-direct {p2, p3, p1}, Lax/W4/n;-><init>(Lax/W4/e;Ljava/io/OutputStream;)V

    .line 8
    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_a
    new-instance p3, Ljava/io/OutputStreamWriter;

    .line 12
    .line 13
    invoke-virtual {p2}, Lax/T4/d;->h()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {p3, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p3
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

.method protected final i(Ljava/io/InputStream;Lax/W4/e;)Ljava/io/InputStream;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-object p1
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

.method protected final j(Ljava/io/OutputStream;Lax/W4/e;)Ljava/io/OutputStream;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-object p1
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

.method protected final k(Ljava/io/Reader;Lax/W4/e;)Ljava/io/Reader;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-object p1
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

.method protected final l(Ljava/io/Writer;Lax/W4/e;)Ljava/io/Writer;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-object p1
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

.method public m()Lax/b5/a;
    .registers 3

    .line 1
    sget-object v0, Lax/T4/e$a;->f0:Lax/T4/e$a;

    .line 2
    .line 3
    iget v1, p0, Lax/T4/e;->d0:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/T4/e$a;->l(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    invoke-static {}, Lax/b5/b;->a()Lax/b5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_f
    new-instance v0, Lax/b5/a;

    .line 17
    .line 18
    invoke-direct {v0}, Lax/b5/a;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public n()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public o()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public p(Ljava/io/OutputStream;)Lax/T4/g;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/T4/d;->e0:Lax/T4/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->q(Ljava/io/OutputStream;Lax/T4/d;)Lax/T4/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public q(Ljava/io/OutputStream;Lax/T4/d;)Lax/T4/g;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/T4/e;->a(Ljava/lang/Object;)Lax/W4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lax/T4/e;->b(Lax/W4/d;Z)Lax/W4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p2}, Lax/W4/e;->r(Lax/T4/d;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lax/T4/d;->e0:Lax/T4/d;

    .line 14
    .line 15
    if-ne p2, v1, :cond_19

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->j(Ljava/io/OutputStream;Lax/W4/e;)Ljava/io/OutputStream;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->g(Ljava/io/OutputStream;Lax/W4/e;)Lax/T4/g;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_19
    invoke-virtual {p0, p1, p2, v0}, Lax/T4/e;->h(Ljava/io/OutputStream;Lax/T4/d;Lax/W4/e;)Ljava/io/Writer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->l(Ljava/io/Writer;Lax/W4/e;)Ljava/io/Writer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->c(Ljava/io/Writer;Lax/W4/e;)Lax/T4/g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
    .line 39
    .line 40
    .line 41
.end method

.method public r(Ljava/io/Writer;)Lax/T4/g;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/T4/e;->a(Ljava/lang/Object;)Lax/W4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lax/T4/e;->b(Lax/W4/d;Z)Lax/W4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->l(Ljava/io/Writer;Lax/W4/e;)Ljava/io/Writer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->c(Ljava/io/Writer;Lax/W4/e;)Lax/T4/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public s(Ljava/io/InputStream;)Lax/T4/j;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/T4/e;->a(Ljava/lang/Object;)Lax/W4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lax/T4/e;->b(Lax/W4/d;Z)Lax/W4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->i(Ljava/io/InputStream;Lax/W4/e;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->d(Ljava/io/InputStream;Lax/W4/e;)Lax/T4/j;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public t(Ljava/io/Reader;)Lax/T4/j;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/T4/e;->a(Ljava/lang/Object;)Lax/W4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lax/T4/e;->b(Lax/W4/d;Z)Lax/W4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->k(Ljava/io/Reader;Lax/W4/e;)Ljava/io/Reader;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1, v0}, Lax/T4/e;->e(Ljava/io/Reader;Lax/W4/e;)Lax/T4/j;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public u(Ljava/lang/String;)Lax/T4/j;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    const v0, 0x8000

    .line 6
    .line 7
    .line 8
    if-gt v3, v0, :cond_f

    .line 9
    .line 10
    invoke-virtual {p0}, Lax/T4/e;->o()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_11

    .line 15
    .line 16
    :cond_f
    move-object v0, p0

    .line 17
    goto :goto_2a

    .line 18
    :cond_11
    invoke-virtual {p0, p1}, Lax/T4/e;->a(Ljava/lang/Object;)Lax/W4/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p0, v0, v1}, Lax/T4/e;->b(Lax/W4/d;Z)Lax/W4/e;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, v3}, Lax/W4/e;->g(I)[C

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0, v3, v1, v0}, Ljava/lang/String;->getChars(II[CI)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    move-object v0, p0

    .line 38
    invoke-virtual/range {v0 .. v5}, Lax/T4/e;->f([CIILax/W4/e;Z)Lax/T4/j;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :goto_2a
    new-instance v1, Ljava/io/StringReader;

    .line 44
    .line 45
    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lax/T4/e;->t(Ljava/io/Reader;)Lax/T4/j;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
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
