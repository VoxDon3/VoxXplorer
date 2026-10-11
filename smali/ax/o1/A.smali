.class public final Lax/o1/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o1/A$b;,
        Lax/o1/A$a;
    }
.end annotation


# instance fields
.field private final a:Lax/o1/A$b;

.field private final b:Lax/o1/D;

.field private final c:J

.field private d:Z

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:Z

.field private k:F

.field private l:Lax/S0/h;

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/o1/A$b;J)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/o1/A;->a:Lax/o1/A$b;

    .line 5
    .line 6
    iput-wide p3, p0, Lax/o1/A;->c:J

    .line 7
    .line 8
    new-instance p2, Lax/o1/D;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lax/o1/D;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lax/o1/A;->e:I

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lax/o1/A;->f:J

    .line 24
    .line 25
    iput-wide p1, p0, Lax/o1/A;->h:J

    .line 26
    .line 27
    iput-wide p1, p0, Lax/o1/A;->i:J

    .line 28
    .line 29
    const/high16 p1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    iput p1, p0, Lax/o1/A;->k:F

    .line 32
    .line 33
    sget-object p1, Lax/S0/h;->a:Lax/S0/h;

    .line 34
    .line 35
    iput-object p1, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 36
    .line 37
    return-void
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

.method private b(JJJ)J
    .registers 7

    .line 1
    sub-long/2addr p5, p1

    .line 2
    long-to-double p1, p5

    .line 3
    iget p5, p0, Lax/o1/A;->k:F

    .line 4
    .line 5
    float-to-double p5, p5

    .line 6
    div-double/2addr p1, p5

    .line 7
    double-to-long p1, p1

    .line 8
    iget-boolean p5, p0, Lax/o1/A;->d:Z

    .line 9
    .line 10
    if-eqz p5, :cond_17

    .line 11
    .line 12
    iget-object p5, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 13
    .line 14
    invoke-interface {p5}, Lax/S0/h;->b()J

    .line 15
    .line 16
    .line 17
    move-result-wide p5

    .line 18
    invoke-static {p5, p6}, Lax/S0/d0;->a1(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p5

    .line 22
    sub-long/2addr p5, p3

    .line 23
    sub-long/2addr p1, p5

    .line 24
    :cond_17
    return-wide p1
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

.method private f(I)V
    .registers 3

    .line 1
    iget v0, p0, Lax/o1/A;->e:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lax/o1/A;->e:I

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
    .line 22
.end method

.method private q(JJJ)Z
    .registers 14

    .line 1
    iget-wide v0, p0, Lax/o1/A;->i:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmp-long v5, v0, v3

    .line 10
    .line 11
    if-eqz v5, :cond_11

    .line 12
    .line 13
    iget-boolean v0, p0, Lax/o1/A;->j:Z

    .line 14
    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    return v2

    .line 18
    :cond_11
    iget v0, p0, Lax/o1/A;->e:I

    .line 19
    .line 20
    if-eqz v0, :cond_54

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v0, v1, :cond_53

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    if-eq v0, v5, :cond_4d

    .line 27
    .line 28
    const/4 p5, 0x3

    .line 29
    if-ne v0, p5, :cond_47

    .line 30
    .line 31
    iget-object p5, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 32
    .line 33
    invoke-interface {p5}, Lax/S0/h;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide p5

    .line 37
    invoke-static {p5, p6}, Lax/S0/d0;->a1(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p5

    .line 41
    iget-wide v5, p0, Lax/o1/A;->g:J

    .line 42
    .line 43
    sub-long/2addr p5, v5

    .line 44
    iget-boolean v0, p0, Lax/o1/A;->d:Z

    .line 45
    .line 46
    if-eqz v0, :cond_46

    .line 47
    .line 48
    iget-boolean v0, p0, Lax/o1/A;->o:Z

    .line 49
    .line 50
    if-nez v0, :cond_3d

    .line 51
    .line 52
    iget-wide v5, p0, Lax/o1/A;->f:J

    .line 53
    .line 54
    cmp-long v0, v5, v3

    .line 55
    .line 56
    if-eqz v0, :cond_46

    .line 57
    .line 58
    cmp-long v0, v5, p1

    .line 59
    .line 60
    if-eqz v0, :cond_46

    .line 61
    .line 62
    :cond_3d
    iget-object p1, p0, Lax/o1/A;->a:Lax/o1/A$b;

    .line 63
    .line 64
    invoke-interface {p1, p3, p4, p5, p6}, Lax/o1/A$b;->E(JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_46

    .line 69
    .line 70
    return v1

    .line 71
    :cond_46
    return v2

    .line 72
    :cond_47
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4d
    cmp-long p3, p1, p5

    .line 79
    .line 80
    if-ltz p3, :cond_52

    .line 81
    .line 82
    return v1

    .line 83
    :cond_52
    return v2

    .line 84
    :cond_53
    return v1

    .line 85
    :cond_54
    iget-boolean p1, p0, Lax/o1/A;->d:Z

    .line 86
    .line 87
    return p1
    .line 88
.end method


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget v0, p0, Lax/o1/A;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lax/o1/A;->e:I

    .line 7
    .line 8
    :cond_7
    return-void
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

.method public c(JJJJZZLax/o1/A$a;)I
    .registers 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/exoplayer/s;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v9, p11

    .line 8
    .line 9
    invoke-static {v9}, Lax/o1/A$a;->a(Lax/o1/A$a;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v0, Lax/o1/A;->d:Z

    .line 13
    .line 14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    if-eqz v3, :cond_1c

    .line 20
    .line 21
    iget-wide v3, v0, Lax/o1/A;->f:J

    .line 22
    .line 23
    cmp-long v10, v3, v7

    .line 24
    .line 25
    if-nez v10, :cond_1c

    .line 26
    .line 27
    iput-wide v1, v0, Lax/o1/A;->f:J

    .line 28
    .line 29
    :cond_1c
    iget-wide v3, v0, Lax/o1/A;->h:J

    .line 30
    .line 31
    cmp-long v10, v3, v5

    .line 32
    .line 33
    if-eqz v10, :cond_29

    .line 34
    .line 35
    iget-object v3, v0, Lax/o1/A;->b:Lax/o1/D;

    .line 36
    .line 37
    invoke-virtual {v3, v5, v6}, Lax/o1/D;->h(J)V

    .line 38
    .line 39
    .line 40
    iput-wide v5, v0, Lax/o1/A;->h:J

    .line 41
    .line 42
    :cond_29
    move-wide/from16 v3, p5

    .line 43
    .line 44
    invoke-direct/range {v0 .. v6}, Lax/o1/A;->b(JJJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    move-object v10, v0

    .line 49
    invoke-static {v9, v5, v6}, Lax/o1/A$a;->c(Lax/o1/A$a;J)J

    .line 50
    .line 51
    .line 52
    const/16 v16, 0x3

    .line 53
    .line 54
    if-eqz p9, :cond_3a

    .line 55
    .line 56
    if-nez p10, :cond_3a

    .line 57
    .line 58
    return v16

    .line 59
    :cond_3a
    iget-boolean v0, v10, Lax/o1/A;->m:Z

    .line 60
    .line 61
    const/4 v11, 0x4

    .line 62
    const/16 v17, 0x5

    .line 63
    .line 64
    const/4 v12, 0x1

    .line 65
    if-nez v0, :cond_68

    .line 66
    .line 67
    iput-boolean v12, v10, Lax/o1/A;->n:Z

    .line 68
    .line 69
    iget-object v0, v10, Lax/o1/A;->a:Lax/o1/A$b;

    .line 70
    .line 71
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    const/4 v8, 0x1

    .line 76
    move-wide/from16 v3, p3

    .line 77
    .line 78
    move-wide/from16 v5, p5

    .line 79
    .line 80
    move/from16 v7, p10

    .line 81
    .line 82
    invoke-interface/range {v0 .. v8}, Lax/o1/A$b;->g(JJJZZ)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_58

    .line 87
    .line 88
    return v11

    .line 89
    :cond_58
    iget-boolean v0, v10, Lax/o1/A;->d:Z

    .line 90
    .line 91
    if-eqz v0, :cond_67

    .line 92
    .line 93
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    const-wide/16 v2, 0x7530

    .line 98
    .line 99
    cmp-long v4, v0, v2

    .line 100
    .line 101
    if-gez v4, :cond_67

    .line 102
    .line 103
    return v16

    .line 104
    :cond_67
    return v17

    .line 105
    :cond_68
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    move-wide/from16 v1, p3

    .line 110
    .line 111
    move-wide/from16 v5, p7

    .line 112
    .line 113
    move-object v0, v10

    .line 114
    invoke-direct/range {v0 .. v6}, Lax/o1/A;->q(JJJ)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const/4 v0, 0x0

    .line 119
    if-eqz v3, :cond_79

    .line 120
    .line 121
    return v0

    .line 122
    :cond_79
    iget-boolean v1, v10, Lax/o1/A;->d:Z

    .line 123
    .line 124
    if-eqz v1, :cond_e9

    .line 125
    .line 126
    iget-wide v1, v10, Lax/o1/A;->f:J

    .line 127
    .line 128
    cmp-long v3, p3, v1

    .line 129
    .line 130
    if-nez v3, :cond_84

    .line 131
    .line 132
    goto :goto_e9

    .line 133
    :cond_84
    iget-object v1, v10, Lax/o1/A;->l:Lax/S0/h;

    .line 134
    .line 135
    invoke-interface {v1}, Lax/S0/h;->nanoTime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    iget-object v3, v10, Lax/o1/A;->b:Lax/o1/D;

    .line 140
    .line 141
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    const-wide/16 v13, 0x3e8

    .line 146
    .line 147
    mul-long v4, v4, v13

    .line 148
    .line 149
    add-long/2addr v4, v1

    .line 150
    invoke-virtual {v3, v4, v5}, Lax/o1/D;->b(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    invoke-static {v9, v3, v4}, Lax/o1/A$a;->e(Lax/o1/A$a;J)J

    .line 155
    .line 156
    .line 157
    invoke-static {v9}, Lax/o1/A$a;->d(Lax/o1/A$a;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    sub-long/2addr v3, v1

    .line 162
    div-long/2addr v3, v13

    .line 163
    invoke-static {v9, v3, v4}, Lax/o1/A$a;->c(Lax/o1/A$a;J)J

    .line 164
    .line 165
    .line 166
    iget-wide v1, v10, Lax/o1/A;->i:J

    .line 167
    .line 168
    cmp-long v3, v1, v7

    .line 169
    .line 170
    if-eqz v3, :cond_b1

    .line 171
    .line 172
    iget-boolean v1, v10, Lax/o1/A;->j:Z

    .line 173
    .line 174
    if-nez v1, :cond_b1

    .line 175
    .line 176
    const/4 v8, 0x1

    .line 177
    goto :goto_b2

    .line 178
    :cond_b1
    const/4 v8, 0x0

    .line 179
    :goto_b2
    iget-object v0, v10, Lax/o1/A;->a:Lax/o1/A$b;

    .line 180
    .line 181
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v1

    .line 185
    move-wide/from16 v3, p3

    .line 186
    .line 187
    move-wide/from16 v5, p5

    .line 188
    .line 189
    move/from16 v7, p10

    .line 190
    .line 191
    invoke-interface/range {v0 .. v8}, Lax/o1/A$b;->g(JJJZZ)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_c5

    .line 196
    .line 197
    return v11

    .line 198
    :cond_c5
    move-object v0, v10

    .line 199
    iget-object v10, v0, Lax/o1/A;->a:Lax/o1/A$b;

    .line 200
    .line 201
    const/4 v1, 0x1

    .line 202
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    move-wide/from16 v13, p5

    .line 207
    .line 208
    move/from16 v15, p10

    .line 209
    .line 210
    invoke-interface/range {v10 .. v15}, Lax/o1/A$b;->y(JJZ)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_dc

    .line 215
    .line 216
    if-eqz v8, :cond_da

    .line 217
    .line 218
    return v16

    .line 219
    :cond_da
    const/4 v0, 0x2

    .line 220
    return v0

    .line 221
    :cond_dc
    invoke-static {v9}, Lax/o1/A$a;->b(Lax/o1/A$a;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    const-wide/32 v4, 0xc350

    .line 226
    .line 227
    .line 228
    cmp-long v0, v2, v4

    .line 229
    .line 230
    if-lez v0, :cond_e8

    .line 231
    .line 232
    return v17

    .line 233
    :cond_e8
    return v1

    .line 234
    :cond_e9
    :goto_e9
    return v17
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

.method public d(Z)Z
    .registers 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_18

    .line 8
    .line 9
    iget p1, p0, Lax/o1/A;->e:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq p1, v3, :cond_15

    .line 13
    .line 14
    iget-boolean p1, p0, Lax/o1/A;->m:Z

    .line 15
    .line 16
    if-nez p1, :cond_18

    .line 17
    .line 18
    iget-boolean p1, p0, Lax/o1/A;->n:Z

    .line 19
    .line 20
    if-eqz p1, :cond_18

    .line 21
    .line 22
    :cond_15
    iput-wide v1, p0, Lax/o1/A;->i:J

    .line 23
    .line 24
    return v0

    .line 25
    :cond_18
    iget-wide v3, p0, Lax/o1/A;->i:J

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    cmp-long v5, v3, v1

    .line 29
    .line 30
    if-nez v5, :cond_20

    .line 31
    .line 32
    return p1

    .line 33
    :cond_20
    iget-object v3, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 34
    .line 35
    invoke-interface {v3}, Lax/S0/h;->b()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iget-wide v5, p0, Lax/o1/A;->i:J

    .line 40
    .line 41
    cmp-long v7, v3, v5

    .line 42
    .line 43
    if-gez v7, :cond_2d

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2d
    iput-wide v1, p0, Lax/o1/A;->i:J

    .line 47
    .line 48
    return p1
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

.method public e(Z)V
    .registers 6

    .line 1
    iput-boolean p1, p0, Lax/o1/A;->j:Z

    .line 2
    .line 3
    iget-wide v0, p0, Lax/o1/A;->c:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-lez p1, :cond_14

    .line 10
    .line 11
    iget-object p1, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 12
    .line 13
    invoke-interface {p1}, Lax/S0/h;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-wide v2, p0, Lax/o1/A;->c:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    goto :goto_19

    .line 21
    :cond_14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :goto_19
    iput-wide v0, p0, Lax/o1/A;->i:J

    .line 27
    .line 28
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
.end method

.method public g()Z
    .registers 4

    .line 1
    iget v0, p0, Lax/o1/A;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_8
    iput v1, p0, Lax/o1/A;->e:I

    .line 10
    .line 11
    iget-object v1, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 12
    .line 13
    invoke-interface {v1}, Lax/S0/h;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Lax/S0/d0;->a1(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, Lax/o1/A;->g:J

    .line 22
    .line 23
    return v0
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

.method public h()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/o1/A;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/o1/A;->l:Lax/S0/h;

    .line 5
    .line 6
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lax/o1/A;->g:J

    .line 15
    .line 16
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/o1/D;->k()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public i()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/o1/A;->d:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lax/o1/A;->i:J

    .line 10
    .line 11
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 12
    .line 13
    invoke-virtual {v0}, Lax/o1/D;->l()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j(I)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_16

    .line 3
    .line 4
    if-eq p1, v0, :cond_12

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_c

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lax/o1/A;->f(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lax/o1/A;->e:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iput v0, p0, Lax/o1/A;->e:I

    .line 24
    .line 25
    return-void
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

.method public k()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/o1/D;->j()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lax/o1/A;->h:J

    .line 12
    .line 13
    iput-wide v0, p0, Lax/o1/A;->f:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2}, Lax/o1/A;->f(I)V

    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lax/o1/A;->i:J

    .line 20
    .line 21
    return-void
.end method

.method public l(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/D;->o(I)V

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

.method public m(Lax/S0/h;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o1/A;->l:Lax/S0/h;

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
.end method

.method public n(F)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/D;->g(F)V

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

.method public o(Landroid/view/Surface;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v2, 0x0

    .line 8
    :goto_7
    iput-boolean v2, p0, Lax/o1/A;->m:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lax/o1/A;->n:Z

    .line 11
    .line 12
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lax/o1/D;->m(Landroid/view/Surface;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Lax/o1/A;->f(I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public p(F)V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_8
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lax/o1/A;->k:F

    .line 13
    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    iput p1, p0, Lax/o1/A;->k:F

    .line 20
    .line 21
    iget-object v0, p0, Lax/o1/A;->b:Lax/o1/D;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lax/o1/D;->i(F)V

    .line 24
    .line 25
    .line 26
    return-void
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
