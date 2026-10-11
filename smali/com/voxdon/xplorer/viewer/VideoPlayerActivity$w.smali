.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/H$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "w"
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;


# direct methods
.method private constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$k;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    return-void
.end method


# virtual methods
.method public synthetic D(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->r(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic E(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->k(Lax/P0/H$d;Z)V

    return-void
.end method

.method public F(I)V
    .registers 3

    .line 1
    if-nez p1, :cond_10

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x2

    .line 10
    if-ne p1, v0, :cond_10

    .line 11
    .line 12
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->m1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public H(Lax/P0/V;)V
    .registers 14

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->U0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lcom/voxdon/xplorer/viewer/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/g;->q()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lax/P0/V;->a()Lax/r7/z;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->V0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/r7/z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eq p1, v0, :cond_18b

    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Y0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->b1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->d1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Lax/l1/n;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lax/l1/G;->o()Lax/l1/G$a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_181

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    invoke-virtual {v0, v2}, Lax/l1/G$a;->i(I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const-string v4, ", container : "

    .line 61
    .line 62
    const-string v5, ",container : "

    .line 63
    .line 64
    const-string v6, "codec : "

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    if-ne v3, v7, :cond_9f

    .line 68
    .line 69
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 70
    .line 71
    const-string v8, "video"

    .line 72
    .line 73
    invoke-static {v3, p1, v8}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/r7/z;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v8, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 78
    .line 79
    invoke-static {v8}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v9}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    const-string v10, "video codec not available"

    .line 92
    .line 93
    invoke-virtual {v9, v10}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    new-instance v10, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v9, v10}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-virtual {v9}, Lax/Ha/b;->h()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0()Ljava/util/logging/Logger;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    new-instance v10, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v11, "video codec not available : "

    .line 135
    .line 136
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-virtual {v9, v8}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v8, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 156
    .line 157
    invoke-static {v8, v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_9f
    invoke-virtual {v0, v7}, Lax/l1/G$a;->i(I)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    const/4 v8, 0x3

    .line 165
    if-ne v3, v7, :cond_102

    .line 166
    .line 167
    iget-object v3, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 168
    .line 169
    const-string v9, "audio"

    .line 170
    .line 171
    invoke-static {v3, p1, v9}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->e1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/r7/z;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget-object v9, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 176
    .line 177
    invoke-static {v9}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->f1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v10}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    const-string v11, "audio codec not available"

    .line 190
    .line 191
    invoke-virtual {v10, v11}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    new-instance v11, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v10, v5}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v5}, Lax/Ha/b;->h()V

    .line 221
    .line 222
    .line 223
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0()Ljava/util/logging/Logger;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    new-instance v6, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v10, "audio codec not available : "

    .line 233
    .line 234
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 254
    .line 255
    invoke-static {v4, v3}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->g1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_12f

    .line 259
    :cond_102
    if-ne v3, v8, :cond_12f

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    :goto_105
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-ge v3, v4, :cond_12f

    .line 267
    .line 268
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, Lax/P0/V$a;

    .line 273
    .line 274
    invoke-virtual {v4}, Lax/P0/V$a;->d()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eq v5, v7, :cond_118

    .line 279
    .line 280
    goto :goto_12c

    .line 281
    :cond_118
    const/4 v5, 0x0

    .line 282
    :goto_119
    iget v6, v4, Lax/P0/V$a;->a:I

    .line 283
    .line 284
    if-ge v5, v6, :cond_12c

    .line 285
    .line 286
    invoke-virtual {v4, v5}, Lax/P0/V$a;->j(I)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_124

    .line 291
    .line 292
    goto :goto_129

    .line 293
    :cond_124
    iget-object v6, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 294
    .line 295
    invoke-static {v6}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->c1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 296
    .line 297
    .line 298
    :goto_129
    add-int/lit8 v5, v5, 0x1

    .line 299
    .line 300
    goto :goto_119

    .line 301
    :cond_12c
    :goto_12c
    add-int/lit8 v3, v3, 0x1

    .line 302
    .line 303
    goto :goto_105

    .line 304
    :cond_12f
    :goto_12f
    invoke-virtual {v0, v8}, Lax/l1/G$a;->i(I)I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-ne v0, v8, :cond_17b

    .line 309
    .line 310
    const/4 v0, 0x0

    .line 311
    :goto_136
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-ge v0, v3, :cond_175

    .line 316
    .line 317
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    check-cast v3, Lax/P0/V$a;

    .line 322
    .line 323
    invoke-virtual {v3}, Lax/P0/V$a;->d()I

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eq v4, v8, :cond_149

    .line 328
    .line 329
    goto :goto_172

    .line 330
    :cond_149
    const/4 v4, 0x0

    .line 331
    :goto_14a
    iget v5, v3, Lax/P0/V$a;->a:I

    .line 332
    .line 333
    if-ge v4, v5, :cond_172

    .line 334
    .line 335
    invoke-virtual {v3, v4}, Lax/P0/V$a;->j(I)Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-nez v5, :cond_155

    .line 340
    .line 341
    goto :goto_16f

    .line 342
    :cond_155
    invoke-virtual {v3, v4}, Lax/P0/V$a;->b(I)Lax/P0/v;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    iget v5, v5, Lax/P0/v;->e:I

    .line 347
    .line 348
    and-int/2addr v5, v2

    .line 349
    if-eqz v5, :cond_15f

    .line 350
    .line 351
    goto :goto_16f

    .line 352
    :cond_15f
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 353
    .line 354
    invoke-static {v5}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Z0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Lax/P0/V$a;->f()Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_16f

    .line 362
    .line 363
    iget-object v5, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 364
    .line 365
    invoke-static {v5, v7}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->X0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 366
    .line 367
    .line 368
    :cond_16f
    :goto_16f
    add-int/lit8 v4, v4, 0x1

    .line 369
    .line 370
    goto :goto_14a

    .line 371
    :cond_172
    :goto_172
    add-int/lit8 v0, v0, 0x1

    .line 372
    .line 373
    goto :goto_136

    .line 374
    :cond_175
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 375
    .line 376
    invoke-static {v0, v7}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 377
    .line 378
    .line 379
    goto :goto_186

    .line 380
    :cond_17b
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 381
    .line 382
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 383
    .line 384
    .line 385
    goto :goto_186

    .line 386
    :cond_181
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 387
    .line 388
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->h1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 389
    .line 390
    .line 391
    :goto_186
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 392
    .line 393
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->W0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Lax/r7/z;)Lax/r7/z;

    .line 394
    .line 395
    .line 396
    :cond_18b
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 397
    .line 398
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 399
    .line 400
    .line 401
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 402
    .line 403
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->i1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 404
    .line 405
    .line 406
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 407
    .line 408
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 409
    .line 410
    .line 411
    return-void
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

.method public synthetic I(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->i(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic J(Lax/P0/F;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->t(Lax/P0/H$d;Lax/P0/F;)V

    return-void
.end method

.method public synthetic L(F)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->G(Lax/P0/H$d;F)V

    return-void
.end method

.method public N(Lax/P0/F;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->Q0(Lax/P0/F;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_11

    .line 6
    .line 7
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->S0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->T0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public synthetic O(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->q(Lax/P0/H$d;I)V

    return-void
.end method

.method public P(Lax/P0/N;I)V
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

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

.method public S(Z)V
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

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

.method public synthetic U(Lax/P0/T;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->D(Lax/P0/H$d;Lax/P0/T;)V

    return-void
.end method

.method public synthetic W(Lax/P0/H$b;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->c(Lax/P0/H$d;Lax/P0/H$b;)V

    return-void
.end method

.method public synthetic Y(IZ)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->g(Lax/P0/H$d;IZ)V

    return-void
.end method

.method public Z(ZI)V
    .registers 9

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "player state changed : "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, ","

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x4

    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p2, p1, :cond_46

    .line 36
    .line 37
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3a

    .line 44
    .line 45
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3a

    .line 52
    .line 53
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->r0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->v0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_13a

    .line 70
    .line 71
    :cond_46
    const/4 p1, 0x3

    .line 72
    const/4 v1, 0x0

    .line 73
    if-ne p2, p1, :cond_12d

    .line 74
    .line 75
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->w0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7c

    .line 82
    .line 83
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->t0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_7c

    .line 90
    .line 91
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 92
    .line 93
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->q0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_7c

    .line 98
    .line 99
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 100
    .line 101
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-lez p1, :cond_7c

    .line 106
    .line 107
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 108
    .line 109
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->y0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/os/Handler;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 114
    .line 115
    iget-object v2, p2, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K1:Ljava/lang/Runnable;

    .line 116
    .line 117
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->x0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    int-to-long v3, p2

    .line 122
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 123
    .line 124
    .line 125
    :cond_7c
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 126
    .line 127
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 132
    .line 133
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_f0

    .line 138
    .line 139
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 140
    .line 141
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    if-eqz p2, :cond_9e

    .line 146
    .line 147
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 148
    .line 149
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->C0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-nez p2, :cond_f0

    .line 158
    .line 159
    :cond_9e
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 160
    .line 161
    invoke-static {p2, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->A0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)Z

    .line 162
    .line 163
    .line 164
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 165
    .line 166
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->D0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Landroid/net/Uri;)Landroid/net/Uri;

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 170
    .line 171
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->n1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-interface {p2}, Lax/P0/H;->g0()J

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    const-wide/16 v4, 0x0

    .line 180
    .line 181
    cmp-long p2, v2, v4

    .line 182
    .line 183
    if-gez p2, :cond_ba

    .line 184
    .line 185
    const-wide/16 v2, -0x1

    .line 186
    .line 187
    :cond_ba
    if-eqz p1, :cond_cb

    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    if-eqz p2, :cond_cb

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1}, Lax/c3/d0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    goto :goto_cd

    .line 204
    :cond_cb
    const-string p1, "uri_error"

    .line 205
    .line 206
    :goto_cd
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    const-string v0, "video_player_ready"

    .line 211
    .line 212
    invoke-virtual {p2, v0}, Lax/Q2/a;->o(Ljava/lang/String;)Lax/Q2/a$d;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    const-string v0, "duration_ms"

    .line 217
    .line 218
    invoke-virtual {p2, v0, v2, v3}, Lax/Q2/a$d;->a(Ljava/lang/String;J)Lax/Q2/a$d;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    const-string v0, "duration_range"

    .line 223
    .line 224
    invoke-static {v2, v3}, Lax/Q2/a$g;->a(J)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {p2, v0, v2}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    const-string v0, "ext"

    .line 233
    .line 234
    invoke-virtual {p2, v0, p1}, Lax/Q2/a$d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$d;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1}, Lax/Q2/a$d;->c()V

    .line 239
    .line 240
    .line 241
    :cond_f0
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 242
    .line 243
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 247
    .line 248
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 249
    .line 250
    .line 251
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 252
    .line 253
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->F0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_113

    .line 258
    .line 259
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 260
    .line 261
    const p2, 0x7f0604bb

    .line 262
    .line 263
    .line 264
    invoke-static {p1, p2}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 269
    .line 270
    const-wide/16 v0, 0x96

    .line 271
    .line 272
    invoke-static {p2, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;J)J

    .line 273
    .line 274
    .line 275
    goto :goto_123

    .line 276
    :cond_113
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 277
    .line 278
    const p2, 0x7f0604ba

    .line 279
    .line 280
    .line 281
    invoke-static {p1, p2}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 286
    .line 287
    const-wide/16 v0, 0x12c

    .line 288
    .line 289
    invoke-static {p2, v0, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->G0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;J)J

    .line 290
    .line 291
    .line 292
    :goto_123
    iget-object p2, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 293
    .line 294
    invoke-static {p2}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->H0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroidx/media3/ui/b;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    invoke-virtual {p2, p1}, Landroidx/media3/ui/b;->setBufferedColor(I)V

    .line 299
    .line 300
    .line 301
    goto :goto_13a

    .line 302
    :cond_12d
    const/4 p1, 0x2

    .line 303
    if-ne p2, p1, :cond_13a

    .line 304
    .line 305
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 306
    .line 307
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->E0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 308
    .line 309
    .line 310
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 311
    .line 312
    invoke-static {p1, v1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->u0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 313
    .line 314
    .line 315
    :cond_13a
    :goto_13a
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 316
    .line 317
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->N0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 321
    .line 322
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->I0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 323
    .line 324
    .line 325
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 326
    .line 327
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->J0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 328
    .line 329
    .line 330
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 331
    .line 332
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->K0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 333
    .line 334
    .line 335
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 336
    .line 337
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 338
    .line 339
    .line 340
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 341
    .line 342
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->M0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 343
    .line 344
    .line 345
    return-void
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

.method public synthetic a(Lax/P0/a0;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->F(Lax/P0/H$d;Lax/P0/a0;)V

    return-void
.end method

.method public synthetic a0(Lax/P0/y;I)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->l(Lax/P0/H$d;Lax/P0/y;I)V

    return-void
.end method

.method public synthetic b0()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/P0/I;->x(Lax/P0/H$d;)V

    return-void
.end method

.method public synthetic c(I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->b(Lax/P0/H$d;I)V

    return-void
.end method

.method public synthetic c0(Lax/P0/H;Lax/P0/H$c;)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->h(Lax/P0/H$d;Lax/P0/H;Lax/P0/H$c;)V

    return-void
.end method

.method public synthetic e(Z)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->A(Lax/P0/H$d;Z)V

    return-void
.end method

.method public synthetic i0(ZI)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->o(Lax/P0/H$d;ZI)V

    return-void
.end method

.method public synthetic j(Lax/P0/G;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->p(Lax/P0/H$d;Lax/P0/G;)V

    return-void
.end method

.method public synthetic j0(Lax/P0/A;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->m(Lax/P0/H$d;Lax/P0/A;)V

    return-void
.end method

.method public synthetic k0(Lax/P0/n;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->f(Lax/P0/H$d;Lax/P0/n;)V

    return-void
.end method

.method public synthetic o0(II)V
    .registers 3

    .line 1
    invoke-static {p0, p1, p2}, Lax/P0/I;->B(Lax/P0/H$d;II)V

    return-void
.end method

.method public synthetic p0(Lax/P0/H$e;Lax/P0/H$e;I)V
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/P0/I;->w(Lax/P0/H$d;Lax/P0/H$e;Lax/P0/H$e;I)V

    return-void
.end method

.method public synthetic r(Lax/P0/C;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->n(Lax/P0/H$d;Lax/P0/C;)V

    return-void
.end method

.method public synthetic r0(Lax/P0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->a(Lax/P0/H$d;Lax/P0/c;)V

    return-void
.end method

.method public synthetic s(Lax/R0/c;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->d(Lax/P0/H$d;Lax/R0/c;)V

    return-void
.end method

.method public synthetic t(Ljava/util/List;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/P0/I;->e(Lax/P0/H$d;Ljava/util/List;)V

    return-void
.end method

.method public t0(Z)V
    .registers 5

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->s0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "VideoPlayer : isPlaying="

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_26

    .line 26
    .line 27
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->P0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->O0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;Z)V

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
.end method

.method public v(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_d

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lax/t3/l;->k(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->l1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)I

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->o1(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$w;->a:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->L0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V

    .line 27
    .line 28
    .line 29
    return-void
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
