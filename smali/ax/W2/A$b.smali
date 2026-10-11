.class Lax/W2/A$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/A;


# direct methods
.method public constructor <init>(Lax/W2/A;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
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
    .line 22
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/A$b;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/A$b;->x(Ljava/lang/Boolean;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/A$b;->y(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 7

    .line 1
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lax/W2/A;->x0(Lax/W2/A;Z)Z

    .line 5
    .line 6
    .line 7
    :goto_6
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 8
    .line 9
    invoke-static {p1}, Lax/W2/A;->y0(Lax/W2/A;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ge v0, p1, :cond_119

    .line 19
    .line 20
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 21
    .line 22
    invoke-static {p1}, Lax/W2/A;->y0(Lax/W2/A;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lax/W2/A;->A0(Lax/W2/A;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 36
    .line 37
    invoke-static {p1}, Lax/W2/A;->D0(Lax/W2/A;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1, v2}, Lax/W2/A;->C0(Lax/W2/A;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 51
    .line 52
    invoke-static {p1}, Lax/W2/A;->z0(Lax/W2/A;)Lcom/voxdon/xplorer/file/n;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_b6

    .line 57
    .line 58
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 59
    .line 60
    invoke-static {p1}, Lax/W2/A;->B0(Lax/W2/A;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-nez p1, :cond_b6

    .line 65
    .line 66
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v2, "RENAME TARGET FILENAME NULL"

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v3, "size:"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 91
    .line 92
    invoke-static {v3}, Lax/W2/A;->y0(Lax/W2/A;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v3, ","

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 109
    .line 110
    invoke-static {v4}, Lax/W2/A;->D0(Lax/W2/A;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 125
    .line 126
    invoke-static {v3}, Lax/W2/A;->z0(Lax/W2/A;)Lcom/voxdon/xplorer/file/n;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v3}, Lax/c3/K;->k()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {p1, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 153
    .line 154
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v2, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 159
    .line 160
    invoke-virtual {p1, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 164
    .line 165
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object v1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 170
    .line 171
    invoke-static {v1}, Lax/W2/A;->z0(Lax/W2/A;)Lcom/voxdon/xplorer/file/n;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {p1, v1}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_115

    .line 183
    :cond_b6
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 184
    .line 185
    invoke-virtual {p1, v1}, Lax/W2/j;->l0(Z)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 189
    .line 190
    invoke-static {p1}, Lax/W2/A;->z0(Lax/W2/A;)Lcom/voxdon/xplorer/file/n;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object v2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 195
    .line 196
    invoke-static {v2}, Lax/W2/A;->B0(Lax/W2/A;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {p0, p1, v2}, Lax/W2/A$b;->z(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_f7

    .line 205
    .line 206
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 207
    .line 208
    invoke-static {p1}, Lax/W2/A;->E0(Lax/W2/A;)Lax/B/b;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iget-object v2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 213
    .line 214
    invoke-static {v2}, Lax/W2/A;->B0(Lax/W2/A;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {p1, v2}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 222
    .line 223
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    sget-object v2, Lax/W2/v$b;->q:Lax/W2/v$b;

    .line 228
    .line 229
    invoke-virtual {p1, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 233
    .line 234
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget-object v1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 239
    .line 240
    invoke-static {v1}, Lax/W2/A;->B0(Lax/W2/A;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {p1, v1}, Lax/W2/v;->f(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_115

    .line 248
    :cond_f7
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 249
    .line 250
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    sget-object v2, Lax/W2/v$b;->c0:Lax/W2/v$b;

    .line 255
    .line 256
    invoke-virtual {p1, v2, v1}, Lax/W2/v;->c(Lax/W2/v$b;I)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 260
    .line 261
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    iget-object v1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 266
    .line 267
    invoke-static {v1}, Lax/W2/A;->z0(Lax/W2/A;)Lcom/voxdon/xplorer/file/n;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {p1, v1}, Lax/W2/v;->b(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :goto_115
    add-int/lit8 v0, v0, 0x1

    .line 279
    .line 280
    goto/16 :goto_6

    .line 281
    .line 282
    :cond_119
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 283
    .line 284
    invoke-virtual {p1, v1}, Lax/W2/j;->l0(Z)V

    .line 285
    .line 286
    .line 287
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 288
    .line 289
    return-object p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->g0()V

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

.method protected y(Ljava/lang/Boolean;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->o()V

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

.method z(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Z
    .registers 8

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p2}, Lax/c3/d0;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v0, :cond_48

    .line 24
    .line 25
    :try_start_18
    iget-object v0, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 26
    .line 27
    invoke-static {v0}, Lax/W2/A;->w0(Lax/W2/A;)Lcom/voxdon/xplorer/file/o;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p1}, Lax/c3/B;->z(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_25

    .line 36
    .line 37
    return v3

    .line 38
    :cond_25
    iget-object v4, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 39
    .line 40
    invoke-static {v4}, Lax/W2/A;->w0(Lax/W2/A;)Lcom/voxdon/xplorer/file/o;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, p1, v0, p0, v2}, Lcom/voxdon/xplorer/file/o;->m0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 48
    .line 49
    invoke-static {v4}, Lax/W2/A;->w0(Lax/W2/A;)Lcom/voxdon/xplorer/file/o;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v4, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_3c
    .catch Lax/b3/j; {:try_start_18 .. :try_end_3c} :catch_3f
    .catch Lax/b3/a; {:try_start_18 .. :try_end_3c} :catch_41

    .line 61
    if-nez v0, :cond_49

    .line 62
    .line 63
    return v3

    .line 64
    :catch_3f
    move-exception p1

    .line 65
    goto :goto_42

    .line 66
    :catch_41
    return v3

    .line 67
    :goto_42
    iget-object p2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 70
    .line 71
    .line 72
    return v3

    .line 73
    :cond_48
    move-object v0, p1

    .line 74
    :cond_49
    :try_start_49
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, p2}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 83
    .line 84
    invoke-static {p2}, Lax/W2/A;->w0(Lax/W2/A;)Lcom/voxdon/xplorer/file/o;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-nez p1, :cond_5e

    .line 93
    .line 94
    return v3

    .line 95
    :cond_5e
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_6c

    .line 100
    .line 101
    iget-object p1, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 102
    .line 103
    invoke-static {p1, v1}, Lax/W2/A;->x0(Lax/W2/A;Z)Z

    .line 104
    .line 105
    .line 106
    return v3

    .line 107
    :catch_6a
    move-exception p1

    .line 108
    goto :goto_77

    .line 109
    :cond_6c
    iget-object p2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 110
    .line 111
    invoke-static {p2}, Lax/W2/A;->w0(Lax/W2/A;)Lcom/voxdon/xplorer/file/o;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2, v0, p1, p0, v2}, Lcom/voxdon/xplorer/file/o;->m0(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    :try_end_75
    .catch Lax/b3/j; {:try_start_49 .. :try_end_75} :catch_6a
    .catch Lax/b3/a; {:try_start_49 .. :try_end_75} :catch_76

    .line 116
    .line 117
    .line 118
    return v1

    .line 119
    :catch_76
    return v3

    .line 120
    :goto_77
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Lax/W2/A$b;->h:Lax/W2/A;

    .line 124
    .line 125
    invoke-virtual {p2, p1}, Lax/W2/j;->q0(Lax/b3/j;)I

    .line 126
    .line 127
    .line 128
    return v3
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
