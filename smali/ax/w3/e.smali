.class public Lax/w3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final t:Ljava/util/regex/Pattern;

.field private static u:Ljava/text/SimpleDateFormat;

.field private static v:Ljava/text/SimpleDateFormat;

.field private static w:Ljava/text/SimpleDateFormat;


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/TextView;

.field i:Landroid/widget/TextView;

.field j:Landroid/widget/TextView;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/ImageView;

.field n:Landroid/widget/ImageView;

.field o:Landroid/widget/ImageView;

.field p:Landroid/widget/TextView;

.field q:D

.field r:D

.field s:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-string v0, ".*[1-9].*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/w3/e;->t:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 12
    .line 13
    const-string v2, "yyyy:MM:dd HH:mm:ss"

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lax/w3/e;->u:Ljava/text/SimpleDateFormat;

    .line 19
    .line 20
    invoke-static {}, Lax/X2/Q;->G1()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_24

    .line 25
    .line 26
    :try_start_19
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 27
    .line 28
    const-string v2, "yyyyMMdd\'T\'HHmmss.SSSX"

    .line 29
    .line 30
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lax/w3/e;->v:Ljava/text/SimpleDateFormat;
    :try_end_22
    .catch Ljava/lang/IllegalArgumentException; {:try_start_19 .. :try_end_22} :catch_23

    .line 34
    .line 35
    goto :goto_24

    .line 36
    :catch_23
    nop

    .line 37
    :cond_24
    :goto_24
    sget-object v0, Lax/w3/e;->v:Ljava/text/SimpleDateFormat;

    .line 38
    .line 39
    if-nez v0, :cond_3c

    .line 40
    .line 41
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 42
    .line 43
    const-string v1, "yyyyMMdd\'T\'HHmmss.SSS\'Z\'"

    .line 44
    .line 45
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lax/w3/e;->v:Ljava/text/SimpleDateFormat;

    .line 51
    .line 52
    const-string v1, "UTC"

    .line 53
    .line 54
    invoke-static {v1}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 62
    .line 63
    const-string v1, "yyyy MM dd"

    .line 64
    .line 65
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 66
    .line 67
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lax/w3/e;->w:Ljava/text/SimpleDateFormat;

    .line 71
    .line 72
    return-void
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
.end method

.method public constructor <init>(Landroid/view/View;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lax/w3/e;->q:D

    .line 7
    .line 8
    iput-wide v0, p0, Lax/w3/e;->r:D

    .line 9
    .line 10
    new-instance v2, Lax/w3/e$a;

    .line 11
    .line 12
    invoke-direct {v2, p0}, Lax/w3/e$a;-><init>(Lax/w3/e;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lax/w3/e;->s:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    iput-object p1, p0, Lax/w3/e;->a:Landroid/view/View;

    .line 18
    .line 19
    const v2, 0x7f0a0143

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object v2, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 29
    .line 30
    const v2, 0x7f0a0144

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/widget/TextView;

    .line 38
    .line 39
    iput-object v2, p0, Lax/w3/e;->h:Landroid/widget/TextView;

    .line 40
    .line 41
    const v2, 0x7f0a0145

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/widget/TextView;

    .line 49
    .line 50
    iput-object v2, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 51
    .line 52
    const v2, 0x7f0a0146

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Landroid/widget/TextView;

    .line 60
    .line 61
    iput-object v2, p0, Lax/w3/e;->j:Landroid/widget/TextView;

    .line 62
    .line 63
    const v2, 0x7f0a025c

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/widget/TextView;

    .line 71
    .line 72
    iput-object v2, p0, Lax/w3/e;->e:Landroid/widget/TextView;

    .line 73
    .line 74
    const v2, 0x7f0a0172

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Landroid/widget/TextView;

    .line 82
    .line 83
    iput-object v2, p0, Lax/w3/e;->f:Landroid/widget/TextView;

    .line 84
    .line 85
    const v2, 0x7f0a0194

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Landroid/widget/TextView;

    .line 93
    .line 94
    iput-object v2, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 95
    .line 96
    const v2, 0x7f0a0195

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Landroid/widget/TextView;

    .line 104
    .line 105
    iput-object v2, p0, Lax/w3/e;->l:Landroid/widget/TextView;

    .line 106
    .line 107
    const v2, 0x7f0a01e2

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Landroid/widget/TextView;

    .line 115
    .line 116
    iput-object v2, p0, Lax/w3/e;->b:Landroid/widget/TextView;

    .line 117
    .line 118
    const v2, 0x7f0a01fe

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Landroid/widget/TextView;

    .line 126
    .line 127
    iput-object v2, p0, Lax/w3/e;->d:Landroid/widget/TextView;

    .line 128
    .line 129
    const v2, 0x7f0a01e3

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Landroid/widget/TextView;

    .line 137
    .line 138
    iput-object v2, p0, Lax/w3/e;->c:Landroid/widget/TextView;

    .line 139
    .line 140
    const v2, 0x7f0a0263

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Landroid/widget/ImageView;

    .line 148
    .line 149
    iput-object v2, p0, Lax/w3/e;->m:Landroid/widget/ImageView;

    .line 150
    .line 151
    const v2, 0x7f0a0147

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Landroid/widget/ImageView;

    .line 159
    .line 160
    iput-object v2, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 161
    .line 162
    const v2, 0x7f0a0229

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, Landroid/widget/ImageView;

    .line 170
    .line 171
    iput-object v2, p0, Lax/w3/e;->o:Landroid/widget/ImageView;

    .line 172
    .line 173
    const v2, 0x7f0a022a

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Landroid/widget/TextView;

    .line 181
    .line 182
    iput-object p1, p0, Lax/w3/e;->p:Landroid/widget/TextView;

    .line 183
    .line 184
    iget-object p1, p0, Lax/w3/e;->o:Landroid/widget/ImageView;

    .line 185
    .line 186
    iget-object v2, p0, Lax/w3/e;->s:Landroid/view/View$OnClickListener;

    .line 187
    .line 188
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lax/w3/e;->p:Landroid/widget/TextView;

    .line 192
    .line 193
    iget-object v2, p0, Lax/w3/e;->s:Landroid/view/View$OnClickListener;

    .line 194
    .line 195
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    .line 197
    .line 198
    iput-wide v0, p0, Lax/w3/e;->q:D

    .line 199
    .line 200
    iput-wide v0, p0, Lax/w3/e;->r:D

    .line 201
    .line 202
    return-void
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

.method static synthetic a(Lax/w3/e;Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/w3/e;->l(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method static synthetic b(Lax/w3/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/w3/e;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method private c(Landroid/content/Context;JZ)V
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-lez v2, :cond_12

    .line 6
    .line 7
    if-eqz p4, :cond_d

    .line 8
    .line 9
    invoke-static {p1, p2, p3}, Lax/c3/t;->c(Landroid/content/Context;J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_14

    .line 14
    :cond_d
    invoke-static {p1, p2, p3}, Lax/c3/t;->b(Landroid/content/Context;J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_14

    .line 19
    :cond_12
    const-string p1, "-"

    .line 20
    .line 21
    :goto_14
    iget-object p2, p0, Lax/w3/e;->l:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method private e(Lax/y0/a;)V
    .registers 4

    .line 1
    if-eqz p1, :cond_16

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/y0/a;->s()[D

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_16

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    aget-wide v0, p1, v0

    .line 11
    .line 12
    iput-wide v0, p0, Lax/w3/e;->q:D

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    aget-wide v0, p1, v0

    .line 16
    .line 17
    iput-wide v0, p0, Lax/w3/e;->r:D

    .line 18
    .line 19
    invoke-direct {p0}, Lax/w3/e;->g()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    invoke-direct {p0}, Lax/w3/e;->p()V

    .line 24
    .line 25
    .line 26
    return-void
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

.method private f(Ljava/lang/String;)V
    .registers 4

    .line 1
    if-eqz p1, :cond_36

    .line 2
    .line 3
    const-string v0, "([+\\-][0-9.]+)([+\\-][0-9.]+)"

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_36

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne v0, v1, :cond_36

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz v0, :cond_36

    .line 36
    .line 37
    if-eqz p1, :cond_36

    .line 38
    .line 39
    :try_start_26
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iput-wide v0, p0, Lax/w3/e;->q:D

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    iput-wide v0, p0, Lax/w3/e;->r:D

    .line 50
    .line 51
    invoke-direct {p0}, Lax/w3/e;->g()V
    :try_end_35
    .catch Ljava/lang/NumberFormatException; {:try_start_26 .. :try_end_35} :catch_36

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_36
    :cond_36
    invoke-direct {p0}, Lax/w3/e;->p()V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method private g()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/w3/e;->p:Landroid/widget/TextView;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    iget-wide v2, p0, Lax/w3/e;->q:D

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-wide v3, p0, Lax/w3/e;->r:D

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x2

    .line 18
    new-array v4, v4, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    aput-object v2, v4, v5

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aput-object v3, v4, v2

    .line 25
    .line 26
    const-string v2, "%.6f, %.6f"

    .line 27
    .line 28
    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method private h(Landroid/content/Context;Lcom/android/ex/photo/c;)V
    .registers 8

    .line 1
    iget-object v0, p2, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lax/w3/e;->n(Lax/y0/a;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    move-wide v3, v1

    .line 13
    :goto_c
    cmp-long v0, v3, v1

    .line 14
    .line 15
    if-gtz v0, :cond_12

    .line 16
    .line 17
    iget-wide v3, p2, Lcom/android/ex/photo/c;->i:J

    .line 18
    .line 19
    :cond_12
    const/4 p2, 0x0

    .line 20
    invoke-direct {p0, p1, v3, v4, p2}, Lax/w3/e;->c(Landroid/content/Context;JZ)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private i(Lax/y0/a;)V
    .registers 15

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 4
    .line 5
    const v3, 0x7f0801d6

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_131

    .line 12
    .line 13
    invoke-direct {p0}, Lax/w3/e;->t()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Model"

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "Make"

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_54

    .line 29
    .line 30
    if-eqz v2, :cond_54

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-lez v4, :cond_40

    .line 37
    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_40
    iget-object v4, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 66
    .line 67
    const-string v5, "%s %s"

    .line 68
    .line 69
    const/4 v6, 0x2

    .line 70
    new-array v6, v6, [Ljava/lang/Object;

    .line 71
    .line 72
    aput-object v3, v6, v1

    .line 73
    .line 74
    aput-object v2, v6, v0

    .line 75
    .line 76
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    goto :goto_5a

    .line 85
    :cond_54
    iget-object v2, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-direct {p0, v2}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_5a
    const-string v3, "FNumber"

    .line 92
    .line 93
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 94
    .line 95
    invoke-virtual {p1, v3, v4, v5}, Lax/y0/a;->k(Ljava/lang/String;D)D

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    const-string v3, ""

    .line 100
    .line 101
    const-wide/16 v8, 0x0

    .line 102
    .line 103
    cmpl-double v10, v6, v8

    .line 104
    .line 105
    if-lez v10, :cond_7b

    .line 106
    .line 107
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 108
    .line 109
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    new-array v7, v0, [Ljava/lang/Object;

    .line 114
    .line 115
    aput-object v6, v7, v1

    .line 116
    .line 117
    const-string v6, "\u0192/%.1f"

    .line 118
    .line 119
    invoke-static {v11, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_7c

    .line 124
    :cond_7b
    move-object v6, v3

    .line 125
    :goto_7c
    iget-object v7, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    const-string v6, "FocalLength"

    .line 131
    .line 132
    invoke-virtual {p1, v6, v4, v5}, Lax/y0/a;->k(Ljava/lang/String;D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    cmpl-double v11, v6, v8

    .line 137
    .line 138
    if-lez v11, :cond_9c

    .line 139
    .line 140
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 141
    .line 142
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    new-array v7, v0, [Ljava/lang/Object;

    .line 147
    .line 148
    aput-object v6, v7, v1

    .line 149
    .line 150
    const-string v6, "%.2f mm"

    .line 151
    .line 152
    invoke-static {v12, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    goto :goto_9d

    .line 157
    :cond_9c
    move-object v6, v3

    .line 158
    :goto_9d
    iget-object v7, p0, Lax/w3/e;->h:Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    if-lez v10, :cond_a8

    .line 164
    .line 165
    if-lez v11, :cond_a8

    .line 166
    .line 167
    const/4 v6, 0x1

    .line 168
    goto :goto_b3

    .line 169
    :cond_a8
    iget-object v6, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-direct {p0, v6}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    iget-object v6, p0, Lax/w3/e;->h:Landroid/widget/TextView;

    .line 175
    .line 176
    invoke-direct {p0, v6}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    :goto_b3
    const-string v7, "ExposureTime"

    .line 181
    .line 182
    invoke-virtual {p1, v7, v4, v5}, Lax/y0/a;->k(Ljava/lang/String;D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    cmpg-double v7, v4, v8

    .line 187
    .line 188
    if-gtz v7, :cond_bf

    .line 189
    .line 190
    move-object v7, v3

    .line 191
    goto :goto_eb

    .line 192
    :cond_bf
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 193
    .line 194
    cmpg-double v7, v4, v10

    .line 195
    .line 196
    if-gez v7, :cond_db

    .line 197
    .line 198
    div-double/2addr v10, v4

    .line 199
    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    .line 200
    .line 201
    .line 202
    move-result-wide v10

    .line 203
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 204
    .line 205
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    new-array v11, v0, [Ljava/lang/Object;

    .line 210
    .line 211
    aput-object v10, v11, v1

    .line 212
    .line 213
    const-string v10, "1/%d s"

    .line 214
    .line 215
    invoke-static {v7, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    goto :goto_eb

    .line 220
    :cond_db
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 221
    .line 222
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    new-array v11, v0, [Ljava/lang/Object;

    .line 227
    .line 228
    aput-object v10, v11, v1

    .line 229
    .line 230
    const-string v10, "%.1f s"

    .line 231
    .line 232
    invoke-static {v7, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    :goto_eb
    iget-object v10, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 237
    .line 238
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    .line 240
    .line 241
    const-string v7, "PhotographicSensitivity"

    .line 242
    .line 243
    const/4 v10, -0x1

    .line 244
    invoke-virtual {p1, v7, v10}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    if-ne v7, v10, :cond_ff

    .line 249
    .line 250
    const-string v7, "ISOSpeedRatings"

    .line 251
    .line 252
    invoke-virtual {p1, v7, v10}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    :cond_ff
    if-lez v7, :cond_111

    .line 257
    .line 258
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 259
    .line 260
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    new-array v0, v0, [Ljava/lang/Object;

    .line 265
    .line 266
    aput-object v3, v0, v1

    .line 267
    .line 268
    const-string v1, "ISO %d"

    .line 269
    .line 270
    invoke-static {p1, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    :cond_111
    iget-object p1, p0, Lax/w3/e;->j:Landroid/widget/TextView;

    .line 275
    .line 276
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    if-lez v7, :cond_11d

    .line 280
    .line 281
    cmpl-double p1, v4, v8

    .line 282
    .line 283
    if-lez p1, :cond_11d

    .line 284
    .line 285
    return-void

    .line 286
    :cond_11d
    iget-object p1, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 287
    .line 288
    invoke-direct {p0, p1}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    iget-object p1, p0, Lax/w3/e;->j:Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-direct {p0, p1}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    if-nez v6, :cond_130

    .line 297
    .line 298
    if-nez v2, :cond_130

    .line 299
    .line 300
    iget-object p1, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 301
    .line 302
    invoke-direct {p0, p1}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 303
    .line 304
    .line 305
    :cond_130
    return-void

    .line 306
    :cond_131
    invoke-direct {p0}, Lax/w3/e;->o()V

    .line 307
    .line 308
    .line 309
    return-void
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

.method private j(Lcom/android/ex/photo/c;)V
    .registers 7

    .line 1
    iget v0, p1, Lcom/android/ex/photo/c;->j:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/ex/photo/c;->k:I

    .line 4
    .line 5
    if-lez v0, :cond_8

    .line 6
    .line 7
    if-gtz v1, :cond_21

    .line 8
    .line 9
    :cond_8
    iget-object v2, p1, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 10
    .line 11
    if-eqz v2, :cond_21

    .line 12
    .line 13
    const-string v3, "ImageWidth"

    .line 14
    .line 15
    const/4 v4, -0x1

    .line 16
    invoke-virtual {v2, v3, v4}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object p1, p1, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 21
    .line 22
    const-string v3, "ImageLength"

    .line 23
    .line 24
    invoke-virtual {p1, v3, v4}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ltz v2, :cond_21

    .line 29
    .line 30
    if-ltz p1, :cond_21

    .line 31
    .line 32
    move v1, p1

    .line 33
    move v0, v2

    .line 34
    :cond_21
    const-string p1, ""

    .line 35
    .line 36
    if-lez v0, :cond_41

    .line 37
    .line 38
    if-lez v1, :cond_41

    .line 39
    .line 40
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v3, 0x2

    .line 51
    new-array v3, v3, [Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object v0, v3, v4

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-object v1, v3, v0

    .line 58
    .line 59
    const-string v0, "%d x %d"

    .line 60
    .line 61
    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_42

    .line 66
    :cond_41
    move-object v0, p1

    .line 67
    :goto_42
    iget-object v1, p0, Lax/w3/e;->e:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lax/w3/e;->f:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    return-void
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

.method private k(Landroid/content/Context;Ljava/lang/String;J)V
    .registers 13

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p2, :cond_43

    .line 5
    .line 6
    :try_start_5
    sget-object v3, Lax/w3/e;->v:Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    invoke-virtual {v3, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3
    :try_end_f
    .catch Ljava/text/ParseException; {:try_start_5 .. :try_end_f} :catch_10

    .line 16
    goto :goto_12

    .line 17
    :catch_10
    nop

    .line 18
    move-wide v3, v0

    .line 19
    :goto_12
    cmp-long v5, v3, v0

    .line 20
    .line 21
    if-gtz v5, :cond_44

    .line 22
    .line 23
    sget-object v5, Lax/w3/e;->w:Ljava/text/SimpleDateFormat;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    if-eqz v5, :cond_35

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_35

    .line 48
    .line 49
    sget-object v5, Lax/w3/e;->w:Ljava/text/SimpleDateFormat;

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 52
    .line 53
    .line 54
    :cond_35
    :try_start_35
    sget-object v5, Lax/w3/e;->w:Ljava/text/SimpleDateFormat;

    .line 55
    .line 56
    invoke-virtual {v5, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3
    :try_end_3f
    .catch Ljava/text/ParseException; {:try_start_35 .. :try_end_3f} :catch_41

    .line 64
    const/4 v2, 0x1

    .line 65
    goto :goto_44

    .line 66
    :catch_41
    nop

    .line 67
    goto :goto_44

    .line 68
    :cond_43
    move-wide v3, v0

    .line 69
    :cond_44
    :goto_44
    cmp-long p2, v3, v0

    .line 70
    .line 71
    if-gtz p2, :cond_49

    .line 72
    .line 73
    goto :goto_4a

    .line 74
    :cond_49
    move-wide p3, v3

    .line 75
    :goto_4a
    invoke-direct {p0, p1, p3, p4, v2}, Lax/w3/e;->c(Landroid/content/Context;JZ)V

    .line 76
    .line 77
    .line 78
    return-void
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

.method private l(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    .line 1
    if-nez p1, :cond_8

    .line 2
    .line 3
    if-nez p2, :cond_8

    .line 4
    .line 5
    invoke-direct {p0}, Lax/w3/e;->o()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-direct {p0}, Lax/w3/e;->t()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 18
    .line 19
    const v1, 0x7f0801c4

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v1, "?"

    .line 30
    .line 31
    if-nez v0, :cond_26

    .line 32
    .line 33
    iget-object v0, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2b

    .line 39
    :cond_26
    iget-object p1, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_37

    .line 49
    .line 50
    iget-object p1, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    iget-object p1, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method private m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 9

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p2, :cond_16

    .line 3
    .line 4
    if-eqz p3, :cond_16

    .line 5
    .line 6
    :try_start_5
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p2
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_9} :catch_13

    .line 10
    :try_start_9
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_d} :catch_11

    .line 14
    move v4, v0

    .line 15
    move v0, p2

    .line 16
    move p2, v4

    .line 17
    goto :goto_17

    .line 18
    :catch_11
    nop

    .line 19
    goto :goto_15

    .line 20
    :catch_13
    nop

    .line 21
    const/4 p2, -0x1

    .line 22
    :goto_15
    move v0, p2

    .line 23
    :cond_16
    const/4 p2, -0x1

    .line 24
    :goto_17
    const-string p3, ""

    .line 25
    .line 26
    if-lez v0, :cond_37

    .line 27
    .line 28
    if-lez p2, :cond_37

    .line 29
    .line 30
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const/4 v2, 0x2

    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    aput-object v0, v2, v3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    aput-object p2, v2, v0

    .line 48
    .line 49
    const-string p2, "%1$s x %2$s"

    .line 50
    .line 51
    invoke-static {v1, p2, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    goto :goto_38

    .line 56
    :cond_37
    move-object p2, p3

    .line 57
    :goto_38
    iget-object v0, p0, Lax/w3/e;->e:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    if-eqz p1, :cond_44

    .line 63
    .line 64
    :try_start_3f
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1
    :try_end_43
    .catch Ljava/lang/NumberFormatException; {:try_start_3f .. :try_end_43} :catch_44

    .line 68
    goto :goto_46

    .line 69
    :catch_44
    :cond_44
    const-wide/16 p1, -0x1

    .line 70
    .line 71
    :goto_46
    const-wide/16 v0, 0x0

    .line 72
    .line 73
    cmp-long v2, p1, v0

    .line 74
    .line 75
    if-lez v2, :cond_50

    .line 76
    .line 77
    invoke-static {p1, p2}, Lax/u3/B;->n(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    :cond_50
    iget-object p1, p0, Lax/w3/e;->f:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    return-void
    .line 87
    .line 88
.end method

.method private o()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/w3/e;->h:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lax/w3/e;->j:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method private p()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w3/e;->o:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/w3/e;->p:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/w3/e;->s(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method private q()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/w3/e;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/w3/e;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/w3/e;->d:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/w3/e;->e:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/w3/e;->f:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lax/w3/e;->l:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lax/w3/e;->m:Landroid/widget/ImageView;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lax/w3/e;->o()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lax/w3/e;->p()V

    .line 43
    .line 44
    .line 45
    return-void
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

.method private r(Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    const/4 v0, -0x2

    .line 8
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 9
    .line 10
    return-void
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

.method private s(Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 9
    .line 10
    return-void
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

.method private t()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w3/e;->n:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/w3/e;->k:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/w3/e;->g:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/w3/e;->h:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/w3/e;->i:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lax/w3/e;->j:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lax/w3/e;->r(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method private u(Lcom/android/ex/photo/c;Landroid/content/Context;)V
    .registers 13

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/android/ex/photo/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-static {v0}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_5e

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v0, v1}, Lax/c3/u;->L(Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Lax/U0/m;

    .line 17
    .line 18
    const-string v3, "FileManager"

    .line 19
    .line 20
    invoke-direct {v2, p2, v3}, Lax/U0/m;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lax/i1/Z$b;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Lax/i1/Z$b;-><init>(Lax/U0/g$a;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lax/P0/y;->b(Landroid/net/Uri;)Lax/P0/y;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v3, v0}, Lax/i1/Z$b;->i(Lax/P0/y;)Lax/i1/Z;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    new-instance v9, Lax/P0/N$b;

    .line 37
    .line 38
    invoke-direct {v9}, Lax/P0/N$b;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v7, Lax/w3/e$b;

    .line 42
    .line 43
    invoke-direct {v7, p0, v9}, Lax/w3/e$b;-><init>(Lax/w3/e;Lax/P0/N$b;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lax/m1/j$b;

    .line 47
    .line 48
    invoke-direct {v0, p2}, Lax/m1/j$b;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lax/m1/j$b;->a()Lax/m1/j;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {v6, v7, p2}, Lax/i1/a;->z(Lax/i1/F$c;Lax/U0/z;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lax/i1/F$b;

    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p2, v0}, Lax/i1/F$b;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lax/m1/h;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    const/high16 v2, 0x10000

    .line 71
    .line 72
    invoke-direct {v0, v1, v2}, Lax/m1/h;-><init>(ZI)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v1, 0x0

    .line 76
    .line 77
    invoke-virtual {v6, p2, v0, v1, v2}, Lax/i1/Z;->i(Lax/i1/F$b;Lax/m1/b;J)Lax/i1/C;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    new-instance v4, Lax/w3/e$c;

    .line 82
    .line 83
    move-object v5, p0

    .line 84
    move-object v8, p1

    .line 85
    invoke-direct/range {v4 .. v9}, Lax/w3/e$c;-><init>(Lax/w3/e;Lax/i1/Z;Lax/i1/F$c;Lcom/android/ex/photo/c;Lax/P0/N$b;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p2, v4, v1, v2}, Lax/i1/C;->n(Lax/i1/C$a;J)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catch_5b
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    goto :goto_7b

    .line 95
    :cond_5e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string p2, "Invalid file info 2 : "

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V
    :try_end_7a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_7a} :catch_5b

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_7b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    return-void
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


# virtual methods
.method public d(Landroid/content/Context;Lcom/android/ex/photo/c;Lcom/voxdon/xplorer/file/n;)V
    .registers 6

    .line 1
    if-nez p2, :cond_29

    .line 2
    .line 3
    invoke-direct {p0}, Lax/w3/e;->q()V

    .line 4
    .line 5
    .line 6
    if-nez p3, :cond_9

    .line 7
    .line 8
    goto/16 :goto_8e

    .line 9
    .line 10
    :cond_9
    new-instance p2, Lcom/android/ex/photo/c;

    .line 11
    .line 12
    invoke-direct {p2}, Lcom/android/ex/photo/c;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p3, p2, Lcom/android/ex/photo/c;->g:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p2, Lcom/android/ex/photo/c;->l:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p2, Lcom/android/ex/photo/c;->m:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p3}, Lax/c3/b;->q()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p2, Lcom/android/ex/photo/c;->i:J

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p3, v0}, Lcom/voxdon/xplorer/file/n;->I(Z)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    iput-object p3, p2, Lcom/android/ex/photo/c;->n:Ljava/lang/String;

    .line 41
    .line 42
    :cond_29
    iget-object p3, p0, Lax/w3/e;->c:Landroid/widget/TextView;

    .line 43
    .line 44
    iget-object v0, p2, Lcom/android/ex/photo/c;->l:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    iget-object p3, p0, Lax/w3/e;->b:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v0, p2, Lcom/android/ex/photo/c;->m:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, Lax/w3/e;->d:Landroid/widget/TextView;

    .line 57
    .line 58
    iget-object v0, p2, Lcom/android/ex/photo/c;->n:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iget-boolean p3, p2, Lcom/android/ex/photo/c;->a:Z

    .line 64
    .line 65
    if-nez p3, :cond_5b

    .line 66
    .line 67
    iget-object p3, p0, Lax/w3/e;->m:Landroid/widget/ImageView;

    .line 68
    .line 69
    const v0, 0x7f0801d5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    .line 74
    .line 75
    iget-object p3, p2, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 76
    .line 77
    invoke-direct {p0, p3}, Lax/w3/e;->e(Lax/y0/a;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, p1, p2}, Lax/w3/e;->h(Landroid/content/Context;Lcom/android/ex/photo/c;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p2}, Lax/w3/e;->j(Lcom/android/ex/photo/c;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p2, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 87
    .line 88
    invoke-direct {p0, p1}, Lax/w3/e;->i(Lax/y0/a;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5b
    iget-object p3, p0, Lax/w3/e;->m:Landroid/widget/ImageView;

    .line 93
    .line 94
    const v0, 0x7f080215

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    .line 99
    .line 100
    iget-object p3, p2, Lcom/android/ex/photo/c;->s:Ljava/lang/String;

    .line 101
    .line 102
    invoke-direct {p0, p3}, Lax/w3/e;->f(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object p3, p2, Lcom/android/ex/photo/c;->o:Ljava/lang/String;

    .line 106
    .line 107
    iget-wide v0, p2, Lcom/android/ex/photo/c;->i:J

    .line 108
    .line 109
    invoke-direct {p0, p1, p3, v0, v1}, Lax/w3/e;->k(Landroid/content/Context;Ljava/lang/String;J)V

    .line 110
    .line 111
    .line 112
    iget-object p3, p2, Lcom/android/ex/photo/c;->p:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v0, p2, Lcom/android/ex/photo/c;->q:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v1, p2, Lcom/android/ex/photo/c;->r:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0, p3, v0, v1}, Lax/w3/e;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object p3, p2, Lcom/android/ex/photo/c;->t:Ljava/lang/String;

    .line 122
    .line 123
    if-nez p3, :cond_80

    .line 124
    .line 125
    iget-object v0, p2, Lcom/android/ex/photo/c;->u:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v0, :cond_85

    .line 128
    .line 129
    :cond_80
    iget-object v0, p2, Lcom/android/ex/photo/c;->u:Ljava/lang/String;

    .line 130
    .line 131
    invoke-direct {p0, p3, v0}, Lax/w3/e;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_85
    iget-object p3, p2, Lcom/android/ex/photo/c;->t:Ljava/lang/String;

    .line 135
    .line 136
    if-eqz p3, :cond_8f

    .line 137
    .line 138
    iget-object p3, p2, Lcom/android/ex/photo/c;->u:Ljava/lang/String;

    .line 139
    .line 140
    if-nez p3, :cond_8e

    .line 141
    .line 142
    goto :goto_8f

    .line 143
    :cond_8e
    :goto_8e
    return-void

    .line 144
    :cond_8f
    :goto_8f
    invoke-direct {p0, p2, p1}, Lax/w3/e;->u(Lcom/android/ex/photo/c;Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    return-void
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

.method public n(Lax/y0/a;)J
    .registers 7

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    const-string v0, "DateTime"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_e
    const-wide/16 v1, -0x1

    .line 16
    .line 17
    if-eqz v0, :cond_49

    .line 18
    .line 19
    sget-object p1, Lax/w3/e;->t:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1f

    .line 30
    .line 31
    goto :goto_49

    .line 32
    :cond_1f
    :try_start_1f
    sget-object p1, Lax/w3/e;->u:Ljava/text/SimpleDateFormat;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz p1, :cond_3e

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3e

    .line 57
    .line 58
    sget-object p1, Lax/w3/e;->u:Ljava/text/SimpleDateFormat;

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 61
    .line 62
    .line 63
    :cond_3e
    sget-object p1, Lax/w3/e;->u:Ljava/text/SimpleDateFormat;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0
    :try_end_48
    .catch Ljava/text/ParseException; {:try_start_1f .. :try_end_48} :catch_49

    .line 73
    return-wide v0

    .line 74
    :catch_49
    :cond_49
    :goto_49
    return-wide v1
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
