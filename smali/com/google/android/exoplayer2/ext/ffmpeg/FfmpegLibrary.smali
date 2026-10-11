.class public final Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "media3.decoder.ffmpeg"

    .line 2
    .line 3
    invoke-static {v0}, Lax/P0/z;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    sput v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->b:I

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
.end method

.method private static a()Ljava/lang/String;
    .registers 1

    .line 1
    invoke-static {}, Lax/P2/b;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->exFfmpegGetVersion()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_b
    invoke-static {}, Lax/P2/b;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->fmFfmpegGetVersion()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    return-object v0
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

.method private static b(Ljava/lang/String;)Z
    .registers 2

    .line 1
    invoke-static {}, Lax/P2/b;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->exFfmpegHasDecoder(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_b
    invoke-static {}, Lax/P2/b;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    invoke-static {p0}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->fmFfmpegHasDecoder(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_16
    const/4 p0, 0x0

    .line 24
    return p0
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

.method static c(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_120

    .line 10
    .line 11
    .line 12
    goto/16 :goto_f0

    .line 13
    .line 14
    :sswitch_d
    const-string v1, "audio/g711-mlaw"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_17

    .line 21
    .line 22
    goto/16 :goto_f0

    .line 23
    .line 24
    :cond_17
    const/16 v0, 0x11

    .line 25
    .line 26
    goto/16 :goto_f0

    .line 27
    .line 28
    :sswitch_1b
    const-string v1, "audio/g711-alaw"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_25

    .line 35
    .line 36
    goto/16 :goto_f0

    .line 37
    .line 38
    :cond_25
    const/16 v0, 0x10

    .line 39
    .line 40
    goto/16 :goto_f0

    .line 41
    .line 42
    :sswitch_29
    const-string v1, "audio/true-hd"

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_33

    .line 49
    .line 50
    goto/16 :goto_f0

    .line 51
    .line 52
    :cond_33
    const/16 v0, 0xf

    .line 53
    .line 54
    goto/16 :goto_f0

    .line 55
    .line 56
    :sswitch_37
    const-string v1, "audio/vnd.dts.hd"

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_41

    .line 63
    .line 64
    goto/16 :goto_f0

    .line 65
    .line 66
    :cond_41
    const/16 v0, 0xe

    .line 67
    .line 68
    goto/16 :goto_f0

    .line 69
    .line 70
    :sswitch_45
    const-string v1, "audio/opus"

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_4f

    .line 77
    .line 78
    goto/16 :goto_f0

    .line 79
    .line 80
    :cond_4f
    const/16 v0, 0xd

    .line 81
    .line 82
    goto/16 :goto_f0

    .line 83
    .line 84
    :sswitch_53
    const-string v1, "audio/mpeg"

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5d

    .line 91
    .line 92
    goto/16 :goto_f0

    .line 93
    .line 94
    :cond_5d
    const/16 v0, 0xc

    .line 95
    .line 96
    goto/16 :goto_f0

    .line 97
    .line 98
    :sswitch_61
    const-string v1, "audio/flac"

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_6b

    .line 105
    .line 106
    goto/16 :goto_f0

    .line 107
    .line 108
    :cond_6b
    const/16 v0, 0xb

    .line 109
    .line 110
    goto/16 :goto_f0

    .line 111
    .line 112
    :sswitch_6f
    const-string v1, "audio/eac3"

    .line 113
    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_79

    .line 119
    .line 120
    goto/16 :goto_f0

    .line 121
    .line 122
    :cond_79
    const/16 v0, 0xa

    .line 123
    .line 124
    goto/16 :goto_f0

    .line 125
    .line 126
    :sswitch_7d
    const-string v1, "audio/alac"

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_87

    .line 133
    .line 134
    goto/16 :goto_f0

    .line 135
    .line 136
    :cond_87
    const/16 v0, 0x9

    .line 137
    .line 138
    goto/16 :goto_f0

    .line 139
    .line 140
    :sswitch_8b
    const-string v1, "audio/3gpp"

    .line 141
    .line 142
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-nez p0, :cond_95

    .line 147
    .line 148
    goto/16 :goto_f0

    .line 149
    .line 150
    :cond_95
    const/16 v0, 0x8

    .line 151
    .line 152
    goto/16 :goto_f0

    .line 153
    .line 154
    :sswitch_99
    const-string v1, "audio/ac3"

    .line 155
    .line 156
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_a2

    .line 161
    .line 162
    goto :goto_f0

    .line 163
    :cond_a2
    const/4 v0, 0x7

    .line 164
    goto :goto_f0

    .line 165
    :sswitch_a4
    const-string v1, "audio/mp4a-latm"

    .line 166
    .line 167
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-nez p0, :cond_ad

    .line 172
    .line 173
    goto :goto_f0

    .line 174
    :cond_ad
    const/4 v0, 0x6

    .line 175
    goto :goto_f0

    .line 176
    :sswitch_af
    const-string v1, "audio/mpeg-L2"

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-nez p0, :cond_b8

    .line 183
    .line 184
    goto :goto_f0

    .line 185
    :cond_b8
    const/4 v0, 0x5

    .line 186
    goto :goto_f0

    .line 187
    :sswitch_ba
    const-string v1, "audio/mpeg-L1"

    .line 188
    .line 189
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_c3

    .line 194
    .line 195
    goto :goto_f0

    .line 196
    :cond_c3
    const/4 v0, 0x4

    .line 197
    goto :goto_f0

    .line 198
    :sswitch_c5
    const-string v1, "audio/vorbis"

    .line 199
    .line 200
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-nez p0, :cond_ce

    .line 205
    .line 206
    goto :goto_f0

    .line 207
    :cond_ce
    const/4 v0, 0x3

    .line 208
    goto :goto_f0

    .line 209
    :sswitch_d0
    const-string v1, "audio/vnd.dts"

    .line 210
    .line 211
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-nez p0, :cond_d9

    .line 216
    .line 217
    goto :goto_f0

    .line 218
    :cond_d9
    const/4 v0, 0x2

    .line 219
    goto :goto_f0

    .line 220
    :sswitch_db
    const-string v1, "audio/amr-wb"

    .line 221
    .line 222
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-nez p0, :cond_e4

    .line 227
    .line 228
    goto :goto_f0

    .line 229
    :cond_e4
    const/4 v0, 0x1

    .line 230
    goto :goto_f0

    .line 231
    :sswitch_e6
    const-string v1, "audio/eac3-joc"

    .line 232
    .line 233
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    if-nez p0, :cond_ef

    .line 238
    .line 239
    goto :goto_f0

    .line 240
    :cond_ef
    const/4 v0, 0x0

    .line 241
    :goto_f0
    packed-switch v0, :pswitch_data_16a

    .line 242
    .line 243
    .line 244
    const/4 p0, 0x0

    .line 245
    return-object p0

    .line 246
    :pswitch_f5
    const-string p0, "pcm_mulaw"

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_f8
    const-string p0, "pcm_alaw"

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_fb
    const-string p0, "truehd"

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_fe
    const-string p0, "opus"

    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_101
    const-string p0, "flac"

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_104
    const-string p0, "alac"

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_107
    const-string p0, "amrnb"

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_10a
    const-string p0, "ac3"

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_10d
    const-string p0, "aac"

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_110
    const-string p0, "mp3"

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_113
    const-string p0, "vorbis"

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_116
    const-string p0, "dca"

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_119
    const-string p0, "amrwb"

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_11c
    const-string p0, "eac3"

    .line 286
    .line 287
    return-object p0

    .line 288
    nop

    .line 289
    :sswitch_data_120
    .sparse-switch
        -0x7e929daa -> :sswitch_e6
        -0x5fc6f775 -> :sswitch_db
        -0x41455b98 -> :sswitch_d0
        -0x3bd43e14 -> :sswitch_c5
        -0x19cc928c -> :sswitch_ba
        -0x19cc928b -> :sswitch_af
        -0x3313c2e -> :sswitch_a4
        0xb269698 -> :sswitch_99
        0x59976a2d -> :sswitch_8b
        0x59ac6426 -> :sswitch_7d
        0x59ae0c65 -> :sswitch_6f
        0x59aeaa01 -> :sswitch_61
        0x59b1e81e -> :sswitch_53
        0x59b2d2d8 -> :sswitch_45
        0x59c2dc42 -> :sswitch_37
        0x5cc95062 -> :sswitch_29
        0x71710385 -> :sswitch_1b
        0x717677f9 -> :sswitch_d
    .end sparse-switch

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
    :pswitch_data_16a
    .packed-switch 0x0
        :pswitch_11c
        :pswitch_119
        :pswitch_116
        :pswitch_113
        :pswitch_110
        :pswitch_110
        :pswitch_10d
        :pswitch_10a
        :pswitch_107
        :pswitch_104
        :pswitch_11c
        :pswitch_101
        :pswitch_110
        :pswitch_fe
        :pswitch_116
        :pswitch_fb
        :pswitch_f8
        :pswitch_f5
    .end packed-switch
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

.method public static d()I
    .registers 2

    .line 1
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    sget v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->b:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_10

    .line 12
    .line 13
    const/16 v0, 0x40

    .line 14
    .line 15
    sput v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->b:I

    .line 16
    .line 17
    :cond_10
    sget v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->b:I

    .line 18
    .line 19
    return v0
    .line 20
    .line 21
.end method

.method public static e()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_8
    :try_start_8
    sget-object v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;

    .line 18
    .line 19
    :cond_12
    sget-object v0, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;
    :try_end_14
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_14} :catch_15

    .line 20
    .line 21
    return-object v0

    .line 22
    :catch_15
    return-object v1
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
.end method

.method private static native exFfmpegGetVersion()Ljava/lang/String;
.end method

.method private static native exFfmpegHasDecoder(Ljava/lang/String;)Z
.end method

.method public static f()Z
    .registers 1

    .line 1
    invoke-static {}, Lax/P2/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

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

.method private static native fmFfmpegGetVersion()Ljava/lang/String;
.end method

.method private static native fmFfmpegHasDecoder(Ljava/lang/String;)Z
.end method

.method public static g(Ljava/lang/String;)Z
    .registers 5

    .line 1
    invoke-static {}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {p0}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    :try_start_f
    invoke-static {p0}, Lcom/google/android/exoplayer2/ext/ffmpeg/FfmpegLibrary;->b(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_31

    .line 21
    .line 22
    const-string v0, "FfmpegLibrary"

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "No "

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " decoder available. Check the FFmpeg build configuration."

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v0, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_30
    .catch Ljava/lang/Error; {:try_start_f .. :try_end_30} :catch_33

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_31
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :catch_33
    return v1
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
