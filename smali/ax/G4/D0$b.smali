.class Lax/G4/D0$b;
.super Lax/v4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/v4/f<",
        "Lax/G4/D0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lax/G4/D0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/G4/D0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/D0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/G4/D0$b;->b:Lax/G4/D0$b;

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

.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/v4/f;-><init>()V

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
.method public bridge synthetic a(Lax/T4/j;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/G4/D0$b;->s(Lax/T4/j;)Lax/G4/D0;

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

.method public bridge synthetic k(Ljava/lang/Object;Lax/T4/g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    check-cast p1, Lax/G4/D0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/G4/D0$b;->t(Lax/G4/D0;Lax/T4/g;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public s(Lax/T4/j;)Lax/G4/D0;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/i;
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
    if-ne v0, v1, :cond_11

    .line 8
    .line 9
    invoke-static {p1}, Lax/v4/c;->i(Lax/T4/j;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lax/T4/j;->H()Lax/T4/m;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_19

    .line 18
    :cond_11
    invoke-static {p1}, Lax/v4/c;->h(Lax/T4/j;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lax/v4/a;->q(Lax/T4/j;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_19
    if-eqz v0, :cond_b7

    .line 27
    .line 28
    const-string v2, "lookup_failed"

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_32

    .line 35
    .line 36
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lax/G4/G0$b;->b:Lax/G4/G0$b;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lax/G4/G0$b;->s(Lax/T4/j;)Lax/G4/G0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lax/G4/D0;->f(Lax/G4/G0;)Lax/G4/D0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto/16 :goto_ae

    .line 50
    .line 51
    :cond_32
    const-string v2, "path"

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_49

    .line 58
    .line 59
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lax/G4/S0$b;->b:Lax/G4/S0$b;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lax/G4/S0$b;->s(Lax/T4/j;)Lax/G4/S0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lax/G4/D0;->g(Lax/G4/S0;)Lax/G4/D0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto/16 :goto_ae

    .line 73
    .line 74
    :cond_49
    const-string v2, "properties_error"

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_5f

    .line 81
    .line 82
    invoke-static {v2, p1}, Lax/v4/c;->f(Ljava/lang/String;Lax/T4/j;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lax/E4/b$b;->b:Lax/E4/b$b;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lax/E4/b$b;->s(Lax/T4/j;)Lax/E4/b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Lax/G4/D0;->h(Lax/E4/b;)Lax/G4/D0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_ae

    .line 96
    :cond_5f
    const-string v2, "too_many_shared_folder_targets"

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_6a

    .line 103
    .line 104
    sget-object v0, Lax/G4/D0;->e:Lax/G4/D0;

    .line 105
    .line 106
    goto :goto_ae

    .line 107
    :cond_6a
    const-string v2, "too_many_write_operations"

    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_75

    .line 114
    .line 115
    sget-object v0, Lax/G4/D0;->f:Lax/G4/D0;

    .line 116
    .line 117
    goto :goto_ae

    .line 118
    :cond_75
    const-string v2, "concurrent_session_data_not_allowed"

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_80

    .line 125
    .line 126
    sget-object v0, Lax/G4/D0;->g:Lax/G4/D0;

    .line 127
    .line 128
    goto :goto_ae

    .line 129
    :cond_80
    const-string v2, "concurrent_session_not_closed"

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_8b

    .line 136
    .line 137
    sget-object v0, Lax/G4/D0;->h:Lax/G4/D0;

    .line 138
    .line 139
    goto :goto_ae

    .line 140
    :cond_8b
    const-string v2, "concurrent_session_missing_data"

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_96

    .line 147
    .line 148
    sget-object v0, Lax/G4/D0;->i:Lax/G4/D0;

    .line 149
    .line 150
    goto :goto_ae

    .line 151
    :cond_96
    const-string v2, "payload_too_large"

    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_a1

    .line 158
    .line 159
    sget-object v0, Lax/G4/D0;->j:Lax/G4/D0;

    .line 160
    .line 161
    goto :goto_ae

    .line 162
    :cond_a1
    const-string v2, "content_hash_mismatch"

    .line 163
    .line 164
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_ac

    .line 169
    .line 170
    sget-object v0, Lax/G4/D0;->k:Lax/G4/D0;

    .line 171
    .line 172
    goto :goto_ae

    .line 173
    :cond_ac
    sget-object v0, Lax/G4/D0;->l:Lax/G4/D0;

    .line 174
    .line 175
    :goto_ae
    if-nez v1, :cond_b6

    .line 176
    .line 177
    invoke-static {p1}, Lax/v4/c;->n(Lax/T4/j;)V

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, Lax/v4/c;->e(Lax/T4/j;)V

    .line 181
    .line 182
    .line 183
    :cond_b6
    return-object v0

    .line 184
    :cond_b7
    new-instance v0, Lax/T4/i;

    .line 185
    .line 186
    const-string v1, "Required field missing: .tag"

    .line 187
    .line 188
    invoke-direct {v0, p1, v1}, Lax/T4/i;-><init>(Lax/T4/j;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0
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

.method public t(Lax/G4/D0;Lax/T4/g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/T4/f;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/G4/D0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/G4/D0;->i()Lax/G4/D0$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_88

    .line 14
    .line 15
    .line 16
    const-string p1, "other"

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_15
    const-string p1, "content_hash_mismatch"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1b
    const-string p1, "payload_too_large"

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_21
    const-string p1, "concurrent_session_missing_data"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_27
    const-string p1, "concurrent_session_not_closed"

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2d
    const-string p1, "concurrent_session_data_not_allowed"

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_33
    const-string p1, "too_many_write_operations"

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_39
    const-string p1, "too_many_shared_folder_targets"

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Lax/T4/g;->s0(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_3f
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 65
    .line 66
    .line 67
    const-string v0, "properties_error"

    .line 68
    .line 69
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lax/E4/b$b;->b:Lax/E4/b$b;

    .line 76
    .line 77
    invoke-static {p1}, Lax/G4/D0;->c(Lax/G4/D0;)Lax/E4/b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1, p2}, Lax/E4/b$b;->t(Lax/E4/b;Lax/T4/g;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_57
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 89
    .line 90
    .line 91
    const-string v0, "path"

    .line 92
    .line 93
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v0, Lax/G4/S0$b;->b:Lax/G4/S0$b;

    .line 100
    .line 101
    invoke-static {p1}, Lax/G4/D0;->b(Lax/G4/D0;)Lax/G4/S0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1, p2}, Lax/G4/S0$b;->t(Lax/G4/S0;Lax/T4/g;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_6f
    invoke-virtual {p2}, Lax/T4/g;->o0()V

    .line 113
    .line 114
    .line 115
    const-string v0, "lookup_failed"

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2}, Lax/v4/a;->r(Ljava/lang/String;Lax/T4/g;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v0}, Lax/T4/g;->o(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lax/G4/G0$b;->b:Lax/G4/G0$b;

    .line 124
    .line 125
    invoke-static {p1}, Lax/G4/D0;->a(Lax/G4/D0;)Lax/G4/G0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v0, p1, p2}, Lax/G4/G0$b;->t(Lax/G4/G0;Lax/T4/g;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Lax/T4/g;->m()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_88
    .packed-switch 0x1
        :pswitch_6f
        :pswitch_57
        :pswitch_3f
        :pswitch_39
        :pswitch_33
        :pswitch_2d
        :pswitch_27
        :pswitch_21
        :pswitch_1b
        :pswitch_15
    .end packed-switch
    .line 138
    .line 139
.end method
