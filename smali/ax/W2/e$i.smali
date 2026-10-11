.class Lax/W2/e$i;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/W2/e;


# direct methods
.method public constructor <init>(Lax/W2/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

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
    invoke-virtual {p0, p1}, Lax/W2/e$i;->w([Ljava/lang/Void;)Ljava/lang/Void;

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
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/e$i;->x(Ljava/lang/Void;)V

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
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/W2/e$i;->y(Ljava/lang/Void;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 6

    .line 1
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lax/W2/e;->c2(Lax/W2/e;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 12
    .line 13
    new-instance v0, Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lax/W2/e;->J1(Lax/W2/e;Ljava/util/LinkedList;)Ljava/util/LinkedList;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 22
    .line 23
    new-instance v0, Ljava/util/LinkedList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lax/W2/e;->C0(Lax/W2/e;Ljava/util/LinkedList;)Ljava/util/LinkedList;

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 32
    .line 33
    new-instance v0, Ljava/util/LinkedList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0}, Lax/W2/e;->U1(Lax/W2/e;Ljava/util/LinkedList;)Ljava/util/LinkedList;

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 42
    .line 43
    new-instance v0, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lax/W2/e;->E0(Lax/W2/e;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 49
    .line 50
    .line 51
    :try_start_32
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 52
    .line 53
    invoke-static {p1}, Lax/W2/e;->V1(Lax/W2/e;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_3c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_85

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 72
    .line 73
    iget-object v1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 74
    .line 75
    invoke-static {v1}, Lax/W2/e;->I1(Lax/W2/e;)Ljava/util/LinkedList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 83
    .line 84
    invoke-static {v1}, Lax/W2/e;->D0(Lax/W2/e;)Ljava/util/HashMap;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_75

    .line 104
    .line 105
    instance-of v1, v0, Lcom/voxdon/xplorer/file/y;
    :try_end_6a
    .catch Lax/b3/a; {:try_start_32 .. :try_end_6a} :catch_73

    .line 106
    .line 107
    if-eqz v1, :cond_75

    .line 108
    .line 109
    :try_start_6c
    move-object v1, v0

    .line 110
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->t1()V
    :try_end_72
    .catch Ljava/io/IOException; {:try_start_6c .. :try_end_72} :catch_75
    .catch Lax/b3/a; {:try_start_6c .. :try_end_72} :catch_73

    .line 113
    .line 114
    .line 115
    goto :goto_75

    .line 116
    :catch_73
    nop

    .line 117
    goto :goto_85

    .line 118
    :catch_75
    :cond_75
    :goto_75
    :try_start_75
    iget-object v1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 119
    .line 120
    invoke-static {v1}, Lax/W2/e;->O0(Lax/W2/e;)Lcom/voxdon/xplorer/file/o;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v3, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 125
    .line 126
    invoke-static {v3}, Lax/W2/e;->b2(Lax/W2/e;)Ljava/util/HashMap;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v1, v2, v0, v3, p0}, Lax/W2/e;->A0(Lax/W2/e;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Ljava/util/HashMap;Lax/u3/c;)V
    :try_end_84
    .catch Lax/b3/a; {:try_start_75 .. :try_end_84} :catch_73

    .line 131
    .line 132
    .line 133
    goto :goto_3c

    .line 134
    :cond_85
    :goto_85
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 135
    .line 136
    invoke-static {p1}, Lax/W2/e;->K0(Lax/W2/e;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_ce

    .line 141
    .line 142
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 143
    .line 144
    invoke-static {p1}, Lax/W2/e;->W1(Lax/W2/e;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {p1, v0}, Lax/W2/e;->M0(Lax/W2/e;Z)Z

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 152
    .line 153
    invoke-static {p1}, Lax/W2/e;->L0(Lax/W2/e;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_ce

    .line 158
    .line 159
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 160
    .line 161
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const/4 v0, 0x1

    .line 166
    invoke-virtual {p1, v0}, Lax/W2/v;->f0(Z)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 170
    .line 171
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iget-object v0, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 176
    .line 177
    invoke-virtual {v0}, Lax/W2/j;->w()Lax/W2/v;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lax/W2/v;->M()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {p1, v0}, Lax/W2/v;->V(I)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 189
    .line 190
    invoke-virtual {p1}, Lax/W2/j;->w()Lax/W2/v;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object v0, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 195
    .line 196
    invoke-static {v0}, Lax/W2/e;->V1(Lax/W2/e;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-virtual {p1, v0}, Lax/W2/v;->g(I)V

    .line 205
    .line 206
    .line 207
    :cond_ce
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 208
    .line 209
    invoke-static {p1}, Lax/W2/e;->Y1(Lax/W2/e;)V

    .line 210
    .line 211
    .line 212
    const/4 p1, 0x0

    .line 213
    return-object p1
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

.method protected x(Ljava/lang/Void;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

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

.method protected y(Ljava/lang/Void;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/W2/j;->k0()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/W2/e$i;->h:Lax/W2/e;

    .line 7
    .line 8
    invoke-static {p1}, Lax/W2/e;->R1(Lax/W2/e;)V

    .line 9
    .line 10
    .line 11
    return-void
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
