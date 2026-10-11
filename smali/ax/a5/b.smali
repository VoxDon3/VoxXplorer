.class public final Lax/a5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a5/b$b;,
        Lax/a5/b$a;
    }
.end annotation


# instance fields
.field protected final a:Lax/a5/b;

.field protected final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lax/a5/b$b;",
            ">;"
        }
    .end annotation
.end field

.field protected final c:I

.field protected final d:I

.field protected e:Z

.field protected f:[Ljava/lang/String;

.field protected g:[Lax/a5/b$a;

.field protected h:I

.field protected i:I

.field protected j:I

.field protected k:I

.field protected l:Z

.field protected m:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/a5/b;->a:Lax/a5/b;

    .line 3
    iput p1, p0, Lax/a5/b;->c:I

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lax/a5/b;->e:Z

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lax/a5/b;->d:I

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lax/a5/b;->l:Z

    .line 7
    iput p1, p0, Lax/a5/b;->k:I

    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v0, 0x40

    invoke-static {v0}, Lax/a5/b$b;->a(I)Lax/a5/b$b;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lax/a5/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>(Lax/a5/b;IILax/a5/b$b;)V
    .registers 5

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lax/a5/b;->a:Lax/a5/b;

    .line 11
    iput p3, p0, Lax/a5/b;->c:I

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lax/a5/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    iput p2, p0, Lax/a5/b;->d:I

    .line 14
    sget-object p1, Lax/T4/e$a;->d0:Lax/T4/e$a;

    invoke-virtual {p1, p2}, Lax/T4/e$a;->l(I)Z

    move-result p1

    iput-boolean p1, p0, Lax/a5/b;->e:Z

    .line 15
    iget-object p1, p4, Lax/a5/b$b;->c:[Ljava/lang/String;

    iput-object p1, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 16
    iget-object p2, p4, Lax/a5/b$b;->d:[Lax/a5/b$a;

    iput-object p2, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 17
    iget p2, p4, Lax/a5/b$b;->a:I

    iput p2, p0, Lax/a5/b;->h:I

    .line 18
    iget p2, p4, Lax/a5/b$b;->b:I

    iput p2, p0, Lax/a5/b;->k:I

    .line 19
    array-length p1, p1

    .line 20
    invoke-static {p1}, Lax/a5/b;->f(I)I

    move-result p2

    iput p2, p0, Lax/a5/b;->i:I

    const/4 p2, 0x1

    sub-int/2addr p1, p2

    .line 21
    iput p1, p0, Lax/a5/b;->j:I

    .line 22
    iput-boolean p2, p0, Lax/a5/b;->l:Z

    return-void
.end method

.method private a([CIIII)Ljava/lang/String;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean p4, p0, Lax/a5/b;->l:Z

    .line 2
    .line 3
    if-eqz p4, :cond_b

    .line 4
    .line 5
    invoke-direct {p0}, Lax/a5/b;->i()V

    .line 6
    .line 7
    .line 8
    const/4 p4, 0x0

    .line 9
    iput-boolean p4, p0, Lax/a5/b;->l:Z

    .line 10
    .line 11
    goto :goto_1c

    .line 12
    :cond_b
    iget p4, p0, Lax/a5/b;->h:I

    .line 13
    .line 14
    iget v0, p0, Lax/a5/b;->i:I

    .line 15
    .line 16
    if-lt p4, v0, :cond_1c

    .line 17
    .line 18
    invoke-direct {p0}, Lax/a5/b;->q()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lax/a5/b;->h([CII)I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-virtual {p0, p4}, Lax/a5/b;->d(I)I

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    :cond_1c
    :goto_1c
    new-instance p4, Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lax/T4/e$a;->c0:Lax/T4/e$a;

    .line 35
    .line 36
    iget p2, p0, Lax/a5/b;->d:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lax/T4/e$a;->l(I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_31

    .line 43
    .line 44
    sget-object p1, Lax/b5/f;->c0:Lax/b5/f;

    .line 45
    .line 46
    invoke-virtual {p1, p4}, Lax/b5/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    :cond_31
    iget p1, p0, Lax/a5/b;->h:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    iput p1, p0, Lax/a5/b;->h:I

    .line 55
    .line 56
    iget-object p1, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 57
    .line 58
    aget-object p2, p1, p5

    .line 59
    .line 60
    if-nez p2, :cond_40

    .line 61
    .line 62
    aput-object p4, p1, p5

    .line 63
    .line 64
    return-object p4

    .line 65
    :cond_40
    shr-int/lit8 p1, p5, 0x1

    .line 66
    .line 67
    new-instance p2, Lax/a5/b$a;

    .line 68
    .line 69
    iget-object p3, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 70
    .line 71
    aget-object p3, p3, p1

    .line 72
    .line 73
    invoke-direct {p2, p4, p3}, Lax/a5/b$a;-><init>(Ljava/lang/String;Lax/a5/b$a;)V

    .line 74
    .line 75
    .line 76
    iget p3, p2, Lax/a5/b$a;->c:I

    .line 77
    .line 78
    const/16 v0, 0x96

    .line 79
    .line 80
    if-le p3, v0, :cond_55

    .line 81
    .line 82
    invoke-direct {p0, p1, p2, p5}, Lax/a5/b;->c(ILax/a5/b$a;I)V

    .line 83
    .line 84
    .line 85
    return-object p4

    .line 86
    :cond_55
    iget-object p5, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 87
    .line 88
    aput-object p2, p5, p1

    .line 89
    .line 90
    iget p1, p0, Lax/a5/b;->k:I

    .line 91
    .line 92
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iput p1, p0, Lax/a5/b;->k:I

    .line 97
    .line 98
    return-object p4
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

.method private b([CIILax/a5/b$a;)Ljava/lang/String;
    .registers 6

    .line 1
    :goto_0
    if-eqz p4, :cond_c

    .line 2
    .line 3
    invoke-virtual {p4, p1, p2, p3}, Lax/a5/b$a;->a([CII)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_9
    iget-object p4, p4, Lax/a5/b$a;->b:Lax/a5/b$a;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return-object p1
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

.method private c(ILax/a5/b$a;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a5/b;->m:Ljava/util/BitSet;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    new-instance v0, Ljava/util/BitSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/a5/b;->m:Ljava/util/BitSet;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_2d

    .line 16
    :cond_f
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_28

    .line 21
    .line 22
    sget-object v0, Lax/T4/e$a;->e0:Lax/T4/e$a;

    .line 23
    .line 24
    iget v1, p0, Lax/a5/b;->d:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lax/T4/e$a;->l(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_24

    .line 31
    .line 32
    const/16 v0, 0x96

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lax/a5/b;->e(I)V

    .line 35
    .line 36
    .line 37
    :cond_24
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lax/a5/b;->e:Z

    .line 39
    .line 40
    goto :goto_2d

    .line 41
    :cond_28
    iget-object v0, p0, Lax/a5/b;->m:Ljava/util/BitSet;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 44
    .line 45
    .line 46
    :goto_2d
    iget-object v0, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p2, Lax/a5/b$a;->a:Ljava/lang/String;

    .line 49
    .line 50
    aput-object v1, v0, p3

    .line 51
    .line 52
    iget-object p3, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    aput-object v0, p3, p1

    .line 56
    .line 57
    iget p1, p0, Lax/a5/b;->h:I

    .line 58
    .line 59
    iget p2, p2, Lax/a5/b$a;->c:I

    .line 60
    .line 61
    sub-int/2addr p1, p2

    .line 62
    iput p1, p0, Lax/a5/b;->h:I

    .line 63
    .line 64
    const/4 p1, -0x1

    .line 65
    iput p1, p0, Lax/a5/b;->k:I

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
.end method

.method private static f(I)I
    .registers 2

    .line 1
    shr-int/lit8 v0, p0, 0x2

    .line 2
    .line 3
    sub-int/2addr p0, v0

    .line 4
    return p0
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

.method private i()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [Lax/a5/b$a;

    .line 20
    .line 21
    iput-object v0, p0, Lax/a5/b;->g:[Lax/a5/b$a;

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

.method public static j()Lax/a5/b;
    .registers 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-int v2, v0

    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    ushr-long/2addr v0, v3

    .line 9
    long-to-int v1, v0

    .line 10
    add-int/2addr v2, v1

    .line 11
    or-int/lit8 v0, v2, 0x1

    .line 12
    .line 13
    invoke-static {v0}, Lax/a5/b;->k(I)Lax/a5/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected static k(I)Lax/a5/b;
    .registers 2

    .line 1
    new-instance v0, Lax/a5/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/a5/b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method private p(Lax/a5/b$b;)V
    .registers 5

    .line 1
    iget v0, p1, Lax/a5/b$b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/a5/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lax/a5/b$b;

    .line 10
    .line 11
    iget v2, v1, Lax/a5/b$b;->a:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_f

    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    const/16 v2, 0x2ee0

    .line 17
    .line 18
    if-le v0, v2, :cond_19

    .line 19
    .line 20
    const/16 p1, 0x40

    .line 21
    .line 22
    invoke-static {p1}, Lax/a5/b$b;->a(I)Lax/a5/b$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_19
    iget-object v0, p0, Lax/a5/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-static {v0, v1, p1}, Lax/f1/i;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void
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

.method private q()V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    add-int v3, v2, v2

    .line 6
    .line 7
    const/high16 v4, 0x10000

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-le v3, v4, :cond_22

    .line 11
    .line 12
    iput v5, p0, Lax/a5/b;->h:I

    .line 13
    .line 14
    iput-boolean v5, p0, Lax/a5/b;->e:Z

    .line 15
    .line 16
    const/16 v0, 0x40

    .line 17
    .line 18
    new-array v0, v0, [Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 21
    .line 22
    const/16 v0, 0x20

    .line 23
    .line 24
    new-array v0, v0, [Lax/a5/b$a;

    .line 25
    .line 26
    iput-object v0, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 27
    .line 28
    const/16 v0, 0x3f

    .line 29
    .line 30
    iput v0, p0, Lax/a5/b;->j:I

    .line 31
    .line 32
    iput-boolean v5, p0, Lax/a5/b;->l:Z

    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object v4, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 36
    .line 37
    new-array v6, v3, [Ljava/lang/String;

    .line 38
    .line 39
    iput-object v6, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 40
    .line 41
    shr-int/lit8 v6, v3, 0x1

    .line 42
    .line 43
    new-array v6, v6, [Lax/a5/b$a;

    .line 44
    .line 45
    iput-object v6, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 46
    .line 47
    add-int/lit8 v6, v3, -0x1

    .line 48
    .line 49
    iput v6, p0, Lax/a5/b;->j:I

    .line 50
    .line 51
    invoke-static {v3}, Lax/a5/b;->f(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iput v3, p0, Lax/a5/b;->i:I

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    :goto_3b
    if-ge v3, v2, :cond_69

    .line 61
    .line 62
    aget-object v8, v1, v3

    .line 63
    .line 64
    if-eqz v8, :cond_67

    .line 65
    .line 66
    add-int/2addr v6, v0

    .line 67
    invoke-virtual {p0, v8}, Lax/a5/b;->g(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-virtual {p0, v9}, Lax/a5/b;->d(I)I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    iget-object v10, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 76
    .line 77
    aget-object v11, v10, v9

    .line 78
    .line 79
    if-nez v11, :cond_53

    .line 80
    .line 81
    aput-object v8, v10, v9

    .line 82
    .line 83
    goto :goto_67

    .line 84
    :cond_53
    shr-int/2addr v9, v0

    .line 85
    new-instance v10, Lax/a5/b$a;

    .line 86
    .line 87
    iget-object v11, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 88
    .line 89
    aget-object v11, v11, v9

    .line 90
    .line 91
    invoke-direct {v10, v8, v11}, Lax/a5/b$a;-><init>(Ljava/lang/String;Lax/a5/b$a;)V

    .line 92
    .line 93
    .line 94
    iget-object v8, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 95
    .line 96
    aput-object v10, v8, v9

    .line 97
    .line 98
    iget v8, v10, Lax/a5/b$a;->c:I

    .line 99
    .line 100
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    :cond_67
    :goto_67
    add-int/2addr v3, v0

    .line 105
    goto :goto_3b

    .line 106
    :cond_69
    shr-int/lit8 v1, v2, 0x1

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    :goto_6c
    if-ge v2, v1, :cond_9f

    .line 110
    .line 111
    aget-object v3, v4, v2

    .line 112
    .line 113
    :goto_70
    if-eqz v3, :cond_9d

    .line 114
    .line 115
    add-int/2addr v6, v0

    .line 116
    iget-object v8, v3, Lax/a5/b$a;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p0, v8}, Lax/a5/b;->g(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    invoke-virtual {p0, v9}, Lax/a5/b;->d(I)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    iget-object v10, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 127
    .line 128
    aget-object v11, v10, v9

    .line 129
    .line 130
    if-nez v11, :cond_86

    .line 131
    .line 132
    aput-object v8, v10, v9

    .line 133
    .line 134
    goto :goto_9a

    .line 135
    :cond_86
    shr-int/2addr v9, v0

    .line 136
    new-instance v10, Lax/a5/b$a;

    .line 137
    .line 138
    iget-object v11, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 139
    .line 140
    aget-object v11, v11, v9

    .line 141
    .line 142
    invoke-direct {v10, v8, v11}, Lax/a5/b$a;-><init>(Ljava/lang/String;Lax/a5/b$a;)V

    .line 143
    .line 144
    .line 145
    iget-object v8, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 146
    .line 147
    aput-object v10, v8, v9

    .line 148
    .line 149
    iget v8, v10, Lax/a5/b$a;->c:I

    .line 150
    .line 151
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    :goto_9a
    iget-object v3, v3, Lax/a5/b$a;->b:Lax/a5/b$a;

    .line 156
    .line 157
    goto :goto_70

    .line 158
    :cond_9d
    add-int/2addr v2, v0

    .line 159
    goto :goto_6c

    .line 160
    :cond_9f
    iput v7, p0, Lax/a5/b;->k:I

    .line 161
    .line 162
    const/4 v1, 0x0

    .line 163
    iput-object v1, p0, Lax/a5/b;->m:Ljava/util/BitSet;

    .line 164
    .line 165
    iget v1, p0, Lax/a5/b;->h:I

    .line 166
    .line 167
    if-ne v6, v1, :cond_a9

    .line 168
    .line 169
    return-void

    .line 170
    :cond_a9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    iget v2, p0, Lax/a5/b;->h:I

    .line 173
    .line 174
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    const/4 v4, 0x2

    .line 183
    new-array v4, v4, [Ljava/lang/Object;

    .line 184
    .line 185
    aput-object v2, v4, v5

    .line 186
    .line 187
    aput-object v3, v4, v0

    .line 188
    .line 189
    const-string v0, "Internal error on SymbolTable.rehash(): had %d entries; now have %d"

    .line 190
    .line 191
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v1
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


# virtual methods
.method public d(I)I
    .registers 3

    .line 1
    ushr-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    shl-int/lit8 v0, p1, 0x7

    .line 5
    .line 6
    xor-int/2addr p1, v0

    .line 7
    ushr-int/lit8 v0, p1, 0x3

    .line 8
    .line 9
    add-int/2addr p1, v0

    .line 10
    iget v0, p0, Lax/a5/b;->j:I

    .line 11
    .line 12
    and-int/2addr p1, v0

    .line 13
    return p1
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

.method protected e(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/V4/b;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/V4/b;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Longest collision chain in symbol table (of size "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v2, p0, Lax/a5/b;->h:I

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, ") now exceeds maximum, "

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, " -- suspect a DoS attack based on hash collisions"

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Lax/V4/b;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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

.method public g(Ljava/lang/String;)I
    .registers 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lax/a5/b;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_7
    if-ge v2, v0, :cond_13

    .line 9
    .line 10
    mul-int/lit8 v1, v1, 0x21

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    add-int/2addr v1, v3

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_7

    .line 20
    :cond_13
    if-nez v1, :cond_17

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_17
    return v1
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

.method public h([CII)I
    .registers 6

    .line 1
    iget v0, p0, Lax/a5/b;->c:I

    .line 2
    .line 3
    add-int/2addr p3, p2

    .line 4
    :goto_3
    if-ge p2, p3, :cond_d

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x21

    .line 7
    .line 8
    aget-char v1, p1, p2

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    add-int/lit8 p2, p2, 0x1

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_d
    if-nez v0, :cond_11

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_11
    return v0
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

.method public l([CIII)Ljava/lang/String;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p3, v0, :cond_6

    .line 3
    .line 4
    const-string p1, ""

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_6
    iget-boolean v0, p0, Lax/a5/b;->e:Z

    .line 8
    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    new-instance p4, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 14
    .line 15
    .line 16
    return-object p4

    .line 17
    :cond_10
    invoke-virtual {p0, p4}, Lax/a5/b;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    iget-object v0, p0, Lax/a5/b;->f:[Ljava/lang/String;

    .line 22
    .line 23
    aget-object v0, v0, v5

    .line 24
    .line 25
    if-eqz v0, :cond_48

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, p3, :cond_30

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    :cond_21
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int v3, p2, v1

    .line 39
    .line 40
    aget-char v3, p1, v3

    .line 41
    .line 42
    if-ne v2, v3, :cond_30

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    if-ne v1, p3, :cond_21

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_30
    iget-object v0, p0, Lax/a5/b;->g:[Lax/a5/b$a;

    .line 50
    .line 51
    shr-int/lit8 v1, v5, 0x1

    .line 52
    .line 53
    aget-object v0, v0, v1

    .line 54
    .line 55
    if-eqz v0, :cond_48

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, p3}, Lax/a5/b$a;->a([CII)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_3f

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3f
    iget-object v0, v0, Lax/a5/b$a;->b:Lax/a5/b$a;

    .line 65
    .line 66
    invoke-direct {p0, p1, p2, p3, v0}, Lax/a5/b;->b([CIILax/a5/b$a;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_48

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_48
    move-object v0, p0

    .line 74
    move-object v1, p1

    .line 75
    move v2, p2

    .line 76
    move v3, p3

    .line 77
    move v4, p4

    .line 78
    invoke-direct/range {v0 .. v5}, Lax/a5/b;->a([CIIII)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
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

.method public m()I
    .registers 2

    .line 1
    iget v0, p0, Lax/a5/b;->c:I

    .line 2
    .line 3
    return v0
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

.method public n(I)Lax/a5/b;
    .registers 5

    .line 1
    new-instance v0, Lax/a5/b;

    .line 2
    .line 3
    iget v1, p0, Lax/a5/b;->c:I

    .line 4
    .line 5
    iget-object v2, p0, Lax/a5/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lax/a5/b$b;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, v1, v2}, Lax/a5/b;-><init>(Lax/a5/b;IILax/a5/b$b;)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public o()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/a5/b;->l:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
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

.method public r()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/a5/b;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_1a

    .line 8
    :cond_7
    iget-object v0, p0, Lax/a5/b;->a:Lax/a5/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1a

    .line 11
    .line 12
    iget-boolean v1, p0, Lax/a5/b;->e:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1a

    .line 15
    .line 16
    new-instance v1, Lax/a5/b$b;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lax/a5/b$b;-><init>(Lax/a5/b;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lax/a5/b;->p(Lax/a5/b$b;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lax/a5/b;->l:Z

    .line 26
    .line 27
    :cond_1a
    :goto_1a
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
