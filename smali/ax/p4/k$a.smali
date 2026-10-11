.class Lax/p4/k$a;
.super Lax/t4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/t4/b<",
        "Lax/p4/k;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/t4/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public bridge synthetic d(Lax/T4/j;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/t4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/p4/k$a;->m(Lax/T4/j;)Lax/p4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public m(Lax/T4/j;)Lax/p4/k;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/t4/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/T4/m;->r0:Lax/T4/m;

    .line 6
    .line 7
    if-ne v0, v1, :cond_14

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/T4/j;->u()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Lax/t4/b;->c(Lax/T4/j;)Lax/T4/m;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lax/p4/k;->a(Ljava/lang/String;)Lax/p4/k;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_14
    sget-object v1, Lax/T4/m;->l0:Lax/T4/m;

    .line 22
    .line 23
    if-ne v0, v1, :cond_ba

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/T4/j;->v()Lax/T4/h;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, Lax/t4/b;->c(Lax/T4/j;)Lax/T4/m;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    move-object v2, v1

    .line 34
    move-object v3, v2

    .line 35
    move-object v4, v3

    .line 36
    :goto_23
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Lax/T4/m;->p0:Lax/T4/m;

    .line 41
    .line 42
    if-ne v5, v6, :cond_89

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 49
    .line 50
    .line 51
    :try_start_32
    const-string v6, "api"

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_45

    .line 58
    .line 59
    sget-object v6, Lax/t4/b;->h:Lax/t4/b;

    .line 60
    .line 61
    invoke-virtual {v6, p1, v5, v1}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_23

    .line 68
    :catch_43
    move-exception p1

    .line 69
    goto :goto_84

    .line 70
    :cond_45
    const-string v6, "content"

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_56

    .line 77
    .line 78
    sget-object v6, Lax/t4/b;->h:Lax/t4/b;

    .line 79
    .line 80
    invoke-virtual {v6, p1, v5, v2}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_23

    .line 87
    :cond_56
    const-string v6, "web"

    .line 88
    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_67

    .line 94
    .line 95
    sget-object v6, Lax/t4/b;->h:Lax/t4/b;

    .line 96
    .line 97
    invoke-virtual {v6, p1, v5, v3}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ljava/lang/String;

    .line 102
    .line 103
    goto :goto_23

    .line 104
    :cond_67
    const-string v6, "notify"

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_78

    .line 111
    .line 112
    sget-object v6, Lax/t4/b;->h:Lax/t4/b;

    .line 113
    .line 114
    invoke-virtual {v6, p1, v5, v4}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/String;

    .line 119
    .line 120
    goto :goto_23

    .line 121
    :cond_78
    new-instance v0, Lax/t4/a;

    .line 122
    .line 123
    const-string v1, "unknown field"

    .line 124
    .line 125
    invoke-virtual {p1}, Lax/T4/j;->f()Lax/T4/h;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, v1, p1}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_84
    .catch Lax/t4/a; {:try_start_32 .. :try_end_84} :catch_43

    .line 133
    :goto_84
    invoke-virtual {p1, v5}, Lax/t4/a;->a(Ljava/lang/String;)Lax/t4/a;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    throw p1

    .line 138
    :cond_89
    invoke-static {p1}, Lax/t4/b;->a(Lax/T4/j;)V

    .line 139
    .line 140
    .line 141
    if-eqz v1, :cond_b2

    .line 142
    .line 143
    if-eqz v2, :cond_aa

    .line 144
    .line 145
    if-eqz v3, :cond_a2

    .line 146
    .line 147
    if-eqz v4, :cond_9a

    .line 148
    .line 149
    new-instance p1, Lax/p4/k;

    .line 150
    .line 151
    invoke-direct {p1, v1, v2, v3, v4}, Lax/p4/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object p1

    .line 155
    :cond_9a
    new-instance p1, Lax/t4/a;

    .line 156
    .line 157
    const-string v1, "missing field \"notify\""

    .line 158
    .line 159
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 160
    .line 161
    .line 162
    throw p1

    .line 163
    :cond_a2
    new-instance p1, Lax/t4/a;

    .line 164
    .line 165
    const-string v1, "missing field \"web\""

    .line 166
    .line 167
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_aa
    new-instance p1, Lax/t4/a;

    .line 172
    .line 173
    const-string v1, "missing field \"content\""

    .line 174
    .line 175
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_b2
    new-instance p1, Lax/t4/a;

    .line 180
    .line 181
    const-string v1, "missing field \"api\""

    .line 182
    .line 183
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_ba
    new-instance v0, Lax/t4/a;

    .line 188
    .line 189
    const-string v1, "expecting a string or an object"

    .line 190
    .line 191
    invoke-virtual {p1}, Lax/T4/j;->v()Lax/T4/h;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {v0, v1, p1}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 196
    .line 197
    .line 198
    throw v0
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
