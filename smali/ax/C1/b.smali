.class public Lax/C1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P0/C$a;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/q7/c;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/C1/b;->a:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
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


# virtual methods
.method public synthetic a()Lax/P0/v;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/P0/B;->b(Lax/P0/C$a;)Lax/P0/v;

    move-result-object v0

    return-object v0
.end method

.method public b(Lax/P0/A$b;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/C1/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sparse-switch v2, :sswitch_data_da

    .line 12
    .line 13
    .line 14
    goto/16 :goto_82

    .line 15
    .line 16
    :sswitch_f
    const-string v2, "ARTIST"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_19

    .line 23
    .line 24
    goto/16 :goto_82

    .line 25
    .line 26
    :cond_19
    const/16 v1, 0x9

    .line 27
    .line 28
    goto/16 :goto_82

    .line 29
    .line 30
    :sswitch_1d
    const-string v2, "ALBUMARTIST"

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_27

    .line 37
    .line 38
    goto/16 :goto_82

    .line 39
    .line 40
    :cond_27
    const/16 v1, 0x8

    .line 41
    .line 42
    goto/16 :goto_82

    .line 43
    .line 44
    :sswitch_2b
    const-string v2, "DISCNUMBER"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_34

    .line 51
    .line 52
    goto :goto_82

    .line 53
    :cond_34
    const/4 v1, 0x7

    .line 54
    goto :goto_82

    .line 55
    :sswitch_36
    const-string v2, "DESCRIPTION"

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3f

    .line 62
    .line 63
    goto :goto_82

    .line 64
    :cond_3f
    const/4 v1, 0x6

    .line 65
    goto :goto_82

    .line 66
    :sswitch_41
    const-string v2, "TITLE"

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4a

    .line 73
    .line 74
    goto :goto_82

    .line 75
    :cond_4a
    const/4 v1, 0x5

    .line 76
    goto :goto_82

    .line 77
    :sswitch_4c
    const-string v2, "GENRE"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_55

    .line 84
    .line 85
    goto :goto_82

    .line 86
    :cond_55
    const/4 v1, 0x4

    .line 87
    goto :goto_82

    .line 88
    :sswitch_57
    const-string v2, "ALBUM"

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_60

    .line 95
    .line 96
    goto :goto_82

    .line 97
    :cond_60
    const/4 v1, 0x3

    .line 98
    goto :goto_82

    .line 99
    :sswitch_62
    const-string v2, "TRACKNUMBER"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_6b

    .line 106
    .line 107
    goto :goto_82

    .line 108
    :cond_6b
    const/4 v1, 0x2

    .line 109
    goto :goto_82

    .line 110
    :sswitch_6d
    const-string v2, "TOTALDISCS"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_76

    .line 117
    .line 118
    goto :goto_82

    .line 119
    :cond_76
    const/4 v1, 0x1

    .line 120
    goto :goto_82

    .line 121
    :sswitch_78
    const-string v2, "TOTALTRACKS"

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_81

    .line 128
    .line 129
    goto :goto_82

    .line 130
    :cond_81
    const/4 v1, 0x0

    .line 131
    :goto_82
    packed-switch v1, :pswitch_data_104

    .line 132
    .line 133
    .line 134
    goto :goto_d9

    .line 135
    :pswitch_86
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lax/P0/A$b;->Q(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_8c
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Lax/P0/A$b;->O(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_92
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v0}, Lax/u7/f;->p(Ljava/lang/String;)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-eqz v0, :cond_d9

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Lax/P0/A$b;->X(Ljava/lang/Integer;)Lax/P0/A$b;

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_9e
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lax/P0/A$b;->W(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_a4
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lax/P0/A$b;->p0(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_aa
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Lax/P0/A$b;->c0(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_b0
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lax/P0/A$b;->P(Ljava/lang/CharSequence;)Lax/P0/A$b;

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_b6
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v0}, Lax/u7/f;->p(Ljava/lang/String;)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_d9

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lax/P0/A$b;->s0(Ljava/lang/Integer;)Lax/P0/A$b;

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_c2
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v0}, Lax/u7/f;->p(Ljava/lang/String;)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-eqz v0, :cond_d9

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Lax/P0/A$b;->q0(Ljava/lang/Integer;)Lax/P0/A$b;

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_ce
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v0}, Lax/u7/f;->p(Ljava/lang/String;)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_d9

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Lax/P0/A$b;->r0(Ljava/lang/Integer;)Lax/P0/A$b;

    .line 216
    .line 217
    .line 218
    :cond_d9
    :goto_d9
    return-void

    .line 219
    :sswitch_data_da
    .sparse-switch
        -0x7357db54 -> :sswitch_78
        -0xcdfdf46 -> :sswitch_6d
        -0x6c103cc -> :sswitch_62
        0x3b7864f -> :sswitch_57
        0x4091163 -> :sswitch_4c
        0x4c22a38 -> :sswitch_41
        0x198917dc -> :sswitch_36
        0x3b34911e -> :sswitch_2b
        0x681d2256 -> :sswitch_1d
        0x7395d347 -> :sswitch_f
    .end sparse-switch

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
    :pswitch_data_104
    .packed-switch 0x0
        :pswitch_ce
        :pswitch_c2
        :pswitch_b6
        :pswitch_b0
        :pswitch_aa
        :pswitch_a4
        :pswitch_9e
        :pswitch_92
        :pswitch_8c
        :pswitch_86
    .end packed-switch
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

.method public synthetic c()[B
    .registers 2

    .line 1
    invoke-static {p0}, Lax/P0/B;->a(Lax/P0/C$a;)[B

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_29

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_12

    .line 17
    .line 18
    goto :goto_29

    .line 19
    :cond_12
    check-cast p1, Lax/C1/b;

    .line 20
    .line 21
    iget-object v2, p0, Lax/C1/b;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p1, Lax/C1/b;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_29

    .line 30
    .line 31
    iget-object v2, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, Lax/C1/b;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_29

    .line 40
    .line 41
    return v0

    .line 42
    :cond_29
    :goto_29
    return v1
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

.method public hashCode()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/C1/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20f

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    mul-int/lit8 v1, v1, 0x1f

    .line 11
    .line 12
    iget-object v0, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v1, v0

    .line 19
    return v1
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "VC: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/C1/b;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lax/C1/b;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
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
