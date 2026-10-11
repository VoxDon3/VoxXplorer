.class public final Lax/d1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/m1/p$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/d1/k$b;,
        Lax/d1/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/m1/p$a<",
        "Lax/d1/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final A:Ljava/util/regex/Pattern;

.field private static final B:Ljava/util/regex/Pattern;

.field private static final C:Ljava/util/regex/Pattern;

.field private static final D:Ljava/util/regex/Pattern;

.field private static final E:Ljava/util/regex/Pattern;

.field private static final F:Ljava/util/regex/Pattern;

.field private static final G:Ljava/util/regex/Pattern;

.field private static final H:Ljava/util/regex/Pattern;

.field private static final I:Ljava/util/regex/Pattern;

.field private static final J:Ljava/util/regex/Pattern;

.field private static final K:Ljava/util/regex/Pattern;

.field private static final L:Ljava/util/regex/Pattern;

.field private static final M:Ljava/util/regex/Pattern;

.field private static final N:Ljava/util/regex/Pattern;

.field private static final O:Ljava/util/regex/Pattern;

.field private static final P:Ljava/util/regex/Pattern;

.field private static final Q:Ljava/util/regex/Pattern;

.field private static final R:Ljava/util/regex/Pattern;

.field private static final S:Ljava/util/regex/Pattern;

.field private static final T:Ljava/util/regex/Pattern;

.field private static final U:Ljava/util/regex/Pattern;

.field private static final V:Ljava/util/regex/Pattern;

.field private static final W:Ljava/util/regex/Pattern;

.field private static final X:Ljava/util/regex/Pattern;

.field private static final Y:Ljava/util/regex/Pattern;

.field private static final Z:Ljava/util/regex/Pattern;

.field private static final a0:Ljava/util/regex/Pattern;

.field private static final b0:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final c0:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final d0:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final e0:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;

.field private static final f0:Ljava/util/regex/Pattern;

.field private static final g:Ljava/util/regex/Pattern;

.field private static final g0:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;

.field private static final h0:Ljava/util/regex/Pattern;

.field private static final i:Ljava/util/regex/Pattern;

.field private static final i0:Ljava/util/regex/Pattern;

.field private static final j:Ljava/util/regex/Pattern;

.field private static final j0:Ljava/util/regex/Pattern;

.field private static final k:Ljava/util/regex/Pattern;

.field private static final k0:Ljava/util/regex/Pattern;

.field private static final l:Ljava/util/regex/Pattern;

.field private static final l0:Ljava/util/regex/Pattern;

.field private static final m:Ljava/util/regex/Pattern;

.field private static final m0:Ljava/util/regex/Pattern;

.field private static final n:Ljava/util/regex/Pattern;

.field private static final n0:Ljava/util/regex/Pattern;

.field private static final o:Ljava/util/regex/Pattern;

.field private static final o0:Ljava/util/regex/Pattern;

.field private static final p:Ljava/util/regex/Pattern;

.field private static final p0:Ljava/util/regex/Pattern;

.field private static final q:Ljava/util/regex/Pattern;

.field private static final q0:Ljava/util/regex/Pattern;

.field private static final r:Ljava/util/regex/Pattern;

.field private static final r0:Ljava/util/regex/Pattern;

.field private static final s:Ljava/util/regex/Pattern;

.field private static final s0:Ljava/util/regex/Pattern;

.field private static final t:Ljava/util/regex/Pattern;

.field private static final t0:Ljava/util/regex/Pattern;

.field private static final u:Ljava/util/regex/Pattern;

.field private static final u0:Ljava/util/regex/Pattern;

.field private static final v:Ljava/util/regex/Pattern;

.field private static final v0:Ljava/util/regex/Pattern;

.field private static final w:Ljava/util/regex/Pattern;

.field private static final x:Ljava/util/regex/Pattern;

.field private static final y:Ljava/util/regex/Pattern;

.field private static final z:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Lax/d1/i;

.field private final b:Lax/d1/f;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/d1/k;->c:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "VIDEO=\"((?:.|\u000c)+?)\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lax/d1/k;->d:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "AUDIO=\"((?:.|\u000c)+?)\""

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lax/d1/k;->e:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "SUBTITLES=\"((?:.|\u000c)+?)\""

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lax/d1/k;->f:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "CLOSED-CAPTIONS=\"((?:.|\u000c)+?)\""

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lax/d1/k;->g:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lax/d1/k;->h:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "CHANNELS=\"((?:.|\u000c)+?)\""

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lax/d1/k;->i:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-string v0, "VIDEO-RANGE=(SDR|PQ|HLG)"

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lax/d1/k;->j:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    const-string v0, "CODECS=\"((?:.|\u000c)+?)\""

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lax/d1/k;->k:Ljava/util/regex/Pattern;

    .line 72
    .line 73
    const-string v0, "SUPPLEMENTAL-CODECS=\"((?:.|\u000c)+?)\""

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lax/d1/k;->l:Ljava/util/regex/Pattern;

    .line 80
    .line 81
    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lax/d1/k;->m:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lax/d1/k;->n:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lax/d1/k;->o:Ljava/util/regex/Pattern;

    .line 104
    .line 105
    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lax/d1/k;->p:Ljava/util/regex/Pattern;

    .line 112
    .line 113
    const-string v0, "[:,]DURATION=([\\d\\.]+)\\b"

    .line 114
    .line 115
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lax/d1/k;->q:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 122
    .line 123
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lax/d1/k;->r:Ljava/util/regex/Pattern;

    .line 128
    .line 129
    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 130
    .line 131
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lax/d1/k;->s:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 138
    .line 139
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lax/d1/k;->t:Ljava/util/regex/Pattern;

    .line 144
    .line 145
    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lax/d1/k;->u:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    const-string v0, "CAN-SKIP-DATERANGES"

    .line 154
    .line 155
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lax/d1/k;->v:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 162
    .line 163
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Lax/d1/k;->w:Ljava/util/regex/Pattern;

    .line 168
    .line 169
    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 170
    .line 171
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lax/d1/k;->x:Ljava/util/regex/Pattern;

    .line 176
    .line 177
    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 178
    .line 179
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lax/d1/k;->y:Ljava/util/regex/Pattern;

    .line 184
    .line 185
    const-string v0, "CAN-BLOCK-RELOAD"

    .line 186
    .line 187
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lax/d1/k;->z:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 194
    .line 195
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lax/d1/k;->A:Ljava/util/regex/Pattern;

    .line 200
    .line 201
    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    .line 202
    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lax/d1/k;->B:Ljava/util/regex/Pattern;

    .line 208
    .line 209
    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 210
    .line 211
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lax/d1/k;->C:Ljava/util/regex/Pattern;

    .line 216
    .line 217
    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 218
    .line 219
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lax/d1/k;->D:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 226
    .line 227
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, Lax/d1/k;->E:Ljava/util/regex/Pattern;

    .line 232
    .line 233
    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, Lax/d1/k;->F:Ljava/util/regex/Pattern;

    .line 240
    .line 241
    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 242
    .line 243
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, Lax/d1/k;->G:Ljava/util/regex/Pattern;

    .line 248
    .line 249
    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 250
    .line 251
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, Lax/d1/k;->H:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 258
    .line 259
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, Lax/d1/k;->I:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 266
    .line 267
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sput-object v0, Lax/d1/k;->J:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 274
    .line 275
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Lax/d1/k;->K:Ljava/util/regex/Pattern;

    .line 280
    .line 281
    const-string v0, "KEYFORMAT=\"((?:.|\u000c)+?)\""

    .line 282
    .line 283
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, Lax/d1/k;->L:Ljava/util/regex/Pattern;

    .line 288
    .line 289
    const-string v0, "KEYFORMATVERSIONS=\"((?:.|\u000c)+?)\""

    .line 290
    .line 291
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, Lax/d1/k;->M:Ljava/util/regex/Pattern;

    .line 296
    .line 297
    const-string v0, "URI=\"((?:.|\u000c)+?)\""

    .line 298
    .line 299
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    .line 304
    .line 305
    const-string v0, "IV=([^,.*]+)"

    .line 306
    .line 307
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Lax/d1/k;->O:Ljava/util/regex/Pattern;

    .line 312
    .line 313
    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 314
    .line 315
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sput-object v0, Lax/d1/k;->P:Ljava/util/regex/Pattern;

    .line 320
    .line 321
    const-string v0, "TYPE=(PART|MAP)"

    .line 322
    .line 323
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Lax/d1/k;->Q:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    const-string v0, "LANGUAGE=\"((?:.|\u000c)+?)\""

    .line 330
    .line 331
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Lax/d1/k;->R:Ljava/util/regex/Pattern;

    .line 336
    .line 337
    const-string v0, "NAME=\"((?:.|\u000c)+?)\""

    .line 338
    .line 339
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, Lax/d1/k;->S:Ljava/util/regex/Pattern;

    .line 344
    .line 345
    const-string v0, "GROUP-ID=\"((?:.|\u000c)+?)\""

    .line 346
    .line 347
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sput-object v0, Lax/d1/k;->T:Ljava/util/regex/Pattern;

    .line 352
    .line 353
    const-string v0, "CHARACTERISTICS=\"((?:.|\u000c)+?)\""

    .line 354
    .line 355
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, Lax/d1/k;->U:Ljava/util/regex/Pattern;

    .line 360
    .line 361
    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 362
    .line 363
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Lax/d1/k;->V:Ljava/util/regex/Pattern;

    .line 368
    .line 369
    const-string v0, "AUTOSELECT"

    .line 370
    .line 371
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, Lax/d1/k;->W:Ljava/util/regex/Pattern;

    .line 376
    .line 377
    const-string v0, "DEFAULT"

    .line 378
    .line 379
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Lax/d1/k;->X:Ljava/util/regex/Pattern;

    .line 384
    .line 385
    const-string v0, "FORCED"

    .line 386
    .line 387
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sput-object v0, Lax/d1/k;->Y:Ljava/util/regex/Pattern;

    .line 392
    .line 393
    const-string v0, "INDEPENDENT"

    .line 394
    .line 395
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sput-object v0, Lax/d1/k;->Z:Ljava/util/regex/Pattern;

    .line 400
    .line 401
    const-string v0, "GAP"

    .line 402
    .line 403
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Lax/d1/k;->a0:Ljava/util/regex/Pattern;

    .line 408
    .line 409
    const-string v0, "PRECISE"

    .line 410
    .line 411
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Lax/d1/k;->b0:Ljava/util/regex/Pattern;

    .line 416
    .line 417
    const-string v0, "VALUE=\"((?:.|\u000c)+?)\""

    .line 418
    .line 419
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    sput-object v0, Lax/d1/k;->c0:Ljava/util/regex/Pattern;

    .line 424
    .line 425
    const-string v0, "IMPORT=\"((?:.|\u000c)+?)\""

    .line 426
    .line 427
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    sput-object v0, Lax/d1/k;->d0:Ljava/util/regex/Pattern;

    .line 432
    .line 433
    const-string v0, "[:,]ID=\"((?:.|\u000c)+?)\""

    .line 434
    .line 435
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sput-object v0, Lax/d1/k;->e0:Ljava/util/regex/Pattern;

    .line 440
    .line 441
    const-string v0, "CLASS=\"((?:.|\u000c)+?)\""

    .line 442
    .line 443
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sput-object v0, Lax/d1/k;->f0:Ljava/util/regex/Pattern;

    .line 448
    .line 449
    const-string v0, "START-DATE=\"((?:.|\u000c)+?)\""

    .line 450
    .line 451
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    sput-object v0, Lax/d1/k;->g0:Ljava/util/regex/Pattern;

    .line 456
    .line 457
    const-string v0, "CUE=\"((?:.|\u000c)+?)\""

    .line 458
    .line 459
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Lax/d1/k;->h0:Ljava/util/regex/Pattern;

    .line 464
    .line 465
    const-string v0, "END-DATE=\"((?:.|\u000c)+?)\""

    .line 466
    .line 467
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, Lax/d1/k;->i0:Ljava/util/regex/Pattern;

    .line 472
    .line 473
    const-string v0, "PLANNED-DURATION=([\\d\\.]+)\\b"

    .line 474
    .line 475
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sput-object v0, Lax/d1/k;->j0:Ljava/util/regex/Pattern;

    .line 480
    .line 481
    const-string v0, "END-ON-NEXT"

    .line 482
    .line 483
    invoke-static {v0}, Lax/d1/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    sput-object v0, Lax/d1/k;->k0:Ljava/util/regex/Pattern;

    .line 488
    .line 489
    const-string v0, "X-ASSET-URI=\"((?:.|\u000c)+?)\""

    .line 490
    .line 491
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, Lax/d1/k;->l0:Ljava/util/regex/Pattern;

    .line 496
    .line 497
    const-string v0, "X-ASSET-LIST=\"((?:.|\u000c)+?)\""

    .line 498
    .line 499
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Lax/d1/k;->m0:Ljava/util/regex/Pattern;

    .line 504
    .line 505
    const-string v0, "X-RESUME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 506
    .line 507
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sput-object v0, Lax/d1/k;->n0:Ljava/util/regex/Pattern;

    .line 512
    .line 513
    const-string v0, "X-PLAYOUT-LIMIT=([\\d\\.]+)\\b"

    .line 514
    .line 515
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    sput-object v0, Lax/d1/k;->o0:Ljava/util/regex/Pattern;

    .line 520
    .line 521
    const-string v0, "X-SNAP=\"((?:.|\u000c)+?)\""

    .line 522
    .line 523
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sput-object v0, Lax/d1/k;->p0:Ljava/util/regex/Pattern;

    .line 528
    .line 529
    const-string v0, "X-RESTRICT=\"((?:.|\u000c)+?)\""

    .line 530
    .line 531
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, Lax/d1/k;->q0:Ljava/util/regex/Pattern;

    .line 536
    .line 537
    const-string v0, "X-CONTENT-MAY-VARY=\"((?:.|\u000c)+?)\""

    .line 538
    .line 539
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sput-object v0, Lax/d1/k;->r0:Ljava/util/regex/Pattern;

    .line 544
    .line 545
    const-string v0, "X-TIMELINE-OCCUPIES=\"((?:.|\u000c)+?)\""

    .line 546
    .line 547
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, Lax/d1/k;->s0:Ljava/util/regex/Pattern;

    .line 552
    .line 553
    const-string v0, "X-TIMELINE-STYLE=\"((?:.|\u000c)+?)\""

    .line 554
    .line 555
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, Lax/d1/k;->t0:Ljava/util/regex/Pattern;

    .line 560
    .line 561
    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 562
    .line 563
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    sput-object v0, Lax/d1/k;->u0:Ljava/util/regex/Pattern;

    .line 568
    .line 569
    const-string v0, "\\b(X-[A-Z0-9-]+)="

    .line 570
    .line 571
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Lax/d1/k;->v0:Ljava/util/regex/Pattern;

    .line 576
    .line 577
    return-void
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    sget-object v0, Lax/d1/i;->n:Lax/d1/i;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lax/d1/k;-><init>(Lax/d1/i;Lax/d1/f;)V

    return-void
.end method

.method public constructor <init>(Lax/d1/i;Lax/d1/f;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/d1/k;->a:Lax/d1/i;

    .line 4
    iput-object p2, p0, Lax/d1/k;->b:Lax/d1/f;

    return-void
.end method

.method private static A(Ljava/lang/String;)Lax/d1/f$h;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lax/d1/k;->u:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    const-wide v6, 0x412e848000000000L    # 1000000.0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmpl-double v1, v4, v2

    .line 22
    .line 23
    if-nez v1, :cond_1a

    .line 24
    .line 25
    move-wide v11, v8

    .line 26
    goto :goto_1e

    .line 27
    :cond_1a
    mul-double v4, v4, v6

    .line 28
    .line 29
    double-to-long v4, v4

    .line 30
    move-wide v11, v4

    .line 31
    :goto_1e
    sget-object v1, Lax/d1/k;->v:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v0, v1, v4}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v13

    .line 38
    sget-object v1, Lax/d1/k;->x:Ljava/util/regex/Pattern;

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 41
    .line 42
    .line 43
    move-result-wide v14

    .line 44
    cmpl-double v1, v14, v2

    .line 45
    .line 46
    if-nez v1, :cond_31

    .line 47
    .line 48
    move-wide v14, v8

    .line 49
    goto :goto_34

    .line 50
    :cond_31
    mul-double v14, v14, v6

    .line 51
    .line 52
    double-to-long v14, v14

    .line 53
    :goto_34
    sget-object v1, Lax/d1/k;->y:Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v16

    .line 59
    cmpl-double v1, v16, v2

    .line 60
    .line 61
    if-nez v1, :cond_41

    .line 62
    .line 63
    :goto_3e
    move-wide/from16 v16, v8

    .line 64
    .line 65
    goto :goto_45

    .line 66
    :cond_41
    mul-double v1, v16, v6

    .line 67
    .line 68
    double-to-long v8, v1

    .line 69
    goto :goto_3e

    .line 70
    :goto_45
    sget-object v1, Lax/d1/k;->z:Ljava/util/regex/Pattern;

    .line 71
    .line 72
    invoke-static {v0, v1, v4}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v18

    .line 76
    new-instance v10, Lax/d1/f$h;

    .line 77
    .line 78
    invoke-direct/range {v10 .. v18}, Lax/d1/f$h;-><init>(JZJJZ)V

    .line 79
    .line 80
    .line 81
    return-object v10
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

.method private static B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_7

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v0, "Couldn\'t match "

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " in "

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-static {p0, p1}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    throw p0
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

.method private static C(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Ljava/math/BigDecimal;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/math/BigDecimal;

    .line 13
    .line 14
    const-wide/32 v0, 0xf4240

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
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

.method private static D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/d1/k;->u0:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_b
    :goto_b
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2a

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_b

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    goto :goto_b

    .line 43
    :cond_2a
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
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

.method private static E(Ljava/io/BufferedReader;ZI)I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_16

    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_16

    .line 9
    .line 10
    if-nez p1, :cond_11

    .line 11
    .line 12
    invoke-static {p2}, Lax/S0/d0;->N0(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_16

    .line 17
    .line 18
    :cond_11
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    goto :goto_0

    .line 23
    :cond_16
    return p2
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

.method private static b(Ljava/io/BufferedReader;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xef

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_20

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0xbb

    .line 15
    .line 16
    if-ne v0, v1, :cond_1f

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0xbf

    .line 23
    .line 24
    if-eq v0, v1, :cond_1a

    .line 25
    .line 26
    goto :goto_1f

    .line 27
    :cond_1a
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    :goto_1f
    return v2

    .line 33
    :cond_20
    :goto_20
    const/4 v1, 0x1

    .line 34
    invoke-static {p0, v1, v0}, Lax/d1/k;->E(Ljava/io/BufferedReader;ZI)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_26
    const/4 v3, 0x7

    .line 40
    if-ge v1, v3, :cond_39

    .line 41
    .line 42
    const-string v3, "#EXTM3U"

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eq v0, v3, :cond_32

    .line 49
    .line 50
    return v2

    .line 51
    :cond_32
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_26

    .line 58
    :cond_39
    invoke-static {p0, v2, v0}, Lax/d1/k;->E(Ljava/io/BufferedReader;ZI)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Lax/S0/d0;->N0(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
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

.method private static c(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .registers 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "=("

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, "NO"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, "|"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "YES"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ")"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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

.method private static d(Ljava/lang/String;[Lax/P0/o$b;)Lax/P0/o;
    .registers 6

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Lax/P0/o$b;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_4
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_13

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v2, v3}, Lax/P0/o$b;->a([B)Lax/P0/o$b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    aput-object v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_4

    .line 20
    :cond_13
    new-instance p1, Lax/P0/o;

    .line 21
    .line 22
    invoke-direct {p1, p0, v0}, Lax/P0/o;-><init>(Ljava/lang/String;[Lax/P0/o$b;)V

    .line 23
    .line 24
    .line 25
    return-object p1
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

.method private static e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_4
    if-eqz p3, :cond_7

    .line 6
    .line 7
    return-object p3

    .line 8
    :cond_7
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method private static f(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/d1/i$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lax/d1/i$b;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_19

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/d1/i$b;

    .line 13
    .line 14
    iget-object v2, v1, Lax/d1/i$b;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_16
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method private static g(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/d1/i$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lax/d1/i$b;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_19

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/d1/i$b;

    .line 13
    .line 14
    iget-object v2, v1, Lax/d1/i$b;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_16
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method private static h(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/d1/i$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lax/d1/i$b;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_19

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/d1/i$b;

    .line 13
    .line 14
    iget-object v2, v1, Lax/d1/i$b;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_16

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_16
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method private static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .registers 5

    .line 1
    invoke-static {p1, p2}, Lax/P0/D;->p(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    const/4 p1, 0x1

    .line 10
    if-nez p2, :cond_c

    .line 11
    .line 12
    return p1

    .line 13
    :cond_c
    if-eqz p0, :cond_43

    .line 14
    .line 15
    if-nez p3, :cond_11

    .line 16
    .line 17
    goto :goto_43

    .line 18
    :cond_11
    const-string p2, "PQ"

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_21

    .line 25
    .line 26
    const-string p2, "db1p"

    .line 27
    .line 28
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_41

    .line 33
    .line 34
    :cond_21
    const-string p2, "SDR"

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_31

    .line 41
    .line 42
    const-string p2, "db2g"

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_41

    .line 49
    .line 50
    :cond_31
    const-string p2, "HLG"

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_42

    .line 57
    .line 58
    const-string p0, "db4"

    .line 59
    .line 60
    invoke-virtual {p3, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_42

    .line 65
    .line 66
    :cond_41
    return v0

    .line 67
    :cond_42
    return p1

    .line 68
    :cond_43
    :goto_43
    return v0
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

.method private static k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lax/d1/f$b;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lax/d1/f$b;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v2, v0

    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v3, v2, 0x1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-ne v0, v3, :cond_25

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 v0, 0x2

    .line 39
    :goto_26
    add-int/2addr v0, v2

    .line 40
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v2, "\""

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_56

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\"((?:.|\u000c)+?)\""

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p0, v0, p2}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p2, Lax/d1/f$b;

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-direct {p2, p1, p0, v0}, Lax/d1/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_56
    const-string v1, "0x"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_86

    .line 94
    .line 95
    const-string v1, "0X"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_67

    .line 102
    .line 103
    goto :goto_86

    .line 104
    :cond_67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, "=([\\d\\.]+)\\b"

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    new-instance v0, Lax/d1/f$b;

    .line 126
    .line 127
    invoke-static {p0, p2}, Lax/d1/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    invoke-direct {v0, p1, v1, v2}, Lax/d1/f$b;-><init>(Ljava/lang/String;D)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_86
    :goto_86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, "=(0[xX][A-F0-9]+)"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {p0, v0, p2}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    new-instance p2, Lax/d1/f$b;

    .line 161
    .line 162
    invoke-direct {p2, p1, p0, v4}, Lax/d1/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    return-object p2
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

.method private static l(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
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

.method private static m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lax/P0/o$b;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lax/P0/o$b;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/d1/k;->M:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-static {p0, v0, v1, p2}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x2c

    .line 17
    .line 18
    const-string v5, "video/mp4"

    .line 19
    .line 20
    if-eqz v2, :cond_2f

    .line 21
    .line 22
    sget-object p1, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    .line 23
    .line 24
    invoke-static {p0, p1, p2}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Lax/P0/o$b;

    .line 29
    .line 30
    sget-object p2, Lax/P0/i;->d:Ljava/util/UUID;

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {p1, p2, v5, p0}, Lax/P0/o$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2f
    const-string v2, "com.widevine"

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_45

    .line 55
    .line 56
    new-instance p1, Lax/P0/o$b;

    .line 57
    .line 58
    sget-object p2, Lax/P0/i;->d:Ljava/util/UUID;

    .line 59
    .line 60
    const-string v0, "hls"

    .line 61
    .line 62
    invoke-static {p0}, Lax/S0/d0;->x0(Ljava/lang/String;)[B

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p1, p2, v0, p0}, Lax/P0/o$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_45
    const-string v2, "com.microsoft.playready"

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_71

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_71

    .line 83
    .line 84
    sget-object p1, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    .line 85
    .line 86
    invoke-static {p0, p1, p2}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object p1, Lax/P0/i;->e:Ljava/util/UUID;

    .line 103
    .line 104
    invoke-static {p1, p0}, Lax/K1/p;->a(Ljava/util/UUID;[B)[B

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance p2, Lax/P0/o$b;

    .line 109
    .line 110
    invoke-direct {p2, p1, v5, p0}, Lax/P0/o$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 111
    .line 112
    .line 113
    return-object p2

    .line 114
    :cond_71
    const/4 p0, 0x0

    .line 115
    return-object p0
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

.method private static n(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "SAMPLE-AES-CENC"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    const-string v0, "SAMPLE-AES-CTR"

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
    goto :goto_14

    .line 18
    :cond_11
    const-string p0, "cbcs"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_14
    :goto_14
    const-string p0, "cenc"

    .line 22
    .line 23
    return-object p0
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
.end method

.method private static o(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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

.method private static p(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
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

.method private static q(Lax/d1/i;Lax/d1/f;Lax/d1/k$b;Ljava/lang/String;)Lax/d1/f;
    .registers 95
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-boolean v4, v0, Lax/d1/j;->c:Z

    .line 2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 4
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    new-instance v12, Lax/d1/f$h;

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v20, 0x0

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v15, 0x0

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v12 .. v20}, Lax/d1/f$h;-><init>(JZJJZ)V

    .line 10
    new-instance v13, Ljava/util/TreeMap;

    invoke-direct {v13}, Ljava/util/TreeMap;-><init>()V

    const-wide/16 v17, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    const-string v3, ""

    move-object/from16 v23, v3

    move/from16 v25, v4

    move-wide/from16 v26, v17

    move-wide/from16 v37, v26

    move-wide/from16 v44, v37

    move-wide/from16 v56, v44

    move-wide/from16 v64, v56

    move-wide/from16 v78, v64

    move-wide/from16 v81, v78

    move-wide/from16 v83, v81

    move-wide/from16 v48, v20

    move-wide/from16 v50, v48

    move-wide/from16 v52, v50

    move-object/from16 v39, v23

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v28, 0x0

    const/16 v36, 0x0

    const-wide/16 v40, -0x1

    const/16 v42, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v60, 0x0

    const/16 v63, 0x0

    const/16 v67, 0x0

    const-wide/16 v76, -0x1

    const/16 v80, 0x0

    const/16 v85, 0x2

    move-wide/from16 v18, v83

    move-wide/from16 v23, v52

    move-object/from16 v17, v39

    const/16 v20, 0x1

    const/16 v21, 0x0

    .line 12
    :cond_93
    :goto_93
    invoke-virtual/range {p2 .. p2}, Lax/d1/k$b;->a()Z

    move-result v29

    if-eqz v29, :cond_a9f

    .line 13
    invoke-virtual/range {p2 .. p2}, Lax/d1/k$b;->b()Ljava/lang/String;

    move-result-object v15

    .line 14
    const-string v14, "#EXT"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_a8

    .line 15
    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_a8
    const-string v14, "#EXT-X-PLAYLIST-TYPE"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_cc

    .line 17
    sget-object v14, Lax/d1/k;->t:Ljava/util/regex/Pattern;

    invoke-static {v15, v14, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v14

    .line 18
    const-string v15, "VOD"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c1

    const/16 v47, 0x1

    goto :goto_93

    .line 19
    :cond_c1
    const-string v15, "EVENT"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_93

    const/16 v47, 0x2

    goto :goto_93

    .line 20
    :cond_cc
    const-string v14, "#EXT-X-I-FRAMES-ONLY"

    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d7

    const/16 v80, 0x1

    goto :goto_93

    .line 21
    :cond_d7
    const-string v14, "#EXT-X-START"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    const-wide v29, 0x412e848000000000L    # 1000000.0

    if-eqz v14, :cond_ff

    .line 22
    sget-object v14, Lax/d1/k;->F:Ljava/util/regex/Pattern;

    invoke-static {v15, v14}, Lax/d1/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v31

    move-object/from16 v43, v3

    move-object v14, v4

    mul-double v3, v31, v29

    double-to-long v3, v3

    move-wide/from16 v29, v3

    .line 23
    sget-object v3, Lax/d1/k;->b0:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    .line 24
    invoke-static {v15, v3, v4}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v46

    move-object v4, v14

    move-wide/from16 v48, v29

    :goto_fc
    move-object/from16 v3, v43

    goto :goto_93

    :cond_ff
    move-object/from16 v43, v3

    move-object v14, v4

    .line 25
    const-string v3, "#EXT-X-SERVER-CONTROL"

    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_110

    .line 26
    invoke-static {v15}, Lax/d1/k;->A(Ljava/lang/String;)Lax/d1/f$h;

    move-result-object v12

    :goto_10e
    move-object v4, v14

    goto :goto_fc

    .line 27
    :cond_110
    const-string v3, "#EXT-X-PART-INF"

    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_124

    .line 28
    sget-object v3, Lax/d1/k;->r:Ljava/util/regex/Pattern;

    invoke-static {v15, v3}, Lax/d1/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v3

    mul-double v3, v3, v29

    double-to-long v3, v3

    move-wide/from16 v23, v3

    goto :goto_10e

    .line 29
    :cond_124
    const-string v3, "#EXT-X-MAP"

    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "@"

    if-eqz v3, :cond_181

    .line 30
    sget-object v3, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v15, v3, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v30

    .line 31
    sget-object v3, Lax/d1/k;->H:Ljava/util/regex/Pattern;

    invoke-static {v15, v3, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_152

    .line 32
    invoke-static {v3, v4}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/16 v87, 0x0

    .line 33
    aget-object v4, v3, v87

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v40

    .line 34
    array-length v4, v3

    const/4 v15, 0x1

    if-le v4, v15, :cond_152

    .line 35
    aget-object v3, v3, v15

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v26

    :cond_152
    move-wide/from16 v33, v40

    cmp-long v3, v33, v76

    if-nez v3, :cond_15b

    move-wide/from16 v31, v44

    goto :goto_15d

    :cond_15b
    move-wide/from16 v31, v26

    :goto_15d
    if-eqz v67, :cond_161

    if-eqz v36, :cond_163

    :cond_161
    const/4 v4, 0x0

    goto :goto_16b

    .line 36
    :cond_163
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    move-result-object v0

    throw v0

    .line 37
    :goto_16b
    new-instance v29, Lax/d1/f$f;

    move-object/from16 v35, v67

    invoke-direct/range {v29 .. v36}, Lax/d1/f$f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_176

    add-long v31, v31, v33

    :cond_176
    move-wide/from16 v26, v31

    move-object v4, v14

    move-object/from16 v60, v29

    move-object/from16 v3, v43

    move-wide/from16 v40, v76

    goto/16 :goto_93

    :cond_181
    move-object/from16 v88, v10

    move-object/from16 v89, v12

    move-object/from16 v3, v36

    move-object/from16 v10, v67

    const/16 v86, 0x0

    .line 38
    const-string v12, "#EXT-X-TARGETDURATION"

    invoke-virtual {v15, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1ad

    .line 39
    sget-object v4, Lax/d1/k;->o:Ljava/util/regex/Pattern;

    invoke-static {v15, v4}, Lax/d1/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v4

    move-object v12, v14

    int-to-long v14, v4

    const-wide/32 v29, 0xf4240

    mul-long v52, v14, v29

    :goto_1a0
    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object v4, v12

    move-object/from16 v3, v43

    :goto_1a7
    move-object/from16 v10, v88

    :goto_1a9
    move-object/from16 v12, v89

    goto/16 :goto_93

    :cond_1ad
    move-object v12, v14

    .line 40
    const-string v14, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1c6

    .line 41
    sget-object v4, Lax/d1/k;->A:Ljava/util/regex/Pattern;

    invoke-static {v15, v4}, Lax/d1/k;->p(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v78

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object v4, v12

    move-object/from16 v3, v43

    move-wide/from16 v18, v78

    goto :goto_1a7

    .line 42
    :cond_1c6
    const-string v14, "#EXT-X-VERSION"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1d5

    .line 43
    sget-object v4, Lax/d1/k;->s:Ljava/util/regex/Pattern;

    invoke-static {v15, v4}, Lax/d1/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v20

    goto :goto_1a0

    .line 44
    :cond_1d5
    const-string v14, "#EXT-X-DEFINE"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_21f

    .line 45
    sget-object v4, Lax/d1/k;->d0:Ljava/util/regex/Pattern;

    invoke-static {v15, v4, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1f3

    .line 46
    iget-object v14, v0, Lax/d1/i;->l:Ljava/util/Map;

    invoke-interface {v14, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_202

    .line 47
    invoke-virtual {v5, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_202

    .line 48
    :cond_1f3
    sget-object v4, Lax/d1/k;->S:Ljava/util/regex/Pattern;

    .line 49
    invoke-static {v15, v4, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    sget-object v14, Lax/d1/k;->c0:Ljava/util/regex/Pattern;

    .line 50
    invoke-static {v15, v14, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v14

    .line 51
    invoke-virtual {v5, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_202
    :goto_202
    move-object v1, v6

    move-object v0, v7

    move-object/from16 v69, v9

    move-object/from16 v90, v12

    move-object/from16 v68, v13

    move-object/from16 v67, v17

    move-wide/from16 v33, v37

    move-object/from16 v29, v39

    move-object/from16 v66, v60

    move/from16 v4, v63

    move-wide/from16 v30, v81

    const/4 v15, 0x0

    move-object v9, v2

    move-object v2, v11

    move-wide/from16 v62, v26

    move-wide/from16 v11, v78

    goto/16 :goto_a73

    .line 52
    :cond_21f
    const-string v14, "#EXTINF"

    invoke-virtual {v15, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_237

    .line 53
    sget-object v4, Lax/d1/k;->B:Ljava/util/regex/Pattern;

    invoke-static {v15, v4}, Lax/d1/k;->C(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v81

    .line 54
    sget-object v4, Lax/d1/k;->C:Ljava/util/regex/Pattern;

    move-object/from16 v14, v17

    invoke-static {v15, v4, v14, v5}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v39

    goto/16 :goto_1a0

    :cond_237
    move-object/from16 v14, v17

    .line 55
    const-string v0, "#EXT-X-SKIP"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-wide/16 v31, 0x1

    if-eqz v0, :cond_2ef

    .line 56
    sget-object v0, Lax/d1/k;->w:Ljava/util/regex/Pattern;

    invoke-static {v15, v0}, Lax/d1/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v0

    if-eqz v1, :cond_253

    .line 57
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_253

    const/4 v4, 0x1

    goto :goto_254

    :cond_253
    const/4 v4, 0x0

    :goto_254
    invoke-static {v4}, Lax/S0/a;->g(Z)V

    .line 58
    invoke-static {v1}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lax/d1/f;

    move-object/from16 v17, v11

    move-object/from16 v90, v12

    iget-wide v11, v4, Lax/d1/f;->k:J

    sub-long v11, v18, v11

    long-to-int v4, v11

    add-int/2addr v0, v4

    if-ltz v4, :cond_2e9

    .line 59
    iget-object v11, v1, Lax/d1/f;->r:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-gt v0, v11, :cond_2e9

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-wide/from16 v10, v37

    move-object/from16 v3, v43

    :goto_279
    if-ge v4, v0, :cond_2d7

    .line 60
    iget-object v3, v1, Lax/d1/f;->r:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lax/d1/f$f;

    move-object v12, v14

    .line 61
    iget-wide v14, v1, Lax/d1/f;->k:J

    cmp-long v29, v18, v14

    if-eqz v29, :cond_295

    .line 62
    iget v14, v1, Lax/d1/f;->j:I

    sub-int v14, v14, v55

    iget v15, v3, Lax/d1/f$g;->e0:I

    add-int/2addr v14, v15

    .line 63
    invoke-virtual {v3, v10, v11, v14}, Lax/d1/f$f;->h(JI)Lax/d1/f$f;

    move-result-object v3

    .line 64
    :cond_295
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-wide v14, v3, Lax/d1/f$g;->d0:J

    add-long v64, v10, v14

    .line 66
    iget-wide v10, v3, Lax/d1/f$g;->k0:J

    cmp-long v14, v10, v76

    if-eqz v14, :cond_2a6

    .line 67
    iget-wide v14, v3, Lax/d1/f$g;->j0:J

    add-long v26, v14, v10

    .line 68
    :cond_2a6
    iget v10, v3, Lax/d1/f$g;->e0:I

    .line 69
    iget-object v11, v3, Lax/d1/f$g;->c0:Lax/d1/f$f;

    .line 70
    iget-object v14, v3, Lax/d1/f$g;->g0:Lax/P0/o;

    .line 71
    iget-object v15, v3, Lax/d1/f$g;->h0:Ljava/lang/String;

    move/from16 v29, v0

    .line 72
    iget-object v0, v3, Lax/d1/f$g;->i0:Ljava/lang/String;

    if-eqz v0, :cond_2be

    .line 73
    invoke-static/range {v78 .. v79}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c2

    .line 74
    :cond_2be
    iget-object v0, v3, Lax/d1/f$g;->i0:Ljava/lang/String;

    move-object/from16 v36, v0

    :cond_2c2
    add-long v78, v78, v31

    const/16 v22, 0x1

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p1

    move/from16 v63, v10

    move-object/from16 v60, v11

    move-object v3, v14

    move-object/from16 v67, v15

    move/from16 v0, v29

    move-wide/from16 v10, v64

    move-object v14, v12

    goto :goto_279

    :cond_2d7
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v37, v10

    move-object/from16 v11, v17

    move-object/from16 v10, v88

    move-object/from16 v12, v89

    move-object/from16 v4, v90

    :goto_2e5
    move-object/from16 v17, v14

    goto/16 :goto_93

    .line 75
    :cond_2e9
    new-instance v0, Lax/d1/k$a;

    invoke-direct {v0}, Lax/d1/k$a;-><init>()V

    throw v0

    :cond_2ef
    move-object/from16 v17, v11

    move-object/from16 v90, v12

    move-object v12, v14

    .line 76
    const-string v0, "#EXT-X-KEY"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_367

    .line 77
    sget-object v0, Lax/d1/k;->K:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 78
    sget-object v1, Lax/d1/k;->L:Ljava/util/regex/Pattern;

    .line 79
    const-string v3, "identity"

    invoke-static {v15, v1, v3, v5}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    .line 80
    const-string v4, "NONE"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31c

    .line 81
    invoke-virtual {v13}, Ljava/util/TreeMap;->clear()V

    move-object/from16 v3, v86

    move-object/from16 v36, v3

    move-object/from16 v67, v36

    goto :goto_359

    .line 82
    :cond_31c
    sget-object v4, Lax/d1/k;->O:Ljava/util/regex/Pattern;

    invoke-static {v15, v4, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_344

    .line 84
    const-string v1, "AES-128"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33d

    .line 85
    sget-object v0, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v67, v0

    move-object/from16 v36, v4

    move-object/from16 v3, v43

    goto :goto_359

    :cond_33d
    move-object/from16 v36, v4

    move-object/from16 v3, v43

    move-object/from16 v67, v86

    goto :goto_359

    :cond_344
    if-nez v2, :cond_34a

    .line 86
    invoke-static {v0}, Lax/d1/k;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 87
    :cond_34a
    invoke-static {v15, v1, v5}, Lax/d1/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lax/P0/o$b;

    move-result-object v0

    if-eqz v0, :cond_33d

    .line 88
    invoke-virtual {v13, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v36, v4

    move-object/from16 v3, v86

    move-object/from16 v67, v3

    :goto_359
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, v17

    :goto_35f
    move-object/from16 v10, v88

    move-object/from16 v4, v90

    :goto_363
    move-object/from16 v17, v12

    goto/16 :goto_1a9

    .line 89
    :cond_367
    const-string v0, "#EXT-X-BYTERANGE"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_39a

    .line 90
    sget-object v0, Lax/d1/k;->G:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {v0, v4}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/16 v87, 0x0

    .line 92
    aget-object v1, v0, v87

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v40

    .line 93
    array-length v1, v0

    const/4 v11, 0x1

    if-le v1, v11, :cond_38d

    .line 94
    aget-object v0, v0, v11

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide/from16 v26, v0

    :cond_38d
    :goto_38d
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object/from16 v11, v17

    move-object/from16 v3, v43

    goto :goto_35f

    :cond_39a
    const/4 v11, 0x1

    .line 95
    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x3a

    if-eqz v0, :cond_3c5

    .line 96
    invoke-virtual {v15, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v11

    invoke-virtual {v15, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v55

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object/from16 v11, v17

    move-object/from16 v3, v43

    move-object/from16 v10, v88

    move-object/from16 v4, v90

    const/16 v54, 0x1

    goto :goto_363

    .line 97
    :cond_3c5
    const-string v0, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3d0

    add-int/lit8 v63, v63, 0x1

    goto :goto_38d

    .line 98
    :cond_3d0
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_40c

    cmp-long v0, v56, v44

    if-nez v0, :cond_3f0

    .line 99
    invoke-virtual {v15, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v11

    invoke-virtual {v15, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lax/S0/d0;->i1(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lax/S0/d0;->a1(J)J

    move-result-wide v0

    sub-long v56, v0, v37

    goto :goto_38d

    :cond_3f0
    move-object v1, v6

    move-object v0, v7

    move-object/from16 v69, v9

    move-object/from16 v67, v12

    move-object/from16 v68, v13

    :goto_3f8
    move-wide/from16 v33, v37

    move-object/from16 v29, v39

    move-object/from16 v66, v60

    move/from16 v4, v63

    move-wide/from16 v11, v78

    move-wide/from16 v30, v81

    const/4 v15, 0x0

    move-object v9, v2

    move-object/from16 v2, v17

    :goto_408
    move-wide/from16 v62, v26

    goto/16 :goto_a73

    .line 100
    :cond_40c
    const-string v0, "#EXT-X-GAP"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_428

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object/from16 v11, v17

    move-object/from16 v3, v43

    move-object/from16 v10, v88

    move-object/from16 v4, v90

    const/16 v42, 0x1

    goto/16 :goto_363

    .line 101
    :cond_428
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_444

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object/from16 v11, v17

    move-object/from16 v3, v43

    move-object/from16 v10, v88

    move-object/from16 v4, v90

    const/16 v25, 0x1

    goto/16 :goto_363

    .line 102
    :cond_444
    const-string v0, "#EXT-X-ENDLIST"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_460

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-object/from16 v11, v17

    move-object/from16 v3, v43

    move-object/from16 v10, v88

    move-object/from16 v4, v90

    const/16 v21, 0x1

    goto/16 :goto_363

    .line 103
    :cond_460
    const-string v0, "#EXT-X-RENDITION-REPORT"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_49a

    .line 104
    sget-object v0, Lax/d1/k;->D:Ljava/util/regex/Pattern;

    move-object v14, v12

    move-wide/from16 v11, v76

    invoke-static {v15, v0, v11, v12}, Lax/d1/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v0

    .line 105
    sget-object v4, Lax/d1/k;->E:Ljava/util/regex/Pattern;

    const/4 v11, -0x1

    invoke-static {v15, v4, v11}, Lax/d1/k;->u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v4

    .line 106
    sget-object v11, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v15, v11, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v12, p3

    .line 107
    invoke-static {v12, v11}, Lax/S0/O;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    .line 108
    new-instance v15, Lax/d1/f$e;

    invoke-direct {v15, v11, v0, v1, v4}, Lax/d1/f$e;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_490
    move-object v1, v6

    move-object v0, v7

    move-object/from16 v69, v9

    move-object/from16 v68, v13

    move-object/from16 v67, v14

    goto/16 :goto_3f8

    :cond_49a
    move-object v14, v12

    move-object/from16 v12, p3

    .line 109
    const-string v0, "#EXT-X-PRELOAD-HINT"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_539

    if-eqz v90, :cond_4a8

    :goto_4a7
    goto :goto_490

    .line 110
    :cond_4a8
    sget-object v0, Lax/d1/k;->Q:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 111
    const-string v1, "PART"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b7

    goto :goto_4a7

    .line 112
    :cond_4b7
    sget-object v0, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v59

    .line 113
    sget-object v0, Lax/d1/k;->I:Ljava/util/regex/Pattern;

    const-wide/16 v11, -0x1

    .line 114
    invoke-static {v15, v0, v11, v12}, Lax/d1/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v0

    .line 115
    sget-object v4, Lax/d1/k;->J:Ljava/util/regex/Pattern;

    .line 116
    invoke-static {v15, v4, v11, v12}, Lax/d1/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v71

    move-wide/from16 v11, v78

    .line 117
    invoke-static {v11, v12, v10, v3}, Lax/d1/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v68

    if-nez v43, :cond_4fa

    .line 118
    invoke-virtual {v13}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4fa

    .line 119
    invoke-virtual {v13}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v4

    move-wide/from16 v29, v0

    const/4 v15, 0x0

    new-array v0, v15, [Lax/P0/o$b;

    invoke-interface {v4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lax/P0/o$b;

    .line 120
    new-instance v1, Lax/P0/o;

    invoke-direct {v1, v2, v0}, Lax/P0/o;-><init>(Ljava/lang/String;[Lax/P0/o$b;)V

    if-nez v28, :cond_4f5

    .line 121
    invoke-static {v2, v0}, Lax/d1/k;->d(Ljava/lang/String;[Lax/P0/o$b;)Lax/P0/o;

    move-result-object v0

    move-object/from16 v28, v0

    :cond_4f5
    move-object/from16 v66, v1

    :goto_4f7
    const-wide/16 v76, -0x1

    goto :goto_4ff

    :cond_4fa
    move-wide/from16 v29, v0

    move-object/from16 v66, v43

    goto :goto_4f7

    :goto_4ff
    cmp-long v0, v29, v76

    if-eqz v0, :cond_50b

    cmp-long v1, v71, v76

    if-eqz v1, :cond_508

    goto :goto_50b

    :cond_508
    move-object/from16 v4, v90

    goto :goto_523

    .line 122
    :cond_50b
    :goto_50b
    new-instance v58, Lax/d1/f$d;

    if-eqz v0, :cond_512

    move-wide/from16 v69, v29

    goto :goto_514

    :cond_512
    move-wide/from16 v69, v44

    :goto_514
    const/16 v74, 0x0

    const/16 v75, 0x1

    const-wide/16 v61, 0x0

    const/16 v73, 0x0

    move-object/from16 v67, v10

    .line 123
    invoke-direct/range {v58 .. v75}, Lax/d1/f$d;-><init>(Ljava/lang/String;Lax/d1/f$f;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v4, v58

    :goto_523
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v36, v3

    move-object/from16 v67, v10

    move-wide/from16 v78, v11

    move-object/from16 v11, v17

    move-object/from16 v3, v66

    move-object/from16 v10, v88

    move-object/from16 v12, v89

    const-wide/16 v76, -0x1

    goto/16 :goto_2e5

    :cond_539
    move-wide/from16 v11, v78

    .line 124
    const-string v0, "#EXT-X-PART"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5fe

    .line 125
    invoke-static {v11, v12, v10, v3}, Lax/d1/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v68

    .line 126
    sget-object v0, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v59

    .line 127
    sget-object v0, Lax/d1/k;->p:Ljava/util/regex/Pattern;

    .line 128
    invoke-static {v15, v0}, Lax/d1/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v0

    mul-double v0, v0, v29

    double-to-long v0, v0

    move-wide/from16 v61, v0

    .line 129
    sget-object v0, Lax/d1/k;->Z:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    .line 130
    invoke-static {v15, v0, v1}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v0

    if-eqz v25, :cond_56a

    .line 131
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v29

    if-eqz v29, :cond_56a

    const/16 v29, 0x1

    goto :goto_56c

    :cond_56a
    const/16 v29, 0x0

    :goto_56c
    or-int v74, v0, v29

    .line 132
    sget-object v0, Lax/d1/k;->a0:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v1}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v73

    .line 133
    sget-object v0, Lax/d1/k;->H:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_595

    .line 134
    invoke-static {v0, v4}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 135
    aget-object v4, v0, v1

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v29

    .line 136
    array-length v1, v0

    const/4 v15, 0x1

    if-le v1, v15, :cond_590

    .line 137
    aget-object v0, v0, v15

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v83

    :cond_590
    move-wide/from16 v71, v29

    :goto_592
    const-wide/16 v76, -0x1

    goto :goto_598

    :cond_595
    const-wide/16 v71, -0x1

    goto :goto_592

    :goto_598
    cmp-long v0, v71, v76

    if-nez v0, :cond_59f

    move-wide/from16 v69, v44

    goto :goto_5a1

    :cond_59f
    move-wide/from16 v69, v83

    :goto_5a1
    if-nez v43, :cond_5c6

    .line 138
    invoke-virtual {v13}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5c6

    .line 139
    invoke-virtual {v13}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v15, 0x0

    new-array v4, v15, [Lax/P0/o$b;

    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lax/P0/o$b;

    .line 140
    new-instance v4, Lax/P0/o;

    invoke-direct {v4, v2, v1}, Lax/P0/o;-><init>(Ljava/lang/String;[Lax/P0/o$b;)V

    if-nez v28, :cond_5c3

    .line 141
    invoke-static {v2, v1}, Lax/d1/k;->d(Ljava/lang/String;[Lax/P0/o$b;)Lax/P0/o;

    move-result-object v1

    move-object/from16 v28, v1

    :cond_5c3
    move-object/from16 v66, v4

    goto :goto_5c8

    :cond_5c6
    move-object/from16 v66, v43

    .line 142
    :goto_5c8
    new-instance v58, Lax/d1/f$d;

    const/16 v75, 0x0

    move-object/from16 v67, v10

    invoke-direct/range {v58 .. v75}, Lax/d1/f$d;-><init>(Ljava/lang/String;Lax/d1/f$f;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v15, v58

    move-object/from16 v1, v60

    move/from16 v4, v63

    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v64, v64, v61

    if-eqz v0, :cond_5e0

    add-long v69, v69, v71

    :cond_5e0
    move-wide/from16 v83, v69

    move-object/from16 v0, p0

    move-object/from16 v60, v1

    move-object/from16 v36, v3

    move/from16 v63, v4

    move-object/from16 v67, v10

    move-wide/from16 v78, v11

    move-object/from16 v11, v17

    move-object/from16 v3, v66

    move-object/from16 v10, v88

    move-object/from16 v12, v89

    move-object/from16 v4, v90

    const-wide/16 v76, -0x1

    move-object/from16 v1, p1

    goto/16 :goto_2e5

    :cond_5fe
    move-object/from16 v1, v60

    move/from16 v4, v63

    .line 143
    const-string v0, "#EXT-X-DATERANGE"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_986

    sget-object v0, Lax/d1/k;->f0:Ljava/util/regex/Pattern;

    .line 144
    invoke-static {v15, v0, v14, v5}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v66, v1

    const-string v1, "com.apple.hls.interstitial"

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_96d

    .line 146
    sget-object v0, Lax/d1/k;->e0:Ljava/util/regex/Pattern;

    invoke-static {v15, v0, v5}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 147
    sget-object v1, Lax/d1/k;->l0:Ljava/util/regex/Pattern;

    invoke-static {v15, v1, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_62f

    .line 148
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    :goto_62c
    move/from16 v33, v4

    goto :goto_632

    :cond_62f
    move-object/from16 v1, v86

    goto :goto_62c

    .line 149
    :goto_632
    sget-object v4, Lax/d1/k;->m0:Ljava/util/regex/Pattern;

    .line 150
    invoke-static {v15, v4, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_641

    .line 151
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    :goto_63e
    move-object/from16 v34, v8

    goto :goto_644

    :cond_641
    move-object/from16 v4, v86

    goto :goto_63e

    .line 152
    :goto_644
    sget-object v8, Lax/d1/k;->g0:Ljava/util/regex/Pattern;

    .line 153
    invoke-static {v15, v8, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_65b

    .line 154
    invoke-static {v8}, Lax/S0/d0;->i1(Ljava/lang/String;)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Lax/S0/d0;->a1(J)J

    move-result-wide v31

    move-object/from16 v68, v13

    move-object/from16 v67, v14

    move-wide/from16 v13, v31

    goto :goto_661

    :cond_65b
    move-object/from16 v68, v13

    move-object/from16 v67, v14

    move-wide/from16 v13, v50

    .line 155
    :goto_661
    sget-object v8, Lax/d1/k;->i0:Ljava/util/regex/Pattern;

    .line 156
    invoke-static {v15, v8, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_678

    .line 157
    invoke-static {v8}, Lax/S0/d0;->i1(Ljava/lang/String;)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Lax/S0/d0;->a1(J)J

    move-result-wide v31

    move-object/from16 v69, v9

    move-wide/from16 v8, v31

    :goto_675
    move-object/from16 v70, v7

    goto :goto_67d

    :cond_678
    move-object/from16 v69, v9

    move-wide/from16 v8, v50

    goto :goto_675

    .line 158
    :goto_67d
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v71, v2

    .line 159
    sget-object v2, Lax/d1/k;->h0:Ljava/util/regex/Pattern;

    invoke-static {v15, v2, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v72, v6

    .line 160
    const-string v6, ","

    if-eqz v2, :cond_6e7

    .line 161
    invoke-static {v2, v6}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move-object/from16 v73, v3

    .line 162
    array-length v3, v2

    move-object/from16 v31, v2

    const/4 v2, 0x0

    :goto_69a
    if-ge v2, v3, :cond_6e9

    aget-object v32, v31, v2

    move/from16 v35, v2

    .line 163
    invoke-virtual/range {v32 .. v32}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v32

    sparse-switch v32, :sswitch_data_b60

    move/from16 v32, v3

    :goto_6b0
    const/4 v3, -0x1

    goto :goto_6d8

    :sswitch_6b2
    move/from16 v32, v3

    const-string v3, "POST"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6bd

    goto :goto_6d6

    :cond_6bd
    const/4 v3, 0x2

    goto :goto_6d8

    :sswitch_6bf
    move/from16 v32, v3

    const-string v3, "ONCE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6ca

    goto :goto_6d6

    :cond_6ca
    const/4 v3, 0x1

    goto :goto_6d8

    :sswitch_6cc
    move/from16 v32, v3

    const-string v3, "PRE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6d7

    :goto_6d6
    goto :goto_6b0

    :cond_6d7
    const/4 v3, 0x0

    :goto_6d8
    packed-switch v3, :pswitch_data_b6e

    :goto_6db
    const/16 v22, 0x1

    goto :goto_6e2

    .line 165
    :pswitch_6de
    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6db

    :goto_6e2
    add-int/lit8 v2, v35, 0x1

    move/from16 v3, v32

    goto :goto_69a

    :cond_6e7
    move-object/from16 v73, v3

    .line 166
    :cond_6e9
    sget-object v2, Lax/d1/k;->q:Ljava/util/regex/Pattern;

    move-object v3, v10

    move-wide/from16 v35, v11

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    invoke-static {v15, v2, v10, v11}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v31

    const-wide/16 v58, 0x0

    cmpl-double v2, v31, v58

    if-ltz v2, :cond_6fe

    mul-double v10, v31, v29

    double-to-long v10, v10

    goto :goto_700

    :cond_6fe
    move-wide/from16 v10, v50

    .line 167
    :goto_700
    sget-object v2, Lax/d1/k;->j0:Ljava/util/regex/Pattern;

    move-wide/from16 v31, v10

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    invoke-static {v15, v2, v10, v11}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v62

    cmpl-double v2, v62, v58

    if-ltz v2, :cond_712

    mul-double v10, v62, v29

    double-to-long v10, v10

    goto :goto_714

    :cond_712
    move-wide/from16 v10, v50

    .line 168
    :goto_714
    sget-object v2, Lax/d1/k;->k0:Ljava/util/regex/Pattern;

    const/4 v12, 0x0

    invoke-static {v15, v2, v12}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v2

    .line 169
    sget-object v12, Lax/d1/k;->n0:Ljava/util/regex/Pattern;

    move/from16 v63, v2

    move-object/from16 v62, v3

    const-wide/16 v2, 0x1

    .line 170
    invoke-static {v15, v12, v2, v3}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v74

    cmpl-double v12, v74, v2

    if-eqz v12, :cond_72f

    mul-double v2, v74, v29

    double-to-long v2, v2

    goto :goto_731

    :cond_72f
    move-wide/from16 v2, v50

    .line 171
    :goto_731
    sget-object v12, Lax/d1/k;->o0:Ljava/util/regex/Pattern;

    move-wide/from16 v74, v2

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    invoke-static {v15, v12, v2, v3}, Lax/d1/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v2

    cmpl-double v12, v2, v58

    if-ltz v12, :cond_743

    mul-double v2, v2, v29

    double-to-long v2, v2

    goto :goto_745

    :cond_743
    move-wide/from16 v2, v50

    .line 172
    :goto_745
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v29, v2

    .line 173
    sget-object v2, Lax/d1/k;->p0:Ljava/util/regex/Pattern;

    invoke-static {v15, v2, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_787

    .line 174
    invoke-static {v2, v6}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 175
    array-length v3, v2

    move-object/from16 v58, v2

    const/4 v2, 0x0

    :goto_75c
    if-ge v2, v3, :cond_787

    aget-object v59, v58, v2

    move/from16 v60, v2

    .line 176
    invoke-virtual/range {v59 .. v59}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v59, v3

    const-string v3, "IN"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_77e

    const-string v3, "OUT"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_77e

    :goto_77b
    const/16 v22, 0x1

    goto :goto_782

    .line 178
    :cond_77e
    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_77b

    :goto_782
    add-int/lit8 v2, v60, 0x1

    move/from16 v3, v59

    goto :goto_75c

    .line 179
    :cond_787
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 180
    sget-object v3, Lax/d1/k;->q0:Ljava/util/regex/Pattern;

    .line 181
    invoke-static {v15, v3, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7c7

    .line 182
    invoke-static {v3, v6}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 183
    array-length v6, v3

    move-object/from16 v58, v3

    const/4 v3, 0x0

    :goto_79c
    if-ge v3, v6, :cond_7c7

    aget-object v59, v58, v3

    move/from16 v60, v3

    .line 184
    invoke-virtual/range {v59 .. v59}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v59, v6

    const-string v6, "JUMP"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7be

    const-string v6, "SKIP"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7be

    :goto_7bb
    const/16 v22, 0x1

    goto :goto_7c2

    .line 186
    :cond_7be
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7bb

    :goto_7c2
    add-int/lit8 v3, v60, 0x1

    move/from16 v6, v59

    goto :goto_79c

    :cond_7c7
    const/16 v22, 0x1

    .line 187
    sget-object v3, Lax/d1/k;->r0:Ljava/util/regex/Pattern;

    .line 188
    invoke-static {v15, v3, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7de

    .line 189
    const-string v6, "NO"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_7e0

    :cond_7de
    move-object/from16 v3, v86

    .line 190
    :goto_7e0
    sget-object v6, Lax/d1/k;->s0:Ljava/util/regex/Pattern;

    .line 191
    invoke-static {v15, v6, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v58, v3

    if-eqz v6, :cond_7fc

    .line 192
    const-string v3, "RANGE"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v59

    if-eqz v59, :cond_7f3

    goto :goto_7fe

    .line 193
    :cond_7f3
    const-string v3, "POINT"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7fc

    goto :goto_7fe

    :cond_7fc
    move-object/from16 v3, v86

    .line 194
    :goto_7fe
    sget-object v6, Lax/d1/k;->t0:Ljava/util/regex/Pattern;

    .line 195
    invoke-static {v15, v6, v5}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v59, v3

    if-eqz v6, :cond_81a

    .line 196
    const-string v3, "PRIMARY"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v60

    if-eqz v60, :cond_811

    goto :goto_81c

    .line 197
    :cond_811
    const-string v3, "HIGHLIGHT"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_81a

    goto :goto_81c

    :cond_81a
    move-object/from16 v3, v86

    .line 198
    :goto_81c
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v60, v3

    const/16 v3, 0x11

    .line 199
    invoke-virtual {v15, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 200
    sget-object v15, Lax/d1/k;->v0:Ljava/util/regex/Pattern;

    invoke-virtual {v15, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v15

    .line 201
    :goto_82f
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->find()Z

    move-result v61

    if-eqz v61, :cond_8e7

    move-object/from16 v61, v15

    .line 202
    invoke-virtual/range {v61 .. v61}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v15

    .line 203
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v78

    sparse-switch v78, :sswitch_data_b78

    move-object/from16 v78, v2

    :goto_847
    const/4 v2, -0x1

    goto/16 :goto_8c3

    :sswitch_84a
    move-object/from16 v78, v2

    const-string v2, "X-ASSET-URI="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_856

    goto/16 :goto_8c1

    :cond_856
    const/16 v2, 0x8

    goto/16 :goto_8c3

    :sswitch_85a
    move-object/from16 v78, v2

    const-string v2, "X-RESUME-OFFSET="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_866

    goto/16 :goto_8c1

    :cond_866
    const/4 v2, 0x7

    goto/16 :goto_8c3

    :sswitch_869
    move-object/from16 v78, v2

    const-string v2, "X-RESTRICT="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_874

    goto :goto_8c1

    :cond_874
    const/4 v2, 0x6

    goto :goto_8c3

    :sswitch_876
    move-object/from16 v78, v2

    const-string v2, "X-TIMELINE-OCCUPIES="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_881

    goto :goto_8c1

    :cond_881
    const/4 v2, 0x5

    goto :goto_8c3

    :sswitch_883
    move-object/from16 v78, v2

    const-string v2, "X-ASSET-LIST="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_88e

    goto :goto_8c1

    :cond_88e
    const/4 v2, 0x4

    goto :goto_8c3

    :sswitch_890
    move-object/from16 v78, v2

    const-string v2, "X-TIMELINE-STYLE="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_89b

    goto :goto_8c1

    :cond_89b
    const/4 v2, 0x3

    goto :goto_8c3

    :sswitch_89d
    move-object/from16 v78, v2

    const-string v2, "X-PLAYOUT-LIMIT="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8a8

    goto :goto_8c1

    :cond_8a8
    const/4 v2, 0x2

    goto :goto_8c3

    :sswitch_8aa
    move-object/from16 v78, v2

    const-string v2, "X-CONTENT-MAY-VARY="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8b5

    goto :goto_8c1

    :cond_8b5
    const/4 v2, 0x1

    goto :goto_8c3

    :sswitch_8b7
    move-object/from16 v78, v2

    const-string v2, "X-SNAP="

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8c2

    :goto_8c1
    goto :goto_847

    :cond_8c2
    const/4 v2, 0x0

    :goto_8c3
    packed-switch v2, :pswitch_data_b9e

    .line 204
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v22, 0x1

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v79, v12

    const/4 v12, 0x0

    invoke-virtual {v15, v12, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 205
    invoke-static {v3, v2, v5}, Lax/d1/k;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lax/d1/f$b;

    move-result-object v2

    .line 206
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8df

    :pswitch_8dd
    move-object/from16 v79, v12

    :goto_8df
    move-object/from16 v15, v61

    move-object/from16 v2, v78

    move-object/from16 v12, v79

    goto/16 :goto_82f

    :cond_8e7
    move-object/from16 v78, v2

    move-object/from16 v79, v12

    move-object/from16 v2, v17

    .line 207
    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8fa

    .line 208
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lax/d1/f$c$a;

    goto :goto_8ff

    .line 209
    :cond_8fa
    new-instance v3, Lax/d1/f$c$a;

    invoke-direct {v3, v0}, Lax/d1/f$c$a;-><init>(Ljava/lang/String;)V

    .line 210
    :goto_8ff
    invoke-virtual {v3, v1}, Lax/d1/f$c$a;->c(Landroid/net/Uri;)Lax/d1/f$c$a;

    move-result-object v1

    .line 211
    invoke-virtual {v1, v4}, Lax/d1/f$c$a;->b(Landroid/net/Uri;)Lax/d1/f$c$a;

    move-result-object v1

    .line 212
    invoke-virtual {v1, v13, v14}, Lax/d1/f$c$a;->o(J)Lax/d1/f$c$a;

    move-result-object v1

    .line 213
    invoke-virtual {v1, v8, v9}, Lax/d1/f$c$a;->h(J)Lax/d1/f$c$a;

    move-result-object v1

    move-wide/from16 v3, v31

    .line 214
    invoke-virtual {v1, v3, v4}, Lax/d1/f$c$a;->g(J)Lax/d1/f$c$a;

    move-result-object v1

    .line 215
    invoke-virtual {v1, v10, v11}, Lax/d1/f$c$a;->j(J)Lax/d1/f$c$a;

    move-result-object v1

    .line 216
    invoke-virtual {v1, v7}, Lax/d1/f$c$a;->f(Ljava/util/List;)Lax/d1/f$c$a;

    move-result-object v1

    move/from16 v3, v63

    .line 217
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->i(Z)Lax/d1/f$c$a;

    move-result-object v1

    move-wide/from16 v3, v74

    .line 218
    invoke-virtual {v1, v3, v4}, Lax/d1/f$c$a;->m(J)Lax/d1/f$c$a;

    move-result-object v1

    move-wide/from16 v3, v29

    .line 219
    invoke-virtual {v1, v3, v4}, Lax/d1/f$c$a;->k(J)Lax/d1/f$c$a;

    move-result-object v1

    move-object/from16 v3, v79

    .line 220
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->n(Ljava/util/List;)Lax/d1/f$c$a;

    move-result-object v1

    move-object/from16 v3, v78

    .line 221
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->l(Ljava/util/List;)Lax/d1/f$c$a;

    move-result-object v1

    .line 222
    invoke-virtual {v1, v6}, Lax/d1/f$c$a;->d(Ljava/util/List;)Lax/d1/f$c$a;

    move-result-object v1

    move-object/from16 v3, v58

    .line 223
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->e(Ljava/lang/Boolean;)Lax/d1/f$c$a;

    move-result-object v1

    move-object/from16 v3, v59

    .line 224
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->p(Ljava/lang/String;)Lax/d1/f$c$a;

    move-result-object v1

    move-object/from16 v3, v60

    .line 225
    invoke-virtual {v1, v3}, Lax/d1/f$c$a;->q(Ljava/lang/String;)Lax/d1/f$c$a;

    move-result-object v1

    .line 226
    invoke-virtual {v2, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v4, v33

    :cond_956
    move-object/from16 v8, v34

    move-wide/from16 v11, v35

    move-wide/from16 v33, v37

    move-object/from16 v29, v39

    move-object/from16 v10, v62

    move-object/from16 v0, v70

    move-object/from16 v9, v71

    move-object/from16 v1, v72

    move-object/from16 v3, v73

    move-wide/from16 v30, v81

    const/4 v15, 0x0

    goto/16 :goto_408

    :cond_96d
    :goto_96d
    move-object/from16 v71, v2

    move-object/from16 v73, v3

    move/from16 v33, v4

    move-object/from16 v72, v6

    move-object/from16 v70, v7

    move-object/from16 v34, v8

    move-object/from16 v69, v9

    move-object/from16 v62, v10

    move-wide/from16 v35, v11

    move-object/from16 v68, v13

    move-object/from16 v67, v14

    move-object/from16 v2, v17

    goto :goto_989

    :cond_986
    move-object/from16 v66, v1

    goto :goto_96d

    .line 227
    :goto_989
    const-string v0, "#"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    move/from16 v4, v33

    if-nez v0, :cond_956

    move-object/from16 v30, v34

    move-wide/from16 v11, v35

    move-wide/from16 v33, v37

    move-object/from16 v10, v62

    move-object/from16 v3, v73

    .line 228
    invoke-static {v11, v12, v10, v3}, Lax/d1/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    add-long v78, v11, v31

    .line 229
    invoke-static {v15, v5}, Lax/d1/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v72

    .line 230
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lax/d1/f$f;

    const-wide/16 v76, -0x1

    cmp-long v7, v40, v76

    if-nez v7, :cond_9ba

    move-object/from16 v60, v6

    move-wide/from16 v26, v44

    goto :goto_9dd

    :cond_9ba
    if-eqz v80, :cond_9d7

    if-nez v66, :cond_9d7

    if-nez v6, :cond_9d7

    .line 231
    new-instance v58, Lax/d1/f$f;

    const/16 v64, 0x0

    const/16 v65, 0x0

    const-wide/16 v60, 0x0

    move-object/from16 v59, v0

    move-wide/from16 v62, v26

    invoke-direct/range {v58 .. v65}, Lax/d1/f$f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v58

    .line 232
    invoke-virtual {v1, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v60, v6

    goto :goto_9dd

    :cond_9d7
    move-wide/from16 v62, v26

    move-object/from16 v60, v6

    move-wide/from16 v26, v62

    :goto_9dd
    if-nez v43, :cond_a0b

    .line 233
    invoke-virtual/range {v68 .. v68}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_a0b

    .line 234
    invoke-virtual/range {v68 .. v68}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v6

    const/4 v15, 0x0

    new-array v8, v15, [Lax/P0/o$b;

    invoke-interface {v6, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lax/P0/o$b;

    .line 235
    new-instance v8, Lax/P0/o;

    move-object/from16 v9, v71

    invoke-direct {v8, v9, v6}, Lax/P0/o;-><init>(Ljava/lang/String;[Lax/P0/o$b;)V

    if-nez v28, :cond_a06

    .line 236
    invoke-static {v9, v6}, Lax/d1/k;->d(Ljava/lang/String;[Lax/P0/o$b;)Lax/P0/o;

    move-result-object v6

    move-object/from16 v35, v8

    :goto_a01
    move-object/from16 v29, v39

    :goto_a03
    move-wide/from16 v38, v26

    goto :goto_a15

    :cond_a06
    move-object/from16 v35, v8

    move-object/from16 v6, v28

    goto :goto_a01

    :cond_a0b
    move-object/from16 v9, v71

    const/4 v15, 0x0

    move-object/from16 v6, v28

    move-object/from16 v29, v39

    move-object/from16 v35, v43

    goto :goto_a03

    .line 237
    :goto_a15
    new-instance v26, Lax/d1/f$f;

    if-eqz v66, :cond_a26

    move-object/from16 v28, v66

    :goto_a1b
    move-object/from16 v27, v0

    move/from16 v32, v4

    move-object/from16 v36, v10

    move-object/from16 v43, v30

    move-wide/from16 v30, v81

    goto :goto_a29

    :cond_a26
    move-object/from16 v28, v60

    goto :goto_a1b

    .line 238
    :goto_a29
    invoke-direct/range {v26 .. v43}, Lax/d1/f$f;-><init>(Ljava/lang/String;Lax/d1/f$f;Ljava/lang/String;JIJLax/P0/o;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object/from16 v8, v26

    move/from16 v4, v32

    move-object/from16 v10, v36

    move-object/from16 v0, v70

    .line 239
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v64, v33, v30

    .line 240
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-eqz v7, :cond_a43

    add-long v26, v38, v40

    goto :goto_a45

    :cond_a43
    move-wide/from16 v26, v38

    :goto_a45
    move-object v7, v0

    move-object v11, v2

    move-object/from16 v36, v3

    move/from16 v63, v4

    move-object/from16 v28, v6

    move-object v2, v9

    move-object/from16 v3, v35

    move-wide/from16 v81, v44

    move-wide/from16 v37, v64

    move-object/from16 v60, v66

    move-object/from16 v17, v67

    move-object/from16 v39, v17

    move-object/from16 v13, v68

    move-object/from16 v9, v69

    move-object/from16 v12, v89

    move-object/from16 v4, v90

    const-wide/16 v40, -0x1

    const/16 v42, 0x0

    const-wide/16 v76, -0x1

    move-object/from16 v0, p0

    move-object v6, v1

    move-object/from16 v67, v10

    move-object/from16 v10, v88

    move-object/from16 v1, p1

    goto/16 :goto_93

    :goto_a73
    move-object v7, v0

    move-object v6, v1

    move-object/from16 v36, v3

    move-wide/from16 v78, v11

    move-object/from16 v39, v29

    move-wide/from16 v81, v30

    move-wide/from16 v37, v33

    move-object/from16 v3, v43

    move-wide/from16 v26, v62

    move-object/from16 v60, v66

    move-object/from16 v17, v67

    move-object/from16 v13, v68

    move-object/from16 v12, v89

    const-wide/16 v76, -0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v11, v2

    move/from16 v63, v4

    move-object v2, v9

    move-object/from16 v67, v10

    move-object/from16 v9, v69

    move-object/from16 v10, v88

    move-object/from16 v4, v90

    goto/16 :goto_93

    :cond_a9f
    move-object/from16 v90, v4

    move-object v0, v7

    move-object/from16 v69, v9

    move-object/from16 v88, v10

    move-object v2, v11

    move-object/from16 v89, v12

    const/4 v15, 0x0

    .line 241
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x0

    .line 242
    :goto_ab0
    invoke-interface/range {v69 .. v69}, Ljava/util/List;->size()I

    move-result v3

    if-ge v4, v3, :cond_b06

    move-object/from16 v3, v69

    .line 243
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lax/d1/f$e;

    .line 244
    iget-wide v6, v5, Lax/d1/f$e;->b:J

    const-wide/16 v76, -0x1

    cmp-long v9, v6, v76

    if-nez v9, :cond_ad3

    .line 245
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    int-to-long v6, v6

    add-long v6, v18, v6

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    int-to-long v9, v9

    sub-long/2addr v6, v9

    .line 246
    :cond_ad3
    iget v9, v5, Lax/d1/f$e;->c:I

    const/4 v11, -0x1

    if-ne v9, v11, :cond_af5

    cmp-long v10, v23, v50

    if-eqz v10, :cond_af5

    .line 247
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_aeb

    invoke-static {v0}, Lax/r7/F;->e(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lax/d1/f$f;

    iget-object v9, v9, Lax/d1/f$f;->n0:Ljava/util/List;

    goto :goto_aec

    :cond_aeb
    move-object v9, v8

    .line 248
    :goto_aec
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    const/16 v22, 0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_af7

    :cond_af5
    const/16 v22, 0x1

    .line 249
    :goto_af7
    iget-object v5, v5, Lax/d1/f$e;->a:Landroid/net/Uri;

    new-instance v10, Lax/d1/f$e;

    invoke-direct {v10, v5, v6, v7, v9}, Lax/d1/f$e;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v1, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v69, v3

    goto :goto_ab0

    :cond_b06
    const/16 v22, 0x1

    if-eqz v90, :cond_b0f

    move-object/from16 v12, v90

    .line 250
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    :cond_b0f
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 252
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b1c
    :goto_b1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b32

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lax/d1/f$c$a;

    .line 253
    invoke-virtual {v4}, Lax/d1/f$c$a;->a()Lax/d1/f$c;

    move-result-object v4

    if-eqz v4, :cond_b1c

    .line 254
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b1c

    .line 255
    :cond_b32
    new-instance v7, Lax/d1/f;

    cmp-long v2, v56, v44

    if-eqz v2, :cond_b59

    const/16 v27, 0x1

    :goto_b3a
    move-object/from16 v9, p3

    move-object/from16 v29, v0

    move-object/from16 v32, v1

    move-object/from16 v33, v3

    move-object/from16 v30, v8

    move/from16 v26, v21

    move/from16 v13, v46

    move/from16 v8, v47

    move-wide/from16 v11, v48

    move-wide/from16 v21, v52

    move/from16 v16, v54

    move/from16 v17, v55

    move-wide/from16 v14, v56

    move-object/from16 v10, v88

    move-object/from16 v31, v89

    goto :goto_b5c

    :cond_b59
    const/16 v27, 0x0

    goto :goto_b3a

    :goto_b5c
    invoke-direct/range {v7 .. v33}, Lax/d1/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLax/P0/o;Ljava/util/List;Ljava/util/List;Lax/d1/f$h;Ljava/util/Map;Ljava/util/List;)V

    return-object v7

    :sswitch_data_b60
    .sparse-switch
        0x13683 -> :sswitch_6cc
        0x251681 -> :sswitch_6bf
        0x2590a0 -> :sswitch_6b2
    .end sparse-switch

    :pswitch_data_b6e
    .packed-switch 0x0
        :pswitch_6de
        :pswitch_6de
        :pswitch_6de
    .end packed-switch

    :sswitch_data_b78
    .sparse-switch
        -0x7f5b7c02 -> :sswitch_8b7
        -0x6ddab8e6 -> :sswitch_8aa
        -0x8e0f436 -> :sswitch_89d
        -0x22a979d -> :sswitch_890
        0x17ad642d -> :sswitch_883
        0x32acec39 -> :sswitch_876
        0x57c501cc -> :sswitch_869
        0x6837ce7f -> :sswitch_85a
        0x6c2295e3 -> :sswitch_84a
    .end sparse-switch

    :pswitch_data_b9e
    .packed-switch 0x0
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
        :pswitch_8dd
    .end packed-switch
.end method

.method private static r(Lax/d1/k$b;Ljava/lang/String;)Lax/d1/i;
    .registers 38
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v5, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v11, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v6, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v7, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v8, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v9, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v10, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v12, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v13, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v14, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    move-object/from16 v17, v10

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    :goto_39
    invoke-virtual/range {p0 .. p0}, Lax/d1/k$b;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v18

    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const-string v15, "application/x-mpegURL"

    .line 65
    .line 66
    const-string v0, "/"

    .line 67
    .line 68
    if-eqz v18, :cond_24c

    .line 69
    .line 70
    invoke-virtual/range {p0 .. p0}, Lax/d1/k$b;->b()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v2, "#EXT"

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_54

    .line 81
    .line 82
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_54
    const-string v2, "#EXT-X-I-FRAME-STREAM-INF"

    .line 86
    .line 87
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const-string v4, "#EXT-X-DEFINE"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_72

    .line 98
    .line 99
    sget-object v0, Lax/d1/k;->S:Ljava/util/regex/Pattern;

    .line 100
    .line 101
    invoke-static {v3, v0, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v2, Lax/d1/k;->c0:Ljava/util/regex/Pattern;

    .line 106
    .line 107
    invoke-static {v3, v2, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v11, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_ce

    .line 115
    :cond_72
    const-string v4, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_89

    .line 122
    .line 123
    move-object/from16 v34, v7

    .line 124
    .line 125
    move-object/from16 v33, v8

    .line 126
    .line 127
    move-object/from16 v32, v9

    .line 128
    .line 129
    move-object/from16 v35, v12

    .line 130
    .line 131
    move-object/from16 v30, v13

    .line 132
    .line 133
    move-object/from16 v31, v14

    .line 134
    .line 135
    const/4 v10, 0x1

    .line 136
    goto/16 :goto_236

    .line 137
    .line 138
    :cond_89
    const-string v4, "#EXT-X-MEDIA"

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_95

    .line 145
    .line 146
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_ce

    .line 150
    :cond_95
    const-string v4, "#EXT-X-SESSION-KEY"

    .line 151
    .line 152
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_c3

    .line 157
    .line 158
    sget-object v0, Lax/d1/k;->L:Ljava/util/regex/Pattern;

    .line 159
    .line 160
    const-string v2, "identity"

    .line 161
    .line 162
    invoke-static {v3, v0, v2, v11}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v3, v0, v11}, Lax/d1/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lax/P0/o$b;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-eqz v0, :cond_ce

    .line 171
    .line 172
    sget-object v2, Lax/d1/k;->K:Ljava/util/regex/Pattern;

    .line 173
    .line 174
    invoke-static {v3, v2, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {v2}, Lax/d1/k;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    new-instance v3, Lax/P0/o;

    .line 183
    .line 184
    const/4 v4, 0x1

    .line 185
    new-array v15, v4, [Lax/P0/o$b;

    .line 186
    .line 187
    aput-object v0, v15, v19

    .line 188
    .line 189
    invoke-direct {v3, v2, v15}, Lax/P0/o;-><init>(Ljava/lang/String;[Lax/P0/o$b;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_ce

    .line 196
    :cond_c3
    const-string v4, "#EXT-X-STREAM-INF"

    .line 197
    .line 198
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-nez v4, :cond_dc

    .line 203
    .line 204
    if-eqz v2, :cond_ce

    .line 205
    .line 206
    goto :goto_dc

    .line 207
    :cond_ce
    :goto_ce
    move-object/from16 v34, v7

    .line 208
    .line 209
    move-object/from16 v33, v8

    .line 210
    .line 211
    move-object/from16 v32, v9

    .line 212
    .line 213
    move-object/from16 v35, v12

    .line 214
    .line 215
    move-object/from16 v30, v13

    .line 216
    .line 217
    move-object/from16 v31, v14

    .line 218
    .line 219
    goto/16 :goto_236

    .line 220
    .line 221
    :cond_dc
    :goto_dc
    const-string v4, "CLOSED-CAPTIONS=NONE"

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    or-int v16, v16, v4

    .line 228
    .line 229
    if-eqz v2, :cond_eb

    .line 230
    .line 231
    const/16 v4, 0x4000

    .line 232
    .line 233
    :goto_e8
    move/from16 v21, v2

    .line 234
    .line 235
    goto :goto_ed

    .line 236
    :cond_eb
    const/4 v4, 0x0

    .line 237
    goto :goto_e8

    .line 238
    :goto_ed
    sget-object v2, Lax/d1/k;->h:Ljava/util/regex/Pattern;

    .line 239
    .line 240
    invoke-static {v3, v2}, Lax/d1/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    move/from16 v29, v10

    .line 245
    .line 246
    sget-object v10, Lax/d1/k;->c:Ljava/util/regex/Pattern;

    .line 247
    .line 248
    move-object/from16 v30, v13

    .line 249
    .line 250
    const/4 v13, -0x1

    .line 251
    invoke-static {v3, v10, v13}, Lax/d1/k;->u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    sget-object v13, Lax/d1/k;->j:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    invoke-static {v3, v13, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    move-object/from16 v31, v14

    .line 262
    .line 263
    sget-object v14, Lax/d1/k;->k:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    invoke-static {v3, v14, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    move-object/from16 v32, v9

    .line 270
    .line 271
    sget-object v9, Lax/d1/k;->l:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    invoke-static {v3, v9, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    move-object/from16 v33, v8

    .line 278
    .line 279
    const-string v8, ","

    .line 280
    .line 281
    if-eqz v9, :cond_141

    .line 282
    .line 283
    invoke-static {v9, v8}, Lax/S0/d0;->y1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    aget-object v9, v9, v19

    .line 288
    .line 289
    invoke-static {v9, v0}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    aget-object v9, v0, v19

    .line 294
    .line 295
    move-object/from16 v22, v9

    .line 296
    .line 297
    array-length v9, v0

    .line 298
    move-object/from16 v23, v0

    .line 299
    .line 300
    const/4 v0, 0x1

    .line 301
    if-le v9, v0, :cond_138

    .line 302
    .line 303
    aget-object v9, v23, v0

    .line 304
    .line 305
    move-object/from16 v34, v7

    .line 306
    .line 307
    move-object/from16 v35, v12

    .line 308
    .line 309
    move-object/from16 v0, v22

    .line 310
    .line 311
    const/4 v7, 0x2

    .line 312
    goto :goto_147

    .line 313
    :cond_138
    move-object/from16 v34, v7

    .line 314
    .line 315
    move-object/from16 v35, v12

    .line 316
    .line 317
    move-object/from16 v0, v22

    .line 318
    .line 319
    :goto_13e
    const/4 v7, 0x2

    .line 320
    const/4 v9, 0x0

    .line 321
    goto :goto_147

    .line 322
    :cond_141
    move-object/from16 v34, v7

    .line 323
    .line 324
    move-object/from16 v35, v12

    .line 325
    .line 326
    const/4 v0, 0x0

    .line 327
    goto :goto_13e

    .line 328
    :goto_147
    invoke-static {v14, v7}, Lax/S0/d0;->S(Ljava/lang/String;I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    invoke-static {v13, v12, v0, v9}, Lax/d1/k;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-eqz v9, :cond_16e

    .line 337
    .line 338
    if-eqz v0, :cond_154

    .line 339
    .line 340
    goto :goto_155

    .line 341
    :cond_154
    move-object v0, v12

    .line 342
    :goto_155
    invoke-static {v14, v7}, Lax/S0/d0;->T(Ljava/lang/String;I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    if-eqz v9, :cond_16d

    .line 347
    .line 348
    new-instance v7, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :cond_16d
    move-object v14, v0

    .line 367
    :cond_16e
    sget-object v0, Lax/d1/k;->m:Ljava/util/regex/Pattern;

    .line 368
    .line 369
    invoke-static {v3, v0, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-eqz v0, :cond_18e

    .line 374
    .line 375
    const-string v7, "x"

    .line 376
    .line 377
    invoke-static {v0, v7}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    aget-object v7, v0, v19

    .line 382
    .line 383
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    const/16 v20, 0x1

    .line 388
    .line 389
    aget-object v0, v0, v20

    .line 390
    .line 391
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-lez v7, :cond_18e

    .line 396
    .line 397
    if-gtz v0, :cond_190

    .line 398
    .line 399
    :cond_18e
    const/4 v0, -0x1

    .line 400
    const/4 v7, -0x1

    .line 401
    :cond_190
    sget-object v8, Lax/d1/k;->n:Ljava/util/regex/Pattern;

    .line 402
    .line 403
    invoke-static {v3, v8, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    if-eqz v8, :cond_19d

    .line 408
    .line 409
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 410
    .line 411
    .line 412
    move-result v8

    .line 413
    goto :goto_19f

    .line 414
    :cond_19d
    const/high16 v8, -0x40800000    # -1.0f

    .line 415
    .line 416
    :goto_19f
    sget-object v9, Lax/d1/k;->d:Ljava/util/regex/Pattern;

    .line 417
    .line 418
    invoke-static {v3, v9, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v25

    .line 422
    sget-object v9, Lax/d1/k;->e:Ljava/util/regex/Pattern;

    .line 423
    .line 424
    invoke-static {v3, v9, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v26

    .line 428
    sget-object v9, Lax/d1/k;->f:Ljava/util/regex/Pattern;

    .line 429
    .line 430
    invoke-static {v3, v9, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v27

    .line 434
    sget-object v9, Lax/d1/k;->g:Ljava/util/regex/Pattern;

    .line 435
    .line 436
    invoke-static {v3, v9, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v28

    .line 440
    if-eqz v21, :cond_1c6

    .line 441
    .line 442
    sget-object v9, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    .line 443
    .line 444
    invoke-static {v3, v9, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-static {v1, v3}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    :goto_1c3
    move-object/from16 v23, v3

    .line 453
    .line 454
    goto :goto_1d9

    .line 455
    :cond_1c6
    invoke-virtual/range {p0 .. p0}, Lax/d1/k$b;->a()Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_244

    .line 460
    .line 461
    invoke-virtual/range {p0 .. p0}, Lax/d1/k$b;->b()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-static {v3, v11}, Lax/d1/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-static {v1, v3}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    goto :goto_1c3

    .line 474
    :goto_1d9
    new-instance v3, Lax/P0/v$b;

    .line 475
    .line 476
    invoke-direct {v3}, Lax/P0/v$b;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    invoke-virtual {v3, v9}, Lax/P0/v$b;->i0(I)Lax/P0/v$b;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-virtual {v3, v15}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-virtual {v3, v14}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v3, v10}, Lax/P0/v$b;->S(I)Lax/P0/v$b;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    invoke-virtual {v3, v2}, Lax/P0/v$b;->t0(I)Lax/P0/v$b;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    invoke-virtual {v3, v7}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    invoke-virtual {v3, v0}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0, v8}, Lax/P0/v$b;->f0(F)Lax/P0/v$b;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0, v4}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 520
    .line 521
    .line 522
    move-result-object v24

    .line 523
    new-instance v22, Lax/d1/i$b;

    .line 524
    .line 525
    invoke-direct/range {v22 .. v28}, Lax/d1/i$b;-><init>(Landroid/net/Uri;Lax/P0/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v0, v22

    .line 529
    .line 530
    move-object/from16 v3, v23

    .line 531
    .line 532
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    check-cast v0, Ljava/util/ArrayList;

    .line 540
    .line 541
    if-nez v0, :cond_226

    .line 542
    .line 543
    new-instance v0, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v5, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    :cond_226
    new-instance v22, Lax/c1/h$a;

    .line 552
    .line 553
    move/from16 v24, v2

    .line 554
    .line 555
    move/from16 v23, v10

    .line 556
    .line 557
    invoke-direct/range {v22 .. v28}, Lax/c1/h$a;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    move-object/from16 v2, v22

    .line 561
    .line 562
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move/from16 v10, v29

    .line 566
    .line 567
    :goto_236
    move-object/from16 v13, v30

    .line 568
    .line 569
    move-object/from16 v14, v31

    .line 570
    .line 571
    move-object/from16 v9, v32

    .line 572
    .line 573
    move-object/from16 v8, v33

    .line 574
    .line 575
    move-object/from16 v7, v34

    .line 576
    .line 577
    move-object/from16 v12, v35

    .line 578
    .line 579
    goto/16 :goto_39

    .line 580
    .line 581
    :cond_244
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 582
    .line 583
    const/4 v1, 0x0

    .line 584
    invoke-static {v0, v1}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    throw v0

    .line 589
    :cond_24c
    move-object/from16 v34, v7

    .line 590
    .line 591
    move-object/from16 v33, v8

    .line 592
    .line 593
    move-object/from16 v32, v9

    .line 594
    .line 595
    move/from16 v29, v10

    .line 596
    .line 597
    move-object/from16 v35, v12

    .line 598
    .line 599
    move-object/from16 v30, v13

    .line 600
    .line 601
    move-object/from16 v31, v14

    .line 602
    .line 603
    new-instance v3, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 606
    .line 607
    .line 608
    new-instance v2, Ljava/util/HashSet;

    .line 609
    .line 610
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 611
    .line 612
    .line 613
    const/4 v4, 0x0

    .line 614
    :goto_265
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    if-ge v4, v7, :cond_2bd

    .line 619
    .line 620
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    check-cast v7, Lax/d1/i$b;

    .line 625
    .line 626
    iget-object v8, v7, Lax/d1/i$b;->a:Landroid/net/Uri;

    .line 627
    .line 628
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v8

    .line 632
    if-eqz v8, :cond_2b9

    .line 633
    .line 634
    iget-object v8, v7, Lax/d1/i$b;->b:Lax/P0/v;

    .line 635
    .line 636
    iget-object v8, v8, Lax/P0/v;->l:Lax/P0/C;

    .line 637
    .line 638
    if-nez v8, :cond_281

    .line 639
    .line 640
    const/4 v8, 0x1

    .line 641
    goto :goto_282

    .line 642
    :cond_281
    const/4 v8, 0x0

    .line 643
    :goto_282
    invoke-static {v8}, Lax/S0/a;->g(Z)V

    .line 644
    .line 645
    .line 646
    new-instance v8, Lax/c1/h;

    .line 647
    .line 648
    iget-object v9, v7, Lax/d1/i$b;->a:Landroid/net/Uri;

    .line 649
    .line 650
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v9

    .line 654
    check-cast v9, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-static {v9}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    check-cast v9, Ljava/util/List;

    .line 661
    .line 662
    const/4 v10, 0x0

    .line 663
    invoke-direct {v8, v10, v10, v9}, Lax/c1/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 664
    .line 665
    .line 666
    new-instance v9, Lax/P0/C;

    .line 667
    .line 668
    const/4 v12, 0x1

    .line 669
    new-array v13, v12, [Lax/P0/C$a;

    .line 670
    .line 671
    aput-object v8, v13, v19

    .line 672
    .line 673
    invoke-direct {v9, v13}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 674
    .line 675
    .line 676
    iget-object v8, v7, Lax/d1/i$b;->b:Lax/P0/v;

    .line 677
    .line 678
    invoke-virtual {v8}, Lax/P0/v;->b()Lax/P0/v$b;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    invoke-virtual {v8, v9}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    invoke-virtual {v8}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-virtual {v7, v8}, Lax/d1/i$b;->a(Lax/P0/v;)Lax/d1/i$b;

    .line 691
    .line 692
    .line 693
    move-result-object v7

    .line 694
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    goto :goto_2bb

    .line 698
    :cond_2b9
    const/4 v10, 0x0

    .line 699
    const/4 v12, 0x1

    .line 700
    :goto_2bb
    add-int/2addr v4, v12

    .line 701
    goto :goto_265

    .line 702
    :cond_2bd
    const/4 v10, 0x0

    .line 703
    move-object v2, v10

    .line 704
    move-object v8, v2

    .line 705
    const/4 v4, 0x0

    .line 706
    :goto_2c1
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    if-ge v4, v5, :cond_4d3

    .line 711
    .line 712
    move-object/from16 v5, v35

    .line 713
    .line 714
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    check-cast v7, Ljava/lang/String;

    .line 719
    .line 720
    sget-object v9, Lax/d1/k;->T:Ljava/util/regex/Pattern;

    .line 721
    .line 722
    invoke-static {v7, v9, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    sget-object v12, Lax/d1/k;->S:Ljava/util/regex/Pattern;

    .line 727
    .line 728
    invoke-static {v7, v12, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v12

    .line 732
    new-instance v13, Lax/P0/v$b;

    .line 733
    .line 734
    invoke-direct {v13}, Lax/P0/v$b;-><init>()V

    .line 735
    .line 736
    .line 737
    new-instance v14, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    const-string v10, ":"

    .line 746
    .line 747
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v10

    .line 757
    invoke-virtual {v13, v10}, Lax/P0/v$b;->j0(Ljava/lang/String;)Lax/P0/v$b;

    .line 758
    .line 759
    .line 760
    move-result-object v10

    .line 761
    invoke-virtual {v10, v12}, Lax/P0/v$b;->l0(Ljava/lang/String;)Lax/P0/v$b;

    .line 762
    .line 763
    .line 764
    move-result-object v10

    .line 765
    invoke-virtual {v10, v15}, Lax/P0/v$b;->W(Ljava/lang/String;)Lax/P0/v$b;

    .line 766
    .line 767
    .line 768
    move-result-object v10

    .line 769
    invoke-static {v7}, Lax/d1/k;->z(Ljava/lang/String;)I

    .line 770
    .line 771
    .line 772
    move-result v13

    .line 773
    invoke-virtual {v10, v13}, Lax/P0/v$b;->A0(I)Lax/P0/v$b;

    .line 774
    .line 775
    .line 776
    move-result-object v10

    .line 777
    invoke-static {v7, v11}, Lax/d1/k;->y(Ljava/lang/String;Ljava/util/Map;)I

    .line 778
    .line 779
    .line 780
    move-result v13

    .line 781
    invoke-virtual {v10, v13}, Lax/P0/v$b;->w0(I)Lax/P0/v$b;

    .line 782
    .line 783
    .line 784
    move-result-object v10

    .line 785
    sget-object v13, Lax/d1/k;->R:Ljava/util/regex/Pattern;

    .line 786
    .line 787
    invoke-static {v7, v13, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v13

    .line 791
    invoke-virtual {v10, v13}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 792
    .line 793
    .line 794
    move-result-object v10

    .line 795
    sget-object v13, Lax/d1/k;->N:Ljava/util/regex/Pattern;

    .line 796
    .line 797
    invoke-static {v7, v13, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v13

    .line 801
    if-nez v13, :cond_324

    .line 802
    .line 803
    const/4 v13, 0x0

    .line 804
    goto :goto_328

    .line 805
    :cond_324
    invoke-static {v1, v13}, Lax/S0/O;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 806
    .line 807
    .line 808
    move-result-object v13

    .line 809
    :goto_328
    new-instance v14, Lax/P0/C;

    .line 810
    .line 811
    new-instance v1, Lax/c1/h;

    .line 812
    .line 813
    move-object/from16 p0, v2

    .line 814
    .line 815
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 816
    .line 817
    invoke-direct {v1, v9, v12, v2}, Lax/c1/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 818
    .line 819
    .line 820
    move-object/from16 v21, v1

    .line 821
    .line 822
    const/4 v2, 0x1

    .line 823
    new-array v1, v2, [Lax/P0/C$a;

    .line 824
    .line 825
    aput-object v21, v1, v19

    .line 826
    .line 827
    invoke-direct {v14, v1}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    .line 828
    .line 829
    .line 830
    sget-object v1, Lax/d1/k;->P:Ljava/util/regex/Pattern;

    .line 831
    .line 832
    invoke-static {v7, v1, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    sparse-switch v2, :sswitch_data_4f6

    .line 844
    .line 845
    .line 846
    :goto_34d
    const/4 v1, -0x1

    .line 847
    goto :goto_37a

    .line 848
    :sswitch_34f
    const-string v2, "VIDEO"

    .line 849
    .line 850
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    if-nez v1, :cond_358

    .line 855
    .line 856
    goto :goto_34d

    .line 857
    :cond_358
    const/4 v1, 0x3

    .line 858
    goto :goto_37a

    .line 859
    :sswitch_35a
    const-string v2, "AUDIO"

    .line 860
    .line 861
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v1

    .line 865
    if-nez v1, :cond_363

    .line 866
    .line 867
    goto :goto_34d

    .line 868
    :cond_363
    const/4 v1, 0x2

    .line 869
    goto :goto_37a

    .line 870
    :sswitch_365
    const-string v2, "CLOSED-CAPTIONS"

    .line 871
    .line 872
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    if-nez v1, :cond_36e

    .line 877
    .line 878
    goto :goto_34d

    .line 879
    :cond_36e
    const/4 v1, 0x1

    .line 880
    goto :goto_37a

    .line 881
    :sswitch_370
    const-string v2, "SUBTITLES"

    .line 882
    .line 883
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-nez v1, :cond_379

    .line 888
    .line 889
    goto :goto_34d

    .line 890
    :cond_379
    const/4 v1, 0x0

    .line 891
    :goto_37a
    packed-switch v1, :pswitch_data_508

    .line 892
    .line 893
    .line 894
    :goto_37d
    move-object/from16 v9, v32

    .line 895
    .line 896
    move-object/from16 v2, v33

    .line 897
    .line 898
    :goto_381
    const/4 v7, 0x3

    .line 899
    goto/16 :goto_4c1

    .line 900
    .line 901
    :pswitch_384
    invoke-static {v6, v9}, Lax/d1/k;->h(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    if-eqz v1, :cond_3b0

    .line 906
    .line 907
    iget-object v1, v1, Lax/d1/i$b;->b:Lax/P0/v;

    .line 908
    .line 909
    iget-object v2, v1, Lax/P0/v;->k:Ljava/lang/String;

    .line 910
    .line 911
    const/4 v7, 0x2

    .line 912
    invoke-static {v2, v7}, Lax/S0/d0;->S(Ljava/lang/String;I)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-virtual {v10, v2}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 917
    .line 918
    .line 919
    move-result-object v7

    .line 920
    invoke-static {v2}, Lax/P0/D;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-virtual {v7, v2}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    iget v7, v1, Lax/P0/v;->v:I

    .line 929
    .line 930
    invoke-virtual {v2, v7}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    iget v7, v1, Lax/P0/v;->w:I

    .line 935
    .line 936
    invoke-virtual {v2, v7}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    iget v1, v1, Lax/P0/v;->z:F

    .line 941
    .line 942
    invoke-virtual {v2, v1}, Lax/P0/v$b;->f0(F)Lax/P0/v$b;

    .line 943
    .line 944
    .line 945
    :cond_3b0
    if-nez v13, :cond_3b3

    .line 946
    .line 947
    goto :goto_37d

    .line 948
    :cond_3b3
    invoke-virtual {v10, v14}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 949
    .line 950
    .line 951
    new-instance v1, Lax/d1/i$a;

    .line 952
    .line 953
    invoke-virtual {v10}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-direct {v1, v13, v2, v9, v12}, Lax/d1/i$a;-><init>(Landroid/net/Uri;Lax/P0/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    move-object/from16 v2, v34

    .line 961
    .line 962
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    goto :goto_37d

    .line 966
    :pswitch_3c5
    move-object/from16 v2, v34

    .line 967
    .line 968
    invoke-static {v6, v9}, Lax/d1/k;->f(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    if-eqz v1, :cond_3e2

    .line 973
    .line 974
    move-object/from16 v34, v2

    .line 975
    .line 976
    iget-object v2, v1, Lax/d1/i$b;->b:Lax/P0/v;

    .line 977
    .line 978
    iget-object v2, v2, Lax/P0/v;->k:Ljava/lang/String;

    .line 979
    .line 980
    move-object/from16 v21, v1

    .line 981
    .line 982
    const/4 v1, 0x1

    .line 983
    invoke-static {v2, v1}, Lax/S0/d0;->S(Ljava/lang/String;I)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    invoke-virtual {v10, v2}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 988
    .line 989
    .line 990
    invoke-static {v2}, Lax/P0/D;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    goto :goto_3e7

    .line 995
    :cond_3e2
    move-object/from16 v21, v1

    .line 996
    .line 997
    move-object/from16 v34, v2

    .line 998
    .line 999
    const/4 v1, 0x0

    .line 1000
    :goto_3e7
    sget-object v2, Lax/d1/k;->i:Ljava/util/regex/Pattern;

    .line 1001
    .line 1002
    invoke-static {v7, v2, v11}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    if-eqz v2, :cond_413

    .line 1007
    .line 1008
    invoke-static {v2, v0}, Lax/S0/d0;->y1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v7

    .line 1012
    aget-object v7, v7, v19

    .line 1013
    .line 1014
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1015
    .line 1016
    .line 1017
    move-result v7

    .line 1018
    invoke-virtual {v10, v7}, Lax/P0/v$b;->T(I)Lax/P0/v$b;

    .line 1019
    .line 1020
    .line 1021
    const-string v7, "audio/eac3"

    .line 1022
    .line 1023
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v7

    .line 1027
    if-eqz v7, :cond_413

    .line 1028
    .line 1029
    const-string v7, "/JOC"

    .line 1030
    .line 1031
    invoke-virtual {v2, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    if-eqz v2, :cond_413

    .line 1036
    .line 1037
    const-string v1, "ec+3"

    .line 1038
    .line 1039
    invoke-virtual {v10, v1}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 1040
    .line 1041
    .line 1042
    const-string v1, "audio/eac3-joc"

    .line 1043
    .line 1044
    :cond_413
    invoke-virtual {v10, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 1045
    .line 1046
    .line 1047
    if-eqz v13, :cond_42d

    .line 1048
    .line 1049
    invoke-virtual {v10, v14}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 1050
    .line 1051
    .line 1052
    new-instance v1, Lax/d1/i$a;

    .line 1053
    .line 1054
    invoke-virtual {v10}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v2

    .line 1058
    invoke-direct {v1, v13, v2, v9, v12}, Lax/d1/i$a;-><init>(Landroid/net/Uri;Lax/P0/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    move-object/from16 v2, v33

    .line 1062
    .line 1063
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    :cond_429
    move-object/from16 v9, v32

    .line 1067
    .line 1068
    goto/16 :goto_381

    .line 1069
    .line 1070
    :cond_42d
    move-object/from16 v2, v33

    .line 1071
    .line 1072
    if-eqz v21, :cond_429

    .line 1073
    .line 1074
    invoke-virtual {v10}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    move-object/from16 v12, p0

    .line 1079
    .line 1080
    move-object v8, v1

    .line 1081
    :goto_438
    move-object/from16 v9, v32

    .line 1082
    .line 1083
    const/4 v7, 0x3

    .line 1084
    :goto_43b
    const/16 v20, 0x1

    .line 1085
    .line 1086
    goto/16 :goto_4c5

    .line 1087
    .line 1088
    :pswitch_43f
    move-object/from16 v2, v33

    .line 1089
    .line 1090
    sget-object v1, Lax/d1/k;->V:Ljava/util/regex/Pattern;

    .line 1091
    .line 1092
    invoke-static {v7, v1, v11}, Lax/d1/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    const-string v7, "CC"

    .line 1097
    .line 1098
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v7

    .line 1102
    if-eqz v7, :cond_45b

    .line 1103
    .line 1104
    const/4 v7, 0x2

    .line 1105
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1110
    .line 1111
    .line 1112
    move-result v1

    .line 1113
    const-string v9, "application/cea-608"

    .line 1114
    .line 1115
    goto :goto_467

    .line 1116
    :cond_45b
    const/4 v7, 0x2

    .line 1117
    const/4 v9, 0x7

    .line 1118
    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1123
    .line 1124
    .line 1125
    move-result v1

    .line 1126
    const-string v9, "application/cea-708"

    .line 1127
    .line 1128
    :goto_467
    if-nez p0, :cond_46f

    .line 1129
    .line 1130
    new-instance v12, Ljava/util/ArrayList;

    .line 1131
    .line 1132
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_471

    .line 1136
    :cond_46f
    move-object/from16 v12, p0

    .line 1137
    .line 1138
    :goto_471
    invoke-virtual {v10, v9}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v9

    .line 1142
    invoke-virtual {v9, v1}, Lax/P0/v$b;->Q(I)Lax/P0/v$b;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v10}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    goto :goto_438

    .line 1153
    :pswitch_480
    move-object/from16 v2, v33

    .line 1154
    .line 1155
    const/4 v7, 0x2

    .line 1156
    invoke-static {v6, v9}, Lax/d1/k;->g(Ljava/util/ArrayList;Ljava/lang/String;)Lax/d1/i$b;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v1

    .line 1160
    if-eqz v1, :cond_49a

    .line 1161
    .line 1162
    iget-object v1, v1, Lax/d1/i$b;->b:Lax/P0/v;

    .line 1163
    .line 1164
    iget-object v1, v1, Lax/P0/v;->k:Ljava/lang/String;

    .line 1165
    .line 1166
    const/4 v7, 0x3

    .line 1167
    invoke-static {v1, v7}, Lax/S0/d0;->S(Ljava/lang/String;I)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-virtual {v10, v1}, Lax/P0/v$b;->U(Ljava/lang/String;)Lax/P0/v$b;

    .line 1172
    .line 1173
    .line 1174
    invoke-static {v1}, Lax/P0/D;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    goto :goto_49c

    .line 1179
    :cond_49a
    const/4 v7, 0x3

    .line 1180
    const/4 v1, 0x0

    .line 1181
    :goto_49c
    if-nez v1, :cond_4a0

    .line 1182
    .line 1183
    const-string v1, "text/vtt"

    .line 1184
    .line 1185
    :cond_4a0
    invoke-virtual {v10, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v1

    .line 1189
    invoke-virtual {v1, v14}, Lax/P0/v$b;->r0(Lax/P0/C;)Lax/P0/v$b;

    .line 1190
    .line 1191
    .line 1192
    if-eqz v13, :cond_4b8

    .line 1193
    .line 1194
    new-instance v1, Lax/d1/i$a;

    .line 1195
    .line 1196
    invoke-virtual {v10}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v10

    .line 1200
    invoke-direct {v1, v13, v10, v9, v12}, Lax/d1/i$a;-><init>(Landroid/net/Uri;Lax/P0/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    move-object/from16 v9, v32

    .line 1204
    .line 1205
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    goto :goto_4c1

    .line 1209
    :cond_4b8
    move-object/from16 v9, v32

    .line 1210
    .line 1211
    const-string v1, "HlsPlaylistParser"

    .line 1212
    .line 1213
    const-string v10, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 1214
    .line 1215
    invoke-static {v1, v10}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    :goto_4c1
    move-object/from16 v12, p0

    .line 1219
    .line 1220
    goto/16 :goto_43b

    .line 1221
    .line 1222
    :goto_4c5
    add-int/lit8 v4, v4, 0x1

    .line 1223
    .line 1224
    move-object/from16 v1, p1

    .line 1225
    .line 1226
    move-object/from16 v33, v2

    .line 1227
    .line 1228
    move-object/from16 v35, v5

    .line 1229
    .line 1230
    move-object/from16 v32, v9

    .line 1231
    .line 1232
    move-object v2, v12

    .line 1233
    const/4 v10, 0x0

    .line 1234
    goto/16 :goto_2c1

    .line 1235
    .line 1236
    :cond_4d3
    move-object/from16 p0, v2

    .line 1237
    .line 1238
    move-object/from16 v9, v32

    .line 1239
    .line 1240
    move-object/from16 v2, v33

    .line 1241
    .line 1242
    if-eqz v16, :cond_4de

    .line 1243
    .line 1244
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1245
    .line 1246
    goto :goto_4e0

    .line 1247
    :cond_4de
    move-object/from16 v0, p0

    .line 1248
    .line 1249
    :goto_4e0
    new-instance v1, Lax/d1/i;

    .line 1250
    .line 1251
    move-object v5, v2

    .line 1252
    move-object v6, v9

    .line 1253
    move-object/from16 v7, v17

    .line 1254
    .line 1255
    move/from16 v10, v29

    .line 1256
    .line 1257
    move-object/from16 v12, v30

    .line 1258
    .line 1259
    move-object/from16 v2, v31

    .line 1260
    .line 1261
    move-object/from16 v4, v34

    .line 1262
    .line 1263
    move-object v9, v0

    .line 1264
    move-object v0, v1

    .line 1265
    move-object/from16 v1, p1

    .line 1266
    .line 1267
    invoke-direct/range {v0 .. v12}, Lax/d1/i;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lax/P0/v;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 1268
    .line 1269
    .line 1270
    return-object v0

    .line 1271
    :sswitch_data_4f6
    .sparse-switch
        -0x392db8c5 -> :sswitch_370
        -0x13dc6572 -> :sswitch_365
        0x3bba3b6 -> :sswitch_35a
        0x4de1c5b -> :sswitch_34f
    .end sparse-switch

    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    :pswitch_data_508
    .packed-switch 0x0
        :pswitch_480
        :pswitch_43f
        :pswitch_3c5
        :pswitch_384
    .end packed-switch
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method private static s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z
    .registers 3

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_16

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "YES"

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_16
    return p2
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

.method private static t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .registers 4

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1a

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_1a
    return-wide p2
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

.method private static u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    .registers 3

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1a

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1a
    return p2
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

.method private static v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J
    .registers 4

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1a

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_1a
    return-wide p2
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

.method private static w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_16

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object p2, p0

    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    :cond_16
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_24

    .line 28
    .line 29
    if-nez p2, :cond_1f

    .line 30
    .line 31
    goto :goto_24

    .line 32
    :cond_1f
    invoke-static {p2, p3}, Lax/d1/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_24
    :goto_24
    return-object p2
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

.method private static x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, p2}, Lax/d1/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
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

.method private static y(Ljava/lang/String;Ljava/util/Map;)I
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/d1/k;->U:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lax/d1/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    const-string p1, ","

    .line 16
    .line 17
    invoke-static {p0, p1}, Lax/S0/d0;->x1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "public.accessibility.describes-video"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1e

    .line 28
    .line 29
    const/16 v0, 0x200

    .line 30
    .line 31
    :cond_1e
    const-string p1, "public.accessibility.transcribes-spoken-dialog"

    .line 32
    .line 33
    invoke-static {p0, p1}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_28

    .line 38
    .line 39
    or-int/lit16 v0, v0, 0x1000

    .line 40
    .line 41
    :cond_28
    const-string p1, "public.accessibility.describes-music-and-sound"

    .line 42
    .line 43
    invoke-static {p0, p1}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_32

    .line 48
    .line 49
    or-int/lit16 v0, v0, 0x400

    .line 50
    .line 51
    :cond_32
    const-string p1, "public.easy-to-read"

    .line 52
    .line 53
    invoke-static {p0, p1}, Lax/S0/d0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3d

    .line 58
    .line 59
    or-int/lit16 p0, v0, 0x2000

    .line 60
    .line 61
    return p0

    .line 62
    :cond_3d
    return v0
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

.method private static z(Ljava/lang/String;)I
    .registers 4

    .line 1
    sget-object v0, Lax/d1/k;->X:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v2, Lax/d1/k;->Y:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_11

    .line 15
    .line 16
    or-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    :cond_11
    sget-object v2, Lax/d1/k;->W:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lax/d1/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1c

    .line 25
    .line 26
    or-int/lit8 p0, v0, 0x4

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1c
    return v0
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


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lax/d1/k;->j(Landroid/net/Uri;Ljava/io/InputStream;)Lax/d1/j;

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

.method public j(Landroid/net/Uri;Ljava/io/InputStream;)Lax/d1/j;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_f
    invoke-static {v0}, Lax/d1/k;->b(Ljava/io/BufferedReader;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_ac

    .line 22
    .line 23
    :goto_16
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_a2

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_27

    .line 38
    .line 39
    goto :goto_16

    .line 40
    :cond_27
    const-string v3, "#EXT-X-STREAM-INF"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_45

    .line 47
    .line 48
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    new-instance v1, Lax/d1/k$b;

    .line 52
    .line 53
    invoke-direct {v1, p2, v0}, Lax/d1/k$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v1, p1}, Lax/d1/k;->r(Lax/d1/k$b;Ljava/lang/String;)Lax/d1/i;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_3f
    .catchall {:try_start_f .. :try_end_3f} :catchall_43

    .line 64
    invoke-static {v0}, Lax/S0/d0;->n(Ljava/io/Closeable;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :catchall_43
    move-exception p1

    .line 69
    goto :goto_b3

    .line 70
    :cond_45
    :try_start_45
    const-string v3, "#EXT-X-TARGETDURATION"

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_8a

    .line 77
    .line 78
    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_8a

    .line 85
    .line 86
    const-string v3, "#EXTINF"

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_8a

    .line 93
    .line 94
    const-string v3, "#EXT-X-KEY"

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_8a

    .line 101
    .line 102
    const-string v3, "#EXT-X-BYTERANGE"

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_8a

    .line 109
    .line 110
    const-string v3, "#EXT-X-DISCONTINUITY"

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_8a

    .line 117
    .line 118
    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_8a

    .line 125
    .line 126
    const-string v3, "#EXT-X-ENDLIST"

    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_86

    .line 133
    .line 134
    goto :goto_8a

    .line 135
    :cond_86
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_16

    .line 139
    :cond_8a
    :goto_8a
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, Lax/d1/k;->a:Lax/d1/i;

    .line 143
    .line 144
    iget-object v2, p0, Lax/d1/k;->b:Lax/d1/f;

    .line 145
    .line 146
    new-instance v3, Lax/d1/k$b;

    .line 147
    .line 148
    invoke-direct {v3, p2, v0}, Lax/d1/k$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v1, v2, v3, p1}, Lax/d1/k;->q(Lax/d1/i;Lax/d1/f;Lax/d1/k$b;Ljava/lang/String;)Lax/d1/f;

    .line 156
    .line 157
    .line 158
    move-result-object p1
    :try_end_9e
    .catchall {:try_start_45 .. :try_end_9e} :catchall_43

    .line 159
    invoke-static {v0}, Lax/S0/d0;->n(Ljava/io/Closeable;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_a2
    invoke-static {v0}, Lax/S0/d0;->n(Ljava/io/Closeable;)V

    .line 164
    .line 165
    .line 166
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    .line 167
    .line 168
    invoke-static {p1, v2}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    throw p1

    .line 173
    :cond_ac
    :try_start_ac
    const-string p1, "Input does not start with the #EXTM3U header."

    .line 174
    .line 175
    invoke-static {p1, v2}, Lax/P0/E;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    throw p1
    :try_end_b3
    .catchall {:try_start_ac .. :try_end_b3} :catchall_43

    .line 180
    :goto_b3
    invoke-static {v0}, Lax/S0/d0;->n(Ljava/io/Closeable;)V

    .line 181
    .line 182
    .line 183
    throw p1
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
