.class public Lax/p3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lax/p3/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c0:Ljava/lang/String;

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:J

.field public j0:J

.field public q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/p3/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/p3/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/p3/a;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/p3/a;->d0:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lax/p3/a;->e0:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lax/p3/a;->f0:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lax/p3/a;->g0:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lax/p3/a;->h0:Z

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    iput-wide v0, p0, Lax/p3/a;->i0:J

    .line 18
    .line 19
    iput-wide v0, p0, Lax/p3/a;->j0:J

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)V
    .registers 9

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    const-string v3, "Overflow in the size of parcelable"

    .line 11
    .line 12
    const v4, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-lt v1, v2, :cond_10d

    .line 16
    .line 17
    :try_start_10
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_14
    .catchall {:try_start_10 .. :try_end_14} :catchall_10b

    .line 21
    sub-int/2addr v2, v0

    .line 22
    if-lt v2, v1, :cond_25

    .line 23
    .line 24
    sub-int/2addr v4, v1

    .line 25
    if-gt v0, v4, :cond_1f

    .line 26
    .line 27
    :goto_1a
    add-int/2addr v0, v1

    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    new-instance p1, Landroid/os/BadParcelableException;

    .line 33
    .line 34
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_25
    :try_start_25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, p0, Lax/p3/a;->q:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 45
    .line 46
    .line 47
    move-result v2
    :try_end_2f
    .catchall {:try_start_25 .. :try_end_2f} :catchall_10b

    .line 48
    sub-int/2addr v2, v0

    .line 49
    if-lt v2, v1, :cond_3c

    .line 50
    .line 51
    sub-int/2addr v4, v1

    .line 52
    if-gt v0, v4, :cond_36

    .line 53
    .line 54
    goto :goto_1a

    .line 55
    :cond_36
    new-instance p1, Landroid/os/BadParcelableException;

    .line 56
    .line 57
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_3c
    :try_start_3c
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iput-object v2, p0, Lax/p3/a;->c0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 68
    .line 69
    .line 70
    move-result v2
    :try_end_46
    .catchall {:try_start_3c .. :try_end_46} :catchall_10b

    .line 71
    sub-int/2addr v2, v0

    .line 72
    if-lt v2, v1, :cond_53

    .line 73
    .line 74
    sub-int/2addr v4, v1

    .line 75
    if-gt v0, v4, :cond_4d

    .line 76
    .line 77
    goto :goto_1a

    .line 78
    :cond_4d
    new-instance p1, Landroid/os/BadParcelableException;

    .line 79
    .line 80
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_53
    :try_start_53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x1

    .line 90
    if-eqz v2, :cond_5d

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    goto :goto_5e

    .line 94
    :cond_5d
    const/4 v2, 0x0

    .line 95
    :goto_5e
    iput-boolean v2, p0, Lax/p3/a;->d0:Z

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 98
    .line 99
    .line 100
    move-result v2
    :try_end_64
    .catchall {:try_start_53 .. :try_end_64} :catchall_10b

    .line 101
    sub-int/2addr v2, v0

    .line 102
    if-lt v2, v1, :cond_71

    .line 103
    .line 104
    sub-int/2addr v4, v1

    .line 105
    if-gt v0, v4, :cond_6b

    .line 106
    .line 107
    goto :goto_1a

    .line 108
    :cond_6b
    new-instance p1, Landroid/os/BadParcelableException;

    .line 109
    .line 110
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_71
    :try_start_71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_79

    .line 119
    .line 120
    const/4 v2, 0x1

    .line 121
    goto :goto_7a

    .line 122
    :cond_79
    const/4 v2, 0x0

    .line 123
    :goto_7a
    iput-boolean v2, p0, Lax/p3/a;->e0:Z

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 126
    .line 127
    .line 128
    move-result v2
    :try_end_80
    .catchall {:try_start_71 .. :try_end_80} :catchall_10b

    .line 129
    sub-int/2addr v2, v0

    .line 130
    if-lt v2, v1, :cond_8d

    .line 131
    .line 132
    sub-int/2addr v4, v1

    .line 133
    if-gt v0, v4, :cond_87

    .line 134
    .line 135
    goto :goto_1a

    .line 136
    :cond_87
    new-instance p1, Landroid/os/BadParcelableException;

    .line 137
    .line 138
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_8d
    :try_start_8d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_95

    .line 147
    .line 148
    const/4 v2, 0x1

    .line 149
    goto :goto_96

    .line 150
    :cond_95
    const/4 v2, 0x0

    .line 151
    :goto_96
    iput-boolean v2, p0, Lax/p3/a;->f0:Z

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 154
    .line 155
    .line 156
    move-result v2
    :try_end_9c
    .catchall {:try_start_8d .. :try_end_9c} :catchall_10b

    .line 157
    sub-int/2addr v2, v0

    .line 158
    if-lt v2, v1, :cond_aa

    .line 159
    .line 160
    sub-int/2addr v4, v1

    .line 161
    if-gt v0, v4, :cond_a4

    .line 162
    .line 163
    goto/16 :goto_1a

    .line 164
    .line 165
    :cond_a4
    new-instance p1, Landroid/os/BadParcelableException;

    .line 166
    .line 167
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_aa
    :try_start_aa
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_b2

    .line 176
    .line 177
    const/4 v2, 0x1

    .line 178
    goto :goto_b3

    .line 179
    :cond_b2
    const/4 v2, 0x0

    .line 180
    :goto_b3
    iput-boolean v2, p0, Lax/p3/a;->g0:Z

    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 183
    .line 184
    .line 185
    move-result v2
    :try_end_b9
    .catchall {:try_start_aa .. :try_end_b9} :catchall_10b

    .line 186
    sub-int/2addr v2, v0

    .line 187
    if-lt v2, v1, :cond_c7

    .line 188
    .line 189
    sub-int/2addr v4, v1

    .line 190
    if-gt v0, v4, :cond_c1

    .line 191
    .line 192
    goto/16 :goto_1a

    .line 193
    .line 194
    :cond_c1
    new-instance p1, Landroid/os/BadParcelableException;

    .line 195
    .line 196
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_c7
    :try_start_c7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_ce

    .line 205
    .line 206
    const/4 v5, 0x1

    .line 207
    :cond_ce
    iput-boolean v5, p0, Lax/p3/a;->h0:Z

    .line 208
    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 210
    .line 211
    .line 212
    move-result v2
    :try_end_d4
    .catchall {:try_start_c7 .. :try_end_d4} :catchall_10b

    .line 213
    sub-int/2addr v2, v0

    .line 214
    if-lt v2, v1, :cond_e2

    .line 215
    .line 216
    sub-int/2addr v4, v1

    .line 217
    if-gt v0, v4, :cond_dc

    .line 218
    .line 219
    goto/16 :goto_1a

    .line 220
    .line 221
    :cond_dc
    new-instance p1, Landroid/os/BadParcelableException;

    .line 222
    .line 223
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :cond_e2
    :try_start_e2
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 228
    .line 229
    .line 230
    move-result-wide v5

    .line 231
    iput-wide v5, p0, Lax/p3/a;->i0:J

    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 234
    .line 235
    .line 236
    move-result v2
    :try_end_ec
    .catchall {:try_start_e2 .. :try_end_ec} :catchall_10b

    .line 237
    sub-int/2addr v2, v0

    .line 238
    if-lt v2, v1, :cond_fa

    .line 239
    .line 240
    sub-int/2addr v4, v1

    .line 241
    if-gt v0, v4, :cond_f4

    .line 242
    .line 243
    goto/16 :goto_1a

    .line 244
    .line 245
    :cond_f4
    new-instance p1, Landroid/os/BadParcelableException;

    .line 246
    .line 247
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw p1

    .line 251
    :cond_fa
    :try_start_fa
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 252
    .line 253
    .line 254
    move-result-wide v5

    .line 255
    iput-wide v5, p0, Lax/p3/a;->j0:J
    :try_end_100
    .catchall {:try_start_fa .. :try_end_100} :catchall_10b

    .line 256
    .line 257
    sub-int/2addr v4, v1

    .line 258
    if-gt v0, v4, :cond_105

    .line 259
    .line 260
    goto/16 :goto_1a

    .line 261
    .line 262
    :cond_105
    new-instance p1, Landroid/os/BadParcelableException;

    .line 263
    .line 264
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :catchall_10b
    move-exception v2

    .line 269
    goto :goto_115

    .line 270
    :cond_10d
    :try_start_10d
    new-instance v2, Landroid/os/BadParcelableException;

    .line 271
    .line 272
    const-string v5, "Parcelable too small"

    .line 273
    .line 274
    invoke-direct {v2, v5}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v2
    :try_end_115
    .catchall {:try_start_10d .. :try_end_115} :catchall_10b

    .line 278
    :goto_115
    sub-int/2addr v4, v1

    .line 279
    if-le v0, v4, :cond_11e

    .line 280
    .line 281
    new-instance p1, Landroid/os/BadParcelableException;

    .line 282
    .line 283
    invoke-direct {p1, v3}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :cond_11e
    add-int/2addr v0, v1

    .line 288
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 289
    .line 290
    .line 291
    throw v2
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

.method public describeContents()I
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/p3/a;->q:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/p3/a;->c0:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lax/p3/a;->d0:Z

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Lax/p3/a;->e0:Z

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, p0, Lax/p3/a;->f0:Z

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    iget-boolean v0, p0, Lax/p3/a;->g0:Z

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    .line 38
    .line 39
    iget-boolean v0, p0, Lax/p3/a;->h0:Z

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    iget-wide v0, p0, Lax/p3/a;->i0:J

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 47
    .line 48
    .line 49
    iget-wide v0, p0, Lax/p3/a;->j0:J

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 59
    .line 60
    .line 61
    sub-int p2, v0, p2

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 67
    .line 68
    .line 69
    return-void
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
.end method
