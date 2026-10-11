.class public Lax/X2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation


# static fields
.field private static A:Z

.field private static B:Ljava/lang/reflect/Method;

.field private static a:Ljava/lang/reflect/Method;

.field private static b:Z

.field private static c:Ljava/lang/reflect/Method;

.field private static d:Z

.field private static e:Ljava/lang/reflect/Method;

.field private static f:Z

.field private static g:Ljava/lang/reflect/Method;

.field private static h:Z

.field private static i:Ljava/lang/reflect/Method;

.field private static j:Z

.field private static k:Ljava/lang/reflect/Method;

.field private static l:Z

.field private static m:Ljava/lang/reflect/Method;

.field private static n:Z

.field private static o:Ljava/lang/reflect/Method;

.field private static p:Z

.field private static q:Ljava/lang/reflect/Method;

.field private static r:Z

.field private static s:Ljava/lang/reflect/Field;

.field private static t:Ljava/lang/reflect/Field;

.field private static u:Ljava/lang/reflect/Field;

.field private static v:Ljava/lang/reflect/Method;

.field private static w:Ljava/lang/reflect/Method;

.field private static x:Ljava/lang/reflect/Method;

.field private static y:Ljava/lang/reflect/Method;

.field private static z:Ljava/lang/reflect/Method;


# direct methods
.method static synthetic a(Ljava/lang/Object;)Lax/X2/O;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/X2/w;->b(Ljava/lang/Object;)Lax/X2/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static b(Ljava/lang/Object;)Lax/X2/O;
    .registers 8

    .line 1
    const-string v0, "getDescription"

    .line 2
    .line 3
    sget-boolean v1, Lax/X2/w;->A:Z

    .line 4
    .line 5
    const-string v2, "API is not available on api level "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_9a

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_a
    const-string v4, "android.os.storage.VolumeInfo"

    .line 12
    .line 13
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v5, "disk"

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    sput-object v5, Lax/X2/w;->t:Ljava/lang/reflect/Field;

    .line 24
    .line 25
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    const-string v5, "type"

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    sput-object v5, Lax/X2/w;->s:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    const-string v5, "android.os.storage.DiskInfo"

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v6, "flags"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    sput-object v6, Lax/X2/w;->u:Ljava/lang/reflect/Field;

    .line 52
    .line 53
    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    const-string v6, "getPath"

    .line 57
    .line 58
    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    sput-object v6, Lax/X2/w;->v:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    const-string v6, "getFsUuid"

    .line 65
    .line 66
    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    sput-object v6, Lax/X2/w;->w:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    sput-object v6, Lax/X2/w;->y:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    const-string v6, "getState"

    .line 79
    .line 80
    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    sput-object v6, Lax/X2/w;->z:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    const-string v6, "getId"

    .line 87
    .line 88
    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    sput-object v4, Lax/X2/w;->x:Ljava/lang/reflect/Method;

    .line 93
    .line 94
    invoke-virtual {v5, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Lax/X2/w;->B:Ljava/lang/reflect/Method;
    :try_end_63
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_63} :catch_66
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_63} :catch_64

    .line 99
    .line 100
    goto :goto_98

    .line 101
    :catch_64
    move-exception v0

    .line 102
    goto :goto_68

    .line 103
    :catch_66
    move-exception v0

    .line 104
    goto :goto_80

    .line 105
    :goto_68
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_98

    .line 129
    :goto_80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v5, "failed to getDeclaredMethod : "

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_98
    sput-boolean v1, Lax/X2/w;->A:Z

    .line 154
    .line 155
    :cond_9a
    sget-object v0, Lax/X2/w;->u:Ljava/lang/reflect/Field;

    .line 156
    .line 157
    if-eqz v0, :cond_12e

    .line 158
    .line 159
    sget-object v0, Lax/X2/w;->t:Ljava/lang/reflect/Field;

    .line 160
    .line 161
    if-eqz v0, :cond_12e

    .line 162
    .line 163
    sget-object v0, Lax/X2/w;->v:Ljava/lang/reflect/Method;

    .line 164
    .line 165
    if-eqz v0, :cond_12e

    .line 166
    .line 167
    sget-object v0, Lax/X2/w;->w:Ljava/lang/reflect/Method;

    .line 168
    .line 169
    if-nez v0, :cond_ac

    .line 170
    .line 171
    goto/16 :goto_12e

    .line 172
    .line 173
    :cond_ac
    new-instance v0, Lax/X2/O;

    .line 174
    .line 175
    invoke-direct {v0}, Lax/X2/O;-><init>()V

    .line 176
    .line 177
    .line 178
    :try_start_b1
    sget-object v1, Lax/X2/w;->s:Ljava/lang/reflect/Field;

    .line 179
    .line 180
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    iput v1, v0, Lax/X2/O;->a:I

    .line 185
    .line 186
    sget-object v1, Lax/X2/w;->w:Ljava/lang/reflect/Method;

    .line 187
    .line 188
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Ljava/lang/String;

    .line 193
    .line 194
    iput-object v1, v0, Lax/X2/O;->c:Ljava/lang/String;

    .line 195
    .line 196
    sget-object v1, Lax/X2/w;->v:Ljava/lang/reflect/Method;

    .line 197
    .line 198
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Ljava/io/File;

    .line 203
    .line 204
    iput-object v1, v0, Lax/X2/O;->e:Ljava/io/File;

    .line 205
    .line 206
    sget-object v1, Lax/X2/w;->x:Ljava/lang/reflect/Method;

    .line 207
    .line 208
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/String;

    .line 213
    .line 214
    iput-object v1, v0, Lax/X2/O;->d:Ljava/lang/String;

    .line 215
    .line 216
    sget-object v1, Lax/X2/w;->y:Ljava/lang/reflect/Method;

    .line 217
    .line 218
    if-eqz v1, :cond_e6

    .line 219
    .line 220
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/String;

    .line 225
    .line 226
    iput-object v1, v0, Lax/X2/O;->f:Ljava/lang/String;

    .line 227
    .line 228
    goto :goto_e6

    .line 229
    :catch_e4
    move-exception p0

    .line 230
    goto :goto_117

    .line 231
    :cond_e6
    :goto_e6
    sget-object v1, Lax/X2/w;->z:Ljava/lang/reflect/Method;

    .line 232
    .line 233
    if-eqz v1, :cond_f6

    .line 234
    .line 235
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iput v1, v0, Lax/X2/O;->g:I

    .line 246
    .line 247
    :cond_f6
    sget-object v1, Lax/X2/w;->t:Ljava/lang/reflect/Field;

    .line 248
    .line 249
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    if-nez p0, :cond_102

    .line 254
    .line 255
    const/4 p0, 0x0

    .line 256
    iput p0, v0, Lax/X2/O;->b:I

    .line 257
    .line 258
    goto :goto_116

    .line 259
    :cond_102
    sget-object v1, Lax/X2/w;->u:Ljava/lang/reflect/Field;

    .line 260
    .line 261
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    iput v1, v0, Lax/X2/O;->b:I

    .line 266
    .line 267
    sget-object v1, Lax/X2/w;->B:Ljava/lang/reflect/Method;

    .line 268
    .line 269
    if-eqz v1, :cond_116

    .line 270
    .line 271
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    check-cast p0, Ljava/lang/String;

    .line 276
    .line 277
    iput-object p0, v0, Lax/X2/O;->h:Ljava/lang/String;
    :try_end_116
    .catch Ljava/lang/Exception; {:try_start_b1 .. :try_end_116} :catch_e4

    .line 278
    .line 279
    :cond_116
    :goto_116
    return-object v0

    .line 280
    :goto_117
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 281
    .line 282
    .line 283
    new-instance p0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 292
    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :cond_12e
    :goto_12e
    return-object v3
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

.method public static c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/String;
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-boolean v2, Lax/X2/w;->j:Z

    .line 4
    .line 5
    if-nez v2, :cond_25

    .line 6
    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "getDescription"

    .line 14
    .line 15
    new-array v4, v1, [Ljava/lang/Class;

    .line 16
    .line 17
    const-class v5, Landroid/content/Context;

    .line 18
    .line 19
    aput-object v5, v4, v0

    .line 20
    .line 21
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sput-object v2, Lax/X2/w;->i:Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_1d} :catch_1e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_1d} :catch_1e

    .line 28
    .line 29
    .line 30
    goto :goto_23

    .line 31
    :catch_1e
    const-string v2, "Failed to retrieve getDescription method"

    .line 32
    .line 33
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_23
    sput-boolean v1, Lax/X2/w;->j:Z

    .line 37
    .line 38
    :cond_25
    sget-object v2, Lax/X2/w;->i:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_43

    .line 42
    .line 43
    :try_start_2a
    new-array v1, v1, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object p1, v1, v0

    .line 46
    .line 47
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/String;
    :try_end_34
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2a .. :try_end_34} :catch_39
    .catch Ljava/lang/IllegalAccessException; {:try_start_2a .. :try_end_34} :catch_37
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2a .. :try_end_34} :catch_35

    .line 52
    .line 53
    return-object p0

    .line 54
    :catch_35
    move-exception p0

    .line 55
    goto :goto_3a

    .line 56
    :catch_37
    move-exception p0

    .line 57
    goto :goto_3a

    .line 58
    :catch_39
    move-exception p0

    .line 59
    :goto_3a
    const-string p1, "CompatV23"

    .line 60
    .line 61
    const-string v0, "Failed to invoke getDescription via reflection"

    .line 62
    .line 63
    invoke-static {p1, v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    sput-object v3, Lax/X2/w;->i:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    :cond_43
    return-object v3
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
.end method

.method public static d(Landroid/os/storage/StorageManager;Lax/X2/N;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/X2/w;->i(Landroid/os/storage/StorageManager;Lax/X2/N;)Lax/X2/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/X2/O;->d()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_b
    const/4 p0, 0x0

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

.method public static e(Landroid/os/storage/StorageManager;Lax/X2/N;)I
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/X2/w;->i(Landroid/os/storage/StorageManager;Lax/X2/N;)Lax/X2/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/X2/O;->e()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0
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

.method public static f(Ljava/lang/Object;)Ljava/lang/String;
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "getPath"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->g:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve getPath method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->h:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->g:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_38

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;
    :try_end_29
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_29} :catch_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_29} :catch_2c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_29} :catch_2a

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_2a
    move-exception p0

    .line 44
    goto :goto_2f

    .line 45
    :catch_2c
    move-exception p0

    .line 46
    goto :goto_2f

    .line 47
    :catch_2e
    move-exception p0

    .line 48
    :goto_2f
    const-string v0, "CompatV23"

    .line 49
    .line 50
    const-string v2, "Failed to invoke getPath via reflection"

    .line 51
    .line 52
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    sput-object v1, Lax/X2/w;->g:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    :cond_38
    return-object v1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static g(Ljava/lang/Object;)Ljava/lang/String;
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "getState"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->c:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve getState method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->d:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->c:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_38

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;
    :try_end_29
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_29} :catch_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_29} :catch_2c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_29} :catch_2a

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_2a
    move-exception p0

    .line 44
    goto :goto_2f

    .line 45
    :catch_2c
    move-exception p0

    .line 46
    goto :goto_2f

    .line 47
    :catch_2e
    move-exception p0

    .line 48
    :goto_2f
    const-string v0, "CompatV23"

    .line 49
    .line 50
    const-string v2, "Failed to invoke getState via reflection"

    .line 51
    .line 52
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    sput-object v1, Lax/X2/w;->c:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    :cond_38
    return-object v1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static h(Landroid/os/storage/StorageManager;Ljava/io/File;)Ljava/lang/Object;
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-boolean v2, Lax/X2/w;->b:Z

    .line 4
    .line 5
    if-nez v2, :cond_21

    .line 6
    .line 7
    :try_start_6
    const-class v2, Landroid/os/storage/StorageManager;

    .line 8
    .line 9
    const-string v3, "getStorageVolume"

    .line 10
    .line 11
    new-array v4, v1, [Ljava/lang/Class;

    .line 12
    .line 13
    const-class v5, Ljava/io/File;

    .line 14
    .line 15
    aput-object v5, v4, v0

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sput-object v2, Lax/X2/w;->a:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_19
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    goto :goto_1f

    .line 27
    :catch_1a
    const-string v2, "Failed to retrieve getStorageVolume method"

    .line 28
    .line 29
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_1f
    sput-boolean v1, Lax/X2/w;->b:Z

    .line 33
    .line 34
    :cond_21
    sget-object v2, Lax/X2/w;->a:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v2, :cond_3d

    .line 38
    .line 39
    :try_start_26
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p1, v1, v0

    .line 42
    .line 43
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_2e
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_26 .. :try_end_2e} :catch_33
    .catch Ljava/lang/IllegalAccessException; {:try_start_26 .. :try_end_2e} :catch_31
    .catch Ljava/lang/IllegalArgumentException; {:try_start_26 .. :try_end_2e} :catch_2f

    .line 47
    return-object p0

    .line 48
    :catch_2f
    move-exception p0

    .line 49
    goto :goto_34

    .line 50
    :catch_31
    move-exception p0

    .line 51
    goto :goto_34

    .line 52
    :catch_33
    move-exception p0

    .line 53
    :goto_34
    const-string p1, "CompatV23"

    .line 54
    .line 55
    const-string v0, "Failed to invoke getStorageVolume via reflection"

    .line 56
    .line 57
    invoke-static {p1, v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    sput-object v3, Lax/X2/w;->a:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    :cond_3d
    return-object v3
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
.end method

.method public static i(Landroid/os/storage/StorageManager;Lax/X2/N;)Lax/X2/O;
    .registers 3

    .line 1
    const/16 v0, 0x25

    .line 2
    .line 3
    invoke-static {v0}, Lax/X2/Q;->l(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lax/X2/w;->l(Landroid/os/storage/StorageManager;Lax/X2/N;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_d

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_d
    invoke-static {p0}, Lax/X2/w;->b(Ljava/lang/Object;)Lax/X2/O;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method public static j(Ljava/lang/Object;)Ljava/lang/String;
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "getUuid"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->k:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve getUuid method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->l:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->k:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_38

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;
    :try_end_29
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_29} :catch_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_29} :catch_2c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_29} :catch_2a

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_2a
    move-exception p0

    .line 44
    goto :goto_2f

    .line 45
    :catch_2c
    move-exception p0

    .line 46
    goto :goto_2f

    .line 47
    :catch_2e
    move-exception p0

    .line 48
    :goto_2f
    const-string v0, "CompatV23"

    .line 49
    .line 50
    const-string v2, "Failed to invoke getUuid via reflection"

    .line 51
    .line 52
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    sput-object v1, Lax/X2/w;->k:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    :cond_38
    return-object v1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static k(Ljava/lang/Object;)Ljava/lang/String;
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "getId"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->e:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve getVolumeId method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->f:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->e:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_38

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;
    :try_end_29
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_29} :catch_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_29} :catch_2c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_29} :catch_2a

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_2a
    move-exception p0

    .line 44
    goto :goto_2f

    .line 45
    :catch_2c
    move-exception p0

    .line 46
    goto :goto_2f

    .line 47
    :catch_2e
    move-exception p0

    .line 48
    :goto_2f
    const-string v0, "CompatV23"

    .line 49
    .line 50
    const-string v2, "Failed to invoke getVolumeId via reflection"

    .line 51
    .line 52
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    sput-object v1, Lax/X2/w;->e:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    :cond_38
    return-object v1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static l(Landroid/os/storage/StorageManager;Lax/X2/N;)Ljava/lang/Object;
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_3
    invoke-virtual {p1}, Lax/X2/N;->l()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "findVolumeByUuid"

    .line 16
    .line 17
    new-array v5, v1, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v6, Ljava/lang/String;

    .line 20
    .line 21
    aput-object v6, v5, v0

    .line 22
    .line 23
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p1, v1, v0

    .line 30
    .line 31
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_22} :catch_23

    .line 35
    return-object p0

    .line 36
    :catch_23
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string p1, "API is not available on api level "

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2
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
.end method

.method static m(Landroid/os/storage/StorageManager;)[Ljava/lang/Object;
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    invoke-static {v0}, Lax/u3/b;->d(Z)V

    .line 12
    .line 13
    .line 14
    sget-boolean v0, Lax/X2/w;->p:Z

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_27

    .line 18
    .line 19
    :try_start_12
    const-class v0, Landroid/os/storage/StorageManager;

    .line 20
    .line 21
    const-string v3, "getVolumeList"

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lax/X2/w;->o:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_12 .. :try_end_1f} :catch_20

    .line 30
    .line 31
    .line 32
    goto :goto_25

    .line 33
    :catch_20
    const-string v0, "Failed to retrieve getVolumeList method"

    .line 34
    .line 35
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_25
    sput-boolean v2, Lax/X2/w;->p:Z

    .line 39
    .line 40
    :cond_27
    sget-object v0, Lax/X2/w;->o:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    if-eqz v0, :cond_40

    .line 43
    .line 44
    :try_start_2b
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, [Ljava/lang/Object;
    :try_end_31
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2b .. :try_end_31} :catch_36
    .catch Ljava/lang/IllegalAccessException; {:try_start_2b .. :try_end_31} :catch_34
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2b .. :try_end_31} :catch_32

    .line 49
    .line 50
    return-object p0

    .line 51
    :catch_32
    move-exception p0

    .line 52
    goto :goto_37

    .line 53
    :catch_34
    move-exception p0

    .line 54
    goto :goto_37

    .line 55
    :catch_36
    move-exception p0

    .line 56
    :goto_37
    const-string v0, "CompatV23"

    .line 57
    .line 58
    const-string v2, "Failed to invoke getVolumeList via reflection"

    .line 59
    .line 60
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 61
    .line 62
    .line 63
    sput-object v1, Lax/X2/w;->o:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    :cond_40
    return-object v1
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
.end method

.method public static n(Landroid/os/storage/StorageManager;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/storage/StorageManager;",
            ")",
            "Ljava/util/List<",
            "Lax/X2/O;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "getVolumes"

    .line 7
    .line 8
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    if-eqz p0, :cond_36

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_1c
    :goto_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_36

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lax/X2/w;->b(Ljava/lang/Object;)Lax/X2/O;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_1c

    .line 44
    .line 45
    iget v3, v2, Lax/X2/O;->b:I

    .line 46
    .line 47
    if-eqz v3, :cond_1c

    .line 48
    .line 49
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_33} :catch_34

    .line 50
    .line 51
    .line 52
    goto :goto_1c

    .line 53
    :catch_34
    move-exception p0

    .line 54
    goto :goto_37

    .line 55
    :cond_36
    return-object v1

    .line 56
    :goto_37
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v1, "API is not available on api level "

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v0
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
.end method

.method public static o(Ljava/lang/Object;)Z
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "isPrimary"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->m:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve isPrimary method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->n:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->m:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_3c

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0
    :try_end_2d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_2d} :catch_32
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_2d} :catch_30
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_2d} :catch_2e

    .line 46
    return p0

    .line 47
    :catch_2e
    move-exception p0

    .line 48
    goto :goto_33

    .line 49
    :catch_30
    move-exception p0

    .line 50
    goto :goto_33

    .line 51
    :catch_32
    move-exception p0

    .line 52
    :goto_33
    const-string v0, "CompatV23"

    .line 53
    .line 54
    const-string v2, "Failed to invoke isPrimary via reflection"

    .line 55
    .line 56
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    sput-object v1, Lax/X2/w;->m:Ljava/lang/reflect/Method;

    .line 60
    .line 61
    :cond_3c
    const/4 p0, 0x0

    .line 62
    return p0
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
.end method

.method public static p(Ljava/lang/Object;)Z
    .registers 5

    .line 1
    sget-boolean v0, Lax/X2/w;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_6
    const-string v2, "android.os.storage.StorageVolume"

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "isRemovable"

    .line 14
    .line 15
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sput-object v2, Lax/X2/w;->q:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_17} :catch_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_17} :catch_18

    .line 22
    .line 23
    .line 24
    goto :goto_1d

    .line 25
    :catch_18
    const-string v2, "Failed to retrieve isRemovable method"

    .line 26
    .line 27
    invoke-static {v2}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1d
    sput-boolean v0, Lax/X2/w;->r:Z

    .line 31
    .line 32
    :cond_1f
    sget-object v0, Lax/X2/w;->q:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v0, :cond_35

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0
    :try_end_2d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_23 .. :try_end_2d} :catch_2e
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_2d} :catch_2e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_2d} :catch_2e

    .line 46
    return p0

    .line 47
    :catch_2e
    const-string p0, "Failed to invoke isRemovable via reflection"

    .line 48
    .line 49
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lax/X2/w;->q:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    :cond_35
    const/4 p0, 0x0

    .line 55
    return p0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public static q(Landroid/os/storage/StorageManager;Lax/X2/p;)Z
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_2
    new-instance v2, Lax/X2/w$a;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Lax/X2/w$a;-><init>(Lax/X2/p;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v2}, Lax/X2/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v3, "registerListener"

    .line 16
    .line 17
    new-array v4, v1, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v5, Landroid/os/storage/StorageEventListener;

    .line 20
    .line 21
    aput-object v5, v4, v0

    .line 22
    .line 23
    invoke-virtual {p1, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-array v3, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object v2, v3, v0

    .line 30
    .line 31
    invoke-virtual {p1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_21
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_21} :catch_24
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_21} :catch_22

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :catch_22
    move-exception p0

    .line 36
    goto :goto_25

    .line 37
    :catch_24
    move-exception p0

    .line 38
    :goto_25
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    return v0
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
.end method
