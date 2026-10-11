.class public final Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;
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
    sput v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->b:I

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

.method static a(Ljava/lang/String;)Ljava/lang/String;
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
    sparse-switch v1, :sswitch_data_142

    .line 10
    .line 11
    .line 12
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 23
    .line 24
    :cond_17
    const/16 v0, 0x13

    .line 25
    .line 26
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 37
    .line 38
    :cond_25
    const/16 v0, 0x12

    .line 39
    .line 40
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 51
    .line 52
    :cond_33
    const/16 v0, 0x11

    .line 53
    .line 54
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 65
    .line 66
    :cond_41
    const/16 v0, 0x10

    .line 67
    .line 68
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 79
    .line 80
    :cond_4f
    const/16 v0, 0xf

    .line 81
    .line 82
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 93
    .line 94
    :cond_5d
    const/16 v0, 0xe

    .line 95
    .line 96
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 107
    .line 108
    :cond_6b
    const/16 v0, 0xd

    .line 109
    .line 110
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 121
    .line 122
    :cond_79
    const/16 v0, 0xc

    .line 123
    .line 124
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 135
    .line 136
    :cond_87
    const/16 v0, 0xb

    .line 137
    .line 138
    goto/16 :goto_10c

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
    goto/16 :goto_10c

    .line 149
    .line 150
    :cond_95
    const/16 v0, 0xa

    .line 151
    .line 152
    goto/16 :goto_10c

    .line 153
    .line 154
    :sswitch_99
    const-string v1, "video/avc"

    .line 155
    .line 156
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_a3

    .line 161
    .line 162
    goto/16 :goto_10c

    .line 163
    .line 164
    :cond_a3
    const/16 v0, 0x9

    .line 165
    .line 166
    goto/16 :goto_10c

    .line 167
    .line 168
    :sswitch_a7
    const-string v1, "audio/ac3"

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_b1

    .line 175
    .line 176
    goto/16 :goto_10c

    .line 177
    .line 178
    :cond_b1
    const/16 v0, 0x8

    .line 179
    .line 180
    goto/16 :goto_10c

    .line 181
    .line 182
    :sswitch_b5
    const-string v1, "audio/mp4a-latm"

    .line 183
    .line 184
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-nez p0, :cond_be

    .line 189
    .line 190
    goto :goto_10c

    .line 191
    :cond_be
    const/4 v0, 0x7

    .line 192
    goto :goto_10c

    .line 193
    :sswitch_c0
    const-string v1, "audio/mpeg-L2"

    .line 194
    .line 195
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    if-nez p0, :cond_c9

    .line 200
    .line 201
    goto :goto_10c

    .line 202
    :cond_c9
    const/4 v0, 0x6

    .line 203
    goto :goto_10c

    .line 204
    :sswitch_cb
    const-string v1, "audio/mpeg-L1"

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-nez p0, :cond_d4

    .line 211
    .line 212
    goto :goto_10c

    .line 213
    :cond_d4
    const/4 v0, 0x5

    .line 214
    goto :goto_10c

    .line 215
    :sswitch_d6
    const-string v1, "audio/vorbis"

    .line 216
    .line 217
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-nez p0, :cond_df

    .line 222
    .line 223
    goto :goto_10c

    .line 224
    :cond_df
    const/4 v0, 0x4

    .line 225
    goto :goto_10c

    .line 226
    :sswitch_e1
    const-string v1, "audio/vnd.dts"

    .line 227
    .line 228
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_ea

    .line 233
    .line 234
    goto :goto_10c

    .line 235
    :cond_ea
    const/4 v0, 0x3

    .line 236
    goto :goto_10c

    .line 237
    :sswitch_ec
    const-string v1, "audio/amr-wb"

    .line 238
    .line 239
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-nez p0, :cond_f5

    .line 244
    .line 245
    goto :goto_10c

    .line 246
    :cond_f5
    const/4 v0, 0x2

    .line 247
    goto :goto_10c

    .line 248
    :sswitch_f7
    const-string v1, "video/hevc"

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    if-nez p0, :cond_100

    .line 255
    .line 256
    goto :goto_10c

    .line 257
    :cond_100
    const/4 v0, 0x1

    .line 258
    goto :goto_10c

    .line 259
    :sswitch_102
    const-string v1, "audio/eac3-joc"

    .line 260
    .line 261
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-nez p0, :cond_10b

    .line 266
    .line 267
    goto :goto_10c

    .line 268
    :cond_10b
    const/4 v0, 0x0

    .line 269
    :goto_10c
    packed-switch v0, :pswitch_data_194

    .line 270
    .line 271
    .line 272
    const/4 p0, 0x0

    .line 273
    return-object p0

    .line 274
    :pswitch_111
    const-string p0, "pcm_mulaw"

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_114
    const-string p0, "pcm_alaw"

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_117
    const-string p0, "truehd"

    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_11a
    const-string p0, "opus"

    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_11d
    const-string p0, "flac"

    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_120
    const-string p0, "alac"

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_123
    const-string p0, "amrnb"

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_126
    const-string p0, "h264"

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_129
    const-string p0, "ac3"

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_12c
    const-string p0, "aac"

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_12f
    const-string p0, "mp3"

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_132
    const-string p0, "vorbis"

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_135
    const-string p0, "dca"

    .line 311
    .line 312
    return-object p0

    .line 313
    :pswitch_138
    const-string p0, "amrwb"

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_13b
    const-string p0, "hevc"

    .line 317
    .line 318
    return-object p0

    .line 319
    :pswitch_13e
    const-string p0, "eac3"

    .line 320
    .line 321
    return-object p0

    .line 322
    nop

    .line 323
    :sswitch_data_142
    .sparse-switch
        -0x7e929daa -> :sswitch_102
        -0x63185e82 -> :sswitch_f7
        -0x5fc6f775 -> :sswitch_ec
        -0x41455b98 -> :sswitch_e1
        -0x3bd43e14 -> :sswitch_d6
        -0x19cc928c -> :sswitch_cb
        -0x19cc928b -> :sswitch_c0
        -0x3313c2e -> :sswitch_b5
        0xb269698 -> :sswitch_a7
        0x4f62373a -> :sswitch_99
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
    :pswitch_data_194
    .packed-switch 0x0
        :pswitch_13e
        :pswitch_13b
        :pswitch_138
        :pswitch_135
        :pswitch_132
        :pswitch_12f
        :pswitch_12f
        :pswitch_12c
        :pswitch_129
        :pswitch_126
        :pswitch_123
        :pswitch_120
        :pswitch_13e
        :pswitch_11d
        :pswitch_12f
        :pswitch_11a
        :pswitch_135
        :pswitch_117
        :pswitch_114
        :pswitch_111
    .end packed-switch
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

.method public static b()I
    .registers 2

    .line 1
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->d()Z

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
    sget v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->b:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_12

    .line 12
    .line 13
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegGetInputBufferPaddingSize()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->b:I

    .line 18
    .line 19
    :cond_12
    sget v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->b:I

    .line 20
    .line 21
    return v0
.end method

.method public static c()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->d()Z

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
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v0, :cond_12

    .line 12
    .line 13
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegGetVersion()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;
    :try_end_12
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_12} :catch_15

    .line 18
    .line 19
    :cond_12
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->a:Ljava/lang/String;

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

.method public static d()Z
    .registers 1

    .line 1
    invoke-static {}, Lax/P2/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    invoke-static {}, Lax/P2/b;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static e(Ljava/lang/String;)Z
    .registers 4

    .line 1
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->d()Z

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
    invoke-static {p0}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->a(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {p0}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegHasDecoder(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_31

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "No "

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " decoder available. Check the FFmpeg build configuration."

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "FfmpegLibrary"

    .line 45
    .line 46
    invoke-static {v0, p0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

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

.method private static native ffmpegGetInputBufferPaddingSize()I
.end method

.method private static native ffmpegGetVersion()Ljava/lang/String;
.end method

.method private static native ffmpegHasDecoder(Ljava/lang/String;)Z
.end method
