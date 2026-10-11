.class public Lax/c3/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/AutoCloseable;)V
    .registers 1

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    :try_start_2
    invoke-static {p0}, Lax/Z/f;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_5} :catch_8

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    move-exception p0

    .line 8
    throw p0

    .line 9
    :catch_8
    :cond_8
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
    .line 22
.end method

.method public static b(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    :try_start_6
    invoke-static/range {v0 .. v5}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0
    :try_end_a
    .catch Lax/b3/a; {:try_start_6 .. :try_end_a} :catch_b

    .line 11
    return-wide p0

    .line 12
    :catch_b
    const-wide/16 p0, -0x1

    .line 13
    .line 14
    return-wide p0
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

.method public static c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J
    .registers 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v5, v0, [B

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const-wide/16 v7, -0x1

    .line 7
    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    move-wide v3, p2

    .line 11
    move-object v9, p4

    .line 12
    move-object/from16 v10, p5

    .line 13
    .line 14
    invoke-static/range {v1 .. v10}, Lax/c3/F;->d(Ljava/io/InputStream;Ljava/io/OutputStream;J[BZJLax/u3/c;Lax/g3/i;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    return-wide p0
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

.method public static d(Ljava/io/InputStream;Ljava/io/OutputStream;J[BZJLax/u3/c;Lax/g3/i;)J
    .registers 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v4, p4

    .line 6
    .line 7
    move-object/from16 v5, p9

    .line 8
    .line 9
    invoke-static {}, Lax/X2/Q;->F()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v0, :cond_1f

    .line 15
    .line 16
    instance-of v0, v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 17
    .line 18
    if-nez v0, :cond_17

    .line 19
    .line 20
    instance-of v0, v1, Lax/c3/b0$a;

    .line 21
    .line 22
    if-eqz v0, :cond_1f

    .line 23
    .line 24
    :cond_17
    const/16 v0, 0x25

    .line 25
    .line 26
    invoke-static {v0}, Lax/X2/Q;->l(I)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    const/4 v7, 0x1

    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    const/4 v7, 0x0

    .line 33
    :goto_20
    const-wide/16 v10, 0x0

    .line 34
    .line 35
    const-wide/16 v12, 0x0

    .line 36
    .line 37
    :cond_24
    :goto_24
    if-eqz v7, :cond_79

    .line 38
    .line 39
    :try_start_26
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    .line 40
    .line 41
    .line 42
    move-result v0
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_2a} :catch_2d

    .line 43
    const-wide/16 v16, 0x0

    .line 44
    .line 45
    goto :goto_7f

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v14

    .line 51
    const-string v15, "io utils error :"

    .line 52
    .line 53
    if-eqz v14, :cond_66

    .line 54
    .line 55
    const-wide/16 v16, 0x0

    .line 56
    .line 57
    const-string v8, "ENOENT"

    .line 58
    .line 59
    invoke-virtual {v14, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_66

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-lez v8, :cond_4f

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v1, v4, v6, v0}, Ljava/io/InputStream;->read([BII)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    goto :goto_7f

    .line 80
    :cond_4f
    if-nez v8, :cond_53

    .line 81
    .line 82
    const/4 v0, -0x1

    .line 83
    goto :goto_7f

    .line 84
    :cond_53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {v1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_79
    const-wide/16 v16, 0x0

    .line 123
    .line 124
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    :goto_7f
    if-gez v0, :cond_8a

    .line 129
    .line 130
    invoke-virtual/range {p1 .. p1}, Ljava/io/OutputStream;->flush()V

    .line 131
    .line 132
    .line 133
    if-eqz v5, :cond_89

    .line 134
    .line 135
    invoke-interface {v5, v10, v11, v2, v3}, Lax/g3/i;->a(JJ)V

    .line 136
    .line 137
    .line 138
    :cond_89
    return-wide v10

    .line 139
    :cond_8a
    if-nez v0, :cond_94

    .line 140
    .line 141
    const-wide/16 v8, 0x5

    .line 142
    .line 143
    :try_start_8e
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_91
    .catch Ljava/lang/InterruptedException; {:try_start_8e .. :try_end_91} :catch_92

    .line 144
    .line 145
    .line 146
    goto :goto_24

    .line 147
    :catch_92
    nop

    .line 148
    goto :goto_24

    .line 149
    :cond_94
    move-object/from16 v8, p1

    .line 150
    .line 151
    invoke-virtual {v8, v4, v6, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 152
    .line 153
    .line 154
    int-to-long v14, v0

    .line 155
    add-long/2addr v10, v14

    .line 156
    sub-long v14, v10, v12

    .line 157
    .line 158
    const-wide/32 v18, 0x40000

    .line 159
    .line 160
    .line 161
    cmp-long v0, v14, v18

    .line 162
    .line 163
    if-ltz v0, :cond_ca

    .line 164
    .line 165
    if-eqz v5, :cond_ba

    .line 166
    .line 167
    if-eqz p5, :cond_b7

    .line 168
    .line 169
    instance-of v0, v1, Lax/Kc/o;

    .line 170
    .line 171
    if-eqz v0, :cond_b7

    .line 172
    .line 173
    move-object v0, v1

    .line 174
    check-cast v0, Lax/Kc/o;

    .line 175
    .line 176
    invoke-interface {v0}, Lax/Kc/o;->a()J

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    invoke-interface {v5, v12, v13, v2, v3}, Lax/g3/i;->a(JJ)V

    .line 181
    .line 182
    .line 183
    goto :goto_ba

    .line 184
    :cond_b7
    invoke-interface {v5, v10, v11, v2, v3}, Lax/g3/i;->a(JJ)V

    .line 185
    .line 186
    .line 187
    :cond_ba
    :goto_ba
    if-eqz p8, :cond_c9

    .line 188
    .line 189
    invoke-interface/range {p8 .. p8}, Lax/u3/c;->isCancelled()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_c3

    .line 194
    .line 195
    goto :goto_c9

    .line 196
    :cond_c3
    new-instance v0, Lax/b3/a;

    .line 197
    .line 198
    invoke-direct {v0}, Lax/b3/a;-><init>()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_c9
    :goto_c9
    move-wide v12, v10

    .line 203
    :cond_ca
    cmp-long v0, p6, v16

    .line 204
    .line 205
    if-lez v0, :cond_24

    .line 206
    .line 207
    cmp-long v0, v10, p6

    .line 208
    .line 209
    if-gtz v0, :cond_d4

    .line 210
    .line 211
    goto/16 :goto_24

    .line 212
    .line 213
    :cond_d4
    new-instance v0, Ljava/io/IOException;

    .line 214
    .line 215
    const-string v1, "Size limit exceeded"

    .line 216
    .line 217
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v0
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
.end method

.method public static e([B)Lax/c3/G;
    .registers 2

    .line 1
    new-instance v0, Lax/c3/F$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/c3/F$a;-><init>([B)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public static f(Ljava/io/InputStream;Ljava/io/File;JLax/u3/c;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_1
    new-instance v3, Ljava/io/FileOutputStream;

    .line 3
    .line 4
    invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catch Lax/b3/a; {:try_start_1 .. :try_end_6} :catch_21
    .catchall {:try_start_1 .. :try_end_6} :catchall_1d

    .line 5
    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-wide v4, p2

    .line 10
    move-object v6, p4

    .line 11
    :try_start_a
    invoke-static/range {v2 .. v7}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J
    :try_end_d
    .catch Lax/b3/a; {:try_start_a .. :try_end_d} :catch_1a
    .catchall {:try_start_a .. :try_end_d} :catchall_16

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_12

    .line 15
    .line 16
    :try_start_f
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_12} :catch_12

    .line 17
    .line 18
    .line 19
    :catch_12
    :cond_12
    :try_start_12
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_15} :catch_15

    .line 20
    .line 21
    .line 22
    :catch_15
    return-void

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    move-object p0, v0

    .line 25
    move-object v1, v3

    .line 26
    goto :goto_37

    .line 27
    :catch_1a
    move-exception v0

    .line 28
    move-object p0, v0

    .line 29
    goto :goto_25

    .line 30
    :catchall_1d
    move-exception v0

    .line 31
    move-object v2, p0

    .line 32
    :goto_1f
    move-object p0, v0

    .line 33
    goto :goto_37

    .line 34
    :catch_21
    move-exception v0

    .line 35
    move-object v2, p0

    .line 36
    move-object p0, v0

    .line 37
    move-object v3, v1

    .line 38
    :goto_25
    :try_start_25
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_28} :catch_29
    .catchall {:try_start_25 .. :try_end_28} :catchall_16

    .line 39
    .line 40
    .line 41
    goto :goto_2a

    .line 42
    :catch_29
    move-object v1, v3

    .line 43
    :goto_2a
    :try_start_2a
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_36

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 50
    .line 51
    .line 52
    goto :goto_36

    .line 53
    :catchall_34
    move-exception v0

    .line 54
    goto :goto_1f

    .line 55
    :cond_36
    :goto_36
    throw p0
    :try_end_37
    .catchall {:try_start_2a .. :try_end_37} :catchall_34

    .line 56
    :goto_37
    if-eqz v2, :cond_3e

    .line 57
    .line 58
    :try_start_39
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3c
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_3c} :catch_3d

    .line 59
    .line 60
    .line 61
    goto :goto_3e

    .line 62
    :catch_3d
    nop

    .line 63
    :cond_3e
    :goto_3e
    if-eqz v1, :cond_43

    .line 64
    .line 65
    :try_start_40
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_40 .. :try_end_43} :catch_43

    .line 66
    .line 67
    .line 68
    :catch_43
    :cond_43
    throw p0
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
.end method

.method public static g(Lax/c3/k;Ljava/lang/String;)[B
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_1e

    .line 7
    .line 8
    new-instance v1, Lax/Dc/S;

    .line 9
    .line 10
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v1, p0}, Lax/Dc/S;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    goto :goto_39

    .line 21
    :catchall_14
    move-exception p0

    .line 22
    move-object p1, v0

    .line 23
    move-object v1, p1

    .line 24
    goto/16 :goto_8a

    .line 25
    .line 26
    :catch_19
    move-exception p0

    .line 27
    move-object p1, v0

    .line 28
    move-object v1, p1

    .line 29
    goto/16 :goto_7d

    .line 30
    .line 31
    :cond_1e
    check-cast p0, Lcom/voxdon/xplorer/file/i;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/i;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v1, Ljava/io/FileInputStream;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_2e
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_2e} :catch_19
    .catchall {:try_start_1 .. :try_end_2e} :catchall_14

    .line 45
    .line 46
    .line 47
    :try_start_2e
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance v2, Lax/Dc/S;

    .line 52
    .line 53
    invoke-direct {v2, p0}, Lax/Dc/S;-><init>(Ljava/nio/channels/SeekableByteChannel;)V
    :try_end_37
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_37} :catch_7b
    .catchall {:try_start_2e .. :try_end_37} :catchall_78

    .line 54
    .line 55
    .line 56
    move-object p0, v1

    .line 57
    move-object v1, v2

    .line 58
    :goto_39
    :try_start_39
    invoke-virtual {v1, p1}, Lax/Dc/S;->g(Ljava/lang/String;)Lax/Dc/I;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_3d} :catch_71
    .catchall {:try_start_39 .. :try_end_3d} :catchall_6b

    .line 62
    if-nez p1, :cond_48

    .line 63
    .line 64
    if-eqz p0, :cond_44

    .line 65
    .line 66
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 67
    .line 68
    .line 69
    :cond_44
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_48
    :try_start_48
    invoke-virtual {v1, p1}, Lax/Dc/S;->j(Lax/Dc/I;)Ljava/io/InputStream;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 78
    .line 79
    const/16 v2, 0x2000

    .line 80
    .line 81
    invoke-direct {p1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p1}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_5d
    .catch Ljava/io/IOException; {:try_start_48 .. :try_end_5d} :catch_71
    .catchall {:try_start_48 .. :try_end_5d} :catchall_6b

    .line 94
    if-eqz v0, :cond_62

    .line 95
    .line 96
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 97
    .line 98
    .line 99
    :cond_62
    if-eqz p0, :cond_67

    .line 100
    .line 101
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 102
    .line 103
    .line 104
    :cond_67
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :catchall_6b
    move-exception p1

    .line 109
    move-object v3, v1

    .line 110
    move-object v1, p0

    .line 111
    move-object p0, p1

    .line 112
    :goto_6f
    move-object p1, v3

    .line 113
    goto :goto_8a

    .line 114
    :catch_71
    move-exception p1

    .line 115
    move-object v3, v1

    .line 116
    move-object v1, p0

    .line 117
    move-object p0, p1

    .line 118
    move-object p1, v0

    .line 119
    move-object v0, v3

    .line 120
    goto :goto_7d

    .line 121
    :catchall_78
    move-exception p0

    .line 122
    move-object p1, v0

    .line 123
    goto :goto_8a

    .line 124
    :catch_7b
    move-exception p0

    .line 125
    move-object p1, v0

    .line 126
    :goto_7d
    :try_start_7d
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    new-instance v2, Lax/b3/j;

    .line 130
    .line 131
    invoke-direct {v2, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v2
    :try_end_86
    .catchall {:try_start_7d .. :try_end_86} :catchall_86

    .line 135
    :catchall_86
    move-exception p0

    .line 136
    move-object v3, v0

    .line 137
    move-object v0, p1

    .line 138
    goto :goto_6f

    .line 139
    :goto_8a
    if-eqz v0, :cond_8f

    .line 140
    .line 141
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    if-eqz v1, :cond_94

    .line 145
    .line 146
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 147
    .line 148
    .line 149
    :cond_94
    if-eqz p1, :cond_99

    .line 150
    .line 151
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 152
    .line 153
    .line 154
    :cond_99
    throw p0
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

.method public static h(Ljava/io/InputStream;I)[B
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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

.method public static i(Ljava/io/InputStream;I)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 7
    .line 8
    .line 9
    const-string p0, "UTF-8"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method public static j(Ljava/io/InputStream;IJ)Ljava/lang/String;
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v1, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x2000

    .line 7
    .line 8
    new-array v4, p1, [B

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-wide v6, p2

    .line 17
    :try_start_10
    invoke-static/range {v0 .. v9}, Lax/c3/F;->d(Ljava/io/InputStream;Ljava/io/OutputStream;J[BZJLax/u3/c;Lax/g3/i;)J

    .line 18
    .line 19
    .line 20
    const-string p0, "UTF-8"

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_19
    .catch Lax/b3/a; {:try_start_10 .. :try_end_19} :catch_1a

    .line 26
    return-object p0

    .line 27
    :catch_1a
    invoke-static {}, Lax/u3/b;->f()V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
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
.end method

.method public static k(Lax/c3/k;Ljava/lang/String;Ljava/io/File;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_21

    .line 8
    .line 9
    new-instance v1, Lax/Dc/S;

    .line 10
    .line 11
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v1, p0}, Lax/Dc/S;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    goto :goto_3b

    .line 22
    :catchall_15
    move-exception p0

    .line 23
    move-object p1, v0

    .line 24
    move-object p2, p1

    .line 25
    move-object v1, p2

    .line 26
    goto/16 :goto_a9

    .line 27
    .line 28
    :catch_1b
    move-exception p0

    .line 29
    move-object p1, v0

    .line 30
    move-object p2, p1

    .line 31
    move-object v1, p2

    .line 32
    goto/16 :goto_9d

    .line 33
    .line 34
    :cond_21
    check-cast p0, Lcom/voxdon/xplorer/file/i;

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/i;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v1, Ljava/io/FileInputStream;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_30
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_30} :catch_1b
    .catchall {:try_start_1 .. :try_end_30} :catchall_15

    .line 47
    .line 48
    .line 49
    :try_start_30
    invoke-static {v1}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v3, Lax/Dc/S;

    .line 54
    .line 55
    invoke-direct {v3, p0}, Lax/Dc/S;-><init>(Ljava/nio/channels/SeekableByteChannel;)V
    :try_end_39
    .catch Ljava/io/IOException; {:try_start_30 .. :try_end_39} :catch_9a
    .catchall {:try_start_30 .. :try_end_39} :catchall_96

    .line 56
    .line 57
    .line 58
    move-object p0, v1

    .line 59
    move-object v1, v3

    .line 60
    :goto_3b
    :try_start_3b
    invoke-virtual {v1, p1}, Lax/Dc/S;->g(Ljava/lang/String;)Lax/Dc/I;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_3f
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_3f} :catch_8f
    .catchall {:try_start_3b .. :try_end_3f} :catchall_88

    .line 64
    if-nez p1, :cond_4b

    .line 65
    .line 66
    if-eqz p0, :cond_46

    .line 67
    .line 68
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 69
    .line 70
    .line 71
    :cond_46
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_4b
    :try_start_4b
    invoke-virtual {v1, p1}, Lax/Dc/S;->j(Lax/Dc/I;)Ljava/io/InputStream;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_4f
    .catch Ljava/io/IOException; {:try_start_4b .. :try_end_4f} :catch_8f
    .catchall {:try_start_4b .. :try_end_4f} :catchall_88

    .line 80
    :try_start_4f
    new-instance v3, Ljava/io/FileOutputStream;

    .line 81
    .line 82
    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 83
    .line 84
    .line 85
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 86
    .line 87
    const/16 v4, 0x2000

    .line 88
    .line 89
    invoke-direct {p2, v3, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_5b
    .catch Ljava/io/IOException; {:try_start_4f .. :try_end_5b} :catch_82
    .catchall {:try_start_4f .. :try_end_5b} :catchall_7c

    .line 90
    .line 91
    .line 92
    :try_start_5b
    invoke-static {p1, p2}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_5e
    .catch Ljava/io/IOException; {:try_start_5b .. :try_end_5e} :catch_76
    .catchall {:try_start_5b .. :try_end_5e} :catchall_6f

    .line 93
    .line 94
    .line 95
    if-eqz p1, :cond_63

    .line 96
    .line 97
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 98
    .line 99
    .line 100
    :cond_63
    if-eqz p0, :cond_68

    .line 101
    .line 102
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 103
    .line 104
    .line 105
    :cond_68
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 109
    .line 110
    .line 111
    return v2

    .line 112
    :catchall_6f
    move-exception v0

    .line 113
    move-object v5, v1

    .line 114
    move-object v1, p0

    .line 115
    move-object p0, v0

    .line 116
    :goto_73
    move-object v0, p1

    .line 117
    move-object p1, v5

    .line 118
    goto :goto_a9

    .line 119
    :catch_76
    move-exception v0

    .line 120
    move-object v5, v1

    .line 121
    move-object v1, p0

    .line 122
    move-object p0, v0

    .line 123
    :goto_7a
    move-object v0, v5

    .line 124
    goto :goto_9d

    .line 125
    :catchall_7c
    move-exception p2

    .line 126
    move-object v5, v1

    .line 127
    move-object v1, p0

    .line 128
    move-object p0, p2

    .line 129
    move-object p2, v0

    .line 130
    goto :goto_73

    .line 131
    :catch_82
    move-exception p2

    .line 132
    move-object v5, v1

    .line 133
    move-object v1, p0

    .line 134
    move-object p0, p2

    .line 135
    move-object p2, v0

    .line 136
    goto :goto_7a

    .line 137
    :catchall_88
    move-exception p1

    .line 138
    move-object p2, v1

    .line 139
    move-object v1, p0

    .line 140
    move-object p0, p1

    .line 141
    move-object p1, p2

    .line 142
    move-object p2, v0

    .line 143
    goto :goto_a9

    .line 144
    :catch_8f
    move-exception p1

    .line 145
    move-object p2, v0

    .line 146
    move-object v0, v1

    .line 147
    move-object v1, p0

    .line 148
    move-object p0, p1

    .line 149
    move-object p1, p2

    .line 150
    goto :goto_9d

    .line 151
    :catchall_96
    move-exception p0

    .line 152
    move-object p1, v0

    .line 153
    move-object p2, p1

    .line 154
    goto :goto_a9

    .line 155
    :catch_9a
    move-exception p0

    .line 156
    move-object p1, v0

    .line 157
    move-object p2, p1

    .line 158
    :goto_9d
    :try_start_9d
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    new-instance v2, Lax/b3/j;

    .line 162
    .line 163
    invoke-direct {v2, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    throw v2
    :try_end_a6
    .catchall {:try_start_9d .. :try_end_a6} :catchall_a6

    .line 167
    :catchall_a6
    move-exception p0

    .line 168
    move-object v5, v0

    .line 169
    goto :goto_73

    .line 170
    :goto_a9
    if-eqz v0, :cond_ae

    .line 171
    .line 172
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 173
    .line 174
    .line 175
    :cond_ae
    if-eqz v1, :cond_b3

    .line 176
    .line 177
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 178
    .line 179
    .line 180
    :cond_b3
    if-eqz p1, :cond_b8

    .line 181
    .line 182
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 183
    .line 184
    .line 185
    :cond_b8
    if-eqz p2, :cond_bd

    .line 186
    .line 187
    invoke-static {p2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    throw p0
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
.end method

.method public static l(Lax/c3/k;Ljava/io/File;Lax/B/b;)Lax/B/b;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c3/k;",
            "Ljava/io/File;",
            "Lax/B/b<",
            "Ljava/lang/String;",
            ">;)",
            "Lax/B/b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 8
    .line 9
    .line 10
    :cond_9
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1b

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    goto :goto_1b

    .line 20
    :cond_13
    new-instance p0, Lax/b3/j;

    .line 21
    .line 22
    const-string p1, "Destination directory is not empty."

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1b
    :goto_1b
    const/4 v0, 0x0

    .line 29
    if-eqz p2, :cond_24

    .line 30
    .line 31
    new-instance v1, Lax/B/b;

    .line 32
    .line 33
    invoke-direct {v1}, Lax/B/b;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_25

    .line 37
    :cond_24
    move-object v1, v0

    .line 38
    :goto_25
    :try_start_25
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_40

    .line 43
    .line 44
    new-instance v2, Lax/Dc/S;

    .line 45
    .line 46
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v2, p0}, Lax/Dc/S;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object p0, v0

    .line 56
    goto :goto_5b

    .line 57
    :catchall_38
    move-exception p0

    .line 58
    move-object v2, v0

    .line 59
    goto/16 :goto_116

    .line 60
    .line 61
    :catch_3c
    move-exception p0

    .line 62
    move-object v2, v0

    .line 63
    goto/16 :goto_10d

    .line 64
    .line 65
    :cond_40
    check-cast p0, Lcom/voxdon/xplorer/file/i;

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-virtual {p0, v2}, Lcom/voxdon/xplorer/file/i;->e0(Z)Landroid/os/ParcelFileDescriptor;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v2, Ljava/io/FileInputStream;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_50
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_50} :catch_3c
    .catchall {:try_start_25 .. :try_end_50} :catchall_38

    .line 79
    .line 80
    .line 81
    :try_start_50
    invoke-static {v2}, Lax/T/l;->a(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v3, Lax/Dc/S;

    .line 86
    .line 87
    invoke-direct {v3, p0}, Lax/Dc/S;-><init>(Ljava/nio/channels/SeekableByteChannel;)V
    :try_end_59
    .catch Ljava/io/IOException; {:try_start_50 .. :try_end_59} :catch_10c
    .catchall {:try_start_50 .. :try_end_59} :catchall_10a

    .line 88
    .line 89
    .line 90
    move-object p0, v2

    .line 91
    move-object v2, v3

    .line 92
    :goto_5b
    :try_start_5b
    invoke-virtual {v2}, Lax/Dc/S;->f()Ljava/util/Enumeration;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :cond_5f
    :goto_5f
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_101

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Lax/Dc/I;

    .line 107
    .line 108
    invoke-virtual {v4}, Lax/Dc/I;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-eqz p2, :cond_84

    .line 113
    .line 114
    invoke-virtual {p2, v5}, Lax/B/b;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_5f

    .line 119
    .line 120
    goto :goto_84

    .line 121
    :catchall_78
    move-exception p1

    .line 122
    move-object v0, v2

    .line 123
    move-object v2, p0

    .line 124
    move-object p0, p1

    .line 125
    goto/16 :goto_116

    .line 126
    .line 127
    :catch_7e
    move-exception p1

    .line 128
    move-object v0, v2

    .line 129
    move-object v2, p0

    .line 130
    move-object p0, p1

    .line 131
    goto/16 :goto_10d

    .line 132
    .line 133
    :cond_84
    :goto_84
    new-instance v6, Ljava/io/File;

    .line 134
    .line 135
    invoke-direct {v6, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_ea

    .line 168
    .line 169
    invoke-virtual {v4}, Lax/Dc/I;->isDirectory()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_b2

    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 176
    .line 177
    .line 178
    goto :goto_5f

    .line 179
    :cond_b2
    new-instance v7, Ljava/io/File;

    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z
    :try_end_be
    .catch Ljava/io/IOException; {:try_start_5b .. :try_end_be} :catch_7e
    .catchall {:try_start_5b .. :try_end_be} :catchall_78

    .line 189
    .line 190
    .line 191
    :try_start_be
    invoke-virtual {v2, v4}, Lax/Dc/S;->j(Lax/Dc/I;)Ljava/io/InputStream;

    .line 192
    .line 193
    .line 194
    move-result-object v4
    :try_end_c2
    .catchall {:try_start_be .. :try_end_c2} :catchall_dd

    .line 195
    :try_start_c2
    new-instance v7, Ljava/io/FileOutputStream;

    .line 196
    .line 197
    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_c7
    .catchall {:try_start_c2 .. :try_end_c7} :catchall_db

    .line 198
    .line 199
    .line 200
    :try_start_c7
    invoke-static {v4, v7}, Lax/c3/F;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_ca
    .catchall {:try_start_c7 .. :try_end_ca} :catchall_d8

    .line 201
    .line 202
    .line 203
    :try_start_ca
    invoke-static {v7}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 204
    .line 205
    .line 206
    if-eqz v4, :cond_d2

    .line 207
    .line 208
    invoke-static {v4}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 209
    .line 210
    .line 211
    :cond_d2
    if-eqz v1, :cond_5f

    .line 212
    .line 213
    invoke-virtual {v1, v5}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_5f

    .line 217
    :catchall_d8
    move-exception p1

    .line 218
    move-object v0, v7

    .line 219
    goto :goto_df

    .line 220
    :catchall_db
    move-exception p1

    .line 221
    goto :goto_df

    .line 222
    :catchall_dd
    move-exception p1

    .line 223
    move-object v4, v0

    .line 224
    :goto_df
    if-eqz v0, :cond_e4

    .line 225
    .line 226
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 227
    .line 228
    .line 229
    :cond_e4
    if-eqz v4, :cond_e9

    .line 230
    .line 231
    invoke-static {v4}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 232
    .line 233
    .line 234
    :cond_e9
    throw p1

    .line 235
    :cond_ea
    new-instance p1, Lax/b3/j;

    .line 236
    .line 237
    new-instance p2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v0, "Illegal name: "

    .line 243
    .line 244
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1
    :try_end_101
    .catch Ljava/io/IOException; {:try_start_ca .. :try_end_101} :catch_7e
    .catchall {:try_start_ca .. :try_end_101} :catchall_78

    .line 258
    :cond_101
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 259
    .line 260
    .line 261
    if-eqz p0, :cond_109

    .line 262
    .line 263
    invoke-static {p0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 264
    .line 265
    .line 266
    :cond_109
    return-object v1

    .line 267
    :catchall_10a
    move-exception p0

    .line 268
    goto :goto_116

    .line 269
    :catch_10c
    move-exception p0

    .line 270
    :goto_10d
    :try_start_10d
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 271
    .line 272
    .line 273
    new-instance p1, Lax/b3/j;

    .line 274
    .line 275
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    throw p1
    :try_end_116
    .catchall {:try_start_10d .. :try_end_116} :catchall_10a

    .line 279
    :goto_116
    if-eqz v0, :cond_11b

    .line 280
    .line 281
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 282
    .line 283
    .line 284
    :cond_11b
    if-eqz v2, :cond_120

    .line 285
    .line 286
    invoke-static {v2}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 287
    .line 288
    .line 289
    :cond_120
    throw p0
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
.end method

.method public static m(Ljava/io/File;Ljava/lang/String;)V
    .registers 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/FileWriter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_b} :catch_b

    .line 10
    .line 11
    .line 12
    :catch_b
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
