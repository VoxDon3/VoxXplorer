.class Lcom/voxdon/xplorer/file/W$b;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lcom/voxdon/xplorer/file/c$a;

.field i:Ljava/lang/String;

.field j:I

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Z

.field n:Ljava/lang/String;

.field o:Z

.field p:Lcom/voxdon/xplorer/file/W;

.field q:Landroid/content/Context;

.field r:Lax/Ja/a;

.field s:Lax/Z2/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/Z2/o;Lcom/voxdon/xplorer/file/c$a;)V
    .registers 5

    .line 7
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 8
    iput-object p3, p0, Lcom/voxdon/xplorer/file/W$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 9
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/W$b;->y(Lax/Z2/o;)V

    .line 10
    iput-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->q:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/W;ILcom/voxdon/xplorer/file/c$a;)V
    .registers 6

    .line 1
    sget-object v0, Lax/u3/q$e;->c0:Lax/u3/q$e;

    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 2
    iput-object p2, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 3
    iput-object p4, p0, Lcom/voxdon/xplorer/file/W$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 4
    invoke-static {p1}, Lcom/voxdon/xplorer/file/W;->z0(Landroid/content/Context;)Lcom/voxdon/xplorer/file/W$c;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/voxdon/xplorer/file/W$c;->k(I)Lax/Z2/o;

    move-result-object p2

    .line 5
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/W$b;->y(Lax/Z2/o;)V

    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->q:Landroid/content/Context;

    return-void
.end method

.method private y(Lax/Z2/o;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->s:Lax/Z2/o;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/Z2/o;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->i:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1}, Lax/Z2/o;->h()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/voxdon/xplorer/file/W$b;->j:I

    .line 14
    .line 15
    invoke-virtual {p1}, Lax/Z2/o;->k()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->k:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/Z2/o;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->l:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1}, Lax/Z2/o;->f()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->n:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1}, Lax/Z2/o;->o()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/W$b;->m:Z

    .line 38
    .line 39
    invoke-virtual {p1}, Lax/Z2/o;->l()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/W$b;->o:Z

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/W$b;->w([Ljava/lang/Object;)Ljava/lang/Boolean;

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/W$b;->x(Ljava/lang/Boolean;)V

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
.end method

.method protected r()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/voxdon/xplorer/file/c$a;->B()V

    .line 6
    .line 7
    .line 8
    :cond_7
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

.method protected varargs w([Ljava/lang/Object;)Ljava/lang/Boolean;
    .registers 8

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/m;->i()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->q:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/voxdon/xplorer/file/W;->J0(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    :try_start_c
    sget v0, Lcom/socialnmobile/dav/gson/ServerType;->TYPE_COMMON:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/file/W$b;->k:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/voxdon/xplorer/file/W$b;->l:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v3, p0, Lcom/voxdon/xplorer/file/W$b;->o:Z

    .line 20
    .line 21
    const-wide/16 v4, 0x2ee0

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, Lax/Ia/b;->b(ILjava/lang/String;Ljava/lang/String;ZJ)Lax/Ka/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->s:Lax/Z2/o;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/voxdon/xplorer/file/W;->k0(Lax/Z2/o;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/voxdon/xplorer/file/W$b;->n:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1
    :try_end_26
    .catchall {:try_start_c .. :try_end_26} :catchall_46

    .line 39
    const-string v2, "/"

    .line 40
    .line 41
    if-nez v1, :cond_4a

    .line 42
    .line 43
    :try_start_2a
    iget-object v1, p0, Lcom/voxdon/xplorer/file/W$b;->n:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_4b

    .line 54
    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_4b

    .line 71
    :catchall_46
    move-exception v0

    .line 72
    move-object p1, v0

    .line 73
    goto/16 :goto_ca

    .line 74
    .line 75
    :cond_4a
    const/4 v1, 0x0

    .line 76
    :cond_4b
    :goto_4b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2
    :try_end_5a
    .catchall {:try_start_2a .. :try_end_5a} :catchall_46

    .line 91
    :try_start_5a
    invoke-static {v2}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-nez v3, :cond_70

    .line 96
    .line 97
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_62
    .catch Lax/Ja/a; {:try_start_5a .. :try_end_62} :catch_6d
    .catch Ljava/lang/RuntimeException; {:try_start_5a .. :try_end_62} :catch_6a
    .catchall {:try_start_5a .. :try_end_62} :catchall_46

    .line 98
    .line 99
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 100
    .line 101
    if-eqz v0, :cond_69

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 104
    .line 105
    .line 106
    :cond_69
    return-object p1

    .line 107
    :catch_6a
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    goto :goto_aa

    .line 110
    :catch_6d
    move-exception v0

    .line 111
    move-object p1, v0

    .line 112
    goto :goto_bb

    .line 113
    :cond_70
    :try_start_70
    invoke-interface {p1, v2}, Lax/Ia/a;->t(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-interface {p1, v2}, Lax/Ia/a;->o(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/voxdon/xplorer/file/W;->l0()Ljava/util/logging/Logger;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    new-instance v4, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v5, "detected server type : "

    .line 130
    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v3, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 145
    .line 146
    if-eqz v3, :cond_a0

    .line 147
    .line 148
    invoke-virtual {v3, v0, v1}, Lcom/voxdon/xplorer/file/W;->R0(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/W;->P0(Lax/Ia/a;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 157
    .line 158
    invoke-virtual {p1, v2}, Lcom/voxdon/xplorer/file/W;->Q0(I)V

    .line 159
    .line 160
    .line 161
    :cond_a0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_a2
    .catch Lax/Ja/a; {:try_start_70 .. :try_end_a2} :catch_6d
    .catch Ljava/lang/RuntimeException; {:try_start_70 .. :try_end_a2} :catch_6a
    .catchall {:try_start_70 .. :try_end_a2} :catchall_46

    .line 162
    .line 163
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 164
    .line 165
    if-eqz v0, :cond_a9

    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 168
    .line 169
    .line 170
    :cond_a9
    return-object p1

    .line 171
    :goto_aa
    :try_start_aa
    new-instance v0, Lax/Ja/a;

    .line 172
    .line 173
    invoke-direct {v0, p1}, Lax/Ja/a;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->r:Lax/Ja/a;

    .line 177
    .line 178
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_b3
    .catchall {:try_start_aa .. :try_end_b3} :catchall_46

    .line 179
    .line 180
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 181
    .line 182
    if-eqz v0, :cond_ba

    .line 183
    .line 184
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 185
    .line 186
    .line 187
    :cond_ba
    return-object p1

    .line 188
    :goto_bb
    :try_start_bb
    iput-object p1, p0, Lcom/voxdon/xplorer/file/W$b;->r:Lax/Ja/a;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 191
    .line 192
    .line 193
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_c2
    .catchall {:try_start_bb .. :try_end_c2} :catchall_46

    .line 194
    .line 195
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 196
    .line 197
    if-eqz v0, :cond_c9

    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 200
    .line 201
    .line 202
    :cond_c9
    return-object p1

    .line 203
    :goto_ca
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->p:Lcom/voxdon/xplorer/file/W;

    .line 204
    .line 205
    if-eqz v0, :cond_d1

    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->j()V

    .line 208
    .line 209
    .line 210
    :cond_d1
    throw p1
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

.method protected x(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/W$b;->h:Lcom/voxdon/xplorer/file/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lcom/voxdon/xplorer/file/W$b;->r:Lax/Ja/a;

    .line 10
    .line 11
    invoke-interface {v0, p1, v1}, Lcom/voxdon/xplorer/file/c$a;->T(ZLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
