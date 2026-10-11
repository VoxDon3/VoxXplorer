.class Lax/p4/h$a;
.super Lax/t4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/t4/b<",
        "Lax/p4/h;",
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
    invoke-virtual {p0, p1}, Lax/p4/h$a;->m(Lax/T4/j;)Lax/p4/h;

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

.method public m(Lax/T4/j;)Lax/p4/h;
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/t4/a;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/t4/b;->b(Lax/T4/j;)Lax/T4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v3, v1

    .line 7
    move-object v4, v3

    .line 8
    move-object v5, v4

    .line 9
    move-object v6, v5

    .line 10
    move-object v7, v6

    .line 11
    move-object v8, v7

    .line 12
    move-object v9, v8

    .line 13
    move-object v10, v9

    .line 14
    :goto_d
    invoke-virtual {p1}, Lax/T4/j;->j()Lax/T4/m;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v11, Lax/T4/m;->p0:Lax/T4/m;

    .line 19
    .line 20
    if-ne v2, v11, :cond_c6

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/T4/j;->g()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {p1}, Lax/t4/b;->c(Lax/T4/j;)Lax/T4/m;

    .line 27
    .line 28
    .line 29
    :try_start_1c
    const-string v11, "token_type"

    .line 30
    .line 31
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    if-eqz v11, :cond_31

    .line 36
    .line 37
    sget-object v11, Lax/p4/h;->k:Lax/t4/b;

    .line 38
    .line 39
    invoke-virtual {v11, p1, v2, v1}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_d

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto/16 :goto_c1

    .line 49
    .line 50
    :cond_31
    const-string v11, "access_token"

    .line 51
    .line 52
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-eqz v11, :cond_42

    .line 57
    .line 58
    sget-object v11, Lax/p4/h;->l:Lax/t4/b;

    .line 59
    .line 60
    invoke-virtual {v11, p1, v2, v3}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_d

    .line 67
    :cond_42
    const-string v11, "expires_in"

    .line 68
    .line 69
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-eqz v11, :cond_53

    .line 74
    .line 75
    sget-object v11, Lax/t4/b;->d:Lax/t4/b;

    .line 76
    .line 77
    invoke-virtual {v11, p1, v2, v4}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Ljava/lang/Long;

    .line 82
    .line 83
    goto :goto_d

    .line 84
    :cond_53
    const-string v11, "refresh_token"

    .line 85
    .line 86
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-eqz v11, :cond_64

    .line 91
    .line 92
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 93
    .line 94
    invoke-virtual {v11, p1, v2, v5}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    goto :goto_d

    .line 101
    :cond_64
    const-string v11, "uid"

    .line 102
    .line 103
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_75

    .line 108
    .line 109
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 110
    .line 111
    invoke-virtual {v11, p1, v2, v6}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_d

    .line 118
    :cond_75
    const-string v11, "account_id"

    .line 119
    .line 120
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-eqz v11, :cond_86

    .line 125
    .line 126
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 127
    .line 128
    invoke-virtual {v11, p1, v2, v8}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    check-cast v8, Ljava/lang/String;

    .line 133
    .line 134
    goto :goto_d

    .line 135
    :cond_86
    const-string v11, "team_id"

    .line 136
    .line 137
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_98

    .line 142
    .line 143
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 144
    .line 145
    invoke-virtual {v11, p1, v2, v7}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Ljava/lang/String;

    .line 150
    .line 151
    goto/16 :goto_d

    .line 152
    .line 153
    :cond_98
    const-string v11, "state"

    .line 154
    .line 155
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_aa

    .line 160
    .line 161
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 162
    .line 163
    invoke-virtual {v11, p1, v2, v9}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    check-cast v9, Ljava/lang/String;

    .line 168
    .line 169
    goto/16 :goto_d

    .line 170
    .line 171
    :cond_aa
    const-string v11, "scope"

    .line 172
    .line 173
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    if-eqz v11, :cond_bc

    .line 178
    .line 179
    sget-object v11, Lax/t4/b;->h:Lax/t4/b;

    .line 180
    .line 181
    invoke-virtual {v11, p1, v2, v10}, Lax/t4/b;->f(Lax/T4/j;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    check-cast v10, Ljava/lang/String;

    .line 186
    .line 187
    goto/16 :goto_d

    .line 188
    .line 189
    :cond_bc
    invoke-static {p1}, Lax/t4/b;->k(Lax/T4/j;)V
    :try_end_bf
    .catch Lax/t4/a; {:try_start_1c .. :try_end_bf} :catch_2d

    .line 190
    .line 191
    .line 192
    goto/16 :goto_d

    .line 193
    .line 194
    :goto_c1
    invoke-virtual {p1, v2}, Lax/t4/a;->a(Ljava/lang/String;)Lax/t4/a;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    throw p1

    .line 199
    :cond_c6
    invoke-static {p1}, Lax/t4/b;->a(Lax/T4/j;)V

    .line 200
    .line 201
    .line 202
    if-eqz v1, :cond_ff

    .line 203
    .line 204
    if-eqz v3, :cond_f7

    .line 205
    .line 206
    if-eqz v6, :cond_ef

    .line 207
    .line 208
    if-nez v8, :cond_dc

    .line 209
    .line 210
    if-eqz v7, :cond_d4

    .line 211
    .line 212
    goto :goto_dc

    .line 213
    :cond_d4
    new-instance p1, Lax/t4/a;

    .line 214
    .line 215
    const-string v1, "missing field \"account_id\" and missing field \"team_id\""

    .line 216
    .line 217
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :cond_dc
    :goto_dc
    if-eqz v5, :cond_e9

    .line 222
    .line 223
    if-eqz v4, :cond_e1

    .line 224
    .line 225
    goto :goto_e9

    .line 226
    :cond_e1
    new-instance p1, Lax/t4/a;

    .line 227
    .line 228
    const-string v1, "missing field \"expires_in\""

    .line 229
    .line 230
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :cond_e9
    :goto_e9
    new-instance v2, Lax/p4/h;

    .line 235
    .line 236
    invoke-direct/range {v2 .. v10}, Lax/p4/h;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-object v2

    .line 240
    :cond_ef
    new-instance p1, Lax/t4/a;

    .line 241
    .line 242
    const-string v1, "missing field \"uid\""

    .line 243
    .line 244
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_f7
    new-instance p1, Lax/t4/a;

    .line 249
    .line 250
    const-string v1, "missing field \"access_token\""

    .line 251
    .line 252
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_ff
    new-instance p1, Lax/t4/a;

    .line 257
    .line 258
    const-string v1, "missing field \"token_type\""

    .line 259
    .line 260
    invoke-direct {p1, v1, v0}, Lax/t4/a;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 261
    .line 262
    .line 263
    throw p1
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
