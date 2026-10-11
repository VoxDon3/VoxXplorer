.class public final Lax/R3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/R3/i$b;,
        Lax/R3/i$a;,
        Lax/R3/i$c;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Landroid/content/Context;

.field private final d:I


# direct methods
.method constructor <init>(Lax/R3/i$a;)V
    .registers 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/R3/i$a;->a(Lax/R3/i$a;)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/R3/i;->c:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, Lax/R3/i$a;->b(Lax/R3/i$a;)Landroid/app/ActivityManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lax/R3/i;->f(Landroid/app/ActivityManager;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1a

    .line 19
    .line 20
    invoke-static {p1}, Lax/R3/i$a;->c(Lax/R3/i$a;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    div-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    goto :goto_1e

    .line 27
    :cond_1a
    invoke-static {p1}, Lax/R3/i$a;->c(Lax/R3/i$a;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_1e
    iput v0, p0, Lax/R3/i;->d:I

    .line 32
    .line 33
    invoke-static {p1}, Lax/R3/i$a;->b(Lax/R3/i$a;)Landroid/app/ActivityManager;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p1}, Lax/R3/i$a;->d(Lax/R3/i$a;)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {p1}, Lax/R3/i$a;->e(Lax/R3/i$a;)F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-static {v1, v2, v3}, Lax/R3/i;->d(Landroid/app/ActivityManager;FF)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {p1}, Lax/R3/i$a;->f(Lax/R3/i$a;)Lax/R3/i$c;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2}, Lax/R3/i$c;->b()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-static {p1}, Lax/R3/i$a;->f(Lax/R3/i$a;)Lax/R3/i$c;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Lax/R3/i$c;->a()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    mul-int v2, v2, v3

    .line 66
    .line 67
    mul-int/lit8 v2, v2, 0x4

    .line 68
    .line 69
    int-to-float v2, v2

    .line 70
    invoke-static {p1}, Lax/R3/i$a;->g(Lax/R3/i$a;)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    mul-float v3, v3, v2

    .line 75
    .line 76
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {p1}, Lax/R3/i$a;->h(Lax/R3/i$a;)F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    mul-float v2, v2, v4

    .line 85
    .line 86
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    sub-int v4, v1, v0

    .line 91
    .line 92
    add-int v5, v2, v3

    .line 93
    .line 94
    if-gt v5, v4, :cond_64

    .line 95
    .line 96
    iput v2, p0, Lax/R3/i;->b:I

    .line 97
    .line 98
    iput v3, p0, Lax/R3/i;->a:I

    .line 99
    .line 100
    goto :goto_87

    .line 101
    :cond_64
    int-to-float v2, v4

    .line 102
    invoke-static {p1}, Lax/R3/i$a;->g(Lax/R3/i$a;)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {p1}, Lax/R3/i$a;->h(Lax/R3/i$a;)F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    add-float/2addr v3, v4

    .line 111
    div-float/2addr v2, v3

    .line 112
    invoke-static {p1}, Lax/R3/i$a;->h(Lax/R3/i$a;)F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    mul-float v3, v3, v2

    .line 117
    .line 118
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iput v3, p0, Lax/R3/i;->b:I

    .line 123
    .line 124
    invoke-static {p1}, Lax/R3/i$a;->g(Lax/R3/i$a;)F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    mul-float v2, v2, v3

    .line 129
    .line 130
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    iput v2, p0, Lax/R3/i;->a:I

    .line 135
    .line 136
    :goto_87
    const/4 v2, 0x3

    .line 137
    const-string v3, "MemorySizeCalculator"

    .line 138
    .line 139
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_fd

    .line 144
    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v4, "Calculation complete, Calculated memory cache size: "

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget v4, p0, Lax/R3/i;->b:I

    .line 156
    .line 157
    invoke-direct {p0, v4}, Lax/R3/i;->g(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v4, ", pool size: "

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget v4, p0, Lax/R3/i;->a:I

    .line 170
    .line 171
    invoke-direct {p0, v4}, Lax/R3/i;->g(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v4, ", byte array size: "

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-direct {p0, v0}, Lax/R3/i;->g(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v0, ", memory class limited? "

    .line 191
    .line 192
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    if-le v5, v1, :cond_c6

    .line 196
    .line 197
    const/4 v0, 0x1

    .line 198
    goto :goto_c7

    .line 199
    :cond_c6
    const/4 v0, 0x0

    .line 200
    :goto_c7
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, ", max size: "

    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-direct {p0, v1}, Lax/R3/i;->g(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v0, ", memoryClass: "

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-static {p1}, Lax/R3/i$a;->b(Lax/R3/i$a;)Landroid/app/ActivityManager;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v0, ", isLowMemoryDevice: "

    .line 232
    .line 233
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-static {p1}, Lax/R3/i$a;->b(Lax/R3/i$a;)Landroid/app/ActivityManager;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {p1}, Lax/R3/i;->f(Landroid/app/ActivityManager;)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_fd
    return-void
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

.method static synthetic a(Landroid/app/ActivityManager;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lax/R3/i;->f(Landroid/app/ActivityManager;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private static d(Landroid/app/ActivityManager;FF)I
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x100000

    .line 6
    .line 7
    mul-int v0, v0, v1

    .line 8
    .line 9
    invoke-static {p0}, Lax/R3/i;->f(Landroid/app/ActivityManager;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-float v0, v0

    .line 14
    if-eqz p0, :cond_10

    .line 15
    .line 16
    move p1, p2

    .line 17
    :cond_10
    mul-float v0, v0, p1

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method private static f(Landroid/app/ActivityManager;)Z
    .registers 1

    .line 1
    invoke-virtual {p0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private g(I)Ljava/lang/String;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/R3/i;->c:Landroid/content/Context;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    invoke-static {v0, v1, v2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
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
.method public b()I
    .registers 2

    .line 1
    iget v0, p0, Lax/R3/i;->d:I

    .line 2
    .line 3
    return v0
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

.method public c()I
    .registers 2

    .line 1
    iget v0, p0, Lax/R3/i;->a:I

    .line 2
    .line 3
    return v0
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

.method public e()I
    .registers 2

    .line 1
    iget v0, p0, Lax/R3/i;->b:I

    .line 2
    .line 3
    return v0
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
