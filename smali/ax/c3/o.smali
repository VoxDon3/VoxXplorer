.class public Lax/c3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lax/c3/k;)Ljava/lang/String;
    .registers 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    invoke-virtual {p0}, Lax/c3/k;->k0()Z

    .line 5
    .line 6
    .line 7
    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_7} :catch_11
    .catchall {:try_start_3 .. :try_end_7} :catchall_f

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_13

    .line 10
    .line 11
    :try_start_a
    invoke-virtual {p0, v3}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_e
    .catch Lax/b3/j; {:try_start_a .. :try_end_e} :catch_13
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_e} :catch_11
    .catchall {:try_start_a .. :try_end_e} :catchall_f

    .line 15
    goto :goto_14

    .line 16
    :catchall_f
    move-exception p0

    .line 17
    goto :goto_6c

    .line 18
    :catch_11
    nop

    .line 19
    goto :goto_72

    .line 20
    :catch_13
    :cond_13
    move-object v2, v1

    .line 21
    :goto_14
    :try_start_14
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    .line 22
    .line 23
    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-boolean v3, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 27
    .line 28
    if-eqz v2, :cond_2b

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v1, v4}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    goto :goto_36

    .line 38
    :catchall_25
    move-exception p0

    .line 39
    move-object v1, v2

    .line 40
    goto :goto_6c

    .line 41
    :catch_28
    nop

    .line 42
    move-object v1, v2

    .line 43
    goto :goto_72

    .line 44
    :cond_2b
    instance-of v1, p0, Lcom/voxdon/xplorer/file/y;

    .line 45
    .line 46
    if-eqz v1, :cond_63

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    :goto_36
    iget p0, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 56
    .line 57
    if-ltz p0, :cond_5d

    .line 58
    .line 59
    iget p0, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 60
    .line 61
    if-gez p0, :cond_3f

    .line 62
    .line 63
    goto :goto_5d

    .line 64
    :cond_3f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, " x "

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_57} :catch_28
    .catchall {:try_start_14 .. :try_end_57} :catchall_25

    .line 88
    if-eqz v2, :cond_5c

    .line 89
    .line 90
    :try_start_59
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5c
    .catch Ljava/lang/Exception; {:try_start_59 .. :try_end_5c} :catch_5c

    .line 91
    .line 92
    .line 93
    :catch_5c
    :cond_5c
    return-object p0

    .line 94
    :cond_5d
    :goto_5d
    if-eqz v2, :cond_62

    .line 95
    .line 96
    :try_start_5f
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_62
    .catch Ljava/lang/Exception; {:try_start_5f .. :try_end_62} :catch_62

    .line 97
    .line 98
    .line 99
    :catch_62
    :cond_62
    return-object v0

    .line 100
    :cond_63
    :try_start_63
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_66
    .catch Ljava/lang/Exception; {:try_start_63 .. :try_end_66} :catch_28
    .catchall {:try_start_63 .. :try_end_66} :catchall_25

    .line 101
    .line 102
    .line 103
    if-eqz v2, :cond_6b

    .line 104
    .line 105
    :try_start_68
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_6b
    .catch Ljava/lang/Exception; {:try_start_68 .. :try_end_6b} :catch_6b

    .line 106
    .line 107
    .line 108
    :catch_6b
    :cond_6b
    return-object v0

    .line 109
    :goto_6c
    if-eqz v1, :cond_71

    .line 110
    .line 111
    :try_start_6e
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_6e .. :try_end_71} :catch_71

    .line 112
    .line 113
    .line 114
    :catch_71
    :cond_71
    throw p0

    .line 115
    :goto_72
    if-eqz v1, :cond_77

    .line 116
    .line 117
    :try_start_74
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_77
    .catch Ljava/lang/Exception; {:try_start_74 .. :try_end_77} :catch_77

    .line 118
    .line 119
    .line 120
    :catch_77
    :cond_77
    return-object v0
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
.end method

.method public static b(Lax/c3/k;)Ljava/lang/String;
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_6} :catch_86
    .catchall {:try_start_1 .. :try_end_6} :catchall_83

    .line 5
    .line 6
    .line 7
    :try_start_6
    invoke-virtual {p0}, Lax/c3/k;->k0()Z

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_a} :catch_18
    .catchall {:try_start_6 .. :try_end_a} :catchall_12

    .line 11
    if-eqz v2, :cond_1f

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    :try_start_d
    invoke-virtual {p0, v2}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_11
    .catch Lax/b3/j; {:try_start_d .. :try_end_11} :catch_1e
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_11} :catch_18
    .catchall {:try_start_d .. :try_end_11} :catchall_12

    .line 18
    goto :goto_1f

    .line 19
    :catchall_12
    move-exception p0

    .line 20
    move-object v5, v1

    .line 21
    move-object v1, v0

    .line 22
    move-object v0, v5

    .line 23
    goto/16 :goto_9b

    .line 24
    .line 25
    :catch_18
    move-exception p0

    .line 26
    move-object v5, v1

    .line 27
    move-object v1, v0

    .line 28
    move-object v0, v5

    .line 29
    goto/16 :goto_88

    .line 30
    .line 31
    :catch_1e
    nop

    .line 32
    :cond_1f
    :goto_1f
    const-string v2, "--:--"

    .line 33
    .line 34
    if-eqz v0, :cond_2b

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 41
    .line 42
    .line 43
    goto :goto_36

    .line 44
    :cond_2b
    instance-of v3, p0, Lcom/voxdon/xplorer/file/y;

    .line 45
    .line 46
    if-eqz v3, :cond_5c

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_36
    const/16 p0, 0x9

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_3c
    .catch Ljava/lang/RuntimeException; {:try_start_23 .. :try_end_3c} :catch_18
    .catchall {:try_start_23 .. :try_end_3c} :catchall_12

    .line 61
    if-nez p0, :cond_49

    .line 62
    .line 63
    :try_start_3e
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    goto :goto_43

    .line 67
    :catch_42
    nop

    .line 68
    :goto_43
    if-eqz v0, :cond_48

    .line 69
    .line 70
    :try_start_45
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_48} :catch_48

    .line 71
    .line 72
    .line 73
    :catch_48
    :cond_48
    return-object v2

    .line 74
    :cond_49
    :try_start_49
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    invoke-static {v2, v3}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_51
    .catch Ljava/lang/RuntimeException; {:try_start_49 .. :try_end_51} :catch_18
    .catchall {:try_start_49 .. :try_end_51} :catchall_12

    .line 82
    :try_start_51
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_51 .. :try_end_54} :catch_55

    .line 83
    .line 84
    .line 85
    goto :goto_56

    .line 86
    :catch_55
    nop

    .line 87
    :goto_56
    if-eqz v0, :cond_5b

    .line 88
    .line 89
    :try_start_58
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_58 .. :try_end_5b} :catch_5b

    .line 90
    .line 91
    .line 92
    :catch_5b
    :cond_5b
    return-object p0

    .line 93
    :cond_5c
    :try_start_5c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v4, "loc:"

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V
    :try_end_78
    .catch Ljava/lang/RuntimeException; {:try_start_5c .. :try_end_78} :catch_18
    .catchall {:try_start_5c .. :try_end_78} :catchall_12

    .line 119
    .line 120
    .line 121
    :try_start_78
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7b
    .catch Ljava/lang/Exception; {:try_start_78 .. :try_end_7b} :catch_7c

    .line 122
    .line 123
    .line 124
    goto :goto_7d

    .line 125
    :catch_7c
    nop

    .line 126
    :goto_7d
    if-eqz v0, :cond_82

    .line 127
    .line 128
    :try_start_7f
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_82
    .catch Ljava/io/IOException; {:try_start_7f .. :try_end_82} :catch_82

    .line 129
    .line 130
    .line 131
    :catch_82
    :cond_82
    return-object v2

    .line 132
    :catchall_83
    move-exception p0

    .line 133
    move-object v1, v0

    .line 134
    goto :goto_9b

    .line 135
    :catch_86
    move-exception p0

    .line 136
    move-object v1, v0

    .line 137
    :goto_88
    :try_start_88
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 138
    .line 139
    .line 140
    const-string p0, ""
    :try_end_8d
    .catchall {:try_start_88 .. :try_end_8d} :catchall_9a

    .line 141
    .line 142
    if-eqz v0, :cond_94

    .line 143
    .line 144
    :try_start_8f
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_8f .. :try_end_92} :catch_93

    .line 145
    .line 146
    .line 147
    goto :goto_94

    .line 148
    :catch_93
    nop

    .line 149
    :cond_94
    :goto_94
    if-eqz v1, :cond_99

    .line 150
    .line 151
    :try_start_96
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_99
    .catch Ljava/io/IOException; {:try_start_96 .. :try_end_99} :catch_99

    .line 152
    .line 153
    .line 154
    :catch_99
    :cond_99
    return-object p0

    .line 155
    :catchall_9a
    move-exception p0

    .line 156
    :goto_9b
    if-eqz v0, :cond_a2

    .line 157
    .line 158
    :try_start_9d
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a0
    .catch Ljava/lang/Exception; {:try_start_9d .. :try_end_a0} :catch_a1

    .line 159
    .line 160
    .line 161
    goto :goto_a2

    .line 162
    :catch_a1
    nop

    .line 163
    :cond_a2
    :goto_a2
    if-eqz v1, :cond_a7

    .line 164
    .line 165
    :try_start_a4
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_a7
    .catch Ljava/io/IOException; {:try_start_a4 .. :try_end_a7} :catch_a7

    .line 166
    .line 167
    .line 168
    :catch_a7
    :cond_a7
    throw p0
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

.method public static c(Lax/c3/k;)Ljava/lang/String;
    .registers 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_3
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 5
    .line 6
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_8} :catch_a6
    .catchall {:try_start_3 .. :try_end_8} :catchall_a3

    .line 7
    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p0}, Lax/c3/k;->k0()Z

    .line 10
    .line 11
    .line 12
    move-result v3
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_c} :catch_1a
    .catchall {:try_start_8 .. :try_end_c} :catchall_14

    .line 13
    if-eqz v3, :cond_21

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    :try_start_f
    invoke-virtual {p0, v3}, Lax/c3/k;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_13
    .catch Lax/b3/j; {:try_start_f .. :try_end_13} :catch_20
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_13} :catch_1a
    .catchall {:try_start_f .. :try_end_13} :catchall_14

    .line 20
    goto :goto_21

    .line 21
    :catchall_14
    move-exception p0

    .line 22
    move-object v5, v2

    .line 23
    move-object v2, v1

    .line 24
    move-object v1, v5

    .line 25
    goto/16 :goto_b9

    .line 26
    .line 27
    :catch_1a
    move-exception p0

    .line 28
    move-object v5, v2

    .line 29
    move-object v2, v1

    .line 30
    move-object v1, v5

    .line 31
    goto/16 :goto_a8

    .line 32
    .line 33
    :catch_20
    nop

    .line 34
    :cond_21
    :goto_21
    if-eqz v1, :cond_2b

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 41
    .line 42
    .line 43
    goto :goto_36

    .line 44
    :cond_2b
    instance-of v3, p0, Lcom/voxdon/xplorer/file/y;

    .line 45
    .line 46
    if-eqz v3, :cond_7c

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_36
    const/16 p0, 0x11

    .line 56
    .line 57
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_3c
    .catch Ljava/lang/RuntimeException; {:try_start_23 .. :try_end_3c} :catch_1a
    .catchall {:try_start_23 .. :try_end_3c} :catchall_14

    .line 61
    if-nez p0, :cond_49

    .line 62
    .line 63
    :try_start_3e
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_41} :catch_42

    .line 64
    .line 65
    .line 66
    goto :goto_43

    .line 67
    :catch_42
    nop

    .line 68
    :goto_43
    if-eqz v1, :cond_48

    .line 69
    .line 70
    :try_start_45
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_48
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_48} :catch_48

    .line 71
    .line 72
    .line 73
    :catch_48
    :cond_48
    return-object v0

    .line 74
    :cond_49
    const/16 p0, 0x12

    .line 75
    .line 76
    :try_start_4b
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    const/16 v3, 0x13

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p0, " x "

    .line 103
    .line 104
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_71
    .catch Ljava/lang/RuntimeException; {:try_start_4b .. :try_end_71} :catch_1a
    .catchall {:try_start_4b .. :try_end_71} :catchall_14

    .line 114
    :try_start_71
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_74
    .catch Ljava/lang/Exception; {:try_start_71 .. :try_end_74} :catch_75

    .line 115
    .line 116
    .line 117
    goto :goto_76

    .line 118
    :catch_75
    nop

    .line 119
    :goto_76
    if-eqz v1, :cond_7b

    .line 120
    .line 121
    :try_start_78
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7b
    .catch Ljava/lang/Exception; {:try_start_78 .. :try_end_7b} :catch_7b

    .line 122
    .line 123
    .line 124
    :catch_7b
    :cond_7b
    return-object p0

    .line 125
    :cond_7c
    :try_start_7c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v4, "deviceFileInfo:"

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Lax/c3/K;->k()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V
    :try_end_98
    .catch Ljava/lang/RuntimeException; {:try_start_7c .. :try_end_98} :catch_1a
    .catchall {:try_start_7c .. :try_end_98} :catchall_14

    .line 151
    .line 152
    .line 153
    :try_start_98
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_98 .. :try_end_9b} :catch_9c

    .line 154
    .line 155
    .line 156
    goto :goto_9d

    .line 157
    :catch_9c
    nop

    .line 158
    :goto_9d
    if-eqz v1, :cond_a2

    .line 159
    .line 160
    :try_start_9f
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_a2
    .catch Ljava/lang/Exception; {:try_start_9f .. :try_end_a2} :catch_a2

    .line 161
    .line 162
    .line 163
    :catch_a2
    :cond_a2
    return-object v0

    .line 164
    :catchall_a3
    move-exception p0

    .line 165
    move-object v2, v1

    .line 166
    goto :goto_b9

    .line 167
    :catch_a6
    move-exception p0

    .line 168
    move-object v2, v1

    .line 169
    :goto_a8
    :try_start_a8
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_ab
    .catchall {:try_start_a8 .. :try_end_ab} :catchall_b8

    .line 170
    .line 171
    .line 172
    if-eqz v1, :cond_b2

    .line 173
    .line 174
    :try_start_ad
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_b0
    .catch Ljava/lang/Exception; {:try_start_ad .. :try_end_b0} :catch_b1

    .line 175
    .line 176
    .line 177
    goto :goto_b2

    .line 178
    :catch_b1
    nop

    .line 179
    :cond_b2
    :goto_b2
    if-eqz v2, :cond_b7

    .line 180
    .line 181
    :try_start_b4
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_b7
    .catch Ljava/lang/Exception; {:try_start_b4 .. :try_end_b7} :catch_b7

    .line 182
    .line 183
    .line 184
    :catch_b7
    :cond_b7
    return-object v0

    .line 185
    :catchall_b8
    move-exception p0

    .line 186
    :goto_b9
    if-eqz v1, :cond_c0

    .line 187
    .line 188
    :try_start_bb
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_be
    .catch Ljava/lang/Exception; {:try_start_bb .. :try_end_be} :catch_bf

    .line 189
    .line 190
    .line 191
    goto :goto_c0

    .line 192
    :catch_bf
    nop

    .line 193
    :cond_c0
    :goto_c0
    if-eqz v2, :cond_c5

    .line 194
    .line 195
    :try_start_c2
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_c5
    .catch Ljava/lang/Exception; {:try_start_c2 .. :try_end_c5} :catch_c5

    .line 196
    .line 197
    .line 198
    :catch_c5
    :cond_c5
    throw p0
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
