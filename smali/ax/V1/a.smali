.class public final Lax/V1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N1/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/V1/a$b;
    }
.end annotation


# instance fields
.field private final a:Lax/S0/G;

.field private final b:Lax/S0/G;

.field private final c:Lax/V1/a$b;

.field private d:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/S0/G;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 10
    .line 11
    new-instance v0, Lax/S0/G;

    .line 12
    .line 13
    invoke-direct {v0}, Lax/S0/G;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/V1/a;->b:Lax/S0/G;

    .line 17
    .line 18
    new-instance v0, Lax/V1/a$b;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/V1/a$b;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/V1/a;->c:Lax/V1/a$b;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [B

    .line 33
    .line 34
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 35
    .line 36
    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lax/V1/a$b;->i(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method private e()Lax/R0/a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/V1/a;->d:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Ljava/util/zip/Inflater;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/V1/a;->d:Ljava/util/zip/Inflater;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 13
    .line 14
    iget-object v1, p0, Lax/V1/a;->b:Lax/S0/G;

    .line 15
    .line 16
    iget-object v2, p0, Lax/V1/a;->d:Ljava/util/zip/Inflater;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lax/S0/d0;->V0(Lax/S0/G;Lax/S0/G;Ljava/util/zip/Inflater;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_28

    .line 23
    .line 24
    iget-object v0, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 25
    .line 26
    iget-object v1, p0, Lax/V1/a;->b:Lax/S0/G;

    .line 27
    .line 28
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lax/V1/a;->b:Lax/S0/G;

    .line 33
    .line 34
    invoke-virtual {v2}, Lax/S0/G;->j()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0, v1, v2}, Lax/S0/G;->Z([BI)V

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object v0, p0, Lax/V1/a;->c:Lax/V1/a$b;

    .line 42
    .line 43
    invoke-virtual {v0}, Lax/V1/a$b;->m()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 47
    .line 48
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x2

    .line 53
    if-lt v0, v1, :cond_4f

    .line 54
    .line 55
    iget-object v1, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 56
    .line 57
    invoke-virtual {v1}, Lax/S0/G;->U()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eq v1, v0, :cond_3f

    .line 62
    .line 63
    goto :goto_4f

    .line 64
    :cond_3f
    iget-object v0, p0, Lax/V1/a;->c:Lax/V1/a$b;

    .line 65
    .line 66
    iget-object v1, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lax/V1/a$b;->l(Lax/S0/G;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lax/V1/a;->c:Lax/V1/a$b;

    .line 72
    .line 73
    iget-object v1, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lax/V1/a$b;->a(Lax/S0/G;)Lax/R0/a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :cond_4f
    :goto_4f
    const/4 v0, 0x0

    .line 81
    return-object v0
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


# virtual methods
.method public synthetic a()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/N1/s;->b(Lax/N1/t;)V

    return-void
.end method

.method public synthetic b([BII)Lax/N1/k;
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/N1/s;->a(Lax/N1/t;[BII)Lax/N1/k;

    move-result-object p1

    return-object p1
.end method

.method public c([BIILax/N1/t$b;Lax/S0/l;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lax/N1/t$b;",
            "Lax/S0/l<",
            "Lax/N1/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p4, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 2
    .line 3
    add-int/2addr p3, p2

    .line 4
    invoke-virtual {p4, p1, p3}, Lax/S0/G;->Z([BI)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lax/V1/a;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lax/S0/G;->b0(I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/V1/a;->e()Lax/R0/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lax/N1/e;

    .line 17
    .line 18
    if-eqz p1, :cond_19

    .line 19
    .line 20
    invoke-static {p1}, Lax/r7/z;->A(Ljava/lang/Object;)Lax/r7/z;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_17
    move-object v1, p1

    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_17

    .line 31
    :goto_1e
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/32 v4, 0x4c4b40

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v5}, Lax/N1/e;-><init>(Ljava/util/List;JJ)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p5, v0}, Lax/S0/l;->accept(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
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

.method public d()I
    .registers 2

    .line 1
    const/4 v0, 0x2

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
