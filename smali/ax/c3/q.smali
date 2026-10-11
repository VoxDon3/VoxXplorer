.class public Lax/c3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c3/q$k;,
        Lax/c3/q$h;,
        Lax/c3/q$g;,
        Lax/c3/q$b;,
        Lax/c3/q$a;,
        Lax/c3/q$m;,
        Lax/c3/q$l;,
        Lax/c3/q$f;,
        Lax/c3/q$c;,
        Lax/c3/q$e;,
        Lax/c3/q$d;,
        Lax/c3/q$p;,
        Lax/c3/q$o;,
        Lax/c3/q$n;,
        Lax/c3/q$i;,
        Lax/c3/q$j;
    }
.end annotation


# static fields
.field static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/c3/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field b:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/c3/q;->c:Ljava/util/HashMap;

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

.method constructor <init>(Ljava/util/Comparator;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/c3/q;->a:Ljava/util/Comparator;

    .line 5
    .line 6
    iput-boolean p2, p0, Lax/c3/q;->b:Z

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

.method public static a(Ljava/lang/String;)Lax/c3/q;
    .registers 3

    .line 1
    const-string v0, "SearchPath"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_d

    .line 8
    .line 9
    invoke-static {p0}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_d
    invoke-static {p0}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_18

    .line 19
    .line 20
    invoke-static {v0}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_18
    new-instance v0, Lax/c3/q;

    .line 26
    .line 27
    new-instance v1, Lax/c3/q$k;

    .line 28
    .line 29
    invoke-virtual {p0}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v1, p0}, Lax/c3/q$k;-><init>(Ljava/util/Comparator;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    invoke-direct {v0, v1, p0}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 38
    .line 39
    .line 40
    return-object v0
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

.method public static c(Ljava/lang/String;)Lax/c3/q;
    .registers 2

    .line 1
    sget-object v0, Lax/c3/q;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/c3/q;

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_b
    invoke-static {p0}, Lax/c3/q;->e(Ljava/lang/String;)Lax/c3/q;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static e(Ljava/lang/String;)Lax/c3/q;
    .registers 5

    .line 1
    const-string v0, "None"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_b

    .line 9
    .line 10
    goto/16 :goto_172

    .line 11
    .line 12
    :cond_b
    const-string v0, "NameUp"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_20

    .line 20
    .line 21
    new-instance v1, Lax/c3/q;

    .line 22
    .line 23
    new-instance v0, Lax/c3/q$h;

    .line 24
    .line 25
    invoke-direct {v0}, Lax/c3/q$h;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_172

    .line 32
    .line 33
    :cond_20
    const-string v0, "NameDown"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_34

    .line 40
    .line 41
    new-instance v1, Lax/c3/q;

    .line 42
    .line 43
    new-instance v0, Lax/c3/q$g;

    .line 44
    .line 45
    invoke-direct {v0}, Lax/c3/q$g;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_172

    .line 52
    .line 53
    :cond_34
    const-string v0, "CollatorNameUp"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_48

    .line 60
    .line 61
    new-instance v1, Lax/c3/q;

    .line 62
    .line 63
    new-instance v0, Lax/c3/q$b;

    .line 64
    .line 65
    invoke-direct {v0}, Lax/c3/q$b;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_172

    .line 72
    .line 73
    :cond_48
    const-string v0, "CollatorNameDown"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5c

    .line 80
    .line 81
    new-instance v1, Lax/c3/q;

    .line 82
    .line 83
    new-instance v0, Lax/c3/q$a;

    .line 84
    .line 85
    invoke-direct {v0}, Lax/c3/q$a;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_172

    .line 92
    .line 93
    :cond_5c
    const-string v0, "SizeUp"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_70

    .line 100
    .line 101
    new-instance v1, Lax/c3/q;

    .line 102
    .line 103
    new-instance v0, Lax/c3/q$m;

    .line 104
    .line 105
    invoke-direct {v0}, Lax/c3/q$m;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_172

    .line 112
    .line 113
    :cond_70
    const-string v0, "SizeDown"

    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_84

    .line 120
    .line 121
    new-instance v1, Lax/c3/q;

    .line 122
    .line 123
    new-instance v0, Lax/c3/q$l;

    .line 124
    .line 125
    invoke-direct {v0}, Lax/c3/q$l;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_172

    .line 132
    .line 133
    :cond_84
    const-string v0, "DateUp"

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_98

    .line 140
    .line 141
    new-instance v1, Lax/c3/q;

    .line 142
    .line 143
    new-instance v0, Lax/c3/q$f;

    .line 144
    .line 145
    invoke-direct {v0}, Lax/c3/q$f;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_172

    .line 152
    .line 153
    :cond_98
    const-string v0, "DateDown"

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_ac

    .line 160
    .line 161
    new-instance v1, Lax/c3/q;

    .line 162
    .line 163
    new-instance v0, Lax/c3/q$c;

    .line 164
    .line 165
    invoke-direct {v0}, Lax/c3/q$c;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_172

    .line 172
    .line 173
    :cond_ac
    const-string v0, "DateTakenUp"

    .line 174
    .line 175
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_c0

    .line 180
    .line 181
    new-instance v1, Lax/c3/q;

    .line 182
    .line 183
    new-instance v0, Lax/c3/q$e;

    .line 184
    .line 185
    invoke-direct {v0}, Lax/c3/q$e;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_172

    .line 192
    .line 193
    :cond_c0
    const-string v0, "DateTakenDown"

    .line 194
    .line 195
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_d4

    .line 200
    .line 201
    new-instance v1, Lax/c3/q;

    .line 202
    .line 203
    new-instance v0, Lax/c3/q$d;

    .line 204
    .line 205
    invoke-direct {v0}, Lax/c3/q$d;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_172

    .line 212
    .line 213
    :cond_d4
    const-string v0, "DateDownNoSeparate"

    .line 214
    .line 215
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    const/4 v3, 0x0

    .line 220
    if-eqz v0, :cond_e9

    .line 221
    .line 222
    new-instance v1, Lax/c3/q;

    .line 223
    .line 224
    new-instance v0, Lax/c3/q$c;

    .line 225
    .line 226
    invoke-direct {v0}, Lax/c3/q$c;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_172

    .line 233
    .line 234
    :cond_e9
    const-string v0, "DateUpNoSeparate"

    .line 235
    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_fd

    .line 241
    .line 242
    new-instance v1, Lax/c3/q;

    .line 243
    .line 244
    new-instance v0, Lax/c3/q$f;

    .line 245
    .line 246
    invoke-direct {v0}, Lax/c3/q$f;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_172

    .line 253
    .line 254
    :cond_fd
    const-string v0, "TypeUp"

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_110

    .line 261
    .line 262
    new-instance v1, Lax/c3/q;

    .line 263
    .line 264
    new-instance v0, Lax/c3/q$p;

    .line 265
    .line 266
    invoke-direct {v0}, Lax/c3/q$p;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_172

    .line 273
    :cond_110
    const-string v0, "TypeDown"

    .line 274
    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_123

    .line 280
    .line 281
    new-instance v1, Lax/c3/q;

    .line 282
    .line 283
    new-instance v0, Lax/c3/q$o;

    .line 284
    .line 285
    invoke-direct {v0}, Lax/c3/q$o;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-direct {v1, v0, v2}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 289
    .line 290
    .line 291
    goto :goto_172

    .line 292
    :cond_123
    const-string v0, "RecursiveUp"

    .line 293
    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_13a

    .line 299
    .line 300
    new-instance v1, Lax/c3/q;

    .line 301
    .line 302
    new-instance v0, Lax/c3/q$n;

    .line 303
    .line 304
    invoke-direct {v0}, Lax/c3/q$n;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-static {v0}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 312
    .line 313
    .line 314
    goto :goto_172

    .line 315
    :cond_13a
    const-string v0, "RecursiveDown"

    .line 316
    .line 317
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_14d

    .line 322
    .line 323
    new-instance v1, Lax/c3/q;

    .line 324
    .line 325
    new-instance v0, Lax/c3/q$n;

    .line 326
    .line 327
    invoke-direct {v0}, Lax/c3/q$n;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 331
    .line 332
    .line 333
    goto :goto_172

    .line 334
    :cond_14d
    const-string v0, "Search"

    .line 335
    .line 336
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_160

    .line 341
    .line 342
    new-instance v1, Lax/c3/q;

    .line 343
    .line 344
    new-instance v0, Lax/c3/q$i;

    .line 345
    .line 346
    invoke-direct {v0}, Lax/c3/q$i;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 350
    .line 351
    .line 352
    goto :goto_172

    .line 353
    :cond_160
    const-string v0, "SearchPath"

    .line 354
    .line 355
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_172

    .line 360
    .line 361
    new-instance v1, Lax/c3/q;

    .line 362
    .line 363
    new-instance v0, Lax/c3/q$j;

    .line 364
    .line 365
    invoke-direct {v0}, Lax/c3/q$j;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-direct {v1, v0, v3}, Lax/c3/q;-><init>(Ljava/util/Comparator;Z)V

    .line 369
    .line 370
    .line 371
    :cond_172
    :goto_172
    sget-object v0, Lax/c3/q;->c:Ljava/util/HashMap;

    .line 372
    .line 373
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    return-object v1
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

.method public static f(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "DateTakenUp"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_13

    .line 8
    .line 9
    const-string v0, "DateTakenDown"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_11

    .line 16
    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_13
    :goto_13
    const/4 p0, 0x1

    .line 21
    return p0
    .line 22
.end method

.method public static g(Ljava/util/List;Lax/c3/q;)Ljava/util/List;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/q;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_4
    if-nez p1, :cond_c

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_c
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lax/c3/q;->d()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const-string v1, ":"

    .line 22
    .line 23
    if-eqz p1, :cond_1ad

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_26
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_40

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3c

    .line 56
    .line 57
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_26

    .line 61
    :cond_3c
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_26

    .line 65
    :cond_40
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v3, "CollatorNameDown"

    .line 71
    .line 72
    const-string v4, "CollatorNameUp"

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    if-eqz v0, :cond_d4

    .line 76
    .line 77
    :try_start_4c
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_4f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4c .. :try_end_4f} :catch_51

    .line 78
    .line 79
    .line 80
    goto/16 :goto_d4

    .line 81
    .line 82
    :catch_51
    move-exception v6

    .line 83
    instance-of v7, v0, Lax/c3/q$h;

    .line 84
    .line 85
    if-eqz v7, :cond_64

    .line 86
    .line 87
    :try_start_56
    invoke-static {v4}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v7}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-static {p1, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_61
    .catch Ljava/lang/IllegalArgumentException; {:try_start_56 .. :try_end_61} :catch_62

    .line 96
    .line 97
    .line 98
    goto :goto_73

    .line 99
    :catch_62
    nop

    .line 100
    goto :goto_73

    .line 101
    :cond_64
    instance-of v7, v0, Lax/c3/q$g;

    .line 102
    .line 103
    if-eqz v7, :cond_73

    .line 104
    .line 105
    :try_start_68
    invoke-static {v3}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-static {p1, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_73
    .catch Ljava/lang/IllegalArgumentException; {:try_start_68 .. :try_end_73} :catch_62

    .line 114
    .line 115
    .line 116
    :cond_73
    :goto_73
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-lez v7, :cond_bb

    .line 121
    .line 122
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Lcom/voxdon/xplorer/file/n;

    .line 127
    .line 128
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    const-string v9, "FUSORT1!!!:"

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v8}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v8, v6}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    new-instance v8, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v7}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v6, v7}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Lax/Ha/b;->h()V

    .line 185
    .line 186
    .line 187
    goto :goto_d4

    .line 188
    :cond_bb
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    const-string v7, "FUSORT2!!!:"

    .line 193
    .line 194
    invoke-virtual {v6, v7}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-virtual {v6, v7}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-virtual {v6}, Lax/Ha/b;->h()V

    .line 211
    .line 212
    .line 213
    :cond_d4
    :goto_d4
    if-eqz v0, :cond_1a6

    .line 214
    .line 215
    :try_start_d6
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_d9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d6 .. :try_end_d9} :catch_db

    .line 216
    .line 217
    .line 218
    goto/16 :goto_1a6

    .line 219
    .line 220
    :catch_db
    move-exception v6

    .line 221
    instance-of v7, v0, Lax/c3/q$h;

    .line 222
    .line 223
    if-eqz v7, :cond_ee

    .line 224
    .line 225
    :try_start_e0
    invoke-static {v4}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_eb
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e0 .. :try_end_eb} :catch_ec

    .line 234
    .line 235
    .line 236
    goto :goto_fd

    .line 237
    :catch_ec
    nop

    .line 238
    goto :goto_fd

    .line 239
    :cond_ee
    instance-of v4, v0, Lax/c3/q$g;

    .line 240
    .line 241
    if-eqz v4, :cond_fd

    .line 242
    .line 243
    :try_start_f2
    invoke-static {v3}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v3}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_fd
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f2 .. :try_end_fd} :catch_ec

    .line 252
    .line 253
    .line 254
    :cond_fd
    :goto_fd
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-lez v3, :cond_18d

    .line 259
    .line 260
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 265
    .line 266
    if-eqz v7, :cond_151

    .line 267
    .line 268
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    const/16 v7, 0x1e

    .line 273
    .line 274
    if-ge v4, v7, :cond_151

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    const-string v7, ""

    .line 281
    .line 282
    :goto_119
    if-ge v5, v4, :cond_13c

    .line 283
    .line 284
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    add-int/lit8 v5, v5, 0x1

    .line 289
    .line 290
    check-cast v8, Lcom/voxdon/xplorer/file/n;

    .line 291
    .line 292
    new-instance v9, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v7, ","

    .line 308
    .line 309
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    goto :goto_119

    .line 317
    :cond_13c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    const-string v5, "ALPHANUM SORT"

    .line 326
    .line 327
    invoke-virtual {v4, v5}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4, v7}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Lax/Ha/b;->h()V

    .line 336
    .line 337
    .line 338
    :cond_151
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    const-string v5, "FUSORT3!!!:"

    .line 343
    .line 344
    invoke-virtual {v4, v5}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v4, v6}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    new-instance v5, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v3}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v4, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 395
    .line 396
    .line 397
    goto :goto_1a6

    .line 398
    :cond_18d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const-string v3, "FUSORT4!!!:"

    .line 403
    .line 404
    invoke-virtual {v1, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 421
    .line 422
    .line 423
    :cond_1a6
    :goto_1a6
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 424
    .line 425
    .line 426
    invoke-interface {p0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 427
    .line 428
    .line 429
    return-object p0

    .line 430
    :cond_1ad
    new-instance p1, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 433
    .line 434
    .line 435
    if-eqz v0, :cond_1ec

    .line 436
    .line 437
    :try_start_1b4
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_1b7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1b4 .. :try_end_1b7} :catch_1b8

    .line 438
    .line 439
    .line 440
    return-object p1

    .line 441
    :catch_1b8
    move-exception p0

    .line 442
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const-string v3, "FUSORT5!!!:"

    .line 451
    .line 452
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    new-instance v3, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    invoke-virtual {v2, p0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 491
    .line 492
    .line 493
    :cond_1ec
    return-object p1
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

.method public static h(Ljava/util/List;Lax/c3/q;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lax/c3/q;",
            ")V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_57

    .line 2
    .line 3
    if-eqz p1, :cond_57

    .line 4
    .line 5
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_57

    .line 12
    :cond_b
    :try_start_b
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_12
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_12} :catch_13

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_13
    nop

    .line 21
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v0, v0, Lax/c3/q$k;

    .line 26
    .line 27
    if-eqz v0, :cond_57

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lax/c3/q$k;

    .line 34
    .line 35
    invoke-virtual {p1}, Lax/c3/q$k;->b()Ljava/util/Comparator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v0, v0, Lax/c3/q$h;

    .line 40
    .line 41
    if-eqz v0, :cond_3d

    .line 42
    .line 43
    :try_start_2a
    const-string p1, "CollatorNameUp"

    .line 44
    .line 45
    invoke-static {p1}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Lax/c3/q$k;

    .line 50
    .line 51
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Lax/c3/q$k;-><init>(Ljava/util/Comparator;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_3c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2a .. :try_end_3c} :catch_57

    .line 59
    .line 60
    .line 61
    goto :goto_57

    .line 62
    :cond_3d
    invoke-virtual {p1}, Lax/c3/q$k;->b()Ljava/util/Comparator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    instance-of p1, p1, Lax/c3/q$g;

    .line 67
    .line 68
    if-eqz p1, :cond_57

    .line 69
    .line 70
    :try_start_45
    const-string p1, "CollatorNameDown"

    .line 71
    .line 72
    invoke-static {p1}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v0, Lax/c3/q$k;

    .line 77
    .line 78
    invoke-virtual {p1}, Lax/c3/q;->b()Ljava/util/Comparator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-direct {v0, p1}, Lax/c3/q$k;-><init>(Ljava/util/Comparator;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_57
    .catch Ljava/lang/IllegalArgumentException; {:try_start_45 .. :try_end_57} :catch_57

    .line 86
    .line 87
    .line 88
    :catch_57
    :cond_57
    :goto_57
    return-void
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


# virtual methods
.method public b()Ljava/util/Comparator;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c3/q;->a:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
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

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/q;->b:Z

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
